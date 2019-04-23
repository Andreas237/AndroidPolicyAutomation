// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzds, zzjk, zzjw, 
//			zzjl, zzjt

public final class zzdk extends zzjn
{

	public zzdk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzjn()>
		zzoh = zzds.zzcc();
	//    2    4:aload_0         
	//    3    5:invokestatic    #17  <Method zzds[] zzds.zzcc()>
	//    4    8:putfield        #19  <Field zzds[] zzoh>
		zzadp = -1;
	//    5   11:aload_0         
	//    6   12:iconst_m1       
	//    7   13:putfield        #23  <Field int zzadp>
	//    8   16:return          
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
		do
		{
			int i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            149
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          26
			{
				if(!super.zza(zzjk1, i))
	//*   8   15:aload_0         
	//*   9   16:aload_1         
	//*  10   17:iload_2         
	//*  11   18:invokespecial   #37  <Method boolean zzjn.zza(zzjk, int)>
	//*  12   21:ifne            0
					return ((zzjt) (this));
	//   13   24:aload_0         
	//   14   25:areturn         
			} else
			{
				int k = zzjw.zzb(zzjk1, 10);
	//   15   26:aload_1         
	//   16   27:bipush          10
	//   17   29:invokestatic    #43  <Method int zzjw.zzb(zzjk, int)>
	//   18   32:istore_3        
				zzds azzds[] = zzoh;
	//   19   33:aload_0         
	//   20   34:getfield        #19  <Field zzds[] zzoh>
	//   21   37:astore          4
				int j;
				if(azzds == null)
	//*  22   39:aload           4
	//*  23   41:ifnonnull       49
					j = 0;
	//   24   44:iconst_0        
	//   25   45:istore_2        
				else
	//*  26   46:goto            53
					j = azzds.length;
	//   27   49:aload           4
	//   28   51:arraylength     
	//   29   52:istore_2        
				azzds = new zzds[k + j];
	//   30   53:iload_3         
	//   31   54:iload_2         
	//   32   55:iadd            
	//   33   56:anewarray       zzds[]
	//   34   59:astore          4
				k = j;
	//   35   61:iload_2         
	//   36   62:istore_3        
				if(j != 0)
	//*  37   63:iload_2         
	//*  38   64:ifeq            81
				{
					System.arraycopy(((Object) (zzoh)), 0, ((Object) (azzds)), 0, j);
	//   39   67:aload_0         
	//   40   68:getfield        #19  <Field zzds[] zzoh>
	//   41   71:iconst_0        
	//   42   72:aload           4
	//   43   74:iconst_0        
	//   44   75:iload_2         
	//   45   76:invokestatic    #49  <Method void System.arraycopy(Object, int, Object, int, int)>
					k = j;
	//   46   79:iload_2         
	//   47   80:istore_3        
				}
				for(; k < azzds.length - 1; k++)
	//*  48   81:iload_3         
	//*  49   82:aload           4
	//*  50   84:arraylength     
	//*  51   85:iconst_1        
	//*  52   86:isub            
	//*  53   87:icmpge          121
				{
					azzds[k] = new zzds();
	//   54   90:aload           4
	//   55   92:iload_3         
	//   56   93:new             #13  <Class zzds>
	//   57   96:dup             
	//   58   97:invokespecial   #50  <Method void zzds()>
	//   59  100:aastore         
					zzjk1.zza(((zzjt) (azzds[k])));
	//   60  101:aload_1         
	//   61  102:aload           4
	//   62  104:iload_3         
	//   63  105:aaload          
	//   64  106:invokevirtual   #53  <Method void zzjk.zza(zzjt)>
					zzjk1.zzdq();
	//   65  109:aload_1         
	//   66  110:invokevirtual   #34  <Method int zzjk.zzdq()>
	//   67  113:pop             
				}

	//   68  114:iload_3         
	//   69  115:iconst_1        
	//   70  116:iadd            
	//   71  117:istore_3        
	//*  72  118:goto            81
				azzds[k] = new zzds();
	//   73  121:aload           4
	//   74  123:iload_3         
	//   75  124:new             #13  <Class zzds>
	//   76  127:dup             
	//   77  128:invokespecial   #50  <Method void zzds()>
	//   78  131:aastore         
				zzjk1.zza(((zzjt) (azzds[k])));
	//   79  132:aload_1         
	//   80  133:aload           4
	//   81  135:iload_3         
	//   82  136:aaload          
	//   83  137:invokevirtual   #53  <Method void zzjk.zza(zzjt)>
				zzoh = azzds;
	//   84  140:aload_0         
	//   85  141:aload           4
	//   86  143:putfield        #19  <Field zzds[] zzoh>
			}
		} while(true);
	//   87  146:goto            0
		return ((zzjt) (this));
	//   88  149:aload_0         
	//   89  150:areturn         
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		zzds azzds[] = zzoh;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzds[] zzoh>
	//    2    4:astore_3        
		if(azzds != null && azzds.length > 0)
	//*   3    5:aload_3         
	//*   4    6:ifnull          48
	//*   5    9:aload_3         
	//*   6   10:arraylength     
	//*   7   11:ifle            48
		{
			int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
			do
			{
				zzds azzds1[] = zzoh;
	//   10   16:aload_0         
	//   11   17:getfield        #19  <Field zzds[] zzoh>
	//   12   20:astore_3        
				if(i >= azzds1.length)
					break;
	//   13   21:iload_2         
	//   14   22:aload_3         
	//   15   23:arraylength     
	//   16   24:icmpge          48
				zzds zzds1 = azzds1[i];
	//   17   27:aload_3         
	//   18   28:iload_2         
	//   19   29:aaload          
	//   20   30:astore_3        
				if(zzds1 != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          41
					zzjl1.zza(1, ((zzjt) (zzds1)));
	//   23   35:aload_1         
	//   24   36:iconst_1        
	//   25   37:aload_3         
	//   26   38:invokevirtual   #60  <Method void zzjl.zza(int, zzjt)>
				i++;
	//   27   41:iload_2         
	//   28   42:iconst_1        
	//   29   43:iadd            
	//   30   44:istore_2        
			} while(true);
	//   31   45:goto            16
		}
		super.zza(zzjl1);
	//   32   48:aload_0         
	//   33   49:aload_1         
	//   34   50:invokespecial   #62  <Method void zzjn.zza(zzjl)>
	//   35   53:return          
	}

