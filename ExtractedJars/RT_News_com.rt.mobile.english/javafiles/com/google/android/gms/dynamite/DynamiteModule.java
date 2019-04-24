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
		obj = ((Object) (new StringBuilder(61 + String.valueOf(((Object) (s))).length())));
	//    4    8:new             #123 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:bipush          61
	//    7   14:aload_1         
	//    8   15:invokestatic    #129 <Method String String.valueOf(Object)>
	//    9   18:invokevirtual   #133 <Method int String.length()>
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
		obj = ((Object) (new StringBuilder(51 + String.valueOf(((Object) (context))).length() + String.valueOf(((Object) (s))).length())));
	//   49   90:new             #123 <Class StringBuilder>
	//   50   93:dup             
	//   51   94:bipush          51
	//   52   96:aload_0         
	//   53   97:invokestatic    #129 <Method String String.valueOf(Object)>
	//   54  100:invokevirtual   #133 <Method int String.length()>
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
	//* 121  218:bipush          45
	//* 122  220:aload_1         
	//* 123  221:invokestatic    #129 <Method String String.valueOf(Object)>
	//* 124  224:invokevirtual   #133 <Method int String.length()>
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
			context = ((Context) (new StringBuilder(45 + String.valueOf(((Object) (s))).length())));
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
		StringBuilder stringbuilder = new StringBuilder(42 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s))).length());
	//    7   13:new             #123 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:bipush          42
	//   10   19:aload_2         
	//   11   20:invokestatic    #129 <Method String String.valueOf(Object)>
	//   12   23:invokevirtual   #133 <Method int String.length()>
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
	//    7   14:ifnonnull       287
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
	//*  94  209:goto            282
	//*  95  212:astore          4
	//*  96  214:aload           5
	//*  97  216:monitorexit     
	//*  98  217:aload           4
	//*  99  219:athrow          
	//* 100  220:astore          4
	//* 101  222:aload           4
	//* 102  224:invokestatic    #129 <Method String String.valueOf(Object)>
	//* 103  227:astore          4
	//* 104  229:new             #123 <Class StringBuilder>
	//* 105  232:dup             
	//* 106  233:bipush          30
	//* 107  235:aload           4
	//* 108  237:invokestatic    #129 <Method String String.valueOf(Object)>
	//* 109  240:invokevirtual   #133 <Method int String.length()>
	//* 110  243:iadd            
	//* 111  244:invokespecial   #136 <Method void StringBuilder(int)>
	//* 112  247:astore          5
	//* 113  249:aload           5
	//* 114  251:ldc2            #280 <String "Failed to load module via V2: ">
	//* 115  254:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//* 116  257:pop             
	//* 117  258:aload           5
	//* 118  260:aload           4
	//* 119  262:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//* 120  265:pop             
	//* 121  266:ldc1            #181 <String "DynamiteModule">
	//* 122  268:aload           5
	//* 123  270:invokevirtual   #148 <Method String StringBuilder.toString()>
	//* 124  273:invokestatic    #210 <Method int Log.w(String, String)>
	//* 125  276:pop             
	//* 126  277:getstatic       #249 <Field Boolean Boolean.FALSE>
	//* 127  280:astore          4
	//* 128  282:aload           4
	//* 129  284:putstatic       #236 <Field Boolean zzabr>
	//* 130  287:ldc1            #2   <Class DynamiteModule>
	//* 131  289:monitorexit     
	//* 132  290:aload           4
	//* 133  292:invokevirtual   #283 <Method boolean Boolean.booleanValue()>
	//* 134  295:ifeq            354
	//* 135  298:aload_0         
	//* 136  299:aload_1         
	//* 137  300:iload_2         
	//* 138  301:invokestatic    #267 <Method int zzb(Context, String, boolean)>
	//* 139  304:istore_3        
	//* 140  305:iload_3         
	//* 141  306:ireturn         
	//* 142  307:astore_0        
	//* 143  308:aload_0         
	//* 144  309:invokevirtual   #284 <Method String DynamiteModule$LoadingException.getMessage()>
	//* 145  312:invokestatic    #129 <Method String String.valueOf(Object)>
	//* 146  315:astore_0        
	//* 147  316:aload_0         
	//* 148  317:invokevirtual   #133 <Method int String.length()>
	//* 149  320:ifeq            334
	//* 150  323:ldc2            #286 <String "Failed to retrieve remote module version: ">
	//* 151  326:aload_0         
	//* 152  327:invokevirtual   #200 <Method String String.concat(String)>
	//* 153  330:astore_0        
	//* 154  331:goto            345
	//* 155  334:new             #125 <Class String>
	//* 156  337:dup             
	//* 157  338:ldc2            #286 <String "Failed to retrieve remote module version: ">
	//* 158  341:invokespecial   #203 <Method void String(String)>
	//* 159  344:astore_0        
	//* 160  345:ldc1            #181 <String "DynamiteModule">
	//* 161  347:aload_0         
	//* 162  348:invokestatic    #210 <Method int Log.w(String, String)>
	//* 163  351:pop             
	//* 164  352:iconst_0        
	//* 165  353:ireturn         
	//* 166  354:aload_0         
	//* 167  355:aload_1         
	//* 168  356:iload_2         
	//* 169  357:invokestatic    #288 <Method int zza(Context, String, boolean)>
	//* 170  360:ireturn         
	//* 171  361:astore_0        
	//* 172  362:ldc1            #2   <Class DynamiteModule>
	//* 173  364:monitorexit     
	//* 174  365:aload_0         
	//* 175  366:athrow          
		catch(LoadingException loadingexception) { }
	//  176  367:astore          4
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
		break MISSING_BLOCK_LABEL_282;
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
		StringBuilder stringbuilder = new StringBuilder(30 + String.valueOf(obj).length());
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
	//* 177  369:goto            83
		LoadingException loadingexception1;
		loadingexception1;
	//  178  372:astore          6
		  goto _L8
	//* 179  374:goto            194
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
		StringBuilder stringbuilder = new StringBuilder(68 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s))).length());
	//   24   55:new             #123 <Class StringBuilder>
	//   25   58:dup             
	//   26   59:bipush          68
	//   27   61:aload_2         
	//   28   62:invokestatic    #129 <Method String String.valueOf(Object)>
	//   29   65:invokevirtual   #133 <Method int String.length()>
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
	//*  74  158:aload           8
	//*  75  160:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//*  76  163:ifeq            469
	//*  77  166:aload           8
	//*  78  168:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//*  79  171:iconst_m1       
	//*  80  172:icmpne          183
	//*  81  175:aload           8
	//*  82  177:getfield        #311 <Field int DynamiteModule$VersionPolicy$SelectionResult.localVersion>
	//*  83  180:ifeq            469
	//*  84  183:aload           8
	//*  85  185:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//*  86  188:iconst_1        
	//*  87  189:icmpne          203
	//*  88  192:aload           8
	//*  89  194:getfield        #314 <Field int DynamiteModule$VersionPolicy$SelectionResult.remoteVersion>
	//*  90  197:ifne            203
			break MISSING_BLOCK_LABEL_469;
	//   91  200:goto            469
		if(selectionresult.selection != -1) goto _L2; else goto _L1
	//   92  203:aload           8
	//   93  205:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//   94  208:iconst_m1       
	//   95  209:icmpne          250
