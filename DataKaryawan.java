class DoubleLinkedArr
{
    DoubleLinkedArr next;
    DoubleLinkedArr prev;
    String nomor;
    String nama;
    String alamat;

    public DoubleLinkedArr(String no, String na, String al, DoubleLinkedArr b, DoubleLinkedArr c)
    {
        nomor = no;
        nama = na;
        alamat = al;
        next=b;
        prev=c;
    }
}
class DataKaryawan
{
    static  DoubleLinkedArr head;
    static  DoubleLinkedArr tail;
    static  DoubleLinkedArr current;
    static int list;

    public DataKaryawan()
    {
        head=null;
        tail=null;
    }

    public boolean isempty()
    {
        return head==null&&tail==null;
    }
    public  void inserthead(String a, String b, String c)
    {
        if(isempty())
        {
            DoubleLinkedArr dll = new DoubleLinkedArr(a,b,c,null,null);
            head=dll;
            tail=dll;
            System.out.println("data dimasukkan ke DLL");
            list++;
        }else
        {
            current=head;
            DoubleLinkedArr temp=new DoubleLinkedArr(a,b,c,current, null);
            current.prev=temp;
            head=temp;
            System.out.println("data dimasukkan dibagian head");
            list++;
        }
    }
    public void deletehead()
    {
        if(isempty())
            System.out.println("No Node To Delete");
        else
        {
            DoubleLinkedArr temp=head;
            current=head;
            head = temp.next;
            current.next.prev=current.prev;
            current.next=current.prev;
            System.out.println("Data "+temp.nomor+" dkk dihapus dari Linked List");
            list--;
        }
    }
    public void display()
    {
        DoubleLinkedArr temp=head;
        System.out.println("Isi double Linked List dengan display forward : ");
        while(temp!=null)
        {
            System.out.print("("+temp.nomor+"|"+temp.nama+"|"+temp.alamat+")");
            temp=temp.next;
            if(temp!=null) System.out.print(" ~> ");
        }
        System.out.println("");
        System.out.println("Jumlah elemen double Linked List "+list);
    }

    public static void main(String[] args) {
        DataKaryawan a=new DataKaryawan();
        a.inserthead("233","Muhammad","Bengkalis");
        a.inserthead("322","Azmi","Bengkalis");
        a.display();
        a.deletehead();
        a.display();
    }
}
