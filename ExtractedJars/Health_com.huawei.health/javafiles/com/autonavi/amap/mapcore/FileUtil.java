// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.amap.api.maps.MapsInitializer;
import java.io.*;
import java.lang.reflect.Method;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class FileUtil
{

	public FileUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static boolean checkCanWrite(File file)
	{
		if(file == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(file.canWrite())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #30  <Method boolean File.canWrite()>
	//*   6   10:ifeq            67
		{
			file = new File(file, "amap.tmp");
	//    7   13:new             #26  <Class File>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:ldc1            #32  <String "amap.tmp">
	//   11   20:invokespecial   #35  <Method void File(File, String)>
	//   12   23:astore_0        
			try
			{
				file.createNewFile();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #38  <Method boolean File.createNewFile()>
	//   15   28:pop             
			}
	//*  16   29:goto            39
			// Misplaced declaration of an exception variable
			catch(File file)
	//*  17   32:astore_0        
			{
				((IOException) (file)).printStackTrace();
	//   18   33:aload_0         
	//   19   34:invokevirtual   #41  <Method void IOException.printStackTrace()>
				return false;
	//   20   37:iconst_0        
	//   21   38:ireturn         
			}
			if(file == null || !file.exists())
	//*  22   39:aload_0         
	//*  23   40:ifnull          50
	//*  24   43:aload_0         
	//*  25   44:invokevirtual   #44  <Method boolean File.exists()>
	//*  26   47:ifne            52
				return false;
	//   27   50:iconst_0        
	//   28   51:ireturn         
			try
			{
				file.delete();
	//   29   52:aload_0         
	//   30   53:invokevirtual   #47  <Method boolean File.delete()>
	//   31   56:pop             
			}
	//*  32   57:goto            67
			// Misplaced declaration of an exception variable
			catch(File file)
	//*  33   60:astore_0        
			{
				((Exception) (file)).printStackTrace();
	//   34   61:aload_0         
	//   35   62:invokevirtual   #48  <Method void Exception.printStackTrace()>
				return false;
	//   36   65:iconst_0        
	//   37   66:ireturn         
			}
		}
		return true;
	//   38   67:iconst_1        
	//   39   68:ireturn         
	}

	public static void copy(Context context, String s, File file)
		throws Exception
	{
		file.delete();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #47  <Method boolean File.delete()>
	//    2    4:pop             
		s = ((String) (context.getAssets().open(s)));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #56  <Method AssetManager Context.getAssets()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #62  <Method InputStream AssetManager.open(String)>
	//    7   13:astore_1        
		context = ((Context) (new byte[((InputStream) (s)).available()]));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #68  <Method int InputStream.available()>
	//   10   18:newarray        byte[]
	//   11   20:astore_0        
		((InputStream) (s)).read(((byte []) (context)));
	//   12   21:aload_1         
	//   13   22:aload_0         
	//   14   23:invokevirtual   #72  <Method int InputStream.read(byte[])>
	//   15   26:pop             
		((InputStream) (s)).close();
	//   16   27:aload_1         
	//   17   28:invokevirtual   #75  <Method void InputStream.close()>
		s = ((String) (new FileOutputStream(file)));
	//   18   31:new             #77  <Class FileOutputStream>
	//   19   34:dup             
	//   20   35:aload_2         
	//   21   36:invokespecial   #80  <Method void FileOutputStream(File)>
	//   22   39:astore_1        
		((FileOutputStream) (s)).write(((byte []) (context)));
	//   23   40:aload_1         
	//   24   41:aload_0         
	//   25   42:invokevirtual   #84  <Method void FileOutputStream.write(byte[])>
		((FileOutputStream) (s)).close();
	//   26   45:aload_1         
	//   27   46:invokevirtual   #85  <Method void FileOutputStream.close()>
	//   28   49:return          
	}

	public static void createNoMediaFileIfNotExist(String s)
	{
	//    0    0:return          
	}

	public static boolean deleteFile(File file)
	{
		if(file == null || !file.exists())
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #44  <Method boolean File.exists()>
	//*   4    8:ifne            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		if(file.isDirectory())
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #92  <Method boolean File.isDirectory()>
	//*   9   17:ifeq            82
		{
			File afile[] = file.listFiles();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #96  <Method File[] File.listFiles()>
	//   12   24:astore_2        
			if(afile != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          82
			{
				for(int i = 0; i < afile.length; i++)
	//*  15   29:iconst_0        
	//*  16   30:istore_1        
	//*  17   31:iload_1         
	//*  18   32:aload_2         
	//*  19   33:arraylength     
	//*  20   34:icmpge          82
				{
					if(afile[i].isFile())
	//*  21   37:aload_2         
	//*  22   38:iload_1         
	//*  23   39:aaload          
	//*  24   40:invokevirtual   #99  <Method boolean File.isFile()>
	//*  25   43:ifeq            57
					{
						if(!afile[i].delete())
	//*  26   46:aload_2         
	//*  27   47:iload_1         
	//*  28   48:aaload          
	//*  29   49:invokevirtual   #47  <Method boolean File.delete()>
	//*  30   52:ifne            75
							return false;
	//   31   55:iconst_0        
	//   32   56:ireturn         
						continue;
					}
					if(!deleteFile(afile[i]))
	//*  33   57:aload_2         
	//*  34   58:iload_1         
	//*  35   59:aaload          
	//*  36   60:invokestatic    #101 <Method boolean deleteFile(File)>
	//*  37   63:ifne            68
						return false;
	//   38   66:iconst_0        
	//   39   67:ireturn         
					afile[i].delete();
	//   40   68:aload_2         
	//   41   69:iload_1         
	//   42   70:aaload          
	//   43   71:invokevirtual   #47  <Method boolean File.delete()>
	//   44   74:pop             
				}

	//   45   75:iload_1         
	//   46   76:iconst_1        
	//   47   77:iadd            
	//   48   78:istore_1        
			}
		}
	//*  49   79:goto            31
		file.delete();
	//   50   82:aload_0         
	//   51   83:invokevirtual   #47  <Method boolean File.delete()>
	//   52   86:pop             
		return true;
	//   53   87:iconst_1        
	//   54   88:ireturn         
	}

	public static String getExternalStroragePath(Context context)
	{
		int j;
		j = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #111 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		if(j < 12)
			break MISSING_BLOCK_LABEL_457;
	//    2    4:iload_2         
	//    3    5:bipush          12
	//    4    7:icmplt          457
		StorageManager storagemanager;
		Method method2;
		Object aobj[];
		storagemanager = (StorageManager)context.getSystemService("storage");
	//    5   10:aload_0         
	//    6   11:ldc1            #113 <String "storage">
	//    7   13:invokevirtual   #117 <Method Object Context.getSystemService(String)>
	//    8   16:checkcast       #119 <Class StorageManager>
	//    9   19:astore          13
		Method method = ((Class) (android/os/storage/StorageManager)).getMethod("getVolumeList", new Class[0]);
	//   10   21:ldc1            #119 <Class StorageManager>
	//   11   23:ldc1            #121 <String "getVolumeList">
	//   12   25:iconst_0        
	//   13   26:anewarray       Class[]
	//   14   29:invokevirtual   #127 <Method Method Class.getMethod(String, Class[])>
	//   15   32:astore          5
		method2 = ((Class) (android/os/storage/StorageManager)).getMethod("getVolumeState", new Class[] {
			java/lang/String
		});
	//   16   34:ldc1            #119 <Class StorageManager>
	//   17   36:ldc1            #129 <String "getVolumeState">
	//   18   38:iconst_1        
	//   19   39:anewarray       Class[]
	//   20   42:dup             
	//   21   43:iconst_0        
	//   22   44:ldc1            #131 <Class String>
	//   23   46:aastore         
	//   24   47:invokevirtual   #127 <Method Method Class.getMethod(String, Class[])>
	//   25   50:astore          14
		aobj = (Object[])(Object[])method.invoke(((Object) (storagemanager)), new Object[0]);
	//   26   52:aload           5
	//   27   54:aload           13
	//   28   56:iconst_0        
	//   29   57:anewarray       Object[]
	//   30   60:invokevirtual   #137 <Method Object Method.invoke(Object, Object[])>
	//   31   63:checkcast       #139 <Class Object[]>
	//   32   66:checkcast       #139 <Class Object[]>
	//   33   69:astore          15
		Object obj1;
		Object obj2;
		Object obj5;
		Object obj6;
		obj1 = "";
	//   34   71:ldc1            #141 <String "">
	//   35   73:astore          6
		obj2 = "";
	//   36   75:ldc1            #141 <String "">
	//   37   77:astore          7
		obj6 = null;
	//   38   79:aconst_null     
	//   39   80:astore          11
		obj5 = null;
	//   40   82:aconst_null     
	//   41   83:astore          10
		int k = aobj.length;
	//   42   85:aload           15
	//   43   87:arraylength     
	//   44   88:istore_3        
		int i = 0;
	//   45   89:iconst_0        
	//   46   90:istore_1        
_L2:
		Object obj;
		Object obj3;
		obj = ((Object) (obj6));
	//   47   91:aload           11
	//   48   93:astore          5
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   49   95:iload_1         
	//   50   96:iload_3         
	//   51   97:icmpge          366
		obj3 = aobj[i];
	//   52  100:aload           15
	//   53  102:iload_1         
	//   54  103:aaload          
	//   55  104:astore          8
		Object obj7;
		obj7 = ((Object) (obj3.getClass().getMethod("getPath", new Class[0])));
	//   56  106:aload           8
	//   57  108:invokevirtual   #145 <Method Class Object.getClass()>
	//   58  111:ldc1            #147 <String "getPath">
	//   59  113:iconst_0        
	//   60  114:anewarray       Class[]
	//   61  117:invokevirtual   #127 <Method Method Class.getMethod(String, Class[])>
	//   62  120:astore          12
		Method method1 = obj3.getClass().getMethod("isRemovable", new Class[0]);
	//   63  122:aload           8
	//   64  124:invokevirtual   #145 <Method Class Object.getClass()>
	//   65  127:ldc1            #149 <String "isRemovable">
	//   66  129:iconst_0        
	//   67  130:anewarray       Class[]
	//   68  133:invokevirtual   #127 <Method Method Class.getMethod(String, Class[])>
	//   69  136:astore          9
		obj = ((Object) ((String)((Method) (obj7)).invoke(obj3, new Object[0])));
	//   70  138:aload           12
	//   71  140:aload           8
	//   72  142:iconst_0        
	//   73  143:anewarray       Object[]
	//   74  146:invokevirtual   #137 <Method Object Method.invoke(Object, Object[])>
	//   75  149:checkcast       #131 <Class String>
	//   76  152:astore          5
		obj7 = ((Object) ((String)method2.invoke(((Object) (storagemanager)), new Object[] {
			((Method) (obj7)).invoke(obj3, new Object[0])
		})));
	//   77  154:aload           14
	//   78  156:aload           13
	//   79  158:iconst_1        
	//   80  159:anewarray       Object[]
	//   81  162:dup             
	//   82  163:iconst_0        
	//   83  164:aload           12
	//   84  166:aload           8
	//   85  168:iconst_0        
	//   86  169:anewarray       Object[]
	//   87  172:invokevirtual   #137 <Method Object Method.invoke(Object, Object[])>
	//   88  175:aastore         
	//   89  176:invokevirtual   #137 <Method Object Method.invoke(Object, Object[])>
	//   90  179:checkcast       #131 <Class String>
	//   91  182:astore          12
		obj3 = ((Object) ((Boolean)method1.invoke(obj3, new Object[0])));
	//   92  184:aload           9
	//   93  186:aload           8
	//   94  188:iconst_0        
	//   95  189:anewarray       Object[]
	//   96  192:invokevirtual   #137 <Method Object Method.invoke(Object, Object[])>
	//   97  195:checkcast       #151 <Class Boolean>
	//   98  198:astore          8
		Object obj4;
		if(!TextUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).toLowerCase().contains("private"))
	//*  99  200:aload           5
	//* 100  202:invokestatic    #157 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 101  205:ifne            232
	//* 102  208:aload           5
	//* 103  210:invokevirtual   #161 <Method String String.toLowerCase()>
	//* 104  213:ldc1            #163 <String "private">
	//* 105  215:invokevirtual   #166 <Method boolean String.contains(CharSequence)>
	//* 106  218:ifeq            232
		{
			obj4 = obj1;
	//  107  221:aload           6
	//  108  223:astore          9
			obj3 = obj2;
	//  109  225:aload           7
	//  110  227:astore          8
			break MISSING_BLOCK_LABEL_351;
	//  111  229:goto            351
		}
		if(!((Boolean) (obj3)).booleanValue())
			break MISSING_BLOCK_LABEL_343;
	//  112  232:aload           8
	//  113  234:invokevirtual   #169 <Method boolean Boolean.booleanValue()>
	//  114  237:ifeq            343
		obj4 = obj1;
	//  115  240:aload           6
	//  116  242:astore          9
		obj3 = obj2;
	//  117  244:aload           7
	//  118  246:astore          8
		if(obj == null)
			break MISSING_BLOCK_LABEL_351;
	//  119  248:aload           5
	//  120  250:ifnull          351
		obj4 = obj1;
	//  121  253:aload           6
	//  122  255:astore          9
		obj3 = obj2;
	//  123  257:aload           7
	//  124  259:astore          8
		if(obj7 == null)
			break MISSING_BLOCK_LABEL_351;
	//  125  261:aload           12
	//  126  263:ifnull          351
		boolean flag = ((String) (obj7)).equals("mounted");
	//  127  266:aload           12
	//  128  268:ldc1            #171 <String "mounted">
	//  129  270:invokevirtual   #175 <Method boolean String.equals(Object)>
	//  130  273:istore          4
		obj4 = obj1;
	//  131  275:aload           6
	//  132  277:astore          9
		obj3 = obj2;
	//  133  279:aload           7
	//  134  281:astore          8
		if(!flag)
			break MISSING_BLOCK_LABEL_351;
	//  135  283:iload           4
	//  136  285:ifeq            351
		if(j <= 18)
	//* 137  288:iload_2         
	//* 138  289:bipush          18
	//* 139  291:icmpgt          297
			break; /* Loop/switch isn't completed */
	//  140  294:goto            366
		obj3 = ((Object) (context.getExternalFilesDirs(((String) (null)))));
	//  141  297:aload_0         
	//  142  298:aconst_null     
	//  143  299:invokevirtual   #179 <Method File[] Context.getExternalFilesDirs(String)>
	//  144  302:astore          8
		context = ((Context) (obj5));
	//  145  304:aload           10
	//  146  306:astore_0        
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_333;
	//  147  307:aload           8
	//  148  309:ifnull          333
		if(obj3.length > 1)
	//* 149  312:aload           8
	//* 150  314:arraylength     
	//* 151  315:iconst_1        
	//* 152  316:icmple          330
		{
			context = ((Context) (((File) (obj3[1])).getAbsolutePath()));
	//  153  319:aload           8
	//  154  321:iconst_1        
	//  155  322:aaload          
	//  156  323:invokevirtual   #182 <Method String File.getAbsolutePath()>
	//  157  326:astore_0        
			break MISSING_BLOCK_LABEL_333;
	//  158  327:goto            333
		}
		context = ((Context) (obj));
	//  159  330:aload           5
	//  160  332:astore_0        
		obj = ((Object) (context));
	//  161  333:aload_0         
	//  162  334:astore          5
		break; /* Loop/switch isn't completed */
	//  163  336:goto            366
		context;
	//  164  339:astore_0        
		break; /* Loop/switch isn't completed */
	//  165  340:goto            366
		obj3 = obj7;
	//  166  343:aload           12
	//  167  345:astore          8
		obj4 = obj;
	//  168  347:aload           5
	//  169  349:astore          9
		i++;
	//  170  351:iload_1         
	//  171  352:iconst_1        
	//  172  353:iadd            
	//  173  354:istore_1        
		obj1 = obj4;
	//  174  355:aload           9
	//  175  357:astore          6
		obj2 = obj3;
	//  176  359:aload           8
	//  177  361:astore          7
		if(true) goto _L2; else goto _L1
	//  178  363:goto            91
_L1:
		if(j > 18)
			break MISSING_BLOCK_LABEL_418;
	//  179  366:iload_2         
	//  180  367:bipush          18
	//  181  369:icmpgt          418
		context = ((Context) (obj));
	//  182  372:aload           5
	//  183  374:astore_0        
		if(obj != null)
			break MISSING_BLOCK_LABEL_416;
	//  184  375:aload           5
	//  185  377:ifnonnull       416
		context = ((Context) (obj));
	//  186  380:aload           5
	//  187  382:astore_0        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_416;
	//  188  383:aload           6
	//  189  385:ifnull          416
		context = ((Context) (obj));
	//  190  388:aload           5
	//  191  390:astore_0        
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_416;
	//  192  391:aload           7
	//  193  393:ifnull          416
		flag = ((String) (obj2)).equals("mounted");
	//  194  396:aload           7
	//  195  398:ldc1            #171 <String "mounted">
	//  196  400:invokevirtual   #175 <Method boolean String.equals(Object)>
	//  197  403:istore          4
		context = ((Context) (obj));
	//  198  405:aload           5
	//  199  407:astore_0        
		if(flag)
	//* 200  408:iload           4
	//* 201  410:ifeq            416
			context = ((Context) (obj1));
	//  202  413:aload           6
	//  203  415:astore_0        
		return ((String) (context));
	//  204  416:aload_0         
	//  205  417:areturn         
		context = ((Context) (obj));
	//  206  418:aload           5
	//  207  420:astore_0        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_454;
	//  208  421:aload           6
	//  209  423:ifnull          454
		context = ((Context) (obj));
	//  210  426:aload           5
	//  211  428:astore_0        
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_454;
	//  212  429:aload           7
	//  213  431:ifnull          454
		flag = ((String) (obj2)).equals("mounted");
	//  214  434:aload           7
	//  215  436:ldc1            #171 <String "mounted">
	//  216  438:invokevirtual   #175 <Method boolean String.equals(Object)>
	//  217  441:istore          4
		context = ((Context) (obj));
	//  218  443:aload           5
	//  219  445:astore_0        
		if(flag)
	//* 220  446:iload           4
	//* 221  448:ifeq            454
			context = ((Context) (obj1));
	//  222  451:aload           6
	//  223  453:astore_0        
		return ((String) (context));
	//  224  454:aload_0         
	//  225  455:areturn         
		context;
	//  226  456:astore_0        
		if(Environment.getExternalStorageState().equals("mounted"))
	//* 227  457:invokestatic    #187 <Method String Environment.getExternalStorageState()>
	//* 228  460:ldc1            #171 <String "mounted">
	//* 229  462:invokevirtual   #175 <Method boolean String.equals(Object)>
	//* 230  465:ifeq            475
			return Environment.getExternalStorageDirectory().toString();
	//  231  468:invokestatic    #191 <Method File Environment.getExternalStorageDirectory()>
	//  232  471:invokevirtual   #194 <Method String File.toString()>
	//  233  474:areturn         
		else
			return null;
	//  234  475:aconst_null     
	//  235  476:areturn         
	}

	public static String getMapBaseStorage(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = android.os.Build.VERSION.SDK_INT;
	//    4    6:getstatic       #111 <Field int android.os.Build$VERSION.SDK_INT>
	//    5    9:istore_1        
		String s = "map_base_path";
	//    6   10:ldc1            #197 <String "map_base_path">
	//    7   12:astore_2        
		if(i > 18)
	//*   8   13:iload_1         
	//*   9   14:bipush          18
	//*  10   16:icmple          22
			s = "map_base_path_v44";
	//   11   19:ldc1            #199 <String "map_base_path_v44">
	//   12   21:astore_2        
		SharedPreferences sharedpreferences = context.getSharedPreferences("base_path", 0);
	//   13   22:aload_0         
	//   14   23:ldc1            #201 <String "base_path">
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #205 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   17   29:astore          4
		String s1;
		if(MapsInitializer.sdcardDir != null && MapsInitializer.sdcardDir.trim().length() > 0)
	//*  18   31:getstatic       #210 <Field String MapsInitializer.sdcardDir>
	//*  19   34:ifnull          75
	//*  20   37:getstatic       #210 <Field String MapsInitializer.sdcardDir>
	//*  21   40:invokevirtual   #213 <Method String String.trim()>
	//*  22   43:invokevirtual   #216 <Method int String.length()>
	//*  23   46:ifle            75
			s1 = (new StringBuilder()).append(MapsInitializer.sdcardDir).append(File.separatorChar).toString();
	//   24   49:new             #218 <Class StringBuilder>
	//   25   52:dup             
	//   26   53:invokespecial   #219 <Method void StringBuilder()>
	//   27   56:getstatic       #210 <Field String MapsInitializer.sdcardDir>
	//   28   59:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:getstatic       #226 <Field char File.separatorChar>
	//   30   65:invokevirtual   #229 <Method StringBuilder StringBuilder.append(char)>
	//   31   68:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   32   71:astore_3        
		else
	//*  33   72:goto            86
			s1 = sharedpreferences.getString(s, "");
	//   34   75:aload           4
	//   35   77:aload_2         
	//   36   78:ldc1            #141 <String "">
	//   37   80:invokeinterface #236 <Method String SharedPreferences.getString(String, String)>
	//   38   85:astore_3        
		if(s1 != null && s1.length() > 2)
	//*  39   86:aload_3         
	//*  40   87:ifnull          212
	//*  41   90:aload_3         
	//*  42   91:invokevirtual   #216 <Method int String.length()>
	//*  43   94:iconst_2        
	//*  44   95:icmple          212
		{
			File file1 = new File(s1);
	//   45   98:new             #26  <Class File>
	//   46  101:dup             
	//   47  102:aload_3         
	//   48  103:invokespecial   #238 <Method void File(String)>
	//   49  106:astore          5
			if(!file1.exists())
	//*  50  108:aload           5
	//*  51  110:invokevirtual   #44  <Method boolean File.exists()>
	//*  52  113:ifne            122
				file1.mkdir();
	//   53  116:aload           5
	//   54  118:invokevirtual   #241 <Method boolean File.mkdir()>
	//   55  121:pop             
			if(file1.isDirectory())
	//*  56  122:aload           5
	//*  57  124:invokevirtual   #92  <Method boolean File.isDirectory()>
	//*  58  127:ifeq            212
			{
				if(checkCanWrite(file1))
	//*  59  130:aload           5
	//*  60  132:invokestatic    #243 <Method boolean checkCanWrite(File)>
	//*  61  135:ifeq            140
					return s1;
	//   62  138:aload_3         
	//   63  139:areturn         
				s1 = (new StringBuilder()).append(context.getCacheDir().toString()).append("/amap/").toString();
	//   64  140:new             #218 <Class StringBuilder>
	//   65  143:dup             
	//   66  144:invokespecial   #219 <Method void StringBuilder()>
	//   67  147:aload_0         
	//   68  148:invokevirtual   #246 <Method File Context.getCacheDir()>
	//   69  151:invokevirtual   #194 <Method String File.toString()>
	//   70  154:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   71  157:ldc1            #248 <String "/amap/">
	//   72  159:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   73  162:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   74  165:astore_3        
				if(s1 != null && s1.length() > 2)
	//*  75  166:aload_3         
	//*  76  167:ifnull          212
	//*  77  170:aload_3         
	//*  78  171:invokevirtual   #216 <Method int String.length()>
	//*  79  174:iconst_2        
	//*  80  175:icmple          212
				{
					File file2 = new File(s1);
	//   81  178:new             #26  <Class File>
	//   82  181:dup             
	//   83  182:aload_3         
	//   84  183:invokespecial   #238 <Method void File(String)>
	//   85  186:astore          5
					if(!file2.exists())
	//*  86  188:aload           5
	//*  87  190:invokevirtual   #44  <Method boolean File.exists()>
	//*  88  193:ifne            202
						file2.mkdir();
	//   89  196:aload           5
	//   90  198:invokevirtual   #241 <Method boolean File.mkdir()>
	//   91  201:pop             
					if(file2.isDirectory())
	//*  92  202:aload           5
	//*  93  204:invokevirtual   #92  <Method boolean File.isDirectory()>
	//*  94  207:ifeq            212
						return s1;
	//   95  210:aload_3         
	//   96  211:areturn         
				}
			}
		}
		s1 = (new StringBuilder()).append(getExternalStroragePath(context)).append("/amap/").toString();
	//   97  212:new             #218 <Class StringBuilder>
	//   98  215:dup             
	//   99  216:invokespecial   #219 <Method void StringBuilder()>
	//  100  219:aload_0         
	//  101  220:invokestatic    #250 <Method String getExternalStroragePath(Context)>
	//  102  223:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//  103  226:ldc1            #248 <String "/amap/">
	//  104  228:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//  105  231:invokevirtual   #230 <Method String StringBuilder.toString()>
	//  106  234:astore_3        
		if(s1 != null && s1.length() > 2)
	//* 107  235:aload_3         
	//* 108  236:ifnull          317
	//* 109  239:aload_3         
	//* 110  240:invokevirtual   #216 <Method int String.length()>
	//* 111  243:iconst_2        
	//* 112  244:icmple          317
		{
			File file3 = new File(s1);
	//  113  247:new             #26  <Class File>
	//  114  250:dup             
	//  115  251:aload_3         
	//  116  252:invokespecial   #238 <Method void File(String)>
	//  117  255:astore          5
			if(!file3.exists())
	//* 118  257:aload           5
	//* 119  259:invokevirtual   #44  <Method boolean File.exists()>
	//* 120  262:ifne            271
				file3.mkdir();
	//  121  265:aload           5
	//  122  267:invokevirtual   #241 <Method boolean File.mkdir()>
	//  123  270:pop             
			if(file3.isDirectory() && file3.canWrite())
	//* 124  271:aload           5
	//* 125  273:invokevirtual   #92  <Method boolean File.isDirectory()>
	//* 126  276:ifeq            317
	//* 127  279:aload           5
	//* 128  281:invokevirtual   #30  <Method boolean File.canWrite()>
	//* 129  284:ifeq            317
			{
				context = ((Context) (sharedpreferences.edit()));
	//  130  287:aload           4
	//  131  289:invokeinterface #254 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//  132  294:astore_0        
				((android.content.SharedPreferences.Editor) (context)).putString(s, s1);
	//  133  295:aload_0         
	//  134  296:aload_2         
	//  135  297:aload_3         
	//  136  298:invokeinterface #260 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  137  303:pop             
				((android.content.SharedPreferences.Editor) (context)).commit();
	//  138  304:aload_0         
	//  139  305:invokeinterface #263 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//  140  310:pop             
				createNoMediaFileIfNotExist(s1);
	//  141  311:aload_3         
	//  142  312:invokestatic    #265 <Method void createNoMediaFileIfNotExist(String)>
				return s1;
	//  143  315:aload_3         
	//  144  316:areturn         
			}
		}
		context = ((Context) ((new StringBuilder()).append(context.getCacheDir().toString()).append("/amap/").toString()));
	//  145  317:new             #218 <Class StringBuilder>
	//  146  320:dup             
	//  147  321:invokespecial   #219 <Method void StringBuilder()>
	//  148  324:aload_0         
	//  149  325:invokevirtual   #246 <Method File Context.getCacheDir()>
	//  150  328:invokevirtual   #194 <Method String File.toString()>
	//  151  331:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//  152  334:ldc1            #248 <String "/amap/">
	//  153  336:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//  154  339:invokevirtual   #230 <Method String StringBuilder.toString()>
	//  155  342:astore_0        
		if(context != null && ((String) (context)).length() > 2)
	//* 156  343:aload_0         
	//* 157  344:ifnull          385
	//* 158  347:aload_0         
	//* 159  348:invokevirtual   #216 <Method int String.length()>
	//* 160  351:iconst_2        
	//* 161  352:icmple          385
		{
			File file = new File(((String) (context)));
	//  162  355:new             #26  <Class File>
	//  163  358:dup             
	//  164  359:aload_0         
	//  165  360:invokespecial   #238 <Method void File(String)>
	//  166  363:astore_2        
			if(!file.exists())
	//* 167  364:aload_2         
	//* 168  365:invokevirtual   #44  <Method boolean File.exists()>
	//* 169  368:ifne            376
				file.mkdir();
	//  170  371:aload_2         
	//  171  372:invokevirtual   #241 <Method boolean File.mkdir()>
	//  172  375:pop             
			if(file.isDirectory())
	//* 173  376:aload_2         
	//* 174  377:invokevirtual   #92  <Method boolean File.isDirectory()>
	//* 175  380:ifeq            385
				return ((String) (context));
	//  176  383:aload_0         
	//  177  384:areturn         
		}
		return ((String) (context));
	//  178  385:aload_0         
	//  179  386:areturn         
	}

	public static String getName(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return s.substring(indexOfLastSeparator(s) + 1);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokestatic    #271 <Method int indexOfLastSeparator(String)>
	//    7   11:iconst_1        
	//    8   12:iadd            
	//    9   13:invokevirtual   #275 <Method String String.substring(int)>
	//   10   16:areturn         
	}

	public static int indexOfLastSeparator(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		else
			return Math.max(s.lastIndexOf('/'), s.lastIndexOf('\\'));
	//    4    6:aload_0         
	//    5    7:bipush          47
	//    6    9:invokevirtual   #279 <Method int String.lastIndexOf(int)>
	//    7   12:aload_0         
	//    8   13:bipush          92
	//    9   15:invokevirtual   #279 <Method int String.lastIndexOf(int)>
	//   10   18:invokestatic    #285 <Method int Math.max(int, int)>
	//   11   21:ireturn         
	}

	public static byte[] readFileContents(String s)
	{
		int i;
		boolean flag;
		byte abyte0[];
		ByteArrayOutputStream bytearrayoutputstream;
		try
		{
			s = ((String) (new File(s)));
	//    0    0:new             #26  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #238 <Method void File(String)>
	//    4    8:astore_0        
			flag = ((File) (s)).exists();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #44  <Method boolean File.exists()>
	//    7   13:istore_2        
		}
	//*   8   14:iload_2         
	//*   9   15:ifne            20
	//*  10   18:aconst_null     
	//*  11   19:areturn         
	//*  12   20:new             #289 <Class FileInputStream>
	//*  13   23:dup             
	//*  14   24:aload_0         
	//*  15   25:invokespecial   #290 <Method void FileInputStream(File)>
	//*  16   28:astore_0        
	//*  17   29:sipush          1024
	//*  18   32:newarray        byte[]
	//*  19   34:astore_3        
	//*  20   35:new             #292 <Class ByteArrayOutputStream>
	//*  21   38:dup             
	//*  22   39:invokespecial   #293 <Method void ByteArrayOutputStream()>
	//*  23   42:astore          4
	//*  24   44:aload_0         
	//*  25   45:aload_3         
	//*  26   46:invokevirtual   #294 <Method int FileInputStream.read(byte[])>
	//*  27   49:istore_1        
	//*  28   50:iload_1         
	//*  29   51:iconst_m1       
	//*  30   52:icmpeq          66
	//*  31   55:aload           4
	//*  32   57:aload_3         
	//*  33   58:iconst_0        
	//*  34   59:iload_1         
	//*  35   60:invokevirtual   #297 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//*  36   63:goto            44
	//*  37   66:aload           4
	//*  38   68:invokevirtual   #298 <Method void ByteArrayOutputStream.close()>
	//*  39   71:aload_0         
	//*  40   72:invokevirtual   #299 <Method void FileInputStream.close()>
	//*  41   75:aload           4
	//*  42   77:invokevirtual   #303 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  43   80:astore_0        
	//*  44   81:aload_0         
	//*  45   82:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  46   83:astore_0        
		{
			((Throwable) (s)).printStackTrace();
	//   47   84:aload_0         
	//   48   85:invokevirtual   #304 <Method void Throwable.printStackTrace()>
			return null;
	//   49   88:aconst_null     
	//   50   89:areturn         
		}
		if(!flag)
			return null;
		s = ((String) (new FileInputStream(((File) (s)))));
		abyte0 = new byte[1024];
		bytearrayoutputstream = new ByteArrayOutputStream();
_L1:
		i = ((FileInputStream) (s)).read(abyte0);
		if(i == -1)
			break MISSING_BLOCK_LABEL_66;
		bytearrayoutputstream.write(abyte0, 0, i);
		  goto _L1
		bytearrayoutputstream.close();
		((FileInputStream) (s)).close();
		s = ((String) (bytearrayoutputstream.toByteArray()));
		return ((byte []) (s));
	}

	public static byte[] readFileContentsFromAssets(Context context, String s)
	{
		context = ((Context) (context.getAssets()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method AssetManager Context.getAssets()>
	//    2    4:astore_0        
		int i;
		int j;
		try
		{
			context = ((Context) (((AssetManager) (context)).open(s)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #62  <Method InputStream AssetManager.open(String)>
	//    6   10:astore_0        
			j = ((InputStream) (context)).available();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #68  <Method int InputStream.available()>
	//    9   15:istore_3        
		}
	//*  10   16:iload_3         
	//*  11   17:ifne            22
	//*  12   20:aconst_null     
	//*  13   21:areturn         
	//*  14   22:iload_3         
	//*  15   23:newarray        byte[]
	//*  16   25:astore_1        
	//*  17   26:iconst_0        
	//*  18   27:istore_2        
	//*  19   28:iload_2         
	//*  20   29:iload_3         
	//*  21   30:icmpge          48
	//*  22   33:iload_2         
	//*  23   34:aload_0         
	//*  24   35:aload_1         
	//*  25   36:iload_2         
	//*  26   37:iload_3         
	//*  27   38:iload_2         
	//*  28   39:isub            
	//*  29   40:invokevirtual   #311 <Method int InputStream.read(byte[], int, int)>
	//*  30   43:iadd            
	//*  31   44:istore_2        
	//*  32   45:goto            28
	//*  33   48:aload_0         
	//*  34   49:invokevirtual   #75  <Method void InputStream.close()>
	//*  35   52:aload_1         
	//*  36   53:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  37   54:astore_0        
		{
			return null;
	//   38   55:aconst_null     
	//   39   56:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  40   57:astore_0        
		{
			return null;
	//   41   58:aconst_null     
	//   42   59:areturn         
		}
		if(j == 0)
			return null;
		s = ((String) (new byte[j]));
		i = 0;
_L1:
		if(i >= j)
			break MISSING_BLOCK_LABEL_48;
		i += ((InputStream) (context)).read(((byte []) (s)), i, j - i);
		  goto _L1
		((InputStream) (context)).close();
		return ((byte []) (s));
	}

	public static void saveFile(String s, String s1, boolean flag)
	{
		try
		{
			String s2 = Environment.getExternalStorageDirectory().getAbsolutePath();
	//    0    0:invokestatic    #191 <Method File Environment.getExternalStorageDirectory()>
	//    1    3:invokevirtual   #182 <Method String File.getAbsolutePath()>
	//    2    6:astore_3        
			s1 = ((String) (new File((new StringBuilder()).append(s2).append("/").append(s1).toString())));
	//    3    7:new             #26  <Class File>
	//    4   10:dup             
	//    5   11:new             #218 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #219 <Method void StringBuilder()>
	//    8   18:aload_3         
	//    9   19:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc2            #317 <String "/">
	//   11   25:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   15   35:invokespecial   #238 <Method void File(String)>
	//   16   38:astore_1        
			if(!((File) (s1)).exists())
	//*  17   39:aload_1         
	//*  18   40:invokevirtual   #44  <Method boolean File.exists()>
	//*  19   43:ifne            66
			{
				(new File(((File) (s1)).getParent())).mkdirs();
	//   20   46:new             #26  <Class File>
	//   21   49:dup             
	//   22   50:aload_1         
	//   23   51:invokevirtual   #320 <Method String File.getParent()>
	//   24   54:invokespecial   #238 <Method void File(String)>
	//   25   57:invokevirtual   #323 <Method boolean File.mkdirs()>
	//   26   60:pop             
				((File) (s1)).createNewFile();
	//   27   61:aload_1         
	//   28   62:invokevirtual   #38  <Method boolean File.createNewFile()>
	//   29   65:pop             
			}
			s1 = ((String) (new FileOutputStream(((File) (s1)), flag)));
	//   30   66:new             #77  <Class FileOutputStream>
	//   31   69:dup             
	//   32   70:aload_1         
	//   33   71:iload_2         
	//   34   72:invokespecial   #326 <Method void FileOutputStream(File, boolean)>
	//   35   75:astore_1        
			((FileOutputStream) (s1)).write(s.getBytes("utf-8"));
	//   36   76:aload_1         
	//   37   77:aload_0         
	//   38   78:ldc2            #328 <String "utf-8">
	//   39   81:invokevirtual   #331 <Method byte[] String.getBytes(String)>
	//   40   84:invokevirtual   #84  <Method void FileOutputStream.write(byte[])>
			((FileOutputStream) (s1)).close();
	//   41   87:aload_1         
	//   42   88:invokevirtual   #85  <Method void FileOutputStream.close()>
			return;
	//   43   91:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  44   92:astore_0        
		{
			((FileNotFoundException) (s)).printStackTrace();
	//   45   93:aload_0         
	//   46   94:invokevirtual   #332 <Method void FileNotFoundException.printStackTrace()>
			return;
	//   47   97:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  48   98:astore_0        
		{
			((IOException) (s)).printStackTrace();
	//   49   99:aload_0         
	//   50  100:invokevirtual   #41  <Method void IOException.printStackTrace()>
		}
	//   51  103:return          
	}

	public static void writeDatasToFile(String s, byte abyte0[])
	{
		java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writelock;
		writelock = (new ReentrantReadWriteLock()).writeLock();
	//    0    0:new             #336 <Class ReentrantReadWriteLock>
	//    1    3:dup             
	//    2    4:invokespecial   #337 <Method void ReentrantReadWriteLock()>
	//    3    7:invokevirtual   #341 <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//    4   10:astore_3        
		writelock.lock();
	//    5   11:aload_3         
	//    6   12:invokevirtual   #346 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()>
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_26;
	//    7   15:aload_1         
	//    8   16:ifnull          26
		int i = abyte0.length;
	//    9   19:aload_1         
	//   10   20:arraylength     
	//   11   21:istore_2        
		if(i != 0)
			break MISSING_BLOCK_LABEL_31;
	//   12   22:iload_2         
	//   13   23:ifne            31
		writelock.unlock();
	//   14   26:aload_3         
	//   15   27:invokevirtual   #349 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		return;
	//   16   30:return          
		s = ((String) (new File(s)));
	//   17   31:new             #26  <Class File>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:invokespecial   #238 <Method void File(String)>
	//   21   39:astore_0        
		if(((File) (s)).exists())
	//*  22   40:aload_0         
	//*  23   41:invokevirtual   #44  <Method boolean File.exists()>
	//*  24   44:ifeq            52
			((File) (s)).delete();
	//   25   47:aload_0         
	//   26   48:invokevirtual   #47  <Method boolean File.delete()>
	//   27   51:pop             
		((File) (s)).createNewFile();
	//   28   52:aload_0         
	//   29   53:invokevirtual   #38  <Method boolean File.createNewFile()>
	//   30   56:pop             
		s = ((String) (new FileOutputStream(((File) (s)))));
	//   31   57:new             #77  <Class FileOutputStream>
	//   32   60:dup             
	//   33   61:aload_0         
	//   34   62:invokespecial   #80  <Method void FileOutputStream(File)>
	//   35   65:astore_0        
		((OutputStream) (s)).write(abyte0);
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:invokevirtual   #352 <Method void OutputStream.write(byte[])>
		((OutputStream) (s)).flush();
	//   39   71:aload_0         
	//   40   72:invokevirtual   #355 <Method void OutputStream.flush()>
		((OutputStream) (s)).close();
	//   41   75:aload_0         
	//   42   76:invokevirtual   #356 <Method void OutputStream.close()>
		writelock.unlock();
	//   43   79:aload_3         
	//   44   80:invokevirtual   #349 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		return;
	//   45   83:return          
		s;
	//   46   84:astore_0        
		((Exception) (s)).printStackTrace();
	//   47   85:aload_0         
	//   48   86:invokevirtual   #48  <Method void Exception.printStackTrace()>
		writelock.unlock();
	//   49   89:aload_3         
	//   50   90:invokevirtual   #349 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		return;
	//   51   93:return          
		s;
	//   52   94:astore_0        
		writelock.unlock();
	//   53   95:aload_3         
	//   54   96:invokevirtual   #349 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		throw s;
	//   55   99:aload_0         
	//   56  100:athrow          
	}

	private static final String TAG = "FileUtil";
	private static final char UNIX_SEPARATOR = 47;
	private static final char WINDOWS_SEPARATOR = 92;
}
