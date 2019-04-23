// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import android.content.res.AssetManager;
import android.net.Uri;
import bo.app.h;
import com.appboy.Appboy;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

// Referenced classes of package com.appboy.support:
//			AppboyLogger, StringUtils

public class AppboyFileUtils
{

	public AppboyFileUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
	//    2    4:return          
	}

	public static void deleteFileOrDirectory(File file)
	{
		if(file == null)
			break MISSING_BLOCK_LABEL_107;
	//    0    0:aload_0         
	//    1    1:ifnull          107
		int i;
		int j;
		String as[];
		try
		{
			if(!file.exists())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #61  <Method boolean File.exists()>
	//*   4    8:ifne            12
				return;
	//    5   11:return          
		}
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #64  <Method boolean File.isDirectory()>
	//*   8   16:ifeq            55
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #68  <Method String[] File.list()>
	//*  11   23:astore_3        
	//*  12   24:aload_3         
	//*  13   25:arraylength     
	//*  14   26:istore_2        
	//*  15   27:iconst_0        
	//*  16   28:istore_1        
	//*  17   29:iload_1         
	//*  18   30:iload_2         
	//*  19   31:icmpge          55
	//*  20   34:new             #57  <Class File>
	//*  21   37:dup             
	//*  22   38:aload_0         
	//*  23   39:aload_3         
	//*  24   40:iload_1         
	//*  25   41:aaload          
	//*  26   42:invokespecial   #71  <Method void File(File, String)>
	//*  27   45:invokestatic    #73  <Method void deleteFileOrDirectory(File)>
	//*  28   48:iload_1         
	//*  29   49:iconst_1        
	//*  30   50:iadd            
	//*  31   51:istore_1        
	//*  32   52:goto            29
	//*  33   55:aload_0         
	//*  34   56:invokevirtual   #76  <Method boolean File.delete()>
	//*  35   59:pop             
	//*  36   60:return          
		catch(Exception exception)
	//*  37   61:astore_3        
		{
			String s = a;
	//   38   62:getstatic       #19  <Field String a>
	//   39   65:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   40   67:new             #78  <Class StringBuilder>
	//   41   70:dup             
	//   42   71:invokespecial   #79  <Method void StringBuilder()>
	//   43   74:astore          5
			stringbuilder.append("Caught exception while trying to delete file or directory ");
	//   44   76:aload           5
	//   45   78:ldc1            #81  <String "Caught exception while trying to delete file or directory ">
	//   46   80:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   47   83:pop             
			stringbuilder.append(file.getName());
	//   48   84:aload           5
	//   49   86:aload_0         
	//   50   87:invokevirtual   #89  <Method String File.getName()>
	//   51   90:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   52   93:pop             
			AppboyLogger.e(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   53   94:aload           4
	//   54   96:aload           5
	//   55   98:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   56  101:aload_3         
	//   57  102:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//   58  105:pop             
			return;
	//   59  106:return          
		}
		if(!file.isDirectory()) goto _L2; else goto _L1
_L1:
		as = file.list();
		j = as.length;
		i = 0;
_L3:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		deleteFileOrDirectory(new File(file, as[i]));
		i++;
		if(true) goto _L3; else goto _L2
_L2:
		file.delete();
		return;
	//   60  107:return          
	}

	public static File downloadFileToPath(String s, String s1, String s2, String s3)
	{
		BufferedOutputStream bufferedoutputstream;
		boolean flag = Appboy.getOutboundNetworkRequestsOffline();
	//    0    0:invokestatic    #105 <Method boolean Appboy.getOutboundNetworkRequestsOffline()>
	//    1    3:istore          5
		bufferedoutputstream = null;
	//    2    5:aconst_null     
	//    3    6:astore          7
		if(flag)
	//*   4    8:iload           5
	//*   5   10:ifeq            49
		{
			s = a;
	//    6   13:getstatic       #19  <Field String a>
	//    7   16:astore_0        
			s2 = ((String) (new StringBuilder()));
	//    8   17:new             #78  <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #79  <Method void StringBuilder()>
	//   11   24:astore_2        
			((StringBuilder) (s2)).append("SDK is offline. File not downloaded for url: ");
	//   12   25:aload_2         
	//   13   26:ldc1            #107 <String "SDK is offline. File not downloaded for url: ">
	//   14   28:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			((StringBuilder) (s2)).append(s1);
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			AppboyLogger.i(s, ((StringBuilder) (s2)).toString());
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   23   43:invokestatic    #111 <Method int AppboyLogger.i(String, String)>
	//   24   46:pop             
			return null;
	//   25   47:aconst_null     
	//   26   48:areturn         
		}
		if(StringUtils.isNullOrBlank(s))
	//*  27   49:aload_0         
	//*  28   50:invokestatic    #117 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  29   53:ifeq            67
		{
			AppboyLogger.i(a, "Download directory null or blank. File not downloaded.");
	//   30   56:getstatic       #19  <Field String a>
	//   31   59:ldc1            #119 <String "Download directory null or blank. File not downloaded.">
	//   32   61:invokestatic    #111 <Method int AppboyLogger.i(String, String)>
	//   33   64:pop             
			return null;
	//   34   65:aconst_null     
	//   35   66:areturn         
		}
		if(StringUtils.isNullOrBlank(s1))
	//*  36   67:aload_1         
	//*  37   68:invokestatic    #117 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  38   71:ifeq            85
		{
			AppboyLogger.i(a, "Zip file url null or blank. File not downloaded.");
	//   39   74:getstatic       #19  <Field String a>
	//   40   77:ldc1            #121 <String "Zip file url null or blank. File not downloaded.">
	//   41   79:invokestatic    #111 <Method int AppboyLogger.i(String, String)>
	//   42   82:pop             
			return null;
	//   43   83:aconst_null     
	//   44   84:areturn         
		}
		if(StringUtils.isNullOrBlank(s2))
	//*  45   85:aload_2         
	//*  46   86:invokestatic    #117 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  47   89:ifeq            103
		{
			AppboyLogger.i(a, "Output filename null or blank. File not downloaded.");
	//   48   92:getstatic       #19  <Field String a>
	//   49   95:ldc1            #123 <String "Output filename null or blank. File not downloaded.">
	//   50   97:invokestatic    #111 <Method int AppboyLogger.i(String, String)>
	//   51  100:pop             
			return null;
	//   52  101:aconst_null     
	//   53  102:areturn         
		}
		(new File(s)).mkdirs();
	//   54  103:new             #57  <Class File>
	//   55  106:dup             
	//   56  107:aload_0         
	//   57  108:invokespecial   #126 <Method void File(String)>
	//   58  111:invokevirtual   #129 <Method boolean File.mkdirs()>
	//   59  114:pop             
		Object obj = ((Object) (s2));
	//   60  115:aload_2         
	//   61  116:astore          6
		File file;
		if(!StringUtils.isNullOrBlank(s3))
	//*  62  118:aload_3         
	//*  63  119:invokestatic    #117 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  64  122:ifne            155
		{
			obj = ((Object) (new StringBuilder()));
	//   65  125:new             #78  <Class StringBuilder>
	//   66  128:dup             
	//   67  129:invokespecial   #79  <Method void StringBuilder()>
	//   68  132:astore          6
			((StringBuilder) (obj)).append(s2);
	//   69  134:aload           6
	//   70  136:aload_2         
	//   71  137:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   72  140:pop             
			((StringBuilder) (obj)).append(s3);
	//   73  141:aload           6
	//   74  143:aload_3         
	//   75  144:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   76  147:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   77  148:aload           6
	//   78  150:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   79  153:astore          6
		}
		file = new File(s, ((String) (obj)));
	//   80  155:new             #57  <Class File>
	//   81  158:dup             
	//   82  159:aload_0         
	//   83  160:aload           6
	//   84  162:invokespecial   #132 <Method void File(String, String)>
	//   85  165:astore          8
		s = ((String) ((HttpURLConnection)h.a(new URL(s1))));
	//   86  167:new             #134 <Class URL>
	//   87  170:dup             
	//   88  171:aload_1         
	//   89  172:invokespecial   #135 <Method void URL(String)>
	//   90  175:invokestatic    #140 <Method java.net.URLConnection h.a(URL)>
	//   91  178:checkcast       #142 <Class HttpURLConnection>
	//   92  181:astore_0        
		int i = ((HttpURLConnection) (s)).getResponseCode();
	//   93  182:aload_0         
	//   94  183:invokevirtual   #146 <Method int HttpURLConnection.getResponseCode()>
	//   95  186:istore          4
		if(i == 200)
			break MISSING_BLOCK_LABEL_261;
	//   96  188:iload           4
	//   97  190:sipush          200
	//   98  193:icmpeq          261
		s2 = a;
	//   99  196:getstatic       #19  <Field String a>
	//  100  199:astore_2        
		s3 = ((String) (new StringBuilder()));
	//  101  200:new             #78  <Class StringBuilder>
	//  102  203:dup             
	//  103  204:invokespecial   #79  <Method void StringBuilder()>
	//  104  207:astore_3        
		((StringBuilder) (s3)).append("HTTP response code was ");
	//  105  208:aload_3         
	//  106  209:ldc1            #148 <String "HTTP response code was ">
	//  107  211:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  108  214:pop             
		((StringBuilder) (s3)).append(i);
	//  109  215:aload_3         
	//  110  216:iload           4
	//  111  218:invokevirtual   #151 <Method StringBuilder StringBuilder.append(int)>
	//  112  221:pop             
		((StringBuilder) (s3)).append(". File with url ");
	//  113  222:aload_3         
	//  114  223:ldc1            #153 <String ". File with url ">
	//  115  225:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  116  228:pop             
		((StringBuilder) (s3)).append(s1);
	//  117  229:aload_3         
	//  118  230:aload_1         
	//  119  231:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  120  234:pop             
		((StringBuilder) (s3)).append(" could not be downloaded.");
	//  121  235:aload_3         
	//  122  236:ldc1            #155 <String " could not be downloaded.">
	//  123  238:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  124  241:pop             
		AppboyLogger.d(s2, ((StringBuilder) (s3)).toString());
	//  125  242:aload_2         
	//  126  243:aload_3         
	//  127  244:invokevirtual   #92  <Method String StringBuilder.toString()>
	//  128  247:invokestatic    #158 <Method int AppboyLogger.d(String, String)>
	//  129  250:pop             
		if(s != null)
	//* 130  251:aload_0         
	//* 131  252:ifnull          259
			((HttpURLConnection) (s)).disconnect();
	//  132  255:aload_0         
	//  133  256:invokevirtual   #161 <Method void HttpURLConnection.disconnect()>
		return null;
	//  134  259:aconst_null     
	//  135  260:areturn         
		byte abyte0[];
		abyte0 = new byte[8192];
	//  136  261:sipush          8192
	//  137  264:newarray        byte[]
	//  138  266:astore          9
		s1 = ((String) (new DataInputStream(((HttpURLConnection) (s)).getInputStream())));
	//  139  268:new             #163 <Class DataInputStream>
	//  140  271:dup             
	//  141  272:aload_0         
	//  142  273:invokevirtual   #167 <Method InputStream HttpURLConnection.getInputStream()>
	//  143  276:invokespecial   #170 <Method void DataInputStream(InputStream)>
	//  144  279:astore_1        
		bufferedoutputstream = new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(file))));
	//  145  280:new             #172 <Class BufferedOutputStream>
	//  146  283:dup             
	//  147  284:new             #174 <Class FileOutputStream>
	//  148  287:dup             
	//  149  288:aload           8
	//  150  290:invokespecial   #176 <Method void FileOutputStream(File)>
	//  151  293:invokespecial   #179 <Method void BufferedOutputStream(java.io.OutputStream)>
	//  152  296:astore          7
