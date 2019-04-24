// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.os.*;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//			ActivityHandler, AdjustEvent

private static final class ActivityHandler$SessionHandler extends Handler
{

	public void handleMessage(Message message)
	{
		super.handleMessage(message);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void Handler.handleMessage(Message)>
		ActivityHandler activityhandler = (ActivityHandler)sessionHandlerReference.get();
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field WeakReference sessionHandlerReference>
	//    5    9:invokevirtual   #52  <Method Object WeakReference.get()>
	//    6   12:checkcast       #6   <Class ActivityHandler>
	//    7   15:astore_2        
		if(activityhandler == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		switch(message.arg1)
	//*  11   21:aload_1         
	//*  12   22:getfield        #57  <Field int Message.arg1>
		{
	//*  13   25:tableswitch     72631 72639: default 76
	//	               72631 163
	//	               72632 158
	//	               72633 153
	//	               72634 141
	//	               72635 129
	//	               72636 108
	//	               72637 87
	//	               72638 82
	//	               72639 77
		default:
			return;
	//   14   76:return          

		case 72639: 
			ActivityHandler.access$1000(activityhandler);
	//   15   77:aload_2         
	//   16   78:invokestatic    #61  <Method void ActivityHandler.access$1000(ActivityHandler)>
			return;
	//   17   81:return          

		case 72638: 
			ActivityHandler.access$900(activityhandler);
	//   18   82:aload_2         
	//   19   83:invokestatic    #64  <Method void ActivityHandler.access$900(ActivityHandler)>
			return;
	//   20   86:return          

		case 72637: 
			message = ((Message) ((me)message.obj));
	//   21   87:aload_1         
	//   22   88:getfield        #68  <Field Object Message.obj>
	//   23   91:checkcast       #70  <Class ActivityHandler$ReferrerClickTime>
	//   24   94:astore_1        
			ActivityHandler.access$800(activityhandler, ((me) (message)).referrer, ((me) (message)).clickTime);
	//   25   95:aload_2         
	//   26   96:aload_1         
	//   27   97:getfield        #74  <Field String ActivityHandler$ReferrerClickTime.referrer>
	//   28  100:aload_1         
	//   29  101:getfield        #78  <Field long ActivityHandler$ReferrerClickTime.clickTime>
	//   30  104:invokestatic    #82  <Method void ActivityHandler.access$800(ActivityHandler, String, long)>
			return;
	//   31  107:return          

		case 72636: 
			message = ((Message) ((ActivityHandler.UrlClickTime)message.obj));
	//   32  108:aload_1         
	//   33  109:getfield        #68  <Field Object Message.obj>
	//   34  112:checkcast       #84  <Class ActivityHandler$UrlClickTime>
	//   35  115:astore_1        
			ActivityHandler.access$700(activityhandler, ((ActivityHandler.UrlClickTime) (message)).url, ((ActivityHandler.UrlClickTime) (message)).clickTime);
	//   36  116:aload_2         
	//   37  117:aload_1         
	//   38  118:getfield        #88  <Field android.net.Uri ActivityHandler$UrlClickTime.url>
	//   39  121:aload_1         
	//   40  122:getfield        #89  <Field long ActivityHandler$UrlClickTime.clickTime>
	//   41  125:invokestatic    #93  <Method void ActivityHandler.access$700(ActivityHandler, android.net.Uri, long)>
			return;
	//   42  128:return          

		case 72635: 
			ActivityHandler.access$600(activityhandler, (JSONObject)message.obj);
	//   43  129:aload_2         
	//   44  130:aload_1         
	//   45  131:getfield        #68  <Field Object Message.obj>
	//   46  134:checkcast       #95  <Class JSONObject>
	//   47  137:invokestatic    #99  <Method void ActivityHandler.access$600(ActivityHandler, JSONObject)>
			return;
	//   48  140:return          

		case 72634: 
			ActivityHandler.access$500(activityhandler, (AdjustEvent)message.obj);
	//   49  141:aload_2         
	//   50  142:aload_1         
	//   51  143:getfield        #68  <Field Object Message.obj>
	//   52  146:checkcast       #101 <Class AdjustEvent>
	//   53  149:invokestatic    #105 <Method void ActivityHandler.access$500(ActivityHandler, AdjustEvent)>
			return;
	//   54  152:return          

		case 72633: 
			ActivityHandler.access$400(activityhandler);
	//   55  153:aload_2         
	//   56  154:invokestatic    #108 <Method void ActivityHandler.access$400(ActivityHandler)>
			return;
	//   57  157:return          

		case 72632: 
			ActivityHandler.access$300(activityhandler);
	//   58  158:aload_2         
	//   59  159:invokestatic    #111 <Method void ActivityHandler.access$300(ActivityHandler)>
			return;
	//   60  162:return          

		case 72631: 
			ActivityHandler.access$200(activityhandler);
	//   61  163:aload_2         
	//   62  164:invokestatic    #114 <Method void ActivityHandler.access$200(ActivityHandler)>
			return;
	//   63  167:return          
		}
	}

	private static final int BASE_ADDRESS = 0x11bb6;
	private static final int DEEP_LINK = 0x11bbc;
	private static final int END = 0x11bb9;
	private static final int EVENT = 0x11bba;
	private static final int FINISH_TRACKING = 0x11bbb;
	private static final int INIT = 0x11bb7;
	private static final int SEND_REFERRER = 0x11bbd;
	private static final int START = 0x11bb8;
	private static final int TIMER_FIRED = 0x11bbf;
	private static final int UPDATE_HANDLERS_STATUS = 0x11bbe;
	private final WeakReference sessionHandlerReference;

	protected ActivityHandler$SessionHandler(Looper looper, ActivityHandler activityhandler)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void Handler(Looper)>
		sessionHandlerReference = new WeakReference(((Object) (activityhandler)));
	//    3    5:aload_0         
	//    4    6:new             #38  <Class WeakReference>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokespecial   #41  <Method void WeakReference(Object)>
	//    8   14:putfield        #43  <Field WeakReference sessionHandlerReference>
	//    9   17:return          
	}
}
