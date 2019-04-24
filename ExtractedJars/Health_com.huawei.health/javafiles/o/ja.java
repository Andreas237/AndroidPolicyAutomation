// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.Process;
import java.io.*;
import org.json.JSONObject;

// Referenced classes of package o:
//			im, jb

public final class ja
{

	private ja(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field Context b>
		a = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #29  <Field boolean a>
		d = 1270;
	//    8   14:aload_0         
	//    9   15:sipush          1270
	//   10   18:putfield        #31  <Field int d>
		e = 310;
	//   11   21:aload_0         
	//   12   22:sipush          310
	//   13   25:putfield        #33  <Field int e>
		c = 4;
	//   14   28:aload_0         
	//   15   29:iconst_4        
	//   16   30:putfield        #35  <Field int c>
		i = 200;
	//   17   33:aload_0         
	//   18   34:sipush          200
	//   19   37:putfield        #37  <Field int i>
		h = 1;
	//   20   40:aload_0         
	//   21   41:iconst_1        
	//   22   42:putfield        #39  <Field int h>
		f = 0;
	//   23   45:aload_0         
	//   24   46:iconst_0        
	//   25   47:putfield        #41  <Field int f>
		k = 0;
	//   26   50:aload_0         
	//   27   51:iconst_0        
	//   28   52:putfield        #43  <Field int k>
		g = 0L;
	//   29   55:aload_0         
	//   30   56:lconst_0        
	//   31   57:putfield        #45  <Field long g>
		l = null;
	//   32   60:aload_0         
	//   33   61:aconst_null     
	//   34   62:putfield        #47  <Field jb l>
		b = context;
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:putfield        #27  <Field Context b>
	//   38   70:return          
	}

	private static String c(Context context)
	{
		boolean flag;
		File file;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		file = null;
	//    2    2:aconst_null     
	//    3    3:astore_3        
		if(Process.myUid() != 1000)
	//*   4    4:invokestatic    #57  <Method int Process.myUid()>
	//*   5    7:sipush          1000
	//*   6   10:icmpeq          18
			file = im.d(context);
	//    7   13:aload_0         
	//    8   14:invokestatic    #62  <Method File im.d(Context)>
	//    9   17:astore_3        
		boolean flag1 = "mounted".equals(((Object) (Environment.getExternalStorageState())));
	//   10   18:ldc1            #64  <String "mounted">
	//   11   20:invokestatic    #70  <Method String Environment.getExternalStorageState()>
	//   12   23:invokevirtual   #76  <Method boolean String.equals(Object)>
	//   13   26:istore_2        
		flag = flag1;
	//   14   27:iload_2         
	//   15   28:istore_1        
_L2:
		if((flag || !im.b()) && file != null)
	//*  16   29:iload_1         
	//*  17   30:ifne            39
	//*  18   33:invokestatic    #79  <Method boolean im.b()>
	//*  19   36:ifne            48
	//*  20   39:aload_3         
	//*  21   40:ifnull          48
			return file.getPath();
	//   22   43:aload_3         
	//   23   44:invokevirtual   #84  <Method String File.getPath()>
	//   24   47:areturn         
		else
			return context.getFilesDir().getPath();
	//   25   48:aload_0         
	//   26   49:invokevirtual   #90  <Method File Context.getFilesDir()>
	//   27   52:invokevirtual   #84  <Method String File.getPath()>
	//   28   55:areturn         
		Exception exception;
		exception;
	//   29   56:astore          4
		if(true) goto _L2; else goto _L1
	//   30   58:goto            29
_L1:
	}

	private static byte[] c(int j)
	{
		byte abyte0[] = new byte[4];
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:astore_2        
		for(int i1 = 0; i1 < 4; i1++)
	//*   3    4:iconst_0        
	//*   4    5:istore_1        
	//*   5    6:iload_1         
	//*   6    7:iconst_4        
	//*   7    8:icmpge          27
			abyte0[i1] = (byte)(j >> (i1 << 3));
	//    8   11:aload_2         
	//    9   12:iload_1         
	//   10   13:iload_0         
	//   11   14:iload_1         
	//   12   15:iconst_3        
	//   13   16:ishl            
	//   14   17:ishr            
	//   15   18:int2byte        
	//   16   19:bastore         

	//   17   20:iload_1         
	//   18   21:iconst_1        
	//   19   22:iadd            
	//   20   23:istore_1        
	//*  21   24:goto            6
		return abyte0;
	//   22   27:aload_2         
	//   23   28:areturn         
	}

	private static int d(byte abyte0[], int j)
	{
		int j1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(int i1 = 0; i1 < 4; i1++)
	//*   2    2:iconst_0        
	//*   3    3:istore_2        
	//*   4    4:iload_2         
	//*   5    5:iconst_4        
	//*   6    6:icmpge          32
			j1 += (abyte0[i1 + j] & 0xff) << (i1 << 3);
	//    7    9:iload_3         
	//    8   10:aload_0         
	//    9   11:iload_2         
	//   10   12:iload_1         
	//   11   13:iadd            
	//   12   14:baload          
	//   13   15:sipush          255
	//   14   18:iand            
	//   15   19:iload_2         
	//   16   20:iconst_3        
	//   17   21:ishl            
	//   18   22:ishl            
	//   19   23:iadd            
	//   20   24:istore_3        

	//   21   25:iload_2         
	//   22   26:iconst_1        
	//   23   27:iadd            
	//   24   28:istore_2        
	//*  25   29:goto            4
		return j1;
	//   26   32:iload_3         
	//   27   33:ireturn         
	}

