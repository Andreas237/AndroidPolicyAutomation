// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.appevents.codeless:
//			RCTCodelessLoggingEventListener, CodelessMatcher

public static class RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener
	implements android.view.View.OnTouchListener
{

	private void logEvent()
	{
		final String eventName = ((String) (mapping));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field EventBinding mapping>
	//    2    4:astore_1        
		if(eventName == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		eventName = ((EventBinding) (eventName)).getEventName();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #56  <Method String EventBinding.getEventName()>
	//    8   14:astore_1        
		final Bundle params = CodelessMatcher.getParameters(mapping, (View)rootView.get(), (View)hostView.get());
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field EventBinding mapping>
	//   11   19:aload_0         
	//   12   20:getfield        #48  <Field WeakReference rootView>
	//   13   23:invokevirtual   #60  <Method Object WeakReference.get()>
	//   14   26:checkcast       #62  <Class View>
	//   15   29:aload_0         
	//   16   30:getfield        #46  <Field WeakReference hostView>
	//   17   33:invokevirtual   #60  <Method Object WeakReference.get()>
	//   18   36:checkcast       #62  <Class View>
	//   19   39:invokestatic    #68  <Method Bundle CodelessMatcher.getParameters(EventBinding, View, View)>
	//   20   42:astore_2        
		if(params.containsKey("_valueToSum"))
	//*  21   43:aload_2         
	//*  22   44:ldc1            #70  <String "_valueToSum">
	//*  23   46:invokevirtual   #76  <Method boolean Bundle.containsKey(String)>
	//*  24   49:ifeq            67
			params.putDouble("_valueToSum", AppEventUtility.normalizePrice(params.getString("_valueToSum")));
	//   25   52:aload_2         
	//   26   53:ldc1            #70  <String "_valueToSum">
	//   27   55:aload_2         
	//   28   56:ldc1            #70  <String "_valueToSum">
	//   29   58:invokevirtual   #80  <Method String Bundle.getString(String)>
	//   30   61:invokestatic    #86  <Method double AppEventUtility.normalizePrice(String)>
	//   31   64:invokevirtual   #90  <Method void Bundle.putDouble(String, double)>
		params.putString("_is_fb_codeless", "1");
	//   32   67:aload_2         
	//   33   68:ldc1            #92  <String "_is_fb_codeless">
	//   34   70:ldc1            #94  <String "1">
	//   35   72:invokevirtual   #98  <Method void Bundle.putString(String, String)>
		FacebookSdk.getExecutor().execute(new Runnable() {

			public void run()
			{
				AppEventsLogger.newLogger(FacebookSdk.getApplicationContext()).logEvent(eventName, params);
			//    0    0:invokestatic    #38  <Method android.content.Context FacebookSdk.getApplicationContext()>
			//    1    3:invokestatic    #44  <Method AppEventsLogger AppEventsLogger.newLogger(android.content.Context)>
			//    2    6:aload_0         
			//    3    7:getfield        #26  <Field String val$eventName>
			//    4   10:aload_0         
			//    5   11:getfield        #28  <Field Bundle val$params>
			//    6   14:invokevirtual   #47  <Method void AppEventsLogger.logEvent(String, Bundle)>
			//    7   17:return          
			}

			final RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener this$0;
			final String val$eventName;
			final Bundle val$params;

			
			{
				this$0 = RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener this$0>
				eventName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field String val$eventName>
				params = bundle;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field Bundle val$params>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   36   75:invokestatic    #104 <Method Executor FacebookSdk.getExecutor()>
	//   37   78:new             #11  <Class RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener$1>
	//   38   81:dup             
	//   39   82:aload_0         
	//   40   83:aload_1         
	//   41   84:aload_2         
	//   42   85:invokespecial   #107 <Method void RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener$1(RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener, String, Bundle)>
	//   43   88:invokeinterface #113 <Method void Executor.execute(Runnable)>
	//   44   93:return          
	}

	public boolean getSupportCodelessLogging()
	{
		return supportCodelessLogging;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean supportCodelessLogging>
	//    2    4:ireturn         
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		if(motionevent.getAction() == 1)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #123 <Method int MotionEvent.getAction()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          12
			logEvent();
	//    4    8:aload_0         
	//    5    9:invokespecial   #125 <Method void logEvent()>
		android.view.View.OnTouchListener ontouchlistener = existingOnTouchListener;
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field android.view.View$OnTouchListener existingOnTouchListener>
	//    8   16:astore_3        
		return ontouchlistener != null && ontouchlistener.onTouch(view, motionevent);
	//    9   17:aload_3         
	//   10   18:ifnull          34
	//   11   21:aload_3         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokeinterface #127 <Method boolean android.view.View$OnTouchListener.onTouch(View, MotionEvent)>
	//   15   29:ifeq            34
	//   16   32:iconst_1        
	//   17   33:ireturn         
	//   18   34:iconst_0        
	//   19   35:ireturn         
	}

	private android.view.View.OnTouchListener existingOnTouchListener;
	private WeakReference hostView;
	private EventBinding mapping;
	private WeakReference rootView;
	private boolean supportCodelessLogging;

	public RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener(EventBinding eventbinding, View view, View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		supportCodelessLogging = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #29  <Field boolean supportCodelessLogging>
		if(eventbinding != null && view != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          65
	//*   7   13:aload_2         
	//*   8   14:ifnull          65
		{
			if(view1 == null)
	//*   9   17:aload_3         
	//*  10   18:ifnonnull       22
			{
				return;
	//   11   21:return          
			} else
			{
				existingOnTouchListener = ViewHierarchy.getExistingOnTouchListener(view1);
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:invokestatic    #35  <Method android.view.View$OnTouchListener ViewHierarchy.getExistingOnTouchListener(View)>
	//   15   27:putfield        #37  <Field android.view.View$OnTouchListener existingOnTouchListener>
				mapping = eventbinding;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #39  <Field EventBinding mapping>
				hostView = new WeakReference(((Object) (view1)));
	//   19   35:aload_0         
	//   20   36:new             #41  <Class WeakReference>
	//   21   39:dup             
	//   22   40:aload_3         
	//   23   41:invokespecial   #44  <Method void WeakReference(Object)>
	//   24   44:putfield        #46  <Field WeakReference hostView>
				rootView = new WeakReference(((Object) (view)));
	//   25   47:aload_0         
	//   26   48:new             #41  <Class WeakReference>
	//   27   51:dup             
	//   28   52:aload_2         
	//   29   53:invokespecial   #44  <Method void WeakReference(Object)>
	//   30   56:putfield        #48  <Field WeakReference rootView>
				supportCodelessLogging = true;
	//   31   59:aload_0         
	//   32   60:iconst_1        
	//   33   61:putfield        #29  <Field boolean supportCodelessLogging>
				return;
	//   34   64:return          
			}
		} else
		{
			return;
	//   35   65:return          
		}
	}
}
