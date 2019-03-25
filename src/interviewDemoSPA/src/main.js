import Vue from 'vue'
import VueRouter from 'vue-router'
import App from './App.vue'
import Browse from './Browse.vue'


import {library} from '@fortawesome/fontawesome-svg-core'
import { faLock } from '@fortawesome/free-solid-svg-icons'
import { faUnlock } from '@fortawesome/free-solid-svg-icons'
import { faPlusCircle } from '@fortawesome/free-solid-svg-icons'
import { faList} from '@fortawesome/free-solid-svg-icons'
import {faTimesCircle} from '@fortawesome/free-solid-svg-icons'
import {faCheckCircle} from '@fortawesome/free-solid-svg-icons'
import {faQuestionCircle} from '@fortawesome/free-solid-svg-icons'
import { faHandPointLeft } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'


//import MultiSelect from 'vue-multiselect'
import BootstrapVue from 'bootstrap-vue'


import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import 'vue2-animate/dist/vue2-animate.min.css'

library.add(faLock);
library.add(faUnlock);
library.add(faPlusCircle);
library.add(faList);
library.add(faTimesCircle);
library.add(faCheckCircle);
library.add(faQuestionCircle);
library.add(faHandPointLeft);


// plugins
Vue.use(VueRouter);
Vue.use(BootstrapVue);

// global component declarations
//Vue.component('multiselect',MultiSelect);
Vue.component('font-awesome-icon',FontAwesomeIcon);

const routes = [{
  path: '/',
    component: Browse
}
];

const router = new VueRouter({
  routes
  }
);



new Vue({
  el: '#app',
  render: h => h(App),
  router
})