	protected final int zzt()
	{
		int i = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method int zzjn.zzt()>
	//    2    4:istore_1        
		zzds azzds[] = zzoh;
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field zzds[] zzoh>
	//    5    9:astore          4
		int k = i;
	//    6   11:iload_1         
	//    7   12:istore_3        
		if(azzds != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          74
		{
			k = i;
	//   10   18:iload_1         
	//   11   19:istore_3        
			if(azzds.length > 0)
	//*  12   20:aload           4
	//*  13   22:arraylength     
	//*  14   23:ifle            74
			{
				int j = 0;
	//   15   26:iconst_0        
	//   16   27:istore_2        
				do
				{
					zzds azzds1[] = zzoh;
	//   17   28:aload_0         
	//   18   29:getfield        #19  <Field zzds[] zzoh>
	//   19   32:astore          4
					k = i;
	//   20   34:iload_1         
	//   21   35:istore_3        
					if(j >= azzds1.length)
						break;
	//   22   36:iload_2         
	//   23   37:aload           4
	//   24   39:arraylength     
	//   25   40:icmpge          74
					zzds zzds1 = azzds1[j];
	//   26   43:aload           4
	//   27   45:iload_2         
	//   28   46:aaload          
	//   29   47:astore          4
					k = i;
	//   30   49:iload_1         
	//   31   50:istore_3        
					if(zzds1 != null)
	//*  32   51:aload           4
	//*  33   53:ifnull          65
						k = i + zzjl.zzb(1, ((zzjt) (zzds1)));
	//   34   56:iload_1         
	//   35   57:iconst_1        
	//   36   58:aload           4
	//   37   60:invokestatic    #68  <Method int zzjl.zzb(int, zzjt)>
	//   38   63:iadd            
	//   39   64:istore_3        
					j++;
	//   40   65:iload_2         
	//   41   66:iconst_1        
	//   42   67:iadd            
	//   43   68:istore_2        
					i = k;
	//   44   69:iload_3         
	//   45   70:istore_1        
				} while(true);
	//   46   71:goto            28
			}
		}
		return k;
	//   47   74:iload_3         
	//   48   75:ireturn         
	}

	public zzds zzoh[];
}
