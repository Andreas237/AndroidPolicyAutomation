// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			UserInfo

class UserInfo$1
	implements android.os.Creator
{

	public UserInfo createFromParcel(Parcel parcel)
	{
		UserInfo userinfo = new UserInfo();
	//    0    0:new             #9   <Class UserInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void UserInfo()>
	//    3    7:astore_2        
		userinfo.username = parcel.readString();
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method String Parcel.readString()>
	//    7   13:putfield        #27  <Field String UserInfo.username>
		userinfo.password = parcel.readString();
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #23  <Method String Parcel.readString()>
	//   11   21:putfield        #30  <Field String UserInfo.password>
		return userinfo;
	//   12   24:aload_2         
	//   13   25:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method UserInfo createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public UserInfo[] newArray(int i)
	{
		return new UserInfo[i];
	//    0    0:iload_1         
	//    1    1:anewarray       UserInfo[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #38  <Method UserInfo[] newArray(int)>
	//    3    5:areturn         
	}

	UserInfo$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
