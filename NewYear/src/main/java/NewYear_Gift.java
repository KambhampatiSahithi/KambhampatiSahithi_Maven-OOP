
    public class NewYear_Gift extends Sweets implements Chocolate
    {
        public int chocolates_weight(int no_of_chocolates,int weight)
        {
            return (no_of_chocolates*weight);
        }
        public static void main(String[] args)
        {
            int [] chocolates_weight = new int [3]; //array to store weights of chocolates
            int gift_weight;

            //first gift
            Sweets burfi =new Sweets();
            Chocolate kitkat = new NewYear_Gift();
            chocolates_weight[0]=kitkat.chocolates_weight(30,3);
            gift_weight = chocolates_weight[0]+burfi.total_weight_sweets(10,6);
            System.out.println("Total weight of gift1 is:"+gift_weight);

            //second gift
            Sweets  laddu= new Sweets();
            Chocolate dairymilk = new NewYear_Gift();
            chocolates_weight[1]=dairymilk.chocolates_weight(20,6);
            gift_weight = chocolates_weight[0]+laddu.total_weight_sweets(10,5);
            System.out.println("Total weight of gift2 is:"+gift_weight);

            //third gift
            Sweets  rasjulla= new Sweets();
            Chocolate crunchie= new NewYear_Gift();
            chocolates_weight[2]=crunchie.chocolates_weight(25,6);
            gift_weight = chocolates_weight[0]+rasjulla.total_weight_sweets(15,3);
            System.out.println("Total weight of gift2 is:"+gift_weight);

            for(int i=0;i<chocolates_weight.length;i++)
            {
                for(int j=i+1;j<chocolates_weight.length;j++)
                {
                    if(chocolates_weight[i]>chocolates_weight[j])
                    {
                        int tmp = chocolates_weight[i];
                        chocolates_weight[i]=chocolates_weight[j];
                        chocolates_weight[j]=tmp;
                    }
                }
            }
            System.out.println("-----------------------\n-----------------------");
            System.out.println("Ascending order of chocolats in the gifts:");
            for(int i=0;i<chocolates_weight.length;i++)
            {
                System.out.println(chocolates_weight[i]);
            }
            System.out.println();
        }
    }

