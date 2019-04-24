// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.*;
import com.itextpdf.text.log.Level;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.pdf.*;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			Header, HeaderNode

class Header$1 extends WritableDirectElement
{

	public void write(PdfWriter pdfwriter, Document document)
		throws DocumentException
	{
		int j;
		PdfDestination pdfdestination;
		Map map;
		pdfdestination = new PdfDestination(0, 20F, pdfwriter.getVerticalPosition(false), 0.0F);
	//    0    0:new             #37  <Class PdfDestination>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:ldc1            #38  <Float 20F>
	//    4    7:aload_1         
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #44  <Method float PdfWriter.getVerticalPosition(boolean)>
	//    7   12:fconst_0        
	//    8   13:invokespecial   #47  <Method void PdfDestination(int, float, float, float)>
	//    9   16:astore          5
		map = val$context.getMemory();
	//   10   18:aload_0         
	//   11   19:getfield        #23  <Field HtmlPipelineContext val$context>
	//   12   22:invokevirtual   #53  <Method Map HtmlPipelineContext.getMemory()>
	//   13   25:astore          6
		document = ((Document) ((HeaderNode)map.get("header.autobookmark.RootNode")));
	//   14   27:aload           6
	//   15   29:ldc1            #55  <String "header.autobookmark.RootNode">
	//   16   31:invokeinterface #61  <Method Object Map.get(Object)>
	//   17   36:checkcast       #63  <Class HeaderNode>
	//   18   39:astore_2        
		j = Header.access$000(Header.this, val$tag);
	//   19   40:aload_0         
	//   20   41:getfield        #21  <Field Header this$0>
	//   21   44:aload_0         
	//   22   45:getfield        #25  <Field Tag val$tag>
	//   23   48:invokestatic    #67  <Method int Header.access$000(Header, Tag)>
	//   24   51:istore          4
		if(document != null) goto _L2; else goto _L1
	//   25   53:aload_2         
	//   26   54:ifnonnull       156
_L1:
		pdfwriter = ((PdfWriter) (new HeaderNode(0, pdfwriter.getRootOutline(), ((HeaderNode) (null)))));
	//   27   57:new             #63  <Class HeaderNode>
	//   28   60:dup             
	//   29   61:iconst_0        
	//   30   62:aload_1         
	//   31   63:invokevirtual   #71  <Method PdfOutline PdfWriter.getRootOutline()>
	//   32   66:aconst_null     
	//   33   67:invokespecial   #74  <Method void HeaderNode(int, PdfOutline, HeaderNode)>
	//   34   70:astore_1        
_L4:
		if(Header.access$100().isLogging(Level.TRACE))
	//*  35   71:invokestatic    #78  <Method Logger Header.access$100()>
	//*  36   74:getstatic       #84  <Field Level Level.TRACE>
	//*  37   77:invokeinterface #90  <Method boolean Logger.isLogging(Level)>
	//*  38   82:ifeq            118
			Header.access$100().trace(String.format(LocaleMessages.getInstance().getMessage("html.tag.h.create"), new Object[] {
				val$title.toString()
			}));
	//   39   85:invokestatic    #78  <Method Logger Header.access$100()>
	//   40   88:invokestatic    #96  <Method LocaleMessages LocaleMessages.getInstance()>
	//   41   91:ldc1            #98  <String "html.tag.h.create">
	//   42   93:invokevirtual   #102 <Method String LocaleMessages.getMessage(String)>
	//   43   96:iconst_1        
	//   44   97:anewarray       Object[]
	//   45  100:dup             
	//   46  101:iconst_0        
	//   47  102:aload_0         
	//   48  103:getfield        #27  <Field Paragraph val$title>
	//   49  106:invokevirtual   #110 <Method String Paragraph.toString()>
	//   50  109:aastore         
	//   51  110:invokestatic    #116 <Method String String.format(String, Object[])>
	//   52  113:invokeinterface #120 <Method void Logger.trace(String)>
		map.put("header.autobookmark.RootNode", ((Object) (new HeaderNode(j, new PdfOutline(((HeaderNode) (pdfwriter)).outline(), pdfdestination, val$title), ((HeaderNode) (pdfwriter))))));
	//   53  118:aload           6
	//   54  120:ldc1            #55  <String "header.autobookmark.RootNode">
	//   55  122:new             #63  <Class HeaderNode>
	//   56  125:dup             
	//   57  126:iload           4
	//   58  128:new             #122 <Class PdfOutline>
	//   59  131:dup             
	//   60  132:aload_1         
	//   61  133:invokevirtual   #125 <Method PdfOutline HeaderNode.outline()>
	//   62  136:aload           5
	//   63  138:aload_0         
	//   64  139:getfield        #27  <Field Paragraph val$title>
	//   65  142:invokespecial   #128 <Method void PdfOutline(PdfOutline, PdfDestination, Paragraph)>
	//   66  145:aload_1         
	//   67  146:invokespecial   #74  <Method void HeaderNode(int, PdfOutline, HeaderNode)>
	//   68  149:invokeinterface #132 <Method Object Map.put(Object, Object)>
	//   69  154:pop             
		return;
	//   70  155:return          
_L2:
		int i;
		i = ((HeaderNode) (document)).level();
	//   71  156:aload_2         
	//   72  157:invokevirtual   #136 <Method int HeaderNode.level()>
	//   73  160:istore_3        
		if(i != j)
			break; /* Loop/switch isn't completed */
	//   74  161:iload_3         
	//   75  162:iload           4
	//   76  164:icmpne          175
		pdfwriter = ((PdfWriter) (((HeaderNode) (document)).parent()));
	//   77  167:aload_2         
	//   78  168:invokevirtual   #140 <Method HeaderNode HeaderNode.parent()>
	//   79  171:astore_1        
		if(true) goto _L4; else goto _L3
	//   80  172:goto            71
_L3:
		pdfwriter = ((PdfWriter) (document));
	//   81  175:aload_2         
	//   82  176:astore_1        
		if(i <= j)
			continue;
	//   83  177:iload_3         
	//   84  178:iload           4
	//   85  180:icmple          71
		do
		{
			pdfwriter = ((PdfWriter) (document));
	//   86  183:aload_2         
	//   87  184:astore_1        
			if(i < j)
				continue;
	//   88  185:iload_3         
	//   89  186:iload           4
	//   90  188:icmplt          71
			i = ((HeaderNode) (document)).parent().level();
	//   91  191:aload_2         
	//   92  192:invokevirtual   #140 <Method HeaderNode HeaderNode.parent()>
	//   93  195:invokevirtual   #136 <Method int HeaderNode.level()>
	//   94  198:istore_3        
			document = ((Document) (((HeaderNode) (document)).parent()));
	//   95  199:aload_2         
	//   96  200:invokevirtual   #140 <Method HeaderNode HeaderNode.parent()>
	//   97  203:astore_2        
		} while(true);
	//   98  204:goto            183
		if(true) goto _L4; else goto _L5
_L5:
	}

	final Header this$0;
	final HtmlPipelineContext val$context;
	final Tag val$tag;
	final Paragraph val$title;

	Header$1(Paragraph paragraph)
	{
		this$0 = final_header;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Header this$0>
		val$context = htmlpipelinecontext;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field HtmlPipelineContext val$context>
		val$tag = Tag.this;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #25  <Field Tag val$tag>
		val$title = paragraph;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #27  <Field Paragraph val$title>
		super(final_i);
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:invokespecial   #30  <Method void WritableDirectElement(int)>
	//   15   27:return          
	}
}
