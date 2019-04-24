// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package o:
//			go

public final class gq
{

	public gq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String a(int i, String s, String s1)
	{
		try
		{
			SecretKeySpec secretkeyspec = new SecretKeySpec(s1.getBytes(), "DES");
	//    0    0:new             #15  <Class SecretKeySpec>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokevirtual   #21  <Method byte[] String.getBytes()>
	//    4    8:ldc1            #23  <String "DES">
	//    5   10:invokespecial   #26  <Method void SecretKeySpec(byte[], String)>
	//    6   13:astore_3        
			s1 = ((String) (Cipher.getInstance("DES")));
	//    7   14:ldc1            #23  <String "DES">
	//    8   16:invokestatic    #32  <Method Cipher Cipher.getInstance(String)>
	//    9   19:astore_2        
			((Cipher) (s1)).init(i, ((java.security.Key) (secretkeyspec)));
	//   10   20:aload_2         
	//   11   21:iload_0         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #36  <Method void Cipher.init(int, java.security.Key)>
		}
	//*  14   26:iload_0         
	//*  15   27:iconst_2        
	//*  16   28:icmpne          39
	//*  17   31:aload_1         
	//*  18   32:invokestatic    #42  <Method byte[] go.c(String)>
	//*  19   35:astore_1        
	//*  20   36:goto            46
	//*  21   39:aload_1         
	//*  22   40:ldc1            #44  <String "UTF-8">
	//*  23   42:invokevirtual   #46  <Method byte[] String.getBytes(String)>
	//*  24   45:astore_1        
	//*  25   46:aload_2         
	//*  26   47:aload_1         
	//*  27   48:invokevirtual   #50  <Method byte[] Cipher.doFinal(byte[])>
	//*  28   51:astore_1        
	//*  29   52:iload_0         
	//*  30   53:iconst_2        
	//*  31   54:icmpne          66
	//*  32   57:new             #17  <Class String>
	//*  33   60:dup             
	//*  34   61:aload_1         
	//*  35   62:invokespecial   #53  <Method void String(byte[])>
	//*  36   65:areturn         
	//*  37   66:aload_1         
	//*  38   67:invokestatic    #57  <Method String go.b(byte[])>
	//*  39   70:astore_1        
	//*  40   71:aload_1         
	//*  41   72:areturn         
	//*  42   73:aconst_null     
	//*  43   74:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		if(i != 2)
			break MISSING_BLOCK_LABEL_39;
		s = ((String) (go.c(s)));
		break MISSING_BLOCK_LABEL_46;
		s = ((String) (s.getBytes("UTF-8")));
		s = ((String) (((Cipher) (s1)).doFinal(((byte []) (s)))));
		if(i != 2)
			break MISSING_BLOCK_LABEL_66;
		return new String(((byte []) (s)));
		s = go.b(((byte []) (s)));
		return s;
	//*  44   75:astore_1        
	//*  45   76:goto            73
	}
}
