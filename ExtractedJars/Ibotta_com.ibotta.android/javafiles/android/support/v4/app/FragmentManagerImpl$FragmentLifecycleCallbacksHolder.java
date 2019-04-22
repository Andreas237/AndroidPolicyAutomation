// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl

private static final class FragmentManagerImpl$FragmentLifecycleCallbacksHolder
{

	final FragmentManager.FragmentLifecycleCallbacks mCallback;
	final boolean mRecursive;

	FragmentManagerImpl$FragmentLifecycleCallbacksHolder(FragmentManager.FragmentLifecycleCallbacks fragmentlifecyclecallbacks, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mCallback = fragmentlifecyclecallbacks;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field FragmentManager$FragmentLifecycleCallbacks mCallback>
		mRecursive = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field boolean mRecursive>
	//    8   14:return          
	}
}
