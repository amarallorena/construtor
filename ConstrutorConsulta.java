package aula_0210;

public class ConstrutorConsulta {

	Consulta consulta1 = new Consulta ("Maria", "Dra. Ana Lucia", 20/11);
	Consulta consulta2 = new Consulta ("Laura", "Dr. Rafael", 01/07);
	Consulta consulta3 = new Consulta ("Guilherme", "Dr. Murilo", 30/04);
	
	System.out.println(consulta1.getNomePcnt());
	System.out.println(consulta1.getNomeDents());
	System.out.println(consulta1.getData());
	System.out.println(consulta2.getNomePcnt());
	System.out.println(consulta2.getNomeDents());
	System.out.println(consulta2.getData());
	System.out.println(consulta3.getNomePcnt());
	System.out.println(consulta3.getNomeDents());
	System.out.println(consulta3.getData());
	
}
}