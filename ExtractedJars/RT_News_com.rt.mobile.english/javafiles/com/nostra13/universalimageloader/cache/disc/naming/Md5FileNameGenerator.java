// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.cache.disc.naming;

import com.nostra13.universalimageloader.utils.L;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.nostra13.universalimageloader.cache.disc.naming:
//			FileNameGenerator

public class Md5FileNameGenerator
	implements FileNameGenerator
{

	public Md5FileNameGenerator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	private byte[] getMD5(byte abyte0[])
	{
		try
		{
			MessageDigest messagedigest = MessageDigest.getInstance("MD5");
	//    0    0:ldc1            #10  <String "MD5">
	//    1    2:invokestatic    #28  <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:astore_2        
			messagedigest.update(abyte0);
	//    3    6:aload_2         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #32  <Method void MessageDigest.update(byte[])>
			abyte0 = messagedigest.digest();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #36  <Method byte[] MessageDigest.digest()>
	//    8   15:astore_1        
		}
	//*   9   16:aload_1         
	//*  10   17:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  11   18:astore_1        
		{
			L.e(((Throwable) (abyte0)));
	//   12   19:aload_1         
	//   13   20:invokestatic    #42  <Method void L.e(Throwable)>
			return null;
	//   14   23:aconst_null     
	//   15   24:areturn         
		}
		return abyte0;
	}

	public String generate(String s)
	{
		return (new BigInteger(getMD5(s.getBytes()))).abs().toString(36);
	//    0    0:new             #46  <Class BigInteger>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #51  <Method byte[] String.getBytes()>
	//    5    9:invokespecial   #53  <Method byte[] getMD5(byte[])>
	//    6   12:invokespecial   #55  <Method void BigInteger(byte[])>
	//    7   15:invokevirtual   #59  <Method BigInteger BigInteger.abs()>
	//    8   18:bipush          36
	//    9   20:invokevirtual   #63  <Method String BigInteger.toString(int)>
	//   10   23:areturn         
	}

	private static final String HASH_ALGORITHM = "MD5";
	private static final int RADIX = 36;
}
