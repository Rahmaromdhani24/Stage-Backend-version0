package com.rahma.AvEchelon.Services.Avancement;

import java.util.List;

import com.rahma.AvEchelon.Entity.Avancement;

public interface IServiceAvancement {
	
    public Avancement findAVPersonnelByMatricule(String matricule);
    public List<Avancement> findAllAvancements();
    public Avancement updateNote(Double note);
    
}
