// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package o:
//			cwy, dho

public final class cxc
{

	public static byte[] b(byte abyte0[])
	{
		try
		{
			abyte0 = MessageDigest.getInstance("SHA-256").digest(abyte0);
	//    0    0:ldc1            #10  <String "SHA-256">
	//    1    2:invokestatic    #16  <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:aload_0         
	//    3    6:invokevirtual   #19  <Method byte[] MessageDigest.digest(byte[])>
	//    4    9:astore_0        
		}
	//*   5   10:aload_0         
	//*   6   11:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   7   12:astore_0        
		{
			cwy.a("SHA256", "NoSuchAlgorithmException", ((Throwable) (abyte0)));
	//    8   13:ldc1            #21  <String "SHA256">
	//    9   15:ldc1            #23  <String "NoSuchAlgorithmException">
	//   10   17:aload_0         
	//   11   18:invokestatic    #29  <Method void cwy.a(String, String, Throwable)>
			return new byte[0];
	//   12   21:iconst_0        
	//   13   22:newarray        byte[]
	//   14   24:areturn         
		}
		return abyte0;
	}

	public static String d(String s, String s1)
	{
		try
		{
			s1 = ((String) (MessageDigest.getInstance(s1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #16  <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    4:astore_1        
			((MessageDigest) (s1)).update(s.getBytes("UTF-8"));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:ldc1            #36  <String "UTF-8">
	//    6    9:invokevirtual   #42  <Method byte[] String.getBytes(String)>
	//    7   12:invokevirtual   #46  <Method void MessageDigest.update(byte[])>
			s = d(((MessageDigest) (s1)).digest());
	//    8   15:aload_1         
	//    9   16:invokevirtual   #49  <Method byte[] MessageDigest.digest()>
	//   10   19:invokestatic    #52  <Method String d(byte[])>
	//   11   22:astore_0        
		}
	//*  12   23:aload_0         
	//*  13   24:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  14   25:astore_0        
		{
			dho.b("SHA256", new Object[] {
				(new StringBuilder()).append("ResourceManager getHashCodeForString e1=").append(((NoSuchAlgorithmException) (s)).getMessage()).toString()
			});
	//   15   26:ldc1            #21  <String "SHA256">
	//   16   28:iconst_1        
	//   17   29:anewarray       Object[]
	//   18   32:dup             
	//   19   33:iconst_0        
	//   20   34:new             #54  <Class StringBuilder>
	//   21   37:dup             
	//   22   38:invokespecial   #58  <Method void StringBuilder()>
	//   23   41:ldc1            #60  <String "ResourceManager getHashCodeForString e1=">
	//   24   43:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:aload_0         
	//   26   47:invokevirtual   #68  <Method String NoSuchAlgorithmException.getMessage()>
	//   27   50:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   29   56:aastore         
	//   30   57:invokestatic    #76  <Method void dho.b(String, Object[])>
			return "";
	//   31   60:ldc1            #78  <String "">
	//   32   62:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  33   63:astore_0        
		{
			dho.b("SHA256", new Object[] {
				(new StringBuilder()).append("ResourceManager getHashCodeForString e2=").append(((UnsupportedEncodingException) (s)).getMessage()).toString()
			});
	//   34   64:ldc1            #21  <String "SHA256">
	//   35   66:iconst_1        
	//   36   67:anewarray       Object[]
	//   37   70:dup             
	//   38   71:iconst_0        
	//   39   72:new             #54  <Class StringBuilder>
	//   40   75:dup             
	//   41   76:invokespecial   #58  <Method void StringBuilder()>
	//   42   79:ldc1            #80  <String "ResourceManager getHashCodeForString e2=">
	//   43   81:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   44   84:aload_0         
	//   45   85:invokevirtual   #81  <Method String UnsupportedEncodingException.getMessage()>
	//   46   88:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   47   91:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   48   94:aastore         
	//   49   95:invokestatic    #76  <Method void dho.b(String, Object[])>
			return "";
	//   50   98:ldc1            #78  <String "">
	//   51  100:areturn         
		}
		return s;
	}

	private static String d(byte abyte0[])
	{
		StringBuilder stringbuilder = new StringBuilder("");
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #78  <String "">
	//    3    6:invokespecial   #84  <Method void StringBuilder(String)>
	//    4    9:astore_2        
		if(abyte0 == null || abyte0.length <= 0)
	//*   5   10:aload_0         
	//*   6   11:ifnull          19
	//*   7   14:aload_0         
	//*   8   15:arraylength     
	//*   9   16:ifgt            21
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		for(int i = 0; i < abyte0.length; i++)
	//*  12   21:iconst_0        
	//*  13   22:istore_1        
	//*  14   23:iload_1         
	//*  15   24:aload_0         
	//*  16   25:arraylength     
	//*  17   26:icmpge          67
		{
			String s = Integer.toHexString(abyte0[i] & 0xff);
	//   18   29:aload_0         
	//   19   30:iload_1         
	//   20   31:baload          
	//   21   32:sipush          255
	//   22   35:iand            
	//   23   36:invokestatic    #90  <Method String Integer.toHexString(int)>
	//   24   39:astore_3        
			if(s.length() < 2)
	//*  25   40:aload_3         
	//*  26   41:invokevirtual   #94  <Method int String.length()>
	//*  27   44:iconst_2        
	//*  28   45:icmpge          54
				stringbuilder.append(0);
	//   29   48:aload_2         
	//   30   49:iconst_0        
	//   31   50:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
	//   32   53:pop             
			stringbuilder.append(s);
	//   33   54:aload_2         
	//   34   55:aload_3         
	//   35   56:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   36   59:pop             
		}

	//   37   60:iload_1         
	//   38   61:iconst_1        
	//   39   62:iadd            
	//   40   63:istore_1        
	//*  41   64:goto            23
		return stringbuilder.toString().toUpperCase();
	//   42   67:aload_2         
	//   43   68:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   44   71:invokevirtual   #100 <Method String String.toUpperCase()>
	//   45   74:areturn         
	}
}
