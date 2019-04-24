// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PRTokeniser

public static final class PRTokeniser$TokenType extends Enum
{

	public static PRTokeniser$TokenType valueOf(String s)
	{
		return (PRTokeniser$TokenType)Enum.valueOf(com/itextpdf/text/pdf/PRTokeniser$TokenType, s);
	//    0    0:ldc1            #2   <Class PRTokeniser$TokenType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PRTokeniser$TokenType>
	//    4    9:areturn         
	}

	public static PRTokeniser$TokenType[] values()
	{
		return (PRTokeniser$TokenType[])((PRTokeniser$TokenType []) ($VALUES)).clone();
	//    0    0:getstatic       #63  <Field PRTokeniser$TokenType[] $VALUES>
	//    1    3:invokevirtual   #78  <Method Object _5B_Lcom.itextpdf.text.pdf.PRTokeniser$TokenType_3B_.clone()>
	//    2    6:checkcast       #74  <Class PRTokeniser$TokenType[]>
	//    3    9:areturn         
	}

	private static final PRTokeniser$TokenType $VALUES[];
	public static final PRTokeniser$TokenType COMMENT;
	public static final PRTokeniser$TokenType ENDOFFILE;
	public static final PRTokeniser$TokenType END_ARRAY;
	public static final PRTokeniser$TokenType END_DIC;
	public static final PRTokeniser$TokenType NAME;
	public static final PRTokeniser$TokenType NUMBER;
	public static final PRTokeniser$TokenType OTHER;
	public static final PRTokeniser$TokenType REF;
	public static final PRTokeniser$TokenType START_ARRAY;
	public static final PRTokeniser$TokenType START_DIC;
	public static final PRTokeniser$TokenType STRING;

