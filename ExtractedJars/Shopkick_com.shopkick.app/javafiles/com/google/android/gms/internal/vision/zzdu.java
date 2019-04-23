// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjk, zzdp, zzdr, 
//			zzdl, zzjl, zzjt

public final class zzdu extends zzjn
{

	public zzdu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzjn()>
		zzqc = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field zzdl zzqc>
		zzqd = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field zzdr zzqd>
		zzqe = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field zzdp zzqe>
		zzqf = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #25  <Field Integer zzqf>
		zzadp = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #29  <Field int zzadp>
	//   17   29:return          
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
		do
		{
			int i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            145
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          116
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          87
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          58
					{
						if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          44
						{
							if(!super.zza(zzjk1, i))
	//*  17   33:aload_0         
	//*  18   34:aload_1         
	//*  19   35:iload_2         
	//*  20   36:invokespecial   #43  <Method boolean zzjn.zza(zzjk, int)>
	//*  21   39:ifne            0
								return ((zzjt) (this));
	//   22   42:aload_0         
	//   23   43:areturn         
						} else
						{
							zzqf = Integer.valueOf(zzjk1.zzdt());
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #46  <Method int zzjk.zzdt()>
	//   27   49:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   28   52:putfield        #25  <Field Integer zzqf>
						}
					} else
	//*  29   55:goto            0
					{
						if(zzqe == null)
	//*  30   58:aload_0         
	//*  31   59:getfield        #23  <Field zzdp zzqe>
	//*  32   62:ifnonnull       76
							zzqe = new zzdp();
	//   33   65:aload_0         
	//   34   66:new             #54  <Class zzdp>
	//   35   69:dup             
	//   36   70:invokespecial   #55  <Method void zzdp()>
	//   37   73:putfield        #23  <Field zzdp zzqe>
						zzjk1.zza(((zzjt) (zzqe)));
	//   38   76:aload_1         
	//   39   77:aload_0         
	//   40   78:getfield        #23  <Field zzdp zzqe>
	//   41   81:invokevirtual   #58  <Method void zzjk.zza(zzjt)>
					}
				} else
	//*  42   84:goto            0
				{
					if(zzqd == null)
	//*  43   87:aload_0         
	//*  44   88:getfield        #21  <Field zzdr zzqd>
	//*  45   91:ifnonnull       105
						zzqd = new zzdr();
	//   46   94:aload_0         
	//   47   95:new             #60  <Class zzdr>
	//   48   98:dup             
	//   49   99:invokespecial   #61  <Method void zzdr()>
	//   50  102:putfield        #21  <Field zzdr zzqd>
					zzjk1.zza(((zzjt) (zzqd)));
	//   51  105:aload_1         
	//   52  106:aload_0         
	//   53  107:getfield        #21  <Field zzdr zzqd>
	//   54  110:invokevirtual   #58  <Method void zzjk.zza(zzjt)>
				}
			} else
	//*  55  113:goto            0
			{
				if(zzqc == null)
	//*  56  116:aload_0         
	//*  57  117:getfield        #19  <Field zzdl zzqc>
	//*  58  120:ifnonnull       134
					zzqc = new zzdl();
	//   59  123:aload_0         
	//   60  124:new             #63  <Class zzdl>
	//   61  127:dup             
	//   62  128:invokespecial   #64  <Method void zzdl()>
	//   63  131:putfield        #19  <Field zzdl zzqc>
				zzjk1.zza(((zzjt) (zzqc)));
	//   64  134:aload_1         
	//   65  135:aload_0         
	//   66  136:getfield        #19  <Field zzdl zzqc>
	//   67  139:invokevirtual   #58  <Method void zzjk.zza(zzjt)>
			}
		} while(true);
	//   68  142:goto            0
		return ((zzjt) (this));
	//   69  145:aload_0         
	//   70  146:areturn         
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		Object obj = ((Object) (zzqc));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzdl zzqc>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			zzjl1.zza(1, ((zzjt) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #71  <Method void zzjl.zza(int, zzjt)>
		obj = ((Object) (zzqd));
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field zzdr zzqd>
	//   11   19:astore_2        
		if(obj != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          30
			zzjl1.zza(2, ((zzjt) (obj)));
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #71  <Method void zzjl.zza(int, zzjt)>
		obj = ((Object) (zzqe));
	//   18   30:aload_0         
	//   19   31:getfield        #23  <Field zzdp zzqe>
	//   20   34:astore_2        
		if(obj != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          45
			zzjl1.zza(3, ((zzjt) (obj)));
	//   23   39:aload_1         
	//   24   40:iconst_3        
	//   25   41:aload_2         
	//   26   42:invokevirtual   #71  <Method void zzjl.zza(int, zzjt)>
		obj = ((Object) (zzqf));
	//   27   45:aload_0         
	//   28   46:getfield        #25  <Field Integer zzqf>
	//   29   49:astore_2        
		if(obj != null)
	//*  30   50:aload_2         
	//*  31   51:ifnull          63
			zzjl1.zze(4, ((Integer) (obj)).intValue());
	//   32   54:aload_1         
	//   33   55:iconst_4        
	//   34   56:aload_2         
	//   35   57:invokevirtual   #74  <Method int Integer.intValue()>
	//   36   60:invokevirtual   #78  <Method void zzjl.zze(int, int)>
		super.zza(zzjl1);
	//   37   63:aload_0         
	//   38   64:aload_1         
	//   39   65:invokespecial   #80  <Method void zzjn.zza(zzjl)>
	//   40   68:return          
	}

	protected final int zzt()
	{
		int j = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method int zzjn.zzt()>
	//    2    4:istore_2        
		Object obj = ((Object) (zzqc));
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field zzdl zzqc>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + zzjl.zzb(1, ((zzjt) (obj)));
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #87  <Method int zzjl.zzb(int, zzjt)>
	//   14   22:iadd            
	//   15   23:istore_1        
		obj = ((Object) (zzqd));
	//   16   24:aload_0         
	//   17   25:getfield        #21  <Field zzdr zzqd>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          43
			j = i + zzjl.zzb(2, ((zzjt) (obj)));
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokestatic    #87  <Method int zzjl.zzb(int, zzjt)>
	//   27   41:iadd            
	//   28   42:istore_2        
		obj = ((Object) (zzqe));
	//   29   43:aload_0         
	//   30   44:getfield        #23  <Field zzdp zzqe>
	//   31   47:astore_3        
		i = j;
	//   32   48:iload_2         
	//   33   49:istore_1        
		if(obj != null)
	//*  34   50:aload_3         
	//*  35   51:ifnull          62
			i = j + zzjl.zzb(3, ((zzjt) (obj)));
	//   36   54:iload_2         
	//   37   55:iconst_3        
	//   38   56:aload_3         
	//   39   57:invokestatic    #87  <Method int zzjl.zzb(int, zzjt)>
	//   40   60:iadd            
	//   41   61:istore_1        
		obj = ((Object) (zzqf));
	//   42   62:aload_0         
	//   43   63:getfield        #25  <Field Integer zzqf>
	//   44   66:astore_3        
		j = i;
	//   45   67:iload_1         
	//   46   68:istore_2        
		if(obj != null)
	//*  47   69:aload_3         
	//*  48   70:ifnull          84
			j = i + zzjl.zzi(4, ((Integer) (obj)).intValue());
	//   49   73:iload_1         
	//   50   74:iconst_4        
	//   51   75:aload_3         
	//   52   76:invokevirtual   #74  <Method int Integer.intValue()>
	//   53   79:invokestatic    #91  <Method int zzjl.zzi(int, int)>
	//   54   82:iadd            
	//   55   83:istore_2        
		return j;
	//   56   84:iload_2         
	//   57   85:ireturn         
	}

	private zzdl zzqc;
	public zzdr zzqd;
	public zzdp zzqe;
	private Integer zzqf;
}
