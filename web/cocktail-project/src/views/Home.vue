<template>
 
    <div class="container">
      <img
        src="https://mindfuldesignconsulting.com/wp-content/uploads/2015/11/Apothecary-Bar-Entrance.jpg"
        href="#"
      />
      <entry />
    </div>

</template>

<script>
import cocktailService from "../services/cocktailService";
import Entry from "../components/Entry.vue";

export default {
  name: "Home",
  components: {
    Entry,
  },
  created() {
    //use to check postman
    cocktailService.get("11008").then((response) => {
      if (response.status === 200) {
        this.$router.push("/");
      }
    });
  },
};
</script>
<style scoped>
.container {

  position: relative;
}
.container img{
  width: 100%;
  height: auto;
}
.container .btn {
 position: absolute;
 top: 52%;
 left: 52%;
 transform: translate(-50%, -50%);
 -ms-transform: translate(-50%, -50%);
 background-color: darkred;
 color: white;
 font-size: 16px;
 padding: 12px 24px;
 border: none;
 cursor: pointer;
 border-radius: 5px;
}
</style>
