// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DownsampleStrategy, HardwareConfigState, TransformationUtils, BitmapResource

public final class Downsampler
{
	public static interface DecodeCallbacks
	{

		public abstract void onDecodeComplete(BitmapPool bitmappool, Bitmap bitmap)
			throws IOException;

		public abstract void onObtainBounds();
	}


	public Downsampler(List list, DisplayMetrics displaymetrics, BitmapPool bitmappool, ArrayPool arraypool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #150 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #156 <Method HardwareConfigState HardwareConfigState.getInstance()>
	//    4    8:putfield        #158 <Field HardwareConfigState hardwareConfigState>
		parsers = list;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #160 <Field List parsers>
		displayMetrics = (DisplayMetrics)Preconditions.checkNotNull(((Object) (displaymetrics)));
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #168 <Class DisplayMetrics>
	//   12   24:putfield        #170 <Field DisplayMetrics displayMetrics>
		bitmapPool = (BitmapPool)Preconditions.checkNotNull(((Object) (bitmappool)));
	//   13   27:aload_0         
	//   14   28:aload_3         
	//   15   29:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object)>
	//   16   32:checkcast       #172 <Class BitmapPool>
	//   17   35:putfield        #174 <Field BitmapPool bitmapPool>
		byteArrayPool = (ArrayPool)Preconditions.checkNotNull(((Object) (arraypool)));
	//   18   38:aload_0         
	//   19   39:aload           4
	//   20   41:invokestatic    #166 <Method Object Preconditions.checkNotNull(Object)>
	//   21   44:checkcast       #176 <Class ArrayPool>
	//   22   47:putfield        #178 <Field ArrayPool byteArrayPool>
	//   23   50:return          
	}

