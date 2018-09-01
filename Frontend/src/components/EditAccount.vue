<template>
  <div class="center">
    <form id="account-form" @submit="submitUpdate">
      <div class="row">
        <div class="col-xs-6 col-sm-6 col-md-6">
          <div class="form-group">
            <label>AccNo</label>
            <input type="text" v-model="accNo" id="accNo" class="form-control input-sm" placeholder="AccNo" readonly>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-xs-6 col-sm-6 col-md-6">
          <div class="form-group">
            <label>First Name</label>
            <input type="text" v-model="firstName" id="first_name" class="form-control input-sm" placeholder="First Name">
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-xs-6 col-sm-6 col-md-6">
          <div class="form-group">
            <label>Last Name</label>
            <input type="text"  v-model="lastName" id="last_name" class="form-control input-sm" placeholder="Last Name">
          </div>
        </div>
      </div>
      <div class="update">
        <input type="submit" value="Update" class="btn btn-info btn-block">
      </div>
    </form>
  </div>
</template>

<script>
  import axios from 'axios'
  export default ({
    name: 'editAccount',
    data() {
        const accountToEdit = this.$route.params.accountToEdit;
        const accNo = accountToEdit.accNo;
        const firstName = accountToEdit.firstName;
        const lastName = accountToEdit.lastName;


      return{
        accNo,
        firstName,
        lastName
      }
      },
    methods: {
      submitUpdate: function () {
        const self = this
      axios.put('http://localhost:8080/accounts/update', {
        accNo: '' + this.accNo,
        firstName: '' + this.firstName,
        lastName: '' + this.lastName
      })
        .then(function (response){
          alert(response.data);
          self.$router.push('/')
        })
        .catch(function (error) {
          console.log(error);
        });
    }
  }
  })
</script>


<style scoped>
  .center {
    margin: auto;
    width: 60%;
    padding: 10px;
  }
  .update {
    margin-left: 0px;
    width: 30%;
    padding: 0px;
  }
</style>
