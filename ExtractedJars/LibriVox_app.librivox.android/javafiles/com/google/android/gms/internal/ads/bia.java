// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkk

final class bia
	implements android.os.Parcelable.Creator
{

	bia()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		return ((Object) (new zzkk(parcel)));
	//    0    0:new             #15  <Class zzkk>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #18  <Method void zzkk(Parcel)>
	//    4    8:areturn         
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzkk[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzkk[]
	//    2    4:areturn         
	}
}
