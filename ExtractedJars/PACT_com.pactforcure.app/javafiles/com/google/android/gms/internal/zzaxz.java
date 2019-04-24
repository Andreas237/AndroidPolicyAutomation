// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzad;

// Referenced classes of package com.google.android.gms.internal:
//			zzaya

public class zzaxz extends zza
{

	zzaxz(int i, zzad zzad)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int mVersionCode>
		zzbCr = zzad;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field zzad zzbCr>
	//    8   14:return          
	}

	public zzaxz(zzad zzad)
	{
		this(1, zzad);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokespecial   #30  <Method void zzaxz(int, zzad)>
	//    4    6:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzaya.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #36  <Method void com.google.android.gms.internal.zzaya.zza(zzaxz, Parcel, int)>
	//    4    6:return          
	}

	public zzad zzOo()
	{
		return zzbCr;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field zzad zzbCr>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaya();
	final int mVersionCode;
	final zzad zzbCr;

	static 
	{
	//    0    0:new             #15  <Class zzaya>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzaya()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
