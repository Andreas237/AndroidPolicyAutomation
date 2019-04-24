// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;


// Referenced classes of package com.itextpdf.text.pdf.security:
//			MakeSignature

public static final class MakeSignature$CryptoStandard extends Enum
{

	public static MakeSignature$CryptoStandard valueOf(String s)
	{
		return (MakeSignature$CryptoStandard)Enum.valueOf(com/itextpdf/text/pdf/security/MakeSignature$CryptoStandard, s);
	//    0    0:ldc1            #2   <Class MakeSignature$CryptoStandard>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MakeSignature$CryptoStandard>
	//    4    9:areturn         
	}

	public static MakeSignature$CryptoStandard[] values()
	{
		return (MakeSignature$CryptoStandard[])((MakeSignature$CryptoStandard []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field MakeSignature$CryptoStandard[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.itextpdf.text.pdf.security.MakeSignature$CryptoStandard_3B_.clone()>
	//    2    6:checkcast       #38  <Class MakeSignature$CryptoStandard[]>
	//    3    9:areturn         
	}

	private static final MakeSignature$CryptoStandard $VALUES[];
	public static final MakeSignature$CryptoStandard CADES;
	public static final MakeSignature$CryptoStandard CMS;

	static 
	{
		CMS = new MakeSignature$CryptoStandard("CMS", 0);
	//    0    0:new             #2   <Class MakeSignature$CryptoStandard>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "CMS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void MakeSignature$CryptoStandard(String, int)>
	//    5   10:putstatic       #22  <Field MakeSignature$CryptoStandard CMS>
		CADES = new MakeSignature$CryptoStandard("CADES", 1);
	//    6   13:new             #2   <Class MakeSignature$CryptoStandard>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "CADES">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void MakeSignature$CryptoStandard(String, int)>
	//   11   23:putstatic       #25  <Field MakeSignature$CryptoStandard CADES>
		$VALUES = (new MakeSignature$CryptoStandard[] {
			CMS, CADES
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       MakeSignature$CryptoStandard[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field MakeSignature$CryptoStandard CMS>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field MakeSignature$CryptoStandard CADES>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field MakeSignature$CryptoStandard[] $VALUES>
	//*  23   45:return          
	}

	private MakeSignature$CryptoStandard(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
