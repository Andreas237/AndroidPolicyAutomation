// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyg, zzye, zzxz, 
//			zzya, zzyi

public final class zzfs extends zzyc
{

	public zzfs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzyc()>
		zzawx = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field Integer zzawx>
		zzawy = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #19  <Field Long zzawy>
		zzcet = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field zzye zzcet>
		zzcfd = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #27  <Field int zzcfd>
	//   14   24:return          
	}

	public static zzfs[] zzmy()
	{
		if(zzaww == null)
	//*   0    0:getstatic       #32  <Field zzfs[] zzaww>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfc)
	//*   2    6:getstatic       #38  <Field Object zzyg.zzcfc>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzaww == null)
	//*   6   12:getstatic       #32  <Field zzfs[] zzaww>
	//*   7   15:ifnonnull       25
					zzaww = new zzfs[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzfs[]
	//   10   22:putstatic       #32  <Field zzfs[] zzaww>
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
		return zzaww;
	//   19   35:getstatic       #32  <Field zzfs[] zzaww>
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
		if(!(obj instanceof zzfs))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfs>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfs)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfs>
	//   12   20:astore_1        
		Object obj1 = ((Object) (zzawx));
	//   13   21:aload_0         
	//   14   22:getfield        #17  <Field Integer zzawx>
	//   15   25:astore_2        
		if(obj1 == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzfs) (obj)).zzawx != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #17  <Field Integer zzawx>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!((Integer) (obj1)).equals(((Object) (((zzfs) (obj)).zzawx))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #17  <Field Integer zzawx>
	//*  26   44:invokevirtual   #44  <Method boolean Integer.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		obj1 = ((Object) (zzawy));
	//   30   52:aload_0         
	//   31   53:getfield        #19  <Field Long zzawy>
	//   32   56:astore_2        
		if(obj1 == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((zzfs) (obj)).zzawy != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #19  <Field Long zzawy>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!((Long) (obj1)).equals(((Object) (((zzfs) (obj)).zzawy))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #19  <Field Long zzawy>
	//*  43   75:invokevirtual   #47  <Method boolean Long.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		if(zzcet != null && !zzcet.isEmpty())
	//*  47   83:aload_0         
	//*  48   84:getfield        #23  <Field zzye zzcet>
	//*  49   87:ifnull          115
	//*  50   90:aload_0         
	//*  51   91:getfield        #23  <Field zzye zzcet>
	//*  52   94:invokevirtual   #53  <Method boolean zzye.isEmpty()>
	//*  53   97:ifeq            103
	//*  54  100:goto            115
			return zzcet.equals(((Object) (((zzfs) (obj)).zzcet)));
	//   55  103:aload_0         
	//   56  104:getfield        #23  <Field zzye zzcet>
	//   57  107:aload_1         
	//   58  108:getfield        #23  <Field zzye zzcet>
	//   59  111:invokevirtual   #54  <Method boolean zzye.equals(Object)>
	//   60  114:ireturn         
		if(((zzfs) (obj)).zzcet != null)
	//*  61  115:aload_1         
	//*  62  116:getfield        #23  <Field zzye zzcet>
	//*  63  119:ifnull          136
			return ((zzfs) (obj)).zzcet.isEmpty();
	//   64  122:aload_1         
	//   65  123:getfield        #23  <Field zzye zzcet>
	//   66  126:invokevirtual   #53  <Method boolean zzye.isEmpty()>
	//   67  129:ifeq            134
	//   68  132:iconst_1        
	//   69  133:ireturn         
	//   70  134:iconst_0        
	//   71  135:ireturn         
		else
			return true;
	//   72  136:iconst_1        
	//   73  137:ireturn         
	}

	public final int hashCode()
	{
		int l = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #68  <Method String Class.getName()>
	//    3    7:invokevirtual   #72  <Method int String.hashCode()>
	//    4   10:istore          5
		Object obj = ((Object) (zzawx));
	//    5   12:aload_0         
	//    6   13:getfield        #17  <Field Integer zzawx>
	//    7   16:astore          6
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          4
		int i;
		if(obj == null)
	//*  10   21:aload           6
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            37
			i = ((Integer) (obj)).hashCode();
	//   15   31:aload           6
	//   16   33:invokevirtual   #73  <Method int Integer.hashCode()>
	//   17   36:istore_1        
		obj = ((Object) (zzawy));
	//   18   37:aload_0         
	//   19   38:getfield        #19  <Field Long zzawy>
	//   20   41:astore          6
		int j;
		if(obj == null)
	//*  21   43:aload           6
	//*  22   45:ifnonnull       53
			j = 0;
	//   23   48:iconst_0        
	//   24   49:istore_2        
		else
	//*  25   50:goto            59
			j = ((Long) (obj)).hashCode();
	//   26   53:aload           6
	//   27   55:invokevirtual   #74  <Method int Long.hashCode()>
	//   28   58:istore_2        
		int k = ((int) (flag));
	//   29   59:iload           4
	//   30   61:istore_3        
		if(zzcet != null)
	//*  31   62:aload_0         
	//*  32   63:getfield        #23  <Field zzye zzcet>
	//*  33   66:ifnull          93
			if(zzcet.isEmpty())
	//*  34   69:aload_0         
	//*  35   70:getfield        #23  <Field zzye zzcet>
	//*  36   73:invokevirtual   #53  <Method boolean zzye.isEmpty()>
	//*  37   76:ifeq            85
				k = ((int) (flag));
	//   38   79:iload           4
	//   39   81:istore_3        
			else
	//*  40   82:goto            93
				k = zzcet.hashCode();
	//   41   85:aload_0         
	//   42   86:getfield        #23  <Field zzye zzcet>
	//   43   89:invokevirtual   #75  <Method int zzye.hashCode()>
	//   44   92:istore_3        
		return (((l + 527) * 31 + i) * 31 + j) * 31 + k;
	//   45   93:iload           5
	//   46   95:sipush          527
	//   47   98:iadd            
	//   48   99:bipush          31
	//   49  101:imul            
	//   50  102:iload_1         
	//   51  103:iadd            
	//   52  104:bipush          31
	//   53  106:imul            
	//   54  107:iload_2         
	//   55  108:iadd            
	//   56  109:bipush          31
	//   57  111:imul            
	//   58  112:iload_3         
	//   59  113:iadd            
	//   60  114:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
		throws IOException
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #84  <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            60
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          46
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          32
				{
					if(!super.zza(zzxz1, i))
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:invokespecial   #87  <Method boolean zzyc.zza(zzxz, int)>
	//*  15   27:ifne            0
						return ((zzyi) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
				} else
				{
					zzawy = Long.valueOf(zzxz1.zzvc());
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #91  <Method long zzxz.zzvc()>
	//   21   37:invokestatic    #95  <Method Long Long.valueOf(long)>
	//   22   40:putfield        #19  <Field Long zzawy>
				}
			} else
	//*  23   43:goto            0
			{
				zzawx = Integer.valueOf(zzxz1.zzvb());
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #98  <Method int zzxz.zzvb()>
	//   27   51:invokestatic    #101 <Method Integer Integer.valueOf(int)>
	//   28   54:putfield        #17  <Field Integer zzawx>
			}
		} while(true);
	//   29   57:goto            0
		return ((zzyi) (this));
	//   30   60:aload_0         
	//   31   61:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		Object obj = ((Object) (zzawx));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Integer zzawx>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			zzya1.zzd(1, ((Integer) (obj)).intValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #106 <Method int Integer.intValue()>
	//    9   15:invokevirtual   #112 <Method void zzya.zzd(int, int)>
		obj = ((Object) (zzawy));
	//   10   18:aload_0         
	//   11   19:getfield        #19  <Field Long zzawy>
	//   12   22:astore_2        
		if(obj != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          36
			zzya1.zzi(2, ((Long) (obj)).longValue());
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #115 <Method long Long.longValue()>
	//   19   33:invokevirtual   #119 <Method void zzya.zzi(int, long)>
		super.zza(zzya1);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokespecial   #121 <Method void zzyc.zza(zzya)>
	//   23   41:return          
	}

	protected final int zzf()
	{
		int j = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method int zzyc.zzf()>
	//    2    4:istore_2        
		Object obj = ((Object) (zzawx));
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field Integer zzawx>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          27
			i = j + zzya.zzh(1, ((Integer) (obj)).intValue());
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokevirtual   #106 <Method int Integer.intValue()>
	//   14   22:invokestatic    #128 <Method int zzya.zzh(int, int)>
	//   15   25:iadd            
	//   16   26:istore_1        
		obj = ((Object) (zzawy));
	//   17   27:aload_0         
	//   18   28:getfield        #19  <Field Long zzawy>
	//   19   31:astore_3        
		j = i;
	//   20   32:iload_1         
	//   21   33:istore_2        
		if(obj != null)
	//*  22   34:aload_3         
	//*  23   35:ifnull          49
			j = i + zzya.zzd(2, ((Long) (obj)).longValue());
	//   24   38:iload_1         
	//   25   39:iconst_2        
	//   26   40:aload_3         
	//   27   41:invokevirtual   #115 <Method long Long.longValue()>
	//   28   44:invokestatic    #131 <Method int zzya.zzd(int, long)>
	//   29   47:iadd            
	//   30   48:istore_2        
		return j;
	//   31   49:iload_2         
	//   32   50:ireturn         
	}

	private static volatile zzfs zzaww[];
	public Integer zzawx;
	public Long zzawy;
}
