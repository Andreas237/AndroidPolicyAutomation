// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.banner3d;

import android.os.Parcel;

// Referenced classes of package com.startapp.android.publish.ads.banner.banner3d:
//			Banner3DFace

static final class Banner3DFace$1
	implements android.os.tor
{

	public Banner3DFace a(Parcel parcel)
	{
		return new Banner3DFace(parcel);
	//    0    0:new             #9   <Class Banner3DFace>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void Banner3DFace(Parcel)>
	//    4    8:areturn         
	}

	public Banner3DFace[] a(int i)
	{
		return new Banner3DFace[i];
	//    0    0:iload_1         
	//    1    1:anewarray       Banner3DFace[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #24  <Method Banner3DFace a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method Banner3DFace[] a(int)>
	//    3    5:areturn         
	}

	Banner3DFace$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
