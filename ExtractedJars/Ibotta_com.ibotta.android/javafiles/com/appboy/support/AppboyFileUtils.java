// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import android.content.res.AssetManager;
import android.net.Uri;
import bo.app.k;
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
		Object obj2;
		boolean flag = Appboy.getOutboundNetworkRequestsOffline();
	//    0    0:invokestatic    #105 <Method boolean Appboy.getOutboundNetworkRequestsOffline()>
	//    1    3:istore          5
		obj2 = null;
	//    2    5:aconst_null     
	//    3    6:astore          8
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
		Object obj5;
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
		obj5 = ((Object) (new File(s, ((String) (obj)))));
	//   80  155:new             #57  <Class File>
	//   81  158:dup             
	//   82  159:aload_0         
	//   83  160:aload           6
	//   84  162:invokespecial   #132 <Method void File(String, String)>
	//   85  165:astore          10
		s = ((String) ((HttpURLConnection)k.a(new URL(s1))));
	//   86  167:new             #134 <Class URL>
	//   87  170:dup             
	//   88  171:aload_1         
	//   89  172:invokespecial   #135 <Method void URL(String)>
	//   90  175:invokestatic    #140 <Method java.net.URLConnection k.a(URL)>
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
		Object obj1;
		byte abyte0[];
		abyte0 = new byte[8192];
	//  136  261:sipush          8192
	//  137  264:newarray        byte[]
	//  138  266:astore          11
		obj1 = ((Object) (new DataInputStream(((HttpURLConnection) (s)).getInputStream())));
	//  139  268:new             #163 <Class DataInputStream>
	//  140  271:dup             
	//  141  272:aload_0         
	//  142  273:invokevirtual   #167 <Method InputStream HttpURLConnection.getInputStream()>
	//  143  276:invokespecial   #170 <Method void DataInputStream(InputStream)>
	//  144  279:astore          7
		Object obj3 = ((Object) (new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(((File) (obj5))))))));
	//  145  281:new             #172 <Class BufferedOutputStream>
	//  146  284:dup             
	//  147  285:new             #174 <Class FileOutputStream>
	//  148  288:dup             
	//  149  289:aload           10
	//  150  291:invokespecial   #176 <Method void FileOutputStream(File)>
	//  151  294:invokespecial   #179 <Method void BufferedOutputStream(java.io.OutputStream)>
	//  152  297:astore          9
_L2:
		s2 = ((String) (obj1));
	//  153  299:aload           7
	//  154  301:astore_2        
		s3 = ((String) (obj3));
	//  155  302:aload           9
	//  156  304:astore_3        
		obj = ((Object) (s));
	//  157  305:aload_0         
	//  158  306:astore          6
		i = ((DataInputStream) (obj1)).read(abyte0);
	//  159  308:aload           7
	//  160  310:aload           11
	//  161  312:invokevirtual   #183 <Method int DataInputStream.read(byte[])>
	//  162  315:istore          4
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//  163  317:iload           4
	//  164  319:iconst_m1       
	//  165  320:icmpeq          345
		s2 = ((String) (obj1));
	//  166  323:aload           7
	//  167  325:astore_2        
		s3 = ((String) (obj3));
	//  168  326:aload           9
	//  169  328:astore_3        
		obj = ((Object) (s));
	//  170  329:aload_0         
	//  171  330:astore          6
		((BufferedOutputStream) (obj3)).write(abyte0, 0, i);
	//  172  332:aload           9
	//  173  334:aload           11
	//  174  336:iconst_0        
	//  175  337:iload           4
	//  176  339:invokevirtual   #187 <Method void BufferedOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//  177  342:goto            299
