// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			ViewDataBinding

public abstract class OnRebindCallback
{

	public OnRebindCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public void onBound(ViewDataBinding viewdatabinding)
	{
	//    0    0:return          
	}

	public void onCanceled(ViewDataBinding viewdatabinding)
	{
	//    0    0:return          
	}

	public boolean onPreBind(ViewDataBinding viewdatabinding)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
