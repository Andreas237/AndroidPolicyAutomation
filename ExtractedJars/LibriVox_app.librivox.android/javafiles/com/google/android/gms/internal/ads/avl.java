// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Base64;

public final class avl
{

	public static String a(byte abyte0[], boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			byte0 = 11;
	//    2    4:bipush          11
	//    3    6:istore_2        
		else
	//*   4    7:goto            12
			byte0 = 2;
	//    5   10:iconst_2        
	//    6   11:istore_2        
		return Base64.encodeToString(abyte0, ((int) (byte0)));
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:invokestatic    #12  <Method String Base64.encodeToString(byte[], int)>
	//   10   17:areturn         
	}

	public static byte[] a(String s, boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			byte0 = 11;
	//    2    4:bipush          11
	//    3    6:istore_2        
		else
	//*   4    7:goto            12
			byte0 = 2;
	//    5   10:iconst_2        
	//    6   11:istore_2        
		byte abyte0[] = Base64.decode(s, ((int) (byte0)));
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:invokestatic    #18  <Method byte[] Base64.decode(String, int)>
	//   10   17:astore_3        
		if(abyte0.length == 0 && s.length() > 0)
	//*  11   18:aload_3         
	//*  12   19:arraylength     
	//*  13   20:ifne            71
	//*  14   23:aload_0         
	//*  15   24:invokevirtual   #24  <Method int String.length()>
	//*  16   27:ifle            71
		{
			s = String.valueOf(((Object) (s)));
	//   17   30:aload_0         
	//   18   31:invokestatic    #28  <Method String String.valueOf(Object)>
	//   19   34:astore_0        
			if(s.length() != 0)
	//*  20   35:aload_0         
	//*  21   36:invokevirtual   #24  <Method int String.length()>
	//*  22   39:ifeq            52
				s = "Unable to decode ".concat(s);
	//   23   42:ldc1            #30  <String "Unable to decode ">
	//   24   44:aload_0         
	//   25   45:invokevirtual   #34  <Method String String.concat(String)>
	//   26   48:astore_0        
			else
	//*  27   49:goto            62
				s = new String("Unable to decode ");
	//   28   52:new             #20  <Class String>
	//   29   55:dup             
	//   30   56:ldc1            #30  <String "Unable to decode ">
	//   31   58:invokespecial   #38  <Method void String(String)>
	//   32   61:astore_0        
			throw new IllegalArgumentException(s);
	//   33   62:new             #40  <Class IllegalArgumentException>
	//   34   65:dup             
	//   35   66:aload_0         
	//   36   67:invokespecial   #41  <Method void IllegalArgumentException(String)>
	//   37   70:athrow          
		} else
		{
			return abyte0;
	//   38   71:aload_3         
	//   39   72:areturn         
		}
	}
}
