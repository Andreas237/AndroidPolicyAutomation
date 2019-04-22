// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.view.View;
import com.facebook.stetho.common.Predicate;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			AndroidDocumentProvider, DocumentHiddenView

class AndroidDocumentProvider$InspectModeHandler$1
	implements Predicate
{

	public boolean apply(View view)
	{
		return !(view instanceof DocumentHiddenView);
	//    0    0:aload_1         
	//    1    1:instanceof      #26  <Class DocumentHiddenView>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public volatile boolean apply(Object obj)
	{
		return apply((View)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class View>
	//    3    5:invokevirtual   #31  <Method boolean apply(View)>
	//    4    8:ireturn         
	}

	final AndroidDocumentProvider.InspectModeHandler this$1;

	AndroidDocumentProvider$InspectModeHandler$1()
	{
		this$1 = AndroidDocumentProvider.InspectModeHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AndroidDocumentProvider$InspectModeHandler this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
