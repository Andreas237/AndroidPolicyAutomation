// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Clipper

public static final class Clipper$PolyType extends Enum
{

	public static Clipper$PolyType valueOf(String s)
	{
		return (Clipper$PolyType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Clipper$PolyType, s);
	//    0    0:ldc1            #2   <Class Clipper$PolyType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Clipper$PolyType>
	//    4    9:areturn         
	}

	public static Clipper$PolyType[] values()
	{
		return (Clipper$PolyType[])((Clipper$PolyType []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field Clipper$PolyType[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Clipper$PolyType_3B_.clone()>
	//    2    6:checkcast       #38  <Class Clipper$PolyType[]>
	//    3    9:areturn         
	}

	private static final Clipper$PolyType $VALUES[];
	public static final Clipper$PolyType CLIP;
	public static final Clipper$PolyType SUBJECT;

	static 
	{
		SUBJECT = new Clipper$PolyType("SUBJECT", 0);
	//    0    0:new             #2   <Class Clipper$PolyType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "SUBJECT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void Clipper$PolyType(String, int)>
	//    5   10:putstatic       #22  <Field Clipper$PolyType SUBJECT>
		CLIP = new Clipper$PolyType("CLIP", 1);
	//    6   13:new             #2   <Class Clipper$PolyType>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "CLIP">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void Clipper$PolyType(String, int)>
	//   11   23:putstatic       #25  <Field Clipper$PolyType CLIP>
		$VALUES = (new Clipper$PolyType[] {
			SUBJECT, CLIP
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       Clipper$PolyType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field Clipper$PolyType SUBJECT>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field Clipper$PolyType CLIP>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field Clipper$PolyType[] $VALUES>
	//*  23   45:return          
	}

	private Clipper$PolyType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
