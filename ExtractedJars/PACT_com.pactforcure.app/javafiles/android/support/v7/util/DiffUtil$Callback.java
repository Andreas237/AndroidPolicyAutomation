// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			DiffUtil

public static abstract class DiffUtil$Callback
{

	public abstract boolean areContentsTheSame(int i, int j);

	public abstract boolean areItemsTheSame(int i, int j);

	public Object getChangePayload(int i, int j)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract int getNewListSize();

	public abstract int getOldListSize();

	public DiffUtil$Callback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
