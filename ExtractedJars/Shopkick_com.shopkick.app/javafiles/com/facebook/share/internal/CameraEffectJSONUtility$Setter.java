// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			CameraEffectJSONUtility

public static interface CameraEffectJSONUtility$Setter
{

	public abstract void setOnArgumentsBuilder(com.facebook.share.model.CameraEffectArguments.Builder builder, String s, Object obj)
		throws JSONException;

	public abstract void setOnJSON(JSONObject jsonobject, String s, Object obj)
		throws JSONException;
}
