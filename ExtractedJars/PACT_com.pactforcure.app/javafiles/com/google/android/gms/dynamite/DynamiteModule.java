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
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.zzc;
import com.google.android.gms.dynamic.zze;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.dynamite:
//			zzb, zza

public final class DynamiteModule
{
	public static class DynamiteLoaderClassLoader
	{

		public static ClassLoader sClassLoader;

		public DynamiteLoaderClassLoader()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class zza extends Exception
	{

		private zza(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void Exception(String)>
		//    3    5:return          
		}


		private zza(String s, Throwable throwable)
		{
			super(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #17  <Method void Exception(String, Throwable)>
		//    4    6:return          
		}

	}

	public static interface zzb
	{

		public abstract zzb zza(Context context, String s, zza zza1)
			throws zza;
	}

	public static interface zzb.zza
	{

		public abstract int zzA(Context context, String s);

		public abstract DynamiteModule zza(Context context, String s, int i)
			throws zza;

		public abstract int zzb(Context context, String s, boolean flag)
			throws zza;
	}

	public static class zzb.zzb
	{

		public int zzaQD;
		public int zzaQE;
		public int zzaQF;

		public zzb.zzb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzaQD = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #19  <Field int zzaQD>
			zzaQE = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #21  <Field int zzaQE>
			zzaQF = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #23  <Field int zzaQF>
		//   11   19:return          
		}
	}


