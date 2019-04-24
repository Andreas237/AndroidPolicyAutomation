// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.security.MessageDigest;

// Referenced classes of package o:
//			ei

public final class ef
{

	public static String d(String s)
	{
		int i;
		boolean flag;
		Object obj;
		try
		{
			flag = ei.b(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method boolean ei.b(String)>
	//    2    4:istore_2        
		}
	//*   3    5:iload_2         
	//*   4    6:ifeq            11
	//*   5    9:aconst_null     
	//*   6   10:areturn         
	//*   7   11:ldc1            #16  <String "SHA-1">
	//*   8   13:invokestatic    #22  <Method MessageDigest MessageDigest.getInstance(String)>
	//*   9   16:astore_3        
	//*  10   17:aload_3         
	//*  11   18:aload_0         
	//*  12   19:ldc1            #24  <String "UTF-8">
	//*  13   21:invokevirtual   #30  <Method byte[] String.getBytes(String)>
	//*  14   24:invokevirtual   #34  <Method void MessageDigest.update(byte[])>
	//*  15   27:aload_3         
	//*  16   28:invokevirtual   #38  <Method byte[] MessageDigest.digest()>
	//*  17   31:astore_0        
	//*  18   32:new             #40  <Class StringBuilder>
	//*  19   35:dup             
	//*  20   36:invokespecial   #44  <Method void StringBuilder()>
	//*  21   39:astore_3        
	//*  22   40:iconst_0        
	//*  23   41:istore_1        
	//*  24   42:iload_1         
	//*  25   43:aload_0         
	//*  26   44:arraylength     
	//*  27   45:icmpge          78
	//*  28   48:aload_3         
	//*  29   49:ldc1            #46  <String "%02x">
	//*  30   51:iconst_1        
	//*  31   52:anewarray       Object[]
	//*  32   55:dup             
	//*  33   56:iconst_0        
	//*  34   57:aload_0         
	//*  35   58:iload_1         
	//*  36   59:baload          
	//*  37   60:invokestatic    #52  <Method Byte Byte.valueOf(byte)>
	//*  38   63:aastore         
	//*  39   64:invokestatic    #56  <Method String String.format(String, Object[])>
	//*  40   67:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//*  41   70:pop             
	//*  42   71:iload_1         
	//*  43   72:iconst_1        
	//*  44   73:iadd            
	//*  45   74:istore_1        
	//*  46   75:goto            42
	//*  47   78:aload_3         
	//*  48   79:invokevirtual   #64  <Method String StringBuilder.toString()>
	//*  49   82:astore_0        
	//*  50   83:aload_0         
	//*  51   84:areturn         
	//*  52   85:aconst_null     
	//*  53   86:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		if(flag)
			return null;
		obj = ((Object) (MessageDigest.getInstance("SHA-1")));
		((MessageDigest) (obj)).update(s.getBytes("UTF-8"));
		s = ((String) (((MessageDigest) (obj)).digest()));
		obj = ((Object) (new StringBuilder()));
		i = 0;
_L2:
		if(i >= s.length)
			break; /* Loop/switch isn't completed */
		((StringBuilder) (obj)).append(String.format("%02x", new Object[] {
			Byte.valueOf(s[i])
		}));
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		s = ((StringBuilder) (obj)).toString();
		return s;
	//*  54   87:astore_0        
	//*  55   88:goto            85
	}
}
