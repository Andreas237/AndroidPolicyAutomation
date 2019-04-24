// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyg, zzye, zzxz, 
//			zzya, zzyi

public final class zzk extends zzyc
{

	public zzk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzyc()>
		key = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #16  <Field int key>
		value = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #18  <Field int value>
		zzcev = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #22  <Field zzye zzcev>
		zzcff = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #25  <Field int zzcff>
	//   14   24:return          
	}

	public static zzk[] zzh()
	{
		if(zzor == null)
	//*   0    0:getstatic       #30  <Field zzk[] zzor>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfe)
	//*   2    6:getstatic       #36  <Field Object zzyg.zzcfe>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzor == null)
	//*   6   12:getstatic       #30  <Field zzk[] zzor>
	//*   7   15:ifnonnull       25
					zzor = new zzk[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzk[]
	//   10   22:putstatic       #30  <Field zzk[] zzor>
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
		return zzor;
	//   19   35:getstatic       #30  <Field zzk[] zzor>
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
		if(!(obj instanceof zzk))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzk>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzk)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzk>
	//   12   20:astore_1        
		if(key != ((zzk) (obj)).key)
	//*  13   21:aload_0         
	//*  14   22:getfield        #16  <Field int key>
	//*  15   25:aload_1         
	//*  16   26:getfield        #16  <Field int key>
	//*  17   29:icmpeq          34
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		if(value != ((zzk) (obj)).value)
	//*  20   34:aload_0         
	//*  21   35:getfield        #18  <Field int value>
	//*  22   38:aload_1         
	//*  23   39:getfield        #18  <Field int value>
	//*  24   42:icmpeq          47
			return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		if(zzcev != null && !zzcev.isEmpty())
	//*  27   47:aload_0         
	//*  28   48:getfield        #22  <Field zzye zzcev>
	//*  29   51:ifnull          79
	//*  30   54:aload_0         
	//*  31   55:getfield        #22  <Field zzye zzcev>
	//*  32   58:invokevirtual   #44  <Method boolean zzye.isEmpty()>
	//*  33   61:ifeq            67
	//*  34   64:goto            79
			return zzcev.equals(((Object) (((zzk) (obj)).zzcev)));
	//   35   67:aload_0         
	//   36   68:getfield        #22  <Field zzye zzcev>
	//   37   71:aload_1         
	//   38   72:getfield        #22  <Field zzye zzcev>
	//   39   75:invokevirtual   #46  <Method boolean zzye.equals(Object)>
	//   40   78:ireturn         
		if(((zzk) (obj)).zzcev != null)
	//*  41   79:aload_1         
	//*  42   80:getfield        #22  <Field zzye zzcev>
	//*  43   83:ifnull          100
			return ((zzk) (obj)).zzcev.isEmpty();
	//   44   86:aload_1         
	//   45   87:getfield        #22  <Field zzye zzcev>
	//   46   90:invokevirtual   #44  <Method boolean zzye.isEmpty()>
	//   47   93:ifeq            98
	//   48   96:iconst_1        
	//   49   97:ireturn         
	//   50   98:iconst_0        
	//   51   99:ireturn         
		else
			return true;
	//   52  100:iconst_1        
	//   53  101:ireturn         
	}

	public final int hashCode()
	{
		int j = ((Object)this).getClass().getName().hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #60  <Method String Class.getName()>
	//    3    7:invokevirtual   #64  <Method int String.hashCode()>
	//    4   10:istore_2        
		int k = key;
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field int key>
	//    7   15:istore_3        
		int l = value;
	//    8   16:aload_0         
	//    9   17:getfield        #18  <Field int value>
	//   10   20:istore          4
		int i;
		if(zzcev != null && !zzcev.isEmpty())
	//*  11   22:aload_0         
	//*  12   23:getfield        #22  <Field zzye zzcev>
	//*  13   26:ifnull          53
	//*  14   29:aload_0         
	//*  15   30:getfield        #22  <Field zzye zzcev>
	//*  16   33:invokevirtual   #44  <Method boolean zzye.isEmpty()>
	//*  17   36:ifeq            42
	//*  18   39:goto            53
			i = zzcev.hashCode();
	//   19   42:aload_0         
	//   20   43:getfield        #22  <Field zzye zzcev>
	//   21   46:invokevirtual   #65  <Method int zzye.hashCode()>
	//   22   49:istore_1        
		else
	//*  23   50:goto            55
			i = 0;
	//   24   53:iconst_0        
	//   25   54:istore_1        
		return (((j + 527) * 31 + k) * 31 + l) * 31 + i;
	//   26   55:iload_2         
	//   27   56:sipush          527
	//   28   59:iadd            
	//   29   60:bipush          31
	//   30   62:imul            
	//   31   63:iload_3         
	//   32   64:iadd            
	//   33   65:bipush          31
	//   34   67:imul            
	//   35   68:iload           4
	//   36   70:iadd            
	//   37   71:bipush          31
	//   38   73:imul            
	//   39   74:iload_1         
	//   40   75:iadd            
	//   41   76:ireturn         
	}

	public final zzyi zza(zzxz zzxz1)
	{
		do
		{
			int i = zzxz1.zzuj();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #72  <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            54
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          43
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
	//*  14   24:invokespecial   #75  <Method boolean zzyc.zza(zzxz, int)>
	//*  15   27:ifne            0
						return ((zzyi) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
				} else
				{
					value = zzxz1.zzvb();
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #78  <Method int zzxz.zzvb()>
	//   21   37:putfield        #18  <Field int value>
				}
			} else
	//*  22   40:goto            0
			{
				key = zzxz1.zzvb();
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #78  <Method int zzxz.zzvb()>
	//   26   48:putfield        #16  <Field int key>
			}
		} while(true);
	//   27   51:goto            0
		return ((zzyi) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
	}

	public final void zza(zzya zzya1)
	{
		zzya1.zzd(1, key);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field int key>
	//    4    6:invokevirtual   #85  <Method void zzya.zzd(int, int)>
		zzya1.zzd(2, value);
	//    5    9:aload_1         
	//    6   10:iconst_2        
	//    7   11:aload_0         
	//    8   12:getfield        #18  <Field int value>
	//    9   15:invokevirtual   #85  <Method void zzya.zzd(int, int)>
		super.zza(zzya1);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #87  <Method void zzyc.zza(zzya)>
	//   13   23:return          
	}

	protected final int zzf()
	{
		return super.zzf() + zzya.zzh(1, key) + zzya.zzh(2, value);
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method int zzyc.zzf()>
	//    2    4:iconst_1        
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field int key>
	//    5    9:invokestatic    #93  <Method int zzya.zzh(int, int)>
	//    6   12:iadd            
	//    7   13:iconst_2        
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field int value>
	//   10   18:invokestatic    #93  <Method int zzya.zzh(int, int)>
	//   11   21:iadd            
	//   12   22:ireturn         
	}

	private static volatile zzk zzor[];
	public int key;
	public int value;
}
