// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import com.facebook.FacebookException;
import org.json.JSONArray;

// Referenced classes of package com.facebook.share:
//			ShareApi

class ShareApi$6
	implements com.facebook.internal.apper.OnMapperCompleteListener
{

	public void onComplete()
	{
		val$onArrayListStagedListener.onComplete(((Object) (val$stagedObject)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onArrayListStagedListener>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field JSONArray val$stagedObject>
	//    4    8:invokeinterface #35  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onComplete(Object)>
	//    5   13:return          
	}

	public void onError(FacebookException facebookexception)
	{
		val$onArrayListStagedListener.onError(facebookexception);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onArrayListStagedListener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #39  <Method void com.facebook.internal.CollectionMapper$OnMapValueCompleteListener.onError(FacebookException)>
	//    4   10:return          
	}

	final ShareApi this$0;
	final com.facebook.internal.apper.OnMapValueCompleteListener val$onArrayListStagedListener;
	final JSONArray val$stagedObject;

	ShareApi$6()
	{
		this$0 = final_shareapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ShareApi this$0>
		val$onArrayListStagedListener = onmapvaluecompletelistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field com.facebook.internal.CollectionMapper$OnMapValueCompleteListener val$onArrayListStagedListener>
		val$stagedObject = JSONArray.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field JSONArray val$stagedObject>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
