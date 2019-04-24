// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxs, zzbxw, zzbxr, zzbxt

public final class zzbxl
{

	private zzbxl(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		zzcuD = 0x7fffffff;
	//    2    4:aload_0         
	//    3    5:ldc1            #22  <Int 0x7fffffff>
	//    4    7:putfield        #24  <Field int zzcuD>
		zzcuF = 64;
	//    5   10:aload_0         
	//    6   11:bipush          64
	//    7   13:putfield        #26  <Field int zzcuF>
		zzcuG = 0x4000000;
	//    8   16:aload_0         
	//    9   17:ldc1            #27  <Int 0x4000000>
	//   10   19:putfield        #29  <Field int zzcuG>
		buffer = abyte0;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #31  <Field byte[] buffer>
		zzcuy = i;
	//   14   27:aload_0         
	//   15   28:iload_2         
	//   16   29:putfield        #33  <Field int zzcuy>
		zzcuz = i + j;
	//   17   32:aload_0         
	//   18   33:iload_2         
	//   19   34:iload_3         
	//   20   35:iadd            
	//   21   36:putfield        #35  <Field int zzcuz>
		zzcuB = i;
	//   22   39:aload_0         
	//   23   40:iload_2         
	//   24   41:putfield        #37  <Field int zzcuB>
	//   25   44:return          
	}

	public static long zzaZ(long l)
	{
		return l >>> 1 ^ -(1L & l);
	//    0    0:lload_0         
	//    1    1:iconst_1        
	//    2    2:lushr           
	//    3    3:lconst_1        
	//    4    4:lload_0         
	//    5    5:land            
	//    6    6:lneg            
	//    7    7:lxor            
	//    8    8:lreturn         
	}

	private void zzaeB()
	{
		zzcuz = zzcuz + zzcuA;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field int zzcuz>
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field int zzcuA>
	//    5    9:iadd            
	//    6   10:putfield        #35  <Field int zzcuz>
		int i = zzcuz;
	//    7   13:aload_0         
	//    8   14:getfield        #35  <Field int zzcuz>
	//    9   17:istore_1        
		if(i > zzcuD)
	//*  10   18:iload_1         
	//*  11   19:aload_0         
	//*  12   20:getfield        #24  <Field int zzcuD>
	//*  13   23:icmple          50
		{
			zzcuA = i - zzcuD;
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #24  <Field int zzcuD>
	//   18   32:isub            
	//   19   33:putfield        #43  <Field int zzcuA>
			zzcuz = zzcuz - zzcuA;
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:getfield        #35  <Field int zzcuz>
	//   23   41:aload_0         
	//   24   42:getfield        #43  <Field int zzcuA>
	//   25   45:isub            
	//   26   46:putfield        #35  <Field int zzcuz>
			return;
	//   27   49:return          
		} else
		{
			zzcuA = 0;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #43  <Field int zzcuA>
			return;
	//   31   55:return          
		}
	}

