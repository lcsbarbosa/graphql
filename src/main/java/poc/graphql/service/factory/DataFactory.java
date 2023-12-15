package poc.graphql.service.factory;

import poc.entitie.Moeda;
import poc.graphql.service.factory.enums.MoedasEnum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DataFactory {

    public static List<Moeda> moedaRepository = new LinkedList<>();
    EnumSet<MoedasEnum> moedasEnums = EnumSet.allOf(MoedasEnum.class);

    public Boolean moedaFactory(Integer quantidade){

        moedaRepository.add(new Moeda(1,"REAL",1.0,"2023/05/01 19:20:30"));
        moedaRepository.add(new Moeda(2,"DOLLAR",1.0,"2023/05/01 19:20:30"));
        moedaRepository.add(new Moeda(3,"EURO",1.0,"2023/05/01 19:20:30"));
        moedaRepository.add(new Moeda(4,"LIBRA",1.0,"2023/05/01 19:20:30"));
        moedaRepository.add(new Moeda(5,"CAD",1.0,"2023/05/01 19:20:30"));

        try{
            moedasEnums.forEach(x -> {
                for(int i=1; i<=quantidade && i<=500; i++){

                    String moeda = x.name();
                    Double ultimoValor = null;

                    double valor = generateValorMoeda(ultimoValor = moedaRepository.stream()
                            .filter(m -> m.getNome().contains(moeda))
                            .collect(Collectors.toCollection(LinkedList::new))
                            .getLast().getValor());

                    String data = generateDate(moedaRepository.stream()
                            .filter(m -> m.getNome().contains(moeda))
                            .collect(Collectors.toCollection(LinkedList::new))
                            .getLast().getDatacompra());

                    moedaRepository.add( new Moeda(i, moeda, valor, data));
                }
            });
        }catch (Exception e){
            System.out.println(e);
            return false;
        }

        Moeda moeda1;
        for (int i = 0; i < moedaRepository.size(); i++) {
            moeda1 = moedaRepository.get(i);
            System.out.println( moeda1.getId() + " " + moeda1.getNome() + " " + moeda1.getValor() + " " + moeda1.getDatacompra());
        }

        return true;
    }

    public static Double generateValorMoeda(Double valorAtual){
        double max = valorAtual + 0.20;
        double min = valorAtual - 0.10;
        double novoValor = (Math.random() * (max - min)) + min;

        return Math.round(novoValor * 100.0) / 100.0;
    }

    public static String generateDate(String date) {

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime dataFormat = LocalDateTime.parse(date, formatter);

            // Increment the date by one day
            LocalDateTime newDate = dataFormat.plusDays(1);

            // Format the new date as a string
            return newDate.format(formatter);
        }catch (DateTimeParseException e){
            System.out.println("generateDate - DateTimeParseException: " + e);
            return null;
        }
    }

    public Boolean resetarDados(){
        int tamanho = 10;
        if (moedaRepository.size() != 0) {
            tamanho = (moedaRepository.size() / moedasEnums.size()) - 1;
            moedaRepository.clear();
        }
        return moedaFactory(tamanho);
    }

//    public static void main( String args[] ) {
//        moedaFactory(100);
//        Moeda moeda;
//        for (int i = 0; i < moedaRepository.size(); i++) {
//            moeda = moedaRepository.get(i);
//            System.out.println( moeda.getId() + " " + moeda.getNome() + " " + moeda.getValor() + " " + moeda.getDatacompra());
//        }
//
//    }
}



