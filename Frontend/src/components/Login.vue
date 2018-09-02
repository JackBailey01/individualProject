<template>
  <div class="centre">
  <form id="account-form" @submit="submitSearch">
    <div class="row">
      <div class="col-xs-6 col-sm-6 col-md-6">
        <div class="form-group">
          <input type="text" v-model="UserName" id="Username" class="form-control input-sm" placeholder="Username">
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-xs-6 col-sm-6 col-md-6">
        <div class="form-group">
          <input type="text"  v-model="Password" id="Password" class="form-control input-sm" placeholder="Password">
        </div>
      </div>
    </div>
    <div class="login">
      <input type="submit" value="login" class="btn btn-info btn-block">
    </div>
  </form>
  </div>
</template>

<script>
  import axios from 'axios'
  export default ({
    name: 'Login',
  data() {
      return {
        UserName: null,
        Password: null
      }
  },
  methods: {
    submitSearch: function () {
      const self = this
      console.log(
        this.UserName,
        this.Password)
      axios.post('http://localhost:8080/accounts/login', {
        UserName: '' + this.UserName,
        Password: '' + this.Password
      })
        .then(function (response){
          if (response.data.accNo===null) {
            alert("There is no account with that username and password")
          }
          else{
            self.$router.push('/dashboard')
          }
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
  .login{
    margin-left: 0px;
    width: 30%;
    padding: 0px;
  }
</style>
