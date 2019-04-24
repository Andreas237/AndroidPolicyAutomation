// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			RenderFilter, TextRenderInfo

public class MarkedContentRenderFilter extends RenderFilter
{

	public MarkedContentRenderFilter(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void RenderFilter()>
		mcid = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #13  <Field int mcid>
	//    5    9:return          
	}

	public boolean allowText(TextRenderInfo textrenderinfo)
	{
		return textrenderinfo.hasMcid(mcid);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field int mcid>
	//    3    5:invokevirtual   #22  <Method boolean TextRenderInfo.hasMcid(int)>
	//    4    8:ireturn         
	}

	private int mcid;
}
