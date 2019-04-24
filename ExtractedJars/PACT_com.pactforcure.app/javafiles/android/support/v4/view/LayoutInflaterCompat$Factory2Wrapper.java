// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			LayoutInflaterCompat, LayoutInflaterFactory

static class LayoutInflaterCompat$Factory2Wrapper
	implements android.view.LayoutInflater.Factory2
{

	public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		return mDelegateFactory.onCreateView(view, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field LayoutInflaterFactory mDelegateFactory>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokeinterface #25  <Method View LayoutInflaterFactory.onCreateView(View, String, Context, AttributeSet)>
	//    7   14:areturn         
	}

	public View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return mDelegateFactory.onCreateView(((View) (null)), s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field LayoutInflaterFactory mDelegateFactory>
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokeinterface #25  <Method View LayoutInflaterFactory.onCreateView(View, String, Context, AttributeSet)>
	//    7   13:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append("{").append(((Object) (mDelegateFactory))).append("}").toString();
	//    0    0:new             #30  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #35  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #40  <Method String Class.getName()>
	//    6   14:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #46  <String "{">
	//    8   19:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:getfield        #18  <Field LayoutInflaterFactory mDelegateFactory>
	//   11   26:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   12   29:ldc1            #51  <String "}">
	//   13   31:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   15   37:areturn         
	}

	final LayoutInflaterFactory mDelegateFactory;

	LayoutInflaterCompat$Factory2Wrapper(LayoutInflaterFactory layoutinflaterfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mDelegateFactory = layoutinflaterfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field LayoutInflaterFactory mDelegateFactory>
	//    5    9:return          
	}
}
