// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aqp, avm, atb, arj, 
//			arm, arl, ari, aqq, 
//			atv, aqh, aun, avw, 
//			avs, aso, ark, aro, 
//			arn

public abstract class arh extends aqp
{

	private arh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void aqp()>
	//    2    4:return          
	}

	arh(arn arn)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void arh()>
	//    2    4:return          
	}

	public static int a(int i1, atb atb1)
	{
		i1 = e(i1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:istore_0        
		int j1 = atb1.b();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #49  <Method int atb.b()>
	//    5    9:istore_2        
		return i1 + (g(j1) + j1);
	//    6   10:iload_0         
	//    7   11:iload_2         
	//    8   12:invokestatic    #52  <Method int g(int)>
	//    9   15:iload_2         
	//   10   16:iadd            
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int a(atb atb1)
	{
		int i1 = atb1.b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method int atb.b()>
	//    2    4:istore_1        
		return g(i1) + i1;
	//    3    5:iload_1         
	//    4    6:invokestatic    #52  <Method int g(int)>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	public static arh a(ByteBuffer bytebuffer)
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #59  <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            16
			return ((arh) (new arj(bytebuffer)));
	//    3    7:new             #61  <Class arj>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #64  <Method void arj(ByteBuffer)>
	//    7   15:areturn         
		if(bytebuffer.isDirect() && !bytebuffer.isReadOnly())
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #67  <Method boolean ByteBuffer.isDirect()>
	//*  10   20:ifeq            54
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #70  <Method boolean ByteBuffer.isReadOnly()>
	//*  13   27:ifne            54
		{
			if(avm.b())
	//*  14   30:invokestatic    #72  <Method boolean avm.b()>
	//*  15   33:ifeq            45
				return ((arh) (new arm(bytebuffer)));
	//   16   36:new             #74  <Class arm>
	//   17   39:dup             
	//   18   40:aload_0         
	//   19   41:invokespecial   #75  <Method void arm(ByteBuffer)>
	//   20   44:areturn         
			else
				return ((arh) (new arl(bytebuffer)));
	//   21   45:new             #77  <Class arl>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:invokespecial   #78  <Method void arl(ByteBuffer)>
	//   25   53:areturn         
		} else
		{
			throw new IllegalArgumentException("ByteBuffer is read-only");
	//   26   54:new             #80  <Class IllegalArgumentException>
	//   27   57:dup             
	//   28   58:ldc1            #82  <String "ByteBuffer is read-only">
	//   29   60:invokespecial   #85  <Method void IllegalArgumentException(String)>
	//   30   63:athrow          
		}
	}

	public static arh a(byte abyte0[])
	{
		return ((arh) (new ari(abyte0, 0, abyte0.length)));
	//    0    0:new             #88  <Class ari>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:invokespecial   #91  <Method void ari(byte[], int, int)>
	//    7   11:areturn         
	}

	public static int b(double d1)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int b(float f1)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int b(int i1, double d1)
	{
		return e(i1) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int b(int i1, float f1)
	{
		return e(i1) + 4;
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int b(int i1, atb atb1)
	{
		return (e(1) << 1) + g(2, i1) + a(3, atb1);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #98  <Method int g(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #100 <Method int a(int, atb)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	static int b(int i1, atv atv1, aun aun1)
	{
		return e(i1) + b(atv1, aun1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #104 <Method int b(atv, aun)>
	//    5    9:iadd            
	//    6   10:ireturn         
	}

	public static int b(int i1, String s)
	{
		return e(i1) + b(s);
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #108 <Method int b(String)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int b(int i1, boolean flag)
	{
		return e(i1) + 1;
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int b(aqq aqq1)
	{
		int i1 = aqq1.a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method int aqq.a()>
	//    2    4:istore_1        
		return g(i1) + i1;
	//    3    5:iload_1         
	//    4    6:invokestatic    #52  <Method int g(int)>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	public static int b(atv atv1)
	{
		int i1 = atv1.l();
	//    0    0:aload_0         
	//    1    1:invokeinterface #120 <Method int atv.l()>
	//    2    6:istore_1        
		return g(i1) + i1;
	//    3    7:iload_1         
	//    4    8:invokestatic    #52  <Method int g(int)>
	//    5   11:iload_1         
	//    6   12:iadd            
	//    7   13:ireturn         
	}

	static int b(atv atv1, aun aun1)
	{
		atv1 = ((atv) ((aqh)atv1));
	//    0    0:aload_0         
	//    1    1:checkcast       #122 <Class aqh>
	//    2    4:astore_0        
		int j1 = ((aqh) (atv1)).j();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #125 <Method int aqh.j()>
	//    5    9:istore_3        
		int i1 = j1;
	//    6   10:iload_3         
	//    7   11:istore_2        
		if(j1 == -1)
	//*   8   12:iload_3         
	//*   9   13:iconst_m1       
	//*  10   14:icmpne          30
		{
			i1 = aun1.b(((Object) (atv1)));
	//   11   17:aload_1         
	//   12   18:aload_0         
	//   13   19:invokeinterface #130 <Method int aun.b(Object)>
	//   14   24:istore_2        
			((aqh) (atv1)).a(i1);
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:invokevirtual   #133 <Method void aqh.a(int)>
		}
		return g(i1) + i1;
	//   18   30:iload_2         
	//   19   31:invokestatic    #52  <Method int g(int)>
	//   20   34:iload_2         
	//   21   35:iadd            
	//   22   36:ireturn         
	}

	public static int b(String s)
	{
		avw avw1;
		int i1;
		try
		{
			i1 = avs.a(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #140 <Method int avs.a(CharSequence)>
	//    2    4:istore_1        
		}
	//*   3    5:goto            17
	//*   4    8:aload_0         
	//*   5    9:getstatic       #145 <Field java.nio.charset.Charset aso.a>
	//*   6   12:invokevirtual   #151 <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//*   7   15:arraylength     
	//*   8   16:istore_1        
	//*   9   17:iload_1         
	//*  10   18:invokestatic    #52  <Method int g(int)>
	//*  11   21:iload_1         
	//*  12   22:iadd            
	//*  13   23:ireturn         
		// Misplaced declaration of an exception variable
		catch(avw avw1)
		{
			i1 = s.getBytes(aso.a).length;
		}
		return g(i1) + i1;
	//*  14   24:astore_2        
	//*  15   25:goto            8
	}

	public static int b(boolean flag)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static int b(byte abyte0[])
	{
		int i1 = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_1        
		return g(i1) + i1;
	//    3    3:iload_1         
	//    4    4:invokestatic    #52  <Method int g(int)>
	//    5    7:iload_1         
	//    6    8:iadd            
	//    7    9:ireturn         
	}

	public static int c(int i1, aqq aqq1)
	{
		i1 = e(i1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:istore_0        
		int j1 = aqq1.a();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #114 <Method int aqq.a()>
	//    5    9:istore_2        
		return i1 + (g(j1) + j1);
	//    6   10:iload_0         
	//    7   11:iload_2         
	//    8   12:invokestatic    #52  <Method int g(int)>
	//    9   15:iload_2         
	//   10   16:iadd            
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int c(int i1, atv atv1)
	{
		return e(i1) + b(atv1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #157 <Method int b(atv)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	static int c(int i1, atv atv1, aun aun1)
	{
		int k1 = e(i1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:istore          4
		atv1 = ((atv) ((aqh)atv1));
	//    3    6:aload_1         
	//    4    7:checkcast       #122 <Class aqh>
	//    5   10:astore_1        
		int j1 = ((aqh) (atv1)).j();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #125 <Method int aqh.j()>
	//    8   15:istore_3        
		i1 = j1;
	//    9   16:iload_3         
	//   10   17:istore_0        
		if(j1 == -1)
	//*  11   18:iload_3         
	//*  12   19:iconst_m1       
	//*  13   20:icmpne          36
		{
			i1 = aun1.b(((Object) (atv1)));
	//   14   23:aload_2         
	//   15   24:aload_1         
	//   16   25:invokeinterface #130 <Method int aun.b(Object)>
	//   17   30:istore_0        
			((aqh) (atv1)).a(i1);
	//   18   31:aload_1         
	//   19   32:iload_0         
	//   20   33:invokevirtual   #133 <Method void aqh.a(int)>
		}
		return (k1 << 1) + i1;
	//   21   36:iload           4
	//   22   38:iconst_1        
	//   23   39:ishl            
	//   24   40:iload_0         
	//   25   41:iadd            
	//   26   42:ireturn         
	}

	public static int c(atv atv1)
	{
		return atv1.l();
	//    0    0:aload_0         
	//    1    1:invokeinterface #120 <Method int atv.l()>
	//    2    6:ireturn         
	}

	public static int d(int i1, long l1)
	{
		return e(i1) + e(l1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #164 <Method int e(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int d(int i1, aqq aqq1)
	{
		return (e(1) << 1) + g(2, i1) + c(3, aqq1);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #98  <Method int g(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #166 <Method int c(int, aqq)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int d(int i1, atv atv1)
	{
		return (e(1) << 1) + g(2, i1) + c(3, atv1);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #98  <Method int g(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #168 <Method int c(int, atv)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int d(long l1)
	{
		return e(l1);
	//    0    0:lload_0         
	//    1    1:invokestatic    #164 <Method int e(long)>
	//    2    4:ireturn         
	}

	static boolean d()
	{
		return c;
	//    0    0:getstatic       #33  <Field boolean c>
	//    1    3:ireturn         
	}

	public static int e(int i1)
	{
		return g(i1 << 3);
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:invokestatic    #52  <Method int g(int)>
	//    4    6:ireturn         
	}

	public static int e(int i1, long l1)
	{
		return e(i1) + e(l1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #164 <Method int e(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int e(long l1)
	{
		if((-128L & l1) == 0L)
	//*   0    0:ldc2w           #169 <Long -128L>
	//*   1    3:lload_0         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            12
			return 1;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(l1 < 0L)
	//*   8   12:lload_0         
	//*   9   13:lconst_0        
	//*  10   14:lcmp            
	//*  11   15:ifge            21
			return 10;
	//   12   18:bipush          10
	//   13   20:ireturn         
		int j1;
		if((0x0L & l1) != 0L)
	//*  14   21:ldc2w           #171 <Long 0x0L>
	//*  15   24:lload_0         
	//*  16   25:land            
	//*  17   26:lconst_0        
	//*  18   27:lcmp            
	//*  19   28:ifeq            42
		{
			j1 = 6;
	//   20   31:bipush          6
	//   21   33:istore_3        
			l1 >>>= 28;
	//   22   34:lload_0         
	//   23   35:bipush          28
	//   24   37:lushr           
	//   25   38:lstore_0        
		} else
	//*  26   39:goto            44
		{
			j1 = 2;
	//   27   42:iconst_2        
	//   28   43:istore_3        
		}
		int i1 = j1;
	//   29   44:iload_3         
	//   30   45:istore_2        
		long l2 = l1;
	//   31   46:lload_0         
	//   32   47:lstore          4
		if((0xffe00000L & l1) != 0L)
	//*  33   49:ldc2w           #173 <Long 0xffe00000L>
	//*  34   52:lload_0         
	//*  35   53:land            
	//*  36   54:lconst_0        
	//*  37   55:lcmp            
	//*  38   56:ifeq            69
		{
			i1 = j1 + 2;
	//   39   59:iload_3         
	//   40   60:iconst_2        
	//   41   61:iadd            
	//   42   62:istore_2        
			l2 = l1 >>> 14;
	//   43   63:lload_0         
	//   44   64:bipush          14
	//   45   66:lushr           
	//   46   67:lstore          4
		}
		j1 = i1;
	//   47   69:iload_2         
	//   48   70:istore_3        
		if((l2 & -16384L) != 0L)
	//*  49   71:lload           4
	//*  50   73:ldc2w           #175 <Long -16384L>
	//*  51   76:land            
	//*  52   77:lconst_0        
	//*  53   78:lcmp            
	//*  54   79:ifeq            86
			j1 = i1 + 1;
	//   55   82:iload_2         
	//   56   83:iconst_1        
	//   57   84:iadd            
	//   58   85:istore_3        
		return j1;
	//   59   86:iload_3         
	//   60   87:ireturn         
	}

	public static int f(int i1)
	{
		if(i1 >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
			return g(i1);
	//    2    4:iload_0         
	//    3    5:invokestatic    #52  <Method int g(int)>
	//    4    8:ireturn         
		else
			return 10;
	//    5    9:bipush          10
	//    6   11:ireturn         
	}

	public static int f(int i1, int j1)
	{
		return e(i1) + f(j1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #179 <Method int f(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int f(int i1, long l1)
	{
		return e(i1) + e(i(l1));
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #183 <Method long i(long)>
	//    4    8:invokestatic    #164 <Method int e(long)>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	public static int f(long l1)
	{
		return e(i(l1));
	//    0    0:lload_0         
	//    1    1:invokestatic    #183 <Method long i(long)>
	//    2    4:invokestatic    #164 <Method int e(long)>
	//    3    7:ireturn         
	}

	public static int g(int i1)
	{
		if((i1 & 0xffffff80) == 0)
	//*   0    0:iload_0         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            9
			return 1;
	//    4    7:iconst_1        
	//    5    8:ireturn         
		if((i1 & 0xffffc000) == 0)
	//*   6    9:iload_0         
	//*   7   10:sipush          -16384
	//*   8   13:iand            
	//*   9   14:ifne            19
			return 2;
	//   10   17:iconst_2        
	//   11   18:ireturn         
		if((0xffe00000 & i1) == 0)
	//*  12   19:ldc1            #184 <Int 0xffe00000>
	//*  13   21:iload_0         
	//*  14   22:iand            
	//*  15   23:ifne            28
			return 3;
	//   16   26:iconst_3        
	//   17   27:ireturn         
		return (i1 & 0xf0000000) != 0 ? 5 : 4;
	//   18   28:iload_0         
	//   19   29:ldc1            #185 <Int 0xf0000000>
	//   20   31:iand            
	//   21   32:ifne            37
	//   22   35:iconst_4        
	//   23   36:ireturn         
	//   24   37:iconst_5        
	//   25   38:ireturn         
	}

	public static int g(int i1, int j1)
	{
		return e(i1) + g(j1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #52  <Method int g(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int g(int i1, long l1)
	{
		return e(i1) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int g(long l1)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int h(int i1)
	{
		return g(m(i1));
	//    0    0:iload_0         
	//    1    1:invokestatic    #189 <Method int m(int)>
	//    2    4:invokestatic    #52  <Method int g(int)>
	//    3    7:ireturn         
	}

	public static int h(int i1, int j1)
	{
		return e(i1) + g(m(j1));
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #189 <Method int m(int)>
	//    4    8:invokestatic    #52  <Method int g(int)>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	public static int h(int i1, long l1)
	{
		return e(i1) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int h(long l1)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int i(int i1)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int i(int i1, int j1)
	{
		return e(i1) + 4;
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	private static long i(long l1)
	{
		return l1 >> 63 ^ l1 << 1;
	//    0    0:lload_0         
	//    1    1:bipush          63
	//    2    3:lshr            
	//    3    4:lload_0         
	//    4    5:iconst_1        
	//    5    6:lshl            
	//    6    7:lxor            
	//    7    8:lreturn         
	}

	public static int j(int i1)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int j(int i1, int j1)
	{
		return e(i1) + 4;
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int k(int i1)
	{
		return f(i1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #179 <Method int f(int)>
	//    2    4:ireturn         
	}

	public static int k(int i1, int j1)
	{
		return e(i1) + f(j1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #44  <Method int e(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #179 <Method int f(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int l(int i1)
	{
		return g(i1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #52  <Method int g(int)>
	//    2    4:ireturn         
	}

	private static int m(int i1)
	{
		return i1 >> 31 ^ i1 << 1;
	//    0    0:iload_0         
	//    1    1:bipush          31
	//    2    3:ishr            
	//    3    4:iload_0         
	//    4    5:iconst_1        
	//    5    6:ishl            
	//    6    7:ixor            
	//    7    8:ireturn         
	}

	public abstract void a();

	public abstract void a(byte byte0);

	public final void a(double d1)
	{
		c(Double.doubleToRawLongBits(d1));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #198 <Method long Double.doubleToRawLongBits(double)>
	//    3    5:invokevirtual   #201 <Method void c(long)>
	//    4    8:return          
	}

	public final void a(float f1)
	{
		d(Float.floatToRawIntBits(f1));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #207 <Method int Float.floatToRawIntBits(float)>
	//    3    5:invokevirtual   #209 <Method void d(int)>
	//    4    8:return          
	}

	public abstract void a(int i1);

	public final void a(int i1, double d1)
	{
		c(i1, Double.doubleToRawLongBits(d1));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #198 <Method long Double.doubleToRawLongBits(double)>
	//    4    6:invokevirtual   #213 <Method void c(int, long)>
	//    5    9:return          
	}

	public final void a(int i1, float f1)
	{
		e(i1, Float.floatToRawIntBits(f1));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:fload_2         
	//    3    3:invokestatic    #207 <Method int Float.floatToRawIntBits(float)>
	//    4    6:invokevirtual   #217 <Method void e(int, int)>
	//    5    9:return          
	}

	public abstract void a(int i1, int j1);

	public abstract void a(int i1, long l1);

	public abstract void a(int i1, aqq aqq1);

	public abstract void a(int i1, atv atv1);

	abstract void a(int i1, atv atv1, aun aun1);

	public abstract void a(int i1, String s);

	public abstract void a(int i1, boolean flag);

	public abstract void a(long l1);

	public abstract void a(aqq aqq1);

	public abstract void a(atv atv1);

	abstract void a(atv atv1, aun aun1);

	public abstract void a(String s);

	final void a(String s, avw avw1)
	{
		b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ((Throwable) (avw1)));
	//    0    0:getstatic       #26  <Field Logger b>
	//    1    3:getstatic       #236 <Field Level Level.WARNING>
	//    2    6:ldc1            #238 <String "com.google.protobuf.CodedOutputStream">
	//    3    8:ldc1            #240 <String "inefficientWriteStringNoTag">
	//    4   10:ldc1            #242 <String "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!">
	//    5   12:aload_2         
	//    6   13:invokevirtual   #246 <Method void Logger.logp(Level, String, String, String, Throwable)>
		s = ((String) (s.getBytes(aso.a)));
	//    7   16:aload_1         
	//    8   17:getstatic       #145 <Field java.nio.charset.Charset aso.a>
	//    9   20:invokevirtual   #151 <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   10   23:astore_1        
		try
		{
			b(s.length);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:arraylength     
	//   14   27:invokevirtual   #248 <Method void b(int)>
			((aqp)this).a(((byte []) (s)), 0, s.length);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:iconst_0        
	//   18   33:aload_1         
	//   19   34:arraylength     
	//   20   35:invokevirtual   #250 <Method void aqp.a(byte[], int, int)>
			return;
	//   21   38:return          
		}
	//*  22   39:astore_1        
	//*  23   40:aload_1         
	//*  24   41:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  25   42:astore_1        
		{
			throw new ark(((Throwable) (s)));
	//   26   43:new             #230 <Class ark>
	//   27   46:dup             
	//   28   47:aload_1         
	//   29   48:invokespecial   #253 <Method void ark(Throwable)>
	//   30   51:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw s;
		}
	}

	public final void a(boolean flag)
	{
		a((byte)flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:int2byte        
	//    3    3:invokevirtual   #256 <Method void a(byte)>
	//    4    6:return          
	}

	public abstract int b();

	public abstract void b(int i1);

	public abstract void b(int i1, int j1);

	public final void b(int i1, long l1)
	{
		a(i1, i(l1));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #183 <Method long i(long)>
	//    4    6:invokevirtual   #258 <Method void a(int, long)>
	//    5    9:return          
	}

	public abstract void b(int i1, aqq aqq1);

	public abstract void b(int i1, atv atv1);

	public final void b(long l1)
	{
		a(i(l1));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #183 <Method long i(long)>
	//    3    5:invokevirtual   #260 <Method void a(long)>
	//    4    8:return          
	}

	public abstract void b(byte abyte0[], int i1, int j1);

	public final void c()
	{
		if(b() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #261 <Method int b()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("Did not write as much data as expected.");
	//    4    8:new             #263 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc2            #265 <String "Did not write as much data as expected.">
	//    7   15:invokespecial   #266 <Method void IllegalStateException(String)>
	//    8   18:athrow          
	}

	public final void c(int i1)
	{
		b(m(i1));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #189 <Method int m(int)>
	//    3    5:invokevirtual   #248 <Method void b(int)>
	//    4    8:return          
	}

	public abstract void c(int i1, int j1);

	public abstract void c(int i1, long l1);

	public abstract void c(long l1);

	abstract void c(byte abyte0[], int i1, int j1);

	public abstract void d(int i1);

	public final void d(int i1, int j1)
	{
		c(i1, m(j1));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #189 <Method int m(int)>
	//    4    6:invokevirtual   #268 <Method void c(int, int)>
	//    5    9:return          
	}

	public abstract void e(int i1, int j1);

	private static final Logger b = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/arh)).getName());
	private static final boolean c = avm.a();
	aro a;

	static 
	{
	//    0    0:ldc1            #2   <Class arh>
	//    1    2:invokevirtual   #18  <Method String Class.getName()>
	//    2    5:invokestatic    #24  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #26  <Field Logger b>
	//    4   11:invokestatic    #31  <Method boolean avm.a()>
	//    5   14:putstatic       #33  <Field boolean c>
	//*   6   17:return          
	}
}
