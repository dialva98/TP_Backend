package culturemedia.repository.impl;
import java.util.ArrayList;
import java.util.List;

import culturemedia.model.Reproduccion;
import culturemedia.repository.ReproduccionRepository;

public class ReproduccionRepositoryImpl implements ReproduccionRepository {

	private final List<Reproduccion> reproduccion;

	public ReproduccionRepositoryImpl() {
		this.reproduccion = new ArrayList<>();
	}

	@Override
	public Reproduccion save(Reproduccion reproduccion) {
		this.reproduccion.add( reproduccion );
		return reproduccion;
	}
}