_L1:
		versionpolicy = ((VersionPolicy) (zzd(context, s)));
	//   96  212:aload_0         
	//   97  213:aload_2         
	//   98  214:invokestatic    #333 <Method DynamiteModule zzd(Context, String)>
	//   99  217:astore_1        
		context = ((Context) (versionpolicy));
	//  100  218:aload_1         
	//  101  219:astore_0        
		if(zza2.zzaby == null) goto _L4; else goto _L3
	//  102  220:aload           7
	//  103  222:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//  104  225:ifnull          240
_L3:
		context = ((Context) (versionpolicy));
	//  105  228:aload_1         
	//  106  229:astore_0        
_L7:
		zza2.zzaby.close();
	//  107  230:aload           7
	//  108  232:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//  109  235:invokeinterface #342 <Method void Cursor.close()>
_L4:
		zzabv.set(((Object) (zza1)));
	//  110  240:getstatic       #59  <Field ThreadLocal zzabv>
	//  111  243:aload           6
	//  112  245:invokevirtual   #303 <Method void ThreadLocal.set(Object)>
		return ((DynamiteModule) (context));
	//  113  248:aload_0         
	//  114  249:areturn         
_L2:
		int j = selectionresult.selection;
	//  115  250:aload           8
	//  116  252:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//  117  255:istore_3        
		if(j != 1)
			break MISSING_BLOCK_LABEL_426;
	//  118  256:iload_3         
	//  119  257:iconst_1        
	//  120  258:icmpne          426
		Object obj = ((Object) (zza(context, s, selectionresult.remoteVersion)));
	//  121  261:aload_0         
	//  122  262:aload_2         
	//  123  263:aload           8
	//  124  265:getfield        #314 <Field int DynamiteModule$VersionPolicy$SelectionResult.remoteVersion>
	//  125  268:invokestatic    #345 <Method DynamiteModule zza(Context, String, int)>
	//  126  271:astore          5
		if(zza2.zzaby != null)
	//* 127  273:aload           7
	//* 128  275:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//* 129  278:ifnull          291
			zza2.zzaby.close();
	//  130  281:aload           7
	//  131  283:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//  132  286:invokeinterface #342 <Method void Cursor.close()>
		zzabv.set(((Object) (zza1)));
	//  133  291:getstatic       #59  <Field ThreadLocal zzabv>
	//  134  294:aload           6
	//  135  296:invokevirtual   #303 <Method void ThreadLocal.set(Object)>
		return ((DynamiteModule) (obj));
	//  136  299:aload           5
	//  137  301:areturn         
		LoadingException loadingexception;
		loadingexception;
	//  138  302:astore          9
		obj = ((Object) (String.valueOf(((Object) (loadingexception.getMessage())))));
	//  139  304:aload           9
	//  140  306:invokevirtual   #284 <Method String DynamiteModule$LoadingException.getMessage()>
	//  141  309:invokestatic    #129 <Method String String.valueOf(Object)>
	//  142  312:astore          5
		if(((String) (obj)).length() != 0)
	//* 143  314:aload           5
	//* 144  316:invokevirtual   #133 <Method int String.length()>
	//* 145  319:ifeq            335
		{
			obj = ((Object) ("Failed to load remote module: ".concat(((String) (obj)))));
	//  146  322:ldc2            #347 <String "Failed to load remote module: ">
	//  147  325:aload           5
	//  148  327:invokevirtual   #200 <Method String String.concat(String)>
	//  149  330:astore          5
			break MISSING_BLOCK_LABEL_347;
	//  150  332:goto            347
		}
		obj = ((Object) (new String("Failed to load remote module: ")));
	//  151  335:new             #125 <Class String>
	//  152  338:dup             
	//  153  339:ldc2            #347 <String "Failed to load remote module: ">
	//  154  342:invokespecial   #203 <Method void String(String)>
	//  155  345:astore          5
		Log.w("DynamiteModule", ((String) (obj)));
	//  156  347:ldc1            #181 <String "DynamiteModule">
	//  157  349:aload           5
	//  158  351:invokestatic    #210 <Method int Log.w(String, String)>
	//  159  354:pop             
		if(selectionresult.localVersion == 0 || versionpolicy.selectModule(context, s, ((VersionPolicy.IVersions) (new zzb(selectionresult.localVersion, 0)))).selection != -1)
			break; /* Loop/switch isn't completed */
	//  160  355:aload           8
	//  161  357:getfield        #311 <Field int DynamiteModule$VersionPolicy$SelectionResult.localVersion>
	//  162  360:ifeq            412
	//  163  363:aload_1         
	//  164  364:aload_0         
	//  165  365:aload_2         
	//  166  366:new             #24  <Class DynamiteModule$zzb>
	//  167  369:dup             
	//  168  370:aload           8
	//  169  372:getfield        #311 <Field int DynamiteModule$VersionPolicy$SelectionResult.localVersion>
	//  170  375:iconst_0        
	//  171  376:invokespecial   #350 <Method void DynamiteModule$zzb(int, int)>
	//  172  379:invokeinterface #307 <Method DynamiteModule$VersionPolicy$SelectionResult DynamiteModule$VersionPolicy.selectModule(Context, String, DynamiteModule$VersionPolicy$IVersions)>
	//  173  384:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//  174  387:iconst_m1       
	//  175  388:icmpne          412
		versionpolicy = ((VersionPolicy) (zzd(context, s)));
	//  176  391:aload_0         
	//  177  392:aload_2         
	//  178  393:invokestatic    #333 <Method DynamiteModule zzd(Context, String)>
	//  179  396:astore_1        
		context = ((Context) (versionpolicy));
	//  180  397:aload_1         
	//  181  398:astore_0        
		if(zza2.zzaby == null) goto _L4; else goto _L5
	//  182  399:aload           7
	//  183  401:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//  184  404:ifnull          240
