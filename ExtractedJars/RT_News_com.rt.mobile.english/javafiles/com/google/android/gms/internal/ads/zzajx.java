// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzalc, zzajy, zzaki, zzanz

public abstract class zzajx
	implements zzalc
{

	public zzajx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzy = ((Runnable) (new zzajy(this)));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class zzajy>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #23  <Method void zzajy(zzajx)>
	//    7   13:putfield        #25  <Field Runnable zzy>
		zzcqs = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #27  <Field boolean zzcqs>
	//   11   21:return          
	}

	public zzajx(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzy = ((Runnable) (new zzajy(this)));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class zzajy>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #23  <Method void zzajy(zzajx)>
	//    7   13:putfield        #25  <Field Runnable zzy>
		zzcqs = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #27  <Field boolean zzcqs>
	//   11   21:return          
	}

	static Thread zza(zzajx zzajx1, Thread thread)
	{
		zzajx1.zzcqr = thread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field Thread zzcqr>
		return thread;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public final void cancel()
	{
		onStop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method void onStop()>
		if(zzcqr != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #33  <Field Thread zzcqr>
	//*   4    8:ifnull          18
			zzcqr.interrupt();
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field Thread zzcqr>
	//    7   15:invokevirtual   #42  <Method void Thread.interrupt()>
	//    8   18:return          
	}

	public abstract void onStop();

	public abstract void zzdn();

	public final Object zznt()
	{
		if(zzcqs)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean zzcqs>
	//*   2    4:ifeq            15
			return ((Object) (zzaki.zzc(zzy)));
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field Runnable zzy>
	//    5   11:invokestatic    #51  <Method zzanz zzaki.zzc(Runnable)>
	//    6   14:areturn         
		else
			return ((Object) (zzaki.zzb(zzy)));
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field Runnable zzy>
	//    9   19:invokestatic    #54  <Method zzanz zzaki.zzb(Runnable)>
	//   10   22:areturn         
	}

	public final zzanz zzqo()
	{
		if(zzcqs)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean zzcqs>
	//*   2    4:ifeq            15
			return zzaki.zzc(zzy);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field Runnable zzy>
	//    5   11:invokestatic    #51  <Method zzanz zzaki.zzc(Runnable)>
	//    6   14:areturn         
		else
			return zzaki.zzb(zzy);
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field Runnable zzy>
	//    9   19:invokestatic    #54  <Method zzanz zzaki.zzb(Runnable)>
	//   10   22:areturn         
	}

	private volatile Thread zzcqr;
	private boolean zzcqs;
	private final Runnable zzy;
}
