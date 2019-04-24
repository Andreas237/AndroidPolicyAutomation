// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.content.c;
import com.irobot.home.IRobotApplication;
import com.irobot.home.o.b.a;
import com.irobot.home.util.o;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;

public class RobotUploadService extends IntentService
{

	public RobotUploadService()
	{
		super("RobotUploadService");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "RobotUploadService">
	//    2    3:invokespecial   #14  <Method void IntentService(String)>
	//    3    6:return          
	}

	public static void a(Context context, String s, int i)
	{
		Intent intent = new Intent(context, com/irobot/home/service/RobotUploadService);
	//    0    0:new             #18  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class RobotUploadService>
	//    4    7:invokespecial   #21  <Method void Intent(Context, Class)>
	//    5   10:astore_3        
		intent.setAction("com.irobot.home.service.action.LOCAL_OTA_UPLOAD_FILE");
	//    6   11:aload_3         
	//    7   12:ldc1            #23  <String "com.irobot.home.service.action.LOCAL_OTA_UPLOAD_FILE">
	//    8   14:invokevirtual   #27  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		intent.putExtra("com.irobot.home.service.extra.ROBOT_BLID", s);
	//   10   18:aload_3         
	//   11   19:ldc1            #29  <String "com.irobot.home.service.extra.ROBOT_BLID">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #33  <Method Intent Intent.putExtra(String, String)>
	//   14   25:pop             
		intent.putExtra("com.irobot.home.service.extra.PACKAGE_RES_ID", i);
	//   15   26:aload_3         
	//   16   27:ldc1            #35  <String "com.irobot.home.service.extra.PACKAGE_RES_ID">
	//   17   29:iload_2         
	//   18   30:invokevirtual   #38  <Method Intent Intent.putExtra(String, int)>
	//   19   33:pop             
		context.startService(intent);
	//   20   34:aload_0         
	//   21   35:aload_3         
	//   22   36:invokevirtual   #44  <Method android.content.ComponentName Context.startService(Intent)>
	//   23   39:pop             
	//   24   40:return          
	}

	public static void a(Context context, String s, String s1)
	{
		Intent intent = new Intent(context, com/irobot/home/service/RobotUploadService);
	//    0    0:new             #18  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class RobotUploadService>
	//    4    7:invokespecial   #21  <Method void Intent(Context, Class)>
	//    5   10:astore_3        
		intent.setAction("com.irobot.home.service.action.LOCAL_OTA_UPLOAD_FILE");
	//    6   11:aload_3         
	//    7   12:ldc1            #23  <String "com.irobot.home.service.action.LOCAL_OTA_UPLOAD_FILE">
	//    8   14:invokevirtual   #27  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		intent.putExtra("com.irobot.home.service.extra.ROBOT_BLID", s);
	//   10   18:aload_3         
	//   11   19:ldc1            #29  <String "com.irobot.home.service.extra.ROBOT_BLID">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #33  <Method Intent Intent.putExtra(String, String)>
	//   14   25:pop             
		intent.putExtra("com.irobot.home.service.extra.PACKAGE_URL", s1);
	//   15   26:aload_3         
	//   16   27:ldc1            #47  <String "com.irobot.home.service.extra.PACKAGE_URL">
	//   17   29:aload_2         
	//   18   30:invokevirtual   #33  <Method Intent Intent.putExtra(String, String)>
	//   19   33:pop             
		context.startService(intent);
	//   20   34:aload_0         
	//   21   35:aload_3         
	//   22   36:invokevirtual   #44  <Method android.content.ComponentName Context.startService(Intent)>
	//   23   39:pop             
	//   24   40:return          
	}

	public static void a(IRobotApplication irobotapplication)
	{
		if(a == null)
	//*   0    0:getstatic       #50  <Field WeakReference a>
	//*   1    3:ifnonnull       17
			a = new WeakReference(((Object) (irobotapplication)));
	//    2    6:new             #52  <Class WeakReference>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #55  <Method void WeakReference(Object)>
	//    6   14:putstatic       #50  <Field WeakReference a>
	//    7   17:return          
	}

	public static void a(String s)
	{
		if(a != null)
	//*   0    0:getstatic       #50  <Field WeakReference a>
	//*   1    3:ifnull          48
		{
			Context context = (Context)a.get();
	//    2    6:getstatic       #50  <Field WeakReference a>
	//    3    9:invokevirtual   #59  <Method Object WeakReference.get()>
	//    4   12:checkcast       #40  <Class Context>
	//    5   15:astore_1        
			Intent intent = new Intent(context, com/irobot/home/service/RobotUploadService);
	//    6   16:new             #18  <Class Intent>
	//    7   19:dup             
	//    8   20:aload_1         
	//    9   21:ldc1            #2   <Class RobotUploadService>
	//   10   23:invokespecial   #21  <Method void Intent(Context, Class)>
	//   11   26:astore_2        
			intent.setAction("com.irobot.home.service.action.OTA_UPDATE_BRAAVA");
	//   12   27:aload_2         
	//   13   28:ldc1            #61  <String "com.irobot.home.service.action.OTA_UPDATE_BRAAVA">
	//   14   30:invokevirtual   #27  <Method Intent Intent.setAction(String)>
	//   15   33:pop             
			intent.putExtra("com.irobot.home.service.extra.PACKAGE_URL", s);
	//   16   34:aload_2         
	//   17   35:ldc1            #47  <String "com.irobot.home.service.extra.PACKAGE_URL">
	//   18   37:aload_0         
	//   19   38:invokevirtual   #33  <Method Intent Intent.putExtra(String, String)>
	//   20   41:pop             
			context.startService(intent);
	//   21   42:aload_1         
	//   22   43:aload_2         
	//   23   44:invokevirtual   #44  <Method android.content.ComponentName Context.startService(Intent)>
	//   24   47:pop             
		}
	//   25   48:return          
	}

