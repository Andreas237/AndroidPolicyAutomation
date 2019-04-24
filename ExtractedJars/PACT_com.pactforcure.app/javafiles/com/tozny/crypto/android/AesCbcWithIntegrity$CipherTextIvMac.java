// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.tozny.crypto.android;

import android.util.Base64;
import java.util.Arrays;

// Referenced classes of package com.tozny.crypto.android:
//			AesCbcWithIntegrity

public static class AesCbcWithIntegrity$CipherTextIvMac
{

	public static byte[] ivCipherConcat(byte abyte0[], byte abyte1[])
	{
		byte abyte2[] = new byte[abyte0.length + abyte1.length];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:iadd            
	//    5    5:newarray        byte[]
	//    6    7:astore_2        
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte2)), 0, abyte0.length);
	//    7    8:aload_0         
	//    8    9:iconst_0        
	//    9   10:aload_2         
	//   10   11:iconst_0        
	//   11   12:aload_0         
	//   12   13:arraylength     
	//   13   14:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte2)), abyte0.length, abyte1.length);
	//   14   17:aload_1         
	//   15   18:iconst_0        
	//   16   19:aload_2         
	//   17   20:aload_0         
	//   18   21:arraylength     
	//   19   22:aload_1         
	//   20   23:arraylength     
	//   21   24:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte2;
	//   22   27:aload_2         
	//   23   28:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
				return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
			if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #58  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #58  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
				return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
			obj = ((Object) ((AesCbcWithIntegrity$CipherTextIvMac)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class AesCbcWithIntegrity$CipherTextIvMac>
	//   18   30:astore_1        
			if(!Arrays.equals(cipherText, ((AesCbcWithIntegrity$CipherTextIvMac) (obj)).cipherText))
	//*  19   31:aload_0         
	//*  20   32:getfield        #42  <Field byte[] cipherText>
	//*  21   35:aload_1         
	//*  22   36:getfield        #42  <Field byte[] cipherText>
	//*  23   39:invokestatic    #63  <Method boolean Arrays.equals(byte[], byte[])>
	//*  24   42:ifne            47
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
			if(!Arrays.equals(iv, ((AesCbcWithIntegrity$CipherTextIvMac) (obj)).iv))
	//*  27   47:aload_0         
	//*  28   48:getfield        #38  <Field byte[] iv>
	//*  29   51:aload_1         
	//*  30   52:getfield        #38  <Field byte[] iv>
	//*  31   55:invokestatic    #63  <Method boolean Arrays.equals(byte[], byte[])>
	//*  32   58:ifne            63
				return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
			if(!Arrays.equals(mac, ((AesCbcWithIntegrity$CipherTextIvMac) (obj)).mac))
	//*  35   63:aload_0         
	//*  36   64:getfield        #40  <Field byte[] mac>
	//*  37   67:aload_1         
	//*  38   68:getfield        #40  <Field byte[] mac>
	//*  39   71:invokestatic    #63  <Method boolean Arrays.equals(byte[], byte[])>
	//*  40   74:ifne            5
				return false;
	//   41   77:iconst_0        
	//   42   78:ireturn         
		}
		return true;
	}

	public byte[] getCipherText()
	{
		return cipherText;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field byte[] cipherText>
	//    2    4:areturn         
	}

	public byte[] getIv()
	{
		return iv;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field byte[] iv>
	//    2    4:areturn         
	}

	public byte[] getMac()
	{
		return mac;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field byte[] mac>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ((Arrays.hashCode(cipherText) + 31) * 31 + Arrays.hashCode(iv)) * 31 + Arrays.hashCode(mac);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field byte[] cipherText>
	//    2    4:invokestatic    #72  <Method int Arrays.hashCode(byte[])>
	//    3    7:bipush          31
	//    4    9:iadd            
	//    5   10:bipush          31
	//    6   12:imul            
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field byte[] iv>
	//    9   17:invokestatic    #72  <Method int Arrays.hashCode(byte[])>
	//   10   20:iadd            
	//   11   21:bipush          31
	//   12   23:imul            
	//   13   24:aload_0         
	//   14   25:getfield        #40  <Field byte[] mac>
	//   15   28:invokestatic    #72  <Method int Arrays.hashCode(byte[])>
	//   16   31:iadd            
	//   17   32:ireturn         
	}

	public String toString()
	{
		String s = Base64.encodeToString(iv, 2);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field byte[] iv>
	//    2    4:iconst_2        
	//    3    5:invokestatic    #78  <Method String Base64.encodeToString(byte[], int)>
	//    4    8:astore_1        
		String s1 = Base64.encodeToString(cipherText, 2);
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field byte[] cipherText>
	//    7   13:iconst_2        
	//    8   14:invokestatic    #78  <Method String Base64.encodeToString(byte[], int)>
	//    9   17:astore_2        
		String s2 = Base64.encodeToString(mac, 2);
	//   10   18:aload_0         
	//   11   19:getfield        #40  <Field byte[] mac>
	//   12   22:iconst_2        
	//   13   23:invokestatic    #78  <Method String Base64.encodeToString(byte[], int)>
	//   14   26:astore_3        
		return String.format((new StringBuilder()).append(s).append(":").append(s2).append(":").append(s1).toString(), new Object[0]);
	//   15   27:new             #80  <Class StringBuilder>
	//   16   30:dup             
	//   17   31:invokespecial   #81  <Method void StringBuilder()>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:ldc1            #18  <String ":">
	//   21   40:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:aload_3         
	//   23   44:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:ldc1            #18  <String ":">
	//   25   49:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:aload_2         
	//   27   53:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   29   59:iconst_0        
	//   30   60:anewarray       Object[]
	//   31   63:invokestatic    #91  <Method String String.format(String, Object[])>
	//   32   66:areturn         
	}

	private final byte cipherText[];
	private final byte iv[];
	private final byte mac[];

	public AesCbcWithIntegrity$CipherTextIvMac(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		s = ((String) (s.split(":")));
	//    2    4:aload_1         
	//    3    5:ldc1            #18  <String ":">
	//    4    7:invokevirtual   #24  <Method String[] String.split(String)>
	//    5   10:astore_1        
		if(s.length != 3)
	//*   6   11:aload_1         
	//*   7   12:arraylength     
	//*   8   13:iconst_3        
	//*   9   14:icmpeq          27
		{
			throw new IllegalArgumentException("Cannot parse iv:ciphertext:mac");
	//   10   17:new             #26  <Class IllegalArgumentException>
	//   11   20:dup             
	//   12   21:ldc1            #28  <String "Cannot parse iv:ciphertext:mac">
	//   13   23:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//   14   26:athrow          
		} else
		{
			iv = Base64.decode(((String) (s[0])), 2);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:iconst_0        
	//   18   30:aaload          
	//   19   31:iconst_2        
	//   20   32:invokestatic    #36  <Method byte[] Base64.decode(String, int)>
	//   21   35:putfield        #38  <Field byte[] iv>
			mac = Base64.decode(((String) (s[1])), 2);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:iconst_1        
	//   25   41:aaload          
	//   26   42:iconst_2        
	//   27   43:invokestatic    #36  <Method byte[] Base64.decode(String, int)>
	//   28   46:putfield        #40  <Field byte[] mac>
			cipherText = Base64.decode(((String) (s[2])), 2);
	//   29   49:aload_0         
	//   30   50:aload_1         
	//   31   51:iconst_2        
	//   32   52:aaload          
	//   33   53:iconst_2        
	//   34   54:invokestatic    #36  <Method byte[] Base64.decode(String, int)>
	//   35   57:putfield        #42  <Field byte[] cipherText>
			return;
	//   36   60:return          
		}
	}

	public AesCbcWithIntegrity$CipherTextIvMac(byte abyte0[], byte abyte1[], byte abyte2[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		cipherText = new byte[abyte0.length];
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:newarray        byte[]
	//    6    9:putfield        #42  <Field byte[] cipherText>
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (cipherText)), 0, abyte0.length);
	//    7   12:aload_1         
	//    8   13:iconst_0        
	//    9   14:aload_0         
	//   10   15:getfield        #42  <Field byte[] cipherText>
	//   11   18:iconst_0        
	//   12   19:aload_1         
	//   13   20:arraylength     
	//   14   21:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
		iv = new byte[abyte1.length];
	//   15   24:aload_0         
	//   16   25:aload_2         
	//   17   26:arraylength     
	//   18   27:newarray        byte[]
	//   19   29:putfield        #38  <Field byte[] iv>
		System.arraycopy(((Object) (abyte1)), 0, ((Object) (iv)), 0, abyte1.length);
	//   20   32:aload_2         
	//   21   33:iconst_0        
	//   22   34:aload_0         
	//   23   35:getfield        #38  <Field byte[] iv>
	//   24   38:iconst_0        
	//   25   39:aload_2         
	//   26   40:arraylength     
	//   27   41:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
		mac = new byte[abyte2.length];
	//   28   44:aload_0         
	//   29   45:aload_3         
	//   30   46:arraylength     
	//   31   47:newarray        byte[]
	//   32   49:putfield        #40  <Field byte[] mac>
		System.arraycopy(((Object) (abyte2)), 0, ((Object) (mac)), 0, abyte2.length);
	//   33   52:aload_3         
	//   34   53:iconst_0        
	//   35   54:aload_0         
	//   36   55:getfield        #40  <Field byte[] mac>
	//   37   58:iconst_0        
	//   38   59:aload_3         
	//   39   60:arraylength     
	//   40   61:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   41   64:return          
	}
}