_L1:
		s2 = ((String) (obj1));
	//  178  345:aload           7
	//  179  347:astore_2        
		s3 = ((String) (obj3));
	//  180  348:aload           9
	//  181  350:astore_3        
		obj = ((Object) (s));
	//  182  351:aload_0         
	//  183  352:astore          6
		((DataInputStream) (obj1)).close();
	//  184  354:aload           7
	//  185  356:invokevirtual   #190 <Method void DataInputStream.close()>
		s2 = ((String) (obj1));
	//  186  359:aload           7
	//  187  361:astore_2        
		s3 = ((String) (obj3));
	//  188  362:aload           9
	//  189  364:astore_3        
		obj = ((Object) (s));
	//  190  365:aload_0         
	//  191  366:astore          6
		((HttpURLConnection) (s)).disconnect();
	//  192  368:aload_0         
	//  193  369:invokevirtual   #161 <Method void HttpURLConnection.disconnect()>
		s2 = ((String) (obj1));
	//  194  372:aload           7
	//  195  374:astore_2        
		s3 = ((String) (obj3));
	//  196  375:aload           9
	//  197  377:astore_3        
		obj = ((Object) (s));
	//  198  378:aload_0         
	//  199  379:astore          6
		((BufferedOutputStream) (obj3)).close();
	//  200  381:aload           9
	//  201  383:invokevirtual   #191 <Method void BufferedOutputStream.close()>
		if(s != null)
	//* 202  386:aload_0         
	//* 203  387:ifnull          394
			((HttpURLConnection) (s)).disconnect();
	//  204  390:aload_0         
	//  205  391:invokevirtual   #161 <Method void HttpURLConnection.disconnect()>
		try
		{
			((DataInputStream) (obj1)).close();
	//  206  394:aload           7
	//  207  396:invokevirtual   #190 <Method void DataInputStream.close()>
			((BufferedOutputStream) (obj3)).close();
	//  208  399:aload           9
	//  209  401:invokevirtual   #191 <Method void BufferedOutputStream.close()>
		}
	//* 210  404:aload           10
	//* 211  406:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 212  407:astore_0        
		{
			AppboyLogger.e(a, "Exception during closing of file download streams.", ((Throwable) (s)));
	//  213  408:getstatic       #19  <Field String a>
	//  214  411:ldc1            #193 <String "Exception during closing of file download streams.">
	//  215  413:aload_0         
	//  216  414:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//  217  417:pop             
			return ((File) (obj5));
	//  218  418:aload           10
	//  219  420:areturn         
		}
		return ((File) (obj5));
		s2;
	//  220  421:astore_2        
		obj2 = obj1;
	//  221  422:aload           7
	//  222  424:astore          8
		obj1 = obj3;
	//  223  426:aload           9
	//  224  428:astore          7
		obj3 = ((Object) (s2));
	//  225  430:aload_2         
	//  226  431:astore          9
		  goto _L3
	//* 227  433:goto            528
		s2;
	//  228  436:astore_2        
		Object obj4;
		obj2 = obj1;
	//  229  437:aload           7
	//  230  439:astore          8
		obj1 = obj3;
	//  231  441:aload           9
	//  232  443:astore          7
		obj4 = ((Object) (s2));
	//  233  445:aload_2         
	//  234  446:astore          9
		  goto _L4
	//* 235  448:goto            670
		s1;
	//  236  451:astore_1        
		s3 = null;
	//  237  452:aconst_null     
	//  238  453:astore_3        
		s2 = ((String) (obj1));
	//  239  454:aload           7
	//  240  456:astore_2        
		  goto _L5
	//* 241  457:goto            806
		obj4;
	//  242  460:astore          9
		s2 = null;
	//  243  462:aconst_null     
	//  244  463:astore_2        
		obj2 = obj1;
	//  245  464:aload           7
	//  246  466:astore          8
		obj1 = ((Object) (s2));
	//  247  468:aload_2         
	//  248  469:astore          7
		  goto _L3
	//* 249  471:goto            528
		obj4;
	//  250  474:astore          9
		s2 = null;
	//  251  476:aconst_null     
	//  252  477:astore_2        
		obj2 = obj1;
	//  253  478:aload           7
	//  254  480:astore          8
		obj1 = ((Object) (s2));
	//  255  482:aload_2         
	//  256  483:astore          7
		  goto _L4
	//* 257  485:goto            670
		s1;
	//  258  488:astore_1        
		s3 = null;
	//  259  489:aconst_null     
	//  260  490:astore_3        
		s2 = ((String) (obj2));
	//  261  491:aload           8
	//  262  493:astore_2        
		  goto _L5
	//* 263  494:goto            806
		obj4;
	//  264  497:astore          9
		  goto _L6
	//* 265  499:goto            522
		obj4;
	//  266  502:astore          9
		  goto _L7
	//* 267  504:goto            664
		s1;
	//  268  507:astore_1        
		s = null;
	//  269  508:aconst_null     
	//  270  509:astore_0        
		s3 = s;
	//  271  510:aload_0         
	//  272  511:astore_3        
		s2 = ((String) (obj2));
	//  273  512:aload           8
	//  274  514:astore_2        
		  goto _L5
	//* 275  515:goto            806
		obj4;
	//  276  518:astore          9
		s = null;
	//  277  520:aconst_null     
	//  278  521:astore_0        
_L6:
		obj2 = null;
	//  279  522:aconst_null     
	//  280  523:astore          8
		obj1 = null;
	//  281  525:aconst_null     
	//  282  526:astore          7
