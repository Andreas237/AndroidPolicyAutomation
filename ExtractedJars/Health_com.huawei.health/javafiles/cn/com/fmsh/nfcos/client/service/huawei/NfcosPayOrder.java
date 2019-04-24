// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;
import android.os.Parcelable;

public class NfcosPayOrder
	implements Parcelable
{

	public NfcosPayOrder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	static byte[] readBytesWithNull(Parcel parcel)
	{
		int i = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method int Parcel.readInt()>
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
	//   12   17:invokevirtual   #43  <Method void Parcel.readByteArray(byte[])>
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
	//    4    6:invokevirtual   #49  <Method void Parcel.writeInt(int)>
			return;
	//    5    9:return          
		} else
		{
			parcel.writeInt(abyte0.length);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:invokevirtual   #49  <Method void Parcel.writeInt(int)>
			parcel.writeByteArray(abyte0);
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #52  <Method void Parcel.writeByteArray(byte[])>
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
	//    2    2:invokevirtual   #39  <Method int Parcel.readInt()>
	//    3    5:putfield        #57  <Field int state>
		id = readBytesWithNull(parcel);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #59  <Method byte[] readBytesWithNull(Parcel)>
	//    7   13:putfield        #61  <Field byte[] id>
		date = parcel.readString();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #65  <Method String Parcel.readString()>
	//   11   21:putfield        #67  <Field String date>
		time = parcel.readString();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #65  <Method String Parcel.readString()>
	//   15   29:putfield        #69  <Field String time>
		amount = parcel.readInt();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #39  <Method int Parcel.readInt()>
	//   19   37:putfield        #71  <Field int amount>
		thirdPayInfo = parcel.readString();
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #65  <Method String Parcel.readString()>
	//   23   45:putfield        #73  <Field String thirdPayInfo>
		channel = parcel.readInt();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #39  <Method int Parcel.readInt()>
	//   27   53:putfield        #75  <Field int channel>
		mainOrder = readBytesWithNull(parcel);
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokestatic    #59  <Method byte[] readBytesWithNull(Parcel)>
	//   31   61:putfield        #77  <Field byte[] mainOrder>
	//   32   64:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(state);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #57  <Field int state>
	//    3    5:invokevirtual   #49  <Method void Parcel.writeInt(int)>
		writeBytesWithNull(parcel, id);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field byte[] id>
	//    7   13:invokestatic    #81  <Method void writeBytesWithNull(Parcel, byte[])>
		parcel.writeString(date);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #67  <Field String date>
	//   11   21:invokevirtual   #85  <Method void Parcel.writeString(String)>
		parcel.writeString(time);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #69  <Field String time>
	//   15   29:invokevirtual   #85  <Method void Parcel.writeString(String)>
		parcel.writeInt(amount);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #71  <Field int amount>
	//   19   37:invokevirtual   #49  <Method void Parcel.writeInt(int)>
		parcel.writeString(thirdPayInfo);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #73  <Field String thirdPayInfo>
	//   23   45:invokevirtual   #85  <Method void Parcel.writeString(String)>
		parcel.writeInt(channel);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #75  <Field int channel>
	//   27   53:invokevirtual   #49  <Method void Parcel.writeInt(int)>
		writeBytesWithNull(parcel, mainOrder);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #77  <Field byte[] mainOrder>
	//   31   61:invokestatic    #81  <Method void writeBytesWithNull(Parcel, byte[])>
	//   32   64:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

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

	}
;
	public int amount;
	public int channel;
	public String date;
	public byte id[];
	public byte mainOrder[];
	public int state;
	public String thirdPayInfo;
	public String time;

	static 
	{
	//    0    0:new             #8   <Class NfcosPayOrder$1>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void NfcosPayOrder$1()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
