/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.SmartphoneDAOimpl;
import entity.Critere;
import entity.Smartphone;
import java.awt.Font;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.io.InputStream;
import java.sql.Blob;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JCheckBox;

/**
 *
 * @author kevin
 */
public class guideServlet extends HttpServlet {

    private ArrayList<Smartphone> listSmartphone;
    private ArrayList<Smartphone> listSmartphoneAffiche;
    private ArrayList<Smartphone> listSmartphoneTemp;
    private SmartphoneDAOimpl smartDAO;

    public guideServlet() {
        listSmartphone = new ArrayList<Smartphone>();
        smartDAO = new SmartphoneDAOimpl();
        listSmartphone = smartDAO.selectAllSmartphone();

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
            out.println("<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "<head>\n"
                    + "    <Title>Circular Phone</Title> \n"
                    + "    <meta charset=\"utf-8\" />\n"
                    + "  <link rel=\"stylesheet\" href=\"page.css\">\n"
                    + "  <link rel=\"icon\" href=\"images/LogoHead.png\" />\n"
                    + "  <script src=\"actions.js\"></script>\n"
                    + "</head>\n"
                    + "\n"
                    + "<body>\n");
            
            for (int i = 0; i < listSmartphone.size(); i++) {
                
                double avisClient = 5 + (Math.random() * ((10-5)+1));
                out.println("<script>\n"
                        + "window.onload=sendElementList(" + listSmartphone.get(i).getId() + ",'" + listSmartphone.get(i).getNom() + "',"
                        + "'" + listSmartphone.get(i).getCouleur() + "','" + listSmartphone.get(i).getMemoire() + "'," + listSmartphone.get(i).getCircularscore() + ","
                        + " " + listSmartphone.get(i).getIndicedeRepa() + "," + listSmartphone.get(i).getPrix() + "," + listSmartphone.get(i).getPrixvolpy() + ","
                        + " " + listSmartphone.get(i).getPrixback() + "," + listSmartphone.get(i).getPrixwefix() + "," + listSmartphone.get(i).getPrixfnac() + ","
                        + " " + listSmartphone.get(i).getPrixamazon() + ",'" + listSmartphone.get(i).getLienvolpy() + "','" + listSmartphone.get(i).getLienback() + "',"
                        + "'" + listSmartphone.get(i).getLienwefix() + "','" + listSmartphone.get(i).getLienfnac() + "','" + listSmartphone.get(i).getLienamazon() + "',"
                        + "'" + listSmartphone.get(i).getImgName1() + "', '" + listSmartphone.get(i).getImgName2() + "','" + listSmartphone.get(i).getImgName3() + "',"
                        + "'" + listSmartphone.get(i).getImgName4() + "','" + listSmartphone.get(i).getFonctionnalite().getMarque() + "','" + listSmartphone.get(i).getFonctionnalite().getOs() + "',"
                        + " " + listSmartphone.get(i).getFonctionnalite().isQuatreG() + ","
                        + " " + listSmartphone.get(i).getFonctionnalite().isCinqG() + "," + listSmartphone.get(i).getFonctionnalite().isMicroSD() + "," + listSmartphone.get(i).getFonctionnalite().isBatterieAmovible() + "," + listSmartphone.get(i).getFonctionnalite().isEsim() + "," + listSmartphone.get(i).getFonctionnalite().isCapteurdempreinte() + "," + listSmartphone.get(i).getFonctionnalite().isNfc() + "," + listSmartphone.get(i).getFonctionnalite().isInduction() + ","
                        + "'" + listSmartphone.get(i).getListPerformance().get(0).getNom() + "'," + listSmartphone.get(i).getListPerformance().get(0).getNote() + ",'" + listSmartphone.get(i).getListPerformance().get(0).getType() + "','" + listSmartphone.get(i).getListPerformance().get(0).isValid() + "',"
                        + "'" + listSmartphone.get(i).getListPerformance().get(1).getNom() + "'," + listSmartphone.get(i).getListPerformance().get(1).getNote() + ",'" + listSmartphone.get(i).getListPerformance().get(1).getType() + "','" + listSmartphone.get(i).getListPerformance().get(1).isValid() + "',"
                        + "'" + listSmartphone.get(i).getListPerformance().get(2).getNom() + "'," + listSmartphone.get(i).getListPerformance().get(2).getNote() + ",'" + listSmartphone.get(i).getListPerformance().get(2).getType() + "','" + listSmartphone.get(i).getListPerformance().get(2).isValid() + "',"
                        + "'" + listSmartphone.get(i).getListPerformance().get(3).getNom() + "'," + listSmartphone.get(i).getListPerformance().get(3).getNote() + ",'" + listSmartphone.get(i).getListPerformance().get(3).getType() + "','" + listSmartphone.get(i).getListPerformance().get(3).isValid() + "',"
                        + "'" + listSmartphone.get(i).getListReparabilite().get(0).getNom() + "'," + listSmartphone.get(i).getListReparabilite().get(0).getNote() + ",'" + listSmartphone.get(i).getListReparabilite().get(0).getType() + "','" + listSmartphone.get(i).getListReparabilite().get(0).isValid() + "',"
                        + "'" + listSmartphone.get(i).getListReparabilite().get(1).getNom() + "'," + listSmartphone.get(i).getListReparabilite().get(1).getNote() + ",'" + listSmartphone.get(i).getListReparabilite().get(1).getType() + "','" + listSmartphone.get(i).getListReparabilite().get(1).isValid() + "',"
                        + "'" + listSmartphone.get(i).getListReparabilite().get(2).getNom() + "'," + listSmartphone.get(i).getListReparabilite().get(2).getNote() + ",'" + listSmartphone.get(i).getListReparabilite().get(2).getType() + "','" + listSmartphone.get(i).getListReparabilite().get(2).isValid() + "',"
                        + "'" + listSmartphone.get(i).getListReparabilite().get(3).getNom() + "'," + listSmartphone.get(i).getListReparabilite().get(3).getNote() + ",'" + listSmartphone.get(i).getListReparabilite().get(3).getType() + "','" + listSmartphone.get(i).getListReparabilite().get(3).isValid() + "',"
                        + "'" + listSmartphone.get(i).getListDevdurable().get(0).getNom() + "'," + listSmartphone.get(i).getListDevdurable().get(0).getNote() + ",'" + listSmartphone.get(i).getListDevdurable().get(0).getType() + "','" + listSmartphone.get(i).getListDevdurable().get(0).isValid() + "',"
                        + "'" + listSmartphone.get(i).getListDevdurable().get(1).getNom() + "'," + listSmartphone.get(i).getListDevdurable().get(1).getNote() + ",'" + listSmartphone.get(i).getListDevdurable().get(1).getType() + "','" + listSmartphone.get(i).getListDevdurable().get(1).isValid() + "',"
                        + "'" + listSmartphone.get(i).getListDevdurable().get(2).getNom() + "'," + listSmartphone.get(i).getListDevdurable().get(2).getNote() + ",'" + listSmartphone.get(i).getListDevdurable().get(2).getType() + "','" + listSmartphone.get(i).getListDevdurable().get(2).isValid() + "',"
                        + "'" + listSmartphone.get(i).getListDevdurable().get(3).getNom() + "'," + listSmartphone.get(i).getListDevdurable().get(3).getNote() + ",'" + listSmartphone.get(i).getListDevdurable().get(3).getType() + "','" + listSmartphone.get(i).getListDevdurable().get(3).isValid() + "'," + avisClient + ") ;\n"
                        + "</script>\n");
            }
            out.println("    <div id=\"container\" >\n"
                    + "        <br><br><br>\n"
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
                    + "        <div id=\"fondBlanc\">\n"
                    + "        <br><br>\n"
                    + "        <div id=\"TextPrincipal\">\n"
                    + "            <b>Trouvez le smartphone qui vous correspond selon <font color=\"#21db5e\">vos critères</font></b>\n"
                    + "        </div>\n"
                    + "        <br><br>\n"
                    + "\n"
                    + "        <div id=\"Menu\">\n"
                    + "            <div id=\"menuPrix\"  onclick=\"displayPrix()\">\n"
                    + "                <div id=\"text\">Prix</div>\n"
                    + "                <div id=\"sectionPrix\"> < ... €</div>\n"
                    + "                <div id=\"deroule\">🢓</div>\n"
                    + "            </div>\n"
                    + "            <div id=\"menuMarque\"  onclick=\"displayMarque()\">\n"
                    + "                <div id=\"text\">Marque</div>\n"
                    + "                <div id=\"deroule\">🢓</div>\n"
                    + "            </div>\n"
                    + "            <div id=\"menuCarac\" onclick=\"displayCarac()\">\n"
                    + "                <div id=\"text\">Caractéristiques</div>\n"
                    + "                <div id=\"deroule\">🢓</div>\n"
                    + "            </div>\n"
                    + "            <div id=\"menuPerf\" onclick=\"displayPerf()\">\n"
                    + "                <div id=\"text\">Performances</div>\n"
                    + "                <div id=\"deroule\">🢓</div>\n"
                    + "            </div>\n"
                    + "            <div id=\"menuEnv\" onclick=\"displayEnv()\">\n"
                    + "                <div id=\"text\">Développement durable</div>\n"
                    + "                <div id=\"deroule\">🢓</div>\n"
                    + "            </div>\n"
                    + "            <div id=\"menuRepa\" onclick=\"displayRepa()\">\n"
                    + "                <div id=\"text\">Réparabilité</div>\n"
                    + "                <div id=\"deroule\">🢓</div>\n"
                    + "            </div>\n"
                    + "            <form name=\"information\" method=\"post\" action=\"\">\n"
                    + "                <div id=\"prix\" class=\"\">\n"
                    + "                    <p><b>0€ - 1500€</b></p>\n"
                    + "                    <p><p>Fourchette</p>\n"
                    + "                    <input type=\"range\" name=\"price\"  onclick=\"rechercherPrix()\" id=\"price\" min=0 max=1500 step=10>\n"
                    + "                </div>\n"
                    + "                <div id=\"marque\" class=\"divmarque\" onclick=\"rechercheMarque()\">\n"
                    + "                    <p id=\"left\">\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltre\" name=\"Apple\" id=\"Apple\"/> <label for=\"Apple\">Apple</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltre\" name=\"Samsung\" id=\"Samsung\" /> <label for=\"Samsung\">Samsung</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltre\" name=\"Fairphone\" id=\"Fairphone\" /> <label for=\"Fairphone\">Fairphone</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltre\" name=\"Huawei\" id=\"Huawei\" /> <label for=\"Huawei\">Huawei</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltre\" name=\"Wiko\" id=\"Wiko\" /> <label for=\"Wiko\">Wiko</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltre\" name=\"Xiaomi\" id=\"Xiaomi\" /> <label for=\"Xiaomi\">Xiaomi</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltre\" name=\"Google\" id=\"Google\" /> <label for=\"Google\">Google</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltre\" name=\"Nokia\" id=\"Nokia\" /> <label for=\"Nokia\">Nokia</label><br />\n"
                    + "                    </p>\n"
                    + "                </div>\n"
                    + "                <div id=\"carac\" class=\"divcarac\"onclick=\"rechercheCarac()\">\n"
                    + "                    <p id=\"left\">\n"
                    + "                        <p id=\"centre\"><b>OS</b></p>\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreOs\" name=\"Android\" id=\"android\" /> <label for=\"android\">Android</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreOs\" name=\"IOS\" id=\"ios\" /> <label for=\"ios\">iOS</label><br />\n"
                    + "                        <p id=\"centre\"><b>Autres</b></p>\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreAutre\" name=\"qg\" id=\"qg\" /> <label for=\"qg\">4G</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreAutre\" name=\"cg\" id=\"cg\" /> <label for=\"cg\">5G</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreAutre\" name=\"sd\" id=\"sd\" /> <label for=\"sd\">Micro SD</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreAutre\" name=\"batterie\" id=\"batterie\" /> <label for=\"batterie\">Batterie Amovible</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreAutre\" name=\"esim\" id=\"esim\" /> <label for=\"esim\">E-SIM</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreAutre\" name=\"captdempreinte\" id=\"captdempreinte\" /> <label for=\"captdempreinte\">Capteur d'empreinte</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreAutre\" name=\"nfc\" id=\"nfc\" /> <label for=\"nfc\">NFC</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreAutre\" name=\"induction\" id=\"induction\" /> <label for=\"induction\">Charge à induction</label><br />\n"
                    + "                        \n"
                    + "                    </p>\n"
                    + "                </div>\n"
                    + "                <div id=\"perf\" onclick=\"recherchePerf()\">\n"
                    + "                    <p>\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltrePerf\" name=\"puissance\" id=\"puissance\" /> <label for=\"puissance\">Puissance de calcul</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltrePerf\" name=\"photoVideo\" id=\"photoVideo\" /> <label for=\"photoVideo\">Photo et Vidéo</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltrePerf\" name=\"ecran\" id=\"ecran\" /> <label for=\"ecran\">Ecran</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltrePerf\" name=\"Autonomie\" id=\"Autonomie\" /> <label for=\"Autonomie\">Autonomie</label><br />\n"
                    + "                    </p>\n"
                    + "                </div>\n"
                    + "                <div id=\"env\" onclick=\"rechercheEnv()\">\n"
                    + "                    <p>\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreEnv\" name=\"environnement\" id=\"environnement\" /> <label for=\"environnement\">Environnement</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreEnv\" name=\"condi\" id=\"condi\" /> <label for=\"condi\">Conditions de travail</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreEnv\" name=\"techno\" id=\"techno\" /> <label for=\"techno\">Impact des technologies</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreEnv\" name=\"traitDonnees\" id=\"traitDonnees\" /> <label for=\"traitDonnees\">Traitement des données personnelles</label><br />\n"
                    + "                    </p>\n"
                    + "                </div>\n"
                    + "                <div id=\"repa\" onclick=\"rechercheRepa()\">\n"
                    + "                    <p>\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreRepa\" name=\"documentation\" id=\"documentation\" /> <label for=\"documentation\">Documentation</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreRepa\" name=\"demontabilite\" id=\"demontabilite\" /> <label for=\"demontabilite\">Démontabalité</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreRepa\" name=\"dispopiece\" id=\"dispopiece\" /> <label for=\"dispopiece\">Dispo pièces détachées</label><br />\n"
                    + "                        <input type=\"checkbox\" class=\"checkfiltreRepa\" name=\"prixpiece\" id=\"prixpiece\" /> <label for=\"prixpiece\">Prix pièces</label><br />\n"
                    + "                    </p>\n"
                    + "                </div>\n"
                    + "                    <input type=\"button\" id=\"Rechercher\" value=\"Recherche\" onclick=\"smartAndfilter()\">\n"
                    + "                \n"
                    + "                \n"
                    + "            </form>\n"
                    + "            <a href=\"https://moralscore.org/sectors/smartphones/\" target=\"_blank\"><img id=\"info1\" onmouseover=\"displayinfo(1)\" onmouseout=\"hideinfo(1)\" src=\"images/Information_point_vert.png\" alt=\"info\"> </a>\n"
                    + "            <img id=\"displayInfo1\" src=\"images/bulleenvir.png\" alt=\"info\">\n"
                    + "            <a href=\"https://www.indicereparabilite.fr/appareils/smartphone/\" target=\"_blank\"><img id=\"info2\" onmouseover=\"displayinfo(2)\" onmouseout=\"hideinfo(2)\" src=\"images/Information_point_vert.png\" alt=\"info\"></a>\n"
                    + "            <img id=\"displayInfo2\" src=\"images/bullerepa.png\" alt=\"info\">\n"
                    + "            <div id=\"selected\"></div>\n"
                    + "            <div id=\"reinitialiser\" onclick=\"reinitialiser()\">Réinitialiser</div>\n"
                    + "            \n"
                    + "        </div> \n"
                    + "        </div> \n"
                    + "        <br><br>\n"
                    + "        <div id=\"tel\">\n"
                    + "            <div id=\"CircularScore\">\n"
                    + "                <a href=\"circularScore.html\"><div id=\"SavoirPlus\">\n"
                    + "                    En savoir plus\n"
                    + "                </div></a>\n"
                    + "                <div id=\"infoCircular\">\n"
                    + "                    Évalue l'impact environnemental et la réparabilité des smartphones.\n"
                    + "                </div>\n"
                    + "                <img id=\"ScoreLogo\" src=\"images/circular_score.png\">\n"
                    + "            </div>\n"
                    + "            <div id=\"miniMenu\">\n"
                    + "                <div id = avisclientMenu>\n"
                    + "                <img id=\"etoilesMiniMenu\" src=\"images/jaune/4etoiles_jaune.png\" alt=\"etoiles\"> <label id=avisclientlabel for=\"etoilesMiniMenu\">        Avis client</label>\n"
                    + "                </div>\n"
                    + "                    <div id=\"searchWrapper\">\n"
                    + "                        <input type=\"text\" name=\"searchBar\" id=\"rechercheMiniMenu\" placeholder=\"Search for a smartphone\" />\n"
                    + "                    </div>"
                    + "                    <div id=\"trierPart\">Trier par : </div>\n"
                    + "                    <div id=\"miniMenuCrit\"  onclick=\"displayCrit()\">\n"
                    + "                        <div id=\"text2\">Critères selectionnés</div>\n"
                    + "                        <div id=\"deroule2\">🢓</div>\n"
                    + "                    </div>\n"
                    + "                    <div id=\"crit\">\n"
                    + "                        <div id=\"case\" onclick=\"choixCrit('Critères selectionnés')\">Critères selectionnés</div>\n"
                    + "                        <div id=\"case\" onclick=\"choixCrit('Circul@r Score')\">Circul@r Score</div>\n"
                    + "                        <div id=\"case\" onclick=\"choixCrit('Prix croissant')\">Prix croissant</div>\n"
                    + "                        <div id=\"case\" onclick=\"choixCrit('Prix décroissant')\">Prix décroissant</div>\n"
                    + "                    </div>\n"
                    + "            </div>\n"
                    + "            <div id=\"lienHaut\">\n"
                    + "                <a href=\"#\"><img id=\"fleche\" src=\"images/fleche_gris.png\"></a>\n"
                    + "            </div>\n");

            out.println("<div id=\"affichageTel\">\n"
                    + "            <ul id=\"divListSmartphones\"></ul>\n"
                    + "<script>\n"
                    + "window.onload=reinitialiser() ;\n"
                    + "window.onload=smartAndSearch() ;\n"
                    + "</script>"
                    + "        </div>\n");
            
            /*out.println("<div id=\"affichageTel\">\n"
                    + "                <table>");

            int panelNumber = listSmartphone.size() + 1;
            int resteParTrois = panelNumber % 3;
            int divParTrois = (panelNumber - resteParTrois) / 3;
            int compteur = 0;
            for (int i = 0; i < divParTrois; i++) {
                out.println("<tr>\n"
                        + "                        <td id=\"tableauTel\" onmouseover=\"souligne()\">\n"
                        + "                            <div id=\"insideTable\" onclick=\"goTel(" + listSmartphone.get(compteur).getId() + ")\">\n"
                        + "                                <img id=photoTel src=\"images/Phone/" + listSmartphone.get(compteur).getImgName() + ".png\">\n"
                        + "                                <div id=\"montrerPrix\">A partir de <font color=\"#21db5e\"><b>" + listSmartphone.get(compteur).getPrix() + "€</b></font></div>\n"
                        + "                                <div id=\"nomDuTel\"><b>" + listSmartphone.get(compteur).getNom() + "</b></div>\n"
                        + "                                <div id=\"montrerCarac\">carac1 - carac2 - carac3</div>\n"
                        + "                                <div id=imageEtoiles>*****</div>\n"
                        + "                                <form name=\"versTel\" id=\"detail" + listSmartphone.get(compteur).getId() + "\" method=\"post\" action=\"telServlet\">\n"
                        + "                                    <table>\n"
                        + "                                        <input type=\"hidden\" name=\"nomTel\" value=\"" + listSmartphone.get(compteur).getNom() + "\">\n"
                        + "                                    </table>\n"
                        + "                                </form>\n"
                        + "                            </div>\n"
                        + "                        </td>");
                compteur++;

                out.println("<td id=\"tableauTel\">\n"
                        + "                            <div id=\"insideTable\" onclick=\"goTel(" + listSmartphone.get(compteur).getId() + ")\">\n"
                        + "                                <img id=photoTel src=\"images/Phone/" + listSmartphone.get(compteur).getImgName() + ".png\">\n"
                        + "                                <div id=\"montrerPrix\">A partir de <font color=\"#21db5e\"><b>" + listSmartphone.get(compteur).getPrix() + "€</b></font></div>\n"
                        + "                                <div id=\"nomDuTel\"><b>" + listSmartphone.get(compteur).getNom() + "</b></div>\n"
                        + "                                <div id=\"montrerCarac\">carac1 - carac2 - carac3</div>\n"
                        + "                                <div id=imageEtoiles>*****</div>\n"
                        + "                                <form name=\"versTel\" id=\"detail" + listSmartphone.get(compteur).getId() + "\" method=\"post\" action=\"telServlet\">\n"
                        + "                                    <table>\n"
                        + "                                        <input type=\"hidden\" name=\"nomTel\" value=\"" + listSmartphone.get(compteur).getNom() + "\">\n"
                        + "                                    </table>\n"
                        + "                                </form>\n"
                        + "                            </div>\n"
                        + "                        </td>");
                compteur++;
                out.println("<td id=\"tableauTel\">\n"
                        + "                            <div id=\"insideTable\" onclick=\"goTel(" + listSmartphone.get(compteur).getId() + ")\">\n"
                        + "                                <img id=photoTel src=\"images/Phone/" + listSmartphone.get(compteur).getImgName() + ".png\">\n"
                        + "                                <div id=\"montrerPrix\">A partir de <font color=\"#21db5e\"><b>" + listSmartphone.get(compteur).getPrix() + "€</b></font></div>\n"
                        + "                                <div id=\"nomDuTel\"><b>" + listSmartphone.get(compteur).getNom() + "</b></div>\n"
                        + "                                <div id=\"montrerCarac\">carac1 - carac2 - carac3</div>\n"
                        + "                                <div id=imageEtoiles>*****</div>\n"
                        + "                                <form name=\"versTel\" id=\"detail" + listSmartphone.get(compteur).getId() + "\" method=\"post\" action=\"telServlet\">\n"
                        + "                                    <table>\n"
                        + "                                        <input type=\"hidden\" name=\"nomTel\" value=\"" + listSmartphone.get(compteur).getNom() + "\">\n"
                        + "                                    </table>\n"
                        + "                                </form>\n"
                        + "                            </div>\n"
                        + "                        </td>\n"
                        + "                    </tr>");
                compteur++;

            }
            out.println("</table>\n"
                    + "            </div>");*/
            out.println("</div>\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
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
