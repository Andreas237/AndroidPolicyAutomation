// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfChunk, PdfFont, BaseFont

public class PdfLine
{

	PdfLine(float f, float f1, float f2, int i, boolean flag, ArrayList arraylist, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		newlineSplit = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field boolean newlineSplit>
		isRTL = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #32  <Field boolean isRTL>
		listItem = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #34  <Field ListItem listItem>
		tabStop = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #36  <Field TabStop tabStop>
		tabStopAnchorPosition = (0.0F / 0.0F);
	//   14   24:aload_0         
	//   15   25:ldc1            #37  <Float (0.0F / 0.0F)>
	//   16   27:putfield        #39  <Field float tabStopAnchorPosition>
		tabPosition = (0.0F / 0.0F);
	//   17   30:aload_0         
	//   18   31:ldc1            #37  <Float (0.0F / 0.0F)>
	//   19   33:putfield        #41  <Field float tabPosition>
		left = f;
	//   20   36:aload_0         
	//   21   37:fload_1         
	//   22   38:putfield        #43  <Field float left>
		originalWidth = f1;
	//   23   41:aload_0         
	//   24   42:fload_2         
	//   25   43:putfield        #45  <Field float originalWidth>
		width = f2;
	//   26   46:aload_0         
	//   27   47:fload_3         
	//   28   48:putfield        #47  <Field float width>
		alignment = i;
	//   29   51:aload_0         
	//   30   52:iload           4
	//   31   54:putfield        #49  <Field int alignment>
		line = arraylist;
	//   32   57:aload_0         
	//   33   58:aload           6
	//   34   60:putfield        #51  <Field ArrayList line>
		newlineSplit = flag;
	//   35   63:aload_0         
	//   36   64:iload           5
	//   37   66:putfield        #30  <Field boolean newlineSplit>
		isRTL = flag1;
	//   38   69:aload_0         
	//   39   70:iload           7
	//   40   72:putfield        #32  <Field boolean isRTL>
	//   41   75:return          
	}

	PdfLine(float f, float f1, int i, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		newlineSplit = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field boolean newlineSplit>
		isRTL = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #32  <Field boolean isRTL>
		listItem = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #34  <Field ListItem listItem>
		tabStop = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #36  <Field TabStop tabStop>
		tabStopAnchorPosition = (0.0F / 0.0F);
	//   14   24:aload_0         
	//   15   25:ldc1            #37  <Float (0.0F / 0.0F)>
	//   16   27:putfield        #39  <Field float tabStopAnchorPosition>
		tabPosition = (0.0F / 0.0F);
	//   17   30:aload_0         
	//   18   31:ldc1            #37  <Float (0.0F / 0.0F)>
	//   19   33:putfield        #41  <Field float tabPosition>
		left = f;
	//   20   36:aload_0         
	//   21   37:fload_1         
	//   22   38:putfield        #43  <Field float left>
		width = f1 - f;
	//   23   41:aload_0         
	//   24   42:fload_2         
	//   25   43:fload_1         
	//   26   44:fsub            
	//   27   45:putfield        #47  <Field float width>
		originalWidth = width;
	//   28   48:aload_0         
	//   29   49:aload_0         
	//   30   50:getfield        #47  <Field float width>
	//   31   53:putfield        #45  <Field float originalWidth>
		alignment = i;
	//   32   56:aload_0         
	//   33   57:iload_3         
	//   34   58:putfield        #49  <Field int alignment>
		height = f2;
	//   35   61:aload_0         
	//   36   62:fload           4
	//   37   64:putfield        #57  <Field float height>
		line = new ArrayList();
	//   38   67:aload_0         
	//   39   68:new             #59  <Class ArrayList>
	//   40   71:dup             
	//   41   72:invokespecial   #60  <Method void ArrayList()>
	//   42   75:putfield        #51  <Field ArrayList line>
	//   43   78:return          
	}

	private void addToLine(PdfChunk pdfchunk)
	{
		if(pdfchunk.changeLeading)
	//*   0    0:aload_1         
	//*   1    1:getfield        #67  <Field boolean PdfChunk.changeLeading>
	//*   2    4:ifeq            56
		{
			float f;
			int i;
			String s;
			if(pdfchunk.isImage())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #71  <Method boolean PdfChunk.isImage()>
	//*   5   11:ifeq            151
			{
				Image image = pdfchunk.getImage();
	//    6   14:aload_1         
	//    7   15:invokevirtual   #75  <Method Image PdfChunk.getImage()>
	//    8   18:astore          4
				f = pdfchunk.getImageHeight() + pdfchunk.getImageOffsetY() + image.getBorderWidthTop() + image.getSpacingBefore();
	//    9   20:aload_1         
	//   10   21:invokevirtual   #79  <Method float PdfChunk.getImageHeight()>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #82  <Method float PdfChunk.getImageOffsetY()>
	//   13   28:fadd            
	//   14   29:aload           4
	//   15   31:invokevirtual   #87  <Method float Image.getBorderWidthTop()>
	//   16   34:fadd            
	//   17   35:aload           4
	//   18   37:invokevirtual   #90  <Method float Image.getSpacingBefore()>
	//   19   40:fadd            
	//   20   41:fstore_2        
			} else
	//*  21   42:fload_2         
	//*  22   43:aload_0         
	//*  23   44:getfield        #57  <Field float height>
	//*  24   47:fcmpl           
	//*  25   48:ifle            56
	//*  26   51:aload_0         
	//*  27   52:fload_2         
	//*  28   53:putfield        #57  <Field float height>
	//*  29   56:aload_0         
	//*  30   57:getfield        #36  <Field TabStop tabStop>
	//*  31   60:ifnull          141
	//*  32   63:aload_0         
	//*  33   64:getfield        #36  <Field TabStop tabStop>
	//*  34   67:invokevirtual   #96  <Method com.itextpdf.text.TabStop$Alignment TabStop.getAlignment()>
	//*  35   70:getstatic       #102 <Field com.itextpdf.text.TabStop$Alignment com.itextpdf.text.TabStop$Alignment.ANCHOR>
	//*  36   73:if_acmpne       141
	//*  37   76:aload_0         
	//*  38   77:getfield        #39  <Field float tabStopAnchorPosition>
	//*  39   80:invokestatic    #108 <Method boolean Float.isNaN(float)>
	//*  40   83:ifeq            141
	//*  41   86:aload_1         
	//*  42   87:invokevirtual   #112 <Method String PdfChunk.toString()>
	//*  43   90:astore          4
	//*  44   92:aload           4
	//*  45   94:aload_0         
	//*  46   95:getfield        #36  <Field TabStop tabStop>
	//*  47   98:invokevirtual   #116 <Method char TabStop.getAnchorChar()>
	//*  48  101:invokevirtual   #122 <Method int String.indexOf(int)>
	//*  49  104:istore_3        
	//*  50  105:iload_3         
	//*  51  106:iconst_m1       
	//*  52  107:icmpeq          141
	//*  53  110:aload_1         
	//*  54  111:aload           4
	//*  55  113:iload_3         
	//*  56  114:aload           4
	//*  57  116:invokevirtual   #126 <Method int String.length()>
	//*  58  119:invokevirtual   #130 <Method String String.substring(int, int)>
	//*  59  122:invokevirtual   #133 <Method float PdfChunk.width(String)>
	//*  60  125:fstore_2        
	//*  61  126:aload_0         
	//*  62  127:aload_0         
	//*  63  128:getfield        #45  <Field float originalWidth>
	//*  64  131:aload_0         
	//*  65  132:getfield        #47  <Field float width>
	//*  66  135:fsub            
	//*  67  136:fload_2         
	//*  68  137:fsub            
	//*  69  138:putfield        #39  <Field float tabStopAnchorPosition>
	//*  70  141:aload_0         
	//*  71  142:getfield        #51  <Field ArrayList line>
	//*  72  145:aload_1         
	//*  73  146:invokevirtual   #137 <Method boolean ArrayList.add(Object)>
	//*  74  149:pop             
	//*  75  150:return          
			{
				f = pdfchunk.getLeading();
	//   76  151:aload_1         
	//   77  152:invokevirtual   #140 <Method float PdfChunk.getLeading()>
	//   78  155:fstore_2        
			}
			if(f > height)
				height = f;
		}
		if(tabStop != null && tabStop.getAlignment() == com.itextpdf.text.TabStop.Alignment.ANCHOR && Float.isNaN(tabStopAnchorPosition))
		{
			s = pdfchunk.toString();
			i = s.indexOf(((int) (tabStop.getAnchorChar())));
			if(i != -1)
			{
				f = pdfchunk.width(s.substring(i, s.length()));
				tabStopAnchorPosition = originalWidth - width - f;
			}
		}
		line.add(((Object) (pdfchunk)));
	//*  79  156:goto            42
	}

