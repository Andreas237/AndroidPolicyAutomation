// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zziw, zzia, 
//			zzbfa, zzbfi

public final class zzja extends zzbfc
{

	public zzja()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void zzbfc()>
		zzanu = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field Integer zzanu>
		zzapn = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #22  <Field zziw zzapn>
		zzape = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #24  <Field Integer zzape>
		zzapf = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #26  <Field Integer zzapf>
		zzapr = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #28  <Field Integer zzapr>
		zzaps = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #30  <Field Long zzaps>
		zzebk = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #34  <Field zzbfe zzebk>
		zzebt = -1;
	//   23   39:aload_0         
	//   24   40:iconst_m1       
	//   25   41:putfield        #38  <Field int zzebt>
	//   26   44:return          
	}

	private final zzja zzx(zzbez zzbez1)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #51  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            178
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          141
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          112
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          98
					{
						if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          84
						{
							if(i != 40)
	//*  17   33:iload_2         
	//*  18   34:bipush          40
	//*  19   36:icmpeq          70
							{
								if(i != 48)
	//*  20   39:iload_2         
	//*  21   40:bipush          48
	//*  22   42:icmpeq          56
								{
									if(!super.zza(zzbez1, i))
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:iload_2         
	//*  26   48:invokespecial   #55  <Method boolean zzbfc.zza(zzbez, int)>
	//*  27   51:ifne            0
										return this;
	//   28   54:aload_0         
	//   29   55:areturn         
								} else
								{
									zzaps = Long.valueOf(zzbez1.zzacd());
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #59  <Method long zzbez.zzacd()>
	//   33   61:invokestatic    #65  <Method Long Long.valueOf(long)>
	//   34   64:putfield        #30  <Field Long zzaps>
								}
							} else
	//*  35   67:goto            0
							{
								zzapr = Integer.valueOf(zzbez1.zzacc());
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:invokevirtual   #68  <Method int zzbez.zzacc()>
	//   39   75:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   40   78:putfield        #28  <Field Integer zzapr>
							}
						} else
	//*  41   81:goto            0
						{
							zzapf = Integer.valueOf(zzbez1.zzacc());
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:invokevirtual   #68  <Method int zzbez.zzacc()>
	//   45   89:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   46   92:putfield        #26  <Field Integer zzapf>
						}
					} else
	//*  47   95:goto            0
					{
						zzape = Integer.valueOf(zzbez1.zzacc());
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:invokevirtual   #68  <Method int zzbez.zzacc()>
	//   51  103:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   52  106:putfield        #24  <Field Integer zzape>
					}
				} else
	//*  53  109:goto            0
				{
					if(zzapn == null)
	//*  54  112:aload_0         
	//*  55  113:getfield        #22  <Field zziw zzapn>
	//*  56  116:ifnonnull       130
						zzapn = new zziw();
	//   57  119:aload_0         
	//   58  120:new             #75  <Class zziw>
	//   59  123:dup             
	//   60  124:invokespecial   #76  <Method void zziw()>
	//   61  127:putfield        #22  <Field zziw zzapn>
					zzbez1.zza(((zzbfi) (zzapn)));
	//   62  130:aload_1         
	//   63  131:aload_0         
	//   64  132:getfield        #22  <Field zziw zzapn>
	//   65  135:invokevirtual   #79  <Method void zzbez.zza(zzbfi)>
				}
			} else
	//*  66  138:goto            0
			{
				int j = zzbez1.getPosition();
	//   67  141:aload_1         
	//   68  142:invokevirtual   #82  <Method int zzbez.getPosition()>
	//   69  145:istore_3        
				try
				{
					zzanu = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//   70  146:aload_0         
	//   71  147:aload_1         
	//   72  148:invokevirtual   #68  <Method int zzbez.zzacc()>
	//   73  151:invokestatic    #88  <Method int zzia.zzd(int)>
	//   74  154:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   75  157:putfield        #20  <Field Integer zzanu>
				}
	//*  76  160:goto            0
	//*  77  163:aload_1         
	//*  78  164:iload_3         
	//*  79  165:invokevirtual   #92  <Method void zzbez.zzdc(int)>
	//*  80  168:aload_0         
	//*  81  169:aload_1         
	//*  82  170:iload_2         
	//*  83  171:invokevirtual   #55  <Method boolean zzbfc.zza(zzbez, int)>
	//*  84  174:pop             
	//*  85  175:goto            0
	//*  86  178:aload_0         
	//*  87  179:areturn         
				// Misplaced declaration of an exception variable
				catch(IllegalArgumentException illegalargumentexception)
				{
					zzbez1.zzdc(j);
					((zzbfc)this).zza(zzbez1, i);
				}
			}
		} while(true);
		return this;
	//*  88  180:astore          4
	//*  89  182:goto            163
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzx(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method zzja zzx(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzanu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Integer zzanu>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzanu.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field Integer zzanu>
	//    7   13:invokevirtual   #100 <Method int Integer.intValue()>
	//    8   16:invokevirtual   #106 <Method void zzbfa.zzm(int, int)>
		if(zzapn != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #22  <Field zziw zzapn>
	//*  11   23:ifnull          35
			zzbfa1.zza(2, ((zzbfi) (zzapn)));
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #22  <Field zziw zzapn>
	//   16   32:invokevirtual   #109 <Method void zzbfa.zza(int, zzbfi)>
		if(zzape != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #24  <Field Integer zzape>
	//*  19   39:ifnull          54
			zzbfa1.zzm(3, zzape.intValue());
	//   20   42:aload_1         
	//   21   43:iconst_3        
	//   22   44:aload_0         
	//   23   45:getfield        #24  <Field Integer zzape>
	//   24   48:invokevirtual   #100 <Method int Integer.intValue()>
	//   25   51:invokevirtual   #106 <Method void zzbfa.zzm(int, int)>
		if(zzapf != null)
	//*  26   54:aload_0         
	//*  27   55:getfield        #26  <Field Integer zzapf>
	//*  28   58:ifnull          73
			zzbfa1.zzm(4, zzapf.intValue());
	//   29   61:aload_1         
	//   30   62:iconst_4        
	//   31   63:aload_0         
	//   32   64:getfield        #26  <Field Integer zzapf>
	//   33   67:invokevirtual   #100 <Method int Integer.intValue()>
	//   34   70:invokevirtual   #106 <Method void zzbfa.zzm(int, int)>
		if(zzapr != null)
	//*  35   73:aload_0         
	//*  36   74:getfield        #28  <Field Integer zzapr>
	//*  37   77:ifnull          92
			zzbfa1.zzm(5, zzapr.intValue());
	//   38   80:aload_1         
	//   39   81:iconst_5        
	//   40   82:aload_0         
	//   41   83:getfield        #28  <Field Integer zzapr>
	//   42   86:invokevirtual   #100 <Method int Integer.intValue()>
	//   43   89:invokevirtual   #106 <Method void zzbfa.zzm(int, int)>
		if(zzaps != null)
	//*  44   92:aload_0         
	//*  45   93:getfield        #30  <Field Long zzaps>
	//*  46   96:ifnull          112
			zzbfa1.zza(6, zzaps.longValue());
	//   47   99:aload_1         
	//   48  100:bipush          6
	//   49  102:aload_0         
	//   50  103:getfield        #30  <Field Long zzaps>
	//   51  106:invokevirtual   #112 <Method long Long.longValue()>
	//   52  109:invokevirtual   #115 <Method void zzbfa.zza(int, long)>
		super.zza(zzbfa1);
	//   53  112:aload_0         
	//   54  113:aload_1         
	//   55  114:invokespecial   #117 <Method void zzbfc.zza(zzbfa)>
	//   56  117:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #120 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzanu != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #20  <Field Integer zzanu>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzanu.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #20  <Field Integer zzanu>
	//   12   20:invokevirtual   #100 <Method int Integer.intValue()>
	//   13   23:invokestatic    #124 <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzapn != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #22  <Field zziw zzapn>
	//*  20   34:ifnull          48
			j = i + zzbfa.zzb(2, ((zzbfi) (zzapn)));
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #22  <Field zziw zzapn>
	//   25   43:invokestatic    #128 <Method int zzbfa.zzb(int, zzbfi)>
	//   26   46:iadd            
	//   27   47:istore_2        
		i = j;
	//   28   48:iload_2         
	//   29   49:istore_1        
		if(zzape != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #24  <Field Integer zzape>
	//*  32   54:ifnull          71
			i = j + zzbfa.zzq(3, zzape.intValue());
	//   33   57:iload_2         
	//   34   58:iconst_3        
	//   35   59:aload_0         
	//   36   60:getfield        #24  <Field Integer zzape>
	//   37   63:invokevirtual   #100 <Method int Integer.intValue()>
	//   38   66:invokestatic    #124 <Method int zzbfa.zzq(int, int)>
	//   39   69:iadd            
	//   40   70:istore_1        
		j = i;
	//   41   71:iload_1         
	//   42   72:istore_2        
		if(zzapf != null)
	//*  43   73:aload_0         
	//*  44   74:getfield        #26  <Field Integer zzapf>
	//*  45   77:ifnull          94
			j = i + zzbfa.zzq(4, zzapf.intValue());
	//   46   80:iload_1         
	//   47   81:iconst_4        
	//   48   82:aload_0         
	//   49   83:getfield        #26  <Field Integer zzapf>
	//   50   86:invokevirtual   #100 <Method int Integer.intValue()>
	//   51   89:invokestatic    #124 <Method int zzbfa.zzq(int, int)>
	//   52   92:iadd            
	//   53   93:istore_2        
		i = j;
	//   54   94:iload_2         
	//   55   95:istore_1        
		if(zzapr != null)
	//*  56   96:aload_0         
	//*  57   97:getfield        #28  <Field Integer zzapr>
	//*  58  100:ifnull          117
			i = j + zzbfa.zzq(5, zzapr.intValue());
	//   59  103:iload_2         
	//   60  104:iconst_5        
	//   61  105:aload_0         
	//   62  106:getfield        #28  <Field Integer zzapr>
	//   63  109:invokevirtual   #100 <Method int Integer.intValue()>
	//   64  112:invokestatic    #124 <Method int zzbfa.zzq(int, int)>
	//   65  115:iadd            
	//   66  116:istore_1        
		j = i;
	//   67  117:iload_1         
	//   68  118:istore_2        
		if(zzaps != null)
	//*  69  119:aload_0         
	//*  70  120:getfield        #30  <Field Long zzaps>
	//*  71  123:ifnull          141
			j = i + zzbfa.zze(6, zzaps.longValue());
	//   72  126:iload_1         
	//   73  127:bipush          6
	//   74  129:aload_0         
	//   75  130:getfield        #30  <Field Long zzaps>
	//   76  133:invokevirtual   #112 <Method long Long.longValue()>
	//   77  136:invokestatic    #132 <Method int zzbfa.zze(int, long)>
	//   78  139:iadd            
	//   79  140:istore_2        
		return j;
	//   80  141:iload_2         
	//   81  142:ireturn         
	}

	private Integer zzanu;
	private Integer zzape;
	private Integer zzapf;
	private zziw zzapn;
	private Integer zzapr;
	private Long zzaps;
}
