// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfh, zzbfl, zzbfg, zzbfi

public final class zzbez
{

	private zzbez(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzdqh = 0x7fffffff;
	//    2    4:aload_0         
	//    3    5:ldc1            #23  <Int 0x7fffffff>
	//    4    7:putfield        #25  <Field int zzdqh>
		zzdpy = 64;
	//    5   10:aload_0         
	//    6   11:bipush          64
	//    7   13:putfield        #27  <Field int zzdpy>
		zzdpz = 0x4000000;
	//    8   16:aload_0         
	//    9   17:ldc1            #28  <Int 0x4000000>
	//   10   19:putfield        #30  <Field int zzdpz>
		buffer = abyte0;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #32  <Field byte[] buffer>
		zzebf = i;
	//   14   27:aload_0         
	//   15   28:iload_2         
	//   16   29:putfield        #34  <Field int zzebf>
		j += i;
	//   17   32:iload_3         
	//   18   33:iload_2         
	//   19   34:iadd            
	//   20   35:istore_3        
		zzebh = j;
	//   21   36:aload_0         
	//   22   37:iload_3         
	//   23   38:putfield        #36  <Field int zzebh>
		zzebg = j;
	//   24   41:aload_0         
	//   25   42:iload_3         
	//   26   43:putfield        #38  <Field int zzebg>
		zzebi = i;
	//   27   46:aload_0         
	//   28   47:iload_2         
	//   29   48:putfield        #40  <Field int zzebi>
	//   30   51:return          
	}

	private final void zzacg()
	{
		zzebh = zzebh + zzdqe;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field int zzebh>
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field int zzdqe>
	//    5    9:iadd            
	//    6   10:putfield        #36  <Field int zzebh>
		int i = zzebh;
	//    7   13:aload_0         
	//    8   14:getfield        #36  <Field int zzebh>
	//    9   17:istore_1        
		if(i > zzdqh)
	//*  10   18:iload_1         
	//*  11   19:aload_0         
	//*  12   20:getfield        #25  <Field int zzdqh>
	//*  13   23:icmple          50
		{
			zzdqe = i - zzdqh;
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #25  <Field int zzdqh>
	//   18   32:isub            
	//   19   33:putfield        #44  <Field int zzdqe>
			zzebh = zzebh - zzdqe;
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:getfield        #36  <Field int zzebh>
	//   23   41:aload_0         
	//   24   42:getfield        #44  <Field int zzdqe>
	//   25   45:isub            
	//   26   46:putfield        #36  <Field int zzebh>
			return;
	//   27   49:return          
		} else
		{
			zzdqe = 0;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #44  <Field int zzdqe>
			return;
	//   31   55:return          
		}
	}

	private final byte zzach()
		throws IOException
	{
		if(zzebi == zzebh)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field int zzebi>
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field int zzebh>
	//*   4    8:icmpne          15
		{
			throw zzbfh.zzagq();
	//    5   11:invokestatic    #54  <Method zzbfh zzbfh.zzagq()>
	//    6   14:athrow          
		} else
		{
			byte abyte0[] = buffer;
	//    7   15:aload_0         
	//    8   16:getfield        #32  <Field byte[] buffer>
	//    9   19:astore_2        
			int i = zzebi;
	//   10   20:aload_0         
	//   11   21:getfield        #40  <Field int zzebi>
	//   12   24:istore_1        
			zzebi = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #40  <Field int zzebi>
			return abyte0[i];
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:baload          
	//   21   35:ireturn         
		}
	}

