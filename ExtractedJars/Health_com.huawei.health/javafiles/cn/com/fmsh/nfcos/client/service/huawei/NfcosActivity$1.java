// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			NfcosActivity

class NfcosActivity$1
	implements android.os.or
{

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

	NfcosActivity$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