	private DynamiteModule(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void Object()>
		zzaQB = (Context)zzac.zzw(((Object) (context)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #92  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #94  <Class Context>
	//    6   12:putfield        #96  <Field Context zzaQB>
	//    7   15:return          
	}

	public static int zzA(Context context, String s)
	{
		Object obj;
		context = ((Context) (context.getApplicationContext().getClassLoader()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method Context Context.getApplicationContext()>
	//    2    4:invokevirtual   #110 <Method ClassLoader Context.getClassLoader()>
	//    3    7:astore_0        
		obj = ((Object) (String.valueOf("com.google.android.gms.dynamite.descriptors.")));
	//    4    8:ldc1            #112 <String "com.google.android.gms.dynamite.descriptors.">
	//    5   10:invokestatic    #118 <Method String String.valueOf(Object)>
	//    6   13:astore_3        
		String s1 = String.valueOf("ModuleDescriptor");
	//    7   14:ldc1            #120 <String "ModuleDescriptor">
	//    8   16:invokestatic    #118 <Method String String.valueOf(Object)>
	//    9   19:astore          4
		obj = ((Object) (((ClassLoader) (context)).loadClass((new StringBuilder(String.valueOf(obj).length() + 1 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length())).append(((String) (obj))).append(s).append(".").append(s1).toString())));
	//   10   21:aload_0         
	//   11   22:new             #122 <Class StringBuilder>
	//   12   25:dup             
	//   13   26:aload_3         
	//   14   27:invokestatic    #118 <Method String String.valueOf(Object)>
	//   15   30:invokevirtual   #126 <Method int String.length()>
	//   16   33:iconst_1        
	//   17   34:iadd            
	//   18   35:aload_1         
	//   19   36:invokestatic    #118 <Method String String.valueOf(Object)>
	//   20   39:invokevirtual   #126 <Method int String.length()>
	//   21   42:iadd            
	//   22   43:aload           4
	//   23   45:invokestatic    #118 <Method String String.valueOf(Object)>
	//   24   48:invokevirtual   #126 <Method int String.length()>
	//   25   51:iadd            
	//   26   52:invokespecial   #129 <Method void StringBuilder(int)>
	//   27   55:aload_3         
	//   28   56:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   29   59:aload_1         
	//   30   60:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:ldc1            #135 <String ".">
	//   32   65:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   33   68:aload           4
	//   34   70:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   35   73:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   36   76:invokevirtual   #145 <Method Class ClassLoader.loadClass(String)>
	//   37   79:astore_3        
		context = ((Context) (((Class) (obj)).getDeclaredField("MODULE_ID")));
	//   38   80:aload_3         
	//   39   81:ldc1            #147 <String "MODULE_ID">
	//   40   83:invokevirtual   #153 <Method Field Class.getDeclaredField(String)>
	//   41   86:astore_0        
		obj = ((Object) (((Class) (obj)).getDeclaredField("MODULE_VERSION")));
	//   42   87:aload_3         
	//   43   88:ldc1            #155 <String "MODULE_VERSION">
	//   44   90:invokevirtual   #153 <Method Field Class.getDeclaredField(String)>
	//   45   93:astore_3        
		if(((Field) (context)).get(((Object) (null))).equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_174;
	//   46   94:aload_0         
	//   47   95:aconst_null     
	//   48   96:invokevirtual   #160 <Method Object Field.get(Object)>
	//   49   99:aload_1         
	//   50  100:invokevirtual   #164 <Method boolean Object.equals(Object)>
	//   51  103:ifne            174
		context = ((Context) (String.valueOf(((Field) (context)).get(((Object) (null))))));
	//   52  106:aload_0         
	//   53  107:aconst_null     
	//   54  108:invokevirtual   #160 <Method Object Field.get(Object)>
	//   55  111:invokestatic    #118 <Method String String.valueOf(Object)>
	//   56  114:astore_0        
		Log.e("DynamiteModule", (new StringBuilder(String.valueOf(((Object) (context))).length() + 51 + String.valueOf(((Object) (s))).length())).append("Module descriptor id '").append(((String) (context))).append("' didn't match expected id '").append(s).append("'").toString());
	//   57  115:ldc1            #166 <String "DynamiteModule">
	//   58  117:new             #122 <Class StringBuilder>
	//   59  120:dup             
	//   60  121:aload_0         
	//   61  122:invokestatic    #118 <Method String String.valueOf(Object)>
	//   62  125:invokevirtual   #126 <Method int String.length()>
	//   63  128:bipush          51
	//   64  130:iadd            
	//   65  131:aload_1         
	//   66  132:invokestatic    #118 <Method String String.valueOf(Object)>
	//   67  135:invokevirtual   #126 <Method int String.length()>
	//   68  138:iadd            
	//   69  139:invokespecial   #129 <Method void StringBuilder(int)>
	//   70  142:ldc1            #168 <String "Module descriptor id '">
	//   71  144:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   72  147:aload_0         
	//   73  148:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   74  151:ldc1            #170 <String "' didn't match expected id '">
	//   75  153:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   76  156:aload_1         
	//   77  157:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   78  160:ldc1            #172 <String "'">
	//   79  162:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   80  165:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   81  168:invokestatic    #178 <Method int Log.e(String, String)>
	//   82  171:pop             
		return 0;
	//   83  172:iconst_0        
	//   84  173:ireturn         
		int i = ((Field) (obj)).getInt(((Object) (null)));
	//   85  174:aload_3         
	//   86  175:aconst_null     
	//   87  176:invokevirtual   #182 <Method int Field.getInt(Object)>
	//   88  179:istore_2        
		return i;
	//   89  180:iload_2         
	//   90  181:ireturn         
		context;
	//   91  182:astore_0        
		Log.w("DynamiteModule", (new StringBuilder(String.valueOf(((Object) (s))).length() + 45)).append("Local module descriptor class for ").append(s).append(" not found.").toString());
	//   92  183:ldc1            #166 <String "DynamiteModule">
	//   93  185:new             #122 <Class StringBuilder>
	//   94  188:dup             
	//   95  189:aload_1         
	//   96  190:invokestatic    #118 <Method String String.valueOf(Object)>
	//   97  193:invokevirtual   #126 <Method int String.length()>
	//   98  196:bipush          45
	//   99  198:iadd            
	//  100  199:invokespecial   #129 <Method void StringBuilder(int)>
	//  101  202:ldc1            #184 <String "Local module descriptor class for ">
	//  102  204:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  103  207:aload_1         
	//  104  208:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  105  211:ldc1            #186 <String " not found.">
	//  106  213:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  107  216:invokevirtual   #139 <Method String StringBuilder.toString()>
	//  108  219:invokestatic    #189 <Method int Log.w(String, String)>
	//  109  222:pop             
_L2:
		return 0;
	//  110  223:iconst_0        
	//  111  224:ireturn         
		context;
	//  112  225:astore_0        
		context = ((Context) (String.valueOf(((Object) (((Exception) (context)).getMessage())))));
	//  113  226:aload_0         
	//  114  227:invokevirtual   #192 <Method String Exception.getMessage()>
	//  115  230:invokestatic    #118 <Method String String.valueOf(Object)>
	//  116  233:astore_0        
		if(((String) (context)).length() != 0)
	//* 117  234:aload_0         
	//* 118  235:invokevirtual   #126 <Method int String.length()>
	//* 119  238:ifeq            258
			context = ((Context) ("Failed to load module descriptor class: ".concat(((String) (context)))));
	//  120  241:ldc1            #194 <String "Failed to load module descriptor class: ">
	//  121  243:aload_0         
	//  122  244:invokevirtual   #198 <Method String String.concat(String)>
	//  123  247:astore_0        
		else
	//* 124  248:ldc1            #166 <String "DynamiteModule">
	//* 125  250:aload_0         
	//* 126  251:invokestatic    #178 <Method int Log.e(String, String)>
	//* 127  254:pop             
	//* 128  255:goto            223
			context = ((Context) (new String("Failed to load module descriptor class: ")));
	//  129  258:new             #114 <Class String>
	//  130  261:dup             
	//  131  262:ldc1            #194 <String "Failed to load module descriptor class: ">
	//  132  264:invokespecial   #201 <Method void String(String)>
	//  133  267:astore_0        
		Log.e("DynamiteModule", ((String) (context)));
		if(true) goto _L2; else goto _L1
	//  134  268:goto            248
_L1:
	}

	public static int zzB(Context context, String s)
	{
		return zzb(context, s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #205 <Method int zzb(Context, String, boolean)>
	//    4    6:ireturn         
	}

	private static DynamiteModule zzC(Context context, String s)
	{
		s = String.valueOf(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #118 <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		if(s.length() != 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #126 <Method int String.length()>
	//*   5    9:ifeq            38
			s = "Selected local version of ".concat(s);
	//    6   12:ldc1            #209 <String "Selected local version of ">
	//    7   14:aload_1         
	//    8   15:invokevirtual   #198 <Method String String.concat(String)>
	//    9   18:astore_1        
		else
	//*  10   19:ldc1            #166 <String "DynamiteModule">
	//*  11   21:aload_1         
	//*  12   22:invokestatic    #212 <Method int Log.i(String, String)>
	//*  13   25:pop             
	//*  14   26:new             #2   <Class DynamiteModule>
	//*  15   29:dup             
	//*  16   30:aload_0         
	//*  17   31:invokevirtual   #106 <Method Context Context.getApplicationContext()>
	//*  18   34:invokespecial   #214 <Method void DynamiteModule(Context)>
	//*  19   37:areturn         
			s = new String("Selected local version of ");
	//   20   38:new             #114 <Class String>
	//   21   41:dup             
	//   22   42:ldc1            #209 <String "Selected local version of ">
	//   23   44:invokespecial   #201 <Method void String(String)>
	//   24   47:astore_1        
		Log.i("DynamiteModule", s);
		return new DynamiteModule(context.getApplicationContext());
	//*  25   48:goto            19
	}

	private static ClassLoader zzD(Context context, String s)
		throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException
	{
		com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;
	//    0    0:ldc1            #24  <Class DynamiteModule$DynamiteLoaderClassLoader>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(DynamiteLoaderClassLoader.sClassLoader == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    3:getstatic       #226 <Field ClassLoader DynamiteModule$DynamiteLoaderClassLoader.sClassLoader>
	//    3    6:ifnull          18
		context = ((Context) (DynamiteLoaderClassLoader.sClassLoader));
	//    4    9:getstatic       #226 <Field ClassLoader DynamiteModule$DynamiteLoaderClassLoader.sClassLoader>
	//    5   12:astore_0        
		com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;
	//    6   13:ldc1            #24  <Class DynamiteModule$DynamiteLoaderClassLoader>
		JVM INSTR monitorexit ;
	//    7   15:monitorexit     
		return ((ClassLoader) (context));
	//    8   16:aload_0         
	//    9   17:areturn         
		context = ((Context) (context.getApplicationContext().getClassLoader().loadClass(((Class) (com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader)).getName())));
	//   10   18:aload_0         
	//   11   19:invokevirtual   #106 <Method Context Context.getApplicationContext()>
	//   12   22:invokevirtual   #110 <Method ClassLoader Context.getClassLoader()>
	//   13   25:ldc1            #24  <Class DynamiteModule$DynamiteLoaderClassLoader>
	//   14   27:invokevirtual   #229 <Method String Class.getName()>
	//   15   30:invokevirtual   #145 <Method Class ClassLoader.loadClass(String)>
	//   16   33:astore_0        
		Field field = ((Class) (context)).getDeclaredField("sClassLoader");
	//   17   34:aload_0         
	//   18   35:ldc1            #230 <String "sClassLoader">
	//   19   37:invokevirtual   #153 <Method Field Class.getDeclaredField(String)>
	//   20   40:astore_2        
		context;
	//   21   41:aload_0         
		JVM INSTR monitorenter ;
	//   22   42:monitorenter    
		DynamiteLoaderClassLoader.sClassLoader = (ClassLoader)field.get(((Object) (null)));
	//   23   43:aload_2         
	//   24   44:aconst_null     
	//   25   45:invokevirtual   #160 <Method Object Field.get(Object)>
	//   26   48:checkcast       #141 <Class ClassLoader>
	//   27   51:putstatic       #226 <Field ClassLoader DynamiteModule$DynamiteLoaderClassLoader.sClassLoader>
		if(DynamiteLoaderClassLoader.sClassLoader == null)
			break MISSING_BLOCK_LABEL_77;
	//   28   54:getstatic       #226 <Field ClassLoader DynamiteModule$DynamiteLoaderClassLoader.sClassLoader>
	//   29   57:ifnull          77
		s = ((String) (DynamiteLoaderClassLoader.sClassLoader));
	//   30   60:getstatic       #226 <Field ClassLoader DynamiteModule$DynamiteLoaderClassLoader.sClassLoader>
	//   31   63:astore_1        
		context;
	//   32   64:aload_0         
		JVM INSTR monitorexit ;
	//   33   65:monitorexit     
		com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;
	//   34   66:ldc1            #24  <Class DynamiteModule$DynamiteLoaderClassLoader>
		JVM INSTR monitorexit ;
	//   35   68:monitorexit     
		return ((ClassLoader) (s));
	//   36   69:aload_1         
	//   37   70:areturn         
		context;
	//   38   71:astore_0        
		com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;
	//   39   72:ldc1            #24  <Class DynamiteModule$DynamiteLoaderClassLoader>
		JVM INSTR monitorexit ;
	//   40   74:monitorexit     
		throw context;
	//   41   75:aload_0         
	//   42   76:athrow          
		DynamiteLoaderClassLoader.sClassLoader = ((ClassLoader) (new PathClassLoader(s, ClassLoader.getSystemClassLoader()) {

			protected Class loadClass(String s1, boolean flag)
				throws ClassNotFoundException
			{
				if(s1.startsWith("java.") || s1.startsWith("android."))
					break MISSING_BLOCK_LABEL_27;
			//    0    0:aload_1         
			//    1    1:ldc1            #20  <String "java.">
			//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
			//    3    6:ifne            27
			//    4    9:aload_1         
			//    5   10:ldc1            #28  <String "android.">
			//    6   12:invokevirtual   #26  <Method boolean String.startsWith(String)>
			//    7   15:ifne            27
				Class class1 = findClass(s1);
			//    8   18:aload_0         
			//    9   19:aload_1         
			//   10   20:invokevirtual   #32  <Method Class findClass(String)>
			//   11   23:astore_3        
				return class1;
			//   12   24:aload_3         
			//   13   25:areturn         
				ClassNotFoundException classnotfoundexception;
				classnotfoundexception;
			//   14   26:astore_3        
				return super.loadClass(s1, flag);
			//   15   27:aload_0         
			//   16   28:aload_1         
			//   17   29:iload_2         
			//   18   30:invokespecial   #34  <Method Class PathClassLoader.loadClass(String, boolean)>
			//   19   33:areturn         
			}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void PathClassLoader(String, ClassLoader)>
			//    4    6:return          
			}
		}
));
	//   43   77:new             #22  <Class DynamiteModule$9>
	//   44   80:dup             
	//   45   81:aload_1         
	//   46   82:invokestatic    #233 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//   47   85:invokespecial   #236 <Method void DynamiteModule$9(String, ClassLoader)>
	//   48   88:putstatic       #226 <Field ClassLoader DynamiteModule$DynamiteLoaderClassLoader.sClassLoader>
		field.set(((Object) (null)), ((Object) (DynamiteLoaderClassLoader.sClassLoader)));
	//   49   91:aload_2         
	//   50   92:aconst_null     
	//   51   93:getstatic       #226 <Field ClassLoader DynamiteModule$DynamiteLoaderClassLoader.sClassLoader>
	//   52   96:invokevirtual   #240 <Method void Field.set(Object, Object)>
		s = ((String) (DynamiteLoaderClassLoader.sClassLoader));
	//   53   99:getstatic       #226 <Field ClassLoader DynamiteModule$DynamiteLoaderClassLoader.sClassLoader>
	//   54  102:astore_1        
		context;
	//   55  103:aload_0         
		JVM INSTR monitorexit ;
	//   56  104:monitorexit     
		com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;
	//   57  105:ldc1            #24  <Class DynamiteModule$DynamiteLoaderClassLoader>
		JVM INSTR monitorexit ;
	//   58  107:monitorexit     
		return ((ClassLoader) (s));
	//   59  108:aload_1         
	//   60  109:areturn         
		s;
	//   61  110:astore_1        
		context;
	//   62  111:aload_0         
		JVM INSTR monitorexit ;
	//   63  112:monitorexit     
		throw s;
	//   64  113:aload_1         
	//   65  114:athrow          
	}

	private static Context zza(Context context, String s, byte abyte0[], String s1)
	{
		if(s1 == null || s1.isEmpty())
	//*   0    0:aload_3         
	//*   1    1:ifnull          11
	//*   2    4:aload_3         
	//*   3    5:invokevirtual   #246 <Method boolean String.isEmpty()>
	//*   4    8:ifeq            21
		{
			Log.e("DynamiteModule", "No valid DynamiteLoader APK path");
	//    5   11:ldc1            #166 <String "DynamiteModule">
	//    6   13:ldc1            #248 <String "No valid DynamiteLoader APK path">
	//    7   15:invokestatic    #178 <Method int Log.e(String, String)>
	//    8   18:pop             
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		}
		try
		{
			context = (Context)zze.zzE(com.google.android.gms.dynamite.zzb.zza.zzcf((IBinder)zzD(context, s1).loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0])).zza(zze.zzA(((Object) (context))), s, abyte0));
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:invokestatic    #250 <Method ClassLoader zzD(Context, String)>
	//   14   26:ldc1            #252 <String "com.google.android.gms.dynamiteloader.DynamiteLoaderV2">
	//   15   28:invokevirtual   #145 <Method Class ClassLoader.loadClass(String)>
	//   16   31:iconst_0        
	//   17   32:anewarray       Class[]
	//   18   35:invokevirtual   #256 <Method Constructor Class.getConstructor(Class[])>
	//   19   38:iconst_0        
	//   20   39:anewarray       Object[]
	//   21   42:invokevirtual   #262 <Method Object Constructor.newInstance(Object[])>
	//   22   45:checkcast       #264 <Class IBinder>
	//   23   48:invokestatic    #270 <Method zzb zzb$zza.zzcf(IBinder)>
	//   24   51:aload_0         
	//   25   52:invokestatic    #275 <Method com.google.android.gms.dynamic.zzd zze.zzA(Object)>
	//   26   55:aload_1         
	//   27   56:aload_2         
	//   28   57:invokeinterface #280 <Method com.google.android.gms.dynamic.zzd zzb.zza(com.google.android.gms.dynamic.zzd, String, byte[])>
	//   29   62:invokestatic    #284 <Method Object zze.zzE(com.google.android.gms.dynamic.zzd)>
	//   30   65:checkcast       #94  <Class Context>
	//   31   68:astore_0        
		}
	//*  32   69:aload_0         
	//*  33   70:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  34   71:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((Exception) (context)).toString())))));
	//   35   72:aload_0         
	//   36   73:invokevirtual   #285 <Method String Exception.toString()>
	//   37   76:invokestatic    #118 <Method String String.valueOf(Object)>
	//   38   79:astore_0        
			if(((String) (context)).length() != 0)
	//*  39   80:aload_0         
	//*  40   81:invokevirtual   #126 <Method int String.length()>
	//*  41   84:ifeq            104
				context = ((Context) ("Failed to load DynamiteLoader: ".concat(((String) (context)))));
	//   42   87:ldc2            #287 <String "Failed to load DynamiteLoader: ">
	//   43   90:aload_0         
	//   44   91:invokevirtual   #198 <Method String String.concat(String)>
	//   45   94:astore_0        
			else
	//*  46   95:ldc1            #166 <String "DynamiteModule">
	//*  47   97:aload_0         
	//*  48   98:invokestatic    #178 <Method int Log.e(String, String)>
	//*  49  101:pop             
	//*  50  102:aconst_null     
	//*  51  103:areturn         
				context = ((Context) (new String("Failed to load DynamiteLoader: ")));
	//   52  104:new             #114 <Class String>
	//   53  107:dup             
	//   54  108:ldc2            #287 <String "Failed to load DynamiteLoader: ">
	//   55  111:invokespecial   #201 <Method void String(String)>
	//   56  114:astore_0        
			Log.e("DynamiteModule", ((String) (context)));
			return null;
		}
		return context;
	//*  57  115:goto            95
	}

	public static DynamiteModule zza(Context context, zzb zzb1, String s)
		throws zza
	{
		if("com.google.android.gms".equals(((Object) (context.getApplicationContext().getPackageName()))))
	//*   0    0:ldc2            #290 <String "com.google.android.gms">
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #106 <Method Context Context.getApplicationContext()>
	//*   3    7:invokevirtual   #293 <Method String Context.getPackageName()>
	//*   4   10:invokevirtual   #294 <Method boolean String.equals(Object)>
	//*   5   13:ifeq            26
			return zza(context, zzb1, s, zzaQu);
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:getstatic       #65  <Field DynamiteModule$zzb$zza zzaQu>
	//   10   22:invokestatic    #297 <Method DynamiteModule zza(Context, DynamiteModule$zzb, String, DynamiteModule$zzb$zza)>
	//   11   25:areturn         
		DynamiteModule dynamitemodule;
		try
		{
			dynamitemodule = zza(context, zzb1, s, zzaQv);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:getstatic       #68  <Field DynamiteModule$zzb$zza zzaQv>
	//   16   32:invokestatic    #297 <Method DynamiteModule zza(Context, DynamiteModule$zzb, String, DynamiteModule$zzb$zza)>
	//   17   35:astore_3        
		}
	//*  18   36:aload_3         
	//*  19   37:areturn         
		catch(zza zza1)
	//*  20   38:astore_3        
		{
			String s1 = String.valueOf(((Object) (zza1.toString())));
	//   21   39:aload_3         
	//   22   40:invokevirtual   #298 <Method String DynamiteModule$zza.toString()>
	//   23   43:invokestatic    #118 <Method String String.valueOf(Object)>
	//   24   46:astore_3        
			if(s1.length() != 0)
	//*  25   47:aload_3         
	//*  26   48:invokevirtual   #126 <Method int String.length()>
	//*  27   51:ifeq            79
				s1 = "Failed to load module via fast route".concat(s1);
	//   28   54:ldc2            #300 <String "Failed to load module via fast route">
	//   29   57:aload_3         
	//   30   58:invokevirtual   #198 <Method String String.concat(String)>
	//   31   61:astore_3        
			else
	//*  32   62:ldc1            #166 <String "DynamiteModule">
	//*  33   64:aload_3         
	//*  34   65:invokestatic    #189 <Method int Log.w(String, String)>
	//*  35   68:pop             
	//*  36   69:aload_0         
	//*  37   70:aload_1         
	//*  38   71:aload_2         
	//*  39   72:getstatic       #65  <Field DynamiteModule$zzb$zza zzaQu>
	//*  40   75:invokestatic    #297 <Method DynamiteModule zza(Context, DynamiteModule$zzb, String, DynamiteModule$zzb$zza)>
	//*  41   78:areturn         
				s1 = new String("Failed to load module via fast route");
	//   42   79:new             #114 <Class String>
	//   43   82:dup             
	//   44   83:ldc2            #300 <String "Failed to load module via fast route">
	//   45   86:invokespecial   #201 <Method void String(String)>
	//   46   89:astore_3        
			Log.w("DynamiteModule", s1);
			return zza(context, zzb1, s, zzaQu);
		}
		return dynamitemodule;
	//*  47   90:goto            62
	}

	public static DynamiteModule zza(Context context, zzb zzb1, String s, zzb.zza zza1)
		throws zza
	{
		zzb.zzb zzb2 = zzb1.zza(context, s, zza1);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokeinterface #303 <Method DynamiteModule$zzb$zzb DynamiteModule$zzb.zza(Context, String, DynamiteModule$zzb$zza)>
	//    5    9:astore          6
		int i = zzb2.zzaQD;
	//    6   11:aload           6
	//    7   13:getfield        #307 <Field int DynamiteModule$zzb$zzb.zzaQD>
	//    8   16:istore          4
		int l = zzb2.zzaQE;
	//    9   18:aload           6
	//   10   20:getfield        #310 <Field int DynamiteModule$zzb$zzb.zzaQE>
	//   11   23:istore          5
		Log.i("DynamiteModule", (new StringBuilder(String.valueOf(((Object) (s))).length() + 68 + String.valueOf(((Object) (s))).length())).append("Considering local module ").append(s).append(":").append(i).append(" and remote module ").append(s).append(":").append(l).toString());
	//   12   25:ldc1            #166 <String "DynamiteModule">
	//   13   27:new             #122 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:aload_2         
	//   16   32:invokestatic    #118 <Method String String.valueOf(Object)>
	//   17   35:invokevirtual   #126 <Method int String.length()>
	//   18   38:bipush          68
	//   19   40:iadd            
	//   20   41:aload_2         
	//   21   42:invokestatic    #118 <Method String String.valueOf(Object)>
	//   22   45:invokevirtual   #126 <Method int String.length()>
	//   23   48:iadd            
	//   24   49:invokespecial   #129 <Method void StringBuilder(int)>
	//   25   52:ldc2            #312 <String "Considering local module ">
	//   26   55:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   27   58:aload_2         
	//   28   59:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:ldc2            #314 <String ":">
	//   30   65:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   31   68:iload           4
	//   32   70:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//   33   73:ldc2            #319 <String " and remote module ">
	//   34   76:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   35   79:aload_2         
	//   36   80:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   37   83:ldc2            #314 <String ":">
	//   38   86:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   39   89:iload           5
	//   40   91:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//   41   94:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   42   97:invokestatic    #212 <Method int Log.i(String, String)>
	//   43  100:pop             
		if(zzb2.zzaQF == 0 || zzb2.zzaQF == -1 && zzb2.zzaQD == 0 || zzb2.zzaQF == 1 && zzb2.zzaQE == 0)
	//*  44  101:aload           6
	//*  45  103:getfield        #322 <Field int DynamiteModule$zzb$zzb.zzaQF>
	//*  46  106:ifeq            143
	//*  47  109:aload           6
	//*  48  111:getfield        #322 <Field int DynamiteModule$zzb$zzb.zzaQF>
	//*  49  114:iconst_m1       
	//*  50  115:icmpne          126
	//*  51  118:aload           6
	//*  52  120:getfield        #307 <Field int DynamiteModule$zzb$zzb.zzaQD>
	//*  53  123:ifeq            143
	//*  54  126:aload           6
	//*  55  128:getfield        #322 <Field int DynamiteModule$zzb$zzb.zzaQF>
	//*  56  131:iconst_1        
	//*  57  132:icmpne          205
	//*  58  135:aload           6
	//*  59  137:getfield        #310 <Field int DynamiteModule$zzb$zzb.zzaQE>
	//*  60  140:ifne            205
		{
			int j = zzb2.zzaQD;
	//   61  143:aload           6
	//   62  145:getfield        #307 <Field int DynamiteModule$zzb$zzb.zzaQD>
	//   63  148:istore          4
			int i1 = zzb2.zzaQE;
	//   64  150:aload           6
	//   65  152:getfield        #310 <Field int DynamiteModule$zzb$zzb.zzaQE>
	//   66  155:istore          5
			throw new zza((new StringBuilder(91)).append("No acceptable module found. Local version is ").append(j).append(" and remote version is ").append(i1).append(".").toString());
	//   67  157:new             #27  <Class DynamiteModule$zza>
	//   68  160:dup             
	//   69  161:new             #122 <Class StringBuilder>
	//   70  164:dup             
	//   71  165:bipush          91
	//   72  167:invokespecial   #129 <Method void StringBuilder(int)>
	//   73  170:ldc2            #324 <String "No acceptable module found. Local version is ">
	//   74  173:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   75  176:iload           4
	//   76  178:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//   77  181:ldc2            #326 <String " and remote version is ">
	//   78  184:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   79  187:iload           5
	//   80  189:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//   81  192:ldc1            #135 <String ".">
	//   82  194:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   83  197:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   84  200:aconst_null     
	//   85  201:invokespecial   #329 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   86  204:athrow          
		}
		if(zzb2.zzaQF == -1)
	//*  87  205:aload           6
	//*  88  207:getfield        #322 <Field int DynamiteModule$zzb$zzb.zzaQF>
	//*  89  210:iconst_m1       
	//*  90  211:icmpne          220
			return zzC(context, s);
	//   91  214:aload_0         
	//   92  215:aload_2         
	//   93  216:invokestatic    #331 <Method DynamiteModule zzC(Context, String)>
	//   94  219:areturn         
		if(zzb2.zzaQF == 1)
	//*  95  220:aload           6
	//*  96  222:getfield        #322 <Field int DynamiteModule$zzb$zzb.zzaQF>
	//*  97  225:iconst_1        
	//*  98  226:icmpne          347
		{
			try
			{
				zza1 = ((zzb.zza) (zza1.zza(context, s, zzb2.zzaQE)));
	//   99  229:aload_3         
	//  100  230:aload_0         
	//  101  231:aload_2         
	//  102  232:aload           6
	//  103  234:getfield        #310 <Field int DynamiteModule$zzb$zzb.zzaQE>
	//  104  237:invokeinterface #334 <Method DynamiteModule DynamiteModule$zzb$zza.zza(Context, String, int)>
	//  105  242:astore_3        
			}
	//* 106  243:aload_3         
	//* 107  244:areturn         
			catch(zza zza2)
	//* 108  245:astore          7
			{
				zza1 = ((zzb.zza) (String.valueOf(((Object) (zza2.getMessage())))));
	//  109  247:aload           7
	//  110  249:invokevirtual   #335 <Method String DynamiteModule$zza.getMessage()>
	//  111  252:invokestatic    #118 <Method String String.valueOf(Object)>
	//  112  255:astore_3        
				if(((String) (zza1)).length() != 0)
	//* 113  256:aload_3         
	//* 114  257:invokevirtual   #126 <Method int String.length()>
	//* 115  260:ifeq            319
					zza1 = ((zzb.zza) ("Failed to load remote module: ".concat(((String) (zza1)))));
	//  116  263:ldc2            #337 <String "Failed to load remote module: ">
	//  117  266:aload_3         
	//  118  267:invokevirtual   #198 <Method String String.concat(String)>
	//  119  270:astore_3        
				else
	//* 120  271:ldc1            #166 <String "DynamiteModule">
	//* 121  273:aload_3         
	//* 122  274:invokestatic    #189 <Method int Log.w(String, String)>
	//* 123  277:pop             
	//* 124  278:aload           6
	//* 125  280:getfield        #307 <Field int DynamiteModule$zzb$zzb.zzaQD>
	//* 126  283:ifeq            333
	//* 127  286:aload_1         
	//* 128  287:aload_0         
	//* 129  288:aload_2         
	//* 130  289:new             #20  <Class DynamiteModule$8>
	//* 131  292:dup             
	//* 132  293:aload           6
	//* 133  295:getfield        #307 <Field int DynamiteModule$zzb$zzb.zzaQD>
	//* 134  298:invokespecial   #338 <Method void DynamiteModule$8(int)>
	//* 135  301:invokeinterface #303 <Method DynamiteModule$zzb$zzb DynamiteModule$zzb.zza(Context, String, DynamiteModule$zzb$zza)>
	//* 136  306:getfield        #322 <Field int DynamiteModule$zzb$zzb.zzaQF>
	//* 137  309:iconst_m1       
	//* 138  310:icmpne          333
	//* 139  313:aload_0         
	//* 140  314:aload_2         
	//* 141  315:invokestatic    #331 <Method DynamiteModule zzC(Context, String)>
	//* 142  318:areturn         
					zza1 = ((zzb.zza) (new String("Failed to load remote module: ")));
	//  143  319:new             #114 <Class String>
	//  144  322:dup             
	//  145  323:ldc2            #337 <String "Failed to load remote module: ">
	//  146  326:invokespecial   #201 <Method void String(String)>
	//  147  329:astore_3        
				Log.w("DynamiteModule", ((String) (zza1)));
				if(zzb2.zzaQD != 0 && zzb1.zza(context, s, new zzb.zza(zzb2.zzaQD) {

		public int zzA(Context context1, String s1)
		{
			return zzaQC;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int zzaQC>
		//    2    4:ireturn         
		}

		public DynamiteModule zza(Context context1, String s1, int j1)
			throws zza
		{
			throw new zza("local only VersionPolicy should not load from remote");
		//    0    0:new             #26  <Class DynamiteModule$zza>
		//    1    3:dup             
		//    2    4:ldc1            #28  <String "local only VersionPolicy should not load from remote">
		//    3    6:aconst_null     
		//    4    7:invokespecial   #31  <Method void DynamiteModule$zza(String, DynamiteModule$1)>
		//    5   10:athrow          
		}

		public int zzb(Context context1, String s1, boolean flag)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		final int zzaQC;

			
			{
				zzaQC = i;
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:putfield        #17  <Field int zzaQC>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}
).zzaQF == -1)
					return zzC(context, s);
				else
	//* 148  330:goto            271
					throw new zza("Remote load failed. No local fallback found.", ((Throwable) (zza2)));
	//  149  333:new             #27  <Class DynamiteModule$zza>
	//  150  336:dup             
	//  151  337:ldc2            #340 <String "Remote load failed. No local fallback found.">
	//  152  340:aload           7
	//  153  342:aconst_null     
	//  154  343:invokespecial   #343 <Method void DynamiteModule$zza(String, Throwable, DynamiteModule$1)>
	//  155  346:athrow          
			}
			return ((DynamiteModule) (zza1));
		} else
		{
			int k = zzb2.zzaQF;
	//  156  347:aload           6
	//  157  349:getfield        #322 <Field int DynamiteModule$zzb$zzb.zzaQF>
	//  158  352:istore          4
			throw new zza((new StringBuilder(47)).append("VersionPolicy returned invalid code:").append(k).toString());
	//  159  354:new             #27  <Class DynamiteModule$zza>
	//  160  357:dup             
	//  161  358:new             #122 <Class StringBuilder>
	//  162  361:dup             
	//  163  362:bipush          47
	//  164  364:invokespecial   #129 <Method void StringBuilder(int)>
	//  165  367:ldc2            #345 <String "VersionPolicy returned invalid code:">
	//  166  370:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//  167  373:iload           4
	//  168  375:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//  169  378:invokevirtual   #139 <Method String StringBuilder.toString()>
	//  170  381:aconst_null     
	//  171  382:invokespecial   #329 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//  172  385:athrow          
		}
	}

	private static DynamiteModule zza(Context context, String s, int i)
		throws zza
	{
		Log.i("DynamiteModule", (new StringBuilder(String.valueOf(((Object) (s))).length() + 51)).append("Selected remote version of ").append(s).append(", version >= ").append(i).toString());
	//    0    0:ldc1            #166 <String "DynamiteModule">
	//    1    2:new             #122 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:aload_1         
	//    4    7:invokestatic    #118 <Method String String.valueOf(Object)>
	//    5   10:invokevirtual   #126 <Method int String.length()>
	//    6   13:bipush          51
	//    7   15:iadd            
	//    8   16:invokespecial   #129 <Method void StringBuilder(int)>
	//    9   19:ldc2            #349 <String "Selected remote version of ">
	//   10   22:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:ldc2            #351 <String ", version >= ">
	//   14   32:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:iload_2         
	//   16   36:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//   17   39:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   18   42:invokestatic    #212 <Method int Log.i(String, String)>
	//   19   45:pop             
		com.google.android.gms.dynamite.zza zza1 = zzaU(context);
	//   20   46:aload_0         
	//   21   47:invokestatic    #355 <Method zza zzaU(Context)>
	//   22   50:astore_3        
		if(zza1 == null)
	//*  23   51:aload_3         
	//*  24   52:ifnonnull       67
			throw new zza("Failed to create IDynamiteLoader.");
	//   25   55:new             #27  <Class DynamiteModule$zza>
	//   26   58:dup             
	//   27   59:ldc2            #357 <String "Failed to create IDynamiteLoader.">
	//   28   62:aconst_null     
	//   29   63:invokespecial   #329 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   30   66:athrow          
		try
		{
			context = ((Context) (zza1.zza(zze.zzA(((Object) (context))), s, i)));
	//   31   67:aload_3         
	//   32   68:aload_0         
	//   33   69:invokestatic    #275 <Method com.google.android.gms.dynamic.zzd zze.zzA(Object)>
	//   34   72:aload_1         
	//   35   73:iload_2         
	//   36   74:invokeinterface #362 <Method com.google.android.gms.dynamic.zzd zza.zza(com.google.android.gms.dynamic.zzd, String, int)>
	//   37   79:astore_0        
		}
	//*  38   80:aload_0         
	//*  39   81:invokestatic    #284 <Method Object zze.zzE(com.google.android.gms.dynamic.zzd)>
	//*  40   84:ifnonnull       113
	//*  41   87:new             #27  <Class DynamiteModule$zza>
	//*  42   90:dup             
	//*  43   91:ldc2            #364 <String "Failed to load remote module.">
	//*  44   94:aconst_null     
	//*  45   95:invokespecial   #329 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//*  46   98:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  47   99:astore_0        
		{
			throw new zza("Failed to load remote module.", ((Throwable) (context)));
	//   48  100:new             #27  <Class DynamiteModule$zza>
	//   49  103:dup             
	//   50  104:ldc2            #364 <String "Failed to load remote module.">
	//   51  107:aload_0         
	//   52  108:aconst_null     
	//   53  109:invokespecial   #343 <Method void DynamiteModule$zza(String, Throwable, DynamiteModule$1)>
	//   54  112:athrow          
		}
		if(zze.zzE(((com.google.android.gms.dynamic.zzd) (context))) == null)
			throw new zza("Failed to load remote module.");
		else
			return new DynamiteModule((Context)zze.zzE(((com.google.android.gms.dynamic.zzd) (context))));
	//   55  113:new             #2   <Class DynamiteModule>
	//   56  116:dup             
	//   57  117:aload_0         
	//   58  118:invokestatic    #284 <Method Object zze.zzE(com.google.android.gms.dynamic.zzd)>
	//   59  121:checkcast       #94  <Class Context>
	//   60  124:invokespecial   #214 <Method void DynamiteModule(Context)>
	//   61  127:areturn         
	}

	private static com.google.android.gms.dynamite.zza zzaU(Context context)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzaQr == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    3:getstatic       #366 <Field zza zzaQr>
	//    3    6:ifnull          18
		context = ((Context) (zzaQr));
	//    4    9:getstatic       #366 <Field zza zzaQr>
	//    5   12:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//    6   13:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    7   15:monitorexit     
		return ((com.google.android.gms.dynamite.zza) (context));
	//    8   16:aload_0         
	//    9   17:areturn         
		if(com.google.android.gms.common.zzc.zzuz().isGooglePlayServicesAvailable(context) == 0)
			break MISSING_BLOCK_LABEL_33;
	//   10   18:invokestatic    #372 <Method zzc zzc.zzuz()>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #376 <Method int zzc.isGooglePlayServicesAvailable(Context)>
	//   13   25:ifeq            33
		com/google/android/gms/dynamite/DynamiteModule;
	//   14   28:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   15   30:monitorexit     
		return null;
	//   16   31:aconst_null     
	//   17   32:areturn         
		context = ((Context) (com.google.android.gms.dynamite.zza.zza.zzce((IBinder)context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance())));
	//   18   33:aload_0         
	//   19   34:ldc2            #290 <String "com.google.android.gms">
	//   20   37:iconst_3        
	//   21   38:invokevirtual   #380 <Method Context Context.createPackageContext(String, int)>
	//   22   41:invokevirtual   #110 <Method ClassLoader Context.getClassLoader()>
	//   23   44:ldc2            #382 <String "com.google.android.gms.chimera.container.DynamiteLoaderImpl">
	//   24   47:invokevirtual   #145 <Method Class ClassLoader.loadClass(String)>
	//   25   50:invokevirtual   #385 <Method Object Class.newInstance()>
	//   26   53:checkcast       #264 <Class IBinder>
	//   27   56:invokestatic    #391 <Method zza zza$zza.zzce(IBinder)>
	//   28   59:astore_0        
		if(context == null) goto _L2; else goto _L1
	//   29   60:aload_0         
	//   30   61:ifnull          110
_L1:
		zzaQr = ((com.google.android.gms.dynamite.zza) (context));
	//   31   64:aload_0         
	//   32   65:putstatic       #366 <Field zza zzaQr>
		com/google/android/gms/dynamite/DynamiteModule;
	//   33   68:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   34   70:monitorexit     
		return ((com.google.android.gms.dynamite.zza) (context));
	//   35   71:aload_0         
	//   36   72:areturn         
		context;
	//   37   73:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   38   74:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   39   76:monitorexit     
		throw context;
	//   40   77:aload_0         
	//   41   78:athrow          
		context;
	//   42   79:astore_0        
		context = ((Context) (String.valueOf(((Object) (((Exception) (context)).getMessage())))));
	//   43   80:aload_0         
	//   44   81:invokevirtual   #192 <Method String Exception.getMessage()>
	//   45   84:invokestatic    #118 <Method String String.valueOf(Object)>
	//   46   87:astore_0        
		if(((String) (context)).length() == 0)
			break MISSING_BLOCK_LABEL_115;
	//   47   88:aload_0         
	//   48   89:invokevirtual   #126 <Method int String.length()>
	//   49   92:ifeq            115
		context = ((Context) ("Failed to load IDynamiteLoader from GmsCore: ".concat(((String) (context)))));
	//   50   95:ldc2            #393 <String "Failed to load IDynamiteLoader from GmsCore: ">
	//   51   98:aload_0         
	//   52   99:invokevirtual   #198 <Method String String.concat(String)>
	//   53  102:astore_0        
_L3:
		Log.e("DynamiteModule", ((String) (context)));
	//   54  103:ldc1            #166 <String "DynamiteModule">
	//   55  105:aload_0         
	//   56  106:invokestatic    #178 <Method int Log.e(String, String)>
	//   57  109:pop             
_L2:
		com/google/android/gms/dynamite/DynamiteModule;
	//   58  110:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   59  112:monitorexit     
		return null;
	//   60  113:aconst_null     
	//   61  114:areturn         
		context = ((Context) (new String("Failed to load IDynamiteLoader from GmsCore: ")));
	//   62  115:new             #114 <Class String>
	//   63  118:dup             
	//   64  119:ldc2            #393 <String "Failed to load IDynamiteLoader from GmsCore: ">
	//   65  122:invokespecial   #201 <Method void String(String)>
	//   66  125:astore_0        
		  goto _L3
	//*  67  126:goto            103
	}

	public static int zzb(Context context, String s, boolean flag)
	{
		com.google.android.gms.dynamite.zza zza1 = zzaU(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #355 <Method zza zzaU(Context)>
	//    2    4:astore          4
		if(zza1 == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		int i;
		try
		{
			i = zza1.zza(zze.zzA(((Object) (context))), s, flag);
	//    7   13:aload           4
	//    8   15:aload_0         
	//    9   16:invokestatic    #275 <Method com.google.android.gms.dynamic.zzd zze.zzA(Object)>
	//   10   19:aload_1         
	//   11   20:iload_2         
	//   12   21:invokeinterface #396 <Method int zza.zza(com.google.android.gms.dynamic.zzd, String, boolean)>
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
	//   18   31:invokevirtual   #397 <Method String RemoteException.getMessage()>
	//   19   34:invokestatic    #118 <Method String String.valueOf(Object)>
	//   20   37:astore_0        
			if(((String) (context)).length() != 0)
	//*  21   38:aload_0         
	//*  22   39:invokevirtual   #126 <Method int String.length()>
	//*  23   42:ifeq            62
				context = ((Context) ("Failed to retrieve remote module version: ".concat(((String) (context)))));
	//   24   45:ldc2            #399 <String "Failed to retrieve remote module version: ">
	//   25   48:aload_0         
	//   26   49:invokevirtual   #198 <Method String String.concat(String)>
	//   27   52:astore_0        
			else
	//*  28   53:ldc1            #166 <String "DynamiteModule">
	//*  29   55:aload_0         
	//*  30   56:invokestatic    #189 <Method int Log.w(String, String)>
	//*  31   59:pop             
	//*  32   60:iconst_0        
	//*  33   61:ireturn         
				context = ((Context) (new String("Failed to retrieve remote module version: ")));
	//   34   62:new             #114 <Class String>
	//   35   65:dup             
	//   36   66:ldc2            #399 <String "Failed to retrieve remote module version: ">
	//   37   69:invokespecial   #201 <Method void String(String)>
	//   38   72:astore_0        
			Log.w("DynamiteModule", ((String) (context)));
			return 0;
		}
		return i;
	//*  39   73:goto            53
	}

	private static DynamiteModule zzb(Context context, String s, int i)
		throws zza
	{
		Log.i("DynamiteModule", (new StringBuilder(String.valueOf(((Object) (s))).length() + 51)).append("Selected remote version of ").append(s).append(", version >= ").append(i).toString());
	//    0    0:ldc1            #166 <String "DynamiteModule">
	//    1    2:new             #122 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:aload_1         
	//    4    7:invokestatic    #118 <Method String String.valueOf(Object)>
	//    5   10:invokevirtual   #126 <Method int String.length()>
	//    6   13:bipush          51
	//    7   15:iadd            
	//    8   16:invokespecial   #129 <Method void StringBuilder(int)>
	//    9   19:ldc2            #349 <String "Selected remote version of ">
	//   10   22:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:ldc2            #351 <String ", version >= ">
	//   14   32:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:iload_2         
	//   16   36:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//   17   39:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   18   42:invokestatic    #212 <Method int Log.i(String, String)>
	//   19   45:pop             
		com/google/android/gms/dynamite/DynamiteModule;
	//   20   46:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//   21   48:monitorenter    
		byte abyte0[];
		String s1;
		abyte0 = (byte[])zzaQs.get(((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 12)).append(s).append(":").append(i).toString())));
	//   22   49:getstatic       #62  <Field HashMap zzaQs>
	//   23   52:new             #122 <Class StringBuilder>
	//   24   55:dup             
	//   25   56:aload_1         
	//   26   57:invokestatic    #118 <Method String String.valueOf(Object)>
	//   27   60:invokevirtual   #126 <Method int String.length()>
	//   28   63:bipush          12
	//   29   65:iadd            
	//   30   66:invokespecial   #129 <Method void StringBuilder(int)>
	//   31   69:aload_1         
	//   32   70:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:ldc2            #314 <String ":">
	//   34   76:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   35   79:iload_2         
	//   36   80:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//   37   83:invokevirtual   #139 <Method String StringBuilder.toString()>
	//   38   86:invokevirtual   #400 <Method Object HashMap.get(Object)>
	//   39   89:checkcast       #402 <Class byte[]>
	//   40   92:astore_3        
		s1 = zzaQt;
	//   41   93:getstatic       #404 <Field String zzaQt>
	//   42   96:astore          4
		com/google/android/gms/dynamite/DynamiteModule;
	//   43   98:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   44  100:monitorexit     
		if(abyte0 == null)
	//*  45  101:aload_3         
	//*  46  102:ifnonnull       123
			throw new zza("Module implementation could not be found.");
	//   47  105:new             #27  <Class DynamiteModule$zza>
	//   48  108:dup             
	//   49  109:ldc2            #406 <String "Module implementation could not be found.">
	//   50  112:aconst_null     
	//   51  113:invokespecial   #329 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   52  116:athrow          
		break MISSING_BLOCK_LABEL_123;
		context;
	//   53  117:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//   54  118:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   55  120:monitorexit     
		throw context;
	//   56  121:aload_0         
	//   57  122:athrow          
		context = zza(context.getApplicationContext(), s, abyte0, s1);
	//   58  123:aload_0         
	//   59  124:invokevirtual   #106 <Method Context Context.getApplicationContext()>
	//   60  127:aload_1         
	//   61  128:aload_3         
	//   62  129:aload           4
	//   63  131:invokestatic    #408 <Method Context zza(Context, String, byte[], String)>
	//   64  134:astore_0        
		if(context == null)
	//*  65  135:aload_0         
	//*  66  136:ifnonnull       151
			throw new zza("Failed to get module context");
	//   67  139:new             #27  <Class DynamiteModule$zza>
	//   68  142:dup             
	//   69  143:ldc2            #410 <String "Failed to get module context">
	//   70  146:aconst_null     
	//   71  147:invokespecial   #329 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   72  150:athrow          
		else
			return new DynamiteModule(context);
	//   73  151:new             #2   <Class DynamiteModule>
	//   74  154:dup             
	//   75  155:aload_0         
	//   76  156:invokespecial   #214 <Method void DynamiteModule(Context)>
	//   77  159:areturn         
	}

	public static int zzc(Context context, String s, boolean flag)
		throws zza
	{
		Object obj;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		String s1;
		if(flag)
	//*   2    3:iload_2         
	//*   3    4:ifeq            145
			obj = "api_force_staging";
	//    4    7:ldc2            #413 <String "api_force_staging">
	//    5   10:astore          4
		else
	//*   6   12:ldc2            #415 <String "content://com.google.android.gms.chimera/">
	//*   7   15:invokestatic    #118 <Method String String.valueOf(Object)>
	//*   8   18:astore          6
	//*   9   20:new             #122 <Class StringBuilder>
	//*  10   23:dup             
	//*  11   24:aload           6
	//*  12   26:invokestatic    #118 <Method String String.valueOf(Object)>
	//*  13   29:invokevirtual   #126 <Method int String.length()>
	//*  14   32:iconst_1        
	//*  15   33:iadd            
	//*  16   34:aload           4
	//*  17   36:invokestatic    #118 <Method String String.valueOf(Object)>
	//*  18   39:invokevirtual   #126 <Method int String.length()>
	//*  19   42:iadd            
	//*  20   43:aload_1         
	//*  21   44:invokestatic    #118 <Method String String.valueOf(Object)>
	//*  22   47:invokevirtual   #126 <Method int String.length()>
	//*  23   50:iadd            
	//*  24   51:invokespecial   #129 <Method void StringBuilder(int)>
	//*  25   54:aload           6
	//*  26   56:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//*  27   59:aload           4
	//*  28   61:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//*  29   64:ldc2            #417 <String "/">
	//*  30   67:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//*  31   70:aload_1         
	//*  32   71:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//*  33   74:invokevirtual   #139 <Method String StringBuilder.toString()>
	//*  34   77:invokestatic    #423 <Method Uri Uri.parse(String)>
	//*  35   80:astore          4
	//*  36   82:aload_0         
	//*  37   83:ifnull          95
	//*  38   86:aload_0         
	//*  39   87:invokevirtual   #427 <Method ContentResolver Context.getContentResolver()>
	//*  40   90:astore_0        
	//*  41   91:aload_0         
	//*  42   92:ifnonnull       153
	//*  43   95:new             #27  <Class DynamiteModule$zza>
	//*  44   98:dup             
	//*  45   99:ldc2            #429 <String "Failed to get dynamite module ContentResolver.">
	//*  46  102:aconst_null     
	//*  47  103:invokespecial   #329 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//*  48  106:athrow          
	//*  49  107:astore_1        
	//*  50  108:aconst_null     
	//*  51  109:astore          4
	//*  52  111:aload           4
	//*  53  113:astore_0        
	//*  54  114:aload_1         
	//*  55  115:instanceof      #27  <Class DynamiteModule$zza>
	//*  56  118:ifeq            324
	//*  57  121:aload           4
	//*  58  123:astore_0        
	//*  59  124:aload_1         
	//*  60  125:athrow          
	//*  61  126:astore          4
	//*  62  128:aload_0         
	//*  63  129:astore_1        
	//*  64  130:aload           4
	//*  65  132:astore_0        
	//*  66  133:aload_1         
	//*  67  134:ifnull          143
	//*  68  137:aload_1         
	//*  69  138:invokeinterface #434 <Method void Cursor.close()>
	//*  70  143:aload_0         
	//*  71  144:athrow          
			obj = "api";
	//   72  145:ldc2            #436 <String "api">
	//   73  148:astore          4
		s1 = String.valueOf("content://com.google.android.gms.chimera/");
		obj = ((Object) (Uri.parse((new StringBuilder(String.valueOf(((Object) (s1))).length() + 1 + String.valueOf(obj).length() + String.valueOf(((Object) (s))).length())).append(s1).append(((String) (obj))).append("/").append(s).toString())));
		if(context == null) goto _L2; else goto _L1
_L1:
		context = ((Context) (context.getContentResolver()));
		if(context != null) goto _L3; else goto _L2
_L2:
		try
		{
			throw new zza("Failed to get dynamite module ContentResolver.");
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			obj = null;
		}
_L6:
		context = ((Context) (obj));
		if(!(s instanceof zza)) goto _L5; else goto _L4
_L4:
		context = ((Context) (obj));
		throw s;
		obj;
		s = ((String) (context));
		context = ((Context) (obj));
_L9:
		if(s != null)
			((Cursor) (s)).close();
		throw context;
	//*  74  150:goto            12
_L3:
		obj = ((Object) (((ContentResolver) (context)).query(((Uri) (obj)), ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)))));
	//   75  153:aload_0         
	//   76  154:aload           4
	//   77  156:aconst_null     
	//   78  157:aconst_null     
	//   79  158:aconst_null     
	//   80  159:aconst_null     
	//   81  160:invokevirtual   #442 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   82  163:astore          4
		if(obj == null)
			break MISSING_BLOCK_LABEL_183;
	//   83  165:aload           4
	//   84  167:ifnull          183
		context = ((Context) (obj));
	//   85  170:aload           4
	//   86  172:astore_0        
		if(((Cursor) (obj)).moveToFirst())
			break MISSING_BLOCK_LABEL_210;
	//   87  173:aload           4
	//   88  175:invokeinterface #445 <Method boolean Cursor.moveToFirst()>
	//   89  180:ifne            210
		context = ((Context) (obj));
	//   90  183:aload           4
	//   91  185:astore_0        
		Log.w("DynamiteModule", "Failed to retrieve remote module version.");
	//   92  186:ldc1            #166 <String "DynamiteModule">
	//   93  188:ldc2            #447 <String "Failed to retrieve remote module version.">
	//   94  191:invokestatic    #189 <Method int Log.w(String, String)>
	//   95  194:pop             
		context = ((Context) (obj));
	//   96  195:aload           4
	//   97  197:astore_0        
		int i;
		try
		{
			throw new zza("Failed to connect to dynamite module ContentResolver.");
	//   98  198:new             #27  <Class DynamiteModule$zza>
	//   99  201:dup             
	//  100  202:ldc2            #449 <String "Failed to connect to dynamite module ContentResolver.">
	//  101  205:aconst_null     
	//  102  206:invokespecial   #329 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//  103  209:athrow          
		}
	//* 104  210:aload           4
	//* 105  212:astore_0        
	//* 106  213:aload           4
	//* 107  215:iconst_0        
	//* 108  216:invokeinterface #452 <Method int Cursor.getInt(int)>
	//* 109  221:istore_3        
	//* 110  222:iload_3         
	//* 111  223:ifle            301
	//* 112  226:aload           4
	//* 113  228:astore_0        
	//* 114  229:ldc1            #2   <Class DynamiteModule>
	//* 115  231:monitorenter    
	//* 116  232:aload           4
	//* 117  234:iconst_3        
	//* 118  235:invokeinterface #456 <Method String Cursor.getString(int)>
	//* 119  240:iconst_0        
	//* 120  241:invokestatic    #462 <Method byte[] Base64.decode(String, int)>
	//* 121  244:astore_0        
	//* 122  245:getstatic       #62  <Field HashMap zzaQs>
	//* 123  248:new             #122 <Class StringBuilder>
	//* 124  251:dup             
	//* 125  252:aload_1         
	//* 126  253:invokestatic    #118 <Method String String.valueOf(Object)>
	//* 127  256:invokevirtual   #126 <Method int String.length()>
	//* 128  259:bipush          12
	//* 129  261:iadd            
	//* 130  262:invokespecial   #129 <Method void StringBuilder(int)>
	//* 131  265:aload_1         
	//* 132  266:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//* 133  269:ldc2            #314 <String ":">
	//* 134  272:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//* 135  275:iload_3         
	//* 136  276:invokevirtual   #317 <Method StringBuilder StringBuilder.append(int)>
	//* 137  279:invokevirtual   #139 <Method String StringBuilder.toString()>
	//* 138  282:aload_0         
	//* 139  283:invokevirtual   #466 <Method Object HashMap.put(Object, Object)>
	//* 140  286:pop             
	//* 141  287:aload           4
	//* 142  289:iconst_2        
	//* 143  290:invokeinterface #456 <Method String Cursor.getString(int)>
	//* 144  295:putstatic       #404 <Field String zzaQt>
	//* 145  298:ldc1            #2   <Class DynamiteModule>
	//* 146  300:monitorexit     
	//* 147  301:aload           4
	//* 148  303:ifnull          313
	//* 149  306:aload           4
	//* 150  308:invokeinterface #434 <Method void Cursor.close()>
	//* 151  313:iload_3         
	//* 152  314:ireturn         
	//* 153  315:astore_1        
	//* 154  316:ldc1            #2   <Class DynamiteModule>
	//* 155  318:monitorexit     
	//* 156  319:aload           4
	//* 157  321:astore_0        
	//* 158  322:aload_1         
	//* 159  323:athrow          
	//* 160  324:aload           4
	//* 161  326:astore_0        
	//* 162  327:new             #27  <Class DynamiteModule$zza>
	//* 163  330:dup             
	//* 164  331:ldc2            #468 <String "V2 version check failed">
	//* 165  334:aload_1         
	//* 166  335:aconst_null     
	//* 167  336:invokespecial   #343 <Method void DynamiteModule$zza(String, Throwable, DynamiteModule$1)>
	//* 168  339:athrow          
	//* 169  340:astore_0        
	//* 170  341:aload           5
	//* 171  343:astore_1        
	//* 172  344:goto            133
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//  173  347:astore_1        
		  goto _L6
		context = ((Context) (obj));
		i = ((Cursor) (obj)).getInt(0);
		if(i <= 0) goto _L8; else goto _L7
_L7:
		context = ((Context) (obj));
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorenter ;
		context = ((Context) (Base64.decode(((Cursor) (obj)).getString(3), 0)));
		zzaQs.put(((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 12)).append(s).append(":").append(i).toString())), ((Object) (context)));
		zzaQt = ((Cursor) (obj)).getString(2);
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
_L8:
		if(obj != null)
			((Cursor) (obj)).close();
		return i;
		s;
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		context = ((Context) (obj));
		throw s;
_L5:
		context = ((Context) (obj));
		throw new zza("V2 version check failed", ((Throwable) (s)));
		context;
		s = ((String) (obj1));
		  goto _L9
	//* 174  348:goto            111
	}

