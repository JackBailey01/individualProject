import Vue from 'vue'
import Router from 'vue-router'
import Dashboard from '../components/Dashboard'
import Accounts from '../components/Accounts'
import addAccounts from '../components/AddAccount'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Dashboard',
      component: Dashboard
    },
    {
      path: '/findAccounts',
      name: 'Accounts',
      component: Accounts
    },
    {
      path: '/addAccounts',
      name: 'AddAccounts',
      component: addAccounts
    }
  ]
})
