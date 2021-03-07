<template>
  <div class="home">
   <entry/>
  </div>
</template>

<script>
import cocktailService from '../services/cocktailService';
import Entry from '../components/Entry.vue';

export default {
  name: 'Home',
  components: {
    Entry, 
  },
  created() {//use to check postman
    cocktailService.get('11008').then((response)=>{
      if (response.status === 200){
        this.$router.push('/');
      }
    });
  }
}
</script>
