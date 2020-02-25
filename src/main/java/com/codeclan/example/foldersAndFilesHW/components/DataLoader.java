package com.codeclan.example.foldersAndFilesHW.components;

import com.codeclan.example.foldersAndFilesHW.models.File;
import com.codeclan.example.foldersAndFilesHW.models.Folder;
import com.codeclan.example.foldersAndFilesHW.models.User;
import com.codeclan.example.foldersAndFilesHW.repositories.FileRepository;
import com.codeclan.example.foldersAndFilesHW.repositories.FolderRepository;
import com.codeclan.example.foldersAndFilesHW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args) {

        User dave = new User("dave");
        userRepository.save(dave);

        User bob = new User("bob");
        userRepository.save(bob);

        Folder documents = new Folder("Documents", dave);
        folderRepository.save(documents);

        Folder photos = new Folder("photos", dave);
        folderRepository.save(photos);

        Folder music = new Folder("music", dave);
        folderRepository.save(music);

        Folder documentos = new Folder("Documentos", bob);
        folderRepository.save(documentos);

        Folder pics = new Folder("Pics", bob);
        folderRepository.save(pics);

        File homework = new File("homework",".txt", 35, documents);
        fileRepository.save(homework);

        File lab_notes = new File("lab_notes", ".txt", 28, documents);
        fileRepository.save(lab_notes);

        File johnny = new File("Johnny_Cash", ".mp4", 39, music);
        fileRepository.save(johnny);

        File dog = new File("dog",".jpg", 109, photos);
        fileRepository.save(dog);

        File cat = new File("cat",".jpg", 139, pics);
        fileRepository.save(cat);

        File shoppingList = new File("shopping_list", ".txt", 12, documentos);
        fileRepository.save(shoppingList);


    }


}
