// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			PdfContentStreamProcessor

private static class PdfContentStreamProcessor$ResourceDictionary extends PdfDictionary
{

	public PdfObject getDirectObject(PdfName pdfname)
	{
		for(int i = resourcesStack.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List resourcesStack>
	//*   2    4:invokeinterface #28  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iflt            53
		{
			Object obj = ((Object) ((PdfDictionary)resourcesStack.get(i)));
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field List resourcesStack>
	//   10   20:iload_2         
	//   11   21:invokeinterface #32  <Method Object List.get(int)>
	//   12   26:checkcast       #4   <Class PdfDictionary>
	//   13   29:astore_3        
			if(obj == null)
				continue;
	//   14   30:aload_3         
	//   15   31:ifnull          46
			obj = ((Object) (((PdfDictionary) (obj)).getDirectObject(pdfname)));
	//   16   34:aload_3         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #34  <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//   19   39:astore_3        
			if(obj != null)
	//*  20   40:aload_3         
	//*  21   41:ifnull          46
				return ((PdfObject) (obj));
	//   22   44:aload_3         
	//   23   45:areturn         
		}

	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:isub            
	//   27   49:istore_2        
	//*  28   50:goto            12
		return super.getDirectObject(pdfname);
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:invokespecial   #34  <Method PdfObject PdfDictionary.getDirectObject(PdfName)>
	//   32   58:areturn         
	}

	public void pop()
	{
		resourcesStack.remove(resourcesStack.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List resourcesStack>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field List resourcesStack>
	//    4    8:invokeinterface #28  <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:invokeinterface #38  <Method Object List.remove(int)>
	//    8   20:pop             
	//    9   21:return          
	}

	public void push(PdfDictionary pdfdictionary)
	{
		resourcesStack.add(((Object) (pdfdictionary)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List resourcesStack>
	//    2    4:aload_1         
	//    3    5:invokeinterface #44  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private final List resourcesStack = new ArrayList();

	public PdfContentStreamProcessor$ResourceDictionary()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void PdfDictionary()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field List resourcesStack>
	//    7   15:return          
	}
}
