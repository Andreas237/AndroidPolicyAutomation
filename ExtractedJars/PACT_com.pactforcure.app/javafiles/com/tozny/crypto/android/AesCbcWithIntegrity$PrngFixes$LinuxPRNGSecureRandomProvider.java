// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.tozny.crypto.android;

import java.security.Provider;

// Referenced classes of package com.tozny.crypto.android:
//			AesCbcWithIntegrity

private static class AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandomProvider extends Provider
{

	public AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandomProvider()
	{
		super("LinuxPRNG", 1.0D, "A Linux-specific random number provider that uses /dev/urandom");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "LinuxPRNG">
	//    2    3:dconst_1        
	//    3    4:ldc1            #16  <String "A Linux-specific random number provider that uses /dev/urandom">
	//    4    6:invokespecial   #19  <Method void Provider(String, double, String)>
		put("SecureRandom.SHA1PRNG", ((Object) (((Class) (com/tozny/crypto/android/AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom)).getName())));
	//    5    9:aload_0         
	//    6   10:ldc1            #21  <String "SecureRandom.SHA1PRNG">
	//    7   12:ldc1            #23  <Class AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom>
	//    8   14:invokevirtual   #29  <Method String Class.getName()>
	//    9   17:invokevirtual   #33  <Method Object put(Object, Object)>
	//   10   20:pop             
		put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
	//   11   21:aload_0         
	//   12   22:ldc1            #35  <String "SecureRandom.SHA1PRNG ImplementedIn">
	//   13   24:ldc1            #37  <String "Software">
	//   14   26:invokevirtual   #33  <Method Object put(Object, Object)>
	//   15   29:pop             
	//   16   30:return          
	}
}