	PdfChunk add(PdfChunk pdfchunk)
	{
		PdfChunk pdfchunk1;
		Object aobj[];
		if(pdfchunk == null || pdfchunk.toString().equals(""))
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #112 <Method String PdfChunk.toString()>
	//*   4    8:ldc1            #143 <String "">
	//*   5   10:invokevirtual   #146 <Method boolean String.equals(Object)>
	//*   6   13:ifeq            18
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
		pdfchunk1 = pdfchunk.split(width);
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:getfield        #47  <Field float width>
	//   12   23:invokevirtual   #150 <Method PdfChunk PdfChunk.split(float)>
	//   13   26:astore          4
		boolean flag;
		if(pdfchunk.isNewlineSplit() || pdfchunk1 == null)
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #153 <Method boolean PdfChunk.isNewlineSplit()>
	//*  16   32:ifne            40
	//*  17   35:aload           4
	//*  18   37:ifnonnull       157
			flag = true;
	//   19   40:iconst_1        
	//   20   41:istore_3        
		else
	//*  21   42:aload_0         
	//*  22   43:iload_3         
	//*  23   44:putfield        #30  <Field boolean newlineSplit>
	//*  24   47:aload_1         
	//*  25   48:invokevirtual   #156 <Method boolean PdfChunk.isTab()>
	//*  26   51:ifeq            354
	//*  27   54:aload_1         
	//*  28   55:ldc1            #158 <String "TAB">
	//*  29   57:invokevirtual   #162 <Method Object PdfChunk.getAttribute(String)>
	//*  30   60:checkcast       #164 <Class Object[]>
	//*  31   63:checkcast       #164 <Class Object[]>
	//*  32   66:astore          5
	//*  33   68:aload_1         
	//*  34   69:ldc1            #166 <String "TABSETTINGS">
	//*  35   71:invokevirtual   #170 <Method boolean PdfChunk.isAttribute(String)>
	//*  36   74:ifeq            276
	//*  37   77:aload           5
	//*  38   79:iconst_1        
	//*  39   80:aaload          
	//*  40   81:checkcast       #172 <Class Boolean>
	//*  41   84:invokevirtual   #175 <Method boolean Boolean.booleanValue()>
	//*  42   87:istore_3        
	//*  43   88:iload_3         
	//*  44   89:ifeq            102
	//*  45   92:aload_0         
	//*  46   93:getfield        #51  <Field ArrayList line>
	//*  47   96:invokevirtual   #178 <Method boolean ArrayList.isEmpty()>
	//*  48   99:ifne            274
	//*  49  102:aload_0         
	//*  50  103:invokevirtual   #181 <Method void flush()>
	//*  51  106:aload_0         
	//*  52  107:ldc1            #37  <Float (0.0F / 0.0F)>
	//*  53  109:putfield        #39  <Field float tabStopAnchorPosition>
	//*  54  112:aload_0         
	//*  55  113:aload_1         
	//*  56  114:aload_0         
	//*  57  115:getfield        #45  <Field float originalWidth>
	//*  58  118:aload_0         
	//*  59  119:getfield        #47  <Field float width>
	//*  60  122:fsub            
	//*  61  123:invokestatic    #185 <Method TabStop PdfChunk.getTabStop(PdfChunk, float)>
	//*  62  126:putfield        #36  <Field TabStop tabStop>
	//*  63  129:aload_0         
	//*  64  130:getfield        #36  <Field TabStop tabStop>
	//*  65  133:invokevirtual   #188 <Method float TabStop.getPosition()>
	//*  66  136:aload_0         
	//*  67  137:getfield        #45  <Field float originalWidth>
	//*  68  140:fcmpl           
	//*  69  141:ifle            195
	//*  70  144:iload_3         
	//*  71  145:ifeq            162
	//*  72  148:aconst_null     
	//*  73  149:astore_1        
	//*  74  150:aload_0         
	//*  75  151:fconst_0        
	//*  76  152:putfield        #47  <Field float width>
	//*  77  155:aload_1         
	//*  78  156:areturn         
			flag = false;
	//   79  157:iconst_0        
	//   80  158:istore_3        
		newlineSplit = flag;
		if(!pdfchunk.isTab())
			break MISSING_BLOCK_LABEL_354;
		aobj = (Object[])(Object[])pdfchunk.getAttribute("TAB");
		if(!pdfchunk.isAttribute("TABSETTINGS"))
			break MISSING_BLOCK_LABEL_276;
		flag = ((Boolean)aobj[1]).booleanValue();
		if(flag && line.isEmpty())
			break MISSING_BLOCK_LABEL_274;
		flush();
		tabStopAnchorPosition = (0.0F / 0.0F);
		tabStop = PdfChunk.getTabStop(pdfchunk, originalWidth - width);
		if(tabStop.getPosition() <= originalWidth) goto _L2; else goto _L1
_L1:
		if(!flag) goto _L4; else goto _L3
_L3:
		pdfchunk = null;
_L5:
		width = 0.0F;
		return pdfchunk;
	//*  81  159:goto            42
_L4:
		if((double)Math.abs(originalWidth - width) < 0.001D)
	//*  82  162:aload_0         
	//*  83  163:getfield        #45  <Field float originalWidth>
	//*  84  166:aload_0         
	//*  85  167:getfield        #47  <Field float width>
	//*  86  170:fsub            
	//*  87  171:invokestatic    #194 <Method float Math.abs(float)>
	//*  88  174:f2d             
	//*  89  175:ldc2w           #195 <Double 0.001D>
	//*  90  178:dcmpg           
	//*  91  179:ifge            192
		{
			addToLine(pdfchunk);
	//   92  182:aload_0         
	//   93  183:aload_1         
	//   94  184:invokespecial   #198 <Method void addToLine(PdfChunk)>
			pdfchunk = null;
	//   95  187:aconst_null     
	//   96  188:astore_1        
		}
		if(true) goto _L5; else goto _L2
	//   97  189:goto            150
	//*  98  192:goto            150
_L2:
		pdfchunk.setTabStop(tabStop);
	//   99  195:aload_1         
	//  100  196:aload_0         
	//  101  197:getfield        #36  <Field TabStop tabStop>
	//  102  200:invokevirtual   #202 <Method void PdfChunk.setTabStop(TabStop)>
		if(!isRTL && tabStop.getAlignment() == com.itextpdf.text.TabStop.Alignment.LEFT)
	//* 103  203:aload_0         
	//* 104  204:getfield        #32  <Field boolean isRTL>
	//* 105  207:ifne            258
	//* 106  210:aload_0         
	//* 107  211:getfield        #36  <Field TabStop tabStop>
	//* 108  214:invokevirtual   #96  <Method com.itextpdf.text.TabStop$Alignment TabStop.getAlignment()>
	//* 109  217:getstatic       #205 <Field com.itextpdf.text.TabStop$Alignment com.itextpdf.text.TabStop$Alignment.LEFT>
	//* 110  220:if_acmpne       258
		{
			width = originalWidth - tabStop.getPosition();
	//  111  223:aload_0         
	//  112  224:aload_0         
	//  113  225:getfield        #45  <Field float originalWidth>
	//  114  228:aload_0         
	//  115  229:getfield        #36  <Field TabStop tabStop>
	//  116  232:invokevirtual   #188 <Method float TabStop.getPosition()>
	//  117  235:fsub            
	//  118  236:putfield        #47  <Field float width>
			tabStop = null;
	//  119  239:aload_0         
	//  120  240:aconst_null     
	//  121  241:putfield        #36  <Field TabStop tabStop>
			tabPosition = (0.0F / 0.0F);
	//  122  244:aload_0         
	//  123  245:ldc1            #37  <Float (0.0F / 0.0F)>
	//  124  247:putfield        #41  <Field float tabPosition>
		} else
	//* 125  250:aload_0         
	//* 126  251:aload_1         
	//* 127  252:invokespecial   #198 <Method void addToLine(PdfChunk)>
	//* 128  255:aload           4
	//* 129  257:areturn         
		{
			tabPosition = originalWidth - width;
	//  130  258:aload_0         
	//  131  259:aload_0         
	//  132  260:getfield        #45  <Field float originalWidth>
	//  133  263:aload_0         
	//  134  264:getfield        #47  <Field float width>
	//  135  267:fsub            
	//  136  268:putfield        #41  <Field float tabPosition>
		}
		addToLine(pdfchunk);
		return pdfchunk1;
	//* 137  271:goto            250
		return null;
	//  138  274:aconst_null     
	//  139  275:areturn         
		Float float1 = Float.valueOf(((Float)aobj[1]).floatValue());
	//  140  276:aload           5
	//  141  278:iconst_1        
	//  142  279:aaload          
	//  143  280:checkcast       #104 <Class Float>
	//  144  283:invokevirtual   #208 <Method float Float.floatValue()>
	//  145  286:invokestatic    #212 <Method Float Float.valueOf(float)>
	//  146  289:astore          6
		if(((Boolean)aobj[2]).booleanValue() && float1.floatValue() < originalWidth - width)
	//* 147  291:aload           5
	//* 148  293:iconst_2        
	//* 149  294:aaload          
	//* 150  295:checkcast       #172 <Class Boolean>
	//* 151  298:invokevirtual   #175 <Method boolean Boolean.booleanValue()>
	//* 152  301:ifeq            324
	//* 153  304:aload           6
	//* 154  306:invokevirtual   #208 <Method float Float.floatValue()>
	//* 155  309:aload_0         
	//* 156  310:getfield        #45  <Field float originalWidth>
	//* 157  313:aload_0         
	//* 158  314:getfield        #47  <Field float width>
	//* 159  317:fsub            
	//* 160  318:fcmpg           
	//* 161  319:ifge            324
		{
			return pdfchunk;
	//  162  322:aload_1         
	//  163  323:areturn         
		} else
		{
			pdfchunk.adjustLeft(left);
	//  164  324:aload_1         
	//  165  325:aload_0         
	//  166  326:getfield        #43  <Field float left>
	//  167  329:invokevirtual   #216 <Method void PdfChunk.adjustLeft(float)>
			width = originalWidth - float1.floatValue();
	//  168  332:aload_0         
	//  169  333:aload_0         
	//  170  334:getfield        #45  <Field float originalWidth>
	//  171  337:aload           6
	//  172  339:invokevirtual   #208 <Method float Float.floatValue()>
	//  173  342:fsub            
	//  174  343:putfield        #47  <Field float width>
			addToLine(pdfchunk);
	//  175  346:aload_0         
	//  176  347:aload_1         
	//  177  348:invokespecial   #198 <Method void addToLine(PdfChunk)>
			return pdfchunk1;
	//  178  351:aload           4
	//  179  353:areturn         
		}
		if(pdfchunk.length() > 0 || pdfchunk.isImage())
	//* 180  354:aload_1         
	//* 181  355:invokevirtual   #217 <Method int PdfChunk.length()>
	//* 182  358:ifgt            368
	//* 183  361:aload_1         
	//* 184  362:invokevirtual   #71  <Method boolean PdfChunk.isImage()>
	//* 185  365:ifeq            399
		{
			if(pdfchunk1 != null)
	//* 186  368:aload           4
	//* 187  370:ifnull          378
				pdfchunk.trimLastSpace();
	//  188  373:aload_1         
	//  189  374:invokevirtual   #220 <Method float PdfChunk.trimLastSpace()>
	//  190  377:pop             
			width = width - pdfchunk.width();
	//  191  378:aload_0         
	//  192  379:aload_0         
	//  193  380:getfield        #47  <Field float width>
	//  194  383:aload_1         
	//  195  384:invokevirtual   #222 <Method float PdfChunk.width()>
	//  196  387:fsub            
	//  197  388:putfield        #47  <Field float width>
			addToLine(pdfchunk);
	//  198  391:aload_0         
	//  199  392:aload_1         
	//  200  393:invokespecial   #198 <Method void addToLine(PdfChunk)>
			return pdfchunk1;
	//  201  396:aload           4
	//  202  398:areturn         
		}
		if(line.size() < 1)
	//* 203  399:aload_0         
	//* 204  400:getfield        #51  <Field ArrayList line>
	//* 205  403:invokevirtual   #225 <Method int ArrayList.size()>
	//* 206  406:iconst_1        
	//* 207  407:icmpge          461
		{
			pdfchunk = pdfchunk1.truncate(width);
	//  208  410:aload           4
	//  209  412:aload_0         
	//  210  413:getfield        #47  <Field float width>
	//  211  416:invokevirtual   #228 <Method PdfChunk PdfChunk.truncate(float)>
	//  212  419:astore_1        
			width = width - pdfchunk1.width();
	//  213  420:aload_0         
	//  214  421:aload_0         
	//  215  422:getfield        #47  <Field float width>
	//  216  425:aload           4
	//  217  427:invokevirtual   #222 <Method float PdfChunk.width()>
	//  218  430:fsub            
	//  219  431:putfield        #47  <Field float width>
			if(pdfchunk1.length() > 0)
	//* 220  434:aload           4
	//* 221  436:invokevirtual   #217 <Method int PdfChunk.length()>
	//* 222  439:ifle            450
			{
				addToLine(pdfchunk1);
	//  223  442:aload_0         
	//  224  443:aload           4
	//  225  445:invokespecial   #198 <Method void addToLine(PdfChunk)>
				return pdfchunk;
	//  226  448:aload_1         
	//  227  449:areturn         
			}
			if(pdfchunk != null)
	//* 228  450:aload_1         
	//* 229  451:ifnull          459
				addToLine(pdfchunk);
	//  230  454:aload_0         
	//  231  455:aload_1         
	//  232  456:invokespecial   #198 <Method void addToLine(PdfChunk)>
			return null;
	//  233  459:aconst_null     
	//  234  460:areturn         
		} else
		{
			float f = width;
	//  235  461:aload_0         
	//  236  462:getfield        #47  <Field float width>
	//  237  465:fstore_2        
			width = ((PdfChunk)line.get(line.size() - 1)).trimLastSpace() + f;
	//  238  466:aload_0         
	//  239  467:aload_0         
	//  240  468:getfield        #51  <Field ArrayList line>
	//  241  471:aload_0         
	//  242  472:getfield        #51  <Field ArrayList line>
	//  243  475:invokevirtual   #225 <Method int ArrayList.size()>
	//  244  478:iconst_1        
	//  245  479:isub            
	//  246  480:invokevirtual   #232 <Method Object ArrayList.get(int)>
	//  247  483:checkcast       #64  <Class PdfChunk>
	//  248  486:invokevirtual   #220 <Method float PdfChunk.trimLastSpace()>
	//  249  489:fload_2         
	//  250  490:fadd            
	//  251  491:putfield        #47  <Field float width>
			return pdfchunk1;
	//  252  494:aload           4
	//  253  496:areturn         
		}
	}

