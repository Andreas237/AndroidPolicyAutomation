// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			NfcosBusinessOrder, NfcosPayOrder

public class NfcosMainOrder
	implements Parcelable
{

	public NfcosMainOrder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	static byte[] readBytesWithNull(Parcel parcel)
	{
		int i = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method int Parcel.readInt()>
	//    2    4:istore_1        
		byte abyte0[] = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		if(i >= 0)
	//*   5    7:iload_1         
	//*   6    8:iflt            20
		{
			abyte0 = new byte[i];
	//    7   11:iload_1         
	//    8   12:newarray        byte[]
	//    9   14:astore_2        
			parcel.readByteArray(abyte0);
	//   10   15:aload_0         
	//   11   16:aload_2         
	//   12   17:invokevirtual   #45  <Method void Parcel.readByteArray(byte[])>
		}
		return abyte0;
	//   13   20:aload_2         
	//   14   21:areturn         
	}

	static void writeBytesWithNull(Parcel parcel, byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			parcel.writeInt(-1);
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			return;
	//    5    9:return          
		} else
		{
			parcel.writeInt(abyte0.length);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:invokevirtual   #51  <Method void Parcel.writeInt(int)>
			parcel.writeByteArray(abyte0);
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #54  <Method void Parcel.writeByteArray(byte[])>
			return;
	//   13   21:return          
		}
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void readFromParcel(Parcel parcel)
	{
		state = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #41  <Method int Parcel.readInt()>
	//    3    5:putfield        #59  <Field int state>
		id = readBytesWithNull(parcel);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #61  <Method byte[] readBytesWithNull(Parcel)>
	//    7   13:putfield        #63  <Field byte[] id>
		date = parcel.readString();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #67  <Method String Parcel.readString()>
	//   11   21:putfield        #69  <Field String date>
		time = parcel.readString();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #67  <Method String Parcel.readString()>
	//   15   29:putfield        #71  <Field String time>
		amount = parcel.readInt();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #41  <Method int Parcel.readInt()>
	//   19   37:putfield        #73  <Field int amount>
		businessOrders = ((List) (new ArrayList()));
	//   20   40:aload_0         
	//   21   41:new             #75  <Class ArrayList>
	//   22   44:dup             
	//   23   45:invokespecial   #76  <Method void ArrayList()>
	//   24   48:putfield        #78  <Field List businessOrders>
		parcel.readList(businessOrders, ((Class) (cn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder)).getClassLoader());
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:getfield        #78  <Field List businessOrders>
	//   28   56:ldc1            #80  <Class NfcosBusinessOrder>
	//   29   58:invokevirtual   #86  <Method ClassLoader Class.getClassLoader()>
	//   30   61:invokevirtual   #90  <Method void Parcel.readList(List, ClassLoader)>
		payOrders = ((List) (new ArrayList()));
	//   31   64:aload_0         
	//   32   65:new             #75  <Class ArrayList>
	//   33   68:dup             
	//   34   69:invokespecial   #76  <Method void ArrayList()>
	//   35   72:putfield        #92  <Field List payOrders>
		parcel.readList(payOrders, ((Class) (cn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder)).getClassLoader());
	//   36   75:aload_1         
	//   37   76:aload_0         
	//   38   77:getfield        #92  <Field List payOrders>
	//   39   80:ldc1            #94  <Class NfcosPayOrder>
	//   40   82:invokevirtual   #86  <Method ClassLoader Class.getClassLoader()>
	//   41   85:invokevirtual   #90  <Method void Parcel.readList(List, ClassLoader)>
	//   42   88:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(state);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field int state>
	//    3    5:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		writeBytesWithNull(parcel, id);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field byte[] id>
	//    7   13:invokestatic    #98  <Method void writeBytesWithNull(Parcel, byte[])>
		parcel.writeString(date);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #69  <Field String date>
	//   11   21:invokevirtual   #102 <Method void Parcel.writeString(String)>
		parcel.writeString(time);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #71  <Field String time>
	//   15   29:invokevirtual   #102 <Method void Parcel.writeString(String)>
		parcel.writeInt(amount);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #73  <Field int amount>
	//   19   37:invokevirtual   #51  <Method void Parcel.writeInt(int)>
		parcel.writeList(businessOrders);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #78  <Field List businessOrders>
	//   23   45:invokevirtual   #106 <Method void Parcel.writeList(List)>
		parcel.writeList(payOrders);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #92  <Field List payOrders>
	//   27   53:invokevirtual   #106 <Method void Parcel.writeList(List)>
	//   28   56:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

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
			nfcosmainorder.businessOrders = ((List) (new ArrayList()));
		//   24   48:aload_2         
		//   25   49:new             #51  <Class ArrayList>
		//   26   52:dup             
		//   27   53:invokespecial   #52  <Method void ArrayList()>
		//   28   56:putfield        #56  <Field List NfcosMainOrder.businessOrders>
			parcel.readList(nfcosmainorder.businessOrders, ((Class) (cn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder)).getClassLoader());
		//   29   59:aload_1         
		//   30   60:aload_2         
		//   31   61:getfield        #56  <Field List NfcosMainOrder.businessOrders>
		//   32   64:ldc1            #58  <Class NfcosBusinessOrder>
		//   33   66:invokevirtual   #64  <Method ClassLoader Class.getClassLoader()>
		//   34   69:invokevirtual   #68  <Method void Parcel.readList(List, ClassLoader)>
			nfcosmainorder.payOrders = ((List) (new ArrayList()));
		//   35   72:aload_2         
		//   36   73:new             #51  <Class ArrayList>
		//   37   76:dup             
		//   38   77:invokespecial   #52  <Method void ArrayList()>
		//   39   80:putfield        #71  <Field List NfcosMainOrder.payOrders>
			parcel.readList(nfcosmainorder.payOrders, ((Class) (cn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder)).getClassLoader());
		//   40   83:aload_1         
		//   41   84:aload_2         
		//   42   85:getfield        #71  <Field List NfcosMainOrder.payOrders>
		//   43   88:ldc1            #73  <Class NfcosPayOrder>
		//   44   90:invokevirtual   #64  <Method ClassLoader Class.getClassLoader()>
		//   45   93:invokevirtual   #68  <Method void Parcel.readList(List, ClassLoader)>
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

	}
;
	public int amount;
	public List businessOrders;
	public String date;
	public byte id[];
	public List payOrders;
	public int state;
	public String time;

	static 
	{
	//    0    0:new             #8   <Class NfcosMainOrder$1>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void NfcosMainOrder$1()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
