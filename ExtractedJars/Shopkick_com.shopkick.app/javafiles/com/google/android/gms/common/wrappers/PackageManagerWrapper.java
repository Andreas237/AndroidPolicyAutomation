// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.*;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.common.wrappers:
//			InstantApps

public class PackageManagerWrapper
{

	public PackageManagerWrapper(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zzhw = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field Context zzhw>
	//    5    9:return          
	}

	public int checkCallingOrSelfPermission(String s)
	{
		return zzhw.checkCallingOrSelfPermission(s);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context zzhw>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #21  <Method int Context.checkCallingOrSelfPermission(String)>
	//    4    8:ireturn         
	}

	public int checkPermission(String s, String s1)
	{
		return zzhw.getPackageManager().checkPermission(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context zzhw>
	//    2    4:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #32  <Method int PackageManager.checkPermission(String, String)>
	//    6   12:ireturn         
	}

	public ApplicationInfo getApplicationInfo(String s, int i)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return zzhw.getPackageManager().getApplicationInfo(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context zzhw>
	//    2    4:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:invokevirtual   #38  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    6   12:areturn         
	}

	public CharSequence getApplicationLabel(String s)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return zzhw.getPackageManager().getApplicationLabel(zzhw.getPackageManager().getApplicationInfo(s, 0));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context zzhw>
	//    2    4:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field Context zzhw>
	//    5   11:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #38  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   19:invokevirtual   #44  <Method CharSequence PackageManager.getApplicationLabel(ApplicationInfo)>
	//   10   22:areturn         
	}

	public PackageInfo getPackageInfo(String s, int i)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return zzhw.getPackageManager().getPackageInfo(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context zzhw>
	//    2    4:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:invokevirtual   #48  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:areturn         
	}

	public final String[] getPackagesForUid(int i)
	{
		return zzhw.getPackageManager().getPackagesForUid(i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context zzhw>
	//    2    4:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #52  <Method String[] PackageManager.getPackagesForUid(int)>
	//    5   11:areturn         
	}

	public boolean isCallerInstantApp()
	{
		if(Binder.getCallingUid() == Process.myUid())
	//*   0    0:invokestatic    #60  <Method int Binder.getCallingUid()>
	//*   1    3:invokestatic    #65  <Method int Process.myUid()>
	//*   2    6:icmpne          17
			return InstantApps.isInstantApp(zzhw);
	//    3    9:aload_0         
	//    4   10:getfield        #14  <Field Context zzhw>
	//    5   13:invokestatic    #71  <Method boolean InstantApps.isInstantApp(Context)>
	//    6   16:ireturn         
		if(PlatformVersion.isAtLeastO())
	//*   7   17:invokestatic    #76  <Method boolean PlatformVersion.isAtLeastO()>
	//*   8   20:ifeq            53
		{
			String s = zzhw.getPackageManager().getNameForUid(Binder.getCallingUid());
	//    9   23:aload_0         
	//   10   24:getfield        #14  <Field Context zzhw>
	//   11   27:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//   12   30:invokestatic    #60  <Method int Binder.getCallingUid()>
	//   13   33:invokevirtual   #80  <Method String PackageManager.getNameForUid(int)>
	//   14   36:astore_1        
			if(s != null)
	//*  15   37:aload_1         
	//*  16   38:ifnull          53
				return zzhw.getPackageManager().isInstantApp(s);
	//   17   41:aload_0         
	//   18   42:getfield        #14  <Field Context zzhw>
	//   19   45:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//   20   48:aload_1         
	//   21   49:invokevirtual   #83  <Method boolean PackageManager.isInstantApp(String)>
	//   22   52:ireturn         
		}
		return false;
	//   23   53:iconst_0        
	//   24   54:ireturn         
	}

	public final PackageInfo zza(String s, int i, int j)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return zzhw.getPackageManager().getPackageInfo(s, 64);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context zzhw>
	//    2    4:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_1         
	//    4    8:bipush          64
	//    5   10:invokevirtual   #48  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   13:areturn         
	}

	public final boolean zzb(int i, String s)
	{
		if(PlatformVersion.isAtLeastKitKat())
	//*   0    0:invokestatic    #95  <Method boolean PlatformVersion.isAtLeastKitKat()>
	//*   1    3:ifeq            25
		{
			String as[];
			try
			{
				((AppOpsManager)zzhw.getSystemService("appops")).checkPackage(i, s);
	//    2    6:aload_0         
	//    3    7:getfield        #14  <Field Context zzhw>
	//    4   10:ldc1            #97  <String "appops">
	//    5   12:invokevirtual   #101 <Method Object Context.getSystemService(String)>
	//    6   15:checkcast       #103 <Class AppOpsManager>
	//    7   18:iload_1         
	//    8   19:aload_2         
	//    9   20:invokevirtual   #107 <Method void AppOpsManager.checkPackage(int, String)>
			}
	//*  10   23:iconst_1        
	//*  11   24:ireturn         
	//*  12   25:aload_0         
	//*  13   26:getfield        #14  <Field Context zzhw>
	//*  14   29:invokevirtual   #28  <Method PackageManager Context.getPackageManager()>
	//*  15   32:iload_1         
	//*  16   33:invokevirtual   #52  <Method String[] PackageManager.getPackagesForUid(int)>
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
	//*  32   57:invokevirtual   #113 <Method boolean String.equals(Object)>
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
		as = zzhw.getPackageManager().getPackagesForUid(i);
		if(s != null && as != null)
			for(i = 0; i < as.length; i++)
				if(s.equals(((Object) (as[i]))))
					return true;

		return false;
	}

	private final Context zzhw;
}
