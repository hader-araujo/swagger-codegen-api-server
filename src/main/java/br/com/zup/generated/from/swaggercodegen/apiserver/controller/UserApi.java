/**
* NOTE: This class is auto generated by the swagger code generator program (3.0.20).
* https://github.com/swagger-api/swagger-codegen
* Do not edit the class manually.
*/
package br.com.zup.generated.from.swaggercodegen.apiserver.controller;

import br.com.zup.generated.from.swaggercodegen.apiserver.dto.UserDTO;
    import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
    import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

    import javax.servlet.http.HttpServletRequest;
    import javax.validation.Valid;
    import javax.validation.constraints.*;
    import java.io.IOException;
import java.util.List;
import java.util.Map;
    import java.util.Optional;
@Api(value = "user", description = "the user API")
    public interface UserApi {

                @ApiOperation(value = "Create user", nickname = "createUser", notes = "This can only be done by the logged in user.", tags={ "user", })
                @ApiResponses(value = { 
                    @ApiResponse(code = 200, message = "successful operation") })
                @RequestMapping(value = "/user",
                    consumes = { "application/json" },
                method = RequestMethod.POST)

            ResponseEntity<Void> createUser(@ApiParam(value = "Created user object" ,required=true )  @Valid @RequestBody UserDTO body
);



                @ApiOperation(value = "Creates list of users with given input array", nickname = "createUsersWithArrayInput", notes = "", tags={ "user", })
                @ApiResponses(value = { 
                    @ApiResponse(code = 200, message = "successful operation") })
                @RequestMapping(value = "/user/createWithArray",
                    consumes = { "application/json" },
                method = RequestMethod.POST)

            ResponseEntity<Void> createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody List<UserDTO> body
);



                @ApiOperation(value = "Creates list of users with given input array", nickname = "createUsersWithListInput", notes = "", tags={ "user", })
                @ApiResponses(value = { 
                    @ApiResponse(code = 200, message = "successful operation") })
                @RequestMapping(value = "/user/createWithList",
                    consumes = { "application/json" },
                method = RequestMethod.POST)

            ResponseEntity<Void> createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody List<UserDTO> body
);



                @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "This can only be done by the logged in user.", tags={ "user", })
                @ApiResponses(value = { 
                    @ApiResponse(code = 400, message = "Invalid username supplied"),
                    @ApiResponse(code = 404, message = "User not found") })
                @RequestMapping(value = "/user/{username}",
                method = RequestMethod.DELETE)

            ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("username") String username
);



                @ApiOperation(value = "Get user by user name", nickname = "getUserByName", notes = "", response = UserDTO.class, tags={ "user", })
                @ApiResponses(value = { 
                    @ApiResponse(code = 200, message = "successful operation", response = UserDTO.class),
                    @ApiResponse(code = 400, message = "Invalid username supplied"),
                    @ApiResponse(code = 404, message = "User not found") })
                @RequestMapping(value = "/user/{username}",
                    produces = { "application/json", "application/xml" }, 
                method = RequestMethod.GET)

            ResponseEntity<UserDTO> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathVariable("username") String username
);



                @ApiOperation(value = "Logs user into the system", nickname = "loginUser", notes = "", response = String.class, tags={ "user", })
                @ApiResponses(value = { 
                    @ApiResponse(code = 200, message = "successful operation", response = String.class),
                    @ApiResponse(code = 400, message = "Invalid username/password supplied") })
                @RequestMapping(value = "/user/login",
                    produces = { "application/json", "application/xml" }, 
                method = RequestMethod.GET)

            ResponseEntity<String> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username
,@NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password
);



                @ApiOperation(value = "Logs out current logged in user session", nickname = "logoutUser", notes = "", tags={ "user", })
                @ApiResponses(value = { 
                    @ApiResponse(code = 200, message = "successful operation") })
                @RequestMapping(value = "/user/logout",
                method = RequestMethod.GET)

            ResponseEntity<Void> logoutUser();



                @ApiOperation(value = "Updated user", nickname = "updateUser", notes = "This can only be done by the logged in user.", tags={ "user", })
                @ApiResponses(value = { 
                    @ApiResponse(code = 400, message = "Invalid user supplied"),
                    @ApiResponse(code = 404, message = "User not found") })
                @RequestMapping(value = "/user/{username}",
                    consumes = { "application/json" },
                method = RequestMethod.PUT)

            ResponseEntity<Void> updateUser(@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody UserDTO body
,@ApiParam(value = "name that need to be updated",required=true) @PathVariable("username") String username
);


        }
