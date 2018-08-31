<template>
  <div>
    <div class="accountlist" >
      <b-table striped hover :items="accounts" :fields="fields" id="tableData" >
        <template slot="actions"  slot-scope="data">
          <b-button type = "button" @click.stop="editAccount(data.item)" variant="primary">Edit</b-button>
          <b-button type = "button" @click.stop="deleteAccount(data.item)" variant="danger">Delete</b-button>
        </template>
      </b-table>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
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
    deleteAccount(item) {
      const content = JSON.stringify(item)
      const id = item.accNo
      axios.post('http://localhost:8080/accounts/delete/'+ id,{
        content
      })
        .then(function (response){
          alert(response.data);
          location.reload();
        })
        .catch(function (error) {
          console.log(error);
        });
    },
    editAccount (item){
      this.$router.push({name:'editAccounts', params: {accountToEdit: item}})
    }

  }
}
</script>

<style scoped>
</style>
