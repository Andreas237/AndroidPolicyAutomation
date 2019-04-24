// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStream, BaseFont, PdfName, PdfNumber

static class BaseFont$StreamFont extends PdfStream
{

	public BaseFont$StreamFont(byte abyte0[], String s, int i)
		throws DocumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfStream()>
		try
		{
			bytes = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field byte[] bytes>
			put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(bytes.length))));
	//    5    9:aload_0         
	//    6   10:getstatic       #26  <Field PdfName PdfName.LENGTH>
	//    7   13:new             #28  <Class PdfNumber>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #20  <Field byte[] bytes>
	//   11   21:arraylength     
	//   12   22:invokespecial   #31  <Method void PdfNumber(int)>
	//   13   25:invokevirtual   #35  <Method void put(PdfName, PdfObject)>
		}
	//*  14   28:aload_2         
	//*  15   29:ifnull          47
	//*  16   32:aload_0         
	//*  17   33:getstatic       #38  <Field PdfName PdfName.SUBTYPE>
	//*  18   36:new             #22  <Class PdfName>
	//*  19   39:dup             
	//*  20   40:aload_2         
	//*  21   41:invokespecial   #41  <Method void PdfName(String)>
	//*  22   44:invokevirtual   #35  <Method void put(PdfName, PdfObject)>
	//*  23   47:aload_0         
	//*  24   48:iload_3         
	//*  25   49:invokevirtual   #44  <Method void flateCompress(int)>
	//*  26   52:return          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  27   53:astore_1        
		{
			throw new DocumentException(((Exception) (abyte0)));
	//   28   54:new             #11  <Class DocumentException>
	//   29   57:dup             
	//   30   58:aload_1         
	//   31   59:invokespecial   #47  <Method void DocumentException(Exception)>
	//   32   62:athrow          
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_47;
		put(PdfName.SUBTYPE, ((PdfObject) (new PdfName(s))));
		flateCompress(i);
		return;
	}

	public BaseFont$StreamFont(byte abyte0[], int ai[], int i)
		throws DocumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PdfStream()>
		int j;
		try
		{
			bytes = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field byte[] bytes>
			put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(bytes.length))));
	//    5    9:aload_0         
	//    6   10:getstatic       #26  <Field PdfName PdfName.LENGTH>
	//    7   13:new             #28  <Class PdfNumber>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #20  <Field byte[] bytes>
	//   11   21:arraylength     
	//   12   22:invokespecial   #31  <Method void PdfNumber(int)>
	//   13   25:invokevirtual   #35  <Method void put(PdfName, PdfObject)>
		}
	//*  14   28:iconst_0        
	//*  15   29:istore          4
	//*  16   31:iload           4
	//*  17   33:aload_2         
	//*  18   34:arraylength     
	//*  19   35:icmpge          91
	//*  20   38:aload_0         
	//*  21   39:new             #22  <Class PdfName>
	//*  22   42:dup             
	//*  23   43:new             #52  <Class StringBuilder>
	//*  24   46:dup             
	//*  25   47:invokespecial   #53  <Method void StringBuilder()>
	//*  26   50:ldc1            #55  <String "Length">
	//*  27   52:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  28   55:iload           4
	//*  29   57:iconst_1        
	//*  30   58:iadd            
	//*  31   59:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//*  32   62:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*  33   65:invokespecial   #41  <Method void PdfName(String)>
	//*  34   68:new             #28  <Class PdfNumber>
	//*  35   71:dup             
	//*  36   72:aload_2         
	//*  37   73:iload           4
	//*  38   75:iaload          
	//*  39   76:invokespecial   #31  <Method void PdfNumber(int)>
	//*  40   79:invokevirtual   #35  <Method void put(PdfName, PdfObject)>
	//*  41   82:iload           4
	//*  42   84:iconst_1        
	//*  43   85:iadd            
	//*  44   86:istore          4
	//*  45   88:goto            31
	//*  46   91:aload_0         
	//*  47   92:iload_3         
	//*  48   93:invokevirtual   #44  <Method void flateCompress(int)>
	//*  49   96:return          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  50   97:astore_1        
		{
			throw new DocumentException(((Exception) (abyte0)));
	//   51   98:new             #11  <Class DocumentException>
	//   52  101:dup             
	//   53  102:aload_1         
	//   54  103:invokespecial   #47  <Method void DocumentException(Exception)>
	//   55  106:athrow          
		}
		j = 0;
		if(j >= ai.length)
			break; /* Loop/switch isn't completed */
		put(new PdfName((new StringBuilder()).append("Length").append(j + 1).toString()), ((PdfObject) (new PdfNumber(ai[j]))));
		j++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_31;
_L1:
		flateCompress(i);
		return;
	}
}
