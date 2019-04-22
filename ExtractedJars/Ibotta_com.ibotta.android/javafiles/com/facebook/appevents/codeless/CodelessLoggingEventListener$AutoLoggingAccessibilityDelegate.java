// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.appevents.codeless:
//			CodelessLoggingEventListener, CodelessMatcher

public static class CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate extends android.view.View.AccessibilityDelegate
{

	private void logEvent()
	{
		final String eventName = mapping.getEventName();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field EventBinding mapping>
	//    2    4:invokevirtual   #87  <Method String EventBinding.getEventName()>
	//    3    7:astore_1        
		final Bundle params = CodelessMatcher.getParameters(mapping, (View)rootView.get(), (View)hostView.get());
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field EventBinding mapping>
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field WeakReference rootView>
	//    8   16:invokevirtual   #91  <Method Object WeakReference.get()>
	//    9   19:checkcast       #93  <Class View>
	//   10   22:aload_0         
	//   11   23:getfield        #41  <Field WeakReference hostView>
	//   12   26:invokevirtual   #91  <Method Object WeakReference.get()>
	//   13   29:checkcast       #93  <Class View>
	//   14   32:invokestatic    #99  <Method Bundle CodelessMatcher.getParameters(EventBinding, View, View)>
	//   15   35:astore_2        
		if(params.containsKey("_valueToSum"))
	//*  16   36:aload_2         
	//*  17   37:ldc1            #101 <String "_valueToSum">
	//*  18   39:invokevirtual   #107 <Method boolean Bundle.containsKey(String)>
	//*  19   42:ifeq            60
			params.putDouble("_valueToSum", AppEventUtility.normalizePrice(params.getString("_valueToSum")));
	//   20   45:aload_2         
	//   21   46:ldc1            #101 <String "_valueToSum">
	//   22   48:aload_2         
	//   23   49:ldc1            #101 <String "_valueToSum">
	//   24   51:invokevirtual   #111 <Method String Bundle.getString(String)>
	//   25   54:invokestatic    #117 <Method double AppEventUtility.normalizePrice(String)>
	//   26   57:invokevirtual   #121 <Method void Bundle.putDouble(String, double)>
		params.putString("_is_fb_codeless", "1");
	//   27   60:aload_2         
	//   28   61:ldc1            #123 <String "_is_fb_codeless">
	//   29   63:ldc1            #125 <String "1">
	//   30   65:invokevirtual   #129 <Method void Bundle.putString(String, String)>
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

			final CodelessLoggingEventListener.AutoLoggingAccessibilityDelegate this$0;
			final String val$eventName;
			final Bundle val$params;

			
			{
				this$0 = CodelessLoggingEventListener.AutoLoggingAccessibilityDelegate.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate this$0>
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
	//   31   68:invokestatic    #135 <Method Executor FacebookSdk.getExecutor()>
	//   32   71:new             #9   <Class CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate$1>
	//   33   74:dup             
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:aload_2         
	//   37   78:invokespecial   #138 <Method void CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate$1(CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate, String, Bundle)>
	//   38   81:invokeinterface #144 <Method void Executor.execute(Runnable)>
	//   39   86:return          
	}

	public void sendAccessibilityEvent(View view, int i)
	{
		if(i == -1)
	//*   0    0:iload_2         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          14
			Log.e(CodelessLoggingEventListener.access$000(), "Unsupported action type");
	//    3    5:invokestatic    #149 <Method String CodelessLoggingEventListener.access$000()>
	//    4    8:ldc1            #151 <String "Unsupported action type">
	//    5   10:invokestatic    #157 <Method int Log.e(String, String)>
	//    6   13:pop             
		if(i != accessibilityEventType)
	//*   7   14:iload_2         
	//*   8   15:aload_0         
	//*   9   16:getfield        #82  <Field int accessibilityEventType>
	//*  10   19:icmpeq          23
			return;
	//   11   22:return          
		android.view.View.AccessibilityDelegate accessibilitydelegate = existingDelegate;
	//   12   23:aload_0         
	//   13   24:getfield        #32  <Field android.view.View$AccessibilityDelegate existingDelegate>
	//   14   27:astore_3        
		if(accessibilitydelegate != null && !(accessibilitydelegate instanceof CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate))
	//*  15   28:aload_3         
	//*  16   29:ifnull          45
	//*  17   32:aload_3         
	//*  18   33:instanceof      #2   <Class CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate>
	//*  19   36:ifne            45
			accessibilitydelegate.sendAccessibilityEvent(view, i);
	//   20   39:aload_3         
	//   21   40:aload_1         
	//   22   41:iload_2         
	//   23   42:invokevirtual   #159 <Method void android.view.View$AccessibilityDelegate.sendAccessibilityEvent(View, int)>
		logEvent();
	//   24   45:aload_0         
	//   25   46:invokespecial   #161 <Method void logEvent()>
	//   26   49:return          
	}

	private int accessibilityEventType;
	private android.view.View.AccessibilityDelegate existingDelegate;
	private WeakReference hostView;
	private EventBinding mapping;
	private WeakReference rootView;

	public CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate(EventBinding eventbinding, View view, View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void android.view.View$AccessibilityDelegate()>
		if(eventbinding != null && view != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          151
	//*   4    8:aload_2         
	//*   5    9:ifnull          151
		{
			if(view1 == null)
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       17
				return;
	//    8   16:return          
			existingDelegate = ViewHierarchy.getExistingDelegate(view1);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:invokestatic    #30  <Method android.view.View$AccessibilityDelegate ViewHierarchy.getExistingDelegate(View)>
	//   12   22:putfield        #32  <Field android.view.View$AccessibilityDelegate existingDelegate>
			mapping = eventbinding;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #34  <Field EventBinding mapping>
			hostView = new WeakReference(((Object) (view1)));
	//   16   30:aload_0         
	//   17   31:new             #36  <Class WeakReference>
	//   18   34:dup             
	//   19   35:aload_3         
	//   20   36:invokespecial   #39  <Method void WeakReference(Object)>
	//   21   39:putfield        #41  <Field WeakReference hostView>
			rootView = new WeakReference(((Object) (view)));
	//   22   42:aload_0         
	//   23   43:new             #36  <Class WeakReference>
	//   24   46:dup             
	//   25   47:aload_2         
	//   26   48:invokespecial   #39  <Method void WeakReference(Object)>
	//   27   51:putfield        #43  <Field WeakReference rootView>
			view = ((View) (eventbinding.getType()));
	//   28   54:aload_1         
	//   29   55:invokevirtual   #49  <Method com.facebook.appevents.codeless.internal.EventBinding$ActionType EventBinding.getType()>
	//   30   58:astore_2        
			switch(CodelessLoggingEventListener._cls1.$SwitchMap$com$facebook$appevents$codeless$internal$EventBinding$ActionType[eventbinding.getType().ordinal()])
	//*  31   59:getstatic       #55  <Field int[] CodelessLoggingEventListener$1.$SwitchMap$com$facebook$appevents$codeless$internal$EventBinding$ActionType>
	//*  32   62:aload_1         
	//*  33   63:invokevirtual   #49  <Method com.facebook.appevents.codeless.internal.EventBinding$ActionType EventBinding.getType()>
	//*  34   66:invokevirtual   #61  <Method int com.facebook.appevents.codeless.internal.EventBinding$ActionType.ordinal()>
	//*  35   69:iaload          
			{
	//*  36   70:tableswitch     1 3: default 96
	//	               1 145
	//	               2 139
	//	               3 132
			default:
				eventbinding = ((EventBinding) (new StringBuilder()));
	//   37   96:new             #63  <Class StringBuilder>
	//   38   99:dup             
	//   39  100:invokespecial   #64  <Method void StringBuilder()>
	//   40  103:astore_1        
				((StringBuilder) (eventbinding)).append("Unsupported action type: ");
	//   41  104:aload_1         
	//   42  105:ldc1            #66  <String "Unsupported action type: ">
	//   43  107:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   44  110:pop             
				((StringBuilder) (eventbinding)).append(((com.facebook.appevents.codeless.internal.EventBinding.ActionType) (view)).toString());
	//   45  111:aload_1         
	//   46  112:aload_2         
	//   47  113:invokevirtual   #74  <Method String com.facebook.appevents.codeless.internal.EventBinding$ActionType.toString()>
	//   48  116:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   49  119:pop             
				throw new FacebookException(((StringBuilder) (eventbinding)).toString());
	//   50  120:new             #76  <Class FacebookException>
	//   51  123:dup             
	//   52  124:aload_1         
	//   53  125:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   54  128:invokespecial   #80  <Method void FacebookException(String)>
	//   55  131:athrow          

			case 3: // '\003'
				accessibilityEventType = 16;
	//   56  132:aload_0         
	//   57  133:bipush          16
	//   58  135:putfield        #82  <Field int accessibilityEventType>
				return;
	//   59  138:return          

			case 2: // '\002'
				accessibilityEventType = 4;
	//   60  139:aload_0         
	//   61  140:iconst_4        
	//   62  141:putfield        #82  <Field int accessibilityEventType>
				return;
	//   63  144:return          

			case 1: // '\001'
				accessibilityEventType = 1;
	//   64  145:aload_0         
	//   65  146:iconst_1        
	//   66  147:putfield        #82  <Field int accessibilityEventType>
				return;
	//   67  150:return          
			}
		} else
		{
			return;
	//   68  151:return          
		}
	}
}
