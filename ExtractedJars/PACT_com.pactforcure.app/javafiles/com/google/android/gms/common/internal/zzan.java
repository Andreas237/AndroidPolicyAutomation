// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzao

public class zzan extends zza
{

	zzan(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int mVersionCode>
	//    5    9:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.common.internal.zzao.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #30  <Method void com.google.android.gms.common.internal.zzao.zza(zzan, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzao();
	final int mVersionCode;

	static 
	{
	//    0    0:new             #14  <Class zzao>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void zzao()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
