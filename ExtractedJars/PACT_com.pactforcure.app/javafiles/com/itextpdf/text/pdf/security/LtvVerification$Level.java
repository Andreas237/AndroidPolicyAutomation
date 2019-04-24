// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;


// Referenced classes of package com.itextpdf.text.pdf.security:
//			LtvVerification

public static final class LtvVerification$Level extends Enum
{

	public static LtvVerification$Level valueOf(String s)
	{
		return (LtvVerification$Level)Enum.valueOf(com/itextpdf/text/pdf/security/LtvVerification$Level, s);
	//    0    0:ldc1            #2   <Class LtvVerification$Level>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LtvVerification$Level>
	//    4    9:areturn         
	}

	public static LtvVerification$Level[] values()
	{
		return (LtvVerification$Level[])((LtvVerification$Level []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field LtvVerification$Level[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.security.LtvVerification$Level_3B_.clone()>
	//    2    6:checkcast       #46  <Class LtvVerification$Level[]>
	//    3    9:areturn         
	}

	private static final LtvVerification$Level $VALUES[];
	public static final LtvVerification$Level CRL;
	public static final LtvVerification$Level OCSP;
	public static final LtvVerification$Level OCSP_CRL;
	public static final LtvVerification$Level OCSP_OPTIONAL_CRL;

	static 
	{
		OCSP = new LtvVerification$Level("OCSP", 0);
	//    0    0:new             #2   <Class LtvVerification$Level>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "OCSP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void LtvVerification$Level(String, int)>
	//    5   10:putstatic       #24  <Field LtvVerification$Level OCSP>
		CRL = new LtvVerification$Level("CRL", 1);
	//    6   13:new             #2   <Class LtvVerification$Level>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "CRL">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void LtvVerification$Level(String, int)>
	//   11   23:putstatic       #27  <Field LtvVerification$Level CRL>
		OCSP_CRL = new LtvVerification$Level("OCSP_CRL", 2);
	//   12   26:new             #2   <Class LtvVerification$Level>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "OCSP_CRL">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void LtvVerification$Level(String, int)>
	//   17   36:putstatic       #30  <Field LtvVerification$Level OCSP_CRL>
		OCSP_OPTIONAL_CRL = new LtvVerification$Level("OCSP_OPTIONAL_CRL", 3);
	//   18   39:new             #2   <Class LtvVerification$Level>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "OCSP_OPTIONAL_CRL">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void LtvVerification$Level(String, int)>
	//   23   49:putstatic       #33  <Field LtvVerification$Level OCSP_OPTIONAL_CRL>
		$VALUES = (new LtvVerification$Level[] {
			OCSP, CRL, OCSP_CRL, OCSP_OPTIONAL_CRL
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       LtvVerification$Level[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field LtvVerification$Level OCSP>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field LtvVerification$Level CRL>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field LtvVerification$Level OCSP_CRL>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field LtvVerification$Level OCSP_OPTIONAL_CRL>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field LtvVerification$Level[] $VALUES>
	//*  43   83:return          
	}

	private LtvVerification$Level(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
