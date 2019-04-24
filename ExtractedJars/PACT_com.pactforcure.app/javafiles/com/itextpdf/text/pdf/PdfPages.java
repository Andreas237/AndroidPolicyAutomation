// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfWriter, PdfIndirectReference, PdfName, PdfDictionary, 
//			PdfNumber, PdfArray, PdfObject

public class PdfPages
{

	PdfPages(PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		pages = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ArrayList()>
	//    6   12:putfield        #24  <Field ArrayList pages>
		parents = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #21  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #22  <Method void ArrayList()>
	//   11   23:putfield        #26  <Field ArrayList parents>
		leafSize = 10;
	//   12   26:aload_0         
	//   13   27:bipush          10
	//   14   29:putfield        #28  <Field int leafSize>
		writer = pdfwriter;
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:putfield        #30  <Field PdfWriter writer>
	//   18   37:return          
	}

	void addPage(PdfDictionary pdfdictionary)
	{
		try
		{
			if(pages.size() % leafSize == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ArrayList pages>
	//*   2    4:invokevirtual   #39  <Method int ArrayList.size()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field int leafSize>
	//*   5   11:irem            
	//*   6   12:ifne            30
				parents.add(((Object) (writer.getPdfIndirectReference())));
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field ArrayList parents>
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field PdfWriter writer>
	//   11   23:invokevirtual   #45  <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//   12   26:invokevirtual   #49  <Method boolean ArrayList.add(Object)>
	//   13   29:pop             
			PdfIndirectReference pdfindirectreference = (PdfIndirectReference)parents.get(parents.size() - 1);
	//   14   30:aload_0         
	//   15   31:getfield        #26  <Field ArrayList parents>
	//   16   34:aload_0         
	//   17   35:getfield        #26  <Field ArrayList parents>
	//   18   38:invokevirtual   #39  <Method int ArrayList.size()>
	//   19   41:iconst_1        
	//   20   42:isub            
	//   21   43:invokevirtual   #53  <Method Object ArrayList.get(int)>
	//   22   46:checkcast       #55  <Class PdfIndirectReference>
	//   23   49:astore_2        
			pdfdictionary.put(PdfName.PARENT, ((PdfObject) (pdfindirectreference)));
	//   24   50:aload_1         
	//   25   51:getstatic       #61  <Field PdfName PdfName.PARENT>
	//   26   54:aload_2         
	//   27   55:invokevirtual   #67  <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfindirectreference = writer.getCurrentPage();
	//   28   58:aload_0         
	//   29   59:getfield        #30  <Field PdfWriter writer>
	//   30   62:invokevirtual   #70  <Method PdfIndirectReference PdfWriter.getCurrentPage()>
	//   31   65:astore_2        
			writer.addToBody(((PdfObject) (pdfdictionary)), pdfindirectreference);
	//   32   66:aload_0         
	//   33   67:getfield        #30  <Field PdfWriter writer>
	//   34   70:aload_1         
	//   35   71:aload_2         
	//   36   72:invokevirtual   #74  <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//   37   75:pop             
			pages.add(((Object) (pdfindirectreference)));
	//   38   76:aload_0         
	//   39   77:getfield        #24  <Field ArrayList pages>
	//   40   80:aload_2         
	//   41   81:invokevirtual   #49  <Method boolean ArrayList.add(Object)>
	//   42   84:pop             
			return;
	//   43   85:return          
		}
		// Misplaced declaration of an exception variable
		catch(PdfDictionary pdfdictionary)
	//*  44   86:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfdictionary)));
	//   45   87:new             #76  <Class ExceptionConverter>
	//   46   90:dup             
	//   47   91:aload_1         
	//   48   92:invokespecial   #79  <Method void ExceptionConverter(Exception)>
	//   49   95:athrow          
		}
	}

