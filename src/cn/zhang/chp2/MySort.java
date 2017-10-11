package cn.zhang.chp2;

public class MySort {
    public static void main(String args[]){
        int arr[]={1,5,3,2,4};
        //mySort(arr);
        //ChanceSort(arr);
        insertSort(arr);
        System.out.println(arr[4]);
        System.out.println(arr.length);
    }

    /**
     * 算法思路
     * 先依次相邻的数比较,把最大的数放到最后
     * @param array
     */
    public static void mySort(int array[]){
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    /**
                     * 如果前面的数字比后面的大
                     * 交换位置
                     */
                    int temp;
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    /**
     * 选择排序的思路
     * 1. 先找出一组数据中最小的数,放到第一位(与左边的第一个元素交换)
     * 2. 然后从第二位开始查找最小的数,放到第一位的后面(左边的第二个元素),依次进行
     * @param array
     */
    public static void ChanceSort(int array[]){
        int min;
        int temp;
        //外循环,表明要整体要进行的次数
        for (int i=0;i<array.length-1;i++){
            min=i;
            //内循环,找出最小的数
            for (int j=i+1;j<array.length;j++){
                if (array[min]>array[j]){
                    min=j;
                }
            }
            if (min>i) {
                //将最小的数和左边的第一个元素交换位置
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    /**
     * 算法思路
     *   首先假设第一个元素被放置在正确的位置上，这样仅需从1-n-1范围内对剩余元素进行排序。对于每次遍历，从0-i-1范围内的元素已经被排好序，
         每次遍历的任务是：通过扫描前面已排序的子列表，将位置i处的元素定位到从0到i的子列表之内的正确的位置上。
         将arr[i]复制为一个名为target的临时元素。
         向下扫描列表，比较这个目标值target与arr[i-1]、arr[i-2]的大小，依次类推。
         这个比较过程在小于或等于目标值的第一个元素(arr[j])处停止，或者在列表开始处停止（j=0）。
         在arr[i]小于前面任何已排序元素时，后一个条件（j=0）为真，
         因此，这个元素会占用新排序子列表的第一个位置。
         在扫描期间，大于目标值target的每个元素都会向右滑动一个位置（arr[j]=arr[j-1]）。
         一旦确定了正确位置j，
         目标值target（即原始的arr[i]）就会被复制到这个位置。
         与选择排序不同的是，插入排序将数据向右滑动，并且不会执行交换。
     *   抽出一个元素,在前面的元素中的适当位置插入
     * @param array
     */
    public static void insertSort(int array[]){
        int i,j;
        int n=array.length;
        int target;
        //相当于假设第一个元素被放到正确的位置上,从第二个元素进行插入排序
        for (i=1;i<n;i++){
            j=i;
            //相当于要插入的元素(数组中的第二个元素)
            target=array[i];
            //将比前面小的数插入到合适的位置(选择插入的位置)
            while (j > 0 && target < array[j - 1])
            {   //相当于往左边移动一下
                array[j] = array[j - 1];
                j--;
            }
            //把数插入进去
            array[j] = target;
        }
        }
    }

