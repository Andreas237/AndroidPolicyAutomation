// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxt, zzbxp, zzbxq, zzbxo, 
//			zzbxw, zzbxl, zzbxv, zzbxr, 
//			zzbxm

public abstract class zzbxn extends zzbxt
{

	public zzbxn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzbxt()>
	//    2    4:return          
	}

	private void zza(int i, zzbxv zzbxv1)
	{
		zzbxq zzbxq1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(zzcuI == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #16  <Field zzbxp zzcuI>
	//*   4    6:ifnonnull       23
			zzcuI = new zzbxp();
	//    5    9:aload_0         
	//    6   10:new             #18  <Class zzbxp>
	//    7   13:dup             
	//    8   14:invokespecial   #19  <Method void zzbxp()>
	//    9   17:putfield        #16  <Field zzbxp zzcuI>
		else
	//*  10   20:goto            32
			zzbxq1 = zzcuI.zzro(i);
	//   11   23:aload_0         
	//   12   24:getfield        #16  <Field zzbxp zzcuI>
	//   13   27:iload_1         
	//   14   28:invokevirtual   #23  <Method zzbxq zzbxp.zzro(int)>
	//   15   31:astore_3        
		zzbxq zzbxq2 = zzbxq1;
	//   16   32:aload_3         
	//   17   33:astore          4
		if(zzbxq1 == null)
	//*  18   35:aload_3         
	//*  19   36:ifnonnull       58
		{
			zzbxq2 = new zzbxq();
	//   20   39:new             #25  <Class zzbxq>
	//   21   42:dup             
	//   22   43:invokespecial   #26  <Method void zzbxq()>
	//   23   46:astore          4
			zzcuI.zza(i, zzbxq2);
	//   24   48:aload_0         
	//   25   49:getfield        #16  <Field zzbxp zzcuI>
	//   26   52:iload_1         
	//   27   53:aload           4
	//   28   55:invokevirtual   #29  <Method void zzbxp.zza(int, zzbxq)>
		}
		zzbxq2.zza(zzbxv1);
	//   29   58:aload           4
	//   30   60:aload_2         
	//   31   61:invokevirtual   #32  <Method void zzbxq.zza(zzbxv)>
	//   32   64:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzaeH()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method zzbxn zzaeH()>
	//    2    4:areturn         
	}

	public final Object zza(zzbxo zzbxo1)
	{
		if(zzcuI == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field zzbxp zzcuI>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		zzbxq zzbxq1 = zzcuI.zzro(zzbxw.zzrs(zzbxo1.tag));
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field zzbxp zzcuI>
	//    7   13:aload_1         
	//    8   14:getfield        #48  <Field int zzbxo.tag>
	//    9   17:invokestatic    #54  <Method int zzbxw.zzrs(int)>
	//   10   20:invokevirtual   #23  <Method zzbxq zzbxp.zzro(int)>
	//   11   23:astore_2        
		if(zzbxq1 == null)
	//*  12   24:aload_2         
	//*  13   25:ifnonnull       30
			return ((Object) (null));
	//   14   28:aconst_null     
	//   15   29:areturn         
		else
			return zzbxq1.zzb(zzbxo1);
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #57  <Method Object zzbxq.zzb(zzbxo)>
	//   19   35:areturn         
	}

	public void zza(zzbxm zzbxm)
		throws IOException
	{
		if(zzcuI == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field zzbxp zzcuI>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < zzcuI.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #16  <Field zzbxp zzcuI>
	//*   9   15:invokevirtual   #66  <Method int zzbxp.size()>
	//*  10   18:icmpge          40
			zzcuI.zzrp(i).zza(zzbxm);
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field zzbxp zzcuI>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #69  <Method zzbxq zzbxp.zzrp(int)>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #71  <Method void zzbxq.zza(zzbxm)>

	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_2        
	//*  21   37:goto            10
	//   22   40:return          
	}

	protected final boolean zza(zzbxl zzbxl1, int i)
		throws IOException
	{
		int j = zzbxl1.getPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #77  <Method int zzbxl.getPosition()>
	//    2    4:istore_3        
		if(!zzbxl1.zzqY(i))
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #81  <Method boolean zzbxl.zzqY(int)>
	//*   6   10:ifne            15
		{
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		} else
		{
			zza(zzbxw.zzrs(i), new zzbxv(i, zzbxl1.zzI(j, zzbxl1.getPosition() - j)));
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokestatic    #54  <Method int zzbxw.zzrs(int)>
	//   12   20:new             #83  <Class zzbxv>
	//   13   23:dup             
	//   14   24:iload_2         
	//   15   25:aload_1         
	//   16   26:iload_3         
	//   17   27:aload_1         
	//   18   28:invokevirtual   #77  <Method int zzbxl.getPosition()>
	//   19   31:iload_3         
	//   20   32:isub            
	//   21   33:invokevirtual   #87  <Method byte[] zzbxl.zzI(int, int)>
	//   22   36:invokespecial   #90  <Method void zzbxv(int, byte[])>
	//   23   39:invokespecial   #92  <Method void zza(int, zzbxv)>
			return true;
	//   24   42:iconst_1        
	//   25   43:ireturn         
		}
	}

	public zzbxn zzaeH()
		throws CloneNotSupportedException
	{
		zzbxn zzbxn1 = (zzbxn)super.zzaeI();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method zzbxt zzbxt.zzaeI()>
	//    2    4:checkcast       #2   <Class zzbxn>
	//    3    7:astore_1        
		zzbxr.zza(this, zzbxn1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #101 <Method void zzbxr.zza(zzbxn, zzbxn)>
		return zzbxn1;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public zzbxt zzaeI()
		throws CloneNotSupportedException
	{
		return ((zzbxt) ((zzbxn)clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method Object clone()>
	//    2    4:checkcast       #2   <Class zzbxn>
	//    3    7:areturn         
	}

	protected int zzu()
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		if(zzcuI != null)
	//*   4    4:aload_0         
	//*   5    5:getfield        #16  <Field zzbxp zzcuI>
	//*   6    8:ifnull          47
		{
			int j = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
			do
			{
				k = i;
	//    9   13:iload_1         
	//   10   14:istore_3        
				if(j >= zzcuI.size())
					break;
	//   11   15:iload_2         
	//   12   16:aload_0         
	//   13   17:getfield        #16  <Field zzbxp zzcuI>
	//   14   20:invokevirtual   #66  <Method int zzbxp.size()>
	//   15   23:icmpge          47
				i += zzcuI.zzrp(j).zzu();
	//   16   26:iload_1         
	//   17   27:aload_0         
	//   18   28:getfield        #16  <Field zzbxp zzcuI>
	//   19   31:iload_2         
	//   20   32:invokevirtual   #69  <Method zzbxq zzbxp.zzrp(int)>
	//   21   35:invokevirtual   #107 <Method int zzbxq.zzu()>
	//   22   38:iadd            
	//   23   39:istore_1        
				j++;
	//   24   40:iload_2         
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:istore_2        
			} while(true);
	//   28   44:goto            13
		}
		return k;
	//   29   47:iload_3         
	//   30   48:ireturn         
	}

	protected zzbxp zzcuI;
}
