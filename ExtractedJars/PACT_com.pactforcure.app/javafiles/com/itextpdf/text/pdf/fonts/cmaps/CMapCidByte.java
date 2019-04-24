// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import com.itextpdf.text.pdf.*;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf.fonts.cmaps:
//			AbstractCMap

public class CMapCidByte extends AbstractCMap
{

	public CMapCidByte()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AbstractCMap()>
		map = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void HashMap()>
	//    6   12:putfield        #18  <Field HashMap map>
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:newarray        byte[]
	//   10   19:putfield        #20  <Field byte[] EMPTY>
	//   11   22:return          
	}

	void addChar(PdfString pdfstring, PdfObject pdfobject)
	{
		if(!(pdfobject instanceof PdfNumber))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #25  <Class PdfNumber>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			pdfstring = ((PdfString) (decodeStringToByte(pdfstring)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #29  <Method byte[] decodeStringToByte(PdfString)>
	//    6   12:astore_1        
			map.put(((Object) (Integer.valueOf(((PdfNumber)pdfobject).intValue()))), ((Object) (pdfstring)));
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field HashMap map>
	//    9   17:aload_2         
	//   10   18:checkcast       #25  <Class PdfNumber>
	//   11   21:invokevirtual   #33  <Method int PdfNumber.intValue()>
	//   12   24:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #43  <Method Object HashMap.put(Object, Object)>
	//   15   31:pop             
			return;
	//   16   32:return          
		}
	}

	public byte[] lookup(int i)
	{
		byte abyte1[] = (byte[])map.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field HashMap map>
	//    2    4:iload_1         
	//    3    5:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #49  <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #50  <Class byte[]>
	//    6   14:astore_3        
		byte abyte0[] = abyte1;
	//    7   15:aload_3         
	//    8   16:astore_2        
		if(abyte1 == null)
	//*   9   17:aload_3         
	//*  10   18:ifnonnull       26
			abyte0 = EMPTY;
	//   11   21:aload_0         
	//   12   22:getfield        #20  <Field byte[] EMPTY>
	//   13   25:astore_2        
		return abyte0;
	//   14   26:aload_2         
	//   15   27:areturn         
	}

	private final byte EMPTY[] = new byte[0];
	private HashMap map;
}
