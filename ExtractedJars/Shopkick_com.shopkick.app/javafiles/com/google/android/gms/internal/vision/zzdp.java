// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzdm, zzjk, zzjw, 
//			zzdq, zzjl, zzfe, zzjt

public final class zzdp extends zzjn
{

	public zzdp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzjn()>
		zzpi = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field zzdq zzpi>
		zzpk = zzdm.zzcb();
	//    5    9:aload_0         
	//    6   10:invokestatic    #23  <Method zzdm[] zzdm.zzcb()>
	//    7   13:putfield        #25  <Field zzdm[] zzpk>
		zzadp = -1;
	//    8   16:aload_0         
	//    9   17:iconst_m1       
	//   10   18:putfield        #29  <Field int zzadp>
	//   11   21:return          
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
		do
		{
			int i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            207
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          178
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          161
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          38
					{
						if(!super.zza(zzjk1, i))
	//*  14   27:aload_0         
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokespecial   #43  <Method boolean zzjn.zza(zzjk, int)>
	//*  18   33:ifne            0
							return ((zzjt) (this));
	//   19   36:aload_0         
	//   20   37:areturn         
					} else
					{
						int k = zzjw.zzb(zzjk1, 26);
	//   21   38:aload_1         
	//   22   39:bipush          26
	//   23   41:invokestatic    #49  <Method int zzjw.zzb(zzjk, int)>
	//   24   44:istore_3        
						zzdm azzdm[] = zzpk;
	//   25   45:aload_0         
	//   26   46:getfield        #25  <Field zzdm[] zzpk>
	//   27   49:astore          4
						int j;
						if(azzdm == null)
	//*  28   51:aload           4
	//*  29   53:ifnonnull       61
							j = 0;
	//   30   56:iconst_0        
	//   31   57:istore_2        
						else
	//*  32   58:goto            65
							j = azzdm.length;
	//   33   61:aload           4
	//   34   63:arraylength     
	//   35   64:istore_2        
						azzdm = new zzdm[k + j];
	//   36   65:iload_3         
	//   37   66:iload_2         
	//   38   67:iadd            
	//   39   68:anewarray       zzdm[]
	//   40   71:astore          4
						k = j;
	//   41   73:iload_2         
	//   42   74:istore_3        
						if(j != 0)
	//*  43   75:iload_2         
	//*  44   76:ifeq            93
						{
							System.arraycopy(((Object) (zzpk)), 0, ((Object) (azzdm)), 0, j);
	//   45   79:aload_0         
	//   46   80:getfield        #25  <Field zzdm[] zzpk>
	//   47   83:iconst_0        
	//   48   84:aload           4
	//   49   86:iconst_0        
	//   50   87:iload_2         
	//   51   88:invokestatic    #55  <Method void System.arraycopy(Object, int, Object, int, int)>
							k = j;
	//   52   91:iload_2         
	//   53   92:istore_3        
						}
						for(; k < azzdm.length - 1; k++)
	//*  54   93:iload_3         
	//*  55   94:aload           4
	//*  56   96:arraylength     
	//*  57   97:iconst_1        
	//*  58   98:isub            
	//*  59   99:icmpge          133
						{
							azzdm[k] = new zzdm();
	//   60  102:aload           4
	//   61  104:iload_3         
	//   62  105:new             #19  <Class zzdm>
	//   63  108:dup             
	//   64  109:invokespecial   #56  <Method void zzdm()>
	//   65  112:aastore         
							zzjk1.zza(((zzjt) (azzdm[k])));
	//   66  113:aload_1         
	//   67  114:aload           4
	//   68  116:iload_3         
	//   69  117:aaload          
	//   70  118:invokevirtual   #59  <Method void zzjk.zza(zzjt)>
							zzjk1.zzdq();
	//   71  121:aload_1         
	//   72  122:invokevirtual   #40  <Method int zzjk.zzdq()>
	//   73  125:pop             
						}

	//   74  126:iload_3         
	//   75  127:iconst_1        
	//   76  128:iadd            
	//   77  129:istore_3        
	//*  78  130:goto            93
						azzdm[k] = new zzdm();
	//   79  133:aload           4
	//   80  135:iload_3         
	//   81  136:new             #19  <Class zzdm>
	//   82  139:dup             
	//   83  140:invokespecial   #56  <Method void zzdm()>
	//   84  143:aastore         
						zzjk1.zza(((zzjt) (azzdm[k])));
	//   85  144:aload_1         
	//   86  145:aload           4
	//   87  147:iload_3         
	//   88  148:aaload          
	//   89  149:invokevirtual   #59  <Method void zzjk.zza(zzjt)>
						zzpk = azzdm;
	//   90  152:aload_0         
	//   91  153:aload           4
	//   92  155:putfield        #25  <Field zzdm[] zzpk>
					}
				} else
	//*  93  158:goto            0
				{
					zzpj = (zzcz.zzg)zzjk1.zza(zzcz.zzg.zzbx());
	//   94  161:aload_0         
	//   95  162:aload_1         
	//   96  163:invokestatic    #65  <Method zzhq zzcz$zzg.zzbx()>
	//   97  166:invokevirtual   #68  <Method zzfy zzjk.zza(zzhq)>
	//   98  169:checkcast       #61  <Class zzcz$zzg>
	//   99  172:putfield        #70  <Field zzcz$zzg zzpj>
				}
			} else
	//* 100  175:goto            0
			{
				if(zzpi == null)
	//* 101  178:aload_0         
	//* 102  179:getfield        #17  <Field zzdq zzpi>
	//* 103  182:ifnonnull       196
					zzpi = new zzdq();
	//  104  185:aload_0         
	//  105  186:new             #72  <Class zzdq>
	//  106  189:dup             
	//  107  190:invokespecial   #73  <Method void zzdq()>
	//  108  193:putfield        #17  <Field zzdq zzpi>
				zzjk1.zza(((zzjt) (zzpi)));
	//  109  196:aload_1         
	//  110  197:aload_0         
	//  111  198:getfield        #17  <Field zzdq zzpi>
	//  112  201:invokevirtual   #59  <Method void zzjk.zza(zzjt)>
			}
		} while(true);
	//  113  204:goto            0
		return ((zzjt) (this));
	//  114  207:aload_0         
	//  115  208:areturn         
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		Object obj = ((Object) (zzpi));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzdq zzpi>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			zzjl1.zza(1, ((zzjt) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_3         
	//    8   12:invokevirtual   #80  <Method void zzjl.zza(int, zzjt)>
		obj = ((Object) (zzpj));
	//    9   15:aload_0         
	//   10   16:getfield        #70  <Field zzcz$zzg zzpj>
	//   11   19:astore_3        
		if(obj != null)
	//*  12   20:aload_3         
	//*  13   21:ifnull          30
			zzjl1.zze(2, ((zzhf) (obj)));
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_3         
	//   17   27:invokevirtual   #84  <Method void zzjl.zze(int, zzhf)>
		zzdm azzdm[] = zzpk;
	//   18   30:aload_0         
	//   19   31:getfield        #25  <Field zzdm[] zzpk>
	//   20   34:astore_3        
		if(azzdm != null && azzdm.length > 0)
	//*  21   35:aload_3         
	//*  22   36:ifnull          78
	//*  23   39:aload_3         
	//*  24   40:arraylength     
	//*  25   41:ifle            78
		{
			int i = 0;
	//   26   44:iconst_0        
	//   27   45:istore_2        
			do
			{
				zzdm azzdm1[] = zzpk;
	//   28   46:aload_0         
	//   29   47:getfield        #25  <Field zzdm[] zzpk>
	//   30   50:astore_3        
				if(i >= azzdm1.length)
					break;
	//   31   51:iload_2         
	//   32   52:aload_3         
	//   33   53:arraylength     
	//   34   54:icmpge          78
				zzdm zzdm1 = azzdm1[i];
	//   35   57:aload_3         
	//   36   58:iload_2         
	//   37   59:aaload          
	//   38   60:astore_3        
				if(zzdm1 != null)
	//*  39   61:aload_3         
	//*  40   62:ifnull          71
					zzjl1.zza(3, ((zzjt) (zzdm1)));
	//   41   65:aload_1         
	//   42   66:iconst_3        
	//   43   67:aload_3         
	//   44   68:invokevirtual   #80  <Method void zzjl.zza(int, zzjt)>
				i++;
	//   45   71:iload_2         
	//   46   72:iconst_1        
	//   47   73:iadd            
	//   48   74:istore_2        
			} while(true);
	//   49   75:goto            46
		}
		super.zza(zzjl1);
	//   50   78:aload_0         
	//   51   79:aload_1         
	//   52   80:invokespecial   #86  <Method void zzjn.zza(zzjl)>
	//   53   83:return          
	}

	protected final int zzt()
	{
		int i = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method int zzjn.zzt()>
	//    2    4:istore_1        
		Object obj = ((Object) (zzpi));
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field zzdq zzpi>
	//    5    9:astore          4
		int j = i;
	//    6   11:iload_1         
	//    7   12:istore_2        
		if(obj != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          27
			j = i + zzjl.zzb(1, ((zzjt) (obj)));
	//   10   18:iload_1         
	//   11   19:iconst_1        
	//   12   20:aload           4
	//   13   22:invokestatic    #92  <Method int zzjl.zzb(int, zzjt)>
	//   14   25:iadd            
	//   15   26:istore_2        
		obj = ((Object) (zzpj));
	//   16   27:aload_0         
	//   17   28:getfield        #70  <Field zzcz$zzg zzpj>
	//   18   31:astore          4
		i = j;
	//   19   33:iload_2         
	//   20   34:istore_1        
		if(obj != null)
	//*  21   35:aload           4
	//*  22   37:ifnull          49
			i = j + zzfe.zzc(2, ((zzhf) (obj)));
	//   23   40:iload_2         
	//   24   41:iconst_2        
	//   25   42:aload           4
	//   26   44:invokestatic    #98  <Method int zzfe.zzc(int, zzhf)>
	//   27   47:iadd            
	//   28   48:istore_1        
		zzdm azzdm[] = zzpk;
	//   29   49:aload_0         
	//   30   50:getfield        #25  <Field zzdm[] zzpk>
	//   31   53:astore          4
		int l = i;
	//   32   55:iload_1         
	//   33   56:istore_3        
		if(azzdm != null)
	//*  34   57:aload           4
	//*  35   59:ifnull          118
		{
			l = i;
	//   36   62:iload_1         
	//   37   63:istore_3        
			if(azzdm.length > 0)
	//*  38   64:aload           4
	//*  39   66:arraylength     
	//*  40   67:ifle            118
			{
				int k = 0;
	//   41   70:iconst_0        
	//   42   71:istore_2        
				do
				{
					zzdm azzdm1[] = zzpk;
	//   43   72:aload_0         
	//   44   73:getfield        #25  <Field zzdm[] zzpk>
	//   45   76:astore          4
					l = i;
	//   46   78:iload_1         
	//   47   79:istore_3        
					if(k >= azzdm1.length)
						break;
	//   48   80:iload_2         
	//   49   81:aload           4
	//   50   83:arraylength     
	//   51   84:icmpge          118
					zzdm zzdm1 = azzdm1[k];
	//   52   87:aload           4
	//   53   89:iload_2         
	//   54   90:aaload          
	//   55   91:astore          4
					l = i;
	//   56   93:iload_1         
	//   57   94:istore_3        
					if(zzdm1 != null)
	//*  58   95:aload           4
	//*  59   97:ifnull          109
						l = i + zzjl.zzb(3, ((zzjt) (zzdm1)));
	//   60  100:iload_1         
	//   61  101:iconst_3        
	//   62  102:aload           4
	//   63  104:invokestatic    #92  <Method int zzjl.zzb(int, zzjt)>
	//   64  107:iadd            
	//   65  108:istore_3        
					k++;
	//   66  109:iload_2         
	//   67  110:iconst_1        
	//   68  111:iadd            
	//   69  112:istore_2        
					i = l;
	//   70  113:iload_3         
	//   71  114:istore_1        
				} while(true);
	//   72  115:goto            72
			}
		}
		return l;
	//   73  118:iload_3         
	//   74  119:ireturn         
	}

	public zzdq zzpi;
	private zzcz.zzg zzpj;
	public zzdm zzpk[];
}
