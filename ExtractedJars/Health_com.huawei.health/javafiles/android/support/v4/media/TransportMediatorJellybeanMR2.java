// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.app.PendingIntent;
import android.content.*;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.util.Log;
import android.view.*;

// Referenced classes of package android.support.v4.media:
//			TransportMediatorCallback

class TransportMediatorJellybeanMR2
{

	public TransportMediatorJellybeanMR2(Context context, AudioManager audiomanager, View view, TransportMediatorCallback transportmediatorcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class TransportMediatorJellybeanMR2$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #62  <Method void TransportMediatorJellybeanMR2$1(TransportMediatorJellybeanMR2)>
	//    7   13:putfield        #64  <Field android.view.ViewTreeObserver$OnWindowAttachListener mWindowAttachListener>
	//    8   16:aload_0         
	//    9   17:new             #8   <Class TransportMediatorJellybeanMR2$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #65  <Method void TransportMediatorJellybeanMR2$2(TransportMediatorJellybeanMR2)>
	//   13   25:putfield        #67  <Field android.view.ViewTreeObserver$OnWindowFocusChangeListener mWindowFocusListener>
	//   14   28:aload_0         
	//   15   29:new             #10  <Class TransportMediatorJellybeanMR2$3>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #68  <Method void TransportMediatorJellybeanMR2$3(TransportMediatorJellybeanMR2)>
	//   19   37:putfield        #70  <Field BroadcastReceiver mMediaButtonReceiver>
		mAudioFocusChangeListener = new android.media.AudioManager.OnAudioFocusChangeListener() {

			public void onAudioFocusChange(int i)
			{
				mTransportCallback.handleAudioFocusChange(i);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
			//    2    4:getfield        #24  <Field TransportMediatorCallback TransportMediatorJellybeanMR2.mTransportCallback>
			//    3    7:iload_1         
			//    4    8:invokeinterface #29  <Method void TransportMediatorCallback.handleAudioFocusChange(int)>
			//    5   13:return          
			}

			final TransportMediatorJellybeanMR2 this$0;

			
			{
				this$0 = TransportMediatorJellybeanMR2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   20   40:aload_0         
	//   21   41:new             #12  <Class TransportMediatorJellybeanMR2$4>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:invokespecial   #71  <Method void TransportMediatorJellybeanMR2$4(TransportMediatorJellybeanMR2)>
	//   25   49:putfield        #73  <Field android.media.AudioManager$OnAudioFocusChangeListener mAudioFocusChangeListener>
	//   26   52:aload_0         
	//   27   53:new             #14  <Class TransportMediatorJellybeanMR2$5>
	//   28   56:dup             
	//   29   57:aload_0         
	//   30   58:invokespecial   #74  <Method void TransportMediatorJellybeanMR2$5(TransportMediatorJellybeanMR2)>
	//   31   61:putfield        #76  <Field android.media.RemoteControlClient$OnGetPlaybackPositionListener mGetPlaybackPositionListener>
	//   32   64:aload_0         
	//   33   65:new             #16  <Class TransportMediatorJellybeanMR2$6>
	//   34   68:dup             
	//   35   69:aload_0         
	//   36   70:invokespecial   #77  <Method void TransportMediatorJellybeanMR2$6(TransportMediatorJellybeanMR2)>
	//   37   73:putfield        #79  <Field android.media.RemoteControlClient$OnPlaybackPositionUpdateListener mPlaybackPositionUpdateListener>
		mPlayState = 0;
	//   38   76:aload_0         
	//   39   77:iconst_0        
	//   40   78:putfield        #81  <Field int mPlayState>
		mContext = context;
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:putfield        #83  <Field Context mContext>
		mAudioManager = audiomanager;
	//   44   86:aload_0         
	//   45   87:aload_2         
	//   46   88:putfield        #85  <Field AudioManager mAudioManager>
		mTargetView = view;
	//   47   91:aload_0         
	//   48   92:aload_3         
	//   49   93:putfield        #87  <Field View mTargetView>
		mTransportCallback = transportmediatorcallback;
	//   50   96:aload_0         
	//   51   97:aload           4
	//   52   99:putfield        #89  <Field TransportMediatorCallback mTransportCallback>
		mReceiverAction = (new StringBuilder()).append(context.getPackageName()).append(":transport:").append(System.identityHashCode(((Object) (this)))).toString();
	//   53  102:aload_0         
	//   54  103:new             #91  <Class StringBuilder>
	//   55  106:dup             
	//   56  107:invokespecial   #92  <Method void StringBuilder()>
	//   57  110:aload_1         
	//   58  111:invokevirtual   #98  <Method String Context.getPackageName()>
	//   59  114:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   60  117:ldc1            #104 <String ":transport:">
	//   61  119:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   62  122:aload_0         
	//   63  123:invokestatic    #110 <Method int System.identityHashCode(Object)>
	//   64  126:invokevirtual   #113 <Method StringBuilder StringBuilder.append(int)>
	//   65  129:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   66  132:putfield        #118 <Field String mReceiverAction>
		mIntent = new Intent(mReceiverAction);
	//   67  135:aload_0         
	//   68  136:new             #120 <Class Intent>
	//   69  139:dup             
	//   70  140:aload_0         
	//   71  141:getfield        #118 <Field String mReceiverAction>
	//   72  144:invokespecial   #123 <Method void Intent(String)>
	//   73  147:putfield        #125 <Field Intent mIntent>
		mIntent.setPackage(context.getPackageName());
	//   74  150:aload_0         
	//   75  151:getfield        #125 <Field Intent mIntent>
	//   76  154:aload_1         
	//   77  155:invokevirtual   #98  <Method String Context.getPackageName()>
	//   78  158:invokevirtual   #129 <Method Intent Intent.setPackage(String)>
	//   79  161:pop             
	//   80  162:aload_0         
	//   81  163:new             #131 <Class IntentFilter>
	//   82  166:dup             
	//   83  167:invokespecial   #132 <Method void IntentFilter()>
	//   84  170:putfield        #134 <Field IntentFilter mReceiverFilter>
		mReceiverFilter.addAction(mReceiverAction);
	//   85  173:aload_0         
	//   86  174:getfield        #134 <Field IntentFilter mReceiverFilter>
	//   87  177:aload_0         
	//   88  178:getfield        #118 <Field String mReceiverAction>
	//   89  181:invokevirtual   #137 <Method void IntentFilter.addAction(String)>
		mTargetView.getViewTreeObserver().addOnWindowAttachListener(mWindowAttachListener);
	//   90  184:aload_0         
	//   91  185:getfield        #87  <Field View mTargetView>
	//   92  188:invokevirtual   #143 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   93  191:aload_0         
	//   94  192:getfield        #64  <Field android.view.ViewTreeObserver$OnWindowAttachListener mWindowAttachListener>
	//   95  195:invokevirtual   #149 <Method void ViewTreeObserver.addOnWindowAttachListener(android.view.ViewTreeObserver$OnWindowAttachListener)>
		mTargetView.getViewTreeObserver().addOnWindowFocusChangeListener(mWindowFocusListener);
	//   96  198:aload_0         
	//   97  199:getfield        #87  <Field View mTargetView>
	//   98  202:invokevirtual   #143 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   99  205:aload_0         
	//  100  206:getfield        #67  <Field android.view.ViewTreeObserver$OnWindowFocusChangeListener mWindowFocusListener>
	//  101  209:invokevirtual   #153 <Method void ViewTreeObserver.addOnWindowFocusChangeListener(android.view.ViewTreeObserver$OnWindowFocusChangeListener)>
	//  102  212:return          
	}

	public void destroy()
	{
		windowDetached();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #158 <Method void windowDetached()>
		mTargetView.getViewTreeObserver().removeOnWindowAttachListener(mWindowAttachListener);
	//    2    4:aload_0         
	//    3    5:getfield        #87  <Field View mTargetView>
	//    4    8:invokevirtual   #143 <Method ViewTreeObserver View.getViewTreeObserver()>
	//    5   11:aload_0         
	//    6   12:getfield        #64  <Field android.view.ViewTreeObserver$OnWindowAttachListener mWindowAttachListener>
	//    7   15:invokevirtual   #161 <Method void ViewTreeObserver.removeOnWindowAttachListener(android.view.ViewTreeObserver$OnWindowAttachListener)>
		mTargetView.getViewTreeObserver().removeOnWindowFocusChangeListener(mWindowFocusListener);
	//    8   18:aload_0         
	//    9   19:getfield        #87  <Field View mTargetView>
	//   10   22:invokevirtual   #143 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   11   25:aload_0         
	//   12   26:getfield        #67  <Field android.view.ViewTreeObserver$OnWindowFocusChangeListener mWindowFocusListener>
	//   13   29:invokevirtual   #164 <Method void ViewTreeObserver.removeOnWindowFocusChangeListener(android.view.ViewTreeObserver$OnWindowFocusChangeListener)>
	//   14   32:return          
	}

	void dropAudioFocus()
	{
		if(mAudioFocused)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field boolean mAudioFocused>
	//*   2    4:ifeq            24
		{
			mAudioFocused = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #167 <Field boolean mAudioFocused>
			mAudioManager.abandonAudioFocus(mAudioFocusChangeListener);
	//    6   12:aload_0         
	//    7   13:getfield        #85  <Field AudioManager mAudioManager>
	//    8   16:aload_0         
	//    9   17:getfield        #73  <Field android.media.AudioManager$OnAudioFocusChangeListener mAudioFocusChangeListener>
	//   10   20:invokevirtual   #173 <Method int AudioManager.abandonAudioFocus(android.media.AudioManager$OnAudioFocusChangeListener)>
	//   11   23:pop             
		}
	//   12   24:return          
	}

	void gainFocus()
	{
		if(!mFocused)
	//*   0    0:aload_0         
	//*   1    1:getfield        #176 <Field boolean mFocused>
	//*   2    4:ifne            46
		{
			mFocused = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #176 <Field boolean mFocused>
			mAudioManager.registerMediaButtonEventReceiver(mPendingIntent);
	//    6   12:aload_0         
	//    7   13:getfield        #85  <Field AudioManager mAudioManager>
	//    8   16:aload_0         
	//    9   17:getfield        #178 <Field PendingIntent mPendingIntent>
	//   10   20:invokevirtual   #182 <Method void AudioManager.registerMediaButtonEventReceiver(PendingIntent)>
			mAudioManager.registerRemoteControlClient(mRemoteControl);
	//   11   23:aload_0         
	//   12   24:getfield        #85  <Field AudioManager mAudioManager>
	//   13   27:aload_0         
	//   14   28:getfield        #184 <Field RemoteControlClient mRemoteControl>
	//   15   31:invokevirtual   #188 <Method void AudioManager.registerRemoteControlClient(RemoteControlClient)>
			if(mPlayState == 3)
	//*  16   34:aload_0         
	//*  17   35:getfield        #81  <Field int mPlayState>
	//*  18   38:iconst_3        
	//*  19   39:icmpne          46
				takeAudioFocus();
	//   20   42:aload_0         
	//   21   43:invokevirtual   #191 <Method void takeAudioFocus()>
		}
	//   22   46:return          
	}

	public Object getRemoteControlClient()
	{
		return ((Object) (mRemoteControl));
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field RemoteControlClient mRemoteControl>
	//    2    4:areturn         
	}

	void loseFocus()
	{
		dropAudioFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #196 <Method void dropAudioFocus()>
		if(mFocused)
	//*   2    4:aload_0         
	//*   3    5:getfield        #176 <Field boolean mFocused>
	//*   4    8:ifeq            38
		{
			mFocused = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #176 <Field boolean mFocused>
			mAudioManager.unregisterRemoteControlClient(mRemoteControl);
	//    8   16:aload_0         
	//    9   17:getfield        #85  <Field AudioManager mAudioManager>
	//   10   20:aload_0         
	//   11   21:getfield        #184 <Field RemoteControlClient mRemoteControl>
	//   12   24:invokevirtual   #199 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
			mAudioManager.unregisterMediaButtonEventReceiver(mPendingIntent);
	//   13   27:aload_0         
	//   14   28:getfield        #85  <Field AudioManager mAudioManager>
	//   15   31:aload_0         
	//   16   32:getfield        #178 <Field PendingIntent mPendingIntent>
	//   17   35:invokevirtual   #202 <Method void AudioManager.unregisterMediaButtonEventReceiver(PendingIntent)>
		}
	//   18   38:return          
	}

	public void pausePlaying()
	{
		if(mPlayState == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field int mPlayState>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          21
		{
			mPlayState = 2;
	//    4    8:aload_0         
	//    5    9:iconst_2        
	//    6   10:putfield        #81  <Field int mPlayState>
			mRemoteControl.setPlaybackState(2);
	//    7   13:aload_0         
	//    8   14:getfield        #184 <Field RemoteControlClient mRemoteControl>
	//    9   17:iconst_2        
	//   10   18:invokevirtual   #209 <Method void RemoteControlClient.setPlaybackState(int)>
		}
		dropAudioFocus();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #196 <Method void dropAudioFocus()>
	//   13   25:return          
	}

	public void refreshState(boolean flag, long l, int i)
	{
		if(mRemoteControl != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field RemoteControlClient mRemoteControl>
	//*   2    4:ifnull          58
		{
			RemoteControlClient remotecontrolclient = mRemoteControl;
	//    3    7:aload_0         
	//    4    8:getfield        #184 <Field RemoteControlClient mRemoteControl>
	//    5   11:astore          7
			byte byte0;
			if(flag)
	//*   6   13:iload_1         
	//*   7   14:ifeq            23
				byte0 = 3;
	//    8   17:iconst_3        
	//    9   18:istore          6
			else
	//*  10   20:goto            26
				byte0 = 1;
	//   11   23:iconst_1        
	//   12   24:istore          6
			float f;
			if(flag)
	//*  13   26:iload_1         
	//*  14   27:ifeq            36
				f = 1.0F;
	//   15   30:fconst_1        
	//   16   31:fstore          5
			else
	//*  17   33:goto            39
				f = 0.0F;
	//   18   36:fconst_0        
	//   19   37:fstore          5
			remotecontrolclient.setPlaybackState(((int) (byte0)), l, f);
	//   20   39:aload           7
	//   21   41:iload           6
	//   22   43:lload_2         
	//   23   44:fload           5
	//   24   46:invokevirtual   #214 <Method void RemoteControlClient.setPlaybackState(int, long, float)>
			mRemoteControl.setTransportControlFlags(i);
	//   25   49:aload_0         
	//   26   50:getfield        #184 <Field RemoteControlClient mRemoteControl>
	//   27   53:iload           4
	//   28   55:invokevirtual   #217 <Method void RemoteControlClient.setTransportControlFlags(int)>
		}
	//   29   58:return          
	}

	public void startPlaying()
	{
		if(mPlayState != 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field int mPlayState>
	//*   2    4:iconst_3        
	//*   3    5:icmpeq          21
		{
			mPlayState = 3;
	//    4    8:aload_0         
	//    5    9:iconst_3        
	//    6   10:putfield        #81  <Field int mPlayState>
			mRemoteControl.setPlaybackState(3);
	//    7   13:aload_0         
	//    8   14:getfield        #184 <Field RemoteControlClient mRemoteControl>
	//    9   17:iconst_3        
	//   10   18:invokevirtual   #209 <Method void RemoteControlClient.setPlaybackState(int)>
		}
		if(mFocused)
	//*  11   21:aload_0         
	//*  12   22:getfield        #176 <Field boolean mFocused>
	//*  13   25:ifeq            32
			takeAudioFocus();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #191 <Method void takeAudioFocus()>
	//   16   32:return          
	}

	public void stopPlaying()
	{
		if(mPlayState != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field int mPlayState>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          21
		{
			mPlayState = 1;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #81  <Field int mPlayState>
			mRemoteControl.setPlaybackState(1);
	//    7   13:aload_0         
	//    8   14:getfield        #184 <Field RemoteControlClient mRemoteControl>
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #209 <Method void RemoteControlClient.setPlaybackState(int)>
		}
		dropAudioFocus();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #196 <Method void dropAudioFocus()>
	//   13   25:return          
	}

	void takeAudioFocus()
	{
		if(!mAudioFocused)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field boolean mAudioFocused>
	//*   2    4:ifne            26
		{
			mAudioFocused = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #167 <Field boolean mAudioFocused>
			mAudioManager.requestAudioFocus(mAudioFocusChangeListener, 3, 1);
	//    6   12:aload_0         
	//    7   13:getfield        #85  <Field AudioManager mAudioManager>
	//    8   16:aload_0         
	//    9   17:getfield        #73  <Field android.media.AudioManager$OnAudioFocusChangeListener mAudioFocusChangeListener>
	//   10   20:iconst_3        
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #223 <Method int AudioManager.requestAudioFocus(android.media.AudioManager$OnAudioFocusChangeListener, int, int)>
	//   13   25:pop             
		}
	//   14   26:return          
	}

	void windowAttached()
	{
		mContext.registerReceiver(mMediaButtonReceiver, mReceiverFilter);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #70  <Field BroadcastReceiver mMediaButtonReceiver>
	//    4    8:aload_0         
	//    5    9:getfield        #134 <Field IntentFilter mReceiverFilter>
	//    6   12:invokevirtual   #228 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//    7   15:pop             
		mPendingIntent = PendingIntent.getBroadcast(mContext, 0, mIntent, 0x10000000);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #83  <Field Context mContext>
	//   11   21:iconst_0        
	//   12   22:aload_0         
	//   13   23:getfield        #125 <Field Intent mIntent>
	//   14   26:ldc1            #229 <Int 0x10000000>
	//   15   28:invokestatic    #235 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   16   31:putfield        #178 <Field PendingIntent mPendingIntent>
		mRemoteControl = new RemoteControlClient(mPendingIntent);
	//   17   34:aload_0         
	//   18   35:new             #205 <Class RemoteControlClient>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:getfield        #178 <Field PendingIntent mPendingIntent>
	//   22   43:invokespecial   #237 <Method void RemoteControlClient(PendingIntent)>
	//   23   46:putfield        #184 <Field RemoteControlClient mRemoteControl>
		mRemoteControl.setOnGetPlaybackPositionListener(mGetPlaybackPositionListener);
	//   24   49:aload_0         
	//   25   50:getfield        #184 <Field RemoteControlClient mRemoteControl>
	//   26   53:aload_0         
	//   27   54:getfield        #76  <Field android.media.RemoteControlClient$OnGetPlaybackPositionListener mGetPlaybackPositionListener>
	//   28   57:invokevirtual   #241 <Method void RemoteControlClient.setOnGetPlaybackPositionListener(android.media.RemoteControlClient$OnGetPlaybackPositionListener)>
		mRemoteControl.setPlaybackPositionUpdateListener(mPlaybackPositionUpdateListener);
	//   29   60:aload_0         
	//   30   61:getfield        #184 <Field RemoteControlClient mRemoteControl>
	//   31   64:aload_0         
	//   32   65:getfield        #79  <Field android.media.RemoteControlClient$OnPlaybackPositionUpdateListener mPlaybackPositionUpdateListener>
	//   33   68:invokevirtual   #245 <Method void RemoteControlClient.setPlaybackPositionUpdateListener(android.media.RemoteControlClient$OnPlaybackPositionUpdateListener)>
	//   34   71:return          
	}

	void windowDetached()
	{
		loseFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #247 <Method void loseFocus()>
		if(mPendingIntent != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #178 <Field PendingIntent mPendingIntent>
	//*   4    8:ifnull          39
		{
			mContext.unregisterReceiver(mMediaButtonReceiver);
	//    5   11:aload_0         
	//    6   12:getfield        #83  <Field Context mContext>
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field BroadcastReceiver mMediaButtonReceiver>
	//    9   19:invokevirtual   #251 <Method void Context.unregisterReceiver(BroadcastReceiver)>
			mPendingIntent.cancel();
	//   10   22:aload_0         
	//   11   23:getfield        #178 <Field PendingIntent mPendingIntent>
	//   12   26:invokevirtual   #254 <Method void PendingIntent.cancel()>
			mPendingIntent = null;
	//   13   29:aload_0         
	//   14   30:aconst_null     
	//   15   31:putfield        #178 <Field PendingIntent mPendingIntent>
			mRemoteControl = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #184 <Field RemoteControlClient mRemoteControl>
		}
	//   19   39:return          
	}

	android.media.AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener;
	boolean mAudioFocused;
	final AudioManager mAudioManager;
	final Context mContext;
	boolean mFocused;
	final android.media.RemoteControlClient.OnGetPlaybackPositionListener mGetPlaybackPositionListener = new android.media.RemoteControlClient.OnGetPlaybackPositionListener() {

		public long onGetPlaybackPosition()
		{
			return mTransportCallback.getPlaybackPosition();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
		//    2    4:getfield        #24  <Field TransportMediatorCallback TransportMediatorJellybeanMR2.mTransportCallback>
		//    3    7:invokeinterface #29  <Method long TransportMediatorCallback.getPlaybackPosition()>
		//    4   12:lreturn         
		}

		final TransportMediatorJellybeanMR2 this$0;

			
			{
				this$0 = TransportMediatorJellybeanMR2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	final Intent mIntent;
	final BroadcastReceiver mMediaButtonReceiver = new BroadcastReceiver() {

		public void onReceive(Context context1, Intent intent)
		{
			try
			{
				context1 = ((Context) ((KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT")));
		//    0    0:aload_2         
		//    1    1:ldc1            #22  <String "android.intent.extra.KEY_EVENT">
		//    2    3:invokevirtual   #28  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
		//    3    6:checkcast       #30  <Class KeyEvent>
		//    4    9:astore_1        
				mTransportCallback.handleKey(((KeyEvent) (context1)));
		//    5   10:aload_0         
		//    6   11:getfield        #12  <Field TransportMediatorJellybeanMR2 this$0>
		//    7   14:getfield        #34  <Field TransportMediatorCallback TransportMediatorJellybeanMR2.mTransportCallback>
		//    8   17:aload_1         
		//    9   18:invokeinterface #40  <Method void TransportMediatorCallback.handleKey(KeyEvent)>
				return;
		//   10   23:return          
			}
			// Misplaced declaration of an exception variable
			catch(Context context1)
		//*  11   24:astore_1        
			{
				Log.w("TransportController", ((Throwable) (context1)));
		//   12   25:ldc1            #42  <String "TransportController">
		//   13   27:aload_1         
		//   14   28:invokestatic    #48  <Method int Log.w(String, Throwable)>
		//   15   31:pop             
			}
		//   16   32:return          
		}

		final TransportMediatorJellybeanMR2 this$0;

			
			{
				this$0 = TransportMediatorJellybeanMR2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field TransportMediatorJellybeanMR2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
	}
;
	PendingIntent mPendingIntent;
	int mPlayState;
	final android.media.RemoteControlClient.OnPlaybackPositionUpdateListener mPlaybackPositionUpdateListener = new android.media.RemoteControlClient.OnPlaybackPositionUpdateListener() {

		public void onPlaybackPositionUpdate(long l)
		{
			mTransportCallback.playbackPositionUpdate(l);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
		//    2    4:getfield        #24  <Field TransportMediatorCallback TransportMediatorJellybeanMR2.mTransportCallback>
		//    3    7:lload_1         
		//    4    8:invokeinterface #29  <Method void TransportMediatorCallback.playbackPositionUpdate(long)>
		//    5   13:return          
		}

		final TransportMediatorJellybeanMR2 this$0;

			
			{
				this$0 = TransportMediatorJellybeanMR2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	final String mReceiverAction;
	final IntentFilter mReceiverFilter = new IntentFilter();
	RemoteControlClient mRemoteControl;
	final View mTargetView;
	final TransportMediatorCallback mTransportCallback;
	final android.view.ViewTreeObserver.OnWindowAttachListener mWindowAttachListener = new android.view.ViewTreeObserver.OnWindowAttachListener() {

		public void onWindowAttached()
		{
			windowAttached();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
		//    2    4:invokevirtual   #22  <Method void TransportMediatorJellybeanMR2.windowAttached()>
		//    3    7:return          
		}

		public void onWindowDetached()
		{
			windowDetached();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
		//    2    4:invokevirtual   #26  <Method void TransportMediatorJellybeanMR2.windowDetached()>
		//    3    7:return          
		}

		final TransportMediatorJellybeanMR2 this$0;

			
			{
				this$0 = TransportMediatorJellybeanMR2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	final android.view.ViewTreeObserver.OnWindowFocusChangeListener mWindowFocusListener = new android.view.ViewTreeObserver.OnWindowFocusChangeListener() {

		public void onWindowFocusChanged(boolean flag)
		{
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            12
			{
				gainFocus();
		//    2    4:aload_0         
		//    3    5:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
		//    4    8:invokevirtual   #23  <Method void TransportMediatorJellybeanMR2.gainFocus()>
				return;
		//    5   11:return          
			} else
			{
				loseFocus();
		//    6   12:aload_0         
		//    7   13:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
		//    8   16:invokevirtual   #26  <Method void TransportMediatorJellybeanMR2.loseFocus()>
				return;
		//    9   19:return          
			}
		}

		final TransportMediatorJellybeanMR2 this$0;

			
			{
				this$0 = TransportMediatorJellybeanMR2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
}
