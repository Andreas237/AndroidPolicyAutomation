// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

public final class apy
{

	public static void a(int i)
	{
		if(i != 16)
	//*   0    0:iload_0         
	//*   1    1:bipush          16
	//*   2    3:icmpeq          23
		{
			if(i == 32)
	//*   3    6:iload_0         
	//*   4    7:bipush          32
	//*   5    9:icmpne          13
				return;
	//    6   12:return          
			else
				throw new InvalidAlgorithmParameterException("invalid key size; only 128-bit and 256-bit AES keys are supported");
	//    7   13:new             #35  <Class InvalidAlgorithmParameterException>
	//    8   16:dup             
	//    9   17:ldc1            #37  <String "invalid key size; only 128-bit and 256-bit AES keys are supported">
	//   10   19:invokespecial   #41  <Method void InvalidAlgorithmParameterException(String)>
	//   11   22:athrow          
		} else
		{
			return;
	//   12   23:return          
		}
	}

	public static void a(int i, int j)
	{
		if(i >= 0 && i <= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
	//*   2    4:iload_0         
	//*   3    5:ifgt            9
			return;
	//    4    8:return          
		else
			throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[] {
				Integer.valueOf(i), Integer.valueOf(0)
			}));
	//    5    9:new             #44  <Class GeneralSecurityException>
	//    6   12:dup             
	//    7   13:ldc1            #46  <String "key has version %d; only keys with version in range [0..%d] are supported">
	//    8   15:iconst_2        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:iload_0         
	//   13   22:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_1        
	//   17   28:iconst_0        
	//   18   29:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   19   32:aastore         
	//   20   33:invokestatic    #19  <Method String String.format(String, Object[])>
	//   21   36:invokespecial   #53  <Method void GeneralSecurityException(String)>
	//   22   39:athrow          
	}

	private static final Pattern a = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[] {
		"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"
	}), 2);
	private static final Pattern b = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[] {
		"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"
	}), 2);

	static 
	{
	//    0    0:ldc1            #11  <String "^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$">
	//    1    2:iconst_4        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #13  <String "([0-9a-zA-Z\\-\\.\\_~])+">
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:ldc1            #13  <String "([0-9a-zA-Z\\-\\.\\_~])+">
	//   10   15:aastore         
	//   11   16:dup             
	//   12   17:iconst_2        
	//   13   18:ldc1            #13  <String "([0-9a-zA-Z\\-\\.\\_~])+">
	//   14   20:aastore         
	//   15   21:dup             
	//   16   22:iconst_3        
	//   17   23:ldc1            #13  <String "([0-9a-zA-Z\\-\\.\\_~])+">
	//   18   25:aastore         
	//   19   26:invokestatic    #19  <Method String String.format(String, Object[])>
	//   20   29:iconst_2        
	//   21   30:invokestatic    #25  <Method Pattern Pattern.compile(String, int)>
	//   22   33:putstatic       #27  <Field Pattern a>
	//   23   36:ldc1            #29  <String "^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$">
	//   24   38:iconst_5        
	//   25   39:anewarray       Object[]
	//   26   42:dup             
	//   27   43:iconst_0        
	//   28   44:ldc1            #13  <String "([0-9a-zA-Z\\-\\.\\_~])+">
	//   29   46:aastore         
	//   30   47:dup             
	//   31   48:iconst_1        
	//   32   49:ldc1            #13  <String "([0-9a-zA-Z\\-\\.\\_~])+">
	//   33   51:aastore         
	//   34   52:dup             
	//   35   53:iconst_2        
	//   36   54:ldc1            #13  <String "([0-9a-zA-Z\\-\\.\\_~])+">
	//   37   56:aastore         
	//   38   57:dup             
	//   39   58:iconst_3        
	//   40   59:ldc1            #13  <String "([0-9a-zA-Z\\-\\.\\_~])+">
	//   41   61:aastore         
	//   42   62:dup             
	//   43   63:iconst_4        
	//   44   64:ldc1            #13  <String "([0-9a-zA-Z\\-\\.\\_~])+">
	//   45   66:aastore         
	//   46   67:invokestatic    #19  <Method String String.format(String, Object[])>
	//   47   70:iconst_2        
	//   48   71:invokestatic    #25  <Method Pattern Pattern.compile(String, int)>
	//   49   74:putstatic       #31  <Field Pattern b>
	//*  50   77:return          
	}
}
