// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzhv, zzga, zzez, zzfd, 
//			zzjd, zzgo, zzgf, zzhw, 
//			zzhs, zzfh, zzgg, zzgy, 
//			zzfv, zzgt, zzfz, zzem, 
//			zzfk, zzeo

final class zzfc
	implements zzhv
{

	private zzfc(zzez zzez1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzsq = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int zzsq>
		zzsp = (zzez)zzga.zza(((Object) (zzez1)), "input");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #21  <String "input">
	//    8   13:invokestatic    #27  <Method Object zzga.zza(Object, String)>
	//    9   16:checkcast       #29  <Class zzez>
	//   10   19:putfield        #31  <Field zzez zzsp>
		zzsp.zzsi = this;
	//   11   22:aload_0         
	//   12   23:getfield        #31  <Field zzez zzsp>
	//   13   26:aload_0         
	//   14   27:putfield        #35  <Field zzfc zzez.zzsi>
	//   15   30:return          
	}

	public static zzfc zza(zzez zzez1)
	{
		if(zzez1.zzsi != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field zzfc zzez.zzsi>
	//*   2    4:ifnull          12
			return zzez1.zzsi;
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field zzfc zzez.zzsi>
	//    5   11:areturn         
		else
			return new zzfc(zzez1);
	//    6   12:new             #2   <Class zzfc>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #39  <Method void zzfc(zzez)>
	//   10   20:areturn         
	}

	private final Object zza(zzjd zzjd1, Class class1, zzfk zzfk)
		throws IOException
	{
		switch(zzfd.zzrr[zzjd1.ordinal()])
	//*   0    0:getstatic       #48  <Field int[] zzfd.zzrr>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #54  <Method int zzjd.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 17: default 92
	//	               1 223
	//	               2 218
	//	               3 210
	//	               4 202
	//	               5 194
	//	               6 186
	//	               7 178
	//	               8 170
	//	               9 162
	//	               10 155
	//	               11 147
	//	               12 139
	//	               13 131
	//	               14 123
	//	               15 118
	//	               16 110
	//	               17 102
		default:
			throw new RuntimeException("unsupported field type.");
	//    5   92:new             #56  <Class RuntimeException>
	//    6   95:dup             
	//    7   96:ldc1            #58  <String "unsupported field type.">
	//    8   98:invokespecial   #61  <Method void RuntimeException(String)>
	//    9  101:athrow          

		case 17: // '\021'
			return ((Object) (Long.valueOf(zzcp())));
	//   10  102:aload_0         
	//   11  103:invokevirtual   #65  <Method long zzcp()>
	//   12  106:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   13  109:areturn         

		case 16: // '\020'
			return ((Object) (Integer.valueOf(zzcx())));
	//   14  110:aload_0         
	//   15  111:invokevirtual   #74  <Method int zzcx()>
	//   16  114:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   17  117:areturn         

		case 15: // '\017'
			return ((Object) (zzcv()));
	//   18  118:aload_0         
	//   19  119:invokevirtual   #83  <Method String zzcv()>
	//   20  122:areturn         

		case 14: // '\016'
			return ((Object) (Long.valueOf(zzdc())));
	//   21  123:aload_0         
	//   22  124:invokevirtual   #86  <Method long zzdc()>
	//   23  127:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   24  130:areturn         

		case 13: // '\r'
			return ((Object) (Integer.valueOf(zzdb())));
	//   25  131:aload_0         
	//   26  132:invokevirtual   #89  <Method int zzdb()>
	//   27  135:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   28  138:areturn         

		case 12: // '\f'
			return ((Object) (Long.valueOf(zzda())));
	//   29  139:aload_0         
	//   30  140:invokevirtual   #92  <Method long zzda()>
	//   31  143:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   32  146:areturn         

		case 11: // '\013'
			return ((Object) (Integer.valueOf(zzcz())));
	//   33  147:aload_0         
	//   34  148:invokevirtual   #95  <Method int zzcz()>
	//   35  151:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   36  154:areturn         

		case 10: // '\n'
			return zza(class1, zzfk);
	//   37  155:aload_0         
	//   38  156:aload_2         
	//   39  157:aload_3         
	//   40  158:invokevirtual   #98  <Method Object zza(Class, zzfk)>
	//   41  161:areturn         

		case 9: // '\t'
			return ((Object) (Long.valueOf(zzcq())));
	//   42  162:aload_0         
	//   43  163:invokevirtual   #101 <Method long zzcq()>
	//   44  166:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   45  169:areturn         

		case 8: // '\b'
			return ((Object) (Integer.valueOf(zzcr())));
	//   46  170:aload_0         
	//   47  171:invokevirtual   #104 <Method int zzcr()>
	//   48  174:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   49  177:areturn         

		case 7: // '\007'
			return ((Object) (Float.valueOf(readFloat())));
	//   50  178:aload_0         
	//   51  179:invokevirtual   #108 <Method float readFloat()>
	//   52  182:invokestatic    #113 <Method Float Float.valueOf(float)>
	//   53  185:areturn         

		case 6: // '\006'
			return ((Object) (Long.valueOf(zzcs())));
	//   54  186:aload_0         
	//   55  187:invokevirtual   #116 <Method long zzcs()>
	//   56  190:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   57  193:areturn         

		case 5: // '\005'
			return ((Object) (Integer.valueOf(zzct())));
	//   58  194:aload_0         
	//   59  195:invokevirtual   #119 <Method int zzct()>
	//   60  198:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   61  201:areturn         

		case 4: // '\004'
			return ((Object) (Integer.valueOf(zzcy())));
	//   62  202:aload_0         
	//   63  203:invokevirtual   #122 <Method int zzcy()>
	//   64  206:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   65  209:areturn         

		case 3: // '\003'
			return ((Object) (Double.valueOf(readDouble())));
	//   66  210:aload_0         
	//   67  211:invokevirtual   #126 <Method double readDouble()>
	//   68  214:invokestatic    #131 <Method Double Double.valueOf(double)>
	//   69  217:areturn         

		case 2: // '\002'
			return ((Object) (zzcw()));
	//   70  218:aload_0         
	//   71  219:invokevirtual   #135 <Method zzeo zzcw()>
	//   72  222:areturn         

		case 1: // '\001'
			return ((Object) (Boolean.valueOf(zzcu())));
	//   73  223:aload_0         
	//   74  224:invokevirtual   #139 <Method boolean zzcu()>
	//   75  227:invokestatic    #144 <Method Boolean Boolean.valueOf(boolean)>
	//   76  230:areturn         
		}
	}

	private final void zza(List list, boolean flag)
		throws IOException
	{
		if((tag & 7) == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field int tag>
	//*   2    4:bipush          7
	//*   3    6:iand            
	//*   4    7:iconst_2        
	//*   5    8:icmpne          131
		{
			if((list instanceof zzgo) && !flag)
	//*   6   11:aload_1         
	//*   7   12:instanceof      #152 <Class zzgo>
	//*   8   15:ifeq            70
	//*   9   18:iload_2         
	//*  10   19:ifne            70
			{
				list = ((List) ((zzgo)list));
	//   11   22:aload_1         
	//   12   23:checkcast       #152 <Class zzgo>
	//   13   26:astore_1        
				int i;
				do
				{
					((zzgo) (list)).zzc(zzcw());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #135 <Method zzeo zzcw()>
	//   17   32:invokeinterface #156 <Method void zzgo.zzc(zzeo)>
					if(zzsp.zzcm())
	//*  18   37:aload_0         
	//*  19   38:getfield        #31  <Field zzez zzsp>
	//*  20   41:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  21   44:ifeq            48
						return;
	//   22   47:return          
					i = zzsp.zzdq();
	//   23   48:aload_0         
	//   24   49:getfield        #31  <Field zzez zzsp>
	//   25   52:invokevirtual   #162 <Method int zzez.zzdq()>
	//   26   55:istore_3        
				} while(i == tag);
	//   27   56:iload_3         
	//   28   57:aload_0         
	//   29   58:getfield        #150 <Field int tag>
	//   30   61:icmpeq          27
				zzsq = i;
	//   31   64:aload_0         
	//   32   65:iload_3         
	//   33   66:putfield        #19  <Field int zzsq>
				return;
	//   34   69:return          
			}
			int j;
			do
			{
				String s;
				if(flag)
	//*  35   70:iload_2         
	//*  36   71:ifeq            83
					s = zzcv();
	//   37   74:aload_0         
	//   38   75:invokevirtual   #83  <Method String zzcv()>
	//   39   78:astore          4
				else
	//*  40   80:goto            89
					s = readString();
	//   41   83:aload_0         
	//   42   84:invokevirtual   #165 <Method String readString()>
	//   43   87:astore          4
				list.add(((Object) (s)));
	//   44   89:aload_1         
	//   45   90:aload           4
	//   46   92:invokeinterface #171 <Method boolean List.add(Object)>
	//   47   97:pop             
				if(zzsp.zzcm())
	//*  48   98:aload_0         
	//*  49   99:getfield        #31  <Field zzez zzsp>
	//*  50  102:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  51  105:ifeq            109
					return;
	//   52  108:return          
				j = zzsp.zzdq();
	//   53  109:aload_0         
	//   54  110:getfield        #31  <Field zzez zzsp>
	//   55  113:invokevirtual   #162 <Method int zzez.zzdq()>
	//   56  116:istore_3        
			} while(j == tag);
	//   57  117:iload_3         
	//   58  118:aload_0         
	//   59  119:getfield        #150 <Field int tag>
	//   60  122:icmpeq          70
			zzsq = j;
	//   61  125:aload_0         
	//   62  126:iload_3         
	//   63  127:putfield        #19  <Field int zzsq>
			return;
	//   64  130:return          
		} else
		{
			throw zzgf.zzfm();
	//   65  131:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   66  134:athrow          
		}
	}

	private final void zzab(int i)
		throws IOException
	{
		if((tag & 7) == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field int tag>
	//*   2    4:bipush          7
	//*   3    6:iand            
	//*   4    7:iload_1         
	//*   5    8:icmpne          12
			return;
	//    6   11:return          
		else
			throw zzgf.zzfm();
	//    7   12:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//    8   15:athrow          
	}

	private static void zzac(int i)
		throws IOException
	{
		if((i & 7) == 0)
	//*   0    0:iload_0         
	//*   1    1:bipush          7
	//*   2    3:iand            
	//*   3    4:ifne            8
			return;
	//    4    7:return          
		else
			throw zzgf.zzfo();
	//    5    8:invokestatic    #185 <Method zzgf zzgf.zzfo()>
	//    6   11:athrow          
	}

	private static void zzad(int i)
		throws IOException
	{
		if((i & 3) == 0)
	//*   0    0:iload_0         
	//*   1    1:iconst_3        
	//*   2    2:iand            
	//*   3    3:ifne            7
			return;
	//    4    6:return          
		else
			throw zzgf.zzfo();
	//    5    7:invokestatic    #185 <Method zzgf zzgf.zzfo()>
	//    6   10:athrow          
	}

	private final void zzae(int i)
		throws IOException
	{
		if(zzsp.zzds() == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field zzez zzsp>
	//*   2    4:invokevirtual   #190 <Method int zzez.zzds()>
	//*   3    7:iload_1         
	//*   4    8:icmpne          12
			return;
	//    5   11:return          
		else
			throw zzgf.zzfh();
	//    6   12:invokestatic    #193 <Method zzgf zzgf.zzfh()>
	//    7   15:athrow          
	}

	private final Object zzb(zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		int i = zzsp.zzcx();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzez zzsp>
	//    2    4:invokevirtual   #196 <Method int zzez.zzcx()>
	//    3    7:istore_3        
		if(zzsp.zzsf < zzsp.zzsg)
	//*   4    8:aload_0         
	//*   5    9:getfield        #31  <Field zzez zzsp>
	//*   6   12:getfield        #199 <Field int zzez.zzsf>
	//*   7   15:aload_0         
	//*   8   16:getfield        #31  <Field zzez zzsp>
	//*   9   19:getfield        #202 <Field int zzez.zzsg>
	//*  10   22:icmpge          112
		{
			i = zzsp.zzan(i);
	//   11   25:aload_0         
	//   12   26:getfield        #31  <Field zzez zzsp>
	//   13   29:iload_3         
	//   14   30:invokevirtual   #206 <Method int zzez.zzan(int)>
	//   15   33:istore_3        
			Object obj = zzhw1.newInstance();
	//   16   34:aload_1         
	//   17   35:invokeinterface #212 <Method Object zzhw.newInstance()>
	//   18   40:astore          4
			zzez zzez1 = zzsp;
	//   19   42:aload_0         
	//   20   43:getfield        #31  <Field zzez zzsp>
	//   21   46:astore          5
			zzez1.zzsf = zzez1.zzsf + 1;
	//   22   48:aload           5
	//   23   50:aload           5
	//   24   52:getfield        #199 <Field int zzez.zzsf>
	//   25   55:iconst_1        
	//   26   56:iadd            
	//   27   57:putfield        #199 <Field int zzez.zzsf>
			zzhw1.zza(obj, ((zzhv) (this)), zzfk);
	//   28   60:aload_1         
	//   29   61:aload           4
	//   30   63:aload_0         
	//   31   64:aload_2         
	//   32   65:invokeinterface #215 <Method void zzhw.zza(Object, zzhv, zzfk)>
			zzhw1.zze(obj);
	//   33   70:aload_1         
	//   34   71:aload           4
	//   35   73:invokeinterface #219 <Method void zzhw.zze(Object)>
			zzsp.zzak(0);
	//   36   78:aload_0         
	//   37   79:getfield        #31  <Field zzez zzsp>
	//   38   82:iconst_0        
	//   39   83:invokevirtual   #222 <Method void zzez.zzak(int)>
			zzhw1 = ((zzhw) (zzsp));
	//   40   86:aload_0         
	//   41   87:getfield        #31  <Field zzez zzsp>
	//   42   90:astore_1        
			zzhw1.zzsf = ((zzez) (zzhw1)).zzsf - 1;
	//   43   91:aload_1         
	//   44   92:aload_1         
	//   45   93:getfield        #199 <Field int zzez.zzsf>
	//   46   96:iconst_1        
	//   47   97:isub            
	//   48   98:putfield        #199 <Field int zzez.zzsf>
			zzsp.zzao(i);
	//   49  101:aload_0         
	//   50  102:getfield        #31  <Field zzez zzsp>
	//   51  105:iload_3         
	//   52  106:invokevirtual   #225 <Method void zzez.zzao(int)>
			return obj;
	//   53  109:aload           4
	//   54  111:areturn         
		} else
		{
			throw zzgf.zzfn();
	//   55  112:invokestatic    #228 <Method zzgf zzgf.zzfn()>
	//   56  115:athrow          
		}
	}

	private final Object zzd(zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		int i;
		i = zzru;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field int zzru>
	//    2    4:istore_3        
		zzru = (tag >>> 3) << 3 | 4;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #150 <Field int tag>
	//    6   10:iconst_3        
	//    7   11:iushr           
	//    8   12:iconst_3        
	//    9   13:ishl            
	//   10   14:iconst_4        
	//   11   15:ior             
	//   12   16:putfield        #232 <Field int zzru>
		int j;
		int k;
		Object obj;
		obj = zzhw1.newInstance();
	//   13   19:aload_1         
	//   14   20:invokeinterface #212 <Method Object zzhw.newInstance()>
	//   15   25:astore          6
		zzhw1.zza(obj, ((zzhv) (this)), zzfk);
	//   16   27:aload_1         
	//   17   28:aload           6
	//   18   30:aload_0         
	//   19   31:aload_2         
	//   20   32:invokeinterface #215 <Method void zzhw.zza(Object, zzhv, zzfk)>
		zzhw1.zze(obj);
	//   21   37:aload_1         
	//   22   38:aload           6
	//   23   40:invokeinterface #219 <Method void zzhw.zze(Object)>
		j = tag;
	//   24   45:aload_0         
	//   25   46:getfield        #150 <Field int tag>
	//   26   49:istore          4
		k = zzru;
	//   27   51:aload_0         
	//   28   52:getfield        #232 <Field int zzru>
	//   29   55:istore          5
		if(j == k)
	//*  30   57:iload           4
	//*  31   59:iload           5
	//*  32   61:icmpne          72
		{
			zzru = i;
	//   33   64:aload_0         
	//   34   65:iload_3         
	//   35   66:putfield        #232 <Field int zzru>
			return obj;
	//   36   69:aload           6
	//   37   71:areturn         
		}
		throw zzgf.zzfo();
	//   38   72:invokestatic    #185 <Method zzgf zzgf.zzfo()>
	//   39   75:athrow          
		zzhw1;
	//   40   76:astore_1        
		zzru = i;
	//   41   77:aload_0         
	//   42   78:iload_3         
	//   43   79:putfield        #232 <Field int zzru>
		throw zzhw1;
	//   44   82:aload_1         
	//   45   83:athrow          
	}

	public final int getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field int tag>
	//    2    4:ireturn         
	}

	public final double readDouble()
		throws IOException
	{
		zzab(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.readDouble();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #236 <Method double zzez.readDouble()>
	//    6   12:dreturn         
	}

	public final float readFloat()
		throws IOException
	{
		zzab(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.readFloat();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #237 <Method float zzez.readFloat()>
	//    6   12:freturn         
	}

	public final String readString()
		throws IOException
	{
		zzab(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.readString();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #238 <Method String zzez.readString()>
	//    6   12:areturn         
	}

	public final void readStringList(List list)
		throws IOException
	{
		zza(list, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #242 <Method void zza(List, boolean)>
	//    4    6:return          
	}

	public final Object zza(zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		zzab(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzb(zzhw1, zzfk);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #245 <Method Object zzb(zzhw, zzfk)>
	//    7   11:areturn         
	}

	public final Object zza(Class class1, zzfk zzfk)
		throws IOException
	{
		zzab(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzb(zzhs.zzgl().zzf(class1), zzfk);
	//    3    5:aload_0         
	//    4    6:invokestatic    #251 <Method zzhs zzhs.zzgl()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #255 <Method zzhw zzhs.zzf(Class)>
	//    7   13:aload_2         
	//    8   14:invokespecial   #245 <Method Object zzb(zzhw, zzfk)>
	//    9   17:areturn         
	}

	public final void zza(List list)
		throws IOException
	{
		if(list instanceof zzfh)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #258 <Class zzfh>
	//*   2    4:ifeq            133
		{
			list = ((List) ((zzfh)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #258 <Class zzfh>
	//    5   11:astore_1        
			switch(tag & 7)
	//*   6   12:aload_0         
	//*   7   13:getfield        #150 <Field int tag>
	//*   8   16:bipush          7
	//*   9   18:iand            
			{
	//*  10   19:tableswitch     1 2: default 40
	//	               1 89
	//	               2 44
			default:
				throw zzgf.zzfm();
	//   11   40:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   12   43:athrow          

			case 2: // '\002'
				int i = zzsp.zzcx();
	//   13   44:aload_0         
	//   14   45:getfield        #31  <Field zzez zzsp>
	//   15   48:invokevirtual   #196 <Method int zzez.zzcx()>
	//   16   51:istore_2        
				zzac(i);
	//   17   52:iload_2         
	//   18   53:invokestatic    #260 <Method void zzac(int)>
				int i1 = zzsp.zzds();
	//   19   56:aload_0         
	//   20   57:getfield        #31  <Field zzez zzsp>
	//   21   60:invokevirtual   #190 <Method int zzez.zzds()>
	//   22   63:istore_3        
				do
					((zzfh) (list)).zzc(zzsp.readDouble());
	//   23   64:aload_1         
	//   24   65:aload_0         
	//   25   66:getfield        #31  <Field zzez zzsp>
	//   26   69:invokevirtual   #236 <Method double zzez.readDouble()>
	//   27   72:invokevirtual   #263 <Method void zzfh.zzc(double)>
				while(zzsp.zzds() < i1 + i);
	//   28   75:aload_0         
	//   29   76:getfield        #31  <Field zzez zzsp>
	//   30   79:invokevirtual   #190 <Method int zzez.zzds()>
	//   31   82:iload_3         
	//   32   83:iload_2         
	//   33   84:iadd            
	//   34   85:icmplt          64
				return;
	//   35   88:return          

			case 1: // '\001'
				break;
			}
			int j;
			do
			{
				((zzfh) (list)).zzc(zzsp.readDouble());
	//   36   89:aload_1         
	//   37   90:aload_0         
	//   38   91:getfield        #31  <Field zzez zzsp>
	//   39   94:invokevirtual   #236 <Method double zzez.readDouble()>
	//   40   97:invokevirtual   #263 <Method void zzfh.zzc(double)>
				if(zzsp.zzcm())
	//*  41  100:aload_0         
	//*  42  101:getfield        #31  <Field zzez zzsp>
	//*  43  104:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  44  107:ifeq            111
					return;
	//   45  110:return          
				j = zzsp.zzdq();
	//   46  111:aload_0         
	//   47  112:getfield        #31  <Field zzez zzsp>
	//   48  115:invokevirtual   #162 <Method int zzez.zzdq()>
	//   49  118:istore_2        
			} while(j == tag);
	//   50  119:iload_2         
	//   51  120:aload_0         
	//   52  121:getfield        #150 <Field int tag>
	//   53  124:icmpeq          89
			zzsq = j;
	//   54  127:aload_0         
	//   55  128:iload_2         
	//   56  129:putfield        #19  <Field int zzsq>
			return;
	//   57  132:return          
		}
		switch(tag & 7)
	//*  58  133:aload_0         
	//*  59  134:getfield        #150 <Field int tag>
	//*  60  137:bipush          7
	//*  61  139:iand            
		{
	//*  62  140:tableswitch     1 2: default 164
	//	               1 219
	//	               2 168
		default:
			throw zzgf.zzfm();
	//   63  164:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   64  167:athrow          

		case 2: // '\002'
			int k = zzsp.zzcx();
	//   65  168:aload_0         
	//   66  169:getfield        #31  <Field zzez zzsp>
	//   67  172:invokevirtual   #196 <Method int zzez.zzcx()>
	//   68  175:istore_2        
			zzac(k);
	//   69  176:iload_2         
	//   70  177:invokestatic    #260 <Method void zzac(int)>
			int j1 = zzsp.zzds();
	//   71  180:aload_0         
	//   72  181:getfield        #31  <Field zzez zzsp>
	//   73  184:invokevirtual   #190 <Method int zzez.zzds()>
	//   74  187:istore_3        
			do
				list.add(((Object) (Double.valueOf(zzsp.readDouble()))));
	//   75  188:aload_1         
	//   76  189:aload_0         
	//   77  190:getfield        #31  <Field zzez zzsp>
	//   78  193:invokevirtual   #236 <Method double zzez.readDouble()>
	//   79  196:invokestatic    #131 <Method Double Double.valueOf(double)>
	//   80  199:invokeinterface #171 <Method boolean List.add(Object)>
	//   81  204:pop             
			while(zzsp.zzds() < j1 + k);
	//   82  205:aload_0         
	//   83  206:getfield        #31  <Field zzez zzsp>
	//   84  209:invokevirtual   #190 <Method int zzez.zzds()>
	//   85  212:iload_3         
	//   86  213:iload_2         
	//   87  214:iadd            
	//   88  215:icmplt          188
			return;
	//   89  218:return          

		case 1: // '\001'
			break;
		}
		int l;
		do
		{
			list.add(((Object) (Double.valueOf(zzsp.readDouble()))));
	//   90  219:aload_1         
	//   91  220:aload_0         
	//   92  221:getfield        #31  <Field zzez zzsp>
	//   93  224:invokevirtual   #236 <Method double zzez.readDouble()>
	//   94  227:invokestatic    #131 <Method Double Double.valueOf(double)>
	//   95  230:invokeinterface #171 <Method boolean List.add(Object)>
	//   96  235:pop             
			if(zzsp.zzcm())
	//*  97  236:aload_0         
	//*  98  237:getfield        #31  <Field zzez zzsp>
	//*  99  240:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//* 100  243:ifeq            247
				return;
	//  101  246:return          
			l = zzsp.zzdq();
	//  102  247:aload_0         
	//  103  248:getfield        #31  <Field zzez zzsp>
	//  104  251:invokevirtual   #162 <Method int zzez.zzdq()>
	//  105  254:istore_2        
		} while(l == tag);
	//  106  255:iload_2         
	//  107  256:aload_0         
	//  108  257:getfield        #150 <Field int tag>
	//  109  260:icmpeq          219
		zzsq = l;
	//  110  263:aload_0         
	//  111  264:iload_2         
	//  112  265:putfield        #19  <Field int zzsq>
	//  113  268:return          
	}

	public final void zza(List list, zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		int i = tag;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field int tag>
	//    2    4:istore          4
		if((i & 7) == 2)
			do
	//*   3    6:iload           4
	//*   4    8:bipush          7
	//*   5   10:iand            
	//*   6   11:iconst_2        
	//*   7   12:icmpne          70
			{
				list.add(zzb(zzhw1, zzfk));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:invokespecial   #245 <Method Object zzb(zzhw, zzfk)>
	//   13   22:invokeinterface #171 <Method boolean List.add(Object)>
	//   14   27:pop             
				if(!zzsp.zzcm())
	//*  15   28:aload_0         
	//*  16   29:getfield        #31  <Field zzez zzsp>
	//*  17   32:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  18   35:ifne            69
				{
					if(zzsq != 0)
	//*  19   38:aload_0         
	//*  20   39:getfield        #19  <Field int zzsq>
	//*  21   42:ifeq            46
						return;
	//   22   45:return          
					int j = zzsp.zzdq();
	//   23   46:aload_0         
	//   24   47:getfield        #31  <Field zzez zzsp>
	//   25   50:invokevirtual   #162 <Method int zzez.zzdq()>
	//   26   53:istore          5
					if(j != i)
	//*  27   55:iload           5
	//*  28   57:iload           4
	//*  29   59:icmpeq          15
					{
						zzsq = j;
	//   30   62:aload_0         
	//   31   63:iload           5
	//   32   65:putfield        #19  <Field int zzsq>
						return;
	//   33   68:return          
					}
				} else
				{
					return;
	//   34   69:return          
				}
			} while(true);
		else
			throw zzgf.zzfm();
	//   35   70:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   36   73:athrow          
	}

	public final void zza(Map map, zzgy zzgy1, zzfk zzfk)
		throws IOException
	{
		int i;
		Object obj;
		Object obj1;
		zzab(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		i = zzsp.zzcx();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #196 <Method int zzez.zzcx()>
	//    6   12:istore          4
		i = zzsp.zzan(i);
	//    7   14:aload_0         
	//    8   15:getfield        #31  <Field zzez zzsp>
	//    9   18:iload           4
	//   10   20:invokevirtual   #206 <Method int zzez.zzan(int)>
	//   11   23:istore          4
		obj = zzgy1.zzyw;
	//   12   25:aload_2         
	//   13   26:getfield        #275 <Field Object zzgy.zzyw>
	//   14   29:astore          7
		obj1 = zzgy1.zzgq;
	//   15   31:aload_2         
	//   16   32:getfield        #278 <Field Object zzgy.zzgq>
	//   17   35:astore          8
_L6:
		int j = zzcn();
	//   18   37:aload_0         
	//   19   38:invokevirtual   #281 <Method int zzcn()>
	//   20   41:istore          5
		if(j == 0x7fffffff)
			break; /* Loop/switch isn't completed */
	//   21   43:iload           5
	//   22   45:ldc2            #282 <Int 0x7fffffff>
	//   23   48:icmpeq          173
		boolean flag = zzsp.zzcm();
	//   24   51:aload_0         
	//   25   52:getfield        #31  <Field zzez zzsp>
	//   26   55:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//   27   58:istore          6
		if(flag)
			break; /* Loop/switch isn't completed */
	//   28   60:iload           6
	//   29   62:ifne            173
		j;
	//   30   65:iload           5
		JVM INSTR tableswitch 1 2: default 88
	//	               1 122
	//	               2 97;
	//   31   67:tableswitch     1 2: default 88
	//	               1 122
	//	               2 97
		   goto _L1 _L2 _L3
_L1:
		flag = zzco();
	//   32   88:aload_0         
	//   33   89:invokevirtual   #285 <Method boolean zzco()>
	//   34   92:istore          6
		  goto _L4
	//*  35   94:goto            211
_L3:
		Object obj2 = zza(zzgy1.zzyx, zzgy1.zzgq.getClass(), zzfk);
	//   36   97:aload_0         
	//   37   98:aload_2         
	//   38   99:getfield        #289 <Field zzjd zzgy.zzyx>
	//   39  102:aload_2         
	//   40  103:getfield        #278 <Field Object zzgy.zzgq>
	//   41  106:invokevirtual   #293 <Method Class Object.getClass()>
	//   42  109:aload_3         
	//   43  110:invokespecial   #295 <Method Object zza(zzjd, Class, zzfk)>
	//   44  113:astore          9
		obj1 = obj2;
	//   45  115:aload           9
	//   46  117:astore          8
		continue; /* Loop/switch isn't completed */
	//   47  119:goto            37
_L2:
		obj2 = zza(zzgy1.zzyv, ((Class) (null)), ((zzfk) (null)));
	//   48  122:aload_0         
	//   49  123:aload_2         
	//   50  124:getfield        #298 <Field zzjd zzgy.zzyv>
	//   51  127:aconst_null     
	//   52  128:aconst_null     
	//   53  129:invokespecial   #295 <Method Object zza(zzjd, Class, zzfk)>
	//   54  132:astore          9
		obj = obj2;
	//   55  134:aload           9
	//   56  136:astore          7
		if(true) goto _L6; else goto _L5
	//   57  138:goto            37
_L7:
		try
		{
			throw new zzgf("Unable to parse map entry.");
	//   58  141:new             #173 <Class zzgf>
	//   59  144:dup             
	//   60  145:ldc2            #300 <String "Unable to parse map entry.">
	//   61  148:invokespecial   #301 <Method void zzgf(String)>
	//   62  151:athrow          
		}
	//*  63  152:aload_0         
	//*  64  153:invokevirtual   #285 <Method boolean zzco()>
	//*  65  156:ifeq            162
	//*  66  159:goto            37
	//*  67  162:new             #173 <Class zzgf>
	//*  68  165:dup             
	//*  69  166:ldc2            #300 <String "Unable to parse map entry.">
	//*  70  169:invokespecial   #301 <Method void zzgf(String)>
	//*  71  172:athrow          
	//*  72  173:aload_1         
	//*  73  174:aload           7
	//*  74  176:aload           8
	//*  75  178:invokeinterface #307 <Method Object Map.put(Object, Object)>
	//*  76  183:pop             
	//*  77  184:aload_0         
	//*  78  185:getfield        #31  <Field zzez zzsp>
	//*  79  188:iload           4
	//*  80  190:invokevirtual   #225 <Method void zzez.zzao(int)>
	//*  81  193:return          
	//*  82  194:astore_1        
	//*  83  195:aload_0         
	//*  84  196:getfield        #31  <Field zzez zzsp>
	//*  85  199:iload           4
	//*  86  201:invokevirtual   #225 <Method void zzez.zzao(int)>
	//*  87  204:aload_1         
	//*  88  205:athrow          
		catch(zzgg zzgg1) { }
	//   89  206:astore          9
		if(zzco())
			break; /* Loop/switch isn't completed */
		throw new zzgf("Unable to parse map entry.");
_L5:
		map.put(obj, obj1);
		zzsp.zzao(i);
		return;
		map;
		zzsp.zzao(i);
		throw map;
	//*  90  208:goto            152
_L4:
		if(!flag) goto _L7; else goto _L6
	//   91  211:iload           6
	//   92  213:ifeq            141
	//*  93  216:goto            37
	}

	public final Object zzb(Class class1, zzfk zzfk)
		throws IOException
	{
		zzab(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzd(zzhs.zzgl().zzf(class1), zzfk);
	//    3    5:aload_0         
	//    4    6:invokestatic    #251 <Method zzhs zzhs.zzgl()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #255 <Method zzhw zzhs.zzf(Class)>
	//    7   13:aload_2         
	//    8   14:invokespecial   #310 <Method Object zzd(zzhw, zzfk)>
	//    9   17:areturn         
	}

	public final void zzb(List list)
		throws IOException
	{
		if(list instanceof zzfv)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #312 <Class zzfv>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzfv)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #312 <Class zzfv>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 2)
	//*  11   20:iload_2         
	//*  12   21:iconst_2        
	//*  13   22:icmpeq          78
				if(i == 5)
	//*  14   25:iload_2         
	//*  15   26:iconst_5        
	//*  16   27:icmpne          74
				{
					do
					{
						((zzfv) (list)).zzh(zzsp.readFloat());
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:getfield        #31  <Field zzez zzsp>
	//   20   35:invokevirtual   #237 <Method float zzez.readFloat()>
	//   21   38:invokevirtual   #316 <Method void zzfv.zzh(float)>
						if(zzsp.zzcm())
	//*  22   41:aload_0         
	//*  23   42:getfield        #31  <Field zzez zzsp>
	//*  24   45:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  25   48:ifeq            52
							return;
	//   26   51:return          
						i = zzsp.zzdq();
	//   27   52:aload_0         
	//   28   53:getfield        #31  <Field zzez zzsp>
	//   29   56:invokevirtual   #162 <Method int zzez.zzdq()>
	//   30   59:istore_2        
					} while(i == tag);
	//   31   60:iload_2         
	//   32   61:aload_0         
	//   33   62:getfield        #150 <Field int tag>
	//   34   65:icmpeq          30
					zzsq = i;
	//   35   68:aload_0         
	//   36   69:iload_2         
	//   37   70:putfield        #19  <Field int zzsq>
					return;
	//   38   73:return          
				} else
				{
					throw zzgf.zzfm();
	//   39   74:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   40   77:athrow          
				}
			i = zzsp.zzcx();
	//   41   78:aload_0         
	//   42   79:getfield        #31  <Field zzez zzsp>
	//   43   82:invokevirtual   #196 <Method int zzez.zzcx()>
	//   44   85:istore_2        
			zzad(i);
	//   45   86:iload_2         
	//   46   87:invokestatic    #318 <Method void zzad(int)>
			int k = zzsp.zzds();
	//   47   90:aload_0         
	//   48   91:getfield        #31  <Field zzez zzsp>
	//   49   94:invokevirtual   #190 <Method int zzez.zzds()>
	//   50   97:istore_3        
			do
				((zzfv) (list)).zzh(zzsp.readFloat());
	//   51   98:aload_1         
	//   52   99:aload_0         
	//   53  100:getfield        #31  <Field zzez zzsp>
	//   54  103:invokevirtual   #237 <Method float zzez.readFloat()>
	//   55  106:invokevirtual   #316 <Method void zzfv.zzh(float)>
			while(zzsp.zzds() < k + i);
	//   56  109:aload_0         
	//   57  110:getfield        #31  <Field zzez zzsp>
	//   58  113:invokevirtual   #190 <Method int zzez.zzds()>
	//   59  116:iload_3         
	//   60  117:iload_2         
	//   61  118:iadd            
	//   62  119:icmplt          98
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #150 <Field int tag>
	//   66  127:bipush          7
	//   67  129:iand            
	//   68  130:istore_2        
		if(j != 2)
	//*  69  131:iload_2         
	//*  70  132:iconst_2        
	//*  71  133:icmpeq          195
			if(j == 5)
	//*  72  136:iload_2         
	//*  73  137:iconst_5        
	//*  74  138:icmpne          191
			{
				do
				{
					list.add(((Object) (Float.valueOf(zzsp.readFloat()))));
	//   75  141:aload_1         
	//   76  142:aload_0         
	//   77  143:getfield        #31  <Field zzez zzsp>
	//   78  146:invokevirtual   #237 <Method float zzez.readFloat()>
	//   79  149:invokestatic    #113 <Method Float Float.valueOf(float)>
	//   80  152:invokeinterface #171 <Method boolean List.add(Object)>
	//   81  157:pop             
					if(zzsp.zzcm())
	//*  82  158:aload_0         
	//*  83  159:getfield        #31  <Field zzez zzsp>
	//*  84  162:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  85  165:ifeq            169
						return;
	//   86  168:return          
					j = zzsp.zzdq();
	//   87  169:aload_0         
	//   88  170:getfield        #31  <Field zzez zzsp>
	//   89  173:invokevirtual   #162 <Method int zzez.zzdq()>
	//   90  176:istore_2        
				} while(j == tag);
	//   91  177:iload_2         
	//   92  178:aload_0         
	//   93  179:getfield        #150 <Field int tag>
	//   94  182:icmpeq          141
				zzsq = j;
	//   95  185:aload_0         
	//   96  186:iload_2         
	//   97  187:putfield        #19  <Field int zzsq>
				return;
	//   98  190:return          
			} else
			{
				throw zzgf.zzfm();
	//   99  191:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//  100  194:athrow          
			}
		j = zzsp.zzcx();
	//  101  195:aload_0         
	//  102  196:getfield        #31  <Field zzez zzsp>
	//  103  199:invokevirtual   #196 <Method int zzez.zzcx()>
	//  104  202:istore_2        
		zzad(j);
	//  105  203:iload_2         
	//  106  204:invokestatic    #318 <Method void zzad(int)>
		int l = zzsp.zzds();
	//  107  207:aload_0         
	//  108  208:getfield        #31  <Field zzez zzsp>
	//  109  211:invokevirtual   #190 <Method int zzez.zzds()>
	//  110  214:istore_3        
		do
			list.add(((Object) (Float.valueOf(zzsp.readFloat()))));
	//  111  215:aload_1         
	//  112  216:aload_0         
	//  113  217:getfield        #31  <Field zzez zzsp>
	//  114  220:invokevirtual   #237 <Method float zzez.readFloat()>
	//  115  223:invokestatic    #113 <Method Float Float.valueOf(float)>
	//  116  226:invokeinterface #171 <Method boolean List.add(Object)>
	//  117  231:pop             
		while(zzsp.zzds() < l + j);
	//  118  232:aload_0         
	//  119  233:getfield        #31  <Field zzez zzsp>
	//  120  236:invokevirtual   #190 <Method int zzez.zzds()>
	//  121  239:iload_3         
	//  122  240:iload_2         
	//  123  241:iadd            
	//  124  242:icmplt          215
	//  125  245:return          
	}

	public final void zzb(List list, zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		int i = tag;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field int tag>
	//    2    4:istore          4
		if((i & 7) == 3)
			do
	//*   3    6:iload           4
	//*   4    8:bipush          7
	//*   5   10:iand            
	//*   6   11:iconst_3        
	//*   7   12:icmpne          70
			{
				list.add(zzd(zzhw1, zzfk));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:invokespecial   #310 <Method Object zzd(zzhw, zzfk)>
	//   13   22:invokeinterface #171 <Method boolean List.add(Object)>
	//   14   27:pop             
				if(!zzsp.zzcm())
	//*  15   28:aload_0         
	//*  16   29:getfield        #31  <Field zzez zzsp>
	//*  17   32:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  18   35:ifne            69
				{
					if(zzsq != 0)
	//*  19   38:aload_0         
	//*  20   39:getfield        #19  <Field int zzsq>
	//*  21   42:ifeq            46
						return;
	//   22   45:return          
					int j = zzsp.zzdq();
	//   23   46:aload_0         
	//   24   47:getfield        #31  <Field zzez zzsp>
	//   25   50:invokevirtual   #162 <Method int zzez.zzdq()>
	//   26   53:istore          5
					if(j != i)
	//*  27   55:iload           5
	//*  28   57:iload           4
	//*  29   59:icmpeq          15
					{
						zzsq = j;
	//   30   62:aload_0         
	//   31   63:iload           5
	//   32   65:putfield        #19  <Field int zzsq>
						return;
	//   33   68:return          
					}
				} else
				{
					return;
	//   34   69:return          
				}
			} while(true);
		else
			throw zzgf.zzfm();
	//   35   70:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   36   73:athrow          
	}

	public final Object zzc(zzhw zzhw1, zzfk zzfk)
		throws IOException
	{
		zzab(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzd(zzhw1, zzfk);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #310 <Method Object zzd(zzhw, zzfk)>
	//    7   11:areturn         
	}

	public final void zzc(List list)
		throws IOException
	{
		if(list instanceof zzgt)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #321 <Class zzgt>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzgt)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #321 <Class zzgt>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            79
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          75
				{
					i = zzsp.zzcx();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zzez zzsp>
	//   18   33:invokevirtual   #196 <Method int zzez.zzcx()>
	//   19   36:istore_2        
					i = zzsp.zzds() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zzez zzsp>
	//   22   41:invokevirtual   #190 <Method int zzez.zzds()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzgt) (list)).zzp(zzsp.zzcp());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zzez zzsp>
	//   29   52:invokevirtual   #322 <Method long zzez.zzcp()>
	//   30   55:invokevirtual   #326 <Method void zzgt.zzp(long)>
					while(zzsp.zzds() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zzez zzsp>
	//   33   62:invokevirtual   #190 <Method int zzez.zzds()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzae(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #328 <Method void zzae(int)>
					return;
	//   39   74:return          
				} else
				{
					throw zzgf.zzfm();
	//   40   75:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   41   78:athrow          
				}
			do
			{
				((zzgt) (list)).zzp(zzsp.zzcp());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zzez zzsp>
	//   45   84:invokevirtual   #322 <Method long zzez.zzcp()>
	//   46   87:invokevirtual   #326 <Method void zzgt.zzp(long)>
				if(zzsp.zzcm())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zzez zzsp>
	//*  49   94:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzsp.zzdq();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zzez zzsp>
	//   54  105:invokevirtual   #162 <Method int zzez.zzdq()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #150 <Field int tag>
	//   59  114:icmpeq          79
			zzsq = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzsq>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #150 <Field int tag>
	//   66  127:bipush          7
	//   67  129:iand            
	//   68  130:istore_2        
		if(j != 0)
	//*  69  131:iload_2         
	//*  70  132:ifeq            196
			if(j == 2)
	//*  71  135:iload_2         
	//*  72  136:iconst_2        
	//*  73  137:icmpne          192
			{
				j = zzsp.zzcx();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zzez zzsp>
	//   76  144:invokevirtual   #196 <Method int zzez.zzcx()>
	//   77  147:istore_2        
				j = zzsp.zzds() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zzez zzsp>
	//   80  152:invokevirtual   #190 <Method int zzez.zzds()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Long.valueOf(zzsp.zzcp()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zzez zzsp>
	//   87  163:invokevirtual   #322 <Method long zzez.zzcp()>
	//   88  166:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   89  169:invokeinterface #171 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzsp.zzds() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zzez zzsp>
	//   93  179:invokevirtual   #190 <Method int zzez.zzds()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzae(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #328 <Method void zzae(int)>
				return;
	//   99  191:return          
			} else
			{
				throw zzgf.zzfm();
	//  100  192:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Long.valueOf(zzsp.zzcp()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zzez zzsp>
	//  105  201:invokevirtual   #322 <Method long zzez.zzcp()>
	//  106  204:invokestatic    #71  <Method Long Long.valueOf(long)>
	//  107  207:invokeinterface #171 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzsp.zzcm())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zzez zzsp>
	//* 111  217:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzsp.zzdq();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zzez zzsp>
	//  116  228:invokevirtual   #162 <Method int zzez.zzdq()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #150 <Field int tag>
	//  121  237:icmpeq          196
		zzsq = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzsq>
	//  125  245:return          
	}

	public final int zzcn()
		throws IOException
	{
		int i = zzsq;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int zzsq>
	//    2    4:istore_1        
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            22
		{
			tag = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #150 <Field int tag>
			zzsq = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #19  <Field int zzsq>
		} else
	//*  11   19:goto            33
		{
			tag = zzsp.zzdq();
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #31  <Field zzez zzsp>
	//   15   27:invokevirtual   #162 <Method int zzez.zzdq()>
	//   16   30:putfield        #150 <Field int tag>
		}
		i = tag;
	//   17   33:aload_0         
	//   18   34:getfield        #150 <Field int tag>
	//   19   37:istore_1        
		if(i != 0 && i != zzru)
	//*  20   38:iload_1         
	//*  21   39:ifeq            57
	//*  22   42:iload_1         
	//*  23   43:aload_0         
	//*  24   44:getfield        #232 <Field int zzru>
	//*  25   47:icmpne          53
	//*  26   50:goto            57
			return i >>> 3;
	//   27   53:iload_1         
	//   28   54:iconst_3        
	//   29   55:iushr           
	//   30   56:ireturn         
		else
			return 0x7fffffff;
	//   31   57:ldc2            #282 <Int 0x7fffffff>
	//   32   60:ireturn         
	}

	public final boolean zzco()
		throws IOException
	{
		if(!zzsp.zzcm())
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field zzez zzsp>
	//*   2    4:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*   3    7:ifne            35
		{
			int i = tag;
	//    4   10:aload_0         
	//    5   11:getfield        #150 <Field int tag>
	//    6   14:istore_1        
			if(i != zzru)
	//*   7   15:iload_1         
	//*   8   16:aload_0         
	//*   9   17:getfield        #232 <Field int zzru>
	//*  10   20:icmpne          26
	//*  11   23:goto            35
				return zzsp.zzal(i);
	//   12   26:aload_0         
	//   13   27:getfield        #31  <Field zzez zzsp>
	//   14   30:iload_1         
	//   15   31:invokevirtual   #333 <Method boolean zzez.zzal(int)>
	//   16   34:ireturn         
		}
		return false;
	//   17   35:iconst_0        
	//   18   36:ireturn         
	}

	public final long zzcp()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzcp();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #322 <Method long zzez.zzcp()>
	//    6   12:lreturn         
	}

	public final long zzcq()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzcq();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #334 <Method long zzez.zzcq()>
	//    6   12:lreturn         
	}

	public final int zzcr()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzcr();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #335 <Method int zzez.zzcr()>
	//    6   12:ireturn         
	}

	public final long zzcs()
		throws IOException
	{
		zzab(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzcs();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #336 <Method long zzez.zzcs()>
	//    6   12:lreturn         
	}

	public final int zzct()
		throws IOException
	{
		zzab(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzct();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #337 <Method int zzez.zzct()>
	//    6   12:ireturn         
	}

	public final boolean zzcu()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzcu();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #338 <Method boolean zzez.zzcu()>
	//    6   12:ireturn         
	}

	public final String zzcv()
		throws IOException
	{
		zzab(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzcv();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #339 <Method String zzez.zzcv()>
	//    6   12:areturn         
	}

	public final zzeo zzcw()
		throws IOException
	{
		zzab(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzcw();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #340 <Method zzeo zzez.zzcw()>
	//    6   12:areturn         
	}

	public final int zzcx()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzcx();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #196 <Method int zzez.zzcx()>
	//    6   12:ireturn         
	}

	public final int zzcy()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzcy();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #341 <Method int zzez.zzcy()>
	//    6   12:ireturn         
	}

	public final int zzcz()
		throws IOException
	{
		zzab(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzcz();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #342 <Method int zzez.zzcz()>
	//    6   12:ireturn         
	}

	public final void zzd(List list)
		throws IOException
	{
		if(list instanceof zzgt)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #321 <Class zzgt>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzgt)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #321 <Class zzgt>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            79
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          75
				{
					i = zzsp.zzcx();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zzez zzsp>
	//   18   33:invokevirtual   #196 <Method int zzez.zzcx()>
	//   19   36:istore_2        
					i = zzsp.zzds() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zzez zzsp>
	//   22   41:invokevirtual   #190 <Method int zzez.zzds()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzgt) (list)).zzp(zzsp.zzcq());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zzez zzsp>
	//   29   52:invokevirtual   #334 <Method long zzez.zzcq()>
	//   30   55:invokevirtual   #326 <Method void zzgt.zzp(long)>
					while(zzsp.zzds() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zzez zzsp>
	//   33   62:invokevirtual   #190 <Method int zzez.zzds()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzae(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #328 <Method void zzae(int)>
					return;
	//   39   74:return          
				} else
				{
					throw zzgf.zzfm();
	//   40   75:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   41   78:athrow          
				}
			do
			{
				((zzgt) (list)).zzp(zzsp.zzcq());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zzez zzsp>
	//   45   84:invokevirtual   #334 <Method long zzez.zzcq()>
	//   46   87:invokevirtual   #326 <Method void zzgt.zzp(long)>
				if(zzsp.zzcm())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zzez zzsp>
	//*  49   94:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzsp.zzdq();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zzez zzsp>
	//   54  105:invokevirtual   #162 <Method int zzez.zzdq()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #150 <Field int tag>
	//   59  114:icmpeq          79
			zzsq = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzsq>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #150 <Field int tag>
	//   66  127:bipush          7
	//   67  129:iand            
	//   68  130:istore_2        
		if(j != 0)
	//*  69  131:iload_2         
	//*  70  132:ifeq            196
			if(j == 2)
	//*  71  135:iload_2         
	//*  72  136:iconst_2        
	//*  73  137:icmpne          192
			{
				j = zzsp.zzcx();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zzez zzsp>
	//   76  144:invokevirtual   #196 <Method int zzez.zzcx()>
	//   77  147:istore_2        
				j = zzsp.zzds() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zzez zzsp>
	//   80  152:invokevirtual   #190 <Method int zzez.zzds()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Long.valueOf(zzsp.zzcq()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zzez zzsp>
	//   87  163:invokevirtual   #334 <Method long zzez.zzcq()>
	//   88  166:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   89  169:invokeinterface #171 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzsp.zzds() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zzez zzsp>
	//   93  179:invokevirtual   #190 <Method int zzez.zzds()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzae(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #328 <Method void zzae(int)>
				return;
	//   99  191:return          
			} else
			{
				throw zzgf.zzfm();
	//  100  192:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Long.valueOf(zzsp.zzcq()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zzez zzsp>
	//  105  201:invokevirtual   #334 <Method long zzez.zzcq()>
	//  106  204:invokestatic    #71  <Method Long Long.valueOf(long)>
	//  107  207:invokeinterface #171 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzsp.zzcm())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zzez zzsp>
	//* 111  217:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzsp.zzdq();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zzez zzsp>
	//  116  228:invokevirtual   #162 <Method int zzez.zzdq()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #150 <Field int tag>
	//  121  237:icmpeq          196
		zzsq = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzsq>
	//  125  245:return          
	}

	public final long zzda()
		throws IOException
	{
		zzab(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzda();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #343 <Method long zzez.zzda()>
	//    6   12:lreturn         
	}

	public final int zzdb()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzdb();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #344 <Method int zzez.zzdb()>
	//    6   12:ireturn         
	}

	public final long zzdc()
		throws IOException
	{
		zzab(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #235 <Method void zzab(int)>
		return zzsp.zzdc();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzez zzsp>
	//    5    9:invokevirtual   #345 <Method long zzez.zzdc()>
	//    6   12:lreturn         
	}

	public final void zze(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #347 <Class zzfz>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #347 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            79
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          75
				{
					i = zzsp.zzcx();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zzez zzsp>
	//   18   33:invokevirtual   #196 <Method int zzez.zzcx()>
	//   19   36:istore_2        
					i = zzsp.zzds() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zzez zzsp>
	//   22   41:invokevirtual   #190 <Method int zzez.zzds()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzfz) (list)).zzbg(zzsp.zzcr());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zzez zzsp>
	//   29   52:invokevirtual   #335 <Method int zzez.zzcr()>
	//   30   55:invokevirtual   #350 <Method void zzfz.zzbg(int)>
					while(zzsp.zzds() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zzez zzsp>
	//   33   62:invokevirtual   #190 <Method int zzez.zzds()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzae(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #328 <Method void zzae(int)>
					return;
	//   39   74:return          
				} else
				{
					throw zzgf.zzfm();
	//   40   75:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   41   78:athrow          
				}
			do
			{
				((zzfz) (list)).zzbg(zzsp.zzcr());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zzez zzsp>
	//   45   84:invokevirtual   #335 <Method int zzez.zzcr()>
	//   46   87:invokevirtual   #350 <Method void zzfz.zzbg(int)>
				if(zzsp.zzcm())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zzez zzsp>
	//*  49   94:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzsp.zzdq();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zzez zzsp>
	//   54  105:invokevirtual   #162 <Method int zzez.zzdq()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #150 <Field int tag>
	//   59  114:icmpeq          79
			zzsq = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzsq>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #150 <Field int tag>
	//   66  127:bipush          7
	//   67  129:iand            
	//   68  130:istore_2        
		if(j != 0)
	//*  69  131:iload_2         
	//*  70  132:ifeq            196
			if(j == 2)
	//*  71  135:iload_2         
	//*  72  136:iconst_2        
	//*  73  137:icmpne          192
			{
				j = zzsp.zzcx();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zzez zzsp>
	//   76  144:invokevirtual   #196 <Method int zzez.zzcx()>
	//   77  147:istore_2        
				j = zzsp.zzds() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zzez zzsp>
	//   80  152:invokevirtual   #190 <Method int zzez.zzds()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Integer.valueOf(zzsp.zzcr()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zzez zzsp>
	//   87  163:invokevirtual   #335 <Method int zzez.zzcr()>
	//   88  166:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   89  169:invokeinterface #171 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzsp.zzds() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zzez zzsp>
	//   93  179:invokevirtual   #190 <Method int zzez.zzds()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzae(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #328 <Method void zzae(int)>
				return;
	//   99  191:return          
			} else
			{
				throw zzgf.zzfm();
	//  100  192:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzsp.zzcr()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zzez zzsp>
	//  105  201:invokevirtual   #335 <Method int zzez.zzcr()>
	//  106  204:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  107  207:invokeinterface #171 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzsp.zzcm())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zzez zzsp>
	//* 111  217:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzsp.zzdq();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zzez zzsp>
	//  116  228:invokevirtual   #162 <Method int zzez.zzdq()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #150 <Field int tag>
	//  121  237:icmpeq          196
		zzsq = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzsq>
	//  125  245:return          
	}

	public final void zzf(List list)
		throws IOException
	{
		if(list instanceof zzgt)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #321 <Class zzgt>
	//*   2    4:ifeq            133
		{
			list = ((List) ((zzgt)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #321 <Class zzgt>
	//    5   11:astore_1        
			switch(tag & 7)
	//*   6   12:aload_0         
	//*   7   13:getfield        #150 <Field int tag>
	//*   8   16:bipush          7
	//*   9   18:iand            
			{
	//*  10   19:tableswitch     1 2: default 40
	//	               1 89
	//	               2 44
			default:
				throw zzgf.zzfm();
	//   11   40:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   12   43:athrow          

			case 2: // '\002'
				int i = zzsp.zzcx();
	//   13   44:aload_0         
	//   14   45:getfield        #31  <Field zzez zzsp>
	//   15   48:invokevirtual   #196 <Method int zzez.zzcx()>
	//   16   51:istore_2        
				zzac(i);
	//   17   52:iload_2         
	//   18   53:invokestatic    #260 <Method void zzac(int)>
				int i1 = zzsp.zzds();
	//   19   56:aload_0         
	//   20   57:getfield        #31  <Field zzez zzsp>
	//   21   60:invokevirtual   #190 <Method int zzez.zzds()>
	//   22   63:istore_3        
				do
					((zzgt) (list)).zzp(zzsp.zzcs());
	//   23   64:aload_1         
	//   24   65:aload_0         
	//   25   66:getfield        #31  <Field zzez zzsp>
	//   26   69:invokevirtual   #336 <Method long zzez.zzcs()>
	//   27   72:invokevirtual   #326 <Method void zzgt.zzp(long)>
				while(zzsp.zzds() < i1 + i);
	//   28   75:aload_0         
	//   29   76:getfield        #31  <Field zzez zzsp>
	//   30   79:invokevirtual   #190 <Method int zzez.zzds()>
	//   31   82:iload_3         
	//   32   83:iload_2         
	//   33   84:iadd            
	//   34   85:icmplt          64
				return;
	//   35   88:return          

			case 1: // '\001'
				break;
			}
			int j;
			do
			{
				((zzgt) (list)).zzp(zzsp.zzcs());
	//   36   89:aload_1         
	//   37   90:aload_0         
	//   38   91:getfield        #31  <Field zzez zzsp>
	//   39   94:invokevirtual   #336 <Method long zzez.zzcs()>
	//   40   97:invokevirtual   #326 <Method void zzgt.zzp(long)>
				if(zzsp.zzcm())
	//*  41  100:aload_0         
	//*  42  101:getfield        #31  <Field zzez zzsp>
	//*  43  104:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  44  107:ifeq            111
					return;
	//   45  110:return          
				j = zzsp.zzdq();
	//   46  111:aload_0         
	//   47  112:getfield        #31  <Field zzez zzsp>
	//   48  115:invokevirtual   #162 <Method int zzez.zzdq()>
	//   49  118:istore_2        
			} while(j == tag);
	//   50  119:iload_2         
	//   51  120:aload_0         
	//   52  121:getfield        #150 <Field int tag>
	//   53  124:icmpeq          89
			zzsq = j;
	//   54  127:aload_0         
	//   55  128:iload_2         
	//   56  129:putfield        #19  <Field int zzsq>
			return;
	//   57  132:return          
		}
		switch(tag & 7)
	//*  58  133:aload_0         
	//*  59  134:getfield        #150 <Field int tag>
	//*  60  137:bipush          7
	//*  61  139:iand            
		{
	//*  62  140:tableswitch     1 2: default 164
	//	               1 219
	//	               2 168
		default:
			throw zzgf.zzfm();
	//   63  164:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   64  167:athrow          

		case 2: // '\002'
			int k = zzsp.zzcx();
	//   65  168:aload_0         
	//   66  169:getfield        #31  <Field zzez zzsp>
	//   67  172:invokevirtual   #196 <Method int zzez.zzcx()>
	//   68  175:istore_2        
			zzac(k);
	//   69  176:iload_2         
	//   70  177:invokestatic    #260 <Method void zzac(int)>
			int j1 = zzsp.zzds();
	//   71  180:aload_0         
	//   72  181:getfield        #31  <Field zzez zzsp>
	//   73  184:invokevirtual   #190 <Method int zzez.zzds()>
	//   74  187:istore_3        
			do
				list.add(((Object) (Long.valueOf(zzsp.zzcs()))));
	//   75  188:aload_1         
	//   76  189:aload_0         
	//   77  190:getfield        #31  <Field zzez zzsp>
	//   78  193:invokevirtual   #336 <Method long zzez.zzcs()>
	//   79  196:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   80  199:invokeinterface #171 <Method boolean List.add(Object)>
	//   81  204:pop             
			while(zzsp.zzds() < j1 + k);
	//   82  205:aload_0         
	//   83  206:getfield        #31  <Field zzez zzsp>
	//   84  209:invokevirtual   #190 <Method int zzez.zzds()>
	//   85  212:iload_3         
	//   86  213:iload_2         
	//   87  214:iadd            
	//   88  215:icmplt          188
			return;
	//   89  218:return          

		case 1: // '\001'
			break;
		}
		int l;
		do
		{
			list.add(((Object) (Long.valueOf(zzsp.zzcs()))));
	//   90  219:aload_1         
	//   91  220:aload_0         
	//   92  221:getfield        #31  <Field zzez zzsp>
	//   93  224:invokevirtual   #336 <Method long zzez.zzcs()>
	//   94  227:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   95  230:invokeinterface #171 <Method boolean List.add(Object)>
	//   96  235:pop             
			if(zzsp.zzcm())
	//*  97  236:aload_0         
	//*  98  237:getfield        #31  <Field zzez zzsp>
	//*  99  240:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//* 100  243:ifeq            247
				return;
	//  101  246:return          
			l = zzsp.zzdq();
	//  102  247:aload_0         
	//  103  248:getfield        #31  <Field zzez zzsp>
	//  104  251:invokevirtual   #162 <Method int zzez.zzdq()>
	//  105  254:istore_2        
		} while(l == tag);
	//  106  255:iload_2         
	//  107  256:aload_0         
	//  108  257:getfield        #150 <Field int tag>
	//  109  260:icmpeq          219
		zzsq = l;
	//  110  263:aload_0         
	//  111  264:iload_2         
	//  112  265:putfield        #19  <Field int zzsq>
	//  113  268:return          
	}

	public final void zzg(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #347 <Class zzfz>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #347 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 2)
	//*  11   20:iload_2         
	//*  12   21:iconst_2        
	//*  13   22:icmpeq          78
				if(i == 5)
	//*  14   25:iload_2         
	//*  15   26:iconst_5        
	//*  16   27:icmpne          74
				{
					do
					{
						((zzfz) (list)).zzbg(zzsp.zzct());
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:getfield        #31  <Field zzez zzsp>
	//   20   35:invokevirtual   #337 <Method int zzez.zzct()>
	//   21   38:invokevirtual   #350 <Method void zzfz.zzbg(int)>
						if(zzsp.zzcm())
	//*  22   41:aload_0         
	//*  23   42:getfield        #31  <Field zzez zzsp>
	//*  24   45:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  25   48:ifeq            52
							return;
	//   26   51:return          
						i = zzsp.zzdq();
	//   27   52:aload_0         
	//   28   53:getfield        #31  <Field zzez zzsp>
	//   29   56:invokevirtual   #162 <Method int zzez.zzdq()>
	//   30   59:istore_2        
					} while(i == tag);
	//   31   60:iload_2         
	//   32   61:aload_0         
	//   33   62:getfield        #150 <Field int tag>
	//   34   65:icmpeq          30
					zzsq = i;
	//   35   68:aload_0         
	//   36   69:iload_2         
	//   37   70:putfield        #19  <Field int zzsq>
					return;
	//   38   73:return          
				} else
				{
					throw zzgf.zzfm();
	//   39   74:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   40   77:athrow          
				}
			i = zzsp.zzcx();
	//   41   78:aload_0         
	//   42   79:getfield        #31  <Field zzez zzsp>
	//   43   82:invokevirtual   #196 <Method int zzez.zzcx()>
	//   44   85:istore_2        
			zzad(i);
	//   45   86:iload_2         
	//   46   87:invokestatic    #318 <Method void zzad(int)>
			int k = zzsp.zzds();
	//   47   90:aload_0         
	//   48   91:getfield        #31  <Field zzez zzsp>
	//   49   94:invokevirtual   #190 <Method int zzez.zzds()>
	//   50   97:istore_3        
			do
				((zzfz) (list)).zzbg(zzsp.zzct());
	//   51   98:aload_1         
	//   52   99:aload_0         
	//   53  100:getfield        #31  <Field zzez zzsp>
	//   54  103:invokevirtual   #337 <Method int zzez.zzct()>
	//   55  106:invokevirtual   #350 <Method void zzfz.zzbg(int)>
			while(zzsp.zzds() < k + i);
	//   56  109:aload_0         
	//   57  110:getfield        #31  <Field zzez zzsp>
	//   58  113:invokevirtual   #190 <Method int zzez.zzds()>
	//   59  116:iload_3         
	//   60  117:iload_2         
	//   61  118:iadd            
	//   62  119:icmplt          98
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #150 <Field int tag>
	//   66  127:bipush          7
	//   67  129:iand            
	//   68  130:istore_2        
		if(j != 2)
	//*  69  131:iload_2         
	//*  70  132:iconst_2        
	//*  71  133:icmpeq          195
			if(j == 5)
	//*  72  136:iload_2         
	//*  73  137:iconst_5        
	//*  74  138:icmpne          191
			{
				do
				{
					list.add(((Object) (Integer.valueOf(zzsp.zzct()))));
	//   75  141:aload_1         
	//   76  142:aload_0         
	//   77  143:getfield        #31  <Field zzez zzsp>
	//   78  146:invokevirtual   #337 <Method int zzez.zzct()>
	//   79  149:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   80  152:invokeinterface #171 <Method boolean List.add(Object)>
	//   81  157:pop             
					if(zzsp.zzcm())
	//*  82  158:aload_0         
	//*  83  159:getfield        #31  <Field zzez zzsp>
	//*  84  162:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  85  165:ifeq            169
						return;
	//   86  168:return          
					j = zzsp.zzdq();
	//   87  169:aload_0         
	//   88  170:getfield        #31  <Field zzez zzsp>
	//   89  173:invokevirtual   #162 <Method int zzez.zzdq()>
	//   90  176:istore_2        
				} while(j == tag);
	//   91  177:iload_2         
	//   92  178:aload_0         
	//   93  179:getfield        #150 <Field int tag>
	//   94  182:icmpeq          141
				zzsq = j;
	//   95  185:aload_0         
	//   96  186:iload_2         
	//   97  187:putfield        #19  <Field int zzsq>
				return;
	//   98  190:return          
			} else
			{
				throw zzgf.zzfm();
	//   99  191:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//  100  194:athrow          
			}
		j = zzsp.zzcx();
	//  101  195:aload_0         
	//  102  196:getfield        #31  <Field zzez zzsp>
	//  103  199:invokevirtual   #196 <Method int zzez.zzcx()>
	//  104  202:istore_2        
		zzad(j);
	//  105  203:iload_2         
	//  106  204:invokestatic    #318 <Method void zzad(int)>
		int l = zzsp.zzds();
	//  107  207:aload_0         
	//  108  208:getfield        #31  <Field zzez zzsp>
	//  109  211:invokevirtual   #190 <Method int zzez.zzds()>
	//  110  214:istore_3        
		do
			list.add(((Object) (Integer.valueOf(zzsp.zzct()))));
	//  111  215:aload_1         
	//  112  216:aload_0         
	//  113  217:getfield        #31  <Field zzez zzsp>
	//  114  220:invokevirtual   #337 <Method int zzez.zzct()>
	//  115  223:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  116  226:invokeinterface #171 <Method boolean List.add(Object)>
	//  117  231:pop             
		while(zzsp.zzds() < l + j);
	//  118  232:aload_0         
	//  119  233:getfield        #31  <Field zzez zzsp>
	//  120  236:invokevirtual   #190 <Method int zzez.zzds()>
	//  121  239:iload_3         
	//  122  240:iload_2         
	//  123  241:iadd            
	//  124  242:icmplt          215
	//  125  245:return          
	}

	public final void zzh(List list)
		throws IOException
	{
		if(list instanceof zzem)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #354 <Class zzem>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzem)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #354 <Class zzem>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            79
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          75
				{
					i = zzsp.zzcx();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zzez zzsp>
	//   18   33:invokevirtual   #196 <Method int zzez.zzcx()>
	//   19   36:istore_2        
					i = zzsp.zzds() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zzez zzsp>
	//   22   41:invokevirtual   #190 <Method int zzez.zzds()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzem) (list)).addBoolean(zzsp.zzcu());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zzez zzsp>
	//   29   52:invokevirtual   #338 <Method boolean zzez.zzcu()>
	//   30   55:invokevirtual   #358 <Method void zzem.addBoolean(boolean)>
					while(zzsp.zzds() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zzez zzsp>
	//   33   62:invokevirtual   #190 <Method int zzez.zzds()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzae(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #328 <Method void zzae(int)>
					return;
	//   39   74:return          
				} else
				{
					throw zzgf.zzfm();
	//   40   75:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   41   78:athrow          
				}
			do
			{
				((zzem) (list)).addBoolean(zzsp.zzcu());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zzez zzsp>
	//   45   84:invokevirtual   #338 <Method boolean zzez.zzcu()>
	//   46   87:invokevirtual   #358 <Method void zzem.addBoolean(boolean)>
				if(zzsp.zzcm())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zzez zzsp>
	//*  49   94:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzsp.zzdq();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zzez zzsp>
	//   54  105:invokevirtual   #162 <Method int zzez.zzdq()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #150 <Field int tag>
	//   59  114:icmpeq          79
			zzsq = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzsq>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #150 <Field int tag>
	//   66  127:bipush          7
	//   67  129:iand            
	//   68  130:istore_2        
		if(j != 0)
	//*  69  131:iload_2         
	//*  70  132:ifeq            196
			if(j == 2)
	//*  71  135:iload_2         
	//*  72  136:iconst_2        
	//*  73  137:icmpne          192
			{
				j = zzsp.zzcx();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zzez zzsp>
	//   76  144:invokevirtual   #196 <Method int zzez.zzcx()>
	//   77  147:istore_2        
				j = zzsp.zzds() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zzez zzsp>
	//   80  152:invokevirtual   #190 <Method int zzez.zzds()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Boolean.valueOf(zzsp.zzcu()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zzez zzsp>
	//   87  163:invokevirtual   #338 <Method boolean zzez.zzcu()>
	//   88  166:invokestatic    #144 <Method Boolean Boolean.valueOf(boolean)>
	//   89  169:invokeinterface #171 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzsp.zzds() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zzez zzsp>
	//   93  179:invokevirtual   #190 <Method int zzez.zzds()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzae(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #328 <Method void zzae(int)>
				return;
	//   99  191:return          
			} else
			{
				throw zzgf.zzfm();
	//  100  192:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Boolean.valueOf(zzsp.zzcu()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zzez zzsp>
	//  105  201:invokevirtual   #338 <Method boolean zzez.zzcu()>
	//  106  204:invokestatic    #144 <Method Boolean Boolean.valueOf(boolean)>
	//  107  207:invokeinterface #171 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzsp.zzcm())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zzez zzsp>
	//* 111  217:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzsp.zzdq();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zzez zzsp>
	//  116  228:invokevirtual   #162 <Method int zzez.zzdq()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #150 <Field int tag>
	//  121  237:icmpeq          196
		zzsq = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzsq>
	//  125  245:return          
	}

	public final void zzi(List list)
		throws IOException
	{
		zza(list, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #242 <Method void zza(List, boolean)>
	//    4    6:return          
	}

	public final void zzj(List list)
		throws IOException
	{
		if((tag & 7) == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field int tag>
	//*   2    4:bipush          7
	//*   3    6:iand            
	//*   4    7:iconst_2        
	//*   5    8:icmpne          55
		{
			int i;
			do
			{
				list.add(((Object) (zzcw())));
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #135 <Method zzeo zzcw()>
	//    9   16:invokeinterface #171 <Method boolean List.add(Object)>
	//   10   21:pop             
				if(zzsp.zzcm())
	//*  11   22:aload_0         
	//*  12   23:getfield        #31  <Field zzez zzsp>
	//*  13   26:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  14   29:ifeq            33
					return;
	//   15   32:return          
				i = zzsp.zzdq();
	//   16   33:aload_0         
	//   17   34:getfield        #31  <Field zzez zzsp>
	//   18   37:invokevirtual   #162 <Method int zzez.zzdq()>
	//   19   40:istore_2        
			} while(i == tag);
	//   20   41:iload_2         
	//   21   42:aload_0         
	//   22   43:getfield        #150 <Field int tag>
	//   23   46:icmpeq          11
			zzsq = i;
	//   24   49:aload_0         
	//   25   50:iload_2         
	//   26   51:putfield        #19  <Field int zzsq>
			return;
	//   27   54:return          
		} else
		{
			throw zzgf.zzfm();
	//   28   55:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   29   58:athrow          
		}
	}

	public final void zzk(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #347 <Class zzfz>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #347 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            79
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          75
				{
					i = zzsp.zzcx();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zzez zzsp>
	//   18   33:invokevirtual   #196 <Method int zzez.zzcx()>
	//   19   36:istore_2        
					i = zzsp.zzds() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zzez zzsp>
	//   22   41:invokevirtual   #190 <Method int zzez.zzds()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzfz) (list)).zzbg(zzsp.zzcx());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zzez zzsp>
	//   29   52:invokevirtual   #196 <Method int zzez.zzcx()>
	//   30   55:invokevirtual   #350 <Method void zzfz.zzbg(int)>
					while(zzsp.zzds() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zzez zzsp>
	//   33   62:invokevirtual   #190 <Method int zzez.zzds()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzae(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #328 <Method void zzae(int)>
					return;
	//   39   74:return          
				} else
				{
					throw zzgf.zzfm();
	//   40   75:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   41   78:athrow          
				}
			do
			{
				((zzfz) (list)).zzbg(zzsp.zzcx());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zzez zzsp>
	//   45   84:invokevirtual   #196 <Method int zzez.zzcx()>
	//   46   87:invokevirtual   #350 <Method void zzfz.zzbg(int)>
				if(zzsp.zzcm())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zzez zzsp>
	//*  49   94:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzsp.zzdq();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zzez zzsp>
	//   54  105:invokevirtual   #162 <Method int zzez.zzdq()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #150 <Field int tag>
	//   59  114:icmpeq          79
			zzsq = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzsq>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #150 <Field int tag>
	//   66  127:bipush          7
	//   67  129:iand            
	//   68  130:istore_2        
		if(j != 0)
	//*  69  131:iload_2         
	//*  70  132:ifeq            196
			if(j == 2)
	//*  71  135:iload_2         
	//*  72  136:iconst_2        
	//*  73  137:icmpne          192
			{
				j = zzsp.zzcx();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zzez zzsp>
	//   76  144:invokevirtual   #196 <Method int zzez.zzcx()>
	//   77  147:istore_2        
				j = zzsp.zzds() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zzez zzsp>
	//   80  152:invokevirtual   #190 <Method int zzez.zzds()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Integer.valueOf(zzsp.zzcx()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zzez zzsp>
	//   87  163:invokevirtual   #196 <Method int zzez.zzcx()>
	//   88  166:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   89  169:invokeinterface #171 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzsp.zzds() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zzez zzsp>
	//   93  179:invokevirtual   #190 <Method int zzez.zzds()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzae(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #328 <Method void zzae(int)>
				return;
	//   99  191:return          
			} else
			{
				throw zzgf.zzfm();
	//  100  192:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzsp.zzcx()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zzez zzsp>
	//  105  201:invokevirtual   #196 <Method int zzez.zzcx()>
	//  106  204:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  107  207:invokeinterface #171 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzsp.zzcm())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zzez zzsp>
	//* 111  217:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzsp.zzdq();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zzez zzsp>
	//  116  228:invokevirtual   #162 <Method int zzez.zzdq()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #150 <Field int tag>
	//  121  237:icmpeq          196
		zzsq = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzsq>
	//  125  245:return          
	}

	public final void zzl(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #347 <Class zzfz>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #347 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            79
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          75
				{
					i = zzsp.zzcx();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zzez zzsp>
	//   18   33:invokevirtual   #196 <Method int zzez.zzcx()>
	//   19   36:istore_2        
					i = zzsp.zzds() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zzez zzsp>
	//   22   41:invokevirtual   #190 <Method int zzez.zzds()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzfz) (list)).zzbg(zzsp.zzcy());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zzez zzsp>
	//   29   52:invokevirtual   #341 <Method int zzez.zzcy()>
	//   30   55:invokevirtual   #350 <Method void zzfz.zzbg(int)>
					while(zzsp.zzds() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zzez zzsp>
	//   33   62:invokevirtual   #190 <Method int zzez.zzds()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzae(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #328 <Method void zzae(int)>
					return;
	//   39   74:return          
				} else
				{
					throw zzgf.zzfm();
	//   40   75:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   41   78:athrow          
				}
			do
			{
				((zzfz) (list)).zzbg(zzsp.zzcy());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zzez zzsp>
	//   45   84:invokevirtual   #341 <Method int zzez.zzcy()>
	//   46   87:invokevirtual   #350 <Method void zzfz.zzbg(int)>
				if(zzsp.zzcm())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zzez zzsp>
	//*  49   94:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzsp.zzdq();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zzez zzsp>
	//   54  105:invokevirtual   #162 <Method int zzez.zzdq()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #150 <Field int tag>
	//   59  114:icmpeq          79
			zzsq = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzsq>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #150 <Field int tag>
	//   66  127:bipush          7
	//   67  129:iand            
	//   68  130:istore_2        
		if(j != 0)
	//*  69  131:iload_2         
	//*  70  132:ifeq            196
			if(j == 2)
	//*  71  135:iload_2         
	//*  72  136:iconst_2        
	//*  73  137:icmpne          192
			{
				j = zzsp.zzcx();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zzez zzsp>
	//   76  144:invokevirtual   #196 <Method int zzez.zzcx()>
	//   77  147:istore_2        
				j = zzsp.zzds() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zzez zzsp>
	//   80  152:invokevirtual   #190 <Method int zzez.zzds()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Integer.valueOf(zzsp.zzcy()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zzez zzsp>
	//   87  163:invokevirtual   #341 <Method int zzez.zzcy()>
	//   88  166:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   89  169:invokeinterface #171 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzsp.zzds() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zzez zzsp>
	//   93  179:invokevirtual   #190 <Method int zzez.zzds()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzae(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #328 <Method void zzae(int)>
				return;
	//   99  191:return          
			} else
			{
				throw zzgf.zzfm();
	//  100  192:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzsp.zzcy()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zzez zzsp>
	//  105  201:invokevirtual   #341 <Method int zzez.zzcy()>
	//  106  204:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  107  207:invokeinterface #171 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzsp.zzcm())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zzez zzsp>
	//* 111  217:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzsp.zzdq();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zzez zzsp>
	//  116  228:invokevirtual   #162 <Method int zzez.zzdq()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #150 <Field int tag>
	//  121  237:icmpeq          196
		zzsq = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzsq>
	//  125  245:return          
	}

	public final void zzm(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #347 <Class zzfz>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #347 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 2)
	//*  11   20:iload_2         
	//*  12   21:iconst_2        
	//*  13   22:icmpeq          78
				if(i == 5)
	//*  14   25:iload_2         
	//*  15   26:iconst_5        
	//*  16   27:icmpne          74
				{
					do
					{
						((zzfz) (list)).zzbg(zzsp.zzcz());
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:getfield        #31  <Field zzez zzsp>
	//   20   35:invokevirtual   #342 <Method int zzez.zzcz()>
	//   21   38:invokevirtual   #350 <Method void zzfz.zzbg(int)>
						if(zzsp.zzcm())
	//*  22   41:aload_0         
	//*  23   42:getfield        #31  <Field zzez zzsp>
	//*  24   45:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  25   48:ifeq            52
							return;
	//   26   51:return          
						i = zzsp.zzdq();
	//   27   52:aload_0         
	//   28   53:getfield        #31  <Field zzez zzsp>
	//   29   56:invokevirtual   #162 <Method int zzez.zzdq()>
	//   30   59:istore_2        
					} while(i == tag);
	//   31   60:iload_2         
	//   32   61:aload_0         
	//   33   62:getfield        #150 <Field int tag>
	//   34   65:icmpeq          30
					zzsq = i;
	//   35   68:aload_0         
	//   36   69:iload_2         
	//   37   70:putfield        #19  <Field int zzsq>
					return;
	//   38   73:return          
				} else
				{
					throw zzgf.zzfm();
	//   39   74:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   40   77:athrow          
				}
			i = zzsp.zzcx();
	//   41   78:aload_0         
	//   42   79:getfield        #31  <Field zzez zzsp>
	//   43   82:invokevirtual   #196 <Method int zzez.zzcx()>
	//   44   85:istore_2        
			zzad(i);
	//   45   86:iload_2         
	//   46   87:invokestatic    #318 <Method void zzad(int)>
			int k = zzsp.zzds();
	//   47   90:aload_0         
	//   48   91:getfield        #31  <Field zzez zzsp>
	//   49   94:invokevirtual   #190 <Method int zzez.zzds()>
	//   50   97:istore_3        
			do
				((zzfz) (list)).zzbg(zzsp.zzcz());
	//   51   98:aload_1         
	//   52   99:aload_0         
	//   53  100:getfield        #31  <Field zzez zzsp>
	//   54  103:invokevirtual   #342 <Method int zzez.zzcz()>
	//   55  106:invokevirtual   #350 <Method void zzfz.zzbg(int)>
			while(zzsp.zzds() < k + i);
	//   56  109:aload_0         
	//   57  110:getfield        #31  <Field zzez zzsp>
	//   58  113:invokevirtual   #190 <Method int zzez.zzds()>
	//   59  116:iload_3         
	//   60  117:iload_2         
	//   61  118:iadd            
	//   62  119:icmplt          98
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #150 <Field int tag>
	//   66  127:bipush          7
	//   67  129:iand            
	//   68  130:istore_2        
		if(j != 2)
	//*  69  131:iload_2         
	//*  70  132:iconst_2        
	//*  71  133:icmpeq          195
			if(j == 5)
	//*  72  136:iload_2         
	//*  73  137:iconst_5        
	//*  74  138:icmpne          191
			{
				do
				{
					list.add(((Object) (Integer.valueOf(zzsp.zzcz()))));
	//   75  141:aload_1         
	//   76  142:aload_0         
	//   77  143:getfield        #31  <Field zzez zzsp>
	//   78  146:invokevirtual   #342 <Method int zzez.zzcz()>
	//   79  149:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   80  152:invokeinterface #171 <Method boolean List.add(Object)>
	//   81  157:pop             
					if(zzsp.zzcm())
	//*  82  158:aload_0         
	//*  83  159:getfield        #31  <Field zzez zzsp>
	//*  84  162:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  85  165:ifeq            169
						return;
	//   86  168:return          
					j = zzsp.zzdq();
	//   87  169:aload_0         
	//   88  170:getfield        #31  <Field zzez zzsp>
	//   89  173:invokevirtual   #162 <Method int zzez.zzdq()>
	//   90  176:istore_2        
				} while(j == tag);
	//   91  177:iload_2         
	//   92  178:aload_0         
	//   93  179:getfield        #150 <Field int tag>
	//   94  182:icmpeq          141
				zzsq = j;
	//   95  185:aload_0         
	//   96  186:iload_2         
	//   97  187:putfield        #19  <Field int zzsq>
				return;
	//   98  190:return          
			} else
			{
				throw zzgf.zzfm();
	//   99  191:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//  100  194:athrow          
			}
		j = zzsp.zzcx();
	//  101  195:aload_0         
	//  102  196:getfield        #31  <Field zzez zzsp>
	//  103  199:invokevirtual   #196 <Method int zzez.zzcx()>
	//  104  202:istore_2        
		zzad(j);
	//  105  203:iload_2         
	//  106  204:invokestatic    #318 <Method void zzad(int)>
		int l = zzsp.zzds();
	//  107  207:aload_0         
	//  108  208:getfield        #31  <Field zzez zzsp>
	//  109  211:invokevirtual   #190 <Method int zzez.zzds()>
	//  110  214:istore_3        
		do
			list.add(((Object) (Integer.valueOf(zzsp.zzcz()))));
	//  111  215:aload_1         
	//  112  216:aload_0         
	//  113  217:getfield        #31  <Field zzez zzsp>
	//  114  220:invokevirtual   #342 <Method int zzez.zzcz()>
	//  115  223:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  116  226:invokeinterface #171 <Method boolean List.add(Object)>
	//  117  231:pop             
		while(zzsp.zzds() < l + j);
	//  118  232:aload_0         
	//  119  233:getfield        #31  <Field zzez zzsp>
	//  120  236:invokevirtual   #190 <Method int zzez.zzds()>
	//  121  239:iload_3         
	//  122  240:iload_2         
	//  123  241:iadd            
	//  124  242:icmplt          215
	//  125  245:return          
	}

	public final void zzn(List list)
		throws IOException
	{
		if(list instanceof zzgt)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #321 <Class zzgt>
	//*   2    4:ifeq            133
		{
			list = ((List) ((zzgt)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #321 <Class zzgt>
	//    5   11:astore_1        
			switch(tag & 7)
	//*   6   12:aload_0         
	//*   7   13:getfield        #150 <Field int tag>
	//*   8   16:bipush          7
	//*   9   18:iand            
			{
	//*  10   19:tableswitch     1 2: default 40
	//	               1 89
	//	               2 44
			default:
				throw zzgf.zzfm();
	//   11   40:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   12   43:athrow          

			case 2: // '\002'
				int i = zzsp.zzcx();
	//   13   44:aload_0         
	//   14   45:getfield        #31  <Field zzez zzsp>
	//   15   48:invokevirtual   #196 <Method int zzez.zzcx()>
	//   16   51:istore_2        
				zzac(i);
	//   17   52:iload_2         
	//   18   53:invokestatic    #260 <Method void zzac(int)>
				int i1 = zzsp.zzds();
	//   19   56:aload_0         
	//   20   57:getfield        #31  <Field zzez zzsp>
	//   21   60:invokevirtual   #190 <Method int zzez.zzds()>
	//   22   63:istore_3        
				do
					((zzgt) (list)).zzp(zzsp.zzda());
	//   23   64:aload_1         
	//   24   65:aload_0         
	//   25   66:getfield        #31  <Field zzez zzsp>
	//   26   69:invokevirtual   #343 <Method long zzez.zzda()>
	//   27   72:invokevirtual   #326 <Method void zzgt.zzp(long)>
				while(zzsp.zzds() < i1 + i);
	//   28   75:aload_0         
	//   29   76:getfield        #31  <Field zzez zzsp>
	//   30   79:invokevirtual   #190 <Method int zzez.zzds()>
	//   31   82:iload_3         
	//   32   83:iload_2         
	//   33   84:iadd            
	//   34   85:icmplt          64
				return;
	//   35   88:return          

			case 1: // '\001'
				break;
			}
			int j;
			do
			{
				((zzgt) (list)).zzp(zzsp.zzda());
	//   36   89:aload_1         
	//   37   90:aload_0         
	//   38   91:getfield        #31  <Field zzez zzsp>
	//   39   94:invokevirtual   #343 <Method long zzez.zzda()>
	//   40   97:invokevirtual   #326 <Method void zzgt.zzp(long)>
				if(zzsp.zzcm())
	//*  41  100:aload_0         
	//*  42  101:getfield        #31  <Field zzez zzsp>
	//*  43  104:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  44  107:ifeq            111
					return;
	//   45  110:return          
				j = zzsp.zzdq();
	//   46  111:aload_0         
	//   47  112:getfield        #31  <Field zzez zzsp>
	//   48  115:invokevirtual   #162 <Method int zzez.zzdq()>
	//   49  118:istore_2        
			} while(j == tag);
	//   50  119:iload_2         
	//   51  120:aload_0         
	//   52  121:getfield        #150 <Field int tag>
	//   53  124:icmpeq          89
			zzsq = j;
	//   54  127:aload_0         
	//   55  128:iload_2         
	//   56  129:putfield        #19  <Field int zzsq>
			return;
	//   57  132:return          
		}
		switch(tag & 7)
	//*  58  133:aload_0         
	//*  59  134:getfield        #150 <Field int tag>
	//*  60  137:bipush          7
	//*  61  139:iand            
		{
	//*  62  140:tableswitch     1 2: default 164
	//	               1 219
	//	               2 168
		default:
			throw zzgf.zzfm();
	//   63  164:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   64  167:athrow          

		case 2: // '\002'
			int k = zzsp.zzcx();
	//   65  168:aload_0         
	//   66  169:getfield        #31  <Field zzez zzsp>
	//   67  172:invokevirtual   #196 <Method int zzez.zzcx()>
	//   68  175:istore_2        
			zzac(k);
	//   69  176:iload_2         
	//   70  177:invokestatic    #260 <Method void zzac(int)>
			int j1 = zzsp.zzds();
	//   71  180:aload_0         
	//   72  181:getfield        #31  <Field zzez zzsp>
	//   73  184:invokevirtual   #190 <Method int zzez.zzds()>
	//   74  187:istore_3        
			do
				list.add(((Object) (Long.valueOf(zzsp.zzda()))));
	//   75  188:aload_1         
	//   76  189:aload_0         
	//   77  190:getfield        #31  <Field zzez zzsp>
	//   78  193:invokevirtual   #343 <Method long zzez.zzda()>
	//   79  196:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   80  199:invokeinterface #171 <Method boolean List.add(Object)>
	//   81  204:pop             
			while(zzsp.zzds() < j1 + k);
	//   82  205:aload_0         
	//   83  206:getfield        #31  <Field zzez zzsp>
	//   84  209:invokevirtual   #190 <Method int zzez.zzds()>
	//   85  212:iload_3         
	//   86  213:iload_2         
	//   87  214:iadd            
	//   88  215:icmplt          188
			return;
	//   89  218:return          

		case 1: // '\001'
			break;
		}
		int l;
		do
		{
			list.add(((Object) (Long.valueOf(zzsp.zzda()))));
	//   90  219:aload_1         
	//   91  220:aload_0         
	//   92  221:getfield        #31  <Field zzez zzsp>
	//   93  224:invokevirtual   #343 <Method long zzez.zzda()>
	//   94  227:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   95  230:invokeinterface #171 <Method boolean List.add(Object)>
	//   96  235:pop             
			if(zzsp.zzcm())
	//*  97  236:aload_0         
	//*  98  237:getfield        #31  <Field zzez zzsp>
	//*  99  240:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//* 100  243:ifeq            247
				return;
	//  101  246:return          
			l = zzsp.zzdq();
	//  102  247:aload_0         
	//  103  248:getfield        #31  <Field zzez zzsp>
	//  104  251:invokevirtual   #162 <Method int zzez.zzdq()>
	//  105  254:istore_2        
		} while(l == tag);
	//  106  255:iload_2         
	//  107  256:aload_0         
	//  108  257:getfield        #150 <Field int tag>
	//  109  260:icmpeq          219
		zzsq = l;
	//  110  263:aload_0         
	//  111  264:iload_2         
	//  112  265:putfield        #19  <Field int zzsq>
	//  113  268:return          
	}

	public final void zzo(List list)
		throws IOException
	{
		if(list instanceof zzfz)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #347 <Class zzfz>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzfz)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #347 <Class zzfz>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            79
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          75
				{
					i = zzsp.zzcx();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zzez zzsp>
	//   18   33:invokevirtual   #196 <Method int zzez.zzcx()>
	//   19   36:istore_2        
					i = zzsp.zzds() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zzez zzsp>
	//   22   41:invokevirtual   #190 <Method int zzez.zzds()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzfz) (list)).zzbg(zzsp.zzdb());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zzez zzsp>
	//   29   52:invokevirtual   #344 <Method int zzez.zzdb()>
	//   30   55:invokevirtual   #350 <Method void zzfz.zzbg(int)>
					while(zzsp.zzds() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zzez zzsp>
	//   33   62:invokevirtual   #190 <Method int zzez.zzds()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzae(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #328 <Method void zzae(int)>
					return;
	//   39   74:return          
				} else
				{
					throw zzgf.zzfm();
	//   40   75:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   41   78:athrow          
				}
			do
			{
				((zzfz) (list)).zzbg(zzsp.zzdb());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zzez zzsp>
	//   45   84:invokevirtual   #344 <Method int zzez.zzdb()>
	//   46   87:invokevirtual   #350 <Method void zzfz.zzbg(int)>
				if(zzsp.zzcm())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zzez zzsp>
	//*  49   94:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzsp.zzdq();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zzez zzsp>
	//   54  105:invokevirtual   #162 <Method int zzez.zzdq()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #150 <Field int tag>
	//   59  114:icmpeq          79
			zzsq = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzsq>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #150 <Field int tag>
	//   66  127:bipush          7
	//   67  129:iand            
	//   68  130:istore_2        
		if(j != 0)
	//*  69  131:iload_2         
	//*  70  132:ifeq            196
			if(j == 2)
	//*  71  135:iload_2         
	//*  72  136:iconst_2        
	//*  73  137:icmpne          192
			{
				j = zzsp.zzcx();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zzez zzsp>
	//   76  144:invokevirtual   #196 <Method int zzez.zzcx()>
	//   77  147:istore_2        
				j = zzsp.zzds() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zzez zzsp>
	//   80  152:invokevirtual   #190 <Method int zzez.zzds()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Integer.valueOf(zzsp.zzdb()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zzez zzsp>
	//   87  163:invokevirtual   #344 <Method int zzez.zzdb()>
	//   88  166:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   89  169:invokeinterface #171 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzsp.zzds() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zzez zzsp>
	//   93  179:invokevirtual   #190 <Method int zzez.zzds()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzae(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #328 <Method void zzae(int)>
				return;
	//   99  191:return          
			} else
			{
				throw zzgf.zzfm();
	//  100  192:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzsp.zzdb()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zzez zzsp>
	//  105  201:invokevirtual   #344 <Method int zzez.zzdb()>
	//  106  204:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  107  207:invokeinterface #171 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzsp.zzcm())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zzez zzsp>
	//* 111  217:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzsp.zzdq();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zzez zzsp>
	//  116  228:invokevirtual   #162 <Method int zzez.zzdq()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #150 <Field int tag>
	//  121  237:icmpeq          196
		zzsq = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzsq>
	//  125  245:return          
	}

	public final void zzp(List list)
		throws IOException
	{
		if(list instanceof zzgt)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #321 <Class zzgt>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzgt)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #321 <Class zzgt>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field int tag>
	//    8   16:bipush          7
	//    9   18:iand            
	//   10   19:istore_2        
			if(i != 0)
	//*  11   20:iload_2         
	//*  12   21:ifeq            79
				if(i == 2)
	//*  13   24:iload_2         
	//*  14   25:iconst_2        
	//*  15   26:icmpne          75
				{
					i = zzsp.zzcx();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zzez zzsp>
	//   18   33:invokevirtual   #196 <Method int zzez.zzcx()>
	//   19   36:istore_2        
					i = zzsp.zzds() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zzez zzsp>
	//   22   41:invokevirtual   #190 <Method int zzez.zzds()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzgt) (list)).zzp(zzsp.zzdc());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zzez zzsp>
	//   29   52:invokevirtual   #345 <Method long zzez.zzdc()>
	//   30   55:invokevirtual   #326 <Method void zzgt.zzp(long)>
					while(zzsp.zzds() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zzez zzsp>
	//   33   62:invokevirtual   #190 <Method int zzez.zzds()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzae(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #328 <Method void zzae(int)>
					return;
	//   39   74:return          
				} else
				{
					throw zzgf.zzfm();
	//   40   75:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//   41   78:athrow          
				}
			do
			{
				((zzgt) (list)).zzp(zzsp.zzdc());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zzez zzsp>
	//   45   84:invokevirtual   #345 <Method long zzez.zzdc()>
	//   46   87:invokevirtual   #326 <Method void zzgt.zzp(long)>
				if(zzsp.zzcm())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zzez zzsp>
	//*  49   94:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzsp.zzdq();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zzez zzsp>
	//   54  105:invokevirtual   #162 <Method int zzez.zzdq()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #150 <Field int tag>
	//   59  114:icmpeq          79
			zzsq = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzsq>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #150 <Field int tag>
	//   66  127:bipush          7
	//   67  129:iand            
	//   68  130:istore_2        
		if(j != 0)
	//*  69  131:iload_2         
	//*  70  132:ifeq            196
			if(j == 2)
	//*  71  135:iload_2         
	//*  72  136:iconst_2        
	//*  73  137:icmpne          192
			{
				j = zzsp.zzcx();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zzez zzsp>
	//   76  144:invokevirtual   #196 <Method int zzez.zzcx()>
	//   77  147:istore_2        
				j = zzsp.zzds() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zzez zzsp>
	//   80  152:invokevirtual   #190 <Method int zzez.zzds()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Long.valueOf(zzsp.zzdc()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zzez zzsp>
	//   87  163:invokevirtual   #345 <Method long zzez.zzdc()>
	//   88  166:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   89  169:invokeinterface #171 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzsp.zzds() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zzez zzsp>
	//   93  179:invokevirtual   #190 <Method int zzez.zzds()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzae(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #328 <Method void zzae(int)>
				return;
	//   99  191:return          
			} else
			{
				throw zzgf.zzfm();
	//  100  192:invokestatic    #177 <Method zzgg zzgf.zzfm()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Long.valueOf(zzsp.zzdc()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zzez zzsp>
	//  105  201:invokevirtual   #345 <Method long zzez.zzdc()>
	//  106  204:invokestatic    #71  <Method Long Long.valueOf(long)>
	//  107  207:invokeinterface #171 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzsp.zzcm())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zzez zzsp>
	//* 111  217:invokevirtual   #159 <Method boolean zzez.zzcm()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzsp.zzdq();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zzez zzsp>
	//  116  228:invokevirtual   #162 <Method int zzez.zzdq()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #150 <Field int tag>
	//  121  237:icmpeq          196
		zzsq = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzsq>
	//  125  245:return          
	}

	private int tag;
	private int zzru;
	private final zzez zzsp;
	private int zzsq;
}
