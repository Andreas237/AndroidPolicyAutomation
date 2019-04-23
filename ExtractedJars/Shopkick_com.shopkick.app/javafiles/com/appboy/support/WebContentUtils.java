// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import android.content.Context;
import java.io.*;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

// Referenced classes of package com.appboy.support:
//			AppboyLogger, StringUtils, IntentUtils, AppboyFileUtils

public class WebContentUtils
{

	public WebContentUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	static boolean a(String s, File file)
	{
		Object obj1;
		File file1;
		File file2;
		File file3;
		ZipEntry zipentry;
		byte abyte0[];
		String s1;
		StringBuilder stringbuilder;
		Object obj3;
		if(StringUtils.isNullOrBlank(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #34  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifeq            18
		{
			AppboyLogger.i(a, "Unpack directory null or blank. Zip file not unpacked.");
	//    3    7:getstatic       #16  <Field String a>
	//    4   10:ldc1            #36  <String "Unpack directory null or blank. Zip file not unpacked.">
	//    5   12:invokestatic    #40  <Method int AppboyLogger.i(String, String)>
	//    6   15:pop             
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		}
		if(file == null)
	//*   9   18:aload_1         
	//*  10   19:ifnonnull       33
		{
			AppboyLogger.i(a, "Zip file is null. Zip file not unpacked.");
	//   11   22:getstatic       #16  <Field String a>
	//   12   25:ldc1            #42  <String "Zip file is null. Zip file not unpacked.">
	//   13   27:invokestatic    #40  <Method int AppboyLogger.i(String, String)>
	//   14   30:pop             
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		}
		(new File(s)).mkdirs();
	//   17   33:new             #44  <Class File>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:invokespecial   #47  <Method void File(String)>
	//   21   41:invokevirtual   #51  <Method boolean File.mkdirs()>
	//   22   44:pop             
		obj3 = null;
	//   23   45:aconst_null     
	//   24   46:astore          12
		file1 = null;
	//   25   48:aconst_null     
	//   26   49:astore          5
		stringbuilder = null;
	//   27   51:aconst_null     
	//   28   52:astore          11
		s1 = null;
	//   29   54:aconst_null     
	//   30   55:astore          10
		file2 = null;
	//   31   57:aconst_null     
	//   32   58:astore          6
		file3 = null;
	//   33   60:aconst_null     
	//   34   61:astore          7
		abyte0 = null;
	//   35   63:aconst_null     
	//   36   64:astore          9
		obj1 = null;
	//   37   66:aconst_null     
	//   38   67:astore          4
		zipentry = null;
	//   39   69:aconst_null     
	//   40   70:astore          8
		Object obj = ((Object) (new ZipInputStream(((java.io.InputStream) (new BufferedInputStream(((java.io.InputStream) (new FileInputStream(file)))))))));
	//   41   72:new             #53  <Class ZipInputStream>
	//   42   75:dup             
	//   43   76:new             #55  <Class BufferedInputStream>
	//   44   79:dup             
	//   45   80:new             #57  <Class FileInputStream>
	//   46   83:dup             
	//   47   84:aload_1         
	//   48   85:invokespecial   #60  <Method void FileInputStream(File)>
	//   49   88:invokespecial   #63  <Method void BufferedInputStream(java.io.InputStream)>
	//   50   91:invokespecial   #64  <Method void ZipInputStream(java.io.InputStream)>
	//   51   94:astore_3        
		obj1 = ((Object) (obj3));
	//   52   95:aload           12
	//   53   97:astore          4
		file2 = ((File) (stringbuilder));
	//   54   99:aload           11
	//   55  101:astore          6
		file3 = ((File) (s1));
	//   56  103:aload           10
	//   57  105:astore          7
		abyte0 = new byte[8192];
	//   58  107:sipush          8192
	//   59  110:newarray        byte[]
	//   60  112:astore          9
		file = ((File) (zipentry));
	//   61  114:aload           8
	//   62  116:astore_1        
_L3:
		obj1 = ((Object) (file));
	//   63  117:aload_1         
	//   64  118:astore          4
		file1 = file;
	//   65  120:aload_1         
	//   66  121:astore          5
		file2 = file;
	//   67  123:aload_1         
	//   68  124:astore          6
		file3 = file;
	//   69  126:aload_1         
	//   70  127:astore          7
		zipentry = ((ZipInputStream) (obj)).getNextEntry();
	//   71  129:aload_3         
	//   72  130:invokevirtual   #68  <Method ZipEntry ZipInputStream.getNextEntry()>
	//   73  133:astore          8
		if(zipentry == null) goto _L2; else goto _L1
	//   74  135:aload           8
	//   75  137:ifnull          422
_L1:
		obj1 = ((Object) (file));
	//   76  140:aload_1         
	//   77  141:astore          4
		file1 = file;
	//   78  143:aload_1         
	//   79  144:astore          5
		file2 = file;
	//   80  146:aload_1         
	//   81  147:astore          6
		file3 = file;
	//   82  149:aload_1         
	//   83  150:astore          7
		s1 = zipentry.getName();
	//   84  152:aload           8
	//   85  154:invokevirtual   #74  <Method String ZipEntry.getName()>
	//   86  157:astore          10
		obj1 = ((Object) (file));
	//   87  159:aload_1         
	//   88  160:astore          4
		file1 = file;
	//   89  162:aload_1         
	//   90  163:astore          5
		file2 = file;
	//   91  165:aload_1         
	//   92  166:astore          6
		file3 = file;
	//   93  168:aload_1         
	//   94  169:astore          7
		if(!s1.toLowerCase(Locale.US).startsWith("__macosx")) goto _L4; else goto _L3
	//   95  171:aload           10
	//   96  173:getstatic       #80  <Field Locale Locale.US>
	//   97  176:invokevirtual   #86  <Method String String.toLowerCase(Locale)>
	//   98  179:ldc1            #88  <String "__macosx">
	//   99  181:invokevirtual   #91  <Method boolean String.startsWith(String)>
	//  100  184:ifeq            190
	//* 101  187:goto            117
_L4:
		obj1 = ((Object) (file));
	//  102  190:aload_1         
	//  103  191:astore          4
		file1 = file;
	//  104  193:aload_1         
	//  105  194:astore          5
		file2 = file;
	//  106  196:aload_1         
	//  107  197:astore          6
		file3 = file;
	//  108  199:aload_1         
	//  109  200:astore          7
		stringbuilder = new StringBuilder();
	//  110  202:new             #93  <Class StringBuilder>
	//  111  205:dup             
	//  112  206:invokespecial   #94  <Method void StringBuilder()>
	//  113  209:astore          11
		obj1 = ((Object) (file));
	//  114  211:aload_1         
	//  115  212:astore          4
		file1 = file;
	//  116  214:aload_1         
	//  117  215:astore          5
		file2 = file;
	//  118  217:aload_1         
	//  119  218:astore          6
		file3 = file;
	//  120  220:aload_1         
	//  121  221:astore          7
		stringbuilder.append(s);
	//  122  223:aload           11
	//  123  225:aload_0         
	//  124  226:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  125  229:pop             
		obj1 = ((Object) (file));
	//  126  230:aload_1         
	//  127  231:astore          4
		file1 = file;
	//  128  233:aload_1         
	//  129  234:astore          5
		file2 = file;
	//  130  236:aload_1         
	//  131  237:astore          6
		file3 = file;
	//  132  239:aload_1         
	//  133  240:astore          7
		stringbuilder.append("/");
	//  134  242:aload           11
	//  135  244:ldc1            #100 <String "/">
	//  136  246:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  137  249:pop             
		obj1 = ((Object) (file));
	//  138  250:aload_1         
	//  139  251:astore          4
		file1 = file;
	//  140  253:aload_1         
	//  141  254:astore          5
		file2 = file;
	//  142  256:aload_1         
	//  143  257:astore          6
		file3 = file;
	//  144  259:aload_1         
	//  145  260:astore          7
		stringbuilder.append(s1);
	//  146  262:aload           11
	//  147  264:aload           10
	//  148  266:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//  149  269:pop             
		obj1 = ((Object) (file));
	//  150  270:aload_1         
	//  151  271:astore          4
		file1 = file;
	//  152  273:aload_1         
	//  153  274:astore          5
		file2 = file;
	//  154  276:aload_1         
	//  155  277:astore          6
		file3 = file;
	//  156  279:aload_1         
	//  157  280:astore          7
		s1 = stringbuilder.toString();
	//  158  282:aload           11
	//  159  284:invokevirtual   #103 <Method String StringBuilder.toString()>
	//  160  287:astore          10
		obj1 = ((Object) (file));
	//  161  289:aload_1         
	//  162  290:astore          4
		file1 = file;
	//  163  292:aload_1         
	//  164  293:astore          5
		file2 = file;
	//  165  295:aload_1         
	//  166  296:astore          6
		file3 = file;
	//  167  298:aload_1         
	//  168  299:astore          7
		if(!zipentry.isDirectory())
			break MISSING_BLOCK_LABEL_337;
	//  169  301:aload           8
	//  170  303:invokevirtual   #106 <Method boolean ZipEntry.isDirectory()>
	//  171  306:ifeq            337
		obj1 = ((Object) (file));
	//  172  309:aload_1         
	//  173  310:astore          4
		file1 = file;
	//  174  312:aload_1         
	//  175  313:astore          5
		file2 = file;
	//  176  315:aload_1         
	//  177  316:astore          6
		file3 = file;
	//  178  318:aload_1         
	//  179  319:astore          7
		(new File(s1)).mkdirs();
	//  180  321:new             #44  <Class File>
	//  181  324:dup             
	//  182  325:aload           10
	//  183  327:invokespecial   #47  <Method void File(String)>
	//  184  330:invokevirtual   #51  <Method boolean File.mkdirs()>
	//  185  333:pop             
		  goto _L3
	//* 186  334:goto            117
		obj1 = ((Object) (file));
	//  187  337:aload_1         
	//  188  338:astore          4
		file1 = file;
	//  189  340:aload_1         
	//  190  341:astore          5
		file2 = file;
	//  191  343:aload_1         
	//  192  344:astore          6
		file3 = file;
	//  193  346:aload_1         
	//  194  347:astore          7
		file = ((File) (new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(s1))))));
	//  195  349:new             #108 <Class BufferedOutputStream>
	//  196  352:dup             
	//  197  353:new             #110 <Class FileOutputStream>
	//  198  356:dup             
	//  199  357:aload           10
	//  200  359:invokespecial   #111 <Method void FileOutputStream(String)>
	//  201  362:invokespecial   #114 <Method void BufferedOutputStream(java.io.OutputStream)>
	//  202  365:astore_1        
_L5:
		int i = ((ZipInputStream) (obj)).read(abyte0);
	//  203  366:aload_3         
	//  204  367:aload           9
	//  205  369:invokevirtual   #118 <Method int ZipInputStream.read(byte[])>
	//  206  372:istore_2        
		if(i == -1)
			break MISSING_BLOCK_LABEL_389;
	//  207  373:iload_2         
	//  208  374:iconst_m1       
	//  209  375:icmpeq          389
		((BufferedOutputStream) (file)).write(abyte0, 0, i);
	//  210  378:aload_1         
	//  211  379:aload           9
	//  212  381:iconst_0        
	//  213  382:iload_2         
	//  214  383:invokevirtual   #122 <Method void BufferedOutputStream.write(byte[], int, int)>
		  goto _L5
	//* 215  386:goto            366
		((BufferedOutputStream) (file)).close();
	//  216  389:aload_1         
	//  217  390:invokevirtual   #125 <Method void BufferedOutputStream.close()>
		((ZipInputStream) (obj)).closeEntry();
	//  218  393:aload_3         
	//  219  394:invokevirtual   #128 <Method void ZipInputStream.closeEntry()>
		  goto _L3
	//* 220  397:goto            117
		obj1;
	//  221  400:astore          4
		s = ((String) (file));
	//  222  402:aload_1         
	//  223  403:astore_0        
		file = ((File) (obj1));
	//  224  404:aload           4
	//  225  406:astore_1        
		  goto _L6
	//* 226  407:goto            698
		s;
	//  227  410:astore_0        
		  goto _L7
	//* 228  411:goto            473
		s;
	//  229  414:astore_0        
		  goto _L8
	//* 230  415:goto            486
		s;
	//  231  418:astore_0        
		  goto _L9
	//* 232  419:goto            499
_L2:
		obj1 = ((Object) (file));
	//  233  422:aload_1         
	//  234  423:astore          4
		file1 = file;
	//  235  425:aload_1         
	//  236  426:astore          5
		file2 = file;
	//  237  428:aload_1         
	//  238  429:astore          6
		file3 = file;
	//  239  431:aload_1         
	//  240  432:astore          7
		((ZipInputStream) (obj)).close();
	//  241  434:aload_3         
	//  242  435:invokevirtual   #129 <Method void ZipInputStream.close()>
		((ZipInputStream) (obj)).close();
	//  243  438:aload_3         
	//  244  439:invokevirtual   #129 <Method void ZipInputStream.close()>
		if(file == null)
			break MISSING_BLOCK_LABEL_463;
	//  245  442:aload_1         
	//  246  443:ifnull          463
		((BufferedOutputStream) (file)).close();
	//  247  446:aload_1         
	//  248  447:invokevirtual   #125 <Method void BufferedOutputStream.close()>
		return true;
	//  249  450:iconst_1        
	//  250  451:ireturn         
		s;
	//  251  452:astore_0        
		AppboyLogger.e(a, "IOException during closing of zip file unpacking streams.", ((Throwable) (s)));
	//  252  453:getstatic       #16  <Field String a>
	//  253  456:ldc1            #131 <String "IOException during closing of zip file unpacking streams.">
	//  254  458:aload_0         
	//  255  459:invokestatic    #135 <Method int AppboyLogger.e(String, String, Throwable)>
	//  256  462:pop             
		return true;
	//  257  463:iconst_1        
	//  258  464:ireturn         
		file;
	//  259  465:astore_1        
		  goto _L10
	//* 260  466:goto            701
		s;
	//  261  469:astore_0        
		file = file1;
	//  262  470:aload           5
	//  263  472:astore_1        
_L7:
		Object obj2;
		obj1 = ((Object) (file));
	//  264  473:aload_1         
	//  265  474:astore          4
		obj2 = ((Object) (s));
	//  266  476:aload_0         
	//  267  477:astore          5
		  goto _L11
	//* 268  479:goto            522
		s;
	//  269  482:astore_0        
		file = file2;
	//  270  483:aload           6
	//  271  485:astore_1        
_L8:
		obj1 = ((Object) (file));
	//  272  486:aload_1         
	//  273  487:astore          4
		obj2 = ((Object) (s));
	//  274  489:aload_0         
	//  275  490:astore          5
		  goto _L12
	//* 276  492:goto            581
		s;
	//  277  495:astore_0        
		file = file3;
	//  278  496:aload           7
	//  279  498:astore_1        
_L9:
		obj1 = ((Object) (file));
	//  280  499:aload_1         
	//  281  500:astore          4
		obj2 = ((Object) (s));
	//  282  502:aload_0         
	//  283  503:astore          5
		  goto _L13
	//* 284  505:goto            640
		file;
	//  285  508:astore_1        
		obj = null;
	//  286  509:aconst_null     
	//  287  510:astore_3        
		  goto _L10
	//* 288  511:goto            701
		obj2;
	//  289  514:astore          5
		obj1 = null;
	//  290  516:aconst_null     
	//  291  517:astore          4
		obj = ((Object) (file2));
	//  292  519:aload           6
	//  293  521:astore_3        
_L11:
		file = ((File) (obj));
	//  294  522:aload_3         
	//  295  523:astore_1        
		s = ((String) (obj1));
	//  296  524:aload           4
	//  297  526:astore_0        
		AppboyLogger.e(a, "Exception during unpack of zip file.", ((Throwable) (obj2)));
	//  298  527:getstatic       #16  <Field String a>
	//  299  530:ldc1            #137 <String "Exception during unpack of zip file.">
	//  300  532:aload           5
	//  301  534:invokestatic    #135 <Method int AppboyLogger.e(String, String, Throwable)>
	//  302  537:pop             
		if(obj == null)
			break MISSING_BLOCK_LABEL_549;
	//  303  538:aload_3         
	//  304  539:ifnull          549
		((ZipInputStream) (obj)).close();
	//  305  542:aload_3         
	//  306  543:invokevirtual   #129 <Method void ZipInputStream.close()>
	//* 307  546:goto            549
		if(obj1 == null) goto _L15; else goto _L14
	//  308  549:aload           4
	//  309  551:ifnull          571
_L14:
		((BufferedOutputStream) (obj1)).close();
	//  310  554:aload           4
	//  311  556:invokevirtual   #125 <Method void BufferedOutputStream.close()>
		return false;
	//  312  559:iconst_0        
	//  313  560:ireturn         
_L20:
		AppboyLogger.e(a, "IOException during closing of zip file unpacking streams.", ((Throwable) (s)));
	//  314  561:getstatic       #16  <Field String a>
	//  315  564:ldc1            #131 <String "IOException during closing of zip file unpacking streams.">
	//  316  566:aload_0         
	//  317  567:invokestatic    #135 <Method int AppboyLogger.e(String, String, Throwable)>
	//  318  570:pop             
_L15:
		return false;
	//  319  571:iconst_0        
	//  320  572:ireturn         
		obj2;
	//  321  573:astore          5
		obj1 = null;
	//  322  575:aconst_null     
	//  323  576:astore          4
		obj = ((Object) (file3));
	//  324  578:aload           7
	//  325  580:astore_3        
_L12:
		file = ((File) (obj));
	//  326  581:aload_3         
	//  327  582:astore_1        
		s = ((String) (obj1));
	//  328  583:aload           4
	//  329  585:astore_0        
		AppboyLogger.e(a, "IOException during unpack of zip file.", ((Throwable) (obj2)));
	//  330  586:getstatic       #16  <Field String a>
	//  331  589:ldc1            #139 <String "IOException during unpack of zip file.">
	//  332  591:aload           5
	//  333  593:invokestatic    #135 <Method int AppboyLogger.e(String, String, Throwable)>
	//  334  596:pop             
		if(obj == null)
			break MISSING_BLOCK_LABEL_608;
	//  335  597:aload_3         
	//  336  598:ifnull          608
		((ZipInputStream) (obj)).close();
	//  337  601:aload_3         
	//  338  602:invokevirtual   #129 <Method void ZipInputStream.close()>
	//* 339  605:goto            608
		if(obj1 == null) goto _L17; else goto _L16
	//  340  608:aload           4
	//  341  610:ifnull          630
_L16:
		((BufferedOutputStream) (obj1)).close();
	//  342  613:aload           4
	//  343  615:invokevirtual   #125 <Method void BufferedOutputStream.close()>
		return false;
	//  344  618:iconst_0        
	//  345  619:ireturn         
_L21:
		AppboyLogger.e(a, "IOException during closing of zip file unpacking streams.", ((Throwable) (s)));
	//  346  620:getstatic       #16  <Field String a>
	//  347  623:ldc1            #131 <String "IOException during closing of zip file unpacking streams.">
	//  348  625:aload_0         
	//  349  626:invokestatic    #135 <Method int AppboyLogger.e(String, String, Throwable)>
	//  350  629:pop             
_L17:
		return false;
	//  351  630:iconst_0        
	//  352  631:ireturn         
		obj2;
	//  353  632:astore          5
		obj1 = null;
	//  354  634:aconst_null     
	//  355  635:astore          4
		obj = ((Object) (abyte0));
	//  356  637:aload           9
	//  357  639:astore_3        
_L13:
		file = ((File) (obj));
	//  358  640:aload_3         
	//  359  641:astore_1        
		s = ((String) (obj1));
	//  360  642:aload           4
	//  361  644:astore_0        
		AppboyLogger.e(a, "FileNotFoundException during unpack of zip file.", ((Throwable) (obj2)));
	//  362  645:getstatic       #16  <Field String a>
	//  363  648:ldc1            #141 <String "FileNotFoundException during unpack of zip file.">
	//  364  650:aload           5
	//  365  652:invokestatic    #135 <Method int AppboyLogger.e(String, String, Throwable)>
	//  366  655:pop             
		if(obj == null)
			break MISSING_BLOCK_LABEL_667;
	//  367  656:aload_3         
	//  368  657:ifnull          667
		((ZipInputStream) (obj)).close();
	//  369  660:aload_3         
	//  370  661:invokevirtual   #129 <Method void ZipInputStream.close()>
	//* 371  664:goto            667
		if(obj1 == null) goto _L19; else goto _L18
	//  372  667:aload           4
	//  373  669:ifnull          689
_L18:
		((BufferedOutputStream) (obj1)).close();
	//  374  672:aload           4
	//  375  674:invokevirtual   #125 <Method void BufferedOutputStream.close()>
		return false;
	//  376  677:iconst_0        
	//  377  678:ireturn         
_L22:
		AppboyLogger.e(a, "IOException during closing of zip file unpacking streams.", ((Throwable) (s)));
	//  378  679:getstatic       #16  <Field String a>
	//  379  682:ldc1            #131 <String "IOException during closing of zip file unpacking streams.">
	//  380  684:aload_0         
	//  381  685:invokestatic    #135 <Method int AppboyLogger.e(String, String, Throwable)>
	//  382  688:pop             
_L19:
		return false;
	//  383  689:iconst_0        
	//  384  690:ireturn         
		obj1;
	//  385  691:astore          4
		obj = ((Object) (file));
	//  386  693:aload_1         
	//  387  694:astore_3        
		file = ((File) (obj1));
	//  388  695:aload           4
	//  389  697:astore_1        
_L6:
		obj1 = ((Object) (s));
	//  390  698:aload_0         
	//  391  699:astore          4
_L10:
		if(obj == null)
			break MISSING_BLOCK_LABEL_712;
	//  392  701:aload_3         
	//  393  702:ifnull          712
		((ZipInputStream) (obj)).close();
	//  394  705:aload_3         
	//  395  706:invokevirtual   #129 <Method void ZipInputStream.close()>
	//* 396  709:goto            712
		if(obj1 != null)
	//* 397  712:aload           4
	//* 398  714:ifnull          735
			try
			{
				((BufferedOutputStream) (obj1)).close();
	//  399  717:aload           4
	//  400  719:invokevirtual   #125 <Method void BufferedOutputStream.close()>
			}
	//* 401  722:goto            735
	//* 402  725:getstatic       #16  <Field String a>
	//* 403  728:ldc1            #131 <String "IOException during closing of zip file unpacking streams.">
	//* 404  730:aload_0         
	//* 405  731:invokestatic    #135 <Method int AppboyLogger.e(String, String, Throwable)>
	//* 406  734:pop             
	//* 407  735:aload_1         
	//* 408  736:athrow          
	//* 409  737:astore_0        
	//* 410  738:goto            561
	//* 411  741:astore_0        
	//* 412  742:goto            620
	//* 413  745:astore_0        
	//* 414  746:goto            679
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				AppboyLogger.e(a, "IOException during closing of zip file unpacking streams.", ((Throwable) (s)));
			}
		throw file;
		s;
		  goto _L20
		s;
		  goto _L21
		s;
		  goto _L22
	//* 415  749:astore_0        
	//* 416  750:goto            725
	}

	public static File getHtmlInAppMessageAssetCacheDirectory(Context context)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #93  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #94  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(context.getCacheDir().getPath());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #150 <Method File Context.getCacheDir()>
	//    7   13:invokevirtual   #153 <Method String File.getPath()>
	//    8   16:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("/");
	//   10   20:aload_1         
	//   11   21:ldc1            #100 <String "/">
	//   12   23:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("appboy-html-inapp-messages");
	//   14   27:aload_1         
	//   15   28:ldc1            #155 <String "appboy-html-inapp-messages">
	//   16   30:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return new File(stringbuilder.toString());
	//   18   34:new             #44  <Class File>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   22   42:invokespecial   #47  <Method void File(String)>
	//   23   45:areturn         
	}

	public static String getLocalHtmlUrlFromRemoteUrl(File file, String s)
	{
		if(file == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(a, "Internal cache directory is null. No local URL will be created.");
	//    2    4:getstatic       #16  <Field String a>
	//    3    7:ldc1            #159 <String "Internal cache directory is null. No local URL will be created.">
	//    4    9:invokestatic    #162 <Method int AppboyLogger.w(String, String)>
	//    5   12:pop             
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
		}
		if(StringUtils.isNullOrBlank(s))
	//*   8   15:aload_1         
	//*   9   16:invokestatic    #34  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  10   19:ifeq            33
		{
			AppboyLogger.w(a, "Remote zip url is null or empty. No local URL will be created.");
	//   11   22:getstatic       #16  <Field String a>
	//   12   25:ldc1            #164 <String "Remote zip url is null or empty. No local URL will be created.">
	//   13   27:invokestatic    #162 <Method int AppboyLogger.w(String, String)>
	//   14   30:pop             
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
		}
		String s1 = file.getAbsolutePath();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #167 <Method String File.getAbsolutePath()>
	//   19   37:astore_2        
		file = ((File) (String.valueOf(IntentUtils.getRequestCode())));
	//   20   38:invokestatic    #173 <Method int IntentUtils.getRequestCode()>
	//   21   41:invokestatic    #177 <Method String String.valueOf(int)>
	//   22   44:astore_0        
		Object obj = ((Object) (new StringBuilder()));
	//   23   45:new             #93  <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #94  <Method void StringBuilder()>
	//   26   52:astore_3        
		((StringBuilder) (obj)).append(s1);
	//   27   53:aload_3         
	//   28   54:aload_2         
	//   29   55:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
		((StringBuilder) (obj)).append("/");
	//   31   59:aload_3         
	//   32   60:ldc1            #100 <String "/">
	//   33   62:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
		((StringBuilder) (obj)).append(((String) (file)));
	//   35   66:aload_3         
	//   36   67:aload_0         
	//   37   68:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   38   71:pop             
		s1 = ((StringBuilder) (obj)).toString();
	//   39   72:aload_3         
	//   40   73:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   41   76:astore_2        
		obj = ((Object) (a));
	//   42   77:getstatic       #16  <Field String a>
	//   43   80:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   44   81:new             #93  <Class StringBuilder>
	//   45   84:dup             
	//   46   85:invokespecial   #94  <Method void StringBuilder()>
	//   47   88:astore          4
		stringbuilder.append("Starting download of url: ");
	//   48   90:aload           4
	//   49   92:ldc1            #179 <String "Starting download of url: ">
	//   50   94:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   51   97:pop             
		stringbuilder.append(s);
	//   52   98:aload           4
	//   53  100:aload_1         
	//   54  101:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   55  104:pop             
		AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   56  105:aload_3         
	//   57  106:aload           4
	//   58  108:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   59  111:invokestatic    #182 <Method int AppboyLogger.d(String, String)>
	//   60  114:pop             
		file = AppboyFileUtils.downloadFileToPath(s1, s, ((String) (file)), ".zip");
	//   61  115:aload_2         
	//   62  116:aload_1         
	//   63  117:aload_0         
	//   64  118:ldc1            #184 <String ".zip">
	//   65  120:invokestatic    #190 <Method File AppboyFileUtils.downloadFileToPath(String, String, String, String)>
	//   66  123:astore_0        
		if(file == null)
	//*  67  124:aload_0         
	//*  68  125:ifnonnull       150
		{
			AppboyLogger.d(a, "Could not download zip file to local storage.");
	//   69  128:getstatic       #16  <Field String a>
	//   70  131:ldc1            #192 <String "Could not download zip file to local storage.">
	//   71  133:invokestatic    #182 <Method int AppboyLogger.d(String, String)>
	//   72  136:pop             
			AppboyFileUtils.deleteFileOrDirectory(new File(s1));
	//   73  137:new             #44  <Class File>
	//   74  140:dup             
	//   75  141:aload_2         
	//   76  142:invokespecial   #47  <Method void File(String)>
	//   77  145:invokestatic    #195 <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
			return null;
	//   78  148:aconst_null     
	//   79  149:areturn         
		}
		AppboyLogger.d(a, "Html content zip downloaded.");
	//   80  150:getstatic       #16  <Field String a>
	//   81  153:ldc1            #197 <String "Html content zip downloaded.">
	//   82  155:invokestatic    #182 <Method int AppboyLogger.d(String, String)>
	//   83  158:pop             
		if(!a(s1, file))
	//*  84  159:aload_2         
	//*  85  160:aload_0         
	//*  86  161:invokestatic    #199 <Method boolean a(String, File)>
	//*  87  164:ifne            189
		{
			AppboyLogger.w(a, "Error during the zip unpack.");
	//   88  167:getstatic       #16  <Field String a>
	//   89  170:ldc1            #201 <String "Error during the zip unpack.">
	//   90  172:invokestatic    #162 <Method int AppboyLogger.w(String, String)>
	//   91  175:pop             
			AppboyFileUtils.deleteFileOrDirectory(new File(s1));
	//   92  176:new             #44  <Class File>
	//   93  179:dup             
	//   94  180:aload_2         
	//   95  181:invokespecial   #47  <Method void File(String)>
	//   96  184:invokestatic    #195 <Method void AppboyFileUtils.deleteFileOrDirectory(File)>
			return null;
	//   97  187:aconst_null     
	//   98  188:areturn         
		} else
		{
			AppboyLogger.d(a, "Html content zip unpacked.");
	//   99  189:getstatic       #16  <Field String a>
	//  100  192:ldc1            #203 <String "Html content zip unpacked.">
	//  101  194:invokestatic    #182 <Method int AppboyLogger.d(String, String)>
	//  102  197:pop             
			return s1;
	//  103  198:aload_2         
	//  104  199:areturn         
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/support/WebContentUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class WebContentUtils>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
