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
	//    1    1:getfield        #42  <Field EventBinding mapping>
	//    2    4:invokevirtual   #94  <Method String EventBinding.getEventName()>
	//    3    7:astore_1        
		final Bundle params = CodelessMatcher.getParameters(mapping, (View)rootView.get(), (View)hostView.get());
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field EventBinding mapping>
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field WeakReference rootView>
	//    8   16:invokevirtual   #98  <Method Object WeakReference.get()>
	//    9   19:checkcast       #100 <Class View>
	//   10   22:aload_0         
	//   11   23:getfield        #49  <Field WeakReference hostView>
	//   12   26:invokevirtual   #98  <Method Object WeakReference.get()>
	//   13   29:checkcast       #100 <Class View>
	//   14   32:invokestatic    #106 <Method Bundle CodelessMatcher.getParameters(EventBinding, View, View)>
	//   15   35:astore_2        
		if(params.containsKey("_valueToSum"))
	//*  16   36:aload_2         
	//*  17   37:ldc1            #108 <String "_valueToSum">
	//*  18   39:invokevirtual   #114 <Method boolean Bundle.containsKey(String)>
	//*  19   42:ifeq            60
			params.putDouble("_valueToSum", AppEventUtility.normalizePrice(params.getString("_valueToSum")));
	//   20   45:aload_2         
	//   21   46:ldc1            #108 <String "_valueToSum">
	//   22   48:aload_2         
	//   23   49:ldc1            #108 <String "_valueToSum">
	//   24   51:invokevirtual   #118 <Method String Bundle.getString(String)>
	//   25   54:invokestatic    #124 <Method double AppEventUtility.normalizePrice(String)>
	//   26   57:invokevirtual   #128 <Method void Bundle.putDouble(String, double)>
		params.putString("_is_fb_codeless", "1");
	//   27   60:aload_2         
	//   28   61:ldc1            #130 <String "_is_fb_codeless">
	//   29   63:ldc1            #132 <String "1">
	//   30   65:invokevirtual   #136 <Method void Bundle.putString(String, String)>
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
	//   31   68:invokestatic    #142 <Method Executor FacebookSdk.getExecutor()>
	//   32   71:new             #9   <Class CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate$1>
	//   33   74:dup             
	//   34   75:aload_0         
	//   35   76:aload_1         
	//   36   77:aload_2         
	//   37   78:invokespecial   #145 <Method void CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate$1(CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate, String, Bundle)>
	//   38   81:invokeinterface #151 <Method void Executor.execute(Runnable)>
	//   39   86:return          
	}

	public boolean getSupportButtonIndexing()
	{
		return supportButtonIndexing;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean supportButtonIndexing>
	//    2    4:ireturn         
	}

	public boolean getSupportCodelessLogging()
	{
		return supportCodelessLogging;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean supportCodelessLogging>
	//    2    4:ireturn         
	}

	public void sendAccessibilityEvent(View view, int i)
	{
		if(i == -1)
	//*   0    0:iload_2         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          14
			Log.e(CodelessLoggingEventListener.access$000(), "Unsupported action type");
	//    3    5:invokestatic    #159 <Method String CodelessLoggingEventListener.access$000()>
	//    4    8:ldc1            #161 <String "Unsupported action type">
	//    5   10:invokestatic    #167 <Method int Log.e(String, String)>
	//    6   13:pop             
		if(i != accessibilityEventType)
	//*   7   14:iload_2         
	//*   8   15:aload_0         
	//*   9   16:getfield        #90  <Field int accessibilityEventType>
	//*  10   19:icmpeq          23
			return;
	//   11   22:return          
		android.view.View.AccessibilityDelegate accessibilitydelegate = existingDelegate;
	//   12   23:aload_0         
	//   13   24:getfield        #40  <Field android.view.View$AccessibilityDelegate existingDelegate>
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
	//   23   42:invokevirtual   #169 <Method void android.view.View$AccessibilityDelegate.sendAccessibilityEvent(View, int)>
		logEvent();
	//   24   45:aload_0         
	//   25   46:invokespecial   #171 <Method void logEvent()>
	//   26   49:return          
	}

	private int accessibilityEventType;
	private android.view.View.AccessibilityDelegate existingDelegate;
	private WeakReference hostView;
	private EventBinding mapping;
	private WeakReference rootView;
	protected boolean supportButtonIndexing;
	private boolean supportCodelessLogging;

	public CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void android.view.View$AccessibilityDelegate()>
		supportCodelessLogging = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field boolean supportCodelessLogging>
		supportButtonIndexing = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #30  <Field boolean supportButtonIndexing>
	//    8   14:return          
	}

	public CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate(EventBinding eventbinding, View view, View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void android.view.View$AccessibilityDelegate()>
		supportCodelessLogging = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field boolean supportCodelessLogging>
		supportButtonIndexing = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #30  <Field boolean supportButtonIndexing>
		if(eventbinding != null && view != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          172
	//*  10   18:aload_2         
	//*  11   19:ifnull          172
		{
			if(view1 == null)
	//*  12   22:aload_3         
	//*  13   23:ifnonnull       27
				return;
	//   14   26:return          
			existingDelegate = ViewHierarchy.getExistingDelegate(view1);
	//   15   27:aload_0         
	//   16   28:aload_3         
	//   17   29:invokestatic    #38  <Method android.view.View$AccessibilityDelegate ViewHierarchy.getExistingDelegate(View)>
	//   18   32:putfield        #40  <Field android.view.View$AccessibilityDelegate existingDelegate>
			mapping = eventbinding;
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:putfield        #42  <Field EventBinding mapping>
			hostView = new WeakReference(((Object) (view1)));
	//   22   40:aload_0         
	//   23   41:new             #44  <Class WeakReference>
	//   24   44:dup             
	//   25   45:aload_3         
	//   26   46:invokespecial   #47  <Method void WeakReference(Object)>
	//   27   49:putfield        #49  <Field WeakReference hostView>
			rootView = new WeakReference(((Object) (view)));
	//   28   52:aload_0         
	//   29   53:new             #44  <Class WeakReference>
	//   30   56:dup             
	//   31   57:aload_2         
	//   32   58:invokespecial   #47  <Method void WeakReference(Object)>
	//   33   61:putfield        #51  <Field WeakReference rootView>
			view = ((View) (eventbinding.getType()));
	//   34   64:aload_1         
	//   35   65:invokevirtual   #57  <Method com.facebook.appevents.codeless.internal.EventBinding$ActionType EventBinding.getType()>
	//   36   68:astore_2        
			switch(CodelessLoggingEventListener._cls1.$SwitchMap$com$facebook$appevents$codeless$internal$EventBinding$ActionType[eventbinding.getType().ordinal()])
	//*  37   69:getstatic       #63  <Field int[] CodelessLoggingEventListener$1.$SwitchMap$com$facebook$appevents$codeless$internal$EventBinding$ActionType>
	//*  38   72:aload_1         
	//*  39   73:invokevirtual   #57  <Method com.facebook.appevents.codeless.internal.EventBinding$ActionType EventBinding.getType()>
	//*  40   76:invokevirtual   #69  <Method int com.facebook.appevents.codeless.internal.EventBinding$ActionType.ordinal()>
	//*  41   79:iaload          
			{
	//*  42   80:tableswitch     1 3: default 108
	//	               1 161
	//	               2 153
	//	               3 144
			default:
				eventbinding = ((EventBinding) (new StringBuilder()));
	//   43  108:new             #71  <Class StringBuilder>
	//   44  111:dup             
	//   45  112:invokespecial   #72  <Method void StringBuilder()>
	//   46  115:astore_1        
				((StringBuilder) (eventbinding)).append("Unsupported action type: ");
	//   47  116:aload_1         
	//   48  117:ldc1            #74  <String "Unsupported action type: ">
	//   49  119:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   50  122:pop             
				((StringBuilder) (eventbinding)).append(((com.facebook.appevents.codeless.internal.EventBinding.ActionType) (view)).toString());
	//   51  123:aload_1         
	//   52  124:aload_2         
	//   53  125:invokevirtual   #82  <Method String com.facebook.appevents.codeless.internal.EventBinding$ActionType.toString()>
	//   54  128:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   55  131:pop             
				throw new FacebookException(((StringBuilder) (eventbinding)).toString());
	//   56  132:new             #84  <Class FacebookException>
	//   57  135:dup             
	//   58  136:aload_1         
	//   59  137:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   60  140:invokespecial   #88  <Method void FacebookException(String)>
	//   61  143:athrow          

			case 3: // '\003'
				accessibilityEventType = 16;
	//   62  144:aload_0         
	//   63  145:bipush          16
	//   64  147:putfield        #90  <Field int accessibilityEventType>
				break;

	//*  65  150:goto            166
			case 2: // '\002'
				accessibilityEventType = 4;
	//   66  153:aload_0         
	//   67  154:iconst_4        
	//   68  155:putfield        #90  <Field int accessibilityEventType>
				break;

	//*  69  158:goto            166
			case 1: // '\001'
				accessibilityEventType = 1;
	//   70  161:aload_0         
	//   71  162:iconst_1        
	//   72  163:putfield        #90  <Field int accessibilityEventType>
				break;
			}
			supportCodelessLogging = true;
	//   73  166:aload_0         
	//   74  167:iconst_1        
	//   75  168:putfield        #28  <Field boolean supportCodelessLogging>
			return;
	//   76  171:return          
		} else
		{
			return;
	//   77  172:return          
		}
	}
}
