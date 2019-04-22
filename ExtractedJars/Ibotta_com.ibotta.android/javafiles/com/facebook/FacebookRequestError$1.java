// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.Parcel;

// Referenced classes of package com.facebook:
//			FacebookRequestError

static final class FacebookRequestError$1
	implements android.os.Parcelable.Creator
{

	public FacebookRequestError createFromParcel(Parcel parcel)
	{
		return new FacebookRequestError(parcel, ((FacebookRequestError$1) (null)));
	//    0    0:new             #9   <Class FacebookRequestError>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #19  <Method void FacebookRequestError(Parcel, FacebookRequestError$1)>
	//    5    9:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method FacebookRequestError createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public FacebookRequestError[] newArray(int i)
	{
		return new FacebookRequestError[i];
	//    0    0:iload_1         
	//    1    1:anewarray       FacebookRequestError[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #27  <Method FacebookRequestError[] newArray(int)>
	//    3    5:areturn         
	}

	FacebookRequestError$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
