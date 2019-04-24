// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.*;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.*;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.common.util:
//			ProcessUtils, Strings

public final class CrashUtils
{
	public static interface ErrorDialogData
		extends Annotation
	{

		public static final int AVG_CRASH_FREQ = 2;
		public static final int BINDER_CRASH = 0x10000000;
		public static final int DYNAMITE_CRASH = 0x20000000;
		public static final int FORCED_SHUSHED_BY_WRAPPER = 4;
		public static final int NONE = 0;
		public static final int POPUP_FREQ = 1;
		public static final int SUPPRESSED = 0x40000000;
	}


	public CrashUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public static boolean addDynamiteErrorToDropBox(Context context, Throwable throwable)
	{
		return addErrorToDropBoxInternal(context, throwable, 0x20000000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #47  <Int 0x20000000>
	//    3    4:invokestatic    #51  <Method boolean addErrorToDropBoxInternal(Context, Throwable, int)>
	//    4    7:ireturn         
	}

	public static boolean addErrorToDropBox(Context context, Throwable throwable)
	{
		return addDynamiteErrorToDropBox(context, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #55  <Method boolean addDynamiteErrorToDropBox(Context, Throwable)>
	//    3    5:ireturn         
	}

	public static boolean addErrorToDropBoxInternal(Context context, String s, String s1, int i)
	{
		return zza(context, s, s1, i, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokestatic    #61  <Method boolean zza(Context, String, String, int, Throwable)>
	//    6    8:ireturn         
	}

	public static boolean addErrorToDropBoxInternal(Context context, Throwable throwable, int i)
	{
		Preconditions.checkNotNull(((Object) (context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #69  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (throwable)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #69  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		Throwable throwable1;
		if(!isPackageSide())
	//*   6   10:invokestatic    #73  <Method boolean isPackageSide()>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		throwable1 = throwable;
	//   10   18:aload_1         
	//   11   19:astore          4
		if(zzdb())
			break MISSING_BLOCK_LABEL_41;
	//   12   21:invokestatic    #76  <Method boolean zzdb()>
	//   13   24:ifne            41
		throwable = zza(throwable);
	//   14   27:aload_1         
	//   15   28:invokestatic    #79  <Method Throwable zza(Throwable)>
	//   16   31:astore_1        
		throwable1 = throwable;
	//   17   32:aload_1         
	//   18   33:astore          4
		if(throwable == null)
	//*  19   35:aload_1         
	//*  20   36:ifnonnull       41
			return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
		boolean flag;
		try
		{
			flag = zza(context, Log.getStackTraceString(throwable1), ProcessUtils.getMyProcessName(), i, throwable1);
	//   23   41:aload_0         
	//   24   42:aload           4
	//   25   44:invokestatic    #85  <Method String Log.getStackTraceString(Throwable)>
	//   26   47:invokestatic    #91  <Method String ProcessUtils.getMyProcessName()>
	//   27   50:iload_2         
	//   28   51:aload           4
	//   29   53:invokestatic    #61  <Method boolean zza(Context, String, String, int, Throwable)>
	//   30   56:istore_3        
		}
	//*  31   57:iload_3         
	//*  32   58:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  33   59:astore_0        
		{
			boolean flag1;
			try
			{
				flag1 = zzdb();
	//   34   60:invokestatic    #76  <Method boolean zzdb()>
	//   35   63:istore_3        
			}
	//*  36   64:goto            79
			// Misplaced declaration of an exception variable
			catch(Throwable throwable)
	//*  37   67:astore_1        
			{
				Log.e("CrashUtils", "Error determining which process we're running in!", throwable);
	//   38   68:ldc1            #93  <String "CrashUtils">
	//   39   70:ldc1            #95  <String "Error determining which process we're running in!">
	//   40   72:aload_1         
	//   41   73:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
	//   42   76:pop             
				flag1 = false;
	//   43   77:iconst_0        
	//   44   78:istore_3        
			}
			if(flag1)
	//*  45   79:iload_3         
	//*  46   80:ifeq            85
			{
				throw context;
	//   47   83:aload_0         
	//   48   84:athrow          
			} else
			{
				Log.e("CrashUtils", "Error adding exception to DropBox!", ((Throwable) (context)));
	//   49   85:ldc1            #93  <String "CrashUtils">
	//   50   87:ldc1            #101 <String "Error adding exception to DropBox!">
	//   51   89:aload_0         
	//   52   90:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
	//   53   93:pop             
				return false;
	//   54   94:iconst_0        
	//   55   95:ireturn         
			}
		}
		return flag;
	}

	private static boolean isPackageSide()
	{
		if(zzze)
	//*   0    0:getstatic       #103 <Field boolean zzze>
	//*   1    3:ifeq            10
			return zzzf;
	//    2    6:getstatic       #105 <Field boolean zzzf>
	//    3    9:ireturn         
		else
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
	}

	public static boolean isSystemClassPrefixInternal(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #113 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		String as[] = zzzc;
	//    5    9:getstatic       #40  <Field String[] zzzc>
	//    6   12:astore_3        
		int j = as.length;
	//    7   13:aload_3         
	//    8   14:arraylength     
	//    9   15:istore_2        
		for(int i = 0; i < j; i++)
	//*  10   16:iconst_0        
	//*  11   17:istore_1        
	//*  12   18:iload_1         
	//*  13   19:iload_2         
	//*  14   20:icmpge          42
			if(s.startsWith(as[i]))
	//*  15   23:aload_0         
	//*  16   24:aload_3         
	//*  17   25:iload_1         
	//*  18   26:aaload          
	//*  19   27:invokevirtual   #116 <Method boolean String.startsWith(String)>
	//*  20   30:ifeq            35
				return true;
	//   21   33:iconst_1        
	//   22   34:ireturn         

	//   23   35:iload_1         
	//   24   36:iconst_1        
	//   25   37:iadd            
	//   26   38:istore_1        
	//*  27   39:goto            18
		return false;
	//   28   42:iconst_0        
	//   29   43:ireturn         
	}

	public static void setTestVariables(DropBoxManager dropboxmanager, boolean flag, boolean flag1, int i)
	{
		com/google/android/gms/common/util/CrashUtils;
	//    0    0:ldc1            #2   <Class CrashUtils>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzze = true;
	//    2    3:iconst_1        
	//    3    4:putstatic       #103 <Field boolean zzze>
		zzzd = dropboxmanager;
	//    4    7:aload_0         
	//    5    8:putstatic       #121 <Field DropBoxManager zzzd>
		zzzg = flag;
	//    6   11:iload_1         
	//    7   12:putstatic       #123 <Field boolean zzzg>
		zzzf = flag1;
	//    8   15:iload_2         
	//    9   16:putstatic       #105 <Field boolean zzzf>
		zzzh = i;
	//   10   19:iload_3         
	//   11   20:putstatic       #125 <Field int zzzh>
		zzzi = 0;
	//   12   23:iconst_0        
	//   13   24:putstatic       #127 <Field int zzzi>
		zzzj = 0;
	//   14   27:iconst_0        
	//   15   28:putstatic       #129 <Field int zzzj>
		com/google/android/gms/common/util/CrashUtils;
	//   16   31:ldc1            #2   <Class CrashUtils>
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		dropboxmanager;
	//   19   35:astore_0        
	//*  20   36:ldc1            #2   <Class CrashUtils>
		throw dropboxmanager;
	//   21   38:monitorexit     
	//   22   39:aload_0         
	//   23   40:athrow          
	}

	private static String zza(Context context, String s, String s1, int i)
	{
		com/google/android/gms/common/util/CrashUtils;
	//    0    0:ldc1            #2   <Class CrashUtils>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder(1024);
	//    2    3:new             #135 <Class StringBuilder>
	//    3    6:dup             
	//    4    7:sipush          1024
	//    5   10:invokespecial   #138 <Method void StringBuilder(int)>
	//    6   13:astore          8
		stringbuilder.append("Process: ");
	//    7   15:aload           8
	//    8   17:ldc1            #140 <String "Process: ">
	//    9   19:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		stringbuilder.append(Strings.nullToEmpty(s1));
	//   11   23:aload           8
	//   12   25:aload_2         
	//   13   26:invokestatic    #150 <Method String Strings.nullToEmpty(String)>
	//   14   29:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder.append("\n");
	//   16   33:aload           8
	//   17   35:ldc1            #152 <String "\n">
	//   18   37:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		stringbuilder.append("Package: com.google.android.gms");
	//   20   41:aload           8
	//   21   43:ldc1            #154 <String "Package: com.google.android.gms">
	//   22   45:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
		int k;
		Object obj;
		k = 0xbdfcc1;
	//   24   49:ldc1            #155 <Int 0xbdfcc1>
	//   25   51:istore          5
		obj = "12.4.51 (020308-{{cl}})";
	//   26   53:ldc1            #157 <String "12.4.51 (020308-{{cl}})">
	//   27   55:astore          7
		boolean flag = zzdb();
	//   28   57:invokestatic    #76  <Method boolean zzdb()>
	//   29   60:istore          6
		int j;
		s1 = ((String) (obj));
	//   30   62:aload           7
	//   31   64:astore_2        
		j = k;
	//   32   65:iload           5
	//   33   67:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_136;
	//   34   69:iload           6
	//   35   71:ifeq            136
		PackageInfo packageinfo;
		packageinfo = Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0);
	//   36   74:aload_0         
	//   37   75:invokestatic    #163 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   38   78:aload_0         
	//   39   79:invokevirtual   #168 <Method String Context.getPackageName()>
	//   40   82:iconst_0        
	//   41   83:invokevirtual   #174 <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//   42   86:astore          9
		j = packageinfo.versionCode;
	//   43   88:aload           9
	//   44   90:getfield        #179 <Field int PackageInfo.versionCode>
	//   45   93:istore          4
		s1 = ((String) (obj));
	//   46   95:aload           7
	//   47   97:astore_2        
		try
		{
			if(packageinfo.versionName != null)
	//*  48   98:aload           9
	//*  49  100:getfield        #183 <Field String PackageInfo.versionName>
	//*  50  103:ifnull          112
				s1 = packageinfo.versionName;
	//   51  106:aload           9
	//   52  108:getfield        #183 <Field String PackageInfo.versionName>
	//   53  111:astore_2        
			break MISSING_BLOCK_LABEL_136;
	//   54  112:goto            136
		}
		// Misplaced declaration of an exception variable
		catch(String s1) { }
	//   55  115:astore_2        
		break MISSING_BLOCK_LABEL_124;
	//   56  116:goto            124
		s1;
	//   57  119:astore_2        
		j = k;
	//   58  120:iload           5
	//   59  122:istore          4
		Log.w("CrashUtils", "Error while trying to get the package information! Using static version.", ((Throwable) (s1)));
	//   60  124:ldc1            #93  <String "CrashUtils">
	//   61  126:ldc1            #185 <String "Error while trying to get the package information! Using static version.">
	//   62  128:aload_2         
	//   63  129:invokestatic    #188 <Method int Log.w(String, String, Throwable)>
	//   64  132:pop             
		s1 = ((String) (obj));
	//   65  133:aload           7
	//   66  135:astore_2        
		stringbuilder.append(" v");
	//   67  136:aload           8
	//   68  138:ldc1            #190 <String " v">
	//   69  140:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   70  143:pop             
		stringbuilder.append(j);
	//   71  144:aload           8
	//   72  146:iload           4
	//   73  148:invokevirtual   #193 <Method StringBuilder StringBuilder.append(int)>
	//   74  151:pop             
		if(TextUtils.isEmpty(((CharSequence) (s1))))
			break MISSING_BLOCK_LABEL_242;
	//   75  152:aload_2         
	//   76  153:invokestatic    #113 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   77  156:ifne            242
		obj = ((Object) (s1));
	//   78  159:aload_2         
	//   79  160:astore          7
		if(!s1.contains("("))
			break MISSING_BLOCK_LABEL_218;
	//   80  162:aload_2         
	//   81  163:ldc1            #195 <String "(">
	//   82  165:invokevirtual   #198 <Method boolean String.contains(CharSequence)>
	//   83  168:ifeq            218
		obj = ((Object) (s1));
	//   84  171:aload_2         
	//   85  172:astore          7
		if(s1.contains(")"))
			break MISSING_BLOCK_LABEL_218;
	//   86  174:aload_2         
	//   87  175:ldc1            #200 <String ")">
	//   88  177:invokevirtual   #198 <Method boolean String.contains(CharSequence)>
	//   89  180:ifne            218
		obj = ((Object) (s1));
	//   90  183:aload_2         
	//   91  184:astore          7
		if(s1.endsWith("-"))
	//*  92  186:aload_2         
	//*  93  187:ldc1            #202 <String "-">
	//*  94  189:invokevirtual   #205 <Method boolean String.endsWith(String)>
	//*  95  192:ifeq            206
			obj = ((Object) (String.valueOf(((Object) (s1))).concat("111111111")));
	//   96  195:aload_2         
	//   97  196:invokestatic    #209 <Method String String.valueOf(Object)>
	//   98  199:ldc1            #211 <String "111111111">
	//   99  201:invokevirtual   #214 <Method String String.concat(String)>
	//  100  204:astore          7
		obj = ((Object) (String.valueOf(obj).concat(")")));
	//  101  206:aload           7
	//  102  208:invokestatic    #209 <Method String String.valueOf(Object)>
	//  103  211:ldc1            #200 <String ")">
	//  104  213:invokevirtual   #214 <Method String String.concat(String)>
	//  105  216:astore          7
		stringbuilder.append(" (");
	//  106  218:aload           8
	//  107  220:ldc1            #216 <String " (">
	//  108  222:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  109  225:pop             
		stringbuilder.append(((String) (obj)));
	//  110  226:aload           8
	//  111  228:aload           7
	//  112  230:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  113  233:pop             
		stringbuilder.append(")");
	//  114  234:aload           8
	//  115  236:ldc1            #200 <String ")">
	//  116  238:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  117  241:pop             
		stringbuilder.append("\n");
	//  118  242:aload           8
	//  119  244:ldc1            #152 <String "\n">
	//  120  246:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  121  249:pop             
		stringbuilder.append("Build: ");
	//  122  250:aload           8
	//  123  252:ldc1            #218 <String "Build: ">
	//  124  254:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  125  257:pop             
		stringbuilder.append(Build.FINGERPRINT);
	//  126  258:aload           8
	//  127  260:getstatic       #223 <Field String Build.FINGERPRINT>
	//  128  263:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  129  266:pop             
		stringbuilder.append("\n");
	//  130  267:aload           8
	//  131  269:ldc1            #152 <String "\n">
	//  132  271:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  133  274:pop             
		if(Debug.isDebuggerConnected())
	//* 134  275:invokestatic    #228 <Method boolean Debug.isDebuggerConnected()>
	//* 135  278:ifeq            289
			stringbuilder.append("Debugger: Connected\n");
	//  136  281:aload           8
	//  137  283:ldc1            #230 <String "Debugger: Connected\n">
	//  138  285:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  139  288:pop             
		if(i == 0)
			break MISSING_BLOCK_LABEL_316;
	//  140  289:iload_3         
	//  141  290:ifeq            316
		stringbuilder.append("DD-EDD: ");
	//  142  293:aload           8
	//  143  295:ldc1            #232 <String "DD-EDD: ">
	//  144  297:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  145  300:pop             
		stringbuilder.append(i);
	//  146  301:aload           8
	//  147  303:iload_3         
	//  148  304:invokevirtual   #193 <Method StringBuilder StringBuilder.append(int)>
	//  149  307:pop             
		stringbuilder.append("\n");
	//  150  308:aload           8
	//  151  310:ldc1            #152 <String "\n">
	//  152  312:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  153  315:pop             
		stringbuilder.append("\n");
	//  154  316:aload           8
	//  155  318:ldc1            #152 <String "\n">
	//  156  320:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  157  323:pop             
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//* 158  324:aload_1         
	//* 159  325:invokestatic    #113 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 160  328:ifne            338
			stringbuilder.append(s);
	//  161  331:aload           8
	//  162  333:aload_1         
	//  163  334:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  164  337:pop             
		if(!zzdb()) goto _L2; else goto _L1
	//  165  338:invokestatic    #76  <Method boolean zzdb()>
	//  166  341:ifeq            646
_L1:
		if(zzzh < 0) goto _L4; else goto _L3
	//  167  344:getstatic       #125 <Field int zzzh>
	//  168  347:iflt            357
_L3:
		i = zzzh;
	//  169  350:getstatic       #125 <Field int zzzh>
	//  170  353:istore_3        
		  goto _L5
	//* 171  354:goto            371
_L4:
		i = android.provider.Settings.Secure.getInt(context.getContentResolver(), "logcat_for_system_app_crash", 0);
	//  172  357:aload_0         
	//  173  358:invokevirtual   #236 <Method android.content.ContentResolver Context.getContentResolver()>
	//  174  361:ldc1            #238 <String "logcat_for_system_app_crash">
	//  175  363:iconst_0        
	//  176  364:invokestatic    #244 <Method int android.provider.Settings$Secure.getInt(android.content.ContentResolver, String, int)>
	//  177  367:istore_3        
	//* 178  368:goto            371
_L5:
		if(i <= 0)
			break MISSING_BLOCK_LABEL_613;
	//  179  371:iload_3         
	//  180  372:ifle            613
		stringbuilder.append("\n");
	//  181  375:aload           8
	//  182  377:ldc1            #152 <String "\n">
	//  183  379:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  184  382:pop             
		s1 = null;
	//  185  383:aconst_null     
	//  186  384:astore_2        
		s = null;
	//  187  385:aconst_null     
	//  188  386:astore_1        
		context = ((Context) (s));
	//  189  387:aload_1         
	//  190  388:astore_0        
		obj = ((Object) ((new ProcessBuilder(new String[] {
			"/system/bin/logcat", "-v", "time", "-b", "events", "-b", "system", "-b", "main", "-b", 
			"crash", "-t", String.valueOf(i)
		})).redirectErrorStream(true).start()));
	//  191  389:new             #246 <Class ProcessBuilder>
	//  192  392:dup             
	//  193  393:bipush          13
	//  194  395:anewarray       String[]
	//  195  398:dup             
	//  196  399:iconst_0        
	//  197  400:ldc1            #248 <String "/system/bin/logcat">
	//  198  402:aastore         
	//  199  403:dup             
	//  200  404:iconst_1        
	//  201  405:ldc1            #250 <String "-v">
	//  202  407:aastore         
	//  203  408:dup             
	//  204  409:iconst_2        
	//  205  410:ldc1            #252 <String "time">
	//  206  412:aastore         
	//  207  413:dup             
	//  208  414:iconst_3        
	//  209  415:ldc1            #254 <String "-b">
	//  210  417:aastore         
	//  211  418:dup             
	//  212  419:iconst_4        
	//  213  420:ldc2            #256 <String "events">
	//  214  423:aastore         
	//  215  424:dup             
	//  216  425:iconst_5        
	//  217  426:ldc1            #254 <String "-b">
	//  218  428:aastore         
	//  219  429:dup             
	//  220  430:bipush          6
	//  221  432:ldc2            #258 <String "system">
	//  222  435:aastore         
	//  223  436:dup             
	//  224  437:bipush          7
	//  225  439:ldc1            #254 <String "-b">
	//  226  441:aastore         
	//  227  442:dup             
	//  228  443:bipush          8
	//  229  445:ldc2            #260 <String "main">
	//  230  448:aastore         
	//  231  449:dup             
	//  232  450:bipush          9
	//  233  452:ldc1            #254 <String "-b">
	//  234  454:aastore         
	//  235  455:dup             
	//  236  456:bipush          10
	//  237  458:ldc2            #262 <String "crash">
	//  238  461:aastore         
	//  239  462:dup             
	//  240  463:bipush          11
	//  241  465:ldc2            #264 <String "-t">
	//  242  468:aastore         
	//  243  469:dup             
	//  244  470:bipush          12
	//  245  472:iload_3         
	//  246  473:invokestatic    #267 <Method String String.valueOf(int)>
	//  247  476:aastore         
	//  248  477:invokespecial   #270 <Method void ProcessBuilder(String[])>
	//  249  480:iconst_1        
	//  250  481:invokevirtual   #274 <Method ProcessBuilder ProcessBuilder.redirectErrorStream(boolean)>
	//  251  484:invokevirtual   #278 <Method Process ProcessBuilder.start()>
	//  252  487:astore          7
		context = ((Context) (s));
	//  253  489:aload_1         
	//  254  490:astore_0        
		try
		{
			((Process) (obj)).getOutputStream().close();
	//  255  491:aload           7
	//  256  493:invokevirtual   #284 <Method OutputStream Process.getOutputStream()>
	//  257  496:invokevirtual   #289 <Method void OutputStream.close()>
		}
	//* 258  499:aload_1         
	//* 259  500:astore_0        
	//* 260  501:aload           7
	//* 261  503:invokevirtual   #293 <Method InputStream Process.getErrorStream()>
	//* 262  506:invokevirtual   #296 <Method void InputStream.close()>
	//* 263  509:aload_1         
	//* 264  510:astore_0        
	//* 265  511:new             #298 <Class InputStreamReader>
	//* 266  514:dup             
	//* 267  515:aload           7
	//* 268  517:invokevirtual   #301 <Method InputStream Process.getInputStream()>
	//* 269  520:invokespecial   #304 <Method void InputStreamReader(InputStream)>
	//* 270  523:astore_1        
	//* 271  524:sipush          8192
	//* 272  527:newarray        char[]
	//* 273  529:astore_0        
	//* 274  530:aload_1         
	//* 275  531:aload_0         
	//* 276  532:invokevirtual   #308 <Method int InputStreamReader.read(char[])>
	//* 277  535:istore_3        
	//* 278  536:iload_3         
	//* 279  537:ifle            552
	//* 280  540:aload           8
	//* 281  542:aload_0         
	//* 282  543:iconst_0        
	//* 283  544:iload_3         
	//* 284  545:invokevirtual   #311 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//* 285  548:pop             
	//* 286  549:goto            530
	//* 287  552:aload_1         
	//* 288  553:invokevirtual   #312 <Method void InputStreamReader.close()>
	//* 289  556:goto            613
	//* 290  559:astore_2        
	//* 291  560:aload_1         
	//* 292  561:astore_0        
	//* 293  562:aload_2         
	//* 294  563:astore_1        
	//* 295  564:goto            603
	//* 296  567:astore_2        
	//* 297  568:goto            580
	//* 298  571:astore_1        
	//* 299  572:goto            603
	//* 300  575:astore_0        
	//* 301  576:aload_2         
	//* 302  577:astore_1        
	//* 303  578:aload_0         
	//* 304  579:astore_2        
	//* 305  580:aload_1         
	//* 306  581:astore_0        
	//* 307  582:ldc1            #93  <String "CrashUtils">
	//* 308  584:ldc2            #314 <String "Error running logcat">
	//* 309  587:aload_2         
	//* 310  588:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
	//* 311  591:pop             
	//* 312  592:aload_1         
	//* 313  593:ifnull          613
	//* 314  596:aload_1         
	//* 315  597:invokevirtual   #312 <Method void InputStreamReader.close()>
	//* 316  600:goto            613
	//* 317  603:aload_0         
	//* 318  604:ifnull          611
	//* 319  607:aload_0         
	//* 320  608:invokevirtual   #312 <Method void InputStreamReader.close()>
	//* 321  611:aload_1         
	//* 322  612:athrow          
	//* 323  613:aload           8
	//* 324  615:invokevirtual   #317 <Method String StringBuilder.toString()>
	//* 325  618:astore_0        
	//* 326  619:ldc1            #2   <Class CrashUtils>
	//* 327  621:monitorexit     
	//* 328  622:aload_0         
	//* 329  623:areturn         
	//* 330  624:astore_0        
	//* 331  625:ldc1            #2   <Class CrashUtils>
	//* 332  627:monitorexit     
	//* 333  628:aload_0         
	//* 334  629:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//  335  630:astore_0        
		context = ((Context) (s));
		try
		{
			((Process) (obj)).getErrorStream().close();
		}
	//* 336  631:goto            499
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//  337  634:astore_0        
		context = ((Context) (s));
		s = ((String) (new InputStreamReader(((Process) (obj)).getInputStream())));
		context = ((Context) (new char[8192]));
_L6:
		i = ((InputStreamReader) (s)).read(((char []) (context)));
		if(i <= 0)
			break MISSING_BLOCK_LABEL_552;
		try
		{
			stringbuilder.append(((char []) (context)), 0, i);
		}
		// Misplaced declaration of an exception variable
		catch(String s1)
		{
			break MISSING_BLOCK_LABEL_580;
		}
		  goto _L6
		try
		{
			((InputStreamReader) (s)).close();
		}
	//* 338  635:goto            509
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//  339  638:astore_0        
		break MISSING_BLOCK_LABEL_613;
	//  340  639:goto            613
		s1;
		context = ((Context) (s));
		s = s1;
		break MISSING_BLOCK_LABEL_603;
		s;
		break MISSING_BLOCK_LABEL_603;
		context;
		s = s1;
		s1 = ((String) (context));
		context = ((Context) (s));
		Log.e("CrashUtils", "Error running logcat", ((Throwable) (s1)));
		if(s == null)
			break MISSING_BLOCK_LABEL_613;
		((InputStreamReader) (s)).close();
		break MISSING_BLOCK_LABEL_613;
		if(context == null)
			break MISSING_BLOCK_LABEL_611;
		try
		{
			((InputStreamReader) (context)).close();
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//  341  642:astore_0        
		throw s;
		context = ((Context) (stringbuilder.toString()));
		com/google/android/gms/common/util/CrashUtils;
		JVM INSTR monitorexit ;
		return ((String) (context));
		context;
		throw context;
	//* 342  643:goto            611
_L2:
		i = 0;
	//  343  646:iconst_0        
	//  344  647:istore_3        
		if(true) goto _L5; else goto _L7
	//  345  648:goto            371
_L7:
	}

	private static Throwable zza(Throwable throwable)
	{
		com/google/android/gms/common/util/CrashUtils;
	//    0    0:ldc1            #2   <Class CrashUtils>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		LinkedList linkedlist = new LinkedList();
	//    2    3:new             #319 <Class LinkedList>
	//    3    6:dup             
	//    4    7:invokespecial   #320 <Method void LinkedList()>
	//    5   10:astore          7
_L2:
		if(throwable == null)
			break; /* Loop/switch isn't completed */
	//    6   12:aload_0         
	//    7   13:ifnull          279
		linkedlist.push(((Object) (throwable)));
	//    8   16:aload           7
	//    9   18:aload_0         
	//   10   19:invokevirtual   #324 <Method void LinkedList.push(Object)>
		throwable = throwable.getCause();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #330 <Method Throwable Throwable.getCause()>
	//   13   26:astore_0        
		if(true) goto _L2; else goto _L1
	//   14   27:goto            12
_L6:
		int j;
		ArrayList arraylist;
		StackTraceElement astacktraceelement[];
		if(linkedlist.isEmpty())
			break MISSING_BLOCK_LABEL_259;
	//   15   30:aload           7
	//   16   32:invokevirtual   #332 <Method boolean LinkedList.isEmpty()>
	//   17   35:ifne            259
		Throwable throwable1 = (Throwable)linkedlist.pop();
	//   18   38:aload           7
	//   19   40:invokevirtual   #336 <Method Object LinkedList.pop()>
	//   20   43:checkcast       #326 <Class Throwable>
	//   21   46:astore          5
		astacktraceelement = throwable1.getStackTrace();
	//   22   48:aload           5
	//   23   50:invokevirtual   #340 <Method StackTraceElement[] Throwable.getStackTrace()>
	//   24   53:astore          9
		arraylist = new ArrayList();
	//   25   55:new             #342 <Class ArrayList>
	//   26   58:dup             
	//   27   59:invokespecial   #343 <Method void ArrayList()>
	//   28   62:astore          8
		arraylist.add(((Object) (new StackTraceElement(((Object) (throwable1)).getClass().getName(), "<filtered>", "<filtered>", 1))));
	//   29   64:aload           8
	//   30   66:new             #345 <Class StackTraceElement>
	//   31   69:dup             
	//   32   70:aload           5
	//   33   72:invokevirtual   #349 <Method Class Object.getClass()>
	//   34   75:invokevirtual   #354 <Method String Class.getName()>
	//   35   78:ldc2            #356 <String "<filtered>">
	//   36   81:ldc2            #356 <String "<filtered>">
	//   37   84:iconst_1        
	//   38   85:invokespecial   #359 <Method void StackTraceElement(String, String, String, int)>
	//   39   88:invokevirtual   #363 <Method boolean ArrayList.add(Object)>
	//   40   91:pop             
		j = astacktraceelement.length;
	//   41   92:aload           9
	//   42   94:arraylength     
	//   43   95:istore          4
		int i = 0;
	//   44   97:iconst_0        
	//   45   98:istore_2        
_L4:
		StackTraceElement stacktraceelement;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   46   99:iload_2         
	//   47  100:iload           4
	//   48  102:icmpge          207
		stacktraceelement = astacktraceelement[i];
	//   49  105:aload           9
	//   50  107:iload_2         
	//   51  108:aaload          
	//   52  109:astore          6
		Object obj;
		String s;
		s = stacktraceelement.getClassName();
	//   53  111:aload           6
	//   54  113:invokevirtual   #366 <Method String StackTraceElement.getClassName()>
	//   55  116:astore          10
		obj = ((Object) (stacktraceelement.getFileName()));
	//   56  118:aload           6
	//   57  120:invokevirtual   #369 <Method String StackTraceElement.getFileName()>
	//   58  123:astore          5
		boolean flag;
		boolean flag1;
		if(!TextUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).startsWith(":com.google.android.gms"))
	//*  59  125:aload           5
	//*  60  127:invokestatic    #113 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  61  130:ifne            286
	//*  62  133:aload           5
	//*  63  135:ldc2            #371 <String ":com.google.android.gms">
	//*  64  138:invokevirtual   #116 <Method boolean String.startsWith(String)>
	//*  65  141:ifeq            286
			flag1 = true;
	//   66  144:iconst_1        
	//   67  145:istore_3        
		else
	//*  68  146:goto            149
	//*  69  149:iload_1         
	//*  70  150:iload_3         
	//*  71  151:ior             
	//*  72  152:istore_1        
	//*  73  153:aload           6
	//*  74  155:astore          5
	//*  75  157:iload_3         
	//*  76  158:ifne            192
	//*  77  161:aload           6
	//*  78  163:astore          5
	//*  79  165:aload           10
	//*  80  167:invokestatic    #373 <Method boolean isSystemClassPrefixInternal(String)>
	//*  81  170:ifne            192
	//*  82  173:new             #345 <Class StackTraceElement>
	//*  83  176:dup             
	//*  84  177:ldc2            #356 <String "<filtered>">
	//*  85  180:ldc2            #356 <String "<filtered>">
	//*  86  183:ldc2            #356 <String "<filtered>">
	//*  87  186:iconst_1        
	//*  88  187:invokespecial   #359 <Method void StackTraceElement(String, String, String, int)>
	//*  89  190:astore          5
	//*  90  192:aload           8
	//*  91  194:aload           5
	//*  92  196:invokevirtual   #363 <Method boolean ArrayList.add(Object)>
	//*  93  199:pop             
	//*  94  200:iload_2         
	//*  95  201:iconst_1        
	//*  96  202:iadd            
	//*  97  203:istore_2        
	//*  98  204:goto            99
	//*  99  207:aload_0         
	//* 100  208:ifnonnull       225
	//* 101  211:new             #326 <Class Throwable>
	//* 102  214:dup             
	//* 103  215:ldc2            #356 <String "<filtered>">
	//* 104  218:invokespecial   #376 <Method void Throwable(String)>
	//* 105  221:astore_0        
	//* 106  222:goto            291
	//* 107  225:new             #326 <Class Throwable>
	//* 108  228:dup             
	//* 109  229:ldc2            #356 <String "<filtered>">
	//* 110  232:aload_0         
	//* 111  233:invokespecial   #379 <Method void Throwable(String, Throwable)>
	//* 112  236:astore_0        
	//* 113  237:goto            291
	//* 114  240:aload_0         
	//* 115  241:aload           8
	//* 116  243:iconst_0        
	//* 117  244:anewarray       StackTraceElement[]
	//* 118  247:invokevirtual   #383 <Method Object[] ArrayList.toArray(Object[])>
	//* 119  250:checkcast       #385 <Class StackTraceElement[]>
	//* 120  253:invokevirtual   #389 <Method void Throwable.setStackTrace(StackTraceElement[])>
	//* 121  256:goto            30
	//* 122  259:iload_1         
	//* 123  260:ifne            268
	//* 124  263:ldc1            #2   <Class CrashUtils>
	//* 125  265:monitorexit     
	//* 126  266:aconst_null     
	//* 127  267:areturn         
	//* 128  268:ldc1            #2   <Class CrashUtils>
	//* 129  270:monitorexit     
	//* 130  271:aload_0         
	//* 131  272:areturn         
	//* 132  273:astore_0        
	//* 133  274:ldc1            #2   <Class CrashUtils>
	//* 134  276:monitorexit     
	//* 135  277:aload_0         
	//* 136  278:athrow          
	//* 137  279:aconst_null     
	//* 138  280:astore_0        
	//* 139  281:iconst_0        
	//* 140  282:istore_1        
	//* 141  283:goto            30
			flag1 = false;
	//  142  286:iconst_0        
	//  143  287:istore_3        
		flag |= flag1;
		obj = ((Object) (stacktraceelement));
		if(flag1)
			break MISSING_BLOCK_LABEL_192;
		obj = ((Object) (stacktraceelement));
		if(!isSystemClassPrefixInternal(s))
			obj = ((Object) (new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1)));
		arraylist.add(obj);
		i++;
		if(true) goto _L4; else goto _L3
_L3:
		if(throwable != null)
			break MISSING_BLOCK_LABEL_225;
		throwable = new Throwable("<filtered>");
		break MISSING_BLOCK_LABEL_240;
		throwable = new Throwable("<filtered>", throwable);
		throwable.setStackTrace((StackTraceElement[])arraylist.toArray(((Object []) (new StackTraceElement[0]))));
		continue; /* Loop/switch isn't completed */
		if(!flag)
			return null;
		return throwable;
		throwable;
		throw throwable;
_L1:
		throwable = null;
		flag = false;
		if(true) goto _L6; else goto _L5
_L5:
	//* 144  288:goto            149
	//* 145  291:goto            240
	}

	private static boolean zza(Context context, String s, String s1, int i, Throwable throwable)
	{
		com/google/android/gms/common/util/CrashUtils;
	//    0    0:ldc1            #2   <Class CrashUtils>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Preconditions.checkNotNull(((Object) (context)));
	//    2    3:aload_0         
	//    3    4:invokestatic    #69  <Method Object Preconditions.checkNotNull(Object)>
	//    4    7:pop             
		if(!isPackageSide() || Strings.isEmptyOrWhitespace(s))
	//*   5    8:invokestatic    #73  <Method boolean isPackageSide()>
	//*   6   11:ifeq            155
	//*   7   14:aload_1         
	//*   8   15:invokestatic    #392 <Method boolean Strings.isEmptyOrWhitespace(String)>
	//*   9   18:ifeq            24
			break MISSING_BLOCK_LABEL_155;
	//   10   21:goto            155
		int k = s.hashCode();
	//   11   24:aload_1         
	//   12   25:invokevirtual   #396 <Method int String.hashCode()>
	//   13   28:istore          6
		if(throwable != null)
			break MISSING_BLOCK_LABEL_43;
	//   14   30:aload           4
	//   15   32:ifnonnull       43
		int j;
		j = zzzj;
	//   16   35:getstatic       #129 <Field int zzzj>
	//   17   38:istore          5
		break MISSING_BLOCK_LABEL_50;
	//   18   40:goto            50
		j = ((Object) (throwable)).hashCode();
	//   19   43:aload           4
	//   20   45:invokevirtual   #397 <Method int Object.hashCode()>
	//   21   48:istore          5
		int l;
		if(zzzi != k)
			break MISSING_BLOCK_LABEL_75;
	//   22   50:getstatic       #127 <Field int zzzi>
	//   23   53:iload           6
	//   24   55:icmpne          75
		l = zzzj;
	//   25   58:getstatic       #129 <Field int zzzj>
	//   26   61:istore          7
		if(l != j)
			break MISSING_BLOCK_LABEL_75;
	//   27   63:iload           7
	//   28   65:iload           5
	//   29   67:icmpne          75
		com/google/android/gms/common/util/CrashUtils;
	//   30   70:ldc1            #2   <Class CrashUtils>
		JVM INSTR monitorexit ;
	//   31   72:monitorexit     
		return false;
	//   32   73:iconst_0        
	//   33   74:ireturn         
		zzzi = k;
	//   34   75:iload           6
	//   35   77:putstatic       #127 <Field int zzzi>
		zzzj = j;
	//   36   80:iload           5
	//   37   82:putstatic       #129 <Field int zzzj>
		if(zzzd != null)
	//*  38   85:getstatic       #121 <Field DropBoxManager zzzd>
	//*  39   88:ifnull          99
		{
			throwable = ((Throwable) (zzzd));
	//   40   91:getstatic       #121 <Field DropBoxManager zzzd>
	//   41   94:astore          4
			break MISSING_BLOCK_LABEL_111;
	//   42   96:goto            111
		}
		throwable = ((Throwable) ((DropBoxManager)context.getSystemService("dropbox")));
	//   43   99:aload_0         
	//   44  100:ldc2            #399 <String "dropbox">
	//   45  103:invokevirtual   #403 <Method Object Context.getSystemService(String)>
	//   46  106:checkcast       #405 <Class DropBoxManager>
	//   47  109:astore          4
		if(throwable == null)
			break MISSING_BLOCK_LABEL_150;
	//   48  111:aload           4
	//   49  113:ifnull          150
		if(!((DropBoxManager) (throwable)).isTagEnabled("system_app_crash"))
	//*  50  116:aload           4
	//*  51  118:ldc2            #407 <String "system_app_crash">
	//*  52  121:invokevirtual   #410 <Method boolean DropBoxManager.isTagEnabled(String)>
	//*  53  124:ifne            130
			break MISSING_BLOCK_LABEL_150;
	//   54  127:goto            150
		((DropBoxManager) (throwable)).addText("system_app_crash", zza(context, s, s1, i));
	//   55  130:aload           4
	//   56  132:ldc2            #407 <String "system_app_crash">
	//   57  135:aload_0         
	//   58  136:aload_1         
	//   59  137:aload_2         
	//   60  138:iload_3         
	//   61  139:invokestatic    #412 <Method String zza(Context, String, String, int)>
	//   62  142:invokevirtual   #416 <Method void DropBoxManager.addText(String, String)>
		com/google/android/gms/common/util/CrashUtils;
	//   63  145:ldc1            #2   <Class CrashUtils>
		JVM INSTR monitorexit ;
	//   64  147:monitorexit     
		return true;
	//   65  148:iconst_1        
	//   66  149:ireturn         
		com/google/android/gms/common/util/CrashUtils;
	//   67  150:ldc1            #2   <Class CrashUtils>
		JVM INSTR monitorexit ;
	//   68  152:monitorexit     
		return false;
	//   69  153:iconst_0        
	//   70  154:ireturn         
		com/google/android/gms/common/util/CrashUtils;
	//   71  155:ldc1            #2   <Class CrashUtils>
		JVM INSTR monitorexit ;
	//   72  157:monitorexit     
		return false;
	//   73  158:iconst_0        
	//   74  159:ireturn         
		context;
	//   75  160:astore_0        
	//*  76  161:ldc1            #2   <Class CrashUtils>
		throw context;
	//   77  163:monitorexit     
	//   78  164:aload_0         
	//   79  165:athrow          
	}

	private static boolean zzdb()
	{
		if(zzze)
	//*   0    0:getstatic       #103 <Field boolean zzze>
	//*   1    3:ifeq            10
			return zzzg;
	//    2    6:getstatic       #123 <Field boolean zzzg>
	//    3    9:ireturn         
		else
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
	}

	private static final String zzzc[] = {
		"android.", "com.android.", "dalvik.", "java.", "javax."
	};
	private static DropBoxManager zzzd;
	private static boolean zzze = false;
	private static boolean zzzf = false;
	private static boolean zzzg = false;
	private static int zzzh = -1;
	private static int zzzi;
	private static int zzzj;

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #30  <String "android.">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #32  <String "com.android.">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #34  <String "dalvik.">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #36  <String "java.">
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #38  <String "javax.">
	//   21   28:aastore         
	//   22   29:putstatic       #40  <Field String[] zzzc>
	//*  23   32:return          
	}
}
