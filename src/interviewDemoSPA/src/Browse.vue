<template>

  <b-container class="big">
    <b-row align-v="center">
      <b-col>

        <b-table :items="userList" :fields="fields">
          <template slot="Loans" slot-scope="data">
            <b-button variant="secondary" v-b-modal.modal1 @click="viewBooksInModal(data.item)" > view </b-button>
          </template>
        </b-table>
      </b-col>
    </b-row>

    <b-modal id="modal1" :title="`Books on loan to ${activeRow.username} `">
      <b-table :items="books"></b-table>
    </b-modal>

  </b-container>

</template>

<script>
    import axios from 'axios'


    export default {
        name: "Browse",
        data(){
          return {
            userList:[],
            fields:[],
            activeRow:{},
            books:[],
          }
        },
        methods:{
          viewBooksInModal(tableRow){
          this.activeRow = tableRow;
          axios.get(`/api/loans/${this.activeRow.id}`).then(response => {
            this.books = response.data;
          })

          }
        }
        ,mounted() {
        axios.get("/api/users").then(response => {
          this.userList = response.data;
          this.fields = [...Object.keys(this.userList[0]),'Loans'];
        })
        },
    }
</script>

<style scoped>
  .big .row {
    height:80vh
  }

</style>
