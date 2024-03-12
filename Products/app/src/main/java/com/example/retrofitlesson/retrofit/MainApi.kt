package com.example.retrofitlesson.retrofit

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MainApi {

    @GET("products/{id}")
    suspend fun getProductById(@Path("id") id: Int): Product

    @GET("products?limit=20&skip=0")
    suspend fun getAllProducts(): Products

    @GET("products/search")
    suspend fun getProductsByName(
        @Query("q") name: String
    ): Products

}