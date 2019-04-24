// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.VideoView;
import com.comscore.utils.CSLog;
import java.util.HashMap;
import java.util.Timer;

// Referenced classes of package com.comscore.streaming:
//			o, m, StreamSenseEventType, StreamSense, 
//			n

public class StreamSenseVideoView extends VideoView
{

	public StreamSenseVideoView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void VideoView(Context)>
		a = "StreamSenseVideoView";
	//    3    5:aload_0         
	//    4    6:ldc1            #33  <String "StreamSenseVideoView">
	//    5    8:putfield        #35  <Field String a>
		b = true;
	//    6   11:aload_0         
	//    7   12:iconst_1        
	//    8   13:putfield        #37  <Field boolean b>
		c = 500;
	//    9   16:aload_0         
	//   10   17:sipush          500
	//   11   20:putfield        #39  <Field int c>
		d = 500;
	//   12   23:aload_0         
	//   13   24:sipush          500
	//   14   27:putfield        #41  <Field int d>
		e = -1L;
	//   15   30:aload_0         
	//   16   31:ldc2w           #42  <Long -1L>
	//   17   34:putfield        #45  <Field long e>
		f = null;
	//   18   37:aload_0         
	//   19   38:aconst_null     
	//   20   39:putfield        #47  <Field StreamSense f>
		g = "0x0";
	//   21   42:aload_0         
	//   22   43:ldc1            #49  <String "0x0">
	//   23   45:putfield        #51  <Field String g>
		h = 0L;
	//   24   48:aload_0         
	//   25   49:lconst_0        
	//   26   50:putfield        #53  <Field long h>
		i = -1L;
	//   27   53:aload_0         
	//   28   54:ldc2w           #42  <Long -1L>
	//   29   57:putfield        #55  <Field long i>
		k = false;
	//   30   60:aload_0         
	//   31   61:iconst_0        
	//   32   62:putfield        #57  <Field boolean k>
		l = null;
	//   33   65:aload_0         
	//   34   66:aconst_null     
	//   35   67:putfield        #59  <Field Timer l>
		m = null;
	//   36   70:aload_0         
	//   37   71:aconst_null     
	//   38   72:putfield        #61  <Field Timer m>
		n = null;
	//   39   75:aload_0         
	//   40   76:aconst_null     
	//   41   77:putfield        #63  <Field android.media.MediaPlayer$OnCompletionListener n>
		o = ((android.media.MediaPlayer.OnCompletionListener) (new o(this)));
	//   42   80:aload_0         
	//   43   81:new             #65  <Class o>
	//   44   84:dup             
	//   45   85:aload_0         
	//   46   86:invokespecial   #68  <Method void o(StreamSenseVideoView)>
	//   47   89:putfield        #70  <Field android.media.MediaPlayer$OnCompletionListener o>
		h();
	//   48   92:aload_0         
	//   49   93:invokespecial   #73  <Method void h()>
	//   50   96:return          
	}

	public StreamSenseVideoView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #77  <Method void VideoView(Context, AttributeSet)>
		a = "StreamSenseVideoView";
	//    4    6:aload_0         
	//    5    7:ldc1            #33  <String "StreamSenseVideoView">
	//    6    9:putfield        #35  <Field String a>
		b = true;
	//    7   12:aload_0         
	//    8   13:iconst_1        
	//    9   14:putfield        #37  <Field boolean b>
		c = 500;
	//   10   17:aload_0         
	//   11   18:sipush          500
	//   12   21:putfield        #39  <Field int c>
		d = 500;
	//   13   24:aload_0         
	//   14   25:sipush          500
	//   15   28:putfield        #41  <Field int d>
		e = -1L;
	//   16   31:aload_0         
	//   17   32:ldc2w           #42  <Long -1L>
	//   18   35:putfield        #45  <Field long e>
		f = null;
	//   19   38:aload_0         
	//   20   39:aconst_null     
	//   21   40:putfield        #47  <Field StreamSense f>
		g = "0x0";
	//   22   43:aload_0         
	//   23   44:ldc1            #49  <String "0x0">
	//   24   46:putfield        #51  <Field String g>
		h = 0L;
	//   25   49:aload_0         
	//   26   50:lconst_0        
	//   27   51:putfield        #53  <Field long h>
		i = -1L;
	//   28   54:aload_0         
	//   29   55:ldc2w           #42  <Long -1L>
	//   30   58:putfield        #55  <Field long i>
		k = false;
	//   31   61:aload_0         
	//   32   62:iconst_0        
	//   33   63:putfield        #57  <Field boolean k>
		l = null;
	//   34   66:aload_0         
	//   35   67:aconst_null     
	//   36   68:putfield        #59  <Field Timer l>
		m = null;
	//   37   71:aload_0         
	//   38   72:aconst_null     
	//   39   73:putfield        #61  <Field Timer m>
		n = null;
	//   40   76:aload_0         
	//   41   77:aconst_null     
	//   42   78:putfield        #63  <Field android.media.MediaPlayer$OnCompletionListener n>
		o = ((android.media.MediaPlayer.OnCompletionListener) (new o(this)));
	//   43   81:aload_0         
	//   44   82:new             #65  <Class o>
	//   45   85:dup             
	//   46   86:aload_0         
	//   47   87:invokespecial   #68  <Method void o(StreamSenseVideoView)>
	//   48   90:putfield        #70  <Field android.media.MediaPlayer$OnCompletionListener o>
		h();
	//   49   93:aload_0         
	//   50   94:invokespecial   #73  <Method void h()>
	//   51   97:return          
	}

	public StreamSenseVideoView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #80  <Method void VideoView(Context, AttributeSet, int)>
		a = "StreamSenseVideoView";
	//    5    7:aload_0         
	//    6    8:ldc1            #33  <String "StreamSenseVideoView">
	//    7   10:putfield        #35  <Field String a>
		b = true;
	//    8   13:aload_0         
	//    9   14:iconst_1        
	//   10   15:putfield        #37  <Field boolean b>
		c = 500;
	//   11   18:aload_0         
	//   12   19:sipush          500
	//   13   22:putfield        #39  <Field int c>
		d = 500;
	//   14   25:aload_0         
	//   15   26:sipush          500
	//   16   29:putfield        #41  <Field int d>
		e = -1L;
	//   17   32:aload_0         
	//   18   33:ldc2w           #42  <Long -1L>
	//   19   36:putfield        #45  <Field long e>
		f = null;
	//   20   39:aload_0         
	//   21   40:aconst_null     
	//   22   41:putfield        #47  <Field StreamSense f>
		g = "0x0";
	//   23   44:aload_0         
	//   24   45:ldc1            #49  <String "0x0">
	//   25   47:putfield        #51  <Field String g>
		h = 0L;
	//   26   50:aload_0         
	//   27   51:lconst_0        
	//   28   52:putfield        #53  <Field long h>
		i = -1L;
	//   29   55:aload_0         
	//   30   56:ldc2w           #42  <Long -1L>
	//   31   59:putfield        #55  <Field long i>
		k = false;
	//   32   62:aload_0         
	//   33   63:iconst_0        
	//   34   64:putfield        #57  <Field boolean k>
		l = null;
	//   35   67:aload_0         
	//   36   68:aconst_null     
	//   37   69:putfield        #59  <Field Timer l>
		m = null;
	//   38   72:aload_0         
	//   39   73:aconst_null     
	//   40   74:putfield        #61  <Field Timer m>
		n = null;
	//   41   77:aload_0         
	//   42   78:aconst_null     
	//   43   79:putfield        #63  <Field android.media.MediaPlayer$OnCompletionListener n>
		o = ((android.media.MediaPlayer.OnCompletionListener) (new o(this)));
	//   44   82:aload_0         
	//   45   83:new             #65  <Class o>
	//   46   86:dup             
	//   47   87:aload_0         
	//   48   88:invokespecial   #68  <Method void o(StreamSenseVideoView)>
	//   49   91:putfield        #70  <Field android.media.MediaPlayer$OnCompletionListener o>
		h();
	//   50   94:aload_0         
	//   51   95:invokespecial   #73  <Method void h()>
	//   52   98:return          
	}

	static long a(StreamSenseVideoView streamsensevideoview)
	{
		return streamsensevideoview.getCurrentPlayerSafePosition();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method long getCurrentPlayerSafePosition()>
	//    2    4:lreturn         
	}

	static long a(StreamSenseVideoView streamsensevideoview, long l1)
	{
		l1 = streamsensevideoview.h + l1;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field long h>
	//    2    4:lload_1         
	//    3    5:ladd            
	//    4    6:lstore_1        
		streamsensevideoview.h = l1;
	//    5    7:aload_0         
	//    6    8:lload_1         
	//    7    9:putfield        #53  <Field long h>
		return l1;
	//    8   12:lload_1         
	//    9   13:lreturn         
	}

	private void a(MediaPlayer mediaplayer)
	{
		CSLog.d("StreamSenseVideoView", "onPlaybackCompleted");
	//    0    0:ldc1            #33  <String "StreamSenseVideoView">
	//    1    2:ldc1            #89  <String "onPlaybackCompleted">
	//    2    4:invokestatic    #94  <Method void CSLog.d(Object, String)>
		c(i(), getCurrentPlayerSafePosition());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #97  <Method HashMap i()>
	//    6   12:aload_0         
	//    7   13:invokespecial   #85  <Method long getCurrentPlayerSafePosition()>
	//    8   16:invokespecial   #100 <Method void c(HashMap, long)>
	//    9   19:return          
	}

	static void a(StreamSenseVideoView streamsensevideoview, MediaPlayer mediaplayer)
	{
		streamsensevideoview.a(mediaplayer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #103 <Method void a(MediaPlayer)>
	//    3    5:return          
	}

	static void a(StreamSenseVideoView streamsensevideoview, HashMap hashmap)
	{
		streamsensevideoview.a(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void a(HashMap)>
	//    3    5:return          
	}

	static void a(StreamSenseVideoView streamsensevideoview, HashMap hashmap, long l1)
	{
		streamsensevideoview.b(hashmap, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #110 <Method void b(HashMap, long)>
	//    4    6:return          
	}

	private void a(HashMap hashmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		f();
	//    2    2:aload_0         
	//    3    3:invokespecial   #113 <Method boolean f()>
	//    4    6:pop             
		if(l == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #59  <Field Timer l>
	//*   7   11:ifnonnull       84
		{
			long l1 = getCurrentPlayerSafePosition();
	//    8   14:aload_0         
	//    9   15:invokespecial   #85  <Method long getCurrentPlayerSafePosition()>
	//   10   18:lstore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #115 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #117 <Method void StringBuilder()>
	//   14   26:astore          4
			stringbuilder.append("startStartTimer:");
	//   15   28:aload           4
	//   16   30:ldc1            #119 <String "startStartTimer:">
	//   17   32:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			stringbuilder.append(l1);
	//   19   36:aload           4
	//   20   38:lload_2         
	//   21   39:invokevirtual   #126 <Method StringBuilder StringBuilder.append(long)>
	//   22   42:pop             
			CSLog.d("StreamSenseVideoView", stringbuilder.toString());
	//   23   43:ldc1            #33  <String "StreamSenseVideoView">
	//   24   45:aload           4
	//   25   47:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   26   50:invokestatic    #94  <Method void CSLog.d(Object, String)>
			l = new Timer();
	//   27   53:aload_0         
	//   28   54:new             #132 <Class Timer>
	//   29   57:dup             
	//   30   58:invokespecial   #133 <Method void Timer()>
	//   31   61:putfield        #59  <Field Timer l>
			l.schedule(((java.util.TimerTask) (new m(this, l1, hashmap))), 500L);
	//   32   64:aload_0         
	//   33   65:getfield        #59  <Field Timer l>
	//   34   68:new             #135 <Class m>
	//   35   71:dup             
	//   36   72:aload_0         
	//   37   73:lload_2         
	//   38   74:aload_1         
	//   39   75:invokespecial   #138 <Method void m(StreamSenseVideoView, long, HashMap)>
	//   40   78:ldc2w           #139 <Long 500L>
	//   41   81:invokevirtual   #144 <Method void Timer.schedule(java.util.TimerTask, long)>
		}
		this;
	//   42   84:aload_0         
		JVM INSTR monitorexit ;
	//   43   85:monitorexit     
		return;
	//   44   86:return          
		hashmap;
	//   45   87:astore_1        
	//*  46   88:aload_0         
		throw hashmap;
	//   47   89:monitorexit     
	//   48   90:aload_1         
	//   49   91:athrow          
	}

	private void a(HashMap hashmap, long l1)
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #113 <Method boolean f()>
	//    2    4:pop             
		d();
	//    3    5:aload_0         
	//    4    6:invokespecial   #148 <Method boolean d()>
	//    5    9:pop             
		if(f != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #47  <Field StreamSense f>
	//*   8   14:ifnull          29
			f.notify(StreamSenseEventType.END, hashmap, l1);
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field StreamSense f>
	//   11   21:getstatic       #154 <Field StreamSenseEventType StreamSenseEventType.END>
	//   12   24:aload_1         
	//   13   25:lload_2         
	//   14   26:invokevirtual   #160 <Method void StreamSense.notify(StreamSenseEventType, HashMap, long)>
	//   15   29:return          
	}

	private boolean a()
	{
		IllegalStateException illegalstateexception;
		boolean flag;
		try
		{
			flag = isPlaying();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #166 <Method boolean isPlaying()>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:ireturn         
	//*   5    7:iconst_0        
	//*   6    8:ireturn         
		// Misplaced declaration of an exception variable
		catch(IllegalStateException illegalstateexception)
		{
			return false;
		}
		return flag;
	//*   7    9:astore_2        
	//*   8   10:goto            7
	}

	static long b(StreamSenseVideoView streamsensevideoview)
	{
		return streamsensevideoview.h;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field long h>
	//    2    4:lreturn         
	}

	private void b(HashMap hashmap, long l1)
	{
		k = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #57  <Field boolean k>
		d();
	//    3    5:aload_0         
	//    4    6:invokespecial   #148 <Method boolean d()>
	//    5    9:pop             
		if(f != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #47  <Field StreamSense f>
	//*   8   14:ifnull          29
			f.notify(StreamSenseEventType.PLAY, hashmap, l1);
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field StreamSense f>
	//   11   21:getstatic       #169 <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//   12   24:aload_1         
	//   13   25:lload_2         
	//   14   26:invokevirtual   #160 <Method void StreamSense.notify(StreamSenseEventType, HashMap, long)>
	//   15   29:return          
	}

	private boolean b()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean k>
	//    2    4:ireturn         
	}

	private void c()
	{
		CSLog.d("StreamSenseVideoView", "onPauseForBuffering");
	//    0    0:ldc1            #33  <String "StreamSenseVideoView">
	//    1    2:ldc1            #171 <String "onPauseForBuffering">
	//    2    4:invokestatic    #94  <Method void CSLog.d(Object, String)>
		k = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #57  <Field boolean k>
		i = System.currentTimeMillis();
	//    6   12:aload_0         
	//    7   13:invokestatic    #176 <Method long System.currentTimeMillis()>
	//    8   16:putfield        #55  <Field long i>
		if(a())
	//*   9   19:aload_0         
	//*  10   20:invokespecial   #178 <Method boolean a()>
	//*  11   23:ifeq            42
		{
			c(i(), getCurrentPlayerSafePosition());
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:invokespecial   #97  <Method HashMap i()>
	//   15   31:aload_0         
	//   16   32:invokespecial   #85  <Method long getCurrentPlayerSafePosition()>
	//   17   35:invokespecial   #100 <Method void c(HashMap, long)>
			e();
	//   18   38:aload_0         
	//   19   39:invokespecial   #180 <Method void e()>
		}
	//   20   42:return          
	}

	private void c(HashMap hashmap, long l1)
	{
		if(!d() && f != null)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #148 <Method boolean d()>
	//*   2    4:ifne            26
	//*   3    7:aload_0         
	//*   4    8:getfield        #47  <Field StreamSense f>
	//*   5   11:ifnull          26
			f.notify(StreamSenseEventType.PAUSE, hashmap, l1);
	//    6   14:aload_0         
	//    7   15:getfield        #47  <Field StreamSense f>
	//    8   18:getstatic       #183 <Field StreamSenseEventType StreamSenseEventType.PAUSE>
	//    9   21:aload_1         
	//   10   22:lload_2         
	//   11   23:invokevirtual   #160 <Method void StreamSense.notify(StreamSenseEventType, HashMap, long)>
	//   12   26:return          
	}

	static boolean c(StreamSenseVideoView streamsensevideoview)
	{
		return streamsensevideoview.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method boolean d()>
	//    2    4:ireturn         
	}

	static void d(StreamSenseVideoView streamsensevideoview)
	{
		streamsensevideoview.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #186 <Method void g()>
	//    2    4:return          
	}

	private boolean d()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(l == null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field Timer l>
	//    4    6:ifnull          34
_L1:
		CSLog.d("StreamSenseVideoView", "cancelStartTimer");
	//    5    9:ldc1            #33  <String "StreamSenseVideoView">
	//    6   11:ldc1            #188 <String "cancelStartTimer">
	//    7   13:invokestatic    #94  <Method void CSLog.d(Object, String)>
		l.cancel();
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field Timer l>
	//   10   20:invokevirtual   #191 <Method void Timer.cancel()>
		l = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #59  <Field Timer l>
		boolean flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_1        
_L4:
		this;
	//   16   30:aload_0         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return flag;
	//   18   32:iload_1         
	//   19   33:ireturn         
_L2:
		flag = false;
	//   20   34:iconst_0        
	//   21   35:istore_1        
		if(true) goto _L4; else goto _L3
	//   22   36:goto            30
_L3:
		Exception exception;
		exception;
	//   23   39:astore_2        
	//*  24   40:aload_0         
		throw exception;
	//   25   41:monitorexit     
	//   26   42:aload_2         
	//   27   43:athrow          
	}

	static Timer e(StreamSenseVideoView streamsensevideoview)
	{
		return streamsensevideoview.m;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Timer m>
	//    2    4:areturn         
	}

	private void e()
	{
		a(i());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #97  <Method HashMap i()>
	//    3    5:invokespecial   #107 <Method void a(HashMap)>
	//    4    8:return          
	}

	private boolean f()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		CSLog.d("StreamSenseVideoView", "cancelPlayingPollTimer()");
	//    2    2:ldc1            #33  <String "StreamSenseVideoView">
	//    3    4:ldc1            #194 <String "cancelPlayingPollTimer()">
	//    4    6:invokestatic    #94  <Method void CSLog.d(Object, String)>
		if(m == null) goto _L2; else goto _L1
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field Timer m>
	//    7   13:ifnull          34
_L1:
		m.cancel();
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field Timer m>
	//   10   20:invokevirtual   #191 <Method void Timer.cancel()>
		m = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #61  <Field Timer m>
		boolean flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_1        
_L4:
		this;
	//   16   30:aload_0         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return flag;
	//   18   32:iload_1         
	//   19   33:ireturn         
_L2:
		flag = false;
	//   20   34:iconst_0        
	//   21   35:istore_1        
		if(true) goto _L4; else goto _L3
	//   22   36:goto            30
_L3:
		Exception exception;
		exception;
	//   23   39:astore_2        
	//*  24   40:aload_0         
		throw exception;
	//   25   41:monitorexit     
	//   26   42:aload_2         
	//   27   43:athrow          
	}

	static boolean f(StreamSenseVideoView streamsensevideoview)
	{
		return streamsensevideoview.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method boolean a()>
	//    2    4:ireturn         
	}

	private void g()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(m == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #61  <Field Timer m>
	//*   4    6:ifnonnull       51
		{
			CSLog.d("StreamSenseVideoView", "startPlayingPollTimer");
	//    5    9:ldc1            #33  <String "StreamSenseVideoView">
	//    6   11:ldc1            #196 <String "startPlayingPollTimer">
	//    7   13:invokestatic    #94  <Method void CSLog.d(Object, String)>
			long l1 = getCurrentPlayerSafePosition();
	//    8   16:aload_0         
	//    9   17:invokespecial   #85  <Method long getCurrentPlayerSafePosition()>
	//   10   20:lstore_1        
			m = new Timer();
	//   11   21:aload_0         
	//   12   22:new             #132 <Class Timer>
	//   13   25:dup             
	//   14   26:invokespecial   #133 <Method void Timer()>
	//   15   29:putfield        #61  <Field Timer m>
			m.schedule(((java.util.TimerTask) (new n(this, l1))), 250L);
	//   16   32:aload_0         
	//   17   33:getfield        #61  <Field Timer m>
	//   18   36:new             #198 <Class n>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:lload_1         
	//   22   42:invokespecial   #201 <Method void n(StreamSenseVideoView, long)>
	//   23   45:ldc2w           #202 <Long 250L>
	//   24   48:invokevirtual   #144 <Method void Timer.schedule(java.util.TimerTask, long)>
		}
		this;
	//   25   51:aload_0         
		JVM INSTR monitorexit ;
	//   26   52:monitorexit     
		return;
	//   27   53:return          
		Exception exception;
		exception;
	//   28   54:astore_3        
	//*  29   55:aload_0         
		throw exception;
	//   30   56:monitorexit     
	//   31   57:aload_3         
	//   32   58:athrow          
	}

	static boolean g(StreamSenseVideoView streamsensevideoview)
	{
		return streamsensevideoview.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #205 <Method boolean b()>
	//    2    4:ireturn         
	}

	private long getCurrentPlayerSafePosition()
	{
		IllegalStateException illegalstateexception;
		int i1;
		try
		{
			i1 = getCurrentPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method int getCurrentPosition()>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:i2l             
	//*   5    7:lreturn         
	//*   6    8:ldc1            #33  <String "StreamSenseVideoView">
	//*   7   10:ldc1            #211 <String "getCurrentSafePlayerPosition">
	//*   8   12:invokestatic    #213 <Method void CSLog.e(Object, String)>
	//*   9   15:lconst_0        
	//*  10   16:lreturn         
		// Misplaced declaration of an exception variable
		catch(IllegalStateException illegalstateexception)
		{
			CSLog.e("StreamSenseVideoView", "getCurrentSafePlayerPosition");
			return 0L;
		}
		return (long)i1;
	//*  11   17:astore_2        
	//*  12   18:goto            8
	}

	private HashMap getPlayerMetadata()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #216 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #217 <Method void HashMap()>
	//    3    7:astore_1        
		if(e <= 0L)
	//*   4    8:aload_0         
	//*   5    9:getfield        #45  <Field long e>
	//*   6   12:lconst_0        
	//*   7   13:lcmp            
	//*   8   14:ifgt            26
			e = getDuration();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #220 <Method int getDuration()>
	//   12   22:i2l             
	//   13   23:putfield        #45  <Field long e>
		hashmap.put("ns_st_cl", ((Object) (String.valueOf(e))));
	//   14   26:aload_1         
	//   15   27:ldc1            #222 <String "ns_st_cl">
	//   16   29:aload_0         
	//   17   30:getfield        #45  <Field long e>
	//   18   33:invokestatic    #228 <Method String String.valueOf(long)>
	//   19   36:invokevirtual   #232 <Method Object HashMap.put(Object, Object)>
	//   20   39:pop             
		if(g == null || g.equals("0x0"))
	//*  21   40:aload_0         
	//*  22   41:getfield        #51  <Field String g>
	//*  23   44:ifnull          59
	//*  24   47:aload_0         
	//*  25   48:getfield        #51  <Field String g>
	//*  26   51:ldc1            #49  <String "0x0">
	//*  27   53:invokevirtual   #236 <Method boolean String.equals(Object)>
	//*  28   56:ifeq            100
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   29   59:new             #115 <Class StringBuilder>
	//   30   62:dup             
	//   31   63:invokespecial   #117 <Method void StringBuilder()>
	//   32   66:astore_2        
			stringbuilder.append(getWidth());
	//   33   67:aload_2         
	//   34   68:aload_0         
	//   35   69:invokevirtual   #239 <Method int getWidth()>
	//   36   72:invokevirtual   #242 <Method StringBuilder StringBuilder.append(int)>
	//   37   75:pop             
			stringbuilder.append("x");
	//   38   76:aload_2         
	//   39   77:ldc1            #244 <String "x">
	//   40   79:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
			stringbuilder.append(getHeight());
	//   42   83:aload_2         
	//   43   84:aload_0         
	//   44   85:invokevirtual   #247 <Method int getHeight()>
	//   45   88:invokevirtual   #242 <Method StringBuilder StringBuilder.append(int)>
	//   46   91:pop             
			g = stringbuilder.toString();
	//   47   92:aload_0         
	//   48   93:aload_2         
	//   49   94:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   50   97:putfield        #51  <Field String g>
		}
		hashmap.put("ns_st_cs", ((Object) (g)));
	//   51  100:aload_1         
	//   52  101:ldc1            #249 <String "ns_st_cs">
	//   53  103:aload_0         
	//   54  104:getfield        #51  <Field String g>
	//   55  107:invokevirtual   #232 <Method Object HashMap.put(Object, Object)>
	//   56  110:pop             
		hashmap.put("ns_st_cu", ((Object) (j)));
	//   57  111:aload_1         
	//   58  112:ldc1            #251 <String "ns_st_cu">
	//   59  114:aload_0         
	//   60  115:getfield        #253 <Field String j>
	//   61  118:invokevirtual   #232 <Method Object HashMap.put(Object, Object)>
	//   62  121:pop             
		hashmap.put("ns_st_mp", ((Object) (((Class) (com/comscore/streaming/StreamSenseVideoView)).getSimpleName())));
	//   63  122:aload_1         
	//   64  123:ldc1            #255 <String "ns_st_mp">
	//   65  125:ldc1            #2   <Class StreamSenseVideoView>
	//   66  127:invokevirtual   #260 <Method String Class.getSimpleName()>
	//   67  130:invokevirtual   #232 <Method Object HashMap.put(Object, Object)>
	//   68  133:pop             
		hashmap.put("ns_st_mv", ((Object) (Integer.toString(android.os.Build.VERSION.SDK_INT))));
	//   69  134:aload_1         
	//   70  135:ldc2            #262 <String "ns_st_mv">
	//   71  138:getstatic       #267 <Field int android.os.Build$VERSION.SDK_INT>
	//   72  141:invokestatic    #272 <Method String Integer.toString(int)>
	//   73  144:invokevirtual   #232 <Method Object HashMap.put(Object, Object)>
	//   74  147:pop             
		return hashmap;
	//   75  148:aload_1         
	//   76  149:areturn         
	}

	private void h()
	{
		super.setOnCompletionListener(o);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #70  <Field android.media.MediaPlayer$OnCompletionListener o>
	//    3    5:invokespecial   #277 <Method void VideoView.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
	//    4    8:return          
	}

	static boolean h(StreamSenseVideoView streamsensevideoview)
	{
		return streamsensevideoview.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #113 <Method boolean f()>
	//    2    4:ireturn         
	}

	private HashMap i()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #216 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #217 <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put("ns_ts", ((Object) (String.valueOf(System.currentTimeMillis()))));
	//    4    8:aload_1         
	//    5    9:ldc2            #279 <String "ns_ts">
	//    6   12:invokestatic    #176 <Method long System.currentTimeMillis()>
	//    7   15:invokestatic    #228 <Method String String.valueOf(long)>
	//    8   18:invokevirtual   #232 <Method Object HashMap.put(Object, Object)>
	//    9   21:pop             
		hashmap.putAll(((java.util.Map) (getPlayerMetadata())));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokespecial   #281 <Method HashMap getPlayerMetadata()>
	//   13   27:invokevirtual   #285 <Method void HashMap.putAll(java.util.Map)>
		return hashmap;
	//   14   30:aload_1         
	//   15   31:areturn         
	}

	static void i(StreamSenseVideoView streamsensevideoview)
	{
		streamsensevideoview.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #287 <Method void c()>
	//    2    4:return          
	}

	static android.media.MediaPlayer.OnCompletionListener j(StreamSenseVideoView streamsensevideoview)
	{
		return streamsensevideoview.n;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field android.media.MediaPlayer$OnCompletionListener n>
	//    2    4:areturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #291 <Method void VideoView.onDetachedFromWindow()>
		CSLog.d("StreamSenseVideoView", "onDetachedFromWindow");
	//    2    4:ldc1            #33  <String "StreamSenseVideoView">
	//    3    6:ldc2            #292 <String "onDetachedFromWindow">
	//    4    9:invokestatic    #94  <Method void CSLog.d(Object, String)>
		a(i(), getCurrentPlayerSafePosition());
	//    5   12:aload_0         
	//    6   13:aload_0         
	//    7   14:invokespecial   #97  <Method HashMap i()>
	//    8   17:aload_0         
	//    9   18:invokespecial   #85  <Method long getCurrentPlayerSafePosition()>
	//   10   21:invokespecial   #294 <Method void a(HashMap, long)>
	//   11   24:return          
	}

	public void pause()
	{
		super.pause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #297 <Method void VideoView.pause()>
		CSLog.d("StreamSenseVideoView", "pause");
	//    2    4:ldc1            #33  <String "StreamSenseVideoView">
	//    3    6:ldc2            #298 <String "pause">
	//    4    9:invokestatic    #94  <Method void CSLog.d(Object, String)>
		f();
	//    5   12:aload_0         
	//    6   13:invokespecial   #113 <Method boolean f()>
	//    7   16:pop             
		if(k)
	//*   8   17:aload_0         
	//*   9   18:getfield        #57  <Field boolean k>
	//*  10   21:ifeq            41
			h = h + (System.currentTimeMillis() - i);
	//   11   24:aload_0         
	//   12   25:aload_0         
	//   13   26:getfield        #53  <Field long h>
	//   14   29:invokestatic    #176 <Method long System.currentTimeMillis()>
	//   15   32:aload_0         
	//   16   33:getfield        #55  <Field long i>
	//   17   36:lsub            
	//   18   37:ladd            
	//   19   38:putfield        #53  <Field long h>
		k = false;
	//   20   41:aload_0         
	//   21   42:iconst_0        
	//   22   43:putfield        #57  <Field boolean k>
		i = -1L;
	//   23   46:aload_0         
	//   24   47:ldc2w           #42  <Long -1L>
	//   25   50:putfield        #55  <Field long i>
		c(i(), getCurrentPlayerSafePosition());
	//   26   53:aload_0         
	//   27   54:aload_0         
	//   28   55:invokespecial   #97  <Method HashMap i()>
	//   29   58:aload_0         
	//   30   59:invokespecial   #85  <Method long getCurrentPlayerSafePosition()>
	//   31   62:invokespecial   #100 <Method void c(HashMap, long)>
	//   32   65:return          
	}

	public void resume()
	{
		if(android.os.Build.VERSION.SDK_INT >= 8)
	//*   0    0:getstatic       #267 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          8
	//*   2    5:icmplt          12
			super.resume();
	//    3    8:aload_0         
	//    4    9:invokespecial   #304 <Method void VideoView.resume()>
		CSLog.d("StreamSenseVideoView", "resume");
	//    5   12:ldc1            #33  <String "StreamSenseVideoView">
	//    6   14:ldc2            #305 <String "resume">
	//    7   17:invokestatic    #94  <Method void CSLog.d(Object, String)>
		b(i(), getCurrentPlayerSafePosition());
	//    8   20:aload_0         
	//    9   21:aload_0         
	//   10   22:invokespecial   #97  <Method HashMap i()>
	//   11   25:aload_0         
	//   12   26:invokespecial   #85  <Method long getCurrentPlayerSafePosition()>
	//   13   29:invokespecial   #110 <Method void b(HashMap, long)>
	//   14   32:return          
	}

	public void seekTo(int i1)
	{
		super.seekTo(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #310 <Method void VideoView.seekTo(int)>
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #115 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #117 <Method void StringBuilder()>
	//    6   12:astore_2        
		stringbuilder.append("seekTo:");
	//    7   13:aload_2         
	//    8   14:ldc2            #312 <String "seekTo:">
	//    9   17:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(i1);
	//   11   21:aload_2         
	//   12   22:iload_1         
	//   13   23:invokevirtual   #242 <Method StringBuilder StringBuilder.append(int)>
	//   14   26:pop             
		CSLog.d("StreamSenseVideoView", stringbuilder.toString());
	//   15   27:ldc1            #33  <String "StreamSenseVideoView">
	//   16   29:aload_2         
	//   17   30:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #94  <Method void CSLog.d(Object, String)>
		if(a())
	//*  19   36:aload_0         
	//*  20   37:invokespecial   #178 <Method boolean a()>
	//*  21   40:ifeq            68
		{
			f();
	//   22   43:aload_0         
	//   23   44:invokespecial   #113 <Method boolean f()>
	//   24   47:pop             
			d();
	//   25   48:aload_0         
	//   26   49:invokespecial   #148 <Method boolean d()>
	//   27   52:pop             
			c(i(), -1L);
	//   28   53:aload_0         
	//   29   54:aload_0         
	//   30   55:invokespecial   #97  <Method HashMap i()>
	//   31   58:ldc2w           #42  <Long -1L>
	//   32   61:invokespecial   #100 <Method void c(HashMap, long)>
			e();
	//   33   64:aload_0         
	//   34   65:invokespecial   #180 <Method void e()>
		}
	//   35   68:return          
	}

	public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
	{
		super.setOnCompletionListener(o);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #70  <Field android.media.MediaPlayer$OnCompletionListener o>
	//    3    5:invokespecial   #277 <Method void VideoView.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
		n = oncompletionlistener;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #63  <Field android.media.MediaPlayer$OnCompletionListener n>
	//    7   13:return          
	}

	public void setStreamSense(StreamSense streamsense)
	{
		f = streamsense;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field StreamSense f>
		f.setLabel("ns_st_pv", "4.1307.02");
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field StreamSense f>
	//    5    9:ldc2            #316 <String "ns_st_pv">
	//    6   12:ldc2            #318 <String "4.1307.02">
	//    7   15:invokevirtual   #322 <Method void StreamSense.setLabel(String, String)>
	//    8   18:return          
	}

	public void setVideoPath(String s)
	{
		super.setVideoPath(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #326 <Method void VideoView.setVideoPath(String)>
		j = s;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #253 <Field String j>
	//    6   10:return          
	}

	public void setVideoURI(Uri uri)
	{
		super.setVideoURI(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #330 <Method void VideoView.setVideoURI(Uri)>
		j = uri.toString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #333 <Method String Uri.toString()>
	//    6   10:putfield        #253 <Field String j>
	//    7   13:return          
	}

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #336 <Method void VideoView.start()>
		if(l == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #59  <Field Timer l>
	//*   4    8:ifnonnull       23
		{
			CSLog.d("StreamSenseVideoView", "start");
	//    5   11:ldc1            #33  <String "StreamSenseVideoView">
	//    6   13:ldc2            #337 <String "start">
	//    7   16:invokestatic    #94  <Method void CSLog.d(Object, String)>
			e();
	//    8   19:aload_0         
	//    9   20:invokespecial   #180 <Method void e()>
		}
	//   10   23:return          
	}

	public void stopPlayback()
	{
		super.stopPlayback();
	//    0    0:aload_0         
	//    1    1:invokespecial   #340 <Method void VideoView.stopPlayback()>
		CSLog.d("StreamSenseVideoView", "stopPlayback");
	//    2    4:ldc1            #33  <String "StreamSenseVideoView">
	//    3    6:ldc2            #341 <String "stopPlayback">
	//    4    9:invokestatic    #94  <Method void CSLog.d(Object, String)>
		a(i(), getCurrentPlayerSafePosition());
	//    5   12:aload_0         
	//    6   13:aload_0         
	//    7   14:invokespecial   #97  <Method HashMap i()>
	//    8   17:aload_0         
	//    9   18:invokespecial   #85  <Method long getCurrentPlayerSafePosition()>
	//   10   21:invokespecial   #294 <Method void a(HashMap, long)>
	//   11   24:return          
	}

	private final String a;
	private final boolean b;
	private final int c;
	private final int d;
	private long e;
	private StreamSense f;
	private String g;
	private long h;
	private long i;
	private String j;
	private boolean k;
	private Timer l;
	private Timer m;
	private android.media.MediaPlayer.OnCompletionListener n;
	private final android.media.MediaPlayer.OnCompletionListener o;
}
