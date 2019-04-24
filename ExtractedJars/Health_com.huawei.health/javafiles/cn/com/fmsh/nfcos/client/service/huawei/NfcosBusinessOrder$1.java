// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			NfcosBusinessOrder

class NfcosBusinessOrder$1
	implements android.os.Parcelable.Creator
{

	public NfcosBusinessOrder createFromParcel(Parcel parcel)
	{
		NfcosBusinessOrder nfcosbusinessorder = new NfcosBusinessOrder();
	//    0    0:new             #9   <Class NfcosBusinessOrder>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void NfcosBusinessOrder()>
	//    3    7:astore_2        
		nfcosbusinessorder.tradeDate = parcel.readString();
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method String Parcel.readString()>
	//    7   13:putfield        #27  <Field String NfcosBusinessOrder.tradeDate>
		nfcosbusinessorder.tradeTime = parcel.readString();
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #23  <Method String Parcel.readString()>
	//   11   21:putfield        #30  <Field String NfcosBusinessOrder.tradeTime>
		nfcosbusinessorder.order = NfcosBusinessOrder.readBytesWithNull(parcel);
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokestatic    #34  <Method byte[] NfcosBusinessOrder.readBytesWithNull(Parcel)>
	//   15   29:putfield        #38  <Field byte[] NfcosBusinessOrder.order>
		nfcosbusinessorder.amount = parcel.readInt();
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #42  <Method int Parcel.readInt()>
	//   19   37:putfield        #46  <Field int NfcosBusinessOrder.amount>
		nfcosbusinessorder.faceNo = parcel.readString();
	//   20   40:aload_2         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #23  <Method String Parcel.readString()>
	//   23   45:putfield        #49  <Field String NfcosBusinessOrder.faceNo>
		nfcosbusinessorder.tradeState = parcel.readInt();
	//   24   48:aload_2         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #42  <Method int Parcel.readInt()>
	//   27   53:putfield        #52  <Field int NfcosBusinessOrder.tradeState>
		nfcosbusinessorder.invoiceStatus = parcel.readInt();
	//   28   56:aload_2         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #42  <Method int Parcel.readInt()>
	//   31   61:putfield        #55  <Field int NfcosBusinessOrder.invoiceStatus>
		nfcosbusinessorder.cardIoType = parcel.readInt();
	//   32   64:aload_2         
	//   33   65:aload_1         
	//   34   66:invokevirtual   #42  <Method int Parcel.readInt()>
	//   35   69:putfield        #58  <Field int NfcosBusinessOrder.cardIoType>
		nfcosbusinessorder.businessOrderType = parcel.readInt();
	//   36   72:aload_2         
	//   37   73:aload_1         
	//   38   74:invokevirtual   #42  <Method int Parcel.readInt()>
	//   39   77:putfield        #61  <Field int NfcosBusinessOrder.businessOrderType>
		nfcosbusinessorder.product = parcel.readString();
	//   40   80:aload_2         
	//   41   81:aload_1         
	//   42   82:invokevirtual   #23  <Method String Parcel.readString()>
	//   43   85:putfield        #64  <Field String NfcosBusinessOrder.product>
		nfcosbusinessorder.seid = NfcosBusinessOrder.readBytesWithNull(parcel);
	//   44   88:aload_2         
	//   45   89:aload_1         
	//   46   90:invokestatic    #34  <Method byte[] NfcosBusinessOrder.readBytesWithNull(Parcel)>
	//   47   93:putfield        #67  <Field byte[] NfcosBusinessOrder.seid>
		nfcosbusinessorder.deviceModel = parcel.readString();
	//   48   96:aload_2         
	//   49   97:aload_1         
	//   50   98:invokevirtual   #23  <Method String Parcel.readString()>
	//   51  101:putfield        #70  <Field String NfcosBusinessOrder.deviceModel>
		nfcosbusinessorder.mainOrder = NfcosBusinessOrder.readBytesWithNull(parcel);
	//   52  104:aload_2         
	//   53  105:aload_1         
	//   54  106:invokestatic    #34  <Method byte[] NfcosBusinessOrder.readBytesWithNull(Parcel)>
	//   55  109:putfield        #73  <Field byte[] NfcosBusinessOrder.mainOrder>
		return nfcosbusinessorder;
	//   56  112:aload_2         
	//   57  113:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #76  <Method NfcosBusinessOrder createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public NfcosBusinessOrder[] newArray(int i)
	{
		return new NfcosBusinessOrder[i];
	//    0    0:iload_1         
	//    1    1:anewarray       NfcosBusinessOrder[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #81  <Method NfcosBusinessOrder[] newArray(int)>
	//    3    5:areturn         
	}

	NfcosBusinessOrder$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
