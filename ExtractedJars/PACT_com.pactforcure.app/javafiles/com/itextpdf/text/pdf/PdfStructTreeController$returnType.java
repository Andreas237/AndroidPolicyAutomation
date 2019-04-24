// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStructTreeController

public static final class PdfStructTreeController$returnType extends Enum
{

	public static PdfStructTreeController$returnType valueOf(String s)
	{
		return (PdfStructTreeController$returnType)Enum.valueOf(com/itextpdf/text/pdf/PdfStructTreeController$returnType, s);
	//    0    0:ldc1            #2   <Class PdfStructTreeController$returnType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PdfStructTreeController$returnType>
	//    4    9:areturn         
	}

	public static PdfStructTreeController$returnType[] values()
	{
		return (PdfStructTreeController$returnType[])((PdfStructTreeController$returnType []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field PdfStructTreeController$returnType[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfStructTreeController$returnType_3B_.clone()>
	//    2    6:checkcast       #46  <Class PdfStructTreeController$returnType[]>
	//    3    9:areturn         
	}

	private static final PdfStructTreeController$returnType $VALUES[];
	public static final PdfStructTreeController$returnType ABOVE;
	public static final PdfStructTreeController$returnType BELOW;
	public static final PdfStructTreeController$returnType FOUND;
	public static final PdfStructTreeController$returnType NOTFOUND;

	static 
	{
		BELOW = new PdfStructTreeController$returnType("BELOW", 0);
	//    0    0:new             #2   <Class PdfStructTreeController$returnType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "BELOW">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void PdfStructTreeController$returnType(String, int)>
	//    5   10:putstatic       #24  <Field PdfStructTreeController$returnType BELOW>
		FOUND = new PdfStructTreeController$returnType("FOUND", 1);
	//    6   13:new             #2   <Class PdfStructTreeController$returnType>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "FOUND">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void PdfStructTreeController$returnType(String, int)>
	//   11   23:putstatic       #27  <Field PdfStructTreeController$returnType FOUND>
		ABOVE = new PdfStructTreeController$returnType("ABOVE", 2);
	//   12   26:new             #2   <Class PdfStructTreeController$returnType>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "ABOVE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void PdfStructTreeController$returnType(String, int)>
	//   17   36:putstatic       #30  <Field PdfStructTreeController$returnType ABOVE>
		NOTFOUND = new PdfStructTreeController$returnType("NOTFOUND", 3);
	//   18   39:new             #2   <Class PdfStructTreeController$returnType>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "NOTFOUND">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void PdfStructTreeController$returnType(String, int)>
	//   23   49:putstatic       #33  <Field PdfStructTreeController$returnType NOTFOUND>
		$VALUES = (new PdfStructTreeController$returnType[] {
			BELOW, FOUND, ABOVE, NOTFOUND
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       PdfStructTreeController$returnType[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field PdfStructTreeController$returnType BELOW>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field PdfStructTreeController$returnType FOUND>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field PdfStructTreeController$returnType ABOVE>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field PdfStructTreeController$returnType NOTFOUND>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field PdfStructTreeController$returnType[] $VALUES>
	//*  43   83:return          
	}

	private PdfStructTreeController$returnType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
