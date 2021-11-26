var prixVisible = false;


var samsungTrue = false;
var FairphoneTrue = false;
var huaweiTrue = false;
var wikoTrue = false;
var xiaomiTrue = false;
var googleTrue = false;
var nokiaTrue = false;


var docuTrue = false;
var demontabiliteTrue = false;
var dispopieceTrue = false;
var prixpieceTrue = false;

var envirTrue = false;
var condiTrue = false;
var technoTrue = false;
var donneesTrue = false;

var androidTrue = false;
var iosTrue = false;
var cgTrue = false;
var qgTrue = false;
var sdTrue = false;
var batterieTrue = false;
var esimTrue = false;
var captdempreinteTrue = false;
var nfcTrue = false;
var inductionTrue = false;

var puissanceTrue = false;
var photoVideoTrue = false;
var ecranTrue = false;
var autonomieTrue = false;

var trierpar = "Critères selectionnés";

var checkBoxes = document.getElementsByClassName("checkfiltre");
var checkBoxesOs = document.getElementsByClassName("checkfiltreOs");
var checkBoxesAutre = document.getElementsByClassName("checkfiltreAutre");

var checkboxPerf = document.getElementsByClassName("checkfiltrePerf");
var checkBoxesRepa = document.getElementsByClassName("checkfiltreRepa");
var checkBoxesEnv = document.getElementsByClassName("checkfiltreEnv");

let listSmartphone = [];
let filteredlist = [];
function createSmartphone(id, name, couleur, memoire, circularscore, indicerepa,
        prix, prixvolpy, prixback, prixwefix, prixfnac, prixamazon, lienvolpy, lienback, lienwefix, lienfnac, lienamazon, imgname1, imgname2, imgname3, imgname4,
        marque, os, quatreG, cinqG, microSD, batterieamov, esim, captempreinte, nfc, induction,
        perfnom1, perfnote1, perftype1, perfvalid1, perfnom2, perfnote2, perftype2, perfvalid2,
        perfnom3, perfnote3, perftype3, perfvalid3, perfnom4, perfnote4, perftype4, perfvalid4,
        repanom1, repanote1, repatype1, repavalid1, repanom2, repanote2, repatype2, repavalid2,
        repanom3, repanote3, repatype3, repavalid3, repanom4, repanote4, repatype4, repavalid4,
        devnom1, devnote1, devtype1, devvalid1, devnom2, devnote2, devtype2, devvalid2,
        devnom3, devnote3, devtype3, devvalid3, devnom4, devnote4, devtype4, devvalid4, avisClient) {
    this.id = id;
    this.name = name;

    this.couleur = couleur;
    this.memoire = memoire;
    this.circularscore = circularscore;
    this.indicerepa = indicerepa;
    this.prix = prix;
    this.prixvolpy = prixvolpy;
    this.prixback = prixback;
    this.prixwefix = prixwefix;
    this.prixfnac = prixfnac;
    this.prixamazon = prixamazon;
    this.lienvolpy = lienvolpy;
    this.lienback = lienback;
    this.lienwefix = lienwefix;
    this.lienfnac = lienfnac;
    this.lienamazon = lienamazon;
    this.imgname1 = imgname1;
    this.imgname2 = imgname2;
    this.imgname3 = imgname3;
    this.imgname4 = imgname4;
    this.critereSelection = 0;
    this.fonctionnalite = new createFonctionnalite(marque, os, quatreG, cinqG, microSD, batterieamov, esim, captempreinte, nfc, induction, );
    this.listPerformance = [];
    this.listReparabilite = [];
    this.listDevDurable = [];
    this.listPerformance.push(new createCritere(perfnom1, perfnote1, perftype1, perfvalid1), new createCritere(perfnom2, perfnote2, perftype2, perfvalid2), new createCritere(perfnom3, perfnote3, perftype3, perfvalid3), new createCritere(perfnom4, perfnote4, perftype4, perfvalid4));
    this.listReparabilite.push(new createCritere(repanom1, repanote1, repatype1, repavalid1), new createCritere(repanom2, repanote2, repatype2, repavalid2), new createCritere(repanom3, repanote3, repatype3, repavalid3), new createCritere(repanom4, repanote4, repatype4, repavalid4));
    this.listDevDurable.push(new createCritere(devnom1, devnote1, devtype1, devvalid1), new createCritere(devnom2, devnote2, devtype2, devvalid2), new createCritere(devnom3, devnote3, devtype3, devvalid3), new createCritere(devnom4, devnote4, devtype4, devvalid4));
    if (this.circularscore < 46) {
        this.logocircularscore = "circular_score_rouge.png";
    } else if (this.circularscore >= 46 && this.circularscore < 55) {
        this.logocircularscore = "circular_score_jaune.png";
    } else if (this.circularscore >= 55) {
        this.logocircularscore = "circular_score_vert.png";
    }
    this.avisClient = avisClient;

    if (this.avisClient < 1.5)
    {
        this.imageAvisClient = "0,5etoiles_jaune.png";
    }
    if (this.avisClient >= 1.5 && this.avisClient < 2.5)
    {
        this.imageAvisClient = "1etoiles_jaune.png";
    }
    if (this.avisClient >= 2.5 && this.avisClient < 3.5)
    {
        this.imageAvisClient = "1,5etoiles_jaune.png";
    }
    if (this.avisClient >= 3.5 && this.avisClient < 4.5)
    {
        this.imageAvisClient = "2etoiles_jaune.png";
    }
    if (this.avisClient >= 4.5 && this.avisClient < 5.5)
    {
        this.imageAvisClient = "2,5etoiles_jaune.png";
    }
    if (this.avisClient >= 5.5 && this.avisClient < 6.5)
    {
        this.imageAvisClient = "3etoiles_jaune.png";
    }
    if (this.avisClient >= 6.5 && this.avisClient < 7.5)
    {
        this.imageAvisClient = "3,5etoiles_jaune.png";
    }
    if (this.avisClient >= 7.5 && this.avisClient < 8.5)
    {
        this.imageAvisClient = "4etoiles_jaune.png";
    }
    if (this.avisClient >= 8.5 && this.avisClient < 9.5)
    {
        this.imageAvisClient = "4,5etoiles_jaune.png";
    }
    if (this.avisClient >= 9.5)
    {
        this.imageAvisClient = "5etoiles_jaune.png";
    }
    this.detailid = "detail" + id;


}

