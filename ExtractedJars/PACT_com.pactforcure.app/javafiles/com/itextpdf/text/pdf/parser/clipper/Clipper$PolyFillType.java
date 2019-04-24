// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Clipper

public static final class Clipper$PolyFillType extends Enum
{

	public static Clipper$PolyFillType valueOf(String s)
	{
		return (Clipper$PolyFillType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Clipper$PolyFillType, s);
	//    0    0:ldc1            #2   <Class Clipper$PolyFillType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Clipper$PolyFillType>
	//    4    9:areturn         
	}

	public static Clipper$PolyFillType[] values()
	{
		return (Clipper$PolyFillType[])((Clipper$PolyFillType []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field Clipper$PolyFillType[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Clipper$PolyFillType_3B_.clone()>
	//    2    6:checkcast       #46  <Class Clipper$PolyFillType[]>
	//    3    9:areturn         
	}

	private static final Clipper$PolyFillType $VALUES[];
	public static final Clipper$PolyFillType EVEN_ODD;
	public static final Clipper$PolyFillType NEGATIVE;
	public static final Clipper$PolyFillType NON_ZERO;
	public static final Clipper$PolyFillType POSITIVE;

	static 
	{
		EVEN_ODD = new Clipper$PolyFillType("EVEN_ODD", 0);
	//    0    0:new             #2   <Class Clipper$PolyFillType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "EVEN_ODD">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void Clipper$PolyFillType(String, int)>
	//    5   10:putstatic       #24  <Field Clipper$PolyFillType EVEN_ODD>
		NON_ZERO = new Clipper$PolyFillType("NON_ZERO", 1);
	//    6   13:new             #2   <Class Clipper$PolyFillType>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "NON_ZERO">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void Clipper$PolyFillType(String, int)>
	//   11   23:putstatic       #27  <Field Clipper$PolyFillType NON_ZERO>
		POSITIVE = new Clipper$PolyFillType("POSITIVE", 2);
	//   12   26:new             #2   <Class Clipper$PolyFillType>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "POSITIVE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void Clipper$PolyFillType(String, int)>
	//   17   36:putstatic       #30  <Field Clipper$PolyFillType POSITIVE>
		NEGATIVE = new Clipper$PolyFillType("NEGATIVE", 3);
	//   18   39:new             #2   <Class Clipper$PolyFillType>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "NEGATIVE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void Clipper$PolyFillType(String, int)>
	//   23   49:putstatic       #33  <Field Clipper$PolyFillType NEGATIVE>
		$VALUES = (new Clipper$PolyFillType[] {
			EVEN_ODD, NON_ZERO, POSITIVE, NEGATIVE
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       Clipper$PolyFillType[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field Clipper$PolyFillType EVEN_ODD>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field Clipper$PolyFillType NON_ZERO>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field Clipper$PolyFillType POSITIVE>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field Clipper$PolyFillType NEGATIVE>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field Clipper$PolyFillType[] $VALUES>
	//*  43   83:return          
	}

	private Clipper$PolyFillType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
