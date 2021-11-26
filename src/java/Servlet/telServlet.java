/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.SmartphoneDAOimpl;
import entity.Smartphone;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mathis
 */
public class telServlet extends HttpServlet {

    private Smartphone monSmartphone;
    private SmartphoneDAOimpl smartDAO;

    public telServlet() {
        
        smartDAO = new SmartphoneDAOimpl();
     

    }
    
    public String getEtoiles(Double note)
    {
        String image="";
        if (note < 1.5)
        {
            image="0,5etoiles.png";
        }
        if (note >= 1.5 && note<2.5)
        {
            image="1etoiles.png";
        }
        if (note >= 2.5 && note<3.5)
        {
            image="1,5etoiles.png";
        }
        if (note >= 3.5 && note<4.5)
        {
            image="2etoiles.png";
        }
        if (note >= 4.5 && note<5.5)
        {
            image="2,5etoiles.png";
        }
        if (note >= 5.5 && note<6.5)
        {
            image="3etoiles.png";
        }
        if (note >= 6.5 && note<7.5)
        {
            image="3,5etoiles.png";
        }
        if (note >= 7.5 && note<8.5)
        {
            image="4etoiles.png";
        }
        if (note >= 8.5 && note<9.5)
        {
            image="4,5etoiles.png";
        }
        if (note >= 9.5)
        {
            image="5etoiles.png";
        }
        return image;
    }
    
