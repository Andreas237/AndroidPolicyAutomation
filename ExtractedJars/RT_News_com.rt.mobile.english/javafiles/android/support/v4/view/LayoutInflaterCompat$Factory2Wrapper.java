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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #30  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object)this).getClass().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #35  <Method Class Object.getClass()>
	//    7   13:invokevirtual   #40  <Method String Class.getName()>
	//    8   16:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("{");
	//   10   20:aload_1         
	//   11   21:ldc1            #46  <String "{">
	//   12   23:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(((Object) (mDelegateFactory)));
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #18  <Field LayoutInflaterFactory mDelegateFactory>
	//   17   32:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   18   35:pop             
		stringbuilder.append("}");
	//   19   36:aload_1         
	//   20   37:ldc1            #51  <String "}">
	//   21   39:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		return stringbuilder.toString();
	//   23   43:aload_1         
	//   24   44:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   25   47:areturn         
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
