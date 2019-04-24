// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.head;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import com.itextpdf.tool.xml.html.AbstractTagProcessor;
import java.util.ArrayList;
import java.util.List;

public class Title extends AbstractTagProcessor
{

	public Title()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void AbstractTagProcessor()>
	//    2    4:return          
	}

	public List content(WorkerContext workercontext, Tag tag, final String content)
	{
		workercontext = ((WorkerContext) (new ArrayList(1)));
	//    0    0:new             #15  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #18  <Method void ArrayList(int)>
	//    4    8:astore_1        
		((ArrayList) (workercontext)).add(((Object) (new WritableDirectElement() {

			public void write(PdfWriter pdfwriter, Document document)
				throws DocumentException
			{
				document.addTitle(content);
			//    0    0:aload_2         
			//    1    1:aload_0         
			//    2    2:getfield        #19  <Field String val$content>
			//    3    5:invokevirtual   #33  <Method boolean Document.addTitle(String)>
			//    4    8:pop             
			//    5    9:return          
			}

			final Title this$0;
			final String val$content;

			
			{
				this$0 = Title.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Title this$0>
				content = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field String val$content>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void WritableDirectElement()>
			//    8   14:return          
			}
		}
)));
	//    5    9:aload_1         
	//    6   10:new             #6   <Class Title$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokespecial   #21  <Method void Title$1(Title, String)>
	//   11   19:invokevirtual   #25  <Method boolean ArrayList.add(Object)>
	//   12   22:pop             
		return ((List) (workercontext));
	//   13   23:aload_1         
	//   14   24:areturn         
	}
}
