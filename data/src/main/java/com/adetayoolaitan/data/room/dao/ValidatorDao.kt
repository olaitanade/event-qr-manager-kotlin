package com.adetayoolaitan.data.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.adetayoolaitan.data.room.entity.Validator
import kotlinx.coroutines.flow.Flow

@Dao
interface ValidatorDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertValidator(validator: Validator)

    @Query("SELECT * FROM validators ORDER BY datetime_added DESC")
    fun getValidators(): Flow<List<Validator>>

    @Query("DELETE FROM validators WHERE event_id=:eventId")
    suspend fun deleteValidatorByEventId(eventId:Int)

    @Query("DELETE FROM validators")
    suspend fun deleteAllValidators()
}