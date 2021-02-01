package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {

}



//continuar na aula 5 
