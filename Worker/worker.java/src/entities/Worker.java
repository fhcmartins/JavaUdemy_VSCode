package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Associatons
    private Department department;
    private List<HourContract> contracts = new ArrayList<>(); //Lista pq sao varios contratos e a lista devera ser instanciada vazia.

    // Constructor
    public Worker(){

    }

public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public WorkerLevel getLevel(){
        return level;
    }

    public void setLevel(WorkerLevel level){
        this.level = level;
    }

    public Double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary){
        this.baseSalary = baseSalary;
    }

    public Department getDepartment(){
        return department;
    }

    public void setDepartment(Department department){
        this.department = department;
    }

    public List<HourContract> getContracts(){
        return contracts;
    }


    /* Não podemos deixar setContracts ativado, pois essa lista não pode ser trocada.
    *  A lista começa vazia, mas depois outros contratos serao inseridos ou removidos,
    *  mas somente pelos métodos abaixo. Todos os contratos associados ao trabalhador.
    */

    /*
    Aqui a lista antiga será trocada por uma nova. Por isso esse método não pode ser implementado.  
    public void setContracts(List<HourContract> contracts){
        this.contracts = contracts;
    }
    */

    // *************** Adding methods ********************

    public void addContracts(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        double sum = baseSalary;

        Calendar cal = Calendar.getInstance();
        
        for (HourContract c : contracts){
            cal.setTime(c.getDate()); // Setting date of c calendar
            
            // Extract Year and Month of c contract
            int c_year = cal.get(Calendar.YEAR);
            int c_mount = 1 + cal.get(Calendar.MONTH);
            
            if(year == c_year && month == c_mount){
                sum += c.totalValue();
            }
        }
        return sum;
    }
    

}