_L2:
		s2 = ((String) (bufferedoutputstream));
	//  153  298:aload           7
	//  154  300:astore_2        
		s3 = s;
	//  155  301:aload_0         
	//  156  302:astore_3        
		obj = ((Object) (s1));
	//  157  303:aload_1         
	//  158  304:astore          6
		i = ((DataInputStream) (s1)).read(abyte0);
	//  159  306:aload_1         
	//  160  307:aload           9
	//  161  309:invokevirtual   #183 <Method int DataInputStream.read(byte[])>
	//  162  312:istore          4
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//  163  314:iload           4
	//  164  316:iconst_m1       
	//  165  317:icmpeq          341
		s2 = ((String) (bufferedoutputstream));
	//  166  320:aload           7
	//  167  322:astore_2        
		s3 = s;
	//  168  323:aload_0         
	//  169  324:astore_3        
		obj = ((Object) (s1));
	//  170  325:aload_1         
	//  171  326:astore          6
		bufferedoutputstream.write(abyte0, 0, i);
	//  172  328:aload           7
	//  173  330:aload           9
	//  174  332:iconst_0        
	//  175  333:iload           4
	//  176  335:invokevirtual   #187 <Method void BufferedOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//  177  338:goto            298
_L1:
		s2 = ((String) (bufferedoutputstream));
	//  178  341:aload           7
	//  179  343:astore_2        
		s3 = s;
	//  180  344:aload_0         
	//  181  345:astore_3        
		obj = ((Object) (s1));
	//  182  346:aload_1         
	//  183  347:astore          6
		((DataInputStream) (s1)).close();
	//  184  349:aload_1         
	//  185  350:invokevirtual   #190 <Method void DataInputStream.close()>
		s2 = ((String) (bufferedoutputstream));
	//  186  353:aload           7
	//  187  355:astore_2        
		s3 = s;
	//  188  356:aload_0         
	//  189  357:astore_3        
		obj = ((Object) (s1));
	//  190  358:aload_1         
	//  191  359:astore          6
		((HttpURLConnection) (s)).disconnect();
	//  192  361:aload_0         
	//  193  362:invokevirtual   #161 <Method void HttpURLConnection.disconnect()>
		s2 = ((String) (bufferedoutputstream));
	//  194  365:aload           7
	//  195  367:astore_2        
		s3 = s;
	//  196  368:aload_0         
	//  197  369:astore_3        
		obj = ((Object) (s1));
	//  198  370:aload_1         
	//  199  371:astore          6
		bufferedoutputstream.close();
	//  200  373:aload           7
	//  201  375:invokevirtual   #191 <Method void BufferedOutputStream.close()>
		if(s != null)
	//* 202  378:aload_0         
	//* 203  379:ifnull          386
			((HttpURLConnection) (s)).disconnect();
	//  204  382:aload_0         
	//  205  383:invokevirtual   #161 <Method void HttpURLConnection.disconnect()>
		try
		{
			((DataInputStream) (s1)).close();
	//  206  386:aload_1         
	//  207  387:invokevirtual   #190 <Method void DataInputStream.close()>
			bufferedoutputstream.close();
	//  208  390:aload           7
	//  209  392:invokevirtual   #191 <Method void BufferedOutputStream.close()>
		}
	//* 210  395:aload           8
	//* 211  397:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 212  398:astore_0        
		{
			AppboyLogger.e(a, "Exception during closing of file download streams.", ((Throwable) (s)));
	//  213  399:getstatic       #19  <Field String a>
	//  214  402:ldc1            #193 <String "Exception during closing of file download streams.">
	//  215  404:aload_0         
	//  216  405:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//  217  408:pop             
			return file;
	//  218  409:aload           8
	//  219  411:areturn         
		}
		return file;
		Object obj1;
		obj1;
	//  220  412:astore          8
		  goto _L3
	//* 221  414:goto            486
		obj1;
	//  222  417:astore          8
		  goto _L4
	//* 223  419:goto            557
		obj;
	//  224  422:astore          6
		s2 = null;
	//  225  424:aconst_null     
	//  226  425:astore_2        
		  goto _L5
	//* 227  426:goto            628
		obj1;
	//  228  429:astore          8
		bufferedoutputstream = null;
	//  229  431:aconst_null     
	//  230  432:astore          7
		  goto _L3
	//* 231  434:goto            486
		obj1;
	//  232  437:astore          8
		bufferedoutputstream = null;
	//  233  439:aconst_null     
	//  234  440:astore          7
		  goto _L4
	//* 235  442:goto            557
		obj;
	//  236  445:astore          6
		s2 = null;
	//  237  447:aconst_null     
	//  238  448:astore_2        
		s1 = ((String) (bufferedoutputstream));
	//  239  449:aload           7
	//  240  451:astore_1        
		  goto _L5
	//* 241  452:goto            628
		obj1;
	//  242  455:astore          8
		  goto _L6
	//* 243  457:goto            481
		obj1;
	//  244  460:astore          8
		  goto _L7
	//* 245  462:goto            552
		obj;
	//  246  465:astore          6
		s = null;
	//  247  467:aconst_null     
	//  248  468:astore_0        
		s2 = s;
	//  249  469:aload_0         
	//  250  470:astore_2        
		s1 = ((String) (bufferedoutputstream));
	//  251  471:aload           7
	//  252  473:astore_1        
		  goto _L5
	//* 253  474:goto            628
		obj1;
	//  254  477:astore          8
		s = null;
	//  255  479:aconst_null     
	//  256  480:astore_0        
