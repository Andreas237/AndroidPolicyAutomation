// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjs, zzjr, zzgf, zzez, 
//			zzfk, zzfy, zzjt, zzjw, 
//			zzhq

public final class zzjk
{

	private zzjk(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzso = 0x7fffffff;
	//    2    4:aload_0         
	//    3    5:ldc1            #25  <Int 0x7fffffff>
	//    4    7:putfield        #27  <Field int zzso>
		zzsg = 64;
	//    5   10:aload_0         
	//    6   11:bipush          64
	//    7   13:putfield        #29  <Field int zzsg>
		zzsh = 0x4000000;
	//    8   16:aload_0         
	//    9   17:ldc1            #30  <Int 0x4000000>
	//   10   19:putfield        #32  <Field int zzsh>
		buffer = abyte0;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #34  <Field byte[] buffer>
		zzacz = i;
	//   14   27:aload_0         
	//   15   28:iload_2         
	//   16   29:putfield        #36  <Field int zzacz>
		j += i;
	//   17   32:iload_3         
	//   18   33:iload_2         
	//   19   34:iadd            
	//   20   35:istore_3        
		zzadb = j;
	//   21   36:aload_0         
	//   22   37:iload_3         
	//   23   38:putfield        #38  <Field int zzadb>
		zzada = j;
	//   24   41:aload_0         
	//   25   42:iload_3         
	//   26   43:putfield        #40  <Field int zzada>
		zzadc = i;
	//   27   46:aload_0         
	//   28   47:iload_2         
	//   29   48:putfield        #42  <Field int zzadc>
	//   30   51:return          
	}

