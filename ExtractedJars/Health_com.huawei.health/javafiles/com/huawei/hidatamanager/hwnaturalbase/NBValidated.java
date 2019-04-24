// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hidatamanager.hwnaturalbase;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.hidatamanager.util.LogUtils;

public class NBValidated
{

	public NBValidated()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private static boolean checkApkExist(Context context, String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))) || context == null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #26  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            11
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		try
		{
			context = ((Context) (context.getPackageManager().getApplicationInfo(s, 0)));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #32  <Method PackageManager Context.getPackageManager()>
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #38  <Method android.content.pm.ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   12   22:astore_0        
		}
	//*  13   23:aload_0         
	//*  14   24:ifnull          29
	//*  15   27:iconst_1        
	//*  16   28:ireturn         
	//*  17   29:iconst_0        
	//*  18   30:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  19   31:astore_0        
		{
			LogUtils.w("NBValidated", (new StringBuilder()).append("depended package:").append(s).append(" does n't exist!").toString());
	//   20   32:ldc1            #11  <String "NBValidated">
	//   21   34:new             #40  <Class StringBuilder>
	//   22   37:dup             
	//   23   38:invokespecial   #41  <Method void StringBuilder()>
	//   24   41:ldc1            #43  <String "depended package:">
	//   25   43:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   26   46:aload_1         
	//   27   47:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   28   50:ldc1            #49  <String " does n't exist!">
	//   29   52:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   31   58:invokestatic    #59  <Method void LogUtils.w(String, String)>
			return false;
	//   32   61:iconst_0        
	//   33   62:ireturn         
		}
		return context != null;
	}

	public static boolean isOdmfInstalled(Context context)
	{
		com/huawei/hidatamanager/hwnaturalbase/NBValidated;
	//    0    0:ldc1            #2   <Class NBValidated>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag = checkApkExist(context, "com.huawei.nb.service");
	//    2    3:aload_0         
	//    3    4:ldc1            #8   <String "com.huawei.nb.service">
	//    4    6:invokestatic    #63  <Method boolean checkApkExist(Context, String)>
	//    5    9:istore_1        
		com/huawei/hidatamanager/hwnaturalbase/NBValidated;
	//    6   10:ldc1            #2   <Class NBValidated>
		JVM INSTR monitorexit ;
	//    7   12:monitorexit     
		return flag;
	//    8   13:iload_1         
	//    9   14:ireturn         
		context;
	//   10   15:astore_0        
	//*  11   16:ldc1            #2   <Class NBValidated>
		throw context;
	//   12   18:monitorexit     
	//   13   19:aload_0         
	//   14   20:athrow          
	}

	private static final String ODMF_PACKAGE_NAME = "com.huawei.nb.service";
	private static final String TAG = "NBValidated";
}
