<template>
  <div class="center">
    <form id="account-form" @submit="submitAccount">
      <div class="row">
        <div class="col-xs-6 col-sm-6 col-md-6">
          <div class="form-group">
            <input type="text" v-model="accNo" id="first_name" class="form-control input-sm" placeholder="AccNo">
          </div>
        </div>
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
  export default {
    name: 'editAccount',
    data() {
        const accountToEdit = this.$route.params;
        const accNo = accountToEdit.accNo;
        const firstName = accountToEdit.firstName;
        const lastName = accountToEdit.lastName;


      return
      }
    }
</script>

<style scoped>
</style>
