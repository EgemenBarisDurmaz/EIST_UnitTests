package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.*;

class OnlineCourseTest {

	// TODO 3: Test setOnlineCourseUrl()
    @Test
    void testSetOnlineCourseUrlWithValidUrl() throws MalformedURLException {
      //  OnlineCourse onlineCourse = new OnlineCourse("OnlineEIST");
        //String url = "www.example.com";
        //onlineCourse.setUrl(url);
        //assertEquals(url, onlineCourse.getUrl().toString());
            OnlineCourse onlineCourse = new OnlineCourse("OnlineEIST");
            String url = "http://www.onlineEIST.com";
            onlineCourse.setUrl(url);
            if(!url.equals(onlineCourse.getUrl().toString()))  {
                throw new MalformedURLException ("Failed");
            }
        }
    @Test
    void testSetOnlineCourseUrlWithInvalidUrl() throws MalformedURLException {
        OnlineCourse onlineCourse = new OnlineCourse("OnlineEIST");
        String url = "onlineEIST.com";
        onlineCourse.setUrl(url);
        if(url.equals(onlineCourse.getUrl().toString()))  {
            throw new MalformedURLException ("Failed");
        }
    }
}
