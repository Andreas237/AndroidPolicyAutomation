// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzafa, zzvf, zzafd, zzafe, 
//			zzaop

final class zzafc
	implements Runnable
{

	zzafc(zzafa zzafa1, JSONObject jsonobject, String s)
	{
		zzcgj = zzafa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzafa zzcgj>
		zzcgk = jsonobject;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field JSONObject zzcgk>
		zzcgl = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field String zzcgl>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		zzafa.zza(zzcgj, zzafa.zzoe().zzb(((zzci) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzafa zzcgj>
	//    2    4:invokestatic    #31  <Method zzvf zzafa.zzoe()>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #37  <Method zzvs zzvf.zzb(zzci)>
	//    5   11:invokestatic    #41  <Method zzvs zzafa.zza(zzafa, zzvs)>
	//    6   14:pop             
		((zzaop) (zzafa.zzb(zzcgj))).zza(((zzaoo) (new zzafd(this))), ((zzaom) (new zzafe(this))));
	//    7   15:aload_0         
	//    8   16:getfield        #16  <Field zzafa zzcgj>
	//    9   19:invokestatic    #44  <Method zzvs zzafa.zzb(zzafa)>
	//   10   22:new             #46  <Class zzafd>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:invokespecial   #49  <Method void zzafd(zzafc)>
	//   14   30:new             #51  <Class zzafe>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokespecial   #52  <Method void zzafe(zzafc)>
	//   18   38:invokevirtual   #57  <Method void zzaop.zza(zzaoo, zzaom)>
	//   19   41:return          
	}

	private final zzafa zzcgj;
	final JSONObject zzcgk;
	final String zzcgl;
}