	PdfChunk add(PdfChunk pdfchunk, float f)
	{
		if(pdfchunk != null && !pdfchunk.toString().equals("") && !pdfchunk.toString().equals(" ") && (height < f || line.isEmpty()))
	//*   0    0:aload_1         
	//*   1    1:ifnull          52
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #112 <Method String PdfChunk.toString()>
	//*   4    8:ldc1            #143 <String "">
	//*   5   10:invokevirtual   #146 <Method boolean String.equals(Object)>
	//*   6   13:ifne            52
	//*   7   16:aload_1         
	//*   8   17:invokevirtual   #112 <Method String PdfChunk.toString()>
	//*   9   20:ldc1            #235 <String " ">
	//*  10   22:invokevirtual   #146 <Method boolean String.equals(Object)>
	//*  11   25:ifne            52
	//*  12   28:aload_0         
	//*  13   29:getfield        #57  <Field float height>
	//*  14   32:fload_2         
	//*  15   33:fcmpg           
	//*  16   34:iflt            47
	//*  17   37:aload_0         
	//*  18   38:getfield        #51  <Field ArrayList line>
	//*  19   41:invokevirtual   #178 <Method boolean ArrayList.isEmpty()>
	//*  20   44:ifeq            52
			height = f;
	//   21   47:aload_0         
	//   22   48:fload_2         
	//   23   49:putfield        #57  <Field float height>
		return add(pdfchunk);
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:invokevirtual   #237 <Method PdfChunk add(PdfChunk)>
	//   27   57:areturn         
	}

