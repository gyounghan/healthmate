<template>
  <h1>Find Your Health Mate</h1>
  <img alt="Vue logo" src="./assets/HealthLogo.png">

  <Login_form></Login_form>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'
import Login_form from './components/Login_form.vue'

export default {
  name: 'App',
  components: {
    Login_form
}
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
