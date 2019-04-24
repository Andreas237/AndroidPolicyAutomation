// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfObject, PdfEncodings, PdfReader, PdfEncryption, 
//			PdfWriter, ByteBuffer, StringUtils

public class PdfString extends PdfObject
{

	public PdfString()
	{
		super(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #18  <Method void PdfObject(int)>
		value = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #20  <String "">
	//    5    8:putfield        #22  <Field String value>
		originalValue = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #24  <Field String originalValue>
		encoding = "PDF";
	//    9   16:aload_0         
	//   10   17:ldc1            #26  <String "PDF">
	//   11   19:putfield        #28  <Field String encoding>
		objNum = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #30  <Field int objNum>
		objGen = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #32  <Field int objGen>
		hexWriting = false;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #34  <Field boolean hexWriting>
	//   21   37:return          
	}

	public PdfString(String s)
	{
		super(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #18  <Method void PdfObject(int)>
		value = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #20  <String "">
	//    5    8:putfield        #22  <Field String value>
		originalValue = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #24  <Field String originalValue>
		encoding = "PDF";
	//    9   16:aload_0         
	//   10   17:ldc1            #26  <String "PDF">
	//   11   19:putfield        #28  <Field String encoding>
		objNum = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #30  <Field int objNum>
		objGen = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #32  <Field int objGen>
		hexWriting = false;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #34  <Field boolean hexWriting>
		value = s;
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:putfield        #22  <Field String value>
	//   24   42:return          
	}

	public PdfString(String s, String s1)
	{
		super(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #18  <Method void PdfObject(int)>
		value = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #20  <String "">
	//    5    8:putfield        #22  <Field String value>
		originalValue = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #24  <Field String originalValue>
		encoding = "PDF";
	//    9   16:aload_0         
	//   10   17:ldc1            #26  <String "PDF">
	//   11   19:putfield        #28  <Field String encoding>
		objNum = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #30  <Field int objNum>
		objGen = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #32  <Field int objGen>
		hexWriting = false;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #34  <Field boolean hexWriting>
		value = s;
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:putfield        #22  <Field String value>
		encoding = s1;
	//   24   42:aload_0         
	//   25   43:aload_2         
	//   26   44:putfield        #28  <Field String encoding>
	//   27   47:return          
	}

	public PdfString(byte abyte0[])
	{
		super(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #18  <Method void PdfObject(int)>
		value = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #20  <String "">
	//    5    8:putfield        #22  <Field String value>
		originalValue = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #24  <Field String originalValue>
		encoding = "PDF";
	//    9   16:aload_0         
	//   10   17:ldc1            #26  <String "PDF">
	//   11   19:putfield        #28  <Field String encoding>
		objNum = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #30  <Field int objNum>
		objGen = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #32  <Field int objGen>
		hexWriting = false;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #34  <Field boolean hexWriting>
		value = PdfEncodings.convertToString(abyte0, ((String) (null)));
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:aconst_null     
	//   24   40:invokestatic    #44  <Method String PdfEncodings.convertToString(byte[], String)>
	//   25   43:putfield        #22  <Field String value>
		encoding = "";
	//   26   46:aload_0         
	//   27   47:ldc1            #20  <String "">
	//   28   49:putfield        #28  <Field String encoding>
	//   29   52:return          
	}

	void decrypt(PdfReader pdfreader)
	{
		pdfreader = ((PdfReader) (pdfreader.getDecrypt()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method PdfEncryption PdfReader.getDecrypt()>
	//    2    4:astore_1        
		if(pdfreader != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          65
		{
			originalValue = value;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field String value>
	//    8   14:putfield        #24  <Field String originalValue>
			((PdfEncryption) (pdfreader)).setHashKey(objNum, objGen);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #30  <Field int objNum>
	//   12   22:aload_0         
	//   13   23:getfield        #32  <Field int objGen>
	//   14   26:invokevirtual   #58  <Method void PdfEncryption.setHashKey(int, int)>
			bytes = PdfEncodings.convertToBytes(value, ((String) (null)));
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #22  <Field String value>
	//   18   34:aconst_null     
	//   19   35:invokestatic    #62  <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//   20   38:putfield        #66  <Field byte[] bytes>
			bytes = ((PdfEncryption) (pdfreader)).decryptByteArray(bytes);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:getfield        #66  <Field byte[] bytes>
	//   25   47:invokevirtual   #70  <Method byte[] PdfEncryption.decryptByteArray(byte[])>
	//   26   50:putfield        #66  <Field byte[] bytes>
			value = PdfEncodings.convertToString(bytes, ((String) (null)));
	//   27   53:aload_0         
	//   28   54:aload_0         
	//   29   55:getfield        #66  <Field byte[] bytes>
	//   30   58:aconst_null     
	//   31   59:invokestatic    #44  <Method String PdfEncodings.convertToString(byte[], String)>
	//   32   62:putfield        #22  <Field String value>
		}
	//   33   65:return          
	}

	public byte[] getBytes()
	{
		if(bytes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field byte[] bytes>
	//*   2    4:ifnonnull       49
			if(encoding != null && encoding.equals("UnicodeBig") && PdfEncodings.isPdfDocEncoding(value))
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field String encoding>
	//*   5   11:ifnull          54
	//*   6   14:aload_0         
	//*   7   15:getfield        #28  <Field String encoding>
	//*   8   18:ldc1            #74  <String "UnicodeBig">
	//*   9   20:invokevirtual   #80  <Method boolean String.equals(Object)>
	//*  10   23:ifeq            54
	//*  11   26:aload_0         
	//*  12   27:getfield        #22  <Field String value>
	//*  13   30:invokestatic    #84  <Method boolean PdfEncodings.isPdfDocEncoding(String)>
	//*  14   33:ifeq            54
				bytes = PdfEncodings.convertToBytes(value, "PDF");
	//   15   36:aload_0         
	//   16   37:aload_0         
	//   17   38:getfield        #22  <Field String value>
	//   18   41:ldc1            #26  <String "PDF">
	//   19   43:invokestatic    #62  <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//   20   46:putfield        #66  <Field byte[] bytes>
			else
	//*  21   49:aload_0         
	//*  22   50:getfield        #66  <Field byte[] bytes>
	//*  23   53:areturn         
				bytes = PdfEncodings.convertToBytes(value, encoding);
	//   24   54:aload_0         
	//   25   55:aload_0         
	//   26   56:getfield        #22  <Field String value>
	//   27   59:aload_0         
	//   28   60:getfield        #28  <Field String encoding>
	//   29   63:invokestatic    #62  <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//   30   66:putfield        #66  <Field byte[] bytes>
		return bytes;
	//*  31   69:goto            49
	}

	public String getEncoding()
	{
		return encoding;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String encoding>
	//    2    4:areturn         
	}

	public byte[] getOriginalBytes()
	{
		if(originalValue == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field String originalValue>
	//*   2    4:ifnonnull       12
			return getBytes();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #89  <Method byte[] getBytes()>
	//    5   11:areturn         
		else
			return PdfEncodings.convertToBytes(originalValue, ((String) (null)));
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field String originalValue>
	//    8   16:aconst_null     
	//    9   17:invokestatic    #62  <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//   10   20:areturn         
	}

	public boolean isHexWriting()
	{
		return hexWriting;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean hexWriting>
	//    2    4:ireturn         
	}

	public PdfString setHexWriting(boolean flag)
	{
		hexWriting = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field boolean hexWriting>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	void setObjNum(int i, int j)
	{
		objNum = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int objNum>
		objGen = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #32  <Field int objGen>
	//    6   10:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		PdfWriter.checkPdfIsoConformance(pdfwriter, 11, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokestatic    #104 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		byte abyte0[] = getBytes();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #89  <Method byte[] getBytes()>
	//    6   11:astore          6
		PdfEncryption pdfencryption = null;
	//    7   13:aconst_null     
	//    8   14:astore          5
		if(pdfwriter != null)
	//*   9   16:aload_1         
	//*  10   17:ifnull          26
			pdfencryption = pdfwriter.getEncryption();
	//   11   20:aload_1         
	//   12   21:invokevirtual   #107 <Method PdfEncryption PdfWriter.getEncryption()>
	//   13   24:astore          5
		pdfwriter = ((PdfWriter) (abyte0));
	//   14   26:aload           6
	//   15   28:astore_1        
		if(pdfencryption != null)
	//*  16   29:aload           5
	//*  17   31:ifnull          53
		{
			pdfwriter = ((PdfWriter) (abyte0));
	//   18   34:aload           6
	//   19   36:astore_1        
			if(!pdfencryption.isEmbeddedFilesOnly())
	//*  20   37:aload           5
	//*  21   39:invokevirtual   #110 <Method boolean PdfEncryption.isEmbeddedFilesOnly()>
	//*  22   42:ifne            53
				pdfwriter = ((PdfWriter) (pdfencryption.encryptByteArray(abyte0)));
	//   23   45:aload           5
	//   24   47:aload           6
	//   25   49:invokevirtual   #113 <Method byte[] PdfEncryption.encryptByteArray(byte[])>
	//   26   52:astore_1        
		}
		if(hexWriting)
	//*  27   53:aload_0         
	//*  28   54:getfield        #34  <Field boolean hexWriting>
	//*  29   57:ifeq            123
		{
			ByteBuffer bytebuffer = new ByteBuffer();
	//   30   60:new             #115 <Class ByteBuffer>
	//   31   63:dup             
	//   32   64:invokespecial   #117 <Method void ByteBuffer()>
	//   33   67:astore          5
			bytebuffer.append('<');
	//   34   69:aload           5
	//   35   71:bipush          60
	//   36   73:invokevirtual   #121 <Method ByteBuffer ByteBuffer.append(char)>
	//   37   76:pop             
			int j = pdfwriter.length;
	//   38   77:aload_1         
	//   39   78:arraylength     
	//   40   79:istore          4
			for(int i = 0; i < j; i++)
	//*  41   81:iconst_0        
	//*  42   82:istore_3        
	//*  43   83:iload_3         
	//*  44   84:iload           4
	//*  45   86:icmpge          105
				bytebuffer.appendHex(pdfwriter[i]);
	//   46   89:aload           5
	//   47   91:aload_1         
	//   48   92:iload_3         
	//   49   93:baload          
	//   50   94:invokevirtual   #125 <Method ByteBuffer ByteBuffer.appendHex(byte)>
	//   51   97:pop             

	//   52   98:iload_3         
	//   53   99:iconst_1        
	//   54  100:iadd            
	//   55  101:istore_3        
	//*  56  102:goto            83
			bytebuffer.append('>');
	//   57  105:aload           5
	//   58  107:bipush          62
	//   59  109:invokevirtual   #121 <Method ByteBuffer ByteBuffer.append(char)>
	//   60  112:pop             
			outputstream.write(bytebuffer.toByteArray());
	//   61  113:aload_2         
	//   62  114:aload           5
	//   63  116:invokevirtual   #128 <Method byte[] ByteBuffer.toByteArray()>
	//   64  119:invokevirtual   #133 <Method void OutputStream.write(byte[])>
			return;
	//   65  122:return          
		} else
		{
			outputstream.write(StringUtils.escapeString(((byte []) (pdfwriter))));
	//   66  123:aload_2         
	//   67  124:aload_1         
	//   68  125:invokestatic    #138 <Method byte[] StringUtils.escapeString(byte[])>
	//   69  128:invokevirtual   #133 <Method void OutputStream.write(byte[])>
			return;
	//   70  131:return          
		}
	}

	public String toString()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String value>
	//    2    4:areturn         
	}

	public String toUnicodeString()
	{
		if(encoding != null && encoding.length() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field String encoding>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field String encoding>
	//*   5   11:invokevirtual   #145 <Method int String.length()>
	//*   6   14:ifeq            22
			return value;
	//    7   17:aload_0         
	//    8   18:getfield        #22  <Field String value>
	//    9   21:areturn         
		getBytes();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #89  <Method byte[] getBytes()>
	//   12   26:pop             
		if(bytes.length >= 2 && bytes[0] == -2 && bytes[1] == -1)
	//*  13   27:aload_0         
	//*  14   28:getfield        #66  <Field byte[] bytes>
	//*  15   31:arraylength     
	//*  16   32:iconst_2        
	//*  17   33:icmplt          67
	//*  18   36:aload_0         
	//*  19   37:getfield        #66  <Field byte[] bytes>
	//*  20   40:iconst_0        
	//*  21   41:baload          
	//*  22   42:bipush          -2
	//*  23   44:icmpne          67
	//*  24   47:aload_0         
	//*  25   48:getfield        #66  <Field byte[] bytes>
	//*  26   51:iconst_1        
	//*  27   52:baload          
	//*  28   53:iconst_m1       
	//*  29   54:icmpne          67
			return PdfEncodings.convertToString(bytes, "UnicodeBig");
	//   30   57:aload_0         
	//   31   58:getfield        #66  <Field byte[] bytes>
	//   32   61:ldc1            #74  <String "UnicodeBig">
	//   33   63:invokestatic    #44  <Method String PdfEncodings.convertToString(byte[], String)>
	//   34   66:areturn         
		else
			return PdfEncodings.convertToString(bytes, "PDF");
	//   35   67:aload_0         
	//   36   68:getfield        #66  <Field byte[] bytes>
	//   37   71:ldc1            #26  <String "PDF">
	//   38   73:invokestatic    #44  <Method String PdfEncodings.convertToString(byte[], String)>
	//   39   76:areturn         
	}

	protected String encoding;
	protected boolean hexWriting;
	protected int objGen;
	protected int objNum;
	protected String originalValue;
	protected String value;
}
