// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class InternalUtils
{

	InternalUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	private static String convertToHex(byte abyte0[])
	{
		char ac[] = new char[abyte0.length * 2];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:iconst_2        
	//    3    3:imul            
	//    4    4:newarray        char[]
	//    5    6:astore_3        
		for(int i = 0; i < abyte0.length; i++)
	//*   6    7:iconst_0        
	//*   7    8:istore_1        
	//*   8    9:iload_1         
	//*   9   10:aload_0         
	//*  10   11:arraylength     
	//*  11   12:icmpge          57
		{
			int j = abyte0[i] & 0xff;
	//   12   15:aload_0         
	//   13   16:iload_1         
	//   14   17:baload          
	//   15   18:sipush          255
	//   16   21:iand            
	//   17   22:istore_2        
			ac[i * 2] = HEX_CHARS[j >>> 4];
	//   18   23:aload_3         
	//   19   24:iload_1         
	//   20   25:iconst_2        
	//   21   26:imul            
	//   22   27:getstatic       #18  <Field char[] HEX_CHARS>
	//   23   30:iload_2         
	//   24   31:iconst_4        
	//   25   32:iushr           
	//   26   33:caload          
	//   27   34:castore         
			ac[i * 2 + 1] = HEX_CHARS[j & 0xf];
	//   28   35:aload_3         
	//   29   36:iload_1         
	//   30   37:iconst_2        
	//   31   38:imul            
	//   32   39:iconst_1        
	//   33   40:iadd            
	//   34   41:getstatic       #18  <Field char[] HEX_CHARS>
	//   35   44:iload_2         
	//   36   45:bipush          15
	//   37   47:iand            
	//   38   48:caload          
	//   39   49:castore         
		}

	//   40   50:iload_1         
	//   41   51:iconst_1        
	//   42   52:iadd            
	//   43   53:istore_1        
	//*  44   54:goto            9
		return new String(ac);
	//   45   57:new             #12  <Class String>
	//   46   60:dup             
	//   47   61:aload_3         
	//   48   62:invokespecial   #27  <Method void String(char[])>
	//   49   65:areturn         
	}

	public static String sha1Hash(String s)
	{
		try
		{
			MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
	//    0    0:ldc1            #35  <String "SHA-1">
	//    1    2:invokestatic    #41  <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:astore_1        
			s = ((String) (s.getBytes("UTF-8")));
	//    3    6:aload_0         
	//    4    7:ldc1            #43  <String "UTF-8">
	//    5    9:invokevirtual   #47  <Method byte[] String.getBytes(String)>
	//    6   12:astore_0        
			messagedigest.update(((byte []) (s)), 0, s.length);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:aload_0         
	//   11   17:arraylength     
	//   12   18:invokevirtual   #51  <Method void MessageDigest.update(byte[], int, int)>
			s = convertToHex(messagedigest.digest());
	//   13   21:aload_1         
	//   14   22:invokevirtual   #55  <Method byte[] MessageDigest.digest()>
	//   15   25:invokestatic    #57  <Method String convertToHex(byte[])>
	//   16   28:astore_0        
		}
	//*  17   29:aload_0         
	//*  18   30:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  19   31:astore_0        
		{
			((NoSuchAlgorithmException) (s)).printStackTrace();
	//   20   32:aload_0         
	//   21   33:invokevirtual   #60  <Method void NoSuchAlgorithmException.printStackTrace()>
			return null;
	//   22   36:aconst_null     
	//   23   37:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  24   38:astore_0        
		{
			((UnsupportedEncodingException) (s)).printStackTrace();
	//   25   39:aload_0         
	//   26   40:invokevirtual   #61  <Method void UnsupportedEncodingException.printStackTrace()>
			return null;
	//   27   43:aconst_null     
	//   28   44:areturn         
		}
		return s;
	}

	private static final char HEX_CHARS[] = "0123456789ABCDEF".toCharArray();

	static 
	{
	//    0    0:ldc1            #10  <String "0123456789ABCDEF">
	//    1    2:invokevirtual   #16  <Method char[] String.toCharArray()>
	//    2    5:putstatic       #18  <Field char[] HEX_CHARS>
	//*   3    8:return          
	}
}
