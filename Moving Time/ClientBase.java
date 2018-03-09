import java.util.Scanner;

class ClientBase{
	public static void op()
	{
		System.out.println("1.Add Client");
		System.out.println("2.Print All Residential Invoices");
		System.out.println("3.Print All Commercial Invoices");
		System.out.println("4.Print Accounts Receivable Report");
		System.out.println("5.Quit");

	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		int user_decision,type,re = 0,co = 0,coun =0;
		Residential robj[] = new Residential[52];

		Commercial cobj[] = new Commercial[52];

		do{
			op();

			user_decision = cin.nextInt();

			if(user_decision == 5){
				break;
			}
			else if(user_decision == 1){

				if(coun >= 52){
					System.out.println("List is Full");
				}

				else{

					do{
						System.out.println("Input 1 if Residential , Input 2 if Commercial");
						type = cin.nextInt();
					}while(type !=1 && type !=2);
						

					if(type == 1){
						robj[re] = new Residential();
						robj[re].setData();
						robj[re].costCal();

						coun++;
						re++;
					}

					if(type == 2){
						cobj[co] = new Commercial();
						cobj[co].setData();
						cobj[co].costCal();

						coun++;
						co++;
					}
				}
			}

			else if(user_decision == 2 && re>0){
				robj[re-1].display();
			}

			else if(user_decision == 3 && co>0){
				cobj[co-1].display();
			}

			else if(user_decision == 4){
				continue;
			}

			else{
				continue;
			}

			System.out.print("\n");
		}while(user_decision != 5);
	}
}