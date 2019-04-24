// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			FilterHandlers, PdfName, PdfObject, PdfDictionary

private static class FilterHandlers$Filter_RUNLENGTHDECODE
	implements FilterHandlers.FilterHandler
{

	public byte[] decode(byte abyte0[], PdfName pdfname, PdfObject pdfobject, PdfDictionary pdfdictionary)
		throws IOException
	{
		int i;
		pdfname = ((PdfName) (new ByteArrayOutputStream()));
	//    0    0:new             #22  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		i = 0;
	//    4    8:iconst_0        
	//    5    9:istore          5
_L2:
		byte byte0;
label0:
		{
			if(i < abyte0.length)
	//*   6   11:iload           5
	//*   7   13:aload_1         
	//*   8   14:arraylength     
	//*   9   15:icmpge          31
			{
				byte0 = abyte0[i];
	//   10   18:aload_1         
	//   11   19:iload           5
	//   12   21:baload          
	//   13   22:istore          8
				if(byte0 != -128)
					break label0;
	//   14   24:iload           8
	//   15   26:bipush          -128
	//   16   28:icmpne          36
			}
			return ((ByteArrayOutputStream) (pdfname)).toByteArray();
	//   17   31:aload_2         
	//   18   32:invokevirtual   #27  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   19   35:areturn         
		}
		if(byte0 < 0 || byte0 > 127)
			break; /* Loop/switch isn't completed */
	//   20   36:iload           8
	//   21   38:iflt            79
	//   22   41:iload           8
	//   23   43:bipush          127
	//   24   45:icmpgt          79
		int j = byte0 + 1;
	//   25   48:iload           8
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:istore          6
		((ByteArrayOutputStream) (pdfname)).write(abyte0, i, j);
	//   29   54:aload_2         
	//   30   55:aload_1         
	//   31   56:iload           5
	//   32   58:iload           6
	//   33   60:invokevirtual   #31  <Method void ByteArrayOutputStream.write(byte[], int, int)>
		i += j;
	//   34   63:iload           5
	//   35   65:iload           6
	//   36   67:iadd            
	//   37   68:istore          5
_L4:
		i++;
	//   38   70:iload           5
	//   39   72:iconst_1        
	//   40   73:iadd            
	//   41   74:istore          5
		if(true) goto _L2; else goto _L1
	//   42   76:goto            11
_L1:
		int k;
		int l;
		l = i + 1;
	//   43   79:iload           5
	//   44   81:iconst_1        
	//   45   82:iadd            
	//   46   83:istore          7
		k = 0;
	//   47   85:iconst_0        
	//   48   86:istore          6
_L5:
		i = l;
	//   49   88:iload           7
	//   50   90:istore          5
		if(k >= 1 - byte0) goto _L4; else goto _L3
	//   51   92:iload           6
	//   52   94:iconst_1        
	//   53   95:iload           8
	//   54   97:isub            
	//   55   98:icmpge          70
_L3:
		((ByteArrayOutputStream) (pdfname)).write(((int) (abyte0[l])));
	//   56  101:aload_2         
	//   57  102:aload_1         
	//   58  103:iload           7
	//   59  105:baload          
	//   60  106:invokevirtual   #34  <Method void ByteArrayOutputStream.write(int)>
		k++;
	//   61  109:iload           6
	//   62  111:iconst_1        
	//   63  112:iadd            
	//   64  113:istore          6
		  goto _L5
	//*  65  115:goto            88
	}

	private FilterHandlers$Filter_RUNLENGTHDECODE()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	FilterHandlers$Filter_RUNLENGTHDECODE(FilterHandlers._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void FilterHandlers$Filter_RUNLENGTHDECODE()>
	//    2    4:return          
	}
}
