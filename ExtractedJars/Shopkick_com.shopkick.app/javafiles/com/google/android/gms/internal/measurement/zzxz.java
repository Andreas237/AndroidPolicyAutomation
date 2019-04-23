// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyh, zztq, zzyg, zzuv, 
//			zzub, zzuo, zzyi, zzyl, 
//			zzwf

public final class zzxz
{

	private zzxz(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzbuh = 0x7fffffff;
	//    2    4:aload_0         
	//    3    5:ldc1            #25  <Int 0x7fffffff>
	//    4    7:putfield        #27  <Field int zzbuh>
		zzbtz = 64;
	//    5   10:aload_0         
	//    6   11:bipush          64
	//    7   13:putfield        #29  <Field int zzbtz>
		zzbua = 0x4000000;
	//    8   16:aload_0         
	//    9   17:ldc1            #30  <Int 0x4000000>
	//   10   19:putfield        #32  <Field int zzbua>
		buffer = abyte0;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #34  <Field byte[] buffer>
		zzcem = i;
	//   14   27:aload_0         
	//   15   28:iload_2         
	//   16   29:putfield        #36  <Field int zzcem>
		j += i;
	//   17   32:iload_3         
	//   18   33:iload_2         
	//   19   34:iadd            
	//   20   35:istore_3        
		zzceo = j;
	//   21   36:aload_0         
	//   22   37:iload_3         
	//   23   38:putfield        #38  <Field int zzceo>
		zzcen = j;
	//   24   41:aload_0         
	//   25   42:iload_3         
	//   26   43:putfield        #40  <Field int zzcen>
		zzcep = i;
	//   27   46:aload_0         
	//   28   47:iload_2         
	//   29   48:putfield        #42  <Field int zzcep>
	//   30   51:return          
	}