_L3:
		s2 = ((String) (obj2));
	//  283  528:aload           8
	//  284  530:astore_2        
		s3 = ((String) (obj1));
	//  285  531:aload           7
	//  286  533:astore_3        
		obj = ((Object) (s));
	//  287  534:aload_0         
	//  288  535:astore          6
		obj5 = ((Object) (a));
	//  289  537:getstatic       #19  <Field String a>
	//  290  540:astore          10
		s2 = ((String) (obj2));
	//  291  542:aload           8
	//  292  544:astore_2        
		s3 = ((String) (obj1));
	//  293  545:aload           7
	//  294  547:astore_3        
		obj = ((Object) (s));
	//  295  548:aload_0         
	//  296  549:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//  297  551:new             #78  <Class StringBuilder>
	//  298  554:dup             
	//  299  555:invokespecial   #79  <Method void StringBuilder()>
	//  300  558:astore          11
		s2 = ((String) (obj2));
	//  301  560:aload           8
	//  302  562:astore_2        
		s3 = ((String) (obj1));
	//  303  563:aload           7
	//  304  565:astore_3        
		obj = ((Object) (s));
	//  305  566:aload_0         
	//  306  567:astore          6
		stringbuilder.append("Throwable during download of file from url : ");
	//  307  569:aload           11
	//  308  571:ldc1            #195 <String "Throwable during download of file from url : ">
	//  309  573:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  310  576:pop             
		s2 = ((String) (obj2));
	//  311  577:aload           8
	//  312  579:astore_2        
		s3 = ((String) (obj1));
	//  313  580:aload           7
	//  314  582:astore_3        
		obj = ((Object) (s));
	//  315  583:aload_0         
	//  316  584:astore          6
		stringbuilder.append(s1);
	//  317  586:aload           11
	//  318  588:aload_1         
	//  319  589:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  320  592:pop             
		s2 = ((String) (obj2));
	//  321  593:aload           8
	//  322  595:astore_2        
		s3 = ((String) (obj1));
	//  323  596:aload           7
	//  324  598:astore_3        
		obj = ((Object) (s));
	//  325  599:aload_0         
	//  326  600:astore          6
		AppboyLogger.e(((String) (obj5)), stringbuilder.toString(), ((Throwable) (obj4)));
	//  327  602:aload           10
	//  328  604:aload           11
	//  329  606:invokevirtual   #92  <Method String StringBuilder.toString()>
	//  330  609:aload           9
	//  331  611:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//  332  614:pop             
		if(s != null)
	//* 333  615:aload_0         
	//* 334  616:ifnull          623
			((HttpURLConnection) (s)).disconnect();
	//  335  619:aload_0         
	//  336  620:invokevirtual   #161 <Method void HttpURLConnection.disconnect()>
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_636;
	//  337  623:aload           8
	//  338  625:ifnull          636
		((DataInputStream) (obj2)).close();
	//  339  628:aload           8
	//  340  630:invokevirtual   #190 <Method void DataInputStream.close()>
	//* 341  633:goto            636
		if(obj1 == null) goto _L9; else goto _L8
	//  342  636:aload           7
	//  343  638:ifnull          658
_L8:
		((BufferedOutputStream) (obj1)).close();
	//  344  641:aload           7
	//  345  643:invokevirtual   #191 <Method void BufferedOutputStream.close()>
		return null;
	//  346  646:aconst_null     
	//  347  647:areturn         
_L12:
		AppboyLogger.e(a, "Exception during closing of file download streams.", ((Throwable) (s)));
	//  348  648:getstatic       #19  <Field String a>
	//  349  651:ldc1            #193 <String "Exception during closing of file download streams.">
	//  350  653:aload_0         
	//  351  654:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//  352  657:pop             
_L9:
		return null;
	//  353  658:aconst_null     
	//  354  659:areturn         
		obj4;
	//  355  660:astore          9
		s = null;
	//  356  662:aconst_null     
	//  357  663:astore_0        
_L7:
		obj2 = null;
	//  358  664:aconst_null     
	//  359  665:astore          8
		obj1 = null;
	//  360  667:aconst_null     
	//  361  668:astore          7
