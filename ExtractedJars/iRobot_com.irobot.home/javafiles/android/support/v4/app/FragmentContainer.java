// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//			Fragment

public abstract class FragmentContainer
{

	public FragmentContainer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public Fragment instantiate(Context context, String s, Bundle bundle)
	{
		return Fragment.instantiate(context, s, bundle);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #15  <Method Fragment Fragment.instantiate(Context, String, Bundle)>
	//    4    6:areturn         
	}

	public abstract View onFindViewById(int i);

	public abstract boolean onHasView();
}
