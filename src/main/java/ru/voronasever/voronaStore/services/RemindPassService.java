package ru.voronasever.voronaStore.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.voronasever.voronaStore.model.RemindPass;
import ru.voronasever.voronaStore.repositories.jpa.RemindPassRepository;

import java.util.Optional;

@Service
public class RemindPassService {
    @Autowired
    RemindPassRepository remindPassRepository;

    public void save(RemindPass remindPass) {
        remindPassRepository.save(remindPass);
    }
    public boolean verifyLinkData(String hash, String eenc){
        Optional<RemindPass> forgotPassUser = findByHash(hash);
        return forgotPassUser.isPresent() && forgotPassUser.get().getEenc().equals(eenc);
    }

    public Optional<RemindPass> findByHash(String hash) {
        return remindPassRepository.findByHash(hash);
    }
}
