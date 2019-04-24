// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.media:
//			TransportController, TransportMediatorJellybeanMR2, TransportStateListener, TransportPerformer, 
//			TransportMediatorCallback

public class TransportMediator extends TransportController
{

	public TransportMediator(Activity activity, TransportPerformer transportperformer)
	{
		this(activity, ((View) (null)), transportperformer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #56  <Method void TransportMediator(Activity, View, TransportPerformer)>
	//    5    7:return          
	}

	private TransportMediator(Activity activity, View view, TransportPerformer transportperformer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void TransportController()>
		mListeners = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #63  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #64  <Method void ArrayList()>
	//    6   12:putfield        #66  <Field ArrayList mListeners>
		mTransportKeyCallback = new TransportMediatorCallback() {

			public long getPlaybackPosition()
			{
				return mCallbacks.onGetCurrentPosition();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field TransportMediator this$0>
			//    2    4:getfield        #24  <Field TransportPerformer TransportMediator.mCallbacks>
			//    3    7:invokevirtual   #29  <Method long TransportPerformer.onGetCurrentPosition()>
			//    4   10:lreturn         
			}

			public void handleAudioFocusChange(int i)
			{
				mCallbacks.onAudioFocusChange(i);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field TransportMediator this$0>
			//    2    4:getfield        #24  <Field TransportPerformer TransportMediator.mCallbacks>
			//    3    7:iload_1         
			//    4    8:invokevirtual   #34  <Method void TransportPerformer.onAudioFocusChange(int)>
			//    5   11:return          
			}

			public void handleKey(KeyEvent keyevent)
			{
				keyevent.dispatch(mKeyEventCallback);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #14  <Field TransportMediator this$0>
			//    3    5:getfield        #40  <Field android.view.KeyEvent$Callback TransportMediator.mKeyEventCallback>
			//    4    8:invokevirtual   #46  <Method boolean KeyEvent.dispatch(android.view.KeyEvent$Callback)>
			//    5   11:pop             
			//    6   12:return          
			}

			public void playbackPositionUpdate(long l)
			{
				mCallbacks.onSeekTo(l);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field TransportMediator this$0>
			//    2    4:getfield        #24  <Field TransportPerformer TransportMediator.mCallbacks>
			//    3    7:lload_1         
			//    4    8:invokevirtual   #51  <Method void TransportPerformer.onSeekTo(long)>
			//    5   11:return          
			}

			final TransportMediator this$0;

			
			{
				this$0 = TransportMediator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TransportMediator this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    7   15:aload_0         
	//    8   16:new             #6   <Class TransportMediator$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #69  <Method void TransportMediator$1(TransportMediator)>
	//   12   24:putfield        #71  <Field TransportMediatorCallback mTransportKeyCallback>
		mKeyEventCallback = new android.view.KeyEvent.Callback() {

			public boolean onKeyDown(int i, KeyEvent keyevent)
			{
				if(TransportMediator.isMediaKey(i))
			//*   0    0:iload_1         
			//*   1    1:invokestatic    #24  <Method boolean TransportMediator.isMediaKey(int)>
			//*   2    4:ifeq            20
					return mCallbacks.onMediaButtonDown(i, keyevent);
			//    3    7:aload_0         
			//    4    8:getfield        #14  <Field TransportMediator this$0>
			//    5   11:getfield        #28  <Field TransportPerformer TransportMediator.mCallbacks>
			//    6   14:iload_1         
			//    7   15:aload_2         
			//    8   16:invokevirtual   #33  <Method boolean TransportPerformer.onMediaButtonDown(int, KeyEvent)>
			//    9   19:ireturn         
				else
					return false;
			//   10   20:iconst_0        
			//   11   21:ireturn         
			}

			public boolean onKeyLongPress(int i, KeyEvent keyevent)
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			public boolean onKeyMultiple(int i, int j, KeyEvent keyevent)
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			public boolean onKeyUp(int i, KeyEvent keyevent)
			{
				if(TransportMediator.isMediaKey(i))
			//*   0    0:iload_1         
			//*   1    1:invokestatic    #24  <Method boolean TransportMediator.isMediaKey(int)>
			//*   2    4:ifeq            20
					return mCallbacks.onMediaButtonUp(i, keyevent);
			//    3    7:aload_0         
			//    4    8:getfield        #14  <Field TransportMediator this$0>
			//    5   11:getfield        #28  <Field TransportPerformer TransportMediator.mCallbacks>
			//    6   14:iload_1         
			//    7   15:aload_2         
			//    8   16:invokevirtual   #40  <Method boolean TransportPerformer.onMediaButtonUp(int, KeyEvent)>
			//    9   19:ireturn         
				else
					return false;
			//   10   20:iconst_0        
			//   11   21:ireturn         
			}

			final TransportMediator this$0;

			
			{
				this$0 = TransportMediator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TransportMediator this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   13   27:aload_0         
	//   14   28:new             #8   <Class TransportMediator$2>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #72  <Method void TransportMediator$2(TransportMediator)>
	//   18   36:putfield        #74  <Field android.view.KeyEvent$Callback mKeyEventCallback>
		Object obj;
		if(activity != null)
	//*  19   39:aload_1         
	//*  20   40:ifnull          49
			obj = ((Object) (activity));
	//   21   43:aload_1         
	//   22   44:astore          4
		else
	//*  23   46:goto            55
			obj = ((Object) (view.getContext()));
	//   24   49:aload_2         
	//   25   50:invokevirtual   #80  <Method Context View.getContext()>
	//   26   53:astore          4
		mContext = ((Context) (obj));
	//   27   55:aload_0         
	//   28   56:aload           4
	//   29   58:putfield        #82  <Field Context mContext>
		mCallbacks = transportperformer;
	//   30   61:aload_0         
	//   31   62:aload_3         
	//   32   63:putfield        #84  <Field TransportPerformer mCallbacks>
		mAudioManager = (AudioManager)mContext.getSystemService("audio");
	//   33   66:aload_0         
	//   34   67:aload_0         
	//   35   68:getfield        #82  <Field Context mContext>
	//   36   71:ldc1            #86  <String "audio">
	//   37   73:invokevirtual   #92  <Method Object Context.getSystemService(String)>
	//   38   76:checkcast       #94  <Class AudioManager>
	//   39   79:putfield        #96  <Field AudioManager mAudioManager>
		if(activity != null)
	//*  40   82:aload_1         
	//*  41   83:ifnull          97
			view = activity.getWindow().getDecorView();
	//   42   86:aload_1         
	//   43   87:invokevirtual   #102 <Method Window Activity.getWindow()>
	//   44   90:invokevirtual   #108 <Method View Window.getDecorView()>
	//   45   93:astore_2        
	//*  46   94:goto            97
		mView = view;
	//   47   97:aload_0         
	//   48   98:aload_2         
	//   49   99:putfield        #110 <Field View mView>
		mDispatcherState = ((Object) (mView.getKeyDispatcherState()));
	//   50  102:aload_0         
	//   51  103:aload_0         
	//   52  104:getfield        #110 <Field View mView>
	//   53  107:invokevirtual   #114 <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
	//   54  110:putfield        #116 <Field Object mDispatcherState>
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  55  113:getstatic       #121 <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  116:bipush          18
	//*  57  118:icmplt          149
		{
			mController = new TransportMediatorJellybeanMR2(mContext, mAudioManager, mView, mTransportKeyCallback);
	//   58  121:aload_0         
	//   59  122:new             #123 <Class TransportMediatorJellybeanMR2>
	//   60  125:dup             
	//   61  126:aload_0         
	//   62  127:getfield        #82  <Field Context mContext>
	//   63  130:aload_0         
	//   64  131:getfield        #96  <Field AudioManager mAudioManager>
	//   65  134:aload_0         
	//   66  135:getfield        #110 <Field View mView>
	//   67  138:aload_0         
	//   68  139:getfield        #71  <Field TransportMediatorCallback mTransportKeyCallback>
	//   69  142:invokespecial   #126 <Method void TransportMediatorJellybeanMR2(Context, AudioManager, View, TransportMediatorCallback)>
	//   70  145:putfield        #128 <Field TransportMediatorJellybeanMR2 mController>
			return;
	//   71  148:return          
		} else
		{
			mController = null;
	//   72  149:aload_0         
	//   73  150:aconst_null     
	//   74  151:putfield        #128 <Field TransportMediatorJellybeanMR2 mController>
			return;
	//   75  154:return          
		}
	}

	public TransportMediator(View view, TransportPerformer transportperformer)
	{
		this(((Activity) (null)), view, transportperformer);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #56  <Method void TransportMediator(Activity, View, TransportPerformer)>
	//    5    7:return          
	}

	private TransportStateListener[] getListeners()
	{
		if(mListeners.size() <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field ArrayList mListeners>
	//*   2    4:invokevirtual   #135 <Method int ArrayList.size()>
	//*   3    7:ifgt            12
		{
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		} else
		{
			TransportStateListener atransportstatelistener[] = new TransportStateListener[mListeners.size()];
	//    6   12:aload_0         
	//    7   13:getfield        #66  <Field ArrayList mListeners>
	//    8   16:invokevirtual   #135 <Method int ArrayList.size()>
	//    9   19:anewarray       TransportStateListener[]
	//   10   22:astore_1        
			mListeners.toArray(((Object []) (atransportstatelistener)));
	//   11   23:aload_0         
	//   12   24:getfield        #66  <Field ArrayList mListeners>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #141 <Method Object[] ArrayList.toArray(Object[])>
	//   15   31:pop             
			return atransportstatelistener;
	//   16   32:aload_1         
	//   17   33:areturn         
		}
	}

	static boolean isMediaKey(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    11: default 100
	//	               79: 103
	//	               85: 103
	//	               86: 103
	//	               87: 103
	//	               88: 103
	//	               89: 103
	//	               90: 103
	//	               91: 103
	//	               126: 103
	//	               127: 103
	//	               130: 103
	//*   2  100:goto            105
		case 79: // 'O'
		case 85: // 'U'
		case 86: // 'V'
		case 87: // 'W'
		case 88: // 'X'
		case 89: // 'Y'
		case 90: // 'Z'
		case 91: // '['
		case 126: // '~'
		case 127: // '\177'
		case 130: 
			return true;
	//    3  103:iconst_1        
	//    4  104:ireturn         
		}
		return false;
	//    5  105:iconst_0        
	//    6  106:ireturn         
	}

	private void pushControllerState()
	{
		if(mController != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field TransportMediatorJellybeanMR2 mController>
	//*   2    4:ifnull          35
			mController.refreshState(mCallbacks.onIsPlaying(), mCallbacks.onGetCurrentPosition(), mCallbacks.onGetTransportControlFlags());
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field TransportMediatorJellybeanMR2 mController>
	//    5   11:aload_0         
	//    6   12:getfield        #84  <Field TransportPerformer mCallbacks>
	//    7   15:invokevirtual   #150 <Method boolean TransportPerformer.onIsPlaying()>
	//    8   18:aload_0         
	//    9   19:getfield        #84  <Field TransportPerformer mCallbacks>
	//   10   22:invokevirtual   #154 <Method long TransportPerformer.onGetCurrentPosition()>
	//   11   25:aload_0         
	//   12   26:getfield        #84  <Field TransportPerformer mCallbacks>
	//   13   29:invokevirtual   #157 <Method int TransportPerformer.onGetTransportControlFlags()>
	//   14   32:invokevirtual   #161 <Method void TransportMediatorJellybeanMR2.refreshState(boolean, long, int)>
	//   15   35:return          
	}

	private void reportPlayingChanged()
	{
		TransportStateListener atransportstatelistener[] = getListeners();
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method TransportStateListener[] getListeners()>
	//    2    4:astore_3        
		if(atransportstatelistener != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          33
		{
			int j = atransportstatelistener.length;
	//    5    9:aload_3         
	//    6   10:arraylength     
	//    7   11:istore_2        
			for(int i = 0; i < j; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:iload_2         
	//*  12   16:icmpge          33
				atransportstatelistener[i].onPlayingChanged(((TransportController) (this)));
	//   13   19:aload_3         
	//   14   20:iload_1         
	//   15   21:aaload          
	//   16   22:aload_0         
	//   17   23:invokevirtual   #168 <Method void TransportStateListener.onPlayingChanged(TransportController)>

	//   18   26:iload_1         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_1        
		}
	//*  22   30:goto            14
	//   23   33:return          
	}

	private void reportTransportControlsChanged()
	{
		TransportStateListener atransportstatelistener[] = getListeners();
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method TransportStateListener[] getListeners()>
	//    2    4:astore_3        
		if(atransportstatelistener != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          33
		{
			int j = atransportstatelistener.length;
	//    5    9:aload_3         
	//    6   10:arraylength     
	//    7   11:istore_2        
			for(int i = 0; i < j; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:iload_2         
	//*  12   16:icmpge          33
				atransportstatelistener[i].onTransportControlsChanged(((TransportController) (this)));
	//   13   19:aload_3         
	//   14   20:iload_1         
	//   15   21:aaload          
	//   16   22:aload_0         
	//   17   23:invokevirtual   #172 <Method void TransportStateListener.onTransportControlsChanged(TransportController)>

	//   18   26:iload_1         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_1        
		}
	//*  22   30:goto            14
	//   23   33:return          
	}

	public void destroy()
	{
		mController.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field TransportMediatorJellybeanMR2 mController>
	//    2    4:invokevirtual   #175 <Method void TransportMediatorJellybeanMR2.destroy()>
	//    3    7:return          
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return keyevent.dispatch(mKeyEventCallback, (android.view.KeyEvent.DispatcherState)mDispatcherState, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #74  <Field android.view.KeyEvent$Callback mKeyEventCallback>
	//    3    5:aload_0         
	//    4    6:getfield        #116 <Field Object mDispatcherState>
	//    5    9:checkcast       #179 <Class android.view.KeyEvent$DispatcherState>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #185 <Method boolean KeyEvent.dispatch(android.view.KeyEvent$Callback, android.view.KeyEvent$DispatcherState, Object)>
	//    8   16:ireturn         
	}

	public int getBufferPercentage()
	{
		return mCallbacks.onGetBufferPercentage();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field TransportPerformer mCallbacks>
	//    2    4:invokevirtual   #189 <Method int TransportPerformer.onGetBufferPercentage()>
	//    3    7:ireturn         
	}

	public long getCurrentPosition()
	{
		return mCallbacks.onGetCurrentPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field TransportPerformer mCallbacks>
	//    2    4:invokevirtual   #154 <Method long TransportPerformer.onGetCurrentPosition()>
	//    3    7:lreturn         
	}

	public long getDuration()
	{
		return mCallbacks.onGetDuration();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field TransportPerformer mCallbacks>
	//    2    4:invokevirtual   #194 <Method long TransportPerformer.onGetDuration()>
	//    3    7:lreturn         
	}

	public Object getRemoteControlClient()
	{
		if(mController != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field TransportMediatorJellybeanMR2 mController>
	//*   2    4:ifnull          15
			return mController.getRemoteControlClient();
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field TransportMediatorJellybeanMR2 mController>
	//    5   11:invokevirtual   #198 <Method Object TransportMediatorJellybeanMR2.getRemoteControlClient()>
	//    6   14:areturn         
		else
			return ((Object) (null));
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public int getTransportControlFlags()
	{
		return mCallbacks.onGetTransportControlFlags();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field TransportPerformer mCallbacks>
	//    2    4:invokevirtual   #157 <Method int TransportPerformer.onGetTransportControlFlags()>
	//    3    7:ireturn         
	}

	public boolean isPlaying()
	{
		return mCallbacks.onIsPlaying();
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field TransportPerformer mCallbacks>
	//    2    4:invokevirtual   #150 <Method boolean TransportPerformer.onIsPlaying()>
	//    3    7:ireturn         
	}

	public void pausePlaying()
	{
		if(mController != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field TransportMediatorJellybeanMR2 mController>
	//*   2    4:ifnull          14
			mController.pausePlaying();
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field TransportMediatorJellybeanMR2 mController>
	//    5   11:invokevirtual   #203 <Method void TransportMediatorJellybeanMR2.pausePlaying()>
		mCallbacks.onPause();
	//    6   14:aload_0         
	//    7   15:getfield        #84  <Field TransportPerformer mCallbacks>
	//    8   18:invokevirtual   #206 <Method void TransportPerformer.onPause()>
		pushControllerState();
	//    9   21:aload_0         
	//   10   22:invokespecial   #208 <Method void pushControllerState()>
		reportPlayingChanged();
	//   11   25:aload_0         
	//   12   26:invokespecial   #210 <Method void reportPlayingChanged()>
	//   13   29:return          
	}

	public void refreshState()
	{
		pushControllerState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #208 <Method void pushControllerState()>
		reportPlayingChanged();
	//    2    4:aload_0         
	//    3    5:invokespecial   #210 <Method void reportPlayingChanged()>
		reportTransportControlsChanged();
	//    4    8:aload_0         
	//    5    9:invokespecial   #212 <Method void reportTransportControlsChanged()>
	//    6   12:return          
	}

	public void registerStateListener(TransportStateListener transportstatelistener)
	{
		mListeners.add(((Object) (transportstatelistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ArrayList mListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #218 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void seekTo(long l)
	{
		mCallbacks.onSeekTo(l);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field TransportPerformer mCallbacks>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #223 <Method void TransportPerformer.onSeekTo(long)>
	//    4    8:return          
	}

	public void startPlaying()
	{
		if(mController != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field TransportMediatorJellybeanMR2 mController>
	//*   2    4:ifnull          14
			mController.startPlaying();
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field TransportMediatorJellybeanMR2 mController>
	//    5   11:invokevirtual   #226 <Method void TransportMediatorJellybeanMR2.startPlaying()>
		mCallbacks.onStart();
	//    6   14:aload_0         
	//    7   15:getfield        #84  <Field TransportPerformer mCallbacks>
	//    8   18:invokevirtual   #229 <Method void TransportPerformer.onStart()>
		pushControllerState();
	//    9   21:aload_0         
	//   10   22:invokespecial   #208 <Method void pushControllerState()>
		reportPlayingChanged();
	//   11   25:aload_0         
	//   12   26:invokespecial   #210 <Method void reportPlayingChanged()>
	//   13   29:return          
	}

	public void stopPlaying()
	{
		if(mController != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field TransportMediatorJellybeanMR2 mController>
	//*   2    4:ifnull          14
			mController.stopPlaying();
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field TransportMediatorJellybeanMR2 mController>
	//    5   11:invokevirtual   #232 <Method void TransportMediatorJellybeanMR2.stopPlaying()>
		mCallbacks.onStop();
	//    6   14:aload_0         
	//    7   15:getfield        #84  <Field TransportPerformer mCallbacks>
	//    8   18:invokevirtual   #235 <Method void TransportPerformer.onStop()>
		pushControllerState();
	//    9   21:aload_0         
	//   10   22:invokespecial   #208 <Method void pushControllerState()>
		reportPlayingChanged();
	//   11   25:aload_0         
	//   12   26:invokespecial   #210 <Method void reportPlayingChanged()>
	//   13   29:return          
	}

	public void unregisterStateListener(TransportStateListener transportstatelistener)
	{
		mListeners.remove(((Object) (transportstatelistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ArrayList mListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #239 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public static final int FLAG_KEY_MEDIA_FAST_FORWARD = 64;
	public static final int FLAG_KEY_MEDIA_NEXT = 128;
	public static final int FLAG_KEY_MEDIA_PAUSE = 16;
	public static final int FLAG_KEY_MEDIA_PLAY = 4;
	public static final int FLAG_KEY_MEDIA_PLAY_PAUSE = 8;
	public static final int FLAG_KEY_MEDIA_PREVIOUS = 1;
	public static final int FLAG_KEY_MEDIA_REWIND = 2;
	public static final int FLAG_KEY_MEDIA_STOP = 32;
	public static final int KEYCODE_MEDIA_PAUSE = 127;
	public static final int KEYCODE_MEDIA_PLAY = 126;
	public static final int KEYCODE_MEDIA_RECORD = 130;
	final AudioManager mAudioManager;
	final TransportPerformer mCallbacks;
	final Context mContext;
	final TransportMediatorJellybeanMR2 mController;
	final Object mDispatcherState;
	final android.view.KeyEvent.Callback mKeyEventCallback;
	final ArrayList mListeners;
	final TransportMediatorCallback mTransportKeyCallback;
	final View mView;
}
