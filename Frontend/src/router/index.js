import Vue from 'vue'
import Router from 'vue-router'
import Dashboard from '../components/Dashboard'
import Accounts from '../components/Accounts'
import addAccounts from '../components/AddAccount'
import editaccount from '../components/EditAccount'

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
    },
    {
      path: '/editAccounts/:item',
      name: 'editAccounts',
      component: editaccount,
    }
  ]
})
