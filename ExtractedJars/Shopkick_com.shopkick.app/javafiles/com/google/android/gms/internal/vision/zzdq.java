// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjk, zzjl, zzjt

public final class zzdq extends zzjn
{

	public zzdq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzjn()>
		zzpm = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field Long zzpm>
		zzpn = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #20  <Field Long zzpn>
		zzpo = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #22  <Field Long zzpo>
		zzpp = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #24  <Field Long zzpp>
		zzadp = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #28  <Field int zzadp>
	//   17   29:return          
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
label0:
		do
			do
			{
				int i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
				if(i != 0)
	//*   3    5:iload_2         
	//*   4    6:ifeq            175
				{
					if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          106
					{
						if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          92
						{
							if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          78
							{
								if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          64
								{
									if(i != 40)
	//*  17   33:iload_2         
	//*  18   34:bipush          40
	//*  19   36:icmpeq          50
									{
										if(!super.zza(zzjk1, i))
	//*  20   39:aload_0         
	//*  21   40:aload_1         
	//*  22   41:iload_2         
	//*  23   42:invokespecial   #42  <Method boolean zzjn.zza(zzjk, int)>
	//*  24   45:ifne            0
											return ((zzjt) (this));
	//   25   48:aload_0         
	//   26   49:areturn         
									} else
									{
										zzpo = Long.valueOf(zzjk1.zzdu());
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #46  <Method long zzjk.zzdu()>
	//   30   55:invokestatic    #52  <Method Long Long.valueOf(long)>
	//   31   58:putfield        #22  <Field Long zzpo>
									}
								} else
	//*  32   61:goto            0
								{
									zzpp = Long.valueOf(zzjk1.zzdu());
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #46  <Method long zzjk.zzdu()>
	//   36   69:invokestatic    #52  <Method Long Long.valueOf(long)>
	//   37   72:putfield        #24  <Field Long zzpp>
								}
							} else
	//*  38   75:goto            0
							{
								zzpn = Long.valueOf(zzjk1.zzdu());
	//   39   78:aload_0         
	//   40   79:aload_1         
	//   41   80:invokevirtual   #46  <Method long zzjk.zzdu()>
	//   42   83:invokestatic    #52  <Method Long Long.valueOf(long)>
	//   43   86:putfield        #20  <Field Long zzpn>
							}
						} else
	//*  44   89:goto            0
						{
							zzpm = Long.valueOf(zzjk1.zzdu());
	//   45   92:aload_0         
	//   46   93:aload_1         
	//   47   94:invokevirtual   #46  <Method long zzjk.zzdu()>
	//   48   97:invokestatic    #52  <Method Long Long.valueOf(long)>
	//   49  100:putfield        #18  <Field Long zzpm>
						}
					} else
	//*  50  103:goto            0
					{
						int j = zzjk1.getPosition();
	//   51  106:aload_1         
	//   52  107:invokevirtual   #55  <Method int zzjk.getPosition()>
	//   53  110:istore_3        
						int k = zzjk1.zzdt();
	//   54  111:aload_1         
	//   55  112:invokevirtual   #58  <Method int zzjk.zzdt()>
	//   56  115:istore          4
						switch(k)
	//*  57  117:iload           4
						{
	//*  58  119:tableswitch     0 3: default 148
	//	               0 163
	//	               1 163
	//	               2 163
	//	               3 163
						default:
							zzjk1.zzbt(j);
	//   59  148:aload_1         
	//   60  149:iload_3         
	//   61  150:invokevirtual   #62  <Method void zzjk.zzbt(int)>
							((zzjn)this).zza(zzjk1, i);
	//   62  153:aload_0         
	//   63  154:aload_1         
	//   64  155:iload_2         
	//   65  156:invokevirtual   #42  <Method boolean zzjn.zza(zzjk, int)>
	//   66  159:pop             
							break;

	//*  67  160:goto            0
						case 0: // '\0'
						case 1: // '\001'
						case 2: // '\002'
						case 3: // '\003'
							zzpl = zzcz.zzf.zzb.zzu(k);
	//   68  163:aload_0         
	//   69  164:iload           4
	//   70  166:invokestatic    #68  <Method zzcz$zzf$zzb zzcz$zzf$zzb.zzu(int)>
	//   71  169:putfield        #70  <Field zzcz$zzf$zzb zzpl>
							break;
						}
						continue label0;
	//   72  172:goto            0
					}
				} else
				{
					return ((zzjt) (this));
	//   73  175:aload_0         
	//   74  176:areturn         
				}
			} while(true);
		while(true);
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		Object obj = ((Object) (zzpl));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field zzcz$zzf$zzb zzpl>
	//    2    4:astore_2        
		if(obj != null && obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
	//*   5    9:aload_2         
	//*   6   10:ifnull          22
			zzjl1.zze(1, ((zzcz.zzf.zzb) (obj)).zzr());
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:aload_2         
	//   10   16:invokevirtual   #75  <Method int zzcz$zzf$zzb.zzr()>
	//   11   19:invokevirtual   #81  <Method void zzjl.zze(int, int)>
		obj = ((Object) (zzpm));
	//   12   22:aload_0         
	//   13   23:getfield        #18  <Field Long zzpm>
	//   14   26:astore_2        
		if(obj != null)
	//*  15   27:aload_2         
	//*  16   28:ifnull          40
			zzjl1.zzi(2, ((Long) (obj)).longValue());
	//   17   31:aload_1         
	//   18   32:iconst_2        
	//   19   33:aload_2         
	//   20   34:invokevirtual   #84  <Method long Long.longValue()>
	//   21   37:invokevirtual   #88  <Method void zzjl.zzi(int, long)>
		obj = ((Object) (zzpn));
	//   22   40:aload_0         
	//   23   41:getfield        #20  <Field Long zzpn>
	//   24   44:astore_2        
		if(obj != null)
	//*  25   45:aload_2         
	//*  26   46:ifnull          58
			zzjl1.zzi(3, ((Long) (obj)).longValue());
	//   27   49:aload_1         
	//   28   50:iconst_3        
	//   29   51:aload_2         
	//   30   52:invokevirtual   #84  <Method long Long.longValue()>
	//   31   55:invokevirtual   #88  <Method void zzjl.zzi(int, long)>
		obj = ((Object) (zzpp));
	//   32   58:aload_0         
	//   33   59:getfield        #24  <Field Long zzpp>
	//   34   62:astore_2        
		if(obj != null)
	//*  35   63:aload_2         
	//*  36   64:ifnull          76
			zzjl1.zzi(4, ((Long) (obj)).longValue());
	//   37   67:aload_1         
	//   38   68:iconst_4        
	//   39   69:aload_2         
	//   40   70:invokevirtual   #84  <Method long Long.longValue()>
	//   41   73:invokevirtual   #88  <Method void zzjl.zzi(int, long)>
		obj = ((Object) (zzpo));
	//   42   76:aload_0         
	//   43   77:getfield        #22  <Field Long zzpo>
	//   44   80:astore_2        
		if(obj != null)
	//*  45   81:aload_2         
	//*  46   82:ifnull          94
			zzjl1.zzi(5, ((Long) (obj)).longValue());
	//   47   85:aload_1         
	//   48   86:iconst_5        
	//   49   87:aload_2         
	//   50   88:invokevirtual   #84  <Method long Long.longValue()>
	//   51   91:invokevirtual   #88  <Method void zzjl.zzi(int, long)>
		super.zza(zzjl1);
	//   52   94:aload_0         
	//   53   95:aload_1         
	//   54   96:invokespecial   #90  <Method void zzjn.zza(zzjl)>
	//   55   99:return          
	}

