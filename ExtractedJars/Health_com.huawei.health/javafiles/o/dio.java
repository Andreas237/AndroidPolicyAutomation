// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.Process;
import android.util.Log;
import java.io.*;

public class dio
{

	public dio()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String d()
	{
		Object obj;
		BufferedReader bufferedreader;
		InputStreamReader inputstreamreader;
		Object obj1;
		BufferedReader bufferedreader1;
		InputStreamReader inputstreamreader1;
		Object obj2;
		InputStreamReader inputstreamreader2;
		BufferedReader bufferedreader2;
		Object obj3;
		Object obj4;
		obj2 = ((Object) ((new StringBuilder()).append("/proc/").append(Process.myPid()).append("/cmdline").toString()));
	//    0    0:new             #15  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void StringBuilder()>
	//    3    7:ldc1            #18  <String "/proc/">
	//    4    9:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:invokestatic    #28  <Method int Process.myPid()>
	//    6   15:invokevirtual   #31  <Method StringBuilder StringBuilder.append(int)>
	//    7   18:ldc1            #33  <String "/cmdline">
	//    8   20:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    9   23:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   10   26:astore          7
		obj3 = null;
	//   11   28:aconst_null     
	//   12   29:astore          10
		bufferedreader2 = null;
	//   13   31:aconst_null     
	//   14   32:astore          9
		obj1 = null;
	//   15   34:aconst_null     
	//   16   35:astore          4
		obj = null;
	//   17   37:aconst_null     
	//   18   38:astore_1        
		obj4 = null;
	//   19   39:aconst_null     
	//   20   40:astore          11
		inputstreamreader2 = null;
	//   21   42:aconst_null     
	//   22   43:astore          8
		bufferedreader = bufferedreader2;
	//   23   45:aload           9
	//   24   47:astore_2        
		inputstreamreader = inputstreamreader2;
	//   25   48:aload           8
	//   26   50:astore_3        
		bufferedreader1 = ((BufferedReader) (obj3));
	//   27   51:aload           10
	//   28   53:astore          5
		inputstreamreader1 = ((InputStreamReader) (obj4));
	//   29   55:aload           11
	//   30   57:astore          6
		obj2 = ((Object) (new FileInputStream(((String) (obj2)))));
	//   31   59:new             #38  <Class FileInputStream>
	//   32   62:dup             
	//   33   63:aload           7
	//   34   65:invokespecial   #41  <Method void FileInputStream(String)>
	//   35   68:astore          7
		bufferedreader = bufferedreader2;
	//   36   70:aload           9
	//   37   72:astore_2        
		obj = obj2;
	//   38   73:aload           7
	//   39   75:astore_1        
		inputstreamreader = inputstreamreader2;
	//   40   76:aload           8
	//   41   78:astore_3        
		bufferedreader1 = ((BufferedReader) (obj3));
	//   42   79:aload           10
	//   43   81:astore          5
		obj1 = obj2;
	//   44   83:aload           7
	//   45   85:astore          4
		inputstreamreader1 = ((InputStreamReader) (obj4));
	//   46   87:aload           11
	//   47   89:astore          6
		inputstreamreader2 = new InputStreamReader(((java.io.InputStream) (obj2)), "iso-8859-1");
	//   48   91:new             #43  <Class InputStreamReader>
	//   49   94:dup             
	//   50   95:aload           7
	//   51   97:ldc1            #45  <String "iso-8859-1">
	//   52   99:invokespecial   #48  <Method void InputStreamReader(java.io.InputStream, String)>
	//   53  102:astore          8
		bufferedreader = bufferedreader2;
	//   54  104:aload           9
	//   55  106:astore_2        
		obj = obj2;
	//   56  107:aload           7
	//   57  109:astore_1        
		inputstreamreader = inputstreamreader2;
	//   58  110:aload           8
	//   59  112:astore_3        
		bufferedreader1 = ((BufferedReader) (obj3));
	//   60  113:aload           10
	//   61  115:astore          5
		obj1 = obj2;
	//   62  117:aload           7
	//   63  119:astore          4
		inputstreamreader1 = inputstreamreader2;
	//   64  121:aload           8
	//   65  123:astore          6
		bufferedreader2 = new BufferedReader(((java.io.Reader) (inputstreamreader2)));
	//   66  125:new             #50  <Class BufferedReader>
	//   67  128:dup             
	//   68  129:aload           8
	//   69  131:invokespecial   #53  <Method void BufferedReader(java.io.Reader)>
	//   70  134:astore          9
		bufferedreader = bufferedreader2;
	//   71  136:aload           9
	//   72  138:astore_2        
		obj = obj2;
	//   73  139:aload           7
	//   74  141:astore_1        
		inputstreamreader = inputstreamreader2;
	//   75  142:aload           8
	//   76  144:astore_3        
		bufferedreader1 = bufferedreader2;
	//   77  145:aload           9
	//   78  147:astore          5
		obj1 = obj2;
	//   79  149:aload           7
	//   80  151:astore          4
		inputstreamreader1 = inputstreamreader2;
	//   81  153:aload           8
	//   82  155:astore          6
		obj3 = ((Object) (new StringBuilder()));
	//   83  157:new             #15  <Class StringBuilder>
	//   84  160:dup             
	//   85  161:invokespecial   #16  <Method void StringBuilder()>
	//   86  164:astore          10
_L2:
		bufferedreader = bufferedreader2;
	//   87  166:aload           9
	//   88  168:astore_2        
		obj = obj2;
	//   89  169:aload           7
	//   90  171:astore_1        
		inputstreamreader = inputstreamreader2;
	//   91  172:aload           8
	//   92  174:astore_3        
		bufferedreader1 = bufferedreader2;
	//   93  175:aload           9
	//   94  177:astore          5
		obj1 = obj2;
	//   95  179:aload           7
	//   96  181:astore          4
		inputstreamreader1 = inputstreamreader2;
	//   97  183:aload           8
	//   98  185:astore          6
		int i = bufferedreader2.read();
	//   99  187:aload           9
	//  100  189:invokevirtual   #56  <Method int BufferedReader.read()>
	//  101  192:istore_0        
		if(i <= 0)
			break; /* Loop/switch isn't completed */
	//  102  193:iload_0         
	//  103  194:ifle            229
		bufferedreader = bufferedreader2;
	//  104  197:aload           9
	//  105  199:astore_2        
		obj = obj2;
	//  106  200:aload           7
	//  107  202:astore_1        
		inputstreamreader = inputstreamreader2;
	//  108  203:aload           8
	//  109  205:astore_3        
		bufferedreader1 = bufferedreader2;
	//  110  206:aload           9
	//  111  208:astore          5
		obj1 = obj2;
	//  112  210:aload           7
	//  113  212:astore          4
		inputstreamreader1 = inputstreamreader2;
	//  114  214:aload           8
	//  115  216:astore          6
		((StringBuilder) (obj3)).append((char)i);
	//  116  218:aload           10
	//  117  220:iload_0         
	//  118  221:int2char        
	//  119  222:invokevirtual   #59  <Method StringBuilder StringBuilder.append(char)>
	//  120  225:pop             
		if(true) goto _L2; else goto _L1
	//  121  226:goto            166
_L1:
		bufferedreader = bufferedreader2;
	//  122  229:aload           9
	//  123  231:astore_2        
		obj = obj2;
	//  124  232:aload           7
	//  125  234:astore_1        
		inputstreamreader = inputstreamreader2;
	//  126  235:aload           8
	//  127  237:astore_3        
		bufferedreader1 = bufferedreader2;
	//  128  238:aload           9
	//  129  240:astore          5
		obj1 = obj2;
	//  130  242:aload           7
	//  131  244:astore          4
		inputstreamreader1 = inputstreamreader2;
	//  132  246:aload           8
	//  133  248:astore          6
		obj3 = ((Object) (((StringBuilder) (obj3)).toString()));
	//  134  250:aload           10
	//  135  252:invokevirtual   #36  <Method String StringBuilder.toString()>
	//  136  255:astore          10
		if(bufferedreader2 != null)
	//* 137  257:aload           9
	//* 138  259:ifnull          279
			try
			{
				bufferedreader2.close();
	//  139  262:aload           9
	//  140  264:invokevirtual   #62  <Method void BufferedReader.close()>
			}
	//* 141  267:goto            279
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 142  270:astore_1        
			{
				Log.w("LogUtil_ProcessUtil", "byteReader close failed");
	//  143  271:ldc1            #64  <String "LogUtil_ProcessUtil">
	//  144  273:ldc1            #66  <String "byteReader close failed">
	//  145  275:invokestatic    #72  <Method int Log.w(String, String)>
	//  146  278:pop             
			}
		if(inputstreamreader2 != null)
	//* 147  279:aload           8
	//* 148  281:ifnull          301
			try
			{
				inputstreamreader2.close();
	//  149  284:aload           8
	//  150  286:invokevirtual   #73  <Method void InputStreamReader.close()>
			}
	//* 151  289:goto            301
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 152  292:astore_1        
			{
				Log.w("LogUtil_ProcessUtil", "byteReader close failed");
	//  153  293:ldc1            #64  <String "LogUtil_ProcessUtil">
	//  154  295:ldc1            #66  <String "byteReader close failed">
	//  155  297:invokestatic    #72  <Method int Log.w(String, String)>
	//  156  300:pop             
			}
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_323;
	//  157  301:aload           7
	//  158  303:ifnull          323
		((FileInputStream) (obj2)).close();
	//  159  306:aload           7
	//  160  308:invokevirtual   #74  <Method void FileInputStream.close()>
		return ((String) (obj3));
	//  161  311:aload           10
	//  162  313:areturn         
		obj;
	//  163  314:astore_1        
		Log.w("LogUtil_ProcessUtil", "byteReader close failed");
	//  164  315:ldc1            #64  <String "LogUtil_ProcessUtil">
	//  165  317:ldc1            #66  <String "byteReader close failed">
	//  166  319:invokestatic    #72  <Method int Log.w(String, String)>
	//  167  322:pop             
		return ((String) (obj3));
	//  168  323:aload           10
	//  169  325:areturn         
		obj1;
	//  170  326:astore          4
		bufferedreader1 = bufferedreader;
	//  171  328:aload_2         
	//  172  329:astore          5
		obj1 = obj;
	//  173  331:aload_1         
	//  174  332:astore          4
		inputstreamreader1 = inputstreamreader;
	//  175  334:aload_3         
	//  176  335:astore          6
		Log.d("LogUtil_ProcessUtil", "get process name (proc) failed");
	//  177  337:ldc1            #64  <String "LogUtil_ProcessUtil">
	//  178  339:ldc1            #76  <String "get process name (proc) failed">
	//  179  341:invokestatic    #78  <Method int Log.d(String, String)>
	//  180  344:pop             
		if(bufferedreader != null)
	//* 181  345:aload_2         
	//* 182  346:ifnull          365
			try
			{
				bufferedreader.close();
	//  183  349:aload_2         
	//  184  350:invokevirtual   #62  <Method void BufferedReader.close()>
			}
	//* 185  353:goto            365
			catch(IOException ioexception1)
	//* 186  356:astore_2        
			{
				Log.w("LogUtil_ProcessUtil", "byteReader close failed");
	//  187  357:ldc1            #64  <String "LogUtil_ProcessUtil">
	//  188  359:ldc1            #66  <String "byteReader close failed">
	//  189  361:invokestatic    #72  <Method int Log.w(String, String)>
	//  190  364:pop             
			}
		if(inputstreamreader != null)
	//* 191  365:aload_3         
	//* 192  366:ifnull          385
			try
			{
				inputstreamreader.close();
	//  193  369:aload_3         
	//  194  370:invokevirtual   #73  <Method void InputStreamReader.close()>
			}
	//* 195  373:goto            385
			catch(IOException ioexception2)
	//* 196  376:astore_2        
			{
				Log.w("LogUtil_ProcessUtil", "byteReader close failed");
	//  197  377:ldc1            #64  <String "LogUtil_ProcessUtil">
	//  198  379:ldc1            #66  <String "byteReader close failed">
	//  199  381:invokestatic    #72  <Method int Log.w(String, String)>
	//  200  384:pop             
			}
		if(obj != null)
	//* 201  385:aload_1         
	//* 202  386:ifnull          477
			try
			{
				((FileInputStream) (obj)).close();
	//  203  389:aload_1         
	//  204  390:invokevirtual   #74  <Method void FileInputStream.close()>
			}
	//* 205  393:goto            477
			catch(IOException ioexception)
	//* 206  396:astore_1        
			{
				Log.w("LogUtil_ProcessUtil", "byteReader close failed");
	//  207  397:ldc1            #64  <String "LogUtil_ProcessUtil">
	//  208  399:ldc1            #66  <String "byteReader close failed">
	//  209  401:invokestatic    #72  <Method int Log.w(String, String)>
	//  210  404:pop             
			}
		break MISSING_BLOCK_LABEL_477;
	//  211  405:goto            477
		Exception exception;
		exception;
	//  212  408:astore_1        
		if(bufferedreader1 != null)
	//* 213  409:aload           5
	//* 214  411:ifnull          431
			try
			{
				bufferedreader1.close();
	//  215  414:aload           5
	//  216  416:invokevirtual   #62  <Method void BufferedReader.close()>
			}
	//* 217  419:goto            431
			catch(IOException ioexception3)
	//* 218  422:astore_2        
			{
				Log.w("LogUtil_ProcessUtil", "byteReader close failed");
	//  219  423:ldc1            #64  <String "LogUtil_ProcessUtil">
	//  220  425:ldc1            #66  <String "byteReader close failed">
	//  221  427:invokestatic    #72  <Method int Log.w(String, String)>
	//  222  430:pop             
			}
		if(inputstreamreader1 != null)
	//* 223  431:aload           6
	//* 224  433:ifnull          453
			try
			{
				inputstreamreader1.close();
	//  225  436:aload           6
	//  226  438:invokevirtual   #73  <Method void InputStreamReader.close()>
			}
	//* 227  441:goto            453
			catch(IOException ioexception4)
	//* 228  444:astore_2        
			{
				Log.w("LogUtil_ProcessUtil", "byteReader close failed");
	//  229  445:ldc1            #64  <String "LogUtil_ProcessUtil">
	//  230  447:ldc1            #66  <String "byteReader close failed">
	//  231  449:invokestatic    #72  <Method int Log.w(String, String)>
	//  232  452:pop             
			}
		if(obj1 != null)
	//* 233  453:aload           4
	//* 234  455:ifnull          475
			try
			{
				((FileInputStream) (obj1)).close();
	//  235  458:aload           4
	//  236  460:invokevirtual   #74  <Method void FileInputStream.close()>
			}
	//* 237  463:goto            475
			catch(IOException ioexception5)
	//* 238  466:astore_2        
			{
				Log.w("LogUtil_ProcessUtil", "byteReader close failed");
	//  239  467:ldc1            #64  <String "LogUtil_ProcessUtil">
	//  240  469:ldc1            #66  <String "byteReader close failed">
	//  241  471:invokestatic    #72  <Method int Log.w(String, String)>
	//  242  474:pop             
			}
		throw exception;
	//  243  475:aload_1         
	//  244  476:athrow          
		return null;
	//  245  477:aconst_null     
	//  246  478:areturn         
	}
}