function createCritere(nomCrit, noteCrit, typeCrit, validCrit) {
    this.nomCrit = nomCrit;
    this.noteCrit = noteCrit;
    this.typeCrit = typeCrit;
    this.validCrit = validCrit;
    this.valid = false;

}
function createFonctionnalite(marque, os, quatreG, cinqG, microSD, batterieamov, esim, captempreinte, nfc, induction, ) {
    this.marque = marque;
    this.os = os;
    this.quatreG = quatreG;
    this.cinqG = cinqG;

    this.microSD = microSD;
    this.batterieamov = batterieamov;
    this.esim = esim;
    this.captempreinte = captempreinte;
    this.nfc = nfc;
    this.induction = induction;
}
function sendElementList(id, name, couleur, memoire, circularscore, indicerepa,
        prix, prixvolpy, prixback, prixwefix, prixfnac, prixamazon, lienvolpy, lienback,
        lienwefix, lienfnac, lienamazon, imgname1, imgname2, imgname3, imgname4, marque,
        os, quatreG, cinqG, microSD, batterieamov, esim, captempreinte, nfc, induction,
        perfnom1, perfnote1, perftype1, perfvalid1, perfnom2, perfnote2, perftype2, perfvalid2,
        perfnom3, perfnote3, perftype3, perfvalid3, perfnom4, perfnote4, perftype4, perfvalid4,
        repanom1, repanote1, repatype1, repavalid1, repanom2, repanote2, repatype2, repavalid2,
        repanom3, repanote3, repatype3, repavalid3, repanom4, repanote4, repatype4, repavalid4,
        devnom1, devnote1, devtype1, devvalid1, devnom2, devnote2, devtype2, devvalid2,
        devnom3, devnote3, devtype3, devvalid3, devnom4, devnote4, devtype4, devvalid4, avisClient) {

    listSmartphone.push(new createSmartphone(id, name, couleur, memoire, circularscore, indicerepa,
            prix, prixvolpy, prixback, prixwefix, prixfnac, prixamazon, lienvolpy, lienback, lienwefix, lienfnac, lienamazon, imgname1, imgname2, imgname3, imgname4,
            marque, os, quatreG, cinqG, microSD, batterieamov, esim, captempreinte, nfc, induction,
            perfnom1, perfnote1, perftype1, perfvalid1, perfnom2, perfnote2, perftype2, perfvalid2,
            perfnom3, perfnote3, perftype3, perfvalid3, perfnom4, perfnote4, perftype4, perfvalid4,
            repanom1, repanote1, repatype1, repavalid1, repanom2, repanote2, repatype2, repavalid2,
            repanom3, repanote3, repatype3, repavalid3, repanom4, repanote4, repatype4, repavalid4,
            devnom1, devnote1, devtype1, devvalid1, devnom2, devnote2, devtype2, devvalid2,
            devnom3, devnote3, devtype3, devvalid3, devnom4, devnote4, devtype4, devvalid4, avisClient));



}

