package pe.edu.upc.easyvet.features.home.infrastructure

import pe.edu.upc.easyvet.features.home.domain.Product
import pe.edu.upc.easyvet.features.home.domain.ProductRepository
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor() : ProductRepository {
    override suspend fun getProducts(): Result<List<Product>> {
        TODO("Not yet implemented")
    }

}