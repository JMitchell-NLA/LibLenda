<template>
<p>
{{userList}}
</p>
</template>

<script>
    import axios from 'axios'


    export default {
        name: "Browse.vue",
        data(){
          return {
            userList:[]
          }
        }
        ,mounted() {
        axios.get("/api/users").then(response => {
          this.userList = response.data;
        })
        },
    }
</script>

<style scoped>

</style>
