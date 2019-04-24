// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.Chunk;
import com.itextpdf.tool.xml.*;
import com.itextpdf.tool.xml.exceptions.RuntimeWorkerException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			AbstractTagProcessor, CssAppliers

public class NonSanitizedTag extends AbstractTagProcessor
{

	public NonSanitizedTag()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List content(WorkerContext workercontext, Tag tag, String s)
	{
		ArrayList arraylist = new ArrayList(1);
	//    0    0:new             #15  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #18  <Method void ArrayList(int)>
	//    4    8:astore          4
		if(s != null && s.length() > 0)
	//*   5   10:aload_3         
	//*   6   11:ifnull          52
	//*   7   14:aload_3         
	//*   8   15:invokevirtual   #24  <Method int String.length()>
	//*   9   18:ifle            52
			try
			{
				((List) (arraylist)).add(((Object) (getCssAppliers().apply(((com.itextpdf.text.Element) (new Chunk(s))), tag, getHtmlPipelineContext(workercontext)))));
	//   10   21:aload           4
	//   11   23:aload_0         
	//   12   24:invokevirtual   #28  <Method CssAppliers getCssAppliers()>
	//   13   27:new             #30  <Class Chunk>
	//   14   30:dup             
	//   15   31:aload_3         
	//   16   32:invokespecial   #33  <Method void Chunk(String)>
	//   17   35:aload_2         
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #37  <Method com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext getHtmlPipelineContext(WorkerContext)>
	//   21   41:invokeinterface #43  <Method com.itextpdf.text.Element CssAppliers.apply(com.itextpdf.text.Element, Tag, com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext)>
	//   22   46:invokeinterface #49  <Method boolean List.add(Object)>
	//   23   51:pop             
			}
	//*  24   52:aload           4
	//*  25   54:areturn         
			// Misplaced declaration of an exception variable
			catch(WorkerContext workercontext)
	//*  26   55:astore_1        
			{
				throw new RuntimeWorkerException(((Throwable) (workercontext)));
	//   27   56:new             #51  <Class RuntimeWorkerException>
	//   28   59:dup             
	//   29   60:aload_1         
	//   30   61:invokespecial   #54  <Method void RuntimeWorkerException(Throwable)>
	//   31   64:athrow          
			}
		return ((List) (arraylist));
	}

	public List end(WorkerContext workercontext, Tag tag, List list)
	{
		return currentContentToParagraph(list, false, true, tag, workercontext);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:iconst_0        
	//    3    3:iconst_1        
	//    4    4:aload_2         
	//    5    5:aload_1         
	//    6    6:invokevirtual   #62  <Method List currentContentToParagraph(List, boolean, boolean, Tag, WorkerContext)>
	//    7    9:areturn         
	}
}
