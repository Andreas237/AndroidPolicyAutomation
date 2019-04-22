// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class zzc extends GoogleCertificates.CertData
{

	zzc(byte abyte0[])
	{
		super(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void GoogleCertificates$CertData(byte[])>
		zzbe = zzbf;
	//    3    5:aload_0         
	//    4    6:getstatic       #18  <Field WeakReference zzbf>
	//    5    9:putfield        #24  <Field WeakReference zzbe>
	//    6   12:return          
	}

	final byte[] getBytes()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		byte abyte1[] = (byte[])zzbe.get();
	//    2    2:aload_0         
	//    3    3:getfield        #24  <Field WeakReference zzbe>
	//    4    6:invokevirtual   #30  <Method Object WeakReference.get()>
	//    5    9:checkcast       #32  <Class byte[]>
	//    6   12:astore_2        
		byte abyte0[];
		abyte0 = abyte1;
	//    7   13:aload_2         
	//    8   14:astore_1        
		if(abyte1 != null)
			break MISSING_BLOCK_LABEL_36;
	//    9   15:aload_2         
	//   10   16:ifnonnull       36
		abyte0 = zzf();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #35  <Method byte[] zzf()>
	//   13   23:astore_1        
		zzbe = new WeakReference(((Object) (abyte0)));
	//   14   24:aload_0         
	//   15   25:new             #12  <Class WeakReference>
	//   16   28:dup             
	//   17   29:aload_1         
	//   18   30:invokespecial   #16  <Method void WeakReference(Object)>
	//   19   33:putfield        #24  <Field WeakReference zzbe>
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

	protected abstract byte[] zzf();

	private static final WeakReference zzbf = new WeakReference(((Object) (null)));
	private WeakReference zzbe;

	static 
	{
	//    0    0:new             #12  <Class WeakReference>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #16  <Method void WeakReference(Object)>
	//    4    8:putstatic       #18  <Field WeakReference zzbf>
	//*   5   11:return          
	}
}
