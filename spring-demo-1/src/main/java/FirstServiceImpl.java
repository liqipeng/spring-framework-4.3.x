import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {
    @Override
    public String getInfo() {
        return "Hello, world!";
    }
}
