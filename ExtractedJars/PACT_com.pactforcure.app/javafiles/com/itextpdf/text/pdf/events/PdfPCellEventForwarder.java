// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.events;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import java.util.ArrayList;
import java.util.Iterator;

public class PdfPCellEventForwarder
	implements PdfPCellEvent
{

	public PdfPCellEventForwarder()
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

	public void addCellEvent(PdfPCellEvent pdfpcellevent)
	{
		events.add(((Object) (pdfpcellevent)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void cellLayout(PdfPCell pdfpcell, Rectangle rectangle, PdfContentByte apdfcontentbyte[])
	{
		for(Iterator iterator = events.iterator(); iterator.hasNext(); ((PdfPCellEvent)iterator.next()).cellLayout(pdfpcell, rectangle, apdfcontentbyte));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList events>
	//    2    4:invokevirtual   #31  <Method Iterator ArrayList.iterator()>
	//    3    7:astore          4
	//    4    9:aload           4
	//    5   11:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            40
	//    7   19:aload           4
	//    8   21:invokeinterface #41  <Method Object Iterator.next()>
	//    9   26:checkcast       #6   <Class PdfPCellEvent>
	//   10   29:aload_1         
	//   11   30:aload_2         
	//   12   31:aload_3         
	//   13   32:invokeinterface #43  <Method void PdfPCellEvent.cellLayout(PdfPCell, Rectangle, PdfContentByte[])>
	//*  14   37:goto            9
	//   15   40:return          
	}

	protected ArrayList events;
}
