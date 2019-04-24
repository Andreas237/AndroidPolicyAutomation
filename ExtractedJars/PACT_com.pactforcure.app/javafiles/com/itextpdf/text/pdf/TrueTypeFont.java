// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.File;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			BaseFont, IntHashtable, PdfEncodings, RandomAccessFileOrArray, 
//			PdfDictionary, PdfName, PdfNumber, PdfArray, 
//			PdfRectangle, TrueTypeFontSubSet, PdfWriter, PdfIndirectObject, 
//			GlyphList, PdfIndirectReference, PdfStream

class TrueTypeFont extends BaseFont
{
	protected static class FontHeader
	{

		int flags;
		int macStyle;
		int unitsPerEm;
		short xMax;
		short xMin;
		short yMax;
		short yMin;

		protected FontHeader()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	protected static class HorizontalHeader
	{

		short Ascender;
		short Descender;
		short LineGap;
		int advanceWidthMax;
		short caretSlopeRise;
		short caretSlopeRun;
		short minLeftSideBearing;
		short minRightSideBearing;
		int numberOfHMetrics;
		short xMaxExtent;

		protected HorizontalHeader()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
		//    2    4:return          
		}
	}

	protected static class WindowsMetrics
	{

		byte achVendID[];
		int fsSelection;
		short fsType;
		byte panose[];
		int sCapHeight;
		short sFamilyClass;
		short sTypoAscender;
		short sTypoDescender;
		short sTypoLineGap;
		int ulCodePageRange1;
		int ulCodePageRange2;
		int usFirstCharIndex;
		int usLastCharIndex;
		int usWeightClass;
		int usWidthClass;
		int usWinAscent;
		int usWinDescent;
		short xAvgCharWidth;
		short yStrikeoutPosition;
		short yStrikeoutSize;
		short ySubscriptXOffset;
		short ySubscriptXSize;
		short ySubscriptYOffset;
		short ySubscriptYSize;
		short ySuperscriptXOffset;
		short ySuperscriptXSize;
		short ySuperscriptYOffset;
		short ySuperscriptYSize;

