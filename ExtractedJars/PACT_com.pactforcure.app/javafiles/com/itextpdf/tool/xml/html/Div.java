// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfDiv;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import com.itextpdf.tool.xml.html.pdfelement.NoNewLineParagraph;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			AbstractTagProcessor, HTMLUtils, CssAppliers

public class Div extends AbstractTagProcessor
{

	public Div()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	private void invertTextAlignForDiv(PdfDiv pdfdiv)
	{
		switch(pdfdiv.getTextAlignment())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #17  <Method int PdfDiv.getTextAlignment()>
		{
	//*   2    4:tableswitch     -1 8: default 60
	//	               -1 65
	//	               0 60
	//	               1 65
	//	               2 66
	//	               3 65
	//	               4 60
	//	               5 60
	//	               6 60
	//	               7 60
	//	               8 65
		case 0: // '\0'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		default:
			pdfdiv.setTextAlignment(2);
	//    3   60:aload_1         
	//    4   61:iconst_2        
	//    5   62:invokevirtual   #21  <Method void PdfDiv.setTextAlignment(int)>
			// fall through

		case -1: 
		case 1: // '\001'
		case 3: // '\003'
		case 8: // '\b'
			return;
	//    6   65:return          

		case 2: // '\002'
			pdfdiv.setTextAlignment(0);
	//    7   66:aload_1         
	//    8   67:iconst_0        
	//    9   68:invokevirtual   #21  <Method void PdfDiv.setTextAlignment(int)>
			break;
		}
	//   10   71:return          
	}

