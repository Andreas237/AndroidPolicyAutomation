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
//			zzi, zzk, zzl, zzj

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

		public abstract zzb zza(Context context, String s, zza zza1)
			throws LoadingException;
	}

	public static interface VersionPolicy.zza
	{

		public abstract int getLocalVersion(Context context, String s);

		public abstract int zza(Context context, String s, boolean flag)
			throws LoadingException;
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
		throws LoadingException
	{
		zza zza1;
		zza zza2;
		zza1 = (zza)zzij.get();
	//    0    0:getstatic       #61  <Field ThreadLocal zzij>
	//    1    3:invokevirtual   #222 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #21  <Class DynamiteModule$zza>
	//    3    9:astore          6
		zza2 = new zza(((com.google.android.gms.dynamite.zza) (null)));
	//    4   11:new             #21  <Class DynamiteModule$zza>
	//    5   14:dup             
	//    6   15:aconst_null     
	//    7   16:invokespecial   #225 <Method void DynamiteModule$zza(zza)>
	//    8   19:astore          7
		zzij.set(((Object) (zza2)));
	//    9   21:getstatic       #61  <Field ThreadLocal zzij>
	//   10   24:aload           7
	//   11   26:invokevirtual   #229 <Method void ThreadLocal.set(Object)>
		VersionPolicy.zzb zzb1;
		zzb1 = versionpolicy.zza(context, s, zzik);
	//   12   29:aload_1         
	//   13   30:aload_0         
	//   14   31:aload_2         
	//   15   32:getstatic       #66  <Field DynamiteModule$VersionPolicy$zza zzik>
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
			break MISSING_BLOCK_LABEL_471;
	//   74  154:aload           8
	//   75  156:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//   76  159:ifeq            471
	//   77  162:aload           8
	//   78  164:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//   79  167:iconst_m1       
	//   80  168:icmpne          179
	//   81  171:aload           8
	//   82  173:getfield        #235 <Field int DynamiteModule$VersionPolicy$zzb.zziq>
	//   83  176:ifeq            471
	//   84  179:aload           8
	//   85  181:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//   86  184:iconst_1        
	//   87  185:icmpne          196
	//   88  188:aload           8
	//   89  190:getfield        #238 <Field int DynamiteModule$VersionPolicy$zzb.zzir>
	//   90  193:ifeq            471
		if(zzb1.zzis != -1)
			break MISSING_BLOCK_LABEL_239;
	//   91  196:aload           8
	//   92  198:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//   93  201:iconst_m1       
	//   94  202:icmpne          239
		context = ((Context) (zze(context, s)));
	//   95  205:aload_0         
	//   96  206:aload_2         
	//   97  207:invokestatic    #257 <Method DynamiteModule zze(Context, String)>
	//   98  210:astore_0        
		if(zza2.zzin != null)
	//*  99  211:aload           7
	//* 100  213:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//* 101  216:ifnull          229
			zza2.zzin.close();
	//  102  219:aload           7
	//  103  221:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//  104  224:invokeinterface #266 <Method void Cursor.close()>
		zzij.set(((Object) (zza1)));
	//  105  229:getstatic       #61  <Field ThreadLocal zzij>
	//  106  232:aload           6
	//  107  234:invokevirtual   #229 <Method void ThreadLocal.set(Object)>
		return ((DynamiteModule) (context));
	//  108  237:aload_0         
	//  109  238:areturn         
		int j = zzb1.zzis;
	//  110  239:aload           8
	//  111  241:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//  112  244:istore_3        
		if(j != 1)
			break MISSING_BLOCK_LABEL_428;
	//  113  245:iload_3         
	//  114  246:iconst_1        
	//  115  247:icmpne          428
		Object obj = ((Object) (zza(context, s, zzb1.zzir)));
	//  116  250:aload_0         
	//  117  251:aload_2         
	//  118  252:aload           8
	//  119  254:getfield        #238 <Field int DynamiteModule$VersionPolicy$zzb.zzir>
	//  120  257:invokestatic    #269 <Method DynamiteModule zza(Context, String, int)>
	//  121  260:astore          5
		if(zza2.zzin != null)
	//* 122  262:aload           7
	//* 123  264:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//* 124  267:ifnull          280
			zza2.zzin.close();
	//  125  270:aload           7
	//  126  272:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//  127  275:invokeinterface #266 <Method void Cursor.close()>
		zzij.set(((Object) (zza1)));
	//  128  280:getstatic       #61  <Field ThreadLocal zzij>
	//  129  283:aload           6
	//  130  285:invokevirtual   #229 <Method void ThreadLocal.set(Object)>
		return ((DynamiteModule) (obj));
	//  131  288:aload           5
	//  132  290:areturn         
		LoadingException loadingexception;
		loadingexception;
	//  133  291:astore          9
		obj = ((Object) (String.valueOf(((Object) (loadingexception.getMessage())))));
	//  134  293:aload           9
	//  135  295:invokevirtual   #270 <Method String DynamiteModule$LoadingException.getMessage()>
	//  136  298:invokestatic    #131 <Method String String.valueOf(Object)>
	//  137  301:astore          5
		if(((String) (obj)).length() != 0)
	//* 138  303:aload           5
	//* 139  305:invokevirtual   #135 <Method int String.length()>
	//* 140  308:ifeq            324
		{
			obj = ((Object) ("Failed to load remote module: ".concat(((String) (obj)))));
	//  141  311:ldc2            #272 <String "Failed to load remote module: ">
	//  142  314:aload           5
	//  143  316:invokevirtual   #202 <Method String String.concat(String)>
	//  144  319:astore          5
			break MISSING_BLOCK_LABEL_336;
	//  145  321:goto            336
		}
		obj = ((Object) (new String("Failed to load remote module: ")));
	//  146  324:new             #127 <Class String>
	//  147  327:dup             
	//  148  328:ldc2            #272 <String "Failed to load remote module: ">
	//  149  331:invokespecial   #205 <Method void String(String)>
	//  150  334:astore          5
		Log.w("DynamiteModule", ((String) (obj)));
	//  151  336:ldc1            #183 <String "DynamiteModule">
	//  152  338:aload           5
	//  153  340:invokestatic    #212 <Method int Log.w(String, String)>
	//  154  343:pop             
		if(zzb1.zziq == 0 || versionpolicy.zza(context, s, ((VersionPolicy.zza) (new zzb(zzb1.zziq, 0)))).zzis != -1)
			break MISSING_BLOCK_LABEL_414;
	//  155  344:aload           8
	//  156  346:getfield        #235 <Field int DynamiteModule$VersionPolicy$zzb.zziq>
	//  157  349:ifeq            414
	//  158  352:aload_1         
	//  159  353:aload_0         
	//  160  354:aload_2         
	//  161  355:new             #23  <Class DynamiteModule$zzb>
	//  162  358:dup             
	//  163  359:aload           8
	//  164  361:getfield        #235 <Field int DynamiteModule$VersionPolicy$zzb.zziq>
	//  165  364:iconst_0        
	//  166  365:invokespecial   #275 <Method void DynamiteModule$zzb(int, int)>
	//  167  368:invokeinterface #232 <Method DynamiteModule$VersionPolicy$zzb DynamiteModule$VersionPolicy.zza(Context, String, DynamiteModule$VersionPolicy$zza)>
	//  168  373:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//  169  376:iconst_m1       
	//  170  377:icmpne          414
		context = ((Context) (zze(context, s)));
	//  171  380:aload_0         
	//  172  381:aload_2         
	//  173  382:invokestatic    #257 <Method DynamiteModule zze(Context, String)>
	//  174  385:astore_0        
		if(zza2.zzin != null)
	//* 175  386:aload           7
	//* 176  388:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//* 177  391:ifnull          404
			zza2.zzin.close();
	//  178  394:aload           7
	//  179  396:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//  180  399:invokeinterface #266 <Method void Cursor.close()>
		zzij.set(((Object) (zza1)));
	//  181  404:getstatic       #61  <Field ThreadLocal zzij>
	//  182  407:aload           6
	//  183  409:invokevirtual   #229 <Method void ThreadLocal.set(Object)>
		return ((DynamiteModule) (context));
	//  184  412:aload_0         
	//  185  413:areturn         
		throw new LoadingException("Remote load failed. No local fallback found.", ((Throwable) (loadingexception)), ((com.google.android.gms.dynamite.zza) (null)));
	//  186  414:new             #9   <Class DynamiteModule$LoadingException>
	//  187  417:dup             
	//  188  418:ldc2            #277 <String "Remote load failed. No local fallback found.">
	//  189  421:aload           9
	//  190  423:aconst_null     
	//  191  424:invokespecial   #280 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//  192  427:athrow          
		int k = zzb1.zzis;
	//  193  428:aload           8
	//  194  430:getfield        #253 <Field int DynamiteModule$VersionPolicy$zzb.zzis>
	//  195  433:istore_3        
		context = ((Context) (new StringBuilder(47)));
	//  196  434:new             #125 <Class StringBuilder>
	//  197  437:dup             
	//  198  438:bipush          47
	//  199  440:invokespecial   #138 <Method void StringBuilder(int)>
	//  200  443:astore_0        
		((StringBuilder) (context)).append("VersionPolicy returned invalid code:");
	//  201  444:aload_0         
	//  202  445:ldc2            #282 <String "VersionPolicy returned invalid code:">
	//  203  448:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  204  451:pop             
		((StringBuilder) (context)).append(k);
	//  205  452:aload_0         
	//  206  453:iload_3         
	//  207  454:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//  208  457:pop             
		throw new LoadingException(((StringBuilder) (context)).toString(), ((com.google.android.gms.dynamite.zza) (null)));
	//  209  458:new             #9   <Class DynamiteModule$LoadingException>
	//  210  461:dup             
	//  211  462:aload_0         
	//  212  463:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  213  466:aconst_null     
	//  214  467:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//  215  470:athrow          
		int l = zzb1.zziq;
	//  216  471:aload           8
	//  217  473:getfield        #235 <Field int DynamiteModule$VersionPolicy$zzb.zziq>
	//  218  476:istore_3        
		int j1 = zzb1.zzir;
	//  219  477:aload           8
	//  220  479:getfield        #238 <Field int DynamiteModule$VersionPolicy$zzb.zzir>
	//  221  482:istore          4
		context = ((Context) (new StringBuilder(91)));
	//  222  484:new             #125 <Class StringBuilder>
	//  223  487:dup             
	//  224  488:bipush          91
	//  225  490:invokespecial   #138 <Method void StringBuilder(int)>
	//  226  493:astore_0        
		((StringBuilder) (context)).append("No acceptable module found. Local version is ");
	//  227  494:aload_0         
	//  228  495:ldc2            #287 <String "No acceptable module found. Local version is ">
	//  229  498:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  230  501:pop             
		((StringBuilder) (context)).append(l);
	//  231  502:aload_0         
	//  232  503:iload_3         
	//  233  504:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//  234  507:pop             
		((StringBuilder) (context)).append(" and remote version is ");
	//  235  508:aload_0         
	//  236  509:ldc2            #289 <String " and remote version is ">
	//  237  512:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  238  515:pop             
		((StringBuilder) (context)).append(j1);
	//  239  516:aload_0         
	//  240  517:iload           4
	//  241  519:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//  242  522:pop             
		((StringBuilder) (context)).append(".");
	//  243  523:aload_0         
	//  244  524:ldc2            #291 <String ".">
	//  245  527:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//  246  530:pop             
		throw new LoadingException(((StringBuilder) (context)).toString(), ((com.google.android.gms.dynamite.zza) (null)));
	//  247  531:new             #9   <Class DynamiteModule$LoadingException>
	//  248  534:dup             
	//  249  535:aload_0         
	//  250  536:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  251  539:aconst_null     
	//  252  540:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//  253  543:athrow          
		context;
	//  254  544:astore_0        
		if(zza2.zzin != null)
	//* 255  545:aload           7
	//* 256  547:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//* 257  550:ifnull          563
			zza2.zzin.close();
	//  258  553:aload           7
	//  259  555:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//  260  558:invokeinterface #266 <Method void Cursor.close()>
		zzij.set(((Object) (zza1)));
	//  261  563:getstatic       #61  <Field ThreadLocal zzij>
	//  262  566:aload           6
	//  263  568:invokevirtual   #229 <Method void ThreadLocal.set(Object)>
		throw context;
	//  264  571:aload_0         
	//  265  572:athrow          
	}

	public static int zza(Context context, String s, boolean flag)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj1 = ((Object) (zzie));
	//    2    3:getstatic       #300 <Field Boolean zzie>
	//    3    6:astore          6
		Object obj = obj1;
	//    4    8:aload           6
	//    5   10:astore          5
		if(obj1 != null) goto _L2; else goto _L1
	//    6   12:aload           6
	//    7   14:ifnonnull       305
_L1:
		obj1 = ((Object) (context.getApplicationContext().getClassLoader().loadClass(((Class) (com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader)).getName())));
	//    8   17:aload_0         
	//    9   18:invokevirtual   #119 <Method Context Context.getApplicationContext()>
	//   10   21:invokevirtual   #123 <Method ClassLoader Context.getClassLoader()>
	//   11   24:ldc1            #6   <Class DynamiteModule$DynamiteLoaderClassLoader>
	//   12   26:invokevirtual   #303 <Method String Class.getName()>
	//   13   29:invokevirtual   #156 <Method Class ClassLoader.loadClass(String)>
	//   14   32:astore          6
		obj = ((Object) (((Class) (obj1)).getDeclaredField("sClassLoader")));
	//   15   34:aload           6
	//   16   36:ldc2            #305 <String "sClassLoader">
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
	//   29   65:invokestatic    #308 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//   30   68:if_acmpne       79
_L5:
		obj = ((Object) (Boolean.FALSE));
	//   31   71:getstatic       #313 <Field Boolean Boolean.FALSE>
	//   32   74:astore          5
		  goto _L7
	//*  33   76:goto            214
_L6:
		int i;
		boolean flag1;
		try
		{
			zza(classloader);
	//   34   79:aload           7
	//   35   81:invokestatic    #316 <Method void zza(ClassLoader)>
		}
	//*  36   84:getstatic       #319 <Field Boolean Boolean.TRUE>
	//*  37   87:astore          5
	//*  38   89:goto            214
	//*  39   92:ldc2            #321 <String "com.google.android.gms">
	//*  40   95:aload_0         
	//*  41   96:invokevirtual   #119 <Method Context Context.getApplicationContext()>
	//*  42   99:invokevirtual   #324 <Method String Context.getPackageName()>
	//*  43  102:invokevirtual   #325 <Method boolean String.equals(Object)>
	//*  44  105:ifeq            125
	//*  45  108:aload           5
	//*  46  110:aconst_null     
	//*  47  111:invokestatic    #308 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  48  114:invokevirtual   #328 <Method void Field.set(Object, Object)>
	//*  49  117:getstatic       #313 <Field Boolean Boolean.FALSE>
	//*  50  120:astore          5
	//*  51  122:goto            214
	//*  52  125:aload_0         
	//*  53  126:aload_1         
	//*  54  127:iload_2         
	//*  55  128:invokestatic    #331 <Method int zzc(Context, String, boolean)>
	//*  56  131:istore_3        
	//*  57  132:getstatic       #333 <Field String zzih>
	//*  58  135:ifnull          192
	//*  59  138:getstatic       #333 <Field String zzih>
	//*  60  141:invokevirtual   #337 <Method boolean String.isEmpty()>
	//*  61  144:ifeq            150
	//*  62  147:goto            192
	//*  63  150:new             #339 <Class zzh>
	//*  64  153:dup             
	//*  65  154:getstatic       #333 <Field String zzih>
	//*  66  157:invokestatic    #308 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  67  160:invokespecial   #342 <Method void zzh(String, ClassLoader)>
	//*  68  163:astore          7
	//*  69  165:aload           7
	//*  70  167:invokestatic    #316 <Method void zza(ClassLoader)>
	//*  71  170:aload           5
	//*  72  172:aconst_null     
	//*  73  173:aload           7
	//*  74  175:invokevirtual   #328 <Method void Field.set(Object, Object)>
	//*  75  178:getstatic       #319 <Field Boolean Boolean.TRUE>
	//*  76  181:putstatic       #300 <Field Boolean zzie>
	//*  77  184:aload           6
	//*  78  186:monitorexit     
	//*  79  187:ldc1            #2   <Class DynamiteModule>
	//*  80  189:monitorexit     
	//*  81  190:iload_3         
	//*  82  191:ireturn         
	//*  83  192:aload           6
	//*  84  194:monitorexit     
	//*  85  195:ldc1            #2   <Class DynamiteModule>
	//*  86  197:monitorexit     
	//*  87  198:iload_3         
	//*  88  199:ireturn         
	//*  89  200:aload           5
	//*  90  202:aconst_null     
	//*  91  203:invokestatic    #308 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  92  206:invokevirtual   #328 <Method void Field.set(Object, Object)>
	//*  93  209:getstatic       #313 <Field Boolean Boolean.FALSE>
	//*  94  212:astore          5
	//*  95  214:aload           6
	//*  96  216:monitorexit     
	//*  97  217:goto            300
	//*  98  220:astore          5
	//*  99  222:aload           6
	//* 100  224:monitorexit     
	//* 101  225:aload           5
	//* 102  227:athrow          
	//* 103  228:astore          5
	//* 104  230:goto            240
	//* 105  233:astore          5
	//* 106  235:goto            240
	//* 107  238:astore          5
	//* 108  240:aload           5
	//* 109  242:invokestatic    #131 <Method String String.valueOf(Object)>
	//* 110  245:astore          5
	//* 111  247:new             #125 <Class StringBuilder>
	//* 112  250:dup             
	//* 113  251:aload           5
	//* 114  253:invokestatic    #131 <Method String String.valueOf(Object)>
	//* 115  256:invokevirtual   #135 <Method int String.length()>
	//* 116  259:bipush          30
	//* 117  261:iadd            
	//* 118  262:invokespecial   #138 <Method void StringBuilder(int)>
	//* 119  265:astore          6
	//* 120  267:aload           6
	//* 121  269:ldc2            #344 <String "Failed to load module via V2: ">
	//* 122  272:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//* 123  275:pop             
	//* 124  276:aload           6
	//* 125  278:aload           5
	//* 126  280:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//* 127  283:pop             
	//* 128  284:ldc1            #183 <String "DynamiteModule">
	//* 129  286:aload           6
	//* 130  288:invokevirtual   #150 <Method String StringBuilder.toString()>
	//* 131  291:invokestatic    #212 <Method int Log.w(String, String)>
	//* 132  294:pop             
	//* 133  295:getstatic       #313 <Field Boolean Boolean.FALSE>
	//* 134  298:astore          5
	//* 135  300:aload           5
	//* 136  302:putstatic       #300 <Field Boolean zzie>
	//* 137  305:ldc1            #2   <Class DynamiteModule>
	//* 138  307:monitorexit     
	//* 139  308:aload           5
	//* 140  310:invokevirtual   #347 <Method boolean Boolean.booleanValue()>
	//* 141  313:istore          4
	//* 142  315:iload           4
	//* 143  317:ifeq            376
	//* 144  320:aload_0         
	//* 145  321:aload_1         
	//* 146  322:iload_2         
	//* 147  323:invokestatic    #331 <Method int zzc(Context, String, boolean)>
	//* 148  326:istore_3        
	//* 149  327:iload_3         
	//* 150  328:ireturn         
	//* 151  329:astore_1        
	//* 152  330:aload_1         
	//* 153  331:invokevirtual   #270 <Method String DynamiteModule$LoadingException.getMessage()>
	//* 154  334:invokestatic    #131 <Method String String.valueOf(Object)>
	//* 155  337:astore_1        
	//* 156  338:aload_1         
	//* 157  339:invokevirtual   #135 <Method int String.length()>
	//* 158  342:ifeq            356
	//* 159  345:ldc2            #349 <String "Failed to retrieve remote module version: ">
	//* 160  348:aload_1         
	//* 161  349:invokevirtual   #202 <Method String String.concat(String)>
	//* 162  352:astore_1        
	//* 163  353:goto            367
	//* 164  356:new             #127 <Class String>
	//* 165  359:dup             
	//* 166  360:ldc2            #349 <String "Failed to retrieve remote module version: ">
	//* 167  363:invokespecial   #205 <Method void String(String)>
	//* 168  366:astore_1        
	//* 169  367:ldc1            #183 <String "DynamiteModule">
	//* 170  369:aload_1         
	//* 171  370:invokestatic    #212 <Method int Log.w(String, String)>
	//* 172  373:pop             
	//* 173  374:iconst_0        
	//* 174  375:ireturn         
	//* 175  376:aload_0         
	//* 176  377:aload_1         
	//* 177  378:iload_2         
	//* 178  379:invokestatic    #351 <Method int zzb(Context, String, boolean)>
	//* 179  382:istore_3        
	//* 180  383:iload_3         
	//* 181  384:ireturn         
	//* 182  385:astore_1        
	//* 183  386:ldc1            #2   <Class DynamiteModule>
	//* 184  388:monitorexit     
	//* 185  389:aload_1         
	//* 186  390:athrow          
	//* 187  391:astore_1        
	//* 188  392:aload_0         
	//* 189  393:aload_1         
	//* 190  394:invokestatic    #357 <Method boolean CrashUtils.addDynamiteErrorToDropBox(Context, Throwable)>
	//* 191  397:pop             
	//* 192  398:aload_1         
	//* 193  399:athrow          
		catch(LoadingException loadingexception) { }
	//  194  400:astore          5
		obj = ((Object) (Boolean.TRUE));
		  goto _L7
_L4:
		if(!"com.google.android.gms".equals(((Object) (context.getApplicationContext().getPackageName())))) goto _L9; else goto _L8
_L8:
		((Field) (obj)).set(((Object) (null)), ((Object) (ClassLoader.getSystemClassLoader())));
		obj = ((Object) (Boolean.FALSE));
		  goto _L7
_L9:
		i = zzc(context, s, flag);
		if(zzih == null || zzih.isEmpty())
			break MISSING_BLOCK_LABEL_192;
		zzh zzh1 = new zzh(zzih, ClassLoader.getSystemClassLoader());
		zza(((ClassLoader) (zzh1)));
		((Field) (obj)).set(((Object) (null)), ((Object) (zzh1)));
		zzie = Boolean.TRUE;
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
_L12:
		((Field) (obj)).set(((Object) (null)), ((Object) (ClassLoader.getSystemClassLoader())));
		obj = ((Object) (Boolean.FALSE));
_L7:
		obj1;
		JVM INSTR monitorexit ;
		  goto _L10
		obj;
		obj1;
		JVM INSTR monitorexit ;
		try
		{
			throw obj;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		obj = ((Object) (String.valueOf(obj)));
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 30);
		stringbuilder.append("Failed to load module via V2: ");
		stringbuilder.append(((String) (obj)));
		Log.w("DynamiteModule", stringbuilder.toString());
		obj = ((Object) (Boolean.FALSE));
_L10:
		zzie = ((Boolean) (obj));
_L2:
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		flag1 = ((Boolean) (obj)).booleanValue();
		if(!flag1)
			break MISSING_BLOCK_LABEL_376;
		i = zzc(context, s, flag);
		return i;
		s;
		s = String.valueOf(((Object) (((LoadingException) (s)).getMessage())));
		if(s.length() != 0)
		{
			s = "Failed to retrieve remote module version: ".concat(s);
			break MISSING_BLOCK_LABEL_367;
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
	//* 195  402:goto            84
		LoadingException loadingexception1;
		loadingexception1;
	//  196  405:astore          7
		if(true) goto _L12; else goto _L11
	//  197  407:goto            200
_L11:
	}

	private static DynamiteModule zza(Context context, String s, int i)
		throws LoadingException
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj = ((Object) (zzie));
	//    2    3:getstatic       #300 <Field Boolean zzie>
	//    3    6:astore_3        
		com/google/android/gms/dynamite/DynamiteModule;
	//    4    7:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		if(obj == null)
			break MISSING_BLOCK_LABEL_187;
	//    6   10:aload_3         
	//    7   11:ifnull          187
		if(((Boolean) (obj)).booleanValue())
	//*   8   14:aload_3         
	//*   9   15:invokevirtual   #347 <Method boolean Boolean.booleanValue()>
	//*  10   18:ifeq            28
			return zzb(context, s, i);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:invokestatic    #361 <Method DynamiteModule zzb(Context, String, int)>
	//   15   27:areturn         
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 51)));
	//   16   28:new             #125 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:invokestatic    #131 <Method String String.valueOf(Object)>
	//   20   36:invokevirtual   #135 <Method int String.length()>
	//   21   39:bipush          51
	//   22   41:iadd            
	//   23   42:invokespecial   #138 <Method void StringBuilder(int)>
	//   24   45:astore_3        
		((StringBuilder) (obj)).append("Selected remote version of ");
	//   25   46:aload_3         
	//   26   47:ldc2            #363 <String "Selected remote version of ">
	//   27   50:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
		((StringBuilder) (obj)).append(s);
	//   29   54:aload_3         
	//   30   55:aload_1         
	//   31   56:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
		((StringBuilder) (obj)).append(", version >= ");
	//   33   60:aload_3         
	//   34   61:ldc2            #365 <String ", version >= ">
	//   35   64:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   36   67:pop             
		((StringBuilder) (obj)).append(i);
	//   37   68:aload_3         
	//   38   69:iload_2         
	//   39   70:invokevirtual   #245 <Method StringBuilder StringBuilder.append(int)>
	//   40   73:pop             
		Log.i("DynamiteModule", ((StringBuilder) (obj)).toString());
	//   41   74:ldc1            #183 <String "DynamiteModule">
	//   42   76:aload_3         
	//   43   77:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   44   80:invokestatic    #250 <Method int Log.i(String, String)>
	//   45   83:pop             
		obj = ((Object) (zzj(context)));
	//   46   84:aload_0         
	//   47   85:invokestatic    #369 <Method zzi zzj(Context)>
	//   48   88:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_175;
	//   49   89:aload_3         
	//   50   90:ifnull          175
		if(((zzi) (obj)).zzak() >= 2)
	//*  51   93:aload_3         
	//*  52   94:invokeinterface #374 <Method int zzi.zzak()>
	//*  53   99:iconst_2        
	//*  54  100:icmplt          119
		{
			s = ((String) (((zzi) (obj)).zzb(ObjectWrapper.wrap(((Object) (context))), s, i)));
	//   55  103:aload_3         
	//   56  104:aload_0         
	//   57  105:invokestatic    #380 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   58  108:aload_1         
	//   59  109:iload_2         
	//   60  110:invokeinterface #383 <Method com.google.android.gms.dynamic.IObjectWrapper zzi.zzb(com.google.android.gms.dynamic.IObjectWrapper, String, int)>
	//   61  115:astore_1        
			break MISSING_BLOCK_LABEL_141;
	//   62  116:goto            141
		}
		Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
	//   63  119:ldc1            #183 <String "DynamiteModule">
	//   64  121:ldc2            #385 <String "Dynamite loader version < 2, falling back to createModuleContext">
	//   65  124:invokestatic    #212 <Method int Log.w(String, String)>
	//   66  127:pop             
		s = ((String) (((zzi) (obj)).zza(ObjectWrapper.wrap(((Object) (context))), s, i)));
	//   67  128:aload_3         
	//   68  129:aload_0         
	//   69  130:invokestatic    #380 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   70  133:aload_1         
	//   71  134:iload_2         
	//   72  135:invokeinterface #387 <Method com.google.android.gms.dynamic.IObjectWrapper zzi.zza(com.google.android.gms.dynamic.IObjectWrapper, String, int)>
	//   73  140:astore_1        
		if(ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (s))) != null)
	//*  74  141:aload_1         
	//*  75  142:invokestatic    #391 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  76  145:ifnull          163
			return new DynamiteModule((Context)ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (s))));
	//   77  148:new             #2   <Class DynamiteModule>
	//   78  151:dup             
	//   79  152:aload_1         
	//   80  153:invokestatic    #391 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   81  156:checkcast       #107 <Class Context>
	//   82  159:invokespecial   #393 <Method void DynamiteModule(Context)>
	//   83  162:areturn         
		else
			throw new LoadingException("Failed to load remote module.", ((com.google.android.gms.dynamite.zza) (null)));
	//   84  163:new             #9   <Class DynamiteModule$LoadingException>
	//   85  166:dup             
	//   86  167:ldc2            #395 <String "Failed to load remote module.">
	//   87  170:aconst_null     
	//   88  171:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//   89  174:athrow          
		throw new LoadingException("Failed to create IDynamiteLoader.", ((com.google.android.gms.dynamite.zza) (null)));
	//   90  175:new             #9   <Class DynamiteModule$LoadingException>
	//   91  178:dup             
	//   92  179:ldc2            #397 <String "Failed to create IDynamiteLoader.">
	//   93  182:aconst_null     
	//   94  183:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//   95  186:athrow          
		throw new LoadingException("Failed to determine which loading route to use.", ((com.google.android.gms.dynamite.zza) (null)));
	//   96  187:new             #9   <Class DynamiteModule$LoadingException>
	//   97  190:dup             
	//   98  191:ldc2            #399 <String "Failed to determine which loading route to use.">
	//   99  194:aconst_null     
	//  100  195:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//  101  198:athrow          
		s;
	//  102  199:astore_1        
		com/google/android/gms/dynamite/DynamiteModule;
	//  103  200:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//  104  202:monitorexit     
		try
		{
			throw s;
	//  105  203:aload_1         
	//  106  204:athrow          
		}
	//* 107  205:astore_1        
	//* 108  206:aload_0         
	//* 109  207:aload_1         
	//* 110  208:invokestatic    #357 <Method boolean CrashUtils.addDynamiteErrorToDropBox(Context, Throwable)>
	//* 111  211:pop             
	//* 112  212:new             #9   <Class DynamiteModule$LoadingException>
	//* 113  215:dup             
	//* 114  216:ldc2            #395 <String "Failed to load remote module.">
	//* 115  219:aload_1         
	//* 116  220:aconst_null     
	//* 117  221:invokespecial   #280 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//* 118  224:athrow          
	//* 119  225:astore_0        
	//* 120  226:aload_0         
	//* 121  227:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 122  228:astore_0        
		{
			throw new LoadingException("Failed to load remote module.", ((Throwable) (context)), ((com.google.android.gms.dynamite.zza) (null)));
	//  123  229:new             #9   <Class DynamiteModule$LoadingException>
	//  124  232:dup             
	//  125  233:ldc2            #395 <String "Failed to load remote module.">
	//  126  236:aload_0         
	//  127  237:aconst_null     
	//  128  238:invokespecial   #280 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//  129  241:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw context;
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			CrashUtils.addDynamiteErrorToDropBox(context, ((Throwable) (s)));
		}
		throw new LoadingException("Failed to load remote module.", ((Throwable) (s)), ((com.google.android.gms.dynamite.zza) (null)));
	}

	private static void zza(ClassLoader classloader)
		throws LoadingException
	{
		classloader = ((ClassLoader) ((IBinder)classloader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0])));
	//    0    0:aload_0         
	//    1    1:ldc2            #407 <String "com.google.android.gms.dynamiteloader.DynamiteLoaderV2">
	//    2    4:invokevirtual   #156 <Method Class ClassLoader.loadClass(String)>
	//    3    7:iconst_0        
	//    4    8:anewarray       Class[]
	//    5   11:invokevirtual   #411 <Method Constructor Class.getConstructor(Class[])>
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokevirtual   #417 <Method Object Constructor.newInstance(Object[])>
	//    9   21:checkcast       #419 <Class IBinder>
	//   10   24:astore_0        
		if(classloader == null)
	//*  11   25:aload_0         
	//*  12   26:ifnonnull       34
		{
			classloader = null;
	//   13   29:aconst_null     
	//   14   30:astore_0        
			break MISSING_BLOCK_LABEL_68;
	//   15   31:goto            68
		}
		android.os.IInterface iinterface = ((IBinder) (classloader)).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
	//   16   34:aload_0         
	//   17   35:ldc2            #421 <String "com.google.android.gms.dynamite.IDynamiteLoaderV2">
	//   18   38:invokeinterface #425 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   19   43:astore_1        
		if(iinterface instanceof zzk)
	//*  20   44:aload_1         
	//*  21   45:instanceof      #427 <Class zzk>
	//*  22   48:ifeq            59
		{
			classloader = ((ClassLoader) ((zzk)iinterface));
	//   23   51:aload_1         
	//   24   52:checkcast       #427 <Class zzk>
	//   25   55:astore_0        
			break MISSING_BLOCK_LABEL_68;
	//   26   56:goto            68
		}
		classloader = ((ClassLoader) (new zzl(((IBinder) (classloader)))));
	//   27   59:new             #429 <Class zzl>
	//   28   62:dup             
	//   29   63:aload_0         
	//   30   64:invokespecial   #432 <Method void zzl(IBinder)>
	//   31   67:astore_0        
		zzig = ((zzk) (classloader));
	//   32   68:aload_0         
	//   33   69:putstatic       #434 <Field zzk zzig>
		return;
	//   34   72:return          
		classloader;
	//   35   73:astore_0        
		break MISSING_BLOCK_LABEL_90;
	//   36   74:goto            90
		classloader;
	//   37   77:astore_0        
		break MISSING_BLOCK_LABEL_90;
	//   38   78:goto            90
		classloader;
	//   39   81:astore_0        
		break MISSING_BLOCK_LABEL_90;
	//   40   82:goto            90
		classloader;
	//   41   85:astore_0        
		break MISSING_BLOCK_LABEL_90;
	//   42   86:goto            90
		classloader;
	//   43   89:astore_0        
		throw new LoadingException("Failed to instantiate dynamite loader", ((Throwable) (classloader)), ((com.google.android.gms.dynamite.zza) (null)));
	//   44   90:new             #9   <Class DynamiteModule$LoadingException>
	//   45   93:dup             
	//   46   94:ldc2            #436 <String "Failed to instantiate dynamite loader">
	//   47   97:aload_0         
	//   48   98:aconst_null     
	//   49   99:invokespecial   #280 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//   50  102:athrow          
	}

	private static Boolean zzaj()
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		Exception exception;
		if(zzii >= 2)
	//*   2    3:getstatic       #440 <Field int zzii>
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
	//*  11   19:invokestatic    #443 <Method Boolean Boolean.valueOf(boolean)>
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
	//    1    1:invokestatic    #369 <Method zzi zzj(Context)>
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
			if(zzi1.zzak() >= 2)
	//*   7   13:aload           4
	//*   8   15:invokeinterface #374 <Method int zzi.zzak()>
	//*   9   20:iconst_2        
	//*  10   21:icmplt          38
				return zzi1.zzb(ObjectWrapper.wrap(((Object) (context))), s, flag);
	//   11   24:aload           4
	//   12   26:aload_0         
	//   13   27:invokestatic    #380 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   14   30:aload_1         
	//   15   31:iload_2         
	//   16   32:invokeinterface #446 <Method int zzi.zzb(com.google.android.gms.dynamic.IObjectWrapper, String, boolean)>
	//   17   37:ireturn         
			Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
	//   18   38:ldc1            #183 <String "DynamiteModule">
	//   19   40:ldc2            #448 <String "IDynamite loader version < 2, falling back to getModuleVersion2">
	//   20   43:invokestatic    #212 <Method int Log.w(String, String)>
	//   21   46:pop             
			i = zzi1.zza(ObjectWrapper.wrap(((Object) (context))), s, flag);
	//   22   47:aload           4
	//   23   49:aload_0         
	//   24   50:invokestatic    #380 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   25   53:aload_1         
	//   26   54:iload_2         
	//   27   55:invokeinterface #450 <Method int zzi.zza(com.google.android.gms.dynamic.IObjectWrapper, String, boolean)>
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
	//   33   65:invokevirtual   #451 <Method String RemoteException.getMessage()>
	//   34   68:invokestatic    #131 <Method String String.valueOf(Object)>
	//   35   71:astore_0        
			if(((String) (context)).length() != 0)
	//*  36   72:aload_0         
	//*  37   73:invokevirtual   #135 <Method int String.length()>
	//*  38   76:ifeq            90
				context = ((Context) ("Failed to retrieve remote module version: ".concat(((String) (context)))));
	//   39   79:ldc2            #349 <String "Failed to retrieve remote module version: ">
	//   40   82:aload_0         
	//   41   83:invokevirtual   #202 <Method String String.concat(String)>
	//   42   86:astore_0        
			else
	//*  43   87:goto            101
				context = ((Context) (new String("Failed to retrieve remote module version: ")));
	//   44   90:new             #127 <Class String>
	//   45   93:dup             
	//   46   94:ldc2            #349 <String "Failed to retrieve remote module version: ">
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
		throws LoadingException, RemoteException
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
	//   10   19:ldc2            #363 <String "Selected remote version of ">
	//   11   22:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(s);
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		stringbuilder.append(", version >= ");
	//   17   32:aload_3         
	//   18   33:ldc2            #365 <String ", version >= ">
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
		zzk zzk1 = zzig;
	//   32   59:getstatic       #434 <Field zzk zzig>
	//   33   62:astore_3        
		com/google/android/gms/dynamite/DynamiteModule;
	//   34   63:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   35   65:monitorexit     
		if(zzk1 != null)
	//*  36   66:aload_3         
	//*  37   67:ifnull          222
		{
			Object obj = ((Object) ((zza)zzij.get()));
	//   38   70:getstatic       #61  <Field ThreadLocal zzij>
	//   39   73:invokevirtual   #222 <Method Object ThreadLocal.get()>
	//   40   76:checkcast       #21  <Class DynamiteModule$zza>
	//   41   79:astore          4
			if(obj != null && ((zza) (obj)).zzin != null)
	//*  42   81:aload           4
	//*  43   83:ifnull          210
	//*  44   86:aload           4
	//*  45   88:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//*  46   91:ifnull          210
			{
				context = context.getApplicationContext();
	//   47   94:aload_0         
	//   48   95:invokevirtual   #119 <Method Context Context.getApplicationContext()>
	//   49   98:astore_0        
				obj = ((Object) (((zza) (obj)).zzin));
	//   50   99:aload           4
	//   51  101:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//   52  104:astore          4
				ObjectWrapper.wrap(((Object) (null)));
	//   53  106:aconst_null     
	//   54  107:invokestatic    #380 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   55  110:pop             
				if(zzaj().booleanValue())
	//*  56  111:invokestatic    #453 <Method Boolean zzaj()>
	//*  57  114:invokevirtual   #347 <Method boolean Boolean.booleanValue()>
	//*  58  117:ifeq            150
				{
					Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
	//   59  120:ldc1            #183 <String "DynamiteModule">
	//   60  122:ldc2            #455 <String "Dynamite loader version >= 2, using loadModule2NoCrashUtils">
	//   61  125:invokestatic    #458 <Method int Log.v(String, String)>
	//   62  128:pop             
					context = ((Context) (zzk1.zzb(ObjectWrapper.wrap(((Object) (context))), s, i, ObjectWrapper.wrap(obj))));
	//   63  129:aload_3         
	//   64  130:aload_0         
	//   65  131:invokestatic    #380 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   66  134:aload_1         
	//   67  135:iload_2         
	//   68  136:aload           4
	//   69  138:invokestatic    #380 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   70  141:invokeinterface #461 <Method com.google.android.gms.dynamic.IObjectWrapper zzk.zzb(com.google.android.gms.dynamic.IObjectWrapper, String, int, com.google.android.gms.dynamic.IObjectWrapper)>
	//   71  146:astore_0        
				} else
	//*  72  147:goto            177
				{
					Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
	//   73  150:ldc1            #183 <String "DynamiteModule">
	//   74  152:ldc2            #463 <String "Dynamite loader version < 2, falling back to loadModule2">
	//   75  155:invokestatic    #212 <Method int Log.w(String, String)>
	//   76  158:pop             
					context = ((Context) (zzk1.zza(ObjectWrapper.wrap(((Object) (context))), s, i, ObjectWrapper.wrap(obj))));
	//   77  159:aload_3         
	//   78  160:aload_0         
	//   79  161:invokestatic    #380 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   80  164:aload_1         
	//   81  165:iload_2         
	//   82  166:aload           4
	//   83  168:invokestatic    #380 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   84  171:invokeinterface #465 <Method com.google.android.gms.dynamic.IObjectWrapper zzk.zza(com.google.android.gms.dynamic.IObjectWrapper, String, int, com.google.android.gms.dynamic.IObjectWrapper)>
	//   85  176:astore_0        
				}
				context = (Context)ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (context)));
	//   86  177:aload_0         
	//   87  178:invokestatic    #391 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   88  181:checkcast       #107 <Class Context>
	//   89  184:astore_0        
				if(context != null)
	//*  90  185:aload_0         
	//*  91  186:ifnull          198
					return new DynamiteModule(context);
	//   92  189:new             #2   <Class DynamiteModule>
	//   93  192:dup             
	//   94  193:aload_0         
	//   95  194:invokespecial   #393 <Method void DynamiteModule(Context)>
	//   96  197:areturn         
				else
					throw new LoadingException("Failed to get module context", ((com.google.android.gms.dynamite.zza) (null)));
	//   97  198:new             #9   <Class DynamiteModule$LoadingException>
	//   98  201:dup             
	//   99  202:ldc2            #467 <String "Failed to get module context">
	//  100  205:aconst_null     
	//  101  206:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//  102  209:athrow          
			} else
			{
				throw new LoadingException("No result cursor", ((com.google.android.gms.dynamite.zza) (null)));
	//  103  210:new             #9   <Class DynamiteModule$LoadingException>
	//  104  213:dup             
	//  105  214:ldc2            #469 <String "No result cursor">
	//  106  217:aconst_null     
	//  107  218:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//  108  221:athrow          
			}
		} else
		{
			throw new LoadingException("DynamiteLoaderV2 was not cached.", ((com.google.android.gms.dynamite.zza) (null)));
	//  109  222:new             #9   <Class DynamiteModule$LoadingException>
	//  110  225:dup             
	//  111  226:ldc2            #471 <String "DynamiteLoaderV2 was not cached.">
	//  112  229:aconst_null     
	//  113  230:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//  114  233:athrow          
		}
		context;
	//  115  234:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//  116  235:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//  117  237:monitorexit     
		throw context;
	//  118  238:aload_0         
	//  119  239:athrow          
	}

	private static int zzc(Context context, String s, boolean flag)
		throws LoadingException
	{
		zza zza1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		ContentResolver contentresolver = context.getContentResolver();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #475 <Method ContentResolver Context.getContentResolver()>
	//    4    7:astore          6
		int i;
		int j;
		StringBuilder stringbuilder;
		if(flag)
	//*   5    9:iload_2         
	//*   6   10:ifeq            298
			context = "api_force_staging";
	//    7   13:ldc2            #477 <String "api_force_staging">
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
	//*  24   49:ldc2            #479 <String "content://com.google.android.gms.chimera/">
	//*  25   52:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  26   55:pop             
	//*  27   56:aload           7
	//*  28   58:aload_0         
	//*  29   59:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  30   62:pop             
	//*  31   63:aload           7
	//*  32   65:ldc2            #481 <String "/">
	//*  33   68:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  34   71:pop             
	//*  35   72:aload           7
	//*  36   74:aload_1         
	//*  37   75:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//*  38   78:pop             
	//*  39   79:aload           6
	//*  40   81:aload           7
	//*  41   83:invokevirtual   #150 <Method String StringBuilder.toString()>
	//*  42   86:invokestatic    #487 <Method Uri Uri.parse(String)>
	//*  43   89:aconst_null     
	//*  44   90:aconst_null     
	//*  45   91:aconst_null     
	//*  46   92:aconst_null     
	//*  47   93:invokevirtual   #493 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//*  48   96:astore_0        
	//*  49   97:aload_0         
	//*  50   98:ifnull          224
	//*  51  101:aload_0         
	//*  52  102:invokeinterface #496 <Method boolean Cursor.moveToFirst()>
	//*  53  107:ifeq            224
	//*  54  110:aload_0         
	//*  55  111:iconst_0        
	//*  56  112:invokeinterface #499 <Method int Cursor.getInt(int)>
	//*  57  117:istore_3        
	//*  58  118:aload_0         
	//*  59  119:astore_1        
	//*  60  120:iload_3         
	//*  61  121:ifle            212
	//*  62  124:ldc1            #2   <Class DynamiteModule>
	//*  63  126:monitorenter    
	//*  64  127:aload_0         
	//*  65  128:iconst_2        
	//*  66  129:invokeinterface #503 <Method String Cursor.getString(int)>
	//*  67  134:putstatic       #333 <Field String zzih>
	//*  68  137:aload_0         
	//*  69  138:ldc2            #505 <String "loaderVersion">
	//*  70  141:invokeinterface #509 <Method int Cursor.getColumnIndex(String)>
	//*  71  146:istore          4
	//*  72  148:iload           4
	//*  73  150:iflt            164
	//*  74  153:aload_0         
	//*  75  154:iload           4
	//*  76  156:invokeinterface #499 <Method int Cursor.getInt(int)>
	//*  77  161:putstatic       #440 <Field int zzii>
	//*  78  164:ldc1            #2   <Class DynamiteModule>
	//*  79  166:monitorexit     
	//*  80  167:getstatic       #61  <Field ThreadLocal zzij>
	//*  81  170:invokevirtual   #222 <Method Object ThreadLocal.get()>
	//*  82  173:checkcast       #21  <Class DynamiteModule$zza>
	//*  83  176:astore          5
	//*  84  178:aload_0         
	//*  85  179:astore_1        
	//*  86  180:aload           5
	//*  87  182:ifnull          212
	//*  88  185:aload_0         
	//*  89  186:astore_1        
	//*  90  187:aload           5
	//*  91  189:getfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//*  92  192:ifnonnull       212
	//*  93  195:aload           5
	//*  94  197:aload_0         
	//*  95  198:putfield        #261 <Field Cursor DynamiteModule$zza.zzin>
	//*  96  201:aconst_null     
	//*  97  202:astore_1        
	//*  98  203:goto            212
	//*  99  206:astore_1        
	//* 100  207:ldc1            #2   <Class DynamiteModule>
	//* 101  209:monitorexit     
	//* 102  210:aload_1         
	//* 103  211:athrow          
	//* 104  212:aload_1         
	//* 105  213:ifnull          222
	//* 106  216:aload_1         
	//* 107  217:invokeinterface #266 <Method void Cursor.close()>
	//* 108  222:iload_3         
	//* 109  223:ireturn         
	//* 110  224:ldc1            #183 <String "DynamiteModule">
	//* 111  226:ldc2            #511 <String "Failed to retrieve remote module version.">
	//* 112  229:invokestatic    #212 <Method int Log.w(String, String)>
	//* 113  232:pop             
	//* 114  233:new             #9   <Class DynamiteModule$LoadingException>
	//* 115  236:dup             
	//* 116  237:ldc2            #513 <String "Failed to connect to dynamite module ContentResolver.">
	//* 117  240:aconst_null     
	//* 118  241:invokespecial   #285 <Method void DynamiteModule$LoadingException(String, zza)>
	//* 119  244:athrow          
	//* 120  245:astore_1        
	//* 121  246:goto            286
	//* 122  249:astore_1        
	//* 123  250:goto            263
	//* 124  253:astore_1        
	//* 125  254:aload           5
	//* 126  256:astore_0        
	//* 127  257:goto            286
	//* 128  260:astore_1        
	//* 129  261:aconst_null     
	//* 130  262:astore_0        
	//* 131  263:aload_1         
	//* 132  264:instanceof      #9   <Class DynamiteModule$LoadingException>
	//* 133  267:ifeq            272
	//* 134  270:aload_1         
	//* 135  271:athrow          
	//* 136  272:new             #9   <Class DynamiteModule$LoadingException>
	//* 137  275:dup             
	//* 138  276:ldc2            #515 <String "V2 version check failed">
	//* 139  279:aload_1         
	//* 140  280:aconst_null     
	//* 141  281:invokespecial   #280 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//* 142  284:athrow          
	//* 143  285:astore_1        
	//* 144  286:aload_0         
	//* 145  287:ifnull          296
	//* 146  290:aload_0         
	//* 147  291:invokeinterface #266 <Method void Cursor.close()>
	//* 148  296:aload_1         
	//* 149  297:athrow          
			context = "api";
	//  150  298:ldc2            #517 <String "api">
	//  151  301:astore_0        
		stringbuilder = new StringBuilder(String.valueOf(((Object) (context))).length() + 42 + String.valueOf(((Object) (s))).length());
		stringbuilder.append("content://com.google.android.gms.chimera/");
		stringbuilder.append(((String) (context)));
		stringbuilder.append("/");
		stringbuilder.append(s);
		context = ((Context) (contentresolver.query(Uri.parse(stringbuilder.toString()), ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)))));
		if(context == null)
			break MISSING_BLOCK_LABEL_224;
		if(!((Cursor) (context)).moveToFirst())
			break MISSING_BLOCK_LABEL_224;
		i = ((Cursor) (context)).getInt(0);
		s = ((String) (context));
		if(i <= 0)
			break MISSING_BLOCK_LABEL_212;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorenter ;
		zzih = ((Cursor) (context)).getString(2);
		j = ((Cursor) (context)).getColumnIndex("loaderVersion");
		if(j < 0)
			break MISSING_BLOCK_LABEL_164;
		zzii = ((Cursor) (context)).getInt(j);
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		zza1 = (zza)zzij.get();
		s = ((String) (context));
		if(zza1 == null)
			break MISSING_BLOCK_LABEL_212;
		s = ((String) (context));
		if(zza1.zzin != null)
			break MISSING_BLOCK_LABEL_212;
		zza1.zzin = ((Cursor) (context));
		s = null;
		break MISSING_BLOCK_LABEL_212;
		s;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		try
		{
			throw s;
		}
		// Misplaced declaration of an exception variable
		catch(String s) { }
		break MISSING_BLOCK_LABEL_263;
		if(s != null)
			((Cursor) (s)).close();
		return i;
		Log.w("DynamiteModule", "Failed to retrieve remote module version.");
		throw new LoadingException("Failed to connect to dynamite module ContentResolver.", ((com.google.android.gms.dynamite.zza) (null)));
		s;
		break MISSING_BLOCK_LABEL_286;
		s;
		context = ((Context) (zza1));
		break MISSING_BLOCK_LABEL_286;
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
	//* 152  302:goto            20
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
	//    6   12:ldc2            #519 <String "Selected local version of ">
	//    7   15:aload_1         
	//    8   16:invokevirtual   #202 <Method String String.concat(String)>
	//    9   19:astore_1        
		else
	//*  10   20:goto            34
			s = new String("Selected local version of ");
	//   11   23:new             #127 <Class String>
	//   12   26:dup             
	//   13   27:ldc2            #519 <String "Selected local version of ">
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
	//   24   49:invokespecial   #393 <Method void DynamiteModule(Context)>
	//   25   52:areturn         
	}

	private static zzi zzj(Context context)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzif == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    3:getstatic       #521 <Field zzi zzif>
	//    3    6:ifnull          18
		context = ((Context) (zzif));
	//    4    9:getstatic       #521 <Field zzi zzif>
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
	//   10   18:invokestatic    #527 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #531 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context)>
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
	//   19   34:ldc2            #321 <String "com.google.android.gms">
	//   20   37:iconst_3        
	//   21   38:invokevirtual   #535 <Method Context Context.createPackageContext(String, int)>
	//   22   41:invokevirtual   #123 <Method ClassLoader Context.getClassLoader()>
	//   23   44:ldc2            #537 <String "com.google.android.gms.chimera.container.DynamiteLoaderImpl">
	//   24   47:invokevirtual   #156 <Method Class ClassLoader.loadClass(String)>
	//   25   50:invokevirtual   #539 <Method Object Class.newInstance()>
	//   26   53:checkcast       #419 <Class IBinder>
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
	//   34   67:ldc2            #541 <String "com.google.android.gms.dynamite.IDynamiteLoader">
	//   35   70:invokeinterface #425 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   36   75:astore_1        
		if(iinterface instanceof zzi)
	//*  37   76:aload_1         
	//*  38   77:instanceof      #371 <Class zzi>
	//*  39   80:ifeq            91
		{
			context = ((Context) ((zzi)iinterface));
	//   40   83:aload_1         
	//   41   84:checkcast       #371 <Class zzi>
	//   42   87:astore_0        
			break MISSING_BLOCK_LABEL_100;
	//   43   88:goto            100
		}
		context = ((Context) (new zzj(((IBinder) (context)))));
	//   44   91:new             #543 <Class zzj>
	//   45   94:dup             
	//   46   95:aload_0         
	//   47   96:invokespecial   #544 <Method void zzj(IBinder)>
	//   48   99:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_158;
	//   49  100:aload_0         
	//   50  101:ifnull          158
		zzif = ((zzi) (context));
	//   51  104:aload_0         
	//   52  105:putstatic       #521 <Field zzi zzif>
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
	//   65  129:ldc2            #546 <String "Failed to load IDynamiteLoader from GmsCore: ">
	//   66  132:aload_0         
	//   67  133:invokevirtual   #202 <Method String String.concat(String)>
	//   68  136:astore_0        
			break MISSING_BLOCK_LABEL_151;
	//   69  137:goto            151
		}
		context = ((Context) (new String("Failed to load IDynamiteLoader from GmsCore: ")));
	//   70  140:new             #127 <Class String>
	//   71  143:dup             
	//   72  144:ldc2            #546 <String "Failed to load IDynamiteLoader from GmsCore: ">
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
		throws LoadingException
	{
		IBinder ibinder = (IBinder)zzim.getClassLoader().loadClass(s).newInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field Context zzim>
	//    2    4:invokevirtual   #123 <Method ClassLoader Context.getClassLoader()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #156 <Method Class ClassLoader.loadClass(String)>
	//    5   11:invokevirtual   #539 <Method Object Class.newInstance()>
	//    6   14:checkcast       #419 <Class IBinder>
	//    7   17:astore_2        
		return ibinder;
	//    8   18:aload_2         
	//    9   19:areturn         
		Object obj;
		obj;
	//   10   20:astore_2        
		break MISSING_BLOCK_LABEL_29;
	//   11   21:goto            29
		obj;
	//   12   24:astore_2        
		break MISSING_BLOCK_LABEL_29;
	//   13   25:goto            29
		obj;
	//   14   28:astore_2        
		s = String.valueOf(((Object) (s)));
	//   15   29:aload_1         
	//   16   30:invokestatic    #131 <Method String String.valueOf(Object)>
	//   17   33:astore_1        
		if(s.length() != 0)
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #135 <Method int String.length()>
	//*  20   38:ifeq            52
			s = "Failed to instantiate module class: ".concat(s);
	//   21   41:ldc2            #551 <String "Failed to instantiate module class: ">
	//   22   44:aload_1         
	//   23   45:invokevirtual   #202 <Method String String.concat(String)>
	//   24   48:astore_1        
		else
	//*  25   49:goto            63
			s = new String("Failed to instantiate module class: ");
	//   26   52:new             #127 <Class String>
	//   27   55:dup             
	//   28   56:ldc2            #551 <String "Failed to instantiate module class: ">
	//   29   59:invokespecial   #205 <Method void String(String)>
	//   30   62:astore_1        
		throw new LoadingException(s, ((Throwable) (obj)), ((com.google.android.gms.dynamite.zza) (null)));
	//   31   63:new             #9   <Class DynamiteModule$LoadingException>
	//   32   66:dup             
	//   33   67:aload_1         
	//   34   68:aload_2         
	//   35   69:aconst_null     
	//   36   70:invokespecial   #280 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//   37   73:athrow          
	}

	public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzd();
	public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zze();
	public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzf();
	public static final VersionPolicy PREFER_LOCAL = new zzc();
	public static final VersionPolicy PREFER_REMOTE = new com.google.android.gms.dynamite.zzb();
	private static Boolean zzie;
	private static zzi zzif;
	private static zzk zzig;
	private static String zzih;
	private static int zzii = -1;
	private static final ThreadLocal zzij = new ThreadLocal();
	private static final VersionPolicy.zza zzik = new com.google.android.gms.dynamite.zza();
	private static final VersionPolicy zzil = new zzg();
	private final Context zzim;

	static 
	{
	//    0    0:new             #56  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void ThreadLocal()>
	//    3    7:putstatic       #61  <Field ThreadLocal zzij>
	//    4   10:new             #63  <Class zza>
	//    5   13:dup             
	//    6   14:invokespecial   #64  <Method void zza()>
	//    7   17:putstatic       #66  <Field DynamiteModule$VersionPolicy$zza zzik>
	//    8   20:new             #68  <Class zzb>
	//    9   23:dup             
	//   10   24:invokespecial   #69  <Method void zzb()>
	//   11   27:putstatic       #71  <Field DynamiteModule$VersionPolicy PREFER_REMOTE>
	//   12   30:new             #73  <Class zzc>
	//   13   33:dup             
	//   14   34:invokespecial   #74  <Method void zzc()>
	//   15   37:putstatic       #76  <Field DynamiteModule$VersionPolicy PREFER_LOCAL>
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
