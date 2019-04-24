// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaom, zzwe, zzaoj, zzvs, 
//			zzwq

final class zzws
	implements zzaom
{

	zzws(zzwq zzwq, zzaoj zzaoj1, zzvs zzvs1)
	{
		zzbrn = zzaoj1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field zzaoj zzbrn>
		zzbrl = zzvs1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field zzvs zzbrl>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzbrn.setException(((Throwable) (new zzwe("Unable to obtain a JavascriptEngine."))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzaoj zzbrn>
	//    2    4:new             #23  <Class zzwe>
	//    3    7:dup             
	//    4    8:ldc1            #25  <String "Unable to obtain a JavascriptEngine.">
	//    5   10:invokespecial   #28  <Method void zzwe(String)>
	//    6   13:invokevirtual   #34  <Method void zzaoj.setException(Throwable)>
		zzbrl.release();
	//    7   16:aload_0         
	//    8   17:getfield        #16  <Field zzvs zzbrl>
	//    9   20:invokevirtual   #39  <Method void zzvs.release()>
	//   10   23:return          
	}

	private final zzvs zzbrl;
	private final zzaoj zzbrn;
}
