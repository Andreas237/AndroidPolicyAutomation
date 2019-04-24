// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Parcel;

// Referenced classes of package com.facebook.login:
//			LoginClient

static final class LoginClient$Result$1
	implements android.os.Parcelable.Creator
{

	public LoginClient.Result createFromParcel(Parcel parcel)
	{
		return new LoginClient.Result(parcel, ((LoginClient._cls1) (null)));
	//    0    0:new             #8   <Class LoginClient$Result>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #21  <Method void LoginClient$Result(Parcel, LoginClient$1)>
	//    5    9:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #24  <Method LoginClient$Result createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public LoginClient.Result[] newArray(int i)
	{
		return new LoginClient.Result[i];
	//    0    0:iload_1         
	//    1    1:anewarray       LoginClient.Result[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #29  <Method LoginClient$Result[] newArray(int)>
	//    3    5:areturn         
	}

	LoginClient$Result$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
