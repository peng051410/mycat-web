package io.mycat.myweb.housesys.dao;

// import java.util.Optional;
//import org.springframework.data.jdbc.repository.query.Query;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.PagingAndSortingRepository;
import io.mycat.myweb.housesys.domain.MkDynamicTable;
public interface MkDynamicTableDao extends PagingAndSortingRepository<MkDynamicTable,Long> {

}
