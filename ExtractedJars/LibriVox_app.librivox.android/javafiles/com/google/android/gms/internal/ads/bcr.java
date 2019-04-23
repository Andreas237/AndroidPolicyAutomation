// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnw

public final class bcr
{

	public static long a(long l)
	{
		if(l == 0x1L)
	//*   0    0:lload_0         
	//*   1    1:ldc2w           #47  <Long 0x1L>
	//*   2    4:lcmp            
	//*   3    5:ifne            12
			return 0x1L;
	//    4    8:ldc2w           #47  <Long 0x1L>
	//    5   11:lreturn         
		else
			return l / 1000L;
	//    6   12:lload_0         
	//    7   13:ldc2w           #49  <Long 1000L>
	//    8   16:ldiv            
	//    9   17:lreturn         
	}

	public static long b(long l)
	{
		if(l == 0x1L)
	//*   0    0:lload_0         
	//*   1    1:ldc2w           #47  <Long 0x1L>
	//*   2    4:lcmp            
	//*   3    5:ifne            12
			return 0x1L;
	//    4    8:ldc2w           #47  <Long 0x1L>
	//    5   11:lreturn         
		else
			return l * 1000L;
	//    6   12:lload_0         
	//    7   13:ldc2w           #49  <Long 1000L>
	//    8   16:lmul            
	//    9   17:lreturn         
	}

	public static final int a;
	public static final UUID b = new UUID(0L, 0L);
	public static final UUID c = new UUID(0x98404286L, 0xe0885f95L);
	private static final UUID d = new UUID(0xc0b24d02L, 0x52e2fb4bL);
	private static final UUID e = new UUID(0x79d64aceL, 0xd51d21edL);

	static 
	{
		int i;
		if(bnw.a < 23)
	//*   0    0:getstatic       #17  <Field int bnw.a>
	//*   1    3:bipush          23
	//*   2    5:icmpge          15
			i = 1020;
	//    3    8:sipush          1020
	//    4   11:istore_0        
		else
	//*   5   12:goto            19
			i = 6396;
	//    6   15:sipush          6396
	//    7   18:istore_0        
		a = i;
	//    8   19:iload_0         
	//    9   20:putstatic       #18  <Field int a>
	//   10   23:new             #20  <Class UUID>
	//   11   26:dup             
	//   12   27:lconst_0        
	//   13   28:lconst_0        
	//   14   29:invokespecial   #24  <Method void UUID(long, long)>
	//   15   32:putstatic       #26  <Field UUID b>
	//   16   35:new             #20  <Class UUID>
	//   17   38:dup             
	//   18   39:ldc2w           #27  <Long 0xc0b24d02L>
	//   19   42:ldc2w           #29  <Long 0x52e2fb4bL>
	//   20   45:invokespecial   #24  <Method void UUID(long, long)>
	//   21   48:putstatic       #32  <Field UUID d>
	//   22   51:new             #20  <Class UUID>
	//   23   54:dup             
	//   24   55:ldc2w           #33  <Long 0x79d64aceL>
	//   25   58:ldc2w           #35  <Long 0xd51d21edL>
	//   26   61:invokespecial   #24  <Method void UUID(long, long)>
	//   27   64:putstatic       #38  <Field UUID e>
	//   28   67:new             #20  <Class UUID>
	//   29   70:dup             
	//   30   71:ldc2w           #39  <Long 0x98404286L>
	//   31   74:ldc2w           #41  <Long 0xe0885f95L>
	//   32   77:invokespecial   #24  <Method void UUID(long, long)>
	//   33   80:putstatic       #44  <Field UUID c>
	//*  34   83:return          
	}
}
