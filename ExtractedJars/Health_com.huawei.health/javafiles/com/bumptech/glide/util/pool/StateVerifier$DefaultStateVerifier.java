// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util.pool;


// Referenced classes of package com.bumptech.glide.util.pool:
//			StateVerifier

static class StateVerifier$DefaultStateVerifier extends StateVerifier
{

	public void setRecycled(boolean flag)
	{
		isReleased = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field boolean isReleased>
	//    3    5:return          
	}

	public void throwIfRecycled()
	{
		if(isReleased)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field boolean isReleased>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Already released");
	//    3    7:new             #20  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #22  <String "Already released">
	//    6   13:invokespecial   #25  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	private volatile boolean isReleased;

	StateVerifier$DefaultStateVerifier()
	{
		super(((StateVerifier._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #12  <Method void StateVerifier(StateVerifier$1)>
	//    3    5:return          
	}
}
