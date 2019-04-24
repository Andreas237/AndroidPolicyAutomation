// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			PolyNode

static final class PolyNode$NodeType extends Enum
{

	public static PolyNode$NodeType valueOf(String s)
	{
		return (PolyNode$NodeType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/PolyNode$NodeType, s);
	//    0    0:ldc1            #2   <Class PolyNode$NodeType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PolyNode$NodeType>
	//    4    9:areturn         
	}

	public static PolyNode$NodeType[] values()
	{
		return (PolyNode$NodeType[])((PolyNode$NodeType []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field PolyNode$NodeType[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.PolyNode$NodeType_3B_.clone()>
	//    2    6:checkcast       #42  <Class PolyNode$NodeType[]>
	//    3    9:areturn         
	}

	private static final PolyNode$NodeType $VALUES[];
	public static final PolyNode$NodeType ANY;
	public static final PolyNode$NodeType CLOSED;
	public static final PolyNode$NodeType OPEN;

	static 
	{
		ANY = new PolyNode$NodeType("ANY", 0);
	//    0    0:new             #2   <Class PolyNode$NodeType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "ANY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void PolyNode$NodeType(String, int)>
	//    5   10:putstatic       #23  <Field PolyNode$NodeType ANY>
		OPEN = new PolyNode$NodeType("OPEN", 1);
	//    6   13:new             #2   <Class PolyNode$NodeType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "OPEN">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void PolyNode$NodeType(String, int)>
	//   11   23:putstatic       #26  <Field PolyNode$NodeType OPEN>
		CLOSED = new PolyNode$NodeType("CLOSED", 2);
	//   12   26:new             #2   <Class PolyNode$NodeType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "CLOSED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void PolyNode$NodeType(String, int)>
	//   17   36:putstatic       #29  <Field PolyNode$NodeType CLOSED>
		$VALUES = (new PolyNode$NodeType[] {
			ANY, OPEN, CLOSED
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       PolyNode$NodeType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field PolyNode$NodeType ANY>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field PolyNode$NodeType OPEN>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field PolyNode$NodeType CLOSED>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field PolyNode$NodeType[] $VALUES>
	//*  33   64:return          
	}

	private PolyNode$NodeType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
