// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.os.*;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.exoplayer:
//			ExoPlayer, ExoPlayerImplInternal, ExoPlaybackException, MediaFormat, 
//			TrackRenderer

final class ExoPlayerImpl
	implements ExoPlayer
{

	public ExoPlayerImpl(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		Log.i("ExoPlayerImpl", "Init 1.5.15");
	//    2    4:ldc1            #12  <String "ExoPlayerImpl">
	//    3    6:ldc1            #38  <String "Init 1.5.15">
	//    4    8:invokestatic    #44  <Method int Log.i(String, String)>
	//    5   11:pop             
		playWhenReady = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #46  <Field boolean playWhenReady>
		playbackState = 1;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #48  <Field int playbackState>
	//   12   22:aload_0         
	//   13   23:new             #50  <Class CopyOnWriteArraySet>
	//   14   26:dup             
	//   15   27:invokespecial   #51  <Method void CopyOnWriteArraySet()>
	//   16   30:putfield        #53  <Field CopyOnWriteArraySet listeners>
		trackFormats = new MediaFormat[i][];
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:anewarray       MediaFormat[][]
	//   20   38:putfield        #57  <Field MediaFormat[][] trackFormats>
		selectedTrackIndices = new int[i];
	//   21   41:aload_0         
	//   22   42:iload_1         
	//   23   43:newarray        int[]
	//   24   45:putfield        #59  <Field int[] selectedTrackIndices>
	//   25   48:aload_0         
	//   26   49:new             #8   <Class ExoPlayerImpl$1>
	//   27   52:dup             
	//   28   53:aload_0         
	//   29   54:invokespecial   #62  <Method void ExoPlayerImpl$1(ExoPlayerImpl)>
	//   30   57:putfield        #64  <Field Handler eventHandler>
		internalPlayer = new ExoPlayerImplInternal(eventHandler, playWhenReady, selectedTrackIndices, j, k);
	//   31   60:aload_0         
	//   32   61:new             #66  <Class ExoPlayerImplInternal>
	//   33   64:dup             
	//   34   65:aload_0         
	//   35   66:getfield        #64  <Field Handler eventHandler>
	//   36   69:aload_0         
	//   37   70:getfield        #46  <Field boolean playWhenReady>
	//   38   73:aload_0         
	//   39   74:getfield        #59  <Field int[] selectedTrackIndices>
	//   40   77:iload_2         
	//   41   78:iload_3         
	//   42   79:invokespecial   #69  <Method void ExoPlayerImplInternal(Handler, boolean, int[], int, int)>
	//   43   82:putfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//   44   85:return          
	}

	public void addListener(ExoPlayer.Listener listener)
	{
		listeners.add(((Object) (listener)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field CopyOnWriteArraySet listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method boolean CopyOnWriteArraySet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void blockingSendMessage(ExoPlayer.ExoPlayerComponent exoplayercomponent, int i, Object obj)
	{
		internalPlayer.blockingSendMessage(exoplayercomponent, i, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #83  <Method void ExoPlayerImplInternal.blockingSendMessage(ExoPlayer$ExoPlayerComponent, int, Object)>
	//    6   10:return          
	}

	public int getBufferedPercentage()
	{
		long l1 = getBufferedPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method long getBufferedPosition()>
	//    2    4:lstore_3        
		long l2 = getDuration();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #92  <Method long getDuration()>
	//    5    9:lstore          5
		if(l1 != -1L && l2 != -1L)
	//*   6   11:lload_3         
	//*   7   12:ldc2w           #93  <Long -1L>
	//*   8   15:lcmp            
	//*   9   16:ifeq            57
	//*  10   19:lload           5
	//*  11   21:ldc2w           #93  <Long -1L>
	//*  12   24:lcmp            
	//*  13   25:ifne            31
	//*  14   28:goto            57
		{
			long l = 100L;
	//   15   31:ldc2w           #95  <Long 100L>
	//   16   34:lstore_1        
			if(l2 != 0L)
	//*  17   35:lload           5
	//*  18   37:lconst_0        
	//*  19   38:lcmp            
	//*  20   39:ifne            45
	//*  21   42:goto            54
				l = (l1 * 100L) / l2;
	//   22   45:lload_3         
	//   23   46:ldc2w           #95  <Long 100L>
	//   24   49:lmul            
	//   25   50:lload           5
	//   26   52:ldiv            
	//   27   53:lstore_1        
			return (int)l;
	//   28   54:lload_1         
	//   29   55:l2i             
	//   30   56:ireturn         
		} else
		{
			return 0;
	//   31   57:iconst_0        
	//   32   58:ireturn         
		}
	}

	public long getBufferedPosition()
	{
		return internalPlayer.getBufferedPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//    2    4:invokevirtual   #97  <Method long ExoPlayerImplInternal.getBufferedPosition()>
	//    3    7:lreturn         
	}

	public long getCurrentPosition()
	{
		return internalPlayer.getCurrentPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//    2    4:invokevirtual   #100 <Method long ExoPlayerImplInternal.getCurrentPosition()>
	//    3    7:lreturn         
	}

	public long getDuration()
	{
		return internalPlayer.getDuration();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//    2    4:invokevirtual   #101 <Method long ExoPlayerImplInternal.getDuration()>
	//    3    7:lreturn         
	}

	public boolean getPlayWhenReady()
	{
		return playWhenReady;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean playWhenReady>
	//    2    4:ireturn         
	}

	public Looper getPlaybackLooper()
	{
		return internalPlayer.getPlaybackLooper();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//    2    4:invokevirtual   #107 <Method Looper ExoPlayerImplInternal.getPlaybackLooper()>
	//    3    7:areturn         
	}

	public int getPlaybackState()
	{
		return playbackState;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int playbackState>
	//    2    4:ireturn         
	}

	public int getSelectedTrack(int i)
	{
		return selectedTrackIndices[i];
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int[] selectedTrackIndices>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:ireturn         
	}

	public int getTrackCount(int i)
	{
		MediaFormat amediaformat[][] = trackFormats;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field MediaFormat[][] trackFormats>
	//    2    4:astore_2        
		if(amediaformat[i] != null)
	//*   3    5:aload_2         
	//*   4    6:iload_1         
	//*   5    7:aaload          
	//*   6    8:ifnull          16
			return amediaformat[i].length;
	//    7   11:aload_2         
	//    8   12:iload_1         
	//    9   13:aaload          
	//   10   14:arraylength     
	//   11   15:ireturn         
		else
			return 0;
	//   12   16:iconst_0        
	//   13   17:ireturn         
	}

	public MediaFormat getTrackFormat(int i, int j)
	{
		return trackFormats[i][j];
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field MediaFormat[][] trackFormats>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:iload_2         
	//    5    7:aaload          
	//    6    8:areturn         
	}

	void handleEvent(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #120 <Field int Message.what>
		{
	//*   2    4:tableswitch     1 4: default 36
	//	               1 181
	//	               2 131
	//	               3 80
	//	               4 37
		default:
			return;
	//    3   36:return          

		case 4: // '\004'
			message = ((Message) ((ExoPlaybackException)message.obj));
	//    4   37:aload_1         
	//    5   38:getfield        #124 <Field Object Message.obj>
	//    6   41:checkcast       #126 <Class ExoPlaybackException>
	//    7   44:astore_1        
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((ExoPlayer.Listener)iterator.next()).onPlayerError(((ExoPlaybackException) (message))));
	//    8   45:aload_0         
	//    9   46:getfield        #53  <Field CopyOnWriteArraySet listeners>
	//   10   49:invokevirtual   #130 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   11   52:astore_2        
	//   12   53:aload_2         
	//   13   54:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//   14   59:ifeq            250
	//   15   62:aload_2         
	//   16   63:invokeinterface #139 <Method Object Iterator.next()>
	//   17   68:checkcast       #141 <Class ExoPlayer$Listener>
	//   18   71:aload_1         
	//   19   72:invokeinterface #145 <Method void ExoPlayer$Listener.onPlayerError(ExoPlaybackException)>
			break;
	//   20   77:goto            53

		case 3: // '\003'
			pendingPlayWhenReadyAcks = pendingPlayWhenReadyAcks - 1;
	//   21   80:aload_0         
	//   22   81:aload_0         
	//   23   82:getfield        #147 <Field int pendingPlayWhenReadyAcks>
	//   24   85:iconst_1        
	//   25   86:isub            
	//   26   87:putfield        #147 <Field int pendingPlayWhenReadyAcks>
			if(pendingPlayWhenReadyAcks != 0)
				break;
	//   27   90:aload_0         
	//   28   91:getfield        #147 <Field int pendingPlayWhenReadyAcks>
	//   29   94:ifne            250
			for(message = ((Message) (listeners.iterator())); ((Iterator) (message)).hasNext(); ((ExoPlayer.Listener)((Iterator) (message)).next()).onPlayWhenReadyCommitted());
	//   30   97:aload_0         
	//   31   98:getfield        #53  <Field CopyOnWriteArraySet listeners>
	//   32  101:invokevirtual   #130 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   33  104:astore_1        
	//   34  105:aload_1         
	//   35  106:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//   36  111:ifeq            250
	//   37  114:aload_1         
	//   38  115:invokeinterface #139 <Method Object Iterator.next()>
	//   39  120:checkcast       #141 <Class ExoPlayer$Listener>
	//   40  123:invokeinterface #150 <Method void ExoPlayer$Listener.onPlayWhenReadyCommitted()>
			break;
	//   41  128:goto            105

		case 2: // '\002'
			playbackState = message.arg1;
	//   42  131:aload_0         
	//   43  132:aload_1         
	//   44  133:getfield        #153 <Field int Message.arg1>
	//   45  136:putfield        #48  <Field int playbackState>
			for(message = ((Message) (listeners.iterator())); ((Iterator) (message)).hasNext(); ((ExoPlayer.Listener)((Iterator) (message)).next()).onPlayerStateChanged(playWhenReady, playbackState));
	//   46  139:aload_0         
	//   47  140:getfield        #53  <Field CopyOnWriteArraySet listeners>
	//   48  143:invokevirtual   #130 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   49  146:astore_1        
	//   50  147:aload_1         
	//   51  148:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//   52  153:ifeq            250
	//   53  156:aload_1         
	//   54  157:invokeinterface #139 <Method Object Iterator.next()>
	//   55  162:checkcast       #141 <Class ExoPlayer$Listener>
	//   56  165:aload_0         
	//   57  166:getfield        #46  <Field boolean playWhenReady>
	//   58  169:aload_0         
	//   59  170:getfield        #48  <Field int playbackState>
	//   60  173:invokeinterface #157 <Method void ExoPlayer$Listener.onPlayerStateChanged(boolean, int)>
			break;
	//   61  178:goto            147

		case 1: // '\001'
			Object obj = message.obj;
	//   62  181:aload_1         
	//   63  182:getfield        #124 <Field Object Message.obj>
	//   64  185:astore_2        
			MediaFormat amediaformat[][] = trackFormats;
	//   65  186:aload_0         
	//   66  187:getfield        #57  <Field MediaFormat[][] trackFormats>
	//   67  190:astore_3        
			System.arraycopy(obj, 0, ((Object) (amediaformat)), 0, amediaformat.length);
	//   68  191:aload_2         
	//   69  192:iconst_0        
	//   70  193:aload_3         
	//   71  194:iconst_0        
	//   72  195:aload_3         
	//   73  196:arraylength     
	//   74  197:invokestatic    #163 <Method void System.arraycopy(Object, int, Object, int, int)>
			playbackState = message.arg1;
	//   75  200:aload_0         
	//   76  201:aload_1         
	//   77  202:getfield        #153 <Field int Message.arg1>
	//   78  205:putfield        #48  <Field int playbackState>
			for(message = ((Message) (listeners.iterator())); ((Iterator) (message)).hasNext(); ((ExoPlayer.Listener)((Iterator) (message)).next()).onPlayerStateChanged(playWhenReady, playbackState));
	//   79  208:aload_0         
	//   80  209:getfield        #53  <Field CopyOnWriteArraySet listeners>
	//   81  212:invokevirtual   #130 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   82  215:astore_1        
	//   83  216:aload_1         
	//   84  217:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//   85  222:ifeq            250
	//   86  225:aload_1         
	//   87  226:invokeinterface #139 <Method Object Iterator.next()>
	//   88  231:checkcast       #141 <Class ExoPlayer$Listener>
	//   89  234:aload_0         
	//   90  235:getfield        #46  <Field boolean playWhenReady>
	//   91  238:aload_0         
	//   92  239:getfield        #48  <Field int playbackState>
	//   93  242:invokeinterface #157 <Method void ExoPlayer$Listener.onPlayerStateChanged(boolean, int)>
			break;
		}
	//*  94  247:goto            216
	//   95  250:return          
	}

	public boolean isPlayWhenReadyCommitted()
	{
		return pendingPlayWhenReadyAcks == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field int pendingPlayWhenReadyAcks>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public transient void prepare(TrackRenderer atrackrenderer[])
	{
		Arrays.fill(((Object []) (trackFormats)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field MediaFormat[][] trackFormats>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #172 <Method void Arrays.fill(Object[], Object)>
		internalPlayer.prepare(atrackrenderer);
	//    4    8:aload_0         
	//    5    9:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #174 <Method void ExoPlayerImplInternal.prepare(TrackRenderer[])>
	//    8   16:return          
	}

	public void release()
	{
		internalPlayer.release();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//    2    4:invokevirtual   #177 <Method void ExoPlayerImplInternal.release()>
		eventHandler.removeCallbacksAndMessages(((Object) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field Handler eventHandler>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #183 <Method void Handler.removeCallbacksAndMessages(Object)>
	//    7   15:return          
	}

	public void removeListener(ExoPlayer.Listener listener)
	{
		listeners.remove(((Object) (listener)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field CopyOnWriteArraySet listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #187 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void seekTo(long l)
	{
		internalPlayer.seekTo(l);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #191 <Method void ExoPlayerImplInternal.seekTo(long)>
	//    4    8:return          
	}

	public void sendMessage(ExoPlayer.ExoPlayerComponent exoplayercomponent, int i, Object obj)
	{
		internalPlayer.sendMessage(exoplayercomponent, i, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #194 <Method void ExoPlayerImplInternal.sendMessage(ExoPlayer$ExoPlayerComponent, int, Object)>
	//    6   10:return          
	}

	public void setPlayWhenReady(boolean flag)
	{
		if(playWhenReady != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field boolean playWhenReady>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          70
		{
			playWhenReady = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #46  <Field boolean playWhenReady>
			pendingPlayWhenReadyAcks = pendingPlayWhenReadyAcks + 1;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #147 <Field int pendingPlayWhenReadyAcks>
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:putfield        #147 <Field int pendingPlayWhenReadyAcks>
			internalPlayer.setPlayWhenReady(flag);
	//   13   23:aload_0         
	//   14   24:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//   15   27:iload_1         
	//   16   28:invokevirtual   #198 <Method void ExoPlayerImplInternal.setPlayWhenReady(boolean)>
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((ExoPlayer.Listener)iterator.next()).onPlayerStateChanged(flag, playbackState));
	//   17   31:aload_0         
	//   18   32:getfield        #53  <Field CopyOnWriteArraySet listeners>
	//   19   35:invokevirtual   #130 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   20   38:astore_2        
	//   21   39:aload_2         
	//   22   40:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//   23   45:ifeq            70
	//   24   48:aload_2         
	//   25   49:invokeinterface #139 <Method Object Iterator.next()>
	//   26   54:checkcast       #141 <Class ExoPlayer$Listener>
	//   27   57:iload_1         
	//   28   58:aload_0         
	//   29   59:getfield        #48  <Field int playbackState>
	//   30   62:invokeinterface #157 <Method void ExoPlayer$Listener.onPlayerStateChanged(boolean, int)>
		}
	//*  31   67:goto            39
	//   32   70:return          
	}

	public void setSelectedTrack(int i, int j)
	{
		int ai[] = selectedTrackIndices;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int[] selectedTrackIndices>
	//    2    4:astore_3        
		if(ai[i] != j)
	//*   3    5:aload_3         
	//*   4    6:iload_1         
	//*   5    7:iaload          
	//*   6    8:iload_2         
	//*   7    9:icmpeq          25
		{
			ai[i] = j;
	//    8   12:aload_3         
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:iastore         
			internalPlayer.setRendererSelectedTrack(i, j);
	//   12   16:aload_0         
	//   13   17:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//   14   20:iload_1         
	//   15   21:iload_2         
	//   16   22:invokevirtual   #203 <Method void ExoPlayerImplInternal.setRendererSelectedTrack(int, int)>
		}
	//   17   25:return          
	}

	public void stop()
	{
		internalPlayer.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ExoPlayerImplInternal internalPlayer>
	//    2    4:invokevirtual   #206 <Method void ExoPlayerImplInternal.stop()>
	//    3    7:return          
	}

	private static final String TAG = "ExoPlayerImpl";
	private final Handler eventHandler = new Handler() {

		public void handleMessage(Message message)
		{
			handleEvent(message);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ExoPlayerImpl this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #23  <Method void ExoPlayerImpl.handleEvent(Message)>
		//    4    8:return          
		}

		final ExoPlayerImpl this$0;

			
			{
				this$0 = ExoPlayerImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ExoPlayerImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Handler()>
			//    5    9:return          
			}
	}
;
	private final ExoPlayerImplInternal internalPlayer;
	private final CopyOnWriteArraySet listeners = new CopyOnWriteArraySet();
	private int pendingPlayWhenReadyAcks;
	private boolean playWhenReady;
	private int playbackState;
	private final int selectedTrackIndices[];
	private final MediaFormat trackFormats[][];
}
