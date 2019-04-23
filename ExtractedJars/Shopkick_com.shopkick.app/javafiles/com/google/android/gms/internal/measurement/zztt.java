// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwk, zzuq, zztq, zztu, 
//			zzxs, zzwh, zzve, zzuv, 
//			zzwl, zzuw, zzvo, zzty, 
//			zzul, zzvj, zzup, zztc, 
//			zzub, zzte

final class zztt
	implements zzwk
{

	private zztt(zztq zztq1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzbuk = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field int zzbuk>
		zzbui = (zztq)com.google.android.gms.internal.measurement.zzuq.zza(((Object) (zztq1)), "input");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #21  <String "input">
	//    8   13:invokestatic    #27  <Method Object zzuq.zza(Object, String)>
	//    9   16:checkcast       #29  <Class zztq>
	//   10   19:putfield        #31  <Field zztq zzbui>
		zzbui.zzbub = this;
	//   11   22:aload_0         
	//   12   23:getfield        #31  <Field zztq zzbui>
	//   13   26:aload_0         
	//   14   27:putfield        #35  <Field zztt zztq.zzbub>
	//   15   30:return          
	}

	public static zztt zza(zztq zztq1)
	{
		if(zztq1.zzbub != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field zztt zztq.zzbub>
	//*   2    4:ifnull          12
			return zztq1.zzbub;
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field zztt zztq.zzbub>
	//    5   11:areturn         
		else
			return new zztt(zztq1);
	//    6   12:new             #2   <Class zztt>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #39  <Method void zztt(zztq)>
	//   10   20:areturn         
	}

	private final Object zza(zzxs zzxs1, Class class1, zzub zzub)
		throws IOException
	{
		switch(zztu.zzbul[zzxs1.ordinal()])
	//*   0    0:getstatic       #48  <Field int[] zztu.zzbul>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #54  <Method int zzxs.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 17: default 92
	//	               1 234
	//	               2 229
	//	               3 221
	//	               4 213
	//	               5 205
	//	               6 197
	//	               7 189
	//	               8 181
	//	               9 173
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
			return ((Object) (Long.valueOf(zzuk())));
	//   10  102:aload_0         
	//   11  103:invokevirtual   #65  <Method long zzuk()>
	//   12  106:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   13  109:areturn         

		case 16: // '\020'
			return ((Object) (Integer.valueOf(zzus())));
	//   14  110:aload_0         
	//   15  111:invokevirtual   #74  <Method int zzus()>
	//   16  114:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   17  117:areturn         

		case 15: // '\017'
			return ((Object) (zzuq()));
	//   18  118:aload_0         
	//   19  119:invokevirtual   #83  <Method String zzuq()>
	//   20  122:areturn         

		case 14: // '\016'
			return ((Object) (Long.valueOf(zzux())));
	//   21  123:aload_0         
	//   22  124:invokevirtual   #86  <Method long zzux()>
	//   23  127:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   24  130:areturn         

		case 13: // '\r'
			return ((Object) (Integer.valueOf(zzuw())));
	//   25  131:aload_0         
	//   26  132:invokevirtual   #89  <Method int zzuw()>
	//   27  135:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   28  138:areturn         

		case 12: // '\f'
			return ((Object) (Long.valueOf(zzuv())));
	//   29  139:aload_0         
	//   30  140:invokevirtual   #92  <Method long zzuv()>
	//   31  143:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   32  146:areturn         

		case 11: // '\013'
			return ((Object) (Integer.valueOf(zzuu())));
	//   33  147:aload_0         
	//   34  148:invokevirtual   #95  <Method int zzuu()>
	//   35  151:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   36  154:areturn         

		case 10: // '\n'
			zzav(2);
	//   37  155:aload_0         
	//   38  156:iconst_2        
	//   39  157:invokespecial   #99  <Method void zzav(int)>
			return zzc(zzwh.zzxt().zzi(class1), zzub);
	//   40  160:aload_0         
	//   41  161:invokestatic    #105 <Method zzwh zzwh.zzxt()>
	//   42  164:aload_2         
	//   43  165:invokevirtual   #109 <Method zzwl zzwh.zzi(Class)>
	//   44  168:aload_3         
	//   45  169:invokespecial   #113 <Method Object zzc(zzwl, zzub)>
	//   46  172:areturn         

		case 9: // '\t'
			return ((Object) (Long.valueOf(zzul())));
	//   47  173:aload_0         
	//   48  174:invokevirtual   #116 <Method long zzul()>
	//   49  177:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   50  180:areturn         

		case 8: // '\b'
			return ((Object) (Integer.valueOf(zzum())));
	//   51  181:aload_0         
	//   52  182:invokevirtual   #119 <Method int zzum()>
	//   53  185:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   54  188:areturn         

		case 7: // '\007'
			return ((Object) (Float.valueOf(readFloat())));
	//   55  189:aload_0         
	//   56  190:invokevirtual   #123 <Method float readFloat()>
	//   57  193:invokestatic    #128 <Method Float Float.valueOf(float)>
	//   58  196:areturn         

		case 6: // '\006'
			return ((Object) (Long.valueOf(zzun())));
	//   59  197:aload_0         
	//   60  198:invokevirtual   #131 <Method long zzun()>
	//   61  201:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   62  204:areturn         

		case 5: // '\005'
			return ((Object) (Integer.valueOf(zzuo())));
	//   63  205:aload_0         
	//   64  206:invokevirtual   #134 <Method int zzuo()>
	//   65  209:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   66  212:areturn         

		case 4: // '\004'
			return ((Object) (Integer.valueOf(zzut())));
	//   67  213:aload_0         
	//   68  214:invokevirtual   #137 <Method int zzut()>
	//   69  217:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   70  220:areturn         

		case 3: // '\003'
			return ((Object) (Double.valueOf(readDouble())));
	//   71  221:aload_0         
	//   72  222:invokevirtual   #141 <Method double readDouble()>
	//   73  225:invokestatic    #146 <Method Double Double.valueOf(double)>
	//   74  228:areturn         

		case 2: // '\002'
			return ((Object) (zzur()));
	//   75  229:aload_0         
	//   76  230:invokevirtual   #150 <Method zzte zzur()>
	//   77  233:areturn         

		case 1: // '\001'
			return ((Object) (Boolean.valueOf(zzup())));
	//   78  234:aload_0         
	//   79  235:invokevirtual   #154 <Method boolean zzup()>
	//   80  238:invokestatic    #159 <Method Boolean Boolean.valueOf(boolean)>
	//   81  241:areturn         
		}
	}

	private final void zza(List list, boolean flag)
		throws IOException
	{
		if((tag & 7) == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field int tag>
	//*   2    4:bipush          7
	//*   3    6:iand            
	//*   4    7:iconst_2        
	//*   5    8:icmpne          131
		{
			if((list instanceof zzve) && !flag)
	//*   6   11:aload_1         
	//*   7   12:instanceof      #167 <Class zzve>
	//*   8   15:ifeq            70
	//*   9   18:iload_2         
	//*  10   19:ifne            70
			{
				list = ((List) ((zzve)list));
	//   11   22:aload_1         
	//   12   23:checkcast       #167 <Class zzve>
	//   13   26:astore_1        
				int i;
				do
				{
					((zzve) (list)).zzc(zzur());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #150 <Method zzte zzur()>
	//   17   32:invokeinterface #170 <Method void zzve.zzc(zzte)>
					if(zzbui.zzuz())
	//*  18   37:aload_0         
	//*  19   38:getfield        #31  <Field zztq zzbui>
	//*  20   41:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  21   44:ifeq            48
						return;
	//   22   47:return          
					i = zzbui.zzuj();
	//   23   48:aload_0         
	//   24   49:getfield        #31  <Field zztq zzbui>
	//   25   52:invokevirtual   #176 <Method int zztq.zzuj()>
	//   26   55:istore_3        
				} while(i == tag);
	//   27   56:iload_3         
	//   28   57:aload_0         
	//   29   58:getfield        #165 <Field int tag>
	//   30   61:icmpeq          27
				zzbuk = i;
	//   31   64:aload_0         
	//   32   65:iload_3         
	//   33   66:putfield        #19  <Field int zzbuk>
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
					s = zzuq();
	//   37   74:aload_0         
	//   38   75:invokevirtual   #83  <Method String zzuq()>
	//   39   78:astore          4
				else
	//*  40   80:goto            89
					s = readString();
	//   41   83:aload_0         
	//   42   84:invokevirtual   #179 <Method String readString()>
	//   43   87:astore          4
				list.add(((Object) (s)));
	//   44   89:aload_1         
	//   45   90:aload           4
	//   46   92:invokeinterface #185 <Method boolean List.add(Object)>
	//   47   97:pop             
				if(zzbui.zzuz())
	//*  48   98:aload_0         
	//*  49   99:getfield        #31  <Field zztq zzbui>
	//*  50  102:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  51  105:ifeq            109
					return;
	//   52  108:return          
				j = zzbui.zzuj();
	//   53  109:aload_0         
	//   54  110:getfield        #31  <Field zztq zzbui>
	//   55  113:invokevirtual   #176 <Method int zztq.zzuj()>
	//   56  116:istore_3        
			} while(j == tag);
	//   57  117:iload_3         
	//   58  118:aload_0         
	//   59  119:getfield        #165 <Field int tag>
	//   60  122:icmpeq          70
			zzbuk = j;
	//   61  125:aload_0         
	//   62  126:iload_3         
	//   63  127:putfield        #19  <Field int zzbuk>
			return;
	//   64  130:return          
		} else
		{
			throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   65  131:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   66  134:athrow          
		}
	}

	private final void zzav(int i)
		throws IOException
	{
		if((tag & 7) == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field int tag>
	//*   2    4:bipush          7
	//*   3    6:iand            
	//*   4    7:iload_1         
	//*   5    8:icmpne          12
			return;
	//    6   11:return          
		else
			throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//    7   12:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//    8   15:athrow          
	}

	private static void zzaw(int i)
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
			throw com.google.android.gms.internal.measurement.zzuv.zzww();
	//    5    8:invokestatic    #197 <Method zzuv zzuv.zzww()>
	//    6   11:athrow          
	}

	private static void zzax(int i)
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
			throw com.google.android.gms.internal.measurement.zzuv.zzww();
	//    5    7:invokestatic    #197 <Method zzuv zzuv.zzww()>
	//    6   10:athrow          
	}

	private final void zzay(int i)
		throws IOException
	{
		if(zzbui.zzva() == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field zztq zzbui>
	//*   2    4:invokevirtual   #202 <Method int zztq.zzva()>
	//*   3    7:iload_1         
	//*   4    8:icmpne          12
			return;
	//    5   11:return          
		else
			throw com.google.android.gms.internal.measurement.zzuv.zzwq();
	//    6   12:invokestatic    #205 <Method zzuv zzuv.zzwq()>
	//    7   15:athrow          
	}

	private final Object zzc(zzwl zzwl1, zzub zzub)
		throws IOException
	{
		int i = zzbui.zzus();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zztq zzbui>
	//    2    4:invokevirtual   #206 <Method int zztq.zzus()>
	//    3    7:istore_3        
		if(zzbui.zzbty < zzbui.zzbtz)
	//*   4    8:aload_0         
	//*   5    9:getfield        #31  <Field zztq zzbui>
	//*   6   12:getfield        #209 <Field int zztq.zzbty>
	//*   7   15:aload_0         
	//*   8   16:getfield        #31  <Field zztq zzbui>
	//*   9   19:getfield        #212 <Field int zztq.zzbtz>
	//*  10   22:icmpge          112
		{
			i = zzbui.zzas(i);
	//   11   25:aload_0         
	//   12   26:getfield        #31  <Field zztq zzbui>
	//   13   29:iload_3         
	//   14   30:invokevirtual   #216 <Method int zztq.zzas(int)>
	//   15   33:istore_3        
			Object obj = zzwl1.newInstance();
	//   16   34:aload_1         
	//   17   35:invokeinterface #222 <Method Object zzwl.newInstance()>
	//   18   40:astore          4
			zztq zztq1 = zzbui;
	//   19   42:aload_0         
	//   20   43:getfield        #31  <Field zztq zzbui>
	//   21   46:astore          5
			zztq1.zzbty = zztq1.zzbty + 1;
	//   22   48:aload           5
	//   23   50:aload           5
	//   24   52:getfield        #209 <Field int zztq.zzbty>
	//   25   55:iconst_1        
	//   26   56:iadd            
	//   27   57:putfield        #209 <Field int zztq.zzbty>
			zzwl1.zza(obj, ((zzwk) (this)), zzub);
	//   28   60:aload_1         
	//   29   61:aload           4
	//   30   63:aload_0         
	//   31   64:aload_2         
	//   32   65:invokeinterface #225 <Method void zzwl.zza(Object, zzwk, zzub)>
			zzwl1.zzy(obj);
	//   33   70:aload_1         
	//   34   71:aload           4
	//   35   73:invokeinterface #229 <Method void zzwl.zzy(Object)>
			zzbui.zzap(0);
	//   36   78:aload_0         
	//   37   79:getfield        #31  <Field zztq zzbui>
	//   38   82:iconst_0        
	//   39   83:invokevirtual   #232 <Method void zztq.zzap(int)>
			zzwl1 = ((zzwl) (zzbui));
	//   40   86:aload_0         
	//   41   87:getfield        #31  <Field zztq zzbui>
	//   42   90:astore_1        
			zzwl1.zzbty = ((zztq) (zzwl1)).zzbty - 1;
	//   43   91:aload_1         
	//   44   92:aload_1         
	//   45   93:getfield        #209 <Field int zztq.zzbty>
	//   46   96:iconst_1        
	//   47   97:isub            
	//   48   98:putfield        #209 <Field int zztq.zzbty>
			zzbui.zzat(i);
	//   49  101:aload_0         
	//   50  102:getfield        #31  <Field zztq zzbui>
	//   51  105:iload_3         
	//   52  106:invokevirtual   #235 <Method void zztq.zzat(int)>
			return obj;
	//   53  109:aload           4
	//   54  111:areturn         
		} else
		{
			throw com.google.android.gms.internal.measurement.zzuv.zzwv();
	//   55  112:invokestatic    #238 <Method zzuv zzuv.zzwv()>
	//   56  115:athrow          
		}
	}

	private final Object zzd(zzwl zzwl1, zzub zzub)
		throws IOException
	{
		int i;
		i = zzbuj;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field int zzbuj>
	//    2    4:istore_3        
		zzbuj = (tag >>> 3) << 3 | 4;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #165 <Field int tag>
	//    6   10:iconst_3        
	//    7   11:iushr           
	//    8   12:iconst_3        
	//    9   13:ishl            
	//   10   14:iconst_4        
	//   11   15:ior             
	//   12   16:putfield        #242 <Field int zzbuj>
		int j;
		int k;
		Object obj;
		obj = zzwl1.newInstance();
	//   13   19:aload_1         
	//   14   20:invokeinterface #222 <Method Object zzwl.newInstance()>
	//   15   25:astore          6
		zzwl1.zza(obj, ((zzwk) (this)), zzub);
	//   16   27:aload_1         
	//   17   28:aload           6
	//   18   30:aload_0         
	//   19   31:aload_2         
	//   20   32:invokeinterface #225 <Method void zzwl.zza(Object, zzwk, zzub)>
		zzwl1.zzy(obj);
	//   21   37:aload_1         
	//   22   38:aload           6
	//   23   40:invokeinterface #229 <Method void zzwl.zzy(Object)>
		j = tag;
	//   24   45:aload_0         
	//   25   46:getfield        #165 <Field int tag>
	//   26   49:istore          4
		k = zzbuj;
	//   27   51:aload_0         
	//   28   52:getfield        #242 <Field int zzbuj>
	//   29   55:istore          5
		if(j == k)
	//*  30   57:iload           4
	//*  31   59:iload           5
	//*  32   61:icmpne          72
		{
			zzbuj = i;
	//   33   64:aload_0         
	//   34   65:iload_3         
	//   35   66:putfield        #242 <Field int zzbuj>
			return obj;
	//   36   69:aload           6
	//   37   71:areturn         
		}
		throw com.google.android.gms.internal.measurement.zzuv.zzww();
	//   38   72:invokestatic    #197 <Method zzuv zzuv.zzww()>
	//   39   75:athrow          
		zzwl1;
	//   40   76:astore_1        
		zzbuj = i;
	//   41   77:aload_0         
	//   42   78:iload_3         
	//   43   79:putfield        #242 <Field int zzbuj>
		throw zzwl1;
	//   44   82:aload_1         
	//   45   83:athrow          
	}

	public final int getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field int tag>
	//    2    4:ireturn         
	}

	public final double readDouble()
		throws IOException
	{
		zzav(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.readDouble();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #244 <Method double zztq.readDouble()>
	//    6   12:dreturn         
	}

	public final float readFloat()
		throws IOException
	{
		zzav(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.readFloat();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #245 <Method float zztq.readFloat()>
	//    6   12:freturn         
	}

	public final String readString()
		throws IOException
	{
		zzav(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.readString();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #246 <Method String zztq.readString()>
	//    6   12:areturn         
	}

	public final void readStringList(List list)
		throws IOException
	{
		zza(list, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #250 <Method void zza(List, boolean)>
	//    4    6:return          
	}

	public final Object zza(zzwl zzwl1, zzub zzub)
		throws IOException
	{
		zzav(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzc(zzwl1, zzub);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #113 <Method Object zzc(zzwl, zzub)>
	//    7   11:areturn         
	}

	public final void zza(List list, zzwl zzwl1, zzub zzub)
		throws IOException
	{
		int i = tag;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field int tag>
	//    2    4:istore          4
		if((i & 7) == 2)
			do
	//*   3    6:iload           4
	//*   4    8:bipush          7
	//*   5   10:iand            
	//*   6   11:iconst_2        
	//*   7   12:icmpne          70
			{
				list.add(zzc(zzwl1, zzub));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:invokespecial   #113 <Method Object zzc(zzwl, zzub)>
	//   13   22:invokeinterface #185 <Method boolean List.add(Object)>
	//   14   27:pop             
				if(!zzbui.zzuz())
	//*  15   28:aload_0         
	//*  16   29:getfield        #31  <Field zztq zzbui>
	//*  17   32:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  18   35:ifne            69
				{
					if(zzbuk != 0)
	//*  19   38:aload_0         
	//*  20   39:getfield        #19  <Field int zzbuk>
	//*  21   42:ifeq            46
						return;
	//   22   45:return          
					int j = zzbui.zzuj();
	//   23   46:aload_0         
	//   24   47:getfield        #31  <Field zztq zzbui>
	//   25   50:invokevirtual   #176 <Method int zztq.zzuj()>
	//   26   53:istore          5
					if(j != i)
	//*  27   55:iload           5
	//*  28   57:iload           4
	//*  29   59:icmpeq          15
					{
						zzbuk = j;
	//   30   62:aload_0         
	//   31   63:iload           5
	//   32   65:putfield        #19  <Field int zzbuk>
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
			throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   35   70:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   36   73:athrow          
	}

	public final void zza(Map map, zzvo zzvo1, zzub zzub)
		throws IOException
	{
		int i;
		Object obj;
		Object obj1;
		zzav(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		i = zzbui.zzus();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #206 <Method int zztq.zzus()>
	//    6   12:istore          4
		i = zzbui.zzas(i);
	//    7   14:aload_0         
	//    8   15:getfield        #31  <Field zztq zzbui>
	//    9   18:iload           4
	//   10   20:invokevirtual   #216 <Method int zztq.zzas(int)>
	//   11   23:istore          4
		obj = zzvo1.zzcaj;
	//   12   25:aload_2         
	//   13   26:getfield        #262 <Field Object zzvo.zzcaj>
	//   14   29:astore          7
		obj1 = zzvo1.zzbrp;
	//   15   31:aload_2         
	//   16   32:getfield        #265 <Field Object zzvo.zzbrp>
	//   17   35:astore          8
_L6:
		int j = zzvh();
	//   18   37:aload_0         
	//   19   38:invokevirtual   #268 <Method int zzvh()>
	//   20   41:istore          5
		if(j == 0x7fffffff)
			break; /* Loop/switch isn't completed */
	//   21   43:iload           5
	//   22   45:ldc2            #269 <Int 0x7fffffff>
	//   23   48:icmpeq          173
		boolean flag = zzbui.zzuz();
	//   24   51:aload_0         
	//   25   52:getfield        #31  <Field zztq zzbui>
	//   26   55:invokevirtual   #173 <Method boolean zztq.zzuz()>
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
		flag = zzvi();
	//   32   88:aload_0         
	//   33   89:invokevirtual   #272 <Method boolean zzvi()>
	//   34   92:istore          6
		  goto _L4
	//*  35   94:goto            211
_L3:
		Object obj2 = zza(zzvo1.zzcak, zzvo1.zzbrp.getClass(), zzub);
	//   36   97:aload_0         
	//   37   98:aload_2         
	//   38   99:getfield        #276 <Field zzxs zzvo.zzcak>
	//   39  102:aload_2         
	//   40  103:getfield        #265 <Field Object zzvo.zzbrp>
	//   41  106:invokevirtual   #280 <Method Class Object.getClass()>
	//   42  109:aload_3         
	//   43  110:invokespecial   #282 <Method Object zza(zzxs, Class, zzub)>
	//   44  113:astore          9
		obj1 = obj2;
	//   45  115:aload           9
	//   46  117:astore          8
		continue; /* Loop/switch isn't completed */
	//   47  119:goto            37
_L2:
		obj2 = zza(zzvo1.zzcai, ((Class) (null)), ((zzub) (null)));
	//   48  122:aload_0         
	//   49  123:aload_2         
	//   50  124:getfield        #285 <Field zzxs zzvo.zzcai>
	//   51  127:aconst_null     
	//   52  128:aconst_null     
	//   53  129:invokespecial   #282 <Method Object zza(zzxs, Class, zzub)>
	//   54  132:astore          9
		obj = obj2;
	//   55  134:aload           9
	//   56  136:astore          7
		if(true) goto _L6; else goto _L5
	//   57  138:goto            37
_L7:
		try
		{
			throw new zzuv("Unable to parse map entry.");
	//   58  141:new             #187 <Class zzuv>
	//   59  144:dup             
	//   60  145:ldc2            #287 <String "Unable to parse map entry.">
	//   61  148:invokespecial   #288 <Method void zzuv(String)>
	//   62  151:athrow          
		}
	//*  63  152:aload_0         
	//*  64  153:invokevirtual   #272 <Method boolean zzvi()>
	//*  65  156:ifeq            162
	//*  66  159:goto            37
	//*  67  162:new             #187 <Class zzuv>
	//*  68  165:dup             
	//*  69  166:ldc2            #287 <String "Unable to parse map entry.">
	//*  70  169:invokespecial   #288 <Method void zzuv(String)>
	//*  71  172:athrow          
	//*  72  173:aload_1         
	//*  73  174:aload           7
	//*  74  176:aload           8
	//*  75  178:invokeinterface #294 <Method Object Map.put(Object, Object)>
	//*  76  183:pop             
	//*  77  184:aload_0         
	//*  78  185:getfield        #31  <Field zztq zzbui>
	//*  79  188:iload           4
	//*  80  190:invokevirtual   #235 <Method void zztq.zzat(int)>
	//*  81  193:return          
	//*  82  194:astore_1        
	//*  83  195:aload_0         
	//*  84  196:getfield        #31  <Field zztq zzbui>
	//*  85  199:iload           4
	//*  86  201:invokevirtual   #235 <Method void zztq.zzat(int)>
	//*  87  204:aload_1         
	//*  88  205:athrow          
		catch(zzuw zzuw1) { }
	//   89  206:astore          9
		if(zzvi())
			break; /* Loop/switch isn't completed */
		throw new zzuv("Unable to parse map entry.");
_L5:
		map.put(obj, obj1);
		zzbui.zzat(i);
		return;
		map;
		zzbui.zzat(i);
		throw map;
	//*  90  208:goto            152
_L4:
		if(!flag) goto _L7; else goto _L6
	//   91  211:iload           6
	//   92  213:ifeq            141
	//*  93  216:goto            37
	}

	public final Object zzb(zzwl zzwl1, zzub zzub)
		throws IOException
	{
		zzav(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzd(zzwl1, zzub);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #298 <Method Object zzd(zzwl, zzub)>
	//    7   11:areturn         
	}

	public final void zzb(List list, zzwl zzwl1, zzub zzub)
		throws IOException
	{
		int i = tag;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field int tag>
	//    2    4:istore          4
		if((i & 7) == 3)
			do
	//*   3    6:iload           4
	//*   4    8:bipush          7
	//*   5   10:iand            
	//*   6   11:iconst_3        
	//*   7   12:icmpne          70
			{
				list.add(zzd(zzwl1, zzub));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:invokespecial   #298 <Method Object zzd(zzwl, zzub)>
	//   13   22:invokeinterface #185 <Method boolean List.add(Object)>
	//   14   27:pop             
				if(!zzbui.zzuz())
	//*  15   28:aload_0         
	//*  16   29:getfield        #31  <Field zztq zzbui>
	//*  17   32:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  18   35:ifne            69
				{
					if(zzbuk != 0)
	//*  19   38:aload_0         
	//*  20   39:getfield        #19  <Field int zzbuk>
	//*  21   42:ifeq            46
						return;
	//   22   45:return          
					int j = zzbui.zzuj();
	//   23   46:aload_0         
	//   24   47:getfield        #31  <Field zztq zzbui>
	//   25   50:invokevirtual   #176 <Method int zztq.zzuj()>
	//   26   53:istore          5
					if(j != i)
	//*  27   55:iload           5
	//*  28   57:iload           4
	//*  29   59:icmpeq          15
					{
						zzbuk = j;
	//   30   62:aload_0         
	//   31   63:iload           5
	//   32   65:putfield        #19  <Field int zzbuk>
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
			throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   35   70:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   36   73:athrow          
	}

	public final void zzi(List list)
		throws IOException
	{
		if(list instanceof zzty)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #300 <Class zzty>
	//*   2    4:ifeq            133
		{
			list = ((List) ((zzty)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #300 <Class zzty>
	//    5   11:astore_1        
			switch(tag & 7)
	//*   6   12:aload_0         
	//*   7   13:getfield        #165 <Field int tag>
	//*   8   16:bipush          7
	//*   9   18:iand            
			{
	//*  10   19:tableswitch     1 2: default 40
	//	               1 89
	//	               2 44
			default:
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   11   40:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   12   43:athrow          

			case 2: // '\002'
				int i = zzbui.zzus();
	//   13   44:aload_0         
	//   14   45:getfield        #31  <Field zztq zzbui>
	//   15   48:invokevirtual   #206 <Method int zztq.zzus()>
	//   16   51:istore_2        
				zzaw(i);
	//   17   52:iload_2         
	//   18   53:invokestatic    #302 <Method void zzaw(int)>
				int i1 = zzbui.zzva();
	//   19   56:aload_0         
	//   20   57:getfield        #31  <Field zztq zzbui>
	//   21   60:invokevirtual   #202 <Method int zztq.zzva()>
	//   22   63:istore_3        
				do
					((zzty) (list)).zzd(zzbui.readDouble());
	//   23   64:aload_1         
	//   24   65:aload_0         
	//   25   66:getfield        #31  <Field zztq zzbui>
	//   26   69:invokevirtual   #244 <Method double zztq.readDouble()>
	//   27   72:invokevirtual   #305 <Method void zzty.zzd(double)>
				while(zzbui.zzva() < i1 + i);
	//   28   75:aload_0         
	//   29   76:getfield        #31  <Field zztq zzbui>
	//   30   79:invokevirtual   #202 <Method int zztq.zzva()>
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
				((zzty) (list)).zzd(zzbui.readDouble());
	//   36   89:aload_1         
	//   37   90:aload_0         
	//   38   91:getfield        #31  <Field zztq zzbui>
	//   39   94:invokevirtual   #244 <Method double zztq.readDouble()>
	//   40   97:invokevirtual   #305 <Method void zzty.zzd(double)>
				if(zzbui.zzuz())
	//*  41  100:aload_0         
	//*  42  101:getfield        #31  <Field zztq zzbui>
	//*  43  104:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  44  107:ifeq            111
					return;
	//   45  110:return          
				j = zzbui.zzuj();
	//   46  111:aload_0         
	//   47  112:getfield        #31  <Field zztq zzbui>
	//   48  115:invokevirtual   #176 <Method int zztq.zzuj()>
	//   49  118:istore_2        
			} while(j == tag);
	//   50  119:iload_2         
	//   51  120:aload_0         
	//   52  121:getfield        #165 <Field int tag>
	//   53  124:icmpeq          89
			zzbuk = j;
	//   54  127:aload_0         
	//   55  128:iload_2         
	//   56  129:putfield        #19  <Field int zzbuk>
			return;
	//   57  132:return          
		}
		switch(tag & 7)
	//*  58  133:aload_0         
	//*  59  134:getfield        #165 <Field int tag>
	//*  60  137:bipush          7
	//*  61  139:iand            
		{
	//*  62  140:tableswitch     1 2: default 164
	//	               1 219
	//	               2 168
		default:
			throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   63  164:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   64  167:athrow          

		case 2: // '\002'
			int k = zzbui.zzus();
	//   65  168:aload_0         
	//   66  169:getfield        #31  <Field zztq zzbui>
	//   67  172:invokevirtual   #206 <Method int zztq.zzus()>
	//   68  175:istore_2        
			zzaw(k);
	//   69  176:iload_2         
	//   70  177:invokestatic    #302 <Method void zzaw(int)>
			int j1 = zzbui.zzva();
	//   71  180:aload_0         
	//   72  181:getfield        #31  <Field zztq zzbui>
	//   73  184:invokevirtual   #202 <Method int zztq.zzva()>
	//   74  187:istore_3        
			do
				list.add(((Object) (Double.valueOf(zzbui.readDouble()))));
	//   75  188:aload_1         
	//   76  189:aload_0         
	//   77  190:getfield        #31  <Field zztq zzbui>
	//   78  193:invokevirtual   #244 <Method double zztq.readDouble()>
	//   79  196:invokestatic    #146 <Method Double Double.valueOf(double)>
	//   80  199:invokeinterface #185 <Method boolean List.add(Object)>
	//   81  204:pop             
			while(zzbui.zzva() < j1 + k);
	//   82  205:aload_0         
	//   83  206:getfield        #31  <Field zztq zzbui>
	//   84  209:invokevirtual   #202 <Method int zztq.zzva()>
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
			list.add(((Object) (Double.valueOf(zzbui.readDouble()))));
	//   90  219:aload_1         
	//   91  220:aload_0         
	//   92  221:getfield        #31  <Field zztq zzbui>
	//   93  224:invokevirtual   #244 <Method double zztq.readDouble()>
	//   94  227:invokestatic    #146 <Method Double Double.valueOf(double)>
	//   95  230:invokeinterface #185 <Method boolean List.add(Object)>
	//   96  235:pop             
			if(zzbui.zzuz())
	//*  97  236:aload_0         
	//*  98  237:getfield        #31  <Field zztq zzbui>
	//*  99  240:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//* 100  243:ifeq            247
				return;
	//  101  246:return          
			l = zzbui.zzuj();
	//  102  247:aload_0         
	//  103  248:getfield        #31  <Field zztq zzbui>
	//  104  251:invokevirtual   #176 <Method int zztq.zzuj()>
	//  105  254:istore_2        
		} while(l == tag);
	//  106  255:iload_2         
	//  107  256:aload_0         
	//  108  257:getfield        #165 <Field int tag>
	//  109  260:icmpeq          219
		zzbuk = l;
	//  110  263:aload_0         
	//  111  264:iload_2         
	//  112  265:putfield        #19  <Field int zzbuk>
	//  113  268:return          
	}

	public final void zzj(List list)
		throws IOException
	{
		if(list instanceof zzul)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #309 <Class zzul>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzul)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #309 <Class zzul>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #165 <Field int tag>
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
						((zzul) (list)).zzc(zzbui.readFloat());
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:getfield        #31  <Field zztq zzbui>
	//   20   35:invokevirtual   #245 <Method float zztq.readFloat()>
	//   21   38:invokevirtual   #312 <Method void zzul.zzc(float)>
						if(zzbui.zzuz())
	//*  22   41:aload_0         
	//*  23   42:getfield        #31  <Field zztq zzbui>
	//*  24   45:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  25   48:ifeq            52
							return;
	//   26   51:return          
						i = zzbui.zzuj();
	//   27   52:aload_0         
	//   28   53:getfield        #31  <Field zztq zzbui>
	//   29   56:invokevirtual   #176 <Method int zztq.zzuj()>
	//   30   59:istore_2        
					} while(i == tag);
	//   31   60:iload_2         
	//   32   61:aload_0         
	//   33   62:getfield        #165 <Field int tag>
	//   34   65:icmpeq          30
					zzbuk = i;
	//   35   68:aload_0         
	//   36   69:iload_2         
	//   37   70:putfield        #19  <Field int zzbuk>
					return;
	//   38   73:return          
				} else
				{
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   39   74:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   40   77:athrow          
				}
			i = zzbui.zzus();
	//   41   78:aload_0         
	//   42   79:getfield        #31  <Field zztq zzbui>
	//   43   82:invokevirtual   #206 <Method int zztq.zzus()>
	//   44   85:istore_2        
			zzax(i);
	//   45   86:iload_2         
	//   46   87:invokestatic    #314 <Method void zzax(int)>
			int k = zzbui.zzva();
	//   47   90:aload_0         
	//   48   91:getfield        #31  <Field zztq zzbui>
	//   49   94:invokevirtual   #202 <Method int zztq.zzva()>
	//   50   97:istore_3        
			do
				((zzul) (list)).zzc(zzbui.readFloat());
	//   51   98:aload_1         
	//   52   99:aload_0         
	//   53  100:getfield        #31  <Field zztq zzbui>
	//   54  103:invokevirtual   #245 <Method float zztq.readFloat()>
	//   55  106:invokevirtual   #312 <Method void zzul.zzc(float)>
			while(zzbui.zzva() < k + i);
	//   56  109:aload_0         
	//   57  110:getfield        #31  <Field zztq zzbui>
	//   58  113:invokevirtual   #202 <Method int zztq.zzva()>
	//   59  116:iload_3         
	//   60  117:iload_2         
	//   61  118:iadd            
	//   62  119:icmplt          98
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #165 <Field int tag>
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
					list.add(((Object) (Float.valueOf(zzbui.readFloat()))));
	//   75  141:aload_1         
	//   76  142:aload_0         
	//   77  143:getfield        #31  <Field zztq zzbui>
	//   78  146:invokevirtual   #245 <Method float zztq.readFloat()>
	//   79  149:invokestatic    #128 <Method Float Float.valueOf(float)>
	//   80  152:invokeinterface #185 <Method boolean List.add(Object)>
	//   81  157:pop             
					if(zzbui.zzuz())
	//*  82  158:aload_0         
	//*  83  159:getfield        #31  <Field zztq zzbui>
	//*  84  162:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  85  165:ifeq            169
						return;
	//   86  168:return          
					j = zzbui.zzuj();
	//   87  169:aload_0         
	//   88  170:getfield        #31  <Field zztq zzbui>
	//   89  173:invokevirtual   #176 <Method int zztq.zzuj()>
	//   90  176:istore_2        
				} while(j == tag);
	//   91  177:iload_2         
	//   92  178:aload_0         
	//   93  179:getfield        #165 <Field int tag>
	//   94  182:icmpeq          141
				zzbuk = j;
	//   95  185:aload_0         
	//   96  186:iload_2         
	//   97  187:putfield        #19  <Field int zzbuk>
				return;
	//   98  190:return          
			} else
			{
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   99  191:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//  100  194:athrow          
			}
		j = zzbui.zzus();
	//  101  195:aload_0         
	//  102  196:getfield        #31  <Field zztq zzbui>
	//  103  199:invokevirtual   #206 <Method int zztq.zzus()>
	//  104  202:istore_2        
		zzax(j);
	//  105  203:iload_2         
	//  106  204:invokestatic    #314 <Method void zzax(int)>
		int l = zzbui.zzva();
	//  107  207:aload_0         
	//  108  208:getfield        #31  <Field zztq zzbui>
	//  109  211:invokevirtual   #202 <Method int zztq.zzva()>
	//  110  214:istore_3        
		do
			list.add(((Object) (Float.valueOf(zzbui.readFloat()))));
	//  111  215:aload_1         
	//  112  216:aload_0         
	//  113  217:getfield        #31  <Field zztq zzbui>
	//  114  220:invokevirtual   #245 <Method float zztq.readFloat()>
	//  115  223:invokestatic    #128 <Method Float Float.valueOf(float)>
	//  116  226:invokeinterface #185 <Method boolean List.add(Object)>
	//  117  231:pop             
		while(zzbui.zzva() < l + j);
	//  118  232:aload_0         
	//  119  233:getfield        #31  <Field zztq zzbui>
	//  120  236:invokevirtual   #202 <Method int zztq.zzva()>
	//  121  239:iload_3         
	//  122  240:iload_2         
	//  123  241:iadd            
	//  124  242:icmplt          215
	//  125  245:return          
	}

	public final void zzk(List list)
		throws IOException
	{
		if(list instanceof zzvj)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #318 <Class zzvj>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzvj)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #318 <Class zzvj>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #165 <Field int tag>
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
					i = zzbui.zzus();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zztq zzbui>
	//   18   33:invokevirtual   #206 <Method int zztq.zzus()>
	//   19   36:istore_2        
					i = zzbui.zzva() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zztq zzbui>
	//   22   41:invokevirtual   #202 <Method int zztq.zzva()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzvj) (list)).zzbe(zzbui.zzuk());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zztq zzbui>
	//   29   52:invokevirtual   #319 <Method long zztq.zzuk()>
	//   30   55:invokevirtual   #323 <Method void zzvj.zzbe(long)>
					while(zzbui.zzva() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zztq zzbui>
	//   33   62:invokevirtual   #202 <Method int zztq.zzva()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzay(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #325 <Method void zzay(int)>
					return;
	//   39   74:return          
				} else
				{
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   40   75:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   41   78:athrow          
				}
			do
			{
				((zzvj) (list)).zzbe(zzbui.zzuk());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zztq zzbui>
	//   45   84:invokevirtual   #319 <Method long zztq.zzuk()>
	//   46   87:invokevirtual   #323 <Method void zzvj.zzbe(long)>
				if(zzbui.zzuz())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zztq zzbui>
	//*  49   94:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzbui.zzuj();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zztq zzbui>
	//   54  105:invokevirtual   #176 <Method int zztq.zzuj()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #165 <Field int tag>
	//   59  114:icmpeq          79
			zzbuk = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzbuk>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #165 <Field int tag>
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
				j = zzbui.zzus();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zztq zzbui>
	//   76  144:invokevirtual   #206 <Method int zztq.zzus()>
	//   77  147:istore_2        
				j = zzbui.zzva() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zztq zzbui>
	//   80  152:invokevirtual   #202 <Method int zztq.zzva()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Long.valueOf(zzbui.zzuk()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zztq zzbui>
	//   87  163:invokevirtual   #319 <Method long zztq.zzuk()>
	//   88  166:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   89  169:invokeinterface #185 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzbui.zzva() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zztq zzbui>
	//   93  179:invokevirtual   #202 <Method int zztq.zzva()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzay(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #325 <Method void zzay(int)>
				return;
	//   99  191:return          
			} else
			{
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//  100  192:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Long.valueOf(zzbui.zzuk()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zztq zzbui>
	//  105  201:invokevirtual   #319 <Method long zztq.zzuk()>
	//  106  204:invokestatic    #71  <Method Long Long.valueOf(long)>
	//  107  207:invokeinterface #185 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzbui.zzuz())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zztq zzbui>
	//* 111  217:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzbui.zzuj();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zztq zzbui>
	//  116  228:invokevirtual   #176 <Method int zztq.zzuj()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #165 <Field int tag>
	//  121  237:icmpeq          196
		zzbuk = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzbuk>
	//  125  245:return          
	}

	public final void zzl(List list)
		throws IOException
	{
		if(list instanceof zzvj)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #318 <Class zzvj>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzvj)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #318 <Class zzvj>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #165 <Field int tag>
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
					i = zzbui.zzus();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zztq zzbui>
	//   18   33:invokevirtual   #206 <Method int zztq.zzus()>
	//   19   36:istore_2        
					i = zzbui.zzva() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zztq zzbui>
	//   22   41:invokevirtual   #202 <Method int zztq.zzva()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzvj) (list)).zzbe(zzbui.zzul());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zztq zzbui>
	//   29   52:invokevirtual   #328 <Method long zztq.zzul()>
	//   30   55:invokevirtual   #323 <Method void zzvj.zzbe(long)>
					while(zzbui.zzva() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zztq zzbui>
	//   33   62:invokevirtual   #202 <Method int zztq.zzva()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzay(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #325 <Method void zzay(int)>
					return;
	//   39   74:return          
				} else
				{
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   40   75:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   41   78:athrow          
				}
			do
			{
				((zzvj) (list)).zzbe(zzbui.zzul());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zztq zzbui>
	//   45   84:invokevirtual   #328 <Method long zztq.zzul()>
	//   46   87:invokevirtual   #323 <Method void zzvj.zzbe(long)>
				if(zzbui.zzuz())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zztq zzbui>
	//*  49   94:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzbui.zzuj();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zztq zzbui>
	//   54  105:invokevirtual   #176 <Method int zztq.zzuj()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #165 <Field int tag>
	//   59  114:icmpeq          79
			zzbuk = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzbuk>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #165 <Field int tag>
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
				j = zzbui.zzus();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zztq zzbui>
	//   76  144:invokevirtual   #206 <Method int zztq.zzus()>
	//   77  147:istore_2        
				j = zzbui.zzva() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zztq zzbui>
	//   80  152:invokevirtual   #202 <Method int zztq.zzva()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Long.valueOf(zzbui.zzul()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zztq zzbui>
	//   87  163:invokevirtual   #328 <Method long zztq.zzul()>
	//   88  166:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   89  169:invokeinterface #185 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzbui.zzva() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zztq zzbui>
	//   93  179:invokevirtual   #202 <Method int zztq.zzva()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzay(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #325 <Method void zzay(int)>
				return;
	//   99  191:return          
			} else
			{
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//  100  192:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Long.valueOf(zzbui.zzul()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zztq zzbui>
	//  105  201:invokevirtual   #328 <Method long zztq.zzul()>
	//  106  204:invokestatic    #71  <Method Long Long.valueOf(long)>
	//  107  207:invokeinterface #185 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzbui.zzuz())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zztq zzbui>
	//* 111  217:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzbui.zzuj();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zztq zzbui>
	//  116  228:invokevirtual   #176 <Method int zztq.zzuj()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #165 <Field int tag>
	//  121  237:icmpeq          196
		zzbuk = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzbuk>
	//  125  245:return          
	}

	public final void zzm(List list)
		throws IOException
	{
		if(list instanceof zzup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #331 <Class zzup>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzup)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #331 <Class zzup>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #165 <Field int tag>
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
					i = zzbui.zzus();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zztq zzbui>
	//   18   33:invokevirtual   #206 <Method int zztq.zzus()>
	//   19   36:istore_2        
					i = zzbui.zzva() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zztq zzbui>
	//   22   41:invokevirtual   #202 <Method int zztq.zzva()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzup) (list)).zzbo(zzbui.zzum());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zztq zzbui>
	//   29   52:invokevirtual   #332 <Method int zztq.zzum()>
	//   30   55:invokevirtual   #335 <Method void zzup.zzbo(int)>
					while(zzbui.zzva() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zztq zzbui>
	//   33   62:invokevirtual   #202 <Method int zztq.zzva()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzay(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #325 <Method void zzay(int)>
					return;
	//   39   74:return          
				} else
				{
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   40   75:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   41   78:athrow          
				}
			do
			{
				((zzup) (list)).zzbo(zzbui.zzum());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zztq zzbui>
	//   45   84:invokevirtual   #332 <Method int zztq.zzum()>
	//   46   87:invokevirtual   #335 <Method void zzup.zzbo(int)>
				if(zzbui.zzuz())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zztq zzbui>
	//*  49   94:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzbui.zzuj();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zztq zzbui>
	//   54  105:invokevirtual   #176 <Method int zztq.zzuj()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #165 <Field int tag>
	//   59  114:icmpeq          79
			zzbuk = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzbuk>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #165 <Field int tag>
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
				j = zzbui.zzus();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zztq zzbui>
	//   76  144:invokevirtual   #206 <Method int zztq.zzus()>
	//   77  147:istore_2        
				j = zzbui.zzva() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zztq zzbui>
	//   80  152:invokevirtual   #202 <Method int zztq.zzva()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Integer.valueOf(zzbui.zzum()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zztq zzbui>
	//   87  163:invokevirtual   #332 <Method int zztq.zzum()>
	//   88  166:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   89  169:invokeinterface #185 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzbui.zzva() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zztq zzbui>
	//   93  179:invokevirtual   #202 <Method int zztq.zzva()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzay(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #325 <Method void zzay(int)>
				return;
	//   99  191:return          
			} else
			{
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//  100  192:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzbui.zzum()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zztq zzbui>
	//  105  201:invokevirtual   #332 <Method int zztq.zzum()>
	//  106  204:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  107  207:invokeinterface #185 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzbui.zzuz())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zztq zzbui>
	//* 111  217:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzbui.zzuj();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zztq zzbui>
	//  116  228:invokevirtual   #176 <Method int zztq.zzuj()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #165 <Field int tag>
	//  121  237:icmpeq          196
		zzbuk = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzbuk>
	//  125  245:return          
	}

	public final void zzn(List list)
		throws IOException
	{
		if(list instanceof zzvj)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #318 <Class zzvj>
	//*   2    4:ifeq            133
		{
			list = ((List) ((zzvj)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #318 <Class zzvj>
	//    5   11:astore_1        
			switch(tag & 7)
	//*   6   12:aload_0         
	//*   7   13:getfield        #165 <Field int tag>
	//*   8   16:bipush          7
	//*   9   18:iand            
			{
	//*  10   19:tableswitch     1 2: default 40
	//	               1 89
	//	               2 44
			default:
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   11   40:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   12   43:athrow          

			case 2: // '\002'
				int i = zzbui.zzus();
	//   13   44:aload_0         
	//   14   45:getfield        #31  <Field zztq zzbui>
	//   15   48:invokevirtual   #206 <Method int zztq.zzus()>
	//   16   51:istore_2        
				zzaw(i);
	//   17   52:iload_2         
	//   18   53:invokestatic    #302 <Method void zzaw(int)>
				int i1 = zzbui.zzva();
	//   19   56:aload_0         
	//   20   57:getfield        #31  <Field zztq zzbui>
	//   21   60:invokevirtual   #202 <Method int zztq.zzva()>
	//   22   63:istore_3        
				do
					((zzvj) (list)).zzbe(zzbui.zzun());
	//   23   64:aload_1         
	//   24   65:aload_0         
	//   25   66:getfield        #31  <Field zztq zzbui>
	//   26   69:invokevirtual   #338 <Method long zztq.zzun()>
	//   27   72:invokevirtual   #323 <Method void zzvj.zzbe(long)>
				while(zzbui.zzva() < i1 + i);
	//   28   75:aload_0         
	//   29   76:getfield        #31  <Field zztq zzbui>
	//   30   79:invokevirtual   #202 <Method int zztq.zzva()>
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
				((zzvj) (list)).zzbe(zzbui.zzun());
	//   36   89:aload_1         
	//   37   90:aload_0         
	//   38   91:getfield        #31  <Field zztq zzbui>
	//   39   94:invokevirtual   #338 <Method long zztq.zzun()>
	//   40   97:invokevirtual   #323 <Method void zzvj.zzbe(long)>
				if(zzbui.zzuz())
	//*  41  100:aload_0         
	//*  42  101:getfield        #31  <Field zztq zzbui>
	//*  43  104:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  44  107:ifeq            111
					return;
	//   45  110:return          
				j = zzbui.zzuj();
	//   46  111:aload_0         
	//   47  112:getfield        #31  <Field zztq zzbui>
	//   48  115:invokevirtual   #176 <Method int zztq.zzuj()>
	//   49  118:istore_2        
			} while(j == tag);
	//   50  119:iload_2         
	//   51  120:aload_0         
	//   52  121:getfield        #165 <Field int tag>
	//   53  124:icmpeq          89
			zzbuk = j;
	//   54  127:aload_0         
	//   55  128:iload_2         
	//   56  129:putfield        #19  <Field int zzbuk>
			return;
	//   57  132:return          
		}
		switch(tag & 7)
	//*  58  133:aload_0         
	//*  59  134:getfield        #165 <Field int tag>
	//*  60  137:bipush          7
	//*  61  139:iand            
		{
	//*  62  140:tableswitch     1 2: default 164
	//	               1 219
	//	               2 168
		default:
			throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   63  164:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   64  167:athrow          

		case 2: // '\002'
			int k = zzbui.zzus();
	//   65  168:aload_0         
	//   66  169:getfield        #31  <Field zztq zzbui>
	//   67  172:invokevirtual   #206 <Method int zztq.zzus()>
	//   68  175:istore_2        
			zzaw(k);
	//   69  176:iload_2         
	//   70  177:invokestatic    #302 <Method void zzaw(int)>
			int j1 = zzbui.zzva();
	//   71  180:aload_0         
	//   72  181:getfield        #31  <Field zztq zzbui>
	//   73  184:invokevirtual   #202 <Method int zztq.zzva()>
	//   74  187:istore_3        
			do
				list.add(((Object) (Long.valueOf(zzbui.zzun()))));
	//   75  188:aload_1         
	//   76  189:aload_0         
	//   77  190:getfield        #31  <Field zztq zzbui>
	//   78  193:invokevirtual   #338 <Method long zztq.zzun()>
	//   79  196:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   80  199:invokeinterface #185 <Method boolean List.add(Object)>
	//   81  204:pop             
			while(zzbui.zzva() < j1 + k);
	//   82  205:aload_0         
	//   83  206:getfield        #31  <Field zztq zzbui>
	//   84  209:invokevirtual   #202 <Method int zztq.zzva()>
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
			list.add(((Object) (Long.valueOf(zzbui.zzun()))));
	//   90  219:aload_1         
	//   91  220:aload_0         
	//   92  221:getfield        #31  <Field zztq zzbui>
	//   93  224:invokevirtual   #338 <Method long zztq.zzun()>
	//   94  227:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   95  230:invokeinterface #185 <Method boolean List.add(Object)>
	//   96  235:pop             
			if(zzbui.zzuz())
	//*  97  236:aload_0         
	//*  98  237:getfield        #31  <Field zztq zzbui>
	//*  99  240:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//* 100  243:ifeq            247
				return;
	//  101  246:return          
			l = zzbui.zzuj();
	//  102  247:aload_0         
	//  103  248:getfield        #31  <Field zztq zzbui>
	//  104  251:invokevirtual   #176 <Method int zztq.zzuj()>
	//  105  254:istore_2        
		} while(l == tag);
	//  106  255:iload_2         
	//  107  256:aload_0         
	//  108  257:getfield        #165 <Field int tag>
	//  109  260:icmpeq          219
		zzbuk = l;
	//  110  263:aload_0         
	//  111  264:iload_2         
	//  112  265:putfield        #19  <Field int zzbuk>
	//  113  268:return          
	}

	public final void zzo(List list)
		throws IOException
	{
		if(list instanceof zzup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #331 <Class zzup>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzup)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #331 <Class zzup>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #165 <Field int tag>
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
						((zzup) (list)).zzbo(zzbui.zzuo());
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:getfield        #31  <Field zztq zzbui>
	//   20   35:invokevirtual   #340 <Method int zztq.zzuo()>
	//   21   38:invokevirtual   #335 <Method void zzup.zzbo(int)>
						if(zzbui.zzuz())
	//*  22   41:aload_0         
	//*  23   42:getfield        #31  <Field zztq zzbui>
	//*  24   45:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  25   48:ifeq            52
							return;
	//   26   51:return          
						i = zzbui.zzuj();
	//   27   52:aload_0         
	//   28   53:getfield        #31  <Field zztq zzbui>
	//   29   56:invokevirtual   #176 <Method int zztq.zzuj()>
	//   30   59:istore_2        
					} while(i == tag);
	//   31   60:iload_2         
	//   32   61:aload_0         
	//   33   62:getfield        #165 <Field int tag>
	//   34   65:icmpeq          30
					zzbuk = i;
	//   35   68:aload_0         
	//   36   69:iload_2         
	//   37   70:putfield        #19  <Field int zzbuk>
					return;
	//   38   73:return          
				} else
				{
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   39   74:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   40   77:athrow          
				}
			i = zzbui.zzus();
	//   41   78:aload_0         
	//   42   79:getfield        #31  <Field zztq zzbui>
	//   43   82:invokevirtual   #206 <Method int zztq.zzus()>
	//   44   85:istore_2        
			zzax(i);
	//   45   86:iload_2         
	//   46   87:invokestatic    #314 <Method void zzax(int)>
			int k = zzbui.zzva();
	//   47   90:aload_0         
	//   48   91:getfield        #31  <Field zztq zzbui>
	//   49   94:invokevirtual   #202 <Method int zztq.zzva()>
	//   50   97:istore_3        
			do
				((zzup) (list)).zzbo(zzbui.zzuo());
	//   51   98:aload_1         
	//   52   99:aload_0         
	//   53  100:getfield        #31  <Field zztq zzbui>
	//   54  103:invokevirtual   #340 <Method int zztq.zzuo()>
	//   55  106:invokevirtual   #335 <Method void zzup.zzbo(int)>
			while(zzbui.zzva() < k + i);
	//   56  109:aload_0         
	//   57  110:getfield        #31  <Field zztq zzbui>
	//   58  113:invokevirtual   #202 <Method int zztq.zzva()>
	//   59  116:iload_3         
	//   60  117:iload_2         
	//   61  118:iadd            
	//   62  119:icmplt          98
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #165 <Field int tag>
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
					list.add(((Object) (Integer.valueOf(zzbui.zzuo()))));
	//   75  141:aload_1         
	//   76  142:aload_0         
	//   77  143:getfield        #31  <Field zztq zzbui>
	//   78  146:invokevirtual   #340 <Method int zztq.zzuo()>
	//   79  149:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   80  152:invokeinterface #185 <Method boolean List.add(Object)>
	//   81  157:pop             
					if(zzbui.zzuz())
	//*  82  158:aload_0         
	//*  83  159:getfield        #31  <Field zztq zzbui>
	//*  84  162:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  85  165:ifeq            169
						return;
	//   86  168:return          
					j = zzbui.zzuj();
	//   87  169:aload_0         
	//   88  170:getfield        #31  <Field zztq zzbui>
	//   89  173:invokevirtual   #176 <Method int zztq.zzuj()>
	//   90  176:istore_2        
				} while(j == tag);
	//   91  177:iload_2         
	//   92  178:aload_0         
	//   93  179:getfield        #165 <Field int tag>
	//   94  182:icmpeq          141
				zzbuk = j;
	//   95  185:aload_0         
	//   96  186:iload_2         
	//   97  187:putfield        #19  <Field int zzbuk>
				return;
	//   98  190:return          
			} else
			{
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   99  191:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//  100  194:athrow          
			}
		j = zzbui.zzus();
	//  101  195:aload_0         
	//  102  196:getfield        #31  <Field zztq zzbui>
	//  103  199:invokevirtual   #206 <Method int zztq.zzus()>
	//  104  202:istore_2        
		zzax(j);
	//  105  203:iload_2         
	//  106  204:invokestatic    #314 <Method void zzax(int)>
		int l = zzbui.zzva();
	//  107  207:aload_0         
	//  108  208:getfield        #31  <Field zztq zzbui>
	//  109  211:invokevirtual   #202 <Method int zztq.zzva()>
	//  110  214:istore_3        
		do
			list.add(((Object) (Integer.valueOf(zzbui.zzuo()))));
	//  111  215:aload_1         
	//  112  216:aload_0         
	//  113  217:getfield        #31  <Field zztq zzbui>
	//  114  220:invokevirtual   #340 <Method int zztq.zzuo()>
	//  115  223:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  116  226:invokeinterface #185 <Method boolean List.add(Object)>
	//  117  231:pop             
		while(zzbui.zzva() < l + j);
	//  118  232:aload_0         
	//  119  233:getfield        #31  <Field zztq zzbui>
	//  120  236:invokevirtual   #202 <Method int zztq.zzva()>
	//  121  239:iload_3         
	//  122  240:iload_2         
	//  123  241:iadd            
	//  124  242:icmplt          215
	//  125  245:return          
	}

	public final void zzp(List list)
		throws IOException
	{
		if(list instanceof zztc)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #343 <Class zztc>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zztc)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #343 <Class zztc>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #165 <Field int tag>
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
					i = zzbui.zzus();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zztq zzbui>
	//   18   33:invokevirtual   #206 <Method int zztq.zzus()>
	//   19   36:istore_2        
					i = zzbui.zzva() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zztq zzbui>
	//   22   41:invokevirtual   #202 <Method int zztq.zzva()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zztc) (list)).addBoolean(zzbui.zzup());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zztq zzbui>
	//   29   52:invokevirtual   #344 <Method boolean zztq.zzup()>
	//   30   55:invokevirtual   #348 <Method void zztc.addBoolean(boolean)>
					while(zzbui.zzva() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zztq zzbui>
	//   33   62:invokevirtual   #202 <Method int zztq.zzva()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzay(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #325 <Method void zzay(int)>
					return;
	//   39   74:return          
				} else
				{
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   40   75:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   41   78:athrow          
				}
			do
			{
				((zztc) (list)).addBoolean(zzbui.zzup());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zztq zzbui>
	//   45   84:invokevirtual   #344 <Method boolean zztq.zzup()>
	//   46   87:invokevirtual   #348 <Method void zztc.addBoolean(boolean)>
				if(zzbui.zzuz())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zztq zzbui>
	//*  49   94:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzbui.zzuj();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zztq zzbui>
	//   54  105:invokevirtual   #176 <Method int zztq.zzuj()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #165 <Field int tag>
	//   59  114:icmpeq          79
			zzbuk = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzbuk>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #165 <Field int tag>
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
				j = zzbui.zzus();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zztq zzbui>
	//   76  144:invokevirtual   #206 <Method int zztq.zzus()>
	//   77  147:istore_2        
				j = zzbui.zzva() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zztq zzbui>
	//   80  152:invokevirtual   #202 <Method int zztq.zzva()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Boolean.valueOf(zzbui.zzup()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zztq zzbui>
	//   87  163:invokevirtual   #344 <Method boolean zztq.zzup()>
	//   88  166:invokestatic    #159 <Method Boolean Boolean.valueOf(boolean)>
	//   89  169:invokeinterface #185 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzbui.zzva() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zztq zzbui>
	//   93  179:invokevirtual   #202 <Method int zztq.zzva()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzay(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #325 <Method void zzay(int)>
				return;
	//   99  191:return          
			} else
			{
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//  100  192:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Boolean.valueOf(zzbui.zzup()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zztq zzbui>
	//  105  201:invokevirtual   #344 <Method boolean zztq.zzup()>
	//  106  204:invokestatic    #159 <Method Boolean Boolean.valueOf(boolean)>
	//  107  207:invokeinterface #185 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzbui.zzuz())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zztq zzbui>
	//* 111  217:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzbui.zzuj();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zztq zzbui>
	//  116  228:invokevirtual   #176 <Method int zztq.zzuj()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #165 <Field int tag>
	//  121  237:icmpeq          196
		zzbuk = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzbuk>
	//  125  245:return          
	}

	public final void zzq(List list)
		throws IOException
	{
		zza(list, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #250 <Method void zza(List, boolean)>
	//    4    6:return          
	}

	public final void zzr(List list)
		throws IOException
	{
		if((tag & 7) == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field int tag>
	//*   2    4:bipush          7
	//*   3    6:iand            
	//*   4    7:iconst_2        
	//*   5    8:icmpne          55
		{
			int i;
			do
			{
				list.add(((Object) (zzur())));
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #150 <Method zzte zzur()>
	//    9   16:invokeinterface #185 <Method boolean List.add(Object)>
	//   10   21:pop             
				if(zzbui.zzuz())
	//*  11   22:aload_0         
	//*  12   23:getfield        #31  <Field zztq zzbui>
	//*  13   26:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  14   29:ifeq            33
					return;
	//   15   32:return          
				i = zzbui.zzuj();
	//   16   33:aload_0         
	//   17   34:getfield        #31  <Field zztq zzbui>
	//   18   37:invokevirtual   #176 <Method int zztq.zzuj()>
	//   19   40:istore_2        
			} while(i == tag);
	//   20   41:iload_2         
	//   21   42:aload_0         
	//   22   43:getfield        #165 <Field int tag>
	//   23   46:icmpeq          11
			zzbuk = i;
	//   24   49:aload_0         
	//   25   50:iload_2         
	//   26   51:putfield        #19  <Field int zzbuk>
			return;
	//   27   54:return          
		} else
		{
			throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   28   55:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   29   58:athrow          
		}
	}

	public final void zzs(List list)
		throws IOException
	{
		if(list instanceof zzup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #331 <Class zzup>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzup)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #331 <Class zzup>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #165 <Field int tag>
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
					i = zzbui.zzus();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zztq zzbui>
	//   18   33:invokevirtual   #206 <Method int zztq.zzus()>
	//   19   36:istore_2        
					i = zzbui.zzva() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zztq zzbui>
	//   22   41:invokevirtual   #202 <Method int zztq.zzva()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzup) (list)).zzbo(zzbui.zzus());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zztq zzbui>
	//   29   52:invokevirtual   #206 <Method int zztq.zzus()>
	//   30   55:invokevirtual   #335 <Method void zzup.zzbo(int)>
					while(zzbui.zzva() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zztq zzbui>
	//   33   62:invokevirtual   #202 <Method int zztq.zzva()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzay(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #325 <Method void zzay(int)>
					return;
	//   39   74:return          
				} else
				{
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   40   75:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   41   78:athrow          
				}
			do
			{
				((zzup) (list)).zzbo(zzbui.zzus());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zztq zzbui>
	//   45   84:invokevirtual   #206 <Method int zztq.zzus()>
	//   46   87:invokevirtual   #335 <Method void zzup.zzbo(int)>
				if(zzbui.zzuz())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zztq zzbui>
	//*  49   94:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzbui.zzuj();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zztq zzbui>
	//   54  105:invokevirtual   #176 <Method int zztq.zzuj()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #165 <Field int tag>
	//   59  114:icmpeq          79
			zzbuk = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzbuk>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #165 <Field int tag>
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
				j = zzbui.zzus();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zztq zzbui>
	//   76  144:invokevirtual   #206 <Method int zztq.zzus()>
	//   77  147:istore_2        
				j = zzbui.zzva() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zztq zzbui>
	//   80  152:invokevirtual   #202 <Method int zztq.zzva()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Integer.valueOf(zzbui.zzus()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zztq zzbui>
	//   87  163:invokevirtual   #206 <Method int zztq.zzus()>
	//   88  166:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   89  169:invokeinterface #185 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzbui.zzva() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zztq zzbui>
	//   93  179:invokevirtual   #202 <Method int zztq.zzva()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzay(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #325 <Method void zzay(int)>
				return;
	//   99  191:return          
			} else
			{
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//  100  192:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzbui.zzus()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zztq zzbui>
	//  105  201:invokevirtual   #206 <Method int zztq.zzus()>
	//  106  204:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  107  207:invokeinterface #185 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzbui.zzuz())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zztq zzbui>
	//* 111  217:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzbui.zzuj();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zztq zzbui>
	//  116  228:invokevirtual   #176 <Method int zztq.zzuj()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #165 <Field int tag>
	//  121  237:icmpeq          196
		zzbuk = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzbuk>
	//  125  245:return          
	}

	public final void zzt(List list)
		throws IOException
	{
		if(list instanceof zzup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #331 <Class zzup>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzup)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #331 <Class zzup>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #165 <Field int tag>
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
					i = zzbui.zzus();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zztq zzbui>
	//   18   33:invokevirtual   #206 <Method int zztq.zzus()>
	//   19   36:istore_2        
					i = zzbui.zzva() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zztq zzbui>
	//   22   41:invokevirtual   #202 <Method int zztq.zzva()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzup) (list)).zzbo(zzbui.zzut());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zztq zzbui>
	//   29   52:invokevirtual   #355 <Method int zztq.zzut()>
	//   30   55:invokevirtual   #335 <Method void zzup.zzbo(int)>
					while(zzbui.zzva() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zztq zzbui>
	//   33   62:invokevirtual   #202 <Method int zztq.zzva()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzay(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #325 <Method void zzay(int)>
					return;
	//   39   74:return          
				} else
				{
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   40   75:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   41   78:athrow          
				}
			do
			{
				((zzup) (list)).zzbo(zzbui.zzut());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zztq zzbui>
	//   45   84:invokevirtual   #355 <Method int zztq.zzut()>
	//   46   87:invokevirtual   #335 <Method void zzup.zzbo(int)>
				if(zzbui.zzuz())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zztq zzbui>
	//*  49   94:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzbui.zzuj();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zztq zzbui>
	//   54  105:invokevirtual   #176 <Method int zztq.zzuj()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #165 <Field int tag>
	//   59  114:icmpeq          79
			zzbuk = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzbuk>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #165 <Field int tag>
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
				j = zzbui.zzus();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zztq zzbui>
	//   76  144:invokevirtual   #206 <Method int zztq.zzus()>
	//   77  147:istore_2        
				j = zzbui.zzva() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zztq zzbui>
	//   80  152:invokevirtual   #202 <Method int zztq.zzva()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Integer.valueOf(zzbui.zzut()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zztq zzbui>
	//   87  163:invokevirtual   #355 <Method int zztq.zzut()>
	//   88  166:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   89  169:invokeinterface #185 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzbui.zzva() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zztq zzbui>
	//   93  179:invokevirtual   #202 <Method int zztq.zzva()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzay(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #325 <Method void zzay(int)>
				return;
	//   99  191:return          
			} else
			{
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//  100  192:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzbui.zzut()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zztq zzbui>
	//  105  201:invokevirtual   #355 <Method int zztq.zzut()>
	//  106  204:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  107  207:invokeinterface #185 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzbui.zzuz())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zztq zzbui>
	//* 111  217:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzbui.zzuj();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zztq zzbui>
	//  116  228:invokevirtual   #176 <Method int zztq.zzuj()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #165 <Field int tag>
	//  121  237:icmpeq          196
		zzbuk = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzbuk>
	//  125  245:return          
	}

	public final void zzu(List list)
		throws IOException
	{
		if(list instanceof zzup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #331 <Class zzup>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzup)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #331 <Class zzup>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #165 <Field int tag>
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
						((zzup) (list)).zzbo(zzbui.zzuu());
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:getfield        #31  <Field zztq zzbui>
	//   20   35:invokevirtual   #357 <Method int zztq.zzuu()>
	//   21   38:invokevirtual   #335 <Method void zzup.zzbo(int)>
						if(zzbui.zzuz())
	//*  22   41:aload_0         
	//*  23   42:getfield        #31  <Field zztq zzbui>
	//*  24   45:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  25   48:ifeq            52
							return;
	//   26   51:return          
						i = zzbui.zzuj();
	//   27   52:aload_0         
	//   28   53:getfield        #31  <Field zztq zzbui>
	//   29   56:invokevirtual   #176 <Method int zztq.zzuj()>
	//   30   59:istore_2        
					} while(i == tag);
	//   31   60:iload_2         
	//   32   61:aload_0         
	//   33   62:getfield        #165 <Field int tag>
	//   34   65:icmpeq          30
					zzbuk = i;
	//   35   68:aload_0         
	//   36   69:iload_2         
	//   37   70:putfield        #19  <Field int zzbuk>
					return;
	//   38   73:return          
				} else
				{
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   39   74:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   40   77:athrow          
				}
			i = zzbui.zzus();
	//   41   78:aload_0         
	//   42   79:getfield        #31  <Field zztq zzbui>
	//   43   82:invokevirtual   #206 <Method int zztq.zzus()>
	//   44   85:istore_2        
			zzax(i);
	//   45   86:iload_2         
	//   46   87:invokestatic    #314 <Method void zzax(int)>
			int k = zzbui.zzva();
	//   47   90:aload_0         
	//   48   91:getfield        #31  <Field zztq zzbui>
	//   49   94:invokevirtual   #202 <Method int zztq.zzva()>
	//   50   97:istore_3        
			do
				((zzup) (list)).zzbo(zzbui.zzuu());
	//   51   98:aload_1         
	//   52   99:aload_0         
	//   53  100:getfield        #31  <Field zztq zzbui>
	//   54  103:invokevirtual   #357 <Method int zztq.zzuu()>
	//   55  106:invokevirtual   #335 <Method void zzup.zzbo(int)>
			while(zzbui.zzva() < k + i);
	//   56  109:aload_0         
	//   57  110:getfield        #31  <Field zztq zzbui>
	//   58  113:invokevirtual   #202 <Method int zztq.zzva()>
	//   59  116:iload_3         
	//   60  117:iload_2         
	//   61  118:iadd            
	//   62  119:icmplt          98
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #165 <Field int tag>
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
					list.add(((Object) (Integer.valueOf(zzbui.zzuu()))));
	//   75  141:aload_1         
	//   76  142:aload_0         
	//   77  143:getfield        #31  <Field zztq zzbui>
	//   78  146:invokevirtual   #357 <Method int zztq.zzuu()>
	//   79  149:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   80  152:invokeinterface #185 <Method boolean List.add(Object)>
	//   81  157:pop             
					if(zzbui.zzuz())
	//*  82  158:aload_0         
	//*  83  159:getfield        #31  <Field zztq zzbui>
	//*  84  162:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  85  165:ifeq            169
						return;
	//   86  168:return          
					j = zzbui.zzuj();
	//   87  169:aload_0         
	//   88  170:getfield        #31  <Field zztq zzbui>
	//   89  173:invokevirtual   #176 <Method int zztq.zzuj()>
	//   90  176:istore_2        
				} while(j == tag);
	//   91  177:iload_2         
	//   92  178:aload_0         
	//   93  179:getfield        #165 <Field int tag>
	//   94  182:icmpeq          141
				zzbuk = j;
	//   95  185:aload_0         
	//   96  186:iload_2         
	//   97  187:putfield        #19  <Field int zzbuk>
				return;
	//   98  190:return          
			} else
			{
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   99  191:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//  100  194:athrow          
			}
		j = zzbui.zzus();
	//  101  195:aload_0         
	//  102  196:getfield        #31  <Field zztq zzbui>
	//  103  199:invokevirtual   #206 <Method int zztq.zzus()>
	//  104  202:istore_2        
		zzax(j);
	//  105  203:iload_2         
	//  106  204:invokestatic    #314 <Method void zzax(int)>
		int l = zzbui.zzva();
	//  107  207:aload_0         
	//  108  208:getfield        #31  <Field zztq zzbui>
	//  109  211:invokevirtual   #202 <Method int zztq.zzva()>
	//  110  214:istore_3        
		do
			list.add(((Object) (Integer.valueOf(zzbui.zzuu()))));
	//  111  215:aload_1         
	//  112  216:aload_0         
	//  113  217:getfield        #31  <Field zztq zzbui>
	//  114  220:invokevirtual   #357 <Method int zztq.zzuu()>
	//  115  223:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  116  226:invokeinterface #185 <Method boolean List.add(Object)>
	//  117  231:pop             
		while(zzbui.zzva() < l + j);
	//  118  232:aload_0         
	//  119  233:getfield        #31  <Field zztq zzbui>
	//  120  236:invokevirtual   #202 <Method int zztq.zzva()>
	//  121  239:iload_3         
	//  122  240:iload_2         
	//  123  241:iadd            
	//  124  242:icmplt          215
	//  125  245:return          
	}

	public final long zzuk()
		throws IOException
	{
		zzav(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzuk();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #319 <Method long zztq.zzuk()>
	//    6   12:lreturn         
	}

	public final long zzul()
		throws IOException
	{
		zzav(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzul();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #328 <Method long zztq.zzul()>
	//    6   12:lreturn         
	}

	public final int zzum()
		throws IOException
	{
		zzav(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzum();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #332 <Method int zztq.zzum()>
	//    6   12:ireturn         
	}

	public final long zzun()
		throws IOException
	{
		zzav(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzun();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #338 <Method long zztq.zzun()>
	//    6   12:lreturn         
	}

	public final int zzuo()
		throws IOException
	{
		zzav(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzuo();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #340 <Method int zztq.zzuo()>
	//    6   12:ireturn         
	}

	public final boolean zzup()
		throws IOException
	{
		zzav(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzup();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #344 <Method boolean zztq.zzup()>
	//    6   12:ireturn         
	}

	public final String zzuq()
		throws IOException
	{
		zzav(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzuq();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #358 <Method String zztq.zzuq()>
	//    6   12:areturn         
	}

	public final zzte zzur()
		throws IOException
	{
		zzav(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzur();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #359 <Method zzte zztq.zzur()>
	//    6   12:areturn         
	}

	public final int zzus()
		throws IOException
	{
		zzav(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzus();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #206 <Method int zztq.zzus()>
	//    6   12:ireturn         
	}

	public final int zzut()
		throws IOException
	{
		zzav(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzut();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #355 <Method int zztq.zzut()>
	//    6   12:ireturn         
	}

	public final int zzuu()
		throws IOException
	{
		zzav(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzuu();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #357 <Method int zztq.zzuu()>
	//    6   12:ireturn         
	}

	public final long zzuv()
		throws IOException
	{
		zzav(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzuv();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #360 <Method long zztq.zzuv()>
	//    6   12:lreturn         
	}

	public final int zzuw()
		throws IOException
	{
		zzav(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzuw();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #361 <Method int zztq.zzuw()>
	//    6   12:ireturn         
	}

	public final long zzux()
		throws IOException
	{
		zzav(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #99  <Method void zzav(int)>
		return zzbui.zzux();
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zztq zzbui>
	//    5    9:invokevirtual   #362 <Method long zztq.zzux()>
	//    6   12:lreturn         
	}

	public final void zzv(List list)
		throws IOException
	{
		if(list instanceof zzvj)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #318 <Class zzvj>
	//*   2    4:ifeq            133
		{
			list = ((List) ((zzvj)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #318 <Class zzvj>
	//    5   11:astore_1        
			switch(tag & 7)
	//*   6   12:aload_0         
	//*   7   13:getfield        #165 <Field int tag>
	//*   8   16:bipush          7
	//*   9   18:iand            
			{
	//*  10   19:tableswitch     1 2: default 40
	//	               1 89
	//	               2 44
			default:
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   11   40:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   12   43:athrow          

			case 2: // '\002'
				int i = zzbui.zzus();
	//   13   44:aload_0         
	//   14   45:getfield        #31  <Field zztq zzbui>
	//   15   48:invokevirtual   #206 <Method int zztq.zzus()>
	//   16   51:istore_2        
				zzaw(i);
	//   17   52:iload_2         
	//   18   53:invokestatic    #302 <Method void zzaw(int)>
				int i1 = zzbui.zzva();
	//   19   56:aload_0         
	//   20   57:getfield        #31  <Field zztq zzbui>
	//   21   60:invokevirtual   #202 <Method int zztq.zzva()>
	//   22   63:istore_3        
				do
					((zzvj) (list)).zzbe(zzbui.zzuv());
	//   23   64:aload_1         
	//   24   65:aload_0         
	//   25   66:getfield        #31  <Field zztq zzbui>
	//   26   69:invokevirtual   #360 <Method long zztq.zzuv()>
	//   27   72:invokevirtual   #323 <Method void zzvj.zzbe(long)>
				while(zzbui.zzva() < i1 + i);
	//   28   75:aload_0         
	//   29   76:getfield        #31  <Field zztq zzbui>
	//   30   79:invokevirtual   #202 <Method int zztq.zzva()>
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
				((zzvj) (list)).zzbe(zzbui.zzuv());
	//   36   89:aload_1         
	//   37   90:aload_0         
	//   38   91:getfield        #31  <Field zztq zzbui>
	//   39   94:invokevirtual   #360 <Method long zztq.zzuv()>
	//   40   97:invokevirtual   #323 <Method void zzvj.zzbe(long)>
				if(zzbui.zzuz())
	//*  41  100:aload_0         
	//*  42  101:getfield        #31  <Field zztq zzbui>
	//*  43  104:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  44  107:ifeq            111
					return;
	//   45  110:return          
				j = zzbui.zzuj();
	//   46  111:aload_0         
	//   47  112:getfield        #31  <Field zztq zzbui>
	//   48  115:invokevirtual   #176 <Method int zztq.zzuj()>
	//   49  118:istore_2        
			} while(j == tag);
	//   50  119:iload_2         
	//   51  120:aload_0         
	//   52  121:getfield        #165 <Field int tag>
	//   53  124:icmpeq          89
			zzbuk = j;
	//   54  127:aload_0         
	//   55  128:iload_2         
	//   56  129:putfield        #19  <Field int zzbuk>
			return;
	//   57  132:return          
		}
		switch(tag & 7)
	//*  58  133:aload_0         
	//*  59  134:getfield        #165 <Field int tag>
	//*  60  137:bipush          7
	//*  61  139:iand            
		{
	//*  62  140:tableswitch     1 2: default 164
	//	               1 219
	//	               2 168
		default:
			throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   63  164:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   64  167:athrow          

		case 2: // '\002'
			int k = zzbui.zzus();
	//   65  168:aload_0         
	//   66  169:getfield        #31  <Field zztq zzbui>
	//   67  172:invokevirtual   #206 <Method int zztq.zzus()>
	//   68  175:istore_2        
			zzaw(k);
	//   69  176:iload_2         
	//   70  177:invokestatic    #302 <Method void zzaw(int)>
			int j1 = zzbui.zzva();
	//   71  180:aload_0         
	//   72  181:getfield        #31  <Field zztq zzbui>
	//   73  184:invokevirtual   #202 <Method int zztq.zzva()>
	//   74  187:istore_3        
			do
				list.add(((Object) (Long.valueOf(zzbui.zzuv()))));
	//   75  188:aload_1         
	//   76  189:aload_0         
	//   77  190:getfield        #31  <Field zztq zzbui>
	//   78  193:invokevirtual   #360 <Method long zztq.zzuv()>
	//   79  196:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   80  199:invokeinterface #185 <Method boolean List.add(Object)>
	//   81  204:pop             
			while(zzbui.zzva() < j1 + k);
	//   82  205:aload_0         
	//   83  206:getfield        #31  <Field zztq zzbui>
	//   84  209:invokevirtual   #202 <Method int zztq.zzva()>
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
			list.add(((Object) (Long.valueOf(zzbui.zzuv()))));
	//   90  219:aload_1         
	//   91  220:aload_0         
	//   92  221:getfield        #31  <Field zztq zzbui>
	//   93  224:invokevirtual   #360 <Method long zztq.zzuv()>
	//   94  227:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   95  230:invokeinterface #185 <Method boolean List.add(Object)>
	//   96  235:pop             
			if(zzbui.zzuz())
	//*  97  236:aload_0         
	//*  98  237:getfield        #31  <Field zztq zzbui>
	//*  99  240:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//* 100  243:ifeq            247
				return;
	//  101  246:return          
			l = zzbui.zzuj();
	//  102  247:aload_0         
	//  103  248:getfield        #31  <Field zztq zzbui>
	//  104  251:invokevirtual   #176 <Method int zztq.zzuj()>
	//  105  254:istore_2        
		} while(l == tag);
	//  106  255:iload_2         
	//  107  256:aload_0         
	//  108  257:getfield        #165 <Field int tag>
	//  109  260:icmpeq          219
		zzbuk = l;
	//  110  263:aload_0         
	//  111  264:iload_2         
	//  112  265:putfield        #19  <Field int zzbuk>
	//  113  268:return          
	}

	public final int zzvh()
		throws IOException
	{
		int i = zzbuk;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int zzbuk>
	//    2    4:istore_1        
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            22
		{
			tag = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #165 <Field int tag>
			zzbuk = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #19  <Field int zzbuk>
		} else
	//*  11   19:goto            33
		{
			tag = zzbui.zzuj();
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #31  <Field zztq zzbui>
	//   15   27:invokevirtual   #176 <Method int zztq.zzuj()>
	//   16   30:putfield        #165 <Field int tag>
		}
		i = tag;
	//   17   33:aload_0         
	//   18   34:getfield        #165 <Field int tag>
	//   19   37:istore_1        
		if(i != 0 && i != zzbuj)
	//*  20   38:iload_1         
	//*  21   39:ifeq            57
	//*  22   42:iload_1         
	//*  23   43:aload_0         
	//*  24   44:getfield        #242 <Field int zzbuj>
	//*  25   47:icmpne          53
	//*  26   50:goto            57
			return i >>> 3;
	//   27   53:iload_1         
	//   28   54:iconst_3        
	//   29   55:iushr           
	//   30   56:ireturn         
		else
			return 0x7fffffff;
	//   31   57:ldc2            #269 <Int 0x7fffffff>
	//   32   60:ireturn         
	}

	public final boolean zzvi()
		throws IOException
	{
		if(!zzbui.zzuz())
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field zztq zzbui>
	//*   2    4:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*   3    7:ifne            35
		{
			int i = tag;
	//    4   10:aload_0         
	//    5   11:getfield        #165 <Field int tag>
	//    6   14:istore_1        
			if(i != zzbuj)
	//*   7   15:iload_1         
	//*   8   16:aload_0         
	//*   9   17:getfield        #242 <Field int zzbuj>
	//*  10   20:icmpne          26
	//*  11   23:goto            35
				return zzbui.zzaq(i);
	//   12   26:aload_0         
	//   13   27:getfield        #31  <Field zztq zzbui>
	//   14   30:iload_1         
	//   15   31:invokevirtual   #367 <Method boolean zztq.zzaq(int)>
	//   16   34:ireturn         
		}
		return false;
	//   17   35:iconst_0        
	//   18   36:ireturn         
	}

	public final void zzw(List list)
		throws IOException
	{
		if(list instanceof zzup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #331 <Class zzup>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzup)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #331 <Class zzup>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #165 <Field int tag>
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
					i = zzbui.zzus();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zztq zzbui>
	//   18   33:invokevirtual   #206 <Method int zztq.zzus()>
	//   19   36:istore_2        
					i = zzbui.zzva() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zztq zzbui>
	//   22   41:invokevirtual   #202 <Method int zztq.zzva()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzup) (list)).zzbo(zzbui.zzuw());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zztq zzbui>
	//   29   52:invokevirtual   #361 <Method int zztq.zzuw()>
	//   30   55:invokevirtual   #335 <Method void zzup.zzbo(int)>
					while(zzbui.zzva() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zztq zzbui>
	//   33   62:invokevirtual   #202 <Method int zztq.zzva()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzay(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #325 <Method void zzay(int)>
					return;
	//   39   74:return          
				} else
				{
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   40   75:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   41   78:athrow          
				}
			do
			{
				((zzup) (list)).zzbo(zzbui.zzuw());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zztq zzbui>
	//   45   84:invokevirtual   #361 <Method int zztq.zzuw()>
	//   46   87:invokevirtual   #335 <Method void zzup.zzbo(int)>
				if(zzbui.zzuz())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zztq zzbui>
	//*  49   94:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzbui.zzuj();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zztq zzbui>
	//   54  105:invokevirtual   #176 <Method int zztq.zzuj()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #165 <Field int tag>
	//   59  114:icmpeq          79
			zzbuk = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzbuk>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #165 <Field int tag>
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
				j = zzbui.zzus();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zztq zzbui>
	//   76  144:invokevirtual   #206 <Method int zztq.zzus()>
	//   77  147:istore_2        
				j = zzbui.zzva() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zztq zzbui>
	//   80  152:invokevirtual   #202 <Method int zztq.zzva()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Integer.valueOf(zzbui.zzuw()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zztq zzbui>
	//   87  163:invokevirtual   #361 <Method int zztq.zzuw()>
	//   88  166:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   89  169:invokeinterface #185 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzbui.zzva() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zztq zzbui>
	//   93  179:invokevirtual   #202 <Method int zztq.zzva()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzay(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #325 <Method void zzay(int)>
				return;
	//   99  191:return          
			} else
			{
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//  100  192:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Integer.valueOf(zzbui.zzuw()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zztq zzbui>
	//  105  201:invokevirtual   #361 <Method int zztq.zzuw()>
	//  106  204:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  107  207:invokeinterface #185 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzbui.zzuz())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zztq zzbui>
	//* 111  217:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzbui.zzuj();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zztq zzbui>
	//  116  228:invokevirtual   #176 <Method int zztq.zzuj()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #165 <Field int tag>
	//  121  237:icmpeq          196
		zzbuk = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzbuk>
	//  125  245:return          
	}

	public final void zzx(List list)
		throws IOException
	{
		if(list instanceof zzvj)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #318 <Class zzvj>
	//*   2    4:ifeq            123
		{
			list = ((List) ((zzvj)list));
	//    3    7:aload_1         
	//    4    8:checkcast       #318 <Class zzvj>
	//    5   11:astore_1        
			int i = tag & 7;
	//    6   12:aload_0         
	//    7   13:getfield        #165 <Field int tag>
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
					i = zzbui.zzus();
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field zztq zzbui>
	//   18   33:invokevirtual   #206 <Method int zztq.zzus()>
	//   19   36:istore_2        
					i = zzbui.zzva() + i;
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field zztq zzbui>
	//   22   41:invokevirtual   #202 <Method int zztq.zzva()>
	//   23   44:iload_2         
	//   24   45:iadd            
	//   25   46:istore_2        
					do
						((zzvj) (list)).zzbe(zzbui.zzux());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field zztq zzbui>
	//   29   52:invokevirtual   #362 <Method long zztq.zzux()>
	//   30   55:invokevirtual   #323 <Method void zzvj.zzbe(long)>
					while(zzbui.zzva() < i);
	//   31   58:aload_0         
	//   32   59:getfield        #31  <Field zztq zzbui>
	//   33   62:invokevirtual   #202 <Method int zztq.zzva()>
	//   34   65:iload_2         
	//   35   66:icmplt          47
					zzay(i);
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:invokespecial   #325 <Method void zzay(int)>
					return;
	//   39   74:return          
				} else
				{
					throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//   40   75:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//   41   78:athrow          
				}
			do
			{
				((zzvj) (list)).zzbe(zzbui.zzux());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #31  <Field zztq zzbui>
	//   45   84:invokevirtual   #362 <Method long zztq.zzux()>
	//   46   87:invokevirtual   #323 <Method void zzvj.zzbe(long)>
				if(zzbui.zzuz())
	//*  47   90:aload_0         
	//*  48   91:getfield        #31  <Field zztq zzbui>
	//*  49   94:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//*  50   97:ifeq            101
					return;
	//   51  100:return          
				i = zzbui.zzuj();
	//   52  101:aload_0         
	//   53  102:getfield        #31  <Field zztq zzbui>
	//   54  105:invokevirtual   #176 <Method int zztq.zzuj()>
	//   55  108:istore_2        
			} while(i == tag);
	//   56  109:iload_2         
	//   57  110:aload_0         
	//   58  111:getfield        #165 <Field int tag>
	//   59  114:icmpeq          79
			zzbuk = i;
	//   60  117:aload_0         
	//   61  118:iload_2         
	//   62  119:putfield        #19  <Field int zzbuk>
			return;
	//   63  122:return          
		}
		int j = tag & 7;
	//   64  123:aload_0         
	//   65  124:getfield        #165 <Field int tag>
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
				j = zzbui.zzus();
	//   74  140:aload_0         
	//   75  141:getfield        #31  <Field zztq zzbui>
	//   76  144:invokevirtual   #206 <Method int zztq.zzus()>
	//   77  147:istore_2        
				j = zzbui.zzva() + j;
	//   78  148:aload_0         
	//   79  149:getfield        #31  <Field zztq zzbui>
	//   80  152:invokevirtual   #202 <Method int zztq.zzva()>
	//   81  155:iload_2         
	//   82  156:iadd            
	//   83  157:istore_2        
				do
					list.add(((Object) (Long.valueOf(zzbui.zzux()))));
	//   84  158:aload_1         
	//   85  159:aload_0         
	//   86  160:getfield        #31  <Field zztq zzbui>
	//   87  163:invokevirtual   #362 <Method long zztq.zzux()>
	//   88  166:invokestatic    #71  <Method Long Long.valueOf(long)>
	//   89  169:invokeinterface #185 <Method boolean List.add(Object)>
	//   90  174:pop             
				while(zzbui.zzva() < j);
	//   91  175:aload_0         
	//   92  176:getfield        #31  <Field zztq zzbui>
	//   93  179:invokevirtual   #202 <Method int zztq.zzva()>
	//   94  182:iload_2         
	//   95  183:icmplt          158
				zzay(j);
	//   96  186:aload_0         
	//   97  187:iload_2         
	//   98  188:invokespecial   #325 <Method void zzay(int)>
				return;
	//   99  191:return          
			} else
			{
				throw com.google.android.gms.internal.measurement.zzuv.zzwu();
	//  100  192:invokestatic    #191 <Method zzuw zzuv.zzwu()>
	//  101  195:athrow          
			}
		do
		{
			list.add(((Object) (Long.valueOf(zzbui.zzux()))));
	//  102  196:aload_1         
	//  103  197:aload_0         
	//  104  198:getfield        #31  <Field zztq zzbui>
	//  105  201:invokevirtual   #362 <Method long zztq.zzux()>
	//  106  204:invokestatic    #71  <Method Long Long.valueOf(long)>
	//  107  207:invokeinterface #185 <Method boolean List.add(Object)>
	//  108  212:pop             
			if(zzbui.zzuz())
	//* 109  213:aload_0         
	//* 110  214:getfield        #31  <Field zztq zzbui>
	//* 111  217:invokevirtual   #173 <Method boolean zztq.zzuz()>
	//* 112  220:ifeq            224
				return;
	//  113  223:return          
			j = zzbui.zzuj();
	//  114  224:aload_0         
	//  115  225:getfield        #31  <Field zztq zzbui>
	//  116  228:invokevirtual   #176 <Method int zztq.zzuj()>
	//  117  231:istore_2        
		} while(j == tag);
	//  118  232:iload_2         
	//  119  233:aload_0         
	//  120  234:getfield        #165 <Field int tag>
	//  121  237:icmpeq          196
		zzbuk = j;
	//  122  240:aload_0         
	//  123  241:iload_2         
	//  124  242:putfield        #19  <Field int zzbuk>
	//  125  245:return          
	}

	private int tag;
	private final zztq zzbui;
	private int zzbuj;
	private int zzbuk;
}
