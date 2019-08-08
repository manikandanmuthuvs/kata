// package com.manikandanmuthuvs.javaspringxp.unittest;

// import static org.junit.Assert.assertEquals;

// import com.manikandanmuthuvs.javaspringxp.JavaSpringXpApplication;
// import com.manikandanmuthuvs.javaspringxp.service.UserService;

// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.context.ContextConfiguration;
// import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// @RunWith(SpringJUnit4ClassRunner.class)
// @SpringBootTest(classes = JavaSpringXpApplication.class)
// @ContextConfiguration(classes = JavaSpringXpApplication.class)
// public class UserServiceTest {

//     @Autowired
//     private UserService userService;

//     @Test
//     public void userFirstNameWhenUsernameCodeIsDivisibleByThree() {
//         Integer usernameCode = 3;
//         assertEquals("Fizz", userService.UserName(usernameCode));
//     }

//     public void userLastNameWhenUsernameCodeIsDivisibleByFive() {
//         Integer usernameCode = 5;
//         assertEquals("Buzz", userService.UserName(usernameCode));
//     }

//     public void userFullNameWhenUsernameCodeDivisibleByThreeAndFive() {
//         Integer usernameCode = 15;
//         assertEquals("Fizz Buzz", userService.UserName(usernameCode));
//     }
// }
