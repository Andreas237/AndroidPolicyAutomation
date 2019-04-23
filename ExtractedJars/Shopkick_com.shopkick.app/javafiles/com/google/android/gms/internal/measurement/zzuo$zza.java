// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsy, zzuo, zzwh, zzwl, 
//			zzxc, zzsx, zzvv

public static class zzuo$zza extends zzsy
{

	private static void zza(zzuo zzuo1, zzuo zzuo2)
	{
		zzwh.zzxt().zzak(((Object) (zzuo1))).zzd(((Object) (zzuo1)), ((Object) (zzuo2)));
	//    0    0:invokestatic    #44  <Method zzwh zzwh.zzxt()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #48  <Method zzwl zzwh.zzak(Object)>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokeinterface #54  <Method void zzwl.zzd(Object, Object)>
	//    6   14:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		zzuo$zza zzuo$zza1 = (zzuo$zza)((zzuo)zzbyg).zza(zzuo$zze.zzbyo, ((Object) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzuo zzbyg>
	//    2    4:checkcast       #7   <Class zzuo>
	//    3    7:getstatic       #62  <Field int zzuo$zze.zzbyo>
	//    4   10:aconst_null     
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #30  <Method Object zzuo.zza(int, Object, Object)>
	//    7   15:checkcast       #2   <Class zzuo$zza>
	//    8   18:astore_1        
		zzuo$zza1.zza((zzuo)zzwn());
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #66  <Method zzvv zzwn()>
	//   12   24:checkcast       #7   <Class zzuo>
	//   13   27:invokevirtual   #69  <Method zzuo$zza zza(zzuo)>
	//   14   30:pop             
		return ((Object) (zzuo$zza1));
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	public final boolean isInitialized()
	{
		return zzuo.zza(zzbyh, false);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzuo zzbyh>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #75  <Method boolean zzuo.zza(zzuo, boolean)>
	//    4    8:ireturn         
	}

	protected final zzsy zza(zzsx zzsx)
	{
		return ((zzsy) (zza((zzuo)zzsx)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class zzuo>
	//    3    5:invokevirtual   #69  <Method zzuo$zza zza(zzuo)>
	//    4    8:areturn         
	}

	public final zzuo$zza zza(zzuo zzuo1)
	{
		zzwk();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method void zzwk()>
		zza(zzbyh, zzuo1);
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field zzuo zzbyh>
	//    4    8:aload_1         
	//    5    9:invokestatic    #81  <Method void zza(zzuo, zzuo)>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public final zzsy zzty()
	{
		return ((zzsy) ((zzuo$zza)((zzsy)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method Object zzsy.clone()>
	//    2    4:checkcast       #2   <Class zzuo$zza>
	//    3    7:areturn         
	}

	public final zzvv zzwj()
	{
		return ((zzvv) (zzbyg));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzuo zzbyg>
	//    2    4:areturn         
	}

	protected final void zzwk()
	{
		if(zzbyi)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean zzbyi>
	//*   2    4:ifeq            41
		{
			zzuo zzuo1 = (zzuo)zzbyh.zza(zzuo$zze.zzbyn, ((Object) (null)), ((Object) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field zzuo zzbyh>
	//    5   11:getstatic       #27  <Field int zzuo$zze.zzbyn>
	//    6   14:aconst_null     
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #30  <Method Object zzuo.zza(int, Object, Object)>
	//    9   19:checkcast       #7   <Class zzuo>
	//   10   22:astore_1        
			zza(zzuo1, zzbyh);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #32  <Field zzuo zzbyh>
	//   14   28:invokestatic    #81  <Method void zza(zzuo, zzuo)>
			zzbyh = zzuo1;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #32  <Field zzuo zzbyh>
			zzbyi = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #34  <Field boolean zzbyi>
		}
	//   21   41:return          
	}

	public zzuo zzwl()
	{
		if(zzbyi)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean zzbyi>
	//*   2    4:ifeq            12
		{
			return zzbyh;
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field zzuo zzbyh>
	//    5   11:areturn         
		} else
		{
			zzuo zzuo1 = zzbyh;
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field zzuo zzbyh>
	//    8   16:astore_1        
			zzwh.zzxt().zzak(((Object) (zzuo1))).zzy(((Object) (zzuo1)));
	//    9   17:invokestatic    #44  <Method zzwh zzwh.zzxt()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #48  <Method zzwl zzwh.zzak(Object)>
	//   12   24:aload_1         
	//   13   25:invokeinterface #93  <Method void zzwl.zzy(Object)>
			zzbyi = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #34  <Field boolean zzbyi>
			return zzbyh;
	//   17   35:aload_0         
	//   18   36:getfield        #32  <Field zzuo zzbyh>
	//   19   39:areturn         
		}
	}

	public final zzuo zzwm()
	{
		zzuo zzuo2 = (zzuo)zzwn();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method zzvv zzwn()>
	//    2    4:checkcast       #7   <Class zzuo>
	//    3    7:astore          6
		boolean flag2 = Boolean.TRUE.booleanValue();
	//    4    9:getstatic       #101 <Field Boolean Boolean.TRUE>
	//    5   12:invokevirtual   #104 <Method boolean Boolean.booleanValue()>
	//    6   15:istore          4
		byte byte0 = ((Byte)zzuo2.zza(zzuo$zze.zzbyk, ((Object) (null)), ((Object) (null)))).byteValue();
	//    7   17:aload           6
	//    8   19:getstatic       #107 <Field int zzuo$zze.zzbyk>
	//    9   22:aconst_null     
	//   10   23:aconst_null     
	//   11   24:invokevirtual   #30  <Method Object zzuo.zza(int, Object, Object)>
	//   12   27:checkcast       #109 <Class Byte>
	//   13   30:invokevirtual   #113 <Method byte Byte.byteValue()>
	//   14   33:istore_1        
		boolean flag = true;
	//   15   34:iconst_1        
	//   16   35:istore_2        
		if(byte0 != 1)
	//*  17   36:iload_1         
	//*  18   37:iconst_1        
	//*  19   38:icmpne          44
	//*  20   41:goto            106
			if(byte0 == 0)
	//*  21   44:iload_1         
	//*  22   45:ifne            53
			{
				flag = false;
	//   23   48:iconst_0        
	//   24   49:istore_2        
			} else
	//*  25   50:goto            106
			{
				boolean flag1 = zzwh.zzxt().zzak(((Object) (zzuo2))).zzaj(((Object) (zzuo2)));
	//   26   53:invokestatic    #44  <Method zzwh zzwh.zzxt()>
	//   27   56:aload           6
	//   28   58:invokevirtual   #48  <Method zzwl zzwh.zzak(Object)>
	//   29   61:aload           6
	//   30   63:invokeinterface #117 <Method boolean zzwl.zzaj(Object)>
	//   31   68:istore_3        
				flag = flag1;
	//   32   69:iload_3         
	//   33   70:istore_2        
				if(flag2)
	//*  34   71:iload           4
	//*  35   73:ifeq            106
				{
					int i = zzuo$zze.zzbyl;
	//   36   76:getstatic       #120 <Field int zzuo$zze.zzbyl>
	//   37   79:istore_1        
					zzuo zzuo1;
					if(flag1)
	//*  38   80:iload_3         
	//*  39   81:ifeq            91
						zzuo1 = zzuo2;
	//   40   84:aload           6
	//   41   86:astore          5
					else
	//*  42   88:goto            94
						zzuo1 = null;
	//   43   91:aconst_null     
	//   44   92:astore          5
					zzuo2.zza(i, ((Object) (zzuo1)), ((Object) (null)));
	//   45   94:aload           6
	//   46   96:iload_1         
	//   47   97:aload           5
	//   48   99:aconst_null     
	//   49  100:invokevirtual   #30  <Method Object zzuo.zza(int, Object, Object)>
	//   50  103:pop             
					flag = flag1;
	//   51  104:iload_3         
	//   52  105:istore_2        
				}
			}
		if(flag)
	//*  53  106:iload_2         
	//*  54  107:ifeq            113
			return zzuo2;
	//   55  110:aload           6
	//   56  112:areturn         
		else
			throw new zzxc(((zzvv) (zzuo2)));
	//   57  113:new             #122 <Class zzxc>
	//   58  116:dup             
	//   59  117:aload           6
	//   60  119:invokespecial   #125 <Method void zzxc(zzvv)>
	//   61  122:athrow          
	}

	public zzvv zzwn()
	{
		return ((zzvv) (zzwl()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method zzuo zzwl()>
	//    2    4:areturn         
	}

	public zzvv zzwo()
	{
		return ((zzvv) (zzwm()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method zzuo zzwm()>
	//    2    4:areturn         
	}

	private final zzuo zzbyg;
	protected zzuo zzbyh;
	private boolean zzbyi;

	protected zzuo$zza(zzuo zzuo1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzsy()>
		zzbyg = zzuo1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field zzuo zzbyg>
		zzbyh = (zzuo)zzuo1.zza(zzuo$zze.zzbyn, ((Object) (null)), ((Object) (null)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getstatic       #27  <Field int zzuo$zze.zzbyn>
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:invokevirtual   #30  <Method Object zzuo.zza(int, Object, Object)>
	//   11   19:checkcast       #7   <Class zzuo>
	//   12   22:putfield        #32  <Field zzuo zzbyh>
		zzbyi = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #34  <Field boolean zzbyi>
	//   16   30:return          
	}
}
