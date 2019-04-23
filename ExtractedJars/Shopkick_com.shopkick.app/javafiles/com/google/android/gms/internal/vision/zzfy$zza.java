// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzed, zzfy, zzhs, zzhw, 
//			zzin, zzec, zzhf

public static class zzfy$zza extends zzed
{

	private static void zza(zzfy zzfy1, zzfy zzfy2)
	{
		zzhs.zzgl().zzs(((Object) (zzfy1))).zzc(((Object) (zzfy1)), ((Object) (zzfy2)));
	//    0    0:invokestatic    #44  <Method zzhs zzhs.zzgl()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #48  <Method zzhw zzhs.zzs(Object)>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokeinterface #54  <Method void zzhw.zzc(Object, Object)>
	//    6   14:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		zzfy$zza zzfy$zza1 = (zzfy$zza)((zzfy)zzwm).zza(zzfy$zzg.zzxb, ((Object) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzfy zzwm>
	//    2    4:checkcast       #7   <Class zzfy>
	//    3    7:getstatic       #62  <Field int zzfy$zzg.zzxb>
	//    4   10:aconst_null     
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #30  <Method Object zzfy.zza(int, Object, Object)>
	//    7   15:checkcast       #2   <Class zzfy$zza>
	//    8   18:astore_1        
		zzfy$zza1.zza((zzfy)zzff());
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #66  <Method zzhf zzff()>
	//   12   24:checkcast       #7   <Class zzfy>
	//   13   27:invokevirtual   #69  <Method zzfy$zza zza(zzfy)>
	//   14   30:pop             
		return ((Object) (zzfy$zza1));
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	public final boolean isInitialized()
	{
		return zzfy.zza(zzwn, false);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzfy zzwn>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #75  <Method boolean zzfy.zza(zzfy, boolean)>
	//    4    8:ireturn         
	}

	protected final zzed zza(zzec zzec)
	{
		return ((zzed) (zza((zzfy)zzec)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class zzfy>
	//    3    5:invokevirtual   #69  <Method zzfy$zza zza(zzfy)>
	//    4    8:areturn         
	}

	public final zzfy$zza zza(zzfy zzfy1)
	{
		zzfc();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method void zzfc()>
		zza(zzwn, zzfy1);
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field zzfy zzwn>
	//    4    8:aload_1         
	//    5    9:invokestatic    #81  <Method void zza(zzfy, zzfy)>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public final zzed zzcg()
	{
		return ((zzed) ((zzfy$zza)((zzed)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method Object zzed.clone()>
	//    2    4:checkcast       #2   <Class zzfy$zza>
	//    3    7:areturn         
	}

	public final zzhf zzfb()
	{
		return ((zzhf) (zzwm));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzfy zzwm>
	//    2    4:areturn         
	}

	protected void zzfc()
	{
		if(zzwo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean zzwo>
	//*   2    4:ifeq            41
		{
			zzfy zzfy1 = (zzfy)zzwn.zza(zzfy$zzg.zzxa, ((Object) (null)), ((Object) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field zzfy zzwn>
	//    5   11:getstatic       #27  <Field int zzfy$zzg.zzxa>
	//    6   14:aconst_null     
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #30  <Method Object zzfy.zza(int, Object, Object)>
	//    9   19:checkcast       #7   <Class zzfy>
	//   10   22:astore_1        
			zza(zzfy1, zzwn);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #32  <Field zzfy zzwn>
	//   14   28:invokestatic    #81  <Method void zza(zzfy, zzfy)>
			zzwn = zzfy1;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #32  <Field zzfy zzwn>
			zzwo = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #34  <Field boolean zzwo>
		}
	//   21   41:return          
	}

	public zzfy zzfd()
	{
		if(zzwo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean zzwo>
	//*   2    4:ifeq            12
		{
			return zzwn;
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field zzfy zzwn>
	//    5   11:areturn         
		} else
		{
			zzfy zzfy1 = zzwn;
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field zzfy zzwn>
	//    8   16:astore_1        
			zzhs.zzgl().zzs(((Object) (zzfy1))).zze(((Object) (zzfy1)));
	//    9   17:invokestatic    #44  <Method zzhs zzhs.zzgl()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #48  <Method zzhw zzhs.zzs(Object)>
	//   12   24:aload_1         
	//   13   25:invokeinterface #93  <Method void zzhw.zze(Object)>
			zzwo = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #34  <Field boolean zzwo>
			return zzwn;
	//   17   35:aload_0         
	//   18   36:getfield        #32  <Field zzfy zzwn>
	//   19   39:areturn         
		}
	}

	public final zzfy zzfe()
	{
		zzfy zzfy2 = (zzfy)zzff();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method zzhf zzff()>
	//    2    4:checkcast       #7   <Class zzfy>
	//    3    7:astore          6
		boolean flag2 = Boolean.TRUE.booleanValue();
	//    4    9:getstatic       #101 <Field Boolean Boolean.TRUE>
	//    5   12:invokevirtual   #104 <Method boolean Boolean.booleanValue()>
	//    6   15:istore          4
		byte byte0 = ((Byte)zzfy2.zza(zzfy$zzg.zzwx, ((Object) (null)), ((Object) (null)))).byteValue();
	//    7   17:aload           6
	//    8   19:getstatic       #107 <Field int zzfy$zzg.zzwx>
	//    9   22:aconst_null     
	//   10   23:aconst_null     
	//   11   24:invokevirtual   #30  <Method Object zzfy.zza(int, Object, Object)>
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
				boolean flag1 = zzhs.zzgl().zzs(((Object) (zzfy2))).zzr(((Object) (zzfy2)));
	//   26   53:invokestatic    #44  <Method zzhs zzhs.zzgl()>
	//   27   56:aload           6
	//   28   58:invokevirtual   #48  <Method zzhw zzhs.zzs(Object)>
	//   29   61:aload           6
	//   30   63:invokeinterface #117 <Method boolean zzhw.zzr(Object)>
	//   31   68:istore_3        
				flag = flag1;
	//   32   69:iload_3         
	//   33   70:istore_2        
				if(flag2)
	//*  34   71:iload           4
	//*  35   73:ifeq            106
				{
					int i = zzfy$zzg.zzwy;
	//   36   76:getstatic       #120 <Field int zzfy$zzg.zzwy>
	//   37   79:istore_1        
					zzfy zzfy1;
					if(flag1)
	//*  38   80:iload_3         
	//*  39   81:ifeq            91
						zzfy1 = zzfy2;
	//   40   84:aload           6
	//   41   86:astore          5
					else
	//*  42   88:goto            94
						zzfy1 = null;
	//   43   91:aconst_null     
	//   44   92:astore          5
					zzfy2.zza(i, ((Object) (zzfy1)), ((Object) (null)));
	//   45   94:aload           6
	//   46   96:iload_1         
	//   47   97:aload           5
	//   48   99:aconst_null     
	//   49  100:invokevirtual   #30  <Method Object zzfy.zza(int, Object, Object)>
	//   50  103:pop             
					flag = flag1;
	//   51  104:iload_3         
	//   52  105:istore_2        
				}
			}
		if(flag)
	//*  53  106:iload_2         
	//*  54  107:ifeq            113
			return zzfy2;
	//   55  110:aload           6
	//   56  112:areturn         
		else
			throw new zzin(((zzhf) (zzfy2)));
	//   57  113:new             #122 <Class zzin>
	//   58  116:dup             
	//   59  117:aload           6
	//   60  119:invokespecial   #125 <Method void zzin(zzhf)>
	//   61  122:athrow          
	}

	public zzhf zzff()
	{
		return ((zzhf) (zzfd()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method zzfy zzfd()>
	//    2    4:areturn         
	}

	public zzhf zzfg()
	{
		return ((zzhf) (zzfe()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method zzfy zzfe()>
	//    2    4:areturn         
	}

	private final zzfy zzwm;
	protected zzfy zzwn;
	protected boolean zzwo;

	protected zzfy$zza(zzfy zzfy1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzed()>
		zzwm = zzfy1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field zzfy zzwm>
		zzwn = (zzfy)zzfy1.zza(zzfy$zzg.zzxa, ((Object) (null)), ((Object) (null)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getstatic       #27  <Field int zzfy$zzg.zzxa>
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:invokevirtual   #30  <Method Object zzfy.zza(int, Object, Object)>
	//   11   19:checkcast       #7   <Class zzfy>
	//   12   22:putfield        #32  <Field zzfy zzwn>
		zzwo = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #34  <Field boolean zzwo>
	//   16   30:return          
	}
}
