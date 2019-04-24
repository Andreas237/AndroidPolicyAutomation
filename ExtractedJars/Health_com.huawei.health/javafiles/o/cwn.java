// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.os.Process;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package o:
//			dho, dbf

public class cwn
	implements Thread.UncaughtExceptionHandler
{

	private cwn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		e = ((DateFormat) (new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.CHINA)));
	//    2    4:aload_0         
	//    3    5:new             #33  <Class SimpleDateFormat>
	//    4    8:dup             
	//    5    9:ldc1            #35  <String "yyyy-MM-dd-HH-mm-ss">
	//    6   11:getstatic       #41  <Field Locale Locale.CHINA>
	//    7   14:invokespecial   #44  <Method void SimpleDateFormat(String, Locale)>
	//    8   17:putfield        #46  <Field DateFormat e>
		b = "/data/data/com.huawei.health/files/huawei";
	//    9   20:aload_0         
	//   10   21:ldc1            #48  <String "/data/data/com.huawei.health/files/huawei">
	//   11   23:putfield        #50  <Field String b>
		h = Executors.newCachedThreadPool();
	//   12   26:aload_0         
	//   13   27:invokestatic    #56  <Method ExecutorService Executors.newCachedThreadPool()>
	//   14   30:putfield        #58  <Field ExecutorService h>
	//   15   33:return          
	}

	public static cwn a()
	{
		return a;
	//    0    0:getstatic       #29  <Field cwn a>
	//    1    3:areturn         
	}

	private File c()
	{
		File file = new File((new StringBuilder()).append(b).append("huawei_crashLog_").append("0").append(".txt").toString());
	//    0    0:new             #62  <Class File>
	//    1    3:dup             
	//    2    4:new             #64  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #65  <Method void StringBuilder()>
	//    5   11:aload_0         
	//    6   12:getfield        #50  <Field String b>
	//    7   15:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:ldc1            #71  <String "huawei_crashLog_">
	//    9   20:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:ldc1            #73  <String "0">
	//   11   25:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:ldc1            #75  <String ".txt">
	//   13   30:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   15   36:invokespecial   #82  <Method void File(String)>
	//   16   39:astore_2        
		if(file.exists() && file.length() > 0x100000L)
	//*  17   40:aload_2         
	//*  18   41:invokevirtual   #86  <Method boolean File.exists()>
	//*  19   44:ifeq            249
	//*  20   47:aload_2         
	//*  21   48:invokevirtual   #90  <Method long File.length()>
	//*  22   51:ldc2w           #91  <Long 0x100000L>
	//*  23   54:lcmp            
	//*  24   55:ifle            249
		{
			File file1 = new File((new StringBuilder()).append(b).append("huawei_crashLog_").append(2).append(".txt").toString());
	//   25   58:new             #62  <Class File>
	//   26   61:dup             
	//   27   62:new             #64  <Class StringBuilder>
	//   28   65:dup             
	//   29   66:invokespecial   #65  <Method void StringBuilder()>
	//   30   69:aload_0         
	//   31   70:getfield        #50  <Field String b>
	//   32   73:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   33   76:ldc1            #71  <String "huawei_crashLog_">
	//   34   78:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   35   81:iconst_2        
	//   36   82:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   37   85:ldc1            #75  <String ".txt">
	//   38   87:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   39   90:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   40   93:invokespecial   #82  <Method void File(String)>
	//   41   96:astore_3        
			if(file1.exists() && !file1.delete())
	//*  42   97:aload_3         
	//*  43   98:invokevirtual   #86  <Method boolean File.exists()>
	//*  44  101:ifeq            127
	//*  45  104:aload_3         
	//*  46  105:invokevirtual   #98  <Method boolean File.delete()>
	//*  47  108:ifne            127
			{
				dho.e("MyCrashHandler", new Object[] {
					"delete log file failed"
				});
	//   48  111:ldc1            #100 <String "MyCrashHandler">
	//   49  113:iconst_1        
	//   50  114:anewarray       Object[]
	//   51  117:dup             
	//   52  118:iconst_0        
	//   53  119:ldc1            #102 <String "delete log file failed">
	//   54  121:aastore         
	//   55  122:invokestatic    #107 <Method void dho.e(String, Object[])>
				return null;
	//   56  125:aconst_null     
	//   57  126:areturn         
			}
			for(int i = 1; i >= 0; i--)
	//*  58  127:iconst_1        
	//*  59  128:istore_1        
	//*  60  129:iload_1         
	//*  61  130:iflt            249
			{
				File file2 = new File((new StringBuilder()).append(b).append("huawei_crashLog_").append(i).append(".txt").toString());
	//   62  133:new             #62  <Class File>
	//   63  136:dup             
	//   64  137:new             #64  <Class StringBuilder>
	//   65  140:dup             
	//   66  141:invokespecial   #65  <Method void StringBuilder()>
	//   67  144:aload_0         
	//   68  145:getfield        #50  <Field String b>
	//   69  148:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   70  151:ldc1            #71  <String "huawei_crashLog_">
	//   71  153:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   72  156:iload_1         
	//   73  157:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   74  160:ldc1            #75  <String ".txt">
	//   75  162:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   76  165:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   77  168:invokespecial   #82  <Method void File(String)>
	//   78  171:astore_3        
				if(file2.exists() && !file2.renameTo(new File((new StringBuilder()).append(b).append("huawei_crashLog_").append(i + 1).append(".txt").toString())))
	//*  79  172:aload_3         
	//*  80  173:invokevirtual   #86  <Method boolean File.exists()>
	//*  81  176:ifeq            242
	//*  82  179:aload_3         
	//*  83  180:new             #62  <Class File>
	//*  84  183:dup             
	//*  85  184:new             #64  <Class StringBuilder>
	//*  86  187:dup             
	//*  87  188:invokespecial   #65  <Method void StringBuilder()>
	//*  88  191:aload_0         
	//*  89  192:getfield        #50  <Field String b>
	//*  90  195:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  91  198:ldc1            #71  <String "huawei_crashLog_">
	//*  92  200:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  93  203:iload_1         
	//*  94  204:iconst_1        
	//*  95  205:iadd            
	//*  96  206:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//*  97  209:ldc1            #75  <String ".txt">
	//*  98  211:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//*  99  214:invokevirtual   #79  <Method String StringBuilder.toString()>
	//* 100  217:invokespecial   #82  <Method void File(String)>
	//* 101  220:invokevirtual   #111 <Method boolean File.renameTo(File)>
	//* 102  223:ifne            242
				{
					dho.e("MyCrashHandler", new Object[] {
						"rename log file failed"
					});
	//  103  226:ldc1            #100 <String "MyCrashHandler">
	//  104  228:iconst_1        
	//  105  229:anewarray       Object[]
	//  106  232:dup             
	//  107  233:iconst_0        
	//  108  234:ldc1            #113 <String "rename log file failed">
	//  109  236:aastore         
	//  110  237:invokestatic    #107 <Method void dho.e(String, Object[])>
					return null;
	//  111  240:aconst_null     
	//  112  241:areturn         
				}
			}

	//  113  242:iload_1         
	//  114  243:iconst_1        
	//  115  244:isub            
	//  116  245:istore_1        
		}
	//* 117  246:goto            129
		return file;
	//  118  249:aload_2         
	//  119  250:areturn         
	}

	static void c(cwn cwn1, Throwable throwable)
	{
		cwn1.d(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #117 <Method void d(Throwable)>
	//    3    5:return          
	}

	static String d(cwn cwn1)
	{
		return cwn1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String b>
	//    2    4:areturn         
	}

	private void d(Throwable throwable)
	{
		FileOutputStream fileoutputstream;
		FileOutputStream fileoutputstream1;
		FileOutputStream fileoutputstream2;
		FileOutputStream fileoutputstream3;
		PrintStream printstream;
		Object obj;
		dho.b("MyCrashHandler", new Object[] {
			"saveCrashInfo()"
		});
	//    0    0:ldc1            #100 <String "MyCrashHandler">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #126 <String "saveCrashInfo()">
	//    6   10:aastore         
	//    7   11:invokestatic    #128 <Method void dho.b(String, Object[])>
		printstream = null;
	//    8   14:aconst_null     
	//    9   15:astore          6
		obj = null;
	//   10   17:aconst_null     
	//   11   18:astore          7
		fileoutputstream3 = null;
	//   12   20:aconst_null     
	//   13   21:astore          5
		fileoutputstream1 = fileoutputstream3;
	//   14   23:aload           5
	//   15   25:astore_3        
		fileoutputstream2 = ((FileOutputStream) (printstream));
	//   16   26:aload           6
	//   17   28:astore          4
		fileoutputstream = ((FileOutputStream) (obj));
	//   18   30:aload           7
	//   19   32:astore_2        
		String s = e.format(new Date());
	//   20   33:aload_0         
	//   21   34:getfield        #46  <Field DateFormat e>
	//   22   37:new             #130 <Class Date>
	//   23   40:dup             
	//   24   41:invokespecial   #131 <Method void Date()>
	//   25   44:invokevirtual   #137 <Method String DateFormat.format(Date)>
	//   26   47:astore          8
		fileoutputstream1 = fileoutputstream3;
	//   27   49:aload           5
	//   28   51:astore_3        
		fileoutputstream2 = ((FileOutputStream) (printstream));
	//   29   52:aload           6
	//   30   54:astore          4
		fileoutputstream = ((FileOutputStream) (obj));
	//   31   56:aload           7
	//   32   58:astore_2        
		fileoutputstream3 = new FileOutputStream(c(), true);
	//   33   59:new             #139 <Class FileOutputStream>
	//   34   62:dup             
	//   35   63:aload_0         
	//   36   64:invokespecial   #141 <Method File c()>
	//   37   67:iconst_1        
	//   38   68:invokespecial   #144 <Method void FileOutputStream(File, boolean)>
	//   39   71:astore          5
		fileoutputstream1 = fileoutputstream3;
	//   40   73:aload           5
	//   41   75:astore_3        
		fileoutputstream2 = fileoutputstream3;
	//   42   76:aload           5
	//   43   78:astore          4
		fileoutputstream = fileoutputstream3;
	//   44   80:aload           5
	//   45   82:astore_2        
		printstream = new PrintStream(((java.io.OutputStream) (fileoutputstream3)), false, "UTF-8");
	//   46   83:new             #146 <Class PrintStream>
	//   47   86:dup             
	//   48   87:aload           5
	//   49   89:iconst_0        
	//   50   90:ldc1            #148 <String "UTF-8">
	//   51   92:invokespecial   #151 <Method void PrintStream(java.io.OutputStream, boolean, String)>
	//   52   95:astore          6
		fileoutputstream1 = fileoutputstream3;
	//   53   97:aload           5
	//   54   99:astore_3        
		fileoutputstream2 = fileoutputstream3;
	//   55  100:aload           5
	//   56  102:astore          4
		fileoutputstream = fileoutputstream3;
	//   57  104:aload           5
	//   58  106:astore_2        
		printstream.print((new StringBuilder()).append(s).append("\n").toString());
	//   59  107:aload           6
	//   60  109:new             #64  <Class StringBuilder>
	//   61  112:dup             
	//   62  113:invokespecial   #65  <Method void StringBuilder()>
	//   63  116:aload           8
	//   64  118:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   65  121:ldc1            #153 <String "\n">
	//   66  123:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   67  126:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   68  129:invokevirtual   #156 <Method void PrintStream.print(String)>
		fileoutputstream1 = fileoutputstream3;
	//   69  132:aload           5
	//   70  134:astore_3        
		fileoutputstream2 = fileoutputstream3;
	//   71  135:aload           5
	//   72  137:astore          4
		fileoutputstream = fileoutputstream3;
	//   73  139:aload           5
	//   74  141:astore_2        
		throwable.printStackTrace(printstream);
	//   75  142:aload_1         
	//   76  143:aload           6
	//   77  145:invokevirtual   #162 <Method void Throwable.printStackTrace(PrintStream)>
		fileoutputstream1 = fileoutputstream3;
	//   78  148:aload           5
	//   79  150:astore_3        
		fileoutputstream2 = fileoutputstream3;
	//   80  151:aload           5
	//   81  153:astore          4
		fileoutputstream = fileoutputstream3;
	//   82  155:aload           5
	//   83  157:astore_2        
		printstream.flush();
	//   84  158:aload           6
	//   85  160:invokevirtual   #165 <Method void PrintStream.flush()>
		fileoutputstream1 = fileoutputstream3;
	//   86  163:aload           5
	//   87  165:astore_3        
		fileoutputstream2 = fileoutputstream3;
	//   88  166:aload           5
	//   89  168:astore          4
		fileoutputstream = fileoutputstream3;
	//   90  170:aload           5
	//   91  172:astore_2        
		printstream.close();
	//   92  173:aload           6
	//   93  175:invokevirtual   #168 <Method void PrintStream.close()>
		if(fileoutputstream3 != null)
	//*  94  178:aload           5
	//*  95  180:ifnull          345
		{
			try
			{
				fileoutputstream3.close();
	//   96  183:aload           5
	//   97  185:invokevirtual   #169 <Method void FileOutputStream.close()>
				return;
	//   98  188:return          
			}
			// Misplaced declaration of an exception variable
			catch(Throwable throwable)
	//*  99  189:astore_1        
			{
				dho.f("MyCrashHandler", new Object[] {
					"close fos fail", throwable
				});
	//  100  190:ldc1            #100 <String "MyCrashHandler">
	//  101  192:iconst_2        
	//  102  193:anewarray       Object[]
	//  103  196:dup             
	//  104  197:iconst_0        
	//  105  198:ldc1            #171 <String "close fos fail">
	//  106  200:aastore         
	//  107  201:dup             
	//  108  202:iconst_1        
	//  109  203:aload_1         
	//  110  204:aastore         
	//  111  205:invokestatic    #174 <Method void dho.f(String, Object[])>
			}
			return;
	//  112  208:return          
		}
		break MISSING_BLOCK_LABEL_345;
		throwable;
	//  113  209:astore_1        
		fileoutputstream = fileoutputstream1;
	//  114  210:aload_3         
	//  115  211:astore_2        
		dho.f("MyCrashHandler", new Object[] {
			"a FileNotFoundException occured while writing file...", throwable
		});
	//  116  212:ldc1            #100 <String "MyCrashHandler">
	//  117  214:iconst_2        
	//  118  215:anewarray       Object[]
	//  119  218:dup             
	//  120  219:iconst_0        
	//  121  220:ldc1            #176 <String "a FileNotFoundException occured while writing file...">
	//  122  222:aastore         
	//  123  223:dup             
	//  124  224:iconst_1        
	//  125  225:aload_1         
	//  126  226:aastore         
	//  127  227:invokestatic    #174 <Method void dho.f(String, Object[])>
		if(fileoutputstream1 != null)
	//* 128  230:aload_3         
	//* 129  231:ifnull          345
		{
			try
			{
				fileoutputstream1.close();
	//  130  234:aload_3         
	//  131  235:invokevirtual   #169 <Method void FileOutputStream.close()>
				return;
	//  132  238:return          
			}
			// Misplaced declaration of an exception variable
			catch(Throwable throwable)
	//* 133  239:astore_1        
			{
				dho.f("MyCrashHandler", new Object[] {
					"close fos fail", throwable
				});
	//  134  240:ldc1            #100 <String "MyCrashHandler">
	//  135  242:iconst_2        
	//  136  243:anewarray       Object[]
	//  137  246:dup             
	//  138  247:iconst_0        
	//  139  248:ldc1            #171 <String "close fos fail">
	//  140  250:aastore         
	//  141  251:dup             
	//  142  252:iconst_1        
	//  143  253:aload_1         
	//  144  254:aastore         
	//  145  255:invokestatic    #174 <Method void dho.f(String, Object[])>
			}
			return;
	//  146  258:return          
		}
		break MISSING_BLOCK_LABEL_345;
		throwable;
	//  147  259:astore_1        
		fileoutputstream = fileoutputstream2;
	//  148  260:aload           4
	//  149  262:astore_2        
		dho.f("MyCrashHandler", new Object[] {
			"an Exception occured while writing file...", throwable
		});
	//  150  263:ldc1            #100 <String "MyCrashHandler">
	//  151  265:iconst_2        
	//  152  266:anewarray       Object[]
	//  153  269:dup             
	//  154  270:iconst_0        
	//  155  271:ldc1            #178 <String "an Exception occured while writing file...">
	//  156  273:aastore         
	//  157  274:dup             
	//  158  275:iconst_1        
	//  159  276:aload_1         
	//  160  277:aastore         
	//  161  278:invokestatic    #174 <Method void dho.f(String, Object[])>
		if(fileoutputstream2 != null)
	//* 162  281:aload           4
	//* 163  283:ifnull          345
		{
			try
			{
				fileoutputstream2.close();
	//  164  286:aload           4
	//  165  288:invokevirtual   #169 <Method void FileOutputStream.close()>
				return;
	//  166  291:return          
			}
			// Misplaced declaration of an exception variable
			catch(Throwable throwable)
	//* 167  292:astore_1        
			{
				dho.f("MyCrashHandler", new Object[] {
					"close fos fail", throwable
				});
	//  168  293:ldc1            #100 <String "MyCrashHandler">
	//  169  295:iconst_2        
	//  170  296:anewarray       Object[]
	//  171  299:dup             
	//  172  300:iconst_0        
	//  173  301:ldc1            #171 <String "close fos fail">
	//  174  303:aastore         
	//  175  304:dup             
	//  176  305:iconst_1        
	//  177  306:aload_1         
	//  178  307:aastore         
	//  179  308:invokestatic    #174 <Method void dho.f(String, Object[])>
			}
			return;
	//  180  311:return          
		}
		break MISSING_BLOCK_LABEL_345;
		throwable;
	//  181  312:astore_1        
		if(fileoutputstream != null)
	//* 182  313:aload_2         
	//* 183  314:ifnull          343
			try
			{
				fileoutputstream.close();
	//  184  317:aload_2         
	//  185  318:invokevirtual   #169 <Method void FileOutputStream.close()>
			}
	//* 186  321:goto            343
			catch(IOException ioexception)
	//* 187  324:astore_2        
			{
				dho.f("MyCrashHandler", new Object[] {
					"close fos fail", ioexception
				});
	//  188  325:ldc1            #100 <String "MyCrashHandler">
	//  189  327:iconst_2        
	//  190  328:anewarray       Object[]
	//  191  331:dup             
	//  192  332:iconst_0        
	//  193  333:ldc1            #171 <String "close fos fail">
	//  194  335:aastore         
	//  195  336:dup             
	//  196  337:iconst_1        
	//  197  338:aload_2         
	//  198  339:aastore         
	//  199  340:invokestatic    #174 <Method void dho.f(String, Object[])>
			}
		throw throwable;
	//  200  343:aload_1         
	//  201  344:athrow          
	//  202  345:return          
	}

	private boolean e(Throwable throwable)
	{
		if(throwable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       20
		{
			dho.b("MyCrashHandler", new Object[] {
				"handleException() ex null"
			});
	//    2    4:ldc1            #100 <String "MyCrashHandler">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #183 <String "handleException() ex null">
	//    8   14:aastore         
	//    9   15:invokestatic    #128 <Method void dho.b(String, Object[])>
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		}
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//   12   20:new             #185 <Class LinkedHashMap>
	//   13   23:dup             
	//   14   24:invokespecial   #186 <Method void LinkedHashMap()>
	//   15   27:astore_2        
		linkedhashmap.put("excetion", ((Object) (throwable.getMessage())));
	//   16   28:aload_2         
	//   17   29:ldc1            #188 <String "excetion">
	//   18   31:aload_1         
	//   19   32:invokevirtual   #191 <Method String Throwable.getMessage()>
	//   20   35:invokevirtual   #195 <Method Object LinkedHashMap.put(Object, Object)>
	//   21   38:pop             
		OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_CRASH_2050003.value(), linkedhashmap);
	//   22   39:invokestatic    #201 <Method OpAnalyticsUtil OpAnalyticsUtil.getInstance()>
	//   23   42:getstatic       #207 <Field OperationKey OperationKey.HEALTH_APP_CRASH_2050003>
	//   24   45:invokevirtual   #210 <Method String OperationKey.value()>
	//   25   48:aload_2         
	//   26   49:invokevirtual   #214 <Method int OpAnalyticsUtil.setEvent(String, LinkedHashMap)>
	//   27   52:pop             
		linkedhashmap = new LinkedHashMap();
	//   28   53:new             #185 <Class LinkedHashMap>
	//   29   56:dup             
	//   30   57:invokespecial   #186 <Method void LinkedHashMap()>
	//   31   60:astore_2        
		linkedhashmap.put("crash_type", ((Object) (throwable.getMessage())));
	//   32   61:aload_2         
	//   33   62:ldc1            #216 <String "crash_type">
	//   34   64:aload_1         
	//   35   65:invokevirtual   #191 <Method String Throwable.getMessage()>
	//   36   68:invokevirtual   #195 <Method Object LinkedHashMap.put(Object, Object)>
	//   37   71:pop             
		OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_CRASH_90030001.value(), linkedhashmap);
	//   38   72:invokestatic    #201 <Method OpAnalyticsUtil OpAnalyticsUtil.getInstance()>
	//   39   75:getstatic       #219 <Field OperationKey OperationKey.HEALTH_APP_CRASH_90030001>
	//   40   78:invokevirtual   #210 <Method String OperationKey.value()>
	//   41   81:aload_2         
	//   42   82:invokevirtual   #222 <Method int OpAnalyticsUtil.setEvent2nd(String, LinkedHashMap)>
	//   43   85:pop             
		dho.b("MyCrashHandler", new Object[] {
			"handleException()"
		});
	//   44   86:ldc1            #100 <String "MyCrashHandler">
	//   45   88:iconst_1        
	//   46   89:anewarray       Object[]
	//   47   92:dup             
	//   48   93:iconst_0        
	//   49   94:ldc1            #224 <String "handleException()">
	//   50   96:aastore         
	//   51   97:invokestatic    #128 <Method void dho.b(String, Object[])>
		dho.f("MyCrashHandler", new Object[] {
			throwable, throwable.getMessage()
		});
	//   52  100:ldc1            #100 <String "MyCrashHandler">
	//   53  102:iconst_2        
	//   54  103:anewarray       Object[]
	//   55  106:dup             
	//   56  107:iconst_0        
	//   57  108:aload_1         
	//   58  109:aastore         
	//   59  110:dup             
	//   60  111:iconst_1        
	//   61  112:aload_1         
	//   62  113:invokevirtual   #191 <Method String Throwable.getMessage()>
	//   63  116:aastore         
	//   64  117:invokestatic    #174 <Method void dho.f(String, Object[])>
		h.execute(new Runnable(throwable) {

			public void run()
			{
				cwn.c(e, d);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field cwn e>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field Throwable d>
			//    4    8:invokestatic    #28  <Method void cwn.c(cwn, Throwable)>
			//    5   11:return          
			}

			final Throwable d;
			final cwn e;

			
			{
				e = cwn.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field cwn e>
				d = throwable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Throwable d>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   65  120:aload_0         
	//   66  121:getfield        #58  <Field ExecutorService h>
	//   67  124:new             #10  <Class cwn$5>
	//   68  127:dup             
	//   69  128:aload_0         
	//   70  129:aload_1         
	//   71  130:invokespecial   #226 <Method void cwn$5(cwn, Throwable)>
	//   72  133:invokeinterface #232 <Method void ExecutorService.execute(Runnable)>
		try
		{
			Thread.sleep(1000L);
	//   73  138:ldc2w           #233 <Long 1000L>
	//   74  141:invokestatic    #240 <Method void Thread.sleep(long)>
		}
	//*  75  144:goto            164
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
	//*  76  147:astore_1        
		{
			dho.f("MyCrashHandler", new Object[] {
				((InterruptedException) (throwable)).getMessage()
			});
	//   77  148:ldc1            #100 <String "MyCrashHandler">
	//   78  150:iconst_1        
	//   79  151:anewarray       Object[]
	//   80  154:dup             
	//   81  155:iconst_0        
	//   82  156:aload_1         
	//   83  157:invokevirtual   #241 <Method String InterruptedException.getMessage()>
	//   84  160:aastore         
	//   85  161:invokestatic    #174 <Method void dho.f(String, Object[])>
		}
		return false;
	//   86  164:iconst_0        
	//   87  165:ireturn         
	}

	public void e(Context context)
	{
		dho.b("MyCrashHandler", new Object[] {
			"init()"
		});
	//    0    0:ldc1            #100 <String "MyCrashHandler">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #244 <String "init()">
	//    6   10:aastore         
	//    7   11:invokestatic    #128 <Method void dho.b(String, Object[])>
		d = context;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #246 <Field Context d>
		c = Thread.getDefaultUncaughtExceptionHandler();
	//   11   19:aload_0         
	//   12   20:invokestatic    #250 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//   13   23:putfield        #252 <Field Thread$UncaughtExceptionHandler c>
		Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (this)));
	//   14   26:aload_0         
	//   15   27:invokestatic    #256 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
		b = dbf.z(d);
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #246 <Field Context d>
	//   19   35:invokestatic    #262 <Method String dbf.z(Context)>
	//   20   38:putfield        #50  <Field String b>
		dho.d("MyCrashHandler", new Object[] {
			"path = ", b
		});
	//   21   41:ldc1            #100 <String "MyCrashHandler">
	//   22   43:iconst_2        
	//   23   44:anewarray       Object[]
	//   24   47:dup             
	//   25   48:iconst_0        
	//   26   49:ldc2            #264 <String "path = ">
	//   27   52:aastore         
	//   28   53:dup             
	//   29   54:iconst_1        
	//   30   55:aload_0         
	//   31   56:getfield        #50  <Field String b>
	//   32   59:aastore         
	//   33   60:invokestatic    #266 <Method void dho.d(String, Object[])>
		(new Thread(new Runnable(new File(b)) {

			public void run()
			{
				if(c.isDirectory())
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field File c>
			//*   2    4:invokevirtual   #33  <Method boolean File.isDirectory()>
			//*   3    7:ifeq            175
				{
					String as[] = c.list();
			//    4   10:aload_0         
			//    5   11:getfield        #20  <Field File c>
			//    6   14:invokevirtual   #37  <Method String[] File.list()>
			//    7   17:astore_2        
					if(as != null && as.length > 0)
			//*   8   18:aload_2         
			//*   9   19:ifnull          175
			//*  10   22:aload_2         
			//*  11   23:arraylength     
			//*  12   24:ifle            175
					{
						for(int i = 0; i < as.length; i++)
			//*  13   27:iconst_0        
			//*  14   28:istore_1        
			//*  15   29:iload_1         
			//*  16   30:aload_2         
			//*  17   31:arraylength     
			//*  18   32:icmpge          175
						{
							dho.d("MyCrashHandler", new Object[] {
								"fileName=", as[i]
							});
			//   19   35:ldc1            #39  <String "MyCrashHandler">
			//   20   37:iconst_2        
			//   21   38:anewarray       Object[]
			//   22   41:dup             
			//   23   42:iconst_0        
			//   24   43:ldc1            #41  <String "fileName=">
			//   25   45:aastore         
			//   26   46:dup             
			//   27   47:iconst_1        
			//   28   48:aload_2         
			//   29   49:iload_1         
			//   30   50:aaload          
			//   31   51:aastore         
			//   32   52:invokestatic    #47  <Method void dho.d(String, Object[])>
							File file = new File((new StringBuilder()).append(cwn.d(e)).append("/").append(as[i]).toString());
			//   33   55:new             #29  <Class File>
			//   34   58:dup             
			//   35   59:new             #49  <Class StringBuilder>
			//   36   62:dup             
			//   37   63:invokespecial   #50  <Method void StringBuilder()>
			//   38   66:aload_0         
			//   39   67:getfield        #18  <Field cwn e>
			//   40   70:invokestatic    #53  <Method String cwn.d(cwn)>
			//   41   73:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//   42   76:ldc1            #59  <String "/">
			//   43   78:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//   44   81:aload_2         
			//   45   82:iload_1         
			//   46   83:aaload          
			//   47   84:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//   48   87:invokevirtual   #63  <Method String StringBuilder.toString()>
			//   49   90:invokespecial   #66  <Method void File(String)>
			//   50   93:astore_3        
							String s = file.getName();
			//   51   94:aload_3         
			//   52   95:invokevirtual   #69  <Method String File.getName()>
			//   53   98:astore          4
							if(!file.isFile() || !s.startsWith("app_crashLog_") || !s.endsWith(".txt"))
								continue;
			//   54  100:aload_3         
			//   55  101:invokevirtual   #72  <Method boolean File.isFile()>
			//   56  104:ifeq            168
			//   57  107:aload           4
			//   58  109:ldc1            #74  <String "app_crashLog_">
			//   59  111:invokevirtual   #80  <Method boolean String.startsWith(String)>
			//   60  114:ifeq            168
			//   61  117:aload           4
			//   62  119:ldc1            #82  <String ".txt">
			//   63  121:invokevirtual   #85  <Method boolean String.endsWith(String)>
			//   64  124:ifeq            168
							try
							{
								if(file.delete())
			//*  65  127:aload_3         
			//*  66  128:invokevirtual   #88  <Method boolean File.delete()>
			//*  67  131:ifeq            148
									dho.d("MyCrashHandler", new Object[] {
										"delFile.delete ,success."
									});
			//   68  134:ldc1            #39  <String "MyCrashHandler">
			//   69  136:iconst_1        
			//   70  137:anewarray       Object[]
			//   71  140:dup             
			//   72  141:iconst_0        
			//   73  142:ldc1            #90  <String "delFile.delete ,success.">
			//   74  144:aastore         
			//   75  145:invokestatic    #47  <Method void dho.d(String, Object[])>
							}
			//*  76  148:goto            168
							catch(Exception exception)
			//*  77  151:astore_3        
							{
								dho.d("MyCrashHandler", new Object[] {
									exception.getMessage()
								});
			//   78  152:ldc1            #39  <String "MyCrashHandler">
			//   79  154:iconst_1        
			//   80  155:anewarray       Object[]
			//   81  158:dup             
			//   82  159:iconst_0        
			//   83  160:aload_3         
			//   84  161:invokevirtual   #93  <Method String Exception.getMessage()>
			//   85  164:aastore         
			//   86  165:invokestatic    #47  <Method void dho.d(String, Object[])>
							}
						}

			//   87  168:iload_1         
			//   88  169:iconst_1        
			//   89  170:iadd            
			//   90  171:istore_1        
					}
				}
			//*  91  172:goto            29
			//   92  175:return          
			}

			final File c;
			final cwn e;

			
			{
				e = cwn.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field cwn e>
				c = file;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field File c>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
)).start();
	//   34   63:new             #236 <Class Thread>
	//   35   66:dup             
	//   36   67:new             #8   <Class cwn$3>
	//   37   70:dup             
	//   38   71:aload_0         
	//   39   72:new             #62  <Class File>
	//   40   75:dup             
	//   41   76:aload_0         
	//   42   77:getfield        #50  <Field String b>
	//   43   80:invokespecial   #82  <Method void File(String)>
	//   44   83:invokespecial   #269 <Method void cwn$3(cwn, File)>
	//   45   86:invokespecial   #271 <Method void Thread(Runnable)>
	//   46   89:invokevirtual   #274 <Method void Thread.start()>
	//   47   92:return          
	}

	public void uncaughtException(Thread thread, Throwable throwable)
	{
		dho.f("MyCrashHandler", new Object[] {
			"uncaughtException()"
		});
	//    0    0:ldc1            #100 <String "MyCrashHandler">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #280 <String "uncaughtException()">
	//    6   11:aastore         
	//    7   12:invokestatic    #174 <Method void dho.f(String, Object[])>
		try
		{
			if(!e(throwable) && c != null)
	//*   8   15:aload_0         
	//*   9   16:aload_2         
	//*  10   17:invokespecial   #282 <Method boolean e(Throwable)>
	//*  11   20:ifne            44
	//*  12   23:aload_0         
	//*  13   24:getfield        #252 <Field Thread$UncaughtExceptionHandler c>
	//*  14   27:ifnull          44
			{
				c.uncaughtException(thread, throwable);
	//   15   30:aload_0         
	//   16   31:getfield        #252 <Field Thread$UncaughtExceptionHandler c>
	//   17   34:aload_1         
	//   18   35:aload_2         
	//   19   36:invokeinterface #284 <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				break MISSING_BLOCK_LABEL_50;
	//   20   41:goto            50
			}
		}
	//*  21   44:invokestatic    #290 <Method int Process.myPid()>
	//*  22   47:invokestatic    #294 <Method void Process.killProcess(int)>
	//*  23   50:return          
		// Misplaced declaration of an exception variable
		catch(Thread thread)
	//*  24   51:astore_1        
		{
			dho.f("MyCrashHandler", new Object[] {
				(new StringBuilder()).append("handleException()").append(((SecurityException) (thread)).getMessage()).toString()
			});
	//   25   52:ldc1            #100 <String "MyCrashHandler">
	//   26   54:iconst_1        
	//   27   55:anewarray       Object[]
	//   28   58:dup             
	//   29   59:iconst_0        
	//   30   60:new             #64  <Class StringBuilder>
	//   31   63:dup             
	//   32   64:invokespecial   #65  <Method void StringBuilder()>
	//   33   67:ldc1            #224 <String "handleException()">
	//   34   69:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   35   72:aload_1         
	//   36   73:invokevirtual   #295 <Method String SecurityException.getMessage()>
	//   37   76:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   39   82:aastore         
	//   40   83:invokestatic    #174 <Method void dho.f(String, Object[])>
			return;
	//   41   86:return          
		}
		Process.killProcess(Process.myPid());
	}

	private static cwn a = new cwn();
	private String b;
	private Thread.UncaughtExceptionHandler c;
	private Context d;
	private DateFormat e;
	private ExecutorService h;

	static 
	{
	//    0    0:new             #2   <Class cwn>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void cwn()>
	//    3    7:putstatic       #29  <Field cwn a>
	//*   4   10:return          
	}
}
