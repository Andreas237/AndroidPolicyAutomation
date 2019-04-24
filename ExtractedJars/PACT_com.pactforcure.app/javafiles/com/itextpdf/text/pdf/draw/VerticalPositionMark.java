// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.draw;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfContentByte;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.text.pdf.draw:
//			DrawInterface

public class VerticalPositionMark
	implements DrawInterface, Element
{

	public VerticalPositionMark()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		drawInterface = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field DrawInterface drawInterface>
		offset = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #20  <Field float offset>
	//    8   14:return          
	}

	public VerticalPositionMark(DrawInterface drawinterface, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		drawInterface = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field DrawInterface drawInterface>
		offset = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #20  <Field float offset>
		drawInterface = drawinterface;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #18  <Field DrawInterface drawInterface>
		offset = f;
	//   11   19:aload_0         
	//   12   20:fload_2         
	//   13   21:putfield        #20  <Field float offset>
	//   14   24:return          
	}

	public void draw(PdfContentByte pdfcontentbyte, float f, float f1, float f2, float f3, float f4)
	{
		if(drawInterface != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field DrawInterface drawInterface>
	//*   2    4:ifnull          30
			drawInterface.draw(pdfcontentbyte, f, f1, f2, f3, f4 + offset);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field DrawInterface drawInterface>
	//    5   11:aload_1         
	//    6   12:fload_2         
	//    7   13:fload_3         
	//    8   14:fload           4
	//    9   16:fload           5
	//   10   18:fload           6
	//   11   20:aload_0         
	//   12   21:getfield        #20  <Field float offset>
	//   13   24:fadd            
	//   14   25:invokeinterface #26  <Method void DrawInterface.draw(PdfContentByte, float, float, float, float, float)>
	//   15   30:return          
	}

	public List getChunks()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #30  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).add(((Object) (new Chunk(((DrawInterface) (this)), true))));
	//    4    8:aload_1         
	//    5    9:new             #33  <Class Chunk>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:invokespecial   #36  <Method void Chunk(DrawInterface, boolean)>
	//   10   18:invokeinterface #42  <Method boolean List.add(Object)>
	//   11   23:pop             
		return ((List) (arraylist));
	//   12   24:aload_1         
	//   13   25:areturn         
	}

	public DrawInterface getDrawInterface()
	{
		return drawInterface;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field DrawInterface drawInterface>
	//    2    4:areturn         
	}

	public float getOffset()
	{
		return offset;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float offset>
	//    2    4:freturn         
	}

	public boolean isContent()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isNestable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean process(ElementListener elementlistener)
	{
		boolean flag;
		try
		{
			flag = elementlistener.add(((Element) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #60  <Method boolean ElementListener.add(Element)>
	//    3    7:istore_2        
		}
	//*   4    8:iload_2         
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(ElementListener elementlistener)
	//*   6   10:astore_1        
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		}
		return flag;
	}

	public void setDrawInterface(DrawInterface drawinterface)
	{
		drawInterface = drawinterface;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field DrawInterface drawInterface>
	//    3    5:return          
	}

	public void setOffset(float f)
	{
		offset = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #20  <Field float offset>
	//    3    5:return          
	}

	public int type()
	{
		return 55;
	//    0    0:bipush          55
	//    1    2:ireturn         
	}

	protected DrawInterface drawInterface;
	protected float offset;
}
