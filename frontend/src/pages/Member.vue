<template>
  <div class="members">
    <table class="table table-borderd">
      <tbody>
        <tr>
          <td>No</td>
          <td>{{ member.memberId }}</td>
        </tr>
        <tr>
          <td>Name</td>
          <td>{{ member.memberName }}</td>
        </tr>
        <tr>
          <td>E-mail</td>
          <td>{{ member.memberEmail }}</td>
        </tr>
        <tr>
          <td>Memo</td>
          <td>{{ member.memo }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
  import axios from 'axios';

  export default {
    name: "Member",
    data() {
      return {
        member: {}
      }
    },
    created(){
        axios.get("/api/members/" + this.$route.params.id).then((res) => {
            this.member = res.data;
        })
    }
  }
</script>

<style scoped>
  .members {
    width: 800px;
    margin: 0 auto;
  }
</style>