<template>
  
  <div id="background" :style="{'background-image':'url(https://images.unsplash.com/photo-1572116469696-31de0f17cc34?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1267&q=80)'}">> 
<div id="nav">
      <router-link to="/">Home</router-link> |
     
    </div>

</div>
</template>

<script>
export default {

}
</script>

<style>
#background{
  position: fixed;
    top: 0;
    bottom:0;
    left:0;
    
    width: 100%;
    height: 100%;
    background-repeat: no-repeat;
  background-size: auto;
  
}
</style>
