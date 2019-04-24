// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.FacebookException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			Utility

public static interface Utility$GraphMeRequestWithCacheCallback
{

	public abstract void onFailure(FacebookException facebookexception);

	public abstract void onSuccess(JSONObject jsonobject);
}
