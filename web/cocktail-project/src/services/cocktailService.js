import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:8090/cocktail"
});

export default {

  get(id) {
    return http.get(`/${id}`);
  },

  getByName(name){
    return http.get(`/byName/${name}`);
  },

  
  getByIngredient(ingredient){
    return http.get(`/byIngredient/${ingredient}`);
  },
  

}