	private void calculateConfig(InputStream inputstream, DecodeFormat decodeformat, boolean flag, boolean flag1, android.graphics.BitmapFactory.Options options, int i, int j)
		throws IOException
	{
		if(hardwareConfigState.setHardwareConfigIfAllowed(i, j, options, decodeformat, flag, flag1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field HardwareConfigState hardwareConfigState>
	//*   2    4:iload           6
	//*   3    6:iload           7
	//*   4    8:aload           5
	//*   5   10:aload_2         
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:invokevirtual   #188 <Method boolean HardwareConfigState.setHardwareConfigIfAllowed(int, int, android.graphics.BitmapFactory$Options, DecodeFormat, boolean, boolean)>
	//*   9   17:ifeq            21
			return;
	//   10   20:return          
		if(decodeformat == DecodeFormat.PREFER_ARGB_8888 || decodeformat == DecodeFormat.PREFER_ARGB_8888_DISALLOW_HARDWARE || android.os.Build.VERSION.SDK_INT == 16)
	//*  11   21:aload_2         
	//*  12   22:getstatic       #191 <Field DecodeFormat DecodeFormat.PREFER_ARGB_8888>
	//*  13   25:if_acmpeq       43
	//*  14   28:aload_2         
	//*  15   29:getstatic       #194 <Field DecodeFormat DecodeFormat.PREFER_ARGB_8888_DISALLOW_HARDWARE>
	//*  16   32:if_acmpeq       43
	//*  17   35:getstatic       #199 <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   38:bipush          16
	//*  19   40:icmpne          52
		{
			options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
	//   20   43:aload           5
	//   21   45:getstatic       #205 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   22   48:putfield        #210 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
			return;
	//   23   51:return          
		}
		flag1 = false;
	//   24   52:iconst_0        
	//   25   53:istore          4
		try
		{
			flag = ImageHeaderParserUtils.getType(parsers, inputstream, byteArrayPool).hasAlpha();
	//   26   55:aload_0         
	//   27   56:getfield        #160 <Field List parsers>
	//   28   59:aload_1         
	//   29   60:aload_0         
	//   30   61:getfield        #178 <Field ArrayPool byteArrayPool>
	//   31   64:invokestatic    #216 <Method com.bumptech.glide.load.ImageHeaderParser$ImageType ImageHeaderParserUtils.getType(List, InputStream, ArrayPool)>
	//   32   67:invokevirtual   #220 <Method boolean com.bumptech.glide.load.ImageHeaderParser$ImageType.hasAlpha()>
	//   33   70:istore_3        
		}
	//*  34   71:goto            116
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  35   74:astore_1        
		{
			flag = flag1;
	//   36   75:iload           4
	//   37   77:istore_3        
			if(Log.isLoggable("Downsampler", 3))
	//*  38   78:ldc1            #35  <String "Downsampler">
	//*  39   80:iconst_3        
	//*  40   81:invokestatic    #226 <Method boolean Log.isLoggable(String, int)>
	//*  41   84:ifeq            116
			{
				Log.d("Downsampler", (new StringBuilder()).append("Cannot determine whether the image has alpha or not from header, format ").append(((Object) (decodeformat))).toString(), ((Throwable) (inputstream)));
	//   42   87:ldc1            #35  <String "Downsampler">
	//   43   89:new             #228 <Class StringBuilder>
	//   44   92:dup             
	//   45   93:invokespecial   #229 <Method void StringBuilder()>
	//   46   96:ldc1            #231 <String "Cannot determine whether the image has alpha or not from header, format ">
	//   47   98:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   48  101:aload_2         
	//   49  102:invokevirtual   #238 <Method StringBuilder StringBuilder.append(Object)>
	//   50  105:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   51  108:aload_1         
	//   52  109:invokestatic    #246 <Method int Log.d(String, String, Throwable)>
	//   53  112:pop             
				flag = flag1;
	//   54  113:iload           4
	//   55  115:istore_3        
			}
		}
		if(flag)
	//*  56  116:iload_3         
	//*  57  117:ifeq            127
			inputstream = ((InputStream) (android.graphics.Bitmap.Config.ARGB_8888));
	//   58  120:getstatic       #205 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   59  123:astore_1        
		else
	//*  60  124:goto            131
			inputstream = ((InputStream) (android.graphics.Bitmap.Config.RGB_565));
	//   61  127:getstatic       #249 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   62  130:astore_1        
		options.inPreferredConfig = ((android.graphics.Bitmap.Config) (inputstream));
	//   63  131:aload           5
	//   64  133:aload_1         
	//   65  134:putfield        #210 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
		if(options.inPreferredConfig == android.graphics.Bitmap.Config.RGB_565 || options.inPreferredConfig == android.graphics.Bitmap.Config.ARGB_4444 || options.inPreferredConfig == android.graphics.Bitmap.Config.ALPHA_8)
	//*  66  137:aload           5
	//*  67  139:getfield        #210 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
	//*  68  142:getstatic       #249 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//*  69  145:if_acmpeq       170
	//*  70  148:aload           5
	//*  71  150:getfield        #210 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
	//*  72  153:getstatic       #252 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_4444>
	//*  73  156:if_acmpeq       170
	//*  74  159:aload           5
	//*  75  161:getfield        #210 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
	//*  76  164:getstatic       #255 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ALPHA_8>
	//*  77  167:if_acmpne       176
			options.inDither = true;
	//   78  170:aload           5
	//   79  172:iconst_1        
	//   80  173:putfield        #259 <Field boolean android.graphics.BitmapFactory$Options.inDither>
	//   81  176:return          
	}

	static void calculateScaling(DownsampleStrategy downsamplestrategy, int i, int j, int k, int l, int i1, android.graphics.BitmapFactory.Options options)
	{
		if(j <= 0 || k <= 0)
	//*   0    0:iload_2         
	//*   1    1:ifle            8
	//*   2    4:iload_3         
	//*   3    5:ifgt            9
			return;
	//    4    8:return          
		float f;
		if(i == 90 || i == 270)
	//*   5    9:iload_1         
	//*   6   10:bipush          90
	//*   7   12:icmpeq          22
	//*   8   15:iload_1         
	//*   9   16:sipush          270
	//*  10   19:icmpne          37
			f = downsamplestrategy.getScaleFactor(k, j, l, i1);
	//   11   22:aload_0         
	//   12   23:iload_3         
	//   13   24:iload_2         
	//   14   25:iload           4
	//   15   27:iload           5
	//   16   29:invokevirtual   #266 <Method float DownsampleStrategy.getScaleFactor(int, int, int, int)>
	//   17   32:fstore          7
		else
	//*  18   34:goto            49
			f = downsamplestrategy.getScaleFactor(j, k, l, i1);
	//   19   37:aload_0         
	//   20   38:iload_2         
	//   21   39:iload_3         
	//   22   40:iload           4
	//   23   42:iload           5
	//   24   44:invokevirtual   #266 <Method float DownsampleStrategy.getScaleFactor(int, int, int, int)>
	//   25   47:fstore          7
		if(f <= 0.0F)
	//*  26   49:fload           7
	//*  27   51:fconst_0        
	//*  28   52:fcmpg           
	//*  29   53:ifgt            95
			throw new IllegalArgumentException((new StringBuilder()).append("Cannot scale with factor: ").append(f).append(" from: ").append(((Object) (downsamplestrategy))).toString());
	//   30   56:new             #268 <Class IllegalArgumentException>
	//   31   59:dup             
	//   32   60:new             #228 <Class StringBuilder>
	//   33   63:dup             
	//   34   64:invokespecial   #229 <Method void StringBuilder()>
	//   35   67:ldc2            #270 <String "Cannot scale with factor: ">
	//   36   70:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   37   73:fload           7
	//   38   75:invokevirtual   #273 <Method StringBuilder StringBuilder.append(float)>
	//   39   78:ldc2            #275 <String " from: ">
	//   40   81:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   41   84:aload_0         
	//   42   85:invokevirtual   #238 <Method StringBuilder StringBuilder.append(Object)>
	//   43   88:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   44   91:invokespecial   #278 <Method void IllegalArgumentException(String)>
	//   45   94:athrow          
		downsamplestrategy = ((DownsampleStrategy) (downsamplestrategy.getSampleSizeRounding(j, k, l, i1)));
	//   46   95:aload_0         
	//   47   96:iload_2         
	//   48   97:iload_3         
	//   49   98:iload           4
	//   50  100:iload           5
	//   51  102:invokevirtual   #282 <Method DownsampleStrategy$SampleSizeRounding DownsampleStrategy.getSampleSizeRounding(int, int, int, int)>
	//   52  105:astore_0        
		if(downsamplestrategy == null)
	//*  53  106:aload_0         
	//*  54  107:ifnonnull       121
			throw new IllegalArgumentException("Cannot round with null rounding");
	//   55  110:new             #268 <Class IllegalArgumentException>
	//   56  113:dup             
	//   57  114:ldc2            #284 <String "Cannot round with null rounding">
	//   58  117:invokespecial   #278 <Method void IllegalArgumentException(String)>
	//   59  120:athrow          
		int j1 = (int)((float)j * f + 0.5F);
	//   60  121:iload_2         
	//   61  122:i2f             
	//   62  123:fload           7
	//   63  125:fmul            
	//   64  126:ldc2            #285 <Float 0.5F>
	//   65  129:fadd            
	//   66  130:f2i             
	//   67  131:istore          9
		i = (int)((float)k * f + 0.5F);
	//   68  133:iload_3         
	//   69  134:i2f             
	//   70  135:fload           7
	//   71  137:fmul            
	//   72  138:ldc2            #285 <Float 0.5F>
	//   73  141:fadd            
	//   74  142:f2i             
	//   75  143:istore_1        
		j1 = j / j1;
	//   76  144:iload_2         
	//   77  145:iload           9
	//   78  147:idiv            
	//   79  148:istore          9
		i = k / i;
	//   80  150:iload_3         
	//   81  151:iload_1         
	//   82  152:idiv            
	//   83  153:istore_1        
		if(downsamplestrategy == DownsampleStrategy.SampleSizeRounding.MEMORY)
	//*  84  154:aload_0         
	//*  85  155:getstatic       #291 <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.MEMORY>
	//*  86  158:if_acmpne       171
			i = Math.max(j1, i);
	//   87  161:iload           9
	//   88  163:iload_1         
	//   89  164:invokestatic    #297 <Method int Math.max(int, int)>
	//   90  167:istore_1        
		else
	//*  91  168:goto            178
			i = Math.min(j1, i);
	//   92  171:iload           9
	//   93  173:iload_1         
	//   94  174:invokestatic    #300 <Method int Math.min(int, int)>
	//   95  177:istore_1        
		if(android.os.Build.VERSION.SDK_INT <= 23 && NO_DOWNSAMPLE_PRE_N_MIME_TYPES.contains(((Object) (options.outMimeType))))
	//*  96  178:getstatic       #199 <Field int android.os.Build$VERSION.SDK_INT>
	//*  97  181:bipush          23
	//*  98  183:icmpgt          207
	//*  99  186:getstatic       #115 <Field Set NO_DOWNSAMPLE_PRE_N_MIME_TYPES>
	//* 100  189:aload           6
	//* 101  191:getfield        #303 <Field String android.graphics.BitmapFactory$Options.outMimeType>
	//* 102  194:invokeinterface #309 <Method boolean Set.contains(Object)>
	//* 103  199:ifeq            207
		{
			i = 1;
	//  104  202:iconst_1        
	//  105  203:istore_1        
		} else
	//* 106  204:goto            246
		{
			int k1 = Math.max(1, Integer.highestOneBit(i));
	//  107  207:iconst_1        
	//  108  208:iload_1         
	//  109  209:invokestatic    #315 <Method int Integer.highestOneBit(int)>
	//  110  212:invokestatic    #297 <Method int Math.max(int, int)>
	//  111  215:istore          9
			i = k1;
	//  112  217:iload           9
	//  113  219:istore_1        
			if(downsamplestrategy == DownsampleStrategy.SampleSizeRounding.MEMORY)
	//* 114  220:aload_0         
	//* 115  221:getstatic       #291 <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.MEMORY>
	//* 116  224:if_acmpne       246
			{
				i = k1;
	//  117  227:iload           9
	//  118  229:istore_1        
				if((float)k1 < 1.0F / f)
	//* 119  230:iload           9
	//* 120  232:i2f             
	//* 121  233:fconst_1        
	//* 122  234:fload           7
	//* 123  236:fdiv            
	//* 124  237:fcmpg           
	//* 125  238:ifge            246
					i = k1 << 1;
	//  126  241:iload           9
	//  127  243:iconst_1        
	//  128  244:ishl            
	//  129  245:istore_1        
			}
		}
		float f1 = (float)i * f;
	//  130  246:iload_1         
	//  131  247:i2f             
	//  132  248:fload           7
	//  133  250:fmul            
	//  134  251:fstore          8
		options.inSampleSize = i;
	//  135  253:aload           6
	//  136  255:iload_1         
	//  137  256:putfield        #318 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//* 138  259:getstatic       #199 <Field int android.os.Build$VERSION.SDK_INT>
	//* 139  262:bipush          19
	//* 140  264:icmplt          291
		{
			options.inTargetDensity = (int)(1000F * f1 + 0.5F);
	//  141  267:aload           6
	//  142  269:ldc2            #319 <Float 1000F>
	//  143  272:fload           8
	//  144  274:fmul            
	//  145  275:ldc2            #285 <Float 0.5F>
	//  146  278:fadd            
	//  147  279:f2i             
	//  148  280:putfield        #322 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
			options.inDensity = 1000;
	//  149  283:aload           6
	//  150  285:sipush          1000
	//  151  288:putfield        #325 <Field int android.graphics.BitmapFactory$Options.inDensity>
		}
		if(isScaling(options))
	//* 152  291:aload           6
	//* 153  293:invokestatic    #329 <Method boolean isScaling(android.graphics.BitmapFactory$Options)>
	//* 154  296:ifeq            308
		{
			options.inScaled = true;
	//  155  299:aload           6
	//  156  301:iconst_1        
	//  157  302:putfield        #332 <Field boolean android.graphics.BitmapFactory$Options.inScaled>
		} else
	//* 158  305:goto            320
		{
			options.inTargetDensity = 0;
	//  159  308:aload           6
	//  160  310:iconst_0        
	//  161  311:putfield        #322 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
			options.inDensity = 0;
	//  162  314:aload           6
	//  163  316:iconst_0        
	//  164  317:putfield        #325 <Field int android.graphics.BitmapFactory$Options.inDensity>
		}
		if(Log.isLoggable("Downsampler", 2))
	//* 165  320:ldc1            #35  <String "Downsampler">
	//* 166  322:iconst_2        
	//* 167  323:invokestatic    #226 <Method boolean Log.isLoggable(String, int)>
	//* 168  326:ifeq            447
			Log.v("Downsampler", (new StringBuilder()).append("Calculate scaling, source: [").append(j).append("x").append(k).append("], target: [").append(l).append("x").append(i1).append("], exact scale factor: ").append(f).append(", power of 2 sample size: ").append(i).append(", adjusted scale factor: ").append(f1).append(", target density: ").append(options.inTargetDensity).append(", density: ").append(options.inDensity).toString());
	//  169  329:ldc1            #35  <String "Downsampler">
	//  170  331:new             #228 <Class StringBuilder>
	//  171  334:dup             
	//  172  335:invokespecial   #229 <Method void StringBuilder()>
	//  173  338:ldc2            #334 <String "Calculate scaling, source: [">
	//  174  341:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  175  344:iload_2         
	//  176  345:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  177  348:ldc2            #339 <String "x">
	//  178  351:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  179  354:iload_3         
	//  180  355:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  181  358:ldc2            #341 <String "], target: [">
	//  182  361:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  183  364:iload           4
	//  184  366:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  185  369:ldc2            #339 <String "x">
	//  186  372:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  187  375:iload           5
	//  188  377:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  189  380:ldc2            #343 <String "], exact scale factor: ">
	//  190  383:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  191  386:fload           7
	//  192  388:invokevirtual   #273 <Method StringBuilder StringBuilder.append(float)>
	//  193  391:ldc2            #345 <String ", power of 2 sample size: ">
	//  194  394:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  195  397:iload_1         
	//  196  398:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  197  401:ldc2            #347 <String ", adjusted scale factor: ">
	//  198  404:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  199  407:fload           8
	//  200  409:invokevirtual   #273 <Method StringBuilder StringBuilder.append(float)>
	//  201  412:ldc2            #349 <String ", target density: ">
	//  202  415:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  203  418:aload           6
	//  204  420:getfield        #322 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//  205  423:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  206  426:ldc2            #351 <String ", density: ">
	//  207  429:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  208  432:aload           6
	//  209  434:getfield        #325 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//  210  437:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  211  440:invokevirtual   #242 <Method String StringBuilder.toString()>
	//  212  443:invokestatic    #355 <Method int Log.v(String, String)>
	//  213  446:pop             
	//  214  447:return          
	}

	private Bitmap decodeFromWrappedStreams(InputStream inputstream, android.graphics.BitmapFactory.Options options, DownsampleStrategy downsamplestrategy, DecodeFormat decodeformat, boolean flag, int i, int j, 
			boolean flag1, DecodeCallbacks decodecallbacks)
		throws IOException
	{
		int ai[] = getDimensions(inputstream, options, decodecallbacks, bitmapPool);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload           9
	//    3    4:aload_0         
	//    4    5:getfield        #174 <Field BitmapPool bitmapPool>
	//    5    8:invokestatic    #361 <Method int[] getDimensions(InputStream, android.graphics.BitmapFactory$Options, Downsampler$DecodeCallbacks, BitmapPool)>
	//    6   11:astore          20
		int k1 = ai[0];
	//    7   13:aload           20
	//    8   15:iconst_0        
	//    9   16:iaload          
	//   10   17:istore          14
		int l1 = ai[1];
	//   11   19:aload           20
	//   12   21:iconst_1        
	//   13   22:iaload          
	//   14   23:istore          15
		String s = options.outMimeType;
	//   15   25:aload_2         
	//   16   26:getfield        #303 <Field String android.graphics.BitmapFactory$Options.outMimeType>
	//   17   29:astore          20
		int j2 = ImageHeaderParserUtils.getOrientation(parsers, inputstream, byteArrayPool);
	//   18   31:aload_0         
	//   19   32:getfield        #160 <Field List parsers>
	//   20   35:aload_1         
	//   21   36:aload_0         
	//   22   37:getfield        #178 <Field ArrayPool byteArrayPool>
	//   23   40:invokestatic    #365 <Method int ImageHeaderParserUtils.getOrientation(List, InputStream, ArrayPool)>
	//   24   43:istore          17
		int i1 = TransformationUtils.getExifOrientationDegrees(j2);
	//   25   45:iload           17
	//   26   47:invokestatic    #370 <Method int TransformationUtils.getExifOrientationDegrees(int)>
	//   27   50:istore          13
		boolean flag2 = TransformationUtils.isExifOrientationRequired(j2);
	//   28   52:iload           17
	//   29   54:invokestatic    #374 <Method boolean TransformationUtils.isExifOrientationRequired(int)>
	//   30   57:istore          19
		int k;
		if(i == 0x80000000)
	//*  31   59:iload           6
	//*  32   61:ldc2            #375 <Int 0x80000000>
	//*  33   64:icmpne          74
			k = k1;
	//   34   67:iload           14
	//   35   69:istore          11
		else
	//*  36   71:goto            78
			k = i;
	//   37   74:iload           6
	//   38   76:istore          11
		int l;
		if(j == 0x80000000)
	//*  39   78:iload           7
	//*  40   80:ldc2            #375 <Int 0x80000000>
	//*  41   83:icmpne          93
			l = l1;
	//   42   86:iload           15
	//   43   88:istore          12
		else
	//*  44   90:goto            97
			l = j;
	//   45   93:iload           7
	//   46   95:istore          12
		calculateScaling(downsamplestrategy, i1, k1, l1, k, l, options);
	//   47   97:aload_3         
	//   48   98:iload           13
	//   49  100:iload           14
	//   50  102:iload           15
	//   51  104:iload           11
	//   52  106:iload           12
	//   53  108:aload_2         
	//   54  109:invokestatic    #377 <Method void calculateScaling(DownsampleStrategy, int, int, int, int, int, android.graphics.BitmapFactory$Options)>
		calculateConfig(inputstream, decodeformat, flag, flag2, options, k, l);
	//   55  112:aload_0         
	//   56  113:aload_1         
	//   57  114:aload           4
	//   58  116:iload           5
	//   59  118:iload           19
	//   60  120:aload_2         
	//   61  121:iload           11
	//   62  123:iload           12
	//   63  125:invokespecial   #379 <Method void calculateConfig(InputStream, DecodeFormat, boolean, boolean, android.graphics.BitmapFactory$Options, int, int)>
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  64  128:getstatic       #199 <Field int android.os.Build$VERSION.SDK_INT>
	//*  65  131:bipush          19
	//*  66  133:icmplt          142
			i1 = 1;
	//   67  136:iconst_1        
	//   68  137:istore          13
		else
	//*  69  139:goto            145
			i1 = 0;
	//   70  142:iconst_0        
	//   71  143:istore          13
		if((options.inSampleSize == 1 || i1) && shouldUsePool(inputstream))
	//*  72  145:aload_2         
	//*  73  146:getfield        #318 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
	//*  74  149:iconst_1        
	//*  75  150:icmpeq          158
	//*  76  153:iload           13
	//*  77  155:ifeq            416
	//*  78  158:aload_0         
	//*  79  159:aload_1         
	//*  80  160:invokespecial   #383 <Method boolean shouldUsePool(InputStream)>
	//*  81  163:ifeq            416
		{
			if(!flag1 || !i1)
	//*  82  166:iload           8
	//*  83  168:ifeq            179
	//*  84  171:iload           13
	//*  85  173:ifeq            179
	//*  86  176:goto            394
			{
				float f;
				if(isScaling(options))
	//*  87  179:aload_2         
	//*  88  180:invokestatic    #329 <Method boolean isScaling(android.graphics.BitmapFactory$Options)>
	//*  89  183:ifeq            202
					f = (float)options.inTargetDensity / (float)options.inDensity;
	//   90  186:aload_2         
	//   91  187:getfield        #322 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//   92  190:i2f             
	//   93  191:aload_2         
	//   94  192:getfield        #325 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//   95  195:i2f             
	//   96  196:fdiv            
	//   97  197:fstore          10
				else
	//*  98  199:goto            205
					f = 1.0F;
	//   99  202:fconst_1        
	//  100  203:fstore          10
				int k2 = options.inSampleSize;
	//  101  205:aload_2         
	//  102  206:getfield        #318 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
	//  103  209:istore          18
				l = (int)Math.ceil((float)k1 / (float)k2);
	//  104  211:iload           14
	//  105  213:i2f             
	//  106  214:iload           18
	//  107  216:i2f             
	//  108  217:fdiv            
	//  109  218:f2d             
	//  110  219:invokestatic    #387 <Method double Math.ceil(double)>
	//  111  222:d2i             
	//  112  223:istore          12
				k = (int)Math.ceil((float)l1 / (float)k2);
	//  113  225:iload           15
	//  114  227:i2f             
	//  115  228:iload           18
	//  116  230:i2f             
	//  117  231:fdiv            
	//  118  232:f2d             
	//  119  233:invokestatic    #387 <Method double Math.ceil(double)>
	//  120  236:d2i             
	//  121  237:istore          11
				int j1 = Math.round((float)l * f);
	//  122  239:iload           12
	//  123  241:i2f             
	//  124  242:fload           10
	//  125  244:fmul            
	//  126  245:invokestatic    #391 <Method int Math.round(float)>
	//  127  248:istore          13
				int i2 = Math.round((float)k * f);
	//  128  250:iload           11
	//  129  252:i2f             
	//  130  253:fload           10
	//  131  255:fmul            
	//  132  256:invokestatic    #391 <Method int Math.round(float)>
	//  133  259:istore          16
				k = j1;
	//  134  261:iload           13
	//  135  263:istore          11
				l = i2;
	//  136  265:iload           16
	//  137  267:istore          12
				if(Log.isLoggable("Downsampler", 2))
	//* 138  269:ldc1            #35  <String "Downsampler">
	//* 139  271:iconst_2        
	//* 140  272:invokestatic    #226 <Method boolean Log.isLoggable(String, int)>
	//* 141  275:ifeq            394
				{
					Log.v("Downsampler", (new StringBuilder()).append("Calculated target [").append(j1).append("x").append(i2).append("] for source [").append(k1).append("x").append(l1).append("], sampleSize: ").append(k2).append(", targetDensity: ").append(options.inTargetDensity).append(", density: ").append(options.inDensity).append(", density multiplier: ").append(f).toString());
	//  142  278:ldc1            #35  <String "Downsampler">
	//  143  280:new             #228 <Class StringBuilder>
	//  144  283:dup             
	//  145  284:invokespecial   #229 <Method void StringBuilder()>
	//  146  287:ldc2            #393 <String "Calculated target [">
	//  147  290:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  148  293:iload           13
	//  149  295:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  150  298:ldc2            #339 <String "x">
	//  151  301:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  152  304:iload           16
	//  153  306:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  154  309:ldc2            #395 <String "] for source [">
	//  155  312:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  156  315:iload           14
	//  157  317:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  158  320:ldc2            #339 <String "x">
	//  159  323:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  160  326:iload           15
	//  161  328:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  162  331:ldc2            #397 <String "], sampleSize: ">
	//  163  334:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  164  337:iload           18
	//  165  339:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  166  342:ldc2            #399 <String ", targetDensity: ">
	//  167  345:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  168  348:aload_2         
	//  169  349:getfield        #322 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//  170  352:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  171  355:ldc2            #351 <String ", density: ">
	//  172  358:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  173  361:aload_2         
	//  174  362:getfield        #325 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//  175  365:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//  176  368:ldc2            #401 <String ", density multiplier: ">
	//  177  371:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//  178  374:fload           10
	//  179  376:invokevirtual   #273 <Method StringBuilder StringBuilder.append(float)>
	//  180  379:invokevirtual   #242 <Method String StringBuilder.toString()>
	//  181  382:invokestatic    #355 <Method int Log.v(String, String)>
	//  182  385:pop             
					l = i2;
	//  183  386:iload           16
	//  184  388:istore          12
					k = j1;
	//  185  390:iload           13
	//  186  392:istore          11
				}
			}
			if(k > 0 && l > 0)
	//* 187  394:iload           11
	//* 188  396:ifle            416
	//* 189  399:iload           12
	//* 190  401:ifle            416
				setInBitmap(options, bitmapPool, k, l);
	//  191  404:aload_2         
	//  192  405:aload_0         
	//  193  406:getfield        #174 <Field BitmapPool bitmapPool>
	//  194  409:iload           11
	//  195  411:iload           12
	//  196  413:invokestatic    #405 <Method void setInBitmap(android.graphics.BitmapFactory$Options, BitmapPool, int, int)>
		}
		downsamplestrategy = ((DownsampleStrategy) (decodeStream(inputstream, options, decodecallbacks, bitmapPool)));
	//  197  416:aload_1         
	//  198  417:aload_2         
	//  199  418:aload           9
	//  200  420:aload_0         
	//  201  421:getfield        #174 <Field BitmapPool bitmapPool>
	//  202  424:invokestatic    #409 <Method Bitmap decodeStream(InputStream, android.graphics.BitmapFactory$Options, Downsampler$DecodeCallbacks, BitmapPool)>
	//  203  427:astore_3        
		decodecallbacks.onDecodeComplete(bitmapPool, ((Bitmap) (downsamplestrategy)));
	//  204  428:aload           9
	//  205  430:aload_0         
	//  206  431:getfield        #174 <Field BitmapPool bitmapPool>
	//  207  434:aload_3         
	//  208  435:invokeinterface #413 <Method void Downsampler$DecodeCallbacks.onDecodeComplete(BitmapPool, Bitmap)>
		if(Log.isLoggable("Downsampler", 2))
	//* 209  440:ldc1            #35  <String "Downsampler">
	//* 210  442:iconst_2        
	//* 211  443:invokestatic    #226 <Method boolean Log.isLoggable(String, int)>
	//* 212  446:ifeq            464
			logDecode(k1, l1, s, options, ((Bitmap) (downsamplestrategy)), i, j);
	//  213  449:iload           14
	//  214  451:iload           15
	//  215  453:aload           20
	//  216  455:aload_2         
	//  217  456:aload_3         
	//  218  457:iload           6
	//  219  459:iload           7
	//  220  461:invokestatic    #417 <Method void logDecode(int, int, String, android.graphics.BitmapFactory$Options, Bitmap, int, int)>
		inputstream = null;
	//  221  464:aconst_null     
	//  222  465:astore_1        
		if(downsamplestrategy != null)
	//* 223  466:aload_3         
	//* 224  467:ifnull          514
		{
			((Bitmap) (downsamplestrategy)).setDensity(displayMetrics.densityDpi);
	//  225  470:aload_3         
	//  226  471:aload_0         
	//  227  472:getfield        #170 <Field DisplayMetrics displayMetrics>
	//  228  475:getfield        #420 <Field int DisplayMetrics.densityDpi>
	//  229  478:invokevirtual   #426 <Method void Bitmap.setDensity(int)>
			options = ((android.graphics.BitmapFactory.Options) (TransformationUtils.rotateImageExif(bitmapPool, ((Bitmap) (downsamplestrategy)), j2)));
	//  230  481:aload_0         
	//  231  482:getfield        #174 <Field BitmapPool bitmapPool>
	//  232  485:aload_3         
	//  233  486:iload           17
	//  234  488:invokestatic    #430 <Method Bitmap TransformationUtils.rotateImageExif(BitmapPool, Bitmap, int)>
	//  235  491:astore_2        
			inputstream = ((InputStream) (options));
	//  236  492:aload_2         
	//  237  493:astore_1        
			if(!((Object) (downsamplestrategy)).equals(((Object) (options))))
	//* 238  494:aload_3         
	//* 239  495:aload_2         
	//* 240  496:invokevirtual   #433 <Method boolean Object.equals(Object)>
	//* 241  499:ifne            514
			{
				bitmapPool.put(((Bitmap) (downsamplestrategy)));
	//  242  502:aload_0         
	//  243  503:getfield        #174 <Field BitmapPool bitmapPool>
	//  244  506:aload_3         
	//  245  507:invokeinterface #437 <Method void BitmapPool.put(Bitmap)>
				inputstream = ((InputStream) (options));
	//  246  512:aload_2         
	//  247  513:astore_1        
			}
		}
		return ((Bitmap) (inputstream));
	//  248  514:aload_1         
	//  249  515:areturn         
	}

	private static Bitmap decodeStream(InputStream inputstream, android.graphics.BitmapFactory.Options options, DecodeCallbacks decodecallbacks, BitmapPool bitmappool)
		throws IOException
	{
		int i;
		int j;
		Object obj;
		if(options.inJustDecodeBounds)
	//*   0    0:aload_1         
	//*   1    1:getfield        #440 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
	//*   2    4:ifeq            16
			inputstream.mark(0x500000);
	//    3    7:aload_0         
	//    4    8:ldc1            #26  <Int 0x500000>
	//    5   10:invokevirtual   #445 <Method void InputStream.mark(int)>
		else
	//*   6   13:goto            22
			decodecallbacks.onObtainBounds();
	//    7   16:aload_2         
	//    8   17:invokeinterface #448 <Method void Downsampler$DecodeCallbacks.onObtainBounds()>
		i = options.outWidth;
	//    9   22:aload_1         
	//   10   23:getfield        #451 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   11   26:istore          4
		j = options.outHeight;
	//   12   28:aload_1         
	//   13   29:getfield        #454 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   14   32:istore          5
		obj = ((Object) (options.outMimeType));
	//   15   34:aload_1         
	//   16   35:getfield        #303 <Field String android.graphics.BitmapFactory$Options.outMimeType>
	//   17   38:astore          6
		TransformationUtils.getBitmapDrawableLock().lock();
	//   18   40:invokestatic    #458 <Method Lock TransformationUtils.getBitmapDrawableLock()>
	//   19   43:invokeinterface #463 <Method void Lock.lock()>
		Object obj1 = ((Object) (BitmapFactory.decodeStream(inputstream, ((android.graphics.Rect) (null)), options)));
	//   20   48:aload_0         
	//   21   49:aconst_null     
	//   22   50:aload_1         
	//   23   51:invokestatic    #468 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   24   54:astore          7
		TransformationUtils.getBitmapDrawableLock().unlock();
	//   25   56:invokestatic    #458 <Method Lock TransformationUtils.getBitmapDrawableLock()>
	//   26   59:invokeinterface #471 <Method void Lock.unlock()>
		break MISSING_BLOCK_LABEL_169;
	//   27   64:goto            169
		obj1;
	//   28   67:astore          7
		obj = ((Object) (newIoExceptionForInBitmapAssertion(((IllegalArgumentException) (obj1)), i, j, ((String) (obj)), options)));
	//   29   69:aload           7
	//   30   71:iload           4
	//   31   73:iload           5
	//   32   75:aload           6
	//   33   77:aload_1         
	//   34   78:invokestatic    #475 <Method IOException newIoExceptionForInBitmapAssertion(IllegalArgumentException, int, int, String, android.graphics.BitmapFactory$Options)>
	//   35   81:astore          6
		if(Log.isLoggable("Downsampler", 3))
	//*  36   83:ldc1            #35  <String "Downsampler">
	//*  37   85:iconst_3        
	//*  38   86:invokestatic    #226 <Method boolean Log.isLoggable(String, int)>
	//*  39   89:ifeq            103
			Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", ((Throwable) (obj)));
	//   40   92:ldc1            #35  <String "Downsampler">
	//   41   94:ldc2            #477 <String "Failed to decode with inBitmap, trying again without Bitmap re-use">
	//   42   97:aload           6
	//   43   99:invokestatic    #246 <Method int Log.d(String, String, Throwable)>
	//   44  102:pop             
		obj1 = ((Object) (options.inBitmap));
	//   45  103:aload_1         
	//   46  104:getfield        #481 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
	//   47  107:astore          7
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_155;
	//   48  109:aload           7
	//   49  111:ifnull          155
		inputstream.reset();
	//   50  114:aload_0         
	//   51  115:invokevirtual   #484 <Method void InputStream.reset()>
		bitmappool.put(options.inBitmap);
	//   52  118:aload_3         
	//   53  119:aload_1         
	//   54  120:getfield        #481 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
	//   55  123:invokeinterface #437 <Method void BitmapPool.put(Bitmap)>
		options.inBitmap = null;
	//   56  128:aload_1         
	//   57  129:aconst_null     
	//   58  130:putfield        #481 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
		inputstream = ((InputStream) (decodeStream(inputstream, options, decodecallbacks, bitmappool)));
	//   59  133:aload_0         
	//   60  134:aload_1         
	//   61  135:aload_2         
	//   62  136:aload_3         
	//   63  137:invokestatic    #409 <Method Bitmap decodeStream(InputStream, android.graphics.BitmapFactory$Options, Downsampler$DecodeCallbacks, BitmapPool)>
	//   64  140:astore_0        
		TransformationUtils.getBitmapDrawableLock().unlock();
	//   65  141:invokestatic    #458 <Method Lock TransformationUtils.getBitmapDrawableLock()>
	//   66  144:invokeinterface #471 <Method void Lock.unlock()>
		return ((Bitmap) (inputstream));
	//   67  149:aload_0         
	//   68  150:areturn         
		inputstream;
	//   69  151:astore_0        
		throw obj;
	//   70  152:aload           6
	//   71  154:athrow          
		throw obj;
	//   72  155:aload           6
	//   73  157:athrow          
		inputstream;
	//   74  158:astore_0        
		TransformationUtils.getBitmapDrawableLock().unlock();
	//   75  159:invokestatic    #458 <Method Lock TransformationUtils.getBitmapDrawableLock()>
	//   76  162:invokeinterface #471 <Method void Lock.unlock()>
		throw inputstream;
	//   77  167:aload_0         
	//   78  168:athrow          
		if(options.inJustDecodeBounds)
	//*  79  169:aload_1         
	//*  80  170:getfield        #440 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
	//*  81  173:ifeq            180
			inputstream.reset();
	//   82  176:aload_0         
	//   83  177:invokevirtual   #484 <Method void InputStream.reset()>
		return ((Bitmap) (obj1));
	//   84  180:aload           7
	//   85  182:areturn         
	}

	private static String getBitmapString(Bitmap bitmap)
	{
		if(bitmap == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		String s;
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   4    6:getstatic       #199 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5    9:bipush          19
	//*   6   11:icmplt          47
			s = (new StringBuilder()).append(" (").append(bitmap.getAllocationByteCount()).append(")").toString();
	//    7   14:new             #228 <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #229 <Method void StringBuilder()>
	//   10   21:ldc2            #492 <String " (">
	//   11   24:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:aload_0         
	//   13   28:invokevirtual   #496 <Method int Bitmap.getAllocationByteCount()>
	//   14   31:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//   15   34:ldc2            #498 <String ")">
	//   16   37:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   17   40:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   18   43:astore_1        
		else
	//*  19   44:goto            51
			s = "";
	//   20   47:ldc2            #500 <String "">
	//   21   50:astore_1        
		return (new StringBuilder()).append("[").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).append("] ").append(((Object) (bitmap.getConfig()))).append(s).toString();
	//   22   51:new             #228 <Class StringBuilder>
	//   23   54:dup             
	//   24   55:invokespecial   #229 <Method void StringBuilder()>
	//   25   58:ldc2            #502 <String "[">
	//   26   61:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   27   64:aload_0         
	//   28   65:invokevirtual   #505 <Method int Bitmap.getWidth()>
	//   29   68:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//   30   71:ldc2            #339 <String "x">
	//   31   74:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   32   77:aload_0         
	//   33   78:invokevirtual   #508 <Method int Bitmap.getHeight()>
	//   34   81:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//   35   84:ldc2            #510 <String "] ">
	//   36   87:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   37   90:aload_0         
	//   38   91:invokevirtual   #514 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   39   94:invokevirtual   #238 <Method StringBuilder StringBuilder.append(Object)>
	//   40   97:aload_1         
	//   41   98:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   42  101:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   43  104:areturn         
	}

	private static android.graphics.BitmapFactory.Options getDefaultOptions()
	{
		com/bumptech/glide/load/resource/bitmap/Downsampler;
	//    0    0:ldc1            #2   <Class Downsampler>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj = ((Object) (OPTIONS_QUEUE));
	//    2    3:getstatic       #147 <Field Queue OPTIONS_QUEUE>
	//    3    6:astore_0        
		obj;
	//    4    7:aload_0         
		JVM INSTR monitorenter ;
	//    5    8:monitorenter    
		Object obj1 = ((Object) ((android.graphics.BitmapFactory.Options)OPTIONS_QUEUE.poll()));
	//    6    9:getstatic       #147 <Field Queue OPTIONS_QUEUE>
	//    7   12:invokeinterface #523 <Method Object Queue.poll()>
	//    8   17:checkcast       #207 <Class android.graphics.BitmapFactory$Options>
	//    9   20:astore_1        
		obj;
	//   10   21:aload_0         
		JVM INSTR monitorexit ;
	//   11   22:monitorexit     
		  goto _L1
	//*  12   23:goto            31
		obj1;
	//   13   26:astore_1        
	//*  14   27:aload_0         
		throw obj1;
	//   15   28:monitorexit     
	//   16   29:aload_1         
	//   17   30:athrow          
_L1:
		obj = obj1;
	//   18   31:aload_1         
	//   19   32:astore_0        
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_49;
	//   20   33:aload_1         
	//   21   34:ifnonnull       49
		obj = ((Object) (new android.graphics.BitmapFactory.Options()));
	//   22   37:new             #207 <Class android.graphics.BitmapFactory$Options>
	//   23   40:dup             
	//   24   41:invokespecial   #524 <Method void android.graphics.BitmapFactory$Options()>
	//   25   44:astore_0        
		resetOptions(((android.graphics.BitmapFactory.Options) (obj)));
	//   26   45:aload_0         
	//   27   46:invokestatic    #528 <Method void resetOptions(android.graphics.BitmapFactory$Options)>
		com/bumptech/glide/load/resource/bitmap/Downsampler;
	//   28   49:ldc1            #2   <Class Downsampler>
		JVM INSTR monitorexit ;
	//   29   51:monitorexit     
		return ((android.graphics.BitmapFactory.Options) (obj));
	//   30   52:aload_0         
	//   31   53:areturn         
		Exception exception;
		exception;
	//   32   54:astore_0        
	//*  33   55:ldc1            #2   <Class Downsampler>
		throw exception;
	//   34   57:monitorexit     
	//   35   58:aload_0         
	//   36   59:athrow          
	}

	private static int[] getDimensions(InputStream inputstream, android.graphics.BitmapFactory.Options options, DecodeCallbacks decodecallbacks, BitmapPool bitmappool)
		throws IOException
	{
		options.inJustDecodeBounds = true;
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:putfield        #440 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		decodeStream(inputstream, options, decodecallbacks, bitmappool);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokestatic    #409 <Method Bitmap decodeStream(InputStream, android.graphics.BitmapFactory$Options, Downsampler$DecodeCallbacks, BitmapPool)>
	//    8   12:pop             
		options.inJustDecodeBounds = false;
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:putfield        #440 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		return (new int[] {
			options.outWidth, options.outHeight
		});
	//   12   18:iconst_2        
	//   13   19:newarray        int[]
	//   14   21:dup             
	//   15   22:iconst_0        
	//   16   23:aload_1         
	//   17   24:getfield        #451 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   18   27:iastore         
	//   19   28:dup             
	//   20   29:iconst_1        
	//   21   30:aload_1         
	//   22   31:getfield        #454 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   23   34:iastore         
	//   24   35:areturn         
	}

