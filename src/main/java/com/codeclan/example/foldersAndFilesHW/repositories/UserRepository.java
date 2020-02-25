package com.codeclan.example.foldersAndFilesHW.repositories;

import com.codeclan.example.foldersAndFilesHW.models.User;
import com.codeclan.example.foldersAndFilesHW.projections.EmbedFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFolders.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