	public void flush()
	{
		if(tabStop != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field TabStop tabStop>
	//*   2    4:ifnull          109
		{
			float f = originalWidth;
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field float originalWidth>
	//    5   11:fstore_1        
			float f2 = width;
	//    6   12:aload_0         
	//    7   13:getfield        #47  <Field float width>
	//    8   16:fstore_3        
			float f3 = tabPosition;
	//    9   17:aload_0         
	//   10   18:getfield        #41  <Field float tabPosition>
	//   11   21:fstore          4
			float f1 = tabStop.getPosition(tabPosition, originalWidth - width, tabStopAnchorPosition);
	//   12   23:aload_0         
	//   13   24:getfield        #36  <Field TabStop tabStop>
	//   14   27:aload_0         
	//   15   28:getfield        #41  <Field float tabPosition>
	//   16   31:aload_0         
	//   17   32:getfield        #45  <Field float originalWidth>
	//   18   35:aload_0         
	//   19   36:getfield        #47  <Field float width>
	//   20   39:fsub            
	//   21   40:aload_0         
	//   22   41:getfield        #39  <Field float tabStopAnchorPosition>
	//   23   44:invokevirtual   #240 <Method float TabStop.getPosition(float, float, float)>
	//   24   47:fstore_2        
			width = originalWidth - f1 - (f - f2 - f3);
	//   25   48:aload_0         
	//   26   49:aload_0         
	//   27   50:getfield        #45  <Field float originalWidth>
	//   28   53:fload_2         
	//   29   54:fsub            
	//   30   55:fload_1         
	//   31   56:fload_3         
	//   32   57:fsub            
	//   33   58:fload           4
	//   34   60:fsub            
	//   35   61:fsub            
	//   36   62:putfield        #47  <Field float width>
			f = f1;
	//   37   65:fload_2         
	//   38   66:fstore_1        
			if(width < 0.0F)
	//*  39   67:aload_0         
	//*  40   68:getfield        #47  <Field float width>
	//*  41   71:fconst_0        
	//*  42   72:fcmpg           
	//*  43   73:ifge            83
				f = f1 + width;
	//   44   76:fload_2         
	//   45   77:aload_0         
	//   46   78:getfield        #47  <Field float width>
	//   47   81:fadd            
	//   48   82:fstore_1        
			if(!isRTL)
	//*  49   83:aload_0         
	//*  50   84:getfield        #32  <Field boolean isRTL>
	//*  51   87:ifne            110
				tabStop.setPosition(f);
	//   52   90:aload_0         
	//   53   91:getfield        #36  <Field TabStop tabStop>
	//   54   94:fload_1         
	//   55   95:invokevirtual   #243 <Method void TabStop.setPosition(float)>
			else
	//*  56   98:aload_0         
	//*  57   99:aconst_null     
	//*  58  100:putfield        #36  <Field TabStop tabStop>
	//*  59  103:aload_0         
	//*  60  104:ldc1            #37  <Float (0.0F / 0.0F)>
	//*  61  106:putfield        #41  <Field float tabPosition>
	//*  62  109:return          
				tabStop.setPosition(originalWidth - width - tabPosition);
	//   63  110:aload_0         
	//   64  111:getfield        #36  <Field TabStop tabStop>
	//   65  114:aload_0         
	//   66  115:getfield        #45  <Field float originalWidth>
	//   67  118:aload_0         
	//   68  119:getfield        #47  <Field float width>
	//   69  122:fsub            
	//   70  123:aload_0         
	//   71  124:getfield        #41  <Field float tabPosition>
	//   72  127:fsub            
	//   73  128:invokevirtual   #243 <Method void TabStop.setPosition(float)>
			tabStop = null;
			tabPosition = (0.0F / 0.0F);
		}
	//*  74  131:goto            98
	}

	public float getAscender()
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_1        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		while(i < line.size()) 
	//*   4    4:iload_3         
	//*   5    5:aload_0         
	//*   6    6:getfield        #51  <Field ArrayList line>
	//*   7    9:invokevirtual   #225 <Method int ArrayList.size()>
	//*   8   12:icmpge          107
		{
			PdfChunk pdfchunk = (PdfChunk)line.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #51  <Field ArrayList line>
	//   11   19:iload_3         
	//   12   20:invokevirtual   #232 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #64  <Class PdfChunk>
	//   14   26:astore          4
			if(pdfchunk.isImage())
	//*  15   28:aload           4
	//*  16   30:invokevirtual   #71  <Method boolean PdfChunk.isImage()>
	//*  17   33:ifeq            59
			{
				f = Math.max(f, pdfchunk.getImageHeight() + pdfchunk.getImageOffsetY());
	//   18   36:fload_1         
	//   19   37:aload           4
	//   20   39:invokevirtual   #79  <Method float PdfChunk.getImageHeight()>
	//   21   42:aload           4
	//   22   44:invokevirtual   #82  <Method float PdfChunk.getImageOffsetY()>
	//   23   47:fadd            
	//   24   48:invokestatic    #248 <Method float Math.max(float, float)>
	//   25   51:fstore_1        
			} else
	//*  26   52:iload_3         
	//*  27   53:iconst_1        
	//*  28   54:iadd            
	//*  29   55:istore_3        
	//*  30   56:goto            4
			{
				PdfFont pdffont = pdfchunk.font();
	//   31   59:aload           4
	//   32   61:invokevirtual   #252 <Method PdfFont PdfChunk.font()>
	//   33   64:astore          5
				float f1 = pdfchunk.getTextRise();
	//   34   66:aload           4
	//   35   68:invokevirtual   #255 <Method float PdfChunk.getTextRise()>
	//   36   71:fstore_2        
				if(f1 <= 0.0F)
	//*  37   72:fload_2         
	//*  38   73:fconst_0        
	//*  39   74:fcmpl           
	//*  40   75:ifle            102
	//*  41   78:fload_1         
	//*  42   79:aload           5
	//*  43   81:invokevirtual   #261 <Method BaseFont PdfFont.getFont()>
	//*  44   84:iconst_1        
	//*  45   85:aload           5
	//*  46   87:invokevirtual   #263 <Method float PdfFont.size()>
	//*  47   90:invokevirtual   #269 <Method float BaseFont.getFontDescriptor(int, float)>
	//*  48   93:fload_2         
	//*  49   94:fadd            
	//*  50   95:invokestatic    #248 <Method float Math.max(float, float)>
	//*  51   98:fstore_1        
	//*  52   99:goto            52
					f1 = 0.0F;
	//   53  102:fconst_0        
	//   54  103:fstore_2        
				f = Math.max(f, pdffont.getFont().getFontDescriptor(1, pdffont.size()) + f1);
			}
			i++;
		}
	//*  55  104:goto            78
		return f;
	//   56  107:fload_1         
	//   57  108:freturn         
	}

