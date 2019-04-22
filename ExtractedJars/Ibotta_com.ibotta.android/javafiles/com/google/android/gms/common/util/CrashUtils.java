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
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:return          
	}

	public static boolean addDynamiteErrorToDropBox(Context context, Throwable throwable)
	{
		return addErrorToDropBoxInternal(context, throwable, 0x20000000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #55  <Int 0x20000000>
	//    3    4:invokestatic    #59  <Method boolean addErrorToDropBoxInternal(Context, Throwable, int)>
	//    4    7:ireturn         
	}

	public static boolean addErrorToDropBox(Context context, Throwable throwable)
	{
		return addDynamiteErrorToDropBox(context, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #63  <Method boolean addDynamiteErrorToDropBox(Context, Throwable)>
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
	//    5    5:invokestatic    #69  <Method boolean zza(Context, String, String, int, Throwable)>
	//    6    8:ireturn         
	}

	public static boolean addErrorToDropBoxInternal(Context context, Throwable throwable, int i)
	{
		Preconditions.checkNotNull(((Object) (context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #77  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (throwable)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #77  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		Throwable throwable1;
		if(!isPackageSide())
	//*   6   10:invokestatic    #81  <Method boolean isPackageSide()>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		throwable1 = throwable;
	//   10   18:aload_1         
	//   11   19:astore          4
		if(zzdb())
			break MISSING_BLOCK_LABEL_41;
	//   12   21:invokestatic    #84  <Method boolean zzdb()>
	//   13   24:ifne            41
		throwable = zza(throwable);
	//   14   27:aload_1         
	//   15   28:invokestatic    #87  <Method Throwable zza(Throwable)>
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
	//   25   44:invokestatic    #93  <Method String Log.getStackTraceString(Throwable)>
	//   26   47:invokestatic    #99  <Method String ProcessUtils.getMyProcessName()>
	//   27   50:iload_2         
	//   28   51:aload           4
	//   29   53:invokestatic    #69  <Method boolean zza(Context, String, String, int, Throwable)>
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
	//   34   60:invokestatic    #84  <Method boolean zzdb()>
	//   35   63:istore_3        
			}
	//*  36   64:goto            79
			// Misplaced declaration of an exception variable
			catch(Throwable throwable)
	//*  37   67:astore_1        
			{
				Log.e("CrashUtils", "Error determining which process we're running in!", throwable);
	//   38   68:ldc1            #101 <String "CrashUtils">
	//   39   70:ldc1            #103 <String "Error determining which process we're running in!">
	//   40   72:aload_1         
	//   41   73:invokestatic    #107 <Method int Log.e(String, String, Throwable)>
	//   42   76:pop             
				flag1 = false;
	//   43   77:iconst_0        
	//   44   78:istore_3        
			}
			if(!flag1)
	//*  45   79:iload_3         
	//*  46   80:ifne            94
			{
				Log.e("CrashUtils", "Error adding exception to DropBox!", ((Throwable) (context)));
	//   47   83:ldc1            #101 <String "CrashUtils">
	//   48   85:ldc1            #109 <String "Error adding exception to DropBox!">
	//   49   87:aload_0         
	//   50   88:invokestatic    #107 <Method int Log.e(String, String, Throwable)>
	//   51   91:pop             
				return false;
	//   52   92:iconst_0        
	//   53   93:ireturn         
			} else
			{
				throw context;
	//   54   94:aload_0         
	//   55   95:athrow          
			}
		}
		return flag;
	}

	private static boolean isPackageSide()
	{
		if(zzze)
	//*   0    0:getstatic       #42  <Field boolean zzze>
	//*   1    3:ifeq            10
			return zzzf;
	//    2    6:getstatic       #111 <Field boolean zzzf>
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
	//*   1    1:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		String as[] = zzzc;
	//    5    9:getstatic       #38  <Field String[] zzzc>
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
	//*  19   27:invokevirtual   #122 <Method boolean String.startsWith(String)>
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
	//    3    4:putstatic       #42  <Field boolean zzze>
		zzzd = dropboxmanager;
	//    4    7:aload_0         
	//    5    8:putstatic       #40  <Field DropBoxManager zzzd>
		zzzg = flag;
	//    6   11:iload_1         
	//    7   12:putstatic       #127 <Field boolean zzzg>
		zzzf = flag1;
	//    8   15:iload_2         
	//    9   16:putstatic       #111 <Field boolean zzzf>
		zzzh = i;
	//   10   19:iload_3         
	//   11   20:putstatic       #44  <Field int zzzh>
		zzzi = 0;
	//   12   23:iconst_0        
	//   13   24:putstatic       #46  <Field int zzzi>
		zzzj = 0;
	//   14   27:iconst_0        
	//   15   28:putstatic       #48  <Field int zzzj>
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
	//    2    3:new             #133 <Class StringBuilder>
	//    3    6:dup             
	//    4    7:sipush          1024
	//    5   10:invokespecial   #136 <Method void StringBuilder(int)>
	//    6   13:astore          9
		stringbuilder.append("Process: ");
	//    7   15:aload           9
	//    8   17:ldc1            #138 <String "Process: ">
	//    9   19:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		stringbuilder.append(Strings.nullToEmpty(s1));
	//   11   23:aload           9
	//   12   25:aload_2         
	//   13   26:invokestatic    #148 <Method String Strings.nullToEmpty(String)>
	//   14   29:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder.append("\n");
	//   16   33:aload           9
	//   17   35:ldc1            #150 <String "\n">
	//   18   37:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		stringbuilder.append("Package: com.google.android.gms");
	//   20   41:aload           9
	//   21   43:ldc1            #152 <String "Package: com.google.android.gms">
	//   22   45:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
		int l;
		Object obj;
		l = 0xbdfcc1;
	//   24   49:ldc1            #153 <Int 0xbdfcc1>
	//   25   51:istore          6
		obj = "12.4.51 (020308-{{cl}})";
	//   26   53:ldc1            #155 <String "12.4.51 (020308-{{cl}})">
	//   27   55:astore          8
		boolean flag = zzdb();
	//   28   57:invokestatic    #84  <Method boolean zzdb()>
	//   29   60:istore          7
		int j;
		int k;
		s1 = ((String) (obj));
	//   30   62:aload           8
	//   31   64:astore_2        
		k = l;
	//   32   65:iload           6
	//   33   67:istore          5
		if(!flag)
			break MISSING_BLOCK_LABEL_156;
	//   34   69:iload           7
	//   35   71:ifeq            156
		j = l;
	//   36   74:iload           6
	//   37   76:istore          4
		PackageInfo packageinfo = Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0);
	//   38   78:aload_0         
	//   39   79:invokestatic    #161 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   40   82:aload_0         
	//   41   83:invokevirtual   #166 <Method String Context.getPackageName()>
	//   42   86:iconst_0        
	//   43   87:invokevirtual   #172 <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//   44   90:astore          10
		j = l;
	//   45   92:iload           6
	//   46   94:istore          4
		l = packageinfo.versionCode;
	//   47   96:aload           10
	//   48   98:getfield        #177 <Field int PackageInfo.versionCode>
	//   49  101:istore          6
		j = l;
	//   50  103:iload           6
	//   51  105:istore          4
		s1 = ((String) (obj));
	//   52  107:aload           8
	//   53  109:astore_2        
		k = l;
	//   54  110:iload           6
	//   55  112:istore          5
		if(packageinfo.versionName == null)
			break MISSING_BLOCK_LABEL_156;
	//   56  114:aload           10
	//   57  116:getfield        #181 <Field String PackageInfo.versionName>
	//   58  119:ifnull          156
		j = l;
	//   59  122:iload           6
	//   60  124:istore          4
		s1 = packageinfo.versionName;
	//   61  126:aload           10
	//   62  128:getfield        #181 <Field String PackageInfo.versionName>
	//   63  131:astore_2        
		k = l;
	//   64  132:iload           6
	//   65  134:istore          5
		break MISSING_BLOCK_LABEL_156;
	//   66  136:goto            156
		s1;
	//   67  139:astore_2        
		Log.w("CrashUtils", "Error while trying to get the package information! Using static version.", ((Throwable) (s1)));
	//   68  140:ldc1            #101 <String "CrashUtils">
	//   69  142:ldc1            #183 <String "Error while trying to get the package information! Using static version.">
	//   70  144:aload_2         
	//   71  145:invokestatic    #186 <Method int Log.w(String, String, Throwable)>
	//   72  148:pop             
		k = j;
	//   73  149:iload           4
	//   74  151:istore          5
		s1 = ((String) (obj));
	//   75  153:aload           8
	//   76  155:astore_2        
		stringbuilder.append(" v");
	//   77  156:aload           9
	//   78  158:ldc1            #188 <String " v">
	//   79  160:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   80  163:pop             
		stringbuilder.append(k);
	//   81  164:aload           9
	//   82  166:iload           5
	//   83  168:invokevirtual   #191 <Method StringBuilder StringBuilder.append(int)>
	//   84  171:pop             
		if(TextUtils.isEmpty(((CharSequence) (s1))))
			break MISSING_BLOCK_LABEL_262;
	//   85  172:aload_2         
	//   86  173:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   87  176:ifne            262
		obj = ((Object) (s1));
	//   88  179:aload_2         
	//   89  180:astore          8
		if(!s1.contains("("))
			break MISSING_BLOCK_LABEL_238;
	//   90  182:aload_2         
	//   91  183:ldc1            #193 <String "(">
	//   92  185:invokevirtual   #196 <Method boolean String.contains(CharSequence)>
	//   93  188:ifeq            238
		obj = ((Object) (s1));
	//   94  191:aload_2         
	//   95  192:astore          8
		if(s1.contains(")"))
			break MISSING_BLOCK_LABEL_238;
	//   96  194:aload_2         
	//   97  195:ldc1            #198 <String ")">
	//   98  197:invokevirtual   #196 <Method boolean String.contains(CharSequence)>
	//   99  200:ifne            238
		obj = ((Object) (s1));
	//  100  203:aload_2         
	//  101  204:astore          8
		if(s1.endsWith("-"))
	//* 102  206:aload_2         
	//* 103  207:ldc1            #200 <String "-">
	//* 104  209:invokevirtual   #203 <Method boolean String.endsWith(String)>
	//* 105  212:ifeq            226
			obj = ((Object) (String.valueOf(((Object) (s1))).concat("111111111")));
	//  106  215:aload_2         
	//  107  216:invokestatic    #207 <Method String String.valueOf(Object)>
	//  108  219:ldc1            #209 <String "111111111">
	//  109  221:invokevirtual   #212 <Method String String.concat(String)>
	//  110  224:astore          8
		obj = ((Object) (String.valueOf(obj).concat(")")));
	//  111  226:aload           8
	//  112  228:invokestatic    #207 <Method String String.valueOf(Object)>
	//  113  231:ldc1            #198 <String ")">
	//  114  233:invokevirtual   #212 <Method String String.concat(String)>
	//  115  236:astore          8
		stringbuilder.append(" (");
	//  116  238:aload           9
	//  117  240:ldc1            #214 <String " (">
	//  118  242:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  119  245:pop             
		stringbuilder.append(((String) (obj)));
	//  120  246:aload           9
	//  121  248:aload           8
	//  122  250:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  123  253:pop             
		stringbuilder.append(")");
	//  124  254:aload           9
	//  125  256:ldc1            #198 <String ")">
	//  126  258:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  127  261:pop             
		stringbuilder.append("\n");
	//  128  262:aload           9
	//  129  264:ldc1            #150 <String "\n">
	//  130  266:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  131  269:pop             
		stringbuilder.append("Build: ");
	//  132  270:aload           9
	//  133  272:ldc1            #216 <String "Build: ">
	//  134  274:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  135  277:pop             
		stringbuilder.append(Build.FINGERPRINT);
	//  136  278:aload           9
	//  137  280:getstatic       #221 <Field String Build.FINGERPRINT>
	//  138  283:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  139  286:pop             
		stringbuilder.append("\n");
	//  140  287:aload           9
	//  141  289:ldc1            #150 <String "\n">
	//  142  291:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  143  294:pop             
		if(Debug.isDebuggerConnected())
	//* 144  295:invokestatic    #226 <Method boolean Debug.isDebuggerConnected()>
	//* 145  298:ifeq            309
			stringbuilder.append("Debugger: Connected\n");
	//  146  301:aload           9
	//  147  303:ldc1            #228 <String "Debugger: Connected\n">
	//  148  305:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  149  308:pop             
		if(i == 0)
			break MISSING_BLOCK_LABEL_336;
	//  150  309:iload_3         
	//  151  310:ifeq            336
		stringbuilder.append("DD-EDD: ");
	//  152  313:aload           9
	//  153  315:ldc1            #230 <String "DD-EDD: ">
	//  154  317:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  155  320:pop             
		stringbuilder.append(i);
	//  156  321:aload           9
	//  157  323:iload_3         
	//  158  324:invokevirtual   #191 <Method StringBuilder StringBuilder.append(int)>
	//  159  327:pop             
		stringbuilder.append("\n");
	//  160  328:aload           9
	//  161  330:ldc1            #150 <String "\n">
	//  162  332:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  163  335:pop             
		stringbuilder.append("\n");
	//  164  336:aload           9
	//  165  338:ldc1            #150 <String "\n">
	//  166  340:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  167  343:pop             
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//* 168  344:aload_1         
	//* 169  345:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 170  348:ifne            358
			stringbuilder.append(s);
	//  171  351:aload           9
	//  172  353:aload_1         
	//  173  354:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  174  357:pop             
		if(!zzdb()) goto _L2; else goto _L1
	//  175  358:invokestatic    #84  <Method boolean zzdb()>
	//  176  361:ifeq            665
_L1:
		if(zzzh < 0) goto _L4; else goto _L3
	//  177  364:getstatic       #44  <Field int zzzh>
	//  178  367:iflt            377
_L3:
		i = zzzh;
	//  179  370:getstatic       #44  <Field int zzzh>
	//  180  373:istore_3        
		  goto _L5
	//* 181  374:goto            391
_L4:
		i = android.provider.Settings.Secure.getInt(context.getContentResolver(), "logcat_for_system_app_crash", 0);
	//  182  377:aload_0         
	//  183  378:invokevirtual   #234 <Method android.content.ContentResolver Context.getContentResolver()>
	//  184  381:ldc1            #236 <String "logcat_for_system_app_crash">
	//  185  383:iconst_0        
	//  186  384:invokestatic    #242 <Method int android.provider.Settings$Secure.getInt(android.content.ContentResolver, String, int)>
	//  187  387:istore_3        
	//* 188  388:goto            391
_L5:
		if(i <= 0)
			break MISSING_BLOCK_LABEL_632;
	//  189  391:iload_3         
	//  190  392:ifle            632
		stringbuilder.append("\n");
	//  191  395:aload           9
	//  192  397:ldc1            #150 <String "\n">
	//  193  399:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  194  402:pop             
		s1 = null;
	//  195  403:aconst_null     
	//  196  404:astore_2        
		s = null;
	//  197  405:aconst_null     
	//  198  406:astore_1        
		context = ((Context) (s));
	//  199  407:aload_1         
	//  200  408:astore_0        
		obj = ((Object) ((new ProcessBuilder(new String[] {
			"/system/bin/logcat", "-v", "time", "-b", "events", "-b", "system", "-b", "main", "-b", 
			"crash", "-t", String.valueOf(i)
		})).redirectErrorStream(true).start()));
	//  201  409:new             #244 <Class ProcessBuilder>
	//  202  412:dup             
	//  203  413:bipush          13
	//  204  415:anewarray       String[]
	//  205  418:dup             
	//  206  419:iconst_0        
	//  207  420:ldc1            #246 <String "/system/bin/logcat">
	//  208  422:aastore         
	//  209  423:dup             
	//  210  424:iconst_1        
	//  211  425:ldc1            #248 <String "-v">
	//  212  427:aastore         
	//  213  428:dup             
	//  214  429:iconst_2        
	//  215  430:ldc1            #250 <String "time">
	//  216  432:aastore         
	//  217  433:dup             
	//  218  434:iconst_3        
	//  219  435:ldc1            #252 <String "-b">
	//  220  437:aastore         
	//  221  438:dup             
	//  222  439:iconst_4        
	//  223  440:ldc1            #254 <String "events">
	//  224  442:aastore         
	//  225  443:dup             
	//  226  444:iconst_5        
	//  227  445:ldc1            #252 <String "-b">
	//  228  447:aastore         
	//  229  448:dup             
	//  230  449:bipush          6
	//  231  451:ldc2            #256 <String "system">
	//  232  454:aastore         
	//  233  455:dup             
	//  234  456:bipush          7
	//  235  458:ldc1            #252 <String "-b">
	//  236  460:aastore         
	//  237  461:dup             
	//  238  462:bipush          8
	//  239  464:ldc2            #258 <String "main">
	//  240  467:aastore         
	//  241  468:dup             
	//  242  469:bipush          9
	//  243  471:ldc1            #252 <String "-b">
	//  244  473:aastore         
	//  245  474:dup             
	//  246  475:bipush          10
	//  247  477:ldc2            #260 <String "crash">
	//  248  480:aastore         
	//  249  481:dup             
	//  250  482:bipush          11
	//  251  484:ldc2            #262 <String "-t">
	//  252  487:aastore         
	//  253  488:dup             
	//  254  489:bipush          12
	//  255  491:iload_3         
	//  256  492:invokestatic    #265 <Method String String.valueOf(int)>
	//  257  495:aastore         
	//  258  496:invokespecial   #268 <Method void ProcessBuilder(String[])>
	//  259  499:iconst_1        
	//  260  500:invokevirtual   #272 <Method ProcessBuilder ProcessBuilder.redirectErrorStream(boolean)>
	//  261  503:invokevirtual   #276 <Method Process ProcessBuilder.start()>
	//  262  506:astore          8
		context = ((Context) (s));
	//  263  508:aload_1         
	//  264  509:astore_0        
		try
		{
			((Process) (obj)).getOutputStream().close();
	//  265  510:aload           8
	//  266  512:invokevirtual   #282 <Method OutputStream Process.getOutputStream()>
	//  267  515:invokevirtual   #287 <Method void OutputStream.close()>
		}
	//* 268  518:aload_1         
	//* 269  519:astore_0        
	//* 270  520:aload           8
	//* 271  522:invokevirtual   #291 <Method InputStream Process.getErrorStream()>
	//* 272  525:invokevirtual   #294 <Method void InputStream.close()>
	//* 273  528:aload_1         
	//* 274  529:astore_0        
	//* 275  530:new             #296 <Class InputStreamReader>
	//* 276  533:dup             
	//* 277  534:aload           8
	//* 278  536:invokevirtual   #299 <Method InputStream Process.getInputStream()>
	//* 279  539:invokespecial   #302 <Method void InputStreamReader(InputStream)>
	//* 280  542:astore_1        
	//* 281  543:sipush          8192
	//* 282  546:newarray        char[]
	//* 283  548:astore_0        
	//* 284  549:aload_1         
	//* 285  550:aload_0         
	//* 286  551:invokevirtual   #306 <Method int InputStreamReader.read(char[])>
	//* 287  554:istore_3        
	//* 288  555:iload_3         
	//* 289  556:ifle            571
	//* 290  559:aload           9
	//* 291  561:aload_0         
	//* 292  562:iconst_0        
	//* 293  563:iload_3         
	//* 294  564:invokevirtual   #309 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//* 295  567:pop             
	//* 296  568:goto            549
	//* 297  571:aload_1         
	//* 298  572:invokevirtual   #310 <Method void InputStreamReader.close()>
	//* 299  575:goto            632
	//* 300  578:astore_2        
	//* 301  579:aload_1         
	//* 302  580:astore_0        
	//* 303  581:aload_2         
	//* 304  582:astore_1        
	//* 305  583:goto            622
	//* 306  586:astore_2        
	//* 307  587:goto            599
	//* 308  590:astore_1        
	//* 309  591:goto            622
	//* 310  594:astore_0        
	//* 311  595:aload_2         
	//* 312  596:astore_1        
	//* 313  597:aload_0         
	//* 314  598:astore_2        
	//* 315  599:aload_1         
	//* 316  600:astore_0        
	//* 317  601:ldc1            #101 <String "CrashUtils">
	//* 318  603:ldc2            #312 <String "Error running logcat">
	//* 319  606:aload_2         
	//* 320  607:invokestatic    #107 <Method int Log.e(String, String, Throwable)>
	//* 321  610:pop             
	//* 322  611:aload_1         
	//* 323  612:ifnull          632
	//* 324  615:aload_1         
	//* 325  616:invokevirtual   #310 <Method void InputStreamReader.close()>
	//* 326  619:goto            632
	//* 327  622:aload_0         
	//* 328  623:ifnull          630
	//* 329  626:aload_0         
	//* 330  627:invokevirtual   #310 <Method void InputStreamReader.close()>
	//* 331  630:aload_1         
	//* 332  631:athrow          
	//* 333  632:aload           9
	//* 334  634:invokevirtual   #315 <Method String StringBuilder.toString()>
	//* 335  637:astore_0        
	//* 336  638:ldc1            #2   <Class CrashUtils>
	//* 337  640:monitorexit     
	//* 338  641:aload_0         
	//* 339  642:areturn         
	//* 340  643:astore_0        
	//* 341  644:ldc1            #2   <Class CrashUtils>
	//* 342  646:monitorexit     
	//* 343  647:aload_0         
	//* 344  648:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//  345  649:astore_0        
		context = ((Context) (s));
		try
		{
			((Process) (obj)).getErrorStream().close();
		}
	//* 346  650:goto            518
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//  347  653:astore_0        
		context = ((Context) (s));
		s = ((String) (new InputStreamReader(((Process) (obj)).getInputStream())));
		context = ((Context) (new char[8192]));
_L6:
		i = ((InputStreamReader) (s)).read(((char []) (context)));
		if(i <= 0)
			break MISSING_BLOCK_LABEL_571;
		try
		{
			stringbuilder.append(((char []) (context)), 0, i);
		}
		// Misplaced declaration of an exception variable
		catch(String s1)
		{
			break MISSING_BLOCK_LABEL_599;
		}
		  goto _L6
		try
		{
			((InputStreamReader) (s)).close();
		}
	//* 348  654:goto            528
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//  349  657:astore_0        
		break MISSING_BLOCK_LABEL_632;
	//  350  658:goto            632
		s1;
		context = ((Context) (s));
		s = s1;
		break MISSING_BLOCK_LABEL_622;
		s;
		break MISSING_BLOCK_LABEL_622;
		context;
		s = s1;
		s1 = ((String) (context));
		context = ((Context) (s));
		Log.e("CrashUtils", "Error running logcat", ((Throwable) (s1)));
		if(s == null)
			break MISSING_BLOCK_LABEL_632;
		((InputStreamReader) (s)).close();
		break MISSING_BLOCK_LABEL_632;
		if(context == null)
			break MISSING_BLOCK_LABEL_630;
		try
		{
			((InputStreamReader) (context)).close();
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//  351  661:astore_0        
		throw s;
		context = ((Context) (stringbuilder.toString()));
		com/google/android/gms/common/util/CrashUtils;
		JVM INSTR monitorexit ;
		return ((String) (context));
		context;
		throw context;
	//* 352  662:goto            630
_L2:
		i = 0;
	//  353  665:iconst_0        
	//  354  666:istore_3        
		if(true) goto _L5; else goto _L7
	//  355  667:goto            391
_L7:
	}

	private static Throwable zza(Throwable throwable)
	{
		com/google/android/gms/common/util/CrashUtils;
	//    0    0:ldc1            #2   <Class CrashUtils>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		LinkedList linkedlist = new LinkedList();
	//    2    3:new             #317 <Class LinkedList>
	//    3    6:dup             
	//    4    7:invokespecial   #318 <Method void LinkedList()>
	//    5   10:astore          7
_L2:
		if(throwable == null)
			break; /* Loop/switch isn't completed */
	//    6   12:aload_0         
	//    7   13:ifnull          276
		linkedlist.push(((Object) (throwable)));
	//    8   16:aload           7
	//    9   18:aload_0         
	//   10   19:invokevirtual   #322 <Method void LinkedList.push(Object)>
		throwable = throwable.getCause();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #328 <Method Throwable Throwable.getCause()>
	//   13   26:astore_0        
		if(true) goto _L2; else goto _L1
	//   14   27:goto            12
_L6:
		int j;
		ArrayList arraylist;
		StackTraceElement astacktraceelement[];
		if(linkedlist.isEmpty())
			break MISSING_BLOCK_LABEL_256;
	//   15   30:aload           7
	//   16   32:invokevirtual   #330 <Method boolean LinkedList.isEmpty()>
	//   17   35:ifne            256
		Throwable throwable1 = (Throwable)linkedlist.pop();
	//   18   38:aload           7
	//   19   40:invokevirtual   #334 <Method Object LinkedList.pop()>
	//   20   43:checkcast       #324 <Class Throwable>
	//   21   46:astore          5
		astacktraceelement = throwable1.getStackTrace();
	//   22   48:aload           5
	//   23   50:invokevirtual   #338 <Method StackTraceElement[] Throwable.getStackTrace()>
	//   24   53:astore          9
		arraylist = new ArrayList();
	//   25   55:new             #340 <Class ArrayList>
	//   26   58:dup             
	//   27   59:invokespecial   #341 <Method void ArrayList()>
	//   28   62:astore          8
		arraylist.add(((Object) (new StackTraceElement(((Object) (throwable1)).getClass().getName(), "<filtered>", "<filtered>", 1))));
	//   29   64:aload           8
	//   30   66:new             #343 <Class StackTraceElement>
	//   31   69:dup             
	//   32   70:aload           5
	//   33   72:invokevirtual   #347 <Method Class Object.getClass()>
	//   34   75:invokevirtual   #352 <Method String Class.getName()>
	//   35   78:ldc2            #354 <String "<filtered>">
	//   36   81:ldc2            #354 <String "<filtered>">
	//   37   84:iconst_1        
	//   38   85:invokespecial   #357 <Method void StackTraceElement(String, String, String, int)>
	//   39   88:invokevirtual   #361 <Method boolean ArrayList.add(Object)>
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
	//   54  113:invokevirtual   #364 <Method String StackTraceElement.getClassName()>
	//   55  116:astore          10
		obj = ((Object) (stacktraceelement.getFileName()));
	//   56  118:aload           6
	//   57  120:invokevirtual   #367 <Method String StackTraceElement.getFileName()>
	//   58  123:astore          5
		boolean flag;
		boolean flag1;
		if(!TextUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).startsWith(":com.google.android.gms"))
	//*  59  125:aload           5
	//*  60  127:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  61  130:ifne            283
	//*  62  133:aload           5
	//*  63  135:ldc2            #369 <String ":com.google.android.gms">
	//*  64  138:invokevirtual   #122 <Method boolean String.startsWith(String)>
	//*  65  141:ifeq            283
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
	//*  80  167:invokestatic    #371 <Method boolean isSystemClassPrefixInternal(String)>
	//*  81  170:ifne            192
	//*  82  173:new             #343 <Class StackTraceElement>
	//*  83  176:dup             
	//*  84  177:ldc2            #354 <String "<filtered>">
	//*  85  180:ldc2            #354 <String "<filtered>">
	//*  86  183:ldc2            #354 <String "<filtered>">
	//*  87  186:iconst_1        
	//*  88  187:invokespecial   #357 <Method void StackTraceElement(String, String, String, int)>
	//*  89  190:astore          5
	//*  90  192:aload           8
	//*  91  194:aload           5
	//*  92  196:invokevirtual   #361 <Method boolean ArrayList.add(Object)>
	//*  93  199:pop             
	//*  94  200:iload_2         
	//*  95  201:iconst_1        
	//*  96  202:iadd            
	//*  97  203:istore_2        
	//*  98  204:goto            99
	//*  99  207:aload_0         
	//* 100  208:ifnonnull       225
	//* 101  211:new             #324 <Class Throwable>
	//* 102  214:dup             
	//* 103  215:ldc2            #354 <String "<filtered>">
	//* 104  218:invokespecial   #374 <Method void Throwable(String)>
	//* 105  221:astore_0        
	//* 106  222:goto            237
	//* 107  225:new             #324 <Class Throwable>
	//* 108  228:dup             
	//* 109  229:ldc2            #354 <String "<filtered>">
	//* 110  232:aload_0         
	//* 111  233:invokespecial   #377 <Method void Throwable(String, Throwable)>
	//* 112  236:astore_0        
	//* 113  237:aload_0         
	//* 114  238:aload           8
	//* 115  240:iconst_0        
	//* 116  241:anewarray       StackTraceElement[]
	//* 117  244:invokevirtual   #381 <Method Object[] ArrayList.toArray(Object[])>
	//* 118  247:checkcast       #383 <Class StackTraceElement[]>
	//* 119  250:invokevirtual   #387 <Method void Throwable.setStackTrace(StackTraceElement[])>
	//* 120  253:goto            30
	//* 121  256:iload_1         
	//* 122  257:ifne            265
	//* 123  260:ldc1            #2   <Class CrashUtils>
	//* 124  262:monitorexit     
	//* 125  263:aconst_null     
	//* 126  264:areturn         
	//* 127  265:ldc1            #2   <Class CrashUtils>
	//* 128  267:monitorexit     
	//* 129  268:aload_0         
	//* 130  269:areturn         
	//* 131  270:astore_0        
	//* 132  271:ldc1            #2   <Class CrashUtils>
	//* 133  273:monitorexit     
	//* 134  274:aload_0         
	//* 135  275:athrow          
	//* 136  276:aconst_null     
	//* 137  277:astore_0        
	//* 138  278:iconst_0        
	//* 139  279:istore_1        
	//* 140  280:goto            30
			flag1 = false;
	//  141  283:iconst_0        
	//  142  284:istore_3        
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
		break MISSING_BLOCK_LABEL_237;
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
	//* 143  285:goto            149
	}

	private static boolean zza(Context context, String s, String s1, int i, Throwable throwable)
	{
		com/google/android/gms/common/util/CrashUtils;
	//    0    0:ldc1            #2   <Class CrashUtils>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Preconditions.checkNotNull(((Object) (context)));
	//    2    3:aload_0         
	//    3    4:invokestatic    #77  <Method Object Preconditions.checkNotNull(Object)>
	//    4    7:pop             
		if(!isPackageSide() || Strings.isEmptyOrWhitespace(s))
	//*   5    8:invokestatic    #81  <Method boolean isPackageSide()>
	//*   6   11:ifeq            155
	//*   7   14:aload_1         
	//*   8   15:invokestatic    #390 <Method boolean Strings.isEmptyOrWhitespace(String)>
	//*   9   18:ifeq            24
			break MISSING_BLOCK_LABEL_155;
	//   10   21:goto            155
		int k = s.hashCode();
	//   11   24:aload_1         
	//   12   25:invokevirtual   #394 <Method int String.hashCode()>
	//   13   28:istore          6
		if(throwable != null)
			break MISSING_BLOCK_LABEL_43;
	//   14   30:aload           4
	//   15   32:ifnonnull       43
		int j;
		j = zzzj;
	//   16   35:getstatic       #48  <Field int zzzj>
	//   17   38:istore          5
		break MISSING_BLOCK_LABEL_50;
	//   18   40:goto            50
		j = ((Object) (throwable)).hashCode();
	//   19   43:aload           4
	//   20   45:invokevirtual   #395 <Method int Object.hashCode()>
	//   21   48:istore          5
		int l;
		if(zzzi != k)
			break MISSING_BLOCK_LABEL_75;
	//   22   50:getstatic       #46  <Field int zzzi>
	//   23   53:iload           6
	//   24   55:icmpne          75
		l = zzzj;
	//   25   58:getstatic       #48  <Field int zzzj>
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
	//   35   77:putstatic       #46  <Field int zzzi>
		zzzj = j;
	//   36   80:iload           5
	//   37   82:putstatic       #48  <Field int zzzj>
		if(zzzd != null)
	//*  38   85:getstatic       #40  <Field DropBoxManager zzzd>
	//*  39   88:ifnull          99
		{
			throwable = ((Throwable) (zzzd));
	//   40   91:getstatic       #40  <Field DropBoxManager zzzd>
	//   41   94:astore          4
			break MISSING_BLOCK_LABEL_111;
	//   42   96:goto            111
		}
		throwable = ((Throwable) ((DropBoxManager)context.getSystemService("dropbox")));
	//   43   99:aload_0         
	//   44  100:ldc2            #397 <String "dropbox">
	//   45  103:invokevirtual   #401 <Method Object Context.getSystemService(String)>
	//   46  106:checkcast       #403 <Class DropBoxManager>
	//   47  109:astore          4
		if(throwable == null)
			break MISSING_BLOCK_LABEL_150;
	//   48  111:aload           4
	//   49  113:ifnull          150
		if(!((DropBoxManager) (throwable)).isTagEnabled("system_app_crash"))
	//*  50  116:aload           4
	//*  51  118:ldc2            #405 <String "system_app_crash">
	//*  52  121:invokevirtual   #408 <Method boolean DropBoxManager.isTagEnabled(String)>
	//*  53  124:ifne            130
			break MISSING_BLOCK_LABEL_150;
	//   54  127:goto            150
		((DropBoxManager) (throwable)).addText("system_app_crash", zza(context, s, s1, i));
	//   55  130:aload           4
	//   56  132:ldc2            #405 <String "system_app_crash">
	//   57  135:aload_0         
	//   58  136:aload_1         
	//   59  137:aload_2         
	//   60  138:iload_3         
	//   61  139:invokestatic    #410 <Method String zza(Context, String, String, int)>
	//   62  142:invokevirtual   #414 <Method void DropBoxManager.addText(String, String)>
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
	//*   0    0:getstatic       #42  <Field boolean zzze>
	//*   1    3:ifeq            10
			return zzzg;
	//    2    6:getstatic       #127 <Field boolean zzzg>
	//    3    9:ireturn         
		else
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
	}

	private static final String zzzc[] = {
		"android.", "com.android.", "dalvik.", "java.", "javax."
	};
	private static DropBoxManager zzzd = null;
	private static boolean zzze = false;
	private static boolean zzzf;
	private static boolean zzzg;
	private static int zzzh = -1;
	private static int zzzi = 0;
	private static int zzzj = 0;

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #28  <String "android.">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #30  <String "com.android.">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #32  <String "dalvik.">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #34  <String "java.">
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #36  <String "javax.">
	//   21   28:aastore         
	//   22   29:putstatic       #38  <Field String[] zzzc>
	//   23   32:aconst_null     
	//   24   33:putstatic       #40  <Field DropBoxManager zzzd>
	//   25   36:iconst_0        
	//   26   37:putstatic       #42  <Field boolean zzze>
	//   27   40:iconst_m1       
	//   28   41:putstatic       #44  <Field int zzzh>
	//   29   44:iconst_0        
	//   30   45:putstatic       #46  <Field int zzzi>
	//   31   48:iconst_0        
	//   32   49:putstatic       #48  <Field int zzzj>
	//*  33   52:return          
	}
}
