
@Entity
public class Tenant{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;

    //relationship

    public Tenant(){

    }

    public 
}