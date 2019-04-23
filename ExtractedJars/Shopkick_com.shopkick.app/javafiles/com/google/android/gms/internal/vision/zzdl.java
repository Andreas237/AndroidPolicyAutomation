// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjk, zzjl, zzjt

public final class zzdl extends zzjn
{

	public zzdl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void zzjn()>
		url = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field String url>
		zzoi = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field Boolean zzoi>
		zzok = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #26  <Field Long zzok>
		zzol = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #28  <Field Long zzol>
		zzom = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #30  <Field Long zzom>
		zzon = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #32  <Field String zzon>
		zzadp = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #36  <Field int zzadp>
	//   23   39:return          
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
	//    1    1:invokevirtual   #47  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
				if(i != 0)
	//*   3    5:iload_2         
	//*   4    6:ifeq            212
				{
					if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          201
					{
						if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          187
						{
							if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          115
							{
								if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          101
								{
									if(i != 40)
	//*  17   33:iload_2         
	//*  18   34:bipush          40
	//*  19   36:icmpeq          87
									{
										if(i != 48)
	//*  20   39:iload_2         
	//*  21   40:bipush          48
	//*  22   42:icmpeq          73
										{
											if(i != 58)
	//*  23   45:iload_2         
	//*  24   46:bipush          58
	//*  25   48:icmpeq          62
											{
												if(!super.zza(zzjk1, i))
	//*  26   51:aload_0         
	//*  27   52:aload_1         
	//*  28   53:iload_2         
	//*  29   54:invokespecial   #50  <Method boolean zzjn.zza(zzjk, int)>
	//*  30   57:ifne            0
													return ((zzjt) (this));
	//   31   60:aload_0         
	//   32   61:areturn         
											} else
											{
												zzon = zzjk1.readString();
	//   33   62:aload_0         
	//   34   63:aload_1         
	//   35   64:invokevirtual   #54  <Method String zzjk.readString()>
	//   36   67:putfield        #32  <Field String zzon>
											}
										} else
	//*  37   70:goto            0
										{
											zzom = Long.valueOf(zzjk1.zzdu());
	//   38   73:aload_0         
	//   39   74:aload_1         
	//   40   75:invokevirtual   #58  <Method long zzjk.zzdu()>
	//   41   78:invokestatic    #64  <Method Long Long.valueOf(long)>
	//   42   81:putfield        #30  <Field Long zzom>
										}
									} else
	//*  43   84:goto            0
									{
										zzol = Long.valueOf(zzjk1.zzdu());
	//   44   87:aload_0         
	//   45   88:aload_1         
	//   46   89:invokevirtual   #58  <Method long zzjk.zzdu()>
	//   47   92:invokestatic    #64  <Method Long Long.valueOf(long)>
	//   48   95:putfield        #28  <Field Long zzol>
									}
								} else
	//*  49   98:goto            0
								{
									zzok = Long.valueOf(zzjk1.zzdu());
	//   50  101:aload_0         
	//   51  102:aload_1         
	//   52  103:invokevirtual   #58  <Method long zzjk.zzdu()>
	//   53  106:invokestatic    #64  <Method Long Long.valueOf(long)>
	//   54  109:putfield        #26  <Field Long zzok>
								}
							} else
	//*  55  112:goto            0
							{
								int j = zzjk1.getPosition();
	//   56  115:aload_1         
	//   57  116:invokevirtual   #67  <Method int zzjk.getPosition()>
	//   58  119:istore_3        
								int k = zzjk1.zzdt();
	//   59  120:aload_1         
	//   60  121:invokevirtual   #70  <Method int zzjk.zzdt()>
	//   61  124:istore          4
								switch(k)
	//*  62  126:iload           4
								{
	//*  63  128:tableswitch     0 3: default 160
	//	               0 175
	//	               1 175
	//	               2 175
	//	               3 175
								default:
									zzjk1.zzbt(j);
	//   64  160:aload_1         
	//   65  161:iload_3         
	//   66  162:invokevirtual   #74  <Method void zzjk.zzbt(int)>
									((zzjn)this).zza(zzjk1, i);
	//   67  165:aload_0         
	//   68  166:aload_1         
	//   69  167:iload_2         
	//   70  168:invokevirtual   #50  <Method boolean zzjn.zza(zzjk, int)>
	//   71  171:pop             
									break;

	//*  72  172:goto            0
								case 0: // '\0'
								case 1: // '\001'
								case 2: // '\002'
								case 3: // '\003'
									zzoj = zzcz.zzc.zzb.zzs(k);
	//   73  175:aload_0         
	//   74  176:iload           4
	//   75  178:invokestatic    #80  <Method zzcz$zzc$zzb zzcz$zzc$zzb.zzs(int)>
	//   76  181:putfield        #82  <Field zzcz$zzc$zzb zzoj>
									break;
								}
								continue label0;
	//   77  184:goto            0
							}
						} else
						{
							zzoi = Boolean.valueOf(zzjk1.zzcu());
	//   78  187:aload_0         
	//   79  188:aload_1         
	//   80  189:invokevirtual   #86  <Method boolean zzjk.zzcu()>
	//   81  192:invokestatic    #91  <Method Boolean Boolean.valueOf(boolean)>
	//   82  195:putfield        #24  <Field Boolean zzoi>
							continue label0;
	//   83  198:goto            0
						}
					} else
					{
						url = zzjk1.readString();
	//   84  201:aload_0         
	//   85  202:aload_1         
	//   86  203:invokevirtual   #54  <Method String zzjk.readString()>
	//   87  206:putfield        #22  <Field String url>
						continue label0;
	//   88  209:goto            0
					}
				} else
				{
					return ((zzjt) (this));
	//   89  212:aload_0         
	//   90  213:areturn         
				}
			} while(true);
		while(true);
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		Object obj = ((Object) (url));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String url>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			zzjl1.zza(1, ((String) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #98  <Method void zzjl.zza(int, String)>
		obj = ((Object) (zzoi));
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field Boolean zzoi>
	//   11   19:astore_2        
		if(obj != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          33
			zzjl1.zzb(2, ((Boolean) (obj)).booleanValue());
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #101 <Method boolean Boolean.booleanValue()>
	//   18   30:invokevirtual   #105 <Method void zzjl.zzb(int, boolean)>
		obj = ((Object) (zzoj));
	//   19   33:aload_0         
	//   20   34:getfield        #82  <Field zzcz$zzc$zzb zzoj>
	//   21   37:astore_2        
		if(obj != null && obj != null)
	//*  22   38:aload_2         
	//*  23   39:ifnull          55
	//*  24   42:aload_2         
	//*  25   43:ifnull          55
			zzjl1.zze(3, ((zzcz.zzc.zzb) (obj)).zzr());
	//   26   46:aload_1         
	//   27   47:iconst_3        
	//   28   48:aload_2         
	//   29   49:invokevirtual   #108 <Method int zzcz$zzc$zzb.zzr()>
	//   30   52:invokevirtual   #112 <Method void zzjl.zze(int, int)>
		obj = ((Object) (zzok));
	//   31   55:aload_0         
	//   32   56:getfield        #26  <Field Long zzok>
	//   33   59:astore_2        
		if(obj != null)
	//*  34   60:aload_2         
	//*  35   61:ifnull          73
			zzjl1.zzi(4, ((Long) (obj)).longValue());
	//   36   64:aload_1         
	//   37   65:iconst_4        
	//   38   66:aload_2         
	//   39   67:invokevirtual   #115 <Method long Long.longValue()>
	//   40   70:invokevirtual   #119 <Method void zzjl.zzi(int, long)>
		obj = ((Object) (zzol));
	//   41   73:aload_0         
	//   42   74:getfield        #28  <Field Long zzol>
	//   43   77:astore_2        
		if(obj != null)
	//*  44   78:aload_2         
	//*  45   79:ifnull          91
			zzjl1.zzi(5, ((Long) (obj)).longValue());
	//   46   82:aload_1         
	//   47   83:iconst_5        
	//   48   84:aload_2         
	//   49   85:invokevirtual   #115 <Method long Long.longValue()>
	//   50   88:invokevirtual   #119 <Method void zzjl.zzi(int, long)>
		obj = ((Object) (zzom));
	//   51   91:aload_0         
	//   52   92:getfield        #30  <Field Long zzom>
	//   53   95:astore_2        
		if(obj != null)
	//*  54   96:aload_2         
	//*  55   97:ifnull          110
			zzjl1.zzi(6, ((Long) (obj)).longValue());
	//   56  100:aload_1         
	//   57  101:bipush          6
	//   58  103:aload_2         
	//   59  104:invokevirtual   #115 <Method long Long.longValue()>
	//   60  107:invokevirtual   #119 <Method void zzjl.zzi(int, long)>
		obj = ((Object) (zzon));
	//   61  110:aload_0         
	//   62  111:getfield        #32  <Field String zzon>
	//   63  114:astore_2        
		if(obj != null)
	//*  64  115:aload_2         
	//*  65  116:ifnull          126
			zzjl1.zza(7, ((String) (obj)));
	//   66  119:aload_1         
	//   67  120:bipush          7
	//   68  122:aload_2         
	//   69  123:invokevirtual   #98  <Method void zzjl.zza(int, String)>
		super.zza(zzjl1);
	//   70  126:aload_0         
	//   71  127:aload_1         
	//   72  128:invokespecial   #121 <Method void zzjn.zza(zzjl)>
	//   73  131:return          
	}

	protected final int zzt()
	{
		int j = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method int zzjn.zzt()>
	//    2    4:istore_2        
		Object obj = ((Object) (url));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field String url>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + zzjl.zzb(1, ((String) (obj)));
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #127 <Method int zzjl.zzb(int, String)>
	//   14   22:iadd            
	//   15   23:istore_1        
		obj = ((Object) (zzoi));
	//   16   24:aload_0         
	//   17   25:getfield        #24  <Field Boolean zzoi>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          49
		{
			((Boolean) (obj)).booleanValue();
	//   23   35:aload_3         
	//   24   36:invokevirtual   #101 <Method boolean Boolean.booleanValue()>
	//   25   39:pop             
			j = i + (zzjl.zzav(2) + 1);
	//   26   40:iload_1         
	//   27   41:iconst_2        
	//   28   42:invokestatic    #131 <Method int zzjl.zzav(int)>
	//   29   45:iconst_1        
	//   30   46:iadd            
	//   31   47:iadd            
	//   32   48:istore_2        
		}
		obj = ((Object) (zzoj));
	//   33   49:aload_0         
	//   34   50:getfield        #82  <Field zzcz$zzc$zzb zzoj>
	//   35   53:astore_3        
		i = j;
	//   36   54:iload_2         
	//   37   55:istore_1        
		if(obj != null)
	//*  38   56:aload_3         
	//*  39   57:ifnull          77
		{
			i = j;
	//   40   60:iload_2         
	//   41   61:istore_1        
			if(obj != null)
	//*  42   62:aload_3         
	//*  43   63:ifnull          77
				i = j + zzjl.zzi(3, ((zzcz.zzc.zzb) (obj)).zzr());
	//   44   66:iload_2         
	//   45   67:iconst_3        
	//   46   68:aload_3         
	//   47   69:invokevirtual   #108 <Method int zzcz$zzc$zzb.zzr()>
	//   48   72:invokestatic    #134 <Method int zzjl.zzi(int, int)>
	//   49   75:iadd            
	//   50   76:istore_1        
		}
		obj = ((Object) (zzok));
	//   51   77:aload_0         
	//   52   78:getfield        #26  <Field Long zzok>
	//   53   81:astore_3        
		j = i;
	//   54   82:iload_1         
	//   55   83:istore_2        
		if(obj != null)
	//*  56   84:aload_3         
	//*  57   85:ifnull          99
			j = i + zzjl.zzd(4, ((Long) (obj)).longValue());
	//   58   88:iload_1         
	//   59   89:iconst_4        
	//   60   90:aload_3         
	//   61   91:invokevirtual   #115 <Method long Long.longValue()>
	//   62   94:invokestatic    #138 <Method int zzjl.zzd(int, long)>
	//   63   97:iadd            
	//   64   98:istore_2        
		obj = ((Object) (zzol));
	//   65   99:aload_0         
	//   66  100:getfield        #28  <Field Long zzol>
	//   67  103:astore_3        
		i = j;
	//   68  104:iload_2         
	//   69  105:istore_1        
		if(obj != null)
	//*  70  106:aload_3         
	//*  71  107:ifnull          121
			i = j + zzjl.zzd(5, ((Long) (obj)).longValue());
	//   72  110:iload_2         
	//   73  111:iconst_5        
	//   74  112:aload_3         
	//   75  113:invokevirtual   #115 <Method long Long.longValue()>
	//   76  116:invokestatic    #138 <Method int zzjl.zzd(int, long)>
	//   77  119:iadd            
	//   78  120:istore_1        
		obj = ((Object) (zzom));
	//   79  121:aload_0         
	//   80  122:getfield        #30  <Field Long zzom>
	//   81  125:astore_3        
		j = i;
	//   82  126:iload_1         
	//   83  127:istore_2        
		if(obj != null)
	//*  84  128:aload_3         
	//*  85  129:ifnull          144
			j = i + zzjl.zzd(6, ((Long) (obj)).longValue());
	//   86  132:iload_1         
	//   87  133:bipush          6
	//   88  135:aload_3         
	//   89  136:invokevirtual   #115 <Method long Long.longValue()>
	//   90  139:invokestatic    #138 <Method int zzjl.zzd(int, long)>
	//   91  142:iadd            
	//   92  143:istore_2        
		obj = ((Object) (zzon));
	//   93  144:aload_0         
	//   94  145:getfield        #32  <Field String zzon>
	//   95  148:astore_3        
		i = j;
	//   96  149:iload_2         
	//   97  150:istore_1        
		if(obj != null)
	//*  98  151:aload_3         
	//*  99  152:ifnull          164
			i = j + zzjl.zzb(7, ((String) (obj)));
	//  100  155:iload_2         
	//  101  156:bipush          7
	//  102  158:aload_3         
	//  103  159:invokestatic    #127 <Method int zzjl.zzb(int, String)>
	//  104  162:iadd            
	//  105  163:istore_1        
		return i;
	//  106  164:iload_1         
	//  107  165:ireturn         
	}

	private String url;
	private Boolean zzoi;
	private zzcz.zzc.zzb zzoj;
	private Long zzok;
	private Long zzol;
	private Long zzom;
	private String zzon;
}
