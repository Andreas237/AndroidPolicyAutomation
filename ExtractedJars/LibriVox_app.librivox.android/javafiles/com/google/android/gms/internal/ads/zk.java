// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;

public final class zk
{

	public zk(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		b = 0x0L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #19  <Long 0x0L>
	//    4    8:putfield        #22  <Field long b>
		c = new Object();
	//    5   11:aload_0         
	//    6   12:new             #4   <Class Object>
	//    7   15:dup             
	//    8   16:invokespecial   #18  <Method void Object()>
	//    9   19:putfield        #24  <Field Object c>
		a = l;
	//   10   22:aload_0         
	//   11   23:lload_1         
	//   12   24:putfield        #26  <Field long a>
	//   13   27:return          
	}

	public final boolean a()
	{
		long l;
label0:
		{
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object c>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				l = aw.l().b();
	//    5    7:invokestatic    #34  <Method e aw.l()>
	//    6   10:invokeinterface #39  <Method long e.b()>
	//    7   15:lstore_1        
				if(b + a <= l)
					break label0;
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field long b>
	//   10   20:aload_0         
	//   11   21:getfield        #26  <Field long a>
	//   12   24:ladd            
	//   13   25:lload_1         
	//   14   26:lcmp            
	//   15   27:ifle            34
			}
	//   16   30:aload_3         
	//   17   31:monitorexit     
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		}
		b = l;
	//   20   34:aload_0         
	//   21   35:lload_1         
	//   22   36:putfield        #22  <Field long b>
		obj;
	//   23   39:aload_3         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		return true;
	//   25   41:iconst_1        
	//   26   42:ireturn         
		exception;
	//   27   43:astore          4
		obj;
	//   28   45:aload_3         
		JVM INSTR monitorexit ;
	//   29   46:monitorexit     
		throw exception;
	//   30   47:aload           4
	//   31   49:athrow          
	}

	private long a;
	private long b;
	private Object c;
}
