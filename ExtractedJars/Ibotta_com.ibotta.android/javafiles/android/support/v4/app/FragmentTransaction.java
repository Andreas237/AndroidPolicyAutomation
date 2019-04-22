// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//			Fragment

public abstract class FragmentTransaction
{

	public FragmentTransaction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract FragmentTransaction add(int i, Fragment fragment, String s);

	public abstract FragmentTransaction add(Fragment fragment, String s);

	public abstract FragmentTransaction attach(Fragment fragment);

	public abstract int commit();

	public abstract int commitAllowingStateLoss();

	public abstract void commitNow();

	public abstract FragmentTransaction detach(Fragment fragment);

	public abstract FragmentTransaction disallowAddToBackStack();

	public abstract FragmentTransaction remove(Fragment fragment);
}
