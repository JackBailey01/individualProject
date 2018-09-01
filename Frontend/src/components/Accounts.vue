<template xmlns:visibility="http://www.w3.org/1999/xhtml">
  <div class="center">
    <form id="account-form" @submit="submitSearch">
      <div class="row">
        <div class="col-xs-6 col-sm-6 col-md-6">
          <div class="form-group">
            <input type="text" v-model="accNo" id="accNo" class="form-control input-sm" placeholder="AccNo" >
          </div>
        </div>
      </div>
      <div class="Search">
        <input type="submit" value="Search" class="btn btn-info btn-block">
      </div>
    </form>
        <div class="hide">
          <label v-if="show">First Name</label>
            <input type="text" v-model="firstName" ref="vis" id="first_name" class="form-control input-sm" placeholder="First Name" v-if="show">
        </div>
        <div class="hide">
          <label v-if="show">Last Name</label>
          <input type="text"  v-model="lastName" ref="vis" id="last_name" class="form-control input-sm" placeholder="Last Name" v-if="show">
      </div>
  </div>
</template>

<script>
  import axios from 'axios'
  export default ({
  name: 'findAccount',
  data () {
    return {
      accNo: null,
      firstName: null,
      lastName: null,
      show: false
    }
  },
  methods: {
    submitSearch: function () {
      const self = this
      axios.get('http://localhost:8080/accounts/view/'+ this.accNo)
        .then(function (response){
          if (response.data==="") {
            alert("There is no account with that Account Number")
          }
          else{
            self.firstName = response.data.firstName
            self.lastName = response.data.lastName
            self.show=true
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
  .center {
    margin: auto;
    width: 60%;
    padding: 10px;
  }
  .Search {
    margin-left: 0;
    width: 30%;
    padding: 0;
  }
  .hide {
    padding: 10px;

  }
</style>
