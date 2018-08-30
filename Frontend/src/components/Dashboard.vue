<template>
  <div>
    <div class="accountlist" >
      <b-table striped hover :items="accounts"></b-table>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'account-list',
  mounted: function () {
    this.getAccounts()
    console.log('mounted: got here')
  },
  data: function () {
    return {
      accounts: []
    }
  },
  methods: {
    getAccounts: function () {
      var self = this
      console.log('here')
      const url = 'http://localhost:8080/accounts/viewAll'
      axios.get(url)
        .then(function (response) {
          console.log(JSON.stringify(response.data))
          self.accounts = response.data
        })
        .catch(function (error) {
          console.log(error)
        })
    }
  }
}
</script>

<style scoped>
</style>
