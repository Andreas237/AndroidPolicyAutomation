// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDiv

public static final class PdfDiv$DisplayType extends Enum
{

	public static PdfDiv$DisplayType valueOf(String s)
	{
		return (PdfDiv$DisplayType)Enum.valueOf(com/itextpdf/text/pdf/PdfDiv$DisplayType, s);
	//    0    0:ldc1            #2   <Class PdfDiv$DisplayType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #91  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PdfDiv$DisplayType>
	//    4    9:areturn         
	}

	public static PdfDiv$DisplayType[] values()
	{
		return (PdfDiv$DisplayType[])((PdfDiv$DisplayType []) ($VALUES)).clone();
	//    0    0:getstatic       #83  <Field PdfDiv$DisplayType[] $VALUES>
	//    1    3:invokevirtual   #98  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfDiv$DisplayType_3B_.clone()>
	//    2    6:checkcast       #94  <Class PdfDiv$DisplayType[]>
	//    3    9:areturn         
	}

	private static final PdfDiv$DisplayType $VALUES[];
	public static final PdfDiv$DisplayType BLOCK;
	public static final PdfDiv$DisplayType INLINE;
	public static final PdfDiv$DisplayType INLINE_BLOCK;
	public static final PdfDiv$DisplayType INLINE_TABLE;
	public static final PdfDiv$DisplayType LIST_ITEM;
	public static final PdfDiv$DisplayType NONE;
	public static final PdfDiv$DisplayType RUN_IN;
	public static final PdfDiv$DisplayType TABLE;
	public static final PdfDiv$DisplayType TABLE_CAPTION;
	public static final PdfDiv$DisplayType TABLE_CELL;
	public static final PdfDiv$DisplayType TABLE_COLUMN;
	public static final PdfDiv$DisplayType TABLE_COLUMN_GROUP;
	public static final PdfDiv$DisplayType TABLE_FOOTER_GROUP;
	public static final PdfDiv$DisplayType TABLE_HEADER_GROUP;
	public static final PdfDiv$DisplayType TABLE_ROW;
	public static final PdfDiv$DisplayType TABLE_ROW_GROUP;

