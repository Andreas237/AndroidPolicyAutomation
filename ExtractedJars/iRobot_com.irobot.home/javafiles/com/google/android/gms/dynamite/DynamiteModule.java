// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.*;

// Referenced classes of package com.google.android.gms.dynamite:
//			zza, zzb, zzc, zzd, 
//			zze, zzf, zzg, zzh, 
//			zzk, zzl, zzi, zzj

public final class DynamiteModule
{
	public static class DynamiteLoaderClassLoader
	{

		public static ClassLoader sClassLoader;

		public DynamiteLoaderClassLoader()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class LoadingException extends Exception
	{

		private LoadingException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void Exception(String)>
		//    3    5:return          
		}

		LoadingException(String s, com.google.android.gms.dynamite.zza zza1)
		{
			this(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void DynamiteModule$LoadingException(String)>
		//    3    5:return          
		}

		private LoadingException(String s, Throwable throwable)
		{
			super(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #18  <Method void Exception(String, Throwable)>
		//    4    6:return          
		}

		LoadingException(String s, Throwable throwable, com.google.android.gms.dynamite.zza zza1)
		{
			this(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #20  <Method void DynamiteModule$LoadingException(String, Throwable)>
		//    4    6:return          
		}
	}

	public static interface VersionPolicy
	{

		public abstract zzb zza(Context context, String s, zza zza1);
	}

	public static interface VersionPolicy.zza
	{

		public abstract int getLocalVersion(Context context, String s);

		public abstract int zza(Context context, String s, boolean flag);
	}

	public static final class VersionPolicy.zzb
	{

		public int zziq;
		public int zzir;
		public int zzis;

		public VersionPolicy.zzb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			zziq = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #20  <Field int zziq>
			zzir = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #22  <Field int zzir>
			zzis = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #24  <Field int zzis>
		//   11   19:return          
		}
	}

	private static final class zza
	{

		public Cursor zzin;

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

		zza(com.google.android.gms.dynamite.zza zza1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void DynamiteModule$zza()>
		//    2    4:return          
		}
	}

	private static final class zzb
		implements VersionPolicy.zza
	{

		public final int getLocalVersion(Context context, String s)
		{
			return zzio;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int zzio>
		//    2    4:ireturn         
		}

		public final int zza(Context context, String s, boolean flag)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		private final int zzio;
		private final int zzip = 0;

		public zzb(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzio = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int zzio>
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #21  <Field int zzip>
		//    8   14:return          
		}
	}


	private DynamiteModule(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void Object()>
		zzim = (Context)Preconditions.checkNotNull(((Object) (context)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #105 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #107 <Class Context>
	//    6   12:putfield        #109 <Field Context zzim>
	//    7   15:return          
	}

	public static int getLocalVersion(Context context, String s)
	{
		Object obj;
		context = ((Context) (context.getApplicationContext().getClassLoader()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #119 <Method Context Context.getApplicationContext()>
	//    2    4:invokevirtual   #123 <Method ClassLoader Context.getClassLoader()>
	//    3    7:astore_0        
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 61)));
	//    4    8:new             #125 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokestatic    #131 <Method String String.valueOf(Object)>
	//    8   16:invokevirtual   #135 <Method int String.length()>
	//    9   19:bipush          61
	//   10   21:iadd            
	//   11   22:invokespecial   #138 <Method void StringBuilder(int)>
	//   12   25:astore_3        
		((StringBuilder) (obj)).append("com.google.android.gms.dynamite.descriptors.");
	//   13   26:aload_3         
	//   14   27:ldc1            #140 <String "com.google.android.gms.dynamite.descriptors.">
	//   15   29:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		((StringBuilder) (obj)).append(s);
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		((StringBuilder) (obj)).append(".ModuleDescriptor");
	//   21   39:aload_3         
	//   22   40:ldc1            #146 <String ".ModuleDescriptor">
	//   23   42:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		obj = ((Object) (((ClassLoader) (context)).loadClass(((StringBuilder) (obj)).toString())));
	//   25   46:aload_0         
	//   26   47:aload_3         
	//   27   48:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   28   51:invokevirtual   #156 <Method Class ClassLoader.loadClass(String)>
	//   29   54:astore_3        
		context = ((Context) (((Class) (obj)).getDeclaredField("MODULE_ID")));
	//   30   55:aload_3         
	//   31   56:ldc1            #158 <String "MODULE_ID">
	//   32   58:invokevirtual   #164 <Method Field Class.getDeclaredField(String)>
	//   33   61:astore_0        
		obj = ((Object) (((Class) (obj)).getDeclaredField("MODULE_VERSION")));
	//   34   62:aload_3         
	//   35   63:ldc1            #166 <String "MODULE_VERSION">
	//   36   65:invokevirtual   #164 <Method Field Class.getDeclaredField(String)>
	//   37   68:astore_3        
		if(((Field) (context)).get(((Object) (null))).equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_161;
	//   38   69:aload_0         
	//   39   70:aconst_null     
	//   40   71:invokevirtual   #171 <Method Object Field.get(Object)>
	//   41   74:aload_1         
	//   42   75:invokevirtual   #175 <Method boolean Object.equals(Object)>
	//   43   78:ifne            161
		context = ((Context) (String.valueOf(((Field) (context)).get(((Object) (null))))));
	//   44   81:aload_0         
	//   45   82:aconst_null     
	//   46   83:invokevirtual   #171 <Method Object Field.get(Object)>
	//   47   86:invokestatic    #131 <Method String String.valueOf(Object)>
	//   48   89:astore_0        
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (context))).length() + 51 + String.valueOf(((Object) (s))).length())));
	//   49   90:new             #125 <Class StringBuilder>
	//   50   93:dup             
	//   51   94:aload_0         
	//   52   95:invokestatic    #131 <Method String String.valueOf(Object)>
	//   53   98:invokevirtual   #135 <Method int String.length()>
	//   54  101:bipush          51
	//   55  103:iadd            
	//   56  104:aload_1         
	//   57  105:invokestatic    #131 <Method String String.valueOf(Object)>
	//   58  108:invokevirtual   #135 <Method int String.length()>
	//   59  111:iadd            
	//   60  112:invokespecial   #138 <Method void StringBuilder(int)>
	//   61  115:astore_3        
		((StringBuilder) (obj)).append("Module descriptor id '");
	//   62  116:aload_3         
	//   63  117:ldc1            #177 <String "Module descriptor id '">
	//   64  119:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   65  122:pop             
		((StringBuilder) (obj)).append(((String) (context)));
	//   66  123:aload_3         
	//   67  124:aload_0         
	//   68  125:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   69  128:pop             
		((StringBuilder) (obj)).append("' didn't match expected id '");
	//   70  129:aload_3         
	//   71  130:ldc1            #179 <String "' didn't match expected id '">
	//   72  132:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   73  135:pop             
		((StringBuilder) (obj)).append(s);
	//   74  136:aload_3         
	//   75  137:aload_1         
	//   76  138:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   77  141:pop             
		((StringBuilder) (obj)).append("'");
	//   78  142:aload_3         
	//   79  143:ldc1            #181 <String "'">
	//   80  145:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   81  148:pop             
		Log.e("DynamiteModule", ((StringBuilder) (obj)).toString());
	//   82  149:ldc1            #183 <String "DynamiteModule">
	//   83  151:aload_3         
	//   84  152:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   85  155:invokestatic    #189 <Method int Log.e(String, String)>
	//   86  158:pop             
		return 0;
	//   87  159:iconst_0        
	//   88  160:ireturn         
		int i;
		try
		{
			i = ((Field) (obj)).getInt(((Object) (null)));
	//   89  161:aload_3         
	//   90  162:aconst_null     
	//   91  163:invokevirtual   #193 <Method int Field.getInt(Object)>
	//   92  166:istore_2        
		}
	//*  93  167:iload_2         
	//*  94  168:ireturn         
	//*  95  169:astore_0        
	//*  96  170:aload_0         
	//*  97  171:invokevirtual   #196 <Method String Exception.getMessage()>
	//*  98  174:invokestatic    #131 <Method String String.valueOf(Object)>
	//*  99  177:astore_0        
	//* 100  178:aload_0         
	//* 101  179:invokevirtual   #135 <Method int String.length()>
	//* 102  182:ifeq            195
	//* 103  185:ldc1            #198 <String "Failed to load module descriptor class: ">
	//* 104  187:aload_0         
	//* 105  188:invokevirtual   #202 <Method String String.concat(String)>
	//* 106  191:astore_0        
	//* 107  192:goto            205
	//* 108  195:new             #127 <Class String>
	//* 109  198:dup             
	//* 110  199:ldc1            #198 <String "Failed to load module descriptor class: ">
	//* 111  201:invokespecial   #205 <Method void String(String)>
	//* 112  204:astore_0        
	//* 113  205:ldc1            #183 <String "DynamiteModule">
	//* 114  207:aload_0         
	//* 115  208:invokestatic    #189 <Method int Log.e(String, String)>
	//* 116  211:pop             
	//* 117  212:iconst_0        
	//* 118  213:ireturn         
	//* 119  214:new             #125 <Class StringBuilder>
	//* 120  217:dup             
	//* 121  218:aload_1         
	//* 122  219:invokestatic    #131 <Method String String.valueOf(Object)>
	//* 123  222:invokevirtual   #135 <Method int String.length()>
	//* 124  225:bipush          45
	//* 125  227:iadd            
	//* 126  228:invokespecial   #138 <Method void StringBuilder(int)>
	//* 127  231:astore_0        
	//* 128  232:aload_0         
	//* 129  233:ldc1            #207 <String "Local module descriptor class for ">
	//* 130  235:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//* 131  238:pop             
	//* 132  239:aload_0         
	//* 133  240:aload_1         
	//* 134  241:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//* 135  244:pop             
	//* 136  245:aload_0         
	//* 137  246:ldc1            #209 <String " not found.">
	//* 138  248:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//* 139  251:pop             
	//* 140  252:ldc1            #183 <String "DynamiteModule">
	//* 141  254:aload_0         
	//* 142  255:invokevirtual   #150 <Method String StringBuilder.toString()>
	//* 143  258:invokestatic    #212 <Method int Log.w(String, String)>
	//* 144  261:pop             
	//* 145  262:iconst_0        
	//* 146  263:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = ((Context) (new StringBuilder(String.valueOf(((Object) (s))).length() + 45)));
			((StringBuilder) (context)).append("Local module descriptor class for ");
			((StringBuilder) (context)).append(s);
			((StringBuilder) (context)).append(" not found.");
			Log.w("DynamiteModule", ((StringBuilder) (context)).toString());
			return 0;
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = ((Context) (String.valueOf(((Object) (((Exception) (context)).getMessage())))));
			if(((String) (context)).length() != 0)
				context = ((Context) ("Failed to load module descriptor class: ".concat(((String) (context)))));
			else
				context = ((Context) (new String("Failed to load module descriptor class: ")));
			Log.e("DynamiteModule", ((String) (context)));
			return 0;
		}
		return i;
	//* 147  264:astore_0        
	//* 148  265:goto            214
	}

	public static int getRemoteVersion(Context context, String s)
	{
		return zza(context, s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #217 <Method int zza(Context, String, boolean)>
	//    4    6:ireturn         
	}

	public static DynamiteModule load(Context context, VersionPolicy versionpolicy, String s)
	{
		zza zza1;
		zza zza2;
		zza1 = (zza)zzii.get();
	//    0    0:getstatic       #61  <Field ThreadLocal zzii>
	//    1    3:invokevirtual   #222 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #21  <Class DynamiteModule$zza>
	//    3    9:astore          6
		zza2 = new zza(((com.google.android.gms.dynamite.zza) (null)));
	//    4   11:new             #21  <Class DynamiteModule$zza>
	//    5   14:dup             
	//    6   15:aconst_null     
	//    7   16:invokespecial   #225 <Method void DynamiteModule$zza(zza)>
	//    8   19:astore          7
		zzii.set(((Object) (zza2)));
	//    9   21:getstatic       #61  <Field ThreadLocal zzii>
	//   10   24:aload           7
	//   11   26:invokevirtual   #229 <Method void ThreadLocal.set(Object)>
		VersionPolicy.zzb zzb1;
		zzb1 = versionpolicy.zza(context, s, zzij);
	//   12   29:aload_1         
	//   13   30:aload_0         
	//   14   31:aload_2         
	//   15   32:getstatic       #66  <Field DynamiteModule$VersionPolicy$zza zzij>
	//   16   35:invokeinterface #232 <Method DynamiteModule$VersionPolicy$zzb DynamiteModule$VersionPolicy.zza(Context, String, DynamiteModule$VersionPolicy$zza)>
	//   17   40:astore          8
		int i = zzb1.zziq;
	//   18   42:aload           8
	//   19   44:getfield        #235 <Field int DynamiteModule$VersionPolicy$zzb.zziq>
	//   20   47:istore_3        
		int i1 = zzb1.zzir;
	//   21   48:aload           8
	//   22   50:getfield        #238 <Field int DynamiteModule$VersionPolicy$zzb.zzir>
	//   23   53:istore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 68 + String.valueOf(((Object) (s))).length());
	//   24   55:new             #125 <Class StringBuilder>
	//   25   58:dup             
	//   26   59:aload_2         
	//   27   60:invokestatic    #131 <Method String String.valueOf(Object)>
	//   28   63:invokevirtual   #135 <Method int String.length()>
	//   29   66:bipush          68
	//   30   68:iadd            
	//   31   69:aload_2         
	//   32   70:invokestatic    #131 <Method String String.valueOf(Object)>
	//   33   73:invokevirtual   #135 <Method int String.length()>
	//   34   76:iadd            
	//   35   77:invokespecial   #138 <Method void StringBuilder(int)>
	//   36   80:astore          5
		stringbuilder.append("Considering local module ");
	//   37   82:aload           5
	//   38   84:ldc1            #240 <String "Considering local module ">
	//   39   86:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   40   89:pop             
		stringbuilder.append(s);
	//   41   90:aload           5
	//   42   92:aload_2         
	//   43   93:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   44   96:pop             
		stringbuilder.append(":");
	//   45   97:aload           5
	//   46   99:ldc1            #242 <String ":">
	//   47  101:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   48  104:pop             
		stringbuilder.append(i);
	//   49  105:aload           5
	//   50  107:iload_3         
	//   51  108:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//   52  111:pop             
		stringbuilder.append(" and remote module ");
	//   53  112:aload           5
	//   54  114:ldc1            #247 <String " and remote module ">
	//   55  116:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   56  119:pop             
		stringbuilder.append(s);
	//   57  120:aload           5
	//   58  122:aload_2         
	//   59  123:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   60  126:pop             
		stringbuilder.append(":");
	//   61  127:aload           5
	//   62  129:ldc1            #242 <String ":">
	//   63  131:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   64  134:pop             
		stringbuilder.append(i1);
	//   65  135:aload           5
	//   66  137:iload           4
	//   67  139:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//   68  142:pop             
		Log.i("DynamiteModule", stringbuilder.toString());
	//   69  143:ldc1            #183 <String "DynamiteModule">
	//   70  145:aload           5
	//   71  147:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   72  150:invokestatic    #250 <Method int Log.i(String, String)>
	//   73  153:pop             
		if(zzb1.zzis == 0 || zzb1.zzis == -1 && zzb1.zziq == 0 || zzb1.zzis == 1 && zzb1.zzir == 0)
	//*  74  154:aload           8
	//*  75  156:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//*  76  159:ifeq            465
	//*  77  162:aload           8
	//*  78  164:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//*  79  167:iconst_m1       
	//*  80  168:icmpne          179
	//*  81  171:aload           8
	//*  82  173:getfield        #235 <Field int DynamiteModule$VersionPolicy$zzb.zziq>
	//*  83  176:ifeq            465
	//*  84  179:aload           8
	//*  85  181:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//*  86  184:iconst_1        
	//*  87  185:icmpne          199
	//*  88  188:aload           8
	//*  89  190:getfield        #238 <Field int DynamiteModule$VersionPolicy$zzb.zzir>
	//*  90  193:ifne            199
			break MISSING_BLOCK_LABEL_465;
	//   91  196:goto            465
		if(zzb1.zzis != -1) goto _L2; else goto _L1
	//   92  199:aload           8
	//   93  201:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//   94  204:iconst_m1       
	//   95  205:icmpne          246
_L1:
		versionpolicy = ((VersionPolicy) (zze(context, s)));
	//   96  208:aload_0         
	//   97  209:aload_2         
	//   98  210:invokestatic    #257 <Method DynamiteModule zze(Context, String)>
	//   99  213:astore_1        
		context = ((Context) (versionpolicy));
	//  100  214:aload_1         
	//  101  215:astore_0        
		if(zza2.zzin == null) goto _L4; else goto _L3
	//  102  216:aload           7
	//  103  218:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//  104  221:ifnull          236
_L3:
		context = ((Context) (versionpolicy));
	//  105  224:aload_1         
	//  106  225:astore_0        
_L7:
		zza2.zzin.close();
	//  107  226:aload           7
	//  108  228:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//  109  231:invokeinterface #266 <Method void Cursor.close()>
_L4:
		zzii.set(((Object) (zza1)));
	//  110  236:getstatic       #61  <Field ThreadLocal zzii>
	//  111  239:aload           6
	//  112  241:invokevirtual   #229 <Method void ThreadLocal.set(Object)>
		return ((DynamiteModule) (context));
	//  113  244:aload_0         
	//  114  245:areturn         
_L2:
		int j = zzb1.zzis;
	//  115  246:aload           8
	//  116  248:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//  117  251:istore_3        
		if(j != 1)
			break MISSING_BLOCK_LABEL_422;
	//  118  252:iload_3         
	//  119  253:iconst_1        
	//  120  254:icmpne          422
		Object obj = ((Object) (zza(context, s, zzb1.zzir)));
	//  121  257:aload_0         
	//  122  258:aload_2         
	//  123  259:aload           8
	//  124  261:getfield        #238 <Field int DynamiteModule$VersionPolicy$zzb.zzir>
	//  125  264:invokestatic    #269 <Method DynamiteModule zza(Context, String, int)>
	//  126  267:astore          5
		if(zza2.zzin != null)
	//* 127  269:aload           7
	//* 128  271:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//* 129  274:ifnull          287
			zza2.zzin.close();
	//  130  277:aload           7
	//  131  279:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//  132  282:invokeinterface #266 <Method void Cursor.close()>
		zzii.set(((Object) (zza1)));
	//  133  287:getstatic       #61  <Field ThreadLocal zzii>
	//  134  290:aload           6
	//  135  292:invokevirtual   #229 <Method void ThreadLocal.set(Object)>
		return ((DynamiteModule) (obj));
	//  136  295:aload           5
	//  137  297:areturn         
		LoadingException loadingexception;
		loadingexception;
	//  138  298:astore          9
		obj = ((Object) (String.valueOf(((Object) (loadingexception.getMessage())))));
	//  139  300:aload           9
	//  140  302:invokevirtual   #270 <Method String DynamiteModule$LoadingException.getMessage()>
	//  141  305:invokestatic    #131 <Method String String.valueOf(Object)>
	//  142  308:astore          5
		if(((String) (obj)).length() != 0)
	//* 143  310:aload           5
	//* 144  312:invokevirtual   #135 <Method int String.length()>
	//* 145  315:ifeq            331
		{
			obj = ((Object) ("Failed to load remote module: ".concat(((String) (obj)))));
	//  146  318:ldc2            #272 <String "Failed to load remote module: ">
	//  147  321:aload           5
	//  148  323:invokevirtual   #202 <Method String String.concat(String)>
	//  149  326:astore          5
			break MISSING_BLOCK_LABEL_343;
	//  150  328:goto            343
		}
		obj = ((Object) (new String("Failed to load remote module: ")));
	//  151  331:new             #127 <Class String>
	//  152  334:dup             
	//  153  335:ldc2            #272 <String "Failed to load remote module: ">
	//  154  338:invokespecial   #205 <Method void String(String)>
	//  155  341:astore          5
		Log.w("DynamiteModule", ((String) (obj)));
	//  156  343:ldc1            #183 <String "DynamiteModule">
	//  157  345:aload           5
	//  158  347:invokestatic    #212 <Method int Log.w(String, String)>
	//  159  350:pop             
		if(zzb1.zziq == 0 || versionpolicy.zza(context, s, ((VersionPolicy.zza) (new zzb(zzb1.zziq, 0)))).zzis != -1)
			break; /* Loop/switch isn't completed */
	//  160  351:aload           8
	//  161  353:getfield        #235 <Field int DynamiteModule$VersionPolicy$zzb.zziq>
	//  162  356:ifeq            408
	//  163  359:aload_1         
	//  164  360:aload_0         
	//  165  361:aload_2         
	//  166  362:new             #23  <Class DynamiteModule$zzb>
	//  167  365:dup             
	//  168  366:aload           8
	//  169  368:getfield        #235 <Field int DynamiteModule$VersionPolicy$zzb.zziq>
	//  170  371:iconst_0        
	//  171  372:invokespecial   #275 <Method void DynamiteModule$zzb(int, int)>
	//  172  375:invokeinterface #232 <Method DynamiteModule$VersionPolicy$zzb DynamiteModule$VersionPolicy.zza(Context, String, DynamiteModule$VersionPolicy$zza)>
	//  173  380:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//  174  383:iconst_m1       
	//  175  384:icmpne          408
		versionpolicy = ((VersionPolicy) (zze(context, s)));
	//  176  387:aload_0         
	//  177  388:aload_2         
	//  178  389:invokestatic    #257 <Method DynamiteModule zze(Context, String)>
	//  179  392:astore_1        
		context = ((Context) (versionpolicy));
	//  180  393:aload_1         
	//  181  394:astore_0        
		if(zza2.zzin == null) goto _L4; else goto _L5
	//  182  395:aload           7
	//  183  397:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//  184  400:ifnull          236
_L5:
		context = ((Context) (versionpolicy));
	//  185  403:aload_1         
	//  186  404:astore_0        
		if(true) goto _L7; else goto _L6
	//  187  405:goto            226
_L6:
		throw new LoadingException("Remote load failed. No local fallback found.", ((Throwable) (loadingexception)), ((com.google.android.gms.dynamite.zza) (null)));
	//  188  408:new             #9   <Class DynamiteModule$LoadingException>
	//  189  411:dup             
	//  190  412:ldc2            #277 <String "Remote load failed. No local fallback found.">
	//  191  415:aload           9
	//  192  417:aconst_null     
	//  193  418:invokespecial   #280 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//  194  421:athrow          
		int k = zzb1.zzis;
	//  195  422:aload           8
	//  196  424:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//  197  427:istore_3        
		context = ((Context) (new StringBuilder(47)));
	//  198  428:new             #125 <Class StringBuilder>
	//  199  431:dup             
	//  200  432:bipush          47
	//  201  434:invokespecial   #138 <Method void StringBuilder(int)>
	//  202  437:astore_0        
		((StringBuilder) (context)).append("VersionPolicy returned invalid code:");
	//  203  438:aload_0         
	//  204  439:ldc2            #282 <String "VersionPolicy returned invalid code:">
	//  205  442:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  206  445:pop             
		((StringBuilder) (context)).append(k);
	//  207  446:aload_0         
	//  208  447:iload_3         
	//  209  448:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//  210  451:pop             
		throw new LoadingException(((StringBuilder) (context)).toString(), ((com.google.android.gms.dynamite.zza) (null)));
	//  211  452:new             #9   <Class DynamiteModule$LoadingException>
	//  212  455:dup             
	//  213  456:aload_0         
	//  214  457:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  215  460:aconst_null     
	//  216  461:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//  217  464:athrow          
		int l = zzb1.zziq;
	//  218  465:aload           8
	//  219  467:getfield        #235 <Field int DynamiteModule$VersionPolicy$zzb.zziq>
	//  220  470:istore_3        
		int j1 = zzb1.zzir;
	//  221  471:aload           8
	//  222  473:getfield        #238 <Field int DynamiteModule$VersionPolicy$zzb.zzir>
	//  223  476:istore          4
		context = ((Context) (new StringBuilder(91)));
	//  224  478:new             #125 <Class StringBuilder>
	//  225  481:dup             
	//  226  482:bipush          91
	//  227  484:invokespecial   #138 <Method void StringBuilder(int)>
	//  228  487:astore_0        
		((StringBuilder) (context)).append("No acceptable module found. Local version is ");
	//  229  488:aload_0         
	//  230  489:ldc2            #287 <String "No acceptable module found. Local version is ">
	//  231  492:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  232  495:pop             
		((StringBuilder) (context)).append(l);
	//  233  496:aload_0         
	//  234  497:iload_3         
	//  235  498:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//  236  501:pop             
		((StringBuilder) (context)).append(" and remote version is ");
	//  237  502:aload_0         
	//  238  503:ldc2            #289 <String " and remote version is ">
	//  239  506:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  240  509:pop             
		((StringBuilder) (context)).append(j1);
	//  241  510:aload_0         
	//  242  511:iload           4
	//  243  513:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//  244  516:pop             
		((StringBuilder) (context)).append(".");
	//  245  517:aload_0         
	//  246  518:ldc2            #291 <String ".">
	//  247  521:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  248  524:pop             
		throw new LoadingException(((StringBuilder) (context)).toString(), ((com.google.android.gms.dynamite.zza) (null)));
	//  249  525:new             #9   <Class DynamiteModule$LoadingException>
	//  250  528:dup             
	//  251  529:aload_0         
	//  252  530:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  253  533:aconst_null     
	//  254  534:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//  255  537:athrow          
		context;
	//  256  538:astore_0        
		if(zza2.zzin != null)
	//* 257  539:aload           7
	//* 258  541:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//* 259  544:ifnull          557
			zza2.zzin.close();
	//  260  547:aload           7
	//  261  549:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//  262  552:invokeinterface #266 <Method void Cursor.close()>
		zzii.set(((Object) (zza1)));
	//  263  557:getstatic       #61  <Field ThreadLocal zzii>
	//  264  560:aload           6
	//  265  562:invokevirtual   #229 <Method void ThreadLocal.set(Object)>
		throw context;
	//  266  565:aload_0         
	//  267  566:athrow          
	}

	public static int zza(Context context, String s, boolean flag)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj1 = ((Object) (zzid));
	//    2    3:getstatic       #299 <Field Boolean zzid>
	//    3    6:astore          6
		Object obj = obj1;
	//    4    8:aload           6
	//    5   10:astore          5
		if(obj1 != null) goto _L2; else goto _L1
	//    6   12:aload           6
	//    7   14:ifnonnull       288
_L1:
		obj1 = ((Object) (context.getApplicationContext().getClassLoader().loadClass(((Class) (com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader)).getName())));
	//    8   17:aload_0         
	//    9   18:invokevirtual   #119 <Method Context Context.getApplicationContext()>
	//   10   21:invokevirtual   #123 <Method ClassLoader Context.getClassLoader()>
	//   11   24:ldc1            #6   <Class DynamiteModule$DynamiteLoaderClassLoader>
	//   12   26:invokevirtual   #302 <Method String Class.getName()>
	//   13   29:invokevirtual   #156 <Method Class ClassLoader.loadClass(String)>
	//   14   32:astore          6
		obj = ((Object) (((Class) (obj1)).getDeclaredField("sClassLoader")));
	//   15   34:aload           6
	//   16   36:ldc2            #304 <String "sClassLoader">
	//   17   39:invokevirtual   #164 <Method Field Class.getDeclaredField(String)>
	//   18   42:astore          5
		obj1;
	//   19   44:aload           6
		JVM INSTR monitorenter ;
	//   20   46:monitorenter    
		ClassLoader classloader = (ClassLoader)((Field) (obj)).get(((Object) (null)));
	//   21   47:aload           5
	//   22   49:aconst_null     
	//   23   50:invokevirtual   #171 <Method Object Field.get(Object)>
	//   24   53:checkcast       #152 <Class ClassLoader>
	//   25   56:astore          7
		if(classloader == null) goto _L4; else goto _L3
	//   26   58:aload           7
	//   27   60:ifnull          92
_L3:
		if(classloader != ClassLoader.getSystemClassLoader()) goto _L6; else goto _L5
	//   28   63:aload           7
	//   29   65:invokestatic    #307 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//   30   68:if_acmpne       79
_L5:
		obj = ((Object) (Boolean.FALSE));
	//   31   71:getstatic       #312 <Field Boolean Boolean.FALSE>
	//   32   74:astore          5
		  goto _L7
	//*  33   76:goto            207
_L6:
		int i;
		boolean flag1;
		try
		{
			zza(classloader);
	//   34   79:aload           7
	//   35   81:invokestatic    #315 <Method void zza(ClassLoader)>
		}
	//*  36   84:getstatic       #318 <Field Boolean Boolean.TRUE>
	//*  37   87:astore          5
	//*  38   89:goto            207
	//*  39   92:ldc2            #320 <String "com.google.android.gms">
	//*  40   95:aload_0         
	//*  41   96:invokevirtual   #119 <Method Context Context.getApplicationContext()>
	//*  42   99:invokevirtual   #323 <Method String Context.getPackageName()>
	//*  43  102:invokevirtual   #324 <Method boolean String.equals(Object)>
	//*  44  105:ifeq            120
	//*  45  108:aload           5
	//*  46  110:aconst_null     
	//*  47  111:invokestatic    #307 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  48  114:invokevirtual   #327 <Method void Field.set(Object, Object)>
	//*  49  117:goto            71
	//*  50  120:aload_0         
	//*  51  121:aload_1         
	//*  52  122:iload_2         
	//*  53  123:invokestatic    #330 <Method int zzc(Context, String, boolean)>
	//*  54  126:istore_3        
	//*  55  127:getstatic       #332 <Field String zzig>
	//*  56  130:ifnull          187
	//*  57  133:getstatic       #332 <Field String zzig>
	//*  58  136:invokevirtual   #336 <Method boolean String.isEmpty()>
	//*  59  139:ifeq            145
	//*  60  142:goto            187
	//*  61  145:new             #338 <Class zzh>
	//*  62  148:dup             
	//*  63  149:getstatic       #332 <Field String zzig>
	//*  64  152:invokestatic    #307 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  65  155:invokespecial   #341 <Method void zzh(String, ClassLoader)>
	//*  66  158:astore          7
	//*  67  160:aload           7
	//*  68  162:invokestatic    #315 <Method void zza(ClassLoader)>
	//*  69  165:aload           5
	//*  70  167:aconst_null     
	//*  71  168:aload           7
	//*  72  170:invokevirtual   #327 <Method void Field.set(Object, Object)>
	//*  73  173:getstatic       #318 <Field Boolean Boolean.TRUE>
	//*  74  176:putstatic       #299 <Field Boolean zzid>
	//*  75  179:aload           6
	//*  76  181:monitorexit     
	//*  77  182:ldc1            #2   <Class DynamiteModule>
	//*  78  184:monitorexit     
	//*  79  185:iload_3         
	//*  80  186:ireturn         
	//*  81  187:aload           6
	//*  82  189:monitorexit     
	//*  83  190:ldc1            #2   <Class DynamiteModule>
	//*  84  192:monitorexit     
	//*  85  193:iload_3         
	//*  86  194:ireturn         
	//*  87  195:aload           5
	//*  88  197:aconst_null     
	//*  89  198:invokestatic    #307 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  90  201:invokevirtual   #327 <Method void Field.set(Object, Object)>
	//*  91  204:goto            71
	//*  92  207:aload           6
	//*  93  209:monitorexit     
	//*  94  210:goto            283
	//*  95  213:astore          5
	//*  96  215:aload           6
	//*  97  217:monitorexit     
	//*  98  218:aload           5
	//*  99  220:athrow          
	//* 100  221:astore          5
	//* 101  223:aload           5
	//* 102  225:invokestatic    #131 <Method String String.valueOf(Object)>
	//* 103  228:astore          5
	//* 104  230:new             #125 <Class StringBuilder>
	//* 105  233:dup             
	//* 106  234:aload           5
	//* 107  236:invokestatic    #131 <Method String String.valueOf(Object)>
	//* 108  239:invokevirtual   #135 <Method int String.length()>
	//* 109  242:bipush          30
	//* 110  244:iadd            
	//* 111  245:invokespecial   #138 <Method void StringBuilder(int)>
	//* 112  248:astore          6
	//* 113  250:aload           6
	//* 114  252:ldc2            #343 <String "Failed to load module via V2: ">
	//* 115  255:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//* 116  258:pop             
	//* 117  259:aload           6
	//* 118  261:aload           5
	//* 119  263:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//* 120  266:pop             
	//* 121  267:ldc1            #183 <String "DynamiteModule">
	//* 122  269:aload           6
	//* 123  271:invokevirtual   #150 <Method String StringBuilder.toString()>
	//* 124  274:invokestatic    #212 <Method int Log.w(String, String)>
	//* 125  277:pop             
	//* 126  278:getstatic       #312 <Field Boolean Boolean.FALSE>
	//* 127  281:astore          5
	//* 128  283:aload           5
	//* 129  285:putstatic       #299 <Field Boolean zzid>
	//* 130  288:ldc1            #2   <Class DynamiteModule>
	//* 131  290:monitorexit     
	//* 132  291:aload           5
	//* 133  293:invokevirtual   #346 <Method boolean Boolean.booleanValue()>
	//* 134  296:istore          4
	//* 135  298:iload           4
	//* 136  300:ifeq            359
	//* 137  303:aload_0         
	//* 138  304:aload_1         
	//* 139  305:iload_2         
	//* 140  306:invokestatic    #330 <Method int zzc(Context, String, boolean)>
	//* 141  309:istore_3        
	//* 142  310:iload_3         
	//* 143  311:ireturn         
	//* 144  312:astore_1        
	//* 145  313:aload_1         
	//* 146  314:invokevirtual   #270 <Method String DynamiteModule$LoadingException.getMessage()>
	//* 147  317:invokestatic    #131 <Method String String.valueOf(Object)>
	//* 148  320:astore_1        
	//* 149  321:aload_1         
	//* 150  322:invokevirtual   #135 <Method int String.length()>
	//* 151  325:ifeq            339
	//* 152  328:ldc2            #348 <String "Failed to retrieve remote module version: ">
	//* 153  331:aload_1         
	//* 154  332:invokevirtual   #202 <Method String String.concat(String)>
	//* 155  335:astore_1        
	//* 156  336:goto            350
	//* 157  339:new             #127 <Class String>
	//* 158  342:dup             
	//* 159  343:ldc2            #348 <String "Failed to retrieve remote module version: ">
	//* 160  346:invokespecial   #205 <Method void String(String)>
	//* 161  349:astore_1        
	//* 162  350:ldc1            #183 <String "DynamiteModule">
	//* 163  352:aload_1         
	//* 164  353:invokestatic    #212 <Method int Log.w(String, String)>
	//* 165  356:pop             
	//* 166  357:iconst_0        
	//* 167  358:ireturn         
	//* 168  359:aload_0         
	//* 169  360:aload_1         
	//* 170  361:iload_2         
	//* 171  362:invokestatic    #350 <Method int zzb(Context, String, boolean)>
	//* 172  365:istore_3        
	//* 173  366:iload_3         
	//* 174  367:ireturn         
	//* 175  368:astore_1        
	//* 176  369:ldc1            #2   <Class DynamiteModule>
	//* 177  371:monitorexit     
	//* 178  372:aload_1         
	//* 179  373:athrow          
	//* 180  374:astore_1        
	//* 181  375:aload_0         
	//* 182  376:aload_1         
	//* 183  377:invokestatic    #356 <Method boolean CrashUtils.addDynamiteErrorToDropBox(Context, Throwable)>
	//* 184  380:pop             
	//* 185  381:aload_1         
	//* 186  382:athrow          
		catch(LoadingException loadingexception) { }
	//  187  383:astore          5
		obj = ((Object) (Boolean.TRUE));
		  goto _L7
_L4:
label0:
		{
			if(!"com.google.android.gms".equals(((Object) (context.getApplicationContext().getPackageName()))))
				break label0;
			((Field) (obj)).set(((Object) (null)), ((Object) (ClassLoader.getSystemClassLoader())));
		}
		  goto _L5
		i = zzc(context, s, flag);
		if(zzig == null || zzig.isEmpty())
			break MISSING_BLOCK_LABEL_187;
		zzh zzh1 = new zzh(zzig, ClassLoader.getSystemClassLoader());
		zza(((ClassLoader) (zzh1)));
		((Field) (obj)).set(((Object) (null)), ((Object) (zzh1)));
		zzid = Boolean.TRUE;
		obj1;
		JVM INSTR monitorexit ;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		return i;
		obj1;
		JVM INSTR monitorexit ;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		return i;
_L8:
		((Field) (obj)).set(((Object) (null)), ((Object) (ClassLoader.getSystemClassLoader())));
		  goto _L5
_L7:
		obj1;
		JVM INSTR monitorexit ;
		break MISSING_BLOCK_LABEL_283;
		obj;
		obj1;
		JVM INSTR monitorexit ;
		try
		{
			throw obj;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		obj = ((Object) (String.valueOf(obj)));
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 30);
		stringbuilder.append("Failed to load module via V2: ");
		stringbuilder.append(((String) (obj)));
		Log.w("DynamiteModule", stringbuilder.toString());
		obj = ((Object) (Boolean.FALSE));
		zzid = ((Boolean) (obj));
_L2:
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		flag1 = ((Boolean) (obj)).booleanValue();
		if(!flag1)
			break MISSING_BLOCK_LABEL_359;
		i = zzc(context, s, flag);
		return i;
		s;
		s = String.valueOf(((Object) (((LoadingException) (s)).getMessage())));
		if(s.length() != 0)
		{
			s = "Failed to retrieve remote module version: ".concat(s);
			break MISSING_BLOCK_LABEL_350;
		}
		s = new String("Failed to retrieve remote module version: ");
		Log.w("DynamiteModule", s);
		return 0;
		i = zzb(context, s, flag);
		return i;
		s;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		try
		{
			throw s;
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			CrashUtils.addDynamiteErrorToDropBox(context, ((Throwable) (s)));
		}
		throw s;
	//* 188  385:goto            84
		LoadingException loadingexception1;
		loadingexception1;
	//  189  388:astore          7
		  goto _L8
	//* 190  390:goto            195
	}

	private static Context zza(Context context, String s, int i, Cursor cursor, zzk zzk1)
	{
		try
		{
			ObjectWrapper.wrap(((Object) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #363 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    2    4:pop             
			if(zzai().booleanValue())
	//*   3    5:invokestatic    #367 <Method Boolean zzai()>
	//*   4    8:invokevirtual   #346 <Method boolean Boolean.booleanValue()>
	//*   5   11:ifeq            44
			{
				Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
	//    6   14:ldc1            #183 <String "DynamiteModule">
	//    7   16:ldc2            #369 <String "Dynamite loader version >= 2, using loadModule2NoCrashUtils">
	//    8   19:invokestatic    #372 <Method int Log.v(String, String)>
	//    9   22:pop             
				context = ((Context) (zzk1.zzb(ObjectWrapper.wrap(((Object) (context))), s, i, ObjectWrapper.wrap(((Object) (cursor))))));
	//   10   23:aload           4
	//   11   25:aload_0         
	//   12   26:invokestatic    #363 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   13   29:aload_1         
	//   14   30:iload_2         
	//   15   31:aload_3         
	//   16   32:invokestatic    #363 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   17   35:invokeinterface #377 <Method com.google.android.gms.dynamic.IObjectWrapper zzk.zzb(com.google.android.gms.dynamic.IObjectWrapper, String, int, com.google.android.gms.dynamic.IObjectWrapper)>
	//   18   40:astore_0        
				break MISSING_BLOCK_LABEL_71;
	//   19   41:goto            71
			}
		}
	//*  20   44:ldc1            #183 <String "DynamiteModule">
	//*  21   46:ldc2            #379 <String "Dynamite loader version < 2, falling back to loadModule2">
	//*  22   49:invokestatic    #212 <Method int Log.w(String, String)>
	//*  23   52:pop             
	//*  24   53:aload           4
	//*  25   55:aload_0         
	//*  26   56:invokestatic    #363 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//*  27   59:aload_1         
	//*  28   60:iload_2         
	//*  29   61:aload_3         
	//*  30   62:invokestatic    #363 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//*  31   65:invokeinterface #381 <Method com.google.android.gms.dynamic.IObjectWrapper zzk.zza(com.google.android.gms.dynamic.IObjectWrapper, String, int, com.google.android.gms.dynamic.IObjectWrapper)>
	//*  32   70:astore_0        
	//*  33   71:aload_0         
	//*  34   72:invokestatic    #385 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  35   75:checkcast       #107 <Class Context>
	//*  36   78:astore_0        
	//*  37   79:aload_0         
	//*  38   80:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  39   81:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((Exception) (context)).toString())))));
	//   40   82:aload_0         
	//   41   83:invokevirtual   #386 <Method String Exception.toString()>
	//   42   86:invokestatic    #131 <Method String String.valueOf(Object)>
	//   43   89:astore_0        
			if(((String) (context)).length() != 0)
	//*  44   90:aload_0         
	//*  45   91:invokevirtual   #135 <Method int String.length()>
	//*  46   94:ifeq            108
				context = ((Context) ("Failed to load DynamiteLoader: ".concat(((String) (context)))));
	//   47   97:ldc2            #388 <String "Failed to load DynamiteLoader: ">
	//   48  100:aload_0         
	//   49  101:invokevirtual   #202 <Method String String.concat(String)>
	//   50  104:astore_0        
			else
	//*  51  105:goto            119
				context = ((Context) (new String("Failed to load DynamiteLoader: ")));
	//   52  108:new             #127 <Class String>
	//   53  111:dup             
	//   54  112:ldc2            #388 <String "Failed to load DynamiteLoader: ">
	//   55  115:invokespecial   #205 <Method void String(String)>
	//   56  118:astore_0        
			Log.e("DynamiteModule", ((String) (context)));
	//   57  119:ldc1            #183 <String "DynamiteModule">
	//   58  121:aload_0         
	//   59  122:invokestatic    #189 <Method int Log.e(String, String)>
	//   60  125:pop             
			return null;
	//   61  126:aconst_null     
	//   62  127:areturn         
		}
		Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
		context = ((Context) (zzk1.zza(ObjectWrapper.wrap(((Object) (context))), s, i, ObjectWrapper.wrap(((Object) (cursor))))));
		context = (Context)ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (context)));
		return context;
	}

	private static DynamiteModule zza(Context context, String s, int i)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Boolean boolean1 = zzid;
	//    2    3:getstatic       #299 <Field Boolean zzid>
	//    3    6:astore_3        
		com/google/android/gms/dynamite/DynamiteModule;
	//    4    7:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		if(boolean1 != null)
			break MISSING_BLOCK_LABEL_26;
	//    6   10:aload_3         
	//    7   11:ifnonnull       26
		throw new LoadingException("Failed to determine which loading route to use.", ((com.google.android.gms.dynamite.zza) (null)));
	//    8   14:new             #9   <Class DynamiteModule$LoadingException>
	//    9   17:dup             
	//   10   18:ldc2            #390 <String "Failed to determine which loading route to use.">
	//   11   21:aconst_null     
	//   12   22:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//   13   25:athrow          
		if(boolean1.booleanValue())
	//*  14   26:aload_3         
	//*  15   27:invokevirtual   #346 <Method boolean Boolean.booleanValue()>
	//*  16   30:ifeq            40
			return zzc(context, s, i);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:iload_2         
	//   20   36:invokestatic    #392 <Method DynamiteModule zzc(Context, String, int)>
	//   21   39:areturn         
		s = ((String) (zzb(context, s, i)));
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:iload_2         
	//   25   43:invokestatic    #394 <Method DynamiteModule zzb(Context, String, int)>
	//   26   46:astore_1        
		return ((DynamiteModule) (s));
	//   27   47:aload_1         
	//   28   48:areturn         
		s;
	//   29   49:astore_1        
		com/google/android/gms/dynamite/DynamiteModule;
	//   30   50:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   31   52:monitorexit     
		try
		{
			throw s;
	//   32   53:aload_1         
	//   33   54:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  34   55:astore_1        
		{
			CrashUtils.addDynamiteErrorToDropBox(context, ((Throwable) (s)));
	//   35   56:aload_0         
	//   36   57:aload_1         
	//   37   58:invokestatic    #356 <Method boolean CrashUtils.addDynamiteErrorToDropBox(Context, Throwable)>
	//   38   61:pop             
		}
		throw s;
	//   39   62:aload_1         
	//   40   63:athrow          
	}

	private static void zza(ClassLoader classloader)
	{
		android.os.IInterface iinterface;
		try
		{
			classloader = ((ClassLoader) ((IBinder)classloader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0])));
	//    0    0:aload_0         
	//    1    1:ldc2            #402 <String "com.google.android.gms.dynamiteloader.DynamiteLoaderV2">
	//    2    4:invokevirtual   #156 <Method Class ClassLoader.loadClass(String)>
	//    3    7:iconst_0        
	//    4    8:anewarray       Class[]
	//    5   11:invokevirtual   #406 <Method Constructor Class.getConstructor(Class[])>
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokevirtual   #412 <Method Object Constructor.newInstance(Object[])>
	//    9   21:checkcast       #414 <Class IBinder>
	//   10   24:astore_0        
		}
	//*  11   25:aload_0         
	//*  12   26:ifnonnull       34
	//*  13   29:aconst_null     
	//*  14   30:astore_0        
	//*  15   31:goto            68
	//*  16   34:aload_0         
	//*  17   35:ldc2            #416 <String "com.google.android.gms.dynamite.IDynamiteLoaderV2">
	//*  18   38:invokeinterface #420 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//*  19   43:astore_1        
	//*  20   44:aload_1         
	//*  21   45:instanceof      #374 <Class zzk>
	//*  22   48:ifeq            59
	//*  23   51:aload_1         
	//*  24   52:checkcast       #374 <Class zzk>
	//*  25   55:astore_0        
	//*  26   56:goto            68
	//*  27   59:new             #422 <Class zzl>
	//*  28   62:dup             
	//*  29   63:aload_0         
	//*  30   64:invokespecial   #425 <Method void zzl(IBinder)>
	//*  31   67:astore_0        
	//*  32   68:aload_0         
	//*  33   69:putstatic       #427 <Field zzk zzif>
	//*  34   72:return          
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
	//*  35   73:astore_0        
		{
			throw new LoadingException("Failed to instantiate dynamite loader", ((Throwable) (classloader)), ((com.google.android.gms.dynamite.zza) (null)));
	//   36   74:new             #9   <Class DynamiteModule$LoadingException>
	//   37   77:dup             
	//   38   78:ldc2            #429 <String "Failed to instantiate dynamite loader">
	//   39   81:aload_0         
	//   40   82:aconst_null     
	//   41   83:invokespecial   #280 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//   42   86:athrow          
		}
		if(classloader == null)
		{
			classloader = null;
			break MISSING_BLOCK_LABEL_68;
		}
		iinterface = ((IBinder) (classloader)).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
		if(iinterface instanceof zzk)
		{
			classloader = ((ClassLoader) ((zzk)iinterface));
			break MISSING_BLOCK_LABEL_68;
		}
		classloader = ((ClassLoader) (new zzl(((IBinder) (classloader)))));
		zzif = ((zzk) (classloader));
		return;
	}

	private static Boolean zzai()
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		Exception exception;
		if(zzih >= 2)
	//*   2    3:getstatic       #431 <Field int zzih>
	//*   3    6:iconst_2        
	//*   4    7:icmplt          29
			flag = true;
	//    5   10:iconst_1        
	//    6   11:istore_0        
		else
	//*   7   12:goto            15
	//*   8   15:ldc1            #2   <Class DynamiteModule>
	//*   9   17:monitorexit     
	//*  10   18:iload_0         
	//*  11   19:invokestatic    #434 <Method Boolean Boolean.valueOf(boolean)>
	//*  12   22:areturn         
	//*  13   23:astore_1        
	//*  14   24:ldc1            #2   <Class DynamiteModule>
	//*  15   26:monitorexit     
	//*  16   27:aload_1         
	//*  17   28:athrow          
			flag = false;
	//   18   29:iconst_0        
	//   19   30:istore_0        
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		return Boolean.valueOf(flag);
		exception;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		throw exception;
	//*  20   31:goto            15
	}

	private static int zzb(Context context, String s, boolean flag)
	{
		zzi zzi1 = zzj(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #440 <Method zzi zzj(Context)>
	//    2    4:astore          4
		if(zzi1 == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		int i;
		try
		{
			if(zzi1.zzaj() >= 2)
	//*   7   13:aload           4
	//*   8   15:invokeinterface #445 <Method int zzi.zzaj()>
	//*   9   20:iconst_2        
	//*  10   21:icmplt          38
				return zzi1.zzb(ObjectWrapper.wrap(((Object) (context))), s, flag);
	//   11   24:aload           4
	//   12   26:aload_0         
	//   13   27:invokestatic    #363 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   14   30:aload_1         
	//   15   31:iload_2         
	//   16   32:invokeinterface #448 <Method int zzi.zzb(com.google.android.gms.dynamic.IObjectWrapper, String, boolean)>
	//   17   37:ireturn         
			Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
	//   18   38:ldc1            #183 <String "DynamiteModule">
	//   19   40:ldc2            #450 <String "IDynamite loader version < 2, falling back to getModuleVersion2">
	//   20   43:invokestatic    #212 <Method int Log.w(String, String)>
	//   21   46:pop             
			i = zzi1.zza(ObjectWrapper.wrap(((Object) (context))), s, flag);
	//   22   47:aload           4
	//   23   49:aload_0         
	//   24   50:invokestatic    #363 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   25   53:aload_1         
	//   26   54:iload_2         
	//   27   55:invokeinterface #452 <Method int zzi.zza(com.google.android.gms.dynamic.IObjectWrapper, String, boolean)>
	//   28   60:istore_3        
		}
	//*  29   61:iload_3         
	//*  30   62:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  31   63:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((RemoteException) (context)).getMessage())))));
	//   32   64:aload_0         
	//   33   65:invokevirtual   #453 <Method String RemoteException.getMessage()>
	//   34   68:invokestatic    #131 <Method String String.valueOf(Object)>
	//   35   71:astore_0        
			if(((String) (context)).length() != 0)
	//*  36   72:aload_0         
	//*  37   73:invokevirtual   #135 <Method int String.length()>
	//*  38   76:ifeq            90
				context = ((Context) ("Failed to retrieve remote module version: ".concat(((String) (context)))));
	//   39   79:ldc2            #348 <String "Failed to retrieve remote module version: ">
	//   40   82:aload_0         
	//   41   83:invokevirtual   #202 <Method String String.concat(String)>
	//   42   86:astore_0        
			else
	//*  43   87:goto            101
				context = ((Context) (new String("Failed to retrieve remote module version: ")));
	//   44   90:new             #127 <Class String>
	//   45   93:dup             
	//   46   94:ldc2            #348 <String "Failed to retrieve remote module version: ">
	//   47   97:invokespecial   #205 <Method void String(String)>
	//   48  100:astore_0        
			Log.w("DynamiteModule", ((String) (context)));
	//   49  101:ldc1            #183 <String "DynamiteModule">
	//   50  103:aload_0         
	//   51  104:invokestatic    #212 <Method int Log.w(String, String)>
	//   52  107:pop             
			return 0;
	//   53  108:iconst_0        
	//   54  109:ireturn         
		}
		return i;
	}

	private static DynamiteModule zzb(Context context, String s, int i)
	{
		Object obj;
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 51)));
	//    0    0:new             #125 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #131 <Method String String.valueOf(Object)>
	//    4    8:invokevirtual   #135 <Method int String.length()>
	//    5   11:bipush          51
	//    6   13:iadd            
	//    7   14:invokespecial   #138 <Method void StringBuilder(int)>
	//    8   17:astore_3        
		((StringBuilder) (obj)).append("Selected remote version of ");
	//    9   18:aload_3         
	//   10   19:ldc2            #455 <String "Selected remote version of ">
	//   11   22:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		((StringBuilder) (obj)).append(s);
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		((StringBuilder) (obj)).append(", version >= ");
	//   17   32:aload_3         
	//   18   33:ldc2            #457 <String ", version >= ">
	//   19   36:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		((StringBuilder) (obj)).append(i);
	//   21   40:aload_3         
	//   22   41:iload_2         
	//   23   42:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//   24   45:pop             
		Log.i("DynamiteModule", ((StringBuilder) (obj)).toString());
	//   25   46:ldc1            #183 <String "DynamiteModule">
	//   26   48:aload_3         
	//   27   49:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #250 <Method int Log.i(String, String)>
	//   29   55:pop             
		obj = ((Object) (zzj(context)));
	//   30   56:aload_0         
	//   31   57:invokestatic    #440 <Method zzi zzj(Context)>
	//   32   60:astore_3        
		if(obj == null)
	//*  33   61:aload_3         
	//*  34   62:ifnonnull       77
			throw new LoadingException("Failed to create IDynamiteLoader.", ((com.google.android.gms.dynamite.zza) (null)));
	//   35   65:new             #9   <Class DynamiteModule$LoadingException>
	//   36   68:dup             
	//   37   69:ldc2            #459 <String "Failed to create IDynamiteLoader.">
	//   38   72:aconst_null     
	//   39   73:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//   40   76:athrow          
