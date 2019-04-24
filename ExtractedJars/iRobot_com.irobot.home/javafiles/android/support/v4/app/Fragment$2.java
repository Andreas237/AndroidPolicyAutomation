// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//			FragmentContainer, Fragment, FragmentHostCallback

class Fragment$2 extends FragmentContainer
{

	public Fragment instantiate(Context context, String s, Bundle bundle)
	{
		return mHost.instantiate(context, s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Fragment this$0>
	//    2    4:getfield        #24  <Field FragmentHostCallback Fragment.mHost>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #28  <Method Fragment FragmentHostCallback.instantiate(Context, String, Bundle)>
	//    7   13:areturn         
	}

	public View onFindViewById(int i)
	{
		if(mView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Fragment this$0>
	//*   2    4:getfield        #34  <Field View Fragment.mView>
	//*   3    7:ifnonnull       20
			throw new IllegalStateException("Fragment does not have a view");
	//    4   10:new             #36  <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc1            #38  <String "Fragment does not have a view">
	//    7   16:invokespecial   #41  <Method void IllegalStateException(String)>
	//    8   19:athrow          
		else
			return mView.findViewById(i);
	//    9   20:aload_0         
	//   10   21:getfield        #15  <Field Fragment this$0>
	//   11   24:getfield        #34  <Field View Fragment.mView>
	//   12   27:iload_1         
	//   13   28:invokevirtual   #46  <Method View View.findViewById(int)>
	//   14   31:areturn         
	}

	public boolean onHasView()
	{
		return mView != null;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Fragment this$0>
	//    2    4:getfield        #34  <Field View Fragment.mView>
	//    3    7:ifnull          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	final Fragment this$0;

	Fragment$2()
	{
		this$0 = Fragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Fragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void FragmentContainer()>
	//    5    9:return          
	}
}
