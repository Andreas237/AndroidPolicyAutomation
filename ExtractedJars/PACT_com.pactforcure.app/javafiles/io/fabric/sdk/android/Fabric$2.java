// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package io.fabric.sdk.android:
//			InitializationCallback, Fabric

class Fabric$2
	implements InitializationCallback
{

	public void failure(Exception exception)
	{
		Fabric.access$200(Fabric.this).failure(exception);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Fabric this$0>
	//    2    4:invokestatic    #40  <Method InitializationCallback Fabric.access$200(Fabric)>
	//    3    7:aload_1         
	//    4    8:invokeinterface #42  <Method void InitializationCallback.failure(Exception)>
	//    5   13:return          
	}

	public void success(Object obj)
	{
		kitInitializedLatch.countDown();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field CountDownLatch kitInitializedLatch>
	//    2    4:invokevirtual   #47  <Method void CountDownLatch.countDown()>
		if(kitInitializedLatch.getCount() == 0L)
	//*   3    7:aload_0         
	//*   4    8:getfield        #33  <Field CountDownLatch kitInitializedLatch>
	//*   5   11:invokevirtual   #51  <Method long CountDownLatch.getCount()>
	//*   6   14:lconst_0        
	//*   7   15:lcmp            
	//*   8   16:ifne            46
		{
			Fabric.access$100(Fabric.this).set(true);
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field Fabric this$0>
	//   11   23:invokestatic    #55  <Method AtomicBoolean Fabric.access$100(Fabric)>
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #61  <Method void AtomicBoolean.set(boolean)>
			Fabric.access$200(Fabric.this).success(((Object) (Fabric.this)));
	//   14   30:aload_0         
	//   15   31:getfield        #21  <Field Fabric this$0>
	//   16   34:invokestatic    #40  <Method InitializationCallback Fabric.access$200(Fabric)>
	//   17   37:aload_0         
	//   18   38:getfield        #21  <Field Fabric this$0>
	//   19   41:invokeinterface #63  <Method void InitializationCallback.success(Object)>
		}
	//   20   46:return          
	}

	final CountDownLatch kitInitializedLatch;
	final Fabric this$0;
	final int val$size;

	Fabric$2()
	{
		this$0 = final_fabric;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Fabric this$0>
		val$size = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field int val$size>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
		kitInitializedLatch = new CountDownLatch(val$size);
	//    8   14:aload_0         
	//    9   15:new             #28  <Class CountDownLatch>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #23  <Field int val$size>
	//   13   23:invokespecial   #31  <Method void CountDownLatch(int)>
	//   14   26:putfield        #33  <Field CountDownLatch kitInitializedLatch>
	//   15   29:return          
	}
}
