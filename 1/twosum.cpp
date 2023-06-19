#include <iostream>
int main(){
  std::cout << "enter the number\n";
    int target;
    std::cin >> target;
  int arr[10]={1,2,3,4,5,6,7,8,9,10};
  for(int i=0;i<=9;i++)
  {
    int find=target-arr[i];
    //std::cout << arr[i] << "\n";
    //printf("%d",arr[i]);
    printf("%d",target-arr[i]);
    for(int j=0;j<=9;j++)
    {
      if (find==arr[j]) {
        std::cout << find << "," << arr[i] << std::endl;
      } 
    }
}
}
