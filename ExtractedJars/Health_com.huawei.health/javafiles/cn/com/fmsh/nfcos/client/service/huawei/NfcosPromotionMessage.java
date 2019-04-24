// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;
import android.os.Parcelable;

public class NfcosPromotionMessage
	implements Parcelable
{

	public NfcosPromotionMessage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
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
		title = parcel.readString();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #34  <Method String Parcel.readString()>
	//    3    5:putfield        #36  <Field String title>
		description = parcel.readString();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #34  <Method String Parcel.readString()>
	//    7   13:putfield        #38  <Field String description>
		code = parcel.readString();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #34  <Method String Parcel.readString()>
	//   11   21:putfield        #40  <Field String code>
	//   12   24:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(title);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field String title>
	//    3    5:invokevirtual   #46  <Method void Parcel.writeString(String)>
		parcel.writeString(description);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field String description>
	//    7   13:invokevirtual   #46  <Method void Parcel.writeString(String)>
		parcel.writeString(code);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #40  <Field String code>
	//   11   21:invokevirtual   #46  <Method void Parcel.writeString(String)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public NfcosPromotionMessage createFromParcel(Parcel parcel)
		{
			NfcosPromotionMessage nfcospromotionmessage = new NfcosPromotionMessage();
		//    0    0:new             #9   <Class NfcosPromotionMessage>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void NfcosPromotionMessage()>
		//    3    7:astore_2        
			nfcospromotionmessage.title = parcel.readString();
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #23  <Method String Parcel.readString()>
		//    7   13:putfield        #27  <Field String NfcosPromotionMessage.title>
			nfcospromotionmessage.description = parcel.readString();
		//    8   16:aload_2         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #23  <Method String Parcel.readString()>
		//   11   21:putfield        #30  <Field String NfcosPromotionMessage.description>
			nfcospromotionmessage.code = parcel.readString();
		//   12   24:aload_2         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #23  <Method String Parcel.readString()>
		//   15   29:putfield        #33  <Field String NfcosPromotionMessage.code>
			return nfcospromotionmessage;
		//   16   32:aload_2         
		//   17   33:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #36  <Method NfcosPromotionMessage createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public NfcosPromotionMessage[] newArray(int i)
		{
			return new NfcosPromotionMessage[i];
		//    0    0:iload_1         
		//    1    1:anewarray       NfcosPromotionMessage[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #41  <Method NfcosPromotionMessage[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public String code;
	public String description;
	public String title;

	static 
	{
	//    0    0:new             #8   <Class NfcosPromotionMessage$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void NfcosPromotionMessage$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
