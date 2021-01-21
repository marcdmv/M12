package springBootInitialDemo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBootInitialDemo.dto.UserResponseDto;
import springBootInitialDemo.repository.UserRepository;
import springBootInitialDemo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){

        this.userRepository = userRepository;
    }

    public UserResponseDto setUser(String uuid, String name, String surname, String dateOfBirth, String gender){

        return userRepository.setUser(uuid,name,surname,dateOfBirth,gender);
    }

}
