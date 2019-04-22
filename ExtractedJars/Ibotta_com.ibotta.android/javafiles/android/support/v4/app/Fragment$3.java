// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.*;

// Referenced classes of package android.support.v4.app:
//			Fragment

class Fragment$3
	implements LifecycleOwner
{

	public Lifecycle getLifecycle()
	{
		if(mViewLifecycleRegistry == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Fragment this$0>
	//*   2    4:getfield        #27  <Field LifecycleRegistry Fragment.mViewLifecycleRegistry>
	//*   3    7:ifnonnull       30
		{
			Fragment fragment = Fragment.this;
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field Fragment this$0>
	//    6   14:astore_1        
			fragment.mViewLifecycleRegistry = new LifecycleRegistry(fragment.mViewLifecycleOwner);
	//    7   15:aload_1         
	//    8   16:new             #29  <Class LifecycleRegistry>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:getfield        #33  <Field LifecycleOwner Fragment.mViewLifecycleOwner>
	//   12   24:invokespecial   #36  <Method void LifecycleRegistry(LifecycleOwner)>
	//   13   27:putfield        #27  <Field LifecycleRegistry Fragment.mViewLifecycleRegistry>
		}
		return ((Lifecycle) (mViewLifecycleRegistry));
	//   14   30:aload_0         
	//   15   31:getfield        #17  <Field Fragment this$0>
	//   16   34:getfield        #27  <Field LifecycleRegistry Fragment.mViewLifecycleRegistry>
	//   17   37:areturn         
	}

	final Fragment this$0;

	Fragment$3()
	{
		this$0 = Fragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Fragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
