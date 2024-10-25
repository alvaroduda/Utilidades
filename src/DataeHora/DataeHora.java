package DataeHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Duration;

public class DataeHora{

  /*o nome das váriaveis é auto-explicativo.
   * ao ler a saída ao executar o código e ler as linhas, se entende o que está acontecendo.
   */

public static void main(String[] args) {

    //mostra a data local (data da maquina)
    LocalDate horario_local_data = LocalDate.now();
    System.out.println(horario_local_data);

    //mostra a data, horas, minutos e segundos local (data e hora da maquina)
    LocalDateTime horaio_local_data_e_hora = LocalDateTime.now();
    System.out.println(horaio_local_data_e_hora);

    //mostra a data, horas, minutos e segundos global, que é o GMT (Horario de Londres)
    Instant horario_local_global_GMT = Instant.now();
    System.out.println(horario_local_global_GMT);

    //como sobrepor a data local
    LocalDate definir_data_no_formato_ISO8601 =  LocalDate.parse("2025-01-15");
    System.out.println(definir_data_no_formato_ISO8601);

    //como sobrepor a data, horas, minutos e segundos local
    LocalDateTime definir_data_e_hora_no_formato_ISO8601 = LocalDateTime.parse("2026-05-20T15:30:23");
    System.out.println(definir_data_e_hora_no_formato_ISO8601);

    //como definir a data, horas, minutos e segundos no formato GMT (Hora global)
    Instant definir_data_e_hora_no_formato_ISO8601_global_GMT = Instant.parse("2026-05-20T18:30:23Z"); //o Z no final é de Zulu Time (GMT)
    System.out.println(definir_data_e_hora_no_formato_ISO8601_global_GMT);

    //como definir e alterar a data, horas, minutos e segundos no formato GMT
    Instant definir_data_e_hora_no_formato_ISO8601_global_GMT_comparado_com_o_fuso_horario_que_eu_quero = Instant.parse("2026-05-20T18:30:23-03:00");
    System.out.println(definir_data_e_hora_no_formato_ISO8601_global_GMT_comparado_com_o_fuso_horario_que_eu_quero);
    
    //como definir e alterar a data, horas, minutos e segundos no formato GMT
    Instant definir_data_e_hora_no_formato_ISO8601_global_GMT_adaptado_ao__fuso_horario_que_eu_quero = Instant.parse("2026-05-20T18:30:23+03:00");
    System.out.println(definir_data_e_hora_no_formato_ISO8601_global_GMT_adaptado_ao__fuso_horario_que_eu_quero);

    //como definir a estrutura em que as data são escritas
    DateTimeFormatter definir_formato_da_data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate definir_data_com_formato_BR = LocalDate.parse("15/12/2002", definir_formato_da_data);
    System.out.println(definir_data_com_formato_BR);

    //como definir a estrutura em que as data, horas e minutos são escritas
    DateTimeFormatter definir_formato_da_data_e_hora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    LocalDateTime definir_data_e_hora_com_formato_BR = LocalDateTime.parse("15/12/2002 20:22", definir_formato_da_data_e_hora);
    System.out.println(definir_data_e_hora_com_formato_BR);
    
    //como definir data de maneira formatada, sem precisar por 0 na frente deu numeró de um digito por exemplo.
    LocalDate definir_data_formatada = LocalDate.of(2028, 3, 18);
    System.out.println(definir_data_formatada);

    //como definir data, horas, minutos e segundos de maneira formatada, sem precisar por 0 na frente deu numeró de um digito por exemplo.
    LocalDateTime definir__data_e_hora_formatada = LocalDateTime.of(2029,6 , 22, 8, 4, 9);
    System.out.println(definir__data_e_hora_formatada);

    //como definir o formato da data, horas, minutos e segundos e o exibir
    LocalDate datalocal = LocalDate.parse("2002-12-15");
    DateTimeFormatter definir_o_formato_de_saida = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    System.out.println("A data é: " + datalocal.format(definir_o_formato_de_saida));
    System.out.println("A data é: " + definir_o_formato_de_saida.format(datalocal));
    System.out.println("A data é: " + datalocal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
 
    //método "static" que mostra lista de formatos de data, horas, minutos e segundos pré definidos (lista de países)
    DataeHora2.listarZonas1();
    
    //definindo o um formato de data, horas, minutos e segundos de acordo com a lista de zonas
    Instant dataa = Instant.parse("2002-12-15T11:20:22Z");
    LocalDateTime hora_no_brasil = LocalDateTime.ofInstant(dataa, ZoneId.of("Japan"));
    System.out.println(hora_no_brasil);
    
    
    LocalDate data_local = LocalDate.parse("2025-08-25");
    
    //alguns métodos de receber valores de data, horas, minutos e segundos
    System.out.println(data_local.getYear());
    System.out.println(data_local.getDayOfMonth());
    System.out.println(data_local.getMonthValue());
    System.out.println(data_local.getDayOfYear());

    //alguns métodos para diminuir e acrescentar algo em alguma data, horas, minutos e segundos.
    System.out.println(data_local.minusDays(10));
    System.out.println(data_local.plusDays(30));
    System.out.println(data_local.plusYears(4));
    System.out.println(data_local.minusWeeks(2));

    //alguns métodos para diminuir e acrescentar dias nas datas que são globais (Instant)
    Instant data_instant = Instant.parse("2027-09-20T01:30:30Z");
    
    Instant mudar_data_em_instant_reduzir = data_instant.minus(7,ChronoUnit.DAYS);
    System.out.println(mudar_data_em_instant_reduzir);
    
    Instant mudar_data_em_instant_adicionar = data_instant.plus(8, ChronoUnit.DAYS);
    System.out.println(mudar_data_em_instant_adicionar);
    

    //contar tempo (marcar de um tempo para o outro)
    LocalDateTime hora_atual = LocalDateTime.now();
    LocalDate ponto_inicial = LocalDate.parse("2022-07-01");
    Duration duracao_de_tempo = Duration.between(ponto_inicial.atStartOfDay(), hora_atual);

    System.out.println(duracao_de_tempo.toDays()); 
    System.out.println(duracao_de_tempo.toMinutes()); 
    

  }
}
