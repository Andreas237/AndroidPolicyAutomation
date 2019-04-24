// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.*;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.zzt;

// Referenced classes of package com.google.android.gms.internal:
//			zzade

public class zzadf
{

	public zzadf(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Context mContext>
	//    5    9:return          
	}

	public int checkCallingOrSelfPermission(String s)
	{
		return mContext.checkCallingOrSelfPermission(s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context mContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #20  <Method int Context.checkCallingOrSelfPermission(String)>
	//    4    8:ireturn         
	}

	public int checkPermission(String s, String s1)
	{
		return mContext.getPackageManager().checkPermission(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context mContext>
	//    2    4:invokevirtual   #26  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #30  <Method int PackageManager.checkPermission(String, String)>
	//    6   12:ireturn         
	}

	public ApplicationInfo getApplicationInfo(String s, int i)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return mContext.getPackageManager().getApplicationInfo(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context mContext>
	//    2    4:invokevirtual   #26  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:invokevirtual   #36  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    6   12:areturn         
	}

	public PackageInfo getPackageInfo(String s, int i)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return mContext.getPackageManager().getPackageInfo(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context mContext>
	//    2    4:invokevirtual   #26  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:invokevirtual   #41  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:areturn         
	}

	public String[] getPackagesForUid(int i)
	{
		return mContext.getPackageManager().getPackagesForUid(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context mContext>
	//    2    4:invokevirtual   #26  <Method PackageManager Context.getPackageManager()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #45  <Method String[] PackageManager.getPackagesForUid(int)>
	//    5   11:areturn         
	}

	public CharSequence zzdA(String s)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return mContext.getPackageManager().getApplicationLabel(mContext.getPackageManager().getApplicationInfo(s, 0));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context mContext>
	//    2    4:invokevirtual   #26  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field Context mContext>
	//    5   11:invokevirtual   #26  <Method PackageManager Context.getPackageManager()>
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #36  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   19:invokevirtual   #51  <Method CharSequence PackageManager.getApplicationLabel(ApplicationInfo)>
	//   10   22:areturn         
	}

	public boolean zzg(int i, String s)
	{
		if(zzt.zzzl())
	//*   0    0:invokestatic    #64  <Method boolean zzt.zzzl()>
	//*   1    3:ifeq            27
		{
			try
			{
				((AppOpsManager)mContext.getSystemService("appops")).checkPackage(i, s);
	//    2    6:aload_0         
	//    3    7:getfield        #13  <Field Context mContext>
	//    4   10:ldc1            #66  <String "appops">
	//    5   12:invokevirtual   #70  <Method Object Context.getSystemService(String)>
	//    6   15:checkcast       #72  <Class AppOpsManager>
	//    7   18:iload_1         
	//    8   19:aload_2         
	//    9   20:invokevirtual   #76  <Method void AppOpsManager.checkPackage(int, String)>
			}
	//*  10   23:iconst_1        
	//*  11   24:ireturn         
	//*  12   25:iconst_0        
	//*  13   26:ireturn         
	//*  14   27:aload_0         
	//*  15   28:getfield        #13  <Field Context mContext>
	//*  16   31:invokevirtual   #26  <Method PackageManager Context.getPackageManager()>
	//*  17   34:iload_1         
	//*  18   35:invokevirtual   #45  <Method String[] PackageManager.getPackagesForUid(int)>
	//*  19   38:astore_3        
	//*  20   39:aload_2         
	//*  21   40:ifnull          74
	//*  22   43:aload_3         
	//*  23   44:ifnull          74
	//*  24   47:iconst_0        
	//*  25   48:istore_1        
	//*  26   49:iload_1         
	//*  27   50:aload_3         
	//*  28   51:arraylength     
	//*  29   52:icmpge          74
	//*  30   55:aload_2         
	//*  31   56:aload_3         
	//*  32   57:iload_1         
	//*  33   58:aaload          
	//*  34   59:invokevirtual   #82  <Method boolean String.equals(Object)>
	//*  35   62:ifeq            67
	//*  36   65:iconst_1        
	//*  37   66:ireturn         
	//*  38   67:iload_1         
	//*  39   68:iconst_1        
	//*  40   69:iadd            
	//*  41   70:istore_1        
	//*  42   71:goto            49
	//*  43   74:iconst_0        
	//*  44   75:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				return false;
			}
			return true;
		}
		String as[] = mContext.getPackageManager().getPackagesForUid(i);
		if(s != null && as != null)
			for(i = 0; i < as.length; i++)
				if(s.equals(((Object) (as[i]))))
					return true;

		return false;
	//*  45   76:astore_2        
	//*  46   77:goto            25
	}

	public boolean zzzx()
	{
		if(Binder.getCallingUid() == Process.myUid())
	//*   0    0:invokestatic    #90  <Method int Binder.getCallingUid()>
	//*   1    3:invokestatic    #95  <Method int Process.myUid()>
	//*   2    6:icmpne          17
			return zzade.zzbg(mContext);
	//    3    9:aload_0         
	//    4   10:getfield        #13  <Field Context mContext>
	//    5   13:invokestatic    #101 <Method boolean zzade.zzbg(Context)>
	//    6   16:ireturn         
		else
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	protected final Context mContext;
}