_L6:
		s1 = null;
	//  257  481:aconst_null     
	//  258  482:astore_1        
		bufferedoutputstream = null;
	//  259  483:aconst_null     
	//  260  484:astore          7
_L3:
		s2 = ((String) (bufferedoutputstream));
	//  261  486:aload           7
	//  262  488:astore_2        
		s3 = s;
	//  263  489:aload_0         
	//  264  490:astore_3        
		obj = ((Object) (s1));
	//  265  491:aload_1         
	//  266  492:astore          6
		AppboyLogger.e(a, "Throwable during download of file from url.", ((Throwable) (obj1)));
	//  267  494:getstatic       #19  <Field String a>
	//  268  497:ldc1            #195 <String "Throwable during download of file from url.">
	//  269  499:aload           8
	//  270  501:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//  271  504:pop             
		if(s != null)
	//* 272  505:aload_0         
	//* 273  506:ifnull          513
			((HttpURLConnection) (s)).disconnect();
	//  274  509:aload_0         
	//  275  510:invokevirtual   #161 <Method void HttpURLConnection.disconnect()>
		if(s1 == null)
			break MISSING_BLOCK_LABEL_524;
	//  276  513:aload_1         
	//  277  514:ifnull          524
		((DataInputStream) (s1)).close();
	//  278  517:aload_1         
	//  279  518:invokevirtual   #190 <Method void DataInputStream.close()>
	//* 280  521:goto            524
		if(bufferedoutputstream == null) goto _L9; else goto _L8
	//  281  524:aload           7
	//  282  526:ifnull          546