	public static zzbxl zzaf(byte abyte0[])
	{
		return zzb(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #49  <Method zzbxl zzb(byte[], int, int)>
	//    5    7:areturn         
	}

	public static zzbxl zzb(byte abyte0[], int i, int j)
	{
		return new zzbxl(abyte0, i, j);
	//    0    0:new             #2   <Class zzbxl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #51  <Method void zzbxl(byte[], int, int)>
	//    6   10:areturn         
	}

	public static int zzqZ(int i)
	{
		return i >>> 1 ^ -(i & 1);
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:iushr           
	//    3    3:iload_0         
	//    4    4:iconst_1        
	//    5    5:iand            
	//    6    6:ineg            
	//    7    7:ixor            
	//    8    8:ireturn         
	}

	public int getPosition()
	{
		return zzcuB - zzcuy;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int zzcuB>
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field int zzcuy>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public byte[] readBytes()
		throws IOException
	{
		int i = zzaex();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzaex()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            13
			throw zzbxs.zzaeM();
	//    5    9:invokestatic    #68  <Method zzbxs zzbxs.zzaeM()>
	//    6   12:athrow          
		if(i == 0)
	//*   7   13:iload_1         
	//*   8   14:ifne            21
			return zzbxw.zzcvd;
	//    9   17:getstatic       #73  <Field byte[] zzbxw.zzcvd>
	//   10   20:areturn         
		if(i > zzcuz - zzcuB)
	//*  11   21:iload_1         
	//*  12   22:aload_0         
	//*  13   23:getfield        #35  <Field int zzcuz>
	//*  14   26:aload_0         
	//*  15   27:getfield        #37  <Field int zzcuB>
	//*  16   30:isub            
	//*  17   31:icmple          38
		{
			throw zzbxs.zzaeL();
	//   18   34:invokestatic    #76  <Method zzbxs zzbxs.zzaeL()>
	//   19   37:athrow          
		} else
		{
			byte abyte0[] = new byte[i];
	//   20   38:iload_1         
	//   21   39:newarray        byte[]
	//   22   41:astore_2        
			System.arraycopy(((Object) (buffer)), zzcuB, ((Object) (abyte0)), 0, i);
	//   23   42:aload_0         
	//   24   43:getfield        #31  <Field byte[] buffer>
	//   25   46:aload_0         
	//   26   47:getfield        #37  <Field int zzcuB>
	//   27   50:aload_2         
	//   28   51:iconst_0        
	//   29   52:iload_1         
	//   30   53:invokestatic    #82  <Method void System.arraycopy(Object, int, Object, int, int)>
			zzcuB = zzcuB + i;
	//   31   56:aload_0         
	//   32   57:aload_0         
	//   33   58:getfield        #37  <Field int zzcuB>
	//   34   61:iload_1         
	//   35   62:iadd            
	//   36   63:putfield        #37  <Field int zzcuB>
			return abyte0;
	//   37   66:aload_2         
	//   38   67:areturn         
		}
	}

	public double readDouble()
		throws IOException
	{
		return Double.longBitsToDouble(zzaeA());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method long zzaeA()>
	//    2    4:invokestatic    #95  <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public float readFloat()
		throws IOException
	{
		return Float.intBitsToFloat(zzaez());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method int zzaez()>
	//    2    4:invokestatic    #106 <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public String readString()
		throws IOException
	{
		int i = zzaex();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzaex()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            13
			throw zzbxs.zzaeM();
	//    5    9:invokestatic    #68  <Method zzbxs zzbxs.zzaeM()>
	//    6   12:athrow          
		if(i > zzcuz - zzcuB)
	//*   7   13:iload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #35  <Field int zzcuz>
	//*  10   18:aload_0         
	//*  11   19:getfield        #37  <Field int zzcuB>
	//*  12   22:isub            
	//*  13   23:icmple          30
		{
			throw zzbxs.zzaeL();
	//   14   26:invokestatic    #76  <Method zzbxs zzbxs.zzaeL()>
	//   15   29:athrow          
		} else
		{
			String s = new String(buffer, zzcuB, i, zzbxr.UTF_8);
	//   16   30:new             #110 <Class String>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:getfield        #31  <Field byte[] buffer>
	//   20   38:aload_0         
	//   21   39:getfield        #37  <Field int zzcuB>
	//   22   42:iload_1         
	//   23   43:getstatic       #116 <Field java.nio.charset.Charset zzbxr.UTF_8>
	//   24   46:invokespecial   #119 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   25   49:astore_2        
			zzcuB = zzcuB + i;
	//   26   50:aload_0         
	//   27   51:aload_0         
	//   28   52:getfield        #37  <Field int zzcuB>
	//   29   55:iload_1         
	//   30   56:iadd            
	//   31   57:putfield        #37  <Field int zzcuB>
			return s;
	//   32   60:aload_2         
	//   33   61:areturn         
		}
	}

	public byte[] zzI(int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
		{
			return zzbxw.zzcvd;
	//    2    4:getstatic       #73  <Field byte[] zzbxw.zzcvd>
	//    3    7:areturn         
		} else
		{
			byte abyte0[] = new byte[j];
	//    4    8:iload_2         
	//    5    9:newarray        byte[]
	//    6   11:astore          4
			int k = zzcuy;
	//    7   13:aload_0         
	//    8   14:getfield        #33  <Field int zzcuy>
	//    9   17:istore_3        
			System.arraycopy(((Object) (buffer)), k + i, ((Object) (abyte0)), 0, j);
	//   10   18:aload_0         
	//   11   19:getfield        #31  <Field byte[] buffer>
	//   12   22:iload_3         
	//   13   23:iload_1         
	//   14   24:iadd            
	//   15   25:aload           4
	//   16   27:iconst_0        
	//   17   28:iload_2         
	//   18   29:invokestatic    #82  <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte0;
	//   19   32:aload           4
	//   20   34:areturn         
		}
	}

	public void zza(zzbxt zzbxt1)
		throws IOException
	{
		int i = zzaex();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzaex()>
	//    2    4:istore_2        
		if(zzcuE >= zzcuF)
	//*   3    5:aload_0         
	//*   4    6:getfield        #125 <Field int zzcuE>
	//*   5    9:aload_0         
	//*   6   10:getfield        #26  <Field int zzcuF>
	//*   7   13:icmplt          20
		{
			throw zzbxs.zzaeR();
	//    8   16:invokestatic    #128 <Method zzbxs zzbxs.zzaeR()>
	//    9   19:athrow          
		} else
		{
			i = zzra(i);
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #131 <Method int zzra(int)>
	//   13   25:istore_2        
			zzcuE = zzcuE + 1;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #125 <Field int zzcuE>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #125 <Field int zzcuE>
			zzbxt1.zzb(this);
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #136 <Method zzbxt zzbxt.zzb(zzbxl)>
	//   23   41:pop             
			zzqX(0);
	//   24   42:aload_0         
	//   25   43:iconst_0        
	//   26   44:invokevirtual   #140 <Method void zzqX(int)>
			zzcuE = zzcuE - 1;
	//   27   47:aload_0         
	//   28   48:aload_0         
	//   29   49:getfield        #125 <Field int zzcuE>
	//   30   52:iconst_1        
	//   31   53:isub            
	//   32   54:putfield        #125 <Field int zzcuE>
			zzrb(i);
	//   33   57:aload_0         
	//   34   58:iload_2         
	//   35   59:invokevirtual   #143 <Method void zzrb(int)>
			return;
	//   36   62:return          
		}
	}

	public void zza(zzbxt zzbxt1, int i)
		throws IOException
	{
		if(zzcuE >= zzcuF)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field int zzcuE>
	//*   2    4:aload_0         
	//*   3    5:getfield        #26  <Field int zzcuF>
	//*   4    8:icmplt          15
		{
			throw zzbxs.zzaeR();
	//    5   11:invokestatic    #128 <Method zzbxs zzbxs.zzaeR()>
	//    6   14:athrow          
		} else
		{
			zzcuE = zzcuE + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #125 <Field int zzcuE>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #125 <Field int zzcuE>
			zzbxt1.zzb(this);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #136 <Method zzbxt zzbxt.zzb(zzbxl)>
	//   16   30:pop             
			zzqX(zzbxw.zzO(i, 4));
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:iconst_4        
	//   20   34:invokestatic    #148 <Method int zzbxw.zzO(int, int)>
	//   21   37:invokevirtual   #140 <Method void zzqX(int)>
			zzcuE = zzcuE - 1;
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #125 <Field int zzcuE>
	//   25   45:iconst_1        
	//   26   46:isub            
	//   27   47:putfield        #125 <Field int zzcuE>
			return;
	//   28   50:return          
		}
	}

	public long zzaeA()
		throws IOException
	{
		int i = ((int) (zzaeE()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #152 <Method byte zzaeE()>
	//    2    4:istore_1        
		int j = ((int) (zzaeE()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #152 <Method byte zzaeE()>
	//    5    9:istore_2        
		int k = ((int) (zzaeE()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #152 <Method byte zzaeE()>
	//    8   14:istore_3        
		int l = ((int) (zzaeE()));
	//    9   15:aload_0         
	//   10   16:invokevirtual   #152 <Method byte zzaeE()>
	//   11   19:istore          4
		int i1 = ((int) (zzaeE()));
	//   12   21:aload_0         
	//   13   22:invokevirtual   #152 <Method byte zzaeE()>
	//   14   25:istore          5
		int j1 = ((int) (zzaeE()));
	//   15   27:aload_0         
	//   16   28:invokevirtual   #152 <Method byte zzaeE()>
	//   17   31:istore          6
		int k1 = ((int) (zzaeE()));
	//   18   33:aload_0         
	//   19   34:invokevirtual   #152 <Method byte zzaeE()>
	//   20   37:istore          7
		int l1 = ((int) (zzaeE()));
	//   21   39:aload_0         
	//   22   40:invokevirtual   #152 <Method byte zzaeE()>
	//   23   43:istore          8
		return (long)i & 255L | ((long)j & 255L) << 8 | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
	//   24   45:iload_1         
	//   25   46:i2l             
	//   26   47:ldc2w           #153 <Long 255L>
	//   27   50:land            
	//   28   51:iload_2         
	//   29   52:i2l             
	//   30   53:ldc2w           #153 <Long 255L>
	//   31   56:land            
	//   32   57:bipush          8
	//   33   59:lshl            
	//   34   60:lor             
	//   35   61:iload_3         
	//   36   62:i2l             
	//   37   63:ldc2w           #153 <Long 255L>
	//   38   66:land            
	//   39   67:bipush          16
	//   40   69:lshl            
	//   41   70:lor             
	//   42   71:iload           4
	//   43   73:i2l             
	//   44   74:ldc2w           #153 <Long 255L>
	//   45   77:land            
	//   46   78:bipush          24
	//   47   80:lshl            
	//   48   81:lor             
	//   49   82:iload           5
	//   50   84:i2l             
	//   51   85:ldc2w           #153 <Long 255L>
	//   52   88:land            
	//   53   89:bipush          32
	//   54   91:lshl            
	//   55   92:lor             
	//   56   93:iload           6
	//   57   95:i2l             
	//   58   96:ldc2w           #153 <Long 255L>
	//   59   99:land            
	//   60  100:bipush          40
	//   61  102:lshl            
	//   62  103:lor             
	//   63  104:iload           7
	//   64  106:i2l             
	//   65  107:ldc2w           #153 <Long 255L>
	//   66  110:land            
	//   67  111:bipush          48
	//   68  113:lshl            
	//   69  114:lor             
	//   70  115:iload           8
	//   71  117:i2l             
	//   72  118:ldc2w           #153 <Long 255L>
	//   73  121:land            
	//   74  122:bipush          56
	//   75  124:lshl            
	//   76  125:lor             
	//   77  126:lreturn         
	}

	public int zzaeC()
	{
		if(zzcuD == 0x7fffffff)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field int zzcuD>
	//*   2    4:ldc1            #22  <Int 0x7fffffff>
	//*   3    6:icmpne          11
		{
			return -1;
	//    4    9:iconst_m1       
	//    5   10:ireturn         
		} else
		{
			int i = zzcuB;
	//    6   11:aload_0         
	//    7   12:getfield        #37  <Field int zzcuB>
	//    8   15:istore_1        
			return zzcuD - i;
	//    9   16:aload_0         
	//   10   17:getfield        #24  <Field int zzcuD>
	//   11   20:iload_1         
	//   12   21:isub            
	//   13   22:ireturn         
		}
	}

	public boolean zzaeD()
	{
		return zzcuB == zzcuz;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int zzcuB>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field int zzcuz>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public byte zzaeE()
		throws IOException
	{
		if(zzcuB == zzcuz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field int zzcuB>
	//*   2    4:aload_0         
	//*   3    5:getfield        #35  <Field int zzcuz>
	//*   4    8:icmpne          15
		{
			throw zzbxs.zzaeL();
	//    5   11:invokestatic    #76  <Method zzbxs zzbxs.zzaeL()>
	//    6   14:athrow          
		} else
		{
			byte abyte0[] = buffer;
	//    7   15:aload_0         
	//    8   16:getfield        #31  <Field byte[] buffer>
	//    9   19:astore_2        
			int i = zzcuB;
	//   10   20:aload_0         
	//   11   21:getfield        #37  <Field int zzcuB>
	//   12   24:istore_1        
			zzcuB = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #37  <Field int zzcuB>
			return abyte0[i];
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:baload          
	//   21   35:ireturn         
		}
	}

	public int zzaeo()
		throws IOException
	{
		if(zzaeD())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #160 <Method boolean zzaeD()>
	//*   2    4:ifeq            14
		{
			zzcuC = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #162 <Field int zzcuC>
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		zzcuC = zzaex();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #62  <Method int zzaex()>
	//   11   19:putfield        #162 <Field int zzcuC>
		if(zzcuC == 0)
	//*  12   22:aload_0         
	//*  13   23:getfield        #162 <Field int zzcuC>
	//*  14   26:ifne            33
			throw zzbxs.zzaeO();
	//   15   29:invokestatic    #165 <Method zzbxs zzbxs.zzaeO()>
	//   16   32:athrow          
		else
			return zzcuC;
	//   17   33:aload_0         
	//   18   34:getfield        #162 <Field int zzcuC>
	//   19   37:ireturn         
	}

	public void zzaep()
		throws IOException
	{
		int i;
		do
			i = zzaeo();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method int zzaeo()>
	//    2    4:istore_1        
		while(i != 0 && zzqY(i));
	//    3    5:iload_1         
	//    4    6:ifeq            17
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #172 <Method boolean zzqY(int)>
	//    8   14:ifne            18
	//    9   17:return          
	//*  10   18:goto            0
	}

	public long zzaeq()
		throws IOException
	{
		return zzaey();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #176 <Method long zzaey()>
	//    2    4:lreturn         
	}

	public long zzaer()
		throws IOException
	{
		return zzaey();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #176 <Method long zzaey()>
	//    2    4:lreturn         
	}

	public int zzaes()
		throws IOException
	{
		return zzaex();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzaex()>
	//    2    4:ireturn         
	}

	public long zzaet()
		throws IOException
	{
		return zzaeA();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method long zzaeA()>
	//    2    4:lreturn         
	}

	public boolean zzaeu()
		throws IOException
	{
		return zzaex() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzaex()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int zzaev()
		throws IOException
	{
		return zzqZ(zzaex());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzaex()>
	//    2    4:invokestatic    #183 <Method int zzqZ(int)>
	//    3    7:ireturn         
	}

	public long zzaew()
		throws IOException
	{
		return zzaZ(zzaey());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #176 <Method long zzaey()>
	//    2    4:invokestatic    #186 <Method long zzaZ(long)>
	//    3    7:lreturn         
	}

	public int zzaex()
		throws IOException
	{
		int i = ((int) (zzaeE()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #152 <Method byte zzaeE()>
	//    2    4:istore_1        
		if(i >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            11
			return i;
	//    5    9:iload_1         
	//    6   10:ireturn         
		i &= 0x7f;
	//    7   11:iload_1         
	//    8   12:bipush          127
	//    9   14:iand            
	//   10   15:istore_1        
		int k = ((int) (zzaeE()));
	//   11   16:aload_0         
	//   12   17:invokevirtual   #152 <Method byte zzaeE()>
	//   13   20:istore_2        
		if(k >= 0)
	//*  14   21:iload_2         
	//*  15   22:iflt            32
			return i | k << 7;
	//   16   25:iload_1         
	//   17   26:iload_2         
	//   18   27:bipush          7
	//   19   29:ishl            
	//   20   30:ior             
	//   21   31:ireturn         
		i |= (k & 0x7f) << 7;
	//   22   32:iload_1         
	//   23   33:iload_2         
	//   24   34:bipush          127
	//   25   36:iand            
	//   26   37:bipush          7
	//   27   39:ishl            
	//   28   40:ior             
	//   29   41:istore_1        
		k = ((int) (zzaeE()));
	//   30   42:aload_0         
	//   31   43:invokevirtual   #152 <Method byte zzaeE()>
	//   32   46:istore_2        
		if(k >= 0)
	//*  33   47:iload_2         
	//*  34   48:iflt            58
			return i | k << 14;
	//   35   51:iload_1         
	//   36   52:iload_2         
	//   37   53:bipush          14
	//   38   55:ishl            
	//   39   56:ior             
	//   40   57:ireturn         
		k = i | (k & 0x7f) << 14;
	//   41   58:iload_1         
	//   42   59:iload_2         
	//   43   60:bipush          127
	//   44   62:iand            
	//   45   63:bipush          14
	//   46   65:ishl            
	//   47   66:ior             
	//   48   67:istore_2        
		byte byte0 = zzaeE();
	//   49   68:aload_0         
	//   50   69:invokevirtual   #152 <Method byte zzaeE()>
	//   51   72:istore_3        
		if(byte0 >= 0)
	//*  52   73:iload_3         
	//*  53   74:iflt            84
			return k | byte0 << 21;
	//   54   77:iload_2         
	//   55   78:iload_3         
	//   56   79:bipush          21
	//   57   81:ishl            
	//   58   82:ior             
	//   59   83:ireturn         
		i = ((int) (zzaeE()));
	//   60   84:aload_0         
	//   61   85:invokevirtual   #152 <Method byte zzaeE()>
	//   62   88:istore_1        
		k = k | (byte0 & 0x7f) << 21 | i << 28;
	//   63   89:iload_2         
	//   64   90:iload_3         
	//   65   91:bipush          127
	//   66   93:iand            
	//   67   94:bipush          21
	//   68   96:ishl            
	//   69   97:ior             
	//   70   98:iload_1         
	//   71   99:bipush          28
	//   72  101:ishl            
	//   73  102:ior             
	//   74  103:istore_2        
		if(i < 0)
	//*  75  104:iload_1         
	//*  76  105:ifge            135
		{
			for(int j = 0; j < 5; j++)
	//*  77  108:iconst_0        
	//*  78  109:istore_1        
	//*  79  110:iload_1         
	//*  80  111:iconst_5        
	//*  81  112:icmpge          131
				if(zzaeE() >= 0)
	//*  82  115:aload_0         
	//*  83  116:invokevirtual   #152 <Method byte zzaeE()>
	//*  84  119:iflt            124
					return k;
	//   85  122:iload_2         
	//   86  123:ireturn         

	//   87  124:iload_1         
	//   88  125:iconst_1        
	//   89  126:iadd            
	//   90  127:istore_1        
	//*  91  128:goto            110
			throw zzbxs.zzaeN();
	//   92  131:invokestatic    #189 <Method zzbxs zzbxs.zzaeN()>
	//   93  134:athrow          
		} else
		{
			return k;
	//   94  135:iload_2         
	//   95  136:ireturn         
		}
	}

	public long zzaey()
		throws IOException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		long l = 0L;
	//    2    2:lconst_0        
	//    3    3:lstore_3        
		for(; i < 64; i += 7)
	//*   4    4:iload_1         
	//*   5    5:bipush          64
	//*   6    7:icmpge          43
		{
			byte byte0 = zzaeE();
	//    7   10:aload_0         
	//    8   11:invokevirtual   #152 <Method byte zzaeE()>
	//    9   14:istore_2        
			l |= (long)(byte0 & 0x7f) << i;
	//   10   15:lload_3         
	//   11   16:iload_2         
	//   12   17:bipush          127
	//   13   19:iand            
	//   14   20:i2l             
	//   15   21:iload_1         
	//   16   22:lshl            
	//   17   23:lor             
	//   18   24:lstore_3        
			if((byte0 & 0x80) == 0)
	//*  19   25:iload_2         
	//*  20   26:sipush          128
	//*  21   29:iand            
	//*  22   30:ifne            35
				return l;
	//   23   33:lload_3         
	//   24   34:lreturn         
		}

	//   25   35:iload_1         
	//   26   36:bipush          7
	//   27   38:iadd            
	//   28   39:istore_1        
	//*  29   40:goto            4
		throw zzbxs.zzaeN();
	//   30   43:invokestatic    #189 <Method zzbxs zzbxs.zzaeN()>
	//   31   46:athrow          
	}

	public int zzaez()
		throws IOException
	{
		return zzaeE() & 0xff | (zzaeE() & 0xff) << 8 | (zzaeE() & 0xff) << 16 | (zzaeE() & 0xff) << 24;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #152 <Method byte zzaeE()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:aload_0         
	//    5    9:invokevirtual   #152 <Method byte zzaeE()>
	//    6   12:sipush          255
	//    7   15:iand            
	//    8   16:bipush          8
	//    9   18:ishl            
	//   10   19:ior             
	//   11   20:aload_0         
	//   12   21:invokevirtual   #152 <Method byte zzaeE()>
	//   13   24:sipush          255
	//   14   27:iand            
	//   15   28:bipush          16
	//   16   30:ishl            
	//   17   31:ior             
	//   18   32:aload_0         
	//   19   33:invokevirtual   #152 <Method byte zzaeE()>
	//   20   36:sipush          255
	//   21   39:iand            
	//   22   40:bipush          24
	//   23   42:ishl            
	//   24   43:ior             
	//   25   44:ireturn         
	}

	public void zzqX(int i)
		throws zzbxs
	{
		if(zzcuC != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field int zzcuC>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          12
			throw zzbxs.zzaeP();
	//    4    8:invokestatic    #192 <Method zzbxs zzbxs.zzaeP()>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	public boolean zzqY(int i)
		throws IOException
	{
		switch(zzbxw.zzrr(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #195 <Method int zzbxw.zzrr(int)>
		{
	//*   2    4:tableswitch     0 5: default 44
	//	               0 47
	//	               1 54
	//	               2 61
	//	               3 71
	//	               4 89
	//	               5 91
	//*   3   44:goto            98
		case 0: // '\0'
			zzaes();
	//    4   47:aload_0         
	//    5   48:invokevirtual   #197 <Method int zzaes()>
	//    6   51:pop             
			return true;
	//    7   52:iconst_1        
	//    8   53:ireturn         

		case 1: // '\001'
			zzaeA();
	//    9   54:aload_0         
	//   10   55:invokevirtual   #89  <Method long zzaeA()>
	//   11   58:pop2            
			return true;
	//   12   59:iconst_1        
	//   13   60:ireturn         

		case 2: // '\002'
			zzrd(zzaex());
	//   14   61:aload_0         
	//   15   62:aload_0         
	//   16   63:invokevirtual   #62  <Method int zzaex()>
	//   17   66:invokevirtual   #200 <Method void zzrd(int)>
			return true;
	//   18   69:iconst_1        
	//   19   70:ireturn         

		case 3: // '\003'
			zzaep();
	//   20   71:aload_0         
	//   21   72:invokevirtual   #202 <Method void zzaep()>
			zzqX(zzbxw.zzO(zzbxw.zzrs(i), 4));
	//   22   75:aload_0         
	//   23   76:iload_1         
	//   24   77:invokestatic    #205 <Method int zzbxw.zzrs(int)>
	//   25   80:iconst_4        
	//   26   81:invokestatic    #148 <Method int zzbxw.zzO(int, int)>
	//   27   84:invokevirtual   #140 <Method void zzqX(int)>
			return true;
	//   28   87:iconst_1        
	//   29   88:ireturn         

		case 4: // '\004'
			return false;
	//   30   89:iconst_0        
	//   31   90:ireturn         

		case 5: // '\005'
			zzaez();
	//   32   91:aload_0         
	//   33   92:invokevirtual   #100 <Method int zzaez()>
	//   34   95:pop             
			return true;
	//   35   96:iconst_1        
	//   36   97:ireturn         
		}
		throw zzbxs.zzaeQ();
	//   37   98:invokestatic    #208 <Method zzbxs zzbxs.zzaeQ()>
	//   38  101:athrow          
	}

	public int zzra(int i)
		throws zzbxs
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw zzbxs.zzaeM();
	//    2    4:invokestatic    #68  <Method zzbxs zzbxs.zzaeM()>
	//    3    7:athrow          
		i += zzcuB;
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field int zzcuB>
	//    7   13:iadd            
	//    8   14:istore_1        
		int j = zzcuD;
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field int zzcuD>
	//   11   19:istore_2        
		if(i > j)
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmple          29
		{
			throw zzbxs.zzaeL();
	//   15   25:invokestatic    #76  <Method zzbxs zzbxs.zzaeL()>
	//   16   28:athrow          
		} else
		{
			zzcuD = i;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:putfield        #24  <Field int zzcuD>
			zzaeB();
	//   20   34:aload_0         
	//   21   35:invokespecial   #210 <Method void zzaeB()>
			return j;
	//   22   38:iload_2         
	//   23   39:ireturn         
		}
	}

	public void zzrb(int i)
	{
		zzcuD = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int zzcuD>
		zzaeB();
	//    3    5:aload_0         
	//    4    6:invokespecial   #210 <Method void zzaeB()>
	//    5    9:return          
	}

	public void zzrc(int i)
	{
		if(i > zzcuB - zzcuy)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #37  <Field int zzcuB>
	//*   3    5:aload_0         
	//*   4    6:getfield        #33  <Field int zzcuy>
	//*   5    9:isub            
	//*   6   10:icmple          63
		{
			int j = zzcuB;
	//    7   13:aload_0         
	//    8   14:getfield        #37  <Field int zzcuB>
	//    9   17:istore_2        
			int k = zzcuy;
	//   10   18:aload_0         
	//   11   19:getfield        #33  <Field int zzcuy>
	//   12   22:istore_3        
			throw new IllegalArgumentException((new StringBuilder(50)).append("Position ").append(i).append(" is beyond current ").append(j - k).toString());
	//   13   23:new             #213 <Class IllegalArgumentException>
	//   14   26:dup             
	//   15   27:new             #215 <Class StringBuilder>
	//   16   30:dup             
	//   17   31:bipush          50
	//   18   33:invokespecial   #217 <Method void StringBuilder(int)>
	//   19   36:ldc1            #219 <String "Position ">
	//   20   38:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:iload_1         
	//   22   42:invokevirtual   #226 <Method StringBuilder StringBuilder.append(int)>
	//   23   45:ldc1            #228 <String " is beyond current ">
	//   24   47:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:iload_2         
	//   26   51:iload_3         
	//   27   52:isub            
	//   28   53:invokevirtual   #226 <Method StringBuilder StringBuilder.append(int)>
	//   29   56:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   30   59:invokespecial   #234 <Method void IllegalArgumentException(String)>
	//   31   62:athrow          
		}
		if(i < 0)
	//*  32   63:iload_1         
	//*  33   64:ifge            96
		{
			throw new IllegalArgumentException((new StringBuilder(24)).append("Bad position ").append(i).toString());
	//   34   67:new             #213 <Class IllegalArgumentException>
	//   35   70:dup             
	//   36   71:new             #215 <Class StringBuilder>
	//   37   74:dup             
	//   38   75:bipush          24
	//   39   77:invokespecial   #217 <Method void StringBuilder(int)>
	//   40   80:ldc1            #236 <String "Bad position ">
	//   41   82:invokevirtual   #223 <Method StringBuilder StringBuilder.append(String)>
	//   42   85:iload_1         
	//   43   86:invokevirtual   #226 <Method StringBuilder StringBuilder.append(int)>
	//   44   89:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   45   92:invokespecial   #234 <Method void IllegalArgumentException(String)>
	//   46   95:athrow          
		} else
		{
			zzcuB = zzcuy + i;
	//   47   96:aload_0         
	//   48   97:aload_0         
	//   49   98:getfield        #33  <Field int zzcuy>
	//   50  101:iload_1         
	//   51  102:iadd            
	//   52  103:putfield        #37  <Field int zzcuB>
			return;
	//   53  106:return          
		}
	}

	public void zzrd(int i)
		throws IOException
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw zzbxs.zzaeM();
	//    2    4:invokestatic    #68  <Method zzbxs zzbxs.zzaeM()>
	//    3    7:athrow          
		if(zzcuB + i > zzcuD)
	//*   4    8:aload_0         
	//*   5    9:getfield        #37  <Field int zzcuB>
	//*   6   12:iload_1         
	//*   7   13:iadd            
	//*   8   14:aload_0         
	//*   9   15:getfield        #24  <Field int zzcuD>
	//*  10   18:icmple          38
		{
			zzrd(zzcuD - zzcuB);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #24  <Field int zzcuD>
	//   14   26:aload_0         
	//   15   27:getfield        #37  <Field int zzcuB>
	//   16   30:isub            
	//   17   31:invokevirtual   #200 <Method void zzrd(int)>
			throw zzbxs.zzaeL();
	//   18   34:invokestatic    #76  <Method zzbxs zzbxs.zzaeL()>
	//   19   37:athrow          
		}
		if(i <= zzcuz - zzcuB)
	//*  20   38:iload_1         
	//*  21   39:aload_0         
	//*  22   40:getfield        #35  <Field int zzcuz>
	//*  23   43:aload_0         
	//*  24   44:getfield        #37  <Field int zzcuB>
	//*  25   47:isub            
	//*  26   48:icmpgt          62
		{
			zzcuB = zzcuB + i;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #37  <Field int zzcuB>
	//   30   56:iload_1         
	//   31   57:iadd            
	//   32   58:putfield        #37  <Field int zzcuB>
			return;
	//   33   61:return          
		} else
		{
			throw zzbxs.zzaeL();
	//   34   62:invokestatic    #76  <Method zzbxs zzbxs.zzaeL()>
	//   35   65:athrow          
		}
	}

	private final byte buffer[];
	private int zzcuA;
	private int zzcuB;
	private int zzcuC;
	private int zzcuD;
	private int zzcuE;
	private int zzcuF;
	private int zzcuG;
	private int zzcuy;
	private int zzcuz;
}
