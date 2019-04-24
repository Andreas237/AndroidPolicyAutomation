// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajg, zzano, zzaoj, zzkb, 
//			zzamu, zzajf, zzaki, zzanz

public final class zzaje
	implements zzajg
{

	public zzaje()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final zzanz zza(String s, PackageInfo packageinfo)
	{
		return ((zzanz) (zzano.zzi(((Object) (s)))));
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method zzany zzano.zzi(Object)>
	//    2    4:areturn         
	}

	public final zzanz zzae(Context context)
	{
		zzaoj zzaoj1 = new zzaoj();
	//    0    0:new             #26  <Class zzaoj>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void zzaoj()>
	//    3    7:astore_2        
		zzkb.zzif();
	//    4    8:invokestatic    #33  <Method zzamu zzkb.zzif()>
	//    5   11:pop             
		if(zzamu.zzbh(context))
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #39  <Method boolean zzamu.zzbh(Context)>
	//*   8   16:ifeq            33
			zzaki.zzb(((Runnable) (new zzajf(this, context, zzaoj1))));
	//    9   19:new             #41  <Class zzajf>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokespecial   #44  <Method void zzajf(zzaje, Context, zzaoj)>
	//   15   29:invokestatic    #50  <Method zzanz zzaki.zzb(Runnable)>
	//   16   32:pop             
		return ((zzanz) (zzaoj1));
	//   17   33:aload_2         
	//   18   34:areturn         
	}
}
