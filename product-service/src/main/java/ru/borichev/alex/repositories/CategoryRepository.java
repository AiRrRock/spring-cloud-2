package ru.borichev.alex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.borichev.alex.model.Category;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByTitle(String title);

    @Query("select c from Category c join fetch c.products where c.id = :id")
    Optional<Category> findByIdWithProducts(Long id);
}
