// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.Parcel;

// Referenced classes of package com.facebook:
//			AccessToken

static final class AccessToken$2
	implements android.os.ator
{

	public AccessToken createFromParcel(Parcel parcel)
	{
		return new AccessToken(parcel);
	//    0    0:new             #8   <Class AccessToken>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #18  <Method void AccessToken(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #21  <Method AccessToken createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public AccessToken[] newArray(int i)
	{
		return new AccessToken[i];
	//    0    0:iload_1         
	//    1    1:anewarray       AccessToken[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method AccessToken[] newArray(int)>
	//    3    5:areturn         
	}

	AccessToken$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
