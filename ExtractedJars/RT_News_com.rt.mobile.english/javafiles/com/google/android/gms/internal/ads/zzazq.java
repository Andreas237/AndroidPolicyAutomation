// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.regex.Pattern;

public final class zzazq
{

	public static void zzbi(int i)
		throws GeneralSecurityException
	{
		if(i != 16 && i != 24 && i != 32)
	//*   0    0:iload_0         
	//*   1    1:bipush          16
	//*   2    3:icmpeq          28
	//*   3    6:iload_0         
	//*   4    7:bipush          24
	//*   5    9:icmpeq          28
	//*   6   12:iload_0         
	//*   7   13:bipush          32
	//*   8   15:icmpeq          28
			throw new GeneralSecurityException("invalid AES key size");
	//    9   18:new             #36  <Class GeneralSecurityException>
	//   10   21:dup             
	//   11   22:ldc1            #38  <String "invalid AES key size">
	//   12   24:invokespecial   #42  <Method void GeneralSecurityException(String)>
	//   13   27:athrow          
		else
			return;
	//   14   28:return          
	}

	public static void zzj(int i, int j)
		throws GeneralSecurityException
	{
		if(i >= 0 && i <= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            12
	//*   2    4:iload_0         
	//*   3    5:ifle            11
	//*   4    8:goto            12
			return;
	//    5   11:return          
		else
			throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[] {
				Integer.valueOf(i), Integer.valueOf(0)
			}));
	//    6   12:new             #36  <Class GeneralSecurityException>
	//    7   15:dup             
	//    8   16:ldc1            #47  <String "key has version %d; only keys with version in range [0..%d] are supported">
	//    9   18:iconst_2        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:iload_0         
	//   14   25:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_1        
	//   18   31:iconst_0        
	//   19   32:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   20   35:aastore         
	//   21   36:invokestatic    #19  <Method String String.format(String, Object[])>
	//   22   39:invokespecial   #42  <Method void GeneralSecurityException(String)>
	//   23   42:athrow          
	}

	private static final Pattern zzdot = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[] {
		"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"
	}), 2);
	private static final Pattern zzdou = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[] {
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
	//   22   33:putstatic       #27  <Field Pattern zzdot>
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
	//   49   74:putstatic       #31  <Field Pattern zzdou>
	//*  50   77:return          
	}
}
