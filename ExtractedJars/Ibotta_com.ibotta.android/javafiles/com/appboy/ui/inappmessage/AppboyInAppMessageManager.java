// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.View;
import com.appboy.Appboy;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.enums.inappmessage.Orientation;
import com.appboy.events.IEventSubscriber;
import com.appboy.events.InAppMessageEvent;
import com.appboy.models.*;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.factories.AppboyFullViewFactory;
import com.appboy.ui.inappmessage.factories.AppboyHtmlFullViewFactory;
import com.appboy.ui.inappmessage.factories.AppboyInAppMessageAnimationFactory;
import com.appboy.ui.inappmessage.factories.AppboyModalViewFactory;
import com.appboy.ui.inappmessage.factories.AppboySlideupViewFactory;
import com.appboy.ui.inappmessage.listeners.AppboyDefaultHtmlInAppMessageActionListener;
import com.appboy.ui.inappmessage.listeners.AppboyDefaultInAppMessageManagerListener;
import com.appboy.ui.inappmessage.listeners.AppboyInAppMessageViewLifecycleListener;
import com.appboy.ui.inappmessage.listeners.AppboyInAppMessageWebViewClientListener;
import com.appboy.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.ui.support.ViewUtils;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.appboy.ui.inappmessage:
//			IInAppMessageViewFactory, IInAppMessageAnimationFactory, IInAppMessageImmersiveView, InAppMessageViewWrapper, 
//			IInAppMessageView, IInAppMessageViewWrapper, InAppMessageOperation, AppboyAsyncInAppMessageDisplayer

public final class AppboyInAppMessageManager
{

