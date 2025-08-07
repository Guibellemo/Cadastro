package MyGroup.Cadastro.Carro;

import MyGroup.Cadastro.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tb_carros")
@NoArgsConstructor //Lombok
@AllArgsConstructor //Lombok
@Data //Lombok
public class CarrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //estratégia para criar o ID
    private Long carro_id;
    private String modelo;
    private String marca;
    private String placa;


    @OneToMany(mappedBy = "carro")
    private PessoaModel pessoa;

    //private List<PessoaModel> pessoas

}


