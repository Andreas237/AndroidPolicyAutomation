// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.*;

public class zzu
{

	public zzu(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zzaq = ((List) (new LinkedList()));
	//    2    4:aload_0         
	//    3    5:new             #28  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void LinkedList()>
	//    6   12:putfield        #31  <Field List zzaq>
		zzar = ((List) (new ArrayList(64)));
	//    7   15:aload_0         
	//    8   16:new             #33  <Class ArrayList>
	//    9   19:dup             
	//   10   20:bipush          64
	//   11   22:invokespecial   #35  <Method void ArrayList(int)>
	//   12   25:putfield        #37  <Field List zzar>
		zzas = 0;
	//   13   28:aload_0         
	//   14   29:iconst_0        
	//   15   30:putfield        #39  <Field int zzas>
		zzat = i;
	//   16   33:aload_0         
	//   17   34:iload_1         
	//   18   35:putfield        #41  <Field int zzat>
	//   19   38:return          
	}

	private void zzt()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		byte abyte0[];
		for(; zzas > zzat; zzas = zzas - abyte0.length)
	//*   2    2:aload_0         
	//*   3    3:getfield        #39  <Field int zzas>
	//*   4    6:aload_0         
	//*   5    7:getfield        #41  <Field int zzat>
	//*   6   10:icmple          57
		{
			abyte0 = (byte[])zzaq.remove(0);
	//    7   13:aload_0         
	//    8   14:getfield        #31  <Field List zzaq>
	//    9   17:iconst_0        
	//   10   18:invokeinterface #48  <Method Object List.remove(int)>
	//   11   23:checkcast       #50  <Class byte[]>
	//   12   26:astore_1        
			zzar.remove(((Object) (abyte0)));
	//   13   27:aload_0         
	//   14   28:getfield        #37  <Field List zzar>
	//   15   31:aload_1         
	//   16   32:invokeinterface #53  <Method boolean List.remove(Object)>
	//   17   37:pop             
		}

	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #39  <Field int zzas>
	//   21   43:aload_1         
	//   22   44:arraylength     
	//   23   45:isub            
	//   24   46:putfield        #39  <Field int zzas>
		break MISSING_BLOCK_LABEL_57;
	//   25   49:goto            2
		Exception exception;
		exception;
	//   26   52:astore_1        
	//*  27   53:aload_0         
		throw exception;
	//   28   54:monitorexit     
	//   29   55:aload_1         
	//   30   56:athrow          
		this;
	//   31   57:aload_0         
		JVM INSTR monitorexit ;
	//   32   58:monitorexit     
	//   33   59:return          
	}

	public void zza(byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(abyte0 == null) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:ifnull          19
_L1:
		int i;
		int j;
		i = abyte0.length;
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:istore_2        
		j = zzat;
	//    7    9:aload_0         
	//    8   10:getfield        #41  <Field int zzat>
	//    9   13:istore_3        
		if(i <= j) goto _L3; else goto _L2
	//   10   14:iload_2         
	//   11   15:iload_3         
	//   12   16:icmple          22
_L2:
		this;
	//   13   19:aload_0         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		return;
	//   15   21:return          
_L3:
		zzaq.add(((Object) (abyte0)));
	//   16   22:aload_0         
	//   17   23:getfield        #31  <Field List zzaq>
	//   18   26:aload_1         
	//   19   27:invokeinterface #58  <Method boolean List.add(Object)>
	//   20   32:pop             
		j = Collections.binarySearch(zzar, ((Object) (abyte0)), zzau);
	//   21   33:aload_0         
	//   22   34:getfield        #37  <Field List zzar>
	//   23   37:aload_1         
	//   24   38:getstatic       #23  <Field Comparator zzau>
	//   25   41:invokestatic    #64  <Method int Collections.binarySearch(List, Object, Comparator)>
	//   26   44:istore_3        
		i = j;
	//   27   45:iload_3         
	//   28   46:istore_2        
		if(j < 0)
	//*  29   47:iload_3         
	//*  30   48:ifge            56
			i = -j - 1;
	//   31   51:iload_3         
	//   32   52:ineg            
	//   33   53:iconst_1        
	//   34   54:isub            
	//   35   55:istore_2        
		zzar.add(i, ((Object) (abyte0)));
	//   36   56:aload_0         
	//   37   57:getfield        #37  <Field List zzar>
	//   38   60:iload_2         
	//   39   61:aload_1         
	//   40   62:invokeinterface #67  <Method void List.add(int, Object)>
		zzas = zzas + abyte0.length;
	//   41   67:aload_0         
	//   42   68:aload_0         
	//   43   69:getfield        #39  <Field int zzas>
	//   44   72:aload_1         
	//   45   73:arraylength     
	//   46   74:iadd            
	//   47   75:putfield        #39  <Field int zzas>
		zzt();
	//   48   78:aload_0         
	//   49   79:invokespecial   #69  <Method void zzt()>
		if(true) goto _L2; else goto _L4
	//   50   82:goto            19
_L4:
		abyte0;
	//   51   85:astore_1        
	//*  52   86:aload_0         
		throw abyte0;
	//   53   87:monitorexit     
	//   54   88:aload_1         
	//   55   89:athrow          
	}

	public byte[] zzb(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
_L5:
		byte abyte0[];
		if(j >= zzar.size())
			break MISSING_BLOCK_LABEL_81;
	//    4    4:iload_2         
	//    5    5:aload_0         
	//    6    6:getfield        #37  <Field List zzar>
	//    7    9:invokeinterface #75  <Method int List.size()>
	//    8   14:icmpge          81
		abyte0 = (byte[])zzar.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #37  <Field List zzar>
	//   11   21:iload_2         
	//   12   22:invokeinterface #78  <Method Object List.get(int)>
	//   13   27:checkcast       #50  <Class byte[]>
	//   14   30:astore_3        
		if(abyte0.length < i) goto _L2; else goto _L1
	//   15   31:aload_3         
	//   16   32:arraylength     
	//   17   33:iload_1         
	//   18   34:icmplt          74
_L1:
		zzas = zzas - abyte0.length;
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #39  <Field int zzas>
	//   22   42:aload_3         
	//   23   43:arraylength     
	//   24   44:isub            
	//   25   45:putfield        #39  <Field int zzas>
		zzar.remove(j);
	//   26   48:aload_0         
	//   27   49:getfield        #37  <Field List zzar>
	//   28   52:iload_2         
	//   29   53:invokeinterface #48  <Method Object List.remove(int)>
	//   30   58:pop             
		zzaq.remove(((Object) (abyte0)));
	//   31   59:aload_0         
	//   32   60:getfield        #31  <Field List zzaq>
	//   33   63:aload_3         
	//   34   64:invokeinterface #53  <Method boolean List.remove(Object)>
	//   35   69:pop             
_L3:
		this;
	//   36   70:aload_0         
		JVM INSTR monitorexit ;
	//   37   71:monitorexit     
		return abyte0;
	//   38   72:aload_3         
	//   39   73:areturn         
_L2:
		j++;
	//   40   74:iload_2         
	//   41   75:iconst_1        
	//   42   76:iadd            
	//   43   77:istore_2        
		continue; /* Loop/switch isn't completed */
	//   44   78:goto            4
		abyte0 = new byte[i];
	//   45   81:iload_1         
	//   46   82:newarray        byte[]
	//   47   84:astore_3        
		  goto _L3
	//*  48   85:goto            70
		Exception exception;
		exception;
	//   49   88:astore_3        
	//*  50   89:aload_0         
		throw exception;
	//   51   90:monitorexit     
	//   52   91:aload_3         
	//   53   92:athrow          
		if(true) goto _L5; else goto _L4
_L4:
	}

	protected static final Comparator zzau = new Comparator() {

		public int compare(Object obj, Object obj1)
		{
			return zza((byte[])obj, (byte[])obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class byte[]>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class byte[]>
		//    5    9:invokevirtual   #22  <Method int zza(byte[], byte[])>
		//    6   12:ireturn         
		}

		public int zza(byte abyte0[], byte abyte1[])
		{
			return abyte0.length - abyte1.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:aload_2         
		//    3    3:arraylength     
		//    4    4:isub            
		//    5    5:ireturn         
		}

	}
;
	private List zzaq;
	private List zzar;
	private int zzas;
	private final int zzat;

	static 
	{
	//    0    0:new             #6   <Class zzu$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzu$1()>
	//    3    7:putstatic       #23  <Field Comparator zzau>
	//*   4   10:return          
	}
}
