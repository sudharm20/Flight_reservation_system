package com.codeWithSid.ims;

public class Main {

    public static void main(String[] args) {


            ticket regularTicket = new regularTicket("98989", "Nagpur",
                    "Pune", "DepartureDateTime", "ArrivalDateTime",
                    "9A", 2000, false, null, null, "lunch");

            ticket touristTicket = new touristTicket("99880", "London", "India",
                    "DepartureDateTime", "ArrivalDateTIme",
                    "12A", 40000, false, null, null,
                    "Novotel Hotel", new String[]{""});

            printTicketDetails(regularTicket);
            printTicketDetails(touristTicket);
        }

        public static void printTicketDetails(ticket ticket) {
            System.out.println(ticket.getPNRNumber());

    }
}
