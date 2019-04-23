// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			acm, adf, wx, adb, 
//			adh, acl, acw, xg, 
//			acj, ack, ace, acf, 
//			acc, acg, aci, ach, 
//			acb, zzty, adc

public final class aca extends acm
	implements android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.TextureView.SurfaceTextureListener
{

	public aca(Context context, boolean flag, boolean flag1, adc adc, adf adf1)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #109 <Method void acm(Context)>
		f = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #111 <Field int f>
		g = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #113 <Field int g>
		setSurfaceTextureListener(((android.view.TextureView.SurfaceTextureListener) (this)));
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #117 <Method void setSurfaceTextureListener(android.view.TextureView$SurfaceTextureListener)>
		d = adf1;
	//   12   20:aload_0         
	//   13   21:aload           5
	//   14   23:putfield        #119 <Field adf d>
		p = flag;
	//   15   26:aload_0         
	//   16   27:iload_2         
	//   17   28:putfield        #121 <Field boolean p>
		e = flag1;
	//   18   31:aload_0         
	//   19   32:iload_3         
	//   20   33:putfield        #123 <Field boolean e>
		d.a(((acm) (this)));
	//   21   36:aload_0         
	//   22   37:getfield        #119 <Field adf d>
	//   23   40:aload_0         
	//   24   41:invokevirtual   #129 <Method void adf.a(acm)>
	//   25   44:return          
	}

	static acl a(aca aca1)
	{
		return aca1.r;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field acl r>
	//    2    4:areturn         
	}

	private final void a(float f1)
	{
		MediaPlayer mediaplayer = h;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field MediaPlayer h>
	//    2    4:astore_2        
		if(mediaplayer != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
		{
			try
			{
				mediaplayer.setVolume(f1, f1);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:fload_1         
	//    8   12:invokevirtual   #143 <Method void MediaPlayer.setVolume(float, float)>
				return;
	//    9   15:return          
			}
	//*  10   16:ldc1            #145 <String "AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().">
	//*  11   18:invokestatic    #150 <Method void com.google.android.gms.internal.ads.wx.e(String)>
	//*  12   21:return          
			catch(IllegalStateException illegalstateexception)
	//*  13   22:astore_2        
			{
				return;
	//   14   23:return          
			}
		} else
		{
			com.google.android.gms.internal.ads.wx.e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
			return;
		}
	}

	private final void a(boolean flag)
	{
		wx.a("AdMediaPlayerView release");
	//    0    0:ldc1            #153 <String "AdMediaPlayerView release">
	//    1    2:invokestatic    #155 <Method void wx.a(String)>
		Object obj = ((Object) (o));
	//    2    5:aload_0         
	//    3    6:getfield        #157 <Field adb o>
	//    4    9:astore_2        
		if(obj != null)
	//*   5   10:aload_2         
	//*   6   11:ifnull          23
		{
			((adb) (obj)).b();
	//    7   14:aload_2         
	//    8   15:invokevirtual   #162 <Method void adb.b()>
			o = null;
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:putfield        #157 <Field adb o>
		}
		obj = ((Object) (h));
	//   12   23:aload_0         
	//   13   24:getfield        #137 <Field MediaPlayer h>
	//   14   27:astore_2        
		if(obj != null)
	//*  15   28:aload_2         
	//*  16   29:ifnull          67
		{
			((MediaPlayer) (obj)).reset();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #165 <Method void MediaPlayer.reset()>
			h.release();
	//   19   36:aload_0         
	//   20   37:getfield        #137 <Field MediaPlayer h>
	//   21   40:invokevirtual   #168 <Method void MediaPlayer.release()>
			h = null;
	//   22   43:aload_0         
	//   23   44:aconst_null     
	//   24   45:putfield        #137 <Field MediaPlayer h>
			g(0);
	//   25   48:aload_0         
	//   26   49:iconst_0        
	//   27   50:invokespecial   #171 <Method void g(int)>
			if(flag)
	//*  28   53:iload_1         
	//*  29   54:ifeq            67
			{
				g = 0;
	//   30   57:aload_0         
	//   31   58:iconst_0        
	//   32   59:putfield        #113 <Field int g>
				g = 0;
	//   33   62:aload_0         
	//   34   63:iconst_0        
	//   35   64:putfield        #113 <Field int g>
			}
		}
	//   36   67:return          
	}

	private final void f()
	{
		SurfaceTexture surfacetexture;
		wx.a("AdMediaPlayerView init MediaPlayer");
	//    0    0:ldc1            #177 <String "AdMediaPlayerView init MediaPlayer">
	//    1    2:invokestatic    #155 <Method void wx.a(String)>
		surfacetexture = getSurfaceTexture();
	//    2    5:aload_0         
	//    3    6:invokevirtual   #181 <Method SurfaceTexture getSurfaceTexture()>
	//    4    9:astore_2        
		if(i == null)
			break MISSING_BLOCK_LABEL_305;
	//    5   10:aload_0         
	//    6   11:getfield        #183 <Field Uri i>
	//    7   14:ifnull          305
		if(surfacetexture == null)
	//*   8   17:aload_2         
	//*   9   18:ifnonnull       22
			return;
	//   10   21:return          
		a(false);
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:invokespecial   #185 <Method void a(boolean)>
		aw.w();
	//   14   27:invokestatic    #191 <Method com.google.android.gms.ads.internal.overlay.t aw.w()>
	//   15   30:pop             
		h = new MediaPlayer();
	//   16   31:aload_0         
	//   17   32:new             #139 <Class MediaPlayer>
	//   18   35:dup             
	//   19   36:invokespecial   #192 <Method void MediaPlayer()>
	//   20   39:putfield        #137 <Field MediaPlayer h>
		h.setOnBufferingUpdateListener(((android.media.MediaPlayer.OnBufferingUpdateListener) (this)));
	//   21   42:aload_0         
	//   22   43:getfield        #137 <Field MediaPlayer h>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #196 <Method void MediaPlayer.setOnBufferingUpdateListener(android.media.MediaPlayer$OnBufferingUpdateListener)>
		h.setOnCompletionListener(((android.media.MediaPlayer.OnCompletionListener) (this)));
	//   25   50:aload_0         
	//   26   51:getfield        #137 <Field MediaPlayer h>
	//   27   54:aload_0         
	//   28   55:invokevirtual   #200 <Method void MediaPlayer.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
		h.setOnErrorListener(((android.media.MediaPlayer.OnErrorListener) (this)));
	//   29   58:aload_0         
	//   30   59:getfield        #137 <Field MediaPlayer h>
	//   31   62:aload_0         
	//   32   63:invokevirtual   #204 <Method void MediaPlayer.setOnErrorListener(android.media.MediaPlayer$OnErrorListener)>
		h.setOnInfoListener(((android.media.MediaPlayer.OnInfoListener) (this)));
	//   33   66:aload_0         
	//   34   67:getfield        #137 <Field MediaPlayer h>
	//   35   70:aload_0         
	//   36   71:invokevirtual   #208 <Method void MediaPlayer.setOnInfoListener(android.media.MediaPlayer$OnInfoListener)>
		h.setOnPreparedListener(((android.media.MediaPlayer.OnPreparedListener) (this)));
	//   37   74:aload_0         
	//   38   75:getfield        #137 <Field MediaPlayer h>
	//   39   78:aload_0         
	//   40   79:invokevirtual   #212 <Method void MediaPlayer.setOnPreparedListener(android.media.MediaPlayer$OnPreparedListener)>
		h.setOnVideoSizeChangedListener(((android.media.MediaPlayer.OnVideoSizeChangedListener) (this)));
	//   41   82:aload_0         
	//   42   83:getfield        #137 <Field MediaPlayer h>
	//   43   86:aload_0         
	//   44   87:invokevirtual   #216 <Method void MediaPlayer.setOnVideoSizeChangedListener(android.media.MediaPlayer$OnVideoSizeChangedListener)>
		l = 0;
	//   45   90:aload_0         
	//   46   91:iconst_0        
	//   47   92:putfield        #218 <Field int l>
		Object obj = ((Object) (surfacetexture));
	//   48   95:aload_2         
	//   49   96:astore_1        
		if(!p)
			break MISSING_BLOCK_LABEL_171;
	//   50   97:aload_0         
	//   51   98:getfield        #121 <Field boolean p>
	//   52  101:ifeq            171
		o = new adb(getContext());
	//   53  104:aload_0         
	//   54  105:new             #159 <Class adb>
	//   55  108:dup             
	//   56  109:aload_0         
	//   57  110:invokevirtual   #222 <Method Context getContext()>
	//   58  113:invokespecial   #223 <Method void adb(Context)>
	//   59  116:putfield        #157 <Field adb o>
		o.a(surfacetexture, getWidth(), getHeight());
	//   60  119:aload_0         
	//   61  120:getfield        #157 <Field adb o>
	//   62  123:aload_2         
	//   63  124:aload_0         
	//   64  125:invokevirtual   #227 <Method int getWidth()>
	//   65  128:aload_0         
	//   66  129:invokevirtual   #230 <Method int getHeight()>
	//   67  132:invokevirtual   #233 <Method void adb.a(SurfaceTexture, int, int)>
		o.start();
	//   68  135:aload_0         
	//   69  136:getfield        #157 <Field adb o>
	//   70  139:invokevirtual   #236 <Method void adb.start()>
		obj = ((Object) (o.c()));
	//   71  142:aload_0         
	//   72  143:getfield        #157 <Field adb o>
	//   73  146:invokevirtual   #238 <Method SurfaceTexture adb.c()>
	//   74  149:astore_1        
		if(obj != null)
	//*  75  150:aload_1         
	//*  76  151:ifnull          157
			break MISSING_BLOCK_LABEL_171;
	//   77  154:goto            171
		o.b();
	//   78  157:aload_0         
	//   79  158:getfield        #157 <Field adb o>
	//   80  161:invokevirtual   #162 <Method void adb.b()>
		o = null;
	//   81  164:aload_0         
	//   82  165:aconst_null     
	//   83  166:putfield        #157 <Field adb o>
		obj = ((Object) (surfacetexture));
	//   84  169:aload_2         
	//   85  170:astore_1        
		h.setDataSource(getContext(), i);
	//   86  171:aload_0         
	//   87  172:getfield        #137 <Field MediaPlayer h>
	//   88  175:aload_0         
	//   89  176:invokevirtual   #222 <Method Context getContext()>
	//   90  179:aload_0         
	//   91  180:getfield        #183 <Field Uri i>
	//   92  183:invokevirtual   #242 <Method void MediaPlayer.setDataSource(Context, Uri)>
		aw.x();
	//   93  186:invokestatic    #246 <Method com.google.android.gms.ads.internal.overlay.u aw.x()>
	//   94  189:pop             
		obj = ((Object) (new Surface(((SurfaceTexture) (obj)))));
	//   95  190:new             #248 <Class Surface>
	//   96  193:dup             
	//   97  194:aload_1         
	//   98  195:invokespecial   #251 <Method void Surface(SurfaceTexture)>
	//   99  198:astore_1        
		h.setSurface(((Surface) (obj)));
	//  100  199:aload_0         
	//  101  200:getfield        #137 <Field MediaPlayer h>
	//  102  203:aload_1         
	//  103  204:invokevirtual   #255 <Method void MediaPlayer.setSurface(Surface)>
		h.setAudioStreamType(3);
	//  104  207:aload_0         
	//  105  208:getfield        #137 <Field MediaPlayer h>
	//  106  211:iconst_3        
	//  107  212:invokevirtual   #258 <Method void MediaPlayer.setAudioStreamType(int)>
		h.setScreenOnWhilePlaying(true);
	//  108  215:aload_0         
	//  109  216:getfield        #137 <Field MediaPlayer h>
	//  110  219:iconst_1        
	//  111  220:invokevirtual   #261 <Method void MediaPlayer.setScreenOnWhilePlaying(boolean)>
		h.prepareAsync();
	//  112  223:aload_0         
	//  113  224:getfield        #137 <Field MediaPlayer h>
	//  114  227:invokevirtual   #264 <Method void MediaPlayer.prepareAsync()>
		g(1);
	//  115  230:aload_0         
	//  116  231:iconst_1        
	//  117  232:invokespecial   #171 <Method void g(int)>
		return;
	//  118  235:return          
		Object obj1;
		obj1;
	//  119  236:astore_1        
		break MISSING_BLOCK_LABEL_245;
	//  120  237:goto            245
		obj1;
	//  121  240:astore_1        
		break MISSING_BLOCK_LABEL_245;
	//  122  241:goto            245
		obj1;
	//  123  244:astore_1        
		String s = String.valueOf(((Object) (i)));
	//  124  245:aload_0         
	//  125  246:getfield        #183 <Field Uri i>
	//  126  249:invokestatic    #269 <Method String String.valueOf(Object)>
	//  127  252:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 36);
	//  128  253:new             #271 <Class StringBuilder>
	//  129  256:dup             
	//  130  257:aload_2         
	//  131  258:invokestatic    #269 <Method String String.valueOf(Object)>
	//  132  261:invokevirtual   #274 <Method int String.length()>
	//  133  264:bipush          36
	//  134  266:iadd            
	//  135  267:invokespecial   #276 <Method void StringBuilder(int)>
	//  136  270:astore_3        
		stringbuilder.append("Failed to initialize MediaPlayer at ");
	//  137  271:aload_3         
	//  138  272:ldc2            #278 <String "Failed to initialize MediaPlayer at ">
	//  139  275:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  140  278:pop             
		stringbuilder.append(s);
	//  141  279:aload_3         
	//  142  280:aload_2         
	//  143  281:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//  144  284:pop             
		wx.c(stringbuilder.toString(), ((Throwable) (obj1)));
	//  145  285:aload_3         
	//  146  286:invokevirtual   #286 <Method String StringBuilder.toString()>
	//  147  289:aload_1         
	//  148  290:invokestatic    #289 <Method void wx.c(String, Throwable)>
		onError(h, 1, 0);
	//  149  293:aload_0         
	//  150  294:aload_0         
	//  151  295:getfield        #137 <Field MediaPlayer h>
	//  152  298:iconst_1        
	//  153  299:iconst_0        
	//  154  300:invokevirtual   #293 <Method boolean onError(MediaPlayer, int, int)>
	//  155  303:pop             
		return;
	//  156  304:return          
	//  157  305:return          
	}

	private final void g()
	{
		if(!e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field boolean e>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(h() && h.getCurrentPosition() > 0 && g != 3)
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #296 <Method boolean h()>
	//*   6   12:ifeq            114
	//*   7   15:aload_0         
	//*   8   16:getfield        #137 <Field MediaPlayer h>
	//*   9   19:invokevirtual   #299 <Method int MediaPlayer.getCurrentPosition()>
	//*  10   22:ifle            114
	//*  11   25:aload_0         
	//*  12   26:getfield        #113 <Field int g>
	//*  13   29:iconst_3        
	//*  14   30:icmpeq          114
		{
			wx.a("AdMediaPlayerView nudging MediaPlayer");
	//   15   33:ldc2            #301 <String "AdMediaPlayerView nudging MediaPlayer">
	//   16   36:invokestatic    #155 <Method void wx.a(String)>
			a(0.0F);
	//   17   39:aload_0         
	//   18   40:fconst_0        
	//   19   41:invokespecial   #303 <Method void a(float)>
			h.start();
	//   20   44:aload_0         
	//   21   45:getfield        #137 <Field MediaPlayer h>
	//   22   48:invokevirtual   #304 <Method void MediaPlayer.start()>
			int i1 = h.getCurrentPosition();
	//   23   51:aload_0         
	//   24   52:getfield        #137 <Field MediaPlayer h>
	//   25   55:invokevirtual   #299 <Method int MediaPlayer.getCurrentPosition()>
	//   26   58:istore_1        
			for(long l1 = aw.l().a(); h() && h.getCurrentPosition() == i1 && aw.l().a() - l1 <= 250L;);
	//   27   59:invokestatic    #307 <Method e aw.l()>
	//   28   62:invokeinterface #312 <Method long e.a()>
	//   29   67:lstore_2        
	//   30   68:aload_0         
	//   31   69:invokespecial   #296 <Method boolean h()>
	//   32   72:ifeq            103
	//   33   75:aload_0         
	//   34   76:getfield        #137 <Field MediaPlayer h>
	//   35   79:invokevirtual   #299 <Method int MediaPlayer.getCurrentPosition()>
	//   36   82:iload_1         
	//   37   83:icmpne          103
	//   38   86:invokestatic    #307 <Method e aw.l()>
	//   39   89:invokeinterface #312 <Method long e.a()>
	//   40   94:lload_2         
	//   41   95:lsub            
	//   42   96:ldc2w           #313 <Long 250L>
	//   43   99:lcmp            
	//   44  100:ifle            68
			h.pause();
	//   45  103:aload_0         
	//   46  104:getfield        #137 <Field MediaPlayer h>
	//   47  107:invokevirtual   #317 <Method void MediaPlayer.pause()>
			((acm)this).e();
	//   48  110:aload_0         
	//   49  111:invokevirtual   #319 <Method void com.google.android.gms.internal.ads.acm.e()>
		}
	//   50  114:return          
	}

	private final void g(int i1)
	{
		if(i1 == 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:icmpne          22
		{
			d.c();
	//    3    5:aload_0         
	//    4    6:getfield        #119 <Field adf d>
	//    5    9:invokevirtual   #321 <Method void adf.c()>
			b.b();
	//    6   12:aload_0         
	//    7   13:getfield        #324 <Field adh b>
	//    8   16:invokevirtual   #327 <Method void adh.b()>
		} else
	//*   9   19:goto            44
		if(f == 3)
	//*  10   22:aload_0         
	//*  11   23:getfield        #111 <Field int f>
	//*  12   26:iconst_3        
	//*  13   27:icmpne          44
		{
			d.d();
	//   14   30:aload_0         
	//   15   31:getfield        #119 <Field adf d>
	//   16   34:invokevirtual   #329 <Method void adf.d()>
			b.c();
	//   17   37:aload_0         
	//   18   38:getfield        #324 <Field adh b>
	//   19   41:invokevirtual   #330 <Method void adh.c()>
		}
		f = i1;
	//   20   44:aload_0         
	//   21   45:iload_1         
	//   22   46:putfield        #111 <Field int f>
	//   23   49:return          
	}

	private final boolean h()
	{
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field MediaPlayer h>
	//*   2    4:ifnull          28
		{
			int i1 = f;
	//    3    7:aload_0         
	//    4    8:getfield        #111 <Field int f>
	//    5   11:istore_1        
			if(i1 != -1 && i1 != 0 && i1 != 1)
	//*   6   12:iload_1         
	//*   7   13:iconst_m1       
	//*   8   14:icmpeq          28
	//*   9   17:iload_1         
	//*  10   18:ifeq            28
	//*  11   21:iload_1         
	//*  12   22:iconst_1        
	//*  13   23:icmpeq          28
				return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		}
		return false;
	//   16   28:iconst_0        
	//   17   29:ireturn         
	}

	public final String a()
	{
		String s;
		if(p)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field boolean p>
	//*   2    4:ifeq            14
			s = " spherical";
	//    3    7:ldc2            #332 <String " spherical">
	//    4   10:astore_1        
		else
	//*   5   11:goto            18
			s = "";
	//    6   14:ldc2            #334 <String "">
	//    7   17:astore_1        
		s = String.valueOf(((Object) (s)));
	//    8   18:aload_1         
	//    9   19:invokestatic    #269 <Method String String.valueOf(Object)>
	//   10   22:astore_1        
		if(s.length() != 0)
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #274 <Method int String.length()>
	//*  13   27:ifeq            38
			return "MediaPlayer".concat(s);
	//   14   30:ldc2            #336 <String "MediaPlayer">
	//   15   33:aload_1         
	//   16   34:invokevirtual   #340 <Method String String.concat(String)>
	//   17   37:areturn         
		else
			return new String("MediaPlayer");
	//   18   38:new             #266 <Class String>
	//   19   41:dup             
	//   20   42:ldc2            #336 <String "MediaPlayer">
	//   21   45:invokespecial   #342 <Method void String(String)>
	//   22   48:areturn         
	}

	public final void a(float f1, float f2)
	{
		adb adb1 = o;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field adb o>
	//    2    4:astore_3        
		if(adb1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			adb1.a(f1, f2);
	//    5    9:aload_3         
	//    6   10:fload_1         
	//    7   11:fload_2         
	//    8   12:invokevirtual   #344 <Method void adb.a(float, float)>
	//    9   15:return          
	}

	public final void a(int i1)
	{
		StringBuilder stringbuilder = new StringBuilder(34);
	//    0    0:new             #271 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          34
	//    3    6:invokespecial   #276 <Method void StringBuilder(int)>
	//    4    9:astore_2        
		stringbuilder.append("AdMediaPlayerView seek ");
	//    5   10:aload_2         
	//    6   11:ldc2            #346 <String "AdMediaPlayerView seek ">
	//    7   14:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(i1);
	//    9   18:aload_2         
	//   10   19:iload_1         
	//   11   20:invokevirtual   #349 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		wx.a(stringbuilder.toString());
	//   13   24:aload_2         
	//   14   25:invokevirtual   #286 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #155 <Method void wx.a(String)>
		if(h())
	//*  16   31:aload_0         
	//*  17   32:invokespecial   #296 <Method boolean h()>
	//*  18   35:ifeq            52
		{
			h.seekTo(i1);
	//   19   38:aload_0         
	//   20   39:getfield        #137 <Field MediaPlayer h>
	//   21   42:iload_1         
	//   22   43:invokevirtual   #352 <Method void MediaPlayer.seekTo(int)>
			q = 0;
	//   23   46:aload_0         
	//   24   47:iconst_0        
	//   25   48:putfield        #354 <Field int q>
			return;
	//   26   51:return          
		} else
		{
			q = i1;
	//   27   52:aload_0         
	//   28   53:iload_1         
	//   29   54:putfield        #354 <Field int q>
			return;
	//   30   57:return          
		}
	}

	public final void a(acl acl1)
	{
		r = acl1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field acl r>
	//    3    5:return          
	}

	public final void b()
	{
		wx.a("AdMediaPlayerView stop");
	//    0    0:ldc2            #357 <String "AdMediaPlayerView stop">
	//    1    3:invokestatic    #155 <Method void wx.a(String)>
		MediaPlayer mediaplayer = h;
	//    2    6:aload_0         
	//    3    7:getfield        #137 <Field MediaPlayer h>
	//    4   10:astore_1        
		if(mediaplayer != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          41
		{
			mediaplayer.stop();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #360 <Method void MediaPlayer.stop()>
			h.release();
	//    9   19:aload_0         
	//   10   20:getfield        #137 <Field MediaPlayer h>
	//   11   23:invokevirtual   #168 <Method void MediaPlayer.release()>
			h = null;
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:putfield        #137 <Field MediaPlayer h>
			g(0);
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:invokespecial   #171 <Method void g(int)>
			g = 0;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #113 <Field int g>
		}
		d.b();
	//   21   41:aload_0         
	//   22   42:getfield        #119 <Field adf d>
	//   23   45:invokevirtual   #361 <Method void adf.b()>
	//   24   48:return          
	}

	final void b(int i1)
	{
		acl acl1 = r;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field acl r>
	//    2    4:astore_2        
		if(acl1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			acl1.onWindowVisibilityChanged(i1);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #366 <Method void acl.onWindowVisibilityChanged(int)>
	//    8   16:return          
	}

	public final void c()
	{
		wx.a("AdMediaPlayerView play");
	//    0    0:ldc2            #368 <String "AdMediaPlayerView play">
	//    1    3:invokestatic    #155 <Method void wx.a(String)>
		if(h())
	//*   2    6:aload_0         
	//*   3    7:invokespecial   #296 <Method boolean h()>
	//*   4   10:ifeq            47
		{
			h.start();
	//    5   13:aload_0         
	//    6   14:getfield        #137 <Field MediaPlayer h>
	//    7   17:invokevirtual   #304 <Method void MediaPlayer.start()>
			g(3);
	//    8   20:aload_0         
	//    9   21:iconst_3        
	//   10   22:invokespecial   #171 <Method void g(int)>
			a.a();
	//   11   25:aload_0         
	//   12   26:getfield        #371 <Field acw a>
	//   13   29:invokevirtual   #375 <Method void acw.a()>
			xg.a.post(((Runnable) (new acj(this))));
	//   14   32:getstatic       #380 <Field Handler xg.a>
	//   15   35:new             #382 <Class acj>
	//   16   38:dup             
	//   17   39:aload_0         
	//   18   40:invokespecial   #385 <Method void acj(aca)>
	//   19   43:invokevirtual   #391 <Method boolean Handler.post(Runnable)>
	//   20   46:pop             
		}
		g = 3;
	//   21   47:aload_0         
	//   22   48:iconst_3        
	//   23   49:putfield        #113 <Field int g>
	//   24   52:return          
	}

	public final void d()
	{
		wx.a("AdMediaPlayerView pause");
	//    0    0:ldc2            #393 <String "AdMediaPlayerView pause">
	//    1    3:invokestatic    #155 <Method void wx.a(String)>
		if(h() && h.isPlaying())
	//*   2    6:aload_0         
	//*   3    7:invokespecial   #296 <Method boolean h()>
	//*   4   10:ifeq            50
	//*   5   13:aload_0         
	//*   6   14:getfield        #137 <Field MediaPlayer h>
	//*   7   17:invokevirtual   #396 <Method boolean MediaPlayer.isPlaying()>
	//*   8   20:ifeq            50
		{
			h.pause();
	//    9   23:aload_0         
	//   10   24:getfield        #137 <Field MediaPlayer h>
	//   11   27:invokevirtual   #317 <Method void MediaPlayer.pause()>
			g(4);
	//   12   30:aload_0         
	//   13   31:iconst_4        
	//   14   32:invokespecial   #171 <Method void g(int)>
			xg.a.post(((Runnable) (new ack(this))));
	//   15   35:getstatic       #380 <Field Handler xg.a>
	//   16   38:new             #398 <Class ack>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:invokespecial   #399 <Method void ack(aca)>
	//   20   46:invokevirtual   #391 <Method boolean Handler.post(Runnable)>
	//   21   49:pop             
		}
		g = 4;
	//   22   50:aload_0         
	//   23   51:iconst_4        
	//   24   52:putfield        #113 <Field int g>
	//   25   55:return          
	}

	public final void e()
	{
		a(b.a());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #324 <Field adh b>
	//    3    5:invokevirtual   #402 <Method float adh.a()>
	//    4    8:invokespecial   #303 <Method void a(float)>
	//    5   11:return          
	}

	public final int getCurrentPosition()
	{
		if(h())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #296 <Method boolean h()>
	//*   2    4:ifeq            15
			return h.getCurrentPosition();
	//    3    7:aload_0         
	//    4    8:getfield        #137 <Field MediaPlayer h>
	//    5   11:invokevirtual   #299 <Method int MediaPlayer.getCurrentPosition()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public final int getDuration()
	{
		if(h())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #296 <Method boolean h()>
	//*   2    4:ifeq            15
			return h.getDuration();
	//    3    7:aload_0         
	//    4    8:getfield        #137 <Field MediaPlayer h>
	//    5   11:invokevirtual   #405 <Method int MediaPlayer.getDuration()>
	//    6   14:ireturn         
		else
			return -1;
	//    7   15:iconst_m1       
	//    8   16:ireturn         
	}

	public final int getVideoHeight()
	{
		MediaPlayer mediaplayer = h;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field MediaPlayer h>
	//    2    4:astore_1        
		if(mediaplayer != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return mediaplayer.getVideoHeight();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #408 <Method int MediaPlayer.getVideoHeight()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public final int getVideoWidth()
	{
		MediaPlayer mediaplayer = h;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field MediaPlayer h>
	//    2    4:astore_1        
		if(mediaplayer != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return mediaplayer.getVideoWidth();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #411 <Method int MediaPlayer.getVideoWidth()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public final void onBufferingUpdate(MediaPlayer mediaplayer, int i1)
	{
		l = i1;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #218 <Field int l>
	//    3    5:return          
	}

	public final void onCompletion(MediaPlayer mediaplayer)
	{
		wx.a("AdMediaPlayerView completion");
	//    0    0:ldc2            #417 <String "AdMediaPlayerView completion">
	//    1    3:invokestatic    #155 <Method void wx.a(String)>
		g(5);
	//    2    6:aload_0         
	//    3    7:iconst_5        
	//    4    8:invokespecial   #171 <Method void g(int)>
		g = 5;
	//    5   11:aload_0         
	//    6   12:iconst_5        
	//    7   13:putfield        #113 <Field int g>
		xg.a.post(((Runnable) (new ace(this))));
	//    8   16:getstatic       #380 <Field Handler xg.a>
	//    9   19:new             #419 <Class ace>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #420 <Method void ace(aca)>
	//   13   27:invokevirtual   #391 <Method boolean Handler.post(Runnable)>
	//   14   30:pop             
	//   15   31:return          
	}

	public final boolean onError(MediaPlayer mediaplayer, int i1, int j1)
	{
		mediaplayer = ((MediaPlayer) ((String)c.get(((Object) (Integer.valueOf(i1))))));
	//    0    0:getstatic       #55  <Field Map c>
	//    1    3:iload_2         
	//    2    4:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//    3    7:invokeinterface #424 <Method Object Map.get(Object)>
	//    4   12:checkcast       #266 <Class String>
	//    5   15:astore_1        
		String s = (String)c.get(((Object) (Integer.valueOf(j1))));
	//    6   16:getstatic       #55  <Field Map c>
	//    7   19:iload_3         
	//    8   20:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//    9   23:invokeinterface #424 <Method Object Map.get(Object)>
	//   10   28:checkcast       #266 <Class String>
	//   11   31:astore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (mediaplayer))).length() + 38 + String.valueOf(((Object) (s))).length());
	//   12   33:new             #271 <Class StringBuilder>
	//   13   36:dup             
	//   14   37:aload_1         
	//   15   38:invokestatic    #269 <Method String String.valueOf(Object)>
	//   16   41:invokevirtual   #274 <Method int String.length()>
	//   17   44:bipush          38
	//   18   46:iadd            
	//   19   47:aload           4
	//   20   49:invokestatic    #269 <Method String String.valueOf(Object)>
	//   21   52:invokevirtual   #274 <Method int String.length()>
	//   22   55:iadd            
	//   23   56:invokespecial   #276 <Method void StringBuilder(int)>
	//   24   59:astore          5
		stringbuilder.append("AdMediaPlayerView MediaPlayer error: ");
	//   25   61:aload           5
	//   26   63:ldc2            #426 <String "AdMediaPlayerView MediaPlayer error: ">
	//   27   66:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   28   69:pop             
		stringbuilder.append(((String) (mediaplayer)));
	//   29   70:aload           5
	//   30   72:aload_1         
	//   31   73:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   32   76:pop             
		stringbuilder.append(":");
	//   33   77:aload           5
	//   34   79:ldc2            #428 <String ":">
	//   35   82:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   36   85:pop             
		stringbuilder.append(s);
	//   37   86:aload           5
	//   38   88:aload           4
	//   39   90:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   40   93:pop             
		com.google.android.gms.internal.ads.wx.e(stringbuilder.toString());
	//   41   94:aload           5
	//   42   96:invokevirtual   #286 <Method String StringBuilder.toString()>
	//   43   99:invokestatic    #150 <Method void com.google.android.gms.internal.ads.wx.e(String)>
		g(-1);
	//   44  102:aload_0         
	//   45  103:iconst_m1       
	//   46  104:invokespecial   #171 <Method void g(int)>
		g = -1;
	//   47  107:aload_0         
	//   48  108:iconst_m1       
	//   49  109:putfield        #113 <Field int g>
		xg.a.post(((Runnable) (new acf(this, ((String) (mediaplayer)), s))));
	//   50  112:getstatic       #380 <Field Handler xg.a>
	//   51  115:new             #430 <Class acf>
	//   52  118:dup             
	//   53  119:aload_0         
	//   54  120:aload_1         
	//   55  121:aload           4
	//   56  123:invokespecial   #433 <Method void acf(aca, String, String)>
	//   57  126:invokevirtual   #391 <Method boolean Handler.post(Runnable)>
	//   58  129:pop             
		return true;
	//   59  130:iconst_1        
	//   60  131:ireturn         
	}

	public final boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
	{
		mediaplayer = ((MediaPlayer) ((String)c.get(((Object) (Integer.valueOf(i1))))));
	//    0    0:getstatic       #55  <Field Map c>
	//    1    3:iload_2         
	//    2    4:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//    3    7:invokeinterface #424 <Method Object Map.get(Object)>
	//    4   12:checkcast       #266 <Class String>
	//    5   15:astore_1        
		String s = (String)c.get(((Object) (Integer.valueOf(j1))));
	//    6   16:getstatic       #55  <Field Map c>
	//    7   19:iload_3         
	//    8   20:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//    9   23:invokeinterface #424 <Method Object Map.get(Object)>
	//   10   28:checkcast       #266 <Class String>
	//   11   31:astore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (mediaplayer))).length() + 37 + String.valueOf(((Object) (s))).length());
	//   12   33:new             #271 <Class StringBuilder>
	//   13   36:dup             
	//   14   37:aload_1         
	//   15   38:invokestatic    #269 <Method String String.valueOf(Object)>
	//   16   41:invokevirtual   #274 <Method int String.length()>
	//   17   44:bipush          37
	//   18   46:iadd            
	//   19   47:aload           4
	//   20   49:invokestatic    #269 <Method String String.valueOf(Object)>
	//   21   52:invokevirtual   #274 <Method int String.length()>
	//   22   55:iadd            
	//   23   56:invokespecial   #276 <Method void StringBuilder(int)>
	//   24   59:astore          5
		stringbuilder.append("AdMediaPlayerView MediaPlayer info: ");
	//   25   61:aload           5
	//   26   63:ldc2            #436 <String "AdMediaPlayerView MediaPlayer info: ">
	//   27   66:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   28   69:pop             
		stringbuilder.append(((String) (mediaplayer)));
	//   29   70:aload           5
	//   30   72:aload_1         
	//   31   73:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   32   76:pop             
		stringbuilder.append(":");
	//   33   77:aload           5
	//   34   79:ldc2            #428 <String ":">
	//   35   82:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   36   85:pop             
		stringbuilder.append(s);
	//   37   86:aload           5
	//   38   88:aload           4
	//   39   90:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   40   93:pop             
		wx.a(stringbuilder.toString());
	//   41   94:aload           5
	//   42   96:invokevirtual   #286 <Method String StringBuilder.toString()>
	//   43   99:invokestatic    #155 <Method void wx.a(String)>
		return true;
	//   44  102:iconst_1        
	//   45  103:ireturn         
	}

	protected final void onMeasure(int i1, int j1)
	{
label0:
		{
			int k1;
			int j2;
label1:
			{
				int k2;
				int l2;
label2:
				{
					j2 = getDefaultSize(j, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #440 <Field int j>
	//    2    4:iload_1         
	//    3    5:invokestatic    #444 <Method int getDefaultSize(int, int)>
	//    4    8:istore          4
					k1 = getDefaultSize(k, j1);
	//    5   10:aload_0         
	//    6   11:getfield        #446 <Field int k>
	//    7   14:iload_2         
	//    8   15:invokestatic    #444 <Method int getDefaultSize(int, int)>
	//    9   18:istore_3        
					if(j <= 0 || k <= 0 || o != null)
						break label1;
	//   10   19:aload_0         
	//   11   20:getfield        #440 <Field int j>
	//   12   23:ifle            293
	//   13   26:aload_0         
	//   14   27:getfield        #446 <Field int k>
	//   15   30:ifle            293
	//   16   33:aload_0         
	//   17   34:getfield        #157 <Field adb o>
	//   18   37:ifnonnull       293
					k2 = android.view.View.MeasureSpec.getMode(i1);
	//   19   40:iload_1         
	//   20   41:invokestatic    #452 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   21   44:istore          5
					k1 = android.view.View.MeasureSpec.getSize(i1);
	//   22   46:iload_1         
	//   23   47:invokestatic    #455 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   24   50:istore_3        
					l2 = android.view.View.MeasureSpec.getMode(j1);
	//   25   51:iload_2         
	//   26   52:invokestatic    #452 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   27   55:istore          6
					i1 = android.view.View.MeasureSpec.getSize(j1);
	//   28   57:iload_2         
	//   29   58:invokestatic    #455 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   30   61:istore_1        
					if(k2 == 0x40000000 && l2 == 0x40000000)
	//*  31   62:iload           5
	//*  32   64:ldc2            #456 <Int 0x40000000>
	//*  33   67:icmpne          138
	//*  34   70:iload           6
	//*  35   72:ldc2            #456 <Int 0x40000000>
	//*  36   75:icmpne          138
					{
						j2 = j;
	//   37   78:aload_0         
	//   38   79:getfield        #440 <Field int j>
	//   39   82:istore          4
						k2 = k;
	//   40   84:aload_0         
	//   41   85:getfield        #446 <Field int k>
	//   42   88:istore          5
						if(j2 * i1 < k1 * k2)
	//*  43   90:iload           4
	//*  44   92:iload_1         
	//*  45   93:imul            
	//*  46   94:iload_3         
	//*  47   95:iload           5
	//*  48   97:imul            
	//*  49   98:icmpge          112
						{
							j1 = (j2 * i1) / k2;
	//   50  101:iload           4
	//   51  103:iload_1         
	//   52  104:imul            
	//   53  105:iload           5
	//   54  107:idiv            
	//   55  108:istore_2        
						} else
	//*  56  109:goto            298
						{
							j1 = k1;
	//   57  112:iload_3         
	//   58  113:istore_2        
							if(j2 * i1 > k1 * k2)
	//*  59  114:iload           4
	//*  60  116:iload_1         
	//*  61  117:imul            
	//*  62  118:iload_3         
	//*  63  119:iload           5
	//*  64  121:imul            
	//*  65  122:icmple          219
							{
								i1 = (k2 * k1) / j2;
	//   66  125:iload           5
	//   67  127:iload_3         
	//   68  128:imul            
	//   69  129:iload           4
	//   70  131:idiv            
	//   71  132:istore_1        
								j1 = k1;
	//   72  133:iload_3         
	//   73  134:istore_2        
							}
						}
						break label0;
	//   74  135:goto            298
					}
					if(k2 == 0x40000000)
	//*  75  138:iload           5
	//*  76  140:ldc2            #456 <Int 0x40000000>
	//*  77  143:icmpne          181
					{
						j1 = (k * k1) / j;
	//   78  146:aload_0         
	//   79  147:getfield        #446 <Field int k>
	//   80  150:iload_3         
	//   81  151:imul            
	//   82  152:aload_0         
	//   83  153:getfield        #440 <Field int j>
	//   84  156:idiv            
	//   85  157:istore_2        
						if(l2 != 0x80000000 || j1 <= i1)
	//*  86  158:iload           6
	//*  87  160:ldc2            #457 <Int 0x80000000>
	//*  88  163:icmpne          174
	//*  89  166:iload_2         
	//*  90  167:iload_1         
	//*  91  168:icmple          174
	//*  92  171:goto            214
						{
							i1 = j1;
	//   93  174:iload_2         
	//   94  175:istore_1        
							j1 = k1;
	//   95  176:iload_3         
	//   96  177:istore_2        
							break label0;
	//   97  178:goto            298
						}
					} else
					{
						if(l2 != 0x40000000)
							break label2;
	//   98  181:iload           6
	//   99  183:ldc2            #456 <Int 0x40000000>
	//  100  186:icmpne          222
						j1 = (j * i1) / k;
	//  101  189:aload_0         
	//  102  190:getfield        #440 <Field int j>
	//  103  193:iload_1         
	//  104  194:imul            
	//  105  195:aload_0         
	//  106  196:getfield        #446 <Field int k>
	//  107  199:idiv            
	//  108  200:istore_2        
						if(k2 != 0x80000000 || j1 <= k1)
							break label0;
	//  109  201:iload           5
	//  110  203:ldc2            #457 <Int 0x80000000>
	//  111  206:icmpne          219
	//  112  209:iload_2         
	//  113  210:iload_3         
	//  114  211:icmple          219
					}
					j1 = k1;
	//  115  214:iload_3         
	//  116  215:istore_2        
					break label0;
	//  117  216:goto            219
				}
	//* 118  219:goto            298
				j1 = j;
	//  119  222:aload_0         
	//  120  223:getfield        #440 <Field int j>
	//  121  226:istore_2        
				j2 = k;
	//  122  227:aload_0         
	//  123  228:getfield        #446 <Field int k>
	//  124  231:istore          4
				if(l2 == 0x80000000 && j2 > i1)
	//* 125  233:iload           6
	//* 126  235:ldc2            #457 <Int 0x80000000>
	//* 127  238:icmpne          257
	//* 128  241:iload           4
	//* 129  243:iload_1         
	//* 130  244:icmple          257
					j1 = (j1 * i1) / j2;
	//  131  247:iload_2         
	//  132  248:iload_1         
	//  133  249:imul            
	//  134  250:iload           4
	//  135  252:idiv            
	//  136  253:istore_2        
				else
	//* 137  254:goto            260
					i1 = j2;
	//  138  257:iload           4
	//  139  259:istore_1        
				if(k2 == 0x80000000 && j1 > k1)
	//* 140  260:iload           5
	//* 141  262:ldc2            #457 <Int 0x80000000>
	//* 142  265:icmpne          290
	//* 143  268:iload_2         
	//* 144  269:iload_3         
	//* 145  270:icmple          290
				{
					i1 = (k * k1) / j;
	//  146  273:aload_0         
	//  147  274:getfield        #446 <Field int k>
	//  148  277:iload_3         
	//  149  278:imul            
	//  150  279:aload_0         
	//  151  280:getfield        #440 <Field int j>
	//  152  283:idiv            
	//  153  284:istore_1        
					j1 = k1;
	//  154  285:iload_3         
	//  155  286:istore_2        
				}
				break label0;
	//  156  287:goto            298
			}
	//* 157  290:goto            298
			j1 = j2;
	//  158  293:iload           4
	//  159  295:istore_2        
			i1 = k1;
	//  160  296:iload_3         
	//  161  297:istore_1        
		}
label3:
		{
label4:
			{
				setMeasuredDimension(j1, i1);
	//  162  298:aload_0         
	//  163  299:iload_2         
	//  164  300:iload_1         
	//  165  301:invokevirtual   #460 <Method void setMeasuredDimension(int, int)>
				adb adb1 = o;
	//  166  304:aload_0         
	//  167  305:getfield        #157 <Field adb o>
	//  168  308:astore          7
				if(adb1 != null)
	//* 169  310:aload           7
	//* 170  312:ifnull          322
					adb1.a(j1, i1);
	//  171  315:aload           7
	//  172  317:iload_2         
	//  173  318:iload_1         
	//  174  319:invokevirtual   #462 <Method void adb.a(int, int)>
				if(android.os.Build.VERSION.SDK_INT != 16)
					break label3;
	//  175  322:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//  176  325:bipush          16
	//  177  327:icmpne          372
				int l1 = m;
	//  178  330:aload_0         
	//  179  331:getfield        #464 <Field int m>
	//  180  334:istore_3        
				if(l1 <= 0 || l1 == j1)
	//* 181  335:iload_3         
	//* 182  336:ifle            344
	//* 183  339:iload_3         
	//* 184  340:iload_2         
	//* 185  341:icmpne          358
				{
					int i2 = n;
	//  186  344:aload_0         
	//  187  345:getfield        #466 <Field int n>
	//  188  348:istore_3        
					if(i2 <= 0 || i2 == i1)
						break label4;
	//  189  349:iload_3         
	//  190  350:ifle            362
	//  191  353:iload_3         
	//  192  354:iload_1         
	//  193  355:icmpeq          362
				}
				g();
	//  194  358:aload_0         
	//  195  359:invokespecial   #468 <Method void g()>
			}
			m = j1;
	//  196  362:aload_0         
	//  197  363:iload_2         
	//  198  364:putfield        #464 <Field int m>
			n = i1;
	//  199  367:aload_0         
	//  200  368:iload_1         
	//  201  369:putfield        #466 <Field int n>
		}
	//  202  372:return          
	}

	public final void onPrepared(MediaPlayer mediaplayer)
	{
		wx.a("AdMediaPlayerView prepared");
	//    0    0:ldc2            #471 <String "AdMediaPlayerView prepared">
	//    1    3:invokestatic    #155 <Method void wx.a(String)>
		g(2);
	//    2    6:aload_0         
	//    3    7:iconst_2        
	//    4    8:invokespecial   #171 <Method void g(int)>
		d.a();
	//    5   11:aload_0         
	//    6   12:getfield        #119 <Field adf d>
	//    7   15:invokevirtual   #472 <Method void adf.a()>
		xg.a.post(((Runnable) (new acc(this))));
	//    8   18:getstatic       #380 <Field Handler xg.a>
	//    9   21:new             #474 <Class acc>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:invokespecial   #475 <Method void acc(aca)>
	//   13   29:invokevirtual   #391 <Method boolean Handler.post(Runnable)>
	//   14   32:pop             
		j = mediaplayer.getVideoWidth();
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #411 <Method int MediaPlayer.getVideoWidth()>
	//   18   38:putfield        #440 <Field int j>
		k = mediaplayer.getVideoHeight();
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #408 <Method int MediaPlayer.getVideoHeight()>
	//   22   46:putfield        #446 <Field int k>
		int i1 = q;
	//   23   49:aload_0         
	//   24   50:getfield        #354 <Field int q>
	//   25   53:istore_2        
		if(i1 != 0)
	//*  26   54:iload_2         
	//*  27   55:ifeq            63
			((acm)this).a(i1);
	//   28   58:aload_0         
	//   29   59:iload_2         
	//   30   60:invokevirtual   #477 <Method void acm.a(int)>
		g();
	//   31   63:aload_0         
	//   32   64:invokespecial   #468 <Method void g()>
		i1 = j;
	//   33   67:aload_0         
	//   34   68:getfield        #440 <Field int j>
	//   35   71:istore_2        
		int j1 = k;
	//   36   72:aload_0         
	//   37   73:getfield        #446 <Field int k>
	//   38   76:istore_3        
		mediaplayer = ((MediaPlayer) (new StringBuilder(62)));
	//   39   77:new             #271 <Class StringBuilder>
	//   40   80:dup             
	//   41   81:bipush          62
	//   42   83:invokespecial   #276 <Method void StringBuilder(int)>
	//   43   86:astore_1        
		((StringBuilder) (mediaplayer)).append("AdMediaPlayerView stream dimensions: ");
	//   44   87:aload_1         
	//   45   88:ldc2            #479 <String "AdMediaPlayerView stream dimensions: ">
	//   46   91:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   47   94:pop             
		((StringBuilder) (mediaplayer)).append(i1);
	//   48   95:aload_1         
	//   49   96:iload_2         
	//   50   97:invokevirtual   #349 <Method StringBuilder StringBuilder.append(int)>
	//   51  100:pop             
		((StringBuilder) (mediaplayer)).append(" x ");
	//   52  101:aload_1         
	//   53  102:ldc2            #481 <String " x ">
	//   54  105:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   55  108:pop             
		((StringBuilder) (mediaplayer)).append(j1);
	//   56  109:aload_1         
	//   57  110:iload_3         
	//   58  111:invokevirtual   #349 <Method StringBuilder StringBuilder.append(int)>
	//   59  114:pop             
		wx.d(((StringBuilder) (mediaplayer)).toString());
	//   60  115:aload_1         
	//   61  116:invokevirtual   #286 <Method String StringBuilder.toString()>
	//   62  119:invokestatic    #483 <Method void wx.d(String)>
		if(g == 3)
	//*  63  122:aload_0         
	//*  64  123:getfield        #113 <Field int g>
	//*  65  126:iconst_3        
	//*  66  127:icmpne          134
			((acm)this).c();
	//   67  130:aload_0         
	//   68  131:invokevirtual   #484 <Method void acm.c()>
		((acm)this).e();
	//   69  134:aload_0         
	//   70  135:invokevirtual   #319 <Method void com.google.android.gms.internal.ads.acm.e()>
	//   71  138:return          
	}

	public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
	{
		wx.a("AdMediaPlayerView surface created");
	//    0    0:ldc2            #487 <String "AdMediaPlayerView surface created">
	//    1    3:invokestatic    #155 <Method void wx.a(String)>
		f();
	//    2    6:aload_0         
	//    3    7:invokespecial   #489 <Method void f()>
		xg.a.post(((Runnable) (new acg(this))));
	//    4   10:getstatic       #380 <Field Handler xg.a>
	//    5   13:new             #491 <Class acg>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:invokespecial   #492 <Method void acg(aca)>
	//    9   21:invokevirtual   #391 <Method boolean Handler.post(Runnable)>
	//   10   24:pop             
	//   11   25:return          
	}

	public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
	{
		wx.a("AdMediaPlayerView surface destroyed");
	//    0    0:ldc2            #496 <String "AdMediaPlayerView surface destroyed">
	//    1    3:invokestatic    #155 <Method void wx.a(String)>
		surfacetexture = ((SurfaceTexture) (h));
	//    2    6:aload_0         
	//    3    7:getfield        #137 <Field MediaPlayer h>
	//    4   10:astore_1        
		if(surfacetexture != null && q == 0)
	//*   5   11:aload_1         
	//*   6   12:ifnull          30
	//*   7   15:aload_0         
	//*   8   16:getfield        #354 <Field int q>
	//*   9   19:ifne            30
			q = ((MediaPlayer) (surfacetexture)).getCurrentPosition();
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #299 <Method int MediaPlayer.getCurrentPosition()>
	//   13   27:putfield        #354 <Field int q>
		surfacetexture = ((SurfaceTexture) (o));
	//   14   30:aload_0         
	//   15   31:getfield        #157 <Field adb o>
	//   16   34:astore_1        
		if(surfacetexture != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          43
			((adb) (surfacetexture)).b();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #162 <Method void adb.b()>
		xg.a.post(((Runnable) (new aci(this))));
	//   21   43:getstatic       #380 <Field Handler xg.a>
	//   22   46:new             #498 <Class aci>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:invokespecial   #499 <Method void aci(aca)>
	//   26   54:invokevirtual   #391 <Method boolean Handler.post(Runnable)>
	//   27   57:pop             
		a(true);
	//   28   58:aload_0         
	//   29   59:iconst_1        
	//   30   60:invokespecial   #185 <Method void a(boolean)>
		return true;
	//   31   63:iconst_1        
	//   32   64:ireturn         
	}

	public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
	{
		wx.a("AdMediaPlayerView surface changed");
	//    0    0:ldc2            #502 <String "AdMediaPlayerView surface changed">
	//    1    3:invokestatic    #155 <Method void wx.a(String)>
		int k1 = g;
	//    2    6:aload_0         
	//    3    7:getfield        #113 <Field int g>
	//    4   10:istore          4
		boolean flag = true;
	//    5   12:iconst_1        
	//    6   13:istore          5
		if(k1 == 3)
	//*   7   15:iload           4
	//*   8   17:iconst_3        
	//*   9   18:icmpne          27
			k1 = 1;
	//   10   21:iconst_1        
	//   11   22:istore          4
		else
	//*  12   24:goto            30
			k1 = 0;
	//   13   27:iconst_0        
	//   14   28:istore          4
		if(j != i1 || k != j1)
	//*  15   30:aload_0         
	//*  16   31:getfield        #440 <Field int j>
	//*  17   34:iload_2         
	//*  18   35:icmpne          49
	//*  19   38:aload_0         
	//*  20   39:getfield        #446 <Field int k>
	//*  21   42:iload_3         
	//*  22   43:icmpne          49
	//*  23   46:goto            52
			flag = false;
	//   24   49:iconst_0        
	//   25   50:istore          5
		if(h != null && k1 && flag)
	//*  26   52:aload_0         
	//*  27   53:getfield        #137 <Field MediaPlayer h>
	//*  28   56:ifnull          90
	//*  29   59:iload           4
	//*  30   61:ifeq            90
	//*  31   64:iload           5
	//*  32   66:ifeq            90
		{
			int l1 = q;
	//   33   69:aload_0         
	//   34   70:getfield        #354 <Field int q>
	//   35   73:istore          4
			if(l1 != 0)
	//*  36   75:iload           4
	//*  37   77:ifeq            86
				((acm)this).a(l1);
	//   38   80:aload_0         
	//   39   81:iload           4
	//   40   83:invokevirtual   #477 <Method void acm.a(int)>
			((acm)this).c();
	//   41   86:aload_0         
	//   42   87:invokevirtual   #484 <Method void acm.c()>
		}
		surfacetexture = ((SurfaceTexture) (o));
	//   43   90:aload_0         
	//   44   91:getfield        #157 <Field adb o>
	//   45   94:astore_1        
		if(surfacetexture != null)
	//*  46   95:aload_1         
	//*  47   96:ifnull          105
			((adb) (surfacetexture)).a(i1, j1);
	//   48   99:aload_1         
	//   49  100:iload_2         
	//   50  101:iload_3         
	//   51  102:invokevirtual   #462 <Method void adb.a(int, int)>
		xg.a.post(((Runnable) (new ach(this, i1, j1))));
	//   52  105:getstatic       #380 <Field Handler xg.a>
	//   53  108:new             #504 <Class ach>
	//   54  111:dup             
	//   55  112:aload_0         
	//   56  113:iload_2         
	//   57  114:iload_3         
	//   58  115:invokespecial   #507 <Method void ach(aca, int, int)>
	//   59  118:invokevirtual   #391 <Method boolean Handler.post(Runnable)>
	//   60  121:pop             
	//   61  122:return          
	}

	public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
	{
		d.b(((acm) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field adf d>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #510 <Method void adf.b(acm)>
		a.a(surfacetexture, r);
	//    4    8:aload_0         
	//    5    9:getfield        #371 <Field acw a>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #132 <Field acl r>
	//    9   17:invokevirtual   #513 <Method void acw.a(SurfaceTexture, acl)>
	//   10   20:return          
	}

	public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i1, int j1)
	{
		StringBuilder stringbuilder = new StringBuilder(57);
	//    0    0:new             #271 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          57
	//    3    6:invokespecial   #276 <Method void StringBuilder(int)>
	//    4    9:astore          4
		stringbuilder.append("AdMediaPlayerView size changed: ");
	//    5   11:aload           4
	//    6   13:ldc2            #517 <String "AdMediaPlayerView size changed: ">
	//    7   16:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:pop             
		stringbuilder.append(i1);
	//    9   20:aload           4
	//   10   22:iload_2         
	//   11   23:invokevirtual   #349 <Method StringBuilder StringBuilder.append(int)>
	//   12   26:pop             
		stringbuilder.append(" x ");
	//   13   27:aload           4
	//   14   29:ldc2            #481 <String " x ">
	//   15   32:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
		stringbuilder.append(j1);
	//   17   36:aload           4
	//   18   38:iload_3         
	//   19   39:invokevirtual   #349 <Method StringBuilder StringBuilder.append(int)>
	//   20   42:pop             
		wx.a(stringbuilder.toString());
	//   21   43:aload           4
	//   22   45:invokevirtual   #286 <Method String StringBuilder.toString()>
	//   23   48:invokestatic    #155 <Method void wx.a(String)>
		j = mediaplayer.getVideoWidth();
	//   24   51:aload_0         
	//   25   52:aload_1         
	//   26   53:invokevirtual   #411 <Method int MediaPlayer.getVideoWidth()>
	//   27   56:putfield        #440 <Field int j>
		k = mediaplayer.getVideoHeight();
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:invokevirtual   #408 <Method int MediaPlayer.getVideoHeight()>
	//   31   64:putfield        #446 <Field int k>
		if(j != 0 && k != 0)
	//*  32   67:aload_0         
	//*  33   68:getfield        #440 <Field int j>
	//*  34   71:ifeq            85
	//*  35   74:aload_0         
	//*  36   75:getfield        #446 <Field int k>
	//*  37   78:ifeq            85
			requestLayout();
	//   38   81:aload_0         
	//   39   82:invokevirtual   #520 <Method void requestLayout()>
	//   40   85:return          
	}

	protected final void onWindowVisibilityChanged(int i1)
	{
		StringBuilder stringbuilder = new StringBuilder(58);
	//    0    0:new             #271 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          58
	//    3    6:invokespecial   #276 <Method void StringBuilder(int)>
	//    4    9:astore_2        
		stringbuilder.append("AdMediaPlayerView window visibility changed to ");
	//    5   10:aload_2         
	//    6   11:ldc2            #522 <String "AdMediaPlayerView window visibility changed to ">
	//    7   14:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(i1);
	//    9   18:aload_2         
	//   10   19:iload_1         
	//   11   20:invokevirtual   #349 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		wx.a(stringbuilder.toString());
	//   13   24:aload_2         
	//   14   25:invokevirtual   #286 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #155 <Method void wx.a(String)>
		xg.a.post(((Runnable) (new acb(this, i1))));
	//   16   31:getstatic       #380 <Field Handler xg.a>
	//   17   34:new             #524 <Class acb>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:invokespecial   #527 <Method void acb(aca, int)>
	//   22   43:invokevirtual   #391 <Method boolean Handler.post(Runnable)>
	//   23   46:pop             
		super.onWindowVisibilityChanged(i1);
	//   24   47:aload_0         
	//   25   48:iload_1         
	//   26   49:invokespecial   #528 <Method void acm.onWindowVisibilityChanged(int)>
	//   27   52:return          
	}

	public final void setVideoPath(String s)
	{
		s = ((String) (Uri.parse(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #535 <Method Uri Uri.parse(String)>
	//    2    4:astore_1        
		zzty zzty1 = zzty.a(((Uri) (s)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #540 <Method zzty zzty.a(Uri)>
	//    5    9:astore_2        
		if(zzty1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       17
	//*   8   14:goto            25
			s = ((String) (Uri.parse(zzty1.a)));
	//    9   17:aload_2         
	//   10   18:getfield        #543 <Field String zzty.a>
	//   11   21:invokestatic    #535 <Method Uri Uri.parse(String)>
	//   12   24:astore_1        
		i = ((Uri) (s));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #183 <Field Uri i>
		q = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #354 <Field int q>
		f();
	//   19   35:aload_0         
	//   20   36:invokespecial   #489 <Method void f()>
		requestLayout();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #520 <Method void requestLayout()>
		invalidate();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #546 <Method void invalidate()>
	//   25   47:return          
	}

	public final String toString()
	{
		String s = ((Object)this).getClass().getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #552 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #557 <Method String Class.getName()>
	//    3    7:astore_1        
		String s1 = Integer.toHexString(((Object)this).hashCode());
	//    4    8:aload_0         
	//    5    9:invokevirtual   #560 <Method int Object.hashCode()>
	//    6   12:invokestatic    #564 <Method String Integer.toHexString(int)>
	//    7   15:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 1 + String.valueOf(((Object) (s1))).length());
	//    8   16:new             #271 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokestatic    #269 <Method String String.valueOf(Object)>
	//   12   24:invokevirtual   #274 <Method int String.length()>
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:aload_2         
	//   16   30:invokestatic    #269 <Method String String.valueOf(Object)>
	//   17   33:invokevirtual   #274 <Method int String.length()>
	//   18   36:iadd            
	//   19   37:invokespecial   #276 <Method void StringBuilder(int)>
	//   20   40:astore_3        
		stringbuilder.append(s);
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
		stringbuilder.append("@");
	//   25   47:aload_3         
	//   26   48:ldc2            #566 <String "@">
	//   27   51:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
		stringbuilder.append(s1);
	//   29   55:aload_3         
	//   30   56:aload_2         
	//   31   57:invokevirtual   #282 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
		return stringbuilder.toString();
	//   33   61:aload_3         
	//   34   62:invokevirtual   #286 <Method String StringBuilder.toString()>
	//   35   65:areturn         
	}

	private static final Map c;
	private final adf d;
	private final boolean e;
	private int f;
	private int g;
	private MediaPlayer h;
	private Uri i;
	private int j;
	private int k;
	private int l;
	private int m;
	private int n;
	private adb o;
	private boolean p;
	private int q;
	private acl r;

	static 
	{
		c = ((Map) (new HashMap()));
	//    0    0:new             #50  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void HashMap()>
	//    3    7:putstatic       #55  <Field Map c>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   4   10:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   13:bipush          17
	//*   6   15:icmplt          100
		{
			c.put(((Object) (Integer.valueOf(-1004))), "MEDIA_ERROR_IO");
	//    7   18:getstatic       #55  <Field Map c>
	//    8   21:sipush          -1004
	//    9   24:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   10   27:ldc1            #68  <String "MEDIA_ERROR_IO">
	//   11   29:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   12   34:pop             
			c.put(((Object) (Integer.valueOf(-1007))), "MEDIA_ERROR_MALFORMED");
	//   13   35:getstatic       #55  <Field Map c>
	//   14   38:sipush          -1007
	//   15   41:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   16   44:ldc1            #76  <String "MEDIA_ERROR_MALFORMED">
	//   17   46:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   18   51:pop             
			c.put(((Object) (Integer.valueOf(-1010))), "MEDIA_ERROR_UNSUPPORTED");
	//   19   52:getstatic       #55  <Field Map c>
	//   20   55:sipush          -1010
	//   21   58:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   22   61:ldc1            #78  <String "MEDIA_ERROR_UNSUPPORTED">
	//   23   63:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   24   68:pop             
			c.put(((Object) (Integer.valueOf(-110))), "MEDIA_ERROR_TIMED_OUT");
	//   25   69:getstatic       #55  <Field Map c>
	//   26   72:bipush          -110
	//   27   74:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   28   77:ldc1            #80  <String "MEDIA_ERROR_TIMED_OUT">
	//   29   79:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   30   84:pop             
			c.put(((Object) (Integer.valueOf(3))), "MEDIA_INFO_VIDEO_RENDERING_START");
	//   31   85:getstatic       #55  <Field Map c>
	//   32   88:iconst_3        
	//   33   89:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   34   92:ldc1            #82  <String "MEDIA_INFO_VIDEO_RENDERING_START">
	//   35   94:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   36   99:pop             
		}
		c.put(((Object) (Integer.valueOf(100))), "MEDIA_ERROR_SERVER_DIED");
	//   37  100:getstatic       #55  <Field Map c>
	//   38  103:bipush          100
	//   39  105:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   40  108:ldc1            #84  <String "MEDIA_ERROR_SERVER_DIED">
	//   41  110:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   42  115:pop             
		c.put(((Object) (Integer.valueOf(1))), "MEDIA_ERROR_UNKNOWN");
	//   43  116:getstatic       #55  <Field Map c>
	//   44  119:iconst_1        
	//   45  120:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   46  123:ldc1            #86  <String "MEDIA_ERROR_UNKNOWN">
	//   47  125:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   48  130:pop             
		c.put(((Object) (Integer.valueOf(1))), "MEDIA_INFO_UNKNOWN");
	//   49  131:getstatic       #55  <Field Map c>
	//   50  134:iconst_1        
	//   51  135:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   52  138:ldc1            #88  <String "MEDIA_INFO_UNKNOWN">
	//   53  140:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   54  145:pop             
		c.put(((Object) (Integer.valueOf(700))), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
	//   55  146:getstatic       #55  <Field Map c>
	//   56  149:sipush          700
	//   57  152:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   58  155:ldc1            #90  <String "MEDIA_INFO_VIDEO_TRACK_LAGGING">
	//   59  157:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   60  162:pop             
		c.put(((Object) (Integer.valueOf(701))), "MEDIA_INFO_BUFFERING_START");
	//   61  163:getstatic       #55  <Field Map c>
	//   62  166:sipush          701
	//   63  169:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   64  172:ldc1            #92  <String "MEDIA_INFO_BUFFERING_START">
	//   65  174:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   66  179:pop             
		c.put(((Object) (Integer.valueOf(702))), "MEDIA_INFO_BUFFERING_END");
	//   67  180:getstatic       #55  <Field Map c>
	//   68  183:sipush          702
	//   69  186:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   70  189:ldc1            #94  <String "MEDIA_INFO_BUFFERING_END">
	//   71  191:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   72  196:pop             
		c.put(((Object) (Integer.valueOf(800))), "MEDIA_INFO_BAD_INTERLEAVING");
	//   73  197:getstatic       #55  <Field Map c>
	//   74  200:sipush          800
	//   75  203:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   76  206:ldc1            #96  <String "MEDIA_INFO_BAD_INTERLEAVING">
	//   77  208:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   78  213:pop             
		c.put(((Object) (Integer.valueOf(801))), "MEDIA_INFO_NOT_SEEKABLE");
	//   79  214:getstatic       #55  <Field Map c>
	//   80  217:sipush          801
	//   81  220:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   82  223:ldc1            #98  <String "MEDIA_INFO_NOT_SEEKABLE">
	//   83  225:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   84  230:pop             
		c.put(((Object) (Integer.valueOf(802))), "MEDIA_INFO_METADATA_UPDATE");
	//   85  231:getstatic       #55  <Field Map c>
	//   86  234:sipush          802
	//   87  237:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   88  240:ldc1            #100 <String "MEDIA_INFO_METADATA_UPDATE">
	//   89  242:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   90  247:pop             
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  91  248:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*  92  251:bipush          19
	//*  93  253:icmplt          290
		{
			c.put(((Object) (Integer.valueOf(901))), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
	//   94  256:getstatic       #55  <Field Map c>
	//   95  259:sipush          901
	//   96  262:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   97  265:ldc1            #102 <String "MEDIA_INFO_UNSUPPORTED_SUBTITLE">
	//   98  267:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   99  272:pop             
			c.put(((Object) (Integer.valueOf(902))), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
	//  100  273:getstatic       #55  <Field Map c>
	//  101  276:sipush          902
	//  102  279:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//  103  282:ldc1            #104 <String "MEDIA_INFO_SUBTITLE_TIMED_OUT">
	//  104  284:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//  105  289:pop             
		}
	//* 106  290:return          
	}
}
