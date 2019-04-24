// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.*;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfWriter, PdfName, PdfNumber, 
//			PdfReader, PdfObject, PdfArray, PdfEncryption, 
//			OutputStreamCounter, OutputStreamEncryption, PdfIndirectReference

public class PdfStream extends PdfDictionary
{

	protected PdfStream()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void PdfDictionary()>
		compressed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #54  <Field boolean compressed>
		compressionLevel = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #56  <Field int compressionLevel>
		streamBytes = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #58  <Field ByteArrayOutputStream streamBytes>
		inputStreamLength = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #60  <Field int inputStreamLength>
		type = 7;
	//   14   24:aload_0         
	//   15   25:bipush          7
	//   16   27:putfield        #63  <Field int type>
	//   17   30:return          
	}

	public PdfStream(InputStream inputstream, PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void PdfDictionary()>
		compressed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #54  <Field boolean compressed>
		compressionLevel = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #56  <Field int compressionLevel>
		streamBytes = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #58  <Field ByteArrayOutputStream streamBytes>
		inputStreamLength = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #60  <Field int inputStreamLength>
		type = 7;
	//   14   24:aload_0         
	//   15   25:bipush          7
	//   16   27:putfield        #63  <Field int type>
		inputStream = inputstream;
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:putfield        #66  <Field InputStream inputStream>
		writer = pdfwriter;
	//   20   35:aload_0         
	//   21   36:aload_2         
	//   22   37:putfield        #68  <Field PdfWriter writer>
		ref = pdfwriter.getPdfIndirectReference();
	//   23   40:aload_0         
	//   24   41:aload_2         
	//   25   42:invokevirtual   #74  <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//   26   45:putfield        #76  <Field PdfIndirectReference ref>
		put(PdfName.LENGTH, ((PdfObject) (ref)));
	//   27   48:aload_0         
	//   28   49:getstatic       #82  <Field PdfName PdfName.LENGTH>
	//   29   52:aload_0         
	//   30   53:getfield        #76  <Field PdfIndirectReference ref>
	//   31   56:invokevirtual   #86  <Method void put(PdfName, PdfObject)>
	//   32   59:return          
	}

	public PdfStream(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void PdfDictionary()>
		compressed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #54  <Field boolean compressed>
		compressionLevel = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #56  <Field int compressionLevel>
		streamBytes = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #58  <Field ByteArrayOutputStream streamBytes>
		inputStreamLength = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #60  <Field int inputStreamLength>
		type = 7;
	//   14   24:aload_0         
	//   15   25:bipush          7
	//   16   27:putfield        #63  <Field int type>
		bytes = abyte0;
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:putfield        #90  <Field byte[] bytes>
		rawLength = abyte0.length;
	//   20   35:aload_0         
	//   21   36:aload_1         
	//   22   37:arraylength     
	//   23   38:putfield        #92  <Field int rawLength>
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(abyte0.length))));
	//   24   41:aload_0         
	//   25   42:getstatic       #82  <Field PdfName PdfName.LENGTH>
	//   26   45:new             #94  <Class PdfNumber>
	//   27   48:dup             
	//   28   49:aload_1         
	//   29   50:arraylength     
	//   30   51:invokespecial   #97  <Method void PdfNumber(int)>
	//   31   54:invokevirtual   #86  <Method void put(PdfName, PdfObject)>
	//   32   57:return          
	}

	public void flateCompress()
	{
		flateCompress(-1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:invokevirtual   #100 <Method void flateCompress(int)>
	//    3    5:return          
	}

	public void flateCompress(int i)
	{
	//*   0    0:getstatic       #107 <Field boolean Document.compress>
	//*   1    3:ifne            7
_L2:
		return;
	//    2    6:return          
		if(!Document.compress || compressed) goto _L2; else goto _L1
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field boolean compressed>
	//    5   11:ifne            6
_L1:
		Object obj;
		compressionLevel = i;
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:putfield        #56  <Field int compressionLevel>
		if(inputStream != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #66  <Field InputStream inputStream>
	//*  11   23:ifnull          32
		{
			compressed = true;
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:putfield        #54  <Field boolean compressed>
			return;
	//   15   31:return          
		}
		obj = ((Object) (PdfReader.getPdfObject(get(PdfName.FILTER))));
	//   16   32:aload_0         
	//   17   33:getstatic       #110 <Field PdfName PdfName.FILTER>
	//   18   36:invokevirtual   #114 <Method PdfObject get(PdfName)>
	//   19   39:invokestatic    #120 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   20   42:astore_2        
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   21   43:aload_2         
	//   22   44:ifnull          64
		if(!((PdfObject) (obj)).isName()) goto _L4; else goto _L3
	//   23   47:aload_2         
	//   24   48:invokevirtual   #126 <Method boolean PdfObject.isName()>
	//   25   51:ifeq            181
_L3:
		if(PdfName.FLATEDECODE.equals(obj)) goto _L2; else goto _L5
	//   26   54:getstatic       #129 <Field PdfName PdfName.FLATEDECODE>
	//   27   57:aload_2         
	//   28   58:invokevirtual   #133 <Method boolean PdfName.equals(Object)>
	//   29   61:ifne            6
_L5:
		ByteArrayOutputStream bytearrayoutputstream;
		Deflater deflater;
		DeflaterOutputStream deflateroutputstream;
		bytearrayoutputstream = new ByteArrayOutputStream();
	//   30   64:new             #135 <Class ByteArrayOutputStream>
	//   31   67:dup             
	//   32   68:invokespecial   #136 <Method void ByteArrayOutputStream()>
	//   33   71:astore_3        
		deflater = new Deflater(i);
	//   34   72:new             #138 <Class Deflater>
	//   35   75:dup             
	//   36   76:iload_1         
	//   37   77:invokespecial   #139 <Method void Deflater(int)>
	//   38   80:astore          4
		deflateroutputstream = new DeflaterOutputStream(((OutputStream) (bytearrayoutputstream)), deflater);
	//   39   82:new             #141 <Class DeflaterOutputStream>
	//   40   85:dup             
	//   41   86:aload_3         
	//   42   87:aload           4
	//   43   89:invokespecial   #144 <Method void DeflaterOutputStream(OutputStream, Deflater)>
	//   44   92:astore          5
		if(streamBytes == null) goto _L7; else goto _L6
	//   45   94:aload_0         
	//   46   95:getfield        #58  <Field ByteArrayOutputStream streamBytes>
	//   47   98:ifnull          219
_L6:
		streamBytes.writeTo(((OutputStream) (deflateroutputstream)));
	//   48  101:aload_0         
	//   49  102:getfield        #58  <Field ByteArrayOutputStream streamBytes>
	//   50  105:aload           5
	//   51  107:invokevirtual   #148 <Method void ByteArrayOutputStream.writeTo(OutputStream)>
_L8:
		deflateroutputstream.close();
	//   52  110:aload           5
	//   53  112:invokevirtual   #151 <Method void DeflaterOutputStream.close()>
		deflater.end();
	//   54  115:aload           4
	//   55  117:invokevirtual   #154 <Method void Deflater.end()>
		streamBytes = bytearrayoutputstream;
	//   56  120:aload_0         
	//   57  121:aload_3         
	//   58  122:putfield        #58  <Field ByteArrayOutputStream streamBytes>
		bytes = null;
	//   59  125:aload_0         
	//   60  126:aconst_null     
	//   61  127:putfield        #90  <Field byte[] bytes>
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(streamBytes.size()))));
	//   62  130:aload_0         
	//   63  131:getstatic       #82  <Field PdfName PdfName.LENGTH>
	//   64  134:new             #94  <Class PdfNumber>
	//   65  137:dup             
	//   66  138:aload_0         
	//   67  139:getfield        #58  <Field ByteArrayOutputStream streamBytes>
	//   68  142:invokevirtual   #158 <Method int ByteArrayOutputStream.size()>
	//   69  145:invokespecial   #97  <Method void PdfNumber(int)>
	//   70  148:invokevirtual   #86  <Method void put(PdfName, PdfObject)>
		if(obj != null)
			break MISSING_BLOCK_LABEL_231;
	//   71  151:aload_2         
	//   72  152:ifnonnull       231
		put(PdfName.FILTER, ((PdfObject) (PdfName.FLATEDECODE)));
	//   73  155:aload_0         
	//   74  156:getstatic       #110 <Field PdfName PdfName.FILTER>
	//   75  159:getstatic       #129 <Field PdfName PdfName.FLATEDECODE>
	//   76  162:invokevirtual   #86  <Method void put(PdfName, PdfObject)>
