<template>
    <div>
      <h1>Login</h1>
      <form @submit.prevent="login">
        <div>
          <input type="text" id="username" v-model="username" required placeholder="아이디" autofocus>
        </div>
        <div>
          <input type="password" id="password" v-model="password" required placeholder="비밀번호" autofocus>
        </div>
        <button type="submit">Login</button>
      </form>
      <div>{{msg1}}</div>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        username: '',
        password: '',
        msg1: '',
      }
    },
    methods: {
      login() {
        // 로그인 처리 로직 구현
        //msg1 = "로그인성공"
        console.log('로그인 성공');
              // 로그인 API 호출
        // 아래 예시는 axios를 사용하여 백엔드 API에 POST 요청을 보내는 코드입니다.
        // 실제로는 백엔드 API의 URL과 요청 형식에 맞게 수정해야 합니다.
        axios.post('/api/login', {
          username: this.username,
          password: this.password
        })
        .then(response => {
          // 로그인 성공 시 처리
          console.log(response.data);
        })
        .catch(error => {
          // 로그인 실패 시 처리
          console.error(error);
        });
      },
    },
  }
  </script>
  