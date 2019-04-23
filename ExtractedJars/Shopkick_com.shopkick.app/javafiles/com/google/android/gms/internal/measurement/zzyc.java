// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyi, zzyg, zzyd, zzye, 
//			zzyf, zzxz, zzyk, zzya

public abstract class zzyc extends zzyi
{

	public zzyc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzyi()>
	//    2    4:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		zzyc zzyc1 = (zzyc)super.zzzb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method zzyi zzyi.zzzb()>
	//    2    4:checkcast       #2   <Class zzyc>
	//    3    7:astore_1        
		zzyg.zza(this, zzyc1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #26  <Method void zzyg.zza(zzyc, zzyc)>
		return ((Object) (zzyc1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public final Object zza(zzyd zzyd1)
	{
		Object obj = ((Object) (zzcet));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field zzye zzcet>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		obj = ((Object) (((zzye) (obj)).zzce(zzyd1.tag >>> 3)));
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:getfield        #36  <Field int zzyd.tag>
	//   10   16:iconst_3        
	//   11   17:iushr           
	//   12   18:invokevirtual   #42  <Method zzyf zzye.zzce(int)>
	//   13   21:astore_2        
		if(obj == null)
	//*  14   22:aload_2         
	//*  15   23:ifnonnull       28
			return ((Object) (null));
	//   16   26:aconst_null     
	//   17   27:areturn         
		else
			return ((zzyf) (obj)).zzb(zzyd1);
	//   18   28:aload_2         
	//   19   29:aload_1         
	//   20   30:invokevirtual   #47  <Method Object zzyf.zzb(zzyd)>
	//   21   33:areturn         
	}

	public void zza(zzya zzya)
		throws IOException
	{
		if(zzcet == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field zzye zzcet>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < zzcet.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #30  <Field zzye zzcet>
	//*   9   15:invokevirtual   #56  <Method int zzye.size()>
	//*  10   18:icmpge          40
			zzcet.zzcf(i).zza(zzya);
	//   11   21:aload_0         
	//   12   22:getfield        #30  <Field zzye zzcet>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #59  <Method zzyf zzye.zzcf(int)>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #61  <Method void zzyf.zza(zzya)>

	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_2        
	//*  21   37:goto            10
	//   22   40:return          
	}

	protected final boolean zza(zzxz zzxz1, int i)
		throws IOException
	{
		int j = zzxz1.getPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #67  <Method int zzxz.getPosition()>
	//    2    4:istore_3        
		if(!zzxz1.zzaq(i))
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #71  <Method boolean zzxz.zzaq(int)>
	//*   6   10:ifne            15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		int k = i >>> 3;
	//    9   15:iload_2         
	//   10   16:iconst_3        
	//   11   17:iushr           
	//   12   18:istore          4
		zzyk zzyk1 = new zzyk(i, zzxz1.zzs(j, zzxz1.getPosition() - j));
	//   13   20:new             #73  <Class zzyk>
	//   14   23:dup             
	//   15   24:iload_2         
	//   16   25:aload_1         
	//   17   26:iload_3         
	//   18   27:aload_1         
	//   19   28:invokevirtual   #67  <Method int zzxz.getPosition()>
	//   20   31:iload_3         
	//   21   32:isub            
	//   22   33:invokevirtual   #77  <Method byte[] zzxz.zzs(int, int)>
	//   23   36:invokespecial   #80  <Method void zzyk(int, byte[])>
	//   24   39:astore          6
		zzxz1 = null;
	//   25   41:aconst_null     
	//   26   42:astore_1        
		Object obj = ((Object) (zzcet));
	//   27   43:aload_0         
	//   28   44:getfield        #30  <Field zzye zzcet>
	//   29   47:astore          5
		if(obj == null)
	//*  30   49:aload           5
	//*  31   51:ifnonnull       68
			zzcet = new zzye();
	//   32   54:aload_0         
	//   33   55:new             #38  <Class zzye>
	//   34   58:dup             
	//   35   59:invokespecial   #81  <Method void zzye()>
	//   36   62:putfield        #30  <Field zzye zzcet>
		else
	//*  37   65:goto            76
			zzxz1 = ((zzxz) (((zzye) (obj)).zzce(k)));
	//   38   68:aload           5
	//   39   70:iload           4
	//   40   72:invokevirtual   #42  <Method zzyf zzye.zzce(int)>
	//   41   75:astore_1        
		obj = ((Object) (zzxz1));
	//   42   76:aload_1         
	//   43   77:astore          5
		if(zzxz1 == null)
	//*  44   79:aload_1         
	//*  45   80:ifnonnull       103
		{
			obj = ((Object) (new zzyf()));
	//   46   83:new             #44  <Class zzyf>
	//   47   86:dup             
	//   48   87:invokespecial   #82  <Method void zzyf()>
	//   49   90:astore          5
			zzcet.zza(k, ((zzyf) (obj)));
	//   50   92:aload_0         
	//   51   93:getfield        #30  <Field zzye zzcet>
	//   52   96:iload           4
	//   53   98:aload           5
	//   54  100:invokevirtual   #85  <Method void zzye.zza(int, zzyf)>
		}
		((zzyf) (obj)).zza(zzyk1);
	//   55  103:aload           5
	//   56  105:aload           6
	//   57  107:invokevirtual   #88  <Method void zzyf.zza(zzyk)>
		return true;
	//   58  110:iconst_1        
	//   59  111:ireturn         
	}

	protected int zzf()
	{
		zzye zzye1 = zzcet;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field zzye zzcet>
	//    2    4:astore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int k;
		if(zzye1 != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          49
		{
			int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
			do
			{
				k = i;
	//    9   15:iload_1         
	//   10   16:istore_3        
				if(j >= zzcet.size())
					break;
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #30  <Field zzye zzcet>
	//   14   22:invokevirtual   #56  <Method int zzye.size()>
	//   15   25:icmpge          51
				i += zzcet.zzcf(j).zzf();
	//   16   28:iload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #30  <Field zzye zzcet>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #59  <Method zzyf zzye.zzcf(int)>
	//   21   37:invokevirtual   #91  <Method int zzyf.zzf()>
	//   22   40:iadd            
	//   23   41:istore_1        
				j++;
	//   24   42:iload_2         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_2        
			} while(true);
	//   28   46:goto            15
		} else
		{
			k = 0;
	//   29   49:iconst_0        
	//   30   50:istore_3        
		}
		return k;
	//   31   51:iload_3         
	//   32   52:ireturn         
	}

	public final zzyi zzzb()
		throws CloneNotSupportedException
	{
		return ((zzyi) ((zzyc)((zzyi)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method Object zzyi.clone()>
	//    2    4:checkcast       #2   <Class zzyc>
	//    3    7:areturn         
	}

	protected zzye zzcet;
}
