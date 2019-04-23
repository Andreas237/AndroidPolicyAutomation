// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, MediaSessionCompat, PlaybackStateCompat

private class MediaControllerCompat$Callback$MessageHandler extends Handler
{

	public void handleMessage(Message message)
	{
		if(!mRegistered)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field boolean mRegistered>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		switch(message.what)
	//*   4    8:aload_1         
	//*   5    9:getfield        #56  <Field int Message.what>
		{
	//*   6   12:tableswitch     1 13: default 80
	//	               1 247
	//	               2 232
	//	               3 217
	//	               4 202
	//	               5 187
	//	               6 172
	//	               7 151
	//	               8 143
	//	               9 125
	//	               10 80
	//	               11 107
	//	               12 89
	//	               13 81
		case 10: // '\n'
		default:
			return;
	//    7   80:return          

		case 13: // '\r'
			onSessionReady();
	//    8   81:aload_0         
	//    9   82:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   10   85:invokevirtual   #60  <Method void MediaControllerCompat$Callback.onSessionReady()>
			return;
	//   11   88:return          

		case 12: // '\f'
			onShuffleModeChanged(((Integer)message.obj).intValue());
	//   12   89:aload_0         
	//   13   90:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   14   93:aload_1         
	//   15   94:getfield        #64  <Field Object Message.obj>
	//   16   97:checkcast       #66  <Class Integer>
	//   17  100:invokevirtual   #70  <Method int Integer.intValue()>
	//   18  103:invokevirtual   #74  <Method void MediaControllerCompat$Callback.onShuffleModeChanged(int)>
			return;
	//   19  106:return          

		case 11: // '\013'
			onCaptioningEnabledChanged(((Boolean)message.obj).booleanValue());
	//   20  107:aload_0         
	//   21  108:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   22  111:aload_1         
	//   23  112:getfield        #64  <Field Object Message.obj>
	//   24  115:checkcast       #76  <Class Boolean>
	//   25  118:invokevirtual   #80  <Method boolean Boolean.booleanValue()>
	//   26  121:invokevirtual   #84  <Method void MediaControllerCompat$Callback.onCaptioningEnabledChanged(boolean)>
			return;
	//   27  124:return          

		case 9: // '\t'
			onRepeatModeChanged(((Integer)message.obj).intValue());
	//   28  125:aload_0         
	//   29  126:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   30  129:aload_1         
	//   31  130:getfield        #64  <Field Object Message.obj>
	//   32  133:checkcast       #66  <Class Integer>
	//   33  136:invokevirtual   #70  <Method int Integer.intValue()>
	//   34  139:invokevirtual   #87  <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
			return;
	//   35  142:return          

		case 8: // '\b'
			onSessionDestroyed();
	//   36  143:aload_0         
	//   37  144:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   38  147:invokevirtual   #90  <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
			return;
	//   39  150:return          

		case 7: // '\007'
			message = ((Message) ((Bundle)message.obj));
	//   40  151:aload_1         
	//   41  152:getfield        #64  <Field Object Message.obj>
	//   42  155:checkcast       #92  <Class Bundle>
	//   43  158:astore_1        
			MediaSessionCompat.ensureClassLoader(((Bundle) (message)));
	//   44  159:aload_1         
	//   45  160:invokestatic    #98  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			onExtrasChanged(((Bundle) (message)));
	//   46  163:aload_0         
	//   47  164:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   48  167:aload_1         
	//   49  168:invokevirtual   #101 <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
			return;
	//   50  171:return          

		case 6: // '\006'
			onQueueTitleChanged((CharSequence)message.obj);
	//   51  172:aload_0         
	//   52  173:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   53  176:aload_1         
	//   54  177:getfield        #64  <Field Object Message.obj>
	//   55  180:checkcast       #103 <Class CharSequence>
	//   56  183:invokevirtual   #107 <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
			return;
	//   57  186:return          

		case 5: // '\005'
			onQueueChanged((List)message.obj);
	//   58  187:aload_0         
	//   59  188:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   60  191:aload_1         
	//   61  192:getfield        #64  <Field Object Message.obj>
	//   62  195:checkcast       #109 <Class List>
	//   63  198:invokevirtual   #113 <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
			return;
	//   64  201:return          

		case 4: // '\004'
			onAudioInfoChanged((MediaControllerCompat.PlaybackInfo)message.obj);
	//   65  202:aload_0         
	//   66  203:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   67  206:aload_1         
	//   68  207:getfield        #64  <Field Object Message.obj>
	//   69  210:checkcast       #115 <Class MediaControllerCompat$PlaybackInfo>
	//   70  213:invokevirtual   #119 <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
			return;
	//   71  216:return          

		case 3: // '\003'
			onMetadataChanged((MediaMetadataCompat)message.obj);
	//   72  217:aload_0         
	//   73  218:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   74  221:aload_1         
	//   75  222:getfield        #64  <Field Object Message.obj>
	//   76  225:checkcast       #121 <Class MediaMetadataCompat>
	//   77  228:invokevirtual   #125 <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
			return;
	//   78  231:return          

		case 2: // '\002'
			onPlaybackStateChanged((PlaybackStateCompat)message.obj);
	//   79  232:aload_0         
	//   80  233:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   81  236:aload_1         
	//   82  237:getfield        #64  <Field Object Message.obj>
	//   83  240:checkcast       #127 <Class PlaybackStateCompat>
	//   84  243:invokevirtual   #131 <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
			return;
	//   85  246:return          

		case 1: // '\001'
			Bundle bundle = message.getData();
	//   86  247:aload_1         
	//   87  248:invokevirtual   #135 <Method Bundle Message.getData()>
	//   88  251:astore_2        
			MediaSessionCompat.ensureClassLoader(bundle);
	//   89  252:aload_2         
	//   90  253:invokestatic    #98  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			onSessionEvent((String)message.obj, bundle);
	//   91  256:aload_0         
	//   92  257:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   93  260:aload_1         
	//   94  261:getfield        #64  <Field Object Message.obj>
	//   95  264:checkcast       #137 <Class String>
	//   96  267:aload_2         
	//   97  268:invokevirtual   #141 <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
			return;
	//   98  271:return          
		}
	}

	private static final int MSG_DESTROYED = 8;
	private static final int MSG_EVENT = 1;
	private static final int MSG_SESSION_READY = 13;
	private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;
	private static final int MSG_UPDATE_EXTRAS = 7;
	private static final int MSG_UPDATE_METADATA = 3;
	private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
	private static final int MSG_UPDATE_QUEUE = 5;
	private static final int MSG_UPDATE_QUEUE_TITLE = 6;
	private static final int MSG_UPDATE_REPEAT_MODE = 9;
	private static final int MSG_UPDATE_SHUFFLE_MODE = 12;
	private static final int MSG_UPDATE_VOLUME = 4;
	boolean mRegistered;
	final MediaControllerCompat.Callback this$0;

	MediaControllerCompat$Callback$MessageHandler(Looper looper)
	{
		this$0 = MediaControllerCompat.Callback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field MediaControllerCompat$Callback this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #46  <Method void Handler(Looper)>
		mRegistered = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #48  <Field boolean mRegistered>
	//    9   15:return          
	}
}
