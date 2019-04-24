// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDiv

public static final class PdfDiv$PositionType extends Enum
{

	public static PdfDiv$PositionType valueOf(String s)
	{
		return (PdfDiv$PositionType)Enum.valueOf(com/itextpdf/text/pdf/PdfDiv$PositionType, s);
	//    0    0:ldc1            #2   <Class PdfDiv$PositionType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PdfDiv$PositionType>
	//    4    9:areturn         
	}

	public static PdfDiv$PositionType[] values()
	{
		return (PdfDiv$PositionType[])((PdfDiv$PositionType []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field PdfDiv$PositionType[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfDiv$PositionType_3B_.clone()>
	//    2    6:checkcast       #46  <Class PdfDiv$PositionType[]>
	//    3    9:areturn         
	}

	private static final PdfDiv$PositionType $VALUES[];
	public static final PdfDiv$PositionType ABSOLUTE;
	public static final PdfDiv$PositionType FIXED;
	public static final PdfDiv$PositionType RELATIVE;
	public static final PdfDiv$PositionType STATIC;

	static 
	{
		STATIC = new PdfDiv$PositionType("STATIC", 0);
	//    0    0:new             #2   <Class PdfDiv$PositionType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "STATIC">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void PdfDiv$PositionType(String, int)>
	//    5   10:putstatic       #24  <Field PdfDiv$PositionType STATIC>
		ABSOLUTE = new PdfDiv$PositionType("ABSOLUTE", 1);
	//    6   13:new             #2   <Class PdfDiv$PositionType>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "ABSOLUTE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void PdfDiv$PositionType(String, int)>
	//   11   23:putstatic       #27  <Field PdfDiv$PositionType ABSOLUTE>
		FIXED = new PdfDiv$PositionType("FIXED", 2);
	//   12   26:new             #2   <Class PdfDiv$PositionType>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "FIXED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void PdfDiv$PositionType(String, int)>
	//   17   36:putstatic       #30  <Field PdfDiv$PositionType FIXED>
		RELATIVE = new PdfDiv$PositionType("RELATIVE", 3);
	//   18   39:new             #2   <Class PdfDiv$PositionType>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "RELATIVE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void PdfDiv$PositionType(String, int)>
	//   23   49:putstatic       #33  <Field PdfDiv$PositionType RELATIVE>
		$VALUES = (new PdfDiv$PositionType[] {
			STATIC, ABSOLUTE, FIXED, RELATIVE
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       PdfDiv$PositionType[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field PdfDiv$PositionType STATIC>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field PdfDiv$PositionType ABSOLUTE>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field PdfDiv$PositionType FIXED>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field PdfDiv$PositionType RELATIVE>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field PdfDiv$PositionType[] $VALUES>
	//*  43   83:return          
	}

	private PdfDiv$PositionType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
