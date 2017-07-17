package myprojects.sample.oauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import myprojects.sample.oauth.handler.UsersApi;
import myprojects.sample.oauth.model.User;

@RestController
public class UserController implements UsersApi{

	@Override
	public ResponseEntity<Object> usersGet() {
		return null;
	}

	@Override
	public ResponseEntity<User> usersPost(User body) {
		return null;
	}

	@Override
	public ResponseEntity<Void> usersUserIdDelete(String userId) {
		return null;
	}

	@Override
	public ResponseEntity<User> usersUserIdGet(String userId) {
		return null;
	}

	@Override
	public ResponseEntity<User> usersUserIdPut(String userId, User body) {
		return null;
	}

}
