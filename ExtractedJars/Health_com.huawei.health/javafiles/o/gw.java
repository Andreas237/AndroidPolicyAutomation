// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package o:
//			go

public final class gw
{

	public gw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static String a(String s, String s1)
	{
		try
		{
			s = new String(a(s, go.c(s1)));
	//    0    0:new             #22  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #28  <Method byte[] go.c(String)>
	//    5    9:invokestatic    #31  <Method byte[] a(String, byte[])>
	//    6   12:invokespecial   #34  <Method void String(byte[])>
	//    7   15:astore_0        
		}
	//*   8   16:aload_0         
	//*   9   17:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   18:astore_0        
		{
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
		}
		return s;
	}

	public static byte[] a(String s, byte abyte0[])
	{
		try
		{
			s = ((String) (new SecretKeySpec(s.getBytes(), "DESede")));
	//    0    0:new             #36  <Class SecretKeySpec>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #40  <Method byte[] String.getBytes()>
	//    4    8:ldc1            #42  <String "DESede">
	//    5   10:invokespecial   #45  <Method void SecretKeySpec(byte[], String)>
	//    6   13:astore_0        
			IvParameterSpec ivparameterspec = new IvParameterSpec(new byte[8]);
	//    7   14:new             #47  <Class IvParameterSpec>
	//    8   17:dup             
	//    9   18:bipush          8
	//   10   20:newarray        byte[]
	//   11   22:invokespecial   #48  <Method void IvParameterSpec(byte[])>
	//   12   25:astore_2        
			Cipher cipher = Cipher.getInstance(b);
	//   13   26:getstatic       #12  <Field String b>
	//   14   29:invokestatic    #54  <Method Cipher Cipher.getInstance(String)>
	//   15   32:astore_3        
			cipher.init(2, ((java.security.Key) (s)), ((java.security.spec.AlgorithmParameterSpec) (ivparameterspec)));
	//   16   33:aload_3         
	//   17   34:iconst_2        
	//   18   35:aload_0         
	//   19   36:aload_2         
	//   20   37:invokevirtual   #58  <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
			s = ((String) (cipher.doFinal(abyte0)));
	//   21   40:aload_3         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #62  <Method byte[] Cipher.doFinal(byte[])>
	//   24   45:astore_0        
		}
	//*  25   46:aload_0         
	//*  26   47:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  27   48:astore_0        
		{
			return null;
	//   28   49:aconst_null     
	//   29   50:areturn         
		}
		return ((byte []) (s));
	}

	public static String b(String s, String s1)
	{
		try
		{
			s = go.b(c(s, s1.getBytes()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method byte[] String.getBytes()>
	//    3    5:invokestatic    #64  <Method byte[] c(String, byte[])>
	//    4    8:invokestatic    #67  <Method String go.b(byte[])>
	//    5   11:astore_0        
		}
	//*   6   12:aload_0         
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   8   14:astore_0        
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		}
		return s;
	}

	public static byte[] c(String s, byte abyte0[])
	{
		try
		{
			s = ((String) (new SecretKeySpec(s.getBytes(), "DESede")));
	//    0    0:new             #36  <Class SecretKeySpec>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #40  <Method byte[] String.getBytes()>
	//    4    8:ldc1            #42  <String "DESede">
	//    5   10:invokespecial   #45  <Method void SecretKeySpec(byte[], String)>
	//    6   13:astore_0        
			IvParameterSpec ivparameterspec = new IvParameterSpec(new byte[8]);
	//    7   14:new             #47  <Class IvParameterSpec>
	//    8   17:dup             
	//    9   18:bipush          8
	//   10   20:newarray        byte[]
	//   11   22:invokespecial   #48  <Method void IvParameterSpec(byte[])>
	//   12   25:astore_2        
			Cipher cipher = Cipher.getInstance(b);
	//   13   26:getstatic       #12  <Field String b>
	//   14   29:invokestatic    #54  <Method Cipher Cipher.getInstance(String)>
	//   15   32:astore_3        
			cipher.init(1, ((java.security.Key) (s)), ((java.security.spec.AlgorithmParameterSpec) (ivparameterspec)));
	//   16   33:aload_3         
	//   17   34:iconst_1        
	//   18   35:aload_0         
	//   19   36:aload_2         
	//   20   37:invokevirtual   #58  <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
			s = ((String) (cipher.doFinal(abyte0)));
	//   21   40:aload_3         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #62  <Method byte[] Cipher.doFinal(byte[])>
	//   24   45:astore_0        
		}
	//*  25   46:aload_0         
	//*  26   47:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  27   48:astore_0        
		{
			return null;
	//   28   49:aconst_null     
	//   29   50:areturn         
		}
		return ((byte []) (s));
	}

	private static String b = "DESede/CBC/PKCS5Padding";

	static 
	{
	//    0    0:ldc1            #10  <String "DESede/CBC/PKCS5Padding">
	//    1    2:putstatic       #12  <Field String b>
	//*   2    5:return          
	}
}
