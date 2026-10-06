package pe.edu.upc.easyvet.features.home.domain

import javax.inject.Inject

interface ProductRepository {
    suspend fun getProducts(): Result<List<Product>>
}