// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.share.model.SharePhoto;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			OpenGraphJSONUtility

public static interface OpenGraphJSONUtility$PhotoJSONProcessor
{

	public abstract JSONObject toJSONObject(SharePhoto sharephoto);
}