	public PdfChunk getChunk(int i)
	{
		if(i < 0 || i >= line.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            15
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #51  <Field ArrayList line>
	//*   5    9:invokevirtual   #225 <Method int ArrayList.size()>
	//*   6   12:icmplt          17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		else
			return (PdfChunk)line.get(i);
	//    9   17:aload_0         
	//   10   18:getfield        #51  <Field ArrayList line>
	//   11   21:iload_1         
	//   12   22:invokevirtual   #232 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #64  <Class PdfChunk>
	//   14   28:areturn         
	}

	public float getDescender()
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_1        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		while(i < line.size()) 
	//*   4    4:iload_3         
	//*   5    5:aload_0         
	//*   6    6:getfield        #51  <Field ArrayList line>
	//*   7    9:invokevirtual   #225 <Method int ArrayList.size()>
	//*   8   12:icmpge          101
		{
			PdfChunk pdfchunk = (PdfChunk)line.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #51  <Field ArrayList line>
	//   11   19:iload_3         
	//   12   20:invokevirtual   #232 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #64  <Class PdfChunk>
	//   14   26:astore          4
			if(pdfchunk.isImage())
	//*  15   28:aload           4
	//*  16   30:invokevirtual   #71  <Method boolean PdfChunk.isImage()>
	//*  17   33:ifeq            53
			{
				f = Math.min(f, pdfchunk.getImageOffsetY());
	//   18   36:fload_1         
	//   19   37:aload           4
	//   20   39:invokevirtual   #82  <Method float PdfChunk.getImageOffsetY()>
	//   21   42:invokestatic    #275 <Method float Math.min(float, float)>
	//   22   45:fstore_1        
			} else
	//*  23   46:iload_3         
	//*  24   47:iconst_1        
	//*  25   48:iadd            
	//*  26   49:istore_3        
	//*  27   50:goto            4
			{
				PdfFont pdffont = pdfchunk.font();
	//   28   53:aload           4
	//   29   55:invokevirtual   #252 <Method PdfFont PdfChunk.font()>
	//   30   58:astore          5
				float f1 = pdfchunk.getTextRise();
	//   31   60:aload           4
	//   32   62:invokevirtual   #255 <Method float PdfChunk.getTextRise()>
	//   33   65:fstore_2        
				if(f1 >= 0.0F)
	//*  34   66:fload_2         
	//*  35   67:fconst_0        
	//*  36   68:fcmpg           
	//*  37   69:ifge            96
	//*  38   72:fload_1         
	//*  39   73:aload           5
	//*  40   75:invokevirtual   #261 <Method BaseFont PdfFont.getFont()>
	//*  41   78:iconst_3        
	//*  42   79:aload           5
	//*  43   81:invokevirtual   #263 <Method float PdfFont.size()>
	//*  44   84:invokevirtual   #269 <Method float BaseFont.getFontDescriptor(int, float)>
	//*  45   87:fload_2         
	//*  46   88:fadd            
	//*  47   89:invokestatic    #275 <Method float Math.min(float, float)>
	//*  48   92:fstore_1        
	//*  49   93:goto            46
					f1 = 0.0F;
	//   50   96:fconst_0        
	//   51   97:fstore_2        
				f = Math.min(f, pdffont.getFont().getFontDescriptor(3, pdffont.size()) + f1);
			}
			i++;
		}
	//*  52   98:goto            72
		return f;
	//   53  101:fload_1         
	//   54  102:freturn         
	}