	static 
	{
		NONE = new PdfDiv$DisplayType("NONE", 0);
	//    0    0:new             #2   <Class PdfDiv$DisplayType>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//    5   10:putstatic       #36  <Field PdfDiv$DisplayType NONE>
		BLOCK = new PdfDiv$DisplayType("BLOCK", 1);
	//    6   13:new             #2   <Class PdfDiv$DisplayType>
	//    7   16:dup             
	//    8   17:ldc1            #37  <String "BLOCK">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   11   23:putstatic       #39  <Field PdfDiv$DisplayType BLOCK>
		INLINE = new PdfDiv$DisplayType("INLINE", 2);
	//   12   26:new             #2   <Class PdfDiv$DisplayType>
	//   13   29:dup             
	//   14   30:ldc1            #40  <String "INLINE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   17   36:putstatic       #42  <Field PdfDiv$DisplayType INLINE>
		INLINE_BLOCK = new PdfDiv$DisplayType("INLINE_BLOCK", 3);
	//   18   39:new             #2   <Class PdfDiv$DisplayType>
	//   19   42:dup             
	//   20   43:ldc1            #43  <String "INLINE_BLOCK">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   23   49:putstatic       #45  <Field PdfDiv$DisplayType INLINE_BLOCK>
		INLINE_TABLE = new PdfDiv$DisplayType("INLINE_TABLE", 4);
	//   24   52:new             #2   <Class PdfDiv$DisplayType>
	//   25   55:dup             
	//   26   56:ldc1            #46  <String "INLINE_TABLE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   29   62:putstatic       #48  <Field PdfDiv$DisplayType INLINE_TABLE>
		LIST_ITEM = new PdfDiv$DisplayType("LIST_ITEM", 5);
	//   30   65:new             #2   <Class PdfDiv$DisplayType>
	//   31   68:dup             
	//   32   69:ldc1            #49  <String "LIST_ITEM">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   35   75:putstatic       #51  <Field PdfDiv$DisplayType LIST_ITEM>
		RUN_IN = new PdfDiv$DisplayType("RUN_IN", 6);
	//   36   78:new             #2   <Class PdfDiv$DisplayType>
	//   37   81:dup             
	//   38   82:ldc1            #52  <String "RUN_IN">
	//   39   84:bipush          6
	//   40   86:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   41   89:putstatic       #54  <Field PdfDiv$DisplayType RUN_IN>
		TABLE = new PdfDiv$DisplayType("TABLE", 7);
	//   42   92:new             #2   <Class PdfDiv$DisplayType>
	//   43   95:dup             
	//   44   96:ldc1            #55  <String "TABLE">
	//   45   98:bipush          7
	//   46  100:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   47  103:putstatic       #57  <Field PdfDiv$DisplayType TABLE>
		TABLE_CAPTION = new PdfDiv$DisplayType("TABLE_CAPTION", 8);
	//   48  106:new             #2   <Class PdfDiv$DisplayType>
	//   49  109:dup             
	//   50  110:ldc1            #58  <String "TABLE_CAPTION">
	//   51  112:bipush          8
	//   52  114:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   53  117:putstatic       #60  <Field PdfDiv$DisplayType TABLE_CAPTION>
		TABLE_CELL = new PdfDiv$DisplayType("TABLE_CELL", 9);
	//   54  120:new             #2   <Class PdfDiv$DisplayType>
	//   55  123:dup             
	//   56  124:ldc1            #61  <String "TABLE_CELL">
	//   57  126:bipush          9
	//   58  128:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   59  131:putstatic       #63  <Field PdfDiv$DisplayType TABLE_CELL>
		TABLE_COLUMN_GROUP = new PdfDiv$DisplayType("TABLE_COLUMN_GROUP", 10);
	//   60  134:new             #2   <Class PdfDiv$DisplayType>
	//   61  137:dup             
	//   62  138:ldc1            #64  <String "TABLE_COLUMN_GROUP">
	//   63  140:bipush          10
	//   64  142:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   65  145:putstatic       #66  <Field PdfDiv$DisplayType TABLE_COLUMN_GROUP>
		TABLE_COLUMN = new PdfDiv$DisplayType("TABLE_COLUMN", 11);
	//   66  148:new             #2   <Class PdfDiv$DisplayType>
	//   67  151:dup             
	//   68  152:ldc1            #67  <String "TABLE_COLUMN">
	//   69  154:bipush          11
	//   70  156:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   71  159:putstatic       #69  <Field PdfDiv$DisplayType TABLE_COLUMN>
		TABLE_FOOTER_GROUP = new PdfDiv$DisplayType("TABLE_FOOTER_GROUP", 12);
	//   72  162:new             #2   <Class PdfDiv$DisplayType>
	//   73  165:dup             
	//   74  166:ldc1            #70  <String "TABLE_FOOTER_GROUP">
	//   75  168:bipush          12
	//   76  170:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   77  173:putstatic       #72  <Field PdfDiv$DisplayType TABLE_FOOTER_GROUP>
		TABLE_HEADER_GROUP = new PdfDiv$DisplayType("TABLE_HEADER_GROUP", 13);
	//   78  176:new             #2   <Class PdfDiv$DisplayType>
	//   79  179:dup             
	//   80  180:ldc1            #73  <String "TABLE_HEADER_GROUP">
	//   81  182:bipush          13
	//   82  184:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   83  187:putstatic       #75  <Field PdfDiv$DisplayType TABLE_HEADER_GROUP>
		TABLE_ROW = new PdfDiv$DisplayType("TABLE_ROW", 14);
	//   84  190:new             #2   <Class PdfDiv$DisplayType>
	//   85  193:dup             
	//   86  194:ldc1            #76  <String "TABLE_ROW">
	//   87  196:bipush          14
	//   88  198:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   89  201:putstatic       #78  <Field PdfDiv$DisplayType TABLE_ROW>
		TABLE_ROW_GROUP = new PdfDiv$DisplayType("TABLE_ROW_GROUP", 15);
	//   90  204:new             #2   <Class PdfDiv$DisplayType>
	//   91  207:dup             
	//   92  208:ldc1            #79  <String "TABLE_ROW_GROUP">
	//   93  210:bipush          15
	//   94  212:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
	//   95  215:putstatic       #81  <Field PdfDiv$DisplayType TABLE_ROW_GROUP>
		$VALUES = (new PdfDiv$DisplayType[] {
			NONE, BLOCK, INLINE, INLINE_BLOCK, INLINE_TABLE, LIST_ITEM, RUN_IN, TABLE, TABLE_CAPTION, TABLE_CELL, 
			TABLE_COLUMN_GROUP, TABLE_COLUMN, TABLE_FOOTER_GROUP, TABLE_HEADER_GROUP, TABLE_ROW, TABLE_ROW_GROUP
		});
	//   96  218:bipush          16
	//   97  220:anewarray       PdfDiv$DisplayType[]
	//   98  223:dup             
	//   99  224:iconst_0        
	//  100  225:getstatic       #36  <Field PdfDiv$DisplayType NONE>
	//  101  228:aastore         
	//  102  229:dup             
	//  103  230:iconst_1        
	//  104  231:getstatic       #39  <Field PdfDiv$DisplayType BLOCK>
	//  105  234:aastore         
	//  106  235:dup             
	//  107  236:iconst_2        
	//  108  237:getstatic       #42  <Field PdfDiv$DisplayType INLINE>
	//  109  240:aastore         
	//  110  241:dup             
	//  111  242:iconst_3        
	//  112  243:getstatic       #45  <Field PdfDiv$DisplayType INLINE_BLOCK>
	//  113  246:aastore         
	//  114  247:dup             
	//  115  248:iconst_4        
	//  116  249:getstatic       #48  <Field PdfDiv$DisplayType INLINE_TABLE>
	//  117  252:aastore         
	//  118  253:dup             
	//  119  254:iconst_5        
	//  120  255:getstatic       #51  <Field PdfDiv$DisplayType LIST_ITEM>
	//  121  258:aastore         
	//  122  259:dup             
	//  123  260:bipush          6
	//  124  262:getstatic       #54  <Field PdfDiv$DisplayType RUN_IN>
	//  125  265:aastore         
	//  126  266:dup             
	//  127  267:bipush          7
	//  128  269:getstatic       #57  <Field PdfDiv$DisplayType TABLE>
	//  129  272:aastore         
	//  130  273:dup             
	//  131  274:bipush          8
	//  132  276:getstatic       #60  <Field PdfDiv$DisplayType TABLE_CAPTION>
	//  133  279:aastore         
	//  134  280:dup             
	//  135  281:bipush          9
	//  136  283:getstatic       #63  <Field PdfDiv$DisplayType TABLE_CELL>
	//  137  286:aastore         
	//  138  287:dup             
	//  139  288:bipush          10
	//  140  290:getstatic       #66  <Field PdfDiv$DisplayType TABLE_COLUMN_GROUP>
	//  141  293:aastore         
	//  142  294:dup             
	//  143  295:bipush          11
	//  144  297:getstatic       #69  <Field PdfDiv$DisplayType TABLE_COLUMN>
	//  145  300:aastore         
	//  146  301:dup             
	//  147  302:bipush          12
	//  148  304:getstatic       #72  <Field PdfDiv$DisplayType TABLE_FOOTER_GROUP>
	//  149  307:aastore         
	//  150  308:dup             
	//  151  309:bipush          13
	//  152  311:getstatic       #75  <Field PdfDiv$DisplayType TABLE_HEADER_GROUP>
	//  153  314:aastore         
	//  154  315:dup             
	//  155  316:bipush          14
	//  156  318:getstatic       #78  <Field PdfDiv$DisplayType TABLE_ROW>
	//  157  321:aastore         
	//  158  322:dup             
	//  159  323:bipush          15
	//  160  325:getstatic       #81  <Field PdfDiv$DisplayType TABLE_ROW_GROUP>
	//  161  328:aastore         
	//  162  329:putstatic       #83  <Field PdfDiv$DisplayType[] $VALUES>
	//* 163  332:return          
	}

	private PdfDiv$DisplayType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #85  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
