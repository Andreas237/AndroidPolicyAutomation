// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.vcard;


// Referenced classes of package com.digits.sdk.vcard:
//			VCardUtils

public static class VCardUtils$TextUtilsPort
{

	public static boolean isPrintableAscii(char c)
	{
		return ' ' <= c && c <= '~' || c == '\r' || c == '\n';
	//    0    0:bipush          32
	//    1    2:iload_0         
	//    2    3:icmpgt          12
	//    3    6:iload_0         
	//    4    7:bipush          126
	//    5    9:icmple          29
	//    6   12:iload_0         
	//    7   13:bipush          13
	//    8   15:icmpeq          29
	//    9   18:iload_0         
	//   10   19:bipush          10
	//   11   21:icmpne          27
	//   12   24:goto            29
	//   13   27:iconst_0        
	//   14   28:ireturn         
	//   15   29:iconst_1        
	//   16   30:ireturn         
	}

	public static boolean isPrintableAsciiOnly(CharSequence charsequence)
	{
		int j = charsequence.length();
	//    0    0:aload_0         
	//    1    1:invokeinterface #18  <Method int CharSequence.length()>
	//    2    6:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:iload_2         
	//*   7   11:icmpge          36
			if(!isPrintableAscii(charsequence.charAt(i)))
	//*   8   14:aload_0         
	//*   9   15:iload_1         
	//*  10   16:invokeinterface #22  <Method char CharSequence.charAt(int)>
	//*  11   21:invokestatic    #24  <Method boolean isPrintableAscii(char)>
	//*  12   24:ifne            29
				return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            9
		return true;
	//   20   36:iconst_1        
	//   21   37:ireturn         
	}
}
