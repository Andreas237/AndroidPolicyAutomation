// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asu

final class avt
{

	static void a(byte byte0, byte byte1, byte byte2, byte byte3, char ac[], int i)
	{
		b(byte0, byte1, byte2, byte3, ac, i);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:invokestatic    #9   <Method void b(byte, byte, byte, byte, char[], int)>
	//    7   11:return          
	}

	static void a(byte byte0, byte byte1, byte byte2, char ac[], int i)
	{
		b(byte0, byte1, byte2, ac, i);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokestatic    #13  <Method void b(byte, byte, byte, char[], int)>
	//    6    9:return          
	}

	static void a(byte byte0, byte byte1, char ac[], int i)
	{
		b(byte0, byte1, ac, i);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #16  <Method void b(byte, byte, char[], int)>
	//    5    7:return          
	}

	static void a(byte byte0, char ac[], int i)
	{
		b(byte0, ac, i);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #19  <Method void b(byte, char[], int)>
	//    4    6:return          
	}

	static boolean a(byte byte0)
	{
		return d(byte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #23  <Method boolean d(byte)>
	//    2    4:ireturn         
	}

	private static void b(byte byte0, byte byte1, byte byte2, byte byte3, char ac[], int i)
	{
		if(!g(byte1) && (byte0 << 28) + (byte1 + 112) >> 30 == 0 && !g(byte2) && !g(byte3))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #26  <Method boolean g(byte)>
	//*   2    4:ifne            95
	//*   3    7:iload_0         
	//*   4    8:bipush          28
	//*   5   10:ishl            
	//*   6   11:iload_1         
	//*   7   12:bipush          112
	//*   8   14:iadd            
	//*   9   15:iadd            
	//*  10   16:bipush          30
	//*  11   18:ishr            
	//*  12   19:ifne            95
	//*  13   22:iload_2         
	//*  14   23:invokestatic    #26  <Method boolean g(byte)>
	//*  15   26:ifne            95
	//*  16   29:iload_3         
	//*  17   30:invokestatic    #26  <Method boolean g(byte)>
	//*  18   33:ifne            95
		{
			byte0 = ((byte) ((byte0 & 7) << 18 | (byte1 & 0x3f) << 12 | (byte2 & 0x3f) << 6 | byte3 & 0x3f));
	//   19   36:iload_0         
	//   20   37:bipush          7
	//   21   39:iand            
	//   22   40:bipush          18
	//   23   42:ishl            
	//   24   43:iload_1         
	//   25   44:bipush          63
	//   26   46:iand            
	//   27   47:bipush          12
	//   28   49:ishl            
	//   29   50:ior             
	//   30   51:iload_2         
	//   31   52:bipush          63
	//   32   54:iand            
	//   33   55:bipush          6
	//   34   57:ishl            
	//   35   58:ior             
	//   36   59:iload_3         
	//   37   60:bipush          63
	//   38   62:iand            
	//   39   63:ior             
	//   40   64:istore_0        
			ac[i] = (char)((byte0 >>> 10) + 55232);
	//   41   65:aload           4
	//   42   67:iload           5
	//   43   69:iload_0         
	//   44   70:bipush          10
	//   45   72:iushr           
	//   46   73:ldc1            #27  <Int 55232>
	//   47   75:iadd            
	//   48   76:int2char        
	//   49   77:castore         
			ac[i + 1] = (char)((byte0 & 0x3ff) + 56320);
	//   50   78:aload           4
	//   51   80:iload           5
	//   52   82:iconst_1        
	//   53   83:iadd            
	//   54   84:iload_0         
	//   55   85:sipush          1023
	//   56   88:iand            
	//   57   89:ldc1            #28  <Int 56320>
	//   58   91:iadd            
	//   59   92:int2char        
	//   60   93:castore         
			return;
	//   61   94:return          
		} else
		{
			throw asu.i();
	//   62   95:invokestatic    #34  <Method asu asu.i()>
	//   63   98:athrow          
		}
	}

	private static void b(byte byte0, byte byte1, byte byte2, char ac[], int i)
	{
		if(!g(byte1) && (byte0 != -32 || byte1 >= -96) && (byte0 != -19 || byte1 < -96) && !g(byte2))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #26  <Method boolean g(byte)>
	//*   2    4:ifne            64
	//*   3    7:iload_0         
	//*   4    8:bipush          -32
	//*   5   10:icmpne          19
	//*   6   13:iload_1         
	//*   7   14:bipush          -96
	//*   8   16:icmplt          64
	//*   9   19:iload_0         
	//*  10   20:bipush          -19
	//*  11   22:icmpne          31
	//*  12   25:iload_1         
	//*  13   26:bipush          -96
	//*  14   28:icmpge          64
	//*  15   31:iload_2         
	//*  16   32:invokestatic    #26  <Method boolean g(byte)>
	//*  17   35:ifne            64
		{
			ac[i] = (char)((byte0 & 0xf) << 12 | (byte1 & 0x3f) << 6 | byte2 & 0x3f);
	//   18   38:aload_3         
	//   19   39:iload           4
	//   20   41:iload_0         
	//   21   42:bipush          15
	//   22   44:iand            
	//   23   45:bipush          12
	//   24   47:ishl            
	//   25   48:iload_1         
	//   26   49:bipush          63
	//   27   51:iand            
	//   28   52:bipush          6
	//   29   54:ishl            
	//   30   55:ior             
	//   31   56:iload_2         
	//   32   57:bipush          63
	//   33   59:iand            
	//   34   60:ior             
	//   35   61:int2char        
	//   36   62:castore         
			return;
	//   37   63:return          
		} else
		{
			throw asu.i();
	//   38   64:invokestatic    #34  <Method asu asu.i()>
	//   39   67:athrow          
		}
	}

	private static void b(byte byte0, byte byte1, char ac[], int i)
	{
		if(byte0 >= -62 && !g(byte1))
	//*   0    0:iload_0         
	//*   1    1:bipush          -62
	//*   2    3:icmplt          30
	//*   3    6:iload_1         
	//*   4    7:invokestatic    #26  <Method boolean g(byte)>
	//*   5   10:ifne            30
		{
			ac[i] = (char)((byte0 & 0x1f) << 6 | byte1 & 0x3f);
	//    6   13:aload_2         
	//    7   14:iload_3         
	//    8   15:iload_0         
	//    9   16:bipush          31
	//   10   18:iand            
	//   11   19:bipush          6
	//   12   21:ishl            
	//   13   22:iload_1         
	//   14   23:bipush          63
	//   15   25:iand            
	//   16   26:ior             
	//   17   27:int2char        
	//   18   28:castore         
			return;
	//   19   29:return          
		} else
		{
			throw asu.i();
	//   20   30:invokestatic    #34  <Method asu asu.i()>
	//   21   33:athrow          
		}
	}

	private static void b(byte byte0, char ac[], int i)
	{
		ac[i] = (char)byte0;
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_0         
	//    3    3:int2char        
	//    4    4:castore         
	//    5    5:return          
	}

	static boolean b(byte byte0)
	{
		return e(byte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #37  <Method boolean e(byte)>
	//    2    4:ireturn         
	}

	static boolean c(byte byte0)
	{
		return f(byte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #41  <Method boolean f(byte)>
	//    2    4:ireturn         
	}

	private static boolean d(byte byte0)
	{
		return byte0 >= 0;
	//    0    0:iload_0         
	//    1    1:iflt            6
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iconst_0        
	//    5    7:ireturn         
	}

	private static boolean e(byte byte0)
	{
		return byte0 < -32;
	//    0    0:iload_0         
	//    1    1:bipush          -32
	//    2    3:icmpge          8
	//    3    6:iconst_1        
	//    4    7:ireturn         
	//    5    8:iconst_0        
	//    6    9:ireturn         
	}

	private static boolean f(byte byte0)
	{
		return byte0 < -16;
	//    0    0:iload_0         
	//    1    1:bipush          -16
	//    2    3:icmpge          8
	//    3    6:iconst_1        
	//    4    7:ireturn         
	//    5    8:iconst_0        
	//    6    9:ireturn         
	}

	private static boolean g(byte byte0)
	{
		return byte0 > -65;
	//    0    0:iload_0         
	//    1    1:bipush          -65
	//    2    3:icmple          8
	//    3    6:iconst_1        
	//    4    7:ireturn         
	//    5    8:iconst_0        
	//    6    9:ireturn         
	}
}
