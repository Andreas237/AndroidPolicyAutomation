// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Clipper

public static final class Clipper$EndType extends Enum
{

	public static Clipper$EndType valueOf(String s)
	{
		return (Clipper$EndType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Clipper$EndType, s);
	//    0    0:ldc1            #2   <Class Clipper$EndType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Clipper$EndType>
	//    4    9:areturn         
	}

	public static Clipper$EndType[] values()
	{
		return (Clipper$EndType[])((Clipper$EndType []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field Clipper$EndType[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Clipper$EndType_3B_.clone()>
	//    2    6:checkcast       #50  <Class Clipper$EndType[]>
	//    3    9:areturn         
	}

	private static final Clipper$EndType $VALUES[];
	public static final Clipper$EndType CLOSED_LINE;
	public static final Clipper$EndType CLOSED_POLYGON;
	public static final Clipper$EndType OPEN_BUTT;
	public static final Clipper$EndType OPEN_ROUND;
	public static final Clipper$EndType OPEN_SQUARE;

	static 
	{
		CLOSED_POLYGON = new Clipper$EndType("CLOSED_POLYGON", 0);
	//    0    0:new             #2   <Class Clipper$EndType>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "CLOSED_POLYGON">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void Clipper$EndType(String, int)>
	//    5   10:putstatic       #25  <Field Clipper$EndType CLOSED_POLYGON>
		CLOSED_LINE = new Clipper$EndType("CLOSED_LINE", 1);
	//    6   13:new             #2   <Class Clipper$EndType>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "CLOSED_LINE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void Clipper$EndType(String, int)>
	//   11   23:putstatic       #28  <Field Clipper$EndType CLOSED_LINE>
		OPEN_BUTT = new Clipper$EndType("OPEN_BUTT", 2);
	//   12   26:new             #2   <Class Clipper$EndType>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "OPEN_BUTT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void Clipper$EndType(String, int)>
	//   17   36:putstatic       #31  <Field Clipper$EndType OPEN_BUTT>
		OPEN_SQUARE = new Clipper$EndType("OPEN_SQUARE", 3);
	//   18   39:new             #2   <Class Clipper$EndType>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "OPEN_SQUARE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void Clipper$EndType(String, int)>
	//   23   49:putstatic       #34  <Field Clipper$EndType OPEN_SQUARE>
		OPEN_ROUND = new Clipper$EndType("OPEN_ROUND", 4);
	//   24   52:new             #2   <Class Clipper$EndType>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "OPEN_ROUND">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void Clipper$EndType(String, int)>
	//   29   62:putstatic       #37  <Field Clipper$EndType OPEN_ROUND>
		$VALUES = (new Clipper$EndType[] {
			CLOSED_POLYGON, CLOSED_LINE, OPEN_BUTT, OPEN_SQUARE, OPEN_ROUND
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       Clipper$EndType[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field Clipper$EndType CLOSED_POLYGON>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field Clipper$EndType CLOSED_LINE>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field Clipper$EndType OPEN_BUTT>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field Clipper$EndType OPEN_SQUARE>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field Clipper$EndType OPEN_ROUND>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field Clipper$EndType[] $VALUES>
	//*  53  102:return          
	}

	private Clipper$EndType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