	private static long e(byte abyte0[], int j)
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(j = 0; j < 8; j++)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:bipush          8
	//*   6    7:icmpge          34
			i1 += (abyte0[j + 14] & 0xff) << (j << 3);
	//    7   10:iload_2         
	//    8   11:aload_0         
	//    9   12:iload_1         
	//   10   13:bipush          14
	//   11   15:iadd            
	//   12   16:baload          
	//   13   17:sipush          255
	//   14   20:iand            
	//   15   21:iload_1         
	//   16   22:iconst_3        
	//   17   23:ishl            
	//   18   24:ishl            
	//   19   25:iadd            
	//   20   26:istore_2        

	//   21   27:iload_1         
	//   22   28:iconst_1        
	//   23   29:iadd            
	//   24   30:istore_1        
	//*  25   31:goto            4
		return (long)i1;
	//   26   34:iload_2         
	//   27   35:i2l             
	//   28   36:lreturn         
	}

	protected static ja e(Context context)
	{
		Context context1;
		Context context2;
		ja ja1;
		ja1 = new ja(context);
	//    0    0:new             #2   <Class ja>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #96  <Method void ja(Context)>
	//    4    8:astore          7
		ja1.f = 0;
	//    5   10:aload           7
	//    6   12:iconst_0        
	//    7   13:putfield        #41  <Field int f>
		ja1.k = 0;
	//    8   16:aload           7
	//    9   18:iconst_0        
	//   10   19:putfield        #43  <Field int k>
		ja1.g = ((System.currentTimeMillis() + 0x1b77400L) / 0x5265c00L) * 0x5265c00L;
	//   11   22:aload           7
	//   12   24:invokestatic    #102 <Method long System.currentTimeMillis()>
	//   13   27:ldc2w           #103 <Long 0x1b77400L>
	//   14   30:ladd            
	//   15   31:ldc2w           #105 <Long 0x5265c00L>
	//   16   34:ldiv            
	//   17   35:ldc2w           #105 <Long 0x5265c00L>
	//   18   38:lmul            
	//   19   39:putfield        #45  <Field long g>
		context2 = null;
	//   20   42:aconst_null     
	//   21   43:astore          6
		context1 = null;
	//   22   45:aconst_null     
	//   23   46:astore          5
		int j;
		long l1;
		ByteArrayOutputStream bytearrayoutputstream;
		byte abyte0[];
		try
		{
			context = ((Context) (new FileInputStream(new File((new StringBuilder()).append(c(context)).append(File.separator).append("data_carrier_status").toString()))));
	//   24   48:new             #108 <Class FileInputStream>
	//   25   51:dup             
	//   26   52:new             #81  <Class File>
	//   27   55:dup             
	//   28   56:new             #110 <Class StringBuilder>
	//   29   59:dup             
	//   30   60:invokespecial   #111 <Method void StringBuilder()>
	//   31   63:aload_0         
	//   32   64:invokestatic    #113 <Method String c(Context)>
	//   33   67:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   34   70:getstatic       #121 <Field String File.separator>
	//   35   73:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   36   76:ldc1            #123 <String "data_carrier_status">
	//   37   78:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   38   81:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   39   84:invokespecial   #129 <Method void File(String)>
	//   40   87:invokespecial   #132 <Method void FileInputStream(File)>
	//   41   90:astore_0        
		}
	//*  42   91:aload_0         
	//*  43   92:astore          5
	//*  44   94:aload_0         
	//*  45   95:astore          6
	//*  46   97:new             #134 <Class ByteArrayOutputStream>
	//*  47  100:dup             
	//*  48  101:invokespecial   #135 <Method void ByteArrayOutputStream()>
	//*  49  104:astore          8
	//*  50  106:aload_0         
	//*  51  107:astore          5
	//*  52  109:aload_0         
	//*  53  110:astore          6
	//*  54  112:bipush          32
	//*  55  114:newarray        byte[]
	//*  56  116:astore          9
	//*  57  118:aload_0         
	//*  58  119:astore          5
	//*  59  121:aload_0         
	//*  60  122:astore          6
	//*  61  124:aload_0         
	//*  62  125:aload           9
	//*  63  127:invokevirtual   #139 <Method int FileInputStream.read(byte[])>
	//*  64  130:istore_1        
	//*  65  131:iload_1         
	//*  66  132:iconst_m1       
	//*  67  133:icmpeq          154
	//*  68  136:aload_0         
	//*  69  137:astore          5
	//*  70  139:aload_0         
	//*  71  140:astore          6
	//*  72  142:aload           8
	//*  73  144:aload           9
	//*  74  146:iconst_0        
	//*  75  147:iload_1         
	//*  76  148:invokevirtual   #143 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//*  77  151:goto            118
	//*  78  154:aload_0         
	//*  79  155:astore          5
	//*  80  157:aload_0         
	//*  81  158:astore          6
	//*  82  160:aload           8
	//*  83  162:invokevirtual   #146 <Method void ByteArrayOutputStream.flush()>
	//*  84  165:aload_0         
	//*  85  166:astore          5
	//*  86  168:aload_0         
	//*  87  169:astore          6
	//*  88  171:aload           8
	//*  89  173:invokevirtual   #150 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  90  176:astore          9
	//*  91  178:aload           9
	//*  92  180:ifnull          393
	//*  93  183:aload_0         
	//*  94  184:astore          5
	//*  95  186:aload_0         
	//*  96  187:astore          6
	//*  97  189:aload           9
	//*  98  191:arraylength     
	//*  99  192:bipush          22
	//* 100  194:icmplt          393
	//* 101  197:aload           9
	//* 102  199:iconst_0        
	//* 103  200:baload          
	//* 104  201:ifeq            454
	//* 105  204:iconst_1        
	//* 106  205:istore_2        
	//* 107  206:goto            209
	//* 108  209:aload_0         
	//* 109  210:astore          5
	//* 110  212:aload_0         
	//* 111  213:astore          6
	//* 112  215:aload           7
	//* 113  217:iload_2         
	//* 114  218:putfield        #29  <Field boolean a>
	//* 115  221:aload_0         
	//* 116  222:astore          5
	//* 117  224:aload_0         
	//* 118  225:astore          6
	//* 119  227:aload           7
	//* 120  229:aload           9
	//* 121  231:iconst_1        
	//* 122  232:baload          
	//* 123  233:bipush          10
	//* 124  235:imul            
	//* 125  236:bipush          10
	//* 126  238:ishl            
	//* 127  239:putfield        #31  <Field int d>
	//* 128  242:aload_0         
	//* 129  243:astore          5
	//* 130  245:aload_0         
	//* 131  246:astore          6
	//* 132  248:aload           7
	//* 133  250:aload           9
	//* 134  252:iconst_2        
	//* 135  253:baload          
	//* 136  254:bipush          10
	//* 137  256:imul            
	//* 138  257:bipush          10
	//* 139  259:ishl            
	//* 140  260:putfield        #33  <Field int e>
	//* 141  263:aload_0         
	//* 142  264:astore          5
	//* 143  266:aload_0         
	//* 144  267:astore          6
	//* 145  269:aload           7
	//* 146  271:aload           9
	//* 147  273:iconst_3        
	//* 148  274:baload          
	//* 149  275:putfield        #35  <Field int c>
	//* 150  278:aload_0         
	//* 151  279:astore          5
	//* 152  281:aload_0         
	//* 153  282:astore          6
	//* 154  284:aload           7
	//* 155  286:aload           9
	//* 156  288:iconst_4        
	//* 157  289:baload          
	//* 158  290:bipush          10
	//* 159  292:imul            
	//* 160  293:putfield        #37  <Field int i>
	//* 161  296:aload_0         
	//* 162  297:astore          5
	//* 163  299:aload_0         
	//* 164  300:astore          6
	//* 165  302:aload           7
	//* 166  304:aload           9
	//* 167  306:iconst_5        
	//* 168  307:baload          
	//* 169  308:putfield        #39  <Field int h>
	//* 170  311:aload_0         
	//* 171  312:astore          5
	//* 172  314:aload_0         
	//* 173  315:astore          6
	//* 174  317:aload           9
	//* 175  319:bipush          14
	//* 176  321:invokestatic    #152 <Method long e(byte[], int)>
	//* 177  324:lstore_3        
	//* 178  325:aload_0         
	//* 179  326:astore          5
	//* 180  328:aload_0         
	//* 181  329:astore          6
	//* 182  331:aload           7
	//* 183  333:getfield        #45  <Field long g>
	//* 184  336:lload_3         
	//* 185  337:lsub            
	//* 186  338:ldc2w           #105 <Long 0x5265c00L>
	//* 187  341:lcmp            
	//* 188  342:ifge            393
	//* 189  345:aload_0         
	//* 190  346:astore          5
	//* 191  348:aload_0         
	//* 192  349:astore          6
	//* 193  351:aload           7
	//* 194  353:lload_3         
	//* 195  354:putfield        #45  <Field long g>
	//* 196  357:aload_0         
	//* 197  358:astore          5
	//* 198  360:aload_0         
	//* 199  361:astore          6
	//* 200  363:aload           7
	//* 201  365:aload           9
	//* 202  367:bipush          6
	//* 203  369:invokestatic    #154 <Method int d(byte[], int)>
	//* 204  372:putfield        #41  <Field int f>
	//* 205  375:aload_0         
	//* 206  376:astore          5
	//* 207  378:aload_0         
	//* 208  379:astore          6
	//* 209  381:aload           7
	//* 210  383:aload           9
	//* 211  385:bipush          10
	//* 212  387:invokestatic    #154 <Method int d(byte[], int)>
	//* 213  390:putfield        #43  <Field int k>
	//* 214  393:aload_0         
	//* 215  394:astore          5
	//* 216  396:aload_0         
	//* 217  397:astore          6
	//* 218  399:aload           8
	//* 219  401:invokevirtual   #157 <Method void ByteArrayOutputStream.close()>
	//* 220  404:aload_0         
	//* 221  405:invokevirtual   #158 <Method void FileInputStream.close()>
	//* 222  408:aload           7
	//* 223  410:areturn         
	//* 224  411:aload           6
	//* 225  413:ifnull          421
	//* 226  416:aload           6
	//* 227  418:invokevirtual   #158 <Method void FileInputStream.close()>
	//* 228  421:aload           7
	//* 229  423:areturn         
	//* 230  424:astore_0        
	//* 231  425:aload           5
	//* 232  427:ifnull          435
	//* 233  430:aload           5
	//* 234  432:invokevirtual   #158 <Method void FileInputStream.close()>
	//* 235  435:aload_0         
	//* 236  436:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			if(context2 != null)
				try
				{
					((FileInputStream) (context2)).close();
				}
	//* 237  437:astore_0        
	//* 238  438:goto            411
	//* 239  441:astore_0        
	//* 240  442:aload           7
	//* 241  444:areturn         
				// Misplaced declaration of an exception variable
				catch(Context context)
	//* 242  445:astore_0        
				{
					return ja1;
	//  243  446:aload           7
	//  244  448:areturn         
				}
			return ja1;
		}
		context1 = context;
		context2 = context;
		bytearrayoutputstream = new ByteArrayOutputStream();
		context1 = context;
		context2 = context;
		abyte0 = new byte[32];
