// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.*;
import android.os.*;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.common.b;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			StartAppAd, VideoListener

class StartAppAd$1$1
	implements Runnable
{

	public void run()
	{
		a.a.videoListener.onVideoCompleted();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field StartAppAd$1 a>
	//    2    4:getfield        #25  <Field StartAppAd StartAppAd$1.a>
	//    3    7:getfield        #31  <Field VideoListener StartAppAd.videoListener>
	//    4   10:invokeinterface #36  <Method void VideoListener.onVideoCompleted()>
	//    5   15:return          
	}

	final StartAppAd._cls1 a;

	StartAppAd$1$1(StartAppAd._cls1 _pcls1)
	{
		a = _pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field StartAppAd$1 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/startapp/android/publish/adsCommon/StartAppAd$1

/* anonymous class */
	class StartAppAd._cls1 extends BroadcastReceiver
	{

		private void a(Context context)
		{
			b.a(context).a(((BroadcastReceiver) (this)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #24  <Method b b.a(Context)>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #27  <Method void b.a(BroadcastReceiver)>
		//    4    8:return          
		}

		public void onReceive(Context context, Intent intent)
		{
			if(!intent.getAction().equals("com.startapp.android.ShowFailedDisplayBroadcastListener")) goto _L2; else goto _L1
		//    0    0:aload_2         
		//    1    1:invokevirtual   #35  <Method String Intent.getAction()>
		//    2    4:ldc1            #37  <String "com.startapp.android.ShowFailedDisplayBroadcastListener">
		//    3    6:invokevirtual   #43  <Method boolean String.equals(Object)>
		//    4    9:ifeq            83
_L1:
			if(intent.getExtras().containsKey("showFailedReason"))
		//*   5   12:aload_2         
		//*   6   13:invokevirtual   #47  <Method Bundle Intent.getExtras()>
		//*   7   16:ldc1            #49  <String "showFailedReason">
		//*   8   18:invokevirtual   #55  <Method boolean Bundle.containsKey(String)>
		//*   9   21:ifeq            43
				a.setNotDisplayedReason((com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason)intent.getExtras().getSerializable("showFailedReason"));
		//   10   24:aload_0         
		//   11   25:getfield        #14  <Field StartAppAd a>
		//   12   28:aload_2         
		//   13   29:invokevirtual   #47  <Method Bundle Intent.getExtras()>
		//   14   32:ldc1            #49  <String "showFailedReason">
		//   15   34:invokevirtual   #59  <Method java.io.Serializable Bundle.getSerializable(String)>
		//   16   37:checkcast       #61  <Class com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason>
		//   17   40:invokevirtual   #65  <Method void StartAppAd.setNotDisplayedReason(com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener$NotDisplayedReason)>
			if(a.callback != null)
		//*  18   43:aload_0         
		//*  19   44:getfield        #14  <Field StartAppAd a>
		//*  20   47:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
		//*  21   50:ifnull          69
				a.callback.adNotDisplayed(((Ad) (a)));
		//   22   53:aload_0         
		//   23   54:getfield        #14  <Field StartAppAd a>
		//   24   57:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
		//   25   60:aload_0         
		//   26   61:getfield        #14  <Field StartAppAd a>
		//   27   64:invokeinterface #75  <Method void AdDisplayListener.adNotDisplayed(Ad)>
			a(context);
		//   28   69:aload_0         
		//   29   70:aload_1         
		//   30   71:invokespecial   #77  <Method void a(Context)>
_L4:
			a.ad = null;
		//   31   74:aload_0         
		//   32   75:getfield        #14  <Field StartAppAd a>
		//   33   78:aconst_null     
		//   34   79:putfield        #81  <Field g StartAppAd.ad>
			return;
		//   35   82:return          
_L2:
			if(intent.getAction().equals("com.startapp.android.ShowDisplayBroadcastListener"))
		//*  36   83:aload_2         
		//*  37   84:invokevirtual   #35  <Method String Intent.getAction()>
		//*  38   87:ldc1            #83  <String "com.startapp.android.ShowDisplayBroadcastListener">
		//*  39   89:invokevirtual   #43  <Method boolean String.equals(Object)>
		//*  40   92:ifeq            124
			{
				if(a.callback != null)
		//*  41   95:aload_0         
		//*  42   96:getfield        #14  <Field StartAppAd a>
		//*  43   99:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
		//*  44  102:ifnull          74
					a.callback.adDisplayed(((Ad) (a)));
		//   45  105:aload_0         
		//   46  106:getfield        #14  <Field StartAppAd a>
		//   47  109:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
		//   48  112:aload_0         
		//   49  113:getfield        #14  <Field StartAppAd a>
		//   50  116:invokeinterface #86  <Method void AdDisplayListener.adDisplayed(Ad)>
			} else
		//*  51  121:goto            74
			if(intent.getAction().equals("com.startapp.android.OnClickCallback"))
		//*  52  124:aload_2         
		//*  53  125:invokevirtual   #35  <Method String Intent.getAction()>
		//*  54  128:ldc1            #88  <String "com.startapp.android.OnClickCallback">
		//*  55  130:invokevirtual   #43  <Method boolean String.equals(Object)>
		//*  56  133:ifeq            165
			{
				if(a.callback != null)
		//*  57  136:aload_0         
		//*  58  137:getfield        #14  <Field StartAppAd a>
		//*  59  140:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
		//*  60  143:ifnull          74
					a.callback.adClicked(((Ad) (a)));
		//   61  146:aload_0         
		//   62  147:getfield        #14  <Field StartAppAd a>
		//   63  150:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
		//   64  153:aload_0         
		//   65  154:getfield        #14  <Field StartAppAd a>
		//   66  157:invokeinterface #91  <Method void AdDisplayListener.adClicked(Ad)>
			} else
		//*  67  162:goto            74
			if(intent.getAction().equals("com.startapp.android.OnVideoCompleted"))
		//*  68  165:aload_2         
		//*  69  166:invokevirtual   #35  <Method String Intent.getAction()>
		//*  70  169:ldc1            #93  <String "com.startapp.android.OnVideoCompleted">
		//*  71  171:invokevirtual   #43  <Method boolean String.equals(Object)>
		//*  72  174:ifeq            212
			{
				if(a.videoListener != null)
		//*  73  177:aload_0         
		//*  74  178:getfield        #14  <Field StartAppAd a>
		//*  75  181:getfield        #97  <Field VideoListener StartAppAd.videoListener>
		//*  76  184:ifnull          74
					(new Handler(Looper.getMainLooper())).post(((Runnable) (new StartAppAd._cls1._cls1(this))));
		//   77  187:new             #99  <Class Handler>
		//   78  190:dup             
		//   79  191:invokestatic    #105 <Method Looper Looper.getMainLooper()>
		//   80  194:invokespecial   #108 <Method void Handler(Looper)>
		//   81  197:new             #8   <Class StartAppAd$1$1>
		//   82  200:dup             
		//   83  201:aload_0         
		//   84  202:invokespecial   #111 <Method void StartAppAd$1$1(StartAppAd$1)>
		//   85  205:invokevirtual   #115 <Method boolean Handler.post(Runnable)>
		//   86  208:pop             
			} else
		//*  87  209:goto            74
			{
				if(a.callback != null)
		//*  88  212:aload_0         
		//*  89  213:getfield        #14  <Field StartAppAd a>
		//*  90  216:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
		//*  91  219:ifnull          238
					a.callback.adHidden(((Ad) (a)));
		//   92  222:aload_0         
		//   93  223:getfield        #14  <Field StartAppAd a>
		//   94  226:getfield        #69  <Field AdDisplayListener StartAppAd.callback>
		//   95  229:aload_0         
		//   96  230:getfield        #14  <Field StartAppAd a>
		//   97  233:invokeinterface #118 <Method void AdDisplayListener.adHidden(Ad)>
				a(context);
		//   98  238:aload_0         
		//   99  239:aload_1         
		//  100  240:invokespecial   #77  <Method void a(Context)>
			}
			if(true) goto _L4; else goto _L3
		//  101  243:goto            74
_L3:
		}

		final StartAppAd a;

			
			{
				a = startappad;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field StartAppAd a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
	}

}
