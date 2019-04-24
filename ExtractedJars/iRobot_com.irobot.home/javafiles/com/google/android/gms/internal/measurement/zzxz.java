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
		zzbuj = 0x7fffffff;
	//    2    4:aload_0         
	//    3    5:ldc1            #25  <Int 0x7fffffff>
	//    4    7:putfield        #27  <Field int zzbuj>
		zzbub = 64;
	//    5   10:aload_0         
	//    6   11:bipush          64
	//    7   13:putfield        #29  <Field int zzbub>
		zzbuc = 0x4000000;
	//    8   16:aload_0         
	//    9   17:ldc1            #30  <Int 0x4000000>
	//   10   19:putfield        #32  <Field int zzbuc>
		buffer = abyte0;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #34  <Field byte[] buffer>
		zzceo = i;
	//   14   27:aload_0         
	//   15   28:iload_2         
	//   16   29:putfield        #36  <Field int zzceo>
		j += i;
	//   17   32:iload_3         
	//   18   33:iload_2         
	//   19   34:iadd            
	//   20   35:istore_3        
		zzceq = j;
	//   21   36:aload_0         
	//   22   37:iload_3         
	//   23   38:putfield        #38  <Field int zzceq>
		zzcep = j;
	//   24   41:aload_0         
	//   25   42:iload_3         
	//   26   43:putfield        #40  <Field int zzcep>
		zzcer = i;
	//   27   46:aload_0         
	//   28   47:iload_2         
	//   29   48:putfield        #42  <Field int zzcer>
	//   30   51:return          
	}

	private final void zzau(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw zzyh.zzze();
	//    2    4:invokestatic    #51  <Method zzyh zzyh.zzze()>
	//    3    7:athrow          
		if(zzcer + i > zzbuj)
	//*   4    8:aload_0         
	//*   5    9:getfield        #42  <Field int zzcer>
	//*   6   12:iload_1         
	//*   7   13:iadd            
	//*   8   14:aload_0         
	//*   9   15:getfield        #27  <Field int zzbuj>
	//*  10   18:icmple          38
		{
			zzau(zzbuj - zzcer);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field int zzbuj>
	//   14   26:aload_0         
	//   15   27:getfield        #42  <Field int zzcer>
	//   16   30:isub            
	//   17   31:invokespecial   #53  <Method void zzau(int)>
			throw zzyh.zzzd();
	//   18   34:invokestatic    #56  <Method zzyh zzyh.zzzd()>
	//   19   37:athrow          
		}
		if(i <= zzceq - zzcer)
	//*  20   38:iload_1         
	//*  21   39:aload_0         
	//*  22   40:getfield        #38  <Field int zzceq>
	//*  23   43:aload_0         
	//*  24   44:getfield        #42  <Field int zzcer>
	//*  25   47:isub            
	//*  26   48:icmpgt          62
		{
			zzcer = zzcer + i;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #42  <Field int zzcer>
	//   30   56:iload_1         
	//   31   57:iadd            
	//   32   58:putfield        #42  <Field int zzcer>
			return;
	//   33   61:return          
		} else
		{
			throw zzyh.zzzd();
	//   34   62:invokestatic    #56  <Method zzyh zzyh.zzzd()>
	//   35   65:athrow          
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
	//    5    7:invokespecial   #60  <Method void zzxz(byte[], int, int)>
	//    6   10:areturn         
	}

	public static zzxz zzn(byte abyte0[])
	{
		return zzj(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #64  <Method zzxz zzj(byte[], int, int)>
	//    5    7:areturn         
	}

	private final void zzvf()
	{
		zzceq = zzceq + zzbug;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field int zzceq>
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field int zzbug>
	//    5    9:iadd            
	//    6   10:putfield        #38  <Field int zzceq>
		int i = zzceq;
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field int zzceq>
	//    9   17:istore_1        
		if(i > zzbuj)
	//*  10   18:iload_1         
	//*  11   19:aload_0         
	//*  12   20:getfield        #27  <Field int zzbuj>
	//*  13   23:icmple          50
		{
			zzbug = i - zzbuj;
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #27  <Field int zzbuj>
	//   18   32:isub            
	//   19   33:putfield        #67  <Field int zzbug>
			zzceq = zzceq - zzbug;
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:getfield        #38  <Field int zzceq>
	//   23   41:aload_0         
	//   24   42:getfield        #67  <Field int zzbug>
	//   25   45:isub            
	//   26   46:putfield        #38  <Field int zzceq>
			return;
	//   27   49:return          
		} else
		{
			zzbug = 0;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #67  <Field int zzbug>
			return;
	//   31   55:return          
		}
	}

	private final byte zzvg()
	{
		if(zzcer == zzceq)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field int zzcer>
	//*   2    4:aload_0         
	//*   3    5:getfield        #38  <Field int zzceq>
	//*   4    8:icmpne          15
		{
			throw zzyh.zzzd();
	//    5   11:invokestatic    #56  <Method zzyh zzyh.zzzd()>
	//    6   14:athrow          
		} else
		{
			byte abyte0[] = buffer;
	//    7   15:aload_0         
	//    8   16:getfield        #34  <Field byte[] buffer>
	//    9   19:astore_2        
			int i = zzcer;
	//   10   20:aload_0         
	//   11   21:getfield        #42  <Field int zzcer>
	//   12   24:istore_1        
			zzcer = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #42  <Field int zzcer>
			return abyte0[i];
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:baload          
	//   21   35:ireturn         
		}
	}

	private final zztq zzyx()
	{
		if(zzces == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field zztq zzces>
	//*   2    4:ifnonnull       26
			zzces = zztq.zzd(buffer, zzceo, zzcep);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field byte[] buffer>
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field int zzceo>
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field int zzcep>
	//   10   20:invokestatic    #79  <Method zztq zztq.zzd(byte[], int, int)>
	//   11   23:putfield        #73  <Field zztq zzces>
		int i = zzces.zzva();
	//   12   26:aload_0         
	//   13   27:getfield        #73  <Field zztq zzces>
	//   14   30:invokevirtual   #83  <Method int zztq.zzva()>
	//   15   33:istore_1        
		int j = zzcer - zzceo;
	//   16   34:aload_0         
	//   17   35:getfield        #42  <Field int zzcer>
	//   18   38:aload_0         
	//   19   39:getfield        #36  <Field int zzceo>
	//   20   42:isub            
	//   21   43:istore_2        
		if(i > j)
	//*  22   44:iload_1         
	//*  23   45:iload_2         
	//*  24   46:icmple          80
		{
			throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[] {
				Integer.valueOf(i), Integer.valueOf(j)
			}));
	//   25   49:new             #85  <Class IOException>
	//   26   52:dup             
	//   27   53:ldc1            #87  <String "CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s">
	//   28   55:iconst_2        
	//   29   56:anewarray       Object[]
	//   30   59:dup             
	//   31   60:iconst_0        
	//   32   61:iload_1         
	//   33   62:invokestatic    #93  <Method Integer Integer.valueOf(int)>
	//   34   65:aastore         
	//   35   66:dup             
	//   36   67:iconst_1        
	//   37   68:iload_2         
	//   38   69:invokestatic    #93  <Method Integer Integer.valueOf(int)>
	//   39   72:aastore         
	//   40   73:invokestatic    #99  <Method String String.format(String, Object[])>
	//   41   76:invokespecial   #102 <Method void IOException(String)>
	//   42   79:athrow          
		} else
		{
			zzces.zzau(j - i);
	//   43   80:aload_0         
	//   44   81:getfield        #73  <Field zztq zzces>
	//   45   84:iload_2         
	//   46   85:iload_1         
	//   47   86:isub            
	//   48   87:invokevirtual   #103 <Method void zztq.zzau(int)>
			zzces.zzar(zzbub - zzbua);
	//   49   90:aload_0         
	//   50   91:getfield        #73  <Field zztq zzces>
	//   51   94:aload_0         
	//   52   95:getfield        #29  <Field int zzbub>
	//   53   98:aload_0         
	//   54   99:getfield        #105 <Field int zzbua>
	//   55  102:isub            
	//   56  103:invokevirtual   #109 <Method int zztq.zzar(int)>
	//   57  106:pop             
			return zzces;
	//   58  107:aload_0         
	//   59  108:getfield        #73  <Field zztq zzces>
	//   60  111:areturn         
		}
	}

	public final int getPosition()
	{
		return zzcer - zzceo;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int zzcer>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field int zzceo>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public final String readString()
	{
		int i = zzvb();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method int zzvb()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            13
			throw zzyh.zzze();
	//    5    9:invokestatic    #51  <Method zzyh zzyh.zzze()>
	//    6   12:athrow          
		if(i > zzceq - zzcer)
	//*   7   13:iload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #38  <Field int zzceq>
	//*  10   18:aload_0         
	//*  11   19:getfield        #42  <Field int zzcer>
	//*  12   22:isub            
	//*  13   23:icmple          30
		{
			throw zzyh.zzzd();
	//   14   26:invokestatic    #56  <Method zzyh zzyh.zzzd()>
	//   15   29:athrow          
		} else
		{
			String s = new String(buffer, zzcer, i, zzyg.UTF_8);
	//   16   30:new             #95  <Class String>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:getfield        #34  <Field byte[] buffer>
	//   20   38:aload_0         
	//   21   39:getfield        #42  <Field int zzcer>
	//   22   42:iload_1         
	//   23   43:getstatic       #121 <Field java.nio.charset.Charset zzyg.UTF_8>
	//   24   46:invokespecial   #124 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   25   49:astore_2        
			zzcer = zzcer + i;
	//   26   50:aload_0         
	//   27   51:aload_0         
	//   28   52:getfield        #42  <Field int zzcer>
	//   29   55:iload_1         
	//   30   56:iadd            
	//   31   57:putfield        #42  <Field int zzcer>
			return s;
	//   32   60:aload_2         
	//   33   61:areturn         
		}
	}

	public final zzuo zza(zzwf zzwf)
	{
		try
		{
			zzwf = ((zzwf) ((zzuo)zzyx().zza(zzwf, zzub.zzvs())));
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method zztq zzyx()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #136 <Method zzub zzub.zzvs()>
	//    4    8:invokevirtual   #139 <Method zzvv zztq.zza(zzwf, zzub)>
	//    5   11:checkcast       #141 <Class zzuo>
	//    6   14:astore_1        
			zzaq(zzbui);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #143 <Field int zzbui>
	//   10   20:invokevirtual   #147 <Method boolean zzaq(int)>
	//   11   23:pop             
		}
	//*  12   24:aload_1         
	//*  13   25:areturn         
		// Misplaced declaration of an exception variable
		catch(zzwf zzwf)
	//*  14   26:astore_1        
		{
			throw new zzyh("", ((Exception) (zzwf)));
	//   15   27:new             #47  <Class zzyh>
	//   16   30:dup             
	//   17   31:ldc1            #149 <String "">
	//   18   33:aload_1         
	//   19   34:invokespecial   #152 <Method void zzyh(String, Exception)>
	//   20   37:athrow          
		}
		return ((zzuo) (zzwf));
	}

	public final void zza(zzyi zzyi1)
	{
		int i = zzvb();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method int zzvb()>
	//    2    4:istore_2        
		if(zzbua >= zzbub)
	//*   3    5:aload_0         
	//*   4    6:getfield        #105 <Field int zzbua>
	//*   5    9:aload_0         
	//*   6   10:getfield        #29  <Field int zzbub>
	//*   7   13:icmplt          20
		{
			throw zzyh.zzzg();
	//    8   16:invokestatic    #158 <Method zzyh zzyh.zzzg()>
	//    9   19:athrow          
		} else
		{
			i = zzas(i);
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #161 <Method int zzas(int)>
	//   13   25:istore_2        
			zzbua = zzbua + 1;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #105 <Field int zzbua>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #105 <Field int zzbua>
			zzyi1.zza(this);
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #166 <Method zzyi zzyi.zza(zzxz)>
	//   23   41:pop             
			zzap(0);
	//   24   42:aload_0         
	//   25   43:iconst_0        
	//   26   44:invokevirtual   #169 <Method void zzap(int)>
			zzbua = zzbua - 1;
	//   27   47:aload_0         
	//   28   48:aload_0         
	//   29   49:getfield        #105 <Field int zzbua>
	//   30   52:iconst_1        
	//   31   53:isub            
	//   32   54:putfield        #105 <Field int zzbua>
			zzat(i);
	//   33   57:aload_0         
	//   34   58:iload_2         
	//   35   59:invokevirtual   #172 <Method void zzat(int)>
			return;
	//   36   62:return          
		}
	}

	public final void zza(zzyi zzyi1, int i)
	{
		if(zzbua >= zzbub)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field int zzbua>
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field int zzbub>
	//*   4    8:icmplt          15
		{
			throw zzyh.zzzg();
	//    5   11:invokestatic    #158 <Method zzyh zzyh.zzzg()>
	//    6   14:athrow          
		} else
		{
			zzbua = zzbua + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #105 <Field int zzbua>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #105 <Field int zzbua>
			zzyi1.zza(this);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #166 <Method zzyi zzyi.zza(zzxz)>
	//   16   30:pop             
			zzap(i << 3 | 4);
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:iconst_3        
	//   20   34:ishl            
	//   21   35:iconst_4        
	//   22   36:ior             
	//   23   37:invokevirtual   #169 <Method void zzap(int)>
			zzbua = zzbua - 1;
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:getfield        #105 <Field int zzbua>
	//   27   45:iconst_1        
	//   28   46:isub            
	//   29   47:putfield        #105 <Field int zzbua>
			return;
	//   30   50:return          
		}
	}

	public final void zzap(int i)
	{
		if(zzbui != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field int zzbui>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
			throw new zzyh("Protocol message end-group tag did not match expected tag.");
	//    4    8:new             #47  <Class zzyh>
	//    5   11:dup             
	//    6   12:ldc1            #175 <String "Protocol message end-group tag did not match expected tag.">
	//    7   14:invokespecial   #176 <Method void zzyh(String)>
	//    8   17:athrow          
		else
			return;
	//    9   18:return          
	}

	public final boolean zzaq(int i)
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
	//    4   44:new             #47  <Class zzyh>
	//    5   47:dup             
	//    6   48:ldc1            #178 <String "Protocol message tag had invalid wire type.">
	//    7   50:invokespecial   #176 <Method void zzyh(String)>
	//    8   53:athrow          

		case 5: // '\005'
			zzvd();
	//    9   54:aload_0         
	//   10   55:invokevirtual   #181 <Method int zzvd()>
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
	//   17   64:invokevirtual   #184 <Method int zzuj()>
	//   18   67:istore_2        
			while(j != 0 && zzaq(j));
	//   19   68:iload_2         
	//   20   69:ifeq            80
	//   21   72:aload_0         
	//   22   73:iload_2         
	//   23   74:invokevirtual   #147 <Method boolean zzaq(int)>
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
	//   33   88:invokevirtual   #169 <Method void zzap(int)>
			return true;
	//   34   91:iconst_1        
	//   35   92:ireturn         

		case 2: // '\002'
			zzau(zzvb());
	//   36   93:aload_0         
	//   37   94:aload_0         
	//   38   95:invokevirtual   #115 <Method int zzvb()>
	//   39   98:invokespecial   #53  <Method void zzau(int)>
			return true;
	//   40  101:iconst_1        
	//   41  102:ireturn         

		case 1: // '\001'
			zzve();
	//   42  103:aload_0         
	//   43  104:invokevirtual   #188 <Method long zzve()>
	//   44  107:pop2            
			return true;
	//   45  108:iconst_1        
	//   46  109:ireturn         

		case 0: // '\0'
			zzvb();
	//   47  110:aload_0         
	//   48  111:invokevirtual   #115 <Method int zzvb()>
	//   49  114:pop             
			return true;
	//   50  115:iconst_1        
	//   51  116:ireturn         
		}
	}

	public final int zzas(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw zzyh.zzze();
	//    2    4:invokestatic    #51  <Method zzyh zzyh.zzze()>
	//    3    7:athrow          
		i += zzcer;
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field int zzcer>
	//    7   13:iadd            
	//    8   14:istore_1        
		int j = zzbuj;
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field int zzbuj>
	//   11   19:istore_2        
		if(i > j)
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmple          29
		{
			throw zzyh.zzzd();
	//   15   25:invokestatic    #56  <Method zzyh zzyh.zzzd()>
	//   16   28:athrow          
		} else
		{
			zzbuj = i;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:putfield        #27  <Field int zzbuj>
			zzvf();
	//   20   34:aload_0         
	//   21   35:invokespecial   #190 <Method void zzvf()>
			return j;
	//   22   38:iload_2         
	//   23   39:ireturn         
		}
	}

	public final void zzat(int i)
	{
		zzbuj = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int zzbuj>
		zzvf();
	//    3    5:aload_0         
	//    4    6:invokespecial   #190 <Method void zzvf()>
	//    5    9:return          
	}

	public final void zzcb(int i)
	{
		zzt(i, zzbui);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #143 <Field int zzbui>
	//    4    6:invokevirtual   #195 <Method void zzt(int, int)>
	//    5    9:return          
	}

	public final byte[] zzs(int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
		{
			return zzyl.zzcfq;
	//    2    4:getstatic       #202 <Field byte[] zzyl.zzcfq>
	//    3    7:areturn         
		} else
		{
			byte abyte0[] = new byte[j];
	//    4    8:iload_2         
	//    5    9:newarray        byte[]
	//    6   11:astore          4
			int k = zzceo;
	//    7   13:aload_0         
	//    8   14:getfield        #36  <Field int zzceo>
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
	//   18   29:invokestatic    #208 <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte0;
	//   19   32:aload           4
	//   20   34:areturn         
		}
	}

	final void zzt(int i, int j)
	{
		if(i > zzcer - zzceo)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #42  <Field int zzcer>
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field int zzceo>
	//*   5    9:isub            
	//*   6   10:icmple          79
		{
			j = zzcer;
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field int zzcer>
	//    9   17:istore_2        
			int k = zzceo;
	//   10   18:aload_0         
	//   11   19:getfield        #36  <Field int zzceo>
	//   12   22:istore_3        
			StringBuilder stringbuilder = new StringBuilder(50);
	//   13   23:new             #210 <Class StringBuilder>
	//   14   26:dup             
	//   15   27:bipush          50
	//   16   29:invokespecial   #212 <Method void StringBuilder(int)>
	//   17   32:astore          4
			stringbuilder.append("Position ");
	//   18   34:aload           4
	//   19   36:ldc1            #214 <String "Position ">
	//   20   38:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			stringbuilder.append(i);
	//   22   42:aload           4
	//   23   44:iload_1         
	//   24   45:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   25   48:pop             
			stringbuilder.append(" is beyond current ");
	//   26   49:aload           4
	//   27   51:ldc1            #223 <String " is beyond current ">
	//   28   53:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			stringbuilder.append(j - k);
	//   30   57:aload           4
	//   31   59:iload_2         
	//   32   60:iload_3         
	//   33   61:isub            
	//   34   62:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   35   65:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   36   66:new             #225 <Class IllegalArgumentException>
	//   37   69:dup             
	//   38   70:aload           4
	//   39   72:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   40   75:invokespecial   #229 <Method void IllegalArgumentException(String)>
	//   41   78:athrow          
		}
		if(i < 0)
	//*  42   79:iload_1         
	//*  43   80:ifge            122
		{
			StringBuilder stringbuilder1 = new StringBuilder(24);
	//   44   83:new             #210 <Class StringBuilder>
	//   45   86:dup             
	//   46   87:bipush          24
	//   47   89:invokespecial   #212 <Method void StringBuilder(int)>
	//   48   92:astore          4
			stringbuilder1.append("Bad position ");
	//   49   94:aload           4
	//   50   96:ldc1            #231 <String "Bad position ">
	//   51   98:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   52  101:pop             
			stringbuilder1.append(i);
	//   53  102:aload           4
	//   54  104:iload_1         
	//   55  105:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   56  108:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//   57  109:new             #225 <Class IllegalArgumentException>
	//   58  112:dup             
	//   59  113:aload           4
	//   60  115:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   61  118:invokespecial   #229 <Method void IllegalArgumentException(String)>
	//   62  121:athrow          
		} else
		{
			zzcer = zzceo + i;
	//   63  122:aload_0         
	//   64  123:aload_0         
	//   65  124:getfield        #36  <Field int zzceo>
	//   66  127:iload_1         
	//   67  128:iadd            
	//   68  129:putfield        #42  <Field int zzcer>
			zzbui = j;
	//   69  132:aload_0         
	//   70  133:iload_2         
	//   71  134:putfield        #143 <Field int zzbui>
			return;
	//   72  137:return          
		}
	}

	public final int zzuj()
	{
		if(zzcer == zzceq)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field int zzcer>
	//*   2    4:aload_0         
	//*   3    5:getfield        #38  <Field int zzceq>
	//*   4    8:icmpne          18
		{
			zzbui = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #143 <Field int zzbui>
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		}
		zzbui = zzvb();
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #115 <Method int zzvb()>
	//   13   23:putfield        #143 <Field int zzbui>
		if(zzbui == 0)
	//*  14   26:aload_0         
	//*  15   27:getfield        #143 <Field int zzbui>
	//*  16   30:ifne            43
			throw new zzyh("Protocol message contained an invalid tag (zero).");
	//   17   33:new             #47  <Class zzyh>
	//   18   36:dup             
	//   19   37:ldc1            #233 <String "Protocol message contained an invalid tag (zero).">
	//   20   39:invokespecial   #176 <Method void zzyh(String)>
	//   21   42:athrow          
		else
			return zzbui;
	//   22   43:aload_0         
	//   23   44:getfield        #143 <Field int zzbui>
	//   24   47:ireturn         
	}

	public final boolean zzup()
	{
		return zzvb() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method int zzvb()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final int zzvb()
	{
		int i;
		int k;
		i = ((int) (zzvg()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #237 <Method byte zzvg()>
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
		k = ((int) (zzvg()));
	//   11   16:aload_0         
	//   12   17:invokespecial   #237 <Method byte zzvg()>
	//   13   20:istore_2        
		if(k < 0) goto _L2; else goto _L1
	//   14   21:iload_2         
	//   15   22:iflt            34
_L1:
		k <<= 7;
	//   16   25:iload_2         
	//   17   26:bipush          7
	//   18   28:ishl            
	//   19   29:istore_2        
_L4:
		return i | k;
	//   20   30:iload_1         
	//   21   31:iload_2         
	//   22   32:ior             
	//   23   33:ireturn         
_L2:
		i |= (k & 0x7f) << 7;
	//   24   34:iload_1         
	//   25   35:iload_2         
	//   26   36:bipush          127
	//   27   38:iand            
	//   28   39:bipush          7
	//   29   41:ishl            
	//   30   42:ior             
	//   31   43:istore_1        
		k = ((int) (zzvg()));
	//   32   44:aload_0         
	//   33   45:invokespecial   #237 <Method byte zzvg()>
	//   34   48:istore_2        
		if(k >= 0)
	//*  35   49:iload_2         
	//*  36   50:iflt            61
		{
			k <<= 14;
	//   37   53:iload_2         
	//   38   54:bipush          14
	//   39   56:ishl            
	//   40   57:istore_2        
			continue; /* Loop/switch isn't completed */
	//   41   58:goto            30
		}
		i |= (k & 0x7f) << 14;
	//   42   61:iload_1         
	//   43   62:iload_2         
	//   44   63:bipush          127
	//   45   65:iand            
	//   46   66:bipush          14
	//   47   68:ishl            
	//   48   69:ior             
	//   49   70:istore_1        
		k = ((int) (zzvg()));
	//   50   71:aload_0         
	//   51   72:invokespecial   #237 <Method byte zzvg()>
	//   52   75:istore_2        
		if(k < 0)
			break; /* Loop/switch isn't completed */
	//   53   76:iload_2         
	//   54   77:iflt            88
		k <<= 21;
	//   55   80:iload_2         
	//   56   81:bipush          21
	//   57   83:ishl            
	//   58   84:istore_2        
		if(true) goto _L4; else goto _L3
	//   59   85:goto            30
_L3:
		byte byte0 = zzvg();
	//   60   88:aload_0         
	//   61   89:invokespecial   #237 <Method byte zzvg()>
	//   62   92:istore_3        
		k = i | (k & 0x7f) << 21 | byte0 << 28;
	//   63   93:iload_1         
	//   64   94:iload_2         
	//   65   95:bipush          127
	//   66   97:iand            
	//   67   98:bipush          21
	//   68  100:ishl            
	//   69  101:ior             
	//   70  102:iload_3         
	//   71  103:bipush          28
	//   72  105:ishl            
	//   73  106:ior             
	//   74  107:istore_2        
		if(byte0 < 0)
	//*  75  108:iload_3         
	//*  76  109:ifge            139
		{
			for(int j = 0; j < 5; j++)
	//*  77  112:iconst_0        
	//*  78  113:istore_1        
	//*  79  114:iload_1         
	//*  80  115:iconst_5        
	//*  81  116:icmpge          135
				if(zzvg() >= 0)
	//*  82  119:aload_0         
	//*  83  120:invokespecial   #237 <Method byte zzvg()>
	//*  84  123:iflt            128
					return k;
	//   85  126:iload_2         
	//   86  127:ireturn         

	//   87  128:iload_1         
	//   88  129:iconst_1        
	//   89  130:iadd            
	//   90  131:istore_1        
	//*  91  132:goto            114
			throw zzyh.zzzf();
	//   92  135:invokestatic    #240 <Method zzyh zzyh.zzzf()>
	//   93  138:athrow          
		} else
		{
			return k;
	//   94  139:iload_2         
	//   95  140:ireturn         
		}
	}

	public final long zzvc()
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
	//    8   11:invokespecial   #237 <Method byte zzvg()>
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
	//   30   43:invokestatic    #240 <Method zzyh zzyh.zzzf()>
	//   31   46:athrow          
	}

	public final int zzvd()
	{
		return zzvg() & 0xff | (zzvg() & 0xff) << 8 | (zzvg() & 0xff) << 16 | (zzvg() & 0xff) << 24;
	//    0    0:aload_0         
	//    1    1:invokespecial   #237 <Method byte zzvg()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:aload_0         
	//    5    9:invokespecial   #237 <Method byte zzvg()>
	//    6   12:sipush          255
	//    7   15:iand            
	//    8   16:bipush          8
	//    9   18:ishl            
	//   10   19:ior             
	//   11   20:aload_0         
	//   12   21:invokespecial   #237 <Method byte zzvg()>
	//   13   24:sipush          255
	//   14   27:iand            
	//   15   28:bipush          16
	//   16   30:ishl            
	//   17   31:ior             
	//   18   32:aload_0         
	//   19   33:invokespecial   #237 <Method byte zzvg()>
	//   20   36:sipush          255
	//   21   39:iand            
	//   22   40:bipush          24
	//   23   42:ishl            
	//   24   43:ior             
	//   25   44:ireturn         
	}

	public final long zzve()
	{
		int i = ((int) (zzvg()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #237 <Method byte zzvg()>
	//    2    4:istore_1        
		int j = ((int) (zzvg()));
	//    3    5:aload_0         
	//    4    6:invokespecial   #237 <Method byte zzvg()>
	//    5    9:istore_2        
		int k = ((int) (zzvg()));
	//    6   10:aload_0         
	//    7   11:invokespecial   #237 <Method byte zzvg()>
	//    8   14:istore_3        
		int l = ((int) (zzvg()));
	//    9   15:aload_0         
	//   10   16:invokespecial   #237 <Method byte zzvg()>
	//   11   19:istore          4
		int i1 = ((int) (zzvg()));
	//   12   21:aload_0         
	//   13   22:invokespecial   #237 <Method byte zzvg()>
	//   14   25:istore          5
		int j1 = ((int) (zzvg()));
	//   15   27:aload_0         
	//   16   28:invokespecial   #237 <Method byte zzvg()>
	//   17   31:istore          6
		int k1 = ((int) (zzvg()));
	//   18   33:aload_0         
	//   19   34:invokespecial   #237 <Method byte zzvg()>
	//   20   37:istore          7
		int l1 = ((int) (zzvg()));
	//   21   39:aload_0         
	//   22   40:invokespecial   #237 <Method byte zzvg()>
	//   23   43:istore          8
		long l2 = i;
	//   24   45:iload_1         
	//   25   46:i2l             
	//   26   47:lstore          9
		return ((long)j & 255L) << 8 | l2 & 255L | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
	//   27   49:iload_2         
	//   28   50:i2l             
	//   29   51:ldc2w           #242 <Long 255L>
	//   30   54:land            
	//   31   55:bipush          8
	//   32   57:lshl            
	//   33   58:lload           9
	//   34   60:ldc2w           #242 <Long 255L>
	//   35   63:land            
	//   36   64:lor             
	//   37   65:iload_3         
	//   38   66:i2l             
	//   39   67:ldc2w           #242 <Long 255L>
	//   40   70:land            
	//   41   71:bipush          16
	//   42   73:lshl            
	//   43   74:lor             
	//   44   75:iload           4
	//   45   77:i2l             
	//   46   78:ldc2w           #242 <Long 255L>
	//   47   81:land            
	//   48   82:bipush          24
	//   49   84:lshl            
	//   50   85:lor             
	//   51   86:iload           5
	//   52   88:i2l             
	//   53   89:ldc2w           #242 <Long 255L>
	//   54   92:land            
	//   55   93:bipush          32
	//   56   95:lshl            
	//   57   96:lor             
	//   58   97:iload           6
	//   59   99:i2l             
	//   60  100:ldc2w           #242 <Long 255L>
	//   61  103:land            
	//   62  104:bipush          40
	//   63  106:lshl            
	//   64  107:lor             
	//   65  108:iload           7
	//   66  110:i2l             
	//   67  111:ldc2w           #242 <Long 255L>
	//   68  114:land            
	//   69  115:bipush          48
	//   70  117:lshl            
	//   71  118:lor             
	//   72  119:iload           8
	//   73  121:i2l             
	//   74  122:ldc2w           #242 <Long 255L>
	//   75  125:land            
	//   76  126:bipush          56
	//   77  128:lshl            
	//   78  129:lor             
	//   79  130:lreturn         
	}

	public final int zzyy()
	{
		if(zzbuj == 0x7fffffff)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int zzbuj>
	//*   2    4:ldc1            #25  <Int 0x7fffffff>
	//*   3    6:icmpne          11
		{
			return -1;
	//    4    9:iconst_m1       
	//    5   10:ireturn         
		} else
		{
			int i = zzcer;
	//    6   11:aload_0         
	//    7   12:getfield        #42  <Field int zzcer>
	//    8   15:istore_1        
			return zzbuj - i;
	//    9   16:aload_0         
	//   10   17:getfield        #27  <Field int zzbuj>
	//   11   20:iload_1         
	//   12   21:isub            
	//   13   22:ireturn         
		}
	}

	private final byte buffer[];
	private int zzbua;
	private int zzbub;
	private int zzbuc;
	private int zzbug;
	private int zzbui;
	private int zzbuj;
	private final int zzceo;
	private final int zzcep;
	private int zzceq;
	private int zzcer;
	private zztq zzces;
}
