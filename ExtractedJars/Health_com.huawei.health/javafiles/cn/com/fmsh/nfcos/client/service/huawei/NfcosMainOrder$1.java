// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			NfcosMainOrder, NfcosBusinessOrder, NfcosPayOrder

class NfcosMainOrder$1
	implements android.os.r
{

	public NfcosMainOrder createFromParcel(Parcel parcel)
	{
		NfcosMainOrder nfcosmainorder = new NfcosMainOrder();
	//    0    0:new             #9   <Class NfcosMainOrder>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void NfcosMainOrder()>
	//    3    7:astore_2        
		nfcosmainorder.state = parcel.readInt();
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method int Parcel.readInt()>
	//    7   13:putfield        #27  <Field int NfcosMainOrder.state>
		nfcosmainorder.id = NfcosMainOrder.readBytesWithNull(parcel);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokestatic    #31  <Method byte[] NfcosMainOrder.readBytesWithNull(Parcel)>
	//   11   21:putfield        #35  <Field byte[] NfcosMainOrder.id>
		nfcosmainorder.date = parcel.readString();
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #39  <Method String Parcel.readString()>
	//   15   29:putfield        #43  <Field String NfcosMainOrder.date>
		nfcosmainorder.time = parcel.readString();
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #39  <Method String Parcel.readString()>
	//   19   37:putfield        #46  <Field String NfcosMainOrder.time>
		nfcosmainorder.amount = parcel.readInt();
	//   20   40:aload_2         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #23  <Method int Parcel.readInt()>
	//   23   45:putfield        #49  <Field int NfcosMainOrder.amount>
		nfcosmainorder.businessOrders = ((java.util.List) (new ArrayList()));
	//   24   48:aload_2         
	//   25   49:new             #51  <Class ArrayList>
	//   26   52:dup             
	//   27   53:invokespecial   #52  <Method void ArrayList()>
	//   28   56:putfield        #56  <Field java.util.List NfcosMainOrder.businessOrders>
		parcel.readList(nfcosmainorder.businessOrders, ((Class) (cn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder)).getClassLoader());
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:getfield        #56  <Field java.util.List NfcosMainOrder.businessOrders>
	//   32   64:ldc1            #58  <Class NfcosBusinessOrder>
	//   33   66:invokevirtual   #64  <Method ClassLoader Class.getClassLoader()>
	//   34   69:invokevirtual   #68  <Method void Parcel.readList(java.util.List, ClassLoader)>
		nfcosmainorder.payOrders = ((java.util.List) (new ArrayList()));
	//   35   72:aload_2         
	//   36   73:new             #51  <Class ArrayList>
	//   37   76:dup             
	//   38   77:invokespecial   #52  <Method void ArrayList()>
	//   39   80:putfield        #71  <Field java.util.List NfcosMainOrder.payOrders>
		parcel.readList(nfcosmainorder.payOrders, ((Class) (cn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder)).getClassLoader());
	//   40   83:aload_1         
	//   41   84:aload_2         
	//   42   85:getfield        #71  <Field java.util.List NfcosMainOrder.payOrders>
	//   43   88:ldc1            #73  <Class NfcosPayOrder>
	//   44   90:invokevirtual   #64  <Method ClassLoader Class.getClassLoader()>
	//   45   93:invokevirtual   #68  <Method void Parcel.readList(java.util.List, ClassLoader)>
		return nfcosmainorder;
	//   46   96:aload_2         
	//   47   97:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #76  <Method NfcosMainOrder createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public NfcosMainOrder[] newArray(int i)
	{
		return new NfcosMainOrder[i];
	//    0    0:iload_1         
	//    1    1:anewarray       NfcosMainOrder[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #81  <Method NfcosMainOrder[] newArray(int)>
	//    3    5:areturn         
	}

	NfcosMainOrder$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
