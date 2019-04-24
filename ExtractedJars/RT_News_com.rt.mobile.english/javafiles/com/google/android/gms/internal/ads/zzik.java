// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbfl, zzbez, zzia, 
//			zzbfa, zzbfi

public final class zzik extends zzbfc
{

	public zzik()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void zzbfc()>
		zzanu = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #15  <Field Integer zzanu>
		zzans = zzbfl.zzeby;
	//    5    9:aload_0         
	//    6   10:getstatic       #20  <Field int[] zzbfl.zzeby>
	//    7   13:putfield        #22  <Field int[] zzans>
		zzebk = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #26  <Field zzbfe zzebk>
		zzebt = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #30  <Field int zzebt>
	//   14   26:return          
	}

	private final zzik zzm(zzbez zzbez1)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            296
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          259
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          161
				{
					if(i != 18)
	//*  11   21:iload_2         
	//*  12   22:bipush          18
	//*  13   24:icmpeq          38
					{
						if(!super.zza(zzbez1, i))
	//*  14   27:aload_0         
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokespecial   #47  <Method boolean zzbfc.zza(zzbez, int)>
	//*  18   33:ifne            0
							return this;
	//   19   36:aload_0         
	//   20   37:areturn         
					} else
					{
						int i1 = zzbez1.zzbr(zzbez1.zzacc());
	//   21   38:aload_1         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #50  <Method int zzbez.zzacc()>
	//   24   43:invokevirtual   #54  <Method int zzbez.zzbr(int)>
	//   25   46:istore          4
						i = zzbez1.getPosition();
	//   26   48:aload_1         
	//   27   49:invokevirtual   #57  <Method int zzbez.getPosition()>
	//   28   52:istore_2        
						int j;
						for(j = 0; zzbez1.zzagn() > 0; j++)
	//*  29   53:iconst_0        
	//*  30   54:istore_3        
	//*  31   55:aload_1         
	//*  32   56:invokevirtual   #60  <Method int zzbez.zzagn()>
	//*  33   59:ifle            74
							zzbez1.zzacc();
	//   34   62:aload_1         
	//   35   63:invokevirtual   #50  <Method int zzbez.zzacc()>
	//   36   66:pop             

	//   37   67:iload_3         
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:istore_3        
	//*  41   71:goto            55
						zzbez1.zzdc(i);
	//   42   74:aload_1         
	//   43   75:iload_2         
	//   44   76:invokevirtual   #64  <Method void zzbez.zzdc(int)>
						if(zzans == null)
	//*  45   79:aload_0         
	//*  46   80:getfield        #22  <Field int[] zzans>
	//*  47   83:ifnonnull       91
							i = 0;
	//   48   86:iconst_0        
	//   49   87:istore_2        
						else
	//*  50   88:goto            97
							i = zzans.length;
	//   51   91:aload_0         
	//   52   92:getfield        #22  <Field int[] zzans>
	//   53   95:arraylength     
	//   54   96:istore_2        
						int ai[] = new int[j + i];
	//   55   97:iload_3         
	//   56   98:iload_2         
	//   57   99:iadd            
	//   58  100:newarray        int[]
	//   59  102:astore          5
						j = i;
	//   60  104:iload_2         
	//   61  105:istore_3        
						if(i != 0)
	//*  62  106:iload_2         
	//*  63  107:ifeq            124
						{
							System.arraycopy(((Object) (zzans)), 0, ((Object) (ai)), 0, i);
	//   64  110:aload_0         
	//   65  111:getfield        #22  <Field int[] zzans>
	//   66  114:iconst_0        
	//   67  115:aload           5
	//   68  117:iconst_0        
	//   69  118:iload_2         
	//   70  119:invokestatic    #70  <Method void System.arraycopy(Object, int, Object, int, int)>
							j = i;
	//   71  122:iload_2         
	//   72  123:istore_3        
						}
						for(; j < ai.length; j++)
	//*  73  124:iload_3         
	//*  74  125:aload           5
	//*  75  127:arraylength     
	//*  76  128:icmpge          146
							ai[j] = zzbez1.zzacc();
	//   77  131:aload           5
	//   78  133:iload_3         
	//   79  134:aload_1         
	//   80  135:invokevirtual   #50  <Method int zzbez.zzacc()>
	//   81  138:iastore         

	//   82  139:iload_3         
	//   83  140:iconst_1        
	//   84  141:iadd            
	//   85  142:istore_3        
	//*  86  143:goto            124
						zzans = ai;
	//   87  146:aload_0         
	//   88  147:aload           5
	//   89  149:putfield        #22  <Field int[] zzans>
						zzbez1.zzbs(i1);
	//   90  152:aload_1         
	//   91  153:iload           4
	//   92  155:invokevirtual   #73  <Method void zzbez.zzbs(int)>
					}
				} else
	//*  93  158:goto            0
				{
					int k = zzbfl.zzb(zzbez1, 16);
	//   94  161:aload_1         
	//   95  162:bipush          16
	//   96  164:invokestatic    #77  <Method int zzbfl.zzb(zzbez, int)>
	//   97  167:istore_3        
					if(zzans == null)
	//*  98  168:aload_0         
	//*  99  169:getfield        #22  <Field int[] zzans>
	//* 100  172:ifnonnull       180
						i = 0;
	//  101  175:iconst_0        
	//  102  176:istore_2        
					else
	//* 103  177:goto            186
						i = zzans.length;
	//  104  180:aload_0         
	//  105  181:getfield        #22  <Field int[] zzans>
	//  106  184:arraylength     
	//  107  185:istore_2        
					int ai1[] = new int[k + i];
	//  108  186:iload_3         
	//  109  187:iload_2         
	//  110  188:iadd            
	//  111  189:newarray        int[]
	//  112  191:astore          5
					k = i;
	//  113  193:iload_2         
	//  114  194:istore_3        
					if(i != 0)
	//* 115  195:iload_2         
	//* 116  196:ifeq            213
					{
						System.arraycopy(((Object) (zzans)), 0, ((Object) (ai1)), 0, i);
	//  117  199:aload_0         
	//  118  200:getfield        #22  <Field int[] zzans>
	//  119  203:iconst_0        
	//  120  204:aload           5
	//  121  206:iconst_0        
	//  122  207:iload_2         
	//  123  208:invokestatic    #70  <Method void System.arraycopy(Object, int, Object, int, int)>
						k = i;
	//  124  211:iload_2         
	//  125  212:istore_3        
					}
					for(; k < ai1.length - 1; k++)
	//* 126  213:iload_3         
	//* 127  214:aload           5
	//* 128  216:arraylength     
	//* 129  217:iconst_1        
	//* 130  218:isub            
	//* 131  219:icmpge          242
					{
						ai1[k] = zzbez1.zzacc();
	//  132  222:aload           5
	//  133  224:iload_3         
	//  134  225:aload_1         
	//  135  226:invokevirtual   #50  <Method int zzbez.zzacc()>
	//  136  229:iastore         
						zzbez1.zzabk();
	//  137  230:aload_1         
	//  138  231:invokevirtual   #43  <Method int zzbez.zzabk()>
	//  139  234:pop             
					}

	//  140  235:iload_3         
	//  141  236:iconst_1        
	//  142  237:iadd            
	//  143  238:istore_3        
	//* 144  239:goto            213
					ai1[k] = zzbez1.zzacc();
	//  145  242:aload           5
	//  146  244:iload_3         
	//  147  245:aload_1         
	//  148  246:invokevirtual   #50  <Method int zzbez.zzacc()>
	//  149  249:iastore         
					zzans = ai1;
	//  150  250:aload_0         
	//  151  251:aload           5
	//  152  253:putfield        #22  <Field int[] zzans>
				}
			} else
	//* 153  256:goto            0
			{
				int l = zzbez1.getPosition();
	//  154  259:aload_1         
	//  155  260:invokevirtual   #57  <Method int zzbez.getPosition()>
	//  156  263:istore_3        
				try
				{
					zzanu = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//  157  264:aload_0         
	//  158  265:aload_1         
	//  159  266:invokevirtual   #50  <Method int zzbez.zzacc()>
	//  160  269:invokestatic    #82  <Method int zzia.zzd(int)>
	//  161  272:invokestatic    #88  <Method Integer Integer.valueOf(int)>
	//  162  275:putfield        #15  <Field Integer zzanu>
				}
	//* 163  278:goto            0
	//* 164  281:aload_1         
	//* 165  282:iload_3         
	//* 166  283:invokevirtual   #64  <Method void zzbez.zzdc(int)>
	//* 167  286:aload_0         
	//* 168  287:aload_1         
	//* 169  288:iload_2         
	//* 170  289:invokevirtual   #47  <Method boolean zzbfc.zza(zzbez, int)>
	//* 171  292:pop             
	//* 172  293:goto            0
	//* 173  296:aload_0         
	//* 174  297:areturn         
				// Misplaced declaration of an exception variable
				catch(IllegalArgumentException illegalargumentexception)
				{
					zzbez1.zzdc(l);
					((zzbfc)this).zza(zzbez1, i);
				}
			}
		} while(true);
		return this;
	//* 175  298:astore          5
	//* 176  300:goto            281
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzm(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method zzik zzm(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzanu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Integer zzanu>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzanu.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field Integer zzanu>
	//    7   13:invokevirtual   #96  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #101 <Method void zzbfa.zzm(int, int)>
		if(zzans != null && zzans.length > 0)
	//*   9   19:aload_0         
	//*  10   20:getfield        #22  <Field int[] zzans>
	//*  11   23:ifnull          63
	//*  12   26:aload_0         
	//*  13   27:getfield        #22  <Field int[] zzans>
	//*  14   30:arraylength     
	//*  15   31:ifle            63
		{
			for(int i = 0; i < zzans.length; i++)
	//*  16   34:iconst_0        
	//*  17   35:istore_2        
	//*  18   36:iload_2         
	//*  19   37:aload_0         
	//*  20   38:getfield        #22  <Field int[] zzans>
	//*  21   41:arraylength     
	//*  22   42:icmpge          63
				zzbfa1.zzm(2, zzans[i]);
	//   23   45:aload_1         
	//   24   46:iconst_2        
	//   25   47:aload_0         
	//   26   48:getfield        #22  <Field int[] zzans>
	//   27   51:iload_2         
	//   28   52:iaload          
	//   29   53:invokevirtual   #101 <Method void zzbfa.zzm(int, int)>

	//   30   56:iload_2         
	//   31   57:iconst_1        
	//   32   58:iadd            
	//   33   59:istore_2        
		}
	//*  34   60:goto            36
		super.zza(zzbfa1);
	//   35   63:aload_0         
	//   36   64:aload_1         
	//   37   65:invokespecial   #103 <Method void zzbfc.zza(zzbfa)>
	//   38   68:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzanu != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #15  <Field Integer zzanu>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzanu.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #15  <Field Integer zzanu>
	//   12   20:invokevirtual   #96  <Method int Integer.intValue()>
	//   13   23:invokestatic    #110 <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzans != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #22  <Field int[] zzans>
	//*  20   34:ifnull          91
		{
			j = i;
	//   21   37:iload_1         
	//   22   38:istore_2        
			if(zzans.length > 0)
	//*  23   39:aload_0         
	//*  24   40:getfield        #22  <Field int[] zzans>
	//*  25   43:arraylength     
	//*  26   44:ifle            91
			{
				j = 0;
	//   27   47:iconst_0        
	//   28   48:istore_2        
				int k = 0;
	//   29   49:iconst_0        
	//   30   50:istore_3        
				for(; j < zzans.length; j++)
	//*  31   51:iload_2         
	//*  32   52:aload_0         
	//*  33   53:getfield        #22  <Field int[] zzans>
	//*  34   56:arraylength     
	//*  35   57:icmpge          79
					k += zzbfa.zzce(zzans[j]);
	//   36   60:iload_3         
	//   37   61:aload_0         
	//   38   62:getfield        #22  <Field int[] zzans>
	//   39   65:iload_2         
	//   40   66:iaload          
	//   41   67:invokestatic    #113 <Method int zzbfa.zzce(int)>
	//   42   70:iadd            
	//   43   71:istore_3        

	//   44   72:iload_2         
	//   45   73:iconst_1        
	//   46   74:iadd            
	//   47   75:istore_2        
	//*  48   76:goto            51
				j = i + k + 1 * zzans.length;
	//   49   79:iload_1         
	//   50   80:iload_3         
	//   51   81:iadd            
	//   52   82:iconst_1        
	//   53   83:aload_0         
	//   54   84:getfield        #22  <Field int[] zzans>
	//   55   87:arraylength     
	//   56   88:imul            
	//   57   89:iadd            
	//   58   90:istore_2        
			}
		}
		return j;
	//   59   91:iload_2         
	//   60   92:ireturn         
	}

	private int zzans[];
	private Integer zzanu;
}
