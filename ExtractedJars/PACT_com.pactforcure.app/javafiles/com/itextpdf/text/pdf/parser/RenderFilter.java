// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			ImageRenderInfo, TextRenderInfo

public abstract class RenderFilter
{

	public RenderFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public boolean allowImage(ImageRenderInfo imagerenderinfo)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean allowText(TextRenderInfo textrenderinfo)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
