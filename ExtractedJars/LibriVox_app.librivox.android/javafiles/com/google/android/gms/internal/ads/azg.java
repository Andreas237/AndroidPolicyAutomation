// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ayt, azf

final class azg
	implements Runnable
{

	private azg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	azg(azf azf)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void azg()>
	//    2    4:return          
	}

	public final void run()
	{
		Exception exception;
		try
		{
			ayt.a(MessageDigest.getInstance("MD5"));
	//    0    0:ldc1            #18  <String "MD5">
	//    1    2:invokestatic    #24  <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:invokestatic    #30  <Method MessageDigest ayt.a(MessageDigest)>
	//    3    8:pop             
		}
	//*   4    9:getstatic       #33  <Field CountDownLatch ayt.a>
	//*   5   12:invokevirtual   #38  <Method void CountDownLatch.countDown()>
	//*   6   15:return          
	//*   7   16:astore_1        
	//*   8   17:getstatic       #33  <Field CountDownLatch ayt.a>
	//*   9   20:invokevirtual   #38  <Method void CountDownLatch.countDown()>
	//*  10   23:aload_1         
	//*  11   24:athrow          
	//*  12   25:getstatic       #33  <Field CountDownLatch ayt.a>
	//*  13   28:invokevirtual   #38  <Method void CountDownLatch.countDown()>
	//*  14   31:return          
		// Misplaced declaration of an exception variable
		catch(NoSuchAlgorithmException nosuchalgorithmexception)
		{
			ayt.a.countDown();
			return;
		}
		ayt.a.countDown();
		return;
		exception;
		NoSuchAlgorithmException nosuchalgorithmexception;
		ayt.a.countDown();
		throw exception;
	//*  15   32:astore_1        
	//*  16   33:goto            25
	}
}
