import { createRouter, createWebHistory } from 'vue-router'
import Home from '@/pages/Home.vue'
import Members from '@/pages/Members.vue'
import Search from '@/pages/Search.vue'

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
    path: '/search',
    name: 'search',
    component: Search
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