	public List content(WorkerContext workercontext, Tag tag, String s)
	{
		ArrayList arraylist;
		Object obj = ((Object) (HTMLUtils.sanitize(s, false)));
	//    0    0:aload_3         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #31  <Method List HTMLUtils.sanitize(String, boolean)>
	//    3    5:astore          5
		s = ((String) (new NoNewLineParagraph()));
	//    4    7:new             #33  <Class NoNewLineParagraph>
	//    5   10:dup             
	//    6   11:invokespecial   #34  <Method void NoNewLineParagraph()>
	//    7   14:astore_3        
		arraylist = new ArrayList(1);
	//    8   15:new             #36  <Class ArrayList>
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:invokespecial   #38  <Method void ArrayList(int)>
	//   12   23:astore          4
		try
		{
			workercontext = ((WorkerContext) (getHtmlPipelineContext(workercontext)));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #42  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   16   30:astore_1        
			Chunk chunk;
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((NoNewLineParagraph) (s)).add(getCssAppliers().apply(((Element) (chunk)), tag, ((com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext) (workercontext)))))
	//*  17   31:aload           5
	//*  18   33:invokeinterface #48  <Method Iterator List.iterator()>
	//*  19   38:astore          5
	//*  20   40:aload           5
	//*  21   42:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*  22   47:ifeq            93
				chunk = (Chunk)((Iterator) (obj)).next();
	//   23   50:aload           5
	//   24   52:invokeinterface #58  <Method Object Iterator.next()>
	//   25   57:checkcast       #60  <Class Chunk>
	//   26   60:astore          6

	//   27   62:aload_3         
	//   28   63:aload_0         
	//   29   64:invokevirtual   #64  <Method CssAppliers getCssAppliers()>
	//   30   67:aload           6
	//   31   69:aload_2         
	//   32   70:aload_1         
	//   33   71:invokeinterface #70  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//   34   76:invokevirtual   #74  <Method boolean NoNewLineParagraph.add(Element)>
	//   35   79:pop             
		}
	//*  36   80:goto            40
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//*  37   83:astore_1        
		{
			throw new RuntimeWorkerException(((Throwable) (workercontext)));
	//   38   84:new             #76  <Class RuntimeWorkerException>
	//   39   87:dup             
	//   40   88:aload_1         
	//   41   89:invokespecial   #79  <Method void RuntimeWorkerException(Throwable)>
	//   42   92:athrow          
		}
		if(((NoNewLineParagraph) (s)).size() > 0)
	//*  43   93:aload_3         
	//*  44   94:invokevirtual   #82  <Method int NoNewLineParagraph.size()>
	//*  45   97:ifle            120
			((List) (arraylist)).add(((Object) (getCssAppliers().apply(((Element) (s)), tag, ((com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext) (workercontext))))));
	//   46  100:aload           4
	//   47  102:aload_0         
	//   48  103:invokevirtual   #64  <Method CssAppliers getCssAppliers()>
	//   49  106:aload_3         
	//   50  107:aload_2         
	//   51  108:aload_1         
	//   52  109:invokeinterface #70  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//   53  114:invokeinterface #85  <Method boolean List.add(Object)>
	//   54  119:pop             
		return ((List) (arraylist));
	//   55  120:aload           4
	//   56  122:areturn         
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		int i;
		PdfDiv pdfdiv;
		pdfdiv = (PdfDiv)getCssAppliers().apply(((Element) (new PdfDiv())), tag, getHtmlPipelineContext(workercontext));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #64  <Method CssAppliers getCssAppliers()>
	//    2    4:new             #13  <Class PdfDiv>
	//    3    7:dup             
	//    4    8:invokespecial   #90  <Method void PdfDiv()>
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #42  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//    9   17:invokeinterface #70  <Method Element CssAppliers.apply(Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//   10   22:checkcast       #13  <Class PdfDiv>
	//   11   25:astore          5
		i = getRunDirection(tag);
	//   12   27:aload_0         
	//   13   28:aload_2         
	//   14   29:invokevirtual   #94  <Method int getRunDirection(Tag)>
	//   15   32:istore          4
		if(i == 1)
			break MISSING_BLOCK_LABEL_47;
	//   16   34:iload           4
	//   17   36:iconst_1        
	//   18   37:icmpeq          47
		pdfdiv.setRunDirection(i);
	//   19   40:aload           5
	//   20   42:iload           4
	//   21   44:invokevirtual   #97  <Method void PdfDiv.setRunDirection(int)>
		tag = ((Tag) (list.iterator()));
	//   22   47:aload_3         
	//   23   48:invokeinterface #48  <Method Iterator List.iterator()>
	//   24   53:astore_2        
		workercontext = null;
	//   25   54:aconst_null     
	//   26   55:astore_1        
_L3:
		if(!((Iterator) (tag)).hasNext()) goto _L2; else goto _L1
	//   27   56:aload_2         
	//   28   57:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//   29   62:ifeq            189
_L1:
		list = ((List) ((Element)((Iterator) (tag)).next()));
	//   30   65:aload_2         
	//   31   66:invokeinterface #58  <Method Object Iterator.next()>
	//   32   71:checkcast       #99  <Class Element>
	//   33   74:astore_3        
		if(!(list instanceof Paragraph) && !(list instanceof PdfPTable) && !(list instanceof PdfDiv))
			break MISSING_BLOCK_LABEL_124;
	//   34   75:aload_3         
	//   35   76:instanceof      #101 <Class Paragraph>
	//   36   79:ifne            96
	//   37   82:aload_3         
	//   38   83:instanceof      #103 <Class PdfPTable>
	//   39   86:ifne            96
	//   40   89:aload_3         
	//   41   90:instanceof      #13  <Class PdfDiv>
	//   42   93:ifeq            124
		if(workercontext == null)
			break MISSING_BLOCK_LABEL_115;
	//   43   96:aload_1         
	//   44   97:ifnull          245
		if(((Paragraph) (workercontext)).trim())
	//*  45  100:aload_1         
	//*  46  101:invokevirtual   #106 <Method boolean Paragraph.trim()>
	//*  47  104:ifeq            113
			pdfdiv.addElement(((Element) (workercontext)));
	//   48  107:aload           5
	//   49  109:aload_1         
	//   50  110:invokevirtual   #110 <Method void PdfDiv.addElement(Element)>
		workercontext = null;
	//   51  113:aconst_null     
	//   52  114:astore_1        
		pdfdiv.addElement(((Element) (list)));
	//   53  115:aload           5
	//   54  117:aload_3         
	//   55  118:invokevirtual   #110 <Method void PdfDiv.addElement(Element)>
		  goto _L3
	//*  56  121:goto            56
		if(workercontext != null)
			break MISSING_BLOCK_LABEL_162;
	//   57  124:aload_1         
	//   58  125:ifnonnull       242
		workercontext = ((WorkerContext) (new Paragraph()));
	//   59  128:new             #101 <Class Paragraph>
	//   60  131:dup             
	//   61  132:invokespecial   #111 <Method void Paragraph()>
	//   62  135:astore_1        
		((Paragraph) (workercontext)).setAlignment(pdfdiv.getTextAlignment());
	//   63  136:aload_1         
	//   64  137:aload           5
	//   65  139:invokevirtual   #17  <Method int PdfDiv.getTextAlignment()>
	//   66  142:invokevirtual   #114 <Method void Paragraph.setAlignment(int)>
		if(i != 3)
			break MISSING_BLOCK_LABEL_156;
	//   67  145:iload           4
	//   68  147:iconst_3        
	//   69  148:icmpne          156
		invertTextAlignForParagraph(((Paragraph) (workercontext)));
	//   70  151:aload_0         
	//   71  152:aload_1         
	//   72  153:invokevirtual   #118 <Method void invertTextAlignForParagraph(Paragraph)>
		((Paragraph) (workercontext)).setMultipliedLeading(1.2F);
	//   73  156:aload_1         
	//   74  157:ldc1            #119 <Float 1.2F>
	//   75  159:invokevirtual   #123 <Method void Paragraph.setMultipliedLeading(float)>
		((Paragraph) (workercontext)).add(((Element) (list)));
	//   76  162:aload_1         
	//   77  163:aload_3         
	//   78  164:invokevirtual   #124 <Method boolean Paragraph.add(Element)>
	//   79  167:pop             
		  goto _L3
	//*  80  168:goto            121
		workercontext;
	//   81  171:astore_1        
_L5:
		throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (workercontext)));
	//   82  172:new             #76  <Class RuntimeWorkerException>
	//   83  175:dup             
	//   84  176:invokestatic    #130 <Method LocaleMessages LocaleMessages.getInstance()>
	//   85  179:ldc1            #132 <String "customcontext.404">
	//   86  181:invokevirtual   #136 <Method String LocaleMessages.getMessage(String)>
	//   87  184:aload_1         
	//   88  185:invokespecial   #139 <Method void RuntimeWorkerException(String, Throwable)>
	//   89  188:athrow          
