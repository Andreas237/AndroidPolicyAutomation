// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.wrappers;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.*;
import android.os.Binder;
import android.os.Process;
import android.support.v4.content.PermissionChecker;
import android.support.v4.util.Pair;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.common.wrappers:
//			InstantApps

public class PackageManagerWrapper
{

	public PackageManagerWrapper(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		zzjp = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Context zzjp>
	//    5    9:return          
	}

	public boolean allowApiAccess(String s, int i)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void checkCallerIsNotInstantApp()
	{
		if(!isCallerInstantApp())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #21  <Method boolean isCallerInstantApp()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new SecurityException("This operation is not supported for instant apps.");
	//    4    8:new             #23  <Class SecurityException>
	//    5   11:dup             
	//    6   12:ldc1            #25  <String "This operation is not supported for instant apps.">
	//    7   14:invokespecial   #28  <Method void SecurityException(String)>
	//    8   17:athrow          
	}

	public int checkCallingOrSelfPermission(String s)
	{
		return zzjp.checkCallingOrSelfPermission(s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method int Context.checkCallingOrSelfPermission(String)>
	//    4    8:ireturn         
	}

	public int checkCallingOrSelfPermissionAndAppOps(String s)
	{
		return PermissionChecker.checkCallingOrSelfPermission(zzjp, s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:aload_1         
	//    3    5:invokestatic    #40  <Method int PermissionChecker.checkCallingOrSelfPermission(Context, String)>
	//    4    8:ireturn         
	}

	public int checkCallingPermission(String s)
	{
		return zzjp.checkCallingPermission(s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method int Context.checkCallingPermission(String)>
	//    4    8:ireturn         
	}

	public int checkCallingPermission(String s, String s1)
	{
		return checkPermission(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #48  <Method int checkPermission(String, String)>
	//    4    6:ireturn         
	}

	public int checkCallingPermissionAndAppOps(String s, String s1)
	{
		return PermissionChecker.checkCallingPermission(zzjp, s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #53  <Method int PermissionChecker.checkCallingPermission(Context, String, String)>
	//    5    9:ireturn         
	}

	public void checkPackage(int i, String s)
	{
		if(uidHasPackageName(i, s))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokevirtual   #59  <Method boolean uidHasPackageName(int, String)>
	//*   4    6:ifeq            10
		{
			return;
	//    5    9:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 39);
	//    6   10:new             #61  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokestatic    #67  <Method String String.valueOf(Object)>
	//   10   18:invokevirtual   #71  <Method int String.length()>
	//   11   21:bipush          39
	//   12   23:iadd            
	//   13   24:invokespecial   #74  <Method void StringBuilder(int)>
	//   14   27:astore_3        
			stringbuilder.append("Package ");
	//   15   28:aload_3         
	//   16   29:ldc1            #76  <String "Package ">
	//   17   31:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			stringbuilder.append(s);
	//   19   35:aload_3         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			stringbuilder.append(" does not belong to ");
	//   23   41:aload_3         
	//   24   42:ldc1            #82  <String " does not belong to ">
	//   25   44:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
			stringbuilder.append(i);
	//   27   48:aload_3         
	//   28   49:iload_1         
	//   29   50:invokevirtual   #85  <Method StringBuilder StringBuilder.append(int)>
	//   30   53:pop             
			throw new SecurityException(stringbuilder.toString());
	//   31   54:new             #23  <Class SecurityException>
	//   32   57:dup             
	//   33   58:aload_3         
	//   34   59:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   35   62:invokespecial   #28  <Method void SecurityException(String)>
	//   36   65:athrow          
		}
	}

	public int checkPermission(String s, int i, int j)
	{
		return zzjp.checkPermission(s, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #92  <Method int Context.checkPermission(String, int, int)>
	//    6   10:ireturn         
	}

	public int checkPermission(String s, int i, int j, String s1)
	{
		return checkPermission(s, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #94  <Method int checkPermission(String, int, int)>
	//    5    7:ireturn         
	}

	public int checkPermission(String s, String s1)
	{
		return zzjp.getPackageManager().checkPermission(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #101 <Method int PackageManager.checkPermission(String, String)>
	//    6   12:ireturn         
	}

	public int checkPermissionAndAppOps(String s, int i, int j, String s1)
	{
		return PermissionChecker.checkPermission(zzjp, s, i, j, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokestatic    #105 <Method int PermissionChecker.checkPermission(Context, String, int, int, String)>
	//    7   12:ireturn         
	}

	public ApplicationInfo getApplicationInfo(String s, int i)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return zzjp.getPackageManager().getApplicationInfo(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:invokevirtual   #111 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    6   12:areturn         
	}

	public CharSequence getApplicationLabel(String s)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return zzjp.getPackageManager().getApplicationLabel(zzjp.getPackageManager().getApplicationInfo(s, 0));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field Context zzjp>
	//    5   11:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #111 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   19:invokevirtual   #117 <Method CharSequence PackageManager.getApplicationLabel(ApplicationInfo)>
	//   10   22:areturn         
	}

	public Pair getApplicationLabelAndIcon(String s)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		s = ((String) (zzjp.getPackageManager().getApplicationInfo(s, 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_1         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #111 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    6   12:astore_1        
		return Pair.create(((Object) (zzjp.getPackageManager().getApplicationLabel(((ApplicationInfo) (s))))), ((Object) (zzjp.getPackageManager().getApplicationIcon(((ApplicationInfo) (s))))));
	//    7   13:aload_0         
	//    8   14:getfield        #13  <Field Context zzjp>
	//    9   17:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #117 <Method CharSequence PackageManager.getApplicationLabel(ApplicationInfo)>
	//   12   24:aload_0         
	//   13   25:getfield        #13  <Field Context zzjp>
	//   14   28:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #123 <Method android.graphics.drawable.Drawable PackageManager.getApplicationIcon(ApplicationInfo)>
	//   17   35:invokestatic    #129 <Method Pair Pair.create(Object, Object)>
	//   18   38:areturn         
	}

	public ComponentName getCallingActivity(Activity activity)
	{
		return activity.getCallingActivity();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #138 <Method ComponentName Activity.getCallingActivity()>
	//    2    4:areturn         
	}

	public String getCallingPackage(Activity activity)
	{
		activity = ((Activity) (activity.getCallingActivity()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #138 <Method ComponentName Activity.getCallingActivity()>
	//    2    4:astore_1        
		if(activity == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		Object obj = ((Object) (((ComponentName) (activity)).getPackageName()));
	//    7   11:aload_1         
	//    8   12:invokevirtual   #145 <Method String ComponentName.getPackageName()>
	//    9   15:astore_2        
		if(obj == null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       68
		{
			activity = ((Activity) (String.valueOf(((Object) (activity)))));
	//   12   20:aload_1         
	//   13   21:invokestatic    #67  <Method String String.valueOf(Object)>
	//   14   24:astore_1        
			obj = ((Object) (new StringBuilder(String.valueOf(((Object) (activity))).length() + 54)));
	//   15   25:new             #61  <Class StringBuilder>
	//   16   28:dup             
	//   17   29:aload_1         
	//   18   30:invokestatic    #67  <Method String String.valueOf(Object)>
	//   19   33:invokevirtual   #71  <Method int String.length()>
	//   20   36:bipush          54
	//   21   38:iadd            
	//   22   39:invokespecial   #74  <Method void StringBuilder(int)>
	//   23   42:astore_2        
			((StringBuilder) (obj)).append("getCallingPackage(): Couldn't get a package name from ");
	//   24   43:aload_2         
	//   25   44:ldc1            #147 <String "getCallingPackage(): Couldn't get a package name from ">
	//   26   46:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			((StringBuilder) (obj)).append(((String) (activity)));
	//   28   50:aload_2         
	//   29   51:aload_1         
	//   30   52:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   31   55:pop             
			Log.e("PackageManagerWrapper", ((StringBuilder) (obj)).toString());
	//   32   56:ldc1            #149 <String "PackageManagerWrapper">
	//   33   58:aload_2         
	//   34   59:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   35   62:invokestatic    #154 <Method int Log.e(String, String)>
	//   36   65:pop             
			return null;
	//   37   66:aconst_null     
	//   38   67:areturn         
		} else
		{
			return ((String) (obj));
	//   39   68:aload_2         
	//   40   69:areturn         
		}
	}

	protected Context getContext()
	{
		return zzjp;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:areturn         
	}

	public PackageInfo getPackageInfo(String s, int i)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return zzjp.getPackageManager().getPackageInfo(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:invokevirtual   #160 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:areturn         
	}

	public String[] getPackagesForUid(int i)
	{
		return zzjp.getPackageManager().getPackagesForUid(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context zzjp>
	//    2    4:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #164 <Method String[] PackageManager.getPackagesForUid(int)>
	//    5   11:areturn         
	}

	public boolean isCallerInstantApp()
	{
		if(Binder.getCallingUid() == Process.myUid())
	//*   0    0:invokestatic    #169 <Method int Binder.getCallingUid()>
	//*   1    3:invokestatic    #174 <Method int Process.myUid()>
	//*   2    6:icmpne          17
			return InstantApps.isInstantApp(zzjp);
	//    3    9:aload_0         
	//    4   10:getfield        #13  <Field Context zzjp>
	//    5   13:invokestatic    #180 <Method boolean InstantApps.isInstantApp(Context)>
	//    6   16:ireturn         
		if(PlatformVersion.isAtLeastO())
	//*   7   17:invokestatic    #185 <Method boolean PlatformVersion.isAtLeastO()>
	//*   8   20:ifeq            53
		{
			String s = zzjp.getPackageManager().getNameForUid(Binder.getCallingUid());
	//    9   23:aload_0         
	//   10   24:getfield        #13  <Field Context zzjp>
	//   11   27:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//   12   30:invokestatic    #169 <Method int Binder.getCallingUid()>
	//   13   33:invokevirtual   #189 <Method String PackageManager.getNameForUid(int)>
	//   14   36:astore_1        
			if(s != null)
	//*  15   37:aload_1         
	//*  16   38:ifnull          53
				return zzjp.getPackageManager().isInstantApp(s);
	//   17   41:aload_0         
	//   18   42:getfield        #13  <Field Context zzjp>
	//   19   45:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//   20   48:aload_1         
	//   21   49:invokevirtual   #192 <Method boolean PackageManager.isInstantApp(String)>
	//   22   52:ireturn         
		}
		return false;
	//   23   53:iconst_0        
	//   24   54:ireturn         
	}

	public boolean isInstantAppUid(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean uidHasPackageName(int i, String s)
	{
		if(PlatformVersion.isAtLeastKitKat())
	//*   0    0:invokestatic    #200 <Method boolean PlatformVersion.isAtLeastKitKat()>
	//*   1    3:ifeq            25
		{
			String as[];
			try
			{
				((AppOpsManager)zzjp.getSystemService("appops")).checkPackage(i, s);
	//    2    6:aload_0         
	//    3    7:getfield        #13  <Field Context zzjp>
	//    4   10:ldc1            #202 <String "appops">
	//    5   12:invokevirtual   #206 <Method Object Context.getSystemService(String)>
	//    6   15:checkcast       #208 <Class AppOpsManager>
	//    7   18:iload_1         
	//    8   19:aload_2         
	//    9   20:invokevirtual   #210 <Method void AppOpsManager.checkPackage(int, String)>
			}
	//*  10   23:iconst_1        
	//*  11   24:ireturn         
	//*  12   25:aload_0         
	//*  13   26:getfield        #13  <Field Context zzjp>
	//*  14   29:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//*  15   32:iload_1         
	//*  16   33:invokevirtual   #164 <Method String[] PackageManager.getPackagesForUid(int)>
	//*  17   36:astore_3        
	//*  18   37:aload_2         
	//*  19   38:ifnull          72
	//*  20   41:aload_3         
	//*  21   42:ifnull          72
	//*  22   45:iconst_0        
	//*  23   46:istore_1        
	//*  24   47:iload_1         
	//*  25   48:aload_3         
	//*  26   49:arraylength     
	//*  27   50:icmpge          72
	//*  28   53:aload_2         
	//*  29   54:aload_3         
	//*  30   55:iload_1         
	//*  31   56:aaload          
	//*  32   57:invokevirtual   #214 <Method boolean String.equals(Object)>
	//*  33   60:ifeq            65
	//*  34   63:iconst_1        
	//*  35   64:ireturn         
	//*  36   65:iload_1         
	//*  37   66:iconst_1        
	//*  38   67:iadd            
	//*  39   68:istore_1        
	//*  40   69:goto            47
	//*  41   72:iconst_0        
	//*  42   73:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  43   74:astore_2        
			{
				return false;
	//   44   75:iconst_0        
	//   45   76:ireturn         
			}
			return true;
		}
		as = zzjp.getPackageManager().getPackagesForUid(i);
		if(s != null && as != null)
			for(i = 0; i < as.length; i++)
				if(s.equals(((Object) (as[i]))))
					return true;

		return false;
	}

	private final Context zzjp;
}
