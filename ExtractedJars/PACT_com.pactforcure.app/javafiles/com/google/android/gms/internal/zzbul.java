// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbus, zzbuw, zzbur, zzbut

public final class zzbul
{

	private zzbul(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		zzcrS = 0x7fffffff;
	//    2    4:aload_0         
	//    3    5:ldc1            #22  <Int 0x7fffffff>
	//    4    7:putfield        #24  <Field int zzcrS>
		zzcrU = 64;
	//    5   10:aload_0         
	//    6   11:bipush          64
	//    7   13:putfield        #26  <Field int zzcrU>
		zzcrV = 0x4000000;
	//    8   16:aload_0         
	//    9   17:ldc1            #27  <Int 0x4000000>
	//   10   19:putfield        #29  <Field int zzcrV>
		buffer = abyte0;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #31  <Field byte[] buffer>
		zzcrN = i;
	//   14   27:aload_0         
	//   15   28:iload_2         
	//   16   29:putfield        #33  <Field int zzcrN>
		zzcrO = i + j;
	//   17   32:aload_0         
	//   18   33:iload_2         
	//   19   34:iload_3         
	//   20   35:iadd            
	//   21   36:putfield        #35  <Field int zzcrO>
		zzcrQ = i;
	//   22   39:aload_0         
	//   23   40:iload_2         
	//   24   41:putfield        #37  <Field int zzcrQ>
	//   25   44:return          
	}

	public static long zzaV(long l)
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

	private void zzacH()
	{
		zzcrO = zzcrO + zzcrP;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field int zzcrO>
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field int zzcrP>
	//    5    9:iadd            
	//    6   10:putfield        #35  <Field int zzcrO>
		int i = zzcrO;
	//    7   13:aload_0         
	//    8   14:getfield        #35  <Field int zzcrO>
	//    9   17:istore_1        
		if(i > zzcrS)
	//*  10   18:iload_1         
	//*  11   19:aload_0         
	//*  12   20:getfield        #24  <Field int zzcrS>
	//*  13   23:icmple          50
		{
			zzcrP = i - zzcrS;
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #24  <Field int zzcrS>
	//   18   32:isub            
	//   19   33:putfield        #43  <Field int zzcrP>
			zzcrO = zzcrO - zzcrP;
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:getfield        #35  <Field int zzcrO>
	//   23   41:aload_0         
	//   24   42:getfield        #43  <Field int zzcrP>
	//   25   45:isub            
	//   26   46:putfield        #35  <Field int zzcrO>
			return;
	//   27   49:return          
		} else
		{
			zzcrP = 0;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #43  <Field int zzcrP>
			return;
	//   31   55:return          
		}
	}

