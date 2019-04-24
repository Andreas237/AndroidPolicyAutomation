// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zziw, zzia, 
//			zzbfa, zzbfi

public final class zziy extends zzbfc
{

	public zziy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzbfc()>
		zzanu = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #18  <Field Integer zzanu>
		zzapn = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #20  <Field zziw zzapn>
		zzape = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #22  <Field Integer zzape>
		zzapf = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #24  <Field Integer zzapf>
		zzapr = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #26  <Field Integer zzapr>
		zzebk = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #30  <Field zzbfe zzebk>
		zzebt = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #34  <Field int zzebt>
	//   23   39:return          
	}

	private final zziy zzv(zzbez zzbez1)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            158
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          121
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
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
								if(!super.zza(zzbez1, i))
	//*  20   39:aload_0         
	//*  21   40:aload_1         
	//*  22   41:iload_2         
	//*  23   42:invokespecial   #51  <Method boolean zzbfc.zza(zzbez, int)>
	//*  24   45:ifne            0
									return this;
	//   25   48:aload_0         
	//   26   49:areturn         
							} else
							{
								zzapr = Integer.valueOf(zzbez1.zzacc());
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #54  <Method int zzbez.zzacc()>
	//   30   55:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   31   58:putfield        #26  <Field Integer zzapr>
							}
						} else
	//*  32   61:goto            0
						{
							zzapf = Integer.valueOf(zzbez1.zzacc());
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #54  <Method int zzbez.zzacc()>
	//   36   69:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   37   72:putfield        #24  <Field Integer zzapf>
						}
					} else
	//*  38   75:goto            0
					{
						zzape = Integer.valueOf(zzbez1.zzacc());
	//   39   78:aload_0         
	//   40   79:aload_1         
	//   41   80:invokevirtual   #54  <Method int zzbez.zzacc()>
	//   42   83:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   43   86:putfield        #22  <Field Integer zzape>
					}
				} else
	//*  44   89:goto            0
				{
					if(zzapn == null)
	//*  45   92:aload_0         
	//*  46   93:getfield        #20  <Field zziw zzapn>
	//*  47   96:ifnonnull       110
						zzapn = new zziw();
	//   48   99:aload_0         
	//   49  100:new             #62  <Class zziw>
	//   50  103:dup             
	//   51  104:invokespecial   #63  <Method void zziw()>
	//   52  107:putfield        #20  <Field zziw zzapn>
					zzbez1.zza(((zzbfi) (zzapn)));
	//   53  110:aload_1         
	//   54  111:aload_0         
	//   55  112:getfield        #20  <Field zziw zzapn>
	//   56  115:invokevirtual   #66  <Method void zzbez.zza(zzbfi)>
				}
			} else
	//*  57  118:goto            0
			{
				int j = zzbez1.getPosition();
	//   58  121:aload_1         
	//   59  122:invokevirtual   #69  <Method int zzbez.getPosition()>
	//   60  125:istore_3        
				try
				{
					zzanu = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//   61  126:aload_0         
	//   62  127:aload_1         
	//   63  128:invokevirtual   #54  <Method int zzbez.zzacc()>
	//   64  131:invokestatic    #75  <Method int zzia.zzd(int)>
	//   65  134:invokestatic    #60  <Method Integer Integer.valueOf(int)>
	//   66  137:putfield        #18  <Field Integer zzanu>
				}
	//*  67  140:goto            0
	//*  68  143:aload_1         
	//*  69  144:iload_3         
	//*  70  145:invokevirtual   #79  <Method void zzbez.zzdc(int)>
	//*  71  148:aload_0         
	//*  72  149:aload_1         
	//*  73  150:iload_2         
	//*  74  151:invokevirtual   #51  <Method boolean zzbfc.zza(zzbez, int)>
	//*  75  154:pop             
	//*  76  155:goto            0
	//*  77  158:aload_0         
	//*  78  159:areturn         
				// Misplaced declaration of an exception variable
				catch(IllegalArgumentException illegalargumentexception)
				{
					zzbez1.zzdc(j);
					((zzbfc)this).zza(zzbez1, i);
				}
			}
		} while(true);
		return this;
	//*  79  160:astore          4
	//*  80  162:goto            143
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzv(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #83  <Method zziy zzv(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzanu != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Integer zzanu>
	//*   2    4:ifnull          19
			zzbfa1.zzm(1, zzanu.intValue());
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Integer zzanu>
	//    7   13:invokevirtual   #87  <Method int Integer.intValue()>
	//    8   16:invokevirtual   #93  <Method void zzbfa.zzm(int, int)>
		if(zzapn != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #20  <Field zziw zzapn>
	//*  11   23:ifnull          35
			zzbfa1.zza(2, ((zzbfi) (zzapn)));
	//   12   26:aload_1         
	//   13   27:iconst_2        
	//   14   28:aload_0         
	//   15   29:getfield        #20  <Field zziw zzapn>
	//   16   32:invokevirtual   #96  <Method void zzbfa.zza(int, zzbfi)>
		if(zzape != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #22  <Field Integer zzape>
	//*  19   39:ifnull          54
			zzbfa1.zzm(3, zzape.intValue());
	//   20   42:aload_1         
	//   21   43:iconst_3        
	//   22   44:aload_0         
	//   23   45:getfield        #22  <Field Integer zzape>
	//   24   48:invokevirtual   #87  <Method int Integer.intValue()>
	//   25   51:invokevirtual   #93  <Method void zzbfa.zzm(int, int)>
		if(zzapf != null)
	//*  26   54:aload_0         
	//*  27   55:getfield        #24  <Field Integer zzapf>
	//*  28   58:ifnull          73
			zzbfa1.zzm(4, zzapf.intValue());
	//   29   61:aload_1         
	//   30   62:iconst_4        
	//   31   63:aload_0         
	//   32   64:getfield        #24  <Field Integer zzapf>
	//   33   67:invokevirtual   #87  <Method int Integer.intValue()>
	//   34   70:invokevirtual   #93  <Method void zzbfa.zzm(int, int)>
		if(zzapr != null)
	//*  35   73:aload_0         
	//*  36   74:getfield        #26  <Field Integer zzapr>
	//*  37   77:ifnull          92
			zzbfa1.zzm(5, zzapr.intValue());
	//   38   80:aload_1         
	//   39   81:iconst_5        
	//   40   82:aload_0         
	//   41   83:getfield        #26  <Field Integer zzapr>
	//   42   86:invokevirtual   #87  <Method int Integer.intValue()>
	//   43   89:invokevirtual   #93  <Method void zzbfa.zzm(int, int)>
		super.zza(zzbfa1);
	//   44   92:aload_0         
	//   45   93:aload_1         
	//   46   94:invokespecial   #98  <Method void zzbfc.zza(zzbfa)>
	//   47   97:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzanu != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #18  <Field Integer zzanu>
	//*   7   11:ifnull          28
			i = j + zzbfa.zzq(1, zzanu.intValue());
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #18  <Field Integer zzanu>
	//   12   20:invokevirtual   #87  <Method int Integer.intValue()>
	//   13   23:invokestatic    #105 <Method int zzbfa.zzq(int, int)>
	//   14   26:iadd            
	//   15   27:istore_1        
		j = i;
	//   16   28:iload_1         
	//   17   29:istore_2        
		if(zzapn != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #20  <Field zziw zzapn>
	//*  20   34:ifnull          48
			j = i + zzbfa.zzb(2, ((zzbfi) (zzapn)));
	//   21   37:iload_1         
	//   22   38:iconst_2        
	//   23   39:aload_0         
	//   24   40:getfield        #20  <Field zziw zzapn>
	//   25   43:invokestatic    #109 <Method int zzbfa.zzb(int, zzbfi)>
	//   26   46:iadd            
	//   27   47:istore_2        
		i = j;
	//   28   48:iload_2         
	//   29   49:istore_1        
		if(zzape != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #22  <Field Integer zzape>
	//*  32   54:ifnull          71
			i = j + zzbfa.zzq(3, zzape.intValue());
	//   33   57:iload_2         
	//   34   58:iconst_3        
	//   35   59:aload_0         
	//   36   60:getfield        #22  <Field Integer zzape>
	//   37   63:invokevirtual   #87  <Method int Integer.intValue()>
	//   38   66:invokestatic    #105 <Method int zzbfa.zzq(int, int)>
	//   39   69:iadd            
	//   40   70:istore_1        
		j = i;
	//   41   71:iload_1         
	//   42   72:istore_2        
		if(zzapf != null)
	//*  43   73:aload_0         
	//*  44   74:getfield        #24  <Field Integer zzapf>
	//*  45   77:ifnull          94
			j = i + zzbfa.zzq(4, zzapf.intValue());
	//   46   80:iload_1         
	//   47   81:iconst_4        
	//   48   82:aload_0         
	//   49   83:getfield        #24  <Field Integer zzapf>
	//   50   86:invokevirtual   #87  <Method int Integer.intValue()>
	//   51   89:invokestatic    #105 <Method int zzbfa.zzq(int, int)>
	//   52   92:iadd            
	//   53   93:istore_2        
		i = j;
	//   54   94:iload_2         
	//   55   95:istore_1        
		if(zzapr != null)
	//*  56   96:aload_0         
	//*  57   97:getfield        #26  <Field Integer zzapr>
	//*  58  100:ifnull          117
			i = j + zzbfa.zzq(5, zzapr.intValue());
	//   59  103:iload_2         
	//   60  104:iconst_5        
	//   61  105:aload_0         
	//   62  106:getfield        #26  <Field Integer zzapr>
	//   63  109:invokevirtual   #87  <Method int Integer.intValue()>
	//   64  112:invokestatic    #105 <Method int zzbfa.zzq(int, int)>
	//   65  115:iadd            
	//   66  116:istore_1        
		return i;
	//   67  117:iload_1         
	//   68  118:ireturn         
	}

	private Integer zzanu;
	private Integer zzape;
	private Integer zzapf;
	private zziw zzapn;
	private Integer zzapr;
}
