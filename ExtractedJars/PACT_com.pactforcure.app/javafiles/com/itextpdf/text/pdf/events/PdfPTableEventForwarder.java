// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.events;

import com.itextpdf.text.pdf.*;
import java.util.ArrayList;
import java.util.Iterator;

public class PdfPTableEventForwarder
	implements PdfPTableEventAfterSplit
{

	public PdfPTableEventForwarder()
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

	public void addTableEvent(PdfPTableEvent pdfptableevent)
	{
		events.add(((Object) (pdfptableevent)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void afterSplitTable(PdfPTable pdfptable, PdfPRow pdfprow, int i)
	{
		Iterator iterator = events.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    9:aload           4
	//    5   11:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            55
			PdfPTableEvent pdfptableevent = (PdfPTableEvent)iterator.next();
	//    7   19:aload           4
	//    8   21:invokeinterface #41  <Method Object Iterator.next()>
	//    9   26:checkcast       #43  <Class PdfPTableEvent>
	//   10   29:astore          5
			if(pdfptableevent instanceof PdfPTableEventAfterSplit)
	//*  11   31:aload           5
	//*  12   33:instanceof      #6   <Class PdfPTableEventAfterSplit>
	//*  13   36:ifeq            9
				((PdfPTableEventAfterSplit)pdfptableevent).afterSplitTable(pdfptable, pdfprow, i);
	//   14   39:aload           5
	//   15   41:checkcast       #6   <Class PdfPTableEventAfterSplit>
	//   16   44:aload_1         
	//   17   45:aload_2         
	//   18   46:iload_3         
	//   19   47:invokeinterface #45  <Method void PdfPTableEventAfterSplit.afterSplitTable(PdfPTable, PdfPRow, int)>
		} while(true);
	//   20   52:goto            9
	//   21   55:return          
	}

	public void splitTable(PdfPTable pdfptable)
	{
		Iterator iterator = events.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            47
			PdfPTableEvent pdfptableevent = (PdfPTableEvent)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #41  <Method Object Iterator.next()>
	//    9   23:checkcast       #43  <Class PdfPTableEvent>
	//   10   26:astore_3        
			if(pdfptableevent instanceof PdfPTableEventSplit)
	//*  11   27:aload_3         
	//*  12   28:instanceof      #49  <Class PdfPTableEventSplit>
	//*  13   31:ifeq            8
				((PdfPTableEventSplit)pdfptableevent).splitTable(pdfptable);
	//   14   34:aload_3         
	//   15   35:checkcast       #49  <Class PdfPTableEventSplit>
	//   16   38:aload_1         
	//   17   39:invokeinterface #51  <Method void PdfPTableEventSplit.splitTable(PdfPTable)>
		} while(true);
	//   18   44:goto            8
	//   19   47:return          
	}

	public void tableLayout(PdfPTable pdfptable, float af[][], float af1[], int i, int j, PdfContentByte apdfcontentbyte[])
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPTableEvent)iterator.next()).tableLayout(pdfptable, af, af1, i, j, apdfcontentbyte));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore          7
	//    4    9:aload           7
	//    5   11:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            46
	//    7   19:aload           7
	//    8   21:invokeinterface #41  <Method Object Iterator.next()>
	//    9   26:checkcast       #43  <Class PdfPTableEvent>
	//   10   29:aload_1         
	//   11   30:aload_2         
	//   12   31:aload_3         
	//   13   32:iload           4
	//   14   34:iload           5
	//   15   36:aload           6
	//   16   38:invokeinterface #55  <Method void PdfPTableEvent.tableLayout(PdfPTable, float[][], float[], int, int, PdfContentByte[])>
	//*  17   43:goto            9
	//   18   46:return          
	}

	protected ArrayList events;
}
