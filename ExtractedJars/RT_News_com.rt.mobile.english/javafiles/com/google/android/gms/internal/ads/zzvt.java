// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoo, zzwb, zzakb, zzwc, 
//			zzvs

final class zzvt
	implements zzaoo
{

	zzvt(zzvs zzvs)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public final void zze(Object obj)
	{
		obj = ((Object) ((zzwb)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class zzwb>
	//    2    4:astore_1        
		zzakb.v("Ending javascript session.");
	//    3    5:ldc1            #19  <String "Ending javascript session.">
	//    4    7:invokestatic    #25  <Method void zzakb.v(String)>
		((zzwc)obj).zzmd();
	//    5   10:aload_1         
	//    6   11:checkcast       #27  <Class zzwc>
	//    7   14:invokeinterface #30  <Method void zzwc.zzmd()>
	//    8   19:return          
	}
}