_L8:
		bufferedoutputstream.close();
	//  283  529:aload           7
	//  284  531:invokevirtual   #191 <Method void BufferedOutputStream.close()>
		return null;
	//  285  534:aconst_null     
	//  286  535:areturn         
_L12:
		AppboyLogger.e(a, "Exception during closing of file download streams.", ((Throwable) (s)));
	//  287  536:getstatic       #19  <Field String a>
	//  288  539:ldc1            #193 <String "Exception during closing of file download streams.">
	//  289  541:aload_0         
	//  290  542:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//  291  545:pop             
_L9:
		return null;
	//  292  546:aconst_null     
	//  293  547:areturn         
		obj1;
	//  294  548:astore          8
		s = null;
	//  295  550:aconst_null     
	//  296  551:astore_0        
_L7:
		s1 = null;
	//  297  552:aconst_null     
	//  298  553:astore_1        
		bufferedoutputstream = null;
	//  299  554:aconst_null     
	//  300  555:astore          7
_L4:
		s2 = ((String) (bufferedoutputstream));
	//  301  557:aload           7
	//  302  559:astore_2        
		s3 = s;
	//  303  560:aload_0         
	//  304  561:astore_3        
		obj = ((Object) (s1));
	//  305  562:aload_1         
	//  306  563:astore          6
		AppboyLogger.e(a, "Exception during download of file from url.", ((Throwable) (obj1)));
	//  307  565:getstatic       #19  <Field String a>
	//  308  568:ldc1            #197 <String "Exception during download of file from url.">
	//  309  570:aload           8
	//  310  572:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//  311  575:pop             
		if(s != null)
	//* 312  576:aload_0         
	//* 313  577:ifnull          584
			((HttpURLConnection) (s)).disconnect();
	//  314  580:aload_0         
	//  315  581:invokevirtual   #161 <Method void HttpURLConnection.disconnect()>
		if(s1 == null)
			break MISSING_BLOCK_LABEL_595;
	//  316  584:aload_1         
	//  317  585:ifnull          595
		((DataInputStream) (s1)).close();
	//  318  588:aload_1         
	//  319  589:invokevirtual   #190 <Method void DataInputStream.close()>
	//* 320  592:goto            595
		if(bufferedoutputstream == null) goto _L11; else goto _L10
	//  321  595:aload           7
	//  322  597:ifnull          617