_L2:
		if(workercontext == null)
			break MISSING_BLOCK_LABEL_206;
	//   90  189:aload_1         
	//   91  190:ifnull          206
		if(((Paragraph) (workercontext)).trim())
	//*  92  193:aload_1         
	//*  93  194:invokevirtual   #106 <Method boolean Paragraph.trim()>
	//*  94  197:ifeq            206
			pdfdiv.addElement(((Element) (workercontext)));
	//   95  200:aload           5
	//   96  202:aload_1         
	//   97  203:invokevirtual   #110 <Method void PdfDiv.addElement(Element)>
		if(i != 3)
			break MISSING_BLOCK_LABEL_218;
	//   98  206:iload           4
	//   99  208:iconst_3        
	//  100  209:icmpne          218
		invertTextAlignForDiv(pdfdiv);
	//  101  212:aload_0         
	//  102  213:aload           5
	//  103  215:invokespecial   #141 <Method void invertTextAlignForDiv(PdfDiv)>
		workercontext = ((WorkerContext) (new ArrayList(1)));
	//  104  218:new             #36  <Class ArrayList>
	//  105  221:dup             
	//  106  222:iconst_1        
	//  107  223:invokespecial   #38  <Method void ArrayList(int)>
	//  108  226:astore_1        
		((List) (workercontext)).add(((Object) (pdfdiv)));
	//  109  227:aload_1         
	//  110  228:aload           5
	//  111  230:invokeinterface #85  <Method boolean List.add(Object)>
	//  112  235:pop             
		return ((List) (workercontext));
	//  113  236:aload_1         
	//  114  237:areturn         
		workercontext;
	//  115  238:astore_1        
		if(true) goto _L5; else goto _L4
_L4:
	//* 116  239:goto            172
	//* 117  242:goto            162
	//* 118  245:goto            115
	}

	public boolean isStackOwner()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