	private static String getInBitmapString(android.graphics.BitmapFactory.Options options)
	{
		return getBitmapString(options.inBitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #481 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
	//    2    4:invokestatic    #532 <Method String getBitmapString(Bitmap)>
	//    3    7:areturn         
	}

	private static boolean isScaling(android.graphics.BitmapFactory.Options options)
	{
		return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//    2    4:ifle            27
	//    3    7:aload_0         
	//    4    8:getfield        #325 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//    5   11:ifle            27
	//    6   14:aload_0         
	//    7   15:getfield        #322 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//    8   18:aload_0         
	//    9   19:getfield        #325 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//   10   22:icmpeq          27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	private static void logDecode(int i, int j, String s, android.graphics.BitmapFactory.Options options, Bitmap bitmap, int k, int l)
	{
		Log.v("Downsampler", (new StringBuilder()).append("Decoded ").append(getBitmapString(bitmap)).append(" from [").append(i).append("x").append(j).append("] ").append(s).append(" with inBitmap ").append(getInBitmapString(options)).append(" for [").append(k).append("x").append(l).append("], sample size: ").append(options.inSampleSize).append(", density: ").append(options.inDensity).append(", target density: ").append(options.inTargetDensity).append(", thread: ").append(Thread.currentThread().getName()).toString());
	//    0    0:ldc1            #35  <String "Downsampler">
	//    1    2:new             #228 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #229 <Method void StringBuilder()>
	//    4    9:ldc2            #534 <String "Decoded ">
	//    5   12:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload           4
	//    7   17:invokestatic    #532 <Method String getBitmapString(Bitmap)>
	//    8   20:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:ldc2            #536 <String " from [">
	//   10   26:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   11   29:iload_0         
	//   12   30:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//   13   33:ldc2            #339 <String "x">
	//   14   36:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   15   39:iload_1         
	//   16   40:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//   17   43:ldc2            #510 <String "] ">
	//   18   46:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   19   49:aload_2         
	//   20   50:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   21   53:ldc2            #538 <String " with inBitmap ">
	//   22   56:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   23   59:aload_3         
	//   24   60:invokestatic    #540 <Method String getInBitmapString(android.graphics.BitmapFactory$Options)>
	//   25   63:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   26   66:ldc2            #542 <String " for [">
	//   27   69:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   28   72:iload           5
	//   29   74:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//   30   77:ldc2            #339 <String "x">
	//   31   80:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   32   83:iload           6
	//   33   85:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//   34   88:ldc2            #544 <String "], sample size: ">
	//   35   91:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   36   94:aload_3         
	//   37   95:getfield        #318 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
	//   38   98:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//   39  101:ldc2            #351 <String ", density: ">
	//   40  104:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   41  107:aload_3         
	//   42  108:getfield        #325 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//   43  111:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//   44  114:ldc2            #349 <String ", target density: ">
	//   45  117:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   46  120:aload_3         
	//   47  121:getfield        #322 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//   48  124:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//   49  127:ldc2            #546 <String ", thread: ">
	//   50  130:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   51  133:invokestatic    #552 <Method Thread Thread.currentThread()>
	//   52  136:invokevirtual   #555 <Method String Thread.getName()>
	//   53  139:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   54  142:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   55  145:invokestatic    #355 <Method int Log.v(String, String)>
	//   56  148:pop             
	//   57  149:return          
	}

	private static IOException newIoExceptionForInBitmapAssertion(IllegalArgumentException illegalargumentexception, int i, int j, String s, android.graphics.BitmapFactory.Options options)
	{
		return new IOException((new StringBuilder()).append("Exception decoding bitmap, outWidth: ").append(i).append(", outHeight: ").append(j).append(", outMimeType: ").append(s).append(", inBitmap: ").append(getInBitmapString(options)).toString(), ((Throwable) (illegalargumentexception)));
	//    0    0:new             #184 <Class IOException>
	//    1    3:dup             
	//    2    4:new             #228 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #229 <Method void StringBuilder()>
	//    5   11:ldc2            #557 <String "Exception decoding bitmap, outWidth: ">
	//    6   14:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:iload_1         
	//    8   18:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//    9   21:ldc2            #559 <String ", outHeight: ">
	//   10   24:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:iload_2         
	//   12   28:invokevirtual   #337 <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc2            #561 <String ", outMimeType: ">
	//   14   34:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   15   37:aload_3         
	//   16   38:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:ldc2            #563 <String ", inBitmap: ">
	//   18   44:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   19   47:aload           4
	//   20   49:invokestatic    #540 <Method String getInBitmapString(android.graphics.BitmapFactory$Options)>
	//   21   52:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   22   55:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   23   58:aload_0         
	//   24   59:invokespecial   #566 <Method void IOException(String, Throwable)>
	//   25   62:areturn         
	}

	private static void releaseOptions(android.graphics.BitmapFactory.Options options)
	{
		resetOptions(options);
	//    0    0:aload_0         
	//    1    1:invokestatic    #528 <Method void resetOptions(android.graphics.BitmapFactory$Options)>
		Queue queue = OPTIONS_QUEUE;
	//    2    4:getstatic       #147 <Field Queue OPTIONS_QUEUE>
	//    3    7:astore_1        
		queue;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		OPTIONS_QUEUE.offer(((Object) (options)));
	//    6   10:getstatic       #147 <Field Queue OPTIONS_QUEUE>
	//    7   13:aload_0         
	//    8   14:invokeinterface #570 <Method boolean Queue.offer(Object)>
	//    9   19:pop             
		queue;
	//   10   20:aload_1         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		options;
	//   13   23:astore_0        
	//*  14   24:aload_1         
		throw options;
	//   15   25:monitorexit     
	//   16   26:aload_0         
	//   17   27:athrow          
	}

	private static void resetOptions(android.graphics.BitmapFactory.Options options)
	{
		options.inTempStorage = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #574 <Field byte[] android.graphics.BitmapFactory$Options.inTempStorage>
		options.inDither = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #259 <Field boolean android.graphics.BitmapFactory$Options.inDither>
		options.inScaled = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #332 <Field boolean android.graphics.BitmapFactory$Options.inScaled>
		options.inSampleSize = 1;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #318 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		options.inPreferredConfig = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #210 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
		options.inJustDecodeBounds = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #440 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		options.inDensity = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #325 <Field int android.graphics.BitmapFactory$Options.inDensity>
		options.inTargetDensity = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #322 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
		options.outWidth = 0;
	//   24   40:aload_0         
	//   25   41:iconst_0        
	//   26   42:putfield        #451 <Field int android.graphics.BitmapFactory$Options.outWidth>
		options.outHeight = 0;
	//   27   45:aload_0         
	//   28   46:iconst_0        
	//   29   47:putfield        #454 <Field int android.graphics.BitmapFactory$Options.outHeight>
		options.outMimeType = null;
	//   30   50:aload_0         
	//   31   51:aconst_null     
	//   32   52:putfield        #303 <Field String android.graphics.BitmapFactory$Options.outMimeType>
		options.inBitmap = null;
	//   33   55:aload_0         
	//   34   56:aconst_null     
	//   35   57:putfield        #481 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
		options.inMutable = true;
	//   36   60:aload_0         
	//   37   61:iconst_1        
	//   38   62:putfield        #577 <Field boolean android.graphics.BitmapFactory$Options.inMutable>
	//   39   65:return          
	}

	private static void setInBitmap(android.graphics.BitmapFactory.Options options, BitmapPool bitmappool, int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26 && options.inPreferredConfig == android.graphics.Bitmap.Config.HARDWARE)
	//*   0    0:getstatic       #199 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          19
	//*   3    8:aload_0         
	//*   4    9:getfield        #210 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
	//*   5   12:getstatic       #581 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.HARDWARE>
	//*   6   15:if_acmpne       19
		{
			return;
	//    7   18:return          
		} else
		{
			options.inBitmap = bitmappool.getDirty(i, j, options.inPreferredConfig);
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:iload_2         
	//   11   22:iload_3         
	//   12   23:aload_0         
	//   13   24:getfield        #210 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
	//   14   27:invokeinterface #585 <Method Bitmap BitmapPool.getDirty(int, int, android.graphics.Bitmap$Config)>
	//   15   32:putfield        #481 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
			return;
	//   16   35:return          
		}
	}

	private boolean shouldUsePool(InputStream inputstream)
		throws IOException
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #199 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          10
			return true;
	//    3    8:iconst_1        
	//    4    9:ireturn         
		boolean flag;
		try
		{
			inputstream = ((InputStream) (ImageHeaderParserUtils.getType(parsers, inputstream, byteArrayPool)));
	//    5   10:aload_0         
	//    6   11:getfield        #160 <Field List parsers>
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:getfield        #178 <Field ArrayPool byteArrayPool>
	//   10   19:invokestatic    #216 <Method com.bumptech.glide.load.ImageHeaderParser$ImageType ImageHeaderParserUtils.getType(List, InputStream, ArrayPool)>
	//   11   22:astore_1        
			flag = TYPES_THAT_USE_POOL_PRE_KITKAT.contains(((Object) (inputstream)));
	//   12   23:getstatic       #139 <Field Set TYPES_THAT_USE_POOL_PRE_KITKAT>
	//   13   26:aload_1         
	//   14   27:invokeinterface #309 <Method boolean Set.contains(Object)>
	//   15   32:istore_2        
		}
	//*  16   33:iload_2         
	//*  17   34:ireturn         
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  18   35:astore_1        
		{
			if(Log.isLoggable("Downsampler", 3))
	//*  19   36:ldc1            #35  <String "Downsampler">
	//*  20   38:iconst_3        
	//*  21   39:invokestatic    #226 <Method boolean Log.isLoggable(String, int)>
	//*  22   42:ifeq            55
				Log.d("Downsampler", "Cannot determine the image type from header", ((Throwable) (inputstream)));
	//   23   45:ldc1            #35  <String "Downsampler">
	//   24   47:ldc2            #587 <String "Cannot determine the image type from header">
	//   25   50:aload_1         
	//   26   51:invokestatic    #246 <Method int Log.d(String, String, Throwable)>
	//   27   54:pop             
			return false;
	//   28   55:iconst_0        
	//   29   56:ireturn         
		}
		return flag;
	}

