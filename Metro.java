class Metro {

    public static void main(String[] args) {

        String whitefield = "Whitefield (Kadugodi)";
        String hopefarm = "Hopefarm Channasandra";
        String kadugodi = "Kadugodi Tree Park";
        String pattanduru = "Pattanduru Agrahara";
        String sssHospital = "Sri Sathya Sai Hospital";
        String nallurhalli = "Nallurhalli";
        String kundalahalli = "Kundalahalli";
        String seetharamapalya = "Seetharamapalya";
        String hoodi = "Hoodi";
        String garudacharpalya = "Garudacharpalya";
        String singayyanapalya = "Singayyanapalya";
        String krPura = "Krishnarajapura (K.R. Pura)";
        String benniganahalli = "Benniganahalli";
        String baiyappanahalli = "Baiyappanahalli";
        String swamiVivekanandaRoad = "Swami Vivekananda Road";
        String indiranagar = "Indiranagar";
        String halasuru = "Halasuru";
        String trinity = "Trinity";
        String mgRoad = "MG Road";
        String cubbonPark = "Cubbon Park";
        String vidhanaSoudha = "Vidhana Soudha";
        String centralCollege = "Central College";
        String majestic = "Nadaprabhu Kempegowda Station (Majestic)";
        String ksrRailway = "KSR City Railway Station";
        String magadiRoad = "Magadi Road";
        String hosahalli = "Hosahalli";
        String vijayanagar = "Vijayanagar";
        String attiguppe = "Attiguppe";
        String deepanjaliNagar = "Deepanjali Nagar";
        String mysuruRoad = "Mysuru Road";
        String nayandahalli = "Nayandahalli";
        String rrNagar = "Rajarajeshwari Nagar (RR Nagar)";
        String jnanabharathi = "Jnanabharathi";
        String pattanagere = "Pattanagere";
        String kengeriBusTerminal = "Kengeri Bus Terminal";
        String kengeri = "Kengeri";
        String challaghatta = "Challaghatta";

        String rvRoad = "Rashtreeya Vidyalaya Road (RV Road)";
        String ragigudda = "Ragigudda";
        String jayadevaHospital = "Jayadeva Hospital";
        String btmLayout = "BTM Layout";
        String centralSilkBoard = "Central Silk Board";
        String bommanahalli = "Bommanahalli";
        String hongasandra = "Hongasandra";
        String kudluGate = "Kudlu Gate";
        String singasandra = "Singasandra";
        String hosaRoad = "Hosa Road";
        String beratenaAgrahara = "Beratena Agrahara";
        String electronicCity = "Electronic City";
        String infosysFoundation = "Infosys Foundation Konappana Agrahara";
        String huskurRoad = "Huskur Road";
        String biocon = "Biocon Hebbagodi";
        String deltaElectronics = "Delta Electronics Bommasandra";

        String purpleLine[] = {
            whitefield, hopefarm, kadugodi, pattanduru, sssHospital,
            nallurhalli, kundalahalli, seetharamapalya, hoodi,
            garudacharpalya, singayyanapalya, krPura, benniganahalli,
            baiyappanahalli, swamiVivekanandaRoad, indiranagar,
            halasuru, trinity, mgRoad, cubbonPark, vidhanaSoudha,
            centralCollege, majestic, ksrRailway, magadiRoad,
            hosahalli, vijayanagar, attiguppe, deepanjaliNagar,
            mysuruRoad, nayandahalli, rrNagar, jnanabharathi,
            pattanagere, kengeriBusTerminal, kengeri, challaghatta
        };

        String yellowLine[] = {
            rvRoad, ragigudda, jayadevaHospital, btmLayout,
            centralSilkBoard, bommanahalli, hongasandra,
            kudluGate, singasandra, hosaRoad, beratenaAgrahara,
            electronicCity, infosysFoundation, huskurRoad,
            biocon, deltaElectronics
        };

       
        for(String station : purpleLine) {
            System.out.println(station);
        }

        
        for(String station : yellowLine) {
            System.out.println(station);
        }
    }
}