// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzamy, zzaka, zzajx, zzanz, 
//			zzakb, zzanm

public final class zzajz
{

	public static void zzai(Context context)
	{
		if(!zzamy.zzbl(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #13  <Method boolean zzamy.zzbl(Context)>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!zzamy.zzsk())
	//*   4    8:invokestatic    #17  <Method boolean zzamy.zzsk()>
	//*   5   11:ifne            40
		{
			context = ((Context) ((zzanz)((zzajx) (new zzaka(context))).zznt()));
	//    6   14:new             #19  <Class zzaka>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokespecial   #22  <Method void zzaka(Context)>
	//   10   22:invokevirtual   #28  <Method Object zzajx.zznt()>
	//   11   25:checkcast       #30  <Class zzanz>
	//   12   28:astore_0        
			zzakb.zzdj("Updating ad debug logging enablement.");
	//   13   29:ldc1            #32  <String "Updating ad debug logging enablement.">
	//   14   31:invokestatic    #38  <Method void zzakb.zzdj(String)>
			zzanm.zza(((zzanz) (context)), "AdDebugLogUpdater.updateEnablement");
	//   15   34:aload_0         
	//   16   35:ldc1            #40  <String "AdDebugLogUpdater.updateEnablement">
	//   17   37:invokestatic    #46  <Method void zzanm.zza(zzanz, String)>
		}
	//   18   40:return          
	}
}
