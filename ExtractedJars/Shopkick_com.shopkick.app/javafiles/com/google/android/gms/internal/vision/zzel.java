// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzej, zzgf, zzek, zzjd, 
//			zzgo, zzhw, zziw, zzga, 
//			zzhs, zzfh, zzgg, zzgy, 
//			zzfv, zzgt, zzeo, zzez, 
//			zzfz, zzem, zzfk

final class zzel extends zzej
{

	public zzel(ByteBuffer bytebuffer, boolean flag)
	{
		super(((zzek) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #19  <Method void zzej(zzek)>
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #21  <Field boolean zzrs>
		buffer = bytebuffer.array();
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #27  <Method byte[] ByteBuffer.array()>
	//    9   15:putfield        #29  <Field byte[] buffer>
		int i = bytebuffer.arrayOffset() + bytebuffer.position();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #33  <Method int ByteBuffer.arrayOffset()>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #36  <Method int ByteBuffer.position()>
	//   14   26:iadd            
	//   15   27:istore_3        
		pos = i;
	//   16   28:aload_0         
	//   17   29:iload_3         
	//   18   30:putfield        #38  <Field int pos>
		zzrt = i;
	//   19   33:aload_0         
	//   20   34:iload_3         
	//   21   35:putfield        #40  <Field int zzrt>
		limit = bytebuffer.arrayOffset() + bytebuffer.limit();
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:invokevirtual   #33  <Method int ByteBuffer.arrayOffset()>
	//   25   43:aload_1         
	//   26   44:invokevirtual   #42  <Method int ByteBuffer.limit()>
	//   27   47:iadd            
	//   28   48:putfield        #44  <Field int limit>
	//   29   51:return          
	}

	private final byte readByte()
		throws IOException
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int pos>
	//    2    4:istore_1        
		if(i != limit)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #44  <Field int limit>
	//*   6   10:icmpeq          29
		{
			byte abyte0[] = buffer;
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field byte[] buffer>
	//    9   17:astore_2        
			pos = i + 1;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:iadd            
	//   14   22:putfield        #38  <Field int pos>
			return abyte0[i];
	//   15   25:aload_2         
	//   16   26:iload_1         
	//   17   27:baload          
	//   18   28:ireturn         
		} else
		{
			throw zzgf.zzfh();
	//   19   29:invokestatic    #55  <Method zzgf zzgf.zzfh()>
	//   20   32:athrow          
		}
	}

	private final Object zza(zzjd zzjd1, Class class1, zzfk zzfk)
		throws IOException
	{
		switch(zzek.zzrr[zzjd1.ordinal()])
	//*   0    0:getstatic       #64  <Field int[] zzek.zzrr>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #69  <Method int zzjd.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 17: default 92
	//	               1 224
	//	               2 219
	//	               3 211
	//	               4 203
	//	               5 195
	//	               6 187
	//	               7 179
	//	               8 171
	//	               9 163
	//	               10 156
	//	               11 148
	//	               12 140
	//	               13 132
	//	               14 124
	//	               15 118
	//	               16 110
	//	               17 102
		default:
			throw new RuntimeException("unsupported field type.");
	//    5   92:new             #71  <Class RuntimeException>
	//    6   95:dup             
	//    7   96:ldc1            #73  <String "unsupported field type.">
	//    8   98:invokespecial   #76  <Method void RuntimeException(String)>
	//    9  101:athrow          

		case 17: // '\021'
			return ((Object) (Long.valueOf(zzcp())));
	//   10  102:aload_0         
	//   11  103:invokevirtual   #80  <Method long zzcp()>
	//   12  106:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   13  109:areturn         

		case 16: // '\020'
			return ((Object) (Integer.valueOf(zzcx())));
	//   14  110:aload_0         
	//   15  111:invokevirtual   #89  <Method int zzcx()>
	//   16  114:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   17  117:areturn         

		case 15: // '\017'
			return ((Object) (zzg(true)));
	//   18  118:aload_0         
	//   19  119:iconst_1        
	//   20  120:invokespecial   #98  <Method String zzg(boolean)>
	//   21  123:areturn         

		case 14: // '\016'
			return ((Object) (Long.valueOf(zzdc())));
	//   22  124:aload_0         
	//   23  125:invokevirtual   #101 <Method long zzdc()>
	//   24  128:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   25  131:areturn         

		case 13: // '\r'
			return ((Object) (Integer.valueOf(zzdb())));
	//   26  132:aload_0         
	//   27  133:invokevirtual   #104 <Method int zzdb()>
	//   28  136:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   29  139:areturn         

		case 12: // '\f'
			return ((Object) (Long.valueOf(zzda())));
	//   30  140:aload_0         
	//   31  141:invokevirtual   #107 <Method long zzda()>
	//   32  144:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   33  147:areturn         

		case 11: // '\013'
			return ((Object) (Integer.valueOf(zzcz())));
	//   34  148:aload_0         
	//   35  149:invokevirtual   #110 <Method int zzcz()>
	//   36  152:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   37  155:areturn         

		case 10: // '\n'
			return zza(class1, zzfk);
	//   38  156:aload_0         
	//   39  157:aload_2         
	//   40  158:aload_3         
	//   41  159:invokevirtual   #113 <Method Object zza(Class, zzfk)>
	//   42  162:areturn         

		case 9: // '\t'
			return ((Object) (Long.valueOf(zzcq())));
	//   43  163:aload_0         
	//   44  164:invokevirtual   #116 <Method long zzcq()>
	//   45  167:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   46  170:areturn         

		case 8: // '\b'
			return ((Object) (Integer.valueOf(zzcr())));
	//   47  171:aload_0         
	//   48  172:invokevirtual   #119 <Method int zzcr()>
	//   49  175:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   50  178:areturn         

		case 7: // '\007'
			return ((Object) (Float.valueOf(readFloat())));
	//   51  179:aload_0         
	//   52  180:invokevirtual   #123 <Method float readFloat()>
	//   53  183:invokestatic    #128 <Method Float Float.valueOf(float)>
	//   54  186:areturn         

		case 6: // '\006'
			return ((Object) (Long.valueOf(zzcs())));
	//   55  187:aload_0         
	//   56  188:invokevirtual   #131 <Method long zzcs()>
	//   57  191:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   58  194:areturn         

		case 5: // '\005'
			return ((Object) (Integer.valueOf(zzct())));
	//   59  195:aload_0         
	//   60  196:invokevirtual   #134 <Method int zzct()>
	//   61  199:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   62  202:areturn         

		case 4: // '\004'
			return ((Object) (Integer.valueOf(zzcy())));
	//   63  203:aload_0         
	//   64  204:invokevirtual   #137 <Method int zzcy()>
	//   65  207:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   66  210:areturn         

		case 3: // '\003'
			return ((Object) (Double.valueOf(readDouble())));
	//   67  211:aload_0         
	//   68  212:invokevirtual   #141 <Method double readDouble()>
	//   69  215:invokestatic    #146 <Method Double Double.valueOf(double)>
	//   70  218:areturn         

		case 2: // '\002'
			return ((Object) (zzcw()));
	//   71  219:aload_0         
	//   72  220:invokevirtual   #150 <Method zzeo zzcw()>
	//   73  223:areturn         

		case 1: // '\001'
			return ((Object) (Boolean.valueOf(zzcu())));
	//   74  224:aload_0         
	//   75  225:invokevirtual   #154 <Method boolean zzcu()>
	//   76  228:invokestatic    #159 <Method Boolean Boolean.valueOf(boolean)>
	//   77  231:areturn         
		}
	}

