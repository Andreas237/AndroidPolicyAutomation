// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.app.PendingIntent;

public class BrowserActionItem
{

	public PendingIntent getAction()
	{
		return mAction;
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field PendingIntent mAction>
	//    2    4:areturn         
	}

	private final PendingIntent mAction;
}
