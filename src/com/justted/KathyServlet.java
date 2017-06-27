package com.justted;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by Justted on 2017/3/13.
 */
@WebServlet(name = "KathyServlet")
public class KathyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = "PhraseOMatic has generated the following phrase.";
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<HTML><HEAD><TITLE>");
        out.println("PhraseOmatic");
        out.println("</TITLE></HEAD></BODY>");
        out.println("<H1>" + title + "</H1>");
        out.println("<P>"+PhraseOMatic.makePhrase());
        out.println("<P><a href=\"KathyServlet\">make another phrase</a></p>");
        out.println("</BODY></HTML>");
        out.close();
    }

}

class PhraseOMatic{
    public static String makePhrase() {
        String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win","front-end", "web-based","pervasive", "smart", "six-sigma","critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "valued-added", "oriented", "centric", "distributed", "clustered", "branded","outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tipping point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        return ("What we need is a " + phrase);
    }
}
