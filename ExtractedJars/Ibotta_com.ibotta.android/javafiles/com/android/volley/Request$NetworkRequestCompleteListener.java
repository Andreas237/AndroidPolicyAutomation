// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			Request, Response

static interface Request$NetworkRequestCompleteListener
{

	public abstract void onNoUsableResponseReceived(Request request);

	public abstract void onResponseReceived(Request request, Response response);
}