_L10:
		bufferedoutputstream.close();
	//  323  600:aload           7
	//  324  602:invokevirtual   #191 <Method void BufferedOutputStream.close()>
		return null;
	//  325  605:aconst_null     
	//  326  606:areturn         
_L13:
		AppboyLogger.e(a, "Exception during closing of file download streams.", ((Throwable) (s)));
	//  327  607:getstatic       #19  <Field String a>
	//  328  610:ldc1            #193 <String "Exception during closing of file download streams.">
	//  329  612:aload_0         
	//  330  613:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//  331  616:pop             
_L11:
		return null;
	//  332  617:aconst_null     
	//  333  618:areturn         
		s;
	//  334  619:astore_0        
		s1 = ((String) (obj));
	//  335  620:aload           6
	//  336  622:astore_1        
		obj = ((Object) (s));
	//  337  623:aload_0         
	//  338  624:astore          6
		s = s3;
	//  339  626:aload_3         
	//  340  627:astore_0        
_L5:
		if(s != null)
	//* 341  628:aload_0         
	//* 342  629:ifnull          636
			((HttpURLConnection) (s)).disconnect();
	//  343  632:aload_0         
	//  344  633:invokevirtual   #161 <Method void HttpURLConnection.disconnect()>
		if(s1 == null)
			break MISSING_BLOCK_LABEL_647;
	//  345  636:aload_1         
	//  346  637:ifnull          647
		((DataInputStream) (s1)).close();
	//  347  640:aload_1         
	//  348  641:invokevirtual   #190 <Method void DataInputStream.close()>
	//* 349  644:goto            647
		if(s2 != null)
	//* 350  647:aload_2         
	//* 351  648:ifnull          668
			try
			{
				((BufferedOutputStream) (s2)).close();
	//  352  651:aload_2         
	//  353  652:invokevirtual   #191 <Method void BufferedOutputStream.close()>
			}
	//* 354  655:goto            668
	//* 355  658:getstatic       #19  <Field String a>
	//* 356  661:ldc1            #193 <String "Exception during closing of file download streams.">
	//* 357  663:aload_0         
	//* 358  664:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//* 359  667:pop             
	//* 360  668:aload           6
	//* 361  670:athrow          
	//* 362  671:astore_0        
	//* 363  672:goto            536
	//* 364  675:astore_0        
	//* 365  676:goto            607
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				AppboyLogger.e(a, "Exception during closing of file download streams.", ((Throwable) (s)));
			}
		throw obj;
		s;
		  goto _L12
		s;
		  goto _L13
	//* 366  679:astore_0        
	//* 367  680:goto            658
	}

	public static String getAssetFileStringContents(AssetManager assetmanager, String s)
	{
		Object obj = ((Object) (assetmanager.open(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #205 <Method InputStream AssetManager.open(String)>
	//    3    5:astore_2        
		assetmanager = ((AssetManager) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((InputStream) (obj)), "UTF-8"))))));
	//    4    6:new             #207 <Class BufferedReader>
	//    5    9:dup             
	//    6   10:new             #209 <Class InputStreamReader>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:ldc1            #211 <String "UTF-8">
	//   10   17:invokespecial   #214 <Method void InputStreamReader(InputStream, String)>
	//   11   20:invokespecial   #217 <Method void BufferedReader(java.io.Reader)>
	//   12   23:astore_0        
		Object obj1;
		Object obj2;
		obj1 = ((Object) (assetmanager));
	//   13   24:aload_0         
	//   14   25:astore_3        
		obj2 = obj;
	//   15   26:aload_2         
	//   16   27:astore          4
		Object obj3 = ((Object) (new StringBuilder()));
	//   17   29:new             #78  <Class StringBuilder>
	//   18   32:dup             
	//   19   33:invokespecial   #79  <Method void StringBuilder()>
	//   20   36:astore          5
