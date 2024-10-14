public class TicketMachine {
  public static void main(String[] args) {
    
    Ticket ticket=new Ticket();
    ticket.setDestination("Agadir");
    ticket.setPrice(1105);
    ticket.setIsReturn(true);
    System.out.println(ticket.getDestination());
    System.out.println(ticket.getPrice());
    System.out.println(ticket.getIsReturn());


  }
}
