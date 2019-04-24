// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.zip.GZIPInputStream;

// Referenced classes of package o:
//			im, in

public final class jk
{

	protected jk(im im1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		e = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field File e>
		c = im1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #19  <Field im c>
	//    8   14:return          
	}

	private static int a(int i, int j, int k)
	{
		for(i += (k - 1) * 1500; i >= j; i -= 1500);
	//    0    0:iload_0         
	//    1    1:iload_2         
	//    2    2:iconst_1        
	//    3    3:isub            
	//    4    4:sipush          1500
	//    5    7:imul            
	//    6    8:iadd            
	//    7    9:istore_0        
	//    8   10:iload_0         
	//    9   11:iload_1         
	//   10   12:icmplt          24
	//   11   15:iload_0         
	//   12   16:sipush          1500
	//   13   19:isub            
	//   14   20:istore_0        
	//*  15   21:goto            10
		return i;
	//   16   24:iload_0         
	//   17   25:ireturn         
	}

	private ArrayList b(int i, int j)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #27  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void ArrayList()>
	//    3    7:astore          4
_L3:
		if(i > j) goto _L2; else goto _L1
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:icmpgt          108
_L1:
		int k;
		a.seek(i);
	//    7   14:aload_0         
	//    8   15:getfield        #30  <Field RandomAccessFile a>
	//    9   18:iload_1         
	//   10   19:i2l             
	//   11   20:invokevirtual   #36  <Method void RandomAccessFile.seek(long)>
		k = a.readInt();
	//   12   23:aload_0         
	//   13   24:getfield        #30  <Field RandomAccessFile a>
	//   14   27:invokevirtual   #40  <Method int RandomAccessFile.readInt()>
	//   15   30:istore_3        
		a.readLong();
	//   16   31:aload_0         
	//   17   32:getfield        #30  <Field RandomAccessFile a>
	//   18   35:invokevirtual   #44  <Method long RandomAccessFile.readLong()>
	//   19   38:pop2            
		if(k <= 0 || k > 1500)
	//*  20   39:iload_3         
	//*  21   40:ifle            50
	//*  22   43:iload_3         
	//*  23   44:sipush          1500
	//*  24   47:icmple          52
			return null;
	//   25   50:aconst_null     
	//   26   51:areturn         
		byte abyte0[];
		abyte0 = new byte[k];
	//   27   52:iload_3         
	//   28   53:newarray        byte[]
	//   29   55:astore          5
		a.read(abyte0);
	//   30   57:aload_0         
	//   31   58:getfield        #30  <Field RandomAccessFile a>
	//   32   61:aload           5
	//   33   63:invokevirtual   #48  <Method int RandomAccessFile.read(byte[])>
	//   34   66:pop             
		k = ((int) (e(abyte0)));
	//   35   67:aload           5
	//   36   69:invokestatic    #51  <Method byte e(byte[])>
	//   37   72:istore_3        
		if(k != 3 && k != 4 && k != 41)
	//*  38   73:iload_3         
	//*  39   74:iconst_3        
	//*  40   75:icmpeq          91
	//*  41   78:iload_3         
	//*  42   79:iconst_4        
	//*  43   80:icmpeq          91
	//*  44   83:iload_3         
	//*  45   84:bipush          41
	//*  46   86:icmpeq          91
			return null;
	//   47   89:aconst_null     
	//   48   90:areturn         
		try
		{
			arraylist.add(((Object) (abyte0)));
	//   49   91:aload           4
	//   50   93:aload           5
	//   51   95:invokevirtual   #55  <Method boolean ArrayList.add(Object)>
	//   52   98:pop             
		}
	//*  53   99:iload_1         
	//*  54  100:sipush          1500
	//*  55  103:iadd            
	//*  56  104:istore_1        
	//*  57  105:goto            9
	//*  58  108:aload           4
	//*  59  110:areturn         
		catch(IOException ioexception) { }
	//   60  111:astore          5
		i += 1500;
		if(true) goto _L3; else goto _L2
	//   61  113:goto            99
_L2:
		return arraylist;
	}

	private BitSet c()
	{
		byte abyte0[] = new byte[c.a()];
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field im c>
	//    2    4:invokevirtual   #60  <Method int im.a()>
	//    3    7:newarray        byte[]
	//    4    9:astore_1        
		BitSet bitset;
		try
		{
			a.read(abyte0);
	//    5   10:aload_0         
	//    6   11:getfield        #30  <Field RandomAccessFile a>
	//    7   14:aload_1         
	//    8   15:invokevirtual   #48  <Method int RandomAccessFile.read(byte[])>
	//    9   18:pop             
			bitset = im.c(abyte0);
	//   10   19:aload_1         
	//   11   20:invokestatic    #63  <Method BitSet im.c(byte[])>
	//   12   23:astore_1        
		}
	//*  13   24:aload_1         
	//*  14   25:areturn         
		catch(IOException ioexception)
	//*  15   26:astore_1        
		{
			return null;
	//   16   27:aconst_null     
	//   17   28:areturn         
		}
		return bitset;
	}

	private static byte e(byte abyte0[])
	{
		byte abyte1[];
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		abyte1 = ((byte []) (obj));
	//    2    2:aload_3         
	//    3    3:astore_2        
		ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
	//    4    4:new             #67  <Class ByteArrayInputStream>
	//    5    7:dup             
	//    6    8:aload_0         
	//    7    9:invokespecial   #70  <Method void ByteArrayInputStream(byte[])>
	//    8   12:astore          4
		abyte1 = ((byte []) (obj));
	//    9   14:aload_3         
	//   10   15:astore_2        
		GZIPInputStream gzipinputstream = new GZIPInputStream(((java.io.InputStream) (bytearrayinputstream)));
	//   11   16:new             #72  <Class GZIPInputStream>
	//   12   19:dup             
	//   13   20:aload           4
	//   14   22:invokespecial   #75  <Method void GZIPInputStream(java.io.InputStream)>
	//   15   25:astore          5
		abyte1 = ((byte []) (obj));
	//   16   27:aload_3         
	//   17   28:astore_2        
		abyte0 = new byte[1024];
	//   18   29:sipush          1024
	//   19   32:newarray        byte[]
	//   20   34:astore_0        
		abyte1 = ((byte []) (obj));
	//   21   35:aload_3         
	//   22   36:astore_2        
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//   23   37:new             #77  <Class ByteArrayOutputStream>
	//   24   40:dup             
	//   25   41:invokespecial   #78  <Method void ByteArrayOutputStream()>
	//   26   44:astore          6
_L2:
		abyte1 = ((byte []) (obj));
	//   27   46:aload_3         
	//   28   47:astore_2        
		int i = abyte0.length;
	//   29   48:aload_0         
	//   30   49:arraylength     
	//   31   50:istore_1        
		abyte1 = ((byte []) (obj));
	//   32   51:aload_3         
	//   33   52:astore_2        
		i = gzipinputstream.read(abyte0, 0, 1024);
	//   34   53:aload           5
	//   35   55:aload_0         
	//   36   56:iconst_0        
	//   37   57:sipush          1024
	//   38   60:invokevirtual   #81  <Method int GZIPInputStream.read(byte[], int, int)>
	//   39   63:istore_1        
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   40   64:iload_1         
	//   41   65:iconst_m1       
	//   42   66:icmpeq          82
		abyte1 = ((byte []) (obj));
	//   43   69:aload_3         
	//   44   70:astore_2        
		bytearrayoutputstream.write(abyte0, 0, i);
	//   45   71:aload           6
	//   46   73:aload_0         
	//   47   74:iconst_0        
	//   48   75:iload_1         
	//   49   76:invokevirtual   #85  <Method void ByteArrayOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//   50   79:goto            46
_L1:
		abyte1 = ((byte []) (obj));
	//   51   82:aload_3         
	//   52   83:astore_2        
		abyte0 = bytearrayoutputstream.toByteArray();
	//   53   84:aload           6
	//   54   86:invokevirtual   #89  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   55   89:astore_0        
		abyte1 = abyte0;
	//   56   90:aload_0         
	//   57   91:astore_2        
		bytearrayoutputstream.flush();
	//   58   92:aload           6
	//   59   94:invokevirtual   #92  <Method void ByteArrayOutputStream.flush()>
		abyte1 = abyte0;
	//   60   97:aload_0         
	//   61   98:astore_2        
		bytearrayoutputstream.close();
	//   62   99:aload           6
	//   63  101:invokevirtual   #95  <Method void ByteArrayOutputStream.close()>
		abyte1 = abyte0;
	//   64  104:aload_0         
	//   65  105:astore_2        
		gzipinputstream.close();
	//   66  106:aload           5
	//   67  108:invokevirtual   #96  <Method void GZIPInputStream.close()>
		abyte1 = abyte0;
	//   68  111:aload_0         
	//   69  112:astore_2        
		try
		{
			bytearrayinputstream.close();
	//   70  113:aload           4
	//   71  115:invokevirtual   #97  <Method void ByteArrayInputStream.close()>
		}
	//*  72  118:goto            124
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  73  121:astore_0        
		{
			abyte0 = abyte1;
	//   74  122:aload_2         
	//   75  123:astore_0        
		}
		return abyte0[0];
	//   76  124:aload_0         
	//   77  125:iconst_0        
	//   78  126:baload          
	//   79  127:ireturn         
	}

	private int e(BitSet bitset)
	{
		for(int i = 0; i < bitset.length(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokevirtual   #103 <Method int BitSet.length()>
	//*   5    7:icmpge          41
			if(bitset.get(i))
	//*   6   10:aload_1         
	//*   7   11:iload_2         
	//*   8   12:invokevirtual   #107 <Method boolean BitSet.get(int)>
	//*   9   15:ifeq            34
				return i * 1500 + 4 + c.a();
	//   10   18:iload_2         
	//   11   19:sipush          1500
	//   12   22:imul            
	//   13   23:iconst_4        
	//   14   24:iadd            
	//   15   25:aload_0         
	//   16   26:getfield        #19  <Field im c>
	//   17   29:invokevirtual   #60  <Method int im.a()>
	//   18   32:iadd            
	//   19   33:ireturn         

	//   20   34:iload_2         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_2        
	//*  24   38:goto            2
		return 0;
	//   25   41:iconst_0        
	//   26   42:ireturn         
	}

	protected final int d()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		int j;
		int j1;
		boolean flag;
		boolean flag1;
		j = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		j1 = 0;
	//    4    4:iconst_0        
	//    5    5:istore          6
		flag = false;
	//    6    7:iconst_0        
	//    7    8:istore          7
		flag1 = false;
	//    8   10:iconst_0        
	//    9   11:istore          8
		i = 0;
	//   10   13:iconst_0        
	//   11   14:istore_1        
		e = c.c();
	//   12   15:aload_0         
	//   13   16:aload_0         
	//   14   17:getfield        #19  <Field im c>
	//   15   20:invokevirtual   #115 <Method File im.c()>
	//   16   23:putfield        #17  <Field File e>
		int k;
		int l;
		int i1;
		k = j1;
	//   17   26:iload           6
	//   18   28:istore_3        
		l = ((int) (flag));
	//   19   29:iload           7
	//   20   31:istore          4
		i1 = ((int) (flag1));
	//   21   33:iload           8
	//   22   35:istore          5
		if(e == null) goto _L2; else goto _L1
	//   23   37:aload_0         
	//   24   38:getfield        #17  <Field File e>
	//   25   41:ifnull          198
_L1:
		k = j1;
	//   26   44:iload           6
	//   27   46:istore_3        
		l = ((int) (flag));
	//   28   47:iload           7
	//   29   49:istore          4
		i1 = ((int) (flag1));
	//   30   51:iload           8
	//   31   53:istore          5
		a = new RandomAccessFile(c.c(), "rw");
	//   32   55:aload_0         
	//   33   56:new             #32  <Class RandomAccessFile>
	//   34   59:dup             
	//   35   60:aload_0         
	//   36   61:getfield        #19  <Field im c>
	//   37   64:invokevirtual   #115 <Method File im.c()>
	//   38   67:ldc1            #117 <String "rw">
	//   39   69:invokespecial   #120 <Method void RandomAccessFile(File, String)>
	//   40   72:putfield        #30  <Field RandomAccessFile a>
		k = j1;
	//   41   75:iload           6
	//   42   77:istore_3        
		l = ((int) (flag));
	//   43   78:iload           7
	//   44   80:istore          4
		i1 = ((int) (flag1));
	//   45   82:iload           8
	//   46   84:istore          5
		byte abyte0[] = new byte[c.a()];
	//   47   86:aload_0         
	//   48   87:getfield        #19  <Field im c>
	//   49   90:invokevirtual   #60  <Method int im.a()>
	//   50   93:newarray        byte[]
	//   51   95:astore          10
		k = j1;
	//   52   97:iload           6
	//   53   99:istore_3        
		l = ((int) (flag));
	//   54  100:iload           7
	//   55  102:istore          4
		i1 = ((int) (flag1));
	//   56  104:iload           8
	//   57  106:istore          5
		a.read(abyte0);
	//   58  108:aload_0         
	//   59  109:getfield        #30  <Field RandomAccessFile a>
	//   60  112:aload           10
	//   61  114:invokevirtual   #48  <Method int RandomAccessFile.read(byte[])>
	//   62  117:pop             
		k = j1;
	//   63  118:iload           6
	//   64  120:istore_3        
		l = ((int) (flag));
	//   65  121:iload           7
	//   66  123:istore          4
		i1 = ((int) (flag1));
	//   67  125:iload           8
	//   68  127:istore          5
		Object obj = ((Object) (im.c(abyte0)));
	//   69  129:aload           10
	//   70  131:invokestatic    #63  <Method BitSet im.c(byte[])>
	//   71  134:astore          10
		j1 = 0;
	//   72  136:iconst_0        
	//   73  137:istore          6
_L3:
		j = i;
	//   74  139:iload_1         
	//   75  140:istore_2        
		k = i;
	//   76  141:iload_1         
	//   77  142:istore_3        
		l = i;
	//   78  143:iload_1         
	//   79  144:istore          4
		i1 = i;
	//   80  146:iload_1         
	//   81  147:istore          5
		if(j1 >= ((BitSet) (obj)).size())
			break; /* Loop/switch isn't completed */
	//   82  149:iload           6
	//   83  151:aload           10
	//   84  153:invokevirtual   #123 <Method int BitSet.size()>
	//   85  156:icmpge          198
		k = i;
	//   86  159:iload_1         
	//   87  160:istore_3        
		l = i;
	//   88  161:iload_1         
	//   89  162:istore          4
		i1 = i;
	//   90  164:iload_1         
	//   91  165:istore          5
		boolean flag2 = ((BitSet) (obj)).get(j1);
	//   92  167:aload           10
	//   93  169:iload           6
	//   94  171:invokevirtual   #107 <Method boolean BitSet.get(int)>
	//   95  174:istore          9
		j = i;
	//   96  176:iload_1         
	//   97  177:istore_2        
		if(flag2)
	//*  98  178:iload           9
	//*  99  180:ifeq            187
			j = i + 1;
	//  100  183:iload_1         
	//  101  184:iconst_1        
	//  102  185:iadd            
	//  103  186:istore_2        
		j1++;
	//  104  187:iload           6
	//  105  189:iconst_1        
	//  106  190:iadd            
	//  107  191:istore          6
		i = j;
	//  108  193:iload_2         
	//  109  194:istore_1        
		if(true) goto _L3; else goto _L2
	//  110  195:goto            139
_L2:
		obj = ((Object) (a));
	//  111  198:aload_0         
	//  112  199:getfield        #30  <Field RandomAccessFile a>
	//  113  202:astore          10
		i = j;
	//  114  204:iload_2         
	//  115  205:istore_1        
		if(obj == null) goto _L5; else goto _L4
	//  116  206:aload           10
	//  117  208:ifnull          347
_L4:
		a.close();
	//  118  211:aload_0         
	//  119  212:getfield        #30  <Field RandomAccessFile a>
	//  120  215:invokevirtual   #124 <Method void RandomAccessFile.close()>
		i = j;
	//  121  218:iload_2         
	//  122  219:istore_1        
		  goto _L5
	//* 123  220:goto            347
_L12:
		i = j;
	//  124  223:iload_2         
	//  125  224:istore_1        
		  goto _L5
	//* 126  225:goto            347
_L9:
		obj = ((Object) (a));
	//  127  228:aload_0         
	//  128  229:getfield        #30  <Field RandomAccessFile a>
	//  129  232:astore          10
		i = k;
	//  130  234:iload_3         
	//  131  235:istore_1        
		if(obj == null) goto _L5; else goto _L6
	//  132  236:aload           10
	//  133  238:ifnull          347
_L6:
		a.close();
	//  134  241:aload_0         
	//  135  242:getfield        #30  <Field RandomAccessFile a>
	//  136  245:invokevirtual   #124 <Method void RandomAccessFile.close()>
		i = k;
	//  137  248:iload_3         
	//  138  249:istore_1        
		  goto _L5
	//* 139  250:goto            347
_L13:
		i = k;
	//  140  253:iload_3         
	//  141  254:istore_1        
		  goto _L5
	//* 142  255:goto            347
_L10:
		obj = ((Object) (a));
	//  143  258:aload_0         
	//  144  259:getfield        #30  <Field RandomAccessFile a>
	//  145  262:astore          10
		i = l;
	//  146  264:iload           4
	//  147  266:istore_1        
		if(obj == null) goto _L5; else goto _L7
	//  148  267:aload           10
	//  149  269:ifnull          347
_L7:
		a.close();
	//  150  272:aload_0         
	//  151  273:getfield        #30  <Field RandomAccessFile a>
	//  152  276:invokevirtual   #124 <Method void RandomAccessFile.close()>
		i = l;
	//  153  279:iload           4
	//  154  281:istore_1        
		  goto _L5
	//* 155  282:goto            347
_L14:
		i = l;
	//  156  285:iload           4
	//  157  287:istore_1        
		  goto _L5
	//* 158  288:goto            347
_L11:
		obj = ((Object) (a));
	//  159  291:aload_0         
	//  160  292:getfield        #30  <Field RandomAccessFile a>
	//  161  295:astore          10
		i = i1;
	//  162  297:iload           5
	//  163  299:istore_1        
		if(obj == null) goto _L5; else goto _L8
	//  164  300:aload           10
	//  165  302:ifnull          347
_L8:
		a.close();
	//  166  305:aload_0         
	//  167  306:getfield        #30  <Field RandomAccessFile a>
	//  168  309:invokevirtual   #124 <Method void RandomAccessFile.close()>
		i = i1;
	//  169  312:iload           5
	//  170  314:istore_1        
		  goto _L5
	//* 171  315:goto            347
_L15:
		i = i1;
	//  172  318:iload           5
	//  173  320:istore_1        
		  goto _L5
	//* 174  321:goto            347
		Object obj1;
		obj1;
	//  175  324:astore          10
		RandomAccessFile randomaccessfile = a;
	//  176  326:aload_0         
	//  177  327:getfield        #30  <Field RandomAccessFile a>
	//  178  330:astore          11
		if(randomaccessfile == null)
			break MISSING_BLOCK_LABEL_344;
	//  179  332:aload           11
	//  180  334:ifnull          344
		try
		{
			a.close();
	//  181  337:aload_0         
	//  182  338:getfield        #30  <Field RandomAccessFile a>
	//  183  341:invokevirtual   #124 <Method void RandomAccessFile.close()>
		}
	//* 184  344:aload           10
	//* 185  346:athrow          
	//* 186  347:aload_0         
	//* 187  348:aconst_null     
	//* 188  349:putfield        #17  <Field File e>
	//* 189  352:aload_0         
	//* 190  353:monitorexit     
	//* 191  354:iload_1         
	//* 192  355:ireturn         
	//* 193  356:astore          10
	//* 194  358:aload_0         
	//* 195  359:monitorexit     
	//* 196  360:aload           10
	//* 197  362:athrow          
	//* 198  363:astore          10
	//* 199  365:goto            228
	//* 200  368:astore          10
	//* 201  370:goto            258
	//* 202  373:astore          10
	//* 203  375:goto            291
	//* 204  378:astore          10
	//* 205  380:goto            223
	//* 206  383:astore          10
	//* 207  385:goto            253
	//* 208  388:astore          10
	//* 209  390:goto            285
	//* 210  393:astore          10
	//* 211  395:goto            318
		catch(IOException ioexception) { }
	//  212  398:astore          11
		throw obj1;
_L5:
		e = null;
		this;
		JVM INSTR monitorexit ;
		return i;
		obj1;
		throw obj1;
		obj1;
		  goto _L9
		obj1;
		  goto _L10
		obj1;
		  goto _L11
		obj1;
		  goto _L12
		obj1;
		  goto _L13
		obj1;
		  goto _L14
		obj1;
		  goto _L15
	//* 213  400:goto            344
	}

	protected final in e(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(c != null)
			break MISSING_BLOCK_LABEL_13;
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field im c>
	//    4    6:ifnonnull       13
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		this;
	//    9   13:aload_0         
		JVM INSTR monitorenter ;
	//   10   14:monitorenter    
		Object obj2 = null;
	//   11   15:aconst_null     
	//   12   16:astore          4
		Object obj;
		e = c.c();
	//   13   18:aload_0         
	//   14   19:aload_0         
	//   15   20:getfield        #19  <Field im c>
	//   16   23:invokevirtual   #115 <Method File im.c()>
	//   17   26:putfield        #17  <Field File e>
		obj = ((Object) (e));
	//   18   29:aload_0         
	//   19   30:getfield        #17  <Field File e>
	//   20   33:astore_3        
		if(obj != null)
			break MISSING_BLOCK_LABEL_44;
	//   21   34:aload_3         
	//   22   35:ifnonnull       44
		this;
	//   23   38:aload_0         
		JVM INSTR monitorexit ;
	//   24   39:monitorexit     
	//*  25   40:aload_0         
		return null;
	//   26   41:monitorexit     
	//   27   42:aconst_null     
	//   28   43:areturn         
		a = new RandomAccessFile(e, "rw");
	//   29   44:aload_0         
	//   30   45:new             #32  <Class RandomAccessFile>
	//   31   48:dup             
	//   32   49:aload_0         
	//   33   50:getfield        #17  <Field File e>
	//   34   53:ldc1            #117 <String "rw">
	//   35   55:invokespecial   #120 <Method void RandomAccessFile(File, String)>
	//   36   58:putfield        #30  <Field RandomAccessFile a>
		obj = ((Object) (c()));
	//   37   61:aload_0         
	//   38   62:invokespecial   #127 <Method BitSet c()>
	//   39   65:astore_3        
		if(obj != null)
			break MISSING_BLOCK_LABEL_100;
	//   40   66:aload_3         
	//   41   67:ifnonnull       100
		e.delete();
	//   42   70:aload_0         
	//   43   71:getfield        #17  <Field File e>
	//   44   74:invokevirtual   #133 <Method boolean File.delete()>
	//   45   77:pop             
		obj = ((Object) (a));
	//   46   78:aload_0         
	//   47   79:getfield        #30  <Field RandomAccessFile a>
	//   48   82:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_94;
	//   49   83:aload_3         
	//   50   84:ifnull          94
		int j;
		Object obj1;
		RandomAccessFile randomaccessfile;
		try
		{
			a.close();
	//   51   87:aload_0         
	//   52   88:getfield        #30  <Field RandomAccessFile a>
	//   53   91:invokevirtual   #124 <Method void RandomAccessFile.close()>
		}
	//*  54   94:aload_0         
	//*  55   95:monitorexit     
	//*  56   96:aload_0         
	//*  57   97:monitorexit     
	//*  58   98:aconst_null     
	//*  59   99:areturn         
	//*  60  100:aload_0         
	//*  61  101:aload_3         
	//*  62  102:invokespecial   #135 <Method int e(BitSet)>
	//*  63  105:istore_2        
	//*  64  106:iload_2         
	//*  65  107:aload_0         
	//*  66  108:getfield        #17  <Field File e>
	//*  67  111:invokevirtual   #137 <Method long File.length()>
	//*  68  114:l2i             
	//*  69  115:iload_1         
	//*  70  116:invokestatic    #139 <Method int a(int, int, int)>
	//*  71  119:istore_1        
	//*  72  120:aload_0         
	//*  73  121:iload_2         
	//*  74  122:iload_1         
	//*  75  123:invokespecial   #141 <Method ArrayList b(int, int)>
	//*  76  126:astore_3        
	//*  77  127:aload_3         
	//*  78  128:ifnonnull       161
	//*  79  131:aload_0         
	//*  80  132:getfield        #17  <Field File e>
	//*  81  135:invokevirtual   #133 <Method boolean File.delete()>
	//*  82  138:pop             
	//*  83  139:aload_0         
	//*  84  140:getfield        #30  <Field RandomAccessFile a>
	//*  85  143:astore_3        
	//*  86  144:aload_3         
	//*  87  145:ifnull          155
	//*  88  148:aload_0         
	//*  89  149:getfield        #30  <Field RandomAccessFile a>
	//*  90  152:invokevirtual   #124 <Method void RandomAccessFile.close()>
	//*  91  155:aload_0         
	//*  92  156:monitorexit     
	//*  93  157:aload_0         
	//*  94  158:monitorexit     
	//*  95  159:aconst_null     
	//*  96  160:areturn         
	//*  97  161:iload_2         
	//*  98  162:aload_0         
	//*  99  163:getfield        #19  <Field im c>
	//* 100  166:invokevirtual   #60  <Method int im.a()>
	//* 101  169:isub            
	//* 102  170:iconst_4        
	//* 103  171:isub            
	//* 104  172:sipush          1500
	//* 105  175:idiv            
	//* 106  176:istore_2        
	//* 107  177:iload_1         
	//* 108  178:aload_0         
	//* 109  179:getfield        #19  <Field im c>
	//* 110  182:invokevirtual   #60  <Method int im.a()>
	//* 111  185:isub            
	//* 112  186:iconst_4        
	//* 113  187:isub            
	//* 114  188:sipush          1500
	//* 115  191:idiv            
	//* 116  192:istore_1        
	//* 117  193:new             #143 <Class in>
	//* 118  196:dup             
	//* 119  197:aload_0         
	//* 120  198:getfield        #17  <Field File e>
	//* 121  201:aload_3         
	//* 122  202:iconst_2        
	//* 123  203:newarray        int[]
	//* 124  205:dup             
	//* 125  206:iconst_0        
	//* 126  207:iload_2         
	//* 127  208:iastore         
	//* 128  209:dup             
	//* 129  210:iconst_1        
	//* 130  211:iload_1         
	//* 131  212:iastore         
	//* 132  213:invokespecial   #146 <Method void in(File, ArrayList, int[])>
	//* 133  216:astore_3        
	//* 134  217:aload_3         
	//* 135  218:astore          4
	//* 136  220:aload_0         
	//* 137  221:getfield        #30  <Field RandomAccessFile a>
	//* 138  224:astore          5
	//* 139  226:aload           4
	//* 140  228:astore_3        
	//* 141  229:aload           5
	//* 142  231:ifnull          342
	//* 143  234:aload_0         
	//* 144  235:getfield        #30  <Field RandomAccessFile a>
	//* 145  238:invokevirtual   #124 <Method void RandomAccessFile.close()>
	//* 146  241:aload           4
	//* 147  243:astore_3        
	//* 148  244:goto            342
	//* 149  247:aload           4
	//* 150  249:astore_3        
	//* 151  250:goto            342
	//* 152  253:astore_3        
	//* 153  254:aload_0         
	//* 154  255:getfield        #30  <Field RandomAccessFile a>
	//* 155  258:astore          5
	//* 156  260:aload           4
	//* 157  262:astore_3        
	//* 158  263:aload           5
	//* 159  265:ifnull          342
	//* 160  268:aload_0         
	//* 161  269:getfield        #30  <Field RandomAccessFile a>
	//* 162  272:invokevirtual   #124 <Method void RandomAccessFile.close()>
	//* 163  275:aload           4
	//* 164  277:astore_3        
	//* 165  278:goto            342
	//* 166  281:aload           4
	//* 167  283:astore_3        
	//* 168  284:goto            342
	//* 169  287:astore_3        
	//* 170  288:aload_0         
	//* 171  289:getfield        #30  <Field RandomAccessFile a>
	//* 172  292:astore          5
	//* 173  294:aload           4
	//* 174  296:astore_3        
	//* 175  297:aload           5
	//* 176  299:ifnull          342
	//* 177  302:aload_0         
	//* 178  303:getfield        #30  <Field RandomAccessFile a>
	//* 179  306:invokevirtual   #124 <Method void RandomAccessFile.close()>
	//* 180  309:aload           4
	//* 181  311:astore_3        
	//* 182  312:goto            342
	//* 183  315:aload           4
	//* 184  317:astore_3        
	//* 185  318:goto            342
	//* 186  321:astore_3        
	//* 187  322:aload_0         
	//* 188  323:getfield        #30  <Field RandomAccessFile a>
	//* 189  326:astore          4
	//* 190  328:aload           4
	//* 191  330:ifnull          340
	//* 192  333:aload_0         
	//* 193  334:getfield        #30  <Field RandomAccessFile a>
	//* 194  337:invokevirtual   #124 <Method void RandomAccessFile.close()>
	//* 195  340:aload_3         
	//* 196  341:athrow          
	//* 197  342:aload_3         
	//* 198  343:ifnull          364
	//* 199  346:aload_3         
	//* 200  347:invokevirtual   #148 <Method int in.e()>
	//* 201  350:bipush          100
	//* 202  352:icmple          364
	//* 203  355:aload_3         
	//* 204  356:invokevirtual   #148 <Method int in.e()>
	//* 205  359:ldc1            #149 <Int 0x500000>
	//* 206  361:icmplt          383
	//* 207  364:aload_0         
	//* 208  365:getfield        #17  <Field File e>
	//* 209  368:invokevirtual   #133 <Method boolean File.delete()>
	//* 210  371:pop             
	//* 211  372:aload_0         
	//* 212  373:aconst_null     
	//* 213  374:putfield        #17  <Field File e>
	//* 214  377:aload_0         
	//* 215  378:monitorexit     
	//* 216  379:aload_0         
	//* 217  380:monitorexit     
	//* 218  381:aconst_null     
	//* 219  382:areturn         
	//* 220  383:aload_0         
	//* 221  384:monitorexit     
	//* 222  385:aload_0         
	//* 223  386:monitorexit     
	//* 224  387:aload_3         
	//* 225  388:areturn         
	//* 226  389:astore_3        
	//* 227  390:aload_0         
	//* 228  391:monitorexit     
	//* 229  392:aload_3         
	//* 230  393:athrow          
	//* 231  394:astore_3        
	//* 232  395:aload_0         
	//* 233  396:monitorexit     
	//* 234  397:aload_3         
	//* 235  398:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
	//  236  399:astore_3        
		this;
		JVM INSTR monitorexit ;
		return null;
		j = e(((BitSet) (obj)));
		i = a(j, (int)e.length(), i);
		obj = ((Object) (b(j, i)));
		if(obj != null)
			break MISSING_BLOCK_LABEL_161;
		e.delete();
		obj = ((Object) (a));
		if(obj == null)
			break MISSING_BLOCK_LABEL_155;
		try
		{
			a.close();
		}
	//* 237  400:goto            94
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
	//  238  403:astore_3        
		this;
		JVM INSTR monitorexit ;
		return null;
		j = (j - c.a() - 4) / 1500;
		i = (i - c.a() - 4) / 1500;
		obj = ((Object) (new in(e, ((ArrayList) (obj)), new int[] {
			j, i
		})));
		obj2 = obj;
		randomaccessfile = a;
		obj = obj2;
		if(randomaccessfile == null) goto _L2; else goto _L1
_L1:
		a.close();
		obj = obj2;
		  goto _L2
_L5:
		obj = obj2;
		  goto _L2
		obj;
		randomaccessfile = a;
		obj = obj2;
		if(randomaccessfile == null) goto _L2; else goto _L3
_L3:
		a.close();
		obj = obj2;
		  goto _L2
_L6:
		obj = obj2;
		  goto _L2
		obj;
		randomaccessfile = a;
		obj = obj2;
		if(randomaccessfile == null) goto _L2; else goto _L4
_L4:
		a.close();
		obj = obj2;
		  goto _L2
_L7:
		obj = obj2;
		  goto _L2
		obj;
		obj2 = ((Object) (a));
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_340;
		try
		{
			a.close();
		}
	//* 239  404:goto            155
	//* 240  407:astore_3        
	//* 241  408:goto            247
	//* 242  411:astore_3        
	//* 243  412:goto            281
	//* 244  415:astore_3        
	//* 245  416:goto            315
		catch(Exception exception) { }
	//  246  419:astore          4
		throw obj;
_L2:
		if(obj == null)
			break MISSING_BLOCK_LABEL_364;
		if(((in) (obj)).e() > 100 && ((in) (obj)).e() < 0x500000)
			break MISSING_BLOCK_LABEL_383;
		e.delete();
		e = null;
		this;
		JVM INSTR monitorexit ;
		return null;
		this;
		JVM INSTR monitorexit ;
		return ((in) (obj));
		obj1;
		throw obj1;
		obj1;
		this;
		JVM INSTR monitorexit ;
		throw obj1;
		obj1;
		  goto _L5
		obj1;
		  goto _L6
		obj1;
		  goto _L7
	//* 247  421:goto            340
	}

	protected final void e(in in1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		this;
	//    2    2:aload_0         
		JVM INSTR monitorenter ;
	//    3    3:monitorenter    
		BitSet bitset;
		Object obj2;
		obj2 = null;
	//    4    4:aconst_null     
	//    5    5:astore          6
		bitset = null;
	//    6    7:aconst_null     
	//    7    8:astore          5
		Object obj;
		e = in1.e;
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:getfield        #151 <Field File in.e>
	//   11   15:putfield        #17  <Field File e>
		obj = ((Object) (e));
	//   12   18:aload_0         
	//   13   19:getfield        #17  <Field File e>
	//   14   22:astore_3        
		if(obj != null)
			break MISSING_BLOCK_LABEL_32;
	//   15   23:aload_3         
	//   16   24:ifnonnull       32
		this;
	//   17   27:aload_0         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
	//*  19   29:aload_0         
		return;
	//   20   30:monitorexit     
	//   21   31:return          
		Object obj1;
		obj = ((Object) (bitset));
	//   22   32:aload           5
	//   23   34:astore_3        
		obj1 = ((Object) (obj2));
	//   24   35:aload           6
	//   25   37:astore          4
		a = new RandomAccessFile(e, "rw");
	//   26   39:aload_0         
	//   27   40:new             #32  <Class RandomAccessFile>
	//   28   43:dup             
	//   29   44:aload_0         
	//   30   45:getfield        #17  <Field File e>
	//   31   48:ldc1            #117 <String "rw">
	//   32   50:invokespecial   #120 <Method void RandomAccessFile(File, String)>
	//   33   53:putfield        #30  <Field RandomAccessFile a>
		obj = ((Object) (bitset));
	//   34   56:aload           5
	//   35   58:astore_3        
		obj1 = ((Object) (obj2));
	//   36   59:aload           6
	//   37   61:astore          4
		byte abyte0[] = new byte[c.a()];
	//   38   63:aload_0         
	//   39   64:getfield        #19  <Field im c>
	//   40   67:invokevirtual   #60  <Method int im.a()>
	//   41   70:newarray        byte[]
	//   42   72:astore          7
		obj = ((Object) (bitset));
	//   43   74:aload           5
	//   44   76:astore_3        
		obj1 = ((Object) (obj2));
	//   45   77:aload           6
	//   46   79:astore          4
		a.read(abyte0);
	//   47   81:aload_0         
	//   48   82:getfield        #30  <Field RandomAccessFile a>
	//   49   85:aload           7
	//   50   87:invokevirtual   #48  <Method int RandomAccessFile.read(byte[])>
	//   51   90:pop             
		obj = ((Object) (bitset));
	//   52   91:aload           5
	//   53   93:astore_3        
		obj1 = ((Object) (obj2));
	//   54   94:aload           6
	//   55   96:astore          4
		bitset = im.c(abyte0);
	//   56   98:aload           7
	//   57  100:invokestatic    #63  <Method BitSet im.c(byte[])>
	//   58  103:astore          5
		obj = ((Object) (bitset));
	//   59  105:aload           5
	//   60  107:astore_3        
		obj1 = ((Object) (bitset));
	//   61  108:aload           5
	//   62  110:astore          4
		if(!in1.d())
			break MISSING_BLOCK_LABEL_205;
	//   63  112:aload_1         
	//   64  113:invokevirtual   #153 <Method boolean in.d()>
	//   65  116:ifeq            205
		obj = ((Object) (bitset));
	//   66  119:aload           5
	//   67  121:astore_3        
		obj1 = ((Object) (bitset));
	//   68  122:aload           5
	//   69  124:astore          4
		int i = in1.a[0];
	//   70  126:aload_1         
	//   71  127:getfield        #156 <Field int[] in.a>
	//   72  130:iconst_0        
	//   73  131:iaload          
	//   74  132:istore_2        
_L2:
		obj = ((Object) (bitset));
	//   75  133:aload           5
	//   76  135:astore_3        
		obj1 = ((Object) (bitset));
	//   77  136:aload           5
	//   78  138:astore          4
		if(i > in1.a[1])
			break; /* Loop/switch isn't completed */
	//   79  140:iload_2         
	//   80  141:aload_1         
	//   81  142:getfield        #156 <Field int[] in.a>
	//   82  145:iconst_1        
	//   83  146:iaload          
	//   84  147:icmpgt          171
		obj = ((Object) (bitset));
	//   85  150:aload           5
	//   86  152:astore_3        
		obj1 = ((Object) (bitset));
	//   87  153:aload           5
	//   88  155:astore          4
		bitset.set(i, false);
	//   89  157:aload           5
	//   90  159:iload_2         
	//   91  160:iconst_0        
	//   92  161:invokevirtual   #160 <Method void BitSet.set(int, boolean)>
		i++;
	//   93  164:iload_2         
	//   94  165:iconst_1        
	//   95  166:iadd            
	//   96  167:istore_2        
		if(true) goto _L2; else goto _L1
	//   97  168:goto            133
_L1:
		obj = ((Object) (bitset));
	//   98  171:aload           5
	//   99  173:astore_3        
		obj1 = ((Object) (bitset));
	//  100  174:aload           5
	//  101  176:astore          4
		a.seek(0L);
	//  102  178:aload_0         
	//  103  179:getfield        #30  <Field RandomAccessFile a>
	//  104  182:lconst_0        
	//  105  183:invokevirtual   #36  <Method void RandomAccessFile.seek(long)>
		obj = ((Object) (bitset));
	//  106  186:aload           5
	//  107  188:astore_3        
		obj1 = ((Object) (bitset));
	//  108  189:aload           5
	//  109  191:astore          4
		a.write(im.e(bitset));
	//  110  193:aload_0         
	//  111  194:getfield        #30  <Field RandomAccessFile a>
	//  112  197:aload           5
	//  113  199:invokestatic    #163 <Method byte[] im.e(BitSet)>
	//  114  202:invokevirtual   #165 <Method void RandomAccessFile.write(byte[])>
		obj = ((Object) (a));
	//  115  205:aload_0         
	//  116  206:getfield        #30  <Field RandomAccessFile a>
	//  117  209:astore_3        
		in1 = ((in) (bitset));
	//  118  210:aload           5
	//  119  212:astore_1        
		if(obj == null) goto _L4; else goto _L3
	//  120  213:aload_3         
	//  121  214:ifnull          318
_L3:
		a.close();
	//  122  217:aload_0         
	//  123  218:getfield        #30  <Field RandomAccessFile a>
	//  124  221:invokevirtual   #124 <Method void RandomAccessFile.close()>
		in1 = ((in) (bitset));
	//  125  224:aload           5
	//  126  226:astore_1        
		  goto _L4
	//* 127  227:goto            318
_L7:
		in1 = ((in) (bitset));
	//  128  230:aload           5
	//  129  232:astore_1        
		  goto _L4
	//* 130  233:goto            318
		in1;
	//  131  236:astore_1        
		obj1 = ((Object) (a));
	//  132  237:aload_0         
	//  133  238:getfield        #30  <Field RandomAccessFile a>
	//  134  241:astore          4
		in1 = ((in) (obj));
	//  135  243:aload_3         
	//  136  244:astore_1        
		if(obj1 == null) goto _L4; else goto _L5
	//  137  245:aload           4
	//  138  247:ifnull          318
_L5:
		a.close();
	//  139  250:aload_0         
	//  140  251:getfield        #30  <Field RandomAccessFile a>
	//  141  254:invokevirtual   #124 <Method void RandomAccessFile.close()>
		in1 = ((in) (obj));
	//  142  257:aload_3         
	//  143  258:astore_1        
		  goto _L4
	//* 144  259:goto            318
_L8:
		in1 = ((in) (obj));
	//  145  262:aload_3         
	//  146  263:astore_1        
		  goto _L4
	//* 147  264:goto            318
		in1;
	//  148  267:astore_1        
		obj = ((Object) (a));
	//  149  268:aload_0         
	//  150  269:getfield        #30  <Field RandomAccessFile a>
	//  151  272:astore_3        
		in1 = ((in) (obj1));
	//  152  273:aload           4
	//  153  275:astore_1        
		if(obj == null) goto _L4; else goto _L6
	//  154  276:aload_3         
	//  155  277:ifnull          318
_L6:
		a.close();
	//  156  280:aload_0         
	//  157  281:getfield        #30  <Field RandomAccessFile a>
	//  158  284:invokevirtual   #124 <Method void RandomAccessFile.close()>
		in1 = ((in) (obj1));
	//  159  287:aload           4
	//  160  289:astore_1        
		  goto _L4
	//* 161  290:goto            318
_L9:
		in1 = ((in) (obj1));
	//  162  293:aload           4
	//  163  295:astore_1        
		  goto _L4
	//* 164  296:goto            318
		in1;
	//  165  299:astore_1        
		obj = ((Object) (a));
	//  166  300:aload_0         
	//  167  301:getfield        #30  <Field RandomAccessFile a>
	//  168  304:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_316;
	//  169  305:aload_3         
	//  170  306:ifnull          316
		try
		{
			a.close();
	//  171  309:aload_0         
	//  172  310:getfield        #30  <Field RandomAccessFile a>
	//  173  313:invokevirtual   #124 <Method void RandomAccessFile.close()>
		}
	//* 174  316:aload_1         
	//* 175  317:athrow          
	//* 176  318:aload_1         
	//* 177  319:invokevirtual   #168 <Method boolean BitSet.isEmpty()>
	//* 178  322:ifeq            333
	//* 179  325:aload_0         
	//* 180  326:getfield        #17  <Field File e>
	//* 181  329:invokevirtual   #133 <Method boolean File.delete()>
	//* 182  332:pop             
	//* 183  333:aload_0         
	//* 184  334:aconst_null     
	//* 185  335:putfield        #17  <Field File e>
	//* 186  338:aload_0         
	//* 187  339:monitorexit     
	//* 188  340:aload_0         
	//* 189  341:monitorexit     
	//* 190  342:return          
	//* 191  343:astore_1        
	//* 192  344:aload_0         
	//* 193  345:monitorexit     
	//* 194  346:aload_1         
	//* 195  347:athrow          
	//* 196  348:astore_1        
	//* 197  349:aload_0         
	//* 198  350:monitorexit     
	//* 199  351:aload_1         
	//* 200  352:athrow          
	//* 201  353:astore_1        
	//* 202  354:goto            230
	//* 203  357:astore_1        
	//* 204  358:goto            262
	//* 205  361:astore_1        
	//* 206  362:goto            293
		catch(IOException ioexception) { }
	//  207  365:astore_3        
		throw in1;
_L4:
		if(((BitSet) (in1)).isEmpty())
			e.delete();
		e = null;
		this;
		JVM INSTR monitorexit ;
		return;
		in1;
		throw in1;
		in1;
		this;
		JVM INSTR monitorexit ;
		throw in1;
		in1;
		  goto _L7
		in1;
		  goto _L8
		in1;
		  goto _L9
	//* 208  366:goto            316
	}

	private RandomAccessFile a;
	private im c;
	private File e;
}
