// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.util;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.pactforcure.app.core.BackboneApplication;

public class VersionUtils
{

	public VersionUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static String getVersionName()
	{
		Object obj = ((Object) (BackboneApplication.get()));
	//    0    0:invokestatic    #23  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:astore_1        
		int i;
		PackageInfo packageinfo;
		String as[];
		try
		{
			packageinfo = ((Application) (obj)).getPackageManager().getPackageInfo(((Application) (obj)).getPackageName(), 0);
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method PackageManager Application.getPackageManager()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #32  <Method String Application.getPackageName()>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #38  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   16:astore_2        
			as = packageinfo.versionName.split("\\.");
	//    9   17:aload_2         
	//   10   18:getfield        #43  <Field String PackageInfo.versionName>
	//   11   21:ldc1            #45  <String "\\.">
	//   12   23:invokevirtual   #51  <Method String[] String.split(String)>
	//   13   26:astore_3        
		}
	//*  14   27:ldc1            #53  <String "">
	//*  15   29:astore_1        
	//*  16   30:iconst_0        
	//*  17   31:istore_0        
	//*  18   32:iload_0         
	//*  19   33:iconst_3        
	//*  20   34:icmpge          70
	//*  21   37:new             #55  <Class StringBuilder>
	//*  22   40:dup             
	//*  23   41:invokespecial   #56  <Method void StringBuilder()>
	//*  24   44:aload_1         
	//*  25   45:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//*  26   48:aload_3         
	//*  27   49:iload_0         
	//*  28   50:aaload          
	//*  29   51:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//*  30   54:ldc1            #62  <String ".">
	//*  31   56:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//*  32   59:invokevirtual   #65  <Method String StringBuilder.toString()>
	//*  33   62:astore_1        
	//*  34   63:iload_0         
	//*  35   64:iconst_1        
	//*  36   65:iadd            
	//*  37   66:istore_0        
	//*  38   67:goto            32
	//*  39   70:new             #55  <Class StringBuilder>
	//*  40   73:dup             
	//*  41   74:invokespecial   #56  <Method void StringBuilder()>
	//*  42   77:aload_1         
	//*  43   78:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//*  44   81:aload_2         
	//*  45   82:getfield        #69  <Field int PackageInfo.versionCode>
	//*  46   85:invokestatic    #73  <Method String String.valueOf(int)>
	//*  47   88:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//*  48   91:invokevirtual   #65  <Method String StringBuilder.toString()>
	//*  49   94:astore_1        
	//*  50   95:aload_1         
	//*  51   96:areturn         
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  52   97:astore_1        
		{
			Log.d("VersionUtils", Log.getStackTraceString(((Throwable) (namenotfoundexception))));
	//   53   98:ldc1            #8   <String "VersionUtils">
	//   54  100:aload_1         
	//   55  101:invokestatic    #79  <Method String Log.getStackTraceString(Throwable)>
	//   56  104:invokestatic    #83  <Method int Log.d(String, String)>
	//   57  107:pop             
			return "#.#.#.#";
	//   58  108:ldc1            #85  <String "#.#.#.#">
	//   59  110:areturn         
		}
		obj = "";
		i = 0;
		if(i >= 3)
			break; /* Loop/switch isn't completed */
		obj = ((Object) ((new StringBuilder()).append(((String) (obj))).append(as[i]).append(".").toString()));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_32;
_L1:
		obj = ((Object) ((new StringBuilder()).append(((String) (obj))).append(String.valueOf(packageinfo.versionCode)).toString()));
		return ((String) (obj));
	}

	private static final String TAG = "VersionUtils";
}
