// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.log.*;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfCopy, BadPdfFormatException, PdfReaderInstance, PdfReader, 
//			PdfObject, PRStream, PdfIndirectReference, PdfDictionary, 
//			RefKey, PdfName, PdfImportedPage, PRIndirectReference, 
//			ByteBuffer, PdfArray

public class PdfSmartCopy extends PdfCopy
{
	static class ByteStore
	{

		private static int calculateHash(byte abyte0[])
		{
			int j = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			int k = abyte0.length;
		//    2    2:aload_0         
		//    3    3:arraylength     
		//    4    4:istore_3        
			for(int i = 0; i < k; i++)
		//*   5    5:iconst_0        
		//*   6    6:istore_1        
		//*   7    7:iload_1         
		//*   8    8:iload_3         
		//*   9    9:icmpge          32
				j = j * 31 + (abyte0[i] & 0xff);
		//   10   12:iload_2         
		//   11   13:bipush          31
		//   12   15:imul            
		//   13   16:aload_0         
		//   14   17:iload_1         
		//   15   18:baload          
		//   16   19:sipush          255
		//   17   22:iand            
		//   18   23:iadd            
		//   19   24:istore_2        

		//   20   25:iload_1         
		//   21   26:iconst_1        
		//   22   27:iadd            
		//   23   28:istore_1        
		//*  24   29:goto            7
			return j;
		//   25   32:iload_2         
		//   26   33:ireturn         
		}

		private void serArray(PdfArray pdfarray, int i, ByteBuffer bytebuffer, HashMap hashmap)
			throws IOException
		{
			bytebuffer.append("$A");
		//    0    0:aload_3         
		//    1    1:ldc1            #66  <String "$A">
		//    2    3:invokevirtual   #70  <Method ByteBuffer ByteBuffer.append(String)>
		//    3    6:pop             
			if(i > 0)
		//*   4    7:iload_2         
		//*   5    8:ifgt            12
		//*   6   11:return          
			{
				int j = 0;
		//    7   12:iconst_0        
		//    8   13:istore          5
				while(j < pdfarray.size()) 
		//*   9   15:iload           5
		//*  10   17:aload_1         
		//*  11   18:invokevirtual   #76  <Method int PdfArray.size()>
		//*  12   21:icmpge          11
				{
					serObject(pdfarray.getPdfObject(j), i, bytebuffer, hashmap);
		//   13   24:aload_0         
		//   14   25:aload_1         
		//   15   26:iload           5
		//   16   28:invokevirtual   #80  <Method PdfObject PdfArray.getPdfObject(int)>
		//   17   31:iload_2         
		//   18   32:aload_3         
		//   19   33:aload           4
		//   20   35:invokespecial   #39  <Method void serObject(PdfObject, int, ByteBuffer, HashMap)>
					j++;
		//   21   38:iload           5
		//   22   40:iconst_1        
		//   23   41:iadd            
		//   24   42:istore          5
				}
			}
		//*  25   44:goto            15
		}

