package py.com.domainsoft.envios.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import py.com.domainsoft.envios.dtos.GrupoConceptoDTO;

public interface GrupoConceptoService {
	
	public Page<GrupoConceptoDTO> findAllPageable(Pageable pageable);
	
	public void grabarGrupoConcepto(GrupoConceptoDTO grupoConcepto);
	

}
