// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.Locale;
import java.util.concurrent.CancellationException;

public class CancellationToken
{

	CancellationToken()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #12  <Method void Object()>
	//    6   12:putfield        #14  <Field Object lock>
	//    7   15:return          
	}

	public boolean isCancellationRequested()
	{
		boolean flag;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = cancellationRequested;
	//    5    7:aload_0         
	//    6    8:getfield        #19  <Field boolean cancellationRequested>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public void throwIfCancellationRequested()
		throws CancellationException
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(cancellationRequested)
	//*   5    7:aload_0         
	//*   6    8:getfield        #19  <Field boolean cancellationRequested>
	//*   7   11:ifeq            22
				throw new CancellationException();
	//    8   14:new             #22  <Class CancellationException>
	//    9   17:dup             
	//   10   18:invokespecial   #23  <Method void CancellationException()>
	//   11   21:athrow          
		}
	//   12   22:aload_1         
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		exception;
	//   15   25:astore_2        
		obj;
	//   16   26:aload_1         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw exception;
	//   18   28:aload_2         
	//   19   29:athrow          
	}

	public String toString()
	{
		return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[] {
			((Object)this).getClass().getName(), Integer.toHexString(((Object)this).hashCode()), Boolean.toString(cancellationRequested)
		});
	//    0    0:getstatic       #32  <Field Locale Locale.US>
	//    1    3:ldc1            #34  <String "%s@%s[cancellationRequested=%s]">
	//    2    5:iconst_3        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:invokevirtual   #38  <Method Class Object.getClass()>
	//    8   15:invokevirtual   #43  <Method String Class.getName()>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:invokevirtual   #47  <Method int Object.hashCode()>
	//   14   25:invokestatic    #53  <Method String Integer.toHexString(int)>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_2        
	//   18   31:aload_0         
	//   19   32:getfield        #19  <Field boolean cancellationRequested>
	//   20   35:invokestatic    #58  <Method String Boolean.toString(boolean)>
	//   21   38:aastore         
	//   22   39:invokestatic    #64  <Method String String.format(Locale, String, Object[])>
	//   23   42:areturn         
	}

	boolean tryCancel()
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!cancellationRequested)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #19  <Field boolean cancellationRequested>
	//    7   11:ifeq            18
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		cancellationRequested = true;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #19  <Field boolean cancellationRequested>
		obj;
	//   15   23:aload_1         
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		return true;
	//   17   25:iconst_1        
	//   18   26:ireturn         
		exception;
	//   19   27:astore_2        
		obj;
	//   20   28:aload_1         
		JVM INSTR monitorexit ;
	//   21   29:monitorexit     
		throw exception;
	//   22   30:aload_2         
	//   23   31:athrow          
	}

	private boolean cancellationRequested;
	private final Object lock = new Object();
}
