// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.ListLabel;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.draw.DrawInterface;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// Referenced classes of package com.itextpdf.text.pdf:
//			BidiLine, PdfChunk, PdfLine, PdfContentByte, 
//			PdfWriter, PdfPTable, PdfPCell, PdfName, 
//			PdfDocument, PdfFont, PdfPRow, PdfPTableHeader, 
//			PdfPTableBody, PdfPTableFooter, PdfPTableEventSplit, PdfPTableEventAfterSplit, 
//			FloatLayout

public class ColumnText
{

	public ColumnText(PdfContentByte pdfcontentbyte)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class ColumnText>
	//    4    7:invokestatic    #100 <Method Logger LoggerFactory.getLogger(Class)>
	//    5   10:putfield        #102 <Field Logger LOGGER>
		runDirection = 1;
	//    6   13:aload_0         
	//    7   14:iconst_1        
	//    8   15:putfield        #104 <Field int runDirection>
		alignment = 0;
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:putfield        #106 <Field int alignment>
		currentLeading = 16F;
	//   12   23:aload_0         
	//   13   24:ldc1            #107 <Float 16F>
	//   14   26:putfield        #109 <Field float currentLeading>
		fixedLeading = 16F;
	//   15   29:aload_0         
	//   16   30:ldc1            #107 <Float 16F>
	//   17   32:putfield        #111 <Field float fixedLeading>
		multipliedLeading = 0.0F;
	//   18   35:aload_0         
	//   19   36:fconst_0        
	//   20   37:putfield        #113 <Field float multipliedLeading>
		indent = 0.0F;
	//   21   40:aload_0         
	//   22   41:fconst_0        
	//   23   42:putfield        #115 <Field float indent>
		followingIndent = 0.0F;
	//   24   45:aload_0         
	//   25   46:fconst_0        
	//   26   47:putfield        #117 <Field float followingIndent>
		rightIndent = 0.0F;
	//   27   50:aload_0         
	//   28   51:fconst_0        
	//   29   52:putfield        #119 <Field float rightIndent>
		extraParagraphSpace = 0.0F;
	//   30   55:aload_0         
	//   31   56:fconst_0        
	//   32   57:putfield        #121 <Field float extraParagraphSpace>
		rectangularWidth = -1F;
	//   33   60:aload_0         
	//   34   61:ldc1            #122 <Float -1F>
	//   35   63:putfield        #124 <Field float rectangularWidth>
		rectangularMode = false;
	//   36   66:aload_0         
	//   37   67:iconst_0        
	//   38   68:putfield        #126 <Field boolean rectangularMode>
		spaceCharRatio = 0.0F;
	//   39   71:aload_0         
	//   40   72:fconst_0        
	//   41   73:putfield        #128 <Field float spaceCharRatio>
		lastWasNewline = true;
	//   42   76:aload_0         
	//   43   77:iconst_1        
	//   44   78:putfield        #130 <Field boolean lastWasNewline>
		repeatFirstLineIndent = true;
	//   45   81:aload_0         
	//   46   82:iconst_1        
	//   47   83:putfield        #132 <Field boolean repeatFirstLineIndent>
		firstLineYDone = false;
	//   48   86:aload_0         
	//   49   87:iconst_0        
	//   50   88:putfield        #134 <Field boolean firstLineYDone>
		arabicOptions = 0;
	//   51   91:aload_0         
	//   52   92:iconst_0        
	//   53   93:putfield        #136 <Field int arabicOptions>
		composite = false;
	//   54   96:aload_0         
	//   55   97:iconst_0        
	//   56   98:putfield        #138 <Field boolean composite>
		listIdx = 0;
	//   57  101:aload_0         
	//   58  102:iconst_0        
	//   59  103:putfield        #140 <Field int listIdx>
		rowIdx = 0;
	//   60  106:aload_0         
	//   61  107:iconst_0        
	//   62  108:putfield        #142 <Field int rowIdx>
		splittedRow = -2;
	//   63  111:aload_0         
	//   64  112:bipush          -2
	//   65  114:putfield        #144 <Field int splittedRow>
		useAscender = false;
	//   66  117:aload_0         
	//   67  118:iconst_0        
	//   68  119:putfield        #146 <Field boolean useAscender>
		adjustFirstLine = true;
	//   69  122:aload_0         
	//   70  123:iconst_1        
	//   71  124:putfield        #148 <Field boolean adjustFirstLine>
		inheritGraphicState = false;
	//   72  127:aload_0         
	//   73  128:iconst_0        
	//   74  129:putfield        #150 <Field boolean inheritGraphicState>
		ignoreSpacingBefore = true;
	//   75  132:aload_0         
	//   76  133:iconst_1        
	//   77  134:putfield        #152 <Field boolean ignoreSpacingBefore>
		canvas = pdfcontentbyte;
	//   78  137:aload_0         
	//   79  138:aload_1         
	//   80  139:putfield        #154 <Field PdfContentByte canvas>
	//   81  142:return          
	}

	private void addWaitingPhrase()
	{
		if(bidiLine == null && waitPhrase != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field BidiLine bidiLine>
	//*   2    4:ifnonnull       88
	//*   3    7:aload_0         
	//*   4    8:getfield        #160 <Field Phrase waitPhrase>
	//*   5   11:ifnull          88
		{
			bidiLine = new BidiLine();
	//    6   14:aload_0         
	//    7   15:new             #162 <Class BidiLine>
	//    8   18:dup             
	//    9   19:invokespecial   #163 <Method void BidiLine()>
	//   10   22:putfield        #158 <Field BidiLine bidiLine>
			Chunk chunk;
			for(Iterator iterator = waitPhrase.getChunks().iterator(); iterator.hasNext(); bidiLine.addChunk(new PdfChunk(chunk, ((PdfAction) (null)), waitPhrase.getTabSettings())))
	//*  11   25:aload_0         
	//*  12   26:getfield        #160 <Field Phrase waitPhrase>
	//*  13   29:invokevirtual   #169 <Method List Phrase.getChunks()>
	//*  14   32:invokeinterface #175 <Method Iterator List.iterator()>
	//*  15   37:astore_1        
	//*  16   38:aload_1         
	//*  17   39:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//*  18   44:ifeq            83
				chunk = (Chunk)iterator.next();
	//   19   47:aload_1         
	//   20   48:invokeinterface #185 <Method Object Iterator.next()>
	//   21   53:checkcast       #187 <Class Chunk>
	//   22   56:astore_2        

	//   23   57:aload_0         
	//   24   58:getfield        #158 <Field BidiLine bidiLine>
	//   25   61:new             #189 <Class PdfChunk>
	//   26   64:dup             
	//   27   65:aload_2         
	//   28   66:aconst_null     
	//   29   67:aload_0         
	//   30   68:getfield        #160 <Field Phrase waitPhrase>
	//   31   71:invokevirtual   #193 <Method com.itextpdf.text.TabSettings Phrase.getTabSettings()>
	//   32   74:invokespecial   #196 <Method void PdfChunk(Chunk, PdfAction, com.itextpdf.text.TabSettings)>
	//   33   77:invokevirtual   #200 <Method void BidiLine.addChunk(PdfChunk)>
	//*  34   80:goto            38
			waitPhrase = null;
	//   35   83:aload_0         
	//   36   84:aconst_null     
	//   37   85:putfield        #160 <Field Phrase waitPhrase>
		}
	//   38   88:return          
	}

	public static ColumnText duplicate(ColumnText columntext)
	{
		ColumnText columntext1 = new ColumnText(((PdfContentByte) (null)));
	//    0    0:new             #2   <Class ColumnText>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #204 <Method void ColumnText(PdfContentByte)>
	//    4    8:astore_1        
		columntext1.setACopy(columntext);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #207 <Method ColumnText setACopy(ColumnText)>
	//    8   14:pop             
		return columntext1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public static float fitText(Font font, String s, Rectangle rectangle, float f, int i)
	{
		float f1;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          14
		f1 = f;
	//    2    3:fload_3         
	//    3    4:fstore          5
		if(f > 0.0F) goto _L2; else goto _L1
	//    4    6:fload_3         
	//    5    7:fconst_0        
	//    6    8:fcmpg           
	//    7    9:ifgt            101
_L1:
		int k;
		int l;
		l = 0;
	//    8   12:iconst_0        
	//    9   13:istore          10
		k = 0;
	//   10   15:iconst_0        
	//   11   16:istore          9
		Object obj = obj1;
	//   12   18:aload           14
	//   13   20:astore          13
		Object obj2 = ((Object) (s.toCharArray()));
	//   14   22:aload_1         
	//   15   23:invokevirtual   #217 <Method char[] String.toCharArray()>
	//   16   26:astore          15
		int j = 0;
	//   17   28:iconst_0        
	//   18   29:istore          8
_L14:
		ColumnText columntext = ((ColumnText) (obj1));
	//   19   31:aload           14
	//   20   33:astore          13
		if(j >= obj2.length) goto _L4; else goto _L3
	//   21   35:iload           8
	//   22   37:aload           15
	//   23   39:arraylength     
	//   24   40:icmpge          66
_L3:
		int i1;
		int j1;
		if(obj2[j] != '\n')
			break; /* Loop/switch isn't completed */
	//   25   43:aload           15
	//   26   45:iload           8
	//   27   47:caload          
	//   28   48:bipush          10
	//   29   50:icmpne          364
		j1 = k + 1;
	//   30   53:iload           9
	//   31   55:iconst_1        
	//   32   56:iadd            
	//   33   57:istore          12
		i1 = l;
	//   34   59:iload           10
	//   35   61:istore          11
		  goto _L5
	//*  36   63:goto            347
_L4:
		columntext = ((ColumnText) (obj1));
	//   37   66:aload           14
	//   38   68:astore          13
		j = Math.max(l, k);
	//   39   70:iload           10
	//   40   72:iload           9
	//   41   74:invokestatic    #223 <Method int Math.max(int, int)>
	//   42   77:istore          8
		columntext = ((ColumnText) (obj1));
	//   43   79:aload           14
	//   44   81:astore          13
		f1 = Math.abs(rectangle.getHeight()) / (float)(j + 1) - 0.001F;
	//   45   83:aload_2         
	//   46   84:invokevirtual   #229 <Method float Rectangle.getHeight()>
	//   47   87:invokestatic    #233 <Method float Math.abs(float)>
	//   48   90:iload           8
	//   49   92:iconst_1        
	//   50   93:iadd            
	//   51   94:i2f             
	//   52   95:fdiv            
	//   53   96:ldc1            #234 <Float 0.001F>
	//   54   98:fsub            
	//   55   99:fstore          5
_L2:
		columntext = ((ColumnText) (obj1));
	//   56  101:aload           14
	//   57  103:astore          13
		font.setSize(f1);
	//   58  105:aload_0         
	//   59  106:fload           5
	//   60  108:invokevirtual   #240 <Method void Font.setSize(float)>
		columntext = ((ColumnText) (obj1));
	//   61  111:aload           14
	//   62  113:astore          13
		obj2 = ((Object) (new Phrase(s, font)));
	//   63  115:new             #165 <Class Phrase>
	//   64  118:dup             
	//   65  119:aload_1         
	//   66  120:aload_0         
	//   67  121:invokespecial   #243 <Method void Phrase(String, Font)>
	//   68  124:astore          15
		columntext = ((ColumnText) (obj1));
	//   69  126:aload           14
	//   70  128:astore          13
		columntext = new ColumnText(((PdfContentByte) (null)));
	//   71  130:new             #2   <Class ColumnText>
	//   72  133:dup             
	//   73  134:aconst_null     
	//   74  135:invokespecial   #204 <Method void ColumnText(PdfContentByte)>
	//   75  138:astore          13
		columntext.setSimpleColumn(((Phrase) (obj2)), rectangle.getLeft(), rectangle.getBottom(), rectangle.getRight(), rectangle.getTop(), f1, 0);
	//   76  140:aload           13
	//   77  142:aload           15
	//   78  144:aload_2         
	//   79  145:invokevirtual   #246 <Method float Rectangle.getLeft()>
	//   80  148:aload_2         
	//   81  149:invokevirtual   #249 <Method float Rectangle.getBottom()>
	//   82  152:aload_2         
	//   83  153:invokevirtual   #252 <Method float Rectangle.getRight()>
	//   84  156:aload_2         
	//   85  157:invokevirtual   #255 <Method float Rectangle.getTop()>
	//   86  160:fload           5
	//   87  162:iconst_0        
	//   88  163:invokevirtual   #259 <Method void setSimpleColumn(Phrase, float, float, float, float, float, int)>
		columntext.setRunDirection(i);
	//   89  166:aload           13
	//   90  168:iload           4
	//   91  170:invokevirtual   #263 <Method void setRunDirection(int)>
		j = columntext.go(true);
	//   92  173:aload           13
	//   93  175:iconst_1        
	//   94  176:invokevirtual   #267 <Method int go(boolean)>
	//   95  179:istore          8
		if((j & 1) == 0) goto _L7; else goto _L6
	//   96  181:iload           8
	//   97  183:iconst_1        
	//   98  184:iand            
	//   99  185:ifeq            195
_L6:
		float f3 = f1;
	//  100  188:fload           5
	//  101  190:fstore          7
_L9:
		return f3;
	//  102  192:fload           7
	//  103  194:freturn         
_L7:
		float f2;
		f3 = 0.0F;
	//  104  195:fconst_0        
	//  105  196:fstore          7
		f2 = f1;
	//  106  198:fload           5
	//  107  200:fstore          6
		f = f1;
	//  108  202:fload           5
	//  109  204:fstore_3        
		j = 0;
	//  110  205:iconst_0        
	//  111  206:istore          8
		f1 = f3;
	//  112  208:fload           7
	//  113  210:fstore          5
_L10:
		if(j >= 50)
			break MISSING_BLOCK_LABEL_331;
	//  114  212:iload           8
	//  115  214:bipush          50
	//  116  216:icmpge          331
		f = (f1 + f2) / 2.0F;
	//  117  219:fload           5
	//  118  221:fload           6
	//  119  223:fadd            
	//  120  224:fconst_2        
	//  121  225:fdiv            
	//  122  226:fstore_3        
		columntext = new ColumnText(((PdfContentByte) (null)));
	//  123  227:new             #2   <Class ColumnText>
	//  124  230:dup             
	//  125  231:aconst_null     
	//  126  232:invokespecial   #204 <Method void ColumnText(PdfContentByte)>
	//  127  235:astore          13
		font.setSize(f);
	//  128  237:aload_0         
	//  129  238:fload_3         
	//  130  239:invokevirtual   #240 <Method void Font.setSize(float)>
		columntext.setSimpleColumn(new Phrase(s, font), rectangle.getLeft(), rectangle.getBottom(), rectangle.getRight(), rectangle.getTop(), f, 0);
	//  131  242:aload           13
	//  132  244:new             #165 <Class Phrase>
	//  133  247:dup             
	//  134  248:aload_1         
	//  135  249:aload_0         
	//  136  250:invokespecial   #243 <Method void Phrase(String, Font)>
	//  137  253:aload_2         
	//  138  254:invokevirtual   #246 <Method float Rectangle.getLeft()>
	//  139  257:aload_2         
	//  140  258:invokevirtual   #249 <Method float Rectangle.getBottom()>
	//  141  261:aload_2         
	//  142  262:invokevirtual   #252 <Method float Rectangle.getRight()>
	//  143  265:aload_2         
	//  144  266:invokevirtual   #255 <Method float Rectangle.getTop()>
	//  145  269:fload_3         
	//  146  270:iconst_0        
	//  147  271:invokevirtual   #259 <Method void setSimpleColumn(Phrase, float, float, float, float, float, int)>
		columntext.setRunDirection(i);
	//  148  274:aload           13
	//  149  276:iload           4
	//  150  278:invokevirtual   #263 <Method void setRunDirection(int)>
		k = columntext.go(true);
	//  151  281:aload           13
	//  152  283:iconst_1        
	//  153  284:invokevirtual   #267 <Method int go(boolean)>
	//  154  287:istore          9
		if((k & 1) == 0)
			break MISSING_BLOCK_LABEL_325;
	//  155  289:iload           9
	//  156  291:iconst_1        
	//  157  292:iand            
	//  158  293:ifeq            325
		f3 = f;
	//  159  296:fload_3         
	//  160  297:fstore          7
		if(f2 - f1 < f * 0.1F) goto _L9; else goto _L8
	//  161  299:fload           6
	//  162  301:fload           5
	//  163  303:fsub            
	//  164  304:fload_3         
	//  165  305:ldc2            #268 <Float 0.1F>
	//  166  308:fmul            
	//  167  309:fcmpg           
	//  168  310:iflt            192
_L8:
		f1 = f;
	//  169  313:fload_3         
	//  170  314:fstore          5
_L11:
		j++;
	//  171  316:iload           8
	//  172  318:iconst_1        
	//  173  319:iadd            
	//  174  320:istore          8
		  goto _L10
	//* 175  322:goto            212
		f2 = f;
	//  176  325:fload_3         
	//  177  326:fstore          6
		  goto _L11
	//* 178  328:goto            316
		return f;
	//  179  331:fload_3         
	//  180  332:freturn         
		  goto _L10
		font;
	//  181  333:astore_0        
_L12:
		throw new ExceptionConverter(((Exception) (font)));
	//  182  334:new             #270 <Class ExceptionConverter>
	//  183  337:dup             
	//  184  338:aload_0         
	//  185  339:invokespecial   #273 <Method void ExceptionConverter(Exception)>
	//  186  342:athrow          
		font;
	//  187  343:astore_0        
		if(true) goto _L12; else goto _L5
	//  188  344:goto            334
_L5:
		j++;
	//  189  347:iload           8
	//  190  349:iconst_1        
	//  191  350:iadd            
	//  192  351:istore          8
		l = i1;
	//  193  353:iload           11
	//  194  355:istore          10
		k = j1;
	//  195  357:iload           12
	//  196  359:istore          9
		if(true) goto _L14; else goto _L13
	//  197  361:goto            31
_L13:
		i1 = l;
	//  198  364:iload           10
	//  199  366:istore          11
		j1 = k;
	//  200  368:iload           9
	//  201  370:istore          12
		if(obj2[j] == '\r')
	//* 202  372:aload           15
	//* 203  374:iload           8
	//* 204  376:caload          
	//* 205  377:bipush          13
	//* 206  379:icmpne          347
		{
			i1 = l + 1;
	//  207  382:iload           10
	//  208  384:iconst_1        
	//  209  385:iadd            
	//  210  386:istore          11
			j1 = k;
	//  211  388:iload           9
	//  212  390:istore          12
		}
		  goto _L5
		if(true) goto _L14; else goto _L15
_L15:
	//* 213  392:goto            347
	}

	public static float getWidth(Phrase phrase)
	{
		return getWidth(phrase, 1, 0);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_0        
	//    3    3:invokestatic    #278 <Method float getWidth(Phrase, int, int)>
	//    4    6:freturn         
	}

	public static float getWidth(Phrase phrase, int i, int j)
	{
		ColumnText columntext = new ColumnText(((PdfContentByte) (null)));
	//    0    0:new             #2   <Class ColumnText>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #204 <Method void ColumnText(PdfContentByte)>
	//    4    8:astore_3        
		columntext.addText(phrase);
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #282 <Method void addText(Phrase)>
		columntext.addWaitingPhrase();
	//    8   14:aload_3         
	//    9   15:invokespecial   #284 <Method void addWaitingPhrase()>
		phrase = ((Phrase) (columntext.bidiLine.processLine(0.0F, 20000F, 0, i, j, 0.0F, 0.0F, 0.0F)));
	//   10   18:aload_3         
	//   11   19:getfield        #158 <Field BidiLine bidiLine>
	//   12   22:fconst_0        
	//   13   23:ldc2            #285 <Float 20000F>
	//   14   26:iconst_0        
	//   15   27:iload_1         
	//   16   28:iload_2         
	//   17   29:fconst_0        
	//   18   30:fconst_0        
	//   19   31:fconst_0        
	//   20   32:invokevirtual   #289 <Method PdfLine BidiLine.processLine(float, float, int, int, int, float, float, float)>
	//   21   35:astore_0        
		if(phrase == null)
	//*  22   36:aload_0         
	//*  23   37:ifnonnull       42
			return 0.0F;
	//   24   40:fconst_0        
	//   25   41:freturn         
		else
			return 20000F - ((PdfLine) (phrase)).widthLeft();
	//   26   42:ldc2            #285 <Float 20000F>
	//   27   45:aload_0         
	//   28   46:invokevirtual   #294 <Method float PdfLine.widthLeft()>
	//   29   49:fsub            
	//   30   50:freturn         
	}

	public static boolean hasMoreText(int i)
	{
		return (i & 1) == 0;
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:iand            
	//    3    3:ifne            8
	//    4    6:iconst_1        
	//    5    7:ireturn         
	//    6    8:iconst_0        
	//    7    9:ireturn         
	}

	public static boolean isAllowedElement(Element element)
	{
		for(int i = element.type(); i == 10 || i == 11 || i == 37 || i == 12 || i == 14 || i == 55 || i == 23 || (element instanceof Image);)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #304 <Method int Element.type()>
	//*   2    6:istore_1        
	//*   3    7:iload_1         
	//*   4    8:bipush          10
	//*   5   10:icmpeq          49
	//*   6   13:iload_1         
	//*   7   14:bipush          11
	//*   8   16:icmpeq          49
	//*   9   19:iload_1         
	//*  10   20:bipush          37
	//*  11   22:icmpeq          49
	//*  12   25:iload_1         
	//*  13   26:bipush          12
	//*  14   28:icmpeq          49
	//*  15   31:iload_1         
	//*  16   32:bipush          14
	//*  17   34:icmpeq          49
	//*  18   37:iload_1         
	//*  19   38:bipush          55
	//*  20   40:icmpeq          49
	//*  21   43:iload_1         
	//*  22   44:bipush          23
	//*  23   46:icmpne          51
			return true;
	//   24   49:iconst_1        
	//   25   50:ireturn         

	//   26   51:aload_0         
	//   27   52:instanceof      #306 <Class Image>
	//   28   55:ifne            49
		return false;
	//   29   58:iconst_0        
	//   30   59:ireturn         
	}

	private static boolean isTagged(PdfContentByte pdfcontentbyte)
	{
		return pdfcontentbyte != null && pdfcontentbyte.pdf != null && pdfcontentbyte.writer != null && pdfcontentbyte.writer.isTagged();
	//    0    0:aload_0         
	//    1    1:ifnull          30
	//    2    4:aload_0         
	//    3    5:getfield        #314 <Field PdfDocument PdfContentByte.pdf>
	//    4    8:ifnull          30
	//    5   11:aload_0         
	//    6   12:getfield        #318 <Field PdfWriter PdfContentByte.writer>
	//    7   15:ifnull          30
	//    8   18:aload_0         
	//    9   19:getfield        #318 <Field PdfWriter PdfContentByte.writer>
	//   10   22:invokevirtual   #322 <Method boolean PdfWriter.isTagged()>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public static void showTextAligned(PdfContentByte pdfcontentbyte, int i, Phrase phrase, float f, float f1, float f2)
	{
		showTextAligned(pdfcontentbyte, i, phrase, f, f1, f2, 1, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:iconst_1        
	//    7    9:iconst_0        
	//    8   10:invokestatic    #327 <Method void showTextAligned(PdfContentByte, int, Phrase, float, float, float, int, int)>
	//    9   13:return          
	}

	public static void showTextAligned(PdfContentByte pdfcontentbyte, int i, Phrase phrase, float f, float f1, float f2, int j, int k)
	{
		float f5;
		int l;
		ColumnText columntext;
		l = i;
	//    0    0:iload_1         
	//    1    1:istore          14
		if(i != 0)
	//*   2    3:iload_1         
	//*   3    4:ifeq            26
		{
			l = i;
	//    4    7:iload_1         
	//    5    8:istore          14
			if(i != 1)
	//*   6   10:iload_1         
	//*   7   11:iconst_1        
	//*   8   12:icmpeq          26
			{
				l = i;
	//    9   15:iload_1         
	//   10   16:istore          14
				if(i != 2)
	//*  11   18:iload_1         
	//*  12   19:iconst_2        
	//*  13   20:icmpeq          26
					l = 0;
	//   14   23:iconst_0        
	//   15   24:istore          14
			}
		}
		pdfcontentbyte.saveState();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #332 <Method void PdfContentByte.saveState()>
		columntext = new ColumnText(pdfcontentbyte);
	//   18   30:new             #2   <Class ColumnText>
	//   19   33:dup             
	//   20   34:aload_0         
	//   21   35:invokespecial   #204 <Method void ColumnText(PdfContentByte)>
	//   22   38:astore          15
		f5 = 2.0F;
	//   23   40:fconst_2        
	//   24   41:fstore          12
		l;
	//   25   43:iload           14
		JVM INSTR tableswitch 0 2: default 72
	//	               0 184
	//	               1 72
	//	               2 195;
	//   26   45:tableswitch     0 2: default 72
	//	               0 184
	//	               1 72
	//	               2 195
		   goto _L1 _L2 _L1 _L3
_L3:
		break MISSING_BLOCK_LABEL_195;
_L1:
		float f3;
		float f4;
		f3 = 20000F;
	//   27   72:ldc2            #285 <Float 20000F>
	//   28   75:fstore          10
		f4 = -20000F;
	//   29   77:ldc2            #333 <Float -20000F>
	//   30   80:fstore          11
_L4:
		if(f2 == 0.0F)
	//*  31   82:fload           5
	//*  32   84:fconst_0        
	//*  33   85:fcmpl           
	//*  34   86:ifne            206
		{
			f4 += f;
	//   35   89:fload           11
	//   36   91:fload_3         
	//   37   92:fadd            
	//   38   93:fstore          11
			f5 = -1F + f1;
	//   39   95:ldc1            #122 <Float -1F>
	//   40   97:fload           4
	//   41   99:fadd            
	//   42  100:fstore          12
			f3 += f;
	//   43  102:fload           10
	//   44  104:fload_3         
	//   45  105:fadd            
	//   46  106:fstore          10
			f2 = 2.0F + f1;
	//   47  108:fconst_2        
	//   48  109:fload           4
	//   49  111:fadd            
	//   50  112:fstore          5
			f1 = f5;
	//   51  114:fload           12
	//   52  116:fstore          4
			f = f4;
	//   53  118:fload           11
	//   54  120:fstore_3        
		} else
	//*  55  121:aload           15
	//*  56  123:aload_2         
	//*  57  124:fload_3         
	//*  58  125:fload           4
	//*  59  127:fload           10
	//*  60  129:fload           5
	//*  61  131:fconst_2        
	//*  62  132:iload           14
	//*  63  134:invokevirtual   #259 <Method void setSimpleColumn(Phrase, float, float, float, float, float, int)>
	//*  64  137:iload           14
	//*  65  139:istore_1        
	//*  66  140:iload           6
	//*  67  142:iconst_3        
	//*  68  143:icmpne          153
	//*  69  146:iload           14
	//*  70  148:ifne            265
	//*  71  151:iconst_2        
	//*  72  152:istore_1        
	//*  73  153:aload           15
	//*  74  155:iload_1         
	//*  75  156:invokevirtual   #336 <Method void setAlignment(int)>
	//*  76  159:aload           15
	//*  77  161:iload           7
	//*  78  163:invokevirtual   #339 <Method void setArabicOptions(int)>
	//*  79  166:aload           15
	//*  80  168:iload           6
	//*  81  170:invokevirtual   #263 <Method void setRunDirection(int)>
	//*  82  173:aload           15
	//*  83  175:invokevirtual   #341 <Method int go()>
	//*  84  178:pop             
	//*  85  179:aload_0         
	//*  86  180:invokevirtual   #344 <Method void PdfContentByte.restoreState()>
	//*  87  183:return          
	//*  88  184:ldc2            #285 <Float 20000F>
	//*  89  187:fstore          10
	//*  90  189:fconst_0        
	//*  91  190:fstore          11
	//*  92  192:goto            82
	//*  93  195:fconst_0        
	//*  94  196:fstore          10
	//*  95  198:ldc2            #333 <Float -20000F>
	//*  96  201:fstore          11
	//*  97  203:goto            82
		{
			double d = ((double)f2 * 3.1415926535897931D) / 180D;
	//   98  206:fload           5
	//   99  208:f2d             
	//  100  209:ldc2w           #345 <Double 3.1415926535897931D>
	//  101  212:dmul            
	//  102  213:ldc2w           #347 <Double 180D>
	//  103  216:ddiv            
	//  104  217:dstore          8
			f2 = (float)Math.cos(d);
	//  105  219:dload           8
	//  106  221:invokestatic    #352 <Method double Math.cos(double)>
	//  107  224:d2f             
	//  108  225:fstore          5
			float f6 = (float)Math.sin(d);
	//  109  227:dload           8
	//  110  229:invokestatic    #355 <Method double Math.sin(double)>
	//  111  232:d2f             
	//  112  233:fstore          13
			pdfcontentbyte.concatCTM(f2, f6, -f6, f2, f, f1);
	//  113  235:aload_0         
	//  114  236:fload           5
	//  115  238:fload           13
	//  116  240:fload           13
	//  117  242:fneg            
	//  118  243:fload           5
	//  119  245:fload_3         
	//  120  246:fload           4
	//  121  248:invokevirtual   #359 <Method void PdfContentByte.concatCTM(float, float, float, float, float, float)>
			f = f4;
	//  122  251:fload           11
	//  123  253:fstore_3        
			f1 = -1F;
	//  124  254:ldc1            #122 <Float -1F>
	//  125  256:fstore          4
			f2 = f5;
	//  126  258:fload           12
	//  127  260:fstore          5
		}
		columntext.setSimpleColumn(phrase, f, f1, f3, f2, 2.0F, l);
		i = l;
		if(j == 3)
			if(l == 0)
			{
				i = 2;
			} else
	//* 128  262:goto            121
			{
				i = l;
	//  129  265:iload           14
	//  130  267:istore_1        
				if(l == 2)
	//* 131  268:iload           14
	//* 132  270:iconst_2        
	//* 133  271:icmpne          153
					i = 0;
	//  134  274:iconst_0        
	//  135  275:istore_1        
			}
		columntext.setAlignment(i);
		columntext.setArabicOptions(k);
		columntext.setRunDirection(j);
		try
		{
			columntext.go();
		}
	//* 136  276:goto            153
		// Misplaced declaration of an exception variable
		catch(PdfContentByte pdfcontentbyte)
	//* 137  279:astore_0        
		{
			throw new ExceptionConverter(((Exception) (pdfcontentbyte)));
	//  138  280:new             #270 <Class ExceptionConverter>
	//  139  283:dup             
	//  140  284:aload_0         
	//  141  285:invokespecial   #273 <Method void ExceptionConverter(Exception)>
	//  142  288:athrow          
		}
		pdfcontentbyte.restoreState();
		return;
_L2:
		f3 = 20000F;
		f4 = 0.0F;
		  goto _L4
		f3 = 0.0F;
		f4 = -20000F;
		  goto _L4
	}

	public void addElement(Element element)
	{
		Object obj;
		if(element == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		obj = ((Object) (element));
	//    3    5:aload_1         
	//    4    6:astore_3        
		if(!(element instanceof Image)) goto _L2; else goto _L1
	//    5    7:aload_1         
	//    6    8:instanceof      #306 <Class Image>
	//    7   11:ifeq            165
_L1:
		element = ((Element) ((Image)element));
	//    8   14:aload_1         
	//    9   15:checkcast       #306 <Class Image>
	//   10   18:astore_1        
		obj = ((Object) (new PdfPTable(1)));
	//   11   19:new             #363 <Class PdfPTable>
	//   12   22:dup             
	//   13   23:iconst_1        
	//   14   24:invokespecial   #365 <Method void PdfPTable(int)>
	//   15   27:astore_3        
		float f = ((Image) (element)).getWidthPercentage();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #368 <Method float Image.getWidthPercentage()>
	//   18   32:fstore_2        
		PdfPCell pdfpcell;
		if(f == 0.0F)
	//*  19   33:fload_2         
	//*  20   34:fconst_0        
	//*  21   35:fcmpl           
	//*  22   36:ifne            261
		{
			((PdfPTable) (obj)).setTotalWidth(((Image) (element)).getScaledWidth());
	//   23   39:aload_3         
	//   24   40:aload_1         
	//   25   41:invokevirtual   #371 <Method float Image.getScaledWidth()>
	//   26   44:invokevirtual   #374 <Method void PdfPTable.setTotalWidth(float)>
			((PdfPTable) (obj)).setLockedWidth(true);
	//   27   47:aload_3         
	//   28   48:iconst_1        
	//   29   49:invokevirtual   #378 <Method void PdfPTable.setLockedWidth(boolean)>
		} else
	//*  30   52:aload_3         
	//*  31   53:aload_1         
	//*  32   54:invokevirtual   #381 <Method float Image.getSpacingAfter()>
	//*  33   57:invokevirtual   #384 <Method void PdfPTable.setSpacingAfter(float)>
	//*  34   60:aload_3         
	//*  35   61:aload_1         
	//*  36   62:invokevirtual   #387 <Method float Image.getSpacingBefore()>
	//*  37   65:invokevirtual   #390 <Method void PdfPTable.setSpacingBefore(float)>
	//*  38   68:aload_1         
	//*  39   69:invokevirtual   #393 <Method int Image.getAlignment()>
	//*  40   72:tableswitch     0 2: default 100
	//	               0 269
	//	               1 100
	//	               2 277
	//*  41  100:aload_3         
	//*  42  101:iconst_1        
	//*  43  102:invokevirtual   #396 <Method void PdfPTable.setHorizontalAlignment(int)>
	//*  44  105:new             #398 <Class PdfPCell>
	//*  45  108:dup             
	//*  46  109:aload_1         
	//*  47  110:iconst_1        
	//*  48  111:invokespecial   #401 <Method void PdfPCell(Image, boolean)>
	//*  49  114:astore          4
	//*  50  116:aload           4
	//*  51  118:fconst_0        
	//*  52  119:invokevirtual   #404 <Method void PdfPCell.setPadding(float)>
	//*  53  122:aload           4
	//*  54  124:aload_1         
	//*  55  125:invokevirtual   #407 <Method int Image.getBorder()>
	//*  56  128:invokevirtual   #410 <Method void PdfPCell.setBorder(int)>
	//*  57  131:aload           4
	//*  58  133:aload_1         
	//*  59  134:invokevirtual   #414 <Method com.itextpdf.text.BaseColor Image.getBorderColor()>
	//*  60  137:invokevirtual   #418 <Method void PdfPCell.setBorderColor(com.itextpdf.text.BaseColor)>
	//*  61  140:aload           4
	//*  62  142:aload_1         
	//*  63  143:invokevirtual   #421 <Method float Image.getBorderWidth()>
	//*  64  146:invokevirtual   #424 <Method void PdfPCell.setBorderWidth(float)>
	//*  65  149:aload           4
	//*  66  151:aload_1         
	//*  67  152:invokevirtual   #427 <Method com.itextpdf.text.BaseColor Image.getBackgroundColor()>
	//*  68  155:invokevirtual   #430 <Method void PdfPCell.setBackgroundColor(com.itextpdf.text.BaseColor)>
	//*  69  158:aload_3         
	//*  70  159:aload           4
	//*  71  161:invokevirtual   #434 <Method PdfPCell PdfPTable.addCell(PdfPCell)>
	//*  72  164:pop             
	//*  73  165:aload_3         
	//*  74  166:invokeinterface #304 <Method int Element.type()>
	//*  75  171:bipush          10
	//*  76  173:icmpne          285
	//*  77  176:new             #436 <Class Paragraph>
	//*  78  179:dup             
	//*  79  180:aload_3         
	//*  80  181:checkcast       #187 <Class Chunk>
	//*  81  184:invokespecial   #439 <Method void Paragraph(Chunk)>
	//*  82  187:astore_1        
	//*  83  188:aload_1         
	//*  84  189:invokeinterface #304 <Method int Element.type()>
	//*  85  194:bipush          12
	//*  86  196:icmpeq          336
	//*  87  199:aload_1         
	//*  88  200:invokeinterface #304 <Method int Element.type()>
	//*  89  205:bipush          14
	//*  90  207:icmpeq          336
	//*  91  210:aload_1         
	//*  92  211:invokeinterface #304 <Method int Element.type()>
	//*  93  216:bipush          23
	//*  94  218:icmpeq          336
	//*  95  221:aload_1         
	//*  96  222:invokeinterface #304 <Method int Element.type()>
	//*  97  227:bipush          55
	//*  98  229:icmpeq          336
	//*  99  232:aload_1         
	//* 100  233:invokeinterface #304 <Method int Element.type()>
	//* 101  238:bipush          37
	//* 102  240:icmpeq          336
	//* 103  243:new             #441 <Class IllegalArgumentException>
	//* 104  246:dup             
	//* 105  247:ldc2            #443 <String "element.not.allowed">
	//* 106  250:iconst_0        
	//* 107  251:anewarray       Object[]
	//* 108  254:invokestatic    #449 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//* 109  257:invokespecial   #452 <Method void IllegalArgumentException(String)>
	//* 110  260:athrow          
		{
			((PdfPTable) (obj)).setWidthPercentage(f);
	//  111  261:aload_3         
	//  112  262:fload_2         
	//  113  263:invokevirtual   #455 <Method void PdfPTable.setWidthPercentage(float)>
		}
		((PdfPTable) (obj)).setSpacingAfter(((Image) (element)).getSpacingAfter());
		((PdfPTable) (obj)).setSpacingBefore(((Image) (element)).getSpacingBefore());
		((Image) (element)).getAlignment();
		JVM INSTR tableswitch 0 2: default 100
	//	               0 269
	//	               1 100
	//	               2 277;
		   goto _L3 _L4 _L3 _L5
_L3:
		((PdfPTable) (obj)).setHorizontalAlignment(1);
_L11:
		pdfpcell = new PdfPCell(((Image) (element)), true);
		pdfpcell.setPadding(0.0F);
		pdfpcell.setBorder(((Image) (element)).getBorder());
		pdfpcell.setBorderColor(((Image) (element)).getBorderColor());
		pdfpcell.setBorderWidth(((Image) (element)).getBorderWidth());
		pdfpcell.setBackgroundColor(((Image) (element)).getBackgroundColor());
		((PdfPTable) (obj)).addCell(pdfpcell);
_L2:
		if(((Element) (obj)).type() != 10) goto _L7; else goto _L6
_L6:
		element = ((Element) (new Paragraph((Chunk)obj)));
_L9:
		if(element.type() != 12 && element.type() != 14 && element.type() != 23 && element.type() != 55 && element.type() != 37)
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("element.not.allowed", new Object[0]));
		break; /* Loop/switch isn't completed */
	//* 114  266:goto            52
_L4:
		((PdfPTable) (obj)).setHorizontalAlignment(0);
	//  115  269:aload_3         
	//  116  270:iconst_0        
	//  117  271:invokevirtual   #396 <Method void PdfPTable.setHorizontalAlignment(int)>
		continue; /* Loop/switch isn't completed */
	//  118  274:goto            105
_L5:
		((PdfPTable) (obj)).setHorizontalAlignment(2);
	//  119  277:aload_3         
	//  120  278:iconst_2        
	//  121  279:invokevirtual   #396 <Method void PdfPTable.setHorizontalAlignment(int)>
		continue; /* Loop/switch isn't completed */
	//  122  282:goto            105
_L7:
		if(((Element) (obj)).type() == 11)
	//* 123  285:aload_3         
	//* 124  286:invokeinterface #304 <Method int Element.type()>
	//* 125  291:bipush          11
	//* 126  293:icmpne          311
		{
			element = ((Element) (new Paragraph((Phrase)obj)));
	//  127  296:new             #436 <Class Paragraph>
	//  128  299:dup             
	//  129  300:aload_3         
	//  130  301:checkcast       #165 <Class Phrase>
	//  131  304:invokespecial   #457 <Method void Paragraph(Phrase)>
	//  132  307:astore_1        
		} else
	//* 133  308:goto            188
		{
			element = ((Element) (obj));
	//  134  311:aload_3         
	//  135  312:astore_1        
			if(((Element) (obj)).type() == 23)
	//* 136  313:aload_3         
	//* 137  314:invokeinterface #304 <Method int Element.type()>
	//* 138  319:bipush          23
	//* 139  321:icmpne          188
			{
				((PdfPTable)obj).init();
	//  140  324:aload_3         
	//  141  325:checkcast       #363 <Class PdfPTable>
	//  142  328:invokevirtual   #460 <Method void PdfPTable.init()>
				element = ((Element) (obj));
	//  143  331:aload_3         
	//  144  332:astore_1        
			}
		}
		if(true) goto _L9; else goto _L8
	//  145  333:goto            188
_L8:
		if(!composite)
	//* 146  336:aload_0         
	//* 147  337:getfield        #138 <Field boolean composite>
	//* 148  340:ifne            369
		{
			composite = true;
	//  149  343:aload_0         
	//  150  344:iconst_1        
	//  151  345:putfield        #138 <Field boolean composite>
			compositeElements = new LinkedList();
	//  152  348:aload_0         
	//  153  349:new             #462 <Class LinkedList>
	//  154  352:dup             
	//  155  353:invokespecial   #463 <Method void LinkedList()>
	//  156  356:putfield        #465 <Field LinkedList compositeElements>
			bidiLine = null;
	//  157  359:aload_0         
	//  158  360:aconst_null     
	//  159  361:putfield        #158 <Field BidiLine bidiLine>
			waitPhrase = null;
	//  160  364:aload_0         
	//  161  365:aconst_null     
	//  162  366:putfield        #160 <Field Phrase waitPhrase>
		}
		if(element.type() == 12)
	//* 163  369:aload_1         
	//* 164  370:invokeinterface #304 <Method int Element.type()>
	//* 165  375:bipush          12
	//* 166  377:icmpne          398
		{
			element = ((Element) ((Paragraph)element));
	//  167  380:aload_1         
	//  168  381:checkcast       #436 <Class Paragraph>
	//  169  384:astore_1        
			compositeElements.addAll(((java.util.Collection) (((Paragraph) (element)).breakUp())));
	//  170  385:aload_0         
	//  171  386:getfield        #465 <Field LinkedList compositeElements>
	//  172  389:aload_1         
	//  173  390:invokevirtual   #468 <Method List Paragraph.breakUp()>
	//  174  393:invokevirtual   #472 <Method boolean LinkedList.addAll(java.util.Collection)>
	//  175  396:pop             
			return;
	//  176  397:return          
		}
		compositeElements.add(((Object) (element)));
	//  177  398:aload_0         
	//  178  399:getfield        #465 <Field LinkedList compositeElements>
	//  179  402:aload_1         
	//  180  403:invokevirtual   #476 <Method boolean LinkedList.add(Object)>
	//  181  406:pop             
		return;
	//  182  407:return          
		if(true) goto _L11; else goto _L10
_L10:
	}

	public void addText(Chunk chunk)
	{
		if(chunk == null || composite)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:getfield        #138 <Field boolean composite>
	//*   4    8:ifeq            12
		{
			return;
	//    5   11:return          
		} else
		{
			addText(new Phrase(chunk));
	//    6   12:aload_0         
	//    7   13:new             #165 <Class Phrase>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #477 <Method void Phrase(Chunk)>
	//   11   21:invokevirtual   #282 <Method void addText(Phrase)>
			return;
	//   12   24:return          
		}
	}

	public void addText(Phrase phrase)
	{
		if(phrase != null && !composite)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:getfield        #138 <Field boolean composite>
	//*   4    8:ifeq            12
	//*   5   11:return          
		{
			addWaitingPhrase();
	//    6   12:aload_0         
	//    7   13:invokespecial   #284 <Method void addWaitingPhrase()>
			if(bidiLine == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #158 <Field BidiLine bidiLine>
	//*  10   20:ifnonnull       29
			{
				waitPhrase = phrase;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #160 <Field Phrase waitPhrase>
				return;
	//   14   28:return          
			}
			Iterator iterator = phrase.getChunks().iterator();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #169 <Method List Phrase.getChunks()>
	//   17   33:invokeinterface #175 <Method Iterator List.iterator()>
	//   18   38:astore_2        
			while(iterator.hasNext()) 
	//*  19   39:aload_2         
	//*  20   40:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//*  21   45:ifeq            11
			{
				Object obj = iterator.next();
	//   22   48:aload_2         
	//   23   49:invokeinterface #185 <Method Object Iterator.next()>
	//   24   54:astore_3        
				bidiLine.addChunk(new PdfChunk((Chunk)obj, ((PdfAction) (null)), phrase.getTabSettings()));
	//   25   55:aload_0         
	//   26   56:getfield        #158 <Field BidiLine bidiLine>
	//   27   59:new             #189 <Class PdfChunk>
	//   28   62:dup             
	//   29   63:aload_3         
	//   30   64:checkcast       #187 <Class Chunk>
	//   31   67:aconst_null     
	//   32   68:aload_1         
	//   33   69:invokevirtual   #193 <Method com.itextpdf.text.TabSettings Phrase.getTabSettings()>
	//   34   72:invokespecial   #196 <Method void PdfChunk(Chunk, PdfAction, com.itextpdf.text.TabSettings)>
	//   35   75:invokevirtual   #200 <Method void BidiLine.addChunk(PdfChunk)>
			}
		}
	//*  36   78:goto            39
	}

	public void clearChunks()
	{
		if(bidiLine != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field BidiLine bidiLine>
	//*   2    4:ifnull          14
			bidiLine.clearChunks();
	//    3    7:aload_0         
	//    4    8:getfield        #158 <Field BidiLine bidiLine>
	//    5   11:invokevirtual   #480 <Method void BidiLine.clearChunks()>
	//    6   14:return          
	}

	protected ArrayList convertColumn(float af[])
	{
		if(af.length < 4)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_4        
	//*   3    3:icmpge          24
			throw new RuntimeException(MessageLocalization.getComposedMessage("no.valid.column.line.found", new Object[0]));
	//    4    6:new             #484 <Class RuntimeException>
	//    5    9:dup             
	//    6   10:ldc2            #486 <String "no.valid.column.line.found">
	//    7   13:iconst_0        
	//    8   14:anewarray       Object[]
	//    9   17:invokestatic    #449 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   20:invokespecial   #487 <Method void RuntimeException(String)>
	//   11   23:athrow          
		ArrayList arraylist = new ArrayList();
	//   12   24:new             #489 <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #490 <Method void ArrayList()>
	//   15   31:astore          7
		int i = 0;
	//   16   33:iconst_0        
	//   17   34:istore          6
		while(i < af.length - 2) 
	//*  18   36:iload           6
	//*  19   38:aload_1         
	//*  20   39:arraylength     
	//*  21   40:iconst_2        
	//*  22   41:isub            
	//*  23   42:icmpge          182
		{
			float f = af[i];
	//   24   45:aload_1         
	//   25   46:iload           6
	//   26   48:faload          
	//   27   49:fstore_2        
			float f1 = af[i + 1];
	//   28   50:aload_1         
	//   29   51:iload           6
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:faload          
	//   33   56:fstore_3        
			float f3 = af[i + 2];
	//   34   57:aload_1         
	//   35   58:iload           6
	//   36   60:iconst_2        
	//   37   61:iadd            
	//   38   62:faload          
	//   39   63:fstore          5
			float f2 = af[i + 3];
	//   40   65:aload_1         
	//   41   66:iload           6
	//   42   68:iconst_3        
	//   43   69:iadd            
	//   44   70:faload          
	//   45   71:fstore          4
			if(f1 != f2)
	//*  46   73:fload_3         
	//*  47   74:fload           4
	//*  48   76:fcmpl           
	//*  49   77:ifne            89
	//*  50   80:iload           6
	//*  51   82:iconst_2        
	//*  52   83:iadd            
	//*  53   84:istore          6
	//*  54   86:goto            36
			{
				f3 = (f - f3) / (f1 - f2);
	//   55   89:fload_2         
	//   56   90:fload           5
	//   57   92:fsub            
	//   58   93:fload_3         
	//   59   94:fload           4
	//   60   96:fsub            
	//   61   97:fdiv            
	//   62   98:fstore          5
				float af1[] = new float[4];
	//   63  100:iconst_4        
	//   64  101:newarray        float[]
	//   65  103:astore          8
				af1[0] = Math.min(f1, f2);
	//   66  105:aload           8
	//   67  107:iconst_0        
	//   68  108:fload_3         
	//   69  109:fload           4
	//   70  111:invokestatic    #494 <Method float Math.min(float, float)>
	//   71  114:fastore         
				af1[1] = Math.max(f1, f2);
	//   72  115:aload           8
	//   73  117:iconst_1        
	//   74  118:fload_3         
	//   75  119:fload           4
	//   76  121:invokestatic    #496 <Method float Math.max(float, float)>
	//   77  124:fastore         
				af1[2] = f3;
	//   78  125:aload           8
	//   79  127:iconst_2        
	//   80  128:fload           5
	//   81  130:fastore         
				af1[3] = f - f3 * f1;
	//   82  131:aload           8
	//   83  133:iconst_3        
	//   84  134:fload_2         
	//   85  135:fload           5
	//   86  137:fload_3         
	//   87  138:fmul            
	//   88  139:fsub            
	//   89  140:fastore         
				arraylist.add(((Object) (af1)));
	//   90  141:aload           7
	//   91  143:aload           8
	//   92  145:invokevirtual   #497 <Method boolean ArrayList.add(Object)>
	//   93  148:pop             
				maxY = Math.max(maxY, af1[1]);
	//   94  149:aload_0         
	//   95  150:aload_0         
	//   96  151:getfield        #499 <Field float maxY>
	//   97  154:aload           8
	//   98  156:iconst_1        
	//   99  157:faload          
	//  100  158:invokestatic    #496 <Method float Math.max(float, float)>
	//  101  161:putfield        #499 <Field float maxY>
				minY = Math.min(minY, af1[0]);
	//  102  164:aload_0         
	//  103  165:aload_0         
	//  104  166:getfield        #501 <Field float minY>
	//  105  169:aload           8
	//  106  171:iconst_0        
	//  107  172:faload          
	//  108  173:invokestatic    #494 <Method float Math.min(float, float)>
	//  109  176:putfield        #501 <Field float minY>
			}
			i += 2;
		}
	//* 110  179:goto            80
		if(arraylist.isEmpty())
	//* 111  182:aload           7
	//* 112  184:invokevirtual   #504 <Method boolean ArrayList.isEmpty()>
	//* 113  187:ifeq            208
			throw new RuntimeException(MessageLocalization.getComposedMessage("no.valid.column.line.found", new Object[0]));
	//  114  190:new             #484 <Class RuntimeException>
	//  115  193:dup             
	//  116  194:ldc2            #486 <String "no.valid.column.line.found">
	//  117  197:iconst_0        
	//  118  198:anewarray       Object[]
	//  119  201:invokestatic    #449 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  120  204:invokespecial   #487 <Method void RuntimeException(String)>
	//  121  207:athrow          
		else
			return arraylist;
	//  122  208:aload           7
	//  123  210:areturn         
	}

	protected float[] findLimitsOneLine()
	{
		float f = findLimitsPoint(leftWall);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #510 <Field ArrayList leftWall>
	//    3    5:invokevirtual   #514 <Method float findLimitsPoint(ArrayList)>
	//    4    8:fstore_1        
		if(lineStatus != 1 && lineStatus != 2)
	//*   5    9:aload_0         
	//*   6   10:getfield        #516 <Field int lineStatus>
	//*   7   13:iconst_1        
	//*   8   14:icmpeq          25
	//*   9   17:aload_0         
	//*  10   18:getfield        #516 <Field int lineStatus>
	//*  11   21:iconst_2        
	//*  12   22:icmpne          27
	//*  13   25:aconst_null     
	//*  14   26:areturn         
		{
			float f1 = findLimitsPoint(rightWall);
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #518 <Field ArrayList rightWall>
	//   18   32:invokevirtual   #514 <Method float findLimitsPoint(ArrayList)>
	//   19   35:fstore_2        
			if(lineStatus != 2)
	//*  20   36:aload_0         
	//*  21   37:getfield        #516 <Field int lineStatus>
	//*  22   40:iconst_2        
	//*  23   41:icmpeq          25
				return (new float[] {
					f, f1
				});
	//   24   44:iconst_2        
	//   25   45:newarray        float[]
	//   26   47:dup             
	//   27   48:iconst_0        
	//   28   49:fload_1         
	//   29   50:fastore         
	//   30   51:dup             
	//   31   52:iconst_1        
	//   32   53:fload_2         
	//   33   54:fastore         
	//   34   55:areturn         
		}
		return null;
	}

	protected float findLimitsPoint(ArrayList arraylist)
	{
		lineStatus = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #516 <Field int lineStatus>
		if(yLine < minY || yLine > maxY)
	//*   3    5:aload_0         
	//*   4    6:getfield        #520 <Field float yLine>
	//*   5    9:aload_0         
	//*   6   10:getfield        #501 <Field float minY>
	//*   7   13:fcmpg           
	//*   8   14:iflt            29
	//*   9   17:aload_0         
	//*  10   18:getfield        #520 <Field float yLine>
	//*  11   21:aload_0         
	//*  12   22:getfield        #499 <Field float maxY>
	//*  13   25:fcmpl           
	//*  14   26:ifle            36
		{
			lineStatus = 1;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #516 <Field int lineStatus>
			return 0.0F;
	//   18   34:fconst_0        
	//   19   35:freturn         
		}
		for(int i = 0; i < arraylist.size();)
	//*  20   36:iconst_0        
	//*  21   37:istore_2        
	//*  22   38:iload_2         
	//*  23   39:aload_1         
	//*  24   40:invokevirtual   #523 <Method int ArrayList.size()>
	//*  25   43:icmpge          97
		{
			float af[] = (float[])arraylist.get(i);
	//   26   46:aload_1         
	//   27   47:iload_2         
	//   28   48:invokevirtual   #527 <Method Object ArrayList.get(int)>
	//   29   51:checkcast       #529 <Class float[]>
	//   30   54:astore_3        
			if(yLine < af[0] || yLine > af[1])
	//*  31   55:aload_0         
	//*  32   56:getfield        #520 <Field float yLine>
	//*  33   59:aload_3         
	//*  34   60:iconst_0        
	//*  35   61:faload          
	//*  36   62:fcmpg           
	//*  37   63:iflt            77
	//*  38   66:aload_0         
	//*  39   67:getfield        #520 <Field float yLine>
	//*  40   70:aload_3         
	//*  41   71:iconst_1        
	//*  42   72:faload          
	//*  43   73:fcmpl           
	//*  44   74:ifle            84
				i++;
	//   45   77:iload_2         
	//   46   78:iconst_1        
	//   47   79:iadd            
	//   48   80:istore_2        
			else
	//*  49   81:goto            38
				return af[2] * yLine + af[3];
	//   50   84:aload_3         
	//   51   85:iconst_2        
	//   52   86:faload          
	//   53   87:aload_0         
	//   54   88:getfield        #520 <Field float yLine>
	//   55   91:fmul            
	//   56   92:aload_3         
	//   57   93:iconst_3        
	//   58   94:faload          
	//   59   95:fadd            
	//   60   96:freturn         
		}

		lineStatus = 2;
	//   61   97:aload_0         
	//   62   98:iconst_2        
	//   63   99:putfield        #516 <Field int lineStatus>
		return 0.0F;
	//   64  102:fconst_0        
	//   65  103:freturn         
	}

	protected float[] findLimitsTwoLines()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
_L6:
		if(!flag || currentLeading != 0.0F) goto _L2; else goto _L1
	//    2    2:iload_1         
	//    3    3:ifeq            17
	//    4    6:aload_0         
	//    5    7:getfield        #109 <Field float currentLeading>
	//    6   10:fconst_0        
	//    7   11:fcmpl           
	//    8   12:ifne            17
_L1:
		return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
_L2:
		boolean flag1;
		float af[];
		flag1 = true;
	//   11   17:iconst_1        
	//   12   18:istore_2        
		af = findLimitsOneLine();
	//   13   19:aload_0         
	//   14   20:invokevirtual   #533 <Method float[] findLimitsOneLine()>
	//   15   23:astore_3        
		if(lineStatus == 1) goto _L1; else goto _L3
	//   16   24:aload_0         
	//   17   25:getfield        #516 <Field int lineStatus>
	//   18   28:iconst_1        
	//   19   29:icmpeq          15
_L3:
		float af1[];
		yLine = yLine - currentLeading;
	//   20   32:aload_0         
	//   21   33:aload_0         
	//   22   34:getfield        #520 <Field float yLine>
	//   23   37:aload_0         
	//   24   38:getfield        #109 <Field float currentLeading>
	//   25   41:fsub            
	//   26   42:putfield        #520 <Field float yLine>
		flag = flag1;
	//   27   45:iload_2         
	//   28   46:istore_1        
		if(lineStatus == 2)
			continue; /* Loop/switch isn't completed */
	//   29   47:aload_0         
	//   30   48:getfield        #516 <Field int lineStatus>
	//   31   51:iconst_2        
	//   32   52:icmpeq          2
		af1 = findLimitsOneLine();
	//   33   55:aload_0         
	//   34   56:invokevirtual   #533 <Method float[] findLimitsOneLine()>
	//   35   59:astore          4
		if(lineStatus == 1) goto _L1; else goto _L4
	//   36   61:aload_0         
	//   37   62:getfield        #516 <Field int lineStatus>
	//   38   65:iconst_1        
	//   39   66:icmpeq          15
_L4:
		if(lineStatus != 2)
			break; /* Loop/switch isn't completed */
	//   40   69:aload_0         
	//   41   70:getfield        #516 <Field int lineStatus>
	//   42   73:iconst_2        
	//   43   74:icmpne          95
		yLine = yLine - currentLeading;
	//   44   77:aload_0         
	//   45   78:aload_0         
	//   46   79:getfield        #520 <Field float yLine>
	//   47   82:aload_0         
	//   48   83:getfield        #109 <Field float currentLeading>
	//   49   86:fsub            
	//   50   87:putfield        #520 <Field float yLine>
		flag = flag1;
	//   51   90:iload_2         
	//   52   91:istore_1        
		if(true) goto _L6; else goto _L5
	//   53   92:goto            2
_L5:
		flag = flag1;
	//   54   95:iload_2         
	//   55   96:istore_1        
		if(af[0] < af1[1])
	//*  56   97:aload_3         
	//*  57   98:iconst_0        
	//*  58   99:faload          
	//*  59  100:aload           4
	//*  60  102:iconst_1        
	//*  61  103:faload          
	//*  62  104:fcmpl           
	//*  63  105:ifge            2
		{
			flag = flag1;
	//   64  108:iload_2         
	//   65  109:istore_1        
			if(af1[0] < af[1])
	//*  66  110:aload           4
	//*  67  112:iconst_0        
	//*  68  113:faload          
	//*  69  114:aload_3         
	//*  70  115:iconst_1        
	//*  71  116:faload          
	//*  72  117:fcmpl           
	//*  73  118:ifge            2
				return (new float[] {
					af[0], af[1], af1[0], af1[1]
				});
	//   74  121:iconst_4        
	//   75  122:newarray        float[]
	//   76  124:dup             
	//   77  125:iconst_0        
	//   78  126:aload_3         
	//   79  127:iconst_0        
	//   80  128:faload          
	//   81  129:fastore         
	//   82  130:dup             
	//   83  131:iconst_1        
	//   84  132:aload_3         
	//   85  133:iconst_1        
	//   86  134:faload          
	//   87  135:fastore         
	//   88  136:dup             
	//   89  137:iconst_2        
	//   90  138:aload           4
	//   91  140:iconst_0        
	//   92  141:faload          
	//   93  142:fastore         
	//   94  143:dup             
	//   95  144:iconst_3        
	//   96  145:aload           4
	//   97  147:iconst_1        
	//   98  148:faload          
	//   99  149:fastore         
	//  100  150:areturn         
		}
		if(true) goto _L6; else goto _L7
_L7:
	}

	public int getAlignment()
	{
		return alignment;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int alignment>
	//    2    4:ireturn         
	}

	public int getArabicOptions()
	{
		return arabicOptions;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int arabicOptions>
	//    2    4:ireturn         
	}

	public PdfContentByte getCanvas()
	{
		return canvas;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field PdfContentByte canvas>
	//    2    4:areturn         
	}

	public PdfContentByte[] getCanvases()
	{
		return canvases;
	//    0    0:aload_0         
	//    1    1:getfield        #540 <Field PdfContentByte[] canvases>
	//    2    4:areturn         
	}

	public List getCompositeElements()
	{
		return ((List) (compositeElements));
	//    0    0:aload_0         
	//    1    1:getfield        #465 <Field LinkedList compositeElements>
	//    2    4:areturn         
	}

	public float getCurrentLeading()
	{
		return currentLeading;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field float currentLeading>
	//    2    4:freturn         
	}

	public float getDescender()
	{
		return descender;
	//    0    0:aload_0         
	//    1    1:getfield        #546 <Field float descender>
	//    2    4:freturn         
	}

	public float getExtraParagraphSpace()
	{
		return extraParagraphSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field float extraParagraphSpace>
	//    2    4:freturn         
	}

	public float getFilledWidth()
	{
		return filledWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #550 <Field float filledWidth>
	//    2    4:freturn         
	}

	public float getFollowingIndent()
	{
		return followingIndent;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field float followingIndent>
	//    2    4:freturn         
	}

	public float getIndent()
	{
		return indent;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field float indent>
	//    2    4:freturn         
	}

	public boolean getInheritGraphicState()
	{
		return inheritGraphicState;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field boolean inheritGraphicState>
	//    2    4:ireturn         
	}

	public float getLastX()
	{
		return lastX;
	//    0    0:aload_0         
	//    1    1:getfield        #556 <Field float lastX>
	//    2    4:freturn         
	}

	public float getLeading()
	{
		return fixedLeading;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field float fixedLeading>
	//    2    4:freturn         
	}

	public int getLinesWritten()
	{
		return linesWritten;
	//    0    0:aload_0         
	//    1    1:getfield        #560 <Field int linesWritten>
	//    2    4:ireturn         
	}

	public float getMultipliedLeading()
	{
		return multipliedLeading;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field float multipliedLeading>
	//    2    4:freturn         
	}

	public float getRightIndent()
	{
		return rightIndent;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field float rightIndent>
	//    2    4:freturn         
	}

	public int getRowsDrawn()
	{
		return rowIdx;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int rowIdx>
	//    2    4:ireturn         
	}

	public int getRunDirection()
	{
		return runDirection;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int runDirection>
	//    2    4:ireturn         
	}

	public float getSpaceCharRatio()
	{
		return spaceCharRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field float spaceCharRatio>
	//    2    4:freturn         
	}

	public float getYLine()
	{
		return yLine;
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field float yLine>
	//    2    4:freturn         
	}

	public int go()
		throws DocumentException
	{
		return go(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #267 <Method int go(boolean)>
	//    3    5:ireturn         
	}

	public int go(boolean flag)
		throws DocumentException
	{
		return go(flag, ((IAccessibleElement) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #570 <Method int go(boolean, IAccessibleElement)>
	//    4    6:ireturn         
	}

	public int go(boolean flag, IAccessibleElement iaccessibleelement)
		throws DocumentException
	{
		isWordSplit = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #572 <Field boolean isWordSplit>
		if(!composite) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:getfield        #138 <Field boolean composite>
	//    5    9:ifeq            22
_L1:
		int j = goComposite(flag);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokevirtual   #575 <Method int goComposite(boolean)>
	//    9   17:istore          9
_L3:
		return j;
	//   10   19:iload           9
	//   11   21:ireturn         
_L2:
		float f;
		int k;
		int i1;
		PdfContentByte pdfcontentbyte;
		com.itextpdf.text.ListBody listbody;
		PdfContentByte pdfcontentbyte1;
		PdfDocument pdfdocument;
		Object obj1;
		Object aobj[];
		pdfcontentbyte = null;
	//   12   22:aconst_null     
	//   13   23:astore          14
		listbody = ((com.itextpdf.text.ListBody) (pdfcontentbyte));
	//   14   25:aload           14
	//   15   27:astore          15
		if(isTagged(canvas))
	//*  16   29:aload_0         
	//*  17   30:getfield        #154 <Field PdfContentByte canvas>
	//*  18   33:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//*  19   36:ifeq            59
		{
			listbody = ((com.itextpdf.text.ListBody) (pdfcontentbyte));
	//   20   39:aload           14
	//   21   41:astore          15
			if(iaccessibleelement instanceof ListItem)
	//*  22   43:aload_2         
	//*  23   44:instanceof      #579 <Class ListItem>
	//*  24   47:ifeq            59
				listbody = ((ListItem)iaccessibleelement).getListBody();
	//   25   50:aload_2         
	//   26   51:checkcast       #579 <Class ListItem>
	//   27   54:invokevirtual   #583 <Method com.itextpdf.text.ListBody ListItem.getListBody()>
	//   28   57:astore          15
		}
		addWaitingPhrase();
	//   29   59:aload_0         
	//   30   60:invokespecial   #284 <Method void addWaitingPhrase()>
		if(bidiLine == null)
	//*  31   63:aload_0         
	//*  32   64:getfield        #158 <Field BidiLine bidiLine>
	//*  33   67:ifnonnull       72
			return 1;
	//   34   70:iconst_1        
	//   35   71:ireturn         
		descender = 0.0F;
	//   36   72:aload_0         
	//   37   73:fconst_0        
	//   38   74:putfield        #546 <Field float descender>
		linesWritten = 0;
	//   39   77:aload_0         
	//   40   78:iconst_0        
	//   41   79:putfield        #560 <Field int linesWritten>
		lastX = 0.0F;
	//   42   82:aload_0         
	//   43   83:fconst_0        
	//   44   84:putfield        #556 <Field float lastX>
		k = 0;
	//   45   87:iconst_0        
	//   46   88:istore          10
		float f1 = spaceCharRatio;
	//   47   90:aload_0         
	//   48   91:getfield        #128 <Field float spaceCharRatio>
	//   49   94:fstore          4
		aobj = new Object[2];
	//   50   96:iconst_2        
	//   51   97:anewarray       Object[]
	//   52  100:astore          22
		obj1 = null;
	//   53  102:aconst_null     
	//   54  103:astore          19
		aobj[1] = ((Object) (new Float(0.0F)));
	//   55  105:aload           22
	//   56  107:iconst_1        
	//   57  108:new             #585 <Class Float>
	//   58  111:dup             
	//   59  112:fconst_0        
	//   60  113:invokespecial   #587 <Method void Float(float)>
	//   61  116:aastore         
		pdfdocument = null;
	//   62  117:aconst_null     
	//   63  118:astore          18
		pdfcontentbyte1 = null;
	//   64  120:aconst_null     
	//   65  121:astore          17
		pdfcontentbyte = null;
	//   66  123:aconst_null     
	//   67  124:astore          14
		firstLineY = (0.0F / 0.0F);
	//   68  126:aload_0         
	//   69  127:ldc2            #588 <Float (0.0F / 0.0F)>
	//   70  130:putfield        #590 <Field float firstLineY>
		i1 = runDirection;
	//   71  133:aload_0         
	//   72  134:getfield        #104 <Field int runDirection>
	//   73  137:istore          12
		if(canvas != null)
	//*  74  139:aload_0         
	//*  75  140:getfield        #154 <Field PdfContentByte canvas>
	//*  76  143:ifnull          271
		{
			pdfcontentbyte1 = canvas;
	//   77  146:aload_0         
	//   78  147:getfield        #154 <Field PdfContentByte canvas>
	//   79  150:astore          17
			pdfdocument = canvas.getPdfDocument();
	//   80  152:aload_0         
	//   81  153:getfield        #154 <Field PdfContentByte canvas>
	//   82  156:invokevirtual   #594 <Method PdfDocument PdfContentByte.getPdfDocument()>
	//   83  159:astore          18
			Iterator iterator;
			if(!isTagged(canvas))
	//*  84  161:aload_0         
	//*  85  162:getfield        #154 <Field PdfContentByte canvas>
	//*  86  165:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//*  87  168:ifne            262
				pdfcontentbyte = canvas.getDuplicate(inheritGraphicState);
	//   88  171:aload_0         
	//   89  172:getfield        #154 <Field PdfContentByte canvas>
	//   90  175:aload_0         
	//   91  176:getfield        #150 <Field boolean inheritGraphicState>
	//   92  179:invokevirtual   #598 <Method PdfContentByte PdfContentByte.getDuplicate(boolean)>
	//   93  182:astore          14
			else
	//*  94  184:fload           4
	//*  95  186:fstore_3        
	//*  96  187:iload_1         
	//*  97  188:ifne            207
	//*  98  191:fload           4
	//*  99  193:fconst_0        
	//* 100  194:fcmpl           
	//* 101  195:ifne            293
	//* 102  198:aload           14
	//* 103  200:invokevirtual   #602 <Method PdfWriter PdfContentByte.getPdfWriter()>
	//* 104  203:invokevirtual   #604 <Method float PdfWriter.getSpaceCharRatio()>
	//* 105  206:fstore_3        
	//* 106  207:aload_0         
	//* 107  208:getfield        #126 <Field boolean rectangularMode>
	//* 108  211:ifne            326
	//* 109  214:fconst_0        
	//* 110  215:fstore          4
	//* 111  217:aload_0         
	//* 112  218:getfield        #158 <Field BidiLine bidiLine>
	//* 113  221:getfield        #607 <Field ArrayList BidiLine.chunks>
	//* 114  224:invokevirtual   #608 <Method Iterator ArrayList.iterator()>
	//* 115  227:astore          16
	//* 116  229:aload           16
	//* 117  231:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//* 118  236:ifeq            310
	//* 119  239:fload           4
	//* 120  241:aload           16
	//* 121  243:invokeinterface #185 <Method Object Iterator.next()>
	//* 122  248:checkcast       #189 <Class PdfChunk>
	//* 123  251:invokevirtual   #611 <Method float PdfChunk.height()>
	//* 124  254:invokestatic    #496 <Method float Math.max(float, float)>
	//* 125  257:fstore          4
	//* 126  259:goto            229
				pdfcontentbyte = canvas;
	//  127  262:aload_0         
	//  128  263:getfield        #154 <Field PdfContentByte canvas>
	//  129  266:astore          14
		} else
	//* 130  268:goto            184
		if(!flag)
	//* 131  271:iload_1         
	//* 132  272:ifne            184
			throw new NullPointerException(MessageLocalization.getComposedMessage("columntext.go.with.simulate.eq.eq.false.and.text.eq.eq.null", new Object[0]));
	//  133  275:new             #613 <Class NullPointerException>
	//  134  278:dup             
	//  135  279:ldc2            #615 <String "columntext.go.with.simulate.eq.eq.false.and.text.eq.eq.null">
	//  136  282:iconst_0        
	//  137  283:anewarray       Object[]
	//  138  286:invokestatic    #449 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  139  289:invokespecial   #616 <Method void NullPointerException(String)>
	//  140  292:athrow          
		f = f1;
		if(!flag)
			if(f1 == 0.0F)
			{
				f = pdfcontentbyte.getPdfWriter().getSpaceCharRatio();
			} else
			{
				f = f1;
	//  141  293:fload           4
	//  142  295:fstore_3        
				if(f1 < 0.001F)
	//* 143  296:fload           4
	//* 144  298:ldc1            #234 <Float 0.001F>
	//* 145  300:fcmpg           
	//* 146  301:ifge            207
					f = 0.001F;
	//  147  304:ldc1            #234 <Float 0.001F>
	//  148  306:fstore_3        
			}
		if(!rectangularMode)
		{
			f1 = 0.0F;
			for(iterator = bidiLine.chunks.iterator(); iterator.hasNext();)
				f1 = Math.max(f1, ((PdfChunk)iterator.next()).height());

	//* 149  307:goto            207
			currentLeading = fixedLeading + multipliedLeading * f1;
	//  150  310:aload_0         
	//  151  311:aload_0         
	//  152  312:getfield        #111 <Field float fixedLeading>
	//  153  315:aload_0         
	//  154  316:getfield        #113 <Field float multipliedLeading>
	//  155  319:fload           4
	//  156  321:fmul            
	//  157  322:fadd            
	//  158  323:putfield        #109 <Field float currentLeading>
		}
		j = 0;
	//  159  326:iconst_0        
	//  160  327:istore          9
_L4:
		float f2;
		float f3;
		int i;
		int l;
		PdfLine pdfline1;
		if(lastWasNewline)
	//* 161  329:aload_0         
	//* 162  330:getfield        #130 <Field boolean lastWasNewline>
	//* 163  333:ifeq            463
			f2 = indent;
	//  164  336:aload_0         
	//  165  337:getfield        #115 <Field float indent>
	//  166  340:fstore          4
		else
	//* 167  342:aload_0         
	//* 168  343:getfield        #126 <Field boolean rectangularMode>
	//* 169  346:ifeq            1130
	//* 170  349:aload_0         
	//* 171  350:getfield        #124 <Field float rectangularWidth>
	//* 172  353:aload_0         
	//* 173  354:getfield        #119 <Field float rightIndent>
	//* 174  357:fload           4
	//* 175  359:fadd            
	//* 176  360:fcmpg           
	//* 177  361:ifgt            472
	//* 178  364:iconst_2        
	//* 179  365:istore          8
	//* 180  367:iload           10
	//* 181  369:istore          11
	//* 182  371:iload           9
	//* 183  373:istore          12
	//* 184  375:aload_0         
	//* 185  376:getfield        #158 <Field BidiLine bidiLine>
	//* 186  379:invokevirtual   #617 <Method boolean BidiLine.isEmpty()>
	//* 187  382:ifeq            398
	//* 188  385:iconst_2        
	//* 189  386:iconst_1        
	//* 190  387:ior             
	//* 191  388:istore          8
	//* 192  390:iload           9
	//* 193  392:istore          12
	//* 194  394:iload           10
	//* 195  396:istore          11
	//* 196  398:iload           8
	//* 197  400:istore          9
	//* 198  402:iload           11
	//* 199  404:ifeq            19
	//* 200  407:aload           14
	//* 201  409:invokevirtual   #620 <Method void PdfContentByte.endText()>
	//* 202  412:aload_0         
	//* 203  413:getfield        #154 <Field PdfContentByte canvas>
	//* 204  416:aload           14
	//* 205  418:if_acmpeq       430
	//* 206  421:aload_0         
	//* 207  422:getfield        #154 <Field PdfContentByte canvas>
	//* 208  425:aload           14
	//* 209  427:invokevirtual   #622 <Method void PdfContentByte.add(PdfContentByte)>
	//* 210  430:iload           8
	//* 211  432:istore          9
	//* 212  434:iload           12
	//* 213  436:ifeq            19
	//* 214  439:iload           8
	//* 215  441:istore          9
	//* 216  443:aload_0         
	//* 217  444:getfield        #154 <Field PdfContentByte canvas>
	//* 218  447:invokevirtual   #623 <Method boolean PdfContentByte.isTagged()>
	//* 219  450:ifeq            19
	//* 220  453:aload_0         
	//* 221  454:getfield        #154 <Field PdfContentByte canvas>
	//* 222  457:invokevirtual   #626 <Method void PdfContentByte.endMarkedContentSequence()>
	//* 223  460:iload           8
	//* 224  462:ireturn         
			f2 = followingIndent;
	//  225  463:aload_0         
	//  226  464:getfield        #117 <Field float followingIndent>
	//  227  467:fstore          4
		Object obj;
		Object obj2;
		if(rectangularMode)
		{
			if(rectangularWidth <= rightIndent + f2)
			{
				i = 2;
				l = k;
				i1 = j;
				if(bidiLine.isEmpty())
				{
					i = 2 | 1;
					i1 = j;
					l = k;
				}
			} else
	//* 228  469:goto            342
			if(bidiLine.isEmpty())
	//* 229  472:aload_0         
	//* 230  473:getfield        #158 <Field BidiLine bidiLine>
	//* 231  476:invokevirtual   #617 <Method boolean BidiLine.isEmpty()>
	//* 232  479:ifeq            496
			{
				i = 1;
	//  233  482:iconst_1        
	//  234  483:istore          8
				l = k;
	//  235  485:iload           10
	//  236  487:istore          11
				i1 = j;
	//  237  489:iload           9
	//  238  491:istore          12
			} else
	//* 239  493:goto            398
			{
				pdfline1 = bidiLine.processLine(leftX, rectangularWidth - f2 - rightIndent, alignment, i1, arabicOptions, minY, yLine, descender);
	//  240  496:aload_0         
	//  241  497:getfield        #158 <Field BidiLine bidiLine>
	//  242  500:aload_0         
	//  243  501:getfield        #628 <Field float leftX>
	//  244  504:aload_0         
	//  245  505:getfield        #124 <Field float rectangularWidth>
	//  246  508:fload           4
	//  247  510:fsub            
	//  248  511:aload_0         
	//  249  512:getfield        #119 <Field float rightIndent>
	//  250  515:fsub            
	//  251  516:aload_0         
	//  252  517:getfield        #106 <Field int alignment>
	//  253  520:iload           12
	//  254  522:aload_0         
	//  255  523:getfield        #136 <Field int arabicOptions>
	//  256  526:aload_0         
	//  257  527:getfield        #501 <Field float minY>
	//  258  530:aload_0         
	//  259  531:getfield        #520 <Field float yLine>
	//  260  534:aload_0         
	//  261  535:getfield        #546 <Field float descender>
	//  262  538:invokevirtual   #289 <Method PdfLine BidiLine.processLine(float, float, int, int, int, float, float, float)>
	//  263  541:astore          20
				isWordSplit = isWordSplit | bidiLine.isWordSplit();
	//  264  543:aload_0         
	//  265  544:aload_0         
	//  266  545:getfield        #572 <Field boolean isWordSplit>
	//  267  548:aload_0         
	//  268  549:getfield        #158 <Field BidiLine bidiLine>
	//  269  552:invokevirtual   #630 <Method boolean BidiLine.isWordSplit()>
	//  270  555:ior             
	//  271  556:putfield        #572 <Field boolean isWordSplit>
				if(pdfline1 == null)
	//* 272  559:aload           20
	//* 273  561:ifnonnull       578
				{
					i = 1;
	//  274  564:iconst_1        
	//  275  565:istore          8
					l = k;
	//  276  567:iload           10
	//  277  569:istore          11
					i1 = j;
	//  278  571:iload           9
	//  279  573:istore          12
				} else
	//* 280  575:goto            398
				{
label0:
					{
						float af[] = pdfline1.getMaxSize(fixedLeading, multipliedLeading);
	//  281  578:aload           20
	//  282  580:aload_0         
	//  283  581:getfield        #111 <Field float fixedLeading>
	//  284  584:aload_0         
	//  285  585:getfield        #113 <Field float multipliedLeading>
	//  286  588:invokevirtual   #634 <Method float[] PdfLine.getMaxSize(float, float)>
	//  287  591:astore          16
						if(isUseAscender() && Float.isNaN(firstLineY))
	//* 288  593:aload_0         
	//* 289  594:invokevirtual   #637 <Method boolean isUseAscender()>
	//* 290  597:ifeq            669
	//* 291  600:aload_0         
	//* 292  601:getfield        #590 <Field float firstLineY>
	//* 293  604:invokestatic    #641 <Method boolean Float.isNaN(float)>
	//* 294  607:ifeq            669
							currentLeading = pdfline1.getAscender();
	//  295  610:aload_0         
	//  296  611:aload           20
	//  297  613:invokevirtual   #644 <Method float PdfLine.getAscender()>
	//  298  616:putfield        #109 <Field float currentLeading>
						else
	//* 299  619:aload_0         
	//* 300  620:getfield        #520 <Field float yLine>
	//* 301  623:aload_0         
	//* 302  624:getfield        #499 <Field float maxY>
	//* 303  627:fcmpl           
	//* 304  628:ifgt            648
	//* 305  631:aload_0         
	//* 306  632:getfield        #520 <Field float yLine>
	//* 307  635:aload_0         
	//* 308  636:getfield        #109 <Field float currentLeading>
	//* 309  639:fsub            
	//* 310  640:aload_0         
	//* 311  641:getfield        #501 <Field float minY>
	//* 312  644:fcmpg           
	//* 313  645:ifge            692
	//* 314  648:iconst_2        
	//* 315  649:istore          8
	//* 316  651:aload_0         
	//* 317  652:getfield        #158 <Field BidiLine bidiLine>
	//* 318  655:invokevirtual   #647 <Method void BidiLine.restore()>
	//* 319  658:iload           10
	//* 320  660:istore          11
	//* 321  662:iload           9
	//* 322  664:istore          12
	//* 323  666:goto            398
							currentLeading = Math.max(af[0], af[1] - descender);
	//  324  669:aload_0         
	//  325  670:aload           16
	//  326  672:iconst_0        
	//  327  673:faload          
	//  328  674:aload           16
	//  329  676:iconst_1        
	//  330  677:faload          
	//  331  678:aload_0         
	//  332  679:getfield        #546 <Field float descender>
	//  333  682:fsub            
	//  334  683:invokestatic    #496 <Method float Math.max(float, float)>
	//  335  686:putfield        #109 <Field float currentLeading>
						if(yLine <= maxY && yLine - currentLeading >= minY)
							break label0;
						i = 2;
						bidiLine.restore();
						l = k;
						i1 = j;
					}
				}
			}
		} else
	//* 336  689:goto            619
	//* 337  692:aload_0         
	//* 338  693:aload_0         
	//* 339  694:getfield        #520 <Field float yLine>
	//* 340  697:aload_0         
	//* 341  698:getfield        #109 <Field float currentLeading>
	//* 342  701:fsub            
	//* 343  702:putfield        #520 <Field float yLine>
	//* 344  705:iload           10
	//* 345  707:istore          8
	//* 346  709:iload           9
	//* 347  711:istore          11
	//* 348  713:iload_1         
	//* 349  714:ifne            777
	//* 350  717:iload           10
	//* 351  719:istore          8
	//* 352  721:iload           9
	//* 353  723:istore          11
	//* 354  725:iload           10
	//* 355  727:ifne            777
	//* 356  730:iload           9
	//* 357  732:istore          11
	//* 358  734:aload           20
	//* 359  736:getfield        #650 <Field boolean PdfLine.isRTL>
	//* 360  739:ifeq            769
	//* 361  742:iload           9
	//* 362  744:istore          11
	//* 363  746:aload_0         
	//* 364  747:getfield        #154 <Field PdfContentByte canvas>
	//* 365  750:invokevirtual   #623 <Method boolean PdfContentByte.isTagged()>
	//* 366  753:ifeq            769
	//* 367  756:aload_0         
	//* 368  757:getfield        #154 <Field PdfContentByte canvas>
	//* 369  760:getstatic       #656 <Field PdfName PdfName.REVERSEDCHARS>
	//* 370  763:invokevirtual   #660 <Method void PdfContentByte.beginMarkedContentSequence(PdfName)>
	//* 371  766:iconst_1        
	//* 372  767:istore          11
	//* 373  769:aload           14
	//* 374  771:invokevirtual   #663 <Method void PdfContentByte.beginText()>
	//* 375  774:iconst_1        
	//* 376  775:istore          8
	//* 377  777:aload_0         
	//* 378  778:getfield        #590 <Field float firstLineY>
	//* 379  781:invokestatic    #641 <Method boolean Float.isNaN(float)>
	//* 380  784:ifeq            795
	//* 381  787:aload_0         
	//* 382  788:aload_0         
	//* 383  789:getfield        #520 <Field float yLine>
	//* 384  792:putfield        #590 <Field float firstLineY>
	//* 385  795:aload_0         
	//* 386  796:aload_0         
	//* 387  797:getfield        #124 <Field float rectangularWidth>
	//* 388  800:aload           20
	//* 389  802:invokevirtual   #294 <Method float PdfLine.widthLeft()>
	//* 390  805:fsub            
	//* 391  806:invokevirtual   #666 <Method void updateFilledWidth(float)>
	//* 392  809:aload_0         
	//* 393  810:getfield        #628 <Field float leftX>
	//* 394  813:fstore          5
	//* 395  815:iload           11
	//* 396  817:istore          9
	//* 397  819:iload           8
	//* 398  821:istore          10
	//* 399  823:aload_0         
	//* 400  824:getfield        #154 <Field PdfContentByte canvas>
	//* 401  827:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//* 402  830:ifeq            947
	//* 403  833:aload_2         
	//* 404  834:instanceof      #579 <Class ListItem>
	//* 405  837:ifeq            947
	//* 406  840:aload_0         
	//* 407  841:getfield        #590 <Field float firstLineY>
	//* 408  844:invokestatic    #641 <Method boolean Float.isNaN(float)>
	//* 409  847:ifne            947
	//* 410  850:aload_0         
	//* 411  851:getfield        #134 <Field boolean firstLineYDone>
	//* 412  854:ifne            947
	//* 413  857:iload_1         
	//* 414  858:ifne            942
	//* 415  861:aload_2         
	//* 416  862:checkcast       #579 <Class ListItem>
	//* 417  865:invokevirtual   #670 <Method ListLabel ListItem.getListLabel()>
	//* 418  868:astore          16
	//* 419  870:aload_0         
	//* 420  871:getfield        #154 <Field PdfContentByte canvas>
	//* 421  874:aload           16
	//* 422  876:invokevirtual   #674 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//* 423  879:new             #187 <Class Chunk>
	//* 424  882:dup             
	//* 425  883:aload_2         
	//* 426  884:checkcast       #579 <Class ListItem>
	//* 427  887:invokevirtual   #678 <Method Chunk ListItem.getListSymbol()>
	//* 428  890:invokespecial   #679 <Method void Chunk(Chunk)>
	//* 429  893:astore          21
	//* 430  895:aload           21
	//* 431  897:aconst_null     
	//* 432  898:invokevirtual   #682 <Method void Chunk.setRole(PdfName)>
	//* 433  901:aload_0         
	//* 434  902:getfield        #154 <Field PdfContentByte canvas>
	//* 435  905:iconst_0        
	//* 436  906:new             #165 <Class Phrase>
	//* 437  909:dup             
	//* 438  910:aload           21
	//* 439  912:invokespecial   #477 <Method void Phrase(Chunk)>
	//* 440  915:aload_0         
	//* 441  916:getfield        #628 <Field float leftX>
	//* 442  919:aload           16
	//* 443  921:invokevirtual   #687 <Method float ListLabel.getIndentation()>
	//* 444  924:fadd            
	//* 445  925:aload_0         
	//* 446  926:getfield        #590 <Field float firstLineY>
	//* 447  929:fconst_0        
	//* 448  930:invokestatic    #689 <Method void showTextAligned(PdfContentByte, int, Phrase, float, float, float)>
	//* 449  933:aload_0         
	//* 450  934:getfield        #154 <Field PdfContentByte canvas>
	//* 451  937:aload           16
	//* 452  939:invokevirtual   #692 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//* 453  942:aload_0         
	//* 454  943:iconst_1        
	//* 455  944:putfield        #134 <Field boolean firstLineYDone>
	//* 456  947:aload           19
	//* 457  949:astore          21
	//* 458  951:aload           15
	//* 459  953:astore          16
	//* 460  955:iload_1         
	//* 461  956:ifne            1047
	//* 462  959:aload           15
	//* 463  961:astore          16
	//* 464  963:aload           15
	//* 465  965:ifnull          980
	//* 466  968:aload_0         
	//* 467  969:getfield        #154 <Field PdfContentByte canvas>
	//* 468  972:aload           15
	//* 469  974:invokevirtual   #674 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//* 470  977:aconst_null     
	//* 471  978:astore          16
	//* 472  980:aload           22
	//* 473  982:iconst_0        
	//* 474  983:aload           19
	//* 475  985:aastore         
	//* 476  986:aload           20
	//* 477  988:invokevirtual   #694 <Method boolean PdfLine.isRTL()>
	//* 478  991:ifeq            1414
	//* 479  994:aload_0         
	//* 480  995:getfield        #119 <Field float rightIndent>
	//* 481  998:fstore          4
	//* 482 1000:aload           14
	//* 483 1002:fload           4
	//* 484 1004:fload           5
	//* 485 1006:fadd            
	//* 486 1007:aload           20
	//* 487 1009:invokevirtual   #697 <Method float PdfLine.indentLeft()>
	//* 488 1012:fadd            
	//* 489 1013:aload_0         
	//* 490 1014:getfield        #520 <Field float yLine>
	//* 491 1017:invokevirtual   #701 <Method void PdfContentByte.setTextMatrix(float, float)>
	//* 492 1020:aload_0         
	//* 493 1021:aload           18
	//* 494 1023:aload           20
	//* 495 1025:aload           14
	//* 496 1027:aload           17
	//* 497 1029:aload           22
	//* 498 1031:fload_3         
	//* 499 1032:invokevirtual   #707 <Method float PdfDocument.writeLineToContent(PdfLine, PdfContentByte, PdfContentByte, Object[], float)>
	//* 500 1035:putfield        #556 <Field float lastX>
	//* 501 1038:aload           22
	//* 502 1040:iconst_0        
	//* 503 1041:aaload          
	//* 504 1042:checkcast       #709 <Class PdfFont>
	//* 505 1045:astore          21
	//* 506 1047:aload_0         
	//* 507 1048:getfield        #132 <Field boolean repeatFirstLineIndent>
	//* 508 1051:ifeq            1417
	//* 509 1054:aload           20
	//* 510 1056:invokevirtual   #712 <Method boolean PdfLine.isNewlineSplit()>
	//* 511 1059:ifeq            1417
	//* 512 1062:iconst_1        
	//* 513 1063:istore          13
	//* 514 1065:aload_0         
	//* 515 1066:iload           13
	//* 516 1068:putfield        #130 <Field boolean lastWasNewline>
	//* 517 1071:aload_0         
	//* 518 1072:getfield        #520 <Field float yLine>
	//* 519 1075:fstore          5
	//* 520 1077:aload           20
	//* 521 1079:invokevirtual   #712 <Method boolean PdfLine.isNewlineSplit()>
	//* 522 1082:ifeq            1423
	//* 523 1085:aload_0         
	//* 524 1086:getfield        #121 <Field float extraParagraphSpace>
	//* 525 1089:fstore          4
	//* 526 1091:aload_0         
	//* 527 1092:fload           5
	//* 528 1094:fload           4
	//* 529 1096:fsub            
	//* 530 1097:putfield        #520 <Field float yLine>
	//* 531 1100:aload_0         
	//* 532 1101:aload_0         
	//* 533 1102:getfield        #560 <Field int linesWritten>
	//* 534 1105:iconst_1        
	//* 535 1106:iadd            
	//* 536 1107:putfield        #560 <Field int linesWritten>
	//* 537 1110:aload_0         
	//* 538 1111:aload           20
	//* 539 1113:invokevirtual   #714 <Method float PdfLine.getDescender()>
	//* 540 1116:putfield        #546 <Field float descender>
	//* 541 1119:aload           21
	//* 542 1121:astore          19
	//* 543 1123:aload           16
	//* 544 1125:astore          15
	//* 545 1127:goto            329
		{
			f4 = yLine - currentLeading;
	//  546 1130:aload_0         
	//  547 1131:getfield        #520 <Field float yLine>
	//  548 1134:aload_0         
	//  549 1135:getfield        #109 <Field float currentLeading>
	//  550 1138:fsub            
	//  551 1139:fstore          6
			af1 = findLimitsTwoLines();
	//  552 1141:aload_0         
	//  553 1142:invokevirtual   #716 <Method float[] findLimitsTwoLines()>
	//  554 1145:astore          16
			if(af1 == null)
	//* 555 1147:aload           16
	//* 556 1149:ifnonnull       1187
			{
				i = 2;
	//  557 1152:iconst_2        
	//  558 1153:istore          8
				if(bidiLine.isEmpty())
	//* 559 1155:aload_0         
	//* 560 1156:getfield        #158 <Field BidiLine bidiLine>
	//* 561 1159:invokevirtual   #617 <Method boolean BidiLine.isEmpty()>
	//* 562 1162:ifeq            1170
					i = 2 | 1;
	//  563 1165:iconst_2        
	//  564 1166:iconst_1        
	//  565 1167:ior             
	//  566 1168:istore          8
				yLine = f4;
	//  567 1170:aload_0         
	//  568 1171:fload           6
	//  569 1173:putfield        #520 <Field float yLine>
				l = k;
	//  570 1176:iload           10
	//  571 1178:istore          11
				i1 = j;
	//  572 1180:iload           9
	//  573 1182:istore          12
			} else
	//* 574 1184:goto            398
			{
label1:
				{
					if(!bidiLine.isEmpty())
						break label1;
	//  575 1187:aload_0         
	//  576 1188:getfield        #158 <Field BidiLine bidiLine>
	//  577 1191:invokevirtual   #617 <Method boolean BidiLine.isEmpty()>
	//  578 1194:ifeq            1217
					i = 1;
	//  579 1197:iconst_1        
	//  580 1198:istore          8
					yLine = f4;
	//  581 1200:aload_0         
	//  582 1201:fload           6
	//  583 1203:putfield        #520 <Field float yLine>
					l = k;
	//  584 1206:iload           10
	//  585 1208:istore          11
					i1 = j;
	//  586 1210:iload           9
	//  587 1212:istore          12
				}
			}
		}
_L8:
		j = i;
		if(l != 0)
		{
			pdfcontentbyte.endText();
			if(canvas != pdfcontentbyte)
				canvas.add(pdfcontentbyte);
			j = i;
			if(i1 != 0)
			{
				j = i;
				if(canvas.isTagged())
				{
					canvas.endMarkedContentSequence();
					return i;
				}
			}
		}
		  goto _L3
		yLine = yLine - currentLeading;
		i = k;
		l = j;
		if(!flag)
		{
			i = k;
			l = j;
			if(k == 0)
			{
				l = j;
				if(pdfline1.isRTL)
				{
					l = j;
					if(canvas.isTagged())
					{
						canvas.beginMarkedContentSequence(PdfName.REVERSEDCHARS);
						l = 1;
					}
				}
				pdfcontentbyte.beginText();
				i = 1;
			}
		}
		if(Float.isNaN(firstLineY))
			firstLineY = yLine;
		updateFilledWidth(rectangularWidth - pdfline1.widthLeft());
		f3 = leftX;
		j = l;
		k = i;
_L7:
		if(isTagged(canvas) && (iaccessibleelement instanceof ListItem) && !Float.isNaN(firstLineY) && !firstLineYDone)
		{
			if(!flag)
			{
				obj = ((Object) (((ListItem)iaccessibleelement).getListLabel()));
				canvas.openMCBlock(((IAccessibleElement) (obj)));
				obj2 = ((Object) (new Chunk(((ListItem)iaccessibleelement).getListSymbol())));
				((Chunk) (obj2)).setRole(((PdfName) (null)));
				showTextAligned(canvas, 0, new Phrase(((Chunk) (obj2))), leftX + ((ListLabel) (obj)).getIndentation(), firstLineY, 0.0F);
				canvas.closeMCBlock(((IAccessibleElement) (obj)));
			}
			firstLineYDone = true;
		}
		obj2 = obj1;
		obj = ((Object) (listbody));
		if(!flag)
		{
			obj = ((Object) (listbody));
			if(listbody != null)
			{
				canvas.openMCBlock(((IAccessibleElement) (listbody)));
				obj = null;
			}
			aobj[0] = obj1;
			if(pdfline1.isRTL())
				f2 = rightIndent;
			pdfcontentbyte.setTextMatrix(f2 + f3 + pdfline1.indentLeft(), yLine);
			lastX = pdfdocument.writeLineToContent(pdfline1, pdfcontentbyte, pdfcontentbyte1, aobj, f);
			obj2 = ((Object) ((PdfFont)aobj[0]));
		}
		float f4;
		float f5;
		boolean flag1;
		float af1[];
		PdfLine pdfline;
		if(repeatFirstLineIndent && pdfline1.isNewlineSplit())
			flag1 = true;
		else
	//* 588 1214:goto            398
	//* 589 1217:aload           16
	//* 590 1219:iconst_0        
	//* 591 1220:faload          
	//* 592 1221:aload           16
	//* 593 1223:iconst_2        
	//* 594 1224:faload          
	//* 595 1225:invokestatic    #496 <Method float Math.max(float, float)>
	//* 596 1228:fstore          5
	//* 597 1230:aload           16
	//* 598 1232:iconst_1        
	//* 599 1233:faload          
	//* 600 1234:aload           16
	//* 601 1236:iconst_3        
	//* 602 1237:faload          
	//* 603 1238:invokestatic    #494 <Method float Math.min(float, float)>
	//* 604 1241:fstore          7
	//* 605 1243:fload           7
	//* 606 1245:fload           5
	//* 607 1247:fsub            
	//* 608 1248:aload_0         
	//* 609 1249:getfield        #119 <Field float rightIndent>
	//* 610 1252:fload           4
	//* 611 1254:fadd            
	//* 612 1255:fcmpg           
	//* 613 1256:ifle            329
	//* 614 1259:aload_0         
	//* 615 1260:getfield        #158 <Field BidiLine bidiLine>
	//* 616 1263:fload           5
	//* 617 1265:fload           7
	//* 618 1267:fload           5
	//* 619 1269:fsub            
	//* 620 1270:fload           4
	//* 621 1272:fsub            
	//* 622 1273:aload_0         
	//* 623 1274:getfield        #119 <Field float rightIndent>
	//* 624 1277:fsub            
	//* 625 1278:aload_0         
	//* 626 1279:getfield        #106 <Field int alignment>
	//* 627 1282:iload           12
	//* 628 1284:aload_0         
	//* 629 1285:getfield        #136 <Field int arabicOptions>
	//* 630 1288:aload_0         
	//* 631 1289:getfield        #501 <Field float minY>
	//* 632 1292:aload_0         
	//* 633 1293:getfield        #520 <Field float yLine>
	//* 634 1296:aload_0         
	//* 635 1297:getfield        #546 <Field float descender>
	//* 636 1300:invokevirtual   #289 <Method PdfLine BidiLine.processLine(float, float, int, int, int, float, float, float)>
	//* 637 1303:astore          16
	//* 638 1305:iload           10
	//* 639 1307:istore          11
	//* 640 1309:iload           9
	//* 641 1311:istore          8
	//* 642 1313:iload_1         
	//* 643 1314:ifne            1377
	//* 644 1317:iload           10
	//* 645 1319:istore          11
	//* 646 1321:iload           9
	//* 647 1323:istore          8
	//* 648 1325:iload           10
	//* 649 1327:ifne            1377
	//* 650 1330:iload           9
	//* 651 1332:istore          8
	//* 652 1334:aload           16
	//* 653 1336:getfield        #650 <Field boolean PdfLine.isRTL>
	//* 654 1339:ifeq            1369
	//* 655 1342:iload           9
	//* 656 1344:istore          8
	//* 657 1346:aload_0         
	//* 658 1347:getfield        #154 <Field PdfContentByte canvas>
	//* 659 1350:invokevirtual   #623 <Method boolean PdfContentByte.isTagged()>
	//* 660 1353:ifeq            1369
	//* 661 1356:aload_0         
	//* 662 1357:getfield        #154 <Field PdfContentByte canvas>
	//* 663 1360:getstatic       #656 <Field PdfName PdfName.REVERSEDCHARS>
	//* 664 1363:invokevirtual   #660 <Method void PdfContentByte.beginMarkedContentSequence(PdfName)>
	//* 665 1366:iconst_1        
	//* 666 1367:istore          8
	//* 667 1369:aload           14
	//* 668 1371:invokevirtual   #663 <Method void PdfContentByte.beginText()>
	//* 669 1374:iconst_1        
	//* 670 1375:istore          11
	//* 671 1377:iload           11
	//* 672 1379:istore          10
	//* 673 1381:aload           16
	//* 674 1383:astore          20
	//* 675 1385:iload           8
	//* 676 1387:istore          9
	//* 677 1389:aload           16
	//* 678 1391:ifnonnull       823
	//* 679 1394:iconst_1        
	//* 680 1395:istore          9
	//* 681 1397:aload_0         
	//* 682 1398:fload           6
	//* 683 1400:putfield        #520 <Field float yLine>
	//* 684 1403:iload           8
	//* 685 1405:istore          12
	//* 686 1407:iload           9
	//* 687 1409:istore          8
	//* 688 1411:goto            398
	//* 689 1414:goto            1000
			flag1 = false;
	//  690 1417:iconst_0        
	//  691 1418:istore          13
		lastWasNewline = flag1;
		f3 = yLine;
		if(pdfline1.isNewlineSplit())
			f2 = extraParagraphSpace;
		else
	//* 692 1420:goto            1065
			f2 = 0.0F;
	//  693 1423:fconst_0        
	//  694 1424:fstore          4
		yLine = f3 - f2;
		linesWritten = linesWritten + 1;
		descender = pdfline1.getDescender();
		obj1 = obj2;
		listbody = ((com.itextpdf.text.ListBody) (obj));
		  goto _L4
		f3 = Math.max(af1[0], af1[2]);
		f5 = Math.min(af1[1], af1[3]);
		if(f5 - f3 <= rightIndent + f2) goto _L4; else goto _L5
_L5:
		pdfline = bidiLine.processLine(f3, f5 - f3 - f2 - rightIndent, alignment, i1, arabicOptions, minY, yLine, descender);
		l = k;
		i = j;
		if(!flag)
		{
			l = k;
			i = j;
			if(k == 0)
			{
				i = j;
				if(pdfline.isRTL)
				{
					i = j;
					if(canvas.isTagged())
					{
						canvas.beginMarkedContentSequence(PdfName.REVERSEDCHARS);
						i = 1;
					}
				}
				pdfcontentbyte.beginText();
				l = 1;
			}
		}
		k = l;
		pdfline1 = pdfline;
		j = i;
		if(pdfline != null) goto _L7; else goto _L6
_L6:
		j = 1;
		yLine = f4;
		i1 = i;
		i = j;
		  goto _L8
	//* 695 1426:goto            1091
	}

	protected int goComposite(boolean flag)
		throws DocumentException
	{
		int i;
		int j;
		PdfDocument pdfdocument;
		if(canvas != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #154 <Field PdfContentByte canvas>
	//*   2    4:ifnull          16
			pdfdocument = canvas.pdf;
	//    3    7:aload_0         
	//    4    8:getfield        #154 <Field PdfContentByte canvas>
	//    5   11:getfield        #314 <Field PdfDocument PdfContentByte.pdf>
	//    6   14:astore          19
		if(!rectangularMode)
	//*   7   16:aload_0         
	//*   8   17:getfield        #126 <Field boolean rectangularMode>
	//*   9   20:ifne            41
			throw new DocumentException(MessageLocalization.getComposedMessage("irregular.columns.are.not.supported.in.composite.mode", new Object[0]));
	//   10   23:new             #329 <Class DocumentException>
	//   11   26:dup             
	//   12   27:ldc2            #718 <String "irregular.columns.are.not.supported.in.composite.mode">
	//   13   30:iconst_0        
	//   14   31:anewarray       Object[]
	//   15   34:invokestatic    #449 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   37:invokespecial   #719 <Method void DocumentException(String)>
	//   17   40:athrow          
		linesWritten = 0;
	//   18   41:aload_0         
	//   19   42:iconst_0        
	//   20   43:putfield        #560 <Field int linesWritten>
		descender = 0.0F;
	//   21   46:aload_0         
	//   22   47:fconst_0        
	//   23   48:putfield        #546 <Field float descender>
		i = 1;
	//   24   51:iconst_1        
	//   25   52:istore          8
		if(runDirection == 3)
	//*  26   54:aload_0         
	//*  27   55:getfield        #104 <Field int runDirection>
	//*  28   58:iconst_3        
	//*  29   59:icmpne          77
			j = 1;
	//   30   62:iconst_1        
	//   31   63:istore          9
		else
	//*  32   65:aload_0         
	//*  33   66:getfield        #465 <Field LinkedList compositeElements>
	//*  34   69:invokevirtual   #720 <Method boolean LinkedList.isEmpty()>
	//*  35   72:ifeq            83
	//*  36   75:iconst_1        
	//*  37   76:ireturn         
			j = 0;
	//   38   77:iconst_0        
	//   39   78:istore          9
_L29:
		float f1;
		int l;
		int k2;
		Object obj;
		Object obj2;
		Object obj7;
		Stack stack;
		if(compositeElements.isEmpty())
			return 1;
	//*  40   80:goto            65
		obj2 = ((Object) ((Element)compositeElements.getFirst()));
	//   41   83:aload_0         
	//   42   84:getfield        #465 <Field LinkedList compositeElements>
	//   43   87:invokevirtual   #723 <Method Object LinkedList.getFirst()>
	//   44   90:checkcast       #300 <Class Element>
	//   45   93:astore          20
		if(((Element) (obj2)).type() == 12)
	//*  46   95:aload           20
	//*  47   97:invokeinterface #304 <Method int Element.type()>
	//*  48  102:bipush          12
	//*  49  104:icmpne          773
		{
			Paragraph paragraph = (Paragraph)obj2;
	//   50  107:aload           20
	//   51  109:checkcast       #436 <Class Paragraph>
	//   52  112:astore          19
			int k = 0;
	//   53  114:iconst_0        
	//   54  115:istore          10
			int j1 = 0;
	//   55  117:iconst_0        
	//   56  118:istore          11
			do
			{
				float f;
label0:
				{
					int i2 = k;
	//   57  120:iload           10
	//   58  122:istore          12
					if(j1 < 2)
	//*  59  124:iload           11
	//*  60  126:iconst_2        
	//*  61  127:icmpge          628
					{
						f = yLine;
	//   62  130:aload_0         
	//   63  131:getfield        #520 <Field float yLine>
	//   64  134:fstore_2        
						k = 0;
	//   65  135:iconst_0        
	//   66  136:istore          10
						if(compositeColumn == null)
	//*  67  138:aload_0         
	//*  68  139:getfield        #725 <Field ColumnText compositeColumn>
	//*  69  142:ifnonnull       315
						{
							compositeColumn = new ColumnText(canvas);
	//   70  145:aload_0         
	//   71  146:new             #2   <Class ColumnText>
	//   72  149:dup             
	//   73  150:aload_0         
	//   74  151:getfield        #154 <Field PdfContentByte canvas>
	//   75  154:invokespecial   #204 <Method void ColumnText(PdfContentByte)>
	//   76  157:putfield        #725 <Field ColumnText compositeColumn>
							compositeColumn.setAlignment(paragraph.getAlignment());
	//   77  160:aload_0         
	//   78  161:getfield        #725 <Field ColumnText compositeColumn>
	//   79  164:aload           19
	//   80  166:invokevirtual   #726 <Method int Paragraph.getAlignment()>
	//   81  169:invokevirtual   #336 <Method void setAlignment(int)>
							compositeColumn.setIndent(paragraph.getIndentationLeft() + paragraph.getFirstLineIndent(), false);
	//   82  172:aload_0         
	//   83  173:getfield        #725 <Field ColumnText compositeColumn>
	//   84  176:aload           19
	//   85  178:invokevirtual   #729 <Method float Paragraph.getIndentationLeft()>
	//   86  181:aload           19
	//   87  183:invokevirtual   #732 <Method float Paragraph.getFirstLineIndent()>
	//   88  186:fadd            
	//   89  187:iconst_0        
	//   90  188:invokevirtual   #736 <Method void setIndent(float, boolean)>
							compositeColumn.setExtraParagraphSpace(paragraph.getExtraParagraphSpace());
	//   91  191:aload_0         
	//   92  192:getfield        #725 <Field ColumnText compositeColumn>
	//   93  195:aload           19
	//   94  197:invokevirtual   #738 <Method float Paragraph.getExtraParagraphSpace()>
	//   95  200:invokevirtual   #741 <Method void setExtraParagraphSpace(float)>
							compositeColumn.setFollowingIndent(paragraph.getIndentationLeft());
	//   96  203:aload_0         
	//   97  204:getfield        #725 <Field ColumnText compositeColumn>
	//   98  207:aload           19
	//   99  209:invokevirtual   #729 <Method float Paragraph.getIndentationLeft()>
	//  100  212:invokevirtual   #744 <Method void setFollowingIndent(float)>
							compositeColumn.setRightIndent(paragraph.getIndentationRight());
	//  101  215:aload_0         
	//  102  216:getfield        #725 <Field ColumnText compositeColumn>
	//  103  219:aload           19
	//  104  221:invokevirtual   #747 <Method float Paragraph.getIndentationRight()>
	//  105  224:invokevirtual   #750 <Method void setRightIndent(float)>
							compositeColumn.setLeading(paragraph.getLeading(), paragraph.getMultipliedLeading());
	//  106  227:aload_0         
	//  107  228:getfield        #725 <Field ColumnText compositeColumn>
	//  108  231:aload           19
	//  109  233:invokevirtual   #752 <Method float Paragraph.getLeading()>
	//  110  236:aload           19
	//  111  238:invokevirtual   #754 <Method float Paragraph.getMultipliedLeading()>
	//  112  241:invokevirtual   #757 <Method void setLeading(float, float)>
							compositeColumn.setRunDirection(runDirection);
	//  113  244:aload_0         
	//  114  245:getfield        #725 <Field ColumnText compositeColumn>
	//  115  248:aload_0         
	//  116  249:getfield        #104 <Field int runDirection>
	//  117  252:invokevirtual   #263 <Method void setRunDirection(int)>
							compositeColumn.setArabicOptions(arabicOptions);
	//  118  255:aload_0         
	//  119  256:getfield        #725 <Field ColumnText compositeColumn>
	//  120  259:aload_0         
	//  121  260:getfield        #136 <Field int arabicOptions>
	//  122  263:invokevirtual   #339 <Method void setArabicOptions(int)>
							compositeColumn.setSpaceCharRatio(spaceCharRatio);
	//  123  266:aload_0         
	//  124  267:getfield        #725 <Field ColumnText compositeColumn>
	//  125  270:aload_0         
	//  126  271:getfield        #128 <Field float spaceCharRatio>
	//  127  274:invokevirtual   #760 <Method void setSpaceCharRatio(float)>
							compositeColumn.addText(((Phrase) (paragraph)));
	//  128  277:aload_0         
	//  129  278:getfield        #725 <Field ColumnText compositeColumn>
	//  130  281:aload           19
	//  131  283:invokevirtual   #282 <Method void addText(Phrase)>
							if(i == 0 || !adjustFirstLine)
	//* 132  286:iload           8
	//* 133  288:ifeq            298
	//* 134  291:aload_0         
	//* 135  292:getfield        #148 <Field boolean adjustFirstLine>
	//* 136  295:ifne            312
								yLine = yLine - paragraph.getSpacingBefore();
	//  137  298:aload_0         
	//  138  299:aload_0         
	//  139  300:getfield        #520 <Field float yLine>
	//  140  303:aload           19
	//  141  305:invokevirtual   #761 <Method float Paragraph.getSpacingBefore()>
	//  142  308:fsub            
	//  143  309:putfield        #520 <Field float yLine>
							k = 1;
	//  144  312:iconst_1        
	//  145  313:istore          10
						}
						obj2 = ((Object) (compositeColumn));
	//  146  315:aload_0         
	//  147  316:getfield        #725 <Field ColumnText compositeColumn>
	//  148  319:astore          20
						boolean flag2;
						boolean flag4;
						if((i != 0 || descender == 0.0F) && adjustFirstLine)
	//* 149  321:iload           8
	//* 150  323:ifne            335
	//* 151  326:aload_0         
	//* 152  327:getfield        #546 <Field float descender>
	//* 153  330:fconst_0        
	//* 154  331:fcmpl           
	//* 155  332:ifne            593
	//* 156  335:aload_0         
	//* 157  336:getfield        #148 <Field boolean adjustFirstLine>
	//* 158  339:ifeq            593
							flag4 = useAscender;
	//  159  342:aload_0         
	//  160  343:getfield        #146 <Field boolean useAscender>
	//  161  346:istore          18
						else
	//* 162  348:aload           20
	//* 163  350:iload           18
	//* 164  352:invokevirtual   #764 <Method void setUseAscender(boolean)>
	//* 165  355:aload_0         
	//* 166  356:getfield        #725 <Field ColumnText compositeColumn>
	//* 167  359:aload_0         
	//* 168  360:getfield        #150 <Field boolean inheritGraphicState>
	//* 169  363:invokevirtual   #767 <Method void setInheritGraphicState(boolean)>
	//* 170  366:aload_0         
	//* 171  367:getfield        #725 <Field ColumnText compositeColumn>
	//* 172  370:aload_0         
	//* 173  371:getfield        #628 <Field float leftX>
	//* 174  374:putfield        #628 <Field float leftX>
	//* 175  377:aload_0         
	//* 176  378:getfield        #725 <Field ColumnText compositeColumn>
	//* 177  381:aload_0         
	//* 178  382:getfield        #769 <Field float rightX>
	//* 179  385:putfield        #769 <Field float rightX>
	//* 180  388:aload_0         
	//* 181  389:getfield        #725 <Field ColumnText compositeColumn>
	//* 182  392:aload_0         
	//* 183  393:getfield        #520 <Field float yLine>
	//* 184  396:putfield        #520 <Field float yLine>
	//* 185  399:aload_0         
	//* 186  400:getfield        #725 <Field ColumnText compositeColumn>
	//* 187  403:aload_0         
	//* 188  404:getfield        #124 <Field float rectangularWidth>
	//* 189  407:putfield        #124 <Field float rectangularWidth>
	//* 190  410:aload_0         
	//* 191  411:getfield        #725 <Field ColumnText compositeColumn>
	//* 192  414:aload_0         
	//* 193  415:getfield        #126 <Field boolean rectangularMode>
	//* 194  418:putfield        #126 <Field boolean rectangularMode>
	//* 195  421:aload_0         
	//* 196  422:getfield        #725 <Field ColumnText compositeColumn>
	//* 197  425:aload_0         
	//* 198  426:getfield        #501 <Field float minY>
	//* 199  429:putfield        #501 <Field float minY>
	//* 200  432:aload_0         
	//* 201  433:getfield        #725 <Field ColumnText compositeColumn>
	//* 202  436:aload_0         
	//* 203  437:getfield        #499 <Field float maxY>
	//* 204  440:putfield        #499 <Field float maxY>
	//* 205  443:aload           19
	//* 206  445:invokevirtual   #772 <Method boolean Paragraph.getKeepTogether()>
	//* 207  448:ifeq            599
	//* 208  451:iload           10
	//* 209  453:ifeq            599
	//* 210  456:iload           8
	//* 211  458:ifeq            468
	//* 212  461:aload_0         
	//* 213  462:getfield        #148 <Field boolean adjustFirstLine>
	//* 214  465:ifne            599
	//* 215  468:iconst_1        
	//* 216  469:istore          13
	//* 217  471:iload_1         
	//* 218  472:ifne            485
	//* 219  475:iload           13
	//* 220  477:ifeq            605
	//* 221  480:iload           11
	//* 222  482:ifne            605
	//* 223  485:iconst_1        
	//* 224  486:istore          18
	//* 225  488:aload_0         
	//* 226  489:getfield        #154 <Field PdfContentByte canvas>
	//* 227  492:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//* 228  495:ifeq            512
	//* 229  498:iload           18
	//* 230  500:ifne            512
	//* 231  503:aload_0         
	//* 232  504:getfield        #154 <Field PdfContentByte canvas>
	//* 233  507:aload           19
	//* 234  509:invokevirtual   #674 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//* 235  512:aload_0         
	//* 236  513:getfield        #725 <Field ColumnText compositeColumn>
	//* 237  516:iload           18
	//* 238  518:invokevirtual   #267 <Method int go(boolean)>
	//* 239  521:istore          10
	//* 240  523:aload_0         
	//* 241  524:getfield        #154 <Field PdfContentByte canvas>
	//* 242  527:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//* 243  530:ifeq            547
	//* 244  533:iload           18
	//* 245  535:ifne            547
	//* 246  538:aload_0         
	//* 247  539:getfield        #154 <Field PdfContentByte canvas>
	//* 248  542:aload           19
	//* 249  544:invokevirtual   #692 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//* 250  547:aload_0         
	//* 251  548:aload_0         
	//* 252  549:getfield        #725 <Field ColumnText compositeColumn>
	//* 253  552:invokevirtual   #774 <Method float getLastX()>
	//* 254  555:putfield        #556 <Field float lastX>
	//* 255  558:aload_0         
	//* 256  559:aload_0         
	//* 257  560:getfield        #725 <Field ColumnText compositeColumn>
	//* 258  563:getfield        #550 <Field float filledWidth>
	//* 259  566:invokevirtual   #666 <Method void updateFilledWidth(float)>
	//* 260  569:iload           10
	//* 261  571:iconst_1        
	//* 262  572:iand            
	//* 263  573:ifne            611
	//* 264  576:iload           13
	//* 265  578:ifeq            611
	//* 266  581:aload_0         
	//* 267  582:aconst_null     
	//* 268  583:putfield        #725 <Field ColumnText compositeColumn>
	//* 269  586:aload_0         
	//* 270  587:fload_2         
	//* 271  588:putfield        #520 <Field float yLine>
	//* 272  591:iconst_2        
	//* 273  592:ireturn         
							flag4 = false;
	//  274  593:iconst_0        
	//  275  594:istore          18
						((ColumnText) (obj2)).setUseAscender(flag4);
						compositeColumn.setInheritGraphicState(inheritGraphicState);
						compositeColumn.leftX = leftX;
						compositeColumn.rightX = rightX;
						compositeColumn.yLine = yLine;
						compositeColumn.rectangularWidth = rectangularWidth;
						compositeColumn.rectangularMode = rectangularMode;
						compositeColumn.minY = minY;
						compositeColumn.maxY = maxY;
						if(paragraph.getKeepTogether() && k != 0 && (i == 0 || !adjustFirstLine))
							flag2 = true;
						else
	//* 276  596:goto            348
							flag2 = false;
	//  277  599:iconst_0        
	//  278  600:istore          13
						if(flag || flag2 && j1 == 0)
							flag4 = true;
						else
	//* 279  602:goto            471
							flag4 = false;
	//  280  605:iconst_0        
	//  281  606:istore          18
						if(isTagged(canvas) && !flag4)
							canvas.openMCBlock(((IAccessibleElement) (paragraph)));
						k = compositeColumn.go(flag4);
						if(isTagged(canvas) && !flag4)
							canvas.closeMCBlock(((IAccessibleElement) (paragraph)));
						lastX = compositeColumn.getLastX();
						updateFilledWidth(compositeColumn.filledWidth);
						if((k & 1) == 0 && flag2)
						{
							compositeColumn = null;
							yLine = f;
							return 2;
						}
	//* 282  608:goto            488
						i2 = k;
	//  283  611:iload           10
	//  284  613:istore          12
						if(!flag)
	//* 285  615:iload_1         
	//* 286  616:ifne            628
						{
							if(flag2)
								break label0;
	//  287  619:iload           13
	//  288  621:ifne            749
							i2 = k;
	//  289  624:iload           10
	//  290  626:istore          12
						}
					}
					i = 0;
	//  291  628:iconst_0        
	//  292  629:istore          8
					if(compositeColumn.getLinesWritten() > 0)
	//* 293  631:aload_0         
	//* 294  632:getfield        #725 <Field ColumnText compositeColumn>
	//* 295  635:invokevirtual   #776 <Method int getLinesWritten()>
	//* 296  638:ifle            695
					{
						yLine = compositeColumn.yLine;
	//  297  641:aload_0         
	//  298  642:aload_0         
	//  299  643:getfield        #725 <Field ColumnText compositeColumn>
	//  300  646:getfield        #520 <Field float yLine>
	//  301  649:putfield        #520 <Field float yLine>
						linesWritten = linesWritten + compositeColumn.linesWritten;
	//  302  652:aload_0         
	//  303  653:aload_0         
	//  304  654:getfield        #560 <Field int linesWritten>
	//  305  657:aload_0         
	//  306  658:getfield        #725 <Field ColumnText compositeColumn>
	//  307  661:getfield        #560 <Field int linesWritten>
	//  308  664:iadd            
	//  309  665:putfield        #560 <Field int linesWritten>
						descender = compositeColumn.descender;
	//  310  668:aload_0         
	//  311  669:aload_0         
	//  312  670:getfield        #725 <Field ColumnText compositeColumn>
	//  313  673:getfield        #546 <Field float descender>
	//  314  676:putfield        #546 <Field float descender>
						isWordSplit = isWordSplit | compositeColumn.isWordSplit();
	//  315  679:aload_0         
	//  316  680:aload_0         
	//  317  681:getfield        #572 <Field boolean isWordSplit>
	//  318  684:aload_0         
	//  319  685:getfield        #725 <Field ColumnText compositeColumn>
	//  320  688:invokevirtual   #777 <Method boolean isWordSplit()>
	//  321  691:ior             
	//  322  692:putfield        #572 <Field boolean isWordSplit>
					}
					currentLeading = compositeColumn.currentLeading;
	//  323  695:aload_0         
	//  324  696:aload_0         
	//  325  697:getfield        #725 <Field ColumnText compositeColumn>
	//  326  700:getfield        #109 <Field float currentLeading>
	//  327  703:putfield        #109 <Field float currentLeading>
					if((i2 & 1) != 0)
	//* 328  706:iload           12
	//* 329  708:iconst_1        
	//* 330  709:iand            
	//* 331  710:ifeq            740
					{
						compositeColumn = null;
	//  332  713:aload_0         
	//  333  714:aconst_null     
	//  334  715:putfield        #725 <Field ColumnText compositeColumn>
						compositeElements.removeFirst();
	//  335  718:aload_0         
	//  336  719:getfield        #465 <Field LinkedList compositeElements>
	//  337  722:invokevirtual   #780 <Method Object LinkedList.removeFirst()>
	//  338  725:pop             
						yLine = yLine - paragraph.getSpacingAfter();
	//  339  726:aload_0         
	//  340  727:aload_0         
	//  341  728:getfield        #520 <Field float yLine>
	//  342  731:aload           19
	//  343  733:invokevirtual   #781 <Method float Paragraph.getSpacingAfter()>
	//  344  736:fsub            
	//  345  737:putfield        #520 <Field float yLine>
					}
					if((i2 & 2) != 0)
	//* 346  740:iload           12
	//* 347  742:iconst_2        
	//* 348  743:iand            
	//* 349  744:ifeq            65
						return 2;
	//  350  747:iconst_2        
	//  351  748:ireturn         
					continue; /* Loop/switch isn't completed */
				}
				if(j1 == 0)
	//* 352  749:iload           11
	//* 353  751:ifne            764
				{
					compositeColumn = null;
	//  354  754:aload_0         
	//  355  755:aconst_null     
	//  356  756:putfield        #725 <Field ColumnText compositeColumn>
					yLine = f;
	//  357  759:aload_0         
	//  358  760:fload_2         
	//  359  761:putfield        #520 <Field float yLine>
				}
				j1++;
	//  360  764:iload           11
	//  361  766:iconst_1        
	//  362  767:iadd            
	//  363  768:istore          11
			} while(true);
	//  364  770:goto            120
		}
		if(((Element) (obj2)).type() != 14)
			break MISSING_BLOCK_LABEL_2066;
	//  365  773:aload           20
	//  366  775:invokeinterface #304 <Method int Element.type()>
	//  367  780:bipush          14
	//  368  782:icmpne          2066
		obj = ((Object) ((com.itextpdf.text.List)obj2));
	//  369  785:aload           20
	//  370  787:checkcast       #783 <Class com.itextpdf.text.List>
	//  371  790:astore          19
		obj2 = ((Object) (((com.itextpdf.text.List) (obj)).getItems()));
	//  372  792:aload           19
	//  373  794:invokevirtual   #787 <Method ArrayList com.itextpdf.text.List.getItems()>
	//  374  797:astore          20
		obj7 = null;
	//  375  799:aconst_null     
	//  376  800:astore          23
		f1 = ((com.itextpdf.text.List) (obj)).getIndentationLeft();
	//  377  802:aload           19
	//  378  804:invokevirtual   #788 <Method float com.itextpdf.text.List.getIndentationLeft()>
	//  379  807:fstore_2        
		l = 0;
	//  380  808:iconst_0        
	//  381  809:istore          10
		stack = new Stack();
	//  382  811:new             #790 <Class Stack>
	//  383  814:dup             
	//  384  815:invokespecial   #791 <Method void Stack()>
	//  385  818:astore          24
		k2 = 0;
	//  386  820:iconst_0        
	//  387  821:istore          13
_L15:
		Object obj3 = ((Object) (obj7));
	//  388  823:aload           23
	//  389  825:astore          21
		if(k2 >= ((ArrayList) (obj2)).size()) goto _L2; else goto _L1
	//  390  827:iload           13
	//  391  829:aload           20
	//  392  831:invokevirtual   #523 <Method int ArrayList.size()>
	//  393  834:icmpge          870
_L1:
		Object obj5 = ((ArrayList) (obj2)).get(k2);
	//  394  837:aload           20
	//  395  839:iload           13
	//  396  841:invokevirtual   #527 <Method Object ArrayList.get(int)>
	//  397  844:astore          22
		if(!(obj5 instanceof ListItem)) goto _L4; else goto _L3
	//  398  846:aload           22
	//  399  848:instanceof      #579 <Class ListItem>
	//  400  851:ifeq            1117
_L3:
		if(l != listIdx) goto _L6; else goto _L5
	//  401  854:iload           10
	//  402  856:aload_0         
	//  403  857:getfield        #140 <Field int listIdx>
	//  404  860:icmpne          993
_L5:
		obj3 = ((Object) ((ListItem)obj5));
	//  405  863:aload           22
	//  406  865:checkcast       #579 <Class ListItem>
	//  407  868:astore          21
_L2:
		int k1;
		int j2;
		k1 = 0;
	//  408  870:iconst_0        
	//  409  871:istore          11
		l = 0;
	//  410  873:iconst_0        
	//  411  874:istore          10
		j2 = 0;
	//  412  876:iconst_0        
	//  413  877:istore          12
_L19:
		int k3;
		k3 = l;
	//  414  879:iload           10
	//  415  881:istore          15
		k2 = k1;
	//  416  883:iload           11
	//  417  885:istore          13
		if(j2 >= 2) goto _L8; else goto _L7
	//  418  887:iload           12
	//  419  889:iconst_2        
	//  420  890:icmpge          934
_L7:
		float f2;
		f2 = yLine;
	//  421  893:aload_0         
	//  422  894:getfield        #520 <Field float yLine>
	//  423  897:fstore_3        
		k2 = 0;
	//  424  898:iconst_0        
	//  425  899:istore          13
		if(compositeColumn != null) goto _L10; else goto _L9
	//  426  901:aload_0         
	//  427  902:getfield        #725 <Field ColumnText compositeColumn>
	//  428  905:ifnonnull       1442
_L9:
		if(obj3 != null) goto _L12; else goto _L11
	//  429  908:aload           21
	//  430  910:ifnonnull       1211
_L11:
		listIdx = 0;
	//  431  913:aload_0         
	//  432  914:iconst_0        
	//  433  915:putfield        #140 <Field int listIdx>
		compositeElements.removeFirst();
	//  434  918:aload_0         
	//  435  919:getfield        #465 <Field LinkedList compositeElements>
	//  436  922:invokevirtual   #780 <Method Object LinkedList.removeFirst()>
	//  437  925:pop             
		k2 = k1;
	//  438  926:iload           11
	//  439  928:istore          13
		k3 = l;
	//  440  930:iload           10
	//  441  932:istore          15
_L8:
		if(isTagged(canvas) && !flag && (obj3 == null || ((com.itextpdf.text.List) (obj)).getLastItem() == obj3 && (k2 & 1) != 0 || (k2 & 2) != 0))
	//* 442  934:aload_0         
	//* 443  935:getfield        #154 <Field PdfContentByte canvas>
	//* 444  938:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//* 445  941:ifeq            986
	//* 446  944:iload_1         
	//* 447  945:ifne            986
	//* 448  948:aload           21
	//* 449  950:ifnull          977
	//* 450  953:aload           19
	//* 451  955:invokevirtual   #795 <Method ListItem com.itextpdf.text.List.getLastItem()>
	//* 452  958:aload           21
	//* 453  960:if_acmpne       970
	//* 454  963:iload           13
	//* 455  965:iconst_1        
	//* 456  966:iand            
	//* 457  967:ifne            977
	//* 458  970:iload           13
	//* 459  972:iconst_2        
	//* 460  973:iand            
	//* 461  974:ifeq            986
			canvas.closeMCBlock(((IAccessibleElement) (obj)));
	//  462  977:aload_0         
	//  463  978:getfield        #154 <Field PdfContentByte canvas>
	//  464  981:aload           19
	//  465  983:invokevirtual   #692 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
		if(k3 != 0)
	//* 466  986:iload           15
	//* 467  988:ifeq            1825
			return 2;
	//  468  991:iconst_2        
	//  469  992:ireturn         
		break MISSING_BLOCK_LABEL_1825;
_L6:
		k1 = l + 1;
	//  470  993:iload           10
	//  471  995:iconst_1        
	//  472  996:iadd            
	//  473  997:istore          11
		f2 = f1;
	//  474  999:fload_2         
	//  475 1000:fstore_3        
		obj3 = obj;
	//  476 1001:aload           19
	//  477 1003:astore          21
		j2 = k2;
	//  478 1005:iload           13
	//  479 1007:istore          12
_L14:
		do
		{
			l = k1;
	//  480 1009:iload           11
	//  481 1011:istore          10
			obj5 = obj2;
	//  482 1013:aload           20
	//  483 1015:astore          22
			k2 = j2;
	//  484 1017:iload           12
	//  485 1019:istore          13
			obj = obj3;
	//  486 1021:aload           21
	//  487 1023:astore          19
			f1 = f2;
	//  488 1025:fload_3         
	//  489 1026:fstore_2        
			if(j2 != ((ArrayList) (obj2)).size() - 1)
				break;
	//  490 1027:iload           12
	//  491 1029:aload           20
	//  492 1031:invokevirtual   #523 <Method int ArrayList.size()>
	//  493 1034:iconst_1        
	//  494 1035:isub            
	//  495 1036:icmpne          1198
			l = k1;
	//  496 1039:iload           11
	//  497 1041:istore          10
			obj5 = obj2;
	//  498 1043:aload           20
	//  499 1045:astore          22
			k2 = j2;
	//  500 1047:iload           12
	//  501 1049:istore          13
			obj = obj3;
	//  502 1051:aload           21
	//  503 1053:astore          19
			f1 = f2;
	//  504 1055:fload_3         
	//  505 1056:fstore_2        
			if(stack.isEmpty())
				break;
	//  506 1057:aload           24
	//  507 1059:invokevirtual   #796 <Method boolean Stack.isEmpty()>
	//  508 1062:ifne            1198
			obj = ((Object) ((Object[])stack.pop()));
	//  509 1065:aload           24
	//  510 1067:invokevirtual   #799 <Method Object Stack.pop()>
	//  511 1070:checkcast       #801 <Class Object[]>
	//  512 1073:astore          19
			obj3 = ((Object) ((com.itextpdf.text.List)obj[0]));
	//  513 1075:aload           19
	//  514 1077:iconst_0        
	//  515 1078:aaload          
	//  516 1079:checkcast       #783 <Class com.itextpdf.text.List>
	//  517 1082:astore          21
			obj2 = ((Object) (((com.itextpdf.text.List) (obj3)).getItems()));
	//  518 1084:aload           21
	//  519 1086:invokevirtual   #787 <Method ArrayList com.itextpdf.text.List.getItems()>
	//  520 1089:astore          20
			j2 = ((Integer)obj[1]).intValue();
	//  521 1091:aload           19
	//  522 1093:iconst_1        
	//  523 1094:aaload          
	//  524 1095:checkcast       #803 <Class Integer>
	//  525 1098:invokevirtual   #806 <Method int Integer.intValue()>
	//  526 1101:istore          12
			f2 = ((Float)obj[2]).floatValue();
	//  527 1103:aload           19
	//  528 1105:iconst_2        
	//  529 1106:aaload          
	//  530 1107:checkcast       #585 <Class Float>
	//  531 1110:invokevirtual   #809 <Method float Float.floatValue()>
	//  532 1113:fstore_3        
		} while(true);
	//  533 1114:goto            1009
		break; /* Loop/switch isn't completed */
_L4:
		k1 = l;
	//  534 1117:iload           10
	//  535 1119:istore          11
		j2 = k2;
	//  536 1121:iload           13
	//  537 1123:istore          12
		obj3 = obj;
	//  538 1125:aload           19
	//  539 1127:astore          21
		f2 = f1;
	//  540 1129:fload_2         
	//  541 1130:fstore_3        
		if(!(obj5 instanceof com.itextpdf.text.List))
			continue; /* Loop/switch isn't completed */
	//  542 1131:aload           22
	//  543 1133:instanceof      #783 <Class com.itextpdf.text.List>
	//  544 1136:ifeq            1009
		stack.push(((Object) (new Object[] {
			obj, Integer.valueOf(k2), new Float(f1)
		})));
	//  545 1139:aload           24
	//  546 1141:iconst_3        
	//  547 1142:anewarray       Object[]
	//  548 1145:dup             
	//  549 1146:iconst_0        
	//  550 1147:aload           19
	//  551 1149:aastore         
	//  552 1150:dup             
	//  553 1151:iconst_1        
	//  554 1152:iload           13
	//  555 1154:invokestatic    #813 <Method Integer Integer.valueOf(int)>
	//  556 1157:aastore         
	//  557 1158:dup             
	//  558 1159:iconst_2        
	//  559 1160:new             #585 <Class Float>
	//  560 1163:dup             
	//  561 1164:fload_2         
	//  562 1165:invokespecial   #587 <Method void Float(float)>
	//  563 1168:aastore         
	//  564 1169:invokevirtual   #817 <Method Object Stack.push(Object)>
	//  565 1172:pop             
		obj = ((Object) ((com.itextpdf.text.List)obj5));
	//  566 1173:aload           22
	//  567 1175:checkcast       #783 <Class com.itextpdf.text.List>
	//  568 1178:astore          19
		obj5 = ((Object) (((com.itextpdf.text.List) (obj)).getItems()));
	//  569 1180:aload           19
	//  570 1182:invokevirtual   #787 <Method ArrayList com.itextpdf.text.List.getItems()>
	//  571 1185:astore          22
		f1 += ((com.itextpdf.text.List) (obj)).getIndentationLeft();
	//  572 1187:fload_2         
	//  573 1188:aload           19
	//  574 1190:invokevirtual   #788 <Method float com.itextpdf.text.List.getIndentationLeft()>
	//  575 1193:fadd            
	//  576 1194:fstore_2        
		k2 = -1;
	//  577 1195:iconst_m1       
	//  578 1196:istore          13
		break; /* Loop/switch isn't completed */
		if(true) goto _L14; else goto _L13
_L13:
		k2++;
	//  579 1198:iload           13
	//  580 1200:iconst_1        
	//  581 1201:iadd            
	//  582 1202:istore          13
		obj2 = obj5;
	//  583 1204:aload           22
	//  584 1206:astore          20
		  goto _L15
	//* 585 1208:goto            823
_L12:
		boolean flag3;
		boolean flag5;
		compositeColumn = new ColumnText(canvas);
	//  586 1211:aload_0         
	//  587 1212:new             #2   <Class ColumnText>
	//  588 1215:dup             
	//  589 1216:aload_0         
	//  590 1217:getfield        #154 <Field PdfContentByte canvas>
	//  591 1220:invokespecial   #204 <Method void ColumnText(PdfContentByte)>
	//  592 1223:putfield        #725 <Field ColumnText compositeColumn>
		obj2 = ((Object) (compositeColumn));
	//  593 1226:aload_0         
	//  594 1227:getfield        #725 <Field ColumnText compositeColumn>
	//  595 1230:astore          20
		int i3;
		if((i != 0 || descender == 0.0F) && adjustFirstLine)
	//* 596 1232:iload           8
	//* 597 1234:ifne            1246
	//* 598 1237:aload_0         
	//* 599 1238:getfield        #546 <Field float descender>
	//* 600 1241:fconst_0        
	//* 601 1242:fcmpl           
	//* 602 1243:ifne            1807
	//* 603 1246:aload_0         
	//* 604 1247:getfield        #148 <Field boolean adjustFirstLine>
	//* 605 1250:ifeq            1807
			flag5 = useAscender;
	//  606 1253:aload_0         
	//  607 1254:getfield        #146 <Field boolean useAscender>
	//  608 1257:istore          18
		else
	//* 609 1259:aload           20
	//* 610 1261:iload           18
	//* 611 1263:invokevirtual   #764 <Method void setUseAscender(boolean)>
	//* 612 1266:aload_0         
	//* 613 1267:getfield        #725 <Field ColumnText compositeColumn>
	//* 614 1270:aload_0         
	//* 615 1271:getfield        #150 <Field boolean inheritGraphicState>
	//* 616 1274:invokevirtual   #767 <Method void setInheritGraphicState(boolean)>
	//* 617 1277:aload_0         
	//* 618 1278:getfield        #725 <Field ColumnText compositeColumn>
	//* 619 1281:aload           21
	//* 620 1283:invokevirtual   #818 <Method int ListItem.getAlignment()>
	//* 621 1286:invokevirtual   #336 <Method void setAlignment(int)>
	//* 622 1289:aload_0         
	//* 623 1290:getfield        #725 <Field ColumnText compositeColumn>
	//* 624 1293:aload           21
	//* 625 1295:invokevirtual   #819 <Method float ListItem.getIndentationLeft()>
	//* 626 1298:fload_2         
	//* 627 1299:fadd            
	//* 628 1300:aload           21
	//* 629 1302:invokevirtual   #820 <Method float ListItem.getFirstLineIndent()>
	//* 630 1305:fadd            
	//* 631 1306:iconst_0        
	//* 632 1307:invokevirtual   #736 <Method void setIndent(float, boolean)>
	//* 633 1310:aload_0         
	//* 634 1311:getfield        #725 <Field ColumnText compositeColumn>
	//* 635 1314:aload           21
	//* 636 1316:invokevirtual   #821 <Method float ListItem.getExtraParagraphSpace()>
	//* 637 1319:invokevirtual   #741 <Method void setExtraParagraphSpace(float)>
	//* 638 1322:aload_0         
	//* 639 1323:getfield        #725 <Field ColumnText compositeColumn>
	//* 640 1326:aload_0         
	//* 641 1327:getfield        #725 <Field ColumnText compositeColumn>
	//* 642 1330:invokevirtual   #823 <Method float getIndent()>
	//* 643 1333:invokevirtual   #744 <Method void setFollowingIndent(float)>
	//* 644 1336:aload_0         
	//* 645 1337:getfield        #725 <Field ColumnText compositeColumn>
	//* 646 1340:aload           21
	//* 647 1342:invokevirtual   #824 <Method float ListItem.getIndentationRight()>
	//* 648 1345:aload           19
	//* 649 1347:invokevirtual   #825 <Method float com.itextpdf.text.List.getIndentationRight()>
	//* 650 1350:fadd            
	//* 651 1351:invokevirtual   #750 <Method void setRightIndent(float)>
	//* 652 1354:aload_0         
	//* 653 1355:getfield        #725 <Field ColumnText compositeColumn>
	//* 654 1358:aload           21
	//* 655 1360:invokevirtual   #826 <Method float ListItem.getLeading()>
	//* 656 1363:aload           21
	//* 657 1365:invokevirtual   #827 <Method float ListItem.getMultipliedLeading()>
	//* 658 1368:invokevirtual   #757 <Method void setLeading(float, float)>
	//* 659 1371:aload_0         
	//* 660 1372:getfield        #725 <Field ColumnText compositeColumn>
	//* 661 1375:aload_0         
	//* 662 1376:getfield        #104 <Field int runDirection>
	//* 663 1379:invokevirtual   #263 <Method void setRunDirection(int)>
	//* 664 1382:aload_0         
	//* 665 1383:getfield        #725 <Field ColumnText compositeColumn>
	//* 666 1386:aload_0         
	//* 667 1387:getfield        #136 <Field int arabicOptions>
	//* 668 1390:invokevirtual   #339 <Method void setArabicOptions(int)>
	//* 669 1393:aload_0         
	//* 670 1394:getfield        #725 <Field ColumnText compositeColumn>
	//* 671 1397:aload_0         
	//* 672 1398:getfield        #128 <Field float spaceCharRatio>
	//* 673 1401:invokevirtual   #760 <Method void setSpaceCharRatio(float)>
	//* 674 1404:aload_0         
	//* 675 1405:getfield        #725 <Field ColumnText compositeColumn>
	//* 676 1408:aload           21
	//* 677 1410:invokevirtual   #282 <Method void addText(Phrase)>
	//* 678 1413:iload           8
	//* 679 1415:ifeq            1425
	//* 680 1418:aload_0         
	//* 681 1419:getfield        #148 <Field boolean adjustFirstLine>
	//* 682 1422:ifne            1439
	//* 683 1425:aload_0         
	//* 684 1426:aload_0         
	//* 685 1427:getfield        #520 <Field float yLine>
	//* 686 1430:aload           21
	//* 687 1432:invokevirtual   #828 <Method float ListItem.getSpacingBefore()>
	//* 688 1435:fsub            
	//* 689 1436:putfield        #520 <Field float yLine>
	//* 690 1439:iconst_1        
	//* 691 1440:istore          13
	//* 692 1442:aload_0         
	//* 693 1443:getfield        #725 <Field ColumnText compositeColumn>
	//* 694 1446:aload_0         
	//* 695 1447:getfield        #628 <Field float leftX>
	//* 696 1450:putfield        #628 <Field float leftX>
	//* 697 1453:aload_0         
	//* 698 1454:getfield        #725 <Field ColumnText compositeColumn>
	//* 699 1457:aload_0         
	//* 700 1458:getfield        #769 <Field float rightX>
	//* 701 1461:putfield        #769 <Field float rightX>
	//* 702 1464:aload_0         
	//* 703 1465:getfield        #725 <Field ColumnText compositeColumn>
	//* 704 1468:aload_0         
	//* 705 1469:getfield        #520 <Field float yLine>
	//* 706 1472:putfield        #520 <Field float yLine>
	//* 707 1475:aload_0         
	//* 708 1476:getfield        #725 <Field ColumnText compositeColumn>
	//* 709 1479:aload_0         
	//* 710 1480:getfield        #124 <Field float rectangularWidth>
	//* 711 1483:putfield        #124 <Field float rectangularWidth>
	//* 712 1486:aload_0         
	//* 713 1487:getfield        #725 <Field ColumnText compositeColumn>
	//* 714 1490:aload_0         
	//* 715 1491:getfield        #126 <Field boolean rectangularMode>
	//* 716 1494:putfield        #126 <Field boolean rectangularMode>
	//* 717 1497:aload_0         
	//* 718 1498:getfield        #725 <Field ColumnText compositeColumn>
	//* 719 1501:aload_0         
	//* 720 1502:getfield        #501 <Field float minY>
	//* 721 1505:putfield        #501 <Field float minY>
	//* 722 1508:aload_0         
	//* 723 1509:getfield        #725 <Field ColumnText compositeColumn>
	//* 724 1512:aload_0         
	//* 725 1513:getfield        #499 <Field float maxY>
	//* 726 1516:putfield        #499 <Field float maxY>
	//* 727 1519:aload           21
	//* 728 1521:invokevirtual   #829 <Method boolean ListItem.getKeepTogether()>
	//* 729 1524:ifeq            1813
	//* 730 1527:iload           13
	//* 731 1529:ifeq            1813
	//* 732 1532:iload           8
	//* 733 1534:ifeq            1544
	//* 734 1537:aload_0         
	//* 735 1538:getfield        #148 <Field boolean adjustFirstLine>
	//* 736 1541:ifne            1813
	//* 737 1544:iconst_1        
	//* 738 1545:istore          16
	//* 739 1547:iload_1         
	//* 740 1548:ifne            1561
	//* 741 1551:iload           16
	//* 742 1553:ifeq            1819
	//* 743 1556:iload           12
	//* 744 1558:ifne            1819
	//* 745 1561:iconst_1        
	//* 746 1562:istore          18
	//* 747 1564:aload_0         
	//* 748 1565:getfield        #154 <Field PdfContentByte canvas>
	//* 749 1568:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//* 750 1571:ifeq            1633
	//* 751 1574:iload           18
	//* 752 1576:ifne            1633
	//* 753 1579:aload           21
	//* 754 1581:invokevirtual   #670 <Method ListLabel ListItem.getListLabel()>
	//* 755 1584:fload_2         
	//* 756 1585:invokevirtual   #832 <Method void ListLabel.setIndentation(float)>
	//* 757 1588:aload           19
	//* 758 1590:invokevirtual   #835 <Method ListItem com.itextpdf.text.List.getFirstItem()>
	//* 759 1593:aload           21
	//* 760 1595:if_acmpeq       1615
	//* 761 1598:aload_0         
	//* 762 1599:getfield        #725 <Field ColumnText compositeColumn>
	//* 763 1602:ifnull          1624
	//* 764 1605:aload_0         
	//* 765 1606:getfield        #725 <Field ColumnText compositeColumn>
	//* 766 1609:getfield        #158 <Field BidiLine bidiLine>
	//* 767 1612:ifnull          1624
	//* 768 1615:aload_0         
	//* 769 1616:getfield        #154 <Field PdfContentByte canvas>
	//* 770 1619:aload           19
	//* 771 1621:invokevirtual   #674 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//* 772 1624:aload_0         
	//* 773 1625:getfield        #154 <Field PdfContentByte canvas>
	//* 774 1628:aload           21
	//* 775 1630:invokevirtual   #674 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//* 776 1633:aload_0         
	//* 777 1634:getfield        #725 <Field ColumnText compositeColumn>
	//* 778 1637:iload           18
	//* 779 1639:aload           21
	//* 780 1641:invokevirtual   #570 <Method int go(boolean, IAccessibleElement)>
	//* 781 1644:istore          14
	//* 782 1646:aload_0         
	//* 783 1647:getfield        #154 <Field PdfContentByte canvas>
	//* 784 1650:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//* 785 1653:ifeq            1682
	//* 786 1656:iload           18
	//* 787 1658:ifne            1682
	//* 788 1661:aload_0         
	//* 789 1662:getfield        #154 <Field PdfContentByte canvas>
	//* 790 1665:aload           21
	//* 791 1667:invokevirtual   #583 <Method com.itextpdf.text.ListBody ListItem.getListBody()>
	//* 792 1670:invokevirtual   #692 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//* 793 1673:aload_0         
	//* 794 1674:getfield        #154 <Field PdfContentByte canvas>
	//* 795 1677:aload           21
	//* 796 1679:invokevirtual   #692 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//* 797 1682:aload_0         
	//* 798 1683:aload_0         
	//* 799 1684:getfield        #725 <Field ColumnText compositeColumn>
	//* 800 1687:invokevirtual   #774 <Method float getLastX()>
	//* 801 1690:putfield        #556 <Field float lastX>
	//* 802 1693:aload_0         
	//* 803 1694:aload_0         
	//* 804 1695:getfield        #725 <Field ColumnText compositeColumn>
	//* 805 1698:getfield        #550 <Field float filledWidth>
	//* 806 1701:invokevirtual   #666 <Method void updateFilledWidth(float)>
	//* 807 1704:iload           10
	//* 808 1706:istore          11
	//* 809 1708:iload           14
	//* 810 1710:iconst_1        
	//* 811 1711:iand            
	//* 812 1712:ifne            1737
	//* 813 1715:iload           10
	//* 814 1717:istore          11
	//* 815 1719:iload           16
	//* 816 1721:ifeq            1737
	//* 817 1724:iconst_1        
	//* 818 1725:istore          11
	//* 819 1727:aload_0         
	//* 820 1728:aconst_null     
	//* 821 1729:putfield        #725 <Field ColumnText compositeColumn>
	//* 822 1732:aload_0         
	//* 823 1733:fload_3         
	//* 824 1734:putfield        #520 <Field float yLine>
	//* 825 1737:iload           11
	//* 826 1739:istore          15
	//* 827 1741:iload           14
	//* 828 1743:istore          13
	//* 829 1745:iload_1         
	//* 830 1746:ifne            934
	//* 831 1749:iload           11
	//* 832 1751:istore          15
	//* 833 1753:iload           14
	//* 834 1755:istore          13
	//* 835 1757:iload           16
	//* 836 1759:ifeq            934
	//* 837 1762:iload           11
	//* 838 1764:istore          15
	//* 839 1766:iload           14
	//* 840 1768:istore          13
	//* 841 1770:iload           11
	//* 842 1772:ifne            934
	//* 843 1775:iload           12
	//* 844 1777:ifne            1790
	//* 845 1780:aload_0         
	//* 846 1781:aconst_null     
	//* 847 1782:putfield        #725 <Field ColumnText compositeColumn>
	//* 848 1785:aload_0         
	//* 849 1786:fload_3         
	//* 850 1787:putfield        #520 <Field float yLine>
	//* 851 1790:iload           12
	//* 852 1792:iconst_1        
	//* 853 1793:iadd            
	//* 854 1794:istore          12
	//* 855 1796:iload           11
	//* 856 1798:istore          10
	//* 857 1800:iload           14
	//* 858 1802:istore          11
	//* 859 1804:goto            879
			flag5 = false;
	//  860 1807:iconst_0        
	//  861 1808:istore          18
		((ColumnText) (obj2)).setUseAscender(flag5);
		compositeColumn.setInheritGraphicState(inheritGraphicState);
		compositeColumn.setAlignment(((ListItem) (obj3)).getAlignment());
		compositeColumn.setIndent(((ListItem) (obj3)).getIndentationLeft() + f1 + ((ListItem) (obj3)).getFirstLineIndent(), false);
		compositeColumn.setExtraParagraphSpace(((ListItem) (obj3)).getExtraParagraphSpace());
		compositeColumn.setFollowingIndent(compositeColumn.getIndent());
		compositeColumn.setRightIndent(((ListItem) (obj3)).getIndentationRight() + ((com.itextpdf.text.List) (obj)).getIndentationRight());
		compositeColumn.setLeading(((ListItem) (obj3)).getLeading(), ((ListItem) (obj3)).getMultipliedLeading());
		compositeColumn.setRunDirection(runDirection);
		compositeColumn.setArabicOptions(arabicOptions);
		compositeColumn.setSpaceCharRatio(spaceCharRatio);
		compositeColumn.addText(((Phrase) (obj3)));
		if(i == 0 || !adjustFirstLine)
			yLine = yLine - ((ListItem) (obj3)).getSpacingBefore();
		k2 = 1;
_L10:
		compositeColumn.leftX = leftX;
		compositeColumn.rightX = rightX;
		compositeColumn.yLine = yLine;
		compositeColumn.rectangularWidth = rectangularWidth;
		compositeColumn.rectangularMode = rectangularMode;
		compositeColumn.minY = minY;
		compositeColumn.maxY = maxY;
		if(((ListItem) (obj3)).getKeepTogether() && k2 != 0 && (i == 0 || !adjustFirstLine))
			flag3 = true;
		else
	//* 862 1810:goto            1259
			flag3 = false;
	//  863 1813:iconst_0        
	//  864 1814:istore          16
		if(flag || flag3 && j2 == 0)
			flag5 = true;
		else
	//* 865 1816:goto            1547
			flag5 = false;
	//  866 1819:iconst_0        
	//  867 1820:istore          18
		if(isTagged(canvas) && !flag5)
		{
			((ListItem) (obj3)).getListLabel().setIndentation(f1);
			if(((com.itextpdf.text.List) (obj)).getFirstItem() == obj3 || compositeColumn != null && compositeColumn.bidiLine != null)
				canvas.openMCBlock(((IAccessibleElement) (obj)));
			canvas.openMCBlock(((IAccessibleElement) (obj3)));
		}
		i3 = compositeColumn.go(flag5, ((IAccessibleElement) (obj3)));
		if(isTagged(canvas) && !flag5)
		{
			canvas.closeMCBlock(((IAccessibleElement) (((ListItem) (obj3)).getListBody())));
			canvas.closeMCBlock(((IAccessibleElement) (obj3)));
		}
		lastX = compositeColumn.getLastX();
		updateFilledWidth(compositeColumn.filledWidth);
		k1 = l;
		if((i3 & 1) == 0)
		{
			k1 = l;
			if(flag3)
			{
				k1 = 1;
				compositeColumn = null;
				yLine = f2;
			}
		}
		k3 = k1;
		k2 = i3;
		if(flag) goto _L8; else goto _L16
_L16:
		k3 = k1;
		k2 = i3;
		if(!flag3) goto _L8; else goto _L17
_L17:
		k3 = k1;
		k2 = i3;
		if(k1 != 0) goto _L8; else goto _L18
_L18:
		if(j2 == 0)
		{
			compositeColumn = null;
			yLine = f2;
		}
		j2++;
		l = k1;
		k1 = i3;
		  goto _L19
	//* 868 1822:goto            1564
		if(obj3 != null)
	//* 869 1825:aload           21
	//* 870 1827:ifnull          65
		{
			i = 0;
	//  871 1830:iconst_0        
	//  872 1831:istore          8
			yLine = compositeColumn.yLine;
	//  873 1833:aload_0         
	//  874 1834:aload_0         
	//  875 1835:getfield        #725 <Field ColumnText compositeColumn>
	//  876 1838:getfield        #520 <Field float yLine>
	//  877 1841:putfield        #520 <Field float yLine>
			linesWritten = linesWritten + compositeColumn.linesWritten;
	//  878 1844:aload_0         
	//  879 1845:aload_0         
	//  880 1846:getfield        #560 <Field int linesWritten>
	//  881 1849:aload_0         
	//  882 1850:getfield        #725 <Field ColumnText compositeColumn>
	//  883 1853:getfield        #560 <Field int linesWritten>
	//  884 1856:iadd            
	//  885 1857:putfield        #560 <Field int linesWritten>
			descender = compositeColumn.descender;
	//  886 1860:aload_0         
	//  887 1861:aload_0         
	//  888 1862:getfield        #725 <Field ColumnText compositeColumn>
	//  889 1865:getfield        #546 <Field float descender>
	//  890 1868:putfield        #546 <Field float descender>
			currentLeading = compositeColumn.currentLeading;
	//  891 1871:aload_0         
	//  892 1872:aload_0         
	//  893 1873:getfield        #725 <Field ColumnText compositeColumn>
	//  894 1876:getfield        #109 <Field float currentLeading>
	//  895 1879:putfield        #109 <Field float currentLeading>
			if(!isTagged(canvas) && !Float.isNaN(compositeColumn.firstLineY) && !compositeColumn.firstLineYDone)
	//* 896 1882:aload_0         
	//* 897 1883:getfield        #154 <Field PdfContentByte canvas>
	//* 898 1886:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//* 899 1889:ifne            1981
	//* 900 1892:aload_0         
	//* 901 1893:getfield        #725 <Field ColumnText compositeColumn>
	//* 902 1896:getfield        #590 <Field float firstLineY>
	//* 903 1899:invokestatic    #641 <Method boolean Float.isNaN(float)>
	//* 904 1902:ifne            1981
	//* 905 1905:aload_0         
	//* 906 1906:getfield        #725 <Field ColumnText compositeColumn>
	//* 907 1909:getfield        #134 <Field boolean firstLineYDone>
	//* 908 1912:ifne            1981
			{
				if(!flag)
	//* 909 1915:iload_1         
	//* 910 1916:ifne            1973
					if(j != 0)
	//* 911 1919:iload           9
	//* 912 1921:ifeq            2026
						showTextAligned(canvas, 2, new Phrase(((ListItem) (obj3)).getListSymbol()), compositeColumn.lastX + ((ListItem) (obj3)).getIndentationLeft(), compositeColumn.firstLineY, 0.0F, runDirection, arabicOptions);
	//  913 1924:aload_0         
	//  914 1925:getfield        #154 <Field PdfContentByte canvas>
	//  915 1928:iconst_2        
	//  916 1929:new             #165 <Class Phrase>
	//  917 1932:dup             
	//  918 1933:aload           21
	//  919 1935:invokevirtual   #678 <Method Chunk ListItem.getListSymbol()>
	//  920 1938:invokespecial   #477 <Method void Phrase(Chunk)>
	//  921 1941:aload_0         
	//  922 1942:getfield        #725 <Field ColumnText compositeColumn>
	//  923 1945:getfield        #556 <Field float lastX>
	//  924 1948:aload           21
	//  925 1950:invokevirtual   #819 <Method float ListItem.getIndentationLeft()>
	//  926 1953:fadd            
	//  927 1954:aload_0         
	//  928 1955:getfield        #725 <Field ColumnText compositeColumn>
	//  929 1958:getfield        #590 <Field float firstLineY>
	//  930 1961:fconst_0        
	//  931 1962:aload_0         
	//  932 1963:getfield        #104 <Field int runDirection>
	//  933 1966:aload_0         
	//  934 1967:getfield        #136 <Field int arabicOptions>
	//  935 1970:invokestatic    #327 <Method void showTextAligned(PdfContentByte, int, Phrase, float, float, float, int, int)>
					else
	//* 936 1973:aload_0         
	//* 937 1974:getfield        #725 <Field ColumnText compositeColumn>
	//* 938 1977:iconst_1        
	//* 939 1978:putfield        #134 <Field boolean firstLineYDone>
	//* 940 1981:iload           13
	//* 941 1983:iconst_1        
	//* 942 1984:iand            
	//* 943 1985:ifeq            2017
	//* 944 1988:aload_0         
	//* 945 1989:aconst_null     
	//* 946 1990:putfield        #725 <Field ColumnText compositeColumn>
	//* 947 1993:aload_0         
	//* 948 1994:aload_0         
	//* 949 1995:getfield        #140 <Field int listIdx>
	//* 950 1998:iconst_1        
	//* 951 1999:iadd            
	//* 952 2000:putfield        #140 <Field int listIdx>
	//* 953 2003:aload_0         
	//* 954 2004:aload_0         
	//* 955 2005:getfield        #520 <Field float yLine>
	//* 956 2008:aload           21
	//* 957 2010:invokevirtual   #836 <Method float ListItem.getSpacingAfter()>
	//* 958 2013:fsub            
	//* 959 2014:putfield        #520 <Field float yLine>
	//* 960 2017:iload           13
	//* 961 2019:iconst_2        
	//* 962 2020:iand            
	//* 963 2021:ifeq            65
	//* 964 2024:iconst_2        
	//* 965 2025:ireturn         
						showTextAligned(canvas, 0, new Phrase(((ListItem) (obj3)).getListSymbol()), compositeColumn.leftX + f1, compositeColumn.firstLineY, 0.0F);
	//  966 2026:aload_0         
	//  967 2027:getfield        #154 <Field PdfContentByte canvas>
	//  968 2030:iconst_0        
	//  969 2031:new             #165 <Class Phrase>
	//  970 2034:dup             
	//  971 2035:aload           21
	//  972 2037:invokevirtual   #678 <Method Chunk ListItem.getListSymbol()>
	//  973 2040:invokespecial   #477 <Method void Phrase(Chunk)>
	//  974 2043:aload_0         
	//  975 2044:getfield        #725 <Field ColumnText compositeColumn>
	//  976 2047:getfield        #628 <Field float leftX>
	//  977 2050:fload_2         
	//  978 2051:fadd            
	//  979 2052:aload_0         
	//  980 2053:getfield        #725 <Field ColumnText compositeColumn>
	//  981 2056:getfield        #590 <Field float firstLineY>
	//  982 2059:fconst_0        
	//  983 2060:invokestatic    #689 <Method void showTextAligned(PdfContentByte, int, Phrase, float, float, float)>
				compositeColumn.firstLineYDone = true;
			}
			if((k2 & 1) != 0)
			{
				compositeColumn = null;
				listIdx = listIdx + 1;
				yLine = yLine - ((ListItem) (obj3)).getSpacingAfter();
			}
			if((k2 & 2) != 0)
				return 2;
		}
		continue; /* Loop/switch isn't completed */
	//  984 2063:goto            1973
		float f3;
		float f4;
		float f5;
		int j3;
		float f6;
		boolean flag1;
		int l3;
		int i4;
		int j4;
		Object obj4;
label1:
		{
			if(((Element) (obj2)).type() != 23)
				break MISSING_BLOCK_LABEL_4130;
	//  985 2066:aload           20
	//  986 2068:invokeinterface #304 <Method int Element.type()>
	//  987 2073:bipush          23
	//  988 2075:icmpne          4130
			obj2 = ((Object) ((PdfPTable)obj2));
	//  989 2078:aload           20
	//  990 2080:checkcast       #363 <Class PdfPTable>
	//  991 2083:astore          20
			i4 = runDirection;
	//  992 2085:aload_0         
	//  993 2086:getfield        #104 <Field int runDirection>
	//  994 2089:istore          16
			runDirection = ((PdfPTable) (obj2)).getRunDirection();
	//  995 2091:aload_0         
	//  996 2092:aload           20
	//  997 2094:invokevirtual   #838 <Method int PdfPTable.getRunDirection()>
	//  998 2097:putfield        #104 <Field int runDirection>
			if(runDirection == 3)
	//* 999 2100:aload_0         
	//*1000 2101:getfield        #104 <Field int runDirection>
	//*1001 2104:iconst_3        
	//*1002 2105:icmpne          2135
				j = 1;
	// 1003 2108:iconst_1        
	// 1004 2109:istore          9
			else
	//*1005 2111:aload           20
	//*1006 2113:invokevirtual   #839 <Method int PdfPTable.size()>
	//*1007 2116:aload           20
	//*1008 2118:invokevirtual   #842 <Method int PdfPTable.getHeaderRows()>
	//*1009 2121:icmpgt          2141
	//*1010 2124:aload_0         
	//*1011 2125:getfield        #465 <Field LinkedList compositeElements>
	//*1012 2128:invokevirtual   #780 <Method Object LinkedList.removeFirst()>
	//*1013 2131:pop             
	//*1014 2132:goto            65
				j = 0;
	// 1015 2135:iconst_0        
	// 1016 2136:istore          9
			if(((PdfPTable) (obj2)).size() <= ((PdfPTable) (obj2)).getHeaderRows())
			{
				compositeElements.removeFirst();
				continue; /* Loop/switch isn't completed */
			}
	//*1017 2138:goto            2111
			f1 = yLine + descender;
	// 1018 2141:aload_0         
	// 1019 2142:getfield        #520 <Field float yLine>
	// 1020 2145:aload_0         
	// 1021 2146:getfield        #546 <Field float descender>
	// 1022 2149:fadd            
	// 1023 2150:fstore_2        
			f3 = f1;
	// 1024 2151:fload_2         
	// 1025 2152:fstore          4
			if(rowIdx == 0)
	//*1026 2154:aload_0         
	//*1027 2155:getfield        #142 <Field int rowIdx>
	//*1028 2158:ifne            2180
			{
				f3 = f1;
	// 1029 2161:fload_2         
	// 1030 2162:fstore          4
				if(adjustFirstLine)
	//*1031 2164:aload_0         
	//*1032 2165:getfield        #148 <Field boolean adjustFirstLine>
	//*1033 2168:ifeq            2180
					f3 = f1 - ((PdfPTable) (obj2)).spacingBefore();
	// 1034 2171:fload_2         
	// 1035 2172:aload           20
	// 1036 2174:invokevirtual   #845 <Method float PdfPTable.spacingBefore()>
	// 1037 2177:fsub            
	// 1038 2178:fstore          4
			}
			if(f3 < minY || f3 > maxY)
	//*1039 2180:fload           4
	//*1040 2182:aload_0         
	//*1041 2183:getfield        #501 <Field float minY>
	//*1042 2186:fcmpg           
	//*1043 2187:iflt            2200
	//*1044 2190:fload           4
	//*1045 2192:aload_0         
	//*1046 2193:getfield        #499 <Field float maxY>
	//*1047 2196:fcmpl           
	//*1048 2197:ifle            2202
				return 2;
	// 1049 2200:iconst_2        
	// 1050 2201:ireturn         
			f5 = leftX;
	// 1051 2202:aload_0         
	// 1052 2203:getfield        #628 <Field float leftX>
	// 1053 2206:fstore          6
			currentLeading = 0.0F;
	// 1054 2208:aload_0         
	// 1055 2209:fconst_0        
	// 1056 2210:putfield        #109 <Field float currentLeading>
			if(((PdfPTable) (obj2)).isLockedWidth())
	//*1057 2213:aload           20
	//*1058 2215:invokevirtual   #848 <Method boolean PdfPTable.isLockedWidth()>
	//*1059 2218:ifeq            2440
			{
				f4 = ((PdfPTable) (obj2)).getTotalWidth();
	// 1060 2221:aload           20
	// 1061 2223:invokevirtual   #851 <Method float PdfPTable.getTotalWidth()>
	// 1062 2226:fstore          5
				updateFilledWidth(f4);
	// 1063 2228:aload_0         
	// 1064 2229:fload           5
	// 1065 2231:invokevirtual   #666 <Method void updateFilledWidth(float)>
			} else
	//*1066 2234:aload           20
	//*1067 2236:invokevirtual   #854 <Method void PdfPTable.normalizeHeadersFooters()>
	//*1068 2239:aload           20
	//*1069 2241:invokevirtual   #842 <Method int PdfPTable.getHeaderRows()>
	//*1070 2244:istore          15
	//*1071 2246:aload           20
	//*1072 2248:invokevirtual   #857 <Method int PdfPTable.getFooterRows()>
	//*1073 2251:istore          14
	//*1074 2253:iload           15
	//*1075 2255:iload           14
	//*1076 2257:isub            
	//*1077 2258:istore          17
	//*1078 2260:aload           20
	//*1079 2262:invokevirtual   #860 <Method float PdfPTable.getFooterHeight()>
	//*1080 2265:fstore          7
	//*1081 2267:aload           20
	//*1082 2269:invokevirtual   #863 <Method float PdfPTable.getHeaderHeight()>
	//*1083 2272:fstore_3        
	//*1084 2273:aload           20
	//*1085 2275:invokevirtual   #866 <Method boolean PdfPTable.isSkipFirstHeader()>
	//*1086 2278:ifeq            2466
	//*1087 2281:aload_0         
	//*1088 2282:getfield        #142 <Field int rowIdx>
	//*1089 2285:iload           17
	//*1090 2287:icmpgt          2466
	//*1091 2290:aload           20
	//*1092 2292:invokevirtual   #869 <Method boolean PdfPTable.isComplete()>
	//*1093 2295:ifne            2307
	//*1094 2298:aload_0         
	//*1095 2299:getfield        #142 <Field int rowIdx>
	//*1096 2302:iload           17
	//*1097 2304:icmpeq          2466
	//*1098 2307:iconst_1        
	//*1099 2308:istore          12
	//*1100 2310:fload           4
	//*1101 2312:fstore_2        
	//*1102 2313:iload           12
	//*1103 2315:ifne            2326
	//*1104 2318:fload           4
	//*1105 2320:fload_3         
	//*1106 2321:fload           7
	//*1107 2323:fsub            
	//*1108 2324:fsub            
	//*1109 2325:fstore_2        
	//*1110 2326:aload_0         
	//*1111 2327:getfield        #142 <Field int rowIdx>
	//*1112 2330:iload           15
	//*1113 2332:icmpge          2341
	//*1114 2335:aload_0         
	//*1115 2336:iload           15
	//*1116 2338:putfield        #142 <Field int rowIdx>
	//*1117 2341:aconst_null     
	//*1118 2342:astore          19
	//*1119 2344:aload           20
	//*1120 2346:invokevirtual   #872 <Method boolean PdfPTable.isSkipLastFooter()>
	//*1121 2349:ifeq            2369
	//*1122 2352:aload           20
	//*1123 2354:fload_2         
	//*1124 2355:aload_0         
	//*1125 2356:getfield        #501 <Field float minY>
	//*1126 2359:fsub            
	//*1127 2360:aload_0         
	//*1128 2361:getfield        #142 <Field int rowIdx>
	//*1129 2364:invokevirtual   #876 <Method PdfPTable$FittingRows PdfPTable.getFittingRows(float, int)>
	//*1130 2367:astore          19
	//*1131 2369:aload           20
	//*1132 2371:invokevirtual   #872 <Method boolean PdfPTable.isSkipLastFooter()>
	//*1133 2374:ifeq            2398
	//*1134 2377:aload           19
	//*1135 2379:astore          21
	//*1136 2381:fload_2         
	//*1137 2382:fstore_3        
	//*1138 2383:aload           19
	//*1139 2385:getfield        #881 <Field int PdfPTable$FittingRows.lastRow>
	//*1140 2388:aload           20
	//*1141 2390:invokevirtual   #839 <Method int PdfPTable.size()>
	//*1142 2393:iconst_1        
	//*1143 2394:isub            
	//*1144 2395:icmpge          2420
	//*1145 2398:fload_2         
	//*1146 2399:fload           7
	//*1147 2401:fsub            
	//*1148 2402:fstore_3        
	//*1149 2403:aload           20
	//*1150 2405:fload_3         
	//*1151 2406:aload_0         
	//*1152 2407:getfield        #501 <Field float minY>
	//*1153 2410:fsub            
	//*1154 2411:aload_0         
	//*1155 2412:getfield        #142 <Field int rowIdx>
	//*1156 2415:invokevirtual   #876 <Method PdfPTable$FittingRows PdfPTable.getFittingRows(float, int)>
	//*1157 2418:astore          21
	//*1158 2420:fload_3         
	//*1159 2421:aload_0         
	//*1160 2422:getfield        #501 <Field float minY>
	//*1161 2425:fcmpg           
	//*1162 2426:iflt            2438
	//*1163 2429:fload_3         
	//*1164 2430:aload_0         
	//*1165 2431:getfield        #499 <Field float maxY>
	//*1166 2434:fcmpl           
	//*1167 2435:ifle            2472
	//*1168 2438:iconst_2        
	//*1169 2439:ireturn         
			{
				f4 = (rectangularWidth * ((PdfPTable) (obj2)).getWidthPercentage()) / 100F;
	// 1170 2440:aload_0         
	// 1171 2441:getfield        #124 <Field float rectangularWidth>
	// 1172 2444:aload           20
	// 1173 2446:invokevirtual   #882 <Method float PdfPTable.getWidthPercentage()>
	// 1174 2449:fmul            
	// 1175 2450:ldc2            #883 <Float 100F>
	// 1176 2453:fdiv            
	// 1177 2454:fstore          5
				((PdfPTable) (obj2)).setTotalWidth(f4);
	// 1178 2456:aload           20
	// 1179 2458:fload           5
	// 1180 2460:invokevirtual   #374 <Method void PdfPTable.setTotalWidth(float)>
			}
			((PdfPTable) (obj2)).normalizeHeadersFooters();
			l3 = ((PdfPTable) (obj2)).getHeaderRows();
			j3 = ((PdfPTable) (obj2)).getFooterRows();
			j4 = l3 - j3;
			f6 = ((PdfPTable) (obj2)).getFooterHeight();
			f2 = ((PdfPTable) (obj2)).getHeaderHeight();
			if(((PdfPTable) (obj2)).isSkipFirstHeader() && rowIdx <= j4 && (((PdfPTable) (obj2)).isComplete() || rowIdx != j4))
				flag1 = true;
			else
	//*1181 2463:goto            2234
				flag1 = false;
	// 1182 2466:iconst_0        
	// 1183 2467:istore          12
			f1 = f3;
			if(!flag1)
				f1 = f3 - (f2 - f6);
			if(rowIdx < l3)
				rowIdx = l3;
			obj = null;
			if(((PdfPTable) (obj2)).isSkipLastFooter())
				obj = ((Object) (((PdfPTable) (obj2)).getFittingRows(f1 - minY, rowIdx)));
			if(((PdfPTable) (obj2)).isSkipLastFooter())
			{
				obj4 = obj;
				f2 = f1;
				if(((PdfPTable.FittingRows) (obj)).lastRow >= ((PdfPTable) (obj2)).size() - 1)
					break label1;
			}
			f2 = f1 - f6;
			obj4 = ((Object) (((PdfPTable) (obj2)).getFittingRows(f2 - minY, rowIdx)));
		}
		int l1;
label2:
		{
			if(f2 < minY || f2 > maxY)
				return 2;
	//*1184 2469:goto            2310
			int l2 = ((PdfPTable.FittingRows) (obj4)).lastRow + 1;
	// 1185 2472:aload           21
	// 1186 2474:getfield        #881 <Field int PdfPTable$FittingRows.lastRow>
	// 1187 2477:iconst_1        
	// 1188 2478:iadd            
	// 1189 2479:istore          13
			f2 -= ((PdfPTable.FittingRows) (obj4)).height;
	// 1190 2481:fload_3         
	// 1191 2482:aload           21
	// 1192 2484:getfield        #885 <Field float PdfPTable$FittingRows.height>
	// 1193 2487:fsub            
	// 1194 2488:fstore_3        
			LOGGER.info((new StringBuilder()).append("Want to split at row ").append(l2).toString());
	// 1195 2489:aload_0         
	// 1196 2490:getfield        #102 <Field Logger LOGGER>
	// 1197 2493:new             #887 <Class StringBuilder>
	// 1198 2496:dup             
	// 1199 2497:invokespecial   #888 <Method void StringBuilder()>
	// 1200 2500:ldc2            #890 <String "Want to split at row ">
	// 1201 2503:invokevirtual   #894 <Method StringBuilder StringBuilder.append(String)>
	// 1202 2506:iload           13
	// 1203 2508:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	// 1204 2511:invokevirtual   #901 <Method String StringBuilder.toString()>
	// 1205 2514:invokeinterface #906 <Method void Logger.info(String)>
			for(l1 = l2; l1 > rowIdx && l1 < ((PdfPTable) (obj2)).size() && ((PdfPTable) (obj2)).getRow(l1).isMayNotBreak(); l1--);
	// 1206 2519:iload           13
	// 1207 2521:istore          11
	// 1208 2523:iload           11
	// 1209 2525:aload_0         
	// 1210 2526:getfield        #142 <Field int rowIdx>
	// 1211 2529:icmple          2564
	// 1212 2532:iload           11
	// 1213 2534:aload           20
	// 1214 2536:invokevirtual   #839 <Method int PdfPTable.size()>
	// 1215 2539:icmpge          2564
	// 1216 2542:aload           20
	// 1217 2544:iload           11
	// 1218 2546:invokevirtual   #910 <Method PdfPRow PdfPTable.getRow(int)>
	// 1219 2549:invokevirtual   #915 <Method boolean PdfPRow.isMayNotBreak()>
	// 1220 2552:ifeq            2564
	// 1221 2555:iload           11
	// 1222 2557:iconst_1        
	// 1223 2558:isub            
	// 1224 2559:istore          11
	//*1225 2561:goto            2523
			l = l1;
	// 1226 2564:iload           11
	// 1227 2566:istore          10
			if(l1 < ((PdfPTable) (obj2)).size() - 1)
	//*1228 2568:iload           11
	//*1229 2570:aload           20
	//*1230 2572:invokevirtual   #839 <Method int PdfPTable.size()>
	//*1231 2575:iconst_1        
	//*1232 2576:isub            
	//*1233 2577:icmpge          2603
			{
				l = l1;
	// 1234 2580:iload           11
	// 1235 2582:istore          10
				if(!((PdfPTable) (obj2)).getRow(l1).isMayNotBreak())
	//*1236 2584:aload           20
	//*1237 2586:iload           11
	//*1238 2588:invokevirtual   #910 <Method PdfPRow PdfPTable.getRow(int)>
	//*1239 2591:invokevirtual   #915 <Method boolean PdfPRow.isMayNotBreak()>
	//*1240 2594:ifne            2603
					l = l1 + 1;
	// 1241 2597:iload           11
	// 1242 2599:iconst_1        
	// 1243 2600:iadd            
	// 1244 2601:istore          10
			}
			if(l <= rowIdx || l >= l2)
	//*1245 2603:iload           10
	//*1246 2605:aload_0         
	//*1247 2606:getfield        #142 <Field int rowIdx>
	//*1248 2609:icmple          2619
	//*1249 2612:iload           10
	//*1250 2614:iload           13
	//*1251 2616:icmplt          2665
			{
				l1 = l2;
	// 1252 2619:iload           13
	// 1253 2621:istore          11
				f1 = f2;
	// 1254 2623:fload_3         
	// 1255 2624:fstore_2        
				if(l != l3)
					break label2;
	// 1256 2625:iload           10
	// 1257 2627:iload           15
	// 1258 2629:icmpne          2680
				l1 = l2;
	// 1259 2632:iload           13
	// 1260 2634:istore          11
				f1 = f2;
	// 1261 2636:fload_3         
	// 1262 2637:fstore_2        
				if(!((PdfPTable) (obj2)).getRow(l3).isMayNotBreak())
					break label2;
	// 1263 2638:aload           20
	// 1264 2640:iload           15
	// 1265 2642:invokevirtual   #910 <Method PdfPRow PdfPTable.getRow(int)>
	// 1266 2645:invokevirtual   #915 <Method boolean PdfPRow.isMayNotBreak()>
	// 1267 2648:ifeq            2680
				l1 = l2;
	// 1268 2651:iload           13
	// 1269 2653:istore          11
				f1 = f2;
	// 1270 2655:fload_3         
	// 1271 2656:fstore_2        
				if(!((PdfPTable) (obj2)).isLoopCheck())
					break label2;
	// 1272 2657:aload           20
	// 1273 2659:invokevirtual   #918 <Method boolean PdfPTable.isLoopCheck()>
	// 1274 2662:ifeq            2680
			}
			f1 = minY;
	// 1275 2665:aload_0         
	// 1276 2666:getfield        #501 <Field float minY>
	// 1277 2669:fstore_2        
			((PdfPTable) (obj2)).setLoopCheck(false);
	// 1278 2670:aload           20
	// 1279 2672:iconst_0        
	// 1280 2673:invokevirtual   #921 <Method void PdfPTable.setLoopCheck(boolean)>
			l1 = l;
	// 1281 2676:iload           10
	// 1282 2678:istore          11
		}
		LOGGER.info((new StringBuilder()).append("Will split at row ").append(l1).toString());
	// 1283 2680:aload_0         
	// 1284 2681:getfield        #102 <Field Logger LOGGER>
	// 1285 2684:new             #887 <Class StringBuilder>
	// 1286 2687:dup             
	// 1287 2688:invokespecial   #888 <Method void StringBuilder()>
	// 1288 2691:ldc2            #923 <String "Will split at row ">
	// 1289 2694:invokevirtual   #894 <Method StringBuilder StringBuilder.append(String)>
	// 1290 2697:iload           11
	// 1291 2699:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	// 1292 2702:invokevirtual   #901 <Method String StringBuilder.toString()>
	// 1293 2705:invokeinterface #906 <Method void Logger.info(String)>
		if(((PdfPTable) (obj2)).isSplitLate() && l1 > 0)
	//*1294 2710:aload           20
	//*1295 2712:invokevirtual   #926 <Method boolean PdfPTable.isSplitLate()>
	//*1296 2715:ifeq            2734
	//*1297 2718:iload           11
	//*1298 2720:ifle            2734
			((PdfPTable.FittingRows) (obj4)).correctLastRowChosen(((PdfPTable) (obj2)), l1 - 1);
	// 1299 2723:aload           21
	// 1300 2725:aload           20
	// 1301 2727:iload           11
	// 1302 2729:iconst_1        
	// 1303 2730:isub            
	// 1304 2731:invokevirtual   #930 <Method void PdfPTable$FittingRows.correctLastRowChosen(PdfPTable, int)>
		f2 = f1;
	// 1305 2734:fload_2         
	// 1306 2735:fstore_3        
		if(!((PdfPTable) (obj2)).isComplete())
	//*1307 2736:aload           20
	//*1308 2738:invokevirtual   #869 <Method boolean PdfPTable.isComplete()>
	//*1309 2741:ifne            2749
			f2 = f1 + f6;
	// 1310 2744:fload_2         
	// 1311 2745:fload           7
	// 1312 2747:fadd            
	// 1313 2748:fstore_3        
		boolean flag6;
		Object obj6;
		if(!((PdfPTable) (obj2)).isSplitRows())
	//*1314 2749:aload           20
	//*1315 2751:invokevirtual   #933 <Method boolean PdfPTable.isSplitRows()>
	//*1316 2754:ifne            2829
		{
			splittedRow = -1;
	// 1317 2757:aload_0         
	// 1318 2758:iconst_m1       
	// 1319 2759:putfield        #144 <Field int splittedRow>
			l = l1;
	// 1320 2762:iload           11
	// 1321 2764:istore          10
			obj = obj2;
	// 1322 2766:aload           20
	// 1323 2768:astore          19
			f1 = f2;
	// 1324 2770:fload_3         
	// 1325 2771:fstore_2        
			if(l1 == rowIdx)
	//*1326 2772:iload           11
	//*1327 2774:aload_0         
	//*1328 2775:getfield        #142 <Field int rowIdx>
	//*1329 2778:icmpne          2886
			{
				if(l1 == ((PdfPTable) (obj2)).size())
	//*1330 2781:iload           11
	//*1331 2783:aload           20
	//*1332 2785:invokevirtual   #839 <Method int PdfPTable.size()>
	//*1333 2788:icmpne          2802
				{
					compositeElements.removeFirst();
	// 1334 2791:aload_0         
	// 1335 2792:getfield        #465 <Field LinkedList compositeElements>
	// 1336 2795:invokevirtual   #780 <Method Object LinkedList.removeFirst()>
	// 1337 2798:pop             
				} else
	//*1338 2799:goto            65
				{
					if(((PdfPTable) (obj2)).isComplete() || l1 != 1)
	//*1339 2802:aload           20
	//*1340 2804:invokevirtual   #869 <Method boolean PdfPTable.isComplete()>
	//*1341 2807:ifne            2816
	//*1342 2810:iload           11
	//*1343 2812:iconst_1        
	//*1344 2813:icmpeq          2827
						((PdfPTable) (obj2)).getRows().remove(l1);
	// 1345 2816:aload           20
	// 1346 2818:invokevirtual   #936 <Method ArrayList PdfPTable.getRows()>
	// 1347 2821:iload           11
	// 1348 2823:invokevirtual   #939 <Method Object ArrayList.remove(int)>
	// 1349 2826:pop             
					return 2;
	// 1350 2827:iconst_2        
	// 1351 2828:ireturn         
				}
				continue; /* Loop/switch isn't completed */
			}
		} else
		if(((PdfPTable) (obj2)).isSplitLate() && (rowIdx < l1 || splittedRow == -2 && (((PdfPTable) (obj2)).getHeaderRows() == 0 || ((PdfPTable) (obj2)).isSkipFirstHeader())))
	//*1352 2829:aload           20
	//*1353 2831:invokevirtual   #926 <Method boolean PdfPTable.isSplitLate()>
	//*1354 2834:ifeq            3613
	//*1355 2837:aload_0         
	//*1356 2838:getfield        #142 <Field int rowIdx>
	//*1357 2841:iload           11
	//*1358 2843:icmplt          2871
	//*1359 2846:aload_0         
	//*1360 2847:getfield        #144 <Field int splittedRow>
	//*1361 2850:bipush          -2
	//*1362 2852:icmpne          3613
	//*1363 2855:aload           20
	//*1364 2857:invokevirtual   #842 <Method int PdfPTable.getHeaderRows()>
	//*1365 2860:ifeq            2871
	//*1366 2863:aload           20
	//*1367 2865:invokevirtual   #866 <Method boolean PdfPTable.isSkipFirstHeader()>
	//*1368 2868:ifeq            3613
		{
			splittedRow = -1;
	// 1369 2871:aload_0         
	// 1370 2872:iconst_m1       
	// 1371 2873:putfield        #144 <Field int splittedRow>
			f1 = f2;
	// 1372 2876:fload_3         
	// 1373 2877:fstore_2        
			obj = obj2;
	// 1374 2878:aload           20
	// 1375 2880:astore          19
			l = l1;
	// 1376 2882:iload           11
	// 1377 2884:istore          10
		} else
	//*1378 2886:iconst_0        
	//*1379 2887:istore          11
	//*1380 2889:iload_1         
	//*1381 2890:ifne            4010
	//*1382 2893:aload           19
	//*1383 2895:invokevirtual   #942 <Method int PdfPTable.getHorizontalAlignment()>
	//*1384 2898:tableswitch     1 2: default 2920
	//	               1 3875
	//	               2 3853
	//*1385 2920:fload           6
	//*1386 2922:fstore_3        
	//*1387 2923:iload           9
	//*1388 2925:ifeq            2939
	//*1389 2928:fload           6
	//*1390 2930:aload_0         
	//*1391 2931:getfield        #124 <Field float rectangularWidth>
	//*1392 2934:fload           5
	//*1393 2936:fsub            
	//*1394 2937:fadd            
	//*1395 2938:fstore_3        
	//*1396 2939:aload           19
	//*1397 2941:invokestatic    #946 <Method PdfPTable PdfPTable.shallowCopy(PdfPTable)>
	//*1398 2944:astore          20
	//*1399 2946:aload           20
	//*1400 2948:invokevirtual   #936 <Method ArrayList PdfPTable.getRows()>
	//*1401 2951:astore          21
	//*1402 2953:iload           12
	//*1403 2955:ifne            3891
	//*1404 2958:iload           17
	//*1405 2960:ifle            3891
	//*1406 2963:aload           19
	//*1407 2965:iconst_0        
	//*1408 2966:iload           17
	//*1409 2968:invokevirtual   #949 <Method ArrayList PdfPTable.getRows(int, int)>
	//*1410 2971:astore          22
	//*1411 2973:aload_0         
	//*1412 2974:getfield        #154 <Field PdfContentByte canvas>
	//*1413 2977:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//*1414 2980:ifeq            2993
	//*1415 2983:aload           20
	//*1416 2985:invokevirtual   #953 <Method PdfPTableHeader PdfPTable.getHeader()>
	//*1417 2988:aload           22
	//*1418 2990:putfield        #958 <Field ArrayList PdfPTableHeader.rows>
	//*1419 2993:aload           21
	//*1420 2995:aload           22
	//*1421 2997:invokevirtual   #959 <Method boolean ArrayList.addAll(java.util.Collection)>
	//*1422 3000:pop             
	//*1423 3001:aload           19
	//*1424 3003:aload_0         
	//*1425 3004:getfield        #142 <Field int rowIdx>
	//*1426 3007:iload           10
	//*1427 3009:invokevirtual   #949 <Method ArrayList PdfPTable.getRows(int, int)>
	//*1428 3012:astore          22
	//*1429 3014:aload_0         
	//*1430 3015:getfield        #154 <Field PdfContentByte canvas>
	//*1431 3018:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//*1432 3021:ifeq            3034
	//*1433 3024:aload           20
	//*1434 3026:invokevirtual   #963 <Method PdfPTableBody PdfPTable.getBody()>
	//*1435 3029:aload           22
	//*1436 3031:putfield        #966 <Field ArrayList PdfPTableBody.rows>
	//*1437 3034:aload           21
	//*1438 3036:aload           22
	//*1439 3038:invokevirtual   #959 <Method boolean ArrayList.addAll(java.util.Collection)>
	//*1440 3041:pop             
	//*1441 3042:aload           19
	//*1442 3044:invokevirtual   #872 <Method boolean PdfPTable.isSkipLastFooter()>
	//*1443 3047:ifne            3901
	//*1444 3050:iconst_1        
	//*1445 3051:istore          8
	//*1446 3053:iconst_0        
	//*1447 3054:istore          18
	//*1448 3056:iload           10
	//*1449 3058:aload           19
	//*1450 3060:invokevirtual   #839 <Method int PdfPTable.size()>
	//*1451 3063:icmpge          3078
	//*1452 3066:aload           20
	//*1453 3068:iconst_1        
	//*1454 3069:invokevirtual   #969 <Method void PdfPTable.setComplete(boolean)>
	//*1455 3072:iconst_1        
	//*1456 3073:istore          8
	//*1457 3075:iconst_1        
	//*1458 3076:istore          18
	//*1459 3078:iload           14
	//*1460 3080:ifle            3907
	//*1461 3083:aload           20
	//*1462 3085:invokevirtual   #869 <Method boolean PdfPTable.isComplete()>
	//*1463 3088:ifeq            3907
	//*1464 3091:iload           8
	//*1465 3093:ifeq            3907
	//*1466 3096:aload           19
	//*1467 3098:iload           17
	//*1468 3100:iload           17
	//*1469 3102:iload           14
	//*1470 3104:iadd            
	//*1471 3105:invokevirtual   #949 <Method ArrayList PdfPTable.getRows(int, int)>
	//*1472 3108:astore          22
	//*1473 3110:aload_0         
	//*1474 3111:getfield        #154 <Field PdfContentByte canvas>
	//*1475 3114:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//*1476 3117:ifeq            3130
	//*1477 3120:aload           20
	//*1478 3122:invokevirtual   #973 <Method PdfPTableFooter PdfPTable.getFooter()>
	//*1479 3125:aload           22
	//*1480 3127:putfield        #976 <Field ArrayList PdfPTableFooter.rows>
	//*1481 3130:aload           21
	//*1482 3132:aload           22
	//*1483 3134:invokevirtual   #959 <Method boolean ArrayList.addAll(java.util.Collection)>
	//*1484 3137:pop             
	//*1485 3138:iload           14
	//*1486 3140:istore          8
	//*1487 3142:fload_2         
	//*1488 3143:fstore          6
	//*1489 3145:aload           21
	//*1490 3147:invokevirtual   #523 <Method int ArrayList.size()>
	//*1491 3150:ifle            3451
	//*1492 3153:fconst_0        
	//*1493 3154:fstore          6
	//*1494 3156:aload           21
	//*1495 3158:invokevirtual   #523 <Method int ArrayList.size()>
	//*1496 3161:iconst_1        
	//*1497 3162:isub            
	//*1498 3163:iload           8
	//*1499 3165:isub            
	//*1500 3166:istore          8
	//*1501 3168:aload           21
	//*1502 3170:iload           8
	//*1503 3172:invokevirtual   #527 <Method Object ArrayList.get(int)>
	//*1504 3175:checkcast       #912 <Class PdfPRow>
	//*1505 3178:astore          21
	//*1506 3180:fload_2         
	//*1507 3181:fstore          5
	//*1508 3183:aload           19
	//*1509 3185:iload           18
	//*1510 3187:invokevirtual   #980 <Method boolean PdfPTable.isExtendLastRow(boolean)>
	//*1511 3190:ifeq            3220
	//*1512 3193:aload           21
	//*1513 3195:invokevirtual   #983 <Method float PdfPRow.getMaxHeights()>
	//*1514 3198:fstore          6
	//*1515 3200:aload           21
	//*1516 3202:fload_2         
	//*1517 3203:aload_0         
	//*1518 3204:getfield        #501 <Field float minY>
	//*1519 3207:fsub            
	//*1520 3208:fload           6
	//*1521 3210:fadd            
	//*1522 3211:invokevirtual   #986 <Method void PdfPRow.setMaxHeights(float)>
	//*1523 3214:aload_0         
	//*1524 3215:getfield        #501 <Field float minY>
	//*1525 3218:fstore          5
	//*1526 3220:iload           18
	//*1527 3222:ifeq            3252
	//*1528 3225:aload           19
	//*1529 3227:invokevirtual   #990 <Method PdfPTableEvent PdfPTable.getTableEvent()>
	//*1530 3230:astore          22
	//*1531 3232:aload           22
	//*1532 3234:instanceof      #992 <Class PdfPTableEventSplit>
	//*1533 3237:ifeq            3252
	//*1534 3240:aload           22
	//*1535 3242:checkcast       #992 <Class PdfPTableEventSplit>
	//*1536 3245:aload           19
	//*1537 3247:invokeinterface #996 <Method void PdfPTableEventSplit.splitTable(PdfPTable)>
	//*1538 3252:aload_0         
	//*1539 3253:getfield        #540 <Field PdfContentByte[] canvases>
	//*1540 3256:ifnull          3913
	//*1541 3259:aload_0         
	//*1542 3260:getfield        #540 <Field PdfContentByte[] canvases>
	//*1543 3263:iconst_3        
	//*1544 3264:aaload          
	//*1545 3265:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//*1546 3268:ifeq            3282
	//*1547 3271:aload_0         
	//*1548 3272:getfield        #540 <Field PdfContentByte[] canvases>
	//*1549 3275:iconst_3        
	//*1550 3276:aaload          
	//*1551 3277:aload           19
	//*1552 3279:invokevirtual   #674 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
	//*1553 3282:aload           20
	//*1554 3284:iconst_0        
	//*1555 3285:iconst_m1       
	//*1556 3286:iconst_0        
	//*1557 3287:iconst_m1       
	//*1558 3288:fload_3         
	//*1559 3289:fload           4
	//*1560 3291:aload_0         
	//*1561 3292:getfield        #540 <Field PdfContentByte[] canvases>
	//*1562 3295:iconst_0        
	//*1563 3296:invokevirtual   #1000 <Method float PdfPTable.writeSelectedRows(int, int, int, int, float, float, PdfContentByte[], boolean)>
	//*1564 3299:pop             
	//*1565 3300:aload_0         
	//*1566 3301:getfield        #540 <Field PdfContentByte[] canvases>
	//*1567 3304:iconst_3        
	//*1568 3305:aaload          
	//*1569 3306:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//*1570 3309:ifeq            3323
	//*1571 3312:aload_0         
	//*1572 3313:getfield        #540 <Field PdfContentByte[] canvases>
	//*1573 3316:iconst_3        
	//*1574 3317:aaload          
	//*1575 3318:aload           19
	//*1576 3320:invokevirtual   #692 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
	//*1577 3323:aload           19
	//*1578 3325:invokevirtual   #869 <Method boolean PdfPTable.isComplete()>
	//*1579 3328:ifne            3338
	//*1580 3331:aload           19
	//*1581 3333:iload           10
	//*1582 3335:invokevirtual   #1003 <Method void PdfPTable.addNumberOfRowsWritten(int)>
	//*1583 3338:aload_0         
	//*1584 3339:getfield        #144 <Field int splittedRow>
	//*1585 3342:iload           10
	//*1586 3344:icmpne          3972
	//*1587 3347:iload           10
	//*1588 3349:aload           19
	//*1589 3351:invokevirtual   #839 <Method int PdfPTable.size()>
	//*1590 3354:icmpge          3972
	//*1591 3357:aload           19
	//*1592 3359:invokevirtual   #936 <Method ArrayList PdfPTable.getRows()>
	//*1593 3362:iload           10
	//*1594 3364:invokevirtual   #527 <Method Object ArrayList.get(int)>
	//*1595 3367:checkcast       #912 <Class PdfPRow>
	//*1596 3370:aload           20
	//*1597 3372:iload           8
	//*1598 3374:invokevirtual   #1006 <Method void PdfPRow.copyRowContent(PdfPTable, int)>
	//*1599 3377:aload           19
	//*1600 3379:iload           18
	//*1601 3381:invokevirtual   #980 <Method boolean PdfPTable.isExtendLastRow(boolean)>
	//*1602 3384:ifeq            3394
	//*1603 3387:aload           21
	//*1604 3389:fload           6
	//*1605 3391:invokevirtual   #986 <Method void PdfPRow.setMaxHeights(float)>
	//*1606 3394:fload           5
	//*1607 3396:fstore          6
	//*1608 3398:iload           18
	//*1609 3400:ifeq            3451
	//*1610 3403:aload           19
	//*1611 3405:invokevirtual   #990 <Method PdfPTableEvent PdfPTable.getTableEvent()>
	//*1612 3408:astore          20
	//*1613 3410:fload           5
	//*1614 3412:fstore          6
	//*1615 3414:aload           20
	//*1616 3416:instanceof      #1008 <Class PdfPTableEventAfterSplit>
	//*1617 3419:ifeq            3451
	//*1618 3422:aload           19
	//*1619 3424:iload           10
	//*1620 3426:invokevirtual   #910 <Method PdfPRow PdfPTable.getRow(int)>
	//*1621 3429:astore          21
	//*1622 3431:aload           20
	//*1623 3433:checkcast       #1008 <Class PdfPTableEventAfterSplit>
	//*1624 3436:aload           19
	//*1625 3438:aload           21
	//*1626 3440:iload           10
	//*1627 3442:invokeinterface #1012 <Method void PdfPTableEventAfterSplit.afterSplitTable(PdfPTable, PdfPRow, int)>
	//*1628 3447:fload           5
	//*1629 3449:fstore          6
	//*1630 3451:aload_0         
	//*1631 3452:fload           6
	//*1632 3454:putfield        #520 <Field float yLine>
	//*1633 3457:aload_0         
	//*1634 3458:fconst_0        
	//*1635 3459:putfield        #546 <Field float descender>
	//*1636 3462:aload_0         
	//*1637 3463:fconst_0        
	//*1638 3464:putfield        #109 <Field float currentLeading>
	//*1639 3467:iload           10
	//*1640 3469:istore          8
	//*1641 3471:iload           12
	//*1642 3473:ifne            3503
	//*1643 3476:iload           10
	//*1644 3478:istore          8
	//*1645 3480:aload           19
	//*1646 3482:invokevirtual   #869 <Method boolean PdfPTable.isComplete()>
	//*1647 3485:ifne            3503
	//*1648 3488:aload_0         
	//*1649 3489:aload_0         
	//*1650 3490:getfield        #520 <Field float yLine>
	//*1651 3493:fload           7
	//*1652 3495:fadd            
	//*1653 3496:putfield        #520 <Field float yLine>
	//*1654 3499:iload           10
	//*1655 3501:istore          8
	//*1656 3503:iload           8
	//*1657 3505:aload           19
	//*1658 3507:invokevirtual   #839 <Method int PdfPTable.size()>
	//*1659 3510:icmpge          3535
	//*1660 3513:aload           19
	//*1661 3515:iload           8
	//*1662 3517:invokevirtual   #1016 <Method float PdfPTable.getRowHeight(int)>
	//*1663 3520:fconst_0        
	//*1664 3521:fcmpl           
	//*1665 3522:ifgt            3535
	//*1666 3525:aload           19
	//*1667 3527:iload           8
	//*1668 3529:invokevirtual   #1019 <Method boolean PdfPTable.hasRowspan(int)>
	//*1669 3532:ifeq            4044
	//*1670 3535:iload           8
	//*1671 3537:aload           19
	//*1672 3539:invokevirtual   #839 <Method int PdfPTable.size()>
	//*1673 3542:icmplt          4070
	//*1674 3545:aload_0         
	//*1675 3546:getfield        #520 <Field float yLine>
	//*1676 3549:aload           19
	//*1677 3551:invokevirtual   #1022 <Method float PdfPTable.spacingAfter()>
	//*1678 3554:fsub            
	//*1679 3555:aload_0         
	//*1680 3556:getfield        #501 <Field float minY>
	//*1681 3559:fcmpg           
	//*1682 3560:ifge            4053
	//*1683 3563:aload_0         
	//*1684 3564:aload_0         
	//*1685 3565:getfield        #501 <Field float minY>
	//*1686 3568:putfield        #520 <Field float yLine>
	//*1687 3571:aload_0         
	//*1688 3572:getfield        #465 <Field LinkedList compositeElements>
	//*1689 3575:invokevirtual   #780 <Method Object LinkedList.removeFirst()>
	//*1690 3578:pop             
	//*1691 3579:aload_0         
	//*1692 3580:iconst_m1       
	//*1693 3581:putfield        #144 <Field int splittedRow>
	//*1694 3584:aload_0         
	//*1695 3585:iconst_0        
	//*1696 3586:putfield        #142 <Field int rowIdx>
	//*1697 3589:aload_0         
	//*1698 3590:iload           16
	//*1699 3592:putfield        #104 <Field int runDirection>
	//*1700 3595:aload_0         
	//*1701 3596:getfield        #104 <Field int runDirection>
	//*1702 3599:iconst_3        
	//*1703 3600:icmpne          4124
	//*1704 3603:iconst_1        
	//*1705 3604:istore          9
	//*1706 3606:iload           11
	//*1707 3608:istore          8
	//*1708 3610:goto            65
		{
			l = l1;
	// 1709 3613:iload           11
	// 1710 3615:istore          10
			obj = obj2;
	// 1711 3617:aload           20
	// 1712 3619:astore          19
			f1 = f2;
	// 1713 3621:fload_3         
	// 1714 3622:fstore_2        
			if(l1 < ((PdfPTable) (obj2)).size())
	//*1715 3623:iload           11
	//*1716 3625:aload           20
	//*1717 3627:invokevirtual   #839 <Method int PdfPTable.size()>
	//*1718 3630:icmpge          2886
			{
				f1 = f2 - (((PdfPTable.FittingRows) (obj4)).completedRowsHeight - ((PdfPTable.FittingRows) (obj4)).height);
	// 1719 3633:fload_3         
	// 1720 3634:aload           21
	// 1721 3636:getfield        #1025 <Field float PdfPTable$FittingRows.completedRowsHeight>
	// 1722 3639:aload           21
	// 1723 3641:getfield        #885 <Field float PdfPTable$FittingRows.height>
	// 1724 3644:fsub            
	// 1725 3645:fsub            
	// 1726 3646:fstore_2        
				f2 = minY;
	// 1727 3647:aload_0         
	// 1728 3648:getfield        #501 <Field float minY>
	// 1729 3651:fstore_3        
				obj4 = ((Object) (((PdfPTable) (obj2)).getRow(l1).splitRow(((PdfPTable) (obj2)), l1, f1 - f2)));
	// 1730 3652:aload           20
	// 1731 3654:iload           11
	// 1732 3656:invokevirtual   #910 <Method PdfPRow PdfPTable.getRow(int)>
	// 1733 3659:aload           20
	// 1734 3661:iload           11
	// 1735 3663:fload_2         
	// 1736 3664:fload_3         
	// 1737 3665:fsub            
	// 1738 3666:invokevirtual   #1029 <Method PdfPRow PdfPRow.splitRow(PdfPTable, int, float)>
	// 1739 3669:astore          21
				if(obj4 == null)
	//*1740 3671:aload           21
	//*1741 3673:ifnonnull       3712
				{
					LOGGER.info("Didn't split row!");
	// 1742 3676:aload_0         
	// 1743 3677:getfield        #102 <Field Logger LOGGER>
	// 1744 3680:ldc2            #1031 <String "Didn't split row!">
	// 1745 3683:invokeinterface #906 <Method void Logger.info(String)>
					splittedRow = -1;
	// 1746 3688:aload_0         
	// 1747 3689:iconst_m1       
	// 1748 3690:putfield        #144 <Field int splittedRow>
					l = l1;
	// 1749 3693:iload           11
	// 1750 3695:istore          10
					obj = obj2;
	// 1751 3697:aload           20
	// 1752 3699:astore          19
					if(rowIdx == l1)
	//*1753 3701:aload_0         
	//*1754 3702:getfield        #142 <Field int rowIdx>
	//*1755 3705:iload           11
	//*1756 3707:icmpne          2886
						return 2;
	// 1757 3710:iconst_2        
	// 1758 3711:ireturn         
				} else
				{
					obj = obj2;
	// 1759 3712:aload           20
	// 1760 3714:astore          19
					if(l1 != splittedRow)
	//*1761 3716:iload           11
	//*1762 3718:aload_0         
	//*1763 3719:getfield        #144 <Field int splittedRow>
	//*1764 3722:icmpeq          3793
					{
						splittedRow = l1 + 1;
	// 1765 3725:aload_0         
	// 1766 3726:iload           11
	// 1767 3728:iconst_1        
	// 1768 3729:iadd            
	// 1769 3730:putfield        #144 <Field int splittedRow>
						obj = ((Object) (new PdfPTable(((PdfPTable) (obj2)))));
	// 1770 3733:new             #363 <Class PdfPTable>
	// 1771 3736:dup             
	// 1772 3737:aload           20
	// 1773 3739:invokespecial   #1033 <Method void PdfPTable(PdfPTable)>
	// 1774 3742:astore          19
						compositeElements.set(0, obj);
	// 1775 3744:aload_0         
	// 1776 3745:getfield        #465 <Field LinkedList compositeElements>
	// 1777 3748:iconst_0        
	// 1778 3749:aload           19
	// 1779 3751:invokevirtual   #1037 <Method Object LinkedList.set(int, Object)>
	// 1780 3754:pop             
						obj2 = ((Object) (((PdfPTable) (obj)).getRows()));
	// 1781 3755:aload           19
	// 1782 3757:invokevirtual   #936 <Method ArrayList PdfPTable.getRows()>
	// 1783 3760:astore          20
						for(i = l3; i < rowIdx; i++)
	//*1784 3762:iload           15
	//*1785 3764:istore          8
	//*1786 3766:iload           8
	//*1787 3768:aload_0         
	//*1788 3769:getfield        #142 <Field int rowIdx>
	//*1789 3772:icmpge          3793
							((ArrayList) (obj2)).set(i, ((Object) (null)));
	// 1790 3775:aload           20
	// 1791 3777:iload           8
	// 1792 3779:aconst_null     
	// 1793 3780:invokevirtual   #1038 <Method Object ArrayList.set(int, Object)>
	// 1794 3783:pop             

	// 1795 3784:iload           8
	// 1796 3786:iconst_1        
	// 1797 3787:iadd            
	// 1798 3788:istore          8
					}
	//*1799 3790:goto            3766
					f1 = minY;
	// 1800 3793:aload_0         
	// 1801 3794:getfield        #501 <Field float minY>
	// 1802 3797:fstore_2        
					obj2 = ((Object) (((PdfPTable) (obj)).getRows()));
	// 1803 3798:aload           19
	// 1804 3800:invokevirtual   #936 <Method ArrayList PdfPTable.getRows()>
	// 1805 3803:astore          20
					l = l1 + 1;
	// 1806 3805:iload           11
	// 1807 3807:iconst_1        
	// 1808 3808:iadd            
	// 1809 3809:istore          10
					((ArrayList) (obj2)).add(l, obj4);
	// 1810 3811:aload           20
	// 1811 3813:iload           10
	// 1812 3815:aload           21
	// 1813 3817:invokevirtual   #1041 <Method void ArrayList.add(int, Object)>
					LOGGER.info((new StringBuilder()).append("Inserting row at position ").append(l).toString());
	// 1814 3820:aload_0         
	// 1815 3821:getfield        #102 <Field Logger LOGGER>
	// 1816 3824:new             #887 <Class StringBuilder>
	// 1817 3827:dup             
	// 1818 3828:invokespecial   #888 <Method void StringBuilder()>
	// 1819 3831:ldc2            #1043 <String "Inserting row at position ">
	// 1820 3834:invokevirtual   #894 <Method StringBuilder StringBuilder.append(String)>
	// 1821 3837:iload           10
	// 1822 3839:invokevirtual   #897 <Method StringBuilder StringBuilder.append(int)>
	// 1823 3842:invokevirtual   #901 <Method String StringBuilder.toString()>
	// 1824 3845:invokeinterface #906 <Method void Logger.info(String)>
				}
			}
		}
		l1 = 0;
		if(flag) goto _L21; else goto _L20
_L20:
		((PdfPTable) (obj)).getHorizontalAlignment();
		JVM INSTR tableswitch 1 2: default 2920
	//	               1 3875
	//	               2 3853;
		   goto _L22 _L23 _L24
_L22:
		f2 = f5;
		if(j != 0)
			f2 = f5 + (rectangularWidth - f4);
_L25:
		obj2 = ((Object) (PdfPTable.shallowCopy(((PdfPTable) (obj)))));
		obj4 = ((Object) (((PdfPTable) (obj2)).getRows()));
		if(!flag1 && j4 > 0)
		{
			obj6 = ((Object) (((PdfPTable) (obj)).getRows(0, j4)));
			if(isTagged(canvas))
				((PdfPTable) (obj2)).getHeader().rows = ((ArrayList) (obj6));
			((ArrayList) (obj4)).addAll(((java.util.Collection) (obj6)));
		} else
	//*1825 3850:goto            2886
	//*1826 3853:fload           6
	//*1827 3855:fstore_3        
	//*1828 3856:iload           9
	//*1829 3858:ifne            2939
	//*1830 3861:fload           6
	//*1831 3863:aload_0         
	//*1832 3864:getfield        #124 <Field float rectangularWidth>
	//*1833 3867:fload           5
	//*1834 3869:fsub            
	//*1835 3870:fadd            
	//*1836 3871:fstore_3        
	//*1837 3872:goto            2939
	//*1838 3875:fload           6
	//*1839 3877:aload_0         
	//*1840 3878:getfield        #124 <Field float rectangularWidth>
	//*1841 3881:fload           5
	//*1842 3883:fsub            
	//*1843 3884:fconst_2        
	//*1844 3885:fdiv            
	//*1845 3886:fadd            
	//*1846 3887:fstore_3        
	//*1847 3888:goto            2939
		{
			((PdfPTable) (obj2)).setHeaderRows(j3);
	// 1848 3891:aload           20
	// 1849 3893:iload           14
	// 1850 3895:invokevirtual   #1046 <Method void PdfPTable.setHeaderRows(int)>
		}
		obj6 = ((Object) (((PdfPTable) (obj)).getRows(rowIdx, l)));
		if(isTagged(canvas))
			((PdfPTable) (obj2)).getBody().rows = ((ArrayList) (obj6));
		((ArrayList) (obj4)).addAll(((java.util.Collection) (obj6)));
		if(!((PdfPTable) (obj)).isSkipLastFooter())
			i = 1;
		else
	//*1851 3898:goto            3001
			i = 0;
	// 1852 3901:iconst_0        
	// 1853 3902:istore          8
		flag6 = false;
		if(l < ((PdfPTable) (obj)).size())
		{
			((PdfPTable) (obj2)).setComplete(true);
			i = 1;
			flag6 = true;
		}
		if(j3 > 0 && ((PdfPTable) (obj2)).isComplete() && i != 0)
		{
			obj6 = ((Object) (((PdfPTable) (obj)).getRows(j4, j4 + j3)));
			if(isTagged(canvas))
				((PdfPTable) (obj2)).getFooter().rows = ((ArrayList) (obj6));
			((ArrayList) (obj4)).addAll(((java.util.Collection) (obj6)));
			i = j3;
		} else
	//*1854 3904:goto            3053
		{
			i = 0;
	// 1855 3907:iconst_0        
	// 1856 3908:istore          8
		}
		f5 = f1;
		if(((ArrayList) (obj4)).size() > 0)
		{
			f5 = 0.0F;
			i = ((ArrayList) (obj4)).size() - 1 - i;
			obj4 = ((Object) ((PdfPRow)((ArrayList) (obj4)).get(i)));
			f4 = f1;
			if(((PdfPTable) (obj)).isExtendLastRow(flag6))
			{
				f5 = ((PdfPRow) (obj4)).getMaxHeights();
				((PdfPRow) (obj4)).setMaxHeights((f1 - minY) + f5);
				f4 = minY;
			}
			if(flag6)
			{
				obj6 = ((Object) (((PdfPTable) (obj)).getTableEvent()));
				if(obj6 instanceof PdfPTableEventSplit)
					((PdfPTableEventSplit)obj6).splitTable(((PdfPTable) (obj)));
			}
			if(canvases != null)
			{
				if(isTagged(canvases[3]))
					canvases[3].openMCBlock(((IAccessibleElement) (obj)));
				((PdfPTable) (obj2)).writeSelectedRows(0, -1, 0, -1, f2, f3, canvases, false);
				if(isTagged(canvases[3]))
					canvases[3].closeMCBlock(((IAccessibleElement) (obj)));
			} else
	//*1857 3910:goto            3142
			{
				if(isTagged(canvas))
	//*1858 3913:aload_0         
	//*1859 3914:getfield        #154 <Field PdfContentByte canvas>
	//*1860 3917:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//*1861 3920:ifeq            3932
					canvas.openMCBlock(((IAccessibleElement) (obj)));
	// 1862 3923:aload_0         
	// 1863 3924:getfield        #154 <Field PdfContentByte canvas>
	// 1864 3927:aload           19
	// 1865 3929:invokevirtual   #674 <Method void PdfContentByte.openMCBlock(IAccessibleElement)>
				((PdfPTable) (obj2)).writeSelectedRows(0, -1, 0, -1, f2, f3, canvas, false);
	// 1866 3932:aload           20
	// 1867 3934:iconst_0        
	// 1868 3935:iconst_m1       
	// 1869 3936:iconst_0        
	// 1870 3937:iconst_m1       
	// 1871 3938:fload_3         
	// 1872 3939:fload           4
	// 1873 3941:aload_0         
	// 1874 3942:getfield        #154 <Field PdfContentByte canvas>
	// 1875 3945:iconst_0        
	// 1876 3946:invokevirtual   #1049 <Method float PdfPTable.writeSelectedRows(int, int, int, int, float, float, PdfContentByte, boolean)>
	// 1877 3949:pop             
				if(isTagged(canvas))
	//*1878 3950:aload_0         
	//*1879 3951:getfield        #154 <Field PdfContentByte canvas>
	//*1880 3954:invokestatic    #577 <Method boolean isTagged(PdfContentByte)>
	//*1881 3957:ifeq            3323
					canvas.closeMCBlock(((IAccessibleElement) (obj)));
	// 1882 3960:aload_0         
	// 1883 3961:getfield        #154 <Field PdfContentByte canvas>
	// 1884 3964:aload           19
	// 1885 3966:invokevirtual   #692 <Method void PdfContentByte.closeMCBlock(IAccessibleElement)>
			}
			if(!((PdfPTable) (obj)).isComplete())
				((PdfPTable) (obj)).addNumberOfRowsWritten(l);
			if(splittedRow == l && l < ((PdfPTable) (obj)).size())
				((PdfPRow)((PdfPTable) (obj)).getRows().get(l)).copyRowContent(((PdfPTable) (obj2)), i);
			else
	//*1886 3969:goto            3323
			if(l > 0 && l < ((PdfPTable) (obj)).size())
	//*1887 3972:iload           10
	//*1888 3974:ifle            3377
	//*1889 3977:iload           10
	//*1890 3979:aload           19
	//*1891 3981:invokevirtual   #839 <Method int PdfPTable.size()>
	//*1892 3984:icmpge          3377
				((PdfPTable) (obj)).getRow(l).splitRowspans(((PdfPTable) (obj)), l - 1, ((PdfPTable) (obj2)), i);
	// 1893 3987:aload           19
	// 1894 3989:iload           10
	// 1895 3991:invokevirtual   #910 <Method PdfPRow PdfPTable.getRow(int)>
	// 1896 3994:aload           19
	// 1897 3996:iload           10
	// 1898 3998:iconst_1        
	// 1899 3999:isub            
	// 1900 4000:aload           20
	// 1901 4002:iload           8
	// 1902 4004:invokevirtual   #1053 <Method void PdfPRow.splitRowspans(PdfPTable, int, PdfPTable, int)>
			if(((PdfPTable) (obj)).isExtendLastRow(flag6))
				((PdfPRow) (obj4)).setMaxHeights(f5);
			f5 = f4;
			if(flag6)
			{
				obj2 = ((Object) (((PdfPTable) (obj)).getTableEvent()));
				f5 = f4;
				if(obj2 instanceof PdfPTableEventAfterSplit)
				{
					obj4 = ((Object) (((PdfPTable) (obj)).getRow(l)));
					((PdfPTableEventAfterSplit)obj2).afterSplitTable(((PdfPTable) (obj)), ((PdfPRow) (obj4)), l);
					f5 = f4;
				}
			}
		}
_L26:
		yLine = f5;
		descender = 0.0F;
		currentLeading = 0.0F;
		i = l;
		if(!flag1)
		{
			i = l;
			if(!((PdfPTable) (obj)).isComplete())
			{
				yLine = yLine + f6;
				i = l;
			}
		}
_L27:
		if(i >= ((PdfPTable) (obj)).size() || ((PdfPTable) (obj)).getRowHeight(i) > 0.0F || ((PdfPTable) (obj)).hasRowspan(i))
		{
			if(i >= ((PdfPTable) (obj)).size())
			{
				if(yLine - ((PdfPTable) (obj)).spacingAfter() < minY)
					yLine = minY;
				else
	//*1903 4007:goto            3377
	//*1904 4010:fload_2         
	//*1905 4011:fstore          6
	//*1906 4013:aload           19
	//*1907 4015:invokevirtual   #1055 <Method boolean PdfPTable.isExtendLastRow()>
	//*1908 4018:ifeq            3451
	//*1909 4021:fload_2         
	//*1910 4022:fstore          6
	//*1911 4024:aload_0         
	//*1912 4025:getfield        #501 <Field float minY>
	//*1913 4028:ldc2            #1056 <Float -1.073742E+09F>
	//*1914 4031:fcmpl           
	//*1915 4032:ifle            3451
	//*1916 4035:aload_0         
	//*1917 4036:getfield        #501 <Field float minY>
	//*1918 4039:fstore          6
	//*1919 4041:goto            3451
	//*1920 4044:iload           8
	//*1921 4046:iconst_1        
	//*1922 4047:iadd            
	//*1923 4048:istore          8
	//*1924 4050:goto            3503
					yLine = yLine - ((PdfPTable) (obj)).spacingAfter();
	// 1925 4053:aload_0         
	// 1926 4054:aload_0         
	// 1927 4055:getfield        #520 <Field float yLine>
	// 1928 4058:aload           19
	// 1929 4060:invokevirtual   #1022 <Method float PdfPTable.spacingAfter()>
	// 1930 4063:fsub            
	// 1931 4064:putfield        #520 <Field float yLine>
				compositeElements.removeFirst();
				splittedRow = -1;
				rowIdx = 0;
				runDirection = i4;
				if(runDirection == 3)
					j = 1;
				else
	//*1932 4067:goto            3571
	//*1933 4070:aload_0         
	//*1934 4071:getfield        #144 <Field int splittedRow>
	//*1935 4074:iconst_m1       
	//*1936 4075:icmple          4116
	//*1937 4078:aload           19
	//*1938 4080:invokevirtual   #936 <Method ArrayList PdfPTable.getRows()>
	//*1939 4083:astore          19
	//*1940 4085:aload_0         
	//*1941 4086:getfield        #142 <Field int rowIdx>
	//*1942 4089:istore          9
	//*1943 4091:iload           9
	//*1944 4093:iload           8
	//*1945 4095:icmpge          4116
	//*1946 4098:aload           19
	//*1947 4100:iload           9
	//*1948 4102:aconst_null     
	//*1949 4103:invokevirtual   #1038 <Method Object ArrayList.set(int, Object)>
	//*1950 4106:pop             
	//*1951 4107:iload           9
	//*1952 4109:iconst_1        
	//*1953 4110:iadd            
	//*1954 4111:istore          9
	//*1955 4113:goto            4091
	//*1956 4116:aload_0         
	//*1957 4117:iload           8
	//*1958 4119:putfield        #142 <Field int rowIdx>
	//*1959 4122:iconst_2        
	//*1960 4123:ireturn         
					j = 0;
	// 1961 4124:iconst_0        
	// 1962 4125:istore          9
				i = l1;
			} else
			{
				if(splittedRow > -1)
				{
					obj = ((Object) (((PdfPTable) (obj)).getRows()));
					for(j = rowIdx; j < i; j++)
						((ArrayList) (obj)).set(j, ((Object) (null)));

				}
				rowIdx = i;
				return 2;
			}
			continue; /* Loop/switch isn't completed */
	// 1963 4127:goto            3606
		}
		break MISSING_BLOCK_LABEL_4044;
_L24:
		f2 = f5;
		if(j == 0)
			f2 = f5 + (rectangularWidth - f4);
		  goto _L25
_L23:
		f2 = f5 + (rectangularWidth - f4) / 2.0F;
		  goto _L25
_L21:
		f5 = f1;
		if(((PdfPTable) (obj)).isExtendLastRow())
		{
			f5 = f1;
			if(minY > -1.073742E+09F)
				f5 = minY;
		}
		  goto _L26
		i++;
		  goto _L27
		if(((Element) (obj2)).type() == 55)
	//*1964 4130:aload           20
	//*1965 4132:invokeinterface #304 <Method int Element.type()>
	//*1966 4137:bipush          55
	//*1967 4139:icmpne          4191
		{
			if(!flag)
	//*1968 4142:iload_1         
	//*1969 4143:ifne            4180
				((DrawInterface)obj2).draw(canvas, leftX, minY, rightX, maxY, yLine);
	// 1970 4146:aload           20
	// 1971 4148:checkcast       #1058 <Class DrawInterface>
	// 1972 4151:aload_0         
	// 1973 4152:getfield        #154 <Field PdfContentByte canvas>
	// 1974 4155:aload_0         
	// 1975 4156:getfield        #628 <Field float leftX>
	// 1976 4159:aload_0         
	// 1977 4160:getfield        #501 <Field float minY>
	// 1978 4163:aload_0         
	// 1979 4164:getfield        #769 <Field float rightX>
	// 1980 4167:aload_0         
	// 1981 4168:getfield        #499 <Field float maxY>
	// 1982 4171:aload_0         
	// 1983 4172:getfield        #520 <Field float yLine>
	// 1984 4175:invokeinterface #1062 <Method void DrawInterface.draw(PdfContentByte, float, float, float, float, float)>
			compositeElements.removeFirst();
	// 1985 4180:aload_0         
	// 1986 4181:getfield        #465 <Field LinkedList compositeElements>
	// 1987 4184:invokevirtual   #780 <Method Object LinkedList.removeFirst()>
	// 1988 4187:pop             
		} else
	//*1989 4188:goto            65
		if(((Element) (obj2)).type() == 37)
	//*1990 4191:aload           20
	//*1991 4193:invokeinterface #304 <Method int Element.type()>
	//*1992 4198:bipush          37
	//*1993 4200:icmpne          4371
		{
			ArrayList arraylist = new ArrayList();
	// 1994 4203:new             #489 <Class ArrayList>
	// 1995 4206:dup             
	// 1996 4207:invokespecial   #490 <Method void ArrayList()>
	// 1997 4210:astore          21
			do
			{
				arraylist.add(obj2);
	// 1998 4212:aload           21
	// 1999 4214:aload           20
	// 2000 4216:invokevirtual   #497 <Method boolean ArrayList.add(Object)>
	// 2001 4219:pop             
				compositeElements.removeFirst();
	// 2002 4220:aload_0         
	// 2003 4221:getfield        #465 <Field LinkedList compositeElements>
	// 2004 4224:invokevirtual   #780 <Method Object LinkedList.removeFirst()>
	// 2005 4227:pop             
				int i1;
				Object obj1;
				if(!compositeElements.isEmpty())
	//*2006 4228:aload_0         
	//*2007 4229:getfield        #465 <Field LinkedList compositeElements>
	//*2008 4232:invokevirtual   #720 <Method boolean LinkedList.isEmpty()>
	//*2009 4235:ifne            4365
					obj1 = ((Object) ((Element)compositeElements.getFirst()));
	// 2010 4238:aload_0         
	// 2011 4239:getfield        #465 <Field LinkedList compositeElements>
	// 2012 4242:invokevirtual   #723 <Method Object LinkedList.getFirst()>
	// 2013 4245:checkcast       #300 <Class Element>
	// 2014 4248:astore          19
				else
	//*2015 4250:aload           19
	//*2016 4252:ifnull          4271
	//*2017 4255:aload           19
	//*2018 4257:astore          20
	//*2019 4259:aload           19
	//*2020 4261:invokeinterface #304 <Method int Element.type()>
	//*2021 4266:bipush          37
	//*2022 4268:icmpeq          4212
	//*2023 4271:new             #1064 <Class FloatLayout>
	//*2024 4274:dup             
	//*2025 4275:aload           21
	//*2026 4277:aload_0         
	//*2027 4278:getfield        #146 <Field boolean useAscender>
	//*2028 4281:invokespecial   #1067 <Method void FloatLayout(List, boolean)>
	//*2029 4284:astore          19
	//*2030 4286:aload           19
	//*2031 4288:aload_0         
	//*2032 4289:getfield        #628 <Field float leftX>
	//*2033 4292:aload_0         
	//*2034 4293:getfield        #501 <Field float minY>
	//*2035 4296:aload_0         
	//*2036 4297:getfield        #769 <Field float rightX>
	//*2037 4300:aload_0         
	//*2038 4301:getfield        #520 <Field float yLine>
	//*2039 4304:invokevirtual   #1070 <Method void FloatLayout.setSimpleColumn(float, float, float, float)>
	//*2040 4307:aload           19
	//*2041 4309:getfield        #1071 <Field ColumnText FloatLayout.compositeColumn>
	//*2042 4312:aload_0         
	//*2043 4313:invokevirtual   #1074 <Method boolean isIgnoreSpacingBefore()>
	//*2044 4316:invokevirtual   #1077 <Method void setIgnoreSpacingBefore(boolean)>
	//*2045 4319:aload           19
	//*2046 4321:aload_0         
	//*2047 4322:getfield        #154 <Field PdfContentByte canvas>
	//*2048 4325:iload_1         
	//*2049 4326:invokevirtual   #1081 <Method int FloatLayout.layout(PdfContentByte, boolean)>
	//*2050 4329:istore          10
	//*2051 4331:aload_0         
	//*2052 4332:aload           19
	//*2053 4334:invokevirtual   #1083 <Method float FloatLayout.getYLine()>
	//*2054 4337:putfield        #520 <Field float yLine>
	//*2055 4340:aload_0         
	//*2056 4341:fconst_0        
	//*2057 4342:putfield        #546 <Field float descender>
	//*2058 4345:iload           10
	//*2059 4347:iconst_1        
	//*2060 4348:iand            
	//*2061 4349:ifne            65
	//*2062 4352:aload_0         
	//*2063 4353:getfield        #465 <Field LinkedList compositeElements>
	//*2064 4356:aload           21
	//*2065 4358:invokevirtual   #472 <Method boolean LinkedList.addAll(java.util.Collection)>
	//*2066 4361:pop             
	//*2067 4362:iload           10
	//*2068 4364:ireturn         
					obj1 = null;
	// 2069 4365:aconst_null     
	// 2070 4366:astore          19
				if(obj1 == null)
					break;
				obj2 = obj1;
			} while(((Element) (obj1)).type() == 37);
			obj1 = ((Object) (new FloatLayout(((List) (arraylist)), useAscender)));
			((FloatLayout) (obj1)).setSimpleColumn(leftX, minY, rightX, yLine);
			((FloatLayout) (obj1)).compositeColumn.setIgnoreSpacingBefore(isIgnoreSpacingBefore());
			i1 = ((FloatLayout) (obj1)).layout(canvas, flag);
			yLine = ((FloatLayout) (obj1)).getYLine();
			descender = 0.0F;
			if((i1 & 1) == 0)
			{
				compositeElements.addAll(((java.util.Collection) (arraylist)));
				return i1;
			}
		} else
	//*2071 4368:goto            4250
		{
			compositeElements.removeFirst();
	// 2072 4371:aload_0         
	// 2073 4372:getfield        #465 <Field LinkedList compositeElements>
	// 2074 4375:invokevirtual   #780 <Method Object LinkedList.removeFirst()>
	// 2075 4378:pop             
		}
		if(true) goto _L29; else goto _L28
	// 2076 4379:goto            65
_L28:
	}

	public boolean isAdjustFirstLine()
	{
		return adjustFirstLine;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field boolean adjustFirstLine>
	//    2    4:ireturn         
	}

	public boolean isIgnoreSpacingBefore()
	{
		return ignoreSpacingBefore;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field boolean ignoreSpacingBefore>
	//    2    4:ireturn         
	}

	public boolean isUseAscender()
	{
		return useAscender;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field boolean useAscender>
	//    2    4:ireturn         
	}

	public boolean isWordSplit()
	{
		return isWordSplit;
	//    0    0:aload_0         
	//    1    1:getfield        #572 <Field boolean isWordSplit>
	//    2    4:ireturn         
	}

	public ColumnText setACopy(ColumnText columntext)
	{
		if(columntext != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			setSimpleVars(columntext);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1088 <Method void setSimpleVars(ColumnText)>
			if(columntext.bidiLine != null)
	//*   5    9:aload_1         
	//*   6   10:getfield        #158 <Field BidiLine bidiLine>
	//*   7   13:ifnull          31
				bidiLine = new BidiLine(columntext.bidiLine);
	//    8   16:aload_0         
	//    9   17:new             #162 <Class BidiLine>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:getfield        #158 <Field BidiLine bidiLine>
	//   13   25:invokespecial   #1091 <Method void BidiLine(BidiLine)>
	//   14   28:putfield        #158 <Field BidiLine bidiLine>
		}
		return this;
	//   15   31:aload_0         
	//   16   32:areturn         
	}

	public void setAdjustFirstLine(boolean flag)
	{
		adjustFirstLine = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #148 <Field boolean adjustFirstLine>
	//    3    5:return          
	}

	public void setAlignment(int i)
	{
		alignment = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #106 <Field int alignment>
	//    3    5:return          
	}

	public void setArabicOptions(int i)
	{
		arabicOptions = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #136 <Field int arabicOptions>
	//    3    5:return          
	}

	public void setCanvas(PdfContentByte pdfcontentbyte)
	{
		canvas = pdfcontentbyte;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #154 <Field PdfContentByte canvas>
		canvases = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #540 <Field PdfContentByte[] canvases>
		if(compositeColumn != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #725 <Field ColumnText compositeColumn>
	//*   8   14:ifnull          25
			compositeColumn.setCanvas(pdfcontentbyte);
	//    9   17:aload_0         
	//   10   18:getfield        #725 <Field ColumnText compositeColumn>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #1095 <Method void setCanvas(PdfContentByte)>
	//   13   25:return          
	}

	public void setCanvases(PdfContentByte apdfcontentbyte[])
	{
		canvases = apdfcontentbyte;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #540 <Field PdfContentByte[] canvases>
		canvas = apdfcontentbyte[3];
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_3        
	//    6    8:aaload          
	//    7    9:putfield        #154 <Field PdfContentByte canvas>
		if(compositeColumn != null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #725 <Field ColumnText compositeColumn>
	//*  10   16:ifnull          27
			compositeColumn.setCanvases(apdfcontentbyte);
	//   11   19:aload_0         
	//   12   20:getfield        #725 <Field ColumnText compositeColumn>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #1099 <Method void setCanvases(PdfContentByte[])>
	//   15   27:return          
	}

	public void setColumns(float af[], float af1[])
	{
		maxY = -1E+21F;
	//    0    0:aload_0         
	//    1    1:ldc2            #1102 <Float -1E+21F>
	//    2    4:putfield        #499 <Field float maxY>
		minY = 1E+21F;
	//    3    7:aload_0         
	//    4    8:ldc2            #1103 <Float 1E+21F>
	//    5   11:putfield        #501 <Field float minY>
		setYLine(Math.max(af[1], af[af.length - 1]));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:faload          
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:arraylength     
	//   13   21:iconst_1        
	//   14   22:isub            
	//   15   23:faload          
	//   16   24:invokestatic    #496 <Method float Math.max(float, float)>
	//   17   27:invokevirtual   #1106 <Method void setYLine(float)>
		rightWall = convertColumn(af1);
	//   18   30:aload_0         
	//   19   31:aload_0         
	//   20   32:aload_2         
	//   21   33:invokevirtual   #1108 <Method ArrayList convertColumn(float[])>
	//   22   36:putfield        #518 <Field ArrayList rightWall>
		leftWall = convertColumn(af);
	//   23   39:aload_0         
	//   24   40:aload_0         
	//   25   41:aload_1         
	//   26   42:invokevirtual   #1108 <Method ArrayList convertColumn(float[])>
	//   27   45:putfield        #510 <Field ArrayList leftWall>
		rectangularWidth = -1F;
	//   28   48:aload_0         
	//   29   49:ldc1            #122 <Float -1F>
	//   30   51:putfield        #124 <Field float rectangularWidth>
		rectangularMode = false;
	//   31   54:aload_0         
	//   32   55:iconst_0        
	//   33   56:putfield        #126 <Field boolean rectangularMode>
	//   34   59:return          
	}

	public void setExtraParagraphSpace(float f)
	{
		extraParagraphSpace = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #121 <Field float extraParagraphSpace>
	//    3    5:return          
	}

	public void setFilledWidth(float f)
	{
		filledWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #550 <Field float filledWidth>
	//    3    5:return          
	}

	public void setFollowingIndent(float f)
	{
		followingIndent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #117 <Field float followingIndent>
		lastWasNewline = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #130 <Field boolean lastWasNewline>
	//    6   10:return          
	}

	public void setIgnoreSpacingBefore(boolean flag)
	{
		ignoreSpacingBefore = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #152 <Field boolean ignoreSpacingBefore>
	//    3    5:return          
	}

	public void setIndent(float f)
	{
		setIndent(f, true);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #736 <Method void setIndent(float, boolean)>
	//    4    6:return          
	}

	public void setIndent(float f, boolean flag)
	{
		indent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #115 <Field float indent>
		lastWasNewline = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #130 <Field boolean lastWasNewline>
		repeatFirstLineIndent = flag;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:putfield        #132 <Field boolean repeatFirstLineIndent>
	//    9   15:return          
	}

	public void setInheritGraphicState(boolean flag)
	{
		inheritGraphicState = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #150 <Field boolean inheritGraphicState>
	//    3    5:return          
	}

	public void setLeading(float f)
	{
		fixedLeading = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #111 <Field float fixedLeading>
		multipliedLeading = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #113 <Field float multipliedLeading>
	//    6   10:return          
	}

	public void setLeading(float f, float f1)
	{
		fixedLeading = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #111 <Field float fixedLeading>
		multipliedLeading = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #113 <Field float multipliedLeading>
	//    6   10:return          
	}

	public void setRightIndent(float f)
	{
		rightIndent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #119 <Field float rightIndent>
		lastWasNewline = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #130 <Field boolean lastWasNewline>
	//    6   10:return          
	}

	public void setRunDirection(int i)
	{
		if(i < 0 || i > 3)
	//*   0    0:iload_1         
	//*   1    1:iflt            9
	//*   2    4:iload_1         
	//*   3    5:iconst_3        
	//*   4    6:icmple          24
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.run.direction.1", i));
	//    5    9:new             #484 <Class RuntimeException>
	//    6   12:dup             
	//    7   13:ldc2            #1111 <String "invalid.run.direction.1">
	//    8   16:iload_1         
	//    9   17:invokestatic    #1114 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   10   20:invokespecial   #487 <Method void RuntimeException(String)>
	//   11   23:athrow          
		} else
		{
			runDirection = i;
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:putfield        #104 <Field int runDirection>
			return;
	//   15   29:return          
		}
	}

	public void setSimpleColumn(float f, float f1, float f2, float f3)
	{
		leftX = Math.min(f, f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_3         
	//    3    3:invokestatic    #494 <Method float Math.min(float, float)>
	//    4    6:putfield        #628 <Field float leftX>
		maxY = Math.max(f1, f3);
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:fload           4
	//    8   13:invokestatic    #496 <Method float Math.max(float, float)>
	//    9   16:putfield        #499 <Field float maxY>
		minY = Math.min(f1, f3);
	//   10   19:aload_0         
	//   11   20:fload_2         
	//   12   21:fload           4
	//   13   23:invokestatic    #494 <Method float Math.min(float, float)>
	//   14   26:putfield        #501 <Field float minY>
		rightX = Math.max(f, f2);
	//   15   29:aload_0         
	//   16   30:fload_1         
	//   17   31:fload_3         
	//   18   32:invokestatic    #496 <Method float Math.max(float, float)>
	//   19   35:putfield        #769 <Field float rightX>
		yLine = maxY;
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #499 <Field float maxY>
	//   23   43:putfield        #520 <Field float yLine>
		rectangularWidth = rightX - leftX;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #769 <Field float rightX>
	//   27   51:aload_0         
	//   28   52:getfield        #628 <Field float leftX>
	//   29   55:fsub            
	//   30   56:putfield        #124 <Field float rectangularWidth>
		if(rectangularWidth < 0.0F)
	//*  31   59:aload_0         
	//*  32   60:getfield        #124 <Field float rectangularWidth>
	//*  33   63:fconst_0        
	//*  34   64:fcmpg           
	//*  35   65:ifge            73
			rectangularWidth = 0.0F;
	//   36   68:aload_0         
	//   37   69:fconst_0        
	//   38   70:putfield        #124 <Field float rectangularWidth>
		rectangularMode = true;
	//   39   73:aload_0         
	//   40   74:iconst_1        
	//   41   75:putfield        #126 <Field boolean rectangularMode>
	//   42   78:return          
	}

	public void setSimpleColumn(float f, float f1, float f2, float f3, float f4, int i)
	{
		setLeading(f4);
	//    0    0:aload_0         
	//    1    1:fload           5
	//    2    3:invokevirtual   #1117 <Method void setLeading(float)>
		alignment = i;
	//    3    6:aload_0         
	//    4    7:iload           6
	//    5    9:putfield        #106 <Field int alignment>
		setSimpleColumn(f, f1, f2, f3);
	//    6   12:aload_0         
	//    7   13:fload_1         
	//    8   14:fload_2         
	//    9   15:fload_3         
	//   10   16:fload           4
	//   11   18:invokevirtual   #1118 <Method void setSimpleColumn(float, float, float, float)>
	//   12   21:return          
	}

	public void setSimpleColumn(Phrase phrase, float f, float f1, float f2, float f3, float f4, int i)
	{
		addText(phrase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #282 <Method void addText(Phrase)>
		setSimpleColumn(f, f1, f2, f3, f4, i);
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:fload           4
	//    7   10:fload           5
	//    8   12:fload           6
	//    9   14:iload           7
	//   10   16:invokevirtual   #1120 <Method void setSimpleColumn(float, float, float, float, float, int)>
	//   11   19:return          
	}

	public void setSimpleColumn(Rectangle rectangle)
	{
		setSimpleColumn(rectangle.getLeft(), rectangle.getBottom(), rectangle.getRight(), rectangle.getTop());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #246 <Method float Rectangle.getLeft()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #249 <Method float Rectangle.getBottom()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #252 <Method float Rectangle.getRight()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #255 <Method float Rectangle.getTop()>
	//    9   17:invokevirtual   #1118 <Method void setSimpleColumn(float, float, float, float)>
	//   10   20:return          
	}

	protected void setSimpleVars(ColumnText columntext)
	{
		maxY = columntext.maxY;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #499 <Field float maxY>
	//    3    5:putfield        #499 <Field float maxY>
		minY = columntext.minY;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #501 <Field float minY>
	//    7   13:putfield        #501 <Field float minY>
		alignment = columntext.alignment;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #106 <Field int alignment>
	//   11   21:putfield        #106 <Field int alignment>
		leftWall = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #510 <Field ArrayList leftWall>
		if(columntext.leftWall != null)
	//*  15   29:aload_1         
	//*  16   30:getfield        #510 <Field ArrayList leftWall>
	//*  17   33:ifnull          51
			leftWall = new ArrayList(((java.util.Collection) (columntext.leftWall)));
	//   18   36:aload_0         
	//   19   37:new             #489 <Class ArrayList>
	//   20   40:dup             
	//   21   41:aload_1         
	//   22   42:getfield        #510 <Field ArrayList leftWall>
	//   23   45:invokespecial   #1124 <Method void ArrayList(java.util.Collection)>
	//   24   48:putfield        #510 <Field ArrayList leftWall>
		rightWall = null;
	//   25   51:aload_0         
	//   26   52:aconst_null     
	//   27   53:putfield        #518 <Field ArrayList rightWall>
		if(columntext.rightWall != null)
	//*  28   56:aload_1         
	//*  29   57:getfield        #518 <Field ArrayList rightWall>
	//*  30   60:ifnull          78
			rightWall = new ArrayList(((java.util.Collection) (columntext.rightWall)));
	//   31   63:aload_0         
	//   32   64:new             #489 <Class ArrayList>
	//   33   67:dup             
	//   34   68:aload_1         
	//   35   69:getfield        #518 <Field ArrayList rightWall>
	//   36   72:invokespecial   #1124 <Method void ArrayList(java.util.Collection)>
	//   37   75:putfield        #518 <Field ArrayList rightWall>
		yLine = columntext.yLine;
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:getfield        #520 <Field float yLine>
	//   41   83:putfield        #520 <Field float yLine>
		currentLeading = columntext.currentLeading;
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:getfield        #109 <Field float currentLeading>
	//   45   91:putfield        #109 <Field float currentLeading>
		fixedLeading = columntext.fixedLeading;
	//   46   94:aload_0         
	//   47   95:aload_1         
	//   48   96:getfield        #111 <Field float fixedLeading>
	//   49   99:putfield        #111 <Field float fixedLeading>
		multipliedLeading = columntext.multipliedLeading;
	//   50  102:aload_0         
	//   51  103:aload_1         
	//   52  104:getfield        #113 <Field float multipliedLeading>
	//   53  107:putfield        #113 <Field float multipliedLeading>
		canvas = columntext.canvas;
	//   54  110:aload_0         
	//   55  111:aload_1         
	//   56  112:getfield        #154 <Field PdfContentByte canvas>
	//   57  115:putfield        #154 <Field PdfContentByte canvas>
		canvases = columntext.canvases;
	//   58  118:aload_0         
	//   59  119:aload_1         
	//   60  120:getfield        #540 <Field PdfContentByte[] canvases>
	//   61  123:putfield        #540 <Field PdfContentByte[] canvases>
		lineStatus = columntext.lineStatus;
	//   62  126:aload_0         
	//   63  127:aload_1         
	//   64  128:getfield        #516 <Field int lineStatus>
	//   65  131:putfield        #516 <Field int lineStatus>
		indent = columntext.indent;
	//   66  134:aload_0         
	//   67  135:aload_1         
	//   68  136:getfield        #115 <Field float indent>
	//   69  139:putfield        #115 <Field float indent>
		followingIndent = columntext.followingIndent;
	//   70  142:aload_0         
	//   71  143:aload_1         
	//   72  144:getfield        #117 <Field float followingIndent>
	//   73  147:putfield        #117 <Field float followingIndent>
		rightIndent = columntext.rightIndent;
	//   74  150:aload_0         
	//   75  151:aload_1         
	//   76  152:getfield        #119 <Field float rightIndent>
	//   77  155:putfield        #119 <Field float rightIndent>
		extraParagraphSpace = columntext.extraParagraphSpace;
	//   78  158:aload_0         
	//   79  159:aload_1         
	//   80  160:getfield        #121 <Field float extraParagraphSpace>
	//   81  163:putfield        #121 <Field float extraParagraphSpace>
		rectangularWidth = columntext.rectangularWidth;
	//   82  166:aload_0         
	//   83  167:aload_1         
	//   84  168:getfield        #124 <Field float rectangularWidth>
	//   85  171:putfield        #124 <Field float rectangularWidth>
		rectangularMode = columntext.rectangularMode;
	//   86  174:aload_0         
	//   87  175:aload_1         
	//   88  176:getfield        #126 <Field boolean rectangularMode>
	//   89  179:putfield        #126 <Field boolean rectangularMode>
		spaceCharRatio = columntext.spaceCharRatio;
	//   90  182:aload_0         
	//   91  183:aload_1         
	//   92  184:getfield        #128 <Field float spaceCharRatio>
	//   93  187:putfield        #128 <Field float spaceCharRatio>
		lastWasNewline = columntext.lastWasNewline;
	//   94  190:aload_0         
	//   95  191:aload_1         
	//   96  192:getfield        #130 <Field boolean lastWasNewline>
	//   97  195:putfield        #130 <Field boolean lastWasNewline>
		repeatFirstLineIndent = columntext.repeatFirstLineIndent;
	//   98  198:aload_0         
	//   99  199:aload_1         
	//  100  200:getfield        #132 <Field boolean repeatFirstLineIndent>
	//  101  203:putfield        #132 <Field boolean repeatFirstLineIndent>
		linesWritten = columntext.linesWritten;
	//  102  206:aload_0         
	//  103  207:aload_1         
	//  104  208:getfield        #560 <Field int linesWritten>
	//  105  211:putfield        #560 <Field int linesWritten>
		arabicOptions = columntext.arabicOptions;
	//  106  214:aload_0         
	//  107  215:aload_1         
	//  108  216:getfield        #136 <Field int arabicOptions>
	//  109  219:putfield        #136 <Field int arabicOptions>
		runDirection = columntext.runDirection;
	//  110  222:aload_0         
	//  111  223:aload_1         
	//  112  224:getfield        #104 <Field int runDirection>
	//  113  227:putfield        #104 <Field int runDirection>
		descender = columntext.descender;
	//  114  230:aload_0         
	//  115  231:aload_1         
	//  116  232:getfield        #546 <Field float descender>
	//  117  235:putfield        #546 <Field float descender>
		composite = columntext.composite;
	//  118  238:aload_0         
	//  119  239:aload_1         
	//  120  240:getfield        #138 <Field boolean composite>
	//  121  243:putfield        #138 <Field boolean composite>
		splittedRow = columntext.splittedRow;
	//  122  246:aload_0         
	//  123  247:aload_1         
	//  124  248:getfield        #144 <Field int splittedRow>
	//  125  251:putfield        #144 <Field int splittedRow>
		if(columntext.composite)
	//* 126  254:aload_1         
	//* 127  255:getfield        #138 <Field boolean composite>
	//* 128  258:ifeq            358
		{
			compositeElements = new LinkedList();
	//  129  261:aload_0         
	//  130  262:new             #462 <Class LinkedList>
	//  131  265:dup             
	//  132  266:invokespecial   #463 <Method void LinkedList()>
	//  133  269:putfield        #465 <Field LinkedList compositeElements>
			for(Iterator iterator = columntext.compositeElements.iterator(); iterator.hasNext();)
	//* 134  272:aload_1         
	//* 135  273:getfield        #465 <Field LinkedList compositeElements>
	//* 136  276:invokevirtual   #1125 <Method Iterator LinkedList.iterator()>
	//* 137  279:astore_2        
	//* 138  280:aload_2         
	//* 139  281:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//* 140  286:ifeq            340
			{
				Element element = (Element)iterator.next();
	//  141  289:aload_2         
	//  142  290:invokeinterface #185 <Method Object Iterator.next()>
	//  143  295:checkcast       #300 <Class Element>
	//  144  298:astore_3        
				if(element instanceof PdfPTable)
	//* 145  299:aload_3         
	//* 146  300:instanceof      #363 <Class PdfPTable>
	//* 147  303:ifeq            328
					compositeElements.add(((Object) (new PdfPTable((PdfPTable)element))));
	//  148  306:aload_0         
	//  149  307:getfield        #465 <Field LinkedList compositeElements>
	//  150  310:new             #363 <Class PdfPTable>
	//  151  313:dup             
	//  152  314:aload_3         
	//  153  315:checkcast       #363 <Class PdfPTable>
	//  154  318:invokespecial   #1033 <Method void PdfPTable(PdfPTable)>
	//  155  321:invokevirtual   #476 <Method boolean LinkedList.add(Object)>
	//  156  324:pop             
				else
	//* 157  325:goto            280
					compositeElements.add(((Object) (element)));
	//  158  328:aload_0         
	//  159  329:getfield        #465 <Field LinkedList compositeElements>
	//  160  332:aload_3         
	//  161  333:invokevirtual   #476 <Method boolean LinkedList.add(Object)>
	//  162  336:pop             
			}

	//* 163  337:goto            280
			if(columntext.compositeColumn != null)
	//* 164  340:aload_1         
	//* 165  341:getfield        #725 <Field ColumnText compositeColumn>
	//* 166  344:ifnull          358
				compositeColumn = duplicate(columntext.compositeColumn);
	//  167  347:aload_0         
	//  168  348:aload_1         
	//  169  349:getfield        #725 <Field ColumnText compositeColumn>
	//  170  352:invokestatic    #1127 <Method ColumnText duplicate(ColumnText)>
	//  171  355:putfield        #725 <Field ColumnText compositeColumn>
		}
		listIdx = columntext.listIdx;
	//  172  358:aload_0         
	//  173  359:aload_1         
	//  174  360:getfield        #140 <Field int listIdx>
	//  175  363:putfield        #140 <Field int listIdx>
		rowIdx = columntext.rowIdx;
	//  176  366:aload_0         
	//  177  367:aload_1         
	//  178  368:getfield        #142 <Field int rowIdx>
	//  179  371:putfield        #142 <Field int rowIdx>
		firstLineY = columntext.firstLineY;
	//  180  374:aload_0         
	//  181  375:aload_1         
	//  182  376:getfield        #590 <Field float firstLineY>
	//  183  379:putfield        #590 <Field float firstLineY>
		leftX = columntext.leftX;
	//  184  382:aload_0         
	//  185  383:aload_1         
	//  186  384:getfield        #628 <Field float leftX>
	//  187  387:putfield        #628 <Field float leftX>
		rightX = columntext.rightX;
	//  188  390:aload_0         
	//  189  391:aload_1         
	//  190  392:getfield        #769 <Field float rightX>
	//  191  395:putfield        #769 <Field float rightX>
		firstLineYDone = columntext.firstLineYDone;
	//  192  398:aload_0         
	//  193  399:aload_1         
	//  194  400:getfield        #134 <Field boolean firstLineYDone>
	//  195  403:putfield        #134 <Field boolean firstLineYDone>
		waitPhrase = columntext.waitPhrase;
	//  196  406:aload_0         
	//  197  407:aload_1         
	//  198  408:getfield        #160 <Field Phrase waitPhrase>
	//  199  411:putfield        #160 <Field Phrase waitPhrase>
		useAscender = columntext.useAscender;
	//  200  414:aload_0         
	//  201  415:aload_1         
	//  202  416:getfield        #146 <Field boolean useAscender>
	//  203  419:putfield        #146 <Field boolean useAscender>
		filledWidth = columntext.filledWidth;
	//  204  422:aload_0         
	//  205  423:aload_1         
	//  206  424:getfield        #550 <Field float filledWidth>
	//  207  427:putfield        #550 <Field float filledWidth>
		adjustFirstLine = columntext.adjustFirstLine;
	//  208  430:aload_0         
	//  209  431:aload_1         
	//  210  432:getfield        #148 <Field boolean adjustFirstLine>
	//  211  435:putfield        #148 <Field boolean adjustFirstLine>
		inheritGraphicState = columntext.inheritGraphicState;
	//  212  438:aload_0         
	//  213  439:aload_1         
	//  214  440:getfield        #150 <Field boolean inheritGraphicState>
	//  215  443:putfield        #150 <Field boolean inheritGraphicState>
		ignoreSpacingBefore = columntext.ignoreSpacingBefore;
	//  216  446:aload_0         
	//  217  447:aload_1         
	//  218  448:getfield        #152 <Field boolean ignoreSpacingBefore>
	//  219  451:putfield        #152 <Field boolean ignoreSpacingBefore>
	//  220  454:return          
	}

	public void setSpaceCharRatio(float f)
	{
		spaceCharRatio = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #128 <Field float spaceCharRatio>
	//    3    5:return          
	}

	public void setText(Phrase phrase)
	{
		bidiLine = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #158 <Field BidiLine bidiLine>
		composite = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #138 <Field boolean composite>
		compositeColumn = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #725 <Field ColumnText compositeColumn>
		compositeElements = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #465 <Field LinkedList compositeElements>
		listIdx = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #140 <Field int listIdx>
		rowIdx = 0;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #142 <Field int rowIdx>
		splittedRow = -1;
	//   18   30:aload_0         
	//   19   31:iconst_m1       
	//   20   32:putfield        #144 <Field int splittedRow>
		waitPhrase = phrase;
	//   21   35:aload_0         
	//   22   36:aload_1         
	//   23   37:putfield        #160 <Field Phrase waitPhrase>
	//   24   40:return          
	}

	public void setUseAscender(boolean flag)
	{
		useAscender = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #146 <Field boolean useAscender>
	//    3    5:return          
	}

	public void setYLine(float f)
	{
		yLine = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #520 <Field float yLine>
	//    3    5:return          
	}

	public void updateFilledWidth(float f)
	{
		if(f > filledWidth)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #550 <Field float filledWidth>
	//*   3    5:fcmpl           
	//*   4    6:ifle            14
			filledWidth = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #550 <Field float filledWidth>
	//    8   14:return          
	}

	public boolean zeroHeightElement()
	{
		return composite && !compositeElements.isEmpty() && ((Element)compositeElements.getFirst()).type() == 55;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field boolean composite>
	//    2    4:ifeq            39
	//    3    7:aload_0         
	//    4    8:getfield        #465 <Field LinkedList compositeElements>
	//    5   11:invokevirtual   #720 <Method boolean LinkedList.isEmpty()>
	//    6   14:ifne            39
	//    7   17:aload_0         
	//    8   18:getfield        #465 <Field LinkedList compositeElements>
	//    9   21:invokevirtual   #723 <Method Object LinkedList.getFirst()>
	//   10   24:checkcast       #300 <Class Element>
	//   11   27:invokeinterface #304 <Method int Element.type()>
	//   12   32:bipush          55
	//   13   34:icmpne          39
	//   14   37:iconst_1        
	//   15   38:ireturn         
	//   16   39:iconst_0        
	//   17   40:ireturn         
	}

	public static final int AR_COMPOSEDTASHKEEL = 4;
	public static final int AR_LIG = 8;
	public static final int AR_NOVOWEL = 1;
	public static final int DIGITS_AN2EN = 64;
	public static final int DIGITS_EN2AN = 32;
	public static final int DIGITS_EN2AN_INIT_AL = 128;
	public static final int DIGITS_EN2AN_INIT_LR = 96;
	public static final int DIGIT_TYPE_AN = 0;
	public static final int DIGIT_TYPE_AN_EXTENDED = 256;
	public static final float GLOBAL_SPACE_CHAR_RATIO = 0F;
	protected static final int LINE_STATUS_NOLINE = 2;
	protected static final int LINE_STATUS_OFFLIMITS = 1;
	protected static final int LINE_STATUS_OK = 0;
	public static final int NO_MORE_COLUMN = 2;
	public static final int NO_MORE_TEXT = 1;
	public static final int START_COLUMN = 0;
	private final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/ColumnText);
	private boolean adjustFirstLine;
	protected int alignment;
	private int arabicOptions;
	protected BidiLine bidiLine;
	protected PdfContentByte canvas;
	protected PdfContentByte canvases[];
	protected boolean composite;
	protected ColumnText compositeColumn;
	protected LinkedList compositeElements;
	protected float currentLeading;
	protected float descender;
	protected float extraParagraphSpace;
	private float filledWidth;
	private float firstLineY;
	private boolean firstLineYDone;
	protected float fixedLeading;
	protected float followingIndent;
	private boolean ignoreSpacingBefore;
	protected float indent;
	private boolean inheritGraphicState;
	protected boolean isWordSplit;
	private boolean lastWasNewline;
	protected float lastX;
	protected ArrayList leftWall;
	protected float leftX;
	protected int lineStatus;
	private int linesWritten;
	protected int listIdx;
	protected float maxY;
	protected float minY;
	protected float multipliedLeading;
	protected boolean rectangularMode;
	protected float rectangularWidth;
	private boolean repeatFirstLineIndent;
	protected float rightIndent;
	protected ArrayList rightWall;
	protected float rightX;
	protected int rowIdx;
	protected int runDirection;
	private float spaceCharRatio;
	private int splittedRow;
	private boolean useAscender;
	protected Phrase waitPhrase;
	protected float yLine;
}