	public int getLastStrokeChunk()
	{
		int i = line.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList line>
	//    2    4:invokevirtual   #225 <Method int ArrayList.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_1        
		do
		{
			if(i < 0 || ((PdfChunk)line.get(i)).isStroked())
	//*   6   10:iload_1         
	//*   7   11:iflt            31
	//*   8   14:aload_0         
	//*   9   15:getfield        #51  <Field ArrayList line>
	//*  10   18:iload_1         
	//*  11   19:invokevirtual   #232 <Method Object ArrayList.get(int)>
	//*  12   22:checkcast       #64  <Class PdfChunk>
	//*  13   25:invokevirtual   #279 <Method boolean PdfChunk.isStroked()>
	//*  14   28:ifeq            33
				return i;
	//   15   31:iload_1         
	//   16   32:ireturn         
			i--;
	//   17   33:iload_1         
	//   18   34:iconst_1        
	//   19   35:isub            
	//   20   36:istore_1        
		} while(true);
	//   21   37:goto            10
	}

	public int getLineLengthUtf32()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		for(Iterator iterator1 = line.iterator(); iterator1.hasNext();)
	//*   2    2:aload_0         
	//*   3    3:getfield        #51  <Field ArrayList line>
	//*   4    6:invokevirtual   #284 <Method Iterator ArrayList.iterator()>
	//*   5    9:astore_2        
	//*   6   10:aload_2         
	//*   7   11:invokeinterface #289 <Method boolean Iterator.hasNext()>
	//*   8   16:ifeq            37
			i += ((PdfChunk)iterator1.next()).lengthUtf32();
	//    9   19:iload_1         
	//   10   20:aload_2         
	//   11   21:invokeinterface #293 <Method Object Iterator.next()>
	//   12   26:checkcast       #64  <Class PdfChunk>
	//   13   29:invokevirtual   #296 <Method int PdfChunk.lengthUtf32()>
	//   14   32:iadd            
	//   15   33:istore_1        

