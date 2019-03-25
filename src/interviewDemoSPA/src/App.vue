<!--

    __                        __
   / /     /\                 \ \
  / /     /  \   _ __  _ __    \ \
 < <     / /\ \ | '_ \| '_ \    > >
  \ \   / ____ \| |_) | |_) |  / /
   \_\ /_/    \_\ .__/| .__/  /_/
                | |   | |
                |_|   |_|


Application parent element.

Wrapper for the NavBar

re-routes:
<create>
<manage>
<troubleshooting>

-->

<template>
  <div id="app" class="mt-0">
    <b-navbar toggleable="md" type="light" class="mt-0"
    >

      <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

      <b-navbar-brand>LibLenda</b-navbar-brand>

      <b-collapse is-nav id="nav_collapse">

        <b-navbar-nav>
          <!--<b-nav-item ><router-link tag="span" to="/create">Create</router-link></b-nav-item>-->
          <!--<b-nav-item ><router-link tag="span" to="/manage">Manage</router-link></b-nav-item>-->
        </b-navbar-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-item href="https://librariesaustralia.nla.gov.au/search/commandSearch"><span>Demo application</span></b-nav-item>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>



  <transition name="fade">
    <router-view></router-view>
  </transition>
  </div>
</template>

<script>
  export default {
  name: 'app',
  data () {
    return {

    }
  },

}
</script>

<style>
#app {
  /*I really want to unset these once the layouts are in place.*/
  /*font-family: 'Avenir', Helvetica, Arial, sans-serif;*/
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /*text-align: center;*/
  /*color: #2c3e50;*/
  margin-top: 60px;
}

/*h1, h2 {*/
  /*font-weight: normal;*/
/*}*/

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #000000;
}

/* Transitions */
.fade-enter-active, .fade-leave-active {
  transition: opacity .5s;
}
.fade-enter, .fade-leave-to /* .fade-leave-active below version 2.1.8 */ {
  opacity: 0;
}

.fade-leave-to{
  height:0px;
}

  /*.navbar{*/
    /*background: #1e5799; !* Old browsers *!*/
    /*background: -moz-linear-gradient(left, #8cc08f 40%, #6365f1 70%); !* FF3.6-15 *!*/
    /*background: -webkit-linear-gradient(left, #8cc08f 40%,#6365f1 70%); !* Chrome10-25,Safari5.1-6 *!*/
    /*background: linear-gradient(to right, #8cc08f 40%,#6365f1 70%); !* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ *!*/
    /*filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='##8cc08f', endColorstr='#6365f1',GradientType=1 ); !* IE6-9 *!*/
  /*}*/

.modal-lg {
  max-width: 80vw;
}

/*.navbar {*/
  /*background: linear-gradient(to right, #8cc08f 40%,#6365f1 70%);*/
/*}*/

.navbar a.la-dlu-logo {
   cursor: pointer;
   height: 80px;
}

.navbar a.la-dlu-logo:focus, .navbar a.la-dlu-logo:active {
  //border: 1px dotted #fff;
  height: 80px;
}

</style>
