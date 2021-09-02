package com.princeakash.learntesting.repository

import androidx.lifecycle.LiveData
import com.princeakash.learntesting.model.ImageResponse
import com.princeakash.learntesting.roomdb.Art
import com.princeakash.learntesting.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt(): LiveData<List<Art>>

    suspend fun searchImage(imageString: String) : Resource<ImageResponse>
}