// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfc, zzbez, zzis, zziw, 
//			zzia, zzit, zzbfa, zzbfi

public final class zzix extends zzbfc
{

	public zzix()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzbfc()>
		zzapq = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field zzit zzapq>
		zzanu = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field Integer zzanu>
		zzapn = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field zziw zzapn>
		zzapo = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #25  <Field zzis zzapo>
		zzebk = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #29  <Field zzbfe zzebk>
		zzebt = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #33  <Field int zzebt>
	//   20   34:return          
	}

	private final zzix zzu(zzbez zzbez1)
		throws IOException
	{
		IllegalArgumentException illegalargumentexception;
		do
		{
			int i = zzbez1.zzabk();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #46  <Method int zzbez.zzabk()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            168
			Object obj;
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          135
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          98
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          71
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          44
						{
							if(!super.zza(zzbez1, i))
	//*  17   33:aload_0         
	//*  18   34:aload_1         
	//*  19   35:iload_2         
	//*  20   36:invokespecial   #50  <Method boolean zzbfc.zza(zzbez, int)>
	//*  21   39:ifne            0
								return this;
	//   22   42:aload_0         
	//   23   43:areturn         
							continue;
						}
						if(zzapo == null)
	//*  24   44:aload_0         
	//*  25   45:getfield        #25  <Field zzis zzapo>
	//*  26   48:ifnonnull       62
							zzapo = new zzis();
	//   27   51:aload_0         
	//   28   52:new             #52  <Class zzis>
	//   29   55:dup             
	//   30   56:invokespecial   #53  <Method void zzis()>
	//   31   59:putfield        #25  <Field zzis zzapo>
						obj = ((Object) (zzapo));
	//   32   62:aload_0         
	//   33   63:getfield        #25  <Field zzis zzapo>
	//   34   66:astore          4
					} else
	//*  35   68:goto            159
					{
						if(zzapn == null)
	//*  36   71:aload_0         
	//*  37   72:getfield        #23  <Field zziw zzapn>
	//*  38   75:ifnonnull       89
							zzapn = new zziw();
	//   39   78:aload_0         
	//   40   79:new             #55  <Class zziw>
	//   41   82:dup             
	//   42   83:invokespecial   #56  <Method void zziw()>
	//   43   86:putfield        #23  <Field zziw zzapn>
						obj = ((Object) (zzapn));
	//   44   89:aload_0         
	//   45   90:getfield        #23  <Field zziw zzapn>
	//   46   93:astore          4
					}
				} else
	//*  47   95:goto            159
				{
					int j = zzbez1.getPosition();
	//   48   98:aload_1         
	//   49   99:invokevirtual   #59  <Method int zzbez.getPosition()>
	//   50  102:istore_3        
					try
					{
						zzanu = Integer.valueOf(zzia.zzd(zzbez1.zzacc()));
	//   51  103:aload_0         
	//   52  104:aload_1         
	//   53  105:invokevirtual   #62  <Method int zzbez.zzacc()>
	//   54  108:invokestatic    #68  <Method int zzia.zzd(int)>
	//   55  111:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   56  114:putfield        #21  <Field Integer zzanu>
					}
	//*  57  117:goto            0
	//*  58  120:aload_1         
	//*  59  121:iload_3         
	//*  60  122:invokevirtual   #78  <Method void zzbez.zzdc(int)>
	//*  61  125:aload_0         
	//*  62  126:aload_1         
	//*  63  127:iload_2         
	//*  64  128:invokevirtual   #50  <Method boolean zzbfc.zza(zzbez, int)>
	//*  65  131:pop             
	//*  66  132:goto            0
	//*  67  135:aload_0         
	//*  68  136:getfield        #19  <Field zzit zzapq>
	//*  69  139:ifnonnull       153
	//*  70  142:aload_0         
	//*  71  143:new             #80  <Class zzit>
	//*  72  146:dup             
	//*  73  147:invokespecial   #81  <Method void zzit()>
	//*  74  150:putfield        #19  <Field zzit zzapq>
	//*  75  153:aload_0         
	//*  76  154:getfield        #19  <Field zzit zzapq>
	//*  77  157:astore          4
	//*  78  159:aload_1         
	//*  79  160:aload           4
	//*  80  162:invokevirtual   #84  <Method void zzbez.zza(zzbfi)>
	//*  81  165:goto            0
	//*  82  168:aload_0         
	//*  83  169:areturn         
					// Misplaced declaration of an exception variable
					catch(IllegalArgumentException illegalargumentexception)
					{
						zzbez1.zzdc(j);
						((zzbfc)this).zza(zzbez1, i);
					}
					continue;
				}
			} else
			{
				if(zzapq == null)
					zzapq = new zzit();
				obj = ((Object) (zzapq));
			}
			zzbez1.zza(((zzbfi) (obj)));
		} while(true);
		return this;
	//*  84  170:astore          4
	//*  85  172:goto            120
	}

	public final zzbfi zza(zzbez zzbez1)
		throws IOException
	{
		return ((zzbfi) (zzu(zzbez1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #88  <Method zzix zzu(zzbez)>
	//    3    5:areturn         
	}

	public final void zza(zzbfa zzbfa1)
		throws IOException
	{
		if(zzapq != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field zzit zzapq>
	//*   2    4:ifnull          16
			zzbfa1.zza(1, ((zzbfi) (zzapq)));
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field zzit zzapq>
	//    7   13:invokevirtual   #94  <Method void zzbfa.zza(int, zzbfi)>
		if(zzanu != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #21  <Field Integer zzanu>
	//*  10   20:ifnull          35
			zzbfa1.zzm(2, zzanu.intValue());
	//   11   23:aload_1         
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field Integer zzanu>
	//   15   29:invokevirtual   #97  <Method int Integer.intValue()>
	//   16   32:invokevirtual   #101 <Method void zzbfa.zzm(int, int)>
		if(zzapn != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #23  <Field zziw zzapn>
	//*  19   39:ifnull          51
			zzbfa1.zza(3, ((zzbfi) (zzapn)));
	//   20   42:aload_1         
	//   21   43:iconst_3        
	//   22   44:aload_0         
	//   23   45:getfield        #23  <Field zziw zzapn>
	//   24   48:invokevirtual   #94  <Method void zzbfa.zza(int, zzbfi)>
		if(zzapo != null)
	//*  25   51:aload_0         
	//*  26   52:getfield        #25  <Field zzis zzapo>
	//*  27   55:ifnull          67
			zzbfa1.zza(4, ((zzbfi) (zzapo)));
	//   28   58:aload_1         
	//   29   59:iconst_4        
	//   30   60:aload_0         
	//   31   61:getfield        #25  <Field zzis zzapo>
	//   32   64:invokevirtual   #94  <Method void zzbfa.zza(int, zzbfi)>
		super.zza(zzbfa1);
	//   33   67:aload_0         
	//   34   68:aload_1         
	//   35   69:invokespecial   #103 <Method void zzbfc.zza(zzbfa)>
	//   36   72:return          
	}

	protected final int zzr()
	{
		int j = super.zzr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method int zzbfc.zzr()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(zzapq != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #19  <Field zzit zzapq>
	//*   7   11:ifnull          25
			i = j + zzbfa.zzb(1, ((zzbfi) (zzapq)));
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #19  <Field zzit zzapq>
	//   12   20:invokestatic    #110 <Method int zzbfa.zzb(int, zzbfi)>
	//   13   23:iadd            
	//   14   24:istore_1        
		j = i;
	//   15   25:iload_1         
	//   16   26:istore_2        
		if(zzanu != null)
	//*  17   27:aload_0         
	//*  18   28:getfield        #21  <Field Integer zzanu>
	//*  19   31:ifnull          48
			j = i + zzbfa.zzq(2, zzanu.intValue());
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:aload_0         
	//   23   37:getfield        #21  <Field Integer zzanu>
	//   24   40:invokevirtual   #97  <Method int Integer.intValue()>
	//   25   43:invokestatic    #114 <Method int zzbfa.zzq(int, int)>
	//   26   46:iadd            
	//   27   47:istore_2        
		i = j;
	//   28   48:iload_2         
	//   29   49:istore_1        
		if(zzapn != null)
	//*  30   50:aload_0         
	//*  31   51:getfield        #23  <Field zziw zzapn>
	//*  32   54:ifnull          68
			i = j + zzbfa.zzb(3, ((zzbfi) (zzapn)));
	//   33   57:iload_2         
	//   34   58:iconst_3        
	//   35   59:aload_0         
	//   36   60:getfield        #23  <Field zziw zzapn>
	//   37   63:invokestatic    #110 <Method int zzbfa.zzb(int, zzbfi)>
	//   38   66:iadd            
	//   39   67:istore_1        
		j = i;
	//   40   68:iload_1         
	//   41   69:istore_2        
		if(zzapo != null)
	//*  42   70:aload_0         
	//*  43   71:getfield        #25  <Field zzis zzapo>
	//*  44   74:ifnull          88
			j = i + zzbfa.zzb(4, ((zzbfi) (zzapo)));
	//   45   77:iload_1         
	//   46   78:iconst_4        
	//   47   79:aload_0         
	//   48   80:getfield        #25  <Field zzis zzapo>
	//   49   83:invokestatic    #110 <Method int zzbfa.zzb(int, zzbfi)>
	//   50   86:iadd            
	//   51   87:istore_2        
		return j;
	//   52   88:iload_2         
	//   53   89:ireturn         
	}

	private Integer zzanu;
	private zziw zzapn;
	private zzis zzapo;
	private zzit zzapq;
}
