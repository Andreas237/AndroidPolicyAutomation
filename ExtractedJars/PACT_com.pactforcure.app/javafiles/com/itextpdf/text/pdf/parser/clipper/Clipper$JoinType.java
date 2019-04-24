// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Clipper

public static final class Clipper$JoinType extends Enum
{

	public static Clipper$JoinType valueOf(String s)
	{
		return (Clipper$JoinType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Clipper$JoinType, s);
	//    0    0:ldc1            #2   <Class Clipper$JoinType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Clipper$JoinType>
	//    4    9:areturn         
	}

	public static Clipper$JoinType[] values()
	{
		return (Clipper$JoinType[])((Clipper$JoinType []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field Clipper$JoinType[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Clipper$JoinType_3B_.clone()>
	//    2    6:checkcast       #42  <Class Clipper$JoinType[]>
	//    3    9:areturn         
	}

	private static final Clipper$JoinType $VALUES[];
	public static final Clipper$JoinType BEVEL;
	public static final Clipper$JoinType MITER;
	public static final Clipper$JoinType ROUND;

	static 
	{
		BEVEL = new Clipper$JoinType("BEVEL", 0);
	//    0    0:new             #2   <Class Clipper$JoinType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "BEVEL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void Clipper$JoinType(String, int)>
	//    5   10:putstatic       #23  <Field Clipper$JoinType BEVEL>
		ROUND = new Clipper$JoinType("ROUND", 1);
	//    6   13:new             #2   <Class Clipper$JoinType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "ROUND">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void Clipper$JoinType(String, int)>
	//   11   23:putstatic       #26  <Field Clipper$JoinType ROUND>
		MITER = new Clipper$JoinType("MITER", 2);
	//   12   26:new             #2   <Class Clipper$JoinType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "MITER">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void Clipper$JoinType(String, int)>
	//   17   36:putstatic       #29  <Field Clipper$JoinType MITER>
		$VALUES = (new Clipper$JoinType[] {
			BEVEL, ROUND, MITER
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       Clipper$JoinType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field Clipper$JoinType BEVEL>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field Clipper$JoinType ROUND>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field Clipper$JoinType MITER>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field Clipper$JoinType[] $VALUES>
	//*  33   64:return          
	}

	private Clipper$JoinType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
