// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.WarnStatus;
import ch.qos.logback.core.util.FileUtil;
import java.io.*;
import java.util.zip.*;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			CompressionMode

public class Compressor extends ContextAwareBase
{

	public Compressor(CompressionMode compressionmode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ContextAwareBase()>
		compressionMode = compressionmode;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field CompressionMode compressionMode>
	//    5    9:return          
	}

	public static String computeFileNameStr_WCS(String s, CompressionMode compressionmode)
	{
		int i = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method int String.length()>
	//    2    4:istore_2        
		static class _cls1
		{

			static final int $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[];

			static 
			{
				$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode = new int[CompressionMode.values().length];
			//    0    0:invokestatic    #18  <Method CompressionMode[] CompressionMode.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
				try
				{
					$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.GZ.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
			//    5   12:getstatic       #24  <Field CompressionMode CompressionMode.GZ>
			//    6   15:invokevirtual   #28  <Method int CompressionMode.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
			//*  10   23:getstatic       #31  <Field CompressionMode CompressionMode.ZIP>
			//*  11   26:invokevirtual   #28  <Method int CompressionMode.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
			//*  15   34:getstatic       #34  <Field CompressionMode CompressionMode.NONE>
			//*  16   37:invokevirtual   #28  <Method int CompressionMode.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.ZIP.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.NONE.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		_cls1..SwitchMap.ch.qos.logback.core.rolling.helper.CompressionMode[compressionmode.ordinal()];
	//    3    5:getstatic       #31  <Field int[] Compressor$1.$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #36  <Method int CompressionMode.ordinal()>
	//    6   12:iaload          
		JVM INSTR tableswitch 1 3: default 40
	//	               1 76
	//	               2 52
	//	               3 50;
	//    7   13:tableswitch     1 3: default 40
	//	               1 76
	//	               2 52
	//	               3 50
		   goto _L1 _L2 _L3 _L4
_L1:
		throw new IllegalStateException("Execution should not reach this point");
	//    8   40:new             #38  <Class IllegalStateException>
	//    9   43:dup             
	//   10   44:ldc1            #40  <String "Execution should not reach this point">
	//   11   46:invokespecial   #43  <Method void IllegalStateException(String)>
	//   12   49:athrow          
_L4:
		return s;
	//   13   50:aload_0         
	//   14   51:areturn         
_L3:
		compressionmode = ((CompressionMode) (s));
	//   15   52:aload_0         
	//   16   53:astore_1        
		if(!s.endsWith(".zip")) goto _L6; else goto _L5
	//   17   54:aload_0         
	//   18   55:ldc1            #45  <String ".zip">
	//   19   57:invokevirtual   #49  <Method boolean String.endsWith(String)>
	//   20   60:ifeq            74
_L5:
		i -= 4;
	//   21   63:iload_2         
	//   22   64:iconst_4        
	//   23   65:isub            
	//   24   66:istore_2        
_L8:
		compressionmode = ((CompressionMode) (s.substring(0, i)));
	//   25   67:aload_0         
	//   26   68:iconst_0        
	//   27   69:iload_2         
	//   28   70:invokevirtual   #53  <Method String String.substring(int, int)>
	//   29   73:astore_1        
_L6:
		return ((String) (compressionmode));
	//   30   74:aload_1         
	//   31   75:areturn         
_L2:
		if(s.endsWith(".gz"))
	//*  32   76:aload_0         
	//*  33   77:ldc1            #55  <String ".gz">
	//*  34   79:invokevirtual   #49  <Method boolean String.endsWith(String)>
	//*  35   82:ifeq            92
			i -= 3;
	//   36   85:iload_2         
	//   37   86:iconst_3        
	//   38   87:isub            
	//   39   88:istore_2        
		else
	//*  40   89:goto            67
			return s;
	//   41   92:aload_0         
	//   42   93:areturn         
		if(true) goto _L8; else goto _L7
_L7:
	}

	private void gzCompress(String s, String s1)
	{
		String s2;
		Exception exception;
		Object obj1;
		String s3;
		Object obj2;
		obj2 = ((Object) (new File(s)));
	//    0    0:new             #63  <Class File>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #64  <Method void File(String)>
	//    4    8:astore          9
		if(!((File) (obj2)).exists())
	//*   5   10:aload           9
	//*   6   12:invokevirtual   #68  <Method boolean File.exists()>
	//*   7   15:ifne            63
		{
			s1 = ((String) (new StringBuilder()));
	//    8   18:new             #70  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #71  <Method void StringBuilder()>
	//   11   25:astore_2        
			((StringBuilder) (s1)).append("The file to compress named [");
	//   12   26:aload_2         
	//   13   27:ldc1            #73  <String "The file to compress named [">
	//   14   29:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
			((StringBuilder) (s1)).append(s);
	//   16   33:aload_2         
	//   17   34:aload_1         
	//   18   35:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			((StringBuilder) (s1)).append("] does not exist.");
	//   20   39:aload_2         
	//   21   40:ldc1            #79  <String "] does not exist.">
	//   22   42:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			addStatus(((ch.qos.logback.core.status.Status) (new WarnStatus(((StringBuilder) (s1)).toString(), ((Object) (this))))));
	//   24   46:aload_0         
	//   25   47:new             #81  <Class WarnStatus>
	//   26   50:dup             
	//   27   51:aload_2         
	//   28   52:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   29   55:aload_0         
	//   30   56:invokespecial   #88  <Method void WarnStatus(String, Object)>
	//   31   59:invokevirtual   #92  <Method void addStatus(ch.qos.logback.core.status.Status)>
			return;
	//   32   62:return          
		}
		s3 = s1;
	//   33   63:aload_2         
	//   34   64:astore          8
		if(!s1.endsWith(".gz"))
	//*  35   66:aload_2         
	//*  36   67:ldc1            #55  <String ".gz">
	//*  37   69:invokevirtual   #49  <Method boolean String.endsWith(String)>
	//*  38   72:ifne            106
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   39   75:new             #70  <Class StringBuilder>
	//   40   78:dup             
	//   41   79:invokespecial   #71  <Method void StringBuilder()>
	//   42   82:astore          4
			stringbuilder.append(s1);
	//   43   84:aload           4
	//   44   86:aload_2         
	//   45   87:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   46   90:pop             
			stringbuilder.append(".gz");
	//   47   91:aload           4
	//   48   93:ldc1            #55  <String ".gz">
	//   49   95:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   50   98:pop             
			s3 = stringbuilder.toString();
	//   51   99:aload           4
	//   52  101:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   53  104:astore          8
		}
		s1 = ((String) (new File(s3)));
	//   54  106:new             #63  <Class File>
	//   55  109:dup             
	//   56  110:aload           8
	//   57  112:invokespecial   #64  <Method void File(String)>
	//   58  115:astore_2        
		if(((File) (s1)).exists())
	//*  59  116:aload_2         
	//*  60  117:invokevirtual   #68  <Method boolean File.exists()>
	//*  61  120:ifeq            161
		{
			s = ((String) (new StringBuilder()));
	//   62  123:new             #70  <Class StringBuilder>
	//   63  126:dup             
	//   64  127:invokespecial   #71  <Method void StringBuilder()>
	//   65  130:astore_1        
			((StringBuilder) (s)).append("The target compressed file named [");
	//   66  131:aload_1         
	//   67  132:ldc1            #94  <String "The target compressed file named [">
	//   68  134:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   69  137:pop             
			((StringBuilder) (s)).append(s3);
	//   70  138:aload_1         
	//   71  139:aload           8
	//   72  141:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   73  144:pop             
			((StringBuilder) (s)).append("] exist already. Aborting file compression.");
	//   74  145:aload_1         
	//   75  146:ldc1            #96  <String "] exist already. Aborting file compression.">
	//   76  148:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   77  151:pop             
			addWarn(((StringBuilder) (s)).toString());
	//   78  152:aload_0         
	//   79  153:aload_1         
	//   80  154:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   81  157:invokevirtual   #99  <Method void addWarn(String)>
			return;
	//   82  160:return          
		}
		StringBuilder stringbuilder1 = new StringBuilder();
	//   83  161:new             #70  <Class StringBuilder>
	//   84  164:dup             
	//   85  165:invokespecial   #71  <Method void StringBuilder()>
	//   86  168:astore          4
		stringbuilder1.append("GZ compressing [");
	//   87  170:aload           4
	//   88  172:ldc1            #101 <String "GZ compressing [">
	//   89  174:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   90  177:pop             
		stringbuilder1.append(obj2);
	//   91  178:aload           4
	//   92  180:aload           9
	//   93  182:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//   94  185:pop             
		stringbuilder1.append("] as [");
	//   95  186:aload           4
	//   96  188:ldc1            #106 <String "] as [">
	//   97  190:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   98  193:pop             
		stringbuilder1.append(((Object) (s1)));
	//   99  194:aload           4
	//  100  196:aload_2         
	//  101  197:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//  102  200:pop             
		stringbuilder1.append("]");
	//  103  201:aload           4
	//  104  203:ldc1            #108 <String "]">
	//  105  205:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  106  208:pop             
		addInfo(stringbuilder1.toString());
	//  107  209:aload_0         
	//  108  210:aload           4
	//  109  212:invokevirtual   #85  <Method String StringBuilder.toString()>
	//  110  215:invokevirtual   #111 <Method void addInfo(String)>
		createMissingTargetDirsIfNecessary(((File) (s1)));
	//  111  218:aload_0         
	//  112  219:aload_2         
	//  113  220:invokevirtual   #115 <Method void createMissingTargetDirsIfNecessary(File)>
		s2 = null;
	//  114  223:aconst_null     
	//  115  224:astore          5
		exception = null;
	//  116  226:aconst_null     
	//  117  227:astore          6
		obj1 = null;
	//  118  229:aconst_null     
	//  119  230:astore          7
		Object obj = ((Object) (new BufferedInputStream(((java.io.InputStream) (new FileInputStream(s))))));
	//  120  232:new             #117 <Class BufferedInputStream>
	//  121  235:dup             
	//  122  236:new             #119 <Class FileInputStream>
	//  123  239:dup             
	//  124  240:aload_1         
	//  125  241:invokespecial   #120 <Method void FileInputStream(String)>
	//  126  244:invokespecial   #123 <Method void BufferedInputStream(java.io.InputStream)>
	//  127  247:astore          4
		s1 = ((String) (new GZIPOutputStream(((java.io.OutputStream) (new FileOutputStream(s3))))));
	//  128  249:new             #125 <Class GZIPOutputStream>
	//  129  252:dup             
	//  130  253:new             #127 <Class FileOutputStream>
	//  131  256:dup             
	//  132  257:aload           8
	//  133  259:invokespecial   #128 <Method void FileOutputStream(String)>
	//  134  262:invokespecial   #131 <Method void GZIPOutputStream(java.io.OutputStream)>
	//  135  265:astore_2        
		byte abyte0[] = new byte[8192];
	//  136  266:sipush          8192
	//  137  269:newarray        byte[]
	//  138  271:astore          10
_L1:
		int i = ((BufferedInputStream) (obj)).read(abyte0);
	//  139  273:aload           4
	//  140  275:aload           10
	//  141  277:invokevirtual   #135 <Method int BufferedInputStream.read(byte[])>
	//  142  280:istore_3        
		if(i == -1)
			break MISSING_BLOCK_LABEL_297;
	//  143  281:iload_3         
	//  144  282:iconst_m1       
	//  145  283:icmpeq          297
		try
		{
			((GZIPOutputStream) (s1)).write(abyte0, 0, i);
	//  146  286:aload_2         
	//  147  287:aload           10
	//  148  289:iconst_0        
	//  149  290:iload_3         
	//  150  291:invokevirtual   #139 <Method void GZIPOutputStream.write(byte[], int, int)>
		}
	//* 151  294:goto            273
	//* 152  297:aload           4
	//* 153  299:invokevirtual   #142 <Method void BufferedInputStream.close()>
	//* 154  302:aload           5
	//* 155  304:astore          4
	//* 156  306:aload_2         
	//* 157  307:astore          5
	//* 158  309:aload_2         
	//* 159  310:invokevirtual   #143 <Method void GZIPOutputStream.close()>
	//* 160  313:aload           9
	//* 161  315:invokevirtual   #146 <Method boolean File.delete()>
	//* 162  318:ifne            549
	//* 163  321:new             #70  <Class StringBuilder>
	//* 164  324:dup             
	//* 165  325:invokespecial   #71  <Method void StringBuilder()>
	//* 166  328:astore_2        
	//* 167  329:aload_2         
	//* 168  330:ldc1            #148 <String "Could not delete [">
	//* 169  332:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//* 170  335:pop             
	//* 171  336:aload_2         
	//* 172  337:aload_1         
	//* 173  338:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//* 174  341:pop             
	//* 175  342:aload_2         
	//* 176  343:ldc1            #150 <String "].">
	//* 177  345:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//* 178  348:pop             
	//* 179  349:aload_0         
	//* 180  350:new             #81  <Class WarnStatus>
	//* 181  353:dup             
	//* 182  354:aload_2         
	//* 183  355:invokevirtual   #85  <Method String StringBuilder.toString()>
	//* 184  358:aload_0         
	//* 185  359:invokespecial   #88  <Method void WarnStatus(String, Object)>
	//* 186  362:invokevirtual   #92  <Method void addStatus(ch.qos.logback.core.status.Status)>
	//* 187  365:return          
	//* 188  366:astore          6
	//* 189  368:goto            415
	//* 190  371:astore_1        
	//* 191  372:goto            383
		// Misplaced declaration of an exception variable
		catch(Exception exception)
	//* 192  375:astore          6
		{
			break MISSING_BLOCK_LABEL_393;
	//  193  377:goto            393
		}
		  goto _L1
		((BufferedInputStream) (obj)).close();
		obj = ((Object) (s2));
		s2 = s1;
		try
		{
			((GZIPOutputStream) (s1)).close();
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			break MISSING_BLOCK_LABEL_415;
		}
		Exception exception1;
		try
		{
			if(!((File) (obj2)).delete())
			{
				s1 = ((String) (new StringBuilder()));
				((StringBuilder) (s1)).append("Could not delete [");
				((StringBuilder) (s1)).append(s);
				((StringBuilder) (s1)).append("].");
				addStatus(((ch.qos.logback.core.status.Status) (new WarnStatus(((StringBuilder) (s1)).toString(), ((Object) (this))))));
				return;
			}
			break MISSING_BLOCK_LABEL_549;
		}
	//* 194  380:astore_1        
	//* 195  381:aconst_null     
	//* 196  382:astore_2        
	//* 197  383:aload_2         
	//* 198  384:astore          5
	//* 199  386:goto            551
	//* 200  389:astore          6
	//* 201  391:aconst_null     
	//* 202  392:astore_2        
	//* 203  393:aload           4
	//* 204  395:astore          7
	//* 205  397:goto            415
	//* 206  400:astore_1        
	//* 207  401:aconst_null     
	//* 208  402:astore          5
	//* 209  404:aload           6
	//* 210  406:astore          4
	//* 211  408:goto            551
		// Misplaced declaration of an exception variable
		catch(Exception exception1)
	//* 212  411:astore          6
		{
			s1 = null;
	//  213  413:aconst_null     
	//  214  414:astore_2        
		}
		break MISSING_BLOCK_LABEL_415;
		s;
		break MISSING_BLOCK_LABEL_383;
		s;
		s1 = null;
		s2 = s1;
		break MISSING_BLOCK_LABEL_551;
		exception;
		s1 = null;
		obj1 = obj;
		break MISSING_BLOCK_LABEL_415;
		s;
		s2 = null;
		obj = ((Object) (exception));
		break MISSING_BLOCK_LABEL_551;
		obj = obj1;
	//  215  415:aload           7
	//  216  417:astore          4
		s2 = s1;
	//  217  419:aload_2         
	//  218  420:astore          5
		obj2 = ((Object) (new StringBuilder()));
	//  219  422:new             #70  <Class StringBuilder>
	//  220  425:dup             
	//  221  426:invokespecial   #71  <Method void StringBuilder()>
	//  222  429:astore          9
		obj = obj1;
	//  223  431:aload           7
	//  224  433:astore          4
		s2 = s1;
	//  225  435:aload_2         
	//  226  436:astore          5
		((StringBuilder) (obj2)).append("Error occurred while compressing [");
	//  227  438:aload           9
	//  228  440:ldc1            #152 <String "Error occurred while compressing [">
	//  229  442:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  230  445:pop             
		obj = obj1;
	//  231  446:aload           7
	//  232  448:astore          4
		s2 = s1;
	//  233  450:aload_2         
	//  234  451:astore          5
		((StringBuilder) (obj2)).append(s);
	//  235  453:aload           9
	//  236  455:aload_1         
	//  237  456:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  238  459:pop             
		obj = obj1;
	//  239  460:aload           7
	//  240  462:astore          4
		s2 = s1;
	//  241  464:aload_2         
	//  242  465:astore          5
		((StringBuilder) (obj2)).append("] into [");
	//  243  467:aload           9
	//  244  469:ldc1            #154 <String "] into [">
	//  245  471:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  246  474:pop             
		obj = obj1;
	//  247  475:aload           7
	//  248  477:astore          4
		s2 = s1;
	//  249  479:aload_2         
	//  250  480:astore          5
		((StringBuilder) (obj2)).append(s3);
	//  251  482:aload           9
	//  252  484:aload           8
	//  253  486:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  254  489:pop             
		obj = obj1;
	//  255  490:aload           7
	//  256  492:astore          4
		s2 = s1;
	//  257  494:aload_2         
	//  258  495:astore          5
		((StringBuilder) (obj2)).append("].");
	//  259  497:aload           9
	//  260  499:ldc1            #150 <String "].">
	//  261  501:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  262  504:pop             
		obj = obj1;
	//  263  505:aload           7
	//  264  507:astore          4
		s2 = s1;
	//  265  509:aload_2         
	//  266  510:astore          5
		addStatus(((ch.qos.logback.core.status.Status) (new ErrorStatus(((StringBuilder) (obj2)).toString(), ((Object) (this)), ((Throwable) (exception1))))));
	//  267  512:aload_0         
	//  268  513:new             #156 <Class ErrorStatus>
	//  269  516:dup             
	//  270  517:aload           9
	//  271  519:invokevirtual   #85  <Method String StringBuilder.toString()>
	//  272  522:aload_0         
	//  273  523:aload           6
	//  274  525:invokespecial   #159 <Method void ErrorStatus(String, Object, Throwable)>
	//  275  528:invokevirtual   #92  <Method void addStatus(ch.qos.logback.core.status.Status)>
		if(obj1 != null)
	//* 276  531:aload           7
	//* 277  533:ifnull          541
			try
			{
				((BufferedInputStream) (obj1)).close();
	//  278  536:aload           7
	//  279  538:invokevirtual   #142 <Method void BufferedInputStream.close()>
			}
	//* 280  541:aload_2         
	//* 281  542:ifnull          549
	//* 282  545:aload_2         
	//* 283  546:invokevirtual   #143 <Method void GZIPOutputStream.close()>
	//* 284  549:return          
	//* 285  550:astore_1        
	//* 286  551:aload           4
	//* 287  553:ifnull          561
	//* 288  556:aload           4
	//* 289  558:invokevirtual   #142 <Method void BufferedInputStream.close()>
	//* 290  561:aload           5
	//* 291  563:ifnull          571
	//* 292  566:aload           5
	//* 293  568:invokevirtual   #143 <Method void GZIPOutputStream.close()>
	//* 294  571:aload_1         
	//* 295  572:athrow          
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//  296  573:astore_1        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_549;
		((GZIPOutputStream) (s1)).close();
		return;
		s;
		if(obj != null)
			try
			{
				((BufferedInputStream) (obj)).close();
			}
	//* 297  574:goto            541
	//* 298  577:astore_1        
	//* 299  578:return          
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  300  579:astore_2        
		if(s2 != null)
			try
			{
				((GZIPOutputStream) (s2)).close();
			}
	//* 301  580:goto            561
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  302  583:astore_2        
		throw s;
		s;
	//* 303  584:goto            571
	}

	private void zipCompress(String s, String s1, String s2)
	{
		Object obj1;
		Exception exception;
		String s3;
		StringBuilder stringbuilder2;
		File file;
		file = new File(s);
	//    0    0:new             #63  <Class File>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #64  <Method void File(String)>
	//    4    8:astore          10
		if(!file.exists())
	//*   5   10:aload           10
	//*   6   12:invokevirtual   #68  <Method boolean File.exists()>
	//*   7   15:ifne            63
		{
			s1 = ((String) (new StringBuilder()));
	//    8   18:new             #70  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #71  <Method void StringBuilder()>
	//   11   25:astore_2        
			((StringBuilder) (s1)).append("The file to compress named [");
	//   12   26:aload_2         
	//   13   27:ldc1            #73  <String "The file to compress named [">
	//   14   29:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
			((StringBuilder) (s1)).append(s);
	//   16   33:aload_2         
	//   17   34:aload_1         
	//   18   35:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			((StringBuilder) (s1)).append("] does not exist.");
	//   20   39:aload_2         
	//   21   40:ldc1            #79  <String "] does not exist.">
	//   22   42:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			addStatus(((ch.qos.logback.core.status.Status) (new WarnStatus(((StringBuilder) (s1)).toString(), ((Object) (this))))));
	//   24   46:aload_0         
	//   25   47:new             #81  <Class WarnStatus>
	//   26   50:dup             
	//   27   51:aload_2         
	//   28   52:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   29   55:aload_0         
	//   30   56:invokespecial   #88  <Method void WarnStatus(String, Object)>
	//   31   59:invokevirtual   #92  <Method void addStatus(ch.qos.logback.core.status.Status)>
			return;
	//   32   62:return          
		}
		if(s2 == null)
	//*  33   63:aload_3         
	//*  34   64:ifnonnull       82
		{
			addStatus(((ch.qos.logback.core.status.Status) (new WarnStatus("The innerEntryName parameter cannot be null", ((Object) (this))))));
	//   35   67:aload_0         
	//   36   68:new             #81  <Class WarnStatus>
	//   37   71:dup             
	//   38   72:ldc1            #163 <String "The innerEntryName parameter cannot be null">
	//   39   74:aload_0         
	//   40   75:invokespecial   #88  <Method void WarnStatus(String, Object)>
	//   41   78:invokevirtual   #92  <Method void addStatus(ch.qos.logback.core.status.Status)>
			return;
	//   42   81:return          
		}
		s3 = s1;
	//   43   82:aload_2         
	//   44   83:astore          8
		if(!s1.endsWith(".zip"))
	//*  45   85:aload_2         
	//*  46   86:ldc1            #45  <String ".zip">
	//*  47   88:invokevirtual   #49  <Method boolean String.endsWith(String)>
	//*  48   91:ifne            125
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   49   94:new             #70  <Class StringBuilder>
	//   50   97:dup             
	//   51   98:invokespecial   #71  <Method void StringBuilder()>
	//   52  101:astore          5
			stringbuilder.append(s1);
	//   53  103:aload           5
	//   54  105:aload_2         
	//   55  106:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   56  109:pop             
			stringbuilder.append(".zip");
	//   57  110:aload           5
	//   58  112:ldc1            #45  <String ".zip">
	//   59  114:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   60  117:pop             
			s3 = stringbuilder.toString();
	//   61  118:aload           5
	//   62  120:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   63  123:astore          8
		}
		s1 = ((String) (new File(s3)));
	//   64  125:new             #63  <Class File>
	//   65  128:dup             
	//   66  129:aload           8
	//   67  131:invokespecial   #64  <Method void File(String)>
	//   68  134:astore_2        
		if(((File) (s1)).exists())
	//*  69  135:aload_2         
	//*  70  136:invokevirtual   #68  <Method boolean File.exists()>
	//*  71  139:ifeq            188
		{
			s = ((String) (new StringBuilder()));
	//   72  142:new             #70  <Class StringBuilder>
	//   73  145:dup             
	//   74  146:invokespecial   #71  <Method void StringBuilder()>
	//   75  149:astore_1        
			((StringBuilder) (s)).append("The target compressed file named [");
	//   76  150:aload_1         
	//   77  151:ldc1            #94  <String "The target compressed file named [">
	//   78  153:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   79  156:pop             
			((StringBuilder) (s)).append(s3);
	//   80  157:aload_1         
	//   81  158:aload           8
	//   82  160:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   83  163:pop             
			((StringBuilder) (s)).append("] exist already.");
	//   84  164:aload_1         
	//   85  165:ldc1            #165 <String "] exist already.">
	//   86  167:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   87  170:pop             
			addStatus(((ch.qos.logback.core.status.Status) (new WarnStatus(((StringBuilder) (s)).toString(), ((Object) (this))))));
	//   88  171:aload_0         
	//   89  172:new             #81  <Class WarnStatus>
	//   90  175:dup             
	//   91  176:aload_1         
	//   92  177:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   93  180:aload_0         
	//   94  181:invokespecial   #88  <Method void WarnStatus(String, Object)>
	//   95  184:invokevirtual   #92  <Method void addStatus(ch.qos.logback.core.status.Status)>
			return;
	//   96  187:return          
		}
		StringBuilder stringbuilder1 = new StringBuilder();
	//   97  188:new             #70  <Class StringBuilder>
	//   98  191:dup             
	//   99  192:invokespecial   #71  <Method void StringBuilder()>
	//  100  195:astore          5
		stringbuilder1.append("ZIP compressing [");
	//  101  197:aload           5
	//  102  199:ldc1            #167 <String "ZIP compressing [">
	//  103  201:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  104  204:pop             
		stringbuilder1.append(((Object) (file)));
	//  105  205:aload           5
	//  106  207:aload           10
	//  107  209:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//  108  212:pop             
		stringbuilder1.append("] as [");
	//  109  213:aload           5
	//  110  215:ldc1            #106 <String "] as [">
	//  111  217:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  112  220:pop             
		stringbuilder1.append(((Object) (s1)));
	//  113  221:aload           5
	//  114  223:aload_2         
	//  115  224:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//  116  227:pop             
		stringbuilder1.append("]");
	//  117  228:aload           5
	//  118  230:ldc1            #108 <String "]">
	//  119  232:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  120  235:pop             
		addInfo(stringbuilder1.toString());
	//  121  236:aload_0         
	//  122  237:aload           5
	//  123  239:invokevirtual   #85  <Method String StringBuilder.toString()>
	//  124  242:invokevirtual   #111 <Method void addInfo(String)>
		createMissingTargetDirsIfNecessary(((File) (s1)));
	//  125  245:aload_0         
	//  126  246:aload_2         
	//  127  247:invokevirtual   #115 <Method void createMissingTargetDirsIfNecessary(File)>
		stringbuilder2 = null;
	//  128  250:aconst_null     
	//  129  251:astore          9
		exception = null;
	//  130  253:aconst_null     
	//  131  254:astore          7
		obj1 = null;
	//  132  256:aconst_null     
	//  133  257:astore          6
		Object obj = ((Object) (new BufferedInputStream(((java.io.InputStream) (new FileInputStream(s))))));
	//  134  259:new             #117 <Class BufferedInputStream>
	//  135  262:dup             
	//  136  263:new             #119 <Class FileInputStream>
	//  137  266:dup             
	//  138  267:aload_1         
	//  139  268:invokespecial   #120 <Method void FileInputStream(String)>
	//  140  271:invokespecial   #123 <Method void BufferedInputStream(java.io.InputStream)>
	//  141  274:astore          5
		s1 = ((String) (new ZipOutputStream(((java.io.OutputStream) (new FileOutputStream(s3))))));
	//  142  276:new             #169 <Class ZipOutputStream>
	//  143  279:dup             
	//  144  280:new             #127 <Class FileOutputStream>
	//  145  283:dup             
	//  146  284:aload           8
	//  147  286:invokespecial   #128 <Method void FileOutputStream(String)>
	//  148  289:invokespecial   #170 <Method void ZipOutputStream(java.io.OutputStream)>
	//  149  292:astore_2        
		((ZipOutputStream) (s1)).putNextEntry(computeZipEntry(s2));
	//  150  293:aload_2         
	//  151  294:aload_0         
	//  152  295:aload_3         
	//  153  296:invokevirtual   #174 <Method ZipEntry computeZipEntry(String)>
	//  154  299:invokevirtual   #178 <Method void ZipOutputStream.putNextEntry(ZipEntry)>
		s2 = ((String) (new byte[8192]));
	//  155  302:sipush          8192
	//  156  305:newarray        byte[]
	//  157  307:astore_3        
_L1:
		int i = ((BufferedInputStream) (obj)).read(((byte []) (s2)));
	//  158  308:aload           5
	//  159  310:aload_3         
	//  160  311:invokevirtual   #135 <Method int BufferedInputStream.read(byte[])>
	//  161  314:istore          4
		if(i == -1)
			break MISSING_BLOCK_LABEL_333;
	//  162  316:iload           4
	//  163  318:iconst_m1       
	//  164  319:icmpeq          333
		try
		{
			((ZipOutputStream) (s1)).write(((byte []) (s2)), 0, i);
	//  165  322:aload_2         
	//  166  323:aload_3         
	//  167  324:iconst_0        
	//  168  325:iload           4
	//  169  327:invokevirtual   #179 <Method void ZipOutputStream.write(byte[], int, int)>
		}
	//* 170  330:goto            308
	//* 171  333:aload           5
	//* 172  335:invokevirtual   #142 <Method void BufferedInputStream.close()>
	//* 173  338:aload           9
	//* 174  340:astore_3        
	//* 175  341:aload_2         
	//* 176  342:astore          5
	//* 177  344:aload_2         
	//* 178  345:invokevirtual   #180 <Method void ZipOutputStream.close()>
	//* 179  348:aload           10
	//* 180  350:invokevirtual   #146 <Method boolean File.delete()>
	//* 181  353:ifne            579
	//* 182  356:new             #70  <Class StringBuilder>
	//* 183  359:dup             
	//* 184  360:invokespecial   #71  <Method void StringBuilder()>
	//* 185  363:astore_2        
	//* 186  364:aload_2         
	//* 187  365:ldc1            #148 <String "Could not delete [">
	//* 188  367:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//* 189  370:pop             
	//* 190  371:aload_2         
	//* 191  372:aload_1         
	//* 192  373:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//* 193  376:pop             
	//* 194  377:aload_2         
	//* 195  378:ldc1            #150 <String "].">
	//* 196  380:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//* 197  383:pop             
	//* 198  384:aload_0         
	//* 199  385:new             #81  <Class WarnStatus>
	//* 200  388:dup             
	//* 201  389:aload_2         
	//* 202  390:invokevirtual   #85  <Method String StringBuilder.toString()>
	//* 203  393:aload_0         
	//* 204  394:invokespecial   #88  <Method void WarnStatus(String, Object)>
	//* 205  397:invokevirtual   #92  <Method void addStatus(ch.qos.logback.core.status.Status)>
	//* 206  400:return          
	//* 207  401:astore          7
	//* 208  403:goto            452
	//* 209  406:astore_1        
	//* 210  407:goto            418
		// Misplaced declaration of an exception variable
		catch(Exception exception)
	//* 211  410:astore          7
		{
			break MISSING_BLOCK_LABEL_431;
	//  212  412:goto            431
		}
		  goto _L1
		((BufferedInputStream) (obj)).close();
		s2 = ((String) (stringbuilder2));
		obj = ((Object) (s1));
		try
		{
			((ZipOutputStream) (s1)).close();
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			break MISSING_BLOCK_LABEL_452;
		}
		Exception exception1;
		try
		{
			if(!file.delete())
			{
				s1 = ((String) (new StringBuilder()));
				((StringBuilder) (s1)).append("Could not delete [");
				((StringBuilder) (s1)).append(s);
				((StringBuilder) (s1)).append("].");
				addStatus(((ch.qos.logback.core.status.Status) (new WarnStatus(((StringBuilder) (s1)).toString(), ((Object) (this))))));
				return;
			}
			break MISSING_BLOCK_LABEL_579;
		}
	//* 213  415:astore_1        
	//* 214  416:aconst_null     
	//* 215  417:astore_2        
	//* 216  418:aload           5
	//* 217  420:astore_3        
	//* 218  421:aload_2         
	//* 219  422:astore          5
	//* 220  424:goto            581
	//* 221  427:astore          7
	//* 222  429:aconst_null     
	//* 223  430:astore_2        
	//* 224  431:aload           5
	//* 225  433:astore          6
	//* 226  435:goto            452
	//* 227  438:astore_1        
	//* 228  439:aconst_null     
	//* 229  440:astore          5
	//* 230  442:aload           7
	//* 231  444:astore_3        
	//* 232  445:goto            581
		// Misplaced declaration of an exception variable
		catch(Exception exception1)
	//* 233  448:astore          7
		{
			s1 = null;
	//  234  450:aconst_null     
	//  235  451:astore_2        
		}
		break MISSING_BLOCK_LABEL_452;
		s;
		break MISSING_BLOCK_LABEL_418;
		s;
		s1 = null;
		s2 = ((String) (obj));
		obj = ((Object) (s1));
		break MISSING_BLOCK_LABEL_581;
		exception;
		s1 = null;
		obj1 = obj;
		break MISSING_BLOCK_LABEL_452;
		s;
		obj = null;
		s2 = ((String) (exception));
		break MISSING_BLOCK_LABEL_581;
		s2 = ((String) (obj1));
	//  236  452:aload           6
	//  237  454:astore_3        
		obj = ((Object) (s1));
	//  238  455:aload_2         
	//  239  456:astore          5
		stringbuilder2 = new StringBuilder();
	//  240  458:new             #70  <Class StringBuilder>
	//  241  461:dup             
	//  242  462:invokespecial   #71  <Method void StringBuilder()>
	//  243  465:astore          9
		s2 = ((String) (obj1));
	//  244  467:aload           6
	//  245  469:astore_3        
		obj = ((Object) (s1));
	//  246  470:aload_2         
	//  247  471:astore          5
		stringbuilder2.append("Error occurred while compressing [");
	//  248  473:aload           9
	//  249  475:ldc1            #152 <String "Error occurred while compressing [">
	//  250  477:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  251  480:pop             
		s2 = ((String) (obj1));
	//  252  481:aload           6
	//  253  483:astore_3        
		obj = ((Object) (s1));
	//  254  484:aload_2         
	//  255  485:astore          5
		stringbuilder2.append(s);
	//  256  487:aload           9
	//  257  489:aload_1         
	//  258  490:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  259  493:pop             
		s2 = ((String) (obj1));
	//  260  494:aload           6
	//  261  496:astore_3        
		obj = ((Object) (s1));
	//  262  497:aload_2         
	//  263  498:astore          5
		stringbuilder2.append("] into [");
	//  264  500:aload           9
	//  265  502:ldc1            #154 <String "] into [">
	//  266  504:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  267  507:pop             
		s2 = ((String) (obj1));
	//  268  508:aload           6
	//  269  510:astore_3        
		obj = ((Object) (s1));
	//  270  511:aload_2         
	//  271  512:astore          5
		stringbuilder2.append(s3);
	//  272  514:aload           9
	//  273  516:aload           8
	//  274  518:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  275  521:pop             
		s2 = ((String) (obj1));
	//  276  522:aload           6
	//  277  524:astore_3        
		obj = ((Object) (s1));
	//  278  525:aload_2         
	//  279  526:astore          5
		stringbuilder2.append("].");
	//  280  528:aload           9
	//  281  530:ldc1            #150 <String "].">
	//  282  532:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  283  535:pop             
		s2 = ((String) (obj1));
	//  284  536:aload           6
	//  285  538:astore_3        
		obj = ((Object) (s1));
	//  286  539:aload_2         
	//  287  540:astore          5
		addStatus(((ch.qos.logback.core.status.Status) (new ErrorStatus(stringbuilder2.toString(), ((Object) (this)), ((Throwable) (exception1))))));
	//  288  542:aload_0         
	//  289  543:new             #156 <Class ErrorStatus>
	//  290  546:dup             
	//  291  547:aload           9
	//  292  549:invokevirtual   #85  <Method String StringBuilder.toString()>
	//  293  552:aload_0         
	//  294  553:aload           7
	//  295  555:invokespecial   #159 <Method void ErrorStatus(String, Object, Throwable)>
	//  296  558:invokevirtual   #92  <Method void addStatus(ch.qos.logback.core.status.Status)>
		if(obj1 != null)
	//* 297  561:aload           6
	//* 298  563:ifnull          571
			try
			{
				((BufferedInputStream) (obj1)).close();
	//  299  566:aload           6
	//  300  568:invokevirtual   #142 <Method void BufferedInputStream.close()>
			}
	//* 301  571:aload_2         
	//* 302  572:ifnull          579
	//* 303  575:aload_2         
	//* 304  576:invokevirtual   #180 <Method void ZipOutputStream.close()>
	//* 305  579:return          
	//* 306  580:astore_1        
	//* 307  581:aload_3         
	//* 308  582:ifnull          589
	//* 309  585:aload_3         
	//* 310  586:invokevirtual   #142 <Method void BufferedInputStream.close()>
	//* 311  589:aload           5
	//* 312  591:ifnull          599
	//* 313  594:aload           5
	//* 314  596:invokevirtual   #180 <Method void ZipOutputStream.close()>
	//* 315  599:aload_1         
	//* 316  600:athrow          
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//  317  601:astore_1        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_579;
		((ZipOutputStream) (s1)).close();
		return;
		s;
		if(s2 != null)
			try
			{
				((BufferedInputStream) (s2)).close();
			}
	//* 318  602:goto            571
	//* 319  605:astore_1        
	//* 320  606:return          
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  321  607:astore_2        
		if(obj != null)
			try
			{
				((ZipOutputStream) (obj)).close();
			}
	//* 322  608:goto            589
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  323  611:astore_2        
		throw s;
		s;
	//* 324  612:goto            599
	}

	public void compress(String s, String s1, String s2)
	{
		switch(_cls1..SwitchMap.ch.qos.logback.core.rolling.helper.CompressionMode[compressionMode.ordinal()])
	//*   0    0:getstatic       #31  <Field int[] Compressor$1.$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
	//*   1    3:aload_0         
	//*   2    4:getfield        #18  <Field CompressionMode compressionMode>
	//*   3    7:invokevirtual   #36  <Method int CompressionMode.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 55
	//	               2 47
	//	               3 37
		default:
			return;
	//    6   36:return          

		case 3: // '\003'
			throw new UnsupportedOperationException("compress method called in NONE compression mode");
	//    7   37:new             #183 <Class UnsupportedOperationException>
	//    8   40:dup             
	//    9   41:ldc1            #185 <String "compress method called in NONE compression mode">
	//   10   43:invokespecial   #186 <Method void UnsupportedOperationException(String)>
	//   11   46:athrow          

		case 2: // '\002'
			zipCompress(s, s1, s2);
	//   12   47:aload_0         
	//   13   48:aload_1         
	//   14   49:aload_2         
	//   15   50:aload_3         
	//   16   51:invokespecial   #188 <Method void zipCompress(String, String, String)>
			return;
	//   17   54:return          

		case 1: // '\001'
			gzCompress(s, s1);
	//   18   55:aload_0         
	//   19   56:aload_1         
	//   20   57:aload_2         
	//   21   58:invokespecial   #190 <Method void gzCompress(String, String)>
			return;
	//   22   61:return          
		}
	}

