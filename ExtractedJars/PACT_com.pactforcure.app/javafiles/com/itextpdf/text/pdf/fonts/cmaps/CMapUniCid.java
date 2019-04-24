// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import com.itextpdf.text.Utilities;
import com.itextpdf.text.pdf.*;

// Referenced classes of package com.itextpdf.text.pdf.fonts.cmaps:
//			AbstractCMap, CMapToUnicode

public class CMapUniCid extends AbstractCMap
{

	public CMapUniCid()
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
	//*  18   32:iload_3         
	//*  19   33:aload_2         
	//*  20   34:checkcast       #23  <Class PdfNumber>
	//*  21   37:invokevirtual   #41  <Method int PdfNumber.intValue()>
	//*  22   40:invokevirtual   #45  <Method int IntHashtable.put(int, int)>
	//*  23   43:pop             
	//*  24   44:return          
			i = ((int) (((String) (pdfstring)).charAt(0)));
	//   25   45:aload_1         
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #51  <Method char String.charAt(int)>
	//   28   50:istore_3        
		map.put(i, ((PdfNumber)pdfobject).intValue());
	//*  29   51:goto            28
	}

	public CMapToUnicode exportToUnicode()
	{
		CMapToUnicode cmaptounicode = new CMapToUnicode();
	//    0    0:new             #55  <Class CMapToUnicode>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void CMapToUnicode()>
	//    3    7:astore          4
		int ai[] = map.toOrderedKeys();
	//    4    9:aload_0         
	//    5   10:getfield        #18  <Field IntHashtable map>
	//    6   13:invokevirtual   #60  <Method int[] IntHashtable.toOrderedKeys()>
	//    7   16:astore          5
		int j = ai.length;
	//    8   18:aload           5
	//    9   20:arraylength     
	//   10   21:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   22:iconst_0        
	//*  12   23:istore_1        
	//*  13   24:iload_1         
	//*  14   25:iload_2         
	//*  15   26:icmpge          58
		{
			int k = ai[i];
	//   16   29:aload           5
	//   17   31:iload_1         
	//   18   32:iaload          
	//   19   33:istore_3        
			cmaptounicode.addChar(map.get(k), Utilities.convertFromUtf32(k));
	//   20   34:aload           4
	//   21   36:aload_0         
	//   22   37:getfield        #18  <Field IntHashtable map>
	//   23   40:iload_3         
	//   24   41:invokevirtual   #64  <Method int IntHashtable.get(int)>
	//   25   44:iload_3         
	//   26   45:invokestatic    #68  <Method String Utilities.convertFromUtf32(int)>
	//   27   48:invokevirtual   #71  <Method void CMapToUnicode.addChar(int, String)>
		}

	//   28   51:iload_1         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore_1        
	//*  32   55:goto            24
		return cmaptounicode;
	//   33   58:aload           4
	//   34   60:areturn         
	}

	public int lookup(int i)
	{
		return map.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IntHashtable map>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #64  <Method int IntHashtable.get(int)>
	//    4    8:ireturn         
	}

	private IntHashtable map;
}
