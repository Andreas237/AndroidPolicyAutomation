// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Timer;

// Referenced classes of package com.comscore.streaming:
//			g, h, i, j, 
//			k, StreamSenseEventType, StreamSense, l

public class StreamSenseMediaPlayer extends MediaPlayer
{

	public StreamSenseMediaPlayer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void MediaPlayer()>
		c = "local_file";
	//    2    4:aload_0         
	//    3    5:ldc1            #45  <String "local_file">
	//    4    7:putfield        #47  <Field String c>
		d = 500;
	//    5   10:aload_0         
	//    6   11:sipush          500
	//    7   14:putfield        #49  <Field int d>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT < 9)
	//*   8   17:getstatic       #54  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          9
	//*  10   22:icmpge          30
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
		else
	//*  13   27:goto            32
			flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		e = flag;
	//   16   32:aload_0         
	//   17   33:iload_1         
	//   18   34:putfield        #56  <Field boolean e>
		f = false;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #58  <Field boolean f>
		g = false;
	//   22   42:aload_0         
	//   23   43:iconst_0        
	//   24   44:putfield        #60  <Field boolean g>
		h = true;
	//   25   47:aload_0         
	//   26   48:iconst_1        
	//   27   49:putfield        #62  <Field boolean h>
		i = 500;
	//   28   52:aload_0         
	//   29   53:sipush          500
	//   30   56:putfield        #64  <Field int i>
		j = null;
	//   31   59:aload_0         
	//   32   60:aconst_null     
	//   33   61:putfield        #66  <Field StreamSense j>
		k = "0";
	//   34   64:aload_0         
	//   35   65:ldc1            #68  <String "0">
	//   36   67:putfield        #70  <Field String k>
		l = "0x0";
	//   37   70:aload_0         
	//   38   71:ldc1            #72  <String "0x0">
	//   39   73:putfield        #74  <Field String l>
		m = false;
	//   40   76:aload_0         
	//   41   77:iconst_0        
	//   42   78:putfield        #76  <Field boolean m>
		n = false;
	//   43   81:aload_0         
	//   44   82:iconst_0        
	//   45   83:putfield        #78  <Field boolean n>
		p = null;
	//   46   86:aload_0         
	//   47   87:aconst_null     
	//   48   88:putfield        #80  <Field android.media.MediaPlayer$OnCompletionListener p>
		q = ((android.media.MediaPlayer.OnCompletionListener) (new g(this)));
	//   49   91:aload_0         
	//   50   92:new             #82  <Class g>
	//   51   95:dup             
	//   52   96:aload_0         
	//   53   97:invokespecial   #85  <Method void g(StreamSenseMediaPlayer)>
	//   54  100:putfield        #87  <Field android.media.MediaPlayer$OnCompletionListener q>
		r = null;
	//   55  103:aload_0         
	//   56  104:aconst_null     
	//   57  105:putfield        #89  <Field android.media.MediaPlayer$OnInfoListener r>
		s = ((android.media.MediaPlayer.OnInfoListener) (new h(this)));
	//   58  108:aload_0         
	//   59  109:new             #91  <Class h>
	//   60  112:dup             
	//   61  113:aload_0         
	//   62  114:invokespecial   #92  <Method void h(StreamSenseMediaPlayer)>
	//   63  117:putfield        #94  <Field android.media.MediaPlayer$OnInfoListener s>
		t = null;
	//   64  120:aload_0         
	//   65  121:aconst_null     
	//   66  122:putfield        #96  <Field android.media.MediaPlayer$OnSeekCompleteListener t>
		u = ((android.media.MediaPlayer.OnSeekCompleteListener) (new i(this)));
	//   67  125:aload_0         
	//   68  126:new             #98  <Class i>
	//   69  129:dup             
	//   70  130:aload_0         
	//   71  131:invokespecial   #99  <Method void i(StreamSenseMediaPlayer)>
	//   72  134:putfield        #101 <Field android.media.MediaPlayer$OnSeekCompleteListener u>
		v = null;
	//   73  137:aload_0         
	//   74  138:aconst_null     
	//   75  139:putfield        #103 <Field android.media.MediaPlayer$OnPreparedListener v>
		w = ((android.media.MediaPlayer.OnPreparedListener) (new j(this)));
	//   76  142:aload_0         
	//   77  143:new             #105 <Class j>
	//   78  146:dup             
	//   79  147:aload_0         
	//   80  148:invokespecial   #106 <Method void j(StreamSenseMediaPlayer)>
	//   81  151:putfield        #108 <Field android.media.MediaPlayer$OnPreparedListener w>
		x = null;
	//   82  154:aload_0         
	//   83  155:aconst_null     
	//   84  156:putfield        #110 <Field Timer x>
		a = null;
	//   85  159:aload_0         
	//   86  160:aconst_null     
	//   87  161:putfield        #112 <Field Timer a>
		b = null;
	//   88  164:aload_0         
	//   89  165:aconst_null     
	//   90  166:putfield        #114 <Field Timer b>
		y = null;
	//   91  169:aload_0         
	//   92  170:aconst_null     
	//   93  171:putfield        #116 <Field Timer y>
		c();
	//   94  174:aload_0         
	//   95  175:invokespecial   #118 <Method void c()>
	//   96  178:return          
	}

	public StreamSenseMediaPlayer(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void MediaPlayer()>
		c = "local_file";
	//    2    4:aload_0         
	//    3    5:ldc1            #45  <String "local_file">
	//    4    7:putfield        #47  <Field String c>
		d = 500;
	//    5   10:aload_0         
	//    6   11:sipush          500
	//    7   14:putfield        #49  <Field int d>
		if(android.os.Build.VERSION.SDK_INT < 9)
	//*   8   17:getstatic       #54  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          9
	//*  10   22:icmpge          30
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
		else
	//*  13   27:goto            32
			flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		e = flag;
	//   16   32:aload_0         
	//   17   33:iload_1         
	//   18   34:putfield        #56  <Field boolean e>
		f = false;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #58  <Field boolean f>
		g = false;
	//   22   42:aload_0         
	//   23   43:iconst_0        
	//   24   44:putfield        #60  <Field boolean g>
		h = true;
	//   25   47:aload_0         
	//   26   48:iconst_1        
	//   27   49:putfield        #62  <Field boolean h>
		i = 500;
	//   28   52:aload_0         
	//   29   53:sipush          500
	//   30   56:putfield        #64  <Field int i>
		j = null;
	//   31   59:aload_0         
	//   32   60:aconst_null     
	//   33   61:putfield        #66  <Field StreamSense j>
		k = "0";
	//   34   64:aload_0         
	//   35   65:ldc1            #68  <String "0">
	//   36   67:putfield        #70  <Field String k>
		l = "0x0";
	//   37   70:aload_0         
	//   38   71:ldc1            #72  <String "0x0">
	//   39   73:putfield        #74  <Field String l>
		m = false;
	//   40   76:aload_0         
	//   41   77:iconst_0        
	//   42   78:putfield        #76  <Field boolean m>
		n = false;
	//   43   81:aload_0         
	//   44   82:iconst_0        
	//   45   83:putfield        #78  <Field boolean n>
		p = null;
	//   46   86:aload_0         
	//   47   87:aconst_null     
	//   48   88:putfield        #80  <Field android.media.MediaPlayer$OnCompletionListener p>
		q = ((android.media.MediaPlayer.OnCompletionListener) (new g(this)));
	//   49   91:aload_0         
	//   50   92:new             #82  <Class g>
	//   51   95:dup             
	//   52   96:aload_0         
	//   53   97:invokespecial   #85  <Method void g(StreamSenseMediaPlayer)>
	//   54  100:putfield        #87  <Field android.media.MediaPlayer$OnCompletionListener q>
		r = null;
	//   55  103:aload_0         
	//   56  104:aconst_null     
	//   57  105:putfield        #89  <Field android.media.MediaPlayer$OnInfoListener r>
		s = ((android.media.MediaPlayer.OnInfoListener) (new h(this)));
	//   58  108:aload_0         
	//   59  109:new             #91  <Class h>
	//   60  112:dup             
	//   61  113:aload_0         
	//   62  114:invokespecial   #92  <Method void h(StreamSenseMediaPlayer)>
	//   63  117:putfield        #94  <Field android.media.MediaPlayer$OnInfoListener s>
		t = null;
	//   64  120:aload_0         
	//   65  121:aconst_null     
	//   66  122:putfield        #96  <Field android.media.MediaPlayer$OnSeekCompleteListener t>
		u = ((android.media.MediaPlayer.OnSeekCompleteListener) (new i(this)));
	//   67  125:aload_0         
	//   68  126:new             #98  <Class i>
	//   69  129:dup             
	//   70  130:aload_0         
	//   71  131:invokespecial   #99  <Method void i(StreamSenseMediaPlayer)>
	//   72  134:putfield        #101 <Field android.media.MediaPlayer$OnSeekCompleteListener u>
		v = null;
	//   73  137:aload_0         
	//   74  138:aconst_null     
	//   75  139:putfield        #103 <Field android.media.MediaPlayer$OnPreparedListener v>
		w = ((android.media.MediaPlayer.OnPreparedListener) (new j(this)));
	//   76  142:aload_0         
	//   77  143:new             #105 <Class j>
	//   78  146:dup             
	//   79  147:aload_0         
	//   80  148:invokespecial   #106 <Method void j(StreamSenseMediaPlayer)>
	//   81  151:putfield        #108 <Field android.media.MediaPlayer$OnPreparedListener w>
		x = null;
	//   82  154:aload_0         
	//   83  155:aconst_null     
	//   84  156:putfield        #110 <Field Timer x>
		a = null;
	//   85  159:aload_0         
	//   86  160:aconst_null     
	//   87  161:putfield        #112 <Field Timer a>
		b = null;
	//   88  164:aload_0         
	//   89  165:aconst_null     
	//   90  166:putfield        #114 <Field Timer b>
		y = null;
	//   91  169:aload_0         
	//   92  170:aconst_null     
	//   93  171:putfield        #116 <Field Timer y>
		c();
	//   94  174:aload_0         
	//   95  175:invokespecial   #118 <Method void c()>
	//   96  178:return          
	}

	static android.media.MediaPlayer.OnCompletionListener a(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		return streamsensemediaplayer.p;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field android.media.MediaPlayer$OnCompletionListener p>
	//    2    4:areturn         
	}

	static String a(StreamSenseMediaPlayer streamsensemediaplayer, String s1)
	{
		streamsensemediaplayer.k = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field String k>
		return s1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a()
	{
		m = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #76  <Field boolean m>
		if(n() && !isPlayerPausedForSeeking())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #125 <Method boolean n()>
	//*   5    9:ifeq            23
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #128 <Method boolean isPlayerPausedForSeeking()>
	//*   8   16:ifne            23
			k();
	//    9   19:aload_0         
	//   10   20:invokespecial   #130 <Method void k()>
	//   11   23:return          
	}

	private void a(MediaPlayer mediaplayer)
	{
		l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void l()>
	//    2    4:return          
	}

	static void a(StreamSenseMediaPlayer streamsensemediaplayer, MediaPlayer mediaplayer)
	{
		streamsensemediaplayer.a(mediaplayer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #136 <Method void a(MediaPlayer)>
	//    3    5:return          
	}

	static void a(StreamSenseMediaPlayer streamsensemediaplayer, HashMap hashmap)
	{
		streamsensemediaplayer.f(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #140 <Method void f(HashMap)>
	//    3    5:return          
	}

	private void a(HashMap hashmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l1;
		boolean flag;
		l1 = m();
	//    2    2:aload_0         
	//    3    3:invokespecial   #143 <Method long m()>
	//    4    6:lstore_2        
		f();
	//    5    7:aload_0         
	//    6    8:invokespecial   #145 <Method boolean f()>
	//    7   11:pop             
		flag = g();
	//    8   12:aload_0         
	//    9   13:invokespecial   #147 <Method boolean g()>
	//   10   16:istore          4
		if(x != null || flag)
			break MISSING_BLOCK_LABEL_61;
	//   11   18:aload_0         
	//   12   19:getfield        #110 <Field Timer x>
	//   13   22:ifnonnull       61
	//   14   25:iload           4
	//   15   27:ifne            61
		x = new Timer();
	//   16   30:aload_0         
	//   17   31:new             #149 <Class Timer>
	//   18   34:dup             
	//   19   35:invokespecial   #150 <Method void Timer()>
	//   20   38:putfield        #110 <Field Timer x>
		x.schedule(((java.util.TimerTask) (new k(this, l1, hashmap))), 500L);
	//   21   41:aload_0         
	//   22   42:getfield        #110 <Field Timer x>
	//   23   45:new             #152 <Class k>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:lload_2         
	//   27   51:aload_1         
	//   28   52:invokespecial   #155 <Method void k(StreamSenseMediaPlayer, long, HashMap)>
	//   29   55:ldc2w           #156 <Long 500L>
	//   30   58:invokevirtual   #161 <Method void Timer.schedule(java.util.TimerTask, long)>
		this;
	//   31   61:aload_0         
		JVM INSTR monitorexit ;
	//   32   62:monitorexit     
		return;
	//   33   63:return          
		hashmap;
	//   34   64:astore_1        
	//*  35   65:aload_0         
		throw hashmap;
	//   36   66:monitorexit     
	//   37   67:aload_1         
	//   38   68:athrow          
	}

	private void a(HashMap hashmap, long l1)
	{
		boolean flag = d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method boolean d()>
	//    2    4:istore          4
		boolean flag1 = f();
	//    3    6:aload_0         
	//    4    7:invokespecial   #145 <Method boolean f()>
	//    5   10:istore          5
		g();
	//    6   12:aload_0         
	//    7   13:invokespecial   #147 <Method boolean g()>
	//    8   16:pop             
		if(!flag && !flag1 && j != null)
	//*   9   17:iload           4
	//*  10   19:ifne            46
	//*  11   22:iload           5
	//*  12   24:ifne            46
	//*  13   27:aload_0         
	//*  14   28:getfield        #66  <Field StreamSense j>
	//*  15   31:ifnull          46
			j.notify(StreamSenseEventType.PAUSE, hashmap, l1);
	//   16   34:aload_0         
	//   17   35:getfield        #66  <Field StreamSense j>
	//   18   38:getstatic       #172 <Field StreamSenseEventType StreamSenseEventType.PAUSE>
	//   19   41:aload_1         
	//   20   42:lload_2         
	//   21   43:invokevirtual   #178 <Method void StreamSense.notify(StreamSenseEventType, HashMap, long)>
	//   22   46:return          
	}

	private void a(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag1;
		Exception exception;
		if(a != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #112 <Field Timer a>
	//*   4    6:ifnull          48
			flag1 = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            14
	//*   8   14:aload_0         
	//*   9   15:invokespecial   #166 <Method boolean d()>
	//*  10   18:pop             
	//*  11   19:aload_0         
	//*  12   20:invokespecial   #147 <Method boolean g()>
	//*  13   23:istore_1        
	//*  14   24:iload_2         
	//*  15   25:ifne            40
	//*  16   28:iload_1         
	//*  17   29:ifne            40
	//*  18   32:aload_0         
	//*  19   33:aload_0         
	//*  20   34:invokespecial   #182 <Method HashMap o()>
	//*  21   37:invokespecial   #140 <Method void f(HashMap)>
	//*  22   40:aload_0         
	//*  23   41:monitorexit     
	//*  24   42:return          
	//*  25   43:astore_3        
	//*  26   44:aload_0         
	//*  27   45:monitorexit     
	//*  28   46:aload_3         
	//*  29   47:athrow          
			flag1 = false;
	//   30   48:iconst_0        
	//   31   49:istore_2        
		d();
		flag = g();
		if(flag1 || flag)
			break MISSING_BLOCK_LABEL_40;
		f(o());
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  32   50:goto            14
	}

	static boolean a(StreamSenseMediaPlayer streamsensemediaplayer, boolean flag)
	{
		streamsensemediaplayer.n = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field boolean n>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void b()
	{
		m = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #76  <Field boolean m>
		if(n() && !isPlayerPausedForSeeking())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #125 <Method boolean n()>
	//*   5    9:ifeq            24
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #128 <Method boolean isPlayerPausedForSeeking()>
	//*   8   16:ifne            24
			a(true);
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:invokespecial   #185 <Method void a(boolean)>
	//   12   24:return          
	}

	private void b(MediaPlayer mediaplayer)
	{
		if(n())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #125 <Method boolean n()>
	//*   2    4:ifeq            12
			a(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokespecial   #185 <Method void a(boolean)>
	//    6   12:return          
	}

	static void b(StreamSenseMediaPlayer streamsensemediaplayer, MediaPlayer mediaplayer)
	{
		streamsensemediaplayer.b(mediaplayer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #187 <Method void b(MediaPlayer)>
	//    3    5:return          
	}

	static void b(StreamSenseMediaPlayer streamsensemediaplayer, HashMap hashmap)
	{
		streamsensemediaplayer.a(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #189 <Method void a(HashMap)>
	//    3    5:return          
	}

	private void b(HashMap hashmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag1;
		boolean flag2;
		flag1 = d();
	//    2    2:aload_0         
	//    3    3:invokespecial   #166 <Method boolean d()>
	//    4    6:istore_3        
		flag2 = f();
	//    5    7:aload_0         
	//    6    8:invokespecial   #145 <Method boolean f()>
	//    7   11:istore          4
		boolean flag;
		if(b != null)
	//*   8   13:aload_0         
	//*   9   14:getfield        #114 <Field Timer b>
	//*  10   17:ifnull          56
			flag = true;
	//   11   20:iconst_1        
	//   12   21:istore_2        
		else
	//*  13   22:goto            25
	//*  14   25:iload_2         
	//*  15   26:ifne            48
	//*  16   29:iload_3         
	//*  17   30:ifne            48
	//*  18   33:iload           4
	//*  19   35:ifne            48
	//*  20   38:aload_0         
	//*  21   39:aload_1         
	//*  22   40:invokespecial   #191 <Method void d(HashMap)>
	//*  23   43:aload_0         
	//*  24   44:aload_1         
	//*  25   45:invokespecial   #191 <Method void d(HashMap)>
	//*  26   48:aload_0         
	//*  27   49:monitorexit     
	//*  28   50:return          
	//*  29   51:astore_1        
	//*  30   52:aload_0         
	//*  31   53:monitorexit     
	//*  32   54:aload_1         
	//*  33   55:athrow          
			flag = false;
	//   34   56:iconst_0        
	//   35   57:istore_2        
		if(flag || flag1 || flag2)
			break MISSING_BLOCK_LABEL_48;
		d(hashmap);
		d(hashmap);
		this;
		JVM INSTR monitorexit ;
		return;
		hashmap;
		throw hashmap;
	//*  36   58:goto            25
	}

	static boolean b(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		return streamsensemediaplayer.n;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean n>
	//    2    4:ireturn         
	}

	private void c()
	{
		super.setOnCompletionListener(q);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field android.media.MediaPlayer$OnCompletionListener q>
	//    3    5:invokespecial   #196 <Method void MediaPlayer.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
		super.setOnInfoListener(s);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #94  <Field android.media.MediaPlayer$OnInfoListener s>
	//    7   13:invokespecial   #200 <Method void MediaPlayer.setOnInfoListener(android.media.MediaPlayer$OnInfoListener)>
		super.setOnSeekCompleteListener(u);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #101 <Field android.media.MediaPlayer$OnSeekCompleteListener u>
	//   11   21:invokespecial   #204 <Method void MediaPlayer.setOnSeekCompleteListener(android.media.MediaPlayer$OnSeekCompleteListener)>
		super.setOnPreparedListener(w);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #108 <Field android.media.MediaPlayer$OnPreparedListener w>
	//   15   29:invokespecial   #208 <Method void MediaPlayer.setOnPreparedListener(android.media.MediaPlayer$OnPreparedListener)>
	//   16   32:return          
	}

	private void c(HashMap hashmap)
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method boolean d()>
	//    2    4:pop             
		f();
	//    3    5:aload_0         
	//    4    6:invokespecial   #145 <Method boolean f()>
	//    5    9:pop             
		g();
	//    6   10:aload_0         
	//    7   11:invokespecial   #147 <Method boolean g()>
	//    8   14:pop             
		if(j != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #66  <Field StreamSense j>
	//*  11   19:ifnull          37
			j.notify(StreamSenseEventType.BUFFER, hashmap, m());
	//   12   22:aload_0         
	//   13   23:getfield        #66  <Field StreamSense j>
	//   14   26:getstatic       #211 <Field StreamSenseEventType StreamSenseEventType.BUFFER>
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokespecial   #143 <Method long m()>
	//   18   34:invokevirtual   #178 <Method void StreamSense.notify(StreamSenseEventType, HashMap, long)>
	//   19   37:return          
	}

	static boolean c(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		return streamsensemediaplayer.m;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field boolean m>
	//    2    4:ireturn         
	}

	static void d(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		streamsensemediaplayer.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #213 <Method void a()>
	//    2    4:return          
	}

	private void d(HashMap hashmap)
	{
		a(hashmap, m());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokespecial   #143 <Method long m()>
	//    4    6:invokespecial   #215 <Method void a(HashMap, long)>
	//    5    9:return          
	}

	private boolean d()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(x == null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #110 <Field Timer x>
	//    4    6:ifnull          27
_L1:
		x.cancel();
	//    5    9:aload_0         
	//    6   10:getfield        #110 <Field Timer x>
	//    7   13:invokevirtual   #218 <Method void Timer.cancel()>
		x = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #110 <Field Timer x>
		boolean flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_1        
_L4:
		this;
	//   13   23:aload_0         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return flag;
	//   15   25:iload_1         
	//   16   26:ireturn         
_L2:
		flag = false;
	//   17   27:iconst_0        
	//   18   28:istore_1        
		if(true) goto _L4; else goto _L3
	//   19   29:goto            23
_L3:
		Exception exception;
		exception;
	//   20   32:astore_2        
	//*  21   33:aload_0         
		throw exception;
	//   22   34:monitorexit     
	//   23   35:aload_2         
	//   24   36:athrow          
	}

	private void e()
	{
		a(o());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #182 <Method HashMap o()>
	//    3    5:invokespecial   #189 <Method void a(HashMap)>
	//    4    8:return          
	}

	static void e(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		streamsensemediaplayer.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #220 <Method void b()>
	//    2    4:return          
	}

	private void e(HashMap hashmap)
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method boolean f()>
	//    2    4:pop             
		d();
	//    3    5:aload_0         
	//    4    6:invokespecial   #166 <Method boolean d()>
	//    5    9:pop             
		g();
	//    6   10:aload_0         
	//    7   11:invokespecial   #147 <Method boolean g()>
	//    8   14:pop             
		i();
	//    9   15:aload_0         
	//   10   16:invokespecial   #222 <Method boolean i()>
	//   11   19:pop             
		if(j != null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #66  <Field StreamSense j>
	//*  14   24:ifnull          42
			j.notify(StreamSenseEventType.END, hashmap, m());
	//   15   27:aload_0         
	//   16   28:getfield        #66  <Field StreamSense j>
	//   17   31:getstatic       #225 <Field StreamSenseEventType StreamSenseEventType.END>
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:invokespecial   #143 <Method long m()>
	//   21   39:invokevirtual   #178 <Method void StreamSense.notify(StreamSenseEventType, HashMap, long)>
	//   22   42:return          
	}

	static android.media.MediaPlayer.OnInfoListener f(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		return streamsensemediaplayer.r;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field android.media.MediaPlayer$OnInfoListener r>
	//    2    4:areturn         
	}

	private void f(HashMap hashmap)
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method boolean d()>
	//    2    4:pop             
		if(!g() && j != null)
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #147 <Method boolean g()>
	//*   5    9:ifne            34
	//*   6   12:aload_0         
	//*   7   13:getfield        #66  <Field StreamSense j>
	//*   8   16:ifnull          34
			j.notify(StreamSenseEventType.PLAY, hashmap, m());
	//    9   19:aload_0         
	//   10   20:getfield        #66  <Field StreamSense j>
	//   11   23:getstatic       #229 <Field StreamSenseEventType StreamSenseEventType.PLAY>
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:invokespecial   #143 <Method long m()>
	//   15   31:invokevirtual   #178 <Method void StreamSense.notify(StreamSenseEventType, HashMap, long)>
	//   16   34:return          
	}

	private boolean f()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(a == null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #112 <Field Timer a>
	//    4    6:ifnull          27
_L1:
		a.cancel();
	//    5    9:aload_0         
	//    6   10:getfield        #112 <Field Timer a>
	//    7   13:invokevirtual   #218 <Method void Timer.cancel()>
		a = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #112 <Field Timer a>
		boolean flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_1        
_L4:
		this;
	//   13   23:aload_0         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return flag;
	//   15   25:iload_1         
	//   16   26:ireturn         
_L2:
		flag = false;
	//   17   27:iconst_0        
	//   18   28:istore_1        
		if(true) goto _L4; else goto _L3
	//   19   29:goto            23
_L3:
		Exception exception;
		exception;
	//   20   32:astore_2        
	//*  21   33:aload_0         
		throw exception;
	//   22   34:monitorexit     
	//   23   35:aload_2         
	//   24   36:athrow          
	}

	static android.media.MediaPlayer.OnSeekCompleteListener g(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		return streamsensemediaplayer.t;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field android.media.MediaPlayer$OnSeekCompleteListener t>
	//    2    4:areturn         
	}

	private boolean g()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(b == null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #114 <Field Timer b>
	//    4    6:ifnull          27
_L1:
		b.cancel();
	//    5    9:aload_0         
	//    6   10:getfield        #114 <Field Timer b>
	//    7   13:invokevirtual   #218 <Method void Timer.cancel()>
		b = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #114 <Field Timer b>
		boolean flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_1        
_L4:
		this;
	//   13   23:aload_0         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return flag;
	//   15   25:iload_1         
	//   16   26:ireturn         
_L2:
		flag = false;
	//   17   27:iconst_0        
	//   18   28:istore_1        
		if(true) goto _L4; else goto _L3
	//   19   29:goto            23
_L3:
		Exception exception;
		exception;
	//   20   32:astore_2        
	//*  21   33:aload_0         
		throw exception;
	//   22   34:monitorexit     
	//   23   35:aload_2         
	//   24   36:athrow          
	}

	static android.media.MediaPlayer.OnPreparedListener h(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		return streamsensemediaplayer.v;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field android.media.MediaPlayer$OnPreparedListener v>
	//    2    4:areturn         
	}

	private void h()
	{
		b(o());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #182 <Method HashMap o()>
	//    3    5:invokespecial   #233 <Method void b(HashMap)>
	//    4    8:return          
	}

	static long i(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		return streamsensemediaplayer.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method long m()>
	//    2    4:lreturn         
	}

	private boolean i()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(y == null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #116 <Field Timer y>
	//    4    6:ifnull          27
_L1:
		y.cancel();
	//    5    9:aload_0         
	//    6   10:getfield        #116 <Field Timer y>
	//    7   13:invokevirtual   #218 <Method void Timer.cancel()>
		y = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #116 <Field Timer y>
		boolean flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_1        
_L4:
		this;
	//   13   23:aload_0         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return flag;
	//   15   25:iload_1         
	//   16   26:ireturn         
_L2:
		flag = false;
	//   17   27:iconst_0        
	//   18   28:istore_1        
		if(true) goto _L4; else goto _L3
	//   19   29:goto            23
_L3:
		Exception exception;
		exception;
	//   20   32:astore_2        
	//*  21   33:aload_0         
		throw exception;
	//   22   34:monitorexit     
	//   23   35:aload_2         
	//   24   36:athrow          
	}

	private void j()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(e && y == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #56  <Field boolean e>
	//*   4    6:ifeq            51
	//*   5    9:aload_0         
	//*   6   10:getfield        #116 <Field Timer y>
	//*   7   13:ifnonnull       51
		{
			long l1 = m();
	//    8   16:aload_0         
	//    9   17:invokespecial   #143 <Method long m()>
	//   10   20:lstore_1        
			y = new Timer();
	//   11   21:aload_0         
	//   12   22:new             #149 <Class Timer>
	//   13   25:dup             
	//   14   26:invokespecial   #150 <Method void Timer()>
	//   15   29:putfield        #116 <Field Timer y>
			y.schedule(((java.util.TimerTask) (new l(this, l1))), 250L);
	//   16   32:aload_0         
	//   17   33:getfield        #116 <Field Timer y>
	//   18   36:new             #236 <Class l>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:lload_1         
	//   22   42:invokespecial   #239 <Method void l(StreamSenseMediaPlayer, long)>
	//   23   45:ldc2w           #240 <Long 250L>
	//   24   48:invokevirtual   #161 <Method void Timer.schedule(java.util.TimerTask, long)>
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

	static boolean j(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		return streamsensemediaplayer.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method boolean d()>
	//    2    4:ireturn         
	}

	private void k()
	{
		c(o());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #182 <Method HashMap o()>
	//    3    5:invokespecial   #243 <Method void c(HashMap)>
	//    4    8:return          
	}

	static void k(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		streamsensemediaplayer.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #245 <Method void j()>
	//    2    4:return          
	}

	static Timer l(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		return streamsensemediaplayer.y;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Timer y>
	//    2    4:areturn         
	}

	private void l()
	{
		e(o());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #182 <Method HashMap o()>
	//    3    5:invokespecial   #248 <Method void e(HashMap)>
	//    4    8:return          
	}

	private long m()
	{
		IllegalStateException illegalstateexception;
		int i1;
		try
		{
			i1 = getCurrentPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method int getCurrentPosition()>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:i2l             
	//*   5    7:lreturn         
	//*   6    8:lconst_0        
	//*   7    9:lreturn         
		// Misplaced declaration of an exception variable
		catch(IllegalStateException illegalstateexception)
		{
			return 0L;
		}
		return (long)i1;
	//*   8   10:astore_2        
	//*   9   11:goto            8
	}

	static boolean m(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		return streamsensemediaplayer.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method boolean n()>
	//    2    4:ireturn         
	}

	private boolean n()
	{
		IllegalStateException illegalstateexception;
		boolean flag;
		try
		{
			flag = isPlaying();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method boolean isPlaying()>
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

	static boolean n(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		return streamsensemediaplayer.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #222 <Method boolean i()>
	//    2    4:ireturn         
	}

	private HashMap o()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #259 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #260 <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put("ns_ts", ((Object) (String.valueOf(System.currentTimeMillis()))));
	//    4    8:aload_1         
	//    5    9:ldc2            #262 <String "ns_ts">
	//    6   12:invokestatic    #267 <Method long System.currentTimeMillis()>
	//    7   15:invokestatic    #273 <Method String String.valueOf(long)>
	//    8   18:invokevirtual   #277 <Method Object HashMap.put(Object, Object)>
	//    9   21:pop             
		hashmap.putAll(((java.util.Map) (p())));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokespecial   #279 <Method HashMap p()>
	//   13   27:invokevirtual   #283 <Method void HashMap.putAll(java.util.Map)>
		return hashmap;
	//   14   30:aload_1         
	//   15   31:areturn         
	}

	private HashMap p()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #259 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #260 <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put("ns_st_cl", ((Object) (k)));
	//    4    8:aload_1         
	//    5    9:ldc2            #286 <String "ns_st_cl">
	//    6   12:aload_0         
	//    7   13:getfield        #70  <Field String k>
	//    8   16:invokevirtual   #277 <Method Object HashMap.put(Object, Object)>
	//    9   19:pop             
		hashmap.put("ns_st_cs", ((Object) (l)));
	//   10   20:aload_1         
	//   11   21:ldc2            #288 <String "ns_st_cs">
	//   12   24:aload_0         
	//   13   25:getfield        #74  <Field String l>
	//   14   28:invokevirtual   #277 <Method Object HashMap.put(Object, Object)>
	//   15   31:pop             
		hashmap.put("ns_st_cu", ((Object) (o)));
	//   16   32:aload_1         
	//   17   33:ldc2            #290 <String "ns_st_cu">
	//   18   36:aload_0         
	//   19   37:getfield        #292 <Field String o>
	//   20   40:invokevirtual   #277 <Method Object HashMap.put(Object, Object)>
	//   21   43:pop             
		hashmap.put("ns_st_mp", ((Object) (((Class) (com/comscore/streaming/StreamSenseMediaPlayer)).getSimpleName())));
	//   22   44:aload_1         
	//   23   45:ldc2            #294 <String "ns_st_mp">
	//   24   48:ldc1            #2   <Class StreamSenseMediaPlayer>
	//   25   50:invokevirtual   #300 <Method String Class.getSimpleName()>
	//   26   53:invokevirtual   #277 <Method Object HashMap.put(Object, Object)>
	//   27   56:pop             
		hashmap.put("ns_st_mv", ((Object) (Integer.toString(android.os.Build.VERSION.SDK_INT))));
	//   28   57:aload_1         
	//   29   58:ldc2            #302 <String "ns_st_mv">
	//   30   61:getstatic       #54  <Field int android.os.Build$VERSION.SDK_INT>
	//   31   64:invokestatic    #308 <Method String Integer.toString(int)>
	//   32   67:invokevirtual   #277 <Method Object HashMap.put(Object, Object)>
	//   33   70:pop             
		return hashmap;
	//   34   71:aload_1         
	//   35   72:areturn         
	}

	public boolean isPlayerPausedForBuffering()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field boolean m>
	//    2    4:ireturn         
	}

	public boolean isPlayerPausedForSeeking()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean n>
	//    2    4:ireturn         
	}

	public void pause()
	{
		super.pause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #312 <Method void MediaPlayer.pause()>
		i();
	//    2    4:aload_0         
	//    3    5:invokespecial   #222 <Method boolean i()>
	//    4    8:pop             
		m = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #76  <Field boolean m>
		n = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #78  <Field boolean n>
		h();
	//   11   19:aload_0         
	//   12   20:invokespecial   #314 <Method void h()>
	//   13   23:return          
	}

	public void prepare()
	{
		super.prepare();
	//    0    0:aload_0         
	//    1    1:invokespecial   #317 <Method void MediaPlayer.prepare()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #319 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #320 <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append(getVideoWidth());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #323 <Method int getVideoWidth()>
	//    9   17:invokevirtual   #327 <Method StringBuilder StringBuilder.append(int)>
	//   10   20:pop             
		stringbuilder.append("x");
	//   11   21:aload_1         
	//   12   22:ldc2            #328 <String "x">
	//   13   25:invokevirtual   #331 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		stringbuilder.append(getVideoHeight());
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #334 <Method int getVideoHeight()>
	//   18   34:invokevirtual   #327 <Method StringBuilder StringBuilder.append(int)>
	//   19   37:pop             
		l = stringbuilder.toString();
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   23   43:putfield        #74  <Field String l>
	//   24   46:return          
	}

	public void prepareAsync()
	{
		super.prepareAsync();
	//    0    0:aload_0         
	//    1    1:invokespecial   #339 <Method void MediaPlayer.prepareAsync()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #319 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #320 <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append(getVideoWidth());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #323 <Method int getVideoWidth()>
	//    9   17:invokevirtual   #327 <Method StringBuilder StringBuilder.append(int)>
	//   10   20:pop             
		stringbuilder.append("x");
	//   11   21:aload_1         
	//   12   22:ldc2            #328 <String "x">
	//   13   25:invokevirtual   #331 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		stringbuilder.append(getVideoHeight());
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #334 <Method int getVideoHeight()>
	//   18   34:invokevirtual   #327 <Method StringBuilder StringBuilder.append(int)>
	//   19   37:pop             
		l = stringbuilder.toString();
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   23   43:putfield        #74  <Field String l>
	//   24   46:return          
	}

	public void release()
	{
		super.release();
	//    0    0:aload_0         
	//    1    1:invokespecial   #342 <Method void MediaPlayer.release()>
		l();
	//    2    4:aload_0         
	//    3    5:invokespecial   #133 <Method void l()>
	//    4    8:return          
	}

	public void seekTo(int i1)
	{
		super.seekTo(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #346 <Method void MediaPlayer.seekTo(int)>
		n = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #78  <Field boolean n>
		if(n())
	//*   6   10:aload_0         
	//*   7   11:invokespecial   #125 <Method boolean n()>
	//*   8   14:ifeq            29
			a(o(), m());
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokespecial   #182 <Method HashMap o()>
	//   12   22:aload_0         
	//   13   23:invokespecial   #143 <Method long m()>
	//   14   26:invokespecial   #215 <Method void a(HashMap, long)>
	//   15   29:return          
	}

	public void setDataSource(Context context, Uri uri)
	{
		super.setDataSource(context, uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #350 <Method void MediaPlayer.setDataSource(Context, Uri)>
		o = uri.toString();
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #353 <Method String Uri.toString()>
	//    7   11:putfield        #292 <Field String o>
	//    8   14:return          
	}

	public void setDataSource(FileDescriptor filedescriptor)
	{
		super.setDataSource(filedescriptor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #356 <Method void MediaPlayer.setDataSource(FileDescriptor)>
		o = "local_file";
	//    3    5:aload_0         
	//    4    6:ldc1            #45  <String "local_file">
	//    5    8:putfield        #292 <Field String o>
	//    6   11:return          
	}

	public void setDataSource(FileDescriptor filedescriptor, long l1, long l2)
	{
		super.setDataSource(filedescriptor, l1, l2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:invokespecial   #359 <Method void MediaPlayer.setDataSource(FileDescriptor, long, long)>
		o = "local_file";
	//    5    8:aload_0         
	//    6    9:ldc1            #45  <String "local_file">
	//    7   11:putfield        #292 <Field String o>
	//    8   14:return          
	}

	public void setDataSource(String s1)
	{
		super.setDataSource(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #362 <Method void MediaPlayer.setDataSource(String)>
		o = s1;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #292 <Field String o>
	//    6   10:return          
	}

	public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
	{
		super.setOnCompletionListener(q);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #87  <Field android.media.MediaPlayer$OnCompletionListener q>
	//    3    5:invokespecial   #196 <Method void MediaPlayer.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
		p = oncompletionlistener;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #80  <Field android.media.MediaPlayer$OnCompletionListener p>
	//    7   13:return          
	}

	public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener oninfolistener)
	{
		super.setOnInfoListener(s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #94  <Field android.media.MediaPlayer$OnInfoListener s>
	//    3    5:invokespecial   #200 <Method void MediaPlayer.setOnInfoListener(android.media.MediaPlayer$OnInfoListener)>
		r = oninfolistener;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #89  <Field android.media.MediaPlayer$OnInfoListener r>
	//    7   13:return          
	}

	public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
	{
		super.setOnPreparedListener(w);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #108 <Field android.media.MediaPlayer$OnPreparedListener w>
	//    3    5:invokespecial   #208 <Method void MediaPlayer.setOnPreparedListener(android.media.MediaPlayer$OnPreparedListener)>
		v = onpreparedlistener;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #103 <Field android.media.MediaPlayer$OnPreparedListener v>
	//    7   13:return          
	}

	public void setOnSeekCompleteListener(android.media.MediaPlayer.OnSeekCompleteListener onseekcompletelistener)
	{
		super.setOnSeekCompleteListener(u);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #101 <Field android.media.MediaPlayer$OnSeekCompleteListener u>
	//    3    5:invokespecial   #204 <Method void MediaPlayer.setOnSeekCompleteListener(android.media.MediaPlayer$OnSeekCompleteListener)>
		t = onseekcompletelistener;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #96  <Field android.media.MediaPlayer$OnSeekCompleteListener t>
	//    7   13:return          
	}

	public void setStreamSense(StreamSense streamsense)
	{
		j = streamsense;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field StreamSense j>
		j.setLabel("ns_st_pv", "4.1307.02");
	//    3    5:aload_0         
	//    4    6:getfield        #66  <Field StreamSense j>
	//    5    9:ldc2            #366 <String "ns_st_pv">
	//    6   12:ldc2            #368 <String "4.1307.02">
	//    7   15:invokevirtual   #372 <Method void StreamSense.setLabel(String, String)>
	//    8   18:return          
	}

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #375 <Method void MediaPlayer.start()>
		e();
	//    2    4:aload_0         
	//    3    5:invokespecial   #377 <Method void e()>
	//    4    8:return          
	}

	public void stop()
	{
		super.stop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #380 <Method void MediaPlayer.stop()>
		l();
	//    2    4:aload_0         
	//    3    5:invokespecial   #133 <Method void l()>
	//    4    8:return          
	}

	Timer a;
	Timer b;
	private final String c;
	private final int d;
	private final boolean e;
	private final boolean f;
	private final boolean g;
	private final boolean h;
	private final int i;
	private StreamSense j;
	private String k;
	private String l;
	private boolean m;
	private boolean n;
	private String o;
	private android.media.MediaPlayer.OnCompletionListener p;
	private final android.media.MediaPlayer.OnCompletionListener q;
	private android.media.MediaPlayer.OnInfoListener r;
	private final android.media.MediaPlayer.OnInfoListener s;
	private android.media.MediaPlayer.OnSeekCompleteListener t;
	private final android.media.MediaPlayer.OnSeekCompleteListener u;
	private android.media.MediaPlayer.OnPreparedListener v;
	private final android.media.MediaPlayer.OnPreparedListener w;
	private Timer x;
	private Timer y;
}
