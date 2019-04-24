// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.Handler;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DefaultDrmSessionEventListener

private static final class DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener
{

	public final Handler handler;
	public final DefaultDrmSessionEventListener listener;

	public DefaultDrmSessionEventListener$EventDispatcher$HandlerAndListener(Handler handler1, DefaultDrmSessionEventListener defaultdrmsessioneventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		handler = handler1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Handler handler>
		listener = defaultdrmsessioneventlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field DefaultDrmSessionEventListener listener>
	//    8   14:return          
	}
}