_L2:
		obj1 = ((Object) (assetmanager));
	//   21   38:aload_0         
	//   22   39:astore_3        
		obj2 = obj;
	//   23   40:aload_2         
	//   24   41:astore          4
		String s2 = ((BufferedReader) (assetmanager)).readLine();
	//   25   43:aload_0         
	//   26   44:invokevirtual   #220 <Method String BufferedReader.readLine()>
	//   27   47:astore          6
		if(s2 == null)
			break; /* Loop/switch isn't completed */
	//   28   49:aload           6
	//   29   51:ifnull          83
		obj1 = ((Object) (assetmanager));
	//   30   54:aload_0         
	//   31   55:astore_3        
		obj2 = obj;
	//   32   56:aload_2         
	//   33   57:astore          4
		((StringBuilder) (obj3)).append(s2);
	//   34   59:aload           5
	//   35   61:aload           6
	//   36   63:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   37   66:pop             
		obj1 = ((Object) (assetmanager));
	//   38   67:aload_0         
	//   39   68:astore_3        
		obj2 = obj;
	//   40   69:aload_2         
	//   41   70:astore          4
		((StringBuilder) (obj3)).append('\n');
	//   42   72:aload           5
	//   43   74:bipush          10
	//   44   76:invokevirtual   #223 <Method StringBuilder StringBuilder.append(char)>
	//   45   79:pop             
		if(true) goto _L2; else goto _L1
	//   46   80:goto            38
