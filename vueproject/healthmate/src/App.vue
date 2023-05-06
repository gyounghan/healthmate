<template>
  <h1>Find Your Health Mate</h1>
  <img alt="Vue logo" src="./assets/HealthLogo.png">
      <div id="login">
        <input type="text" placeholder="아이디" autofocus>
      </div>
      <div>
        <input type="text" placeholder="비밀번호" autofocus>
      </div>
      <div>
        <button>로그인</button>
      </div>
</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    // HelloWorld
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