    public String getAvis(double nombre)
    {
        String retour="0,5";
        if (nombre < 1.5)
        {
            retour="0,5";
        }
        if (nombre >= 1.5 && nombre<2.5)
        {
            retour="1";
        }
        if (nombre >= 2.5 && nombre<3.5)
        {
            retour="1,5";
        }
        if (nombre >=3.5 && nombre<4.5)
        {
            retour="2";
        }
        if (nombre >= 4.5 && nombre<5.5)
        {
            retour="2,5";
        }
        if (nombre >= 5.5 && nombre<6.5)
        {
            retour="3";
        }
        if (nombre >= 6.5 && nombre<7.5)
        {
            retour="3,5";
        }
        if (nombre >= 7.5 && nombre<8.5)
        {
            retour="4";
        }
        if (nombre >= 8.5 && nombre<9.5)
        {
            retour="4,5";
        }
        if (nombre >= 9.5)
        {
            retour="5";
        }
        return retour;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String telName = request.getParameter("nomTel");
            double criterescore = Double.parseDouble(request.getParameter("criterescore"));
            monSmartphone = smartDAO.selectSmartphoneByName(telName);
           monSmartphone.setCritereSelectScore(criterescore);
            int circularScore = (int)monSmartphone.getCircularscore();
            out.println("<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "<head>\n"
                    + "    <Title>Circular Phone</Title> \n"
                    + "    <meta charset=\"utf-8\" />\n"
                    + "  <link rel=\"stylesheet\" href=\"page_Tel.css\">\n"
                    + "  <link rel=\"icon\" href=\"images/LogoHead.png\" />\n"
                    + "  <script src=\"actions.js\"></script>\n"
                    + "</head>\n"
                    + "\n"
                    + "<body>\n"
                    + "    <div id=\"container\">\n"
                    + "        <div id=\"frontTitle\">\n"
                    + "            <div id=\"Title\">\n"
                    + "                <a href=\"index.html\"><img id=\"logo1\" src=\"images/logo.png\"></a>\n"
                    + "            </div>\n"
                    + "            <div id=\"TitleGuide\">\n"
                    + "                <form name=\"Goguide\" method=\"post\" action=\"guideServlet\">\n"
                    + "                        <table>\n"
                    + "                            <input type=\"submit\" id=\"BouttonGuide\" value=\"Guide\">\n"
                    + "                        </table>\n" 
                    + "                    </form>"
                    + "            </div>\n"
                    + "            <div id=\"TitleProjet\">\n"
                    + "                <b><a href=\"Projet.html\">Projet</a></b>\n"
                    + "            </div>\n"
                    + "        </div>\n"
                    + "        <br>\n"
                    + "        <div id=\"infoTel\">\n"
                    + "            <div id=\"photoPrinc\">\n"
                    + "                <img id=\"photoTel\" src=\"images/Phone/" + monSmartphone.getImgName1()+ ".png\">\n"
                    + "            </div>\n"
                //    + "            <div id=\"flecheGauche\" onclick=\"flecheGauche()\"><</div>\n"
                //   + "            <div id=\"flecheDroite\" onclick=\"flecheDroite()\">></div>\n"
                    + "            <div id=\"infos\">\n"
                    + "                <div id=\"nomDuTel\">"+ monSmartphone.getNom()+"</div>\n"
                    + "                <div id=\"marqueDuTel\">"+ monSmartphone.getFonctionnalite().getMarque()+"</div>\n");
             //      out.println("                <div id=\"etoiles\"><img src=\"images/" + getAvis(2*monSmartphone.getAvisclient()) + "etoiles_jaune.png\" id=\"starTaille\"></div>\n");
                  if (circularScore<=45)
                  {
                      out.println("<div id=\"circularScore\"><img id=\"imageCircular\" src=\"images/circular_score_rouge.png\"></div>\n");
                  }
                  if (circularScore>45 && circularScore<55)
                  {
                      out.println("<div id=\"circularScore\"><img id=\"imageCircular\" src=\"images/circular_score_jaune.png\"></div>\n");
                  }
                  if (circularScore>=55)
                  {
                      out.println("<div id=\"circularScore\"><img id=\"imageCircular\" src=\"images/circular_score_vert.png\"></div>\n");
                  }
                  
                    out.println("                <div id=\"circularScoreNumber\">"+ circularScore +"</div>\n"
                    + "                <div id=\"description1\">"+ monSmartphone.getCouleur()+"</div>\n"
                    + "                <div id=\"description2\">"+ monSmartphone.getMemoire()+"</div>\n"
                    + "                <div id=\"description3\">"+ monSmartphone.getFonctionnalite().getOs()+"</div>\n"
                    + "                <div id=\"leTrouver\">Où le trouver ?</div>\n");
            out.println("                <table id=\"tableauVendeur\" style=\"width:100%;\">\n");
            if (monSmartphone.getPrixvolpy() !=0)
            {
                out.println("                    <tr id=\"ligne1\">\n"
                    + "                        <td><img id=\"imageVendeur\" src=\"images/volpy_logo.png\"></td>\n"
                    + "                        <td>Reconditionné</td>\n"
                    + "                        <td><img id=\"imageDispo\" src=\"images/dispo.png\"></td>\n"
                    + "                        <td>" + monSmartphone.getPrixvolpy() + "€</td>\n"
                    + "                        <td><a href=\"" + monSmartphone.getLienvolpy() + "\" target=\"_blank\"><button id=\"Voir\">Voir L'offre</button></a></td>\n"
                    + "                    </tr>\n");
            }
            else
            {
                out.println("                    <tr id=\"ligne1\">\n"
                    + "                        <td><img id=\"imageVendeur\" src=\"images/volpy_logo.png\"></td>\n"
                    + "                        <td>Reconditionné</td>\n"
                    + "                        <td><img id=\"imageDispo\" src=\"images/pasdispo.png\"></td>\n"
                    + "                        <td>-</td>\n"
                    + "                        <td><a href=\"#\"><button id=\"PasVoir\">Pas D'offre</button></a></td>\n"
                    + "                    </tr>\n");
            }
            if (monSmartphone.getPrixwefix() !=0)
            {
                out.println("                    <tr id=\"ligne2\">\n"
                    + "                        <td><img id=\"imageVendeur\" src=\"images/Wefix_logo.png\"></td>\n"
                    + "                        <td>Reconditionné</td>\n"
                    + "                        <td><img id=\"imageDispo\" src=\"images/dispo.png\"></td>\n"
                    + "                        <td>" + monSmartphone.getPrixwefix() + "€</td>\n"
                    + "                        <td><a href=\"" + monSmartphone.getLienwefix() + "\" target=\"_blank\"><button id=\"Voir\">Voir L'offre</button></a></td>\n"
                    + "                    </tr>\n");
            }
            else
            {
                out.println("                    <tr id=\"ligne2\">\n"
                    + "                        <td><img id=\"imageVendeur\" src=\"images/Wefix_logo.png\"></td>\n"
                    + "                        <td>Reconditionné</td>\n"
                    + "                        <td><img id=\"imageDispo\" src=\"images/pasdispo.png\"></td>\n"
                    + "                        <td>-</td>\n"
                    + "                        <td><a href=\"#\"><button id=\"PasVoir\">Pas d'offre</button></a></td>\n"
                    + "                    </tr>\n");
            }
            if (monSmartphone.getPrixback() !=0)
            {
                out.println("                    <tr id=\"ligne1\">\n"
                    + "                        <td><img id=\"imageVendeur\" src=\"images/blackmarket_logo.png\"></td>\n"
                    + "                        <td>Reconditionné</td>\n"
                    + "                        <td><img id=\"imageDispo\" src=\"images/dispo.png\"></td>\n"
                    + "                        <td>" + monSmartphone.getPrixback() + "€</td>\n"
                    + "                        <td><a href=\"" + monSmartphone.getLienback() + "\" target=\"_blank\"><button id=\"Voir\">Voir L'offre</button></a></td>\n"
                    + "                    </tr>\n");
            }
            else
            {
                out.println("                    <tr id=\"ligne1\">\n"
                    + "                        <td><img id=\"imageVendeur\" src=\"images/blackmarket_logo.png\"></td>\n"
                    + "                        <td>Reconditionné</td>\n"
                    + "                        <td><img id=\"imageDispo\" src=\"images/pasdispo.png\"></td>\n"
                    + "                        <td>-</td>\n"
                    + "                        <td><a href=\"#\"><button id=\"PasVoir\">Pas d'offre</button></a></td>\n"
                    + "                    </tr>\n");
            }
            if (monSmartphone.getPrixfnac() !=0)
            {
                out.println("                    <tr id=\"ligne2\">\n"
                    + "                        <td><img id=\"imageVendeur\" src=\"images/fnac_logo.png\"></td>\n"
                    + "                        <td>Neuf</td>\n"
                    + "                        <td><img id=\"imageDispo\" src=\"images/dispo.png\"></td>\n"
                    + "                        <td>" + monSmartphone.getPrixfnac() + "€</td>\n"
                    + "                        <td><a href=\"" + monSmartphone.getLienfnac() + "\"target=\"_blank\"><button id=\"Voir\">Voir L'offre</button></a></td>\n"
                    + "                    </tr>\n");
            }
            else
            {
                out.println("                    <tr id=\"ligne2\">\n"
                    + "                        <td><img id=\"imageVendeur\" src=\"images/fnac_logo.png\"></td>\n"
                    + "                        <td>Neuf</td>\n"
                    + "                        <td><img id=\"imageDispo\" src=\"images/pasdispo.png\"></td>\n"
                    + "                        <td>-</td>\n"
                    + "                        <td><a href=\"#\"><button id=\"PasVoir\">Pas d'offre</button></a></td>\n"
                    + "                    </tr>\n");
            }
            if (monSmartphone.getPrixamazon() !=0)
            {
                out.println("                    <tr id=\"ligne1\">\n"
                    + "                        <td><img id=\"imageVendeur\" src=\"images/amazon_logo.png\"></td>\n"
                    + "                        <td>Neuf</td>\n"
                    + "                        <td><img id=\"imageDispo\" src=\"images/dispo.png\"></td>\n"
                    + "                        <td>" + monSmartphone.getPrixamazon() + "€</td>\n"
                    + "                        <td><a href=\"" + monSmartphone.getLienamazon() + "\" target=\"_blank\"><button id=\"Voir\">Voir L'offre</button></a></td>\n"
                    + "                    </tr>\n");
            }
            else
            {
                out.println("                    <tr id=\"ligne1\">\n"
                    + "                        <td><img id=\"imageVendeur\" src=\"images/amazon_logo.png\"></td>\n"
                    + "                        <td>Neuf</td>\n"
                    + "                        <td><img id=\"imageDispo\" src=\"images/pasdispo.png\"></td>\n"
                    + "                        <td>-</td>\n"
                    + "                        <td><a href=\"#\"><button id=\"PasVoir\">Pas d'offre</button></a></td>\n"
                    + "                    </tr>\n");
            }
            out.println("</table>\n");
//                    out.println("                <table id=\"tableauVendeur\" style=\"width:100%;\">\n"
//                    + "                    <tr id=\"ligne1\">\n"
//                    + "                        <td><img id=\"imageVendeur\" src=\"images/LogoFnac.png\"></td>\n"
//                   // + "                        <td>Neuf</td>\n"
//                   // + "                        <td><img id=\"imageVendeur\" src=\"images/pastilleGood.png\"></td>\n"
//                    + "                        <td>" + monSmartphone.getPrixfnac() + "€</td>\n"
//                    + "                        <td><a href=\"" + monSmartphone.getLienfnac() + "\"><button id=\"Voir\">Voir L'offre</button></a></td>\n"
//                    + "                    </tr>\n"
//                    + "                    <tr id=\"ligne2\">\n"
//                    + "                        <td><img id=\"imageVendeur\" src=\"images/logoWiFix.png\"></td>\n"
//                    //+ "                        <td>Reconditionné</td>\n"
//                    //+ "                        <td><img id=\"imageVendeur\" src=\"images/pastilleBad.png\"></td>\n"
//                    + "                        <td>" + monSmartphone.getPrixwefix() + "</td>\n"
//                    + "                        <td><a href=\"" + monSmartphone.getLienwefix() + "\"><button id=\"Voir\">Voir L'offre</button></a></td>\n"
//                    + "                    </tr>\n"
//                    + "                </table>\n");
                    
                    
                    
                    out.println("                <div id=\"bonus\">\n"
                    + "                    <img id=\"image\" src=\"images/BonusCircularScore.png\">\n"
                    + "                </div>\n"
                    + "                \n"
                    + "            </div>\n"
                    + "            <div id=\"miniTel1\" onclick=\"changementTel('"+monSmartphone.getImgName1()+"')\"><img id=\"image\" src=\"images/Phone/" + monSmartphone.getImgName1() + ".png\"></div>\n");
                    if (!monSmartphone.getImgName2().equals("0"))
                    {
                        out.println("            <div id=\"miniTel2\" onclick=\"changementTel('"+monSmartphone.getImgName2()+"')\"><img id=\"image\" src=\"images/Phone/"+monSmartphone.getImgName2()+".png\"></div>\n");
                    }
                    if (!monSmartphone.getImgName3().equals("0"))
                    {
                        out.println("            <div id=\"miniTel3\" onclick=\"changementTel('"+monSmartphone.getImgName3()+"')\"><img id=\"image\" src=\"images/Phone/"+monSmartphone.getImgName3()+".png\"></div>\n");
                    }
                    if (!monSmartphone.getImgName4().equals("0"))
                    {
                        out.println("            <div id=\"miniTel4\" onclick=\"changementTel('"+monSmartphone.getImgName4()+"')\"><img id=\"image\" src=\"images/Phone/"+monSmartphone.getImgName4()+".png\"></div>\n");
                    }
                    out.println("            <a href=\"#resume\"><div id=\"ancreResume\">Résumé</div></a>\n"
                    + "            <a href=\"#carac\"><div id=\"ancreCaracteristique\">Caractéristiques</div></a>\n"
                    + "            <a href=\"#avis\"><div id=\"ancreAvisClient\">Avis Client</div></a>\n"
                    + "        </div>\n"
                    + "\n"
                    + "        <div id=\"suite\">\n"
                    + "            <div id=\"inside\">\n"
                    + "                <div id=\"resume\">\n"
                    + "                    <div id=\"sousTitre\">Résumé</div>\n"
                    + "                    <table id=\"PremierResume\">\n"
                    + "                        <tr>\n"
                    + "                            <td>Circular Score</td>\n"
                    + "                            <td>Indice de réparabilité</td>\n"
                    + "                            <td>Note selon mes critères</td>\n"
                    + "                        </tr>\n"
                    + "                    </table>\n"
                    + "                            <div id=\"circularEtScore\">");
                    if (circularScore<=45)
                    {
                        out.println("<div id=\"circular\"><img id=\"imageTableau1\" src=\"images/circular_score_rouge.png\"></div>");

                    }
                    if (circularScore>45 && circularScore<55)
                  {
                        out.println("<div id=\"circular\"><img id=\"imageTableau1\" src=\"images/circular_score_jaune.png\"></div>");
                  }
                  if (circularScore>=55)
                  {
                        out.println("<div id=\"circular\"><img id=\"imageTableau1\" src=\"images/circular_score_vert.png\"></div>");
                  }
                    out.println("                                 <div id=\"score\">"+circularScore+"</div></div>\n"
                    + "                            <div id=\"IndiceEtRepa\">"
                    + "                                 <div id=\"indice\"><img id=\"imageTableau2\" src=\"images/IndiceDeReparabilite.jpg\"></div>"
                    + "                                 <div id=\"nbrepa\">"+monSmartphone.getIndicedeRepa()+"</div></div>\n"
                    + "                            <div id=\"noteCritere\">"+monSmartphone.getCritereSelectScore()/2+" / 5</div>\n"
                    + "                    <div id=\"trait\"></div>\n"
                    + "                    <div id=\"sousNote\">Sous-note</div>\n"
                    + "                    <div id=\"perf\">Performances</div>\n"
                    + "                    <div id=\"repa\">Réparabilité</div>\n"
                    + "                    <div id=\"env\">Développement durable</div>\n"
                    + "                    <table id=\"performanceTable\">\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Puissance</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListPerformance().get(0).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Photo & Vidéo</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListPerformance().get(1).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Ecran</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListPerformance().get(2).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Autonomie</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListPerformance().get(3).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                    </table>\n"
                    + "                    <table id=\"reparabiliteTable\">\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Documentation</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListReparabilite().get(0).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Démontabilité</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListReparabilite().get(1).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Dispo pièces détachées</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListReparabilite().get(2).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Prix pièces détachées</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListReparabilite().get(3).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                    </table>\n"
                    + "                    <table id=\"environnementTable\">\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Environnement</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListDevdurable().get(0).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Condition de travail</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListDevdurable().get(1).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Impact des technologies</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListDevdurable().get(2).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                        <tr>\n"
                    + "                            <td id=\"partie1Table\">Traitement des données personnelles</td>\n"
                    + "                            <td id=\"star\"><img src=\"images/noir/" + getEtoiles(monSmartphone.getListDevdurable().get(3).getNote()) + "\" id=\"starTaille\"></td>\n"
                    + "                        </tr>\n"
                    + "                    </table>\n"
                    + "                    <div id=\"separation1\"></div>\n"
                    + "                    <div id=\"separation2\"></div>\n"
                    + "                </div>\n"
                    + "\n"
                    + "                <div id=\"carac\">\n"
                    + "                    <div id=\"sousTitre\">Caractéristiques</div>\n"
                    + "                    <table id=\"tableauCarac\">\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Dimensions</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getDimensions()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Poids</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getPoids()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Diagonale d'écran</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getDiagonaleecran()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Définition d'écran</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getDefinitionecran()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Part de l'écran en surface</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getPartecran()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Mémoire vive (RAM)</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getMemoirevive()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Carte mémoire</td>\n");
                    if (monSmartphone.getFonctionnalite().isMicroSD())
                    {
                        out.println("<td id=\"colonne2\">Oui</td>\n");
                    }
                    else
                    {
                        out.println("<td id=\"colonne2\">Non</td>\n");
                    }
                    
                    out.println("                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Systeme d'exploitation (OS)</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getOs()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">4G</td>\n");
                    if (monSmartphone.getFonctionnalite().isQuatreG())
                    {
                        out.println("<td id=\"colonne2\">Oui</td>\n");
                    }
                    else
                    {
                        out.println("<td id=\"colonne2\">Non</td>\n");
                    }
                    out.println("                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">5G</td>\n");
                    if (monSmartphone.getFonctionnalite().isCinqG())
                    {
                        out.println("<td id=\"colonne2\">Oui</td>\n");
                    }
                    else
                    {
                        out.println("<td id=\"colonne2\">Non</td>\n");
                    }
                    out.println("                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">eSIM</td>\n");
                    if (monSmartphone.getFonctionnalite().isEsim())
                    {
                        out.println("<td id=\"colonne2\">Oui</td>\n");
                    }
                    else
                    {
                        out.println("<td id=\"colonne2\">Non</td>\n");
                    }
                    out.println("                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Batterie amovible</td>\n");
                    if (monSmartphone.getFonctionnalite().isBatterieAmovible())
                    {
                        out.println("<td id=\"colonne2\">Oui</td>\n");
                    }
                    else
                    {
                        out.println("<td id=\"colonne2\">Non</td>\n");
                    }
                    out.println("                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Résolution</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getResolution()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Type d'écran</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getTypedecran()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Puce mobile</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getPucemobile()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Processeur</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getProcesseur()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Nombre de coeur</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getNbrdecoeur()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">GPU</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getGpu()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Capacité de la batterie</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getCapabatterie()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Capteur photo avant</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getCaptphotoav()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Captation vidéo</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getCaptvideo()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Connectique</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getConnectique()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Capteur d'empreintes</td>\n");
                    if (monSmartphone.getFonctionnalite().isCapteurdempreinte())
                    {
                        out.println("<td id=\"colonne2\">Oui</td>\n");
                    }
                    else
                    {
                        out.println("<td id=\"colonne2\">Non</td>\n");
                    }
                    out.println("                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Type Wi-fi</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getTypewifi()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Type bluetooth</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getTypebluetooth()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">NFC</td>\n");
                    if (monSmartphone.getFonctionnalite().isNfc())
                    {
                        out.println("<td id=\"colonne2\">Oui</td>\n");
                    }
                    else
                    {
                        out.println("<td id=\"colonne2\">Non</td>\n");
                    }
                    out.println("                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Type d'étanchéité</td>\n"
                    + "                            <td id=\"colonne2\">"+ monSmartphone.getFonctionnalite().getTypedetancheite()+"</td>\n"
                    + "                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Gyroscope</td>\n");
                    if (monSmartphone.getFonctionnalite().isGyroscope())
                    {
                        out.println("<td id=\"colonne2\">Oui</td>\n");
                    }
                    else
                    {
                        out.println("<td id=\"colonne2\">Non</td>\n");
                    }
                    out.println("                        </tr>\n"
                    + "                        <tr id=\"ligne1\">\n"
                    + "                            <td id=\"colonne1\">Charge par induction</td>\n");
                    if (monSmartphone.getFonctionnalite().isInduction())
                    {
                        out.println("<td id=\"colonne2\">Oui</td>\n");
                    }
                    else
                    {
                        out.println("<td id=\"colonne2\">Non</td>\n");
                    }
                    out.println("                        </tr>\n"
                    + "                        <tr id=\"ligne2\">\n"
                    + "                            <td id=\"colonne1\">Antichoc</td>\n");
                    if (monSmartphone.getFonctionnalite().isAntichoc())
                    {
                        out.println("<td id=\"colonne2\">Oui</td>\n");
                    }
                    else
                    {
                        out.println("<td id=\"colonne2\">Non</td>\n");
                    }
                    out.println("                        </tr>\n"
                    + "                    </table>\n"
                    + "                </div>\n"
                    + "                <div id=\"avis\">\n"
                    + "                    <div id=\"sousTitre\">Avis Clients</div>\n"
                    + "                    <div id=\"monAvis\">\n"
                    + "                        <br>\n"
                    + "                        <div id=\"moyenne\">Moyenne des notes : <font color=\"#21db5e\"><b>4,25/5</b></font></div>\n"
                    + "                        <div id=\"etoilesGlobales\">*****</div>\n"
                    + "                        <br>\n"
                    + "                        <div id=\"hesitezPas\">N'hésitez pas à déposer un avis et une note sur ce téléphone en cliquant sur le bouton ci-dessous</div>\n"
                    + "                        <button id=\"donnerAvis\">Donner mon avis</button>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "        </div>\n"
                    + "\n"
                    + "\n"
                    + "        \n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "        \n"
                    + "    </div>\n"
                    + "</body>\n"
                    + "</html>");

        }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