_L1:
		obj1 = ((Object) (assetmanager));
	//   47   83:aload_0         
	//   48   84:astore_3        
		obj2 = obj;
	//   49   85:aload_2         
	//   50   86:astore          4
		obj3 = ((Object) (((StringBuilder) (obj3)).toString()));
	//   51   88:aload           5
	//   52   90:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   53   93:astore          5
		if(obj != null)
	//*  54   95:aload_2         
	//*  55   96:ifnull          106
			try
			{
				((InputStream) (obj)).close();
	//   56   99:aload_2         
	//   57  100:invokevirtual   #226 <Method void InputStream.close()>
			}
	//*  58  103:goto            106
	//*  59  106:aload_0         
	//*  60  107:invokevirtual   #227 <Method void BufferedReader.close()>
	//*  61  110:aload           5
	//*  62  112:areturn         
	//*  63  113:getstatic       #19  <Field String a>
	//*  64  116:astore_0        
	//*  65  117:new             #78  <Class StringBuilder>
	//*  66  120:dup             
	//*  67  121:invokespecial   #79  <Method void StringBuilder()>
	//*  68  124:astore_2        
	//*  69  125:aload_2         
	//*  70  126:ldc1            #229 <String "Exception attempting to close file download streams for path:">
	//*  71  128:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//*  72  131:pop             
	//*  73  132:aload_2         
	//*  74  133:aload_1         
	//*  75  134:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//*  76  137:pop             
	//*  77  138:aload_0         
	//*  78  139:aload_2         
	//*  79  140:invokevirtual   #92  <Method String StringBuilder.toString()>
	//*  80  143:aload_3         
	//*  81  144:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//*  82  147:pop             
	//*  83  148:aload           5
	//*  84  150:areturn         
	//*  85  151:astore          5
	//*  86  153:goto            183
	//*  87  156:astore_0        
	//*  88  157:aconst_null     
	//*  89  158:astore_3        
	//*  90  159:goto            312
	//*  91  162:astore          5
	//*  92  164:aconst_null     
	//*  93  165:astore_0        
	//*  94  166:goto            183
	//*  95  169:astore_0        
	//*  96  170:aconst_null     
	//*  97  171:astore_3        
	//*  98  172:aload_3         
	//*  99  173:astore_2        
	//* 100  174:goto            312
	//* 101  177:astore          5
	//* 102  179:aconst_null     
	//* 103  180:astore_2        
	//* 104  181:aload_2         
	//* 105  182:astore_0        
	//* 106  183:aload_0         
	//* 107  184:astore_3        
	//* 108  185:aload_2         
	//* 109  186:astore          4
	//* 110  188:getstatic       #19  <Field String a>
	//* 111  191:astore          6
	//* 112  193:aload_0         
	//* 113  194:astore_3        
	//* 114  195:aload_2         
	//* 115  196:astore          4
	//* 116  198:new             #78  <Class StringBuilder>
	//* 117  201:dup             
	//* 118  202:invokespecial   #79  <Method void StringBuilder()>
	//* 119  205:astore          7
	//* 120  207:aload_0         
	//* 121  208:astore_3        
	//* 122  209:aload_2         
	//* 123  210:astore          4
	//* 124  212:aload           7
	//* 125  214:ldc1            #231 <String "Exception attempting to get asset content for ">
	//* 126  216:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 127  219:pop             
	//* 128  220:aload_0         
	//* 129  221:astore_3        
	//* 130  222:aload_2         
	//* 131  223:astore          4
	//* 132  225:aload           7
	//* 133  227:aload_1         
	//* 134  228:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 135  231:pop             
	//* 136  232:aload_0         
	//* 137  233:astore_3        
	//* 138  234:aload_2         
	//* 139  235:astore          4
	//* 140  237:aload           6
	//* 141  239:aload           7
	//* 142  241:invokevirtual   #92  <Method String StringBuilder.toString()>
	//* 143  244:aload           5
	//* 144  246:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//* 145  249:pop             
	//* 146  250:aload_2         
	//* 147  251:ifnull          261
	//* 148  254:aload_2         
	//* 149  255:invokevirtual   #226 <Method void InputStream.close()>
	//* 150  258:goto            261
	//* 151  261:aload_0         
	//* 152  262:ifnull          306
	//* 153  265:aload_0         
	//* 154  266:invokevirtual   #227 <Method void BufferedReader.close()>
	//* 155  269:aconst_null     
	//* 156  270:areturn         
	//* 157  271:getstatic       #19  <Field String a>
	//* 158  274:astore_0        
	//* 159  275:new             #78  <Class StringBuilder>
	//* 160  278:dup             
	//* 161  279:invokespecial   #79  <Method void StringBuilder()>
	//* 162  282:astore_2        
	//* 163  283:aload_2         
	//* 164  284:ldc1            #229 <String "Exception attempting to close file download streams for path:">
	//* 165  286:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 166  289:pop             
	//* 167  290:aload_2         
	//* 168  291:aload_1         
	//* 169  292:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 170  295:pop             
	//* 171  296:aload_0         
	//* 172  297:aload_2         
	//* 173  298:invokevirtual   #92  <Method String StringBuilder.toString()>
	//* 174  301:aload_3         
	//* 175  302:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//* 176  305:pop             
	//* 177  306:aconst_null     
	//* 178  307:areturn         
	//* 179  308:astore_0        
	//* 180  309:aload           4
	//* 181  311:astore_2        
	//* 182  312:aload_2         
	//* 183  313:ifnull          323
	//* 184  316:aload_2         
	//* 185  317:invokevirtual   #226 <Method void InputStream.close()>
	//* 186  320:goto            323
	//* 187  323:aload_3         
	//* 188  324:ifnull          370
	//* 189  327:aload_3         
	//* 190  328:invokevirtual   #227 <Method void BufferedReader.close()>
	//* 191  331:goto            370
	//* 192  334:getstatic       #19  <Field String a>
	//* 193  337:astore_2        
	//* 194  338:new             #78  <Class StringBuilder>
	//* 195  341:dup             
	//* 196  342:invokespecial   #79  <Method void StringBuilder()>
	//* 197  345:astore_3        
	//* 198  346:aload_3         
	//* 199  347:ldc1            #229 <String "Exception attempting to close file download streams for path:">
	//* 200  349:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 201  352:pop             
	//* 202  353:aload_3         
	//* 203  354:aload_1         
	//* 204  355:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//* 205  358:pop             
	//* 206  359:aload_2         
	//* 207  360:aload_3         
	//* 208  361:invokevirtual   #92  <Method String StringBuilder.toString()>
	//* 209  364:aload           4
	//* 210  366:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//* 211  369:pop             
	//* 212  370:aload_0         
	//* 213  371:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj1)
			{
				assetmanager = ((AssetManager) (a));
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("Exception attempting to close file download streams for path:");
				((StringBuilder) (obj)).append(s);
				AppboyLogger.e(((String) (assetmanager)), ((StringBuilder) (obj)).toString(), ((Throwable) (obj1)));
				return ((String) (obj3));
			}
		((BufferedReader) (assetmanager)).close();
		return ((String) (obj3));
		Exception exception1;
		exception1;
		  goto _L3
		assetmanager;
		obj1 = null;
		  goto _L4
		exception1;
		assetmanager = null;
		  goto _L3
		assetmanager;
		obj1 = null;
		obj = obj1;
		  goto _L4
		exception1;
		obj = null;
		assetmanager = ((AssetManager) (obj));