	protected final int zzt()
	{
		int j = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method int zzjn.zzt()>
	//    2    4:istore_2        
		Object obj = ((Object) (zzpl));
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field zzcz$zzf$zzb zzpl>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          33
		{
			i = j;
	//   10   16:iload_2         
	//   11   17:istore_1        
			if(obj != null)
	//*  12   18:aload_3         
	//*  13   19:ifnull          33
				i = j + zzjl.zzi(1, ((zzcz.zzf.zzb) (obj)).zzr());
	//   14   22:iload_2         
	//   15   23:iconst_1        
	//   16   24:aload_3         
	//   17   25:invokevirtual   #75  <Method int zzcz$zzf$zzb.zzr()>
	//   18   28:invokestatic    #96  <Method int zzjl.zzi(int, int)>
	//   19   31:iadd            
	//   20   32:istore_1        
		}
		obj = ((Object) (zzpm));
	//   21   33:aload_0         
	//   22   34:getfield        #18  <Field Long zzpm>
	//   23   37:astore_3        
		j = i;
	//   24   38:iload_1         
	//   25   39:istore_2        
		if(obj != null)
	//*  26   40:aload_3         
	//*  27   41:ifnull          55
			j = i + zzjl.zzd(2, ((Long) (obj)).longValue());
	//   28   44:iload_1         
	//   29   45:iconst_2        
	//   30   46:aload_3         
	//   31   47:invokevirtual   #84  <Method long Long.longValue()>
	//   32   50:invokestatic    #100 <Method int zzjl.zzd(int, long)>
	//   33   53:iadd            
	//   34   54:istore_2        
		obj = ((Object) (zzpn));
	//   35   55:aload_0         
	//   36   56:getfield        #20  <Field Long zzpn>
	//   37   59:astore_3        
		i = j;
	//   38   60:iload_2         
	//   39   61:istore_1        
		if(obj != null)
	//*  40   62:aload_3         
	//*  41   63:ifnull          77
			i = j + zzjl.zzd(3, ((Long) (obj)).longValue());
	//   42   66:iload_2         
	//   43   67:iconst_3        
	//   44   68:aload_3         
	//   45   69:invokevirtual   #84  <Method long Long.longValue()>
	//   46   72:invokestatic    #100 <Method int zzjl.zzd(int, long)>
	//   47   75:iadd            
	//   48   76:istore_1        
		obj = ((Object) (zzpp));
	//   49   77:aload_0         
	//   50   78:getfield        #24  <Field Long zzpp>
	//   51   81:astore_3        
		j = i;
	//   52   82:iload_1         
	//   53   83:istore_2        
		if(obj != null)
	//*  54   84:aload_3         
	//*  55   85:ifnull          99
			j = i + zzjl.zzd(4, ((Long) (obj)).longValue());
	//   56   88:iload_1         
	//   57   89:iconst_4        
	//   58   90:aload_3         
	//   59   91:invokevirtual   #84  <Method long Long.longValue()>
	//   60   94:invokestatic    #100 <Method int zzjl.zzd(int, long)>
	//   61   97:iadd            
	//   62   98:istore_2        
		obj = ((Object) (zzpo));
	//   63   99:aload_0         
	//   64  100:getfield        #22  <Field Long zzpo>
	//   65  103:astore_3        
		i = j;
	//   66  104:iload_2         
	//   67  105:istore_1        
		if(obj != null)
	//*  68  106:aload_3         
	//*  69  107:ifnull          121
			i = j + zzjl.zzd(5, ((Long) (obj)).longValue());
	//   70  110:iload_2         
	//   71  111:iconst_5        
	//   72  112:aload_3         
	//   73  113:invokevirtual   #84  <Method long Long.longValue()>
	//   74  116:invokestatic    #100 <Method int zzjl.zzd(int, long)>
	//   75  119:iadd            
	//   76  120:istore_1        
		return i;
	//   77  121:iload_1         
	//   78  122:ireturn         
	}

	private zzcz.zzf.zzb zzpl;
	public Long zzpm;
	public Long zzpn;
	public Long zzpo;
	public Long zzpp;
}
