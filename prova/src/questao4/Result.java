package questao4;

public class Result implements Animal, Tools {
private String speciesName;
private int amount;


public Result(String speciesName, int amount) {
	super();
	this.speciesName = speciesName;
	this.amount = amount;
}


public String getSpeciesName() {
	return speciesName;
}


public int getAmount() {
	return amount;
}


@Override
public Animal[] filterSpecies(Animal[] list, String speciesFilter) {
	
	int verificador = list.length;
	for(int i = 0; i < list.length; i++) {
	if(!list[i].getSpeciesName().equals(speciesFilter)){	
		list[i] = null;
	verificador--;
		}
	if(verificador ==0) {
		Animal[] lista = new Animal[0];
		return lista;
		}
	}
	
	return list;
	
}


@Override
public String[] speciesClassification(Animal[] list) {
	String[] animais = new String[10];
	int verificador = 0;
	for(int i = 0; i < list.length; i++) {
	if(list[i].getSpeciesName().equals(list[i+1].getSpeciesName())) {	
		if(animais[0] == null) {
			animais[i] = list[i].getSpeciesName();
			
		}
		else if(animais[verificador].equals(list[i]))
			continue;
	}
	else {
		verificador++;
		animais[verificador] = list[i].getSpeciesName();
	}
	
	}
	return animais;
}


@Override
public String getAnimalName() {
	// TODO Auto-generated method stub
	return null;
}

	
	
}