	public AppboyInAppMessageManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #76  <Class Stack>
	//    4    8:dup             
	//    5    9:invokespecial   #77  <Method void Stack()>
	//    6   12:putfield        #79  <Field Stack mInAppMessageStack>
		mDisplayingInAppMessage = new AtomicBoolean(false);
	//    7   15:aload_0         
	//    8   16:new             #81  <Class AtomicBoolean>
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:invokespecial   #84  <Method void AtomicBoolean(boolean)>
	//   12   24:putfield        #86  <Field AtomicBoolean mDisplayingInAppMessage>
	//   13   27:aload_0         
	//   14   28:new             #88  <Class AppboyInAppMessageWebViewClientListener>
	//   15   31:dup             
	//   16   32:invokespecial   #89  <Method void AppboyInAppMessageWebViewClientListener()>
	//   17   35:putfield        #91  <Field IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener>
	//   18   38:aload_0         
	//   19   39:new             #93  <Class AppboyInAppMessageViewLifecycleListener>
	//   20   42:dup             
	//   21   43:invokespecial   #94  <Method void AppboyInAppMessageViewLifecycleListener()>
	//   22   46:putfield        #96  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
		mDefaultInAppMessageManagerListener = ((IInAppMessageManagerListener) (new AppboyDefaultInAppMessageManagerListener()));
	//   23   49:aload_0         
	//   24   50:new             #98  <Class AppboyDefaultInAppMessageManagerListener>
	//   25   53:dup             
	//   26   54:invokespecial   #99  <Method void AppboyDefaultInAppMessageManagerListener()>
	//   27   57:putfield        #101 <Field IInAppMessageManagerListener mDefaultInAppMessageManagerListener>
		mDefaultHtmlInAppMessageActionListener = ((IHtmlInAppMessageActionListener) (new AppboyDefaultHtmlInAppMessageActionListener()));
	//   28   60:aload_0         
	//   29   61:new             #103 <Class AppboyDefaultHtmlInAppMessageActionListener>
	//   30   64:dup             
	//   31   65:invokespecial   #104 <Method void AppboyDefaultHtmlInAppMessageActionListener()>
	//   32   68:putfield        #106 <Field IHtmlInAppMessageActionListener mDefaultHtmlInAppMessageActionListener>
		mInAppMessageSlideupViewFactory = ((IInAppMessageViewFactory) (new AppboySlideupViewFactory()));
	//   33   71:aload_0         
	//   34   72:new             #108 <Class AppboySlideupViewFactory>
	//   35   75:dup             
	//   36   76:invokespecial   #109 <Method void AppboySlideupViewFactory()>
	//   37   79:putfield        #111 <Field IInAppMessageViewFactory mInAppMessageSlideupViewFactory>
		mInAppMessageModalViewFactory = ((IInAppMessageViewFactory) (new AppboyModalViewFactory()));
	//   38   82:aload_0         
	//   39   83:new             #113 <Class AppboyModalViewFactory>
	//   40   86:dup             
	//   41   87:invokespecial   #114 <Method void AppboyModalViewFactory()>
	//   42   90:putfield        #116 <Field IInAppMessageViewFactory mInAppMessageModalViewFactory>
		mInAppMessageFullViewFactory = ((IInAppMessageViewFactory) (new AppboyFullViewFactory()));
	//   43   93:aload_0         
	//   44   94:new             #118 <Class AppboyFullViewFactory>
	//   45   97:dup             
	//   46   98:invokespecial   #119 <Method void AppboyFullViewFactory()>
	//   47  101:putfield        #121 <Field IInAppMessageViewFactory mInAppMessageFullViewFactory>
		mInAppMessageHtmlFullViewFactory = ((IInAppMessageViewFactory) (new AppboyHtmlFullViewFactory(mInAppMessageWebViewClientListener)));
	//   48  104:aload_0         
	//   49  105:new             #123 <Class AppboyHtmlFullViewFactory>
	//   50  108:dup             
	//   51  109:aload_0         
	//   52  110:getfield        #91  <Field IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener>
	//   53  113:invokespecial   #126 <Method void AppboyHtmlFullViewFactory(IInAppMessageWebViewClientListener)>
	//   54  116:putfield        #128 <Field IInAppMessageViewFactory mInAppMessageHtmlFullViewFactory>
		mInAppMessageAnimationFactory = ((IInAppMessageAnimationFactory) (new AppboyInAppMessageAnimationFactory()));
	//   55  119:aload_0         
	//   56  120:new             #130 <Class AppboyInAppMessageAnimationFactory>
	//   57  123:dup             
	//   58  124:invokespecial   #131 <Method void AppboyInAppMessageAnimationFactory()>
	//   59  127:putfield        #133 <Field IInAppMessageAnimationFactory mInAppMessageAnimationFactory>
	//   60  130:return          
	}

	private IEventSubscriber createInAppMessageEventSubscriber()
	{
		return new IEventSubscriber() {

			public void trigger(InAppMessageEvent inappmessageevent)
			{
				if(getInAppMessageManagerListener().onInAppMessageReceived(inappmessageevent.getInAppMessage()))
			//*   0    0:aload_0         
			//*   1    1:getfield        #18  <Field AppboyInAppMessageManager this$0>
			//*   2    4:invokevirtual   #28  <Method IInAppMessageManagerListener AppboyInAppMessageManager.getInAppMessageManagerListener()>
			//*   3    7:aload_1         
			//*   4    8:invokevirtual   #34  <Method IInAppMessage InAppMessageEvent.getInAppMessage()>
			//*   5   11:invokeinterface #40  <Method boolean IInAppMessageManagerListener.onInAppMessageReceived(IInAppMessage)>
			//*   6   16:ifeq            20
				{
					return;
			//    7   19:return          
				} else
				{
					addInAppMessage(inappmessageevent.getInAppMessage());
			//    8   20:aload_0         
			//    9   21:getfield        #18  <Field AppboyInAppMessageManager this$0>
			//   10   24:aload_1         
			//   11   25:invokevirtual   #34  <Method IInAppMessage InAppMessageEvent.getInAppMessage()>
			//   12   28:invokevirtual   #44  <Method void AppboyInAppMessageManager.addInAppMessage(IInAppMessage)>
					return;
			//   13   31:return          
				}
			}

			public volatile void trigger(Object obj)
			{
				trigger((InAppMessageEvent)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #30  <Class InAppMessageEvent>
			//    3    5:invokevirtual   #47  <Method void trigger(InAppMessageEvent)>
			//    4    8:return          
			}

			final AppboyInAppMessageManager this$0;

			
			{
				this$0 = AppboyInAppMessageManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AppboyInAppMessageManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class AppboyInAppMessageManager$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #138 <Method void AppboyInAppMessageManager$2(AppboyInAppMessageManager)>
	//    4    8:areturn         
	}

	private boolean currentOrientationIsValid(int i, Orientation orientation)
	{
		if(i == 2 && orientation == Orientation.LANDSCAPE)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          23
	//*   3    5:aload_2         
	//*   4    6:getstatic       #148 <Field Orientation Orientation.LANDSCAPE>
	//*   5    9:if_acmpne       23
		{
			AppboyLogger.d(TAG, "Current and preferred orientation are landscape.");
	//    6   12:getstatic       #68  <Field String TAG>
	//    7   15:ldc1            #150 <String "Current and preferred orientation are landscape.">
	//    8   17:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//    9   20:pop             
			return true;
	//   10   21:iconst_1        
	//   11   22:ireturn         
		}
		if(i == 1 && orientation == Orientation.PORTRAIT)
	//*  12   23:iload_1         
	//*  13   24:iconst_1        
	//*  14   25:icmpne          46
	//*  15   28:aload_2         
	//*  16   29:getstatic       #157 <Field Orientation Orientation.PORTRAIT>
	//*  17   32:if_acmpne       46
		{
			AppboyLogger.d(TAG, "Current and preferred orientation are portrait.");
	//   18   35:getstatic       #68  <Field String TAG>
	//   19   38:ldc1            #159 <String "Current and preferred orientation are portrait.">
	//   20   40:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//   21   43:pop             
			return true;
	//   22   44:iconst_1        
	//   23   45:ireturn         
		} else
		{
			String s = TAG;
	//   24   46:getstatic       #68  <Field String TAG>
	//   25   49:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   26   50:new             #161 <Class StringBuilder>
	//   27   53:dup             
	//   28   54:invokespecial   #162 <Method void StringBuilder()>
	//   29   57:astore          4
			stringbuilder.append("Current orientation ");
	//   30   59:aload           4
	//   31   61:ldc1            #164 <String "Current orientation ">
	//   32   63:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
			stringbuilder.append(i);
	//   34   67:aload           4
	//   35   69:iload_1         
	//   36   70:invokevirtual   #171 <Method StringBuilder StringBuilder.append(int)>
	//   37   73:pop             
			stringbuilder.append(" and preferred orientation ");
	//   38   74:aload           4
	//   39   76:ldc1            #173 <String " and preferred orientation ">
	//   40   78:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
			stringbuilder.append(((Object) (orientation)));
	//   42   82:aload           4
	//   43   84:aload_2         
	//   44   85:invokevirtual   #176 <Method StringBuilder StringBuilder.append(Object)>
	//   45   88:pop             
			stringbuilder.append(" don't match");
	//   46   89:aload           4
	//   47   91:ldc1            #178 <String " don't match">
	//   48   93:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   49   96:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   50   97:aload_3         
	//   51   98:aload           4
	//   52  100:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   53  103:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//   54  106:pop             
			return false;
	//   55  107:iconst_0        
	//   56  108:ireturn         
		}
	}

	private IInAppMessageAnimationFactory getInAppMessageAnimationFactory()
	{
		IInAppMessageAnimationFactory iinappmessageanimationfactory = mCustomInAppMessageAnimationFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field IInAppMessageAnimationFactory mCustomInAppMessageAnimationFactory>
	//    2    4:astore_1        
		if(iinappmessageanimationfactory != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return iinappmessageanimationfactory;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return mInAppMessageAnimationFactory;
	//    7   11:aload_0         
	//    8   12:getfield        #133 <Field IInAppMessageAnimationFactory mInAppMessageAnimationFactory>
	//    9   15:areturn         
	}

	private IInAppMessageViewFactory getInAppMessageViewFactory(IInAppMessage iinappmessage)
	{
		IInAppMessageViewFactory iinappmessageviewfactory = mCustomInAppMessageViewFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field IInAppMessageViewFactory mCustomInAppMessageViewFactory>
	//    2    4:astore_2        
		if(iinappmessageviewfactory != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          11
			return iinappmessageviewfactory;
	//    5    9:aload_2         
	//    6   10:areturn         
		if(iinappmessage instanceof InAppMessageSlideup)
	//*   7   11:aload_1         
	//*   8   12:instanceof      #192 <Class InAppMessageSlideup>
	//*   9   15:ifeq            23
			return mInAppMessageSlideupViewFactory;
	//   10   18:aload_0         
	//   11   19:getfield        #111 <Field IInAppMessageViewFactory mInAppMessageSlideupViewFactory>
	//   12   22:areturn         
		if(iinappmessage instanceof InAppMessageModal)
	//*  13   23:aload_1         
	//*  14   24:instanceof      #194 <Class InAppMessageModal>
	//*  15   27:ifeq            35
			return mInAppMessageModalViewFactory;
	//   16   30:aload_0         
	//   17   31:getfield        #116 <Field IInAppMessageViewFactory mInAppMessageModalViewFactory>
	//   18   34:areturn         
		if(iinappmessage instanceof InAppMessageFull)
	//*  19   35:aload_1         
	//*  20   36:instanceof      #196 <Class InAppMessageFull>
	//*  21   39:ifeq            47
			return mInAppMessageFullViewFactory;
	//   22   42:aload_0         
	//   23   43:getfield        #121 <Field IInAppMessageViewFactory mInAppMessageFullViewFactory>
	//   24   46:areturn         
		if(iinappmessage instanceof InAppMessageHtmlFull)
	//*  25   47:aload_1         
	//*  26   48:instanceof      #198 <Class InAppMessageHtmlFull>
	//*  27   51:ifeq            59
			return mInAppMessageHtmlFullViewFactory;
	//   28   54:aload_0         
	//   29   55:getfield        #128 <Field IInAppMessageViewFactory mInAppMessageHtmlFullViewFactory>
	//   30   58:areturn         
		else
			return null;
	//   31   59:aconst_null     
	//   32   60:areturn         
	}

	public static AppboyInAppMessageManager getInstance()
	{
		if(sInstance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #70  <Field AppboyInAppMessageManager sInstance>
	//    1    3:ifnonnull       37
		com/appboy/ui/inappmessage/AppboyInAppMessageManager;
	//    2    6:ldc1            #2   <Class AppboyInAppMessageManager>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(sInstance == null)
	//*   4    9:getstatic       #70  <Field AppboyInAppMessageManager sInstance>
	//*   5   12:ifnonnull       25
			sInstance = new AppboyInAppMessageManager();
	//    6   15:new             #2   <Class AppboyInAppMessageManager>
	//    7   18:dup             
	//    8   19:invokespecial   #201 <Method void AppboyInAppMessageManager()>
	//    9   22:putstatic       #70  <Field AppboyInAppMessageManager sInstance>
		com/appboy/ui/inappmessage/AppboyInAppMessageManager;
	//   10   25:ldc1            #2   <Class AppboyInAppMessageManager>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
		com/appboy/ui/inappmessage/AppboyInAppMessageManager;
	//   14   32:ldc1            #2   <Class AppboyInAppMessageManager>
		JVM INSTR monitorexit ;
	//   15   34:monitorexit     
		throw exception;
	//   16   35:aload_0         
	//   17   36:athrow          
		return sInstance;
	//   18   37:getstatic       #70  <Field AppboyInAppMessageManager sInstance>
	//   19   40:areturn         
	}

	public void addInAppMessage(IInAppMessage iinappmessage)
	{
		mInAppMessageStack.push(((Object) (iinappmessage)));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Stack mInAppMessageStack>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #207 <Method Object Stack.push(Object)>
	//    4    8:pop             
		requestDisplayInAppMessage();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #211 <Method boolean requestDisplayInAppMessage()>
	//    7   13:pop             
	//    8   14:return          
	}

	boolean displayInAppMessage(IInAppMessage iinappmessage, boolean flag)
	{
		if(!mDisplayingInAppMessage.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field AtomicBoolean mDisplayingInAppMessage>
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #219 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifne            32
		{
			AppboyLogger.d(TAG, "A in-app message is currently being displayed. Adding in-app message back on the stack.");
	//    6   12:getstatic       #68  <Field String TAG>
	//    7   15:ldc1            #221 <String "A in-app message is currently being displayed. Adding in-app message back on the stack.">
	//    8   17:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//    9   20:pop             
			mInAppMessageStack.push(((Object) (iinappmessage)));
	//   10   21:aload_0         
	//   11   22:getfield        #79  <Field Stack mInAppMessageStack>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #207 <Method Object Stack.push(Object)>
	//   14   29:pop             
			return false;
	//   15   30:iconst_0        
	//   16   31:ireturn         
		}
		if(mActivity == null)
			break MISSING_BLOCK_LABEL_505;
	//   17   32:aload_0         
	//   18   33:getfield        #223 <Field Activity mActivity>
	//   19   36:ifnull          505
		if(flag)
			break MISSING_BLOCK_LABEL_130;
	//   20   39:iload_2         
	//   21   40:ifne            130
		long l;
		long l1;
		Object obj;
		android.view.animation.Animation animation;
		android.view.animation.Animation animation1;
		Object obj1;
		try
		{
			l = iinappmessage.getExpirationTimestamp();
	//   22   43:aload_1         
	//   23   44:invokeinterface #229 <Method long IInAppMessage.getExpirationTimestamp()>
	//   24   49:lstore_3        
		}
	//*  25   50:lload_3         
	//*  26   51:lconst_0        
	//*  27   52:lcmp            
	//*  28   53:ifle            118
	//*  29   56:invokestatic    #234 <Method long System.currentTimeMillis()>
	//*  30   59:lstore          5
	//*  31   61:lload           5
	//*  32   63:lload_3         
	//*  33   64:lcmp            
	//*  34   65:ifgt            71
	//*  35   68:goto            139
	//*  36   71:new             #161 <Class StringBuilder>
	//*  37   74:dup             
	//*  38   75:invokespecial   #162 <Method void StringBuilder()>
	//*  39   78:astore_1        
	//*  40   79:aload_1         
	//*  41   80:ldc1            #236 <String "In-app message is expired. Doing nothing. Expiration: $">
	//*  42   82:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//*  43   85:pop             
	//*  44   86:aload_1         
	//*  45   87:lload_3         
	//*  46   88:invokevirtual   #239 <Method StringBuilder StringBuilder.append(long)>
	//*  47   91:pop             
	//*  48   92:aload_1         
	//*  49   93:ldc1            #241 <String ". Current time: ">
	//*  50   95:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//*  51   98:pop             
	//*  52   99:aload_1         
	//*  53  100:lload           5
	//*  54  102:invokevirtual   #239 <Method StringBuilder StringBuilder.append(long)>
	//*  55  105:pop             
	//*  56  106:new             #215 <Class Exception>
	//*  57  109:dup             
	//*  58  110:aload_1         
	//*  59  111:invokevirtual   #182 <Method String StringBuilder.toString()>
	//*  60  114:invokespecial   #244 <Method void Exception(String)>
	//*  61  117:athrow          
	//*  62  118:getstatic       #68  <Field String TAG>
	//*  63  121:ldc1            #246 <String "Expiration timestamp not defined. Continuing.">
	//*  64  123:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//*  65  126:pop             
	//*  66  127:goto            139
	//*  67  130:getstatic       #68  <Field String TAG>
	//*  68  133:ldc1            #248 <String "Not checking expiration status for carry-over in-app message.">
	//*  69  135:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//*  70  138:pop             
	//*  71  139:aload_0         
	//*  72  140:aload_1         
	//*  73  141:invokevirtual   #252 <Method boolean verifyOrientationStatus(IInAppMessage)>
	//*  74  144:ifeq            494
	//*  75  147:aload_1         
	//*  76  148:invokeinterface #255 <Method boolean IInAppMessage.isControl()>
	//*  77  153:ifeq            179
	//*  78  156:getstatic       #68  <Field String TAG>
	//*  79  159:ldc2            #257 <String "Not displaying control in-app message. Logging impression and ending display execution.">
	//*  80  162:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//*  81  165:pop             
	//*  82  166:aload_1         
	//*  83  167:invokeinterface #260 <Method boolean IInAppMessage.logImpression()>
	//*  84  172:pop             
	//*  85  173:aload_0         
	//*  86  174:invokevirtual   #263 <Method void resetAfterInAppMessageClose()>
	//*  87  177:iconst_1        
	//*  88  178:ireturn         
	//*  89  179:aload_0         
	//*  90  180:aload_1         
	//*  91  181:invokespecial   #265 <Method IInAppMessageViewFactory getInAppMessageViewFactory(IInAppMessage)>
	//*  92  184:astore          7
	//*  93  186:aload           7
	//*  94  188:ifnull          473
	//*  95  191:aload           7
	//*  96  193:aload_0         
	//*  97  194:getfield        #223 <Field Activity mActivity>
	//*  98  197:aload_1         
	//*  99  198:invokeinterface #271 <Method View IInAppMessageViewFactory.createInAppMessageView(Activity, IInAppMessage)>
	//* 100  203:astore          7
	//* 101  205:aload           7
	//* 102  207:ifnull          452
	//* 103  210:aload           7
	//* 104  212:invokevirtual   #277 <Method android.view.ViewParent View.getParent()>
	//* 105  215:ifnonnull       431
	//* 106  218:aload_0         
	//* 107  219:invokespecial   #279 <Method IInAppMessageAnimationFactory getInAppMessageAnimationFactory()>
	//* 108  222:aload_1         
	//* 109  223:invokeinterface #285 <Method android.view.animation.Animation IInAppMessageAnimationFactory.getOpeningAnimation(IInAppMessage)>
	//* 110  228:astore          8
	//* 111  230:aload_0         
	//* 112  231:invokespecial   #279 <Method IInAppMessageAnimationFactory getInAppMessageAnimationFactory()>
	//* 113  234:aload_1         
	//* 114  235:invokeinterface #288 <Method android.view.animation.Animation IInAppMessageAnimationFactory.getClosingAnimation(IInAppMessage)>
	//* 115  240:astore          9
	//* 116  242:aload           7
	//* 117  244:instanceof      #290 <Class IInAppMessageImmersiveView>
	//* 118  247:ifeq            317
	//* 119  250:getstatic       #68  <Field String TAG>
	//* 120  253:ldc2            #292 <String "Creating view wrapper for immersive in-app message.">
	//* 121  256:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//* 122  259:pop             
	//* 123  260:aload           7
	//* 124  262:checkcast       #290 <Class IInAppMessageImmersiveView>
	//* 125  265:astore          10
	//* 126  267:aload_0         
	//* 127  268:new             #294 <Class InAppMessageViewWrapper>
	//* 128  271:dup             
	//* 129  272:aload           7
	//* 130  274:aload_1         
	//* 131  275:aload_0         
	//* 132  276:getfield        #96  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
	//* 133  279:aload_0         
	//* 134  280:getfield        #296 <Field AppboyConfigurationProvider mAppboyConfigurationProvider>
	//* 135  283:aload           8
	//* 136  285:aload           9
	//* 137  287:aload           10
	//* 138  289:invokeinterface #300 <Method View IInAppMessageImmersiveView.getMessageClickableView()>
	//* 139  294:aload           10
	//* 140  296:invokeinterface #304 <Method java.util.List IInAppMessageImmersiveView.getMessageButtonViews()>
	//* 141  301:aload           10
	//* 142  303:invokeinterface #307 <Method View IInAppMessageImmersiveView.getMessageCloseButtonView()>
	//* 143  308:invokespecial   #310 <Method void InAppMessageViewWrapper(View, IInAppMessage, IInAppMessageViewLifecycleListener, AppboyConfigurationProvider, android.view.animation.Animation, android.view.animation.Animation, View, java.util.List, View)>
	//* 144  311:putfield        #312 <Field IInAppMessageViewWrapper mInAppMessageViewWrapper>
	//* 145  314:goto            416
	//* 146  317:aload           7
	//* 147  319:instanceof      #314 <Class IInAppMessageView>
	//* 148  322:ifeq            378
	//* 149  325:getstatic       #68  <Field String TAG>
	//* 150  328:ldc2            #316 <String "Creating view wrapper for base in-app message.">
	//* 151  331:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//* 152  334:pop             
	//* 153  335:aload           7
	//* 154  337:checkcast       #314 <Class IInAppMessageView>
	//* 155  340:astore          10
	//* 156  342:aload_0         
	//* 157  343:new             #294 <Class InAppMessageViewWrapper>
	//* 158  346:dup             
	//* 159  347:aload           7
	//* 160  349:aload_1         
	//* 161  350:aload_0         
	//* 162  351:getfield        #96  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
	//* 163  354:aload_0         
	//* 164  355:getfield        #296 <Field AppboyConfigurationProvider mAppboyConfigurationProvider>
	//* 165  358:aload           8
	//* 166  360:aload           9
	//* 167  362:aload           10
	//* 168  364:invokeinterface #317 <Method View IInAppMessageView.getMessageClickableView()>
	//* 169  369:invokespecial   #320 <Method void InAppMessageViewWrapper(View, IInAppMessage, IInAppMessageViewLifecycleListener, AppboyConfigurationProvider, android.view.animation.Animation, android.view.animation.Animation, View)>
	//* 170  372:putfield        #312 <Field IInAppMessageViewWrapper mInAppMessageViewWrapper>
	//* 171  375:goto            416
	//* 172  378:getstatic       #68  <Field String TAG>
	//* 173  381:ldc2            #322 <String "Creating view wrapper for in-app message.">
	//* 174  384:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//* 175  387:pop             
	//* 176  388:aload_0         
	//* 177  389:new             #294 <Class InAppMessageViewWrapper>
	//* 178  392:dup             
	//* 179  393:aload           7
	//* 180  395:aload_1         
	//* 181  396:aload_0         
	//* 182  397:getfield        #96  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
	//* 183  400:aload_0         
	//* 184  401:getfield        #296 <Field AppboyConfigurationProvider mAppboyConfigurationProvider>
	//* 185  404:aload           8
	//* 186  406:aload           9
	//* 187  408:aload           7
	//* 188  410:invokespecial   #320 <Method void InAppMessageViewWrapper(View, IInAppMessage, IInAppMessageViewLifecycleListener, AppboyConfigurationProvider, android.view.animation.Animation, android.view.animation.Animation, View)>
	//* 189  413:putfield        #312 <Field IInAppMessageViewWrapper mInAppMessageViewWrapper>
	//* 190  416:aload_0         
	//* 191  417:getfield        #312 <Field IInAppMessageViewWrapper mInAppMessageViewWrapper>
	//* 192  420:aload_0         
	//* 193  421:getfield        #223 <Field Activity mActivity>
	//* 194  424:invokeinterface #328 <Method void IInAppMessageViewWrapper.open(Activity)>
	//* 195  429:iconst_1        
	//* 196  430:ireturn         
	//* 197  431:aload_1         
	//* 198  432:getstatic       #334 <Field InAppMessageFailureType InAppMessageFailureType.DISPLAY_VIEW_GENERATION>
	//* 199  435:invokeinterface #338 <Method boolean IInAppMessage.logDisplayFailure(InAppMessageFailureType)>
	//* 200  440:pop             
	//* 201  441:new             #215 <Class Exception>
	//* 202  444:dup             
	//* 203  445:ldc2            #340 <String "The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.">
	//* 204  448:invokespecial   #244 <Method void Exception(String)>
	//* 205  451:athrow          
	//* 206  452:aload_1         
	//* 207  453:getstatic       #334 <Field InAppMessageFailureType InAppMessageFailureType.DISPLAY_VIEW_GENERATION>
	//* 208  456:invokeinterface #338 <Method boolean IInAppMessage.logDisplayFailure(InAppMessageFailureType)>
	//* 209  461:pop             
	//* 210  462:new             #215 <Class Exception>
	//* 211  465:dup             
	//* 212  466:ldc2            #342 <String "The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.">
	//* 213  469:invokespecial   #244 <Method void Exception(String)>
	//* 214  472:athrow          
	//* 215  473:aload_1         
	//* 216  474:getstatic       #334 <Field InAppMessageFailureType InAppMessageFailureType.DISPLAY_VIEW_GENERATION>
	//* 217  477:invokeinterface #338 <Method boolean IInAppMessage.logDisplayFailure(InAppMessageFailureType)>
	//* 218  482:pop             
	//* 219  483:new             #215 <Class Exception>
	//* 220  486:dup             
	//* 221  487:ldc2            #344 <String "ViewFactory from getInAppMessageViewFactory was null.">
	//* 222  490:invokespecial   #244 <Method void Exception(String)>
	//* 223  493:athrow          
	//* 224  494:new             #215 <Class Exception>
	//* 225  497:dup             
	//* 226  498:ldc2            #346 <String "Current orientation did not match specified orientation for in-app message. Doing nothing.">
	//* 227  501:invokespecial   #244 <Method void Exception(String)>
	//* 228  504:athrow          
	//* 229  505:aload_0         
	//* 230  506:aload_1         
	//* 231  507:putfield        #348 <Field IInAppMessage mCarryoverInAppMessage>
	//* 232  510:new             #215 <Class Exception>
	//* 233  513:dup             
	//* 234  514:ldc2            #350 <String "No activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.">
	//* 235  517:invokespecial   #244 <Method void Exception(String)>
	//* 236  520:athrow          
		// Misplaced declaration of an exception variable
		catch(IInAppMessage iinappmessage)
	//* 237  521:astore_1        
		{
			AppboyLogger.e(TAG, "Could not display in-app message", ((Throwable) (iinappmessage)));
	//  238  522:getstatic       #68  <Field String TAG>
	//  239  525:ldc2            #352 <String "Could not display in-app message">
	//  240  528:aload_1         
	//  241  529:invokestatic    #356 <Method int AppboyLogger.e(String, String, Throwable)>
	//  242  532:pop             
			resetAfterInAppMessageClose();
	//  243  533:aload_0         
	//  244  534:invokevirtual   #263 <Method void resetAfterInAppMessageClose()>
			return false;
	//  245  537:iconst_0        
	//  246  538:ireturn         
		}
		if(l <= 0L)
			break MISSING_BLOCK_LABEL_118;
		l1 = System.currentTimeMillis();
		if(l1 <= l)
			break MISSING_BLOCK_LABEL_139;
		iinappmessage = ((IInAppMessage) (new StringBuilder()));
		((StringBuilder) (iinappmessage)).append("In-app message is expired. Doing nothing. Expiration: $");
		((StringBuilder) (iinappmessage)).append(l);
		((StringBuilder) (iinappmessage)).append(". Current time: ");
		((StringBuilder) (iinappmessage)).append(l1);
		throw new Exception(((StringBuilder) (iinappmessage)).toString());
		AppboyLogger.d(TAG, "Expiration timestamp not defined. Continuing.");
		break MISSING_BLOCK_LABEL_139;
		AppboyLogger.d(TAG, "Not checking expiration status for carry-over in-app message.");
		if(!verifyOrientationStatus(iinappmessage))
			break MISSING_BLOCK_LABEL_494;
		if(!iinappmessage.isControl())
			break MISSING_BLOCK_LABEL_179;
		AppboyLogger.d(TAG, "Not displaying control in-app message. Logging impression and ending display execution.");
		iinappmessage.logImpression();
		resetAfterInAppMessageClose();
		return true;
		obj = ((Object) (getInAppMessageViewFactory(iinappmessage)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_473;
		obj = ((Object) (((IInAppMessageViewFactory) (obj)).createInAppMessageView(mActivity, iinappmessage)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_452;
		if(((View) (obj)).getParent() != null)
			break MISSING_BLOCK_LABEL_431;
		animation = getInAppMessageAnimationFactory().getOpeningAnimation(iinappmessage);
		animation1 = getInAppMessageAnimationFactory().getClosingAnimation(iinappmessage);
		if(obj instanceof IInAppMessageImmersiveView)
		{
			AppboyLogger.d(TAG, "Creating view wrapper for immersive in-app message.");
			obj1 = ((Object) ((IInAppMessageImmersiveView)obj));
			mInAppMessageViewWrapper = ((IInAppMessageViewWrapper) (new InAppMessageViewWrapper(((View) (obj)), iinappmessage, mInAppMessageViewLifecycleListener, mAppboyConfigurationProvider, animation, animation1, ((IInAppMessageImmersiveView) (obj1)).getMessageClickableView(), ((IInAppMessageImmersiveView) (obj1)).getMessageButtonViews(), ((IInAppMessageImmersiveView) (obj1)).getMessageCloseButtonView())));
			break MISSING_BLOCK_LABEL_416;
		}
		if(obj instanceof IInAppMessageView)
		{
			AppboyLogger.d(TAG, "Creating view wrapper for base in-app message.");
			obj1 = ((Object) ((IInAppMessageView)obj));
			mInAppMessageViewWrapper = ((IInAppMessageViewWrapper) (new InAppMessageViewWrapper(((View) (obj)), iinappmessage, mInAppMessageViewLifecycleListener, mAppboyConfigurationProvider, animation, animation1, ((IInAppMessageView) (obj1)).getMessageClickableView())));
			break MISSING_BLOCK_LABEL_416;
		}
		AppboyLogger.d(TAG, "Creating view wrapper for in-app message.");
		mInAppMessageViewWrapper = ((IInAppMessageViewWrapper) (new InAppMessageViewWrapper(((View) (obj)), iinappmessage, mInAppMessageViewLifecycleListener, mAppboyConfigurationProvider, animation, animation1, ((View) (obj)))));
		mInAppMessageViewWrapper.open(mActivity);
		return true;
		iinappmessage.logDisplayFailure(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
		throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
		iinappmessage.logDisplayFailure(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
		throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
		iinappmessage.logDisplayFailure(InAppMessageFailureType.DISPLAY_VIEW_GENERATION);
		throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
		throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
		mCarryoverInAppMessage = iinappmessage;
		throw new Exception("No activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.");
	}

	public void ensureSubscribedToInAppMessageEvents(Context context)
	{
		if(mInAppMessageEventSubscriber == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #360 <Field IEventSubscriber mInAppMessageEventSubscriber>
	//*   2    4:ifnonnull       36
		{
			AppboyLogger.d(TAG, "Subscribing in-app message event subscriber");
	//    3    7:getstatic       #68  <Field String TAG>
	//    4   10:ldc2            #362 <String "Subscribing in-app message event subscriber">
	//    5   13:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//    6   16:pop             
			mInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:invokespecial   #364 <Method IEventSubscriber createInAppMessageEventSubscriber()>
	//   10   22:putfield        #360 <Field IEventSubscriber mInAppMessageEventSubscriber>
			Appboy.getInstance(context).subscribeToNewInAppMessages(mInAppMessageEventSubscriber);
	//   11   25:aload_1         
	//   12   26:invokestatic    #369 <Method Appboy Appboy.getInstance(Context)>
	//   13   29:aload_0         
	//   14   30:getfield        #360 <Field IEventSubscriber mInAppMessageEventSubscriber>
	//   15   33:invokevirtual   #373 <Method void Appboy.subscribeToNewInAppMessages(IEventSubscriber)>
		}
	//   16   36:return          
	}

	public Activity getActivity()
	{
		return mActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field Activity mActivity>
	//    2    4:areturn         
	}

	public Context getApplicationContext()
	{
		return mApplicationContext;
	//    0    0:aload_0         
	//    1    1:getfield        #379 <Field Context mApplicationContext>
	//    2    4:areturn         
	}

	public IInAppMessageManagerListener getControlInAppMessageManagerListener()
	{
		IInAppMessageManagerListener iinappmessagemanagerlistener = mCustomControlInAppMessageManagerListener;
	//    0    0:aload_0         
	//    1    1:getfield        #383 <Field IInAppMessageManagerListener mCustomControlInAppMessageManagerListener>
	//    2    4:astore_1        
		if(iinappmessagemanagerlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return iinappmessagemanagerlistener;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return mDefaultInAppMessageManagerListener;
	//    7   11:aload_0         
	//    8   12:getfield        #101 <Field IInAppMessageManagerListener mDefaultInAppMessageManagerListener>
	//    9   15:areturn         
	}

	public IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener()
	{
		IHtmlInAppMessageActionListener ihtmlinappmessageactionlistener = mCustomHtmlInAppMessageActionListener;
	//    0    0:aload_0         
	//    1    1:getfield        #387 <Field IHtmlInAppMessageActionListener mCustomHtmlInAppMessageActionListener>
	//    2    4:astore_1        
		if(ihtmlinappmessageactionlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ihtmlinappmessageactionlistener;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return mDefaultHtmlInAppMessageActionListener;
	//    7   11:aload_0         
	//    8   12:getfield        #106 <Field IHtmlInAppMessageActionListener mDefaultHtmlInAppMessageActionListener>
	//    9   15:areturn         
	}

	public IInAppMessageManagerListener getInAppMessageManagerListener()
	{
		IInAppMessageManagerListener iinappmessagemanagerlistener = mCustomInAppMessageManagerListener;
	//    0    0:aload_0         
	//    1    1:getfield        #390 <Field IInAppMessageManagerListener mCustomInAppMessageManagerListener>
	//    2    4:astore_1        
		if(iinappmessagemanagerlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return iinappmessagemanagerlistener;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return mDefaultInAppMessageManagerListener;
	//    7   11:aload_0         
	//    8   12:getfield        #101 <Field IInAppMessageManagerListener mDefaultInAppMessageManagerListener>
	//    9   15:areturn         
	}

	public void hideCurrentlyDisplayingInAppMessage(boolean flag)
	{
		IInAppMessageViewWrapper iinappmessageviewwrapper = mInAppMessageViewWrapper;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field IInAppMessageViewWrapper mInAppMessageViewWrapper>
	//    2    4:astore_2        
		if(iinappmessageviewwrapper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          40
		{
			if(flag)
	//*   5    9:iload_1         
	//*   6   10:ifeq            34
				mInAppMessageViewLifecycleListener.onDismissed(iinappmessageviewwrapper.getInAppMessageView(), iinappmessageviewwrapper.getInAppMessage());
	//    7   13:aload_0         
	//    8   14:getfield        #96  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
	//    9   17:aload_2         
	//   10   18:invokeinterface #394 <Method View IInAppMessageViewWrapper.getInAppMessageView()>
	//   11   23:aload_2         
	//   12   24:invokeinterface #398 <Method IInAppMessage IInAppMessageViewWrapper.getInAppMessage()>
	//   13   29:invokeinterface #404 <Method void IInAppMessageViewLifecycleListener.onDismissed(View, IInAppMessage)>
			iinappmessageviewwrapper.close();
	//   14   34:aload_2         
	//   15   35:invokeinterface #407 <Method void IInAppMessageViewWrapper.close()>
		}
	//   16   40:return          
	}

	public void registerInAppMessageManager(Activity activity)
	{
		AppboyLogger.d(TAG, "registerInAppMessageManager called");
	//    0    0:getstatic       #68  <Field String TAG>
	//    1    3:ldc2            #410 <String "registerInAppMessageManager called">
	//    2    6:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		mActivity = activity;
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:putfield        #223 <Field Activity mActivity>
		activity = mActivity;
	//    7   15:aload_0         
	//    8   16:getfield        #223 <Field Activity mActivity>
	//    9   19:astore_1        
		if(activity != null && mApplicationContext == null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          39
	//*  12   24:aload_0         
	//*  13   25:getfield        #379 <Field Context mApplicationContext>
	//*  14   28:ifnonnull       39
			mApplicationContext = activity.getApplicationContext();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #414 <Method Context Activity.getApplicationContext()>
	//   18   36:putfield        #379 <Field Context mApplicationContext>
		if(mAppboyConfigurationProvider == null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #296 <Field AppboyConfigurationProvider mAppboyConfigurationProvider>
	//*  21   43:ifnonnull       61
			mAppboyConfigurationProvider = new AppboyConfigurationProvider(mApplicationContext);
	//   22   46:aload_0         
	//   23   47:new             #416 <Class AppboyConfigurationProvider>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:getfield        #379 <Field Context mApplicationContext>
	//   27   55:invokespecial   #418 <Method void AppboyConfigurationProvider(Context)>
	//   28   58:putfield        #296 <Field AppboyConfigurationProvider mAppboyConfigurationProvider>
		if(mCarryoverInAppMessage != null)
	//*  29   61:aload_0         
	//*  30   62:getfield        #348 <Field IInAppMessage mCarryoverInAppMessage>
	//*  31   65:ifnull          106
		{
			AppboyLogger.d(TAG, "Requesting display of carryover in-app message.");
	//   32   68:getstatic       #68  <Field String TAG>
	//   33   71:ldc2            #420 <String "Requesting display of carryover in-app message.">
	//   34   74:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//   35   77:pop             
			mCarryoverInAppMessage.setAnimateIn(false);
	//   36   78:aload_0         
	//   37   79:getfield        #348 <Field IInAppMessage mCarryoverInAppMessage>
	//   38   82:iconst_0        
	//   39   83:invokeinterface #423 <Method void IInAppMessage.setAnimateIn(boolean)>
			displayInAppMessage(mCarryoverInAppMessage, true);
	//   40   88:aload_0         
	//   41   89:aload_0         
	//   42   90:getfield        #348 <Field IInAppMessage mCarryoverInAppMessage>
	//   43   93:iconst_1        
	//   44   94:invokevirtual   #425 <Method boolean displayInAppMessage(IInAppMessage, boolean)>
	//   45   97:pop             
			mCarryoverInAppMessage = null;
	//   46   98:aload_0         
	//   47   99:aconst_null     
	//   48  100:putfield        #348 <Field IInAppMessage mCarryoverInAppMessage>
		} else
	//*  49  103:goto            136
		if(mUnRegisteredInAppMessage != null)
	//*  50  106:aload_0         
	//*  51  107:getfield        #427 <Field IInAppMessage mUnRegisteredInAppMessage>
	//*  52  110:ifnull          136
		{
			AppboyLogger.d(TAG, "Adding previously unregistered in-app message.");
	//   53  113:getstatic       #68  <Field String TAG>
	//   54  116:ldc2            #429 <String "Adding previously unregistered in-app message.">
	//   55  119:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//   56  122:pop             
			addInAppMessage(mUnRegisteredInAppMessage);
	//   57  123:aload_0         
	//   58  124:aload_0         
	//   59  125:getfield        #427 <Field IInAppMessage mUnRegisteredInAppMessage>
	//   60  128:invokevirtual   #431 <Method void addInAppMessage(IInAppMessage)>
			mUnRegisteredInAppMessage = null;
	//   61  131:aload_0         
	//   62  132:aconst_null     
	//   63  133:putfield        #427 <Field IInAppMessage mUnRegisteredInAppMessage>
		}
		ensureSubscribedToInAppMessageEvents(mApplicationContext);
	//   64  136:aload_0         
	//   65  137:aload_0         
	//   66  138:getfield        #379 <Field Context mApplicationContext>
	//   67  141:invokevirtual   #433 <Method void ensureSubscribedToInAppMessageEvents(Context)>
	//   68  144:return          
	}

	public boolean requestDisplayInAppMessage()
	{
		if(mActivity != null)
			break MISSING_BLOCK_LABEL_55;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field Activity mActivity>
	//    2    4:ifnonnull       55
		if(mInAppMessageStack.empty())
			break MISSING_BLOCK_LABEL_43;
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field Stack mInAppMessageStack>
	//    5   11:invokevirtual   #436 <Method boolean Stack.empty()>
	//    6   14:ifne            43
		AppboyLogger.w(TAG, "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.");
	//    7   17:getstatic       #68  <Field String TAG>
	//    8   20:ldc2            #438 <String "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.">
	//    9   23:invokestatic    #441 <Method int AppboyLogger.w(String, String)>
	//   10   26:pop             
		mUnRegisteredInAppMessage = (IInAppMessage)mInAppMessageStack.pop();
	//   11   27:aload_0         
	//   12   28:aload_0         
	//   13   29:getfield        #79  <Field Stack mInAppMessageStack>
	//   14   32:invokevirtual   #445 <Method Object Stack.pop()>
	//   15   35:checkcast       #225 <Class IInAppMessage>
	//   16   38:putfield        #427 <Field IInAppMessage mUnRegisteredInAppMessage>
		return false;
	//   17   41:iconst_0        
	//   18   42:ireturn         
		static class _cls3
		{

			static final int $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[];

			static 
			{
				$SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation = new int[InAppMessageOperation.values().length];
			//    0    0:invokestatic    #18  <Method InAppMessageOperation[] InAppMessageOperation.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation>
				try
				{
					$SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation>
			//    5   12:getstatic       #24  <Field InAppMessageOperation InAppMessageOperation.DISPLAY_NOW>
			//    6   15:invokevirtual   #28  <Method int InAppMessageOperation.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation>
			//*  10   23:getstatic       #31  <Field InAppMessageOperation InAppMessageOperation.DISPLAY_LATER>
			//*  11   26:invokevirtual   #28  <Method int InAppMessageOperation.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation>
			//*  15   34:getstatic       #34  <Field InAppMessageOperation InAppMessageOperation.DISCARD>
			//*  16   37:invokevirtual   #28  <Method int InAppMessageOperation.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISCARD.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		Object obj;
		final IInAppMessage inAppMessage;
		try
		{
			AppboyLogger.d(TAG, "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.");
	//   19   43:getstatic       #68  <Field String TAG>
	//   20   46:ldc2            #447 <String "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.">
	//   21   49:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//   22   52:pop             
		}
	//*  23   53:iconst_0        
	//*  24   54:ireturn         
	//*  25   55:aload_0         
	//*  26   56:getfield        #86  <Field AtomicBoolean mDisplayingInAppMessage>
	//*  27   59:invokevirtual   #450 <Method boolean AtomicBoolean.get()>
	//*  28   62:ifeq            77
	//*  29   65:getstatic       #68  <Field String TAG>
	//*  30   68:ldc2            #452 <String "A in-app message is currently being displayed. Ignoring request to display in-app message.">
	//*  31   71:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//*  32   74:pop             
	//*  33   75:iconst_0        
	//*  34   76:ireturn         
	//*  35   77:aload_0         
	//*  36   78:getfield        #79  <Field Stack mInAppMessageStack>
	//*  37   81:invokevirtual   #455 <Method boolean Stack.isEmpty()>
	//*  38   84:ifeq            99
	//*  39   87:getstatic       #68  <Field String TAG>
	//*  40   90:ldc2            #457 <String "The in-app message stack is empty. No in-app message will be displayed.">
	//*  41   93:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//*  42   96:pop             
	//*  43   97:iconst_0        
	//*  44   98:ireturn         
	//*  45   99:aload_0         
	//*  46  100:getfield        #79  <Field Stack mInAppMessageStack>
	//*  47  103:invokevirtual   #445 <Method Object Stack.pop()>
	//*  48  106:checkcast       #225 <Class IInAppMessage>
	//*  49  109:astore_2        
	//*  50  110:aload_2         
	//*  51  111:invokeinterface #255 <Method boolean IInAppMessage.isControl()>
	//*  52  116:ifne            133
	//*  53  119:aload_0         
	//*  54  120:invokevirtual   #459 <Method IInAppMessageManagerListener getInAppMessageManagerListener()>
	//*  55  123:aload_2         
	//*  56  124:invokeinterface #465 <Method InAppMessageOperation IInAppMessageManagerListener.beforeInAppMessageDisplayed(IInAppMessage)>
	//*  57  129:astore_1        
	//*  58  130:goto            154
	//*  59  133:getstatic       #68  <Field String TAG>
	//*  60  136:ldc2            #467 <String "Using the control in-app message manager listener.">
	//*  61  139:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//*  62  142:pop             
	//*  63  143:aload_0         
	//*  64  144:invokevirtual   #469 <Method IInAppMessageManagerListener getControlInAppMessageManagerListener()>
	//*  65  147:aload_2         
	//*  66  148:invokeinterface #465 <Method InAppMessageOperation IInAppMessageManagerListener.beforeInAppMessageDisplayed(IInAppMessage)>
	//*  67  153:astore_1        
	//*  68  154:getstatic       #473 <Field int[] AppboyInAppMessageManager$3.$SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation>
	//*  69  157:aload_1         
	//*  70  158:invokevirtual   #479 <Method int InAppMessageOperation.ordinal()>
	//*  71  161:iaload          
	//*  72  162:tableswitch     1 3: default 291
	//	               1 228
	//	               2 207
	//	               3 195
	//*  73  188:getstatic       #68  <Field String TAG>
	//*  74  191:astore_1        
	//*  75  192:goto            267
	//*  76  195:getstatic       #68  <Field String TAG>
	//*  77  198:ldc2            #481 <String "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.">
	//*  78  201:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//*  79  204:pop             
	//*  80  205:iconst_0        
	//*  81  206:ireturn         
	//*  82  207:getstatic       #68  <Field String TAG>
	//*  83  210:ldc2            #483 <String "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.">
	//*  84  213:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//*  85  216:pop             
	//*  86  217:aload_0         
	//*  87  218:getfield        #79  <Field Stack mInAppMessageStack>
	//*  88  221:aload_2         
	//*  89  222:invokevirtual   #207 <Method Object Stack.push(Object)>
	//*  90  225:pop             
	//*  91  226:iconst_0        
	//*  92  227:ireturn         
	//*  93  228:getstatic       #68  <Field String TAG>
	//*  94  231:ldc2            #485 <String "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.">
	//*  95  234:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//*  96  237:pop             
	//*  97  238:new             #487 <Class Handler>
	//*  98  241:dup             
	//*  99  242:aload_0         
	//* 100  243:getfield        #379 <Field Context mApplicationContext>
	//* 101  246:invokevirtual   #493 <Method android.os.Looper Context.getMainLooper()>
	//* 102  249:invokespecial   #496 <Method void Handler(android.os.Looper)>
	//* 103  252:new             #6   <Class AppboyInAppMessageManager$1>
	//* 104  255:dup             
	//* 105  256:aload_0         
	//* 106  257:aload_2         
	//* 107  258:invokespecial   #499 <Method void AppboyInAppMessageManager$1(AppboyInAppMessageManager, IInAppMessage)>
	//* 108  261:invokevirtual   #503 <Method boolean Handler.post(Runnable)>
	//* 109  264:pop             
	//* 110  265:iconst_1        
	//* 111  266:ireturn         
	//* 112  267:aload_1         
	//* 113  268:ldc2            #505 <String "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned null instead of a InAppMessageOperation. Ignoring the in-app message. Please check the IInAppMessageStackBehaviour implementation.">
	//* 114  271:invokestatic    #507 <Method int AppboyLogger.e(String, String)>
	//* 115  274:pop             
	//* 116  275:iconst_0        
	//* 117  276:ireturn         
		catch(Exception exception)
	//* 118  277:astore_1        
		{
			AppboyLogger.e(TAG, "Error running requestDisplayInAppMessage", ((Throwable) (exception)));
	//  119  278:getstatic       #68  <Field String TAG>
	//  120  281:ldc2            #509 <String "Error running requestDisplayInAppMessage">
	//  121  284:aload_1         
	//  122  285:invokestatic    #356 <Method int AppboyLogger.e(String, String, Throwable)>
	//  123  288:pop             
			return false;
	//  124  289:iconst_0        
	//  125  290:ireturn         
		}
		return false;
		if(!mDisplayingInAppMessage.get())
			break MISSING_BLOCK_LABEL_77;
		AppboyLogger.d(TAG, "A in-app message is currently being displayed. Ignoring request to display in-app message.");
		return false;
		if(!mInAppMessageStack.isEmpty())
			break MISSING_BLOCK_LABEL_99;
		AppboyLogger.d(TAG, "The in-app message stack is empty. No in-app message will be displayed.");
		return false;
		inAppMessage = (IInAppMessage)mInAppMessageStack.pop();
		if(!inAppMessage.isControl())
		{
			obj = ((Object) (getInAppMessageManagerListener().beforeInAppMessageDisplayed(inAppMessage)));
			break MISSING_BLOCK_LABEL_154;
		}
		AppboyLogger.d(TAG, "Using the control in-app message manager listener.");
		obj = ((Object) (getControlInAppMessageManagerListener().beforeInAppMessageDisplayed(inAppMessage)));
		_cls3..SwitchMap.com.appboy.ui.inappmessage.InAppMessageOperation[((InAppMessageOperation) (obj)).ordinal()];
		JVM INSTR tableswitch 1 3: default 291
	//	               1 228
	//	               2 207
	//	               3 195;
		   goto _L1 _L2 _L3 _L4
_L1:
		obj = ((Object) (TAG));
		  goto _L5
_L4:
		AppboyLogger.d(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.");
		return false;
_L3:
		AppboyLogger.d(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.");
		mInAppMessageStack.push(((Object) (inAppMessage)));
		return false;
_L2:
		AppboyLogger.d(TAG, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.");
		(new Handler(mApplicationContext.getMainLooper())).post(new Runnable() {

			public void run()
			{
				AppboyAsyncInAppMessageDisplayer appboyasyncinappmessagedisplayer = new AppboyAsyncInAppMessageDisplayer();
			//    0    0:new             #29  <Class AppboyAsyncInAppMessageDisplayer>
			//    1    3:dup             
			//    2    4:invokespecial   #30  <Method void AppboyAsyncInAppMessageDisplayer()>
			//    3    7:astore_1        
				IInAppMessage aiinappmessage[] = new IInAppMessage[1];
			//    4    8:iconst_1        
			//    5    9:anewarray       IInAppMessage[]
			//    6   12:astore_2        
				aiinappmessage[0] = inAppMessage;
			//    7   13:aload_2         
			//    8   14:iconst_0        
			//    9   15:aload_0         
			//   10   16:getfield        #22  <Field IInAppMessage val$inAppMessage>
			//   11   19:aastore         
				if(!(appboyasyncinappmessagedisplayer instanceof AsyncTask))
			//*  12   20:aload_1         
			//*  13   21:instanceof      #34  <Class AsyncTask>
			//*  14   24:ifne            34
				{
					appboyasyncinappmessagedisplayer.execute(((Object []) (aiinappmessage)));
			//   15   27:aload_1         
			//   16   28:aload_2         
			//   17   29:invokevirtual   #38  <Method AsyncTask AppboyAsyncInAppMessageDisplayer.execute(Object[])>
			//   18   32:pop             
					return;
			//   19   33:return          
				} else
				{
					AsyncTaskInstrumentation.execute((AsyncTask)appboyasyncinappmessagedisplayer, ((Object []) (aiinappmessage)));
			//   20   34:aload_1         
			//   21   35:checkcast       #34  <Class AsyncTask>
			//   22   38:aload_2         
			//   23   39:invokestatic    #43  <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
			//   24   42:pop             
					return;
			//   25   43:return          
				}
			}

			final AppboyInAppMessageManager this$0;
			final IInAppMessage val$inAppMessage;

			
			{
				this$0 = AppboyInAppMessageManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AppboyInAppMessageManager this$0>
				inAppMessage = iinappmessage;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field IInAppMessage val$inAppMessage>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
		return true;
_L5:
		AppboyLogger.e(((String) (obj)), "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned null instead of a InAppMessageOperation. Ignoring the in-app message. Please check the IInAppMessageStackBehaviour implementation.");
		return false;
	//* 126  291:goto            188
	}

	public void resetAfterInAppMessageClose()
	{
		AppboyLogger.v(TAG, "Resetting after in-app message close.");
	//    0    0:getstatic       #68  <Field String TAG>
	//    1    3:ldc2            #511 <String "Resetting after in-app message close.">
	//    2    6:invokestatic    #514 <Method int AppboyLogger.v(String, String)>
	//    3    9:pop             
		mInAppMessageViewWrapper = null;
	//    4   10:aload_0         
	//    5   11:aconst_null     
	//    6   12:putfield        #312 <Field IInAppMessageViewWrapper mInAppMessageViewWrapper>
		mDisplayingInAppMessage.set(false);
	//    7   15:aload_0         
	//    8   16:getfield        #86  <Field AtomicBoolean mDisplayingInAppMessage>
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #517 <Method void AtomicBoolean.set(boolean)>
		if(mActivity != null && mOriginalOrientation != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #223 <Field Activity mActivity>
	//*  13   27:ifnull          94
	//*  14   30:aload_0         
	//*  15   31:getfield        #519 <Field Integer mOriginalOrientation>
	//*  16   34:ifnull          94
		{
			String s = TAG;
	//   17   37:getstatic       #68  <Field String TAG>
	//   18   40:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   19   41:new             #161 <Class StringBuilder>
	//   20   44:dup             
	//   21   45:invokespecial   #162 <Method void StringBuilder()>
	//   22   48:astore_2        
			stringbuilder.append("Setting requested orientation to original orientation ");
	//   23   49:aload_2         
	//   24   50:ldc2            #521 <String "Setting requested orientation to original orientation ">
	//   25   53:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
			stringbuilder.append(((Object) (mOriginalOrientation)));
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:getfield        #519 <Field Integer mOriginalOrientation>
	//   30   62:invokevirtual   #176 <Method StringBuilder StringBuilder.append(Object)>
	//   31   65:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   32   66:aload_1         
	//   33   67:aload_2         
	//   34   68:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   35   71:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//   36   74:pop             
			ViewUtils.setActivityRequestedOrientation(mActivity, mOriginalOrientation.intValue());
	//   37   75:aload_0         
	//   38   76:getfield        #223 <Field Activity mActivity>
	//   39   79:aload_0         
	//   40   80:getfield        #519 <Field Integer mOriginalOrientation>
	//   41   83:invokevirtual   #526 <Method int Integer.intValue()>
	//   42   86:invokestatic    #532 <Method void ViewUtils.setActivityRequestedOrientation(Activity, int)>
			mOriginalOrientation = null;
	//   43   89:aload_0         
	//   44   90:aconst_null     
	//   45   91:putfield        #519 <Field Integer mOriginalOrientation>
		}
	//   46   94:return          
	}

	public void setCustomControlInAppMessageManagerListener(IInAppMessageManagerListener iinappmessagemanagerlistener)
	{
		AppboyLogger.d(TAG, "Custom ControlInAppMessageManagerListener set. This listener will only be used for control in-app messages.");
	//    0    0:getstatic       #68  <Field String TAG>
	//    1    3:ldc2            #536 <String "Custom ControlInAppMessageManagerListener set. This listener will only be used for control in-app messages.">
	//    2    6:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		mCustomControlInAppMessageManagerListener = iinappmessagemanagerlistener;
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:putfield        #383 <Field IInAppMessageManagerListener mCustomControlInAppMessageManagerListener>
	//    7   15:return          
	}

	public void setCustomHtmlInAppMessageActionListener(IHtmlInAppMessageActionListener ihtmlinappmessageactionlistener)
	{
		AppboyLogger.d(TAG, "Custom htmlInAppMessageActionListener set");
	//    0    0:getstatic       #68  <Field String TAG>
	//    1    3:ldc2            #540 <String "Custom htmlInAppMessageActionListener set">
	//    2    6:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		mCustomHtmlInAppMessageActionListener = ihtmlinappmessageactionlistener;
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:putfield        #387 <Field IHtmlInAppMessageActionListener mCustomHtmlInAppMessageActionListener>
	//    7   15:return          
	}

	public void setCustomInAppMessageAnimationFactory(IInAppMessageAnimationFactory iinappmessageanimationfactory)
	{
		AppboyLogger.d(TAG, "Custom InAppMessageAnimationFactory set");
	//    0    0:getstatic       #68  <Field String TAG>
	//    1    3:ldc2            #544 <String "Custom InAppMessageAnimationFactory set">
	//    2    6:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		mCustomInAppMessageAnimationFactory = iinappmessageanimationfactory;
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:putfield        #186 <Field IInAppMessageAnimationFactory mCustomInAppMessageAnimationFactory>
	//    7   15:return          
	}

	public void setCustomInAppMessageManagerListener(IInAppMessageManagerListener iinappmessagemanagerlistener)
	{
		AppboyLogger.d(TAG, "Custom InAppMessageManagerListener set");
	//    0    0:getstatic       #68  <Field String TAG>
	//    1    3:ldc2            #547 <String "Custom InAppMessageManagerListener set">
	//    2    6:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		mCustomInAppMessageManagerListener = iinappmessagemanagerlistener;
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:putfield        #390 <Field IInAppMessageManagerListener mCustomInAppMessageManagerListener>
	//    7   15:return          
	}

	public void setCustomInAppMessageViewFactory(IInAppMessageViewFactory iinappmessageviewfactory)
	{
		AppboyLogger.d(TAG, "Custom InAppMessageViewFactory set");
	//    0    0:getstatic       #68  <Field String TAG>
	//    1    3:ldc2            #551 <String "Custom InAppMessageViewFactory set">
	//    2    6:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		mCustomInAppMessageViewFactory = iinappmessageviewfactory;
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:putfield        #190 <Field IInAppMessageViewFactory mCustomInAppMessageViewFactory>
	//    7   15:return          
	}

	public void unregisterInAppMessageManager(Activity activity)
	{
		AppboyLogger.d(TAG, "unregisterInAppMessageManager called");
	//    0    0:getstatic       #68  <Field String TAG>
	//    1    3:ldc2            #554 <String "unregisterInAppMessageManager called">
	//    2    6:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		activity = ((Activity) (mInAppMessageViewWrapper));
	//    4   10:aload_0         
	//    5   11:getfield        #312 <Field IInAppMessageViewWrapper mInAppMessageViewWrapper>
	//    6   14:astore_1        
		if(activity != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          87
		{
			ViewUtils.removeViewFromParent(((IInAppMessageViewWrapper) (activity)).getInAppMessageView());
	//    9   19:aload_1         
	//   10   20:invokeinterface #394 <Method View IInAppMessageViewWrapper.getInAppMessageView()>
	//   11   25:invokestatic    #558 <Method void ViewUtils.removeViewFromParent(View)>
			if(mInAppMessageViewWrapper.getIsAnimatingClose())
	//*  12   28:aload_0         
	//*  13   29:getfield        #312 <Field IInAppMessageViewWrapper mInAppMessageViewWrapper>
	//*  14   32:invokeinterface #561 <Method boolean IInAppMessageViewWrapper.getIsAnimatingClose()>
	//*  15   37:ifeq            66
			{
				mInAppMessageViewLifecycleListener.afterClosed(mInAppMessageViewWrapper.getInAppMessage());
	//   16   40:aload_0         
	//   17   41:getfield        #96  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
	//   18   44:aload_0         
	//   19   45:getfield        #312 <Field IInAppMessageViewWrapper mInAppMessageViewWrapper>
	//   20   48:invokeinterface #398 <Method IInAppMessage IInAppMessageViewWrapper.getInAppMessage()>
	//   21   53:invokeinterface #564 <Method void IInAppMessageViewLifecycleListener.afterClosed(IInAppMessage)>
				mCarryoverInAppMessage = null;
	//   22   58:aload_0         
	//   23   59:aconst_null     
	//   24   60:putfield        #348 <Field IInAppMessage mCarryoverInAppMessage>
			} else
	//*  25   63:goto            79
			{
				mCarryoverInAppMessage = mInAppMessageViewWrapper.getInAppMessage();
	//   26   66:aload_0         
	//   27   67:aload_0         
	//   28   68:getfield        #312 <Field IInAppMessageViewWrapper mInAppMessageViewWrapper>
	//   29   71:invokeinterface #398 <Method IInAppMessage IInAppMessageViewWrapper.getInAppMessage()>
	//   30   76:putfield        #348 <Field IInAppMessage mCarryoverInAppMessage>
			}
			mInAppMessageViewWrapper = null;
	//   31   79:aload_0         
	//   32   80:aconst_null     
	//   33   81:putfield        #312 <Field IInAppMessageViewWrapper mInAppMessageViewWrapper>
		} else
	//*  34   84:goto            92
		{
			mCarryoverInAppMessage = null;
	//   35   87:aload_0         
	//   36   88:aconst_null     
	//   37   89:putfield        #348 <Field IInAppMessage mCarryoverInAppMessage>
		}
		mActivity = null;
	//   38   92:aload_0         
	//   39   93:aconst_null     
	//   40   94:putfield        #223 <Field Activity mActivity>
		mDisplayingInAppMessage.set(false);
	//   41   97:aload_0         
	//   42   98:getfield        #86  <Field AtomicBoolean mDisplayingInAppMessage>
	//   43  101:iconst_0        
	//   44  102:invokevirtual   #517 <Method void AtomicBoolean.set(boolean)>
	//   45  105:return          
	}

	boolean verifyOrientationStatus(IInAppMessage iinappmessage)
	{
		if(ViewUtils.isRunningOnTablet(mActivity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field Activity mActivity>
	//*   2    4:invokestatic    #569 <Method boolean ViewUtils.isRunningOnTablet(Activity)>
	//*   3    7:ifeq            22
		{
			AppboyLogger.d(TAG, "Running on tablet. In-app message can be displayed in any orientation.");
	//    4   10:getstatic       #68  <Field String TAG>
	//    5   13:ldc2            #571 <String "Running on tablet. In-app message can be displayed in any orientation.">
	//    6   16:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//    7   19:pop             
			return true;
	//    8   20:iconst_1        
	//    9   21:ireturn         
		}
		iinappmessage = ((IInAppMessage) (iinappmessage.getOrientation()));
	//   10   22:aload_1         
	//   11   23:invokeinterface #575 <Method Orientation IInAppMessage.getOrientation()>
	//   12   28:astore_1        
		if(iinappmessage == null)
	//*  13   29:aload_1         
	//*  14   30:ifnonnull       45
		{
			AppboyLogger.d(TAG, "No orientation specified. In-app message can be displayed in any orientation.");
	//   15   33:getstatic       #68  <Field String TAG>
	//   16   36:ldc2            #577 <String "No orientation specified. In-app message can be displayed in any orientation.">
	//   17   39:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//   18   42:pop             
			return true;
	//   19   43:iconst_1        
	//   20   44:ireturn         
		}
		if(iinappmessage == Orientation.ANY)
	//*  21   45:aload_1         
	//*  22   46:getstatic       #580 <Field Orientation Orientation.ANY>
	//*  23   49:if_acmpne       64
		{
			AppboyLogger.d(TAG, "Any orientation specified. In-app message can be displayed in any orientation.");
	//   24   52:getstatic       #68  <Field String TAG>
	//   25   55:ldc2            #582 <String "Any orientation specified. In-app message can be displayed in any orientation.">
	//   26   58:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//   27   61:pop             
			return true;
	//   28   62:iconst_1        
	//   29   63:ireturn         
		}
		if(currentOrientationIsValid(mActivity.getResources().getConfiguration().orientation, ((Orientation) (iinappmessage))))
	//*  30   64:aload_0         
	//*  31   65:aload_0         
	//*  32   66:getfield        #223 <Field Activity mActivity>
	//*  33   69:invokevirtual   #586 <Method Resources Activity.getResources()>
	//*  34   72:invokevirtual   #592 <Method Configuration Resources.getConfiguration()>
	//*  35   75:getfield        #598 <Field int Configuration.orientation>
	//*  36   78:aload_1         
	//*  37   79:invokespecial   #600 <Method boolean currentOrientationIsValid(int, Orientation)>
	//*  38   82:ifeq            127
		{
			if(mOriginalOrientation == null)
	//*  39   85:aload_0         
	//*  40   86:getfield        #519 <Field Integer mOriginalOrientation>
	//*  41   89:ifnonnull       125
			{
				AppboyLogger.d(TAG, "Requesting orientation lock.");
	//   42   92:getstatic       #68  <Field String TAG>
	//   43   95:ldc2            #602 <String "Requesting orientation lock.">
	//   44   98:invokestatic    #154 <Method int AppboyLogger.d(String, String)>
	//   45  101:pop             
				mOriginalOrientation = Integer.valueOf(mActivity.getRequestedOrientation());
	//   46  102:aload_0         
	//   47  103:aload_0         
	//   48  104:getfield        #223 <Field Activity mActivity>
	//   49  107:invokevirtual   #605 <Method int Activity.getRequestedOrientation()>
	//   50  110:invokestatic    #609 <Method Integer Integer.valueOf(int)>
	//   51  113:putfield        #519 <Field Integer mOriginalOrientation>
				ViewUtils.setActivityRequestedOrientation(mActivity, 14);
	//   52  116:aload_0         
	//   53  117:getfield        #223 <Field Activity mActivity>
	//   54  120:bipush          14
	//   55  122:invokestatic    #532 <Method void ViewUtils.setActivityRequestedOrientation(Activity, int)>
			}
			return true;
	//   56  125:iconst_1        
	//   57  126:ireturn         
		} else
		{
			return false;
	//   58  127:iconst_0        
	//   59  128:ireturn         
		}
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/AppboyInAppMessageManager);
	private static volatile AppboyInAppMessageManager sInstance = null;
	private Activity mActivity;
	private AppboyConfigurationProvider mAppboyConfigurationProvider;
	private Context mApplicationContext;
	private IInAppMessage mCarryoverInAppMessage;
	private IInAppMessageManagerListener mCustomControlInAppMessageManagerListener;
	private IHtmlInAppMessageActionListener mCustomHtmlInAppMessageActionListener;
	private IInAppMessageAnimationFactory mCustomInAppMessageAnimationFactory;
	private IInAppMessageManagerListener mCustomInAppMessageManagerListener;
	private IInAppMessageViewFactory mCustomInAppMessageViewFactory;
	private IHtmlInAppMessageActionListener mDefaultHtmlInAppMessageActionListener;
	private IInAppMessageManagerListener mDefaultInAppMessageManagerListener;
	private AtomicBoolean mDisplayingInAppMessage;
	private IInAppMessageAnimationFactory mInAppMessageAnimationFactory;
	private IEventSubscriber mInAppMessageEventSubscriber;
	private IInAppMessageViewFactory mInAppMessageFullViewFactory;
	private IInAppMessageViewFactory mInAppMessageHtmlFullViewFactory;
	private IInAppMessageViewFactory mInAppMessageModalViewFactory;
	private IInAppMessageViewFactory mInAppMessageSlideupViewFactory;
	private final Stack mInAppMessageStack = new Stack();
	private final IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener = new AppboyInAppMessageViewLifecycleListener();
	private IInAppMessageViewWrapper mInAppMessageViewWrapper;
	private final IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener = new AppboyInAppMessageWebViewClientListener();
	private Integer mOriginalOrientation;
	private IInAppMessage mUnRegisteredInAppMessage;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyInAppMessageManager>
	//    1    2:invokestatic    #66  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #68  <Field String TAG>
	//    3    8:aconst_null     
	//    4    9:putstatic       #70  <Field AppboyInAppMessageManager sInstance>
	//*   5   12:return          
	}
}
