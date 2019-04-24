// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			RenderListener, TextRenderInfo, ImageRenderInfo

public class GlyphRenderListener
	implements RenderListener
{

	public GlyphRenderListener(RenderListener renderlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		_flddelegate = renderlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field RenderListener _flddelegate>
	//    5    9:return          
	}

	public void beginTextBlock()
	{
		_flddelegate.beginTextBlock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RenderListener _flddelegate>
	//    2    4:invokeinterface #19  <Method void RenderListener.beginTextBlock()>
	//    3    9:return          
	}

	public void endTextBlock()
	{
		_flddelegate.endTextBlock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RenderListener _flddelegate>
	//    2    4:invokeinterface #22  <Method void RenderListener.endTextBlock()>
	//    3    9:return          
	}

	public void renderImage(ImageRenderInfo imagerenderinfo)
	{
		_flddelegate.renderImage(imagerenderinfo);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RenderListener _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #26  <Method void RenderListener.renderImage(ImageRenderInfo)>
	//    4   10:return          
	}

	public void renderText(TextRenderInfo textrenderinfo)
	{
		TextRenderInfo textrenderinfo1;
		for(textrenderinfo = ((TextRenderInfo) (textrenderinfo.getCharacterRenderInfos().iterator())); ((Iterator) (textrenderinfo)).hasNext(); _flddelegate.renderText(textrenderinfo1))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #34  <Method List TextRenderInfo.getCharacterRenderInfos()>
	//*   2    4:invokeinterface #40  <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            42
			textrenderinfo1 = (TextRenderInfo)((Iterator) (textrenderinfo)).next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #50  <Method Object Iterator.next()>
	//    9   25:checkcast       #30  <Class TextRenderInfo>
	//   10   28:astore_2        

	//   11   29:aload_0         
	//   12   30:getfield        #15  <Field RenderListener _flddelegate>
	//   13   33:aload_2         
	//   14   34:invokeinterface #52  <Method void RenderListener.renderText(TextRenderInfo)>
	//*  15   39:goto            10
	//   16   42:return          
	}

	private final RenderListener _flddelegate;
}
