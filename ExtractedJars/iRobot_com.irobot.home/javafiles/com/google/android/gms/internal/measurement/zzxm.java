// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzuv

final class zzxm
{

	private static void zza(byte byte0, byte byte1, byte byte2, byte byte3, char ac[], int i)
	{
		if(!zzg(byte1) && (byte0 << 28) + (byte1 + 112) >> 30 == 0 && !zzg(byte2) && !zzg(byte3))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #10  <Method boolean zzg(byte)>
	//*   2    4:ifne            98
	//*   3    7:iload_0         
	//*   4    8:bipush          28
	//*   5   10:ishl            
	//*   6   11:iload_1         
	//*   7   12:bipush          112
	//*   8   14:iadd            
	//*   9   15:iadd            
	//*  10   16:bipush          30
	//*  11   18:ishr            
	//*  12   19:ifne            98
	//*  13   22:iload_2         
	//*  14   23:invokestatic    #10  <Method boolean zzg(byte)>
	//*  15   26:ifne            98
	//*  16   29:iload_3         
	//*  17   30:invokestatic    #10  <Method boolean zzg(byte)>
	//*  18   33:ifeq            39
	//*  19   36:goto            98
		{
			byte0 = ((byte) ((byte0 & 7) << 18 | (byte1 & 0x3f) << 12 | (byte2 & 0x3f) << 6 | byte3 & 0x3f));
	//   20   39:iload_0         
	//   21   40:bipush          7
	//   22   42:iand            
	//   23   43:bipush          18
	//   24   45:ishl            
	//   25   46:iload_1         
	//   26   47:bipush          63
	//   27   49:iand            
	//   28   50:bipush          12
	//   29   52:ishl            
	//   30   53:ior             
	//   31   54:iload_2         
	//   32   55:bipush          63
	//   33   57:iand            
	//   34   58:bipush          6
	//   35   60:ishl            
	//   36   61:ior             
	//   37   62:iload_3         
	//   38   63:bipush          63
	//   39   65:iand            
	//   40   66:ior             
	//   41   67:istore_0        
			ac[i] = (char)((byte0 >>> 10) + 55232);
	//   42   68:aload           4
	//   43   70:iload           5
	//   44   72:iload_0         
	//   45   73:bipush          10
	//   46   75:iushr           
	//   47   76:ldc1            #11  <Int 55232>
	//   48   78:iadd            
	//   49   79:int2char        
	//   50   80:castore         
			ac[i + 1] = (char)((byte0 & 0x3ff) + 56320);
	//   51   81:aload           4
	//   52   83:iload           5
	//   53   85:iconst_1        
	//   54   86:iadd            
	//   55   87:iload_0         
	//   56   88:sipush          1023
	//   57   91:iand            
	//   58   92:ldc1            #12  <Int 56320>
	//   59   94:iadd            
	//   60   95:int2char        
	//   61   96:castore         
			return;
	//   62   97:return          
		} else
		{
			throw zzuv.zzwx();
	//   63   98:invokestatic    #18  <Method zzuv zzuv.zzwx()>
	//   64  101:athrow          
		}
	}

	private static void zza(byte byte0, byte byte1, byte byte2, char ac[], int i)
	{
		if(!zzg(byte1) && (byte0 != -32 || byte1 >= -96) && (byte0 != -19 || byte1 < -96) && !zzg(byte2))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #10  <Method boolean zzg(byte)>
	//*   2    4:ifne            67
	//*   3    7:iload_0         
	//*   4    8:bipush          -32
	//*   5   10:icmpne          19
	//*   6   13:iload_1         
	//*   7   14:bipush          -96
	//*   8   16:icmplt          67
	//*   9   19:iload_0         
	//*  10   20:bipush          -19
	//*  11   22:icmpne          31
	//*  12   25:iload_1         
	//*  13   26:bipush          -96
	//*  14   28:icmpge          67
	//*  15   31:iload_2         
	//*  16   32:invokestatic    #10  <Method boolean zzg(byte)>
	//*  17   35:ifeq            41
	//*  18   38:goto            67
		{
			ac[i] = (char)((byte0 & 0xf) << 12 | (byte1 & 0x3f) << 6 | byte2 & 0x3f);
	//   19   41:aload_3         
	//   20   42:iload           4
	//   21   44:iload_0         
	//   22   45:bipush          15
	//   23   47:iand            
	//   24   48:bipush          12
	//   25   50:ishl            
	//   26   51:iload_1         
	//   27   52:bipush          63
	//   28   54:iand            
	//   29   55:bipush          6
	//   30   57:ishl            
	//   31   58:ior             
	//   32   59:iload_2         
	//   33   60:bipush          63
	//   34   62:iand            
	//   35   63:ior             
	//   36   64:int2char        
	//   37   65:castore         
			return;
	//   38   66:return          
		} else
		{
			throw zzuv.zzwx();
	//   39   67:invokestatic    #18  <Method zzuv zzuv.zzwx()>
	//   40   70:athrow          
		}
	}

