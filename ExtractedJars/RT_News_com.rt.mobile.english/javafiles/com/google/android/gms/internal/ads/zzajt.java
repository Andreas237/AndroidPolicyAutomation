// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.math.BigInteger;

public final class zzajt
{

	public zzajt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzcqk = BigInteger.ONE;
	//    2    4:aload_0         
	//    3    5:getstatic       #19  <Field BigInteger BigInteger.ONE>
	//    4    8:putfield        #21  <Field BigInteger zzcqk>
	//    5   11:return          
	}

	public final String zzql()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s;
		s = zzcqk.toString();
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field BigInteger zzcqk>
	//    4    6:invokevirtual   #27  <Method String BigInteger.toString()>
	//    5    9:astore_1        
		zzcqk = zzcqk.add(BigInteger.ONE);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #21  <Field BigInteger zzcqk>
	//    9   15:getstatic       #19  <Field BigInteger BigInteger.ONE>
	//   10   18:invokevirtual   #31  <Method BigInteger BigInteger.add(BigInteger)>
	//   11   21:putfield        #21  <Field BigInteger zzcqk>
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return s;
	//   14   26:aload_1         
	//   15   27:areturn         
		Exception exception;
		exception;
	//   16   28:astore_1        
	//*  17   29:aload_0         
		throw exception;
	//   18   30:monitorexit     
	//   19   31:aload_1         
	//   20   32:athrow          
	}

	private BigInteger zzcqk;
}