	//*  16   34:goto            10
		return i;
	//   17   37:iload_1         
	//   18   38:ireturn         
	}

	float[] getMaxSize(float f, float f1)
	{
		float f2 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_3        
		float f4 = -10000F;
	//    2    2:ldc2            #299 <Float -10000F>
	//    3    5:fstore          5
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore          7
		while(i < line.size()) 
	//*   6   10:iload           7
	//*   7   12:aload_0         
	//*   8   13:getfield        #51  <Field ArrayList line>
	//*   9   16:invokevirtual   #225 <Method int ArrayList.size()>
	//*  10   19:icmpge          160
		{
			PdfChunk pdfchunk = (PdfChunk)line.get(i);
	//   11   22:aload_0         
	//   12   23:getfield        #51  <Field ArrayList line>
	//   13   26:iload           7
	//   14   28:invokevirtual   #232 <Method Object ArrayList.get(int)>
	//   15   31:checkcast       #64  <Class PdfChunk>
	//   16   34:astore          8
			float f3;
			float f5;
			if(pdfchunk.isImage())
	//*  17   36:aload           8
	//*  18   38:invokevirtual   #71  <Method boolean PdfChunk.isImage()>
	//*  19   41:ifeq            109
			{
				Image image = pdfchunk.getImage();
	//   20   44:aload           8
	//   21   46:invokevirtual   #75  <Method Image PdfChunk.getImage()>
	//   22   49:astore          9
				f5 = f4;
	//   23   51:fload           5
	//   24   53:fstore          6
				f3 = f2;
	//   25   55:fload_3         
	//   26   56:fstore          4
				if(pdfchunk.changeLeading())
	//*  27   58:aload           8
	//*  28   60:invokevirtual   #301 <Method boolean PdfChunk.changeLeading()>
	//*  29   63:ifeq            93
				{
					f5 = Math.max(pdfchunk.getImageHeight() + pdfchunk.getImageOffsetY() + image.getSpacingBefore(), f4);
	//   30   66:aload           8
	//   31   68:invokevirtual   #79  <Method float PdfChunk.getImageHeight()>
	//   32   71:aload           8
	//   33   73:invokevirtual   #82  <Method float PdfChunk.getImageOffsetY()>
	//   34   76:fadd            
	//   35   77:aload           9
	//   36   79:invokevirtual   #90  <Method float Image.getSpacingBefore()>
	//   37   82:fadd            
	//   38   83:fload           5
	//   39   85:invokestatic    #248 <Method float Math.max(float, float)>
	//   40   88:fstore          6
					f3 = f2;
	//   41   90:fload_3         
	//   42   91:fstore          4
				}
			} else
	//*  43   93:iload           7
	//*  44   95:iconst_1        
	//*  45   96:iadd            
	//*  46   97:istore          7
	//*  47   99:fload           6
	//*  48  101:fstore          5
	//*  49  103:fload           4
	//*  50  105:fstore_3        
	//*  51  106:goto            10
			if(pdfchunk.changeLeading())
	//*  52  109:aload           8
	//*  53  111:invokevirtual   #301 <Method boolean PdfChunk.changeLeading()>
	//*  54  114:ifeq            135
			{
				f3 = Math.max(pdfchunk.getLeading(), f2);
	//   55  117:aload           8
	//   56  119:invokevirtual   #140 <Method float PdfChunk.getLeading()>
	//   57  122:fload_3         
	//   58  123:invokestatic    #248 <Method float Math.max(float, float)>
	//   59  126:fstore          4
				f5 = f4;
	//   60  128:fload           5
	//   61  130:fstore          6
			} else
	//*  62  132:goto            93
			{
				f3 = Math.max(pdfchunk.font().size() * f1 + f, f2);
	//   63  135:aload           8
	//   64  137:invokevirtual   #252 <Method PdfFont PdfChunk.font()>
	//   65  140:invokevirtual   #263 <Method float PdfFont.size()>
	//   66  143:fload_2         
	//   67  144:fmul            
	//   68  145:fload_1         
	//   69  146:fadd            
	//   70  147:fload_3         
	//   71  148:invokestatic    #248 <Method float Math.max(float, float)>
	//   72  151:fstore          4
				f5 = f4;
	//   73  153:fload           5
	//   74  155:fstore          6
			}
			i++;
			f4 = f5;
			f2 = f3;
		}
	//*  75  157:goto            93
		if(f2 <= 0.0F)
	//*  76  160:fload_3         
	//*  77  161:fconst_0        
	//*  78  162:fcmpl           
	//*  79  163:ifle            179
	//*  80  166:iconst_2        
	//*  81  167:newarray        float[]
	//*  82  169:dup             
	//*  83  170:iconst_0        
	//*  84  171:fload_3         
	//*  85  172:fastore         
	//*  86  173:dup             
	//*  87  174:iconst_1        
	//*  88  175:fload           5
	//*  89  177:fastore         
	//*  90  178:areturn         
			f2 = f;
	//   91  179:fload_1         
	//   92  180:fstore_3        
		return (new float[] {
			f2, f4
		});
	//*  93  181:goto            166
	}

	public float getOriginalWidth()
	{
		return originalWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field float originalWidth>
	//    2    4:freturn         
	}

	int getSeparatorCount()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		Iterator iterator1 = line.iterator();
	//    2    2:aload_0         
	//    3    3:getfield        #51  <Field ArrayList line>
	//    4    6:invokevirtual   #284 <Method Iterator ArrayList.iterator()>
	//    5    9:astore_3        
		do
		{
			PdfChunk pdfchunk;
label0:
			{
				int j = i;
	//    6   10:iload_1         
	//    7   11:istore_2        
				if(iterator1.hasNext())
	//*   8   12:aload_3         
	//*   9   13:invokeinterface #289 <Method boolean Iterator.hasNext()>
	//*  10   18:ifeq            52
				{
					pdfchunk = (PdfChunk)iterator1.next();
	//   11   21:aload_3         
	//   12   22:invokeinterface #293 <Method Object Iterator.next()>
	//   13   27:checkcast       #64  <Class PdfChunk>
	//   14   30:astore          4
					if(!pdfchunk.isTab())
						break label0;
	//   15   32:aload           4
	//   16   34:invokevirtual   #156 <Method boolean PdfChunk.isTab()>
	//   17   37:ifeq            54
					if(pdfchunk.isAttribute("TABSETTINGS"))
						continue;
	//   18   40:aload           4
	//   19   42:ldc1            #166 <String "TABSETTINGS">
	//   20   44:invokevirtual   #170 <Method boolean PdfChunk.isAttribute(String)>
	//   21   47:ifne            10
					j = -1;
	//   22   50:iconst_m1       
	//   23   51:istore_2        
				}
				return j;
	//   24   52:iload_2         
	//   25   53:ireturn         
			}
			if(pdfchunk.isHorizontalSeparator())
	//*  26   54:aload           4
	//*  27   56:invokevirtual   #306 <Method boolean PdfChunk.isHorizontalSeparator()>
	//*  28   59:ifeq            10
				i++;
	//   29   62:iload_1         
	//   30   63:iconst_1        
	//   31   64:iadd            
	//   32   65:istore_1        
		} while(true);
	//   33   66:goto            10
	}

	public float getWidthCorrected(float f, float f1)
	{
		float f2 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_3        
		for(int i = 0; i < line.size(); i++)
	//*   2    2:iconst_0        
	//*   3    3:istore          4
	//*   4    5:iload           4
	//*   5    7:aload_0         
	//*   6    8:getfield        #51  <Field ArrayList line>
	//*   7   11:invokevirtual   #225 <Method int ArrayList.size()>
	//*   8   14:icmpge          46
			f2 += ((PdfChunk)line.get(i)).getWidthCorrected(f, f1);
	//    9   17:fload_3         
	//   10   18:aload_0         
	//   11   19:getfield        #51  <Field ArrayList line>
	//   12   22:iload           4
	//   13   24:invokevirtual   #232 <Method Object ArrayList.get(int)>
	//   14   27:checkcast       #64  <Class PdfChunk>
	//   15   30:fload_1         
	//   16   31:fload_2         
	//   17   32:invokevirtual   #309 <Method float PdfChunk.getWidthCorrected(float, float)>
	//   18   35:fadd            
	//   19   36:fstore_3        

	//   20   37:iload           4
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore          4
	//*  24   43:goto            5
		return f2;
	//   25   46:fload_3         
	//   26   47:freturn         
	}

	public boolean hasToBeJustified()
	{
		return (alignment == 3 && !newlineSplit || alignment == 8) && width != 0.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int alignment>
	//    2    4:iconst_3        
	//    3    5:icmpne          15
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field boolean newlineSplit>
	//    6   12:ifeq            24
	//    7   15:aload_0         
	//    8   16:getfield        #49  <Field int alignment>
	//    9   19:bipush          8
	//   10   21:icmpne          35
	//   11   24:aload_0         
	//   12   25:getfield        #47  <Field float width>
	//   13   28:fconst_0        
	//   14   29:fcmpl           
	//   15   30:ifeq            35
	//   16   33:iconst_1        
	//   17   34:ireturn         
	//   18   35:iconst_0        
	//   19   36:ireturn         
	}

	float height()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field float height>
	//    2    4:freturn         
	}

	float indentLeft()
	{
		if(isRTL)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean isRTL>
	//*   2    4:ifeq            89
		{
			float f1;
			switch(alignment)
	//*   3    7:aload_0         
	//*   4    8:getfield        #49  <Field int alignment>
			{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 46
	//	               2 58
	//	               3 63
			default:
				return left + width;
	//    6   36:aload_0         
	//    7   37:getfield        #43  <Field float left>
	//    8   40:aload_0         
	//    9   41:getfield        #47  <Field float width>
	//   10   44:fadd            
	//   11   45:freturn         

			case 1: // '\001'
				return left + width / 2.0F;
	//   12   46:aload_0         
	//   13   47:getfield        #43  <Field float left>
	//   14   50:aload_0         
	//   15   51:getfield        #47  <Field float width>
	//   16   54:fconst_2        
	//   17   55:fdiv            
	//   18   56:fadd            
	//   19   57:freturn         

			case 2: // '\002'
				return left;
	//   20   58:aload_0         
	//   21   59:getfield        #43  <Field float left>
	//   22   62:freturn         

			case 3: // '\003'
				f1 = left;
	//   23   63:aload_0         
	//   24   64:getfield        #43  <Field float left>
	//   25   67:fstore_2        
				break;
			}
			float f;
			if(hasToBeJustified())
	//*  26   68:aload_0         
	//*  27   69:invokevirtual   #313 <Method boolean hasToBeJustified()>
	//*  28   72:ifeq            81
				f = 0.0F;
	//   29   75:fconst_0        
	//   30   76:fstore_1        
			else
	//*  31   77:fload_1         
	//*  32   78:fload_2         
	//*  33   79:fadd            
	//*  34   80:freturn         
				f = width;
	//   35   81:aload_0         
	//   36   82:getfield        #47  <Field float width>
	//   37   85:fstore_1        
			return f + f1;
		}
	//*  38   86:goto            77
		if(getSeparatorCount() > 0) goto _L2; else goto _L1
	//   39   89:aload_0         
	//   40   90:invokevirtual   #315 <Method int getSeparatorCount()>
	//   41   93:ifgt            124
_L1:
		alignment;
	//   42   96:aload_0         
	//   43   97:getfield        #49  <Field int alignment>
		JVM INSTR tableswitch 1 2: default 124
	//	               1 139
	//	               2 129;
	//   44  100:tableswitch     1 2: default 124
	//	               1 139
	//	               2 129
		   goto _L2 _L3 _L4
_L2:
		return left;
	//   45  124:aload_0         
	//   46  125:getfield        #43  <Field float left>
	//   47  128:freturn         
_L4:
		return left + width;
	//   48  129:aload_0         
	//   49  130:getfield        #43  <Field float left>
	//   50  133:aload_0         
	//   51  134:getfield        #47  <Field float width>
	//   52  137:fadd            
	//   53  138:freturn         
_L3:
		return left + width / 2.0F;
	//   54  139:aload_0         
	//   55  140:getfield        #43  <Field float left>
	//   56  143:aload_0         
	//   57  144:getfield        #47  <Field float width>
	//   58  147:fconst_2        
	//   59  148:fdiv            
	//   60  149:fadd            
	//   61  150:freturn         
	}

	public boolean isNewlineSplit()
	{
		return newlineSplit && alignment != 8;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean newlineSplit>
	//    2    4:ifeq            18
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field int alignment>
	//    5   11:bipush          8
	//    6   13:icmpeq          18
	//    7   16:iconst_1        
	//    8   17:ireturn         
	//    9   18:iconst_0        
	//   10   19:ireturn         
	}

	boolean isRTL()
	{
		return isRTL;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean isRTL>
	//    2    4:ireturn         
	}

	public Iterator iterator()
	{
		return line.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList line>
	//    2    4:invokevirtual   #284 <Method Iterator ArrayList.iterator()>
	//    3    7:areturn         
	}

	public float listIndent()
	{
		if(listItem != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field ListItem listItem>
	//*   2    4:ifnull          15
			return listItem.getIndentationLeft();
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field ListItem listItem>
	//    5   11:invokevirtual   #322 <Method float ListItem.getIndentationLeft()>
	//    6   14:freturn         
		else
			return 0.0F;
	//    7   15:fconst_0        
	//    8   16:freturn         
	}

	public ListItem listItem()
	{
		return listItem;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ListItem listItem>
	//    2    4:areturn         
	}

	public Chunk listSymbol()
	{
		if(listItem != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field ListItem listItem>
	//*   2    4:ifnull          15
			return listItem.getListSymbol();
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field ListItem listItem>
	//    5   11:invokevirtual   #328 <Method Chunk ListItem.getListSymbol()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	int numberOfSpaces()
	{
		int k;
		k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		Iterator iterator1 = line.iterator();
	//    2    2:aload_0         
	//    3    3:getfield        #51  <Field ArrayList line>
	//    4    6:invokevirtual   #284 <Method Iterator ArrayList.iterator()>
	//    5    9:astore          5
		do
		{
label0:
			{
				if(!iterator1.hasNext())
					break label0;
	//    6   11:aload           5
	//    7   13:invokeinterface #289 <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            81
				String s = ((PdfChunk)iterator1.next()).toString();
	//    9   21:aload           5
	//   10   23:invokeinterface #293 <Method Object Iterator.next()>
	//   11   28:checkcast       #64  <Class PdfChunk>
	//   12   31:invokevirtual   #112 <Method String PdfChunk.toString()>
	//   13   34:astore          6
				int l = s.length();
	//   14   36:aload           6
	//   15   38:invokevirtual   #126 <Method int String.length()>
	//   16   41:istore          4
				int i = 0;
	//   17   43:iconst_0        
	//   18   44:istore_1        
				int j = k;
	//   19   45:iload_3         
	//   20   46:istore_2        
				do
				{
					k = j;
	//   21   47:iload_2         
	//   22   48:istore_3        
					if(i >= l)
						break;
	//   23   49:iload_1         
	//   24   50:iload           4
	//   25   52:icmpge          11
					k = j;
	//   26   55:iload_2         
	//   27   56:istore_3        
					if(s.charAt(i) == ' ')
	//*  28   57:aload           6
	//*  29   59:iload_1         
	//*  30   60:invokevirtual   #333 <Method char String.charAt(int)>
	//*  31   63:bipush          32
	//*  32   65:icmpne          72
						k = j + 1;
	//   33   68:iload_2         
	//   34   69:iconst_1        
	//   35   70:iadd            
	//   36   71:istore_3        
					i++;
	//   37   72:iload_1         
	//   38   73:iconst_1        
	//   39   74:iadd            
	//   40   75:istore_1        
					j = k;
	//   41   76:iload_3         
	//   42   77:istore_2        
				} while(true);
	//   43   78:goto            47
			}
		} while(true);
		return k;
	//   44   81:iload_3         
	//   45   82:ireturn         
	}

	public void resetAlignment()
	{
		if(alignment == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field int alignment>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          13
			alignment = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #49  <Field int alignment>
	//    7   13:return          
	}

	void setExtraIndent(float f)
	{
		left = left + f;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field float left>
	//    3    5:fload_1         
	//    4    6:fadd            
	//    5    7:putfield        #43  <Field float left>
		width = width - f;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #47  <Field float width>
	//    9   15:fload_1         
	//   10   16:fsub            
	//   11   17:putfield        #47  <Field float width>
		originalWidth = originalWidth - f;
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #45  <Field float originalWidth>
	//   15   25:fload_1         
	//   16   26:fsub            
	//   17   27:putfield        #45  <Field float originalWidth>
	//   18   30:return          
	}

	public void setListItem(ListItem listitem)
	{
		listItem = listitem;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field ListItem listItem>
	//    3    5:return          
	}

	public int size()
	{
		return line.size();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ArrayList line>
	//    2    4:invokevirtual   #225 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #339 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #340 <Method void StringBuffer()>
	//    3    7:astore_1        
		for(Iterator iterator1 = line.iterator(); iterator1.hasNext(); stringbuffer.append(((PdfChunk)iterator1.next()).toString()));
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field ArrayList line>
	//    6   12:invokevirtual   #284 <Method Iterator ArrayList.iterator()>
	//    7   15:astore_2        
	//    8   16:aload_2         
	//    9   17:invokeinterface #289 <Method boolean Iterator.hasNext()>
	//   10   22:ifeq            45
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:invokeinterface #293 <Method Object Iterator.next()>
	//   14   32:checkcast       #64  <Class PdfChunk>
	//   15   35:invokevirtual   #112 <Method String PdfChunk.toString()>
	//   16   38:invokevirtual   #344 <Method StringBuffer StringBuffer.append(String)>
	//   17   41:pop             
	//*  18   42:goto            16
		return stringbuffer.toString();
	//   19   45:aload_1         
	//   20   46:invokevirtual   #345 <Method String StringBuffer.toString()>
	//   21   49:areturn         
	}

	float widthLeft()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float width>
	//    2    4:freturn         
	}

	protected int alignment;
	protected float height;
	protected boolean isRTL;
	protected float left;
	protected ArrayList line;
	protected ListItem listItem;
	protected boolean newlineSplit;
	protected float originalWidth;
	protected float tabPosition;
	protected TabStop tabStop;
	protected float tabStopAnchorPosition;
	protected float width;
}
