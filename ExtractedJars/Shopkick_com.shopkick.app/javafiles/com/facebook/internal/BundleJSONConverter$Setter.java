// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//			BundleJSONConverter

public static interface BundleJSONConverter$Setter
{

	public abstract void setOnBundle(Bundle bundle, String s, Object obj)
		throws JSONException;

	public abstract void setOnJSON(JSONObject jsonobject, String s, Object obj)
		throws JSONException;
}
