// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//			IActivityHandler, ActivityPackage

public interface IAttributionHandler
{

	public abstract void checkAttribution(JSONObject jsonobject);

	public abstract void getAttribution();

	public abstract void init(IActivityHandler iactivityhandler, ActivityPackage activitypackage, boolean flag, boolean flag1);

	public abstract void pauseSending();

	public abstract void resumeSending();
}
