<template>
  <div class="members">
    <table class="table table-bordered">
      <thead>
        <tr>
          <th v-for="header in headers" :key="header.text">
            {{ header.value }}
          </th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="member in members" :key="member.memberId" v-on:click="goDetail(member.memberId)">
          <td>{{ member.memberId }}</td>
          <td>{{ member.memberName }}</td>
          <td>{{ member.memberEmail }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import router from '@/router';
import { assertExpressionStatement } from '@babel/types';
import axios from 'axios';

  export default {
    name: 'Members',
    data() {
      return {
        headers: [
          {
            text: "memberId",
            value: "No"
          },
          {
            text: "memberName",
            value: "Name"
          },
          {
            text: "memberEmail",
            value: "Email"
          }
        ],
        members: []
      }
    },
    created(){
        axios.get("/api/members").then((res) => {
            //console.log(res);
            this.members = res.data;
        })
    },
    methods: {
      goDetail(id) {
        router.push( { path: "/Members/" + id } );
      }
    }
  };
</script>
<style scoped>
  .members {
    width: 800px;
    margin: 0 auto;
  }
</style>