	static 
	{
		NUMBER = new PRTokeniser$TokenType("NUMBER", 0);
	//    0    0:new             #2   <Class PRTokeniser$TokenType>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "NUMBER">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
	//    5   10:putstatic       #31  <Field PRTokeniser$TokenType NUMBER>
		STRING = new PRTokeniser$TokenType("STRING", 1);
	//    6   13:new             #2   <Class PRTokeniser$TokenType>
	//    7   16:dup             
	//    8   17:ldc1            #32  <String "STRING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
	//   11   23:putstatic       #34  <Field PRTokeniser$TokenType STRING>
		NAME = new PRTokeniser$TokenType("NAME", 2);
	//   12   26:new             #2   <Class PRTokeniser$TokenType>
	//   13   29:dup             
	//   14   30:ldc1            #35  <String "NAME">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
	//   17   36:putstatic       #37  <Field PRTokeniser$TokenType NAME>
		COMMENT = new PRTokeniser$TokenType("COMMENT", 3);
	//   18   39:new             #2   <Class PRTokeniser$TokenType>
	//   19   42:dup             
	//   20   43:ldc1            #38  <String "COMMENT">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
	//   23   49:putstatic       #40  <Field PRTokeniser$TokenType COMMENT>
		START_ARRAY = new PRTokeniser$TokenType("START_ARRAY", 4);
	//   24   52:new             #2   <Class PRTokeniser$TokenType>
	//   25   55:dup             
	//   26   56:ldc1            #41  <String "START_ARRAY">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
	//   29   62:putstatic       #43  <Field PRTokeniser$TokenType START_ARRAY>
		END_ARRAY = new PRTokeniser$TokenType("END_ARRAY", 5);
	//   30   65:new             #2   <Class PRTokeniser$TokenType>
	//   31   68:dup             
	//   32   69:ldc1            #44  <String "END_ARRAY">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
	//   35   75:putstatic       #46  <Field PRTokeniser$TokenType END_ARRAY>
		START_DIC = new PRTokeniser$TokenType("START_DIC", 6);
	//   36   78:new             #2   <Class PRTokeniser$TokenType>
	//   37   81:dup             
	//   38   82:ldc1            #47  <String "START_DIC">
	//   39   84:bipush          6
	//   40   86:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
	//   41   89:putstatic       #49  <Field PRTokeniser$TokenType START_DIC>
		END_DIC = new PRTokeniser$TokenType("END_DIC", 7);
	//   42   92:new             #2   <Class PRTokeniser$TokenType>
	//   43   95:dup             
	//   44   96:ldc1            #50  <String "END_DIC">
	//   45   98:bipush          7
	//   46  100:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
	//   47  103:putstatic       #52  <Field PRTokeniser$TokenType END_DIC>
		REF = new PRTokeniser$TokenType("REF", 8);
	//   48  106:new             #2   <Class PRTokeniser$TokenType>
	//   49  109:dup             
	//   50  110:ldc1            #53  <String "REF">
	//   51  112:bipush          8
	//   52  114:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
	//   53  117:putstatic       #55  <Field PRTokeniser$TokenType REF>
		OTHER = new PRTokeniser$TokenType("OTHER", 9);
	//   54  120:new             #2   <Class PRTokeniser$TokenType>
	//   55  123:dup             
	//   56  124:ldc1            #56  <String "OTHER">
	//   57  126:bipush          9
	//   58  128:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
	//   59  131:putstatic       #58  <Field PRTokeniser$TokenType OTHER>
		ENDOFFILE = new PRTokeniser$TokenType("ENDOFFILE", 10);
	//   60  134:new             #2   <Class PRTokeniser$TokenType>
	//   61  137:dup             
	//   62  138:ldc1            #59  <String "ENDOFFILE">
	//   63  140:bipush          10
	//   64  142:invokespecial   #29  <Method void PRTokeniser$TokenType(String, int)>
	//   65  145:putstatic       #61  <Field PRTokeniser$TokenType ENDOFFILE>
		$VALUES = (new PRTokeniser$TokenType[] {
			NUMBER, STRING, NAME, COMMENT, START_ARRAY, END_ARRAY, START_DIC, END_DIC, REF, OTHER, 
			ENDOFFILE
		});
	//   66  148:bipush          11
	//   67  150:anewarray       PRTokeniser$TokenType[]
	//   68  153:dup             
	//   69  154:iconst_0        
	//   70  155:getstatic       #31  <Field PRTokeniser$TokenType NUMBER>
	//   71  158:aastore         
	//   72  159:dup             
	//   73  160:iconst_1        
	//   74  161:getstatic       #34  <Field PRTokeniser$TokenType STRING>
	//   75  164:aastore         
	//   76  165:dup             
	//   77  166:iconst_2        
	//   78  167:getstatic       #37  <Field PRTokeniser$TokenType NAME>
	//   79  170:aastore         
	//   80  171:dup             
	//   81  172:iconst_3        
	//   82  173:getstatic       #40  <Field PRTokeniser$TokenType COMMENT>
	//   83  176:aastore         
	//   84  177:dup             
	//   85  178:iconst_4        
	//   86  179:getstatic       #43  <Field PRTokeniser$TokenType START_ARRAY>
	//   87  182:aastore         
	//   88  183:dup             
	//   89  184:iconst_5        
	//   90  185:getstatic       #46  <Field PRTokeniser$TokenType END_ARRAY>
	//   91  188:aastore         
	//   92  189:dup             
	//   93  190:bipush          6
	//   94  192:getstatic       #49  <Field PRTokeniser$TokenType START_DIC>
	//   95  195:aastore         
	//   96  196:dup             
	//   97  197:bipush          7
	//   98  199:getstatic       #52  <Field PRTokeniser$TokenType END_DIC>
	//   99  202:aastore         
	//  100  203:dup             
	//  101  204:bipush          8
	//  102  206:getstatic       #55  <Field PRTokeniser$TokenType REF>
	//  103  209:aastore         
	//  104  210:dup             
	//  105  211:bipush          9
	//  106  213:getstatic       #58  <Field PRTokeniser$TokenType OTHER>
	//  107  216:aastore         
	//  108  217:dup             
	//  109  218:bipush          10
	//  110  220:getstatic       #61  <Field PRTokeniser$TokenType ENDOFFILE>
	//  111  223:aastore         
	//  112  224:putstatic       #63  <Field PRTokeniser$TokenType[] $VALUES>
	//* 113  227:return          
	}

	private PRTokeniser$TokenType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #65  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
