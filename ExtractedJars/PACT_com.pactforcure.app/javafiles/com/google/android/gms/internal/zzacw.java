// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.*;
import com.google.android.gms.common.util.zzs;

public class zzacw
{

	public zzacw(Context context)
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

	public CharSequence zzdE(String s)
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
label0:
		{
			{
				boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
				if(!zzs.zzyF())
					break label0;
	//    2    3:invokestatic    #64  <Method boolean zzs.zzyF()>
	//    3    6:ifeq            30
				boolean flag;
				String as[];
				try
				{
					((AppOpsManager)mContext.getSystemService("appops")).checkPackage(i, s);
	//    4    9:aload_0         
	//    5   10:getfield        #13  <Field Context mContext>
	//    6   13:ldc1            #66  <String "appops">
	//    7   15:invokevirtual   #70  <Method Object Context.getSystemService(String)>
	//    8   18:checkcast       #72  <Class AppOpsManager>
	//    9   21:iload_1         
	//   10   22:aload_2         
	//   11   23:invokevirtual   #76  <Method void AppOpsManager.checkPackage(int, String)>
				}
	//*  12   26:iconst_1        
	//*  13   27:istore_3        
	//*  14   28:iload_3         
	//*  15   29:ireturn         
	//*  16   30:aload_0         
	//*  17   31:getfield        #13  <Field Context mContext>
	//*  18   34:invokevirtual   #26  <Method PackageManager Context.getPackageManager()>
	//*  19   37:iload_1         
	//*  20   38:invokevirtual   #45  <Method String[] PackageManager.getPackagesForUid(int)>
	//*  21   41:astore          5
	//*  22   43:iload           4
	//*  23   45:istore_3        
	//*  24   46:aload_2         
	//*  25   47:ifnull          28
	//*  26   50:iload           4
	//*  27   52:istore_3        
	//*  28   53:aload           5
	//*  29   55:ifnull          28
	//*  30   58:iconst_0        
	//*  31   59:istore_1        
	//*  32   60:iload           4
	//*  33   62:istore_3        
	//*  34   63:iload_1         
	//*  35   64:aload           5
	//*  36   66:arraylength     
	//*  37   67:icmpge          28
	//*  38   70:aload_2         
	//*  39   71:aload           5
	//*  40   73:iload_1         
	//*  41   74:aaload          
	//*  42   75:invokevirtual   #82  <Method boolean String.equals(Object)>
	//*  43   78:ifeq            83
	//*  44   81:iconst_1        
	//*  45   82:ireturn         
	//*  46   83:iload_1         
	//*  47   84:iconst_1        
	//*  48   85:iadd            
	//*  49   86:istore_1        
	//*  50   87:goto            60
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  51   90:astore_2        
				{
					return false;
	//   52   91:iconst_0        
	//   53   92:ireturn         
				}
				flag = true;
			}
			return flag;
		}
		as = mContext.getPackageManager().getPackagesForUid(i);
		flag = flag1;
		if(s == null)
			continue;
		flag = flag1;
		if(as == null)
			continue;
		i = 0;
		do
		{
			flag = flag1;
			if(i >= as.length)
				continue;
			if(s.equals(((Object) (as[i]))))
				return true;
			i++;
		} while(true);
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_28;
_L1:
	}

	protected final Context mContext;
}
