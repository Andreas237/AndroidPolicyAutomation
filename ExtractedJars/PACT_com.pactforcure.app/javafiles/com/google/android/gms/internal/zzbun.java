// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbut, zzbuo, zzbuw, zzbup, 
//			zzbuq, zzbul, zzbuv, zzbur, 
//			zzbum

public abstract class zzbun extends zzbut
{

	public zzbun()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzbut()>
	//    2    4:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzacN()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method zzbun zzacN()>
	//    2    4:areturn         
	}

	public final Object zza(zzbuo zzbuo1)
	{
		zzbuq zzbuq1;
		if(zzcrX != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field zzbup zzcrX>
	//*   2    4:ifnonnull       9
	//*   3    7:aconst_null     
	//*   4    8:areturn         
	//*   5    9:aload_0         
	//*   6   10:getfield        #25  <Field zzbup zzcrX>
	//*   7   13:aload_1         
	//*   8   14:getfield        #31  <Field int zzbuo.tag>
	//*   9   17:invokestatic    #37  <Method int zzbuw.zzqB(int)>
	//*  10   20:invokevirtual   #43  <Method zzbuq zzbup.zzqx(int)>
	//*  11   23:astore_2        
			if((zzbuq1 = zzcrX.zzqx(zzbuw.zzqB(zzbuo1.tag))) != null)
	//*  12   24:aload_2         
	//*  13   25:ifnull          7
				return zzbuq1.zzb(zzbuo1);
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #48  <Method Object zzbuq.zzb(zzbuo)>
	//   17   33:areturn         
		return ((Object) (null));
	}

	public void zza(zzbum zzbum)
		throws IOException
	{
		if(zzcrX != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field zzbup zzcrX>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
			while(i < zzcrX.size()) 
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #25  <Field zzbup zzcrX>
	//*   9   15:invokevirtual   #57  <Method int zzbup.size()>
	//*  10   18:icmpge          7
			{
				zzcrX.zzqy(i).zza(zzbum);
	//   11   21:aload_0         
	//   12   22:getfield        #25  <Field zzbup zzcrX>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #60  <Method zzbuq zzbup.zzqy(int)>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #62  <Method void zzbuq.zza(zzbum)>
				i++;
	//   17   33:iload_2         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_2        
			}
		}
	//*  21   37:goto            10
	}

	protected final boolean zza(zzbul zzbul1, int i)
		throws IOException
	{
		int j = zzbul1.getPosition();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #68  <Method int zzbul.getPosition()>
	//    2    4:istore_3        
		if(!zzbul1.zzqh(i))
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #72  <Method boolean zzbul.zzqh(int)>
	//*   6   10:ifne            15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		int k = zzbuw.zzqB(i);
	//    9   15:iload_2         
	//   10   16:invokestatic    #37  <Method int zzbuw.zzqB(int)>
	//   11   19:istore          4
		zzbuv zzbuv1 = new zzbuv(i, zzbul1.zzE(j, zzbul1.getPosition() - j));
	//   12   21:new             #74  <Class zzbuv>
	//   13   24:dup             
	//   14   25:iload_2         
	//   15   26:aload_1         
	//   16   27:iload_3         
	//   17   28:aload_1         
	//   18   29:invokevirtual   #68  <Method int zzbul.getPosition()>
	//   19   32:iload_3         
	//   20   33:isub            
	//   21   34:invokevirtual   #78  <Method byte[] zzbul.zzE(int, int)>
	//   22   37:invokespecial   #81  <Method void zzbuv(int, byte[])>
	//   23   40:astore          6
		zzbul1 = null;
	//   24   42:aconst_null     
	//   25   43:astore_1        
		Object obj;
		if(zzcrX == null)
	//*  26   44:aload_0         
	//*  27   45:getfield        #25  <Field zzbup zzcrX>
	//*  28   48:ifnonnull       98
			zzcrX = new zzbup();
	//   29   51:aload_0         
	//   30   52:new             #39  <Class zzbup>
	//   31   55:dup             
	//   32   56:invokespecial   #82  <Method void zzbup()>
	//   33   59:putfield        #25  <Field zzbup zzcrX>
		else
	//*  34   62:aload_1         
	//*  35   63:astore          5
	//*  36   65:aload_1         
	//*  37   66:ifnonnull       89
	//*  38   69:new             #45  <Class zzbuq>
	//*  39   72:dup             
	//*  40   73:invokespecial   #83  <Method void zzbuq()>
	//*  41   76:astore          5
	//*  42   78:aload_0         
	//*  43   79:getfield        #25  <Field zzbup zzcrX>
	//*  44   82:iload           4
	//*  45   84:aload           5
	//*  46   86:invokevirtual   #86  <Method void zzbup.zza(int, zzbuq)>
	//*  47   89:aload           5
	//*  48   91:aload           6
	//*  49   93:invokevirtual   #89  <Method void zzbuq.zza(zzbuv)>
	//*  50   96:iconst_1        
	//*  51   97:ireturn         
			zzbul1 = ((zzbul) (zzcrX.zzqx(k)));
	//   52   98:aload_0         
	//   53   99:getfield        #25  <Field zzbup zzcrX>
	//   54  102:iload           4
	//   55  104:invokevirtual   #43  <Method zzbuq zzbup.zzqx(int)>
	//   56  107:astore_1        
		obj = ((Object) (zzbul1));
		if(zzbul1 == null)
		{
			obj = ((Object) (new zzbuq()));
			zzcrX.zza(k, ((zzbuq) (obj)));
		}
		((zzbuq) (obj)).zza(zzbuv1);
		return true;
	//*  57  108:goto            62
	}

	public zzbun zzacN()
		throws CloneNotSupportedException
	{
		zzbun zzbun1 = (zzbun)super.zzacO();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method zzbut zzbut.zzacO()>
	//    2    4:checkcast       #2   <Class zzbun>
	//    3    7:astore_1        
		zzbur.zza(this, zzbun1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #98  <Method void zzbur.zza(zzbun, zzbun)>
		return zzbun1;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public zzbut zzacO()
		throws CloneNotSupportedException
	{
		return ((zzbut) ((zzbun)clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method Object clone()>
	//    2    4:checkcast       #2   <Class zzbun>
	//    3    7:areturn         
	}

	protected int zzv()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int k;
		if(zzcrX != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #25  <Field zzbup zzcrX>
	//*   4    6:ifnull          45
		{
			int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
			do
			{
				k = i;
	//    7   11:iload_1         
	//    8   12:istore_3        
				if(j >= zzcrX.size())
					break;
	//    9   13:iload_2         
	//   10   14:aload_0         
	//   11   15:getfield        #25  <Field zzbup zzcrX>
	//   12   18:invokevirtual   #57  <Method int zzbup.size()>
	//   13   21:icmpge          47
				i += zzcrX.zzqy(j).zzv();
	//   14   24:iload_1         
	//   15   25:aload_0         
	//   16   26:getfield        #25  <Field zzbup zzcrX>
	//   17   29:iload_2         
	//   18   30:invokevirtual   #60  <Method zzbuq zzbup.zzqy(int)>
	//   19   33:invokevirtual   #104 <Method int zzbuq.zzv()>
	//   20   36:iadd            
	//   21   37:istore_1        
				j++;
	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_2        
			} while(true);
	//   26   42:goto            11
		} else
		{
			k = 0;
	//   27   45:iconst_0        
	//   28   46:istore_3        
		}
		return k;
	//   29   47:iload_3         
	//   30   48:ireturn         
	}

	protected zzbup zzcrX;
}
