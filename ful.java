//Mohamed A/rahman Ibrahim
//ID C1240058


import java.util.Scanner;

public class ful {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.print("Fadlan garaac *810#: ");
            String ussd = scanner.nextLine();
            if (ussd.equals("*810#")) {
                break;
            }

        }

        while (true) {
            System.out.print("Fadlan geli pin kaaga (Enter pin): ");
            String pin = scanner.nextLine();
            if (pin.matches("\\d{4}")) {
                System.out.println("PIN-ka waa laguu oggolaaday. Kusoo dhawaaw jepp!");
                break;
            } else {
                System.out.println("PIN-ku waa inuu noqdaa 4 nambar oo kaliya.\n");
            }
        }

        showMenu();
    }

    public static void showMenu() {
        while (true) {
            System.out.println("\n JEEB ");
            System.out.println("1. Itus Haraaga");
            System.out.println("2. Kaarka hadalka");
            System.out.println("3. Kaarka Internet");
            System.out.println("4. Lacag Dirid");
            System.out.println("5. Bixi Biil");
            System.out.println("6. Warbixin Kooban");
            System.out.println("7. Banks");
            System.out.println("8. TAAJ");
            System.out.println("9. Maareynta");
            System.out.println("0. KaBax");
            System.out.print("\nDooro adeega: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1": itusHaraaga();
                    break;
                case "2": kaarkaHadalka();
                    break;
                case "3": kaarkaInternet();
                    break;
                case "4": lacagDirid();
                    break;
                case "5": bixiBiil();
                    break;
                case "6": warbixinKooban();
                    break;
                case "7": banks();
                    break;
                case "8": taaj();
                    break;
                case "9": maareynta();
                    break;
                case "0": kaBax();
                    break;
                default:
                    System.out.println("Kaliya dooro nambarada list ga.");
            }
        }
    }


    public static void itusHaraaga() {
        System.out.println("\n--------------------------------");
        System.out.println("Haraagaaga hadda waa: $500.00");
        System.out.println("--------------------------------");
    }


    public static void kaarkaHadalka() {
        while (true) {
            System.out.println("\n--------------------------------");
            System.out.println("Kaarka hadalka");
            System.out.println("1. Ku Shubo Airtime");
            System.out.println("2. Ugu Shub Airtime");
            System.out.println("3. Data Bundle Subscriptions");
            System.out.println("00. Noqo");
            System.out.println("0. KaBax");
            System.out.print("\nFadlan dooro: ");

            String airtimeChoice = scanner.nextLine();

            if (airtimeChoice.equals("1") || airtimeChoice.equals("2") || airtimeChoice.equals("3")) {

                double lacagta = 0;
                while (true) {
                    System.out.print("\nFadlan Geli lacagta: $");
                    String input = scanner.nextLine();
                    try {
                        lacagta = Double.parseDouble(input);
                        if (lacagta <= 0) {
                            System.out.println("Lacagtu waa inay ka badnaataa $0.");
                        } else {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(" Fadlan geli nambar sax ah (Xarfo lama oggola).");
                    }
                }

                System.out.println("Habsocodka kaarka hadalka oo u dhigma $" + lacagta + " waa lagu guulaystay.");
                break;
            } else if (airtimeChoice.equals("00")) {
                System.out.println("Waxaad ku laabanaysaa menu-gii hore...");
                break;
            } else if (airtimeChoice.equals("0")) {
                kaBax();
            } else {
                System.out.println("Dookh khaldan, fadlan isku day markale.");
            }
        }
    }

    public static void kaarkaInternet() {
        while (true) {
            System.out.println("\n--------------------------------");
            System.out.println("Kaarka Internet");
            System.out.println("1. Xirmo Maalinle ah");
            System.out.println("2. Xirmo Toddobaadle ah");
            System.out.println("3. Xirmo Bileed ah");
            System.out.println("00. Noqo");
            System.out.println("0. KaBax");
            System.out.print("\nDooro xirmada ad rabto: ");

            String internetChoice = scanner.nextLine();

            if (internetChoice.equals("1") || internetChoice.equals("2") || internetChoice.equals("3")) {
                System.out.println("\nXirmada internet-ka waa kuu firfircoon tahay. Mahadsanid!");
                break;
            } else if (internetChoice.equals("00")) {
                System.out.println("Waxaad ku laabanaysaa menu-gii hore...");
                break;
            } else if (internetChoice.equals("0")) {
                kaBax();
            } else {
                System.out.println("Dookh khaldan, fadlan isku day markale.");
            }
        }
    }

    public static void lacagDirid() {
        System.out.println("\n--------------------------------");

        String mobile1 = "";
        while (true) {
            System.out.print("Fadlan Geli Mobile-ka\n\n");
            mobile1 = scanner.nextLine();
            if (mobile1.matches("\\d+")) {
                break;
            } else {
                System.out.println("Khalad! Mobile-ku waa inuu nambar kaliya noqdaa.\n");
            }
        }

        String mobile2 = "";
        while (true) {
            System.out.print("\nFadlan Hubi Mobilka\n\n");
            mobile2 = scanner.nextLine();
            if (!mobile2.matches("\\d+")) {
                System.out.println("Khalad! Mobile-ku waa inuu nambar kaliya noqdaa.");
            } else if (!mobile1.equals(mobile2)) {
                System.out.println("Khalad! Laba doorku isku mid ma aha. Fadlan dib u tijaabi.");
            } else {
                break;
            }
        }

        double lacagta = 0;
        while (true) {
            System.out.print("\nFadlan Geli lacagta\n\n");
            String input = scanner.nextLine();
            try {
                lacagta = Double.parseDouble(input);
                if (lacagta <= 0) {
                    System.out.println("Lacagtu waa inay ka badnaataa $0.");
                } else if (lacagta > 500) {
                    System.out.println("Khalad! Haraagaagu kuma filna (Max: $500).");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Khalad! Fadlan geli nambar sax ah (Xarfo lama oggola).");
            }
        }

        System.out.println("\nAre you sure to transfer $" + lacagta + "(" + mobile2 + "), Charges: $0 ?");
        System.out.println("1. Yes");
        System.out.println("2. No\n");
        String confirm = scanner.nextLine();

        if (confirm.equals("1")) {
            System.out.println("\nLacagta waa la diray. Mahadsanid!");
        } else {
            System.out.println("\nWaad baajisay lacag dirista.");
        }
        System.out.println("--------------------------------");
    }

    public static void bixiBiil() {
        while (true) {
            System.out.println("\n--------------------------------");
            System.out.println("Bixi Biil");
            System.out.println("1. Ku libso");
            System.out.println("00. Noqo");
            System.out.println("0. KaBax");
            System.out.print("\nDooro dookhaaga: ");

            String billChoice = scanner.nextLine();

            if (billChoice.equals("1")) {

                String billId = "";
                while (true) {
                    System.out.print("\nFadlan Geli Aqoonsiga Biilka: ");
                    billId = scanner.nextLine();
                    if (billId.matches("\\d+")) {
                        break;
                    } else {
                        System.out.println("Khalad! Aqoonsiga biilka waa inuu nambar kaliya noqdaa.");
                    }
                }

                System.out.println("Biilka 'Ku libso' ee nambarkiisu yahay (" + billId + ") waa la bixiyay.");
                break;
            } else if (billChoice.equals("00")) {
                System.out.println("Waxaad ku laabanaysaa menu-gii hore...");
                break;
            } else if (billChoice.equals("0")) {
                kaBax();
            } else {
                System.out.println("Dookh khaldan, fadlan isku day markale.");
            }
        }
    }


    public static void warbixinKooban() {
        while (true) {
            System.out.println("\n===== Warbixin Kooban =====");
            System.out.println("1. Last Action");
            System.out.println("2. Wareejintii u dambeysay");
            System.out.println("3. libsashadii u dambeysay");
            System.out.println("4. Last 3 Actions");
            System.out.println("0. Noqo");
            System.out.println("00. Ka Bax");
            System.out.print("Fadlan dooro: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("\nLast Action:");
                System.out.println("Waxaad u wareejisay $20 Ali.");
            } else if (choice.equals("2")) {
                System.out.println("\n[Wareejintii u dambeysay]: Waxaad $15 u dirtay hooyo.");
            } else if (choice.equals("3")) {
                System.out.println("\n[Libsashadii u dambeysay]: Waxaad ku iibsatay $5 xidmo internet ah.");
            } else if (choice.equals("4")) {
                System.out.println("\nLast 3 Actions:");
                System.out.println("- Waxaad u wareejisay $20 Ali.");
                System.out.println("- Waxaad $15 u dirtay hooyo.");
                System.out.println("- Waxaad iibsatay $5 xidmo internet ah.");
            } else if (choice.equals("0")) {
                System.out.println("Waxaad ku laabanaysaa menu-gii hore...");
                break;
            } else if (choice.equals("00")) {
                kaBax();
            } else {
                System.out.println("Dookh khaldan, fadlan isku day markale.");
            }
        }
    }


    public static void banks() {

        System.out.println("1. Salaam Somali Bank");
        System.out.println("2. Premier Bank");
        System.out.print("Dooro Bangiga: ");
        scanner.nextLine();
        System.out.println("Isku xirka bangiga waa diyaar.");

    }


    public static void taaj() {
        while (true) {
            System.out.println("TAAJ");
            System.out.println("1. Dibadda");
            System.out.println("2. Ogoow Khidmada");
            System.out.println("00. Noqo");
            System.out.println("0. KaBax");
            System.out.print("\nFadlan dooro: ");

            String taajChoice = scanner.nextLine();

            if (taajChoice.equals("1")) {
                System.out.print("\nGeli Magaca Qaataha Dibadda: ");
                scanner.nextLine();


                double lacagta = 0;
                while (true) {
                    System.out.print("Geli Lacagta ($): ");
                    String input = scanner.nextLine();
                    try {
                        lacagta = Double.parseDouble(input);
                        if (lacagta <= 0) {
                            System.out.println("Lacagtu waa inay ka badnaataa $0.");
                        } else {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Khalad! Fadlan geli nambar sax ah.");
                    }
                }
                System.out.println("Xawaaladda TAAJ ee Dibadda oo ah $" + lacagta + " waa la hambeeyay.");
                break;
            } else if (taajChoice.equals("2")) {
                System.out.println("\nKhidmada TAAJ waa $0.50 halkii $100 kasta.");
                break;
            } else if (taajChoice.equals("00")) {
                System.out.println("Waxaad ku laabanaysaa menu-gii hore...");
                break;
            } else if (taajChoice.equals("0")) {
                kaBax();
            } else {
                System.out.println("Dookh khaldan, fadlan isku day markale.");
            }
        }
    }


    public static void maareynta() {
        while (true) {
            System.out.println("Maareynta");
            System.out.println("1. Beddel lambarka sirta ah");
            System.out.println("2. Beddel Luqadda");
            System.out.println("3. Wargelin Mobile Lumay");
            System.out.println("4. Lacag Xirasho");
            System.out.println("5. U celi lacag qaldantay");
            System.out.println("00. Noqo");
            System.out.println("0. KaBax");
            System.out.print("\nFadlan dooro: ");

            String manageChoice = scanner.nextLine();

            if (manageChoice.equals("1")) {


                while (true) {
                    System.out.print("\nGeli PIN-kaaga cuzub: ");
                    String pin = scanner.nextLine();
                    if (pin.matches("\\d{4}")) {
                        break;
                    } else {
                        System.out.println("PIN-ku waa inuu fod ogaadaa 4 nambar oo kaliya.");
                    }
                }
                System.out.println("PIN-kaaga si guul leh ayaa loo beddelay.");
                break;
            } else if (manageChoice.equals("2")) {
                System.out.println("\n1. Somali\n2. English");
                System.out.print("Dooro luqadda: ");
                scanner.nextLine();
                System.out.println("Luqadda barnaamijka waa la beddelay.");
                break;
            } else if (manageChoice.equals("3")) {

                String phone = "";
                while (true) {
                    System.out.print("\nGeli mobile-ka lumay: ");
                    phone = scanner.nextLine();
                    if (phone.matches("\\d+")) {
                        break;
                    } else {
                        System.out.println("Khalad! Fadlan geli nambar taleefon oo sax ah.");
                    }
                }
                System.out.println("Wargelinta mobile-ka lumay ee (" + phone + ") waa la diiwangeliyay.");
                break;
            } else if (manageChoice.equals("4")) {
                System.out.println("\nAkoonkaaga si ku-meel-gaar ah ayaa loo xiray.");
                break;
            } else if (manageChoice.equals("5")) {


                String txnId = "";
                while (true) {
                    System.out.print("\nGeli ID-ga fariinta (TxnID): ");
                    txnId = scanner.nextLine();
                    if (txnId.matches("\\d+")) {
                        break;
                    } else {
                        System.out.println("Khalad! TxnID-gu waa inuu nambar kaliya noqdaa.");
                    }
                }
                System.out.println("Codsigaaga celinta lacagta qaldantay ee TxnID (" + txnId + ") waa la gudbiyay.");
                break;
            } else if (manageChoice.equals("00")) {
                System.out.println("Waxaad ku laabanaysaa menu-gii hore...");
                break;
            } else if (manageChoice.equals("0")) {
                kaBax();
            } else {
                System.out.println("Dookh khaldan, fadlan isku day markale.");
            }
        }
    }


    public static void kaBax() {
        System.out.println("Thank you, Goodbye!.");
        System.exit(0);
    }
}