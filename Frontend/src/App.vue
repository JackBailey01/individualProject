<template>
  <div id="app">
    <div v-if="['login'].indexOf($route.name)">
    <b-navbar toggleable="md" type="dark" variant="info">
      <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>
      <b-navbar-brand>AccountApp</b-navbar-brand>
      <b-collapse is-nav id="nav_collapse">
        <b-navbar-nav>
          <b-nav-item><router-link style="color:white !important" to="/Dashboard">Dashboard</router-link></b-nav-item>
          <b-nav-item-dropdown text="Accounts">
            <b-dropdown-item><router-link style="color:black !important" to="/findAccounts">Get Account</router-link></b-dropdown-item>
            <b-dropdown-item><router-link style="color:black !important" to="/AddAccounts">Add Account</router-link></b-dropdown-item>
          </b-nav-item-dropdown>
          <b-nav-item><router-link class="left" style="color:white !important" to="/">LogOut</router-link></b-nav-item>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
    </div>
    <router-view/>
    </div>

</template>

<script>

export default {
  name: 'app',
}

</script>

<style>
.left {
  position: absolute;
  right: 20px;
}
</style>