	private final void zza(List list, boolean flag)
		throws IOException
	{
		if((tag & 7) == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field int tag>
	//*   2    4:bipush          7
	//*   3    6:iand            
	//*   4    7:iconst_2        
	//*   5    8:icmpne          109
		{
			if((list instanceof zzgo) && !flag)
	//*   6   11:aload_1         
	//*   7   12:instanceof      #166 <Class zzgo>
	//*   8   15:ifeq            67
	//*   9   18:iload_2         
	//*  10   19:ifne            67
			{
				list = ((List) ((zzgo)list));
	//   11   22:aload_1         
	//   12   23:checkcast       #166 <Class zzgo>
	//   13   26:astore_1        
				int i;
				do
				{
					((zzgo) (list)).zzc(zzcw());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #150 <Method zzeo zzcw()>
	//   17   32:invokeinterface #170 <Method void zzgo.zzc(zzeo)>
					if(zzcm())
	//*  18   37:aload_0         
	//*  19   38:invokespecial   #173 <Method boolean zzcm()>
	//*  20   41:ifeq            45
						return;
	//   21   44:return          
					i = pos;
	//   22   45:aload_0         
	//   23   46:getfield        #38  <Field int pos>
	//   24   49:istore_3        
				} while(zzdd() == tag);
	//   25   50:aload_0         
	//   26   51:invokespecial   #176 <Method int zzdd()>
	//   27   54:aload_0         
	//   28   55:getfield        #164 <Field int tag>
	//   29   58:icmpeq          27
				pos = i;
	//   30   61:aload_0         
	//   31   62:iload_3         
	//   32   63:putfield        #38  <Field int pos>
				return;
	//   33   66:return          
			}
			int j;
			do
			{
				list.add(((Object) (zzg(flag))));
	//   34   67:aload_1         
	//   35   68:aload_0         
	//   36   69:iload_2         
	//   37   70:invokespecial   #98  <Method String zzg(boolean)>
	//   38   73:invokeinterface #182 <Method boolean List.add(Object)>
	//   39   78:pop             
				if(zzcm())
	//*  40   79:aload_0         
	//*  41   80:invokespecial   #173 <Method boolean zzcm()>
	//*  42   83:ifeq            87
					return;
	//   43   86:return          
				j = pos;
	//   44   87:aload_0         
	//   45   88:getfield        #38  <Field int pos>
	//   46   91:istore_3        
			} while(zzdd() == tag);
	//   47   92:aload_0         
	//   48   93:invokespecial   #176 <Method int zzdd()>
	//   49   96:aload_0         
	//   50   97:getfield        #164 <Field int tag>
	//   51  100:icmpeq          67
			pos = j;
	//   52  103:aload_0         
	//   53  104:iload_3         
	//   54  105:putfield        #38  <Field int pos>
			return;
	//   55  108:return          
		} else
		{
			throw zzgf.zzfm();
	//   56  109:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   57  112:athrow          
		}
	}

	private final void zzaa(int i)
		throws IOException
	{
		if(i >= 0 && i <= limit - pos)
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #44  <Field int limit>
	//*   5    9:aload_0         
	//*   6   10:getfield        #38  <Field int pos>
	//*   7   13:isub            
	//*   8   14:icmpgt          18
			return;
	//    9   17:return          
		else
			throw zzgf.zzfh();
	//   10   18:invokestatic    #55  <Method zzgf zzgf.zzfh()>
	//   11   21:athrow          
	}

	private final void zzab(int i)
		throws IOException
	{
		if((tag & 7) == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field int tag>
	//*   2    4:bipush          7
	//*   3    6:iand            
	//*   4    7:iload_1         
	//*   5    8:icmpne          12
			return;
	//    6   11:return          
		else
			throw zzgf.zzfm();
	//    7   12:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//    8   15:athrow          
	}

	private final void zzac(int i)
		throws IOException
	{
		zzaa(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #193 <Method void zzaa(int)>
		if((i & 7) == 0)
	//*   3    5:iload_1         
	//*   4    6:bipush          7
	//*   5    8:iand            
	//*   6    9:ifne            13
			return;
	//    7   12:return          
		else
			throw zzgf.zzfo();
	//    8   13:invokestatic    #196 <Method zzgf zzgf.zzfo()>
	//    9   16:athrow          
	}

	private final void zzad(int i)
		throws IOException
	{
		zzaa(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #193 <Method void zzaa(int)>
		if((i & 3) == 0)
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:iand            
	//*   6    8:ifne            12
			return;
	//    7   11:return          
		else
			throw zzgf.zzfo();
	//    8   12:invokestatic    #196 <Method zzgf zzgf.zzfo()>
	//    9   15:athrow          
	}

	private final void zzae(int i)
		throws IOException
	{
		if(pos == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int pos>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		else
			throw zzgf.zzfh();
	//    5    9:invokestatic    #55  <Method zzgf zzgf.zzfh()>
	//    6   12:athrow          
	}

	private final Object zzb(zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		int i;
		int j;
		j = zzdd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #176 <Method int zzdd()>
	//    2    4:istore          4
		zzaa(j);
	//    3    6:aload_0         
	//    4    7:iload           4
	//    5    9:invokespecial   #193 <Method void zzaa(int)>
		i = limit;
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field int limit>
	//    8   16:istore_3        
		j = pos + j;
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field int pos>
	//   11   21:iload           4
	//   12   23:iadd            
	//   13   24:istore          4
		limit = j;
	//   14   26:aload_0         
	//   15   27:iload           4
	//   16   29:putfield        #44  <Field int limit>
		int k;
		Object obj;
		obj = zzhw1.newInstance();
	//   17   32:aload_1         
	//   18   33:invokeinterface #206 <Method Object zzhw.newInstance()>
	//   19   38:astore          6
		zzhw1.zza(obj, ((zzhv) (this)), zzfk);
	//   20   40:aload_1         
	//   21   41:aload           6
	//   22   43:aload_0         
	//   23   44:aload_2         
	//   24   45:invokeinterface #209 <Method void zzhw.zza(Object, zzhv, zzfk)>
		zzhw1.zze(obj);
	//   25   50:aload_1         
	//   26   51:aload           6
	//   27   53:invokeinterface #213 <Method void zzhw.zze(Object)>
		k = pos;
	//   28   58:aload_0         
	//   29   59:getfield        #38  <Field int pos>
	//   30   62:istore          5
		if(k == j)
	//*  31   64:iload           5
	//*  32   66:iload           4
	//*  33   68:icmpne          79
		{
			limit = i;
	//   34   71:aload_0         
	//   35   72:iload_3         
	//   36   73:putfield        #44  <Field int limit>
			return obj;
	//   37   76:aload           6
	//   38   78:areturn         
		}
		throw zzgf.zzfo();
	//   39   79:invokestatic    #196 <Method zzgf zzgf.zzfo()>
	//   40   82:athrow          
		zzhw1;
	//   41   83:astore_1        
		limit = i;
	//   42   84:aload_0         
	//   43   85:iload_3         
	//   44   86:putfield        #44  <Field int limit>
		throw zzhw1;
	//   45   89:aload_1         
	//   46   90:athrow          
	}

	private final boolean zzcm()
	{
		return pos == limit;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int pos>
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field int limit>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private final Object zzd(zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		int i;
		i = zzru;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field int zzru>
	//    2    4:istore_3        
		zzru = (tag >>> 3) << 3 | 4;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #164 <Field int tag>
	//    6   10:iconst_3        
	//    7   11:iushr           
	//    8   12:iconst_3        
	//    9   13:ishl            
	//   10   14:iconst_4        
	//   11   15:ior             
	//   12   16:putfield        #217 <Field int zzru>
		int j;
		int k;
		Object obj;
		obj = zzhw1.newInstance();
	//   13   19:aload_1         
	//   14   20:invokeinterface #206 <Method Object zzhw.newInstance()>
	//   15   25:astore          6
		zzhw1.zza(obj, ((zzhv) (this)), zzfk);
	//   16   27:aload_1         
	//   17   28:aload           6
	//   18   30:aload_0         
	//   19   31:aload_2         
	//   20   32:invokeinterface #209 <Method void zzhw.zza(Object, zzhv, zzfk)>
		zzhw1.zze(obj);
	//   21   37:aload_1         
	//   22   38:aload           6
	//   23   40:invokeinterface #213 <Method void zzhw.zze(Object)>
		j = tag;
	//   24   45:aload_0         
	//   25   46:getfield        #164 <Field int tag>
	//   26   49:istore          4
		k = zzru;
	//   27   51:aload_0         
	//   28   52:getfield        #217 <Field int zzru>
	//   29   55:istore          5
		if(j == k)
	//*  30   57:iload           4
	//*  31   59:iload           5
	//*  32   61:icmpne          72
		{
			zzru = i;
	//   33   64:aload_0         
	//   34   65:iload_3         
	//   35   66:putfield        #217 <Field int zzru>
			return obj;
	//   36   69:aload           6
	//   37   71:areturn         
		}
		throw zzgf.zzfo();
	//   38   72:invokestatic    #196 <Method zzgf zzgf.zzfo()>
	//   39   75:athrow          
		zzhw1;
	//   40   76:astore_1        
		zzru = i;
	//   41   77:aload_0         
	//   42   78:iload_3         
	//   43   79:putfield        #217 <Field int zzru>
		throw zzhw1;
	//   44   82:aload_1         
	//   45   83:athrow          
	}

	private final int zzdd()
		throws IOException
	{
label0:
		{
			int i;
			int j;
label1:
			{
				int k = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int pos>
	//    2    4:istore_3        
				i = limit;
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field int limit>
	//    5    9:istore_1        
				if(i == k)
					break label0;
	//    6   10:iload_1         
	//    7   11:iload_3         
	//    8   12:icmpeq          264
				byte abyte0[] = buffer;
	//    9   15:aload_0         
	//   10   16:getfield        #29  <Field byte[] buffer>
	//   11   19:astore          6
				j = k + 1;
	//   12   21:iload_3         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:istore_2        
				k = ((int) (abyte0[k]));
	//   16   25:aload           6
	//   17   27:iload_3         
	//   18   28:baload          
	//   19   29:istore_3        
				if(k >= 0)
	//*  20   30:iload_3         
	//*  21   31:iflt            41
				{
					pos = j;
	//   22   34:aload_0         
	//   23   35:iload_2         
	//   24   36:putfield        #38  <Field int pos>
					return k;
	//   25   39:iload_3         
	//   26   40:ireturn         
				}
				if(i - j < 9)
	//*  27   41:iload_1         
	//*  28   42:iload_2         
	//*  29   43:isub            
	//*  30   44:bipush          9
	//*  31   46:icmpge          55
					return (int)zzdf();
	//   32   49:aload_0         
	//   33   50:invokespecial   #220 <Method long zzdf()>
	//   34   53:l2i             
	//   35   54:ireturn         
				i = j + 1;
	//   36   55:iload_2         
	//   37   56:iconst_1        
	//   38   57:iadd            
	//   39   58:istore_1        
				k ^= abyte0[j] << 7;
	//   40   59:iload_3         
	//   41   60:aload           6
	//   42   62:iload_2         
	//   43   63:baload          
	//   44   64:bipush          7
	//   45   66:ishl            
	//   46   67:ixor            
	//   47   68:istore_3        
				if(k < 0)
	//*  48   69:iload_3         
	//*  49   70:ifge            81
				{
					j = k ^ 0xffffff80;
	//   50   73:iload_3         
	//   51   74:bipush          -128
	//   52   76:ixor            
	//   53   77:istore_2        
					break label1;
	//   54   78:goto            257
				}
				j = i + 1;
	//   55   81:iload_1         
	//   56   82:iconst_1        
	//   57   83:iadd            
	//   58   84:istore_2        
				k ^= abyte0[i] << 14;
	//   59   85:iload_3         
	//   60   86:aload           6
	//   61   88:iload_1         
	//   62   89:baload          
	//   63   90:bipush          14
	//   64   92:ishl            
	//   65   93:ixor            
	//   66   94:istore_3        
				if(k >= 0)
	//*  67   95:iload_3         
	//*  68   96:iflt            112
				{
					k ^= 0x3f80;
	//   69   99:iload_3         
	//   70  100:sipush          16256
	//   71  103:ixor            
	//   72  104:istore_3        
					i = j;
	//   73  105:iload_2         
	//   74  106:istore_1        
					j = k;
	//   75  107:iload_3         
	//   76  108:istore_2        
					break label1;
	//   77  109:goto            257
				}
				i = j + 1;
	//   78  112:iload_2         
	//   79  113:iconst_1        
	//   80  114:iadd            
	//   81  115:istore_1        
				k ^= abyte0[j] << 21;
	//   82  116:iload_3         
	//   83  117:aload           6
	//   84  119:iload_2         
	//   85  120:baload          
	//   86  121:bipush          21
	//   87  123:ishl            
	//   88  124:ixor            
	//   89  125:istore_3        
				if(k < 0)
	//*  90  126:iload_3         
	//*  91  127:ifge            138
				{
					j = k ^ 0xffe03f80;
	//   92  130:iload_3         
	//   93  131:ldc1            #221 <Int 0xffe03f80>
	//   94  133:ixor            
	//   95  134:istore_2        
					break label1;
	//   96  135:goto            257
				}
				int l = i + 1;
	//   97  138:iload_1         
	//   98  139:iconst_1        
	//   99  140:iadd            
	//  100  141:istore          4
				j = ((int) (abyte0[i]));
	//  101  143:aload           6
	//  102  145:iload_1         
	//  103  146:baload          
	//  104  147:istore_2        
				k = k ^ j << 28 ^ 0xfe03f80;
	//  105  148:iload_3         
	//  106  149:iload_2         
	//  107  150:bipush          28
	//  108  152:ishl            
	//  109  153:ixor            
	//  110  154:ldc1            #222 <Int 0xfe03f80>
	//  111  156:ixor            
	//  112  157:istore_3        
				i = l;
	//  113  158:iload           4
	//  114  160:istore_1        
				if(j < 0)
	//* 115  161:iload_2         
	//* 116  162:ifge            255
				{
					int i1 = l + 1;
	//  117  165:iload           4
	//  118  167:iconst_1        
	//  119  168:iadd            
	//  120  169:istore          5
					j = k;
	//  121  171:iload_3         
	//  122  172:istore_2        
					i = i1;
	//  123  173:iload           5
	//  124  175:istore_1        
					if(abyte0[l] >= 0)
						break label1;
	//  125  176:aload           6
	//  126  178:iload           4
	//  127  180:baload          
	//  128  181:ifge            257
					l = i1 + 1;
	//  129  184:iload           5
	//  130  186:iconst_1        
	//  131  187:iadd            
	//  132  188:istore          4
					i = l;
	//  133  190:iload           4
	//  134  192:istore_1        
					if(abyte0[i1] < 0)
	//* 135  193:aload           6
	//* 136  195:iload           5
	//* 137  197:baload          
	//* 138  198:ifge            255
					{
						int j1 = l + 1;
	//  139  201:iload           4
	//  140  203:iconst_1        
	//  141  204:iadd            
	//  142  205:istore          5
						j = k;
	//  143  207:iload_3         
	//  144  208:istore_2        
						i = j1;
	//  145  209:iload           5
	//  146  211:istore_1        
						if(abyte0[l] >= 0)
							break label1;
	//  147  212:aload           6
	//  148  214:iload           4
	//  149  216:baload          
	//  150  217:ifge            257
						j = j1 + 1;
	//  151  220:iload           5
	//  152  222:iconst_1        
	//  153  223:iadd            
	//  154  224:istore_2        
						i = j;
	//  155  225:iload_2         
	//  156  226:istore_1        
						if(abyte0[j1] < 0)
	//* 157  227:aload           6
	//* 158  229:iload           5
	//* 159  231:baload          
	//* 160  232:ifge            255
						{
							i = j + 1;
	//  161  235:iload_2         
	//  162  236:iconst_1        
	//  163  237:iadd            
	//  164  238:istore_1        
							if(abyte0[j] >= 0)
	//* 165  239:aload           6
	//* 166  241:iload_2         
	//* 167  242:baload          
	//* 168  243:iflt            251
								j = k;
	//  169  246:iload_3         
	//  170  247:istore_2        
							else
	//* 171  248:goto            257
								throw zzgf.zzfj();
	//  172  251:invokestatic    #225 <Method zzgf zzgf.zzfj()>
	//  173  254:athrow          
							break label1;
						}
					}
				}
				j = k;
	//  174  255:iload_3         
	//  175  256:istore_2        
			}
			pos = i;
	//  176  257:aload_0         
	//  177  258:iload_1         
	//  178  259:putfield        #38  <Field int pos>
			return j;
	//  179  262:iload_2         
	//  180  263:ireturn         
		}
		throw zzgf.zzfh();
	//  181  264:invokestatic    #55  <Method zzgf zzgf.zzfh()>
	//  182  267:athrow          
	}

	private final long zzde()
		throws IOException
	{
		int j1 = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int pos>
	//    2    4:istore_3        
		int i = limit;
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field int limit>
	//    5    9:istore_1        
		if(i != j1)
	//*   6   10:iload_1         
	//*   7   11:iload_3         
	//*   8   12:icmpeq          349
		{
			byte abyte0[] = buffer;
	//    9   15:aload_0         
	//   10   16:getfield        #29  <Field byte[] buffer>
	//   11   19:astore          6
			int j = j1 + 1;
	//   12   21:iload_3         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:istore_2        
			j1 = ((int) (abyte0[j1]));
	//   16   25:aload           6
	//   17   27:iload_3         
	//   18   28:baload          
	//   19   29:istore_3        
			if(j1 >= 0)
	//*  20   30:iload_3         
	//*  21   31:iflt            42
			{
				pos = j;
	//   22   34:aload_0         
	//   23   35:iload_2         
	//   24   36:putfield        #38  <Field int pos>
				return (long)j1;
	//   25   39:iload_3         
	//   26   40:i2l             
	//   27   41:lreturn         
			}
			if(i - j < 9)
	//*  28   42:iload_1         
	//*  29   43:iload_2         
	//*  30   44:isub            
	//*  31   45:bipush          9
	//*  32   47:icmpge          55
				return zzdf();
	//   33   50:aload_0         
	//   34   51:invokespecial   #220 <Method long zzdf()>
	//   35   54:lreturn         
			i = j + 1;
	//   36   55:iload_2         
	//   37   56:iconst_1        
	//   38   57:iadd            
	//   39   58:istore_1        
			j1 ^= abyte0[j] << 7;
	//   40   59:iload_3         
	//   41   60:aload           6
	//   42   62:iload_2         
	//   43   63:baload          
	//   44   64:bipush          7
	//   45   66:ishl            
	//   46   67:ixor            
	//   47   68:istore_3        
			long l1;
			if(j1 < 0)
	//*  48   69:iload_3         
	//*  49   70:ifge            83
			{
				l1 = j1 ^ 0xffffff80;
	//   50   73:iload_3         
	//   51   74:bipush          -128
	//   52   76:ixor            
	//   53   77:i2l             
	//   54   78:lstore          4
			} else
	//*  55   80:goto            341
			{
				int k = i + 1;
	//   56   83:iload_1         
	//   57   84:iconst_1        
	//   58   85:iadd            
	//   59   86:istore_2        
				j1 ^= abyte0[i] << 14;
	//   60   87:iload_3         
	//   61   88:aload           6
	//   62   90:iload_1         
	//   63   91:baload          
	//   64   92:bipush          14
	//   65   94:ishl            
	//   66   95:ixor            
	//   67   96:istore_3        
				if(j1 >= 0)
	//*  68   97:iload_3         
	//*  69   98:iflt            114
				{
					l1 = j1 ^ 0x3f80;
	//   70  101:iload_3         
	//   71  102:sipush          16256
	//   72  105:ixor            
	//   73  106:i2l             
	//   74  107:lstore          4
					i = k;
	//   75  109:iload_2         
	//   76  110:istore_1        
				} else
	//*  77  111:goto            341
				{
					i = k + 1;
	//   78  114:iload_2         
	//   79  115:iconst_1        
	//   80  116:iadd            
	//   81  117:istore_1        
					k = j1 ^ abyte0[k] << 21;
	//   82  118:iload_3         
	//   83  119:aload           6
	//   84  121:iload_2         
	//   85  122:baload          
	//   86  123:bipush          21
	//   87  125:ishl            
	//   88  126:ixor            
	//   89  127:istore_2        
					if(k < 0)
	//*  90  128:iload_2         
	//*  91  129:ifge            142
					{
						l1 = k ^ 0xffe03f80;
	//   92  132:iload_2         
	//   93  133:ldc1            #221 <Int 0xffe03f80>
	//   94  135:ixor            
	//   95  136:i2l             
	//   96  137:lstore          4
					} else
	//*  97  139:goto            341
					{
						l1 = k;
	//   98  142:iload_2         
	//   99  143:i2l             
	//  100  144:lstore          4
						k = i + 1;
	//  101  146:iload_1         
	//  102  147:iconst_1        
	//  103  148:iadd            
	//  104  149:istore_2        
						l1 ^= (long)abyte0[i] << 28;
	//  105  150:lload           4
	//  106  152:aload           6
	//  107  154:iload_1         
	//  108  155:baload          
	//  109  156:i2l             
	//  110  157:bipush          28
	//  111  159:lshl            
	//  112  160:lxor            
	//  113  161:lstore          4
						if(l1 >= 0L)
	//* 114  163:lload           4
	//* 115  165:lconst_0        
	//* 116  166:lcmp            
	//* 117  167:iflt            183
						{
							l1 ^= 0xfe03f80L;
	//  118  170:lload           4
	//  119  172:ldc2w           #227 <Long 0xfe03f80L>
	//  120  175:lxor            
	//  121  176:lstore          4
							i = k;
	//  122  178:iload_2         
	//  123  179:istore_1        
						} else
	//* 124  180:goto            341
						{
							i = k + 1;
	//  125  183:iload_2         
	//  126  184:iconst_1        
	//  127  185:iadd            
	//  128  186:istore_1        
							l1 ^= (long)abyte0[k] << 35;
	//  129  187:lload           4
	//  130  189:aload           6
	//  131  191:iload_2         
	//  132  192:baload          
	//  133  193:i2l             
	//  134  194:bipush          35
	//  135  196:lshl            
	//  136  197:lxor            
	//  137  198:lstore          4
							if(l1 < 0L)
	//* 138  200:lload           4
	//* 139  202:lconst_0        
	//* 140  203:lcmp            
	//* 141  204:ifge            218
							{
								l1 ^= 0xfe03f80L;
	//  142  207:lload           4
	//  143  209:ldc2w           #229 <Long 0xfe03f80L>
	//  144  212:lxor            
	//  145  213:lstore          4
							} else
	//* 146  215:goto            341
							{
								int l = i + 1;
	//  147  218:iload_1         
	//  148  219:iconst_1        
	//  149  220:iadd            
	//  150  221:istore_2        
								l1 ^= (long)abyte0[i] << 42;
	//  151  222:lload           4
	//  152  224:aload           6
	//  153  226:iload_1         
	//  154  227:baload          
	//  155  228:i2l             
	//  156  229:bipush          42
	//  157  231:lshl            
	//  158  232:lxor            
	//  159  233:lstore          4
								if(l1 >= 0L)
	//* 160  235:lload           4
	//* 161  237:lconst_0        
	//* 162  238:lcmp            
	//* 163  239:iflt            255
								{
									l1 ^= 0xfe03f80L;
	//  164  242:lload           4
	//  165  244:ldc2w           #231 <Long 0xfe03f80L>
	//  166  247:lxor            
	//  167  248:lstore          4
									i = l;
	//  168  250:iload_2         
	//  169  251:istore_1        
								} else
	//* 170  252:goto            341
								{
									i = l + 1;
	//  171  255:iload_2         
	//  172  256:iconst_1        
	//  173  257:iadd            
	//  174  258:istore_1        
									l1 ^= (long)abyte0[l] << 49;
	//  175  259:lload           4
	//  176  261:aload           6
	//  177  263:iload_2         
	//  178  264:baload          
	//  179  265:i2l             
	//  180  266:bipush          49
	//  181  268:lshl            
	//  182  269:lxor            
	//  183  270:lstore          4
									if(l1 < 0L)
	//* 184  272:lload           4
	//* 185  274:lconst_0        
	//* 186  275:lcmp            
	//* 187  276:ifge            290
									{
										l1 ^= 0xfe03f80L;
	//  188  279:lload           4
	//  189  281:ldc2w           #233 <Long 0xfe03f80L>
	//  190  284:lxor            
	//  191  285:lstore          4
									} else
	//* 192  287:goto            341
									{
										int i1 = i + 1;
	//  193  290:iload_1         
	//  194  291:iconst_1        
	//  195  292:iadd            
	//  196  293:istore_2        
										l1 = l1 ^ (long)abyte0[i] << 56 ^ 0xfe03f80L;
	//  197  294:lload           4
	//  198  296:aload           6
	//  199  298:iload_1         
	//  200  299:baload          
	//  201  300:i2l             
	//  202  301:bipush          56
	//  203  303:lshl            
	//  204  304:lxor            
	//  205  305:ldc2w           #235 <Long 0xfe03f80L>
	//  206  308:lxor            
	//  207  309:lstore          4
										if(l1 < 0L)
	//* 208  311:lload           4
	//* 209  313:lconst_0        
	//* 210  314:lcmp            
	//* 211  315:ifge            339
										{
											i = i1 + 1;
	//  212  318:iload_2         
	//  213  319:iconst_1        
	//  214  320:iadd            
	//  215  321:istore_1        
											if((long)abyte0[i1] < 0L)
	//* 216  322:aload           6
	//* 217  324:iload_2         
	//* 218  325:baload          
	//* 219  326:i2l             
	//* 220  327:lconst_0        
	//* 221  328:lcmp            
	//* 222  329:iflt            335
	//* 223  332:goto            341
												throw zzgf.zzfj();
	//  224  335:invokestatic    #225 <Method zzgf zzgf.zzfj()>
	//  225  338:athrow          
										} else
										{
											i = i1;
	//  226  339:iload_2         
	//  227  340:istore_1        
										}
									}
								}
							}
						}
					}
				}
			}
			pos = i;
	//  228  341:aload_0         
	//  229  342:iload_1         
	//  230  343:putfield        #38  <Field int pos>
			return l1;
	//  231  346:lload           4
	//  232  348:lreturn         
		} else
		{
			throw zzgf.zzfh();
	//  233  349:invokestatic    #55  <Method zzgf zzgf.zzfh()>
	//  234  352:athrow          
		}
	}

	private final long zzdf()
		throws IOException
	{
		long l = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_3        
		for(int i = 0; i < 64; i += 7)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:bipush          64
	//*   6    7:icmpge          43
		{
			byte byte0 = readByte();
	//    7   10:aload_0         
	//    8   11:invokespecial   #238 <Method byte readByte()>
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
		throw zzgf.zzfj();
	//   30   43:invokestatic    #225 <Method zzgf zzgf.zzfj()>
	//   31   46:athrow          
	}

	private final int zzdg()
		throws IOException
	{
		zzaa(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #193 <Method void zzaa(int)>
		return zzdi();
	//    3    5:aload_0         
	//    4    6:invokespecial   #242 <Method int zzdi()>
	//    5    9:ireturn         
	}

	private final long zzdh()
		throws IOException
	{
		zzaa(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokespecial   #193 <Method void zzaa(int)>
		return zzdj();
	//    3    6:aload_0         
	//    4    7:invokespecial   #246 <Method long zzdj()>
	//    5   10:lreturn         
	}

	private final int zzdi()
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int pos>
	//    2    4:istore_1        
		byte abyte0[] = buffer;
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field byte[] buffer>
	//    5    9:astore          5
		pos = i + 4;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_4        
	//    9   14:iadd            
	//   10   15:putfield        #38  <Field int pos>
		byte byte0 = abyte0[i];
	//   11   18:aload           5
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:istore_2        
		byte byte1 = abyte0[i + 1];
	//   15   23:aload           5
	//   16   25:iload_1         
	//   17   26:iconst_1        
	//   18   27:iadd            
	//   19   28:baload          
	//   20   29:istore_3        
		byte byte2 = abyte0[i + 2];
	//   21   30:aload           5
	//   22   32:iload_1         
	//   23   33:iconst_2        
	//   24   34:iadd            
	//   25   35:baload          
	//   26   36:istore          4
		return (abyte0[i + 3] & 0xff) << 24 | (byte0 & 0xff | (byte1 & 0xff) << 8 | (byte2 & 0xff) << 16);
	//   27   38:aload           5
	//   28   40:iload_1         
	//   29   41:iconst_3        
	//   30   42:iadd            
	//   31   43:baload          
	//   32   44:sipush          255
	//   33   47:iand            
	//   34   48:bipush          24
	//   35   50:ishl            
	//   36   51:iload_2         
	//   37   52:sipush          255
	//   38   55:iand            
	//   39   56:iload_3         
	//   40   57:sipush          255
	//   41   60:iand            
	//   42   61:bipush          8
	//   43   63:ishl            
	//   44   64:ior             
	//   45   65:iload           4
	//   46   67:sipush          255
	//   47   70:iand            
	//   48   71:bipush          16
	//   49   73:ishl            
	//   50   74:ior             
	//   51   75:ior             
	//   52   76:ireturn         
	}

	private final long zzdj()
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int pos>
	//    2    4:istore_1        
		byte abyte0[] = buffer;
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field byte[] buffer>
	//    5    9:astore          16
		pos = i + 8;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:bipush          8
	//    9   15:iadd            
	//   10   16:putfield        #38  <Field int pos>
		long l = abyte0[i];
	//   11   19:aload           16
	//   12   21:iload_1         
	//   13   22:baload          
	//   14   23:i2l             
	//   15   24:lstore_2        
		long l1 = abyte0[i + 1];
	//   16   25:aload           16
	//   17   27:iload_1         
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:baload          
	//   21   31:i2l             
	//   22   32:lstore          4
		long l2 = abyte0[i + 2];
	//   23   34:aload           16
	//   24   36:iload_1         
	//   25   37:iconst_2        
	//   26   38:iadd            
	//   27   39:baload          
	//   28   40:i2l             
	//   29   41:lstore          6
		long l3 = abyte0[i + 3];
	//   30   43:aload           16
	//   31   45:iload_1         
	//   32   46:iconst_3        
	//   33   47:iadd            
	//   34   48:baload          
	//   35   49:i2l             
	//   36   50:lstore          8
		long l4 = abyte0[i + 4];
	//   37   52:aload           16
	//   38   54:iload_1         
	//   39   55:iconst_4        
	//   40   56:iadd            
	//   41   57:baload          
	//   42   58:i2l             
	//   43   59:lstore          10
		long l5 = abyte0[i + 5];
	//   44   61:aload           16
	//   45   63:iload_1         
	//   46   64:iconst_5        
	//   47   65:iadd            
	//   48   66:baload          
	//   49   67:i2l             
	//   50   68:lstore          12
		long l6 = abyte0[i + 6];
	//   51   70:aload           16
	//   52   72:iload_1         
	//   53   73:bipush          6
	//   54   75:iadd            
	//   55   76:baload          
	//   56   77:i2l             
	//   57   78:lstore          14
		return ((long)abyte0[i + 7] & 255L) << 56 | (l & 255L | (l1 & 255L) << 8 | (l2 & 255L) << 16 | (l3 & 255L) << 24 | (l4 & 255L) << 32 | (l5 & 255L) << 40 | (l6 & 255L) << 48);
	//   58   80:aload           16
	//   59   82:iload_1         
	//   60   83:bipush          7
	//   61   85:iadd            
	//   62   86:baload          
	//   63   87:i2l             
	//   64   88:ldc2w           #247 <Long 255L>
	//   65   91:land            
	//   66   92:bipush          56
	//   67   94:lshl            
	//   68   95:lload_2         
	//   69   96:ldc2w           #247 <Long 255L>
	//   70   99:land            
	//   71  100:lload           4
	//   72  102:ldc2w           #247 <Long 255L>
	//   73  105:land            
	//   74  106:bipush          8
	//   75  108:lshl            
	//   76  109:lor             
	//   77  110:lload           6
	//   78  112:ldc2w           #247 <Long 255L>
	//   79  115:land            
	//   80  116:bipush          16
	//   81  118:lshl            
	//   82  119:lor             
	//   83  120:lload           8
	//   84  122:ldc2w           #247 <Long 255L>
	//   85  125:land            
	//   86  126:bipush          24
	//   87  128:lshl            
	//   88  129:lor             
	//   89  130:lload           10
	//   90  132:ldc2w           #247 <Long 255L>
	//   91  135:land            
	//   92  136:bipush          32
	//   93  138:lshl            
	//   94  139:lor             
	//   95  140:lload           12
	//   96  142:ldc2w           #247 <Long 255L>
	//   97  145:land            
	//   98  146:bipush          40
	//   99  148:lshl            
	//  100  149:lor             
	//  101  150:lload           14
	//  102  152:ldc2w           #247 <Long 255L>
	//  103  155:land            
	//  104  156:bipush          48
	//  105  158:lshl            
	//  106  159:lor             
	//  107  160:lor             
	//  108  161:lreturn         
	}

	private final String zzg(boolean flag)
		throws IOException
	{
		zzab(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		int i = zzdd();
	//    3    5:aload_0         
	//    4    6:invokespecial   #176 <Method int zzdd()>
	//    5    9:istore_2        
		if(i == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            17
			return "";
	//    8   14:ldc1            #252 <String "">
	//    9   16:areturn         
		zzaa(i);
	//   10   17:aload_0         
	//   11   18:iload_2         
	//   12   19:invokespecial   #193 <Method void zzaa(int)>
		if(flag)
	//*  13   22:iload_1         
	//*  14   23:ifeq            56
		{
			byte abyte0[] = buffer;
	//   15   26:aload_0         
	//   16   27:getfield        #29  <Field byte[] buffer>
	//   17   30:astore          4
			int j = pos;
	//   18   32:aload_0         
	//   19   33:getfield        #38  <Field int pos>
	//   20   36:istore_3        
			if(!zziw.zzg(abyte0, j, j + i))
	//*  21   37:aload           4
	//*  22   39:iload_3         
	//*  23   40:iload_3         
	//*  24   41:iload_2         
	//*  25   42:iadd            
	//*  26   43:invokestatic    #257 <Method boolean zziw.zzg(byte[], int, int)>
	//*  27   46:ifeq            52
	//*  28   49:goto            56
				throw zzgf.zzfp();
	//   29   52:invokestatic    #260 <Method zzgf zzgf.zzfp()>
	//   30   55:athrow          
		}
		String s = new String(buffer, pos, i, zzga.UTF_8);
	//   31   56:new             #262 <Class String>
	//   32   59:dup             
	//   33   60:aload_0         
	//   34   61:getfield        #29  <Field byte[] buffer>
	//   35   64:aload_0         
	//   36   65:getfield        #38  <Field int pos>
	//   37   68:iload_2         
	//   38   69:getstatic       #268 <Field java.nio.charset.Charset zzga.UTF_8>
	//   39   72:invokespecial   #271 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   40   75:astore          4
		pos = pos + i;
	//   41   77:aload_0         
	//   42   78:aload_0         
	//   43   79:getfield        #38  <Field int pos>
	//   44   82:iload_2         
	//   45   83:iadd            
	//   46   84:putfield        #38  <Field int pos>
		return s;
	//   47   87:aload           4
	//   48   89:areturn         
	}

	private final void zzz(int i)
		throws IOException
	{
		zzaa(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #193 <Method void zzaa(int)>
		pos = pos + i;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field int pos>
	//    6   10:iload_1         
	//    7   11:iadd            
	//    8   12:putfield        #38  <Field int pos>
	//    9   15:return          
	}

	public final int getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field int tag>
	//    2    4:ireturn         
	}

	public final double readDouble()
		throws IOException
	{
		zzab(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return Double.longBitsToDouble(zzdh());
	//    3    5:aload_0         
	//    4    6:invokespecial   #275 <Method long zzdh()>
	//    5    9:invokestatic    #279 <Method double Double.longBitsToDouble(long)>
	//    6   12:dreturn         
	}

	public final float readFloat()
		throws IOException
	{
		zzab(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return Float.intBitsToFloat(zzdg());
	//    3    5:aload_0         
	//    4    6:invokespecial   #281 <Method int zzdg()>
	//    5    9:invokestatic    #285 <Method float Float.intBitsToFloat(int)>
	//    6   12:freturn         
	}

	public final String readString()
		throws IOException
	{
		return zzg(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #98  <Method String zzg(boolean)>
	//    3    5:areturn         
	}

	public final void readStringList(List list)
		throws IOException
	{
		zza(list, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #291 <Method void zza(List, boolean)>
	//    4    6:return          
	}

	public final Object zza(zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		zzab(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzb(zzhw1, zzfk);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #294 <Method Object zzb(zzhw, zzfk)>
	//    7   11:areturn         
	}

	public final Object zza(Class class1, zzfk zzfk)
		throws IOException
	{
		zzab(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzb(zzhs.zzgl().zzf(class1), zzfk);
	//    3    5:aload_0         
	//    4    6:invokestatic    #300 <Method zzhs zzhs.zzgl()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #304 <Method zzhw zzhs.zzf(Class)>
	//    7   13:aload_2         
	//    8   14:invokespecial   #294 <Method Object zzb(zzhw, zzfk)>
	//    9   17:areturn         
	}

	public final void zza(List list)
		throws IOException
	{
		if(list instanceof zzfh)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #307 <Class zzfh>
	//*   2    4:ifeq            122
		{
			list = ((List) ((zzfh)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #307 <Class zzfh>
	//    5   11:astore_1        
			switch(tag & 7)
	//*   6   12:aload_0         
	//*   7   13:getfield        #164 <Field int tag>
	//*   8   16:bipush          7
	//*   9   18:iand            
			{
	//*  10   19:tableswitch     1 2: default 40
	//	               1 84
	//	               2 44
			default:
				throw zzgf.zzfm();
	//   11   40:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   12   43:athrow          

			case 2: // '\002'
				int i = zzdd();
	//   13   44:aload_0         
	//   14   45:invokespecial   #176 <Method int zzdd()>
	//   15   48:istore_2        
				zzac(i);
	//   16   49:aload_0         
	//   17   50:iload_2         
	//   18   51:invokespecial   #309 <Method void zzac(int)>
				for(int i1 = pos; pos < i1 + i;)
	//*  19   54:aload_0         
	//*  20   55:getfield        #38  <Field int pos>
	//*  21   58:istore_3        
	//*  22   59:aload_0         
	//*  23   60:getfield        #38  <Field int pos>
	//*  24   63:iload_3         
	//*  25   64:iload_2         
	//*  26   65:iadd            
	//*  27   66:icmpge          83
					((zzfh) (list)).zzc(Double.longBitsToDouble(zzdj()));
	//   28   69:aload_1         
	//   29   70:aload_0         
	//   30   71:invokespecial   #246 <Method long zzdj()>
	//   31   74:invokestatic    #279 <Method double Double.longBitsToDouble(long)>
	//   32   77:invokevirtual   #312 <Method void zzfh.zzc(double)>

	//*  33   80:goto            59
				return;
	//   34   83:return          

			case 1: // '\001'
				break;
			}
			int j;
			do
			{
				((zzfh) (list)).zzc(readDouble());
	//   35   84:aload_1         
	//   36   85:aload_0         
	//   37   86:invokevirtual   #141 <Method double readDouble()>
	//   38   89:invokevirtual   #312 <Method void zzfh.zzc(double)>
				if(zzcm())
	//*  39   92:aload_0         
	//*  40   93:invokespecial   #173 <Method boolean zzcm()>
	//*  41   96:ifeq            100
					return;
	//   42   99:return          
				j = pos;
	//   43  100:aload_0         
	//   44  101:getfield        #38  <Field int pos>
	//   45  104:istore_2        
			} while(zzdd() == tag);
	//   46  105:aload_0         
	//   47  106:invokespecial   #176 <Method int zzdd()>
	//   48  109:aload_0         
	//   49  110:getfield        #164 <Field int tag>
	//   50  113:icmpeq          84
			pos = j;
	//   51  116:aload_0         
	//   52  117:iload_2         
	//   53  118:putfield        #38  <Field int pos>
			return;
	//   54  121:return          
		}
		switch(tag & 7)
	//*  55  122:aload_0         
	//*  56  123:getfield        #164 <Field int tag>
	//*  57  126:bipush          7
	//*  58  128:iand            
		{
	//*  59  129:tableswitch     1 2: default 152
	//	               1 202
	//	               2 156
		default:
			throw zzgf.zzfm();
	//   60  152:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   61  155:athrow          

		case 2: // '\002'
			int k = zzdd();
	//   62  156:aload_0         
	//   63  157:invokespecial   #176 <Method int zzdd()>
	//   64  160:istore_2        
			zzac(k);
	//   65  161:aload_0         
	//   66  162:iload_2         
	//   67  163:invokespecial   #309 <Method void zzac(int)>
			for(int j1 = pos; pos < j1 + k;)
	//*  68  166:aload_0         
	//*  69  167:getfield        #38  <Field int pos>
	//*  70  170:istore_3        
	//*  71  171:aload_0         
	//*  72  172:getfield        #38  <Field int pos>
	//*  73  175:iload_3         
	//*  74  176:iload_2         
	//*  75  177:iadd            
	//*  76  178:icmpge          201
				list.add(((Object) (Double.valueOf(Double.longBitsToDouble(zzdj())))));
	//   77  181:aload_1         
	//   78  182:aload_0         
	//   79  183:invokespecial   #246 <Method long zzdj()>
	//   80  186:invokestatic    #279 <Method double Double.longBitsToDouble(long)>
	//   81  189:invokestatic    #146 <Method Double Double.valueOf(double)>
	//   82  192:invokeinterface #182 <Method boolean List.add(Object)>
	//   83  197:pop             

	//*  84  198:goto            171
			return;
	//   85  201:return          

		case 1: // '\001'
			break;
		}
		int l;
		do
		{
			list.add(((Object) (Double.valueOf(readDouble()))));
	//   86  202:aload_1         
	//   87  203:aload_0         
	//   88  204:invokevirtual   #141 <Method double readDouble()>
	//   89  207:invokestatic    #146 <Method Double Double.valueOf(double)>
	//   90  210:invokeinterface #182 <Method boolean List.add(Object)>
	//   91  215:pop             
			if(zzcm())
	//*  92  216:aload_0         
	//*  93  217:invokespecial   #173 <Method boolean zzcm()>
	//*  94  220:ifeq            224
				return;
	//   95  223:return          
			l = pos;
	//   96  224:aload_0         
	//   97  225:getfield        #38  <Field int pos>
	//   98  228:istore_2        
		} while(zzdd() == tag);
	//   99  229:aload_0         
	//  100  230:invokespecial   #176 <Method int zzdd()>
	//  101  233:aload_0         
	//  102  234:getfield        #164 <Field int tag>
	//  103  237:icmpeq          202
		pos = l;
	//  104  240:aload_0         
	//  105  241:iload_2         
	//  106  242:putfield        #38  <Field int pos>
	//  107  245:return          
	}

	public final void zza(List list, zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		int i = tag;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field int tag>
	//    2    4:istore          4
		if((i & 7) == 2)
	//*   3    6:iload           4
	//*   4    8:bipush          7
	//*   5   10:iand            
	//*   6   11:iconst_2        
	//*   7   12:icmpne          58
		{
			int j;
			do
			{
				list.add(zzb(zzhw1, zzfk));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:invokespecial   #294 <Method Object zzb(zzhw, zzfk)>
	//   13   22:invokeinterface #182 <Method boolean List.add(Object)>
	//   14   27:pop             
				if(zzcm())
	//*  15   28:aload_0         
	//*  16   29:invokespecial   #173 <Method boolean zzcm()>
	//*  17   32:ifeq            36
					return;
	//   18   35:return          
				j = pos;
	//   19   36:aload_0         
	//   20   37:getfield        #38  <Field int pos>
	//   21   40:istore          5
			} while(zzdd() == i);
	//   22   42:aload_0         
	//   23   43:invokespecial   #176 <Method int zzdd()>
	//   24   46:iload           4
	//   25   48:icmpeq          15
			pos = j;
	//   26   51:aload_0         
	//   27   52:iload           5
	//   28   54:putfield        #38  <Field int pos>
			return;
	//   29   57:return          
		} else
		{
			throw zzgf.zzfm();
	//   30   58:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   31   61:athrow          
		}
	}

	public final void zza(Map map, zzgy zzgy1, zzfk zzfk)
		throws IOException
	{
		int i;
		zzab(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		int j = zzdd();
	//    3    5:aload_0         
	//    4    6:invokespecial   #176 <Method int zzdd()>
	//    5    9:istore          5
		zzaa(j);
	//    6   11:aload_0         
	//    7   12:iload           5
	//    8   14:invokespecial   #193 <Method void zzaa(int)>
		i = limit;
	//    9   17:aload_0         
	//   10   18:getfield        #44  <Field int limit>
	//   11   21:istore          4
		limit = pos + j;
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #38  <Field int pos>
	//   15   28:iload           5
	//   16   30:iadd            
	//   17   31:putfield        #44  <Field int limit>
		Object obj;
		Object obj1;
		obj = zzgy1.zzyw;
	//   18   34:aload_2         
	//   19   35:getfield        #324 <Field Object zzgy.zzyw>
	//   20   38:astore          7
		obj1 = zzgy1.zzgq;
	//   21   40:aload_2         
	//   22   41:getfield        #327 <Field Object zzgy.zzgq>
	//   23   44:astore          8
_L7:
		int k = zzcn();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #330 <Method int zzcn()>
	//   26   50:istore          5
		if(k == 0x7fffffff) goto _L2; else goto _L1
	//   27   52:iload           5
	//   28   54:ldc2            #331 <Int 0x7fffffff>
	//   29   57:icmpeq          169
_L1:
		k;
	//   30   60:iload           5
		JVM INSTR tableswitch 1 2: default 84
	//	               1 118
	//	               2 93;
	//   31   62:tableswitch     1 2: default 84
	//	               1 118
	//	               2 93
		   goto _L3 _L4 _L5
_L3:
		boolean flag = zzco();
	//   32   84:aload_0         
	//   33   85:invokevirtual   #334 <Method boolean zzco()>
	//   34   88:istore          6
		  goto _L6
	//*  35   90:goto            201
_L5:
		Object obj2 = zza(zzgy1.zzyx, zzgy1.zzgq.getClass(), zzfk);
	//   36   93:aload_0         
	//   37   94:aload_2         
	//   38   95:getfield        #338 <Field zzjd zzgy.zzyx>
	//   39   98:aload_2         
	//   40   99:getfield        #327 <Field Object zzgy.zzgq>
	//   41  102:invokevirtual   #344 <Method Class Object.getClass()>
	//   42  105:aload_3         
	//   43  106:invokespecial   #346 <Method Object zza(zzjd, Class, zzfk)>
	//   44  109:astore          9
		obj1 = obj2;
	//   45  111:aload           9
	//   46  113:astore          8
		  goto _L7
	//*  47  115:goto            46
_L4:
		obj2 = zza(zzgy1.zzyv, ((Class) (null)), ((zzfk) (null)));
	//   48  118:aload_0         
	//   49  119:aload_2         
	//   50  120:getfield        #349 <Field zzjd zzgy.zzyv>
	//   51  123:aconst_null     
	//   52  124:aconst_null     
	//   53  125:invokespecial   #346 <Method Object zza(zzjd, Class, zzfk)>
	//   54  128:astore          9
		obj = obj2;
	//   55  130:aload           9
	//   56  132:astore          7
		  goto _L7
	//*  57  134:goto            46
_L8:
		try
		{
			throw new zzgf("Unable to parse map entry.");
	//   58  137:new             #51  <Class zzgf>
	//   59  140:dup             
	//   60  141:ldc2            #351 <String "Unable to parse map entry.">
	//   61  144:invokespecial   #352 <Method void zzgf(String)>
	//   62  147:athrow          
		}
	//*  63  148:aload_0         
	//*  64  149:invokevirtual   #334 <Method boolean zzco()>
	//*  65  152:ifeq            158
	//*  66  155:goto            46
	//*  67  158:new             #51  <Class zzgf>
	//*  68  161:dup             
	//*  69  162:ldc2            #351 <String "Unable to parse map entry.">
	//*  70  165:invokespecial   #352 <Method void zzgf(String)>
	//*  71  168:athrow          
	//*  72  169:aload_1         
	//*  73  170:aload           7
	//*  74  172:aload           8
	//*  75  174:invokeinterface #358 <Method Object Map.put(Object, Object)>
	//*  76  179:pop             
	//*  77  180:aload_0         
	//*  78  181:iload           4
	//*  79  183:putfield        #44  <Field int limit>
	//*  80  186:return          
	//*  81  187:astore_1        
	//*  82  188:aload_0         
	//*  83  189:iload           4
	//*  84  191:putfield        #44  <Field int limit>
	//*  85  194:aload_1         
	//*  86  195:athrow          
		catch(zzgg zzgg1) { }
	//   87  196:astore          9
		if(zzco())
			break; /* Loop/switch isn't completed */
		throw new zzgf("Unable to parse map entry.");
_L2:
		map.put(obj, obj1);
		limit = i;
		return;
		map;
		limit = i;
		throw map;
	//*  88  198:goto            148
_L6:
		if(!flag) goto _L8; else goto _L7
	//   89  201:iload           6
	//   90  203:ifeq            137
	//*  91  206:goto            46
	}

	public final Object zzb(Class class1, zzfk zzfk)
		throws IOException
	{
		zzab(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzd(zzhs.zzgl().zzf(class1), zzfk);
	//    3    5:aload_0         
	//    4    6:invokestatic    #300 <Method zzhs zzhs.zzgl()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #304 <Method zzhw zzhs.zzf(Class)>
	//    7   13:aload_2         
	//    8   14:invokespecial   #361 <Method Object zzd(zzhw, zzfk)>
	//    9   17:areturn         
	}

	public final void zzb(List list)
		throws IOException
	{
		if(list instanceof zzfv)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #363 <Class zzfv>
	//*   2    4:ifeq            112
		{
			list = ((List) ((zzfv)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #363 <Class zzfv>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #164 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 2)
	//*  11   20:iload_2         
	//*  12   21:iconst_2        
	//*  13   22:icmpeq          72
				if(i == 5)
	//*  14   25:iload_2         
	//*  15   26:iconst_5        
	//*  16   27:icmpne          68
				{
					do
					{
						((zzfv) (list)).zzh(readFloat());
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:invokevirtual   #123 <Method float readFloat()>
	//   20   35:invokevirtual   #367 <Method void zzfv.zzh(float)>
						if(zzcm())
	//*  21   38:aload_0         
	//*  22   39:invokespecial   #173 <Method boolean zzcm()>
	//*  23   42:ifeq            46
							return;
	//   24   45:return          
						i = pos;
	//   25   46:aload_0         
	//   26   47:getfield        #38  <Field int pos>
	//   27   50:istore_2        
					} while(zzdd() == tag);
	//   28   51:aload_0         
	//   29   52:invokespecial   #176 <Method int zzdd()>
	//   30   55:aload_0         
	//   31   56:getfield        #164 <Field int tag>
	//   32   59:icmpeq          30
					pos = i;
	//   33   62:aload_0         
	//   34   63:iload_2         
	//   35   64:putfield        #38  <Field int pos>
					return;
	//   36   67:return          
				} else
				{
					throw zzgf.zzfm();
	//   37   68:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   38   71:athrow          
				}
			i = zzdd();
	//   39   72:aload_0         
	//   40   73:invokespecial   #176 <Method int zzdd()>
	//   41   76:istore_2        
			zzad(i);
	//   42   77:aload_0         
	//   43   78:iload_2         
	//   44   79:invokespecial   #369 <Method void zzad(int)>
			for(int k = pos; pos < k + i;)
	//*  45   82:aload_0         
	//*  46   83:getfield        #38  <Field int pos>
	//*  47   86:istore_3        
	//*  48   87:aload_0         
	//*  49   88:getfield        #38  <Field int pos>
	//*  50   91:iload_3         
	//*  51   92:iload_2         
	//*  52   93:iadd            
	//*  53   94:icmpge          111
				((zzfv) (list)).zzh(Float.intBitsToFloat(zzdi()));
	//   54   97:aload_1         
	//   55   98:aload_0         
	//   56   99:invokespecial   #242 <Method int zzdi()>
	//   57  102:invokestatic    #285 <Method float Float.intBitsToFloat(int)>
	//   58  105:invokevirtual   #367 <Method void zzfv.zzh(float)>

	//*  59  108:goto            87
			return;
	//   60  111:return          
		}
		int j = tag & 7;
	//   61  112:aload_0         
	//   62  113:getfield        #164 <Field int tag>
	//   63  116:bipush          7
	//   64  118:iand            
	//   65  119:istore_2        
		if(j != 2)
	//*  66  120:iload_2         
	//*  67  121:iconst_2        
	//*  68  122:icmpeq          178
			if(j == 5)
	//*  69  125:iload_2         
	//*  70  126:iconst_5        
	//*  71  127:icmpne          174
			{
				do
				{
					list.add(((Object) (Float.valueOf(readFloat()))));
	//   72  130:aload_1         
	//   73  131:aload_0         
	//   74  132:invokevirtual   #123 <Method float readFloat()>
	//   75  135:invokestatic    #128 <Method Float Float.valueOf(float)>
	//   76  138:invokeinterface #182 <Method boolean List.add(Object)>
	//   77  143:pop             
					if(zzcm())
	//*  78  144:aload_0         
	//*  79  145:invokespecial   #173 <Method boolean zzcm()>
	//*  80  148:ifeq            152
						return;
	//   81  151:return          
					j = pos;
	//   82  152:aload_0         
	//   83  153:getfield        #38  <Field int pos>
	//   84  156:istore_2        
				} while(zzdd() == tag);
	//   85  157:aload_0         
	//   86  158:invokespecial   #176 <Method int zzdd()>
	//   87  161:aload_0         
	//   88  162:getfield        #164 <Field int tag>
	//   89  165:icmpeq          130
				pos = j;
	//   90  168:aload_0         
	//   91  169:iload_2         
	//   92  170:putfield        #38  <Field int pos>
				return;
	//   93  173:return          
			} else
			{
				throw zzgf.zzfm();
	//   94  174:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   95  177:athrow          
			}
		j = zzdd();
	//   96  178:aload_0         
	//   97  179:invokespecial   #176 <Method int zzdd()>
	//   98  182:istore_2        
		zzad(j);
	//   99  183:aload_0         
	//  100  184:iload_2         
	//  101  185:invokespecial   #369 <Method void zzad(int)>
		for(int l = pos; pos < l + j;)
	//* 102  188:aload_0         
	//* 103  189:getfield        #38  <Field int pos>
	//* 104  192:istore_3        
	//* 105  193:aload_0         
	//* 106  194:getfield        #38  <Field int pos>
	//* 107  197:iload_3         
	//* 108  198:iload_2         
	//* 109  199:iadd            
	//* 110  200:icmpge          223
			list.add(((Object) (Float.valueOf(Float.intBitsToFloat(zzdi())))));
	//  111  203:aload_1         
	//  112  204:aload_0         
	//  113  205:invokespecial   #242 <Method int zzdi()>
	//  114  208:invokestatic    #285 <Method float Float.intBitsToFloat(int)>
	//  115  211:invokestatic    #128 <Method Float Float.valueOf(float)>
	//  116  214:invokeinterface #182 <Method boolean List.add(Object)>
	//  117  219:pop             

	//* 118  220:goto            193
	//  119  223:return          
	}

	public final void zzb(List list, zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		int i = tag;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field int tag>
	//    2    4:istore          4
		if((i & 7) == 3)
	//*   3    6:iload           4
	//*   4    8:bipush          7
	//*   5   10:iand            
	//*   6   11:iconst_3        
	//*   7   12:icmpne          58
		{
			int j;
			do
			{
				list.add(zzd(zzhw1, zzfk));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:invokespecial   #361 <Method Object zzd(zzhw, zzfk)>
	//   13   22:invokeinterface #182 <Method boolean List.add(Object)>
	//   14   27:pop             
				if(zzcm())
	//*  15   28:aload_0         
	//*  16   29:invokespecial   #173 <Method boolean zzcm()>
	//*  17   32:ifeq            36
					return;
	//   18   35:return          
				j = pos;
	//   19   36:aload_0         
	//   20   37:getfield        #38  <Field int pos>
	//   21   40:istore          5
			} while(zzdd() == i);
	//   22   42:aload_0         
	//   23   43:invokespecial   #176 <Method int zzdd()>
	//   24   46:iload           4
	//   25   48:icmpeq          15
			pos = j;
	//   26   51:aload_0         
	//   27   52:iload           5
	//   28   54:putfield        #38  <Field int pos>
			return;
	//   29   57:return          
		} else
		{
			throw zzgf.zzfm();
	//   30   58:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   31   61:athrow          
		}
	}

	public final Object zzc(zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		zzab(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzd(zzhw1, zzfk);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #361 <Method Object zzd(zzhw, zzfk)>
	//    7   11:areturn         
	}

	public final void zzc(List list)
		throws IOException
	{
		if(list instanceof zzgt)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #372 <Class zzgt>
	//*   2    4:ifeq            108
		{
			list = ((List) ((zzgt)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #372 <Class zzgt>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #164 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            70
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          66
				{
					i = zzdd();
	//   16   29:aload_0         
	//   17   30:invokespecial   #176 <Method int zzdd()>
	//   18   33:istore_2        
					for(i = pos + i; pos < i;)
	//*  19   34:aload_0         
	//*  20   35:getfield        #38  <Field int pos>
	//*  21   38:iload_2         
	//*  22   39:iadd            
	//*  23   40:istore_2        
	//*  24   41:aload_0         
	//*  25   42:getfield        #38  <Field int pos>
	//*  26   45:iload_2         
	//*  27   46:icmpge          60
						((zzgt) (list)).zzp(zzde());
	//   28   49:aload_1         
	//   29   50:aload_0         
	//   30   51:invokespecial   #374 <Method long zzde()>
	//   31   54:invokevirtual   #378 <Method void zzgt.zzp(long)>

	//*  32   57:goto            41
					zzae(i);
	//   33   60:aload_0         
	//   34   61:iload_2         
	//   35   62:invokespecial   #380 <Method void zzae(int)>
					return;
	//   36   65:return          
				} else
				{
					throw zzgf.zzfm();
	//   37   66:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   38   69:athrow          
				}
			do
			{
				((zzgt) (list)).zzp(zzcp());
	//   39   70:aload_1         
	//   40   71:aload_0         
	//   41   72:invokevirtual   #80  <Method long zzcp()>
	//   42   75:invokevirtual   #378 <Method void zzgt.zzp(long)>
				if(zzcm())
	//*  43   78:aload_0         
	//*  44   79:invokespecial   #173 <Method boolean zzcm()>
	//*  45   82:ifeq            86
					return;
	//   46   85:return          
				i = pos;
	//   47   86:aload_0         
	//   48   87:getfield        #38  <Field int pos>
	//   49   90:istore_2        
			} while(zzdd() == tag);
	//   50   91:aload_0         
	//   51   92:invokespecial   #176 <Method int zzdd()>
	//   52   95:aload_0         
	//   53   96:getfield        #164 <Field int tag>
	//   54   99:icmpeq          70
			pos = i;
	//   55  102:aload_0         
	//   56  103:iload_2         
	//   57  104:putfield        #38  <Field int pos>
			return;
	//   58  107:return          
		}
		int j = tag & 7;
	//   59  108:aload_0         
	//   60  109:getfield        #164 <Field int tag>
	//   61  112:bipush          7
	//   62  114:iand            
	//   63  115:istore_2        
		if(j != 0)
	//*  64  116:iload_2         
	//*  65  117:ifeq            172
			if(j == 2)
	//*  66  120:iload_2         
	//*  67  121:iconst_2        
	//*  68  122:icmpne          168
			{
				j = zzdd();
	//   69  125:aload_0         
	//   70  126:invokespecial   #176 <Method int zzdd()>
	//   71  129:istore_2        
				for(j = pos + j; pos < j;)
	//*  72  130:aload_0         
	//*  73  131:getfield        #38  <Field int pos>
	//*  74  134:iload_2         
	//*  75  135:iadd            
	//*  76  136:istore_2        
	//*  77  137:aload_0         
	//*  78  138:getfield        #38  <Field int pos>
	//*  79  141:iload_2         
	//*  80  142:icmpge          162
					list.add(((Object) (Long.valueOf(zzde()))));
	//   81  145:aload_1         
	//   82  146:aload_0         
	//   83  147:invokespecial   #374 <Method long zzde()>
	//   84  150:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   85  153:invokeinterface #182 <Method boolean List.add(Object)>
	//   86  158:pop             

	//*  87  159:goto            137
				zzae(j);
	//   88  162:aload_0         
	//   89  163:iload_2         
	//   90  164:invokespecial   #380 <Method void zzae(int)>
				return;
	//   91  167:return          
			} else
			{
				throw zzgf.zzfm();
	//   92  168:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   93  171:athrow          
			}
		do
		{
			list.add(((Object) (Long.valueOf(zzcp()))));
	//   94  172:aload_1         
	//   95  173:aload_0         
	//   96  174:invokevirtual   #80  <Method long zzcp()>
	//   97  177:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   98  180:invokeinterface #182 <Method boolean List.add(Object)>
	//   99  185:pop             
			if(zzcm())
	//* 100  186:aload_0         
	//* 101  187:invokespecial   #173 <Method boolean zzcm()>
	//* 102  190:ifeq            194
				return;
	//  103  193:return          
			j = pos;
	//  104  194:aload_0         
	//  105  195:getfield        #38  <Field int pos>
	//  106  198:istore_2        
		} while(zzdd() == tag);
	//  107  199:aload_0         
	//  108  200:invokespecial   #176 <Method int zzdd()>
	//  109  203:aload_0         
	//  110  204:getfield        #164 <Field int tag>
	//  111  207:icmpeq          172
		pos = j;
	//  112  210:aload_0         
	//  113  211:iload_2         
	//  114  212:putfield        #38  <Field int pos>
	//  115  215:return          
	}

	public final int zzcn()
		throws IOException
	{
		if(zzcm())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #173 <Method boolean zzcm()>
	//*   2    4:ifeq            11
			return 0x7fffffff;
	//    3    7:ldc2            #331 <Int 0x7fffffff>
	//    4   10:ireturn         
		tag = zzdd();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokespecial   #176 <Method int zzdd()>
	//    8   16:putfield        #164 <Field int tag>
		int i = tag;
	//    9   19:aload_0         
	//   10   20:getfield        #164 <Field int tag>
	//   11   23:istore_1        
		if(i == zzru)
	//*  12   24:iload_1         
	//*  13   25:aload_0         
	//*  14   26:getfield        #217 <Field int zzru>
	//*  15   29:icmpne          36
			return 0x7fffffff;
	//   16   32:ldc2            #331 <Int 0x7fffffff>
	//   17   35:ireturn         
		else
			return i >>> 3;
	//   18   36:iload_1         
	//   19   37:iconst_3        
	//   20   38:iushr           
	//   21   39:ireturn         
	}

	public final boolean zzco()
		throws IOException
	{
		boolean flag1 = zzcm();
	//    0    0:aload_0         
	//    1    1:invokespecial   #173 <Method boolean zzcm()>
	//    2    4:istore          5
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		if(!flag1)
	//*   5    9:iload           5
	//*   6   11:ifne            242
		{
			int i = tag;
	//    7   14:aload_0         
	//    8   15:getfield        #164 <Field int tag>
	//    9   18:istore_1        
			int k = zzru;
	//   10   19:aload_0         
	//   11   20:getfield        #217 <Field int zzru>
	//   12   23:istore_2        
			if(i == k)
	//*  13   24:iload_1         
	//*  14   25:iload_2         
	//*  15   26:icmpne          31
				return false;
	//   16   29:iconst_0        
	//   17   30:ireturn         
			int l = i & 7;
	//   18   31:iload_1         
	//   19   32:bipush          7
	//   20   34:iand            
	//   21   35:istore_3        
			if(l != 5)
	//*  22   36:iload_3         
	//*  23   37:iconst_5        
	//*  24   38:icmpeq          235
			{
				switch(l)
	//*  25   41:iload_3         
				{
	//*  26   42:tableswitch     0 3: default 72
	//	               0 144
	//	               1 136
	//	               2 126
	//	               3 76
				default:
					throw zzgf.zzfm();
	//   27   72:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   28   75:athrow          

				case 3: // '\003'
					zzru = (i >>> 3) << 3 | 4;
	//   29   76:aload_0         
	//   30   77:iload_1         
	//   31   78:iconst_3        
	//   32   79:iushr           
	//   33   80:iconst_3        
	//   34   81:ishl            
	//   35   82:iconst_4        
	//   36   83:ior             
	//   37   84:putfield        #217 <Field int zzru>
					while(zzcn() != 0x7fffffff && zzco()) ;
	//   38   87:aload_0         
	//   39   88:invokevirtual   #330 <Method int zzcn()>
	//   40   91:ldc2            #331 <Int 0x7fffffff>
	//   41   94:icmpeq          104
	//   42   97:aload_0         
	//   43   98:invokevirtual   #334 <Method boolean zzco()>
	//   44  101:ifne            87
					if(tag == zzru)
	//*  45  104:aload_0         
	//*  46  105:getfield        #164 <Field int tag>
	//*  47  108:aload_0         
	//*  48  109:getfield        #217 <Field int zzru>
	//*  49  112:icmpne          122
					{
						zzru = k;
	//   50  115:aload_0         
	//   51  116:iload_2         
	//   52  117:putfield        #217 <Field int zzru>
						return true;
	//   53  120:iconst_1        
	//   54  121:ireturn         
					} else
					{
						throw zzgf.zzfo();
	//   55  122:invokestatic    #196 <Method zzgf zzgf.zzfo()>
	//   56  125:athrow          
					}

				case 2: // '\002'
					zzz(zzdd());
	//   57  126:aload_0         
	//   58  127:aload_0         
	//   59  128:invokespecial   #176 <Method int zzdd()>
	//   60  131:invokespecial   #383 <Method void zzz(int)>
					return true;
	//   61  134:iconst_1        
	//   62  135:ireturn         

				case 1: // '\001'
					zzz(8);
	//   63  136:aload_0         
	//   64  137:bipush          8
	//   65  139:invokespecial   #383 <Method void zzz(int)>
					return true;
	//   66  142:iconst_1        
	//   67  143:ireturn         

				case 0: // '\0'
					i = limit;
	//   68  144:aload_0         
	//   69  145:getfield        #44  <Field int limit>
	//   70  148:istore_1        
					k = pos;
	//   71  149:aload_0         
	//   72  150:getfield        #38  <Field int pos>
	//   73  153:istore_2        
					l = ((int) (flag));
	//   74  154:iload           4
	//   75  156:istore_3        
					break;
				}
				if(i - k >= 10)
	//*  76  157:iload_1         
	//*  77  158:iload_2         
	//*  78  159:isub            
	//*  79  160:bipush          10
	//*  80  162:icmplt          209
				{
					byte abyte0[] = buffer;
	//   81  165:aload_0         
	//   82  166:getfield        #29  <Field byte[] buffer>
	//   83  169:astore          6
					int j = 0;
	//   84  171:iconst_0        
	//   85  172:istore_1        
					do
					{
						l = ((int) (flag));
	//   86  173:iload           4
	//   87  175:istore_3        
						if(j >= 10)
							break;
	//   88  176:iload_1         
	//   89  177:bipush          10
	//   90  179:icmpge          209
						l = k + 1;
	//   91  182:iload_2         
	//   92  183:iconst_1        
	//   93  184:iadd            
	//   94  185:istore_3        
						if(abyte0[k] >= 0)
	//*  95  186:aload           6
	//*  96  188:iload_2         
	//*  97  189:baload          
	//*  98  190:iflt            200
						{
							pos = l;
	//   99  193:aload_0         
	//  100  194:iload_3         
	//  101  195:putfield        #38  <Field int pos>
							return true;
	//  102  198:iconst_1        
	//  103  199:ireturn         
						}
						j++;
	//  104  200:iload_1         
	//  105  201:iconst_1        
	//  106  202:iadd            
	//  107  203:istore_1        
						k = l;
	//  108  204:iload_3         
	//  109  205:istore_2        
					} while(true);
	//  110  206:goto            173
				}
				while(l < 10) 
	//* 111  209:iload_3         
	//* 112  210:bipush          10
	//* 113  212:icmpge          231
					if(readByte() < 0)
	//* 114  215:aload_0         
	//* 115  216:invokespecial   #238 <Method byte readByte()>
	//* 116  219:ifge            229
						l++;
	//  117  222:iload_3         
	//  118  223:iconst_1        
	//  119  224:iadd            
	//  120  225:istore_3        
					else
	//* 121  226:goto            209
						return true;
	//  122  229:iconst_1        
	//  123  230:ireturn         
				throw zzgf.zzfj();
	//  124  231:invokestatic    #225 <Method zzgf zzgf.zzfj()>
	//  125  234:athrow          
			} else
			{
				zzz(4);
	//  126  235:aload_0         
	//  127  236:iconst_4        
	//  128  237:invokespecial   #383 <Method void zzz(int)>
				return true;
	//  129  240:iconst_1        
	//  130  241:ireturn         
			}
		} else
		{
			return false;
	//  131  242:iconst_0        
	//  132  243:ireturn         
		}
	}

	public final long zzcp()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzde();
	//    3    5:aload_0         
	//    4    6:invokespecial   #374 <Method long zzde()>
	//    5    9:lreturn         
	}

	public final long zzcq()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzde();
	//    3    5:aload_0         
	//    4    6:invokespecial   #374 <Method long zzde()>
	//    5    9:lreturn         
	}

	public final int zzcr()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzdd();
	//    3    5:aload_0         
	//    4    6:invokespecial   #176 <Method int zzdd()>
	//    5    9:ireturn         
	}

	public final long zzcs()
		throws IOException
	{
		zzab(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzdh();
	//    3    5:aload_0         
	//    4    6:invokespecial   #275 <Method long zzdh()>
	//    5    9:lreturn         
	}

	public final int zzct()
		throws IOException
	{
		zzab(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzdg();
	//    3    5:aload_0         
	//    4    6:invokespecial   #281 <Method int zzdg()>
	//    5    9:ireturn         
	}

	public final boolean zzcu()
		throws IOException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		zzab(0);
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #250 <Method void zzab(int)>
		if(zzdd() != 0)
	//*   5    7:aload_0         
	//*   6    8:invokespecial   #176 <Method int zzdd()>
	//*   7   11:ifeq            16
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		return flag;
	//   10   16:iload_1         
	//   11   17:ireturn         
	}

	public final String zzcv()
		throws IOException
	{
		return zzg(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #98  <Method String zzg(boolean)>
	//    3    5:areturn         
	}

	public final zzeo zzcw()
		throws IOException
	{
		zzab(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		int i = zzdd();
	//    3    5:aload_0         
	//    4    6:invokespecial   #176 <Method int zzdd()>
	//    5    9:istore_1        
		if(i == 0)
	//*   6   10:iload_1         
	//*   7   11:ifne            18
			return zzeo.zzrx;
	//    8   14:getstatic       #390 <Field zzeo zzeo.zzrx>
	//    9   17:areturn         
		zzaa(i);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokespecial   #193 <Method void zzaa(int)>
		zzeo zzeo1;
		if(zzrs)
	//*  13   23:aload_0         
	//*  14   24:getfield        #21  <Field boolean zzrs>
	//*  15   27:ifeq            46
			zzeo1 = zzeo.zzc(buffer, pos, i);
	//   16   30:aload_0         
	//   17   31:getfield        #29  <Field byte[] buffer>
	//   18   34:aload_0         
	//   19   35:getfield        #38  <Field int pos>
	//   20   38:iload_1         
	//   21   39:invokestatic    #393 <Method zzeo zzeo.zzc(byte[], int, int)>
	//   22   42:astore_2        
		else
	//*  23   43:goto            59
			zzeo1 = zzeo.zzb(buffer, pos, i);
	//   24   46:aload_0         
	//   25   47:getfield        #29  <Field byte[] buffer>
	//   26   50:aload_0         
	//   27   51:getfield        #38  <Field int pos>
	//   28   54:iload_1         
	//   29   55:invokestatic    #395 <Method zzeo zzeo.zzb(byte[], int, int)>
	//   30   58:astore_2        
		pos = pos + i;
	//   31   59:aload_0         
	//   32   60:aload_0         
	//   33   61:getfield        #38  <Field int pos>
	//   34   64:iload_1         
	//   35   65:iadd            
	//   36   66:putfield        #38  <Field int pos>
		return zzeo1;
	//   37   69:aload_2         
	//   38   70:areturn         
	}

	public final int zzcx()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzdd();
	//    3    5:aload_0         
	//    4    6:invokespecial   #176 <Method int zzdd()>
	//    5    9:ireturn         
	}

	public final int zzcy()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzdd();
	//    3    5:aload_0         
	//    4    6:invokespecial   #176 <Method int zzdd()>
	//    5    9:ireturn         
	}

	public final int zzcz()
		throws IOException
	{
		zzab(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzdg();
	//    3    5:aload_0         
	//    4    6:invokespecial   #281 <Method int zzdg()>
	//    5    9:ireturn         
	}

	public final void zzd(List list)
		throws IOException
	{
		if(list instanceof zzgt)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #372 <Class zzgt>
	//*   2    4:ifeq            108
		{
			list = ((List) ((zzgt)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #372 <Class zzgt>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #164 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            70
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          66
				{
					i = zzdd();
	//   16   29:aload_0         
	//   17   30:invokespecial   #176 <Method int zzdd()>
	//   18   33:istore_2        
					for(i = pos + i; pos < i;)
	//*  19   34:aload_0         
	//*  20   35:getfield        #38  <Field int pos>
	//*  21   38:iload_2         
	//*  22   39:iadd            
	//*  23   40:istore_2        
	//*  24   41:aload_0         
	//*  25   42:getfield        #38  <Field int pos>
	//*  26   45:iload_2         
	//*  27   46:icmpge          60
						((zzgt) (list)).zzp(zzde());
	//   28   49:aload_1         
	//   29   50:aload_0         
	//   30   51:invokespecial   #374 <Method long zzde()>
	//   31   54:invokevirtual   #378 <Method void zzgt.zzp(long)>

	//*  32   57:goto            41
					zzae(i);
	//   33   60:aload_0         
	//   34   61:iload_2         
	//   35   62:invokespecial   #380 <Method void zzae(int)>
					return;
	//   36   65:return          
				} else
				{
					throw zzgf.zzfm();
	//   37   66:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   38   69:athrow          
				}
			do
			{
				((zzgt) (list)).zzp(zzcq());
	//   39   70:aload_1         
	//   40   71:aload_0         
	//   41   72:invokevirtual   #116 <Method long zzcq()>
	//   42   75:invokevirtual   #378 <Method void zzgt.zzp(long)>
				if(zzcm())
	//*  43   78:aload_0         
	//*  44   79:invokespecial   #173 <Method boolean zzcm()>
	//*  45   82:ifeq            86
					return;
	//   46   85:return          
				i = pos;
	//   47   86:aload_0         
	//   48   87:getfield        #38  <Field int pos>
	//   49   90:istore_2        
			} while(zzdd() == tag);
	//   50   91:aload_0         
	//   51   92:invokespecial   #176 <Method int zzdd()>
	//   52   95:aload_0         
	//   53   96:getfield        #164 <Field int tag>
	//   54   99:icmpeq          70
			pos = i;
	//   55  102:aload_0         
	//   56  103:iload_2         
	//   57  104:putfield        #38  <Field int pos>
			return;
	//   58  107:return          
		}
		int j = tag & 7;
	//   59  108:aload_0         
	//   60  109:getfield        #164 <Field int tag>
	//   61  112:bipush          7
	//   62  114:iand            
	//   63  115:istore_2        
		if(j != 0)
	//*  64  116:iload_2         
	//*  65  117:ifeq            172
			if(j == 2)
	//*  66  120:iload_2         
	//*  67  121:iconst_2        
	//*  68  122:icmpne          168
			{
				j = zzdd();
	//   69  125:aload_0         
	//   70  126:invokespecial   #176 <Method int zzdd()>
	//   71  129:istore_2        
				for(j = pos + j; pos < j;)
	//*  72  130:aload_0         
	//*  73  131:getfield        #38  <Field int pos>
	//*  74  134:iload_2         
	//*  75  135:iadd            
	//*  76  136:istore_2        
	//*  77  137:aload_0         
	//*  78  138:getfield        #38  <Field int pos>
	//*  79  141:iload_2         
	//*  80  142:icmpge          162
					list.add(((Object) (Long.valueOf(zzde()))));
	//   81  145:aload_1         
	//   82  146:aload_0         
	//   83  147:invokespecial   #374 <Method long zzde()>
	//   84  150:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   85  153:invokeinterface #182 <Method boolean List.add(Object)>
	//   86  158:pop             

	//*  87  159:goto            137
				zzae(j);
	//   88  162:aload_0         
	//   89  163:iload_2         
	//   90  164:invokespecial   #380 <Method void zzae(int)>
				return;
	//   91  167:return          
			} else
			{
				throw zzgf.zzfm();
	//   92  168:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   93  171:athrow          
			}
		do
		{
			list.add(((Object) (Long.valueOf(zzcq()))));
	//   94  172:aload_1         
	//   95  173:aload_0         
	//   96  174:invokevirtual   #116 <Method long zzcq()>
	//   97  177:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   98  180:invokeinterface #182 <Method boolean List.add(Object)>
	//   99  185:pop             
			if(zzcm())
	//* 100  186:aload_0         
	//* 101  187:invokespecial   #173 <Method boolean zzcm()>
	//* 102  190:ifeq            194
				return;
	//  103  193:return          
			j = pos;
	//  104  194:aload_0         
	//  105  195:getfield        #38  <Field int pos>
	//  106  198:istore_2        
		} while(zzdd() == tag);
	//  107  199:aload_0         
	//  108  200:invokespecial   #176 <Method int zzdd()>
	//  109  203:aload_0         
	//  110  204:getfield        #164 <Field int tag>
	//  111  207:icmpeq          172
		pos = j;
	//  112  210:aload_0         
	//  113  211:iload_2         
	//  114  212:putfield        #38  <Field int pos>
	//  115  215:return          
	}

	public final long zzda()
		throws IOException
	{
		zzab(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzdh();
	//    3    5:aload_0         
	//    4    6:invokespecial   #275 <Method long zzdh()>
	//    5    9:lreturn         
	}

	public final int zzdb()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzez.zzaq(zzdd());
	//    3    5:aload_0         
	//    4    6:invokespecial   #176 <Method int zzdd()>
	//    5    9:invokestatic    #401 <Method int zzez.zzaq(int)>
	//    6   12:ireturn         
	}

	public final long zzdc()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #250 <Method void zzab(int)>
		return zzez.zzd(zzde());
	//    3    5:aload_0         
	//    4    6:invokespecial   #374 <Method long zzde()>
	//    5    9:invokestatic    #404 <Method long zzez.zzd(long)>
	//    6   12:lreturn         
	}

	public final void zze(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #406 <Class zzfz>
	//*   2    4:ifeq            108
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #406 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #164 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            70
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          66
				{
					i = zzdd();
	//   16   29:aload_0         
	//   17   30:invokespecial   #176 <Method int zzdd()>
	//   18   33:istore_2        
					for(i = pos + i; pos < i;)
	//*  19   34:aload_0         
	//*  20   35:getfield        #38  <Field int pos>
	//*  21   38:iload_2         
	//*  22   39:iadd            
	//*  23   40:istore_2        
	//*  24   41:aload_0         
	//*  25   42:getfield        #38  <Field int pos>
	//*  26   45:iload_2         
	//*  27   46:icmpge          60
						((zzfz) (list)).zzbg(zzdd());
	//   28   49:aload_1         
	//   29   50:aload_0         
	//   30   51:invokespecial   #176 <Method int zzdd()>
	//   31   54:invokevirtual   #409 <Method void zzfz.zzbg(int)>

	//*  32   57:goto            41
					zzae(i);
	//   33   60:aload_0         
	//   34   61:iload_2         
	//   35   62:invokespecial   #380 <Method void zzae(int)>
					return;
	//   36   65:return          
				} else
				{
					throw zzgf.zzfm();
	//   37   66:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   38   69:athrow          
				}
			do
			{
				((zzfz) (list)).zzbg(zzcr());
	//   39   70:aload_1         
	//   40   71:aload_0         
	//   41   72:invokevirtual   #119 <Method int zzcr()>
	//   42   75:invokevirtual   #409 <Method void zzfz.zzbg(int)>
				if(zzcm())
	//*  43   78:aload_0         
	//*  44   79:invokespecial   #173 <Method boolean zzcm()>
	//*  45   82:ifeq            86
					return;
	//   46   85:return          
				i = pos;
	//   47   86:aload_0         
	//   48   87:getfield        #38  <Field int pos>
	//   49   90:istore_2        
			} while(zzdd() == tag);
	//   50   91:aload_0         
	//   51   92:invokespecial   #176 <Method int zzdd()>
	//   52   95:aload_0         
	//   53   96:getfield        #164 <Field int tag>
	//   54   99:icmpeq          70
			pos = i;
	//   55  102:aload_0         
	//   56  103:iload_2         
	//   57  104:putfield        #38  <Field int pos>
			return;
	//   58  107:return          
		}
		int j = tag & 7;
	//   59  108:aload_0         
	//   60  109:getfield        #164 <Field int tag>
	//   61  112:bipush          7
	//   62  114:iand            
	//   63  115:istore_2        
		if(j != 0)
	//*  64  116:iload_2         
	//*  65  117:ifeq            172
			if(j == 2)
	//*  66  120:iload_2         
	//*  67  121:iconst_2        
	//*  68  122:icmpne          168
			{
				j = zzdd();
	//   69  125:aload_0         
	//   70  126:invokespecial   #176 <Method int zzdd()>
	//   71  129:istore_2        
				for(j = pos + j; pos < j;)
	//*  72  130:aload_0         
	//*  73  131:getfield        #38  <Field int pos>
	//*  74  134:iload_2         
	//*  75  135:iadd            
	//*  76  136:istore_2        
	//*  77  137:aload_0         
	//*  78  138:getfield        #38  <Field int pos>
	//*  79  141:iload_2         
	//*  80  142:icmpge          162
					list.add(((Object) (Integer.valueOf(zzdd()))));
	//   81  145:aload_1         
	//   82  146:aload_0         
	//   83  147:invokespecial   #176 <Method int zzdd()>
	//   84  150:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   85  153:invokeinterface #182 <Method boolean List.add(Object)>
	//   86  158:pop             

	//*  87  159:goto            137
				zzae(j);
	//   88  162:aload_0         
	//   89  163:iload_2         
	//   90  164:invokespecial   #380 <Method void zzae(int)>
				return;
	//   91  167:return          
			} else
			{
				throw zzgf.zzfm();
	//   92  168:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   93  171:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzcr()))));
	//   94  172:aload_1         
	//   95  173:aload_0         
	//   96  174:invokevirtual   #119 <Method int zzcr()>
	//   97  177:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   98  180:invokeinterface #182 <Method boolean List.add(Object)>
	//   99  185:pop             
			if(zzcm())
	//* 100  186:aload_0         
	//* 101  187:invokespecial   #173 <Method boolean zzcm()>
	//* 102  190:ifeq            194
				return;
	//  103  193:return          
			j = pos;
	//  104  194:aload_0         
	//  105  195:getfield        #38  <Field int pos>
	//  106  198:istore_2        
		} while(zzdd() == tag);
	//  107  199:aload_0         
	//  108  200:invokespecial   #176 <Method int zzdd()>
	//  109  203:aload_0         
	//  110  204:getfield        #164 <Field int tag>
	//  111  207:icmpeq          172
		pos = j;
	//  112  210:aload_0         
	//  113  211:iload_2         
	//  114  212:putfield        #38  <Field int pos>
	//  115  215:return          
	}

	public final void zzf(List list)
		throws IOException
	{
		if(list instanceof zzgt)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #372 <Class zzgt>
	//*   2    4:ifeq            119
		{
			list = ((List) ((zzgt)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #372 <Class zzgt>
	//    5   11:astore_1        
			switch(tag & 7)
	//*   6   12:aload_0         
	//*   7   13:getfield        #164 <Field int tag>
	//*   8   16:bipush          7
	//*   9   18:iand            
			{
	//*  10   19:tableswitch     1 2: default 40
	//	               1 81
	//	               2 44
			default:
				throw zzgf.zzfm();
	//   11   40:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   12   43:athrow          

			case 2: // '\002'
				int i = zzdd();
	//   13   44:aload_0         
	//   14   45:invokespecial   #176 <Method int zzdd()>
	//   15   48:istore_2        
				zzac(i);
	//   16   49:aload_0         
	//   17   50:iload_2         
	//   18   51:invokespecial   #309 <Method void zzac(int)>
				for(int i1 = pos; pos < i1 + i;)
	//*  19   54:aload_0         
	//*  20   55:getfield        #38  <Field int pos>
	//*  21   58:istore_3        
	//*  22   59:aload_0         
	//*  23   60:getfield        #38  <Field int pos>
	//*  24   63:iload_3         
	//*  25   64:iload_2         
	//*  26   65:iadd            
	//*  27   66:icmpge          80
					((zzgt) (list)).zzp(zzdj());
	//   28   69:aload_1         
	//   29   70:aload_0         
	//   30   71:invokespecial   #246 <Method long zzdj()>
	//   31   74:invokevirtual   #378 <Method void zzgt.zzp(long)>

	//*  32   77:goto            59
				return;
	//   33   80:return          

			case 1: // '\001'
				break;
			}
			int j;
			do
			{
				((zzgt) (list)).zzp(zzcs());
	//   34   81:aload_1         
	//   35   82:aload_0         
	//   36   83:invokevirtual   #131 <Method long zzcs()>
	//   37   86:invokevirtual   #378 <Method void zzgt.zzp(long)>
				if(zzcm())
	//*  38   89:aload_0         
	//*  39   90:invokespecial   #173 <Method boolean zzcm()>
	//*  40   93:ifeq            97
					return;
	//   41   96:return          
				j = pos;
	//   42   97:aload_0         
	//   43   98:getfield        #38  <Field int pos>
	//   44  101:istore_2        
			} while(zzdd() == tag);
	//   45  102:aload_0         
	//   46  103:invokespecial   #176 <Method int zzdd()>
	//   47  106:aload_0         
	//   48  107:getfield        #164 <Field int tag>
	//   49  110:icmpeq          81
			pos = j;
	//   50  113:aload_0         
	//   51  114:iload_2         
	//   52  115:putfield        #38  <Field int pos>
			return;
	//   53  118:return          
		}
		switch(tag & 7)
	//*  54  119:aload_0         
	//*  55  120:getfield        #164 <Field int tag>
	//*  56  123:bipush          7
	//*  57  125:iand            
		{
	//*  58  126:tableswitch     1 2: default 148
	//	               1 195
	//	               2 152
		default:
			throw zzgf.zzfm();
	//   59  148:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   60  151:athrow          

		case 2: // '\002'
			int k = zzdd();
	//   61  152:aload_0         
	//   62  153:invokespecial   #176 <Method int zzdd()>
	//   63  156:istore_2        
			zzac(k);
	//   64  157:aload_0         
	//   65  158:iload_2         
	//   66  159:invokespecial   #309 <Method void zzac(int)>
			for(int j1 = pos; pos < j1 + k;)
	//*  67  162:aload_0         
	//*  68  163:getfield        #38  <Field int pos>
	//*  69  166:istore_3        
	//*  70  167:aload_0         
	//*  71  168:getfield        #38  <Field int pos>
	//*  72  171:iload_3         
	//*  73  172:iload_2         
	//*  74  173:iadd            
	//*  75  174:icmpge          194
				list.add(((Object) (Long.valueOf(zzdj()))));
	//   76  177:aload_1         
	//   77  178:aload_0         
	//   78  179:invokespecial   #246 <Method long zzdj()>
	//   79  182:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   80  185:invokeinterface #182 <Method boolean List.add(Object)>
	//   81  190:pop             

	//*  82  191:goto            167
			return;
	//   83  194:return          

		case 1: // '\001'
			break;
		}
		int l;
		do
		{
			list.add(((Object) (Long.valueOf(zzcs()))));
	//   84  195:aload_1         
	//   85  196:aload_0         
	//   86  197:invokevirtual   #131 <Method long zzcs()>
	//   87  200:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   88  203:invokeinterface #182 <Method boolean List.add(Object)>
	//   89  208:pop             
			if(zzcm())
	//*  90  209:aload_0         
	//*  91  210:invokespecial   #173 <Method boolean zzcm()>
	//*  92  213:ifeq            217
				return;
	//   93  216:return          
			l = pos;
	//   94  217:aload_0         
	//   95  218:getfield        #38  <Field int pos>
	//   96  221:istore_2        
		} while(zzdd() == tag);
	//   97  222:aload_0         
	//   98  223:invokespecial   #176 <Method int zzdd()>
	//   99  226:aload_0         
	//  100  227:getfield        #164 <Field int tag>
	//  101  230:icmpeq          195
		pos = l;
	//  102  233:aload_0         
	//  103  234:iload_2         
	//  104  235:putfield        #38  <Field int pos>
	//  105  238:return          
	}

	public final void zzg(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #406 <Class zzfz>
	//*   2    4:ifeq            109
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #406 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #164 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 2)
	//*  11   20:iload_2         
	//*  12   21:iconst_2        
	//*  13   22:icmpeq          72
				if(i == 5)
	//*  14   25:iload_2         
	//*  15   26:iconst_5        
	//*  16   27:icmpne          68
				{
					do
					{
						((zzfz) (list)).zzbg(zzct());
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:invokevirtual   #134 <Method int zzct()>
	//   20   35:invokevirtual   #409 <Method void zzfz.zzbg(int)>
						if(zzcm())
	//*  21   38:aload_0         
	//*  22   39:invokespecial   #173 <Method boolean zzcm()>
	//*  23   42:ifeq            46
							return;
	//   24   45:return          
						i = pos;
	//   25   46:aload_0         
	//   26   47:getfield        #38  <Field int pos>
	//   27   50:istore_2        
					} while(zzdd() == tag);
	//   28   51:aload_0         
	//   29   52:invokespecial   #176 <Method int zzdd()>
	//   30   55:aload_0         
	//   31   56:getfield        #164 <Field int tag>
	//   32   59:icmpeq          30
					pos = i;
	//   33   62:aload_0         
	//   34   63:iload_2         
	//   35   64:putfield        #38  <Field int pos>
					return;
	//   36   67:return          
				} else
				{
					throw zzgf.zzfm();
	//   37   68:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   38   71:athrow          
				}
			i = zzdd();
	//   39   72:aload_0         
	//   40   73:invokespecial   #176 <Method int zzdd()>
	//   41   76:istore_2        
			zzad(i);
	//   42   77:aload_0         
	//   43   78:iload_2         
	//   44   79:invokespecial   #369 <Method void zzad(int)>
			for(int k = pos; pos < k + i;)
	//*  45   82:aload_0         
	//*  46   83:getfield        #38  <Field int pos>
	//*  47   86:istore_3        
	//*  48   87:aload_0         
	//*  49   88:getfield        #38  <Field int pos>
	//*  50   91:iload_3         
	//*  51   92:iload_2         
	//*  52   93:iadd            
	//*  53   94:icmpge          108
				((zzfz) (list)).zzbg(zzdi());
	//   54   97:aload_1         
	//   55   98:aload_0         
	//   56   99:invokespecial   #242 <Method int zzdi()>
	//   57  102:invokevirtual   #409 <Method void zzfz.zzbg(int)>

	//*  58  105:goto            87
			return;
	//   59  108:return          
		}
		int j = tag & 7;
	//   60  109:aload_0         
	//   61  110:getfield        #164 <Field int tag>
	//   62  113:bipush          7
	//   63  115:iand            
	//   64  116:istore_2        
		if(j != 2)
	//*  65  117:iload_2         
	//*  66  118:iconst_2        
	//*  67  119:icmpeq          175
			if(j == 5)
	//*  68  122:iload_2         
	//*  69  123:iconst_5        
	//*  70  124:icmpne          171
			{
				do
				{
					list.add(((Object) (Integer.valueOf(zzct()))));
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:invokevirtual   #134 <Method int zzct()>
	//   74  132:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   75  135:invokeinterface #182 <Method boolean List.add(Object)>
	//   76  140:pop             
					if(zzcm())
	//*  77  141:aload_0         
	//*  78  142:invokespecial   #173 <Method boolean zzcm()>
	//*  79  145:ifeq            149
						return;
	//   80  148:return          
					j = pos;
	//   81  149:aload_0         
	//   82  150:getfield        #38  <Field int pos>
	//   83  153:istore_2        
				} while(zzdd() == tag);
	//   84  154:aload_0         
	//   85  155:invokespecial   #176 <Method int zzdd()>
	//   86  158:aload_0         
	//   87  159:getfield        #164 <Field int tag>
	//   88  162:icmpeq          127
				pos = j;
	//   89  165:aload_0         
	//   90  166:iload_2         
	//   91  167:putfield        #38  <Field int pos>
				return;
	//   92  170:return          
			} else
			{
				throw zzgf.zzfm();
	//   93  171:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   94  174:athrow          
			}
		j = zzdd();
	//   95  175:aload_0         
	//   96  176:invokespecial   #176 <Method int zzdd()>
	//   97  179:istore_2        
		zzad(j);
	//   98  180:aload_0         
	//   99  181:iload_2         
	//  100  182:invokespecial   #369 <Method void zzad(int)>
		for(int l = pos; pos < l + j;)
	//* 101  185:aload_0         
	//* 102  186:getfield        #38  <Field int pos>
	//* 103  189:istore_3        
	//* 104  190:aload_0         
	//* 105  191:getfield        #38  <Field int pos>
	//* 106  194:iload_3         
	//* 107  195:iload_2         
	//* 108  196:iadd            
	//* 109  197:icmpge          217
			list.add(((Object) (Integer.valueOf(zzdi()))));
	//  110  200:aload_1         
	//  111  201:aload_0         
	//  112  202:invokespecial   #242 <Method int zzdi()>
	//  113  205:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//  114  208:invokeinterface #182 <Method boolean List.add(Object)>
	//  115  213:pop             

	//* 116  214:goto            190
	//  117  217:return          
	}

	public final void zzh(List list)
		throws IOException
	{
		if(list instanceof zzem)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #412 <Class zzem>
	//*   2    4:ifeq            119
		{
			list = ((List) ((zzem)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #412 <Class zzem>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #164 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            81
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          77
				{
					i = zzdd();
	//   16   29:aload_0         
	//   17   30:invokespecial   #176 <Method int zzdd()>
	//   18   33:istore_2        
					for(i = pos + i; pos < i;)
	//*  19   34:aload_0         
	//*  20   35:getfield        #38  <Field int pos>
	//*  21   38:iload_2         
	//*  22   39:iadd            
	//*  23   40:istore_2        
	//*  24   41:aload_0         
	//*  25   42:getfield        #38  <Field int pos>
	//*  26   45:iload_2         
	//*  27   46:icmpge          71
					{
						boolean flag;
						if(zzdd() != 0)
	//*  28   49:aload_0         
	//*  29   50:invokespecial   #176 <Method int zzdd()>
	//*  30   53:ifeq            61
							flag = true;
	//   31   56:iconst_1        
	//   32   57:istore_3        
						else
	//*  33   58:goto            63
							flag = false;
	//   34   61:iconst_0        
	//   35   62:istore_3        
						((zzem) (list)).addBoolean(flag);
	//   36   63:aload_1         
	//   37   64:iload_3         
	//   38   65:invokevirtual   #416 <Method void zzem.addBoolean(boolean)>
					}

	//*  39   68:goto            41
					zzae(i);
	//   40   71:aload_0         
	//   41   72:iload_2         
	//   42   73:invokespecial   #380 <Method void zzae(int)>
					return;
	//   43   76:return          
				} else
				{
					throw zzgf.zzfm();
	//   44   77:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   45   80:athrow          
				}
			do
			{
				((zzem) (list)).addBoolean(zzcu());
	//   46   81:aload_1         
	//   47   82:aload_0         
	//   48   83:invokevirtual   #154 <Method boolean zzcu()>
	//   49   86:invokevirtual   #416 <Method void zzem.addBoolean(boolean)>
				if(zzcm())
	//*  50   89:aload_0         
	//*  51   90:invokespecial   #173 <Method boolean zzcm()>
	//*  52   93:ifeq            97
					return;
	//   53   96:return          
				i = pos;
	//   54   97:aload_0         
	//   55   98:getfield        #38  <Field int pos>
	//   56  101:istore_2        
			} while(zzdd() == tag);
	//   57  102:aload_0         
	//   58  103:invokespecial   #176 <Method int zzdd()>
	//   59  106:aload_0         
	//   60  107:getfield        #164 <Field int tag>
	//   61  110:icmpeq          81
			pos = i;
	//   62  113:aload_0         
	//   63  114:iload_2         
	//   64  115:putfield        #38  <Field int pos>
			return;
	//   65  118:return          
		}
		int j = tag & 7;
	//   66  119:aload_0         
	//   67  120:getfield        #164 <Field int tag>
	//   68  123:bipush          7
	//   69  125:iand            
	//   70  126:istore_2        
		if(j != 0)
	//*  71  127:iload_2         
	//*  72  128:ifeq            194
			if(j == 2)
	//*  73  131:iload_2         
	//*  74  132:iconst_2        
	//*  75  133:icmpne          190
			{
				j = zzdd();
	//   76  136:aload_0         
	//   77  137:invokespecial   #176 <Method int zzdd()>
	//   78  140:istore_2        
				for(j = pos + j; pos < j;)
	//*  79  141:aload_0         
	//*  80  142:getfield        #38  <Field int pos>
	//*  81  145:iload_2         
	//*  82  146:iadd            
	//*  83  147:istore_2        
	//*  84  148:aload_0         
	//*  85  149:getfield        #38  <Field int pos>
	//*  86  152:iload_2         
	//*  87  153:icmpge          184
				{
					boolean flag1;
					if(zzdd() != 0)
	//*  88  156:aload_0         
	//*  89  157:invokespecial   #176 <Method int zzdd()>
	//*  90  160:ifeq            168
						flag1 = true;
	//   91  163:iconst_1        
	//   92  164:istore_3        
					else
	//*  93  165:goto            170
						flag1 = false;
	//   94  168:iconst_0        
	//   95  169:istore_3        
					list.add(((Object) (Boolean.valueOf(flag1))));
	//   96  170:aload_1         
	//   97  171:iload_3         
	//   98  172:invokestatic    #159 <Method Boolean Boolean.valueOf(boolean)>
	//   99  175:invokeinterface #182 <Method boolean List.add(Object)>
	//  100  180:pop             
				}

	//* 101  181:goto            148
				zzae(j);
	//  102  184:aload_0         
	//  103  185:iload_2         
	//  104  186:invokespecial   #380 <Method void zzae(int)>
				return;
	//  105  189:return          
			} else
			{
				throw zzgf.zzfm();
	//  106  190:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//  107  193:athrow          
			}
		do
		{
			list.add(((Object) (Boolean.valueOf(zzcu()))));
	//  108  194:aload_1         
	//  109  195:aload_0         
	//  110  196:invokevirtual   #154 <Method boolean zzcu()>
	//  111  199:invokestatic    #159 <Method Boolean Boolean.valueOf(boolean)>
	//  112  202:invokeinterface #182 <Method boolean List.add(Object)>
	//  113  207:pop             
			if(zzcm())
	//* 114  208:aload_0         
	//* 115  209:invokespecial   #173 <Method boolean zzcm()>
	//* 116  212:ifeq            216
				return;
	//  117  215:return          
			j = pos;
	//  118  216:aload_0         
	//  119  217:getfield        #38  <Field int pos>
	//  120  220:istore_2        
		} while(zzdd() == tag);
	//  121  221:aload_0         
	//  122  222:invokespecial   #176 <Method int zzdd()>
	//  123  225:aload_0         
	//  124  226:getfield        #164 <Field int tag>
	//  125  229:icmpeq          194
		pos = j;
	//  126  232:aload_0         
	//  127  233:iload_2         
	//  128  234:putfield        #38  <Field int pos>
	//  129  237:return          
	}

	public final void zzi(List list)
		throws IOException
	{
		zza(list, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #291 <Method void zza(List, boolean)>
	//    4    6:return          
	}

	public final void zzj(List list)
		throws IOException
	{
		if((tag & 7) == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field int tag>
	//*   2    4:bipush          7
	//*   3    6:iand            
	//*   4    7:iconst_2        
	//*   5    8:icmpne          52
		{
			int i;
			do
			{
				list.add(((Object) (zzcw())));
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #150 <Method zzeo zzcw()>
	//    9   16:invokeinterface #182 <Method boolean List.add(Object)>
	//   10   21:pop             
				if(zzcm())
	//*  11   22:aload_0         
	//*  12   23:invokespecial   #173 <Method boolean zzcm()>
	//*  13   26:ifeq            30
					return;
	//   14   29:return          
				i = pos;
	//   15   30:aload_0         
	//   16   31:getfield        #38  <Field int pos>
	//   17   34:istore_2        
			} while(zzdd() == tag);
	//   18   35:aload_0         
	//   19   36:invokespecial   #176 <Method int zzdd()>
	//   20   39:aload_0         
	//   21   40:getfield        #164 <Field int tag>
	//   22   43:icmpeq          11
			pos = i;
	//   23   46:aload_0         
	//   24   47:iload_2         
	//   25   48:putfield        #38  <Field int pos>
			return;
	//   26   51:return          
		} else
		{
			throw zzgf.zzfm();
	//   27   52:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   28   55:athrow          
		}
	}

	public final void zzk(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #406 <Class zzfz>
	//*   2    4:ifeq            103
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #406 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #164 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            65
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          61
				{
					i = zzdd();
	//   16   29:aload_0         
	//   17   30:invokespecial   #176 <Method int zzdd()>
	//   18   33:istore_2        
					for(int k = pos; pos < k + i;)
	//*  19   34:aload_0         
	//*  20   35:getfield        #38  <Field int pos>
	//*  21   38:istore_3        
	//*  22   39:aload_0         
	//*  23   40:getfield        #38  <Field int pos>
	//*  24   43:iload_3         
	//*  25   44:iload_2         
	//*  26   45:iadd            
	//*  27   46:icmpge          60
						((zzfz) (list)).zzbg(zzdd());
	//   28   49:aload_1         
	//   29   50:aload_0         
	//   30   51:invokespecial   #176 <Method int zzdd()>
	//   31   54:invokevirtual   #409 <Method void zzfz.zzbg(int)>

	//*  32   57:goto            39
					return;
	//   33   60:return          
				} else
				{
					throw zzgf.zzfm();
	//   34   61:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   35   64:athrow          
				}
			do
			{
				((zzfz) (list)).zzbg(zzcx());
	//   36   65:aload_1         
	//   37   66:aload_0         
	//   38   67:invokevirtual   #89  <Method int zzcx()>
	//   39   70:invokevirtual   #409 <Method void zzfz.zzbg(int)>
				if(zzcm())
	//*  40   73:aload_0         
	//*  41   74:invokespecial   #173 <Method boolean zzcm()>
	//*  42   77:ifeq            81
					return;
	//   43   80:return          
				i = pos;
	//   44   81:aload_0         
	//   45   82:getfield        #38  <Field int pos>
	//   46   85:istore_2        
			} while(zzdd() == tag);
	//   47   86:aload_0         
	//   48   87:invokespecial   #176 <Method int zzdd()>
	//   49   90:aload_0         
	//   50   91:getfield        #164 <Field int tag>
	//   51   94:icmpeq          65
			pos = i;
	//   52   97:aload_0         
	//   53   98:iload_2         
	//   54   99:putfield        #38  <Field int pos>
			return;
	//   55  102:return          
		}
		int j = tag & 7;
	//   56  103:aload_0         
	//   57  104:getfield        #164 <Field int tag>
	//   58  107:bipush          7
	//   59  109:iand            
	//   60  110:istore_2        
		if(j != 0)
	//*  61  111:iload_2         
	//*  62  112:ifeq            162
			if(j == 2)
	//*  63  115:iload_2         
	//*  64  116:iconst_2        
	//*  65  117:icmpne          158
			{
				j = zzdd();
	//   66  120:aload_0         
	//   67  121:invokespecial   #176 <Method int zzdd()>
	//   68  124:istore_2        
				for(int l = pos; pos < l + j;)
	//*  69  125:aload_0         
	//*  70  126:getfield        #38  <Field int pos>
	//*  71  129:istore_3        
	//*  72  130:aload_0         
	//*  73  131:getfield        #38  <Field int pos>
	//*  74  134:iload_3         
	//*  75  135:iload_2         
	//*  76  136:iadd            
	//*  77  137:icmpge          157
					list.add(((Object) (Integer.valueOf(zzdd()))));
	//   78  140:aload_1         
	//   79  141:aload_0         
	//   80  142:invokespecial   #176 <Method int zzdd()>
	//   81  145:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   82  148:invokeinterface #182 <Method boolean List.add(Object)>
	//   83  153:pop             

	//*  84  154:goto            130
				return;
	//   85  157:return          
			} else
			{
				throw zzgf.zzfm();
	//   86  158:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   87  161:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzcx()))));
	//   88  162:aload_1         
	//   89  163:aload_0         
	//   90  164:invokevirtual   #89  <Method int zzcx()>
	//   91  167:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   92  170:invokeinterface #182 <Method boolean List.add(Object)>
	//   93  175:pop             
			if(zzcm())
	//*  94  176:aload_0         
	//*  95  177:invokespecial   #173 <Method boolean zzcm()>
	//*  96  180:ifeq            184
				return;
	//   97  183:return          
			j = pos;
	//   98  184:aload_0         
	//   99  185:getfield        #38  <Field int pos>
	//  100  188:istore_2        
		} while(zzdd() == tag);
	//  101  189:aload_0         
	//  102  190:invokespecial   #176 <Method int zzdd()>
	//  103  193:aload_0         
	//  104  194:getfield        #164 <Field int tag>
	//  105  197:icmpeq          162
		pos = j;
	//  106  200:aload_0         
	//  107  201:iload_2         
	//  108  202:putfield        #38  <Field int pos>
	//  109  205:return          
	}

	public final void zzl(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #406 <Class zzfz>
	//*   2    4:ifeq            103
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #406 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #164 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            65
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          61
				{
					i = zzdd();
	//   16   29:aload_0         
	//   17   30:invokespecial   #176 <Method int zzdd()>
	//   18   33:istore_2        
					for(int k = pos; pos < k + i;)
	//*  19   34:aload_0         
	//*  20   35:getfield        #38  <Field int pos>
	//*  21   38:istore_3        
	//*  22   39:aload_0         
	//*  23   40:getfield        #38  <Field int pos>
	//*  24   43:iload_3         
	//*  25   44:iload_2         
	//*  26   45:iadd            
	//*  27   46:icmpge          60
						((zzfz) (list)).zzbg(zzdd());
	//   28   49:aload_1         
	//   29   50:aload_0         
	//   30   51:invokespecial   #176 <Method int zzdd()>
	//   31   54:invokevirtual   #409 <Method void zzfz.zzbg(int)>

	//*  32   57:goto            39
					return;
	//   33   60:return          
				} else
				{
					throw zzgf.zzfm();
	//   34   61:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   35   64:athrow          
				}
			do
			{
				((zzfz) (list)).zzbg(zzcy());
	//   36   65:aload_1         
	//   37   66:aload_0         
	//   38   67:invokevirtual   #137 <Method int zzcy()>
	//   39   70:invokevirtual   #409 <Method void zzfz.zzbg(int)>
				if(zzcm())
	//*  40   73:aload_0         
	//*  41   74:invokespecial   #173 <Method boolean zzcm()>
	//*  42   77:ifeq            81
					return;
	//   43   80:return          
				i = pos;
	//   44   81:aload_0         
	//   45   82:getfield        #38  <Field int pos>
	//   46   85:istore_2        
			} while(zzdd() == tag);
	//   47   86:aload_0         
	//   48   87:invokespecial   #176 <Method int zzdd()>
	//   49   90:aload_0         
	//   50   91:getfield        #164 <Field int tag>
	//   51   94:icmpeq          65
			pos = i;
	//   52   97:aload_0         
	//   53   98:iload_2         
	//   54   99:putfield        #38  <Field int pos>
			return;
	//   55  102:return          
		}
		int j = tag & 7;
	//   56  103:aload_0         
	//   57  104:getfield        #164 <Field int tag>
	//   58  107:bipush          7
	//   59  109:iand            
	//   60  110:istore_2        
		if(j != 0)
	//*  61  111:iload_2         
	//*  62  112:ifeq            162
			if(j == 2)
	//*  63  115:iload_2         
	//*  64  116:iconst_2        
	//*  65  117:icmpne          158
			{
				j = zzdd();
	//   66  120:aload_0         
	//   67  121:invokespecial   #176 <Method int zzdd()>
	//   68  124:istore_2        
				for(int l = pos; pos < l + j;)
	//*  69  125:aload_0         
	//*  70  126:getfield        #38  <Field int pos>
	//*  71  129:istore_3        
	//*  72  130:aload_0         
	//*  73  131:getfield        #38  <Field int pos>
	//*  74  134:iload_3         
	//*  75  135:iload_2         
	//*  76  136:iadd            
	//*  77  137:icmpge          157
					list.add(((Object) (Integer.valueOf(zzdd()))));
	//   78  140:aload_1         
	//   79  141:aload_0         
	//   80  142:invokespecial   #176 <Method int zzdd()>
	//   81  145:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   82  148:invokeinterface #182 <Method boolean List.add(Object)>
	//   83  153:pop             

	//*  84  154:goto            130
				return;
	//   85  157:return          
			} else
			{
				throw zzgf.zzfm();
	//   86  158:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   87  161:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzcy()))));
	//   88  162:aload_1         
	//   89  163:aload_0         
	//   90  164:invokevirtual   #137 <Method int zzcy()>
	//   91  167:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   92  170:invokeinterface #182 <Method boolean List.add(Object)>
	//   93  175:pop             
			if(zzcm())
	//*  94  176:aload_0         
	//*  95  177:invokespecial   #173 <Method boolean zzcm()>
	//*  96  180:ifeq            184
				return;
	//   97  183:return          
			j = pos;
	//   98  184:aload_0         
	//   99  185:getfield        #38  <Field int pos>
	//  100  188:istore_2        
		} while(zzdd() == tag);
	//  101  189:aload_0         
	//  102  190:invokespecial   #176 <Method int zzdd()>
	//  103  193:aload_0         
	//  104  194:getfield        #164 <Field int tag>
	//  105  197:icmpeq          162
		pos = j;
	//  106  200:aload_0         
	//  107  201:iload_2         
	//  108  202:putfield        #38  <Field int pos>
	//  109  205:return          
	}

	public final void zzm(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #406 <Class zzfz>
	//*   2    4:ifeq            109
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #406 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #164 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 2)
	//*  11   20:iload_2         
	//*  12   21:iconst_2        
	//*  13   22:icmpeq          72
				if(i == 5)
	//*  14   25:iload_2         
	//*  15   26:iconst_5        
	//*  16   27:icmpne          68
				{
					do
					{
						((zzfz) (list)).zzbg(zzcz());
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:invokevirtual   #110 <Method int zzcz()>
	//   20   35:invokevirtual   #409 <Method void zzfz.zzbg(int)>
						if(zzcm())
	//*  21   38:aload_0         
	//*  22   39:invokespecial   #173 <Method boolean zzcm()>
	//*  23   42:ifeq            46
							return;
	//   24   45:return          
						i = pos;
	//   25   46:aload_0         
	//   26   47:getfield        #38  <Field int pos>
	//   27   50:istore_2        
					} while(zzdd() == tag);
	//   28   51:aload_0         
	//   29   52:invokespecial   #176 <Method int zzdd()>
	//   30   55:aload_0         
	//   31   56:getfield        #164 <Field int tag>
	//   32   59:icmpeq          30
					pos = i;
	//   33   62:aload_0         
	//   34   63:iload_2         
	//   35   64:putfield        #38  <Field int pos>
					return;
	//   36   67:return          
				} else
				{
					throw zzgf.zzfm();
	//   37   68:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   38   71:athrow          
				}
			i = zzdd();
	//   39   72:aload_0         
	//   40   73:invokespecial   #176 <Method int zzdd()>
	//   41   76:istore_2        
			zzad(i);
	//   42   77:aload_0         
	//   43   78:iload_2         
	//   44   79:invokespecial   #369 <Method void zzad(int)>
			for(int k = pos; pos < k + i;)
	//*  45   82:aload_0         
	//*  46   83:getfield        #38  <Field int pos>
	//*  47   86:istore_3        
	//*  48   87:aload_0         
	//*  49   88:getfield        #38  <Field int pos>
	//*  50   91:iload_3         
	//*  51   92:iload_2         
	//*  52   93:iadd            
	//*  53   94:icmpge          108
				((zzfz) (list)).zzbg(zzdi());
	//   54   97:aload_1         
	//   55   98:aload_0         
	//   56   99:invokespecial   #242 <Method int zzdi()>
	//   57  102:invokevirtual   #409 <Method void zzfz.zzbg(int)>

	//*  58  105:goto            87
			return;
	//   59  108:return          
		}
		int j = tag & 7;
	//   60  109:aload_0         
	//   61  110:getfield        #164 <Field int tag>
	//   62  113:bipush          7
	//   63  115:iand            
	//   64  116:istore_2        
		if(j != 2)
	//*  65  117:iload_2         
	//*  66  118:iconst_2        
	//*  67  119:icmpeq          175
			if(j == 5)
	//*  68  122:iload_2         
	//*  69  123:iconst_5        
	//*  70  124:icmpne          171
			{
				do
				{
					list.add(((Object) (Integer.valueOf(zzcz()))));
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:invokevirtual   #110 <Method int zzcz()>
	//   74  132:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   75  135:invokeinterface #182 <Method boolean List.add(Object)>
	//   76  140:pop             
					if(zzcm())
	//*  77  141:aload_0         
	//*  78  142:invokespecial   #173 <Method boolean zzcm()>
	//*  79  145:ifeq            149
						return;
	//   80  148:return          
					j = pos;
	//   81  149:aload_0         
	//   82  150:getfield        #38  <Field int pos>
	//   83  153:istore_2        
				} while(zzdd() == tag);
	//   84  154:aload_0         
	//   85  155:invokespecial   #176 <Method int zzdd()>
	//   86  158:aload_0         
	//   87  159:getfield        #164 <Field int tag>
	//   88  162:icmpeq          127
				pos = j;
	//   89  165:aload_0         
	//   90  166:iload_2         
	//   91  167:putfield        #38  <Field int pos>
				return;
	//   92  170:return          
			} else
			{
				throw zzgf.zzfm();
	//   93  171:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   94  174:athrow          
			}
		j = zzdd();
	//   95  175:aload_0         
	//   96  176:invokespecial   #176 <Method int zzdd()>
	//   97  179:istore_2        
		zzad(j);
	//   98  180:aload_0         
	//   99  181:iload_2         
	//  100  182:invokespecial   #369 <Method void zzad(int)>
		for(int l = pos; pos < l + j;)
	//* 101  185:aload_0         
	//* 102  186:getfield        #38  <Field int pos>
	//* 103  189:istore_3        
	//* 104  190:aload_0         
	//* 105  191:getfield        #38  <Field int pos>
	//* 106  194:iload_3         
	//* 107  195:iload_2         
	//* 108  196:iadd            
	//* 109  197:icmpge          217
			list.add(((Object) (Integer.valueOf(zzdi()))));
	//  110  200:aload_1         
	//  111  201:aload_0         
	//  112  202:invokespecial   #242 <Method int zzdi()>
	//  113  205:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//  114  208:invokeinterface #182 <Method boolean List.add(Object)>
	//  115  213:pop             

	//* 116  214:goto            190
	//  117  217:return          
	}

	public final void zzn(List list)
		throws IOException
	{
		if(list instanceof zzgt)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #372 <Class zzgt>
	//*   2    4:ifeq            119
		{
			list = ((List) ((zzgt)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #372 <Class zzgt>
	//    5   11:astore_1        
			switch(tag & 7)
	//*   6   12:aload_0         
	//*   7   13:getfield        #164 <Field int tag>
	//*   8   16:bipush          7
	//*   9   18:iand            
			{
	//*  10   19:tableswitch     1 2: default 40
	//	               1 81
	//	               2 44
			default:
				throw zzgf.zzfm();
	//   11   40:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   12   43:athrow          

			case 2: // '\002'
				int i = zzdd();
	//   13   44:aload_0         
	//   14   45:invokespecial   #176 <Method int zzdd()>
	//   15   48:istore_2        
				zzac(i);
	//   16   49:aload_0         
	//   17   50:iload_2         
	//   18   51:invokespecial   #309 <Method void zzac(int)>
				for(int i1 = pos; pos < i1 + i;)
	//*  19   54:aload_0         
	//*  20   55:getfield        #38  <Field int pos>
	//*  21   58:istore_3        
	//*  22   59:aload_0         
	//*  23   60:getfield        #38  <Field int pos>
	//*  24   63:iload_3         
	//*  25   64:iload_2         
	//*  26   65:iadd            
	//*  27   66:icmpge          80
					((zzgt) (list)).zzp(zzdj());
	//   28   69:aload_1         
	//   29   70:aload_0         
	//   30   71:invokespecial   #246 <Method long zzdj()>
	//   31   74:invokevirtual   #378 <Method void zzgt.zzp(long)>

	//*  32   77:goto            59
				return;
	//   33   80:return          

			case 1: // '\001'
				break;
			}
			int j;
			do
			{
				((zzgt) (list)).zzp(zzda());
	//   34   81:aload_1         
	//   35   82:aload_0         
	//   36   83:invokevirtual   #107 <Method long zzda()>
	//   37   86:invokevirtual   #378 <Method void zzgt.zzp(long)>
				if(zzcm())
	//*  38   89:aload_0         
	//*  39   90:invokespecial   #173 <Method boolean zzcm()>
	//*  40   93:ifeq            97
					return;
	//   41   96:return          
				j = pos;
	//   42   97:aload_0         
	//   43   98:getfield        #38  <Field int pos>
	//   44  101:istore_2        
			} while(zzdd() == tag);
	//   45  102:aload_0         
	//   46  103:invokespecial   #176 <Method int zzdd()>
	//   47  106:aload_0         
	//   48  107:getfield        #164 <Field int tag>
	//   49  110:icmpeq          81
			pos = j;
	//   50  113:aload_0         
	//   51  114:iload_2         
	//   52  115:putfield        #38  <Field int pos>
			return;
	//   53  118:return          
		}
		switch(tag & 7)
	//*  54  119:aload_0         
	//*  55  120:getfield        #164 <Field int tag>
	//*  56  123:bipush          7
	//*  57  125:iand            
		{
	//*  58  126:tableswitch     1 2: default 148
	//	               1 195
	//	               2 152
		default:
			throw zzgf.zzfm();
	//   59  148:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   60  151:athrow          

		case 2: // '\002'
			int k = zzdd();
	//   61  152:aload_0         
	//   62  153:invokespecial   #176 <Method int zzdd()>
	//   63  156:istore_2        
			zzac(k);
	//   64  157:aload_0         
	//   65  158:iload_2         
	//   66  159:invokespecial   #309 <Method void zzac(int)>
			for(int j1 = pos; pos < j1 + k;)
	//*  67  162:aload_0         
	//*  68  163:getfield        #38  <Field int pos>
	//*  69  166:istore_3        
	//*  70  167:aload_0         
	//*  71  168:getfield        #38  <Field int pos>
	//*  72  171:iload_3         
	//*  73  172:iload_2         
	//*  74  173:iadd            
	//*  75  174:icmpge          194
				list.add(((Object) (Long.valueOf(zzdj()))));
	//   76  177:aload_1         
	//   77  178:aload_0         
	//   78  179:invokespecial   #246 <Method long zzdj()>
	//   79  182:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   80  185:invokeinterface #182 <Method boolean List.add(Object)>
	//   81  190:pop             

	//*  82  191:goto            167
			return;
	//   83  194:return          

		case 1: // '\001'
			break;
		}
		int l;
		do
		{
			list.add(((Object) (Long.valueOf(zzda()))));
	//   84  195:aload_1         
	//   85  196:aload_0         
	//   86  197:invokevirtual   #107 <Method long zzda()>
	//   87  200:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   88  203:invokeinterface #182 <Method boolean List.add(Object)>
	//   89  208:pop             
			if(zzcm())
	//*  90  209:aload_0         
	//*  91  210:invokespecial   #173 <Method boolean zzcm()>
	//*  92  213:ifeq            217
				return;
	//   93  216:return          
			l = pos;
	//   94  217:aload_0         
	//   95  218:getfield        #38  <Field int pos>
	//   96  221:istore_2        
		} while(zzdd() == tag);
	//   97  222:aload_0         
	//   98  223:invokespecial   #176 <Method int zzdd()>
	//   99  226:aload_0         
	//  100  227:getfield        #164 <Field int tag>
	//  101  230:icmpeq          195
		pos = l;
	//  102  233:aload_0         
	//  103  234:iload_2         
	//  104  235:putfield        #38  <Field int pos>
	//  105  238:return          
	}

	public final void zzo(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #406 <Class zzfz>
	//*   2    4:ifeq            106
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #406 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #164 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            68
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          64
				{
					i = zzdd();
	//   16   29:aload_0         
	//   17   30:invokespecial   #176 <Method int zzdd()>
	//   18   33:istore_2        
					for(int k = pos; pos < k + i;)
	//*  19   34:aload_0         
	//*  20   35:getfield        #38  <Field int pos>
	//*  21   38:istore_3        
	//*  22   39:aload_0         
	//*  23   40:getfield        #38  <Field int pos>
	//*  24   43:iload_3         
	//*  25   44:iload_2         
	//*  26   45:iadd            
	//*  27   46:icmpge          63
						((zzfz) (list)).zzbg(zzez.zzaq(zzdd()));
	//   28   49:aload_1         
	//   29   50:aload_0         
	//   30   51:invokespecial   #176 <Method int zzdd()>
	//   31   54:invokestatic    #401 <Method int zzez.zzaq(int)>
	//   32   57:invokevirtual   #409 <Method void zzfz.zzbg(int)>

	//*  33   60:goto            39
					return;
	//   34   63:return          
				} else
				{
					throw zzgf.zzfm();
	//   35   64:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   36   67:athrow          
				}
			do
			{
				((zzfz) (list)).zzbg(zzdb());
	//   37   68:aload_1         
	//   38   69:aload_0         
	//   39   70:invokevirtual   #104 <Method int zzdb()>
	//   40   73:invokevirtual   #409 <Method void zzfz.zzbg(int)>
				if(zzcm())
	//*  41   76:aload_0         
	//*  42   77:invokespecial   #173 <Method boolean zzcm()>
	//*  43   80:ifeq            84
					return;
	//   44   83:return          
				i = pos;
	//   45   84:aload_0         
	//   46   85:getfield        #38  <Field int pos>
	//   47   88:istore_2        
			} while(zzdd() == tag);
	//   48   89:aload_0         
	//   49   90:invokespecial   #176 <Method int zzdd()>
	//   50   93:aload_0         
	//   51   94:getfield        #164 <Field int tag>
	//   52   97:icmpeq          68
			pos = i;
	//   53  100:aload_0         
	//   54  101:iload_2         
	//   55  102:putfield        #38  <Field int pos>
			return;
	//   56  105:return          
		}
		int j = tag & 7;
	//   57  106:aload_0         
	//   58  107:getfield        #164 <Field int tag>
	//   59  110:bipush          7
	//   60  112:iand            
	//   61  113:istore_2        
		if(j != 0)
	//*  62  114:iload_2         
	//*  63  115:ifeq            168
			if(j == 2)
	//*  64  118:iload_2         
	//*  65  119:iconst_2        
	//*  66  120:icmpne          164
			{
				j = zzdd();
	//   67  123:aload_0         
	//   68  124:invokespecial   #176 <Method int zzdd()>
	//   69  127:istore_2        
				for(int l = pos; pos < l + j;)
	//*  70  128:aload_0         
	//*  71  129:getfield        #38  <Field int pos>
	//*  72  132:istore_3        
	//*  73  133:aload_0         
	//*  74  134:getfield        #38  <Field int pos>
	//*  75  137:iload_3         
	//*  76  138:iload_2         
	//*  77  139:iadd            
	//*  78  140:icmpge          163
					list.add(((Object) (Integer.valueOf(zzez.zzaq(zzdd())))));
	//   79  143:aload_1         
	//   80  144:aload_0         
	//   81  145:invokespecial   #176 <Method int zzdd()>
	//   82  148:invokestatic    #401 <Method int zzez.zzaq(int)>
	//   83  151:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   84  154:invokeinterface #182 <Method boolean List.add(Object)>
	//   85  159:pop             

	//*  86  160:goto            133
				return;
	//   87  163:return          
			} else
			{
				throw zzgf.zzfm();
	//   88  164:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   89  167:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzdb()))));
	//   90  168:aload_1         
	//   91  169:aload_0         
	//   92  170:invokevirtual   #104 <Method int zzdb()>
	//   93  173:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   94  176:invokeinterface #182 <Method boolean List.add(Object)>
	//   95  181:pop             
			if(zzcm())
	//*  96  182:aload_0         
	//*  97  183:invokespecial   #173 <Method boolean zzcm()>
	//*  98  186:ifeq            190
				return;
	//   99  189:return          
			j = pos;
	//  100  190:aload_0         
	//  101  191:getfield        #38  <Field int pos>
	//  102  194:istore_2        
		} while(zzdd() == tag);
	//  103  195:aload_0         
	//  104  196:invokespecial   #176 <Method int zzdd()>
	//  105  199:aload_0         
	//  106  200:getfield        #164 <Field int tag>
	//  107  203:icmpeq          168
		pos = j;
	//  108  206:aload_0         
	//  109  207:iload_2         
	//  110  208:putfield        #38  <Field int pos>
	//  111  211:return          
	}

	public final void zzp(List list)
		throws IOException
	{
		if(list instanceof zzgt)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #372 <Class zzgt>
	//*   2    4:ifeq            106
		{
			list = ((List) ((zzgt)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #372 <Class zzgt>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #164 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            68
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          64
				{
					i = zzdd();
	//   16   29:aload_0         
	//   17   30:invokespecial   #176 <Method int zzdd()>
	//   18   33:istore_2        
					for(int k = pos; pos < k + i;)
	//*  19   34:aload_0         
	//*  20   35:getfield        #38  <Field int pos>
	//*  21   38:istore_3        
	//*  22   39:aload_0         
	//*  23   40:getfield        #38  <Field int pos>
	//*  24   43:iload_3         
	//*  25   44:iload_2         
	//*  26   45:iadd            
	//*  27   46:icmpge          63
						((zzgt) (list)).zzp(zzez.zzd(zzde()));
	//   28   49:aload_1         
	//   29   50:aload_0         
	//   30   51:invokespecial   #374 <Method long zzde()>
	//   31   54:invokestatic    #404 <Method long zzez.zzd(long)>
	//   32   57:invokevirtual   #378 <Method void zzgt.zzp(long)>

	//*  33   60:goto            39
					return;
	//   34   63:return          
				} else
				{
					throw zzgf.zzfm();
	//   35   64:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   36   67:athrow          
				}
			do
			{
				((zzgt) (list)).zzp(zzdc());
	//   37   68:aload_1         
	//   38   69:aload_0         
	//   39   70:invokevirtual   #101 <Method long zzdc()>
	//   40   73:invokevirtual   #378 <Method void zzgt.zzp(long)>
				if(zzcm())
	//*  41   76:aload_0         
	//*  42   77:invokespecial   #173 <Method boolean zzcm()>
	//*  43   80:ifeq            84
					return;
	//   44   83:return          
				i = pos;
	//   45   84:aload_0         
	//   46   85:getfield        #38  <Field int pos>
	//   47   88:istore_2        
			} while(zzdd() == tag);
	//   48   89:aload_0         
	//   49   90:invokespecial   #176 <Method int zzdd()>
	//   50   93:aload_0         
	//   51   94:getfield        #164 <Field int tag>
	//   52   97:icmpeq          68
			pos = i;
	//   53  100:aload_0         
	//   54  101:iload_2         
	//   55  102:putfield        #38  <Field int pos>
			return;
	//   56  105:return          
		}
		int j = tag & 7;
	//   57  106:aload_0         
	//   58  107:getfield        #164 <Field int tag>
	//   59  110:bipush          7
	//   60  112:iand            
	//   61  113:istore_2        
		if(j != 0)
	//*  62  114:iload_2         
	//*  63  115:ifeq            168
			if(j == 2)
	//*  64  118:iload_2         
	//*  65  119:iconst_2        
	//*  66  120:icmpne          164
			{
				j = zzdd();
	//   67  123:aload_0         
	//   68  124:invokespecial   #176 <Method int zzdd()>
	//   69  127:istore_2        
				for(int l = pos; pos < l + j;)
	//*  70  128:aload_0         
	//*  71  129:getfield        #38  <Field int pos>
	//*  72  132:istore_3        
	//*  73  133:aload_0         
	//*  74  134:getfield        #38  <Field int pos>
	//*  75  137:iload_3         
	//*  76  138:iload_2         
	//*  77  139:iadd            
	//*  78  140:icmpge          163
					list.add(((Object) (Long.valueOf(zzez.zzd(zzde())))));
	//   79  143:aload_1         
	//   80  144:aload_0         
	//   81  145:invokespecial   #374 <Method long zzde()>
	//   82  148:invokestatic    #404 <Method long zzez.zzd(long)>
	//   83  151:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   84  154:invokeinterface #182 <Method boolean List.add(Object)>
	//   85  159:pop             

	//*  86  160:goto            133
				return;
	//   87  163:return          
			} else
			{
				throw zzgf.zzfm();
	//   88  164:invokestatic    #186 <Method zzgg zzgf.zzfm()>
	//   89  167:athrow          
			}
		do
		{
			list.add(((Object) (Long.valueOf(zzdc()))));
	//   90  168:aload_1         
	//   91  169:aload_0         
	//   92  170:invokevirtual   #101 <Method long zzdc()>
	//   93  173:invokestatic    #86  <Method Long Long.valueOf(long)>
	//   94  176:invokeinterface #182 <Method boolean List.add(Object)>
	//   95  181:pop             
			if(zzcm())
	//*  96  182:aload_0         
	//*  97  183:invokespecial   #173 <Method boolean zzcm()>
	//*  98  186:ifeq            190
				return;
	//   99  189:return          
			j = pos;
	//  100  190:aload_0         
	//  101  191:getfield        #38  <Field int pos>
	//  102  194:istore_2        
		} while(zzdd() == tag);
	//  103  195:aload_0         
	//  104  196:invokespecial   #176 <Method int zzdd()>
	//  105  199:aload_0         
	//  106  200:getfield        #164 <Field int tag>
	//  107  203:icmpeq          168
		pos = j;
	//  108  206:aload_0         
	//  109  207:iload_2         
	//  110  208:putfield        #38  <Field int pos>
	//  111  211:return          
	}

	private final byte buffer[];
	private int limit;
	private int pos;
	private int tag;
	private final boolean zzrs = true;
	private final int zzrt;
	private int zzru;
}
