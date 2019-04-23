// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyc, zzyg, zzye, zzxz, 
//			zzya, zzyi

public final class zzfq extends zzyc
{

	public zzfq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzyc()>
		zzoj = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field String zzoj>
		value = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field String value>
		zzcet = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #22  <Field zzye zzcet>
		zzcfd = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #26  <Field int zzcfd>
	//   14   24:return          
	}

	public static zzfq[] zzmw()
	{
		if(zzawr == null)
	//*   0    0:getstatic       #31  <Field zzfq[] zzawr>
	//*   1    3:ifnonnull       35
			synchronized(zzyg.zzcfc)
	//*   2    6:getstatic       #37  <Field Object zzyg.zzcfc>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(zzawr == null)
	//*   6   12:getstatic       #31  <Field zzfq[] zzawr>
	//*   7   15:ifnonnull       25
					zzawr = new zzfq[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       zzfq[]
	//   10   22:putstatic       #31  <Field zzfq[] zzawr>
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
		return zzawr;
	//   19   35:getstatic       #31  <Field zzfq[] zzawr>
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
		if(!(obj instanceof zzfq))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzfq>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzfq)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzfq>
	//   12   20:astore_1        
		String s = zzoj;
	//   13   21:aload_0         
	//   14   22:getfield        #16  <Field String zzoj>
	//   15   25:astore_2        
		if(s == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       39
		{
			if(((zzfq) (obj)).zzoj != null)
	//*  18   30:aload_1         
	//*  19   31:getfield        #16  <Field String zzoj>
	//*  20   34:ifnull          52
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		} else
		if(!s.equals(((Object) (((zzfq) (obj)).zzoj))))
	//*  23   39:aload_2         
	//*  24   40:aload_1         
	//*  25   41:getfield        #16  <Field String zzoj>
	//*  26   44:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  27   47:ifne            52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
		s = value;
	//   30   52:aload_0         
	//   31   53:getfield        #18  <Field String value>
	//   32   56:astore_2        
		if(s == null)
	//*  33   57:aload_2         
	//*  34   58:ifnonnull       70
		{
			if(((zzfq) (obj)).value != null)
	//*  35   61:aload_1         
	//*  36   62:getfield        #18  <Field String value>
	//*  37   65:ifnull          83
				return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		} else
		if(!s.equals(((Object) (((zzfq) (obj)).value))))
	//*  40   70:aload_2         
	//*  41   71:aload_1         
	//*  42   72:getfield        #18  <Field String value>
	//*  43   75:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  44   78:ifne            83
			return false;
	//   45   81:iconst_0        
	//   46   82:ireturn         
		if(zzcet != null && !zzcet.isEmpty())
	//*  47   83:aload_0         
	//*  48   84:getfield        #22  <Field zzye zzcet>
	//*  49   87:ifnull          115
	//*  50   90:aload_0         
	//*  51   91:getfield        #22  <Field zzye zzcet>
	//*  52   94:invokevirtual   #49  <Method boolean zzye.isEmpty()>
	//*  53   97:ifeq            103
	//*  54  100:goto            115
			return zzcet.equals(((Object) (((zzfq) (obj)).zzcet)));
	//   55  103:aload_0         
	//   56  104:getfield        #22  <Field zzye zzcet>
	//   57  107:aload_1         
	//   58  108:getfield        #22  <Field zzye zzcet>
	//   59  111:invokevirtual   #50  <Method boolean zzye.equals(Object)>
	//   60  114:ireturn         
		if(((zzfq) (obj)).zzcet != null)
	//*  61  115:aload_1         
	//*  62  116:getfield        #22  <Field zzye zzcet>
	//*  63  119:ifnull          136
			return ((zzfq) (obj)).zzcet.isEmpty();
	//   64  122:aload_1         
	//   65  123:getfield        #22  <Field zzye zzcet>
	//   66  126:invokevirtual   #49  <Method boolean zzye.isEmpty()>
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
	//    1    1:invokevirtual   #58  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #64  <Method String Class.getName()>
	//    3    7:invokevirtual   #66  <Method int String.hashCode()>
	//    4   10:istore          5
		String s = zzoj;
	//    5   12:aload_0         
	//    6   13:getfield        #16  <Field String zzoj>
	//    7   16:astore          6
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          4
		int i;
		if(s == null)
	//*  10   21:aload           6
	//*  11   23:ifnonnull       31
			i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		else
	//*  14   28:goto            37
			i = s.hashCode();
	//   15   31:aload           6
	//   16   33:invokevirtual   #66  <Method int String.hashCode()>
	//   17   36:istore_1        
		s = value;
	//   18   37:aload_0         
	//   19   38:getfield        #18  <Field String value>
	//   20   41:astore          6
		int j;
		if(s == null)
	//*  21   43:aload           6
	//*  22   45:ifnonnull       53
			j = 0;
	//   23   48:iconst_0        
	//   24   49:istore_2        
		else
	//*  25   50:goto            59
			j = s.hashCode();
	//   26   53:aload           6
	//   27   55:invokevirtual   #66  <Method int String.hashCode()>
	//   28   58:istore_2        
		int k = ((int) (flag));
	//   29   59:iload           4
	//   30   61:istore_3        
		if(zzcet != null)
	//*  31   62:aload_0         
	//*  32   63:getfield        #22  <Field zzye zzcet>
	//*  33   66:ifnull          93
			if(zzcet.isEmpty())
	//*  34   69:aload_0         
	//*  35   70:getfield        #22  <Field zzye zzcet>
	//*  36   73:invokevirtual   #49  <Method boolean zzye.isEmpty()>
	//*  37   76:ifeq            85
				k = ((int) (flag));
	//   38   79:iload           4
	//   39   81:istore_3        
			else
	//*  40   82:goto            93
				k = zzcet.hashCode();
	//   41   85:aload_0         
	//   42   86:getfield        #22  <Field zzye zzcet>
	//   43   89:invokevirtual   #67  <Method int zzye.hashCode()>
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
	//    1    1:invokevirtual   #76  <Method int zzxz.zzuj()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            54
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          43
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          32
				{
					if(!super.zza(zzxz1, i))
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:invokespecial   #79  <Method boolean zzyc.zza(zzxz, int)>
	//*  15   27:ifne            0
						return ((zzyi) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
				} else
				{
					value = zzxz1.readString();
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #82  <Method String zzxz.readString()>
	//   21   37:putfield        #18  <Field String value>
				}
			} else
	//*  22   40:goto            0
			{
				zzoj = zzxz1.readString();
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #82  <Method String zzxz.readString()>
	//   26   48:putfield        #16  <Field String zzoj>
			}
		} while(true);
	//   27   51:goto            0
		return ((zzyi) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
	}

	public final void zza(zzya zzya1)
		throws IOException
	{
		String s = zzoj;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String zzoj>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			zzya1.zzb(1, s);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #90  <Method void zzya.zzb(int, String)>
		s = value;
	//    9   15:aload_0         
	//   10   16:getfield        #18  <Field String value>
	//   11   19:astore_2        
		if(s != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          30
			zzya1.zzb(2, s);
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #90  <Method void zzya.zzb(int, String)>
		super.zza(zzya1);
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:invokespecial   #92  <Method void zzyc.zza(zzya)>
	//   21   35:return          
	}

	protected final int zzf()
	{
		int j = super.zzf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method int zzyc.zzf()>
	//    2    4:istore_2        
		String s = zzoj;
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field String zzoj>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(s != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + zzya.zzc(1, s);
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #99  <Method int zzya.zzc(int, String)>
	//   14   22:iadd            
	//   15   23:istore_1        
		s = value;
	//   16   24:aload_0         
	//   17   25:getfield        #18  <Field String value>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(s != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          43
			j = i + zzya.zzc(2, s);
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokestatic    #99  <Method int zzya.zzc(int, String)>
	//   27   41:iadd            
	//   28   42:istore_2        
		return j;
	//   29   43:iload_2         
	//   30   44:ireturn         
	}

	private static volatile zzfq zzawr[];
	public String value;
	public String zzoj;
}
