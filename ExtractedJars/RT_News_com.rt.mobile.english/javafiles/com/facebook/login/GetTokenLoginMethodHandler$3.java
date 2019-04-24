// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Parcel;

// Referenced classes of package com.facebook.login:
//			GetTokenLoginMethodHandler

static final class GetTokenLoginMethodHandler$3
	implements android.os.Parcelable.Creator
{

	public GetTokenLoginMethodHandler createFromParcel(Parcel parcel)
	{
		return new GetTokenLoginMethodHandler(parcel);
	//    0    0:new             #8   <Class GetTokenLoginMethodHandler>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #18  <Method void GetTokenLoginMethodHandler(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #21  <Method GetTokenLoginMethodHandler createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public GetTokenLoginMethodHandler[] newArray(int i)
	{
		return new GetTokenLoginMethodHandler[i];
	//    0    0:iload_1         
	//    1    1:anewarray       GetTokenLoginMethodHandler[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method GetTokenLoginMethodHandler[] newArray(int)>
	//    3    5:areturn         
	}

	GetTokenLoginMethodHandler$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
