// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.util:
//			Strings, PlatformVersion

public class WorkSourceUtil
{

	private WorkSourceUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
	//    2    4:return          
	}

	public static WorkSource fromPackage(Context context, String s)
	{
		if(context == null || context.getPackageManager() == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          120
	//    2    4:aload_0         
	//    3    5:invokevirtual   #75  <Method android.content.pm.PackageManager Context.getPackageManager()>
	//    4    8:ifnull          120
_L1:
		if(s == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		context = ((Context) (Wrappers.packageManager(context).getApplicationInfo(s, 0)));
	//    9   17:aload_0         
	//   10   18:invokestatic    #81  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   11   21:aload_1         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #87  <Method ApplicationInfo PackageManagerWrapper.getApplicationInfo(String, int)>
	//   14   26:astore_0        
		if(context == null)
	//*  15   27:aload_0         
	//*  16   28:ifnonnull       72
		{
			context = ((Context) (String.valueOf(((Object) (s)))));
	//   17   31:aload_1         
	//   18   32:invokestatic    #93  <Method String String.valueOf(Object)>
	//   19   35:astore_0        
			if(((String) (context)).length() != 0)
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #96  <Method int String.length()>
	//*  22   40:ifeq            53
				context = ((Context) ("Could not get applicationInfo from package: ".concat(((String) (context)))));
	//   23   43:ldc1            #98  <String "Could not get applicationInfo from package: ">
	//   24   45:aload_0         
	//   25   46:invokevirtual   #102 <Method String String.concat(String)>
	//   26   49:astore_0        
			else
	//*  27   50:goto            63
				context = ((Context) (new String("Could not get applicationInfo from package: ")));
	//   28   53:new             #89  <Class String>
	//   29   56:dup             
	//   30   57:ldc1            #98  <String "Could not get applicationInfo from package: ">
	//   31   59:invokespecial   #105 <Method void String(String)>
	//   32   62:astore_0        
			Log.e("WorkSourceUtil", ((String) (context)));
	//   33   63:ldc1            #107 <String "WorkSourceUtil">
	//   34   65:aload_0         
	//   35   66:invokestatic    #113 <Method int Log.e(String, String)>
	//   36   69:pop             
			return null;
	//   37   70:aconst_null     
	//   38   71:areturn         
		} else
		{
			return zza(((ApplicationInfo) (context)).uid, s);
	//   39   72:aload_0         
	//   40   73:getfield        #118 <Field int ApplicationInfo.uid>
	//   41   76:aload_1         
	//   42   77:invokestatic    #122 <Method WorkSource zza(int, String)>
	//   43   80:areturn         
		}
_L4:
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   44   81:aload_1         
	//   45   82:invokestatic    #93  <Method String String.valueOf(Object)>
	//   46   85:astore_0        
		if(((String) (context)).length() != 0)
	//*  47   86:aload_0         
	//*  48   87:invokevirtual   #96  <Method int String.length()>
	//*  49   90:ifeq            103
			context = ((Context) ("Could not find package: ".concat(((String) (context)))));
	//   50   93:ldc1            #124 <String "Could not find package: ">
	//   51   95:aload_0         
	//   52   96:invokevirtual   #102 <Method String String.concat(String)>
	//   53   99:astore_0        
		else
	//*  54  100:goto            113
			context = ((Context) (new String("Could not find package: ")));
	//   55  103:new             #89  <Class String>
	//   56  106:dup             
	//   57  107:ldc1            #124 <String "Could not find package: ">
	//   58  109:invokespecial   #105 <Method void String(String)>
	//   59  112:astore_0        
		Log.e("WorkSourceUtil", ((String) (context)));
	//   60  113:ldc1            #107 <String "WorkSourceUtil">
	//   61  115:aload_0         
	//   62  116:invokestatic    #113 <Method int Log.e(String, String)>
	//   63  119:pop             
_L2:
		return null;
	//   64  120:aconst_null     
	//   65  121:areturn         
		context;
	//   66  122:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  67  123:goto            81
	}

	public static WorkSource fromPackageAndModuleExperimentalPi(Context context, String s, String s1)
	{
		if(context != null && context.getPackageManager() != null && s1 != null && s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          149
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #75  <Method android.content.pm.PackageManager Context.getPackageManager()>
	//*   4    8:ifnull          149
	//*   5   11:aload_2         
	//*   6   12:ifnull          149
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       22
	//*   9   19:goto            149
		{
			int i = zzd(context, s);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokestatic    #133 <Method int zzd(Context, String)>
	//   13   27:istore_3        
			if(i < 0)
	//*  14   28:iload_3         
	//*  15   29:ifge            34
				return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
			context = ((Context) (new WorkSource()));
	//   18   34:new             #135 <Class WorkSource>
	//   19   37:dup             
	//   20   38:invokespecial   #136 <Method void WorkSource()>
	//   21   41:astore_0        
			if(zzhn != null && zzho != null)
	//*  22   42:getstatic       #56  <Field Method zzhn>
	//*  23   45:ifnull          141
	//*  24   48:getstatic       #61  <Field Method zzho>
	//*  25   51:ifnonnull       57
	//*  26   54:goto            141
			{
				try
				{
					Object obj = zzhn.invoke(((Object) (context)), new Object[0]);
	//   27   57:getstatic       #56  <Field Method zzhn>
	//   28   60:aload_0         
	//   29   61:iconst_0        
	//   30   62:anewarray       Object[]
	//   31   65:invokevirtual   #142 <Method Object Method.invoke(Object, Object[])>
	//   32   68:astore          4
					if(i != zzhh)
	//*  33   70:iload_3         
	//*  34   71:getstatic       #25  <Field int zzhh>
	//*  35   74:icmpeq          101
						zzho.invoke(obj, new Object[] {
							Integer.valueOf(i), s
						});
	//   36   77:getstatic       #61  <Field Method zzho>
	//   37   80:aload           4
	//   38   82:iconst_2        
	//   39   83:anewarray       Object[]
	//   40   86:dup             
	//   41   87:iconst_0        
	//   42   88:iload_3         
	//   43   89:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   44   92:aastore         
	//   45   93:dup             
	//   46   94:iconst_1        
	//   47   95:aload_1         
	//   48   96:aastore         
	//   49   97:invokevirtual   #142 <Method Object Method.invoke(Object, Object[])>
	//   50  100:pop             
					zzho.invoke(obj, new Object[] {
						Integer.valueOf(zzhh), s1
					});
	//   51  101:getstatic       #61  <Field Method zzho>
	//   52  104:aload           4
	//   53  106:iconst_2        
	//   54  107:anewarray       Object[]
	//   55  110:dup             
	//   56  111:iconst_0        
	//   57  112:getstatic       #25  <Field int zzhh>
	//   58  115:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   59  118:aastore         
	//   60  119:dup             
	//   61  120:iconst_1        
	//   62  121:aload_2         
	//   63  122:aastore         
	//   64  123:invokevirtual   #142 <Method Object Method.invoke(Object, Object[])>
	//   65  126:pop             
				}
	//*  66  127:aload_0         
	//*  67  128:areturn         
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  68  129:astore_1        
				{
					Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", ((Throwable) (s)));
	//   69  130:ldc1            #107 <String "WorkSourceUtil">
	//   70  132:ldc1            #149 <String "Unable to assign chained blame through WorkSource">
	//   71  134:aload_1         
	//   72  135:invokestatic    #153 <Method int Log.w(String, String, Throwable)>
	//   73  138:pop             
					return ((WorkSource) (context));
	//   74  139:aload_0         
	//   75  140:areturn         
				}
				return ((WorkSource) (context));
			} else
			{
				zza(((WorkSource) (context)), i, s);
	//   76  141:aload_0         
	//   77  142:iload_3         
	//   78  143:aload_1         
	//   79  144:invokestatic    #156 <Method void zza(WorkSource, int, String)>
				return ((WorkSource) (context));
	//   80  147:aload_0         
	//   81  148:areturn         
			}
		} else
		{
			Log.w("WorkSourceUtil", "Unexpected null arguments");
	//   82  149:ldc1            #107 <String "WorkSourceUtil">
	//   83  151:ldc1            #158 <String "Unexpected null arguments">
	//   84  153:invokestatic    #160 <Method int Log.w(String, String)>
	//   85  156:pop             
			return null;
	//   86  157:aconst_null     
	//   87  158:areturn         
		}
	}

	public static List getNames(WorkSource worksource)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		if(worksource == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       11
			i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_1        
		else
	//*   6    8:goto            16
			i = zza(worksource);
	//    7   11:aload_0         
	//    8   12:invokestatic    #165 <Method int zza(WorkSource)>
	//    9   15:istore_1        
		if(i == 0)
	//*  10   16:iload_1         
	//*  11   17:ifne            24
			return Collections.emptyList();
	//   12   20:invokestatic    #171 <Method List Collections.emptyList()>
	//   13   23:areturn         
		ArrayList arraylist = new ArrayList();
	//   14   24:new             #173 <Class ArrayList>
	//   15   27:dup             
	//   16   28:invokespecial   #174 <Method void ArrayList()>
	//   17   31:astore_3        
		for(; j < i; j++)
	//*  18   32:iload_2         
	//*  19   33:iload_1         
	//*  20   34:icmpge          68
		{
			String s = zza(worksource, j);
	//   21   37:aload_0         
	//   22   38:iload_2         
	//   23   39:invokestatic    #177 <Method String zza(WorkSource, int)>
	//   24   42:astore          4
			if(!Strings.isEmptyOrWhitespace(s))
	//*  25   44:aload           4
	//*  26   46:invokestatic    #183 <Method boolean Strings.isEmptyOrWhitespace(String)>
	//*  27   49:ifne            61
				((List) (arraylist)).add(((Object) (s)));
	//   28   52:aload_3         
	//   29   53:aload           4
	//   30   55:invokeinterface #189 <Method boolean List.add(Object)>
	//   31   60:pop             
		}

	//   32   61:iload_2         
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:istore_2        
	//*  36   65:goto            32
		return ((List) (arraylist));
	//   37   68:aload_3         
	//   38   69:areturn         
	}

	public static boolean hasWorkSourcePermission(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(context.getPackageManager() == null)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #75  <Method android.content.pm.PackageManager Context.getPackageManager()>
	//*   6   10:ifnonnull       15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		return Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
	//    9   15:aload_0         
	//   10   16:invokestatic    #81  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   11   19:ldc1            #195 <String "android.permission.UPDATE_DEVICE_STATS">
	//   12   21:aload_0         
	//   13   22:invokevirtual   #199 <Method String Context.getPackageName()>
	//   14   25:invokevirtual   #202 <Method int PackageManagerWrapper.checkPermission(String, String)>
	//   15   28:ifne            33
	//   16   31:iconst_1        
	//   17   32:ireturn         
	//   18   33:iconst_0        
	//   19   34:ireturn         
	}

	private static int zza(WorkSource worksource)
	{
		if(zzhk == null)
			break MISSING_BLOCK_LABEL_36;
	//    0    0:getstatic       #41  <Field Method zzhk>
	//    1    3:ifnull          36
		int i = ((Integer)zzhk.invoke(((Object) (worksource)), new Object[0])).intValue();
	//    2    6:getstatic       #41  <Field Method zzhk>
	//    3    9:aload_0         
	//    4   10:iconst_0        
	//    5   11:anewarray       Object[]
	//    6   14:invokevirtual   #142 <Method Object Method.invoke(Object, Object[])>
	//    7   17:checkcast       #144 <Class Integer>
	//    8   20:invokevirtual   #205 <Method int Integer.intValue()>
	//    9   23:istore_1        
		return i;
	//   10   24:iload_1         
	//   11   25:ireturn         
		worksource;
	//   12   26:astore_0        
		Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable) (worksource)));
	//   13   27:ldc1            #107 <String "WorkSourceUtil">
	//   14   29:ldc1            #207 <String "Unable to assign blame through WorkSource">
	//   15   31:aload_0         
	//   16   32:invokestatic    #210 <Method int Log.wtf(String, String, Throwable)>
	//   17   35:pop             
		return 0;
	//   18   36:iconst_0        
	//   19   37:ireturn         
	}

	private static WorkSource zza(int i, String s)
	{
		WorkSource worksource = new WorkSource();
	//    0    0:new             #135 <Class WorkSource>
	//    1    3:dup             
	//    2    4:invokespecial   #136 <Method void WorkSource()>
	//    3    7:astore_2        
		zza(worksource, i, s);
	//    4    8:aload_2         
	//    5    9:iload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #156 <Method void zza(WorkSource, int, String)>
		return worksource;
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	private static String zza(WorkSource worksource, int i)
	{
		if(zzhm == null)
			break MISSING_BLOCK_LABEL_40;
	//    0    0:getstatic       #51  <Field Method zzhm>
	//    1    3:ifnull          40
		worksource = ((WorkSource) ((String)zzhm.invoke(((Object) (worksource)), new Object[] {
			Integer.valueOf(i)
		})));
	//    2    6:getstatic       #51  <Field Method zzhm>
	//    3    9:aload_0         
	//    4   10:iconst_1        
	//    5   11:anewarray       Object[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:iload_1         
	//    9   17:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   10   20:aastore         
	//   11   21:invokevirtual   #142 <Method Object Method.invoke(Object, Object[])>
	//   12   24:checkcast       #89  <Class String>
	//   13   27:astore_0        
		return ((String) (worksource));
	//   14   28:aload_0         
	//   15   29:areturn         
		worksource;
	//   16   30:astore_0        
		Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable) (worksource)));
	//   17   31:ldc1            #107 <String "WorkSourceUtil">
	//   18   33:ldc1            #207 <String "Unable to assign blame through WorkSource">
	//   19   35:aload_0         
	//   20   36:invokestatic    #210 <Method int Log.wtf(String, String, Throwable)>
	//   21   39:pop             
		return null;
	//   22   40:aconst_null     
	//   23   41:areturn         
	}

	private static void zza(WorkSource worksource, int i, String s)
	{
		if(zzhj != null)
	//*   0    0:getstatic       #36  <Field Method zzhj>
	//*   1    3:ifnull          50
		{
			String s1 = s;
	//    2    6:aload_2         
	//    3    7:astore_3        
			if(s == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       15
				s1 = "";
	//    6   12:ldc1            #212 <String "">
	//    7   14:astore_3        
			try
			{
				zzhj.invoke(((Object) (worksource)), new Object[] {
					Integer.valueOf(i), s1
				});
	//    8   15:getstatic       #36  <Field Method zzhj>
	//    9   18:aload_0         
	//   10   19:iconst_2        
	//   11   20:anewarray       Object[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:iload_1         
	//   15   26:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   16   29:aastore         
	//   17   30:dup             
	//   18   31:iconst_1        
	//   19   32:aload_3         
	//   20   33:aastore         
	//   21   34:invokevirtual   #142 <Method Object Method.invoke(Object, Object[])>
	//   22   37:pop             
				return;
	//   23   38:return          
			}
			// Misplaced declaration of an exception variable
			catch(WorkSource worksource)
	//*  24   39:astore_0        
			{
				Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable) (worksource)));
	//   25   40:ldc1            #107 <String "WorkSourceUtil">
	//   26   42:ldc1            #207 <String "Unable to assign blame through WorkSource">
	//   27   44:aload_0         
	//   28   45:invokestatic    #210 <Method int Log.wtf(String, String, Throwable)>
	//   29   48:pop             
			}
			return;
	//   30   49:return          
		}
		if(zzhi != null)
	//*  31   50:getstatic       #31  <Field Method zzhi>
	//*  32   53:ifnull          86
			try
			{
				zzhi.invoke(((Object) (worksource)), new Object[] {
					Integer.valueOf(i)
				});
	//   33   56:getstatic       #31  <Field Method zzhi>
	//   34   59:aload_0         
	//   35   60:iconst_1        
	//   36   61:anewarray       Object[]
	//   37   64:dup             
	//   38   65:iconst_0        
	//   39   66:iload_1         
	//   40   67:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   41   70:aastore         
	//   42   71:invokevirtual   #142 <Method Object Method.invoke(Object, Object[])>
	//   43   74:pop             
				return;
	//   44   75:return          
			}
			// Misplaced declaration of an exception variable
			catch(WorkSource worksource)
	//*  45   76:astore_0        
			{
				Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable) (worksource)));
	//   46   77:ldc1            #107 <String "WorkSourceUtil">
	//   47   79:ldc1            #207 <String "Unable to assign blame through WorkSource">
	//   48   81:aload_0         
	//   49   82:invokestatic    #210 <Method int Log.wtf(String, String, Throwable)>
	//   50   85:pop             
			}
	//   51   86:return          
	}

	private static Method zzaa()
	{
		if(!PlatformVersion.isAtLeastJellyBeanMR2())
			break MISSING_BLOCK_LABEL_26;
	//    0    0:invokestatic    #218 <Method boolean PlatformVersion.isAtLeastJellyBeanMR2()>
	//    1    3:ifeq            26
		Method method = ((Class) (android/os/WorkSource)).getMethod("getName", new Class[] {
			Integer.TYPE
		});
	//    2    6:ldc1            #135 <Class WorkSource>
	//    3    8:ldc1            #220 <String "getName">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #226 <Field Class Integer.TYPE>
	//    9   19:aastore         
	//   10   20:invokevirtual   #230 <Method Method Class.getMethod(String, Class[])>
	//   11   23:astore_0        
		return method;
	//   12   24:aload_0         
	//   13   25:areturn         
_L2:
		return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		Exception exception;
		exception;
	//   16   28:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  17   29:goto            26
	}

	private static final Method zzab()
	{
		if(!PlatformVersion.isAtLeastP())
			break MISSING_BLOCK_LABEL_30;
	//    0    0:invokestatic    #233 <Method boolean PlatformVersion.isAtLeastP()>
	//    1    3:ifeq            30
		Method method = ((Class) (android/os/WorkSource)).getMethod("createWorkChain", new Class[0]);
	//    2    6:ldc1            #135 <Class WorkSource>
	//    3    8:ldc1            #235 <String "createWorkChain">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #230 <Method Method Class.getMethod(String, Class[])>
	//    7   17:astore_0        
		return method;
	//    8   18:aload_0         
	//    9   19:areturn         
		Exception exception;
		exception;
	//   10   20:astore_0        
		Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", ((Throwable) (exception)));
	//   11   21:ldc1            #107 <String "WorkSourceUtil">
	//   12   23:ldc1            #237 <String "Missing WorkChain API createWorkChain">
	//   13   25:aload_0         
	//   14   26:invokestatic    #153 <Method int Log.w(String, String, Throwable)>
	//   15   29:pop             
		return null;
	//   16   30:aconst_null     
	//   17   31:areturn         
	}

	private static final Method zzac()
	{
		if(!PlatformVersion.isAtLeastP())
			break MISSING_BLOCK_LABEL_44;
	//    0    0:invokestatic    #233 <Method boolean PlatformVersion.isAtLeastP()>
	//    1    3:ifeq            44
		Method method = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[] {
			Integer.TYPE, java/lang/String
		});
	//    2    6:ldc1            #242 <String "android.os.WorkSource$WorkChain">
	//    3    8:invokestatic    #246 <Method Class Class.forName(String)>
	//    4   11:ldc1            #248 <String "addNode">
	//    5   13:iconst_2        
	//    6   14:anewarray       Class[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:getstatic       #226 <Field Class Integer.TYPE>
	//   10   22:aastore         
	//   11   23:dup             
	//   12   24:iconst_1        
	//   13   25:ldc1            #89  <Class String>
	//   14   27:aastore         
	//   15   28:invokevirtual   #230 <Method Method Class.getMethod(String, Class[])>
	//   16   31:astore_0        
		return method;
	//   17   32:aload_0         
	//   18   33:areturn         
		Exception exception;
		exception;
	//   19   34:astore_0        
		Log.w("WorkSourceUtil", "Missing WorkChain class", ((Throwable) (exception)));
	//   20   35:ldc1            #107 <String "WorkSourceUtil">
	//   21   37:ldc1            #250 <String "Missing WorkChain class">
	//   22   39:aload_0         
	//   23   40:invokestatic    #153 <Method int Log.w(String, String, Throwable)>
	//   24   43:pop             
		return null;
	//   25   44:aconst_null     
	//   26   45:areturn         
	}

	private static int zzd(Context context, String s)
	{
		try
		{
			context = ((Context) (Wrappers.packageManager(context).getApplicationInfo(s, 0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #81  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #87  <Method ApplicationInfo PackageManagerWrapper.getApplicationInfo(String, int)>
	//    5    9:astore_0        
		}
	//*   6   10:aload_0         
	//*   7   11:ifnonnull       55
	//*   8   14:aload_1         
	//*   9   15:invokestatic    #93  <Method String String.valueOf(Object)>
	//*  10   18:astore_0        
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #96  <Method int String.length()>
	//*  13   23:ifeq            36
	//*  14   26:ldc1            #98  <String "Could not get applicationInfo from package: ">
	//*  15   28:aload_0         
	//*  16   29:invokevirtual   #102 <Method String String.concat(String)>
	//*  17   32:astore_0        
	//*  18   33:goto            46
	//*  19   36:new             #89  <Class String>
	//*  20   39:dup             
	//*  21   40:ldc1            #98  <String "Could not get applicationInfo from package: ">
	//*  22   42:invokespecial   #105 <Method void String(String)>
	//*  23   45:astore_0        
	//*  24   46:ldc1            #107 <String "WorkSourceUtil">
	//*  25   48:aload_0         
	//*  26   49:invokestatic    #113 <Method int Log.e(String, String)>
	//*  27   52:pop             
	//*  28   53:iconst_m1       
	//*  29   54:ireturn         
	//*  30   55:aload_0         
	//*  31   56:getfield        #118 <Field int ApplicationInfo.uid>
	//*  32   59:ireturn         
	//*  33   60:aload_1         
	//*  34   61:invokestatic    #93  <Method String String.valueOf(Object)>
	//*  35   64:astore_0        
	//*  36   65:aload_0         
	//*  37   66:invokevirtual   #96  <Method int String.length()>
	//*  38   69:ifeq            82
	//*  39   72:ldc1            #124 <String "Could not find package: ">
	//*  40   74:aload_0         
	//*  41   75:invokevirtual   #102 <Method String String.concat(String)>
	//*  42   78:astore_0        
	//*  43   79:goto            92
	//*  44   82:new             #89  <Class String>
	//*  45   85:dup             
	//*  46   86:ldc1            #124 <String "Could not find package: ">
	//*  47   88:invokespecial   #105 <Method void String(String)>
	//*  48   91:astore_0        
	//*  49   92:ldc1            #107 <String "WorkSourceUtil">
	//*  50   94:aload_0         
	//*  51   95:invokestatic    #113 <Method int Log.e(String, String)>
	//*  52   98:pop             
	//*  53   99:iconst_m1       
	//*  54  100:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = ((Context) (String.valueOf(((Object) (s)))));
			if(((String) (context)).length() != 0)
				context = ((Context) ("Could not find package: ".concat(((String) (context)))));
			else
				context = ((Context) (new String("Could not find package: ")));
			Log.e("WorkSourceUtil", ((String) (context)));
			return -1;
		}
		if(context == null)
		{
			context = ((Context) (String.valueOf(((Object) (s)))));
			if(((String) (context)).length() != 0)
				context = ((Context) ("Could not get applicationInfo from package: ".concat(((String) (context)))));
			else
				context = ((Context) (new String("Could not get applicationInfo from package: ")));
			Log.e("WorkSourceUtil", ((String) (context)));
			return -1;
		} else
		{
			return ((ApplicationInfo) (context)).uid;
		}
	//*  55  101:astore_0        
	//*  56  102:goto            60
	}

	private static Method zzw()
	{
		Exception exception;
		Method method;
		try
		{
			method = ((Class) (android/os/WorkSource)).getMethod("add", new Class[] {
				Integer.TYPE
			});
	//    0    0:ldc1            #135 <Class WorkSource>
	//    1    2:ldc1            #251 <String "add">
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #226 <Field Class Integer.TYPE>
	//    7   13:aastore         
	//    8   14:invokevirtual   #230 <Method Method Class.getMethod(String, Class[])>
	//    9   17:astore_0        
		}
	//*  10   18:aload_0         
	//*  11   19:areturn         
	//*  12   20:aconst_null     
	//*  13   21:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return null;
		}
		return method;
	//*  14   22:astore_0        
	//*  15   23:goto            20
	}

	private static Method zzx()
	{
		if(!PlatformVersion.isAtLeastJellyBeanMR2())
			break MISSING_BLOCK_LABEL_31;
	//    0    0:invokestatic    #218 <Method boolean PlatformVersion.isAtLeastJellyBeanMR2()>
	//    1    3:ifeq            31
		Method method = ((Class) (android/os/WorkSource)).getMethod("add", new Class[] {
			Integer.TYPE, java/lang/String
		});
	//    2    6:ldc1            #135 <Class WorkSource>
	//    3    8:ldc1            #251 <String "add">
	//    4   10:iconst_2        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #226 <Field Class Integer.TYPE>
	//    9   19:aastore         
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:ldc1            #89  <Class String>
	//   13   24:aastore         
	//   14   25:invokevirtual   #230 <Method Method Class.getMethod(String, Class[])>
	//   15   28:astore_0        
		return method;
	//   16   29:aload_0         
	//   17   30:areturn         
_L2:
		return null;
	//   18   31:aconst_null     
	//   19   32:areturn         
		Exception exception;
		exception;
	//   20   33:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  21   34:goto            31
	}

	private static Method zzy()
	{
		Exception exception;
		Method method;
		try
		{
			method = ((Class) (android/os/WorkSource)).getMethod("size", new Class[0]);
	//    0    0:ldc1            #135 <Class WorkSource>
	//    1    2:ldc1            #253 <String "size">
	//    2    4:iconst_0        
	//    3    5:anewarray       Class[]
	//    4    8:invokevirtual   #230 <Method Method Class.getMethod(String, Class[])>
	//    5   11:astore_0        
		}
	//*   6   12:aload_0         
	//*   7   13:areturn         
	//*   8   14:aconst_null     
	//*   9   15:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return null;
		}
		return method;
	//*  10   16:astore_0        
	//*  11   17:goto            14
	}

	private static Method zzz()
	{
		Exception exception;
		Method method;
		try
		{
			method = ((Class) (android/os/WorkSource)).getMethod("get", new Class[] {
				Integer.TYPE
			});
	//    0    0:ldc1            #135 <Class WorkSource>
	//    1    2:ldc1            #255 <String "get">
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #226 <Field Class Integer.TYPE>
	//    7   13:aastore         
	//    8   14:invokevirtual   #230 <Method Method Class.getMethod(String, Class[])>
	//    9   17:astore_0        
		}
	//*  10   18:aload_0         
	//*  11   19:areturn         
	//*  12   20:aconst_null     
	//*  13   21:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return null;
		}
		return method;
	//*  14   22:astore_0        
	//*  15   23:goto            20
	}

	private static final int zzhh = Process.myUid();
	private static final Method zzhi = zzw();
	private static final Method zzhj = zzx();
	private static final Method zzhk = zzy();
	private static final Method zzhl = zzz();
	private static final Method zzhm = zzaa();
	private static final Method zzhn = zzab();
	private static final Method zzho = zzac();

	static 
	{
	//    0    0:invokestatic    #23  <Method int Process.myUid()>
	//    1    3:putstatic       #25  <Field int zzhh>
	//    2    6:invokestatic    #29  <Method Method zzw()>
	//    3    9:putstatic       #31  <Field Method zzhi>
	//    4   12:invokestatic    #34  <Method Method zzx()>
	//    5   15:putstatic       #36  <Field Method zzhj>
	//    6   18:invokestatic    #39  <Method Method zzy()>
	//    7   21:putstatic       #41  <Field Method zzhk>
	//    8   24:invokestatic    #44  <Method Method zzz()>
	//    9   27:putstatic       #46  <Field Method zzhl>
	//   10   30:invokestatic    #49  <Method Method zzaa()>
	//   11   33:putstatic       #51  <Field Method zzhm>
	//   12   36:invokestatic    #54  <Method Method zzab()>
	//   13   39:putstatic       #56  <Field Method zzhn>
	//   14   42:invokestatic    #59  <Method Method zzac()>
	//   15   45:putstatic       #61  <Field Method zzho>
	//*  16   48:return          
	}
}
