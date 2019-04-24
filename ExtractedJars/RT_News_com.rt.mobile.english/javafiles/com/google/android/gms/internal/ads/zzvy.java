// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaom, zzakb, zzaop, zzvs, 
//			zzvw

final class zzvy
	implements zzaom
{

	zzvy(zzvw zzvw, zzvs zzvs)
	{
		zzbqv = zzvs;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field zzvs zzbqv>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzakb.v("Rejecting reference for JS Engine.");
	//    0    0:ldc1            #19  <String "Rejecting reference for JS Engine.">
	//    1    2:invokestatic    #25  <Method void zzakb.v(String)>
		((zzaop) (zzbqv)).reject();
	//    2    5:aload_0         
	//    3    6:getfield        #12  <Field zzvs zzbqv>
	//    4    9:invokevirtual   #30  <Method void zzaop.reject()>
	//    5   12:return          
	}

	private final zzvs zzbqv;
}
