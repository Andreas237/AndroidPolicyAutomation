// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer2:
//			RenderersFactory, Renderer

public class DefaultRenderersFactory
	implements RenderersFactory
{
	public static interface ExtensionRendererMode
		extends Annotation
	{
	}


	public DefaultRenderersFactory(Context context1)
	{
		this(context1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #39  <Method void DefaultRenderersFactory(Context, int)>
	//    4    6:return          
	}

	public DefaultRenderersFactory(Context context1, int i)
	{
		this(context1, ((DrmSessionManager) (null)), i, 5000L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:ldc2w           #12  <Long 5000L>
	//    5    7:invokespecial   #43  <Method void DefaultRenderersFactory(Context, DrmSessionManager, int, long)>
	//    6   10:return          
	}

	public DefaultRenderersFactory(Context context1, int i, long l)
	{
		this(context1, ((DrmSessionManager) (null)), i, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:lload_3         
	//    5    5:invokespecial   #43  <Method void DefaultRenderersFactory(Context, DrmSessionManager, int, long)>
	//    6    8:return          
	}

	public DefaultRenderersFactory(Context context1, DrmSessionManager drmsessionmanager)
	{
		this(context1, drmsessionmanager, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #49  <Method void DefaultRenderersFactory(Context, DrmSessionManager, int)>
	//    5    7:return          
	}

	public DefaultRenderersFactory(Context context1, DrmSessionManager drmsessionmanager, int i)
	{
		this(context1, drmsessionmanager, i, 5000L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:ldc2w           #12  <Long 5000L>
	//    5    7:invokespecial   #43  <Method void DefaultRenderersFactory(Context, DrmSessionManager, int, long)>
	//    6   10:return          
	}

	public DefaultRenderersFactory(Context context1, DrmSessionManager drmsessionmanager, int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #59  <Field Context context>
		extensionRendererMode = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #61  <Field int extensionRendererMode>
		allowedVideoJoiningTimeMs = l;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #63  <Field long allowedVideoJoiningTimeMs>
		drmSessionManager = drmsessionmanager;
	//   11   20:aload_0         
	//   12   21:aload_2         
	//   13   22:putfield        #65  <Field DrmSessionManager drmSessionManager>
	//   14   25:return          
	}

	protected AudioProcessor[] buildAudioProcessors()
	{
		return new AudioProcessor[0];
	//    0    0:iconst_0        
	//    1    1:anewarray       AudioProcessor[]
	//    2    4:areturn         
	}

	protected void buildAudioRenderers(Context context1, DrmSessionManager drmsessionmanager, AudioProcessor aaudioprocessor[], Handler handler, AudioRendererEventListener audiorenderereventlistener, int i, ArrayList arraylist)
	{
		int j;
		arraylist.add(((Object) (new MediaCodecAudioRenderer(context1, MediaCodecSelector.DEFAULT, drmsessionmanager, false, handler, audiorenderereventlistener, AudioCapabilities.getCapabilities(context1), aaudioprocessor))));
	//    0    0:aload           7
	//    1    2:new             #78  <Class MediaCodecAudioRenderer>
	//    2    5:dup             
	//    3    6:aload_1         
	//    4    7:getstatic       #84  <Field MediaCodecSelector MediaCodecSelector.DEFAULT>
	//    5   10:aload_2         
	//    6   11:iconst_0        
	//    7   12:aload           4
	//    8   14:aload           5
	//    9   16:aload_1         
	//   10   17:invokestatic    #90  <Method AudioCapabilities AudioCapabilities.getCapabilities(Context)>
	//   11   20:aload_3         
	//   12   21:invokespecial   #93  <Method void MediaCodecAudioRenderer(Context, MediaCodecSelector, DrmSessionManager, boolean, Handler, AudioRendererEventListener, AudioCapabilities, AudioProcessor[])>
	//   13   24:invokevirtual   #99  <Method boolean ArrayList.add(Object)>
	//   14   27:pop             
		if(i == 0)
	//*  15   28:iload           6
	//*  16   30:ifne            34
			return;
	//   17   33:return          
		int k = arraylist.size();
	//   18   34:aload           7
	//   19   36:invokevirtual   #103 <Method int ArrayList.size()>
	//   20   39:istore          9
		j = k;
	//   21   41:iload           9
	//   22   43:istore          8
		if(i == 2)
	//*  23   45:iload           6
	//*  24   47:iconst_2        
	//*  25   48:icmpne          57
			j = k - 1;
	//   26   51:iload           9
	//   27   53:iconst_1        
	//   28   54:isub            
	//   29   55:istore          8
		context1 = ((Context) ((Renderer)Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(new Class[] {
			android/os/Handler, com/google/android/exoplayer2/audio/AudioRendererEventListener, [Lcom/google/android/exoplayer2/audio/AudioProcessor;
		}).newInstance(new Object[] {
			handler, audiorenderereventlistener, aaudioprocessor
		})));
	//   30   57:ldc1            #105 <String "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer">
	//   31   59:invokestatic    #111 <Method Class Class.forName(String)>
	//   32   62:iconst_3        
	//   33   63:anewarray       Class[]
	//   34   66:dup             
	//   35   67:iconst_0        
	//   36   68:ldc1            #113 <Class Handler>
	//   37   70:aastore         
	//   38   71:dup             
	//   39   72:iconst_1        
	//   40   73:ldc1            #115 <Class AudioRendererEventListener>
	//   41   75:aastore         
	//   42   76:dup             
	//   43   77:iconst_2        
	//   44   78:ldc1            #117 <Class AudioProcessor[]>
	//   45   80:aastore         
	//   46   81:invokevirtual   #121 <Method Constructor Class.getConstructor(Class[])>
	//   47   84:iconst_3        
	//   48   85:anewarray       Object[]
	//   49   88:dup             
	//   50   89:iconst_0        
	//   51   90:aload           4
	//   52   92:aastore         
	//   53   93:dup             
	//   54   94:iconst_1        
	//   55   95:aload           5
	//   56   97:aastore         
	//   57   98:dup             
	//   58   99:iconst_2        
	//   59  100:aload_3         
	//   60  101:aastore         
	//   61  102:invokevirtual   #127 <Method Object Constructor.newInstance(Object[])>
	//   62  105:checkcast       #129 <Class Renderer>
	//   63  108:astore_1        
		i = j + 1;
	//   64  109:iload           8
	//   65  111:iconst_1        
	//   66  112:iadd            
	//   67  113:istore          6
		try
		{
			arraylist.add(j, ((Object) (context1)));
	//   68  115:aload           7
	//   69  117:iload           8
	//   70  119:aload_1         
	//   71  120:invokevirtual   #132 <Method void ArrayList.add(int, Object)>
			Log.i("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
	//   72  123:ldc1            #26  <String "DefaultRenderersFactory">
	//   73  125:ldc1            #134 <String "Loaded LibopusAudioRenderer.">
	//   74  127:invokestatic    #140 <Method int Log.i(String, String)>
	//   75  130:pop             
		}
	//*  76  131:goto            150
	//*  77  134:astore_1        
	//*  78  135:new             #142 <Class RuntimeException>
	//*  79  138:dup             
	//*  80  139:ldc1            #144 <String "Error instantiating Opus extension">
	//*  81  141:aload_1         
	//*  82  142:invokespecial   #147 <Method void RuntimeException(String, Throwable)>
	//*  83  145:athrow          
	//*  84  146:iload           8
	//*  85  148:istore          6
	//*  86  150:ldc1            #149 <String "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer">
	//*  87  152:invokestatic    #111 <Method Class Class.forName(String)>
	//*  88  155:iconst_3        
	//*  89  156:anewarray       Class[]
	//*  90  159:dup             
	//*  91  160:iconst_0        
	//*  92  161:ldc1            #113 <Class Handler>
	//*  93  163:aastore         
	//*  94  164:dup             
	//*  95  165:iconst_1        
	//*  96  166:ldc1            #115 <Class AudioRendererEventListener>
	//*  97  168:aastore         
	//*  98  169:dup             
	//*  99  170:iconst_2        
	//* 100  171:ldc1            #117 <Class AudioProcessor[]>
	//* 101  173:aastore         
	//* 102  174:invokevirtual   #121 <Method Constructor Class.getConstructor(Class[])>
	//* 103  177:iconst_3        
	//* 104  178:anewarray       Object[]
	//* 105  181:dup             
	//* 106  182:iconst_0        
	//* 107  183:aload           4
	//* 108  185:aastore         
	//* 109  186:dup             
	//* 110  187:iconst_1        
	//* 111  188:aload           5
	//* 112  190:aastore         
	//* 113  191:dup             
	//* 114  192:iconst_2        
	//* 115  193:aload_3         
	//* 116  194:aastore         
	//* 117  195:invokevirtual   #127 <Method Object Constructor.newInstance(Object[])>
	//* 118  198:checkcast       #129 <Class Renderer>
	//* 119  201:astore_1        
	//* 120  202:iload           6
	//* 121  204:iconst_1        
	//* 122  205:iadd            
	//* 123  206:istore          8
	//* 124  208:aload           7
	//* 125  210:iload           6
	//* 126  212:aload_1         
	//* 127  213:invokevirtual   #132 <Method void ArrayList.add(int, Object)>
	//* 128  216:ldc1            #26  <String "DefaultRenderersFactory">
	//* 129  218:ldc1            #151 <String "Loaded LibflacAudioRenderer.">
	//* 130  220:invokestatic    #140 <Method int Log.i(String, String)>
	//* 131  223:pop             
	//* 132  224:iload           8
	//* 133  226:istore          6
	//* 134  228:goto            243
	//* 135  231:astore_1        
	//* 136  232:new             #142 <Class RuntimeException>
	//* 137  235:dup             
	//* 138  236:ldc1            #153 <String "Error instantiating FLAC extension">
	//* 139  238:aload_1         
	//* 140  239:invokespecial   #147 <Method void RuntimeException(String, Throwable)>
	//* 141  242:athrow          
	//* 142  243:aload           7
	//* 143  245:iload           6
	//* 144  247:ldc1            #155 <String "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer">
	//* 145  249:invokestatic    #111 <Method Class Class.forName(String)>
	//* 146  252:iconst_3        
	//* 147  253:anewarray       Class[]
	//* 148  256:dup             
	//* 149  257:iconst_0        
	//* 150  258:ldc1            #113 <Class Handler>
	//* 151  260:aastore         
	//* 152  261:dup             
	//* 153  262:iconst_1        
	//* 154  263:ldc1            #115 <Class AudioRendererEventListener>
	//* 155  265:aastore         
	//* 156  266:dup             
	//* 157  267:iconst_2        
	//* 158  268:ldc1            #117 <Class AudioProcessor[]>
	//* 159  270:aastore         
	//* 160  271:invokevirtual   #121 <Method Constructor Class.getConstructor(Class[])>
	//* 161  274:iconst_3        
	//* 162  275:anewarray       Object[]
	//* 163  278:dup             
	//* 164  279:iconst_0        
	//* 165  280:aload           4
	//* 166  282:aastore         
	//* 167  283:dup             
	//* 168  284:iconst_1        
	//* 169  285:aload           5
	//* 170  287:aastore         
	//* 171  288:dup             
	//* 172  289:iconst_2        
	//* 173  290:aload_3         
	//* 174  291:aastore         
	//* 175  292:invokevirtual   #127 <Method Object Constructor.newInstance(Object[])>
	//* 176  295:checkcast       #129 <Class Renderer>
	//* 177  298:invokevirtual   #132 <Method void ArrayList.add(int, Object)>
	//* 178  301:ldc1            #26  <String "DefaultRenderersFactory">
	//* 179  303:ldc1            #157 <String "Loaded FfmpegAudioRenderer.">
	//* 180  305:invokestatic    #140 <Method int Log.i(String, String)>
	//* 181  308:pop             
	//* 182  309:return          
	//* 183  310:astore_1        
	//* 184  311:new             #142 <Class RuntimeException>
	//* 185  314:dup             
	//* 186  315:ldc1            #159 <String "Error instantiating FFmpeg extension">
	//* 187  317:aload_1         
	//* 188  318:invokespecial   #147 <Method void RuntimeException(String, Throwable)>
	//* 189  321:athrow          
	//* 190  322:astore_1        
	//* 191  323:goto            146
		// Misplaced declaration of an exception variable
		catch(Context context1) { }
	//  192  326:astore_1        
		// Misplaced declaration of an exception variable
		catch(Context context1)
		{
			throw new RuntimeException("Error instantiating Opus extension", ((Throwable) (context1)));
		}
		  goto _L1
_L2:
		i = j;
_L1:
		context1 = ((Context) ((Renderer)Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(new Class[] {
			android/os/Handler, com/google/android/exoplayer2/audio/AudioRendererEventListener, [Lcom/google/android/exoplayer2/audio/AudioProcessor;
		}).newInstance(new Object[] {
			handler, audiorenderereventlistener, aaudioprocessor
		})));
		j = i + 1;
		arraylist.add(i, ((Object) (context1)));
		Log.i("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
		i = j;
		break MISSING_BLOCK_LABEL_243;
		context1;
		throw new RuntimeException("Error instantiating FLAC extension", ((Throwable) (context1)));
_L3:
		try
		{
			arraylist.add(i, ((Object) ((Renderer)Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(new Class[] {
				android/os/Handler, com/google/android/exoplayer2/audio/AudioRendererEventListener, [Lcom/google/android/exoplayer2/audio/AudioProcessor;
			}).newInstance(new Object[] {
				handler, audiorenderereventlistener, aaudioprocessor
			}))));
			Log.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
			return;
		}
	//* 193  327:goto            150
	//* 194  330:astore_1        
	//* 195  331:goto            243
	//* 196  334:astore_1        
	//* 197  335:iload           8
	//* 198  337:istore          6
	//* 199  339:goto            243
		// Misplaced declaration of an exception variable
		catch(Context context1)
	//* 200  342:astore_1        
		{
			return;
	//  201  343:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context1)
		{
			throw new RuntimeException("Error instantiating FFmpeg extension", ((Throwable) (context1)));
		}
		context1;
		  goto _L2
		context1;
		  goto _L3
		context1;
		i = j;
		  goto _L3
	}

	protected void buildMetadataRenderers(Context context1, MetadataOutput metadataoutput, Looper looper, int i, ArrayList arraylist)
	{
		arraylist.add(((Object) (new MetadataRenderer(metadataoutput, looper))));
	//    0    0:aload           5
	//    1    2:new             #164 <Class MetadataRenderer>
	//    2    5:dup             
	//    3    6:aload_2         
	//    4    7:aload_3         
	//    5    8:invokespecial   #167 <Method void MetadataRenderer(MetadataOutput, Looper)>
	//    6   11:invokevirtual   #99  <Method boolean ArrayList.add(Object)>
	//    7   14:pop             
	//    8   15:return          
	}

	protected void buildMiscellaneousRenderers(Context context1, Handler handler, int i, ArrayList arraylist)
	{
	//    0    0:return          
	}

	protected void buildTextRenderers(Context context1, TextOutput textoutput, Looper looper, int i, ArrayList arraylist)
	{
		arraylist.add(((Object) (new TextRenderer(textoutput, looper))));
	//    0    0:aload           5
	//    1    2:new             #175 <Class TextRenderer>
	//    2    5:dup             
	//    3    6:aload_2         
	//    4    7:aload_3         
	//    5    8:invokespecial   #178 <Method void TextRenderer(TextOutput, Looper)>
	//    6   11:invokevirtual   #99  <Method boolean ArrayList.add(Object)>
	//    7   14:pop             
	//    8   15:return          
	}

	protected void buildVideoRenderers(Context context1, DrmSessionManager drmsessionmanager, long l, Handler handler, VideoRendererEventListener videorenderereventlistener, int i, 
			ArrayList arraylist)
	{
		arraylist.add(((Object) (new MediaCodecVideoRenderer(context1, MediaCodecSelector.DEFAULT, l, drmsessionmanager, false, handler, videorenderereventlistener, 50))));
	//    0    0:aload           8
	//    1    2:new             #183 <Class MediaCodecVideoRenderer>
	//    2    5:dup             
	//    3    6:aload_1         
	//    4    7:getstatic       #84  <Field MediaCodecSelector MediaCodecSelector.DEFAULT>
	//    5   10:lload_3         
	//    6   11:aload_2         
	//    7   12:iconst_0        
	//    8   13:aload           5
	//    9   15:aload           6
	//   10   17:bipush          50
	//   11   19:invokespecial   #186 <Method void MediaCodecVideoRenderer(Context, MediaCodecSelector, long, DrmSessionManager, boolean, Handler, VideoRendererEventListener, int)>
	//   12   22:invokevirtual   #99  <Method boolean ArrayList.add(Object)>
	//   13   25:pop             
		if(i == 0)
	//*  14   26:iload           7
	//*  15   28:ifne            32
			return;
	//   16   31:return          
		int k = arraylist.size();
	//   17   32:aload           8
	//   18   34:invokevirtual   #103 <Method int ArrayList.size()>
	//   19   37:istore          10
		int j = k;
	//   20   39:iload           10
	//   21   41:istore          9
		if(i == 2)
	//*  22   43:iload           7
	//*  23   45:iconst_2        
	//*  24   46:icmpne          55
			j = k - 1;
	//   25   49:iload           10
	//   26   51:iconst_1        
	//   27   52:isub            
	//   28   53:istore          9
		try
		{
			arraylist.add(j, ((Object) ((Renderer)Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[] {
				Boolean.TYPE, Long.TYPE, android/os/Handler, com/google/android/exoplayer2/video/VideoRendererEventListener, Integer.TYPE
			}).newInstance(new Object[] {
				Boolean.valueOf(true), Long.valueOf(l), handler, videorenderereventlistener, Integer.valueOf(50)
			}))));
	//   29   55:aload           8
	//   30   57:iload           9
	//   31   59:ldc1            #188 <String "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer">
	//   32   61:invokestatic    #111 <Method Class Class.forName(String)>
	//   33   64:iconst_5        
	//   34   65:anewarray       Class[]
	//   35   68:dup             
	//   36   69:iconst_0        
	//   37   70:getstatic       #194 <Field Class Boolean.TYPE>
	//   38   73:aastore         
	//   39   74:dup             
	//   40   75:iconst_1        
	//   41   76:getstatic       #197 <Field Class Long.TYPE>
	//   42   79:aastore         
	//   43   80:dup             
	//   44   81:iconst_2        
	//   45   82:ldc1            #113 <Class Handler>
	//   46   84:aastore         
	//   47   85:dup             
	//   48   86:iconst_3        
	//   49   87:ldc1            #199 <Class VideoRendererEventListener>
	//   50   89:aastore         
	//   51   90:dup             
	//   52   91:iconst_4        
	//   53   92:getstatic       #202 <Field Class Integer.TYPE>
	//   54   95:aastore         
	//   55   96:invokevirtual   #121 <Method Constructor Class.getConstructor(Class[])>
	//   56   99:iconst_5        
	//   57  100:anewarray       Object[]
	//   58  103:dup             
	//   59  104:iconst_0        
	//   60  105:iconst_1        
	//   61  106:invokestatic    #206 <Method Boolean Boolean.valueOf(boolean)>
	//   62  109:aastore         
	//   63  110:dup             
	//   64  111:iconst_1        
	//   65  112:lload_3         
	//   66  113:invokestatic    #209 <Method Long Long.valueOf(long)>
	//   67  116:aastore         
	//   68  117:dup             
	//   69  118:iconst_2        
	//   70  119:aload           5
	//   71  121:aastore         
	//   72  122:dup             
	//   73  123:iconst_3        
	//   74  124:aload           6
	//   75  126:aastore         
	//   76  127:dup             
	//   77  128:iconst_4        
	//   78  129:bipush          50
	//   79  131:invokestatic    #212 <Method Integer Integer.valueOf(int)>
	//   80  134:aastore         
	//   81  135:invokevirtual   #127 <Method Object Constructor.newInstance(Object[])>
	//   82  138:checkcast       #129 <Class Renderer>
	//   83  141:invokevirtual   #132 <Method void ArrayList.add(int, Object)>
			Log.i("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
	//   84  144:ldc1            #26  <String "DefaultRenderersFactory">
	//   85  146:ldc1            #214 <String "Loaded LibvpxVideoRenderer.">
	//   86  148:invokestatic    #140 <Method int Log.i(String, String)>
	//   87  151:pop             
			return;
	//   88  152:return          
		}
	//*  89  153:astore_1        
	//*  90  154:new             #142 <Class RuntimeException>
	//*  91  157:dup             
	//*  92  158:ldc1            #216 <String "Error instantiating VP9 extension">
	//*  93  160:aload_1         
	//*  94  161:invokespecial   #147 <Method void RuntimeException(String, Throwable)>
	//*  95  164:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context1)
	//*  96  165:astore_1        
		{
			return;
	//   97  166:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context1)
		{
			throw new RuntimeException("Error instantiating VP9 extension", ((Throwable) (context1)));
		}
	}

	public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videorenderereventlistener, AudioRendererEventListener audiorenderereventlistener, TextOutput textoutput, MetadataOutput metadataoutput, DrmSessionManager drmsessionmanager)
	{
		if(drmsessionmanager == null)
	//*   0    0:aload           6
	//*   1    2:ifnonnull       14
			drmsessionmanager = drmSessionManager;
	//    2    5:aload_0         
	//    3    6:getfield        #65  <Field DrmSessionManager drmSessionManager>
	//    4    9:astore          6
	//*   5   11:goto            14
		ArrayList arraylist = new ArrayList();
	//    6   14:new             #95  <Class ArrayList>
	//    7   17:dup             
	//    8   18:invokespecial   #220 <Method void ArrayList()>
	//    9   21:astore          7
		buildVideoRenderers(context, drmsessionmanager, allowedVideoJoiningTimeMs, handler, videorenderereventlistener, extensionRendererMode, arraylist);
	//   10   23:aload_0         
	//   11   24:aload_0         
	//   12   25:getfield        #59  <Field Context context>
	//   13   28:aload           6
	//   14   30:aload_0         
	//   15   31:getfield        #63  <Field long allowedVideoJoiningTimeMs>
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:aload_0         
	//   19   37:getfield        #61  <Field int extensionRendererMode>
	//   20   40:aload           7
	//   21   42:invokevirtual   #222 <Method void buildVideoRenderers(Context, DrmSessionManager, long, Handler, VideoRendererEventListener, int, ArrayList)>
		buildAudioRenderers(context, drmsessionmanager, buildAudioProcessors(), handler, audiorenderereventlistener, extensionRendererMode, arraylist);
	//   22   45:aload_0         
	//   23   46:aload_0         
	//   24   47:getfield        #59  <Field Context context>
	//   25   50:aload           6
	//   26   52:aload_0         
	//   27   53:invokevirtual   #224 <Method AudioProcessor[] buildAudioProcessors()>
	//   28   56:aload_1         
	//   29   57:aload_3         
	//   30   58:aload_0         
	//   31   59:getfield        #61  <Field int extensionRendererMode>
	//   32   62:aload           7
	//   33   64:invokevirtual   #226 <Method void buildAudioRenderers(Context, DrmSessionManager, AudioProcessor[], Handler, AudioRendererEventListener, int, ArrayList)>
		buildTextRenderers(context, textoutput, handler.getLooper(), extensionRendererMode, arraylist);
	//   34   67:aload_0         
	//   35   68:aload_0         
	//   36   69:getfield        #59  <Field Context context>
	//   37   72:aload           4
	//   38   74:aload_1         
	//   39   75:invokevirtual   #230 <Method Looper Handler.getLooper()>
	//   40   78:aload_0         
	//   41   79:getfield        #61  <Field int extensionRendererMode>
	//   42   82:aload           7
	//   43   84:invokevirtual   #232 <Method void buildTextRenderers(Context, TextOutput, Looper, int, ArrayList)>
		buildMetadataRenderers(context, metadataoutput, handler.getLooper(), extensionRendererMode, arraylist);
	//   44   87:aload_0         
	//   45   88:aload_0         
	//   46   89:getfield        #59  <Field Context context>
	//   47   92:aload           5
	//   48   94:aload_1         
	//   49   95:invokevirtual   #230 <Method Looper Handler.getLooper()>
	//   50   98:aload_0         
	//   51   99:getfield        #61  <Field int extensionRendererMode>
	//   52  102:aload           7
	//   53  104:invokevirtual   #234 <Method void buildMetadataRenderers(Context, MetadataOutput, Looper, int, ArrayList)>
		buildMiscellaneousRenderers(context, handler, extensionRendererMode, arraylist);
	//   54  107:aload_0         
	//   55  108:aload_0         
	//   56  109:getfield        #59  <Field Context context>
	//   57  112:aload_1         
	//   58  113:aload_0         
	//   59  114:getfield        #61  <Field int extensionRendererMode>
	//   60  117:aload           7
	//   61  119:invokevirtual   #236 <Method void buildMiscellaneousRenderers(Context, Handler, int, ArrayList)>
		return (Renderer[])arraylist.toArray(((Object []) (new Renderer[arraylist.size()])));
	//   62  122:aload           7
	//   63  124:aload           7
	//   64  126:invokevirtual   #103 <Method int ArrayList.size()>
	//   65  129:anewarray       Renderer[]
	//   66  132:invokevirtual   #240 <Method Object[] ArrayList.toArray(Object[])>
	//   67  135:checkcast       #242 <Class Renderer[]>
	//   68  138:areturn         
	}

	public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000L;
	public static final int EXTENSION_RENDERER_MODE_OFF = 0;
	public static final int EXTENSION_RENDERER_MODE_ON = 1;
	public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
	protected static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
	private static final String TAG = "DefaultRenderersFactory";
	private final long allowedVideoJoiningTimeMs;
	private final Context context;
	private final DrmSessionManager drmSessionManager;
	private final int extensionRendererMode;
}
