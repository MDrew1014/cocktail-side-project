<template>
    <button class="btn entry" v-on:click="enter">Enter</button>
</template>

<script>
export default {
    methods: {
          enter() {
      if (
        confirm( //pops up a message with OK and CANCEL button
          "Are you sure 21 years of age or older?"
        )
      ) { //if OK, delete card
              this.$router.push('/cocktail');
          }
          else{this.$router.push('/');}
      } //if select CANCEL, exit method without doing anything, stay on page
    }
    };
</script>

<style scoped>

</style>