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
	//    1    1:invokespecial   #68  <Method void Object()>
	//    2    4:return          
	}

	public static void add(WorkSource worksource, int i, String s)
	{
		if(zzaao != null)
	//*   0    0:getstatic       #39  <Field Method zzaao>
	//*   1    3:ifnull          50
		{
			String s1 = s;
	//    2    6:aload_2         
	//    3    7:astore_3        
			if(s == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       15
				s1 = "";
	//    6   12:ldc1            #75  <String "">
	//    7   14:astore_3        
			try
			{
				zzaao.invoke(((Object) (worksource)), new Object[] {
					Integer.valueOf(i), s1
				});
	//    8   15:getstatic       #39  <Field Method zzaao>
	//    9   18:aload_0         
	//   10   19:iconst_2        
	//   11   20:anewarray       Object[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:iload_1         
	//   15   26:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   16   29:aastore         
	//   17   30:dup             
	//   18   31:iconst_1        
	//   19   32:aload_3         
	//   20   33:aastore         
	//   21   34:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
	//   22   37:pop             
				return;
	//   23   38:return          
			}
			// Misplaced declaration of an exception variable
			catch(WorkSource worksource)
	//*  24   39:astore_0        
			{
				Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable) (worksource)));
	//   25   40:ldc1            #8   <String "WorkSourceUtil">
	//   26   42:ldc1            #89  <String "Unable to assign blame through WorkSource">
	//   27   44:aload_0         
	//   28   45:invokestatic    #95  <Method int Log.wtf(String, String, Throwable)>
	//   29   48:pop             
			}
			return;
	//   30   49:return          
		}
		s = ((String) (zzaan));
	//   31   50:getstatic       #34  <Field Method zzaan>
	//   32   53:astore_2        
		if(s != null)
	//*  33   54:aload_2         
	//*  34   55:ifnull          86
			try
			{
				((Method) (s)).invoke(((Object) (worksource)), new Object[] {
					Integer.valueOf(i)
				});
	//   35   58:aload_2         
	//   36   59:aload_0         
	//   37   60:iconst_1        
	//   38   61:anewarray       Object[]
	//   39   64:dup             
	//   40   65:iconst_0        
	//   41   66:iload_1         
	//   42   67:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   43   70:aastore         
	//   44   71:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
	//   45   74:pop             
				return;
	//   46   75:return          
			}
			// Misplaced declaration of an exception variable
			catch(WorkSource worksource)
	//*  47   76:astore_0        
			{
				Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable) (worksource)));
	//   48   77:ldc1            #8   <String "WorkSourceUtil">
	//   49   79:ldc1            #89  <String "Unable to assign blame through WorkSource">
	//   50   81:aload_0         
	//   51   82:invokestatic    #95  <Method int Log.wtf(String, String, Throwable)>
	//   52   85:pop             
			}
	//   53   86:return          
	}

	public static WorkSource fromPackage(Context context, String s)
	{
		if(context == null || context.getPackageManager() == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          120
	//    2    4:aload_0         
	//    3    5:invokevirtual   #106 <Method android.content.pm.PackageManager Context.getPackageManager()>
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
	//   10   18:invokestatic    #112 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   11   21:aload_1         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #118 <Method ApplicationInfo PackageManagerWrapper.getApplicationInfo(String, int)>
	//   14   26:astore_0        
		if(context == null)
	//*  15   27:aload_0         
	//*  16   28:ifnonnull       72
		{
			context = ((Context) (String.valueOf(((Object) (s)))));
	//   17   31:aload_1         
	//   18   32:invokestatic    #123 <Method String String.valueOf(Object)>
	//   19   35:astore_0        
			if(((String) (context)).length() != 0)
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #126 <Method int String.length()>
	//*  22   40:ifeq            53
				context = ((Context) ("Could not get applicationInfo from package: ".concat(((String) (context)))));
	//   23   43:ldc1            #128 <String "Could not get applicationInfo from package: ">
	//   24   45:aload_0         
	//   25   46:invokevirtual   #132 <Method String String.concat(String)>
	//   26   49:astore_0        
			else
	//*  27   50:goto            63
				context = ((Context) (new String("Could not get applicationInfo from package: ")));
	//   28   53:new             #120 <Class String>
	//   29   56:dup             
	//   30   57:ldc1            #128 <String "Could not get applicationInfo from package: ">
	//   31   59:invokespecial   #135 <Method void String(String)>
	//   32   62:astore_0        
			Log.e("WorkSourceUtil", ((String) (context)));
	//   33   63:ldc1            #8   <String "WorkSourceUtil">
	//   34   65:aload_0         
	//   35   66:invokestatic    #139 <Method int Log.e(String, String)>
	//   36   69:pop             
			return null;
	//   37   70:aconst_null     
	//   38   71:areturn         
		} else
		{
			return fromUidAndPackage(((ApplicationInfo) (context)).uid, s);
	//   39   72:aload_0         
	//   40   73:getfield        #144 <Field int ApplicationInfo.uid>
	//   41   76:aload_1         
	//   42   77:invokestatic    #148 <Method WorkSource fromUidAndPackage(int, String)>
	//   43   80:areturn         
		}
_L4:
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   44   81:aload_1         
	//   45   82:invokestatic    #123 <Method String String.valueOf(Object)>
	//   46   85:astore_0        
		if(((String) (context)).length() != 0)
	//*  47   86:aload_0         
	//*  48   87:invokevirtual   #126 <Method int String.length()>
	//*  49   90:ifeq            103
			context = ((Context) ("Could not find package: ".concat(((String) (context)))));
	//   50   93:ldc1            #150 <String "Could not find package: ">
	//   51   95:aload_0         
	//   52   96:invokevirtual   #132 <Method String String.concat(String)>
	//   53   99:astore_0        
		else
	//*  54  100:goto            113
			context = ((Context) (new String("Could not find package: ")));
	//   55  103:new             #120 <Class String>
	//   56  106:dup             
	//   57  107:ldc1            #150 <String "Could not find package: ">
	//   58  109:invokespecial   #135 <Method void String(String)>
	//   59  112:astore_0        
		Log.e("WorkSourceUtil", ((String) (context)));
	//   60  113:ldc1            #8   <String "WorkSourceUtil">
	//   61  115:aload_0         
	//   62  116:invokestatic    #139 <Method int Log.e(String, String)>
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
	//*   1    1:ifnull          152
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #106 <Method android.content.pm.PackageManager Context.getPackageManager()>
	//*   4    8:ifnull          152
	//*   5   11:aload_2         
	//*   6   12:ifnull          152
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       22
	//*   9   19:goto            152
		{
			int i = zzc(context, s);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokestatic    #157 <Method int zzc(Context, String)>
	//   13   27:istore_3        
			if(i < 0)
	//*  14   28:iload_3         
	//*  15   29:ifge            34
				return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
			context = ((Context) (new WorkSource()));
	//   18   34:new             #159 <Class WorkSource>
	//   19   37:dup             
	//   20   38:invokespecial   #160 <Method void WorkSource()>
	//   21   41:astore_0        
			Object obj = ((Object) (zzaas));
	//   22   42:getstatic       #59  <Field Method zzaas>
	//   23   45:astore          4
			if(obj != null && zzaat != null)
	//*  24   47:aload           4
	//*  25   49:ifnull          144
	//*  26   52:getstatic       #64  <Field Method zzaat>
	//*  27   55:ifnonnull       61
	//*  28   58:goto            144
			{
				try
				{
					obj = ((Method) (obj)).invoke(((Object) (context)), new Object[0]);
	//   29   61:aload           4
	//   30   63:aload_0         
	//   31   64:iconst_0        
	//   32   65:anewarray       Object[]
	//   33   68:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
	//   34   71:astore          4
					if(i != zzaam)
	//*  35   73:iload_3         
	//*  36   74:getstatic       #28  <Field int zzaam>
	//*  37   77:icmpeq          104
						zzaat.invoke(obj, new Object[] {
							Integer.valueOf(i), s
						});
	//   38   80:getstatic       #64  <Field Method zzaat>
	//   39   83:aload           4
	//   40   85:iconst_2        
	//   41   86:anewarray       Object[]
	//   42   89:dup             
	//   43   90:iconst_0        
	//   44   91:iload_3         
	//   45   92:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   46   95:aastore         
	//   47   96:dup             
	//   48   97:iconst_1        
	//   49   98:aload_1         
	//   50   99:aastore         
	//   51  100:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
	//   52  103:pop             
					zzaat.invoke(obj, new Object[] {
						Integer.valueOf(zzaam), s1
					});
	//   53  104:getstatic       #64  <Field Method zzaat>
	//   54  107:aload           4
	//   55  109:iconst_2        
	//   56  110:anewarray       Object[]
	//   57  113:dup             
	//   58  114:iconst_0        
	//   59  115:getstatic       #28  <Field int zzaam>
	//   60  118:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   61  121:aastore         
	//   62  122:dup             
	//   63  123:iconst_1        
	//   64  124:aload_2         
	//   65  125:aastore         
	//   66  126:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
	//   67  129:pop             
				}
	//*  68  130:aload_0         
	//*  69  131:areturn         
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  70  132:astore_1        
				{
					Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", ((Throwable) (s)));
	//   71  133:ldc1            #8   <String "WorkSourceUtil">
	//   72  135:ldc1            #162 <String "Unable to assign chained blame through WorkSource">
	//   73  137:aload_1         
	//   74  138:invokestatic    #165 <Method int Log.w(String, String, Throwable)>
	//   75  141:pop             
					return ((WorkSource) (context));
	//   76  142:aload_0         
	//   77  143:areturn         
				}
				return ((WorkSource) (context));
			} else
			{
				add(((WorkSource) (context)), i, s);
	//   78  144:aload_0         
	//   79  145:iload_3         
	//   80  146:aload_1         
	//   81  147:invokestatic    #167 <Method void add(WorkSource, int, String)>
				return ((WorkSource) (context));
	//   82  150:aload_0         
	//   83  151:areturn         
			}
		} else
		{
			Log.w("WorkSourceUtil", "Unexpected null arguments");
	//   84  152:ldc1            #8   <String "WorkSourceUtil">
	//   85  154:ldc1            #169 <String "Unexpected null arguments">
	//   86  156:invokestatic    #171 <Method int Log.w(String, String)>
	//   87  159:pop             
			return null;
	//   88  160:aconst_null     
	//   89  161:areturn         
		}
	}

	public static WorkSource fromUidAndPackage(int i, String s)
	{
		WorkSource worksource = new WorkSource();
	//    0    0:new             #159 <Class WorkSource>
	//    1    3:dup             
	//    2    4:invokespecial   #160 <Method void WorkSource()>
	//    3    7:astore_2        
		add(worksource, i, s);
	//    4    8:aload_2         
	//    5    9:iload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #167 <Method void add(WorkSource, int, String)>
		return worksource;
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	public static int get(WorkSource worksource, int i)
	{
		Method method;
		method = zzaaq;
	//    0    0:getstatic       #49  <Field Method zzaaq>
	//    1    3:astore_2        
		if(method == null)
			break MISSING_BLOCK_LABEL_43;
	//    2    4:aload_2         
	//    3    5:ifnull          43
		i = ((Integer)method.invoke(((Object) (worksource)), new Object[] {
			Integer.valueOf(i)
		})).intValue();
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:anewarray       Object[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:iload_1         
	//   11   17:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   12   20:aastore         
	//   13   21:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
	//   14   24:checkcast       #77  <Class Integer>
	//   15   27:invokevirtual   #176 <Method int Integer.intValue()>
	//   16   30:istore_1        
		return i;
	//   17   31:iload_1         
	//   18   32:ireturn         
		worksource;
	//   19   33:astore_0        
		Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable) (worksource)));
	//   20   34:ldc1            #8   <String "WorkSourceUtil">
	//   21   36:ldc1            #89  <String "Unable to assign blame through WorkSource">
	//   22   38:aload_0         
	//   23   39:invokestatic    #95  <Method int Log.wtf(String, String, Throwable)>
	//   24   42:pop             
		return 0;
	//   25   43:iconst_0        
	//   26   44:ireturn         
	}

	public static String getName(WorkSource worksource, int i)
	{
		Method method;
		method = zzaar;
	//    0    0:getstatic       #54  <Field Method zzaar>
	//    1    3:astore_2        
		if(method == null)
			break MISSING_BLOCK_LABEL_40;
	//    2    4:aload_2         
	//    3    5:ifnull          40
		worksource = ((WorkSource) ((String)method.invoke(((Object) (worksource)), new Object[] {
			Integer.valueOf(i)
		})));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:anewarray       Object[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:iload_1         
	//   11   17:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   12   20:aastore         
	//   13   21:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
	//   14   24:checkcast       #120 <Class String>
	//   15   27:astore_0        
		return ((String) (worksource));
	//   16   28:aload_0         
	//   17   29:areturn         
		worksource;
	//   18   30:astore_0        
		Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable) (worksource)));
	//   19   31:ldc1            #8   <String "WorkSourceUtil">
	//   20   33:ldc1            #89  <String "Unable to assign blame through WorkSource">
	//   21   35:aload_0         
	//   22   36:invokestatic    #95  <Method int Log.wtf(String, String, Throwable)>
	//   23   39:pop             
		return null;
	//   24   40:aconst_null     
	//   25   41:areturn         
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
			i = size(worksource);
	//    7   11:aload_0         
	//    8   12:invokestatic    #184 <Method int size(WorkSource)>
	//    9   15:istore_1        
		if(i == 0)
	//*  10   16:iload_1         
	//*  11   17:ifne            24
			return Collections.emptyList();
	//   12   20:invokestatic    #190 <Method List Collections.emptyList()>
	//   13   23:areturn         
		ArrayList arraylist = new ArrayList();
	//   14   24:new             #192 <Class ArrayList>
	//   15   27:dup             
	//   16   28:invokespecial   #193 <Method void ArrayList()>
	//   17   31:astore_3        
		for(; j < i; j++)
	//*  18   32:iload_2         
	//*  19   33:iload_1         
	//*  20   34:icmpge          68
		{
			String s = getName(worksource, j);
	//   21   37:aload_0         
	//   22   38:iload_2         
	//   23   39:invokestatic    #195 <Method String getName(WorkSource, int)>
	//   24   42:astore          4
			if(!Strings.isEmptyOrWhitespace(s))
	//*  25   44:aload           4
	//*  26   46:invokestatic    #201 <Method boolean Strings.isEmptyOrWhitespace(String)>
	//*  27   49:ifne            61
				((List) (arraylist)).add(((Object) (s)));
	//   28   52:aload_3         
	//   29   53:aload           4
	//   30   55:invokeinterface #206 <Method boolean List.add(Object)>
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
	//*   5    7:invokevirtual   #106 <Method android.content.pm.PackageManager Context.getPackageManager()>
	//*   6   10:ifnonnull       15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		return Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
	//    9   15:aload_0         
	//   10   16:invokestatic    #112 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   11   19:ldc1            #212 <String "android.permission.UPDATE_DEVICE_STATS">
	//   12   21:aload_0         
	//   13   22:invokevirtual   #216 <Method String Context.getPackageName()>
	//   14   25:invokevirtual   #219 <Method int PackageManagerWrapper.checkPermission(String, String)>
	//   15   28:ifne            33
	//   16   31:iconst_1        
	//   17   32:ireturn         
	//   18   33:iconst_0        
	//   19   34:ireturn         
	}

	public static int size(WorkSource worksource)
	{
		Method method;
		method = zzaap;
	//    0    0:getstatic       #44  <Field Method zzaap>
	//    1    3:astore_2        
		if(method == null)
			break MISSING_BLOCK_LABEL_36;
	//    2    4:aload_2         
	//    3    5:ifnull          36
		int i = ((Integer)method.invoke(((Object) (worksource)), new Object[0])).intValue();
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:anewarray       Object[]
	//    8   14:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
	//    9   17:checkcast       #77  <Class Integer>
	//   10   20:invokevirtual   #176 <Method int Integer.intValue()>
	//   11   23:istore_1        
		return i;
	//   12   24:iload_1         
	//   13   25:ireturn         
		worksource;
	//   14   26:astore_0        
		Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", ((Throwable) (worksource)));
	//   15   27:ldc1            #8   <String "WorkSourceUtil">
	//   16   29:ldc1            #89  <String "Unable to assign blame through WorkSource">
	//   17   31:aload_0         
	//   18   32:invokestatic    #95  <Method int Log.wtf(String, String, Throwable)>
	//   19   35:pop             
		return 0;
	//   20   36:iconst_0        
	//   21   37:ireturn         
	}

	private static int zzc(Context context, String s)
	{
		try
		{
			context = ((Context) (Wrappers.packageManager(context).getApplicationInfo(s, 0)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #112 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #118 <Method ApplicationInfo PackageManagerWrapper.getApplicationInfo(String, int)>
	//    5    9:astore_0        
		}
	//*   6   10:aload_0         
	//*   7   11:ifnonnull       55
	//*   8   14:aload_1         
	//*   9   15:invokestatic    #123 <Method String String.valueOf(Object)>
	//*  10   18:astore_0        
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #126 <Method int String.length()>
	//*  13   23:ifeq            36
	//*  14   26:ldc1            #128 <String "Could not get applicationInfo from package: ">
	//*  15   28:aload_0         
	//*  16   29:invokevirtual   #132 <Method String String.concat(String)>
	//*  17   32:astore_0        
	//*  18   33:goto            46
	//*  19   36:new             #120 <Class String>
	//*  20   39:dup             
	//*  21   40:ldc1            #128 <String "Could not get applicationInfo from package: ">
	//*  22   42:invokespecial   #135 <Method void String(String)>
	//*  23   45:astore_0        
	//*  24   46:ldc1            #8   <String "WorkSourceUtil">
	//*  25   48:aload_0         
	//*  26   49:invokestatic    #139 <Method int Log.e(String, String)>
	//*  27   52:pop             
	//*  28   53:iconst_m1       
	//*  29   54:ireturn         
	//*  30   55:aload_0         
	//*  31   56:getfield        #144 <Field int ApplicationInfo.uid>
	//*  32   59:ireturn         
	//*  33   60:aload_1         
	//*  34   61:invokestatic    #123 <Method String String.valueOf(Object)>
	//*  35   64:astore_0        
	//*  36   65:aload_0         
	//*  37   66:invokevirtual   #126 <Method int String.length()>
	//*  38   69:ifeq            82
	//*  39   72:ldc1            #150 <String "Could not find package: ">
	//*  40   74:aload_0         
	//*  41   75:invokevirtual   #132 <Method String String.concat(String)>
	//*  42   78:astore_0        
	//*  43   79:goto            92
	//*  44   82:new             #120 <Class String>
	//*  45   85:dup             
	//*  46   86:ldc1            #150 <String "Could not find package: ">
	//*  47   88:invokespecial   #135 <Method void String(String)>
	//*  48   91:astore_0        
	//*  49   92:ldc1            #8   <String "WorkSourceUtil">
	//*  50   94:aload_0         
	//*  51   95:invokestatic    #139 <Method int Log.e(String, String)>
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

	private static Method zzdf()
	{
		Exception exception;
		Method method;
		try
		{
			method = ((Class) (android/os/WorkSource)).getMethod("add", new Class[] {
				Integer.TYPE
			});
	//    0    0:ldc1            #159 <Class WorkSource>
	//    1    2:ldc1            #220 <String "add">
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

	private static Method zzdg()
	{
		if(!PlatformVersion.isAtLeastJellyBeanMR2())
			break MISSING_BLOCK_LABEL_31;
	//    0    0:invokestatic    #236 <Method boolean PlatformVersion.isAtLeastJellyBeanMR2()>
	//    1    3:ifeq            31
		Method method = ((Class) (android/os/WorkSource)).getMethod("add", new Class[] {
			Integer.TYPE, java/lang/String
		});
	//    2    6:ldc1            #159 <Class WorkSource>
	//    3    8:ldc1            #220 <String "add">
	//    4   10:iconst_2        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #226 <Field Class Integer.TYPE>
	//    9   19:aastore         
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:ldc1            #120 <Class String>
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

	private static Method zzdh()
	{
		Exception exception;
		Method method;
		try
		{
			method = ((Class) (android/os/WorkSource)).getMethod("size", new Class[0]);
	//    0    0:ldc1            #159 <Class WorkSource>
	//    1    2:ldc1            #237 <String "size">
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

	private static Method zzdi()
	{
		Exception exception;
		Method method;
		try
		{
			method = ((Class) (android/os/WorkSource)).getMethod("get", new Class[] {
				Integer.TYPE
			});
	//    0    0:ldc1            #159 <Class WorkSource>
	//    1    2:ldc1            #238 <String "get">
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

	private static Method zzdj()
	{
		if(!PlatformVersion.isAtLeastJellyBeanMR2())
			break MISSING_BLOCK_LABEL_26;
	//    0    0:invokestatic    #236 <Method boolean PlatformVersion.isAtLeastJellyBeanMR2()>
	//    1    3:ifeq            26
		Method method = ((Class) (android/os/WorkSource)).getMethod("getName", new Class[] {
			Integer.TYPE
		});
	//    2    6:ldc1            #159 <Class WorkSource>
	//    3    8:ldc1            #239 <String "getName">
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

	private static final Method zzdk()
	{
		if(!PlatformVersion.isAtLeastP())
			break MISSING_BLOCK_LABEL_30;
	//    0    0:invokestatic    #242 <Method boolean PlatformVersion.isAtLeastP()>
	//    1    3:ifeq            30
		Method method = ((Class) (android/os/WorkSource)).getMethod("createWorkChain", new Class[0]);
	//    2    6:ldc1            #159 <Class WorkSource>
	//    3    8:ldc1            #244 <String "createWorkChain">
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
	//   11   21:ldc1            #8   <String "WorkSourceUtil">
	//   12   23:ldc1            #246 <String "Missing WorkChain API createWorkChain">
	//   13   25:aload_0         
	//   14   26:invokestatic    #165 <Method int Log.w(String, String, Throwable)>
	//   15   29:pop             
		return null;
	//   16   30:aconst_null     
	//   17   31:areturn         
	}

	private static final Method zzdl()
	{
		if(!PlatformVersion.isAtLeastP())
			break MISSING_BLOCK_LABEL_46;
	//    0    0:invokestatic    #242 <Method boolean PlatformVersion.isAtLeastP()>
	//    1    3:ifeq            46
		Method method = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[] {
			Integer.TYPE, java/lang/String
		});
	//    2    6:ldc1            #251 <String "android.os.WorkSource$WorkChain">
	//    3    8:invokestatic    #255 <Method Class Class.forName(String)>
	//    4   11:ldc2            #257 <String "addNode">
	//    5   14:iconst_2        
	//    6   15:anewarray       Class[]
	//    7   18:dup             
	//    8   19:iconst_0        
	//    9   20:getstatic       #226 <Field Class Integer.TYPE>
	//   10   23:aastore         
	//   11   24:dup             
	//   12   25:iconst_1        
	//   13   26:ldc1            #120 <Class String>
	//   14   28:aastore         
	//   15   29:invokevirtual   #230 <Method Method Class.getMethod(String, Class[])>
	//   16   32:astore_0        
		return method;
	//   17   33:aload_0         
	//   18   34:areturn         
		Exception exception;
		exception;
	//   19   35:astore_0        
		Log.w("WorkSourceUtil", "Missing WorkChain class", ((Throwable) (exception)));
	//   20   36:ldc1            #8   <String "WorkSourceUtil">
	//   21   38:ldc2            #259 <String "Missing WorkChain class">
	//   22   41:aload_0         
	//   23   42:invokestatic    #165 <Method int Log.w(String, String, Throwable)>
	//   24   45:pop             
		return null;
	//   25   46:aconst_null     
	//   26   47:areturn         
	}

	public static final String TAG = "WorkSourceUtil";
	private static final int zzaam = Process.myUid();
	private static final Method zzaan = zzdf();
	private static final Method zzaao = zzdg();
	private static final Method zzaap = zzdh();
	private static final Method zzaaq = zzdi();
	private static final Method zzaar = zzdj();
	private static final Method zzaas = zzdk();
	private static final Method zzaat = zzdl();

	static 
	{
	//    0    0:invokestatic    #26  <Method int Process.myUid()>
	//    1    3:putstatic       #28  <Field int zzaam>
	//    2    6:invokestatic    #32  <Method Method zzdf()>
	//    3    9:putstatic       #34  <Field Method zzaan>
	//    4   12:invokestatic    #37  <Method Method zzdg()>
	//    5   15:putstatic       #39  <Field Method zzaao>
	//    6   18:invokestatic    #42  <Method Method zzdh()>
	//    7   21:putstatic       #44  <Field Method zzaap>
	//    8   24:invokestatic    #47  <Method Method zzdi()>
	//    9   27:putstatic       #49  <Field Method zzaaq>
	//   10   30:invokestatic    #52  <Method Method zzdj()>
	//   11   33:putstatic       #54  <Field Method zzaar>
	//   12   36:invokestatic    #57  <Method Method zzdk()>
	//   13   39:putstatic       #59  <Field Method zzaas>
	//   14   42:invokestatic    #62  <Method Method zzdl()>
	//   15   45:putstatic       #64  <Field Method zzaat>
	//*  16   48:return          
	}
}
