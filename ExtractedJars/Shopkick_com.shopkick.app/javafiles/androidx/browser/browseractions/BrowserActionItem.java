// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.app.PendingIntent;

public class BrowserActionItem
{

	public BrowserActionItem(String s, PendingIntent pendingintent)
	{
		this(s, pendingintent, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #17  <Method void BrowserActionItem(String, PendingIntent, int)>
	//    5    7:return          
	}

	public BrowserActionItem(String s, PendingIntent pendingintent, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mTitle = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String mTitle>
		mAction = pendingintent;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field PendingIntent mAction>
		mIconId = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field int mIconId>
	//   11   19:return          
	}

	public PendingIntent getAction()
	{
		return mAction;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field PendingIntent mAction>
	//    2    4:areturn         
	}

	public int getIconId()
	{
		return mIconId;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int mIconId>
	//    2    4:ireturn         
	}

	public String getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String mTitle>
	//    2    4:areturn         
	}

	private final PendingIntent mAction;
	private final int mIconId;
	private final String mTitle;
}
