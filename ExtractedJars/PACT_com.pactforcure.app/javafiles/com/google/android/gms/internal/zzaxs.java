// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//			zzaxt

public class zzaxs extends zza
{

	zzaxs(int i, boolean flag, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int mVersionCode>
		zzbCn = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field boolean zzbCn>
		zzbCo = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field List zzbCo>
	//   11   19:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzaxt.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #40  <Method void com.google.android.gms.internal.zzaxt.zza(zzaxs, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaxt();
	final int mVersionCode;
	final boolean zzbCn;
	final List zzbCo;

	static 
	{
	//    0    0:new             #18  <Class zzaxt>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzaxt()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
