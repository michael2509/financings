package fr.formation.financings.services;

import fr.formation.financings.entities.Financing;

public interface FinancingService {

    void create(Financing financing);

    Financing getById(Long id);

    void deleteById(Long id);
}
