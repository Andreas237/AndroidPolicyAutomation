// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.pdfelement;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;

public class TabbedChunk extends Chunk
{

	public TabbedChunk(VerticalPositionMark verticalpositionmark, float f, boolean flag)
	{
		super(((com.itextpdf.text.pdf.draw.DrawInterface) (verticalpositionmark)), f, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #13  <Method void Chunk(com.itextpdf.text.pdf.draw.DrawInterface, float, boolean)>
	//    5    7:return          
	}

	public TabbedChunk(VerticalPositionMark verticalpositionmark, float f, boolean flag, String s)
	{
		super(((com.itextpdf.text.pdf.draw.DrawInterface) (verticalpositionmark)), f, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #13  <Method void Chunk(com.itextpdf.text.pdf.draw.DrawInterface, float, boolean)>
		alignment = s;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #17  <Field String alignment>
	//    8   13:return          
	}

	public TabbedChunk(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void Chunk(String)>
	//    3    5:return          
	}

	public String getAlignment()
	{
		return alignment;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String alignment>
	//    2    4:areturn         
	}

	public int getTabCount()
	{
		return tabCount;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int tabCount>
	//    2    4:ireturn         
	}

	public void setAlignment(String s)
	{
		alignment = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field String alignment>
	//    3    5:return          
	}

	public void setTabCount(int i)
	{
		tabCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field int tabCount>
	//    3    5:return          
	}

	private String alignment;
	private int tabCount;
}
