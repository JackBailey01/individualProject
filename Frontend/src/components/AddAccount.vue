<!--suppress ALL -->
<template>
  <div class="centre">
    <form id="account-form" @submit="submitAccount">
      <div class="row">
        <div class="col-xs-6 col-sm-6 col-md-6">
          <div class="form-group">
            <input type="text" v-model="firstName" id="first_name" class="form-control input-sm" placeholder="First Name">
          </div>
        </div>
        <div class="col-xs-6 col-sm-6 col-md-6">
          <div class="form-group">
            <input type="text"  v-model="lastName" id="last_name" class="form-control input-sm" placeholder="Last Name">
          </div>
        </div>
      </div>
      <div class="add">
      <input type="submit" value="Add" class="btn btn-info btn-block">
      </div>
    </form>
  </div>
</template>

<script>
  import axios from 'axios'
  export default ({
    data() {
      return {
        firstName: null,
        lastName: null
      }
    },
methods: {
  submitAccount: function () {
    axios.post('http://localhost:8080/accounts/create', {
      firstName: '' + this.firstName,
      lastName: '' + this.lastName
    })
      .then(function (response){
        alert(response.data);
      })
      .catch(function (error) {
        console.log(error);
      });
  }
  }
  })
</script>

<style scoped>
  .centre {
    margin: auto;
    width: 60%;
    padding: 10px;
  }
  .add {
    margin-left: 0px;
    width: 30%;
    padding: 0px;
  }
</style>
