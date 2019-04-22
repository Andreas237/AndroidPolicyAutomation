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
	//*   1    1:getfield        #18  <Field boolean mRegistered>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		switch(message.what)
	//*   4    8:aload_1         
	//*   5    9:getfield        #24  <Field int Message.what>
		{
	//*   6   12:tableswitch     1 13: default 80
	//	               1 241
	//	               2 226
	//	               3 211
	//	               4 196
	//	               5 181
	//	               6 166
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
	//    9   82:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   10   85:invokevirtual   #30  <Method void MediaControllerCompat$Callback.onSessionReady()>
			return;
	//   11   88:return          

		case 12: // '\f'
			onShuffleModeChanged(((Integer)message.obj).intValue());
	//   12   89:aload_0         
	//   13   90:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   14   93:aload_1         
	//   15   94:getfield        #34  <Field Object Message.obj>
	//   16   97:checkcast       #36  <Class Integer>
	//   17  100:invokevirtual   #40  <Method int Integer.intValue()>
	//   18  103:invokevirtual   #44  <Method void MediaControllerCompat$Callback.onShuffleModeChanged(int)>
			return;
	//   19  106:return          

		case 11: // '\013'
			onCaptioningEnabledChanged(((Boolean)message.obj).booleanValue());
	//   20  107:aload_0         
	//   21  108:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   22  111:aload_1         
	//   23  112:getfield        #34  <Field Object Message.obj>
	//   24  115:checkcast       #46  <Class Boolean>
	//   25  118:invokevirtual   #50  <Method boolean Boolean.booleanValue()>
	//   26  121:invokevirtual   #54  <Method void MediaControllerCompat$Callback.onCaptioningEnabledChanged(boolean)>
			return;
	//   27  124:return          

		case 9: // '\t'
			onRepeatModeChanged(((Integer)message.obj).intValue());
	//   28  125:aload_0         
	//   29  126:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   30  129:aload_1         
	//   31  130:getfield        #34  <Field Object Message.obj>
	//   32  133:checkcast       #36  <Class Integer>
	//   33  136:invokevirtual   #40  <Method int Integer.intValue()>
	//   34  139:invokevirtual   #57  <Method void MediaControllerCompat$Callback.onRepeatModeChanged(int)>
			return;
	//   35  142:return          

		case 8: // '\b'
			onSessionDestroyed();
	//   36  143:aload_0         
	//   37  144:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   38  147:invokevirtual   #60  <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
			return;
	//   39  150:return          

		case 7: // '\007'
			onExtrasChanged((Bundle)message.obj);
	//   40  151:aload_0         
	//   41  152:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   42  155:aload_1         
	//   43  156:getfield        #34  <Field Object Message.obj>
	//   44  159:checkcast       #62  <Class Bundle>
	//   45  162:invokevirtual   #66  <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
			return;
	//   46  165:return          

		case 6: // '\006'
			onQueueTitleChanged((CharSequence)message.obj);
	//   47  166:aload_0         
	//   48  167:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   49  170:aload_1         
	//   50  171:getfield        #34  <Field Object Message.obj>
	//   51  174:checkcast       #68  <Class CharSequence>
	//   52  177:invokevirtual   #72  <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
			return;
	//   53  180:return          

		case 5: // '\005'
			onQueueChanged((List)message.obj);
	//   54  181:aload_0         
	//   55  182:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   56  185:aload_1         
	//   57  186:getfield        #34  <Field Object Message.obj>
	//   58  189:checkcast       #74  <Class List>
	//   59  192:invokevirtual   #78  <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
			return;
	//   60  195:return          

		case 4: // '\004'
			onAudioInfoChanged((MediaControllerCompat.PlaybackInfo)message.obj);
	//   61  196:aload_0         
	//   62  197:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   63  200:aload_1         
	//   64  201:getfield        #34  <Field Object Message.obj>
	//   65  204:checkcast       #80  <Class MediaControllerCompat$PlaybackInfo>
	//   66  207:invokevirtual   #84  <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
			return;
	//   67  210:return          

		case 3: // '\003'
			onMetadataChanged((MediaMetadataCompat)message.obj);
	//   68  211:aload_0         
	//   69  212:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   70  215:aload_1         
	//   71  216:getfield        #34  <Field Object Message.obj>
	//   72  219:checkcast       #86  <Class MediaMetadataCompat>
	//   73  222:invokevirtual   #90  <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
			return;
	//   74  225:return          

		case 2: // '\002'
			onPlaybackStateChanged((PlaybackStateCompat)message.obj);
	//   75  226:aload_0         
	//   76  227:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   77  230:aload_1         
	//   78  231:getfield        #34  <Field Object Message.obj>
	//   79  234:checkcast       #92  <Class PlaybackStateCompat>
	//   80  237:invokevirtual   #96  <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
			return;
	//   81  240:return          

		case 1: // '\001'
			onSessionEvent((String)message.obj, message.getData());
	//   82  241:aload_0         
	//   83  242:getfield        #26  <Field MediaControllerCompat$Callback this$0>
	//   84  245:aload_1         
	//   85  246:getfield        #34  <Field Object Message.obj>
	//   86  249:checkcast       #98  <Class String>
	//   87  252:aload_1         
	//   88  253:invokevirtual   #102 <Method Bundle Message.getData()>
	//   89  256:invokevirtual   #106 <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
			return;
	//   90  259:return          
		}
	}

	boolean mRegistered;
	final MediaControllerCompat.Callback this$0;
}