	private final void zzbt(int i)
		throws IOException
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw zzbfh.zzagr();
	//    2    4:invokestatic    #60  <Method zzbfh zzbfh.zzagr()>
	//    3    7:athrow          
		if(zzebi + i > zzdqh)
	//*   4    8:aload_0         
	//*   5    9:getfield        #40  <Field int zzebi>
	//*   6   12:iload_1         
	//*   7   13:iadd            
	//*   8   14:aload_0         
	//*   9   15:getfield        #25  <Field int zzdqh>
	//*  10   18:icmple          38
		{
			zzbt(zzdqh - zzebi);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field int zzdqh>
	//   14   26:aload_0         
	//   15   27:getfield        #40  <Field int zzebi>
	//   16   30:isub            
	//   17   31:invokespecial   #62  <Method void zzbt(int)>
			throw zzbfh.zzagq();
	//   18   34:invokestatic    #54  <Method zzbfh zzbfh.zzagq()>
	//   19   37:athrow          
		}
		if(i <= zzebh - zzebi)
	//*  20   38:iload_1         
	//*  21   39:aload_0         
	//*  22   40:getfield        #36  <Field int zzebh>
	//*  23   43:aload_0         
	//*  24   44:getfield        #40  <Field int zzebi>
	//*  25   47:isub            
	//*  26   48:icmpgt          62
		{
			zzebi = zzebi + i;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #40  <Field int zzebi>
	//   30   56:iload_1         
	//   31   57:iadd            
	//   32   58:putfield        #40  <Field int zzebi>
			return;
	//   33   61:return          
		} else
		{
			throw zzbfh.zzagq();
	//   34   62:invokestatic    #54  <Method zzbfh zzbfh.zzagq()>
	//   35   65:athrow          
		}
	}

	public static zzbez zzi(byte abyte0[], int i, int j)
	{
		return new zzbez(abyte0, 0, j);
	//    0    0:new             #2   <Class zzbez>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:iload_2         
	//    5    7:invokespecial   #66  <Method void zzbez(byte[], int, int)>
	//    6   10:areturn         
	}

	public final int getPosition()
	{
		return zzebi - zzebf;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int zzebi>
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field int zzebf>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public final byte[] readBytes()
		throws IOException
	{
		int i = zzacc();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method int zzacc()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            13
			throw zzbfh.zzagr();
	//    5    9:invokestatic    #60  <Method zzbfh zzbfh.zzagr()>
	//    6   12:athrow          
		if(i == 0)
	//*   7   13:iload_1         
	//*   8   14:ifne            21
			return zzbfl.zzecf;
	//    9   17:getstatic       #78  <Field byte[] zzbfl.zzecf>
	//   10   20:areturn         
		if(i > zzebh - zzebi)
	//*  11   21:iload_1         
	//*  12   22:aload_0         
	//*  13   23:getfield        #36  <Field int zzebh>
	//*  14   26:aload_0         
	//*  15   27:getfield        #40  <Field int zzebi>
	//*  16   30:isub            
	//*  17   31:icmple          38
		{
			throw zzbfh.zzagq();
	//   18   34:invokestatic    #54  <Method zzbfh zzbfh.zzagq()>
	//   19   37:athrow          
		} else
		{
			byte abyte0[] = new byte[i];
	//   20   38:iload_1         
	//   21   39:newarray        byte[]
	//   22   41:astore_2        
			System.arraycopy(((Object) (buffer)), zzebi, ((Object) (abyte0)), 0, i);
	//   23   42:aload_0         
	//   24   43:getfield        #32  <Field byte[] buffer>
	//   25   46:aload_0         
	//   26   47:getfield        #40  <Field int zzebi>
	//   27   50:aload_2         
	//   28   51:iconst_0        
	//   29   52:iload_1         
	//   30   53:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
			zzebi = zzebi + i;
	//   31   56:aload_0         
	//   32   57:aload_0         
	//   33   58:getfield        #40  <Field int zzebi>
	//   34   61:iload_1         
	//   35   62:iadd            
	//   36   63:putfield        #40  <Field int zzebi>
			return abyte0;
	//   37   66:aload_2         
	//   38   67:areturn         
		}
	}

	public final String readString()
		throws IOException
	{
		int i = zzacc();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method int zzacc()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            13
			throw zzbfh.zzagr();
	//    5    9:invokestatic    #60  <Method zzbfh zzbfh.zzagr()>
	//    6   12:athrow          
		if(i > zzebh - zzebi)
	//*   7   13:iload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #36  <Field int zzebh>
	//*  10   18:aload_0         
	//*  11   19:getfield        #40  <Field int zzebi>
	//*  12   22:isub            
	//*  13   23:icmple          30
		{
			throw zzbfh.zzagq();
	//   14   26:invokestatic    #54  <Method zzbfh zzbfh.zzagq()>
	//   15   29:athrow          
		} else
		{
			String s = new String(buffer, zzebi, i, zzbfg.UTF_8);
	//   16   30:new             #88  <Class String>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:getfield        #32  <Field byte[] buffer>
	//   20   38:aload_0         
	//   21   39:getfield        #40  <Field int zzebi>
	//   22   42:iload_1         
	//   23   43:getstatic       #94  <Field java.nio.charset.Charset zzbfg.UTF_8>
	//   24   46:invokespecial   #97  <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   25   49:astore_2        
			zzebi = zzebi + i;
	//   26   50:aload_0         
	//   27   51:aload_0         
	//   28   52:getfield        #40  <Field int zzebi>
	//   29   55:iload_1         
	//   30   56:iadd            
	//   31   57:putfield        #40  <Field int zzebi>
			return s;
	//   32   60:aload_2         
	//   33   61:areturn         
		}
	}

	public final void zza(zzbfi zzbfi1)
		throws IOException
	{
		int i = zzacc();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method int zzacc()>
	//    2    4:istore_2        
		if(zzdpx >= zzdpy)
	//*   3    5:aload_0         
	//*   4    6:getfield        #101 <Field int zzdpx>
	//*   5    9:aload_0         
	//*   6   10:getfield        #27  <Field int zzdpy>
	//*   7   13:icmplt          26
		{
			throw new zzbfh("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
	//    8   16:new             #50  <Class zzbfh>
	//    9   19:dup             
	//   10   20:ldc1            #103 <String "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.">
	//   11   22:invokespecial   #106 <Method void zzbfh(String)>
	//   12   25:athrow          
		} else
		{
			i = zzbr(i);
	//   13   26:aload_0         
	//   14   27:iload_2         
	//   15   28:invokevirtual   #110 <Method int zzbr(int)>
	//   16   31:istore_2        
			zzdpx = zzdpx + 1;
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:getfield        #101 <Field int zzdpx>
	//   20   37:iconst_1        
	//   21   38:iadd            
	//   22   39:putfield        #101 <Field int zzdpx>
			zzbfi1.zza(this);
	//   23   42:aload_1         
	//   24   43:aload_0         
	//   25   44:invokevirtual   #115 <Method zzbfi zzbfi.zza(zzbez)>
	//   26   47:pop             
			zzbp(0);
	//   27   48:aload_0         
	//   28   49:iconst_0        
	//   29   50:invokevirtual   #118 <Method void zzbp(int)>
			zzdpx = zzdpx - 1;
	//   30   53:aload_0         
	//   31   54:aload_0         
	//   32   55:getfield        #101 <Field int zzdpx>
	//   33   58:iconst_1        
	//   34   59:isub            
	//   35   60:putfield        #101 <Field int zzdpx>
			zzbs(i);
	//   36   63:aload_0         
	//   37   64:iload_2         
	//   38   65:invokevirtual   #121 <Method void zzbs(int)>
			return;
	//   39   68:return          
		}
	}

	public final byte[] zzab(int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
		{
			return zzbfl.zzecf;
	//    2    4:getstatic       #78  <Field byte[] zzbfl.zzecf>
	//    3    7:areturn         
		} else
		{
			byte abyte0[] = new byte[j];
	//    4    8:iload_2         
	//    5    9:newarray        byte[]
	//    6   11:astore          4
			int k = zzebf;
	//    7   13:aload_0         
	//    8   14:getfield        #34  <Field int zzebf>
	//    9   17:istore_3        
			System.arraycopy(((Object) (buffer)), k + i, ((Object) (abyte0)), 0, j);
	//   10   18:aload_0         
	//   11   19:getfield        #32  <Field byte[] buffer>
	//   12   22:iload_3         
	//   13   23:iload_1         
	//   14   24:iadd            
	//   15   25:aload           4
	//   16   27:iconst_0        
	//   17   28:iload_2         
	//   18   29:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte0;
	//   19   32:aload           4
	//   20   34:areturn         
		}
	}

	public final int zzabk()
		throws IOException
	{
		if(zzebi == zzebh)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field int zzebi>
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field int zzebh>
	//*   4    8:icmpne          18
		{
			zzdqg = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #126 <Field int zzdqg>
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		}
		zzdqg = zzacc();
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #73  <Method int zzacc()>
	//   13   23:putfield        #126 <Field int zzdqg>
		if(zzdqg == 0)
	//*  14   26:aload_0         
	//*  15   27:getfield        #126 <Field int zzdqg>
	//*  16   30:ifne            43
			throw new zzbfh("Protocol message contained an invalid tag (zero).");
	//   17   33:new             #50  <Class zzbfh>
	//   18   36:dup             
	//   19   37:ldc1            #128 <String "Protocol message contained an invalid tag (zero).">
	//   20   39:invokespecial   #106 <Method void zzbfh(String)>
	//   21   42:athrow          
		else
			return zzdqg;
	//   22   43:aload_0         
	//   23   44:getfield        #126 <Field int zzdqg>
	//   24   47:ireturn         
	}

	public final long zzabm()
		throws IOException
	{
		return zzacd();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method long zzacd()>
	//    2    4:lreturn         
	}

	public final int zzabn()
		throws IOException
	{
		return zzacc();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method int zzacc()>
	//    2    4:ireturn         
	}

	public final boolean zzabq()
		throws IOException
	{
		return zzacc() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method int zzacc()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	final void zzac(int i, int j)
	{
		if(i > zzebi - zzebf)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #40  <Field int zzebi>
	//*   3    5:aload_0         
	//*   4    6:getfield        #34  <Field int zzebf>
	//*   5    9:isub            
	//*   6   10:icmple          79
		{
			j = zzebi;
	//    7   13:aload_0         
	//    8   14:getfield        #40  <Field int zzebi>
	//    9   17:istore_2        
			int k = zzebf;
	//   10   18:aload_0         
	//   11   19:getfield        #34  <Field int zzebf>
	//   12   22:istore_3        
			StringBuilder stringbuilder = new StringBuilder(50);
	//   13   23:new             #140 <Class StringBuilder>
	//   14   26:dup             
	//   15   27:bipush          50
	//   16   29:invokespecial   #142 <Method void StringBuilder(int)>
	//   17   32:astore          4
			stringbuilder.append("Position ");
	//   18   34:aload           4
	//   19   36:ldc1            #144 <String "Position ">
	//   20   38:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			stringbuilder.append(i);
	//   22   42:aload           4
	//   23   44:iload_1         
	//   24   45:invokevirtual   #151 <Method StringBuilder StringBuilder.append(int)>
	//   25   48:pop             
			stringbuilder.append(" is beyond current ");
	//   26   49:aload           4
	//   27   51:ldc1            #153 <String " is beyond current ">
	//   28   53:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			stringbuilder.append(j - k);
	//   30   57:aload           4
	//   31   59:iload_2         
	//   32   60:iload_3         
	//   33   61:isub            
	//   34   62:invokevirtual   #151 <Method StringBuilder StringBuilder.append(int)>
	//   35   65:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   36   66:new             #155 <Class IllegalArgumentException>
	//   37   69:dup             
	//   38   70:aload           4
	//   39   72:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   40   75:invokespecial   #159 <Method void IllegalArgumentException(String)>
	//   41   78:athrow          
		}
		if(i < 0)
	//*  42   79:iload_1         
	//*  43   80:ifge            122
		{
			StringBuilder stringbuilder1 = new StringBuilder(24);
	//   44   83:new             #140 <Class StringBuilder>
	//   45   86:dup             
	//   46   87:bipush          24
	//   47   89:invokespecial   #142 <Method void StringBuilder(int)>
	//   48   92:astore          4
			stringbuilder1.append("Bad position ");
	//   49   94:aload           4
	//   50   96:ldc1            #161 <String "Bad position ">
	//   51   98:invokevirtual   #148 <Method StringBuilder StringBuilder.append(String)>
	//   52  101:pop             
			stringbuilder1.append(i);
	//   53  102:aload           4
	//   54  104:iload_1         
	//   55  105:invokevirtual   #151 <Method StringBuilder StringBuilder.append(int)>
	//   56  108:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//   57  109:new             #155 <Class IllegalArgumentException>
	//   58  112:dup             
	//   59  113:aload           4
	//   60  115:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   61  118:invokespecial   #159 <Method void IllegalArgumentException(String)>
	//   62  121:athrow          
		} else
		{
			zzebi = zzebf + i;
	//   63  122:aload_0         
	//   64  123:aload_0         
	//   65  124:getfield        #34  <Field int zzebf>
	//   66  127:iload_1         
	//   67  128:iadd            
	//   68  129:putfield        #40  <Field int zzebi>
			zzdqg = j;
	//   69  132:aload_0         
	//   70  133:iload_2         
	//   71  134:putfield        #126 <Field int zzdqg>
			return;
	//   72  137:return          
		}
	}

	public final int zzacc()
		throws IOException
	{
		int i;
		int k;
		i = ((int) (zzach()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method byte zzach()>
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
		k = ((int) (zzach()));
	//   11   16:aload_0         
	//   12   17:invokespecial   #163 <Method byte zzach()>
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
		k = ((int) (zzach()));
	//   32   44:aload_0         
	//   33   45:invokespecial   #163 <Method byte zzach()>
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
		k = ((int) (zzach()));
	//   50   71:aload_0         
	//   51   72:invokespecial   #163 <Method byte zzach()>
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
		byte byte0 = zzach();
	//   60   88:aload_0         
	//   61   89:invokespecial   #163 <Method byte zzach()>
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
				if(zzach() >= 0)
	//*  82  119:aload_0         
	//*  83  120:invokespecial   #163 <Method byte zzach()>
	//*  84  123:iflt            128
					return k;
	//   85  126:iload_2         
	//   86  127:ireturn         

	//   87  128:iload_1         
	//   88  129:iconst_1        
	//   89  130:iadd            
	//   90  131:istore_1        
	//*  91  132:goto            114
			throw zzbfh.zzags();
	//   92  135:invokestatic    #166 <Method zzbfh zzbfh.zzags()>
	//   93  138:athrow          
		} else
		{
			return k;
	//   94  139:iload_2         
	//   95  140:ireturn         
		}
	}

	public final long zzacd()
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
			byte byte0 = zzach();
	//    7   10:aload_0         
	//    8   11:invokespecial   #163 <Method byte zzach()>
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
		throw zzbfh.zzags();
	//   30   43:invokestatic    #166 <Method zzbfh zzbfh.zzags()>
	//   31   46:athrow          
	}

	public final int zzagn()
	{
		if(zzdqh == 0x7fffffff)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field int zzdqh>
	//*   2    4:ldc1            #23  <Int 0x7fffffff>
	//*   3    6:icmpne          11
		{
			return -1;
	//    4    9:iconst_m1       
	//    5   10:ireturn         
		} else
		{
			int i = zzebi;
	//    6   11:aload_0         
	//    7   12:getfield        #40  <Field int zzebi>
	//    8   15:istore_1        
			return zzdqh - i;
	//    9   16:aload_0         
	//   10   17:getfield        #25  <Field int zzdqh>
	//   11   20:iload_1         
	//   12   21:isub            
	//   13   22:ireturn         
		}
	}

	public final void zzbp(int i)
		throws zzbfh
	{
		if(zzdqg != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field int zzdqg>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
			throw new zzbfh("Protocol message end-group tag did not match expected tag.");
	//    4    8:new             #50  <Class zzbfh>
	//    5   11:dup             
	//    6   12:ldc1            #169 <String "Protocol message end-group tag did not match expected tag.">
	//    7   14:invokespecial   #106 <Method void zzbfh(String)>
	//    8   17:athrow          
		else
			return;
	//    9   18:return          
	}

	public final boolean zzbq(int i)
		throws IOException
	{
		switch(i & 7)
	//*   0    0:iload_1         
	//*   1    1:bipush          7
	//*   2    3:iand            
		{
	//*   3    4:tableswitch     0 5: default 44
	//	               0 160
	//	               1 118
	//	               2 108
	//	               3 78
	//	               4 76
	//	               5 54
		default:
			throw new zzbfh("Protocol message tag had invalid wire type.");
	//    4   44:new             #50  <Class zzbfh>
	//    5   47:dup             
	//    6   48:ldc1            #173 <String "Protocol message tag had invalid wire type.">
	//    7   50:invokespecial   #106 <Method void zzbfh(String)>
	//    8   53:athrow          

		case 5: // '\005'
			zzach();
	//    9   54:aload_0         
	//   10   55:invokespecial   #163 <Method byte zzach()>
	//   11   58:pop             
			zzach();
	//   12   59:aload_0         
	//   13   60:invokespecial   #163 <Method byte zzach()>
	//   14   63:pop             
			zzach();
	//   15   64:aload_0         
	//   16   65:invokespecial   #163 <Method byte zzach()>
	//   17   68:pop             
			zzach();
	//   18   69:aload_0         
	//   19   70:invokespecial   #163 <Method byte zzach()>
	//   20   73:pop             
			return true;
	//   21   74:iconst_1        
	//   22   75:ireturn         

		case 4: // '\004'
			return false;
	//   23   76:iconst_0        
	//   24   77:ireturn         

		case 3: // '\003'
			int j;
			do
				j = zzabk();
	//   25   78:aload_0         
	//   26   79:invokevirtual   #175 <Method int zzabk()>
	//   27   82:istore_2        
			while(j != 0 && zzbq(j));
	//   28   83:iload_2         
	//   29   84:ifeq            95
	//   30   87:aload_0         
	//   31   88:iload_2         
	//   32   89:invokevirtual   #177 <Method boolean zzbq(int)>
	//   33   92:ifne            78
			zzbp((i >>> 3) << 3 | 4);
	//   34   95:aload_0         
	//   35   96:iload_1         
	//   36   97:iconst_3        
	//   37   98:iushr           
	//   38   99:iconst_3        
	//   39  100:ishl            
	//   40  101:iconst_4        
	//   41  102:ior             
	//   42  103:invokevirtual   #118 <Method void zzbp(int)>
			return true;
	//   43  106:iconst_1        
	//   44  107:ireturn         

		case 2: // '\002'
			zzbt(zzacc());
	//   45  108:aload_0         
	//   46  109:aload_0         
	//   47  110:invokevirtual   #73  <Method int zzacc()>
	//   48  113:invokespecial   #62  <Method void zzbt(int)>
			return true;
	//   49  116:iconst_1        
	//   50  117:ireturn         

		case 1: // '\001'
			zzach();
	//   51  118:aload_0         
	//   52  119:invokespecial   #163 <Method byte zzach()>
	//   53  122:pop             
			zzach();
	//   54  123:aload_0         
	//   55  124:invokespecial   #163 <Method byte zzach()>
	//   56  127:pop             
			zzach();
	//   57  128:aload_0         
	//   58  129:invokespecial   #163 <Method byte zzach()>
	//   59  132:pop             
			zzach();
	//   60  133:aload_0         
	//   61  134:invokespecial   #163 <Method byte zzach()>
	//   62  137:pop             
			zzach();
	//   63  138:aload_0         
	//   64  139:invokespecial   #163 <Method byte zzach()>
	//   65  142:pop             
			zzach();
	//   66  143:aload_0         
	//   67  144:invokespecial   #163 <Method byte zzach()>
	//   68  147:pop             
			zzach();
	//   69  148:aload_0         
	//   70  149:invokespecial   #163 <Method byte zzach()>
	//   71  152:pop             
			zzach();
	//   72  153:aload_0         
	//   73  154:invokespecial   #163 <Method byte zzach()>
	//   74  157:pop             
			return true;
	//   75  158:iconst_1        
	//   76  159:ireturn         

		case 0: // '\0'
			zzacc();
	//   77  160:aload_0         
	//   78  161:invokevirtual   #73  <Method int zzacc()>
	//   79  164:pop             
			return true;
	//   80  165:iconst_1        
	//   81  166:ireturn         
		}
	}

	public final int zzbr(int i)
		throws zzbfh
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw zzbfh.zzagr();
	//    2    4:invokestatic    #60  <Method zzbfh zzbfh.zzagr()>
	//    3    7:athrow          
		i += zzebi;
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field int zzebi>
	//    7   13:iadd            
	//    8   14:istore_1        
		int j = zzdqh;
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field int zzdqh>
	//   11   19:istore_2        
		if(i > j)
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmple          29
		{
			throw zzbfh.zzagq();
	//   15   25:invokestatic    #54  <Method zzbfh zzbfh.zzagq()>
	//   16   28:athrow          
		} else
		{
			zzdqh = i;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:putfield        #25  <Field int zzdqh>
			zzacg();
	//   20   34:aload_0         
	//   21   35:invokespecial   #179 <Method void zzacg()>
			return j;
	//   22   38:iload_2         
	//   23   39:ireturn         
		}
	}

	public final void zzbs(int i)
	{
		zzdqh = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field int zzdqh>
		zzacg();
	//    3    5:aload_0         
	//    4    6:invokespecial   #179 <Method void zzacg()>
	//    5    9:return          
	}

	public final void zzdc(int i)
	{
		zzac(i, zzdqg);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #126 <Field int zzdqg>
	//    4    6:invokevirtual   #182 <Method void zzac(int, int)>
	//    5    9:return          
	}

	private final byte buffer[];
	private int zzdpx;
	private int zzdpy;
	private int zzdpz;
	private int zzdqe;
	private int zzdqg;
	private int zzdqh;
	private final int zzebf;
	private final int zzebg;
	private int zzebh;
	private int zzebi;
}
