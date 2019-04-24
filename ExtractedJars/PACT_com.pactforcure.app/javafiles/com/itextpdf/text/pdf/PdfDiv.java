// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.awt.geom.AffineTransform;
import com.itextpdf.text.*;
import com.itextpdf.text.api.Spaceable;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfObject, PdfContentByte, PdfArtifact, 
//			FloatLayout, ColumnText

public class PdfDiv
	implements Element, Spaceable, IAccessibleElement
{
	public static final class BorderTopStyle extends Enum
	{

		public static BorderTopStyle valueOf(String s)
		{
			return (BorderTopStyle)Enum.valueOf(com/itextpdf/text/pdf/PdfDiv$BorderTopStyle, s);
		//    0    0:ldc1            #2   <Class PdfDiv$BorderTopStyle>
		//    1    2:aload_0         
		//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PdfDiv$BorderTopStyle>
		//    4    9:areturn         
		}

		public static BorderTopStyle[] values()
		{
			return (BorderTopStyle[])((BorderTopStyle []) ($VALUES)).clone();
		//    0    0:getstatic       #51  <Field PdfDiv$BorderTopStyle[] $VALUES>
		//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfDiv$BorderTopStyle_3B_.clone()>
		//    2    6:checkcast       #62  <Class PdfDiv$BorderTopStyle[]>
		//    3    9:areturn         
		}

		private static final BorderTopStyle $VALUES[];
		public static final BorderTopStyle DASHED;
		public static final BorderTopStyle DOTTED;
		public static final BorderTopStyle DOUBLE;
		public static final BorderTopStyle GROOVE;
		public static final BorderTopStyle INSET;
		public static final BorderTopStyle OUTSET;
		public static final BorderTopStyle RIDGE;
		public static final BorderTopStyle SOLID;

		static 
		{
			DOTTED = new BorderTopStyle("DOTTED", 0);
		//    0    0:new             #2   <Class PdfDiv$BorderTopStyle>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "DOTTED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
		//    5   10:putstatic       #28  <Field PdfDiv$BorderTopStyle DOTTED>
			DASHED = new BorderTopStyle("DASHED", 1);
		//    6   13:new             #2   <Class PdfDiv$BorderTopStyle>
		//    7   16:dup             
		//    8   17:ldc1            #29  <String "DASHED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
		//   11   23:putstatic       #31  <Field PdfDiv$BorderTopStyle DASHED>
			SOLID = new BorderTopStyle("SOLID", 2);
		//   12   26:new             #2   <Class PdfDiv$BorderTopStyle>
		//   13   29:dup             
		//   14   30:ldc1            #32  <String "SOLID">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
		//   17   36:putstatic       #34  <Field PdfDiv$BorderTopStyle SOLID>
			DOUBLE = new BorderTopStyle("DOUBLE", 3);
		//   18   39:new             #2   <Class PdfDiv$BorderTopStyle>
		//   19   42:dup             
		//   20   43:ldc1            #35  <String "DOUBLE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
		//   23   49:putstatic       #37  <Field PdfDiv$BorderTopStyle DOUBLE>
			GROOVE = new BorderTopStyle("GROOVE", 4);
		//   24   52:new             #2   <Class PdfDiv$BorderTopStyle>
		//   25   55:dup             
		//   26   56:ldc1            #38  <String "GROOVE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
		//   29   62:putstatic       #40  <Field PdfDiv$BorderTopStyle GROOVE>
			RIDGE = new BorderTopStyle("RIDGE", 5);
		//   30   65:new             #2   <Class PdfDiv$BorderTopStyle>
		//   31   68:dup             
		//   32   69:ldc1            #41  <String "RIDGE">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
		//   35   75:putstatic       #43  <Field PdfDiv$BorderTopStyle RIDGE>
			INSET = new BorderTopStyle("INSET", 6);
		//   36   78:new             #2   <Class PdfDiv$BorderTopStyle>
		//   37   81:dup             
		//   38   82:ldc1            #44  <String "INSET">
		//   39   84:bipush          6
		//   40   86:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
		//   41   89:putstatic       #46  <Field PdfDiv$BorderTopStyle INSET>
			OUTSET = new BorderTopStyle("OUTSET", 7);
		//   42   92:new             #2   <Class PdfDiv$BorderTopStyle>
		//   43   95:dup             
		//   44   96:ldc1            #47  <String "OUTSET">
		//   45   98:bipush          7
		//   46  100:invokespecial   #26  <Method void PdfDiv$BorderTopStyle(String, int)>
		//   47  103:putstatic       #49  <Field PdfDiv$BorderTopStyle OUTSET>
			$VALUES = (new BorderTopStyle[] {
				DOTTED, DASHED, SOLID, DOUBLE, GROOVE, RIDGE, INSET, OUTSET
			});
		//   48  106:bipush          8
		//   49  108:anewarray       BorderTopStyle[]
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

		private BorderTopStyle(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #53  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class DisplayType extends Enum
	{

		public static DisplayType valueOf(String s)
		{
			return (DisplayType)Enum.valueOf(com/itextpdf/text/pdf/PdfDiv$DisplayType, s);
		//    0    0:ldc1            #2   <Class PdfDiv$DisplayType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #91  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PdfDiv$DisplayType>
		//    4    9:areturn         
		}

		public static DisplayType[] values()
		{
			return (DisplayType[])((DisplayType []) ($VALUES)).clone();
		//    0    0:getstatic       #83  <Field PdfDiv$DisplayType[] $VALUES>
		//    1    3:invokevirtual   #98  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfDiv$DisplayType_3B_.clone()>
		//    2    6:checkcast       #94  <Class PdfDiv$DisplayType[]>
		//    3    9:areturn         
		}

		private static final DisplayType $VALUES[];
		public static final DisplayType BLOCK;
		public static final DisplayType INLINE;
		public static final DisplayType INLINE_BLOCK;
		public static final DisplayType INLINE_TABLE;
		public static final DisplayType LIST_ITEM;
		public static final DisplayType NONE;
		public static final DisplayType RUN_IN;
		public static final DisplayType TABLE;
		public static final DisplayType TABLE_CAPTION;
		public static final DisplayType TABLE_CELL;
		public static final DisplayType TABLE_COLUMN;
		public static final DisplayType TABLE_COLUMN_GROUP;
		public static final DisplayType TABLE_FOOTER_GROUP;
		public static final DisplayType TABLE_HEADER_GROUP;
		public static final DisplayType TABLE_ROW;
		public static final DisplayType TABLE_ROW_GROUP;

		static 
		{
			NONE = new DisplayType("NONE", 0);
		//    0    0:new             #2   <Class PdfDiv$DisplayType>
		//    1    3:dup             
		//    2    4:ldc1            #30  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//    5   10:putstatic       #36  <Field PdfDiv$DisplayType NONE>
			BLOCK = new DisplayType("BLOCK", 1);
		//    6   13:new             #2   <Class PdfDiv$DisplayType>
		//    7   16:dup             
		//    8   17:ldc1            #37  <String "BLOCK">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   11   23:putstatic       #39  <Field PdfDiv$DisplayType BLOCK>
			INLINE = new DisplayType("INLINE", 2);
		//   12   26:new             #2   <Class PdfDiv$DisplayType>
		//   13   29:dup             
		//   14   30:ldc1            #40  <String "INLINE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   17   36:putstatic       #42  <Field PdfDiv$DisplayType INLINE>
			INLINE_BLOCK = new DisplayType("INLINE_BLOCK", 3);
		//   18   39:new             #2   <Class PdfDiv$DisplayType>
		//   19   42:dup             
		//   20   43:ldc1            #43  <String "INLINE_BLOCK">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   23   49:putstatic       #45  <Field PdfDiv$DisplayType INLINE_BLOCK>
			INLINE_TABLE = new DisplayType("INLINE_TABLE", 4);
		//   24   52:new             #2   <Class PdfDiv$DisplayType>
		//   25   55:dup             
		//   26   56:ldc1            #46  <String "INLINE_TABLE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   29   62:putstatic       #48  <Field PdfDiv$DisplayType INLINE_TABLE>
			LIST_ITEM = new DisplayType("LIST_ITEM", 5);
		//   30   65:new             #2   <Class PdfDiv$DisplayType>
		//   31   68:dup             
		//   32   69:ldc1            #49  <String "LIST_ITEM">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   35   75:putstatic       #51  <Field PdfDiv$DisplayType LIST_ITEM>
			RUN_IN = new DisplayType("RUN_IN", 6);
		//   36   78:new             #2   <Class PdfDiv$DisplayType>
		//   37   81:dup             
		//   38   82:ldc1            #52  <String "RUN_IN">
		//   39   84:bipush          6
		//   40   86:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   41   89:putstatic       #54  <Field PdfDiv$DisplayType RUN_IN>
			TABLE = new DisplayType("TABLE", 7);
		//   42   92:new             #2   <Class PdfDiv$DisplayType>
		//   43   95:dup             
		//   44   96:ldc1            #55  <String "TABLE">
		//   45   98:bipush          7
		//   46  100:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   47  103:putstatic       #57  <Field PdfDiv$DisplayType TABLE>
			TABLE_CAPTION = new DisplayType("TABLE_CAPTION", 8);
		//   48  106:new             #2   <Class PdfDiv$DisplayType>
		//   49  109:dup             
		//   50  110:ldc1            #58  <String "TABLE_CAPTION">
		//   51  112:bipush          8
		//   52  114:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   53  117:putstatic       #60  <Field PdfDiv$DisplayType TABLE_CAPTION>
			TABLE_CELL = new DisplayType("TABLE_CELL", 9);
		//   54  120:new             #2   <Class PdfDiv$DisplayType>
		//   55  123:dup             
		//   56  124:ldc1            #61  <String "TABLE_CELL">
		//   57  126:bipush          9
		//   58  128:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   59  131:putstatic       #63  <Field PdfDiv$DisplayType TABLE_CELL>
			TABLE_COLUMN_GROUP = new DisplayType("TABLE_COLUMN_GROUP", 10);
		//   60  134:new             #2   <Class PdfDiv$DisplayType>
		//   61  137:dup             
		//   62  138:ldc1            #64  <String "TABLE_COLUMN_GROUP">
		//   63  140:bipush          10
		//   64  142:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   65  145:putstatic       #66  <Field PdfDiv$DisplayType TABLE_COLUMN_GROUP>
			TABLE_COLUMN = new DisplayType("TABLE_COLUMN", 11);
		//   66  148:new             #2   <Class PdfDiv$DisplayType>
		//   67  151:dup             
		//   68  152:ldc1            #67  <String "TABLE_COLUMN">
		//   69  154:bipush          11
		//   70  156:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   71  159:putstatic       #69  <Field PdfDiv$DisplayType TABLE_COLUMN>
			TABLE_FOOTER_GROUP = new DisplayType("TABLE_FOOTER_GROUP", 12);
		//   72  162:new             #2   <Class PdfDiv$DisplayType>
		//   73  165:dup             
		//   74  166:ldc1            #70  <String "TABLE_FOOTER_GROUP">
		//   75  168:bipush          12
		//   76  170:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   77  173:putstatic       #72  <Field PdfDiv$DisplayType TABLE_FOOTER_GROUP>
			TABLE_HEADER_GROUP = new DisplayType("TABLE_HEADER_GROUP", 13);
		//   78  176:new             #2   <Class PdfDiv$DisplayType>
		//   79  179:dup             
		//   80  180:ldc1            #73  <String "TABLE_HEADER_GROUP">
		//   81  182:bipush          13
		//   82  184:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   83  187:putstatic       #75  <Field PdfDiv$DisplayType TABLE_HEADER_GROUP>
			TABLE_ROW = new DisplayType("TABLE_ROW", 14);
		//   84  190:new             #2   <Class PdfDiv$DisplayType>
		//   85  193:dup             
		//   86  194:ldc1            #76  <String "TABLE_ROW">
		//   87  196:bipush          14
		//   88  198:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   89  201:putstatic       #78  <Field PdfDiv$DisplayType TABLE_ROW>
			TABLE_ROW_GROUP = new DisplayType("TABLE_ROW_GROUP", 15);
		//   90  204:new             #2   <Class PdfDiv$DisplayType>
		//   91  207:dup             
		//   92  208:ldc1            #79  <String "TABLE_ROW_GROUP">
		//   93  210:bipush          15
		//   94  212:invokespecial   #34  <Method void PdfDiv$DisplayType(String, int)>
		//   95  215:putstatic       #81  <Field PdfDiv$DisplayType TABLE_ROW_GROUP>
			$VALUES = (new DisplayType[] {
				NONE, BLOCK, INLINE, INLINE_BLOCK, INLINE_TABLE, LIST_ITEM, RUN_IN, TABLE, TABLE_CAPTION, TABLE_CELL, 
				TABLE_COLUMN_GROUP, TABLE_COLUMN, TABLE_FOOTER_GROUP, TABLE_HEADER_GROUP, TABLE_ROW, TABLE_ROW_GROUP
			});
		//   96  218:bipush          16
		//   97  220:anewarray       DisplayType[]
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

		private DisplayType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #85  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class FloatType extends Enum
	{

		public static FloatType valueOf(String s)
		{
			return (FloatType)Enum.valueOf(com/itextpdf/text/pdf/PdfDiv$FloatType, s);
		//    0    0:ldc1            #2   <Class PdfDiv$FloatType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PdfDiv$FloatType>
		//    4    9:areturn         
		}

		public static FloatType[] values()
		{
			return (FloatType[])((FloatType []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field PdfDiv$FloatType[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfDiv$FloatType_3B_.clone()>
		//    2    6:checkcast       #42  <Class PdfDiv$FloatType[]>
		//    3    9:areturn         
		}

		private static final FloatType $VALUES[];
		public static final FloatType LEFT;
		public static final FloatType NONE;
		public static final FloatType RIGHT;

		static 
		{
			NONE = new FloatType("NONE", 0);
		//    0    0:new             #2   <Class PdfDiv$FloatType>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void PdfDiv$FloatType(String, int)>
		//    5   10:putstatic       #23  <Field PdfDiv$FloatType NONE>
			LEFT = new FloatType("LEFT", 1);
		//    6   13:new             #2   <Class PdfDiv$FloatType>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "LEFT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void PdfDiv$FloatType(String, int)>
		//   11   23:putstatic       #26  <Field PdfDiv$FloatType LEFT>
			RIGHT = new FloatType("RIGHT", 2);
		//   12   26:new             #2   <Class PdfDiv$FloatType>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "RIGHT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void PdfDiv$FloatType(String, int)>
		//   17   36:putstatic       #29  <Field PdfDiv$FloatType RIGHT>
			$VALUES = (new FloatType[] {
				NONE, LEFT, RIGHT
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       FloatType[]
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

		private FloatType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class PositionType extends Enum
	{

		public static PositionType valueOf(String s)
		{
			return (PositionType)Enum.valueOf(com/itextpdf/text/pdf/PdfDiv$PositionType, s);
		//    0    0:ldc1            #2   <Class PdfDiv$PositionType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PdfDiv$PositionType>
		//    4    9:areturn         
		}

		public static PositionType[] values()
		{
			return (PositionType[])((PositionType []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field PdfDiv$PositionType[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.PdfDiv$PositionType_3B_.clone()>
		//    2    6:checkcast       #46  <Class PdfDiv$PositionType[]>
		//    3    9:areturn         
		}

		private static final PositionType $VALUES[];
		public static final PositionType ABSOLUTE;
		public static final PositionType FIXED;
		public static final PositionType RELATIVE;
		public static final PositionType STATIC;

		static 
		{
			STATIC = new PositionType("STATIC", 0);
		//    0    0:new             #2   <Class PdfDiv$PositionType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "STATIC">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void PdfDiv$PositionType(String, int)>
		//    5   10:putstatic       #24  <Field PdfDiv$PositionType STATIC>
			ABSOLUTE = new PositionType("ABSOLUTE", 1);
		//    6   13:new             #2   <Class PdfDiv$PositionType>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "ABSOLUTE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void PdfDiv$PositionType(String, int)>
		//   11   23:putstatic       #27  <Field PdfDiv$PositionType ABSOLUTE>
			FIXED = new PositionType("FIXED", 2);
		//   12   26:new             #2   <Class PdfDiv$PositionType>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "FIXED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void PdfDiv$PositionType(String, int)>
		//   17   36:putstatic       #30  <Field PdfDiv$PositionType FIXED>
			RELATIVE = new PositionType("RELATIVE", 3);
		//   18   39:new             #2   <Class PdfDiv$PositionType>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "RELATIVE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void PdfDiv$PositionType(String, int)>
		//   23   49:putstatic       #33  <Field PdfDiv$PositionType RELATIVE>
			$VALUES = (new PositionType[] {
				STATIC, ABSOLUTE, FIXED, RELATIVE
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       PositionType[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field PdfDiv$PositionType STATIC>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field PdfDiv$PositionType ABSOLUTE>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field PdfDiv$PositionType FIXED>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field PdfDiv$PositionType RELATIVE>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field PdfDiv$PositionType[] $VALUES>
		//*  43   83:return          
		}

		private PositionType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public PdfDiv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void Object()>
		left = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #78  <Field Float left>
		top = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #80  <Field Float top>
		right = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #82  <Field Float right>
		bottom = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #84  <Field Float bottom>
		width = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #86  <Field Float width>
		height = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #88  <Field Float height>
		percentageHeight = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #90  <Field Float percentageHeight>
		percentageWidth = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #92  <Field Float percentageWidth>
		contentWidth = 0.0F;
	//   26   44:aload_0         
	//   27   45:fconst_0        
	//   28   46:putfield        #94  <Field float contentWidth>
		contentHeight = 0.0F;
	//   29   49:aload_0         
	//   30   50:fconst_0        
	//   31   51:putfield        #96  <Field float contentHeight>
		textAlignment = -1;
	//   32   54:aload_0         
	//   33   55:iconst_m1       
	//   34   56:putfield        #98  <Field int textAlignment>
		paddingLeft = 0.0F;
	//   35   59:aload_0         
	//   36   60:fconst_0        
	//   37   61:putfield        #100 <Field float paddingLeft>
		paddingRight = 0.0F;
	//   38   64:aload_0         
	//   39   65:fconst_0        
	//   40   66:putfield        #102 <Field float paddingRight>
		paddingTop = 0.0F;
	//   41   69:aload_0         
	//   42   70:fconst_0        
	//   43   71:putfield        #104 <Field float paddingTop>
		paddingBottom = 0.0F;
	//   44   74:aload_0         
	//   45   75:fconst_0        
	//   46   76:putfield        #106 <Field float paddingBottom>
		floatType = FloatType.NONE;
	//   47   79:aload_0         
	//   48   80:getstatic       #109 <Field PdfDiv$FloatType PdfDiv$FloatType.NONE>
	//   49   83:putfield        #111 <Field PdfDiv$FloatType floatType>
		position = PositionType.STATIC;
	//   50   86:aload_0         
	//   51   87:getstatic       #114 <Field PdfDiv$PositionType PdfDiv$PositionType.STATIC>
	//   52   90:putfield        #116 <Field PdfDiv$PositionType position>
		floatLayout = null;
	//   53   93:aload_0         
	//   54   94:aconst_null     
	//   55   95:putfield        #118 <Field FloatLayout floatLayout>
		runDirection = 1;
	//   56   98:aload_0         
	//   57   99:iconst_1        
	//   58  100:putfield        #120 <Field int runDirection>
		role = PdfName.DIV;
	//   59  103:aload_0         
	//   60  104:getstatic       #125 <Field PdfName PdfName.DIV>
	//   61  107:putfield        #127 <Field PdfName role>
		accessibleAttributes = null;
	//   62  110:aload_0         
	//   63  111:aconst_null     
	//   64  112:putfield        #129 <Field HashMap accessibleAttributes>
		id = new AccessibleElementId();
	//   65  115:aload_0         
	//   66  116:new             #131 <Class AccessibleElementId>
	//   67  119:dup             
	//   68  120:invokespecial   #132 <Method void AccessibleElementId()>
	//   69  123:putfield        #134 <Field AccessibleElementId id>
		backgroundColor = null;
	//   70  126:aload_0         
	//   71  127:aconst_null     
	//   72  128:putfield        #136 <Field BaseColor backgroundColor>
		content = new ArrayList();
	//   73  131:aload_0         
	//   74  132:new             #138 <Class ArrayList>
	//   75  135:dup             
	//   76  136:invokespecial   #139 <Method void ArrayList()>
	//   77  139:putfield        #141 <Field ArrayList content>
		keepTogether = false;
	//   78  142:aload_0         
	//   79  143:iconst_0        
	//   80  144:putfield        #143 <Field boolean keepTogether>
	//   81  147:return          
	}

	public void addElement(Element element)
	{
		content.add(((Object) (element)));
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field ArrayList content>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #150 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(accessibleAttributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field HashMap accessibleAttributes>
	//*   2    4:ifnull          19
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field HashMap accessibleAttributes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #158 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #160 <Class PdfObject>
	//    8   18:areturn         
		else
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	public HashMap getAccessibleAttributes()
	{
		return accessibleAttributes;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field HashMap accessibleAttributes>
	//    2    4:areturn         
	}

	public float getActualHeight()
	{
		if(height != null && height.floatValue() >= contentHeight)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field Float height>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #88  <Field Float height>
	//*   5   11:invokevirtual   #171 <Method float Float.floatValue()>
	//*   6   14:aload_0         
	//*   7   15:getfield        #96  <Field float contentHeight>
	//*   8   18:fcmpl           
	//*   9   19:iflt            30
			return height.floatValue();
	//   10   22:aload_0         
	//   11   23:getfield        #88  <Field Float height>
	//   12   26:invokevirtual   #171 <Method float Float.floatValue()>
	//   13   29:freturn         
		else
			return contentHeight;
	//   14   30:aload_0         
	//   15   31:getfield        #96  <Field float contentHeight>
	//   16   34:freturn         
	}

	public float getActualWidth()
	{
		if(width != null && width.floatValue() >= contentWidth)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field Float width>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #86  <Field Float width>
	//*   5   11:invokevirtual   #171 <Method float Float.floatValue()>
	//*   6   14:aload_0         
	//*   7   15:getfield        #94  <Field float contentWidth>
	//*   8   18:fcmpl           
	//*   9   19:iflt            30
			return width.floatValue();
	//   10   22:aload_0         
	//   11   23:getfield        #86  <Field Float width>
	//   12   26:invokevirtual   #171 <Method float Float.floatValue()>
	//   13   29:freturn         
		else
			return contentWidth;
	//   14   30:aload_0         
	//   15   31:getfield        #94  <Field float contentWidth>
	//   16   34:freturn         
	}

	public BaseColor getBackgroundColor()
	{
		return backgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field BaseColor backgroundColor>
	//    2    4:areturn         
	}

	public BorderTopStyle getBorderTopStyle()
	{
		return borderTopStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field PdfDiv$BorderTopStyle borderTopStyle>
	//    2    4:areturn         
	}

	public Float getBottom()
	{
		return bottom;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Float bottom>
	//    2    4:areturn         
	}

	public List getChunks()
	{
		return ((List) (new ArrayList()));
	//    0    0:new             #138 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #139 <Method void ArrayList()>
	//    3    7:areturn         
	}

	public ArrayList getContent()
	{
		return content;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field ArrayList content>
	//    2    4:areturn         
	}

	public float getContentHeight()
	{
		return contentHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field float contentHeight>
	//    2    4:freturn         
	}

	public float getContentWidth()
	{
		return contentWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field float contentWidth>
	//    2    4:freturn         
	}

	public DisplayType getDisplay()
	{
		return display;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field PdfDiv$DisplayType display>
	//    2    4:areturn         
	}

	public FloatType getFloatType()
	{
		return floatType;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field PdfDiv$FloatType floatType>
	//    2    4:areturn         
	}

	public Float getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Float height>
	//    2    4:areturn         
	}

	public AccessibleElementId getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field AccessibleElementId id>
	//    2    4:areturn         
	}

	public boolean getKeepTogether()
	{
		return keepTogether;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field boolean keepTogether>
	//    2    4:ireturn         
	}

	public Float getLeft()
	{
		return left;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Float left>
	//    2    4:areturn         
	}

	public float getPaddingBottom()
	{
		return paddingBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field float paddingBottom>
	//    2    4:freturn         
	}

	public float getPaddingLeft()
	{
		return paddingLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field float paddingLeft>
	//    2    4:freturn         
	}

	public float getPaddingRight()
	{
		return paddingRight;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field float paddingRight>
	//    2    4:freturn         
	}

	public float getPaddingTop()
	{
		return paddingTop;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field float paddingTop>
	//    2    4:freturn         
	}

	public Float getPercentageHeight()
	{
		return percentageHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Float percentageHeight>
	//    2    4:areturn         
	}

	public Float getPercentageWidth()
	{
		return percentageWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Float percentageWidth>
	//    2    4:areturn         
	}

	public PositionType getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field PdfDiv$PositionType position>
	//    2    4:areturn         
	}

	public Float getRight()
	{
		return right;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Float right>
	//    2    4:areturn         
	}

	public PdfName getRole()
	{
		return role;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field PdfName role>
	//    2    4:areturn         
	}

	public int getRunDirection()
	{
		return runDirection;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field int runDirection>
	//    2    4:ireturn         
	}

	public float getSpacingAfter()
	{
		return spacingAfter;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field float spacingAfter>
	//    2    4:freturn         
	}

	public float getSpacingBefore()
	{
		return spacingBefore;
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field float spacingBefore>
	//    2    4:freturn         
	}

	public int getTextAlignment()
	{
		return textAlignment;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field int textAlignment>
	//    2    4:ireturn         
	}

	public Float getTop()
	{
		return top;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Float top>
	//    2    4:areturn         
	}

	public Float getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Float width>
	//    2    4:areturn         
	}

	public float getYLine()
	{
		return yLine;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field float yLine>
	//    2    4:freturn         
	}

	public boolean isContent()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isInline()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isNestable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int layout(PdfContentByte pdfcontentbyte, boolean flag, boolean flag1, float f, float f1, float f2, float f3)
		throws DocumentException
	{
		float f4;
		float f5;
		int i;
		int j;
		f4 = Math.min(f, f2);
	//    0    0:fload           4
	//    1    2:fload           6
	//    2    4:invokestatic    #238 <Method float Math.min(float, float)>
	//    3    7:fstore          8
		f5 = Math.max(f1, f3);
	//    4    9:fload           5
	//    5   11:fload           7
	//    6   13:invokestatic    #241 <Method float Math.max(float, float)>
	//    7   16:fstore          9
		f3 = Math.min(f1, f3);
	//    8   18:fload           5
	//    9   20:fload           7
	//   10   22:invokestatic    #238 <Method float Math.min(float, float)>
	//   11   25:fstore          7
		f1 = Math.max(f, f2);
	//   12   27:fload           4
	//   13   29:fload           6
	//   14   31:invokestatic    #241 <Method float Math.max(float, float)>
	//   15   34:fstore          5
		yLine = f5;
	//   16   36:aload_0         
	//   17   37:fload           9
	//   18   39:putfield        #225 <Field float yLine>
		j = 0;
	//   19   42:iconst_0        
	//   20   43:istore          12
		i = 0;
	//   21   45:iconst_0        
	//   22   46:istore          11
		if(width == null || width.floatValue() <= 0.0F) goto _L2; else goto _L1
	//   23   48:aload_0         
	//   24   49:getfield        #86  <Field Float width>
	//   25   52:ifnull          796
	//   26   55:aload_0         
	//   27   56:getfield        #86  <Field Float width>
	//   28   59:invokevirtual   #171 <Method float Float.floatValue()>
	//   29   62:fconst_0        
	//   30   63:fcmpl           
	//   31   64:ifle            796
_L1:
		if(width.floatValue() >= f1 - f4) goto _L4; else goto _L3
	//   32   67:aload_0         
	//   33   68:getfield        #86  <Field Float width>
	//   34   71:invokevirtual   #171 <Method float Float.floatValue()>
	//   35   74:fload           5
	//   36   76:fload           8
	//   37   78:fsub            
	//   38   79:fcmpg           
	//   39   80:ifge            774
_L3:
		f = f4 + width.floatValue();
	//   40   83:fload           8
	//   41   85:aload_0         
	//   42   86:getfield        #86  <Field Float width>
	//   43   89:invokevirtual   #171 <Method float Float.floatValue()>
	//   44   92:fadd            
	//   45   93:fstore          4
_L8:
		if(height == null || height.floatValue() <= 0.0F)
			break MISSING_BLOCK_LABEL_936;
	//   46   95:aload_0         
	//   47   96:getfield        #88  <Field Float height>
	//   48   99:ifnull          936
	//   49  102:aload_0         
	//   50  103:getfield        #88  <Field Float height>
	//   51  106:invokevirtual   #171 <Method float Float.floatValue()>
	//   52  109:fconst_0        
	//   53  110:fcmpl           
	//   54  111:ifle            936
		if(height.floatValue() >= f5 - f3) goto _L6; else goto _L5
	//   55  114:aload_0         
	//   56  115:getfield        #88  <Field Float height>
	//   57  118:invokevirtual   #171 <Method float Float.floatValue()>
	//   58  121:fload           9
	//   59  123:fload           7
	//   60  125:fsub            
	//   61  126:fcmpg           
	//   62  127:ifge            914
_L5:
		f1 = f5 - height.floatValue();
	//   63  130:fload           9
	//   64  132:aload_0         
	//   65  133:getfield        #88  <Field Float height>
	//   66  136:invokevirtual   #171 <Method float Float.floatValue()>
	//   67  139:fsub            
	//   68  140:fstore          5
		i = 1;
	//   69  142:iconst_1        
	//   70  143:istore          11
_L14:
		if(!flag1 && position == PositionType.RELATIVE)
	//*  71  145:iload_3         
	//*  72  146:ifne            221
	//*  73  149:aload_0         
	//*  74  150:getfield        #116 <Field PdfDiv$PositionType position>
	//*  75  153:getstatic       #244 <Field PdfDiv$PositionType PdfDiv$PositionType.RELATIVE>
	//*  76  156:if_acmpne       221
		{
			float f6;
			int k;
			Object obj;
			Object obj1;
			if(left != null)
	//*  77  159:aload_0         
	//*  78  160:getfield        #78  <Field Float left>
	//*  79  163:ifnull          996
				obj = ((Object) (left));
	//   80  166:aload_0         
	//   81  167:getfield        #78  <Field Float left>
	//   82  170:astore          14
			else
	//*  83  172:aload_0         
	//*  84  173:getfield        #80  <Field Float top>
	//*  85  176:ifnull          1028
	//*  86  179:aload_0         
	//*  87  180:getfield        #80  <Field Float top>
	//*  88  183:invokevirtual   #171 <Method float Float.floatValue()>
	//*  89  186:fneg            
	//*  90  187:invokestatic    #248 <Method Float Float.valueOf(float)>
	//*  91  190:astore          15
	//*  92  192:aload_1         
	//*  93  193:invokevirtual   #253 <Method void PdfContentByte.saveState()>
	//*  94  196:aload_1         
	//*  95  197:new             #255 <Class AffineTransform>
	//*  96  200:dup             
	//*  97  201:fconst_1        
	//*  98  202:fconst_0        
	//*  99  203:fconst_0        
	//* 100  204:fconst_1        
	//* 101  205:aload           14
	//* 102  207:invokevirtual   #171 <Method float Float.floatValue()>
	//* 103  210:aload           15
	//* 104  212:invokevirtual   #171 <Method float Float.floatValue()>
	//* 105  215:invokespecial   #258 <Method void AffineTransform(float, float, float, float, float, float)>
	//* 106  218:invokevirtual   #262 <Method void PdfContentByte.transform(AffineTransform)>
	//* 107  221:iload_3         
	//* 108  222:ifne            469
	//* 109  225:aload_0         
	//* 110  226:getfield        #136 <Field BaseColor backgroundColor>
	//* 111  229:ifnonnull       239
	//* 112  232:aload_0         
	//* 113  233:getfield        #264 <Field Image backgroundImage>
	//* 114  236:ifnull          469
	//* 115  239:aload_0         
	//* 116  240:invokevirtual   #266 <Method float getActualWidth()>
	//* 117  243:fconst_0        
	//* 118  244:fcmpl           
	//* 119  245:ifle            469
	//* 120  248:aload_0         
	//* 121  249:invokevirtual   #268 <Method float getActualHeight()>
	//* 122  252:fconst_0        
	//* 123  253:fcmpl           
	//* 124  254:ifle            469
	//* 125  257:aload_0         
	//* 126  258:invokevirtual   #266 <Method float getActualWidth()>
	//* 127  261:fstore          6
	//* 128  263:aload_0         
	//* 129  264:invokevirtual   #268 <Method float getActualHeight()>
	//* 130  267:fstore          7
	//* 131  269:aload_0         
	//* 132  270:getfield        #86  <Field Float width>
	//* 133  273:ifnull          297
	//* 134  276:aload_0         
	//* 135  277:getfield        #86  <Field Float width>
	//* 136  280:invokevirtual   #171 <Method float Float.floatValue()>
	//* 137  283:fconst_0        
	//* 138  284:fcmpl           
	//* 139  285:ifle            1053
	//* 140  288:aload_0         
	//* 141  289:getfield        #86  <Field Float width>
	//* 142  292:invokevirtual   #171 <Method float Float.floatValue()>
	//* 143  295:fstore          6
	//* 144  297:aload_0         
	//* 145  298:getfield        #88  <Field Float height>
	//* 146  301:ifnull          325
	//* 147  304:aload_0         
	//* 148  305:getfield        #88  <Field Float height>
	//* 149  308:invokevirtual   #171 <Method float Float.floatValue()>
	//* 150  311:fconst_0        
	//* 151  312:fcmpl           
	//* 152  313:ifle            1059
	//* 153  316:aload_0         
	//* 154  317:getfield        #88  <Field Float height>
	//* 155  320:invokevirtual   #171 <Method float Float.floatValue()>
	//* 156  323:fstore          7
	//* 157  325:fload           6
	//* 158  327:fconst_0        
	//* 159  328:fcmpl           
	//* 160  329:ifle            469
	//* 161  332:fload           7
	//* 162  334:fconst_0        
	//* 163  335:fcmpl           
	//* 164  336:ifle            469
	//* 165  339:new             #270 <Class Rectangle>
	//* 166  342:dup             
	//* 167  343:fload           8
	//* 168  345:fload           9
	//* 169  347:fload           7
	//* 170  349:fsub            
	//* 171  350:fload           6
	//* 172  352:fload           8
	//* 173  354:fadd            
	//* 174  355:fload           9
	//* 175  357:invokespecial   #273 <Method void Rectangle(float, float, float, float)>
	//* 176  360:astore          14
	//* 177  362:aload_0         
	//* 178  363:getfield        #136 <Field BaseColor backgroundColor>
	//* 179  366:ifnull          405
	//* 180  369:aload           14
	//* 181  371:aload_0         
	//* 182  372:getfield        #136 <Field BaseColor backgroundColor>
	//* 183  375:invokevirtual   #277 <Method void Rectangle.setBackgroundColor(BaseColor)>
	//* 184  378:new             #279 <Class PdfArtifact>
	//* 185  381:dup             
	//* 186  382:invokespecial   #280 <Method void PdfArtifact()>
	//* 187  385:astore          15
	//* 188  387:aload_1         
	//* 189  388:aload           15
	//* 190  390:invokevirtual   #284 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//* 191  393:aload_1         
	//* 192  394:aload           14
	//* 193  396:invokevirtual   #288 <Method void PdfContentByte.rectangle(Rectangle)>
	//* 194  399:aload_1         
	//* 195  400:aload           15
	//* 196  402:invokevirtual   #291 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//* 197  405:aload_0         
	//* 198  406:getfield        #264 <Field Image backgroundImage>
	//* 199  409:ifnull          469
	//* 200  412:aload_0         
	//* 201  413:getfield        #293 <Field Float backgroundImageWidth>
	//* 202  416:ifnonnull       1065
	//* 203  419:aload_0         
	//* 204  420:getfield        #264 <Field Image backgroundImage>
	//* 205  423:aload           14
	//* 206  425:invokevirtual   #298 <Method void Image.scaleToFit(Rectangle)>
	//* 207  428:aload_0         
	//* 208  429:getfield        #264 <Field Image backgroundImage>
	//* 209  432:aload           14
	//* 210  434:invokevirtual   #300 <Method float Rectangle.getLeft()>
	//* 211  437:aload           14
	//* 212  439:invokevirtual   #302 <Method float Rectangle.getBottom()>
	//* 213  442:invokevirtual   #306 <Method void Image.setAbsolutePosition(float, float)>
	//* 214  445:aload_1         
	//* 215  446:aload_0         
	//* 216  447:getfield        #264 <Field Image backgroundImage>
	//* 217  450:invokevirtual   #284 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//* 218  453:aload_1         
	//* 219  454:aload_0         
	//* 220  455:getfield        #264 <Field Image backgroundImage>
	//* 221  458:invokevirtual   #310 <Method void PdfContentByte.addImage(Image)>
	//* 222  461:aload_1         
	//* 223  462:aload_0         
	//* 224  463:getfield        #264 <Field Image backgroundImage>
	//* 225  466:invokevirtual   #291 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//* 226  469:aload_0         
	//* 227  470:getfield        #92  <Field Float percentageWidth>
	//* 228  473:ifnonnull       481
	//* 229  476:aload_0         
	//* 230  477:fconst_0        
	//* 231  478:putfield        #94  <Field float contentWidth>
	//* 232  481:aload_0         
	//* 233  482:getfield        #90  <Field Float percentageHeight>
	//* 234  485:ifnonnull       493
	//* 235  488:aload_0         
	//* 236  489:fconst_0        
	//* 237  490:putfield        #96  <Field float contentHeight>
	//* 238  493:aload_0         
	//* 239  494:getfield        #106 <Field float paddingBottom>
	//* 240  497:fstore          6
	//* 241  499:aload_0         
	//* 242  500:getfield        #100 <Field float paddingLeft>
	//* 243  503:fstore          7
	//* 244  505:aload_0         
	//* 245  506:getfield        #102 <Field float paddingRight>
	//* 246  509:fstore          10
	//* 247  511:aload_0         
	//* 248  512:aload_0         
	//* 249  513:getfield        #225 <Field float yLine>
	//* 250  516:aload_0         
	//* 251  517:getfield        #104 <Field float paddingTop>
	//* 252  520:fsub            
	//* 253  521:putfield        #225 <Field float yLine>
	//* 254  524:iconst_1        
	//* 255  525:istore          12
	//* 256  527:aload_0         
	//* 257  528:getfield        #141 <Field ArrayList content>
	//* 258  531:invokevirtual   #313 <Method boolean ArrayList.isEmpty()>
	//* 259  534:ifne            689
	//* 260  537:aload_0         
	//* 261  538:getfield        #118 <Field FloatLayout floatLayout>
	//* 262  541:ifnonnull       578
	//* 263  544:aload_0         
	//* 264  545:new             #315 <Class FloatLayout>
	//* 265  548:dup             
	//* 266  549:new             #138 <Class ArrayList>
	//* 267  552:dup             
	//* 268  553:aload_0         
	//* 269  554:getfield        #141 <Field ArrayList content>
	//* 270  557:invokespecial   #318 <Method void ArrayList(java.util.Collection)>
	//* 271  560:iload_2         
	//* 272  561:invokespecial   #321 <Method void FloatLayout(List, boolean)>
	//* 273  564:putfield        #118 <Field FloatLayout floatLayout>
	//* 274  567:aload_0         
	//* 275  568:getfield        #118 <Field FloatLayout floatLayout>
	//* 276  571:aload_0         
	//* 277  572:getfield        #120 <Field int runDirection>
	//* 278  575:invokevirtual   #325 <Method void FloatLayout.setRunDirection(int)>
	//* 279  578:aload_0         
	//* 280  579:getfield        #118 <Field FloatLayout floatLayout>
	//* 281  582:fload           8
	//* 282  584:fload           7
	//* 283  586:fadd            
	//* 284  587:fload           5
	//* 285  589:fload           6
	//* 286  591:fadd            
	//* 287  592:fload           4
	//* 288  594:fload           10
	//* 289  596:fsub            
	//* 290  597:aload_0         
	//* 291  598:getfield        #225 <Field float yLine>
	//* 292  601:invokevirtual   #328 <Method void FloatLayout.setSimpleColumn(float, float, float, float)>
	//* 293  604:aload_0         
	//* 294  605:invokevirtual   #330 <Method PdfDiv$BorderTopStyle getBorderTopStyle()>
	//* 295  608:ifnull          622
	//* 296  611:aload_0         
	//* 297  612:getfield        #118 <Field FloatLayout floatLayout>
	//* 298  615:getfield        #334 <Field ColumnText FloatLayout.compositeColumn>
	//* 299  618:iconst_0        
	//* 300  619:invokevirtual   #340 <Method void ColumnText.setIgnoreSpacingBefore(boolean)>
	//* 301  622:aload_0         
	//* 302  623:getfield        #118 <Field FloatLayout floatLayout>
	//* 303  626:aload_1         
	//* 304  627:iload_3         
	//* 305  628:invokevirtual   #343 <Method int FloatLayout.layout(PdfContentByte, boolean)>
	//* 306  631:istore          13
	//* 307  633:aload_0         
	//* 308  634:aload_0         
	//* 309  635:getfield        #118 <Field FloatLayout floatLayout>
	//* 310  638:invokevirtual   #345 <Method float FloatLayout.getYLine()>
	//* 311  641:putfield        #225 <Field float yLine>
	//* 312  644:iload           13
	//* 313  646:istore          12
	//* 314  648:aload_0         
	//* 315  649:getfield        #92  <Field Float percentageWidth>
	//* 316  652:ifnonnull       689
	//* 317  655:iload           13
	//* 318  657:istore          12
	//* 319  659:aload_0         
	//* 320  660:getfield        #94  <Field float contentWidth>
	//* 321  663:aload_0         
	//* 322  664:getfield        #118 <Field FloatLayout floatLayout>
	//* 323  667:invokevirtual   #348 <Method float FloatLayout.getFilledWidth()>
	//* 324  670:fcmpg           
	//* 325  671:ifge            689
	//* 326  674:aload_0         
	//* 327  675:aload_0         
	//* 328  676:getfield        #118 <Field FloatLayout floatLayout>
	//* 329  679:invokevirtual   #348 <Method float FloatLayout.getFilledWidth()>
	//* 330  682:putfield        #94  <Field float contentWidth>
	//* 331  685:iload           13
	//* 332  687:istore          12
	//* 333  689:iload_3         
	//* 334  690:ifne            707
	//* 335  693:aload_0         
	//* 336  694:getfield        #116 <Field PdfDiv$PositionType position>
	//* 337  697:getstatic       #244 <Field PdfDiv$PositionType PdfDiv$PositionType.RELATIVE>
	//* 338  700:if_acmpne       707
	//* 339  703:aload_1         
	//* 340  704:invokevirtual   #351 <Method void PdfContentByte.restoreState()>
	//* 341  707:aload_0         
	//* 342  708:aload_0         
	//* 343  709:getfield        #225 <Field float yLine>
	//* 344  712:aload_0         
	//* 345  713:getfield        #106 <Field float paddingBottom>
	//* 346  716:fsub            
	//* 347  717:putfield        #225 <Field float yLine>
	//* 348  720:aload_0         
	//* 349  721:getfield        #90  <Field Float percentageHeight>
	//* 350  724:ifnonnull       738
	//* 351  727:aload_0         
	//* 352  728:fload           9
	//* 353  730:aload_0         
	//* 354  731:getfield        #225 <Field float yLine>
	//* 355  734:fsub            
	//* 356  735:putfield        #96  <Field float contentHeight>
	//* 357  738:aload_0         
	//* 358  739:getfield        #92  <Field Float percentageWidth>
	//* 359  742:ifnonnull       763
	//* 360  745:aload_0         
	//* 361  746:aload_0         
	//* 362  747:getfield        #94  <Field float contentWidth>
	//* 363  750:aload_0         
	//* 364  751:getfield        #100 <Field float paddingLeft>
	//* 365  754:aload_0         
	//* 366  755:getfield        #102 <Field float paddingRight>
	//* 367  758:fadd            
	//* 368  759:fadd            
	//* 369  760:putfield        #94  <Field float contentWidth>
	//* 370  763:iload           11
	//* 371  765:ifeq            771
	//* 372  768:iconst_1        
	//* 373  769:istore          12
	//* 374  771:iload           12
	//* 375  773:ireturn         
	//* 376  774:fload           5
	//* 377  776:fstore          4
	//* 378  778:aload_0         
	//* 379  779:getfield        #86  <Field Float width>
	//* 380  782:invokevirtual   #171 <Method float Float.floatValue()>
	//* 381  785:fload           5
	//* 382  787:fload           8
	//* 383  789:fsub            
	//* 384  790:fcmpl           
	//* 385  791:ifle            95
	//* 386  794:iconst_2        
	//* 387  795:ireturn         
	//* 388  796:aload_0         
	//* 389  797:getfield        #92  <Field Float percentageWidth>
	//* 390  800:ifnull          832
	//* 391  803:aload_0         
	//* 392  804:fload           5
	//* 393  806:fload           8
	//* 394  808:fsub            
	//* 395  809:aload_0         
	//* 396  810:getfield        #92  <Field Float percentageWidth>
	//* 397  813:invokevirtual   #171 <Method float Float.floatValue()>
	//* 398  816:fmul            
	//* 399  817:putfield        #94  <Field float contentWidth>
	//* 400  820:fload           8
	//* 401  822:aload_0         
	//* 402  823:getfield        #94  <Field float contentWidth>
	//* 403  826:fadd            
	//* 404  827:fstore          4
	//* 405  829:goto            95
	//* 406  832:fload           5
	//* 407  834:fstore          4
	//* 408  836:aload_0         
	//* 409  837:getfield        #92  <Field Float percentageWidth>
	//* 410  840:ifnonnull       95
	//* 411  843:fload           5
	//* 412  845:fstore          4
	//* 413  847:aload_0         
	//* 414  848:getfield        #111 <Field PdfDiv$FloatType floatType>
	//* 415  851:getstatic       #109 <Field PdfDiv$FloatType PdfDiv$FloatType.NONE>
	//* 416  854:if_acmpne       95
	//* 417  857:aload_0         
	//* 418  858:getfield        #192 <Field PdfDiv$DisplayType display>
	//* 419  861:ifnull          898
	//* 420  864:aload_0         
	//* 421  865:getfield        #192 <Field PdfDiv$DisplayType display>
	//* 422  868:getstatic       #354 <Field PdfDiv$DisplayType PdfDiv$DisplayType.BLOCK>
	//* 423  871:if_acmpeq       898
	//* 424  874:aload_0         
	//* 425  875:getfield        #192 <Field PdfDiv$DisplayType display>
	//* 426  878:getstatic       #357 <Field PdfDiv$DisplayType PdfDiv$DisplayType.LIST_ITEM>
	//* 427  881:if_acmpeq       898
	//* 428  884:fload           5
	//* 429  886:fstore          4
	//* 430  888:aload_0         
	//* 431  889:getfield        #192 <Field PdfDiv$DisplayType display>
	//* 432  892:getstatic       #360 <Field PdfDiv$DisplayType PdfDiv$DisplayType.RUN_IN>
	//* 433  895:if_acmpne       95
	//* 434  898:aload_0         
	//* 435  899:fload           5
	//* 436  901:fload           8
	//* 437  903:fsub            
	//* 438  904:putfield        #94  <Field float contentWidth>
	//* 439  907:fload           5
	//* 440  909:fstore          4
	//* 441  911:goto            95
	//* 442  914:fload           7
	//* 443  916:fstore          5
	//* 444  918:aload_0         
	//* 445  919:getfield        #88  <Field Float height>
	//* 446  922:invokevirtual   #171 <Method float Float.floatValue()>
	//* 447  925:fload           9
	//* 448  927:fload           7
	//* 449  929:fsub            
	//* 450  930:fcmpl           
	//* 451  931:ifle            145
	//* 452  934:iconst_2        
	//* 453  935:ireturn         
	//* 454  936:fload           7
	//* 455  938:fstore          5
	//* 456  940:aload_0         
	//* 457  941:getfield        #90  <Field Float percentageHeight>
	//* 458  944:ifnull          145
	//* 459  947:iload           12
	//* 460  949:istore          11
	//* 461  951:aload_0         
	//* 462  952:getfield        #90  <Field Float percentageHeight>
	//* 463  955:invokevirtual   #171 <Method float Float.floatValue()>
	//* 464  958:f2d             
	//* 465  959:dconst_1        
	//* 466  960:dcmpg           
	//* 467  961:ifge            967
	//* 468  964:iconst_1        
	//* 469  965:istore          11
	//* 470  967:aload_0         
	//* 471  968:fload           9
	//* 472  970:fload           7
	//* 473  972:fsub            
	//* 474  973:aload_0         
	//* 475  974:getfield        #90  <Field Float percentageHeight>
	//* 476  977:invokevirtual   #171 <Method float Float.floatValue()>
	//* 477  980:fmul            
	//* 478  981:putfield        #96  <Field float contentHeight>
	//* 479  984:fload           9
	//* 480  986:aload_0         
	//* 481  987:getfield        #96  <Field float contentHeight>
	//* 482  990:fsub            
	//* 483  991:fstore          5
	//* 484  993:goto            145
			if(right != null)
	//* 485  996:aload_0         
	//* 486  997:getfield        #82  <Field Float right>
	//* 487 1000:ifnull          1019
				obj = ((Object) (Float.valueOf(-right.floatValue())));
	//  488 1003:aload_0         
	//  489 1004:getfield        #82  <Field Float right>
	//  490 1007:invokevirtual   #171 <Method float Float.floatValue()>
	//  491 1010:fneg            
	//  492 1011:invokestatic    #248 <Method Float Float.valueOf(float)>
	//  493 1014:astore          14
			else
	//* 494 1016:goto            172
				obj = ((Object) (Float.valueOf(0.0F)));
	//  495 1019:fconst_0        
	//  496 1020:invokestatic    #248 <Method Float Float.valueOf(float)>
	//  497 1023:astore          14
			if(top != null)
				obj1 = ((Object) (Float.valueOf(-top.floatValue())));
			else
	//* 498 1025:goto            172
			if(bottom != null)
	//* 499 1028:aload_0         
	//* 500 1029:getfield        #84  <Field Float bottom>
	//* 501 1032:ifnull          1044
				obj1 = ((Object) (bottom));
	//  502 1035:aload_0         
	//  503 1036:getfield        #84  <Field Float bottom>
	//  504 1039:astore          15
			else
	//* 505 1041:goto            192
				obj1 = ((Object) (Float.valueOf(0.0F)));
	//  506 1044:fconst_0        
	//  507 1045:invokestatic    #248 <Method Float Float.valueOf(float)>
	//  508 1048:astore          15
			pdfcontentbyte.saveState();
			pdfcontentbyte.transform(new AffineTransform(1.0F, 0.0F, 0.0F, 1.0F, ((Float) (obj)).floatValue(), ((Float) (obj1)).floatValue()));
		}
		if(!flag1 && (backgroundColor != null || backgroundImage != null) && getActualWidth() > 0.0F && getActualHeight() > 0.0F)
		{
			f2 = getActualWidth();
			f3 = getActualHeight();
			if(width != null)
				if(width.floatValue() > 0.0F)
					f2 = width.floatValue();
				else
	//* 509 1050:goto            192
					f2 = 0.0F;
	//  510 1053:fconst_0        
	//  511 1054:fstore          6
			if(height != null)
				if(height.floatValue() > 0.0F)
					f3 = height.floatValue();
				else
	//* 512 1056:goto            297
					f3 = 0.0F;
	//  513 1059:fconst_0        
	//  514 1060:fstore          7
			if(f2 > 0.0F && f3 > 0.0F)
			{
				obj = ((Object) (new Rectangle(f4, f5 - f3, f2 + f4, f5)));
				if(backgroundColor != null)
				{
					((Rectangle) (obj)).setBackgroundColor(backgroundColor);
					obj1 = ((Object) (new PdfArtifact()));
					pdfcontentbyte.openMCBlock(((IAccessibleElement) (obj1)));
					pdfcontentbyte.rectangle(((Rectangle) (obj)));
					pdfcontentbyte.closeMCBlock(((IAccessibleElement) (obj1)));
				}
				if(backgroundImage != null)
				{
					if(backgroundImageWidth == null)
						backgroundImage.scaleToFit(((Rectangle) (obj)));
					else
	//* 515 1062:goto            325
						backgroundImage.scaleAbsolute(backgroundImageWidth.floatValue(), backgroundImageHeight.floatValue());
	//  516 1065:aload_0         
	//  517 1066:getfield        #264 <Field Image backgroundImage>
	//  518 1069:aload_0         
	//  519 1070:getfield        #293 <Field Float backgroundImageWidth>
	//  520 1073:invokevirtual   #171 <Method float Float.floatValue()>
	//  521 1076:aload_0         
	//  522 1077:getfield        #362 <Field Float backgroundImageHeight>
	//  523 1080:invokevirtual   #171 <Method float Float.floatValue()>
	//  524 1083:invokevirtual   #365 <Method void Image.scaleAbsolute(float, float)>
					backgroundImage.setAbsolutePosition(((Rectangle) (obj)).getLeft(), ((Rectangle) (obj)).getBottom());
					pdfcontentbyte.openMCBlock(((IAccessibleElement) (backgroundImage)));
					pdfcontentbyte.addImage(backgroundImage);
					pdfcontentbyte.closeMCBlock(((IAccessibleElement) (backgroundImage)));
				}
			}
		}
		if(percentageWidth == null)
			contentWidth = 0.0F;
		if(percentageHeight == null)
			contentHeight = 0.0F;
		f2 = paddingBottom;
		f3 = paddingLeft;
		f6 = paddingRight;
		yLine = yLine - paddingTop;
		j = 1;
		if(!content.isEmpty())
		{
			if(floatLayout == null)
			{
				floatLayout = new FloatLayout(((List) (new ArrayList(((java.util.Collection) (content))))), flag);
				floatLayout.setRunDirection(runDirection);
			}
			floatLayout.setSimpleColumn(f4 + f3, f1 + f2, f - f6, yLine);
			if(getBorderTopStyle() != null)
				floatLayout.compositeColumn.setIgnoreSpacingBefore(false);
			k = floatLayout.layout(pdfcontentbyte, flag1);
			yLine = floatLayout.getYLine();
			j = k;
			if(percentageWidth == null)
			{
				j = k;
				if(contentWidth < floatLayout.getFilledWidth())
				{
					contentWidth = floatLayout.getFilledWidth();
					j = k;
				}
			}
		}
		if(!flag1 && position == PositionType.RELATIVE)
			pdfcontentbyte.restoreState();
		yLine = yLine - paddingBottom;
		if(percentageHeight == null)
			contentHeight = f5 - yLine;
		if(percentageWidth == null)
			contentWidth = contentWidth + (paddingLeft + paddingRight);
		if(i != 0)
			j = 1;
		return j;
_L4:
		f = f1;
		if(width.floatValue() <= f1 - f4) goto _L8; else goto _L7
_L7:
		return 2;
_L2:
label0:
		{
			if(percentageWidth == null)
				break label0;
			contentWidth = (f1 - f4) * percentageWidth.floatValue();
			f = f4 + contentWidth;
		}
		  goto _L8
		f = f1;
		if(percentageWidth != null) goto _L8; else goto _L9
_L9:
		f = f1;
		if(floatType != FloatType.NONE) goto _L8; else goto _L10
_L10:
		if(display == null || display == DisplayType.BLOCK || display == DisplayType.LIST_ITEM) goto _L12; else goto _L11
_L11:
		f = f1;
		if(display != DisplayType.RUN_IN) goto _L8; else goto _L12
_L12:
		contentWidth = f1 - f4;
		f = f1;
		  goto _L8
_L6:
		f1 = f3;
		if(height.floatValue() <= f5 - f3) goto _L14; else goto _L13
_L13:
		return 2;
		f1 = f3;
		if(percentageHeight != null)
		{
			i = j;
			if((double)percentageHeight.floatValue() < 1.0D)
				i = 1;
			contentHeight = (f5 - f3) * percentageHeight.floatValue();
			f1 = f5 - contentHeight;
		}
		  goto _L14
	//* 525 1086:goto            428
	}

	public boolean process(ElementListener elementlistener)
	{
		boolean flag;
		try
		{
			flag = elementlistener.add(((Element) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #373 <Method boolean ElementListener.add(Element)>
	//    3    7:istore_2        
		}
	//*   4    8:iload_2         
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(ElementListener elementlistener)
	//*   6   10:astore_1        
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		}
		return flag;
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		if(accessibleAttributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field HashMap accessibleAttributes>
	//*   2    4:ifnonnull       18
			accessibleAttributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #154 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #376 <Method void HashMap()>
	//    7   15:putfield        #129 <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #129 <Field HashMap accessibleAttributes>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #380 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void setBackgroundColor(BaseColor basecolor)
	{
		backgroundColor = basecolor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #136 <Field BaseColor backgroundColor>
	//    3    5:return          
	}

	public void setBackgroundImage(Image image)
	{
		backgroundImage = image;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #264 <Field Image backgroundImage>
	//    3    5:return          
	}

	public void setBackgroundImage(Image image, float f, float f1)
	{
		backgroundImage = image;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #264 <Field Image backgroundImage>
		backgroundImageWidth = Float.valueOf(f);
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:invokestatic    #248 <Method Float Float.valueOf(float)>
	//    6   10:putfield        #293 <Field Float backgroundImageWidth>
		backgroundImageHeight = Float.valueOf(f1);
	//    7   13:aload_0         
	//    8   14:fload_3         
	//    9   15:invokestatic    #248 <Method Float Float.valueOf(float)>
	//   10   18:putfield        #362 <Field Float backgroundImageHeight>
	//   11   21:return          
	}

	public void setBorderTopStyle(BorderTopStyle bordertopstyle)
	{
		borderTopStyle = bordertopstyle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #178 <Field PdfDiv$BorderTopStyle borderTopStyle>
	//    3    5:return          
	}

	public void setBottom(Float float1)
	{
		bottom = float1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Float bottom>
	//    3    5:return          
	}

	public void setContent(ArrayList arraylist)
	{
		content = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field ArrayList content>
	//    3    5:return          
	}

	public void setContentHeight(float f)
	{
		contentHeight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #96  <Field float contentHeight>
	//    3    5:return          
	}

	public void setContentWidth(float f)
	{
		contentWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #94  <Field float contentWidth>
	//    3    5:return          
	}

	public void setDisplay(DisplayType displaytype)
	{
		display = displaytype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #192 <Field PdfDiv$DisplayType display>
	//    3    5:return          
	}

	public void setFloatType(FloatType floattype)
	{
		floatType = floattype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field PdfDiv$FloatType floatType>
	//    3    5:return          
	}

	public void setHeight(Float float1)
	{
		height = float1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field Float height>
	//    3    5:return          
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		id = accessibleelementid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field AccessibleElementId id>
	//    3    5:return          
	}

	public void setKeepTogether(boolean flag)
	{
		keepTogether = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #143 <Field boolean keepTogether>
	//    3    5:return          
	}

	public void setLeft(Float float1)
	{
		left = float1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field Float left>
	//    3    5:return          
	}

	public void setPaddingBottom(float f)
	{
		paddingBottom = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #106 <Field float paddingBottom>
	//    3    5:return          
	}

	public void setPaddingLeft(float f)
	{
		paddingLeft = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #100 <Field float paddingLeft>
	//    3    5:return          
	}

	public void setPaddingRight(float f)
	{
		paddingRight = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #102 <Field float paddingRight>
	//    3    5:return          
	}

	public void setPaddingTop(float f)
	{
		paddingTop = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #104 <Field float paddingTop>
	//    3    5:return          
	}

	public void setPercentageHeight(Float float1)
	{
		percentageHeight = float1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field Float percentageHeight>
	//    3    5:return          
	}

	public void setPercentageWidth(Float float1)
	{
		percentageWidth = float1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field Float percentageWidth>
	//    3    5:return          
	}

	public void setPosition(PositionType positiontype)
	{
		position = positiontype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #116 <Field PdfDiv$PositionType position>
	//    3    5:return          
	}

	public void setRight(Float float1)
	{
		right = float1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field Float right>
	//    3    5:return          
	}

	public void setRole(PdfName pdfname)
	{
		role = pdfname;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #127 <Field PdfName role>
	//    3    5:return          
	}

	public void setRunDirection(int i)
	{
		runDirection = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #120 <Field int runDirection>
	//    3    5:return          
	}

	public void setSpacingAfter(float f)
	{
		spacingAfter = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #216 <Field float spacingAfter>
	//    3    5:return          
	}

	public void setSpacingBefore(float f)
	{
		spacingBefore = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #219 <Field float spacingBefore>
	//    3    5:return          
	}

	public void setTextAlignment(int i)
	{
		textAlignment = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #98  <Field int textAlignment>
	//    3    5:return          
	}

	public void setTop(Float float1)
	{
		top = float1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field Float top>
	//    3    5:return          
	}

	public void setWidth(Float float1)
	{
		width = float1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field Float width>
	//    3    5:return          
	}

	public int type()
	{
		return 37;
	//    0    0:bipush          37
	//    1    2:ireturn         
	}

	protected HashMap accessibleAttributes;
	private BaseColor backgroundColor;
	private Image backgroundImage;
	private Float backgroundImageHeight;
	private Float backgroundImageWidth;
	private BorderTopStyle borderTopStyle;
	private Float bottom;
	private ArrayList content;
	private float contentHeight;
	private float contentWidth;
	private DisplayType display;
	private FloatLayout floatLayout;
	private FloatType floatType;
	private Float height;
	protected AccessibleElementId id;
	private boolean keepTogether;
	private Float left;
	private float paddingBottom;
	private float paddingLeft;
	private float paddingRight;
	private float paddingTop;
	private Float percentageHeight;
	private Float percentageWidth;
	private PositionType position;
	private Float right;
	protected PdfName role;
	protected int runDirection;
	protected float spacingAfter;
	protected float spacingBefore;
	private int textAlignment;
	private Float top;
	private Float width;
	private float yLine;
}
