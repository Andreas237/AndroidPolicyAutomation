// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class zzgq
{

	public zzgq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void Object()>
	//    6   12:putfield        #19  <Field Object mLock>
	//    7   15:return          
	}

	protected final MessageDigest zzhg()
	{
		int i;
label0:
		{
			MessageDigest messagedigest;
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzaix == null)
					break label0;
	//    5    7:getstatic       #25  <Field MessageDigest zzaix>
	//    6   10:ifnull          21
				messagedigest = zzaix;
	//    7   13:getstatic       #25  <Field MessageDigest zzaix>
	//    8   16:astore_3        
			}
	//    9   17:aload_2         
	//   10   18:monitorexit     
			return messagedigest;
	//   11   19:aload_3         
	//   12   20:areturn         
		}
		i = 0;
	//   13   21:iconst_0        
	//   14   22:istore_1        
_L3:
		if(i >= 2) goto _L2; else goto _L1
	//   15   23:iload_1         
	//   16   24:iconst_2        
	//   17   25:icmpge          43
_L1:
		MessageDigest messagedigest1;
		try
		{
			zzaix = MessageDigest.getInstance("MD5");
	//   18   28:ldc1            #27  <String "MD5">
	//   19   30:invokestatic    #33  <Method MessageDigest MessageDigest.getInstance(String)>
	//   20   33:putstatic       #25  <Field MessageDigest zzaix>
		}
	//*  21   36:iload_1         
	//*  22   37:iconst_1        
	//*  23   38:iadd            
	//*  24   39:istore_1        
	//*  25   40:goto            23
	//*  26   43:getstatic       #25  <Field MessageDigest zzaix>
	//*  27   46:astore_3        
	//*  28   47:aload_2         
	//*  29   48:monitorexit     
	//*  30   49:aload_3         
	//*  31   50:areturn         
	//*  32   51:astore_3        
	//*  33   52:aload_2         
	//*  34   53:monitorexit     
	//*  35   54:aload_3         
	//*  36   55:athrow          
		catch(NoSuchAlgorithmException nosuchalgorithmexception) { }
	//   37   56:astore_3        
		i++;
		  goto _L3
_L2:
		messagedigest1 = zzaix;
		obj;
		JVM INSTR monitorexit ;
		return messagedigest1;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  38   57:goto            36
	}

	abstract byte[] zzx(String s);

	private static MessageDigest zzaix;
	protected Object mLock;

	static 
	{
	//    0    0:return          
	}
}
