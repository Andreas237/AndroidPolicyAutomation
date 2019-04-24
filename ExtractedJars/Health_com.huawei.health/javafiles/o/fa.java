// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.File;

// Referenced classes of package o:
//			ei, fb

public final class fa
{

	public static String b(String s)
	{
		String s1 = "";
	//    0    0:ldc1            #10  <String "">
	//    1    2:astore_1        
		String s2 = System.getProperty(s);
	//    2    3:aload_0         
	//    3    4:invokestatic    #15  <Method String System.getProperty(String)>
	//    4    7:astore_2        
		s1 = s2;
	//    5    8:aload_2         
	//    6    9:astore_1        
_L2:
		String s3 = s1;
	//    7   10:aload_1         
	//    8   11:astore_2        
		if(ei.b(s1))
	//*   9   12:aload_1         
	//*  10   13:invokestatic    #20  <Method boolean ei.b(String)>
	//*  11   16:ifeq            45
			s3 = fb.e((new StringBuilder(".SystemConfig")).append(File.separator).append(s).toString());
	//   12   19:new             #22  <Class StringBuilder>
	//   13   22:dup             
	//   14   23:ldc1            #24  <String ".SystemConfig">
	//   15   25:invokespecial   #28  <Method void StringBuilder(String)>
	//   16   28:getstatic       #34  <Field String File.separator>
	//   17   31:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   21   41:invokestatic    #47  <Method String fb.e(String)>
	//   22   44:astore_2        
		return s3;
	//   23   45:aload_2         
	//   24   46:areturn         
		Throwable throwable;
		throwable;
	//   25   47:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  26   48:goto            10
	}
}
