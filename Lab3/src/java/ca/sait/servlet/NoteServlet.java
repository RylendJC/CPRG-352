package ca.sait.servlet;

import ca.sait.models.Note;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rylen
 */
@WebServlet(name = "NoteServlet", urlPatterns = {"/note"})
public class NoteServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
       
        String title = br.readLine();
        String contents = br.readLine();
       

        Note note = new Note(title, contents);

        request.setAttribute("note", note);

        this.getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        //this.getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        //this.getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);

    }

}
