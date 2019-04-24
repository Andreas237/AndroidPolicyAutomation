// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.head;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

// Referenced classes of package com.itextpdf.tool.xml.html.head:
//			Title

class Title$1 extends WritableDirectElement
{

	public void write(PdfWriter pdfwriter, Document document)
		throws DocumentException
	{
		document.addTitle(val$content);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field String val$content>
	//    3    5:invokevirtual   #33  <Method boolean Document.addTitle(String)>
	//    4    8:pop             
	//    5    9:return          
	}

	final Title this$0;
	final String val$content;

	Title$1()
	{
		this$0 = final_title;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Title this$0>
		val$content = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field String val$content>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void WritableDirectElement()>
	//    8   14:return          
	}
}
