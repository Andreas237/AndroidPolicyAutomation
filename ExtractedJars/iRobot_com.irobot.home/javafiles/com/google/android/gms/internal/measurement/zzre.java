// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzl, zzo, zzye, 
//			zzxz, zzya, zzyi

public final class zzre extends zzyc
{

	public zzre()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzyc()>
		zzbqe = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #17  <Field long zzbqe>
		zzqg = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #19  <Field zzl zzqg>
		zzbqf = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #21  <Field zzo zzbqf>
		zzcev = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #25  <Field zzye zzcev>
		zzcff = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #29  <Field int zzcff>
	//   17   29:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzre))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzre>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzre)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzre>
	//   12   20:astore_1        
		if(zzbqe != ((zzre) (obj)).zzbqe)
	//*  13   21:aload_0         
	//*  14   22:getfield        #17  <Field long zzbqe>
	//*  15   25:aload_1         
	//*  16   26:getfield        #17  <Field long zzbqe>
	//*  17   29:lcmp            
	//*  18   30:ifeq            35
			return false;
	//   19   33:iconst_0        
	//   20   34:ireturn         
		if(zzqg == null)
	//*  21   35:aload_0         
	//*  22   36:getfield        #19  <Field zzl zzqg>
	//*  23   39:ifnonnull       51
		{
			if(((zzre) (obj)).zzqg != null)
	//*  24   42:aload_1         
	//*  25   43:getfield        #19  <Field zzl zzqg>
	//*  26   46:ifnull          67
				return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
		} else
		if(!zzqg.equals(((Object) (((zzre) (obj)).zzqg))))
	//*  29   51:aload_0         
	//*  30   52:getfield        #19  <Field zzl zzqg>
	//*  31   55:aload_1         
	//*  32   56:getfield        #19  <Field zzl zzqg>
	//*  33   59:invokevirtual   #36  <Method boolean zzl.equals(Object)>
	//*  34   62:ifne            67
			return false;
	//   35   65:iconst_0        
	//   36   66:ireturn         
		if(zzbqf == null)
	//*  37   67:aload_0         
	//*  38   68:getfield        #21  <Field zzo zzbqf>
	//*  39   71:ifnonnull       83
		{
			if(((zzre) (obj)).zzbqf != null)
	//*  40   74:aload_1         
	//*  41   75:getfield        #21  <Field zzo zzbqf>
	//*  42   78:ifnull          99
				return false;
	//   43   81:iconst_0        
	//   44   82:ireturn         
		} else
		if(!zzbqf.equals(((Object) (((zzre) (obj)).zzbqf))))
	//*  45   83:aload_0         
	//*  46   84:getfield        #21  <Field zzo zzbqf>
	//*  47   87:aload_1         
	//*  48   88:getfield        #21  <Field zzo zzbqf>
	//*  49   91:invokevirtual   #39  <Method boolean zzo.equals(Object)>
	//*  50   94:ifne            99
			return false;
	//   51   97:iconst_0        
	//   52   98:ireturn         
		if(zzcev != null && !zzcev.isEmpty())
	//*  53   99:aload_0         
	//*  54  100:getfield        #25  <Field zzye zzcev>
	//*  55  103:ifnull          131
	//*  56  106:aload_0         
	//*  57  107:getfield        #25  <Field zzye zzcev>
	//*  58  110:invokevirtual   #45  <Method boolean zzye.isEmpty()>
	//*  59  113:ifeq            119
	//*  60  116:goto            131
			return zzcev.equals(((Object) (((zzre) (obj)).zzcev)));
	//   61  119:aload_0         
	//   62  120:getfield        #25  <Field zzye zzcev>
	//   63  123:aload_1         
	//   64  124:getfield        #25  <Field zzye zzcev>
	//   65  127:invokevirtual   #46  <Method boolean zzye.equals(Object)>
	//   66  130:ireturn         
		if(((zzre) (obj)).zzcev != null)
	//*  67  131:aload_1         
	//*  68  132:getfield        #25  <Field zzye zzcev>
	//*  69  135:ifnull          152
			return ((zzre) (obj)).zzcev.isEmpty();
	//   70  138:aload_1         
	//   71  139:getfield        #25  <Field zzye zzcev>
	//   72  142:invokevirtual   #45  <Method boolean zzye.isEmpty()>
	//   73  145:ifeq            150
	//   74  148:iconst_1        
	//   75  149:ireturn         
	//   76  150:iconst_0        
	//   77  151:ireturn         
		else
			return true;
	//   78  152:iconst_1        
	//   79  153:ireturn         
	}

	public final int hashCode()
	{
		int l = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #60  <Method String Class.getName()>
	//    3    7:invokevirtual   #64  <Method int String.hashCode()>
	//    4   10:istore          5
		int i1 = (int)(zzbqe ^ zzbqe >>> 32);
	//    5   12:aload_0         
	//    6   13:getfield        #17  <Field long zzbqe>
	//    7   16:aload_0         
	//    8   17:getfield        #17  <Field long zzbqe>
	//    9   20:bipush          32
	//   10   22:lushr           
	//   11   23:lxor            
	//   12   24:l2i             
	//   13   25:istore          6
		Object obj = ((Object) (zzqg));
	//   14   27:aload_0         
	//   15   28:getfield        #19  <Field zzl zzqg>
	//   16   31:astore          7
		boolean flag = false;
	//   17   33:iconst_0        
	//   18   34:istore          4
		int i;
		if(obj == null)
	//*  19   36:aload           7
	//*  20   38:ifnonnull       46
			i = 0;
	//   21   41:iconst_0        
	//   22   42:istore_1        
		else
	//*  23   43:goto            52
			i = ((zzl) (obj)).hashCode();
	//   24   46:aload           7
	//   25   48:invokevirtual   #65  <Method int zzl.hashCode()>
	//   26   51:istore_1        
		obj = ((Object) (zzbqf));
	//   27   52:aload_0         
	//   28   53:getfield        #21  <Field zzo zzbqf>
	//   29   56:astore          7
		int j;
		if(obj == null)
	//*  30   58:aload           7
	//*  31   60:ifnonnull       68
			j = 0;
	//   32   63:iconst_0        
	//   33   64:istore_2        
		else
	//*  34   65:goto            74
			j = ((zzo) (obj)).hashCode();
	//   35   68:aload           7
	//   36   70:invokevirtual   #66  <Method int zzo.hashCode()>
	//   37   73:istore_2        
		int k = ((int) (flag));
	//   38   74:iload           4
	//   39   76:istore_3        
		if(zzcev != null)
	//*  40   77:aload_0         
	//*  41   78:getfield        #25  <Field zzye zzcev>
	//*  42   81:ifnull          108
			if(zzcev.isEmpty())
	//*  43   84:aload_0         
	//*  44   85:getfield        #25  <Field zzye zzcev>
	//*  45   88:invokevirtual   #45  <Method boolean zzye.isEmpty()>
	//*  46   91:ifeq            100
				k = ((int) (flag));
	//   47   94:iload           4
	//   48   96:istore_3        
			else
	//*  49   97:goto            108
				k = zzcev.hashCode();
	//   50  100:aload_0         
	//   51  101:getfield        #25  <Field zzye zzcev>
	//   52  104:invokevirtual   #67  <Method int zzye.hashCode()>
	//   53  107:istore_3        
		return ((((l + 527) * 31 + i1) * 31 + i) * 31 + j) * 31 + k;
	//   54  108:iload           5
	//   55  110:sipush          527
	//   56  113:iadd            
	//   57  114:bipush          31
	//   58  116:imul            
	//   59  117:iload           6
	//   60  119:iadd            
	//   61  120:bipush          31
	//   62  122:imul            
	//   63  123:iload_1         
	//   64  124:iadd            
	//   65  125:bipush          31
	//   66  127:imul            
	//   67  128:iload_2         
	//   68  129:iadd            
	//   69  130:bipush          31
	//   70  132:imul            
	//   71  133:iload_3         
	//   72  134:iadd            
	//   73  135:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #74  <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            106
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          95
			{
				Object obj;
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          64
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          38
					{
						if(!super.zza(zzxz1, i))
	//*  14   27:aload_0         
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokespecial   #77  <Method boolean zzyc.zza(zzxz, int)>
	//*  18   33:ifne            0
							return ((zzyi) (this));
	//   19   36:aload_0         
	//   20   37:areturn         
						continue;
					}
					if(zzbqf == null)
	//*  21   38:aload_0         
	//*  22   39:getfield        #21  <Field zzo zzbqf>
	//*  23   42:ifnonnull       56
						zzbqf = new zzo();
	//   24   45:aload_0         
	//   25   46:new             #38  <Class zzo>
	//   26   49:dup             
	//   27   50:invokespecial   #78  <Method void zzo()>
	//   28   53:putfield        #21  <Field zzo zzbqf>
					obj = ((Object) (zzbqf));
	//   29   56:aload_0         
	//   30   57:getfield        #21  <Field zzo zzbqf>
	//   31   60:astore_3        
				} else
	//*  32   61:goto            87
				{
					if(zzqg == null)
	//*  33   64:aload_0         
	//*  34   65:getfield        #19  <Field zzl zzqg>
	//*  35   68:ifnonnull       82
						zzqg = new zzl();
	//   36   71:aload_0         
	//   37   72:new             #34  <Class zzl>
	//   38   75:dup             
	//   39   76:invokespecial   #79  <Method void zzl()>
	//   40   79:putfield        #19  <Field zzl zzqg>
					obj = ((Object) (zzqg));
	//   41   82:aload_0         
	//   42   83:getfield        #19  <Field zzl zzqg>
	//   43   86:astore_3        
				}
				zzxz1.zza(((zzyi) (obj)));
	//   44   87:aload_1         
	//   45   88:aload_3         
	//   46   89:invokevirtual   #82  <Method void zzxz.zza(zzyi)>
			} else
	//*  47   92:goto            0
			{
				zzbqe = zzxz1.zzvc();
	//   48   95:aload_0         
	//   49   96:aload_1         
	//   50   97:invokevirtual   #86  <Method long zzxz.zzvc()>
	//   51  100:putfield        #17  <Field long zzbqe>
			}
		} while(true);
	//   52  103:goto            0
		return ((zzyi) (this));
	//   53  106:aload_0         
	//   54  107:areturn         
	}

	public final void zza(zzya zzya1)
	{
		zzya1.zzi(1, zzbqe);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field long zzbqe>
	//    4    6:invokevirtual   #93  <Method void zzya.zzi(int, long)>
		if(zzqg != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #19  <Field zzl zzqg>
	//*   7   13:ifnull          25
			zzya1.zza(2, ((zzyi) (zzqg)));
	//    8   16:aload_1         
	//    9   17:iconst_2        
	//   10   18:aload_0         
	//   11   19:getfield        #19  <Field zzl zzqg>
	//   12   22:invokevirtual   #96  <Method void zzya.zza(int, zzyi)>
		if(zzbqf != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #21  <Field zzo zzbqf>
	//*  15   29:ifnull          41
			zzya1.zza(3, ((zzyi) (zzbqf)));
	//   16   32:aload_1         
	//   17   33:iconst_3        
	//   18   34:aload_0         
	//   19   35:getfield        #21  <Field zzo zzbqf>
	//   20   38:invokevirtual   #96  <Method void zzya.zza(int, zzyi)>
		super.zza(zzya1);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokespecial   #98  <Method void zzyc.zza(zzya)>
	//   24   46:return          
	}

	protected final int zzf()
	{
		int j = super.zzf() + zzya.zzd(1, zzbqe);
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method int zzyc.zzf()>
	//    2    4:iconst_1        
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field long zzbqe>
	//    5    9:invokestatic    #105 <Method int zzya.zzd(int, long)>
	//    6   12:iadd            
	//    7   13:istore_2        
		int i = j;
	//    8   14:iload_2         
	//    9   15:istore_1        
		if(zzqg != null)
	//*  10   16:aload_0         
	//*  11   17:getfield        #19  <Field zzl zzqg>
	//*  12   20:ifnull          34
			i = j + zzya.zzb(2, ((zzyi) (zzqg)));
	//   13   23:iload_2         
	//   14   24:iconst_2        
	//   15   25:aload_0         
	//   16   26:getfield        #19  <Field zzl zzqg>
	//   17   29:invokestatic    #109 <Method int zzya.zzb(int, zzyi)>
	//   18   32:iadd            
	//   19   33:istore_1        
		j = i;
	//   20   34:iload_1         
	//   21   35:istore_2        
		if(zzbqf != null)
	//*  22   36:aload_0         
	//*  23   37:getfield        #21  <Field zzo zzbqf>
	//*  24   40:ifnull          54
			j = i + zzya.zzb(3, ((zzyi) (zzbqf)));
	//   25   43:iload_1         
	//   26   44:iconst_3        
	//   27   45:aload_0         
	//   28   46:getfield        #21  <Field zzo zzbqf>
	//   29   49:invokestatic    #109 <Method int zzya.zzb(int, zzyi)>
	//   30   52:iadd            
	//   31   53:istore_2        
		return j;
	//   32   54:iload_2         
	//   33   55:ireturn         
	}

	public long zzbqe;
	public zzo zzbqf;
	public zzl zzqg;
}