	public Resource decode(InputStream inputstream, int i, int j, Options options)
		throws IOException
	{
		return decode(inputstream, i, j, options, EMPTY_CALLBACKS);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #119 <Field Downsampler$DecodeCallbacks EMPTY_CALLBACKS>
	//    6    9:invokevirtual   #592 <Method Resource decode(InputStream, int, int, Options, Downsampler$DecodeCallbacks)>
	//    7   12:areturn         
	}

	public Resource decode(InputStream inputstream, int i, int j, Options options, DecodeCallbacks decodecallbacks)
		throws IOException
	{
		boolean flag;
		boolean flag1;
		byte abyte0[];
		android.graphics.BitmapFactory.Options options1;
		DecodeFormat decodeformat;
		DownsampleStrategy downsamplestrategy;
		Preconditions.checkArgument(inputstream.markSupported(), "You must provide an InputStream that supports mark()");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #596 <Method boolean InputStream.markSupported()>
	//    2    4:ldc2            #598 <String "You must provide an InputStream that supports mark()">
	//    3    7:invokestatic    #602 <Method void Preconditions.checkArgument(boolean, String)>
		abyte0 = (byte[])byteArrayPool.get(0x10000, [B);
	//    4   10:aload_0         
	//    5   11:getfield        #178 <Field ArrayPool byteArrayPool>
	//    6   14:ldc2            #603 <Int 0x10000>
	//    7   17:ldc2            #604 <Class byte[]>
	//    8   20:invokeinterface #608 <Method Object ArrayPool.get(int, Class)>
	//    9   25:checkcast       #604 <Class byte[]>
	//   10   28:astore          8
		options1 = getDefaultOptions();
	//   11   30:invokestatic    #610 <Method android.graphics.BitmapFactory$Options getDefaultOptions()>
	//   12   33:astore          9
		options1.inTempStorage = abyte0;
	//   13   35:aload           9
	//   14   37:aload           8
	//   15   39:putfield        #574 <Field byte[] android.graphics.BitmapFactory$Options.inTempStorage>
		decodeformat = (DecodeFormat)options.get(DECODE_FORMAT);
	//   16   42:aload           4
	//   17   44:getstatic       #69  <Field Option DECODE_FORMAT>
	//   18   47:invokevirtual   #615 <Method Object Options.get(Option)>
	//   19   50:checkcast       #57  <Class DecodeFormat>
	//   20   53:astore          10
		downsamplestrategy = (DownsampleStrategy)options.get(DOWNSAMPLE_STRATEGY);
	//   21   55:aload           4
	//   22   57:getstatic       #79  <Field Option DOWNSAMPLE_STRATEGY>
	//   23   60:invokevirtual   #615 <Method Object Options.get(Option)>
	//   24   63:checkcast       #73  <Class DownsampleStrategy>
	//   25   66:astore          11
		flag1 = ((Boolean)options.get(FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS)).booleanValue();
	//   26   68:aload           4
	//   27   70:getstatic       #89  <Field Option FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS>
	//   28   73:invokevirtual   #615 <Method Object Options.get(Option)>
	//   29   76:checkcast       #83  <Class Boolean>
	//   30   79:invokevirtual   #618 <Method boolean Boolean.booleanValue()>
	//   31   82:istore          7
		if(options.get(ALLOW_HARDWARE_CONFIG) != null && ((Boolean)options.get(ALLOW_HARDWARE_CONFIG)).booleanValue())
	//*  32   84:aload           4
	//*  33   86:getstatic       #93  <Field Option ALLOW_HARDWARE_CONFIG>
	//*  34   89:invokevirtual   #615 <Method Object Options.get(Option)>
	//*  35   92:ifnull          118
	//*  36   95:aload           4
	//*  37   97:getstatic       #93  <Field Option ALLOW_HARDWARE_CONFIG>
	//*  38  100:invokevirtual   #615 <Method Object Options.get(Option)>
	//*  39  103:checkcast       #83  <Class Boolean>
	//*  40  106:invokevirtual   #618 <Method boolean Boolean.booleanValue()>
	//*  41  109:ifeq            118
			flag = true;
	//   42  112:iconst_1        
	//   43  113:istore          6
		else
	//*  44  115:goto            121
			flag = false;
	//   45  118:iconst_0        
	//   46  119:istore          6
		if(decodeformat == DecodeFormat.PREFER_ARGB_8888_DISALLOW_HARDWARE)
	//*  47  121:aload           10
	//*  48  123:getstatic       #194 <Field DecodeFormat DecodeFormat.PREFER_ARGB_8888_DISALLOW_HARDWARE>
	//*  49  126:if_acmpne       132
			flag = false;
	//   50  129:iconst_0        
	//   51  130:istore          6
		inputstream = ((InputStream) (BitmapResource.obtain(decodeFromWrappedStreams(inputstream, options1, downsamplestrategy, decodeformat, flag, i, j, flag1, decodecallbacks), bitmapPool)));
	//   52  132:aload_0         
	//   53  133:aload_1         
	//   54  134:aload           9
	//   55  136:aload           11
	//   56  138:aload           10
	//   57  140:iload           6
	//   58  142:iload_2         
	//   59  143:iload_3         
	//   60  144:iload           7
	//   61  146:aload           5
	//   62  148:invokespecial   #620 <Method Bitmap decodeFromWrappedStreams(InputStream, android.graphics.BitmapFactory$Options, DownsampleStrategy, DecodeFormat, boolean, int, int, boolean, Downsampler$DecodeCallbacks)>
	//   63  151:aload_0         
	//   64  152:getfield        #174 <Field BitmapPool bitmapPool>
	//   65  155:invokestatic    #626 <Method BitmapResource BitmapResource.obtain(Bitmap, BitmapPool)>
	//   66  158:astore_1        
		releaseOptions(options1);
	//   67  159:aload           9
	//   68  161:invokestatic    #628 <Method void releaseOptions(android.graphics.BitmapFactory$Options)>
		byteArrayPool.put(((Object) (abyte0)), [B);
	//   69  164:aload_0         
	//   70  165:getfield        #178 <Field ArrayPool byteArrayPool>
	//   71  168:aload           8
	//   72  170:ldc2            #604 <Class byte[]>
	//   73  173:invokeinterface #631 <Method void ArrayPool.put(Object, Class)>
		return ((Resource) (inputstream));
	//   74  178:aload_1         
	//   75  179:areturn         
		inputstream;
	//   76  180:astore_1        
		releaseOptions(options1);
	//   77  181:aload           9
	//   78  183:invokestatic    #628 <Method void releaseOptions(android.graphics.BitmapFactory$Options)>
		byteArrayPool.put(((Object) (abyte0)), [B);
	//   79  186:aload_0         
	//   80  187:getfield        #178 <Field ArrayPool byteArrayPool>
	//   81  190:aload           8
	//   82  192:ldc2            #604 <Class byte[]>
	//   83  195:invokeinterface #631 <Method void ArrayPool.put(Object, Class)>
		throw inputstream;
	//   84  200:aload_1         
	//   85  201:athrow          
	}

	public boolean handles(InputStream inputstream)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean handles(ByteBuffer bytebuffer)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static final Option ALLOW_HARDWARE_CONFIG = Option.memory("com.bumtpech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", ((Object) (null)));
	public static final Option DECODE_FORMAT;
	public static final Option DOWNSAMPLE_STRATEGY;
	private static final DecodeCallbacks EMPTY_CALLBACKS = new DecodeCallbacks() {

		public void onDecodeComplete(BitmapPool bitmappool, Bitmap bitmap)
			throws IOException
		{
		//    0    0:return          
		}

		public void onObtainBounds()
		{
		//    0    0:return          
		}

	}
;
	public static final Option FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", ((Object) (Boolean.valueOf(false))));
	private static final String ICO_MIME_TYPE = "image/x-ico";
	private static final int MARK_POSITION = 0x500000;
	private static final Set NO_DOWNSAMPLE_PRE_N_MIME_TYPES = Collections.unmodifiableSet(((Set) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"image/vnd.wap.wbmp", "image/x-ico"
	})))))))));
	private static final Queue OPTIONS_QUEUE = Util.createQueue(0);
	static final String TAG = "Downsampler";
	private static final Set TYPES_THAT_USE_POOL_PRE_KITKAT;
	private static final String WBMP_MIME_TYPE = "image/vnd.wap.wbmp";
	private final BitmapPool bitmapPool;
	private final ArrayPool byteArrayPool;
	private final DisplayMetrics displayMetrics;
	private final HardwareConfigState hardwareConfigState = HardwareConfigState.getInstance();
	private final List parsers;

	static 
	{
		DECODE_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", ((Object) (DecodeFormat.DEFAULT)));
	//    0    0:ldc1            #55  <String "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat">
	//    1    2:getstatic       #61  <Field DecodeFormat DecodeFormat.DEFAULT>
	//    2    5:invokestatic    #67  <Method Option Option.memory(String, Object)>
	//    3    8:putstatic       #69  <Field Option DECODE_FORMAT>
		DOWNSAMPLE_STRATEGY = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", ((Object) (DownsampleStrategy.AT_LEAST)));
	//    4   11:ldc1            #71  <String "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy">
	//    5   13:getstatic       #77  <Field DownsampleStrategy DownsampleStrategy.AT_LEAST>
	//    6   16:invokestatic    #67  <Method Option Option.memory(String, Object)>
	//    7   19:putstatic       #79  <Field Option DOWNSAMPLE_STRATEGY>
	//    8   22:ldc1            #81  <String "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize">
	//    9   24:iconst_0        
	//   10   25:invokestatic    #87  <Method Boolean Boolean.valueOf(boolean)>
	//   11   28:invokestatic    #67  <Method Option Option.memory(String, Object)>
	//   12   31:putstatic       #89  <Field Option FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS>
	//   13   34:ldc1            #91  <String "com.bumtpech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode">
	//   14   36:aconst_null     
	//   15   37:invokestatic    #67  <Method Option Option.memory(String, Object)>
	//   16   40:putstatic       #93  <Field Option ALLOW_HARDWARE_CONFIG>
	//   17   43:new             #95  <Class HashSet>
	//   18   46:dup             
	//   19   47:iconst_2        
	//   20   48:anewarray       String[]
	//   21   51:dup             
	//   22   52:iconst_0        
	//   23   53:ldc1            #40  <String "image/vnd.wap.wbmp">
	//   24   55:aastore         
	//   25   56:dup             
	//   26   57:iconst_1        
	//   27   58:ldc1            #23  <String "image/x-ico">
	//   28   60:aastore         
	//   29   61:invokestatic    #103 <Method List Arrays.asList(Object[])>
	//   30   64:invokespecial   #107 <Method void HashSet(java.util.Collection)>
	//   31   67:invokestatic    #113 <Method Set Collections.unmodifiableSet(Set)>
	//   32   70:putstatic       #115 <Field Set NO_DOWNSAMPLE_PRE_N_MIME_TYPES>
	//   33   73:new             #6   <Class Downsampler$1>
	//   34   76:dup             
	//   35   77:invokespecial   #117 <Method void Downsampler$1()>
	//   36   80:putstatic       #119 <Field Downsampler$DecodeCallbacks EMPTY_CALLBACKS>
		TYPES_THAT_USE_POOL_PRE_KITKAT = Collections.unmodifiableSet(((Set) (EnumSet.of(((Enum) (com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG)), ((Enum) (com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A)), ((Enum) (com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG))))));
	//   37   83:getstatic       #125 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG>
	//   38   86:getstatic       #128 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A>
	//   39   89:getstatic       #131 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG>
	//   40   92:invokestatic    #137 <Method EnumSet EnumSet.of(Enum, Enum, Enum)>
	//   41   95:invokestatic    #113 <Method Set Collections.unmodifiableSet(Set)>
	//   42   98:putstatic       #139 <Field Set TYPES_THAT_USE_POOL_PRE_KITKAT>
	//   43  101:iconst_0        
	//   44  102:invokestatic    #145 <Method Queue Util.createQueue(int)>
	//   45  105:putstatic       #147 <Field Queue OPTIONS_QUEUE>
	//*  46  108:return          
	}
}
