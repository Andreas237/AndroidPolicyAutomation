// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zzd;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzk

static final class zzk$zzg
	implements com.google.android.gms.safetynet.tApi.zzb
{

	public final List getHarmfulAppsList()
	{
		zzd zzd1 = zzal;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzd zzal>
	//    2    4:astore_1        
		if(zzd1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return Collections.emptyList();
	//    5    9:invokestatic    #30  <Method List Collections.emptyList()>
	//    6   12:areturn         
		else
			return Arrays.asList(((Object []) (zzd1.zzg)));
	//    7   13:aload_1         
	//    8   14:getfield        #35  <Field com.google.android.gms.safetynet.HarmfulAppsData[] zzd.zzg>
	//    9   17:invokestatic    #41  <Method List Arrays.asList(Object[])>
	//   10   20:areturn         
	}

	public final int getHoursSinceLastScanWithHarmfulApp()
	{
		zzd zzd1 = zzal;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzd zzal>
	//    2    4:astore_1        
		if(zzd1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		else
			return zzd1.zzh;
	//    7   11:aload_1         
	//    8   12:getfield        #49  <Field int zzd.zzh>
	//    9   15:ireturn         
	}

	public final long getLastScanTimeMs()
	{
		zzd zzd1 = zzal;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zzd zzal>
	//    2    4:astore_1        
		if(zzd1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0L;
	//    5    9:lconst_0        
	//    6   10:lreturn         
		else
			return zzd1.zzf;
	//    7   11:aload_1         
	//    8   12:getfield        #55  <Field long zzd.zzf>
	//    9   15:lreturn         
	}

	public final Status getStatus()
	{
		return zzad;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Status zzad>
	//    2    4:areturn         
	}

	private final Status zzad;
	private final zzd zzal;

	public zzk$zzg(Status status, zzd zzd1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzad = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Status zzad>
		zzal = zzd1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field zzd zzal>
	//    8   14:return          
	}
}
