// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Parcel;

// Referenced classes of package com.facebook.login:
//			LoginClient

static final class LoginClient$Request$1
	implements android.os.Parcelable.Creator
{

	public LoginClient.Request createFromParcel(Parcel parcel)
	{
		return new LoginClient.Request(parcel, ((LoginClient._cls1) (null)));
	//    0    0:new             #9   <Class LoginClient$Request>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #22  <Method void LoginClient$Request(Parcel, LoginClient$1)>
	//    5    9:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method LoginClient$Request createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public LoginClient.Request[] newArray(int i)
	{
		return new LoginClient.Request[i];
	//    0    0:iload_1         
	//    1    1:anewarray       LoginClient.Request[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method LoginClient$Request[] newArray(int)>
	//    3    5:areturn         
	}

	LoginClient$Request$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