	void addPage(PdfIndirectReference pdfindirectreference)
	{
		pages.add(((Object) (pdfindirectreference)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ArrayList pages>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	PdfIndirectReference addPageRef(PdfIndirectReference pdfindirectreference)
	{
		try
		{
			if(pages.size() % leafSize == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ArrayList pages>
	//*   2    4:invokevirtual   #39  <Method int ArrayList.size()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field int leafSize>
	//*   5   11:irem            
	//*   6   12:ifne            30
				parents.add(((Object) (writer.getPdfIndirectReference())));
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field ArrayList parents>
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field PdfWriter writer>
	//   11   23:invokevirtual   #45  <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//   12   26:invokevirtual   #49  <Method boolean ArrayList.add(Object)>
	//   13   29:pop             
			pages.add(((Object) (pdfindirectreference)));
	//   14   30:aload_0         
	//   15   31:getfield        #24  <Field ArrayList pages>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #49  <Method boolean ArrayList.add(Object)>
	//   18   38:pop             
			pdfindirectreference = (PdfIndirectReference)parents.get(parents.size() - 1);
	//   19   39:aload_0         
	//   20   40:getfield        #26  <Field ArrayList parents>
	//   21   43:aload_0         
	//   22   44:getfield        #26  <Field ArrayList parents>
	//   23   47:invokevirtual   #39  <Method int ArrayList.size()>
	//   24   50:iconst_1        
	//   25   51:isub            
	//   26   52:invokevirtual   #53  <Method Object ArrayList.get(int)>
	//   27   55:checkcast       #55  <Class PdfIndirectReference>
	//   28   58:astore_1        
		}
	//*  29   59:aload_1         
	//*  30   60:areturn         
		// Misplaced declaration of an exception variable
		catch(PdfIndirectReference pdfindirectreference)
	//*  31   61:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfindirectreference)));
	//   32   62:new             #76  <Class ExceptionConverter>
	//   33   65:dup             
	//   34   66:aload_1         
	//   35   67:invokespecial   #79  <Method void ExceptionConverter(Exception)>
	//   36   70:athrow          
		}
		return pdfindirectreference;
	}

	PdfIndirectReference getTopParent()
	{
		return topParent;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field PdfIndirectReference topParent>
	//    2    4:areturn         
	}

	int reorderPages(int ai[])
		throws DocumentException
	{
		if(ai != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       14
_L1:
		int i = pages.size();
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field ArrayList pages>
	//    4    8:invokevirtual   #39  <Method int ArrayList.size()>
	//    5   11:istore_2        
_L4:
		return i;
	//    6   12:iload_2         
	//    7   13:ireturn         
_L2:
		if(parents.size() > 1)
	//*   8   14:aload_0         
	//*   9   15:getfield        #26  <Field ArrayList parents>
	//*  10   18:invokevirtual   #39  <Method int ArrayList.size()>
	//*  11   21:iconst_1        
	//*  12   22:icmple          42
			throw new DocumentException(MessageLocalization.getComposedMessage("page.reordering.requires.a.single.parent.in.the.page.tree.call.pdfwriter.setlinearmode.after.open", new Object[0]));
	//   13   25:new             #89  <Class DocumentException>
	//   14   28:dup             
	//   15   29:ldc1            #91  <String "page.reordering.requires.a.single.parent.in.the.page.tree.call.pdfwriter.setlinearmode.after.open">
	//   16   31:iconst_0        
	//   17   32:anewarray       Object[]
	//   18   35:invokestatic    #97  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   19   38:invokespecial   #100 <Method void DocumentException(String)>
	//   20   41:athrow          
		if(ai.length != pages.size())
	//*  21   42:aload_1         
	//*  22   43:arraylength     
	//*  23   44:aload_0         
	//*  24   45:getfield        #24  <Field ArrayList pages>
	//*  25   48:invokevirtual   #39  <Method int ArrayList.size()>
	//*  26   51:icmpeq          71
			throw new DocumentException(MessageLocalization.getComposedMessage("page.reordering.requires.an.array.with.the.same.size.as.the.number.of.pages", new Object[0]));
	//   27   54:new             #89  <Class DocumentException>
	//   28   57:dup             
	//   29   58:ldc1            #102 <String "page.reordering.requires.an.array.with.the.same.size.as.the.number.of.pages">
	//   30   60:iconst_0        
	//   31   61:anewarray       Object[]
	//   32   64:invokestatic    #97  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   33   67:invokespecial   #100 <Method void DocumentException(String)>
	//   34   70:athrow          
		int l = pages.size();
	//   35   71:aload_0         
	//   36   72:getfield        #24  <Field ArrayList pages>
	//   37   75:invokevirtual   #39  <Method int ArrayList.size()>
	//   38   78:istore          4
		Object aobj[] = ((Object []) (new boolean[l]));
	//   39   80:iload           4
	//   40   82:newarray        boolean[]
	//   41   84:astore          5
		for(i = 0; i < l; i++)
	//*  42   86:iconst_0        
	//*  43   87:istore_2        
	//*  44   88:iload_2         
	//*  45   89:iload           4
	//*  46   91:icmpge          178
		{
			int j = ai[i];
	//   47   94:aload_1         
	//   48   95:iload_2         
	//   49   96:iaload          
	//   50   97:istore_3        
			if(j < 1 || j > l)
	//*  51   98:iload_3         
	//*  52   99:iconst_1        
	//*  53  100:icmplt          109
	//*  54  103:iload_3         
	//*  55  104:iload           4
	//*  56  106:icmple          141
				throw new DocumentException(MessageLocalization.getComposedMessage("page.reordering.requires.pages.between.1.and.1.found.2", new Object[] {
					String.valueOf(l), String.valueOf(j)
				}));
	//   57  109:new             #89  <Class DocumentException>
	//   58  112:dup             
	//   59  113:ldc1            #104 <String "page.reordering.requires.pages.between.1.and.1.found.2">
	//   60  115:iconst_2        
	//   61  116:anewarray       Object[]
	//   62  119:dup             
	//   63  120:iconst_0        
	//   64  121:iload           4
	//   65  123:invokestatic    #110 <Method String String.valueOf(int)>
	//   66  126:aastore         
	//   67  127:dup             
	//   68  128:iconst_1        
	//   69  129:iload_3         
	//   70  130:invokestatic    #110 <Method String String.valueOf(int)>
	//   71  133:aastore         
	//   72  134:invokestatic    #97  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   73  137:invokespecial   #100 <Method void DocumentException(String)>
	//   74  140:athrow          
			if(aobj[j - 1])
	//*  75  141:aload           5
	//*  76  143:iload_3         
	//*  77  144:iconst_1        
	//*  78  145:isub            
	//*  79  146:baload          
	//*  80  147:ifeq            164
				throw new DocumentException(MessageLocalization.getComposedMessage("page.reordering.requires.no.page.repetition.page.1.is.repeated", j));
	//   81  150:new             #89  <Class DocumentException>
	//   82  153:dup             
	//   83  154:ldc1            #112 <String "page.reordering.requires.no.page.repetition.page.1.is.repeated">
	//   84  156:iload_3         
	//   85  157:invokestatic    #115 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   86  160:invokespecial   #100 <Method void DocumentException(String)>
	//   87  163:athrow          
			aobj[j - 1] = true;
	//   88  164:aload           5
	//   89  166:iload_3         
	//   90  167:iconst_1        
	//   91  168:isub            
	//   92  169:iconst_1        
	//   93  170:bastore         
		}

	//   94  171:iload_2         
	//   95  172:iconst_1        
	//   96  173:iadd            
	//   97  174:istore_2        
	//*  98  175:goto            88
		aobj = ((Object []) ((PdfIndirectReference[])pages.toArray(((Object []) (new PdfIndirectReference[pages.size()])))));
	//   99  178:aload_0         
	//  100  179:getfield        #24  <Field ArrayList pages>
	//  101  182:aload_0         
	//  102  183:getfield        #24  <Field ArrayList pages>
	//  103  186:invokevirtual   #39  <Method int ArrayList.size()>
	//  104  189:anewarray       PdfIndirectReference[]
	//  105  192:invokevirtual   #119 <Method Object[] ArrayList.toArray(Object[])>
	//  106  195:checkcast       #121 <Class PdfIndirectReference[]>
	//  107  198:astore          5
		int k = 0;
	//  108  200:iconst_0        
	//  109  201:istore_3        
		do
		{
			i = l;
	//  110  202:iload           4
	//  111  204:istore_2        
			if(k >= l)
				continue;
	//  112  205:iload_3         
	//  113  206:iload           4
	//  114  208:icmpge          12
			pages.set(k, ((Object) (aobj[ai[k] - 1])));
	//  115  211:aload_0         
	//  116  212:getfield        #24  <Field ArrayList pages>
	//  117  215:iload_3         
	//  118  216:aload           5
	//  119  218:aload_1         
	//  120  219:iload_3         
	//  121  220:iaload          
	//  122  221:iconst_1        
	//  123  222:isub            
	//  124  223:aaload          
	//  125  224:invokevirtual   #125 <Method Object ArrayList.set(int, Object)>
	//  126  227:pop             
			k++;
	//  127  228:iload_3         
	//  128  229:iconst_1        
	//  129  230:iadd            
	//  130  231:istore_3        
		} while(true);
	//  131  232:goto            202
		if(true) goto _L4; else goto _L3
_L3:
	}

	void setLinearMode(PdfIndirectReference pdfindirectreference)
	{
		if(parents.size() > 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field ArrayList parents>
	//*   2    4:invokevirtual   #39  <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:icmple          28
			throw new RuntimeException(MessageLocalization.getComposedMessage("linear.page.mode.can.only.be.called.with.a.single.parent", new Object[0]));
	//    5   11:new             #129 <Class RuntimeException>
	//    6   14:dup             
	//    7   15:ldc1            #131 <String "linear.page.mode.can.only.be.called.with.a.single.parent">
	//    8   17:iconst_0        
	//    9   18:anewarray       Object[]
	//   10   21:invokestatic    #97  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   11   24:invokespecial   #132 <Method void RuntimeException(String)>
	//   12   27:athrow          
		if(pdfindirectreference != null)
	//*  13   28:aload_1         
	//*  14   29:ifnull          53
		{
			topParent = pdfindirectreference;
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:putfield        #85  <Field PdfIndirectReference topParent>
			parents.clear();
	//   18   37:aload_0         
	//   19   38:getfield        #26  <Field ArrayList parents>
	//   20   41:invokevirtual   #135 <Method void ArrayList.clear()>
			parents.add(((Object) (pdfindirectreference)));
	//   21   44:aload_0         
	//   22   45:getfield        #26  <Field ArrayList parents>
	//   23   48:aload_1         
	//   24   49:invokevirtual   #49  <Method boolean ArrayList.add(Object)>
	//   25   52:pop             
		}
		leafSize = 0x989680;
	//   26   53:aload_0         
	//   27   54:ldc1            #136 <Int 0x989680>
	//   28   56:putfield        #28  <Field int leafSize>
	//   29   59:return          
	}

	PdfIndirectReference writePageTree()
		throws IOException
	{
		if(pages.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ArrayList pages>
	//*   2    4:invokevirtual   #143 <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            27
			throw new IOException(MessageLocalization.getComposedMessage("the.document.has.no.pages", new Object[0]));
	//    4   10:new             #139 <Class IOException>
	//    5   13:dup             
	//    6   14:ldc1            #145 <String "the.document.has.no.pages">
	//    7   16:iconst_0        
	//    8   17:anewarray       Object[]
	//    9   20:invokestatic    #97  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   23:invokespecial   #146 <Method void IOException(String)>
	//   11   26:athrow          
		int i = 1;
	//   12   27:iconst_1        
	//   13   28:istore_1        
		ArrayList arraylist1 = parents;
	//   14   29:aload_0         
	//   15   30:getfield        #26  <Field ArrayList parents>
	//   16   33:astore          10
		ArrayList arraylist2 = pages;
	//   17   35:aload_0         
	//   18   36:getfield        #24  <Field ArrayList pages>
	//   19   39:astore          11
		ArrayList arraylist = new ArrayList();
	//   20   41:new             #21  <Class ArrayList>
	//   21   44:dup             
	//   22   45:invokespecial   #22  <Method void ArrayList()>
	//   23   48:astore          9
		do
		{
			i *= leafSize;
	//   24   50:iload_1         
	//   25   51:aload_0         
	//   26   52:getfield        #28  <Field int leafSize>
	//   27   55:imul            
	//   28   56:istore_1        
			int l1 = leafSize;
	//   29   57:aload_0         
	//   30   58:getfield        #28  <Field int leafSize>
	//   31   61:istore          7
			int k = arraylist2.size() % leafSize;
	//   32   63:aload           11
	//   33   65:invokevirtual   #39  <Method int ArrayList.size()>
	//   34   68:aload_0         
	//   35   69:getfield        #28  <Field int leafSize>
	//   36   72:irem            
	//   37   73:istore_3        
			int j = k;
	//   38   74:iload_3         
	//   39   75:istore_2        
			if(k == 0)
	//*  40   76:iload_3         
	//*  41   77:ifne            85
				j = leafSize;
	//   42   80:aload_0         
	//   43   81:getfield        #28  <Field int leafSize>
	//   44   84:istore_2        
			int i1 = 0;
	//   45   85:iconst_0        
	//   46   86:istore          4
			while(i1 < arraylist1.size()) 
	//*  47   88:iload           4
	//*  48   90:aload           10
	//*  49   92:invokevirtual   #39  <Method int ArrayList.size()>
	//*  50   95:icmpge          309
			{
				int l = i;
	//   51   98:iload_1         
	//   52   99:istore_3        
				int k1;
				PdfDictionary pdfdictionary;
				PdfArray pdfarray;
				if(i1 == arraylist1.size() - 1)
	//*  53  100:iload           4
	//*  54  102:aload           10
	//*  55  104:invokevirtual   #39  <Method int ArrayList.size()>
	//*  56  107:iconst_1        
	//*  57  108:isub            
	//*  58  109:icmpne          302
				{
					int j1 = j;
	//   59  112:iload_2         
	//   60  113:istore          5
					int i2 = pages.size() % i;
	//   61  115:aload_0         
	//   62  116:getfield        #24  <Field ArrayList pages>
	//   63  119:invokevirtual   #39  <Method int ArrayList.size()>
	//   64  122:iload_1         
	//   65  123:irem            
	//   66  124:istore          8
					k1 = j1;
	//   67  126:iload           5
	//   68  128:istore          6
					l = i2;
	//   69  130:iload           8
	//   70  132:istore_3        
					if(i2 == 0)
	//*  71  133:iload           8
	//*  72  135:ifne            144
					{
						l = i;
	//   73  138:iload_1         
	//   74  139:istore_3        
						k1 = j1;
	//   75  140:iload           5
	//   76  142:istore          6
					}
				} else
	//*  77  144:new             #63  <Class PdfDictionary>
	//*  78  147:dup             
	//*  79  148:getstatic       #149 <Field PdfName PdfName.PAGES>
	//*  80  151:invokespecial   #152 <Method void PdfDictionary(PdfName)>
	//*  81  154:astore          12
	//*  82  156:aload           12
	//*  83  158:getstatic       #155 <Field PdfName PdfName.COUNT>
	//*  84  161:new             #157 <Class PdfNumber>
	//*  85  164:dup             
	//*  86  165:iload_3         
	//*  87  166:invokespecial   #160 <Method void PdfNumber(int)>
	//*  88  169:invokevirtual   #67  <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  89  172:new             #162 <Class PdfArray>
	//*  90  175:dup             
	//*  91  176:invokespecial   #163 <Method void PdfArray()>
	//*  92  179:astore          13
	//*  93  181:aload           13
	//*  94  183:invokevirtual   #167 <Method ArrayList PdfArray.getArrayList()>
	//*  95  186:aload           11
	//*  96  188:iload           4
	//*  97  190:iload           7
	//*  98  192:imul            
	//*  99  193:iload           4
	//* 100  195:iload           7
	//* 101  197:imul            
	//* 102  198:iload           6
	//* 103  200:iadd            
	//* 104  201:invokevirtual   #171 <Method java.util.List ArrayList.subList(int, int)>
	//* 105  204:invokevirtual   #175 <Method boolean ArrayList.addAll(java.util.Collection)>
	//* 106  207:pop             
	//* 107  208:aload           12
	//* 108  210:getstatic       #178 <Field PdfName PdfName.KIDS>
	//* 109  213:aload           13
	//* 110  215:invokevirtual   #67  <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 111  218:aload           10
	//* 112  220:invokevirtual   #39  <Method int ArrayList.size()>
	//* 113  223:iconst_1        
	//* 114  224:icmple          273
	//* 115  227:iload           4
	//* 116  229:aload_0         
	//* 117  230:getfield        #28  <Field int leafSize>
	//* 118  233:irem            
	//* 119  234:ifne            250
	//* 120  237:aload           9
	//* 121  239:aload_0         
	//* 122  240:getfield        #30  <Field PdfWriter writer>
	//* 123  243:invokevirtual   #45  <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//* 124  246:invokevirtual   #49  <Method boolean ArrayList.add(Object)>
	//* 125  249:pop             
	//* 126  250:aload           12
	//* 127  252:getstatic       #61  <Field PdfName PdfName.PARENT>
	//* 128  255:aload           9
	//* 129  257:iload           4
	//* 130  259:aload_0         
	//* 131  260:getfield        #28  <Field int leafSize>
	//* 132  263:idiv            
	//* 133  264:invokevirtual   #53  <Method Object ArrayList.get(int)>
	//* 134  267:checkcast       #180 <Class PdfObject>
	//* 135  270:invokevirtual   #67  <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 136  273:aload_0         
	//* 137  274:getfield        #30  <Field PdfWriter writer>
	//* 138  277:aload           12
	//* 139  279:aload           10
	//* 140  281:iload           4
	//* 141  283:invokevirtual   #53  <Method Object ArrayList.get(int)>
	//* 142  286:checkcast       #55  <Class PdfIndirectReference>
	//* 143  289:invokevirtual   #74  <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//* 144  292:pop             
	//* 145  293:iload           4
	//* 146  295:iconst_1        
	//* 147  296:iadd            
	//* 148  297:istore          4
	//* 149  299:goto            88
				{
					k1 = l1;
	//  150  302:iload           7
	//  151  304:istore          6
				}
				pdfdictionary = new PdfDictionary(PdfName.PAGES);
				pdfdictionary.put(PdfName.COUNT, ((PdfObject) (new PdfNumber(l))));
				pdfarray = new PdfArray();
				pdfarray.getArrayList().addAll(((java.util.Collection) (arraylist2.subList(i1 * l1, i1 * l1 + k1))));
				pdfdictionary.put(PdfName.KIDS, ((PdfObject) (pdfarray)));
				if(arraylist1.size() > 1)
				{
					if(i1 % leafSize == 0)
						arraylist.add(((Object) (writer.getPdfIndirectReference())));
					pdfdictionary.put(PdfName.PARENT, (PdfObject)arraylist.get(i1 / leafSize));
				}
				writer.addToBody(((PdfObject) (pdfdictionary)), (PdfIndirectReference)arraylist1.get(i1));
				i1++;
			}
	//* 152  306:goto            144
			if(arraylist1.size() == 1)
	//* 153  309:aload           10
	//* 154  311:invokevirtual   #39  <Method int ArrayList.size()>
	//* 155  314:iconst_1        
	//* 156  315:icmpne          336
			{
				topParent = (PdfIndirectReference)arraylist1.get(0);
	//  157  318:aload_0         
	//  158  319:aload           10
	//  159  321:iconst_0        
	//  160  322:invokevirtual   #53  <Method Object ArrayList.get(int)>
	//  161  325:checkcast       #55  <Class PdfIndirectReference>
	//  162  328:putfield        #85  <Field PdfIndirectReference topParent>
				return topParent;
	//  163  331:aload_0         
	//  164  332:getfield        #85  <Field PdfIndirectReference topParent>
	//  165  335:areturn         
			}
			arraylist2 = arraylist1;
	//  166  336:aload           10
	//  167  338:astore          11
			arraylist1 = arraylist;
	//  168  340:aload           9
	//  169  342:astore          10
			arraylist = new ArrayList();
	//  170  344:new             #21  <Class ArrayList>
	//  171  347:dup             
	//  172  348:invokespecial   #22  <Method void ArrayList()>
	//  173  351:astore          9
		} while(true);
	//  174  353:goto            50
	}

	private int leafSize;
	private ArrayList pages;
	private ArrayList parents;
	private PdfIndirectReference topParent;
	private PdfWriter writer;
}
