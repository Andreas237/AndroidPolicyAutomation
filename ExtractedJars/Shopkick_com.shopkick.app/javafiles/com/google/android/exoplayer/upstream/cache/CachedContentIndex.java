// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream.cache;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer.util.*;
import java.io.*;
import java.security.*;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//			CachedContent

final class CachedContentIndex
{

	public CachedContentIndex(File file)
	{
		this(file, ((byte []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #36  <Method void CachedContentIndex(File, byte[])>
	//    4    6:return          
	}

	public CachedContentIndex(File file, byte abyte0[])
	{
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
			if(abyte0 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          66
			{
				boolean flag;
				if(abyte0.length == 16)
	//*   4    8:aload_2         
	//*   5    9:arraylength     
	//*   6   10:bipush          16
	//*   7   12:icmpne          20
					flag = true;
	//    8   15:iconst_1        
	//    9   16:istore_3        
				else
	//*  10   17:goto            22
					flag = false;
	//   11   20:iconst_0        
	//   12   21:istore_3        
				Assertions.checkArgument(flag);
	//   13   22:iload_3         
	//   14   23:invokestatic    #50  <Method void Assertions.checkArgument(boolean)>
				try
				{
					cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	//   15   26:aload_0         
	//   16   27:ldc1            #52  <String "AES/CBC/PKCS5PADDING">
	//   17   29:invokestatic    #58  <Method Cipher Cipher.getInstance(String)>
	//   18   32:putfield        #60  <Field Cipher cipher>
					secretKeySpec = new SecretKeySpec(abyte0, "AES");
	//   19   35:aload_0         
	//   20   36:new             #62  <Class SecretKeySpec>
	//   21   39:dup             
	//   22   40:aload_2         
	//   23   41:ldc1            #64  <String "AES">
	//   24   43:invokespecial   #67  <Method void SecretKeySpec(byte[], String)>
	//   25   46:putfield        #69  <Field SecretKeySpec secretKeySpec>
					break label0;
	//   26   49:goto            76
				}
	//*  27   52:astore_1        
	//*  28   53:goto            57
				// Misplaced declaration of an exception variable
				catch(File file) { }
	//   29   56:astore_1        
				// Misplaced declaration of an exception variable
				catch(File file) { }
				throw new IllegalStateException(((Throwable) (file)));
	//   30   57:new             #71  <Class IllegalStateException>
	//   31   60:dup             
	//   32   61:aload_1         
	//   33   62:invokespecial   #74  <Method void IllegalStateException(Throwable)>
	//   34   65:athrow          
			}
			cipher = null;
	//   35   66:aload_0         
	//   36   67:aconst_null     
	//   37   68:putfield        #60  <Field Cipher cipher>
			secretKeySpec = null;
	//   38   71:aload_0         
	//   39   72:aconst_null     
	//   40   73:putfield        #69  <Field SecretKeySpec secretKeySpec>
		}
		keyToContent = new HashMap();
	//   41   76:aload_0         
	//   42   77:new             #76  <Class HashMap>
	//   43   80:dup             
	//   44   81:invokespecial   #77  <Method void HashMap()>
	//   45   84:putfield        #79  <Field HashMap keyToContent>
		idToKey = new SparseArray();
	//   46   87:aload_0         
	//   47   88:new             #81  <Class SparseArray>
	//   48   91:dup             
	//   49   92:invokespecial   #82  <Method void SparseArray()>
	//   50   95:putfield        #84  <Field SparseArray idToKey>
		atomicFile = new AtomicFile(new File(file, "cached_content_index.exi"));
	//   51   98:aload_0         
	//   52   99:new             #86  <Class AtomicFile>
	//   53  102:dup             
	//   54  103:new             #88  <Class File>
	//   55  106:dup             
	//   56  107:aload_1         
	//   57  108:ldc1            #8   <String "cached_content_index.exi">
	//   58  110:invokespecial   #91  <Method void File(File, String)>
	//   59  113:invokespecial   #93  <Method void AtomicFile(File)>
	//   60  116:putfield        #95  <Field AtomicFile atomicFile>
	//   61  119:return          
	}

	private void add(CachedContent cachedcontent)
	{
		keyToContent.put(((Object) (cachedcontent.key)), ((Object) (cachedcontent)));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field HashMap keyToContent>
	//    2    4:aload_1         
	//    3    5:getfield        #102 <Field String CachedContent.key>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #106 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
		idToKey.put(cachedcontent.id, ((Object) (cachedcontent.key)));
	//    7   13:aload_0         
	//    8   14:getfield        #84  <Field SparseArray idToKey>
	//    9   17:aload_1         
	//   10   18:getfield        #109 <Field int CachedContent.id>
	//   11   21:aload_1         
	//   12   22:getfield        #102 <Field String CachedContent.key>
	//   13   25:invokevirtual   #112 <Method void SparseArray.put(int, Object)>
	//   14   28:return          
	}

	private CachedContent addNew(String s, long l)
	{
		s = ((String) (new CachedContent(getNewId(idToKey), s, l)));
	//    0    0:new             #99  <Class CachedContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field SparseArray idToKey>
	//    4    8:invokestatic    #118 <Method int getNewId(SparseArray)>
	//    5   11:aload_1         
	//    6   12:lload_2         
	//    7   13:invokespecial   #121 <Method void CachedContent(int, String, long)>
	//    8   16:astore_1        
		addNew(((CachedContent) (s)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #123 <Method void addNew(CachedContent)>
		return ((CachedContent) (s));
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public static int getNewId(SparseArray sparsearray)
	{
		int l = sparsearray.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method int SparseArray.size()>
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
	//   12   18:invokevirtual   #131 <Method int SparseArray.keyAt(int)>
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
	//*  30   42:invokevirtual   #131 <Method int SparseArray.keyAt(int)>
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
		Object obj1;
		Object obj2;
		Object obj3;
		CachedContent cachedcontent;
		Object obj4;
		cachedcontent = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		obj4 = null;
	//    2    3:aconst_null     
	//    3    4:astore          9
		obj = null;
	//    4    6:aconst_null     
	//    5    7:astore          4
		obj1 = obj;
	//    6    9:aload           4
	//    7   11:astore          5
		obj2 = ((Object) (cachedcontent));
	//    8   13:aload           8
	//    9   15:astore          6
		obj3 = ((Object) (obj4));
	//   10   17:aload           9
	//   11   19:astore          7
		BufferedInputStream bufferedinputstream = new BufferedInputStream(atomicFile.openRead());
	//   12   21:new             #145 <Class BufferedInputStream>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:getfield        #95  <Field AtomicFile atomicFile>
	//   16   29:invokevirtual   #149 <Method java.io.InputStream AtomicFile.openRead()>
	//   17   32:invokespecial   #152 <Method void BufferedInputStream(java.io.InputStream)>
	//   18   35:astore          10
		obj1 = obj;
	//   19   37:aload           4
	//   20   39:astore          5
		obj2 = ((Object) (cachedcontent));
	//   21   41:aload           8
	//   22   43:astore          6
		obj3 = ((Object) (obj4));
	//   23   45:aload           9
	//   24   47:astore          7
		obj = ((Object) (new DataInputStream(((java.io.InputStream) (bufferedinputstream)))));
	//   25   49:new             #154 <Class DataInputStream>
	//   26   52:dup             
	//   27   53:aload           10
	//   28   55:invokespecial   #155 <Method void DataInputStream(java.io.InputStream)>
	//   29   58:astore          4
		obj1 = obj;
	//   30   60:aload           4
	//   31   62:astore          5
		int i = ((DataInputStream) (obj)).readInt();
	//   32   64:aload           4
	//   33   66:invokevirtual   #158 <Method int DataInputStream.readInt()>
	//   34   69:istore_1        
		if(i != 1)
	//*  35   70:iload_1         
	//*  36   71:iconst_1        
	//*  37   72:icmpeq          82
		{
			Util.closeQuietly(((java.io.Closeable) (obj)));
	//   38   75:aload           4
	//   39   77:invokestatic    #164 <Method void Util.closeQuietly(java.io.Closeable)>
			return false;
	//   40   80:iconst_0        
	//   41   81:ireturn         
		}
		obj1 = obj;
	//   42   82:aload           4
	//   43   84:astore          5
		if((((DataInputStream) (obj)).readInt() & 1) == 0) goto _L2; else goto _L1
	//   44   86:aload           4
	//   45   88:invokevirtual   #158 <Method int DataInputStream.readInt()>
	//   46   91:iconst_1        
	//   47   92:iand            
	//   48   93:ifeq            219
_L1:
		obj1 = obj;
	//   49   96:aload           4
	//   50   98:astore          5
		obj2 = ((Object) (cipher));
	//   51  100:aload_0         
	//   52  101:getfield        #60  <Field Cipher cipher>
	//   53  104:astore          6
		if(obj2 == null)
	//*  54  106:aload           6
	//*  55  108:ifnonnull       118
		{
			Util.closeQuietly(((java.io.Closeable) (obj)));
	//   56  111:aload           4
	//   57  113:invokestatic    #164 <Method void Util.closeQuietly(java.io.Closeable)>
			return false;
	//   58  116:iconst_0        
	//   59  117:ireturn         
		}
		obj1 = obj;
	//   60  118:aload           4
	//   61  120:astore          5
		obj2 = ((Object) (new byte[16]));
	//   62  122:bipush          16
	//   63  124:newarray        byte[]
	//   64  126:astore          6
		obj1 = obj;
	//   65  128:aload           4
	//   66  130:astore          5
		((DataInputStream) (obj)).readFully(((byte []) (obj2)));
	//   67  132:aload           4
	//   68  134:aload           6
	//   69  136:invokevirtual   #168 <Method void DataInputStream.readFully(byte[])>
		obj1 = obj;
	//   70  139:aload           4
	//   71  141:astore          5
		obj2 = ((Object) (new IvParameterSpec(((byte []) (obj2)))));
	//   72  143:new             #170 <Class IvParameterSpec>
	//   73  146:dup             
	//   74  147:aload           6
	//   75  149:invokespecial   #172 <Method void IvParameterSpec(byte[])>
	//   76  152:astore          6
		obj1 = obj;
	//   77  154:aload           4
	//   78  156:astore          5
		cipher.init(2, ((java.security.Key) (secretKeySpec)), ((java.security.spec.AlgorithmParameterSpec) (obj2)));
	//   79  158:aload_0         
	//   80  159:getfield        #60  <Field Cipher cipher>
	//   81  162:iconst_2        
	//   82  163:aload_0         
	//   83  164:getfield        #69  <Field SecretKeySpec secretKeySpec>
	//   84  167:aload           6
	//   85  169:invokevirtual   #176 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
		obj1 = obj;
	//   86  172:aload           4
	//   87  174:astore          5
		obj2 = ((Object) (new DataInputStream(((java.io.InputStream) (new CipherInputStream(((java.io.InputStream) (bufferedinputstream)), cipher))))));
	//   88  176:new             #154 <Class DataInputStream>
	//   89  179:dup             
	//   90  180:new             #178 <Class CipherInputStream>
	//   91  183:dup             
	//   92  184:aload           10
	//   93  186:aload_0         
	//   94  187:getfield        #60  <Field Cipher cipher>
	//   95  190:invokespecial   #181 <Method void CipherInputStream(java.io.InputStream, Cipher)>
	//   96  193:invokespecial   #155 <Method void DataInputStream(java.io.InputStream)>
	//   97  196:astore          6
		obj = obj2;
	//   98  198:aload           6
	//   99  200:astore          4
		  goto _L3
	//* 100  202:goto            239
_L11:
		obj1 = obj;
	//  101  205:aload           4
	//  102  207:astore          5
		int j;
		int k;
		FileNotFoundException filenotfoundexception;
		try
		{
			throw new IllegalStateException(((Throwable) (obj2)));
	//  103  209:new             #71  <Class IllegalStateException>
	//  104  212:dup             
	//  105  213:aload           6
	//  106  215:invokespecial   #74  <Method void IllegalStateException(Throwable)>
	//  107  218:athrow          
		}
	//* 108  219:aload           4
	//* 109  221:astore          5
	//* 110  223:aload_0         
	//* 111  224:getfield        #60  <Field Cipher cipher>
	//* 112  227:ifnull          239
	//* 113  230:aload           4
	//* 114  232:astore          5
	//* 115  234:aload_0         
	//* 116  235:iconst_1        
	//* 117  236:putfield        #183 <Field boolean changed>
	//* 118  239:aload           4
	//* 119  241:astore          5
	//* 120  243:aload           4
	//* 121  245:astore          6
	//* 122  247:aload           4
	//* 123  249:astore          7
	//* 124  251:aload           4
	//* 125  253:invokevirtual   #158 <Method int DataInputStream.readInt()>
	//* 126  256:istore_3        
	//* 127  257:iconst_0        
	//* 128  258:istore_2        
	//* 129  259:iload_2         
	//* 130  260:istore_1        
	//* 131  261:iload_2         
	//* 132  262:iload_3         
	//* 133  263:icmpge          334
	//* 134  266:aload           4
	//* 135  268:astore          5
	//* 136  270:aload           4
	//* 137  272:astore          6
	//* 138  274:aload           4
	//* 139  276:astore          7
	//* 140  278:new             #99  <Class CachedContent>
	//* 141  281:dup             
	//* 142  282:aload           4
	//* 143  284:invokespecial   #186 <Method void CachedContent(DataInputStream)>
	//* 144  287:astore          8
	//* 145  289:aload           4
	//* 146  291:astore          5
	//* 147  293:aload           4
	//* 148  295:astore          6
	//* 149  297:aload           4
	//* 150  299:astore          7
	//* 151  301:aload_0         
	//* 152  302:aload           8
	//* 153  304:invokespecial   #188 <Method void add(CachedContent)>
	//* 154  307:aload           4
	//* 155  309:astore          5
	//* 156  311:aload           4
	//* 157  313:astore          6
	//* 158  315:aload           4
	//* 159  317:astore          7
	//* 160  319:iload_1         
	//* 161  320:aload           8
	//* 162  322:invokevirtual   #191 <Method int CachedContent.headerHashCode()>
	//* 163  325:iadd            
	//* 164  326:istore_1        
	//* 165  327:iload_2         
	//* 166  328:iconst_1        
	//* 167  329:iadd            
	//* 168  330:istore_2        
	//* 169  331:goto            261
	//* 170  334:aload           4
	//* 171  336:astore          5
	//* 172  338:aload           4
	//* 173  340:astore          6
	//* 174  342:aload           4
	//* 175  344:astore          7
	//* 176  346:aload           4
	//* 177  348:invokevirtual   #158 <Method int DataInputStream.readInt()>
	//* 178  351:istore_2        
	//* 179  352:iload_2         
	//* 180  353:iload_1         
	//* 181  354:icmpeq          364
	//* 182  357:aload           4
	//* 183  359:invokestatic    #164 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 184  362:iconst_0        
	//* 185  363:ireturn         
	//* 186  364:aload           4
	//* 187  366:invokestatic    #164 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 188  369:iconst_1        
	//* 189  370:ireturn         
	//* 190  371:astore          6
	//* 191  373:goto            391
	//* 192  376:astore          4
	//* 193  378:goto            419
	//* 194  381:astore          5
	//* 195  383:aload           6
	//* 196  385:astore          4
	//* 197  387:aload           5
	//* 198  389:astore          6
	//* 199  391:aload           4
	//* 200  393:astore          5
	//* 201  395:ldc1            #14  <String "CachedContentIndex">
	//* 202  397:ldc1            #193 <String "Error reading cache content index file.">
	//* 203  399:aload           6
	//* 204  401:invokestatic    #199 <Method int Log.e(String, String, Throwable)>
	//* 205  404:pop             
	//* 206  405:aload           4
	//* 207  407:ifnull          415
	//* 208  410:aload           4
	//* 209  412:invokestatic    #164 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 210  415:iconst_0        
	//* 211  416:ireturn         
	//* 212  417:astore          4
	//* 213  419:aload           5
	//* 214  421:ifnull          429
	//* 215  424:aload           5
	//* 216  426:invokestatic    #164 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 217  429:aload           4
	//* 218  431:athrow          
	//* 219  432:aload           7
	//* 220  434:astore          4
	//* 221  436:aload           4
	//* 222  438:ifnull          446
	//* 223  441:aload           4
	//* 224  443:invokestatic    #164 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 225  446:iconst_0        
	//* 226  447:ireturn         
	//* 227  448:astore          4
	//* 228  450:goto            432
		catch(FileNotFoundException filenotfoundexception1) { }
	//  229  453:astore          5
		// Misplaced declaration of an exception variable
		catch(Object obj2)
		{
			break MISSING_BLOCK_LABEL_391;
		}
		  goto _L4
_L2:
		obj1 = obj;
		if(cipher == null) goto _L3; else goto _L5
_L5:
		obj1 = obj;
		changed = true;
_L3:
		obj1 = obj;
		obj2 = obj;
		obj3 = obj;
		k = ((DataInputStream) (obj)).readInt();
		j = 0;
		i = j;
_L7:
		if(j >= k)
			break; /* Loop/switch isn't completed */
		obj1 = obj;
		obj2 = obj;
		obj3 = obj;
		cachedcontent = new CachedContent(((DataInputStream) (obj)));
		obj1 = obj;
		obj2 = obj;
		obj3 = obj;
		add(cachedcontent);
		obj1 = obj;
		obj2 = obj;
		obj3 = obj;
		i += cachedcontent.headerHashCode();
		j++;
		if(true) goto _L7; else goto _L6
_L6:
		obj1 = obj;
		obj2 = obj;
		obj3 = obj;
		j = ((DataInputStream) (obj)).readInt();
		if(j != i)
		{
			Util.closeQuietly(((java.io.Closeable) (obj)));
			return false;
		} else
		{
			Util.closeQuietly(((java.io.Closeable) (obj)));
			return true;
		}
		obj;
		break MISSING_BLOCK_LABEL_419;
		obj1;
		obj = obj2;
		obj2 = obj1;
		obj1 = obj;
		Log.e("CachedContentIndex", "Error reading cache content index file.", ((Throwable) (obj2)));
		if(obj != null)
			Util.closeQuietly(((java.io.Closeable) (obj)));
		return false;
		obj;
		if(obj1 != null)
			Util.closeQuietly(((java.io.Closeable) (obj1)));
		throw obj;
_L9:
		obj = obj3;
_L4:
		if(obj != null)
			Util.closeQuietly(((java.io.Closeable) (obj)));
		return false;
		filenotfoundexception;
		if(true) goto _L9; else goto _L8
	//* 230  455:goto            436
_L8:
		obj2;
	//  231  458:astore          6
		continue; /* Loop/switch isn't completed */
	//  232  460:goto            205
		obj2;
	//  233  463:astore          6
		if(true) goto _L11; else goto _L10
	//  234  465:goto            205
_L10:
	}

	private void writeFile()
		throws Cache.CacheException
	{
		Object obj;
		obj = ((Object) (atomicFile.startWrite()));
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field AtomicFile atomicFile>
	//    2    4:invokevirtual   #206 <Method java.io.OutputStream AtomicFile.startWrite()>
	//    3    7:astore_3        
		if(bufferedOutputStream == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #208 <Field ReusableBufferedOutputStream bufferedOutputStream>
	//*   6   12:ifnonnull       30
		{
			bufferedOutputStream = new ReusableBufferedOutputStream(((java.io.OutputStream) (obj)));
	//    7   15:aload_0         
	//    8   16:new             #210 <Class ReusableBufferedOutputStream>
	//    9   19:dup             
	//   10   20:aload_3         
	//   11   21:invokespecial   #213 <Method void ReusableBufferedOutputStream(java.io.OutputStream)>
	//   12   24:putfield        #208 <Field ReusableBufferedOutputStream bufferedOutputStream>
			break MISSING_BLOCK_LABEL_38;
	//   13   27:goto            38
		}
		bufferedOutputStream.reset(((java.io.OutputStream) (obj)));
	//   14   30:aload_0         
	//   15   31:getfield        #208 <Field ReusableBufferedOutputStream bufferedOutputStream>
	//   16   34:aload_3         
	//   17   35:invokevirtual   #216 <Method void ReusableBufferedOutputStream.reset(java.io.OutputStream)>
		Object obj4 = ((Object) (new DataOutputStream(((java.io.OutputStream) (bufferedOutputStream)))));
	//   18   38:new             #218 <Class DataOutputStream>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:getfield        #208 <Field ReusableBufferedOutputStream bufferedOutputStream>
	//   22   46:invokespecial   #219 <Method void DataOutputStream(java.io.OutputStream)>
	//   23   49:astore          6
		Object obj3;
		obj3 = obj4;
	//   24   51:aload           6
	//   25   53:astore          5
		obj = obj4;
	//   26   55:aload           6
	//   27   57:astore_3        
		((DataOutputStream) (obj4)).writeInt(1);
	//   28   58:aload           6
	//   29   60:iconst_1        
	//   30   61:invokevirtual   #223 <Method void DataOutputStream.writeInt(int)>
		obj3 = obj4;
	//   31   64:aload           6
	//   32   66:astore          5
		obj = obj4;
	//   33   68:aload           6
	//   34   70:astore_3        
		Object obj1 = ((Object) (cipher));
	//   35   71:aload_0         
	//   36   72:getfield        #60  <Field Cipher cipher>
	//   37   75:astore          4
		boolean flag = false;
	//   38   77:iconst_0        
	//   39   78:istore_2        
		int i;
		Object obj2;
		Exception exception;
		CachedContent cachedcontent;
		if(obj1 != null)
	//*  40   79:aload           4
	//*  41   81:ifnull          456
			i = 1;
	//   42   84:iconst_1        
	//   43   85:istore_1        
		else
	//*  44   86:goto            89
	//*  45   89:aload           6
	//*  46   91:astore          5
	//*  47   93:aload           6
	//*  48   95:astore_3        
	//*  49   96:aload           6
	//*  50   98:iload_1         
	//*  51   99:invokevirtual   #223 <Method void DataOutputStream.writeInt(int)>
	//*  52  102:aload           6
	//*  53  104:astore          4
	//*  54  106:aload           6
	//*  55  108:astore          5
	//*  56  110:aload           6
	//*  57  112:astore_3        
	//*  58  113:aload_0         
	//*  59  114:getfield        #60  <Field Cipher cipher>
	//*  60  117:ifnull          268
	//*  61  120:aload           6
	//*  62  122:astore          5
	//*  63  124:aload           6
	//*  64  126:astore_3        
	//*  65  127:bipush          16
	//*  66  129:newarray        byte[]
	//*  67  131:astore          4
	//*  68  133:aload           6
	//*  69  135:astore          5
	//*  70  137:aload           6
	//*  71  139:astore_3        
	//*  72  140:new             #225 <Class Random>
	//*  73  143:dup             
	//*  74  144:invokespecial   #226 <Method void Random()>
	//*  75  147:aload           4
	//*  76  149:invokevirtual   #229 <Method void Random.nextBytes(byte[])>
	//*  77  152:aload           6
	//*  78  154:astore          5
	//*  79  156:aload           6
	//*  80  158:astore_3        
	//*  81  159:aload           6
	//*  82  161:aload           4
	//*  83  163:invokevirtual   #232 <Method void DataOutputStream.write(byte[])>
	//*  84  166:aload           6
	//*  85  168:astore          5
	//*  86  170:aload           6
	//*  87  172:astore_3        
	//*  88  173:new             #170 <Class IvParameterSpec>
	//*  89  176:dup             
	//*  90  177:aload           4
	//*  91  179:invokespecial   #172 <Method void IvParameterSpec(byte[])>
	//*  92  182:astore          4
	//*  93  184:aload           6
	//*  94  186:astore          5
	//*  95  188:aload           6
	//*  96  190:astore_3        
	//*  97  191:aload_0         
	//*  98  192:getfield        #60  <Field Cipher cipher>
	//*  99  195:iconst_1        
	//* 100  196:aload_0         
	//* 101  197:getfield        #69  <Field SecretKeySpec secretKeySpec>
	//* 102  200:aload           4
	//* 103  202:invokevirtual   #176 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
	//* 104  205:aload           6
	//* 105  207:astore          5
	//* 106  209:aload           6
	//* 107  211:astore_3        
	//* 108  212:aload           6
	//* 109  214:invokevirtual   #235 <Method void DataOutputStream.flush()>
	//* 110  217:aload           6
	//* 111  219:astore          5
	//* 112  221:aload           6
	//* 113  223:astore_3        
	//* 114  224:new             #218 <Class DataOutputStream>
	//* 115  227:dup             
	//* 116  228:new             #237 <Class CipherOutputStream>
	//* 117  231:dup             
	//* 118  232:aload_0         
	//* 119  233:getfield        #208 <Field ReusableBufferedOutputStream bufferedOutputStream>
	//* 120  236:aload_0         
	//* 121  237:getfield        #60  <Field Cipher cipher>
	//* 122  240:invokespecial   #240 <Method void CipherOutputStream(java.io.OutputStream, Cipher)>
	//* 123  243:invokespecial   #219 <Method void DataOutputStream(java.io.OutputStream)>
	//* 124  246:astore          4
	//* 125  248:goto            268
	//* 126  251:aload           6
	//* 127  253:astore          5
	//* 128  255:aload           6
	//* 129  257:astore_3        
	//* 130  258:new             #71  <Class IllegalStateException>
	//* 131  261:dup             
	//* 132  262:aload           4
	//* 133  264:invokespecial   #74  <Method void IllegalStateException(Throwable)>
	//* 134  267:athrow          
	//* 135  268:aload           4
	//* 136  270:astore          5
	//* 137  272:aload           4
	//* 138  274:astore_3        
	//* 139  275:aload           4
	//* 140  277:aload_0         
	//* 141  278:getfield        #79  <Field HashMap keyToContent>
	//* 142  281:invokevirtual   #241 <Method int HashMap.size()>
	//* 143  284:invokevirtual   #223 <Method void DataOutputStream.writeInt(int)>
	//* 144  287:aload           4
	//* 145  289:astore          5
	//* 146  291:aload           4
	//* 147  293:astore_3        
	//* 148  294:aload_0         
	//* 149  295:getfield        #79  <Field HashMap keyToContent>
	//* 150  298:invokevirtual   #245 <Method Collection HashMap.values()>
	//* 151  301:invokeinterface #251 <Method Iterator Collection.iterator()>
	//* 152  306:astore          6
	//* 153  308:iload_2         
	//* 154  309:istore_1        
	//* 155  310:aload           4
	//* 156  312:astore          5
	//* 157  314:aload           4
	//* 158  316:astore_3        
	//* 159  317:aload           6
	//* 160  319:invokeinterface #256 <Method boolean Iterator.hasNext()>
	//* 161  324:ifeq            378
	//* 162  327:aload           4
	//* 163  329:astore          5
	//* 164  331:aload           4
	//* 165  333:astore_3        
	//* 166  334:aload           6
	//* 167  336:invokeinterface #260 <Method Object Iterator.next()>
	//* 168  341:checkcast       #99  <Class CachedContent>
	//* 169  344:astore          7
	//* 170  346:aload           4
	//* 171  348:astore          5
	//* 172  350:aload           4
	//* 173  352:astore_3        
	//* 174  353:aload           7
	//* 175  355:aload           4
	//* 176  357:invokevirtual   #264 <Method void CachedContent.writeToStream(DataOutputStream)>
	//* 177  360:aload           4
	//* 178  362:astore          5
	//* 179  364:aload           4
	//* 180  366:astore_3        
	//* 181  367:iload_1         
	//* 182  368:aload           7
	//* 183  370:invokevirtual   #191 <Method int CachedContent.headerHashCode()>
	//* 184  373:iadd            
	//* 185  374:istore_1        
	//* 186  375:goto            310
	//* 187  378:aload           4
	//* 188  380:astore          5
	//* 189  382:aload           4
	//* 190  384:astore_3        
	//* 191  385:aload           4
	//* 192  387:iload_1         
	//* 193  388:invokevirtual   #223 <Method void DataOutputStream.writeInt(int)>
	//* 194  391:aload           4
	//* 195  393:astore          5
	//* 196  395:aload           4
	//* 197  397:astore_3        
	//* 198  398:aload_0         
	//* 199  399:getfield        #95  <Field AtomicFile atomicFile>
	//* 200  402:aload           4
	//* 201  404:invokevirtual   #267 <Method void AtomicFile.endWrite(java.io.OutputStream)>
	//* 202  407:aconst_null     
	//* 203  408:invokestatic    #164 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 204  411:return          
	//* 205  412:astore          4
	//* 206  414:aload           5
	//* 207  416:astore_3        
	//* 208  417:goto            431
	//* 209  420:astore_3        
	//* 210  421:aconst_null     
	//* 211  422:astore          4
	//* 212  424:goto            449
	//* 213  427:astore          4
	//* 214  429:aconst_null     
	//* 215  430:astore_3        
	//* 216  431:new             #202 <Class Cache$CacheException>
	//* 217  434:dup             
	//* 218  435:aload           4
	//* 219  437:invokespecial   #270 <Method void Cache$CacheException(IOException)>
	//* 220  440:athrow          
	//* 221  441:astore          5
	//* 222  443:aload_3         
	//* 223  444:astore          4
	//* 224  446:aload           5
	//* 225  448:astore_3        
	//* 226  449:aload           4
	//* 227  451:invokestatic    #164 <Method void Util.closeQuietly(java.io.Closeable)>
	//* 228  454:aload_3         
	//* 229  455:athrow          
			i = 0;
	//  230  456:iconst_0        
	//  231  457:istore_1        
		obj3 = obj4;
		obj = obj4;
		((DataOutputStream) (obj4)).writeInt(i);
		obj1 = obj4;
		obj3 = obj4;
		obj = obj4;
		if(cipher == null) goto _L2; else goto _L1
_L1:
		obj3 = obj4;
		obj = obj4;
		obj1 = ((Object) (new byte[16]));
		obj3 = obj4;
		obj = obj4;
		(new Random()).nextBytes(((byte []) (obj1)));
		obj3 = obj4;
		obj = obj4;
		((DataOutputStream) (obj4)).write(((byte []) (obj1)));
		obj3 = obj4;
		obj = obj4;
		obj1 = ((Object) (new IvParameterSpec(((byte []) (obj1)))));
		obj3 = obj4;
		obj = obj4;
		cipher.init(1, ((java.security.Key) (secretKeySpec)), ((java.security.spec.AlgorithmParameterSpec) (obj1)));
		obj3 = obj4;
		obj = obj4;
		((DataOutputStream) (obj4)).flush();
		obj3 = obj4;
		obj = obj4;
		obj1 = ((Object) (new DataOutputStream(((java.io.OutputStream) (new CipherOutputStream(((java.io.OutputStream) (bufferedOutputStream)), cipher))))));
		  goto _L2
_L8:
		obj3 = obj4;
		obj = obj4;
		try
		{
			throw new IllegalStateException(((Throwable) (obj1)));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj2)
		{
			obj = obj3;
		}
		  goto _L3
_L2:
		obj3 = obj1;
		obj = obj1;
		((DataOutputStream) (obj1)).writeInt(keyToContent.size());
		obj3 = obj1;
		obj = obj1;
		obj4 = ((Object) (keyToContent.values().iterator()));
		i = ((int) (flag));
_L5:
		obj3 = obj1;
		obj = obj1;
		if(!((Iterator) (obj4)).hasNext())
			break; /* Loop/switch isn't completed */
		obj3 = obj1;
		obj = obj1;
		cachedcontent = (CachedContent)((Iterator) (obj4)).next();
		obj3 = obj1;
		obj = obj1;
		cachedcontent.writeToStream(((DataOutputStream) (obj1)));
		obj3 = obj1;
		obj = obj1;
		i += cachedcontent.headerHashCode();
		if(true) goto _L5; else goto _L4
_L4:
		obj3 = obj1;
		obj = obj1;
		((DataOutputStream) (obj1)).writeInt(i);
		obj3 = obj1;
		obj = obj1;
		atomicFile.endWrite(((java.io.OutputStream) (obj1)));
		Util.closeQuietly(((java.io.Closeable) (null)));
		return;
		obj;
		obj2 = null;
		  goto _L6
		obj2;
		obj = null;
_L3:
		throw new Cache.CacheException(((IOException) (obj2)));
		exception;
		obj2 = obj;
		obj = ((Object) (exception));
_L6:
		Util.closeQuietly(((java.io.Closeable) (obj2)));
		throw obj;
	//* 232  458:goto            89
		obj2;
	//  233  461:astore          4
		continue; /* Loop/switch isn't completed */
	//  234  463:goto            251
		obj2;
	//  235  466:astore          4
		if(true) goto _L8; else goto _L7
	//  236  468:goto            251
_L7:
	}

	public CachedContent add(String s)
	{
		CachedContent cachedcontent1 = (CachedContent)keyToContent.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field HashMap keyToContent>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #276 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #99  <Class CachedContent>
	//    5   11:astore_3        
		CachedContent cachedcontent = cachedcontent1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(cachedcontent1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       27
			cachedcontent = addNew(s, -1L);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc2w           #277 <Long -1L>
	//   13   23:invokespecial   #280 <Method CachedContent addNew(String, long)>
	//   14   26:astore_2        
		return cachedcontent;
	//   15   27:aload_2         
	//   16   28:areturn         
	}

	void addNew(CachedContent cachedcontent)
	{
		add(cachedcontent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #188 <Method void add(CachedContent)>
		changed = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #183 <Field boolean changed>
	//    6   10:return          
	}

	public int assignIdForKey(String s)
	{
		return add(s).id;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #284 <Method CachedContent add(String)>
	//    3    5:getfield        #109 <Field int CachedContent.id>
	//    4    8:ireturn         
	}

	public CachedContent get(String s)
	{
		return (CachedContent)keyToContent.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field HashMap keyToContent>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #276 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #99  <Class CachedContent>
	//    5   11:areturn         
	}

	public Collection getAll()
	{
		return keyToContent.values();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field HashMap keyToContent>
	//    2    4:invokevirtual   #245 <Method Collection HashMap.values()>
	//    3    7:areturn         
	}

	public long getContentLength(String s)
	{
		s = ((String) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #290 <Method CachedContent get(String)>
	//    3    5:astore_1        
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       14
			return -1L;
	//    6   10:ldc2w           #277 <Long -1L>
	//    7   13:lreturn         
		else
			return ((CachedContent) (s)).getLength();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #294 <Method long CachedContent.getLength()>
	//   10   18:lreturn         
	}

	public String getKeyForId(int i)
	{
		return (String)idToKey.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SparseArray idToKey>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #299 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #301 <Class String>
	//    5   11:areturn         
	}

	public Set getKeys()
	{
		return keyToContent.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field HashMap keyToContent>
	//    2    4:invokevirtual   #306 <Method Set HashMap.keySet()>
	//    3    7:areturn         
	}

	public void load()
	{
		Assertions.checkState(changed ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field boolean changed>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #311 <Method void Assertions.checkState(boolean)>
		if(!readFile())
	//*   5    9:aload_0         
	//*   6   10:invokespecial   #313 <Method boolean readFile()>
	//*   7   13:ifne            37
		{
			atomicFile.delete();
	//    8   16:aload_0         
	//    9   17:getfield        #95  <Field AtomicFile atomicFile>
	//   10   20:invokevirtual   #316 <Method void AtomicFile.delete()>
			keyToContent.clear();
	//   11   23:aload_0         
	//   12   24:getfield        #79  <Field HashMap keyToContent>
	//   13   27:invokevirtual   #319 <Method void HashMap.clear()>
			idToKey.clear();
	//   14   30:aload_0         
	//   15   31:getfield        #84  <Field SparseArray idToKey>
	//   16   34:invokevirtual   #320 <Method void SparseArray.clear()>
		}
	//   17   37:return          
	}

	public void removeEmpty()
	{
		Object obj = ((Object) (new LinkedList()));
	//    0    0:new             #323 <Class LinkedList>
	//    1    3:dup             
	//    2    4:invokespecial   #324 <Method void LinkedList()>
	//    3    7:astore_1        
		Iterator iterator = keyToContent.values().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #79  <Field HashMap keyToContent>
	//    6   12:invokevirtual   #245 <Method Collection HashMap.values()>
	//    7   15:invokeinterface #251 <Method Iterator Collection.iterator()>
	//    8   20:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   21:aload_2         
	//   10   22:invokeinterface #256 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            59
			CachedContent cachedcontent = (CachedContent)iterator.next();
	//   12   30:aload_2         
	//   13   31:invokeinterface #260 <Method Object Iterator.next()>
	//   14   36:checkcast       #99  <Class CachedContent>
	//   15   39:astore_3        
			if(cachedcontent.isEmpty())
	//*  16   40:aload_3         
	//*  17   41:invokevirtual   #327 <Method boolean CachedContent.isEmpty()>
	//*  18   44:ifeq            21
				((LinkedList) (obj)).add(((Object) (cachedcontent.key)));
	//   19   47:aload_1         
	//   20   48:aload_3         
	//   21   49:getfield        #102 <Field String CachedContent.key>
	//   22   52:invokevirtual   #330 <Method boolean LinkedList.add(Object)>
	//   23   55:pop             
		} while(true);
	//   24   56:goto            21
		for(obj = ((Object) (((LinkedList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); removeEmpty((String)((Iterator) (obj)).next()));
	//   25   59:aload_1         
	//   26   60:invokevirtual   #331 <Method Iterator LinkedList.iterator()>
	//   27   63:astore_1        
	//   28   64:aload_1         
	//   29   65:invokeinterface #256 <Method boolean Iterator.hasNext()>
	//   30   70:ifeq            89
	//   31   73:aload_0         
	//   32   74:aload_1         
	//   33   75:invokeinterface #260 <Method Object Iterator.next()>
	//   34   80:checkcast       #301 <Class String>
	//   35   83:invokevirtual   #334 <Method void removeEmpty(String)>
	//*  36   86:goto            64
	//   37   89:return          
	}

	public void removeEmpty(String s)
	{
		s = ((String) ((CachedContent)keyToContent.remove(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field HashMap keyToContent>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #337 <Method Object HashMap.remove(Object)>
	//    4    8:checkcast       #99  <Class CachedContent>
	//    5   11:astore_1        
		if(s != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          39
		{
			Assertions.checkState(((CachedContent) (s)).isEmpty());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #327 <Method boolean CachedContent.isEmpty()>
	//   10   20:invokestatic    #311 <Method void Assertions.checkState(boolean)>
			idToKey.remove(((CachedContent) (s)).id);
	//   11   23:aload_0         
	//   12   24:getfield        #84  <Field SparseArray idToKey>
	//   13   27:aload_1         
	//   14   28:getfield        #109 <Field int CachedContent.id>
	//   15   31:invokevirtual   #339 <Method void SparseArray.remove(int)>
			changed = true;
	//   16   34:aload_0         
	//   17   35:iconst_1        
	//   18   36:putfield        #183 <Field boolean changed>
		}
	//   19   39:return          
	}

	public void setContentLength(String s, long l)
	{
		CachedContent cachedcontent = get(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #290 <Method CachedContent get(String)>
	//    3    5:astore          4
		if(cachedcontent != null)
	//*   4    7:aload           4
	//*   5    9:ifnull          34
		{
			if(cachedcontent.getLength() != l)
	//*   6   12:aload           4
	//*   7   14:invokevirtual   #294 <Method long CachedContent.getLength()>
	//*   8   17:lload_2         
	//*   9   18:lcmp            
	//*  10   19:ifeq            41
			{
				cachedcontent.setLength(l);
	//   11   22:aload           4
	//   12   24:lload_2         
	//   13   25:invokevirtual   #345 <Method void CachedContent.setLength(long)>
				changed = true;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #183 <Field boolean changed>
				return;
	//   17   33:return          
			}
		} else
		{
			addNew(s, l);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:lload_2         
	//   21   37:invokespecial   #280 <Method CachedContent addNew(String, long)>
	//   22   40:pop             
		}
	//   23   41:return          
	}

	public void store()
		throws Cache.CacheException
	{
		if(!changed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field boolean changed>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			writeFile();
	//    4    8:aload_0         
	//    5    9:invokespecial   #348 <Method void writeFile()>
			changed = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #183 <Field boolean changed>
			return;
	//    9   17:return          
		}
	}

	public static final String FILE_NAME = "cached_content_index.exi";
	private static final int FLAG_ENCRYPTED_INDEX = 1;
	private static final String TAG = "CachedContentIndex";
	private static final int VERSION = 1;
	private final AtomicFile atomicFile;
	private ReusableBufferedOutputStream bufferedOutputStream;
	private boolean changed;
	private final Cipher cipher;
	private final SparseArray idToKey;
	private final HashMap keyToContent;
	private final SecretKeySpec secretKeySpec;
}
