package MyGroup.Cadastro.Pessoas;

import MyGroup.Cadastro.Carro.CarrosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_pessoas")
@NoArgsConstructor //Lombok
@AllArgsConstructor //Lombok
@Data //Lombok
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    private String nome;
    private String email;
    private int idade;

    //Um carro para pessoa
    @ManyToOne
    @JoinColumn(name = "carro_id") //FK
    private CarrosModel carro;

}
