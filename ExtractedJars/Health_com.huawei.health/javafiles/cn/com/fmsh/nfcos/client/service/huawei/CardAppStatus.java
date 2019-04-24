// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;
import android.os.Parcelable;

public class CardAppStatus
	implements Parcelable
{

	public CardAppStatus()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getStatus()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int status>
	//    2    4:ireturn         
	}

	public void readFromParcel(Parcel parcel)
	{
		setStatus(parcel.readInt());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #34  <Method int Parcel.readInt()>
	//    3    5:invokevirtual   #38  <Method void setStatus(int)>
	//    4    8:return          
	}

	public void setStatus(int i)
	{
		status = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int status>
	//    3    5:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(status);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field int status>
	//    3    5:invokevirtual   #43  <Method void Parcel.writeInt(int)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public CardAppStatus createFromParcel(Parcel parcel)
		{
			CardAppStatus cardappstatus = new CardAppStatus();
		//    0    0:new             #9   <Class CardAppStatus>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void CardAppStatus()>
		//    3    7:astore_2        
			cardappstatus.setStatus(parcel.readInt());
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #23  <Method int Parcel.readInt()>
		//    7   13:invokevirtual   #27  <Method void CardAppStatus.setStatus(int)>
			return cardappstatus;
		//    8   16:aload_2         
		//    9   17:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #30  <Method CardAppStatus createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public CardAppStatus[] newArray(int i)
		{
			return new CardAppStatus[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CardAppStatus[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #35  <Method CardAppStatus[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private int status;

	static 
	{
	//    0    0:new             #8   <Class CardAppStatus$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void CardAppStatus$1()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
