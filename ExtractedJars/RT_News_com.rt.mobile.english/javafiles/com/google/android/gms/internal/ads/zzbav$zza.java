// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbav, zzazy, zzbdm, zzbah, 
//			zzbek, zzbcu, zzbep, zzbem

static final class zzbav$zza extends zzbav
{

	public final void write(byte abyte0[], int i, int j)
		throws IOException
	{
		try
		{
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), position, j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #43  <Field byte[] buffer>
	//    4    6:aload_0         
	//    5    7:getfield        #47  <Field int position>
	//    6   10:iload_3         
	//    7   11:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
			position = position + j;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #47  <Field int position>
	//   11   19:iload_3         
	//   12   20:iadd            
	//   13   21:putfield        #47  <Field int position>
			return;
	//   14   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  15   25:astore_1        
		{
			throw new zzbav$zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(j)
			}), ((Throwable) (abyte0)));
	//   16   26:new             #63  <Class zzbav$zzb>
	//   17   29:dup             
	//   18   30:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//   19   32:iconst_3        
	//   20   33:anewarray       Object[]
	//   21   36:dup             
	//   22   37:iconst_0        
	//   23   38:aload_0         
	//   24   39:getfield        #47  <Field int position>
	//   25   42:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   26   45:aastore         
	//   27   46:dup             
	//   28   47:iconst_1        
	//   29   48:aload_0         
	//   30   49:getfield        #49  <Field int limit>
	//   31   52:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   32   55:aastore         
	//   33   56:dup             
	//   34   57:iconst_2        
	//   35   58:iload_3         
	//   36   59:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   37   62:aastore         
	//   38   63:invokestatic    #40  <Method String String.format(String, Object[])>
	//   39   66:aload_1         
	//   40   67:invokespecial   #68  <Method void zzbav$zzb(String, Throwable)>
	//   41   70:athrow          
		}
	}

	public final void zza(byte byte0)
		throws IOException
	{
		int i;
		byte abyte0[];
		try
		{
			abyte0 = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] buffer>
	//    2    4:astore_3        
			i = position;
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field int position>
	//    5    9:istore_2        
			position = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #47  <Field int position>
		}
	//*  11   17:aload_3         
	//*  12   18:iload_2         
	//*  13   19:iload_1         
	//*  14   20:bastore         
	//*  15   21:return          
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//*  16   22:astore_3        
		{
			throw new zzbav$zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
			}), ((Throwable) (indexoutofboundsexception)));
	//   17   23:new             #63  <Class zzbav$zzb>
	//   18   26:dup             
	//   19   27:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//   20   29:iconst_3        
	//   21   30:anewarray       Object[]
	//   22   33:dup             
	//   23   34:iconst_0        
	//   24   35:aload_0         
	//   25   36:getfield        #47  <Field int position>
	//   26   39:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   27   42:aastore         
	//   28   43:dup             
	//   29   44:iconst_1        
	//   30   45:aload_0         
	//   31   46:getfield        #49  <Field int limit>
	//   32   49:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   33   52:aastore         
	//   34   53:dup             
	//   35   54:iconst_2        
	//   36   55:iconst_1        
	//   37   56:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   38   59:aastore         
	//   39   60:invokestatic    #40  <Method String String.format(String, Object[])>
	//   40   63:aload_3         
	//   41   64:invokespecial   #68  <Method void zzbav$zzb(String, Throwable)>
	//   42   67:athrow          
		}
		abyte0[i] = byte0;
	}

	public final void zza(int i, long l)
		throws IOException
	{
		((zzbav)this).zzl(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		((zzbav)this).zzm(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #79  <Method void zzbav.zzm(long)>
	//    7   11:return          
	}

	public final void zza(int i, zzbah zzbah1)
		throws IOException
	{
		((zzbav)this).zzl(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		((zzbav)this).zzan(zzbah1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #84  <Method void zzbav.zzan(zzbah)>
	//    7   11:return          
	}

	public final void zza(int i, zzbcu zzbcu1)
		throws IOException
	{
		((zzbav)this).zzl(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		((zzbav)this).zzn(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #88  <Method void zzbav.zzn(int, int)>
		((zzbav)this).zzl(3, 2);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:iconst_2        
	//   11   15:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		((zzbav)this).zze(zzbcu1);
	//   12   18:aload_0         
	//   13   19:aload_2         
	//   14   20:invokevirtual   #92  <Method void zzbav.zze(zzbcu)>
		((zzbav)this).zzl(1, 4);
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:iconst_4        
	//   18   26:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
	//   19   29:return          
	}

	final void zza(int i, zzbcu zzbcu1, zzbdm zzbdm1)
		throws IOException
	{
		((zzbav)this).zzl(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		zzazy zzazy1 = (zzazy)zzbcu1;
	//    4    6:aload_2         
	//    5    7:checkcast       #95  <Class zzazy>
	//    6   10:astore          5
		int j = zzazy1.zzaaw();
	//    7   12:aload           5
	//    8   14:invokevirtual   #99  <Method int zzazy.zzaaw()>
	//    9   17:istore          4
		i = j;
	//   10   19:iload           4
	//   11   21:istore_1        
		if(j == -1)
	//*  12   22:iload           4
	//*  13   24:iconst_m1       
	//*  14   25:icmpne          43
		{
			i = zzbdm1.zzy(((Object) (zzazy1)));
	//   15   28:aload_3         
	//   16   29:aload           5
	//   17   31:invokeinterface #105 <Method int zzbdm.zzy(Object)>
	//   18   36:istore_1        
			zzazy1.zzbj(i);
	//   19   37:aload           5
	//   20   39:iload_1         
	//   21   40:invokevirtual   #109 <Method void zzazy.zzbj(int)>
		}
		((zzbav)this).zzca(i);
	//   22   43:aload_0         
	//   23   44:iload_1         
	//   24   45:invokevirtual   #112 <Method void zzbav.zzca(int)>
		zzbdm1.zza(((Object) (zzbcu1)), ((zzbey) (zzdqn)));
	//   25   48:aload_3         
	//   26   49:aload_2         
	//   27   50:aload_0         
	//   28   51:getfield        #116 <Field zzbax zzdqn>
	//   29   54:invokeinterface #119 <Method void zzbdm.zza(Object, zzbey)>
	//   30   59:return          
	}

	public final int zzack()
	{
		return limit - position;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int limit>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field int position>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public final void zzan(zzbah zzbah1)
		throws IOException
	{
		((zzbav)this).zzca(zzbah1.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #125 <Method int zzbah.size()>
	//    3    5:invokevirtual   #112 <Method void zzbav.zzca(int)>
		zzbah1.zza(((zzbag) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #128 <Method void zzbah.zza(zzbag)>
	//    7   13:return          
	}

	public final void zzb(int i, zzbah zzbah1)
		throws IOException
	{
		((zzbav)this).zzl(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		((zzbav)this).zzn(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #88  <Method void zzbav.zzn(int, int)>
		((zzbav)this).zza(3, zzbah1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #131 <Method void zzbav.zza(int, zzbah)>
		((zzbav)this).zzl(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
	//   16   24:return          
	}

	public final void zzb(byte abyte0[], int i, int j)
		throws IOException
	{
		((zzbav)this).write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #133 <Method void zzbav.write(byte[], int, int)>
	//    5    7:return          
	}

	public final void zzbz(int i)
		throws IOException
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			((zzbav)this).zzca(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #112 <Method void zzbav.zzca(int)>
			return;
	//    5    9:return          
		} else
		{
			((zzbav)this).zzm(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #79  <Method void zzbav.zzm(long)>
			return;
	//   10   16:return          
		}
	}

	public final void zzc(int i, long l)
		throws IOException
	{
		((zzbav)this).zzl(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		((zzbav)this).zzo(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #138 <Method void zzbav.zzo(long)>
	//    7   11:return          
	}

	public final void zzca(int i)
		throws IOException
	{
		int j;
		j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(zzbav.zzacm())
	//*   2    2:invokestatic    #142 <Method boolean zzbav.zzacm()>
	//*   3    5:ifeq            92
		{
			j = i;
	//    4    8:iload_1         
	//    5    9:istore_2        
			if(((zzbav)this).zzack() >= 10)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #144 <Method int zzbav.zzack()>
	//*   8   14:bipush          10
	//*   9   16:icmplt          92
				do
				{
					if((i & 0xffffff80) == 0)
	//*  10   19:iload_1         
	//*  11   20:bipush          -128
	//*  12   22:iand            
	//*  13   23:ifne            52
					{
						byte abyte0[] = buffer;
	//   14   26:aload_0         
	//   15   27:getfield        #43  <Field byte[] buffer>
	//   16   30:astore_3        
						j = position;
	//   17   31:aload_0         
	//   18   32:getfield        #47  <Field int position>
	//   19   35:istore_2        
						position = j + 1;
	//   20   36:aload_0         
	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:putfield        #47  <Field int position>
						zzbek.zza(abyte0, j, (byte)i);
	//   25   43:aload_3         
	//   26   44:iload_2         
	//   27   45:i2l             
	//   28   46:iload_1         
	//   29   47:int2byte        
	//   30   48:invokestatic    #149 <Method void zzbek.zza(byte[], long, byte)>
						return;
	//   31   51:return          
					}
					byte abyte1[] = buffer;
	//   32   52:aload_0         
	//   33   53:getfield        #43  <Field byte[] buffer>
	//   34   56:astore_3        
					j = position;
	//   35   57:aload_0         
	//   36   58:getfield        #47  <Field int position>
	//   37   61:istore_2        
					position = j + 1;
	//   38   62:aload_0         
	//   39   63:iload_2         
	//   40   64:iconst_1        
	//   41   65:iadd            
	//   42   66:putfield        #47  <Field int position>
					zzbek.zza(abyte1, j, (byte)(i & 0x7f | 0x80));
	//   43   69:aload_3         
	//   44   70:iload_2         
	//   45   71:i2l             
	//   46   72:iload_1         
	//   47   73:bipush          127
	//   48   75:iand            
	//   49   76:sipush          128
	//   50   79:ior             
	//   51   80:int2byte        
	//   52   81:invokestatic    #149 <Method void zzbek.zza(byte[], long, byte)>
					i >>>= 7;
	//   53   84:iload_1         
	//   54   85:bipush          7
	//   55   87:iushr           
	//   56   88:istore_1        
				} while(true);
	//   57   89:goto            19
		}
_L1:
		IndexOutOfBoundsException indexoutofboundsexception;
		if((j & 0xffffff80) == 0)
	//*  58   92:iload_2         
	//*  59   93:bipush          -128
	//*  60   95:iand            
	//*  61   96:ifne            122
		{
			byte abyte2[];
			try
			{
				abyte2 = buffer;
	//   62   99:aload_0         
	//   63  100:getfield        #43  <Field byte[] buffer>
	//   64  103:astore_3        
				i = position;
	//   65  104:aload_0         
	//   66  105:getfield        #47  <Field int position>
	//   67  108:istore_1        
				position = i + 1;
	//   68  109:aload_0         
	//   69  110:iload_1         
	//   70  111:iconst_1        
	//   71  112:iadd            
	//   72  113:putfield        #47  <Field int position>
			}
	//*  73  116:aload_3         
	//*  74  117:iload_1         
	//*  75  118:iload_2         
	//*  76  119:int2byte        
	//*  77  120:bastore         
	//*  78  121:return          
	//*  79  122:aload_0         
	//*  80  123:getfield        #43  <Field byte[] buffer>
	//*  81  126:astore_3        
	//*  82  127:aload_0         
	//*  83  128:getfield        #47  <Field int position>
	//*  84  131:istore_1        
	//*  85  132:aload_0         
	//*  86  133:iload_1         
	//*  87  134:iconst_1        
	//*  88  135:iadd            
	//*  89  136:putfield        #47  <Field int position>
	//*  90  139:aload_3         
	//*  91  140:iload_1         
	//*  92  141:iload_2         
	//*  93  142:bipush          127
	//*  94  144:iand            
	//*  95  145:sipush          128
	//*  96  148:ior             
	//*  97  149:int2byte        
	//*  98  150:bastore         
	//*  99  151:iload_2         
	//* 100  152:bipush          7
	//* 101  154:iushr           
	//* 102  155:istore_2        
	//* 103  156:goto            92
	//* 104  159:new             #63  <Class zzbav$zzb>
	//* 105  162:dup             
	//* 106  163:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//* 107  165:iconst_3        
	//* 108  166:anewarray       Object[]
	//* 109  169:dup             
	//* 110  170:iconst_0        
	//* 111  171:aload_0         
	//* 112  172:getfield        #47  <Field int position>
	//* 113  175:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//* 114  178:aastore         
	//* 115  179:dup             
	//* 116  180:iconst_1        
	//* 117  181:aload_0         
	//* 118  182:getfield        #49  <Field int limit>
	//* 119  185:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//* 120  188:aastore         
	//* 121  189:dup             
	//* 122  190:iconst_2        
	//* 123  191:iconst_1        
	//* 124  192:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//* 125  195:aastore         
	//* 126  196:invokestatic    #40  <Method String String.format(String, Object[])>
	//* 127  199:aload_3         
	//* 128  200:invokespecial   #68  <Method void zzbav$zzb(String, Throwable)>
	//* 129  203:athrow          
			// Misplaced declaration of an exception variable
			catch(IndexOutOfBoundsException indexoutofboundsexception)
			{
				throw new zzbav$zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
			}
			abyte2[i] = (byte)j;
			return;
		}
		abyte2 = buffer;
		i = position;
		position = i + 1;
		abyte2[i] = (byte)(j & 0x7f | 0x80);
		j >>>= 7;
		  goto _L1
	//* 130  204:astore_3        
	//* 131  205:goto            159
	}

	public final void zzcc(int i)
		throws IOException
	{
		int j;
		byte abyte0[];
		try
		{
			abyte0 = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] buffer>
	//    2    4:astore_3        
			j = position;
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field int position>
	//    5    9:istore_2        
			position = j + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #47  <Field int position>
		}
	//*  11   17:aload_3         
	//*  12   18:iload_2         
	//*  13   19:iload_1         
	//*  14   20:int2byte        
	//*  15   21:bastore         
	//*  16   22:aload_0         
	//*  17   23:getfield        #43  <Field byte[] buffer>
	//*  18   26:astore_3        
	//*  19   27:aload_0         
	//*  20   28:getfield        #47  <Field int position>
	//*  21   31:istore_2        
	//*  22   32:aload_0         
	//*  23   33:iload_2         
	//*  24   34:iconst_1        
	//*  25   35:iadd            
	//*  26   36:putfield        #47  <Field int position>
	//*  27   39:aload_3         
	//*  28   40:iload_2         
	//*  29   41:iload_1         
	//*  30   42:bipush          8
	//*  31   44:ishr            
	//*  32   45:int2byte        
	//*  33   46:bastore         
	//*  34   47:aload_0         
	//*  35   48:getfield        #43  <Field byte[] buffer>
	//*  36   51:astore_3        
	//*  37   52:aload_0         
	//*  38   53:getfield        #47  <Field int position>
	//*  39   56:istore_2        
	//*  40   57:aload_0         
	//*  41   58:iload_2         
	//*  42   59:iconst_1        
	//*  43   60:iadd            
	//*  44   61:putfield        #47  <Field int position>
	//*  45   64:aload_3         
	//*  46   65:iload_2         
	//*  47   66:iload_1         
	//*  48   67:bipush          16
	//*  49   69:ishr            
	//*  50   70:int2byte        
	//*  51   71:bastore         
	//*  52   72:aload_0         
	//*  53   73:getfield        #43  <Field byte[] buffer>
	//*  54   76:astore_3        
	//*  55   77:aload_0         
	//*  56   78:getfield        #47  <Field int position>
	//*  57   81:istore_2        
	//*  58   82:aload_0         
	//*  59   83:iload_2         
	//*  60   84:iconst_1        
	//*  61   85:iadd            
	//*  62   86:putfield        #47  <Field int position>
	//*  63   89:aload_3         
	//*  64   90:iload_2         
	//*  65   91:iload_1         
	//*  66   92:bipush          24
	//*  67   94:ishr            
	//*  68   95:bastore         
	//*  69   96:return          
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//*  70   97:astore_3        
		{
			throw new zzbav$zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
			}), ((Throwable) (indexoutofboundsexception)));
	//   71   98:new             #63  <Class zzbav$zzb>
	//   72  101:dup             
	//   73  102:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//   74  104:iconst_3        
	//   75  105:anewarray       Object[]
	//   76  108:dup             
	//   77  109:iconst_0        
	//   78  110:aload_0         
	//   79  111:getfield        #47  <Field int position>
	//   80  114:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   81  117:aastore         
	//   82  118:dup             
	//   83  119:iconst_1        
	//   84  120:aload_0         
	//   85  121:getfield        #49  <Field int limit>
	//   86  124:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   87  127:aastore         
	//   88  128:dup             
	//   89  129:iconst_2        
	//   90  130:iconst_1        
	//   91  131:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   92  134:aastore         
	//   93  135:invokestatic    #40  <Method String String.format(String, Object[])>
	//   94  138:aload_3         
	//   95  139:invokespecial   #68  <Method void zzbav$zzb(String, Throwable)>
	//   96  142:athrow          
		}
		abyte0[j] = (byte)i;
		abyte0 = buffer;
		j = position;
		position = j + 1;
		abyte0[j] = (byte)(i >> 8);
		abyte0 = buffer;
		j = position;
		position = j + 1;
		abyte0[j] = (byte)(i >> 16);
		abyte0 = buffer;
		j = position;
		position = j + 1;
		abyte0[j] = ((byte) (i >> 24));
		return;
	}

	public final void zze(zzbcu zzbcu1)
		throws IOException
	{
		((zzbav)this).zzca(zzbcu1.zzacw());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #155 <Method int zzbcu.zzacw()>
	//    3    7:invokevirtual   #112 <Method void zzbav.zzca(int)>
		zzbcu1.zzb(((zzbav) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #158 <Method void zzbcu.zzb(zzbav)>
	//    7   17:return          
	}

	public final void zze(byte abyte0[], int i, int j)
		throws IOException
	{
		((zzbav)this).zzca(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #112 <Method void zzbav.zzca(int)>
		((zzbav)this).write(abyte0, 0, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:iload_3         
	//    7    9:invokevirtual   #133 <Method void zzbav.write(byte[], int, int)>
	//    8   12:return          
	}

	public final void zzen(String s)
		throws IOException
	{
		int i = position;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int position>
	//    2    4:istore_2        
		int j;
		int k;
		try
		{
			k = zzcf(s.length() * 3);
	//    3    5:aload_1         
	//    4    6:invokevirtual   #164 <Method int String.length()>
	//    5    9:iconst_3        
	//    6   10:imul            
	//    7   11:invokestatic    #168 <Method int zzcf(int)>
	//    8   14:istore          4
			j = zzcf(s.length());
	//    9   16:aload_1         
	//   10   17:invokevirtual   #164 <Method int String.length()>
	//   11   20:invokestatic    #168 <Method int zzcf(int)>
	//   12   23:istore_3        
		}
	//*  13   24:iload_3         
	//*  14   25:iload           4
	//*  15   27:icmpne          77
	//*  16   30:aload_0         
	//*  17   31:iload_2         
	//*  18   32:iload_3         
	//*  19   33:iadd            
	//*  20   34:putfield        #47  <Field int position>
	//*  21   37:aload_1         
	//*  22   38:aload_0         
	//*  23   39:getfield        #43  <Field byte[] buffer>
	//*  24   42:aload_0         
	//*  25   43:getfield        #47  <Field int position>
	//*  26   46:aload_0         
	//*  27   47:invokevirtual   #144 <Method int zzbav.zzack()>
	//*  28   50:invokestatic    #173 <Method int zzbem.zza(CharSequence, byte[], int, int)>
	//*  29   53:istore          4
	//*  30   55:aload_0         
	//*  31   56:iload_2         
	//*  32   57:putfield        #47  <Field int position>
	//*  33   60:aload_0         
	//*  34   61:iload           4
	//*  35   63:iload_2         
	//*  36   64:isub            
	//*  37   65:iload_3         
	//*  38   66:isub            
	//*  39   67:invokevirtual   #112 <Method void zzbav.zzca(int)>
	//*  40   70:aload_0         
	//*  41   71:iload           4
	//*  42   73:putfield        #47  <Field int position>
	//*  43   76:return          
	//*  44   77:aload_0         
	//*  45   78:aload_1         
	//*  46   79:invokestatic    #176 <Method int zzbem.zza(CharSequence)>
	//*  47   82:invokevirtual   #112 <Method void zzbav.zzca(int)>
	//*  48   85:aload_0         
	//*  49   86:aload_1         
	//*  50   87:aload_0         
	//*  51   88:getfield        #43  <Field byte[] buffer>
	//*  52   91:aload_0         
	//*  53   92:getfield        #47  <Field int position>
	//*  54   95:aload_0         
	//*  55   96:invokevirtual   #144 <Method int zzbav.zzack()>
	//*  56   99:invokestatic    #173 <Method int zzbem.zza(CharSequence, byte[], int, int)>
	//*  57  102:putfield        #47  <Field int position>
	//*  58  105:return          
	//*  59  106:astore_1        
	//*  60  107:new             #63  <Class zzbav$zzb>
	//*  61  110:dup             
	//*  62  111:aload_1         
	//*  63  112:invokespecial   #179 <Method void zzbav$zzb(Throwable)>
	//*  64  115:athrow          
		catch(zzbep zzbep1)
	//*  65  116:astore          5
		{
			position = i;
	//   66  118:aload_0         
	//   67  119:iload_2         
	//   68  120:putfield        #47  <Field int position>
			((zzbav)this).zza(s, zzbep1);
	//   69  123:aload_0         
	//   70  124:aload_1         
	//   71  125:aload           5
	//   72  127:invokevirtual   #182 <Method void zzbav.zza(String, zzbep)>
			return;
	//   73  130:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new zzbav$zzb(((Throwable) (s)));
		}
		if(j != k)
			break MISSING_BLOCK_LABEL_77;
		position = i + j;
		k = zzbem.zza(((CharSequence) (s)), buffer, position, ((zzbav)this).zzack());
		position = i;
		((zzbav)this).zzca(k - i - j);
		position = k;
		return;
		((zzbav)this).zzca(zzbem.zza(((CharSequence) (s))));
		position = zzbem.zza(((CharSequence) (s)), buffer, position, ((zzbav)this).zzack());
		return;
	}

	public final void zzf(int i, String s)
		throws IOException
	{
		((zzbav)this).zzl(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		((zzbav)this).zzen(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #186 <Method void zzbav.zzen(String)>
	//    7   11:return          
	}

	public final void zzf(int i, boolean flag)
		throws IOException
	{
		((zzbav)this).zzl(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		((zzbav)this).zza((byte)flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:int2byte        
	//    7    9:invokevirtual   #189 <Method void zzbav.zza(byte)>
	//    8   12:return          
	}

	public final void zzl(int i, int j)
		throws IOException
	{
		((zzbav)this).zzca(i << 3 | j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:ishl            
	//    4    4:iload_2         
	//    5    5:ior             
	//    6    6:invokevirtual   #112 <Method void zzbav.zzca(int)>
	//    7    9:return          
	}

	public final void zzm(int i, int j)
		throws IOException
	{
		((zzbav)this).zzl(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		((zzbav)this).zzbz(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #191 <Method void zzbav.zzbz(int)>
	//    7   11:return          
	}

	public final void zzm(long l)
		throws IOException
	{
		long l1;
		l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore          4
		if(zzbav.zzacm())
	//*   2    3:invokestatic    #142 <Method boolean zzbav.zzacm()>
	//*   3    6:ifeq            103
		{
			l1 = l;
	//    4    9:lload_1         
	//    5   10:lstore          4
			if(((zzbav)this).zzack() >= 10)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #144 <Method int zzbav.zzack()>
	//*   8   16:bipush          10
	//*   9   18:icmplt          103
				do
				{
					if((l & -128L) == 0L)
	//*  10   21:lload_1         
	//*  11   22:ldc2w           #192 <Long -128L>
	//*  12   25:land            
	//*  13   26:lconst_0        
	//*  14   27:lcmp            
	//*  15   28:ifne            60
					{
						byte abyte0[] = buffer;
	//   16   31:aload_0         
	//   17   32:getfield        #43  <Field byte[] buffer>
	//   18   35:astore          6
						int i = position;
	//   19   37:aload_0         
	//   20   38:getfield        #47  <Field int position>
	//   21   41:istore_3        
						position = i + 1;
	//   22   42:aload_0         
	//   23   43:iload_3         
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:putfield        #47  <Field int position>
						zzbek.zza(abyte0, i, (byte)(int)l);
	//   27   49:aload           6
	//   28   51:iload_3         
	//   29   52:i2l             
	//   30   53:lload_1         
	//   31   54:l2i             
	//   32   55:int2byte        
	//   33   56:invokestatic    #149 <Method void zzbek.zza(byte[], long, byte)>
						return;
	//   34   59:return          
					}
					byte abyte1[] = buffer;
	//   35   60:aload_0         
	//   36   61:getfield        #43  <Field byte[] buffer>
	//   37   64:astore          6
					int j = position;
	//   38   66:aload_0         
	//   39   67:getfield        #47  <Field int position>
	//   40   70:istore_3        
					position = j + 1;
	//   41   71:aload_0         
	//   42   72:iload_3         
	//   43   73:iconst_1        
	//   44   74:iadd            
	//   45   75:putfield        #47  <Field int position>
					zzbek.zza(abyte1, j, (byte)((int)l & 0x7f | 0x80));
	//   46   78:aload           6
	//   47   80:iload_3         
	//   48   81:i2l             
	//   49   82:lload_1         
	//   50   83:l2i             
	//   51   84:bipush          127
	//   52   86:iand            
	//   53   87:sipush          128
	//   54   90:ior             
	//   55   91:int2byte        
	//   56   92:invokestatic    #149 <Method void zzbek.zza(byte[], long, byte)>
					l >>>= 7;
	//   57   95:lload_1         
	//   58   96:bipush          7
	//   59   98:lushr           
	//   60   99:lstore_1        
				} while(true);
	//   61  100:goto            21
		}
_L1:
		IndexOutOfBoundsException indexoutofboundsexception;
		if((l1 & -128L) == 0L)
	//*  62  103:lload           4
	//*  63  105:ldc2w           #192 <Long -128L>
	//*  64  108:land            
	//*  65  109:lconst_0        
	//*  66  110:lcmp            
	//*  67  111:ifne            141
		{
			int k;
			byte abyte2[];
			try
			{
				abyte2 = buffer;
	//   68  114:aload_0         
	//   69  115:getfield        #43  <Field byte[] buffer>
	//   70  118:astore          6
				k = position;
	//   71  120:aload_0         
	//   72  121:getfield        #47  <Field int position>
	//   73  124:istore_3        
				position = k + 1;
	//   74  125:aload_0         
	//   75  126:iload_3         
	//   76  127:iconst_1        
	//   77  128:iadd            
	//   78  129:putfield        #47  <Field int position>
			}
	//*  79  132:aload           6
	//*  80  134:iload_3         
	//*  81  135:lload           4
	//*  82  137:l2i             
	//*  83  138:int2byte        
	//*  84  139:bastore         
	//*  85  140:return          
	//*  86  141:aload_0         
	//*  87  142:getfield        #43  <Field byte[] buffer>
	//*  88  145:astore          6
	//*  89  147:aload_0         
	//*  90  148:getfield        #47  <Field int position>
	//*  91  151:istore_3        
	//*  92  152:aload_0         
	//*  93  153:iload_3         
	//*  94  154:iconst_1        
	//*  95  155:iadd            
	//*  96  156:putfield        #47  <Field int position>
	//*  97  159:aload           6
	//*  98  161:iload_3         
	//*  99  162:lload           4
	//* 100  164:l2i             
	//* 101  165:bipush          127
	//* 102  167:iand            
	//* 103  168:sipush          128
	//* 104  171:ior             
	//* 105  172:int2byte        
	//* 106  173:bastore         
	//* 107  174:lload           4
	//* 108  176:bipush          7
	//* 109  178:lushr           
	//* 110  179:lstore          4
	//* 111  181:goto            103
	//* 112  184:new             #63  <Class zzbav$zzb>
	//* 113  187:dup             
	//* 114  188:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//* 115  190:iconst_3        
	//* 116  191:anewarray       Object[]
	//* 117  194:dup             
	//* 118  195:iconst_0        
	//* 119  196:aload_0         
	//* 120  197:getfield        #47  <Field int position>
	//* 121  200:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//* 122  203:aastore         
	//* 123  204:dup             
	//* 124  205:iconst_1        
	//* 125  206:aload_0         
	//* 126  207:getfield        #49  <Field int limit>
	//* 127  210:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//* 128  213:aastore         
	//* 129  214:dup             
	//* 130  215:iconst_2        
	//* 131  216:iconst_1        
	//* 132  217:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//* 133  220:aastore         
	//* 134  221:invokestatic    #40  <Method String String.format(String, Object[])>
	//* 135  224:aload           6
	//* 136  226:invokespecial   #68  <Method void zzbav$zzb(String, Throwable)>
	//* 137  229:athrow          
			// Misplaced declaration of an exception variable
			catch(IndexOutOfBoundsException indexoutofboundsexception)
			{
				throw new zzbav$zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
			}
			abyte2[k] = (byte)(int)l1;
			return;
		}
		abyte2 = buffer;
		k = position;
		position = k + 1;
		abyte2[k] = (byte)((int)l1 & 0x7f | 0x80);
		l1 >>>= 7;
		  goto _L1
	//* 138  230:astore          6
	//* 139  232:goto            184
	}

	public final void zzn(int i, int j)
		throws IOException
	{
		((zzbav)this).zzl(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		((zzbav)this).zzca(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #112 <Method void zzbav.zzca(int)>
	//    7   11:return          
	}

	public final void zzo(long l)
		throws IOException
	{
		int i;
		byte abyte0[];
		try
		{
			abyte0 = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] buffer>
	//    2    4:astore          4
			i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #47  <Field int position>
	//    5   10:istore_3        
			position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_3         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #47  <Field int position>
		}
	//*  11   18:aload           4
	//*  12   20:iload_3         
	//*  13   21:lload_1         
	//*  14   22:l2i             
	//*  15   23:int2byte        
	//*  16   24:bastore         
	//*  17   25:aload_0         
	//*  18   26:getfield        #43  <Field byte[] buffer>
	//*  19   29:astore          4
	//*  20   31:aload_0         
	//*  21   32:getfield        #47  <Field int position>
	//*  22   35:istore_3        
	//*  23   36:aload_0         
	//*  24   37:iload_3         
	//*  25   38:iconst_1        
	//*  26   39:iadd            
	//*  27   40:putfield        #47  <Field int position>
	//*  28   43:aload           4
	//*  29   45:iload_3         
	//*  30   46:lload_1         
	//*  31   47:bipush          8
	//*  32   49:lshr            
	//*  33   50:l2i             
	//*  34   51:int2byte        
	//*  35   52:bastore         
	//*  36   53:aload_0         
	//*  37   54:getfield        #43  <Field byte[] buffer>
	//*  38   57:astore          4
	//*  39   59:aload_0         
	//*  40   60:getfield        #47  <Field int position>
	//*  41   63:istore_3        
	//*  42   64:aload_0         
	//*  43   65:iload_3         
	//*  44   66:iconst_1        
	//*  45   67:iadd            
	//*  46   68:putfield        #47  <Field int position>
	//*  47   71:aload           4
	//*  48   73:iload_3         
	//*  49   74:lload_1         
	//*  50   75:bipush          16
	//*  51   77:lshr            
	//*  52   78:l2i             
	//*  53   79:int2byte        
	//*  54   80:bastore         
	//*  55   81:aload_0         
	//*  56   82:getfield        #43  <Field byte[] buffer>
	//*  57   85:astore          4
	//*  58   87:aload_0         
	//*  59   88:getfield        #47  <Field int position>
	//*  60   91:istore_3        
	//*  61   92:aload_0         
	//*  62   93:iload_3         
	//*  63   94:iconst_1        
	//*  64   95:iadd            
	//*  65   96:putfield        #47  <Field int position>
	//*  66   99:aload           4
	//*  67  101:iload_3         
	//*  68  102:lload_1         
	//*  69  103:bipush          24
	//*  70  105:lshr            
	//*  71  106:l2i             
	//*  72  107:int2byte        
	//*  73  108:bastore         
	//*  74  109:aload_0         
	//*  75  110:getfield        #43  <Field byte[] buffer>
	//*  76  113:astore          4
	//*  77  115:aload_0         
	//*  78  116:getfield        #47  <Field int position>
	//*  79  119:istore_3        
	//*  80  120:aload_0         
	//*  81  121:iload_3         
	//*  82  122:iconst_1        
	//*  83  123:iadd            
	//*  84  124:putfield        #47  <Field int position>
	//*  85  127:aload           4
	//*  86  129:iload_3         
	//*  87  130:lload_1         
	//*  88  131:bipush          32
	//*  89  133:lshr            
	//*  90  134:l2i             
	//*  91  135:int2byte        
	//*  92  136:bastore         
	//*  93  137:aload_0         
	//*  94  138:getfield        #43  <Field byte[] buffer>
	//*  95  141:astore          4
	//*  96  143:aload_0         
	//*  97  144:getfield        #47  <Field int position>
	//*  98  147:istore_3        
	//*  99  148:aload_0         
	//* 100  149:iload_3         
	//* 101  150:iconst_1        
	//* 102  151:iadd            
	//* 103  152:putfield        #47  <Field int position>
	//* 104  155:aload           4
	//* 105  157:iload_3         
	//* 106  158:lload_1         
	//* 107  159:bipush          40
	//* 108  161:lshr            
	//* 109  162:l2i             
	//* 110  163:int2byte        
	//* 111  164:bastore         
	//* 112  165:aload_0         
	//* 113  166:getfield        #43  <Field byte[] buffer>
	//* 114  169:astore          4
	//* 115  171:aload_0         
	//* 116  172:getfield        #47  <Field int position>
	//* 117  175:istore_3        
	//* 118  176:aload_0         
	//* 119  177:iload_3         
	//* 120  178:iconst_1        
	//* 121  179:iadd            
	//* 122  180:putfield        #47  <Field int position>
	//* 123  183:aload           4
	//* 124  185:iload_3         
	//* 125  186:lload_1         
	//* 126  187:bipush          48
	//* 127  189:lshr            
	//* 128  190:l2i             
	//* 129  191:int2byte        
	//* 130  192:bastore         
	//* 131  193:aload_0         
	//* 132  194:getfield        #43  <Field byte[] buffer>
	//* 133  197:astore          4
	//* 134  199:aload_0         
	//* 135  200:getfield        #47  <Field int position>
	//* 136  203:istore_3        
	//* 137  204:aload_0         
	//* 138  205:iload_3         
	//* 139  206:iconst_1        
	//* 140  207:iadd            
	//* 141  208:putfield        #47  <Field int position>
	//* 142  211:aload           4
	//* 143  213:iload_3         
	//* 144  214:lload_1         
	//* 145  215:bipush          56
	//* 146  217:lshr            
	//* 147  218:l2i             
	//* 148  219:int2byte        
	//* 149  220:bastore         
	//* 150  221:return          
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//* 151  222:astore          4
		{
			throw new zzbav$zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
			}), ((Throwable) (indexoutofboundsexception)));
	//  152  224:new             #63  <Class zzbav$zzb>
	//  153  227:dup             
	//  154  228:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//  155  230:iconst_3        
	//  156  231:anewarray       Object[]
	//  157  234:dup             
	//  158  235:iconst_0        
	//  159  236:aload_0         
	//  160  237:getfield        #47  <Field int position>
	//  161  240:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  162  243:aastore         
	//  163  244:dup             
	//  164  245:iconst_1        
	//  165  246:aload_0         
	//  166  247:getfield        #49  <Field int limit>
	//  167  250:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  168  253:aastore         
	//  169  254:dup             
	//  170  255:iconst_2        
	//  171  256:iconst_1        
	//  172  257:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  173  260:aastore         
	//  174  261:invokestatic    #40  <Method String String.format(String, Object[])>
	//  175  264:aload           4
	//  176  266:invokespecial   #68  <Method void zzbav$zzb(String, Throwable)>
	//  177  269:athrow          
		}
		abyte0[i] = (byte)(int)l;
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)(int)(l >> 8);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)(int)(l >> 16);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)(int)(l >> 24);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)(int)(l >> 32);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)(int)(l >> 40);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)(int)(l >> 48);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)(int)(l >> 56);
		return;
	}

	public final void zzp(int i, int j)
		throws IOException
	{
		((zzbav)this).zzl(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #75  <Method void zzbav.zzl(int, int)>
		((zzbav)this).zzcc(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #196 <Method void zzbav.zzcc(int)>
	//    7   11:return          
	}

	private final byte buffer[];
	private final int limit;
	private final int offset;
	private int position;

	zzbav$zza(byte abyte0[], int i, int j)
	{
		super(((zzbaw) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #16  <Method void zzbav(zzbaw)>
		if(abyte0 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
			throw new NullPointerException("buffer");
	//    5    9:new             #18  <Class NullPointerException>
	//    6   12:dup             
	//    7   13:ldc1            #19  <String "buffer">
	//    8   15:invokespecial   #22  <Method void NullPointerException(String)>
	//    9   18:athrow          
		i = abyte0.length;
	//   10   19:aload_1         
	//   11   20:arraylength     
	//   12   21:istore_2        
		int k = j + 0;
	//   13   22:iload_3         
	//   14   23:iconst_0        
	//   15   24:iadd            
	//   16   25:istore          4
		if((0 | j | i - k) < 0)
	//*  17   27:iconst_0        
	//*  18   28:iload_3         
	//*  19   29:ior             
	//*  20   30:iload_2         
	//*  21   31:iload           4
	//*  22   33:isub            
	//*  23   34:ior             
	//*  24   35:ifge            77
		{
			throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] {
				Integer.valueOf(abyte0.length), Integer.valueOf(0), Integer.valueOf(j)
			}));
	//   25   38:new             #24  <Class IllegalArgumentException>
	//   26   41:dup             
	//   27   42:ldc1            #26  <String "Array range is invalid. Buffer.length=%d, offset=%d, length=%d">
	//   28   44:iconst_3        
	//   29   45:anewarray       Object[]
	//   30   48:dup             
	//   31   49:iconst_0        
	//   32   50:aload_1         
	//   33   51:arraylength     
	//   34   52:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   35   55:aastore         
	//   36   56:dup             
	//   37   57:iconst_1        
	//   38   58:iconst_0        
	//   39   59:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   40   62:aastore         
	//   41   63:dup             
	//   42   64:iconst_2        
	//   43   65:iload_3         
	//   44   66:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   45   69:aastore         
	//   46   70:invokestatic    #40  <Method String String.format(String, Object[])>
	//   47   73:invokespecial   #41  <Method void IllegalArgumentException(String)>
	//   48   76:athrow          
		} else
		{
			buffer = abyte0;
	//   49   77:aload_0         
	//   50   78:aload_1         
	//   51   79:putfield        #43  <Field byte[] buffer>
			offset = 0;
	//   52   82:aload_0         
	//   53   83:iconst_0        
	//   54   84:putfield        #45  <Field int offset>
			position = 0;
	//   55   87:aload_0         
	//   56   88:iconst_0        
	//   57   89:putfield        #47  <Field int position>
			limit = k;
	//   58   92:aload_0         
	//   59   93:iload           4
	//   60   95:putfield        #49  <Field int limit>
			return;
	//   61   98:return          
		}
	}
}
