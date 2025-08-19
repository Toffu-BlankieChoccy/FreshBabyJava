package com.toffutran.room_wep_app.data.repository;

import com.toffutran.room_wep_app.data.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoomRepository extends JpaRepository<RoomEntity, UUID> {
}