_L3:
		obj1 = ((Object) (assetmanager));
		obj2 = obj;
		s2 = a;
		obj1 = ((Object) (assetmanager));
		obj2 = obj;
		StringBuilder stringbuilder = new StringBuilder();
		obj1 = ((Object) (assetmanager));
		obj2 = obj;
		stringbuilder.append("Exception attempting to get asset content for ");
		obj1 = ((Object) (assetmanager));
		obj2 = obj;
		stringbuilder.append(s);
		obj1 = ((Object) (assetmanager));
		obj2 = obj;
		AppboyLogger.e(s2, stringbuilder.toString(), ((Throwable) (exception1)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_261;
		((InputStream) (obj)).close();
		if(assetmanager == null) goto _L6; else goto _L5
_L5:
		((BufferedReader) (assetmanager)).close();
		return null;
_L8:
		assetmanager = ((AssetManager) (a));
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Exception attempting to close file download streams for path:");
		((StringBuilder) (obj)).append(s);
		AppboyLogger.e(((String) (assetmanager)), ((StringBuilder) (obj)).toString(), ((Throwable) (obj1)));
_L6:
		return null;
		assetmanager;
		obj = obj2;
_L4:
		if(obj == null)
			break MISSING_BLOCK_LABEL_323;
		((InputStream) (obj)).close();
		Exception exception;
		String s1;
		if(obj1 != null)
			try
			{
				((BufferedReader) (obj1)).close();
			}
	//* 214  372:astore_3        
	//* 215  373:goto            113
	//* 216  376:astore_3        
	//* 217  377:goto            271
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				s1 = a;
				obj1 = ((Object) (new StringBuilder()));
				((StringBuilder) (obj1)).append("Exception attempting to close file download streams for path:");
				((StringBuilder) (obj1)).append(s);
				AppboyLogger.e(s1, ((StringBuilder) (obj1)).toString(), ((Throwable) (exception)));
			}
		throw assetmanager;
		obj1;
		if(true) goto _L8; else goto _L7
_L7:
	//* 218  380:astore          4
	//* 219  382:goto            334
	}

	public static boolean isLocalUri(Uri uri)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(uri == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       17
		{
			AppboyLogger.i(a, "Null Uri received.");
	//    4    6:getstatic       #19  <Field String a>
	//    5    9:ldc1            #235 <String "Null Uri received.">
	//    6   11:invokestatic    #111 <Method int AppboyLogger.i(String, String)>
	//    7   14:pop             
			return false;
	//    8   15:iconst_0        
	//    9   16:ireturn         
		}
		uri = ((Uri) (uri.getScheme()));
	//   10   17:aload_0         
	//   11   18:invokevirtual   #240 <Method String Uri.getScheme()>
	//   12   21:astore_0        
		if(StringUtils.isNullOrBlank(((String) (uri))) || ((String) (uri)).equals("file"))
	//*  13   22:aload_0         
	//*  14   23:invokestatic    #117 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  15   26:ifne            38
	//*  16   29:aload_0         
	//*  17   30:ldc1            #242 <String "file">
	//*  18   32:invokevirtual   #246 <Method boolean String.equals(Object)>
	//*  19   35:ifeq            40
			flag = true;
	//   20   38:iconst_1        
	//   21   39:istore_1        
		return flag;
	//   22   40:iload_1         
	//   23   41:ireturn         
	}

	public static boolean isRemoteUri(Uri uri)
	{
		if(uri == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.i(a, "Null Uri received.");
	//    2    4:getstatic       #19  <Field String a>
	//    3    7:ldc1            #235 <String "Null Uri received.">
	//    4    9:invokestatic    #111 <Method int AppboyLogger.i(String, String)>
	//    5   12:pop             
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
		}
		uri = ((Uri) (uri.getScheme()));
	//    8   15:aload_0         
	//    9   16:invokevirtual   #240 <Method String Uri.getScheme()>
	//   10   19:astore_0        
		if(StringUtils.isNullOrBlank(((String) (uri))))
	//*  11   20:aload_0         
	//*  12   21:invokestatic    #117 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  13   24:ifeq            38
		{
			AppboyLogger.i(a, "Null or blank Uri scheme.");
	//   14   27:getstatic       #19  <Field String a>
	//   15   30:ldc1            #249 <String "Null or blank Uri scheme.">
	//   16   32:invokestatic    #111 <Method int AppboyLogger.i(String, String)>
	//   17   35:pop             
			return false;
	//   18   36:iconst_0        
	//   19   37:ireturn         
		} else
		{
			return REMOTE_SCHEMES.contains(((Object) (uri)));
	//   20   38:getstatic       #47  <Field List REMOTE_SCHEMES>
	//   21   41:aload_0         
	//   22   42:invokeinterface #254 <Method boolean List.contains(Object)>
	//   23   47:ireturn         
		}
	}

	public static final List REMOTE_SCHEMES = Collections.unmodifiableList(Arrays.asList(((Object []) (new String[] {
		"http", "https", "ftp", "ftps", "about", "javascript"
	}))));
	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/support/AppboyFileUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyFileUtils>
	//    1    2:invokestatic    #17  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #19  <Field String a>
	//    3    8:bipush          6
	//    4   10:anewarray       String[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:ldc1            #23  <String "http">
	//    8   17:aastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:ldc1            #25  <String "https">
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_2        
	//   15   25:ldc1            #27  <String "ftp">
	//   16   27:aastore         
	//   17   28:dup             
	//   18   29:iconst_3        
	//   19   30:ldc1            #29  <String "ftps">
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_4        
	//   23   35:ldc1            #31  <String "about">
	//   24   37:aastore         
	//   25   38:dup             
	//   26   39:iconst_5        
	//   27   40:ldc1            #33  <String "javascript">
	//   28   42:aastore         
	//   29   43:invokestatic    #39  <Method List Arrays.asList(Object[])>
	//   30   46:invokestatic    #45  <Method List Collections.unmodifiableList(List)>
	//   31   49:putstatic       #47  <Field List REMOTE_SCHEMES>
	//*  32   52:return          
	}
}
