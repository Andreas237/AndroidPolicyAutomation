// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjn, zzjk, zzdi, zzdn, 
//			zzdh, zzjl, zzjt

public final class zzdr extends zzjn
{

	public zzdr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void zzjn()>
		name = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field String name>
		zzpq = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field Long zzpq>
		zzpr = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #26  <Field zzdh zzpr>
		zzon = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #28  <Field String zzon>
		zzps = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #30  <Field zzdn zzps>
		zzpt = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #32  <Field zzdi zzpt>
		zzadp = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #36  <Field int zzadp>
	//   23   39:return          
	}

	public final zzjt zza(zzjk zzjk1)
		throws IOException
	{
		do
		{
			int i = zzjk1.zzdq();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method int zzjk.zzdq()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            181
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          170
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          156
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          127
					{
						if(i != 50)
	//*  14   27:iload_2         
	//*  15   28:bipush          50
	//*  16   30:icmpeq          116
						{
							if(i != 130)
	//*  17   33:iload_2         
	//*  18   34:sipush          130
	//*  19   37:icmpeq          87
							{
								if(i != 138)
	//*  20   40:iload_2         
	//*  21   41:sipush          138
	//*  22   44:icmpeq          58
								{
									if(!super.zza(zzjk1, i))
	//*  23   47:aload_0         
	//*  24   48:aload_1         
	//*  25   49:iload_2         
	//*  26   50:invokespecial   #50  <Method boolean zzjn.zza(zzjk, int)>
	//*  27   53:ifne            0
										return ((zzjt) (this));
	//   28   56:aload_0         
	//   29   57:areturn         
								} else
								{
									if(zzpt == null)
	//*  30   58:aload_0         
	//*  31   59:getfield        #32  <Field zzdi zzpt>
	//*  32   62:ifnonnull       76
										zzpt = new zzdi();
	//   33   65:aload_0         
	//   34   66:new             #52  <Class zzdi>
	//   35   69:dup             
	//   36   70:invokespecial   #53  <Method void zzdi()>
	//   37   73:putfield        #32  <Field zzdi zzpt>
									zzjk1.zza(((zzjt) (zzpt)));
	//   38   76:aload_1         
	//   39   77:aload_0         
	//   40   78:getfield        #32  <Field zzdi zzpt>
	//   41   81:invokevirtual   #56  <Method void zzjk.zza(zzjt)>
								}
							} else
	//*  42   84:goto            0
							{
								if(zzps == null)
	//*  43   87:aload_0         
	//*  44   88:getfield        #30  <Field zzdn zzps>
	//*  45   91:ifnonnull       105
									zzps = new zzdn();
	//   46   94:aload_0         
	//   47   95:new             #58  <Class zzdn>
	//   48   98:dup             
	//   49   99:invokespecial   #59  <Method void zzdn()>
	//   50  102:putfield        #30  <Field zzdn zzps>
								zzjk1.zza(((zzjt) (zzps)));
	//   51  105:aload_1         
	//   52  106:aload_0         
	//   53  107:getfield        #30  <Field zzdn zzps>
	//   54  110:invokevirtual   #56  <Method void zzjk.zza(zzjt)>
							}
						} else
	//*  55  113:goto            0
						{
							zzon = zzjk1.readString();
	//   56  116:aload_0         
	//   57  117:aload_1         
	//   58  118:invokevirtual   #63  <Method String zzjk.readString()>
	//   59  121:putfield        #28  <Field String zzon>
						}
					} else
	//*  60  124:goto            0
					{
						if(zzpr == null)
	//*  61  127:aload_0         
	//*  62  128:getfield        #26  <Field zzdh zzpr>
	//*  63  131:ifnonnull       145
							zzpr = new zzdh();
	//   64  134:aload_0         
	//   65  135:new             #65  <Class zzdh>
	//   66  138:dup             
	//   67  139:invokespecial   #66  <Method void zzdh()>
	//   68  142:putfield        #26  <Field zzdh zzpr>
						zzjk1.zza(((zzjt) (zzpr)));
	//   69  145:aload_1         
	//   70  146:aload_0         
	//   71  147:getfield        #26  <Field zzdh zzpr>
	//   72  150:invokevirtual   #56  <Method void zzjk.zza(zzjt)>
					}
				} else
	//*  73  153:goto            0
				{
					zzpq = Long.valueOf(zzjk1.zzdu());
	//   74  156:aload_0         
	//   75  157:aload_1         
	//   76  158:invokevirtual   #70  <Method long zzjk.zzdu()>
	//   77  161:invokestatic    #76  <Method Long Long.valueOf(long)>
	//   78  164:putfield        #24  <Field Long zzpq>
				}
			} else
	//*  79  167:goto            0
			{
				name = zzjk1.readString();
	//   80  170:aload_0         
	//   81  171:aload_1         
	//   82  172:invokevirtual   #63  <Method String zzjk.readString()>
	//   83  175:putfield        #22  <Field String name>
			}
		} while(true);
	//   84  178:goto            0
		return ((zzjt) (this));
	//   85  181:aload_0         
	//   86  182:areturn         
	}

	public final void zza(zzjl zzjl1)
		throws IOException
	{
		Object obj = ((Object) (name));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String name>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			zzjl1.zza(1, ((String) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #83  <Method void zzjl.zza(int, String)>
		obj = ((Object) (zzpq));
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field Long zzpq>
	//   11   19:astore_2        
		if(obj != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          33
			zzjl1.zzi(2, ((Long) (obj)).longValue());
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #86  <Method long Long.longValue()>
	//   18   30:invokevirtual   #90  <Method void zzjl.zzi(int, long)>
		obj = ((Object) (zzpr));
	//   19   33:aload_0         
	//   20   34:getfield        #26  <Field zzdh zzpr>
	//   21   37:astore_2        
		if(obj != null)
	//*  22   38:aload_2         
	//*  23   39:ifnull          48
			zzjl1.zza(3, ((zzjt) (obj)));
	//   24   42:aload_1         
	//   25   43:iconst_3        
	//   26   44:aload_2         
	//   27   45:invokevirtual   #93  <Method void zzjl.zza(int, zzjt)>
		obj = ((Object) (zzon));
	//   28   48:aload_0         
	//   29   49:getfield        #28  <Field String zzon>
	//   30   52:astore_2        
		if(obj != null)
	//*  31   53:aload_2         
	//*  32   54:ifnull          64
			zzjl1.zza(6, ((String) (obj)));
	//   33   57:aload_1         
	//   34   58:bipush          6
	//   35   60:aload_2         
	//   36   61:invokevirtual   #83  <Method void zzjl.zza(int, String)>
		obj = ((Object) (zzps));
	//   37   64:aload_0         
	//   38   65:getfield        #30  <Field zzdn zzps>
	//   39   68:astore_2        
		if(obj != null)
	//*  40   69:aload_2         
	//*  41   70:ifnull          80
			zzjl1.zza(16, ((zzjt) (obj)));
	//   42   73:aload_1         
	//   43   74:bipush          16
	//   44   76:aload_2         
	//   45   77:invokevirtual   #93  <Method void zzjl.zza(int, zzjt)>
		obj = ((Object) (zzpt));
	//   46   80:aload_0         
	//   47   81:getfield        #32  <Field zzdi zzpt>
	//   48   84:astore_2        
		if(obj != null)
	//*  49   85:aload_2         
	//*  50   86:ifnull          96
			zzjl1.zza(17, ((zzjt) (obj)));
	//   51   89:aload_1         
	//   52   90:bipush          17
	//   53   92:aload_2         
	//   54   93:invokevirtual   #93  <Method void zzjl.zza(int, zzjt)>
		super.zza(zzjl1);
	//   55   96:aload_0         
	//   56   97:aload_1         
	//   57   98:invokespecial   #95  <Method void zzjn.zza(zzjl)>
	//   58  101:return          
	}

	protected final int zzt()
	{
		int j = super.zzt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method int zzjn.zzt()>
	//    2    4:istore_2        
		Object obj = ((Object) (name));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field String name>
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
	//   13   19:invokestatic    #102 <Method int zzjl.zzb(int, String)>
	//   14   22:iadd            
	//   15   23:istore_1        
		obj = ((Object) (zzpq));
	//   16   24:aload_0         
	//   17   25:getfield        #24  <Field Long zzpq>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          46
			j = i + zzjl.zzd(2, ((Long) (obj)).longValue());
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokevirtual   #86  <Method long Long.longValue()>
	//   27   41:invokestatic    #106 <Method int zzjl.zzd(int, long)>
	//   28   44:iadd            
	//   29   45:istore_2        
		obj = ((Object) (zzpr));
	//   30   46:aload_0         
	//   31   47:getfield        #26  <Field zzdh zzpr>
	//   32   50:astore_3        
		i = j;
	//   33   51:iload_2         
	//   34   52:istore_1        
		if(obj != null)
	//*  35   53:aload_3         
	//*  36   54:ifnull          65
			i = j + zzjl.zzb(3, ((zzjt) (obj)));
	//   37   57:iload_2         
	//   38   58:iconst_3        
	//   39   59:aload_3         
	//   40   60:invokestatic    #109 <Method int zzjl.zzb(int, zzjt)>
	//   41   63:iadd            
	//   42   64:istore_1        
		obj = ((Object) (zzon));
	//   43   65:aload_0         
	//   44   66:getfield        #28  <Field String zzon>
	//   45   69:astore_3        
		j = i;
	//   46   70:iload_1         
	//   47   71:istore_2        
		if(obj != null)
	//*  48   72:aload_3         
	//*  49   73:ifnull          85
			j = i + zzjl.zzb(6, ((String) (obj)));
	//   50   76:iload_1         
	//   51   77:bipush          6
	//   52   79:aload_3         
	//   53   80:invokestatic    #102 <Method int zzjl.zzb(int, String)>
	//   54   83:iadd            
	//   55   84:istore_2        
		obj = ((Object) (zzps));
	//   56   85:aload_0         
	//   57   86:getfield        #30  <Field zzdn zzps>
	//   58   89:astore_3        
		i = j;
	//   59   90:iload_2         
	//   60   91:istore_1        
		if(obj != null)
	//*  61   92:aload_3         
	//*  62   93:ifnull          105
			i = j + zzjl.zzb(16, ((zzjt) (obj)));
	//   63   96:iload_2         
	//   64   97:bipush          16
	//   65   99:aload_3         
	//   66  100:invokestatic    #109 <Method int zzjl.zzb(int, zzjt)>
	//   67  103:iadd            
	//   68  104:istore_1        
		obj = ((Object) (zzpt));
	//   69  105:aload_0         
	//   70  106:getfield        #32  <Field zzdi zzpt>
	//   71  109:astore_3        
		j = i;
	//   72  110:iload_1         
	//   73  111:istore_2        
		if(obj != null)
	//*  74  112:aload_3         
	//*  75  113:ifnull          125
			j = i + zzjl.zzb(17, ((zzjt) (obj)));
	//   76  116:iload_1         
	//   77  117:bipush          17
	//   78  119:aload_3         
	//   79  120:invokestatic    #109 <Method int zzjl.zzb(int, zzjt)>
	//   80  123:iadd            
	//   81  124:istore_2        
		return j;
	//   82  125:iload_2         
	//   83  126:ireturn         
	}

	public String name;
	public String zzon;
	public Long zzpq;
	public zzdh zzpr;
	public zzdn zzps;
	private zzdi zzpt;
}