	private void a(String s, int i)
	{
		if(i == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            5
			return;
	//    2    4:return          
		InputStream inputstream = getResources().openRawResource(i);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #66  <Method Resources getResources()>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #72  <Method InputStream Resources.openRawResource(int)>
	//    7   13:astore_3        
		if(inputstream == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       26
		{
			o.e("RobotUploadService", "Could not open local OTA firmware package file");
	//   10   18:ldc1            #11  <String "RobotUploadService">
	//   11   20:ldc1            #74  <String "Could not open local OTA firmware package file">
	//   12   22:invokestatic    #80  <Method void o.e(String, String)>
			return;
	//   13   25:return          
		} else
		{
			a(s, inputstream);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_3         
	//   17   29:invokespecial   #83  <Method void a(String, InputStream)>
			return;
	//   18   32:return          
		}
	}

	private void a(String s, InputStream inputstream)
	{
		b(s, "prepareStarting");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #87  <String "prepareStarting">
	//    3    4:invokespecial   #90  <Method void b(String, String)>
		int i = com.irobot.home.o.b.a.a(s).a();
	//    4    7:aload_1         
	//    5    8:invokestatic    #95  <Method a a.a(String)>
	//    6   11:invokevirtual   #98  <Method int a.a()>
	//    7   14:istore_3        
		String s1;
		if(i == 200)
	//*   8   15:iload_3         
	//*   9   16:sipush          200
	//*  10   19:icmpne          29
			s1 = "prepareFinished";
	//   11   22:ldc1            #100 <String "prepareFinished">
	//   12   24:astore          4
		else
	//*  13   26:goto            33
			s1 = "prepareFailed";
	//   14   29:ldc1            #102 <String "prepareFailed">
	//   15   31:astore          4
		b(s, s1);
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:aload           4
	//   19   37:invokespecial   #90  <Method void b(String, String)>
		if(i == 200)
	//*  20   40:iload_3         
	//*  21   41:sipush          200
	//*  22   44:icmpne          86
		{
			b(s, "uploadStarting");
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:ldc1            #104 <String "uploadStarting">
	//   26   51:invokespecial   #90  <Method void b(String, String)>
			String s2;
			if(com.irobot.home.o.b.a.a(s).a(inputstream) == 200)
	//*  27   54:aload_1         
	//*  28   55:invokestatic    #95  <Method a a.a(String)>
	//*  29   58:aload_2         
	//*  30   59:invokevirtual   #107 <Method int a.a(InputStream)>
	//*  31   62:sipush          200
	//*  32   65:icmpne          75
				s2 = "uploadFinished";
	//   33   68:ldc1            #109 <String "uploadFinished">
	//   34   70:astore          4
			else
	//*  35   72:goto            79
				s2 = "uploadFailed";
	//   36   75:ldc1            #111 <String "uploadFailed">
	//   37   77:astore          4
			b(s, s2);
	//   38   79:aload_0         
	//   39   80:aload_1         
	//   40   81:aload           4
	//   41   83:invokespecial   #90  <Method void b(String, String)>
		}
		try
		{
			inputstream.close();
	//   42   86:aload_2         
	//   43   87:invokevirtual   #116 <Method void InputStream.close()>
			return;
	//   44   90:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  45   91:astore_1        
		{
			inputstream = ((InputStream) (new StringBuilder()));
	//   46   92:new             #118 <Class StringBuilder>
	//   47   95:dup             
	//   48   96:invokespecial   #120 <Method void StringBuilder()>
	//   49   99:astore_2        
		}
		((StringBuilder) (inputstream)).append("Failed to close the package stream: ");
	//   50  100:aload_2         
	//   51  101:ldc1            #122 <String "Failed to close the package stream: ">
	//   52  103:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   53  106:pop             
		((StringBuilder) (inputstream)).append(((IOException) (s)).getMessage());
	//   54  107:aload_2         
	//   55  108:aload_1         
	//   56  109:invokevirtual   #130 <Method String IOException.getMessage()>
	//   57  112:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   58  115:pop             
		o.e("RobotUploadService", ((StringBuilder) (inputstream)).toString());
	//   59  116:ldc1            #11  <String "RobotUploadService">
	//   60  118:aload_2         
	//   61  119:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   62  122:invokestatic    #80  <Method void o.e(String, String)>
	//   63  125:return          
	}

	private void a(String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Object obj = ((Object) ((HttpURLConnection)(new URL(s1)).openConnection()));
	//    3    5:new             #137 <Class URL>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #138 <Method void URL(String)>
	//    7   13:invokevirtual   #142 <Method java.net.URLConnection URL.openConnection()>
	//    8   16:checkcast       #144 <Class HttpURLConnection>
	//    9   19:astore          6
		int i;
		int j;
		int k;
		Object obj1;
		Object obj2;
		Object obj3;
		Object obj4;
		Object obj5;
		Object obj6;
		Object obj7;
		byte abyte0[];
		Object obj8;
		Object obj9;
		try
		{
			((HttpURLConnection) (obj)).connect();
	//   10   21:aload           6
	//   11   23:invokevirtual   #147 <Method void HttpURLConnection.connect()>
			obj1 = ((Object) (((HttpURLConnection) (obj)).getInputStream()));
	//   12   26:aload           6
	//   13   28:invokevirtual   #151 <Method InputStream HttpURLConnection.getInputStream()>
	//   14   31:astore          7
		}
	//*  15   33:aload_2         
	//*  16   34:invokestatic    #157 <Method Uri Uri.parse(String)>
	//*  17   37:invokevirtual   #160 <Method String Uri.getLastPathSegment()>
	//*  18   40:astore          8
	//*  19   42:aload           8
	//*  20   44:ifnull          253
	//*  21   47:aload           8
	//*  22   49:aconst_null     
	//*  23   50:invokestatic    #166 <Method File File.createTempFile(String, String)>
	//*  24   53:astore          10
	//*  25   55:new             #168 <Class FileOutputStream>
	//*  26   58:dup             
	//*  27   59:aload           10
	//*  28   61:invokespecial   #171 <Method void FileOutputStream(File)>
	//*  29   64:astore          11
	//*  30   66:aload           6
	//*  31   68:astore          9
	//*  32   70:aload           7
	//*  33   72:astore          12
	//*  34   74:aload           11
	//*  35   76:astore          13
	//*  36   78:aload           6
	//*  37   80:invokevirtual   #174 <Method int HttpURLConnection.getContentLength()>
	//*  38   83:istore          4
	//*  39   85:aload           6
	//*  40   87:astore          9
	//*  41   89:aload           7
	//*  42   91:astore          12
	//*  43   93:aload           11
	//*  44   95:astore          13
	//*  45   97:sipush          4096
	//*  46  100:newarray        byte[]
	//*  47  102:astore          14
	//*  48  104:iconst_0        
	//*  49  105:istore_3        
	//*  50  106:aload           6
	//*  51  108:astore          9
	//*  52  110:aload           7
	//*  53  112:astore          12
	//*  54  114:aload           11
	//*  55  116:astore          13
	//*  56  118:aload           7
	//*  57  120:aload           14
	//*  58  122:invokevirtual   #178 <Method int InputStream.read(byte[])>
	//*  59  125:istore          5
	//*  60  127:aload           10
	//*  61  129:astore          8
	//*  62  131:aload           11
	//*  63  133:astore          9
	//*  64  135:iload           5
	//*  65  137:iconst_m1       
	//*  66  138:icmpeq          259
	//*  67  141:iload_3         
	//*  68  142:iload           5
	//*  69  144:iadd            
	//*  70  145:istore_3        
	//*  71  146:aload           6
	//*  72  148:astore          9
	//*  73  150:aload           7
	//*  74  152:astore          12
	//*  75  154:aload           11
	//*  76  156:astore          13
	//*  77  158:ldc1            #11  <String "RobotUploadService">
	//*  78  160:getstatic       #184 <Field Locale Locale.US>
	//*  79  163:ldc1            #186 <String "Read %d of %d bytes">
	//*  80  165:iconst_2        
	//*  81  166:anewarray       Object[]
	//*  82  169:dup             
	//*  83  170:iconst_0        
	//*  84  171:iload_3         
	//*  85  172:invokestatic    #194 <Method Integer Integer.valueOf(int)>
	//*  86  175:aastore         
	//*  87  176:dup             
	//*  88  177:iconst_1        
	//*  89  178:iload           4
	//*  90  180:invokestatic    #194 <Method Integer Integer.valueOf(int)>
	//*  91  183:aastore         
	//*  92  184:invokestatic    #200 <Method String String.format(Locale, String, Object[])>
	//*  93  187:invokestatic    #201 <Method void o.b(String, String)>
	//*  94  190:aload           6
	//*  95  192:astore          9
	//*  96  194:aload           7
	//*  97  196:astore          12
	//*  98  198:aload           11
	//*  99  200:astore          13
	//* 100  202:aload           11
	//* 101  204:aload           14
	//* 102  206:iconst_0        
	//* 103  207:iload           5
	//* 104  209:invokevirtual   #205 <Method void FileOutputStream.write(byte[], int, int)>
	//* 105  212:goto            106
	//* 106  215:astore          15
	//* 107  217:aload           6
	//* 108  219:astore          8
	//* 109  221:aload           7
	//* 110  223:astore          14
	//* 111  225:aload           10
	//* 112  227:astore          7
	//* 113  229:aload           11
	//* 114  231:astore          6
	//* 115  233:goto            389
	//* 116  236:astore          9
	//* 117  238:aload           6
	//* 118  240:astore          8
	//* 119  242:aload           7
	//* 120  244:astore          14
	//* 121  246:aload           10
	//* 122  248:astore          7
	//* 123  250:goto            382
	//* 124  253:aconst_null     
	//* 125  254:astore          8
	//* 126  256:aconst_null     
	//* 127  257:astore          9
	//* 128  259:aload           7
	//* 129  261:ifnull          272
	//* 130  264:aload           7
	//* 131  266:invokevirtual   #116 <Method void InputStream.close()>
	//* 132  269:goto            272
	//* 133  272:aload           9
	//* 134  274:ifnull          295
	//* 135  277:aload           9
	//* 136  279:invokevirtual   #206 <Method void FileOutputStream.close()>
	//* 137  282:goto            295
	//* 138  285:ldc1            #11  <String "RobotUploadService">
	//* 139  287:aload           7
	//* 140  289:invokevirtual   #130 <Method String IOException.getMessage()>
	//* 141  292:invokestatic    #80  <Method void o.e(String, String)>
	//* 142  295:aload           8
	//* 143  297:astore          10
	//* 144  299:aload           9
	//* 145  301:astore          11
	//* 146  303:aload           6
	//* 147  305:ifnull          467
	//* 148  308:aload           8
	//* 149  310:astore          7
	//* 150  312:aload           6
	//* 151  314:astore          8
	//* 152  316:aload           8
	//* 153  318:invokevirtual   #209 <Method void HttpURLConnection.disconnect()>
	//* 154  321:aload           7
	//* 155  323:astore          10
	//* 156  325:aload           9
	//* 157  327:astore          11
	//* 158  329:goto            467
	//* 159  332:astore_1        
	//* 160  333:goto            361
	//* 161  336:astore          9
	//* 162  338:aload           7
	//* 163  340:astore          14
	//* 164  342:goto            375
	//* 165  345:astore_1        
	//* 166  346:goto            358
		// Misplaced declaration of an exception variable
		catch(Object obj3)
	//* 167  349:astore          9
		{
			break MISSING_BLOCK_LABEL_372;
	//  168  351:goto            372
		}
		try
		{
			obj2 = ((Object) (Uri.parse(s1).getLastPathSegment()));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj3)
		{
			obj8 = obj1;
			break MISSING_BLOCK_LABEL_375;
		}
		if(obj2 == null) goto _L2; else goto _L1
_L1:
		obj4 = ((Object) (File.createTempFile(((String) (obj2)), ((String) (null)))));
		obj5 = ((Object) (new FileOutputStream(((File) (obj4)))));
		obj3 = obj;
		obj6 = obj1;
		obj7 = obj5;
		j = ((HttpURLConnection) (obj)).getContentLength();
		obj3 = obj;
		obj6 = obj1;
		obj7 = obj5;
		abyte0 = new byte[4096];
		i = 0;
_L4:
		obj3 = obj;
		obj6 = obj1;
		obj7 = obj5;
		k = ((InputStream) (obj1)).read(abyte0);
		obj2 = obj4;
		obj3 = obj5;
		if(k == -1)
			break; /* Loop/switch isn't completed */
		i += k;
		obj3 = obj;
		obj6 = obj1;
		obj7 = obj5;
		o.b("RobotUploadService", String.format(Locale.US, "Read %d of %d bytes", new Object[] {
			Integer.valueOf(i), Integer.valueOf(j)
		}));
		obj3 = obj;
		obj6 = obj1;
		obj7 = obj5;
		((FileOutputStream) (obj5)).write(abyte0, 0, k);
		if(true) goto _L4; else goto _L3
		obj9;
		obj2 = obj;
		obj8 = obj1;
		obj1 = obj4;
		obj = obj5;
		  goto _L5
		obj3;
		obj2 = obj;
		obj8 = obj1;
		obj1 = obj4;
		  goto _L6
_L2:
		obj2 = null;
		obj3 = null;
_L3:
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_272;
		((InputStream) (obj1)).close();
		if(obj3 != null)
			try
			{
				((FileOutputStream) (obj3)).close();
			}
	//* 169  354:astore_1        
	//* 170  355:aconst_null     
	//* 171  356:astore          6
	//* 172  358:aconst_null     
	//* 173  359:astore          7
	//* 174  361:aconst_null     
	//* 175  362:astore          13
	//* 176  364:goto            573
	//* 177  367:astore          9
	//* 178  369:aconst_null     
	//* 179  370:astore          6
	//* 180  372:aconst_null     
	//* 181  373:astore          14
	//* 182  375:aconst_null     
	//* 183  376:astore          7
	//* 184  378:aload           6
	//* 185  380:astore          8
	//* 186  382:aconst_null     
	//* 187  383:astore          6
	//* 188  385:aload           9
	//* 189  387:astore          15
	//* 190  389:aload           8
	//* 191  391:astore          9
	//* 192  393:aload           14
	//* 193  395:astore          12
	//* 194  397:aload           6
	//* 195  399:astore          13
	//* 196  401:ldc1            #11  <String "RobotUploadService">
	//* 197  403:aload           15
	//* 198  405:invokevirtual   #130 <Method String IOException.getMessage()>
	//* 199  408:invokestatic    #80  <Method void o.e(String, String)>
	//* 200  411:aload           14
	//* 201  413:ifnull          424
	//* 202  416:aload           14
	//* 203  418:invokevirtual   #116 <Method void InputStream.close()>
	//* 204  421:goto            424
	//* 205  424:aload           6
	//* 206  426:ifnull          447
	//* 207  429:aload           6
	//* 208  431:invokevirtual   #206 <Method void FileOutputStream.close()>
	//* 209  434:goto            447
	//* 210  437:ldc1            #11  <String "RobotUploadService">
	//* 211  439:aload           9
	//* 212  441:invokevirtual   #130 <Method String IOException.getMessage()>
	//* 213  444:invokestatic    #80  <Method void o.e(String, String)>
	//* 214  447:aload           7
	//* 215  449:astore          10
	//* 216  451:aload           6
	//* 217  453:astore          11
	//* 218  455:aload           8
	//* 219  457:ifnull          467
	//* 220  460:aload           6
	//* 221  462:astore          9
	//* 222  464:goto            316
	//* 223  467:aload           10
	//* 224  469:ifnull          510
	//* 225  472:aload           11
	//* 226  474:ifnull          510
	//* 227  477:new             #211 <Class BufferedInputStream>
	//* 228  480:dup             
	//* 229  481:new             #213 <Class FileInputStream>
	//* 230  484:dup             
	//* 231  485:aload           10
	//* 232  487:invokespecial   #214 <Method void FileInputStream(File)>
	//* 233  490:invokespecial   #217 <Method void BufferedInputStream(InputStream)>
	//* 234  493:astore          6
	//* 235  495:goto            513
	//* 236  498:astore          6
	//* 237  500:ldc1            #11  <String "RobotUploadService">
	//* 238  502:aload           6
	//* 239  504:invokevirtual   #218 <Method String FileNotFoundException.getMessage()>
	//* 240  507:invokestatic    #80  <Method void o.e(String, String)>
	//* 241  510:aconst_null     
	//* 242  511:astore          6
	//* 243  513:aload           6
	//* 244  515:ifnonnull       556
	//* 245  518:new             #118 <Class StringBuilder>
	//* 246  521:dup             
	//* 247  522:invokespecial   #120 <Method void StringBuilder()>
	//* 248  525:astore_1        
	//* 249  526:aload_1         
	//* 250  527:ldc1            #220 <String "Could not download package from URL: ">
	//* 251  529:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 252  532:pop             
	//* 253  533:aload_1         
	//* 254  534:aload_2         
	//* 255  535:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 256  538:pop             
	//* 257  539:ldc1            #11  <String "RobotUploadService">
	//* 258  541:aload_1         
	//* 259  542:invokevirtual   #133 <Method String StringBuilder.toString()>
	//* 260  545:invokestatic    #80  <Method void o.e(String, String)>
	//* 261  548:aload_0         
	//* 262  549:aconst_null     
	//* 263  550:ldc1            #111 <String "uploadFailed">
	//* 264  552:invokespecial   #90  <Method void b(String, String)>
	//* 265  555:return          
	//* 266  556:aload_0         
	//* 267  557:aload_1         
	//* 268  558:aload           6
	//* 269  560:invokespecial   #83  <Method void a(String, InputStream)>
	//* 270  563:return          
	//* 271  564:astore_1        
	//* 272  565:aload           12
	//* 273  567:astore          7
	//* 274  569:aload           9
	//* 275  571:astore          6
	//* 276  573:aload           7
	//* 277  575:ifnull          586
	//* 278  578:aload           7
	//* 279  580:invokevirtual   #116 <Method void InputStream.close()>
	//* 280  583:goto            586
	//* 281  586:aload           13
	//* 282  588:ifnull          608
	//* 283  591:aload           13
	//* 284  593:invokevirtual   #206 <Method void FileOutputStream.close()>
	//* 285  596:goto            608
	//* 286  599:ldc1            #11  <String "RobotUploadService">
	//* 287  601:aload_2         
	//* 288  602:invokevirtual   #130 <Method String IOException.getMessage()>
	//* 289  605:invokestatic    #80  <Method void o.e(String, String)>
	//* 290  608:aload           6
	//* 291  610:ifnull          618
	//* 292  613:aload           6
	//* 293  615:invokevirtual   #209 <Method void HttpURLConnection.disconnect()>
	//* 294  618:aload_1         
	//* 295  619:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj1)
			{
				o.e("RobotUploadService", ((IOException) (obj1)).getMessage());
			}
		obj4 = obj2;
		obj5 = obj3;
		if(obj == null) goto _L8; else goto _L7
_L7:
		obj1 = obj2;
		obj2 = obj;
_L9:
		((HttpURLConnection) (obj2)).disconnect();
		obj4 = obj1;
		obj5 = obj3;
		break; /* Loop/switch isn't completed */
		s;
		break MISSING_BLOCK_LABEL_361;
		s;
		break MISSING_BLOCK_LABEL_358;
		s;
		obj = null;
		obj1 = null;
		obj7 = null;
		break MISSING_BLOCK_LABEL_573;
		obj3;
		obj = null;
		obj8 = null;
		obj1 = null;
		obj2 = obj;
_L6:
		obj = null;
		obj9 = obj3;
_L5:
		obj3 = obj2;
		obj6 = obj8;
		obj7 = obj;
		o.e("RobotUploadService", ((IOException) (obj9)).getMessage());
		if(obj8 == null)
			break MISSING_BLOCK_LABEL_424;
		((InputStream) (obj8)).close();
		if(obj != null)
			try
			{
				((FileOutputStream) (obj)).close();
			}
	//* 296  620:astore          7
	//* 297  622:goto            285
			// Misplaced declaration of an exception variable
			catch(Object obj3)
			{
				o.e("RobotUploadService", ((IOException) (obj3)).getMessage());
			}
		obj4 = obj1;
		obj5 = obj;
		if(obj2 == null)
			break; /* Loop/switch isn't completed */
		obj3 = obj;
		if(true) goto _L9; else goto _L8
_L8:
label0:
		{
			if(obj4 != null && obj5 != null)
				try
				{
					obj = ((Object) (new BufferedInputStream(((InputStream) (new FileInputStream(((File) (obj4))))))));
					break label0;
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					o.e("RobotUploadService", ((FileNotFoundException) (obj)).getMessage());
				}
			obj = null;
		}
		if(obj == null)
		{
			s = ((String) (new StringBuilder()));
			((StringBuilder) (s)).append("Could not download package from URL: ");
			((StringBuilder) (s)).append(s1);
			o.e("RobotUploadService", ((StringBuilder) (s)).toString());
			b(((String) (null)), "uploadFailed");
			return;
		} else
		{
			a(s, ((InputStream) (obj)));
			return;
		}
		s;
		obj1 = obj6;
		obj = obj3;
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_586;
		((InputStream) (obj1)).close();
		if(obj7 != null)
			try
			{
				((FileOutputStream) (obj7)).close();
			}
	//* 298  625:astore          9
	//* 299  627:goto            437
			// Misplaced declaration of an exception variable
			catch(String s1)
			{
				o.e("RobotUploadService", ((IOException) (s1)).getMessage());
			}
		if(obj != null)
			((HttpURLConnection) (obj)).disconnect();
		throw s;
	//* 300  630:astore_2        
	//* 301  631:goto            599
	}

	private void b(String s)
	{
		byte abyte0[] = c(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #224 <Method byte[] c(String)>
	//    3    5:astore_2        
		if(abyte0 == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       48
		{
			abyte0 = ((byte []) (new StringBuilder()));
	//    6   10:new             #118 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #120 <Method void StringBuilder()>
	//    9   17:astore_2        
			((StringBuilder) (abyte0)).append("Could not download package from URL: ");
	//   10   18:aload_2         
	//   11   19:ldc1            #220 <String "Could not download package from URL: ">
	//   12   21:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			((StringBuilder) (abyte0)).append(s);
	//   14   25:aload_2         
	//   15   26:aload_1         
	//   16   27:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   17   30:pop             
			o.e("RobotUploadService", ((StringBuilder) (abyte0)).toString());
	//   18   31:ldc1            #11  <String "RobotUploadService">
	//   19   33:aload_2         
	//   20   34:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   21   37:invokestatic    #80  <Method void o.e(String, String)>
			b(((String) (null)), "uploadFailed");
	//   22   40:aload_0         
	//   23   41:aconst_null     
	//   24   42:ldc1            #111 <String "uploadFailed">
	//   25   44:invokespecial   #90  <Method void b(String, String)>
			return;
	//   26   47:return          
		} else
		{
			com.irobot.home.c.a.a().a(abyte0);
	//   27   48:invokestatic    #229 <Method com.irobot.home.c.a com.irobot.home.c.a.a()>
	//   28   51:aload_2         
	//   29   52:invokevirtual   #232 <Method void com.irobot.home.c.a.a(byte[])>
			return;
	//   30   55:return          
		}
	}

	private void b(String s, String s1)
	{
		s1 = ((String) ((new Intent("com.irobot.home.service.action.BROADCAST_STATUS")).putExtra("com.irobot.home.service.extra.BROADCAST_STATUS", s1)));
	//    0    0:new             #18  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #234 <String "com.irobot.home.service.action.BROADCAST_STATUS">
	//    3    6:invokespecial   #235 <Method void Intent(String)>
	//    4    9:ldc1            #237 <String "com.irobot.home.service.extra.BROADCAST_STATUS">
	//    5   11:aload_2         
	//    6   12:invokevirtual   #33  <Method Intent Intent.putExtra(String, String)>
	//    7   15:astore_2        
		if(s != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          28
			((Intent) (s1)).putExtra("com.irobot.home.service.extra.ROBOT_BLID", s);
	//   10   20:aload_2         
	//   11   21:ldc1            #29  <String "com.irobot.home.service.extra.ROBOT_BLID">
	//   12   23:aload_1         
	//   13   24:invokevirtual   #33  <Method Intent Intent.putExtra(String, String)>
	//   14   27:pop             
		android.support.v4.content.c.a(((Context) (this))).a(((Intent) (s1)));
	//   15   28:aload_0         
	//   16   29:invokestatic    #242 <Method c c.a(Context)>
	//   17   32:aload_2         
	//   18   33:invokevirtual   #245 <Method boolean c.a(Intent)>
	//   19   36:pop             
	//   20   37:return          
	}

	private byte[] c(String s)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		Object obj1;
		if(!s.startsWith("android.resource://"))
			break MISSING_BLOCK_LABEL_37;
	//    2    2:aload_1         
	//    3    3:ldc1            #247 <String "android.resource://">
	//    4    5:invokevirtual   #251 <Method boolean String.startsWith(String)>
	//    5    8:ifeq            37
		obj1 = ((Object) (new BufferedInputStream(getResources().openRawResource(0x7f0e0002))));
	//    6   11:new             #211 <Class BufferedInputStream>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:invokevirtual   #66  <Method Resources getResources()>
	//   10   19:ldc1            #252 <Int 0x7f0e0002>
	//   11   21:invokevirtual   #72  <Method InputStream Resources.openRawResource(int)>
	//   12   24:invokespecial   #217 <Method void BufferedInputStream(InputStream)>
	//   13   27:astore          4
		s = null;
	//   14   29:aconst_null     
	//   15   30:astore_1        
		obj = obj1;
	//   16   31:aload           4
	//   17   33:astore_3        
		break MISSING_BLOCK_LABEL_68;
	//   18   34:goto            68
		s = ((String) ((HttpURLConnection)(new URL(s)).openConnection()));
	//   19   37:new             #137 <Class URL>
	//   20   40:dup             
	//   21   41:aload_1         
	//   22   42:invokespecial   #138 <Method void URL(String)>
	//   23   45:invokevirtual   #142 <Method java.net.URLConnection URL.openConnection()>
	//   24   48:checkcast       #144 <Class HttpURLConnection>
	//   25   51:astore_1        
		((HttpURLConnection) (s)).connect();
	//   26   52:aload_1         
	//   27   53:invokevirtual   #147 <Method void HttpURLConnection.connect()>
		obj = ((Object) (new BufferedInputStream(((HttpURLConnection) (s)).getInputStream())));
	//   28   56:new             #211 <Class BufferedInputStream>
	//   29   59:dup             
	//   30   60:aload_1         
	//   31   61:invokevirtual   #151 <Method InputStream HttpURLConnection.getInputStream()>
	//   32   64:invokespecial   #217 <Method void BufferedInputStream(InputStream)>
	//   33   67:astore_3        
		byte abyte1[];
		obj1 = ((Object) (new ByteArrayOutputStream()));
	//   34   68:new             #254 <Class ByteArrayOutputStream>
	//   35   71:dup             
	//   36   72:invokespecial   #255 <Method void ByteArrayOutputStream()>
	//   37   75:astore          4
		abyte1 = new byte[4096];
	//   38   77:sipush          4096
	//   39   80:newarray        byte[]
	//   40   82:astore          5
_L1:
		int i = ((BufferedInputStream) (obj)).read(abyte1);
	//   41   84:aload_3         
	//   42   85:aload           5
	//   43   87:invokevirtual   #256 <Method int BufferedInputStream.read(byte[])>
	//   44   90:istore_2        
		if(i == -1)
			break MISSING_BLOCK_LABEL_108;
	//   45   91:iload_2         
	//   46   92:iconst_m1       
	//   47   93:icmpeq          108
		((ByteArrayOutputStream) (obj1)).write(abyte1, 0, i);
	//   48   96:aload           4
	//   49   98:aload           5
	//   50  100:iconst_0        
	//   51  101:iload_2         
	//   52  102:invokevirtual   #257 <Method void ByteArrayOutputStream.write(byte[], int, int)>
		  goto _L1
	//*  53  105:goto            84
		byte abyte0[] = ((ByteArrayOutputStream) (obj1)).toByteArray();
	//   54  108:aload           4
	//   55  110:invokevirtual   #261 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   56  113:astore          4
		if(s == null)
			break MISSING_BLOCK_LABEL_126;
	//   57  115:aload_1         
	//   58  116:ifnull          126
		((HttpURLConnection) (s)).disconnect();
	//   59  119:aload_1         
	//   60  120:invokevirtual   #209 <Method void HttpURLConnection.disconnect()>
	//*  61  123:goto            126
		if(obj != null)
	//*  62  126:aload_3         
	//*  63  127:ifnull          146
			try
			{
				((BufferedInputStream) (obj)).close();
	//   64  130:aload_3         
	//   65  131:invokevirtual   #262 <Method void BufferedInputStream.close()>
			}
	//*  66  134:goto            146
	//*  67  137:ldc1            #11  <String "RobotUploadService">
	//*  68  139:aload_1         
	//*  69  140:invokevirtual   #130 <Method String IOException.getMessage()>
	//*  70  143:invokestatic    #80  <Method void o.e(String, String)>
	//*  71  146:aload           4
	//*  72  148:areturn         
	//*  73  149:astore          4
	//*  74  151:goto            236
	//*  75  154:astore          4
	//*  76  156:goto            170
	//*  77  159:astore          4
	//*  78  161:aconst_null     
	//*  79  162:astore_3        
	//*  80  163:goto            236
	//*  81  166:astore          4
	//*  82  168:aconst_null     
	//*  83  169:astore_3        
	//*  84  170:goto            192
	//*  85  173:astore          4
	//*  86  175:aconst_null     
	//*  87  176:astore          5
	//*  88  178:aload_3         
	//*  89  179:astore_1        
	//*  90  180:aload           5
	//*  91  182:astore_3        
	//*  92  183:goto            236
	//*  93  186:astore          4
	//*  94  188:aconst_null     
	//*  95  189:astore_1        
	//*  96  190:aload_1         
	//*  97  191:astore_3        
	//*  98  192:ldc1            #11  <String "RobotUploadService">
	//*  99  194:aload           4
	//* 100  196:invokevirtual   #130 <Method String IOException.getMessage()>
	//* 101  199:invokestatic    #80  <Method void o.e(String, String)>
	//* 102  202:aload_1         
	//* 103  203:ifnull          213
	//* 104  206:aload_1         
	//* 105  207:invokevirtual   #209 <Method void HttpURLConnection.disconnect()>
	//* 106  210:goto            213
	//* 107  213:aload_3         
	//* 108  214:ifnull          232
	//* 109  217:aload_3         
	//* 110  218:invokevirtual   #262 <Method void BufferedInputStream.close()>
	//* 111  221:aconst_null     
	//* 112  222:areturn         
	//* 113  223:ldc1            #11  <String "RobotUploadService">
	//* 114  225:aload_1         
	//* 115  226:invokevirtual   #130 <Method String IOException.getMessage()>
	//* 116  229:invokestatic    #80  <Method void o.e(String, String)>
	//* 117  232:aconst_null     
	//* 118  233:areturn         
	//* 119  234:astore          4
	//* 120  236:aload_1         
	//* 121  237:ifnull          247
	//* 122  240:aload_1         
	//* 123  241:invokevirtual   #209 <Method void HttpURLConnection.disconnect()>
	//* 124  244:goto            247
	//* 125  247:aload_3         
	//* 126  248:ifnull          267
	//* 127  251:aload_3         
	//* 128  252:invokevirtual   #262 <Method void BufferedInputStream.close()>
	//* 129  255:goto            267
	//* 130  258:ldc1            #11  <String "RobotUploadService">
	//* 131  260:aload_1         
	//* 132  261:invokevirtual   #130 <Method String IOException.getMessage()>
	//* 133  264:invokestatic    #80  <Method void o.e(String, String)>
	//* 134  267:aload           4
	//* 135  269:athrow          
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				o.e("RobotUploadService", ((IOException) (s)).getMessage());
			}
		return abyte0;
		Object obj2;
		obj2;
		  goto _L2
		obj2;
		  goto _L3
		obj2;
		obj = null;
		  goto _L2
		obj2;
		obj = null;
		  goto _L3
		obj2;
		Object obj3 = null;
		s = ((String) (obj));
		obj = ((Object) (obj3));
		  goto _L2
		obj2;
		s = null;
		obj = ((Object) (s));
_L3:
		o.e("RobotUploadService", ((IOException) (obj2)).getMessage());
		if(s == null)
			break MISSING_BLOCK_LABEL_213;
		((HttpURLConnection) (s)).disconnect();
		if(obj == null) goto _L5; else goto _L4
_L4:
		((BufferedInputStream) (obj)).close();
		return null;
_L7:
		o.e("RobotUploadService", ((IOException) (s)).getMessage());
_L5:
		return null;
		obj2;
_L2:
		if(s == null)
			break MISSING_BLOCK_LABEL_247;
		((HttpURLConnection) (s)).disconnect();
		if(obj != null)
			try
			{
				((BufferedInputStream) (obj)).close();
			}
	//* 136  270:astore_1        
	//* 137  271:goto            137
	//* 138  274:astore_1        
	//* 139  275:goto            223
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				o.e("RobotUploadService", ((IOException) (s)).getMessage());
			}
		throw obj2;
		s;
		if(true) goto _L7; else goto _L6
_L6:
	//* 140  278:astore_1        
	//* 141  279:goto            258
	}

	protected void onHandleIntent(Intent intent)
	{
		if(intent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          75
		{
			String s = intent.getAction();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #267 <Method String Intent.getAction()>
	//    4    8:astore_3        
			if("com.irobot.home.service.action.LOCAL_OTA_UPLOAD_FILE".equals(((Object) (s))))
	//*   5    9:ldc1            #23  <String "com.irobot.home.service.action.LOCAL_OTA_UPLOAD_FILE">
	//*   6   11:aload_3         
	//*   7   12:invokevirtual   #271 <Method boolean String.equals(Object)>
	//*   8   15:ifeq            56
			{
				s = intent.getStringExtra("com.irobot.home.service.extra.ROBOT_BLID");
	//    9   18:aload_1         
	//   10   19:ldc1            #29  <String "com.irobot.home.service.extra.ROBOT_BLID">
	//   11   21:invokevirtual   #275 <Method String Intent.getStringExtra(String)>
	//   12   24:astore_3        
				int i = intent.getIntExtra("com.irobot.home.service.extra.PACKAGE_RES_ID", 0);
	//   13   25:aload_1         
	//   14   26:ldc1            #35  <String "com.irobot.home.service.extra.PACKAGE_RES_ID">
	//   15   28:iconst_0        
	//   16   29:invokevirtual   #279 <Method int Intent.getIntExtra(String, int)>
	//   17   32:istore_2        
				if(i != 0)
	//*  18   33:iload_2         
	//*  19   34:ifeq            44
				{
					a(s, i);
	//   20   37:aload_0         
	//   21   38:aload_3         
	//   22   39:iload_2         
	//   23   40:invokespecial   #281 <Method void a(String, int)>
					return;
	//   24   43:return          
				} else
				{
					a(s, intent.getStringExtra("com.irobot.home.service.extra.PACKAGE_URL"));
	//   25   44:aload_0         
	//   26   45:aload_3         
	//   27   46:aload_1         
	//   28   47:ldc1            #47  <String "com.irobot.home.service.extra.PACKAGE_URL">
	//   29   49:invokevirtual   #275 <Method String Intent.getStringExtra(String)>
	//   30   52:invokespecial   #283 <Method void a(String, String)>
					return;
	//   31   55:return          
				}
			}
			if("com.irobot.home.service.action.OTA_UPDATE_BRAAVA".equals(((Object) (s))))
	//*  32   56:ldc1            #61  <String "com.irobot.home.service.action.OTA_UPDATE_BRAAVA">
	//*  33   58:aload_3         
	//*  34   59:invokevirtual   #271 <Method boolean String.equals(Object)>
	//*  35   62:ifeq            75
				b(intent.getStringExtra("com.irobot.home.service.extra.PACKAGE_URL"));
	//   36   65:aload_0         
	//   37   66:aload_1         
	//   38   67:ldc1            #47  <String "com.irobot.home.service.extra.PACKAGE_URL">
	//   39   69:invokevirtual   #275 <Method String Intent.getStringExtra(String)>
	//   40   72:invokespecial   #285 <Method void b(String)>
		}
	//   41   75:return          
	}

	private static WeakReference a;
}
