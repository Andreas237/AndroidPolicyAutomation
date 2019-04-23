// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// Referenced classes of package com.google.android.gms.internal.ads:
//			arc, atv, atw, avs

public final class aso
{

	static int a(int i, byte abyte0[], int j, int k)
	{
		int l = i;
	//    0    0:iload_0         
	//    1    1:istore          4
		for(i = j; i < j + k; i++)
	//*   2    3:iload_2         
	//*   3    4:istore_0        
	//*   4    5:iload_0         
	//*   5    6:iload_2         
	//*   6    7:iload_3         
	//*   7    8:iadd            
	//*   8    9:icmpge          30
			l = l * 31 + abyte0[i];
	//    9   12:iload           4
	//   10   14:bipush          31
	//   11   16:imul            
	//   12   17:aload_1         
	//   13   18:iload_0         
	//   14   19:baload          
	//   15   20:iadd            
	//   16   21:istore          4

	//   17   23:iload_0         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_0        
	//*  21   27:goto            5
		return l;
	//   22   30:iload           4
	//   23   32:ireturn         
	}

	public static int a(long l)
	{
		return (int)(l ^ l >>> 32);
	//    0    0:lload_0         
	//    1    1:lload_0         
	//    2    2:bipush          32
	//    3    4:lushr           
	//    4    5:lxor            
	//    5    6:l2i             
	//    6    7:ireturn         
	}

	public static int a(boolean flag)
	{
		return !flag ? 1237 : 1231;
	//    0    0:iload_0         
	//    1    1:ifeq            8
	//    2    4:sipush          1231
	//    3    7:ireturn         
	//    4    8:sipush          1237
	//    5   11:ireturn         
	}

	static Object a(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			throw new NullPointerException();
	//    4    6:new             #53  <Class NullPointerException>
	//    5    9:dup             
	//    6   10:invokespecial   #56  <Method void NullPointerException()>
	//    7   13:athrow          
	}

	static Object a(Object obj, Object obj1)
	{
		return ((Object) (((atv)obj).o().a((atv)obj1).e()));
	//    0    0:aload_0         
	//    1    1:checkcast       #59  <Class atv>
	//    2    4:invokeinterface #63  <Method atw atv.o()>
	//    3    9:aload_1         
	//    4   10:checkcast       #59  <Class atv>
	//    5   13:invokeinterface #68  <Method atw atw.a(atv)>
	//    6   18:invokeinterface #71  <Method atv atw.e()>
	//    7   23:areturn         
	}

	static Object a(Object obj, String s)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return obj;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			throw new NullPointerException(s);
	//    4    6:new             #53  <Class NullPointerException>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #75  <Method void NullPointerException(String)>
	//    8   14:athrow          
	}

	static boolean a(atv atv1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static boolean a(byte abyte0[])
	{
		return avs.a(abyte0);
	//    0    0:aload_0         
	//    1    1:invokestatic    #81  <Method boolean avs.a(byte[])>
	//    2    4:ireturn         
	}

	public static String b(byte abyte0[])
	{
		return new String(abyte0, a);
	//    0    0:new             #84  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #25  <Field Charset a>
	//    4    8:invokespecial   #87  <Method void String(byte[], Charset)>
	//    5   11:areturn         
	}

	public static int c(byte abyte0[])
	{
		int i = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_1        
		i = a(i, abyte0, 0, i);
	//    3    3:iload_1         
	//    4    4:aload_0         
	//    5    5:iconst_0        
	//    6    6:iload_1         
	//    7    7:invokestatic    #90  <Method int a(int, byte[], int, int)>
	//    8   10:istore_1        
		if(i == 0)
	//*   9   11:iload_1         
	//*  10   12:ifne            17
			return 1;
	//   11   15:iconst_1        
	//   12   16:ireturn         
		else
			return i;
	//   13   17:iload_1         
	//   14   18:ireturn         
	}

	static final Charset a = Charset.forName("UTF-8");
	public static final byte b[];
	private static final Charset c = Charset.forName("ISO-8859-1");
	private static final ByteBuffer d;
	private static final arc e;

	static 
	{
	//    0    0:ldc1            #17  <String "UTF-8">
	//    1    2:invokestatic    #23  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #25  <Field Charset a>
	//    3    8:ldc1            #27  <String "ISO-8859-1">
	//    4   10:invokestatic    #23  <Method Charset Charset.forName(String)>
	//    5   13:putstatic       #29  <Field Charset c>
		byte abyte0[] = new byte[0];
	//    6   16:iconst_0        
	//    7   17:newarray        byte[]
	//    8   19:astore_0        
		b = abyte0;
	//    9   20:aload_0         
	//   10   21:putstatic       #31  <Field byte[] b>
		d = ByteBuffer.wrap(abyte0);
	//   11   24:aload_0         
	//   12   25:invokestatic    #37  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   13   28:putstatic       #39  <Field ByteBuffer d>
		abyte0 = b;
	//   14   31:getstatic       #31  <Field byte[] b>
	//   15   34:astore_0        
		e = arc.a(abyte0, 0, abyte0.length, false);
	//   16   35:aload_0         
	//   17   36:iconst_0        
	//   18   37:aload_0         
	//   19   38:arraylength     
	//   20   39:iconst_0        
	//   21   40:invokestatic    #44  <Method arc arc.a(byte[], int, int, boolean)>
	//   22   43:putstatic       #46  <Field arc e>
	//*  23   46:return          
	}
}
