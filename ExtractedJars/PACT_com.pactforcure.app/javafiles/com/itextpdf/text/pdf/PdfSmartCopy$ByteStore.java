// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfSmartCopy, ByteBuffer, PdfArray, PdfDictionary, 
//			PdfName, PdfObject, PdfIndirectReference, RefKey, 
//			PdfReader, PRStream

static class PdfSmartCopy$ByteStore
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
		while(!(obj instanceof PdfSmartCopy$ByteStore) || hashCode() != obj.hashCode()) 
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
		return Arrays.equals(b, ((PdfSmartCopy$ByteStore)obj).b);
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

	PdfSmartCopy$ByteStore(PRStream prstream, HashMap hashmap)
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

	PdfSmartCopy$ByteStore(PdfDictionary pdfdictionary, HashMap hashmap)
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
