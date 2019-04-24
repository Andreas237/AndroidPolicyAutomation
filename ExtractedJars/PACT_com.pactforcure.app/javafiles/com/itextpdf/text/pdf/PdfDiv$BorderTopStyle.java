// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDiv

public static final class PdfDiv$BorderTopStyle extends Enum
{

	public static PdfDiv$BorderTopStyle valueOf(String s)
	{
		return (PdfDiv$BorderTopStyle)Enum.valueOf(com/itextpdf/text/pdf/PdfDiv$BorderTopStyle, s);
	//    0    0:ldc1            #2   <Class PdfDiv$BorderTopStyle>
	//    1    2:aload_0         
	//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PdfDiv$BorderTopStyle>
	//    4    9:areturn         
	}

	public static PdfDiv$BorderTopStyle[] values()
	{
		return (PdfDiv$BorderTopStyle[])((PdfDiv$BorderTopStyle []) ($VALUES)).clone();
	//    0    0:getstatic       #51  <Field PdfDiv$BorderTopStyle[] $VALUES>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfDiv$BorderTopStyle_3B_.clone()>
	//    2    6:checkcast       #62  <Class PdfDiv$BorderTopStyle[]>
	//    3    9:areturn         
	}

	private static final PdfDiv$BorderTopStyle $VALUES[];
	public static final PdfDiv$BorderTopStyle DASHED;
	public static final PdfDiv$BorderTopStyle DOTTED;
	public static final PdfDiv$BorderTopStyle DOUBLE;
	public static final PdfDiv$BorderTopStyle GROOVE;
	public static final PdfDiv$BorderTopStyle INSET;
	public static final PdfDiv$BorderTopStyle OUTSET;
	public static final PdfDiv$BorderTopStyle RIDGE;
	public static final PdfDiv$BorderTopStyle SOLID;

	static 
	{
		DOTTED = new PdfDiv$BorderTopStyle("DOTTED", 0);
	//    0    0:new             #2   <Class PdfDiv$BorderTopStyle>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "DOTTED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
	//    5   10:putstatic       #28  <Field PdfDiv$BorderTopStyle DOTTED>
		DASHED = new PdfDiv$BorderTopStyle("DASHED", 1);
	//    6   13:new             #2   <Class PdfDiv$BorderTopStyle>
	//    7   16:dup             
	//    8   17:ldc1            #29  <String "DASHED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
	//   11   23:putstatic       #31  <Field PdfDiv$BorderTopStyle DASHED>
		SOLID = new PdfDiv$BorderTopStyle("SOLID", 2);
	//   12   26:new             #2   <Class PdfDiv$BorderTopStyle>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "SOLID">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
	//   17   36:putstatic       #34  <Field PdfDiv$BorderTopStyle SOLID>
		DOUBLE = new PdfDiv$BorderTopStyle("DOUBLE", 3);
	//   18   39:new             #2   <Class PdfDiv$BorderTopStyle>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "DOUBLE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
	//   23   49:putstatic       #37  <Field PdfDiv$BorderTopStyle DOUBLE>
		GROOVE = new PdfDiv$BorderTopStyle("GROOVE", 4);
	//   24   52:new             #2   <Class PdfDiv$BorderTopStyle>
	//   25   55:dup             
	//   26   56:ldc1            #38  <String "GROOVE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
	//   29   62:putstatic       #40  <Field PdfDiv$BorderTopStyle GROOVE>
		RIDGE = new PdfDiv$BorderTopStyle("RIDGE", 5);
	//   30   65:new             #2   <Class PdfDiv$BorderTopStyle>
	//   31   68:dup             
	//   32   69:ldc1            #41  <String "RIDGE">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
	//   35   75:putstatic       #43  <Field PdfDiv$BorderTopStyle RIDGE>
		INSET = new PdfDiv$BorderTopStyle("INSET", 6);
	//   36   78:new             #2   <Class PdfDiv$BorderTopStyle>
	//   37   81:dup             
	//   38   82:ldc1            #44  <String "INSET">
	//   39   84:bipush          6
	//   40   86:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
	//   41   89:putstatic       #46  <Field PdfDiv$BorderTopStyle INSET>
		OUTSET = new PdfDiv$BorderTopStyle("OUTSET", 7);
	//   42   92:new             #2   <Class PdfDiv$BorderTopStyle>
	//   43   95:dup             
	//   44   96:ldc1            #47  <String "OUTSET">
	//   45   98:bipush          7
	//   46  100:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
	//   47  103:putstatic       #49  <Field PdfDiv$BorderTopStyle OUTSET>
		$VALUES = (new PdfDiv$BorderTopStyle[] {
			DOTTED, DASHED, SOLID, DOUBLE, GROOVE, RIDGE, INSET, OUTSET
		});
	//   48  106:bipush          8
	//   49  108:anewarray       PdfDiv$BorderTopStyle[]
	//   50  111:dup             
	//   51  112:iconst_0        
	//   52  113:getstatic       #28  <Field PdfDiv$BorderTopStyle DOTTED>
	//   53  116:aastore         
	//   54  117:dup             
	//   55  118:iconst_1        
	//   56  119:getstatic       #31  <Field PdfDiv$BorderTopStyle DASHED>
	//   57  122:aastore         
	//   58  123:dup             
	//   59  124:iconst_2        
	//   60  125:getstatic       #34  <Field PdfDiv$BorderTopStyle SOLID>
	//   61  128:aastore         
	//   62  129:dup             
	//   63  130:iconst_3        
	//   64  131:getstatic       #37  <Field PdfDiv$BorderTopStyle DOUBLE>
	//   65  134:aastore         
	//   66  135:dup             
	//   67  136:iconst_4        
	//   68  137:getstatic       #40  <Field PdfDiv$BorderTopStyle GROOVE>
	//   69  140:aastore         
	//   70  141:dup             
	//   71  142:iconst_5        
	//   72  143:getstatic       #43  <Field PdfDiv$BorderTopStyle RIDGE>
	//   73  146:aastore         
	//   74  147:dup             
	//   75  148:bipush          6
	//   76  150:getstatic       #46  <Field PdfDiv$BorderTopStyle INSET>
	//   77  153:aastore         
	//   78  154:dup             
	//   79  155:bipush          7
	//   80  157:getstatic       #49  <Field PdfDiv$BorderTopStyle OUTSET>
	//   81  160:aastore         
	//   82  161:putstatic       #51  <Field PdfDiv$BorderTopStyle[] $VALUES>
	//*  83  164:return          
	}

	private PdfDiv$BorderTopStyle(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #53  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
