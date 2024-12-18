package culturemedia.repository.impl;
import java.util.ArrayList;
import java.util.List;

import culturemedia.model.Reproduccion;
import culturemedia.repository.ReproduccionRepository;
import org.springframework.stereotype.Component;

@Component
public class ReproduccionRepositoryImpl implements ReproduccionRepository {

    private final List<Reproduccion> reproduccion;

    public ReproduccionRepositoryImpl() {
        reproduccion = new ArrayList<>();
    }


    @Override
    public Reproduccion save(Reproduccion reproduccion) {
        this.reproduccion.add(reproduccion);
        return reproduccion;
    }}