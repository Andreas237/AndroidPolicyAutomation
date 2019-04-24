// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.*;
import android.util.Pair;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DefaultDrmSession

private class DefaultDrmSession$PostResponseHandler extends Handler
{

	public void handleMessage(Message message)
	{
		Object obj1 = ((Object) ((Pair)message.obj));
	//    0    0:aload_1         
	//    1    1:getfield        #28  <Field Object Message.obj>
	//    2    4:checkcast       #30  <Class Pair>
	//    3    7:astore_3        
		Object obj = ((Pair) (obj1)).first;
	//    4    8:aload_3         
	//    5    9:getfield        #33  <Field Object Pair.first>
	//    6   12:astore_2        
		obj1 = ((Pair) (obj1)).second;
	//    7   13:aload_3         
	//    8   14:getfield        #36  <Field Object Pair.second>
	//    9   17:astore_3        
		switch(message.what)
	//*  10   18:aload_1         
	//*  11   19:getfield        #40  <Field int Message.what>
		{
	//*  12   22:tableswitch     0 1: default 44
	//	               0 55
	//	               1 45
		default:
			return;
	//   13   44:return          

		case 1: // '\001'
			DefaultDrmSession.access$100(DefaultDrmSession.this, obj, obj1);
	//   14   45:aload_0         
	//   15   46:getfield        #16  <Field DefaultDrmSession this$0>
	//   16   49:aload_2         
	//   17   50:aload_3         
	//   18   51:invokestatic    #44  <Method void DefaultDrmSession.access$100(DefaultDrmSession, Object, Object)>
			return;
	//   19   54:return          

		case 0: // '\0'
			DefaultDrmSession.access$000(DefaultDrmSession.this, obj, obj1);
	//   20   55:aload_0         
	//   21   56:getfield        #16  <Field DefaultDrmSession this$0>
	//   22   59:aload_2         
	//   23   60:aload_3         
	//   24   61:invokestatic    #47  <Method void DefaultDrmSession.access$000(DefaultDrmSession, Object, Object)>
			return;
	//   25   64:return          
		}
	}

	final DefaultDrmSession this$0;

	public DefaultDrmSession$PostResponseHandler(Looper looper)
	{
		this$0 = DefaultDrmSession.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field DefaultDrmSession this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
