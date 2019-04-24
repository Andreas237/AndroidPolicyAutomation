// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.feedback.logic;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.common.applog.AppLogApi;
import com.huawei.feedback.bean.MetadataBundle;
import com.huawei.feedback.e;
import com.huawei.phoneserviceuni.common.e.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class CrashHandler
	implements Thread.UncaughtExceptionHandler
{

	public CrashHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		infos = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #23  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void HashMap()>
	//    6   12:putfield        #26  <Field Map infos>
	//    7   15:return          
	}

	private void collectStackInfo(Throwable throwable)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #31  <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StringWriter()>
	//    3    7:astore_2        
		PrintWriter printwriter = new PrintWriter(((java.io.Writer) (stringwriter)));
	//    4    8:new             #34  <Class PrintWriter>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:invokespecial   #37  <Method void PrintWriter(java.io.Writer)>
	//    8   16:astore_3        
		throwable.printStackTrace(printwriter);
	//    9   17:aload_1         
	//   10   18:aload_3         
	//   11   19:invokevirtual   #43  <Method void Throwable.printStackTrace(PrintWriter)>
		for(throwable = throwable.getCause(); throwable != null; throwable = throwable.getCause())
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #47  <Method Throwable Throwable.getCause()>
	//*  14   26:astore_1        
	//*  15   27:aload_1         
	//*  16   28:ifnull          44
			throwable.printStackTrace(printwriter);
	//   17   31:aload_1         
	//   18   32:aload_3         
	//   19   33:invokevirtual   #43  <Method void Throwable.printStackTrace(PrintWriter)>

	//   20   36:aload_1         
	//   21   37:invokevirtual   #47  <Method Throwable Throwable.getCause()>
	//   22   40:astore_1        
	//*  23   41:goto            27
		printwriter.close();
	//   24   44:aload_3         
	//   25   45:invokevirtual   #50  <Method void PrintWriter.close()>
		infos.put("errStack", ((Object) (((Object) (stringwriter)).toString())));
	//   26   48:aload_0         
	//   27   49:getfield        #26  <Field Map infos>
	//   28   52:ldc1            #52  <String "errStack">
	//   29   54:aload_2         
	//   30   55:invokevirtual   #56  <Method String Object.toString()>
	//   31   58:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//   32   63:pop             
	//   33   64:return          
	}

	private boolean handleException(Throwable throwable)
	{
		if(throwable == null || mContext == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field Context mContext>
	//*   4    8:ifnonnull       13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		collectDeviceInfo(mContext);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #68  <Field Context mContext>
	//   10   18:invokevirtual   #72  <Method Map collectDeviceInfo(Context)>
	//   11   21:pop             
		collectStackInfo(throwable);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #74  <Method void collectStackInfo(Throwable)>
		Object obj = ((Object) ((String)infos.get("packageName")));
	//   15   27:aload_0         
	//   16   28:getfield        #26  <Field Map infos>
	//   17   31:ldc1            #76  <String "packageName">
	//   18   33:invokeinterface #80  <Method Object Map.get(Object)>
	//   19   38:checkcast       #82  <Class String>
	//   20   41:astore          4
		String s = (String)infos.get("versionName");
	//   21   43:aload_0         
	//   22   44:getfield        #26  <Field Map infos>
	//   23   47:ldc1            #84  <String "versionName">
	//   24   49:invokeinterface #80  <Method Object Map.get(Object)>
	//   25   54:checkcast       #82  <Class String>
	//   26   57:astore          5
		throwable = ((Throwable) ((String)infos.get("errStack")));
	//   27   59:aload_0         
	//   28   60:getfield        #26  <Field Map infos>
	//   29   63:ldc1            #52  <String "errStack">
	//   30   65:invokeinterface #80  <Method Object Map.get(Object)>
	//   31   70:checkcast       #82  <Class String>
	//   32   73:astore_1        
		obj = ((Object) (new MetadataBundle(0x3611954f, ((String) (obj)), s)));
	//   33   74:new             #86  <Class MetadataBundle>
	//   34   77:dup             
	//   35   78:ldc1            #87  <Int 0x3611954f>
	//   36   80:aload           4
	//   37   82:aload           5
	//   38   84:invokespecial   #90  <Method void MetadataBundle(int, String, String)>
	//   39   87:astore          4
		((MetadataBundle) (obj)).putData("errStack", ((String) (throwable)));
	//   40   89:aload           4
	//   41   91:ldc1            #52  <String "errStack">
	//   42   93:aload_1         
	//   43   94:invokevirtual   #94  <Method void MetadataBundle.putData(String, String)>
		((MetadataBundle) (obj)).putData("osVersion", android.os.Build.VERSION.RELEASE);
	//   44   97:aload           4
	//   45   99:ldc1            #96  <String "osVersion">
	//   46  101:getstatic       #101 <Field String android.os.Build$VERSION.RELEASE>
	//   47  104:invokevirtual   #94  <Method void MetadataBundle.putData(String, String)>
		AppLogApi.e("AppLogApi/CrashHandler", ((MetadataBundle) (obj)).toString());
	//   48  107:ldc1            #10  <String "AppLogApi/CrashHandler">
	//   49  109:aload           4
	//   50  111:invokevirtual   #102 <Method String MetadataBundle.toString()>
	//   51  114:invokestatic    #107 <Method void AppLogApi.e(String, String)>
		Bundle bundle = new Bundle();
	//   52  117:new             #109 <Class Bundle>
	//   53  120:dup             
	//   54  121:invokespecial   #110 <Method void Bundle()>
	//   55  124:astore          6
		bundle.putString("MetaData", ((MetadataBundle) (obj)).toString());
	//   56  126:aload           6
	//   57  128:ldc1            #112 <String "MetaData">
	//   58  130:aload           4
	//   59  132:invokevirtual   #102 <Method String MetadataBundle.toString()>
	//   60  135:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		bundle.putString("LogVersion", "1.0");
	//   61  138:aload           6
	//   62  140:ldc1            #117 <String "LogVersion">
	//   63  142:ldc1            #119 <String "1.0">
	//   64  144:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		bundle.putString("LogSubversion", "1.0");
	//   65  147:aload           6
	//   66  149:ldc1            #121 <String "LogSubversion">
	//   67  151:ldc1            #119 <String "1.0">
	//   68  153:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		bundle.putString("ProductName", Build.MODEL);
	//   69  156:aload           6
	//   70  158:ldc1            #123 <String "ProductName">
	//   71  160:getstatic       #128 <Field String Build.MODEL>
	//   72  163:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		bundle.putString("ProductVersion", Build.DISPLAY);
	//   73  166:aload           6
	//   74  168:ldc1            #130 <String "ProductVersion">
	//   75  170:getstatic       #133 <Field String Build.DISPLAY>
	//   76  173:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		obj = ((Object) (e.x(mContext)));
	//   77  176:aload_0         
	//   78  177:getfield        #68  <Field Context mContext>
	//   79  180:invokestatic    #139 <Method String e.x(Context)>
	//   80  183:astore          4
		s = e.r(mContext);
	//   81  185:aload_0         
	//   82  186:getfield        #68  <Field Context mContext>
	//   83  189:invokestatic    #142 <Method String e.r(Context)>
	//   84  192:astore          5
		throwable = ((Throwable) (s));
	//   85  194:aload           5
	//   86  196:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  87  197:aload           5
	//*  88  199:invokestatic    #148 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  89  202:ifeq            208
			throwable = ((Throwable) (obj));
	//   90  205:aload           4
	//   91  207:astore_1        
		bundle.putString("SN", ((String) (obj)));
	//   92  208:aload           6
	//   93  210:ldc1            #150 <String "SN">
	//   94  212:aload           4
	//   95  214:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		bundle.putString("IMEI", ((String) (throwable)));
	//   96  217:aload           6
	//   97  219:ldc1            #152 <String "IMEI">
	//   98  221:aload_1         
	//   99  222:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		bundle.putString("Eventid", String.valueOf(0x3611954f));
	//  100  225:aload           6
	//  101  227:ldc1            #154 <String "Eventid">
	//  102  229:ldc1            #87  <Int 0x3611954f>
	//  103  231:invokestatic    #158 <Method String String.valueOf(int)>
	//  104  234:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		long l = System.currentTimeMillis();
	//  105  237:invokestatic    #164 <Method long System.currentTimeMillis()>
	//  106  240:lstore_2        
		bundle.putString("HappenTime", (new StringBuilder()).append("").append(l).toString());
	//  107  241:aload           6
	//  108  243:ldc1            #166 <String "HappenTime">
	//  109  245:new             #168 <Class StringBuilder>
	//  110  248:dup             
	//  111  249:invokespecial   #169 <Method void StringBuilder()>
	//  112  252:ldc1            #171 <String "">
	//  113  254:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//  114  257:lload_2         
	//  115  258:invokevirtual   #178 <Method StringBuilder StringBuilder.append(long)>
	//  116  261:invokevirtual   #179 <Method String StringBuilder.toString()>
	//  117  264:invokevirtual   #115 <Method void Bundle.putString(String, String)>
		throwable = ((Throwable) (new Intent()));
	//  118  267:new             #181 <Class Intent>
	//  119  270:dup             
	//  120  271:invokespecial   #182 <Method void Intent()>
	//  121  274:astore_1        
		c.e("AppLogApi/CrashHandler", "CrashHandler no hasPhoneServiceAutoUpload!");
	//  122  275:ldc1            #10  <String "AppLogApi/CrashHandler">
	//  123  277:ldc1            #184 <String "CrashHandler no hasPhoneServiceAutoUpload!">
	//  124  279:invokestatic    #187 <Method void c.e(String, String)>
		((Intent) (throwable)).setClassName(mContext, "com.huawei.feedback.component.AutoUploadService");
	//  125  282:aload_1         
	//  126  283:aload_0         
	//  127  284:getfield        #68  <Field Context mContext>
	//  128  287:ldc1            #189 <String "com.huawei.feedback.component.AutoUploadService">
	//  129  289:invokevirtual   #193 <Method Intent Intent.setClassName(Context, String)>
	//  130  292:pop             
		((Intent) (throwable)).putExtra("uploadFile", false);
	//  131  293:aload_1         
	//  132  294:ldc1            #195 <String "uploadFile">
	//  133  296:iconst_0        
	//  134  297:invokevirtual   #199 <Method Intent Intent.putExtra(String, boolean)>
	//  135  300:pop             
		((Intent) (throwable)).putExtra("metaData", bundle);
	//  136  301:aload_1         
	//  137  302:ldc1            #201 <String "metaData">
	//  138  304:aload           6
	//  139  306:invokevirtual   #204 <Method Intent Intent.putExtra(String, Bundle)>
	//  140  309:pop             
		try
		{
			mContext.startService(((Intent) (throwable)));
	//  141  310:aload_0         
	//  142  311:getfield        #68  <Field Context mContext>
	//  143  314:aload_1         
	//  144  315:invokevirtual   #210 <Method android.content.ComponentName Context.startService(Intent)>
	//  145  318:pop             
		}
	//* 146  319:goto            355
		catch(Exception exception)
	//* 147  322:astore          4
		{
			((Intent) (throwable)).setClassName(mContext, "com.huawei.feedback.component.AutoUploadService");
	//  148  324:aload_1         
	//  149  325:aload_0         
	//  150  326:getfield        #68  <Field Context mContext>
	//  151  329:ldc1            #189 <String "com.huawei.feedback.component.AutoUploadService">
	//  152  331:invokevirtual   #193 <Method Intent Intent.setClassName(Context, String)>
	//  153  334:pop             
			try
			{
				mContext.startService(((Intent) (throwable)));
	//  154  335:aload_0         
	//  155  336:getfield        #68  <Field Context mContext>
	//  156  339:aload_1         
	//  157  340:invokevirtual   #210 <Method android.content.ComponentName Context.startService(Intent)>
	//  158  343:pop             
			}
	//* 159  344:goto            355
			// Misplaced declaration of an exception variable
			catch(Throwable throwable)
	//* 160  347:astore_1        
			{
				c.e("AppLogApi/CrashHandler", "CrashHandler start AutoUploadService intent error");
	//  161  348:ldc1            #10  <String "AppLogApi/CrashHandler">
	//  162  350:ldc1            #212 <String "CrashHandler start AutoUploadService intent error">
	//  163  352:invokestatic    #187 <Method void c.e(String, String)>
			}
		}
		return true;
	//  164  355:iconst_1        
	//  165  356:ireturn         
	}

	public Map collectDeviceInfo(Context context)
	{
		PackageInfo packageinfo;
		packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #218 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #221 <Method String Context.getPackageName()>
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #227 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:astore_2        
		infos.put("packageName", ((Object) (context.getPackageName())));
	//    7   13:aload_0         
	//    8   14:getfield        #26  <Field Map infos>
	//    9   17:ldc1            #76  <String "packageName">
	//   10   19:aload_1         
	//   11   20:invokevirtual   #221 <Method String Context.getPackageName()>
	//   12   23:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//   13   28:pop             
		if(packageinfo == null)
			break MISSING_BLOCK_LABEL_95;
	//   14   29:aload_2         
	//   15   30:ifnull          64
		if(packageinfo.versionName == null)
	//*  16   33:aload_2         
	//*  17   34:getfield        #231 <Field String PackageInfo.versionName>
	//*  18   37:ifnonnull       46
		{
			context = "null";
	//   19   40:ldc1            #233 <String "null">
	//   20   42:astore_1        
			break MISSING_BLOCK_LABEL_51;
	//   21   43:goto            51
		}
		context = ((Context) (packageinfo.versionName));
	//   22   46:aload_2         
	//   23   47:getfield        #231 <Field String PackageInfo.versionName>
	//   24   50:astore_1        
		infos.put("versionName", ((Object) (context)));
	//   25   51:aload_0         
	//   26   52:getfield        #26  <Field Map infos>
	//   27   55:ldc1            #84  <String "versionName">
	//   28   57:aload_1         
	//   29   58:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//   30   63:pop             
		break MISSING_BLOCK_LABEL_95;
	//   31   64:goto            95
		context;
	//   32   67:astore_1        
		c.e("AppLogApi/CrashHandler", (new StringBuilder()).append("an error occured when collect package info").append(((android.content.pm.PackageManager.NameNotFoundException) (context)).getMessage()).toString());
	//   33   68:ldc1            #10  <String "AppLogApi/CrashHandler">
	//   34   70:new             #168 <Class StringBuilder>
	//   35   73:dup             
	//   36   74:invokespecial   #169 <Method void StringBuilder()>
	//   37   77:ldc1            #235 <String "an error occured when collect package info">
	//   38   79:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   39   82:aload_1         
	//   40   83:invokevirtual   #238 <Method String android.content.pm.PackageManager$NameNotFoundException.getMessage()>
	//   41   86:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   42   89:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   43   92:invokestatic    #187 <Method void c.e(String, String)>
		return infos;
	//   44   95:aload_0         
	//   45   96:getfield        #26  <Field Map infos>
	//   46   99:areturn         
	}

	public void init(Context context)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c.e("AppLogApi/CrashHandler", "CrashHandler init");
	//    2    2:ldc1            #10  <String "AppLogApi/CrashHandler">
	//    3    4:ldc1            #244 <String "CrashHandler init">
	//    4    6:invokestatic    #187 <Method void c.e(String, String)>
		mContext = context;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #68  <Field Context mContext>
		mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
	//    8   14:aload_0         
	//    9   15:invokestatic    #250 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//   10   18:putfield        #252 <Field Thread$UncaughtExceptionHandler mDefaultHandler>
		Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (this)));
	//   11   21:aload_0         
	//   12   22:invokestatic    #256 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
		this;
	//   13   25:aload_0         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		return;
	//   15   27:return          
		context;
	//   16   28:astore_1        
	//*  17   29:aload_0         
		throw context;
	//   18   30:monitorexit     
	//   19   31:aload_1         
	//   20   32:athrow          
	}

	public void onHandlerException(Context context, Throwable throwable)
	{
		c.e("AppLogApi/CrashHandler", "onHandlerException");
	//    0    0:ldc1            #10  <String "AppLogApi/CrashHandler">
	//    1    2:ldc2            #259 <String "onHandlerException">
	//    2    5:invokestatic    #187 <Method void c.e(String, String)>
	//    3    8:return          
	}

	public void uncaughtException(Thread thread, Throwable throwable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mDefaultHandler != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #252 <Field Thread$UncaughtExceptionHandler mDefaultHandler>
	//*   4    6:ifnull          45
		{
			c.e("AppLogApi/CrashHandler", "uncaughtException");
	//    5    9:ldc1            #10  <String "AppLogApi/CrashHandler">
	//    6   11:ldc2            #262 <String "uncaughtException">
	//    7   14:invokestatic    #187 <Method void c.e(String, String)>
			if(handleException(throwable))
	//*   8   17:aload_0         
	//*   9   18:aload_2         
	//*  10   19:invokespecial   #264 <Method boolean handleException(Throwable)>
	//*  11   22:ifeq            34
				onHandlerException(mContext, throwable);
	//   12   25:aload_0         
	//   13   26:aload_0         
	//   14   27:getfield        #68  <Field Context mContext>
	//   15   30:aload_2         
	//   16   31:invokevirtual   #266 <Method void onHandlerException(Context, Throwable)>
			mDefaultHandler.uncaughtException(thread, throwable);
	//   17   34:aload_0         
	//   18   35:getfield        #252 <Field Thread$UncaughtExceptionHandler mDefaultHandler>
	//   19   38:aload_1         
	//   20   39:aload_2         
	//   21   40:invokeinterface #268 <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		}
		this;
	//   22   45:aload_0         
		JVM INSTR monitorexit ;
	//   23   46:monitorexit     
		return;
	//   24   47:return          
		thread;
	//   25   48:astore_1        
	//*  26   49:aload_0         
		throw thread;
	//   27   50:monitorexit     
	//   28   51:aload_1         
	//   29   52:athrow          
	}

	public static final String TAG = "AppLogApi/CrashHandler";
	private Map infos;
	private Context mContext;
	private Thread.UncaughtExceptionHandler mDefaultHandler;
}
