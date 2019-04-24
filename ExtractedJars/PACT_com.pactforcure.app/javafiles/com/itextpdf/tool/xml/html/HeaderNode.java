// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.pdf.PdfOutline;

public class HeaderNode
{

	public HeaderNode(int i, PdfOutline pdfoutline, HeaderNode headernode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		level = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int level>
		outline = pdfoutline;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field PdfOutline outline>
		parent = headernode;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #21  <Field HeaderNode parent>
	//   11   19:return          
	}

	public int level()
	{
		return level;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int level>
	//    2    4:ireturn         
	}

	public PdfOutline outline()
	{
		return outline;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PdfOutline outline>
	//    2    4:areturn         
	}

	public HeaderNode parent()
	{
		return parent;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field HeaderNode parent>
	//    2    4:areturn         
	}

	private int level;
	private PdfOutline outline;
	private HeaderNode parent;
}