_L5:
		context = ((Context) (versionpolicy));
	//  185  407:aload_1         
	//  186  408:astore_0        
		if(true) goto _L7; else goto _L6
	//  187  409:goto            230
_L6:
		throw new LoadingException("Remote load failed. No local fallback found.", ((Throwable) (loadingexception)), ((com.google.android.gms.dynamite.zza) (null)));
	//  188  412:new             #9   <Class DynamiteModule$LoadingException>
	//  189  415:dup             
	//  190  416:ldc2            #352 <String "Remote load failed. No local fallback found.">
	//  191  419:aload           9
	//  192  421:aconst_null     
	//  193  422:invokespecial   #355 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//  194  425:athrow          
		int k = selectionresult.selection;
	//  195  426:aload           8
	//  196  428:getfield        #329 <Field int DynamiteModule$VersionPolicy$SelectionResult.selection>
	//  197  431:istore_3        
		context = ((Context) (new StringBuilder(47)));
	//  198  432:new             #123 <Class StringBuilder>
	//  199  435:dup             
	//  200  436:bipush          47
	//  201  438:invokespecial   #136 <Method void StringBuilder(int)>
	//  202  441:astore_0        
		((StringBuilder) (context)).append("VersionPolicy returned invalid code:");
	//  203  442:aload_0         
	//  204  443:ldc2            #357 <String "VersionPolicy returned invalid code:">
	//  205  446:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  206  449:pop             
		((StringBuilder) (context)).append(k);
	//  207  450:aload_0         
	//  208  451:iload_3         
	//  209  452:invokevirtual   #321 <Method StringBuilder StringBuilder.append(int)>
	//  210  455:pop             
		throw new LoadingException(((StringBuilder) (context)).toString(), ((com.google.android.gms.dynamite.zza) (null)));
	//  211  456:new             #9   <Class DynamiteModule$LoadingException>
	//  212  459:dup             
	//  213  460:aload_0         
	//  214  461:invokevirtual   #148 <Method String StringBuilder.toString()>
	//  215  464:aconst_null     
	//  216  465:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//  217  468:athrow          
		int l = selectionresult.localVersion;
	//  218  469:aload           8
	//  219  471:getfield        #311 <Field int DynamiteModule$VersionPolicy$SelectionResult.localVersion>
	//  220  474:istore_3        
		int j1 = selectionresult.remoteVersion;
	//  221  475:aload           8
	//  222  477:getfield        #314 <Field int DynamiteModule$VersionPolicy$SelectionResult.remoteVersion>
	//  223  480:istore          4
		context = ((Context) (new StringBuilder(91)));
	//  224  482:new             #123 <Class StringBuilder>
	//  225  485:dup             
	//  226  486:bipush          91
	//  227  488:invokespecial   #136 <Method void StringBuilder(int)>
	//  228  491:astore_0        
		((StringBuilder) (context)).append("No acceptable module found. Local version is ");
	//  229  492:aload_0         
	//  230  493:ldc2            #362 <String "No acceptable module found. Local version is ">
	//  231  496:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  232  499:pop             
		((StringBuilder) (context)).append(l);
	//  233  500:aload_0         
	//  234  501:iload_3         
	//  235  502:invokevirtual   #321 <Method StringBuilder StringBuilder.append(int)>
	//  236  505:pop             
		((StringBuilder) (context)).append(" and remote version is ");
	//  237  506:aload_0         
	//  238  507:ldc2            #364 <String " and remote version is ">
	//  239  510:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  240  513:pop             
		((StringBuilder) (context)).append(j1);
	//  241  514:aload_0         
	//  242  515:iload           4
	//  243  517:invokevirtual   #321 <Method StringBuilder StringBuilder.append(int)>
	//  244  520:pop             
		((StringBuilder) (context)).append(".");
	//  245  521:aload_0         
	//  246  522:ldc2            #366 <String ".">
	//  247  525:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  248  528:pop             
		throw new LoadingException(((StringBuilder) (context)).toString(), ((com.google.android.gms.dynamite.zza) (null)));
	//  249  529:new             #9   <Class DynamiteModule$LoadingException>
	//  250  532:dup             
	//  251  533:aload_0         
	//  252  534:invokevirtual   #148 <Method String StringBuilder.toString()>
	//  253  537:aconst_null     
	//  254  538:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//  255  541:athrow          
		context;
	//  256  542:astore_0        
		if(zza2.zzaby != null)
	//* 257  543:aload           7
	//* 258  545:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//* 259  548:ifnull          561
			zza2.zzaby.close();
	//  260  551:aload           7
	//  261  553:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//  262  556:invokeinterface #342 <Method void Cursor.close()>
		zzabv.set(((Object) (zza1)));
	//  263  561:getstatic       #59  <Field ThreadLocal zzabv>
	//  264  564:aload           6
	//  265  566:invokevirtual   #303 <Method void ThreadLocal.set(Object)>
		throw context;
	//  266  569:aload_0         
	//  267  570:athrow          
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
		if(boolean1 == null)
	//*   6   10:aload_3         
	//*   7   11:ifnonnull       26
			throw new LoadingException("Failed to determine which loading route to use.", ((com.google.android.gms.dynamite.zza) (null)));
	//    8   14:new             #9   <Class DynamiteModule$LoadingException>
	//    9   17:dup             
	//   10   18:ldc2            #426 <String "Failed to determine which loading route to use.">
	//   11   21:aconst_null     
	//   12   22:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//   13   25:athrow          
		if(boolean1.booleanValue())
	//*  14   26:aload_3         
	//*  15   27:invokevirtual   #283 <Method boolean Boolean.booleanValue()>
	//*  16   30:ifeq            40
			return zzc(context, s, i);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:iload_2         
	//   20   36:invokestatic    #429 <Method DynamiteModule zzc(Context, String, int)>
	//   21   39:areturn         
		else
			return zzb(context, s, i);
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:iload_2         
	//   25   43:invokestatic    #431 <Method DynamiteModule zzb(Context, String, int)>
	//   26   46:areturn         
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
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
	//*  13   31:astore_0        
		{
			throw new LoadingException("Failed to instantiate dynamite loader", ((Throwable) (classloader)), ((com.google.android.gms.dynamite.zza) (null)));
	//   14   32:new             #9   <Class DynamiteModule$LoadingException>
	//   15   35:dup             
	//   16   36:ldc2            #459 <String "Failed to instantiate dynamite loader">
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:invokespecial   #355 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//   20   44:athrow          
		}
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
			break MISSING_BLOCK_LABEL_137;
	//    5    7:aload_1         
	//    6    8:ifnull          137
		context = ((Context) (s));
	//    7   11:aload_1         
	//    8   12:astore_0        
		if(!((Cursor) (s)).moveToFirst())
	//*   9   13:aload_1         
	//*  10   14:invokeinterface #464 <Method boolean Cursor.moveToFirst()>
	//*  11   19:ifne            25
			break MISSING_BLOCK_LABEL_137;
	//   12   22:goto            137
		context = ((Context) (s));
	//   13   25:aload_1         
	//   14   26:astore_0        
		int i = ((Cursor) (s)).getInt(0);
	//   15   27:aload_1         
	//   16   28:iconst_0        
	//   17   29:invokeinterface #467 <Method int Cursor.getInt(int)>
	//   18   34:istore_3        
		Object obj;
		obj = ((Object) (s));
	//   19   35:aload_1         
	//   20   36:astore          4
		if(i <= 0)
			break MISSING_BLOCK_LABEL_118;
	//   21   38:iload_3         
	//   22   39:ifle            118
		context = ((Context) (s));
	//   23   42:aload_1         
	//   24   43:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   25   44:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//   26   46:monitorenter    
		zzabu = ((Cursor) (s)).getString(2);
	//   27   47:aload_1         
	//   28   48:iconst_2        
	//   29   49:invokeinterface #471 <Method String Cursor.getString(int)>
	//   30   54:putstatic       #269 <Field String zzabu>
		com/google/android/gms/dynamite/DynamiteModule;
	//   31   57:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   32   59:monitorexit     
		context = ((Context) (s));
	//   33   60:aload_1         
	//   34   61:astore_0        
		zza zza1 = (zza)zzabv.get();
	//   35   62:getstatic       #59  <Field ThreadLocal zzabv>
	//   36   65:invokevirtual   #297 <Method Object ThreadLocal.get()>
	//   37   68:checkcast       #21  <Class DynamiteModule$zza>
	//   38   71:astore          5
		obj = ((Object) (s));
	//   39   73:aload_1         
	//   40   74:astore          4
		if(zza1 == null)
			break MISSING_BLOCK_LABEL_118;
	//   41   76:aload           5
	//   42   78:ifnull          118
		obj = ((Object) (s));
	//   43   81:aload_1         
	//   44   82:astore          4
		context = ((Context) (s));
	//   45   84:aload_1         
	//   46   85:astore_0        
		if(zza1.zzaby != null)
			break MISSING_BLOCK_LABEL_118;
	//   47   86:aload           5
	//   48   88:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//   49   91:ifnonnull       118
		context = ((Context) (s));
	//   50   94:aload_1         
	//   51   95:astore_0        
		zza1.zzaby = ((Cursor) (s));
	//   52   96:aload           5
	//   53   98:aload_1         
	//   54   99:putfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
		obj = null;
	//   55  102:aconst_null     
	//   56  103:astore          4
		break MISSING_BLOCK_LABEL_118;
	//   57  105:goto            118
		obj;
	//   58  108:astore          4
		com/google/android/gms/dynamite/DynamiteModule;
	//   59  110:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   60  112:monitorexit     
		context = ((Context) (s));
	//   61  113:aload_1         
	//   62  114:astore_0        
		throw obj;
	//   63  115:aload           4
	//   64  117:athrow          
		if(obj != null)
	//*  65  118:aload           4
	//*  66  120:ifnull          130
			((Cursor) (obj)).close();
	//   67  123:aload           4
	//   68  125:invokeinterface #342 <Method void Cursor.close()>
		return i;
	//   69  130:iload_3         
	//   70  131:ireturn         
		Exception exception;
		exception;
	//   71  132:astore          4
		break MISSING_BLOCK_LABEL_172;
	//   72  134:goto            172
		context = ((Context) (s));
	//   73  137:aload_1         
	//   74  138:astore_0        
		Log.w("DynamiteModule", "Failed to retrieve remote module version.");
	//   75  139:ldc1            #181 <String "DynamiteModule">
	//   76  141:ldc2            #473 <String "Failed to retrieve remote module version.">
	//   77  144:invokestatic    #210 <Method int Log.w(String, String)>
	//   78  147:pop             
		context = ((Context) (s));
	//   79  148:aload_1         
	//   80  149:astore_0        
		throw new LoadingException("Failed to connect to dynamite module ContentResolver.", ((com.google.android.gms.dynamite.zza) (null)));
	//   81  150:new             #9   <Class DynamiteModule$LoadingException>
	//   82  153:dup             
	//   83  154:ldc2            #475 <String "Failed to connect to dynamite module ContentResolver.">
	//   84  157:aconst_null     
	//   85  158:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//   86  161:athrow          
		s;
	//   87  162:astore_1        
		context = null;
	//   88  163:aconst_null     
	//   89  164:astore_0        
		break MISSING_BLOCK_LABEL_204;
	//   90  165:goto            204
		exception;
	//   91  168:astore          4
		s = null;
	//   92  170:aconst_null     
	//   93  171:astore_1        
		context = ((Context) (s));
	//   94  172:aload_1         
	//   95  173:astore_0        
		if(!(exception instanceof LoadingException))
			break MISSING_BLOCK_LABEL_187;
	//   96  174:aload           4
	//   97  176:instanceof      #9   <Class DynamiteModule$LoadingException>
	//   98  179:ifeq            187
		context = ((Context) (s));
	//   99  182:aload_1         
	//  100  183:astore_0        
		throw exception;
	//  101  184:aload           4
	//  102  186:athrow          
		context = ((Context) (s));
	//  103  187:aload_1         
	//  104  188:astore_0        
		throw new LoadingException("V2 version check failed", ((Throwable) (exception)), ((com.google.android.gms.dynamite.zza) (null)));
	//  105  189:new             #9   <Class DynamiteModule$LoadingException>
	//  106  192:dup             
	//  107  193:ldc2            #477 <String "V2 version check failed">
	//  108  196:aload           4
	//  109  198:aconst_null     
	//  110  199:invokespecial   #355 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//  111  202:athrow          
		s;
	//  112  203:astore_1        
		if(context != null)
	//* 113  204:aload_0         
	//* 114  205:ifnull          214
			((Cursor) (context)).close();
	//  115  208:aload_0         
	//  116  209:invokeinterface #342 <Method void Cursor.close()>
		throw s;
	//  117  214:aload_1         
	//  118  215:athrow          
	}

	private static DynamiteModule zzb(Context context, String s, int i)
		throws LoadingException
	{
		Object obj = ((Object) (new StringBuilder(51 + String.valueOf(((Object) (s))).length())));
	//    0    0:new             #123 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          51
	//    3    6:aload_1         
	//    4    7:invokestatic    #129 <Method String String.valueOf(Object)>
	//    5   10:invokevirtual   #133 <Method int String.length()>
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
		if(obj == null)
	//*  33   61:aload_3         
	//*  34   62:ifnonnull       77
			throw new LoadingException("Failed to create IDynamiteLoader.", ((com.google.android.gms.dynamite.zza) (null)));
	//   35   65:new             #9   <Class DynamiteModule$LoadingException>
	//   36   68:dup             
	//   37   69:ldc2            #483 <String "Failed to create IDynamiteLoader.">
	//   38   72:aconst_null     
	//   39   73:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//   40   76:athrow          
		try
		{
			context = ((Context) (((IDynamiteLoader) (obj)).createModuleContext(ObjectWrapper.wrap(((Object) (context))), s, i)));
	//   41   77:aload_3         
	//   42   78:aload_0         
	//   43   79:invokestatic    #403 <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   44   82:aload_1         
	//   45   83:iload_2         
	//   46   84:invokeinterface #487 <Method com.google.android.gms.dynamic.IObjectWrapper IDynamiteLoader.createModuleContext(com.google.android.gms.dynamic.IObjectWrapper, String, int)>
	//   47   89:astore_0        
		}
	//*  48   90:aload_0         
	//*  49   91:invokestatic    #421 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  50   94:ifnonnull       109
	//*  51   97:new             #9   <Class DynamiteModule$LoadingException>
	//*  52  100:dup             
	//*  53  101:ldc2            #489 <String "Failed to load remote module.">
	//*  54  104:aconst_null     
	//*  55  105:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//*  56  108:athrow          
	//*  57  109:new             #2   <Class DynamiteModule>
	//*  58  112:dup             
	//*  59  113:aload_0         
	//*  60  114:invokestatic    #421 <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  61  117:checkcast       #105 <Class Context>
	//*  62  120:invokespecial   #491 <Method void DynamiteModule(Context)>
	//*  63  123:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  64  124:astore_0        
		{
			throw new LoadingException("Failed to load remote module.", ((Throwable) (context)), ((com.google.android.gms.dynamite.zza) (null)));
	//   65  125:new             #9   <Class DynamiteModule$LoadingException>
	//   66  128:dup             
	//   67  129:ldc2            #489 <String "Failed to load remote module.">
	//   68  132:aload_0         
	//   69  133:aconst_null     
	//   70  134:invokespecial   #355 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//   71  137:athrow          
		}
		if(ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (context))) == null)
			throw new LoadingException("Failed to load remote module.", ((com.google.android.gms.dynamite.zza) (null)));
		else
			return new DynamiteModule((Context)ObjectWrapper.unwrap(((com.google.android.gms.dynamic.IObjectWrapper) (context))));
	}

	private static DynamiteModule zzc(Context context, String s, int i)
		throws LoadingException
	{
		StringBuilder stringbuilder = new StringBuilder(51 + String.valueOf(((Object) (s))).length());
	//    0    0:new             #123 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          51
	//    3    6:aload_1         
	//    4    7:invokestatic    #129 <Method String String.valueOf(Object)>
	//    5   10:invokevirtual   #133 <Method int String.length()>
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
		if(idynamiteloaderv2 == null)
	//*  36   66:aload_3         
	//*  37   67:ifnonnull       82
			throw new LoadingException("DynamiteLoaderV2 was not cached.", ((com.google.android.gms.dynamite.zza) (null)));
	//   38   70:new             #9   <Class DynamiteModule$LoadingException>
	//   39   73:dup             
	//   40   74:ldc2            #493 <String "DynamiteLoaderV2 was not cached.">
	//   41   77:aconst_null     
	//   42   78:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//   43   81:athrow          
		zza zza1 = (zza)zzabv.get();
	//   44   82:getstatic       #59  <Field ThreadLocal zzabv>
	//   45   85:invokevirtual   #297 <Method Object ThreadLocal.get()>
	//   46   88:checkcast       #21  <Class DynamiteModule$zza>
	//   47   91:astore          4
		if(zza1 != null && zza1.zzaby != null)
	//*  48   93:aload           4
	//*  49   95:ifnull          150
	//*  50   98:aload           4
	//*  51  100:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//*  52  103:ifnonnull       109
	//*  53  106:goto            150
		{
			context = zza(context.getApplicationContext(), s, i, zza1.zzaby, idynamiteloaderv2);
	//   54  109:aload_0         
	//   55  110:invokevirtual   #117 <Method Context Context.getApplicationContext()>
	//   56  113:aload_1         
	//   57  114:iload_2         
	//   58  115:aload           4
	//   59  117:getfield        #337 <Field Cursor DynamiteModule$zza.zzaby>
	//   60  120:aload_3         
	//   61  121:invokestatic    #495 <Method Context zza(Context, String, int, Cursor, IDynamiteLoaderV2)>
	//   62  124:astore_0        
			if(context == null)
	//*  63  125:aload_0         
	//*  64  126:ifnonnull       141
				throw new LoadingException("Failed to get module context", ((com.google.android.gms.dynamite.zza) (null)));
	//   65  129:new             #9   <Class DynamiteModule$LoadingException>
	//   66  132:dup             
	//   67  133:ldc2            #497 <String "Failed to get module context">
	//   68  136:aconst_null     
	//   69  137:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
	//   70  140:athrow          
			else
				return new DynamiteModule(context);
	//   71  141:new             #2   <Class DynamiteModule>
	//   72  144:dup             
	//   73  145:aload_0         
	//   74  146:invokespecial   #491 <Method void DynamiteModule(Context)>
	//   75  149:areturn         
		} else
		{
			throw new LoadingException("No result cursor", ((com.google.android.gms.dynamite.zza) (null)));
	//   76  150:new             #9   <Class DynamiteModule$LoadingException>
	//   77  153:dup             
	//   78  154:ldc2            #499 <String "No result cursor">
	//   79  157:aconst_null     
	//   80  158:invokespecial   #360 <Method void DynamiteModule$LoadingException(String, zza)>
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
	//   24   49:invokespecial   #491 <Method void DynamiteModule(Context)>
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
		IBinder ibinder;
		try
		{
			ibinder = (IBinder)zzabx.getClassLoader().loadClass(s).newInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Context zzabx>
	//    2    4:invokevirtual   #121 <Method ClassLoader Context.getClassLoader()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #154 <Method Class ClassLoader.loadClass(String)>
	//    5   11:invokevirtual   #519 <Method Object Class.newInstance()>
	//    6   14:checkcast       #451 <Class IBinder>
	//    7   17:astore_2        
		}
	//*   8   18:aload_2         
	//*   9   19:areturn         
		catch(Object obj)
	//*  10   20:astore_2        
		{
			s = String.valueOf(((Object) (s)));
	//   11   21:aload_1         
	//   12   22:invokestatic    #129 <Method String String.valueOf(Object)>
	//   13   25:astore_1        
			if(s.length() != 0)
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #133 <Method int String.length()>
	//*  16   30:ifeq            44
				s = "Failed to instantiate module class: ".concat(s);
	//   17   33:ldc2            #531 <String "Failed to instantiate module class: ">
	//   18   36:aload_1         
	//   19   37:invokevirtual   #200 <Method String String.concat(String)>
	//   20   40:astore_1        
			else
	//*  21   41:goto            55
				s = new String("Failed to instantiate module class: ");
	//   22   44:new             #125 <Class String>
	//   23   47:dup             
	//   24   48:ldc2            #531 <String "Failed to instantiate module class: ">
	//   25   51:invokespecial   #203 <Method void String(String)>
	//   26   54:astore_1        
			throw new LoadingException(s, ((Throwable) (obj)), ((com.google.android.gms.dynamite.zza) (null)));
	//   27   55:new             #9   <Class DynamiteModule$LoadingException>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:aconst_null     
	//   32   62:invokespecial   #355 <Method void DynamiteModule$LoadingException(String, Throwable, zza)>
	//   33   65:athrow          
		}
		return ibinder;
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
