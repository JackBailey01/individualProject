<template>
  <div id="app">
    <b-navbar toggleable="md" type="dark" variant="info">
      <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>
      <b-navbar-brand>AccountApp</b-navbar-brand>
      <b-collapse is-nav id="nav_collapse">
        <b-navbar-nav>
          <b-nav-item><router-link style="color:white !important" to="/">Dashboard</router-link></b-nav-item>
          <b-nav-item-dropdown text="Accounts">
            <b-dropdown-item><router-link style="color:black !important" to="/findAccounts">Get Account</router-link></b-dropdown-item>
            <b-dropdown-item><router-link style="color:black !important" to="/AddAccounts">Add Account</router-link></b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
    <router-view/>
  </div>
</template>

<script>

export default {
  name: 'app'
}

</script>

<style>

</style>
