// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, PlaybackStateCompat

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
	//*   6   12:tableswitch     1 12: default 76
	//	               1 77
	//	               2 96
	//	               3 111
	//	               4 243
	//	               5 126
	//	               6 141
	//	               7 228
	//	               8 258
	//	               9 174
	//	               10 192
	//	               11 156
	//	               12 210
		default:
			return;
	//    7   76:return          

		case 1: // '\001'
			onSessionEvent((String)message.obj, message.getData());
	//    8   77:aload_0         
	//    9   78:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   10   81:aload_1         
	//   11   82:getfield        #60  <Field Object Message.obj>
	//   12   85:checkcast       #62  <Class String>
	//   13   88:aload_1         
	//   14   89:invokevirtual   #66  <Method Bundle Message.getData()>
	//   15   92:invokevirtual   #70  <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
			return;
	//   16   95:return          

		case 2: // '\002'
			onPlaybackStateChanged((PlaybackStateCompat)message.obj);
	//   17   96:aload_0         
	//   18   97:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   19  100:aload_1         
	//   20  101:getfield        #60  <Field Object Message.obj>
	//   21  104:checkcast       #72  <Class PlaybackStateCompat>
	//   22  107:invokevirtual   #76  <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
			return;
	//   23  110:return          

		case 3: // '\003'
			onMetadataChanged((MediaMetadataCompat)message.obj);
	//   24  111:aload_0         
	//   25  112:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   26  115:aload_1         
	//   27  116:getfield        #60  <Field Object Message.obj>
	//   28  119:checkcast       #78  <Class MediaMetadataCompat>
	//   29  122:invokevirtual   #82  <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
			return;
	//   30  125:return          

		case 5: // '\005'
			onQueueChanged((List)message.obj);
	//   31  126:aload_0         
	//   32  127:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   33  130:aload_1         
	//   34  131:getfield        #60  <Field Object Message.obj>
	//   35  134:checkcast       #84  <Class List>
	//   36  137:invokevirtual   #88  <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
			return;
	//   37  140:return          

		case 6: // '\006'
			onQueueTitleChanged((CharSequence)message.obj);
	//   38  141:aload_0         
	//   39  142:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   40  145:aload_1         
	//   41  146:getfield        #60  <Field Object Message.obj>
	//   42  149:checkcast       #90  <Class CharSequence>
	//   43  152:invokevirtual   #94  <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
			return;
	//   44  155:return          

		case 11: // '\013'
			onCaptioningEnabledChanged(((Boolean)message.obj).booleanValue());
	//   45  156:aload_0         
	//   46  157:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   47  160:aload_1         
	//   48  161:getfield        #60  <Field Object Message.obj>
	//   49  164:checkcast       #96  <Class Boolean>
	//   50  167:invokevirtual   #100 <Method boolean Boolean.booleanValue()>
	//   51  170:invokevirtual   #104 <Method void MediaControllerCompat$Callback.onCaptioningEnabledChanged(boolean)>
			return;
	//   52  173:return          

		case 9: // '\t'
			onRepeatModeChanged(((Integer)message.obj).intValue());
	//   53  174:aload_0         
	//   54  175:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   55  178:aload_1         
	//   56  179:getfield        #60  <Field Object Message.obj>
	//   57  182:checkcast       #106 <Class Integer>
	//   58  185:invokevirtual   #110 <Method int Integer.intValue()>
	//   59  188:invokevirtual   #114 <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
			return;
	//   60  191:return          

		case 10: // '\n'
			onShuffleModeChanged(((Boolean)message.obj).booleanValue());
	//   61  192:aload_0         
	//   62  193:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   63  196:aload_1         
	//   64  197:getfield        #60  <Field Object Message.obj>
	//   65  200:checkcast       #96  <Class Boolean>
	//   66  203:invokevirtual   #100 <Method boolean Boolean.booleanValue()>
	//   67  206:invokevirtual   #117 <Method void MediaControllerCompat$Callback.onShuffleModeChanged(boolean)>
			return;
	//   68  209:return          

		case 12: // '\f'
			onShuffleModeChanged(((Integer)message.obj).intValue());
	//   69  210:aload_0         
	//   70  211:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   71  214:aload_1         
	//   72  215:getfield        #60  <Field Object Message.obj>
	//   73  218:checkcast       #106 <Class Integer>
	//   74  221:invokevirtual   #110 <Method int Integer.intValue()>
	//   75  224:invokevirtual   #119 <Method void MediaControllerCompat$Callback.onShuffleModeChanged(int)>
			return;
	//   76  227:return          

		case 7: // '\007'
			onExtrasChanged((Bundle)message.obj);
	//   77  228:aload_0         
	//   78  229:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   79  232:aload_1         
	//   80  233:getfield        #60  <Field Object Message.obj>
	//   81  236:checkcast       #121 <Class Bundle>
	//   82  239:invokevirtual   #125 <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
			return;
	//   83  242:return          

		case 4: // '\004'
			onAudioInfoChanged((MediaControllerCompat.PlaybackInfo)message.obj);
	//   84  243:aload_0         
	//   85  244:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   86  247:aload_1         
	//   87  248:getfield        #60  <Field Object Message.obj>
	//   88  251:checkcast       #127 <Class MediaControllerCompat$PlaybackInfo>
	//   89  254:invokevirtual   #131 <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
			return;
	//   90  257:return          

		case 8: // '\b'
			onSessionDestroyed();
	//   91  258:aload_0         
	//   92  259:getfield        #43  <Field MediaControllerCompat$Callback this$0>
	//   93  262:invokevirtual   #135 <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
			return;
	//   94  265:return          
		}
	}

	private static final int MSG_DESTROYED = 8;
	private static final int MSG_EVENT = 1;
	private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;
	private static final int MSG_UPDATE_EXTRAS = 7;
	private static final int MSG_UPDATE_METADATA = 3;
	private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
	private static final int MSG_UPDATE_QUEUE = 5;
	private static final int MSG_UPDATE_QUEUE_TITLE = 6;
	private static final int MSG_UPDATE_REPEAT_MODE = 9;
	private static final int MSG_UPDATE_SHUFFLE_MODE = 12;
	private static final int MSG_UPDATE_SHUFFLE_MODE_DEPRECATED = 10;
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
