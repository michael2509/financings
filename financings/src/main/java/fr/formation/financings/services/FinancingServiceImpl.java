package fr.formation.financings.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.formation.financings.entities.Financing;
import fr.formation.financings.repositories.FinancingRepository;

@Service
public class FinancingServiceImpl implements FinancingService {

    private final FinancingRepository repo;

    protected FinancingServiceImpl(FinancingRepository repo) {
	this.repo = repo;
    }

    @Override
    public void create(Financing financing) {
	repo.save(financing);
    }

    @Override
    public Financing getById(Long id) {
	Optional<Financing> financing = repo.findById(id);
	return financing.get();
    }

    @Override
    public void deleteById(Long id) {
	repo.deleteById(id);
    }
}
