// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			ViewDataBinding

static final class ViewDataBinding$1
	implements eateWeakListener
{

	public akListener create(ViewDataBinding viewdatabinding, int i)
	{
		return (new akPropertyListener(viewdatabinding, i)).getListener();
	//    0    0:new             #17  <Class ViewDataBinding$WeakPropertyListener>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #20  <Method void ViewDataBinding$WeakPropertyListener(ViewDataBinding, int)>
	//    5    9:invokevirtual   #24  <Method ViewDataBinding$WeakListener ViewDataBinding$WeakPropertyListener.getListener()>
	//    6   12:areturn         
	}

	ViewDataBinding$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