	private final void zzau(int i)
		throws IOException
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            54
		{
			int j = zzcep;
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field int zzcep>
	//    4    8:istore_2        
			int k = zzbuh;
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field int zzbuh>
	//    7   13:istore_3        
			if(j + i <= k)
	//*   8   14:iload_2         
	//*   9   15:iload_1         
	//*  10   16:iadd            
	//*  11   17:iload_3         
	//*  12   18:icmpgt          43
			{
				if(i <= zzceo - j)
	//*  13   21:iload_1         
	//*  14   22:aload_0         
	//*  15   23:getfield        #38  <Field int zzceo>
	//*  16   26:iload_2         
	//*  17   27:isub            
	//*  18   28:icmpgt          39
				{
					zzcep = j + i;
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:iload_1         
	//   22   34:iadd            
	//   23   35:putfield        #42  <Field int zzcep>
					return;
	//   24   38:return          
				} else
				{
					throw zzyh.zzzd();
	//   25   39:invokestatic    #53  <Method zzyh zzyh.zzzd()>
	//   26   42:athrow          
				}
			} else
			{
				zzau(k - j);
	//   27   43:aload_0         
	//   28   44:iload_3         
	//   29   45:iload_2         
	//   30   46:isub            
	//   31   47:invokespecial   #55  <Method void zzau(int)>
				throw zzyh.zzzd();
	//   32   50:invokestatic    #53  <Method zzyh zzyh.zzzd()>
	//   33   53:athrow          
			}
		} else
		{
			throw zzyh.zzze();
	//   34   54:invokestatic    #58  <Method zzyh zzyh.zzze()>
	//   35   57:athrow          
		}
	}

	public static zzxz zzj(byte abyte0[], int i, int j)
	{
		return new zzxz(abyte0, 0, j);
	//    0    0:new             #2   <Class zzxz>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:iload_2         
	//    5    7:invokespecial   #63  <Method void zzxz(byte[], int, int)>
	//    6   10:areturn         
	}

	public static zzxz zzn(byte abyte0[])
	{
		return zzj(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #67  <Method zzxz zzj(byte[], int, int)>
	//    5    7:areturn         
	}

	private final void zzvf()
	{
		zzceo = zzceo + zzbue;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field int zzceo>
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field int zzbue>
	//    5    9:iadd            
	//    6   10:putfield        #38  <Field int zzceo>
		int i = zzceo;
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field int zzceo>
	//    9   17:istore_1        
		int j = zzbuh;
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field int zzbuh>
	//   12   22:istore_2        
		if(i > j)
	//*  13   23:iload_1         
	//*  14   24:iload_2         
	//*  15   25:icmple          46
		{
			zzbue = i - j;
	//   16   28:aload_0         
	//   17   29:iload_1         
	//   18   30:iload_2         
	//   19   31:isub            
	//   20   32:putfield        #70  <Field int zzbue>
			zzceo = i - zzbue;
	//   21   35:aload_0         
	//   22   36:iload_1         
	//   23   37:aload_0         
	//   24   38:getfield        #70  <Field int zzbue>
	//   25   41:isub            
	//   26   42:putfield        #38  <Field int zzceo>
			return;
	//   27   45:return          
		} else
		{
			zzbue = 0;
	//   28   46:aload_0         
	//   29   47:iconst_0        
	//   30   48:putfield        #70  <Field int zzbue>
			return;
	//   31   51:return          
		}
	}

	private final byte zzvg()
		throws IOException
	{
		int i = zzcep;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int zzcep>
	//    2    4:istore_1        
		if(i != zzceo)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #38  <Field int zzceo>
	//*   6   10:icmpeq          29
		{
			byte abyte0[] = buffer;
	//    7   13:aload_0         
	//    8   14:getfield        #34  <Field byte[] buffer>
	//    9   17:astore_2        
			zzcep = i + 1;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:iadd            
	//   14   22:putfield        #42  <Field int zzcep>
			return abyte0[i];
	//   15   25:aload_2         
	//   16   26:iload_1         
	//   17   27:baload          
	//   18   28:ireturn         
		} else
		{
			throw zzyh.zzzd();
	//   19   29:invokestatic    #53  <Method zzyh zzyh.zzzd()>
	//   20   32:athrow          
		}
	}

	private final zztq zzyx()
		throws IOException
	{
		if(zzceq == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field zztq zzceq>
	//*   2    4:ifnonnull       26
			zzceq = zztq.zzd(buffer, zzcem, zzcen);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field byte[] buffer>
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field int zzcem>
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field int zzcen>
	//   10   20:invokestatic    #82  <Method zztq zztq.zzd(byte[], int, int)>
	//   11   23:putfield        #76  <Field zztq zzceq>
		int i = zzceq.zzva();
	//   12   26:aload_0         
	//   13   27:getfield        #76  <Field zztq zzceq>
	//   14   30:invokevirtual   #86  <Method int zztq.zzva()>
	//   15   33:istore_1        
		int j = zzcep - zzcem;
	//   16   34:aload_0         
	//   17   35:getfield        #42  <Field int zzcep>
	//   18   38:aload_0         
	//   19   39:getfield        #36  <Field int zzcem>
	//   20   42:isub            
	//   21   43:istore_2        
		if(i <= j)
	//*  22   44:iload_1         
	//*  23   45:iload_2         
	//*  24   46:icmpgt          81
		{
			zzceq.zzau(j - i);
	//   25   49:aload_0         
	//   26   50:getfield        #76  <Field zztq zzceq>
	//   27   53:iload_2         
	//   28   54:iload_1         
	//   29   55:isub            
	//   30   56:invokevirtual   #87  <Method void zztq.zzau(int)>
			zzceq.zzar(zzbtz - zzbty);
	//   31   59:aload_0         
	//   32   60:getfield        #76  <Field zztq zzceq>
	//   33   63:aload_0         
	//   34   64:getfield        #29  <Field int zzbtz>
	//   35   67:aload_0         
	//   36   68:getfield        #89  <Field int zzbty>
	//   37   71:isub            
	//   38   72:invokevirtual   #93  <Method int zztq.zzar(int)>
	//   39   75:pop             
			return zzceq;
	//   40   76:aload_0         
	//   41   77:getfield        #76  <Field zztq zzceq>
	//   42   80:areturn         
		} else
		{
			throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[] {
				Integer.valueOf(i), Integer.valueOf(j)
			}));
	//   43   81:new             #47  <Class IOException>
	//   44   84:dup             
	//   45   85:ldc1            #95  <String "CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s">
	//   46   87:iconst_2        
	//   47   88:anewarray       Object[]
	//   48   91:dup             
	//   49   92:iconst_0        
	//   50   93:iload_1         
	//   51   94:invokestatic    #101 <Method Integer Integer.valueOf(int)>
	//   52   97:aastore         
	//   53   98:dup             
	//   54   99:iconst_1        
	//   55  100:iload_2         
	//   56  101:invokestatic    #101 <Method Integer Integer.valueOf(int)>
	//   57  104:aastore         
	//   58  105:invokestatic    #107 <Method String String.format(String, Object[])>
	//   59  108:invokespecial   #110 <Method void IOException(String)>
	//   60  111:athrow          
		}
	}

	public final int getPosition()
	{
		return zzcep - zzcem;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int zzcep>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field int zzcem>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public final String readString()
		throws IOException
	{
		int i = zzvb();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method int zzvb()>
	//    2    4:istore_1        
		if(i >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            61
		{
			int j = zzceo;
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field int zzceo>
	//    7   13:istore_2        
			int k = zzcep;
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field int zzcep>
	//   10   18:istore_3        
			if(i <= j - k)
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:isub            
	//*  15   23:icmpgt          57
			{
				String s = new String(buffer, k, i, zzyg.UTF_8);
	//   16   26:new             #103 <Class String>
	//   17   29:dup             
	//   18   30:aload_0         
	//   19   31:getfield        #34  <Field byte[] buffer>
	//   20   34:iload_3         
	//   21   35:iload_1         
	//   22   36:getstatic       #122 <Field java.nio.charset.Charset zzyg.UTF_8>
	//   23   39:invokespecial   #125 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   24   42:astore          4
				zzcep = zzcep + i;
	//   25   44:aload_0         
	//   26   45:aload_0         
	//   27   46:getfield        #42  <Field int zzcep>
	//   28   49:iload_1         
	//   29   50:iadd            
	//   30   51:putfield        #42  <Field int zzcep>
				return s;
	//   31   54:aload           4
	//   32   56:areturn         
			} else
			{
				throw zzyh.zzzd();
	//   33   57:invokestatic    #53  <Method zzyh zzyh.zzzd()>
	//   34   60:athrow          
			}
		} else
		{
			throw zzyh.zzze();
	//   35   61:invokestatic    #58  <Method zzyh zzyh.zzze()>
	//   36   64:athrow          
		}
	}

	public final zzuo zza(zzwf zzwf)
		throws IOException
	{
		try
		{
			zzwf = ((zzwf) ((zzuo)zzyx().zza(zzwf, zzub.zzvs())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method zztq zzyx()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #137 <Method zzub zzub.zzvs()>
	//    4    8:invokevirtual   #140 <Method zzvv zztq.zza(zzwf, zzub)>
	//    5   11:checkcast       #142 <Class zzuo>
	//    6   14:astore_1        
			zzaq(zzbug);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #144 <Field int zzbug>
	//   10   20:invokevirtual   #148 <Method boolean zzaq(int)>
	//   11   23:pop             
		}
	//*  12   24:aload_1         
	//*  13   25:areturn         
		// Misplaced declaration of an exception variable
		catch(zzwf zzwf)
	//*  14   26:astore_1        
		{
			throw new zzyh("", ((Exception) (zzwf)));
	//   15   27:new             #49  <Class zzyh>
	//   16   30:dup             
	//   17   31:ldc1            #150 <String "">
	//   18   33:aload_1         
	//   19   34:invokespecial   #153 <Method void zzyh(String, Exception)>
	//   20   37:athrow          
		}
		return ((zzuo) (zzwf));
	}

	public final void zza(zzyi zzyi1)
		throws IOException
	{
		int i = zzvb();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method int zzvb()>
	//    2    4:istore_2        
		if(zzbty < zzbtz)
	//*   3    5:aload_0         
	//*   4    6:getfield        #89  <Field int zzbty>
	//*   5    9:aload_0         
	//*   6   10:getfield        #29  <Field int zzbtz>
	//*   7   13:icmpge          59
		{
			i = zzas(i);
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #159 <Method int zzas(int)>
	//   11   21:istore_2        
			zzbty = zzbty + 1;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #89  <Field int zzbty>
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #89  <Field int zzbty>
			zzyi1.zza(this);
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:invokevirtual   #164 <Method zzyi zzyi.zza(zzxz)>
	//   21   37:pop             
			zzap(0);
	//   22   38:aload_0         
	//   23   39:iconst_0        
	//   24   40:invokevirtual   #167 <Method void zzap(int)>
			zzbty = zzbty - 1;
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #89  <Field int zzbty>
	//   28   48:iconst_1        
	//   29   49:isub            
	//   30   50:putfield        #89  <Field int zzbty>
			zzat(i);
	//   31   53:aload_0         
	//   32   54:iload_2         
	//   33   55:invokevirtual   #170 <Method void zzat(int)>
			return;
	//   34   58:return          
		} else
		{
			throw zzyh.zzzg();
	//   35   59:invokestatic    #173 <Method zzyh zzyh.zzzg()>
	//   36   62:athrow          
		}
	}

	public final void zza(zzyi zzyi1, int i)
		throws IOException
	{
		int j = zzbty;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int zzbty>
	//    2    4:istore_3        
		if(j < zzbtz)
	//*   3    5:iload_3         
	//*   4    6:aload_0         
	//*   5    7:getfield        #29  <Field int zzbtz>
	//*   6   10:icmpge          46
		{
			zzbty = j + 1;
	//    7   13:aload_0         
	//    8   14:iload_3         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #89  <Field int zzbty>
			zzyi1.zza(this);
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #164 <Method zzyi zzyi.zza(zzxz)>
	//   15   25:pop             
			zzap(i << 3 | 4);
	//   16   26:aload_0         
	//   17   27:iload_2         
	//   18   28:iconst_3        
	//   19   29:ishl            
	//   20   30:iconst_4        
	//   21   31:ior             
	//   22   32:invokevirtual   #167 <Method void zzap(int)>
			zzbty = zzbty - 1;
	//   23   35:aload_0         
	//   24   36:aload_0         
	//   25   37:getfield        #89  <Field int zzbty>
	//   26   40:iconst_1        
	//   27   41:isub            
	//   28   42:putfield        #89  <Field int zzbty>
			return;
	//   29   45:return          
		} else
		{
			throw zzyh.zzzg();
	//   30   46:invokestatic    #173 <Method zzyh zzyh.zzzg()>
	//   31   49:athrow          
		}
	}

	public final void zzap(int i)
		throws zzyh
	{
		if(zzbug == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field int zzbug>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		else
			throw new zzyh("Protocol message end-group tag did not match expected tag.");
	//    5    9:new             #49  <Class zzyh>
	//    6   12:dup             
	//    7   13:ldc1            #176 <String "Protocol message end-group tag did not match expected tag.">
	//    8   15:invokespecial   #177 <Method void zzyh(String)>
	//    9   18:athrow          
	}

	public final boolean zzaq(int i)
		throws IOException
	{
		switch(i & 7)
	//*   0    0:iload_1         
	//*   1    1:bipush          7
	//*   2    3:iand            
		{
	//*   3    4:tableswitch     0 5: default 44
	//	               0 110
	//	               1 103
	//	               2 93
	//	               3 63
	//	               4 61
	//	               5 54
		default:
			throw new zzyh("Protocol message tag had invalid wire type.");
	//    4   44:new             #49  <Class zzyh>
	//    5   47:dup             
	//    6   48:ldc1            #179 <String "Protocol message tag had invalid wire type.">
	//    7   50:invokespecial   #177 <Method void zzyh(String)>
	//    8   53:athrow          

		case 5: // '\005'
			zzvd();
	//    9   54:aload_0         
	//   10   55:invokevirtual   #182 <Method int zzvd()>
	//   11   58:pop             
			return true;
	//   12   59:iconst_1        
	//   13   60:ireturn         

		case 4: // '\004'
			return false;
	//   14   61:iconst_0        
	//   15   62:ireturn         

		case 3: // '\003'
			int j;
			do
				j = zzuj();
	//   16   63:aload_0         
	//   17   64:invokevirtual   #185 <Method int zzuj()>
	//   18   67:istore_2        
			while(j != 0 && zzaq(j));
	//   19   68:iload_2         
	//   20   69:ifeq            80
	//   21   72:aload_0         
	//   22   73:iload_2         
	//   23   74:invokevirtual   #148 <Method boolean zzaq(int)>
	//   24   77:ifne            63
			zzap((i >>> 3) << 3 | 4);
	//   25   80:aload_0         
	//   26   81:iload_1         
	//   27   82:iconst_3        
	//   28   83:iushr           
	//   29   84:iconst_3        
	//   30   85:ishl            
	//   31   86:iconst_4        
	//   32   87:ior             
	//   33   88:invokevirtual   #167 <Method void zzap(int)>
			return true;
	//   34   91:iconst_1        
	//   35   92:ireturn         

		case 2: // '\002'
			zzau(zzvb());
	//   36   93:aload_0         
	//   37   94:aload_0         
	//   38   95:invokevirtual   #116 <Method int zzvb()>
	//   39   98:invokespecial   #55  <Method void zzau(int)>
			return true;
	//   40  101:iconst_1        
	//   41  102:ireturn         

		case 1: // '\001'
			zzve();
	//   42  103:aload_0         
	//   43  104:invokevirtual   #189 <Method long zzve()>
	//   44  107:pop2            
			return true;
	//   45  108:iconst_1        
	//   46  109:ireturn         

		case 0: // '\0'
			zzvb();
	//   47  110:aload_0         
	//   48  111:invokevirtual   #116 <Method int zzvb()>
	//   49  114:pop             
			return true;
	//   50  115:iconst_1        
	//   51  116:ireturn         
		}
	}

	public final int zzas(int i)
		throws zzyh
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            36
		{
			i += zzcep;
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field int zzcep>
	//    5    9:iadd            
	//    6   10:istore_1        
			int j = zzbuh;
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field int zzbuh>
	//    9   15:istore_2        
			if(i <= j)
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpgt          32
			{
				zzbuh = i;
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:putfield        #27  <Field int zzbuh>
				zzvf();
	//   16   26:aload_0         
	//   17   27:invokespecial   #191 <Method void zzvf()>
				return j;
	//   18   30:iload_2         
	//   19   31:ireturn         
			} else
			{
				throw zzyh.zzzd();
	//   20   32:invokestatic    #53  <Method zzyh zzyh.zzzd()>
	//   21   35:athrow          
			}
		} else
		{
			throw zzyh.zzze();
	//   22   36:invokestatic    #58  <Method zzyh zzyh.zzze()>
	//   23   39:athrow          
		}
	}

	public final void zzat(int i)
	{
		zzbuh = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int zzbuh>
		zzvf();
	//    3    5:aload_0         
	//    4    6:invokespecial   #191 <Method void zzvf()>
	//    5    9:return          
	}

	public final void zzcb(int i)
	{
		zzt(i, zzbug);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #144 <Field int zzbug>
	//    4    6:invokevirtual   #196 <Method void zzt(int, int)>
	//    5    9:return          
	}

	public final byte[] zzs(int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
		{
			return zzyl.zzcfo;
	//    2    4:getstatic       #203 <Field byte[] zzyl.zzcfo>
	//    3    7:areturn         
		} else
		{
			byte abyte0[] = new byte[j];
	//    4    8:iload_2         
	//    5    9:newarray        byte[]
	//    6   11:astore          4
			int k = zzcem;
	//    7   13:aload_0         
	//    8   14:getfield        #36  <Field int zzcem>
	//    9   17:istore_3        
			System.arraycopy(((Object) (buffer)), k + i, ((Object) (abyte0)), 0, j);
	//   10   18:aload_0         
	//   11   19:getfield        #34  <Field byte[] buffer>
	//   12   22:iload_3         
	//   13   23:iload_1         
	//   14   24:iadd            
	//   15   25:aload           4
	//   16   27:iconst_0        
	//   17   28:iload_2         
	//   18   29:invokestatic    #209 <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte0;
	//   19   32:aload           4
	//   20   34:areturn         
		}
	}

	final void zzt(int i, int j)
	{
		int k = zzcep;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int zzcep>
	//    2    4:istore_3        
		int l = zzcem;
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field int zzcem>
	//    5    9:istore          4
		if(i <= k - l)
	//*   6   11:iload_1         
	//*   7   12:iload_3         
	//*   8   13:iload           4
	//*   9   15:isub            
	//*  10   16:icmpgt          76
		{
			if(i >= 0)
	//*  11   19:iload_1         
	//*  12   20:iflt            37
			{
				zzcep = l + i;
	//   13   23:aload_0         
	//   14   24:iload           4
	//   15   26:iload_1         
	//   16   27:iadd            
	//   17   28:putfield        #42  <Field int zzcep>
				zzbug = j;
	//   18   31:aload_0         
	//   19   32:iload_2         
	//   20   33:putfield        #144 <Field int zzbug>
				return;
	//   21   36:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder(24);
	//   22   37:new             #211 <Class StringBuilder>
	//   23   40:dup             
	//   24   41:bipush          24
	//   25   43:invokespecial   #213 <Method void StringBuilder(int)>
	//   26   46:astore          5
				stringbuilder.append("Bad position ");
	//   27   48:aload           5
	//   28   50:ldc1            #215 <String "Bad position ">
	//   29   52:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
				stringbuilder.append(i);
	//   31   56:aload           5
	//   32   58:iload_1         
	//   33   59:invokevirtual   #222 <Method StringBuilder StringBuilder.append(int)>
	//   34   62:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   35   63:new             #224 <Class IllegalArgumentException>
	//   36   66:dup             
	//   37   67:aload           5
	//   38   69:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   39   72:invokespecial   #228 <Method void IllegalArgumentException(String)>
	//   40   75:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder(50);
	//   41   76:new             #211 <Class StringBuilder>
	//   42   79:dup             
	//   43   80:bipush          50
	//   44   82:invokespecial   #213 <Method void StringBuilder(int)>
	//   45   85:astore          5
			stringbuilder1.append("Position ");
	//   46   87:aload           5
	//   47   89:ldc1            #230 <String "Position ">
	//   48   91:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   49   94:pop             
			stringbuilder1.append(i);
	//   50   95:aload           5
	//   51   97:iload_1         
	//   52   98:invokevirtual   #222 <Method StringBuilder StringBuilder.append(int)>
	//   53  101:pop             
			stringbuilder1.append(" is beyond current ");
	//   54  102:aload           5
	//   55  104:ldc1            #232 <String " is beyond current ">
	//   56  106:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   57  109:pop             
			stringbuilder1.append(k - l);
	//   58  110:aload           5
	//   59  112:iload_3         
	//   60  113:iload           4
	//   61  115:isub            
	//   62  116:invokevirtual   #222 <Method StringBuilder StringBuilder.append(int)>
	//   63  119:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//   64  120:new             #224 <Class IllegalArgumentException>
	//   65  123:dup             
	//   66  124:aload           5
	//   67  126:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   68  129:invokespecial   #228 <Method void IllegalArgumentException(String)>
	//   69  132:athrow          
		}
	}

	public final int zzuj()
		throws IOException
	{
		if(zzcep == zzceo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field int zzcep>
	//*   2    4:aload_0         
	//*   3    5:getfield        #38  <Field int zzceo>
	//*   4    8:icmpne          18
		{
			zzbug = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #144 <Field int zzbug>
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		}
		zzbug = zzvb();
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #116 <Method int zzvb()>
	//   13   23:putfield        #144 <Field int zzbug>
		int i = zzbug;
	//   14   26:aload_0         
	//   15   27:getfield        #144 <Field int zzbug>
	//   16   30:istore_1        
		if(i != 0)
	//*  17   31:iload_1         
	//*  18   32:ifeq            37
			return i;
	//   19   35:iload_1         
	//   20   36:ireturn         
		else
			throw new zzyh("Protocol message contained an invalid tag (zero).");
	//   21   37:new             #49  <Class zzyh>
	//   22   40:dup             
	//   23   41:ldc1            #234 <String "Protocol message contained an invalid tag (zero).">
	//   24   43:invokespecial   #177 <Method void zzyh(String)>
	//   25   46:athrow          
	}

	public final boolean zzup()
		throws IOException
	{
		return zzvb() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method int zzvb()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final int zzvb()
		throws IOException
	{
		int i = ((int) (zzvg()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method byte zzvg()>
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
		int k = ((int) (zzvg()));
	//   11   16:aload_0         
	//   12   17:invokespecial   #238 <Method byte zzvg()>
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
		k = ((int) (zzvg()));
	//   30   42:aload_0         
	//   31   43:invokespecial   #238 <Method byte zzvg()>
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
		byte byte0 = zzvg();
	//   49   68:aload_0         
	//   50   69:invokespecial   #238 <Method byte zzvg()>
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
		i = ((int) (zzvg()));
	//   60   84:aload_0         
	//   61   85:invokespecial   #238 <Method byte zzvg()>
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
				if(zzvg() >= 0)
	//*  82  115:aload_0         
	//*  83  116:invokespecial   #238 <Method byte zzvg()>
	//*  84  119:iflt            124
					return k;
	//   85  122:iload_2         
	//   86  123:ireturn         

	//   87  124:iload_1         
	//   88  125:iconst_1        
	//   89  126:iadd            
	//   90  127:istore_1        
	//*  91  128:goto            110
			throw zzyh.zzzf();
	//   92  131:invokestatic    #241 <Method zzyh zzyh.zzzf()>
	//   93  134:athrow          
		} else
		{
			return k;
	//   94  135:iload_2         
	//   95  136:ireturn         
		}
	}

	public final long zzvc()
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
			byte byte0 = zzvg();
	//    7   10:aload_0         
	//    8   11:invokespecial   #238 <Method byte zzvg()>
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
		throw zzyh.zzzf();
	//   30   43:invokestatic    #241 <Method zzyh zzyh.zzzf()>
	//   31   46:athrow          
	}

	public final int zzvd()
		throws IOException
	{
		return zzvg() & 0xff | (zzvg() & 0xff) << 8 | (zzvg() & 0xff) << 16 | (zzvg() & 0xff) << 24;
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method byte zzvg()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:aload_0         
	//    5    9:invokespecial   #238 <Method byte zzvg()>
	//    6   12:sipush          255
	//    7   15:iand            
	//    8   16:bipush          8
	//    9   18:ishl            
	//   10   19:ior             
	//   11   20:aload_0         
	//   12   21:invokespecial   #238 <Method byte zzvg()>
	//   13   24:sipush          255
	//   14   27:iand            
	//   15   28:bipush          16
	//   16   30:ishl            
	//   17   31:ior             
	//   18   32:aload_0         
	//   19   33:invokespecial   #238 <Method byte zzvg()>
	//   20   36:sipush          255
	//   21   39:iand            
	//   22   40:bipush          24
	//   23   42:ishl            
	//   24   43:ior             
	//   25   44:ireturn         
	}

	public final long zzve()
		throws IOException
	{
		int i = ((int) (zzvg()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method byte zzvg()>
	//    2    4:istore_1        
		int j = ((int) (zzvg()));
	//    3    5:aload_0         
	//    4    6:invokespecial   #238 <Method byte zzvg()>
	//    5    9:istore_2        
		int k = ((int) (zzvg()));
	//    6   10:aload_0         
	//    7   11:invokespecial   #238 <Method byte zzvg()>
	//    8   14:istore_3        
		int l = ((int) (zzvg()));
	//    9   15:aload_0         
	//   10   16:invokespecial   #238 <Method byte zzvg()>
	//   11   19:istore          4
		int i1 = ((int) (zzvg()));
	//   12   21:aload_0         
	//   13   22:invokespecial   #238 <Method byte zzvg()>
	//   14   25:istore          5
		int j1 = ((int) (zzvg()));
	//   15   27:aload_0         
	//   16   28:invokespecial   #238 <Method byte zzvg()>
	//   17   31:istore          6
		int k1 = ((int) (zzvg()));
	//   18   33:aload_0         
	//   19   34:invokespecial   #238 <Method byte zzvg()>
	//   20   37:istore          7
		int l1 = ((int) (zzvg()));
	//   21   39:aload_0         
	//   22   40:invokespecial   #238 <Method byte zzvg()>
	//   23   43:istore          8
		long l2 = i;
	//   24   45:iload_1         
	//   25   46:i2l             
	//   26   47:lstore          9
		return ((long)j & 255L) << 8 | l2 & 255L | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
	//   27   49:iload_2         
	//   28   50:i2l             
	//   29   51:ldc2w           #243 <Long 255L>
	//   30   54:land            
	//   31   55:bipush          8
	//   32   57:lshl            
	//   33   58:lload           9
	//   34   60:ldc2w           #243 <Long 255L>
	//   35   63:land            
	//   36   64:lor             
	//   37   65:iload_3         
	//   38   66:i2l             
	//   39   67:ldc2w           #243 <Long 255L>
	//   40   70:land            
	//   41   71:bipush          16
	//   42   73:lshl            
	//   43   74:lor             
	//   44   75:iload           4
	//   45   77:i2l             
	//   46   78:ldc2w           #243 <Long 255L>
	//   47   81:land            
	//   48   82:bipush          24
	//   49   84:lshl            
	//   50   85:lor             
	//   51   86:iload           5
	//   52   88:i2l             
	//   53   89:ldc2w           #243 <Long 255L>
	//   54   92:land            
	//   55   93:bipush          32
	//   56   95:lshl            
	//   57   96:lor             
	//   58   97:iload           6
	//   59   99:i2l             
	//   60  100:ldc2w           #243 <Long 255L>
	//   61  103:land            
	//   62  104:bipush          40
	//   63  106:lshl            
	//   64  107:lor             
	//   65  108:iload           7
	//   66  110:i2l             
	//   67  111:ldc2w           #243 <Long 255L>
	//   68  114:land            
	//   69  115:bipush          48
	//   70  117:lshl            
	//   71  118:lor             
	//   72  119:iload           8
	//   73  121:i2l             
	//   74  122:ldc2w           #243 <Long 255L>
	//   75  125:land            
	//   76  126:bipush          56
	//   77  128:lshl            
	//   78  129:lor             
	//   79  130:lreturn         
	}

	public final int zzyy()
	{
		int i = zzbuh;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int zzbuh>
	//    2    4:istore_1        
		if(i == 0x7fffffff)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #25  <Int 0x7fffffff>
	//*   5    8:icmpne          13
			return -1;
	//    6   11:iconst_m1       
	//    7   12:ireturn         
		else
			return i - zzcep;
	//    8   13:iload_1         
	//    9   14:aload_0         
	//   10   15:getfield        #42  <Field int zzcep>
	//   11   18:isub            
	//   12   19:ireturn         
	}

	private final byte buffer[];
	private int zzbty;
	private int zzbtz;
	private int zzbua;
	private int zzbue;
	private int zzbug;
	private int zzbuh;
	private final int zzcem;
	private final int zzcen;
	private int zzceo;
	private int zzcep;
	private zztq zzceq;
}
