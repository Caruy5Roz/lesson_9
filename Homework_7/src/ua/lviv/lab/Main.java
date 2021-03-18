package ua.lviv.lab;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		Months [] monthMas = Months.values();
		Seasons [] seasonMas = Seasons.values();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
            menu();

            switch (scan.next()) {
                case "1": {
                    System.out.println("¬пиш≥ть назву м≥с€ц€: ");
                    scan = new Scanner(System.in);
                    String month = scan.next().toUpperCase();

                    boolean flag = false;

                    flag = isMonthExist(monthMas, month, flag);

                    if (!flag) {
                        System.out.println("ЌемаЇ такого м≥с€ц€");
                    }
                    break;
                }
                
                case "2": {
                    System.out.println("¬пиш≥ть назву пори року: ");
                    scan = new Scanner(System.in);
                    String seasonSc = scan.next().toUpperCase();
                    
                    boolean flag = false;

                    for (Months m: monthMas) {
            			
            			if (m.getSeason().name().equals(seasonSc)) {
            				flag = true;
            			}
            		}
                    
                    if(flag) {
                    	Seasons sea = Seasons.valueOf(seasonSc);
                    	
                    	for(Months mon: monthMas) {
                    		if(mon.getSeason().toString().equalsIgnoreCase(seasonSc)) {
                    			System.out.println(mon);
                    		}
                    	}
                    }

                    if (!flag) {
                        System.out.println("ЌемаЇ такого сезону");
                    }
                    break;
                } 
                
                case "3": {
                    
                	System.out.println("¬пиш≥ть к≥льк≥сть дн≥в у м≥с€ц≥: ");
                	scan = new Scanner(System.in);
                	int mon = scan.nextInt();
                	
                	boolean flag = false;
                	
                	for (Months m : monthMas) {
                		if (m.getDays() == mon) {
                			System.out.println(m);
                			flag = true;
                		}
                		}
                	if (!flag) {
                		System.out.println("ЌемаЇ такого м≥с€ц€");
                	}
                	break;
                	
                    }
                
                case "4": {
                	
                	System.out.println("¬пиш≥ть к≥льк≥сть дн≥в у м≥с€ц≥: ");
                	scan = new Scanner(System.in);
                    int mo = scan.nextInt();

                    boolean flag = false;
                    
                    for (Months m : monthMas) {
                    	if (m.getDays() < mo) {
                    		System.out.println(m);
                    		flag = true;
                    	}
                    }
                    
                    if (!flag) {
                        System.out.println("ЌемаЇ такого м≥с€ц€");
                    }
                    break;
                    
                }
                
                case "5": {
                	
                	System.out.println("¬пиш≥ть к≥льк≥сть дн≥в у м≥с€ц≥: ");
                	scan = new Scanner(System.in);
                    int md = scan.nextInt();

                    boolean flag = false;
                    
                    for (Months m : monthMas) {
                    	if (m.getDays() > md) {
                    		System.out.println(m);
                    		flag = true;
                    	}
                    }
                    
                    if (!flag) {
                        System.out.println("ЌемаЇ такого м≥с€ц€");
                    }
                    break;
                    
                }
                
                case "6": {
                	
                	System.out.println("¬пиш≥ть назву пори року: ");
                	scan = new Scanner(System.in);
                    String seasonSc = scan.next().toUpperCase();
                    
                    boolean flag = false;
                    
                    for (Seasons s : seasonMas) {
                    	if (s.name().equals(seasonSc)) {
                    		flag = true;
                    	}
                    }
                    if(flag) {
                    	Seasons scan2 = Seasons.valueOf(seasonSc);
                    	int ordinal = scan2.ordinal();
                    	
                    	if(ordinal == seasonMas.length -1) {
                            ordinal = 0;
                            System.out.println(seasonMas [ordinal]);
                        }else {
                            System.out.println(seasonMas[ordinal+1]);
                        }
                    }
                    
                    if (!flag) {
                    	System.out.println("ЌемаЇ такоњ пори року");
                    }
                    break;
                    
                }
                
                case "7": {
                	
                	System.out.println("¬пиш≥ть назву пори року: ");
                	scan = new Scanner(System.in);
                    String seasonSc = scan.next().toUpperCase();
                    
                    boolean flag = false;
                    
                    for (Seasons s : seasonMas) {
                    	if (s.name().equals(seasonSc)) {
                    		flag = true;
                    	}
                    }
                    if(flag) {
                    	Seasons scan2 = Seasons.valueOf(seasonSc);
                    	int ordinal = scan2.ordinal();
                    	
                    	if(ordinal == seasonMas.length -1) {
                            ordinal = 0;
                            System.out.println(seasonMas [ordinal]);
                        }else {
                            System.out.println(seasonMas[ordinal-1]);
                        }
                    }
                    
                    if (!flag) {
                    	System.out.println("ЌемаЇ такоњ пори року");
                    }
                    break;
                }
                
                case "8": {
                	
                	System.out.println("¬пиш≥ть парну к≥льк≥сть дн≥в в м≥с€ц≥: ");
                	scan = new Scanner(System.in);
                	int mb = scan.nextInt();
                	
                	boolean flag = false;
                	
                	for (Months m : monthMas) {
                		if(m.getDays() % 2 == 0) {
                			System.out.println(m);
                			flag = true;
                		}
                	}
                	if (!flag) {
                		System.out.println("ЌемаЇ такого м≥с€ц€");
                	}
                	break;
                }
                
                case "9": {
                	
                	System.out.println("¬пиш≥ть непарну к≥льк≥сть дн≥в в м≥с€ц≥: ");
                	scan = new Scanner(System.in);
                	int mob = scan.nextInt();
                	
                	boolean flag = false;
                	
                	for (Months m : monthMas) {
                		if(m.getDays() % 2 == 1) {
                			System.out.println(m);
                			flag = true;
                		}
                	}
                	if (!flag) {
                		System.out.println("ЌемаЇ такого м≥с€ц€");
                	}
                	break;
                }
                
                case "10": {
                	
                	System.out.println("¬пиш≥ть назву м≥с€ц€: ");
                	scan = new Scanner(System.in);
                	String scs = scan.next().toUpperCase();
                	
                	boolean flag = false;
                	
                	for (Months m : monthMas) {
                		if (m.name().equalsIgnoreCase(scs)) {
                			if(m.getDays() % 2 == 0) {
                				System.out.println("ћ≥с€ць " + m + " маЇ парну к≥льк≥сть дн≥в");
                				System.out.println();
                				flag = true;
                			}else {
                				System.out.println("ћ≥с€ць " + m + " маЇ непарну к≥льк≥сть дн≥в");
                				System.out.println();
                				flag = true;
                			}
                		}
                	}
                	if (!flag) {
                		System.out.println("ЌемаЇ такого м≥с€ц€");
                		System.out.println();
                	}
                	break;
                }
            } 
      }
 }
	
   private static void menu() {
	    System.out.println(" 1 ѕерев≥рка чи ≥снуЇ такий м≥с€ць: ");
		System.out.println(" 2 ¬ивести вс≥ м≥с€ц≥ з такою ж порою року: ");
		System.out.println(" 3 ¬ивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в: ");
		System.out.println(" 4 ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в: ");
		System.out.println(" 5 ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в: ");
		System.out.println(" 6 ¬ивести на екран наступну пору року: ");
		System.out.println(" 7 ¬ивести на екран попередню пору року: ");
		System.out.println(" 8 ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в: ");
		System.out.println(" 9 ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в: ");
		System.out.println(" 10 ¬ивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в: ");
}

   private static boolean isMonthExist(Months[] mas, String month, boolean flag) {
		
		for (Months m: mas) {
			
			if (m.name().equals(month)) {
				System.out.println("“акий м≥с€ць ≥снуЇ");
				flag = true;
			}
		}
		return flag;
	}
}
