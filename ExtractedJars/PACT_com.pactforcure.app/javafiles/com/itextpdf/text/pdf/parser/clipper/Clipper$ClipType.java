// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Clipper

public static final class Clipper$ClipType extends Enum
{

	public static Clipper$ClipType valueOf(String s)
	{
		return (Clipper$ClipType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Clipper$ClipType, s);
	//    0    0:ldc1            #2   <Class Clipper$ClipType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Clipper$ClipType>
	//    4    9:areturn         
	}

	public static Clipper$ClipType[] values()
	{
		return (Clipper$ClipType[])((Clipper$ClipType []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field Clipper$ClipType[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Clipper$ClipType_3B_.clone()>
	//    2    6:checkcast       #46  <Class Clipper$ClipType[]>
	//    3    9:areturn         
	}

	private static final Clipper$ClipType $VALUES[];
	public static final Clipper$ClipType DIFFERENCE;
	public static final Clipper$ClipType INTERSECTION;
	public static final Clipper$ClipType UNION;
	public static final Clipper$ClipType XOR;

	static 
	{
		INTERSECTION = new Clipper$ClipType("INTERSECTION", 0);
	//    0    0:new             #2   <Class Clipper$ClipType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "INTERSECTION">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void Clipper$ClipType(String, int)>
	//    5   10:putstatic       #24  <Field Clipper$ClipType INTERSECTION>
		UNION = new Clipper$ClipType("UNION", 1);
	//    6   13:new             #2   <Class Clipper$ClipType>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "UNION">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void Clipper$ClipType(String, int)>
	//   11   23:putstatic       #27  <Field Clipper$ClipType UNION>
		DIFFERENCE = new Clipper$ClipType("DIFFERENCE", 2);
	//   12   26:new             #2   <Class Clipper$ClipType>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "DIFFERENCE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void Clipper$ClipType(String, int)>
	//   17   36:putstatic       #30  <Field Clipper$ClipType DIFFERENCE>
		XOR = new Clipper$ClipType("XOR", 3);
	//   18   39:new             #2   <Class Clipper$ClipType>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "XOR">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void Clipper$ClipType(String, int)>
	//   23   49:putstatic       #33  <Field Clipper$ClipType XOR>
		$VALUES = (new Clipper$ClipType[] {
			INTERSECTION, UNION, DIFFERENCE, XOR
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       Clipper$ClipType[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field Clipper$ClipType INTERSECTION>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field Clipper$ClipType UNION>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field Clipper$ClipType DIFFERENCE>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field Clipper$ClipType XOR>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field Clipper$ClipType[] $VALUES>
	//*  43   83:return          
	}

	private Clipper$ClipType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
