// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaob

final class zzaoa
{

	public zzaoa()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Object()>
	//    6   12:putfield        #18  <Field Object zzcvu>
	//    7   15:aload_0         
	//    8   16:new             #20  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #21  <Method void ArrayList()>
	//   11   23:putfield        #23  <Field List zzcvv>
		zzcvw = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #25  <Field boolean zzcvw>
	//   15   31:return          
	}

	public final void zza(Runnable runnable, Executor executor)
	{
		Object obj = zzcvu;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object zzcvu>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzcvw)
	//*   5    7:aload_0         
	//*   6    8:getfield        #25  <Field boolean zzcvw>
	//*   7   11:ifeq            24
		{
			executor.execute(runnable);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokeinterface #34  <Method void Executor.execute(Runnable)>
			break MISSING_BLOCK_LABEL_43;
	//   11   21:goto            43
		}
		zzcvv.add(((Object) (new zzaob(executor, runnable))));
	//   12   24:aload_0         
	//   13   25:getfield        #23  <Field List zzcvv>
	//   14   28:new             #36  <Class zzaob>
	//   15   31:dup             
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokespecial   #39  <Method void zzaob(Executor, Runnable)>
	//   19   37:invokeinterface #45  <Method boolean List.add(Object)>
	//   20   42:pop             
		obj;
	//   21   43:aload_3         
		JVM INSTR monitorexit ;
	//   22   44:monitorexit     
		return;
	//   23   45:return          
		runnable;
	//   24   46:astore_1        
		obj;
	//   25   47:aload_3         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		throw runnable;
	//   27   49:aload_1         
	//   28   50:athrow          
	}

	public final void zzsm()
	{
		ArrayList arraylist;
label0:
		{
			arraylist = new ArrayList();
	//    0    0:new             #20  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ArrayList()>
	//    3    7:astore          4
			synchronized(zzcvu)
	//*   4    9:aload_0         
	//*   5   10:getfield        #18  <Field Object zzcvu>
	//*   6   13:astore_3        
	//*   7   14:aload_3         
	//*   8   15:monitorenter    
			{
				if(!zzcvw)
					break label0;
	//    9   16:aload_0         
	//   10   17:getfield        #25  <Field boolean zzcvw>
	//   11   20:ifeq            26
			}
	//   12   23:aload_3         
	//   13   24:monitorexit     
			return;
	//   14   25:return          
		}
		arraylist.addAll(((java.util.Collection) (zzcvv)));
	//   15   26:aload           4
	//   16   28:aload_0         
	//   17   29:getfield        #23  <Field List zzcvv>
	//   18   32:invokevirtual   #50  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   19   35:pop             
		zzcvv.clear();
	//   20   36:aload_0         
	//   21   37:getfield        #23  <Field List zzcvv>
	//   22   40:invokeinterface #53  <Method void List.clear()>
		zzcvw = true;
	//   23   45:aload_0         
	//   24   46:iconst_1        
	//   25   47:putfield        #25  <Field boolean zzcvw>
		obj;
	//   26   50:aload_3         
		JVM INSTR monitorexit ;
	//   27   51:monitorexit     
		obj = ((Object) ((ArrayList)arraylist));
	//   28   52:aload           4
	//   29   54:checkcast       #20  <Class ArrayList>
	//   30   57:astore_3        
		int j = ((ArrayList) (obj)).size();
	//   31   58:aload_3         
	//   32   59:invokevirtual   #57  <Method int ArrayList.size()>
	//   33   62:istore_2        
		for(int i = 0; i < j;)
	//*  34   63:iconst_0        
	//*  35   64:istore_1        
	//*  36   65:iload_1         
	//*  37   66:iload_2         
	//*  38   67:icmpge          94
		{
			Object obj1 = ((ArrayList) (obj)).get(i);
	//   39   70:aload_3         
	//   40   71:iload_1         
	//   41   72:invokevirtual   #61  <Method Object ArrayList.get(int)>
	//   42   75:astore          4
			i++;
	//   43   77:iload_1         
	//   44   78:iconst_1        
	//   45   79:iadd            
	//   46   80:istore_1        
			((Runnable)obj1).run();
	//   47   81:aload           4
	//   48   83:checkcast       #63  <Class Runnable>
	//   49   86:invokeinterface #66  <Method void Runnable.run()>
		}

	//*  50   91:goto            65
		return;
	//   51   94:return          
		exception;
	//   52   95:astore          4
		obj;
	//   53   97:aload_3         
		JVM INSTR monitorexit ;
	//   54   98:monitorexit     
		throw exception;
	//   55   99:aload           4
	//   56  101:athrow          
	}

	private final Object zzcvu = new Object();
	private final List zzcvv = new ArrayList();
	private boolean zzcvw;
}
