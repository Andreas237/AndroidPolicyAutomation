// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common:
//			zzd

static abstract class zzd$zzc extends zzd$zza
{

	byte[] getBytes()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		byte abyte1[] = (byte[])zzaxi.get();
	//    2    2:aload_0         
	//    3    3:getfield        #27  <Field WeakReference zzaxi>
	//    4    6:invokevirtual   #33  <Method Object WeakReference.get()>
	//    5    9:checkcast       #35  <Class byte[]>
	//    6   12:astore_2        
		byte abyte0[];
		abyte0 = abyte1;
	//    7   13:aload_2         
	//    8   14:astore_1        
		if(abyte1 != null)
			break MISSING_BLOCK_LABEL_36;
	//    9   15:aload_2         
	//   10   16:ifnonnull       36
		abyte0 = zzuD();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #38  <Method byte[] zzuD()>
	//   13   23:astore_1        
		zzaxi = new WeakReference(((Object) (abyte0)));
	//   14   24:aload_0         
	//   15   25:new             #15  <Class WeakReference>
	//   16   28:dup             
	//   17   29:aload_1         
	//   18   30:invokespecial   #19  <Method void WeakReference(Object)>
	//   19   33:putfield        #27  <Field WeakReference zzaxi>
		this;
	//   20   36:aload_0         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		return abyte0;
	//   22   38:aload_1         
	//   23   39:areturn         
		Exception exception;
		exception;
	//   24   40:astore_1        
		this;
	//   25   41:aload_0         
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		throw exception;
	//   27   43:aload_1         
	//   28   44:athrow          
	}

	protected abstract byte[] zzuD();

	private static final WeakReference zzaxj = new WeakReference(((Object) (null)));
	private WeakReference zzaxi;

	static 
	{
	//    0    0:new             #15  <Class WeakReference>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #19  <Method void WeakReference(Object)>
	//    4    8:putstatic       #21  <Field WeakReference zzaxj>
	//*   5   11:return          
	}

	zzd$zzc(byte abyte0[])
	{
		super(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void zzd$zza(byte[])>
		zzaxi = zzaxj;
	//    3    5:aload_0         
	//    4    6:getstatic       #21  <Field WeakReference zzaxj>
	//    5    9:putfield        #27  <Field WeakReference zzaxi>
	//    6   12:return          
	}
}
