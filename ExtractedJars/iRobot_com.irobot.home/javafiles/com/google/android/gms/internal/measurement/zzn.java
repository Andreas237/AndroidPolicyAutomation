// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyg, zzp, zzj, 
//			zzye, zzxz, zzya, zzyi

public final class zzn extends zzyc
{

	public zzn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzyc()>
		name = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <String "">
	//    4    7:putfield        #21  <Field String name>
		zzqd = null;
	//    5   10:aload_0         
	//    6   11:aconst_null     
	//    7   12:putfield        #23  <Field zzp zzqd>
		zzqe = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #25  <Field zzj zzqe>
		zzcev = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #29  <Field zzye zzcev>
		zzcff = -1;
	//   14   25:aload_0         
	//   15   26:iconst_m1       
	//   16   27:putfield        #33  <Field int zzcff>
	//   17   30:return          
	}

	public static zzn[] zzj()
	{
		if(zzqc == null)
	//*   0    0:getstatic       #38  <Field zzn[] zzqc>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfe)
	//*   2    6:getstatic       #44  <Field Object zzyg.zzcfe>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzqc == null)
	//*   6   12:getstatic       #38  <Field zzn[] zzqc>
	//*   7   15:ifnonnull       25
					zzqc = new zzn[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzn[]
	//   10   22:putstatic       #38  <Field zzn[] zzqc>
			}
	//   11   25:aload_0         
	//   12   26:monitorexit     
		break MISSING_BLOCK_LABEL_35;
	//   13   27:goto            35
		exception;
	//   14   30:astore_1        
		obj;
	//   15   31:aload_0         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		throw exception;
	//   17   33:aload_1         
	//   18   34:athrow          
		return zzqc;
	//   19   35:getstatic       #38  <Field zzn[] zzqc>
	//   20   38:areturn         
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
		if(!(obj instanceof zzn))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzn>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzn)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzn>
	//   12   20:astore_1        
		if(name == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #21  <Field String name>
	//*  15   25:ifnonnull       37
		{
			if(((zzn) (obj)).name != null)
	//*  16   28:aload_1         
	//*  17   29:getfield        #21  <Field String name>
	//*  18   32:ifnull          53
				return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
		} else
		if(!name.equals(((Object) (((zzn) (obj)).name))))
	//*  21   37:aload_0         
	//*  22   38:getfield        #21  <Field String name>
	//*  23   41:aload_1         
	//*  24   42:getfield        #21  <Field String name>
	//*  25   45:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  26   48:ifne            53
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		if(zzqd == null)
	//*  29   53:aload_0         
	//*  30   54:getfield        #23  <Field zzp zzqd>
	//*  31   57:ifnonnull       69
		{
			if(((zzn) (obj)).zzqd != null)
	//*  32   60:aload_1         
	//*  33   61:getfield        #23  <Field zzp zzqd>
	//*  34   64:ifnull          85
				return false;
	//   35   67:iconst_0        
	//   36   68:ireturn         
		} else
		if(!zzqd.equals(((Object) (((zzn) (obj)).zzqd))))
	//*  37   69:aload_0         
	//*  38   70:getfield        #23  <Field zzp zzqd>
	//*  39   73:aload_1         
	//*  40   74:getfield        #23  <Field zzp zzqd>
	//*  41   77:invokevirtual   #53  <Method boolean zzp.equals(Object)>
	//*  42   80:ifne            85
			return false;
	//   43   83:iconst_0        
	//   44   84:ireturn         
		if(zzqe == null)
	//*  45   85:aload_0         
	//*  46   86:getfield        #25  <Field zzj zzqe>
	//*  47   89:ifnonnull       101
		{
			if(((zzn) (obj)).zzqe != null)
	//*  48   92:aload_1         
	//*  49   93:getfield        #25  <Field zzj zzqe>
	//*  50   96:ifnull          117
				return false;
	//   51   99:iconst_0        
	//   52  100:ireturn         
		} else
		if(!zzqe.equals(((Object) (((zzn) (obj)).zzqe))))
	//*  53  101:aload_0         
	//*  54  102:getfield        #25  <Field zzj zzqe>
	//*  55  105:aload_1         
	//*  56  106:getfield        #25  <Field zzj zzqe>
	//*  57  109:invokevirtual   #56  <Method boolean zzj.equals(Object)>
	//*  58  112:ifne            117
			return false;
	//   59  115:iconst_0        
	//   60  116:ireturn         
		if(zzcev != null && !zzcev.isEmpty())
	//*  61  117:aload_0         
	//*  62  118:getfield        #29  <Field zzye zzcev>
	//*  63  121:ifnull          149
	//*  64  124:aload_0         
	//*  65  125:getfield        #29  <Field zzye zzcev>
	//*  66  128:invokevirtual   #62  <Method boolean zzye.isEmpty()>
	//*  67  131:ifeq            137
	//*  68  134:goto            149
			return zzcev.equals(((Object) (((zzn) (obj)).zzcev)));
	//   69  137:aload_0         
	//   70  138:getfield        #29  <Field zzye zzcev>
	//   71  141:aload_1         
	//   72  142:getfield        #29  <Field zzye zzcev>
	//   73  145:invokevirtual   #63  <Method boolean zzye.equals(Object)>
	//   74  148:ireturn         
		if(((zzn) (obj)).zzcev != null)
	//*  75  149:aload_1         
	//*  76  150:getfield        #29  <Field zzye zzcev>
	//*  77  153:ifnull          170
			return ((zzn) (obj)).zzcev.isEmpty();
	//   78  156:aload_1         
	//   79  157:getfield        #29  <Field zzye zzcev>
	//   80  160:invokevirtual   #62  <Method boolean zzye.isEmpty()>
	//   81  163:ifeq            168
	//   82  166:iconst_1        
	//   83  167:ireturn         
	//   84  168:iconst_0        
	//   85  169:ireturn         
		else
			return true;
	//   86  170:iconst_1        
	//   87  171:ireturn         
	}

	public final int hashCode()
	{
		int i1 = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #77  <Method String Class.getName()>
	//    3    7:invokevirtual   #79  <Method int String.hashCode()>
	//    4   10:istore          6
		Object obj = ((Object) (name));
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field String name>
	//    7   16:astore          7
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          5
		int i;
		if(obj == null)
	//*  10   21:aload           7
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            39
			i = name.hashCode();
	//   15   31:aload_0         
	//   16   32:getfield        #21  <Field String name>
	//   17   35:invokevirtual   #79  <Method int String.hashCode()>
	//   18   38:istore_1        
		obj = ((Object) (zzqd));
	//   19   39:aload_0         
	//   20   40:getfield        #23  <Field zzp zzqd>
	//   21   43:astore          7
		int j;
		if(obj == null)
	//*  22   45:aload           7
	//*  23   47:ifnonnull       55
			j = 0;
	//   24   50:iconst_0        
	//   25   51:istore_2        
		else
	//*  26   52:goto            61
			j = ((zzp) (obj)).hashCode();
	//   27   55:aload           7
	//   28   57:invokevirtual   #80  <Method int zzp.hashCode()>
	//   29   60:istore_2        
		obj = ((Object) (zzqe));
	//   30   61:aload_0         
	//   31   62:getfield        #25  <Field zzj zzqe>
	//   32   65:astore          7
		int k;
		if(obj == null)
	//*  33   67:aload           7
	//*  34   69:ifnonnull       77
			k = 0;
	//   35   72:iconst_0        
	//   36   73:istore_3        
		else
	//*  37   74:goto            83
			k = ((zzj) (obj)).hashCode();
	//   38   77:aload           7
	//   39   79:invokevirtual   #81  <Method int zzj.hashCode()>
	//   40   82:istore_3        
		int l = ((int) (flag));
	//   41   83:iload           5
	//   42   85:istore          4
		if(zzcev != null)
	//*  43   87:aload_0         
	//*  44   88:getfield        #29  <Field zzye zzcev>
	//*  45   91:ifnull          120
			if(zzcev.isEmpty())
	//*  46   94:aload_0         
	//*  47   95:getfield        #29  <Field zzye zzcev>
	//*  48   98:invokevirtual   #62  <Method boolean zzye.isEmpty()>
	//*  49  101:ifeq            111
				l = ((int) (flag));
	//   50  104:iload           5
	//   51  106:istore          4
			else
	//*  52  108:goto            120
				l = zzcev.hashCode();
	//   53  111:aload_0         
	//   54  112:getfield        #29  <Field zzye zzcev>
	//   55  115:invokevirtual   #82  <Method int zzye.hashCode()>
	//   56  118:istore          4
		return ((((i1 + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + l;
	//   57  120:iload           6
	//   58  122:sipush          527
	//   59  125:iadd            
	//   60  126:bipush          31
	//   61  128:imul            
	//   62  129:iload_1         
	//   63  130:iadd            
	//   64  131:bipush          31
	//   65  133:imul            
	//   66  134:iload_2         
	//   67  135:iadd            
	//   68  136:bipush          31
	//   69  138:imul            
	//   70  139:iload_3         
	//   71  140:iadd            
	//   72  141:bipush          31
	//   73  143:imul            
	//   74  144:iload           4
	//   75  146:iadd            
	//   76  147:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #89  <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            106
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
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
	//*  17   30:invokespecial   #92  <Method boolean zzyc.zza(zzxz, int)>
	//*  18   33:ifne            0
							return ((zzyi) (this));
	//   19   36:aload_0         
	//   20   37:areturn         
						continue;
					}
					if(zzqe == null)
	//*  21   38:aload_0         
	//*  22   39:getfield        #25  <Field zzj zzqe>
	//*  23   42:ifnonnull       56
						zzqe = new zzj();
	//   24   45:aload_0         
	//   25   46:new             #55  <Class zzj>
	//   26   49:dup             
	//   27   50:invokespecial   #93  <Method void zzj()>
	//   28   53:putfield        #25  <Field zzj zzqe>
					obj = ((Object) (zzqe));
	//   29   56:aload_0         
	//   30   57:getfield        #25  <Field zzj zzqe>
	//   31   60:astore_3        
				} else
	//*  32   61:goto            87
				{
					if(zzqd == null)
	//*  33   64:aload_0         
	//*  34   65:getfield        #23  <Field zzp zzqd>
	//*  35   68:ifnonnull       82
						zzqd = new zzp();
	//   36   71:aload_0         
	//   37   72:new             #52  <Class zzp>
	//   38   75:dup             
	//   39   76:invokespecial   #94  <Method void zzp()>
	//   40   79:putfield        #23  <Field zzp zzqd>
					obj = ((Object) (zzqd));
	//   41   82:aload_0         
	//   42   83:getfield        #23  <Field zzp zzqd>
	//   43   86:astore_3        
				}
				zzxz1.zza(((zzyi) (obj)));
	//   44   87:aload_1         
	//   45   88:aload_3         
	//   46   89:invokevirtual   #97  <Method void zzxz.zza(zzyi)>
			} else
	//*  47   92:goto            0
			{
				name = zzxz1.readString();
	//   48   95:aload_0         
	//   49   96:aload_1         
	//   50   97:invokevirtual   #100 <Method String zzxz.readString()>
	//   51  100:putfield        #21  <Field String name>
			}
		} while(true);
	//   52  103:goto            0
		return ((zzyi) (this));
	//   53  106:aload_0         
	//   54  107:areturn         
	}

	public final void zza(zzya zzya1)
	{
		if(name != null && !name.equals(""))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field String name>
	//*   2    4:ifnull          28
	//*   3    7:aload_0         
	//*   4    8:getfield        #21  <Field String name>
	//*   5   11:ldc1            #19  <String "">
	//*   6   13:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*   7   16:ifne            28
			zzya1.zzb(1, name);
	//    8   19:aload_1         
	//    9   20:iconst_1        
	//   10   21:aload_0         
	//   11   22:getfield        #21  <Field String name>
	//   12   25:invokevirtual   #107 <Method void zzya.zzb(int, String)>
		if(zzqd != null)
	//*  13   28:aload_0         
	//*  14   29:getfield        #23  <Field zzp zzqd>
	//*  15   32:ifnull          44
			zzya1.zza(2, ((zzyi) (zzqd)));
	//   16   35:aload_1         
	//   17   36:iconst_2        
	//   18   37:aload_0         
	//   19   38:getfield        #23  <Field zzp zzqd>
	//   20   41:invokevirtual   #110 <Method void zzya.zza(int, zzyi)>
		if(zzqe != null)
	//*  21   44:aload_0         
	//*  22   45:getfield        #25  <Field zzj zzqe>
	//*  23   48:ifnull          60
			zzya1.zza(3, ((zzyi) (zzqe)));
	//   24   51:aload_1         
	//   25   52:iconst_3        
	//   26   53:aload_0         
	//   27   54:getfield        #25  <Field zzj zzqe>
	//   28   57:invokevirtual   #110 <Method void zzya.zza(int, zzyi)>
		super.zza(zzya1);
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:invokespecial   #112 <Method void zzyc.zza(zzya)>
	//   32   65:return          
	}

	protected final int zzf()
	{
		int j = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #115 <Method int zzyc.zzf()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(name != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #21  <Field String name>
	//*   7   11:ifnull          39
		{
			i = j;
	//    8   14:iload_2         
	//    9   15:istore_1        
			if(!name.equals(""))
	//*  10   16:aload_0         
	//*  11   17:getfield        #21  <Field String name>
	//*  12   20:ldc1            #19  <String "">
	//*  13   22:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  14   25:ifne            39
				i = j + zzya.zzc(1, name);
	//   15   28:iload_2         
	//   16   29:iconst_1        
	//   17   30:aload_0         
	//   18   31:getfield        #21  <Field String name>
	//   19   34:invokestatic    #119 <Method int zzya.zzc(int, String)>
	//   20   37:iadd            
	//   21   38:istore_1        
		}
		j = i;
	//   22   39:iload_1         
	//   23   40:istore_2        
		if(zzqd != null)
	//*  24   41:aload_0         
	//*  25   42:getfield        #23  <Field zzp zzqd>
	//*  26   45:ifnull          59
			j = i + zzya.zzb(2, ((zzyi) (zzqd)));
	//   27   48:iload_1         
	//   28   49:iconst_2        
	//   29   50:aload_0         
	//   30   51:getfield        #23  <Field zzp zzqd>
	//   31   54:invokestatic    #122 <Method int zzya.zzb(int, zzyi)>
	//   32   57:iadd            
	//   33   58:istore_2        
		i = j;
	//   34   59:iload_2         
	//   35   60:istore_1        
		if(zzqe != null)
	//*  36   61:aload_0         
	//*  37   62:getfield        #25  <Field zzj zzqe>
	//*  38   65:ifnull          79
			i = j + zzya.zzb(3, ((zzyi) (zzqe)));
	//   39   68:iload_2         
	//   40   69:iconst_3        
	//   41   70:aload_0         
	//   42   71:getfield        #25  <Field zzj zzqe>
	//   43   74:invokestatic    #122 <Method int zzya.zzb(int, zzyi)>
	//   44   77:iadd            
	//   45   78:istore_1        
		return i;
	//   46   79:iload_1         
	//   47   80:ireturn         
	}

	private static volatile zzn zzqc[];
	public String name;
	private zzp zzqd;
	public zzj zzqe;
}
