import Vue from 'vue'
import Router from 'vue-router'
import Dashboard from '../components/Dashboard'
import Accounts from '../components/Accounts'
import addAccounts from '../components/AddAccount'
import editaccount from '../components/EditAccount'
import login from '../components/Login'

Vue.use(Router)

export default new Router({
routes: [
    {
      path: '/dashboard',
      name: 'dashboard',
      component: Dashboard
    },
    {
      path: '/',
      name: 'login',
      component: login
    },
    {
      path: '/findAccounts',
      name: 'findAccounts',
      component: Accounts
    },
    {
      path: '/addAccounts',
      name: 'AddAccounts',
      component: addAccounts
    },
    {
      path: '/editAccounts',
      name: 'editAccounts',
      component: editaccount,
    }
  ]
})
