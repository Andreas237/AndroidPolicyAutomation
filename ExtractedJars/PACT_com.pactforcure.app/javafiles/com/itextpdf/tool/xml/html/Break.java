// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.Chunk;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.LocaleMessages;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			AbstractTagProcessor, CssAppliers

public class Break extends AbstractTagProcessor
{

	public Break()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		list = ((List) (new ArrayList(1)));
	//    0    0:new             #15  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #18  <Method void ArrayList(int)>
	//    4    8:astore_3        
		try
		{
			workercontext = ((WorkerContext) (getHtmlPipelineContext(workercontext)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #22  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//    8   14:astore_1        
			list.add(((Object) ((Chunk)getCssAppliers().apply(((com.itextpdf.text.Element) (new Chunk(Chunk.NEWLINE))), tag, ((com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext) (workercontext))))));
	//    9   15:aload_3         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #26  <Method CssAppliers getCssAppliers()>
	//   12   20:new             #28  <Class Chunk>
	//   13   23:dup             
	//   14   24:getstatic       #32  <Field Chunk Chunk.NEWLINE>
	//   15   27:invokespecial   #35  <Method void Chunk(Chunk)>
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokeinterface #41  <Method com.itextpdf.text.Element CssAppliers.apply(com.itextpdf.text.Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//   19   37:checkcast       #28  <Class Chunk>
	//   20   40:invokeinterface #47  <Method boolean List.add(Object)>
	//   21   45:pop             
		}
	//*  22   46:aload_3         
	//*  23   47:areturn         
		// Misplaced declaration of an exception variable
		catch(WorkerContext workercontext)
	//*  24   48:astore_1        
		{
			throw new RuntimeWorkerException(LocaleMessages.getInstance().getMessage("customcontext.404"), ((Throwable) (workercontext)));
	//   25   49:new             #49  <Class RuntimeWorkerException>
	//   26   52:dup             
	//   27   53:invokestatic    #55  <Method LocaleMessages LocaleMessages.getInstance()>
	//   28   56:ldc1            #57  <String "customcontext.404">
	//   29   58:invokevirtual   #61  <Method String LocaleMessages.getMessage(String)>
	//   30   61:aload_1         
	//   31   62:invokespecial   #64  <Method void RuntimeWorkerException(String, Throwable)>
	//   32   65:athrow          
		}
		return list;
	}
}
