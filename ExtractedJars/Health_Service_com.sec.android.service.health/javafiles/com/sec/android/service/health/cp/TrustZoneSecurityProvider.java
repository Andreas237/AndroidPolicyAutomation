// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.cp;

import android.content.*;
import android.content.pm.*;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import com.sec.android.securestorage.SecureStorage;
import com.sec.android.service.health.cp.accesscontrol.AccesscontrolUtil;
import com.sec.android.service.health.cp.common.AESEncryption;
import com.sec.android.service.health.util.LOG;
import java.io.*;
import java.nio.charset.Charset;
import java.security.*;

public class TrustZoneSecurityProvider extends ContentProvider
{

	public TrustZoneSecurityProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void ContentProvider()>
		mIsTestTrustZoneSupportsOurApp = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #52  <Field int mIsTestTrustZoneSupportsOurApp>
	//    5    9:return          
	}

	private static String byteArrayToHex(byte abyte0[])
	{
		StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
	//    0    0:new             #56  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:iconst_2        
	//    5    7:imul            
	//    6    8:invokespecial   #59  <Method void StringBuilder(int)>
	//    7   11:astore_3        
		int j = abyte0.length;
	//    8   12:aload_0         
	//    9   13:arraylength     
	//   10   14:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   15:iconst_0        
	//*  12   16:istore_1        
	//*  13   17:iload_1         
	//*  14   18:iload_2         
	//*  15   19:icmpge          56
			stringbuilder.append(String.format("%02x ", new Object[] {
				Integer.valueOf(abyte0[i] & 0xff)
			}));
	//   16   22:aload_3         
	//   17   23:ldc1            #61  <String "%02x ">
	//   18   25:iconst_1        
	//   19   26:anewarray       Object[]
	//   20   29:dup             
	//   21   30:iconst_0        
	//   22   31:aload_0         
	//   23   32:iload_1         
	//   24   33:baload          
	//   25   34:sipush          255
	//   26   37:iand            
	//   27   38:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   28   41:aastore         
	//   29   42:invokestatic    #73  <Method String String.format(String, Object[])>
	//   30   45:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   31   48:pop             

	//   32   49:iload_1         
	//   33   50:iconst_1        
	//   34   51:iadd            
	//   35   52:istore_1        
	//*  36   53:goto            17
		return stringbuilder.toString();
	//   37   56:aload_3         
	//   38   57:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   39   60:areturn         
	}

	public static byte[] createTrustZoneSecurePasswd(String s, Context context)
		throws Exception
	{
		Object obj4 = mSyncObject;
	//    0    0:getstatic       #48  <Field Object mSyncObject>
	//    1    3:astore          8
		obj4;
	//    2    5:aload           8
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		Object obj1;
		byte abyte0[];
		LOG.d(TAG, " generate new password");
	//    4    8:getstatic       #39  <Field Class TAG>
	//    5   11:ldc1            #93  <String " generate new password">
	//    6   13:invokestatic    #99  <Method void LOG.d(Class, String)>
		abyte0 = new byte[8];
	//    7   16:bipush          8
	//    8   18:newarray        byte[]
	//    9   20:astore          9
		obj1 = ((Object) (new File("/dev/random")));
	//   10   22:new             #101 <Class File>
	//   11   25:dup             
	//   12   26:ldc1            #103 <String "/dev/random">
	//   13   28:invokespecial   #106 <Method void File(String)>
	//   14   31:astore          5
		Object obj;
		Object obj3;
		obj = null;
	//   15   33:aconst_null     
	//   16   34:astore          4
		obj3 = null;
	//   17   36:aconst_null     
	//   18   37:astore          7
		if(obj1 == null) goto _L2; else goto _L1
	//   19   39:aload           5
	//   20   41:ifnull          159
_L1:
		boolean flag = ((File) (obj1)).exists();
	//   21   44:aload           5
	//   22   46:invokevirtual   #110 <Method boolean File.exists()>
	//   23   49:istore_3        
		if(!flag) goto _L2; else goto _L3
	//   24   50:iload_3         
	//   25   51:ifeq            159
_L3:
		obj1 = ((Object) (new FileInputStream(((File) (obj1)))));
	//   26   54:new             #112 <Class FileInputStream>
	//   27   57:dup             
	//   28   58:aload           5
	//   29   60:invokespecial   #115 <Method void FileInputStream(File)>
	//   30   63:astore          5
		if(((FileInputStream) (obj1)).read(abyte0, 0, 8) != 8)
	//*  31   65:aload           5
	//*  32   67:aload           9
	//*  33   69:iconst_0        
	//*  34   70:bipush          8
	//*  35   72:invokevirtual   #119 <Method int FileInputStream.read(byte[], int, int)>
	//*  36   75:bipush          8
	//*  37   77:icmpeq          200
			throw new Exception("not enough byte read");
	//   38   80:new             #85  <Class Exception>
	//   39   83:dup             
	//   40   84:ldc1            #121 <String "not enough byte read">
	//   41   86:invokespecial   #122 <Method void Exception(String)>
	//   42   89:athrow          
		  goto _L4
		Object obj2;
		obj2;
	//   43   90:astore          6
_L25:
		obj = obj1;
	//   44   92:aload           5
	//   45   94:astore          4
		if(obj2 instanceof FileNotFoundException) goto _L6; else goto _L5
	//   46   96:aload           6
	//   47   98:instanceof      #124 <Class FileNotFoundException>
	//   48  101:ifne            133
_L5:
		obj = obj1;
	//   49  104:aload           5
	//   50  106:astore          4
		if(obj2 instanceof IOException) goto _L6; else goto _L7
	//   51  108:aload           6
	//   52  110:instanceof      #87  <Class IOException>
	//   53  113:ifne            133
_L7:
		obj = obj1;
	//   54  116:aload           5
	//   55  118:astore          4
		if(!"not enough byte read".equals(((Object) (((Exception) (obj2)).getMessage())))) goto _L8; else goto _L6
	//   56  120:ldc1            #121 <String "not enough byte read">
	//   57  122:aload           6
	//   58  124:invokevirtual   #127 <Method String Exception.getMessage()>
	//   59  127:invokevirtual   #131 <Method boolean String.equals(Object)>
	//   60  130:ifeq            252
_L6:
		obj = obj1;
	//   61  133:aload           5
	//   62  135:astore          4
		(new SecureRandom()).nextBytes(abyte0);
	//   63  137:new             #133 <Class SecureRandom>
	//   64  140:dup             
	//   65  141:invokespecial   #134 <Method void SecureRandom()>
	//   66  144:aload           9
	//   67  146:invokevirtual   #138 <Method void SecureRandom.nextBytes(byte[])>
		if(obj1 == null) goto _L2; else goto _L9
	//   68  149:aload           5
	//   69  151:ifnull          159
_L9:
		((FileInputStream) (obj1)).close();
	//   70  154:aload           5
	//   71  156:invokevirtual   #141 <Method void FileInputStream.close()>
_L2:
		int i;
		obj = null;
	//   72  159:aconst_null     
	//   73  160:astore          4
		i = 0;
	//   74  162:iconst_0        
	//   75  163:istore_2        
_L20:
		if(i >= 3) goto _L11; else goto _L10
	//   76  164:iload_2         
	//   77  165:iconst_3        
	//   78  166:icmpge          461
_L10:
		(new SecureStorage()).put(s, abyte0);
	//   79  169:new             #143 <Class SecureStorage>
	//   80  172:dup             
	//   81  173:invokespecial   #144 <Method void SecureStorage()>
	//   82  176:aload_0         
	//   83  177:aload           9
	//   84  179:invokevirtual   #148 <Method boolean SecureStorage.put(String, byte[])>
	//   85  182:pop             
		flag = "com.test.key".equals(((Object) (s)));
	//   86  183:ldc1            #25  <String "com.test.key">
	//   87  185:aload_0         
	//   88  186:invokevirtual   #131 <Method boolean String.equals(Object)>
	//   89  189:istore_3        
		if(!flag) goto _L13; else goto _L12
	//   90  190:iload_3         
	//   91  191:ifeq            343
_L12:
		obj4;
	//   92  194:aload           8
		JVM INSTR monitorexit ;
	//   93  196:monitorexit     
		return abyte0;
	//   94  197:aload           9
	//   95  199:areturn         
_L4:
		if(obj1 == null) goto _L2; else goto _L14
	//   96  200:aload           5
	//   97  202:ifnull          210
_L14:
		((FileInputStream) (obj1)).close();
	//   98  205:aload           5
	//   99  207:invokevirtual   #141 <Method void FileInputStream.close()>
		  goto _L2
	//* 100  210:goto            159
		obj;
	//  101  213:astore          4
		obj1 = ((Object) (TAG));
	//  102  215:getstatic       #39  <Field Class TAG>
	//  103  218:astore          5
		if(((IOException) (obj)).getMessage() == null)
			break MISSING_BLOCK_LABEL_245;
	//  104  220:aload           4
	//  105  222:invokevirtual   #149 <Method String IOException.getMessage()>
	//  106  225:ifnull          245
		obj = ((Object) (((IOException) (obj)).getMessage()));
	//  107  228:aload           4
	//  108  230:invokevirtual   #149 <Method String IOException.getMessage()>
	//  109  233:astore          4
_L15:
		LOG.d(((Class) (obj1)), ((String) (obj)));
	//  110  235:aload           5
	//  111  237:aload           4
	//  112  239:invokestatic    #99  <Method void LOG.d(Class, String)>
		  goto _L2
	//* 113  242:goto            159
		obj = " ";
	//  114  245:ldc1            #151 <String " ">
	//  115  247:astore          4
		  goto _L15
	//* 116  249:goto            235
_L8:
		obj = obj1;
	//  117  252:aload           5
	//  118  254:astore          4
		throw obj2;
	//  119  256:aload           6
	//  120  258:athrow          
		s;
	//  121  259:astore_0        
_L24:
		if(obj == null)
			break MISSING_BLOCK_LABEL_270;
	//  122  260:aload           4
	//  123  262:ifnull          270
		((FileInputStream) (obj)).close();
	//  124  265:aload           4
	//  125  267:invokevirtual   #141 <Method void FileInputStream.close()>
_L16:
		throw s;
	//  126  270:aload_0         
	//  127  271:athrow          
		s;
	//  128  272:astore_0        
		obj4;
	//  129  273:aload           8
		JVM INSTR monitorexit ;
	//  130  275:monitorexit     
		throw s;
	//  131  276:aload_0         
	//  132  277:athrow          
		obj;
	//  133  278:astore          4
		obj1 = ((Object) (TAG));
	//  134  280:getstatic       #39  <Field Class TAG>
	//  135  283:astore          5
		if(((IOException) (obj)).getMessage() == null)
			break MISSING_BLOCK_LABEL_493;
	//  136  285:aload           4
	//  137  287:invokevirtual   #149 <Method String IOException.getMessage()>
	//  138  290:ifnull          493
		obj = ((Object) (((IOException) (obj)).getMessage()));
	//  139  293:aload           4
	//  140  295:invokevirtual   #149 <Method String IOException.getMessage()>
	//  141  298:astore          4
_L26:
		LOG.d(((Class) (obj1)), ((String) (obj)));
	//  142  300:aload           5
	//  143  302:aload           4
	//  144  304:invokestatic    #99  <Method void LOG.d(Class, String)>
		  goto _L2
	//* 145  307:goto            159
		context;
	//  146  310:astore_1        
		obj = ((Object) (TAG));
	//  147  311:getstatic       #39  <Field Class TAG>
	//  148  314:astore          4
		if(((IOException) (context)).getMessage() == null)
			break MISSING_BLOCK_LABEL_337;
	//  149  316:aload_1         
	//  150  317:invokevirtual   #149 <Method String IOException.getMessage()>
	//  151  320:ifnull          337
		context = ((Context) (((IOException) (context)).getMessage()));
	//  152  323:aload_1         
	//  153  324:invokevirtual   #149 <Method String IOException.getMessage()>
	//  154  327:astore_1        
_L17:
		LOG.d(((Class) (obj)), ((String) (context)));
	//  155  328:aload           4
	//  156  330:aload_1         
	//  157  331:invokestatic    #99  <Method void LOG.d(Class, String)>
		  goto _L16
	//* 158  334:goto            270
		context = " ";
	//  159  337:ldc1            #151 <String " ">
	//  160  339:astore_1        
		  goto _L17
	//* 161  340:goto            328
_L13:
		mPasswd = abyte0;
	//  162  343:aload           9
	//  163  345:putstatic       #41  <Field byte[] mPasswd>
		obj = ((Object) (mPasswd));
	//  164  348:getstatic       #41  <Field byte[] mPasswd>
	//  165  351:astore          4
		obj4;
	//  166  353:aload           8
		JVM INSTR monitorexit ;
	//  167  355:monitorexit     
		return ((byte []) (obj));
	//  168  356:aload           4
	//  169  358:areturn         
		obj1;
	//  170  359:astore          5
		obj2 = ((Object) (TAG));
	//  171  361:getstatic       #39  <Field Class TAG>
	//  172  364:astore          6
		if(((com.sec.android.securestorage.SecureStorage.SecureStorageException) (obj1)).getMessage() == null) goto _L19; else goto _L18
	//  173  366:aload           5
	//  174  368:invokevirtual   #152 <Method String com.sec.android.securestorage.SecureStorage$SecureStorageException.getMessage()>
	//  175  371:ifnull          410
_L18:
		obj = ((Object) (((com.sec.android.securestorage.SecureStorage.SecureStorageException) (obj1)).getMessage()));
	//  176  374:aload           5
	//  177  376:invokevirtual   #152 <Method String com.sec.android.securestorage.SecureStorage$SecureStorageException.getMessage()>
	//  178  379:astore          4
_L21:
		LOG.d(((Class) (obj2)), ((String) (obj)));
	//  179  381:aload           6
	//  180  383:aload           4
	//  181  385:invokestatic    #99  <Method void LOG.d(Class, String)>
		context;
	//  182  388:aload_1         
		JVM INSTR monitorenter ;
	//  183  389:monitorenter    
		((Object) (context)).wait(200L);
	//  184  390:aload_1         
	//  185  391:ldc2w           #153 <Long 200L>
	//  186  394:invokevirtual   #158 <Method void Object.wait(long)>
_L22:
		context;
	//  187  397:aload_1         
		JVM INSTR monitorexit ;
	//  188  398:monitorexit     
		obj = obj1;
	//  189  399:aload           5
	//  190  401:astore          4
		i++;
	//  191  403:iload_2         
	//  192  404:iconst_1        
	//  193  405:iadd            
	//  194  406:istore_2        
		  goto _L20
	//* 195  407:goto            164
_L19:
		obj = " ";
	//  196  410:ldc1            #151 <String " ">
	//  197  412:astore          4
		  goto _L21
	//* 198  414:goto            381
		obj;
	//  199  417:astore          4
		obj2 = ((Object) (TAG));
	//  200  419:getstatic       #39  <Field Class TAG>
	//  201  422:astore          6
		if(((InterruptedException) (obj)).getMessage() == null)
			break MISSING_BLOCK_LABEL_454;
	//  202  424:aload           4
	//  203  426:invokevirtual   #159 <Method String InterruptedException.getMessage()>
	//  204  429:ifnull          454
		obj = ((Object) (((InterruptedException) (obj)).getMessage()));
	//  205  432:aload           4
	//  206  434:invokevirtual   #159 <Method String InterruptedException.getMessage()>
	//  207  437:astore          4
_L23:
		LOG.d(((Class) (obj2)), ((String) (obj)));
	//  208  439:aload           6
	//  209  441:aload           4
	//  210  443:invokestatic    #99  <Method void LOG.d(Class, String)>
		  goto _L22
	//* 211  446:goto            397
		s;
	//  212  449:astore_0        
		context;
	//  213  450:aload_1         
		JVM INSTR monitorexit ;
	//  214  451:monitorexit     
		throw s;
	//  215  452:aload_0         
	//  216  453:athrow          
		obj = " ";
	//  217  454:ldc1            #151 <String " ">
	//  218  456:astore          4
		  goto _L23
	//* 219  458:goto            439
_L11:
		if(obj == null)
			break MISSING_BLOCK_LABEL_471;
	//  220  461:aload           4
	//  221  463:ifnull          469
		throw obj;
	//  222  466:aload           4
	//  223  468:athrow          
	//* 224  469:aload           8
		return mPasswd;
	//  225  471:monitorexit     
	//  226  472:getstatic       #41  <Field byte[] mPasswd>
	//  227  475:areturn         
		s;
	//  228  476:astore_0        
		obj = obj1;
	//  229  477:aload           5
	//  230  479:astore          4
		  goto _L24
	//* 231  481:goto            260
		obj2;
	//  232  484:astore          6
		obj1 = ((Object) (obj3));
	//  233  486:aload           7
	//  234  488:astore          5
		  goto _L25
	//* 235  490:goto            92
		obj = " ";
	//  236  493:ldc1            #151 <String " ">
	//  237  495:astore          4
		  goto _L26
	//* 238  497:goto            300
	}

	private String getCallerPackage()
	{
		int i = Binder.getCallingUid();
	//    0    0:invokestatic    #167 <Method int Binder.getCallingUid()>
	//    1    3:istore_1        
		if(i == 0)
	//*   2    4:iload_1         
	//*   3    5:ifne            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return getContext().getPackageManager().getPackagesForUid(i)[0];
	//    6   10:aload_0         
	//    7   11:invokevirtual   #171 <Method Context getContext()>
	//    8   14:invokevirtual   #177 <Method PackageManager Context.getPackageManager()>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #183 <Method String[] PackageManager.getPackagesForUid(int)>
	//   11   21:iconst_0        
	//   12   22:aaload          
	//   13   23:areturn         
	}

	public static byte[] getKeyFromAES()
	{
		LOG.d(TAG, " getAESEncryptSecurePasswd");
	//    0    0:getstatic       #39  <Field Class TAG>
	//    1    3:ldc1            #187 <String " getAESEncryptSecurePasswd">
	//    2    5:invokestatic    #99  <Method void LOG.d(Class, String)>
		return (new AESEncryption()).str.getBytes(Charset.forName("UTF-8"));
	//    3    8:new             #189 <Class AESEncryption>
	//    4   11:dup             
	//    5   12:invokespecial   #190 <Method void AESEncryption()>
	//    6   15:getfield        #193 <Field String AESEncryption.str>
	//    7   18:ldc1            #195 <String "UTF-8">
	//    8   20:invokestatic    #201 <Method Charset Charset.forName(String)>
	//    9   23:invokevirtual   #205 <Method byte[] String.getBytes(Charset)>
	//   10   26:areturn         
	}

	public static byte[] getKeyFromTrustZone(Context context)
		throws Exception
	{
label0:
		{
			synchronized(mSyncObject)
	//*   0    0:getstatic       #48  <Field Object mSyncObject>
	//*   1    3:astore          5
	//*   2    5:aload           5
	//*   3    7:monitorenter    
			{
				if(mPasswd == null)
					break label0;
	//    4    8:getstatic       #41  <Field byte[] mPasswd>
	//    5   11:ifnull          23
				context = ((Context) (mPasswd));
	//    6   14:getstatic       #41  <Field byte[] mPasswd>
	//    7   17:astore_0        
			}
	//    8   18:aload           5
	//    9   20:monitorexit     
			return ((byte []) (context));
	//   10   21:aload_0         
	//   11   22:areturn         
		}
		boolean flag;
		flag = isTrustZonePermissionDeclared(context);
	//   12   23:aload_0         
	//   13   24:invokestatic    #211 <Method boolean isTrustZonePermissionDeclared(Context)>
	//   14   27:istore_2        
		LOG.d(TAG, (new StringBuilder()).append("isTrustZonePermissionDeclared ").append(flag).toString());
	//   15   28:getstatic       #39  <Field Class TAG>
	//   16   31:new             #56  <Class StringBuilder>
	//   17   34:dup             
	//   18   35:invokespecial   #212 <Method void StringBuilder()>
	//   19   38:ldc1            #214 <String "isTrustZonePermissionDeclared ">
	//   20   40:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:iload_2         
	//   22   44:invokevirtual   #217 <Method StringBuilder StringBuilder.append(boolean)>
	//   23   47:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   24   50:invokestatic    #99  <Method void LOG.d(Class, String)>
		if(!flag) goto _L2; else goto _L1
	//   25   53:iload_2         
	//   26   54:ifeq            202
_L1:
		flag = secIsSupported();
	//   27   57:invokestatic    #220 <Method boolean secIsSupported()>
	//   28   60:istore_2        
		if(!flag) goto _L2; else goto _L3
	//   29   61:iload_2         
	//   30   62:ifeq            202
_L3:
		int i;
		Object obj;
		obj = null;
	//   31   65:aconst_null     
	//   32   66:astore_3        
		i = 0;
	//   33   67:iconst_0        
	//   34   68:istore_1        
_L12:
		if(i >= 3)
			break MISSING_BLOCK_LABEL_196;
	//   35   69:iload_1         
	//   36   70:iconst_3        
	//   37   71:icmpge          196
		mPasswd = (new SecureStorage()).getByteArray("com.sec.android.app.shealth");
	//   38   74:new             #143 <Class SecureStorage>
	//   39   77:dup             
	//   40   78:invokespecial   #144 <Method void SecureStorage()>
	//   41   81:ldc1            #28  <String "com.sec.android.app.shealth">
	//   42   83:invokevirtual   #224 <Method byte[] SecureStorage.getByteArray(String)>
	//   43   86:putstatic       #41  <Field byte[] mPasswd>
		obj = ((Object) (mPasswd));
	//   44   89:getstatic       #41  <Field byte[] mPasswd>
	//   45   92:astore_3        
		obj1;
	//   46   93:aload           5
		JVM INSTR monitorexit ;
	//   47   95:monitorexit     
		return ((byte []) (obj));
	//   48   96:aload_3         
	//   49   97:areturn         
		context;
	//   50   98:astore_0        
		obj1;
	//   51   99:aload           5
		JVM INSTR monitorexit ;
	//   52  101:monitorexit     
		throw context;
	//   53  102:aload_0         
	//   54  103:athrow          
		com.sec.android.securestorage.SecureStorage.SecureStorageException securestorageexception;
		securestorageexception;
	//   55  104:astore          4
		Class class1 = TAG;
	//   56  106:getstatic       #39  <Field Class TAG>
	//   57  109:astore          6
		if(securestorageexception.getMessage() == null) goto _L5; else goto _L4
	//   58  111:aload           4
	//   59  113:invokevirtual   #152 <Method String com.sec.android.securestorage.SecureStorage$SecureStorageException.getMessage()>
	//   60  116:ifnull          152
_L4:
		obj = ((Object) (securestorageexception.getMessage()));
	//   61  119:aload           4
	//   62  121:invokevirtual   #152 <Method String com.sec.android.securestorage.SecureStorage$SecureStorageException.getMessage()>
	//   63  124:astore_3        
_L6:
		LOG.d(class1, ((String) (obj)));
	//   64  125:aload           6
	//   65  127:aload_3         
	//   66  128:invokestatic    #99  <Method void LOG.d(Class, String)>
		context;
	//   67  131:aload_0         
		JVM INSTR monitorenter ;
	//   68  132:monitorenter    
		((Object) (context)).wait(200L);
	//   69  133:aload_0         
	//   70  134:ldc2w           #153 <Long 200L>
	//   71  137:invokevirtual   #158 <Method void Object.wait(long)>
_L7:
		context;
	//   72  140:aload_0         
		JVM INSTR monitorexit ;
	//   73  141:monitorexit     
		obj = ((Object) (securestorageexception));
	//   74  142:aload           4
	//   75  144:astore_3        
		i++;
	//   76  145:iload_1         
	//   77  146:iconst_1        
	//   78  147:iadd            
	//   79  148:istore_1        
		continue; /* Loop/switch isn't completed */
	//   80  149:goto            69
_L5:
		obj = " ";
	//   81  152:ldc1            #151 <String " ">
	//   82  154:astore_3        
		  goto _L6
	//*  83  155:goto            125
		obj;
	//   84  158:astore_3        
		class1 = TAG;
	//   85  159:getstatic       #39  <Field Class TAG>
	//   86  162:astore          6
		if(((InterruptedException) (obj)).getMessage() == null)
			break MISSING_BLOCK_LABEL_190;
	//   87  164:aload_3         
	//   88  165:invokevirtual   #159 <Method String InterruptedException.getMessage()>
	//   89  168:ifnull          190
		obj = ((Object) (((InterruptedException) (obj)).getMessage()));
	//   90  171:aload_3         
	//   91  172:invokevirtual   #159 <Method String InterruptedException.getMessage()>
	//   92  175:astore_3        
_L8:
		LOG.d(class1, ((String) (obj)));
	//   93  176:aload           6
	//   94  178:aload_3         
	//   95  179:invokestatic    #99  <Method void LOG.d(Class, String)>
		  goto _L7
	//*  96  182:goto            140
		obj;
	//   97  185:astore_3        
		context;
	//   98  186:aload_0         
		JVM INSTR monitorexit ;
	//   99  187:monitorexit     
		throw obj;
	//  100  188:aload_3         
	//  101  189:athrow          
		obj = " ";
	//  102  190:ldc1            #151 <String " ">
	//  103  192:astore_3        
		  goto _L8
	//* 104  193:goto            176
		if(obj == null) goto _L10; else goto _L9
	//  105  196:aload_3         
	//  106  197:ifnull          214
_L9:
		throw obj;
	//  107  200:aload_3         
	//  108  201:athrow          
_L2:
		LOG.d(TAG, "Returning null pass");
	//  109  202:getstatic       #39  <Field Class TAG>
	//  110  205:ldc1            #226 <String "Returning null pass">
	//  111  207:invokestatic    #99  <Method void LOG.d(Class, String)>
		mPasswd = null;
	//  112  210:aconst_null     
	//  113  211:putstatic       #41  <Field byte[] mPasswd>
_L10:
		context = ((Context) (mPasswd));
	//  114  214:getstatic       #41  <Field byte[] mPasswd>
	//  115  217:astore_0        
		obj1;
	//  116  218:aload           5
		JVM INSTR monitorexit ;
	//  117  220:monitorexit     
		return ((byte []) (context));
	//  118  221:aload_0         
	//  119  222:areturn         
		if(true) goto _L12; else goto _L11
_L11:
	}

	private static boolean isTrustZonePermissionDeclared(Context context)
	{
		boolean flag1;
		LOG.d(TAG, "[+] isTrustZonePermissionDeclared");
	//    0    0:getstatic       #39  <Field Class TAG>
	//    1    3:ldc1            #230 <String "[+] isTrustZonePermissionDeclared">
	//    2    5:invokestatic    #99  <Method void LOG.d(Class, String)>
		flag1 = false;
	//    3    8:iconst_0        
	//    4    9:istore_3        
		context = ((Context) (context.getPackageManager()));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #177 <Method PackageManager Context.getPackageManager()>
	//    7   14:astore_0        
		context = ((Context) (((PackageManager) (context)).getPackageInfo("com.sec.android.service.health", 4096).permissions));
	//    8   15:aload_0         
	//    9   16:ldc1            #18  <String "com.sec.android.service.health">
	//   10   18:sipush          4096
	//   11   21:invokevirtual   #234 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   12   24:getfield        #240 <Field PermissionInfo[] PackageInfo.permissions>
	//   13   27:astore_0        
		boolean flag = flag1;
	//   14   28:iload_3         
	//   15   29:istore_2        
		if(context == null) goto _L2; else goto _L1
	//   16   30:aload_0         
	//   17   31:ifnull          62
_L1:
		int i = 0;
	//   18   34:iconst_0        
	//   19   35:istore_1        
_L6:
		flag = flag1;
	//   20   36:iload_3         
	//   21   37:istore_2        
		if(i >= context.length) goto _L2; else goto _L3
	//   22   38:iload_1         
	//   23   39:aload_0         
	//   24   40:arraylength     
	//   25   41:icmpge          62
_L3:
		flag = "com.sec.android.securestorage.permission.SECURE_STORAGE".equals(((Object) (((PermissionInfo) (context[i])).name)));
	//   26   44:ldc1            #242 <String "com.sec.android.securestorage.permission.SECURE_STORAGE">
	//   27   46:aload_0         
	//   28   47:iload_1         
	//   29   48:aaload          
	//   30   49:getfield        #247 <Field String PermissionInfo.name>
	//   31   52:invokevirtual   #131 <Method boolean String.equals(Object)>
	//   32   55:istore_2        
		if(!flag) goto _L5; else goto _L4
	//   33   56:iload_2         
	//   34   57:ifeq            89
_L4:
		flag = true;
	//   35   60:iconst_1        
	//   36   61:istore_2        
_L2:
		LOG.d(TAG, (new StringBuilder()).append("[-]isTrustZonePermissionDeclared ").append(flag).toString());
	//   37   62:getstatic       #39  <Field Class TAG>
	//   38   65:new             #56  <Class StringBuilder>
	//   39   68:dup             
	//   40   69:invokespecial   #212 <Method void StringBuilder()>
	//   41   72:ldc1            #249 <String "[-]isTrustZonePermissionDeclared ">
	//   42   74:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   43   77:iload_2         
	//   44   78:invokevirtual   #217 <Method StringBuilder StringBuilder.append(boolean)>
	//   45   81:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   46   84:invokestatic    #99  <Method void LOG.d(Class, String)>
		return flag;
	//   47   87:iload_2         
	//   48   88:ireturn         
_L5:
		i++;
	//   49   89:iload_1         
	//   50   90:iconst_1        
	//   51   91:iadd            
	//   52   92:istore_1        
		  goto _L6
	//*  53   93:goto            36
		context;
	//   54   96:astore_0        
		((android.content.pm.PackageManager.NameNotFoundException) (context)).printStackTrace();
	//   55   97:aload_0         
	//   56   98:invokevirtual   #252 <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
		flag = flag1;
	//   57  101:iload_3         
	//   58  102:istore_2        
		  goto _L2
	//*  59  103:goto            62
	}

	private void loggingKeyMd(String s, Bundle bundle)
	{
		if(bundle == null)
			break MISSING_BLOCK_LABEL_61;
	//    0    0:aload_2         
	//    1    1:ifnull          61
		bundle = ((Bundle) (bundle.getByteArray("value_of_password")));
	//    2    4:aload_2         
	//    3    5:ldc2            #258 <String "value_of_password">
	//    4    8:invokevirtual   #261 <Method byte[] Bundle.getByteArray(String)>
	//    5   11:astore_2        
		if(bundle == null)
			break MISSING_BLOCK_LABEL_91;
	//    6   12:aload_2         
	//    7   13:ifnull          91
		MessageDigest messagedigest = MessageDigest.getInstance("MD5");
	//    8   16:ldc2            #263 <String "MD5">
	//    9   19:invokestatic    #269 <Method MessageDigest MessageDigest.getInstance(String)>
	//   10   22:astore_3        
		Log.d("HSCheck", (new StringBuilder()).append(s).append("-").append(byteArrayToHex(messagedigest.digest(((byte []) (bundle))))).toString());
	//   11   23:ldc2            #271 <String "HSCheck">
	//   12   26:new             #56  <Class StringBuilder>
	//   13   29:dup             
	//   14   30:invokespecial   #212 <Method void StringBuilder()>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:ldc2            #273 <String "-">
	//   18   40:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   19   43:aload_3         
	//   20   44:aload_2         
	//   21   45:invokevirtual   #277 <Method byte[] MessageDigest.digest(byte[])>
	//   22   48:invokestatic    #279 <Method String byteArrayToHex(byte[])>
	//   23   51:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   24   54:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   25   57:invokestatic    #284 <Method int Log.d(String, String)>
	//   26   60:pop             
		return;
	//   27   61:return          
		bundle;
	//   28   62:astore_2        
		Log.d("HSCheck", (new StringBuilder()).append(s).append("-fails").toString());
	//   29   63:ldc2            #271 <String "HSCheck">
	//   30   66:new             #56  <Class StringBuilder>
	//   31   69:dup             
	//   32   70:invokespecial   #212 <Method void StringBuilder()>
	//   33   73:aload_1         
	//   34   74:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   35   77:ldc2            #286 <String "-fails">
	//   36   80:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   37   83:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   38   86:invokestatic    #284 <Method int Log.d(String, String)>
	//   39   89:pop             
		return;
	//   40   90:return          
		Log.d("HSCheck", (new StringBuilder()).append(s).append("-null").toString());
	//   41   91:ldc2            #271 <String "HSCheck">
	//   42   94:new             #56  <Class StringBuilder>
	//   43   97:dup             
	//   44   98:invokespecial   #212 <Method void StringBuilder()>
	//   45  101:aload_1         
	//   46  102:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   47  105:ldc2            #288 <String "-null">
	//   48  108:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   49  111:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   50  114:invokestatic    #284 <Method int Log.d(String, String)>
	//   51  117:pop             
		return;
	//   52  118:return          
	}

	private static boolean secIsSupported()
	{
		if(mContext == null)
	//*   0    0:getstatic       #290 <Field Context mContext>
	//*   1    3:ifnonnull       10
			return SecureStorage.isSupported();
	//    2    6:invokestatic    #293 <Method boolean SecureStorage.isSupported()>
	//    3    9:ireturn         
		SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
	//    4   10:getstatic       #290 <Field Context mContext>
	//    5   13:invokestatic    #299 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    6   16:astore_0        
		if(!sharedpreferences.contains("KEY_IS_SECURE_STORAGE_SUPPORTS"))
	//*   7   17:aload_0         
	//*   8   18:ldc1            #10  <String "KEY_IS_SECURE_STORAGE_SUPPORTS">
	//*   9   20:invokeinterface #305 <Method boolean SharedPreferences.contains(String)>
	//*  10   25:ifne            54
		{
			android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
	//   11   28:aload_0         
	//   12   29:invokeinterface #309 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   13   34:astore_1        
			editor.putBoolean("KEY_IS_SECURE_STORAGE_SUPPORTS", SecureStorage.isSupported());
	//   14   35:aload_1         
	//   15   36:ldc1            #10  <String "KEY_IS_SECURE_STORAGE_SUPPORTS">
	//   16   38:invokestatic    #293 <Method boolean SecureStorage.isSupported()>
	//   17   41:invokeinterface #315 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   18   46:pop             
			editor.commit();
	//   19   47:aload_1         
	//   20   48:invokeinterface #318 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   21   53:pop             
		}
		return sharedpreferences.getBoolean("KEY_IS_SECURE_STORAGE_SUPPORTS", false);
	//   22   54:aload_0         
	//   23   55:ldc1            #10  <String "KEY_IS_SECURE_STORAGE_SUPPORTS">
	//   24   57:iconst_0        
	//   25   58:invokeinterface #322 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   26   63:ireturn         
	}

	private boolean testSecureStorageSuportForShealth()
	{
		LOG.d(TAG, "[+] testSecureStorageSuportForShealth");
	//    0    0:getstatic       #39  <Field Class TAG>
	//    1    3:ldc2            #325 <String "[+] testSecureStorageSuportForShealth">
	//    2    6:invokestatic    #99  <Method void LOG.d(Class, String)>
		if(mIsTestTrustZoneSupportsOurApp != -1) goto _L2; else goto _L1
	//    3    9:aload_0         
	//    4   10:getfield        #52  <Field int mIsTestTrustZoneSupportsOurApp>
	//    5   13:iconst_m1       
	//    6   14:icmpne          74
_L1:
		boolean flag;
		try
		{
			createTrustZoneSecurePasswd("com.test.key", getContext());
	//    7   17:ldc1            #25  <String "com.test.key">
	//    8   19:aload_0         
	//    9   20:invokevirtual   #171 <Method Context getContext()>
	//   10   23:invokestatic    #327 <Method byte[] createTrustZoneSecurePasswd(String, Context)>
	//   11   26:pop             
			LOG.d(TAG, " testSecureStorageSuportForShealth is supported ");
	//   12   27:getstatic       #39  <Field Class TAG>
	//   13   30:ldc2            #329 <String " testSecureStorageSuportForShealth is supported ">
	//   14   33:invokestatic    #99  <Method void LOG.d(Class, String)>
			mIsTestTrustZoneSupportsOurApp = 1;
	//   15   36:aload_0         
	//   16   37:iconst_1        
	//   17   38:putfield        #52  <Field int mIsTestTrustZoneSupportsOurApp>
		}
	//*  18   41:iconst_1        
	//*  19   42:istore_1        
	//*  20   43:getstatic       #39  <Field Class TAG>
	//*  21   46:ldc2            #331 <String "[-] testSecureStorageSuportForShealth">
	//*  22   49:invokestatic    #99  <Method void LOG.d(Class, String)>
	//*  23   52:iload_1         
	//*  24   53:ireturn         
		catch(Exception exception)
	//*  25   54:astore_2        
		{
			LOG.d(TAG, " testSecureStorageSuportForShealth exception so not supported");
	//   26   55:getstatic       #39  <Field Class TAG>
	//   27   58:ldc2            #333 <String " testSecureStorageSuportForShealth exception so not supported">
	//   28   61:invokestatic    #99  <Method void LOG.d(Class, String)>
			flag = false;
	//   29   64:iconst_0        
	//   30   65:istore_1        
			mIsTestTrustZoneSupportsOurApp = 0;
	//   31   66:aload_0         
	//   32   67:iconst_0        
	//   33   68:putfield        #52  <Field int mIsTestTrustZoneSupportsOurApp>
			continue; /* Loop/switch isn't completed */
	//   34   71:goto            43
		}
		flag = true;
_L4:
		LOG.d(TAG, "[-] testSecureStorageSuportForShealth");
		return flag;
_L2:
		LOG.d(TAG, (new StringBuilder()).append("[+] testSecureStorageSuportForShealth already tested once and status is ").append(mIsTestTrustZoneSupportsOurApp).toString());
	//   35   74:getstatic       #39  <Field Class TAG>
	//   36   77:new             #56  <Class StringBuilder>
	//   37   80:dup             
	//   38   81:invokespecial   #212 <Method void StringBuilder()>
	//   39   84:ldc2            #335 <String "[+] testSecureStorageSuportForShealth already tested once and status is ">
	//   40   87:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   41   90:aload_0         
	//   42   91:getfield        #52  <Field int mIsTestTrustZoneSupportsOurApp>
	//   43   94:invokevirtual   #338 <Method StringBuilder StringBuilder.append(int)>
	//   44   97:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   45  100:invokestatic    #99  <Method void LOG.d(Class, String)>
		if(mIsTestTrustZoneSupportsOurApp == 1)
	//*  46  103:aload_0         
	//*  47  104:getfield        #52  <Field int mIsTestTrustZoneSupportsOurApp>
	//*  48  107:iconst_1        
	//*  49  108:icmpne          116
			flag = true;
	//   50  111:iconst_1        
	//   51  112:istore_1        
		else
	//*  52  113:goto            43
			flag = false;
	//   53  116:iconst_0        
	//   54  117:istore_1        
		if(true) goto _L4; else goto _L3
	//   55  118:goto            113
_L3:
	}

	public Bundle call(String s, String s1, Bundle bundle)
	{
		LOG.d(TAG, "[+] call");
	//    0    0:getstatic       #39  <Field Class TAG>
	//    1    3:ldc2            #342 <String "[+] call">
	//    2    6:invokestatic    #99  <Method void LOG.d(Class, String)>
		LOG.d(TAG, (new StringBuilder()).append("TZP call. Method: ").append(s).toString());
	//    3    9:getstatic       #39  <Field Class TAG>
	//    4   12:new             #56  <Class StringBuilder>
	//    5   15:dup             
	//    6   16:invokespecial   #212 <Method void StringBuilder()>
	//    7   19:ldc2            #344 <String "TZP call. Method: ">
	//    8   22:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//    9   25:aload_1         
	//   10   26:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   11   29:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   12   32:invokestatic    #99  <Method void LOG.d(Class, String)>
		s1 = ((String) (new Bundle()));
	//   13   35:new             #260 <Class Bundle>
	//   14   38:dup             
	//   15   39:invokespecial   #345 <Method void Bundle()>
	//   16   42:astore_2        
		bundle = ((Bundle) (getCallerPackage()));
	//   17   43:aload_0         
	//   18   44:invokespecial   #347 <Method String getCallerPackage()>
	//   19   47:astore_3        
		if(!AccesscontrolUtil.checkSignature(getContext(), ((String) (bundle)))) goto _L2; else goto _L1
	//   20   48:aload_0         
	//   21   49:invokevirtual   #171 <Method Context getContext()>
	//   22   52:aload_3         
	//   23   53:invokestatic    #353 <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
	//   24   56:ifeq            409
_L1:
		LOG.d(TAG, (new StringBuilder()).append("TZP call. Signature Pass. packageName: ").append(((String) (bundle))).toString());
	//   25   59:getstatic       #39  <Field Class TAG>
	//   26   62:new             #56  <Class StringBuilder>
	//   27   65:dup             
	//   28   66:invokespecial   #212 <Method void StringBuilder()>
	//   29   69:ldc2            #355 <String "TZP call. Signature Pass. packageName: ">
	//   30   72:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   31   75:aload_3         
	//   32   76:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   33   79:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   34   82:invokestatic    #99  <Method void LOG.d(Class, String)>
		if(!s.equals("get_secure_password")) goto _L4; else goto _L3
	//   35   85:aload_1         
	//   36   86:ldc2            #357 <String "get_secure_password">
	//   37   89:invokevirtual   #131 <Method boolean String.equals(Object)>
	//   38   92:ifeq            169
_L3:
		try
		{
			((Bundle) (s1)).putByteArray("value_of_password", getKeyFromTrustZone(getContext()));
	//   39   95:aload_2         
	//   40   96:ldc2            #258 <String "value_of_password">
	//   41   99:aload_0         
	//   42  100:invokevirtual   #171 <Method Context getContext()>
	//   43  103:invokestatic    #359 <Method byte[] getKeyFromTrustZone(Context)>
	//   44  106:invokevirtual   #363 <Method void Bundle.putByteArray(String, byte[])>
		}
	//*  45  109:aload_0         
	//*  46  110:ldc2            #365 <String "SS_G">
	//*  47  113:aload_2         
	//*  48  114:invokespecial   #367 <Method void loggingKeyMd(String, Bundle)>
	//*  49  117:getstatic       #39  <Field Class TAG>
	//*  50  120:ldc2            #369 <String "[-] call">
	//*  51  123:invokestatic    #99  <Method void LOG.d(Class, String)>
	//*  52  126:aload_2         
	//*  53  127:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  54  128:astore_1        
		{
			LOG.d(TAG, (new StringBuilder()).append("Error in getting Trustzone password : ").append(((Exception) (s)).getMessage()).toString());
	//   55  129:getstatic       #39  <Field Class TAG>
	//   56  132:new             #56  <Class StringBuilder>
	//   57  135:dup             
	//   58  136:invokespecial   #212 <Method void StringBuilder()>
	//   59  139:ldc2            #371 <String "Error in getting Trustzone password : ">
	//   60  142:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   61  145:aload_1         
	//   62  146:invokevirtual   #127 <Method String Exception.getMessage()>
	//   63  149:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   64  152:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   65  155:invokestatic    #99  <Method void LOG.d(Class, String)>
			((Bundle) (s1)).putByteArray("value_of_password", ((byte []) (null)));
	//   66  158:aload_2         
	//   67  159:ldc2            #258 <String "value_of_password">
	//   68  162:aconst_null     
	//   69  163:invokevirtual   #363 <Method void Bundle.putByteArray(String, byte[])>
		}
		loggingKeyMd("SS_G", ((Bundle) (s1)));
_L5:
		LOG.d(TAG, "[-] call");
		return ((Bundle) (s1));
	//*  70  166:goto            109
_L4:
		if(s.equals("create_secure_password"))
	//*  71  169:aload_1         
	//*  72  170:ldc2            #373 <String "create_secure_password">
	//*  73  173:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  74  176:ifeq            247
		{
			try
			{
				((Bundle) (s1)).putByteArray("value_of_password", createTrustZoneSecurePasswd("com.sec.android.app.shealth", getContext()));
	//   75  179:aload_2         
	//   76  180:ldc2            #258 <String "value_of_password">
	//   77  183:ldc1            #28  <String "com.sec.android.app.shealth">
	//   78  185:aload_0         
	//   79  186:invokevirtual   #171 <Method Context getContext()>
	//   80  189:invokestatic    #327 <Method byte[] createTrustZoneSecurePasswd(String, Context)>
	//   81  192:invokevirtual   #363 <Method void Bundle.putByteArray(String, byte[])>
			}
	//*  82  195:aload_0         
	//*  83  196:ldc2            #375 <String "SS_C">
	//*  84  199:aload_2         
	//*  85  200:invokespecial   #367 <Method void loggingKeyMd(String, Bundle)>
	//*  86  203:goto            117
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  87  206:astore_1        
			{
				LOG.d(TAG, (new StringBuilder()).append("Error in getting Trustzone password : ").append(((Exception) (s)).getMessage()).toString());
	//   88  207:getstatic       #39  <Field Class TAG>
	//   89  210:new             #56  <Class StringBuilder>
	//   90  213:dup             
	//   91  214:invokespecial   #212 <Method void StringBuilder()>
	//   92  217:ldc2            #371 <String "Error in getting Trustzone password : ">
	//   93  220:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   94  223:aload_1         
	//   95  224:invokevirtual   #127 <Method String Exception.getMessage()>
	//   96  227:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   97  230:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   98  233:invokestatic    #99  <Method void LOG.d(Class, String)>
				((Bundle) (s1)).putByteArray("value_of_password", ((byte []) (null)));
	//   99  236:aload_2         
	//  100  237:ldc2            #258 <String "value_of_password">
	//  101  240:aconst_null     
	//  102  241:invokevirtual   #363 <Method void Bundle.putByteArray(String, byte[])>
			}
			loggingKeyMd("SS_C", ((Bundle) (s1)));
		} else
	//* 103  244:goto            195
		if(s.equals("get_aes_password"))
	//* 104  247:aload_1         
	//* 105  248:ldc2            #377 <String "get_aes_password">
	//* 106  251:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 107  254:ifeq            319
		{
			try
			{
				((Bundle) (s1)).putByteArray("value_of_password", getKeyFromAES());
	//  108  257:aload_2         
	//  109  258:ldc2            #258 <String "value_of_password">
	//  110  261:invokestatic    #379 <Method byte[] getKeyFromAES()>
	//  111  264:invokevirtual   #363 <Method void Bundle.putByteArray(String, byte[])>
			}
	//* 112  267:aload_0         
	//* 113  268:ldc2            #381 <String "AP">
	//* 114  271:aload_2         
	//* 115  272:invokespecial   #367 <Method void loggingKeyMd(String, Bundle)>
	//* 116  275:goto            117
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 117  278:astore_1        
			{
				LOG.d(TAG, (new StringBuilder()).append("Error in getting Trustzone password : ").append(((Exception) (s)).getMessage()).toString());
	//  118  279:getstatic       #39  <Field Class TAG>
	//  119  282:new             #56  <Class StringBuilder>
	//  120  285:dup             
	//  121  286:invokespecial   #212 <Method void StringBuilder()>
	//  122  289:ldc2            #371 <String "Error in getting Trustzone password : ">
	//  123  292:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  124  295:aload_1         
	//  125  296:invokevirtual   #127 <Method String Exception.getMessage()>
	//  126  299:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  127  302:invokevirtual   #81  <Method String StringBuilder.toString()>
	//  128  305:invokestatic    #99  <Method void LOG.d(Class, String)>
				((Bundle) (s1)).putByteArray("value_of_password", ((byte []) (null)));
	//  129  308:aload_2         
	//  130  309:ldc2            #258 <String "value_of_password">
	//  131  312:aconst_null     
	//  132  313:invokevirtual   #363 <Method void Bundle.putByteArray(String, byte[])>
			}
			loggingKeyMd("AP", ((Bundle) (s1)));
		} else
	//* 133  316:goto            267
		if(s.equals("secure_storage_support"))
	//* 134  319:aload_1         
	//* 135  320:ldc2            #383 <String "secure_storage_support">
	//* 136  323:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 137  326:ifeq            117
		{
			boolean flag1 = false;
	//  138  329:iconst_0        
	//  139  330:istore          5
			boolean flag = flag1;
	//  140  332:iload           5
	//  141  334:istore          4
			if(isTrustZonePermissionDeclared(getContext()))
	//* 142  336:aload_0         
	//* 143  337:invokevirtual   #171 <Method Context getContext()>
	//* 144  340:invokestatic    #211 <Method boolean isTrustZonePermissionDeclared(Context)>
	//* 145  343:ifeq            370
			{
				flag = flag1;
	//  146  346:iload           5
	//  147  348:istore          4
				if(secIsSupported())
	//* 148  350:invokestatic    #220 <Method boolean secIsSupported()>
	//* 149  353:ifeq            370
				{
					flag = flag1;
	//  150  356:iload           5
	//  151  358:istore          4
					if(testSecureStorageSuportForShealth())
	//* 152  360:aload_0         
	//* 153  361:invokespecial   #385 <Method boolean testSecureStorageSuportForShealth()>
	//* 154  364:ifeq            370
						flag = true;
	//  155  367:iconst_1        
	//  156  368:istore          4
				}
			}
			LOG.d(TAG, (new StringBuilder()).append("KEY_IS_SECURE_STORAGE_SUPPORTS ").append(flag).toString());
	//  157  370:getstatic       #39  <Field Class TAG>
	//  158  373:new             #56  <Class StringBuilder>
	//  159  376:dup             
	//  160  377:invokespecial   #212 <Method void StringBuilder()>
	//  161  380:ldc2            #387 <String "KEY_IS_SECURE_STORAGE_SUPPORTS ">
	//  162  383:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  163  386:iload           4
	//  164  388:invokevirtual   #217 <Method StringBuilder StringBuilder.append(boolean)>
	//  165  391:invokevirtual   #81  <Method String StringBuilder.toString()>
	//  166  394:invokestatic    #99  <Method void LOG.d(Class, String)>
			((Bundle) (s1)).putBoolean("boolean_secure_storage_support", flag);
	//  167  397:aload_2         
	//  168  398:ldc2            #389 <String "boolean_secure_storage_support">
	//  169  401:iload           4
	//  170  403:invokevirtual   #392 <Method void Bundle.putBoolean(String, boolean)>
		}
		if(true) goto _L5; else goto _L2
	//  171  406:goto            117
_L2:
		LOG.e(TAG, (new StringBuilder()).append("Call API not Availiable for the caller's signature, caller package : ").append(getCallerPackage()).toString());
	//  172  409:getstatic       #39  <Field Class TAG>
	//  173  412:new             #56  <Class StringBuilder>
	//  174  415:dup             
	//  175  416:invokespecial   #212 <Method void StringBuilder()>
	//  176  419:ldc2            #394 <String "Call API not Availiable for the caller's signature, caller package : ">
	//  177  422:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  178  425:aload_0         
	//  179  426:invokespecial   #347 <Method String getCallerPackage()>
	//  180  429:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  181  432:invokevirtual   #81  <Method String StringBuilder.toString()>
	//  182  435:invokestatic    #397 <Method void LOG.e(Class, String)>
		throw new SecurityException("Call API is not Availiable for your app");
	//  183  438:new             #399 <Class SecurityException>
	//  184  441:dup             
	//  185  442:ldc2            #401 <String "Call API is not Availiable for your app">
	//  186  445:invokespecial   #402 <Method void SecurityException(String)>
	//  187  448:athrow          
	}

	public int delete(Uri uri, String s, String as[])
	{
		LOG.d(TAG, "In delete Uri call");
	//    0    0:getstatic       #39  <Field Class TAG>
	//    1    3:ldc2            #406 <String "In delete Uri call">
	//    2    6:invokestatic    #99  <Method void LOG.d(Class, String)>
		return 0;
	//    3    9:iconst_0        
	//    4   10:ireturn         
	}

	public String getType(Uri uri)
	{
		LOG.d(TAG, "In getType call");
	//    0    0:getstatic       #39  <Field Class TAG>
	//    1    3:ldc2            #410 <String "In getType call">
	//    2    6:invokestatic    #99  <Method void LOG.d(Class, String)>
		return null;
	//    3    9:aconst_null     
	//    4   10:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		LOG.d(TAG, "In insert call");
	//    0    0:getstatic       #39  <Field Class TAG>
	//    1    3:ldc2            #414 <String "In insert call">
	//    2    6:invokestatic    #99  <Method void LOG.d(Class, String)>
		return null;
	//    3    9:aconst_null     
	//    4   10:areturn         
	}

	public boolean onCreate()
	{
		LOG.setLogger();
	//    0    0:invokestatic    #418 <Method void LOG.setLogger()>
		LOG.d(TAG, "In onCreate call");
	//    1    3:getstatic       #39  <Field Class TAG>
	//    2    6:ldc2            #420 <String "In onCreate call">
	//    3    9:invokestatic    #99  <Method void LOG.d(Class, String)>
		mContext = getContext();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #171 <Method Context getContext()>
	//    6   16:putstatic       #290 <Field Context mContext>
		return true;
	//    7   19:iconst_1        
	//    8   20:ireturn         
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		LOG.d(TAG, "In query call");
	//    0    0:getstatic       #39  <Field Class TAG>
	//    1    3:ldc2            #424 <String "In query call">
	//    2    6:invokestatic    #99  <Method void LOG.d(Class, String)>
		return null;
	//    3    9:aconst_null     
	//    4   10:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		LOG.d(TAG, "In update call");
	//    0    0:getstatic       #39  <Field Class TAG>
	//    1    3:ldc2            #428 <String "In update call">
	//    2    6:invokestatic    #99  <Method void LOG.d(Class, String)>
		return 0;
	//    3    9:iconst_0        
	//    4   10:ireturn         
	}

	private static final boolean IS_SECURE_STORAGE_ENABLED = true;
	private static final String KEY_IS_SECURE_STORAGE_SUPPORTS = "KEY_IS_SECURE_STORAGE_SUPPORTS";
	private static final int NOT_SUPPORTED = 0;
	private static final int NOT_TESTED = -1;
	public static final String PKG_NAME = "com.sec.android.service.health";
	private static final int SUPPORTED = 1;
	private static final Class TAG = com/sec/android/service/health/cp/TrustZoneSecurityProvider;
	private static final String TEST_TRUST_KEY = "com.test.key";
	public static final String TRUST_KEY = "com.sec.android.app.shealth";
	private static Context mContext;
	private static byte mPasswd[] = null;
	private static Object mSyncObject = new Object();
	private int mIsTestTrustZoneSupportsOurApp;

	static 
	{
	//    0    0:ldc1            #2   <Class TrustZoneSecurityProvider>
	//    1    2:putstatic       #39  <Field Class TAG>
	//    2    5:aconst_null     
	//    3    6:putstatic       #41  <Field byte[] mPasswd>
	//    4    9:new             #43  <Class Object>
	//    5   12:dup             
	//    6   13:invokespecial   #46  <Method void Object()>
	//    7   16:putstatic       #48  <Field Object mSyncObject>
	//*   8   19:return          
	}
}
