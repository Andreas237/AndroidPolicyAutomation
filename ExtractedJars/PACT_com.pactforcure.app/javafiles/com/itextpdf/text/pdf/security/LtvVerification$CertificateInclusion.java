// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;


// Referenced classes of package com.itextpdf.text.pdf.security:
//			LtvVerification

public static final class LtvVerification$CertificateInclusion extends Enum
{

	public static LtvVerification$CertificateInclusion valueOf(String s)
	{
		return (LtvVerification$CertificateInclusion)Enum.valueOf(com/itextpdf/text/pdf/security/LtvVerification$CertificateInclusion, s);
	//    0    0:ldc1            #2   <Class LtvVerification$CertificateInclusion>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LtvVerification$CertificateInclusion>
	//    4    9:areturn         
	}

	public static LtvVerification$CertificateInclusion[] values()
	{
		return (LtvVerification$CertificateInclusion[])((LtvVerification$CertificateInclusion []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field LtvVerification$CertificateInclusion[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.itextpdf.text.pdf.security.LtvVerification$CertificateInclusion_3B_.clone()>
	//    2    6:checkcast       #38  <Class LtvVerification$CertificateInclusion[]>
	//    3    9:areturn         
	}

	private static final LtvVerification$CertificateInclusion $VALUES[];
	public static final LtvVerification$CertificateInclusion NO;
	public static final LtvVerification$CertificateInclusion YES;

	static 
	{
		YES = new LtvVerification$CertificateInclusion("YES", 0);
	//    0    0:new             #2   <Class LtvVerification$CertificateInclusion>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "YES">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void LtvVerification$CertificateInclusion(String, int)>
	//    5   10:putstatic       #22  <Field LtvVerification$CertificateInclusion YES>
		NO = new LtvVerification$CertificateInclusion("NO", 1);
	//    6   13:new             #2   <Class LtvVerification$CertificateInclusion>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "NO">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void LtvVerification$CertificateInclusion(String, int)>
	//   11   23:putstatic       #25  <Field LtvVerification$CertificateInclusion NO>
		$VALUES = (new LtvVerification$CertificateInclusion[] {
			YES, NO
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       LtvVerification$CertificateInclusion[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field LtvVerification$CertificateInclusion YES>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field LtvVerification$CertificateInclusion NO>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field LtvVerification$CertificateInclusion[] $VALUES>
	//*  23   45:return          
	}

	private LtvVerification$CertificateInclusion(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