	private static void zza(byte byte0, byte byte1, char ac[], int i)
	{
		if(byte0 >= -62 && !zzg(byte1))
	//*   0    0:iload_0         
	//*   1    1:bipush          -62
	//*   2    3:icmplt          33
	//*   3    6:iload_1         
	//*   4    7:invokestatic    #10  <Method boolean zzg(byte)>
	//*   5   10:ifeq            16
	//*   6   13:goto            33
		{
			ac[i] = (char)((byte0 & 0x1f) << 6 | byte1 & 0x3f);
	//    7   16:aload_2         
	//    8   17:iload_3         
	//    9   18:iload_0         
	//   10   19:bipush          31
	//   11   21:iand            
	//   12   22:bipush          6
	//   13   24:ishl            
	//   14   25:iload_1         
	//   15   26:bipush          63
	//   16   28:iand            
	//   17   29:ior             
	//   18   30:int2char        
	//   19   31:castore         
			return;
	//   20   32:return          
		} else
		{
			throw zzuv.zzwx();
	//   21   33:invokestatic    #18  <Method zzuv zzuv.zzwx()>
	//   22   36:athrow          
		}
	}

	private static void zza(byte byte0, char ac[], int i)
	{
		ac[i] = (char)byte0;
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_0         
	//    3    3:int2char        
	//    4    4:castore         
	//    5    5:return          
	}

	static void zzb(byte byte0, byte byte1, byte byte2, byte byte3, char ac[], int i)
	{
		zza(byte0, byte1, byte2, byte3, ac, i);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:invokestatic    #25  <Method void zza(byte, byte, byte, byte, char[], int)>
	//    7   11:return          
	}

	static void zzb(byte byte0, byte byte1, byte byte2, char ac[], int i)
	{
		zza(byte0, byte1, byte2, ac, i);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokestatic    #27  <Method void zza(byte, byte, byte, char[], int)>
	//    6    9:return          
	}

	static void zzb(byte byte0, byte byte1, char ac[], int i)
	{
		zza(byte0, byte1, ac, i);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #29  <Method void zza(byte, byte, char[], int)>
	//    5    7:return          
	}

	static void zzb(byte byte0, char ac[], int i)
	{
		zza(byte0, ac, i);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #31  <Method void zza(byte, char[], int)>
	//    4    6:return          
	}

	private static boolean zzd(byte byte0)
	{
		return byte0 >= 0;
	//    0    0:iload_0         
	//    1    1:iflt            6
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iconst_0        
	//    5    7:ireturn         
	}

	private static boolean zze(byte byte0)
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

	private static boolean zzf(byte byte0)
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

	private static boolean zzg(byte byte0)
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

	static boolean zzh(byte byte0)
	{
		return zzd(byte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #37  <Method boolean zzd(byte)>
	//    2    4:ireturn         
	}

	static boolean zzi(byte byte0)
	{
		return zze(byte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #40  <Method boolean zze(byte)>
	//    2    4:ireturn         
	}

	static boolean zzj(byte byte0)
	{
		return zzf(byte0);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method boolean zzf(byte)>
	//    2    4:ireturn         
	}
}
