// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			RenderListener, RenderFilter, ImageRenderInfo, TextRenderInfo

public class FilteredRenderListener
	implements RenderListener
{

	public transient FilteredRenderListener(RenderListener renderlistener, RenderFilter arenderfilter[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		_flddelegate = renderlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field RenderListener _flddelegate>
		filters = arenderfilter;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field RenderFilter[] filters>
	//    8   14:return          
	}

	public void beginTextBlock()
	{
		_flddelegate.beginTextBlock();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RenderListener _flddelegate>
	//    2    4:invokeinterface #23  <Method void RenderListener.beginTextBlock()>
	//    3    9:return          
	}

	public void endTextBlock()
	{
		_flddelegate.endTextBlock();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RenderListener _flddelegate>
	//    2    4:invokeinterface #26  <Method void RenderListener.endTextBlock()>
	//    3    9:return          
	}

	public void renderImage(ImageRenderInfo imagerenderinfo)
	{
		RenderFilter arenderfilter[] = filters;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RenderFilter[] filters>
	//    2    4:astore          4
		int j = arenderfilter.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          36
			if(!arenderfilter[i].allowImage(imagerenderinfo))
	//*  11   17:aload           4
	//*  12   19:iload_2         
	//*  13   20:aaload          
	//*  14   21:aload_1         
	//*  15   22:invokevirtual   #34  <Method boolean RenderFilter.allowImage(ImageRenderInfo)>
	//*  16   25:ifne            29
				return;
	//   17   28:return          

	//   18   29:iload_2         
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:istore_2        
	//*  22   33:goto            12
		_flddelegate.renderImage(imagerenderinfo);
	//   23   36:aload_0         
	//   24   37:getfield        #17  <Field RenderListener _flddelegate>
	//   25   40:aload_1         
	//   26   41:invokeinterface #36  <Method void RenderListener.renderImage(ImageRenderInfo)>
	//   27   46:return          
	}

	public void renderText(TextRenderInfo textrenderinfo)
	{
		RenderFilter arenderfilter[] = filters;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RenderFilter[] filters>
	//    2    4:astore          4
		int j = arenderfilter.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          36
			if(!arenderfilter[i].allowText(textrenderinfo))
	//*  11   17:aload           4
	//*  12   19:iload_2         
	//*  13   20:aaload          
	//*  14   21:aload_1         
	//*  15   22:invokevirtual   #42  <Method boolean RenderFilter.allowText(TextRenderInfo)>
	//*  16   25:ifne            29
				return;
	//   17   28:return          

	//   18   29:iload_2         
	//   19   30:iconst_1        
	//   20   31:iadd            
	//   21   32:istore_2        
	//*  22   33:goto            12
		_flddelegate.renderText(textrenderinfo);
	//   23   36:aload_0         
	//   24   37:getfield        #17  <Field RenderListener _flddelegate>
	//   25   40:aload_1         
	//   26   41:invokeinterface #44  <Method void RenderListener.renderText(TextRenderInfo)>
	//   27   46:return          
	}

	private final RenderListener _flddelegate;
	private final RenderFilter filters[];
}
