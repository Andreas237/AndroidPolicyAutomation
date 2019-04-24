// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, PlaybackStateCompat

class MediaControllerCompat$Callback$MessageHandler extends Handler
{

	public void handleMessage(Message message)
	{
		if(!mRegistered)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field MediaControllerCompat$Callback this$0>
	//*   2    4:getfield        #47  <Field boolean MediaControllerCompat$Callback.mRegistered>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		switch(message.what)
	//*   5   11:aload_1         
	//*   6   12:getfield        #52  <Field int Message.what>
		{
	//*   7   15:tableswitch     1 10: default 68
	//	               1 69
	//	               2 88
	//	               3 103
	//	               4 199
	//	               5 118
	//	               6 133
	//	               7 184
	//	               8 214
	//	               9 148
	//	               10 166
		default:
			return;
	//    8   68:return          

		case 1: // '\001'
			onSessionEvent((String)message.obj, message.getData());
	//    9   69:aload_0         
	//   10   70:getfield        #37  <Field MediaControllerCompat$Callback this$0>
	//   11   73:aload_1         
	//   12   74:getfield        #56  <Field Object Message.obj>
	//   13   77:checkcast       #58  <Class String>
	//   14   80:aload_1         
	//   15   81:invokevirtual   #62  <Method Bundle Message.getData()>
	//   16   84:invokevirtual   #66  <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
			return;
	//   17   87:return          

		case 2: // '\002'
			onPlaybackStateChanged((PlaybackStateCompat)message.obj);
	//   18   88:aload_0         
	//   19   89:getfield        #37  <Field MediaControllerCompat$Callback this$0>
	//   20   92:aload_1         
	//   21   93:getfield        #56  <Field Object Message.obj>
	//   22   96:checkcast       #68  <Class PlaybackStateCompat>
	//   23   99:invokevirtual   #72  <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
			return;
	//   24  102:return          

		case 3: // '\003'
			onMetadataChanged((MediaMetadataCompat)message.obj);
	//   25  103:aload_0         
	//   26  104:getfield        #37  <Field MediaControllerCompat$Callback this$0>
	//   27  107:aload_1         
	//   28  108:getfield        #56  <Field Object Message.obj>
	//   29  111:checkcast       #74  <Class MediaMetadataCompat>
	//   30  114:invokevirtual   #78  <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
			return;
	//   31  117:return          

		case 5: // '\005'
			onQueueChanged((List)message.obj);
	//   32  118:aload_0         
	//   33  119:getfield        #37  <Field MediaControllerCompat$Callback this$0>
	//   34  122:aload_1         
	//   35  123:getfield        #56  <Field Object Message.obj>
	//   36  126:checkcast       #80  <Class List>
	//   37  129:invokevirtual   #84  <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
			return;
	//   38  132:return          

		case 6: // '\006'
			onQueueTitleChanged((CharSequence)message.obj);
	//   39  133:aload_0         
	//   40  134:getfield        #37  <Field MediaControllerCompat$Callback this$0>
	//   41  137:aload_1         
	//   42  138:getfield        #56  <Field Object Message.obj>
	//   43  141:checkcast       #86  <Class CharSequence>
	//   44  144:invokevirtual   #90  <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
			return;
	//   45  147:return          

		case 9: // '\t'
			onRepeatModeChanged(((Integer)message.obj).intValue());
	//   46  148:aload_0         
	//   47  149:getfield        #37  <Field MediaControllerCompat$Callback this$0>
	//   48  152:aload_1         
	//   49  153:getfield        #56  <Field Object Message.obj>
	//   50  156:checkcast       #92  <Class Integer>
	//   51  159:invokevirtual   #96  <Method int Integer.intValue()>
	//   52  162:invokevirtual   #100 <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
			return;
	//   53  165:return          

		case 10: // '\n'
			onShuffleModeChanged(((Boolean)message.obj).booleanValue());
	//   54  166:aload_0         
	//   55  167:getfield        #37  <Field MediaControllerCompat$Callback this$0>
	//   56  170:aload_1         
	//   57  171:getfield        #56  <Field Object Message.obj>
	//   58  174:checkcast       #102 <Class Boolean>
	//   59  177:invokevirtual   #106 <Method boolean Boolean.booleanValue()>
	//   60  180:invokevirtual   #110 <Method void MediaControllerCompat$Callback.onShuffleModeChanged(boolean)>
			return;
	//   61  183:return          

		case 7: // '\007'
			onExtrasChanged((Bundle)message.obj);
	//   62  184:aload_0         
	//   63  185:getfield        #37  <Field MediaControllerCompat$Callback this$0>
	//   64  188:aload_1         
	//   65  189:getfield        #56  <Field Object Message.obj>
	//   66  192:checkcast       #112 <Class Bundle>
	//   67  195:invokevirtual   #116 <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
			return;
	//   68  198:return          

		case 4: // '\004'
			onAudioInfoChanged((MediaControllerCompat.PlaybackInfo)message.obj);
	//   69  199:aload_0         
	//   70  200:getfield        #37  <Field MediaControllerCompat$Callback this$0>
	//   71  203:aload_1         
	//   72  204:getfield        #56  <Field Object Message.obj>
	//   73  207:checkcast       #118 <Class MediaControllerCompat$PlaybackInfo>
	//   74  210:invokevirtual   #122 <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
			return;
	//   75  213:return          

		case 8: // '\b'
			onSessionDestroyed();
	//   76  214:aload_0         
	//   77  215:getfield        #37  <Field MediaControllerCompat$Callback this$0>
	//   78  218:invokevirtual   #126 <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
			return;
	//   79  221:return          
		}
	}

	public void post(int i, Object obj, Bundle bundle)
	{
		obj = ((Object) (obtainMessage(i, obj)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #132 <Method Message obtainMessage(int, Object)>
	//    4    6:astore_2        
		((Message) (obj)).setData(bundle);
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #135 <Method void Message.setData(Bundle)>
		((Message) (obj)).sendToTarget();
	//    8   12:aload_2         
	//    9   13:invokevirtual   #138 <Method void Message.sendToTarget()>
	//   10   16:return          
	}

	private static final int MSG_DESTROYED = 8;
	private static final int MSG_EVENT = 1;
	private static final int MSG_UPDATE_EXTRAS = 7;
	private static final int MSG_UPDATE_METADATA = 3;
	private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
	private static final int MSG_UPDATE_QUEUE = 5;
	private static final int MSG_UPDATE_QUEUE_TITLE = 6;
	private static final int MSG_UPDATE_REPEAT_MODE = 9;
	private static final int MSG_UPDATE_SHUFFLE_MODE = 10;
	private static final int MSG_UPDATE_VOLUME = 4;
	final MediaControllerCompat.Callback this$0;

	public MediaControllerCompat$Callback$MessageHandler(Looper looper)
	{
		this$0 = MediaControllerCompat.Callback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field MediaControllerCompat$Callback this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #40  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
