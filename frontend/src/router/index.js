import { createRouter, createWebHistory } from 'vue-router'
import Home from '@/pages/Home.vue'
import Members from '@/pages/Members.vue'
import Member from '@/pages/Member.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path: '/members',
    name: 'members',
    component: Members
  },
  {
    path: '/members/:id',
    name: 'member',
    component: Member
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
