<!--

    __                        __
   / /     /\                 \ \
  / /     /  \   _ __  _ __    \ \
 < <     / /\ \ | '_ \| '_ \    > >
  \ \   / ____ \| |_) | |_) |  / /
   \_\ /_/    \_\ .__/| .__/  /_/
                | |   | |
                |_|   |_|

-->

<template>
  <div id="app" class="mt-0">
    <b-navbar toggleable="md" type="light" class="mt-0"
    >

      <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

      <b-navbar-brand>LibLenda</b-navbar-brand>

      <b-collapse is-nav id="nav_collapse">

        <b-navbar-nav></b-navbar-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-item href=""><span>Demo application</span></b-nav-item>
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
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  margin-top: 60px;
}


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

.modal-lg {
  max-width: 80vw;
}
</style>
