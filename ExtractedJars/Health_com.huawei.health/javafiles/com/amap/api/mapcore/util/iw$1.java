// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.Parcel;

// Referenced classes of package com.amap.api.mapcore.util:
//			iw

static final class iw$1
	implements android.os.lable.Creator
{

	public final Object createFromParcel(Parcel parcel)
	{
		return ((Object) (iw.b(parcel.readString())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method String Parcel.readString()>
	//    2    4:invokestatic    #25  <Method iw iw.b(String)>
	//    3    7:areturn         
	}

	public final volatile Object[] newArray(int i)
	{
		return ((Object []) (new iw[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       iw[]
	//    2    4:areturn         
	}

	iw$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
