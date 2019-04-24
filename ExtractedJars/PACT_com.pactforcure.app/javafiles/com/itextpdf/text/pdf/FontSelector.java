// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf:
//			BaseFont

public class FontSelector
{

	public FontSelector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		fonts = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ArrayList()>
	//    6   12:putfield        #18  <Field ArrayList fonts>
		currentFont = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #20  <Field Font currentFont>
	//   10   20:return          
	}

	public void addFont(Font font)
	{
		if(font.getBaseFont() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #29  <Method BaseFont Font.getBaseFont()>
	//*   2    4:ifnull          17
		{
			fonts.add(((Object) (font)));
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field ArrayList fonts>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//    7   15:pop             
			return;
	//    8   16:return          
		} else
		{
			font = new Font(font.getCalculatedBaseFont(true), font.getSize(), font.getCalculatedStyle(), font.getColor());
	//    9   17:new             #25  <Class Font>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #37  <Method BaseFont Font.getCalculatedBaseFont(boolean)>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #41  <Method float Font.getSize()>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #45  <Method int Font.getCalculatedStyle()>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #49  <Method com.itextpdf.text.BaseColor Font.getColor()>
	//   20   38:invokespecial   #52  <Method void Font(BaseFont, float, int, com.itextpdf.text.BaseColor)>
	//   21   41:astore_1        
			fonts.add(((Object) (font)));
	//   22   42:aload_0         
	//   23   43:getfield        #18  <Field ArrayList fonts>
	//   24   46:aload_1         
	//   25   47:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   26   50:pop             
			return;
	//   27   51:return          
		}
	}

	public Phrase process(String s)
	{
		if(fonts.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ArrayList fonts>
	//*   2    4:invokevirtual   #57  <Method int ArrayList.size()>
	//*   3    7:ifne            27
			throw new IndexOutOfBoundsException(MessageLocalization.getComposedMessage("no.font.is.defined", new Object[0]));
	//    4   10:new             #59  <Class IndexOutOfBoundsException>
	//    5   13:dup             
	//    6   14:ldc1            #61  <String "no.font.is.defined">
	//    7   16:iconst_0        
	//    8   17:anewarray       Object[]
	//    9   20:invokestatic    #67  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   23:invokespecial   #70  <Method void IndexOutOfBoundsException(String)>
	//   11   26:athrow          
		s = ((String) (s.toCharArray()));
	//   12   27:aload_1         
	//   13   28:invokevirtual   #76  <Method char[] String.toCharArray()>
	//   14   31:astore_1        
		int j = s.length;
	//   15   32:aload_1         
	//   16   33:arraylength     
	//   17   34:istore_3        
		Object obj = ((Object) (new StringBuffer()));
	//   18   35:new             #78  <Class StringBuffer>
	//   19   38:dup             
	//   20   39:invokespecial   #79  <Method void StringBuffer()>
	//   21   42:astore          5
		Phrase phrase = new Phrase();
	//   22   44:new             #81  <Class Phrase>
	//   23   47:dup             
	//   24   48:invokespecial   #82  <Method void Phrase()>
	//   25   51:astore          4
		currentFont = null;
	//   26   53:aload_0         
	//   27   54:aconst_null     
	//   28   55:putfield        #20  <Field Font currentFont>
		for(int i = 0; i < j; i++)
	//*  29   58:iconst_0        
	//*  30   59:istore_2        
	//*  31   60:iload_2         
	//*  32   61:iload_3         
	//*  33   62:icmpge          95
		{
			Chunk chunk = processChar(((char []) (s)), i, ((StringBuffer) (obj)));
	//   34   65:aload_0         
	//   35   66:aload_1         
	//   36   67:iload_2         
	//   37   68:aload           5
	//   38   70:invokevirtual   #86  <Method Chunk processChar(char[], int, StringBuffer)>
	//   39   73:astore          6
			if(chunk != null)
	//*  40   75:aload           6
	//*  41   77:ifnull          88
				phrase.add(((com.itextpdf.text.Element) (chunk)));
	//   42   80:aload           4
	//   43   82:aload           6
	//   44   84:invokevirtual   #89  <Method boolean Phrase.add(com.itextpdf.text.Element)>
	//   45   87:pop             
		}

	//   46   88:iload_2         
	//   47   89:iconst_1        
	//   48   90:iadd            
	//   49   91:istore_2        
	//*  50   92:goto            60
		if(((StringBuffer) (obj)).length() > 0)
	//*  51   95:aload           5
	//*  52   97:invokevirtual   #92  <Method int StringBuffer.length()>
	//*  53  100:ifle            138
		{
			obj = ((Object) (((StringBuffer) (obj)).toString()));
	//   54  103:aload           5
	//   55  105:invokevirtual   #96  <Method String StringBuffer.toString()>
	//   56  108:astore          5
			if(currentFont != null)
	//*  57  110:aload_0         
	//*  58  111:getfield        #20  <Field Font currentFont>
	//*  59  114:ifnull          141
				s = ((String) (currentFont));
	//   60  117:aload_0         
	//   61  118:getfield        #20  <Field Font currentFont>
	//   62  121:astore_1        
			else
	//*  63  122:aload           4
	//*  64  124:new             #98  <Class Chunk>
	//*  65  127:dup             
	//*  66  128:aload           5
	//*  67  130:aload_1         
	//*  68  131:invokespecial   #101 <Method void Chunk(String, Font)>
	//*  69  134:invokevirtual   #89  <Method boolean Phrase.add(com.itextpdf.text.Element)>
	//*  70  137:pop             
	//*  71  138:aload           4
	//*  72  140:areturn         
				s = ((String) ((Font)fonts.get(0)));
	//   73  141:aload_0         
	//   74  142:getfield        #18  <Field ArrayList fonts>
	//   75  145:iconst_0        
	//   76  146:invokevirtual   #105 <Method Object ArrayList.get(int)>
	//   77  149:checkcast       #25  <Class Font>
	//   78  152:astore_1        
			phrase.add(((com.itextpdf.text.Element) (new Chunk(((String) (obj)), ((Font) (s))))));
		}
		return phrase;
	//*  79  153:goto            122
	}

	protected Chunk processChar(char ac[], int i, StringBuffer stringbuffer)
	{
		char c;
		Chunk chunk;
		Object obj;
		Object obj1;
		Font font1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		chunk = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		font1 = null;
	//    4    6:aconst_null     
	//    5    7:astore          10
		obj = null;
	//    6    9:aconst_null     
	//    7   10:astore          8
		c = ac[i];
	//    8   12:aload_1         
	//    9   13:iload_2         
	//   10   14:caload          
	//   11   15:istore          4
		if(c != '\n' && c != '\r') goto _L2; else goto _L1
	//   12   17:iload           4
	//   13   19:bipush          10
	//   14   21:icmpeq          31
	//   15   24:iload           4
	//   16   26:bipush          13
	//   17   28:icmpne          40
_L1:
		stringbuffer.append(c);
	//   18   31:aload_3         
	//   19   32:iload           4
	//   20   34:invokevirtual   #109 <Method StringBuffer StringBuffer.append(char)>
	//   21   37:pop             
_L4:
		return null;
	//   22   38:aconst_null     
	//   23   39:areturn         
_L2:
		if(!Utilities.isSurrogatePair(ac, i))
			break; /* Loop/switch isn't completed */
	//   24   40:aload_1         
	//   25   41:iload_2         
	//   26   42:invokestatic    #115 <Method boolean Utilities.isSurrogatePair(char[], int)>
	//   27   45:ifeq            199
		int k = Utilities.convertToUtf32(ac, i);
	//   28   48:aload_1         
	//   29   49:iload_2         
	//   30   50:invokestatic    #119 <Method int Utilities.convertToUtf32(char[], int)>
	//   31   53:istore          6
		int j = 0;
	//   32   55:iconst_0        
	//   33   56:istore          5
		while(j < fonts.size()) 
	//*  34   58:iload           5
	//*  35   60:aload_0         
	//*  36   61:getfield        #18  <Field ArrayList fonts>
	//*  37   64:invokevirtual   #57  <Method int ArrayList.size()>
	//*  38   67:icmpge          38
		{
			font1 = (Font)fonts.get(j);
	//   39   70:aload_0         
	//   40   71:getfield        #18  <Field ArrayList fonts>
	//   41   74:iload           5
	//   42   76:invokevirtual   #105 <Method Object ArrayList.get(int)>
	//   43   79:checkcast       #25  <Class Font>
	//   44   82:astore          10
			if(font1.getBaseFont().charExists(k) || Character.getType(k) == 16)
	//*  45   84:aload           10
	//*  46   86:invokevirtual   #29  <Method BaseFont Font.getBaseFont()>
	//*  47   89:iload           6
	//*  48   91:invokevirtual   #125 <Method boolean BaseFont.charExists(int)>
	//*  49   94:ifne            107
	//*  50   97:iload           6
	//*  51   99:invokestatic    #131 <Method int Character.getType(int)>
	//*  52  102:bipush          16
	//*  53  104:icmpne          190
			{
				chunk = ((Chunk) (obj1));
	//   54  107:aload           9
	//   55  109:astore          7
				if(currentFont != font1)
	//*  56  111:aload_0         
	//*  57  112:getfield        #20  <Field Font currentFont>
	//*  58  115:aload           10
	//*  59  117:if_acmpeq       170
				{
					chunk = ((Chunk) (obj));
	//   60  120:aload           8
	//   61  122:astore          7
					if(stringbuffer.length() > 0)
	//*  62  124:aload_3         
	//*  63  125:invokevirtual   #92  <Method int StringBuffer.length()>
	//*  64  128:ifle            164
					{
						chunk = ((Chunk) (obj));
	//   65  131:aload           8
	//   66  133:astore          7
						if(currentFont != null)
	//*  67  135:aload_0         
	//*  68  136:getfield        #20  <Field Font currentFont>
	//*  69  139:ifnull          164
						{
							chunk = new Chunk(stringbuffer.toString(), currentFont);
	//   70  142:new             #98  <Class Chunk>
	//   71  145:dup             
	//   72  146:aload_3         
	//   73  147:invokevirtual   #96  <Method String StringBuffer.toString()>
	//   74  150:aload_0         
	//   75  151:getfield        #20  <Field Font currentFont>
	//   76  154:invokespecial   #101 <Method void Chunk(String, Font)>
	//   77  157:astore          7
							stringbuffer.setLength(0);
	//   78  159:aload_3         
	//   79  160:iconst_0        
	//   80  161:invokevirtual   #135 <Method void StringBuffer.setLength(int)>
						}
					}
					currentFont = font1;
	//   81  164:aload_0         
	//   82  165:aload           10
	//   83  167:putfield        #20  <Field Font currentFont>
				}
				stringbuffer.append(c);
	//   84  170:aload_3         
	//   85  171:iload           4
	//   86  173:invokevirtual   #109 <Method StringBuffer StringBuffer.append(char)>
	//   87  176:pop             
				stringbuffer.append(ac[i + 1]);
	//   88  177:aload_3         
	//   89  178:aload_1         
	//   90  179:iload_2         
	//   91  180:iconst_1        
	//   92  181:iadd            
	//   93  182:caload          
	//   94  183:invokevirtual   #109 <Method StringBuffer StringBuffer.append(char)>
	//   95  186:pop             
				return chunk;
	//   96  187:aload           7
	//   97  189:areturn         
			}
			j++;
	//   98  190:iload           5
	//   99  192:iconst_1        
	//  100  193:iadd            
	//  101  194:istore          5
		}
		if(true) goto _L4; else goto _L3
	//  102  196:goto            58
_L3:
		i = 0;
	//  103  199:iconst_0        
	//  104  200:istore_2        
		while(i < fonts.size()) 
	//* 105  201:iload_2         
	//* 106  202:aload_0         
	//* 107  203:getfield        #18  <Field ArrayList fonts>
	//* 108  206:invokevirtual   #57  <Method int ArrayList.size()>
	//* 109  209:icmpge          38
		{
			Font font = (Font)fonts.get(i);
	//  110  212:aload_0         
	//  111  213:getfield        #18  <Field ArrayList fonts>
	//  112  216:iload_2         
	//  113  217:invokevirtual   #105 <Method Object ArrayList.get(int)>
	//  114  220:checkcast       #25  <Class Font>
	//  115  223:astore          8
			if(font.getBaseFont().charExists(((int) (c))) || Character.getType(c) == 16)
	//* 116  225:aload           8
	//* 117  227:invokevirtual   #29  <Method BaseFont Font.getBaseFont()>
	//* 118  230:iload           4
	//* 119  232:invokevirtual   #125 <Method boolean BaseFont.charExists(int)>
	//* 120  235:ifne            248
	//* 121  238:iload           4
	//* 122  240:invokestatic    #138 <Method int Character.getType(char)>
	//* 123  243:bipush          16
	//* 124  245:icmpne          316
			{
				ac = ((char []) (font1));
	//  125  248:aload           10
	//  126  250:astore_1        
				if(currentFont != font)
	//* 127  251:aload_0         
	//* 128  252:getfield        #20  <Field Font currentFont>
	//* 129  255:aload           8
	//* 130  257:if_acmpeq       307
				{
					ac = ((char []) (chunk));
	//  131  260:aload           7
	//  132  262:astore_1        
					if(stringbuffer.length() > 0)
	//* 133  263:aload_3         
	//* 134  264:invokevirtual   #92  <Method int StringBuffer.length()>
	//* 135  267:ifle            301
					{
						ac = ((char []) (chunk));
	//  136  270:aload           7
	//  137  272:astore_1        
						if(currentFont != null)
	//* 138  273:aload_0         
	//* 139  274:getfield        #20  <Field Font currentFont>
	//* 140  277:ifnull          301
						{
							ac = ((char []) (new Chunk(stringbuffer.toString(), currentFont)));
	//  141  280:new             #98  <Class Chunk>
	//  142  283:dup             
	//  143  284:aload_3         
	//  144  285:invokevirtual   #96  <Method String StringBuffer.toString()>
	//  145  288:aload_0         
	//  146  289:getfield        #20  <Field Font currentFont>
	//  147  292:invokespecial   #101 <Method void Chunk(String, Font)>
	//  148  295:astore_1        
							stringbuffer.setLength(0);
	//  149  296:aload_3         
	//  150  297:iconst_0        
	//  151  298:invokevirtual   #135 <Method void StringBuffer.setLength(int)>
						}
					}
					currentFont = font;
	//  152  301:aload_0         
	//  153  302:aload           8
	//  154  304:putfield        #20  <Field Font currentFont>
				}
				stringbuffer.append(c);
	//  155  307:aload_3         
	//  156  308:iload           4
	//  157  310:invokevirtual   #109 <Method StringBuffer StringBuffer.append(char)>
	//  158  313:pop             
				return ((Chunk) (ac));
	//  159  314:aload_1         
	//  160  315:areturn         
			}
			i++;
	//  161  316:iload_2         
	//  162  317:iconst_1        
	//  163  318:iadd            
	//  164  319:istore_2        
		}
		if(true) goto _L4; else goto _L5
	//  165  320:goto            201
_L5:
	}

	protected Font currentFont;
	protected ArrayList fonts;
}
