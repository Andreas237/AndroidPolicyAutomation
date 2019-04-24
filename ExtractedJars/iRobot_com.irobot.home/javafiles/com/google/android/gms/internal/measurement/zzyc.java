// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


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
	{
		zzyc zzyc1 = (zzyc)super.zzzb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method zzyi zzyi.zzzb()>
	//    2    4:checkcast       #2   <Class zzyc>
	//    3    7:astore_1        
		zzyg.zza(this, zzyc1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #24  <Method void zzyg.zza(zzyc, zzyc)>
		return ((Object) (zzyc1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public final Object zza(zzyd zzyd1)
	{
		if(zzcev == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field zzye zzcev>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		zzyf zzyf1 = zzcev.zzce(zzyd1.tag >>> 3);
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field zzye zzcev>
	//    7   13:aload_1         
	//    8   14:getfield        #33  <Field int zzyd.tag>
	//    9   17:iconst_3        
	//   10   18:iushr           
	//   11   19:invokevirtual   #39  <Method zzyf zzye.zzce(int)>
	//   12   22:astore_2        
		if(zzyf1 == null)
	//*  13   23:aload_2         
	//*  14   24:ifnonnull       29
			return ((Object) (null));
	//   15   27:aconst_null     
	//   16   28:areturn         
		else
			return zzyf1.zzb(zzyd1);
	//   17   29:aload_2         
	//   18   30:aload_1         
	//   19   31:invokevirtual   #44  <Method Object zzyf.zzb(zzyd)>
	//   20   34:areturn         
	}

	public void zza(zzya zzya)
	{
		if(zzcev == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field zzye zzcev>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < zzcev.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #27  <Field zzye zzcev>
	//*   9   15:invokevirtual   #51  <Method int zzye.size()>
	//*  10   18:icmpge          40
			zzcev.zzcf(i).zza(zzya);
	//   11   21:aload_0         
	//   12   22:getfield        #27  <Field zzye zzcev>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #54  <Method zzyf zzye.zzcf(int)>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #56  <Method void zzyf.zza(zzya)>

	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_2        
	//*  21   37:goto            10
	//   22   40:return          
	}

	protected final boolean zza(zzxz zzxz1, int i)
	{
		int j = zzxz1.getPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #62  <Method int zzxz.getPosition()>
	//    2    4:istore_3        
		if(!zzxz1.zzaq(i))
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #66  <Method boolean zzxz.zzaq(int)>
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
	//   13   20:new             #68  <Class zzyk>
	//   14   23:dup             
	//   15   24:iload_2         
	//   16   25:aload_1         
	//   17   26:iload_3         
	//   18   27:aload_1         
	//   19   28:invokevirtual   #62  <Method int zzxz.getPosition()>
	//   20   31:iload_3         
	//   21   32:isub            
	//   22   33:invokevirtual   #72  <Method byte[] zzxz.zzs(int, int)>
	//   23   36:invokespecial   #75  <Method void zzyk(int, byte[])>
	//   24   39:astore          6
		zzxz1 = null;
	//   25   41:aconst_null     
	//   26   42:astore_1        
		if(zzcev == null)
	//*  27   43:aload_0         
	//*  28   44:getfield        #27  <Field zzye zzcev>
	//*  29   47:ifnonnull       64
			zzcev = new zzye();
	//   30   50:aload_0         
	//   31   51:new             #35  <Class zzye>
	//   32   54:dup             
	//   33   55:invokespecial   #76  <Method void zzye()>
	//   34   58:putfield        #27  <Field zzye zzcev>
		else
	//*  35   61:goto            74
			zzxz1 = ((zzxz) (zzcev.zzce(k)));
	//   36   64:aload_0         
	//   37   65:getfield        #27  <Field zzye zzcev>
	//   38   68:iload           4
	//   39   70:invokevirtual   #39  <Method zzyf zzye.zzce(int)>
	//   40   73:astore_1        
		Object obj = ((Object) (zzxz1));
	//   41   74:aload_1         
	//   42   75:astore          5
		if(zzxz1 == null)
	//*  43   77:aload_1         
	//*  44   78:ifnonnull       101
		{
			obj = ((Object) (new zzyf()));
	//   45   81:new             #41  <Class zzyf>
	//   46   84:dup             
	//   47   85:invokespecial   #77  <Method void zzyf()>
	//   48   88:astore          5
			zzcev.zza(k, ((zzyf) (obj)));
	//   49   90:aload_0         
	//   50   91:getfield        #27  <Field zzye zzcev>
	//   51   94:iload           4
	//   52   96:aload           5
	//   53   98:invokevirtual   #80  <Method void zzye.zza(int, zzyf)>
		}
		((zzyf) (obj)).zza(zzyk1);
	//   54  101:aload           5
	//   55  103:aload           6
	//   56  105:invokevirtual   #83  <Method void zzyf.zza(zzyk)>
		return true;
	//   57  108:iconst_1        
	//   58  109:ireturn         
	}

	protected int zzf()
	{
		zzye zzye1 = zzcev;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field zzye zzcev>
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
				if(j >= zzcev.size())
					break;
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #27  <Field zzye zzcev>
	//   14   22:invokevirtual   #51  <Method int zzye.size()>
	//   15   25:icmpge          51
				i += zzcev.zzcf(j).zzf();
	//   16   28:iload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #27  <Field zzye zzcev>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #54  <Method zzyf zzye.zzcf(int)>
	//   21   37:invokevirtual   #86  <Method int zzyf.zzf()>
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
	{
		return ((zzyi) ((zzyc)((zzyi)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method Object zzyi.clone()>
	//    2    4:checkcast       #2   <Class zzyc>
	//    3    7:areturn         
	}

	protected zzye zzcev;
}
