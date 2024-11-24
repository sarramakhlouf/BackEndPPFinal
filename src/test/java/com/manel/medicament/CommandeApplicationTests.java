package com.manel.medicament;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.manel.medicament.entities.Commande;
import com.manel.medicament.repos.CommandeRepository;


@SpringBootTest
class CommandeApplicationTests {

    @Autowired
    private CommandeRepository commandeRepository;
    
    // Test pour créer une commande
    @Test
    public void testCreateCommande() {
        Commande commande0 = new Commande("Client 1", "Doliprane", 100.0, new Date(),2);
        commandeRepository.save(commande0);
        Commande commande1 = new Commande("Client 2", "Doliprane", 100.0, new Date(),4);
        commandeRepository.save(commande1);
        Commande commande2 = new Commande("Client 3", "Doliprane", 100.0, new Date(),10);
        commandeRepository.save(commande2);
    }
    
    // Test pour trouver une commande par son ID
    @Test
    public void testFindCommande() {
        Commande commande = commandeRepository.findById(2L).get();     
        System.out.println(commande); 
    }
    
    // Test pour mettre à jour une commande
    @Test 
    public void testUpdateCommande() {
        Commande commande = commandeRepository.findById(2L).get();     
        commande.setNomClient("Client2");
        commande.setQuantite(4);
        commande.setMontantTotal(600);
        commandeRepository.save(commande); 
    }
    
    // Test pour supprimer une commande
    @Test 
    public void testDeleteCommande() { 
        commandeRepository.deleteById(3L);
    }
    
    // Test pour lister toutes les commandes
    @Test 
    public void testListerToutesCommandes() { 
        List<Commande> commandes = commandeRepository.findAll();   
        for (Commande c : commandes) { 
            System.out.println(c); 
        }   
    } 
    
    // Test pour trouver les commandes par produit
    @Test 
    public void testFindByNomClient() { 
        List<Commande> commandes = commandeRepository.findByNomClient("Client 1");     
        for (Commande c : commandes) { 
            System.out.println(c); 
        } 
    }
    
    // Test pour trouver les commandes par produit (recherche partielle)
    @Test
    public void testFindByNomClientContains() { 
        List<Commande> commandes = commandeRepository.findByNomClientContains("C");     
        for (Commande c : commandes) { 
            System.out.println(c); 
        } 
    }
    
    // Test pour trier les commandes par produit (ordre ascendant)
    @Test
    public void testFindByOrderByDateAsc() {
        List<Commande> commandes = commandeRepository.findByOrderByDateCommandeAsc();
        for (Commande c : commandes) {
            System.out.println(c);
        }
    }
    
    @Test
    public void testTrierCommandesDate() {
        List<Commande> commandes = commandeRepository.trierCommandesParDateDesc();
        for (Commande c : commandes) {
            System.out.println(c);
        }
    }

    @Test
    void contextLoads() {
    }
}