// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.css.CssUtils;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			AbstractTagProcessor, CssAppliers

public class HorizontalRule extends AbstractTagProcessor
{

	public HorizontalRule()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List start(WorkerContext workercontext, Tag tag)
	{
		float f;
		Object obj;
		ArrayList arraylist;
		LineSeparator lineseparator;
		Paragraph paragraph;
		try
		{
			arraylist = new ArrayList();
	//    0    0:new             #15  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void ArrayList()>
	//    3    7:astore          5
			workercontext = ((WorkerContext) (getHtmlPipelineContext(workercontext)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #20  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//    7   14:astore_1        
			lineseparator = (LineSeparator)getCssAppliers().apply(((com.itextpdf.text.Element) (new LineSeparator())), tag, ((com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext) (workercontext)));
	//    8   15:aload_0         
	//    9   16:invokevirtual   #24  <Method CssAppliers getCssAppliers()>
	//   10   19:new             #26  <Class LineSeparator>
	//   11   22:dup             
	//   12   23:invokespecial   #27  <Method void LineSeparator()>
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokeinterface #33  <Method com.itextpdf.text.Element CssAppliers.apply(com.itextpdf.text.Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//   16   33:checkcast       #26  <Class LineSeparator>
	//   17   36:astore          6
			paragraph = new Paragraph();
	//   18   38:new             #35  <Class Paragraph>
	//   19   41:dup             
	//   20   42:invokespecial   #36  <Method void Paragraph()>
	//   21   45:astore          7
			obj = ((Object) (tag.getCSS()));
	//   22   47:aload_2         
	//   23   48:invokevirtual   #42  <Method Map Tag.getCSS()>
	//   24   51:astore          4
		}
	//*  25   53:ldc1            #43  <Float 12F>
	//*  26   55:fstore_3        
	//*  27   56:aload           4
	//*  28   58:ldc1            #45  <String "font-size">
	//*  29   60:invokeinterface #51  <Method Object Map.get(Object)>
	//*  30   65:ifnull          87
	//*  31   68:invokestatic    #57  <Method CssUtils CssUtils.getInstance()>
	//*  32   71:aload           4
	//*  33   73:ldc1            #45  <String "font-size">
	//*  34   75:invokeinterface #51  <Method Object Map.get(Object)>
	//*  35   80:checkcast       #59  <Class String>
	//*  36   83:invokevirtual   #63  <Method float CssUtils.parsePxInCmMmPcToPt(String)>
	//*  37   86:fstore_3        
	//*  38   87:aload           4
	//*  39   89:ldc1            #65  <String "margin-top">
	//*  40   91:invokeinterface #51  <Method Object Map.get(Object)>
	//*  41   96:checkcast       #59  <Class String>
	//*  42   99:astore_2        
	//*  43  100:aload_2         
	//*  44  101:astore_1        
	//*  45  102:aload_2         
	//*  46  103:ifnonnull       109
	//*  47  106:ldc1            #67  <String "0.5em">
	//*  48  108:astore_1        
	//*  49  109:aload           4
	//*  50  111:ldc1            #69  <String "margin-bottom">
	//*  51  113:invokeinterface #51  <Method Object Map.get(Object)>
	//*  52  118:checkcast       #59  <Class String>
	//*  53  121:astore          4
	//*  54  123:aload           4
	//*  55  125:astore_2        
	//*  56  126:aload           4
	//*  57  128:ifnonnull       134
	//*  58  131:ldc1            #67  <String "0.5em">
	//*  59  133:astore_2        
	//*  60  134:aload           7
	//*  61  136:aload           7
	//*  62  138:invokevirtual   #73  <Method float Paragraph.getSpacingBefore()>
	//*  63  141:invokestatic    #57  <Method CssUtils CssUtils.getInstance()>
	//*  64  144:aload_1         
	//*  65  145:fload_3         
	//*  66  146:invokevirtual   #77  <Method float CssUtils.parseValueToPt(String, float)>
	//*  67  149:fadd            
	//*  68  150:invokevirtual   #81  <Method void Paragraph.setSpacingBefore(float)>
	//*  69  153:aload           7
	//*  70  155:aload           7
	//*  71  157:invokevirtual   #84  <Method float Paragraph.getSpacingAfter()>
	//*  72  160:invokestatic    #57  <Method CssUtils CssUtils.getInstance()>
	//*  73  163:aload_2         
	//*  74  164:fload_3         
	//*  75  165:invokevirtual   #77  <Method float CssUtils.parseValueToPt(String, float)>
	//*  76  168:fadd            
	//*  77  169:invokevirtual   #87  <Method void Paragraph.setSpacingAfter(float)>
	//*  78  172:aload           7
	//*  79  174:fconst_0        
	//*  80  175:invokevirtual   #90  <Method void Paragraph.setLeading(float)>
	//*  81  178:aload           7
	//*  82  180:aload           6
	//*  83  182:invokevirtual   #94  <Method boolean Paragraph.add(com.itextpdf.text.Element)>
	//*  84  185:pop             
	//*  85  186:aload           5
	//*  86  188:aload           7
	//*  87  190:invokeinterface #99  <Method boolean List.add(Object)>
	//*  88  195:pop             
	//*  89  196:aload           5
	//*  90  198:areturn         
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//*  91  199:astore_1        
		{
			throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (workercontext)));
	//   92  200:new             #101 <Class RuntimeWorkerException>
	//   93  203:dup             
	//   94  204:invokestatic    #106 <Method LocaleMessages LocaleMessages.getInstance()>
	//   95  207:ldc1            #108 <String "customcontext.404">
	//   96  209:invokevirtual   #112 <Method String LocaleMessages.getMessage(String)>
	//   97  212:aload_1         
	//   98  213:invokespecial   #115 <Method void RuntimeWorkerException(String, Throwable)>
	//   99  216:athrow          
		}
		f = 12F;
		if(((Map) (obj)).get("font-size") != null)
			f = CssUtils.getInstance().parsePxInCmMmPcToPt((String)((Map) (obj)).get("font-size"));
		tag = ((Tag) ((String)((Map) (obj)).get("margin-top")));
		workercontext = ((WorkerContext) (tag));
		if(tag == null)
			workercontext = "0.5em";
		obj = ((Object) ((String)((Map) (obj)).get("margin-bottom")));
		tag = ((Tag) (obj));
		if(obj == null)
			tag = "0.5em";
		paragraph.setSpacingBefore(paragraph.getSpacingBefore() + CssUtils.getInstance().parseValueToPt(((String) (workercontext)), f));
		paragraph.setSpacingAfter(paragraph.getSpacingAfter() + CssUtils.getInstance().parseValueToPt(((String) (tag)), f));
		paragraph.setLeading(0.0F);
		paragraph.add(((com.itextpdf.text.Element) (lineseparator)));
		((List) (arraylist)).add(((Object) (paragraph)));
		return ((List) (arraylist));
	}
}
