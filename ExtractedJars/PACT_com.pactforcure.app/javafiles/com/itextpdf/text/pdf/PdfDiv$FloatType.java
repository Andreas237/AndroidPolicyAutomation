// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDiv

public static final class PdfDiv$FloatType extends Enum
{

	public static PdfDiv$FloatType valueOf(String s)
	{
		return (PdfDiv$FloatType)Enum.valueOf(com/itextpdf/text/pdf/PdfDiv$FloatType, s);
	//    0    0:ldc1            #2   <Class PdfDiv$FloatType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PdfDiv$FloatType>
	//    4    9:areturn         
	}

	public static PdfDiv$FloatType[] values()
	{
		return (PdfDiv$FloatType[])((PdfDiv$FloatType []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field PdfDiv$FloatType[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfDiv$FloatType_3B_.clone()>
	//    2    6:checkcast       #42  <Class PdfDiv$FloatType[]>
	//    3    9:areturn         
	}

	private static final PdfDiv$FloatType $VALUES[];
	public static final PdfDiv$FloatType LEFT;
	public static final PdfDiv$FloatType NONE;
	public static final PdfDiv$FloatType RIGHT;

	static 
	{
		NONE = new PdfDiv$FloatType("NONE", 0);
	//    0    0:new             #2   <Class PdfDiv$FloatType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void PdfDiv$FloatType(String, int)>
	//    5   10:putstatic       #23  <Field PdfDiv$FloatType NONE>
		LEFT = new PdfDiv$FloatType("LEFT", 1);
	//    6   13:new             #2   <Class PdfDiv$FloatType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "LEFT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void PdfDiv$FloatType(String, int)>
	//   11   23:putstatic       #26  <Field PdfDiv$FloatType LEFT>
		RIGHT = new PdfDiv$FloatType("RIGHT", 2);
	//   12   26:new             #2   <Class PdfDiv$FloatType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "RIGHT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void PdfDiv$FloatType(String, int)>
	//   17   36:putstatic       #29  <Field PdfDiv$FloatType RIGHT>
		$VALUES = (new PdfDiv$FloatType[] {
			NONE, LEFT, RIGHT
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       PdfDiv$FloatType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field PdfDiv$FloatType NONE>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field PdfDiv$FloatType LEFT>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field PdfDiv$FloatType RIGHT>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field PdfDiv$FloatType[] $VALUES>
	//*  33   64:return          
	}

	private PdfDiv$FloatType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
