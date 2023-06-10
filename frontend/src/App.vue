<template>
  <Header/>
  <router-view/>
</template>

<script>
  import Header from './components/Header.vue';
  export default {
    name: 'App',
    components: {
      Header
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

header ul li {
  padding: 30px;
}

li a {
  font-weight: bold;
  color: #2c3e50;
}

li a.router-link-exact-active {
  color: #42b983;
}

</style>
