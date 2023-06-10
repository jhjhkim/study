<template>
  <header class="d-flex justify-content-center py-3">
      <ul class="nav nav-pills">
        <li class="nav-item"><router-link to="/">Home</router-link></li>
        <li class="nav-item"><router-link to="/Members">Members</router-link></li>
        <li class="nav-item"><router-link to="/Search">Search</router-link></li>
      </ul>
    </header>
</template>

<script>
export default {
  name: 'Header'
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
