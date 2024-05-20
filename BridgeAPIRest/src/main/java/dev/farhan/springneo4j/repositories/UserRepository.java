package dev.farhan.springneo4j.repositories;

import dev.farhan.springneo4j.models.Comentario;
import dev.farhan.springneo4j.models.Estudiante;
import dev.farhan.springneo4j.queryresults.CourseEnrolmentQueryResult;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends Neo4jRepository<Estudiante, Long> {
    Optional<Estudiante> findEstudianteByEmail(String email);

    @Query("MATCH (e:Estudiante), (c:Curso) WHERE e.email = $email AND curso.identificador = $identificador " +
            "RETURN EXISTS((e)-[:ESTUDIA_EN]->(curso))")
    Boolean findEnrolmentStatus(String email, String identificador);

    @Query("MATCH (estudiante:Estudiante), (curso:Curso) WHERE estudiante.email = $email AND curso.identificador = $identificador " +
    "CREATE (estudiante)-[:ESTUDIA_EN]->(curso) RETURN estudiante, curso")
    CourseEnrolmentQueryResult createEnrolmentRelationship(String email, String identificador);

    @Query("MATCH (estudiante:Estudiante)-[:ESTUDIA_EN]->(curso:Curso {identificador: $identificador}) RETURN estudiante")
    List<Estudiante> findAllEstudiantesDeCurso(String identificador);
}