_L2:
		context1 = context;
		context2 = context;
		j = ((FileInputStream) (context)).read(abyte0);
		if(j == -1)
			break; /* Loop/switch isn't completed */
		context1 = context;
		context2 = context;
		bytearrayoutputstream.write(abyte0, 0, j);
		if(true) goto _L2; else goto _L1
_L1:
		context1 = context;
		context2 = context;
		bytearrayoutputstream.flush();
		context1 = context;
		context2 = context;
		abyte0 = bytearrayoutputstream.toByteArray();
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_393;
		context1 = context;
		context2 = context;
		if(abyte0.length < 22)
			break MISSING_BLOCK_LABEL_393;
		boolean flag;
		Exception exception;
		if(abyte0[0] != 0)
			flag = true;
		else
	//* 245  449:astore          5
	//* 246  451:goto            435
			flag = false;
	//  247  454:iconst_0        
	//  248  455:istore_2        
		context1 = context;
		context2 = context;
		ja1.a = flag;
		context1 = context;
		context2 = context;
		ja1.d = abyte0[1] * 10 << 10;
		context1 = context;
		context2 = context;
		ja1.e = abyte0[2] * 10 << 10;
		context1 = context;
		context2 = context;
		ja1.c = ((int) (abyte0[3]));
		context1 = context;
		context2 = context;
		ja1.i = abyte0[4] * 10;
		context1 = context;
		context2 = context;
		ja1.h = ((int) (abyte0[5]));
		context1 = context;
		context2 = context;
		l1 = e(abyte0, 14);
		context1 = context;
		context2 = context;
		if(ja1.g - l1 >= 0x5265c00L)
			break MISSING_BLOCK_LABEL_393;
		context1 = context;
		context2 = context;
		ja1.g = l1;
		context1 = context;
		context2 = context;
		ja1.f = d(abyte0, 6);
		context1 = context;
		context2 = context;
		ja1.k = d(abyte0, 10);
		context1 = context;
		context2 = context;
		bytearrayoutputstream.close();
		try
		{
			((FileInputStream) (context)).close();
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return ja1;
		}
		return ja1;
		context;
		if(context1 != null)
			try
			{
				((FileInputStream) (context1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Exception exception) { }
		throw context;
	//* 249  456:goto            209
	}

	private static byte[] e(long l1)
	{
		byte abyte0[] = new byte[8];
	//    0    0:bipush          8
	//    1    2:newarray        byte[]
	//    2    4:astore_3        
		for(int j = 0; j < 8; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:bipush          8
	//*   7   10:icmpge          34
			abyte0[j] = (byte)(int)(l1 >> (j << 3) & 255L);
	//    8   13:aload_3         
	//    9   14:iload_2         
	//   10   15:lload_0         
	//   11   16:iload_2         
	//   12   17:iconst_3        
	//   13   18:ishl            
	//   14   19:lshr            
	//   15   20:ldc2w           #160 <Long 255L>
	//   16   23:land            
	//   17   24:l2i             
	//   18   25:int2byte        
	//   19   26:bastore         

	//   20   27:iload_2         
	//   21   28:iconst_1        
	//   22   29:iadd            
	//   23   30:istore_2        
	//*  24   31:goto            7
		return abyte0;
	//   25   34:aload_3         
	//   26   35:areturn         
	}

	private void k()
	{
		long l1 = System.currentTimeMillis() + 0x1b77400L;
	//    0    0:invokestatic    #102 <Method long System.currentTimeMillis()>
	//    1    3:ldc2w           #103 <Long 0x1b77400L>
	//    2    6:ladd            
	//    3    7:lstore_1        
		if(l1 - g > 0x5265c00L)
	//*   4    8:lload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #45  <Field long g>
	//*   7   13:lsub            
	//*   8   14:ldc2w           #105 <Long 0x5265c00L>
	//*   9   17:lcmp            
	//*  10   18:ifle            44
		{
			g = (l1 / 0x5265c00L) * 0x5265c00L;
	//   11   21:aload_0         
	//   12   22:lload_1         
	//   13   23:ldc2w           #105 <Long 0x5265c00L>
	//   14   26:ldiv            
	//   15   27:ldc2w           #105 <Long 0x5265c00L>
	//   16   30:lmul            
	//   17   31:putfield        #45  <Field long g>
			f = 0;
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:putfield        #41  <Field int f>
			k = 0;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #43  <Field int k>
		}
	//   24   44:return          
	}

	protected final int a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int c>
	//    2    4:ireturn         
	}

	protected final void a(int j)
	{
		k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method void k()>
		int i1 = j;
	//    2    4:iload_1         
	//    3    5:istore_2        
		if(j < 0)
	//*   4    6:iload_1         
	//*   5    7:ifge            12
			i1 = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		k = i1;
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:putfield        #43  <Field int k>
	//   11   17:return          
	}

	protected final int b()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int h>
	//    2    4:ireturn         
	}

	protected final void b(jb jb1)
	{
		l = jb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field jb l>
	//    3    5:return          
	}

	protected final boolean c()
	{
		k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method void k()>
		NetworkInfo networkinfo = ((ConnectivityManager)b.getSystemService("connectivity")).getActiveNetworkInfo();
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Context b>
	//    4    8:ldc1            #167 <String "connectivity">
	//    5   10:invokevirtual   #171 <Method Object Context.getSystemService(String)>
	//    6   13:checkcast       #173 <Class ConnectivityManager>
	//    7   16:invokevirtual   #177 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    8   19:astore_1        
		if(networkinfo != null && networkinfo.isConnected())
	//*   9   20:aload_1         
	//*  10   21:ifnull          83
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #182 <Method boolean NetworkInfo.isConnected()>
	//*  13   28:ifeq            83
		{
			if(networkinfo.getType() == 1)
	//*  14   31:aload_1         
	//*  15   32:invokevirtual   #185 <Method int NetworkInfo.getType()>
	//*  16   35:iconst_1        
	//*  17   36:icmpne          61
				return a && f < d;
	//   18   39:aload_0         
	//   19   40:getfield        #29  <Field boolean a>
	//   20   43:ifeq            59
	//   21   46:aload_0         
	//   22   47:getfield        #41  <Field int f>
	//   23   50:aload_0         
	//   24   51:getfield        #31  <Field int d>
	//   25   54:icmpge          59
	//   26   57:iconst_1        
	//   27   58:ireturn         
	//   28   59:iconst_0        
	//   29   60:ireturn         
			return a && k < e;
	//   30   61:aload_0         
	//   31   62:getfield        #29  <Field boolean a>
	//   32   65:ifeq            81
	//   33   68:aload_0         
	//   34   69:getfield        #43  <Field int k>
	//   35   72:aload_0         
	//   36   73:getfield        #33  <Field int e>
	//   37   76:icmpge          81
	//   38   79:iconst_1        
	//   39   80:ireturn         
	//   40   81:iconst_0        
	//   41   82:ireturn         
		} else
		{
			return a;
	//   42   83:aload_0         
	//   43   84:getfield        #29  <Field boolean a>
	//   44   87:ireturn         
		}
	}

	protected final int d()
	{
		k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method void k()>
		return f;
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field int f>
	//    4    8:ireturn         
	}

	protected final void d(int j)
	{
		k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method void k()>
		int i1 = j;
	//    2    4:iload_1         
	//    3    5:istore_2        
		if(j < 0)
	//*   4    6:iload_1         
	//*   5    7:ifge            12
			i1 = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		f = i1;
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:putfield        #41  <Field int f>
	//   11   17:return          
	}

	protected final boolean d(String s)
	{
		boolean flag1;
		boolean flag2;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		flag2 = false;
	//    2    3:iconst_0        
	//    3    4:istore          5
		s = ((String) (new JSONObject(s)));
	//    4    6:new             #188 <Class JSONObject>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #189 <Method void JSONObject(String)>
	//    8   14:astore_1        
		if(!((JSONObject) (s)).has("e"))
			break MISSING_BLOCK_LABEL_43;
	//    9   15:aload_1         
	//   10   16:ldc1            #190 <String "e">
	//   11   18:invokevirtual   #193 <Method boolean JSONObject.has(String)>
	//   12   21:ifeq            43
		int i1;
		boolean flag;
		FileOutputStream fileoutputstream;
		FileOutputStream fileoutputstream1;
		byte abyte0[];
		if(((JSONObject) (s)).getInt("e") != 0)
	//*  13   24:aload_1         
	//*  14   25:ldc1            #190 <String "e">
	//*  15   27:invokevirtual   #197 <Method int JSONObject.getInt(String)>
	//*  16   30:ifeq            580
			flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_3        
		else
	//*  19   35:goto            38
	//*  20   38:aload_0         
	//*  21   39:iload_3         
	//*  22   40:putfield        #29  <Field boolean a>
	//*  23   43:aload_1         
	//*  24   44:ldc1            #198 <String "d">
	//*  25   46:invokevirtual   #193 <Method boolean JSONObject.has(String)>
	//*  26   49:ifeq            157
	//*  27   52:aload_1         
	//*  28   53:ldc1            #198 <String "d">
	//*  29   55:invokevirtual   #197 <Method int JSONObject.getInt(String)>
	//*  30   58:istore_2        
	//*  31   59:aload_0         
	//*  32   60:iload_2         
	//*  33   61:bipush          127
	//*  34   63:iand            
	//*  35   64:bipush          10
	//*  36   66:imul            
	//*  37   67:bipush          10
	//*  38   69:ishl            
	//*  39   70:putfield        #31  <Field int d>
	//*  40   73:aload_0         
	//*  41   74:iload_2         
	//*  42   75:sipush          3968
	//*  43   78:iand            
	//*  44   79:bipush          7
	//*  45   81:ishr            
	//*  46   82:bipush          10
	//*  47   84:imul            
	//*  48   85:bipush          10
	//*  49   87:ishl            
	//*  50   88:putfield        #33  <Field int e>
	//*  51   91:aload_0         
	//*  52   92:ldc1            #199 <Int 0x7f000>
	//*  53   94:iload_2         
	//*  54   95:iand            
	//*  55   96:bipush          12
	//*  56   98:ishr            
	//*  57   99:putfield        #35  <Field int c>
	//*  58  102:aload_0         
	//*  59  103:ldc1            #200 <Int 0x3f80000>
	//*  60  105:iload_2         
	//*  61  106:iand            
	//*  62  107:bipush          19
	//*  63  109:ishr            
	//*  64  110:bipush          10
	//*  65  112:imul            
	//*  66  113:putfield        #37  <Field int i>
	//*  67  116:aload_0         
	//*  68  117:ldc1            #201 <Int 0x7c000000>
	//*  69  119:iload_2         
	//*  70  120:iand            
	//*  71  121:bipush          26
	//*  72  123:ishr            
	//*  73  124:putfield        #39  <Field int h>
	//*  74  127:aload_0         
	//*  75  128:getfield        #39  <Field int h>
	//*  76  131:bipush          31
	//*  77  133:icmpne          143
	//*  78  136:aload_0         
	//*  79  137:sipush          1500
	//*  80  140:putfield        #39  <Field int h>
	//*  81  143:aload_0         
	//*  82  144:getfield        #47  <Field jb l>
	//*  83  147:ifnull          157
	//*  84  150:aload_0         
	//*  85  151:getfield        #47  <Field jb l>
	//*  86  154:invokevirtual   #205 <Method void jb.b()>
	//*  87  157:iload           5
	//*  88  159:istore_3        
	//*  89  160:aload_1         
	//*  90  161:ldc1            #207 <String "u">
	//*  91  163:invokevirtual   #193 <Method boolean JSONObject.has(String)>
	//*  92  166:ifeq            187
	//*  93  169:aload_1         
	//*  94  170:ldc1            #207 <String "u">
	//*  95  172:invokevirtual   #197 <Method int JSONObject.getInt(String)>
	//*  96  175:istore_2        
	//*  97  176:iload_2         
	//*  98  177:ifeq            185
	//*  99  180:iconst_1        
	//* 100  181:istore_3        
	//* 101  182:goto            187
	//* 102  185:iconst_0        
	//* 103  186:istore_3        
	//* 104  187:goto            194
	//* 105  190:astore_1        
	//* 106  191:iload           4
	//* 107  193:istore_3        
	//* 108  194:aconst_null     
	//* 109  195:astore          8
	//* 110  197:aconst_null     
	//* 111  198:astore          7
	//* 112  200:aload           7
	//* 113  202:astore_1        
	//* 114  203:aload           8
	//* 115  205:astore          6
	//* 116  207:aload_0         
	//* 117  208:invokespecial   #164 <Method void k()>
	//* 118  211:aload           7
	//* 119  213:astore_1        
	//* 120  214:aload           8
	//* 121  216:astore          6
	//* 122  218:new             #209 <Class FileOutputStream>
	//* 123  221:dup             
	//* 124  222:new             #81  <Class File>
	//* 125  225:dup             
	//* 126  226:new             #110 <Class StringBuilder>
	//* 127  229:dup             
	//* 128  230:invokespecial   #111 <Method void StringBuilder()>
	//* 129  233:aload_0         
	//* 130  234:getfield        #27  <Field Context b>
	//* 131  237:invokestatic    #113 <Method String c(Context)>
	//* 132  240:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//* 133  243:getstatic       #121 <Field String File.separator>
	//* 134  246:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//* 135  249:ldc1            #123 <String "data_carrier_status">
	//* 136  251:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//* 137  254:invokevirtual   #126 <Method String StringBuilder.toString()>
	//* 138  257:invokespecial   #129 <Method void File(String)>
	//* 139  260:invokespecial   #210 <Method void FileOutputStream(File)>
	//* 140  263:astore          7
	//* 141  265:aload           7
	//* 142  267:astore_1        
	//* 143  268:aload           7
	//* 144  270:astore          6
	//* 145  272:aload_0         
	//* 146  273:getfield        #41  <Field int f>
	//* 147  276:invokestatic    #212 <Method byte[] c(int)>
	//* 148  279:astore          8
	//* 149  281:aload           7
	//* 150  283:astore_1        
	//* 151  284:aload           7
	//* 152  286:astore          6
	//* 153  288:aload_0         
	//* 154  289:getfield        #43  <Field int k>
	//* 155  292:invokestatic    #212 <Method byte[] c(int)>
	//* 156  295:astore          9
	//* 157  297:aload           7
	//* 158  299:astore_1        
	//* 159  300:aload           7
	//* 160  302:astore          6
	//* 161  304:aload_0         
	//* 162  305:getfield        #45  <Field long g>
	//* 163  308:invokestatic    #214 <Method byte[] e(long)>
	//* 164  311:astore          10
	//* 165  313:aload           7
	//* 166  315:astore_1        
	//* 167  316:aload           7
	//* 168  318:astore          6
	//* 169  320:aload_0         
	//* 170  321:getfield        #29  <Field boolean a>
	//* 171  324:ifeq            585
	//* 172  327:iconst_1        
	//* 173  328:istore_2        
	//* 174  329:goto            332
	//* 175  332:aload           7
	//* 176  334:astore_1        
	//* 177  335:aload           7
	//* 178  337:astore          6
	//* 179  339:aload           7
	//* 180  341:bipush          22
	//* 181  343:newarray        byte[]
	//* 182  345:dup             
	//* 183  346:iconst_0        
	//* 184  347:iload_2         
	//* 185  348:int2byte        
	//* 186  349:bastore         
	//* 187  350:dup             
	//* 188  351:iconst_1        
	//* 189  352:aload_0         
	//* 190  353:getfield        #31  <Field int d>
	//* 191  356:sipush          10240
	//* 192  359:idiv            
	//* 193  360:int2byte        
	//* 194  361:bastore         
	//* 195  362:dup             
	//* 196  363:iconst_2        
	//* 197  364:aload_0         
	//* 198  365:getfield        #33  <Field int e>
	//* 199  368:sipush          10240
	//* 200  371:idiv            
	//* 201  372:int2byte        
	//* 202  373:bastore         
	//* 203  374:dup             
	//* 204  375:iconst_3        
	//* 205  376:aload_0         
	//* 206  377:getfield        #35  <Field int c>
	//* 207  380:int2byte        
	//* 208  381:bastore         
	//* 209  382:dup             
	//* 210  383:iconst_4        
	//* 211  384:aload_0         
	//* 212  385:getfield        #37  <Field int i>
	//* 213  388:bipush          10
	//* 214  390:idiv            
	//* 215  391:int2byte        
	//* 216  392:bastore         
	//* 217  393:dup             
	//* 218  394:iconst_5        
	//* 219  395:aload_0         
	//* 220  396:getfield        #39  <Field int h>
	//* 221  399:int2byte        
	//* 222  400:bastore         
	//* 223  401:dup             
	//* 224  402:bipush          6
	//* 225  404:aload           8
	//* 226  406:iconst_0        
	//* 227  407:baload          
	//* 228  408:bastore         
	//* 229  409:dup             
	//* 230  410:bipush          7
	//* 231  412:aload           8
	//* 232  414:iconst_1        
	//* 233  415:baload          
	//* 234  416:bastore         
	//* 235  417:dup             
	//* 236  418:bipush          8
	//* 237  420:aload           8
	//* 238  422:iconst_2        
	//* 239  423:baload          
	//* 240  424:bastore         
	//* 241  425:dup             
	//* 242  426:bipush          9
	//* 243  428:aload           8
	//* 244  430:iconst_3        
	//* 245  431:baload          
	//* 246  432:bastore         
	//* 247  433:dup             
	//* 248  434:bipush          10
	//* 249  436:aload           9
	//* 250  438:iconst_0        
	//* 251  439:baload          
	//* 252  440:bastore         
	//* 253  441:dup             
	//* 254  442:bipush          11
	//* 255  444:aload           9
	//* 256  446:iconst_1        
	//* 257  447:baload          
	//* 258  448:bastore         
	//* 259  449:dup             
	//* 260  450:bipush          12
	//* 261  452:aload           9
	//* 262  454:iconst_2        
	//* 263  455:baload          
	//* 264  456:bastore         
	//* 265  457:dup             
	//* 266  458:bipush          13
	//* 267  460:aload           9
	//* 268  462:iconst_3        
	//* 269  463:baload          
	//* 270  464:bastore         
	//* 271  465:dup             
	//* 272  466:bipush          14
	//* 273  468:aload           10
	//* 274  470:iconst_0        
	//* 275  471:baload          
	//* 276  472:bastore         
	//* 277  473:dup             
	//* 278  474:bipush          15
	//* 279  476:aload           10
	//* 280  478:iconst_1        
	//* 281  479:baload          
	//* 282  480:bastore         
	//* 283  481:dup             
	//* 284  482:bipush          16
	//* 285  484:aload           10
	//* 286  486:iconst_2        
	//* 287  487:baload          
	//* 288  488:bastore         
	//* 289  489:dup             
	//* 290  490:bipush          17
	//* 291  492:aload           10
	//* 292  494:iconst_3        
	//* 293  495:baload          
	//* 294  496:bastore         
	//* 295  497:dup             
	//* 296  498:bipush          18
	//* 297  500:aload           10
	//* 298  502:iconst_4        
	//* 299  503:baload          
	//* 300  504:bastore         
	//* 301  505:dup             
	//* 302  506:bipush          19
	//* 303  508:aload           10
	//* 304  510:iconst_5        
	//* 305  511:baload          
	//* 306  512:bastore         
	//* 307  513:dup             
	//* 308  514:bipush          20
	//* 309  516:aload           10
	//* 310  518:bipush          6
	//* 311  520:baload          
	//* 312  521:bastore         
	//* 313  522:dup             
	//* 314  523:bipush          21
	//* 315  525:aload           10
	//* 316  527:bipush          7
	//* 317  529:baload          
	//* 318  530:bastore         
	//* 319  531:invokevirtual   #217 <Method void FileOutputStream.write(byte[])>
	//* 320  534:aload           7
	//* 321  536:invokevirtual   #218 <Method void FileOutputStream.close()>
	//* 322  539:iload_3         
	//* 323  540:ireturn         
	//* 324  541:aload           6
	//* 325  543:ifnull          551
	//* 326  546:aload           6
	//* 327  548:invokevirtual   #218 <Method void FileOutputStream.close()>
	//* 328  551:iload_3         
	//* 329  552:ireturn         
	//* 330  553:astore          6
	//* 331  555:aload_1         
	//* 332  556:ifnull          563
	//* 333  559:aload_1         
	//* 334  560:invokevirtual   #218 <Method void FileOutputStream.close()>
	//* 335  563:aload           6
	//* 336  565:athrow          
	//* 337  566:astore_1        
	//* 338  567:goto            541
	//* 339  570:astore_1        
	//* 340  571:iload_3         
	//* 341  572:ireturn         
	//* 342  573:astore_1        
	//* 343  574:iload_3         
	//* 344  575:ireturn         
	//* 345  576:astore_1        
	//* 346  577:goto            563
			flag = false;
	//  347  580:iconst_0        
	//  348  581:istore_3        
		a = flag;
		if(((JSONObject) (s)).has("d"))
		{
			int j = ((JSONObject) (s)).getInt("d");
			d = (j & 0x7f) * 10 << 10;
			e = ((j & 0xf80) >> 7) * 10 << 10;
			c = (0x7f000 & j) >> 12;
			i = ((0x3f80000 & j) >> 19) * 10;
			h = (0x7c000000 & j) >> 26;
			if(h == 31)
				h = 1500;
			if(l != null)
				l.b();
		}
		flag = flag2;
		if(!((JSONObject) (s)).has("u"))
			break MISSING_BLOCK_LABEL_194;
		i1 = ((JSONObject) (s)).getInt("u");
		if(i1 != 0)
			flag = true;
		else
			flag = false;
		break MISSING_BLOCK_LABEL_194;
		s;
		flag = flag1;
		abyte0 = null;
		fileoutputstream1 = null;
		s = ((String) (fileoutputstream1));
		fileoutputstream = ((FileOutputStream) (abyte0));
		Exception exception;
		byte abyte1[];
		byte abyte2[];
		try
		{
			k();
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			if(fileoutputstream != null)
				try
				{
					fileoutputstream.close();
				}
				// Misplaced declaration of an exception variable
				catch(String s)
				{
					return flag;
				}
			return flag;
		}
		s = ((String) (fileoutputstream1));
		fileoutputstream = ((FileOutputStream) (abyte0));
		fileoutputstream1 = new FileOutputStream(new File((new StringBuilder()).append(c(b)).append(File.separator).append("data_carrier_status").toString()));
		s = ((String) (fileoutputstream1));
		fileoutputstream = fileoutputstream1;
		abyte0 = c(f);
		s = ((String) (fileoutputstream1));
		fileoutputstream = fileoutputstream1;
		abyte1 = c(k);
		s = ((String) (fileoutputstream1));
		fileoutputstream = fileoutputstream1;
		abyte2 = e(g);
		s = ((String) (fileoutputstream1));
		fileoutputstream = fileoutputstream1;
		int j1;
		if(a)
			j1 = 1;
		else
	//* 349  582:goto            38
			j1 = 0;
	//  350  585:iconst_0        
	//  351  586:istore_2        
		s = ((String) (fileoutputstream1));
		fileoutputstream = fileoutputstream1;
		fileoutputstream1.write(new byte[] {
			(byte)j1, (byte)(d / 10240), (byte)(e / 10240), (byte)c, (byte)(i / 10), (byte)h, abyte0[0], abyte0[1], abyte0[2], abyte0[3], 
			abyte1[0], abyte1[1], abyte1[2], abyte1[3], abyte2[0], abyte2[1], abyte2[2], abyte2[3], abyte2[4], abyte2[5], 
			abyte2[6], abyte2[7]
		});
		try
		{
			fileoutputstream1.close();
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return flag;
		}
		return flag;
		exception;
		if(s != null)
			try
			{
				((FileOutputStream) (s)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s) { }
		throw exception;
	//* 352  587:goto            332
	}

	protected final int e()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int i>
	//    2    4:ireturn         
	}

	protected final int i()
	{
		k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method void k()>
		return k;
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field int k>
	//    4    8:ireturn         
	}

	private boolean a;
	private Context b;
	private int c;
	private int d;
	private int e;
	private int f;
	private long g;
	private int h;
	private int i;
	private int k;
	private jb l;
}
