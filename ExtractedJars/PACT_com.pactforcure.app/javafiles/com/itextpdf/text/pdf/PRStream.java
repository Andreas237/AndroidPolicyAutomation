// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.ExceptionConverter;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStream, PdfName, PdfNumber, PdfReader, 
//			PdfWriter, PdfEncryption, PdfDictionary

public class PRStream extends PdfStream
{

	public PRStream(PRStream prstream, PdfDictionary pdfdictionary)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void PdfStream()>
		objNum = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int objNum>
		objGen = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #21  <Field int objGen>
		reader = prstream.reader;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #23  <Field PdfReader reader>
	//   11   19:putfield        #23  <Field PdfReader reader>
		offset = prstream.offset;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #25  <Field long offset>
	//   15   27:putfield        #25  <Field long offset>
		length = prstream.length;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #27  <Field int length>
	//   19   35:putfield        #27  <Field int length>
		compressed = prstream.compressed;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #31  <Field boolean compressed>
	//   23   43:putfield        #31  <Field boolean compressed>
		compressionLevel = prstream.compressionLevel;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #34  <Field int compressionLevel>
	//   27   51:putfield        #34  <Field int compressionLevel>
		streamBytes = prstream.streamBytes;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #38  <Field ByteArrayOutputStream streamBytes>
	//   31   59:putfield        #38  <Field ByteArrayOutputStream streamBytes>
		bytes = prstream.bytes;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:getfield        #42  <Field byte[] bytes>
	//   35   67:putfield        #42  <Field byte[] bytes>
		objNum = prstream.objNum;
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:getfield        #19  <Field int objNum>
	//   39   75:putfield        #19  <Field int objNum>
		objGen = prstream.objGen;
	//   40   78:aload_0         
	//   41   79:aload_1         
	//   42   80:getfield        #21  <Field int objGen>
	//   43   83:putfield        #21  <Field int objGen>
		if(pdfdictionary != null)
	//*  44   86:aload_2         
	//*  45   87:ifnull          96
		{
			putAll(pdfdictionary);
	//   46   90:aload_0         
	//   47   91:aload_2         
	//   48   92:invokevirtual   #46  <Method void putAll(PdfDictionary)>
			return;
	//   49   95:return          
		} else
		{
			hashMap.putAll(((java.util.Map) (prstream.hashMap)));
	//   50   96:aload_0         
	//   51   97:getfield        #50  <Field LinkedHashMap hashMap>
	//   52  100:aload_1         
	//   53  101:getfield        #50  <Field LinkedHashMap hashMap>
	//   54  104:invokevirtual   #55  <Method void LinkedHashMap.putAll(java.util.Map)>
			return;
	//   55  107:return          
		}
	}

	public PRStream(PRStream prstream, PdfDictionary pdfdictionary, PdfReader pdfreader)
	{
		this(prstream, pdfdictionary);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #59  <Method void PRStream(PRStream, PdfDictionary)>
		reader = pdfreader;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #23  <Field PdfReader reader>
	//    7   11:return          
	}

	public PRStream(PdfReader pdfreader, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void PdfStream()>
		objNum = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int objNum>
		objGen = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #21  <Field int objGen>
		reader = pdfreader;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #23  <Field PdfReader reader>
		offset = l;
	//   11   19:aload_0         
	//   12   20:lload_2         
	//   13   21:putfield        #25  <Field long offset>
	//   14   24:return          
	}

	public PRStream(PdfReader pdfreader, byte abyte0[])
	{
		this(pdfreader, abyte0, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_m1       
	//    4    4:invokespecial   #64  <Method void PRStream(PdfReader, byte[], int)>
	//    5    7:return          
	}

	public PRStream(PdfReader pdfreader, byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void PdfStream()>
		objNum = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int objNum>
		objGen = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #21  <Field int objGen>
		reader = pdfreader;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #23  <Field PdfReader reader>
		offset = -1L;
	//   11   19:aload_0         
	//   12   20:ldc2w           #67  <Long -1L>
	//   13   23:putfield        #25  <Field long offset>
		if(Document.compress)
	//*  14   26:getstatic       #73  <Field boolean Document.compress>
	//*  15   29:ifeq            116
		{
			try
			{
				pdfreader = ((PdfReader) (new ByteArrayOutputStream()));
	//   16   32:new             #75  <Class ByteArrayOutputStream>
	//   17   35:dup             
	//   18   36:invokespecial   #76  <Method void ByteArrayOutputStream()>
	//   19   39:astore_1        
				Deflater deflater = new Deflater(i);
	//   20   40:new             #78  <Class Deflater>
	//   21   43:dup             
	//   22   44:iload_3         
	//   23   45:invokespecial   #81  <Method void Deflater(int)>
	//   24   48:astore          4
				DeflaterOutputStream deflateroutputstream = new DeflaterOutputStream(((OutputStream) (pdfreader)), deflater);
	//   25   50:new             #83  <Class DeflaterOutputStream>
	//   26   53:dup             
	//   27   54:aload_1         
	//   28   55:aload           4
	//   29   57:invokespecial   #86  <Method void DeflaterOutputStream(OutputStream, Deflater)>
	//   30   60:astore          5
				deflateroutputstream.write(abyte0);
	//   31   62:aload           5
	//   32   64:aload_2         
	//   33   65:invokevirtual   #90  <Method void DeflaterOutputStream.write(byte[])>
				deflateroutputstream.close();
	//   34   68:aload           5
	//   35   70:invokevirtual   #93  <Method void DeflaterOutputStream.close()>
				deflater.end();
	//   36   73:aload           4
	//   37   75:invokevirtual   #96  <Method void Deflater.end()>
				bytes = ((ByteArrayOutputStream) (pdfreader)).toByteArray();
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:invokevirtual   #100 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   41   83:putfield        #42  <Field byte[] bytes>
			}
	//*  42   86:aload_0         
	//*  43   87:getstatic       #106 <Field PdfName PdfName.FILTER>
	//*  44   90:getstatic       #109 <Field PdfName PdfName.FLATEDECODE>
	//*  45   93:invokevirtual   #113 <Method void put(PdfName, PdfObject)>
	//*  46   96:aload_0         
	//*  47   97:aload_0         
	//*  48   98:getfield        #42  <Field byte[] bytes>
	//*  49  101:arraylength     
	//*  50  102:invokevirtual   #116 <Method void setLength(int)>
	//*  51  105:return          
			// Misplaced declaration of an exception variable
			catch(PdfReader pdfreader)
	//*  52  106:astore_1        
			{
				throw new ExceptionConverter(((Exception) (pdfreader)));
	//   53  107:new             #118 <Class ExceptionConverter>
	//   54  110:dup             
	//   55  111:aload_1         
	//   56  112:invokespecial   #121 <Method void ExceptionConverter(Exception)>
	//   57  115:athrow          
			}
			put(PdfName.FILTER, ((PdfObject) (PdfName.FLATEDECODE)));
		} else
		{
			bytes = abyte0;
	//   58  116:aload_0         
	//   59  117:aload_2         
	//   60  118:putfield        #42  <Field byte[] bytes>
		}
		setLength(bytes.length);
	//*  61  121:goto            96
	}

	public byte[] getBytes()
	{
		return bytes;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field byte[] bytes>
	//    2    4:areturn         
	}

	public int getLength()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int length>
	//    2    4:ireturn         
	}

	int getObjGen()
	{
		return objGen;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int objGen>
	//    2    4:ireturn         
	}

	int getObjNum()
	{
		return objNum;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int objNum>
	//    2    4:ireturn         
	}

	public long getOffset()
	{
		return offset;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field long offset>
	//    2    4:lreturn         
	}

	public PdfReader getReader()
	{
		return reader;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfReader reader>
	//    2    4:areturn         
	}

	public void setData(byte abyte0[])
	{
		setData(abyte0, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #134 <Method void setData(byte[], boolean)>
	//    4    6:return          
	}

	public void setData(byte abyte0[], boolean flag)
	{
		setData(abyte0, flag, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:invokevirtual   #137 <Method void setData(byte[], boolean, int)>
	//    5    7:return          
	}

	public void setData(byte abyte0[], boolean flag, int i)
	{
		remove(PdfName.FILTER);
	//    0    0:aload_0         
	//    1    1:getstatic       #106 <Field PdfName PdfName.FILTER>
	//    2    4:invokevirtual   #141 <Method void remove(PdfName)>
		offset = -1L;
	//    3    7:aload_0         
	//    4    8:ldc2w           #67  <Long -1L>
	//    5   11:putfield        #25  <Field long offset>
		if(Document.compress && flag)
	//*   6   14:getstatic       #73  <Field boolean Document.compress>
	//*   7   17:ifeq            116
	//*   8   20:iload_2         
	//*   9   21:ifeq            116
		{
			try
			{
				ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   10   24:new             #75  <Class ByteArrayOutputStream>
	//   11   27:dup             
	//   12   28:invokespecial   #76  <Method void ByteArrayOutputStream()>
	//   13   31:astore          4
				Deflater deflater = new Deflater(i);
	//   14   33:new             #78  <Class Deflater>
	//   15   36:dup             
	//   16   37:iload_3         
	//   17   38:invokespecial   #81  <Method void Deflater(int)>
	//   18   41:astore          5
				DeflaterOutputStream deflateroutputstream = new DeflaterOutputStream(((OutputStream) (bytearrayoutputstream)), deflater);
	//   19   43:new             #83  <Class DeflaterOutputStream>
	//   20   46:dup             
	//   21   47:aload           4
	//   22   49:aload           5
	//   23   51:invokespecial   #86  <Method void DeflaterOutputStream(OutputStream, Deflater)>
	//   24   54:astore          6
				deflateroutputstream.write(abyte0);
	//   25   56:aload           6
	//   26   58:aload_1         
	//   27   59:invokevirtual   #90  <Method void DeflaterOutputStream.write(byte[])>
				deflateroutputstream.close();
	//   28   62:aload           6
	//   29   64:invokevirtual   #93  <Method void DeflaterOutputStream.close()>
				deflater.end();
	//   30   67:aload           5
	//   31   69:invokevirtual   #96  <Method void Deflater.end()>
				bytes = bytearrayoutputstream.toByteArray();
	//   32   72:aload_0         
	//   33   73:aload           4
	//   34   75:invokevirtual   #100 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   35   78:putfield        #42  <Field byte[] bytes>
				compressionLevel = i;
	//   36   81:aload_0         
	//   37   82:iload_3         
	//   38   83:putfield        #34  <Field int compressionLevel>
			}
	//*  39   86:aload_0         
	//*  40   87:getstatic       #106 <Field PdfName PdfName.FILTER>
	//*  41   90:getstatic       #109 <Field PdfName PdfName.FLATEDECODE>
	//*  42   93:invokevirtual   #113 <Method void put(PdfName, PdfObject)>
	//*  43   96:aload_0         
	//*  44   97:aload_0         
	//*  45   98:getfield        #42  <Field byte[] bytes>
	//*  46  101:arraylength     
	//*  47  102:invokevirtual   #116 <Method void setLength(int)>
	//*  48  105:return          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  49  106:astore_1        
			{
				throw new ExceptionConverter(((Exception) (abyte0)));
	//   50  107:new             #118 <Class ExceptionConverter>
	//   51  110:dup             
	//   52  111:aload_1         
	//   53  112:invokespecial   #121 <Method void ExceptionConverter(Exception)>
	//   54  115:athrow          
			}
			put(PdfName.FILTER, ((PdfObject) (PdfName.FLATEDECODE)));
		} else
		{
			bytes = abyte0;
	//   55  116:aload_0         
	//   56  117:aload_1         
	//   57  118:putfield        #42  <Field byte[] bytes>
		}
		setLength(bytes.length);
	//*  58  121:goto            96
	}

	public void setDataRaw(byte abyte0[])
	{
		offset = -1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #67  <Long -1L>
	//    2    4:putfield        #25  <Field long offset>
		bytes = abyte0;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #42  <Field byte[] bytes>
		setLength(bytes.length);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field byte[] bytes>
	//    9   17:arraylength     
	//   10   18:invokevirtual   #116 <Method void setLength(int)>
	//   11   21:return          
	}

	public void setLength(int i)
	{
		length = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int length>
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(i))));
	//    3    5:aload_0         
	//    4    6:getstatic       #145 <Field PdfName PdfName.LENGTH>
	//    5    9:new             #147 <Class PdfNumber>
	//    6   12:dup             
	//    7   13:iload_1         
	//    8   14:invokespecial   #148 <Method void PdfNumber(int)>
	//    9   17:invokevirtual   #113 <Method void put(PdfName, PdfObject)>
	//   10   20:return          
	}

	public void setObjNum(int i, int j)
	{
		objNum = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field int objNum>
		objGen = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int objGen>
	//    6   10:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		byte abyte0[] = PdfReader.getStreamBytesRaw(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #158 <Method byte[] PdfReader.getStreamBytesRaw(PRStream)>
	//    2    4:astore          6
		PdfEncryption pdfencryption = null;
	//    3    6:aconst_null     
	//    4    7:astore          5
		if(pdfwriter != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
			pdfencryption = pdfwriter.getEncryption();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #164 <Method PdfEncryption PdfWriter.getEncryption()>
	//    9   17:astore          5
		PdfObject pdfobject = get(PdfName.LENGTH);
	//   10   19:aload_0         
	//   11   20:getstatic       #145 <Field PdfName PdfName.LENGTH>
	//   12   23:invokevirtual   #168 <Method PdfObject get(PdfName)>
	//   13   26:astore          7
		int j = abyte0.length;
	//   14   28:aload           6
	//   15   30:arraylength     
	//   16   31:istore          4
		int i = j;
	//   17   33:iload           4
	//   18   35:istore_3        
		if(pdfencryption != null)
	//*  19   36:aload           5
	//*  20   38:ifnull          49
			i = pdfencryption.calculateStreamSize(j);
	//   21   41:aload           5
	//   22   43:iload           4
	//   23   45:invokevirtual   #174 <Method int PdfEncryption.calculateStreamSize(int)>
	//   24   48:istore_3        
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(i))));
	//   25   49:aload_0         
	//   26   50:getstatic       #145 <Field PdfName PdfName.LENGTH>
	//   27   53:new             #147 <Class PdfNumber>
	//   28   56:dup             
	//   29   57:iload_3         
	//   30   58:invokespecial   #148 <Method void PdfNumber(int)>
	//   31   61:invokevirtual   #113 <Method void put(PdfName, PdfObject)>
		superToPdf(pdfwriter, outputstream);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:aload_2         
	//   35   67:invokevirtual   #177 <Method void superToPdf(PdfWriter, OutputStream)>
		put(PdfName.LENGTH, pdfobject);
	//   36   70:aload_0         
	//   37   71:getstatic       #145 <Field PdfName PdfName.LENGTH>
	//   38   74:aload           7
	//   39   76:invokevirtual   #113 <Method void put(PdfName, PdfObject)>
		outputstream.write(STARTSTREAM);
	//   40   79:aload_2         
	//   41   80:getstatic       #180 <Field byte[] STARTSTREAM>
	//   42   83:invokevirtual   #183 <Method void OutputStream.write(byte[])>
		if(length > 0)
	//*  43   86:aload_0         
	//*  44   87:getfield        #27  <Field int length>
	//*  45   90:ifle            125
		{
			pdfwriter = ((PdfWriter) (abyte0));
	//   46   93:aload           6
	//   47   95:astore_1        
			if(pdfencryption != null)
	//*  48   96:aload           5
	//*  49   98:ifnull          120
			{
				pdfwriter = ((PdfWriter) (abyte0));
	//   50  101:aload           6
	//   51  103:astore_1        
				if(!pdfencryption.isEmbeddedFilesOnly())
	//*  52  104:aload           5
	//*  53  106:invokevirtual   #187 <Method boolean PdfEncryption.isEmbeddedFilesOnly()>
	//*  54  109:ifne            120
					pdfwriter = ((PdfWriter) (pdfencryption.encryptByteArray(abyte0)));
	//   55  112:aload           5
	//   56  114:aload           6
	//   57  116:invokevirtual   #191 <Method byte[] PdfEncryption.encryptByteArray(byte[])>
	//   58  119:astore_1        
			}
			outputstream.write(((byte []) (pdfwriter)));
	//   59  120:aload_2         
	//   60  121:aload_1         
	//   61  122:invokevirtual   #183 <Method void OutputStream.write(byte[])>
		}
		outputstream.write(ENDSTREAM);
	//   62  125:aload_2         
	//   63  126:getstatic       #194 <Field byte[] ENDSTREAM>
	//   64  129:invokevirtual   #183 <Method void OutputStream.write(byte[])>
	//   65  132:return          
	}

	protected int length;
	protected int objGen;
	protected int objNum;
	protected long offset;
	protected PdfReader reader;
}
