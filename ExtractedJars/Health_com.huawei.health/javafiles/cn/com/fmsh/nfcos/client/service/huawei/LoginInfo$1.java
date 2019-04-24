// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.nfcos.client.service.huawei;

import android.os.Parcel;

// Referenced classes of package cn.com.fmsh.nfcos.client.service.huawei:
//			LoginInfo

class LoginInfo$1
	implements android.os.reator
{

	public LoginInfo createFromParcel(Parcel parcel)
	{
		LoginInfo logininfo = new LoginInfo();
	//    0    0:new             #9   <Class LoginInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void LoginInfo()>
	//    3    7:astore_2        
		logininfo.loginResult = parcel.readInt();
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method int Parcel.readInt()>
	//    7   13:putfield        #27  <Field int LoginInfo.loginResult>
		logininfo.loginFailureCount = parcel.readInt();
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #23  <Method int Parcel.readInt()>
	//   11   21:putfield        #30  <Field int LoginInfo.loginFailureCount>
		logininfo.userLockTime = parcel.readInt();
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #23  <Method int Parcel.readInt()>
	//   15   29:putfield        #33  <Field int LoginInfo.userLockTime>
		return logininfo;
	//   16   32:aload_2         
	//   17   33:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method LoginInfo createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public LoginInfo[] newArray(int i)
	{
		return new LoginInfo[i];
	//    0    0:iload_1         
	//    1    1:anewarray       LoginInfo[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #41  <Method LoginInfo[] newArray(int)>
	//    3    5:areturn         
	}

	LoginInfo$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