let hpCharacters = [];

const displayCharacters = (characters) => {
    const htmlString = characters.map((character) => {
        return `
            <li class="character">
                
                <div id=insideTable onclick=goTel(${character.id})>
                        
                        <div id=circularScorePhotoAndScore>
                            <img id=photoTel src=images/Phone/${character.imgname1}.png>
                            <div id=logoPlusScore>
                                
                                <div id=circular>
                                    <img id=circular1 src=images/${character.logocircularscore}>
                                </div>
                                <div id=nbrCircular>
                                    <div id=nbrcircular1>${character.circularscore}</div>
                                </div>
                            </div>
                        </div>
                        <div id=montrerPrix>A partir de <font color=#21db5e><b>${character.prix} €</b></font></div>
                        <div class="nomDuTel"><b>${character.name}</b></div>
                        <div id=montrerCarac>${character.fonctionnalite.marque} - ${character.memoire} - ${character.couleur}</div>
                        <div id=imageEtoiles><img id=star src=images/jaune/${character.imageAvisClient}><label id=nbravisclient for=star >(5)</label><br /></div>
                        <form name=versTel id=${character.detailid} method=post action=telServlet>
                        <table>
                        <input type=hidden name=nomTel value="${character.name}">
                        <input type=hidden name=criterescore value=${character.critereSelection}>
                        </table>
                        </form>
                        </div>
            </li>
        `;
    })
            .join('');

    divListSmartphones.innerHTML = htmlString;
};

function checkBoxTrue() {
    for (let i = 0; i < filteredlist.length; i++) {
        for (let j = 0; j < 4; j++) {
            filteredlist[i].listPerformance[j].valid = checkboxPerf[j].checked;

            filteredlist[i].listReparabilite[j].valid = checkBoxesRepa[j].checked;
            filteredlist[i].listDevDurable[j].valid = checkBoxesEnv[j].checked;


        }
    }
}

