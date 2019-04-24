// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;
import android.os.Parcelable;

public class NfcosBusinessOrder
	implements Parcelable
{

	public NfcosBusinessOrder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	static byte[] readBytesWithNull(Parcel parcel)
	{
		int i = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method int Parcel.readInt()>
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
	//   12   17:invokevirtual   #48  <Method void Parcel.readByteArray(byte[])>
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
	//    4    6:invokevirtual   #54  <Method void Parcel.writeInt(int)>
			return;
	//    5    9:return          
		} else
		{
			parcel.writeInt(abyte0.length);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:invokevirtual   #54  <Method void Parcel.writeInt(int)>
			parcel.writeByteArray(abyte0);
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #57  <Method void Parcel.writeByteArray(byte[])>
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
		tradeDate = parcel.readString();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #64  <Method String Parcel.readString()>
	//    3    5:putfield        #66  <Field String tradeDate>
		tradeTime = parcel.readString();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #64  <Method String Parcel.readString()>
	//    7   13:putfield        #68  <Field String tradeTime>
		order = readBytesWithNull(parcel);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #70  <Method byte[] readBytesWithNull(Parcel)>
	//   11   21:putfield        #72  <Field byte[] order>
		amount = parcel.readInt();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #44  <Method int Parcel.readInt()>
	//   15   29:putfield        #74  <Field int amount>
		faceNo = parcel.readString();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #64  <Method String Parcel.readString()>
	//   19   37:putfield        #76  <Field String faceNo>
		tradeState = parcel.readInt();
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #44  <Method int Parcel.readInt()>
	//   23   45:putfield        #78  <Field int tradeState>
		invoiceStatus = parcel.readInt();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #44  <Method int Parcel.readInt()>
	//   27   53:putfield        #80  <Field int invoiceStatus>
		cardIoType = parcel.readInt();
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #44  <Method int Parcel.readInt()>
	//   31   61:putfield        #82  <Field int cardIoType>
		businessOrderType = parcel.readInt();
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:invokevirtual   #44  <Method int Parcel.readInt()>
	//   35   69:putfield        #84  <Field int businessOrderType>
		product = parcel.readString();
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:invokevirtual   #64  <Method String Parcel.readString()>
	//   39   77:putfield        #86  <Field String product>
		seid = readBytesWithNull(parcel);
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:invokestatic    #70  <Method byte[] readBytesWithNull(Parcel)>
	//   43   85:putfield        #88  <Field byte[] seid>
		deviceModel = parcel.readString();
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:invokevirtual   #64  <Method String Parcel.readString()>
	//   47   93:putfield        #90  <Field String deviceModel>
		mainOrder = readBytesWithNull(parcel);
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:invokestatic    #70  <Method byte[] readBytesWithNull(Parcel)>
	//   51  101:putfield        #92  <Field byte[] mainOrder>
	//   52  104:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(tradeDate);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #66  <Field String tradeDate>
	//    3    5:invokevirtual   #98  <Method void Parcel.writeString(String)>
		parcel.writeString(tradeTime);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #68  <Field String tradeTime>
	//    7   13:invokevirtual   #98  <Method void Parcel.writeString(String)>
		writeBytesWithNull(parcel, order);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #72  <Field byte[] order>
	//   11   21:invokestatic    #100 <Method void writeBytesWithNull(Parcel, byte[])>
		parcel.writeInt(amount);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #74  <Field int amount>
	//   15   29:invokevirtual   #54  <Method void Parcel.writeInt(int)>
		parcel.writeString(faceNo);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #76  <Field String faceNo>
	//   19   37:invokevirtual   #98  <Method void Parcel.writeString(String)>
		parcel.writeInt(tradeState);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #78  <Field int tradeState>
	//   23   45:invokevirtual   #54  <Method void Parcel.writeInt(int)>
		parcel.writeInt(invoiceStatus);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #80  <Field int invoiceStatus>
	//   27   53:invokevirtual   #54  <Method void Parcel.writeInt(int)>
		parcel.writeInt(cardIoType);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #82  <Field int cardIoType>
	//   31   61:invokevirtual   #54  <Method void Parcel.writeInt(int)>
		parcel.writeInt(businessOrderType);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #84  <Field int businessOrderType>
	//   35   69:invokevirtual   #54  <Method void Parcel.writeInt(int)>
		parcel.writeString(product);
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #86  <Field String product>
	//   39   77:invokevirtual   #98  <Method void Parcel.writeString(String)>
		writeBytesWithNull(parcel, seid);
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #88  <Field byte[] seid>
	//   43   85:invokestatic    #100 <Method void writeBytesWithNull(Parcel, byte[])>
		parcel.writeString(deviceModel);
	//   44   88:aload_1         
	//   45   89:aload_0         
	//   46   90:getfield        #90  <Field String deviceModel>
	//   47   93:invokevirtual   #98  <Method void Parcel.writeString(String)>
		writeBytesWithNull(parcel, mainOrder);
	//   48   96:aload_1         
	//   49   97:aload_0         
	//   50   98:getfield        #92  <Field byte[] mainOrder>
	//   51  101:invokestatic    #100 <Method void writeBytesWithNull(Parcel, byte[])>
	//   52  104:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

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

	}
;
	public int amount;
	public int businessOrderType;
	public int cardIoType;
	public String deviceModel;
	public String faceNo;
	public int invoiceStatus;
	public byte mainOrder[];
	public byte order[];
	public String product;
	public byte seid[];
	public String tradeDate;
	public int tradeState;
	public String tradeTime;

	static 
	{
	//    0    0:new             #8   <Class NfcosBusinessOrder$1>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void NfcosBusinessOrder$1()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
