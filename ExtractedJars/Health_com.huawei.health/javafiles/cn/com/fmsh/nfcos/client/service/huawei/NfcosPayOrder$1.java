// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			NfcosPayOrder

class NfcosPayOrder$1
	implements android.os.or
{

	public NfcosPayOrder createFromParcel(Parcel parcel)
	{
		NfcosPayOrder nfcospayorder = new NfcosPayOrder();
	//    0    0:new             #9   <Class NfcosPayOrder>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void NfcosPayOrder()>
	//    3    7:astore_2        
		nfcospayorder.state = parcel.readInt();
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method int Parcel.readInt()>
	//    7   13:putfield        #27  <Field int NfcosPayOrder.state>
		nfcospayorder.id = NfcosPayOrder.readBytesWithNull(parcel);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokestatic    #31  <Method byte[] NfcosPayOrder.readBytesWithNull(Parcel)>
	//   11   21:putfield        #35  <Field byte[] NfcosPayOrder.id>
		nfcospayorder.date = parcel.readString();
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #39  <Method String Parcel.readString()>
	//   15   29:putfield        #43  <Field String NfcosPayOrder.date>
		nfcospayorder.time = parcel.readString();
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #39  <Method String Parcel.readString()>
	//   19   37:putfield        #46  <Field String NfcosPayOrder.time>
		nfcospayorder.amount = parcel.readInt();
	//   20   40:aload_2         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #23  <Method int Parcel.readInt()>
	//   23   45:putfield        #49  <Field int NfcosPayOrder.amount>
		nfcospayorder.thirdPayInfo = parcel.readString();
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #39  <Method String Parcel.readString()>
	//   27   53:putfield        #52  <Field String NfcosPayOrder.thirdPayInfo>
		nfcospayorder.channel = parcel.readInt();
	//   28   56:aload_2         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #23  <Method int Parcel.readInt()>
	//   31   61:putfield        #55  <Field int NfcosPayOrder.channel>
		nfcospayorder.mainOrder = NfcosPayOrder.readBytesWithNull(parcel);
	//   32   64:aload_2         
	//   33   65:aload_1         
	//   34   66:invokestatic    #31  <Method byte[] NfcosPayOrder.readBytesWithNull(Parcel)>
	//   35   69:putfield        #58  <Field byte[] NfcosPayOrder.mainOrder>
		return nfcospayorder;
	//   36   72:aload_2         
	//   37   73:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #61  <Method NfcosPayOrder createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public NfcosPayOrder[] newArray(int i)
	{
		return new NfcosPayOrder[i];
	//    0    0:iload_1         
	//    1    1:anewarray       NfcosPayOrder[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #66  <Method NfcosPayOrder[] newArray(int)>
	//    3    5:areturn         
	}

	NfcosPayOrder$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
