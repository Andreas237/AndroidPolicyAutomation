// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.applinks;

import android.net.Uri;
import bolts.*;
import java.util.Map;

// Referenced classes of package com.facebook.applinks:
//			FacebookAppLinkResolver

class FacebookAppLinkResolver$1
	implements Continuation
{

	public AppLink then(Task task)
		throws Exception
	{
		return (AppLink)((Map)task.getResult()).get(((Object) (val$uri)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method Object Task.getResult()>
	//    2    4:checkcast       #38  <Class Map>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Uri val$uri>
	//    5   11:invokeinterface #42  <Method Object Map.get(Object)>
	//    6   16:checkcast       #44  <Class AppLink>
	//    7   19:areturn         
	}

	public volatile Object then(Task task)
		throws Exception
	{
		return ((Object) (then(task)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #50  <Method AppLink then(Task)>
	//    3    5:areturn         
	}

	final FacebookAppLinkResolver this$0;
	final Uri val$uri;

	FacebookAppLinkResolver$1()
	{
		this$0 = final_facebookapplinkresolver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field FacebookAppLinkResolver this$0>
		val$uri = Uri.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Uri val$uri>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