function setCritScore() {
    //Set le score par rapport aux criteres des smartphones
    for (let i = 0; i < filteredlist.length; i++) {
        var k = 0;
        var moyenne = 0;

        for (let j = 0; j < filteredlist[i].listPerformance.length; j++) {
            if (filteredlist[i].listPerformance[j].valid == true) {

                moyenne = moyenne + filteredlist[i].listPerformance[j].noteCrit;
                k++;
            }
        }
        for (let j = 0; j < filteredlist[i].listReparabilite.length; j++) {
            if (filteredlist[i].listReparabilite[j].valid == true) {

                moyenne = moyenne + filteredlist[i].listReparabilite[j].noteCrit;
                k++;
            }
        }
        for (let j = 0; j < filteredlist[i].listDevDurable.length; j++) {
            if (filteredlist[i].listDevDurable[j].valid == true) {

                moyenne = moyenne + filteredlist[i].listDevDurable[j].noteCrit;
                k++;
            }
        }

        if (k != 0) {
            moyenne = moyenne / k;
        }
        filteredlist[i].critereSelection = moyenne;


    }
}


function trierPar() {
    if (trierpar == "Critères selectionnés") {
        filteredlist = filteredlist.slice().sort(function (firstSmartphone, secondSmartphone) {
            if (firstSmartphone.critereSelection < secondSmartphone.critereSelection)
                return 1;
            if (firstSmartphone.critereSelection > secondSmartphone.critereSelection)
                return -1;
            return 0;
        });

    } else if (trierpar == "Circul@r Score") {
        filteredlist = filteredlist.slice().sort(function (firstSmartphone, secondSmartphone) {
            if (firstSmartphone.circularscore < secondSmartphone.circularscore)
                return 1;
            if (firstSmartphone.circularscore > secondSmartphone.circularscore)
                return -1;
            return 0;
        });
    } else if (trierpar == "Prix croissant") {
        filteredlist = filteredlist.slice().sort(function (firstSmartphone, secondSmartphone) {
            if (firstSmartphone.prix < secondSmartphone.prix)
                return -1;
            if (firstSmartphone.prix > secondSmartphone.prix)
                return 1;
            return 0;
        });
    } else if (trierpar == "Prix décroissant") {
        filteredlist = filteredlist.slice().sort(function (firstSmartphone, secondSmartphone) {
            if (firstSmartphone.prix < secondSmartphone.prix)
                return 1;
            if (firstSmartphone.prix > secondSmartphone.prix)
                return -1;
            return 0;
        });
    }
}
function smartAndfilter() {
    const divListSmartphones = document.getElementById("divListSmartphones");
    document.getElementById("text2").innerHTML = "Critères selectionnés";
    trierpar = "Critères selectionnés";
    filteredlist = [];
    filteredlist = listSmartphone.filter(function (smartph) {

        var aucuneMarque = true;
        var aucunOs = true;
        var passeMarque = false;
        var passeOs = false;
        var passeAutre = true;

        if (smartph.prix <= document.information.price.value) {

            for (let j = 0; j < checkBoxes.length; j++) {
                if (checkBoxes[j].checked == true) {
                    aucuneMarque = false;
                }
            }
            if (!aucuneMarque) {
                for (let j = 0; j < checkBoxes.length; j++) {
                    if (smartph.fonctionnalite.marque == checkBoxes[j].name && checkBoxes[j].checked == true) {
                        passeMarque = true;
                    }
                }
            } else {
                passeMarque = true;
            }

            if (passeMarque) {
                for (let j = 0; j < checkBoxesOs.length; j++) {
                    if (checkBoxesOs[j].checked == true) {
                        aucunOs = false;
                    }
                }
                if (!aucunOs) {
                    for (let j = 0; j < checkBoxesOs.length; j++) {
                        if ((smartph.fonctionnalite.os == checkBoxesOs[j].name) && (checkBoxesOs[j].checked == true)) {
                            passeOs = true;
                        }
                    }
                } else {
                    passeOs = true;
                }
                if (passeOs) {
                    for (let j = 0; j < checkBoxesAutre.length; j++) {
                        if (checkBoxesAutre[j].checked == true) {
                            if (j == 0) {
                                if (!smartph.fonctionnalite.quatreG) {
                                    passeAutre = false;
                                }
                            } else if (j == 1) {
                                if (!smartph.fonctionnalite.cinqG) {
                                    passeAutre = false;
                                }
                            } else if (j == 2) {
                                if (!smartph.fonctionnalite.microSD) {
                                    passeAutre = false;
                                }
                            } else if (j == 3) {
                                if (!smartph.fonctionnalite.batterieamov) {
                                    passeAutre = false;
                                }
                            } else if (j == 4) {
                                if (!smartph.fonctionnalite.esim) {
                                    passeAutre = false;
                                }
                            } else if (j == 5) {
                                if (!smartph.fonctionnalite.captempreinte) {
                                    passeAutre = false;
                                }
                            } else if (j == 6) {
                                if (!smartph.fonctionnalite.nfc) {
                                    passeAutre = false;
                                }
                            } else if (j == 7) {
                                if (!smartph.fonctionnalite.induction) {
                                    passeAutre = false;
                                }
                            }

                        }
                    }
                    if (passeAutre) {
                        return smartph;
                    }
                }
            }
        }

    });

    checkBoxTrue();
    setCritScore();
    trierPar();

    displayCharacters(filteredlist);




}

