// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoo, zzuu, zzakb, zzaop, 
//			zzvs, zzvw

final class zzvx
	implements zzaoo
{

	zzvx(zzvw zzvw, zzvs zzvs)
	{
		zzbqv = zzvs;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #13  <Field zzvs zzbqv>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zze(Object obj)
	{
		obj = ((Object) ((zzuu)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzuu>
	//    2    4:astore_1        
		zzakb.v("Getting a new session for JS Engine.");
	//    3    5:ldc1            #23  <String "Getting a new session for JS Engine.">
	//    4    7:invokestatic    #29  <Method void zzakb.v(String)>
		((zzaop) (zzbqv)).zzk(((Object) (((zzuu) (obj)).zzlw())));
	//    5   10:aload_0         
	//    6   11:getfield        #13  <Field zzvs zzbqv>
	//    7   14:aload_1         
	//    8   15:invokeinterface #33  <Method zzwc zzuu.zzlw()>
	//    9   20:invokevirtual   #38  <Method void zzaop.zzk(Object)>
	//   10   23:return          
	}

	private final zzvs zzbqv;
}
