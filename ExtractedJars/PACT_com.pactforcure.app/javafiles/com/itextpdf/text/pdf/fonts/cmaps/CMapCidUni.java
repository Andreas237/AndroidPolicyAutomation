// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import com.itextpdf.text.Utilities;
import com.itextpdf.text.pdf.*;

// Referenced classes of package com.itextpdf.text.pdf.fonts.cmaps:
//			AbstractCMap

public class CMapCidUni extends AbstractCMap
{

	public CMapCidUni()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void AbstractCMap()>
		map = new IntHashtable(0x10001);
	//    2    4:aload_0         
	//    3    5:new             #12  <Class IntHashtable>
	//    4    8:dup             
	//    5    9:ldc1            #13  <Int 0x10001>
	//    6   11:invokespecial   #16  <Method void IntHashtable(int)>
	//    7   14:putfield        #18  <Field IntHashtable map>
	//    8   17:return          
	}

	void addChar(PdfString pdfstring, PdfObject pdfobject)
	{
		if(!(pdfobject instanceof PdfNumber))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #23  <Class PdfNumber>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		pdfstring = ((PdfString) (decodeStringToUnicode(pdfstring)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #27  <Method String decodeStringToUnicode(PdfString)>
	//    7   13:astore_1        
		int i;
		if(Utilities.isSurrogatePair(((String) (pdfstring)), 0))
	//*   8   14:aload_1         
	//*   9   15:iconst_0        
	//*  10   16:invokestatic    #33  <Method boolean Utilities.isSurrogatePair(String, int)>
	//*  11   19:ifeq            45
			i = Utilities.convertToUtf32(((String) (pdfstring)), 0);
	//   12   22:aload_1         
	//   13   23:iconst_0        
	//   14   24:invokestatic    #37  <Method int Utilities.convertToUtf32(String, int)>
	//   15   27:istore_3        
		else
	//*  16   28:aload_0         
	//*  17   29:getfield        #18  <Field IntHashtable map>
	//*  18   32:aload_2         
	//*  19   33:checkcast       #23  <Class PdfNumber>
	//*  20   36:invokevirtual   #41  <Method int PdfNumber.intValue()>
	//*  21   39:iload_3         
	//*  22   40:invokevirtual   #45  <Method int IntHashtable.put(int, int)>
	//*  23   43:pop             
	//*  24   44:return          
			i = ((int) (((String) (pdfstring)).charAt(0)));
	//   25   45:aload_1         
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #51  <Method char String.charAt(int)>
	//   28   50:istore_3        
		map.put(((PdfNumber)pdfobject).intValue(), i);
	//*  29   51:goto            28
	}

	public int lookup(int i)
	{
		return map.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IntHashtable map>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #56  <Method int IntHashtable.get(int)>
	//    4    8:ireturn         
	}

	private IntHashtable map;
}