_L4:
		s2 = ((String) (obj2));
	//  362  670:aload           8
	//  363  672:astore_2        
		s3 = ((String) (obj1));
	//  364  673:aload           7
	//  365  675:astore_3        
		obj = ((Object) (s));
	//  366  676:aload_0         
	//  367  677:astore          6
		obj5 = ((Object) (a));
	//  368  679:getstatic       #19  <Field String a>
	//  369  682:astore          10
		s2 = ((String) (obj2));
	//  370  684:aload           8
	//  371  686:astore_2        
		s3 = ((String) (obj1));
	//  372  687:aload           7
	//  373  689:astore_3        
		obj = ((Object) (s));
	//  374  690:aload_0         
	//  375  691:astore          6
		stringbuilder = new StringBuilder();
	//  376  693:new             #78  <Class StringBuilder>
	//  377  696:dup             
	//  378  697:invokespecial   #79  <Method void StringBuilder()>
	//  379  700:astore          11
		s2 = ((String) (obj2));
	//  380  702:aload           8
	//  381  704:astore_2        
		s3 = ((String) (obj1));
	//  382  705:aload           7
	//  383  707:astore_3        
		obj = ((Object) (s));
	//  384  708:aload_0         
	//  385  709:astore          6
		stringbuilder.append("Exception during download of file from url : ");
	//  386  711:aload           11
	//  387  713:ldc1            #197 <String "Exception during download of file from url : ">
	//  388  715:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  389  718:pop             
		s2 = ((String) (obj2));
	//  390  719:aload           8
	//  391  721:astore_2        
		s3 = ((String) (obj1));
	//  392  722:aload           7
	//  393  724:astore_3        
		obj = ((Object) (s));
	//  394  725:aload_0         
	//  395  726:astore          6
		stringbuilder.append(s1);
	//  396  728:aload           11
	//  397  730:aload_1         
	//  398  731:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  399  734:pop             
		s2 = ((String) (obj2));
	//  400  735:aload           8
	//  401  737:astore_2        
		s3 = ((String) (obj1));
	//  402  738:aload           7
	//  403  740:astore_3        
		obj = ((Object) (s));
	//  404  741:aload_0         
	//  405  742:astore          6
		AppboyLogger.e(((String) (obj5)), stringbuilder.toString(), ((Throwable) (obj4)));
	//  406  744:aload           10
	//  407  746:aload           11
	//  408  748:invokevirtual   #92  <Method String StringBuilder.toString()>
	//  409  751:aload           9
	//  410  753:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//  411  756:pop             
		if(s != null)
	//* 412  757:aload_0         
	//* 413  758:ifnull          765
			((HttpURLConnection) (s)).disconnect();
	//  414  761:aload_0         
	//  415  762:invokevirtual   #161 <Method void HttpURLConnection.disconnect()>
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_778;
	//  416  765:aload           8
	//  417  767:ifnull          778
		((DataInputStream) (obj2)).close();
	//  418  770:aload           8
	//  419  772:invokevirtual   #190 <Method void DataInputStream.close()>
	//* 420  775:goto            778
		if(obj1 == null) goto _L11; else goto _L10
	//  421  778:aload           7
	//  422  780:ifnull          800
_L10:
		((BufferedOutputStream) (obj1)).close();
	//  423  783:aload           7
	//  424  785:invokevirtual   #191 <Method void BufferedOutputStream.close()>
		return null;
	//  425  788:aconst_null     
	//  426  789:areturn         
_L13:
		AppboyLogger.e(a, "Exception during closing of file download streams.", ((Throwable) (s)));
	//  427  790:getstatic       #19  <Field String a>
	//  428  793:ldc1            #193 <String "Exception during closing of file download streams.">
	//  429  795:aload_0         
	//  430  796:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//  431  799:pop             
_L11:
		return null;
	//  432  800:aconst_null     
	//  433  801:areturn         
		s1;
	//  434  802:astore_1        
		s = ((String) (obj));
	//  435  803:aload           6
	//  436  805:astore_0        
_L5:
		if(s != null)
	//* 437  806:aload_0         
	//* 438  807:ifnull          814
			((HttpURLConnection) (s)).disconnect();
	//  439  810:aload_0         
	//  440  811:invokevirtual   #161 <Method void HttpURLConnection.disconnect()>
		if(s2 == null)
			break MISSING_BLOCK_LABEL_825;
	//  441  814:aload_2         
	//  442  815:ifnull          825
		((DataInputStream) (s2)).close();
	//  443  818:aload_2         
	//  444  819:invokevirtual   #190 <Method void DataInputStream.close()>
	//* 445  822:goto            825
		if(s3 != null)
	//* 446  825:aload_3         
	//* 447  826:ifnull          846
			try
			{
				((BufferedOutputStream) (s3)).close();
	//  448  829:aload_3         
	//  449  830:invokevirtual   #191 <Method void BufferedOutputStream.close()>
			}
	//* 450  833:goto            846
	//* 451  836:getstatic       #19  <Field String a>
	//* 452  839:ldc1            #193 <String "Exception during closing of file download streams.">
	//* 453  841:aload_0         
	//* 454  842:invokestatic    #96  <Method int AppboyLogger.e(String, String, Throwable)>
	//* 455  845:pop             
	//* 456  846:aload_1         
	//* 457  847:athrow          
	//* 458  848:astore_0        
	//* 459  849:goto            648
	//* 460  852:astore_0        
	//* 461  853:goto            790
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				AppboyLogger.e(a, "Exception during closing of file download streams.", ((Throwable) (s)));
			}
		throw s1;
		s;
		  goto _L12
		s;
		  goto _L13
	//* 462  856:astore_0        
	//* 463  857:goto            836
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
