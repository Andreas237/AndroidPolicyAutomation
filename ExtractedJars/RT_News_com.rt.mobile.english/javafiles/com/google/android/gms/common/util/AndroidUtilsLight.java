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

public class AndroidUtilsLight
{

	public AndroidUtilsLight()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static MessageDigest getMessageDigest(String s)
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
	//    6    8:invokestatic    #25  <Method MessageDigest MessageDigest.getInstance(String)>
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

	public static byte[] getPackageCertificateHashBytes(Context context, String s)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		return getPackageCertificateHashBytes(context, s, "SHA1");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #8   <String "SHA1">
	//    3    4:invokestatic    #32  <Method byte[] getPackageCertificateHashBytes(Context, String, String)>
	//    4    7:areturn         
	}

	public static byte[] getPackageCertificateHashBytes(Context context, String s, String s1)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		context = ((Context) (Wrappers.packageManager(context).getPackageInfo(s, 64)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    2    4:aload_1         
	//    3    5:bipush          64
	//    4    7:invokevirtual   #45  <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//    5   10:astore_0        
		if(((PackageInfo) (context)).signatures != null && ((PackageInfo) (context)).signatures.length == 1)
	//*   6   11:aload_0         
	//*   7   12:getfield        #51  <Field Signature[] PackageInfo.signatures>
	//*   8   15:ifnull          50
	//*   9   18:aload_0         
	//*  10   19:getfield        #51  <Field Signature[] PackageInfo.signatures>
	//*  11   22:arraylength     
	//*  12   23:iconst_1        
	//*  13   24:icmpne          50
		{
			s = ((String) (getMessageDigest(s1)));
	//   14   27:aload_2         
	//   15   28:invokestatic    #53  <Method MessageDigest getMessageDigest(String)>
	//   16   31:astore_1        
			if(s != null)
	//*  17   32:aload_1         
	//*  18   33:ifnull          50
				return ((MessageDigest) (s)).digest(((PackageInfo) (context)).signatures[0].toByteArray());
	//   19   36:aload_1         
	//   20   37:aload_0         
	//   21   38:getfield        #51  <Field Signature[] PackageInfo.signatures>
	//   22   41:iconst_0        
	//   23   42:aaload          
	//   24   43:invokevirtual   #59  <Method byte[] Signature.toByteArray()>
	//   25   46:invokevirtual   #63  <Method byte[] MessageDigest.digest(byte[])>
	//   26   49:areturn         
		}
		return null;
	//   27   50:aconst_null     
	//   28   51:areturn         
	}

	public static final String DIGEST_ALGORITHM_SHA1 = "SHA1";
	public static final String DIGEST_ALGORITHM_SHA512 = "SHA-512";
}
