// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzat, zzcg, zzea, zzef, 
//			zzew, zzas, zzdo

public static class zzcg$zza extends zzat
{

	private static void zza(zzcg zzcg1, zzcg zzcg2)
	{
		zzea.zzcm().zzp(((Object) (zzcg1))).zzc(((Object) (zzcg1)), ((Object) (zzcg2)));
	//    0    0:invokestatic    #44  <Method zzea zzea.zzcm()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #48  <Method zzef zzea.zzp(Object)>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokeinterface #54  <Method void zzef.zzc(Object, Object)>
	//    6   14:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		zzcg$zza zzcg$zza1 = (zzcg$zza)((zzcg)zzjs).zza(zzcg$zzg.zzkh, ((Object) (null)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzcg zzjs>
	//    2    4:checkcast       #7   <Class zzcg>
	//    3    7:getstatic       #62  <Field int zzcg$zzg.zzkh>
	//    4   10:aconst_null     
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #30  <Method Object zzcg.zza(int, Object, Object)>
	//    7   15:checkcast       #2   <Class zzcg$zza>
	//    8   18:astore_1        
		zzcg$zza1.zza((zzcg)zzbi());
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #66  <Method zzdo zzbi()>
	//   12   24:checkcast       #7   <Class zzcg>
	//   13   27:invokevirtual   #69  <Method zzcg$zza zza(zzcg)>
	//   14   30:pop             
		return ((Object) (zzcg$zza1));
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	public final boolean isInitialized()
	{
		return zzcg.zza(zzjt, false);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzcg zzjt>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #75  <Method boolean zzcg.zza(zzcg, boolean)>
	//    4    8:ireturn         
	}

	protected final zzat zza(zzas zzas)
	{
		return ((zzat) (zza((zzcg)zzas)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class zzcg>
	//    3    5:invokevirtual   #69  <Method zzcg$zza zza(zzcg)>
	//    4    8:areturn         
	}

	public final zzcg$zza zza(zzcg zzcg1)
	{
		zzbf();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method void zzbf()>
		zza(zzjt, zzcg1);
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field zzcg zzjt>
	//    4    8:aload_1         
	//    5    9:invokestatic    #81  <Method void zza(zzcg, zzcg)>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public final zzdo zzbe()
	{
		return ((zzdo) (zzjs));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzcg zzjs>
	//    2    4:areturn         
	}

	protected void zzbf()
	{
		if(zzju)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean zzju>
	//*   2    4:ifeq            41
		{
			zzcg zzcg1 = (zzcg)zzjt.zza(zzcg$zzg.zzkg, ((Object) (null)), ((Object) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field zzcg zzjt>
	//    5   11:getstatic       #27  <Field int zzcg$zzg.zzkg>
	//    6   14:aconst_null     
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #30  <Method Object zzcg.zza(int, Object, Object)>
	//    9   19:checkcast       #7   <Class zzcg>
	//   10   22:astore_1        
			zza(zzcg1, zzjt);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #32  <Field zzcg zzjt>
	//   14   28:invokestatic    #81  <Method void zza(zzcg, zzcg)>
			zzjt = zzcg1;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #32  <Field zzcg zzjt>
			zzju = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #34  <Field boolean zzju>
		}
	//   21   41:return          
	}

	public zzcg zzbg()
	{
		if(zzju)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean zzju>
	//*   2    4:ifeq            12
		{
			return zzjt;
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field zzcg zzjt>
	//    5   11:areturn         
		} else
		{
			zzcg zzcg1 = zzjt;
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field zzcg zzjt>
	//    8   16:astore_1        
			zzea.zzcm().zzp(((Object) (zzcg1))).zzc(((Object) (zzcg1)));
	//    9   17:invokestatic    #44  <Method zzea zzea.zzcm()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #48  <Method zzef zzea.zzp(Object)>
	//   12   24:aload_1         
	//   13   25:invokeinterface #88  <Method void zzef.zzc(Object)>
			zzju = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #34  <Field boolean zzju>
			return zzjt;
	//   17   35:aload_0         
	//   18   36:getfield        #32  <Field zzcg zzjt>
	//   19   39:areturn         
		}
	}

	public final zzcg zzbh()
	{
		zzcg zzcg2 = (zzcg)zzbi();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method zzdo zzbi()>
	//    2    4:checkcast       #7   <Class zzcg>
	//    3    7:astore          6
		boolean flag2 = Boolean.TRUE.booleanValue();
	//    4    9:getstatic       #96  <Field Boolean Boolean.TRUE>
	//    5   12:invokevirtual   #99  <Method boolean Boolean.booleanValue()>
	//    6   15:istore          4
		byte byte0 = ((Byte)zzcg2.zza(zzcg$zzg.zzkd, ((Object) (null)), ((Object) (null)))).byteValue();
	//    7   17:aload           6
	//    8   19:getstatic       #102 <Field int zzcg$zzg.zzkd>
	//    9   22:aconst_null     
	//   10   23:aconst_null     
	//   11   24:invokevirtual   #30  <Method Object zzcg.zza(int, Object, Object)>
	//   12   27:checkcast       #104 <Class Byte>
	//   13   30:invokevirtual   #108 <Method byte Byte.byteValue()>
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
				boolean flag1 = zzea.zzcm().zzp(((Object) (zzcg2))).zzo(((Object) (zzcg2)));
	//   26   53:invokestatic    #44  <Method zzea zzea.zzcm()>
	//   27   56:aload           6
	//   28   58:invokevirtual   #48  <Method zzef zzea.zzp(Object)>
	//   29   61:aload           6
	//   30   63:invokeinterface #112 <Method boolean zzef.zzo(Object)>
	//   31   68:istore_3        
				flag = flag1;
	//   32   69:iload_3         
	//   33   70:istore_2        
				if(flag2)
	//*  34   71:iload           4
	//*  35   73:ifeq            106
				{
					int i = zzcg$zzg.zzke;
	//   36   76:getstatic       #115 <Field int zzcg$zzg.zzke>
	//   37   79:istore_1        
					zzcg zzcg1;
					if(flag1)
	//*  38   80:iload_3         
	//*  39   81:ifeq            91
						zzcg1 = zzcg2;
	//   40   84:aload           6
	//   41   86:astore          5
					else
	//*  42   88:goto            94
						zzcg1 = null;
	//   43   91:aconst_null     
	//   44   92:astore          5
					zzcg2.zza(i, ((Object) (zzcg1)), ((Object) (null)));
	//   45   94:aload           6
	//   46   96:iload_1         
	//   47   97:aload           5
	//   48   99:aconst_null     
	//   49  100:invokevirtual   #30  <Method Object zzcg.zza(int, Object, Object)>
	//   50  103:pop             
					flag = flag1;
	//   51  104:iload_3         
	//   52  105:istore_2        
				}
			}
		if(flag)
	//*  53  106:iload_2         
	//*  54  107:ifeq            113
			return zzcg2;
	//   55  110:aload           6
	//   56  112:areturn         
		else
			throw new zzew(((zzdo) (zzcg2)));
	//   57  113:new             #117 <Class zzew>
	//   58  116:dup             
	//   59  117:aload           6
	//   60  119:invokespecial   #120 <Method void zzew(zzdo)>
	//   61  122:athrow          
	}

	public zzdo zzbi()
	{
		return ((zzdo) (zzbg()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method zzcg zzbg()>
	//    2    4:areturn         
	}

	public final zzdo zzbj()
	{
		zzcg zzcg2 = (zzcg)zzbi();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method zzdo zzbi()>
	//    2    4:checkcast       #7   <Class zzcg>
	//    3    7:astore          6
		boolean flag2 = Boolean.TRUE.booleanValue();
	//    4    9:getstatic       #96  <Field Boolean Boolean.TRUE>
	//    5   12:invokevirtual   #99  <Method boolean Boolean.booleanValue()>
	//    6   15:istore          4
		byte byte0 = ((Byte)zzcg2.zza(zzcg$zzg.zzkd, ((Object) (null)), ((Object) (null)))).byteValue();
	//    7   17:aload           6
	//    8   19:getstatic       #102 <Field int zzcg$zzg.zzkd>
	//    9   22:aconst_null     
	//   10   23:aconst_null     
	//   11   24:invokevirtual   #30  <Method Object zzcg.zza(int, Object, Object)>
	//   12   27:checkcast       #104 <Class Byte>
	//   13   30:invokevirtual   #108 <Method byte Byte.byteValue()>
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
				boolean flag1 = zzea.zzcm().zzp(((Object) (zzcg2))).zzo(((Object) (zzcg2)));
	//   26   53:invokestatic    #44  <Method zzea zzea.zzcm()>
	//   27   56:aload           6
	//   28   58:invokevirtual   #48  <Method zzef zzea.zzp(Object)>
	//   29   61:aload           6
	//   30   63:invokeinterface #112 <Method boolean zzef.zzo(Object)>
	//   31   68:istore_3        
				flag = flag1;
	//   32   69:iload_3         
	//   33   70:istore_2        
				if(flag2)
	//*  34   71:iload           4
	//*  35   73:ifeq            106
				{
					int i = zzcg$zzg.zzke;
	//   36   76:getstatic       #115 <Field int zzcg$zzg.zzke>
	//   37   79:istore_1        
					zzcg zzcg1;
					if(flag1)
	//*  38   80:iload_3         
	//*  39   81:ifeq            91
						zzcg1 = zzcg2;
	//   40   84:aload           6
	//   41   86:astore          5
					else
	//*  42   88:goto            94
						zzcg1 = null;
	//   43   91:aconst_null     
	//   44   92:astore          5
					zzcg2.zza(i, ((Object) (zzcg1)), ((Object) (null)));
	//   45   94:aload           6
	//   46   96:iload_1         
	//   47   97:aload           5
	//   48   99:aconst_null     
	//   49  100:invokevirtual   #30  <Method Object zzcg.zza(int, Object, Object)>
	//   50  103:pop             
					flag = flag1;
	//   51  104:iload_3         
	//   52  105:istore_2        
				}
			}
		if(flag)
	//*  53  106:iload_2         
	//*  54  107:ifeq            113
			return ((zzdo) (zzcg2));
	//   55  110:aload           6
	//   56  112:areturn         
		else
			throw new zzew(((zzdo) (zzcg2)));
	//   57  113:new             #117 <Class zzew>
	//   58  116:dup             
	//   59  117:aload           6
	//   60  119:invokespecial   #120 <Method void zzew(zzdo)>
	//   61  122:athrow          
	}

	public final zzat zzt()
	{
		return ((zzat) ((zzcg$zza)((zzat)this).clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #127 <Method Object zzat.clone()>
	//    2    4:checkcast       #2   <Class zzcg$zza>
	//    3    7:areturn         
	}

	private final zzcg zzjs;
	protected zzcg zzjt;
	protected boolean zzju;

	protected zzcg$zza(zzcg zzcg1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void zzat()>
		zzjs = zzcg1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field zzcg zzjs>
		zzjt = (zzcg)zzcg1.zza(zzcg$zzg.zzkg, ((Object) (null)), ((Object) (null)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getstatic       #27  <Field int zzcg$zzg.zzkg>
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:invokevirtual   #30  <Method Object zzcg.zza(int, Object, Object)>
	//   11   19:checkcast       #7   <Class zzcg>
	//   12   22:putfield        #32  <Field zzcg zzjt>
		zzju = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #34  <Field boolean zzju>
	//   16   30:return          
	}
}
