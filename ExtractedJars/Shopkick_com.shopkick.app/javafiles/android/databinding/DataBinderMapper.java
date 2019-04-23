// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.view.View;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.databinding:
//			DataBindingComponent, ViewDataBinding

public abstract class DataBinderMapper
{

	public DataBinderMapper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public List collectDependencies()
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #21  <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public abstract String convertBrIdToString(int i);

	public abstract ViewDataBinding getDataBinder(DataBindingComponent databindingcomponent, View view, int i);

	public abstract ViewDataBinding getDataBinder(DataBindingComponent databindingcomponent, View aview[], int i);

	public abstract int getLayoutId(String s);
}
