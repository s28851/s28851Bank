package bankapp.bank;


import bankapp.user.User;
import bankapp.user.UserInfo;
import bankapp.user.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BankService {
    private final UserRepository userRepository;
    public BankService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public UserInfo getUserInfo(Long clientId){
        Optional<User> user

    }
}