	ZipEntry computeZipEntry(File file)
	{
		return computeZipEntry(file.getName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #194 <Method String File.getName()>
	//    3    5:invokevirtual   #174 <Method ZipEntry computeZipEntry(String)>
	//    4    8:areturn         
	}

	ZipEntry computeZipEntry(String s)
	{
		return new ZipEntry(computeFileNameStr_WCS(s, compressionMode));
	//    0    0:new             #196 <Class ZipEntry>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field CompressionMode compressionMode>
	//    5    9:invokestatic    #198 <Method String computeFileNameStr_WCS(String, CompressionMode)>
	//    6   12:invokespecial   #199 <Method void ZipEntry(String)>
	//    7   15:areturn         
	}

	void createMissingTargetDirsIfNecessary(File file)
	{
		if(FileUtil.isParentDirectoryCreationRequired(file))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #205 <Method boolean FileUtil.isParentDirectoryCreationRequired(File)>
	//*   2    4:ifeq            93
		{
			if(!FileUtil.createMissingParentDirectories(file))
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #208 <Method boolean FileUtil.createMissingParentDirectories(File)>
	//*   5   11:ifne            54
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #70  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #71  <Method void StringBuilder()>
	//    9   21:astore_2        
				stringbuilder.append("Failed to create parent directories for [");
	//   10   22:aload_2         
	//   11   23:ldc1            #210 <String "Failed to create parent directories for [">
	//   12   25:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
				stringbuilder.append(file.getAbsolutePath());
	//   14   29:aload_2         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #213 <Method String File.getAbsolutePath()>
	//   17   34:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
				stringbuilder.append("]");
	//   19   38:aload_2         
	//   20   39:ldc1            #108 <String "]">
	//   21   41:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
				addError(stringbuilder.toString());
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   26   50:invokevirtual   #216 <Method void addError(String)>
				return;
	//   27   53:return          
			}
			StringBuilder stringbuilder1 = new StringBuilder();
	//   28   54:new             #70  <Class StringBuilder>
	//   29   57:dup             
	//   30   58:invokespecial   #71  <Method void StringBuilder()>
	//   31   61:astore_2        
			stringbuilder1.append("Created missing parent directories for [");
	//   32   62:aload_2         
	//   33   63:ldc1            #218 <String "Created missing parent directories for [">
	//   34   65:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			stringbuilder1.append(file.getAbsolutePath());
	//   36   69:aload_2         
	//   37   70:aload_1         
	//   38   71:invokevirtual   #213 <Method String File.getAbsolutePath()>
	//   39   74:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   40   77:pop             
			stringbuilder1.append("]");
	//   41   78:aload_2         
	//   42   79:ldc1            #108 <String "]">
	//   43   81:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
			addInfo(stringbuilder1.toString());
	//   45   85:aload_0         
	//   46   86:aload_2         
	//   47   87:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   48   90:invokevirtual   #111 <Method void addInfo(String)>
		}
	//   49   93:return          
	}

	public String toString()
	{
		return ((Object)this).getClass().getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #224 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #227 <Method String Class.getName()>
	//    3    7:areturn         
	}

	static final int BUFFER_SIZE = 8192;
	final CompressionMode compressionMode;
}
