<template>
  <div class="home">
   
  </div>
</template>

<script>
import cocktailService from '../services/cocktailService';

export default {
  name: 'Home',
  components: {
    
  },
  created() {
    cocktailService.get('11008').then((response)=>{
      if (response.status === 200){
        this.$router.push('/about');
      }
    });
  }
}
</script>
