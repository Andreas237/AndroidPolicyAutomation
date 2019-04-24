// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfi, zzbfg, zzbfe, zzbff, 
//			zzbez, zzbfk, zzbfa

public abstract class zzbfc extends zzbfi
{

	public zzbfc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzbfi()>
	//    2    4:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		zzbfc zzbfc1 = (zzbfc)super.zzago();
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method zzbfi zzbfi.zzago()>
	//    2    4:checkcast       #2   <Class zzbfc>
	//    3    7:astore_1        
		zzbfg.zza(this, zzbfc1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #26  <Method void zzbfg.zza(zzbfc, zzbfc)>
		return ((Object) (zzbfc1));
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public void zza(zzbfa zzbfa)
		throws IOException
	{
		if(zzebk == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field zzbfe zzebk>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int i = 0; i < zzebk.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #32  <Field zzbfe zzebk>
	//*   9   15:invokevirtual   #38  <Method int zzbfe.size()>
	//*  10   18:icmpge          40
			zzebk.zzdg(i).zza(zzbfa);
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field zzbfe zzebk>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #42  <Method zzbff zzbfe.zzdg(int)>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #46  <Method void zzbff.zza(zzbfa)>

	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_2        
	//*  21   37:goto            10
	//   22   40:return          
	}

	protected final boolean zza(zzbez zzbez1, int i)
		throws IOException
	{
		int j = zzbez1.getPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int zzbez.getPosition()>
	//    2    4:istore_3        
		if(!zzbez1.zzbq(i))
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #56  <Method boolean zzbez.zzbq(int)>
	//*   6   10:ifne            15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		int k = i >>> 3;
	//    9   15:iload_2         
	//   10   16:iconst_3        
	//   11   17:iushr           
	//   12   18:istore          4
		zzbfk zzbfk1 = new zzbfk(i, zzbez1.zzab(j, zzbez1.getPosition() - j));
	//   13   20:new             #58  <Class zzbfk>
	//   14   23:dup             
	//   15   24:iload_2         
	//   16   25:aload_1         
	//   17   26:iload_3         
	//   18   27:aload_1         
	//   19   28:invokevirtual   #52  <Method int zzbez.getPosition()>
	//   20   31:iload_3         
	//   21   32:isub            
	//   22   33:invokevirtual   #62  <Method byte[] zzbez.zzab(int, int)>
	//   23   36:invokespecial   #65  <Method void zzbfk(int, byte[])>
	//   24   39:astore          6
		zzbez1 = null;
	//   25   41:aconst_null     
	//   26   42:astore_1        
		if(zzebk == null)
	//*  27   43:aload_0         
	//*  28   44:getfield        #32  <Field zzbfe zzebk>
	//*  29   47:ifnonnull       64
			zzebk = new zzbfe();
	//   30   50:aload_0         
	//   31   51:new             #34  <Class zzbfe>
	//   32   54:dup             
	//   33   55:invokespecial   #66  <Method void zzbfe()>
	//   34   58:putfield        #32  <Field zzbfe zzebk>
		else
	//*  35   61:goto            74
			zzbez1 = ((zzbez) (zzebk.zzdf(k)));
	//   36   64:aload_0         
	//   37   65:getfield        #32  <Field zzbfe zzebk>
	//   38   68:iload           4
	//   39   70:invokevirtual   #69  <Method zzbff zzbfe.zzdf(int)>
	//   40   73:astore_1        
		Object obj = ((Object) (zzbez1));
	//   41   74:aload_1         
	//   42   75:astore          5
		if(zzbez1 == null)
	//*  43   77:aload_1         
	//*  44   78:ifnonnull       101
		{
			obj = ((Object) (new zzbff()));
	//   45   81:new             #44  <Class zzbff>
	//   46   84:dup             
	//   47   85:invokespecial   #70  <Method void zzbff()>
	//   48   88:astore          5
			zzebk.zza(k, ((zzbff) (obj)));
	//   49   90:aload_0         
	//   50   91:getfield        #32  <Field zzbfe zzebk>
	//   51   94:iload           4
	//   52   96:aload           5
	//   53   98:invokevirtual   #73  <Method void zzbfe.zza(int, zzbff)>
		}
		((zzbff) (obj)).zza(zzbfk1);
	//   54  101:aload           5
	//   55  103:aload           6
	//   56  105:invokevirtual   #76  <Method void zzbff.zza(zzbfk)>
		return true;
	//   57  108:iconst_1        
	//   58  109:ireturn         
	}

	public final zzbfi zzago()
		throws CloneNotSupportedException
	{
		return ((zzbfi) ((zzbfc)((zzbfi)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method Object zzbfi.clone()>
	//    2    4:checkcast       #2   <Class zzbfc>
	//    3    7:areturn         
	}

	protected int zzr()
	{
		zzbfe zzbfe1 = zzebk;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzbfe zzebk>
	//    2    4:astore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int k;
		if(zzbfe1 != null)
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
				if(j >= zzebk.size())
					break;
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #32  <Field zzbfe zzebk>
	//   14   22:invokevirtual   #38  <Method int zzbfe.size()>
	//   15   25:icmpge          51
				i += zzebk.zzdg(j).zzr();
	//   16   28:iload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #32  <Field zzbfe zzebk>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #42  <Method zzbff zzbfe.zzdg(int)>
	//   21   37:invokevirtual   #81  <Method int zzbff.zzr()>
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

	protected zzbfe zzebk;
}
