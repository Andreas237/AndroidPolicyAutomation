// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			GraphRequest, GraphResponse

public static interface GraphRequest$GraphJSONObjectCallback
{

	public abstract void onCompleted(JSONObject jsonobject, GraphResponse graphresponse);
}
