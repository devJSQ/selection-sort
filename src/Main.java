import java.util.Arrays;
public class Main {
  public static int [] SelectionSort(int [] numbers){
    int n = numbers.length;
    for (int i = 0; i < n - 1; i++){
      int val = i;

      for (int j = i + 1; j < n; j++){
        if(numbers[j] < numbers[val]){
          val = j;
        }
      }
      int temp = numbers[val];
      numbers[val] = numbers[i];
      numbers[i] = temp;
      
    }
    return numbers;


  }

 public static void main(String[] args){
  int [] numbers = {90,70,10,1,0,30};
  System.out.println(Arrays.toString(numbers));
  SelectionSort(numbers);
  System.out.println(Arrays.toString(numbers));
  }
}