label0:
		{
			if(((zzi) (obj)).zzaj() >= 2)
	//*  41   77:aload_3         
	//*  42   78:invokeinterface #445 <Method int zzi.zzaj()>
	//*  43   83:iconst_2        
	//*  44   84:icmplt          103
			{
				context = ((Context) (((zzi) (obj)).zzb(ObjectWrapper.wrap(((Object) (context))), s, i)));
	//   45   87:aload_3         
	//   46   88:aload_0         
	//   47   89:invokestatic    #363 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   48   92:aload_1         
	//   49   93:iload_2         
	//   50   94:invokeinterface #462 <Method com.google.android.gms.dynamic.IObjectWrapper zzi.zzb(com.google.android.gms.dynamic.IObjectWrapper, String, int)>
	//   51   99:astore_0        
				break label0;
	//   52  100:goto            125
			}
			try
			{
				Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
	//   53  103:ldc1            #183 <String "DynamiteModule">
	//   54  105:ldc2            #464 <String "Dynamite loader version < 2, falling back to createModuleContext">
	//   55  108:invokestatic    #212 <Method int Log.w(String, String)>
	//   56  111:pop             
				context = ((Context) (((zzi) (obj)).zza(ObjectWrapper.wrap(((Object) (context))), s, i)));
	//   57  112:aload_3         
	//   58  113:aload_0         
	//   59  114:invokestatic    #363 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   60  117:aload_1         
	//   61  118:iload_2         
	//   62  119:invokeinterface #466 <Method com.google.android.gms.dynamic.IObjectWrapper zzi.zza(com.google.android.gms.dynamic.IObjectWrapper, String, int)>
	//   63  124:astore_0        
			}
	//*  64  125:aload_0         
	//*  65  126:invokestatic    #385 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  66  129:ifnonnull       144
	//*  67  132:new             #9   <Class DynamiteModule$LoadingException>
	//*  68  135:dup             
	//*  69  136:ldc2            #468 <String "Failed to load remote module.">
	//*  70  139:aconst_null     
	//*  71  140:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//*  72  143:athrow          
	//*  73  144:new             #2   <Class DynamiteModule>
	//*  74  147:dup             
	//*  75  148:aload_0         
	//*  76  149:invokestatic    #385 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  77  152:checkcast       #107 <Class Context>
	//*  78  155:invokespecial   #470 <Method void DynamiteModule(Context)>
	//*  79  158:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  80  159:astore_0        
			{
				throw new LoadingException("Failed to load remote module.", ((Throwable) (context)), ((com.google.android.gms.dynamite.zza) (null)));
	//   81  160:new             #9   <Class DynamiteModule$LoadingException>
	//   82  163:dup             
	//   83  164:ldc2            #468 <String "Failed to load remote module.">
	//   84  167:aload_0         
	//   85  168:aconst_null     
	//   86  169:invokespecial   #280 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//   87  172:athrow          
			}
		}
		if(ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (context))) == null)
			throw new LoadingException("Failed to load remote module.", ((com.google.android.gms.dynamite.zza) (null)));
		else
			return new DynamiteModule((Context)ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (context))));
	}

	private static int zzc(Context context, String s, boolean flag)
	{
		zza zza1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		ContentResolver contentresolver = context.getContentResolver();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #474 <Method ContentResolver Context.getContentResolver()>
	//    4    7:astore          6
		int i;
		int j;
		StringBuilder stringbuilder;
		if(flag)
	//*   5    9:iload_2         
	//*   6   10:ifeq            301
			context = "api_force_staging";
	//    7   13:ldc2            #476 <String "api_force_staging">
	//    8   16:astore_0        
		else
	//*   9   17:goto            20
	//*  10   20:new             #125 <Class StringBuilder>
	//*  11   23:dup             
	//*  12   24:aload_0         
	//*  13   25:invokestatic    #131 <Method String String.valueOf(Object)>
	//*  14   28:invokevirtual   #135 <Method int String.length()>
	//*  15   31:bipush          42
	//*  16   33:iadd            
	//*  17   34:aload_1         
	//*  18   35:invokestatic    #131 <Method String String.valueOf(Object)>
	//*  19   38:invokevirtual   #135 <Method int String.length()>
	//*  20   41:iadd            
	//*  21   42:invokespecial   #138 <Method void StringBuilder(int)>
	//*  22   45:astore          7
	//*  23   47:aload           7
	//*  24   49:ldc2            #478 <String "content://com.google.android.gms.chimera/">
	//*  25   52:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  26   55:pop             
	//*  27   56:aload           7
	//*  28   58:aload_0         
	//*  29   59:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  30   62:pop             
	//*  31   63:aload           7
	//*  32   65:ldc2            #480 <String "/">
	//*  33   68:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  34   71:pop             
	//*  35   72:aload           7
	//*  36   74:aload_1         
	//*  37   75:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  38   78:pop             
	//*  39   79:aload           6
	//*  40   81:aload           7
	//*  41   83:invokevirtual   #150 <Method String StringBuilder.toString()>
	//*  42   86:invokestatic    #486 <Method Uri Uri.parse(String)>
	//*  43   89:aconst_null     
	//*  44   90:aconst_null     
	//*  45   91:aconst_null     
	//*  46   92:aconst_null     
	//*  47   93:invokevirtual   #492 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//*  48   96:astore_0        
	//*  49   97:aload_0         
	//*  50   98:ifnull          235
	//*  51  101:aload_0         
	//*  52  102:invokeinterface #495 <Method boolean Cursor.moveToFirst()>
	//*  53  107:ifne            113
	//*  54  110:goto            235
	//*  55  113:aload_0         
	//*  56  114:iconst_0        
	//*  57  115:invokeinterface #498 <Method int Cursor.getInt(int)>
	//*  58  120:istore_3        
	//*  59  121:aload_0         
	//*  60  122:astore_1        
	//*  61  123:iload_3         
	//*  62  124:ifle            215
	//*  63  127:ldc1            #2   <Class DynamiteModule>
	//*  64  129:monitorenter    
	//*  65  130:aload_0         
	//*  66  131:iconst_2        
	//*  67  132:invokeinterface #502 <Method String Cursor.getString(int)>
	//*  68  137:putstatic       #332 <Field String zzig>
	//*  69  140:aload_0         
	//*  70  141:ldc2            #504 <String "loaderVersion">
	//*  71  144:invokeinterface #508 <Method int Cursor.getColumnIndex(String)>
	//*  72  149:istore          4
	//*  73  151:iload           4
	//*  74  153:iflt            167
	//*  75  156:aload_0         
	//*  76  157:iload           4
	//*  77  159:invokeinterface #498 <Method int Cursor.getInt(int)>
	//*  78  164:putstatic       #431 <Field int zzih>
	//*  79  167:ldc1            #2   <Class DynamiteModule>
	//*  80  169:monitorexit     
	//*  81  170:getstatic       #61  <Field ThreadLocal zzii>
	//*  82  173:invokevirtual   #222 <Method Object ThreadLocal.get()>
	//*  83  176:checkcast       #21  <Class DynamiteModule$zza>
	//*  84  179:astore          5
	//*  85  181:aload_0         
	//*  86  182:astore_1        
	//*  87  183:aload           5
	//*  88  185:ifnull          215
	//*  89  188:aload_0         
	//*  90  189:astore_1        
	//*  91  190:aload           5
	//*  92  192:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//*  93  195:ifnonnull       215
	//*  94  198:aload           5
	//*  95  200:aload_0         
	//*  96  201:putfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//*  97  204:aconst_null     
	//*  98  205:astore_1        
	//*  99  206:goto            215
	//* 100  209:astore_1        
	//* 101  210:ldc1            #2   <Class DynamiteModule>
	//* 102  212:monitorexit     
	//* 103  213:aload_1         
	//* 104  214:athrow          
	//* 105  215:aload_1         
	//* 106  216:ifnull          225
	//* 107  219:aload_1         
	//* 108  220:invokeinterface #266 <Method void Cursor.close()>
	//* 109  225:iload_3         
	//* 110  226:ireturn         
	//* 111  227:astore_1        
	//* 112  228:goto            289
	//* 113  231:astore_1        
	//* 114  232:goto            266
	//* 115  235:ldc1            #183 <String "DynamiteModule">
	//* 116  237:ldc2            #510 <String "Failed to retrieve remote module version.">
	//* 117  240:invokestatic    #212 <Method int Log.w(String, String)>
	//* 118  243:pop             
	//* 119  244:new             #9   <Class DynamiteModule$LoadingException>
	//* 120  247:dup             
	//* 121  248:ldc2            #512 <String "Failed to connect to dynamite module ContentResolver.">
	//* 122  251:aconst_null     
	//* 123  252:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//* 124  255:athrow          
	//* 125  256:astore_1        
	//* 126  257:aload           5
	//* 127  259:astore_0        
	//* 128  260:goto            289
	//* 129  263:astore_1        
	//* 130  264:aconst_null     
	//* 131  265:astore_0        
	//* 132  266:aload_1         
	//* 133  267:instanceof      #9   <Class DynamiteModule$LoadingException>
	//* 134  270:ifeq            275
	//* 135  273:aload_1         
	//* 136  274:athrow          
	//* 137  275:new             #9   <Class DynamiteModule$LoadingException>
	//* 138  278:dup             
	//* 139  279:ldc2            #514 <String "V2 version check failed">
	//* 140  282:aload_1         
	//* 141  283:aconst_null     
	//* 142  284:invokespecial   #280 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//* 143  287:athrow          
	//* 144  288:astore_1        
	//* 145  289:aload_0         
	//* 146  290:ifnull          299
	//* 147  293:aload_0         
	//* 148  294:invokeinterface #266 <Method void Cursor.close()>
	//* 149  299:aload_1         
	//* 150  300:athrow          
			context = "api";
	//  151  301:ldc2            #516 <String "api">
	//  152  304:astore_0        
		stringbuilder = new StringBuilder(String.valueOf(((Object) (context))).length() + 42 + String.valueOf(((Object) (s))).length());
		stringbuilder.append("content://com.google.android.gms.chimera/");
		stringbuilder.append(((String) (context)));
		stringbuilder.append("/");
		stringbuilder.append(s);
		context = ((Context) (contentresolver.query(Uri.parse(stringbuilder.toString()), ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)))));
		if(context == null)
			break MISSING_BLOCK_LABEL_235;
		if(!((Cursor) (context)).moveToFirst())
			break MISSING_BLOCK_LABEL_235;
		i = ((Cursor) (context)).getInt(0);
		s = ((String) (context));
		if(i <= 0)
			break MISSING_BLOCK_LABEL_215;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorenter ;
		zzig = ((Cursor) (context)).getString(2);
		j = ((Cursor) (context)).getColumnIndex("loaderVersion");
		if(j < 0)
			break MISSING_BLOCK_LABEL_167;
		zzih = ((Cursor) (context)).getInt(j);
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		zza1 = (zza)zzii.get();
		s = ((String) (context));
		if(zza1 == null)
			break MISSING_BLOCK_LABEL_215;
		s = ((String) (context));
		if(zza1.zzin != null)
			break MISSING_BLOCK_LABEL_215;
		zza1.zzin = ((Cursor) (context));
		s = null;
		break MISSING_BLOCK_LABEL_215;
		s;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		try
		{
			throw s;
		}
		// Misplaced declaration of an exception variable
		catch(String s) { }
		break MISSING_BLOCK_LABEL_266;
		if(s != null)
			((Cursor) (s)).close();
		return i;
		s;
		break MISSING_BLOCK_LABEL_289;
		Log.w("DynamiteModule", "Failed to retrieve remote module version.");
		throw new LoadingException("Failed to connect to dynamite module ContentResolver.", ((com.google.android.gms.dynamite.zza) (null)));
		s;
		context = ((Context) (zza1));
		break MISSING_BLOCK_LABEL_289;
		s;
		context = null;
		if(s instanceof LoadingException)
			throw s;
		else
			throw new LoadingException("V2 version check failed", ((Throwable) (s)), ((com.google.android.gms.dynamite.zza) (null)));
		s;
		if(context != null)
			((Cursor) (context)).close();
		throw s;
	//* 153  305:goto            20
	}

	private static DynamiteModule zzc(Context context, String s, int i)
	{
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 51);
	//    0    0:new             #125 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #131 <Method String String.valueOf(Object)>
	//    4    8:invokevirtual   #135 <Method int String.length()>
	//    5   11:bipush          51
	//    6   13:iadd            
	//    7   14:invokespecial   #138 <Method void StringBuilder(int)>
	//    8   17:astore_3        
		stringbuilder.append("Selected remote version of ");
	//    9   18:aload_3         
	//   10   19:ldc2            #455 <String "Selected remote version of ">
	//   11   22:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(s);
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		stringbuilder.append(", version >= ");
	//   17   32:aload_3         
	//   18   33:ldc2            #457 <String ", version >= ">
	//   19   36:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		stringbuilder.append(i);
	//   21   40:aload_3         
	//   22   41:iload_2         
	//   23   42:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//   24   45:pop             
		Log.i("DynamiteModule", stringbuilder.toString());
	//   25   46:ldc1            #183 <String "DynamiteModule">
	//   26   48:aload_3         
	//   27   49:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #250 <Method int Log.i(String, String)>
	//   29   55:pop             
		com/google/android/gms/dynamite/DynamiteModule;
	//   30   56:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//   31   58:monitorenter    
		zzk zzk1 = zzif;
	//   32   59:getstatic       #427 <Field zzk zzif>
	//   33   62:astore_3        
		com/google/android/gms/dynamite/DynamiteModule;
	//   34   63:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   35   65:monitorexit     
		if(zzk1 == null)
	//*  36   66:aload_3         
	//*  37   67:ifnonnull       82
			throw new LoadingException("DynamiteLoaderV2 was not cached.", ((com.google.android.gms.dynamite.zza) (null)));
	//   38   70:new             #9   <Class DynamiteModule$LoadingException>
	//   39   73:dup             
	//   40   74:ldc2            #518 <String "DynamiteLoaderV2 was not cached.">
	//   41   77:aconst_null     
	//   42   78:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//   43   81:athrow          
		zza zza1 = (zza)zzii.get();
	//   44   82:getstatic       #61  <Field ThreadLocal zzii>
	//   45   85:invokevirtual   #222 <Method Object ThreadLocal.get()>
	//   46   88:checkcast       #21  <Class DynamiteModule$zza>
	//   47   91:astore          4
		if(zza1 != null && zza1.zzin != null)
	//*  48   93:aload           4
	//*  49   95:ifnull          150
	//*  50   98:aload           4
	//*  51  100:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//*  52  103:ifnonnull       109
	//*  53  106:goto            150
		{
			context = zza(context.getApplicationContext(), s, i, zza1.zzin, zzk1);
	//   54  109:aload_0         
	//   55  110:invokevirtual   #119 <Method Context Context.getApplicationContext()>
	//   56  113:aload_1         
	//   57  114:iload_2         
	//   58  115:aload           4
	//   59  117:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//   60  120:aload_3         
	//   61  121:invokestatic    #520 <Method Context zza(Context, String, int, Cursor, zzk)>
	//   62  124:astore_0        
			if(context == null)
	//*  63  125:aload_0         
	//*  64  126:ifnonnull       141
				throw new LoadingException("Failed to get module context", ((com.google.android.gms.dynamite.zza) (null)));
	//   65  129:new             #9   <Class DynamiteModule$LoadingException>
	//   66  132:dup             
	//   67  133:ldc2            #522 <String "Failed to get module context">
	//   68  136:aconst_null     
	//   69  137:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//   70  140:athrow          
			else
				return new DynamiteModule(context);
	//   71  141:new             #2   <Class DynamiteModule>
	//   72  144:dup             
	//   73  145:aload_0         
	//   74  146:invokespecial   #470 <Method void DynamiteModule(Context)>
	//   75  149:areturn         
		} else
		{
			throw new LoadingException("No result cursor", ((com.google.android.gms.dynamite.zza) (null)));
	//   76  150:new             #9   <Class DynamiteModule$LoadingException>
	//   77  153:dup             
	//   78  154:ldc2            #524 <String "No result cursor">
	//   79  157:aconst_null     
	//   80  158:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//   81  161:athrow          
		}
		context;
	//   82  162:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   83  163:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   84  165:monitorexit     
		throw context;
	//   85  166:aload_0         
	//   86  167:athrow          
	}

	private static DynamiteModule zze(Context context, String s)
	{
		s = String.valueOf(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #131 <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		if(s.length() != 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #135 <Method int String.length()>
	//*   5    9:ifeq            23
			s = "Selected local version of ".concat(s);
	//    6   12:ldc2            #526 <String "Selected local version of ">
	//    7   15:aload_1         
	//    8   16:invokevirtual   #202 <Method String String.concat(String)>
	//    9   19:astore_1        
		else
	//*  10   20:goto            34
			s = new String("Selected local version of ");
	//   11   23:new             #127 <Class String>
	//   12   26:dup             
	//   13   27:ldc2            #526 <String "Selected local version of ">
	//   14   30:invokespecial   #205 <Method void String(String)>
	//   15   33:astore_1        
		Log.i("DynamiteModule", s);
	//   16   34:ldc1            #183 <String "DynamiteModule">
	//   17   36:aload_1         
	//   18   37:invokestatic    #250 <Method int Log.i(String, String)>
	//   19   40:pop             
		return new DynamiteModule(context.getApplicationContext());
	//   20   41:new             #2   <Class DynamiteModule>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokevirtual   #119 <Method Context Context.getApplicationContext()>
	//   24   49:invokespecial   #470 <Method void DynamiteModule(Context)>
	//   25   52:areturn         
	}

	private static zzi zzj(Context context)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzie == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    3:getstatic       #528 <Field zzi zzie>
	//    3    6:ifnull          18
		context = ((Context) (zzie));
	//    4    9:getstatic       #528 <Field zzi zzie>
	//    5   12:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//    6   13:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    7   15:monitorexit     
		return ((zzi) (context));
	//    8   16:aload_0         
	//    9   17:areturn         
		if(GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0)
			break MISSING_BLOCK_LABEL_33;
	//   10   18:invokestatic    #534 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #538 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context)>
	//   13   25:ifeq            33
		com/google/android/gms/dynamite/DynamiteModule;
	//   14   28:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   15   30:monitorexit     
		return null;
	//   16   31:aconst_null     
	//   17   32:areturn         
		context = ((Context) ((IBinder)context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance()));
	//   18   33:aload_0         
	//   19   34:ldc2            #320 <String "com.google.android.gms">
	//   20   37:iconst_3        
	//   21   38:invokevirtual   #542 <Method Context Context.createPackageContext(String, int)>
	//   22   41:invokevirtual   #123 <Method ClassLoader Context.getClassLoader()>
	//   23   44:ldc2            #544 <String "com.google.android.gms.chimera.container.DynamiteLoaderImpl">
	//   24   47:invokevirtual   #156 <Method Class ClassLoader.loadClass(String)>
	//   25   50:invokevirtual   #546 <Method Object Class.newInstance()>
	//   26   53:checkcast       #414 <Class IBinder>
	//   27   56:astore_0        
		if(context == null)
	//*  28   57:aload_0         
	//*  29   58:ifnonnull       66
		{
			context = null;
	//   30   61:aconst_null     
	//   31   62:astore_0        
			break MISSING_BLOCK_LABEL_100;
	//   32   63:goto            100
		}
		android.os.IInterface iinterface = ((IBinder) (context)).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
	//   33   66:aload_0         
	//   34   67:ldc2            #548 <String "com.google.android.gms.dynamite.IDynamiteLoader">
	//   35   70:invokeinterface #420 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   36   75:astore_1        
		if(iinterface instanceof zzi)
	//*  37   76:aload_1         
	//*  38   77:instanceof      #442 <Class zzi>
	//*  39   80:ifeq            91
		{
			context = ((Context) ((zzi)iinterface));
	//   40   83:aload_1         
	//   41   84:checkcast       #442 <Class zzi>
	//   42   87:astore_0        
			break MISSING_BLOCK_LABEL_100;
	//   43   88:goto            100
		}
		context = ((Context) (new zzj(((IBinder) (context)))));
	//   44   91:new             #550 <Class zzj>
	//   45   94:dup             
	//   46   95:aload_0         
	//   47   96:invokespecial   #551 <Method void zzj(IBinder)>
	//   48   99:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_158;
	//   49  100:aload_0         
	//   50  101:ifnull          158
		zzie = ((zzi) (context));
	//   51  104:aload_0         
	//   52  105:putstatic       #528 <Field zzi zzie>
		com/google/android/gms/dynamite/DynamiteModule;
	//   53  108:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   54  110:monitorexit     
		return ((zzi) (context));
	//   55  111:aload_0         
	//   56  112:areturn         
		context;
	//   57  113:astore_0        
		context = ((Context) (String.valueOf(((Object) (((Exception) (context)).getMessage())))));
	//   58  114:aload_0         
	//   59  115:invokevirtual   #196 <Method String Exception.getMessage()>
	//   60  118:invokestatic    #131 <Method String String.valueOf(Object)>
	//   61  121:astore_0        
		if(((String) (context)).length() != 0)
	//*  62  122:aload_0         
	//*  63  123:invokevirtual   #135 <Method int String.length()>
	//*  64  126:ifeq            140
		{
			context = ((Context) ("Failed to load IDynamiteLoader from GmsCore: ".concat(((String) (context)))));
	//   65  129:ldc2            #553 <String "Failed to load IDynamiteLoader from GmsCore: ">
	//   66  132:aload_0         
	//   67  133:invokevirtual   #202 <Method String String.concat(String)>
	//   68  136:astore_0        
			break MISSING_BLOCK_LABEL_151;
	//   69  137:goto            151
		}
		context = ((Context) (new String("Failed to load IDynamiteLoader from GmsCore: ")));
	//   70  140:new             #127 <Class String>
	//   71  143:dup             
	//   72  144:ldc2            #553 <String "Failed to load IDynamiteLoader from GmsCore: ">
	//   73  147:invokespecial   #205 <Method void String(String)>
	//   74  150:astore_0        
		Log.e("DynamiteModule", ((String) (context)));
	//   75  151:ldc1            #183 <String "DynamiteModule">
	//   76  153:aload_0         
	//   77  154:invokestatic    #189 <Method int Log.e(String, String)>
	//   78  157:pop             
		com/google/android/gms/dynamite/DynamiteModule;
	//   79  158:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   80  160:monitorexit     
		return null;
	//   81  161:aconst_null     
	//   82  162:areturn         
		context;
	//   83  163:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   84  164:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   85  166:monitorexit     
		throw context;
	//   86  167:aload_0         
	//   87  168:athrow          
	}

	public final Context getModuleContext()
	{
		return zzim;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Context zzim>
	//    2    4:areturn         
	}

	public final IBinder instantiate(String s)
	{
		IBinder ibinder;
		try
		{
			ibinder = (IBinder)zzim.getClassLoader().loadClass(s).newInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Context zzim>
	//    2    4:invokevirtual   #123 <Method ClassLoader Context.getClassLoader()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #156 <Method Class ClassLoader.loadClass(String)>
	//    5   11:invokevirtual   #546 <Method Object Class.newInstance()>
	//    6   14:checkcast       #414 <Class IBinder>
	//    7   17:astore_2        
		}
	//*   8   18:aload_2         
	//*   9   19:areturn         
		catch(Object obj)
	//*  10   20:astore_2        
		{
			s = String.valueOf(((Object) (s)));
	//   11   21:aload_1         
	//   12   22:invokestatic    #131 <Method String String.valueOf(Object)>
	//   13   25:astore_1        
			if(s.length() != 0)
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #135 <Method int String.length()>
	//*  16   30:ifeq            44
				s = "Failed to instantiate module class: ".concat(s);
	//   17   33:ldc2            #558 <String "Failed to instantiate module class: ">
	//   18   36:aload_1         
	//   19   37:invokevirtual   #202 <Method String String.concat(String)>
	//   20   40:astore_1        
			else
	//*  21   41:goto            55
				s = new String("Failed to instantiate module class: ");
	//   22   44:new             #127 <Class String>
	//   23   47:dup             
	//   24   48:ldc2            #558 <String "Failed to instantiate module class: ">
	//   25   51:invokespecial   #205 <Method void String(String)>
	//   26   54:astore_1        
			throw new LoadingException(s, ((Throwable) (obj)), ((com.google.android.gms.dynamite.zza) (null)));
	//   27   55:new             #9   <Class DynamiteModule$LoadingException>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:aconst_null     
	//   32   62:invokespecial   #280 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//   33   65:athrow          
		}
		return ibinder;
	}

	public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzd();
	public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zze();
	public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzf();
	public static final VersionPolicy PREFER_REMOTE = new com.google.android.gms.dynamite.zzb();
	private static Boolean zzid;
	private static zzi zzie;
	private static zzk zzif;
	private static String zzig;
	private static int zzih = -1;
	private static final ThreadLocal zzii = new ThreadLocal();
	private static final VersionPolicy.zza zzij = new com.google.android.gms.dynamite.zza();
	private static final VersionPolicy zzik = new zzc();
	private static final VersionPolicy zzil = new zzg();
	private final Context zzim;

	static 
	{
	//    0    0:new             #56  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void ThreadLocal()>
	//    3    7:putstatic       #61  <Field ThreadLocal zzii>
	//    4   10:new             #63  <Class zza>
	//    5   13:dup             
	//    6   14:invokespecial   #64  <Method void zza()>
	//    7   17:putstatic       #66  <Field DynamiteModule$VersionPolicy$zza zzij>
	//    8   20:new             #68  <Class zzb>
	//    9   23:dup             
	//   10   24:invokespecial   #69  <Method void zzb()>
	//   11   27:putstatic       #71  <Field DynamiteModule$VersionPolicy PREFER_REMOTE>
	//   12   30:new             #73  <Class zzc>
	//   13   33:dup             
	//   14   34:invokespecial   #74  <Method void zzc()>
	//   15   37:putstatic       #76  <Field DynamiteModule$VersionPolicy zzik>
	//   16   40:new             #78  <Class zzd>
	//   17   43:dup             
	//   18   44:invokespecial   #79  <Method void zzd()>
	//   19   47:putstatic       #81  <Field DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION>
	//   20   50:new             #83  <Class zze>
	//   21   53:dup             
	//   22   54:invokespecial   #84  <Method void zze()>
	//   23   57:putstatic       #86  <Field DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING>
	//   24   60:new             #88  <Class zzf>
	//   25   63:dup             
	//   26   64:invokespecial   #89  <Method void zzf()>
	//   27   67:putstatic       #91  <Field DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION>
	//   28   70:new             #93  <Class zzg>
	//   29   73:dup             
	//   30   74:invokespecial   #94  <Method void zzg()>
	//   31   77:putstatic       #96  <Field DynamiteModule$VersionPolicy zzil>
	//*  32   80:return          
	}
}