_L9:
		compressed = true;
	//   77  165:aload_0         
	//   78  166:iconst_1        
	//   79  167:putfield        #54  <Field boolean compressed>
		return;
	//   80  170:return          
	//*  81  171:astore_2        
	//*  82  172:new             #160 <Class ExceptionConverter>
	//*  83  175:dup             
	//*  84  176:aload_2         
	//*  85  177:invokespecial   #163 <Method void ExceptionConverter(Exception)>
	//*  86  180:athrow          
_L4:
		if(((PdfObject) (obj)).isArray())
	//*  87  181:aload_2         
	//*  88  182:invokevirtual   #166 <Method boolean PdfObject.isArray()>
	//*  89  185:ifeq            202
		{
			if(((PdfArray)obj).contains(((PdfObject) (PdfName.FLATEDECODE))))
	//*  90  188:aload_2         
	//*  91  189:checkcast       #168 <Class PdfArray>
	//*  92  192:getstatic       #129 <Field PdfName PdfName.FLATEDECODE>
	//*  93  195:invokevirtual   #172 <Method boolean PdfArray.contains(PdfObject)>
	//*  94  198:ifeq            64
				return;
	//   95  201:return          
		} else
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("stream.could.not.be.compressed.filter.is.not.a.name.or.array", new Object[0]));
	//   96  202:new             #174 <Class RuntimeException>
	//   97  205:dup             
	//   98  206:ldc1            #176 <String "stream.could.not.be.compressed.filter.is.not.a.name.or.array">
	//   99  208:iconst_0        
	//  100  209:anewarray       Object[]
	//  101  212:invokestatic    #184 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  102  215:invokespecial   #187 <Method void RuntimeException(String)>
	//  103  218:athrow          
		}
		  goto _L5
