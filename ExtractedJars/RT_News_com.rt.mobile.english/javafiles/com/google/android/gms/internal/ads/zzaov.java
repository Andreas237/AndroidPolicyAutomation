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
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzapg, zzapx, zzakb, zzapz, 
//			zzapu, zzakk, zzaoy, zzaoz, 
//			zzaox, zzapa, zzapc, zzapb, 
//			zzapp, zzaow, zzape, zzapd, 
//			zzhl, zzapf, zzapv

public final class zzaov extends zzapg
	implements android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.TextureView.SurfaceTextureListener
{

	public zzaov(Context context, boolean flag, boolean flag1, zzapv zzapv, zzapx zzapx1)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #110 <Method void zzapg(Context)>
		zzcwr = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #112 <Field int zzcwr>
		zzcws = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #114 <Field int zzcws>
		setSurfaceTextureListener(((android.view.TextureView.SurfaceTextureListener) (this)));
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #118 <Method void setSurfaceTextureListener(android.view.TextureView$SurfaceTextureListener)>
		zzcwp = zzapx1;
	//   12   20:aload_0         
	//   13   21:aload           5
	//   14   23:putfield        #120 <Field zzapx zzcwp>
		zzcxb = flag;
	//   15   26:aload_0         
	//   16   27:iload_2         
	//   17   28:putfield        #122 <Field boolean zzcxb>
		zzcwq = flag1;
	//   18   31:aload_0         
	//   19   32:iload_3         
	//   20   33:putfield        #124 <Field boolean zzcwq>
		zzcwp.zzb(((zzapg) (this)));
	//   21   36:aload_0         
	//   22   37:getfield        #120 <Field zzapx zzcwp>
	//   23   40:aload_0         
	//   24   41:invokevirtual   #130 <Method void zzapx.zzb(zzapg)>
	//   25   44:return          
	}

	static zzapf zza(zzaov zzaov1)
	{
		return zzaov1.zzcxd;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field zzapf zzcxd>
	//    2    4:areturn         
	}

	private final void zza(float f)
	{
		if(zzcwt != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field MediaPlayer zzcwt>
	//*   2    4:ifnull          17
		{
			try
			{
				zzcwt.setVolume(f, f);
	//    3    7:aload_0         
	//    4    8:getfield        #139 <Field MediaPlayer zzcwt>
	//    5   11:fload_1         
	//    6   12:fload_1         
	//    7   13:invokevirtual   #145 <Method void MediaPlayer.setVolume(float, float)>
				return;
	//    8   16:return          
			}
	//*   9   17:ldc1            #147 <String "AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().">
	//*  10   19:invokestatic    #153 <Method void zzakb.zzdk(String)>
	//*  11   22:return          
			catch(IllegalStateException illegalstateexception)
	//*  12   23:astore_2        
			{
				return;
	//   13   24:return          
			}
		} else
		{
			zzakb.zzdk("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
			return;
		}
	}

	private final void zzag(int i)
	{
		if(i == 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:icmpne          22
		{
			zzcwp.zztt();
	//    3    5:aload_0         
	//    4    6:getfield        #120 <Field zzapx zzcwp>
	//    5    9:invokevirtual   #158 <Method void zzapx.zztt()>
			zzcxl.zztt();
	//    6   12:aload_0         
	//    7   13:getfield        #162 <Field zzapz zzcxl>
	//    8   16:invokevirtual   #165 <Method void zzapz.zztt()>
		} else
	//*   9   19:goto            44
		if(zzcwr == 3)
	//*  10   22:aload_0         
	//*  11   23:getfield        #112 <Field int zzcwr>
	//*  12   26:iconst_3        
	//*  13   27:icmpne          44
		{
			zzcwp.zztu();
	//   14   30:aload_0         
	//   15   31:getfield        #120 <Field zzapx zzcwp>
	//   16   34:invokevirtual   #168 <Method void zzapx.zztu()>
			zzcxl.zztu();
	//   17   37:aload_0         
	//   18   38:getfield        #162 <Field zzapz zzcxl>
	//   19   41:invokevirtual   #169 <Method void zzapz.zztu()>
		}
		zzcwr = i;
	//   20   44:aload_0         
	//   21   45:iload_1         
	//   22   46:putfield        #112 <Field int zzcwr>
	//   23   49:return          
	}

	private final void zzag(boolean flag)
	{
		zzakb.v("AdMediaPlayerView release");
	//    0    0:ldc1            #172 <String "AdMediaPlayerView release">
	//    1    2:invokestatic    #175 <Method void zzakb.v(String)>
		if(zzcxa != null)
	//*   2    5:aload_0         
	//*   3    6:getfield        #177 <Field zzapu zzcxa>
	//*   4    9:ifnull          24
		{
			zzcxa.zzti();
	//    5   12:aload_0         
	//    6   13:getfield        #177 <Field zzapu zzcxa>
	//    7   16:invokevirtual   #182 <Method void zzapu.zzti()>
			zzcxa = null;
	//    8   19:aload_0         
	//    9   20:aconst_null     
	//   10   21:putfield        #177 <Field zzapu zzcxa>
		}
		if(zzcwt != null)
	//*  11   24:aload_0         
	//*  12   25:getfield        #139 <Field MediaPlayer zzcwt>
	//*  13   28:ifnull          69
		{
			zzcwt.reset();
	//   14   31:aload_0         
	//   15   32:getfield        #139 <Field MediaPlayer zzcwt>
	//   16   35:invokevirtual   #185 <Method void MediaPlayer.reset()>
			zzcwt.release();
	//   17   38:aload_0         
	//   18   39:getfield        #139 <Field MediaPlayer zzcwt>
	//   19   42:invokevirtual   #188 <Method void MediaPlayer.release()>
			zzcwt = null;
	//   20   45:aload_0         
	//   21   46:aconst_null     
	//   22   47:putfield        #139 <Field MediaPlayer zzcwt>
			zzag(0);
	//   23   50:aload_0         
	//   24   51:iconst_0        
	//   25   52:invokespecial   #190 <Method void zzag(int)>
			if(flag)
	//*  26   55:iload_1         
	//*  27   56:ifeq            69
			{
				zzcws = 0;
	//   28   59:aload_0         
	//   29   60:iconst_0        
	//   30   61:putfield        #114 <Field int zzcws>
				zzcws = 0;
	//   31   64:aload_0         
	//   32   65:iconst_0        
	//   33   66:putfield        #114 <Field int zzcws>
			}
		}
	//   34   69:return          
	}

	private final void zzsq()
	{
		SurfaceTexture surfacetexture;
		zzakb.v("AdMediaPlayerView init MediaPlayer");
	//    0    0:ldc1            #197 <String "AdMediaPlayerView init MediaPlayer">
	//    1    2:invokestatic    #175 <Method void zzakb.v(String)>
		surfacetexture = getSurfaceTexture();
	//    2    5:aload_0         
	//    3    6:invokevirtual   #201 <Method SurfaceTexture getSurfaceTexture()>
	//    4    9:astore_2        
		if(zzcwu == null)
			break MISSING_BLOCK_LABEL_296;
	//    5   10:aload_0         
	//    6   11:getfield        #203 <Field Uri zzcwu>
	//    7   14:ifnull          296
		if(surfacetexture == null)
	//*   8   17:aload_2         
	//*   9   18:ifnonnull       22
			return;
	//   10   21:return          
		zzag(false);
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:invokespecial   #205 <Method void zzag(boolean)>
		zzbv.zzfb();
	//   14   27:invokestatic    #211 <Method com.google.android.gms.ads.internal.overlay.zzu zzbv.zzfb()>
	//   15   30:pop             
		zzcwt = new MediaPlayer();
	//   16   31:aload_0         
	//   17   32:new             #141 <Class MediaPlayer>
	//   18   35:dup             
	//   19   36:invokespecial   #212 <Method void MediaPlayer()>
	//   20   39:putfield        #139 <Field MediaPlayer zzcwt>
		zzcwt.setOnBufferingUpdateListener(((android.media.MediaPlayer.OnBufferingUpdateListener) (this)));
	//   21   42:aload_0         
	//   22   43:getfield        #139 <Field MediaPlayer zzcwt>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #216 <Method void MediaPlayer.setOnBufferingUpdateListener(android.media.MediaPlayer$OnBufferingUpdateListener)>
		zzcwt.setOnCompletionListener(((android.media.MediaPlayer.OnCompletionListener) (this)));
	//   25   50:aload_0         
	//   26   51:getfield        #139 <Field MediaPlayer zzcwt>
	//   27   54:aload_0         
	//   28   55:invokevirtual   #220 <Method void MediaPlayer.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
		zzcwt.setOnErrorListener(((android.media.MediaPlayer.OnErrorListener) (this)));
	//   29   58:aload_0         
	//   30   59:getfield        #139 <Field MediaPlayer zzcwt>
	//   31   62:aload_0         
	//   32   63:invokevirtual   #224 <Method void MediaPlayer.setOnErrorListener(android.media.MediaPlayer$OnErrorListener)>
		zzcwt.setOnInfoListener(((android.media.MediaPlayer.OnInfoListener) (this)));
	//   33   66:aload_0         
	//   34   67:getfield        #139 <Field MediaPlayer zzcwt>
	//   35   70:aload_0         
	//   36   71:invokevirtual   #228 <Method void MediaPlayer.setOnInfoListener(android.media.MediaPlayer$OnInfoListener)>
		zzcwt.setOnPreparedListener(((android.media.MediaPlayer.OnPreparedListener) (this)));
	//   37   74:aload_0         
	//   38   75:getfield        #139 <Field MediaPlayer zzcwt>
	//   39   78:aload_0         
	//   40   79:invokevirtual   #232 <Method void MediaPlayer.setOnPreparedListener(android.media.MediaPlayer$OnPreparedListener)>
		zzcwt.setOnVideoSizeChangedListener(((android.media.MediaPlayer.OnVideoSizeChangedListener) (this)));
	//   41   82:aload_0         
	//   42   83:getfield        #139 <Field MediaPlayer zzcwt>
	//   43   86:aload_0         
	//   44   87:invokevirtual   #236 <Method void MediaPlayer.setOnVideoSizeChangedListener(android.media.MediaPlayer$OnVideoSizeChangedListener)>
		zzcwx = 0;
	//   45   90:aload_0         
	//   46   91:iconst_0        
	//   47   92:putfield        #238 <Field int zzcwx>
		Object obj = ((Object) (surfacetexture));
	//   48   95:aload_2         
	//   49   96:astore_1        
		if(!zzcxb)
			break MISSING_BLOCK_LABEL_171;
	//   50   97:aload_0         
	//   51   98:getfield        #122 <Field boolean zzcxb>
	//   52  101:ifeq            171
		zzcxa = new zzapu(getContext());
	//   53  104:aload_0         
	//   54  105:new             #179 <Class zzapu>
	//   55  108:dup             
	//   56  109:aload_0         
	//   57  110:invokevirtual   #242 <Method Context getContext()>
	//   58  113:invokespecial   #243 <Method void zzapu(Context)>
	//   59  116:putfield        #177 <Field zzapu zzcxa>
		zzcxa.zza(surfacetexture, getWidth(), getHeight());
	//   60  119:aload_0         
	//   61  120:getfield        #177 <Field zzapu zzcxa>
	//   62  123:aload_2         
	//   63  124:aload_0         
	//   64  125:invokevirtual   #247 <Method int getWidth()>
	//   65  128:aload_0         
	//   66  129:invokevirtual   #250 <Method int getHeight()>
	//   67  132:invokevirtual   #253 <Method void zzapu.zza(SurfaceTexture, int, int)>
		zzcxa.start();
	//   68  135:aload_0         
	//   69  136:getfield        #177 <Field zzapu zzcxa>
	//   70  139:invokevirtual   #256 <Method void zzapu.start()>
		obj = ((Object) (zzcxa.zztj()));
	//   71  142:aload_0         
	//   72  143:getfield        #177 <Field zzapu zzcxa>
	//   73  146:invokevirtual   #259 <Method SurfaceTexture zzapu.zztj()>
	//   74  149:astore_1        
		if(obj != null)
	//*  75  150:aload_1         
	//*  76  151:ifnull          157
			break MISSING_BLOCK_LABEL_171;
	//   77  154:goto            171
		zzcxa.zzti();
	//   78  157:aload_0         
	//   79  158:getfield        #177 <Field zzapu zzcxa>
	//   80  161:invokevirtual   #182 <Method void zzapu.zzti()>
		zzcxa = null;
	//   81  164:aload_0         
	//   82  165:aconst_null     
	//   83  166:putfield        #177 <Field zzapu zzcxa>
		obj = ((Object) (surfacetexture));
	//   84  169:aload_2         
	//   85  170:astore_1        
		try
		{
			zzcwt.setDataSource(getContext(), zzcwu);
	//   86  171:aload_0         
	//   87  172:getfield        #139 <Field MediaPlayer zzcwt>
	//   88  175:aload_0         
	//   89  176:invokevirtual   #242 <Method Context getContext()>
	//   90  179:aload_0         
	//   91  180:getfield        #203 <Field Uri zzcwu>
	//   92  183:invokevirtual   #263 <Method void MediaPlayer.setDataSource(Context, Uri)>
			zzbv.zzfc();
	//   93  186:invokestatic    #267 <Method com.google.android.gms.ads.internal.overlay.zzv zzbv.zzfc()>
	//   94  189:pop             
			obj = ((Object) (new Surface(((SurfaceTexture) (obj)))));
	//   95  190:new             #269 <Class Surface>
	//   96  193:dup             
	//   97  194:aload_1         
	//   98  195:invokespecial   #272 <Method void Surface(SurfaceTexture)>
	//   99  198:astore_1        
			zzcwt.setSurface(((Surface) (obj)));
	//  100  199:aload_0         
	//  101  200:getfield        #139 <Field MediaPlayer zzcwt>
	//  102  203:aload_1         
	//  103  204:invokevirtual   #276 <Method void MediaPlayer.setSurface(Surface)>
			zzcwt.setAudioStreamType(3);
	//  104  207:aload_0         
	//  105  208:getfield        #139 <Field MediaPlayer zzcwt>
	//  106  211:iconst_3        
	//  107  212:invokevirtual   #279 <Method void MediaPlayer.setAudioStreamType(int)>
			zzcwt.setScreenOnWhilePlaying(true);
	//  108  215:aload_0         
	//  109  216:getfield        #139 <Field MediaPlayer zzcwt>
	//  110  219:iconst_1        
	//  111  220:invokevirtual   #282 <Method void MediaPlayer.setScreenOnWhilePlaying(boolean)>
			zzcwt.prepareAsync();
	//  112  223:aload_0         
	//  113  224:getfield        #139 <Field MediaPlayer zzcwt>
	//  114  227:invokevirtual   #285 <Method void MediaPlayer.prepareAsync()>
			zzag(1);
	//  115  230:aload_0         
	//  116  231:iconst_1        
	//  117  232:invokespecial   #190 <Method void zzag(int)>
			return;
	//  118  235:return          
		}
		catch(Object obj1)
	//* 119  236:astore_1        
		{
			String s = String.valueOf(((Object) (zzcwu)));
	//  120  237:aload_0         
	//  121  238:getfield        #203 <Field Uri zzcwu>
	//  122  241:invokestatic    #290 <Method String String.valueOf(Object)>
	//  123  244:astore_2        
			StringBuilder stringbuilder = new StringBuilder(36 + String.valueOf(((Object) (s))).length());
	//  124  245:new             #292 <Class StringBuilder>
	//  125  248:dup             
	//  126  249:bipush          36
	//  127  251:aload_2         
	//  128  252:invokestatic    #290 <Method String String.valueOf(Object)>
	//  129  255:invokevirtual   #295 <Method int String.length()>
	//  130  258:iadd            
	//  131  259:invokespecial   #297 <Method void StringBuilder(int)>
	//  132  262:astore_3        
			stringbuilder.append("Failed to initialize MediaPlayer at ");
	//  133  263:aload_3         
	//  134  264:ldc2            #299 <String "Failed to initialize MediaPlayer at ">
	//  135  267:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//  136  270:pop             
			stringbuilder.append(s);
	//  137  271:aload_3         
	//  138  272:aload_2         
	//  139  273:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//  140  276:pop             
			zzakb.zzc(stringbuilder.toString(), ((Throwable) (obj1)));
	//  141  277:aload_3         
	//  142  278:invokevirtual   #307 <Method String StringBuilder.toString()>
	//  143  281:aload_1         
	//  144  282:invokestatic    #311 <Method void zzakb.zzc(String, Throwable)>
			onError(zzcwt, 1, 0);
	//  145  285:aload_0         
	//  146  286:aload_0         
	//  147  287:getfield        #139 <Field MediaPlayer zzcwt>
	//  148  290:iconst_1        
	//  149  291:iconst_0        
	//  150  292:invokevirtual   #315 <Method boolean onError(MediaPlayer, int, int)>
	//  151  295:pop             
		}
	//  152  296:return          
	}

	private final void zzsr()
	{
		if(!zzcwq)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field boolean zzcwq>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(zzss() && zzcwt.getCurrentPosition() > 0 && zzcws != 3)
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #320 <Method boolean zzss()>
	//*   6   12:ifeq            114
	//*   7   15:aload_0         
	//*   8   16:getfield        #139 <Field MediaPlayer zzcwt>
	//*   9   19:invokevirtual   #323 <Method int MediaPlayer.getCurrentPosition()>
	//*  10   22:ifle            114
	//*  11   25:aload_0         
	//*  12   26:getfield        #114 <Field int zzcws>
	//*  13   29:iconst_3        
	//*  14   30:icmpeq          114
		{
			zzakb.v("AdMediaPlayerView nudging MediaPlayer");
	//   15   33:ldc2            #325 <String "AdMediaPlayerView nudging MediaPlayer">
	//   16   36:invokestatic    #175 <Method void zzakb.v(String)>
			zza(0.0F);
	//   17   39:aload_0         
	//   18   40:fconst_0        
	//   19   41:invokespecial   #327 <Method void zza(float)>
			zzcwt.start();
	//   20   44:aload_0         
	//   21   45:getfield        #139 <Field MediaPlayer zzcwt>
	//   22   48:invokevirtual   #328 <Method void MediaPlayer.start()>
			int i = zzcwt.getCurrentPosition();
	//   23   51:aload_0         
	//   24   52:getfield        #139 <Field MediaPlayer zzcwt>
	//   25   55:invokevirtual   #323 <Method int MediaPlayer.getCurrentPosition()>
	//   26   58:istore_1        
			for(long l = zzbv.zzer().currentTimeMillis(); zzss() && zzcwt.getCurrentPosition() == i && zzbv.zzer().currentTimeMillis() - l <= 250L;);
	//   27   59:invokestatic    #332 <Method Clock zzbv.zzer()>
	//   28   62:invokeinterface #338 <Method long Clock.currentTimeMillis()>
	//   29   67:lstore_2        
	//   30   68:aload_0         
	//   31   69:invokespecial   #320 <Method boolean zzss()>
	//   32   72:ifeq            103
	//   33   75:aload_0         
	//   34   76:getfield        #139 <Field MediaPlayer zzcwt>
	//   35   79:invokevirtual   #323 <Method int MediaPlayer.getCurrentPosition()>
	//   36   82:iload_1         
	//   37   83:icmpne          103
	//   38   86:invokestatic    #332 <Method Clock zzbv.zzer()>
	//   39   89:invokeinterface #338 <Method long Clock.currentTimeMillis()>
	//   40   94:lload_2         
	//   41   95:lsub            
	//   42   96:ldc2w           #339 <Long 250L>
	//   43   99:lcmp            
	//   44  100:ifle            68
			zzcwt.pause();
	//   45  103:aload_0         
	//   46  104:getfield        #139 <Field MediaPlayer zzcwt>
	//   47  107:invokevirtual   #343 <Method void MediaPlayer.pause()>
			((zzapg)this).zzst();
	//   48  110:aload_0         
	//   49  111:invokevirtual   #346 <Method void zzapg.zzst()>
		}
	//   50  114:return          
	}

	private final boolean zzss()
	{
		return zzcwt != null && zzcwr != -1 && zzcwr != 0 && zzcwr != 1;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field MediaPlayer zzcwt>
	//    2    4:ifnull          32
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field int zzcwr>
	//    5   11:iconst_m1       
	//    6   12:icmpeq          32
	//    7   15:aload_0         
	//    8   16:getfield        #112 <Field int zzcwr>
	//    9   19:ifeq            32
	//   10   22:aload_0         
	//   11   23:getfield        #112 <Field int zzcwr>
	//   12   26:iconst_1        
	//   13   27:icmpeq          32
	//   14   30:iconst_1        
	//   15   31:ireturn         
	//   16   32:iconst_0        
	//   17   33:ireturn         
	}

	public final int getCurrentPosition()
	{
		if(zzss())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #320 <Method boolean zzss()>
	//*   2    4:ifeq            15
			return zzcwt.getCurrentPosition();
	//    3    7:aload_0         
	//    4    8:getfield        #139 <Field MediaPlayer zzcwt>
	//    5   11:invokevirtual   #323 <Method int MediaPlayer.getCurrentPosition()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public final int getDuration()
	{
		if(zzss())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #320 <Method boolean zzss()>
	//*   2    4:ifeq            15
			return zzcwt.getDuration();
	//    3    7:aload_0         
	//    4    8:getfield        #139 <Field MediaPlayer zzcwt>
	//    5   11:invokevirtual   #349 <Method int MediaPlayer.getDuration()>
	//    6   14:ireturn         
		else
			return -1;
	//    7   15:iconst_m1       
	//    8   16:ireturn         
	}

	public final int getVideoHeight()
	{
		if(zzcwt != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field MediaPlayer zzcwt>
	//*   2    4:ifnull          15
			return zzcwt.getVideoHeight();
	//    3    7:aload_0         
	//    4    8:getfield        #139 <Field MediaPlayer zzcwt>
	//    5   11:invokevirtual   #352 <Method int MediaPlayer.getVideoHeight()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public final int getVideoWidth()
	{
		if(zzcwt != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field MediaPlayer zzcwt>
	//*   2    4:ifnull          15
			return zzcwt.getVideoWidth();
	//    3    7:aload_0         
	//    4    8:getfield        #139 <Field MediaPlayer zzcwt>
	//    5   11:invokevirtual   #355 <Method int MediaPlayer.getVideoWidth()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public final void onBufferingUpdate(MediaPlayer mediaplayer, int i)
	{
		zzcwx = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #238 <Field int zzcwx>
	//    3    5:return          
	}

	public final void onCompletion(MediaPlayer mediaplayer)
	{
		zzakb.v("AdMediaPlayerView completion");
	//    0    0:ldc2            #361 <String "AdMediaPlayerView completion">
	//    1    3:invokestatic    #175 <Method void zzakb.v(String)>
		zzag(5);
	//    2    6:aload_0         
	//    3    7:iconst_5        
	//    4    8:invokespecial   #190 <Method void zzag(int)>
		zzcws = 5;
	//    5   11:aload_0         
	//    6   12:iconst_5        
	//    7   13:putfield        #114 <Field int zzcws>
		zzakk.zzcrm.post(((Runnable) (new zzaoy(this))));
	//    8   16:getstatic       #367 <Field Handler zzakk.zzcrm>
	//    9   19:new             #369 <Class zzaoy>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #372 <Method void zzaoy(zzaov)>
	//   13   27:invokevirtual   #378 <Method boolean Handler.post(Runnable)>
	//   14   30:pop             
	//   15   31:return          
	}

	public final boolean onError(MediaPlayer mediaplayer, int i, int j)
	{
		mediaplayer = ((MediaPlayer) ((String)zzcwo.get(((Object) (Integer.valueOf(i))))));
	//    0    0:getstatic       #56  <Field Map zzcwo>
	//    1    3:iload_2         
	//    2    4:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//    3    7:invokeinterface #382 <Method Object Map.get(Object)>
	//    4   12:checkcast       #287 <Class String>
	//    5   15:astore_1        
		String s = (String)zzcwo.get(((Object) (Integer.valueOf(j))));
	//    6   16:getstatic       #56  <Field Map zzcwo>
	//    7   19:iload_3         
	//    8   20:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//    9   23:invokeinterface #382 <Method Object Map.get(Object)>
	//   10   28:checkcast       #287 <Class String>
	//   11   31:astore          4
		StringBuilder stringbuilder = new StringBuilder(38 + String.valueOf(((Object) (mediaplayer))).length() + String.valueOf(((Object) (s))).length());
	//   12   33:new             #292 <Class StringBuilder>
	//   13   36:dup             
	//   14   37:bipush          38
	//   15   39:aload_1         
	//   16   40:invokestatic    #290 <Method String String.valueOf(Object)>
	//   17   43:invokevirtual   #295 <Method int String.length()>
	//   18   46:iadd            
	//   19   47:aload           4
	//   20   49:invokestatic    #290 <Method String String.valueOf(Object)>
	//   21   52:invokevirtual   #295 <Method int String.length()>
	//   22   55:iadd            
	//   23   56:invokespecial   #297 <Method void StringBuilder(int)>
	//   24   59:astore          5
		stringbuilder.append("AdMediaPlayerView MediaPlayer error: ");
	//   25   61:aload           5
	//   26   63:ldc2            #384 <String "AdMediaPlayerView MediaPlayer error: ">
	//   27   66:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   28   69:pop             
		stringbuilder.append(((String) (mediaplayer)));
	//   29   70:aload           5
	//   30   72:aload_1         
	//   31   73:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   32   76:pop             
		stringbuilder.append(":");
	//   33   77:aload           5
	//   34   79:ldc2            #386 <String ":">
	//   35   82:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   36   85:pop             
		stringbuilder.append(s);
	//   37   86:aload           5
	//   38   88:aload           4
	//   39   90:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   40   93:pop             
		zzakb.zzdk(stringbuilder.toString());
	//   41   94:aload           5
	//   42   96:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   43   99:invokestatic    #153 <Method void zzakb.zzdk(String)>
		zzag(-1);
	//   44  102:aload_0         
	//   45  103:iconst_m1       
	//   46  104:invokespecial   #190 <Method void zzag(int)>
		zzcws = -1;
	//   47  107:aload_0         
	//   48  108:iconst_m1       
	//   49  109:putfield        #114 <Field int zzcws>
		zzakk.zzcrm.post(((Runnable) (new zzaoz(this, ((String) (mediaplayer)), s))));
	//   50  112:getstatic       #367 <Field Handler zzakk.zzcrm>
	//   51  115:new             #388 <Class zzaoz>
	//   52  118:dup             
	//   53  119:aload_0         
	//   54  120:aload_1         
	//   55  121:aload           4
	//   56  123:invokespecial   #391 <Method void zzaoz(zzaov, String, String)>
	//   57  126:invokevirtual   #378 <Method boolean Handler.post(Runnable)>
	//   58  129:pop             
		return true;
	//   59  130:iconst_1        
	//   60  131:ireturn         
	}

	public final boolean onInfo(MediaPlayer mediaplayer, int i, int j)
	{
		mediaplayer = ((MediaPlayer) ((String)zzcwo.get(((Object) (Integer.valueOf(i))))));
	//    0    0:getstatic       #56  <Field Map zzcwo>
	//    1    3:iload_2         
	//    2    4:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//    3    7:invokeinterface #382 <Method Object Map.get(Object)>
	//    4   12:checkcast       #287 <Class String>
	//    5   15:astore_1        
		String s = (String)zzcwo.get(((Object) (Integer.valueOf(j))));
	//    6   16:getstatic       #56  <Field Map zzcwo>
	//    7   19:iload_3         
	//    8   20:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//    9   23:invokeinterface #382 <Method Object Map.get(Object)>
	//   10   28:checkcast       #287 <Class String>
	//   11   31:astore          4
		StringBuilder stringbuilder = new StringBuilder(37 + String.valueOf(((Object) (mediaplayer))).length() + String.valueOf(((Object) (s))).length());
	//   12   33:new             #292 <Class StringBuilder>
	//   13   36:dup             
	//   14   37:bipush          37
	//   15   39:aload_1         
	//   16   40:invokestatic    #290 <Method String String.valueOf(Object)>
	//   17   43:invokevirtual   #295 <Method int String.length()>
	//   18   46:iadd            
	//   19   47:aload           4
	//   20   49:invokestatic    #290 <Method String String.valueOf(Object)>
	//   21   52:invokevirtual   #295 <Method int String.length()>
	//   22   55:iadd            
	//   23   56:invokespecial   #297 <Method void StringBuilder(int)>
	//   24   59:astore          5
		stringbuilder.append("AdMediaPlayerView MediaPlayer info: ");
	//   25   61:aload           5
	//   26   63:ldc2            #394 <String "AdMediaPlayerView MediaPlayer info: ">
	//   27   66:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   28   69:pop             
		stringbuilder.append(((String) (mediaplayer)));
	//   29   70:aload           5
	//   30   72:aload_1         
	//   31   73:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   32   76:pop             
		stringbuilder.append(":");
	//   33   77:aload           5
	//   34   79:ldc2            #386 <String ":">
	//   35   82:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   36   85:pop             
		stringbuilder.append(s);
	//   37   86:aload           5
	//   38   88:aload           4
	//   39   90:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   40   93:pop             
		zzakb.v(stringbuilder.toString());
	//   41   94:aload           5
	//   42   96:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   43   99:invokestatic    #175 <Method void zzakb.v(String)>
		return true;
	//   44  102:iconst_1        
	//   45  103:ireturn         
	}

	protected final void onMeasure(int i, int j)
	{
		int k;
		int l;
		l = getDefaultSize(zzcwv, i);
	//    0    0:aload_0         
	//    1    1:getfield        #398 <Field int zzcwv>
	//    2    4:iload_1         
	//    3    5:invokestatic    #402 <Method int getDefaultSize(int, int)>
	//    4    8:istore          4
		k = getDefaultSize(zzcww, j);
	//    5   10:aload_0         
	//    6   11:getfield        #404 <Field int zzcww>
	//    7   14:iload_2         
	//    8   15:invokestatic    #402 <Method int getDefaultSize(int, int)>
	//    9   18:istore_3        
		if(zzcwv <= 0 || zzcww <= 0 || zzcxa != null) goto _L2; else goto _L1
	//   10   19:aload_0         
	//   11   20:getfield        #398 <Field int zzcwv>
	//   12   23:ifle            327
	//   13   26:aload_0         
	//   14   27:getfield        #404 <Field int zzcww>
	//   15   30:ifle            327
	//   16   33:aload_0         
	//   17   34:getfield        #177 <Field zzapu zzcxa>
	//   18   37:ifnonnull       327
_L1:
		int i1;
		int j1;
		int k1;
		j1 = android.view.View.MeasureSpec.getMode(i);
	//   19   40:iload_1         
	//   20   41:invokestatic    #410 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   21   44:istore          6
		i1 = android.view.View.MeasureSpec.getSize(i);
	//   22   46:iload_1         
	//   23   47:invokestatic    #413 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   24   50:istore          5
		k1 = android.view.View.MeasureSpec.getMode(j);
	//   25   52:iload_2         
	//   26   53:invokestatic    #410 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   27   56:istore          7
		k = android.view.View.MeasureSpec.getSize(j);
	//   28   58:iload_2         
	//   29   59:invokestatic    #413 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   30   62:istore_3        
		if(j1 != 0x40000000 || k1 != 0x40000000) goto _L4; else goto _L3
	//   31   63:iload           6
	//   32   65:ldc2            #414 <Int 0x40000000>
	//   33   68:icmpne          152
	//   34   71:iload           7
	//   35   73:ldc2            #414 <Int 0x40000000>
	//   36   76:icmpne          152
_L3:
		if(zzcwv * k >= zzcww * i1) goto _L6; else goto _L5
	//   37   79:aload_0         
	//   38   80:getfield        #398 <Field int zzcwv>
	//   39   83:iload_3         
	//   40   84:imul            
	//   41   85:aload_0         
	//   42   86:getfield        #404 <Field int zzcww>
	//   43   89:iload           5
	//   44   91:imul            
	//   45   92:icmpge          112
_L5:
		i = (zzcwv * k) / zzcww;
	//   46   95:aload_0         
	//   47   96:getfield        #398 <Field int zzcwv>
	//   48   99:iload_3         
	//   49  100:imul            
	//   50  101:aload_0         
	//   51  102:getfield        #404 <Field int zzcww>
	//   52  105:idiv            
	//   53  106:istore_1        
		j = k;
	//   54  107:iload_3         
	//   55  108:istore_2        
		  goto _L7
	//*  56  109:goto            332
_L6:
		i = i1;
	//   57  112:iload           5
	//   58  114:istore_1        
		j = k;
	//   59  115:iload_3         
	//   60  116:istore_2        
		if(zzcwv * k <= zzcww * i1) goto _L7; else goto _L8
	//   61  117:aload_0         
	//   62  118:getfield        #398 <Field int zzcwv>
	//   63  121:iload_3         
	//   64  122:imul            
	//   65  123:aload_0         
	//   66  124:getfield        #404 <Field int zzcww>
	//   67  127:iload           5
	//   68  129:imul            
	//   69  130:icmple          332
_L8:
		j = (zzcww * i1) / zzcwv;
	//   70  133:aload_0         
	//   71  134:getfield        #404 <Field int zzcww>
	//   72  137:iload           5
	//   73  139:imul            
	//   74  140:aload_0         
	//   75  141:getfield        #398 <Field int zzcwv>
	//   76  144:idiv            
	//   77  145:istore_2        
		i = i1;
	//   78  146:iload           5
	//   79  148:istore_1        
		break; /* Loop/switch isn't completed */
	//   80  149:goto            332
_L4:
		if(j1 == 0x40000000)
	//*  81  152:iload           6
	//*  82  154:ldc2            #414 <Int 0x40000000>
	//*  83  157:icmpne          200
		{
			j = (zzcww * i1) / zzcwv;
	//   84  160:aload_0         
	//   85  161:getfield        #404 <Field int zzcww>
	//   86  164:iload           5
	//   87  166:imul            
	//   88  167:aload_0         
	//   89  168:getfield        #398 <Field int zzcwv>
	//   90  171:idiv            
	//   91  172:istore_2        
			if(k1 == 0x80000000 && j > k)
	//*  92  173:iload           7
	//*  93  175:ldc2            #415 <Int 0x80000000>
	//*  94  178:icmpne          194
	//*  95  181:iload_2         
	//*  96  182:iload_3         
	//*  97  183:icmple          194
			{
				i = i1;
	//   98  186:iload           5
	//   99  188:istore_1        
				j = k;
	//  100  189:iload_3         
	//  101  190:istore_2        
			} else
	//* 102  191:goto            332
			{
				i = i1;
	//  103  194:iload           5
	//  104  196:istore_1        
			}
			break; /* Loop/switch isn't completed */
	//  105  197:goto            332
		}
		if(k1 == 0x40000000)
	//* 106  200:iload           7
	//* 107  202:ldc2            #414 <Int 0x40000000>
	//* 108  205:icmpne          257
		{
			l = (zzcwv * k) / zzcww;
	//  109  208:aload_0         
	//  110  209:getfield        #398 <Field int zzcwv>
	//  111  212:iload_3         
	//  112  213:imul            
	//  113  214:aload_0         
	//  114  215:getfield        #404 <Field int zzcww>
	//  115  218:idiv            
	//  116  219:istore          4
			i = l;
	//  117  221:iload           4
	//  118  223:istore_1        
			j = k;
	//  119  224:iload_3         
	//  120  225:istore_2        
			if(j1 == 0x80000000)
	//* 121  226:iload           6
	//* 122  228:ldc2            #415 <Int 0x80000000>
	//* 123  231:icmpne          254
			{
				i = l;
	//  124  234:iload           4
	//  125  236:istore_1        
				j = k;
	//  126  237:iload_3         
	//  127  238:istore_2        
				if(l > i1)
	//* 128  239:iload           4
	//* 129  241:iload           5
	//* 130  243:icmple          254
				{
					i = i1;
	//  131  246:iload           5
	//  132  248:istore_1        
					j = k;
	//  133  249:iload_3         
	//  134  250:istore_2        
				}
			}
			break; /* Loop/switch isn't completed */
	//  135  251:goto            332
		}
	//* 136  254:goto            332
		l = zzcwv;
	//  137  257:aload_0         
	//  138  258:getfield        #398 <Field int zzcwv>
	//  139  261:istore          4
		i = zzcww;
	//  140  263:aload_0         
	//  141  264:getfield        #404 <Field int zzcww>
	//  142  267:istore_1        
		if(k1 == 0x80000000 && i > k)
	//* 143  268:iload           7
	//* 144  270:ldc2            #415 <Int 0x80000000>
	//* 145  273:icmpne          297
	//* 146  276:iload_1         
	//* 147  277:iload_3         
	//* 148  278:icmple          297
			l = (zzcwv * k) / zzcww;
	//  149  281:aload_0         
	//  150  282:getfield        #398 <Field int zzcwv>
	//  151  285:iload_3         
	//  152  286:imul            
	//  153  287:aload_0         
	//  154  288:getfield        #404 <Field int zzcww>
	//  155  291:idiv            
	//  156  292:istore          4
		else
	//* 157  294:goto            299
			k = i;
	//  158  297:iload_1         
	//  159  298:istore_3        
		i = l;
	//  160  299:iload           4
	//  161  301:istore_1        
		j = k;
	//  162  302:iload_3         
	//  163  303:istore_2        
		if(j1 != 0x80000000)
			break; /* Loop/switch isn't completed */
	//  164  304:iload           6
	//  165  306:ldc2            #415 <Int 0x80000000>
	//  166  309:icmpne          254
		i = l;
	//  167  312:iload           4
	//  168  314:istore_1        
		j = k;
	//  169  315:iload_3         
	//  170  316:istore_2        
		if(l <= i1) goto _L7; else goto _L8
	//  171  317:iload           4
	//  172  319:iload           5
	//  173  321:icmple          254
	//* 174  324:goto            133
_L2:
		i = l;
	//  175  327:iload           4
	//  176  329:istore_1        
		j = k;
	//  177  330:iload_3         
	//  178  331:istore_2        
_L7:
		setMeasuredDimension(i, j);
	//  179  332:aload_0         
	//  180  333:iload_1         
	//  181  334:iload_2         
	//  182  335:invokevirtual   #418 <Method void setMeasuredDimension(int, int)>
		if(zzcxa != null)
	//* 183  338:aload_0         
	//* 184  339:getfield        #177 <Field zzapu zzcxa>
	//* 185  342:ifnull          354
			zzcxa.zzh(i, j);
	//  186  345:aload_0         
	//  187  346:getfield        #177 <Field zzapu zzcxa>
	//  188  349:iload_1         
	//  189  350:iload_2         
	//  190  351:invokevirtual   #421 <Method void zzapu.zzh(int, int)>
		if(android.os.Build.VERSION.SDK_INT == 16)
	//* 191  354:getstatic       #61  <Field int android.os.Build$VERSION.SDK_INT>
	//* 192  357:bipush          16
	//* 193  359:icmpne          406
		{
			if(zzcwy > 0 && zzcwy != i || zzcwz > 0 && zzcwz != j)
	//* 194  362:aload_0         
	//* 195  363:getfield        #423 <Field int zzcwy>
	//* 196  366:ifle            377
	//* 197  369:aload_0         
	//* 198  370:getfield        #423 <Field int zzcwy>
	//* 199  373:iload_1         
	//* 200  374:icmpne          392
	//* 201  377:aload_0         
	//* 202  378:getfield        #425 <Field int zzcwz>
	//* 203  381:ifle            396
	//* 204  384:aload_0         
	//* 205  385:getfield        #425 <Field int zzcwz>
	//* 206  388:iload_2         
	//* 207  389:icmpeq          396
				zzsr();
	//  208  392:aload_0         
	//  209  393:invokespecial   #427 <Method void zzsr()>
			zzcwy = i;
	//  210  396:aload_0         
	//  211  397:iload_1         
	//  212  398:putfield        #423 <Field int zzcwy>
			zzcwz = j;
	//  213  401:aload_0         
	//  214  402:iload_2         
	//  215  403:putfield        #425 <Field int zzcwz>
		}
		return;
	//  216  406:return          
	}

	public final void onPrepared(MediaPlayer mediaplayer)
	{
		zzakb.v("AdMediaPlayerView prepared");
	//    0    0:ldc2            #430 <String "AdMediaPlayerView prepared">
	//    1    3:invokestatic    #175 <Method void zzakb.v(String)>
		zzag(2);
	//    2    6:aload_0         
	//    3    7:iconst_2        
	//    4    8:invokespecial   #190 <Method void zzag(int)>
		zzcwp.zzsv();
	//    5   11:aload_0         
	//    6   12:getfield        #120 <Field zzapx zzcwp>
	//    7   15:invokevirtual   #433 <Method void zzapx.zzsv()>
		zzakk.zzcrm.post(((Runnable) (new zzaox(this))));
	//    8   18:getstatic       #367 <Field Handler zzakk.zzcrm>
	//    9   21:new             #435 <Class zzaox>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:invokespecial   #436 <Method void zzaox(zzaov)>
	//   13   29:invokevirtual   #378 <Method boolean Handler.post(Runnable)>
	//   14   32:pop             
		zzcwv = mediaplayer.getVideoWidth();
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #355 <Method int MediaPlayer.getVideoWidth()>
	//   18   38:putfield        #398 <Field int zzcwv>
		zzcww = mediaplayer.getVideoHeight();
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #352 <Method int MediaPlayer.getVideoHeight()>
	//   22   46:putfield        #404 <Field int zzcww>
		if(zzcxc != 0)
	//*  23   49:aload_0         
	//*  24   50:getfield        #438 <Field int zzcxc>
	//*  25   53:ifeq            64
			((zzapg)this).seekTo(zzcxc);
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:getfield        #438 <Field int zzcxc>
	//   29   61:invokevirtual   #441 <Method void zzapg.seekTo(int)>
		zzsr();
	//   30   64:aload_0         
	//   31   65:invokespecial   #427 <Method void zzsr()>
		int i = zzcwv;
	//   32   68:aload_0         
	//   33   69:getfield        #398 <Field int zzcwv>
	//   34   72:istore_2        
		int j = zzcww;
	//   35   73:aload_0         
	//   36   74:getfield        #404 <Field int zzcww>
	//   37   77:istore_3        
		mediaplayer = ((MediaPlayer) (new StringBuilder(62)));
	//   38   78:new             #292 <Class StringBuilder>
	//   39   81:dup             
	//   40   82:bipush          62
	//   41   84:invokespecial   #297 <Method void StringBuilder(int)>
	//   42   87:astore_1        
		((StringBuilder) (mediaplayer)).append("AdMediaPlayerView stream dimensions: ");
	//   43   88:aload_1         
	//   44   89:ldc2            #443 <String "AdMediaPlayerView stream dimensions: ">
	//   45   92:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   46   95:pop             
		((StringBuilder) (mediaplayer)).append(i);
	//   47   96:aload_1         
	//   48   97:iload_2         
	//   49   98:invokevirtual   #446 <Method StringBuilder StringBuilder.append(int)>
	//   50  101:pop             
		((StringBuilder) (mediaplayer)).append(" x ");
	//   51  102:aload_1         
	//   52  103:ldc2            #448 <String " x ">
	//   53  106:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   54  109:pop             
		((StringBuilder) (mediaplayer)).append(j);
	//   55  110:aload_1         
	//   56  111:iload_3         
	//   57  112:invokevirtual   #446 <Method StringBuilder StringBuilder.append(int)>
	//   58  115:pop             
		zzakb.zzdj(((StringBuilder) (mediaplayer)).toString());
	//   59  116:aload_1         
	//   60  117:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   61  120:invokestatic    #451 <Method void zzakb.zzdj(String)>
		if(zzcws == 3)
	//*  62  123:aload_0         
	//*  63  124:getfield        #114 <Field int zzcws>
	//*  64  127:iconst_3        
	//*  65  128:icmpne          135
			((zzapg)this).play();
	//   66  131:aload_0         
	//   67  132:invokevirtual   #454 <Method void zzapg.play()>
		((zzapg)this).zzst();
	//   68  135:aload_0         
	//   69  136:invokevirtual   #346 <Method void zzapg.zzst()>
	//   70  139:return          
	}

	public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
	{
		zzakb.v("AdMediaPlayerView surface created");
	//    0    0:ldc2            #457 <String "AdMediaPlayerView surface created">
	//    1    3:invokestatic    #175 <Method void zzakb.v(String)>
		zzsq();
	//    2    6:aload_0         
	//    3    7:invokespecial   #459 <Method void zzsq()>
		zzakk.zzcrm.post(((Runnable) (new zzapa(this))));
	//    4   10:getstatic       #367 <Field Handler zzakk.zzcrm>
	//    5   13:new             #461 <Class zzapa>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:invokespecial   #462 <Method void zzapa(zzaov)>
	//    9   21:invokevirtual   #378 <Method boolean Handler.post(Runnable)>
	//   10   24:pop             
	//   11   25:return          
	}

	public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
	{
		zzakb.v("AdMediaPlayerView surface destroyed");
	//    0    0:ldc2            #466 <String "AdMediaPlayerView surface destroyed">
	//    1    3:invokestatic    #175 <Method void zzakb.v(String)>
		if(zzcwt != null && zzcxc == 0)
	//*   2    6:aload_0         
	//*   3    7:getfield        #139 <Field MediaPlayer zzcwt>
	//*   4   10:ifnull          31
	//*   5   13:aload_0         
	//*   6   14:getfield        #438 <Field int zzcxc>
	//*   7   17:ifne            31
			zzcxc = zzcwt.getCurrentPosition();
	//    8   20:aload_0         
	//    9   21:aload_0         
	//   10   22:getfield        #139 <Field MediaPlayer zzcwt>
	//   11   25:invokevirtual   #323 <Method int MediaPlayer.getCurrentPosition()>
	//   12   28:putfield        #438 <Field int zzcxc>
		if(zzcxa != null)
	//*  13   31:aload_0         
	//*  14   32:getfield        #177 <Field zzapu zzcxa>
	//*  15   35:ifnull          45
			zzcxa.zzti();
	//   16   38:aload_0         
	//   17   39:getfield        #177 <Field zzapu zzcxa>
	//   18   42:invokevirtual   #182 <Method void zzapu.zzti()>
		zzakk.zzcrm.post(((Runnable) (new zzapc(this))));
	//   19   45:getstatic       #367 <Field Handler zzakk.zzcrm>
	//   20   48:new             #468 <Class zzapc>
	//   21   51:dup             
	//   22   52:aload_0         
	//   23   53:invokespecial   #469 <Method void zzapc(zzaov)>
	//   24   56:invokevirtual   #378 <Method boolean Handler.post(Runnable)>
	//   25   59:pop             
		zzag(true);
	//   26   60:aload_0         
	//   27   61:iconst_1        
	//   28   62:invokespecial   #205 <Method void zzag(boolean)>
		return true;
	//   29   65:iconst_1        
	//   30   66:ireturn         
	}

	public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
	{
		zzakb.v("AdMediaPlayerView surface changed");
	//    0    0:ldc2            #472 <String "AdMediaPlayerView surface changed">
	//    1    3:invokestatic    #175 <Method void zzakb.v(String)>
		int k = zzcws;
	//    2    6:aload_0         
	//    3    7:getfield        #114 <Field int zzcws>
	//    4   10:istore          4
		boolean flag1 = false;
	//    5   12:iconst_0        
	//    6   13:istore          6
		if(k == 3)
	//*   7   15:iload           4
	//*   8   17:iconst_3        
	//*   9   18:icmpne          27
			k = 1;
	//   10   21:iconst_1        
	//   11   22:istore          4
		else
	//*  12   24:goto            30
			k = 0;
	//   13   27:iconst_0        
	//   14   28:istore          4
		boolean flag = flag1;
	//   15   30:iload           6
	//   16   32:istore          5
		if(zzcwv == i)
	//*  17   34:aload_0         
	//*  18   35:getfield        #398 <Field int zzcwv>
	//*  19   38:iload_2         
	//*  20   39:icmpne          57
		{
			flag = flag1;
	//   21   42:iload           6
	//   22   44:istore          5
			if(zzcww == j)
	//*  23   46:aload_0         
	//*  24   47:getfield        #404 <Field int zzcww>
	//*  25   50:iload_3         
	//*  26   51:icmpne          57
				flag = true;
	//   27   54:iconst_1        
	//   28   55:istore          5
		}
		if(zzcwt != null && k && flag)
	//*  29   57:aload_0         
	//*  30   58:getfield        #139 <Field MediaPlayer zzcwt>
	//*  31   61:ifnull          93
	//*  32   64:iload           4
	//*  33   66:ifeq            93
	//*  34   69:iload           5
	//*  35   71:ifeq            93
		{
			if(zzcxc != 0)
	//*  36   74:aload_0         
	//*  37   75:getfield        #438 <Field int zzcxc>
	//*  38   78:ifeq            89
				((zzapg)this).seekTo(zzcxc);
	//   39   81:aload_0         
	//   40   82:aload_0         
	//   41   83:getfield        #438 <Field int zzcxc>
	//   42   86:invokevirtual   #441 <Method void zzapg.seekTo(int)>
			((zzapg)this).play();
	//   43   89:aload_0         
	//   44   90:invokevirtual   #454 <Method void zzapg.play()>
		}
		if(zzcxa != null)
	//*  45   93:aload_0         
	//*  46   94:getfield        #177 <Field zzapu zzcxa>
	//*  47   97:ifnull          109
			zzcxa.zzh(i, j);
	//   48  100:aload_0         
	//   49  101:getfield        #177 <Field zzapu zzcxa>
	//   50  104:iload_2         
	//   51  105:iload_3         
	//   52  106:invokevirtual   #421 <Method void zzapu.zzh(int, int)>
		zzakk.zzcrm.post(((Runnable) (new zzapb(this, i, j))));
	//   53  109:getstatic       #367 <Field Handler zzakk.zzcrm>
	//   54  112:new             #474 <Class zzapb>
	//   55  115:dup             
	//   56  116:aload_0         
	//   57  117:iload_2         
	//   58  118:iload_3         
	//   59  119:invokespecial   #477 <Method void zzapb(zzaov, int, int)>
	//   60  122:invokevirtual   #378 <Method boolean Handler.post(Runnable)>
	//   61  125:pop             
	//   62  126:return          
	}

	public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
	{
		zzcwp.zzc(((zzapg) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field zzapx zzcwp>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #480 <Method void zzapx.zzc(zzapg)>
		zzcxk.zza(surfacetexture, zzcxd);
	//    4    8:aload_0         
	//    5    9:getfield        #484 <Field zzapp zzcxk>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #134 <Field zzapf zzcxd>
	//    9   17:invokevirtual   #489 <Method void zzapp.zza(SurfaceTexture, zzapf)>
	//   10   20:return          
	}

	public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder(57);
	//    0    0:new             #292 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          57
	//    3    6:invokespecial   #297 <Method void StringBuilder(int)>
	//    4    9:astore          4
		stringbuilder.append("AdMediaPlayerView size changed: ");
	//    5   11:aload           4
	//    6   13:ldc2            #493 <String "AdMediaPlayerView size changed: ">
	//    7   16:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:pop             
		stringbuilder.append(i);
	//    9   20:aload           4
	//   10   22:iload_2         
	//   11   23:invokevirtual   #446 <Method StringBuilder StringBuilder.append(int)>
	//   12   26:pop             
		stringbuilder.append(" x ");
	//   13   27:aload           4
	//   14   29:ldc2            #448 <String " x ">
	//   15   32:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
		stringbuilder.append(j);
	//   17   36:aload           4
	//   18   38:iload_3         
	//   19   39:invokevirtual   #446 <Method StringBuilder StringBuilder.append(int)>
	//   20   42:pop             
		zzakb.v(stringbuilder.toString());
	//   21   43:aload           4
	//   22   45:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   23   48:invokestatic    #175 <Method void zzakb.v(String)>
		zzcwv = mediaplayer.getVideoWidth();
	//   24   51:aload_0         
	//   25   52:aload_1         
	//   26   53:invokevirtual   #355 <Method int MediaPlayer.getVideoWidth()>
	//   27   56:putfield        #398 <Field int zzcwv>
		zzcww = mediaplayer.getVideoHeight();
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:invokevirtual   #352 <Method int MediaPlayer.getVideoHeight()>
	//   31   64:putfield        #404 <Field int zzcww>
		if(zzcwv != 0 && zzcww != 0)
	//*  32   67:aload_0         
	//*  33   68:getfield        #398 <Field int zzcwv>
	//*  34   71:ifeq            85
	//*  35   74:aload_0         
	//*  36   75:getfield        #404 <Field int zzcww>
	//*  37   78:ifeq            85
			requestLayout();
	//   38   81:aload_0         
	//   39   82:invokevirtual   #496 <Method void requestLayout()>
	//   40   85:return          
	}

	protected final void onWindowVisibilityChanged(int i)
	{
		StringBuilder stringbuilder = new StringBuilder(58);
	//    0    0:new             #292 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          58
	//    3    6:invokespecial   #297 <Method void StringBuilder(int)>
	//    4    9:astore_2        
		stringbuilder.append("AdMediaPlayerView window visibility changed to ");
	//    5   10:aload_2         
	//    6   11:ldc2            #499 <String "AdMediaPlayerView window visibility changed to ">
	//    7   14:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(i);
	//    9   18:aload_2         
	//   10   19:iload_1         
	//   11   20:invokevirtual   #446 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		zzakb.v(stringbuilder.toString());
	//   13   24:aload_2         
	//   14   25:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #175 <Method void zzakb.v(String)>
		zzakk.zzcrm.post(((Runnable) (new zzaow(this, i))));
	//   16   31:getstatic       #367 <Field Handler zzakk.zzcrm>
	//   17   34:new             #501 <Class zzaow>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:iload_1         
	//   21   40:invokespecial   #504 <Method void zzaow(zzaov, int)>
	//   22   43:invokevirtual   #378 <Method boolean Handler.post(Runnable)>
	//   23   46:pop             
		super.onWindowVisibilityChanged(i);
	//   24   47:aload_0         
	//   25   48:iload_1         
	//   26   49:invokespecial   #506 <Method void zzapg.onWindowVisibilityChanged(int)>
	//   27   52:return          
	}

	public final void pause()
	{
		zzakb.v("AdMediaPlayerView pause");
	//    0    0:ldc2            #508 <String "AdMediaPlayerView pause">
	//    1    3:invokestatic    #175 <Method void zzakb.v(String)>
		if(zzss() && zzcwt.isPlaying())
	//*   2    6:aload_0         
	//*   3    7:invokespecial   #320 <Method boolean zzss()>
	//*   4   10:ifeq            50
	//*   5   13:aload_0         
	//*   6   14:getfield        #139 <Field MediaPlayer zzcwt>
	//*   7   17:invokevirtual   #511 <Method boolean MediaPlayer.isPlaying()>
	//*   8   20:ifeq            50
		{
			zzcwt.pause();
	//    9   23:aload_0         
	//   10   24:getfield        #139 <Field MediaPlayer zzcwt>
	//   11   27:invokevirtual   #343 <Method void MediaPlayer.pause()>
			zzag(4);
	//   12   30:aload_0         
	//   13   31:iconst_4        
	//   14   32:invokespecial   #190 <Method void zzag(int)>
			zzakk.zzcrm.post(((Runnable) (new zzape(this))));
	//   15   35:getstatic       #367 <Field Handler zzakk.zzcrm>
	//   16   38:new             #513 <Class zzape>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:invokespecial   #514 <Method void zzape(zzaov)>
	//   20   46:invokevirtual   #378 <Method boolean Handler.post(Runnable)>
	//   21   49:pop             
		}
		zzcws = 4;
	//   22   50:aload_0         
	//   23   51:iconst_4        
	//   24   52:putfield        #114 <Field int zzcws>
	//   25   55:return          
	}

	public final void play()
	{
		zzakb.v("AdMediaPlayerView play");
	//    0    0:ldc2            #516 <String "AdMediaPlayerView play">
	//    1    3:invokestatic    #175 <Method void zzakb.v(String)>
		if(zzss())
	//*   2    6:aload_0         
	//*   3    7:invokespecial   #320 <Method boolean zzss()>
	//*   4   10:ifeq            47
		{
			zzcwt.start();
	//    5   13:aload_0         
	//    6   14:getfield        #139 <Field MediaPlayer zzcwt>
	//    7   17:invokevirtual   #328 <Method void MediaPlayer.start()>
			zzag(3);
	//    8   20:aload_0         
	//    9   21:iconst_3        
	//   10   22:invokespecial   #190 <Method void zzag(int)>
			zzcxk.zzsw();
	//   11   25:aload_0         
	//   12   26:getfield        #484 <Field zzapp zzcxk>
	//   13   29:invokevirtual   #519 <Method void zzapp.zzsw()>
			zzakk.zzcrm.post(((Runnable) (new zzapd(this))));
	//   14   32:getstatic       #367 <Field Handler zzakk.zzcrm>
	//   15   35:new             #521 <Class zzapd>
	//   16   38:dup             
	//   17   39:aload_0         
	//   18   40:invokespecial   #522 <Method void zzapd(zzaov)>
	//   19   43:invokevirtual   #378 <Method boolean Handler.post(Runnable)>
	//   20   46:pop             
		}
		zzcws = 3;
	//   21   47:aload_0         
	//   22   48:iconst_3        
	//   23   49:putfield        #114 <Field int zzcws>
	//   24   52:return          
	}

	public final void seekTo(int i)
	{
		StringBuilder stringbuilder = new StringBuilder(34);
	//    0    0:new             #292 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          34
	//    3    6:invokespecial   #297 <Method void StringBuilder(int)>
	//    4    9:astore_2        
		stringbuilder.append("AdMediaPlayerView seek ");
	//    5   10:aload_2         
	//    6   11:ldc2            #524 <String "AdMediaPlayerView seek ">
	//    7   14:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(i);
	//    9   18:aload_2         
	//   10   19:iload_1         
	//   11   20:invokevirtual   #446 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		zzakb.v(stringbuilder.toString());
	//   13   24:aload_2         
	//   14   25:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #175 <Method void zzakb.v(String)>
		if(zzss())
	//*  16   31:aload_0         
	//*  17   32:invokespecial   #320 <Method boolean zzss()>
	//*  18   35:ifeq            52
		{
			zzcwt.seekTo(i);
	//   19   38:aload_0         
	//   20   39:getfield        #139 <Field MediaPlayer zzcwt>
	//   21   42:iload_1         
	//   22   43:invokevirtual   #525 <Method void MediaPlayer.seekTo(int)>
			zzcxc = 0;
	//   23   46:aload_0         
	//   24   47:iconst_0        
	//   25   48:putfield        #438 <Field int zzcxc>
			return;
	//   26   51:return          
		} else
		{
			zzcxc = i;
	//   27   52:aload_0         
	//   28   53:iload_1         
	//   29   54:putfield        #438 <Field int zzcxc>
			return;
	//   30   57:return          
		}
	}

	public final void setVideoPath(String s)
	{
		s = ((String) (Uri.parse(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #532 <Method Uri Uri.parse(String)>
	//    2    4:astore_1        
		zzhl zzhl1 = zzhl.zzd(((Uri) (s)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #538 <Method zzhl zzhl.zzd(Uri)>
	//    5    9:astore_2        
		if(zzhl1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       17
	//*   8   14:goto            25
			s = ((String) (Uri.parse(zzhl1.url)));
	//    9   17:aload_2         
	//   10   18:getfield        #542 <Field String zzhl.url>
	//   11   21:invokestatic    #532 <Method Uri Uri.parse(String)>
	//   12   24:astore_1        
		zzcwu = ((Uri) (s));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #203 <Field Uri zzcwu>
		zzcxc = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #438 <Field int zzcxc>
		zzsq();
	//   19   35:aload_0         
	//   20   36:invokespecial   #459 <Method void zzsq()>
		requestLayout();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #496 <Method void requestLayout()>
		invalidate();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #545 <Method void invalidate()>
	//   25   47:return          
	}

	public final void stop()
	{
		zzakb.v("AdMediaPlayerView stop");
	//    0    0:ldc2            #548 <String "AdMediaPlayerView stop">
	//    1    3:invokestatic    #175 <Method void zzakb.v(String)>
		if(zzcwt != null)
	//*   2    6:aload_0         
	//*   3    7:getfield        #139 <Field MediaPlayer zzcwt>
	//*   4   10:ifnull          42
		{
			zzcwt.stop();
	//    5   13:aload_0         
	//    6   14:getfield        #139 <Field MediaPlayer zzcwt>
	//    7   17:invokevirtual   #550 <Method void MediaPlayer.stop()>
			zzcwt.release();
	//    8   20:aload_0         
	//    9   21:getfield        #139 <Field MediaPlayer zzcwt>
	//   10   24:invokevirtual   #188 <Method void MediaPlayer.release()>
			zzcwt = null;
	//   11   27:aload_0         
	//   12   28:aconst_null     
	//   13   29:putfield        #139 <Field MediaPlayer zzcwt>
			zzag(0);
	//   14   32:aload_0         
	//   15   33:iconst_0        
	//   16   34:invokespecial   #190 <Method void zzag(int)>
			zzcws = 0;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #114 <Field int zzcws>
		}
		zzcwp.onStop();
	//   20   42:aload_0         
	//   21   43:getfield        #120 <Field zzapx zzcwp>
	//   22   46:invokevirtual   #553 <Method void zzapx.onStop()>
	//   23   49:return          
	}

	public final String toString()
	{
		String s = ((Object)this).getClass().getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #559 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #564 <Method String Class.getName()>
	//    3    7:astore_1        
		String s1 = Integer.toHexString(((Object)this).hashCode());
	//    4    8:aload_0         
	//    5    9:invokevirtual   #567 <Method int Object.hashCode()>
	//    6   12:invokestatic    #571 <Method String Integer.toHexString(int)>
	//    7   15:astore_2        
		StringBuilder stringbuilder = new StringBuilder(1 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length());
	//    8   16:new             #292 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:aload_1         
	//   12   22:invokestatic    #290 <Method String String.valueOf(Object)>
	//   13   25:invokevirtual   #295 <Method int String.length()>
	//   14   28:iadd            
	//   15   29:aload_2         
	//   16   30:invokestatic    #290 <Method String String.valueOf(Object)>
	//   17   33:invokevirtual   #295 <Method int String.length()>
	//   18   36:iadd            
	//   19   37:invokespecial   #297 <Method void StringBuilder(int)>
	//   20   40:astore_3        
		stringbuilder.append(s);
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
		stringbuilder.append("@");
	//   25   47:aload_3         
	//   26   48:ldc2            #573 <String "@">
	//   27   51:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
		stringbuilder.append(s1);
	//   29   55:aload_3         
	//   30   56:aload_2         
	//   31   57:invokevirtual   #303 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
		return stringbuilder.toString();
	//   33   61:aload_3         
	//   34   62:invokevirtual   #307 <Method String StringBuilder.toString()>
	//   35   65:areturn         
	}

	public final void zza(float f, float f1)
	{
		if(zzcxa != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #177 <Field zzapu zzcxa>
	//*   2    4:ifnull          16
			zzcxa.zzb(f, f1);
	//    3    7:aload_0         
	//    4    8:getfield        #177 <Field zzapu zzcxa>
	//    5   11:fload_1         
	//    6   12:fload_2         
	//    7   13:invokevirtual   #575 <Method void zzapu.zzb(float, float)>
	//    8   16:return          
	}

	public final void zza(zzapf zzapf1)
	{
		zzcxd = zzapf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field zzapf zzcxd>
	//    3    5:return          
	}

	final void zzah(int i)
	{
		if(zzcxd != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field zzapf zzcxd>
	//*   2    4:ifnull          17
			zzcxd.onWindowVisibilityChanged(i);
	//    3    7:aload_0         
	//    4    8:getfield        #134 <Field zzapf zzcxd>
	//    5   11:iload_1         
	//    6   12:invokeinterface #580 <Method void zzapf.onWindowVisibilityChanged(int)>
	//    7   17:return          
	}

	public final String zzsp()
	{
		String s;
		if(zzcxb)
	//*   0    0:aload_0         
	//*   1    1:getfield        #122 <Field boolean zzcxb>
	//*   2    4:ifeq            14
			s = " spherical";
	//    3    7:ldc2            #583 <String " spherical">
	//    4   10:astore_1        
		else
	//*   5   11:goto            18
			s = "";
	//    6   14:ldc2            #585 <String "">
	//    7   17:astore_1        
		s = String.valueOf(((Object) (s)));
	//    8   18:aload_1         
	//    9   19:invokestatic    #290 <Method String String.valueOf(Object)>
	//   10   22:astore_1        
		if(s.length() != 0)
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #295 <Method int String.length()>
	//*  13   27:ifeq            38
			return "MediaPlayer".concat(s);
	//   14   30:ldc2            #587 <String "MediaPlayer">
	//   15   33:aload_1         
	//   16   34:invokevirtual   #591 <Method String String.concat(String)>
	//   17   37:areturn         
		else
			return new String("MediaPlayer");
	//   18   38:new             #287 <Class String>
	//   19   41:dup             
	//   20   42:ldc2            #587 <String "MediaPlayer">
	//   21   45:invokespecial   #593 <Method void String(String)>
	//   22   48:areturn         
	}

	public final void zzst()
	{
		zza(zzcxl.getVolume());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #162 <Field zzapz zzcxl>
	//    3    5:invokevirtual   #597 <Method float zzapz.getVolume()>
	//    4    8:invokespecial   #327 <Method void zza(float)>
	//    5   11:return          
	}

	private static final Map zzcwo;
	private final zzapx zzcwp;
	private final boolean zzcwq;
	private int zzcwr;
	private int zzcws;
	private MediaPlayer zzcwt;
	private Uri zzcwu;
	private int zzcwv;
	private int zzcww;
	private int zzcwx;
	private int zzcwy;
	private int zzcwz;
	private zzapu zzcxa;
	private boolean zzcxb;
	private int zzcxc;
	private zzapf zzcxd;

	static 
	{
		zzcwo = ((Map) (new HashMap()));
	//    0    0:new             #51  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void HashMap()>
	//    3    7:putstatic       #56  <Field Map zzcwo>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   4   10:getstatic       #61  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   13:bipush          17
	//*   6   15:icmplt          100
		{
			zzcwo.put(((Object) (Integer.valueOf(-1004))), "MEDIA_ERROR_IO");
	//    7   18:getstatic       #56  <Field Map zzcwo>
	//    8   21:sipush          -1004
	//    9   24:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   10   27:ldc1            #69  <String "MEDIA_ERROR_IO">
	//   11   29:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   12   34:pop             
			zzcwo.put(((Object) (Integer.valueOf(-1007))), "MEDIA_ERROR_MALFORMED");
	//   13   35:getstatic       #56  <Field Map zzcwo>
	//   14   38:sipush          -1007
	//   15   41:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   16   44:ldc1            #77  <String "MEDIA_ERROR_MALFORMED">
	//   17   46:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   18   51:pop             
			zzcwo.put(((Object) (Integer.valueOf(-1010))), "MEDIA_ERROR_UNSUPPORTED");
	//   19   52:getstatic       #56  <Field Map zzcwo>
	//   20   55:sipush          -1010
	//   21   58:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   22   61:ldc1            #79  <String "MEDIA_ERROR_UNSUPPORTED">
	//   23   63:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   24   68:pop             
			zzcwo.put(((Object) (Integer.valueOf(-110))), "MEDIA_ERROR_TIMED_OUT");
	//   25   69:getstatic       #56  <Field Map zzcwo>
	//   26   72:bipush          -110
	//   27   74:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   28   77:ldc1            #81  <String "MEDIA_ERROR_TIMED_OUT">
	//   29   79:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   30   84:pop             
			zzcwo.put(((Object) (Integer.valueOf(3))), "MEDIA_INFO_VIDEO_RENDERING_START");
	//   31   85:getstatic       #56  <Field Map zzcwo>
	//   32   88:iconst_3        
	//   33   89:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   34   92:ldc1            #83  <String "MEDIA_INFO_VIDEO_RENDERING_START">
	//   35   94:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   36   99:pop             
		}
		zzcwo.put(((Object) (Integer.valueOf(100))), "MEDIA_ERROR_SERVER_DIED");
	//   37  100:getstatic       #56  <Field Map zzcwo>
	//   38  103:bipush          100
	//   39  105:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   40  108:ldc1            #85  <String "MEDIA_ERROR_SERVER_DIED">
	//   41  110:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   42  115:pop             
		zzcwo.put(((Object) (Integer.valueOf(1))), "MEDIA_ERROR_UNKNOWN");
	//   43  116:getstatic       #56  <Field Map zzcwo>
	//   44  119:iconst_1        
	//   45  120:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   46  123:ldc1            #87  <String "MEDIA_ERROR_UNKNOWN">
	//   47  125:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   48  130:pop             
		zzcwo.put(((Object) (Integer.valueOf(1))), "MEDIA_INFO_UNKNOWN");
	//   49  131:getstatic       #56  <Field Map zzcwo>
	//   50  134:iconst_1        
	//   51  135:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   52  138:ldc1            #89  <String "MEDIA_INFO_UNKNOWN">
	//   53  140:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   54  145:pop             
		zzcwo.put(((Object) (Integer.valueOf(700))), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
	//   55  146:getstatic       #56  <Field Map zzcwo>
	//   56  149:sipush          700
	//   57  152:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   58  155:ldc1            #91  <String "MEDIA_INFO_VIDEO_TRACK_LAGGING">
	//   59  157:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   60  162:pop             
		zzcwo.put(((Object) (Integer.valueOf(701))), "MEDIA_INFO_BUFFERING_START");
	//   61  163:getstatic       #56  <Field Map zzcwo>
	//   62  166:sipush          701
	//   63  169:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   64  172:ldc1            #93  <String "MEDIA_INFO_BUFFERING_START">
	//   65  174:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   66  179:pop             
		zzcwo.put(((Object) (Integer.valueOf(702))), "MEDIA_INFO_BUFFERING_END");
	//   67  180:getstatic       #56  <Field Map zzcwo>
	//   68  183:sipush          702
	//   69  186:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   70  189:ldc1            #95  <String "MEDIA_INFO_BUFFERING_END">
	//   71  191:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   72  196:pop             
		zzcwo.put(((Object) (Integer.valueOf(800))), "MEDIA_INFO_BAD_INTERLEAVING");
	//   73  197:getstatic       #56  <Field Map zzcwo>
	//   74  200:sipush          800
	//   75  203:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   76  206:ldc1            #97  <String "MEDIA_INFO_BAD_INTERLEAVING">
	//   77  208:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   78  213:pop             
		zzcwo.put(((Object) (Integer.valueOf(801))), "MEDIA_INFO_NOT_SEEKABLE");
	//   79  214:getstatic       #56  <Field Map zzcwo>
	//   80  217:sipush          801
	//   81  220:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   82  223:ldc1            #99  <String "MEDIA_INFO_NOT_SEEKABLE">
	//   83  225:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   84  230:pop             
		zzcwo.put(((Object) (Integer.valueOf(802))), "MEDIA_INFO_METADATA_UPDATE");
	//   85  231:getstatic       #56  <Field Map zzcwo>
	//   86  234:sipush          802
	//   87  237:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   88  240:ldc1            #101 <String "MEDIA_INFO_METADATA_UPDATE">
	//   89  242:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   90  247:pop             
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  91  248:getstatic       #61  <Field int android.os.Build$VERSION.SDK_INT>
	//*  92  251:bipush          19
	//*  93  253:icmplt          290
		{
			zzcwo.put(((Object) (Integer.valueOf(901))), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
	//   94  256:getstatic       #56  <Field Map zzcwo>
	//   95  259:sipush          901
	//   96  262:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   97  265:ldc1            #103 <String "MEDIA_INFO_UNSUPPORTED_SUBTITLE">
	//   98  267:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   99  272:pop             
			zzcwo.put(((Object) (Integer.valueOf(902))), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
	//  100  273:getstatic       #56  <Field Map zzcwo>
	//  101  276:sipush          902
	//  102  279:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//  103  282:ldc1            #105 <String "MEDIA_INFO_SUBTITLE_TIMED_OUT">
	//  104  284:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//  105  289:pop             
		}
	//* 106  290:return          
	}
}
