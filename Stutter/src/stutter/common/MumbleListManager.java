package stutter.common;

import java.util.List;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

import stutter.Mumble;

public interface MumbleListManager {

    @Get
    List<Mumble> listAll();

    @Post
    void newMumble(String username, String message);

}