	static DynamiteModule zzc(Context context, String s, int i)
		throws zza
	{
		return zza(context, s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #469 <Method DynamiteModule zza(Context, String, int)>
	//    4    6:areturn         
	}

	static DynamiteModule zzd(Context context, String s, int i)
		throws zza
	{
		return zzb(context, s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #472 <Method DynamiteModule zzb(Context, String, int)>
	//    4    6:areturn         
	}

	public Context zzBd()
	{
		return zzaQB;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field Context zzaQB>
	//    2    4:areturn         
	}

	public IBinder zzdX(String s)
		throws zza
	{
		IBinder ibinder = (IBinder)zzaQB.getClassLoader().loadClass(s).newInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field Context zzaQB>
	//    2    4:invokevirtual   #110 <Method ClassLoader Context.getClassLoader()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #145 <Method Class ClassLoader.loadClass(String)>
	//    5   11:invokevirtual   #385 <Method Object Class.newInstance()>
	//    6   14:checkcast       #264 <Class IBinder>
	//    7   17:astore_2        
		return ibinder;
	//    8   18:aload_2         
	//    9   19:areturn         
		Object obj;
		obj;
	//   10   20:astore_2        
_L2:
		s = String.valueOf(((Object) (s)));
	//   11   21:aload_1         
	//   12   22:invokestatic    #118 <Method String String.valueOf(Object)>
	//   13   25:astore_1        
		if(s.length() != 0)
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #126 <Method int String.length()>
	//*  16   30:ifeq            52
			s = "Failed to instantiate module class: ".concat(s);
	//   17   33:ldc2            #479 <String "Failed to instantiate module class: ">
	//   18   36:aload_1         
	//   19   37:invokevirtual   #198 <Method String String.concat(String)>
	//   20   40:astore_1        
		else
	//*  21   41:new             #27  <Class DynamiteModule$zza>
	//*  22   44:dup             
	//*  23   45:aload_1         
	//*  24   46:aload_2         
	//*  25   47:aconst_null     
	//*  26   48:invokespecial   #343 <Method void DynamiteModule$zza(String, Throwable, DynamiteModule$1)>
	//*  27   51:athrow          
			s = new String("Failed to instantiate module class: ");
	//   28   52:new             #114 <Class String>
	//   29   55:dup             
	//   30   56:ldc2            #479 <String "Failed to instantiate module class: ">
	//   31   59:invokespecial   #201 <Method void String(String)>
	//   32   62:astore_1        
		throw new zza(s, ((Throwable) (obj)));
	//*  33   63:goto            41
		obj;
	//   34   66:astore_2        
		continue; /* Loop/switch isn't completed */
	//   35   67:goto            21
		obj;
	//   36   70:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  37   71:goto            21
	}

	public static final zzb zzaQA = new zzb() {

		public zzb.zzb zza(Context context, String s, zzb.zza zza1)
			throws zza
		{
			zzb.zzb zzb1 = new zzb.zzb();
		//    0    0:new             #19  <Class DynamiteModule$zzb$zzb>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void DynamiteModule$zzb$zzb()>
		//    3    7:astore          4
			zzb1.zzaQD = zza1.zzA(context, s);
		//    4    9:aload           4
		//    5   11:aload_3         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzA(Context, String)>
		//    9   19:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
			if(zzb1.zzaQD != 0)
		//*  10   22:aload           4
		//*  11   24:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
		//*  12   27:ifeq            69
				zzb1.zzaQE = zza1.zzb(context, s, false);
		//   13   30:aload           4
		//   14   32:aload_3         
		//   15   33:aload_1         
		//   16   34:aload_2         
		//   17   35:iconst_0        
		//   18   36:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   19   41:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
			else
		//*  20   44:aload           4
		//*  21   46:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
		//*  22   49:ifne            86
		//*  23   52:aload           4
		//*  24   54:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
		//*  25   57:ifne            86
		//*  26   60:aload           4
		//*  27   62:iconst_0        
		//*  28   63:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
		//*  29   66:aload           4
		//*  30   68:areturn         
				zzb1.zzaQE = zza1.zzb(context, s, true);
		//   31   69:aload           4
		//   32   71:aload_3         
		//   33   72:aload_1         
		//   34   73:aload_2         
		//   35   74:iconst_1        
		//   36   75:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   37   80:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
			if(zzb1.zzaQD == 0 && zzb1.zzaQE == 0)
			{
				zzb1.zzaQF = 0;
				return zzb1;
			}
		//*  38   83:goto            44
			if(zzb1.zzaQE >= zzb1.zzaQD)
		//*  39   86:aload           4
		//*  40   88:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
		//*  41   91:aload           4
		//*  42   93:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
		//*  43   96:icmplt          108
			{
				zzb1.zzaQF = 1;
		//   44   99:aload           4
		//   45  101:iconst_1        
		//   46  102:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
				return zzb1;
		//   47  105:aload           4
		//   48  107:areturn         
			} else
			{
				zzb1.zzaQF = -1;
		//   49  108:aload           4
		//   50  110:iconst_m1       
		//   51  111:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
				return zzb1;
		//   52  114:aload           4
		//   53  116:areturn         
			}
		}

	}
;
	private static com.google.android.gms.dynamite.zza zzaQr;
	private static final HashMap zzaQs = new HashMap();
	private static String zzaQt;
	private static final zzb.zza zzaQu = new zzb.zza() {

		public int zzA(Context context, String s)
		{
			return DynamiteModule.zzA(context, s);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #17  <Method int DynamiteModule.zzA(Context, String)>
		//    3    5:ireturn         
		}

		public DynamiteModule zza(Context context, String s, int i)
			throws zza
		{
			return com.google.android.gms.dynamite.DynamiteModule.zzc(context, s, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #24  <Method DynamiteModule com.google.android.gms.dynamite.DynamiteModule.zzc(Context, String, int)>
		//    4    6:areturn         
		}

		public int zzb(Context context, String s, boolean flag)
			throws zza
		{
			return DynamiteModule.zzb(context, s, flag);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #29  <Method int DynamiteModule.zzb(Context, String, boolean)>
		//    4    6:ireturn         
		}

	}
;
	private static final zzb.zza zzaQv = new zzb.zza() {

		public int zzA(Context context, String s)
		{
			return DynamiteModule.zzA(context, s);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #17  <Method int DynamiteModule.zzA(Context, String)>
		//    3    5:ireturn         
		}

		public DynamiteModule zza(Context context, String s, int i)
			throws zza
		{
			return DynamiteModule.zzd(context, s, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #24  <Method DynamiteModule DynamiteModule.zzd(Context, String, int)>
		//    4    6:areturn         
		}

		public int zzb(Context context, String s, boolean flag)
			throws zza
		{
			return com.google.android.gms.dynamite.DynamiteModule.zzc(context, s, flag);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #30  <Method int com.google.android.gms.dynamite.DynamiteModule.zzc(Context, String, boolean)>
		//    4    6:ireturn         
		}

	}
;
	public static final zzb zzaQw = new zzb() {

		public zzb.zzb zza(Context context, String s, zzb.zza zza1)
			throws zza
		{
			zzb.zzb zzb1 = new zzb.zzb();
		//    0    0:new             #19  <Class DynamiteModule$zzb$zzb>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void DynamiteModule$zzb$zzb()>
		//    3    7:astore          4
			zzb1.zzaQE = zza1.zzb(context, s, true);
		//    4    9:aload           4
		//    5   11:aload_3         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:iconst_1        
		//    9   15:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   10   20:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQE>
			if(zzb1.zzaQE != 0)
		//*  11   23:aload           4
		//*  12   25:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQE>
		//*  13   28:ifeq            40
			{
				zzb1.zzaQF = 1;
		//   14   31:aload           4
		//   15   33:iconst_1        
		//   16   34:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaQF>
			} else
		//*  17   37:aload           4
		//*  18   39:areturn         
			{
				zzb1.zzaQD = zza1.zzA(context, s);
		//   19   40:aload           4
		//   20   42:aload_3         
		//   21   43:aload_1         
		//   22   44:aload_2         
		//   23   45:invokeinterface #37  <Method int DynamiteModule$zzb$zza.zzA(Context, String)>
		//   24   50:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQD>
				if(zzb1.zzaQD != 0)
		//*  25   53:aload           4
		//*  26   55:getfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQD>
		//*  27   58:ifeq            37
				{
					zzb1.zzaQF = -1;
		//   28   61:aload           4
		//   29   63:iconst_m1       
		//   30   64:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaQF>
					return zzb1;
		//   31   67:aload           4
		//   32   69:areturn         
				}
			}
			return zzb1;
		}

	}
;
	public static final zzb zzaQx = new zzb() {

		public zzb.zzb zza(Context context, String s, zzb.zza zza1)
			throws zza
		{
			zzb.zzb zzb1 = new zzb.zzb();
		//    0    0:new             #19  <Class DynamiteModule$zzb$zzb>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void DynamiteModule$zzb$zzb()>
		//    3    7:astore          4
			zzb1.zzaQD = zza1.zzA(context, s);
		//    4    9:aload           4
		//    5   11:aload_3         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzA(Context, String)>
		//    9   19:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
			if(zzb1.zzaQD != 0)
		//*  10   22:aload           4
		//*  11   24:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
		//*  12   27:ifeq            39
			{
				zzb1.zzaQF = -1;
		//   13   30:aload           4
		//   14   32:iconst_m1       
		//   15   33:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaQF>
			} else
		//*  16   36:aload           4
		//*  17   38:areturn         
			{
				zzb1.zzaQE = zza1.zzb(context, s, true);
		//   18   39:aload           4
		//   19   41:aload_3         
		//   20   42:aload_1         
		//   21   43:aload_2         
		//   22   44:iconst_1        
		//   23   45:invokeinterface #37  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   24   50:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQE>
				if(zzb1.zzaQE != 0)
		//*  25   53:aload           4
		//*  26   55:getfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQE>
		//*  27   58:ifeq            36
				{
					zzb1.zzaQF = 1;
		//   28   61:aload           4
		//   29   63:iconst_1        
		//   30   64:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaQF>
					return zzb1;
		//   31   67:aload           4
		//   32   69:areturn         
				}
			}
			return zzb1;
		}

	}
;
	public static final zzb zzaQy = new zzb() {

		public zzb.zzb zza(Context context, String s, zzb.zza zza1)
			throws zza
		{
			zzb.zzb zzb1 = new zzb.zzb();
		//    0    0:new             #19  <Class DynamiteModule$zzb$zzb>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void DynamiteModule$zzb$zzb()>
		//    3    7:astore          4
			zzb1.zzaQD = zza1.zzA(context, s);
		//    4    9:aload           4
		//    5   11:aload_3         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzA(Context, String)>
		//    9   19:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
			zzb1.zzaQE = zza1.zzb(context, s, true);
		//   10   22:aload           4
		//   11   24:aload_3         
		//   12   25:aload_1         
		//   13   26:aload_2         
		//   14   27:iconst_1        
		//   15   28:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   16   33:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
			if(zzb1.zzaQD == 0 && zzb1.zzaQE == 0)
		//*  17   36:aload           4
		//*  18   38:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
		//*  19   41:ifne            61
		//*  20   44:aload           4
		//*  21   46:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
		//*  22   49:ifne            61
			{
				zzb1.zzaQF = 0;
		//   23   52:aload           4
		//   24   54:iconst_0        
		//   25   55:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
				return zzb1;
		//   26   58:aload           4
		//   27   60:areturn         
			}
			if(zzb1.zzaQD >= zzb1.zzaQE)
		//*  28   61:aload           4
		//*  29   63:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
		//*  30   66:aload           4
		//*  31   68:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
		//*  32   71:icmplt          83
			{
				zzb1.zzaQF = -1;
		//   33   74:aload           4
		//   34   76:iconst_m1       
		//   35   77:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
				return zzb1;
		//   36   80:aload           4
		//   37   82:areturn         
			} else
			{
				zzb1.zzaQF = 1;
		//   38   83:aload           4
		//   39   85:iconst_1        
		//   40   86:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
				return zzb1;
		//   41   89:aload           4
		//   42   91:areturn         
			}
		}

	}
;
	public static final zzb zzaQz = new zzb() {

		public zzb.zzb zza(Context context, String s, zzb.zza zza1)
			throws zza
		{
			zzb.zzb zzb1 = new zzb.zzb();
		//    0    0:new             #19  <Class DynamiteModule$zzb$zzb>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void DynamiteModule$zzb$zzb()>
		//    3    7:astore          4
			zzb1.zzaQD = zza1.zzA(context, s);
		//    4    9:aload           4
		//    5   11:aload_3         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzA(Context, String)>
		//    9   19:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
			zzb1.zzaQE = zza1.zzb(context, s, true);
		//   10   22:aload           4
		//   11   24:aload_3         
		//   12   25:aload_1         
		//   13   26:aload_2         
		//   14   27:iconst_1        
		//   15   28:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   16   33:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
			if(zzb1.zzaQD == 0 && zzb1.zzaQE == 0)
		//*  17   36:aload           4
		//*  18   38:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
		//*  19   41:ifne            61
		//*  20   44:aload           4
		//*  21   46:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
		//*  22   49:ifne            61
			{
				zzb1.zzaQF = 0;
		//   23   52:aload           4
		//   24   54:iconst_0        
		//   25   55:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
				return zzb1;
		//   26   58:aload           4
		//   27   60:areturn         
			}
			if(zzb1.zzaQE >= zzb1.zzaQD)
		//*  28   61:aload           4
		//*  29   63:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaQE>
		//*  30   66:aload           4
		//*  31   68:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaQD>
		//*  32   71:icmplt          83
			{
				zzb1.zzaQF = 1;
		//   33   74:aload           4
		//   34   76:iconst_1        
		//   35   77:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
				return zzb1;
		//   36   80:aload           4
		//   37   82:areturn         
			} else
			{
				zzb1.zzaQF = -1;
		//   38   83:aload           4
		//   39   85:iconst_m1       
		//   40   86:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaQF>
				return zzb1;
		//   41   89:aload           4
		//   42   91:areturn         
			}
		}

	}
;
	private final Context zzaQB;

	static 
	{
	//    0    0:new             #57  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void HashMap()>
	//    3    7:putstatic       #62  <Field HashMap zzaQs>
	//    4   10:new             #6   <Class DynamiteModule$1>
	//    5   13:dup             
	//    6   14:invokespecial   #63  <Method void DynamiteModule$1()>
	//    7   17:putstatic       #65  <Field DynamiteModule$zzb$zza zzaQu>
	//    8   20:new             #8   <Class DynamiteModule$2>
	//    9   23:dup             
	//   10   24:invokespecial   #66  <Method void DynamiteModule$2()>
	//   11   27:putstatic       #68  <Field DynamiteModule$zzb$zza zzaQv>
	//   12   30:new             #10  <Class DynamiteModule$3>
	//   13   33:dup             
	//   14   34:invokespecial   #69  <Method void DynamiteModule$3()>
	//   15   37:putstatic       #71  <Field DynamiteModule$zzb zzaQw>
	//   16   40:new             #12  <Class DynamiteModule$4>
	//   17   43:dup             
	//   18   44:invokespecial   #72  <Method void DynamiteModule$4()>
	//   19   47:putstatic       #74  <Field DynamiteModule$zzb zzaQx>
	//   20   50:new             #14  <Class DynamiteModule$5>
	//   21   53:dup             
	//   22   54:invokespecial   #75  <Method void DynamiteModule$5()>
	//   23   57:putstatic       #77  <Field DynamiteModule$zzb zzaQy>
	//   24   60:new             #16  <Class DynamiteModule$6>
	//   25   63:dup             
	//   26   64:invokespecial   #78  <Method void DynamiteModule$6()>
	//   27   67:putstatic       #80  <Field DynamiteModule$zzb zzaQz>
	//   28   70:new             #18  <Class DynamiteModule$7>
	//   29   73:dup             
	//   30   74:invokespecial   #81  <Method void DynamiteModule$7()>
	//   31   77:putstatic       #83  <Field DynamiteModule$zzb zzaQA>
	//*  32   80:return          
	}
}
