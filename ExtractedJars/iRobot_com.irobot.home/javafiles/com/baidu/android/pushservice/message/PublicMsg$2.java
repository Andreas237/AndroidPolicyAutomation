// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.message;

import android.os.Parcel;

// Referenced classes of package com.baidu.android.pushservice.message:
//			PublicMsg

static final class PublicMsg$2
	implements android.os.reator
{

	public PublicMsg a(Parcel parcel)
	{
		return new PublicMsg(parcel);
	//    0    0:new             #9   <Class PublicMsg>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void PublicMsg(Parcel)>
	//    4    8:areturn         
	}

	public PublicMsg[] a(int i)
	{
		return new PublicMsg[i];
	//    0    0:iload_1         
	//    1    1:anewarray       PublicMsg[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #24  <Method PublicMsg a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method PublicMsg[] a(int)>
	//    3    5:areturn         
	}

	PublicMsg$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
