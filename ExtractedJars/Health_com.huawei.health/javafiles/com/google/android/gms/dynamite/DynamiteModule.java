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
import com.google.android.gms.common.zze;
import com.google.android.gms.dynamic.zzd;
import dalvik.system.PathClassLoader;
import java.lang.reflect.*;
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

		public abstract int zzH(Context context, String s);

		public abstract int zzb(Context context, String s, boolean flag)
			throws zza;
	}

	public static class zzb.zzb
	{

		public int zzaSb;
		public int zzaSc;
		public int zzaSd;

		public zzb.zzb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzaSb = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #19  <Field int zzaSb>
			zzaSc = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #21  <Field int zzaSc>
			zzaSd = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #23  <Field int zzaSd>
		//   11   19:return          
		}
	}


	private DynamiteModule(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void Object()>
		zzaRZ = (Context)zzac.zzw(((Object) (context)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #90  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #92  <Class Context>
	//    6   12:putfield        #94  <Field Context zzaRZ>
	//    7   15:return          
	}

	private static ClassLoader zzBT()
	{
		return ((ClassLoader) (new PathClassLoader(zzaRS, ClassLoader.getSystemClassLoader()) {

			protected Class loadClass(String s, boolean flag)
				throws ClassNotFoundException
			{
				if(s.startsWith("java.") || s.startsWith("android."))
					break MISSING_BLOCK_LABEL_26;
			//    0    0:aload_1         
			//    1    1:ldc1            #20  <String "java.">
			//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
			//    3    6:ifne            26
			//    4    9:aload_1         
			//    5   10:ldc1            #28  <String "android.">
			//    6   12:invokevirtual   #26  <Method boolean String.startsWith(String)>
			//    7   15:ifne            26
				Class class1 = findClass(s);
			//    8   18:aload_0         
			//    9   19:aload_1         
			//   10   20:invokevirtual   #32  <Method Class findClass(String)>
			//   11   23:astore_3        
				return class1;
			//   12   24:aload_3         
			//   13   25:areturn         
_L2:
				return super.loadClass(s, flag);
			//   14   26:aload_0         
			//   15   27:aload_1         
			//   16   28:iload_2         
			//   17   29:invokespecial   #34  <Method Class PathClassLoader.loadClass(String, boolean)>
			//   18   32:areturn         
				ClassNotFoundException classnotfoundexception;
				classnotfoundexception;
			//   19   33:astore_3        
				if(true) goto _L2; else goto _L1
_L1:
			//*  20   34:goto            26
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
	//    0    0:new             #20  <Class DynamiteModule$8>
	//    1    3:dup             
	//    2    4:getstatic       #98  <Field String zzaRS>
	//    3    7:invokestatic    #103 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//    4   10:invokespecial   #106 <Method void DynamiteModule$8(String, ClassLoader)>
	//    5   13:areturn         
	}

	public static int zzH(Context context, String s)
	{
		Object obj;
		context = ((Context) (context.getApplicationContext().getClassLoader()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method Context Context.getApplicationContext()>
	//    2    4:invokevirtual   #119 <Method ClassLoader Context.getClassLoader()>
	//    3    7:astore_0        
		obj = ((Object) (String.valueOf("com.google.android.gms.dynamite.descriptors.")));
	//    4    8:ldc1            #121 <String "com.google.android.gms.dynamite.descriptors.">
	//    5   10:invokestatic    #127 <Method String String.valueOf(Object)>
	//    6   13:astore          4
		String s1 = String.valueOf("ModuleDescriptor");
	//    7   15:ldc1            #129 <String "ModuleDescriptor">
	//    8   17:invokestatic    #127 <Method String String.valueOf(Object)>
	//    9   20:astore          5
		int i = String.valueOf(obj).length();
	//   10   22:aload           4
	//   11   24:invokestatic    #127 <Method String String.valueOf(Object)>
	//   12   27:invokevirtual   #133 <Method int String.length()>
	//   13   30:istore_2        
		int k = String.valueOf(((Object) (s))).length();
	//   14   31:aload_1         
	//   15   32:invokestatic    #127 <Method String String.valueOf(Object)>
	//   16   35:invokevirtual   #133 <Method int String.length()>
	//   17   38:istore_3        
		obj = ((Object) (((ClassLoader) (context)).loadClass((new StringBuilder(String.valueOf(((Object) (s1))).length() + (i + 1 + k))).append(((String) (obj))).append(s).append(".").append(s1).toString())));
	//   18   39:aload_0         
	//   19   40:new             #135 <Class StringBuilder>
	//   20   43:dup             
	//   21   44:aload           5
	//   22   46:invokestatic    #127 <Method String String.valueOf(Object)>
	//   23   49:invokevirtual   #133 <Method int String.length()>
	//   24   52:iload_2         
	//   25   53:iconst_1        
	//   26   54:iadd            
	//   27   55:iload_3         
	//   28   56:iadd            
	//   29   57:iadd            
	//   30   58:invokespecial   #138 <Method void StringBuilder(int)>
	//   31   61:aload           4
	//   32   63:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   33   66:aload_1         
	//   34   67:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:ldc1            #144 <String ".">
	//   36   72:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   37   75:aload           5
	//   38   77:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   39   80:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   40   83:invokevirtual   #152 <Method Class ClassLoader.loadClass(String)>
	//   41   86:astore          4
		context = ((Context) (((Class) (obj)).getDeclaredField("MODULE_ID")));
	//   42   88:aload           4
	//   43   90:ldc1            #154 <String "MODULE_ID">
	//   44   92:invokevirtual   #160 <Method Field Class.getDeclaredField(String)>
	//   45   95:astore_0        
		obj = ((Object) (((Class) (obj)).getDeclaredField("MODULE_VERSION")));
	//   46   96:aload           4
	//   47   98:ldc1            #162 <String "MODULE_VERSION">
	//   48  100:invokevirtual   #160 <Method Field Class.getDeclaredField(String)>
	//   49  103:astore          4
		if(((Field) (context)).get(((Object) (null))).equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_187;
	//   50  105:aload_0         
	//   51  106:aconst_null     
	//   52  107:invokevirtual   #167 <Method Object Field.get(Object)>
	//   53  110:aload_1         
	//   54  111:invokevirtual   #171 <Method boolean Object.equals(Object)>
	//   55  114:ifne            187
		context = ((Context) (String.valueOf(((Field) (context)).get(((Object) (null))))));
	//   56  117:aload_0         
	//   57  118:aconst_null     
	//   58  119:invokevirtual   #167 <Method Object Field.get(Object)>
	//   59  122:invokestatic    #127 <Method String String.valueOf(Object)>
	//   60  125:astore_0        
		i = String.valueOf(((Object) (context))).length();
	//   61  126:aload_0         
	//   62  127:invokestatic    #127 <Method String String.valueOf(Object)>
	//   63  130:invokevirtual   #133 <Method int String.length()>
	//   64  133:istore_2        
		Log.e("DynamiteModule", (new StringBuilder(String.valueOf(((Object) (s))).length() + (i + 51))).append("Module descriptor id '").append(((String) (context))).append("' didn't match expected id '").append(s).append("'").toString());
	//   65  134:ldc1            #173 <String "DynamiteModule">
	//   66  136:new             #135 <Class StringBuilder>
	//   67  139:dup             
	//   68  140:aload_1         
	//   69  141:invokestatic    #127 <Method String String.valueOf(Object)>
	//   70  144:invokevirtual   #133 <Method int String.length()>
	//   71  147:iload_2         
	//   72  148:bipush          51
	//   73  150:iadd            
	//   74  151:iadd            
	//   75  152:invokespecial   #138 <Method void StringBuilder(int)>
	//   76  155:ldc1            #175 <String "Module descriptor id '">
	//   77  157:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   78  160:aload_0         
	//   79  161:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   80  164:ldc1            #177 <String "' didn't match expected id '">
	//   81  166:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   82  169:aload_1         
	//   83  170:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   84  173:ldc1            #179 <String "'">
	//   85  175:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   86  178:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   87  181:invokestatic    #185 <Method int Log.e(String, String)>
	//   88  184:pop             
		return 0;
	//   89  185:iconst_0        
	//   90  186:ireturn         
		int j = ((Field) (obj)).getInt(((Object) (null)));
	//   91  187:aload           4
	//   92  189:aconst_null     
	//   93  190:invokevirtual   #189 <Method int Field.getInt(Object)>
	//   94  193:istore_2        
		return j;
	//   95  194:iload_2         
	//   96  195:ireturn         
_L2:
		Log.w("DynamiteModule", (new StringBuilder(String.valueOf(((Object) (s))).length() + 45)).append("Local module descriptor class for ").append(s).append(" not found.").toString());
	//   97  196:ldc1            #173 <String "DynamiteModule">
	//   98  198:new             #135 <Class StringBuilder>
	//   99  201:dup             
	//  100  202:aload_1         
	//  101  203:invokestatic    #127 <Method String String.valueOf(Object)>
	//  102  206:invokevirtual   #133 <Method int String.length()>
	//  103  209:bipush          45
	//  104  211:iadd            
	//  105  212:invokespecial   #138 <Method void StringBuilder(int)>
	//  106  215:ldc1            #191 <String "Local module descriptor class for ">
	//  107  217:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  108  220:aload_1         
	//  109  221:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  110  224:ldc1            #193 <String " not found.">
	//  111  226:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  112  229:invokevirtual   #148 <Method String StringBuilder.toString()>
	//  113  232:invokestatic    #196 <Method int Log.w(String, String)>
	//  114  235:pop             
		break MISSING_BLOCK_LABEL_282;
	//  115  236:goto            282
		context;
	//  116  239:astore_0        
		context = ((Context) (String.valueOf(((Object) (((Exception) (context)).getMessage())))));
	//  117  240:aload_0         
	//  118  241:invokevirtual   #199 <Method String Exception.getMessage()>
	//  119  244:invokestatic    #127 <Method String String.valueOf(Object)>
	//  120  247:astore_0        
		if(((String) (context)).length() != 0)
	//* 121  248:aload_0         
	//* 122  249:invokevirtual   #133 <Method int String.length()>
	//* 123  252:ifeq            265
			context = ((Context) ("Failed to load module descriptor class: ".concat(((String) (context)))));
	//  124  255:ldc1            #201 <String "Failed to load module descriptor class: ">
	//  125  257:aload_0         
	//  126  258:invokevirtual   #205 <Method String String.concat(String)>
	//  127  261:astore_0        
		else
	//* 128  262:goto            275
			context = ((Context) (new String("Failed to load module descriptor class: ")));
	//  129  265:new             #123 <Class String>
	//  130  268:dup             
	//  131  269:ldc1            #201 <String "Failed to load module descriptor class: ">
	//  132  271:invokespecial   #208 <Method void String(String)>
	//  133  274:astore_0        
		Log.e("DynamiteModule", ((String) (context)));
	//  134  275:ldc1            #173 <String "DynamiteModule">
	//  135  277:aload_0         
	//  136  278:invokestatic    #185 <Method int Log.e(String, String)>
	//  137  281:pop             
		return 0;
	//  138  282:iconst_0        
	//  139  283:ireturn         
		context;
	//  140  284:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//* 141  285:goto            196
	}

	public static int zzI(Context context, String s)
	{
		return zzb(context, s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #212 <Method int zzb(Context, String, boolean)>
	//    4    6:ireturn         
	}

	private static DynamiteModule zzJ(Context context, String s)
	{
		s = String.valueOf(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #127 <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		if(s.length() != 0)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #133 <Method int String.length()>
	//*   5    9:ifeq            22
			s = "Selected local version of ".concat(s);
	//    6   12:ldc1            #216 <String "Selected local version of ">
	//    7   14:aload_1         
	//    8   15:invokevirtual   #205 <Method String String.concat(String)>
	//    9   18:astore_1        
		else
	//*  10   19:goto            32
			s = new String("Selected local version of ");
	//   11   22:new             #123 <Class String>
	//   12   25:dup             
	//   13   26:ldc1            #216 <String "Selected local version of ">
	//   14   28:invokespecial   #208 <Method void String(String)>
	//   15   31:astore_1        
		Log.i("DynamiteModule", s);
	//   16   32:ldc1            #173 <String "DynamiteModule">
	//   17   34:aload_1         
	//   18   35:invokestatic    #219 <Method int Log.i(String, String)>
	//   19   38:pop             
		return new DynamiteModule(context.getApplicationContext());
	//   20   39:new             #2   <Class DynamiteModule>
	//   21   42:dup             
	//   22   43:aload_0         
	//   23   44:invokevirtual   #116 <Method Context Context.getApplicationContext()>
	//   24   47:invokespecial   #221 <Method void DynamiteModule(Context)>
	//   25   50:areturn         
	}

	private static Context zza(Context context, String s, byte abyte0[], com.google.android.gms.dynamite.zzb zzb1)
	{
		try
		{
			context = (Context)com.google.android.gms.dynamic.zzd.zzF(zzb1.zza(com.google.android.gms.dynamic.zzd.zzA(((Object) (context))), s, abyte0));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:invokestatic    #228 <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokeinterface #233 <Method com.google.android.gms.dynamic.IObjectWrapper zzb.zza(com.google.android.gms.dynamic.IObjectWrapper, String, byte[])>
	//    6   12:invokestatic    #237 <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
	//    7   15:checkcast       #92  <Class Context>
	//    8   18:astore_0        
		}
	//*   9   19:aload_0         
	//*  10   20:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  11   21:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((Exception) (context)).toString())))));
	//   12   22:aload_0         
	//   13   23:invokevirtual   #238 <Method String Exception.toString()>
	//   14   26:invokestatic    #127 <Method String String.valueOf(Object)>
	//   15   29:astore_0        
			if(((String) (context)).length() != 0)
	//*  16   30:aload_0         
	//*  17   31:invokevirtual   #133 <Method int String.length()>
	//*  18   34:ifeq            47
				context = ((Context) ("Failed to load DynamiteLoader: ".concat(((String) (context)))));
	//   19   37:ldc1            #240 <String "Failed to load DynamiteLoader: ">
	//   20   39:aload_0         
	//   21   40:invokevirtual   #205 <Method String String.concat(String)>
	//   22   43:astore_0        
			else
	//*  23   44:goto            57
				context = ((Context) (new String("Failed to load DynamiteLoader: ")));
	//   24   47:new             #123 <Class String>
	//   25   50:dup             
	//   26   51:ldc1            #240 <String "Failed to load DynamiteLoader: ">
	//   27   53:invokespecial   #208 <Method void String(String)>
	//   28   56:astore_0        
			Log.e("DynamiteModule", ((String) (context)));
	//   29   57:ldc1            #173 <String "DynamiteModule">
	//   30   59:aload_0         
	//   31   60:invokestatic    #185 <Method int Log.e(String, String)>
	//   32   63:pop             
			return null;
	//   33   64:aconst_null     
	//   34   65:areturn         
		}
		return context;
	}

	public static DynamiteModule zza(Context context, zzb zzb1, String s)
		throws zza
	{
		zzb.zzb zzb2 = zzb1.zza(context, s, zzaRT);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:getstatic       #66  <Field DynamiteModule$zzb$zza zzaRT>
	//    4    6:invokeinterface #244 <Method DynamiteModule$zzb$zzb DynamiteModule$zzb.zza(Context, String, DynamiteModule$zzb$zza)>
	//    5   11:astore          7
		int i = zzb2.zzaSb;
	//    6   13:aload           7
	//    7   15:getfield        #248 <Field int DynamiteModule$zzb$zzb.zzaSb>
	//    8   18:istore_3        
		int l = zzb2.zzaSc;
	//    9   19:aload           7
	//   10   21:getfield        #251 <Field int DynamiteModule$zzb$zzb.zzaSc>
	//   11   24:istore          4
		int j1 = String.valueOf(((Object) (s))).length();
	//   12   26:aload_2         
	//   13   27:invokestatic    #127 <Method String String.valueOf(Object)>
	//   14   30:invokevirtual   #133 <Method int String.length()>
	//   15   33:istore          5
		Log.i("DynamiteModule", (new StringBuilder(String.valueOf(((Object) (s))).length() + (j1 + 68))).append("Considering local module ").append(s).append(":").append(i).append(" and remote module ").append(s).append(":").append(l).toString());
	//   16   35:ldc1            #173 <String "DynamiteModule">
	//   17   37:new             #135 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:aload_2         
	//   20   42:invokestatic    #127 <Method String String.valueOf(Object)>
	//   21   45:invokevirtual   #133 <Method int String.length()>
	//   22   48:iload           5
	//   23   50:bipush          68
	//   24   52:iadd            
	//   25   53:iadd            
	//   26   54:invokespecial   #138 <Method void StringBuilder(int)>
	//   27   57:ldc1            #253 <String "Considering local module ">
	//   28   59:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:aload_2         
	//   30   63:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   31   66:ldc1            #255 <String ":">
	//   32   68:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:iload_3         
	//   34   72:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//   35   75:ldc2            #260 <String " and remote module ">
	//   36   78:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   37   81:aload_2         
	//   38   82:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   39   85:ldc1            #255 <String ":">
	//   40   87:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   41   90:iload           4
	//   42   92:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//   43   95:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   44   98:invokestatic    #219 <Method int Log.i(String, String)>
	//   45  101:pop             
		if(zzb2.zzaSd == 0 || zzb2.zzaSd == -1 && zzb2.zzaSb == 0 || zzb2.zzaSd == 1 && zzb2.zzaSc == 0)
	//*  46  102:aload           7
	//*  47  104:getfield        #263 <Field int DynamiteModule$zzb$zzb.zzaSd>
	//*  48  107:ifeq            144
	//*  49  110:aload           7
	//*  50  112:getfield        #263 <Field int DynamiteModule$zzb$zzb.zzaSd>
	//*  51  115:iconst_m1       
	//*  52  116:icmpne          127
	//*  53  119:aload           7
	//*  54  121:getfield        #248 <Field int DynamiteModule$zzb$zzb.zzaSb>
	//*  55  124:ifeq            144
	//*  56  127:aload           7
	//*  57  129:getfield        #263 <Field int DynamiteModule$zzb$zzb.zzaSd>
	//*  58  132:iconst_1        
	//*  59  133:icmpne          204
	//*  60  136:aload           7
	//*  61  138:getfield        #251 <Field int DynamiteModule$zzb$zzb.zzaSc>
	//*  62  141:ifne            204
		{
			int j = zzb2.zzaSb;
	//   63  144:aload           7
	//   64  146:getfield        #248 <Field int DynamiteModule$zzb$zzb.zzaSb>
	//   65  149:istore_3        
			int i1 = zzb2.zzaSc;
	//   66  150:aload           7
	//   67  152:getfield        #251 <Field int DynamiteModule$zzb$zzb.zzaSc>
	//   68  155:istore          4
			throw new zza((new StringBuilder(91)).append("No acceptable module found. Local version is ").append(j).append(" and remote version is ").append(i1).append(".").toString());
	//   69  157:new             #25  <Class DynamiteModule$zza>
	//   70  160:dup             
	//   71  161:new             #135 <Class StringBuilder>
	//   72  164:dup             
	//   73  165:bipush          91
	//   74  167:invokespecial   #138 <Method void StringBuilder(int)>
	//   75  170:ldc2            #265 <String "No acceptable module found. Local version is ">
	//   76  173:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   77  176:iload_3         
	//   78  177:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//   79  180:ldc2            #267 <String " and remote version is ">
	//   80  183:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   81  186:iload           4
	//   82  188:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//   83  191:ldc1            #144 <String ".">
	//   84  193:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   85  196:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   86  199:aconst_null     
	//   87  200:invokespecial   #270 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   88  203:athrow          
		}
		if(zzb2.zzaSd == -1)
	//*  89  204:aload           7
	//*  90  206:getfield        #263 <Field int DynamiteModule$zzb$zzb.zzaSd>
	//*  91  209:iconst_m1       
	//*  92  210:icmpne          219
			return zzJ(context, s);
	//   93  213:aload_0         
	//   94  214:aload_2         
	//   95  215:invokestatic    #272 <Method DynamiteModule zzJ(Context, String)>
	//   96  218:areturn         
		if(zzb2.zzaSd == 1)
	//*  97  219:aload           7
	//*  98  221:getfield        #263 <Field int DynamiteModule$zzb$zzb.zzaSd>
	//*  99  224:iconst_1        
	//* 100  225:icmpne          351
		{
			DynamiteModule dynamitemodule;
			try
			{
				dynamitemodule = zza(context, s, zzb2.zzaSc);
	//  101  228:aload_0         
	//  102  229:aload_2         
	//  103  230:aload           7
	//  104  232:getfield        #251 <Field int DynamiteModule$zzb$zzb.zzaSc>
	//  105  235:invokestatic    #275 <Method DynamiteModule zza(Context, String, int)>
	//  106  238:astore          6
			}
	//* 107  240:aload           6
	//* 108  242:areturn         
			catch(zza zza1)
	//* 109  243:astore          8
			{
				String s1 = String.valueOf(((Object) (zza1.getMessage())));
	//  110  245:aload           8
	//  111  247:invokevirtual   #276 <Method String DynamiteModule$zza.getMessage()>
	//  112  250:invokestatic    #127 <Method String String.valueOf(Object)>
	//  113  253:astore          6
				if(s1.length() != 0)
	//* 114  255:aload           6
	//* 115  257:invokevirtual   #133 <Method int String.length()>
	//* 116  260:ifeq            276
					s1 = "Failed to load remote module: ".concat(s1);
	//  117  263:ldc2            #278 <String "Failed to load remote module: ">
	//  118  266:aload           6
	//  119  268:invokevirtual   #205 <Method String String.concat(String)>
	//  120  271:astore          6
				else
	//* 121  273:goto            288
					s1 = new String("Failed to load remote module: ");
	//  122  276:new             #123 <Class String>
	//  123  279:dup             
	//  124  280:ldc2            #278 <String "Failed to load remote module: ">
	//  125  283:invokespecial   #208 <Method void String(String)>
	//  126  286:astore          6
				Log.w("DynamiteModule", s1);
	//  127  288:ldc1            #173 <String "DynamiteModule">
	//  128  290:aload           6
	//  129  292:invokestatic    #196 <Method int Log.w(String, String)>
	//  130  295:pop             
				if(zzb2.zzaSb != 0 && zzb1.zza(context, s, new zzb.zza(zzb2.zzaSb) {

		public int zzH(Context context1, String s2)
		{
			return zzaSa;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int zzaSa>
		//    2    4:ireturn         
		}

		public int zzb(Context context1, String s2, boolean flag)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		final int zzaSa;

			
			{
				zzaSa = i;
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:putfield        #17  <Field int zzaSa>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}
).zzaSd == -1)
	//* 131  296:aload           7
	//* 132  298:getfield        #248 <Field int DynamiteModule$zzb$zzb.zzaSb>
	//* 133  301:ifeq            337
	//* 134  304:aload_1         
	//* 135  305:aload_0         
	//* 136  306:aload_2         
	//* 137  307:new             #18  <Class DynamiteModule$7>
	//* 138  310:dup             
	//* 139  311:aload           7
	//* 140  313:getfield        #248 <Field int DynamiteModule$zzb$zzb.zzaSb>
	//* 141  316:invokespecial   #279 <Method void DynamiteModule$7(int)>
	//* 142  319:invokeinterface #244 <Method DynamiteModule$zzb$zzb DynamiteModule$zzb.zza(Context, String, DynamiteModule$zzb$zza)>
	//* 143  324:getfield        #263 <Field int DynamiteModule$zzb$zzb.zzaSd>
	//* 144  327:iconst_m1       
	//* 145  328:icmpne          337
					return zzJ(context, s);
	//  146  331:aload_0         
	//  147  332:aload_2         
	//  148  333:invokestatic    #272 <Method DynamiteModule zzJ(Context, String)>
	//  149  336:areturn         
				else
					throw new zza("Remote load failed. No local fallback found.", ((Throwable) (zza1)));
	//  150  337:new             #25  <Class DynamiteModule$zza>
	//  151  340:dup             
	//  152  341:ldc2            #281 <String "Remote load failed. No local fallback found.">
	//  153  344:aload           8
	//  154  346:aconst_null     
	//  155  347:invokespecial   #284 <Method void DynamiteModule$zza(String, Throwable, DynamiteModule$1)>
	//  156  350:athrow          
			}
			return dynamitemodule;
		} else
		{
			int k = zzb2.zzaSd;
	//  157  351:aload           7
	//  158  353:getfield        #263 <Field int DynamiteModule$zzb$zzb.zzaSd>
	//  159  356:istore_3        
			throw new zza((new StringBuilder(47)).append("VersionPolicy returned invalid code:").append(k).toString());
	//  160  357:new             #25  <Class DynamiteModule$zza>
	//  161  360:dup             
	//  162  361:new             #135 <Class StringBuilder>
	//  163  364:dup             
	//  164  365:bipush          47
	//  165  367:invokespecial   #138 <Method void StringBuilder(int)>
	//  166  370:ldc2            #286 <String "VersionPolicy returned invalid code:">
	//  167  373:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//  168  376:iload_3         
	//  169  377:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//  170  380:invokevirtual   #148 <Method String StringBuilder.toString()>
	//  171  383:aconst_null     
	//  172  384:invokespecial   #270 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//  173  387:athrow          
		}
	}

	private static DynamiteModule zza(Context context, String s, int i)
		throws zza
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Boolean boolean1 = zzaRO;
	//    2    3:getstatic       #289 <Field Boolean zzaRO>
	//    3    6:astore_3        
		com/google/android/gms/dynamite/DynamiteModule;
	//    4    7:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		  goto _L1
	//*   6   10:goto            19
		context;
	//    7   13:astore_0        
	//*   8   14:ldc1            #2   <Class DynamiteModule>
		throw context;
	//    9   16:monitorexit     
	//   10   17:aload_0         
	//   11   18:athrow          
_L1:
		if(boolean1 == null)
	//*  12   19:aload_3         
	//*  13   20:ifnonnull       35
			throw new zza("Failed to determine which loading route to use.");
	//   14   23:new             #25  <Class DynamiteModule$zza>
	//   15   26:dup             
	//   16   27:ldc2            #291 <String "Failed to determine which loading route to use.">
	//   17   30:aconst_null     
	//   18   31:invokespecial   #270 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   19   34:athrow          
		if(boolean1.booleanValue())
	//*  20   35:aload_3         
	//*  21   36:invokevirtual   #297 <Method boolean Boolean.booleanValue()>
	//*  22   39:ifeq            49
			return zzc(context, s, i);
	//   23   42:aload_0         
	//   24   43:aload_1         
	//   25   44:iload_2         
	//   26   45:invokestatic    #300 <Method DynamiteModule zzc(Context, String, int)>
	//   27   48:areturn         
		else
			return zzb(context, s, i);
	//   28   49:aload_0         
	//   29   50:aload_1         
	//   30   51:iload_2         
	//   31   52:invokestatic    #302 <Method DynamiteModule zzb(Context, String, int)>
	//   32   55:areturn         
	}

	private static void zza(ClassLoader classloader)
		throws zza
	{
		try
		{
			zzaRQ = com.google.android.gms.dynamite.zzb.zza.zzcf((IBinder)classloader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
	//    0    0:aload_0         
	//    1    1:ldc2            #313 <String "com.google.android.gms.dynamiteloader.DynamiteLoaderV2">
	//    2    4:invokevirtual   #152 <Method Class ClassLoader.loadClass(String)>
	//    3    7:iconst_0        
	//    4    8:anewarray       Class[]
	//    5   11:invokevirtual   #317 <Method Constructor Class.getConstructor(Class[])>
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokevirtual   #323 <Method Object Constructor.newInstance(Object[])>
	//    9   21:checkcast       #325 <Class IBinder>
	//   10   24:invokestatic    #331 <Method zzb zzb$zza.zzcf(IBinder)>
	//   11   27:putstatic       #333 <Field zzb zzaRQ>
			return;
	//   12   30:return          
		}
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
	//*  13   31:astore_0        
		{
			throw new zza("Failed to instantiate dynamite loader", ((Throwable) (classloader)));
	//   14   32:new             #25  <Class DynamiteModule$zza>
	//   15   35:dup             
	//   16   36:ldc2            #335 <String "Failed to instantiate dynamite loader">
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:invokespecial   #284 <Method void DynamiteModule$zza(String, Throwable, DynamiteModule$1)>
	//   20   44:athrow          
		}
	}

	public static int zzb(Context context, String s, boolean flag)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj1 = ((Object) (zzaRO));
	//    2    3:getstatic       #289 <Field Boolean zzaRO>
	//    3    6:astore          6
		Object obj = obj1;
	//    4    8:aload           6
	//    5   10:astore          5
		if(obj1 != null) goto _L2; else goto _L1
	//    6   12:aload           6
	//    7   14:ifnonnull       279
_L1:
		obj1 = ((Object) (context.getApplicationContext().getClassLoader().loadClass(((Class) (com/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader)).getName())));
	//    8   17:aload_0         
	//    9   18:invokevirtual   #116 <Method Context Context.getApplicationContext()>
	//   10   21:invokevirtual   #119 <Method ClassLoader Context.getClassLoader()>
	//   11   24:ldc1            #22  <Class DynamiteModule$DynamiteLoaderClassLoader>
	//   12   26:invokevirtual   #340 <Method String Class.getName()>
	//   13   29:invokevirtual   #152 <Method Class ClassLoader.loadClass(String)>
	//   14   32:astore          6
		obj = ((Object) (((Class) (obj1)).getDeclaredField("sClassLoader")));
	//   15   34:aload           6
	//   16   36:ldc2            #342 <String "sClassLoader">
	//   17   39:invokevirtual   #160 <Method Field Class.getDeclaredField(String)>
	//   18   42:astore          5
		obj1;
	//   19   44:aload           6
		JVM INSTR monitorenter ;
	//   20   46:monitorenter    
		ClassLoader classloader = (ClassLoader)((Field) (obj)).get(((Object) (null)));
	//   21   47:aload           5
	//   22   49:aconst_null     
	//   23   50:invokevirtual   #167 <Method Object Field.get(Object)>
	//   24   53:checkcast       #100 <Class ClassLoader>
	//   25   56:astore          7
		if(classloader == null) goto _L4; else goto _L3
	//   26   58:aload           7
	//   27   60:ifnull          92
_L3:
		if(classloader != ClassLoader.getSystemClassLoader()) goto _L6; else goto _L5
	//   28   63:aload           7
	//   29   65:invokestatic    #103 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//   30   68:if_acmpne       79
_L5:
		obj = ((Object) (Boolean.FALSE));
	//   31   71:getstatic       #345 <Field Boolean Boolean.FALSE>
	//   32   74:astore          5
		  goto _L7
	//*  33   76:goto            205
_L6:
		int i;
		boolean flag1;
		try
		{
			zza(classloader);
	//   34   79:aload           7
	//   35   81:invokestatic    #347 <Method void zza(ClassLoader)>
		}
	//*  36   84:getstatic       #350 <Field Boolean Boolean.TRUE>
	//*  37   87:astore          5
	//*  38   89:goto            205
	//*  39   92:ldc2            #352 <String "com.google.android.gms">
	//*  40   95:aload_0         
	//*  41   96:invokevirtual   #116 <Method Context Context.getApplicationContext()>
	//*  42   99:invokevirtual   #355 <Method String Context.getPackageName()>
	//*  43  102:invokevirtual   #356 <Method boolean String.equals(Object)>
	//*  44  105:ifeq            125
	//*  45  108:aload           5
	//*  46  110:aconst_null     
	//*  47  111:invokestatic    #103 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  48  114:invokevirtual   #360 <Method void Field.set(Object, Object)>
	//*  49  117:getstatic       #345 <Field Boolean Boolean.FALSE>
	//*  50  120:astore          5
	//*  51  122:goto            205
	//*  52  125:aload_0         
	//*  53  126:aload_1         
	//*  54  127:iload_2         
	//*  55  128:invokestatic    #363 <Method int zzd(Context, String, boolean)>
	//*  56  131:istore_3        
	//*  57  132:getstatic       #98  <Field String zzaRS>
	//*  58  135:ifnull          151
	//*  59  138:getstatic       #98  <Field String zzaRS>
	//*  60  141:invokevirtual   #366 <Method boolean String.isEmpty()>
	//*  61  144:istore          4
	//*  62  146:iload           4
	//*  63  148:ifeq            159
	//*  64  151:aload           6
	//*  65  153:monitorexit     
	//*  66  154:ldc1            #2   <Class DynamiteModule>
	//*  67  156:monitorexit     
	//*  68  157:iload_3         
	//*  69  158:ireturn         
	//*  70  159:invokestatic    #368 <Method ClassLoader zzBT()>
	//*  71  162:astore          7
	//*  72  164:aload           7
	//*  73  166:invokestatic    #347 <Method void zza(ClassLoader)>
	//*  74  169:aload           5
	//*  75  171:aconst_null     
	//*  76  172:aload           7
	//*  77  174:invokevirtual   #360 <Method void Field.set(Object, Object)>
	//*  78  177:getstatic       #350 <Field Boolean Boolean.TRUE>
	//*  79  180:putstatic       #289 <Field Boolean zzaRO>
	//*  80  183:aload           6
	//*  81  185:monitorexit     
	//*  82  186:ldc1            #2   <Class DynamiteModule>
	//*  83  188:monitorexit     
	//*  84  189:iload_3         
	//*  85  190:ireturn         
	//*  86  191:aload           5
	//*  87  193:aconst_null     
	//*  88  194:invokestatic    #103 <Method ClassLoader ClassLoader.getSystemClassLoader()>
	//*  89  197:invokevirtual   #360 <Method void Field.set(Object, Object)>
	//*  90  200:getstatic       #345 <Field Boolean Boolean.FALSE>
	//*  91  203:astore          5
	//*  92  205:aload           6
	//*  93  207:monitorexit     
	//*  94  208:goto            219
	//*  95  211:astore          5
	//*  96  213:aload           6
	//*  97  215:monitorexit     
	//*  98  216:aload           5
	//*  99  218:athrow          
	//* 100  219:goto            274
	//* 101  222:astore          5
	//* 102  224:aload           5
	//* 103  226:invokestatic    #127 <Method String String.valueOf(Object)>
	//* 104  229:astore          5
	//* 105  231:ldc1            #173 <String "DynamiteModule">
	//* 106  233:new             #135 <Class StringBuilder>
	//* 107  236:dup             
	//* 108  237:aload           5
	//* 109  239:invokestatic    #127 <Method String String.valueOf(Object)>
	//* 110  242:invokevirtual   #133 <Method int String.length()>
	//* 111  245:bipush          30
	//* 112  247:iadd            
	//* 113  248:invokespecial   #138 <Method void StringBuilder(int)>
	//* 114  251:ldc2            #370 <String "Failed to load module via V2: ">
	//* 115  254:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//* 116  257:aload           5
	//* 117  259:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//* 118  262:invokevirtual   #148 <Method String StringBuilder.toString()>
	//* 119  265:invokestatic    #196 <Method int Log.w(String, String)>
	//* 120  268:pop             
	//* 121  269:getstatic       #345 <Field Boolean Boolean.FALSE>
	//* 122  272:astore          5
	//* 123  274:aload           5
	//* 124  276:putstatic       #289 <Field Boolean zzaRO>
	//* 125  279:ldc1            #2   <Class DynamiteModule>
	//* 126  281:monitorexit     
	//* 127  282:goto            291
	//* 128  285:astore_0        
	//* 129  286:ldc1            #2   <Class DynamiteModule>
	//* 130  288:monitorexit     
	//* 131  289:aload_0         
	//* 132  290:athrow          
	//* 133  291:aload           5
	//* 134  293:invokevirtual   #297 <Method boolean Boolean.booleanValue()>
	//* 135  296:ifeq            355
	//* 136  299:aload_0         
	//* 137  300:aload_1         
	//* 138  301:iload_2         
	//* 139  302:invokestatic    #363 <Method int zzd(Context, String, boolean)>
	//* 140  305:istore_3        
	//* 141  306:iload_3         
	//* 142  307:ireturn         
	//* 143  308:astore_0        
	//* 144  309:aload_0         
	//* 145  310:invokevirtual   #276 <Method String DynamiteModule$zza.getMessage()>
	//* 146  313:invokestatic    #127 <Method String String.valueOf(Object)>
	//* 147  316:astore_0        
	//* 148  317:aload_0         
	//* 149  318:invokevirtual   #133 <Method int String.length()>
	//* 150  321:ifeq            335
	//* 151  324:ldc2            #372 <String "Failed to retrieve remote module version: ">
	//* 152  327:aload_0         
	//* 153  328:invokevirtual   #205 <Method String String.concat(String)>
	//* 154  331:astore_0        
	//* 155  332:goto            346
	//* 156  335:new             #123 <Class String>
	//* 157  338:dup             
	//* 158  339:ldc2            #372 <String "Failed to retrieve remote module version: ">
	//* 159  342:invokespecial   #208 <Method void String(String)>
	//* 160  345:astore_0        
	//* 161  346:ldc1            #173 <String "DynamiteModule">
	//* 162  348:aload_0         
	//* 163  349:invokestatic    #196 <Method int Log.w(String, String)>
	//* 164  352:pop             
	//* 165  353:iconst_0        
	//* 166  354:ireturn         
	//* 167  355:aload_0         
	//* 168  356:aload_1         
	//* 169  357:iload_2         
	//* 170  358:invokestatic    #374 <Method int zzc(Context, String, boolean)>
	//* 171  361:ireturn         
		catch(zza zza1) { }
	//  172  362:astore          5
		obj = ((Object) (Boolean.TRUE));
		  goto _L7
_L4:
		if(!"com.google.android.gms".equals(((Object) (context.getApplicationContext().getPackageName())))) goto _L9; else goto _L8
_L8:
		((Field) (obj)).set(((Object) (null)), ((Object) (ClassLoader.getSystemClassLoader())));
		obj = ((Object) (Boolean.FALSE));
		  goto _L7
_L9:
		i = zzd(context, s, flag);
		if(zzaRS == null)
			break MISSING_BLOCK_LABEL_151;
		flag1 = zzaRS.isEmpty();
		if(!flag1)
			break MISSING_BLOCK_LABEL_159;
		obj1;
		JVM INSTR monitorexit ;
		return i;
		ClassLoader classloader1 = zzBT();
		zza(classloader1);
		((Field) (obj)).set(((Object) (null)), ((Object) (classloader1)));
		zzaRO = Boolean.TRUE;
		obj1;
		JVM INSTR monitorexit ;
		return i;
_L12:
		((Field) (obj)).set(((Object) (null)), ((Object) (ClassLoader.getSystemClassLoader())));
		obj = ((Object) (Boolean.FALSE));
_L7:
		obj1;
		JVM INSTR monitorexit ;
		break MISSING_BLOCK_LABEL_274;
		obj;
		try
		{
			throw obj;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		obj = ((Object) (String.valueOf(obj)));
		Log.w("DynamiteModule", (new StringBuilder(String.valueOf(obj).length() + 30)).append("Failed to load module via V2: ").append(((String) (obj))).toString());
		obj = ((Object) (Boolean.FALSE));
		zzaRO = ((Boolean) (obj));
_L2:
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		  goto _L10
		context;
		throw context;
_L10:
		if(((Boolean) (obj)).booleanValue())
		{
			int j;
			try
			{
				j = zzd(context, s, flag);
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				context = ((Context) (String.valueOf(((Object) (((zza) (context)).getMessage())))));
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
			return zzc(context, s, flag);
		}
	//* 173  364:goto            84
		zza zza2;
		zza2;
	//  174  367:astore          7
		if(true) goto _L12; else goto _L11
	//  175  369:goto            191
_L11:
	}

	private static DynamiteModule zzb(Context context, String s, int i)
		throws zza
	{
		Log.i("DynamiteModule", (new StringBuilder(String.valueOf(((Object) (s))).length() + 51)).append("Selected remote version of ").append(s).append(", version >= ").append(i).toString());
	//    0    0:ldc1            #173 <String "DynamiteModule">
	//    1    2:new             #135 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:aload_1         
	//    4    7:invokestatic    #127 <Method String String.valueOf(Object)>
	//    5   10:invokevirtual   #133 <Method int String.length()>
	//    6   13:bipush          51
	//    7   15:iadd            
	//    8   16:invokespecial   #138 <Method void StringBuilder(int)>
	//    9   19:ldc2            #378 <String "Selected remote version of ">
	//   10   22:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:ldc2            #380 <String ", version >= ">
	//   14   32:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:iload_2         
	//   16   36:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//   17   39:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   18   42:invokestatic    #219 <Method int Log.i(String, String)>
	//   19   45:pop             
		com.google.android.gms.dynamite.zza zza1 = zzbm(context);
	//   20   46:aload_0         
	//   21   47:invokestatic    #384 <Method zza zzbm(Context)>
	//   22   50:astore_3        
		if(zza1 == null)
	//*  23   51:aload_3         
	//*  24   52:ifnonnull       67
			throw new zza("Failed to create IDynamiteLoader.");
	//   25   55:new             #25  <Class DynamiteModule$zza>
	//   26   58:dup             
	//   27   59:ldc2            #386 <String "Failed to create IDynamiteLoader.">
	//   28   62:aconst_null     
	//   29   63:invokespecial   #270 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   30   66:athrow          
		try
		{
			context = ((Context) (zza1.zza(com.google.android.gms.dynamic.zzd.zzA(((Object) (context))), s, i)));
	//   31   67:aload_3         
	//   32   68:aload_0         
	//   33   69:invokestatic    #228 <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   34   72:aload_1         
	//   35   73:iload_2         
	//   36   74:invokeinterface #391 <Method com.google.android.gms.dynamic.IObjectWrapper zza.zza(com.google.android.gms.dynamic.IObjectWrapper, String, int)>
	//   37   79:astore_0        
		}
	//*  38   80:goto            97
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  39   83:astore_0        
		{
			throw new zza("Failed to load remote module.", ((Throwable) (context)));
	//   40   84:new             #25  <Class DynamiteModule$zza>
	//   41   87:dup             
	//   42   88:ldc2            #393 <String "Failed to load remote module.">
	//   43   91:aload_0         
	//   44   92:aconst_null     
	//   45   93:invokespecial   #284 <Method void DynamiteModule$zza(String, Throwable, DynamiteModule$1)>
	//   46   96:athrow          
		}
		if(com.google.android.gms.dynamic.zzd.zzF(((com.google.android.gms.dynamic.IObjectWrapper) (context))) == null)
	//*  47   97:aload_0         
	//*  48   98:invokestatic    #237 <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
	//*  49  101:ifnonnull       116
			throw new zza("Failed to load remote module.");
	//   50  104:new             #25  <Class DynamiteModule$zza>
	//   51  107:dup             
	//   52  108:ldc2            #393 <String "Failed to load remote module.">
	//   53  111:aconst_null     
	//   54  112:invokespecial   #270 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   55  115:athrow          
		else
			return new DynamiteModule((Context)com.google.android.gms.dynamic.zzd.zzF(((com.google.android.gms.dynamic.IObjectWrapper) (context))));
	//   56  116:new             #2   <Class DynamiteModule>
	//   57  119:dup             
	//   58  120:aload_0         
	//   59  121:invokestatic    #237 <Method Object zzd.zzF(com.google.android.gms.dynamic.IObjectWrapper)>
	//   60  124:checkcast       #92  <Class Context>
	//   61  127:invokespecial   #221 <Method void DynamiteModule(Context)>
	//   62  130:areturn         
	}

	private static com.google.android.gms.dynamite.zza zzbm(Context context)
	{
		com/google/android/gms/dynamite/DynamiteModule;
	//    0    0:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzaRP == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    3:getstatic       #395 <Field zza zzaRP>
	//    3    6:ifnull          18
		context = ((Context) (zzaRP));
	//    4    9:getstatic       #395 <Field zza zzaRP>
	//    5   12:astore_0        
		com/google/android/gms/dynamite/DynamiteModule;
	//    6   13:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//    7   15:monitorexit     
		return ((com.google.android.gms.dynamite.zza) (context));
	//    8   16:aload_0         
	//    9   17:areturn         
		int i = com.google.android.gms.common.zze.zzuY().isGooglePlayServicesAvailable(context);
	//   10   18:invokestatic    #401 <Method zze zze.zzuY()>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #405 <Method int zze.isGooglePlayServicesAvailable(Context)>
	//   13   25:istore_1        
		if(i == 0)
			break MISSING_BLOCK_LABEL_35;
	//   14   26:iload_1         
	//   15   27:ifeq            35
		com/google/android/gms/dynamite/DynamiteModule;
	//   16   30:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   17   32:monitorexit     
		return null;
	//   18   33:aconst_null     
	//   19   34:areturn         
		context = ((Context) (com.google.android.gms.dynamite.zza.zza.zzce((IBinder)context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance())));
	//   20   35:aload_0         
	//   21   36:ldc2            #352 <String "com.google.android.gms">
	//   22   39:iconst_3        
	//   23   40:invokevirtual   #409 <Method Context Context.createPackageContext(String, int)>
	//   24   43:invokevirtual   #119 <Method ClassLoader Context.getClassLoader()>
	//   25   46:ldc2            #411 <String "com.google.android.gms.chimera.container.DynamiteLoaderImpl">
	//   26   49:invokevirtual   #152 <Method Class ClassLoader.loadClass(String)>
	//   27   52:invokevirtual   #414 <Method Object Class.newInstance()>
	//   28   55:checkcast       #325 <Class IBinder>
	//   29   58:invokestatic    #420 <Method zza zza$zza.zzce(IBinder)>
	//   30   61:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_123;
	//   31   62:aload_0         
	//   32   63:ifnull          75
		zzaRP = ((com.google.android.gms.dynamite.zza) (context));
	//   33   66:aload_0         
	//   34   67:putstatic       #395 <Field zza zzaRP>
		com/google/android/gms/dynamite/DynamiteModule;
	//   35   70:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   36   72:monitorexit     
		return ((com.google.android.gms.dynamite.zza) (context));
	//   37   73:aload_0         
	//   38   74:areturn         
	//*  39   75:goto            123
		context;
	//   40   78:astore_0        
		context = ((Context) (String.valueOf(((Object) (((Exception) (context)).getMessage())))));
	//   41   79:aload_0         
	//   42   80:invokevirtual   #199 <Method String Exception.getMessage()>
	//   43   83:invokestatic    #127 <Method String String.valueOf(Object)>
	//   44   86:astore_0        
		if(((String) (context)).length() != 0)
	//*  45   87:aload_0         
	//*  46   88:invokevirtual   #133 <Method int String.length()>
	//*  47   91:ifeq            105
		{
			context = ((Context) ("Failed to load IDynamiteLoader from GmsCore: ".concat(((String) (context)))));
	//   48   94:ldc2            #422 <String "Failed to load IDynamiteLoader from GmsCore: ">
	//   49   97:aload_0         
	//   50   98:invokevirtual   #205 <Method String String.concat(String)>
	//   51  101:astore_0        
			break MISSING_BLOCK_LABEL_116;
	//   52  102:goto            116
		}
		context = ((Context) (new String("Failed to load IDynamiteLoader from GmsCore: ")));
	//   53  105:new             #123 <Class String>
	//   54  108:dup             
	//   55  109:ldc2            #422 <String "Failed to load IDynamiteLoader from GmsCore: ">
	//   56  112:invokespecial   #208 <Method void String(String)>
	//   57  115:astore_0        
		Log.e("DynamiteModule", ((String) (context)));
	//   58  116:ldc1            #173 <String "DynamiteModule">
	//   59  118:aload_0         
	//   60  119:invokestatic    #185 <Method int Log.e(String, String)>
	//   61  122:pop             
		com/google/android/gms/dynamite/DynamiteModule;
	//   62  123:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   63  125:monitorexit     
		  goto _L1
	//*  64  126:goto            135
		context;
	//   65  129:astore_0        
	//*  66  130:ldc1            #2   <Class DynamiteModule>
		throw context;
	//   67  132:monitorexit     
	//   68  133:aload_0         
	//   69  134:athrow          
_L1:
		return null;
	//   70  135:aconst_null     
	//   71  136:areturn         
	}

	private static int zzc(Context context, String s, boolean flag)
	{
		com.google.android.gms.dynamite.zza zza1 = zzbm(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #384 <Method zza zzbm(Context)>
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
			i = zza1.zza(com.google.android.gms.dynamic.zzd.zzA(((Object) (context))), s, flag);
	//    7   13:aload           4
	//    8   15:aload_0         
	//    9   16:invokestatic    #228 <Method com.google.android.gms.dynamic.IObjectWrapper zzd.zzA(Object)>
	//   10   19:aload_1         
	//   11   20:iload_2         
	//   12   21:invokeinterface #425 <Method int zza.zza(com.google.android.gms.dynamic.IObjectWrapper, String, boolean)>
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
	//   18   31:invokevirtual   #426 <Method String RemoteException.getMessage()>
	//   19   34:invokestatic    #127 <Method String String.valueOf(Object)>
	//   20   37:astore_0        
			if(((String) (context)).length() != 0)
	//*  21   38:aload_0         
	//*  22   39:invokevirtual   #133 <Method int String.length()>
	//*  23   42:ifeq            56
				context = ((Context) ("Failed to retrieve remote module version: ".concat(((String) (context)))));
	//   24   45:ldc2            #372 <String "Failed to retrieve remote module version: ">
	//   25   48:aload_0         
	//   26   49:invokevirtual   #205 <Method String String.concat(String)>
	//   27   52:astore_0        
			else
	//*  28   53:goto            67
				context = ((Context) (new String("Failed to retrieve remote module version: ")));
	//   29   56:new             #123 <Class String>
	//   30   59:dup             
	//   31   60:ldc2            #372 <String "Failed to retrieve remote module version: ">
	//   32   63:invokespecial   #208 <Method void String(String)>
	//   33   66:astore_0        
			Log.w("DynamiteModule", ((String) (context)));
	//   34   67:ldc1            #173 <String "DynamiteModule">
	//   35   69:aload_0         
	//   36   70:invokestatic    #196 <Method int Log.w(String, String)>
	//   37   73:pop             
			return 0;
	//   38   74:iconst_0        
	//   39   75:ireturn         
		}
		return i;
	}

	private static DynamiteModule zzc(Context context, String s, int i)
		throws zza
	{
		Log.i("DynamiteModule", (new StringBuilder(String.valueOf(((Object) (s))).length() + 51)).append("Selected remote version of ").append(s).append(", version >= ").append(i).toString());
	//    0    0:ldc1            #173 <String "DynamiteModule">
	//    1    2:new             #135 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:aload_1         
	//    4    7:invokestatic    #127 <Method String String.valueOf(Object)>
	//    5   10:invokevirtual   #133 <Method int String.length()>
	//    6   13:bipush          51
	//    7   15:iadd            
	//    8   16:invokespecial   #138 <Method void StringBuilder(int)>
	//    9   19:ldc2            #378 <String "Selected remote version of ">
	//   10   22:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:ldc2            #380 <String ", version >= ">
	//   14   32:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:iload_2         
	//   16   36:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//   17   39:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   18   42:invokestatic    #219 <Method int Log.i(String, String)>
	//   19   45:pop             
		com/google/android/gms/dynamite/DynamiteModule;
	//   20   46:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorenter ;
	//   21   48:monitorenter    
		byte abyte0[];
		com.google.android.gms.dynamite.zzb zzb1;
		abyte0 = (byte[])zzaRR.get(((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 12)).append(s).append(":").append(i).toString())));
	//   22   49:getstatic       #63  <Field HashMap zzaRR>
	//   23   52:new             #135 <Class StringBuilder>
	//   24   55:dup             
	//   25   56:aload_1         
	//   26   57:invokestatic    #127 <Method String String.valueOf(Object)>
	//   27   60:invokevirtual   #133 <Method int String.length()>
	//   28   63:bipush          12
	//   29   65:iadd            
	//   30   66:invokespecial   #138 <Method void StringBuilder(int)>
	//   31   69:aload_1         
	//   32   70:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:ldc1            #255 <String ":">
	//   34   75:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   35   78:iload_2         
	//   36   79:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//   37   82:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   38   85:invokevirtual   #427 <Method Object HashMap.get(Object)>
	//   39   88:checkcast       #429 <Class byte[]>
	//   40   91:astore_3        
		zzb1 = zzaRQ;
	//   41   92:getstatic       #333 <Field zzb zzaRQ>
	//   42   95:astore          4
		com/google/android/gms/dynamite/DynamiteModule;
	//   43   97:ldc1            #2   <Class DynamiteModule>
		JVM INSTR monitorexit ;
	//   44   99:monitorexit     
		  goto _L1
	//*  45  100:goto            109
		context;
	//   46  103:astore_0        
	//*  47  104:ldc1            #2   <Class DynamiteModule>
		throw context;
	//   48  106:monitorexit     
	//   49  107:aload_0         
	//   50  108:athrow          
_L1:
		if(abyte0 == null)
	//*  51  109:aload_3         
	//*  52  110:ifnonnull       125
			throw new zza("Module implementation could not be found.");
	//   53  113:new             #25  <Class DynamiteModule$zza>
	//   54  116:dup             
	//   55  117:ldc2            #431 <String "Module implementation could not be found.">
	//   56  120:aconst_null     
	//   57  121:invokespecial   #270 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   58  124:athrow          
		if(zzb1 == null)
	//*  59  125:aload           4
	//*  60  127:ifnonnull       142
			throw new zza("DynamiteLoaderV2 was not cached.");
	//   61  130:new             #25  <Class DynamiteModule$zza>
	//   62  133:dup             
	//   63  134:ldc2            #433 <String "DynamiteLoaderV2 was not cached.">
	//   64  137:aconst_null     
	//   65  138:invokespecial   #270 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   66  141:athrow          
		context = zza(context.getApplicationContext(), s, abyte0, zzb1);
	//   67  142:aload_0         
	//   68  143:invokevirtual   #116 <Method Context Context.getApplicationContext()>
	//   69  146:aload_1         
	//   70  147:aload_3         
	//   71  148:aload           4
	//   72  150:invokestatic    #435 <Method Context zza(Context, String, byte[], zzb)>
	//   73  153:astore_0        
		if(context == null)
	//*  74  154:aload_0         
	//*  75  155:ifnonnull       170
			throw new zza("Failed to get module context");
	//   76  158:new             #25  <Class DynamiteModule$zza>
	//   77  161:dup             
	//   78  162:ldc2            #437 <String "Failed to get module context">
	//   79  165:aconst_null     
	//   80  166:invokespecial   #270 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   81  169:athrow          
		else
			return new DynamiteModule(context);
	//   82  170:new             #2   <Class DynamiteModule>
	//   83  173:dup             
	//   84  174:aload_0         
	//   85  175:invokespecial   #221 <Method void DynamiteModule(Context)>
	//   86  178:areturn         
	}

	private static int zzd(Context context, String s, boolean flag)
		throws zza
	{
		Object obj;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		context = ((Context) (zze(context, s, flag)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:iload_2         
	//    7    9:invokestatic    #441 <Method Cursor zze(Context, String, boolean)>
	//    8   12:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_32;
	//    9   13:aload_0         
	//   10   14:ifnull          32
		obj = ((Object) (context));
	//   11   17:aload_0         
	//   12   18:astore          4
		obj1 = ((Object) (context));
	//   13   20:aload_0         
	//   14   21:astore          5
		if(((Cursor) (context)).moveToFirst())
			break MISSING_BLOCK_LABEL_65;
	//   15   23:aload_0         
	//   16   24:invokeinterface #446 <Method boolean Cursor.moveToFirst()>
	//   17   29:ifne            65
		obj = ((Object) (context));
	//   18   32:aload_0         
	//   19   33:astore          4
		obj1 = ((Object) (context));
	//   20   35:aload_0         
	//   21   36:astore          5
		Log.w("DynamiteModule", "Failed to retrieve remote module version.");
	//   22   38:ldc1            #173 <String "DynamiteModule">
	//   23   40:ldc2            #448 <String "Failed to retrieve remote module version.">
	//   24   43:invokestatic    #196 <Method int Log.w(String, String)>
	//   25   46:pop             
		obj = ((Object) (context));
	//   26   47:aload_0         
	//   27   48:astore          4
		obj1 = ((Object) (context));
	//   28   50:aload_0         
	//   29   51:astore          5
		int i;
		try
		{
			throw new zza("Failed to connect to dynamite module ContentResolver.");
	//   30   53:new             #25  <Class DynamiteModule$zza>
	//   31   56:dup             
	//   32   57:ldc2            #450 <String "Failed to connect to dynamite module ContentResolver.">
	//   33   60:aconst_null     
	//   34   61:invokespecial   #270 <Method void DynamiteModule$zza(String, DynamiteModule$1)>
	//   35   64:athrow          
		}
	//*  36   65:aload_0         
	//*  37   66:astore          4
	//*  38   68:aload_0         
	//*  39   69:astore          5
	//*  40   71:aload_0         
	//*  41   72:iconst_0        
	//*  42   73:invokeinterface #453 <Method int Cursor.getInt(int)>
	//*  43   78:istore_3        
	//*  44   79:iload_3         
	//*  45   80:ifle            175
	//*  46   83:aload_0         
	//*  47   84:astore          4
	//*  48   86:aload_0         
	//*  49   87:astore          5
	//*  50   89:ldc1            #2   <Class DynamiteModule>
	//*  51   91:monitorenter    
	//*  52   92:aload_0         
	//*  53   93:iconst_3        
	//*  54   94:invokeinterface #457 <Method String Cursor.getString(int)>
	//*  55   99:iconst_0        
	//*  56  100:invokestatic    #463 <Method byte[] Base64.decode(String, int)>
	//*  57  103:astore          4
	//*  58  105:getstatic       #63  <Field HashMap zzaRR>
	//*  59  108:new             #135 <Class StringBuilder>
	//*  60  111:dup             
	//*  61  112:aload_1         
	//*  62  113:invokestatic    #127 <Method String String.valueOf(Object)>
	//*  63  116:invokevirtual   #133 <Method int String.length()>
	//*  64  119:bipush          12
	//*  65  121:iadd            
	//*  66  122:invokespecial   #138 <Method void StringBuilder(int)>
	//*  67  125:aload_1         
	//*  68  126:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//*  69  129:ldc1            #255 <String ":">
	//*  70  131:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//*  71  134:iload_3         
	//*  72  135:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//*  73  138:invokevirtual   #148 <Method String StringBuilder.toString()>
	//*  74  141:aload           4
	//*  75  143:invokevirtual   #467 <Method Object HashMap.put(Object, Object)>
	//*  76  146:pop             
	//*  77  147:aload_0         
	//*  78  148:iconst_2        
	//*  79  149:invokeinterface #457 <Method String Cursor.getString(int)>
	//*  80  154:putstatic       #98  <Field String zzaRS>
	//*  81  157:ldc1            #2   <Class DynamiteModule>
	//*  82  159:monitorexit     
	//*  83  160:goto            175
	//*  84  163:astore_1        
	//*  85  164:ldc1            #2   <Class DynamiteModule>
	//*  86  166:monitorexit     
	//*  87  167:aload_0         
	//*  88  168:astore          4
	//*  89  170:aload_0         
	//*  90  171:astore          5
	//*  91  173:aload_1         
	//*  92  174:athrow          
	//*  93  175:aload_0         
	//*  94  176:ifnull          185
	//*  95  179:aload_0         
	//*  96  180:invokeinterface #470 <Method void Cursor.close()>
	//*  97  185:iload_3         
	//*  98  186:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   99  187:astore_0        
		break MISSING_BLOCK_LABEL_188;
		obj = ((Object) (context));
		obj1 = ((Object) (context));
		i = ((Cursor) (context)).getInt(0);
		if(i <= 0)
			break MISSING_BLOCK_LABEL_175;
		obj = ((Object) (context));
		obj1 = ((Object) (context));
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorenter ;
		obj = ((Object) (Base64.decode(((Cursor) (context)).getString(3), 0)));
		zzaRR.put(((Object) ((new StringBuilder(String.valueOf(((Object) (s))).length() + 12)).append(s).append(":").append(i).toString())), obj);
		zzaRS = ((Cursor) (context)).getString(2);
		com/google/android/gms/dynamite/DynamiteModule;
		JVM INSTR monitorexit ;
		break MISSING_BLOCK_LABEL_175;
		s;
		obj = ((Object) (context));
		obj1 = ((Object) (context));
		throw s;
		if(context != null)
			((Cursor) (context)).close();
		return i;
		if(!(context instanceof zza))
			break MISSING_BLOCK_LABEL_201;
	//  100  188:aload_0         
	//  101  189:instanceof      #25  <Class DynamiteModule$zza>
	//  102  192:ifeq            201
		obj1 = obj;
	//  103  195:aload           4
	//  104  197:astore          5
		throw context;
	//  105  199:aload_0         
	//  106  200:athrow          
		obj1 = obj;
	//  107  201:aload           4
	//  108  203:astore          5
		throw new zza("V2 version check failed", ((Throwable) (context)));
	//  109  205:new             #25  <Class DynamiteModule$zza>
	//  110  208:dup             
	//  111  209:ldc2            #472 <String "V2 version check failed">
	//  112  212:aload_0         
	//  113  213:aconst_null     
	//  114  214:invokespecial   #284 <Method void DynamiteModule$zza(String, Throwable, DynamiteModule$1)>
	//  115  217:athrow          
		context;
	//  116  218:astore_0        
		if(obj1 != null)
	//* 117  219:aload           5
	//* 118  221:ifnull          231
			((Cursor) (obj1)).close();
	//  119  224:aload           5
	//  120  226:invokeinterface #470 <Method void Cursor.close()>
		throw context;
	//  121  231:aload_0         
	//  122  232:athrow          
	}

	public static Cursor zze(Context context, String s, boolean flag)
	{
		String s1;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            12
			s1 = "api_force_staging";
	//    2    4:ldc2            #474 <String "api_force_staging">
	//    3    7:astore          5
		else
	//*   4    9:goto            17
			s1 = "api";
	//    5   12:ldc2            #476 <String "api">
	//    6   15:astore          5
		String s2 = String.valueOf("content://com.google.android.gms.chimera/");
	//    7   17:ldc2            #478 <String "content://com.google.android.gms.chimera/">
	//    8   20:invokestatic    #127 <Method String String.valueOf(Object)>
	//    9   23:astore          6
		int i = String.valueOf(((Object) (s2))).length();
	//   10   25:aload           6
	//   11   27:invokestatic    #127 <Method String String.valueOf(Object)>
	//   12   30:invokevirtual   #133 <Method int String.length()>
	//   13   33:istore_3        
		int j = String.valueOf(((Object) (s1))).length();
	//   14   34:aload           5
	//   15   36:invokestatic    #127 <Method String String.valueOf(Object)>
	//   16   39:invokevirtual   #133 <Method int String.length()>
	//   17   42:istore          4
		s = ((String) (Uri.parse((new StringBuilder(String.valueOf(((Object) (s))).length() + (i + 1 + j))).append(s2).append(s1).append("/").append(s).toString())));
	//   18   44:new             #135 <Class StringBuilder>
	//   19   47:dup             
	//   20   48:aload_1         
	//   21   49:invokestatic    #127 <Method String String.valueOf(Object)>
	//   22   52:invokevirtual   #133 <Method int String.length()>
	//   23   55:iload_3         
	//   24   56:iconst_1        
	//   25   57:iadd            
	//   26   58:iload           4
	//   27   60:iadd            
	//   28   61:iadd            
	//   29   62:invokespecial   #138 <Method void StringBuilder(int)>
	//   30   65:aload           6
	//   31   67:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:aload           5
	//   33   72:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   34   75:ldc2            #480 <String "/">
	//   35   78:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   36   81:aload_1         
	//   37   82:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   38   85:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   39   88:invokestatic    #486 <Method Uri Uri.parse(String)>
	//   40   91:astore_1        
		return context.getContentResolver().query(((Uri) (s)), ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)));
	//   41   92:aload_0         
	//   42   93:invokevirtual   #490 <Method ContentResolver Context.getContentResolver()>
	//   43   96:aload_1         
	//   44   97:aconst_null     
	//   45   98:aconst_null     
	//   46   99:aconst_null     
	//   47  100:aconst_null     
	//   48  101:invokevirtual   #496 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   49  104:areturn         
	}

	public Context zzBS()
	{
		return zzaRZ;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Context zzaRZ>
	//    2    4:areturn         
	}

	public IBinder zzdT(String s)
		throws zza
	{
		IBinder ibinder;
		try
		{
			ibinder = (IBinder)zzaRZ.getClassLoader().loadClass(s).newInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Context zzaRZ>
	//    2    4:invokevirtual   #119 <Method ClassLoader Context.getClassLoader()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #152 <Method Class ClassLoader.loadClass(String)>
	//    5   11:invokevirtual   #414 <Method Object Class.newInstance()>
	//    6   14:checkcast       #325 <Class IBinder>
	//    7   17:astore_2        
		}
	//*   8   18:aload_2         
	//*   9   19:areturn         
		catch(Object obj)
	//*  10   20:astore_2        
		{
			s = String.valueOf(((Object) (s)));
	//   11   21:aload_1         
	//   12   22:invokestatic    #127 <Method String String.valueOf(Object)>
	//   13   25:astore_1        
			if(s.length() != 0)
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #133 <Method int String.length()>
	//*  16   30:ifeq            44
				s = "Failed to instantiate module class: ".concat(s);
	//   17   33:ldc2            #501 <String "Failed to instantiate module class: ">
	//   18   36:aload_1         
	//   19   37:invokevirtual   #205 <Method String String.concat(String)>
	//   20   40:astore_1        
			else
	//*  21   41:goto            55
				s = new String("Failed to instantiate module class: ");
	//   22   44:new             #123 <Class String>
	//   23   47:dup             
	//   24   48:ldc2            #501 <String "Failed to instantiate module class: ">
	//   25   51:invokespecial   #208 <Method void String(String)>
	//   26   54:astore_1        
			throw new zza(s, ((Throwable) (obj)));
	//   27   55:new             #25  <Class DynamiteModule$zza>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:aconst_null     
	//   32   62:invokespecial   #284 <Method void DynamiteModule$zza(String, Throwable, DynamiteModule$1)>
	//   33   65:athrow          
		}
		return ibinder;
	}

	private static Boolean zzaRO;
	private static com.google.android.gms.dynamite.zza zzaRP;
	private static com.google.android.gms.dynamite.zzb zzaRQ;
	private static final HashMap zzaRR = new HashMap();
	private static String zzaRS;
	private static final zzb.zza zzaRT = new zzb.zza() {

		public int zzH(Context context, String s)
		{
			return DynamiteModule.zzH(context, s);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #17  <Method int DynamiteModule.zzH(Context, String)>
		//    3    5:ireturn         
		}

		public int zzb(Context context, String s, boolean flag)
			throws zza
		{
			return DynamiteModule.zzb(context, s, flag);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #23  <Method int DynamiteModule.zzb(Context, String, boolean)>
		//    4    6:ireturn         
		}

	}
;
	public static final zzb zzaRU = new zzb() {

		public zzb.zzb zza(Context context, String s, zzb.zza zza1)
			throws zza
		{
			zzb.zzb zzb1 = new zzb.zzb();
		//    0    0:new             #19  <Class DynamiteModule$zzb$zzb>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void DynamiteModule$zzb$zzb()>
		//    3    7:astore          4
			zzb1.zzaSc = zza1.zzb(context, s, true);
		//    4    9:aload           4
		//    5   11:aload_3         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:iconst_1        
		//    9   15:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   10   20:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSc>
			if(zzb1.zzaSc != 0)
		//*  11   23:aload           4
		//*  12   25:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSc>
		//*  13   28:ifeq            40
			{
				zzb1.zzaSd = 1;
		//   14   31:aload           4
		//   15   33:iconst_1        
		//   16   34:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaSd>
				return zzb1;
		//   17   37:aload           4
		//   18   39:areturn         
			}
			zzb1.zzaSb = zza1.zzH(context, s);
		//   19   40:aload           4
		//   20   42:aload_3         
		//   21   43:aload_1         
		//   22   44:aload_2         
		//   23   45:invokeinterface #37  <Method int DynamiteModule$zzb$zza.zzH(Context, String)>
		//   24   50:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSb>
			if(zzb1.zzaSb != 0)
		//*  25   53:aload           4
		//*  26   55:getfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSb>
		//*  27   58:ifeq            67
				zzb1.zzaSd = -1;
		//   28   61:aload           4
		//   29   63:iconst_m1       
		//   30   64:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaSd>
			return zzb1;
		//   31   67:aload           4
		//   32   69:areturn         
		}

	}
;
	public static final zzb zzaRV = new zzb() {

		public zzb.zzb zza(Context context, String s, zzb.zza zza1)
			throws zza
		{
			zzb.zzb zzb1 = new zzb.zzb();
		//    0    0:new             #19  <Class DynamiteModule$zzb$zzb>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void DynamiteModule$zzb$zzb()>
		//    3    7:astore          4
			zzb1.zzaSb = zza1.zzH(context, s);
		//    4    9:aload           4
		//    5   11:aload_3         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzH(Context, String)>
		//    9   19:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
			if(zzb1.zzaSb != 0)
		//*  10   22:aload           4
		//*  11   24:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
		//*  12   27:ifeq            39
			{
				zzb1.zzaSd = -1;
		//   13   30:aload           4
		//   14   32:iconst_m1       
		//   15   33:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaSd>
				return zzb1;
		//   16   36:aload           4
		//   17   38:areturn         
			}
			zzb1.zzaSc = zza1.zzb(context, s, true);
		//   18   39:aload           4
		//   19   41:aload_3         
		//   20   42:aload_1         
		//   21   43:aload_2         
		//   22   44:iconst_1        
		//   23   45:invokeinterface #37  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   24   50:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSc>
			if(zzb1.zzaSc != 0)
		//*  25   53:aload           4
		//*  26   55:getfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSc>
		//*  27   58:ifeq            67
				zzb1.zzaSd = 1;
		//   28   61:aload           4
		//   29   63:iconst_1        
		//   30   64:putfield        #33  <Field int DynamiteModule$zzb$zzb.zzaSd>
			return zzb1;
		//   31   67:aload           4
		//   32   69:areturn         
		}

	}
;
	public static final zzb zzaRW = new zzb() {

		public zzb.zzb zza(Context context, String s, zzb.zza zza1)
			throws zza
		{
			zzb.zzb zzb1 = new zzb.zzb();
		//    0    0:new             #19  <Class DynamiteModule$zzb$zzb>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void DynamiteModule$zzb$zzb()>
		//    3    7:astore          4
			zzb1.zzaSb = zza1.zzH(context, s);
		//    4    9:aload           4
		//    5   11:aload_3         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzH(Context, String)>
		//    9   19:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
			zzb1.zzaSc = zza1.zzb(context, s, true);
		//   10   22:aload           4
		//   11   24:aload_3         
		//   12   25:aload_1         
		//   13   26:aload_2         
		//   14   27:iconst_1        
		//   15   28:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   16   33:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
			if(zzb1.zzaSb == 0 && zzb1.zzaSc == 0)
		//*  17   36:aload           4
		//*  18   38:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
		//*  19   41:ifne            61
		//*  20   44:aload           4
		//*  21   46:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
		//*  22   49:ifne            61
			{
				zzb1.zzaSd = 0;
		//   23   52:aload           4
		//   24   54:iconst_0        
		//   25   55:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
				return zzb1;
		//   26   58:aload           4
		//   27   60:areturn         
			}
			if(zzb1.zzaSb >= zzb1.zzaSc)
		//*  28   61:aload           4
		//*  29   63:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
		//*  30   66:aload           4
		//*  31   68:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
		//*  32   71:icmplt          83
			{
				zzb1.zzaSd = -1;
		//   33   74:aload           4
		//   34   76:iconst_m1       
		//   35   77:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
				return zzb1;
		//   36   80:aload           4
		//   37   82:areturn         
			} else
			{
				zzb1.zzaSd = 1;
		//   38   83:aload           4
		//   39   85:iconst_1        
		//   40   86:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
				return zzb1;
		//   41   89:aload           4
		//   42   91:areturn         
			}
		}

	}
;
	public static final zzb zzaRX = new zzb() {

		public zzb.zzb zza(Context context, String s, zzb.zza zza1)
			throws zza
		{
			zzb.zzb zzb1 = new zzb.zzb();
		//    0    0:new             #19  <Class DynamiteModule$zzb$zzb>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void DynamiteModule$zzb$zzb()>
		//    3    7:astore          4
			zzb1.zzaSb = zza1.zzH(context, s);
		//    4    9:aload           4
		//    5   11:aload_3         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzH(Context, String)>
		//    9   19:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
			zzb1.zzaSc = zza1.zzb(context, s, true);
		//   10   22:aload           4
		//   11   24:aload_3         
		//   12   25:aload_1         
		//   13   26:aload_2         
		//   14   27:iconst_1        
		//   15   28:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   16   33:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
			if(zzb1.zzaSb == 0 && zzb1.zzaSc == 0)
		//*  17   36:aload           4
		//*  18   38:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
		//*  19   41:ifne            61
		//*  20   44:aload           4
		//*  21   46:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
		//*  22   49:ifne            61
			{
				zzb1.zzaSd = 0;
		//   23   52:aload           4
		//   24   54:iconst_0        
		//   25   55:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
				return zzb1;
		//   26   58:aload           4
		//   27   60:areturn         
			}
			if(zzb1.zzaSc >= zzb1.zzaSb)
		//*  28   61:aload           4
		//*  29   63:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
		//*  30   66:aload           4
		//*  31   68:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
		//*  32   71:icmplt          83
			{
				zzb1.zzaSd = 1;
		//   33   74:aload           4
		//   34   76:iconst_1        
		//   35   77:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
				return zzb1;
		//   36   80:aload           4
		//   37   82:areturn         
			} else
			{
				zzb1.zzaSd = -1;
		//   38   83:aload           4
		//   39   85:iconst_m1       
		//   40   86:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
				return zzb1;
		//   41   89:aload           4
		//   42   91:areturn         
			}
		}

	}
;
	public static final zzb zzaRY = new zzb() {

		public zzb.zzb zza(Context context, String s, zzb.zza zza1)
			throws zza
		{
			zzb.zzb zzb1 = new zzb.zzb();
		//    0    0:new             #19  <Class DynamiteModule$zzb$zzb>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void DynamiteModule$zzb$zzb()>
		//    3    7:astore          4
			zzb1.zzaSb = zza1.zzH(context, s);
		//    4    9:aload           4
		//    5   11:aload_3         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokeinterface #26  <Method int DynamiteModule$zzb$zza.zzH(Context, String)>
		//    9   19:putfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
			if(zzb1.zzaSb != 0)
		//*  10   22:aload           4
		//*  11   24:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
		//*  12   27:ifeq            47
				zzb1.zzaSc = zza1.zzb(context, s, false);
		//   13   30:aload           4
		//   14   32:aload_3         
		//   15   33:aload_1         
		//   16   34:aload_2         
		//   17   35:iconst_0        
		//   18   36:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   19   41:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
			else
		//*  20   44:goto            61
				zzb1.zzaSc = zza1.zzb(context, s, true);
		//   21   47:aload           4
		//   22   49:aload_3         
		//   23   50:aload_1         
		//   24   51:aload_2         
		//   25   52:iconst_1        
		//   26   53:invokeinterface #34  <Method int DynamiteModule$zzb$zza.zzb(Context, String, boolean)>
		//   27   58:putfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
			if(zzb1.zzaSb == 0 && zzb1.zzaSc == 0)
		//*  28   61:aload           4
		//*  29   63:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
		//*  30   66:ifne            86
		//*  31   69:aload           4
		//*  32   71:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
		//*  33   74:ifne            86
			{
				zzb1.zzaSd = 0;
		//   34   77:aload           4
		//   35   79:iconst_0        
		//   36   80:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
				return zzb1;
		//   37   83:aload           4
		//   38   85:areturn         
			}
			if(zzb1.zzaSc >= zzb1.zzaSb)
		//*  39   86:aload           4
		//*  40   88:getfield        #37  <Field int DynamiteModule$zzb$zzb.zzaSc>
		//*  41   91:aload           4
		//*  42   93:getfield        #30  <Field int DynamiteModule$zzb$zzb.zzaSb>
		//*  43   96:icmplt          108
			{
				zzb1.zzaSd = 1;
		//   44   99:aload           4
		//   45  101:iconst_1        
		//   46  102:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
				return zzb1;
		//   47  105:aload           4
		//   48  107:areturn         
			} else
			{
				zzb1.zzaSd = -1;
		//   49  108:aload           4
		//   50  110:iconst_m1       
		//   51  111:putfield        #40  <Field int DynamiteModule$zzb$zzb.zzaSd>
				return zzb1;
		//   52  114:aload           4
		//   53  116:areturn         
			}
		}

	}
;
	private final Context zzaRZ;

	static 
	{
	//    0    0:new             #58  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void HashMap()>
	//    3    7:putstatic       #63  <Field HashMap zzaRR>
	//    4   10:new             #6   <Class DynamiteModule$1>
	//    5   13:dup             
	//    6   14:invokespecial   #64  <Method void DynamiteModule$1()>
	//    7   17:putstatic       #66  <Field DynamiteModule$zzb$zza zzaRT>
	//    8   20:new             #8   <Class DynamiteModule$2>
	//    9   23:dup             
	//   10   24:invokespecial   #67  <Method void DynamiteModule$2()>
	//   11   27:putstatic       #69  <Field DynamiteModule$zzb zzaRU>
	//   12   30:new             #10  <Class DynamiteModule$3>
	//   13   33:dup             
	//   14   34:invokespecial   #70  <Method void DynamiteModule$3()>
	//   15   37:putstatic       #72  <Field DynamiteModule$zzb zzaRV>
	//   16   40:new             #12  <Class DynamiteModule$4>
	//   17   43:dup             
	//   18   44:invokespecial   #73  <Method void DynamiteModule$4()>
	//   19   47:putstatic       #75  <Field DynamiteModule$zzb zzaRW>
	//   20   50:new             #14  <Class DynamiteModule$5>
	//   21   53:dup             
	//   22   54:invokespecial   #76  <Method void DynamiteModule$5()>
	//   23   57:putstatic       #78  <Field DynamiteModule$zzb zzaRX>
	//   24   60:new             #16  <Class DynamiteModule$6>
	//   25   63:dup             
	//   26   64:invokespecial   #79  <Method void DynamiteModule$6()>
	//   27   67:putstatic       #81  <Field DynamiteModule$zzb zzaRY>
	//*  28   70:return          
	}
}