function smartAndSearch() {

    const searchBar = document.getElementById("rechercheMiniMenu");
    const loadCharacters = async () => {
        try {
            filteredlist = listSmartphone.slice();
            //alert(filteredlist[0] == listSmartphone[0]);
            displayCharacters(filteredlist);
        } catch (err) {
            console.error(err);
        }
    };


    searchBar.addEventListener("keyup", (e) => {
        const searchString = e.target.value.toLowerCase();

        const filteredCharacters = filteredlist.filter((character) => {
            return (
                    character.name.toLowerCase().includes(searchString) ||
                    character.fonctionnalite.marque.toLowerCase().includes(searchString)
                    );
        });
        displayCharacters(filteredCharacters);
    });


    loadCharacters();
}





function reinitialiser()
{
    document.getElementById("selected").innerHTML = "";
    document.getElementById("sectionPrix").innerHTML = " < ... €";

    document.getElementById("Apple").checked = false;
    appleTrue = false;
    document.getElementById("Samsung").checked = false;
    samsungTrue = false;
    document.getElementById("Fairphone").checked = false;
    FairphoneTrue = false;
    document.getElementById("Huawei").checked = false;
    huaweiTrue = false;
    document.getElementById("Wiko").checked = false;
    wikoTrue = false;
    document.getElementById("Xiaomi").checked = false;
    xiaomiTrue = false;
    document.getElementById("Google").checked = false;
    googleTrue = false;
    document.getElementById("Nokia").checked = false;
    nokiaTrue = false;

    document.getElementById("documentation").checked = false;
    docuTrue = false;
    document.getElementById("demontabilite").checked = false;
    demontabiliteTrue = false;
    document.getElementById("dispopiece").checked = false;
    dispopieceTrue = false;
    document.getElementById("prixpiece").checked = false;
    prixpieceTrue = false;

    document.getElementById("environnement").checked = false;
    envirTrue = false;
    document.getElementById("condi").checked = false;
    condiTrue = false;
    document.getElementById("techno").checked = false;
    technoTrue = false;
    document.getElementById("traitDonnees").checked = false;
    donneesTrue = false;

    document.getElementById("android").checked = false;
    androidTrue = false;
    document.getElementById("ios").checked = false;
    iosTrue = false;
    document.getElementById("cg").checked = false;
    cgTrue = false;
    document.getElementById("qg").checked = false;
    qgTrue = false;
    document.getElementById("sd").checked = false;
    sdTrue = false;
    document.getElementById("batterie").checked = false;
    batterieTrue = false;
    document.getElementById("esim").checked = false;
    esimTrue = false;
    document.getElementById("captdempreinte").checked = false;
    captdempreinteTrue = false;
    document.getElementById("nfc").checked = false;
    nfcTrue = false;
    document.getElementById("induction").checked = false;
    inductionTrue = false;

    document.getElementById("puissance").checked = false;
    puissanceTrue = false;
    document.getElementById("photoVideo").checked = false;
    photoVideoTrue = false;
    document.getElementById("ecran").checked = false;
    ecranTrue = false;
    document.getElementById("Autonomie").checked = false;
    autonomieTrue = false;




}