		private void serDic(PdfDictionary pdfdictionary, int i, ByteBuffer bytebuffer, HashMap hashmap)
			throws IOException
		{
			bytebuffer.append("$D");
		//    0    0:aload_3         
		//    1    1:ldc1            #85  <String "$D">
		//    2    3:invokevirtual   #70  <Method ByteBuffer ByteBuffer.append(String)>
		//    3    6:pop             
			if(i > 0)
		//*   4    7:iload_2         
		//*   5    8:ifgt            12
		//*   6   11:return          
			{
				Object aobj[] = pdfdictionary.getKeys().toArray();
		//    7   12:aload_1         
		//    8   13:invokevirtual   #91  <Method Set PdfDictionary.getKeys()>
		//    9   16:invokeinterface #97  <Method Object[] Set.toArray()>
		//   10   21:astore          6
				Arrays.sort(aobj);
		//   11   23:aload           6
		//   12   25:invokestatic    #103 <Method void Arrays.sort(Object[])>
				int j = 0;
		//   13   28:iconst_0        
		//   14   29:istore          5
				while(j < aobj.length) 
		//*  15   31:iload           5
		//*  16   33:aload           6
		//*  17   35:arraylength     
		//*  18   36:icmpge          11
				{
					if(!aobj[j].equals(((Object) (PdfName.P))) || !pdfdictionary.get((PdfName)aobj[j]).isIndirect() && !pdfdictionary.get((PdfName)aobj[j]).isDictionary())
		//*  19   39:aload           6
		//*  20   41:iload           5
		//*  21   43:aaload          
		//*  22   44:getstatic       #109 <Field PdfName PdfName.P>
		//*  23   47:invokevirtual   #113 <Method boolean Object.equals(Object)>
		//*  24   50:ifeq            98
		//*  25   53:aload_1         
		//*  26   54:aload           6
		//*  27   56:iload           5
		//*  28   58:aaload          
		//*  29   59:checkcast       #105 <Class PdfName>
		//*  30   62:invokevirtual   #117 <Method PdfObject PdfDictionary.get(PdfName)>
		//*  31   65:invokevirtual   #123 <Method boolean PdfObject.isIndirect()>
		//*  32   68:ifne            89
		//*  33   71:aload_1         
		//*  34   72:aload           6
		//*  35   74:iload           5
		//*  36   76:aaload          
		//*  37   77:checkcast       #105 <Class PdfName>
		//*  38   80:invokevirtual   #117 <Method PdfObject PdfDictionary.get(PdfName)>
		//*  39   83:invokevirtual   #126 <Method boolean PdfObject.isDictionary()>
		//*  40   86:ifeq            98
		//*  41   89:iload           5
		//*  42   91:iconst_1        
		//*  43   92:iadd            
		//*  44   93:istore          5
		//*  45   95:goto            31
					{
						serObject((PdfObject)aobj[j], i, bytebuffer, hashmap);
		//   46   98:aload_0         
		//   47   99:aload           6
		//   48  101:iload           5
		//   49  103:aaload          
		//   50  104:checkcast       #119 <Class PdfObject>
		//   51  107:iload_2         
		//   52  108:aload_3         
		//   53  109:aload           4
		//   54  111:invokespecial   #39  <Method void serObject(PdfObject, int, ByteBuffer, HashMap)>
						serObject(pdfdictionary.get((PdfName)aobj[j]), i, bytebuffer, hashmap);
		//   55  114:aload_0         
		//   56  115:aload_1         
		//   57  116:aload           6
		//   58  118:iload           5
		//   59  120:aaload          
		//   60  121:checkcast       #105 <Class PdfName>
		//   61  124:invokevirtual   #117 <Method PdfObject PdfDictionary.get(PdfName)>
		//   62  127:iload_2         
		//   63  128:aload_3         
		//   64  129:aload           4
		//   65  131:invokespecial   #39  <Method void serObject(PdfObject, int, ByteBuffer, HashMap)>
					}
					j++;
				}
			}
		//*  66  134:goto            89
		}