	public static zzbul zzad(byte abyte0[])
	{
		return zzb(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #49  <Method zzbul zzb(byte[], int, int)>
	//    5    7:areturn         
	}

	public static zzbul zzb(byte abyte0[], int i, int j)
	{
		return new zzbul(abyte0, i, j);
	//    0    0:new             #2   <Class zzbul>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #51  <Method void zzbul(byte[], int, int)>
	//    6   10:areturn         
	}

	public static int zzqi(int i)
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
		return zzcrQ - zzcrN;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int zzcrQ>
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field int zzcrN>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public byte[] readBytes()
		throws IOException
	{
		int i = zzacD();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzacD()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            13
			throw zzbus.zzacS();
	//    5    9:invokestatic    #68  <Method zzbus zzbus.zzacS()>
	//    6   12:athrow          
		if(i == 0)
	//*   7   13:iload_1         
	//*   8   14:ifne            21
			return zzbuw.zzcsp;
	//    9   17:getstatic       #73  <Field byte[] zzbuw.zzcsp>
	//   10   20:areturn         
		if(i > zzcrO - zzcrQ)
	//*  11   21:iload_1         
	//*  12   22:aload_0         
	//*  13   23:getfield        #35  <Field int zzcrO>
	//*  14   26:aload_0         
	//*  15   27:getfield        #37  <Field int zzcrQ>
	//*  16   30:isub            
	//*  17   31:icmple          38
		{
			throw zzbus.zzacR();
	//   18   34:invokestatic    #76  <Method zzbus zzbus.zzacR()>
	//   19   37:athrow          
		} else
		{
			byte abyte0[] = new byte[i];
	//   20   38:iload_1         
	//   21   39:newarray        byte[]
	//   22   41:astore_2        
			System.arraycopy(((Object) (buffer)), zzcrQ, ((Object) (abyte0)), 0, i);
	//   23   42:aload_0         
	//   24   43:getfield        #31  <Field byte[] buffer>
	//   25   46:aload_0         
	//   26   47:getfield        #37  <Field int zzcrQ>
	//   27   50:aload_2         
	//   28   51:iconst_0        
	//   29   52:iload_1         
	//   30   53:invokestatic    #82  <Method void System.arraycopy(Object, int, Object, int, int)>
			zzcrQ = i + zzcrQ;
	//   31   56:aload_0         
	//   32   57:iload_1         
	//   33   58:aload_0         
	//   34   59:getfield        #37  <Field int zzcrQ>
	//   35   62:iadd            
	//   36   63:putfield        #37  <Field int zzcrQ>
			return abyte0;
	//   37   66:aload_2         
	//   38   67:areturn         
		}
	}

	public double readDouble()
		throws IOException
	{
		return Double.longBitsToDouble(zzacG());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method long zzacG()>
	//    2    4:invokestatic    #95  <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public float readFloat()
		throws IOException
	{
		return Float.intBitsToFloat(zzacF());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method int zzacF()>
	//    2    4:invokestatic    #106 <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public String readString()
		throws IOException
	{
		int i = zzacD();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzacD()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            13
			throw zzbus.zzacS();
	//    5    9:invokestatic    #68  <Method zzbus zzbus.zzacS()>
	//    6   12:athrow          
		if(i > zzcrO - zzcrQ)
	//*   7   13:iload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #35  <Field int zzcrO>
	//*  10   18:aload_0         
	//*  11   19:getfield        #37  <Field int zzcrQ>
	//*  12   22:isub            
	//*  13   23:icmple          30
		{
			throw zzbus.zzacR();
	//   14   26:invokestatic    #76  <Method zzbus zzbus.zzacR()>
	//   15   29:athrow          
		} else
		{
			String s = new String(buffer, zzcrQ, i, zzbur.UTF_8);
	//   16   30:new             #110 <Class String>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:getfield        #31  <Field byte[] buffer>
	//   20   38:aload_0         
	//   21   39:getfield        #37  <Field int zzcrQ>
	//   22   42:iload_1         
	//   23   43:getstatic       #116 <Field java.nio.charset.Charset zzbur.UTF_8>
	//   24   46:invokespecial   #119 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   25   49:astore_2        
			zzcrQ = i + zzcrQ;
	//   26   50:aload_0         
	//   27   51:iload_1         
	//   28   52:aload_0         
	//   29   53:getfield        #37  <Field int zzcrQ>
	//   30   56:iadd            
	//   31   57:putfield        #37  <Field int zzcrQ>
			return s;
	//   32   60:aload_2         
	//   33   61:areturn         
		}
	}

	public byte[] zzE(int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
		{
			return zzbuw.zzcsp;
	//    2    4:getstatic       #73  <Field byte[] zzbuw.zzcsp>
	//    3    7:areturn         
		} else
		{
			byte abyte0[] = new byte[j];
	//    4    8:iload_2         
	//    5    9:newarray        byte[]
	//    6   11:astore          4
			int k = zzcrN;
	//    7   13:aload_0         
	//    8   14:getfield        #33  <Field int zzcrN>
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

	public void zza(zzbut zzbut1)
		throws IOException
	{
		int i = zzacD();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzacD()>
	//    2    4:istore_2        
		if(zzcrT >= zzcrU)
	//*   3    5:aload_0         
	//*   4    6:getfield        #125 <Field int zzcrT>
	//*   5    9:aload_0         
	//*   6   10:getfield        #26  <Field int zzcrU>
	//*   7   13:icmplt          20
		{
			throw zzbus.zzacX();
	//    8   16:invokestatic    #128 <Method zzbus zzbus.zzacX()>
	//    9   19:athrow          
		} else
		{
			i = zzqj(i);
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #131 <Method int zzqj(int)>
	//   13   25:istore_2        
			zzcrT = zzcrT + 1;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #125 <Field int zzcrT>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #125 <Field int zzcrT>
			zzbut1.zzb(this);
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #136 <Method zzbut zzbut.zzb(zzbul)>
	//   23   41:pop             
			zzqg(0);
	//   24   42:aload_0         
	//   25   43:iconst_0        
	//   26   44:invokevirtual   #140 <Method void zzqg(int)>
			zzcrT = zzcrT - 1;
	//   27   47:aload_0         
	//   28   48:aload_0         
	//   29   49:getfield        #125 <Field int zzcrT>
	//   30   52:iconst_1        
	//   31   53:isub            
	//   32   54:putfield        #125 <Field int zzcrT>
			zzqk(i);
	//   33   57:aload_0         
	//   34   58:iload_2         
	//   35   59:invokevirtual   #143 <Method void zzqk(int)>
			return;
	//   36   62:return          
		}
	}

	public void zza(zzbut zzbut1, int i)
		throws IOException
	{
		if(zzcrT >= zzcrU)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field int zzcrT>
	//*   2    4:aload_0         
	//*   3    5:getfield        #26  <Field int zzcrU>
	//*   4    8:icmplt          15
		{
			throw zzbus.zzacX();
	//    5   11:invokestatic    #128 <Method zzbus zzbus.zzacX()>
	//    6   14:athrow          
		} else
		{
			zzcrT = zzcrT + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #125 <Field int zzcrT>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #125 <Field int zzcrT>
			zzbut1.zzb(this);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #136 <Method zzbut zzbut.zzb(zzbul)>
	//   16   30:pop             
			zzqg(zzbuw.zzK(i, 4));
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:iconst_4        
	//   20   34:invokestatic    #148 <Method int zzbuw.zzK(int, int)>
	//   21   37:invokevirtual   #140 <Method void zzqg(int)>
			zzcrT = zzcrT - 1;
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #125 <Field int zzcrT>
	//   25   45:iconst_1        
	//   26   46:isub            
	//   27   47:putfield        #125 <Field int zzcrT>
			return;
	//   28   50:return          
		}
	}

	public boolean zzacA()
		throws IOException
	{
		return zzacD() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzacD()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int zzacB()
		throws IOException
	{
		return zzqi(zzacD());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzacD()>
	//    2    4:invokestatic    #153 <Method int zzqi(int)>
	//    3    7:ireturn         
	}

	public long zzacC()
		throws IOException
	{
		return zzaV(zzacE());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method long zzacE()>
	//    2    4:invokestatic    #159 <Method long zzaV(long)>
	//    3    7:lreturn         
	}

	public int zzacD()
		throws IOException
	{
		int i = ((int) (zzacK()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #163 <Method byte zzacK()>
	//    2    4:istore_1        
		if(i < 0) goto _L2; else goto _L1
	//    3    5:iload_1         
	//    4    6:iflt            11
_L1:
		return i;
	//    5    9:iload_1         
	//    6   10:ireturn         
_L2:
		i &= 0x7f;
	//    7   11:iload_1         
	//    8   12:bipush          127
	//    9   14:iand            
	//   10   15:istore_1        
		byte byte0 = zzacK();
	//   11   16:aload_0         
	//   12   17:invokevirtual   #163 <Method byte zzacK()>
	//   13   20:istore_2        
		if(byte0 >= 0)
	//*  14   21:iload_2         
	//*  15   22:iflt            32
			return i | byte0 << 7;
	//   16   25:iload_1         
	//   17   26:iload_2         
	//   18   27:bipush          7
	//   19   29:ishl            
	//   20   30:ior             
	//   21   31:ireturn         
		i |= (byte0 & 0x7f) << 7;
	//   22   32:iload_1         
	//   23   33:iload_2         
	//   24   34:bipush          127
	//   25   36:iand            
	//   26   37:bipush          7
	//   27   39:ishl            
	//   28   40:ior             
	//   29   41:istore_1        
		byte0 = zzacK();
	//   30   42:aload_0         
	//   31   43:invokevirtual   #163 <Method byte zzacK()>
	//   32   46:istore_2        
		if(byte0 >= 0)
	//*  33   47:iload_2         
	//*  34   48:iflt            58
			return i | byte0 << 14;
	//   35   51:iload_1         
	//   36   52:iload_2         
	//   37   53:bipush          14
	//   38   55:ishl            
	//   39   56:ior             
	//   40   57:ireturn         
		i |= (byte0 & 0x7f) << 14;
	//   41   58:iload_1         
	//   42   59:iload_2         
	//   43   60:bipush          127
	//   44   62:iand            
	//   45   63:bipush          14
	//   46   65:ishl            
	//   47   66:ior             
	//   48   67:istore_1        
		int k = ((int) (zzacK()));
	//   49   68:aload_0         
	//   50   69:invokevirtual   #163 <Method byte zzacK()>
	//   51   72:istore_3        
		if(k >= 0)
	//*  52   73:iload_3         
	//*  53   74:iflt            84
			return i | k << 21;
	//   54   77:iload_1         
	//   55   78:iload_3         
	//   56   79:bipush          21
	//   57   81:ishl            
	//   58   82:ior             
	//   59   83:ireturn         
		byte0 = zzacK();
	//   60   84:aload_0         
	//   61   85:invokevirtual   #163 <Method byte zzacK()>
	//   62   88:istore_2        
		k = i | (k & 0x7f) << 21 | byte0 << 28;
	//   63   89:iload_1         
	//   64   90:iload_3         
	//   65   91:bipush          127
	//   66   93:iand            
	//   67   94:bipush          21
	//   68   96:ishl            
	//   69   97:ior             
	//   70   98:iload_2         
	//   71   99:bipush          28
	//   72  101:ishl            
	//   73  102:ior             
	//   74  103:istore_3        
		i = k;
	//   75  104:iload_3         
	//   76  105:istore_1        
		if(byte0 < 0)
	//*  77  106:iload_2         
	//*  78  107:ifge            9
		{
			int j = 0;
	//   79  110:iconst_0        
	//   80  111:istore_2        
label0:
			do
			{
label1:
				{
					if(j >= 5)
						break label1;
	//   81  112:iload_2         
	//   82  113:iconst_5        
	//   83  114:icmpge          133
					i = k;
	//   84  117:iload_3         
	//   85  118:istore_1        
					if(zzacK() >= 0)
						break label0;
	//   86  119:aload_0         
	//   87  120:invokevirtual   #163 <Method byte zzacK()>
	//   88  123:ifge            9
					j++;
	//   89  126:iload_2         
	//   90  127:iconst_1        
	//   91  128:iadd            
	//   92  129:istore_2        
				}
			} while(true);
	//   93  130:goto            112
		}
		if(true) goto _L1; else goto _L3
_L3:
		throw zzbus.zzacT();
	//   94  133:invokestatic    #166 <Method zzbus zzbus.zzacT()>
	//   95  136:athrow          
	}

	public long zzacE()
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
			byte byte0 = zzacK();
	//    7   10:aload_0         
	//    8   11:invokevirtual   #163 <Method byte zzacK()>
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
		throw zzbus.zzacT();
	//   30   43:invokestatic    #166 <Method zzbus zzbus.zzacT()>
	//   31   46:athrow          
	}

	public int zzacF()
		throws IOException
	{
		return zzacK() & 0xff | (zzacK() & 0xff) << 8 | (zzacK() & 0xff) << 16 | (zzacK() & 0xff) << 24;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #163 <Method byte zzacK()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:aload_0         
	//    5    9:invokevirtual   #163 <Method byte zzacK()>
	//    6   12:sipush          255
	//    7   15:iand            
	//    8   16:bipush          8
	//    9   18:ishl            
	//   10   19:ior             
	//   11   20:aload_0         
	//   12   21:invokevirtual   #163 <Method byte zzacK()>
	//   13   24:sipush          255
	//   14   27:iand            
	//   15   28:bipush          16
	//   16   30:ishl            
	//   17   31:ior             
	//   18   32:aload_0         
	//   19   33:invokevirtual   #163 <Method byte zzacK()>
	//   20   36:sipush          255
	//   21   39:iand            
	//   22   40:bipush          24
	//   23   42:ishl            
	//   24   43:ior             
	//   25   44:ireturn         
	}

	public long zzacG()
		throws IOException
	{
		int i = ((int) (zzacK()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #163 <Method byte zzacK()>
	//    2    4:istore_1        
		int j = ((int) (zzacK()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #163 <Method byte zzacK()>
	//    5    9:istore_2        
		int k = ((int) (zzacK()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #163 <Method byte zzacK()>
	//    8   14:istore_3        
		int l = ((int) (zzacK()));
	//    9   15:aload_0         
	//   10   16:invokevirtual   #163 <Method byte zzacK()>
	//   11   19:istore          4
		int i1 = ((int) (zzacK()));
	//   12   21:aload_0         
	//   13   22:invokevirtual   #163 <Method byte zzacK()>
	//   14   25:istore          5
		int j1 = ((int) (zzacK()));
	//   15   27:aload_0         
	//   16   28:invokevirtual   #163 <Method byte zzacK()>
	//   17   31:istore          6
		int k1 = ((int) (zzacK()));
	//   18   33:aload_0         
	//   19   34:invokevirtual   #163 <Method byte zzacK()>
	//   20   37:istore          7
		int l1 = ((int) (zzacK()));
	//   21   39:aload_0         
	//   22   40:invokevirtual   #163 <Method byte zzacK()>
	//   23   43:istore          8
		long l2 = i;
	//   24   45:iload_1         
	//   25   46:i2l             
	//   26   47:lstore          9
		return ((long)j & 255L) << 8 | l2 & 255L | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
	//   27   49:iload_2         
	//   28   50:i2l             
	//   29   51:ldc2w           #167 <Long 255L>
	//   30   54:land            
	//   31   55:bipush          8
	//   32   57:lshl            
	//   33   58:lload           9
	//   34   60:ldc2w           #167 <Long 255L>
	//   35   63:land            
	//   36   64:lor             
	//   37   65:iload_3         
	//   38   66:i2l             
	//   39   67:ldc2w           #167 <Long 255L>
	//   40   70:land            
	//   41   71:bipush          16
	//   42   73:lshl            
	//   43   74:lor             
	//   44   75:iload           4
	//   45   77:i2l             
	//   46   78:ldc2w           #167 <Long 255L>
	//   47   81:land            
	//   48   82:bipush          24
	//   49   84:lshl            
	//   50   85:lor             
	//   51   86:iload           5
	//   52   88:i2l             
	//   53   89:ldc2w           #167 <Long 255L>
	//   54   92:land            
	//   55   93:bipush          32
	//   56   95:lshl            
	//   57   96:lor             
	//   58   97:iload           6
	//   59   99:i2l             
	//   60  100:ldc2w           #167 <Long 255L>
	//   61  103:land            
	//   62  104:bipush          40
	//   63  106:lshl            
	//   64  107:lor             
	//   65  108:iload           7
	//   66  110:i2l             
	//   67  111:ldc2w           #167 <Long 255L>
	//   68  114:land            
	//   69  115:bipush          48
	//   70  117:lshl            
	//   71  118:lor             
	//   72  119:iload           8
	//   73  121:i2l             
	//   74  122:ldc2w           #167 <Long 255L>
	//   75  125:land            
	//   76  126:bipush          56
	//   77  128:lshl            
	//   78  129:lor             
	//   79  130:lreturn         
	}

	public int zzacI()
	{
		if(zzcrS == 0x7fffffff)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field int zzcrS>
	//*   2    4:ldc1            #22  <Int 0x7fffffff>
	//*   3    6:icmpne          11
		{
			return -1;
	//    4    9:iconst_m1       
	//    5   10:ireturn         
		} else
		{
			int i = zzcrQ;
	//    6   11:aload_0         
	//    7   12:getfield        #37  <Field int zzcrQ>
	//    8   15:istore_1        
			return zzcrS - i;
	//    9   16:aload_0         
	//   10   17:getfield        #24  <Field int zzcrS>
	//   11   20:iload_1         
	//   12   21:isub            
	//   13   22:ireturn         
		}
	}

	public boolean zzacJ()
	{
		return zzcrQ == zzcrO;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int zzcrQ>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field int zzcrO>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public byte zzacK()
		throws IOException
	{
		if(zzcrQ == zzcrO)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field int zzcrQ>
	//*   2    4:aload_0         
	//*   3    5:getfield        #35  <Field int zzcrO>
	//*   4    8:icmpne          15
		{
			throw zzbus.zzacR();
	//    5   11:invokestatic    #76  <Method zzbus zzbus.zzacR()>
	//    6   14:athrow          
		} else
		{
			byte abyte0[] = buffer;
	//    7   15:aload_0         
	//    8   16:getfield        #31  <Field byte[] buffer>
	//    9   19:astore_2        
			int i = zzcrQ;
	//   10   20:aload_0         
	//   11   21:getfield        #37  <Field int zzcrQ>
	//   12   24:istore_1        
			zzcrQ = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #37  <Field int zzcrQ>
			return abyte0[i];
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:baload          
	//   21   35:ireturn         
		}
	}

	public int zzacu()
		throws IOException
	{
		if(zzacJ())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #173 <Method boolean zzacJ()>
	//*   2    4:ifeq            14
		{
			zzcrR = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #175 <Field int zzcrR>
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		zzcrR = zzacD();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #62  <Method int zzacD()>
	//   11   19:putfield        #175 <Field int zzcrR>
		if(zzcrR == 0)
	//*  12   22:aload_0         
	//*  13   23:getfield        #175 <Field int zzcrR>
	//*  14   26:ifne            33
			throw zzbus.zzacU();
	//   15   29:invokestatic    #178 <Method zzbus zzbus.zzacU()>
	//   16   32:athrow          
		else
			return zzcrR;
	//   17   33:aload_0         
	//   18   34:getfield        #175 <Field int zzcrR>
	//   19   37:ireturn         
	}

	public void zzacv()
		throws IOException
	{
		int i;
		do
			i = zzacu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #181 <Method int zzacu()>
	//    2    4:istore_1        
		while(i != 0 && zzqh(i));
	//    3    5:iload_1         
	//    4    6:ifeq            17
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #185 <Method boolean zzqh(int)>
	//    8   14:ifne            0
	//    9   17:return          
	}

	public long zzacw()
		throws IOException
	{
		return zzacE();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method long zzacE()>
	//    2    4:lreturn         
	}

	public long zzacx()
		throws IOException
	{
		return zzacE();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method long zzacE()>
	//    2    4:lreturn         
	}

	public int zzacy()
		throws IOException
	{
		return zzacD();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int zzacD()>
	//    2    4:ireturn         
	}

	public long zzacz()
		throws IOException
	{
		return zzacG();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method long zzacG()>
	//    2    4:lreturn         
	}

	public void zzqg(int i)
		throws zzbus
	{
		if(zzcrR != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field int zzcrR>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          12
			throw zzbus.zzacV();
	//    4    8:invokestatic    #192 <Method zzbus zzbus.zzacV()>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	public boolean zzqh(int i)
		throws IOException
	{
		switch(zzbuw.zzqA(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #195 <Method int zzbuw.zzqA(int)>
		{
	//*   2    4:tableswitch     0 5: default 44
	//	               0 48
	//	               1 55
	//	               2 62
	//	               3 72
	//	               4 90
	//	               5 92
		default:
			throw zzbus.zzacW();
	//    3   44:invokestatic    #198 <Method zzbus zzbus.zzacW()>
	//    4   47:athrow          

		case 0: // '\0'
			zzacy();
	//    5   48:aload_0         
	//    6   49:invokevirtual   #200 <Method int zzacy()>
	//    7   52:pop             
			return true;
	//    8   53:iconst_1        
	//    9   54:ireturn         

		case 1: // '\001'
			zzacG();
	//   10   55:aload_0         
	//   11   56:invokevirtual   #89  <Method long zzacG()>
	//   12   59:pop2            
			return true;
	//   13   60:iconst_1        
	//   14   61:ireturn         

		case 2: // '\002'
			zzqm(zzacD());
	//   15   62:aload_0         
	//   16   63:aload_0         
	//   17   64:invokevirtual   #62  <Method int zzacD()>
	//   18   67:invokevirtual   #203 <Method void zzqm(int)>
			return true;
	//   19   70:iconst_1        
	//   20   71:ireturn         

		case 3: // '\003'
			zzacv();
	//   21   72:aload_0         
	//   22   73:invokevirtual   #205 <Method void zzacv()>
			zzqg(zzbuw.zzK(zzbuw.zzqB(i), 4));
	//   23   76:aload_0         
	//   24   77:iload_1         
	//   25   78:invokestatic    #208 <Method int zzbuw.zzqB(int)>
	//   26   81:iconst_4        
	//   27   82:invokestatic    #148 <Method int zzbuw.zzK(int, int)>
	//   28   85:invokevirtual   #140 <Method void zzqg(int)>
			return true;
	//   29   88:iconst_1        
	//   30   89:ireturn         

		case 4: // '\004'
			return false;
	//   31   90:iconst_0        
	//   32   91:ireturn         

		case 5: // '\005'
			zzacF();
	//   33   92:aload_0         
	//   34   93:invokevirtual   #100 <Method int zzacF()>
	//   35   96:pop             
			break;
		}
		return true;
	//   36   97:iconst_1        
	//   37   98:ireturn         
	}

	public int zzqj(int i)
		throws zzbus
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw zzbus.zzacS();
	//    2    4:invokestatic    #68  <Method zzbus zzbus.zzacS()>
	//    3    7:athrow          
		i = zzcrQ + i;
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field int zzcrQ>
	//    6   12:iload_1         
	//    7   13:iadd            
	//    8   14:istore_1        
		int j = zzcrS;
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field int zzcrS>
	//   11   19:istore_2        
		if(i > j)
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmple          29
		{
			throw zzbus.zzacR();
	//   15   25:invokestatic    #76  <Method zzbus zzbus.zzacR()>
	//   16   28:athrow          
		} else
		{
			zzcrS = i;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:putfield        #24  <Field int zzcrS>
			zzacH();
	//   20   34:aload_0         
	//   21   35:invokespecial   #210 <Method void zzacH()>
			return j;
	//   22   38:iload_2         
	//   23   39:ireturn         
		}
	}

	public void zzqk(int i)
	{
		zzcrS = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int zzcrS>
		zzacH();
	//    3    5:aload_0         
	//    4    6:invokespecial   #210 <Method void zzacH()>
	//    5    9:return          
	}

	public void zzql(int i)
	{
		if(i > zzcrQ - zzcrN)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #37  <Field int zzcrQ>
	//*   3    5:aload_0         
	//*   4    6:getfield        #33  <Field int zzcrN>
	//*   5    9:isub            
	//*   6   10:icmple          63
		{
			int j = zzcrQ;
	//    7   13:aload_0         
	//    8   14:getfield        #37  <Field int zzcrQ>
	//    9   17:istore_2        
			int k = zzcrN;
	//   10   18:aload_0         
	//   11   19:getfield        #33  <Field int zzcrN>
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
			zzcrQ = zzcrN + i;
	//   47   96:aload_0         
	//   48   97:aload_0         
	//   49   98:getfield        #33  <Field int zzcrN>
	//   50  101:iload_1         
	//   51  102:iadd            
	//   52  103:putfield        #37  <Field int zzcrQ>
			return;
	//   53  106:return          
		}
	}

	public void zzqm(int i)
		throws IOException
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw zzbus.zzacS();
	//    2    4:invokestatic    #68  <Method zzbus zzbus.zzacS()>
	//    3    7:athrow          
		if(zzcrQ + i > zzcrS)
	//*   4    8:aload_0         
	//*   5    9:getfield        #37  <Field int zzcrQ>
	//*   6   12:iload_1         
	//*   7   13:iadd            
	//*   8   14:aload_0         
	//*   9   15:getfield        #24  <Field int zzcrS>
	//*  10   18:icmple          38
		{
			zzqm(zzcrS - zzcrQ);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #24  <Field int zzcrS>
	//   14   26:aload_0         
	//   15   27:getfield        #37  <Field int zzcrQ>
	//   16   30:isub            
	//   17   31:invokevirtual   #203 <Method void zzqm(int)>
			throw zzbus.zzacR();
	//   18   34:invokestatic    #76  <Method zzbus zzbus.zzacR()>
	//   19   37:athrow          
		}
		if(i <= zzcrO - zzcrQ)
	//*  20   38:iload_1         
	//*  21   39:aload_0         
	//*  22   40:getfield        #35  <Field int zzcrO>
	//*  23   43:aload_0         
	//*  24   44:getfield        #37  <Field int zzcrQ>
	//*  25   47:isub            
	//*  26   48:icmpgt          62
		{
			zzcrQ = zzcrQ + i;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #37  <Field int zzcrQ>
	//   30   56:iload_1         
	//   31   57:iadd            
	//   32   58:putfield        #37  <Field int zzcrQ>
			return;
	//   33   61:return          
		} else
		{
			throw zzbus.zzacR();
	//   34   62:invokestatic    #76  <Method zzbus zzbus.zzacR()>
	//   35   65:athrow          
		}
	}

	private final byte buffer[];
	private int zzcrN;
	private int zzcrO;
	private int zzcrP;
	private int zzcrQ;
	private int zzcrR;
	private int zzcrS;
	private int zzcrT;
	private int zzcrU;
	private int zzcrV;
}