function initCheckbox(checkbox) {
    for (let i = 0; i < checkbox.length; i++) {
        checkbox[i].checked = false;
    }

}
function rechercherPrix()
{
    document.getElementById("sectionPrix").innerHTML = " < " + document.information.price.value + " €";
}


function rechercheMarque()
{
    if (document.getElementById("Apple").checked == true && appleTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Apple<b>";
        appleTrue = true;
    }
    if (document.getElementById("Samsung").checked == true && samsungTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Samsung<b>";
        samsungTrue = true;
    }
    if (document.getElementById("Fairphone").checked == true && FairphoneTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Fairphone<b>";
        FairphoneTrue = true;
    }
    if (document.getElementById("Huawei").checked == true && huaweiTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Huawei<b>";
        huaweiTrue = true;
    }
    if (document.getElementById("Wiko").checked == true && wikoTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Wiko<b>";
        wikoTrue = true;
    }
    if (document.getElementById("Xiaomi").checked == true && xiaomiTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Xiaomi<b>";
        xiaomiTrue = true;
    }
    if (document.getElementById("Google").checked == true && googleTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Google<b>";
        googleTrue = true;
    }
    if (document.getElementById("Nokia").checked == true && nokiaTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Nokia<b>";
        nokiaTrue = true;
    }

}

function rechercheRepa()
{
    if (document.getElementById("documentation").checked == true && docuTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Documentation<b>";
        docuTrue = true;
    }
    if (document.getElementById("demontabilite").checked == true && demontabiliteTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Demontabilite<b>";
        demontabiliteTrue = true;
    }
    if (document.getElementById("dispopiece").checked == true && dispopieceTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Dispo pièces<b>";
        dispopieceTrue = true;
    }
    if (document.getElementById("prixpiece").checked == true && prixpieceTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Prix pièces<b>";
        prixpieceTrue = true;
    }
}

function rechercheEnv()
{
    if (document.getElementById("environnement").checked == true && envirTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Envir.<b>";
        envirTrue = true;
    }
    if (document.getElementById("condi").checked == true && condiTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Cond. travail<b>";
        condiTrue = true;
    }
    if (document.getElementById("techno").checked == true && technoTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>impact techno.<b>";
        technoTrue = true;
    }
    if (document.getElementById("traitDonnees").checked == true && donneesTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Trt. données<b>";
        donneesTrue = true;
    }
}

function rechercheCarac()
{
    if (document.getElementById("android").checked == true && androidTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Android<b>";
        androidTrue = true;
    }
    if (document.getElementById("ios").checked == true && iosTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>iOS<b>";
        iosTrue = true;
    }
    if (document.getElementById("cg").checked == true && cgTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>5G<b>";
        cgTrue = true;
    }
    if (document.getElementById("qg").checked == true && qgTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>4G<b>";
        qgTrue = true;
    }
    if (document.getElementById("sd").checked == true && sdTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Micro SD<b>";
        sdTrue = true;
    }
    if (document.getElementById("batterie").checked == true && batterieTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Batt. Amovible<b>";
        batterieTrue = true;
    }
    if (document.getElementById("esim").checked == true && esimTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>ESIM<b>";
        esimTrue = true;
    }
    if (document.getElementById("captdempreinte").checked == true && captdempreinteTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Capt. empr.<b>";
        captdempreinteTrue = true;
    }
    if (document.getElementById("nfc").checked == true && nfcTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>NFC<b>";
        nfcTrue = true;
    }
    if (document.getElementById("induction").checked == true && inductionTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Induc.<b>";
        inductionTrue = true;
    }
}

