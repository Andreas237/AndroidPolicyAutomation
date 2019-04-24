// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.*;
import java.io.*;
import java.security.*;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			CachedContent, DefaultContentMetadata, ContentMetadataMutations, ContentMetadata

class CachedContentIndex
{

	public CachedContentIndex(File file)
	{
		this(file, ((byte []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #35  <Method void CachedContentIndex(File, byte[])>
	//    4    6:return          
	}

	public CachedContentIndex(File file, byte abyte0[])
	{
		boolean flag;
		if(abyte0 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_3        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		this(file, abyte0, flag);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:iload_3         
	//   11   15:invokespecial   #39  <Method void CachedContentIndex(File, byte[], boolean)>
	//   12   18:return          
	}

	public CachedContentIndex(File file, byte abyte0[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		encrypt = flag;
	//    2    4:aload_0         
	//    3    5:iload_3         
	//    4    6:putfield        #48  <Field boolean encrypt>
		boolean flag1 = true;
	//    5    9:iconst_1        
	//    6   10:istore          4
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_69;
	//    7   12:aload_2         
	//    8   13:ifnull          69
		if(abyte0.length == 16)
	//*   9   16:aload_2         
	//*  10   17:arraylength     
	//*  11   18:bipush          16
	//*  12   20:icmpne          29
			flag = flag1;
	//   13   23:iload           4
	//   14   25:istore_3        
		else
	//*  15   26:goto            31
			flag = false;
	//   16   29:iconst_0        
	//   17   30:istore_3        
		Assertions.checkArgument(flag);
	//   18   31:iload_3         
	//   19   32:invokestatic    #54  <Method void Assertions.checkArgument(boolean)>
		try
		{
			cipher = getCipher();
	//   20   35:aload_0         
	//   21   36:invokestatic    #58  <Method Cipher getCipher()>
	//   22   39:putfield        #60  <Field Cipher cipher>
			secretKeySpec = new SecretKeySpec(abyte0, "AES");
	//   23   42:aload_0         
	//   24   43:new             #62  <Class SecretKeySpec>
	//   25   46:dup             
	//   26   47:aload_2         
	//   27   48:ldc1            #64  <String "AES">
	//   28   50:invokespecial   #67  <Method void SecretKeySpec(byte[], String)>
	//   29   53:putfield        #69  <Field SecretKeySpec secretKeySpec>
		}
	//*  30   56:goto            85
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  31   59:astore_1        
		{
			throw new IllegalStateException(((Throwable) (file)));
	//   32   60:new             #71  <Class IllegalStateException>
	//   33   63:dup             
	//   34   64:aload_1         
	//   35   65:invokespecial   #74  <Method void IllegalStateException(Throwable)>
	//   36   68:athrow          
		}
		break MISSING_BLOCK_LABEL_85;
		Assertions.checkState(flag ^ true);
	//   37   69:iload_3         
	//   38   70:iconst_1        
	//   39   71:ixor            
	//   40   72:invokestatic    #77  <Method void Assertions.checkState(boolean)>
		cipher = null;
	//   41   75:aload_0         
	//   42   76:aconst_null     
	//   43   77:putfield        #60  <Field Cipher cipher>
		secretKeySpec = null;
	//   44   80:aload_0         
	//   45   81:aconst_null     
	//   46   82:putfield        #69  <Field SecretKeySpec secretKeySpec>
		keyToContent = new HashMap();
	//   47   85:aload_0         
	//   48   86:new             #79  <Class HashMap>
	//   49   89:dup             
	//   50   90:invokespecial   #80  <Method void HashMap()>
	//   51   93:putfield        #82  <Field HashMap keyToContent>
		idToKey = new SparseArray();
	//   52   96:aload_0         
	//   53   97:new             #84  <Class SparseArray>
	//   54  100:dup             
	//   55  101:invokespecial   #85  <Method void SparseArray()>
	//   56  104:putfield        #87  <Field SparseArray idToKey>
		atomicFile = new AtomicFile(new File(file, "cached_content_index.exi"));
	//   57  107:aload_0         
	//   58  108:new             #89  <Class AtomicFile>
	//   59  111:dup             
	//   60  112:new             #91  <Class File>
	//   61  115:dup             
	//   62  116:aload_1         
	//   63  117:ldc1            #8   <String "cached_content_index.exi">
	//   64  119:invokespecial   #94  <Method void File(File, String)>
	//   65  122:invokespecial   #96  <Method void AtomicFile(File)>
	//   66  125:putfield        #98  <Field AtomicFile atomicFile>
		return;
	//   67  128:return          
	}

	private void add(CachedContent cachedcontent)
	{
		keyToContent.put(((Object) (cachedcontent.key)), ((Object) (cachedcontent)));
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field HashMap keyToContent>
	//    2    4:aload_1         
	//    3    5:getfield        #105 <Field String CachedContent.key>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #109 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
		idToKey.put(cachedcontent.id, ((Object) (cachedcontent.key)));
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field SparseArray idToKey>
	//    9   17:aload_1         
	//   10   18:getfield        #112 <Field int CachedContent.id>
	//   11   21:aload_1         
	//   12   22:getfield        #105 <Field String CachedContent.key>
	//   13   25:invokevirtual   #115 <Method void SparseArray.put(int, Object)>
	//   14   28:return          
	}

	private CachedContent addNew(String s)
	{
		s = ((String) (new CachedContent(getNewId(idToKey), s)));
	//    0    0:new             #102 <Class CachedContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #87  <Field SparseArray idToKey>
	//    4    8:invokestatic    #121 <Method int getNewId(SparseArray)>
	//    5   11:aload_1         
	//    6   12:invokespecial   #124 <Method void CachedContent(int, String)>
	//    7   15:astore_1        
		add(((CachedContent) (s)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #126 <Method void add(CachedContent)>
		changed = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #128 <Field boolean changed>
		return ((CachedContent) (s));
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	private static Cipher getCipher()
		throws NoSuchPaddingException, NoSuchAlgorithmException
	{
		if(Util.SDK_INT != 18)
			break MISSING_BLOCK_LABEL_18;
	//    0    0:getstatic       #135 <Field int Util.SDK_INT>
	//    1    3:bipush          18
	//    2    5:icmpne          18
		Cipher cipher1 = Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
	//    3    8:ldc1            #137 <String "AES/CBC/PKCS5PADDING">
	//    4   10:ldc1            #139 <String "BC">
	//    5   12:invokestatic    #145 <Method Cipher Cipher.getInstance(String, String)>
	//    6   15:astore_0        
		return cipher1;
	//    7   16:aload_0         
	//    8   17:areturn         
_L2:
		return Cipher.getInstance("AES/CBC/PKCS5PADDING");
	//    9   18:ldc1            #137 <String "AES/CBC/PKCS5PADDING">
	//   10   20:invokestatic    #148 <Method Cipher Cipher.getInstance(String)>
	//   11   23:areturn         
		Throwable throwable;
		throwable;
	//   12   24:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  13   25:goto            18
	}

	public static int getNewId(SparseArray sparsearray)
	{
		int l = sparsearray.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #153 <Method int SparseArray.size()>
	//    2    4:istore_3        
		int i;
		if(l == 0)
	//*   3    5:iload_3         
	//*   4    6:ifne            14
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		else
	//*   7   11:goto            24
			i = sparsearray.keyAt(l - 1) + 1;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:iconst_1        
	//   11   17:isub            
	//   12   18:invokevirtual   #157 <Method int SparseArray.keyAt(int)>
	//   13   21:iconst_1        
	//   14   22:iadd            
	//   15   23:istore_1        
		int k = i;
	//   16   24:iload_1         
	//   17   25:istore_2        
		if(i < 0)
	//*  18   26:iload_1         
	//*  19   27:ifge            57
		{
			int j = 0;
	//   20   30:iconst_0        
	//   21   31:istore_1        
			do
			{
				k = j;
	//   22   32:iload_1         
	//   23   33:istore_2        
				if(j >= l)
					break;
	//   24   34:iload_1         
	//   25   35:iload_3         
	//   26   36:icmpge          57
				if(j != sparsearray.keyAt(j))
	//*  27   39:iload_1         
	//*  28   40:aload_0         
	//*  29   41:iload_1         
	//*  30   42:invokevirtual   #157 <Method int SparseArray.keyAt(int)>
	//*  31   45:icmpeq          50
					return j;
	//   32   48:iload_1         
	//   33   49:ireturn         
				j++;
	//   34   50:iload_1         
	//   35   51:iconst_1        
	//   36   52:iadd            
	//   37   53:istore_1        
			} while(true);
	//   38   54:goto            32
		}
		return k;
	//   39   57:iload_2         
	//   40   58:ireturn         
	}

	private boolean readFile()
	{
		Object obj;
		Object obj4;
		obj = ((Object) (new BufferedInputStream(atomicFile.openRead())));
	//    0    0:new             #169 <Class BufferedInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #98  <Field AtomicFile atomicFile>
	//    4    8:invokevirtual   #173 <Method java.io.InputStream AtomicFile.openRead()>
	//    5   11:invokespecial   #176 <Method void BufferedInputStream(java.io.InputStream)>
	//    6   14:astore          5
		obj4 = ((Object) (new DataInputStream(((java.io.InputStream) (obj)))));
	//    7   16:new             #178 <Class DataInputStream>
	//    8   19:dup             
	//    9   20:aload           5
	//   10   22:invokespecial   #179 <Method void DataInputStream(java.io.InputStream)>
	//   11   25:astore          8
		Object obj2;
		Object obj3;
		obj2 = obj4;
	//   12   27:aload           8
	//   13   29:astore          6
		obj3 = obj4;
	//   14   31:aload           8
	//   15   33:astore          7
		int k = ((DataInputStream) (obj4)).readInt();
	//   16   35:aload           8
	//   17   37:invokevirtual   #182 <Method int DataInputStream.readInt()>
	//   18   40:istore_3        
		if(k >= 0 && k <= 2) goto _L2; else goto _L1
	//   19   41:iload_3         
	//   20   42:iflt            416
	//   21   45:iload_3         
	//   22   46:iconst_2        
	//   23   47:icmple          53
	//*  24   50:goto            416
_L2:
		obj2 = obj4;
	//   25   53:aload           8
	//   26   55:astore          6
		obj3 = obj4;
	//   27   57:aload           8
	//   28   59:astore          7
		if((((DataInputStream) (obj4)).readInt() & 1) == 0) goto _L4; else goto _L3
	//   29   61:aload           8
	//   30   63:invokevirtual   #182 <Method int DataInputStream.readInt()>
	//   31   66:iconst_1        
	//   32   67:iand            
	//   33   68:ifeq            225
_L3:
		obj2 = obj4;
	//   34   71:aload           8
	//   35   73:astore          6
		obj3 = obj4;
	//   36   75:aload           8
	//   37   77:astore          7
		Object obj5 = ((Object) (cipher));
	//   38   79:aload_0         
	//   39   80:getfield        #60  <Field Cipher cipher>
	//   40   83:astore          9
		if(obj5 == null)
	//*  41   85:aload           9
	//*  42   87:ifnonnull       102
		{
			if(obj4 != null)
	//*  43   90:aload           8
	//*  44   92:ifnull          100
				Util.closeQuietly(((java.io.Closeable) (obj4)));
	//   45   95:aload           8
	//   46   97:invokestatic    #186 <Method void Util.closeQuietly(java.io.Closeable)>
			return false;
	//   47  100:iconst_0        
	//   48  101:ireturn         
		}
		obj2 = obj4;
	//   49  102:aload           8
	//   50  104:astore          6
		obj3 = obj4;
	//   51  106:aload           8
	//   52  108:astore          7
		byte abyte0[] = new byte[16];
	//   53  110:bipush          16
	//   54  112:newarray        byte[]
	//   55  114:astore          9
		obj2 = obj4;
	//   56  116:aload           8
	//   57  118:astore          6
		obj3 = obj4;
	//   58  120:aload           8
	//   59  122:astore          7
		((DataInputStream) (obj4)).readFully(abyte0);
	//   60  124:aload           8
	//   61  126:aload           9
	//   62  128:invokevirtual   #190 <Method void DataInputStream.readFully(byte[])>
		obj2 = obj4;
	//   63  131:aload           8
	//   64  133:astore          6
		obj3 = obj4;
	//   65  135:aload           8
	//   66  137:astore          7
		abyte0 = ((byte []) (new IvParameterSpec(abyte0)));
	//   67  139:new             #192 <Class IvParameterSpec>
	//   68  142:dup             
	//   69  143:aload           9
	//   70  145:invokespecial   #194 <Method void IvParameterSpec(byte[])>
	//   71  148:astore          9
		obj2 = obj4;
	//   72  150:aload           8
	//   73  152:astore          6
		obj3 = obj4;
	//   74  154:aload           8
	//   75  156:astore          7
		cipher.init(2, ((java.security.Key) (secretKeySpec)), ((java.security.spec.AlgorithmParameterSpec) (abyte0)));
	//   76  158:aload_0         
	//   77  159:getfield        #60  <Field Cipher cipher>
	//   78  162:iconst_2        
	//   79  163:aload_0         
	//   80  164:getfield        #69  <Field SecretKeySpec secretKeySpec>
	//   81  167:aload           9
	//   82  169:invokevirtual   #198 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
		obj2 = obj4;
	//   83  172:aload           8
	//   84  174:astore          6
		obj3 = obj4;
	//   85  176:aload           8
	//   86  178:astore          7
		obj = ((Object) (new DataInputStream(((java.io.InputStream) (new CipherInputStream(((java.io.InputStream) (obj)), cipher))))));
	//   87  180:new             #178 <Class DataInputStream>
	//   88  183:dup             
	//   89  184:new             #200 <Class CipherInputStream>
	//   90  187:dup             
	//   91  188:aload           5
	//   92  190:aload_0         
	//   93  191:getfield        #60  <Field Cipher cipher>
	//   94  194:invokespecial   #203 <Method void CipherInputStream(java.io.InputStream, Cipher)>
	//   95  197:invokespecial   #179 <Method void DataInputStream(java.io.InputStream)>
	//   96  200:astore          5
		  goto _L5
	//*  97  202:goto            261
		obj;
	//   98  205:astore          5
		obj2 = obj4;
	//   99  207:aload           8
	//  100  209:astore          6
		obj3 = obj4;
	//  101  211:aload           8
	//  102  213:astore          7
		int i;
		int j;
		int l;
		Object obj1;
		try
		{
			throw new IllegalStateException(((Throwable) (obj)));
	//  103  215:new             #71  <Class IllegalStateException>
	//  104  218:dup             
	//  105  219:aload           5
	//  106  221:invokespecial   #74  <Method void IllegalStateException(Throwable)>
	//  107  224:athrow          
		}
	//* 108  225:aload           8
	//* 109  227:astore          5
	//* 110  229:aload           8
	//* 111  231:astore          6
	//* 112  233:aload           8
	//* 113  235:astore          7
	//* 114  237:aload_0         
	//* 115  238:getfield        #48  <Field boolean encrypt>
	//* 116  241:ifeq            261
	//* 117  244:aload           8
	//* 118  246:astore          6
	//* 119  248:aload           8
	//* 120  250:astore          7
	//* 121  252:aload_0         
	//* 122  253:iconst_1        
	//* 123  254:putfield        #128 <Field boolean changed>
	//* 124  257:aload           8
	//* 125  259:astore          5
	//* 126  261:aload           5
	//* 127  263:astore          6
	//* 128  265:aload           5
	//* 129  267:astore          7
	//* 130  269:aload           5
	//* 131  271:invokevirtual   #182 <Method int DataInputStream.readInt()>
	//* 132  274:istore          4
	//* 133  276:iconst_0        
	//* 134  277:istore_2        
	//* 135  278:iload_2         
	//* 136  279:istore_1        
	//* 137  280:iload_2         
	//* 138  281:iload           4
	//* 139  283:icmpge          340
	//* 140  286:aload           5
	//* 141  288:astore          6
	//* 142  290:aload           5
	//* 143  292:astore          7
	//* 144  294:iload_3         
	//* 145  295:aload           5
	//* 146  297:invokestatic    #207 <Method CachedContent CachedContent.readFromStream(int, DataInputStream)>
	//* 147  300:astore          8
	//* 148  302:aload           5
	//* 149  304:astore          6
	//* 150  306:aload           5
	//* 151  308:astore          7
	//* 152  310:aload_0         
	//* 153  311:aload           8
	//* 154  313:invokespecial   #126 <Method void add(CachedContent)>
	//* 155  316:aload           5
	//* 156  318:astore          6
	//* 157  320:aload           5
	//* 158  322:astore          7
	//* 159  324:iload_1         
	//* 160  325:aload           8
	//* 161  327:iload_3         
	//* 162  328:invokevirtual   #210 <Method int CachedContent.headerHashCode(int)>
	//* 163  331:iadd            
	//* 164  332:istore_1        
	//* 165  333:iload_2         
	//* 166  334:iconst_1        
	//* 167  335:iadd            
	//* 168  336:istore_2        
	//* 169  337:goto            280
	//* 170  340:aload           5
	//* 171  342:astore          6
	//* 172  344:aload           5
	//* 173  346:astore          7
	//* 174  348:aload           5
	//* 175  350:invokevirtual   #182 <Method int DataInputStream.readInt()>
	//* 176  353:istore_3        
	//* 177  354:aload           5
	//* 178  356:astore          6
	//* 179  358:aload           5
	//* 180  360:astore          7
	//* 181  362:aload           5
	//* 182  364:invokevirtual   #213 <Method int DataInputStream.read()>
	//* 183  367:istore_2        
	//* 184  368:iload_2         
	//* 185  369:iconst_m1       
	//* 186  370:icmpne          378
	//* 187  373:iconst_1        
	//* 188  374:istore_2        
	//* 189  375:goto            380
	//* 190  378:iconst_0        
	//* 191  379:istore_2        
	//* 192  380:iload_3         
	//* 193  381:iload_1         
	//* 194  382:icmpne          404
	//* 195  385:iload_2         
	//* 196  386:ifne            392
	//* 197  389:goto            404
	//* 198  392:aload           5
	//* 199  394:ifnull          402
	//* 200  397:aload           5
	//* 201  399:invokestatic    #186 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 202  402:iconst_1        
	//* 203  403:ireturn         
	//* 204  404:aload           5
	//* 205  406:ifnull          414
	//* 206  409:aload           5
	//* 207  411:invokestatic    #186 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 208  414:iconst_0        
	//* 209  415:ireturn         
	//* 210  416:aload           8
	//* 211  418:ifnull          426
	//* 212  421:aload           8
	//* 213  423:invokestatic    #186 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 214  426:iconst_0        
	//* 215  427:ireturn         
	//* 216  428:astore          5
	//* 217  430:goto            438
	//* 218  433:astore          5
	//* 219  435:aconst_null     
	//* 220  436:astore          6
	//* 221  438:aload           6
	//* 222  440:ifnull          448
	//* 223  443:aload           6
	//* 224  445:invokestatic    #186 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 225  448:aload           5
	//* 226  450:athrow          
	//* 227  451:aconst_null     
	//* 228  452:astore          7
	//* 229  454:aload           7
	//* 230  456:ifnull          464
	//* 231  459:aload           7
	//* 232  461:invokestatic    #186 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 233  464:iconst_0        
	//* 234  465:ireturn         
	//* 235  466:astore          5
	//* 236  468:goto            451
		catch(IOException ioexception) { }
	//  237  471:astore          5
		  goto _L6
_L4:
		obj = obj4;
		obj2 = obj4;
		obj3 = obj4;
		if(!encrypt) goto _L5; else goto _L7
_L7:
		obj2 = obj4;
		obj3 = obj4;
		changed = true;
		obj = obj4;
_L5:
		obj2 = obj;
		obj3 = obj;
		l = ((DataInputStream) (obj)).readInt();
		j = 0;
		i = j;
_L9:
		if(j >= l)
			break; /* Loop/switch isn't completed */
		obj2 = obj;
		obj3 = obj;
		obj4 = ((Object) (CachedContent.readFromStream(k, ((DataInputStream) (obj)))));
		obj2 = obj;
		obj3 = obj;
		add(((CachedContent) (obj4)));
		obj2 = obj;
		obj3 = obj;
		i += ((CachedContent) (obj4)).headerHashCode(k);
		j++;
		if(true) goto _L9; else goto _L8
_L8:
		obj2 = obj;
		obj3 = obj;
		k = ((DataInputStream) (obj)).readInt();
		obj2 = obj;
		obj3 = obj;
		j = ((DataInputStream) (obj)).read();
		boolean flag;
		if(j == -1)
			flag = true;
		else
			flag = false;
		if(k == i && flag)
		{
			if(obj != null)
				Util.closeQuietly(((java.io.Closeable) (obj)));
			return true;
		}
		if(obj != null)
			Util.closeQuietly(((java.io.Closeable) (obj)));
		return false;
_L1:
		if(obj4 != null)
			Util.closeQuietly(((java.io.Closeable) (obj4)));
		return false;
		obj1;
		break MISSING_BLOCK_LABEL_438;
		obj1;
		obj2 = null;
		if(obj2 != null)
			Util.closeQuietly(((java.io.Closeable) (obj2)));
		throw obj1;
_L11:
		obj3 = null;
_L6:
		if(obj3 != null)
			Util.closeQuietly(((java.io.Closeable) (obj3)));
		return false;
		obj1;
		if(true) goto _L11; else goto _L10
_L10:
	//* 238  473:goto            454
	}

	private void writeFile()
		throws Cache.CacheException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #218 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #220 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #225 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void applyContentMetadataMutations(String s, ContentMetadataMutations contentmetadatamutations)
	{
		if(getOrAdd(s).applyMetadataMutations(contentmetadatamutations))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #230 <Method CachedContent getOrAdd(String)>
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #234 <Method boolean CachedContent.applyMetadataMutations(ContentMetadataMutations)>
	//*   5    9:ifeq            17
			changed = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #128 <Field boolean changed>
	//    9   17:return          
	}

	public int assignIdForKey(String s)
	{
		return getOrAdd(s).id;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #230 <Method CachedContent getOrAdd(String)>
	//    3    5:getfield        #112 <Field int CachedContent.id>
	//    4    8:ireturn         
	}

	public CachedContent get(String s)
	{
		return (CachedContent)keyToContent.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field HashMap keyToContent>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #240 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #102 <Class CachedContent>
	//    5   11:areturn         
	}

	public Collection getAll()
	{
		return keyToContent.values();
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field HashMap keyToContent>
	//    2    4:invokevirtual   #245 <Method Collection HashMap.values()>
	//    3    7:areturn         
	}

	public ContentMetadata getContentMetadata(String s)
	{
		s = ((String) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #250 <Method CachedContent get(String)>
	//    3    5:astore_1        
		if(s != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			return ((CachedContent) (s)).getMetadata();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #254 <Method ContentMetadata CachedContent.getMetadata()>
	//    8   14:areturn         
		else
			return ((ContentMetadata) (DefaultContentMetadata.EMPTY));
	//    9   15:getstatic       #260 <Field DefaultContentMetadata DefaultContentMetadata.EMPTY>
	//   10   18:areturn         
	}

	public String getKeyForId(int i)
	{
		return (String)idToKey.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field SparseArray idToKey>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #265 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #267 <Class String>
	//    5   11:areturn         
	}

	public Set getKeys()
	{
		return keyToContent.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field HashMap keyToContent>
	//    2    4:invokevirtual   #272 <Method Set HashMap.keySet()>
	//    3    7:areturn         
	}

	public CachedContent getOrAdd(String s)
	{
		CachedContent cachedcontent1 = (CachedContent)keyToContent.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field HashMap keyToContent>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #240 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #102 <Class CachedContent>
	//    5   11:astore_3        
		CachedContent cachedcontent = cachedcontent1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(cachedcontent1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       24
			cachedcontent = addNew(s);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #275 <Method CachedContent addNew(String)>
	//   13   23:astore_2        
		return cachedcontent;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public void load()
	{
		Assertions.checkState(changed ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field boolean changed>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #77  <Method void Assertions.checkState(boolean)>
		if(!readFile())
	//*   5    9:aload_0         
	//*   6   10:invokespecial   #278 <Method boolean readFile()>
	//*   7   13:ifne            37
		{
			atomicFile.delete();
	//    8   16:aload_0         
	//    9   17:getfield        #98  <Field AtomicFile atomicFile>
	//   10   20:invokevirtual   #281 <Method void AtomicFile.delete()>
			keyToContent.clear();
	//   11   23:aload_0         
	//   12   24:getfield        #82  <Field HashMap keyToContent>
	//   13   27:invokevirtual   #284 <Method void HashMap.clear()>
			idToKey.clear();
	//   14   30:aload_0         
	//   15   31:getfield        #87  <Field SparseArray idToKey>
	//   16   34:invokevirtual   #285 <Method void SparseArray.clear()>
		}
	//   17   37:return          
	}

	public void maybeRemove(String s)
	{
		CachedContent cachedcontent = (CachedContent)keyToContent.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field HashMap keyToContent>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #240 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #102 <Class CachedContent>
	//    5   11:astore_2        
		if(cachedcontent != null && cachedcontent.isEmpty() && !cachedcontent.isLocked())
	//*   6   12:aload_2         
	//*   7   13:ifnull          55
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #289 <Method boolean CachedContent.isEmpty()>
	//*  10   20:ifeq            55
	//*  11   23:aload_2         
	//*  12   24:invokevirtual   #292 <Method boolean CachedContent.isLocked()>
	//*  13   27:ifne            55
		{
			keyToContent.remove(((Object) (s)));
	//   14   30:aload_0         
	//   15   31:getfield        #82  <Field HashMap keyToContent>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #295 <Method Object HashMap.remove(Object)>
	//   18   38:pop             
			idToKey.remove(cachedcontent.id);
	//   19   39:aload_0         
	//   20   40:getfield        #87  <Field SparseArray idToKey>
	//   21   43:aload_2         
	//   22   44:getfield        #112 <Field int CachedContent.id>
	//   23   47:invokevirtual   #298 <Method void SparseArray.remove(int)>
			changed = true;
	//   24   50:aload_0         
	//   25   51:iconst_1        
	//   26   52:putfield        #128 <Field boolean changed>
		}
	//   27   55:return          
	}

	public void removeEmpty()
	{
		String as[] = new String[keyToContent.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field HashMap keyToContent>
	//    2    4:invokevirtual   #300 <Method int HashMap.size()>
	//    3    7:anewarray       String[]
	//    4   10:astore_3        
		keyToContent.keySet().toArray(((Object []) (as)));
	//    5   11:aload_0         
	//    6   12:getfield        #82  <Field HashMap keyToContent>
	//    7   15:invokevirtual   #272 <Method Set HashMap.keySet()>
	//    8   18:aload_3         
	//    9   19:invokeinterface #306 <Method Object[] Set.toArray(Object[])>
	//   10   24:pop             
		int i = 0;
	//   11   25:iconst_0        
	//   12   26:istore_1        
		for(int j = as.length; i < j; i++)
	//*  13   27:aload_3         
	//*  14   28:arraylength     
	//*  15   29:istore_2        
	//*  16   30:iload_1         
	//*  17   31:iload_2         
	//*  18   32:icmpge          49
			maybeRemove(as[i]);
	//   19   35:aload_0         
	//   20   36:aload_3         
	//   21   37:iload_1         
	//   22   38:aaload          
	//   23   39:invokevirtual   #308 <Method void maybeRemove(String)>

	//   24   42:iload_1         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_1        
	//*  28   46:goto            30
	//   29   49:return          
	}

	public void store()
		throws Cache.CacheException
	{
		if(!changed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field boolean changed>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			writeFile();
	//    4    8:aload_0         
	//    5    9:invokespecial   #311 <Method void writeFile()>
			changed = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #128 <Field boolean changed>
			return;
	//    9   17:return          
		}
	}

	public static final String FILE_NAME = "cached_content_index.exi";
	private static final int FLAG_ENCRYPTED_INDEX = 1;
	private static final int VERSION = 2;
	private final AtomicFile atomicFile;
	private ReusableBufferedOutputStream bufferedOutputStream;
	private boolean changed;
	private final Cipher cipher;
	private final boolean encrypt;
	private final SparseArray idToKey;
	private final HashMap keyToContent;
	private final SecretKeySpec secretKeySpec;
}
