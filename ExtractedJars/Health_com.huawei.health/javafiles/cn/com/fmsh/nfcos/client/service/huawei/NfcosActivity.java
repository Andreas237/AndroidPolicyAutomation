// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;
import android.os.Parcelable;

public class NfcosActivity
	implements Parcelable
{

	public NfcosActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void readFromParcel(Parcel parcel)
	{
		name = parcel.readString();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #41  <Method String Parcel.readString()>
	//    3    5:putfield        #43  <Field String name>
		code = parcel.readString();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #41  <Method String Parcel.readString()>
	//    7   13:putfield        #45  <Field String code>
		start = parcel.readString();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #41  <Method String Parcel.readString()>
	//   11   21:putfield        #47  <Field String start>
		end = parcel.readString();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #41  <Method String Parcel.readString()>
	//   15   29:putfield        #49  <Field String end>
		total = parcel.readInt();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #52  <Method int Parcel.readInt()>
	//   19   37:putfield        #54  <Field int total>
		remainder = parcel.readInt();
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #52  <Method int Parcel.readInt()>
	//   23   45:putfield        #56  <Field int remainder>
		definition = parcel.readString();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #41  <Method String Parcel.readString()>
	//   27   53:putfield        #58  <Field String definition>
		payChannel = parcel.readString();
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #41  <Method String Parcel.readString()>
	//   31   61:putfield        #60  <Field String payChannel>
		payMin = parcel.readInt();
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:invokevirtual   #52  <Method int Parcel.readInt()>
	//   35   69:putfield        #62  <Field int payMin>
	//   36   72:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(name);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field String name>
	//    3    5:invokevirtual   #68  <Method void Parcel.writeString(String)>
		parcel.writeString(code);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field String code>
	//    7   13:invokevirtual   #68  <Method void Parcel.writeString(String)>
		parcel.writeString(start);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field String start>
	//   11   21:invokevirtual   #68  <Method void Parcel.writeString(String)>
		parcel.writeString(end);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #49  <Field String end>
	//   15   29:invokevirtual   #68  <Method void Parcel.writeString(String)>
		parcel.writeInt(total);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #54  <Field int total>
	//   19   37:invokevirtual   #72  <Method void Parcel.writeInt(int)>
		parcel.writeInt(remainder);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #56  <Field int remainder>
	//   23   45:invokevirtual   #72  <Method void Parcel.writeInt(int)>
		parcel.writeString(definition);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #58  <Field String definition>
	//   27   53:invokevirtual   #68  <Method void Parcel.writeString(String)>
		parcel.writeString(payChannel);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #60  <Field String payChannel>
	//   31   61:invokevirtual   #68  <Method void Parcel.writeString(String)>
		parcel.writeInt(payMin);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #62  <Field int payMin>
	//   35   69:invokevirtual   #72  <Method void Parcel.writeInt(int)>
	//   36   72:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public NfcosActivity createFromParcel(Parcel parcel)
		{
			NfcosActivity nfcosactivity = new NfcosActivity();
		//    0    0:new             #9   <Class NfcosActivity>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void NfcosActivity()>
		//    3    7:astore_2        
			nfcosactivity.name = parcel.readString();
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #23  <Method String Parcel.readString()>
		//    7   13:putfield        #27  <Field String NfcosActivity.name>
			nfcosactivity.code = parcel.readString();
		//    8   16:aload_2         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #23  <Method String Parcel.readString()>
		//   11   21:putfield        #30  <Field String NfcosActivity.code>
			nfcosactivity.start = parcel.readString();
		//   12   24:aload_2         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #23  <Method String Parcel.readString()>
		//   15   29:putfield        #33  <Field String NfcosActivity.start>
			nfcosactivity.end = parcel.readString();
		//   16   32:aload_2         
		//   17   33:aload_1         
		//   18   34:invokevirtual   #23  <Method String Parcel.readString()>
		//   19   37:putfield        #36  <Field String NfcosActivity.end>
			nfcosactivity.total = parcel.readInt();
		//   20   40:aload_2         
		//   21   41:aload_1         
		//   22   42:invokevirtual   #40  <Method int Parcel.readInt()>
		//   23   45:putfield        #44  <Field int NfcosActivity.total>
			nfcosactivity.remainder = parcel.readInt();
		//   24   48:aload_2         
		//   25   49:aload_1         
		//   26   50:invokevirtual   #40  <Method int Parcel.readInt()>
		//   27   53:putfield        #47  <Field int NfcosActivity.remainder>
			nfcosactivity.definition = parcel.readString();
		//   28   56:aload_2         
		//   29   57:aload_1         
		//   30   58:invokevirtual   #23  <Method String Parcel.readString()>
		//   31   61:putfield        #50  <Field String NfcosActivity.definition>
			nfcosactivity.payChannel = parcel.readString();
		//   32   64:aload_2         
		//   33   65:aload_1         
		//   34   66:invokevirtual   #23  <Method String Parcel.readString()>
		//   35   69:putfield        #53  <Field String NfcosActivity.payChannel>
			nfcosactivity.payMin = parcel.readInt();
		//   36   72:aload_2         
		//   37   73:aload_1         
		//   38   74:invokevirtual   #40  <Method int Parcel.readInt()>
		//   39   77:putfield        #56  <Field int NfcosActivity.payMin>
			return nfcosactivity;
		//   40   80:aload_2         
		//   41   81:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #59  <Method NfcosActivity createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public NfcosActivity[] newArray(int i)
		{
			return new NfcosActivity[i];
		//    0    0:iload_1         
		//    1    1:anewarray       NfcosActivity[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #64  <Method NfcosActivity[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public String code;
	public String definition;
	public String end;
	public String name;
	public String payChannel;
	public int payMin;
	public int remainder;
	public String start;
	public int total;

	static 
	{
	//    0    0:new             #8   <Class NfcosActivity$1>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void NfcosActivity$1()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