function recherchePerf()
{
    if (document.getElementById("puissance").checked == true && puissanceTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Puiss. calcul<b>";
        puissanceTrue = true;
    }
    if (document.getElementById("photoVideo").checked == true && photoVideoTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Photo&Video<b>";
        photoVideoTrue = true;
    }
    if (document.getElementById("ecran").checked == true && ecranTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Ecran<b>";
        ecranTrue = true;
    }
    if (document.getElementById("Autonomie").checked == true && autonomieTrue == 0)
    {
        document.getElementById("selected").innerHTML += "<b>Autonomie<b>";
        autonomieTrue = true;
    }
}

function displayinfo(id)
{
    document.getElementById("displayInfo" + id).style.visibility = "visible";
}


function rechercheConfirmation() {

}
function hideinfo(id)
{
    document.getElementById("displayInfo" + id).style.visibility = "hidden";
}

var prixTrue = 0;
var marqueTrue = 0;
var repaTrue = 0;
var envTrue = 0;
var caracTrue = 0;
var perfTrue = 0;
var critTrue = 0;



/*window.addEventListener("mouseup",function(event1){
 var prix = document.getElementById("prix");
 var marque = document.getElementById("marque");
 var carac = document.getElementById("carac");
 var perf = document.getElementById("perf");
 var env = document.getElementById("env");
 var repa = document.getElementById("repa");
 if(event1.target != prix && event1.target.parentNode != prix &&
 event1.target != marque && event1.target.parentNode != marque &&
 event1.target != carac && event1.target.parentNode != carac &&
 event1.target != perf && event1.target.parentNode != perf &&
 event1.target != env && event1.target.parentNode != env &&
 event1.target != repa && event1.target.parentNode != repa ){
 prix.style.display = "none";
 marque.style.display = "none";
 carac.style.display = "none";
 perf.style.display = "none";
 env.style.display = "none";
 repa.style.display = "none";
 }
 
 
 });  */

/*window.addEventListener("mouseup",function(event2){
 var marque = document.getElementById("marque");
 if(event2.target != marque && event2.target.parentNode != marque){
 marque.style.display = "none";
 
 }
 
 
 });  
 
 
 window.addEventListener("mouseup",function(event3){
 
 var carac = document.getElementById("carac");
 if(event3.target != carac && event3.target.parentNode != carac){
 carac.style.display = "none";
 }
 
 }); 
 window.addEventListener("mouseup",function(event4){
 
 var perf = document.getElementById("perf");
 if(event4.target != perf && event4.target.parentNode != perf){
 perf.style.display = "none";
 }
 
 });  
 window.addEventListener("mouseup",function(event5){
 
 var dev = document.getElementById("env");
 if(event5.target != dev && event5.target.parentNode != dev){
 dev.style.display = "none";
 }
 
 });  
 window.addEventListener("mouseup",function(event6){
 
 var repa = document.getElementById("repa");
 if(event6.target != repa && event6.target.parentNode != repa){
 repa.style.display = "none";
 }
 });*/

function displayPrix()
{
    if (prixTrue === 0)
    {
        document.getElementById("prix").style.display = "block";
        document.getElementById("marque").style.display = "none";
        document.getElementById("carac").style.display = "none";
        document.getElementById("perf").style.display = "none";
        document.getElementById("env").style.display = "none";
        document.getElementById("repa").style.display = "none";

        prixTrue = 1;


    } else if (prixTrue === 1)
    {
        document.getElementById("prix").style.display = "none";
        prixTrue = 0;

    }
}

function displayMarque()
{
    if (marqueTrue === 0)
    {
        document.getElementById("prix").style.display = "none";
        document.getElementById("marque").style.display = "block";
        document.getElementById("carac").style.display = "none";
        document.getElementById("perf").style.display = "none";
        document.getElementById("env").style.display = "none";
        document.getElementById("repa").style.display = "none";

        marqueTrue = 1;

    } else if (marqueTrue === 1)
    {
        document.getElementById("marque").style.display = "none";
        marqueTrue = 0;
    }
}

