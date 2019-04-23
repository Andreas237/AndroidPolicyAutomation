// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.math.BigInteger;

public final class wp
{

	public wp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = BigInteger.ONE;
	//    2    4:aload_0         
	//    3    5:getstatic       #21  <Field BigInteger BigInteger.ONE>
	//    4    8:putfield        #23  <Field BigInteger a>
		b = "0";
	//    5   11:aload_0         
	//    6   12:ldc1            #25  <String "0">
	//    7   14:putfield        #27  <Field String b>
	//    8   17:return          
	}

	public final String a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s;
		s = a.toString();
	//    2    2:aload_0         
	//    3    3:getfield        #23  <Field BigInteger a>
	//    4    6:invokevirtual   #32  <Method String BigInteger.toString()>
	//    5    9:astore_1        
		a = a.add(BigInteger.ONE);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field BigInteger a>
	//    9   15:getstatic       #21  <Field BigInteger BigInteger.ONE>
	//   10   18:invokevirtual   #36  <Method BigInteger BigInteger.add(BigInteger)>
	//   11   21:putfield        #23  <Field BigInteger a>
		b = s;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #27  <Field String b>
		this;
	//   15   29:aload_0         
		JVM INSTR monitorexit ;
	//   16   30:monitorexit     
		return s;
	//   17   31:aload_1         
	//   18   32:areturn         
		Exception exception;
		exception;
	//   19   33:astore_1        
	//*  20   34:aload_0         
		throw exception;
	//   21   35:monitorexit     
	//   22   36:aload_1         
	//   23   37:athrow          
	}

	public final String b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s = b;
	//    2    2:aload_0         
	//    3    3:getfield        #27  <Field String b>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return s;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	private BigInteger a;
	private String b;
}
