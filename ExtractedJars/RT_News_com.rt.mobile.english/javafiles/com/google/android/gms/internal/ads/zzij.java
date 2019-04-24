// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbfl, zzbez, zzis, 
//			zzia, zzbfa, zzbfi

public final class zzij extends zzbfc
{

	public zzij()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzbfc()>
		zzanq = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field String zzanq>
		zzanr = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field Integer zzanr>
		zzans = zzbfl.zzeby;
	//    8   14:aload_0         
	//    9   15:getstatic       #26  <Field int[] zzbfl.zzeby>
	//   10   18:putfield        #28  <Field int[] zzans>
		zzant = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #30  <Field zzis zzant>
		zzebk = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #34  <Field zzbfe zzebk>
		zzebt = -1;
	//   17   31:aload_0         
	//   18   32:iconst_m1       
	//   19   33:putfield        #38  <Field int zzebt>
	//   20   36:return          
	}

	private final zzij zzl(zzbez zzbez1)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #51  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            348
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          337
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          300
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          202
					{
						if(i != 26)
	//*  14   27:iload_2         
	//*  15   28:bipush          26
	//*  16   30:icmpeq          79
						{
							if(i != 34)
	//*  17   33:iload_2         
	//*  18   34:bipush          34
	//*  19   36:icmpeq          50
							{
								if(!super.zza(zzbez1, i))
	//*  20   39:aload_0         
	//*  21   40:aload_1         
	//*  22   41:iload_2         
	//*  23   42:invokespecial   #55  <Method boolean zzbfc.zza(zzbez, int)>
	//*  24   45:ifne            0
									return this;
	//   25   48:aload_0         
	//   26   49:areturn         
							} else
							{
								if(zzant == null)
	//*  27   50:aload_0         
	//*  28   51:getfield        #30  <Field zzis zzant>
	//*  29   54:ifnonnull       68
									zzant = new zzis();
	//   30   57:aload_0         
	//   31   58:new             #57  <Class zzis>
	//   32   61:dup             
	//   33   62:invokespecial   #58  <Method void zzis()>
	//   34   65:putfield        #30  <Field zzis zzant>
								zzbez1.zza(((zzbfi) (zzant)));
	//   35   68:aload_1         
	//   36   69:aload_0         
	//   37   70:getfield        #30  <Field zzis zzant>
	//   38   73:invokevirtual   #61  <Method void zzbez.zza(zzbfi)>
							}
						} else
	//*  39   76:goto            0
						{
							int i1 = zzbez1.zzbr(zzbez1.zzacc());
	//   40   79:aload_1         
	//   41   80:aload_1         
	//   42   81:invokevirtual   #64  <Method int zzbez.zzacc()>
	//   43   84:invokevirtual   #68  <Method int zzbez.zzbr(int)>
	//   44   87:istore          4
							i = zzbez1.getPosition();
	//   45   89:aload_1         
	//   46   90:invokevirtual   #71  <Method int zzbez.getPosition()>
	//   47   93:istore_2        
							int j;
							for(j = 0; zzbez1.zzagn() > 0; j++)
	//*  48   94:iconst_0        
	//*  49   95:istore_3        
	//*  50   96:aload_1         
	//*  51   97:invokevirtual   #74  <Method int zzbez.zzagn()>
	//*  52  100:ifle            115
								zzbez1.zzacc();
	//   53  103:aload_1         
	//   54  104:invokevirtual   #64  <Method int zzbez.zzacc()>
	//   55  107:pop             

	//   56  108:iload_3         
	//   57  109:iconst_1        
	//   58  110:iadd            
	//   59  111:istore_3        
	//*  60  112:goto            96
							zzbez1.zzdc(i);
	//   61  115:aload_1         
	//   62  116:iload_2         
	//   63  117:invokevirtual   #78  <Method void zzbez.zzdc(int)>
							if(zzans == null)
	//*  64  120:aload_0         
	//*  65  121:getfield        #28  <Field int[] zzans>
	//*  66  124:ifnonnull       132
								i = 0;
	//   67  127:iconst_0        
	//   68  128:istore_2        
							else
	//*  69  129:goto            138
								i = zzans.length;
	//   70  132:aload_0         
	//   71  133:getfield        #28  <Field int[] zzans>
	//   72  136:arraylength     
	//   73  137:istore_2        
							int ai[] = new int[j + i];
	//   74  138:iload_3         
	//   75  139:iload_2         
	//   76  140:iadd            
	//   77  141:newarray        int[]
	//   78  143:astore          5
							j = i;
	//   79  145:iload_2         
	//   80  146:istore_3        
							if(i != 0)
	//*  81  147:iload_2         
	//*  82  148:ifeq            165
							{
								System.arraycopy(((Object) (zzans)), 0, ((Object) (ai)), 0, i);
	//   83  151:aload_0         
	//   84  152:getfield        #28  <Field int[] zzans>
	//   85  155:iconst_0        
	//   86  156:aload           5
	//   87  158:iconst_0        
	//   88  159:iload_2         
	//   89  160:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
								j = i;
	//   90  163:iload_2         
	//   91  164:istore_3        
							}
							for(; j < ai.length; j++)
	//*  92  165:iload_3         
	//*  93  166:aload           5
	//*  94  168:arraylength     
	//*  95  169:icmpge          187
								ai[j] = zzbez1.zzacc();
	//   96  172:aload           5
	//   97  174:iload_3         
	//   98  175:aload_1         
	//   99  176:invokevirtual   #64  <Method int zzbez.zzacc()>
	//  100  179:iastore         

	//  101  180:iload_3         
	//  102  181:iconst_1        
	//  103  182:iadd            
	//  104  183:istore_3        
	//* 105  184:goto            165
							zzans = ai;
	//  106  187:aload_0         
	//  107  188:aload           5
	//  108  190:putfield        #28  <Field int[] zzans>
							zzbez1.zzbs(i1);
	//  109  193:aload_1         
	//  110  194:iload           4
	//  111  196:invokevirtual   #87  <Method void zzbez.zzbs(int)>
						}
					} else
	//* 112  199:goto            0
					{
						int k = zzbfl.zzb(zzbez1, 24);
	//  113  202:aload_1         
	//  114  203:bipush          24
	//  115  205:invokestatic    #91  <Method int zzbfl.zzb(zzbez, int)>
	//  116  208:istore_3        
						if(zzans == null)
	//* 117  209:aload_0         
	//* 118  210:getfield        #28  <Field int[] zzans>
	//* 119  213:ifnonnull       221
							i = 0;
	//  120  216:iconst_0        
	//  121  217:istore_2        
						else
	//* 122  218:goto            227
							i = zzans.length;
	//  123  221:aload_0         
	//  124  222:getfield        #28  <Field int[] zzans>
	//  125  225:arraylength     
	//  126  226:istore_2        
						int ai1[] = new int[k + i];
	//  127  227:iload_3         
	//  128  228:iload_2         
	//  129  229:iadd            
	//  130  230:newarray        int[]
	//  131  232:astore          5
						k = i;
	//  132  234:iload_2         
	//  133  235:istore_3        
						if(i != 0)
	//* 134  236:iload_2         
	//* 135  237:ifeq            254
						{
							System.arraycopy(((Object) (zzans)), 0, ((Object) (ai1)), 0, i);
	//  136  240:aload_0         
	//  137  241:getfield        #28  <Field int[] zzans>
	//  138  244:iconst_0        
	//  139  245:aload           5
	//  140  247:iconst_0        
	//  141  248:iload_2         
	//  142  249:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
							k = i;
	//  143  252:iload_2         
	//  144  253:istore_3        
						}
						for(; k < ai1.length - 1; k++)
	//* 145  254:iload_3         
	//* 146  255:aload           5
	//* 147  257:arraylength     
	//* 148  258:iconst_1        
	//* 149  259:isub            
	//* 150  260:icmpge          283
						{
							ai1[k] = zzbez1.zzacc();
	//  151  263:aload           5
	//  152  265:iload_3         
	//  153  266:aload_1         
	//  154  267:invokevirtual   #64  <Method int zzbez.zzacc()>
	//  155  270:iastore         
							zzbez1.zzabk();
	//  156  271:aload_1         
	//  157  272:invokevirtual   #51  <Method int zzbez.zzabk()>
	//  158  275:pop             
						}

	//  159  276:iload_3         
	//  160  277:iconst_1        
	//  161  278:iadd            
	//  162  279:istore_3        
	//* 163  280:goto            254
						ai1[k] = zzbez1.zzacc();
	//  164  283:aload           5
	//  165  285:iload_3         
	//  166  286:aload_1         
	//  167  287:invokevirtual   #64  <Method int zzbez.zzacc()>
	//  168  290:iastore         
						zzans = ai1;
	//  169  291:aload_0         
	//  170  292:aload           5
	//  171  294:putfield        #28  <Field int[] zzans>
					}
				} else
	//* 172  297:goto            0
				{
					int l = zzbez1.getPosition();
	//  173  300:aload_1         
	//  174  301:invokevirtual   #71  <Method int zzbez.getPosition()>
	//  175  304:istore_3        
					try
					{
						zzanr = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//  176  305:aload_0         
	//  177  306:aload_1         
	//  178  307:invokevirtual   #64  <Method int zzbez.zzacc()>
	//  179  310:invokestatic    #96  <Method int zzia.zzd(int)>
	//  180  313:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//  181  316:putfield        #21  <Field Integer zzanr>
					}
	//* 182  319:goto            0
	//* 183  322:aload_1         
	//* 184  323:iload_3         
	//* 185  324:invokevirtual   #78  <Method void zzbez.zzdc(int)>
	//* 186  327:aload_0         
	//* 187  328:aload_1         
	//* 188  329:iload_2         
	//* 189  330:invokevirtual   #55  <Method boolean zzbfc.zza(zzbez, int)>
	//* 190  333:pop             
	//* 191  334:goto            0
	//* 192  337:aload_0         
	//* 193  338:aload_1         
	//* 194  339:invokevirtual   #106 <Method String zzbez.readString()>
	//* 195  342:putfield        #19  <Field String zzanq>
	//* 196  345:goto            0
	//* 197  348:aload_0         
	//* 198  349:areturn         
					// Misplaced declaration of an exception variable
					catch(IllegalArgumentException illegalargumentexception)
					{
						zzbez1.zzdc(l);
						((zzbfc)this).zza(zzbez1, i);
					}
				}
			} else
			{
				zzanq = zzbez1.readString();
			}
		} while(true);
		return this;
	//* 199  350:astore          5
	//* 200  352:goto            322
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzl(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #110 <Method zzij zzl(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzanq != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field String zzanq>
	//*   2    4:ifnull          16
			zzbfa1.zzf(1, zzanq);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field String zzanq>
	//    7   13:invokevirtual   #117 <Method void zzbfa.zzf(int, String)>
		if(zzanr != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #21  <Field Integer zzanr>
	//*  10   20:ifnull          35
			zzbfa1.zzm(2, zzanr.intValue());
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field Integer zzanr>
	//   15   29:invokevirtual   #120 <Method int Integer.intValue()>
	//   16   32:invokevirtual   #124 <Method void zzbfa.zzm(int, int)>
		if(zzans != null && zzans.length > 0)
	//*  17   35:aload_0         
	//*  18   36:getfield        #28  <Field int[] zzans>
	//*  19   39:ifnull          79
	//*  20   42:aload_0         
	//*  21   43:getfield        #28  <Field int[] zzans>
	//*  22   46:arraylength     
	//*  23   47:ifle            79
		{
			for(int i = 0; i < zzans.length; i++)
	//*  24   50:iconst_0        
	//*  25   51:istore_2        
	//*  26   52:iload_2         
	//*  27   53:aload_0         
	//*  28   54:getfield        #28  <Field int[] zzans>
	//*  29   57:arraylength     
	//*  30   58:icmpge          79
				zzbfa1.zzm(3, zzans[i]);
	//   31   61:aload_1         
	//   32   62:iconst_3        
	//   33   63:aload_0         
	//   34   64:getfield        #28  <Field int[] zzans>
	//   35   67:iload_2         
	//   36   68:iaload          
	//   37   69:invokevirtual   #124 <Method void zzbfa.zzm(int, int)>

	//   38   72:iload_2         
	//   39   73:iconst_1        
	//   40   74:iadd            
	//   41   75:istore_2        
		}
	//*  42   76:goto            52
		if(zzant != null)
	//*  43   79:aload_0         
	//*  44   80:getfield        #30  <Field zzis zzant>
	//*  45   83:ifnull          95
			zzbfa1.zza(4, ((zzbfi) (zzant)));
	//   46   86:aload_1         
	//   47   87:iconst_4        
	//   48   88:aload_0         
	//   49   89:getfield        #30  <Field zzis zzant>
	//   50   92:invokevirtual   #127 <Method void zzbfa.zza(int, zzbfi)>
		super.zza(zzbfa1);
	//   51   95:aload_0         
	//   52   96:aload_1         
	//   53   97:invokespecial   #129 <Method void zzbfc.zza(zzbfa)>
	//   54  100:return          
	}

	protected final int zzr()
	{
		int i = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #132 <Method int zzbfc.zzr()>
	//    2    4:istore_1        
		int j = i;
	//    3    5:iload_1         
	//    4    6:istore_2        
		if(zzanq != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #19  <Field String zzanq>
	//*   7   11:ifnull          25
			j = i + zzbfa.zzg(1, zzanq);
	//    8   14:iload_1         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #19  <Field String zzanq>
	//   12   20:invokestatic    #136 <Method int zzbfa.zzg(int, String)>
	//   13   23:iadd            
	//   14   24:istore_2        
		i = j;
	//   15   25:iload_2         
	//   16   26:istore_1        
		if(zzanr != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #21  <Field Integer zzanr>
	//*  19   31:ifnull          48
			i = j + zzbfa.zzq(2, zzanr.intValue());
	//   20   34:iload_2         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #21  <Field Integer zzanr>
	//   24   40:invokevirtual   #120 <Method int Integer.intValue()>
	//   25   43:invokestatic    #140 <Method int zzbfa.zzq(int, int)>
	//   26   46:iadd            
	//   27   47:istore_1        
		j = i;
	//   28   48:iload_1         
	//   29   49:istore_2        
		if(zzans != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #28  <Field int[] zzans>
	//*  32   54:ifnull          111
		{
			j = i;
	//   33   57:iload_1         
	//   34   58:istore_2        
			if(zzans.length > 0)
	//*  35   59:aload_0         
	//*  36   60:getfield        #28  <Field int[] zzans>
	//*  37   63:arraylength     
	//*  38   64:ifle            111
			{
				j = 0;
	//   39   67:iconst_0        
	//   40   68:istore_2        
				int k = 0;
	//   41   69:iconst_0        
	//   42   70:istore_3        
				for(; j < zzans.length; j++)
	//*  43   71:iload_2         
	//*  44   72:aload_0         
	//*  45   73:getfield        #28  <Field int[] zzans>
	//*  46   76:arraylength     
	//*  47   77:icmpge          99
					k += zzbfa.zzce(zzans[j]);
	//   48   80:iload_3         
	//   49   81:aload_0         
	//   50   82:getfield        #28  <Field int[] zzans>
	//   51   85:iload_2         
	//   52   86:iaload          
	//   53   87:invokestatic    #143 <Method int zzbfa.zzce(int)>
	//   54   90:iadd            
	//   55   91:istore_3        

	//   56   92:iload_2         
	//   57   93:iconst_1        
	//   58   94:iadd            
	//   59   95:istore_2        
	//*  60   96:goto            71
				j = i + k + 1 * zzans.length;
	//   61   99:iload_1         
	//   62  100:iload_3         
	//   63  101:iadd            
	//   64  102:iconst_1        
	//   65  103:aload_0         
	//   66  104:getfield        #28  <Field int[] zzans>
	//   67  107:arraylength     
	//   68  108:imul            
	//   69  109:iadd            
	//   70  110:istore_2        
			}
		}
		i = j;
	//   71  111:iload_2         
	//   72  112:istore_1        
		if(zzant != null)
	//*  73  113:aload_0         
	//*  74  114:getfield        #30  <Field zzis zzant>
	//*  75  117:ifnull          131
			i = j + zzbfa.zzb(4, ((zzbfi) (zzant)));
	//   76  120:iload_2         
	//   77  121:iconst_4        
	//   78  122:aload_0         
	//   79  123:getfield        #30  <Field zzis zzant>
	//   80  126:invokestatic    #146 <Method int zzbfa.zzb(int, zzbfi)>
	//   81  129:iadd            
	//   82  130:istore_1        
		return i;
	//   83  131:iload_1         
	//   84  132:ireturn         
	}

	private String zzanq;
	private Integer zzanr;
	private int zzans[];
	private zzis zzant;
}