_L7:
		try
		{
			deflateroutputstream.write(bytes);
	//  104  219:aload           5
	//  105  221:aload_0         
	//  106  222:getfield        #90  <Field byte[] bytes>
	//  107  225:invokevirtual   #190 <Method void DeflaterOutputStream.write(byte[])>
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw new ExceptionConverter(((Exception) (obj)));
		}
		  goto _L8
	//* 108  228:goto            110
		obj = ((Object) (new PdfArray(((PdfObject) (obj)))));
	//  109  231:new             #168 <Class PdfArray>
	//  110  234:dup             
	//  111  235:aload_2         
	//  112  236:invokespecial   #193 <Method void PdfArray(PdfObject)>
	//  113  239:astore_2        
		((PdfArray) (obj)).add(0, ((PdfObject) (PdfName.FLATEDECODE)));
	//  114  240:aload_2         
	//  115  241:iconst_0        
	//  116  242:getstatic       #129 <Field PdfName PdfName.FLATEDECODE>
	//  117  245:invokevirtual   #197 <Method void PdfArray.add(int, PdfObject)>
		put(PdfName.FILTER, ((PdfObject) (obj)));
	//  118  248:aload_0         
	//  119  249:getstatic       #110 <Field PdfName PdfName.FILTER>
	//  120  252:aload_2         
	//  121  253:invokevirtual   #86  <Method void put(PdfName, PdfObject)>
		  goto _L9
	//* 122  256:goto            165
	}

	public int getRawLength()
	{
		return rawLength;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field int rawLength>
	//    2    4:ireturn         
	}

	protected void superToPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		super.toPdf(pdfwriter, outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #203 <Method void PdfDictionary.toPdf(PdfWriter, OutputStream)>
	//    4    6:return          
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		int i;
		Object obj;
		if(inputStream != null && compressed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field InputStream inputStream>
	//*   2    4:ifnull          24
	//*   3    7:aload_0         
	//*   4    8:getfield        #54  <Field boolean compressed>
	//*   5   11:ifeq            24
			put(PdfName.FILTER, ((PdfObject) (PdfName.FLATEDECODE)));
	//    6   14:aload_0         
	//    7   15:getstatic       #110 <Field PdfName PdfName.FILTER>
	//    8   18:getstatic       #129 <Field PdfName PdfName.FLATEDECODE>
	//    9   21:invokevirtual   #86  <Method void put(PdfName, PdfObject)>
		Object obj1 = null;
	//   10   24:aconst_null     
	//   11   25:astore          5
		if(pdfwriter != null)
	//*  12   27:aload_1         
	//*  13   28:ifnull          37
			obj1 = ((Object) (pdfwriter.getEncryption()));
	//   14   31:aload_1         
	//   15   32:invokevirtual   #208 <Method PdfEncryption PdfWriter.getEncryption()>
	//   16   35:astore          5
		obj = obj1;
	//   17   37:aload           5
	//   18   39:astore          4
		if(obj1 != null)
	//*  19   41:aload           5
	//*  20   43:ifnull          78
		{
			Object obj2 = ((Object) (get(PdfName.FILTER)));
	//   21   46:aload_0         
	//   22   47:getstatic       #110 <Field PdfName PdfName.FILTER>
	//   23   50:invokevirtual   #114 <Method PdfObject get(PdfName)>
	//   24   53:astore          6
			obj = obj1;
	//   25   55:aload           5
	//   26   57:astore          4
			Object obj3;
			OutputStreamCounter outputstreamcounter;
			Object obj4;
			if(obj2 != null)
	//*  27   59:aload           6
	//*  28   61:ifnull          78
				if(PdfName.CRYPT.equals(obj2))
	//*  29   64:getstatic       #211 <Field PdfName PdfName.CRYPT>
	//*  30   67:aload           6
	//*  31   69:invokevirtual   #133 <Method boolean PdfName.equals(Object)>
	//*  32   72:ifeq            348
				{
					obj = null;
	//   33   75:aconst_null     
	//   34   76:astore          4
				} else
	//*  35   78:aload_0         
	//*  36   79:getstatic       #82  <Field PdfName PdfName.LENGTH>
	//*  37   82:invokevirtual   #114 <Method PdfObject get(PdfName)>
	//*  38   85:astore          5
	//*  39   87:aload           4
	//*  40   89:ifnull          404
	//*  41   92:aload           5
	//*  42   94:ifnull          404
	//*  43   97:aload           5
	//*  44   99:invokevirtual   #214 <Method boolean PdfObject.isNumber()>
	//*  45  102:ifeq            404
	//*  46  105:aload           5
	//*  47  107:checkcast       #94  <Class PdfNumber>
	//*  48  110:invokevirtual   #217 <Method int PdfNumber.intValue()>
	//*  49  113:istore_3        
	//*  50  114:aload_0         
	//*  51  115:getstatic       #82  <Field PdfName PdfName.LENGTH>
	//*  52  118:new             #94  <Class PdfNumber>
	//*  53  121:dup             
	//*  54  122:aload           4
	//*  55  124:iload_3         
	//*  56  125:invokevirtual   #223 <Method int PdfEncryption.calculateStreamSize(int)>
	//*  57  128:invokespecial   #97  <Method void PdfNumber(int)>
	//*  58  131:invokevirtual   #86  <Method void put(PdfName, PdfObject)>
	//*  59  134:aload_0         
	//*  60  135:aload_1         
	//*  61  136:aload_2         
	//*  62  137:invokevirtual   #225 <Method void superToPdf(PdfWriter, OutputStream)>
	//*  63  140:aload_0         
	//*  64  141:getstatic       #82  <Field PdfName PdfName.LENGTH>
	//*  65  144:aload           5
	//*  66  146:invokevirtual   #86  <Method void put(PdfName, PdfObject)>
	//*  67  149:aload_1         
	//*  68  150:bipush          9
	//*  69  152:aload_0         
	//*  70  153:invokestatic    #229 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
	//*  71  156:aload_2         
	//*  72  157:getstatic       #42  <Field byte[] STARTSTREAM>
	//*  73  160:invokevirtual   #232 <Method void OutputStream.write(byte[])>
	//*  74  163:aload_0         
	//*  75  164:getfield        #66  <Field InputStream inputStream>
	//*  76  167:ifnull          434
	//*  77  170:aload_0         
	//*  78  171:iconst_0        
	//*  79  172:putfield        #92  <Field int rawLength>
	//*  80  175:aconst_null     
	//*  81  176:astore          7
	//*  82  178:new             #234 <Class OutputStreamCounter>
	//*  83  181:dup             
	//*  84  182:aload_2         
	//*  85  183:invokespecial   #236 <Method void OutputStreamCounter(OutputStream)>
	//*  86  186:astore          8
	//*  87  188:aconst_null     
	//*  88  189:astore          9
	//*  89  191:aload           8
	//*  90  193:astore          6
	//*  91  195:aload           6
	//*  92  197:astore_1        
	//*  93  198:aload           9
	//*  94  200:astore          5
	//*  95  202:aload           4
	//*  96  204:ifnull          234
	//*  97  207:aload           6
	//*  98  209:astore_1        
	//*  99  210:aload           9
	//* 100  212:astore          5
	//* 101  214:aload           4
	//* 102  216:invokevirtual   #239 <Method boolean PdfEncryption.isEmbeddedFilesOnly()>
	//* 103  219:ifne            234
	//* 104  222:aload           4
	//* 105  224:aload           6
	//* 106  226:invokevirtual   #243 <Method OutputStreamEncryption PdfEncryption.getEncryptionStream(OutputStream)>
	//* 107  229:astore          5
	//* 108  231:aload           5
	//* 109  233:astore_1        
	//* 110  234:aconst_null     
	//* 111  235:astore          4
	//* 112  237:aload           7
	//* 113  239:astore          6
	//* 114  241:aload           4
	//* 115  243:astore          7
	//* 116  245:aload_1         
	//* 117  246:astore          4
	//* 118  248:aload_0         
	//* 119  249:getfield        #54  <Field boolean compressed>
	//* 120  252:ifeq            286
	//* 121  255:new             #138 <Class Deflater>
	//* 122  258:dup             
	//* 123  259:aload_0         
	//* 124  260:getfield        #56  <Field int compressionLevel>
	//* 125  263:invokespecial   #139 <Method void Deflater(int)>
	//* 126  266:astore          7
	//* 127  268:new             #141 <Class DeflaterOutputStream>
	//* 128  271:dup             
	//* 129  272:aload_1         
	//* 130  273:aload           7
	//* 131  275:ldc1            #244 <Int 32768>
	//* 132  277:invokespecial   #247 <Method void DeflaterOutputStream(OutputStream, Deflater, int)>
	//* 133  280:astore          6
	//* 134  282:aload           6
	//* 135  284:astore          4
	//* 136  286:sipush          4192
	//* 137  289:newarray        byte[]
	//* 138  291:astore_1        
	//* 139  292:aload_0         
	//* 140  293:getfield        #66  <Field InputStream inputStream>
	//* 141  296:aload_1         
	//* 142  297:invokevirtual   #253 <Method int InputStream.read(byte[])>
	//* 143  300:istore_3        
	//* 144  301:iload_3         
	//* 145  302:ifgt            413
	//* 146  305:aload           6
	//* 147  307:ifnull          320
	//* 148  310:aload           6
	//* 149  312:invokevirtual   #256 <Method void DeflaterOutputStream.finish()>
	//* 150  315:aload           7
	//* 151  317:invokevirtual   #154 <Method void Deflater.end()>
	//* 152  320:aload           5
	//* 153  322:ifnull          330
	//* 154  325:aload           5
	//* 155  327:invokevirtual   #259 <Method void OutputStreamEncryption.finish()>
	//* 156  330:aload_0         
	//* 157  331:aload           8
	//* 158  333:invokevirtual   #263 <Method long OutputStreamCounter.getCounter()>
	//* 159  336:l2i             
	//* 160  337:putfield        #60  <Field int inputStreamLength>
	//* 161  340:aload_2         
	//* 162  341:getstatic       #46  <Field byte[] ENDSTREAM>
	//* 163  344:invokevirtual   #232 <Method void OutputStream.write(byte[])>
	//* 164  347:return          
				{
					obj = obj1;
	//  165  348:aload           5
	//  166  350:astore          4
					if(((PdfObject) (obj2)).isArray())
	//* 167  352:aload           6
	//* 168  354:invokevirtual   #166 <Method boolean PdfObject.isArray()>
	//* 169  357:ifeq            78
					{
						obj2 = ((Object) ((PdfArray)obj2));
	//  170  360:aload           6
	//  171  362:checkcast       #168 <Class PdfArray>
	//  172  365:astore          6
						obj = obj1;
	//  173  367:aload           5
	//  174  369:astore          4
						if(!((PdfArray) (obj2)).isEmpty())
	//* 175  371:aload           6
	//* 176  373:invokevirtual   #266 <Method boolean PdfArray.isEmpty()>
	//* 177  376:ifne            78
						{
							obj = obj1;
	//  178  379:aload           5
	//  179  381:astore          4
							if(PdfName.CRYPT.equals(((Object) (((PdfArray) (obj2)).getPdfObject(0)))))
	//* 180  383:getstatic       #211 <Field PdfName PdfName.CRYPT>
	//* 181  386:aload           6
	//* 182  388:iconst_0        
	//* 183  389:invokevirtual   #269 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 184  392:invokevirtual   #133 <Method boolean PdfName.equals(Object)>
	//* 185  395:ifeq            78
								obj = null;
	//  186  398:aconst_null     
	//  187  399:astore          4
						}
					}
				}
		}
		obj1 = ((Object) (get(PdfName.LENGTH)));
		if(obj != null && obj1 != null && ((PdfObject) (obj1)).isNumber())
		{
			i = ((PdfNumber)obj1).intValue();
			put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(((PdfEncryption) (obj)).calculateStreamSize(i)))));
			superToPdf(pdfwriter, outputstream);
			put(PdfName.LENGTH, ((PdfObject) (obj1)));
		} else
	//* 188  401:goto            78
		{
			superToPdf(pdfwriter, outputstream);
	//  189  404:aload_0         
	//  190  405:aload_1         
	//  191  406:aload_2         
	//  192  407:invokevirtual   #225 <Method void superToPdf(PdfWriter, OutputStream)>
		}
		PdfWriter.checkPdfIsoConformance(pdfwriter, 9, ((Object) (this)));
		outputstream.write(STARTSTREAM);
		if(inputStream == null)
			break MISSING_BLOCK_LABEL_434;
		rawLength = 0;
		obj3 = null;
		outputstreamcounter = new OutputStreamCounter(outputstream);
		obj4 = null;
		obj2 = ((Object) (outputstreamcounter));
		pdfwriter = ((PdfWriter) (obj2));
		obj1 = ((Object) (obj4));
		if(obj != null)
		{
			pdfwriter = ((PdfWriter) (obj2));
			obj1 = ((Object) (obj4));
			if(!((PdfEncryption) (obj)).isEmbeddedFilesOnly())
			{
				obj1 = ((Object) (((PdfEncryption) (obj)).getEncryptionStream(((OutputStream) (obj2)))));
				pdfwriter = ((PdfWriter) (obj1));
			}
		}
		obj = null;
		obj2 = obj3;
		obj3 = obj;
		obj = ((Object) (pdfwriter));
		if(compressed)
		{
			obj3 = ((Object) (new Deflater(compressionLevel)));
			obj2 = ((Object) (new DeflaterOutputStream(((OutputStream) (pdfwriter)), ((Deflater) (obj3)), 32768)));
			obj = obj2;
		}
		pdfwriter = ((PdfWriter) (new byte[4192]));
