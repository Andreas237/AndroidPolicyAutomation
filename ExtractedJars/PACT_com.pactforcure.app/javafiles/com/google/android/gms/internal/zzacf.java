// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.internal:
//			zzacg, zzach

public class zzacf extends zza
{

	zzacf(int i, zzach zzach1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int mVersionCode>
		zzaFu = zzach1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field zzach zzaFu>
	//    8   14:return          
	}

	private zzacf(zzach zzach1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		mVersionCode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #25  <Field int mVersionCode>
		zzaFu = zzach1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #27  <Field zzach zzaFu>
	//    8   14:return          
	}

	public static zzacf zza(zzack.zzb zzb)
	{
		if(zzb instanceof zzach)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #32  <Class zzach>
	//*   2    4:ifeq            19
			return new zzacf((zzach)zzb);
	//    3    7:new             #2   <Class zzacf>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:checkcast       #32  <Class zzach>
	//    7   15:invokespecial   #34  <Method void zzacf(zzach)>
	//    8   18:areturn         
		else
			throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
	//    9   19:new             #36  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #38  <String "Unsupported safe parcelable field converter class.">
	//   12   25:invokespecial   #41  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzacg.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #48  <Method void com.google.android.gms.internal.zzacg.zza(zzacf, Parcel, int)>
	//    4    6:return          
	}

	zzach zzxH()
	{
		return zzaFu;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field zzach zzaFu>
	//    2    4:areturn         
	}

	public zzack.zzb zzxI()
	{
		if(zzaFu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field zzach zzaFu>
	//*   2    4:ifnull          12
			return ((zzack.zzb) (zzaFu));
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field zzach zzaFu>
	//    5   11:areturn         
		else
			throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
	//    6   12:new             #54  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #56  <String "There was no converter wrapped in this ConverterWrapper.">
	//    9   18:invokespecial   #57  <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzacg();
	final int mVersionCode;
	private final zzach zzaFu;

	static 
	{
	//    0    0:new             #15  <Class zzacg>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzacg()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