		private void serObject(PdfObject pdfobject, int i, ByteBuffer bytebuffer, HashMap hashmap)
			throws IOException
		{
			if(i > 0)
		//*   0    0:iload_2         
		//*   1    1:ifgt            5
		//*   2    4:return          
			{
				if(pdfobject == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       17
				{
					bytebuffer.append("$Lnull");
		//    5    9:aload_3         
		//    6   10:ldc1            #129 <String "$Lnull">
		//    7   12:invokevirtual   #70  <Method ByteBuffer ByteBuffer.append(String)>
		//    8   15:pop             
					return;
		//    9   16:return          
				}
				PdfIndirectReference pdfindirectreference = null;
		//   10   17:aconst_null     
		//   11   18:astore          7
				ByteBuffer bytebuffer1 = null;
		//   12   20:aconst_null     
		//   13   21:astore          6
				Object obj = ((Object) (bytebuffer));
		//   14   23:aload_3         
		//   15   24:astore          5
				if(pdfobject.isIndirect())
		//*  16   26:aload_1         
		//*  17   27:invokevirtual   #123 <Method boolean PdfObject.isIndirect()>
		//*  18   30:ifeq            91
				{
					pdfindirectreference = (PdfIndirectReference)pdfobject;
		//   19   33:aload_1         
		//   20   34:checkcast       #131 <Class PdfIndirectReference>
		//   21   37:astore          7
					obj = ((Object) (new RefKey(pdfindirectreference)));
		//   22   39:new             #133 <Class RefKey>
		//   23   42:dup             
		//   24   43:aload           7
		//   25   45:invokespecial   #136 <Method void RefKey(PdfIndirectReference)>
		//   26   48:astore          5
					if(hashmap.containsKey(obj))
		//*  27   50:aload           4
		//*  28   52:aload           5
		//*  29   54:invokevirtual   #141 <Method boolean HashMap.containsKey(Object)>
		//*  30   57:ifeq            79
					{
						bytebuffer.append(((Integer)hashmap.get(obj)).intValue());
		//   31   60:aload_3         
		//   32   61:aload           4
		//   33   63:aload           5
		//   34   65:invokevirtual   #144 <Method Object HashMap.get(Object)>
		//   35   68:checkcast       #146 <Class Integer>
		//   36   71:invokevirtual   #149 <Method int Integer.intValue()>
		//   37   74:invokevirtual   #152 <Method ByteBuffer ByteBuffer.append(int)>
		//   38   77:pop             
						return;
		//   39   78:return          
					}
					obj = ((Object) (new ByteBuffer()));
		//   40   79:new             #34  <Class ByteBuffer>
		//   41   82:dup             
		//   42   83:invokespecial   #35  <Method void ByteBuffer()>
		//   43   86:astore          5
					bytebuffer1 = bytebuffer;
		//   44   88:aload_3         
		//   45   89:astore          6
				}
				pdfobject = PdfReader.getPdfObject(pdfobject);
		//   46   91:aload_1         
		//   47   92:invokestatic    #157 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
		//   48   95:astore_1        
				if(pdfobject.isStream())
		//*  49   96:aload_1         
		//*  50   97:invokevirtual   #160 <Method boolean PdfObject.isStream()>
		//*  51  100:ifeq            208
				{
					((ByteBuffer) (obj)).append("$B");
		//   52  103:aload           5
		//   53  105:ldc1            #162 <String "$B">
		//   54  107:invokevirtual   #70  <Method ByteBuffer ByteBuffer.append(String)>
		//   55  110:pop             
					serDic((PdfDictionary)pdfobject, i - 1, ((ByteBuffer) (obj)), hashmap);
		//   56  111:aload_0         
		//   57  112:aload_1         
		//   58  113:checkcast       #87  <Class PdfDictionary>
		//   59  116:iload_2         
		//   60  117:iconst_1        
		//   61  118:isub            
		//   62  119:aload           5
		//   63  121:aload           4
		//   64  123:invokespecial   #164 <Method void serDic(PdfDictionary, int, ByteBuffer, HashMap)>
					if(i > 0)
		//*  65  126:iload_2         
		//*  66  127:ifle            157
					{
						md5.reset();
		//   67  130:aload_0         
		//   68  131:getfield        #32  <Field MessageDigest md5>
		//   69  134:invokevirtual   #167 <Method void MessageDigest.reset()>
						((ByteBuffer) (obj)).append(md5.digest(PdfReader.getStreamBytesRaw((PRStream)pdfobject)));
		//   70  137:aload           5
		//   71  139:aload_0         
		//   72  140:getfield        #32  <Field MessageDigest md5>
		//   73  143:aload_1         
		//   74  144:checkcast       #169 <Class PRStream>
		//   75  147:invokestatic    #173 <Method byte[] PdfReader.getStreamBytesRaw(PRStream)>
		//   76  150:invokevirtual   #177 <Method byte[] MessageDigest.digest(byte[])>
		//   77  153:invokevirtual   #180 <Method ByteBuffer ByteBuffer.append(byte[])>
		//   78  156:pop             
					}
				} else
		//*  79  157:aload           6
		//*  80  159:ifnull          4
		//*  81  162:new             #133 <Class RefKey>
		//*  82  165:dup             
		//*  83  166:aload           7
		//*  84  168:invokespecial   #136 <Method void RefKey(PdfIndirectReference)>
		//*  85  171:astore_1        
		//*  86  172:aload           4
		//*  87  174:aload_1         
		//*  88  175:invokevirtual   #141 <Method boolean HashMap.containsKey(Object)>
		//*  89  178:ifne            199
		//*  90  181:aload           4
		//*  91  183:aload_1         
		//*  92  184:aload           5
		//*  93  186:invokevirtual   #183 <Method byte[] ByteBuffer.getBuffer()>
		//*  94  189:invokestatic    #49  <Method int calculateHash(byte[])>
		//*  95  192:invokestatic    #187 <Method Integer Integer.valueOf(int)>
		//*  96  195:invokevirtual   #191 <Method Object HashMap.put(Object, Object)>
		//*  97  198:pop             
		//*  98  199:aload           6
		//*  99  201:aload           5
		//* 100  203:invokevirtual   #194 <Method ByteBuffer ByteBuffer.append(ByteBuffer)>
		//* 101  206:pop             
		//* 102  207:return          
				if(pdfobject.isDictionary())
		//* 103  208:aload_1         
		//* 104  209:invokevirtual   #126 <Method boolean PdfObject.isDictionary()>
		//* 105  212:ifeq            233
					serDic((PdfDictionary)pdfobject, i - 1, ((ByteBuffer) (obj)), hashmap);
		//  106  215:aload_0         
		//  107  216:aload_1         
		//  108  217:checkcast       #87  <Class PdfDictionary>
		//  109  220:iload_2         
		//  110  221:iconst_1        
		//  111  222:isub            
		//  112  223:aload           5
		//  113  225:aload           4
		//  114  227:invokespecial   #164 <Method void serDic(PdfDictionary, int, ByteBuffer, HashMap)>
				else
		//* 115  230:goto            157
				if(pdfobject.isArray())
		//* 116  233:aload_1         
		//* 117  234:invokevirtual   #197 <Method boolean PdfObject.isArray()>
		//* 118  237:ifeq            258
					serArray((PdfArray)pdfobject, i - 1, ((ByteBuffer) (obj)), hashmap);
		//  119  240:aload_0         
		//  120  241:aload_1         
		//  121  242:checkcast       #72  <Class PdfArray>
		//  122  245:iload_2         
		//  123  246:iconst_1        
		//  124  247:isub            
		//  125  248:aload           5
		//  126  250:aload           4
		//  127  252:invokespecial   #199 <Method void serArray(PdfArray, int, ByteBuffer, HashMap)>
				else
		//* 128  255:goto            157
				if(pdfobject.isString())
		//* 129  258:aload_1         
		//* 130  259:invokevirtual   #202 <Method boolean PdfObject.isString()>
		//* 131  262:ifeq            283
					((ByteBuffer) (obj)).append("$S").append(pdfobject.toString());
		//  132  265:aload           5
		//  133  267:ldc1            #204 <String "$S">
		//  134  269:invokevirtual   #70  <Method ByteBuffer ByteBuffer.append(String)>
		//  135  272:aload_1         
		//  136  273:invokevirtual   #208 <Method String PdfObject.toString()>
		//  137  276:invokevirtual   #70  <Method ByteBuffer ByteBuffer.append(String)>
		//  138  279:pop             
				else
		//* 139  280:goto            157
				if(pdfobject.isName())
		//* 140  283:aload_1         
		//* 141  284:invokevirtual   #211 <Method boolean PdfObject.isName()>
		//* 142  287:ifeq            308
					((ByteBuffer) (obj)).append("$N").append(pdfobject.toString());
		//  143  290:aload           5
		//  144  292:ldc1            #213 <String "$N">
		//  145  294:invokevirtual   #70  <Method ByteBuffer ByteBuffer.append(String)>
		//  146  297:aload_1         
		//  147  298:invokevirtual   #208 <Method String PdfObject.toString()>
		//  148  301:invokevirtual   #70  <Method ByteBuffer ByteBuffer.append(String)>
		//  149  304:pop             
				else
		//* 150  305:goto            157
					((ByteBuffer) (obj)).append("$L").append(pdfobject.toString());
		//  151  308:aload           5
		//  152  310:ldc1            #215 <String "$L">
		//  153  312:invokevirtual   #70  <Method ByteBuffer ByteBuffer.append(String)>
		//  154  315:aload_1         
		//  155  316:invokevirtual   #208 <Method String PdfObject.toString()>
		//  156  319:invokevirtual   #70  <Method ByteBuffer ByteBuffer.append(String)>
		//  157  322:pop             
				if(bytebuffer1 != null)
				{
					pdfobject = ((PdfObject) (new RefKey(pdfindirectreference)));
					if(!hashmap.containsKey(((Object) (pdfobject))))
						hashmap.put(((Object) (pdfobject)), ((Object) (Integer.valueOf(calculateHash(((ByteBuffer) (obj)).getBuffer())))));
					bytebuffer1.append(((ByteBuffer) (obj)));
					return;
				}
			}
		//* 158  323:goto            157
		}

		public boolean equals(Object obj)
		{
			while(!(obj instanceof ByteStore) || hashCode() != obj.hashCode()) 
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class PdfSmartCopy$ByteStore>
		//*   2    4:ifne            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #219 <Method int hashCode()>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #220 <Method int Object.hashCode()>
		//    9   17:icmpne          7
			return Arrays.equals(b, ((ByteStore)obj).b);
		//   10   20:aload_0         
		//   11   21:getfield        #45  <Field byte[] b>
		//   12   24:aload_1         
		//   13   25:checkcast       #2   <Class PdfSmartCopy$ByteStore>
		//   14   28:getfield        #45  <Field byte[] b>
		//   15   31:invokestatic    #223 <Method boolean Arrays.equals(byte[], byte[])>
		//   16   34:ireturn         
		}

		public int hashCode()
		{
			return hash;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field int hash>
		//    2    4:ireturn         
		}

		private final byte b[];
		private final int hash;
		private MessageDigest md5;

		ByteStore(PRStream prstream, HashMap hashmap)
			throws IOException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			ByteBuffer bytebuffer;
			try
			{
				md5 = MessageDigest.getInstance("MD5");
		//    2    4:aload_0         
		//    3    5:ldc1            #24  <String "MD5">
		//    4    7:invokestatic    #30  <Method MessageDigest MessageDigest.getInstance(String)>
		//    5   10:putfield        #32  <Field MessageDigest md5>
			}
		//*   6   13:new             #34  <Class ByteBuffer>
		//*   7   16:dup             
		//*   8   17:invokespecial   #35  <Method void ByteBuffer()>
		//*   9   20:astore_3        
		//*  10   21:aload_0         
		//*  11   22:aload_1         
		//*  12   23:bipush          100
		//*  13   25:aload_3         
		//*  14   26:aload_2         
		//*  15   27:invokespecial   #39  <Method void serObject(PdfObject, int, ByteBuffer, HashMap)>
		//*  16   30:aload_0         
		//*  17   31:aload_3         
		//*  18   32:invokevirtual   #43  <Method byte[] ByteBuffer.toByteArray()>
		//*  19   35:putfield        #45  <Field byte[] b>
		//*  20   38:aload_0         
		//*  21   39:aload_0         
		//*  22   40:getfield        #45  <Field byte[] b>
		//*  23   43:invokestatic    #49  <Method int calculateHash(byte[])>
		//*  24   46:putfield        #51  <Field int hash>
		//*  25   49:aload_0         
		//*  26   50:aconst_null     
		//*  27   51:putfield        #32  <Field MessageDigest md5>
		//*  28   54:return          
			// Misplaced declaration of an exception variable
			catch(PRStream prstream)
		//*  29   55:astore_1        
			{
				throw new ExceptionConverter(((Exception) (prstream)));
		//   30   56:new             #53  <Class ExceptionConverter>
		//   31   59:dup             
		//   32   60:aload_1         
		//   33   61:invokespecial   #56  <Method void ExceptionConverter(Exception)>
		//   34   64:athrow          
			}
			bytebuffer = new ByteBuffer();
			serObject(((PdfObject) (prstream)), 100, bytebuffer, hashmap);
			b = bytebuffer.toByteArray();
			hash = calculateHash(b);
			md5 = null;
		}

