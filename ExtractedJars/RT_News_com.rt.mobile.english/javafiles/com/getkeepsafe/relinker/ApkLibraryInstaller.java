// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.*;
import java.util.zip.ZipFile;

// Referenced classes of package com.getkeepsafe.relinker:
//			ReLinkerInstance, MissingLibraryException

public class ApkLibraryInstaller
	implements ReLinker.LibraryInstaller
{

	public ApkLibraryInstaller()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private void closeSilently(Closeable closeable)
	{
		if(closeable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_1         
	//    1    1:ifnull          10
		closeable.close();
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method void Closeable.close()>
		return;
	//    4   10:return          
		closeable;
	//    5   11:astore_1        
	//    6   12:return          
	}

	private long copy(InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
		byte abyte0[] = new byte[4096];
	//    0    0:sipush          4096
	//    1    3:newarray        byte[]
	//    2    5:astore          6
		long l = 0L;
	//    3    7:lconst_0        
	//    4    8:lstore          4
		do
		{
			int i = inputstream.read(abyte0);
	//    5   10:aload_1         
	//    6   11:aload           6
	//    7   13:invokevirtual   #33  <Method int InputStream.read(byte[])>
	//    8   16:istore_3        
			if(i == -1)
	//*   9   17:iload_3         
	//*  10   18:iconst_m1       
	//*  11   19:icmpne          29
			{
				outputstream.flush();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #38  <Method void OutputStream.flush()>
				return l;
	//   14   26:lload           4
	//   15   28:lreturn         
			}
			outputstream.write(abyte0, 0, i);
	//   16   29:aload_2         
	//   17   30:aload           6
	//   18   32:iconst_0        
	//   19   33:iload_3         
	//   20   34:invokevirtual   #42  <Method void OutputStream.write(byte[], int, int)>
			l += i;
	//   21   37:lload           4
	//   22   39:iload_3         
	//   23   40:i2l             
	//   24   41:ladd            
	//   25   42:lstore          4
		} while(true);
	//   26   44:goto            10
	}

	public void installLibrary(Context context, String as[], String s, File file, ReLinkerInstance relinkerinstance)
	{
		context = ((Context) (context.getApplicationInfo()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #53  <Method ApplicationInfo Context.getApplicationInfo()>
	//    2    4:astore_1        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore          6
_L3:
		if(i >= 5)
			break; /* Loop/switch isn't completed */
	//    5    8:iload           6
	//    6   10:iconst_5        
	//    7   11:icmpge          47
		ZipFile zipfile = new ZipFile(new File(((ApplicationInfo) (context)).sourceDir), 1);
	//    8   14:new             #55  <Class ZipFile>
	//    9   17:dup             
	//   10   18:new             #57  <Class File>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:getfield        #63  <Field String ApplicationInfo.sourceDir>
	//   14   26:invokespecial   #66  <Method void File(String)>
	//   15   29:iconst_1        
	//   16   30:invokespecial   #69  <Method void ZipFile(File, int)>
	//   17   33:astore          15
		  goto _L1
	//*  18   35:goto            50
_L15:
		i++;
	//   19   38:iload           6
	//   20   40:iconst_1        
	//   21   41:iadd            
	//   22   42:istore          6
		if(true) goto _L3; else goto _L2
	//   23   44:goto            8
_L2:
		zipfile = null;
	//   24   47:aconst_null     
	//   25   48:astore          15
_L1:
		if(zipfile != null) goto _L5; else goto _L4
	//   26   50:aload           15
	//   27   52:ifnonnull       77
_L4:
		relinkerinstance.log("FATAL! Couldn't find application APK!");
	//   28   55:aload           5
	//   29   57:ldc1            #71  <String "FATAL! Couldn't find application APK!">
	//   30   59:invokevirtual   #76  <Method void ReLinkerInstance.log(String)>
		if(zipfile == null)
			break MISSING_BLOCK_LABEL_72;
	//   31   62:aload           15
	//   32   64:ifnull          72
		zipfile.close();
	//   33   67:aload           15
	//   34   69:invokevirtual   #77  <Method void ZipFile.close()>
		return;
	//   35   72:return          
		context;
	//   36   73:astore_1        
		  goto _L6
	//*  37   74:goto            443
_L5:
		i = 0;
	//   38   77:iconst_0        
	//   39   78:istore          6
_L23:
		if(i >= 5) goto _L8; else goto _L7
	//   40   80:iload           6
	//   41   82:iconst_5        
	//   42   83:icmpge          421
_L7:
		int k = as.length;
	//   43   86:aload_2         
	//   44   87:arraylength     
	//   45   88:istore          8
		int j;
		Object obj;
		j = 0;
	//   46   90:iconst_0        
	//   47   91:istore          7
		obj = null;
	//   48   93:aconst_null     
	//   49   94:astore          14
		context = null;
	//   50   96:aconst_null     
	//   51   97:astore_1        
_L22:
		if(j >= k) goto _L10; else goto _L9
	//   52   98:iload           7
	//   53  100:iload           8
	//   54  102:icmpge          181
_L9:
		context = ((Context) (as[j]));
	//   55  105:aload_2         
	//   56  106:iload           7
	//   57  108:aaload          
	//   58  109:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   59  110:new             #79  <Class StringBuilder>
	//   60  113:dup             
	//   61  114:invokespecial   #80  <Method void StringBuilder()>
	//   62  117:astore          14
		((StringBuilder) (obj)).append("lib");
	//   63  119:aload           14
	//   64  121:ldc1            #82  <String "lib">
	//   65  123:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   66  126:pop             
		((StringBuilder) (obj)).append(File.separatorChar);
	//   67  127:aload           14
	//   68  129:getstatic       #90  <Field char File.separatorChar>
	//   69  132:invokevirtual   #93  <Method StringBuilder StringBuilder.append(char)>
	//   70  135:pop             
		((StringBuilder) (obj)).append(((String) (context)));
	//   71  136:aload           14
	//   72  138:aload_1         
	//   73  139:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   74  142:pop             
		((StringBuilder) (obj)).append(File.separatorChar);
	//   75  143:aload           14
	//   76  145:getstatic       #90  <Field char File.separatorChar>
	//   77  148:invokevirtual   #93  <Method StringBuilder StringBuilder.append(char)>
	//   78  151:pop             
		((StringBuilder) (obj)).append(s);
	//   79  152:aload           14
	//   80  154:aload_3         
	//   81  155:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   82  158:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   83  159:aload           14
	//   84  161:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   85  164:astore          14
		context = ((Context) (zipfile.getEntry(((String) (obj)))));
	//   86  166:aload           15
	//   87  168:aload           14
	//   88  170:invokevirtual   #101 <Method java.util.zip.ZipEntry ZipFile.getEntry(String)>
	//   89  173:astore_1        
		if(context == null) goto _L11; else goto _L10
	//   90  174:aload_1         
	//   91  175:ifnull          502
	//*  92  178:goto            181
_L10:
		if(obj == null)
			break MISSING_BLOCK_LABEL_202;
	//   93  181:aload           14
	//   94  183:ifnull          202
		relinkerinstance.log("Looking for %s in APK...", new Object[] {
			obj
		});
	//   95  186:aload           5
	//   96  188:ldc1            #103 <String "Looking for %s in APK...">
	//   97  190:iconst_1        
	//   98  191:anewarray       Object[]
	//   99  194:dup             
	//  100  195:iconst_0        
	//  101  196:aload           14
	//  102  198:aastore         
	//  103  199:invokevirtual   #106 <Method void ReLinkerInstance.log(String, Object[])>
		if(context != null)
			break MISSING_BLOCK_LABEL_230;
	//  104  202:aload_1         
	//  105  203:ifnonnull       230
		if(obj == null)
			break MISSING_BLOCK_LABEL_221;
	//  106  206:aload           14
	//  107  208:ifnull          221
		throw new MissingLibraryException(((String) (obj)));
	//  108  211:new             #108 <Class MissingLibraryException>
	//  109  214:dup             
	//  110  215:aload           14
	//  111  217:invokespecial   #109 <Method void MissingLibraryException(String)>
	//  112  220:athrow          
		throw new MissingLibraryException(s);
	//  113  221:new             #108 <Class MissingLibraryException>
	//  114  224:dup             
	//  115  225:aload_3         
	//  116  226:invokespecial   #109 <Method void MissingLibraryException(String)>
	//  117  229:athrow          
		relinkerinstance.log("Found %s! Extracting...", new Object[] {
			obj
		});
	//  118  230:aload           5
	//  119  232:ldc1            #111 <String "Found %s! Extracting...">
	//  120  234:iconst_1        
	//  121  235:anewarray       Object[]
	//  122  238:dup             
	//  123  239:iconst_0        
	//  124  240:aload           14
	//  125  242:aastore         
	//  126  243:invokevirtual   #106 <Method void ReLinkerInstance.log(String, Object[])>
		boolean flag;
		long l;
		long l1;
		IOException ioexception;
		try
		{
			if(file.exists())
				break MISSING_BLOCK_LABEL_269;
	//  127  246:aload           4
	//  128  248:invokevirtual   #115 <Method boolean File.exists()>
	//  129  251:ifne            269
			flag = file.createNewFile();
	//  130  254:aload           4
	//  131  256:invokevirtual   #118 <Method boolean File.createNewFile()>
	//  132  259:istore          9
		}
	//* 133  261:iload           9
	//* 134  263:ifne            269
	//* 135  266:goto            527
	//* 136  269:aload           15
	//* 137  271:aload_1         
	//* 138  272:invokevirtual   #122 <Method InputStream ZipFile.getInputStream(java.util.zip.ZipEntry)>
	//* 139  275:astore_1        
	//* 140  276:new             #124 <Class FileOutputStream>
	//* 141  279:dup             
	//* 142  280:aload           4
	//* 143  282:invokespecial   #127 <Method void FileOutputStream(File)>
	//* 144  285:astore          14
	//* 145  287:aload_0         
	//* 146  288:aload_1         
	//* 147  289:aload           14
	//* 148  291:invokespecial   #129 <Method long copy(InputStream, OutputStream)>
	//* 149  294:lstore          10
	//* 150  296:aload           14
	//* 151  298:invokevirtual   #133 <Method FileDescriptor FileOutputStream.getFD()>
	//* 152  301:invokevirtual   #138 <Method void FileDescriptor.sync()>
	//* 153  304:aload           4
	//* 154  306:invokevirtual   #142 <Method long File.length()>
	//* 155  309:lstore          12
	//* 156  311:lload           10
	//* 157  313:lload           12
	//* 158  315:lcmp            
	//* 159  316:ifeq            333
	//* 160  319:aload_0         
	//* 161  320:aload_1         
	//* 162  321:invokespecial   #144 <Method void closeSilently(Closeable)>
	//* 163  324:aload_0         
	//* 164  325:aload           14
	//* 165  327:invokespecial   #144 <Method void closeSilently(Closeable)>
	//* 166  330:goto            527
	//* 167  333:aload_0         
	//* 168  334:aload_1         
	//* 169  335:invokespecial   #144 <Method void closeSilently(Closeable)>
	//* 170  338:aload_0         
	//* 171  339:aload           14
	//* 172  341:invokespecial   #144 <Method void closeSilently(Closeable)>
	//* 173  344:aload           4
	//* 174  346:iconst_1        
	//* 175  347:iconst_0        
	//* 176  348:invokevirtual   #148 <Method boolean File.setReadable(boolean, boolean)>
	//* 177  351:pop             
	//* 178  352:aload           4
	//* 179  354:iconst_1        
	//* 180  355:iconst_0        
	//* 181  356:invokevirtual   #151 <Method boolean File.setExecutable(boolean, boolean)>
	//* 182  359:pop             
	//* 183  360:aload           4
	//* 184  362:iconst_1        
	//* 185  363:invokevirtual   #155 <Method boolean File.setWritable(boolean)>
	//* 186  366:pop             
	//* 187  367:aload           15
	//* 188  369:ifnull          377
	//* 189  372:aload           15
	//* 190  374:invokevirtual   #77  <Method void ZipFile.close()>
	//* 191  377:return          
	//* 192  378:astore_2        
	//* 193  379:goto            392
	//* 194  382:astore_2        
	//* 195  383:goto            389
	//* 196  386:astore_2        
	//* 197  387:aconst_null     
	//* 198  388:astore_1        
	//* 199  389:aconst_null     
	//* 200  390:astore          14
	//* 201  392:aload_0         
	//* 202  393:aload_1         
	//* 203  394:invokespecial   #144 <Method void closeSilently(Closeable)>
	//* 204  397:aload_0         
	//* 205  398:aload           14
	//* 206  400:invokespecial   #144 <Method void closeSilently(Closeable)>
	//* 207  403:aload_2         
	//* 208  404:athrow          
	//* 209  405:aload_0         
	//* 210  406:aload_1         
	//* 211  407:invokespecial   #144 <Method void closeSilently(Closeable)>
	//* 212  410:goto            324
	//* 213  413:aload_0         
	//* 214  414:aload_1         
	//* 215  415:invokespecial   #144 <Method void closeSilently(Closeable)>
	//* 216  418:goto            324
	//* 217  421:aload           5
	//* 218  423:ldc1            #157 <String "FATAL! Couldn't extract the library from the APK!">
	//* 219  425:invokevirtual   #76  <Method void ReLinkerInstance.log(String)>
	//* 220  428:aload           15
	//* 221  430:ifnull          438
	//* 222  433:aload           15
	//* 223  435:invokevirtual   #77  <Method void ZipFile.close()>
	//* 224  438:return          
	//* 225  439:astore_1        
	//* 226  440:aconst_null     
	//* 227  441:astore          15
	//* 228  443:aload           15
	//* 229  445:ifnull          453
	//* 230  448:aload           15
	//* 231  450:invokevirtual   #77  <Method void ZipFile.close()>
	//* 232  453:aload_1         
	//* 233  454:athrow          
	//* 234  455:astore          14
	//* 235  457:goto            38
	//* 236  460:astore_1        
	//* 237  461:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 238  462:astore_1        
		{
			break MISSING_BLOCK_LABEL_527;
	//  239  463:goto            527
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_527;
		context = ((Context) (zipfile.getInputStream(((java.util.zip.ZipEntry) (context)))));
		obj = ((Object) (new FileOutputStream(file)));
		l = copy(((InputStream) (context)), ((OutputStream) (obj)));
		((FileOutputStream) (obj)).getFD().sync();
		l1 = file.length();
		if(l == l1) goto _L13; else goto _L12
_L12:
		closeSilently(((Closeable) (context)));
_L14:
		closeSilently(((Closeable) (obj)));
		break MISSING_BLOCK_LABEL_527;
_L13:
		closeSilently(((Closeable) (context)));
		closeSilently(((Closeable) (obj)));
		file.setReadable(true, false);
		file.setExecutable(true, false);
		file.setWritable(true);
		if(zipfile == null)
			break MISSING_BLOCK_LABEL_377;
		zipfile.close();
		return;
		as;
		break MISSING_BLOCK_LABEL_392;
		as;
		break MISSING_BLOCK_LABEL_389;
		as;
		context = null;
		obj = null;
		closeSilently(((Closeable) (context)));
		closeSilently(((Closeable) (obj)));
		throw as;
_L21:
		closeSilently(((Closeable) (context)));
		  goto _L14
_L20:
		closeSilently(((Closeable) (context)));
		  goto _L14
_L8:
		relinkerinstance.log("FATAL! Couldn't extract the library from the APK!");
		if(zipfile == null)
			break MISSING_BLOCK_LABEL_438;
		zipfile.close();
		return;
		context;
		zipfile = null;
_L6:
		Object obj1;
		if(zipfile != null)
			try
			{
				zipfile.close();
			}
	//* 240  466:astore_1        
	//* 241  467:goto            519
	//* 242  470:astore_1        
	//* 243  471:goto            511
	//* 244  474:astore          14
	//* 245  476:goto            521
	//* 246  479:astore          14
	//* 247  481:goto            513
	//* 248  484:astore          16
	//* 249  486:goto            413
	//* 250  489:astore          16
	//* 251  491:goto            405
	//* 252  494:astore_1        
	//* 253  495:return          
	//* 254  496:astore_1        
	//* 255  497:return          
			// Misplaced declaration of an exception variable
			catch(String as[]) { }
	//  256  498:astore_2        
		throw context;
		ioexception;
		  goto _L15
		context;
		return;
		context;
		  goto _L16
		context;
		  goto _L17
		ioexception;
		  goto _L18
		ioexception;
		  goto _L19
		obj1;
		  goto _L20
		obj1;
		  goto _L21
		context;
		return;
		context;
		return;
	//* 257  499:goto            453
_L11:
		j++;
	//  258  502:iload           7
	//  259  504:iconst_1        
	//  260  505:iadd            
	//  261  506:istore          7
		  goto _L22
	//* 262  508:goto            98
_L17:
		context = null;
	//  263  511:aconst_null     
	//  264  512:astore_1        
_L19:
		ioexception = null;
	//  265  513:aconst_null     
	//  266  514:astore          14
		  goto _L21
	//* 267  516:goto            405
_L16:
		context = null;
	//  268  519:aconst_null     
	//  269  520:astore_1        
_L18:
		ioexception = null;
	//  270  521:aconst_null     
	//  271  522:astore          14
		  goto _L20
	//* 272  524:goto            413
		i++;
	//  273  527:iload           6
	//  274  529:iconst_1        
	//  275  530:iadd            
	//  276  531:istore          6
		  goto _L23
	//* 277  533:goto            80
	}

	private static final int COPY_BUFFER_SIZE = 4096;
	private static final int MAX_TRIES = 5;
}
