<template>
  <div>
    <div class="accountlist" >
      <b-table striped hover :items="accounts" :fields="fields">
        <template slot="actions"  slot-scope="data">
          <b-button type = "button" variant="primary">Edit</b-button>
          <b-button type = "button" @click.stop="deleteAccount(data.item)" variant="danger">Delete</b-button>
        </template>
      </b-table>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'account-list',
  mounted: function () {
    this.getAccounts()
  },
  data: function () {
    return {
      accounts: [],
      fields:{
        accNo: {
          label: 'AccNo',
          sortable: true
        },
        firstName: {
          label: 'First Name',
          sortable: true
        },
        lastName: {
          label: 'last Name',
          sortable: true
        },
        actions: {

        }

      }
    }
  },
  methods: {
    getAccounts: function () {
      var self = this
      const url = 'http://localhost:8080/accounts/viewAll'
      axios.get(url)
        .then(function (response) {
          console.log(JSON.stringify(response.data))
          self.accounts = response.data
        })
        .catch(function (error) {
          console.log(error)
        })
    },
    deleteAccount: function(item) {
      const content = JSON.stringify(item)
      console.log(content)
      axios.post('http://localhost:8080/accounts/delete',{
        headers: {
          'Access-Control-Allow-Origin': '*'
        },
        body:{content}
      })
        .then(function (response){
          alert(response.data);
        })
        .catch(function (error) {
          console.log(error);
        });
    }



  }
}
</script>

<style scoped>
</style>
