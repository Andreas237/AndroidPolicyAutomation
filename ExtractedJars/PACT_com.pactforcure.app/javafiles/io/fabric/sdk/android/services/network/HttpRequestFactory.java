// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.util.Map;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpMethod, HttpRequest, PinningInfoProvider

public interface HttpRequestFactory
{

	public abstract HttpRequest buildHttpRequest(HttpMethod httpmethod, String s);

	public abstract HttpRequest buildHttpRequest(HttpMethod httpmethod, String s, Map map);

	public abstract PinningInfoProvider getPinningInfoProvider();

	public abstract void setPinningInfoProvider(PinningInfoProvider pinninginfoprovider);
}
