// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class dv
{

	public static BigDecimal a(BigDecimal bigdecimal)
	{
		return bigdecimal.setScale(2, RoundingMode.HALF_UP);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:getstatic       #26  <Field RoundingMode RoundingMode.HALF_UP>
	//    3    5:invokevirtual   #30  <Method BigDecimal BigDecimal.setScale(int, RoundingMode)>
	//    4    8:areturn         
	}

	private static final BigDecimal a = new BigDecimal("100");

	static 
	{
	//    0    0:new             #10  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:ldc1            #12  <String "100">
	//    3    6:invokespecial   #16  <Method void BigDecimal(String)>
	//    4    9:putstatic       #18  <Field BigDecimal a>
	//*   5   12:return          
	}
}