_L3:
		i = inputStream.read(((byte []) (pdfwriter)));
		if(i > 0) goto _L2; else goto _L1
_L1:
		if(obj2 != null)
		{
			((DeflaterOutputStream) (obj2)).finish();
			((Deflater) (obj3)).end();
		}
		if(obj1 != null)
			((OutputStreamEncryption) (obj1)).finish();
		inputStreamLength = (int)outputstreamcounter.getCounter();
_L4:
		outputstream.write(ENDSTREAM);
		return;
	//* 193  410:goto            149
_L2:
		((OutputStream) (obj)).write(((byte []) (pdfwriter)), 0, i);
	//  194  413:aload           4
	//  195  415:aload_1         
	//  196  416:iconst_0        
	//  197  417:iload_3         
	//  198  418:invokevirtual   #272 <Method void OutputStream.write(byte[], int, int)>
		rawLength = rawLength + i;
	//  199  421:aload_0         
	//  200  422:aload_0         
	//  201  423:getfield        #92  <Field int rawLength>
	//  202  426:iload_3         
	//  203  427:iadd            
	//  204  428:putfield        #92  <Field int rawLength>
		  goto _L3
	//* 205  431:goto            292
		if(obj != null && !((PdfEncryption) (obj)).isEmbeddedFilesOnly())
	//* 206  434:aload           4
	//* 207  436:ifnull          488
	//* 208  439:aload           4
	//* 209  441:invokevirtual   #239 <Method boolean PdfEncryption.isEmbeddedFilesOnly()>
	//* 210  444:ifne            488
		{
			if(streamBytes != null)
	//* 211  447:aload_0         
	//* 212  448:getfield        #58  <Field ByteArrayOutputStream streamBytes>
	//* 213  451:ifnull          475
				pdfwriter = ((PdfWriter) (((PdfEncryption) (obj)).encryptByteArray(streamBytes.toByteArray())));
	//  214  454:aload           4
	//  215  456:aload_0         
	//  216  457:getfield        #58  <Field ByteArrayOutputStream streamBytes>
	//  217  460:invokevirtual   #276 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  218  463:invokevirtual   #280 <Method byte[] PdfEncryption.encryptByteArray(byte[])>
	//  219  466:astore_1        
			else
	//* 220  467:aload_2         
	//* 221  468:aload_1         
	//* 222  469:invokevirtual   #232 <Method void OutputStream.write(byte[])>
	//* 223  472:goto            340
				pdfwriter = ((PdfWriter) (((PdfEncryption) (obj)).encryptByteArray(bytes)));
	//  224  475:aload           4
	//  225  477:aload_0         
	//  226  478:getfield        #90  <Field byte[] bytes>
	//  227  481:invokevirtual   #280 <Method byte[] PdfEncryption.encryptByteArray(byte[])>
	//  228  484:astore_1        
			outputstream.write(((byte []) (pdfwriter)));
		} else
	//* 229  485:goto            467
		if(streamBytes != null)
	//* 230  488:aload_0         
	//* 231  489:getfield        #58  <Field ByteArrayOutputStream streamBytes>
	//* 232  492:ifnull          506
			streamBytes.writeTo(outputstream);
	//  233  495:aload_0         
	//  234  496:getfield        #58  <Field ByteArrayOutputStream streamBytes>
	//  235  499:aload_2         
	//  236  500:invokevirtual   #148 <Method void ByteArrayOutputStream.writeTo(OutputStream)>
		else
	//* 237  503:goto            340
			outputstream.write(bytes);
	//  238  506:aload_2         
	//  239  507:aload_0         
	//  240  508:getfield        #90  <Field byte[] bytes>
	//  241  511:invokevirtual   #232 <Method void OutputStream.write(byte[])>
		  goto _L4
	//* 242  514:goto            340
	}

	public String toString()
	{
		if(get(PdfName.TYPE) == null)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #285 <Field PdfName PdfName.TYPE>
	//*   2    4:invokevirtual   #114 <Method PdfObject get(PdfName)>
	//*   3    7:ifnonnull       14
			return "Stream";
	//    4   10:ldc2            #287 <String "Stream">
	//    5   13:areturn         
		else
			return (new StringBuilder()).append("Stream of type: ").append(((Object) (get(PdfName.TYPE)))).toString();
	//    6   14:new             #289 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #290 <Method void StringBuilder()>
	//    9   21:ldc2            #292 <String "Stream of type: ">
	//   10   24:invokevirtual   #296 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getstatic       #285 <Field PdfName PdfName.TYPE>
	//   13   31:invokevirtual   #114 <Method PdfObject get(PdfName)>
	//   14   34:invokevirtual   #299 <Method StringBuilder StringBuilder.append(Object)>
	//   15   37:invokevirtual   #301 <Method String StringBuilder.toString()>
	//   16   40:areturn         
	}

	public void writeContent(OutputStream outputstream)
		throws IOException
	{
		if(streamBytes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field ByteArrayOutputStream streamBytes>
	//*   2    4:ifnull          16
			streamBytes.writeTo(outputstream);
	//    3    7:aload_0         
	//    4    8:getfield        #58  <Field ByteArrayOutputStream streamBytes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #148 <Method void ByteArrayOutputStream.writeTo(OutputStream)>
		else
	//*   7   15:return          
		if(bytes != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #90  <Field byte[] bytes>
	//*  10   20:ifnull          15
		{
			outputstream.write(bytes);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #90  <Field byte[] bytes>
	//   14   28:invokevirtual   #232 <Method void OutputStream.write(byte[])>
			return;
	//   15   31:return          
		}
	}

	public void writeLength()
		throws IOException
	{
		if(inputStream == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field InputStream inputStream>
	//*   2    4:ifnonnull       25
			throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("writelength.can.only.be.called.in.a.contructed.pdfstream.inputstream.pdfwriter", new Object[0]));
	//    3    7:new             #305 <Class UnsupportedOperationException>
	//    4   10:dup             
	//    5   11:ldc2            #307 <String "writelength.can.only.be.called.in.a.contructed.pdfstream.inputstream.pdfwriter">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #184 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #308 <Method void UnsupportedOperationException(String)>
	//   10   24:athrow          
		if(inputStreamLength == -1)
	//*  11   25:aload_0         
	//*  12   26:getfield        #60  <Field int inputStreamLength>
	//*  13   29:iconst_m1       
	//*  14   30:icmpne          51
		{
			throw new IOException(MessageLocalization.getComposedMessage("writelength.can.only.be.called.after.output.of.the.stream.body", new Object[0]));
	//   15   33:new             #102 <Class IOException>
	//   16   36:dup             
	//   17   37:ldc2            #310 <String "writelength.can.only.be.called.after.output.of.the.stream.body">
	//   18   40:iconst_0        
	//   19   41:anewarray       Object[]
	//   20   44:invokestatic    #184 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   21   47:invokespecial   #311 <Method void IOException(String)>
	//   22   50:athrow          
		} else
		{
			writer.addToBody(((PdfObject) (new PdfNumber(inputStreamLength))), ref, false);
	//   23   51:aload_0         
	//   24   52:getfield        #68  <Field PdfWriter writer>
	//   25   55:new             #94  <Class PdfNumber>
	//   26   58:dup             
	//   27   59:aload_0         
	//   28   60:getfield        #60  <Field int inputStreamLength>
	//   29   63:invokespecial   #97  <Method void PdfNumber(int)>
	//   30   66:aload_0         
	//   31   67:getfield        #76  <Field PdfIndirectReference ref>
	//   32   70:iconst_0        
	//   33   71:invokevirtual   #315 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference, boolean)>
	//   34   74:pop             
			return;
	//   35   75:return          
		}
	}

	public static final int BEST_COMPRESSION = 9;
	public static final int BEST_SPEED = 1;
	public static final int DEFAULT_COMPRESSION = -1;
	static final byte ENDSTREAM[];
	public static final int NO_COMPRESSION = 0;
	static final int SIZESTREAM;
	static final byte STARTSTREAM[];
	protected boolean compressed;
	protected int compressionLevel;
	protected InputStream inputStream;
	protected int inputStreamLength;
	protected int rawLength;
	protected PdfIndirectReference ref;
	protected ByteArrayOutputStream streamBytes;
	protected PdfWriter writer;

	static 
	{
		STARTSTREAM = DocWriter.getISOBytes("stream\n");
	//    0    0:ldc1            #34  <String "stream\n">
	//    1    2:invokestatic    #40  <Method byte[] DocWriter.getISOBytes(String)>
	//    2    5:putstatic       #42  <Field byte[] STARTSTREAM>
		ENDSTREAM = DocWriter.getISOBytes("\nendstream");
	//    3    8:ldc1            #44  <String "\nendstream">
	//    4   10:invokestatic    #40  <Method byte[] DocWriter.getISOBytes(String)>
	//    5   13:putstatic       #46  <Field byte[] ENDSTREAM>
		SIZESTREAM = STARTSTREAM.length + ENDSTREAM.length;
	//    6   16:getstatic       #42  <Field byte[] STARTSTREAM>
	//    7   19:arraylength     
	//    8   20:getstatic       #46  <Field byte[] ENDSTREAM>
	//    9   23:arraylength     
	//   10   24:iadd            
	//   11   25:putstatic       #48  <Field int SIZESTREAM>
	//*  12   28:return          
	}
}
