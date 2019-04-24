// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.support.v4.util.SimpleArrayMap;

// Referenced classes of package android.support.v7.preference:
//			PreferenceGroup

class PreferenceGroup$1
	implements Runnable
{

	public void run()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		PreferenceGroup.access$000(PreferenceGroup.this).clear();
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field PreferenceGroup this$0>
	//    4    6:invokestatic    #23  <Method SimpleArrayMap PreferenceGroup.access$000(PreferenceGroup)>
	//    5    9:invokevirtual   #28  <Method void SimpleArrayMap.clear()>
		this;
	//    6   12:aload_0         
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return;
	//    8   14:return          
		Exception exception;
		exception;
	//    9   15:astore_1        
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		throw exception;
	//   12   18:aload_1         
	//   13   19:athrow          
	}

	final PreferenceGroup this$0;

	PreferenceGroup$1()
	{
		this$0 = PreferenceGroup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field PreferenceGroup this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
