// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.appevents.codeless:
//			CodelessMatcher

public static class CodelessMatcher$MatchedView
{

	public View getView()
	{
		WeakReference weakreference = view;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field WeakReference view>
	//    2    4:astore_1        
		if(weakreference == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (View)weakreference.get();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #34  <Method Object WeakReference.get()>
	//    9   15:checkcast       #36  <Class View>
	//   10   18:areturn         
	}

	public String getViewMapKey()
	{
		return viewMapKey;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String viewMapKey>
	//    2    4:areturn         
	}

	private WeakReference view;
	private String viewMapKey;

	public CodelessMatcher$MatchedView(View view1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		view = new WeakReference(((Object) (view1)));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
	//    7   13:putfield        #24  <Field WeakReference view>
		viewMapKey = s;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #26  <Field String viewMapKey>
	//   11   21:return          
	}
}
