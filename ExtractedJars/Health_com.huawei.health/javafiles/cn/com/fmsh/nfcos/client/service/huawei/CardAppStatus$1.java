// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			CardAppStatus

class CardAppStatus$1
	implements android.os.or
{

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

	CardAppStatus$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
