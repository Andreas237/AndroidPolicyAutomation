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
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.*;

// Referenced classes of package com.google.android.gms.dynamite:
//			zza, zzb, zzc, zzd, 
//			zze, zzf, zzg, zzh, 
//			IDynamiteLoader, IDynamiteLoaderV2

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
		//    2    2:invokespecial   #11  <Method void Exception(String)>
		//    3    5:return          
		}

		LoadingException(String s, com.google.android.gms.dynamite.zza zza1)
		{
			this(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void DynamiteModule$LoadingException(String)>
		//    3    5:return          
		}

		private LoadingException(String s, Throwable throwable)
		{
			super(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #17  <Method void Exception(String, Throwable)>
		//    4    6:return          
		}

		LoadingException(String s, Throwable throwable, com.google.android.gms.dynamite.zza zza1)
		{
			this(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void DynamiteModule$LoadingException(String, Throwable)>
		//    4    6:return          
		}
	}

	public static interface VersionPolicy
	{

		public abstract SelectionResult selectModule(Context context, String s, IVersions iversions)
			throws LoadingException;
	}

	public static interface VersionPolicy.IVersions
	{

		public abstract int getLocalVersion(Context context, String s);

		public abstract int getRemoteVersion(Context context, String s, boolean flag)
			throws LoadingException;
	}

	public static class VersionPolicy.SelectionResult
	{

		public int localVersion;
		public int remoteVersion;
		public int selection;

		public VersionPolicy.SelectionResult()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			localVersion = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #20  <Field int localVersion>
			remoteVersion = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #22  <Field int remoteVersion>
			selection = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #24  <Field int selection>
		//   11   19:return          
		}
	}

	private static final class zza
	{

		public Cursor zzaby;

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
		implements VersionPolicy.IVersions
	{

		public final int getLocalVersion(Context context, String s)
		{
			return zzabz;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int zzabz>
		//    2    4:ireturn         
		}

		public final int getRemoteVersion(Context context, String s, boolean flag)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		private final int zzabz;
		private final int zzaca = 0;

		public zzb(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzabz = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int zzabz>
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #21  <Field int zzaca>
		//    8   14:return          
		}
	}


	private DynamiteModule(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void Object()>
		zzabx = (Context)Preconditions.checkNotNull(((Object) (context)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #103 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #105 <Class Context>
	//    6   12:putfield        #107 <Field Context zzabx>
	//    7   15:return          
	}

	public static int getLocalVersion(Context context, String s)
	{
		Object obj;
		context = ((Context) (context.getApplicationContext().getClassLoader()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method Context Context.getApplicationContext()>
	//    2    4:invokevirtual   #121 <Method ClassLoader Context.getClassLoader()>
	//    3    7:astore_0        
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 61)));
	//    4    8:new             #123 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokestatic    #129 <Method String String.valueOf(Object)>
	//    8   16:invokevirtual   #133 <Method int String.length()>
	//    9   19:bipush          61
	//   10   21:iadd            
	//   11   22:invokespecial   #136 <Method void StringBuilder(int)>
	//   12   25:astore_3        
		((StringBuilder) (obj)).append("com.google.android.gms.dynamite.descriptors.");
	//   13   26:aload_3         
	//   14   27:ldc1            #138 <String "com.google.android.gms.dynamite.descriptors.">
	//   15   29:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		((StringBuilder) (obj)).append(s);
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		((StringBuilder) (obj)).append(".ModuleDescriptor");
	//   21   39:aload_3         
	//   22   40:ldc1            #144 <String ".ModuleDescriptor">
	//   23   42:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		obj = ((Object) (((ClassLoader) (context)).loadClass(((StringBuilder) (obj)).toString())));
	//   25   46:aload_0         
	//   26   47:aload_3         
	//   27   48:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   28   51:invokevirtual   #154 <Method Class ClassLoader.loadClass(String)>
	//   29   54:astore_3        
		context = ((Context) (((Class) (obj)).getDeclaredField("MODULE_ID")));
	//   30   55:aload_3         
	//   31   56:ldc1            #156 <String "MODULE_ID">
	//   32   58:invokevirtual   #162 <Method Field Class.getDeclaredField(String)>
	//   33   61:astore_0        
		obj = ((Object) (((Class) (obj)).getDeclaredField("MODULE_VERSION")));
	//   34   62:aload_3         
	//   35   63:ldc1            #164 <String "MODULE_VERSION">
	//   36   65:invokevirtual   #162 <Method Field Class.getDeclaredField(String)>
	//   37   68:astore_3        
		if(((Field) (context)).get(((Object) (null))).equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_161;
	//   38   69:aload_0         
	//   39   70:aconst_null     
	//   40   71:invokevirtual   #169 <Method Object Field.get(Object)>
	//   41   74:aload_1         
	//   42   75:invokevirtual   #173 <Method boolean Object.equals(Object)>
	//   43   78:ifne            161
		context = ((Context) (String.valueOf(((Field) (context)).get(((Object) (null))))));
	//   44   81:aload_0         
	//   45   82:aconst_null     
	//   46   83:invokevirtual   #169 <Method Object Field.get(Object)>
	//   47   86:invokestatic    #129 <Method String String.valueOf(Object)>
	//   48   89:astore_0        
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (context))).length() + 51 + String.valueOf(((Object) (s))).length())));
	//   49   90:new             #123 <Class StringBuilder>
	//   50   93:dup             
	//   51   94:aload_0         
	//   52   95:invokestatic    #129 <Method String String.valueOf(Object)>
	//   53   98:invokevirtual   #133 <Method int String.length()>
	//   54  101:bipush          51
	//   55  103:iadd            
	//   56  104:aload_1         
	//   57  105:invokestatic    #129 <Method String String.valueOf(Object)>
	//   58  108:invokevirtual   #133 <Method int String.length()>
	//   59  111:iadd            
	//   60  112:invokespecial   #136 <Method void StringBuilder(int)>
	//   61  115:astore_3        
		((StringBuilder) (obj)).append("Module descriptor id '");
	//   62  116:aload_3         
	//   63  117:ldc1            #175 <String "Module descriptor id '">
	//   64  119:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   65  122:pop             
		((StringBuilder) (obj)).append(((String) (context)));
	//   66  123:aload_3         
	//   67  124:aload_0         
	//   68  125:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   69  128:pop             
		((StringBuilder) (obj)).append("' didn't match expected id '");
	//   70  129:aload_3         
	//   71  130:ldc1            #177 <String "' didn't match expected id '">
	//   72  132:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   73  135:pop             
		((StringBuilder) (obj)).append(s);
	//   74  136:aload_3         
	//   75  137:aload_1         
	//   76  138:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   77  141:pop             
		((StringBuilder) (obj)).append("'");
	//   78  142:aload_3         
	//   79  143:ldc1            #179 <String "'">
	//   80  145:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   81  148:pop             
		Log.e("DynamiteModule", ((StringBuilder) (obj)).toString());
	//   82  149:ldc1            #181 <String "DynamiteModule">
	//   83  151:aload_3         
	//   84  152:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   85  155:invokestatic    #187 <Method int Log.e(String, String)>
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
	//   91  163:invokevirtual   #191 <Method int Field.getInt(Object)>
	//   92  166:istore_2        
		}
	//*  93  167:iload_2         
	//*  94  168:ireturn         
	//*  95  169:astore_0        
	//*  96  170:aload_0         
	//*  97  171:invokevirtual   #194 <Method String Exception.getMessage()>
	//*  98  174:invokestatic    #129 <Method String String.valueOf(Object)>
	//*  99  177:astore_0        
	//* 100  178:aload_0         
	//* 101  179:invokevirtual   #133 <Method int String.length()>
	//* 102  182:ifeq            195
	//* 103  185:ldc1            #196 <String "Failed to load module descriptor class: ">
	//* 104  187:aload_0         
	//* 105  188:invokevirtual   #200 <Method String String.concat(String)>
	//* 106  191:astore_0        
	//* 107  192:goto            205
	//* 108  195:new             #125 <Class String>
	//* 109  198:dup             
	//* 110  199:ldc1            #196 <String "Failed to load module descriptor class: ">
	//* 111  201:invokespecial   #203 <Method void String(String)>
	//* 112  204:astore_0        
	//* 113  205:ldc1            #181 <String "DynamiteModule">
	//* 114  207:aload_0         
	//* 115  208:invokestatic    #187 <Method int Log.e(String, String)>
	//* 116  211:pop             
	//* 117  212:iconst_0        
	//* 118  213:ireturn         
	//* 119  214:new             #123 <Class StringBuilder>
	//* 120  217:dup             
	//* 121  218:aload_1         
	//* 122  219:invokestatic    #129 <Method String String.valueOf(Object)>
	//* 123  222:invokevirtual   #133 <Method int String.length()>
	//* 124  225:bipush          45
	//* 125  227:iadd            
	//* 126  228:invokespecial   #136 <Method void StringBuilder(int)>
	//* 127  231:astore_0        
	//* 128  232:aload_0         
	//* 129  233:ldc1            #205 <String "Local module descriptor class for ">
	//* 130  235:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//* 131  238:pop             
	//* 132  239:aload_0         
	//* 133  240:aload_1         
	//* 134  241:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//* 135  244:pop             
	//* 136  245:aload_0         
	//* 137  246:ldc1            #207 <String " not found.">
	//* 138  248:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//* 139  251:pop             
	//* 140  252:ldc1            #181 <String "DynamiteModule">
	//* 141  254:aload_0         
	//* 142  255:invokevirtual   #148 <Method String StringBuilder.toString()>
	//* 143  258:invokestatic    #210 <Method int Log.w(String, String)>
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

	public static Uri getQueryUri(String s, boolean flag)
	{
		String s1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			s1 = "api_force_staging";
	//    2    4:ldc1            #214 <String "api_force_staging">
	//    3    6:astore_2        
		else
	//*   4    7:goto            13
			s1 = "api";
	//    5   10:ldc1            #216 <String "api">
	//    6   12:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 42 + String.valueOf(((Object) (s))).length());
	//    7   13:new             #123 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokestatic    #129 <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #133 <Method int String.length()>
	//   12   24:bipush          42
	//   13   26:iadd            
	//   14   27:aload_0         
	//   15   28:invokestatic    #129 <Method String String.valueOf(Object)>
	//   16   31:invokevirtual   #133 <Method int String.length()>
	//   17   34:iadd            
	//   18   35:invokespecial   #136 <Method void StringBuilder(int)>
	//   19   38:astore_3        
		stringbuilder.append("content://com.google.android.gms.chimera/");
	//   20   39:aload_3         
	//   21   40:ldc1            #218 <String "content://com.google.android.gms.chimera/">
	//   22   42:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		stringbuilder.append(s1);
	//   24   46:aload_3         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		stringbuilder.append("/");
	//   28   52:aload_3         
	//   29   53:ldc1            #220 <String "/">
	//   30   55:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
		stringbuilder.append(s);
	//   32   59:aload_3         
	//   33   60:aload_0         
	//   34   61:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		return Uri.parse(stringbuilder.toString());
	//   36   65:aload_3         
	//   37   66:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   38   69:invokestatic    #226 <Method Uri Uri.parse(String)>
	//   39   72:areturn         
	}

	public static int getRemoteVersion(Context context, String s)
	{
		return getRemoteVersion(context, s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #230 <Method int getRemoteVersion(Context, String, boolean)>
	//    4    6:ireturn         
	}

	public static int getRemoteVersion(Context context, String s, boolean flag)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj1 = ((Object) (zzabr));
	//    2    3:getstatic       #236 <Field Boolean zzabr>
	//    3    6:astore          5
		Object obj = obj1;
	//    4    8:aload           5
	//    5   10:astore          4
		if(obj1 != null) goto _L2; else goto _L1
	//    6   12:aload           5
	//    7   14:ifnonnull       297
_L1:
		obj1 = ((Object) (context.getApplicationContext().getClassLoader().loadClass(((Class) (com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader)).getName())));
	//    8   17:aload_0         
	//    9   18:invokevirtual   #117 <Method Context Context.getApplicationContext()>
	//   10   21:invokevirtual   #121 <Method ClassLoader Context.getClassLoader()>
	//   11   24:ldc1            #6   <Class DynamiteModule$DynamiteLoaderClassLoader>
	//   12   26:invokevirtual   #239 <Method String Class.getName()>
	//   13   29:invokevirtual   #154 <Method Class ClassLoader.loadClass(String)>
	//   14   32:astore          5
		obj = ((Object) (((Class) (obj1)).getDeclaredField("sClassLoader")));
	//   15   34:aload           5
	//   16   36:ldc1            #241 <String "sClassLoader">
	//   17   38:invokevirtual   #162 <Method Field Class.getDeclaredField(String)>
	//   18   41:astore          4
		obj1;
	//   19   43:aload           5
		JVM INSTR monitorenter ;
	//   20   45:monitorenter    
		ClassLoader classloader = (ClassLoader)((Field) (obj)).get(((Object) (null)));
	//   21   46:aload           4
	//   22   48:aconst_null     
	//   23   49:invokevirtual   #169 <Method Object Field.get(Object)>
	//   24   52:checkcast       #150 <Class ClassLoader>
	//   25   55:astore          6
		if(classloader == null) goto _L4; else goto _L3
	//   26   57:aload           6
	//   27   59:ifnull          91
_L3:
		if(classloader != ClassLoader.getSystemClassLoader()) goto _L6; else goto _L5
	//   28   62:aload           6
	//   29   64:invokestatic    #244 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//   30   67:if_acmpne       78
_L5:
		obj = ((Object) (Boolean.FALSE));
	//   31   70:getstatic       #249 <Field Boolean Boolean.FALSE>
	//   32   73:astore          4
		  goto _L7
	//*  33   75:goto            206
_L6:
		int i;
		try
		{
			zza(classloader);
	//   34   78:aload           6
	//   35   80:invokestatic    #252 <Method void zza(ClassLoader)>
		}
	//*  36   83:getstatic       #255 <Field Boolean Boolean.TRUE>
	//*  37   86:astore          4
	//*  38   88:goto            206
	//*  39   91:ldc2            #257 <String "com.google.android.gms">
	//*  40   94:aload_0         
	//*  41   95:invokevirtual   #117 <Method Context Context.getApplicationContext()>
	//*  42   98:invokevirtual   #260 <Method String Context.getPackageName()>
	//*  43  101:invokevirtual   #261 <Method boolean String.equals(Object)>
	//*  44  104:ifeq            119
	//*  45  107:aload           4
	//*  46  109:aconst_null     
	//*  47  110:invokestatic    #244 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  48  113:invokevirtual   #265 <Method void Field.set(Object, Object)>
	//*  49  116:goto            70
	//*  50  119:aload_0         
	//*  51  120:aload_1         
	//*  52  121:iload_2         
	//*  53  122:invokestatic    #267 <Method int zzb(Context, String, boolean)>
	//*  54  125:istore_3        
	//*  55  126:getstatic       #269 <Field String zzabu>
	//*  56  129:ifnull          186
	//*  57  132:getstatic       #269 <Field String zzabu>
	//*  58  135:invokevirtual   #273 <Method boolean String.isEmpty()>
	//*  59  138:ifeq            144
	//*  60  141:goto            186
	//*  61  144:new             #275 <Class zzh>
	//*  62  147:dup             
	//*  63  148:getstatic       #269 <Field String zzabu>
	//*  64  151:invokestatic    #244 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  65  154:invokespecial   #278 <Method void zzh(String, ClassLoader)>
	//*  66  157:astore          6
	//*  67  159:aload           6
	//*  68  161:invokestatic    #252 <Method void zza(ClassLoader)>
	//*  69  164:aload           4
	//*  70  166:aconst_null     
	//*  71  167:aload           6
	//*  72  169:invokevirtual   #265 <Method void Field.set(Object, Object)>
	//*  73  172:getstatic       #255 <Field Boolean Boolean.TRUE>
	//*  74  175:putstatic       #236 <Field Boolean zzabr>
	//*  75  178:aload           5
	//*  76  180:monitorexit     
	//*  77  181:ldc1            #2   <Class DynamiteModule>
	//*  78  183:monitorexit     
	//*  79  184:iload_3         
	//*  80  185:ireturn         
	//*  81  186:aload           5
	//*  82  188:monitorexit     
	//*  83  189:ldc1            #2   <Class DynamiteModule>
	//*  84  191:monitorexit     
	//*  85  192:iload_3         
	//*  86  193:ireturn         
	//*  87  194:aload           4
	//*  88  196:aconst_null     
	//*  89  197:invokestatic    #244 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  90  200:invokevirtual   #265 <Method void Field.set(Object, Object)>
	//*  91  203:goto            70
	//*  92  206:aload           5
	//*  93  208:monitorexit     
	//*  94  209:goto            292
	//*  95  212:astore          4
	//*  96  214:aload           5
	//*  97  216:monitorexit     
	//*  98  217:aload           4
	//*  99  219:athrow          
	//* 100  220:astore          4
	//* 101  222:goto            232
	//* 102  225:astore          4
	//* 103  227:goto            232
	//* 104  230:astore          4
	//* 105  232:aload           4
	//* 106  234:invokestatic    #129 <Method String String.valueOf(Object)>
	//* 107  237:astore          4
	//* 108  239:new             #123 <Class StringBuilder>
	//* 109  242:dup             
	//* 110  243:aload           4
	//* 111  245:invokestatic    #129 <Method String String.valueOf(Object)>
	//* 112  248:invokevirtual   #133 <Method int String.length()>
	//* 113  251:bipush          30
	//* 114  253:iadd            
	//* 115  254:invokespecial   #136 <Method void StringBuilder(int)>
	//* 116  257:astore          5
	//* 117  259:aload           5
	//* 118  261:ldc2            #280 <String "Failed to load module via V2: ">
	//* 119  264:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//* 120  267:pop             
	//* 121  268:aload           5
	//* 122  270:aload           4
	//* 123  272:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//* 124  275:pop             
	//* 125  276:ldc1            #181 <String "DynamiteModule">
	//* 126  278:aload           5
	//* 127  280:invokevirtual   #148 <Method String StringBuilder.toString()>
	//* 128  283:invokestatic    #210 <Method int Log.w(String, String)>
	//* 129  286:pop             
	//* 130  287:getstatic       #249 <Field Boolean Boolean.FALSE>
	//* 131  290:astore          4
	//* 132  292:aload           4
	//* 133  294:putstatic       #236 <Field Boolean zzabr>
	//* 134  297:ldc1            #2   <Class DynamiteModule>
	//* 135  299:monitorexit     
	//* 136  300:aload           4
	//* 137  302:invokevirtual   #283 <Method boolean Boolean.booleanValue()>
	//* 138  305:ifeq            364
	//* 139  308:aload_0         
	//* 140  309:aload_1         
	//* 141  310:iload_2         
	//* 142  311:invokestatic    #267 <Method int zzb(Context, String, boolean)>
	//* 143  314:istore_3        
	//* 144  315:iload_3         
	//* 145  316:ireturn         
	//* 146  317:astore_0        
	//* 147  318:aload_0         
	//* 148  319:invokevirtual   #284 <Method String DynamiteModule$LoadingException.getMessage()>
	//* 149  322:invokestatic    #129 <Method String String.valueOf(Object)>
	//* 150  325:astore_0        
	//* 151  326:aload_0         
	//* 152  327:invokevirtual   #133 <Method int String.length()>
	//* 153  330:ifeq            344
	//* 154  333:ldc2            #286 <String "Failed to retrieve remote module version: ">
	//* 155  336:aload_0         
	//* 156  337:invokevirtual   #200 <Method String String.concat(String)>
	//* 157  340:astore_0        
	//* 158  341:goto            355
	//* 159  344:new             #125 <Class String>
	//* 160  347:dup             
	//* 161  348:ldc2            #286 <String "Failed to retrieve remote module version: ">
	//* 162  351:invokespecial   #203 <Method void String(String)>
	//* 163  354:astore_0        
	//* 164  355:ldc1            #181 <String "DynamiteModule">
	//* 165  357:aload_0         
	//* 166  358:invokestatic    #210 <Method int Log.w(String, String)>
	//* 167  361:pop             
	//* 168  362:iconst_0        
	//* 169  363:ireturn         
	//* 170  364:aload_0         
	//* 171  365:aload_1         
	//* 172  366:iload_2         
	//* 173  367:invokestatic    #288 <Method int zza(Context, String, boolean)>
	//* 174  370:ireturn         
	//* 175  371:astore_0        
	//* 176  372:ldc1            #2   <Class DynamiteModule>
	//* 177  374:monitorexit     
	//* 178  375:aload_0         
	//* 179  376:athrow          
		catch(LoadingException loadingexception) { }
	//  180  377:astore          4
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
		i = zzb(context, s, flag);
		if(zzabu == null || zzabu.isEmpty())
			break MISSING_BLOCK_LABEL_186;
		zzh zzh1 = new zzh(zzabu, ClassLoader.getSystemClassLoader());
		zza(((ClassLoader) (zzh1)));
		((Field) (obj)).set(((Object) (null)), ((Object) (zzh1)));
		zzabr = Boolean.TRUE;
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
		break MISSING_BLOCK_LABEL_292;
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
		zzabr = ((Boolean) (obj));
_L2:
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		if(((Boolean) (obj)).booleanValue())
		{
			int j;
			try
			{
				j = zzb(context, s, flag);
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				context = ((Context) (String.valueOf(((Object) (((LoadingException) (context)).getMessage())))));
				if(((String) (context)).length() != 0)
					context = ((Context) ("Failed to retrieve remote module version: ".concat(((String) (context)))));
				else
					context = ((Context) (new String("Failed to retrieve remote module version: ")));
				Log.w("DynamiteModule", ((String) (context)));
				return 0;
			}
			return j;
		} else
		{
			return zza(context, s, flag);
		}
		context;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		throw context;
	//* 181  379:goto            83
		LoadingException loadingexception1;
		loadingexception1;
	//  182  382:astore          6
		  goto _L8
	//* 183  384:goto            194
	}

	public static Boolean getUseV2ForTesting()
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Boolean boolean1 = zzabr;
	//    2    3:getstatic       #236 <Field Boolean zzabr>
	//    3    6:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//    4    7:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return boolean1;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class DynamiteModule>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static DynamiteModule load(Context context, VersionPolicy versionpolicy, String s)
		throws LoadingException
	{
		zza zza1;
		zza zza2;
		zza1 = (zza)zzabv.get();
	//    0    0:getstatic       #59  <Field ThreadLocal zzabv>
	//    1    3:invokevirtual   #297 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #21  <Class DynamiteModule$zza>
	//    3    9:astore          6
		zza2 = new zza(((com.google.android.gms.dynamite.zza) (null)));
	//    4   11:new             #21  <Class DynamiteModule$zza>
	//    5   14:dup             
	//    6   15:aconst_null     
	//    7   16:invokespecial   #300 <Method void DynamiteModule$zza(zza)>
	//    8   19:astore          7
		zzabv.set(((Object) (zza2)));
	//    9   21:getstatic       #59  <Field ThreadLocal zzabv>
	//   10   24:aload           7
	//   11   26:invokevirtual   #303 <Method void ThreadLocal.set(Object)>
		VersionPolicy.SelectionResult selectionresult;
		selectionresult = versionpolicy.selectModule(context, s, zzabw);
	//   12   29:aload_1         
	//   13   30:aload_0         
	//   14   31:aload_2         
	//   15   32:getstatic       #64  <Field DynamiteModule$VersionPolicy$IVersions zzabw>
	//   16   35:invokeinterface #307 <Method DynamiteModule$VersionPolicy$SelectionResult DynamiteModule$VersionPolicy.selectModule(Context, String, DynamiteModule$VersionPolicy$IVersions)>
	//   17   40:astore          8
		int i = selectionresult.localVersion;
	//   18   42:aload           8
	//   19   44:getfield        #311 <Field int DynamiteModule$VersionPolicy$SelectionResult.localVersion>
	//   20   47:istore_3        
		int i1 = selectionresult.remoteVersion;
	//   21   48:aload           8
	//   22   50:getfield        #314 <Field int DynamiteModule$VersionPolicy$SelectionResult.remoteVersion>
	//   23   53:istore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 68 + String.valueOf(((Object) (s))).length());
	//   24   55:new             #123 <Class StringBuilder>
	//   25   58:dup             
	//   26   59:aload_2         
	//   27   60:invokestatic    #129 <Method String String.valueOf(Object)>
	//   28   63:invokevirtual   #133 <Method int String.length()>
	//   29   66:bipush          68
	//   30   68:iadd            
	//   31   69:aload_2         
	//   32   70:invokestatic    #129 <Method String String.valueOf(Object)>
	//   33   73:invokevirtual   #133 <Method int String.length()>
	//   34   76:iadd            
	//   35   77:invokespecial   #136 <Method void StringBuilder(int)>
	//   36   80:astore          5
		stringbuilder.append("Considering local module ");
	//   37   82:aload           5
	//   38   84:ldc2            #316 <String "Considering local module ">
	//   39   87:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   40   90:pop             
		stringbuilder.append(s);
	//   41   91:aload           5
	//   42   93:aload_2         
	//   43   94:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   44   97:pop             
		stringbuilder.append(":");
	//   45   98:aload           5
	//   46  100:ldc2            #318 <String ":">
	//   47  103:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   48  106:pop             
		stringbuilder.append(i);
	//   49  107:aload           5
	//   50  109:iload_3         
	//   51  110:invokevirtual   #321 <Method StringBuilder StringBuilder.append(int)>
	//   52  113:pop             
		stringbuilder.append(" and remote module ");
	//   53  114:aload           5
	//   54  116:ldc2            #323 <String " and remote module ">
	//   55  119:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   56  122:pop             
		stringbuilder.append(s);
	//   57  123:aload           5
	//   58  125:aload_2         
	//   59  126:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   60  129:pop             
		stringbuilder.append(":");
	//   61  130:aload           5
	//   62  132:ldc2            #318 <String ":">
	//   63  135:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   64  138:pop             
		stringbuilder.append(i1);
	//   65  139:aload           5
	//   66  141:iload           4
	//   67  143:invokevirtual   #321 <Method StringBuilder StringBuilder.append(int)>
	//   68  146:pop             
		Log.i("DynamiteModule", stringbuilder.toString());
	//   69  147:ldc1            #181 <String "DynamiteModule">
	//   70  149:aload           5
	//   71  151:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   72  154:invokestatic    #326 <Method int Log.i(String, String)>
	//   73  157:pop             
		if(selectionresult.selection == 0 || selectionresult.selection == -1 && selectionresult.localVersion == 0 || selectionresult.selection == 1 && selectionresult.remoteVersion == 0)
			break MISSING_BLOCK_LABEL_454;
	//   74  158:aload           8
	//   75  160:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//   76  163:ifeq            454
	//   77  166:aload           8
	//   78  168:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//   79  171:iconst_m1       
	//   80  172:icmpne          183
	//   81  175:aload           8
	//   82  177:getfield        #311 <Field int DynamiteModule$VersionPolicy$SelectionResult.localVersion>
	//   83  180:ifeq            454
	//   84  183:aload           8
	//   85  185:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//   86  188:iconst_1        
	//   87  189:icmpne          200
	//   88  192:aload           8
	//   89  194:getfield        #314 <Field int DynamiteModule$VersionPolicy$SelectionResult.remoteVersion>
	//   90  197:ifeq            454
		if(selectionresult.selection != -1) goto _L2; else goto _L1
	//   91  200:aload           8
	//   92  202:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//   93  205:iconst_m1       
	//   94  206:icmpne          247
_L1:
		versionpolicy = ((VersionPolicy) (zzd(context, s)));
	//   95  209:aload_0         
	//   96  210:aload_2         
	//   97  211:invokestatic    #333 <Method DynamiteModule zzd(Context, String)>
	//   98  214:astore_1        
		context = ((Context) (versionpolicy));
	//   99  215:aload_1         
	//  100  216:astore_0        
		if(zza2.zzaby == null) goto _L4; else goto _L3
	//  101  217:aload           7
	//  102  219:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//  103  222:ifnull          237
_L3:
		context = ((Context) (versionpolicy));
	//  104  225:aload_1         
	//  105  226:astore_0        
_L7:
		zza2.zzaby.close();
	//  106  227:aload           7
	//  107  229:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//  108  232:invokeinterface #342 <Method void Cursor.close()>
_L4:
		zzabv.set(((Object) (zza1)));
	//  109  237:getstatic       #59  <Field ThreadLocal zzabv>
	//  110  240:aload           6
	//  111  242:invokevirtual   #303 <Method void ThreadLocal.set(Object)>
		return ((DynamiteModule) (context));
	//  112  245:aload_0         
	//  113  246:areturn         
_L2:
		int j = selectionresult.selection;
	//  114  247:aload           8
	//  115  249:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//  116  252:istore_3        
		if(j != 1)
			break MISSING_BLOCK_LABEL_411;
	//  117  253:iload_3         
	//  118  254:iconst_1        
	//  119  255:icmpne          411
		Object obj = ((Object) (zza(context, s, selectionresult.remoteVersion)));
	//  120  258:aload_0         
	//  121  259:aload_2         
	//  122  260:aload           8
	//  123  262:getfield        #314 <Field int DynamiteModule$VersionPolicy$SelectionResult.remoteVersion>
	//  124  265:invokestatic    #345 <Method DynamiteModule zza(Context, String, int)>
	//  125  268:astore          5
		context = ((Context) (obj));
	//  126  270:aload           5
	//  127  272:astore_0        
		if(zza2.zzaby != null)
	//* 128  273:aload           7
	//* 129  275:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//* 130  278:ifnull          237
		{
			context = ((Context) (obj));
	//  131  281:aload           5
	//  132  283:astore_0        
			continue; /* Loop/switch isn't completed */
	//  133  284:goto            227
		}
		  goto _L4
		LoadingException loadingexception;
		loadingexception;
	//  134  287:astore          9
		obj = ((Object) (String.valueOf(((Object) (loadingexception.getMessage())))));
	//  135  289:aload           9
	//  136  291:invokevirtual   #284 <Method String DynamiteModule$LoadingException.getMessage()>
	//  137  294:invokestatic    #129 <Method String String.valueOf(Object)>
	//  138  297:astore          5
		if(((String) (obj)).length() != 0)
	//* 139  299:aload           5
	//* 140  301:invokevirtual   #133 <Method int String.length()>
	//* 141  304:ifeq            320
		{
			obj = ((Object) ("Failed to load remote module: ".concat(((String) (obj)))));
	//  142  307:ldc2            #347 <String "Failed to load remote module: ">
	//  143  310:aload           5
	//  144  312:invokevirtual   #200 <Method String String.concat(String)>
	//  145  315:astore          5
			break MISSING_BLOCK_LABEL_332;
	//  146  317:goto            332
		}
		obj = ((Object) (new String("Failed to load remote module: ")));
	//  147  320:new             #125 <Class String>
	//  148  323:dup             
	//  149  324:ldc2            #347 <String "Failed to load remote module: ">
	//  150  327:invokespecial   #203 <Method void String(String)>
	//  151  330:astore          5
		Log.w("DynamiteModule", ((String) (obj)));
	//  152  332:ldc1            #181 <String "DynamiteModule">
	//  153  334:aload           5
	//  154  336:invokestatic    #210 <Method int Log.w(String, String)>
	//  155  339:pop             
		if(selectionresult.localVersion == 0 || versionpolicy.selectModule(context, s, ((VersionPolicy.IVersions) (new zzb(selectionresult.localVersion, 0)))).selection != -1)
			break; /* Loop/switch isn't completed */
	//  156  340:aload           8
	//  157  342:getfield        #311 <Field int DynamiteModule$VersionPolicy$SelectionResult.localVersion>
	//  158  345:ifeq            397
	//  159  348:aload_1         
	//  160  349:aload_0         
	//  161  350:aload_2         
	//  162  351:new             #24  <Class DynamiteModule$zzb>
	//  163  354:dup             
	//  164  355:aload           8
	//  165  357:getfield        #311 <Field int DynamiteModule$VersionPolicy$SelectionResult.localVersion>
	//  166  360:iconst_0        
	//  167  361:invokespecial   #350 <Method void DynamiteModule$zzb(int, int)>
	//  168  364:invokeinterface #307 <Method DynamiteModule$VersionPolicy$SelectionResult DynamiteModule$VersionPolicy.selectModule(Context, String, DynamiteModule$VersionPolicy$IVersions)>
	//  169  369:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//  170  372:iconst_m1       
	//  171  373:icmpne          397
		versionpolicy = ((VersionPolicy) (zzd(context, s)));
	//  172  376:aload_0         
	//  173  377:aload_2         
	//  174  378:invokestatic    #333 <Method DynamiteModule zzd(Context, String)>
	//  175  381:astore_1        
		context = ((Context) (versionpolicy));
	//  176  382:aload_1         
	//  177  383:astore_0        
		if(zza2.zzaby == null) goto _L4; else goto _L5
	//  178  384:aload           7
	//  179  386:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//  180  389:ifnull          237
_L5:
		context = ((Context) (versionpolicy));
	//  181  392:aload_1         
	//  182  393:astore_0        
		if(true) goto _L7; else goto _L6
	//  183  394:goto            227
_L6:
		throw new LoadingException("Remote load failed. No local fallback found.", ((Throwable) (loadingexception)), ((com.google.android.gms.dynamite.zza) (null)));
	//  184  397:new             #9   <Class DynamiteModule$LoadingException>
	//  185  400:dup             
	//  186  401:ldc2            #352 <String "Remote load failed. No local fallback found.">
	//  187  404:aload           9
	//  188  406:aconst_null     
	//  189  407:invokespecial   #355 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//  190  410:athrow          
		int k = selectionresult.selection;
	//  191  411:aload           8
	//  192  413:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//  193  416:istore_3        
		context = ((Context) (new StringBuilder(47)));
	//  194  417:new             #123 <Class StringBuilder>
	//  195  420:dup             
	//  196  421:bipush          47
	//  197  423:invokespecial   #136 <Method void StringBuilder(int)>
	//  198  426:astore_0        
		((StringBuilder) (context)).append("VersionPolicy returned invalid code:");
	//  199  427:aload_0         
	//  200  428:ldc2            #357 <String "VersionPolicy returned invalid code:">
	//  201  431:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  202  434:pop             
		((StringBuilder) (context)).append(k);
	//  203  435:aload_0         
	//  204  436:iload_3         
	//  205  437:invokevirtual   #321 <Method StringBuilder StringBuilder.append(int)>
	//  206  440:pop             
		throw new LoadingException(((StringBuilder) (context)).toString(), ((com.google.android.gms.dynamite.zza) (null)));
	//  207  441:new             #9   <Class DynamiteModule$LoadingException>
	//  208  444:dup             
	//  209  445:aload_0         
	//  210  446:invokevirtual   #148 <Method String StringBuilder.toString()>
	//  211  449:aconst_null     
	//  212  450:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//  213  453:athrow          
		int l = selectionresult.localVersion;
	//  214  454:aload           8
	//  215  456:getfield        #311 <Field int DynamiteModule$VersionPolicy$SelectionResult.localVersion>
	//  216  459:istore_3        
		int j1 = selectionresult.remoteVersion;
	//  217  460:aload           8
	//  218  462:getfield        #314 <Field int DynamiteModule$VersionPolicy$SelectionResult.remoteVersion>
	//  219  465:istore          4
		context = ((Context) (new StringBuilder(91)));
	//  220  467:new             #123 <Class StringBuilder>
	//  221  470:dup             
	//  222  471:bipush          91
	//  223  473:invokespecial   #136 <Method void StringBuilder(int)>
	//  224  476:astore_0        
		((StringBuilder) (context)).append("No acceptable module found. Local version is ");
	//  225  477:aload_0         
	//  226  478:ldc2            #362 <String "No acceptable module found. Local version is ">
	//  227  481:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  228  484:pop             
		((StringBuilder) (context)).append(l);
	//  229  485:aload_0         
	//  230  486:iload_3         
	//  231  487:invokevirtual   #321 <Method StringBuilder StringBuilder.append(int)>
	//  232  490:pop             
		((StringBuilder) (context)).append(" and remote version is ");
	//  233  491:aload_0         
	//  234  492:ldc2            #364 <String " and remote version is ">
	//  235  495:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  236  498:pop             
		((StringBuilder) (context)).append(j1);
	//  237  499:aload_0         
	//  238  500:iload           4
	//  239  502:invokevirtual   #321 <Method StringBuilder StringBuilder.append(int)>
	//  240  505:pop             
		((StringBuilder) (context)).append(".");
	//  241  506:aload_0         
	//  242  507:ldc2            #366 <String ".">
	//  243  510:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  244  513:pop             
		throw new LoadingException(((StringBuilder) (context)).toString(), ((com.google.android.gms.dynamite.zza) (null)));
	//  245  514:new             #9   <Class DynamiteModule$LoadingException>
	//  246  517:dup             
	//  247  518:aload_0         
	//  248  519:invokevirtual   #148 <Method String StringBuilder.toString()>
	//  249  522:aconst_null     
	//  250  523:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//  251  526:athrow          
		context;
	//  252  527:astore_0        
		if(zza2.zzaby != null)
	//* 253  528:aload           7
	//* 254  530:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//* 255  533:ifnull          546
			zza2.zzaby.close();
	//  256  536:aload           7
	//  257  538:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//  258  541:invokeinterface #342 <Method void Cursor.close()>
		zzabv.set(((Object) (zza1)));
	//  259  546:getstatic       #59  <Field ThreadLocal zzabv>
	//  260  549:aload           6
	//  261  551:invokevirtual   #303 <Method void ThreadLocal.set(Object)>
		throw context;
	//  262  554:aload_0         
	//  263  555:athrow          
	}

	public static Cursor queryForDynamiteModule(Context context, String s, boolean flag)
	{
		return context.getContentResolver().query(getQueryUri(s, flag), ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #373 <Method ContentResolver Context.getContentResolver()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #375 <Method Uri getQueryUri(String, boolean)>
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:invokevirtual   #381 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   10   16:areturn         
	}

	public static void resetInternalStateForTesting()
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzabs = null;
	//    2    3:aconst_null     
	//    3    4:putstatic       #384 <Field IDynamiteLoader zzabs>
		zzabt = null;
	//    4    7:aconst_null     
	//    5    8:putstatic       #386 <Field IDynamiteLoaderV2 zzabt>
		zzabu = null;
	//    6   11:aconst_null     
	//    7   12:putstatic       #269 <Field String zzabu>
		zzabr = null;
	//    8   15:aconst_null     
	//    9   16:putstatic       #236 <Field Boolean zzabr>
		com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;
	//   10   19:ldc1            #6   <Class DynamiteModule$DynamiteLoaderClassLoader>
		JVM INSTR monitorenter ;
	//   11   21:monitorenter    
		DynamiteLoaderClassLoader.sClassLoader = null;
	//   12   22:aconst_null     
	//   13   23:putstatic       #389 <Field ClassLoader DynamiteModule$DynamiteLoaderClassLoader.sClassLoader>
		com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;
	//   14   26:ldc1            #6   <Class DynamiteModule$DynamiteLoaderClassLoader>
		JVM INSTR monitorexit ;
	//   15   28:monitorexit     
		com/google/android/gms/dynamite/DynamiteModule;
	//   16   29:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		Exception exception;
		exception;
	//   19   33:astore_0        
		com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;
	//   20   34:ldc1            #6   <Class DynamiteModule$DynamiteLoaderClassLoader>
		JVM INSTR monitorexit ;
	//   21   36:monitorexit     
		throw exception;
	//   22   37:aload_0         
	//   23   38:athrow          
		exception;
	//   24   39:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   25   40:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		throw exception;
	//   27   43:aload_0         
	//   28   44:athrow          
	}

	public static void setUseV2ForTesting(Boolean boolean1)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzabr = boolean1;
	//    2    3:aload_0         
	//    3    4:putstatic       #236 <Field Boolean zzabr>
		com/google/android/gms/dynamite/DynamiteModule;
	//    4    7:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return;
	//    6   10:return          
		boolean1;
	//    7   11:astore_0        
	//*   8   12:ldc1            #2   <Class DynamiteModule>
		throw boolean1;
	//    9   14:monitorexit     
	//   10   15:aload_0         
	//   11   16:athrow          
	}

	private static int zza(Context context, String s, boolean flag)
	{
		IDynamiteLoader idynamiteloader = zzg(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #397 <Method IDynamiteLoader zzg(Context)>
	//    2    4:astore          4
		if(idynamiteloader == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		int i;
		try
		{
			i = idynamiteloader.getModuleVersion2(ObjectWrapper.wrap(((Object) (context))), s, flag);
	//    7   13:aload           4
	//    8   15:aload_0         
	//    9   16:invokestatic    #403 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   19:aload_1         
	//   11   20:iload_2         
	//   12   21:invokeinterface #409 <Method int IDynamiteLoader.getModuleVersion2(com.google.android.gms.dynamic.IObjectWrapper, String, boolean)>
	//   13   26:istore_3        
		}
	//*  14   27:iload_3         
	//*  15   28:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  16   29:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((RemoteException) (context)).getMessage())))));
	//   17   30:aload_0         
	//   18   31:invokevirtual   #410 <Method String RemoteException.getMessage()>
	//   19   34:invokestatic    #129 <Method String String.valueOf(Object)>
	//   20   37:astore_0        
			if(((String) (context)).length() != 0)
	//*  21   38:aload_0         
	//*  22   39:invokevirtual   #133 <Method int String.length()>
	//*  23   42:ifeq            56
				context = ((Context) ("Failed to retrieve remote module version: ".concat(((String) (context)))));
	//   24   45:ldc2            #286 <String "Failed to retrieve remote module version: ">
	//   25   48:aload_0         
	//   26   49:invokevirtual   #200 <Method String String.concat(String)>
	//   27   52:astore_0        
			else
	//*  28   53:goto            67
				context = ((Context) (new String("Failed to retrieve remote module version: ")));
	//   29   56:new             #125 <Class String>
	//   30   59:dup             
	//   31   60:ldc2            #286 <String "Failed to retrieve remote module version: ">
	//   32   63:invokespecial   #203 <Method void String(String)>
	//   33   66:astore_0        
			Log.w("DynamiteModule", ((String) (context)));
	//   34   67:ldc1            #181 <String "DynamiteModule">
	//   35   69:aload_0         
	//   36   70:invokestatic    #210 <Method int Log.w(String, String)>
	//   37   73:pop             
			return 0;
	//   38   74:iconst_0        
	//   39   75:ireturn         
		}
		return i;
	}

	private static Context zza(Context context, String s, int i, Cursor cursor, IDynamiteLoaderV2 idynamiteloaderv2)
	{
		try
		{
			context = (Context)ObjectWrapper.unwrap(idynamiteloaderv2.loadModule2(ObjectWrapper.wrap(((Object) (context))), s, i, ObjectWrapper.wrap(((Object) (cursor)))));
	//    0    0:aload           4
	//    1    2:aload_0         
	//    2    3:invokestatic    #403 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:aload_3         
	//    6    9:invokestatic    #403 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    7   12:invokeinterface #417 <Method com.google.android.gms.dynamic.IObjectWrapper IDynamiteLoaderV2.loadModule2(com.google.android.gms.dynamic.IObjectWrapper, String, int, com.google.android.gms.dynamic.IObjectWrapper)>
	//    8   17:invokestatic    #421 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//    9   20:checkcast       #105 <Class Context>
	//   10   23:astore_0        
		}
	//*  11   24:aload_0         
	//*  12   25:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  13   26:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((Exception) (context)).toString())))));
	//   14   27:aload_0         
	//   15   28:invokevirtual   #422 <Method String Exception.toString()>
	//   16   31:invokestatic    #129 <Method String String.valueOf(Object)>
	//   17   34:astore_0        
			if(((String) (context)).length() != 0)
	//*  18   35:aload_0         
	//*  19   36:invokevirtual   #133 <Method int String.length()>
	//*  20   39:ifeq            53
				context = ((Context) ("Failed to load DynamiteLoader: ".concat(((String) (context)))));
	//   21   42:ldc2            #424 <String "Failed to load DynamiteLoader: ">
	//   22   45:aload_0         
	//   23   46:invokevirtual   #200 <Method String String.concat(String)>
	//   24   49:astore_0        
			else
	//*  25   50:goto            64
				context = ((Context) (new String("Failed to load DynamiteLoader: ")));
	//   26   53:new             #125 <Class String>
	//   27   56:dup             
	//   28   57:ldc2            #424 <String "Failed to load DynamiteLoader: ">
	//   29   60:invokespecial   #203 <Method void String(String)>
	//   30   63:astore_0        
			Log.e("DynamiteModule", ((String) (context)));
	//   31   64:ldc1            #181 <String "DynamiteModule">
	//   32   66:aload_0         
	//   33   67:invokestatic    #187 <Method int Log.e(String, String)>
	//   34   70:pop             
			return null;
	//   35   71:aconst_null     
	//   36   72:areturn         
		}
		return context;
	}

	private static DynamiteModule zza(Context context, String s, int i)
		throws LoadingException
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Boolean boolean1 = zzabr;
	//    2    3:getstatic       #236 <Field Boolean zzabr>
	//    3    6:astore_3        
		com/google/android/gms/dynamite/DynamiteModule;
	//    4    7:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		if(boolean1 != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          35
		{
			if(boolean1.booleanValue())
	//*   8   14:aload_3         
	//*   9   15:invokevirtual   #283 <Method boolean Boolean.booleanValue()>
	//*  10   18:ifeq            28
				return zzc(context, s, i);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:invokestatic    #427 <Method DynamiteModule zzc(Context, String, int)>
	//   15   27:areturn         
			else
				return zzb(context, s, i);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokestatic    #429 <Method DynamiteModule zzb(Context, String, int)>
	//   20   34:areturn         
		} else
		{
			throw new LoadingException("Failed to determine which loading route to use.", ((com.google.android.gms.dynamite.zza) (null)));
	//   21   35:new             #9   <Class DynamiteModule$LoadingException>
	//   22   38:dup             
	//   23   39:ldc2            #431 <String "Failed to determine which loading route to use.">
	//   24   42:aconst_null     
	//   25   43:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//   26   46:athrow          
		}
		context;
	//   27   47:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   28   48:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   29   50:monitorexit     
		throw context;
	//   30   51:aload_0         
	//   31   52:athrow          
	}

	private static void zza(ClassLoader classloader)
		throws LoadingException
	{
		try
		{
			zzabt = IDynamiteLoaderV2.Stub.asInterface((IBinder)classloader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
	//    0    0:aload_0         
	//    1    1:ldc2            #439 <String "com.google.android.gms.dynamiteloader.DynamiteLoaderV2">
	//    2    4:invokevirtual   #154 <Method Class ClassLoader.loadClass(String)>
	//    3    7:iconst_0        
	//    4    8:anewarray       Class[]
	//    5   11:invokevirtual   #443 <Method Constructor Class.getConstructor(Class[])>
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokevirtual   #449 <Method Object Constructor.newInstance(Object[])>
	//    9   21:checkcast       #451 <Class IBinder>
	//   10   24:invokestatic    #457 <Method IDynamiteLoaderV2 IDynamiteLoaderV2$Stub.asInterface(IBinder)>
	//   11   27:putstatic       #386 <Field IDynamiteLoaderV2 zzabt>
			return;
	//   12   30:return          
		}
	//*  13   31:astore_0        
	//*  14   32:goto            48
	//*  15   35:astore_0        
	//*  16   36:goto            48
	//*  17   39:astore_0        
	//*  18   40:goto            48
	//*  19   43:astore_0        
	//*  20   44:goto            48
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader) { }
	//   21   47:astore_0        
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader) { }
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader) { }
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader) { }
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader) { }
		throw new LoadingException("Failed to instantiate dynamite loader", ((Throwable) (classloader)), ((com.google.android.gms.dynamite.zza) (null)));
	//   22   48:new             #9   <Class DynamiteModule$LoadingException>
	//   23   51:dup             
	//   24   52:ldc2            #459 <String "Failed to instantiate dynamite loader">
	//   25   55:aload_0         
	//   26   56:aconst_null     
	//   27   57:invokespecial   #355 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//   28   60:athrow          
	}

	private static int zzb(Context context, String s, boolean flag)
		throws LoadingException
	{
		s = ((String) (queryForDynamiteModule(context, s, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #461 <Method Cursor queryForDynamiteModule(Context, String, boolean)>
	//    4    6:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_129;
	//    5    7:aload_1         
	//    6    8:ifnull          129
		context = ((Context) (s));
	//    7   11:aload_1         
	//    8   12:astore_0        
		if(!((Cursor) (s)).moveToFirst())
			break MISSING_BLOCK_LABEL_129;
	//    9   13:aload_1         
	//   10   14:invokeinterface #464 <Method boolean Cursor.moveToFirst()>
	//   11   19:ifeq            129
		context = ((Context) (s));
	//   12   22:aload_1         
	//   13   23:astore_0        
		int i = ((Cursor) (s)).getInt(0);
	//   14   24:aload_1         
	//   15   25:iconst_0        
	//   16   26:invokeinterface #467 <Method int Cursor.getInt(int)>
	//   17   31:istore_3        
		Object obj;
		obj = ((Object) (s));
	//   18   32:aload_1         
	//   19   33:astore          4
		if(i <= 0)
			break MISSING_BLOCK_LABEL_115;
	//   20   35:iload_3         
	//   21   36:ifle            115
		context = ((Context) (s));
	//   22   39:aload_1         
	//   23   40:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   24   41:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//   25   43:monitorenter    
		zzabu = ((Cursor) (s)).getString(2);
	//   26   44:aload_1         
	//   27   45:iconst_2        
	//   28   46:invokeinterface #471 <Method String Cursor.getString(int)>
	//   29   51:putstatic       #269 <Field String zzabu>
		com/google/android/gms/dynamite/DynamiteModule;
	//   30   54:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   31   56:monitorexit     
		context = ((Context) (s));
	//   32   57:aload_1         
	//   33   58:astore_0        
		zza zza1 = (zza)zzabv.get();
	//   34   59:getstatic       #59  <Field ThreadLocal zzabv>
	//   35   62:invokevirtual   #297 <Method Object ThreadLocal.get()>
	//   36   65:checkcast       #21  <Class DynamiteModule$zza>
	//   37   68:astore          5
		obj = ((Object) (s));
	//   38   70:aload_1         
	//   39   71:astore          4
		if(zza1 == null)
			break MISSING_BLOCK_LABEL_115;
	//   40   73:aload           5
	//   41   75:ifnull          115
		obj = ((Object) (s));
	//   42   78:aload_1         
	//   43   79:astore          4
		context = ((Context) (s));
	//   44   81:aload_1         
	//   45   82:astore_0        
		if(zza1.zzaby != null)
			break MISSING_BLOCK_LABEL_115;
	//   46   83:aload           5
	//   47   85:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//   48   88:ifnonnull       115
		context = ((Context) (s));
	//   49   91:aload_1         
	//   50   92:astore_0        
		zza1.zzaby = ((Cursor) (s));
	//   51   93:aload           5
	//   52   95:aload_1         
	//   53   96:putfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
		obj = null;
	//   54   99:aconst_null     
	//   55  100:astore          4
		break MISSING_BLOCK_LABEL_115;
	//   56  102:goto            115
		obj;
	//   57  105:astore          4
		com/google/android/gms/dynamite/DynamiteModule;
	//   58  107:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   59  109:monitorexit     
		context = ((Context) (s));
	//   60  110:aload_1         
	//   61  111:astore_0        
		throw obj;
	//   62  112:aload           4
	//   63  114:athrow          
		if(obj != null)
	//*  64  115:aload           4
	//*  65  117:ifnull          127
			((Cursor) (obj)).close();
	//   66  120:aload           4
	//   67  122:invokeinterface #342 <Method void Cursor.close()>
		return i;
	//   68  127:iload_3         
	//   69  128:ireturn         
		context = ((Context) (s));
	//   70  129:aload_1         
	//   71  130:astore_0        
		Log.w("DynamiteModule", "Failed to retrieve remote module version.");
	//   72  131:ldc1            #181 <String "DynamiteModule">
	//   73  133:ldc2            #473 <String "Failed to retrieve remote module version.">
	//   74  136:invokestatic    #210 <Method int Log.w(String, String)>
	//   75  139:pop             
		context = ((Context) (s));
	//   76  140:aload_1         
	//   77  141:astore_0        
		throw new LoadingException("Failed to connect to dynamite module ContentResolver.", ((com.google.android.gms.dynamite.zza) (null)));
	//   78  142:new             #9   <Class DynamiteModule$LoadingException>
	//   79  145:dup             
	//   80  146:ldc2            #475 <String "Failed to connect to dynamite module ContentResolver.">
	//   81  149:aconst_null     
	//   82  150:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//   83  153:athrow          
		Exception exception;
		exception;
	//   84  154:astore          4
		break MISSING_BLOCK_LABEL_169;
	//   85  156:goto            169
		s;
	//   86  159:astore_1        
		context = null;
	//   87  160:aconst_null     
	//   88  161:astore_0        
		break MISSING_BLOCK_LABEL_201;
	//   89  162:goto            201
		exception;
	//   90  165:astore          4
		s = null;
	//   91  167:aconst_null     
	//   92  168:astore_1        
		context = ((Context) (s));
	//   93  169:aload_1         
	//   94  170:astore_0        
		if(!(exception instanceof LoadingException))
			break MISSING_BLOCK_LABEL_184;
	//   95  171:aload           4
	//   96  173:instanceof      #9   <Class DynamiteModule$LoadingException>
	//   97  176:ifeq            184
		context = ((Context) (s));
	//   98  179:aload_1         
	//   99  180:astore_0        
		throw exception;
	//  100  181:aload           4
	//  101  183:athrow          
		context = ((Context) (s));
	//  102  184:aload_1         
	//  103  185:astore_0        
		throw new LoadingException("V2 version check failed", ((Throwable) (exception)), ((com.google.android.gms.dynamite.zza) (null)));
	//  104  186:new             #9   <Class DynamiteModule$LoadingException>
	//  105  189:dup             
	//  106  190:ldc2            #477 <String "V2 version check failed">
	//  107  193:aload           4
	//  108  195:aconst_null     
	//  109  196:invokespecial   #355 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//  110  199:athrow          
		s;
	//  111  200:astore_1        
		if(context != null)
	//* 112  201:aload_0         
	//* 113  202:ifnull          211
			((Cursor) (context)).close();
	//  114  205:aload_0         
	//  115  206:invokeinterface #342 <Method void Cursor.close()>
		throw s;
	//  116  211:aload_1         
	//  117  212:athrow          
	}

	private static DynamiteModule zzb(Context context, String s, int i)
		throws LoadingException
	{
		Object obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 51)));
	//    0    0:new             #123 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #129 <Method String String.valueOf(Object)>
	//    4    8:invokevirtual   #133 <Method int String.length()>
	//    5   11:bipush          51
	//    6   13:iadd            
	//    7   14:invokespecial   #136 <Method void StringBuilder(int)>
	//    8   17:astore_3        
		((StringBuilder) (obj)).append("Selected remote version of ");
	//    9   18:aload_3         
	//   10   19:ldc2            #479 <String "Selected remote version of ">
	//   11   22:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		((StringBuilder) (obj)).append(s);
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		((StringBuilder) (obj)).append(", version >= ");
	//   17   32:aload_3         
	//   18   33:ldc2            #481 <String ", version >= ">
	//   19   36:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		((StringBuilder) (obj)).append(i);
	//   21   40:aload_3         
	//   22   41:iload_2         
	//   23   42:invokevirtual   #321 <Method StringBuilder StringBuilder.append(int)>
	//   24   45:pop             
		Log.i("DynamiteModule", ((StringBuilder) (obj)).toString());
	//   25   46:ldc1            #181 <String "DynamiteModule">
	//   26   48:aload_3         
	//   27   49:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #326 <Method int Log.i(String, String)>
	//   29   55:pop             
		obj = ((Object) (zzg(context)));
	//   30   56:aload_0         
	//   31   57:invokestatic    #397 <Method IDynamiteLoader zzg(Context)>
	//   32   60:astore_3        
		if(obj != null)
	//*  33   61:aload_3         
	//*  34   62:ifnull          126
		{
			try
			{
				context = ((Context) (((IDynamiteLoader) (obj)).createModuleContext(ObjectWrapper.wrap(((Object) (context))), s, i)));
	//   35   65:aload_3         
	//   36   66:aload_0         
	//   37   67:invokestatic    #403 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   38   70:aload_1         
	//   39   71:iload_2         
	//   40   72:invokeinterface #485 <Method com.google.android.gms.dynamic.IObjectWrapper IDynamiteLoader.createModuleContext(com.google.android.gms.dynamic.IObjectWrapper, String, int)>
	//   41   77:astore_0        
			}
	//*  42   78:aload_0         
	//*  43   79:invokestatic    #421 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  44   82:ifnull          100
	//*  45   85:new             #2   <Class DynamiteModule>
	//*  46   88:dup             
	//*  47   89:aload_0         
	//*  48   90:invokestatic    #421 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  49   93:checkcast       #105 <Class Context>
	//*  50   96:invokespecial   #487 <Method void DynamiteModule(Context)>
	//*  51   99:areturn         
	//*  52  100:new             #9   <Class DynamiteModule$LoadingException>
	//*  53  103:dup             
	//*  54  104:ldc2            #489 <String "Failed to load remote module.">
	//*  55  107:aconst_null     
	//*  56  108:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//*  57  111:athrow          
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  58  112:astore_0        
			{
				throw new LoadingException("Failed to load remote module.", ((Throwable) (context)), ((com.google.android.gms.dynamite.zza) (null)));
	//   59  113:new             #9   <Class DynamiteModule$LoadingException>
	//   60  116:dup             
	//   61  117:ldc2            #489 <String "Failed to load remote module.">
	//   62  120:aload_0         
	//   63  121:aconst_null     
	//   64  122:invokespecial   #355 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//   65  125:athrow          
			}
			if(ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (context))) != null)
				return new DynamiteModule((Context)ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (context))));
			else
				throw new LoadingException("Failed to load remote module.", ((com.google.android.gms.dynamite.zza) (null)));
		} else
		{
			throw new LoadingException("Failed to create IDynamiteLoader.", ((com.google.android.gms.dynamite.zza) (null)));
	//   66  126:new             #9   <Class DynamiteModule$LoadingException>
	//   67  129:dup             
	//   68  130:ldc2            #491 <String "Failed to create IDynamiteLoader.">
	//   69  133:aconst_null     
	//   70  134:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//   71  137:athrow          
		}
	}

	private static DynamiteModule zzc(Context context, String s, int i)
		throws LoadingException
	{
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 51);
	//    0    0:new             #123 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #129 <Method String String.valueOf(Object)>
	//    4    8:invokevirtual   #133 <Method int String.length()>
	//    5   11:bipush          51
	//    6   13:iadd            
	//    7   14:invokespecial   #136 <Method void StringBuilder(int)>
	//    8   17:astore_3        
		stringbuilder.append("Selected remote version of ");
	//    9   18:aload_3         
	//   10   19:ldc2            #479 <String "Selected remote version of ">
	//   11   22:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(s);
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		stringbuilder.append(", version >= ");
	//   17   32:aload_3         
	//   18   33:ldc2            #481 <String ", version >= ">
	//   19   36:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		stringbuilder.append(i);
	//   21   40:aload_3         
	//   22   41:iload_2         
	//   23   42:invokevirtual   #321 <Method StringBuilder StringBuilder.append(int)>
	//   24   45:pop             
		Log.i("DynamiteModule", stringbuilder.toString());
	//   25   46:ldc1            #181 <String "DynamiteModule">
	//   26   48:aload_3         
	//   27   49:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #326 <Method int Log.i(String, String)>
	//   29   55:pop             
		com/google/android/gms/dynamite/DynamiteModule;
	//   30   56:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//   31   58:monitorenter    
		IDynamiteLoaderV2 idynamiteloaderv2 = zzabt;
	//   32   59:getstatic       #386 <Field IDynamiteLoaderV2 zzabt>
	//   33   62:astore_3        
		com/google/android/gms/dynamite/DynamiteModule;
	//   34   63:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   35   65:monitorexit     
		if(idynamiteloaderv2 != null)
	//*  36   66:aload_3         
	//*  37   67:ifnull          147
		{
			zza zza1 = (zza)zzabv.get();
	//   38   70:getstatic       #59  <Field ThreadLocal zzabv>
	//   39   73:invokevirtual   #297 <Method Object ThreadLocal.get()>
	//   40   76:checkcast       #21  <Class DynamiteModule$zza>
	//   41   79:astore          4
			if(zza1 != null && zza1.zzaby != null)
	//*  42   81:aload           4
	//*  43   83:ifnull          135
	//*  44   86:aload           4
	//*  45   88:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//*  46   91:ifnull          135
			{
				context = zza(context.getApplicationContext(), s, i, zza1.zzaby, idynamiteloaderv2);
	//   47   94:aload_0         
	//   48   95:invokevirtual   #117 <Method Context Context.getApplicationContext()>
	//   49   98:aload_1         
	//   50   99:iload_2         
	//   51  100:aload           4
	//   52  102:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//   53  105:aload_3         
	//   54  106:invokestatic    #493 <Method Context zza(Context, String, int, Cursor, IDynamiteLoaderV2)>
	//   55  109:astore_0        
				if(context != null)
	//*  56  110:aload_0         
	//*  57  111:ifnull          123
					return new DynamiteModule(context);
	//   58  114:new             #2   <Class DynamiteModule>
	//   59  117:dup             
	//   60  118:aload_0         
	//   61  119:invokespecial   #487 <Method void DynamiteModule(Context)>
	//   62  122:areturn         
				else
					throw new LoadingException("Failed to get module context", ((com.google.android.gms.dynamite.zza) (null)));
	//   63  123:new             #9   <Class DynamiteModule$LoadingException>
	//   64  126:dup             
	//   65  127:ldc2            #495 <String "Failed to get module context">
	//   66  130:aconst_null     
	//   67  131:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//   68  134:athrow          
			} else
			{
				throw new LoadingException("No result cursor", ((com.google.android.gms.dynamite.zza) (null)));
	//   69  135:new             #9   <Class DynamiteModule$LoadingException>
	//   70  138:dup             
	//   71  139:ldc2            #497 <String "No result cursor">
	//   72  142:aconst_null     
	//   73  143:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//   74  146:athrow          
			}
		} else
		{
			throw new LoadingException("DynamiteLoaderV2 was not cached.", ((com.google.android.gms.dynamite.zza) (null)));
	//   75  147:new             #9   <Class DynamiteModule$LoadingException>
	//   76  150:dup             
	//   77  151:ldc2            #499 <String "DynamiteLoaderV2 was not cached.">
	//   78  154:aconst_null     
	//   79  155:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//   80  158:athrow          
		}
		context;
	//   81  159:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   82  160:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   83  162:monitorexit     
		throw context;
	//   84  163:aload_0         
	//   85  164:athrow          
	}

	private static DynamiteModule zzd(Context context, String s)
	{
		s = String.valueOf(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #129 <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		if(s.length() != 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #133 <Method int String.length()>
	//*   5    9:ifeq            23
			s = "Selected local version of ".concat(s);
	//    6   12:ldc2            #501 <String "Selected local version of ">
	//    7   15:aload_1         
	//    8   16:invokevirtual   #200 <Method String String.concat(String)>
	//    9   19:astore_1        
		else
	//*  10   20:goto            34
			s = new String("Selected local version of ");
	//   11   23:new             #125 <Class String>
	//   12   26:dup             
	//   13   27:ldc2            #501 <String "Selected local version of ">
	//   14   30:invokespecial   #203 <Method void String(String)>
	//   15   33:astore_1        
		Log.i("DynamiteModule", s);
	//   16   34:ldc1            #181 <String "DynamiteModule">
	//   17   36:aload_1         
	//   18   37:invokestatic    #326 <Method int Log.i(String, String)>
	//   19   40:pop             
		return new DynamiteModule(context.getApplicationContext());
	//   20   41:new             #2   <Class DynamiteModule>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokevirtual   #117 <Method Context Context.getApplicationContext()>
	//   24   49:invokespecial   #487 <Method void DynamiteModule(Context)>
	//   25   52:areturn         
	}

	private static IDynamiteLoader zzg(Context context)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzabs == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    3:getstatic       #384 <Field IDynamiteLoader zzabs>
	//    3    6:ifnull          18
		context = ((Context) (zzabs));
	//    4    9:getstatic       #384 <Field IDynamiteLoader zzabs>
	//    5   12:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//    6   13:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    7   15:monitorexit     
		return ((IDynamiteLoader) (context));
	//    8   16:aload_0         
	//    9   17:areturn         
		if(GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0)
			break MISSING_BLOCK_LABEL_33;
	//   10   18:invokestatic    #507 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #511 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context)>
	//   13   25:ifeq            33
		com/google/android/gms/dynamite/DynamiteModule;
	//   14   28:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   15   30:monitorexit     
		return null;
	//   16   31:aconst_null     
	//   17   32:areturn         
		context = ((Context) (IDynamiteLoader.Stub.asInterface((IBinder)context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance())));
	//   18   33:aload_0         
	//   19   34:ldc2            #257 <String "com.google.android.gms">
	//   20   37:iconst_3        
	//   21   38:invokevirtual   #515 <Method Context Context.createPackageContext(String, int)>
	//   22   41:invokevirtual   #121 <Method ClassLoader Context.getClassLoader()>
	//   23   44:ldc2            #517 <String "com.google.android.gms.chimera.container.DynamiteLoaderImpl">
	//   24   47:invokevirtual   #154 <Method Class ClassLoader.loadClass(String)>
	//   25   50:invokevirtual   #519 <Method Object Class.newInstance()>
	//   26   53:checkcast       #451 <Class IBinder>
	//   27   56:invokestatic    #524 <Method IDynamiteLoader IDynamiteLoader$Stub.asInterface(IBinder)>
	//   28   59:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_118;
	//   29   60:aload_0         
	//   30   61:ifnull          118
		zzabs = ((IDynamiteLoader) (context));
	//   31   64:aload_0         
	//   32   65:putstatic       #384 <Field IDynamiteLoader zzabs>
		com/google/android/gms/dynamite/DynamiteModule;
	//   33   68:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   34   70:monitorexit     
		return ((IDynamiteLoader) (context));
	//   35   71:aload_0         
	//   36   72:areturn         
		context;
	//   37   73:astore_0        
		context = ((Context) (String.valueOf(((Object) (((Exception) (context)).getMessage())))));
	//   38   74:aload_0         
	//   39   75:invokevirtual   #194 <Method String Exception.getMessage()>
	//   40   78:invokestatic    #129 <Method String String.valueOf(Object)>
	//   41   81:astore_0        
		if(((String) (context)).length() != 0)
	//*  42   82:aload_0         
	//*  43   83:invokevirtual   #133 <Method int String.length()>
	//*  44   86:ifeq            100
		{
			context = ((Context) ("Failed to load IDynamiteLoader from GmsCore: ".concat(((String) (context)))));
	//   45   89:ldc2            #526 <String "Failed to load IDynamiteLoader from GmsCore: ">
	//   46   92:aload_0         
	//   47   93:invokevirtual   #200 <Method String String.concat(String)>
	//   48   96:astore_0        
			break MISSING_BLOCK_LABEL_111;
	//   49   97:goto            111
		}
		context = ((Context) (new String("Failed to load IDynamiteLoader from GmsCore: ")));
	//   50  100:new             #125 <Class String>
	//   51  103:dup             
	//   52  104:ldc2            #526 <String "Failed to load IDynamiteLoader from GmsCore: ">
	//   53  107:invokespecial   #203 <Method void String(String)>
	//   54  110:astore_0        
		Log.e("DynamiteModule", ((String) (context)));
	//   55  111:ldc1            #181 <String "DynamiteModule">
	//   56  113:aload_0         
	//   57  114:invokestatic    #187 <Method int Log.e(String, String)>
	//   58  117:pop             
		com/google/android/gms/dynamite/DynamiteModule;
	//   59  118:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   60  120:monitorexit     
		return null;
	//   61  121:aconst_null     
	//   62  122:areturn         
		context;
	//   63  123:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   64  124:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   65  126:monitorexit     
		throw context;
	//   66  127:aload_0         
	//   67  128:athrow          
	}

	public final Context getModuleContext()
	{
		return zzabx;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Context zzabx>
	//    2    4:areturn         
	}

	public final IBinder instantiate(String s)
		throws LoadingException
	{
		IBinder ibinder = (IBinder)zzabx.getClassLoader().loadClass(s).newInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Context zzabx>
	//    2    4:invokevirtual   #121 <Method ClassLoader Context.getClassLoader()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #154 <Method Class ClassLoader.loadClass(String)>
	//    5   11:invokevirtual   #519 <Method Object Class.newInstance()>
	//    6   14:checkcast       #451 <Class IBinder>
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
	//   16   30:invokestatic    #129 <Method String String.valueOf(Object)>
	//   17   33:astore_1        
		if(s.length() != 0)
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #133 <Method int String.length()>
	//*  20   38:ifeq            52
			s = "Failed to instantiate module class: ".concat(s);
	//   21   41:ldc2            #531 <String "Failed to instantiate module class: ">
	//   22   44:aload_1         
	//   23   45:invokevirtual   #200 <Method String String.concat(String)>
	//   24   48:astore_1        
		else
	//*  25   49:goto            63
			s = new String("Failed to instantiate module class: ");
	//   26   52:new             #125 <Class String>
	//   27   55:dup             
	//   28   56:ldc2            #531 <String "Failed to instantiate module class: ">
	//   29   59:invokespecial   #203 <Method void String(String)>
	//   30   62:astore_1        
		throw new LoadingException(s, ((Throwable) (obj)), ((com.google.android.gms.dynamite.zza) (null)));
	//   31   63:new             #9   <Class DynamiteModule$LoadingException>
	//   32   66:dup             
	//   33   67:aload_1         
	//   34   68:aload_2         
	//   35   69:aconst_null     
	//   36   70:invokespecial   #355 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//   37   73:athrow          
	}

	public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzd();
	public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zze();
	public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzf();
	public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION_NO_FORCE_STAGING = new zzg();
	public static final VersionPolicy PREFER_LOCAL = new zzc();
	public static final VersionPolicy PREFER_REMOTE = new com.google.android.gms.dynamite.zzb();
	private static Boolean zzabr;
	private static IDynamiteLoader zzabs;
	private static IDynamiteLoaderV2 zzabt;
	private static String zzabu;
	private static final ThreadLocal zzabv = new ThreadLocal();
	private static final VersionPolicy.IVersions zzabw = new com.google.android.gms.dynamite.zza();
	private final Context zzabx;

	static 
	{
	//    0    0:new             #54  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void ThreadLocal()>
	//    3    7:putstatic       #59  <Field ThreadLocal zzabv>
	//    4   10:new             #61  <Class zza>
	//    5   13:dup             
	//    6   14:invokespecial   #62  <Method void zza()>
	//    7   17:putstatic       #64  <Field DynamiteModule$VersionPolicy$IVersions zzabw>
	//    8   20:new             #66  <Class zzb>
	//    9   23:dup             
	//   10   24:invokespecial   #67  <Method void zzb()>
	//   11   27:putstatic       #69  <Field DynamiteModule$VersionPolicy PREFER_REMOTE>
	//   12   30:new             #71  <Class zzc>
	//   13   33:dup             
	//   14   34:invokespecial   #72  <Method void zzc()>
	//   15   37:putstatic       #74  <Field DynamiteModule$VersionPolicy PREFER_LOCAL>
	//   16   40:new             #76  <Class zzd>
	//   17   43:dup             
	//   18   44:invokespecial   #77  <Method void zzd()>
	//   19   47:putstatic       #79  <Field DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION>
	//   20   50:new             #81  <Class zze>
	//   21   53:dup             
	//   22   54:invokespecial   #82  <Method void zze()>
	//   23   57:putstatic       #84  <Field DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING>
	//   24   60:new             #86  <Class zzf>
	//   25   63:dup             
	//   26   64:invokespecial   #87  <Method void zzf()>
	//   27   67:putstatic       #89  <Field DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION>
	//   28   70:new             #91  <Class zzg>
	//   29   73:dup             
	//   30   74:invokespecial   #92  <Method void zzg()>
	//   31   77:putstatic       #94  <Field DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION_NO_FORCE_STAGING>
	//*  32   80:return          
	}
}