function displayRepa()
{
    if (repaTrue === 0)
    {
        document.getElementById("prix").style.display = "none";
        document.getElementById("marque").style.display = "none";
        document.getElementById("carac").style.display = "none";
        document.getElementById("perf").style.display = "none";
        document.getElementById("env").style.display = "none";
        document.getElementById("repa").style.display = "block";
        repaTrue = 1;

    } else if (repaTrue === 1)
    {
        document.getElementById("repa").style.display = "none";
        repaTrue = 0;
    }
}

function displayEnv()
{
    if (envTrue === 0)
    {
        document.getElementById("prix").style.display = "none";
        document.getElementById("marque").style.display = "none";
        document.getElementById("carac").style.display = "none";
        document.getElementById("perf").style.display = "none";
        document.getElementById("env").style.display = "block";
        document.getElementById("repa").style.display = "none";
        envTrue = 1;

    } else if (envTrue === 1)
    {
        document.getElementById("env").style.display = "none";
        envTrue = 0;
    }
}


function displayCarac()
{
    if (caracTrue === 0)
    {
        document.getElementById("prix").style.display = "none";
        document.getElementById("marque").style.display = "none";
        document.getElementById("carac").style.display = "block";
        document.getElementById("perf").style.display = "none";
        document.getElementById("env").style.display = "none";
        document.getElementById("repa").style.display = "none";
        caracTrue = 1;

    } else if (caracTrue === 1)
    {
        document.getElementById("carac").style.display = "none";
        caracTrue = 0;
    }
}

function displayPerf()
{
    if (perfTrue === 0)
    {
        document.getElementById("prix").style.display = "none";
        document.getElementById("marque").style.display = "none";
        document.getElementById("carac").style.display = "none";
        document.getElementById("perf").style.display = "block";
        document.getElementById("env").style.display = "none";
        document.getElementById("repa").style.display = "none";
        perfTrue = 1;

    } else if (perfTrue === 1)
    {
        document.getElementById("perf").style.display = "none";
        perfTrue = 0;
    }
}

function displayCrit()
{
    if (critTrue == 0)
    {
        document.getElementById("crit").style.visibility = "visible";
        critTrue = 1;
    } else if (critTrue == 1)
    {
        document.getElementById("crit").style.visibility = "hidden";
        critTrue = 0;
    }
}

function choixCrit(choix)
{
    document.getElementById("crit").style.visibility = "hidden";
    critTrue = 0;
    if (choix == "Critères selectionnés")
    {
        document.getElementById("text2").innerHTML = "Critères selectionnés";
        trierpar = "Critères selectionnés";
        trierPar();
        displayCharacters(filteredlist);
    } else
    {
        document.getElementById("text2").innerHTML = choix;
        trierpar = choix;
        trierPar();
        displayCharacters(filteredlist);
    }

}

const mouseoverEvent = new Event("mouseover");


function hideAll()
{

}

var voir = 1;

function goTel(id) {

    var nom = "detail" + id;
    document.getElementById(nom).submit();


}

function changementTel(name)
{
    var nom = "" + name;
    /*if (number==1)
     {*/

    document.getElementById("photoPrinc").innerHTML = "<img id=\"photoTel\" src=\"images/Phone/" + nom + ".png\">";
    /*}
     if (number==2)
     {
     document.getElementById("photoPrinc").innerHTML = "<img id=\"photoTel\" src=\"images/telExemple.png\">";
     }
     if (number==3)
     {
     document.getElementById("photoPrinc").innerHTML = "<img id=\"photoTel\" src=\"images/Iphone12.jpg\">";
     }
     if (number==4)
     {
     document.getElementById("photoPrinc").innerHTML = "<img id=\"photoTel\" src=\"images/telExemple.png\">";
     }*/
}

function flecheDroite()
{
    if (voir == 4)
    {
        voir = 1;
    } else
    {
        voir++;
    }
    changementTel(voir);
}

function flecheGauche()
{
    if (voir == 1)
    {
        voir = 4;
    } else
    {
        voir--;
    }
    changementTel(voir);
}