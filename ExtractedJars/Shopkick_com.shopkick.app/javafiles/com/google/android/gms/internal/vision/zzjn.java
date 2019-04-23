// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjt, zzjr, zzjp, zzjq, 
//			zzjk, zzjv, zzjl

public abstract class zzjn extends zzjt
{

	public zzjn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzjt()>
	//    2    4:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		zzjn zzjn1 = (zzjn)super.zzhr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method zzjt zzjt.zzhr()>
	//    2    4:checkcast       #2   <Class zzjn>
	//    3    7:astore_1        
		zzjr.zza(this, zzjn1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #26  <Method void zzjr.zza(zzjn, zzjn)>
		return ((Object) (zzjn1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public void zza(zzjl zzjl)
		throws IOException
	{
		if(zzadg == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field zzjp zzadg>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < zzadg.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #32  <Field zzjp zzadg>
	//*   9   15:invokevirtual   #38  <Method int zzjp.size()>
	//*  10   18:icmpge          40
			zzadg.zzbx(i).zza(zzjl);
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field zzjp zzadg>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #42  <Method zzjq zzjp.zzbx(int)>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #46  <Method void zzjq.zza(zzjl)>

	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_2        
	//*  21   37:goto            10
	//   22   40:return          
	}

	protected final boolean zza(zzjk zzjk1, int i)
		throws IOException
	{
		int j = zzjk1.getPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int zzjk.getPosition()>
	//    2    4:istore_3        
		if(!zzjk1.zzal(i))
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #56  <Method boolean zzjk.zzal(int)>
	//*   6   10:ifne            15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		int k = i >>> 3;
	//    9   15:iload_2         
	//   10   16:iconst_3        
	//   11   17:iushr           
	//   12   18:istore          4
		zzjv zzjv1 = new zzjv(i, zzjk1.zzv(j, zzjk1.getPosition() - j));
	//   13   20:new             #58  <Class zzjv>
	//   14   23:dup             
	//   15   24:iload_2         
	//   16   25:aload_1         
	//   17   26:iload_3         
	//   18   27:aload_1         
	//   19   28:invokevirtual   #52  <Method int zzjk.getPosition()>
	//   20   31:iload_3         
	//   21   32:isub            
	//   22   33:invokevirtual   #62  <Method byte[] zzjk.zzv(int, int)>
	//   23   36:invokespecial   #65  <Method void zzjv(int, byte[])>
	//   24   39:astore          6
		zzjk1 = null;
	//   25   41:aconst_null     
	//   26   42:astore_1        
		Object obj = ((Object) (zzadg));
	//   27   43:aload_0         
	//   28   44:getfield        #32  <Field zzjp zzadg>
	//   29   47:astore          5
		if(obj == null)
	//*  30   49:aload           5
	//*  31   51:ifnonnull       68
			zzadg = new zzjp();
	//   32   54:aload_0         
	//   33   55:new             #34  <Class zzjp>
	//   34   58:dup             
	//   35   59:invokespecial   #66  <Method void zzjp()>
	//   36   62:putfield        #32  <Field zzjp zzadg>
		else
	//*  37   65:goto            76
			zzjk1 = ((zzjk) (((zzjp) (obj)).zzbw(k)));
	//   38   68:aload           5
	//   39   70:iload           4
	//   40   72:invokevirtual   #69  <Method zzjq zzjp.zzbw(int)>
	//   41   75:astore_1        
		obj = ((Object) (zzjk1));
	//   42   76:aload_1         
	//   43   77:astore          5
		if(zzjk1 == null)
	//*  44   79:aload_1         
	//*  45   80:ifnonnull       103
		{
			obj = ((Object) (new zzjq()));
	//   46   83:new             #44  <Class zzjq>
	//   47   86:dup             
	//   48   87:invokespecial   #70  <Method void zzjq()>
	//   49   90:astore          5
			zzadg.zza(k, ((zzjq) (obj)));
	//   50   92:aload_0         
	//   51   93:getfield        #32  <Field zzjp zzadg>
	//   52   96:iload           4
	//   53   98:aload           5
	//   54  100:invokevirtual   #73  <Method void zzjp.zza(int, zzjq)>
		}
		((zzjq) (obj)).zza(zzjv1);
	//   55  103:aload           5
	//   56  105:aload           6
	//   57  107:invokevirtual   #76  <Method void zzjq.zza(zzjv)>
		return true;
	//   58  110:iconst_1        
	//   59  111:ireturn         
	}

	public final zzjt zzhr()
		throws CloneNotSupportedException
	{
		return ((zzjt) ((zzjn)((zzjt)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method Object zzjt.clone()>
	//    2    4:checkcast       #2   <Class zzjn>
	//    3    7:areturn         
	}

	protected int zzt()
	{
		zzjp zzjp1 = zzadg;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzjp zzadg>
	//    2    4:astore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int k;
		if(zzjp1 != null)
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
				if(j >= zzadg.size())
					break;
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #32  <Field zzjp zzadg>
	//   14   22:invokevirtual   #38  <Method int zzjp.size()>
	//   15   25:icmpge          51
				i += zzadg.zzbx(j).zzt();
	//   16   28:iload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #32  <Field zzjp zzadg>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #42  <Method zzjq zzjp.zzbx(int)>
	//   21   37:invokevirtual   #81  <Method int zzjq.zzt()>
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

	protected zzjp zzadg;
}