	private final void zzap(int i)
		throws IOException
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            54
		{
			int j = zzadc;
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field int zzadc>
	//    4    8:istore_2        
			int k = zzso;
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field int zzso>
	//    7   13:istore_3        
			if(j + i <= k)
	//*   8   14:iload_2         
	//*   9   15:iload_1         
	//*  10   16:iadd            
	//*  11   17:iload_3         
	//*  12   18:icmpgt          43
			{
				if(i <= zzadb - j)
	//*  13   21:iload_1         
	//*  14   22:aload_0         
	//*  15   23:getfield        #38  <Field int zzadb>
	//*  16   26:iload_2         
	//*  17   27:isub            
	//*  18   28:icmpgt          39
				{
					zzadc = j + i;
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:iload_1         
	//   22   34:iadd            
	//   23   35:putfield        #42  <Field int zzadc>
					return;
	//   24   38:return          
				} else
				{
					throw zzjs.zzht();
	//   25   39:invokestatic    #53  <Method zzjs zzjs.zzht()>
	//   26   42:athrow          
				}
			} else
			{
				zzap(k - j);
	//   27   43:aload_0         
	//   28   44:iload_3         
	//   29   45:iload_2         
	//   30   46:isub            
	//   31   47:invokespecial   #55  <Method void zzap(int)>
				throw zzjs.zzht();
	//   32   50:invokestatic    #53  <Method zzjs zzjs.zzht()>
	//   33   53:athrow          
			}
		} else
		{
			throw zzjs.zzhu();
	//   34   54:invokestatic    #58  <Method zzjs zzjs.zzhu()>
	//   35   57:athrow          
		}
	}

	private final void zzdx()
	{
		zzadb = zzadb + zzsl;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field int zzadb>
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field int zzsl>
	//    5    9:iadd            
	//    6   10:putfield        #38  <Field int zzadb>
		int i = zzadb;
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field int zzadb>
	//    9   17:istore_1        
		int j = zzso;
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field int zzso>
	//   12   22:istore_2        
		if(i > j)
	//*  13   23:iload_1         
	//*  14   24:iload_2         
	//*  15   25:icmple          46
		{
			zzsl = i - j;
	//   16   28:aload_0         
	//   17   29:iload_1         
	//   18   30:iload_2         
	//   19   31:isub            
	//   20   32:putfield        #62  <Field int zzsl>
			zzadb = i - zzsl;
	//   21   35:aload_0         
	//   22   36:iload_1         
	//   23   37:aload_0         
	//   24   38:getfield        #62  <Field int zzsl>
	//   25   41:isub            
	//   26   42:putfield        #38  <Field int zzadb>
			return;
	//   27   45:return          
		} else
		{
			zzsl = 0;
	//   28   46:aload_0         
	//   29   47:iconst_0        
	//   30   48:putfield        #62  <Field int zzsl>
			return;
	//   31   51:return          
		}
	}

	private final byte zzdy()
		throws IOException
	{
		int i = zzadc;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int zzadc>
	//    2    4:istore_1        
		if(i != zzadb)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #38  <Field int zzadb>
	//*   6   10:icmpeq          29
		{
			byte abyte0[] = buffer;
	//    7   13:aload_0         
	//    8   14:getfield        #34  <Field byte[] buffer>
	//    9   17:astore_2        
			zzadc = i + 1;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:iadd            
	//   14   22:putfield        #42  <Field int zzadc>
			return abyte0[i];
	//   15   25:aload_2         
	//   16   26:iload_1         
	//   17   27:baload          
	//   18   28:ireturn         
		} else
		{
			throw zzjs.zzht();
	//   19   29:invokestatic    #53  <Method zzjs zzjs.zzht()>
	//   20   32:athrow          
		}
	}

	public static zzjk zzk(byte abyte0[], int i, int j)
	{
		return new zzjk(abyte0, 0, j);
	//    0    0:new             #2   <Class zzjk>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:iload_2         
	//    5    7:invokespecial   #68  <Method void zzjk(byte[], int, int)>
	//    6   10:areturn         
	}

	public final int getPosition()
	{
		return zzadc - zzacz;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int zzadc>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field int zzacz>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public final String readString()
		throws IOException
	{
		int i = zzdt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method int zzdt()>
	//    2    4:istore_1        
		if(i >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            61
		{
			int j = zzadb;
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field int zzadb>
	//    7   13:istore_2        
			int k = zzadc;
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field int zzadc>
	//   10   18:istore_3        
			if(i <= j - k)
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:isub            
	//*  15   23:icmpgt          57
			{
				String s = new String(buffer, k, i, zzjr.UTF_8);
	//   16   26:new             #77  <Class String>
	//   17   29:dup             
	//   18   30:aload_0         
	//   19   31:getfield        #34  <Field byte[] buffer>
	//   20   34:iload_3         
	//   21   35:iload_1         
	//   22   36:getstatic       #83  <Field java.nio.charset.Charset zzjr.UTF_8>
	//   23   39:invokespecial   #86  <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   24   42:astore          4
				zzadc = zzadc + i;
	//   25   44:aload_0         
	//   26   45:aload_0         
	//   27   46:getfield        #42  <Field int zzadc>
	//   28   49:iload_1         
	//   29   50:iadd            
	//   30   51:putfield        #42  <Field int zzadc>
				return s;
	//   31   54:aload           4
	//   32   56:areturn         
			} else
			{
				throw zzjs.zzht();
	//   33   57:invokestatic    #53  <Method zzjs zzjs.zzht()>
	//   34   60:athrow          
			}
		} else
		{
			throw zzjs.zzhu();
	//   35   61:invokestatic    #58  <Method zzjs zzjs.zzhu()>
	//   36   64:athrow          
		}
	}

	public final zzfy zza(zzhq zzhq1)
		throws IOException
	{
		int i;
		int j;
		try
		{
			if(zzadd == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field zzez zzadd>
	//*   2    4:ifnonnull       26
				zzadd = zzez.zze(buffer, zzacz, zzada);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field byte[] buffer>
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field int zzacz>
	//    8   16:aload_0         
	//    9   17:getfield        #40  <Field int zzada>
	//   10   20:invokestatic    #98  <Method zzez zzez.zze(byte[], int, int)>
	//   11   23:putfield        #92  <Field zzez zzadd>
			i = zzadd.zzds();
	//   12   26:aload_0         
	//   13   27:getfield        #92  <Field zzez zzadd>
	//   14   30:invokevirtual   #101 <Method int zzez.zzds()>
	//   15   33:istore_2        
			j = zzadc - zzacz;
	//   16   34:aload_0         
	//   17   35:getfield        #42  <Field int zzadc>
	//   18   38:aload_0         
	//   19   39:getfield        #36  <Field int zzacz>
	//   20   42:isub            
	//   21   43:istore_3        
		}
	//*  22   44:iload_2         
	//*  23   45:iload_3         
	//*  24   46:icmpgt          102
	//*  25   49:aload_0         
	//*  26   50:getfield        #92  <Field zzez zzadd>
	//*  27   53:iload_3         
	//*  28   54:iload_2         
	//*  29   55:isub            
	//*  30   56:invokevirtual   #102 <Method void zzez.zzap(int)>
	//*  31   59:aload_0         
	//*  32   60:getfield        #92  <Field zzez zzadd>
	//*  33   63:aload_0         
	//*  34   64:getfield        #29  <Field int zzsg>
	//*  35   67:aload_0         
	//*  36   68:getfield        #104 <Field int zzsf>
	//*  37   71:isub            
	//*  38   72:invokevirtual   #108 <Method int zzez.zzam(int)>
	//*  39   75:pop             
	//*  40   76:aload_0         
	//*  41   77:getfield        #92  <Field zzez zzadd>
	//*  42   80:aload_1         
	//*  43   81:invokestatic    #114 <Method zzfk zzfk.zzel()>
	//*  44   84:invokevirtual   #117 <Method zzhf zzez.zza(zzhq, zzfk)>
	//*  45   87:checkcast       #119 <Class zzfy>
	//*  46   90:astore_1        
	//*  47   91:aload_0         
	//*  48   92:aload_0         
	//*  49   93:getfield        #121 <Field int zzsn>
	//*  50   96:invokevirtual   #125 <Method boolean zzal(int)>
	//*  51   99:pop             
	//*  52  100:aload_1         
	//*  53  101:areturn         
	//*  54  102:new             #47  <Class IOException>
	//*  55  105:dup             
	//*  56  106:ldc1            #127 <String "CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s">
	//*  57  108:iconst_2        
	//*  58  109:anewarray       Object[]
	//*  59  112:dup             
	//*  60  113:iconst_0        
	//*  61  114:iload_2         
	//*  62  115:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//*  63  118:aastore         
	//*  64  119:dup             
	//*  65  120:iconst_1        
	//*  66  121:iload_3         
	//*  67  122:invokestatic    #133 <Method Integer Integer.valueOf(int)>
	//*  68  125:aastore         
	//*  69  126:invokestatic    #137 <Method String String.format(String, Object[])>
	//*  70  129:invokespecial   #140 <Method void IOException(String)>
	//*  71  132:athrow          
		// Misplaced declaration of an exception variable
		catch(zzhq zzhq1)
	//*  72  133:astore_1        
		{
			throw new zzjs("", ((Exception) (zzhq1)));
	//   73  134:new             #49  <Class zzjs>
	//   74  137:dup             
	//   75  138:ldc1            #142 <String "">
	//   76  140:aload_1         
	//   77  141:invokespecial   #145 <Method void zzjs(String, Exception)>
	//   78  144:athrow          
		}
		if(i > j)
			break MISSING_BLOCK_LABEL_102;
		zzadd.zzap(j - i);
		zzadd.zzam(zzsg - zzsf);
		zzhq1 = ((zzhq) ((zzfy)zzadd.zza(zzhq1, zzfk.zzel())));
		zzal(zzsn);
		return ((zzfy) (zzhq1));
		throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[] {
			Integer.valueOf(i), Integer.valueOf(j)
		}));
	}

	public final void zza(zzjt zzjt1)
		throws IOException
	{
		int i = zzdt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method int zzdt()>
	//    2    4:istore_2        
		if(zzsf < zzsg)
	//*   3    5:aload_0         
	//*   4    6:getfield        #104 <Field int zzsf>
	//*   5    9:aload_0         
	//*   6   10:getfield        #29  <Field int zzsg>
	//*   7   13:icmpge          59
		{
			i = zzan(i);
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #151 <Method int zzan(int)>
	//   11   21:istore_2        
			zzsf = zzsf + 1;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #104 <Field int zzsf>
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #104 <Field int zzsf>
			zzjt1.zza(this);
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:invokevirtual   #156 <Method zzjt zzjt.zza(zzjk)>
	//   21   37:pop             
			zzak(0);
	//   22   38:aload_0         
	//   23   39:iconst_0        
	//   24   40:invokevirtual   #159 <Method void zzak(int)>
			zzsf = zzsf - 1;
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #104 <Field int zzsf>
	//   28   48:iconst_1        
	//   29   49:isub            
	//   30   50:putfield        #104 <Field int zzsf>
			zzao(i);
	//   31   53:aload_0         
	//   32   54:iload_2         
	//   33   55:invokevirtual   #162 <Method void zzao(int)>
			return;
	//   34   58:return          
		} else
		{
			throw new zzjs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
	//   35   59:new             #49  <Class zzjs>
	//   36   62:dup             
	//   37   63:ldc1            #164 <String "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.">
	//   38   65:invokespecial   #165 <Method void zzjs(String)>
	//   39   68:athrow          
		}
	}

	public final void zzak(int i)
		throws zzjs
	{
		if(zzsn == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field int zzsn>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		else
			throw new zzjs("Protocol message end-group tag did not match expected tag.");
	//    5    9:new             #49  <Class zzjs>
	//    6   12:dup             
	//    7   13:ldc1            #167 <String "Protocol message end-group tag did not match expected tag.">
	//    8   15:invokespecial   #165 <Method void zzjs(String)>
	//    9   18:athrow          
	}

	public final boolean zzal(int i)
		throws IOException
	{
		switch(i & 7)
	//*   0    0:iload_1         
	//*   1    1:bipush          7
	//*   2    3:iand            
		{
	//*   3    4:tableswitch     0 5: default 44
	//	               0 145
	//	               1 103
	//	               2 93
	//	               3 63
	//	               4 61
	//	               5 54
		default:
			throw new zzjs("Protocol message tag had invalid wire type.");
	//    4   44:new             #49  <Class zzjs>
	//    5   47:dup             
	//    6   48:ldc1            #169 <String "Protocol message tag had invalid wire type.">
	//    7   50:invokespecial   #165 <Method void zzjs(String)>
	//    8   53:athrow          

		case 5: // '\005'
			zzdv();
	//    9   54:aload_0         
	//   10   55:invokevirtual   #172 <Method int zzdv()>
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
				j = zzdq();
	//   16   63:aload_0         
	//   17   64:invokevirtual   #175 <Method int zzdq()>
	//   18   67:istore_2        
			while(j != 0 && zzal(j));
	//   19   68:iload_2         
	//   20   69:ifeq            80
	//   21   72:aload_0         
	//   22   73:iload_2         
	//   23   74:invokevirtual   #125 <Method boolean zzal(int)>
	//   24   77:ifne            63
			zzak((i >>> 3) << 3 | 4);
	//   25   80:aload_0         
	//   26   81:iload_1         
	//   27   82:iconst_3        
	//   28   83:iushr           
	//   29   84:iconst_3        
	//   30   85:ishl            
	//   31   86:iconst_4        
	//   32   87:ior             
	//   33   88:invokevirtual   #159 <Method void zzak(int)>
			return true;
	//   34   91:iconst_1        
	//   35   92:ireturn         

		case 2: // '\002'
			zzap(zzdt());
	//   36   93:aload_0         
	//   37   94:aload_0         
	//   38   95:invokevirtual   #75  <Method int zzdt()>
	//   39   98:invokespecial   #55  <Method void zzap(int)>
			return true;
	//   40  101:iconst_1        
	//   41  102:ireturn         

		case 1: // '\001'
			zzdy();
	//   42  103:aload_0         
	//   43  104:invokespecial   #177 <Method byte zzdy()>
	//   44  107:pop             
			zzdy();
	//   45  108:aload_0         
	//   46  109:invokespecial   #177 <Method byte zzdy()>
	//   47  112:pop             
			zzdy();
	//   48  113:aload_0         
	//   49  114:invokespecial   #177 <Method byte zzdy()>
	//   50  117:pop             
			zzdy();
	//   51  118:aload_0         
	//   52  119:invokespecial   #177 <Method byte zzdy()>
	//   53  122:pop             
			zzdy();
	//   54  123:aload_0         
	//   55  124:invokespecial   #177 <Method byte zzdy()>
	//   56  127:pop             
			zzdy();
	//   57  128:aload_0         
	//   58  129:invokespecial   #177 <Method byte zzdy()>
	//   59  132:pop             
			zzdy();
	//   60  133:aload_0         
	//   61  134:invokespecial   #177 <Method byte zzdy()>
	//   62  137:pop             
			zzdy();
	//   63  138:aload_0         
	//   64  139:invokespecial   #177 <Method byte zzdy()>
	//   65  142:pop             
			return true;
	//   66  143:iconst_1        
	//   67  144:ireturn         

		case 0: // '\0'
			zzdt();
	//   68  145:aload_0         
	//   69  146:invokevirtual   #75  <Method int zzdt()>
	//   70  149:pop             
			return true;
	//   71  150:iconst_1        
	//   72  151:ireturn         
		}
	}

	public final int zzan(int i)
		throws zzjs
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            36
		{
			i += zzadc;
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field int zzadc>
	//    5    9:iadd            
	//    6   10:istore_1        
			int j = zzso;
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field int zzso>
	//    9   15:istore_2        
			if(i <= j)
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpgt          32
			{
				zzso = i;
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:putfield        #27  <Field int zzso>
				zzdx();
	//   16   26:aload_0         
	//   17   27:invokespecial   #179 <Method void zzdx()>
				return j;
	//   18   30:iload_2         
	//   19   31:ireturn         
			} else
			{
				throw zzjs.zzht();
	//   20   32:invokestatic    #53  <Method zzjs zzjs.zzht()>
	//   21   35:athrow          
			}
		} else
		{
			throw zzjs.zzhu();
	//   22   36:invokestatic    #58  <Method zzjs zzjs.zzhu()>
	//   23   39:athrow          
		}
	}

	public final void zzao(int i)
	{
		zzso = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int zzso>
		zzdx();
	//    3    5:aload_0         
	//    4    6:invokespecial   #179 <Method void zzdx()>
	//    5    9:return          
	}

	public final void zzbt(int i)
	{
		zzw(i, zzsn);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #121 <Field int zzsn>
	//    4    6:invokevirtual   #184 <Method void zzw(int, int)>
	//    5    9:return          
	}

	public final boolean zzcu()
		throws IOException
	{
		return zzdt() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method int zzdt()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final int zzdq()
		throws IOException
	{
		if(zzadc == zzadb)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field int zzadc>
	//*   2    4:aload_0         
	//*   3    5:getfield        #38  <Field int zzadb>
	//*   4    8:icmpne          18
		{
			zzsn = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #121 <Field int zzsn>
			return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		}
		zzsn = zzdt();
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #75  <Method int zzdt()>
	//   13   23:putfield        #121 <Field int zzsn>
		int i = zzsn;
	//   14   26:aload_0         
	//   15   27:getfield        #121 <Field int zzsn>
	//   16   30:istore_1        
		if(i != 0)
	//*  17   31:iload_1         
	//*  18   32:ifeq            37
			return i;
	//   19   35:iload_1         
	//   20   36:ireturn         
		else
			throw new zzjs("Protocol message contained an invalid tag (zero).");
	//   21   37:new             #49  <Class zzjs>
	//   22   40:dup             
	//   23   41:ldc1            #188 <String "Protocol message contained an invalid tag (zero).">
	//   24   43:invokespecial   #165 <Method void zzjs(String)>
	//   25   46:athrow          
	}

	public final int zzdt()
		throws IOException
	{
		int i = ((int) (zzdy()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method byte zzdy()>
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
		int k = ((int) (zzdy()));
	//   11   16:aload_0         
	//   12   17:invokespecial   #177 <Method byte zzdy()>
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
		k = ((int) (zzdy()));
	//   30   42:aload_0         
	//   31   43:invokespecial   #177 <Method byte zzdy()>
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
		byte byte0 = zzdy();
	//   49   68:aload_0         
	//   50   69:invokespecial   #177 <Method byte zzdy()>
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
		i = ((int) (zzdy()));
	//   60   84:aload_0         
	//   61   85:invokespecial   #177 <Method byte zzdy()>
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
				if(zzdy() >= 0)
	//*  82  115:aload_0         
	//*  83  116:invokespecial   #177 <Method byte zzdy()>
	//*  84  119:iflt            124
					return k;
	//   85  122:iload_2         
	//   86  123:ireturn         

	//   87  124:iload_1         
	//   88  125:iconst_1        
	//   89  126:iadd            
	//   90  127:istore_1        
	//*  91  128:goto            110
			throw zzjs.zzhv();
	//   92  131:invokestatic    #191 <Method zzjs zzjs.zzhv()>
	//   93  134:athrow          
		} else
		{
			return k;
	//   94  135:iload_2         
	//   95  136:ireturn         
		}
	}

	public final long zzdu()
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
			byte byte0 = zzdy();
	//    7   10:aload_0         
	//    8   11:invokespecial   #177 <Method byte zzdy()>
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
		throw zzjs.zzhv();
	//   30   43:invokestatic    #191 <Method zzjs zzjs.zzhv()>
	//   31   46:athrow          
	}

	public final int zzdv()
		throws IOException
	{
		return zzdy() & 0xff | (zzdy() & 0xff) << 8 | (zzdy() & 0xff) << 16 | (zzdy() & 0xff) << 24;
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method byte zzdy()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:aload_0         
	//    5    9:invokespecial   #177 <Method byte zzdy()>
	//    6   12:sipush          255
	//    7   15:iand            
	//    8   16:bipush          8
	//    9   18:ishl            
	//   10   19:ior             
	//   11   20:aload_0         
	//   12   21:invokespecial   #177 <Method byte zzdy()>
	//   13   24:sipush          255
	//   14   27:iand            
	//   15   28:bipush          16
	//   16   30:ishl            
	//   17   31:ior             
	//   18   32:aload_0         
	//   19   33:invokespecial   #177 <Method byte zzdy()>
	//   20   36:sipush          255
	//   21   39:iand            
	//   22   40:bipush          24
	//   23   42:ishl            
	//   24   43:ior             
	//   25   44:ireturn         
	}

	public final int zzhq()
	{
		int i = zzso;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int zzso>
	//    2    4:istore_1        
		if(i == 0x7fffffff)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #25  <Int 0x7fffffff>
	//*   5    8:icmpne          13
			return -1;
	//    6   11:iconst_m1       
	//    7   12:ireturn         
		else
			return i - zzadc;
	//    8   13:iload_1         
	//    9   14:aload_0         
	//   10   15:getfield        #42  <Field int zzadc>
	//   11   18:isub            
	//   12   19:ireturn         
	}

	public final byte[] zzv(int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            8
		{
			return zzjw.zzaea;
	//    2    4:getstatic       #201 <Field byte[] zzjw.zzaea>
	//    3    7:areturn         
		} else
		{
			byte abyte0[] = new byte[j];
	//    4    8:iload_2         
	//    5    9:newarray        byte[]
	//    6   11:astore          4
			int k = zzacz;
	//    7   13:aload_0         
	//    8   14:getfield        #36  <Field int zzacz>
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
	//   18   29:invokestatic    #207 <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte0;
	//   19   32:aload           4
	//   20   34:areturn         
		}
	}

	final void zzw(int i, int j)
	{
		int k = zzadc;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int zzadc>
	//    2    4:istore_3        
		int l = zzacz;
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field int zzacz>
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
				zzadc = l + i;
	//   13   23:aload_0         
	//   14   24:iload           4
	//   15   26:iload_1         
	//   16   27:iadd            
	//   17   28:putfield        #42  <Field int zzadc>
				zzsn = j;
	//   18   31:aload_0         
	//   19   32:iload_2         
	//   20   33:putfield        #121 <Field int zzsn>
				return;
	//   21   36:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder(24);
	//   22   37:new             #209 <Class StringBuilder>
	//   23   40:dup             
	//   24   41:bipush          24
	//   25   43:invokespecial   #211 <Method void StringBuilder(int)>
	//   26   46:astore          5
				stringbuilder.append("Bad position ");
	//   27   48:aload           5
	//   28   50:ldc1            #213 <String "Bad position ">
	//   29   52:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
				stringbuilder.append(i);
	//   31   56:aload           5
	//   32   58:iload_1         
	//   33   59:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//   34   62:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   35   63:new             #222 <Class IllegalArgumentException>
	//   36   66:dup             
	//   37   67:aload           5
	//   38   69:invokevirtual   #225 <Method String StringBuilder.toString()>
	//   39   72:invokespecial   #226 <Method void IllegalArgumentException(String)>
	//   40   75:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder(50);
	//   41   76:new             #209 <Class StringBuilder>
	//   42   79:dup             
	//   43   80:bipush          50
	//   44   82:invokespecial   #211 <Method void StringBuilder(int)>
	//   45   85:astore          5
			stringbuilder1.append("Position ");
	//   46   87:aload           5
	//   47   89:ldc1            #228 <String "Position ">
	//   48   91:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   49   94:pop             
			stringbuilder1.append(i);
	//   50   95:aload           5
	//   51   97:iload_1         
	//   52   98:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//   53  101:pop             
			stringbuilder1.append(" is beyond current ");
	//   54  102:aload           5
	//   55  104:ldc1            #230 <String " is beyond current ">
	//   56  106:invokevirtual   #217 <Method StringBuilder StringBuilder.append(String)>
	//   57  109:pop             
			stringbuilder1.append(k - l);
	//   58  110:aload           5
	//   59  112:iload_3         
	//   60  113:iload           4
	//   61  115:isub            
	//   62  116:invokevirtual   #220 <Method StringBuilder StringBuilder.append(int)>
	//   63  119:pop             
			throw new IllegalArgumentException(stringbuilder1.toString());
	//   64  120:new             #222 <Class IllegalArgumentException>
	//   65  123:dup             
	//   66  124:aload           5
	//   67  126:invokevirtual   #225 <Method String StringBuilder.toString()>
	//   68  129:invokespecial   #226 <Method void IllegalArgumentException(String)>
	//   69  132:athrow          
		}
	}

	private final byte buffer[];
	private final int zzacz;
	private final int zzada;
	private int zzadb;
	private int zzadc;
	private zzez zzadd;
	private int zzsf;
	private int zzsg;
	private int zzsh;
	private int zzsl;
	private int zzsn;
	private int zzso;
}
