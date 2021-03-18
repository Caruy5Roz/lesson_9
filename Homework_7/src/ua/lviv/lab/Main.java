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
                    System.out.println("������� ����� �����: ");
                    scan = new Scanner(System.in);
                    String month = scan.next().toUpperCase();

                    boolean flag = false;

                    flag = isMonthExist(monthMas, month, flag);

                    if (!flag) {
                        System.out.println("���� ������ �����");
                    }
                    break;
                }
                
                case "2": {
                    System.out.println("������� ����� ���� ����: ");
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
                        System.out.println("���� ������ ������");
                    }
                    break;
                } 
                
                case "3": {
                    
                	System.out.println("������� ������� ��� � �����: ");
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
                		System.out.println("���� ������ �����");
                	}
                	break;
                	
                    }
                
                case "4": {
                	
                	System.out.println("������� ������� ��� � �����: ");
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
                        System.out.println("���� ������ �����");
                    }
                    break;
                    
                }
                
                case "5": {
                	
                	System.out.println("������� ������� ��� � �����: ");
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
                        System.out.println("���� ������ �����");
                    }
                    break;
                    
                }
                
                case "6": {
                	
                	System.out.println("������� ����� ���� ����: ");
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
                    	System.out.println("���� ���� ���� ����");
                    }
                    break;
                    
                }
                
                case "7": {
                	
                	System.out.println("������� ����� ���� ����: ");
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
                    	System.out.println("���� ���� ���� ����");
                    }
                    break;
                }
                
                case "8": {
                	
                	System.out.println("������� ����� ������� ��� � �����: ");
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
                		System.out.println("���� ������ �����");
                	}
                	break;
                }
                
                case "9": {
                	
                	System.out.println("������� ������� ������� ��� � �����: ");
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
                		System.out.println("���� ������ �����");
                	}
                	break;
                }
                
                case "10": {
                	
                	System.out.println("������� ����� �����: ");
                	scan = new Scanner(System.in);
                	String scs = scan.next().toUpperCase();
                	
                	boolean flag = false;
                	
                	for (Months m : monthMas) {
                		if (m.name().equalsIgnoreCase(scs)) {
                			if(m.getDays() % 2 == 0) {
                				System.out.println("̳���� " + m + " �� ����� ������� ���");
                				System.out.println();
                				flag = true;
                			}else {
                				System.out.println("̳���� " + m + " �� ������� ������� ���");
                				System.out.println();
                				flag = true;
                			}
                		}
                	}
                	if (!flag) {
                		System.out.println("���� ������ �����");
                		System.out.println();
                	}
                	break;
                }
            } 
      }
 }
	
   private static void menu() {
	    System.out.println(" 1 �������� �� ���� ����� �����: ");
		System.out.println(" 2 ������� �� ����� � ����� � ����� ����: ");
		System.out.println(" 3 ������� �� ����� �� ����� ���� ���� ������� ���: ");
		System.out.println(" 4 ������� �� ����� �� ����� �� ����� ����� ������� ���: ");
		System.out.println(" 5 ������� �� ����� �� ����� �� ����� ����� ������� ���: ");
		System.out.println(" 6 ������� �� ����� �������� ���� ����: ");
		System.out.println(" 7 ������� �� ����� ��������� ���� ����: ");
		System.out.println(" 8 ������� �� ����� �� ����� �� ����� ����� ������� ���: ");
		System.out.println(" 9 ������� �� ����� �� ����� �� ����� ������� ������� ���: ");
		System.out.println(" 10 ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���: ");
}

   private static boolean isMonthExist(Months[] mas, String month, boolean flag) {
		
		for (Months m: mas) {
			
			if (m.name().equals(month)) {
				System.out.println("����� ����� ����");
				flag = true;
			}
		}
		return flag;
	}
}