		ByteStore(PdfDictionary pdfdictionary, HashMap hashmap)
			throws IOException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			ByteBuffer bytebuffer;
			try
			{
				md5 = MessageDigest.getInstance("MD5");
		//    2    4:aload_0         
		//    3    5:ldc1            #24  <String "MD5">
		//    4    7:invokestatic    #30  <Method MessageDigest MessageDigest.getInstance(String)>
		//    5   10:putfield        #32  <Field MessageDigest md5>
			}
		//*   6   13:new             #34  <Class ByteBuffer>
		//*   7   16:dup             
		//*   8   17:invokespecial   #35  <Method void ByteBuffer()>
		//*   9   20:astore_3        
		//*  10   21:aload_0         
		//*  11   22:aload_1         
		//*  12   23:bipush          100
		//*  13   25:aload_3         
		//*  14   26:aload_2         
		//*  15   27:invokespecial   #39  <Method void serObject(PdfObject, int, ByteBuffer, HashMap)>
		//*  16   30:aload_0         
		//*  17   31:aload_3         
		//*  18   32:invokevirtual   #43  <Method byte[] ByteBuffer.toByteArray()>
		//*  19   35:putfield        #45  <Field byte[] b>
		//*  20   38:aload_0         
		//*  21   39:aload_0         
		//*  22   40:getfield        #45  <Field byte[] b>
		//*  23   43:invokestatic    #49  <Method int calculateHash(byte[])>
		//*  24   46:putfield        #51  <Field int hash>
		//*  25   49:aload_0         
		//*  26   50:aconst_null     
		//*  27   51:putfield        #32  <Field MessageDigest md5>
		//*  28   54:return          
			// Misplaced declaration of an exception variable
			catch(PdfDictionary pdfdictionary)
		//*  29   55:astore_1        
			{
				throw new ExceptionConverter(((Exception) (pdfdictionary)));
		//   30   56:new             #53  <Class ExceptionConverter>
		//   31   59:dup             
		//   32   60:aload_1         
		//   33   61:invokespecial   #56  <Method void ExceptionConverter(Exception)>
		//   34   64:athrow          
			}
			bytebuffer = new ByteBuffer();
			serObject(((PdfObject) (pdfdictionary)), 100, bytebuffer, hashmap);
			b = bytebuffer.toByteArray();
			hash = calculateHash(b);
			md5 = null;
		}
	}


	public PdfSmartCopy(Document document, OutputStream outputstream)
		throws DocumentException
	{
		super(document, outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #33  <Method void PdfCopy(Document, OutputStream)>
		streamMap = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #35  <Field HashMap streamMap>
	//    7   11:aload_0         
	//    8   12:new             #37  <Class HashMap>
	//    9   15:dup             
	//   10   16:invokespecial   #39  <Method void HashMap()>
	//   11   19:putfield        #41  <Field HashMap serialized>
		COUNTER = CounterFactory.getCounter(com/itextpdf/text/pdf/PdfSmartCopy);
	//   12   22:aload_0         
	//   13   23:ldc1            #2   <Class PdfSmartCopy>
	//   14   25:invokestatic    #47  <Method Counter CounterFactory.getCounter(Class)>
	//   15   28:putfield        #49  <Field Counter COUNTER>
		streamMap = new HashMap();
	//   16   31:aload_0         
	//   17   32:new             #37  <Class HashMap>
	//   18   35:dup             
	//   19   36:invokespecial   #39  <Method void HashMap()>
	//   20   39:putfield        #35  <Field HashMap streamMap>
	//   21   42:return          
	}

	public void addPage(PdfImportedPage pdfimportedpage)
		throws IOException, BadPdfFormatException
	{
		if(currentPdfReaderInstance.getReader() != reader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field PdfReaderInstance currentPdfReaderInstance>
	//*   2    4:invokevirtual   #66  <Method PdfReader PdfReaderInstance.getReader()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #70  <Field PdfReader reader>
	//*   5   11:if_acmpeq       21
			serialized.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #41  <Field HashMap serialized>
	//    8   18:invokevirtual   #73  <Method void HashMap.clear()>
		super.addPage(pdfimportedpage);
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokespecial   #75  <Method void PdfCopy.addPage(PdfImportedPage)>
	//   12   26:return          
	}

	protected PdfIndirectReference copyIndirect(PRIndirectReference prindirectreference)
		throws IOException, BadPdfFormatException
	{
		boolean flag;
		ByteStore bytestore;
		PdfObject pdfobject;
		pdfobject = PdfReader.getPdfObjectRelease(((PdfObject) (prindirectreference)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #83  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    2    4:astore          6
		bytestore = null;
	//    3    6:aconst_null     
	//    4    7:astore_3        
		flag = false;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		if(!pdfobject.isStream()) goto _L2; else goto _L1
	//    7   10:aload           6
	//    8   12:invokevirtual   #89  <Method boolean PdfObject.isStream()>
	//    9   15:ifeq            60
_L1:
		PdfIndirectReference pdfindirectreference;
		bytestore = new ByteStore((PRStream)pdfobject, serialized);
	//   10   18:new             #6   <Class PdfSmartCopy$ByteStore>
	//   11   21:dup             
	//   12   22:aload           6
	//   13   24:checkcast       #91  <Class PRStream>
	//   14   27:aload_0         
	//   15   28:getfield        #41  <Field HashMap serialized>
	//   16   31:invokespecial   #94  <Method void PdfSmartCopy$ByteStore(PRStream, HashMap)>
	//   17   34:astore_3        
		flag = true;
	//   18   35:iconst_1        
	//   19   36:istore_2        
		pdfindirectreference = (PdfIndirectReference)streamMap.get(((Object) (bytestore)));
	//   20   37:aload_0         
	//   21   38:getfield        #35  <Field HashMap streamMap>
	//   22   41:aload_3         
	//   23   42:invokevirtual   #98  <Method Object HashMap.get(Object)>
	//   24   45:checkcast       #100 <Class PdfIndirectReference>
	//   25   48:astore          4
		if(pdfindirectreference == null) goto _L4; else goto _L3
	//   26   50:aload           4
	//   27   52:ifnull          108
_L3:
		prindirectreference = ((PRIndirectReference) (pdfindirectreference));
	//   28   55:aload           4
	//   29   57:astore_1        
_L6:
		return ((PdfIndirectReference) (prindirectreference));
	//   30   58:aload_1         
	//   31   59:areturn         
_L2:
		if(pdfobject.isDictionary())
	//*  32   60:aload           6
	//*  33   62:invokevirtual   #103 <Method boolean PdfObject.isDictionary()>
	//*  34   65:ifeq            108
		{
			bytestore = new ByteStore((PdfDictionary)pdfobject, serialized);
	//   35   68:new             #6   <Class PdfSmartCopy$ByteStore>
	//   36   71:dup             
	//   37   72:aload           6
	//   38   74:checkcast       #105 <Class PdfDictionary>
	//   39   77:aload_0         
	//   40   78:getfield        #41  <Field HashMap serialized>
	//   41   81:invokespecial   #108 <Method void PdfSmartCopy$ByteStore(PdfDictionary, HashMap)>
	//   42   84:astore_3        
			flag = true;
	//   43   85:iconst_1        
	//   44   86:istore_2        
			pdfindirectreference = (PdfIndirectReference)streamMap.get(((Object) (bytestore)));
	//   45   87:aload_0         
	//   46   88:getfield        #35  <Field HashMap streamMap>
	//   47   91:aload_3         
	//   48   92:invokevirtual   #98  <Method Object HashMap.get(Object)>
	//   49   95:checkcast       #100 <Class PdfIndirectReference>
	//   50   98:astore          4
			if(pdfindirectreference != null)
	//*  51  100:aload           4
	//*  52  102:ifnull          108
				return pdfindirectreference;
	//   53  105:aload           4
	//   54  107:areturn         
		}
_L4:
		PdfCopy.IndirectReferences indirectreferences;
		prindirectreference = ((PRIndirectReference) (new RefKey(prindirectreference)));
	//   55  108:new             #110 <Class RefKey>
	//   56  111:dup             
	//   57  112:aload_1         
	//   58  113:invokespecial   #113 <Method void RefKey(PRIndirectReference)>
	//   59  116:astore_1        
		indirectreferences = (PdfCopy.IndirectReferences)indirects.get(((Object) (prindirectreference)));
	//   60  117:aload_0         
	//   61  118:getfield        #116 <Field HashMap indirects>
	//   62  121:aload_1         
	//   63  122:invokevirtual   #98  <Method Object HashMap.get(Object)>
	//   64  125:checkcast       #118 <Class PdfCopy$IndirectReferences>
	//   65  128:astore          5
		if(indirectreferences == null)
			break; /* Loop/switch isn't completed */
	//   66  130:aload           5
	//   67  132:ifnull          226
		pdfindirectreference = indirectreferences.getRef();
	//   68  135:aload           5
	//   69  137:invokevirtual   #122 <Method PdfIndirectReference PdfCopy$IndirectReferences.getRef()>
	//   70  140:astore          4
		prindirectreference = ((PRIndirectReference) (pdfindirectreference));
	//   71  142:aload           4
	//   72  144:astore_1        
		if(indirectreferences.getCopied())
			continue; /* Loop/switch isn't completed */
	//   73  145:aload           5
	//   74  147:invokevirtual   #125 <Method boolean PdfCopy$IndirectReferences.getCopied()>
	//   75  150:ifne            58
_L7:
		if(!pdfobject.isDictionary())
			break MISSING_BLOCK_LABEL_260;
	//   76  153:aload           6
	//   77  155:invokevirtual   #103 <Method boolean PdfObject.isDictionary()>
	//   78  158:ifeq            260
		PdfObject pdfobject1 = PdfReader.getPdfObjectRelease(((PdfDictionary)pdfobject).get(PdfName.TYPE));
	//   79  161:aload           6
	//   80  163:checkcast       #105 <Class PdfDictionary>
	//   81  166:getstatic       #131 <Field PdfName PdfName.TYPE>
	//   82  169:invokevirtual   #134 <Method PdfObject PdfDictionary.get(PdfName)>
	//   83  172:invokestatic    #83  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   84  175:astore          7
		if(pdfobject1 == null)
			break MISSING_BLOCK_LABEL_260;
	//   85  177:aload           7
	//   86  179:ifnull          260
		prindirectreference = ((PRIndirectReference) (pdfindirectreference));
	//   87  182:aload           4
	//   88  184:astore_1        
		if(!PdfName.PAGE.equals(((Object) (pdfobject1))))
	//*  89  185:getstatic       #137 <Field PdfName PdfName.PAGE>
	//*  90  188:aload           7
	//*  91  190:invokevirtual   #141 <Method boolean PdfName.equals(Object)>
	//*  92  193:ifne            58
		{
			if(PdfName.CATALOG.equals(((Object) (pdfobject1))))
	//*  93  196:getstatic       #144 <Field PdfName PdfName.CATALOG>
	//*  94  199:aload           7
	//*  95  201:invokevirtual   #141 <Method boolean PdfName.equals(Object)>
	//*  96  204:ifeq            260
			{
				LOGGER.warn(MessageLocalization.getComposedMessage("make.copy.of.catalog.dictionary.is.forbidden", new Object[0]));
	//   97  207:getstatic       #26  <Field Logger LOGGER>
	//   98  210:ldc1            #146 <String "make.copy.of.catalog.dictionary.is.forbidden">
	//   99  212:iconst_0        
	//  100  213:anewarray       Object[]
	//  101  216:invokestatic    #154 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  102  219:invokeinterface #160 <Method void Logger.warn(String)>
				return null;
	//  103  224:aconst_null     
	//  104  225:areturn         
			}
			break MISSING_BLOCK_LABEL_260;
		}
		if(true) goto _L6; else goto _L5
_L5:
		pdfindirectreference = body.getPdfIndirectReference();
	//  105  226:aload_0         
	//  106  227:getfield        #164 <Field PdfWriter$PdfBody body>
	//  107  230:invokevirtual   #169 <Method PdfIndirectReference PdfWriter$PdfBody.getPdfIndirectReference()>
	//  108  233:astore          4
		indirectreferences = new PdfCopy.IndirectReferences(pdfindirectreference);
	//  109  235:new             #118 <Class PdfCopy$IndirectReferences>
	//  110  238:dup             
	//  111  239:aload           4
	//  112  241:invokespecial   #172 <Method void PdfCopy$IndirectReferences(PdfIndirectReference)>
	//  113  244:astore          5
		indirects.put(((Object) (prindirectreference)), ((Object) (indirectreferences)));
	//  114  246:aload_0         
	//  115  247:getfield        #116 <Field HashMap indirects>
	//  116  250:aload_1         
	//  117  251:aload           5
	//  118  253:invokevirtual   #176 <Method Object HashMap.put(Object, Object)>
	//  119  256:pop             
		  goto _L7
		if(true) goto _L6; else goto _L8
	//* 120  257:goto            153
_L8:
		indirectreferences.setCopied();
	//  121  260:aload           5
	//  122  262:invokevirtual   #179 <Method void PdfCopy$IndirectReferences.setCopied()>
		if(flag)
	//* 123  265:iload_2         
	//* 124  266:ifeq            280
			streamMap.put(((Object) (bytestore)), ((Object) (pdfindirectreference)));
	//  125  269:aload_0         
	//  126  270:getfield        #35  <Field HashMap streamMap>
	//  127  273:aload_3         
	//  128  274:aload           4
	//  129  276:invokevirtual   #176 <Method Object HashMap.put(Object, Object)>
	//  130  279:pop             
		addToBody(copyObject(pdfobject), pdfindirectreference);
	//  131  280:aload_0         
	//  132  281:aload_0         
	//  133  282:aload           6
	//  134  284:invokevirtual   #182 <Method PdfObject copyObject(PdfObject)>
	//  135  287:aload           4
	//  136  289:invokevirtual   #186 <Method PdfIndirectObject addToBody(PdfObject, PdfIndirectReference)>
	//  137  292:pop             
		return pdfindirectreference;
	//  138  293:aload           4
	//  139  295:areturn         
	}

	public void freeReader(PdfReader pdfreader)
		throws IOException
	{
		serialized.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field HashMap serialized>
	//    2    4:invokevirtual   #73  <Method void HashMap.clear()>
		super.freeReader(pdfreader);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #190 <Method void PdfCopy.freeReader(PdfReader)>
	//    6   12:return          
	}

	protected Counter getCounter()
	{
		return COUNTER;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Counter COUNTER>
	//    2    4:areturn         
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/PdfSmartCopy);
	protected Counter COUNTER;
	private final HashMap serialized = new HashMap();
	private HashMap streamMap;

	static 
	{
	//    0    0:ldc1            #2   <Class PdfSmartCopy>
	//    1    2:invokestatic    #24  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #26  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
