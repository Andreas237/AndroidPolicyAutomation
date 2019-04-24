// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.google.android.gms.common.util:
//			PlatformVersion

public class AndroidUtilsLight
{

	public AndroidUtilsLight()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static Context getDeviceProtectedStorageContext(Context context)
	{
		Context context1 = context;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(PlatformVersion.isAtLeastN())
	//*   2    2:invokestatic    #25  <Method boolean PlatformVersion.isAtLeastN()>
	//*   3    5:ifeq            22
		{
			context1 = context;
	//    4    8:aload_0         
	//    5    9:astore_1        
			if(!context.isDeviceProtectedStorage())
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #30  <Method boolean Context.isDeviceProtectedStorage()>
	//*   8   14:ifne            22
				context1 = context.createDeviceProtectedStorageContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #34  <Method Context Context.createDeviceProtectedStorageContext()>
	//   11   21:astore_1        
		}
		return context1;
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public static byte[] getPackageCertificateHashBytes(Context context, String s)
	{
		context = ((Context) (Wrappers.packageManager(context).getPackageInfo(s, 64)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #43  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    2    4:aload_1         
	//    3    5:bipush          64
	//    4    7:invokevirtual   #49  <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//    5   10:astore_0        
		if(((PackageInfo) (context)).signatures != null && ((PackageInfo) (context)).signatures.length == 1)
	//*   6   11:aload_0         
	//*   7   12:getfield        #55  <Field Signature[] PackageInfo.signatures>
	//*   8   15:ifnull          51
	//*   9   18:aload_0         
	//*  10   19:getfield        #55  <Field Signature[] PackageInfo.signatures>
	//*  11   22:arraylength     
	//*  12   23:iconst_1        
	//*  13   24:icmpne          51
		{
			s = ((String) (zzi("SHA1")));
	//   14   27:ldc1            #57  <String "SHA1">
	//   15   29:invokestatic    #61  <Method MessageDigest zzi(String)>
	//   16   32:astore_1        
			if(s != null)
	//*  17   33:aload_1         
	//*  18   34:ifnull          51
				return ((MessageDigest) (s)).digest(((PackageInfo) (context)).signatures[0].toByteArray());
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #55  <Field Signature[] PackageInfo.signatures>
	//   22   42:iconst_0        
	//   23   43:aaload          
	//   24   44:invokevirtual   #67  <Method byte[] Signature.toByteArray()>
	//   25   47:invokevirtual   #73  <Method byte[] MessageDigest.digest(byte[])>
	//   26   50:areturn         
		}
		return null;
	//   27   51:aconst_null     
	//   28   52:areturn         
	}

	public static MessageDigest zzi(String s)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
_L2:
		if(i >= 2)
			break; /* Loop/switch isn't completed */
	//    2    2:iload_1         
	//    3    3:iconst_2        
	//    4    4:icmpge          25
		MessageDigest messagedigest = MessageDigest.getInstance(s);
	//    5    7:aload_0         
	//    6    8:invokestatic    #78  <Method MessageDigest MessageDigest.getInstance(String)>
	//    7   11:astore_2        
		if(messagedigest != null)
	//*   8   12:aload_2         
	//*   9   13:ifnull          18
			return messagedigest;
	//   10   16:aload_2         
	//   11   17:areturn         
_L3:
		i++;
	//   12   18:iload_1         
	//   13   19:iconst_1        
	//   14   20:iadd            
	//   15   21:istore_1        
		if(true) goto _L2; else goto _L1
	//   16   22:goto            2
_L1:
		return null;
	//   17   25:aconst_null     
	//   18   26:areturn         
		NoSuchAlgorithmException nosuchalgorithmexception;
		nosuchalgorithmexception;
	//   19   27:astore_2        
		  goto _L3
	//*  20   28:goto            18
	}

	private static volatile int zzgd = -1;

	static 
	{
	//    0    0:return          
	}
}