		protected WindowsMetrics()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void Object()>
			panose = new byte[10];
		//    2    4:aload_0         
		//    3    5:bipush          10
		//    4    7:newarray        byte[]
		//    5    9:putfield        #44  <Field byte[] panose>
			achVendID = new byte[4];
		//    6   12:aload_0         
		//    7   13:iconst_4        
		//    8   14:newarray        byte[]
		//    9   16:putfield        #46  <Field byte[] achVendID>
		//   10   19:return          
		}
	}


	protected TrueTypeFont()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void BaseFont()>
		justNames = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #140 <Field boolean justNames>
		cff = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #142 <Field boolean cff>
		style = "";
	//    8   14:aload_0         
	//    9   15:ldc1            #144 <String "">
	//   10   17:putfield        #146 <Field String style>
		head = new FontHeader();
	//   11   20:aload_0         
	//   12   21:new             #6   <Class TrueTypeFont$FontHeader>
	//   13   24:dup             
	//   14   25:invokespecial   #147 <Method void TrueTypeFont$FontHeader()>
	//   15   28:putfield        #149 <Field TrueTypeFont$FontHeader head>
		hhea = new HorizontalHeader();
	//   16   31:aload_0         
	//   17   32:new             #9   <Class TrueTypeFont$HorizontalHeader>
	//   18   35:dup             
	//   19   36:invokespecial   #150 <Method void TrueTypeFont$HorizontalHeader()>
	//   20   39:putfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
		os_2 = new WindowsMetrics();
	//   21   42:aload_0         
	//   22   43:new             #12  <Class TrueTypeFont$WindowsMetrics>
	//   23   46:dup             
	//   24   47:invokespecial   #153 <Method void TrueTypeFont$WindowsMetrics()>
	//   25   50:putfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
		kerning = new IntHashtable();
	//   26   53:aload_0         
	//   27   54:new             #157 <Class IntHashtable>
	//   28   57:dup             
	//   29   58:invokespecial   #158 <Method void IntHashtable()>
	//   30   61:putfield        #160 <Field IntHashtable kerning>
		isFixedPitch = false;
	//   31   64:aload_0         
	//   32   65:iconst_0        
	//   33   66:putfield        #162 <Field boolean isFixedPitch>
	//   34   69:return          
	}

	TrueTypeFont(String s, String s1, boolean flag, byte abyte0[], boolean flag1, boolean flag2)
		throws DocumentException, IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void BaseFont()>
		justNames = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #140 <Field boolean justNames>
		cff = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #142 <Field boolean cff>
		style = "";
	//    8   14:aload_0         
	//    9   15:ldc1            #144 <String "">
	//   10   17:putfield        #146 <Field String style>
		head = new FontHeader();
	//   11   20:aload_0         
	//   12   21:new             #6   <Class TrueTypeFont$FontHeader>
	//   13   24:dup             
	//   14   25:invokespecial   #147 <Method void TrueTypeFont$FontHeader()>
	//   15   28:putfield        #149 <Field TrueTypeFont$FontHeader head>
		hhea = new HorizontalHeader();
	//   16   31:aload_0         
	//   17   32:new             #9   <Class TrueTypeFont$HorizontalHeader>
	//   18   35:dup             
	//   19   36:invokespecial   #150 <Method void TrueTypeFont$HorizontalHeader()>
	//   20   39:putfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
		os_2 = new WindowsMetrics();
	//   21   42:aload_0         
	//   22   43:new             #12  <Class TrueTypeFont$WindowsMetrics>
	//   23   46:dup             
	//   24   47:invokespecial   #153 <Method void TrueTypeFont$WindowsMetrics()>
	//   25   50:putfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
		kerning = new IntHashtable();
	//   26   53:aload_0         
	//   27   54:new             #157 <Class IntHashtable>
	//   28   57:dup             
	//   29   58:invokespecial   #158 <Method void IntHashtable()>
	//   30   61:putfield        #160 <Field IntHashtable kerning>
		isFixedPitch = false;
	//   31   64:aload_0         
	//   32   65:iconst_0        
	//   33   66:putfield        #162 <Field boolean isFixedPitch>
		justNames = flag1;
	//   34   69:aload_0         
	//   35   70:iload           5
	//   36   72:putfield        #140 <Field boolean justNames>
		String s2 = getBaseName(s);
	//   37   75:aload_1         
	//   38   76:invokestatic    #171 <Method String getBaseName(String)>
	//   39   79:astore          7
		String s3 = getTTCName(s2);
	//   40   81:aload           7
	//   41   83:invokestatic    #174 <Method String getTTCName(String)>
	//   42   86:astore          8
		if(s2.length() < s.length())
	//*  43   88:aload           7
	//*  44   90:invokevirtual   #178 <Method int String.length()>
	//*  45   93:aload_1         
	//*  46   94:invokevirtual   #178 <Method int String.length()>
	//*  47   97:icmpge          113
			style = s.substring(s2.length());
	//   48  100:aload_0         
	//   49  101:aload_1         
	//   50  102:aload           7
	//   51  104:invokevirtual   #178 <Method int String.length()>
	//   52  107:invokevirtual   #182 <Method String String.substring(int)>
	//   53  110:putfield        #146 <Field String style>
		encoding = s1;
	//   54  113:aload_0         
	//   55  114:aload_2         
	//   56  115:putfield        #185 <Field String encoding>
		embedded = flag;
	//   57  118:aload_0         
	//   58  119:iload_3         
	//   59  120:putfield        #188 <Field boolean embedded>
		fileName = s3;
	//   60  123:aload_0         
	//   61  124:aload           8
	//   62  126:putfield        #190 <Field String fileName>
		fontType = 1;
	//   63  129:aload_0         
	//   64  130:iconst_1        
	//   65  131:putfield        #193 <Field int fontType>
		ttcIndex = "";
	//   66  134:aload_0         
	//   67  135:ldc1            #144 <String "">
	//   68  137:putfield        #195 <Field String ttcIndex>
		if(s3.length() < s2.length())
	//*  69  140:aload           8
	//*  70  142:invokevirtual   #178 <Method int String.length()>
	//*  71  145:aload           7
	//*  72  147:invokevirtual   #178 <Method int String.length()>
	//*  73  150:icmpge          169
			ttcIndex = s2.substring(s3.length() + 1);
	//   74  153:aload_0         
	//   75  154:aload           7
	//   76  156:aload           8
	//   77  158:invokevirtual   #178 <Method int String.length()>
	//   78  161:iconst_1        
	//   79  162:iadd            
	//   80  163:invokevirtual   #182 <Method String String.substring(int)>
	//   81  166:putfield        #195 <Field String ttcIndex>
		if(fileName.toLowerCase().endsWith(".ttf") || fileName.toLowerCase().endsWith(".otf") || fileName.toLowerCase().endsWith(".ttc"))
	//*  82  169:aload_0         
	//*  83  170:getfield        #190 <Field String fileName>
	//*  84  173:invokevirtual   #199 <Method String String.toLowerCase()>
	//*  85  176:ldc1            #201 <String ".ttf">
	//*  86  178:invokevirtual   #205 <Method boolean String.endsWith(String)>
	//*  87  181:ifne            214
	//*  88  184:aload_0         
	//*  89  185:getfield        #190 <Field String fileName>
	//*  90  188:invokevirtual   #199 <Method String String.toLowerCase()>
	//*  91  191:ldc1            #207 <String ".otf">
	//*  92  193:invokevirtual   #205 <Method boolean String.endsWith(String)>
	//*  93  196:ifne            214
	//*  94  199:aload_0         
	//*  95  200:getfield        #190 <Field String fileName>
	//*  96  203:invokevirtual   #199 <Method String String.toLowerCase()>
	//*  97  206:ldc1            #209 <String ".ttc">
	//*  98  208:invokevirtual   #205 <Method boolean String.endsWith(String)>
	//*  99  211:ifeq            289
		{
			process(abyte0, flag2);
	//  100  214:aload_0         
	//  101  215:aload           4
	//  102  217:iload           6
	//  103  219:invokevirtual   #213 <Method void process(byte[], boolean)>
			if(!flag1 && embedded && os_2.fsType == 2)
	//* 104  222:iload           5
	//* 105  224:ifne            333
	//* 106  227:aload_0         
	//* 107  228:getfield        #188 <Field boolean embedded>
	//* 108  231:ifeq            333
	//* 109  234:aload_0         
	//* 110  235:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 111  238:getfield        #217 <Field short TrueTypeFont$WindowsMetrics.fsType>
	//* 112  241:iconst_2        
	//* 113  242:icmpne          333
				throw new DocumentException(MessageLocalization.getComposedMessage("1.cannot.be.embedded.due.to.licensing.restrictions", new Object[] {
					(new StringBuilder()).append(fileName).append(style).toString()
				}));
	//  114  245:new             #165 <Class DocumentException>
	//  115  248:dup             
	//  116  249:ldc1            #219 <String "1.cannot.be.embedded.due.to.licensing.restrictions">
	//  117  251:iconst_1        
	//  118  252:anewarray       Object[]
	//  119  255:dup             
	//  120  256:iconst_0        
	//  121  257:new             #223 <Class StringBuilder>
	//  122  260:dup             
	//  123  261:invokespecial   #224 <Method void StringBuilder()>
	//  124  264:aload_0         
	//  125  265:getfield        #190 <Field String fileName>
	//  126  268:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  127  271:aload_0         
	//  128  272:getfield        #146 <Field String style>
	//  129  275:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  130  278:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  131  281:aastore         
	//  132  282:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  133  285:invokespecial   #240 <Method void DocumentException(String)>
	//  134  288:athrow          
		} else
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("1.is.not.a.ttf.otf.or.ttc.font.file", new Object[] {
				(new StringBuilder()).append(fileName).append(style).toString()
			}));
	//  135  289:new             #165 <Class DocumentException>
	//  136  292:dup             
	//  137  293:ldc1            #242 <String "1.is.not.a.ttf.otf.or.ttc.font.file">
	//  138  295:iconst_1        
	//  139  296:anewarray       Object[]
	//  140  299:dup             
	//  141  300:iconst_0        
	//  142  301:new             #223 <Class StringBuilder>
	//  143  304:dup             
	//  144  305:invokespecial   #224 <Method void StringBuilder()>
	//  145  308:aload_0         
	//  146  309:getfield        #190 <Field String fileName>
	//  147  312:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  148  315:aload_0         
	//  149  316:getfield        #146 <Field String style>
	//  150  319:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  151  322:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  152  325:aastore         
	//  153  326:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  154  329:invokespecial   #240 <Method void DocumentException(String)>
	//  155  332:athrow          
		}
		if(!encoding.startsWith("#"))
	//* 156  333:aload_0         
	//* 157  334:getfield        #185 <Field String encoding>
	//* 158  337:ldc1            #244 <String "#">
	//* 159  339:invokevirtual   #247 <Method boolean String.startsWith(String)>
	//* 160  342:ifne            352
			PdfEncodings.convertToBytes(" ", s1);
	//  161  345:ldc1            #249 <String " ">
	//  162  347:aload_2         
	//  163  348:invokestatic    #255 <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//  164  351:pop             
		createEncoding();
	//  165  352:aload_0         
	//  166  353:invokevirtual   #258 <Method void createEncoding()>
	//  167  356:return          
	}

	protected static int[] compactRanges(ArrayList arraylist)
	{
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #263 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #264 <Method void ArrayList()>
	//    3    7:astore          4
		for(int i = 0; i < arraylist.size(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_1        
	//*   6   11:iload_1         
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #267 <Method int ArrayList.size()>
	//*   9   16:icmpge          103
		{
			int ai[] = (int[])arraylist.get(i);
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:invokevirtual   #271 <Method Object ArrayList.get(int)>
	//   13   24:checkcast       #272 <Class int[]>
	//   14   27:astore          5
			for(int l = 0; l < ai.length; l += 2)
	//*  15   29:iconst_0        
	//*  16   30:istore_2        
	//*  17   31:iload_2         
	//*  18   32:aload           5
	//*  19   34:arraylength     
	//*  20   35:icmpge          96
				arraylist1.add(((Object) (new int[] {
					Math.max(0, Math.min(ai[l], ai[l + 1])), Math.min(65535, Math.max(ai[l], ai[l + 1]))
				})));
	//   21   38:aload           4
	//   22   40:iconst_2        
	//   23   41:newarray        int[]
	//   24   43:dup             
	//   25   44:iconst_0        
	//   26   45:iconst_0        
	//   27   46:aload           5
	//   28   48:iload_2         
	//   29   49:iaload          
	//   30   50:aload           5
	//   31   52:iload_2         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:iaload          
	//   35   56:invokestatic    #278 <Method int Math.min(int, int)>
	//   36   59:invokestatic    #281 <Method int Math.max(int, int)>
	//   37   62:iastore         
	//   38   63:dup             
	//   39   64:iconst_1        
	//   40   65:ldc2            #282 <Int 65535>
	//   41   68:aload           5
	//   42   70:iload_2         
	//   43   71:iaload          
	//   44   72:aload           5
	//   45   74:iload_2         
	//   46   75:iconst_1        
	//   47   76:iadd            
	//   48   77:iaload          
	//   49   78:invokestatic    #281 <Method int Math.max(int, int)>
	//   50   81:invokestatic    #278 <Method int Math.min(int, int)>
	//   51   84:iastore         
	//   52   85:invokevirtual   #286 <Method boolean ArrayList.add(Object)>
	//   53   88:pop             

	//   54   89:iload_2         
	//   55   90:iconst_2        
	//   56   91:iadd            
	//   57   92:istore_2        
		}

	//   58   93:goto            31
	//   59   96:iload_1         
	//   60   97:iconst_1        
	//   61   98:iadd            
	//   62   99:istore_1        
	//*  63  100:goto            11
		for(int i1 = 0; i1 < arraylist1.size() - 1; i1++)
	//*  64  103:iconst_0        
	//*  65  104:istore_2        
	//*  66  105:iload_2         
	//*  67  106:aload           4
	//*  68  108:invokevirtual   #267 <Method int ArrayList.size()>
	//*  69  111:iconst_1        
	//*  70  112:isub            
	//*  71  113:icmpge          245
		{
			int j1;
			for(int j = i1 + 1; j < arraylist1.size(); j = j1 + 1)
	//*  72  116:iload_2         
	//*  73  117:iconst_1        
	//*  74  118:iadd            
	//*  75  119:istore_1        
	//*  76  120:iload_1         
	//*  77  121:aload           4
	//*  78  123:invokevirtual   #267 <Method int ArrayList.size()>
	//*  79  126:icmpge          238
			{
				arraylist = ((ArrayList) ((int[])arraylist1.get(i1)));
	//   80  129:aload           4
	//   81  131:iload_2         
	//   82  132:invokevirtual   #271 <Method Object ArrayList.get(int)>
	//   83  135:checkcast       #272 <Class int[]>
	//   84  138:astore_0        
				int ai1[] = (int[])arraylist1.get(j);
	//   85  139:aload           4
	//   86  141:iload_1         
	//   87  142:invokevirtual   #271 <Method Object ArrayList.get(int)>
	//   88  145:checkcast       #272 <Class int[]>
	//   89  148:astore          5
				if(arraylist[0] < ai1[0] || arraylist[0] > ai1[1])
	//*  90  150:aload_0         
	//*  91  151:iconst_0        
	//*  92  152:iaload          
	//*  93  153:aload           5
	//*  94  155:iconst_0        
	//*  95  156:iaload          
	//*  96  157:icmplt          170
	//*  97  160:aload_0         
	//*  98  161:iconst_0        
	//*  99  162:iaload          
	//* 100  163:aload           5
	//* 101  165:iconst_1        
	//* 102  166:iaload          
	//* 103  167:icmple          194
				{
					j1 = j;
	//  104  170:iload_1         
	//  105  171:istore_3        
					if(arraylist[1] < ai1[0])
						continue;
	//  106  172:aload_0         
	//  107  173:iconst_1        
	//  108  174:iaload          
	//  109  175:aload           5
	//  110  177:iconst_0        
	//  111  178:iaload          
	//  112  179:icmplt          231
					j1 = j;
	//  113  182:iload_1         
	//  114  183:istore_3        
					if(arraylist[0] > ai1[1])
						continue;
	//  115  184:aload_0         
	//  116  185:iconst_0        
	//  117  186:iaload          
	//  118  187:aload           5
	//  119  189:iconst_1        
	//  120  190:iaload          
	//  121  191:icmpgt          231
				}
				arraylist[0] = Math.min(arraylist[0], ai1[0]);
	//  122  194:aload_0         
	//  123  195:iconst_0        
	//  124  196:aload_0         
	//  125  197:iconst_0        
	//  126  198:iaload          
	//  127  199:aload           5
	//  128  201:iconst_0        
	//  129  202:iaload          
	//  130  203:invokestatic    #278 <Method int Math.min(int, int)>
	//  131  206:iastore         
				arraylist[1] = Math.max(arraylist[1], ai1[1]);
	//  132  207:aload_0         
	//  133  208:iconst_1        
	//  134  209:aload_0         
	//  135  210:iconst_1        
	//  136  211:iaload          
	//  137  212:aload           5
	//  138  214:iconst_1        
	//  139  215:iaload          
	//  140  216:invokestatic    #281 <Method int Math.max(int, int)>
	//  141  219:iastore         
				arraylist1.remove(j);
	//  142  220:aload           4
	//  143  222:iload_1         
	//  144  223:invokevirtual   #289 <Method Object ArrayList.remove(int)>
	//  145  226:pop             
				j1 = j - 1;
	//  146  227:iload_1         
	//  147  228:iconst_1        
	//  148  229:isub            
	//  149  230:istore_3        
			}

	//  150  231:iload_3         
	//  151  232:iconst_1        
	//  152  233:iadd            
	//  153  234:istore_1        
		}

	//  154  235:goto            120
	//  155  238:iload_2         
	//  156  239:iconst_1        
	//  157  240:iadd            
	//  158  241:istore_2        
	//* 159  242:goto            105
		arraylist = ((ArrayList) (new int[arraylist1.size() * 2]));
	//  160  245:aload           4
	//  161  247:invokevirtual   #267 <Method int ArrayList.size()>
	//  162  250:iconst_2        
	//  163  251:imul            
	//  164  252:newarray        int[]
	//  165  254:astore_0        
		for(int k = 0; k < arraylist1.size(); k++)
	//* 166  255:iconst_0        
	//* 167  256:istore_1        
	//* 168  257:iload_1         
	//* 169  258:aload           4
	//* 170  260:invokevirtual   #267 <Method int ArrayList.size()>
	//* 171  263:icmpge          304
		{
			int ai2[] = (int[])arraylist1.get(k);
	//  172  266:aload           4
	//  173  268:iload_1         
	//  174  269:invokevirtual   #271 <Method Object ArrayList.get(int)>
	//  175  272:checkcast       #272 <Class int[]>
	//  176  275:astore          5
			arraylist[k * 2] = ai2[0];
	//  177  277:aload_0         
	//  178  278:iload_1         
	//  179  279:iconst_2        
	//  180  280:imul            
	//  181  281:aload           5
	//  182  283:iconst_0        
	//  183  284:iaload          
	//  184  285:iastore         
			arraylist[k * 2 + 1] = ai2[1];
	//  185  286:aload_0         
	//  186  287:iload_1         
	//  187  288:iconst_2        
	//  188  289:imul            
	//  189  290:iconst_1        
	//  190  291:iadd            
	//  191  292:aload           5
	//  192  294:iconst_1        
	//  193  295:iaload          
	//  194  296:iastore         
		}

	//  195  297:iload_1         
	//  196  298:iconst_1        
	//  197  299:iadd            
	//  198  300:istore_1        
	//* 199  301:goto            257
		return ((int []) (arraylist));
	//  200  304:aload_0         
	//  201  305:areturn         
	}

	protected static String getTTCName(String s)
	{
		int i = s.toLowerCase().indexOf(".ttc,");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method String String.toLowerCase()>
	//    2    4:ldc2            #293 <String ".ttc,">
	//    3    7:invokevirtual   #297 <Method int String.indexOf(String)>
	//    4   10:istore_1        
		if(i < 0)
	//*   5   11:iload_1         
	//*   6   12:ifge            17
			return s;
	//    7   15:aload_0         
	//    8   16:areturn         
		else
			return s.substring(0, i + 4);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:iload_1         
	//   12   20:iconst_4        
	//   13   21:iadd            
	//   14   22:invokevirtual   #300 <Method String String.substring(int, int)>
	//   15   25:areturn         
	}

	private void readBbox()
		throws DocumentException, IOException
	{
		int ai[] = (int[])tables.get("head");
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field HashMap tables>
	//    2    4:ldc2            #304 <String "head">
	//    3    7:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #272 <Class int[]>
	//    5   13:astore          4
		if(ai == null)
	//*   6   15:aload           4
	//*   7   17:ifnonnull       71
			throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
				"head", (new StringBuilder()).append(fileName).append(style).toString()
			}));
	//    8   20:new             #165 <Class DocumentException>
	//    9   23:dup             
	//   10   24:ldc2            #311 <String "table.1.does.not.exist.in.2">
	//   11   27:iconst_2        
	//   12   28:anewarray       Object[]
	//   13   31:dup             
	//   14   32:iconst_0        
	//   15   33:ldc2            #304 <String "head">
	//   16   36:aastore         
	//   17   37:dup             
	//   18   38:iconst_1        
	//   19   39:new             #223 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #224 <Method void StringBuilder()>
	//   22   46:aload_0         
	//   23   47:getfield        #190 <Field String fileName>
	//   24   50:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:aload_0         
	//   26   54:getfield        #146 <Field String style>
	//   27   57:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   29   63:aastore         
	//   30   64:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   67:invokespecial   #240 <Method void DocumentException(String)>
	//   32   70:athrow          
		rf.seek(ai[0] + 51);
	//   33   71:aload_0         
	//   34   72:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   35   75:aload           4
	//   36   77:iconst_0        
	//   37   78:iaload          
	//   38   79:bipush          51
	//   39   81:iadd            
	//   40   82:i2l             
	//   41   83:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		boolean flag;
		if(rf.readUnsignedShort() == 0)
	//*  42   86:aload_0         
	//*  43   87:getfield        #313 <Field RandomAccessFileOrArray rf>
	//*  44   90:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//*  45   93:ifne            119
			flag = true;
	//   46   96:iconst_1        
	//   47   97:istore_1        
		else
	//*  48   98:aload_0         
	//*  49   99:getfield        #303 <Field HashMap tables>
	//*  50  102:ldc2            #324 <String "loca">
	//*  51  105:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//*  52  108:checkcast       #272 <Class int[]>
	//*  53  111:astore          4
	//*  54  113:aload           4
	//*  55  115:ifnonnull       124
	//*  56  118:return          
			flag = false;
	//   57  119:iconst_0        
	//   58  120:istore_1        
		ai = (int[])tables.get("loca");
		if(ai != null)
	//*  59  121:goto            98
		{
			rf.seek(ai[0]);
	//   60  124:aload_0         
	//   61  125:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   62  128:aload           4
	//   63  130:iconst_0        
	//   64  131:iaload          
	//   65  132:i2l             
	//   66  133:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
			if(flag)
	//*  67  136:iload_1         
	//*  68  137:ifeq            183
			{
				int l = ai[1] / 2;
	//   69  140:aload           4
	//   70  142:iconst_1        
	//   71  143:iaload          
	//   72  144:iconst_2        
	//   73  145:idiv            
	//   74  146:istore_2        
				int ai1[] = new int[l];
	//   75  147:iload_2         
	//   76  148:newarray        int[]
	//   77  150:astore          5
				int i = 0;
	//   78  152:iconst_0        
	//   79  153:istore_1        
				do
				{
					ai = ai1;
	//   80  154:aload           5
	//   81  156:astore          4
					if(i >= l)
						break;
	//   82  158:iload_1         
	//   83  159:iload_2         
	//   84  160:icmpge          224
					ai1[i] = rf.readUnsignedShort() * 2;
	//   85  163:aload           5
	//   86  165:iload_1         
	//   87  166:aload_0         
	//   88  167:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   89  170:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   90  173:iconst_2        
	//   91  174:imul            
	//   92  175:iastore         
					i++;
	//   93  176:iload_1         
	//   94  177:iconst_1        
	//   95  178:iadd            
	//   96  179:istore_1        
				} while(true);
	//   97  180:goto            154
			} else
			{
				int i1 = ai[1] / 4;
	//   98  183:aload           4
	//   99  185:iconst_1        
	//  100  186:iaload          
	//  101  187:iconst_4        
	//  102  188:idiv            
	//  103  189:istore_2        
				int ai2[] = new int[i1];
	//  104  190:iload_2         
	//  105  191:newarray        int[]
	//  106  193:astore          5
				int j = 0;
	//  107  195:iconst_0        
	//  108  196:istore_1        
				do
				{
					ai = ai2;
	//  109  197:aload           5
	//  110  199:astore          4
					if(j >= i1)
						break;
	//  111  201:iload_1         
	//  112  202:iload_2         
	//  113  203:icmpge          224
					ai2[j] = rf.readInt();
	//  114  206:aload           5
	//  115  208:iload_1         
	//  116  209:aload_0         
	//  117  210:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  118  213:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//  119  216:iastore         
					j++;
	//  120  217:iload_1         
	//  121  218:iconst_1        
	//  122  219:iadd            
	//  123  220:istore_1        
				} while(true);
	//  124  221:goto            197
			}
			int ai3[] = (int[])tables.get("glyf");
	//  125  224:aload_0         
	//  126  225:getfield        #303 <Field HashMap tables>
	//  127  228:ldc2            #329 <String "glyf">
	//  128  231:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//  129  234:checkcast       #272 <Class int[]>
	//  130  237:astore          5
			if(ai3 == null)
	//* 131  239:aload           5
	//* 132  241:ifnonnull       295
				throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
					"glyf", (new StringBuilder()).append(fileName).append(style).toString()
				}));
	//  133  244:new             #165 <Class DocumentException>
	//  134  247:dup             
	//  135  248:ldc2            #311 <String "table.1.does.not.exist.in.2">
	//  136  251:iconst_2        
	//  137  252:anewarray       Object[]
	//  138  255:dup             
	//  139  256:iconst_0        
	//  140  257:ldc2            #329 <String "glyf">
	//  141  260:aastore         
	//  142  261:dup             
	//  143  262:iconst_1        
	//  144  263:new             #223 <Class StringBuilder>
	//  145  266:dup             
	//  146  267:invokespecial   #224 <Method void StringBuilder()>
	//  147  270:aload_0         
	//  148  271:getfield        #190 <Field String fileName>
	//  149  274:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  150  277:aload_0         
	//  151  278:getfield        #146 <Field String style>
	//  152  281:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  153  284:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  154  287:aastore         
	//  155  288:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  156  291:invokespecial   #240 <Method void DocumentException(String)>
	//  157  294:athrow          
			int j1 = ai3[0];
	//  158  295:aload           5
	//  159  297:iconst_0        
	//  160  298:iaload          
	//  161  299:istore_2        
			bboxes = new int[ai.length - 1][];
	//  162  300:aload_0         
	//  163  301:aload           4
	//  164  303:arraylength     
	//  165  304:iconst_1        
	//  166  305:isub            
	//  167  306:anewarray       int[][]
	//  168  309:putfield        #331 <Field int[][] bboxes>
			int k = 0;
	//  169  312:iconst_0        
	//  170  313:istore_1        
			while(k < ai.length - 1) 
	//* 171  314:iload_1         
	//* 172  315:aload           4
	//* 173  317:arraylength     
	//* 174  318:iconst_1        
	//* 175  319:isub            
	//* 176  320:icmpge          118
			{
				int k1 = ai[k];
	//  177  323:aload           4
	//  178  325:iload_1         
	//  179  326:iaload          
	//  180  327:istore_3        
				if(k1 != ai[k + 1])
	//* 181  328:iload_3         
	//* 182  329:aload           4
	//* 183  331:iload_1         
	//* 184  332:iconst_1        
	//* 185  333:iadd            
	//* 186  334:iaload          
	//* 187  335:icmpeq          448
				{
					rf.seek(j1 + k1 + 2);
	//  188  338:aload_0         
	//  189  339:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  190  342:iload_2         
	//  191  343:iload_3         
	//  192  344:iadd            
	//  193  345:iconst_2        
	//  194  346:iadd            
	//  195  347:i2l             
	//  196  348:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
					bboxes[k] = (new int[] {
						(rf.readShort() * 1000) / head.unitsPerEm, (rf.readShort() * 1000) / head.unitsPerEm, (rf.readShort() * 1000) / head.unitsPerEm, (rf.readShort() * 1000) / head.unitsPerEm
					});
	//  197  351:aload_0         
	//  198  352:getfield        #331 <Field int[][] bboxes>
	//  199  355:iload_1         
	//  200  356:iconst_4        
	//  201  357:newarray        int[]
	//  202  359:dup             
	//  203  360:iconst_0        
	//  204  361:aload_0         
	//  205  362:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  206  365:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  207  368:sipush          1000
	//  208  371:imul            
	//  209  372:aload_0         
	//  210  373:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  211  376:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  212  379:idiv            
	//  213  380:iastore         
	//  214  381:dup             
	//  215  382:iconst_1        
	//  216  383:aload_0         
	//  217  384:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  218  387:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  219  390:sipush          1000
	//  220  393:imul            
	//  221  394:aload_0         
	//  222  395:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  223  398:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  224  401:idiv            
	//  225  402:iastore         
	//  226  403:dup             
	//  227  404:iconst_2        
	//  228  405:aload_0         
	//  229  406:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  230  409:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  231  412:sipush          1000
	//  232  415:imul            
	//  233  416:aload_0         
	//  234  417:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  235  420:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  236  423:idiv            
	//  237  424:iastore         
	//  238  425:dup             
	//  239  426:iconst_3        
	//  240  427:aload_0         
	//  241  428:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  242  431:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  243  434:sipush          1000
	//  244  437:imul            
	//  245  438:aload_0         
	//  246  439:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  247  442:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  248  445:idiv            
	//  249  446:iastore         
	//  250  447:aastore         
				}
				k++;
	//  251  448:iload_1         
	//  252  449:iconst_1        
	//  253  450:iadd            
	//  254  451:istore_1        
			}
		}
	//* 255  452:goto            314
	}

	protected void addRangeUni(HashMap hashmap, boolean flag, boolean flag1)
	{
		if(flag1 || subsetRanges == null && directoryOffset <= 0) goto _L2; else goto _L1
	//    0    0:iload_3         
	//    1    1:ifne            315
	//    2    4:aload_0         
	//    3    5:getfield        #344 <Field ArrayList subsetRanges>
	//    4    8:ifnonnull       18
	//    5   11:aload_0         
	//    6   12:getfield        #346 <Field int directoryOffset>
	//    7   15:ifle            315
_L1:
		Object obj;
		boolean flag2;
		boolean flag3;
		int j;
		int ai[];
		Iterator iterator;
		Integer integer;
		int ai1[];
		if(subsetRanges == null && directoryOffset > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #344 <Field ArrayList subsetRanges>
	//*  10   22:ifnonnull       240
	//*  11   25:aload_0         
	//*  12   26:getfield        #346 <Field int directoryOffset>
	//*  13   29:ifle            240
		{
			ai = new int[2];
	//   14   32:iconst_2        
	//   15   33:newarray        int[]
	//   16   35:astore          9
			ai;
	//   17   37:aload           9
	//   18   39:dup             
	//   19   40:iconst_0        
	//   20   41:iconst_0        
	//   21   42:iastore         
	//   22   43:dup             
	//   23   44:iconst_1        
	//   24   45:ldc2            #282 <Int 65535>
	//   25   48:iastore         
	//   26   49:pop             
			ai[0] = 0;
			ai[1] = 65535;
		} else
	//*  27   50:aload_0         
	//*  28   51:getfield        #349 <Field boolean fontSpecific>
	//*  29   54:ifne            252
	//*  30   57:aload_0         
	//*  31   58:getfield        #351 <Field HashMap cmap31>
	//*  32   61:ifnull          252
	//*  33   64:aload_0         
	//*  34   65:getfield        #351 <Field HashMap cmap31>
	//*  35   68:astore          8
	//*  36   70:aload           8
	//*  37   72:invokevirtual   #355 <Method Set HashMap.entrySet()>
	//*  38   75:invokeinterface #361 <Method Iterator Set.iterator()>
	//*  39   80:astore          10
	//*  40   82:aload           10
	//*  41   84:invokeinterface #367 <Method boolean Iterator.hasNext()>
	//*  42   89:ifeq            315
	//*  43   92:aload           10
	//*  44   94:invokeinterface #371 <Method Object Iterator.next()>
	//*  45   99:checkcast       #373 <Class java.util.Map$Entry>
	//*  46  102:astore          8
	//*  47  104:aload           8
	//*  48  106:invokeinterface #376 <Method Object java.util.Map$Entry.getValue()>
	//*  49  111:checkcast       #272 <Class int[]>
	//*  50  114:astore          12
	//*  51  116:aload           12
	//*  52  118:iconst_0        
	//*  53  119:iaload          
	//*  54  120:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//*  55  123:astore          11
	//*  56  125:aload_1         
	//*  57  126:aload           11
	//*  58  128:invokevirtual   #385 <Method boolean HashMap.containsKey(Object)>
	//*  59  131:ifne            82
	//*  60  134:aload           8
	//*  61  136:invokeinterface #388 <Method Object java.util.Map$Entry.getKey()>
	//*  62  141:checkcast       #378 <Class Integer>
	//*  63  144:invokevirtual   #391 <Method int Integer.intValue()>
	//*  64  147:istore          7
	//*  65  149:iconst_1        
	//*  66  150:istore          6
	//*  67  152:iconst_0        
	//*  68  153:istore          4
	//*  69  155:iload           6
	//*  70  157:istore          5
	//*  71  159:iload           4
	//*  72  161:aload           9
	//*  73  163:arraylength     
	//*  74  164:icmpge          192
	//*  75  167:iload           7
	//*  76  169:aload           9
	//*  77  171:iload           4
	//*  78  173:iaload          
	//*  79  174:icmplt          300
	//*  80  177:iload           7
	//*  81  179:aload           9
	//*  82  181:iload           4
	//*  83  183:iconst_1        
	//*  84  184:iadd            
	//*  85  185:iaload          
	//*  86  186:icmpgt          300
	//*  87  189:iconst_0        
	//*  88  190:istore          5
	//*  89  192:iload           5
	//*  90  194:ifne            82
	//*  91  197:iload_2         
	//*  92  198:ifeq            309
	//*  93  201:iconst_3        
	//*  94  202:newarray        int[]
	//*  95  204:astore          8
	//*  96  206:aload           8
	//*  97  208:iconst_0        
	//*  98  209:aload           12
	//*  99  211:iconst_0        
	//* 100  212:iaload          
	//* 101  213:iastore         
	//* 102  214:aload           8
	//* 103  216:iconst_1        
	//* 104  217:aload           12
	//* 105  219:iconst_1        
	//* 106  220:iaload          
	//* 107  221:iastore         
	//* 108  222:aload           8
	//* 109  224:iconst_2        
	//* 110  225:iload           7
	//* 111  227:iastore         
	//* 112  228:aload_1         
	//* 113  229:aload           11
	//* 114  231:aload           8
	//* 115  233:invokevirtual   #395 <Method Object HashMap.put(Object, Object)>
	//* 116  236:pop             
	//* 117  237:goto            82
		{
			ai = compactRanges(subsetRanges);
	//  118  240:aload_0         
	//  119  241:getfield        #344 <Field ArrayList subsetRanges>
	//  120  244:invokestatic    #397 <Method int[] compactRanges(ArrayList)>
	//  121  247:astore          9
		}
		if(!fontSpecific && cmap31 != null)
			obj = ((Object) (cmap31));
		else
	//* 122  249:goto            50
		if(fontSpecific && cmap10 != null)
	//* 123  252:aload_0         
	//* 124  253:getfield        #349 <Field boolean fontSpecific>
	//* 125  256:ifeq            275
	//* 126  259:aload_0         
	//* 127  260:getfield        #399 <Field HashMap cmap10>
	//* 128  263:ifnull          275
			obj = ((Object) (cmap10));
	//  129  266:aload_0         
	//  130  267:getfield        #399 <Field HashMap cmap10>
	//  131  270:astore          8
		else
	//* 132  272:goto            70
		if(cmap31 != null)
	//* 133  275:aload_0         
	//* 134  276:getfield        #351 <Field HashMap cmap31>
	//* 135  279:ifnull          291
			obj = ((Object) (cmap31));
	//  136  282:aload_0         
	//  137  283:getfield        #351 <Field HashMap cmap31>
	//  138  286:astore          8
		else
	//* 139  288:goto            70
			obj = ((Object) (cmap10));
	//  140  291:aload_0         
	//  141  292:getfield        #399 <Field HashMap cmap10>
	//  142  295:astore          8
		iterator = ((HashMap) (obj)).entrySet().iterator();
_L4:
		if(iterator.hasNext())
		{
			obj = ((Object) ((java.util.Map.Entry)iterator.next()));
			ai1 = (int[])((java.util.Map.Entry) (obj)).getValue();
			integer = Integer.valueOf(ai1[0]);
			if(hashmap.containsKey(((Object) (integer))))
				continue; /* Loop/switch isn't completed */
			j = ((Integer)((java.util.Map.Entry) (obj)).getKey()).intValue();
			flag3 = true;
			int i = 0;
			do
			{
label0:
				{
					flag2 = flag3;
					if(i < ai.length)
					{
						if(j < ai[i] || j > ai[i + 1])
							break label0;
						flag2 = false;
					}
					if(!flag2)
					{
						if(flag)
						{
							obj = ((Object) (new int[3]));
							obj[0] = ai1[0];
							obj[1] = ai1[1];
							obj[2] = j;
						} else
	//* 143  297:goto            70
	//* 144  300:iload           4
	//* 145  302:iconst_2        
	//* 146  303:iadd            
	//* 147  304:istore          4
	//* 148  306:goto            155
						{
							obj = null;
	//  149  309:aconst_null     
	//  150  310:astore          8
						}
						hashmap.put(((Object) (integer)), obj);
					}
					continue; /* Loop/switch isn't completed */
	//  151  312:goto            228
				}
				i += 2;
			} while(true);
		}
_L2:
		return;
	//  152  315:return          
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected void addRangeUni(HashSet hashset, boolean flag)
	{
		if(flag || subsetRanges == null && directoryOffset <= 0) goto _L2; else goto _L1
	//    0    0:iload_2         
	//    1    1:ifne            266
	//    2    4:aload_0         
	//    3    5:getfield        #344 <Field ArrayList subsetRanges>
	//    4    8:ifnonnull       18
	//    5   11:aload_0         
	//    6   12:getfield        #346 <Field int directoryOffset>
	//    7   15:ifle            266
_L1:
		boolean flag1;
		boolean flag2;
		int j;
		Object obj;
		int ai[];
		java.util.Map.Entry entry;
		Integer integer;
		if(subsetRanges == null && directoryOffset > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #344 <Field ArrayList subsetRanges>
	//*  10   22:ifnonnull       199
	//*  11   25:aload_0         
	//*  12   26:getfield        #346 <Field int directoryOffset>
	//*  13   29:ifle            199
		{
			ai = new int[2];
	//   14   32:iconst_2        
	//   15   33:newarray        int[]
	//   16   35:astore          8
			ai;
	//   17   37:aload           8
	//   18   39:dup             
	//   19   40:iconst_0        
	//   20   41:iconst_0        
	//   21   42:iastore         
	//   22   43:dup             
	//   23   44:iconst_1        
	//   24   45:ldc2            #282 <Int 65535>
	//   25   48:iastore         
	//   26   49:pop             
			ai[0] = 0;
			ai[1] = 65535;
		} else
	//*  27   50:aload_0         
	//*  28   51:getfield        #349 <Field boolean fontSpecific>
	//*  29   54:ifne            211
	//*  30   57:aload_0         
	//*  31   58:getfield        #351 <Field HashMap cmap31>
	//*  32   61:ifnull          211
	//*  33   64:aload_0         
	//*  34   65:getfield        #351 <Field HashMap cmap31>
	//*  35   68:astore          7
	//*  36   70:aload           7
	//*  37   72:invokevirtual   #355 <Method Set HashMap.entrySet()>
	//*  38   75:invokeinterface #361 <Method Iterator Set.iterator()>
	//*  39   80:astore          7
	//*  40   82:aload           7
	//*  41   84:invokeinterface #367 <Method boolean Iterator.hasNext()>
	//*  42   89:ifeq            266
	//*  43   92:aload           7
	//*  44   94:invokeinterface #371 <Method Object Iterator.next()>
	//*  45   99:checkcast       #373 <Class java.util.Map$Entry>
	//*  46  102:astore          9
	//*  47  104:aload           9
	//*  48  106:invokeinterface #376 <Method Object java.util.Map$Entry.getValue()>
	//*  49  111:checkcast       #272 <Class int[]>
	//*  50  114:iconst_0        
	//*  51  115:iaload          
	//*  52  116:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//*  53  119:astore          10
	//*  54  121:aload_1         
	//*  55  122:aload           10
	//*  56  124:invokevirtual   #406 <Method boolean HashSet.contains(Object)>
	//*  57  127:ifne            82
	//*  58  130:aload           9
	//*  59  132:invokeinterface #388 <Method Object java.util.Map$Entry.getKey()>
	//*  60  137:checkcast       #378 <Class Integer>
	//*  61  140:invokevirtual   #391 <Method int Integer.intValue()>
	//*  62  143:istore          6
	//*  63  145:iconst_1        
	//*  64  146:istore          5
	//*  65  148:iconst_0        
	//*  66  149:istore_3        
	//*  67  150:iload           5
	//*  68  152:istore          4
	//*  69  154:iload_3         
	//*  70  155:aload           8
	//*  71  157:arraylength     
	//*  72  158:icmpge          184
	//*  73  161:iload           6
	//*  74  163:aload           8
	//*  75  165:iload_3         
	//*  76  166:iaload          
	//*  77  167:icmplt          259
	//*  78  170:iload           6
	//*  79  172:aload           8
	//*  80  174:iload_3         
	//*  81  175:iconst_1        
	//*  82  176:iadd            
	//*  83  177:iaload          
	//*  84  178:icmpgt          259
	//*  85  181:iconst_0        
	//*  86  182:istore          4
	//*  87  184:iload           4
	//*  88  186:ifne            82
	//*  89  189:aload_1         
	//*  90  190:aload           10
	//*  91  192:invokevirtual   #407 <Method boolean HashSet.add(Object)>
	//*  92  195:pop             
	//*  93  196:goto            82
		{
			ai = compactRanges(subsetRanges);
	//   94  199:aload_0         
	//   95  200:getfield        #344 <Field ArrayList subsetRanges>
	//   96  203:invokestatic    #397 <Method int[] compactRanges(ArrayList)>
	//   97  206:astore          8
		}
		if(!fontSpecific && cmap31 != null)
			obj = ((Object) (cmap31));
		else
	//*  98  208:goto            50
		if(fontSpecific && cmap10 != null)
	//*  99  211:aload_0         
	//* 100  212:getfield        #349 <Field boolean fontSpecific>
	//* 101  215:ifeq            234
	//* 102  218:aload_0         
	//* 103  219:getfield        #399 <Field HashMap cmap10>
	//* 104  222:ifnull          234
			obj = ((Object) (cmap10));
	//  105  225:aload_0         
	//  106  226:getfield        #399 <Field HashMap cmap10>
	//  107  229:astore          7
		else
	//* 108  231:goto            70
		if(cmap31 != null)
	//* 109  234:aload_0         
	//* 110  235:getfield        #351 <Field HashMap cmap31>
	//* 111  238:ifnull          250
			obj = ((Object) (cmap31));
	//  112  241:aload_0         
	//  113  242:getfield        #351 <Field HashMap cmap31>
	//  114  245:astore          7
		else
	//* 115  247:goto            70
			obj = ((Object) (cmap10));
	//  116  250:aload_0         
	//  117  251:getfield        #399 <Field HashMap cmap10>
	//  118  254:astore          7
		obj = ((Object) (((HashMap) (obj)).entrySet().iterator()));
_L4:
		if(((Iterator) (obj)).hasNext())
		{
			entry = (java.util.Map.Entry)((Iterator) (obj)).next();
			integer = Integer.valueOf(((int[])entry.getValue())[0]);
			if(hashset.contains(((Object) (integer))))
				continue; /* Loop/switch isn't completed */
			j = ((Integer)entry.getKey()).intValue();
			flag2 = true;
			int i = 0;
			do
			{
label0:
				{
					flag1 = flag2;
					if(i < ai.length)
					{
						if(j < ai[i] || j > ai[i + 1])
							break label0;
						flag1 = false;
					}
					if(!flag1)
						hashset.add(((Object) (integer)));
					continue; /* Loop/switch isn't completed */
				}
	//* 119  256:goto            70
				i += 2;
	//  120  259:iload_3         
	//  121  260:iconst_2        
	//  122  261:iadd            
	//  123  262:istore_3        
			} while(true);
	//  124  263:goto            150
		}
_L2:
		return;
	//  125  266:return          
		if(true) goto _L4; else goto _L3
_L3:
	}

	void checkCff()
	{
		int ai[] = (int[])tables.get("CFF ");
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field HashMap tables>
	//    2    4:ldc2            #411 <String "CFF ">
	//    3    7:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #272 <Class int[]>
	//    5   13:astore_1        
		if(ai != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          37
		{
			cff = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #142 <Field boolean cff>
			cffOffset = ai[0];
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:iconst_0        
	//   14   26:iaload          
	//   15   27:putfield        #413 <Field int cffOffset>
			cffLength = ai[1];
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:iconst_1        
	//   19   33:iaload          
	//   20   34:putfield        #415 <Field int cffLength>
		}
	//   21   37:return          
	}

	void fillTables()
		throws DocumentException, IOException
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		int ai[] = (int[])tables.get("head");
	//    2    2:aload_0         
	//    3    3:getfield        #303 <Field HashMap tables>
	//    4    6:ldc2            #304 <String "head">
	//    5    9:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//    6   12:checkcast       #272 <Class int[]>
	//    7   15:astore          4
		if(ai == null)
	//*   8   17:aload           4
	//*   9   19:ifnonnull       73
			throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
				"head", (new StringBuilder()).append(fileName).append(style).toString()
			}));
	//   10   22:new             #165 <Class DocumentException>
	//   11   25:dup             
	//   12   26:ldc2            #311 <String "table.1.does.not.exist.in.2">
	//   13   29:iconst_2        
	//   14   30:anewarray       Object[]
	//   15   33:dup             
	//   16   34:iconst_0        
	//   17   35:ldc2            #304 <String "head">
	//   18   38:aastore         
	//   19   39:dup             
	//   20   40:iconst_1        
	//   21   41:new             #223 <Class StringBuilder>
	//   22   44:dup             
	//   23   45:invokespecial   #224 <Method void StringBuilder()>
	//   24   48:aload_0         
	//   25   49:getfield        #190 <Field String fileName>
	//   26   52:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:aload_0         
	//   28   56:getfield        #146 <Field String style>
	//   29   59:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   30   62:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   31   65:aastore         
	//   32   66:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   33   69:invokespecial   #240 <Method void DocumentException(String)>
	//   34   72:athrow          
		rf.seek(ai[0] + 16);
	//   35   73:aload_0         
	//   36   74:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   37   77:aload           4
	//   38   79:iconst_0        
	//   39   80:iaload          
	//   40   81:bipush          16
	//   41   83:iadd            
	//   42   84:i2l             
	//   43   85:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		head.flags = rf.readUnsignedShort();
	//   44   88:aload_0         
	//   45   89:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   46   92:aload_0         
	//   47   93:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   48   96:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   49   99:putfield        #419 <Field int TrueTypeFont$FontHeader.flags>
		head.unitsPerEm = rf.readUnsignedShort();
	//   50  102:aload_0         
	//   51  103:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   52  106:aload_0         
	//   53  107:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   54  110:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   55  113:putfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
		rf.skipBytes(16);
	//   56  116:aload_0         
	//   57  117:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   58  120:bipush          16
	//   59  122:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   60  125:pop             
		head.xMin = rf.readShort();
	//   61  126:aload_0         
	//   62  127:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   63  130:aload_0         
	//   64  131:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   65  134:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//   66  137:putfield        #426 <Field short TrueTypeFont$FontHeader.xMin>
		head.yMin = rf.readShort();
	//   67  140:aload_0         
	//   68  141:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   69  144:aload_0         
	//   70  145:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   71  148:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//   72  151:putfield        #429 <Field short TrueTypeFont$FontHeader.yMin>
		head.xMax = rf.readShort();
	//   73  154:aload_0         
	//   74  155:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   75  158:aload_0         
	//   76  159:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   77  162:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//   78  165:putfield        #432 <Field short TrueTypeFont$FontHeader.xMax>
		head.yMax = rf.readShort();
	//   79  168:aload_0         
	//   80  169:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   81  172:aload_0         
	//   82  173:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   83  176:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//   84  179:putfield        #435 <Field short TrueTypeFont$FontHeader.yMax>
		head.macStyle = rf.readUnsignedShort();
	//   85  182:aload_0         
	//   86  183:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   87  186:aload_0         
	//   88  187:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   89  190:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   90  193:putfield        #438 <Field int TrueTypeFont$FontHeader.macStyle>
		ai = (int[])tables.get("hhea");
	//   91  196:aload_0         
	//   92  197:getfield        #303 <Field HashMap tables>
	//   93  200:ldc2            #439 <String "hhea">
	//   94  203:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//   95  206:checkcast       #272 <Class int[]>
	//   96  209:astore          4
		if(ai == null)
	//*  97  211:aload           4
	//*  98  213:ifnonnull       267
			throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
				"hhea", (new StringBuilder()).append(fileName).append(style).toString()
			}));
	//   99  216:new             #165 <Class DocumentException>
	//  100  219:dup             
	//  101  220:ldc2            #311 <String "table.1.does.not.exist.in.2">
	//  102  223:iconst_2        
	//  103  224:anewarray       Object[]
	//  104  227:dup             
	//  105  228:iconst_0        
	//  106  229:ldc2            #439 <String "hhea">
	//  107  232:aastore         
	//  108  233:dup             
	//  109  234:iconst_1        
	//  110  235:new             #223 <Class StringBuilder>
	//  111  238:dup             
	//  112  239:invokespecial   #224 <Method void StringBuilder()>
	//  113  242:aload_0         
	//  114  243:getfield        #190 <Field String fileName>
	//  115  246:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  116  249:aload_0         
	//  117  250:getfield        #146 <Field String style>
	//  118  253:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  119  256:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  120  259:aastore         
	//  121  260:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  122  263:invokespecial   #240 <Method void DocumentException(String)>
	//  123  266:athrow          
		rf.seek(ai[0] + 4);
	//  124  267:aload_0         
	//  125  268:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  126  271:aload           4
	//  127  273:iconst_0        
	//  128  274:iaload          
	//  129  275:iconst_4        
	//  130  276:iadd            
	//  131  277:i2l             
	//  132  278:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		hhea.Ascender = rf.readShort();
	//  133  281:aload_0         
	//  134  282:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  135  285:aload_0         
	//  136  286:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  137  289:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  138  292:putfield        #442 <Field short TrueTypeFont$HorizontalHeader.Ascender>
		hhea.Descender = rf.readShort();
	//  139  295:aload_0         
	//  140  296:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  141  299:aload_0         
	//  142  300:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  143  303:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  144  306:putfield        #445 <Field short TrueTypeFont$HorizontalHeader.Descender>
		hhea.LineGap = rf.readShort();
	//  145  309:aload_0         
	//  146  310:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  147  313:aload_0         
	//  148  314:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  149  317:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  150  320:putfield        #448 <Field short TrueTypeFont$HorizontalHeader.LineGap>
		hhea.advanceWidthMax = rf.readUnsignedShort();
	//  151  323:aload_0         
	//  152  324:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  153  327:aload_0         
	//  154  328:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  155  331:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  156  334:putfield        #451 <Field int TrueTypeFont$HorizontalHeader.advanceWidthMax>
		hhea.minLeftSideBearing = rf.readShort();
	//  157  337:aload_0         
	//  158  338:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  159  341:aload_0         
	//  160  342:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  161  345:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  162  348:putfield        #454 <Field short TrueTypeFont$HorizontalHeader.minLeftSideBearing>
		hhea.minRightSideBearing = rf.readShort();
	//  163  351:aload_0         
	//  164  352:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  165  355:aload_0         
	//  166  356:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  167  359:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  168  362:putfield        #457 <Field short TrueTypeFont$HorizontalHeader.minRightSideBearing>
		hhea.xMaxExtent = rf.readShort();
	//  169  365:aload_0         
	//  170  366:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  171  369:aload_0         
	//  172  370:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  173  373:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  174  376:putfield        #460 <Field short TrueTypeFont$HorizontalHeader.xMaxExtent>
		hhea.caretSlopeRise = rf.readShort();
	//  175  379:aload_0         
	//  176  380:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  177  383:aload_0         
	//  178  384:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  179  387:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  180  390:putfield        #463 <Field short TrueTypeFont$HorizontalHeader.caretSlopeRise>
		hhea.caretSlopeRun = rf.readShort();
	//  181  393:aload_0         
	//  182  394:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  183  397:aload_0         
	//  184  398:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  185  401:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  186  404:putfield        #466 <Field short TrueTypeFont$HorizontalHeader.caretSlopeRun>
		rf.skipBytes(12);
	//  187  407:aload_0         
	//  188  408:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  189  411:bipush          12
	//  190  413:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//  191  416:pop             
		hhea.numberOfHMetrics = rf.readUnsignedShort();
	//  192  417:aload_0         
	//  193  418:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  194  421:aload_0         
	//  195  422:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  196  425:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  197  428:putfield        #469 <Field int TrueTypeFont$HorizontalHeader.numberOfHMetrics>
		ai = (int[])tables.get("OS/2");
	//  198  431:aload_0         
	//  199  432:getfield        #303 <Field HashMap tables>
	//  200  435:ldc2            #471 <String "OS/2">
	//  201  438:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//  202  441:checkcast       #272 <Class int[]>
	//  203  444:astore          4
		if(ai != null)
	//* 204  446:aload           4
	//* 205  448:ifnull          1036
		{
			rf.seek(ai[0]);
	//  206  451:aload_0         
	//  207  452:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  208  455:aload           4
	//  209  457:iconst_0        
	//  210  458:iaload          
	//  211  459:i2l             
	//  212  460:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
			int i = rf.readUnsignedShort();
	//  213  463:aload_0         
	//  214  464:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  215  467:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  216  470:istore_1        
			os_2.xAvgCharWidth = rf.readShort();
	//  217  471:aload_0         
	//  218  472:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  219  475:aload_0         
	//  220  476:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  221  479:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  222  482:putfield        #474 <Field short TrueTypeFont$WindowsMetrics.xAvgCharWidth>
			os_2.usWeightClass = rf.readUnsignedShort();
	//  223  485:aload_0         
	//  224  486:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  225  489:aload_0         
	//  226  490:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  227  493:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  228  496:putfield        #477 <Field int TrueTypeFont$WindowsMetrics.usWeightClass>
			os_2.usWidthClass = rf.readUnsignedShort();
	//  229  499:aload_0         
	//  230  500:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  231  503:aload_0         
	//  232  504:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  233  507:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  234  510:putfield        #480 <Field int TrueTypeFont$WindowsMetrics.usWidthClass>
			os_2.fsType = rf.readShort();
	//  235  513:aload_0         
	//  236  514:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  237  517:aload_0         
	//  238  518:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  239  521:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  240  524:putfield        #217 <Field short TrueTypeFont$WindowsMetrics.fsType>
			os_2.ySubscriptXSize = rf.readShort();
	//  241  527:aload_0         
	//  242  528:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  243  531:aload_0         
	//  244  532:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  245  535:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  246  538:putfield        #483 <Field short TrueTypeFont$WindowsMetrics.ySubscriptXSize>
			os_2.ySubscriptYSize = rf.readShort();
	//  247  541:aload_0         
	//  248  542:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  249  545:aload_0         
	//  250  546:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  251  549:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  252  552:putfield        #486 <Field short TrueTypeFont$WindowsMetrics.ySubscriptYSize>
			os_2.ySubscriptXOffset = rf.readShort();
	//  253  555:aload_0         
	//  254  556:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  255  559:aload_0         
	//  256  560:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  257  563:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  258  566:putfield        #489 <Field short TrueTypeFont$WindowsMetrics.ySubscriptXOffset>
			os_2.ySubscriptYOffset = rf.readShort();
	//  259  569:aload_0         
	//  260  570:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  261  573:aload_0         
	//  262  574:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  263  577:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  264  580:putfield        #492 <Field short TrueTypeFont$WindowsMetrics.ySubscriptYOffset>
			os_2.ySuperscriptXSize = rf.readShort();
	//  265  583:aload_0         
	//  266  584:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  267  587:aload_0         
	//  268  588:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  269  591:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  270  594:putfield        #495 <Field short TrueTypeFont$WindowsMetrics.ySuperscriptXSize>
			os_2.ySuperscriptYSize = rf.readShort();
	//  271  597:aload_0         
	//  272  598:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  273  601:aload_0         
	//  274  602:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  275  605:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  276  608:putfield        #498 <Field short TrueTypeFont$WindowsMetrics.ySuperscriptYSize>
			os_2.ySuperscriptXOffset = rf.readShort();
	//  277  611:aload_0         
	//  278  612:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  279  615:aload_0         
	//  280  616:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  281  619:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  282  622:putfield        #501 <Field short TrueTypeFont$WindowsMetrics.ySuperscriptXOffset>
			os_2.ySuperscriptYOffset = rf.readShort();
	//  283  625:aload_0         
	//  284  626:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  285  629:aload_0         
	//  286  630:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  287  633:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  288  636:putfield        #504 <Field short TrueTypeFont$WindowsMetrics.ySuperscriptYOffset>
			os_2.yStrikeoutSize = rf.readShort();
	//  289  639:aload_0         
	//  290  640:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  291  643:aload_0         
	//  292  644:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  293  647:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  294  650:putfield        #507 <Field short TrueTypeFont$WindowsMetrics.yStrikeoutSize>
			os_2.yStrikeoutPosition = rf.readShort();
	//  295  653:aload_0         
	//  296  654:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  297  657:aload_0         
	//  298  658:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  299  661:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  300  664:putfield        #510 <Field short TrueTypeFont$WindowsMetrics.yStrikeoutPosition>
			os_2.sFamilyClass = rf.readShort();
	//  301  667:aload_0         
	//  302  668:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  303  671:aload_0         
	//  304  672:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  305  675:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  306  678:putfield        #513 <Field short TrueTypeFont$WindowsMetrics.sFamilyClass>
			rf.readFully(os_2.panose);
	//  307  681:aload_0         
	//  308  682:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  309  685:aload_0         
	//  310  686:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  311  689:getfield        #517 <Field byte[] TrueTypeFont$WindowsMetrics.panose>
	//  312  692:invokevirtual   #521 <Method void RandomAccessFileOrArray.readFully(byte[])>
			rf.skipBytes(16);
	//  313  695:aload_0         
	//  314  696:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  315  699:bipush          16
	//  316  701:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//  317  704:pop             
			rf.readFully(os_2.achVendID);
	//  318  705:aload_0         
	//  319  706:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  320  709:aload_0         
	//  321  710:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  322  713:getfield        #524 <Field byte[] TrueTypeFont$WindowsMetrics.achVendID>
	//  323  716:invokevirtual   #521 <Method void RandomAccessFileOrArray.readFully(byte[])>
			os_2.fsSelection = rf.readUnsignedShort();
	//  324  719:aload_0         
	//  325  720:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  326  723:aload_0         
	//  327  724:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  328  727:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  329  730:putfield        #527 <Field int TrueTypeFont$WindowsMetrics.fsSelection>
			os_2.usFirstCharIndex = rf.readUnsignedShort();
	//  330  733:aload_0         
	//  331  734:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  332  737:aload_0         
	//  333  738:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  334  741:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  335  744:putfield        #530 <Field int TrueTypeFont$WindowsMetrics.usFirstCharIndex>
			os_2.usLastCharIndex = rf.readUnsignedShort();
	//  336  747:aload_0         
	//  337  748:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  338  751:aload_0         
	//  339  752:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  340  755:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  341  758:putfield        #533 <Field int TrueTypeFont$WindowsMetrics.usLastCharIndex>
			os_2.sTypoAscender = rf.readShort();
	//  342  761:aload_0         
	//  343  762:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  344  765:aload_0         
	//  345  766:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  346  769:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  347  772:putfield        #536 <Field short TrueTypeFont$WindowsMetrics.sTypoAscender>
			os_2.sTypoDescender = rf.readShort();
	//  348  775:aload_0         
	//  349  776:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  350  779:aload_0         
	//  351  780:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  352  783:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  353  786:putfield        #539 <Field short TrueTypeFont$WindowsMetrics.sTypoDescender>
			if(os_2.sTypoDescender > 0)
	//* 354  789:aload_0         
	//* 355  790:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 356  793:getfield        #539 <Field short TrueTypeFont$WindowsMetrics.sTypoDescender>
	//* 357  796:ifle            815
				os_2.sTypoDescender = (short)(-os_2.sTypoDescender);
	//  358  799:aload_0         
	//  359  800:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  360  803:aload_0         
	//  361  804:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  362  807:getfield        #539 <Field short TrueTypeFont$WindowsMetrics.sTypoDescender>
	//  363  810:ineg            
	//  364  811:int2short       
	//  365  812:putfield        #539 <Field short TrueTypeFont$WindowsMetrics.sTypoDescender>
			os_2.sTypoLineGap = rf.readShort();
	//  366  815:aload_0         
	//  367  816:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  368  819:aload_0         
	//  369  820:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  370  823:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  371  826:putfield        #542 <Field short TrueTypeFont$WindowsMetrics.sTypoLineGap>
			os_2.usWinAscent = rf.readUnsignedShort();
	//  372  829:aload_0         
	//  373  830:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  374  833:aload_0         
	//  375  834:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  376  837:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  377  840:putfield        #545 <Field int TrueTypeFont$WindowsMetrics.usWinAscent>
			os_2.usWinDescent = rf.readUnsignedShort();
	//  378  843:aload_0         
	//  379  844:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  380  847:aload_0         
	//  381  848:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  382  851:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  383  854:putfield        #548 <Field int TrueTypeFont$WindowsMetrics.usWinDescent>
			os_2.ulCodePageRange1 = 0;
	//  384  857:aload_0         
	//  385  858:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  386  861:iconst_0        
	//  387  862:putfield        #551 <Field int TrueTypeFont$WindowsMetrics.ulCodePageRange1>
			os_2.ulCodePageRange2 = 0;
	//  388  865:aload_0         
	//  389  866:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  390  869:iconst_0        
	//  391  870:putfield        #554 <Field int TrueTypeFont$WindowsMetrics.ulCodePageRange2>
			if(i > 0)
	//* 392  873:iload_1         
	//* 393  874:ifle            905
			{
				os_2.ulCodePageRange1 = rf.readInt();
	//  394  877:aload_0         
	//  395  878:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  396  881:aload_0         
	//  397  882:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  398  885:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//  399  888:putfield        #551 <Field int TrueTypeFont$WindowsMetrics.ulCodePageRange1>
				os_2.ulCodePageRange2 = rf.readInt();
	//  400  891:aload_0         
	//  401  892:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  402  895:aload_0         
	//  403  896:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  404  899:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//  405  902:putfield        #554 <Field int TrueTypeFont$WindowsMetrics.ulCodePageRange2>
			}
			if(i > 1)
	//* 406  905:iload_1         
	//* 407  906:iconst_1        
	//* 408  907:icmple          1013
			{
				rf.skipBytes(2);
	//  409  910:aload_0         
	//  410  911:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  411  914:iconst_2        
	//  412  915:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//  413  918:pop             
				os_2.sCapHeight = ((int) (rf.readShort()));
	//  414  919:aload_0         
	//  415  920:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  416  923:aload_0         
	//  417  924:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  418  927:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  419  930:putfield        #557 <Field int TrueTypeFont$WindowsMetrics.sCapHeight>
			} else
	//* 420  933:aload_0         
	//* 421  934:getfield        #303 <Field HashMap tables>
	//* 422  937:ldc2            #559 <String "post">
	//* 423  940:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//* 424  943:checkcast       #272 <Class int[]>
	//* 425  946:astore          4
	//* 426  948:aload           4
	//* 427  950:ifnonnull       1384
	//* 428  953:aload_0         
	//* 429  954:aload_0         
	//* 430  955:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//* 431  958:getfield        #466 <Field short TrueTypeFont$HorizontalHeader.caretSlopeRun>
	//* 432  961:i2d             
	//* 433  962:aload_0         
	//* 434  963:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//* 435  966:getfield        #463 <Field short TrueTypeFont$HorizontalHeader.caretSlopeRise>
	//* 436  969:i2d             
	//* 437  970:invokestatic    #563 <Method double Math.atan2(double, double)>
	//* 438  973:dneg            
	//* 439  974:ldc2w           #564 <Double 180D>
	//* 440  977:dmul            
	//* 441  978:ldc2w           #566 <Double 3.1415926535897931D>
	//* 442  981:ddiv            
	//* 443  982:putfield        #569 <Field double italicAngle>
	//* 444  985:aload_0         
	//* 445  986:getfield        #303 <Field HashMap tables>
	//* 446  989:ldc2            #571 <String "maxp">
	//* 447  992:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//* 448  995:checkcast       #272 <Class int[]>
	//* 449  998:astore          4
	//* 450 1000:aload           4
	//* 451 1002:ifnonnull       1472
	//* 452 1005:aload_0         
	//* 453 1006:ldc2            #572 <Int 0x10000>
	//* 454 1009:putfield        #574 <Field int maxGlyphId>
	//* 455 1012:return          
			{
				os_2.sCapHeight = (int)(0.69999999999999996D * (double)head.unitsPerEm);
	//  456 1013:aload_0         
	//  457 1014:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  458 1017:ldc2w           #575 <Double 0.69999999999999996D>
	//  459 1020:aload_0         
	//  460 1021:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  461 1024:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  462 1027:i2d             
	//  463 1028:dmul            
	//  464 1029:d2i             
	//  465 1030:putfield        #557 <Field int TrueTypeFont$WindowsMetrics.sCapHeight>
			}
		} else
	//* 466 1033:goto            933
		if(tables.get("hhea") != null && tables.get("head") != null)
	//* 467 1036:aload_0         
	//* 468 1037:getfield        #303 <Field HashMap tables>
	//* 469 1040:ldc2            #439 <String "hhea">
	//* 470 1043:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//* 471 1046:ifnull          933
	//* 472 1049:aload_0         
	//* 473 1050:getfield        #303 <Field HashMap tables>
	//* 474 1053:ldc2            #304 <String "head">
	//* 475 1056:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//* 476 1059:ifnull          933
		{
			if(head.macStyle == 0)
	//* 477 1062:aload_0         
	//* 478 1063:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//* 479 1066:getfield        #438 <Field int TrueTypeFont$FontHeader.macStyle>
	//* 480 1069:ifne            1297
			{
				os_2.usWeightClass = 700;
	//  481 1072:aload_0         
	//  482 1073:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  483 1076:sipush          700
	//  484 1079:putfield        #477 <Field int TrueTypeFont$WindowsMetrics.usWeightClass>
				os_2.usWidthClass = 5;
	//  485 1082:aload_0         
	//  486 1083:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  487 1086:iconst_5        
	//  488 1087:putfield        #480 <Field int TrueTypeFont$WindowsMetrics.usWidthClass>
			} else
	//* 489 1090:aload_0         
	//* 490 1091:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 491 1094:iconst_0        
	//* 492 1095:putfield        #217 <Field short TrueTypeFont$WindowsMetrics.fsType>
	//* 493 1098:aload_0         
	//* 494 1099:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 495 1102:iconst_0        
	//* 496 1103:putfield        #486 <Field short TrueTypeFont$WindowsMetrics.ySubscriptYSize>
	//* 497 1106:aload_0         
	//* 498 1107:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 499 1110:iconst_0        
	//* 500 1111:putfield        #492 <Field short TrueTypeFont$WindowsMetrics.ySubscriptYOffset>
	//* 501 1114:aload_0         
	//* 502 1115:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 503 1118:iconst_0        
	//* 504 1119:putfield        #498 <Field short TrueTypeFont$WindowsMetrics.ySuperscriptYSize>
	//* 505 1122:aload_0         
	//* 506 1123:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 507 1126:iconst_0        
	//* 508 1127:putfield        #504 <Field short TrueTypeFont$WindowsMetrics.ySuperscriptYOffset>
	//* 509 1130:aload_0         
	//* 510 1131:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 511 1134:iconst_0        
	//* 512 1135:putfield        #507 <Field short TrueTypeFont$WindowsMetrics.yStrikeoutSize>
	//* 513 1138:aload_0         
	//* 514 1139:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 515 1142:iconst_0        
	//* 516 1143:putfield        #510 <Field short TrueTypeFont$WindowsMetrics.yStrikeoutPosition>
	//* 517 1146:aload_0         
	//* 518 1147:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 519 1150:aload_0         
	//* 520 1151:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//* 521 1154:getfield        #442 <Field short TrueTypeFont$HorizontalHeader.Ascender>
	//* 522 1157:i2d             
	//* 523 1158:ldc2w           #577 <Double 0.20999999999999999D>
	//* 524 1161:aload_0         
	//* 525 1162:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//* 526 1165:getfield        #442 <Field short TrueTypeFont$HorizontalHeader.Ascender>
	//* 527 1168:i2d             
	//* 528 1169:dmul            
	//* 529 1170:dsub            
	//* 530 1171:d2i             
	//* 531 1172:int2short       
	//* 532 1173:putfield        #536 <Field short TrueTypeFont$WindowsMetrics.sTypoAscender>
	//* 533 1176:aload_0         
	//* 534 1177:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 535 1180:aload_0         
	//* 536 1181:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//* 537 1184:getfield        #445 <Field short TrueTypeFont$HorizontalHeader.Descender>
	//* 538 1187:invokestatic    #581 <Method int Math.abs(int)>
	//* 539 1190:i2d             
	//* 540 1191:aload_0         
	//* 541 1192:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//* 542 1195:getfield        #445 <Field short TrueTypeFont$HorizontalHeader.Descender>
	//* 543 1198:invokestatic    #581 <Method int Math.abs(int)>
	//* 544 1201:i2d             
	//* 545 1202:ldc2w           #582 <Double 0.070000000000000007D>
	//* 546 1205:dmul            
	//* 547 1206:dsub            
	//* 548 1207:dneg            
	//* 549 1208:d2i             
	//* 550 1209:int2short       
	//* 551 1210:putfield        #539 <Field short TrueTypeFont$WindowsMetrics.sTypoDescender>
	//* 552 1213:aload_0         
	//* 553 1214:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 554 1217:aload_0         
	//* 555 1218:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//* 556 1221:getfield        #448 <Field short TrueTypeFont$HorizontalHeader.LineGap>
	//* 557 1224:iconst_2        
	//* 558 1225:imul            
	//* 559 1226:int2short       
	//* 560 1227:putfield        #542 <Field short TrueTypeFont$WindowsMetrics.sTypoLineGap>
	//* 561 1230:aload_0         
	//* 562 1231:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 563 1234:aload_0         
	//* 564 1235:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//* 565 1238:getfield        #442 <Field short TrueTypeFont$HorizontalHeader.Ascender>
	//* 566 1241:putfield        #545 <Field int TrueTypeFont$WindowsMetrics.usWinAscent>
	//* 567 1244:aload_0         
	//* 568 1245:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 569 1248:aload_0         
	//* 570 1249:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//* 571 1252:getfield        #445 <Field short TrueTypeFont$HorizontalHeader.Descender>
	//* 572 1255:putfield        #548 <Field int TrueTypeFont$WindowsMetrics.usWinDescent>
	//* 573 1258:aload_0         
	//* 574 1259:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 575 1262:iconst_0        
	//* 576 1263:putfield        #551 <Field int TrueTypeFont$WindowsMetrics.ulCodePageRange1>
	//* 577 1266:aload_0         
	//* 578 1267:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 579 1270:iconst_0        
	//* 580 1271:putfield        #554 <Field int TrueTypeFont$WindowsMetrics.ulCodePageRange2>
	//* 581 1274:aload_0         
	//* 582 1275:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//* 583 1278:ldc2w           #575 <Double 0.69999999999999996D>
	//* 584 1281:aload_0         
	//* 585 1282:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//* 586 1285:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//* 587 1288:i2d             
	//* 588 1289:dmul            
	//* 589 1290:d2i             
	//* 590 1291:putfield        #557 <Field int TrueTypeFont$WindowsMetrics.sCapHeight>
	//* 591 1294:goto            933
			if(head.macStyle == 5)
	//* 592 1297:aload_0         
	//* 593 1298:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//* 594 1301:getfield        #438 <Field int TrueTypeFont$FontHeader.macStyle>
	//* 595 1304:iconst_5        
	//* 596 1305:icmpne          1329
			{
				os_2.usWeightClass = 400;
	//  597 1308:aload_0         
	//  598 1309:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  599 1312:sipush          400
	//  600 1315:putfield        #477 <Field int TrueTypeFont$WindowsMetrics.usWeightClass>
				os_2.usWidthClass = 3;
	//  601 1318:aload_0         
	//  602 1319:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  603 1322:iconst_3        
	//  604 1323:putfield        #480 <Field int TrueTypeFont$WindowsMetrics.usWidthClass>
			} else
	//* 605 1326:goto            1090
			if(head.macStyle == 6)
	//* 606 1329:aload_0         
	//* 607 1330:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//* 608 1333:getfield        #438 <Field int TrueTypeFont$FontHeader.macStyle>
	//* 609 1336:bipush          6
	//* 610 1338:icmpne          1363
			{
				os_2.usWeightClass = 400;
	//  611 1341:aload_0         
	//  612 1342:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  613 1345:sipush          400
	//  614 1348:putfield        #477 <Field int TrueTypeFont$WindowsMetrics.usWeightClass>
				os_2.usWidthClass = 7;
	//  615 1351:aload_0         
	//  616 1352:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  617 1355:bipush          7
	//  618 1357:putfield        #480 <Field int TrueTypeFont$WindowsMetrics.usWidthClass>
			} else
	//* 619 1360:goto            1090
			{
				os_2.usWeightClass = 400;
	//  620 1363:aload_0         
	//  621 1364:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  622 1367:sipush          400
	//  623 1370:putfield        #477 <Field int TrueTypeFont$WindowsMetrics.usWeightClass>
				os_2.usWidthClass = 5;
	//  624 1373:aload_0         
	//  625 1374:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  626 1377:iconst_5        
	//  627 1378:putfield        #480 <Field int TrueTypeFont$WindowsMetrics.usWidthClass>
			}
			os_2.fsType = 0;
			os_2.ySubscriptYSize = 0;
			os_2.ySubscriptYOffset = 0;
			os_2.ySuperscriptYSize = 0;
			os_2.ySuperscriptYOffset = 0;
			os_2.yStrikeoutSize = 0;
			os_2.yStrikeoutPosition = 0;
			os_2.sTypoAscender = (short)(int)((double)hhea.Ascender - 0.20999999999999999D * (double)hhea.Ascender);
			os_2.sTypoDescender = (short)(int)(-((double)Math.abs(((int) (hhea.Descender))) - (double)Math.abs(((int) (hhea.Descender))) * 0.070000000000000007D));
			os_2.sTypoLineGap = (short)(hhea.LineGap * 2);
			os_2.usWinAscent = ((int) (hhea.Ascender));
			os_2.usWinDescent = ((int) (hhea.Descender));
			os_2.ulCodePageRange1 = 0;
			os_2.ulCodePageRange2 = 0;
			os_2.sCapHeight = (int)(0.69999999999999996D * (double)head.unitsPerEm);
		}
		ai = (int[])tables.get("post");
		if(ai == null)
		{
			italicAngle = (-Math.atan2(hhea.caretSlopeRun, hhea.caretSlopeRise) * 180D) / 3.1415926535897931D;
		} else
	//* 628 1381:goto            1090
		{
			rf.seek(ai[0] + 4);
	//  629 1384:aload_0         
	//  630 1385:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  631 1388:aload           4
	//  632 1390:iconst_0        
	//  633 1391:iaload          
	//  634 1392:iconst_4        
	//  635 1393:iadd            
	//  636 1394:i2l             
	//  637 1395:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
			int j = ((int) (rf.readShort()));
	//  638 1398:aload_0         
	//  639 1399:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  640 1402:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  641 1405:istore_1        
			int k = rf.readUnsignedShort();
	//  642 1406:aload_0         
	//  643 1407:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  644 1410:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  645 1413:istore_2        
			italicAngle = (double)j + (double)k / 16384D;
	//  646 1414:aload_0         
	//  647 1415:iload_1         
	//  648 1416:i2d             
	//  649 1417:iload_2         
	//  650 1418:i2d             
	//  651 1419:ldc2w           #584 <Double 16384D>
	//  652 1422:ddiv            
	//  653 1423:dadd            
	//  654 1424:putfield        #569 <Field double italicAngle>
			underlinePosition = ((int) (rf.readShort()));
	//  655 1427:aload_0         
	//  656 1428:aload_0         
	//  657 1429:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  658 1432:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  659 1435:putfield        #587 <Field int underlinePosition>
			underlineThickness = ((int) (rf.readShort()));
	//  660 1438:aload_0         
	//  661 1439:aload_0         
	//  662 1440:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  663 1443:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//  664 1446:putfield        #589 <Field int underlineThickness>
			if(rf.readInt() == 0)
	//* 665 1449:aload_0         
	//* 666 1450:getfield        #313 <Field RandomAccessFileOrArray rf>
	//* 667 1453:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//* 668 1456:ifeq            1467
	//* 669 1459:aload_0         
	//* 670 1460:iload_3         
	//* 671 1461:putfield        #162 <Field boolean isFixedPitch>
	//* 672 1464:goto            985
				flag = false;
	//  673 1467:iconst_0        
	//  674 1468:istore_3        
			isFixedPitch = flag;
		}
		ai = (int[])tables.get("maxp");
		if(ai == null)
		{
			maxGlyphId = 0x10000;
			return;
		} else
	//* 675 1469:goto            1459
		{
			rf.seek(ai[0] + 4);
	//  676 1472:aload_0         
	//  677 1473:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  678 1476:aload           4
	//  679 1478:iconst_0        
	//  680 1479:iaload          
	//  681 1480:iconst_4        
	//  682 1481:iadd            
	//  683 1482:i2l             
	//  684 1483:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
			maxGlyphId = rf.readUnsignedShort();
	//  685 1486:aload_0         
	//  686 1487:aload_0         
	//  687 1488:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  688 1491:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  689 1494:putfield        #574 <Field int maxGlyphId>
			return;
	//  690 1497:return          
		}
	}

	public String[][] getAllNameEntries()
	{
		return allNameEntries;
	//    0    0:aload_0         
	//    1    1:getfield        #593 <Field String[][] allNameEntries>
	//    2    4:areturn         
	}

	String[][] getAllNames()
		throws DocumentException, IOException
	{
		int ai[] = (int[])tables.get("name");
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field HashMap tables>
	//    2    4:ldc2            #596 <String "name">
	//    3    7:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #272 <Class int[]>
	//    5   13:astore          13
		if(ai == null)
	//*   6   15:aload           13
	//*   7   17:ifnonnull       71
			throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
				"name", (new StringBuilder()).append(fileName).append(style).toString()
			}));
	//    8   20:new             #165 <Class DocumentException>
	//    9   23:dup             
	//   10   24:ldc2            #311 <String "table.1.does.not.exist.in.2">
	//   11   27:iconst_2        
	//   12   28:anewarray       Object[]
	//   13   31:dup             
	//   14   32:iconst_0        
	//   15   33:ldc2            #596 <String "name">
	//   16   36:aastore         
	//   17   37:dup             
	//   18   38:iconst_1        
	//   19   39:new             #223 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #224 <Method void StringBuilder()>
	//   22   46:aload_0         
	//   23   47:getfield        #190 <Field String fileName>
	//   24   50:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:aload_0         
	//   26   54:getfield        #146 <Field String style>
	//   27   57:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   29   63:aastore         
	//   30   64:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   67:invokespecial   #240 <Method void DocumentException(String)>
	//   32   70:athrow          
		rf.seek(ai[0] + 2);
	//   33   71:aload_0         
	//   34   72:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   35   75:aload           13
	//   36   77:iconst_0        
	//   37   78:iaload          
	//   38   79:iconst_2        
	//   39   80:iadd            
	//   40   81:i2l             
	//   41   82:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		int k = rf.readUnsignedShort();
	//   42   85:aload_0         
	//   43   86:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   44   89:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   45   92:istore_2        
		int l = rf.readUnsignedShort();
	//   46   93:aload_0         
	//   47   94:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   48   97:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   49  100:istore_3        
		ArrayList arraylist = new ArrayList();
	//   50  101:new             #263 <Class ArrayList>
	//   51  104:dup             
	//   52  105:invokespecial   #264 <Method void ArrayList()>
	//   53  108:astore          12
		int i = 0;
	//   54  110:iconst_0        
	//   55  111:istore_1        
		while(i < k) 
	//*  56  112:iload_1         
	//*  57  113:iload_2         
	//*  58  114:icmpge          304
		{
			int i1 = rf.readUnsignedShort();
	//   59  117:aload_0         
	//   60  118:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   61  121:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   62  124:istore          4
			int j1 = rf.readUnsignedShort();
	//   63  126:aload_0         
	//   64  127:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   65  130:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   66  133:istore          5
			int k1 = rf.readUnsignedShort();
	//   67  135:aload_0         
	//   68  136:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   69  139:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   70  142:istore          6
			int l1 = rf.readUnsignedShort();
	//   71  144:aload_0         
	//   72  145:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   73  148:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   74  151:istore          7
			int i2 = rf.readUnsignedShort();
	//   75  153:aload_0         
	//   76  154:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   77  157:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   78  160:istore          8
			int j2 = rf.readUnsignedShort();
	//   79  162:aload_0         
	//   80  163:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   81  166:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   82  169:istore          9
			int k2 = (int)rf.getFilePointer();
	//   83  171:aload_0         
	//   84  172:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   85  175:invokevirtual   #600 <Method long RandomAccessFileOrArray.getFilePointer()>
	//   86  178:l2i             
	//   87  179:istore          10
			rf.seek(ai[0] + l + j2);
	//   88  181:aload_0         
	//   89  182:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   90  185:aload           13
	//   91  187:iconst_0        
	//   92  188:iaload          
	//   93  189:iload_3         
	//   94  190:iadd            
	//   95  191:iload           9
	//   96  193:iadd            
	//   97  194:i2l             
	//   98  195:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
			String s;
			if(i1 == 0 || i1 == 3 || i1 == 2 && j1 == 1)
	//*  99  198:iload           4
	//* 100  200:ifeq            221
	//* 101  203:iload           4
	//* 102  205:iconst_3        
	//* 103  206:icmpeq          221
	//* 104  209:iload           4
	//* 105  211:iconst_2        
	//* 106  212:icmpne          293
	//* 107  215:iload           5
	//* 108  217:iconst_1        
	//* 109  218:icmpne          293
				s = readUnicodeString(i2);
	//  110  221:aload_0         
	//  111  222:iload           8
	//  112  224:invokevirtual   #603 <Method String readUnicodeString(int)>
	//  113  227:astore          11
			else
	//* 114  229:aload           12
	//* 115  231:iconst_5        
	//* 116  232:anewarray       String[]
	//* 117  235:dup             
	//* 118  236:iconst_0        
	//* 119  237:iload           7
	//* 120  239:invokestatic    #605 <Method String String.valueOf(int)>
	//* 121  242:aastore         
	//* 122  243:dup             
	//* 123  244:iconst_1        
	//* 124  245:iload           4
	//* 125  247:invokestatic    #605 <Method String String.valueOf(int)>
	//* 126  250:aastore         
	//* 127  251:dup             
	//* 128  252:iconst_2        
	//* 129  253:iload           5
	//* 130  255:invokestatic    #605 <Method String String.valueOf(int)>
	//* 131  258:aastore         
	//* 132  259:dup             
	//* 133  260:iconst_3        
	//* 134  261:iload           6
	//* 135  263:invokestatic    #605 <Method String String.valueOf(int)>
	//* 136  266:aastore         
	//* 137  267:dup             
	//* 138  268:iconst_4        
	//* 139  269:aload           11
	//* 140  271:aastore         
	//* 141  272:invokevirtual   #286 <Method boolean ArrayList.add(Object)>
	//* 142  275:pop             
	//* 143  276:aload_0         
	//* 144  277:getfield        #313 <Field RandomAccessFileOrArray rf>
	//* 145  280:iload           10
	//* 146  282:i2l             
	//* 147  283:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
	//* 148  286:iload_1         
	//* 149  287:iconst_1        
	//* 150  288:iadd            
	//* 151  289:istore_1        
	//* 152  290:goto            112
				s = readStandardString(i2);
	//  153  293:aload_0         
	//  154  294:iload           8
	//  155  296:invokevirtual   #608 <Method String readStandardString(int)>
	//  156  299:astore          11
			arraylist.add(((Object) (new String[] {
				String.valueOf(l1), String.valueOf(i1), String.valueOf(j1), String.valueOf(k1), s
			})));
			rf.seek(k2);
			i++;
		}
	//* 157  301:goto            229
		String as[][] = new String[arraylist.size()][];
	//  158  304:aload           12
	//  159  306:invokevirtual   #267 <Method int ArrayList.size()>
	//  160  309:anewarray       String[][]
	//  161  312:astore          11
		for(int j = 0; j < arraylist.size(); j++)
	//* 162  314:iconst_0        
	//* 163  315:istore_1        
	//* 164  316:iload_1         
	//* 165  317:aload           12
	//* 166  319:invokevirtual   #267 <Method int ArrayList.size()>
	//* 167  322:icmpge          345
			as[j] = (String[])arraylist.get(j);
	//  168  325:aload           11
	//  169  327:iload_1         
	//  170  328:aload           12
	//  171  330:iload_1         
	//  172  331:invokevirtual   #271 <Method Object ArrayList.get(int)>
	//  173  334:checkcast       #609 <Class String[]>
	//  174  337:aastore         

	//  175  338:iload_1         
	//  176  339:iconst_1        
	//  177  340:iadd            
	//  178  341:istore_1        
	//* 179  342:goto            316
		return as;
	//  180  345:aload           11
	//  181  347:areturn         
	}

	String getBaseFont()
		throws DocumentException, IOException
	{
		int ai[] = (int[])tables.get("name");
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field HashMap tables>
	//    2    4:ldc2            #596 <String "name">
	//    3    7:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #272 <Class int[]>
	//    5   13:astore          8
		if(ai == null)
	//*   6   15:aload           8
	//*   7   17:ifnonnull       71
			throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
				"name", (new StringBuilder()).append(fileName).append(style).toString()
			}));
	//    8   20:new             #165 <Class DocumentException>
	//    9   23:dup             
	//   10   24:ldc2            #311 <String "table.1.does.not.exist.in.2">
	//   11   27:iconst_2        
	//   12   28:anewarray       Object[]
	//   13   31:dup             
	//   14   32:iconst_0        
	//   15   33:ldc2            #596 <String "name">
	//   16   36:aastore         
	//   17   37:dup             
	//   18   38:iconst_1        
	//   19   39:new             #223 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #224 <Method void StringBuilder()>
	//   22   46:aload_0         
	//   23   47:getfield        #190 <Field String fileName>
	//   24   50:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:aload_0         
	//   26   54:getfield        #146 <Field String style>
	//   27   57:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   29   63:aastore         
	//   30   64:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   67:invokespecial   #240 <Method void DocumentException(String)>
	//   32   70:athrow          
		rf.seek(ai[0] + 2);
	//   33   71:aload_0         
	//   34   72:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   35   75:aload           8
	//   36   77:iconst_0        
	//   37   78:iaload          
	//   38   79:iconst_2        
	//   39   80:iadd            
	//   40   81:i2l             
	//   41   82:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		int j = rf.readUnsignedShort();
	//   42   85:aload_0         
	//   43   86:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   44   89:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   45   92:istore_2        
		int k = rf.readUnsignedShort();
	//   46   93:aload_0         
	//   47   94:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   48   97:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   49  100:istore_3        
		for(int i = 0; i < j; i++)
	//*  50  101:iconst_0        
	//*  51  102:istore_1        
	//*  52  103:iload_1         
	//*  53  104:iload_2         
	//*  54  105:icmpge          216
		{
			int l = rf.readUnsignedShort();
	//   55  108:aload_0         
	//   56  109:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   57  112:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   58  115:istore          4
			rf.readUnsignedShort();
	//   59  117:aload_0         
	//   60  118:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   61  121:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   62  124:pop             
			rf.readUnsignedShort();
	//   63  125:aload_0         
	//   64  126:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   65  129:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   66  132:pop             
			int i1 = rf.readUnsignedShort();
	//   67  133:aload_0         
	//   68  134:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   69  137:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   70  140:istore          5
			int j1 = rf.readUnsignedShort();
	//   71  142:aload_0         
	//   72  143:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   73  146:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   74  149:istore          6
			int k1 = rf.readUnsignedShort();
	//   75  151:aload_0         
	//   76  152:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   77  155:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   78  158:istore          7
			if(i1 == 6)
	//*  79  160:iload           5
	//*  80  162:bipush          6
	//*  81  164:icmpne          209
			{
				rf.seek(ai[0] + k + k1);
	//   82  167:aload_0         
	//   83  168:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   84  171:aload           8
	//   85  173:iconst_0        
	//   86  174:iaload          
	//   87  175:iload_3         
	//   88  176:iadd            
	//   89  177:iload           7
	//   90  179:iadd            
	//   91  180:i2l             
	//   92  181:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
				if(l == 0 || l == 3)
	//*  93  184:iload           4
	//*  94  186:ifeq            195
	//*  95  189:iload           4
	//*  96  191:iconst_3        
	//*  97  192:icmpne          202
					return readUnicodeString(j1);
	//   98  195:aload_0         
	//   99  196:iload           6
	//  100  198:invokevirtual   #603 <Method String readUnicodeString(int)>
	//  101  201:areturn         
				else
					return readStandardString(j1);
	//  102  202:aload_0         
	//  103  203:iload           6
	//  104  205:invokevirtual   #608 <Method String readStandardString(int)>
	//  105  208:areturn         
			}
		}

	//  106  209:iload_1         
	//  107  210:iconst_1        
	//  108  211:iadd            
	//  109  212:istore_1        
	//* 110  213:goto            103
		return (new File(fileName)).getName().replace(' ', '-');
	//  111  216:new             #612 <Class File>
	//  112  219:dup             
	//  113  220:aload_0         
	//  114  221:getfield        #190 <Field String fileName>
	//  115  224:invokespecial   #613 <Method void File(String)>
	//  116  227:invokevirtual   #616 <Method String File.getName()>
	//  117  230:bipush          32
	//  118  232:bipush          45
	//  119  234:invokevirtual   #620 <Method String String.replace(char, char)>
	//  120  237:areturn         
	}

	public String[] getCodePagesSupported()
	{
		long l2 = ((long)os_2.ulCodePageRange2 << 32) + ((long)os_2.ulCodePageRange1 & 0xffffffffL);
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//    2    4:getfield        #554 <Field int TrueTypeFont$WindowsMetrics.ulCodePageRange2>
	//    3    7:i2l             
	//    4    8:bipush          32
	//    5   10:lshl            
	//    6   11:aload_0         
	//    7   12:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//    8   15:getfield        #551 <Field int TrueTypeFont$WindowsMetrics.ulCodePageRange1>
	//    9   18:i2l             
	//   10   19:ldc2w           #623 <Long 0xffffffffL>
	//   11   22:land            
	//   12   23:ladd            
	//   13   24:lstore          6
		int k = 0;
	//   14   26:iconst_0        
	//   15   27:istore_2        
		long l1 = 1L;
	//   16   28:lconst_1        
	//   17   29:lstore          4
		for(int i = 0; i < 64;)
	//*  18   31:iconst_0        
	//*  19   32:istore_1        
	//*  20   33:iload_1         
	//*  21   34:bipush          64
	//*  22   36:icmpge          80
		{
			int l = k;
	//   23   39:iload_2         
	//   24   40:istore_3        
			if((l2 & l1) != 0L)
	//*  25   41:lload           6
	//*  26   43:lload           4
	//*  27   45:land            
	//*  28   46:lconst_0        
	//*  29   47:lcmp            
	//*  30   48:ifeq            65
			{
				l = k;
	//   31   51:iload_2         
	//   32   52:istore_3        
				if(codePages[i] != null)
	//*  33   53:getstatic       #134 <Field String[] codePages>
	//*  34   56:iload_1         
	//*  35   57:aaload          
	//*  36   58:ifnull          65
					l = k + 1;
	//   37   61:iload_2         
	//   38   62:iconst_1        
	//   39   63:iadd            
	//   40   64:istore_3        
			}
			l1 <<= 1;
	//   41   65:lload           4
	//   42   67:iconst_1        
	//   43   68:lshl            
	//   44   69:lstore          4
			i++;
	//   45   71:iload_1         
	//   46   72:iconst_1        
	//   47   73:iadd            
	//   48   74:istore_1        
			k = l;
	//   49   75:iload_3         
	//   50   76:istore_2        
		}

	//*  51   77:goto            33
		String as[] = new String[k];
	//   52   80:iload_2         
	//   53   81:anewarray       String[]
	//   54   84:astore          8
		l1 = 1L;
	//   55   86:lconst_1        
	//   56   87:lstore          4
		k = 0;
	//   57   89:iconst_0        
	//   58   90:istore_2        
		int j = 0;
	//   59   91:iconst_0        
	//   60   92:istore_1        
		for(; k < 64; k++)
	//*  61   93:iload_2         
	//*  62   94:bipush          64
	//*  63   96:icmpge          145
		{
			if((l2 & l1) != 0L && codePages[k] != null)
	//*  64   99:lload           6
	//*  65  101:lload           4
	//*  66  103:land            
	//*  67  104:lconst_0        
	//*  68  105:lcmp            
	//*  69  106:ifeq            148
	//*  70  109:getstatic       #134 <Field String[] codePages>
	//*  71  112:iload_2         
	//*  72  113:aaload          
	//*  73  114:ifnull          148
			{
				int i1 = j + 1;
	//   74  117:iload_1         
	//   75  118:iconst_1        
	//   76  119:iadd            
	//   77  120:istore_3        
				as[j] = codePages[k];
	//   78  121:aload           8
	//   79  123:iload_1         
	//   80  124:getstatic       #134 <Field String[] codePages>
	//   81  127:iload_2         
	//   82  128:aaload          
	//   83  129:aastore         
				j = i1;
	//   84  130:iload_3         
	//   85  131:istore_1        
			}
			l1 <<= 1;
	//   86  132:lload           4
	//   87  134:iconst_1        
	//   88  135:lshl            
	//   89  136:lstore          4
		}

	//   90  138:iload_2         
	//   91  139:iconst_1        
	//   92  140:iadd            
	//   93  141:istore_2        
	//*  94  142:goto            93
		return as;
	//   95  145:aload           8
	//   96  147:areturn         
	//*  97  148:goto            132
	}

	public String[][] getFamilyFontName()
	{
		return familyName;
	//    0    0:aload_0         
	//    1    1:getfield        #627 <Field String[][] familyName>
	//    2    4:areturn         
	}

	protected PdfDictionary getFontBaseType(PdfIndirectReference pdfindirectreference, String s, int i, int j, byte abyte0[])
	{
		int k;
		int l;
		PdfDictionary pdfdictionary;
		pdfdictionary = new PdfDictionary(PdfName.FONT);
	//    0    0:new             #631 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:getstatic       #637 <Field PdfName PdfName.FONT>
	//    3    7:invokespecial   #640 <Method void PdfDictionary(PdfName)>
	//    4   10:astore          9
		PdfName pdfname;
		if(cff)
	//*   5   12:aload_0         
	//*   6   13:getfield        #142 <Field boolean cff>
	//*   7   16:ifeq            247
		{
			pdfdictionary.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.TYPE1)));
	//    8   19:aload           9
	//    9   21:getstatic       #643 <Field PdfName PdfName.SUBTYPE>
	//   10   24:getstatic       #646 <Field PdfName PdfName.TYPE1>
	//   11   27:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.BASEFONT, ((PdfObject) (new PdfName((new StringBuilder()).append(fontName).append(style).toString()))));
	//   12   30:aload           9
	//   13   32:getstatic       #652 <Field PdfName PdfName.BASEFONT>
	//   14   35:new             #633 <Class PdfName>
	//   15   38:dup             
	//   16   39:new             #223 <Class StringBuilder>
	//   17   42:dup             
	//   18   43:invokespecial   #224 <Method void StringBuilder()>
	//   19   46:aload_0         
	//   20   47:getfield        #654 <Field String fontName>
	//   21   50:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   22   53:aload_0         
	//   23   54:getfield        #146 <Field String style>
	//   24   57:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   26   63:invokespecial   #655 <Method void PdfName(String)>
	//   27   66:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} else
	//*  28   69:iload_3         
	//*  29   70:istore          6
	//*  30   72:aload_0         
	//*  31   73:getfield        #349 <Field boolean fontSpecific>
	//*  32   76:ifne            168
	//*  33   79:iload_3         
	//*  34   80:istore          7
	//*  35   82:iload_3         
	//*  36   83:istore          6
	//*  37   85:iload           7
	//*  38   87:iload           4
	//*  39   89:icmpgt          112
	//*  40   92:aload_0         
	//*  41   93:getfield        #658 <Field String[] differences>
	//*  42   96:iload           7
	//*  43   98:aaload          
	//*  44   99:ldc2            #660 <String ".notdef">
	//*  45  102:invokevirtual   #663 <Method boolean String.equals(Object)>
	//*  46  105:ifne            304
	//*  47  108:iload           7
	//*  48  110:istore          6
	//*  49  112:aload_0         
	//*  50  113:getfield        #185 <Field String encoding>
	//*  51  116:ldc2            #665 <String "Cp1252">
	//*  52  119:invokevirtual   #663 <Method boolean String.equals(Object)>
	//*  53  122:ifne            138
	//*  54  125:aload_0         
	//*  55  126:getfield        #185 <Field String encoding>
	//*  56  129:ldc2            #667 <String "MacRoman">
	//*  57  132:invokevirtual   #663 <Method boolean String.equals(Object)>
	//*  58  135:ifeq            320
	//*  59  138:getstatic       #670 <Field PdfName PdfName.ENCODING>
	//*  60  141:astore          10
	//*  61  143:aload_0         
	//*  62  144:getfield        #185 <Field String encoding>
	//*  63  147:ldc2            #665 <String "Cp1252">
	//*  64  150:invokevirtual   #663 <Method boolean String.equals(Object)>
	//*  65  153:ifeq            313
	//*  66  156:getstatic       #673 <Field PdfName PdfName.WIN_ANSI_ENCODING>
	//*  67  159:astore_2        
	//*  68  160:aload           9
	//*  69  162:aload           10
	//*  70  164:aload_2         
	//*  71  165:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  72  168:aload           9
	//*  73  170:getstatic       #676 <Field PdfName PdfName.FIRSTCHAR>
	//*  74  173:new             #678 <Class PdfNumber>
	//*  75  176:dup             
	//*  76  177:iload           6
	//*  77  179:invokespecial   #681 <Method void PdfNumber(int)>
	//*  78  182:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  79  185:aload           9
	//*  80  187:getstatic       #684 <Field PdfName PdfName.LASTCHAR>
	//*  81  190:new             #678 <Class PdfNumber>
	//*  82  193:dup             
	//*  83  194:iload           4
	//*  84  196:invokespecial   #681 <Method void PdfNumber(int)>
	//*  85  199:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  86  202:new             #686 <Class PdfArray>
	//*  87  205:dup             
	//*  88  206:invokespecial   #687 <Method void PdfArray()>
	//*  89  209:astore_2        
	//*  90  210:iload           6
	//*  91  212:iload           4
	//*  92  214:icmpgt          466
	//*  93  217:aload           5
	//*  94  219:iload           6
	//*  95  221:baload          
	//*  96  222:ifne            444
	//*  97  225:aload_2         
	//*  98  226:new             #678 <Class PdfNumber>
	//*  99  229:dup             
	//* 100  230:iconst_0        
	//* 101  231:invokespecial   #681 <Method void PdfNumber(int)>
	//* 102  234:invokevirtual   #690 <Method boolean PdfArray.add(PdfObject)>
	//* 103  237:pop             
	//* 104  238:iload           6
	//* 105  240:iconst_1        
	//* 106  241:iadd            
	//* 107  242:istore          6
	//* 108  244:goto            210
		{
			pdfdictionary.put(PdfName.SUBTYPE, ((PdfObject) (PdfName.TRUETYPE)));
	//  109  247:aload           9
	//  110  249:getstatic       #643 <Field PdfName PdfName.SUBTYPE>
	//  111  252:getstatic       #693 <Field PdfName PdfName.TRUETYPE>
	//  112  255:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.BASEFONT, ((PdfObject) (new PdfName((new StringBuilder()).append(s).append(fontName).append(style).toString()))));
	//  113  258:aload           9
	//  114  260:getstatic       #652 <Field PdfName PdfName.BASEFONT>
	//  115  263:new             #633 <Class PdfName>
	//  116  266:dup             
	//  117  267:new             #223 <Class StringBuilder>
	//  118  270:dup             
	//  119  271:invokespecial   #224 <Method void StringBuilder()>
	//  120  274:aload_2         
	//  121  275:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  122  278:aload_0         
	//  123  279:getfield        #654 <Field String fontName>
	//  124  282:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  125  285:aload_0         
	//  126  286:getfield        #146 <Field String style>
	//  127  289:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  128  292:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  129  295:invokespecial   #655 <Method void PdfName(String)>
	//  130  298:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		k = i;
		if(fontSpecific) goto _L2; else goto _L1
_L1:
		l = i;
_L8:
		k = i;
		if(l > j) goto _L4; else goto _L3
_L3:
		if(differences[l].equals(".notdef")) goto _L6; else goto _L5
_L5:
		k = l;
_L4:
		if(encoding.equals("Cp1252") || encoding.equals("MacRoman"))
		{
			pdfname = PdfName.ENCODING;
			if(encoding.equals("Cp1252"))
				s = ((String) (PdfName.WIN_ANSI_ENCODING));
			else
	//* 131  301:goto            69
	//* 132  304:iload           7
	//* 133  306:iconst_1        
	//* 134  307:iadd            
	//* 135  308:istore          7
	//* 136  310:goto            82
				s = ((String) (PdfName.MAC_ROMAN_ENCODING));
	//  137  313:getstatic       #696 <Field PdfName PdfName.MAC_ROMAN_ENCODING>
	//  138  316:astore_2        
			pdfdictionary.put(pdfname, ((PdfObject) (s)));
		} else
	//* 139  317:goto            160
		{
			s = ((String) (new PdfDictionary(PdfName.ENCODING)));
	//  140  320:new             #631 <Class PdfDictionary>
	//  141  323:dup             
	//  142  324:getstatic       #670 <Field PdfName PdfName.ENCODING>
	//  143  327:invokespecial   #640 <Method void PdfDictionary(PdfName)>
	//  144  330:astore_2        
			PdfArray pdfarray = new PdfArray();
	//  145  331:new             #686 <Class PdfArray>
	//  146  334:dup             
	//  147  335:invokespecial   #687 <Method void PdfArray()>
	//  148  338:astore          10
			i = 1;
	//  149  340:iconst_1        
	//  150  341:istore_3        
			int j1 = k;
	//  151  342:iload           6
	//  152  344:istore          8
			while(j1 <= j) 
	//* 153  346:iload           8
	//* 154  348:iload           4
	//* 155  350:icmpgt          423
			{
				if(abyte0[j1] != 0)
	//* 156  353:aload           5
	//* 157  355:iload           8
	//* 158  357:baload          
	//* 159  358:ifeq            418
				{
					int i1 = i;
	//  160  361:iload_3         
	//  161  362:istore          7
					if(i != 0)
	//* 162  364:iload_3         
	//* 163  365:ifeq            386
					{
						pdfarray.add(((PdfObject) (new PdfNumber(j1))));
	//  164  368:aload           10
	//  165  370:new             #678 <Class PdfNumber>
	//  166  373:dup             
	//  167  374:iload           8
	//  168  376:invokespecial   #681 <Method void PdfNumber(int)>
	//  169  379:invokevirtual   #690 <Method boolean PdfArray.add(PdfObject)>
	//  170  382:pop             
						i1 = 0;
	//  171  383:iconst_0        
	//  172  384:istore          7
					}
					pdfarray.add(((PdfObject) (new PdfName(differences[j1]))));
	//  173  386:aload           10
	//  174  388:new             #633 <Class PdfName>
	//  175  391:dup             
	//  176  392:aload_0         
	//  177  393:getfield        #658 <Field String[] differences>
	//  178  396:iload           8
	//  179  398:aaload          
	//  180  399:invokespecial   #655 <Method void PdfName(String)>
	//  181  402:invokevirtual   #690 <Method boolean PdfArray.add(PdfObject)>
	//  182  405:pop             
					i = i1;
	//  183  406:iload           7
	//  184  408:istore_3        
				} else
	//* 185  409:iload           8
	//* 186  411:iconst_1        
	//* 187  412:iadd            
	//* 188  413:istore          8
	//* 189  415:goto            346
				{
					i = 1;
	//  190  418:iconst_1        
	//  191  419:istore_3        
				}
				j1++;
			}
	//* 192  420:goto            409
			((PdfDictionary) (s)).put(PdfName.DIFFERENCES, ((PdfObject) (pdfarray)));
	//  193  423:aload_2         
	//  194  424:getstatic       #699 <Field PdfName PdfName.DIFFERENCES>
	//  195  427:aload           10
	//  196  429:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.ENCODING, ((PdfObject) (s)));
	//  197  432:aload           9
	//  198  434:getstatic       #670 <Field PdfName PdfName.ENCODING>
	//  199  437:aload_2         
	//  200  438:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		  goto _L2
_L6:
		l++;
		continue; /* Loop/switch isn't completed */
_L2:
		pdfdictionary.put(PdfName.FIRSTCHAR, ((PdfObject) (new PdfNumber(k))));
		pdfdictionary.put(PdfName.LASTCHAR, ((PdfObject) (new PdfNumber(j))));
		s = ((String) (new PdfArray()));
		while(k <= j) 
		{
			if(abyte0[k] == 0)
				((PdfArray) (s)).add(((PdfObject) (new PdfNumber(0))));
			else
	//* 201  441:goto            168
				((PdfArray) (s)).add(((PdfObject) (new PdfNumber(widths[k]))));
	//  202  444:aload_2         
	//  203  445:new             #678 <Class PdfNumber>
	//  204  448:dup             
	//  205  449:aload_0         
	//  206  450:getfield        #702 <Field int[] widths>
	//  207  453:iload           6
	//  208  455:iaload          
	//  209  456:invokespecial   #681 <Method void PdfNumber(int)>
	//  210  459:invokevirtual   #690 <Method boolean PdfArray.add(PdfObject)>
	//  211  462:pop             
			k++;
		}
	//* 212  463:goto            238
		pdfdictionary.put(PdfName.WIDTHS, ((PdfObject) (s)));
	//  213  466:aload           9
	//  214  468:getstatic       #705 <Field PdfName PdfName.WIDTHS>
	//  215  471:aload_2         
	//  216  472:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(pdfindirectreference != null)
	//* 217  475:aload_1         
	//* 218  476:ifnull          488
			pdfdictionary.put(PdfName.FONTDESCRIPTOR, ((PdfObject) (pdfindirectreference)));
	//  219  479:aload           9
	//  220  481:getstatic       #708 <Field PdfName PdfName.FONTDESCRIPTOR>
	//  221  484:aload_1         
	//  222  485:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfdictionary;
	//  223  488:aload           9
	//  224  490:areturn         
		if(true) goto _L8; else goto _L7
_L7:
	}

	public float getFontDescriptor(int i, float f)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 22: default 104
	//	               1 106
	//	               2 126
	//	               3 146
	//	               4 166
	//	               5 172
	//	               6 192
	//	               7 212
	//	               8 232
	//	               9 252
	//	               10 272
	//	               11 292
	//	               12 312
	//	               13 332
	//	               14 356
	//	               15 373
	//	               16 393
	//	               17 413
	//	               18 433
	//	               19 454
	//	               20 474
	//	               21 494
	//	               22 503
		default:
			return 0.0F;
	//    2  104:fconst_0        
	//    3  105:freturn         

		case 1: // '\001'
			return ((float)os_2.sTypoAscender * f) / (float)head.unitsPerEm;
	//    4  106:aload_0         
	//    5  107:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//    6  110:getfield        #536 <Field short TrueTypeFont$WindowsMetrics.sTypoAscender>
	//    7  113:i2f             
	//    8  114:fload_2         
	//    9  115:fmul            
	//   10  116:aload_0         
	//   11  117:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   12  120:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   13  123:i2f             
	//   14  124:fdiv            
	//   15  125:freturn         

		case 2: // '\002'
			return ((float)os_2.sCapHeight * f) / (float)head.unitsPerEm;
	//   16  126:aload_0         
	//   17  127:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//   18  130:getfield        #557 <Field int TrueTypeFont$WindowsMetrics.sCapHeight>
	//   19  133:i2f             
	//   20  134:fload_2         
	//   21  135:fmul            
	//   22  136:aload_0         
	//   23  137:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   24  140:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   25  143:i2f             
	//   26  144:fdiv            
	//   27  145:freturn         

		case 3: // '\003'
			return ((float)os_2.sTypoDescender * f) / (float)head.unitsPerEm;
	//   28  146:aload_0         
	//   29  147:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//   30  150:getfield        #539 <Field short TrueTypeFont$WindowsMetrics.sTypoDescender>
	//   31  153:i2f             
	//   32  154:fload_2         
	//   33  155:fmul            
	//   34  156:aload_0         
	//   35  157:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   36  160:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   37  163:i2f             
	//   38  164:fdiv            
	//   39  165:freturn         

		case 4: // '\004'
			return (float)italicAngle;
	//   40  166:aload_0         
	//   41  167:getfield        #569 <Field double italicAngle>
	//   42  170:d2f             
	//   43  171:freturn         

		case 5: // '\005'
			return ((float)head.xMin * f) / (float)head.unitsPerEm;
	//   44  172:aload_0         
	//   45  173:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   46  176:getfield        #426 <Field short TrueTypeFont$FontHeader.xMin>
	//   47  179:i2f             
	//   48  180:fload_2         
	//   49  181:fmul            
	//   50  182:aload_0         
	//   51  183:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   52  186:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   53  189:i2f             
	//   54  190:fdiv            
	//   55  191:freturn         

		case 6: // '\006'
			return ((float)head.yMin * f) / (float)head.unitsPerEm;
	//   56  192:aload_0         
	//   57  193:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   58  196:getfield        #429 <Field short TrueTypeFont$FontHeader.yMin>
	//   59  199:i2f             
	//   60  200:fload_2         
	//   61  201:fmul            
	//   62  202:aload_0         
	//   63  203:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   64  206:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   65  209:i2f             
	//   66  210:fdiv            
	//   67  211:freturn         

		case 7: // '\007'
			return ((float)head.xMax * f) / (float)head.unitsPerEm;
	//   68  212:aload_0         
	//   69  213:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   70  216:getfield        #432 <Field short TrueTypeFont$FontHeader.xMax>
	//   71  219:i2f             
	//   72  220:fload_2         
	//   73  221:fmul            
	//   74  222:aload_0         
	//   75  223:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   76  226:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   77  229:i2f             
	//   78  230:fdiv            
	//   79  231:freturn         

		case 8: // '\b'
			return ((float)head.yMax * f) / (float)head.unitsPerEm;
	//   80  232:aload_0         
	//   81  233:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   82  236:getfield        #435 <Field short TrueTypeFont$FontHeader.yMax>
	//   83  239:i2f             
	//   84  240:fload_2         
	//   85  241:fmul            
	//   86  242:aload_0         
	//   87  243:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   88  246:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   89  249:i2f             
	//   90  250:fdiv            
	//   91  251:freturn         

		case 9: // '\t'
			return ((float)hhea.Ascender * f) / (float)head.unitsPerEm;
	//   92  252:aload_0         
	//   93  253:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//   94  256:getfield        #442 <Field short TrueTypeFont$HorizontalHeader.Ascender>
	//   95  259:i2f             
	//   96  260:fload_2         
	//   97  261:fmul            
	//   98  262:aload_0         
	//   99  263:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  100  266:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  101  269:i2f             
	//  102  270:fdiv            
	//  103  271:freturn         

		case 10: // '\n'
			return ((float)hhea.Descender * f) / (float)head.unitsPerEm;
	//  104  272:aload_0         
	//  105  273:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  106  276:getfield        #445 <Field short TrueTypeFont$HorizontalHeader.Descender>
	//  107  279:i2f             
	//  108  280:fload_2         
	//  109  281:fmul            
	//  110  282:aload_0         
	//  111  283:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  112  286:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  113  289:i2f             
	//  114  290:fdiv            
	//  115  291:freturn         

		case 11: // '\013'
			return ((float)hhea.LineGap * f) / (float)head.unitsPerEm;
	//  116  292:aload_0         
	//  117  293:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  118  296:getfield        #448 <Field short TrueTypeFont$HorizontalHeader.LineGap>
	//  119  299:i2f             
	//  120  300:fload_2         
	//  121  301:fmul            
	//  122  302:aload_0         
	//  123  303:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  124  306:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  125  309:i2f             
	//  126  310:fdiv            
	//  127  311:freturn         

		case 12: // '\f'
			return ((float)hhea.advanceWidthMax * f) / (float)head.unitsPerEm;
	//  128  312:aload_0         
	//  129  313:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//  130  316:getfield        #451 <Field int TrueTypeFont$HorizontalHeader.advanceWidthMax>
	//  131  319:i2f             
	//  132  320:fload_2         
	//  133  321:fmul            
	//  134  322:aload_0         
	//  135  323:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  136  326:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  137  329:i2f             
	//  138  330:fdiv            
	//  139  331:freturn         

		case 13: // '\r'
			return ((float)(underlinePosition - underlineThickness / 2) * f) / (float)head.unitsPerEm;
	//  140  332:aload_0         
	//  141  333:getfield        #587 <Field int underlinePosition>
	//  142  336:aload_0         
	//  143  337:getfield        #589 <Field int underlineThickness>
	//  144  340:iconst_2        
	//  145  341:idiv            
	//  146  342:isub            
	//  147  343:i2f             
	//  148  344:fload_2         
	//  149  345:fmul            
	//  150  346:aload_0         
	//  151  347:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  152  350:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  153  353:i2f             
	//  154  354:fdiv            
	//  155  355:freturn         

		case 14: // '\016'
			return ((float)underlineThickness * f) / (float)head.unitsPerEm;
	//  156  356:aload_0         
	//  157  357:getfield        #589 <Field int underlineThickness>
	//  158  360:i2f             
	//  159  361:fload_2         
	//  160  362:fmul            
	//  161  363:aload_0         
	//  162  364:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  163  367:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  164  370:i2f             
	//  165  371:fdiv            
	//  166  372:freturn         

		case 15: // '\017'
			return ((float)os_2.yStrikeoutPosition * f) / (float)head.unitsPerEm;
	//  167  373:aload_0         
	//  168  374:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  169  377:getfield        #510 <Field short TrueTypeFont$WindowsMetrics.yStrikeoutPosition>
	//  170  380:i2f             
	//  171  381:fload_2         
	//  172  382:fmul            
	//  173  383:aload_0         
	//  174  384:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  175  387:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  176  390:i2f             
	//  177  391:fdiv            
	//  178  392:freturn         

		case 16: // '\020'
			return ((float)os_2.yStrikeoutSize * f) / (float)head.unitsPerEm;
	//  179  393:aload_0         
	//  180  394:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  181  397:getfield        #507 <Field short TrueTypeFont$WindowsMetrics.yStrikeoutSize>
	//  182  400:i2f             
	//  183  401:fload_2         
	//  184  402:fmul            
	//  185  403:aload_0         
	//  186  404:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  187  407:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  188  410:i2f             
	//  189  411:fdiv            
	//  190  412:freturn         

		case 17: // '\021'
			return ((float)os_2.ySubscriptYSize * f) / (float)head.unitsPerEm;
	//  191  413:aload_0         
	//  192  414:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  193  417:getfield        #486 <Field short TrueTypeFont$WindowsMetrics.ySubscriptYSize>
	//  194  420:i2f             
	//  195  421:fload_2         
	//  196  422:fmul            
	//  197  423:aload_0         
	//  198  424:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  199  427:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  200  430:i2f             
	//  201  431:fdiv            
	//  202  432:freturn         

		case 18: // '\022'
			return ((float)(-os_2.ySubscriptYOffset) * f) / (float)head.unitsPerEm;
	//  203  433:aload_0         
	//  204  434:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  205  437:getfield        #492 <Field short TrueTypeFont$WindowsMetrics.ySubscriptYOffset>
	//  206  440:ineg            
	//  207  441:i2f             
	//  208  442:fload_2         
	//  209  443:fmul            
	//  210  444:aload_0         
	//  211  445:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  212  448:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  213  451:i2f             
	//  214  452:fdiv            
	//  215  453:freturn         

		case 19: // '\023'
			return ((float)os_2.ySuperscriptYSize * f) / (float)head.unitsPerEm;
	//  216  454:aload_0         
	//  217  455:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  218  458:getfield        #498 <Field short TrueTypeFont$WindowsMetrics.ySuperscriptYSize>
	//  219  461:i2f             
	//  220  462:fload_2         
	//  221  463:fmul            
	//  222  464:aload_0         
	//  223  465:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  224  468:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  225  471:i2f             
	//  226  472:fdiv            
	//  227  473:freturn         

		case 20: // '\024'
			return ((float)os_2.ySuperscriptYOffset * f) / (float)head.unitsPerEm;
	//  228  474:aload_0         
	//  229  475:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  230  478:getfield        #504 <Field short TrueTypeFont$WindowsMetrics.ySuperscriptYOffset>
	//  231  481:i2f             
	//  232  482:fload_2         
	//  233  483:fmul            
	//  234  484:aload_0         
	//  235  485:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//  236  488:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//  237  491:i2f             
	//  238  492:fdiv            
	//  239  493:freturn         

		case 21: // '\025'
			return (float)os_2.usWeightClass;
	//  240  494:aload_0         
	//  241  495:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  242  498:getfield        #477 <Field int TrueTypeFont$WindowsMetrics.usWeightClass>
	//  243  501:i2f             
	//  244  502:freturn         

		case 22: // '\026'
			return (float)os_2.usWidthClass;
	//  245  503:aload_0         
	//  246  504:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//  247  507:getfield        #480 <Field int TrueTypeFont$WindowsMetrics.usWidthClass>
	//  248  510:i2f             
	//  249  511:freturn         
		}
	}

	protected PdfDictionary getFontDescriptor(PdfIndirectReference pdfindirectreference, String s, PdfIndirectReference pdfindirectreference1)
	{
		PdfDictionary pdfdictionary = new PdfDictionary(PdfName.FONTDESCRIPTOR);
	//    0    0:new             #631 <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:getstatic       #708 <Field PdfName PdfName.FONTDESCRIPTOR>
	//    3    7:invokespecial   #640 <Method void PdfDictionary(PdfName)>
	//    4   10:astore          6
		pdfdictionary.put(PdfName.ASCENT, ((PdfObject) (new PdfNumber((os_2.sTypoAscender * 1000) / head.unitsPerEm))));
	//    5   12:aload           6
	//    6   14:getstatic       #714 <Field PdfName PdfName.ASCENT>
	//    7   17:new             #678 <Class PdfNumber>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//   11   25:getfield        #536 <Field short TrueTypeFont$WindowsMetrics.sTypoAscender>
	//   12   28:sipush          1000
	//   13   31:imul            
	//   14   32:aload_0         
	//   15   33:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   16   36:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   17   39:idiv            
	//   18   40:invokespecial   #681 <Method void PdfNumber(int)>
	//   19   43:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.CAPHEIGHT, ((PdfObject) (new PdfNumber((os_2.sCapHeight * 1000) / head.unitsPerEm))));
	//   20   46:aload           6
	//   21   48:getstatic       #717 <Field PdfName PdfName.CAPHEIGHT>
	//   22   51:new             #678 <Class PdfNumber>
	//   23   54:dup             
	//   24   55:aload_0         
	//   25   56:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//   26   59:getfield        #557 <Field int TrueTypeFont$WindowsMetrics.sCapHeight>
	//   27   62:sipush          1000
	//   28   65:imul            
	//   29   66:aload_0         
	//   30   67:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   31   70:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   32   73:idiv            
	//   33   74:invokespecial   #681 <Method void PdfNumber(int)>
	//   34   77:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.DESCENT, ((PdfObject) (new PdfNumber((os_2.sTypoDescender * 1000) / head.unitsPerEm))));
	//   35   80:aload           6
	//   36   82:getstatic       #720 <Field PdfName PdfName.DESCENT>
	//   37   85:new             #678 <Class PdfNumber>
	//   38   88:dup             
	//   39   89:aload_0         
	//   40   90:getfield        #155 <Field TrueTypeFont$WindowsMetrics os_2>
	//   41   93:getfield        #539 <Field short TrueTypeFont$WindowsMetrics.sTypoDescender>
	//   42   96:sipush          1000
	//   43   99:imul            
	//   44  100:aload_0         
	//   45  101:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   46  104:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   47  107:idiv            
	//   48  108:invokespecial   #681 <Method void PdfNumber(int)>
	//   49  111:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.FONTBBOX, ((PdfObject) (new PdfRectangle((head.xMin * 1000) / head.unitsPerEm, (head.yMin * 1000) / head.unitsPerEm, (head.xMax * 1000) / head.unitsPerEm, (head.yMax * 1000) / head.unitsPerEm))));
	//   50  114:aload           6
	//   51  116:getstatic       #723 <Field PdfName PdfName.FONTBBOX>
	//   52  119:new             #725 <Class PdfRectangle>
	//   53  122:dup             
	//   54  123:aload_0         
	//   55  124:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   56  127:getfield        #426 <Field short TrueTypeFont$FontHeader.xMin>
	//   57  130:sipush          1000
	//   58  133:imul            
	//   59  134:aload_0         
	//   60  135:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   61  138:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   62  141:idiv            
	//   63  142:i2f             
	//   64  143:aload_0         
	//   65  144:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   66  147:getfield        #429 <Field short TrueTypeFont$FontHeader.yMin>
	//   67  150:sipush          1000
	//   68  153:imul            
	//   69  154:aload_0         
	//   70  155:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   71  158:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   72  161:idiv            
	//   73  162:i2f             
	//   74  163:aload_0         
	//   75  164:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   76  167:getfield        #432 <Field short TrueTypeFont$FontHeader.xMax>
	//   77  170:sipush          1000
	//   78  173:imul            
	//   79  174:aload_0         
	//   80  175:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   81  178:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   82  181:idiv            
	//   83  182:i2f             
	//   84  183:aload_0         
	//   85  184:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   86  187:getfield        #435 <Field short TrueTypeFont$FontHeader.yMax>
	//   87  190:sipush          1000
	//   88  193:imul            
	//   89  194:aload_0         
	//   90  195:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   91  198:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   92  201:idiv            
	//   93  202:i2f             
	//   94  203:invokespecial   #728 <Method void PdfRectangle(float, float, float, float)>
	//   95  206:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(pdfindirectreference1 != null)
	//*  96  209:aload_3         
	//*  97  210:ifnull          222
			pdfdictionary.put(PdfName.CIDSET, ((PdfObject) (pdfindirectreference1)));
	//   98  213:aload           6
	//   99  215:getstatic       #731 <Field PdfName PdfName.CIDSET>
	//  100  218:aload_3         
	//  101  219:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		int i;
		int j;
		if(cff)
	//* 102  222:aload_0         
	//* 103  223:getfield        #142 <Field boolean cff>
	//* 104  226:ifeq            492
		{
			if(encoding.startsWith("Identity-"))
	//* 105  229:aload_0         
	//* 106  230:getfield        #185 <Field String encoding>
	//* 107  233:ldc2            #733 <String "Identity-">
	//* 108  236:invokevirtual   #247 <Method boolean String.startsWith(String)>
	//* 109  239:ifeq            446
				pdfdictionary.put(PdfName.FONTNAME, ((PdfObject) (new PdfName((new StringBuilder()).append(s).append(fontName).append("-").append(encoding).toString()))));
	//  110  242:aload           6
	//  111  244:getstatic       #736 <Field PdfName PdfName.FONTNAME>
	//  112  247:new             #633 <Class PdfName>
	//  113  250:dup             
	//  114  251:new             #223 <Class StringBuilder>
	//  115  254:dup             
	//  116  255:invokespecial   #224 <Method void StringBuilder()>
	//  117  258:aload_2         
	//  118  259:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  119  262:aload_0         
	//  120  263:getfield        #654 <Field String fontName>
	//  121  266:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  122  269:ldc2            #738 <String "-">
	//  123  272:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  124  275:aload_0         
	//  125  276:getfield        #185 <Field String encoding>
	//  126  279:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  127  282:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  128  285:invokespecial   #655 <Method void PdfName(String)>
	//  129  288:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
			else
	//* 130  291:aload           6
	//* 131  293:getstatic       #741 <Field PdfName PdfName.ITALICANGLE>
	//* 132  296:new             #678 <Class PdfNumber>
	//* 133  299:dup             
	//* 134  300:aload_0         
	//* 135  301:getfield        #569 <Field double italicAngle>
	//* 136  304:invokespecial   #744 <Method void PdfNumber(double)>
	//* 137  307:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 138  310:aload           6
	//* 139  312:getstatic       #747 <Field PdfName PdfName.STEMV>
	//* 140  315:new             #678 <Class PdfNumber>
	//* 141  318:dup             
	//* 142  319:bipush          80
	//* 143  321:invokespecial   #681 <Method void PdfNumber(int)>
	//* 144  324:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 145  327:aload_1         
	//* 146  328:ifnull          347
	//* 147  331:aload_0         
	//* 148  332:getfield        #142 <Field boolean cff>
	//* 149  335:ifeq            538
	//* 150  338:aload           6
	//* 151  340:getstatic       #750 <Field PdfName PdfName.FONTFILE3>
	//* 152  343:aload_1         
	//* 153  344:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 154  347:iconst_0        
	//* 155  348:istore          4
	//* 156  350:aload_0         
	//* 157  351:getfield        #162 <Field boolean isFixedPitch>
	//* 158  354:ifeq            362
	//* 159  357:iconst_0        
	//* 160  358:iconst_1        
	//* 161  359:ior             
	//* 162  360:istore          4
	//* 163  362:aload_0         
	//* 164  363:getfield        #349 <Field boolean fontSpecific>
	//* 165  366:ifeq            550
	//* 166  369:iconst_4        
	//* 167  370:istore          5
	//* 168  372:iload           4
	//* 169  374:iload           5
	//* 170  376:ior             
	//* 171  377:istore          5
	//* 172  379:iload           5
	//* 173  381:istore          4
	//* 174  383:aload_0         
	//* 175  384:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//* 176  387:getfield        #438 <Field int TrueTypeFont$FontHeader.macStyle>
	//* 177  390:iconst_2        
	//* 178  391:iand            
	//* 179  392:ifeq            402
	//* 180  395:iload           5
	//* 181  397:bipush          64
	//* 182  399:ior             
	//* 183  400:istore          4
	//* 184  402:iload           4
	//* 185  404:istore          5
	//* 186  406:aload_0         
	//* 187  407:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//* 188  410:getfield        #438 <Field int TrueTypeFont$FontHeader.macStyle>
	//* 189  413:iconst_1        
	//* 190  414:iand            
	//* 191  415:ifeq            426
	//* 192  418:iload           4
	//* 193  420:ldc2            #751 <Int 0x40000>
	//* 194  423:ior             
	//* 195  424:istore          5
	//* 196  426:aload           6
	//* 197  428:getstatic       #754 <Field PdfName PdfName.FLAGS>
	//* 198  431:new             #678 <Class PdfNumber>
	//* 199  434:dup             
	//* 200  435:iload           5
	//* 201  437:invokespecial   #681 <Method void PdfNumber(int)>
	//* 202  440:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 203  443:aload           6
	//* 204  445:areturn         
				pdfdictionary.put(PdfName.FONTNAME, ((PdfObject) (new PdfName((new StringBuilder()).append(s).append(fontName).append(style).toString()))));
	//  205  446:aload           6
	//  206  448:getstatic       #736 <Field PdfName PdfName.FONTNAME>
	//  207  451:new             #633 <Class PdfName>
	//  208  454:dup             
	//  209  455:new             #223 <Class StringBuilder>
	//  210  458:dup             
	//  211  459:invokespecial   #224 <Method void StringBuilder()>
	//  212  462:aload_2         
	//  213  463:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  214  466:aload_0         
	//  215  467:getfield        #654 <Field String fontName>
	//  216  470:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  217  473:aload_0         
	//  218  474:getfield        #146 <Field String style>
	//  219  477:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  220  480:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  221  483:invokespecial   #655 <Method void PdfName(String)>
	//  222  486:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} else
	//* 223  489:goto            291
		{
			pdfdictionary.put(PdfName.FONTNAME, ((PdfObject) (new PdfName((new StringBuilder()).append(s).append(fontName).append(style).toString()))));
	//  224  492:aload           6
	//  225  494:getstatic       #736 <Field PdfName PdfName.FONTNAME>
	//  226  497:new             #633 <Class PdfName>
	//  227  500:dup             
	//  228  501:new             #223 <Class StringBuilder>
	//  229  504:dup             
	//  230  505:invokespecial   #224 <Method void StringBuilder()>
	//  231  508:aload_2         
	//  232  509:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  233  512:aload_0         
	//  234  513:getfield        #654 <Field String fontName>
	//  235  516:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  236  519:aload_0         
	//  237  520:getfield        #146 <Field String style>
	//  238  523:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  239  526:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  240  529:invokespecial   #655 <Method void PdfName(String)>
	//  241  532:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
		pdfdictionary.put(PdfName.ITALICANGLE, ((PdfObject) (new PdfNumber(italicAngle))));
		pdfdictionary.put(PdfName.STEMV, ((PdfObject) (new PdfNumber(80))));
		if(pdfindirectreference != null)
			if(cff)
				pdfdictionary.put(PdfName.FONTFILE3, ((PdfObject) (pdfindirectreference)));
			else
	//* 242  535:goto            291
				pdfdictionary.put(PdfName.FONTFILE2, ((PdfObject) (pdfindirectreference)));
	//  243  538:aload           6
	//  244  540:getstatic       #757 <Field PdfName PdfName.FONTFILE2>
	//  245  543:aload_1         
	//  246  544:invokevirtual   #649 <Method void PdfDictionary.put(PdfName, PdfObject)>
		i = 0;
		if(isFixedPitch)
			i = ((int) (false | true));
		if(fontSpecific)
			j = 4;
		else
	//* 247  547:goto            347
			j = 32;
	//  248  550:bipush          32
	//  249  552:istore          5
		j = i | j;
		i = j;
		if((head.macStyle & 2) != 0)
			i = j | 0x40;
		j = i;
		if((head.macStyle & 1) != 0)
			j = i | 0x40000;
		pdfdictionary.put(PdfName.FLAGS, ((PdfObject) (new PdfNumber(j))));
		return pdfdictionary;
	//* 250  554:goto            372
	}

	protected byte[] getFullFont()
		throws IOException
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		Object obj = ((Object) (new RandomAccessFileOrArray(rf)));
	//    2    2:new             #315 <Class RandomAccessFileOrArray>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #313 <Field RandomAccessFileOrArray rf>
	//    6   10:invokespecial   #764 <Method void RandomAccessFileOrArray(RandomAccessFileOrArray)>
	//    7   13:astore_1        
		((RandomAccessFileOrArray) (obj)).reOpen();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #767 <Method void RandomAccessFileOrArray.reOpen()>
		obj1 = ((Object) (new byte[(int)((RandomAccessFileOrArray) (obj)).length()]));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #769 <Method long RandomAccessFileOrArray.length()>
	//   12   22:l2i             
	//   13   23:newarray        byte[]
	//   14   25:astore_2        
		((RandomAccessFileOrArray) (obj)).readFully(((byte []) (obj1)));
	//   15   26:aload_1         
	//   16   27:aload_2         
	//   17   28:invokevirtual   #521 <Method void RandomAccessFileOrArray.readFully(byte[])>
		if(obj != null)
	//*  18   31:aload_1         
	//*  19   32:ifnull          39
			try
			{
				((RandomAccessFileOrArray) (obj)).close();
	//   20   35:aload_1         
	//   21   36:invokevirtual   #772 <Method void RandomAccessFileOrArray.close()>
			}
	//*  22   39:aload_2         
	//*  23   40:areturn         
	//*  24   41:astore_1        
	//*  25   42:aload_2         
	//*  26   43:ifnull          50
	//*  27   46:aload_2         
	//*  28   47:invokevirtual   #772 <Method void RandomAccessFileOrArray.close()>
	//*  29   50:aload_1         
	//*  30   51:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  31   52:astore_1        
			{
				return ((byte []) (obj1));
	//   32   53:aload_2         
	//   33   54:areturn         
			}
		return ((byte []) (obj1));
		obj;
_L2:
		if(obj1 != null)
			try
			{
				((RandomAccessFileOrArray) (obj1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1) { }
	//   34   55:astore_2        
		throw obj;
	//*  35   56:goto            50
		Exception exception;
		exception;
	//   36   59:astore_3        
		obj1 = obj;
	//   37   60:aload_1         
	//   38   61:astore_2        
		obj = ((Object) (exception));
	//   39   62:aload_3         
	//   40   63:astore_1        
		if(true) goto _L2; else goto _L1
	//   41   64:goto            42
_L1:
	}

	public String[][] getFullFontName()
	{
		return fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #775 <Field String[][] fullName>
	//    2    4:areturn         
	}

	public PdfStream getFullFontStream()
		throws IOException, DocumentException
	{
		if(cff)
	//*   0    0:aload_0         
	//*   1    1:getfield        #142 <Field boolean cff>
	//*   2    4:ifeq            26
		{
			return ((PdfStream) (new BaseFont.StreamFont(readCffFont(), "Type1C", compressionLevel)));
	//    3    7:new             #779 <Class BaseFont$StreamFont>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokevirtual   #782 <Method byte[] readCffFont()>
	//    7   15:ldc2            #784 <String "Type1C">
	//    8   18:aload_0         
	//    9   19:getfield        #787 <Field int compressionLevel>
	//   10   22:invokespecial   #790 <Method void BaseFont$StreamFont(byte[], String, int)>
	//   11   25:areturn         
		} else
		{
			byte abyte0[] = getFullFont();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #792 <Method byte[] getFullFont()>
	//   14   30:astore_3        
			int i = abyte0.length;
	//   15   31:aload_3         
	//   16   32:arraylength     
	//   17   33:istore_1        
			int j = compressionLevel;
	//   18   34:aload_0         
	//   19   35:getfield        #787 <Field int compressionLevel>
	//   20   38:istore_2        
			return ((PdfStream) (new BaseFont.StreamFont(abyte0, new int[] {
				i
			}, j)));
	//   21   39:new             #779 <Class BaseFont$StreamFont>
	//   22   42:dup             
	//   23   43:aload_3         
	//   24   44:iconst_1        
	//   25   45:newarray        int[]
	//   26   47:dup             
	//   27   48:iconst_0        
	//   28   49:iload_1         
	//   29   50:iastore         
	//   30   51:iload_2         
	//   31   52:invokespecial   #795 <Method void BaseFont$StreamFont(byte[], int[], int)>
	//   32   55:areturn         
		}
	}

	protected int getGlyphWidth(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i >= glyphWidthsByIndex.length)
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #798 <Field int[] glyphWidthsByIndex>
	//*   5    7:arraylength     
	//*   6    8:icmplt          19
			j = glyphWidthsByIndex.length - 1;
	//    7   11:aload_0         
	//    8   12:getfield        #798 <Field int[] glyphWidthsByIndex>
	//    9   15:arraylength     
	//   10   16:iconst_1        
	//   11   17:isub            
	//   12   18:istore_2        
		return glyphWidthsByIndex[j];
	//   13   19:aload_0         
	//   14   20:getfield        #798 <Field int[] glyphWidthsByIndex>
	//   15   23:iload_2         
	//   16   24:iaload          
	//   17   25:ireturn         
	}

	public int getKerning(int i, int j)
	{
		int ai[] = getMetricsTT(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #803 <Method int[] getMetricsTT(int)>
	//    3    5:astore_3        
		if(ai != null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       12
	//*   6   10:iconst_0        
	//*   7   11:ireturn         
		{
			i = ai[0];
	//    8   12:aload_3         
	//    9   13:iconst_0        
	//   10   14:iaload          
	//   11   15:istore_1        
			ai = getMetricsTT(j);
	//   12   16:aload_0         
	//   13   17:iload_2         
	//   14   18:invokevirtual   #803 <Method int[] getMetricsTT(int)>
	//   15   21:astore_3        
			if(ai != null)
	//*  16   22:aload_3         
	//*  17   23:ifnull          10
			{
				j = ai[0];
	//   18   26:aload_3         
	//   19   27:iconst_0        
	//   20   28:iaload          
	//   21   29:istore_2        
				return kerning.get((i << 16) + j);
	//   22   30:aload_0         
	//   23   31:getfield        #160 <Field IntHashtable kerning>
	//   24   34:iload_1         
	//   25   35:bipush          16
	//   26   37:ishl            
	//   27   38:iload_2         
	//   28   39:iadd            
	//   29   40:invokevirtual   #805 <Method int IntHashtable.get(int)>
	//   30   43:ireturn         
			}
		}
		return 0;
	}

	public int[] getMetricsTT(int i)
	{
		if(cmapExt != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #807 <Field HashMap cmapExt>
	//*   2    4:ifnull          22
			return (int[])cmapExt.get(((Object) (Integer.valueOf(i))));
	//    3    7:aload_0         
	//    4    8:getfield        #807 <Field HashMap cmapExt>
	//    5   11:iload_1         
	//    6   12:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//    7   15:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//    8   18:checkcast       #272 <Class int[]>
	//    9   21:areturn         
		if(!fontSpecific && cmap31 != null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #349 <Field boolean fontSpecific>
	//*  12   26:ifne            51
	//*  13   29:aload_0         
	//*  14   30:getfield        #351 <Field HashMap cmap31>
	//*  15   33:ifnull          51
			return (int[])cmap31.get(((Object) (Integer.valueOf(i))));
	//   16   36:aload_0         
	//   17   37:getfield        #351 <Field HashMap cmap31>
	//   18   40:iload_1         
	//   19   41:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//   20   44:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//   21   47:checkcast       #272 <Class int[]>
	//   22   50:areturn         
		if(fontSpecific && cmap10 != null)
	//*  23   51:aload_0         
	//*  24   52:getfield        #349 <Field boolean fontSpecific>
	//*  25   55:ifeq            80
	//*  26   58:aload_0         
	//*  27   59:getfield        #399 <Field HashMap cmap10>
	//*  28   62:ifnull          80
			return (int[])cmap10.get(((Object) (Integer.valueOf(i))));
	//   29   65:aload_0         
	//   30   66:getfield        #399 <Field HashMap cmap10>
	//   31   69:iload_1         
	//   32   70:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//   33   73:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//   34   76:checkcast       #272 <Class int[]>
	//   35   79:areturn         
		if(cmap31 != null)
	//*  36   80:aload_0         
	//*  37   81:getfield        #351 <Field HashMap cmap31>
	//*  38   84:ifnull          102
			return (int[])cmap31.get(((Object) (Integer.valueOf(i))));
	//   39   87:aload_0         
	//   40   88:getfield        #351 <Field HashMap cmap31>
	//   41   91:iload_1         
	//   42   92:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//   43   95:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//   44   98:checkcast       #272 <Class int[]>
	//   45  101:areturn         
		if(cmap10 != null)
	//*  46  102:aload_0         
	//*  47  103:getfield        #399 <Field HashMap cmap10>
	//*  48  106:ifnull          124
			return (int[])cmap10.get(((Object) (Integer.valueOf(i))));
	//   49  109:aload_0         
	//   50  110:getfield        #399 <Field HashMap cmap10>
	//   51  113:iload_1         
	//   52  114:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//   53  117:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//   54  120:checkcast       #272 <Class int[]>
	//   55  123:areturn         
		else
			return null;
	//   56  124:aconst_null     
	//   57  125:areturn         
	}

	String[][] getNames(int i)
		throws DocumentException, IOException
	{
		int ai[] = (int[])tables.get("name");
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field HashMap tables>
	//    2    4:ldc2            #596 <String "name">
	//    3    7:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #272 <Class int[]>
	//    5   13:astore          13
		if(ai == null)
	//*   6   15:aload           13
	//*   7   17:ifnonnull       71
			throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
				"name", (new StringBuilder()).append(fileName).append(style).toString()
			}));
	//    8   20:new             #165 <Class DocumentException>
	//    9   23:dup             
	//   10   24:ldc2            #311 <String "table.1.does.not.exist.in.2">
	//   11   27:iconst_2        
	//   12   28:anewarray       Object[]
	//   13   31:dup             
	//   14   32:iconst_0        
	//   15   33:ldc2            #596 <String "name">
	//   16   36:aastore         
	//   17   37:dup             
	//   18   38:iconst_1        
	//   19   39:new             #223 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #224 <Method void StringBuilder()>
	//   22   46:aload_0         
	//   23   47:getfield        #190 <Field String fileName>
	//   24   50:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:aload_0         
	//   26   54:getfield        #146 <Field String style>
	//   27   57:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   29   63:aastore         
	//   30   64:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   67:invokespecial   #240 <Method void DocumentException(String)>
	//   32   70:athrow          
		rf.seek(ai[0] + 2);
	//   33   71:aload_0         
	//   34   72:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   35   75:aload           13
	//   36   77:iconst_0        
	//   37   78:iaload          
	//   38   79:iconst_2        
	//   39   80:iadd            
	//   40   81:i2l             
	//   41   82:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		int k = rf.readUnsignedShort();
	//   42   85:aload_0         
	//   43   86:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   44   89:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   45   92:istore_3        
		int l = rf.readUnsignedShort();
	//   46   93:aload_0         
	//   47   94:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   48   97:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   49  100:istore          4
		ArrayList arraylist = new ArrayList();
	//   50  102:new             #263 <Class ArrayList>
	//   51  105:dup             
	//   52  106:invokespecial   #264 <Method void ArrayList()>
	//   53  109:astore          12
		int j = 0;
	//   54  111:iconst_0        
	//   55  112:istore_2        
		while(j < k) 
	//*  56  113:iload_2         
	//*  57  114:iload_3         
	//*  58  115:icmpge          304
		{
			int i1 = rf.readUnsignedShort();
	//   59  118:aload_0         
	//   60  119:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   61  122:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   62  125:istore          5
			int j1 = rf.readUnsignedShort();
	//   63  127:aload_0         
	//   64  128:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   65  131:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   66  134:istore          6
			int k1 = rf.readUnsignedShort();
	//   67  136:aload_0         
	//   68  137:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   69  140:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   70  143:istore          7
			int j2 = rf.readUnsignedShort();
	//   71  145:aload_0         
	//   72  146:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   73  149:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   74  152:istore          10
			int l1 = rf.readUnsignedShort();
	//   75  154:aload_0         
	//   76  155:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   77  158:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   78  161:istore          8
			int i2 = rf.readUnsignedShort();
	//   79  163:aload_0         
	//   80  164:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   81  167:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   82  170:istore          9
			if(j2 == i)
	//*  83  172:iload           10
	//*  84  174:iload_1         
	//*  85  175:icmpne          286
			{
				int k2 = (int)rf.getFilePointer();
	//   86  178:aload_0         
	//   87  179:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   88  182:invokevirtual   #600 <Method long RandomAccessFileOrArray.getFilePointer()>
	//   89  185:l2i             
	//   90  186:istore          10
				rf.seek(ai[0] + l + i2);
	//   91  188:aload_0         
	//   92  189:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   93  192:aload           13
	//   94  194:iconst_0        
	//   95  195:iaload          
	//   96  196:iload           4
	//   97  198:iadd            
	//   98  199:iload           9
	//   99  201:iadd            
	//  100  202:i2l             
	//  101  203:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
				String s;
				if(i1 == 0 || i1 == 3 || i1 == 2 && j1 == 1)
	//* 102  206:iload           5
	//* 103  208:ifeq            229
	//* 104  211:iload           5
	//* 105  213:iconst_3        
	//* 106  214:icmpeq          229
	//* 107  217:iload           5
	//* 108  219:iconst_2        
	//* 109  220:icmpne          293
	//* 110  223:iload           6
	//* 111  225:iconst_1        
	//* 112  226:icmpne          293
					s = readUnicodeString(l1);
	//  113  229:aload_0         
	//  114  230:iload           8
	//  115  232:invokevirtual   #603 <Method String readUnicodeString(int)>
	//  116  235:astore          11
				else
	//* 117  237:aload           12
	//* 118  239:iconst_4        
	//* 119  240:anewarray       String[]
	//* 120  243:dup             
	//* 121  244:iconst_0        
	//* 122  245:iload           5
	//* 123  247:invokestatic    #605 <Method String String.valueOf(int)>
	//* 124  250:aastore         
	//* 125  251:dup             
	//* 126  252:iconst_1        
	//* 127  253:iload           6
	//* 128  255:invokestatic    #605 <Method String String.valueOf(int)>
	//* 129  258:aastore         
	//* 130  259:dup             
	//* 131  260:iconst_2        
	//* 132  261:iload           7
	//* 133  263:invokestatic    #605 <Method String String.valueOf(int)>
	//* 134  266:aastore         
	//* 135  267:dup             
	//* 136  268:iconst_3        
	//* 137  269:aload           11
	//* 138  271:aastore         
	//* 139  272:invokevirtual   #286 <Method boolean ArrayList.add(Object)>
	//* 140  275:pop             
	//* 141  276:aload_0         
	//* 142  277:getfield        #313 <Field RandomAccessFileOrArray rf>
	//* 143  280:iload           10
	//* 144  282:i2l             
	//* 145  283:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
	//* 146  286:iload_2         
	//* 147  287:iconst_1        
	//* 148  288:iadd            
	//* 149  289:istore_2        
	//* 150  290:goto            113
					s = readStandardString(l1);
	//  151  293:aload_0         
	//  152  294:iload           8
	//  153  296:invokevirtual   #608 <Method String readStandardString(int)>
	//  154  299:astore          11
				arraylist.add(((Object) (new String[] {
					String.valueOf(i1), String.valueOf(j1), String.valueOf(k1), s
				})));
				rf.seek(k2);
			}
			j++;
		}
	//* 155  301:goto            237
		String as[][] = new String[arraylist.size()][];
	//  156  304:aload           12
	//  157  306:invokevirtual   #267 <Method int ArrayList.size()>
	//  158  309:anewarray       String[][]
	//  159  312:astore          11
		for(i = 0; i < arraylist.size(); i++)
	//* 160  314:iconst_0        
	//* 161  315:istore_1        
	//* 162  316:iload_1         
	//* 163  317:aload           12
	//* 164  319:invokevirtual   #267 <Method int ArrayList.size()>
	//* 165  322:icmpge          345
			as[i] = (String[])arraylist.get(i);
	//  166  325:aload           11
	//  167  327:iload_1         
	//  168  328:aload           12
	//  169  330:iload_1         
	//  170  331:invokevirtual   #271 <Method Object ArrayList.get(int)>
	//  171  334:checkcast       #609 <Class String[]>
	//  172  337:aastore         

	//  173  338:iload_1         
	//  174  339:iconst_1        
	//  175  340:iadd            
	//  176  341:istore_1        
	//* 177  342:goto            316
		return as;
	//  178  345:aload           11
	//  179  347:areturn         
	}

	public String getPostscriptFontName()
	{
		return fontName;
	//    0    0:aload_0         
	//    1    1:getfield        #654 <Field String fontName>
	//    2    4:areturn         
	}

	protected int[] getRawCharBBox(int i, String s)
	{
		if(s == null || cmap31 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:getfield        #351 <Field HashMap cmap31>
	//*   4    8:ifnonnull       22
			s = ((String) (cmap10));
	//    5   11:aload_0         
	//    6   12:getfield        #399 <Field HashMap cmap10>
	//    7   15:astore_2        
		else
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       30
	//*  10   20:aconst_null     
	//*  11   21:areturn         
			s = ((String) (cmap31));
	//   12   22:aload_0         
	//   13   23:getfield        #351 <Field HashMap cmap31>
	//   14   26:astore_2        
		if(s != null)
	//*  15   27:goto            16
	//*  16   30:aload_2         
	//*  17   31:iload_1         
	//*  18   32:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//*  19   35:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//*  20   38:checkcast       #272 <Class int[]>
	//*  21   41:astore_2        
			if((s = ((String) ((int[])((HashMap) (s)).get(((Object) (Integer.valueOf(i))))))) != null && bboxes != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          20
	//*  24   46:aload_0         
	//*  25   47:getfield        #331 <Field int[][] bboxes>
	//*  26   50:ifnull          20
				return bboxes[s[0]];
	//   27   53:aload_0         
	//   28   54:getfield        #331 <Field int[][] bboxes>
	//   29   57:aload_2         
	//   30   58:iconst_0        
	//   31   59:iaload          
	//   32   60:aaload          
	//   33   61:areturn         
		return null;
	}

	int getRawWidth(int i, String s)
	{
		s = ((String) (getMetricsTT(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #803 <Method int[] getMetricsTT(int)>
	//    3    5:astore_2        
		if(s == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       12
			return 0;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		else
			return s[1];
	//    8   12:aload_2         
	//    9   13:iconst_1        
	//   10   14:iaload          
	//   11   15:ireturn         
	}

	protected byte[] getSubSet(HashSet hashset, boolean flag)
		throws IOException, DocumentException
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		this;
	//    2    3:aload_0         
		JVM INSTR monitorenter ;
	//    3    4:monitorenter    
		int i;
		String s;
		RandomAccessFileOrArray randomaccessfileorarray;
		s = fileName;
	//    4    5:aload_0         
	//    5    6:getfield        #190 <Field String fileName>
	//    6    9:astore          5
		randomaccessfileorarray = new RandomAccessFileOrArray(rf);
	//    7   11:new             #315 <Class RandomAccessFileOrArray>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   11   19:invokespecial   #764 <Method void RandomAccessFileOrArray(RandomAccessFileOrArray)>
	//   12   22:astore          6
		i = directoryOffset;
	//   13   24:aload_0         
	//   14   25:getfield        #346 <Field int directoryOffset>
	//   15   28:istore_3        
		if(!flag)
	//*  16   29:iload_2         
	//*  17   30:ifne            59
			flag = flag1;
	//   18   33:iload           4
	//   19   35:istore_2        
		else
	//*  20   36:new             #818 <Class TrueTypeFontSubSet>
	//*  21   39:dup             
	//*  22   40:aload           5
	//*  23   42:aload           6
	//*  24   44:aload_1         
	//*  25   45:iload_3         
	//*  26   46:iconst_1        
	//*  27   47:iload_2         
	//*  28   48:invokespecial   #821 <Method void TrueTypeFontSubSet(String, RandomAccessFileOrArray, HashSet, int, boolean, boolean)>
	//*  29   51:invokevirtual   #823 <Method byte[] TrueTypeFontSubSet.process()>
	//*  30   54:astore_1        
	//*  31   55:aload_0         
	//*  32   56:monitorexit     
	//*  33   57:aload_1         
	//*  34   58:areturn         
			flag = false;
	//   35   59:iconst_0        
	//   36   60:istore_2        
		hashset = ((HashSet) ((new TrueTypeFontSubSet(s, randomaccessfileorarray, hashset, i, true, flag)).process()));
		this;
		JVM INSTR monitorexit ;
		return ((byte []) (hashset));
	//*  37   61:goto            36
		hashset;
	//   38   64:astore_1        
	//*  39   65:aload_0         
		throw hashset;
	//   40   66:monitorexit     
	//   41   67:aload_1         
	//   42   68:athrow          
	}

	public String getSubfamily()
	{
		if(subFamily != null && subFamily.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #826 <Field String[][] subFamily>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #826 <Field String[][] subFamily>
	//*   5   11:arraylength     
	//*   6   12:ifle            24
			return subFamily[0][3];
	//    7   15:aload_0         
	//    8   16:getfield        #826 <Field String[][] subFamily>
	//    9   19:iconst_0        
	//   10   20:aaload          
	//   11   21:iconst_3        
	//   12   22:aaload          
	//   13   23:areturn         
		else
			return super.getSubfamily();
	//   14   24:aload_0         
	//   15   25:invokespecial   #828 <Method String BaseFont.getSubfamily()>
	//   16   28:areturn         
	}

	public boolean hasKernPairs()
	{
		return kerning.size() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field IntHashtable kerning>
	//    2    4:invokevirtual   #830 <Method int IntHashtable.size()>
	//    3    7:ifle            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	void process(byte abyte0[], boolean flag)
		throws DocumentException, IOException
	{
		int i;
		tables = new HashMap();
	//    0    0:aload_0         
	//    1    1:new             #306 <Class HashMap>
	//    2    4:dup             
	//    3    5:invokespecial   #831 <Method void HashMap()>
	//    4    8:putfield        #303 <Field HashMap tables>
		if(abyte0 == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       103
			rf = new RandomAccessFileOrArray(fileName, flag, Document.plainRandomAccess);
	//    7   15:aload_0         
	//    8   16:new             #315 <Class RandomAccessFileOrArray>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #190 <Field String fileName>
	//   12   24:iload_2         
	//   13   25:getstatic       #836 <Field boolean Document.plainRandomAccess>
	//   14   28:invokespecial   #839 <Method void RandomAccessFileOrArray(String, boolean, boolean)>
	//   15   31:putfield        #313 <Field RandomAccessFileOrArray rf>
		else
	//*  16   34:aload_0         
	//*  17   35:getfield        #195 <Field String ttcIndex>
	//*  18   38:invokevirtual   #178 <Method int String.length()>
	//*  19   41:ifle            245
	//*  20   44:aload_0         
	//*  21   45:getfield        #195 <Field String ttcIndex>
	//*  22   48:invokestatic    #842 <Method int Integer.parseInt(String)>
	//*  23   51:istore_3        
	//*  24   52:iload_3         
	//*  25   53:ifge            118
	//*  26   56:new             #165 <Class DocumentException>
	//*  27   59:dup             
	//*  28   60:ldc2            #844 <String "the.font.index.for.1.must.be.positive">
	//*  29   63:iconst_1        
	//*  30   64:anewarray       Object[]
	//*  31   67:dup             
	//*  32   68:iconst_0        
	//*  33   69:aload_0         
	//*  34   70:getfield        #190 <Field String fileName>
	//*  35   73:aastore         
	//*  36   74:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  37   77:invokespecial   #240 <Method void DocumentException(String)>
	//*  38   80:athrow          
	//*  39   81:astore_1        
	//*  40   82:aload_0         
	//*  41   83:getfield        #188 <Field boolean embedded>
	//*  42   86:ifne            101
	//*  43   89:aload_0         
	//*  44   90:getfield        #313 <Field RandomAccessFileOrArray rf>
	//*  45   93:invokevirtual   #772 <Method void RandomAccessFileOrArray.close()>
	//*  46   96:aload_0         
	//*  47   97:aconst_null     
	//*  48   98:putfield        #313 <Field RandomAccessFileOrArray rf>
	//*  49  101:aload_1         
	//*  50  102:athrow          
			rf = new RandomAccessFileOrArray(abyte0);
	//   51  103:aload_0         
	//   52  104:new             #315 <Class RandomAccessFileOrArray>
	//   53  107:dup             
	//   54  108:aload_1         
	//   55  109:invokespecial   #846 <Method void RandomAccessFileOrArray(byte[])>
	//   56  112:putfield        #313 <Field RandomAccessFileOrArray rf>
		if(ttcIndex.length() <= 0)
			break MISSING_BLOCK_LABEL_245;
		i = Integer.parseInt(ttcIndex);
		if(i >= 0)
			break MISSING_BLOCK_LABEL_118;
		throw new DocumentException(MessageLocalization.getComposedMessage("the.font.index.for.1.must.be.positive", new Object[] {
			fileName
		}));
		abyte0;
		if(!embedded)
		{
			rf.close();
			rf = null;
		}
		throw abyte0;
	//*  57  115:goto            34
		int j;
		if(!readStandardString(4).equals("ttcf"))
	//*  58  118:aload_0         
	//*  59  119:iconst_4        
	//*  60  120:invokevirtual   #608 <Method String readStandardString(int)>
	//*  61  123:ldc2            #848 <String "ttcf">
	//*  62  126:invokevirtual   #663 <Method boolean String.equals(Object)>
	//*  63  129:ifne            157
			throw new DocumentException(MessageLocalization.getComposedMessage("1.is.not.a.valid.ttc.file", new Object[] {
				fileName
			}));
	//   64  132:new             #165 <Class DocumentException>
	//   65  135:dup             
	//   66  136:ldc2            #850 <String "1.is.not.a.valid.ttc.file">
	//   67  139:iconst_1        
	//   68  140:anewarray       Object[]
	//   69  143:dup             
	//   70  144:iconst_0        
	//   71  145:aload_0         
	//   72  146:getfield        #190 <Field String fileName>
	//   73  149:aastore         
	//   74  150:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   75  153:invokespecial   #240 <Method void DocumentException(String)>
	//   76  156:athrow          
		rf.skipBytes(4);
	//   77  157:aload_0         
	//   78  158:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   79  161:iconst_4        
	//   80  162:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   81  165:pop             
		j = rf.readInt();
	//   82  166:aload_0         
	//   83  167:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   84  170:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//   85  173:istore          4
		if(i < j)
			break MISSING_BLOCK_LABEL_223;
	//   86  175:iload_3         
	//   87  176:iload           4
	//   88  178:icmplt          223
		throw new DocumentException(MessageLocalization.getComposedMessage("the.font.index.for.1.must.be.between.0.and.2.it.was.3", new Object[] {
			fileName, String.valueOf(j - 1), String.valueOf(i)
		}));
	//   89  181:new             #165 <Class DocumentException>
	//   90  184:dup             
	//   91  185:ldc2            #852 <String "the.font.index.for.1.must.be.between.0.and.2.it.was.3">
	//   92  188:iconst_3        
	//   93  189:anewarray       Object[]
	//   94  192:dup             
	//   95  193:iconst_0        
	//   96  194:aload_0         
	//   97  195:getfield        #190 <Field String fileName>
	//   98  198:aastore         
	//   99  199:dup             
	//  100  200:iconst_1        
	//  101  201:iload           4
	//  102  203:iconst_1        
	//  103  204:isub            
	//  104  205:invokestatic    #605 <Method String String.valueOf(int)>
	//  105  208:aastore         
	//  106  209:dup             
	//  107  210:iconst_2        
	//  108  211:iload_3         
	//  109  212:invokestatic    #605 <Method String String.valueOf(int)>
	//  110  215:aastore         
	//  111  216:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  112  219:invokespecial   #240 <Method void DocumentException(String)>
	//  113  222:athrow          
		rf.skipBytes(i * 4);
	//  114  223:aload_0         
	//  115  224:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  116  227:iload_3         
	//  117  228:iconst_4        
	//  118  229:imul            
	//  119  230:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//  120  233:pop             
		directoryOffset = rf.readInt();
	//  121  234:aload_0         
	//  122  235:aload_0         
	//  123  236:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  124  239:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//  125  242:putfield        #346 <Field int directoryOffset>
		rf.seek(directoryOffset);
	//  126  245:aload_0         
	//  127  246:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  128  249:aload_0         
	//  129  250:getfield        #346 <Field int directoryOffset>
	//  130  253:i2l             
	//  131  254:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		i = rf.readInt();
	//  132  257:aload_0         
	//  133  258:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  134  261:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//  135  264:istore_3        
		if(i == 0x10000 || i == 0x4f54544f)
			break MISSING_BLOCK_LABEL_304;
	//  136  265:iload_3         
	//  137  266:ldc2            #572 <Int 0x10000>
	//  138  269:icmpeq          304
	//  139  272:iload_3         
	//  140  273:ldc2            #853 <Int 0x4f54544f>
	//  141  276:icmpeq          304
		throw new DocumentException(MessageLocalization.getComposedMessage("1.is.not.a.valid.ttf.or.otf.file", new Object[] {
			fileName
		}));
	//  142  279:new             #165 <Class DocumentException>
	//  143  282:dup             
	//  144  283:ldc2            #855 <String "1.is.not.a.valid.ttf.or.otf.file">
	//  145  286:iconst_1        
	//  146  287:anewarray       Object[]
	//  147  290:dup             
	//  148  291:iconst_0        
	//  149  292:aload_0         
	//  150  293:getfield        #190 <Field String fileName>
	//  151  296:aastore         
	//  152  297:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  153  300:invokespecial   #240 <Method void DocumentException(String)>
	//  154  303:athrow          
		j = rf.readUnsignedShort();
	//  155  304:aload_0         
	//  156  305:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  157  308:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  158  311:istore          4
		rf.skipBytes(6);
	//  159  313:aload_0         
	//  160  314:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  161  317:bipush          6
	//  162  319:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//  163  322:pop             
		i = 0;
	//  164  323:iconst_0        
	//  165  324:istore_3        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//  166  325:iload_3         
	//  167  326:iload           4
	//  168  328:icmpge          393
		abyte0 = ((byte []) (readStandardString(4)));
	//  169  331:aload_0         
	//  170  332:iconst_4        
	//  171  333:invokevirtual   #608 <Method String readStandardString(int)>
	//  172  336:astore_1        
		rf.skipBytes(4);
	//  173  337:aload_0         
	//  174  338:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  175  341:iconst_4        
	//  176  342:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//  177  345:pop             
		int k = rf.readInt();
	//  178  346:aload_0         
	//  179  347:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  180  350:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//  181  353:istore          5
		int l = rf.readInt();
	//  182  355:aload_0         
	//  183  356:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  184  359:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//  185  362:istore          6
		tables.put(((Object) (abyte0)), ((Object) (new int[] {
			k, l
		})));
	//  186  364:aload_0         
	//  187  365:getfield        #303 <Field HashMap tables>
	//  188  368:aload_1         
	//  189  369:iconst_2        
	//  190  370:newarray        int[]
	//  191  372:dup             
	//  192  373:iconst_0        
	//  193  374:iload           5
	//  194  376:iastore         
	//  195  377:dup             
	//  196  378:iconst_1        
	//  197  379:iload           6
	//  198  381:iastore         
	//  199  382:invokevirtual   #395 <Method Object HashMap.put(Object, Object)>
	//  200  385:pop             
		i++;
	//  201  386:iload_3         
	//  202  387:iconst_1        
	//  203  388:iadd            
	//  204  389:istore_3        
		if(true) goto _L2; else goto _L1
	//  205  390:goto            325
_L1:
		checkCff();
	//  206  393:aload_0         
	//  207  394:invokevirtual   #857 <Method void checkCff()>
		fontName = getBaseFont();
	//  208  397:aload_0         
	//  209  398:aload_0         
	//  210  399:invokevirtual   #859 <Method String getBaseFont()>
	//  211  402:putfield        #654 <Field String fontName>
		fullName = getNames(4);
	//  212  405:aload_0         
	//  213  406:aload_0         
	//  214  407:iconst_4        
	//  215  408:invokevirtual   #861 <Method String[][] getNames(int)>
	//  216  411:putfield        #775 <Field String[][] fullName>
		abyte0 = ((byte []) (getNames(16)));
	//  217  414:aload_0         
	//  218  415:bipush          16
	//  219  417:invokevirtual   #861 <Method String[][] getNames(int)>
	//  220  420:astore_1        
		if(abyte0.length <= 0) goto _L4; else goto _L3
	//  221  421:aload_1         
	//  222  422:arraylength     
	//  223  423:ifle            505
_L3:
		familyName = ((String [][]) (abyte0));
	//  224  426:aload_0         
	//  225  427:aload_1         
	//  226  428:putfield        #627 <Field String[][] familyName>
_L5:
		String as[][] = getNames(17);
	//  227  431:aload_0         
	//  228  432:bipush          17
	//  229  434:invokevirtual   #861 <Method String[][] getNames(int)>
	//  230  437:astore          7
		if(abyte0.length <= 0)
			break MISSING_BLOCK_LABEL_517;
	//  231  439:aload_1         
	//  232  440:arraylength     
	//  233  441:ifle            517
		subFamily = as;
	//  234  444:aload_0         
	//  235  445:aload           7
	//  236  447:putfield        #826 <Field String[][] subFamily>
_L6:
		allNameEntries = getAllNames();
	//  237  450:aload_0         
	//  238  451:aload_0         
	//  239  452:invokevirtual   #863 <Method String[][] getAllNames()>
	//  240  455:putfield        #593 <Field String[][] allNameEntries>
		if(!justNames)
	//* 241  458:aload_0         
	//* 242  459:getfield        #140 <Field boolean justNames>
	//* 243  462:ifne            485
		{
			fillTables();
	//  244  465:aload_0         
	//  245  466:invokevirtual   #865 <Method void fillTables()>
			readGlyphWidths();
	//  246  469:aload_0         
	//  247  470:invokevirtual   #868 <Method void readGlyphWidths()>
			readCMaps();
	//  248  473:aload_0         
	//  249  474:invokevirtual   #871 <Method void readCMaps()>
			readKerning();
	//  250  477:aload_0         
	//  251  478:invokevirtual   #874 <Method void readKerning()>
			readBbox();
	//  252  481:aload_0         
	//  253  482:invokespecial   #876 <Method void readBbox()>
		}
		if(!embedded)
	//* 254  485:aload_0         
	//* 255  486:getfield        #188 <Field boolean embedded>
	//* 256  489:ifne            504
		{
			rf.close();
	//  257  492:aload_0         
	//  258  493:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  259  496:invokevirtual   #772 <Method void RandomAccessFileOrArray.close()>
			rf = null;
	//  260  499:aload_0         
	//  261  500:aconst_null     
	//  262  501:putfield        #313 <Field RandomAccessFileOrArray rf>
		}
		return;
	//  263  504:return          
_L4:
		familyName = getNames(1);
	//  264  505:aload_0         
	//  265  506:aload_0         
	//  266  507:iconst_1        
	//  267  508:invokevirtual   #861 <Method String[][] getNames(int)>
	//  268  511:putfield        #627 <Field String[][] familyName>
		  goto _L5
	//* 269  514:goto            431
		subFamily = getNames(2);
	//  270  517:aload_0         
	//  271  518:aload_0         
	//  272  519:iconst_2        
	//  273  520:invokevirtual   #861 <Method String[][] getNames(int)>
	//  274  523:putfield        #826 <Field String[][] subFamily>
		  goto _L6
	//* 275  526:goto            450
	}

	void readCMaps()
		throws DocumentException, IOException
	{
		int j;
		int l;
		int i1;
		int l1;
		int ai[];
		ai = (int[])tables.get("cmap");
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field HashMap tables>
	//    2    4:ldc2            #878 <String "cmap">
	//    3    7:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #272 <Class int[]>
	//    5   13:astore          13
		if(ai == null)
	//*   6   15:aload           13
	//*   7   17:ifnonnull       71
			throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
				"cmap", (new StringBuilder()).append(fileName).append(style).toString()
			}));
	//    8   20:new             #165 <Class DocumentException>
	//    9   23:dup             
	//   10   24:ldc2            #311 <String "table.1.does.not.exist.in.2">
	//   11   27:iconst_2        
	//   12   28:anewarray       Object[]
	//   13   31:dup             
	//   14   32:iconst_0        
	//   15   33:ldc2            #878 <String "cmap">
	//   16   36:aastore         
	//   17   37:dup             
	//   18   38:iconst_1        
	//   19   39:new             #223 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #224 <Method void StringBuilder()>
	//   22   46:aload_0         
	//   23   47:getfield        #190 <Field String fileName>
	//   24   50:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:aload_0         
	//   26   54:getfield        #146 <Field String style>
	//   27   57:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   29   63:aastore         
	//   30   64:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   67:invokespecial   #240 <Method void DocumentException(String)>
	//   32   70:athrow          
		rf.seek(ai[0]);
	//   33   71:aload_0         
	//   34   72:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   35   75:aload           13
	//   36   77:iconst_0        
	//   37   78:iaload          
	//   38   79:i2l             
	//   39   80:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		rf.skipBytes(2);
	//   40   83:aload_0         
	//   41   84:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   42   87:iconst_2        
	//   43   88:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   44   91:pop             
		int j2 = rf.readUnsignedShort();
	//   45   92:aload_0         
	//   46   93:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   47   96:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   48   99:istore          10
		fontSpecific = false;
	//   49  101:aload_0         
	//   50  102:iconst_0        
	//   51  103:putfield        #349 <Field boolean fontSpecific>
		l = 0;
	//   52  106:iconst_0        
	//   53  107:istore          4
		i1 = 0;
	//   54  109:iconst_0        
	//   55  110:istore          5
		l1 = 0;
	//   56  112:iconst_0        
	//   57  113:istore          8
		j = 0;
	//   58  115:iconst_0        
	//   59  116:istore_2        
		int k = 0;
	//   60  117:iconst_0        
	//   61  118:istore_3        
		while(k < j2) 
	//*  62  119:iload_3         
	//*  63  120:iload           10
	//*  64  122:icmpge          291
		{
			int k2 = rf.readUnsignedShort();
	//   65  125:aload_0         
	//   66  126:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   67  129:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   68  132:istore          11
			int l2 = rf.readUnsignedShort();
	//   69  134:aload_0         
	//   70  135:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   71  138:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   72  141:istore          12
			int i = rf.readInt();
	//   73  143:aload_0         
	//   74  144:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   75  147:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//   76  150:istore_1        
			int j1;
			int k1;
			int i2;
			if(k2 == 3 && l2 == 0)
	//*  77  151:iload           11
	//*  78  153:iconst_3        
	//*  79  154:icmpne          217
	//*  80  157:iload           12
	//*  81  159:ifne            217
			{
				fontSpecific = true;
	//   82  162:aload_0         
	//   83  163:iconst_1        
	//   84  164:putfield        #349 <Field boolean fontSpecific>
				j1 = i;
	//   85  167:iload_1         
	//   86  168:istore          6
				i2 = j;
	//   87  170:iload_2         
	//   88  171:istore          9
				k1 = i1;
	//   89  173:iload           5
	//   90  175:istore          7
			} else
	//*  91  177:iload           4
	//*  92  179:istore_2        
	//*  93  180:iload           11
	//*  94  182:iconst_1        
	//*  95  183:icmpne          196
	//*  96  186:iload           4
	//*  97  188:istore_2        
	//*  98  189:iload           12
	//*  99  191:ifne            196
	//* 100  194:iload_1         
	//* 101  195:istore_2        
	//* 102  196:iload_3         
	//* 103  197:iconst_1        
	//* 104  198:iadd            
	//* 105  199:istore_3        
	//* 106  200:iload_2         
	//* 107  201:istore          4
	//* 108  203:iload           6
	//* 109  205:istore          8
	//* 110  207:iload           7
	//* 111  209:istore          5
	//* 112  211:iload           9
	//* 113  213:istore_2        
	//* 114  214:goto            119
			if(k2 == 3 && l2 == 1)
	//* 115  217:iload           11
	//* 116  219:iconst_3        
	//* 117  220:icmpne          242
	//* 118  223:iload           12
	//* 119  225:iconst_1        
	//* 120  226:icmpne          242
			{
				k1 = i;
	//  121  229:iload_1         
	//  122  230:istore          7
				j1 = l1;
	//  123  232:iload           8
	//  124  234:istore          6
				i2 = j;
	//  125  236:iload_2         
	//  126  237:istore          9
			} else
	//* 127  239:goto            177
			{
				j1 = l1;
	//  128  242:iload           8
	//  129  244:istore          6
				k1 = i1;
	//  130  246:iload           5
	//  131  248:istore          7
				i2 = j;
	//  132  250:iload_2         
	//  133  251:istore          9
				if(k2 == 3)
	//* 134  253:iload           11
	//* 135  255:iconst_3        
	//* 136  256:icmpne          177
				{
					j1 = l1;
	//  137  259:iload           8
	//  138  261:istore          6
					k1 = i1;
	//  139  263:iload           5
	//  140  265:istore          7
					i2 = j;
	//  141  267:iload_2         
	//  142  268:istore          9
					if(l2 == 10)
	//* 143  270:iload           12
	//* 144  272:bipush          10
	//* 145  274:icmpne          177
					{
						i2 = i;
	//  146  277:iload_1         
	//  147  278:istore          9
						j1 = l1;
	//  148  280:iload           8
	//  149  282:istore          6
						k1 = i1;
	//  150  284:iload           5
	//  151  286:istore          7
					}
				}
			}
			j = l;
			if(k2 == 1)
			{
				j = l;
				if(l2 == 0)
					j = i;
			}
			k++;
			l = j;
			l1 = j1;
			i1 = k1;
			j = i2;
		}
	//* 152  288:goto            177
		if(l <= 0) goto _L2; else goto _L1
	//  153  291:iload           4
	//  154  293:ifle            352
_L1:
		rf.seek(ai[0] + l);
	//  155  296:aload_0         
	//  156  297:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  157  300:aload           13
	//  158  302:iconst_0        
	//  159  303:iaload          
	//  160  304:iload           4
	//  161  306:iadd            
	//  162  307:i2l             
	//  163  308:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		rf.readUnsignedShort();
	//  164  311:aload_0         
	//  165  312:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  166  315:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
		JVM INSTR lookupswitch 3: default 352
	//	               0: 497
	//	               4: 508
	//	               6: 519;
	//  167  318:lookupswitch    3: default 352
	//	               0: 497
	//	               4: 508
	//	               6: 519
		   goto _L2 _L3 _L4 _L5
_L2:
		if(i1 > 0)
	//* 168  352:iload           5
	//* 169  354:ifle            391
		{
			rf.seek(ai[0] + i1);
	//  170  357:aload_0         
	//  171  358:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  172  361:aload           13
	//  173  363:iconst_0        
	//  174  364:iaload          
	//  175  365:iload           5
	//  176  367:iadd            
	//  177  368:i2l             
	//  178  369:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
			if(rf.readUnsignedShort() == 4)
	//* 179  372:aload_0         
	//* 180  373:getfield        #313 <Field RandomAccessFileOrArray rf>
	//* 181  376:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//* 182  379:iconst_4        
	//* 183  380:icmpne          391
				cmap31 = readFormat4();
	//  184  383:aload_0         
	//  185  384:aload_0         
	//  186  385:invokevirtual   #882 <Method HashMap readFormat4()>
	//  187  388:putfield        #351 <Field HashMap cmap31>
		}
		if(l1 > 0)
	//* 188  391:iload           8
	//* 189  393:ifle            430
		{
			rf.seek(ai[0] + l1);
	//  190  396:aload_0         
	//  191  397:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  192  400:aload           13
	//  193  402:iconst_0        
	//  194  403:iaload          
	//  195  404:iload           8
	//  196  406:iadd            
	//  197  407:i2l             
	//  198  408:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
			if(rf.readUnsignedShort() == 4)
	//* 199  411:aload_0         
	//* 200  412:getfield        #313 <Field RandomAccessFileOrArray rf>
	//* 201  415:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//* 202  418:iconst_4        
	//* 203  419:icmpne          430
				cmap10 = readFormat4();
	//  204  422:aload_0         
	//  205  423:aload_0         
	//  206  424:invokevirtual   #882 <Method HashMap readFormat4()>
	//  207  427:putfield        #399 <Field HashMap cmap10>
		}
		if(j <= 0) goto _L7; else goto _L6
	//  208  430:iload_2         
	//  209  431:ifle            496
_L6:
		rf.seek(ai[0] + j);
	//  210  434:aload_0         
	//  211  435:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  212  438:aload           13
	//  213  440:iconst_0        
	//  214  441:iaload          
	//  215  442:iload_2         
	//  216  443:iadd            
	//  217  444:i2l             
	//  218  445:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		rf.readUnsignedShort();
	//  219  448:aload_0         
	//  220  449:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  221  452:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
		JVM INSTR lookupswitch 4: default 496
	//	               0: 530
	//	               4: 539
	//	               6: 548
	//	               12: 557;
	//  222  455:lookupswitch    4: default 496
	//	               0: 530
	//	               4: 539
	//	               6: 548
	//	               12: 557
		   goto _L7 _L8 _L9 _L10 _L11
_L7:
		return;
	//  223  496:return          
_L3:
		cmap10 = readFormat0();
	//  224  497:aload_0         
	//  225  498:aload_0         
	//  226  499:invokevirtual   #885 <Method HashMap readFormat0()>
	//  227  502:putfield        #399 <Field HashMap cmap10>
		  goto _L2
	//* 228  505:goto            352
_L4:
		cmap10 = readFormat4();
	//  229  508:aload_0         
	//  230  509:aload_0         
	//  231  510:invokevirtual   #882 <Method HashMap readFormat4()>
	//  232  513:putfield        #399 <Field HashMap cmap10>
		  goto _L2
	//* 233  516:goto            352
_L5:
		cmap10 = readFormat6();
	//  234  519:aload_0         
	//  235  520:aload_0         
	//  236  521:invokevirtual   #888 <Method HashMap readFormat6()>
	//  237  524:putfield        #399 <Field HashMap cmap10>
		  goto _L2
	//* 238  527:goto            352
_L8:
		cmapExt = readFormat0();
	//  239  530:aload_0         
	//  240  531:aload_0         
	//  241  532:invokevirtual   #885 <Method HashMap readFormat0()>
	//  242  535:putfield        #807 <Field HashMap cmapExt>
		return;
	//  243  538:return          
_L9:
		cmapExt = readFormat4();
	//  244  539:aload_0         
	//  245  540:aload_0         
	//  246  541:invokevirtual   #882 <Method HashMap readFormat4()>
	//  247  544:putfield        #807 <Field HashMap cmapExt>
		return;
	//  248  547:return          
_L10:
		cmapExt = readFormat6();
	//  249  548:aload_0         
	//  250  549:aload_0         
	//  251  550:invokevirtual   #888 <Method HashMap readFormat6()>
	//  252  553:putfield        #807 <Field HashMap cmapExt>
		return;
	//  253  556:return          
_L11:
		cmapExt = readFormat12();
	//  254  557:aload_0         
	//  255  558:aload_0         
	//  256  559:invokevirtual   #891 <Method HashMap readFormat12()>
	//  257  562:putfield        #807 <Field HashMap cmapExt>
		return;
	//  258  565:return          
	}

	protected byte[] readCffFont()
		throws IOException
	{
		RandomAccessFileOrArray randomaccessfileorarray;
		byte abyte0[];
		randomaccessfileorarray = new RandomAccessFileOrArray(rf);
	//    0    0:new             #315 <Class RandomAccessFileOrArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #313 <Field RandomAccessFileOrArray rf>
	//    4    8:invokespecial   #764 <Method void RandomAccessFileOrArray(RandomAccessFileOrArray)>
	//    5   11:astore_1        
		abyte0 = new byte[cffLength];
	//    6   12:aload_0         
	//    7   13:getfield        #415 <Field int cffLength>
	//    8   16:newarray        byte[]
	//    9   18:astore_2        
		randomaccessfileorarray.reOpen();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #767 <Method void RandomAccessFileOrArray.reOpen()>
		randomaccessfileorarray.seek(cffOffset);
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:getfield        #413 <Field int cffOffset>
	//   15   28:i2l             
	//   16   29:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		randomaccessfileorarray.readFully(abyte0);
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:invokevirtual   #521 <Method void RandomAccessFileOrArray.readFully(byte[])>
		try
		{
			randomaccessfileorarray.close();
	//   20   37:aload_1         
	//   21   38:invokevirtual   #772 <Method void RandomAccessFileOrArray.close()>
		}
	//*  22   41:aload_2         
	//*  23   42:areturn         
	//*  24   43:astore_2        
	//*  25   44:aload_1         
	//*  26   45:invokevirtual   #772 <Method void RandomAccessFileOrArray.close()>
	//*  27   48:aload_2         
	//*  28   49:athrow          
		catch(Exception exception)
	//*  29   50:astore_1        
		{
			return abyte0;
	//   30   51:aload_2         
	//   31   52:areturn         
		}
		return abyte0;
		abyte0;
		try
		{
			randomaccessfileorarray.close();
		}
		catch(Exception exception1) { }
	//   32   53:astore_1        
		throw abyte0;
	//*  33   54:goto            48
	}

	HashMap readFormat0()
		throws IOException
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #306 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #831 <Method void HashMap()>
	//    3    7:astore_2        
		rf.skipBytes(4);
	//    4    8:aload_0         
	//    5    9:getfield        #313 <Field RandomAccessFileOrArray rf>
	//    6   12:iconst_4        
	//    7   13:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//    8   16:pop             
		for(int i = 0; i < 256; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:sipush          256
	//*  13   23:icmpge          67
		{
			int ai[] = new int[2];
	//   14   26:iconst_2        
	//   15   27:newarray        int[]
	//   16   29:astore_3        
			ai[0] = rf.readUnsignedByte();
	//   17   30:aload_3         
	//   18   31:iconst_0        
	//   19   32:aload_0         
	//   20   33:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   21   36:invokevirtual   #894 <Method int RandomAccessFileOrArray.readUnsignedByte()>
	//   22   39:iastore         
			ai[1] = getGlyphWidth(ai[0]);
	//   23   40:aload_3         
	//   24   41:iconst_1        
	//   25   42:aload_0         
	//   26   43:aload_3         
	//   27   44:iconst_0        
	//   28   45:iaload          
	//   29   46:invokevirtual   #896 <Method int getGlyphWidth(int)>
	//   30   49:iastore         
			hashmap.put(((Object) (Integer.valueOf(i))), ((Object) (ai)));
	//   31   50:aload_2         
	//   32   51:iload_1         
	//   33   52:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//   34   55:aload_3         
	//   35   56:invokevirtual   #395 <Method Object HashMap.put(Object, Object)>
	//   36   59:pop             
		}

	//   37   60:iload_1         
	//   38   61:iconst_1        
	//   39   62:iadd            
	//   40   63:istore_1        
	//*  41   64:goto            19
		return hashmap;
	//   42   67:aload_2         
	//   43   68:areturn         
	}

	HashMap readFormat12()
		throws IOException
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #306 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #831 <Method void HashMap()>
	//    3    7:astore          6
		rf.skipBytes(2);
	//    4    9:aload_0         
	//    5   10:getfield        #313 <Field RandomAccessFileOrArray rf>
	//    6   13:iconst_2        
	//    7   14:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//    8   17:pop             
		rf.readInt();
	//    9   18:aload_0         
	//   10   19:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   11   22:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//   12   25:pop             
		rf.skipBytes(4);
	//   13   26:aload_0         
	//   14   27:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   15   30:iconst_4        
	//   16   31:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   17   34:pop             
		int l = rf.readInt();
	//   18   35:aload_0         
	//   19   36:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   20   39:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//   21   42:istore          4
		for(int i = 0; i < l; i++)
	//*  22   44:iconst_0        
	//*  23   45:istore_1        
	//*  24   46:iload_1         
	//*  25   47:iload           4
	//*  26   49:icmpge          135
		{
			int j = rf.readInt();
	//   27   52:aload_0         
	//   28   53:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   29   56:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//   30   59:istore_2        
			int i1 = rf.readInt();
	//   31   60:aload_0         
	//   32   61:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   33   64:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//   34   67:istore          5
			int k = rf.readInt();
	//   35   69:aload_0         
	//   36   70:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   37   73:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//   38   76:istore_3        
			for(; j <= i1; j++)
	//*  39   77:iload_2         
	//*  40   78:iload           5
	//*  41   80:icmpgt          128
			{
				int ai[] = new int[2];
	//   42   83:iconst_2        
	//   43   84:newarray        int[]
	//   44   86:astore          7
				ai[0] = k;
	//   45   88:aload           7
	//   46   90:iconst_0        
	//   47   91:iload_3         
	//   48   92:iastore         
				ai[1] = getGlyphWidth(ai[0]);
	//   49   93:aload           7
	//   50   95:iconst_1        
	//   51   96:aload_0         
	//   52   97:aload           7
	//   53   99:iconst_0        
	//   54  100:iaload          
	//   55  101:invokevirtual   #896 <Method int getGlyphWidth(int)>
	//   56  104:iastore         
				hashmap.put(((Object) (Integer.valueOf(j))), ((Object) (ai)));
	//   57  105:aload           6
	//   58  107:iload_2         
	//   59  108:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//   60  111:aload           7
	//   61  113:invokevirtual   #395 <Method Object HashMap.put(Object, Object)>
	//   62  116:pop             
				k++;
	//   63  117:iload_3         
	//   64  118:iconst_1        
	//   65  119:iadd            
	//   66  120:istore_3        
			}

	//   67  121:iload_2         
	//   68  122:iconst_1        
	//   69  123:iadd            
	//   70  124:istore_2        
		}

	//   71  125:goto            77
	//   72  128:iload_1         
	//   73  129:iconst_1        
	//   74  130:iadd            
	//   75  131:istore_1        
	//*  76  132:goto            46
		return hashmap;
	//   77  135:aload           6
	//   78  137:areturn         
	}

	HashMap readFormat4()
		throws IOException
	{
		int i2;
		int j2;
		HashMap hashmap;
		int ai[];
		int ai1[];
		int ai2[];
		int ai3[];
		int ai4[];
		hashmap = new HashMap();
	//    0    0:new             #306 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #831 <Method void HashMap()>
	//    3    7:astore          5
		int k1 = rf.readUnsignedShort();
	//    4    9:aload_0         
	//    5   10:getfield        #313 <Field RandomAccessFileOrArray rf>
	//    6   13:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//    7   16:istore_2        
		rf.skipBytes(2);
	//    8   17:aload_0         
	//    9   18:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   10   21:iconst_2        
	//   11   22:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   12   25:pop             
		j2 = rf.readUnsignedShort() / 2;
	//   13   26:aload_0         
	//   14   27:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   15   30:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   16   33:iconst_2        
	//   17   34:idiv            
	//   18   35:istore          4
		rf.skipBytes(6);
	//   19   37:aload_0         
	//   20   38:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   21   41:bipush          6
	//   22   43:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   23   46:pop             
		ai = new int[j2];
	//   24   47:iload           4
	//   25   49:newarray        int[]
	//   26   51:astore          6
		for(int i = 0; i < j2; i++)
	//*  27   53:iconst_0        
	//*  28   54:istore_1        
	//*  29   55:iload_1         
	//*  30   56:iload           4
	//*  31   58:icmpge          79
			ai[i] = rf.readUnsignedShort();
	//   32   61:aload           6
	//   33   63:iload_1         
	//   34   64:aload_0         
	//   35   65:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   36   68:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   37   71:iastore         

	//   38   72:iload_1         
	//   39   73:iconst_1        
	//   40   74:iadd            
	//   41   75:istore_1        
	//*  42   76:goto            55
		rf.skipBytes(2);
	//   43   79:aload_0         
	//   44   80:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   45   83:iconst_2        
	//   46   84:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   47   87:pop             
		ai1 = new int[j2];
	//   48   88:iload           4
	//   49   90:newarray        int[]
	//   50   92:astore          7
		for(int j = 0; j < j2; j++)
	//*  51   94:iconst_0        
	//*  52   95:istore_1        
	//*  53   96:iload_1         
	//*  54   97:iload           4
	//*  55   99:icmpge          120
			ai1[j] = rf.readUnsignedShort();
	//   56  102:aload           7
	//   57  104:iload_1         
	//   58  105:aload_0         
	//   59  106:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   60  109:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   61  112:iastore         

	//   62  113:iload_1         
	//   63  114:iconst_1        
	//   64  115:iadd            
	//   65  116:istore_1        
	//*  66  117:goto            96
		ai2 = new int[j2];
	//   67  120:iload           4
	//   68  122:newarray        int[]
	//   69  124:astore          8
		for(int k = 0; k < j2; k++)
	//*  70  126:iconst_0        
	//*  71  127:istore_1        
	//*  72  128:iload_1         
	//*  73  129:iload           4
	//*  74  131:icmpge          152
			ai2[k] = rf.readUnsignedShort();
	//   75  134:aload           8
	//   76  136:iload_1         
	//   77  137:aload_0         
	//   78  138:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   79  141:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   80  144:iastore         

	//   81  145:iload_1         
	//   82  146:iconst_1        
	//   83  147:iadd            
	//   84  148:istore_1        
	//*  85  149:goto            128
		ai3 = new int[j2];
	//   86  152:iload           4
	//   87  154:newarray        int[]
	//   88  156:astore          9
		for(int l = 0; l < j2; l++)
	//*  89  158:iconst_0        
	//*  90  159:istore_1        
	//*  91  160:iload_1         
	//*  92  161:iload           4
	//*  93  163:icmpge          184
			ai3[l] = rf.readUnsignedShort();
	//   94  166:aload           9
	//   95  168:iload_1         
	//   96  169:aload_0         
	//   97  170:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   98  173:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   99  176:iastore         

	//  100  177:iload_1         
	//  101  178:iconst_1        
	//  102  179:iadd            
	//  103  180:istore_1        
	//* 104  181:goto            160
		ai4 = new int[k1 / 2 - 8 - j2 * 4];
	//  105  184:iload_2         
	//  106  185:iconst_2        
	//  107  186:idiv            
	//  108  187:bipush          8
	//  109  189:isub            
	//  110  190:iload           4
	//  111  192:iconst_4        
	//  112  193:imul            
	//  113  194:isub            
	//  114  195:newarray        int[]
	//  115  197:astore          10
		for(int i1 = 0; i1 < ai4.length; i1++)
	//* 116  199:iconst_0        
	//* 117  200:istore_1        
	//* 118  201:iload_1         
	//* 119  202:aload           10
	//* 120  204:arraylength     
	//* 121  205:icmpge          226
			ai4[i1] = rf.readUnsignedShort();
	//  122  208:aload           10
	//  123  210:iload_1         
	//  124  211:aload_0         
	//  125  212:getfield        #313 <Field RandomAccessFileOrArray rf>
	//  126  215:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  127  218:iastore         

	//  128  219:iload_1         
	//  129  220:iconst_1        
	//  130  221:iadd            
	//  131  222:istore_1        
	//* 132  223:goto            201
		i2 = 0;
	//  133  226:iconst_0        
	//  134  227:istore_3        
_L8:
		int j1;
		if(i2 >= j2)
			break; /* Loop/switch isn't completed */
	//  135  228:iload_3         
	//  136  229:iload           4
	//  137  231:icmpge          397
		j1 = ai1[i2];
	//  138  234:aload           7
	//  139  236:iload_3         
	//  140  237:iaload          
	//  141  238:istore_1        
_L3:
		if(j1 > ai[i2] || j1 == 65535)
			break MISSING_BLOCK_LABEL_390;
	//  142  239:iload_1         
	//  143  240:aload           6
	//  144  242:iload_3         
	//  145  243:iaload          
	//  146  244:icmpgt          390
	//  147  247:iload_1         
	//  148  248:ldc2            #282 <Int 65535>
	//  149  251:icmpeq          390
		if(ai3[i2] != 0) goto _L2; else goto _L1
	//  150  254:aload           9
	//  151  256:iload_3         
	//  152  257:iaload          
	//  153  258:ifne            337
_L1:
		int l1 = ai2[i2] + j1 & 0xffff;
	//  154  261:aload           8
	//  155  263:iload_3         
	//  156  264:iaload          
	//  157  265:iload_1         
	//  158  266:iadd            
	//  159  267:ldc2            #282 <Int 65535>
	//  160  270:iand            
	//  161  271:istore_2        
_L6:
		int ai5[] = new int[2];
	//  162  272:iconst_2        
	//  163  273:newarray        int[]
	//  164  275:astore          11
		ai5[0] = l1;
	//  165  277:aload           11
	//  166  279:iconst_0        
	//  167  280:iload_2         
	//  168  281:iastore         
		ai5[1] = getGlyphWidth(ai5[0]);
	//  169  282:aload           11
	//  170  284:iconst_1        
	//  171  285:aload_0         
	//  172  286:aload           11
	//  173  288:iconst_0        
	//  174  289:iaload          
	//  175  290:invokevirtual   #896 <Method int getGlyphWidth(int)>
	//  176  293:iastore         
		if(fontSpecific)
	//* 177  294:aload_0         
	//* 178  295:getfield        #349 <Field boolean fontSpecific>
	//* 179  298:ifeq            385
		{
			if((0xff00 & j1) == 61440)
	//* 180  301:ldc2            #898 <Int 65280>
	//* 181  304:iload_1         
	//* 182  305:iand            
	//* 183  306:ldc2            #899 <Int 61440>
	//* 184  309:icmpne          380
				l1 = j1 & 0xff;
	//  185  312:iload_1         
	//  186  313:sipush          255
	//  187  316:iand            
	//  188  317:istore_2        
			else
	//* 189  318:aload           5
	//* 190  320:iload_2         
	//* 191  321:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//* 192  324:aload           11
	//* 193  326:invokevirtual   #395 <Method Object HashMap.put(Object, Object)>
	//* 194  329:pop             
	//* 195  330:iload_1         
	//* 196  331:iconst_1        
	//* 197  332:iadd            
	//* 198  333:istore_1        
	//* 199  334:goto            239
	//* 200  337:aload           9
	//* 201  339:iload_3         
	//* 202  340:iaload          
	//* 203  341:iconst_2        
	//* 204  342:idiv            
	//* 205  343:iload_3         
	//* 206  344:iadd            
	//* 207  345:iload           4
	//* 208  347:isub            
	//* 209  348:iload_1         
	//* 210  349:iadd            
	//* 211  350:aload           7
	//* 212  352:iload_3         
	//* 213  353:iaload          
	//* 214  354:isub            
	//* 215  355:istore_2        
	//* 216  356:iload_2         
	//* 217  357:aload           10
	//* 218  359:arraylength     
	//* 219  360:icmpge          330
	//* 220  363:aload           10
	//* 221  365:iload_2         
	//* 222  366:iaload          
	//* 223  367:aload           8
	//* 224  369:iload_3         
	//* 225  370:iaload          
	//* 226  371:iadd            
	//* 227  372:ldc2            #282 <Int 65535>
	//* 228  375:iand            
	//* 229  376:istore_2        
	//* 230  377:goto            272
				l1 = j1;
	//  231  380:iload_1         
	//  232  381:istore_2        
		} else
	//* 233  382:goto            318
		{
			l1 = j1;
	//  234  385:iload_1         
	//  235  386:istore_2        
		}
		hashmap.put(((Object) (Integer.valueOf(l1))), ((Object) (ai5)));
_L5:
		j1++;
		  goto _L3
_L2:
		l1 = (((ai3[i2] / 2 + i2) - j2) + j1) - ai1[i2];
		if(l1 >= ai4.length) goto _L5; else goto _L4
_L4:
		l1 = ai4[l1] + ai2[i2] & 0xffff;
		  goto _L6
	//* 236  387:goto            318
		i2++;
	//  237  390:iload_3         
	//  238  391:iconst_1        
	//  239  392:iadd            
	//  240  393:istore_3        
		if(true) goto _L8; else goto _L7
	//  241  394:goto            228
_L7:
		return hashmap;
	//  242  397:aload           5
	//  243  399:areturn         
	}

	HashMap readFormat6()
		throws IOException
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #306 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #831 <Method void HashMap()>
	//    3    7:astore          4
		rf.skipBytes(4);
	//    4    9:aload_0         
	//    5   10:getfield        #313 <Field RandomAccessFileOrArray rf>
	//    6   13:iconst_4        
	//    7   14:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//    8   17:pop             
		int j = rf.readUnsignedShort();
	//    9   18:aload_0         
	//   10   19:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   11   22:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   12   25:istore_2        
		int k = rf.readUnsignedShort();
	//   13   26:aload_0         
	//   14   27:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   15   30:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   16   33:istore_3        
		for(int i = 0; i < k; i++)
	//*  17   34:iconst_0        
	//*  18   35:istore_1        
	//*  19   36:iload_1         
	//*  20   37:iload_3         
	//*  21   38:icmpge          90
		{
			int ai[] = new int[2];
	//   22   41:iconst_2        
	//   23   42:newarray        int[]
	//   24   44:astore          5
			ai[0] = rf.readUnsignedShort();
	//   25   46:aload           5
	//   26   48:iconst_0        
	//   27   49:aload_0         
	//   28   50:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   29   53:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   30   56:iastore         
			ai[1] = getGlyphWidth(ai[0]);
	//   31   57:aload           5
	//   32   59:iconst_1        
	//   33   60:aload_0         
	//   34   61:aload           5
	//   35   63:iconst_0        
	//   36   64:iaload          
	//   37   65:invokevirtual   #896 <Method int getGlyphWidth(int)>
	//   38   68:iastore         
			hashmap.put(((Object) (Integer.valueOf(i + j))), ((Object) (ai)));
	//   39   69:aload           4
	//   40   71:iload_1         
	//   41   72:iload_2         
	//   42   73:iadd            
	//   43   74:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//   44   77:aload           5
	//   45   79:invokevirtual   #395 <Method Object HashMap.put(Object, Object)>
	//   46   82:pop             
		}

	//   47   83:iload_1         
	//   48   84:iconst_1        
	//   49   85:iadd            
	//   50   86:istore_1        
	//*  51   87:goto            36
		return hashmap;
	//   52   90:aload           4
	//   53   92:areturn         
	}

	protected void readGlyphWidths()
		throws DocumentException, IOException
	{
		int ai[] = (int[])tables.get("hmtx");
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field HashMap tables>
	//    2    4:ldc2            #901 <String "hmtx">
	//    3    7:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #272 <Class int[]>
	//    5   13:astore_3        
		if(ai == null)
	//*   6   14:aload_3         
	//*   7   15:ifnonnull       69
			throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
				"hmtx", (new StringBuilder()).append(fileName).append(style).toString()
			}));
	//    8   18:new             #165 <Class DocumentException>
	//    9   21:dup             
	//   10   22:ldc2            #311 <String "table.1.does.not.exist.in.2">
	//   11   25:iconst_2        
	//   12   26:anewarray       Object[]
	//   13   29:dup             
	//   14   30:iconst_0        
	//   15   31:ldc2            #901 <String "hmtx">
	//   16   34:aastore         
	//   17   35:dup             
	//   18   36:iconst_1        
	//   19   37:new             #223 <Class StringBuilder>
	//   20   40:dup             
	//   21   41:invokespecial   #224 <Method void StringBuilder()>
	//   22   44:aload_0         
	//   23   45:getfield        #190 <Field String fileName>
	//   24   48:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:aload_0         
	//   26   52:getfield        #146 <Field String style>
	//   27   55:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   29   61:aastore         
	//   30   62:invokestatic    #237 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   65:invokespecial   #240 <Method void DocumentException(String)>
	//   32   68:athrow          
		rf.seek(ai[0]);
	//   33   69:aload_0         
	//   34   70:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   35   73:aload_3         
	//   36   74:iconst_0        
	//   37   75:iaload          
	//   38   76:i2l             
	//   39   77:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
		glyphWidthsByIndex = new int[hhea.numberOfHMetrics];
	//   40   80:aload_0         
	//   41   81:aload_0         
	//   42   82:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//   43   85:getfield        #469 <Field int TrueTypeFont$HorizontalHeader.numberOfHMetrics>
	//   44   88:newarray        int[]
	//   45   90:putfield        #798 <Field int[] glyphWidthsByIndex>
		for(int i = 0; i < hhea.numberOfHMetrics; i++)
	//*  46   93:iconst_0        
	//*  47   94:istore_1        
	//*  48   95:iload_1         
	//*  49   96:aload_0         
	//*  50   97:getfield        #152 <Field TrueTypeFont$HorizontalHeader hhea>
	//*  51  100:getfield        #469 <Field int TrueTypeFont$HorizontalHeader.numberOfHMetrics>
	//*  52  103:icmpge          158
		{
			glyphWidthsByIndex[i] = (rf.readUnsignedShort() * 1000) / head.unitsPerEm;
	//   53  106:aload_0         
	//   54  107:getfield        #798 <Field int[] glyphWidthsByIndex>
	//   55  110:iload_1         
	//   56  111:aload_0         
	//   57  112:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   58  115:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   59  118:sipush          1000
	//   60  121:imul            
	//   61  122:aload_0         
	//   62  123:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   63  126:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   64  129:idiv            
	//   65  130:iastore         
			int j = (rf.readShort() * 1000) / head.unitsPerEm;
	//   66  131:aload_0         
	//   67  132:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   68  135:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//   69  138:sipush          1000
	//   70  141:imul            
	//   71  142:aload_0         
	//   72  143:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   73  146:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   74  149:idiv            
	//   75  150:istore_2        
		}

	//   76  151:iload_1         
	//   77  152:iconst_1        
	//   78  153:iadd            
	//   79  154:istore_1        
	//*  80  155:goto            95
	//   81  158:return          
	}

	void readKerning()
		throws IOException
	{
		int ai[] = (int[])tables.get("kern");
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field HashMap tables>
	//    2    4:ldc2            #903 <String "kern">
	//    3    7:invokevirtual   #309 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #272 <Class int[]>
	//    5   13:astore          9
		if(ai != null)
	//*   6   15:aload           9
	//*   7   17:ifnonnull       21
	//*   8   20:return          
		{
			rf.seek(ai[0] + 2);
	//    9   21:aload_0         
	//   10   22:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   11   25:aload           9
	//   12   27:iconst_0        
	//   13   28:iaload          
	//   14   29:iconst_2        
	//   15   30:iadd            
	//   16   31:i2l             
	//   17   32:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
			int i1 = rf.readUnsignedShort();
	//   18   35:aload_0         
	//   19   36:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   20   39:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   21   42:istore          5
			int j = ai[0] + 4;
	//   22   44:aload           9
	//   23   46:iconst_0        
	//   24   47:iaload          
	//   25   48:iconst_4        
	//   26   49:iadd            
	//   27   50:istore_2        
			int k = 0;
	//   28   51:iconst_0        
	//   29   52:istore_3        
			int i = 0;
	//   30   53:iconst_0        
	//   31   54:istore_1        
			while(i < i1) 
	//*  32   55:iload_1         
	//*  33   56:iload           5
	//*  34   58:icmpge          20
			{
				int l = j + k;
	//   35   61:iload_2         
	//   36   62:iload_3         
	//   37   63:iadd            
	//   38   64:istore          4
				rf.seek(l);
	//   39   66:aload_0         
	//   40   67:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   41   70:iload           4
	//   42   72:i2l             
	//   43   73:invokevirtual   #319 <Method void RandomAccessFileOrArray.seek(long)>
				rf.skipBytes(2);
	//   44   76:aload_0         
	//   45   77:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   46   80:iconst_2        
	//   47   81:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   48   84:pop             
				k = rf.readUnsignedShort();
	//   49   85:aload_0         
	//   50   86:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   51   89:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   52   92:istore_3        
				if((0xfff7 & rf.readUnsignedShort()) == 1)
	//*  53   93:ldc2            #904 <Int 65527>
	//*  54   96:aload_0         
	//*  55   97:getfield        #313 <Field RandomAccessFileOrArray rf>
	//*  56  100:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//*  57  103:iand            
	//*  58  104:iconst_1        
	//*  59  105:icmpne          184
				{
					int j1 = rf.readUnsignedShort();
	//   60  108:aload_0         
	//   61  109:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   62  112:invokevirtual   #322 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   63  115:istore          6
					rf.skipBytes(6);
	//   64  117:aload_0         
	//   65  118:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   66  121:bipush          6
	//   67  123:invokevirtual   #423 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   68  126:pop             
					for(j = 0; j < j1; j++)
	//*  69  127:iconst_0        
	//*  70  128:istore_2        
	//*  71  129:iload_2         
	//*  72  130:iload           6
	//*  73  132:icmpge          184
					{
						int k1 = rf.readInt();
	//   74  135:aload_0         
	//   75  136:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   76  139:invokevirtual   #327 <Method int RandomAccessFileOrArray.readInt()>
	//   77  142:istore          7
						int l1 = (rf.readShort() * 1000) / head.unitsPerEm;
	//   78  144:aload_0         
	//   79  145:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   80  148:invokevirtual   #335 <Method short RandomAccessFileOrArray.readShort()>
	//   81  151:sipush          1000
	//   82  154:imul            
	//   83  155:aload_0         
	//   84  156:getfield        #149 <Field TrueTypeFont$FontHeader head>
	//   85  159:getfield        #338 <Field int TrueTypeFont$FontHeader.unitsPerEm>
	//   86  162:idiv            
	//   87  163:istore          8
						kerning.put(k1, l1);
	//   88  165:aload_0         
	//   89  166:getfield        #160 <Field IntHashtable kerning>
	//   90  169:iload           7
	//   91  171:iload           8
	//   92  173:invokevirtual   #906 <Method int IntHashtable.put(int, int)>
	//   93  176:pop             
					}

	//   94  177:iload_2         
	//   95  178:iconst_1        
	//   96  179:iadd            
	//   97  180:istore_2        
				}
	//*  98  181:goto            129
				i++;
	//   99  184:iload_1         
	//  100  185:iconst_1        
	//  101  186:iadd            
	//  102  187:istore_1        
				j = l;
	//  103  188:iload           4
	//  104  190:istore_2        
			}
		}
	//* 105  191:goto            55
	}

	protected String readStandardString(int i)
		throws IOException
	{
		return rf.readString(i, "Cp1252");
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field RandomAccessFileOrArray rf>
	//    2    4:iload_1         
	//    3    5:ldc2            #665 <String "Cp1252">
	//    4    8:invokevirtual   #910 <Method String RandomAccessFileOrArray.readString(int, String)>
	//    5   11:areturn         
	}

	protected String readUnicodeString(int i)
		throws IOException
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #912 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #913 <Method void StringBuffer()>
	//    3    7:astore_3        
		int j = i / 2;
	//    4    8:iload_1         
	//    5    9:iconst_2        
	//    6   10:idiv            
	//    7   11:istore_2        
		for(i = 0; i < j; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:iload_2         
	//*  12   16:icmpge          38
			stringbuffer.append(rf.readChar());
	//   13   19:aload_3         
	//   14   20:aload_0         
	//   15   21:getfield        #313 <Field RandomAccessFileOrArray rf>
	//   16   24:invokevirtual   #917 <Method char RandomAccessFileOrArray.readChar()>
	//   17   27:invokevirtual   #920 <Method StringBuffer StringBuffer.append(char)>
	//   18   30:pop             

	//   19   31:iload_1         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_1        
	//*  23   35:goto            14
		return stringbuffer.toString();
	//   24   38:aload_3         
	//   25   39:invokevirtual   #921 <Method String StringBuffer.toString()>
	//   26   42:areturn         
	}

	public boolean setKerning(int i, int j, int k)
	{
		int ai[] = getMetricsTT(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #803 <Method int[] getMetricsTT(int)>
	//    3    5:astore          4
		if(ai != null)
	//*   4    7:aload           4
	//*   5    9:ifnonnull       14
	//*   6   12:iconst_0        
	//*   7   13:ireturn         
		{
			i = ai[0];
	//    8   14:aload           4
	//    9   16:iconst_0        
	//   10   17:iaload          
	//   11   18:istore_1        
			ai = getMetricsTT(j);
	//   12   19:aload_0         
	//   13   20:iload_2         
	//   14   21:invokevirtual   #803 <Method int[] getMetricsTT(int)>
	//   15   24:astore          4
			if(ai != null)
	//*  16   26:aload           4
	//*  17   28:ifnull          12
			{
				j = ai[0];
	//   18   31:aload           4
	//   19   33:iconst_0        
	//   20   34:iaload          
	//   21   35:istore_2        
				kerning.put((i << 16) + j, k);
	//   22   36:aload_0         
	//   23   37:getfield        #160 <Field IntHashtable kerning>
	//   24   40:iload_1         
	//   25   41:bipush          16
	//   26   43:ishl            
	//   27   44:iload_2         
	//   28   45:iadd            
	//   29   46:iload_3         
	//   30   47:invokevirtual   #906 <Method int IntHashtable.put(int, int)>
	//   31   50:pop             
				return true;
	//   32   51:iconst_1        
	//   33   52:ireturn         
			}
		}
		return false;
	}

	public void setPostscriptFontName(String s)
	{
		fontName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #654 <Field String fontName>
	//    3    5:return          
	}

	void writeFont(PdfWriter pdfwriter, PdfIndirectReference pdfindirectreference, Object aobj[])
		throws DocumentException, IOException
	{
		int i = ((Integer)aobj[0]).intValue();
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:checkcast       #378 <Class Integer>
	//    4    6:invokevirtual   #391 <Method int Integer.intValue()>
	//    5    9:istore          4
		int j = ((Integer)aobj[1]).intValue();
	//    6   11:aload_3         
	//    7   12:iconst_1        
	//    8   13:aaload          
	//    9   14:checkcast       #378 <Class Integer>
	//   10   17:invokevirtual   #391 <Method int Integer.intValue()>
	//   11   20:istore          5
		byte abyte0[] = (byte[])(byte[])aobj[2];
	//   12   22:aload_3         
	//   13   23:iconst_2        
	//   14   24:aaload          
	//   15   25:checkcast       #927 <Class byte[]>
	//   16   28:checkcast       #927 <Class byte[]>
	//   17   31:astore          12
		boolean flag1;
		if(((Boolean)aobj[3]).booleanValue() && subset)
	//*  18   33:aload_3         
	//*  19   34:iconst_3        
	//*  20   35:aaload          
	//*  21   36:checkcast       #929 <Class Boolean>
	//*  22   39:invokevirtual   #932 <Method boolean Boolean.booleanValue()>
	//*  23   42:ifeq            104
	//*  24   45:aload_0         
	//*  25   46:getfield        #935 <Field boolean subset>
	//*  26   49:ifeq            104
			flag1 = true;
	//   27   52:iconst_1        
	//   28   53:istore          9
		else
	//*  29   55:iload           9
	//*  30   57:ifne            110
	//*  31   60:iconst_0        
	//*  32   61:istore          7
	//*  33   63:aload           12
	//*  34   65:arraylength     
	//*  35   66:iconst_1        
	//*  36   67:isub            
	//*  37   68:istore          8
	//*  38   70:iconst_0        
	//*  39   71:istore          6
	//*  40   73:iload           7
	//*  41   75:istore          4
	//*  42   77:iload           8
	//*  43   79:istore          5
	//*  44   81:iload           6
	//*  45   83:aload           12
	//*  46   85:arraylength     
	//*  47   86:icmpge          110
	//*  48   89:aload           12
	//*  49   91:iload           6
	//*  50   93:iconst_1        
	//*  51   94:bastore         
	//*  52   95:iload           6
	//*  53   97:iconst_1        
	//*  54   98:iadd            
	//*  55   99:istore          6
	//*  56  101:goto            73
			flag1 = false;
	//   57  104:iconst_0        
	//   58  105:istore          9
		if(!flag1)
		{
			boolean flag = false;
			int j1 = abyte0.length - 1;
			int k = 0;
			do
			{
				i = ((int) (flag));
				j = j1;
				if(k >= abyte0.length)
					break;
				abyte0[k] = 1;
				k++;
			} while(true);
		}
	//*  59  107:goto            55
		aobj = null;
	//   60  110:aconst_null     
	//   61  111:astore_3        
		Object obj1 = "";
	//   62  112:ldc1            #144 <String "">
	//   63  114:astore          11
		Object obj = obj1;
	//   64  116:aload           11
	//   65  118:astore          10
		if(embedded)
	//*  66  120:aload_0         
	//*  67  121:getfield        #188 <Field boolean embedded>
	//*  68  124:ifeq            164
			if(cff)
	//*  69  127:aload_0         
	//*  70  128:getfield        #142 <Field boolean cff>
	//*  71  131:ifeq            209
			{
				aobj = ((Object []) (pdfwriter.addToBody(((PdfObject) (new BaseFont.StreamFont(readCffFont(), "Type1C", compressionLevel)))).getIndirectReference()));
	//   72  134:aload_1         
	//   73  135:new             #779 <Class BaseFont$StreamFont>
	//   74  138:dup             
	//   75  139:aload_0         
	//   76  140:invokevirtual   #782 <Method byte[] readCffFont()>
	//   77  143:ldc2            #784 <String "Type1C">
	//   78  146:aload_0         
	//   79  147:getfield        #787 <Field int compressionLevel>
	//   80  150:invokespecial   #790 <Method void BaseFont$StreamFont(byte[], String, int)>
	//   81  153:invokevirtual   #941 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   82  156:invokevirtual   #947 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   83  159:astore_3        
				obj = obj1;
	//   84  160:aload           11
	//   85  162:astore          10
			} else
	//*  86  164:aload_0         
	//*  87  165:aload_3         
	//*  88  166:aload           10
	//*  89  168:aconst_null     
	//*  90  169:invokevirtual   #949 <Method PdfDictionary getFontDescriptor(PdfIndirectReference, String, PdfIndirectReference)>
	//*  91  172:astore          11
	//*  92  174:aload           11
	//*  93  176:ifnull          189
	//*  94  179:aload_1         
	//*  95  180:aload           11
	//*  96  182:invokevirtual   #941 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//*  97  185:invokevirtual   #947 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*  98  188:astore_3        
	//*  99  189:aload_1         
	//* 100  190:aload_0         
	//* 101  191:aload_3         
	//* 102  192:aload           10
	//* 103  194:iload           4
	//* 104  196:iload           5
	//* 105  198:aload           12
	//* 106  200:invokevirtual   #951 <Method PdfDictionary getFontBaseType(PdfIndirectReference, String, int, int, byte[])>
	//* 107  203:aload_2         
	//* 108  204:invokevirtual   #954 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//* 109  207:pop             
	//* 110  208:return          
			{
				obj = obj1;
	//  111  209:aload           11
	//  112  211:astore          10
				if(flag1)
	//* 113  213:iload           9
	//* 114  215:ifeq            223
					obj = ((Object) (createSubsetPrefix()));
	//  115  218:invokestatic    #957 <Method String createSubsetPrefix()>
	//  116  221:astore          10
				obj1 = ((Object) (new HashSet()));
	//  117  223:new             #403 <Class HashSet>
	//  118  226:dup             
	//  119  227:invokespecial   #958 <Method void HashSet()>
	//  120  230:astore          11
				int l = i;
	//  121  232:iload           4
	//  122  234:istore          6
				while(l <= j) 
	//* 123  236:iload           6
	//* 124  238:iload           5
	//* 125  240:icmpgt          343
				{
					if(abyte0[l] != 0)
	//* 126  243:aload           12
	//* 127  245:iload           6
	//* 128  247:baload          
	//* 129  248:ifeq            302
					{
						aobj = null;
	//  130  251:aconst_null     
	//  131  252:astore_3        
						if(specialMap != null)
	//* 132  253:aload_0         
	//* 133  254:getfield        #961 <Field IntHashtable specialMap>
	//* 134  257:ifnull          311
						{
							int ai[] = GlyphList.nameToUnicode(differences[l]);
	//  135  260:aload_0         
	//  136  261:getfield        #658 <Field String[] differences>
	//  137  264:iload           6
	//  138  266:aaload          
	//  139  267:invokestatic    #967 <Method int[] GlyphList.nameToUnicode(String)>
	//  140  270:astore          13
							if(ai != null)
	//* 141  272:aload           13
	//* 142  274:ifnull          286
								aobj = ((Object []) (getMetricsTT(ai[0])));
	//  143  277:aload_0         
	//  144  278:aload           13
	//  145  280:iconst_0        
	//  146  281:iaload          
	//  147  282:invokevirtual   #803 <Method int[] getMetricsTT(int)>
	//  148  285:astore_3        
						} else
	//* 149  286:aload_3         
	//* 150  287:ifnull          302
	//* 151  290:aload           11
	//* 152  292:aload_3         
	//* 153  293:iconst_0        
	//* 154  294:iaload          
	//* 155  295:invokestatic    #382 <Method Integer Integer.valueOf(int)>
	//* 156  298:invokevirtual   #407 <Method boolean HashSet.add(Object)>
	//* 157  301:pop             
	//* 158  302:iload           6
	//* 159  304:iconst_1        
	//* 160  305:iadd            
	//* 161  306:istore          6
	//* 162  308:goto            236
						if(fontSpecific)
	//* 163  311:aload_0         
	//* 164  312:getfield        #349 <Field boolean fontSpecific>
	//* 165  315:ifeq            328
							aobj = ((Object []) (getMetricsTT(l)));
	//  166  318:aload_0         
	//  167  319:iload           6
	//  168  321:invokevirtual   #803 <Method int[] getMetricsTT(int)>
	//  169  324:astore_3        
						else
	//* 170  325:goto            286
							aobj = ((Object []) (getMetricsTT(((int) (unicodeDifferences[l])))));
	//  171  328:aload_0         
	//  172  329:aload_0         
	//  173  330:getfield        #971 <Field char[] unicodeDifferences>
	//  174  333:iload           6
	//  175  335:caload          
	//  176  336:invokevirtual   #803 <Method int[] getMetricsTT(int)>
	//  177  339:astore_3        
						if(aobj != null)
							((HashSet) (obj1)).add(((Object) (Integer.valueOf(((int) (aobj[0]))))));
					}
					l++;
				}
	//* 178  340:goto            286
				addRangeUni(((HashSet) (obj1)), flag1);
	//  179  343:aload_0         
	//  180  344:aload           11
	//  181  346:iload           9
	//  182  348:invokevirtual   #973 <Method void addRangeUni(HashSet, boolean)>
				int i1;
				if(flag1 || directoryOffset != 0 || subsetRanges != null)
	//* 183  351:iload           9
	//* 184  353:ifne            370
	//* 185  356:aload_0         
	//* 186  357:getfield        #346 <Field int directoryOffset>
	//* 187  360:ifne            370
	//* 188  363:aload_0         
	//* 189  364:getfield        #344 <Field ArrayList subsetRanges>
	//* 190  367:ifnull          425
					aobj = ((Object []) (getSubSet(new HashSet(((java.util.Collection) (obj1))), flag1)));
	//  191  370:aload_0         
	//  192  371:new             #403 <Class HashSet>
	//  193  374:dup             
	//  194  375:aload           11
	//  195  377:invokespecial   #976 <Method void HashSet(java.util.Collection)>
	//  196  380:iload           9
	//  197  382:invokevirtual   #978 <Method byte[] getSubSet(HashSet, boolean)>
	//  198  385:astore_3        
				else
	//* 199  386:aload_3         
	//* 200  387:arraylength     
	//* 201  388:istore          6
	//* 202  390:aload_0         
	//* 203  391:getfield        #787 <Field int compressionLevel>
	//* 204  394:istore          7
	//* 205  396:aload_1         
	//* 206  397:new             #779 <Class BaseFont$StreamFont>
	//* 207  400:dup             
	//* 208  401:aload_3         
	//* 209  402:iconst_1        
	//* 210  403:newarray        int[]
	//* 211  405:dup             
	//* 212  406:iconst_0        
	//* 213  407:iload           6
	//* 214  409:iastore         
	//* 215  410:iload           7
	//* 216  412:invokespecial   #795 <Method void BaseFont$StreamFont(byte[], int[], int)>
	//* 217  415:invokevirtual   #941 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//* 218  418:invokevirtual   #947 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//* 219  421:astore_3        
	//* 220  422:goto            164
					aobj = ((Object []) (getFullFont()));
	//  221  425:aload_0         
	//  222  426:invokevirtual   #792 <Method byte[] getFullFont()>
	//  223  429:astore_3        
				l = aobj.length;
				i1 = compressionLevel;
				aobj = ((Object []) (pdfwriter.addToBody(((PdfObject) (new BaseFont.StreamFont(((byte []) (aobj)), new int[] {
					l
				}, i1)))).getIndirectReference()));
			}
		obj1 = ((Object) (getFontDescriptor(((PdfIndirectReference) (aobj)), ((String) (obj)), ((PdfIndirectReference) (null)))));
		if(obj1 != null)
			aobj = ((Object []) (pdfwriter.addToBody(((PdfObject) (obj1))).getIndirectReference()));
		pdfwriter.addToBody(((PdfObject) (getFontBaseType(((PdfIndirectReference) (aobj)), ((String) (obj)), i, j, abyte0))), pdfindirectreference);
	//* 224  430:goto            386
	}

	static final String codePages[] = {
		"1252 Latin 1", "1250 Latin 2: Eastern Europe", "1251 Cyrillic", "1253 Greek", "1254 Turkish", "1255 Hebrew", "1256 Arabic", "1257 Windows Baltic", "1258 Vietnamese", null, 
		null, null, null, null, null, null, "874 Thai", "932 JIS/Japan", "936 Chinese: Simplified chars--PRC and Singapore", "949 Korean Wansung", 
		"950 Chinese: Traditional chars--Taiwan and Hong Kong", "1361 Korean Johab", null, null, null, null, null, null, null, "Macintosh Character Set (US Roman)", 
		"OEM Character Set", "Symbol Character Set", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "869 IBM Greek", "866 MS-DOS Russian", 
		"865 MS-DOS Nordic", "864 Arabic", "863 MS-DOS Canadian French", "862 Hebrew", "861 MS-DOS Icelandic", "860 MS-DOS Portuguese", "857 IBM Turkish", "855 IBM Cyrillic; primarily Russian", "852 Latin 2", "775 MS-DOS Baltic", 
		"737 Greek; former 437 G", "708 Arabic; ASMO 708", "850 WE/Latin 1", "437 US"
	};
	protected String allNameEntries[][];
	protected int bboxes[][];
	protected boolean cff;
	protected int cffLength;
	protected int cffOffset;
	protected HashMap cmap10;
	protected HashMap cmap31;
	protected HashMap cmapExt;
	protected int directoryOffset;
	protected String familyName[][];
	protected String fileName;
	protected String fontName;
	protected String fullName[][];
	protected int glyphIdToChar[];
	protected int glyphWidthsByIndex[];
	protected FontHeader head;
	protected HorizontalHeader hhea;
	protected boolean isFixedPitch;
	protected double italicAngle;
	protected boolean justNames;
	protected IntHashtable kerning;
	protected int maxGlyphId;
	protected WindowsMetrics os_2;
	protected RandomAccessFileOrArray rf;
	protected String style;
	protected String subFamily[][];
	protected HashMap tables;
	protected String ttcIndex;
	protected int underlinePosition;
	protected int underlineThickness;

	static 
	{
	//    0    0:bipush          64
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #66  <String "1252 Latin 1">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #68  <String "1250 Latin 2: Eastern Europe">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #70  <String "1251 Cyrillic">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #72  <String "1253 Greek">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #74  <String "1254 Turkish">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #76  <String "1255 Hebrew">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #78  <String "1256 Arabic">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #80  <String "1257 Windows Baltic">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #82  <String "1258 Vietnamese">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:aconst_null     
	//   41   57:aastore         
	//   42   58:dup             
	//   43   59:bipush          10
	//   44   61:aconst_null     
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          11
	//   48   66:aconst_null     
	//   49   67:aastore         
	//   50   68:dup             
	//   51   69:bipush          12
	//   52   71:aconst_null     
	//   53   72:aastore         
	//   54   73:dup             
	//   55   74:bipush          13
	//   56   76:aconst_null     
	//   57   77:aastore         
	//   58   78:dup             
	//   59   79:bipush          14
	//   60   81:aconst_null     
	//   61   82:aastore         
	//   62   83:dup             
	//   63   84:bipush          15
	//   64   86:aconst_null     
	//   65   87:aastore         
	//   66   88:dup             
	//   67   89:bipush          16
	//   68   91:ldc1            #84  <String "874 Thai">
	//   69   93:aastore         
	//   70   94:dup             
	//   71   95:bipush          17
	//   72   97:ldc1            #86  <String "932 JIS/Japan">
	//   73   99:aastore         
	//   74  100:dup             
	//   75  101:bipush          18
	//   76  103:ldc1            #88  <String "936 Chinese: Simplified chars--PRC and Singapore">
	//   77  105:aastore         
	//   78  106:dup             
	//   79  107:bipush          19
	//   80  109:ldc1            #90  <String "949 Korean Wansung">
	//   81  111:aastore         
	//   82  112:dup             
	//   83  113:bipush          20
	//   84  115:ldc1            #92  <String "950 Chinese: Traditional chars--Taiwan and Hong Kong">
	//   85  117:aastore         
	//   86  118:dup             
	//   87  119:bipush          21
	//   88  121:ldc1            #94  <String "1361 Korean Johab">
	//   89  123:aastore         
	//   90  124:dup             
	//   91  125:bipush          22
	//   92  127:aconst_null     
	//   93  128:aastore         
	//   94  129:dup             
	//   95  130:bipush          23
	//   96  132:aconst_null     
	//   97  133:aastore         
	//   98  134:dup             
	//   99  135:bipush          24
	//  100  137:aconst_null     
	//  101  138:aastore         
	//  102  139:dup             
	//  103  140:bipush          25
	//  104  142:aconst_null     
	//  105  143:aastore         
	//  106  144:dup             
	//  107  145:bipush          26
	//  108  147:aconst_null     
	//  109  148:aastore         
	//  110  149:dup             
	//  111  150:bipush          27
	//  112  152:aconst_null     
	//  113  153:aastore         
	//  114  154:dup             
	//  115  155:bipush          28
	//  116  157:aconst_null     
	//  117  158:aastore         
	//  118  159:dup             
	//  119  160:bipush          29
	//  120  162:ldc1            #96  <String "Macintosh Character Set (US Roman)">
	//  121  164:aastore         
	//  122  165:dup             
	//  123  166:bipush          30
	//  124  168:ldc1            #98  <String "OEM Character Set">
	//  125  170:aastore         
	//  126  171:dup             
	//  127  172:bipush          31
	//  128  174:ldc1            #100 <String "Symbol Character Set">
	//  129  176:aastore         
	//  130  177:dup             
	//  131  178:bipush          32
	//  132  180:aconst_null     
	//  133  181:aastore         
	//  134  182:dup             
	//  135  183:bipush          33
	//  136  185:aconst_null     
	//  137  186:aastore         
	//  138  187:dup             
	//  139  188:bipush          34
	//  140  190:aconst_null     
	//  141  191:aastore         
	//  142  192:dup             
	//  143  193:bipush          35
	//  144  195:aconst_null     
	//  145  196:aastore         
	//  146  197:dup             
	//  147  198:bipush          36
	//  148  200:aconst_null     
	//  149  201:aastore         
	//  150  202:dup             
	//  151  203:bipush          37
	//  152  205:aconst_null     
	//  153  206:aastore         
	//  154  207:dup             
	//  155  208:bipush          38
	//  156  210:aconst_null     
	//  157  211:aastore         
	//  158  212:dup             
	//  159  213:bipush          39
	//  160  215:aconst_null     
	//  161  216:aastore         
	//  162  217:dup             
	//  163  218:bipush          40
	//  164  220:aconst_null     
	//  165  221:aastore         
	//  166  222:dup             
	//  167  223:bipush          41
	//  168  225:aconst_null     
	//  169  226:aastore         
	//  170  227:dup             
	//  171  228:bipush          42
	//  172  230:aconst_null     
	//  173  231:aastore         
	//  174  232:dup             
	//  175  233:bipush          43
	//  176  235:aconst_null     
	//  177  236:aastore         
	//  178  237:dup             
	//  179  238:bipush          44
	//  180  240:aconst_null     
	//  181  241:aastore         
	//  182  242:dup             
	//  183  243:bipush          45
	//  184  245:aconst_null     
	//  185  246:aastore         
	//  186  247:dup             
	//  187  248:bipush          46
	//  188  250:aconst_null     
	//  189  251:aastore         
	//  190  252:dup             
	//  191  253:bipush          47
	//  192  255:aconst_null     
	//  193  256:aastore         
	//  194  257:dup             
	//  195  258:bipush          48
	//  196  260:ldc1            #102 <String "869 IBM Greek">
	//  197  262:aastore         
	//  198  263:dup             
	//  199  264:bipush          49
	//  200  266:ldc1            #104 <String "866 MS-DOS Russian">
	//  201  268:aastore         
	//  202  269:dup             
	//  203  270:bipush          50
	//  204  272:ldc1            #106 <String "865 MS-DOS Nordic">
	//  205  274:aastore         
	//  206  275:dup             
	//  207  276:bipush          51
	//  208  278:ldc1            #108 <String "864 Arabic">
	//  209  280:aastore         
	//  210  281:dup             
	//  211  282:bipush          52
	//  212  284:ldc1            #110 <String "863 MS-DOS Canadian French">
	//  213  286:aastore         
	//  214  287:dup             
	//  215  288:bipush          53
	//  216  290:ldc1            #112 <String "862 Hebrew">
	//  217  292:aastore         
	//  218  293:dup             
	//  219  294:bipush          54
	//  220  296:ldc1            #114 <String "861 MS-DOS Icelandic">
	//  221  298:aastore         
	//  222  299:dup             
	//  223  300:bipush          55
	//  224  302:ldc1            #116 <String "860 MS-DOS Portuguese">
	//  225  304:aastore         
	//  226  305:dup             
	//  227  306:bipush          56
	//  228  308:ldc1            #118 <String "857 IBM Turkish">
	//  229  310:aastore         
	//  230  311:dup             
	//  231  312:bipush          57
	//  232  314:ldc1            #120 <String "855 IBM Cyrillic; primarily Russian">
	//  233  316:aastore         
	//  234  317:dup             
	//  235  318:bipush          58
	//  236  320:ldc1            #122 <String "852 Latin 2">
	//  237  322:aastore         
	//  238  323:dup             
	//  239  324:bipush          59
	//  240  326:ldc1            #124 <String "775 MS-DOS Baltic">
	//  241  328:aastore         
	//  242  329:dup             
	//  243  330:bipush          60
	//  244  332:ldc1            #126 <String "737 Greek; former 437 G">
	//  245  334:aastore         
	//  246  335:dup             
	//  247  336:bipush          61
	//  248  338:ldc1            #128 <String "708 Arabic; ASMO 708">
	//  249  340:aastore         
	//  250  341:dup             
	//  251  342:bipush          62
	//  252  344:ldc1            #130 <String "850 WE/Latin 1">
	//  253  346:aastore         
	//  254  347:dup             
	//  255  348:bipush          63
	//  256  350:ldc1            #132 <String "437 US">
	//  257  352:aastore         
	//  258  353:putstatic       #134 <Field String[] codePages>
	//* 259  356:return          
	}
}
