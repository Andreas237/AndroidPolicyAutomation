// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzat, zzaw

public abstract class zzau extends zzat
{

	protected zzau(zzaw zzaw)
	{
		super(zzaw);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void zzat(zzaw)>
	//    3    5:return          
	}

	public final boolean isInitialized()
	{
		return zzvz;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field boolean zzvz>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected abstract void zzag();

	protected final void zzcl()
	{
		if(!isInitialized())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #20  <Method boolean isInitialized()>
	//*   2    4:ifne            17
			throw new IllegalStateException("Not initialized");
	//    3    7:new             #22  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #24  <String "Not initialized">
	//    6   13:invokespecial   #27  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	public final void zzq()
	{
		zzag();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method void zzag()>
		zzvz = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #15  <Field boolean zzvz>
	//    5    9:return          
	}

	private boolean zzvz;
}
