// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import com.itextpdf.text.pdf.*;

public abstract class AbstractCMap
{

	public AbstractCMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	private static int byteArrayToInt(byte abyte0[])
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int i = 0; i < abyte0.length; i++)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:arraylength     
	//*   7    7:icmpge          30
			j = j << 8 | abyte0[i] & 0xff;
	//    8   10:iload_2         
	//    9   11:bipush          8
	//   10   13:ishl            
	//   11   14:aload_0         
	//   12   15:iload_1         
	//   13   16:baload          
	//   14   17:sipush          255
	//   15   20:iand            
	//   16   21:ior             
	//   17   22:istore_2        

	//   18   23:iload_1         
	//   19   24:iconst_1        
	//   20   25:iadd            
	//   21   26:istore_1        
	//*  22   27:goto            4
		return j;
	//   23   30:iload_2         
	//   24   31:ireturn         
	}

	public static byte[] decodeStringToByte(PdfString pdfstring)
	{
		pdfstring = ((PdfString) (pdfstring.getBytes()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method byte[] PdfString.getBytes()>
	//    2    4:astore_0        
		byte abyte0[] = new byte[pdfstring.length];
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:newarray        byte[]
	//    6    9:astore_1        
		System.arraycopy(((Object) (pdfstring)), 0, ((Object) (abyte0)), 0, pdfstring.length);
	//    7   10:aload_0         
	//    8   11:iconst_0        
	//    9   12:aload_1         
	//   10   13:iconst_0        
	//   11   14:aload_0         
	//   12   15:arraylength     
	//   13   16:invokestatic    #31  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte0;
	//   14   19:aload_1         
	//   15   20:areturn         
	}

	private static void intToByteArray(int i, byte abyte0[])
	{
		int k = abyte0.length - 1;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:isub            
	//    4    4:istore_3        
		int j = i;
	//    5    5:iload_0         
	//    6    6:istore_2        
		for(i = k; i >= 0; i--)
	//*   7    7:iload_3         
	//*   8    8:istore_0        
	//*   9    9:iload_0         
	//*  10   10:iflt            30
		{
			abyte0[i] = (byte)j;
	//   11   13:aload_1         
	//   12   14:iload_0         
	//   13   15:iload_2         
	//   14   16:int2byte        
	//   15   17:bastore         
			j >>>= 8;
	//   16   18:iload_2         
	//   17   19:bipush          8
	//   18   21:iushr           
	//   19   22:istore_2        
		}

	//   20   23:iload_0         
	//   21   24:iconst_1        
	//   22   25:isub            
	//   23   26:istore_0        
	//*  24   27:goto            9
	//   25   30:return          
	}

	abstract void addChar(PdfString pdfstring, PdfObject pdfobject);

	void addRange(PdfString pdfstring, PdfString pdfstring1, PdfObject pdfobject)
	{
		byte abyte0[] = decodeStringToByte(pdfstring);
	//    0    0:aload_1         
	//    1    1:invokestatic    #39  <Method byte[] decodeStringToByte(PdfString)>
	//    2    4:astore          8
		pdfstring1 = ((PdfString) (decodeStringToByte(pdfstring1)));
	//    3    6:aload_2         
	//    4    7:invokestatic    #39  <Method byte[] decodeStringToByte(PdfString)>
	//    5   10:astore_2        
		if(abyte0.length != pdfstring1.length || abyte0.length == 0)
	//*   6   11:aload           8
	//*   7   13:arraylength     
	//*   8   14:aload_2         
	//*   9   15:arraylength     
	//*  10   16:icmpne          25
	//*  11   19:aload           8
	//*  12   21:arraylength     
	//*  13   22:ifne            35
			throw new IllegalArgumentException("Invalid map.");
	//   14   25:new             #41  <Class IllegalArgumentException>
	//   15   28:dup             
	//   16   29:ldc1            #43  <String "Invalid map.">
	//   17   31:invokespecial   #46  <Method void IllegalArgumentException(String)>
	//   18   34:athrow          
		pdfstring = null;
	//   19   35:aconst_null     
	//   20   36:astore_1        
		if(pdfobject instanceof PdfString)
	//*  21   37:aload_3         
	//*  22   38:instanceof      #21  <Class PdfString>
	//*  23   41:ifeq            52
			pdfstring = ((PdfString) (decodeStringToByte((PdfString)pdfobject)));
	//   24   44:aload_3         
	//   25   45:checkcast       #21  <Class PdfString>
	//   26   48:invokestatic    #39  <Method byte[] decodeStringToByte(PdfString)>
	//   27   51:astore_1        
		int j = byteArrayToInt(abyte0);
	//   28   52:aload           8
	//   29   54:invokestatic    #48  <Method int byteArrayToInt(byte[])>
	//   30   57:istore          5
		int k = byteArrayToInt(((byte []) (pdfstring1)));
	//   31   59:aload_2         
	//   32   60:invokestatic    #48  <Method int byteArrayToInt(byte[])>
	//   33   63:istore          6
		int i = j;
	//   34   65:iload           5
	//   35   67:istore          4
		while(i <= k) 
	//*  36   69:iload           4
	//*  37   71:iload           6
	//*  38   73:icmpgt          218
		{
			intToByteArray(i, abyte0);
	//   39   76:iload           4
	//   40   78:aload           8
	//   41   80:invokestatic    #50  <Method void intToByteArray(int, byte[])>
			pdfstring1 = new PdfString(abyte0);
	//   42   83:new             #21  <Class PdfString>
	//   43   86:dup             
	//   44   87:aload           8
	//   45   89:invokespecial   #53  <Method void PdfString(byte[])>
	//   46   92:astore_2        
			pdfstring1.setHexWriting(true);
	//   47   93:aload_2         
	//   48   94:iconst_1        
	//   49   95:invokevirtual   #57  <Method PdfString PdfString.setHexWriting(boolean)>
	//   50   98:pop             
			if(pdfobject instanceof PdfArray)
	//*  51   99:aload_3         
	//*  52  100:instanceof      #59  <Class PdfArray>
	//*  53  103:ifeq            132
				addChar(pdfstring1, ((PdfArray)pdfobject).getPdfObject(i - j));
	//   54  106:aload_0         
	//   55  107:aload_2         
	//   56  108:aload_3         
	//   57  109:checkcast       #59  <Class PdfArray>
	//   58  112:iload           4
	//   59  114:iload           5
	//   60  116:isub            
	//   61  117:invokevirtual   #63  <Method PdfObject PdfArray.getPdfObject(int)>
	//   62  120:invokevirtual   #65  <Method void addChar(PdfString, PdfObject)>
			else
	//*  63  123:iload           4
	//*  64  125:iconst_1        
	//*  65  126:iadd            
	//*  66  127:istore          4
	//*  67  129:goto            69
			if(pdfobject instanceof PdfNumber)
	//*  68  132:aload_3         
	//*  69  133:instanceof      #67  <Class PdfNumber>
	//*  70  136:ifeq            167
				addChar(pdfstring1, ((PdfObject) (new PdfNumber((((PdfNumber)pdfobject).intValue() + i) - j))));
	//   71  139:aload_0         
	//   72  140:aload_2         
	//   73  141:new             #67  <Class PdfNumber>
	//   74  144:dup             
	//   75  145:aload_3         
	//   76  146:checkcast       #67  <Class PdfNumber>
	//   77  149:invokevirtual   #71  <Method int PdfNumber.intValue()>
	//   78  152:iload           4
	//   79  154:iadd            
	//   80  155:iload           5
	//   81  157:isub            
	//   82  158:invokespecial   #74  <Method void PdfNumber(int)>
	//   83  161:invokevirtual   #65  <Method void addChar(PdfString, PdfObject)>
			else
	//*  84  164:goto            123
			if(pdfobject instanceof PdfString)
	//*  85  167:aload_3         
	//*  86  168:instanceof      #21  <Class PdfString>
	//*  87  171:ifeq            123
			{
				PdfString pdfstring2 = new PdfString(((byte []) (pdfstring)));
	//   88  174:new             #21  <Class PdfString>
	//   89  177:dup             
	//   90  178:aload_1         
	//   91  179:invokespecial   #53  <Method void PdfString(byte[])>
	//   92  182:astore          9
				pdfstring2.setHexWriting(true);
	//   93  184:aload           9
	//   94  186:iconst_1        
	//   95  187:invokevirtual   #57  <Method PdfString PdfString.setHexWriting(boolean)>
	//   96  190:pop             
				int l = pdfstring.length - 1;
	//   97  191:aload_1         
	//   98  192:arraylength     
	//   99  193:iconst_1        
	//  100  194:isub            
	//  101  195:istore          7
				pdfstring[l] = (byte)(pdfstring[l] + 1);
	//  102  197:aload_1         
	//  103  198:iload           7
	//  104  200:aload_1         
	//  105  201:iload           7
	//  106  203:baload          
	//  107  204:iconst_1        
	//  108  205:iadd            
	//  109  206:int2byte        
	//  110  207:bastore         
				addChar(pdfstring1, ((PdfObject) (pdfstring2)));
	//  111  208:aload_0         
	//  112  209:aload_2         
	//  113  210:aload           9
	//  114  212:invokevirtual   #65  <Method void addChar(PdfString, PdfObject)>
			}
			i++;
		}
	//* 115  215:goto            123
	//  116  218:return          
	}

	public String decodeStringToUnicode(PdfString pdfstring)
	{
		if(pdfstring.isHexWriting())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #80  <Method boolean PdfString.isHexWriting()>
	//*   2    4:ifeq            17
			return PdfEncodings.convertToString(pdfstring.getBytes(), "UnicodeBigUnmarked");
	//    3    7:aload_1         
	//    4    8:invokevirtual   #25  <Method byte[] PdfString.getBytes()>
	//    5   11:ldc1            #82  <String "UnicodeBigUnmarked">
	//    6   13:invokestatic    #88  <Method String PdfEncodings.convertToString(byte[], String)>
	//    7   16:areturn         
		else
			return pdfstring.toUnicodeString();
	//    8   17:aload_1         
	//    9   18:invokevirtual   #92  <Method String PdfString.toUnicodeString()>
	//   10   21:areturn         
	}

	public String getName()
	{
		return cmapName;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field String cmapName>
	//    2    4:areturn         
	}

	public String getOrdering()
	{
		return ordering;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String ordering>
	//    2    4:areturn         
	}

	public String getRegistry()
	{
		return registry;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String registry>
	//    2    4:areturn         
	}

	public int getSupplement()
	{
		return supplement;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int supplement>
	//    2    4:ireturn         
	}

	void setName(String s)
	{
		cmapName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field String cmapName>
	//    3    5:return          
	}

	void setOrdering(String s)
	{
		ordering = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field String ordering>
	//    3    5:return          
	}

	void setRegistry(String s)
	{
		registry = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #101 <Field String registry>
	//    3    5:return          
	}

	void setSupplement(int i)
	{
		supplement = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #104 <Field int supplement>
	//    3    5:return          
	}

	private String cmapName;
	private String ordering;
	private String registry;
	private int supplement;
}
