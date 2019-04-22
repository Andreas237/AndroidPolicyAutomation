// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import org.json.JSONArray;

// Referenced classes of package com.facebook:
//			GraphRequest, GraphResponse

public static interface GraphRequest$GraphJSONArrayCallback
{

	public abstract void onCompleted(JSONArray jsonarray, GraphResponse graphresponse);
}
