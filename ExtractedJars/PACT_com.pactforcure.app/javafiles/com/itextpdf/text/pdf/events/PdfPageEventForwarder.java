// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.events;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPageEvent;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class PdfPageEventForwarder
	implements PdfPageEvent
{

	public PdfPageEventForwarder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		events = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ArrayList()>
	//    6   12:putfield        #18  <Field ArrayList events>
	//    7   15:return          
	}

	public void addPageEvent(PdfPageEvent pdfpageevent)
	{
		events.add(((Object) (pdfpageevent)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void onChapter(PdfWriter pdfwriter, Document document, float f, Paragraph paragraph)
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPageEvent)iterator.next()).onChapter(pdfwriter, document, f, paragraph));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore          5
	//    4    9:aload           5
	//    5   11:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            42
	//    7   19:aload           5
	//    8   21:invokeinterface #41  <Method Object Iterator.next()>
	//    9   26:checkcast       #6   <Class PdfPageEvent>
	//   10   29:aload_1         
	//   11   30:aload_2         
	//   12   31:fload_3         
	//   13   32:aload           4
	//   14   34:invokeinterface #43  <Method void PdfPageEvent.onChapter(PdfWriter, Document, float, Paragraph)>
	//*  15   39:goto            9
	//   16   42:return          
	}

	public void onChapterEnd(PdfWriter pdfwriter, Document document, float f)
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPageEvent)iterator.next()).onChapterEnd(pdfwriter, document, f));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore          4
	//    4    9:aload           4
	//    5   11:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            40
	//    7   19:aload           4
	//    8   21:invokeinterface #41  <Method Object Iterator.next()>
	//    9   26:checkcast       #6   <Class PdfPageEvent>
	//   10   29:aload_1         
	//   11   30:aload_2         
	//   12   31:fload_3         
	//   13   32:invokeinterface #47  <Method void PdfPageEvent.onChapterEnd(PdfWriter, Document, float)>
	//*  14   37:goto            9
	//   15   40:return          
	}

	public void onCloseDocument(PdfWriter pdfwriter, Document document)
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPageEvent)iterator.next()).onCloseDocument(pdfwriter, document));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_3        
	//    4    8:aload_3         
	//    5    9:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            36
	//    7   17:aload_3         
	//    8   18:invokeinterface #41  <Method Object Iterator.next()>
	//    9   23:checkcast       #6   <Class PdfPageEvent>
	//   10   26:aload_1         
	//   11   27:aload_2         
	//   12   28:invokeinterface #51  <Method void PdfPageEvent.onCloseDocument(PdfWriter, Document)>
	//*  13   33:goto            8
	//   14   36:return          
	}

	public void onEndPage(PdfWriter pdfwriter, Document document)
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPageEvent)iterator.next()).onEndPage(pdfwriter, document));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_3        
	//    4    8:aload_3         
	//    5    9:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            36
	//    7   17:aload_3         
	//    8   18:invokeinterface #41  <Method Object Iterator.next()>
	//    9   23:checkcast       #6   <Class PdfPageEvent>
	//   10   26:aload_1         
	//   11   27:aload_2         
	//   12   28:invokeinterface #54  <Method void PdfPageEvent.onEndPage(PdfWriter, Document)>
	//*  13   33:goto            8
	//   14   36:return          
	}

	public void onGenericTag(PdfWriter pdfwriter, Document document, Rectangle rectangle, String s)
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPageEvent)iterator.next()).onGenericTag(pdfwriter, document, rectangle, s));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore          5
	//    4    9:aload           5
	//    5   11:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            42
	//    7   19:aload           5
	//    8   21:invokeinterface #41  <Method Object Iterator.next()>
	//    9   26:checkcast       #6   <Class PdfPageEvent>
	//   10   29:aload_1         
	//   11   30:aload_2         
	//   12   31:aload_3         
	//   13   32:aload           4
	//   14   34:invokeinterface #58  <Method void PdfPageEvent.onGenericTag(PdfWriter, Document, Rectangle, String)>
	//*  15   39:goto            9
	//   16   42:return          
	}

	public void onOpenDocument(PdfWriter pdfwriter, Document document)
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPageEvent)iterator.next()).onOpenDocument(pdfwriter, document));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_3        
	//    4    8:aload_3         
	//    5    9:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            36
	//    7   17:aload_3         
	//    8   18:invokeinterface #41  <Method Object Iterator.next()>
	//    9   23:checkcast       #6   <Class PdfPageEvent>
	//   10   26:aload_1         
	//   11   27:aload_2         
	//   12   28:invokeinterface #61  <Method void PdfPageEvent.onOpenDocument(PdfWriter, Document)>
	//*  13   33:goto            8
	//   14   36:return          
	}

	public void onParagraph(PdfWriter pdfwriter, Document document, float f)
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPageEvent)iterator.next()).onParagraph(pdfwriter, document, f));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore          4
	//    4    9:aload           4
	//    5   11:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            40
	//    7   19:aload           4
	//    8   21:invokeinterface #41  <Method Object Iterator.next()>
	//    9   26:checkcast       #6   <Class PdfPageEvent>
	//   10   29:aload_1         
	//   11   30:aload_2         
	//   12   31:fload_3         
	//   13   32:invokeinterface #64  <Method void PdfPageEvent.onParagraph(PdfWriter, Document, float)>
	//*  14   37:goto            9
	//   15   40:return          
	}

	public void onParagraphEnd(PdfWriter pdfwriter, Document document, float f)
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPageEvent)iterator.next()).onParagraphEnd(pdfwriter, document, f));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore          4
	//    4    9:aload           4
	//    5   11:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            40
	//    7   19:aload           4
	//    8   21:invokeinterface #41  <Method Object Iterator.next()>
	//    9   26:checkcast       #6   <Class PdfPageEvent>
	//   10   29:aload_1         
	//   11   30:aload_2         
	//   12   31:fload_3         
	//   13   32:invokeinterface #67  <Method void PdfPageEvent.onParagraphEnd(PdfWriter, Document, float)>
	//*  14   37:goto            9
	//   15   40:return          
	}

	public void onSection(PdfWriter pdfwriter, Document document, float f, int i, Paragraph paragraph)
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPageEvent)iterator.next()).onSection(pdfwriter, document, f, i, paragraph));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore          6
	//    4    9:aload           6
	//    5   11:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            44
	//    7   19:aload           6
	//    8   21:invokeinterface #41  <Method Object Iterator.next()>
	//    9   26:checkcast       #6   <Class PdfPageEvent>
	//   10   29:aload_1         
	//   11   30:aload_2         
	//   12   31:fload_3         
	//   13   32:iload           4
	//   14   34:aload           5
	//   15   36:invokeinterface #71  <Method void PdfPageEvent.onSection(PdfWriter, Document, float, int, Paragraph)>
	//*  16   41:goto            9
	//   17   44:return          
	}

	public void onSectionEnd(PdfWriter pdfwriter, Document document, float f)
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPageEvent)iterator.next()).onSectionEnd(pdfwriter, document, f));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore          4
	//    4    9:aload           4
	//    5   11:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            40
	//    7   19:aload           4
	//    8   21:invokeinterface #41  <Method Object Iterator.next()>
	//    9   26:checkcast       #6   <Class PdfPageEvent>
	//   10   29:aload_1         
	//   11   30:aload_2         
	//   12   31:fload_3         
	//   13   32:invokeinterface #74  <Method void PdfPageEvent.onSectionEnd(PdfWriter, Document, float)>
	//*  14   37:goto            9
	//   15   40:return          
	}

	public void onStartPage(PdfWriter pdfwriter, Document document)
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPageEvent)iterator.next()).onStartPage(pdfwriter, document));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_3        
	//    4    8:aload_3         
	//    5    9:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            36
	//    7   17:aload_3         
	//    8   18:invokeinterface #41  <Method Object Iterator.next()>
	//    9   23:checkcast       #6   <Class PdfPageEvent>
	//   10   26:aload_1         
	//   11   27:aload_2         
	//   12   28:invokeinterface #77  <Method void PdfPageEvent.onStartPage(PdfWriter, Document)>
	//*  13   33:goto            8
	//   14   36:return          
	}

	protected ArrayList events;
}
