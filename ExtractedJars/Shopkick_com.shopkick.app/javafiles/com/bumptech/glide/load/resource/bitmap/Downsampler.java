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
import com.bumptech.glide.util.*;
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
	//    1    1:invokespecial   #148 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #154 <Method HardwareConfigState HardwareConfigState.getInstance()>
	//    4    8:putfield        #156 <Field HardwareConfigState hardwareConfigState>
		parsers = list;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #158 <Field List parsers>
		displayMetrics = (DisplayMetrics)Preconditions.checkNotNull(((Object) (displaymetrics)));
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:invokestatic    #164 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #166 <Class DisplayMetrics>
	//   12   24:putfield        #168 <Field DisplayMetrics displayMetrics>
		bitmapPool = (BitmapPool)Preconditions.checkNotNull(((Object) (bitmappool)));
	//   13   27:aload_0         
	//   14   28:aload_3         
	//   15   29:invokestatic    #164 <Method Object Preconditions.checkNotNull(Object)>
	//   16   32:checkcast       #170 <Class BitmapPool>
	//   17   35:putfield        #172 <Field BitmapPool bitmapPool>
		byteArrayPool = (ArrayPool)Preconditions.checkNotNull(((Object) (arraypool)));
	//   18   38:aload_0         
	//   19   39:aload           4
	//   20   41:invokestatic    #164 <Method Object Preconditions.checkNotNull(Object)>
	//   21   44:checkcast       #174 <Class ArrayPool>
	//   22   47:putfield        #176 <Field ArrayPool byteArrayPool>
	//   23   50:return          
	}

	private static int adjustTargetDensityForError(double d)
	{
		int i = getDensityMultiplier(d);
	//    0    0:dload_0         
	//    1    1:invokestatic    #183 <Method int getDensityMultiplier(double)>
	//    2    4:istore_2        
		int j = round((double)i * d);
	//    3    5:iload_2         
	//    4    6:i2d             
	//    5    7:dload_0         
	//    6    8:dmul            
	//    7    9:invokestatic    #186 <Method int round(double)>
	//    8   12:istore_3        
		return round((d / (double)((float)j / (float)i)) * (double)j);
	//    9   13:dload_0         
	//   10   14:iload_3         
	//   11   15:i2f             
	//   12   16:iload_2         
	//   13   17:i2f             
	//   14   18:fdiv            
	//   15   19:f2d             
	//   16   20:ddiv            
	//   17   21:iload_3         
	//   18   22:i2d             
	//   19   23:dmul            
	//   20   24:invokestatic    #186 <Method int round(double)>
	//   21   27:ireturn         
	}

	private void calculateConfig(InputStream inputstream, DecodeFormat decodeformat, boolean flag, boolean flag1, android.graphics.BitmapFactory.Options options, int i, int j)
	{
		if(hardwareConfigState.setHardwareConfigIfAllowed(i, j, options, decodeformat, flag, flag1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field HardwareConfigState hardwareConfigState>
	//*   2    4:iload           6
	//*   3    6:iload           7
	//*   4    8:aload           5
	//*   5   10:aload_2         
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:invokevirtual   #194 <Method boolean HardwareConfigState.setHardwareConfigIfAllowed(int, int, android.graphics.BitmapFactory$Options, DecodeFormat, boolean, boolean)>
	//*   9   17:ifeq            21
			return;
	//   10   20:return          
		if(decodeformat != DecodeFormat.PREFER_ARGB_8888 && android.os.Build.VERSION.SDK_INT != 16)
	//*  11   21:aload_2         
	//*  12   22:getstatic       #197 <Field DecodeFormat DecodeFormat.PREFER_ARGB_8888>
	//*  13   25:if_acmpeq       152
	//*  14   28:getstatic       #202 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   31:bipush          16
	//*  16   33:icmpne          39
	//*  17   36:goto            152
		{
			flag1 = false;
	//   18   39:iconst_0        
	//   19   40:istore          4
			try
			{
				flag = ImageHeaderParserUtils.getType(parsers, inputstream, byteArrayPool).hasAlpha();
	//   20   42:aload_0         
	//   21   43:getfield        #158 <Field List parsers>
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #176 <Field ArrayPool byteArrayPool>
	//   25   51:invokestatic    #208 <Method com.bumptech.glide.load.ImageHeaderParser$ImageType ImageHeaderParserUtils.getType(List, InputStream, ArrayPool)>
	//   26   54:invokevirtual   #212 <Method boolean com.bumptech.glide.load.ImageHeaderParser$ImageType.hasAlpha()>
	//   27   57:istore_3        
			}
	//*  28   58:goto            113
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream)
	//*  29   61:astore_1        
			{
				flag = flag1;
	//   30   62:iload           4
	//   31   64:istore_3        
				if(Log.isLoggable("Downsampler", 3))
	//*  32   65:ldc1            #36  <String "Downsampler">
	//*  33   67:iconst_3        
	//*  34   68:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//*  35   71:ifeq            113
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   36   74:new             #220 <Class StringBuilder>
	//   37   77:dup             
	//   38   78:invokespecial   #221 <Method void StringBuilder()>
	//   39   81:astore          8
					stringbuilder.append("Cannot determine whether the image has alpha or not from header, format ");
	//   40   83:aload           8
	//   41   85:ldc1            #223 <String "Cannot determine whether the image has alpha or not from header, format ">
	//   42   87:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   43   90:pop             
					stringbuilder.append(((Object) (decodeformat)));
	//   44   91:aload           8
	//   45   93:aload_2         
	//   46   94:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//   47   97:pop             
					Log.d("Downsampler", stringbuilder.toString(), ((Throwable) (inputstream)));
	//   48   98:ldc1            #36  <String "Downsampler">
	//   49  100:aload           8
	//   50  102:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   51  105:aload_1         
	//   52  106:invokestatic    #238 <Method int Log.d(String, String, Throwable)>
	//   53  109:pop             
					flag = flag1;
	//   54  110:iload           4
	//   55  112:istore_3        
				}
			}
			if(flag)
	//*  56  113:iload_3         
	//*  57  114:ifeq            124
				inputstream = ((InputStream) (android.graphics.Bitmap.Config.ARGB_8888));
	//   58  117:getstatic       #244 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   59  120:astore_1        
			else
	//*  60  121:goto            128
				inputstream = ((InputStream) (android.graphics.Bitmap.Config.RGB_565));
	//   61  124:getstatic       #247 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   62  127:astore_1        
			options.inPreferredConfig = ((android.graphics.Bitmap.Config) (inputstream));
	//   63  128:aload           5
	//   64  130:aload_1         
	//   65  131:putfield        #252 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
			if(options.inPreferredConfig == android.graphics.Bitmap.Config.RGB_565)
	//*  66  134:aload           5
	//*  67  136:getfield        #252 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
	//*  68  139:getstatic       #247 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//*  69  142:if_acmpne       151
				options.inDither = true;
	//   70  145:aload           5
	//   71  147:iconst_1        
	//   72  148:putfield        #256 <Field boolean android.graphics.BitmapFactory$Options.inDither>
			return;
	//   73  151:return          
		} else
		{
			options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
	//   74  152:aload           5
	//   75  154:getstatic       #244 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   76  157:putfield        #252 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
			return;
	//   77  160:return          
		}
	}

	private static void calculateScaling(com.bumptech.glide.load.ImageHeaderParser.ImageType imagetype, InputStream inputstream, DecodeCallbacks decodecallbacks, BitmapPool bitmappool, DownsampleStrategy downsamplestrategy, int i, int j, int k, 
			int l, int i1, android.graphics.BitmapFactory.Options options)
		throws IOException
	{
		if(j > 0 && k > 0)
	//*   0    0:iload           6
	//*   1    2:ifle            910
	//*   2    5:iload           7
	//*   3    7:ifgt            13
	//*   4   10:goto            910
		{
			float f;
			if(i != 90 && i != 270)
	//*   5   13:iload           5
	//*   6   15:bipush          90
	//*   7   17:icmpeq          49
	//*   8   20:iload           5
	//*   9   22:sipush          270
	//*  10   25:icmpne          31
	//*  11   28:goto            49
				f = downsamplestrategy.getScaleFactor(j, k, l, i1);
	//   12   31:aload           4
	//   13   33:iload           6
	//   14   35:iload           7
	//   15   37:iload           8
	//   16   39:iload           9
	//   17   41:invokevirtual   #262 <Method float DownsampleStrategy.getScaleFactor(int, int, int, int)>
	//   18   44:fstore          13
			else
	//*  19   46:goto            64
				f = downsamplestrategy.getScaleFactor(k, j, l, i1);
	//   20   49:aload           4
	//   21   51:iload           7
	//   22   53:iload           6
	//   23   55:iload           8
	//   24   57:iload           9
	//   25   59:invokevirtual   #262 <Method float DownsampleStrategy.getScaleFactor(int, int, int, int)>
	//   26   62:fstore          13
			if(f > 0.0F)
	//*  27   64:fload           13
	//*  28   66:fconst_0        
	//*  29   67:fcmpg           
	//*  30   68:ifle            792
			{
				DownsampleStrategy.SampleSizeRounding samplesizerounding = downsamplestrategy.getSampleSizeRounding(j, k, l, i1);
	//   31   71:aload           4
	//   32   73:iload           6
	//   33   75:iload           7
	//   34   77:iload           8
	//   35   79:iload           9
	//   36   81:invokevirtual   #266 <Method DownsampleStrategy$SampleSizeRounding DownsampleStrategy.getSampleSizeRounding(int, int, int, int)>
	//   37   84:astore          22
				if(samplesizerounding != null)
	//*  38   86:aload           22
	//*  39   88:ifnull          781
				{
					float f1 = j;
	//   40   91:iload           6
	//   41   93:i2f             
	//   42   94:fstore          14
					int j1 = round(f * f1);
	//   43   96:fload           13
	//   44   98:fload           14
	//   45  100:fmul            
	//   46  101:f2d             
	//   47  102:invokestatic    #186 <Method int round(double)>
	//   48  105:istore          17
					float f2 = k;
	//   49  107:iload           7
	//   50  109:i2f             
	//   51  110:fstore          15
					i = round(f * f2);
	//   52  112:fload           13
	//   53  114:fload           15
	//   54  116:fmul            
	//   55  117:f2d             
	//   56  118:invokestatic    #186 <Method int round(double)>
	//   57  121:istore          5
					j1 = j / j1;
	//   58  123:iload           6
	//   59  125:iload           17
	//   60  127:idiv            
	//   61  128:istore          17
					i = k / i;
	//   62  130:iload           7
	//   63  132:iload           5
	//   64  134:idiv            
	//   65  135:istore          5
					if(samplesizerounding == DownsampleStrategy.SampleSizeRounding.MEMORY)
	//*  66  137:aload           22
	//*  67  139:getstatic       #272 <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.MEMORY>
	//*  68  142:if_acmpne       157
						i = Math.max(j1, i);
	//   69  145:iload           17
	//   70  147:iload           5
	//   71  149:invokestatic    #278 <Method int Math.max(int, int)>
	//   72  152:istore          5
					else
	//*  73  154:goto            166
						i = Math.min(j1, i);
	//   74  157:iload           17
	//   75  159:iload           5
	//   76  161:invokestatic    #281 <Method int Math.min(int, int)>
	//   77  164:istore          5
					int k1;
					if(android.os.Build.VERSION.SDK_INT <= 23 && NO_DOWNSAMPLE_PRE_N_MIME_TYPES.contains(((Object) (options.outMimeType))))
	//*  78  166:getstatic       #202 <Field int android.os.Build$VERSION.SDK_INT>
	//*  79  169:bipush          23
	//*  80  171:icmpgt          196
	//*  81  174:getstatic       #113 <Field Set NO_DOWNSAMPLE_PRE_N_MIME_TYPES>
	//*  82  177:aload           10
	//*  83  179:getfield        #284 <Field String android.graphics.BitmapFactory$Options.outMimeType>
	//*  84  182:invokeinterface #290 <Method boolean Set.contains(Object)>
	//*  85  187:ifeq            196
					{
						k1 = 1;
	//   86  190:iconst_1        
	//   87  191:istore          18
					} else
	//*  88  193:goto            235
					{
						k1 = Math.max(1, Integer.highestOneBit(i));
	//   89  196:iconst_1        
	//   90  197:iload           5
	//   91  199:invokestatic    #296 <Method int Integer.highestOneBit(int)>
	//   92  202:invokestatic    #278 <Method int Math.max(int, int)>
	//   93  205:istore          18
						if(samplesizerounding == DownsampleStrategy.SampleSizeRounding.MEMORY && (float)k1 < 1.0F / f)
	//*  94  207:aload           22
	//*  95  209:getstatic       #272 <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.MEMORY>
	//*  96  212:if_acmpne       235
	//*  97  215:iload           18
	//*  98  217:i2f             
	//*  99  218:fconst_1        
	//* 100  219:fload           13
	//* 101  221:fdiv            
	//* 102  222:fcmpg           
	//* 103  223:ifge            235
							k1 <<= 1;
	//  104  226:iload           18
	//  105  228:iconst_1        
	//  106  229:ishl            
	//  107  230:istore          18
					}
	//* 108  232:goto            235
					options.inSampleSize = k1;
	//  109  235:aload           10
	//  110  237:iload           18
	//  111  239:putfield        #299 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
					if(imagetype == com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG)
	//* 112  242:aload_0         
	//* 113  243:getstatic       #123 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG>
	//* 114  246:if_acmpne       320
					{
						float f3 = Math.min(k1, 8);
	//  115  249:iload           18
	//  116  251:bipush          8
	//  117  253:invokestatic    #281 <Method int Math.min(int, int)>
	//  118  256:i2f             
	//  119  257:fstore          16
						int i2 = (int)Math.ceil(f1 / f3);
	//  120  259:fload           14
	//  121  261:fload           16
	//  122  263:fdiv            
	//  123  264:f2d             
	//  124  265:invokestatic    #303 <Method double Math.ceil(double)>
	//  125  268:d2i             
	//  126  269:istore          20
						int l1 = (int)Math.ceil(f2 / f3);
	//  127  271:fload           15
	//  128  273:fload           16
	//  129  275:fdiv            
	//  130  276:f2d             
	//  131  277:invokestatic    #303 <Method double Math.ceil(double)>
	//  132  280:d2i             
	//  133  281:istore          19
						int j2 = k1 / 8;
	//  134  283:iload           18
	//  135  285:bipush          8
	//  136  287:idiv            
	//  137  288:istore          21
						i = l1;
	//  138  290:iload           19
	//  139  292:istore          5
						j1 = i2;
	//  140  294:iload           20
	//  141  296:istore          17
						if(j2 > 0)
	//* 142  298:iload           21
	//* 143  300:ifle            509
						{
							j1 = i2 / j2;
	//  144  303:iload           20
	//  145  305:iload           21
	//  146  307:idiv            
	//  147  308:istore          17
							i = l1 / j2;
	//  148  310:iload           19
	//  149  312:iload           21
	//  150  314:idiv            
	//  151  315:istore          5
						}
					} else
	//* 152  317:goto            509
					if(imagetype != com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG && imagetype != com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A)
	//* 153  320:aload_0         
	//* 154  321:getstatic       #129 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG>
	//* 155  324:if_acmpeq       480
	//* 156  327:aload_0         
	//* 157  328:getstatic       #126 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A>
	//* 158  331:if_acmpne       337
	//* 159  334:goto            480
					{
						if(imagetype != com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP && imagetype != com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A)
	//* 160  337:aload_0         
	//* 161  338:getstatic       #306 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP>
	//* 162  341:if_acmpeq       412
	//* 163  344:aload_0         
	//* 164  345:getstatic       #309 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A>
	//* 165  348:if_acmpne       354
	//* 166  351:goto            412
						{
							if(j % k1 == 0 && k % k1 == 0)
	//* 167  354:iload           6
	//* 168  356:iload           18
	//* 169  358:irem            
	//* 170  359:ifne            390
	//* 171  362:iload           7
	//* 172  364:iload           18
	//* 173  366:irem            
	//* 174  367:ifeq            373
	//* 175  370:goto            390
							{
								j1 = j / k1;
	//  176  373:iload           6
	//  177  375:iload           18
	//  178  377:idiv            
	//  179  378:istore          17
								i = k / k1;
	//  180  380:iload           7
	//  181  382:iload           18
	//  182  384:idiv            
	//  183  385:istore          5
							} else
	//* 184  387:goto            509
							{
								imagetype = ((com.bumptech.glide.load.ImageHeaderParser.ImageType) (getDimensions(inputstream, options, decodecallbacks, bitmappool)));
	//  185  390:aload_1         
	//  186  391:aload           10
	//  187  393:aload_2         
	//  188  394:aload_3         
	//  189  395:invokestatic    #313 <Method int[] getDimensions(InputStream, android.graphics.BitmapFactory$Options, Downsampler$DecodeCallbacks, BitmapPool)>
	//  190  398:astore_0        
								j1 = imagetype[0];
	//  191  399:aload_0         
	//  192  400:iconst_0        
	//  193  401:iaload          
	//  194  402:istore          17
								i = imagetype[1];
	//  195  404:aload_0         
	//  196  405:iconst_1        
	//  197  406:iaload          
	//  198  407:istore          5
							}
						} else
	//* 199  409:goto            509
						if(android.os.Build.VERSION.SDK_INT >= 24)
	//* 200  412:getstatic       #202 <Field int android.os.Build$VERSION.SDK_INT>
	//* 201  415:bipush          24
	//* 202  417:icmplt          448
						{
							float f4 = k1;
	//  203  420:iload           18
	//  204  422:i2f             
	//  205  423:fstore          16
							j1 = Math.round(f1 / f4);
	//  206  425:fload           14
	//  207  427:fload           16
	//  208  429:fdiv            
	//  209  430:invokestatic    #316 <Method int Math.round(float)>
	//  210  433:istore          17
							i = Math.round(f2 / f4);
	//  211  435:fload           15
	//  212  437:fload           16
	//  213  439:fdiv            
	//  214  440:invokestatic    #316 <Method int Math.round(float)>
	//  215  443:istore          5
						} else
	//* 216  445:goto            509
						{
							float f5 = k1;
	//  217  448:iload           18
	//  218  450:i2f             
	//  219  451:fstore          16
							j1 = (int)Math.floor(f1 / f5);
	//  220  453:fload           14
	//  221  455:fload           16
	//  222  457:fdiv            
	//  223  458:f2d             
	//  224  459:invokestatic    #319 <Method double Math.floor(double)>
	//  225  462:d2i             
	//  226  463:istore          17
							i = (int)Math.floor(f2 / f5);
	//  227  465:fload           15
	//  228  467:fload           16
	//  229  469:fdiv            
	//  230  470:f2d             
	//  231  471:invokestatic    #319 <Method double Math.floor(double)>
	//  232  474:d2i             
	//  233  475:istore          5
						}
					} else
	//* 234  477:goto            509
					{
						float f6 = k1;
	//  235  480:iload           18
	//  236  482:i2f             
	//  237  483:fstore          16
						j1 = (int)Math.floor(f1 / f6);
	//  238  485:fload           14
	//  239  487:fload           16
	//  240  489:fdiv            
	//  241  490:f2d             
	//  242  491:invokestatic    #319 <Method double Math.floor(double)>
	//  243  494:d2i             
	//  244  495:istore          17
						i = (int)Math.floor(f2 / f6);
	//  245  497:fload           15
	//  246  499:fload           16
	//  247  501:fdiv            
	//  248  502:f2d             
	//  249  503:invokestatic    #319 <Method double Math.floor(double)>
	//  250  506:d2i             
	//  251  507:istore          5
					}
					double d = downsamplestrategy.getScaleFactor(j1, i, l, i1);
	//  252  509:aload           4
	//  253  511:iload           17
	//  254  513:iload           5
	//  255  515:iload           8
	//  256  517:iload           9
	//  257  519:invokevirtual   #262 <Method float DownsampleStrategy.getScaleFactor(int, int, int, int)>
	//  258  522:f2d             
	//  259  523:dstore          11
					if(android.os.Build.VERSION.SDK_INT >= 19)
	//* 260  525:getstatic       #202 <Field int android.os.Build$VERSION.SDK_INT>
	//* 261  528:bipush          19
	//* 262  530:icmplt          553
					{
						options.inTargetDensity = adjustTargetDensityForError(d);
	//  263  533:aload           10
	//  264  535:dload           11
	//  265  537:invokestatic    #321 <Method int adjustTargetDensityForError(double)>
	//  266  540:putfield        #324 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
						options.inDensity = getDensityMultiplier(d);
	//  267  543:aload           10
	//  268  545:dload           11
	//  269  547:invokestatic    #183 <Method int getDensityMultiplier(double)>
	//  270  550:putfield        #327 <Field int android.graphics.BitmapFactory$Options.inDensity>
					}
					if(isScaling(options))
	//* 271  553:aload           10
	//* 272  555:invokestatic    #331 <Method boolean isScaling(android.graphics.BitmapFactory$Options)>
	//* 273  558:ifeq            570
					{
						options.inScaled = true;
	//  274  561:aload           10
	//  275  563:iconst_1        
	//  276  564:putfield        #334 <Field boolean android.graphics.BitmapFactory$Options.inScaled>
					} else
	//* 277  567:goto            582
					{
						options.inTargetDensity = 0;
	//  278  570:aload           10
	//  279  572:iconst_0        
	//  280  573:putfield        #324 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
						options.inDensity = 0;
	//  281  576:aload           10
	//  282  578:iconst_0        
	//  283  579:putfield        #327 <Field int android.graphics.BitmapFactory$Options.inDensity>
					}
					if(Log.isLoggable("Downsampler", 2))
	//* 284  582:ldc1            #36  <String "Downsampler">
	//* 285  584:iconst_2        
	//* 286  585:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//* 287  588:ifeq            780
					{
						imagetype = ((com.bumptech.glide.load.ImageHeaderParser.ImageType) (new StringBuilder()));
	//  288  591:new             #220 <Class StringBuilder>
	//  289  594:dup             
	//  290  595:invokespecial   #221 <Method void StringBuilder()>
	//  291  598:astore_0        
						((StringBuilder) (imagetype)).append("Calculate scaling, source: [");
	//  292  599:aload_0         
	//  293  600:ldc2            #336 <String "Calculate scaling, source: [">
	//  294  603:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  295  606:pop             
						((StringBuilder) (imagetype)).append(j);
	//  296  607:aload_0         
	//  297  608:iload           6
	//  298  610:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  299  613:pop             
						((StringBuilder) (imagetype)).append("x");
	//  300  614:aload_0         
	//  301  615:ldc2            #341 <String "x">
	//  302  618:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  303  621:pop             
						((StringBuilder) (imagetype)).append(k);
	//  304  622:aload_0         
	//  305  623:iload           7
	//  306  625:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  307  628:pop             
						((StringBuilder) (imagetype)).append("], target: [");
	//  308  629:aload_0         
	//  309  630:ldc2            #343 <String "], target: [">
	//  310  633:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  311  636:pop             
						((StringBuilder) (imagetype)).append(l);
	//  312  637:aload_0         
	//  313  638:iload           8
	//  314  640:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  315  643:pop             
						((StringBuilder) (imagetype)).append("x");
	//  316  644:aload_0         
	//  317  645:ldc2            #341 <String "x">
	//  318  648:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  319  651:pop             
						((StringBuilder) (imagetype)).append(i1);
	//  320  652:aload_0         
	//  321  653:iload           9
	//  322  655:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  323  658:pop             
						((StringBuilder) (imagetype)).append("], power of two scaled: [");
	//  324  659:aload_0         
	//  325  660:ldc2            #345 <String "], power of two scaled: [">
	//  326  663:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  327  666:pop             
						((StringBuilder) (imagetype)).append(j1);
	//  328  667:aload_0         
	//  329  668:iload           17
	//  330  670:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  331  673:pop             
						((StringBuilder) (imagetype)).append("x");
	//  332  674:aload_0         
	//  333  675:ldc2            #341 <String "x">
	//  334  678:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  335  681:pop             
						((StringBuilder) (imagetype)).append(i);
	//  336  682:aload_0         
	//  337  683:iload           5
	//  338  685:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  339  688:pop             
						((StringBuilder) (imagetype)).append("], exact scale factor: ");
	//  340  689:aload_0         
	//  341  690:ldc2            #347 <String "], exact scale factor: ">
	//  342  693:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  343  696:pop             
						((StringBuilder) (imagetype)).append(f);
	//  344  697:aload_0         
	//  345  698:fload           13
	//  346  700:invokevirtual   #350 <Method StringBuilder StringBuilder.append(float)>
	//  347  703:pop             
						((StringBuilder) (imagetype)).append(", power of 2 sample size: ");
	//  348  704:aload_0         
	//  349  705:ldc2            #352 <String ", power of 2 sample size: ">
	//  350  708:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  351  711:pop             
						((StringBuilder) (imagetype)).append(k1);
	//  352  712:aload_0         
	//  353  713:iload           18
	//  354  715:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  355  718:pop             
						((StringBuilder) (imagetype)).append(", adjusted scale factor: ");
	//  356  719:aload_0         
	//  357  720:ldc2            #354 <String ", adjusted scale factor: ">
	//  358  723:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  359  726:pop             
						((StringBuilder) (imagetype)).append(d);
	//  360  727:aload_0         
	//  361  728:dload           11
	//  362  730:invokevirtual   #357 <Method StringBuilder StringBuilder.append(double)>
	//  363  733:pop             
						((StringBuilder) (imagetype)).append(", target density: ");
	//  364  734:aload_0         
	//  365  735:ldc2            #359 <String ", target density: ">
	//  366  738:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  367  741:pop             
						((StringBuilder) (imagetype)).append(options.inTargetDensity);
	//  368  742:aload_0         
	//  369  743:aload           10
	//  370  745:getfield        #324 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//  371  748:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  372  751:pop             
						((StringBuilder) (imagetype)).append(", density: ");
	//  373  752:aload_0         
	//  374  753:ldc2            #361 <String ", density: ">
	//  375  756:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  376  759:pop             
						((StringBuilder) (imagetype)).append(options.inDensity);
	//  377  760:aload_0         
	//  378  761:aload           10
	//  379  763:getfield        #327 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//  380  766:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  381  769:pop             
						Log.v("Downsampler", ((StringBuilder) (imagetype)).toString());
	//  382  770:ldc1            #36  <String "Downsampler">
	//  383  772:aload_0         
	//  384  773:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  385  776:invokestatic    #365 <Method int Log.v(String, String)>
	//  386  779:pop             
					}
					return;
	//  387  780:return          
				} else
				{
					throw new IllegalArgumentException("Cannot round with null rounding");
	//  388  781:new             #367 <Class IllegalArgumentException>
	//  389  784:dup             
	//  390  785:ldc2            #369 <String "Cannot round with null rounding">
	//  391  788:invokespecial   #372 <Method void IllegalArgumentException(String)>
	//  392  791:athrow          
				}
			} else
			{
				imagetype = ((com.bumptech.glide.load.ImageHeaderParser.ImageType) (new StringBuilder()));
	//  393  792:new             #220 <Class StringBuilder>
	//  394  795:dup             
	//  395  796:invokespecial   #221 <Method void StringBuilder()>
	//  396  799:astore_0        
				((StringBuilder) (imagetype)).append("Cannot scale with factor: ");
	//  397  800:aload_0         
	//  398  801:ldc2            #374 <String "Cannot scale with factor: ">
	//  399  804:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  400  807:pop             
				((StringBuilder) (imagetype)).append(f);
	//  401  808:aload_0         
	//  402  809:fload           13
	//  403  811:invokevirtual   #350 <Method StringBuilder StringBuilder.append(float)>
	//  404  814:pop             
				((StringBuilder) (imagetype)).append(" from: ");
	//  405  815:aload_0         
	//  406  816:ldc2            #376 <String " from: ">
	//  407  819:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  408  822:pop             
				((StringBuilder) (imagetype)).append(((Object) (downsamplestrategy)));
	//  409  823:aload_0         
	//  410  824:aload           4
	//  411  826:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//  412  829:pop             
				((StringBuilder) (imagetype)).append(", source: [");
	//  413  830:aload_0         
	//  414  831:ldc2            #378 <String ", source: [">
	//  415  834:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  416  837:pop             
				((StringBuilder) (imagetype)).append(j);
	//  417  838:aload_0         
	//  418  839:iload           6
	//  419  841:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  420  844:pop             
				((StringBuilder) (imagetype)).append("x");
	//  421  845:aload_0         
	//  422  846:ldc2            #341 <String "x">
	//  423  849:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  424  852:pop             
				((StringBuilder) (imagetype)).append(k);
	//  425  853:aload_0         
	//  426  854:iload           7
	//  427  856:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  428  859:pop             
				((StringBuilder) (imagetype)).append("], target: [");
	//  429  860:aload_0         
	//  430  861:ldc2            #343 <String "], target: [">
	//  431  864:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  432  867:pop             
				((StringBuilder) (imagetype)).append(l);
	//  433  868:aload_0         
	//  434  869:iload           8
	//  435  871:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  436  874:pop             
				((StringBuilder) (imagetype)).append("x");
	//  437  875:aload_0         
	//  438  876:ldc2            #341 <String "x">
	//  439  879:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  440  882:pop             
				((StringBuilder) (imagetype)).append(i1);
	//  441  883:aload_0         
	//  442  884:iload           9
	//  443  886:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  444  889:pop             
				((StringBuilder) (imagetype)).append("]");
	//  445  890:aload_0         
	//  446  891:ldc2            #380 <String "]">
	//  447  894:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  448  897:pop             
				throw new IllegalArgumentException(((StringBuilder) (imagetype)).toString());
	//  449  898:new             #367 <Class IllegalArgumentException>
	//  450  901:dup             
	//  451  902:aload_0         
	//  452  903:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  453  906:invokespecial   #372 <Method void IllegalArgumentException(String)>
	//  454  909:athrow          
			}
		}
		if(Log.isLoggable("Downsampler", 3))
	//* 455  910:ldc1            #36  <String "Downsampler">
	//* 456  912:iconst_3        
	//* 457  913:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//* 458  916:ifeq            989
		{
			inputstream = ((InputStream) (new StringBuilder()));
	//  459  919:new             #220 <Class StringBuilder>
	//  460  922:dup             
	//  461  923:invokespecial   #221 <Method void StringBuilder()>
	//  462  926:astore_1        
			((StringBuilder) (inputstream)).append("Unable to determine dimensions for: ");
	//  463  927:aload_1         
	//  464  928:ldc2            #382 <String "Unable to determine dimensions for: ">
	//  465  931:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  466  934:pop             
			((StringBuilder) (inputstream)).append(((Object) (imagetype)));
	//  467  935:aload_1         
	//  468  936:aload_0         
	//  469  937:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//  470  940:pop             
			((StringBuilder) (inputstream)).append(" with target [");
	//  471  941:aload_1         
	//  472  942:ldc2            #384 <String " with target [">
	//  473  945:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  474  948:pop             
			((StringBuilder) (inputstream)).append(l);
	//  475  949:aload_1         
	//  476  950:iload           8
	//  477  952:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  478  955:pop             
			((StringBuilder) (inputstream)).append("x");
	//  479  956:aload_1         
	//  480  957:ldc2            #341 <String "x">
	//  481  960:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  482  963:pop             
			((StringBuilder) (inputstream)).append(i1);
	//  483  964:aload_1         
	//  484  965:iload           9
	//  485  967:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  486  970:pop             
			((StringBuilder) (inputstream)).append("]");
	//  487  971:aload_1         
	//  488  972:ldc2            #380 <String "]">
	//  489  975:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  490  978:pop             
			Log.d("Downsampler", ((StringBuilder) (inputstream)).toString());
	//  491  979:ldc1            #36  <String "Downsampler">
	//  492  981:aload_1         
	//  493  982:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  494  985:invokestatic    #386 <Method int Log.d(String, String)>
	//  495  988:pop             
		}
	//  496  989:return          
	}

	private Bitmap decodeFromWrappedStreams(InputStream inputstream, android.graphics.BitmapFactory.Options options, DownsampleStrategy downsamplestrategy, DecodeFormat decodeformat, boolean flag, int i, int j, 
			boolean flag1, DecodeCallbacks decodecallbacks)
		throws IOException
	{
		long l2 = LogTime.getLogTime();
	//    0    0:invokestatic    #395 <Method long LogTime.getLogTime()>
	//    1    3:lstore          22
		int ai[] = getDimensions(inputstream, options, decodecallbacks, bitmapPool);
	//    2    5:aload_1         
	//    3    6:aload_2         
	//    4    7:aload           9
	//    5    9:aload_0         
	//    6   10:getfield        #172 <Field BitmapPool bitmapPool>
	//    7   13:invokestatic    #313 <Method int[] getDimensions(InputStream, android.graphics.BitmapFactory$Options, Downsampler$DecodeCallbacks, BitmapPool)>
	//    8   16:astore          24
		boolean flag2 = false;
	//    9   18:iconst_0        
	//   10   19:istore          15
		int j1 = ai[0];
	//   11   21:aload           24
	//   12   23:iconst_0        
	//   13   24:iaload          
	//   14   25:istore          16
		int k1 = ai[1];
	//   15   27:aload           24
	//   16   29:iconst_1        
	//   17   30:iaload          
	//   18   31:istore          17
		String s = options.outMimeType;
	//   19   33:aload_2         
	//   20   34:getfield        #284 <Field String android.graphics.BitmapFactory$Options.outMimeType>
	//   21   37:astore          24
		if(j1 == -1 || k1 == -1)
	//*  22   39:iload           16
	//*  23   41:iconst_m1       
	//*  24   42:icmpeq          57
	//*  25   45:iload           17
	//*  26   47:iconst_m1       
	//*  27   48:icmpne          54
	//*  28   51:goto            57
	//*  29   54:goto            60
			flag = false;
	//   30   57:iconst_0        
	//   31   58:istore          5
		int j2 = ImageHeaderParserUtils.getOrientation(parsers, inputstream, byteArrayPool);
	//   32   60:aload_0         
	//   33   61:getfield        #158 <Field List parsers>
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:getfield        #176 <Field ArrayPool byteArrayPool>
	//   37   69:invokestatic    #399 <Method int ImageHeaderParserUtils.getOrientation(List, InputStream, ArrayPool)>
	//   38   72:istore          19
		int l1 = TransformationUtils.getExifOrientationDegrees(j2);
	//   39   74:iload           19
	//   40   76:invokestatic    #404 <Method int TransformationUtils.getExifOrientationDegrees(int)>
	//   41   79:istore          18
		boolean flag3 = TransformationUtils.isExifOrientationRequired(j2);
	//   42   81:iload           19
	//   43   83:invokestatic    #408 <Method boolean TransformationUtils.isExifOrientationRequired(int)>
	//   44   86:istore          21
		int k;
		if(i == 0x80000000)
	//*  45   88:iload           6
	//*  46   90:ldc2            #409 <Int 0x80000000>
	//*  47   93:icmpne          103
			k = j1;
	//   48   96:iload           16
	//   49   98:istore          13
		else
	//*  50  100:goto            107
			k = i;
	//   51  103:iload           6
	//   52  105:istore          13
		int l = j;
	//   53  107:iload           7
	//   54  109:istore          14
		if(l == 0x80000000)
	//*  55  111:iload           14
	//*  56  113:ldc2            #409 <Int 0x80000000>
	//*  57  116:icmpne          126
			l = k1;
	//   58  119:iload           17
	//   59  121:istore          14
	//*  60  123:goto            126
		com.bumptech.glide.load.ImageHeaderParser.ImageType imagetype = ImageHeaderParserUtils.getType(parsers, inputstream, byteArrayPool);
	//   61  126:aload_0         
	//   62  127:getfield        #158 <Field List parsers>
	//   63  130:aload_1         
	//   64  131:aload_0         
	//   65  132:getfield        #176 <Field ArrayPool byteArrayPool>
	//   66  135:invokestatic    #208 <Method com.bumptech.glide.load.ImageHeaderParser$ImageType ImageHeaderParserUtils.getType(List, InputStream, ArrayPool)>
	//   67  138:astore          25
		calculateScaling(imagetype, inputstream, decodecallbacks, bitmapPool, downsamplestrategy, l1, j1, k1, k, l, options);
	//   68  140:aload           25
	//   69  142:aload_1         
	//   70  143:aload           9
	//   71  145:aload_0         
	//   72  146:getfield        #172 <Field BitmapPool bitmapPool>
	//   73  149:aload_3         
	//   74  150:iload           18
	//   75  152:iload           16
	//   76  154:iload           17
	//   77  156:iload           13
	//   78  158:iload           14
	//   79  160:aload_2         
	//   80  161:invokestatic    #411 <Method void calculateScaling(com.bumptech.glide.load.ImageHeaderParser$ImageType, InputStream, Downsampler$DecodeCallbacks, BitmapPool, DownsampleStrategy, int, int, int, int, int, android.graphics.BitmapFactory$Options)>
		calculateConfig(inputstream, decodeformat, flag, flag3, options, k, l);
	//   81  164:aload_0         
	//   82  165:aload_1         
	//   83  166:aload           4
	//   84  168:iload           5
	//   85  170:iload           21
	//   86  172:aload_2         
	//   87  173:iload           13
	//   88  175:iload           14
	//   89  177:invokespecial   #413 <Method void calculateConfig(InputStream, DecodeFormat, boolean, boolean, android.graphics.BitmapFactory$Options, int, int)>
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  90  180:getstatic       #202 <Field int android.os.Build$VERSION.SDK_INT>
	//*  91  183:bipush          19
	//*  92  185:icmplt          191
			flag2 = true;
	//   93  188:iconst_1        
	//   94  189:istore          15
		if(options.inSampleSize == 1 || flag2)
	//*  95  191:aload_2         
	//*  96  192:getfield        #299 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
	//*  97  195:iconst_1        
	//*  98  196:icmpeq          210
	//*  99  199:iload           15
	//* 100  201:ifeq            207
	//* 101  204:goto            210
	//* 102  207:goto            540
		{
			downsamplestrategy = ((DownsampleStrategy) (this));
	//  103  210:aload_0         
	//  104  211:astore_3        
			if(((Downsampler) (downsamplestrategy)).shouldUsePool(imagetype))
	//* 105  212:aload_3         
	//* 106  213:aload           25
	//* 107  215:invokespecial   #417 <Method boolean shouldUsePool(com.bumptech.glide.load.ImageHeaderParser$ImageType)>
	//* 108  218:ifeq            540
			{
				if(j1 < 0 || k1 < 0 || !flag1 || !flag2)
	//* 109  221:iload           16
	//* 110  223:iflt            244
	//* 111  226:iload           17
	//* 112  228:iflt            244
	//* 113  231:iload           8
	//* 114  233:ifeq            244
	//* 115  236:iload           15
	//* 116  238:ifeq            244
	//* 117  241:goto            518
				{
					float f;
					if(isScaling(options))
	//* 118  244:aload_2         
	//* 119  245:invokestatic    #331 <Method boolean isScaling(android.graphics.BitmapFactory$Options)>
	//* 120  248:ifeq            267
						f = (float)options.inTargetDensity / (float)options.inDensity;
	//  121  251:aload_2         
	//  122  252:getfield        #324 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//  123  255:i2f             
	//  124  256:aload_2         
	//  125  257:getfield        #327 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//  126  260:i2f             
	//  127  261:fdiv            
	//  128  262:fstore          10
					else
	//* 129  264:goto            270
						f = 1.0F;
	//  130  267:fconst_1        
	//  131  268:fstore          10
					int k2 = options.inSampleSize;
	//  132  270:aload_2         
	//  133  271:getfield        #299 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
	//  134  274:istore          20
					float f1 = j1;
	//  135  276:iload           16
	//  136  278:i2f             
	//  137  279:fstore          11
					float f2 = k2;
	//  138  281:iload           20
	//  139  283:i2f             
	//  140  284:fstore          12
					l = (int)Math.ceil(f1 / f2);
	//  141  286:fload           11
	//  142  288:fload           12
	//  143  290:fdiv            
	//  144  291:f2d             
	//  145  292:invokestatic    #303 <Method double Math.ceil(double)>
	//  146  295:d2i             
	//  147  296:istore          14
					k = (int)Math.ceil((float)k1 / f2);
	//  148  298:iload           17
	//  149  300:i2f             
	//  150  301:fload           12
	//  151  303:fdiv            
	//  152  304:f2d             
	//  153  305:invokestatic    #303 <Method double Math.ceil(double)>
	//  154  308:d2i             
	//  155  309:istore          13
					int i1 = Math.round((float)l * f);
	//  156  311:iload           14
	//  157  313:i2f             
	//  158  314:fload           10
	//  159  316:fmul            
	//  160  317:invokestatic    #316 <Method int Math.round(float)>
	//  161  320:istore          15
					int i2 = Math.round((float)k * f);
	//  162  322:iload           13
	//  163  324:i2f             
	//  164  325:fload           10
	//  165  327:fmul            
	//  166  328:invokestatic    #316 <Method int Math.round(float)>
	//  167  331:istore          18
					k = i1;
	//  168  333:iload           15
	//  169  335:istore          13
					l = i2;
	//  170  337:iload           18
	//  171  339:istore          14
					if(Log.isLoggable("Downsampler", 2))
	//* 172  341:ldc1            #36  <String "Downsampler">
	//* 173  343:iconst_2        
	//* 174  344:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//* 175  347:ifeq            518
					{
						decodeformat = ((DecodeFormat) (new StringBuilder()));
	//  176  350:new             #220 <Class StringBuilder>
	//  177  353:dup             
	//  178  354:invokespecial   #221 <Method void StringBuilder()>
	//  179  357:astore          4
						((StringBuilder) (decodeformat)).append("Calculated target [");
	//  180  359:aload           4
	//  181  361:ldc2            #419 <String "Calculated target [">
	//  182  364:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  183  367:pop             
						((StringBuilder) (decodeformat)).append(i1);
	//  184  368:aload           4
	//  185  370:iload           15
	//  186  372:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  187  375:pop             
						((StringBuilder) (decodeformat)).append("x");
	//  188  376:aload           4
	//  189  378:ldc2            #341 <String "x">
	//  190  381:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  191  384:pop             
						((StringBuilder) (decodeformat)).append(i2);
	//  192  385:aload           4
	//  193  387:iload           18
	//  194  389:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  195  392:pop             
						((StringBuilder) (decodeformat)).append("] for source [");
	//  196  393:aload           4
	//  197  395:ldc2            #421 <String "] for source [">
	//  198  398:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  199  401:pop             
						((StringBuilder) (decodeformat)).append(j1);
	//  200  402:aload           4
	//  201  404:iload           16
	//  202  406:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  203  409:pop             
						((StringBuilder) (decodeformat)).append("x");
	//  204  410:aload           4
	//  205  412:ldc2            #341 <String "x">
	//  206  415:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  207  418:pop             
						((StringBuilder) (decodeformat)).append(k1);
	//  208  419:aload           4
	//  209  421:iload           17
	//  210  423:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  211  426:pop             
						((StringBuilder) (decodeformat)).append("], sampleSize: ");
	//  212  427:aload           4
	//  213  429:ldc2            #423 <String "], sampleSize: ">
	//  214  432:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  215  435:pop             
						((StringBuilder) (decodeformat)).append(k2);
	//  216  436:aload           4
	//  217  438:iload           20
	//  218  440:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  219  443:pop             
						((StringBuilder) (decodeformat)).append(", targetDensity: ");
	//  220  444:aload           4
	//  221  446:ldc2            #425 <String ", targetDensity: ">
	//  222  449:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  223  452:pop             
						((StringBuilder) (decodeformat)).append(options.inTargetDensity);
	//  224  453:aload           4
	//  225  455:aload_2         
	//  226  456:getfield        #324 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//  227  459:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  228  462:pop             
						((StringBuilder) (decodeformat)).append(", density: ");
	//  229  463:aload           4
	//  230  465:ldc2            #361 <String ", density: ">
	//  231  468:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  232  471:pop             
						((StringBuilder) (decodeformat)).append(options.inDensity);
	//  233  472:aload           4
	//  234  474:aload_2         
	//  235  475:getfield        #327 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//  236  478:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//  237  481:pop             
						((StringBuilder) (decodeformat)).append(", density multiplier: ");
	//  238  482:aload           4
	//  239  484:ldc2            #427 <String ", density multiplier: ">
	//  240  487:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  241  490:pop             
						((StringBuilder) (decodeformat)).append(f);
	//  242  491:aload           4
	//  243  493:fload           10
	//  244  495:invokevirtual   #350 <Method StringBuilder StringBuilder.append(float)>
	//  245  498:pop             
						Log.v("Downsampler", ((StringBuilder) (decodeformat)).toString());
	//  246  499:ldc1            #36  <String "Downsampler">
	//  247  501:aload           4
	//  248  503:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  249  506:invokestatic    #365 <Method int Log.v(String, String)>
	//  250  509:pop             
						l = i2;
	//  251  510:iload           18
	//  252  512:istore          14
						k = i1;
	//  253  514:iload           15
	//  254  516:istore          13
					}
				}
				if(k > 0 && l > 0)
	//* 255  518:iload           13
	//* 256  520:ifle            540
	//* 257  523:iload           14
	//* 258  525:ifle            540
					setInBitmap(options, ((Downsampler) (downsamplestrategy)).bitmapPool, k, l);
	//  259  528:aload_2         
	//  260  529:aload_3         
	//  261  530:getfield        #172 <Field BitmapPool bitmapPool>
	//  262  533:iload           13
	//  263  535:iload           14
	//  264  537:invokestatic    #431 <Method void setInBitmap(android.graphics.BitmapFactory$Options, BitmapPool, int, int)>
			}
		}
		downsamplestrategy = ((DownsampleStrategy) (this));
	//  265  540:aload_0         
	//  266  541:astore_3        
		decodeformat = ((DecodeFormat) (decodeStream(inputstream, options, decodecallbacks, ((Downsampler) (downsamplestrategy)).bitmapPool)));
	//  267  542:aload_1         
	//  268  543:aload_2         
	//  269  544:aload           9
	//  270  546:aload_3         
	//  271  547:getfield        #172 <Field BitmapPool bitmapPool>
	//  272  550:invokestatic    #435 <Method Bitmap decodeStream(InputStream, android.graphics.BitmapFactory$Options, Downsampler$DecodeCallbacks, BitmapPool)>
	//  273  553:astore          4
		decodecallbacks.onDecodeComplete(((Downsampler) (downsamplestrategy)).bitmapPool, ((Bitmap) (decodeformat)));
	//  274  555:aload           9
	//  275  557:aload_3         
	//  276  558:getfield        #172 <Field BitmapPool bitmapPool>
	//  277  561:aload           4
	//  278  563:invokeinterface #439 <Method void Downsampler$DecodeCallbacks.onDecodeComplete(BitmapPool, Bitmap)>
		if(Log.isLoggable("Downsampler", 2))
	//* 279  568:ldc1            #36  <String "Downsampler">
	//* 280  570:iconst_2        
	//* 281  571:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//* 282  574:ifeq            598
			logDecode(j1, k1, s, options, ((Bitmap) (decodeformat)), i, j, l2);
	//  283  577:iload           16
	//  284  579:iload           17
	//  285  581:aload           24
	//  286  583:aload_2         
	//  287  584:aload           4
	//  288  586:iload           6
	//  289  588:iload           7
	//  290  590:lload           22
	//  291  592:invokestatic    #443 <Method void logDecode(int, int, String, android.graphics.BitmapFactory$Options, Bitmap, int, int, long)>
	//* 292  595:goto            598
		inputstream = null;
	//  293  598:aconst_null     
	//  294  599:astore_1        
		if(decodeformat != null)
	//* 295  600:aload           4
	//* 296  602:ifnull          653
		{
			((Bitmap) (decodeformat)).setDensity(((Downsampler) (downsamplestrategy)).displayMetrics.densityDpi);
	//  297  605:aload           4
	//  298  607:aload_3         
	//  299  608:getfield        #168 <Field DisplayMetrics displayMetrics>
	//  300  611:getfield        #446 <Field int DisplayMetrics.densityDpi>
	//  301  614:invokevirtual   #452 <Method void Bitmap.setDensity(int)>
			options = ((android.graphics.BitmapFactory.Options) (TransformationUtils.rotateImageExif(((Downsampler) (downsamplestrategy)).bitmapPool, ((Bitmap) (decodeformat)), j2)));
	//  302  617:aload_3         
	//  303  618:getfield        #172 <Field BitmapPool bitmapPool>
	//  304  621:aload           4
	//  305  623:iload           19
	//  306  625:invokestatic    #456 <Method Bitmap TransformationUtils.rotateImageExif(BitmapPool, Bitmap, int)>
	//  307  628:astore_2        
			inputstream = ((InputStream) (options));
	//  308  629:aload_2         
	//  309  630:astore_1        
			if(!((Object) (decodeformat)).equals(((Object) (options))))
	//* 310  631:aload           4
	//* 311  633:aload_2         
	//* 312  634:invokevirtual   #459 <Method boolean Object.equals(Object)>
	//* 313  637:ifne            653
			{
				((Downsampler) (downsamplestrategy)).bitmapPool.put(((Bitmap) (decodeformat)));
	//  314  640:aload_3         
	//  315  641:getfield        #172 <Field BitmapPool bitmapPool>
	//  316  644:aload           4
	//  317  646:invokeinterface #463 <Method void BitmapPool.put(Bitmap)>
				inputstream = ((InputStream) (options));
	//  318  651:aload_2         
	//  319  652:astore_1        
			}
		}
		return ((Bitmap) (inputstream));
	//  320  653:aload_1         
	//  321  654:areturn         
	}

	private static Bitmap decodeStream(InputStream inputstream, android.graphics.BitmapFactory.Options options, DecodeCallbacks decodecallbacks, BitmapPool bitmappool)
		throws IOException
	{
		int i;
		int j;
		Object obj;
		if(options.inJustDecodeBounds)
	//*   0    0:aload_1         
	//*   1    1:getfield        #466 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
	//*   2    4:ifeq            16
			inputstream.mark(0xa00000);
	//    3    7:aload_0         
	//    4    8:ldc1            #27  <Int 0xa00000>
	//    5   10:invokevirtual   #471 <Method void InputStream.mark(int)>
		else
	//*   6   13:goto            22
			decodecallbacks.onObtainBounds();
	//    7   16:aload_2         
	//    8   17:invokeinterface #474 <Method void Downsampler$DecodeCallbacks.onObtainBounds()>
		i = options.outWidth;
	//    9   22:aload_1         
	//   10   23:getfield        #477 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   11   26:istore          4
		j = options.outHeight;
	//   12   28:aload_1         
	//   13   29:getfield        #480 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   14   32:istore          5
		obj = ((Object) (options.outMimeType));
	//   15   34:aload_1         
	//   16   35:getfield        #284 <Field String android.graphics.BitmapFactory$Options.outMimeType>
	//   17   38:astore          6
		TransformationUtils.getBitmapDrawableLock().lock();
	//   18   40:invokestatic    #484 <Method Lock TransformationUtils.getBitmapDrawableLock()>
	//   19   43:invokeinterface #489 <Method void Lock.lock()>
		Bitmap bitmap = BitmapFactory.decodeStream(inputstream, ((android.graphics.Rect) (null)), options);
	//   20   48:aload_0         
	//   21   49:aconst_null     
	//   22   50:aload_1         
	//   23   51:invokestatic    #494 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   24   54:astore          7
		TransformationUtils.getBitmapDrawableLock().unlock();
	//   25   56:invokestatic    #484 <Method Lock TransformationUtils.getBitmapDrawableLock()>
	//   26   59:invokeinterface #497 <Method void Lock.unlock()>
		if(options.inJustDecodeBounds)
	//*  27   64:aload_1         
	//*  28   65:getfield        #466 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
	//*  29   68:ifeq            75
			inputstream.reset();
	//   30   71:aload_0         
	//   31   72:invokevirtual   #500 <Method void InputStream.reset()>
		return bitmap;
	//   32   75:aload           7
	//   33   77:areturn         
		inputstream;
	//   34   78:astore_0        
		  goto _L1
	//*  35   79:goto            172
		IllegalArgumentException illegalargumentexception;
		illegalargumentexception;
	//   36   82:astore          7
		obj = ((Object) (newIoExceptionForInBitmapAssertion(illegalargumentexception, i, j, ((String) (obj)), options)));
	//   37   84:aload           7
	//   38   86:iload           4
	//   39   88:iload           5
	//   40   90:aload           6
	//   41   92:aload_1         
	//   42   93:invokestatic    #504 <Method IOException newIoExceptionForInBitmapAssertion(IllegalArgumentException, int, int, String, android.graphics.BitmapFactory$Options)>
	//   43   96:astore          6
		if(Log.isLoggable("Downsampler", 3))
	//*  44   98:ldc1            #36  <String "Downsampler">
	//*  45  100:iconst_3        
	//*  46  101:invokestatic    #218 <Method boolean Log.isLoggable(String, int)>
	//*  47  104:ifeq            118
			Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", ((Throwable) (obj)));
	//   48  107:ldc1            #36  <String "Downsampler">
	//   49  109:ldc2            #506 <String "Failed to decode with inBitmap, trying again without Bitmap re-use">
	//   50  112:aload           6
	//   51  114:invokestatic    #238 <Method int Log.d(String, String, Throwable)>
	//   52  117:pop             
		illegalargumentexception = ((IllegalArgumentException) (options.inBitmap));
	//   53  118:aload_1         
	//   54  119:getfield        #510 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
	//   55  122:astore          7
		if(illegalargumentexception == null) goto _L3; else goto _L2
	//   56  124:aload           7
	//   57  126:ifnull          169
_L2:
		inputstream.reset();
	//   58  129:aload_0         
	//   59  130:invokevirtual   #500 <Method void InputStream.reset()>
		bitmappool.put(options.inBitmap);
	//   60  133:aload_3         
	//   61  134:aload_1         
	//   62  135:getfield        #510 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
	//   63  138:invokeinterface #463 <Method void BitmapPool.put(Bitmap)>
		options.inBitmap = null;
	//   64  143:aload_1         
	//   65  144:aconst_null     
	//   66  145:putfield        #510 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
		inputstream = ((InputStream) (decodeStream(inputstream, options, decodecallbacks, bitmappool)));
	//   67  148:aload_0         
	//   68  149:aload_1         
	//   69  150:aload_2         
	//   70  151:aload_3         
	//   71  152:invokestatic    #435 <Method Bitmap decodeStream(InputStream, android.graphics.BitmapFactory$Options, Downsampler$DecodeCallbacks, BitmapPool)>
	//   72  155:astore_0        
		TransformationUtils.getBitmapDrawableLock().unlock();
	//   73  156:invokestatic    #484 <Method Lock TransformationUtils.getBitmapDrawableLock()>
	//   74  159:invokeinterface #497 <Method void Lock.unlock()>
		return ((Bitmap) (inputstream));
	//   75  164:aload_0         
	//   76  165:areturn         
_L5:
		throw obj;
	//   77  166:aload           6
	//   78  168:athrow          
_L3:
		throw obj;
	//   79  169:aload           6
	//   80  171:athrow          
_L1:
		TransformationUtils.getBitmapDrawableLock().unlock();
	//   81  172:invokestatic    #484 <Method Lock TransformationUtils.getBitmapDrawableLock()>
	//   82  175:invokeinterface #497 <Method void Lock.unlock()>
		throw inputstream;
	//   83  180:aload_0         
	//   84  181:athrow          
		inputstream;
	//   85  182:astore_0        
		if(true) goto _L5; else goto _L4
_L4:
	//*  86  183:goto            166
	}

	private static String getBitmapString(Bitmap bitmap)
	{
		if(bitmap == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   4    6:getstatic       #202 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5    9:bipush          19
	//*   6   11:icmplt          55
		{
			obj = ((Object) (new StringBuilder()));
	//    7   14:new             #220 <Class StringBuilder>
	//    8   17:dup             
	//    9   18:invokespecial   #221 <Method void StringBuilder()>
	//   10   21:astore_1        
			((StringBuilder) (obj)).append(" (");
	//   11   22:aload_1         
	//   12   23:ldc2            #518 <String " (">
	//   13   26:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			((StringBuilder) (obj)).append(bitmap.getAllocationByteCount());
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:invokevirtual   #522 <Method int Bitmap.getAllocationByteCount()>
	//   18   35:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   19   38:pop             
			((StringBuilder) (obj)).append(")");
	//   20   39:aload_1         
	//   21   40:ldc2            #524 <String ")">
	//   22   43:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   24   47:aload_1         
	//   25   48:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   26   51:astore_1        
		} else
	//*  27   52:goto            59
		{
			obj = "";
	//   28   55:ldc2            #526 <String "">
	//   29   58:astore_1        
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   30   59:new             #220 <Class StringBuilder>
	//   31   62:dup             
	//   32   63:invokespecial   #221 <Method void StringBuilder()>
	//   33   66:astore_2        
		stringbuilder.append("[");
	//   34   67:aload_2         
	//   35   68:ldc2            #528 <String "[">
	//   36   71:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
		stringbuilder.append(bitmap.getWidth());
	//   38   75:aload_2         
	//   39   76:aload_0         
	//   40   77:invokevirtual   #531 <Method int Bitmap.getWidth()>
	//   41   80:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   42   83:pop             
		stringbuilder.append("x");
	//   43   84:aload_2         
	//   44   85:ldc2            #341 <String "x">
	//   45   88:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   46   91:pop             
		stringbuilder.append(bitmap.getHeight());
	//   47   92:aload_2         
	//   48   93:aload_0         
	//   49   94:invokevirtual   #534 <Method int Bitmap.getHeight()>
	//   50   97:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   51  100:pop             
		stringbuilder.append("] ");
	//   52  101:aload_2         
	//   53  102:ldc2            #536 <String "] ">
	//   54  105:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   55  108:pop             
		stringbuilder.append(((Object) (bitmap.getConfig())));
	//   56  109:aload_2         
	//   57  110:aload_0         
	//   58  111:invokevirtual   #540 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   59  114:invokevirtual   #230 <Method StringBuilder StringBuilder.append(Object)>
	//   60  117:pop             
		stringbuilder.append(((String) (obj)));
	//   61  118:aload_2         
	//   62  119:aload_1         
	//   63  120:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   64  123:pop             
		return stringbuilder.toString();
	//   65  124:aload_2         
	//   66  125:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   67  128:areturn         
	}

	private static android.graphics.BitmapFactory.Options getDefaultOptions()
	{
		com/bumptech/glide/load/resource/bitmap/Downsampler;
	//    0    0:ldc1            #2   <Class Downsampler>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		android.graphics.BitmapFactory.Options options;
		synchronized(OPTIONS_QUEUE)
	//*   2    3:getstatic       #145 <Field Queue OPTIONS_QUEUE>
	//*   3    6:astore_0        
	//*   4    7:aload_0         
	//*   5    8:monitorenter    
		{
			options = (android.graphics.BitmapFactory.Options)OPTIONS_QUEUE.poll();
	//    6    9:getstatic       #145 <Field Queue OPTIONS_QUEUE>
	//    7   12:invokeinterface #549 <Method Object Queue.poll()>
	//    8   17:checkcast       #249 <Class android.graphics.BitmapFactory$Options>
	//    9   20:astore_1        
		}
	//   10   21:aload_0         
	//   11   22:monitorexit     
		obj = ((Object) (options));
	//   12   23:aload_1         
	//   13   24:astore_0        
		if(options != null)
			break MISSING_BLOCK_LABEL_41;
	//   14   25:aload_1         
	//   15   26:ifnonnull       41
		obj = ((Object) (new android.graphics.BitmapFactory.Options()));
	//   16   29:new             #249 <Class android.graphics.BitmapFactory$Options>
	//   17   32:dup             
	//   18   33:invokespecial   #550 <Method void android.graphics.BitmapFactory$Options()>
	//   19   36:astore_0        
		resetOptions(((android.graphics.BitmapFactory.Options) (obj)));
	//   20   37:aload_0         
	//   21   38:invokestatic    #554 <Method void resetOptions(android.graphics.BitmapFactory$Options)>
		com/bumptech/glide/load/resource/bitmap/Downsampler;
	//   22   41:ldc1            #2   <Class Downsampler>
		JVM INSTR monitorexit ;
	//   23   43:monitorexit     
		return ((android.graphics.BitmapFactory.Options) (obj));
	//   24   44:aload_0         
	//   25   45:areturn         
		exception1;
	//   26   46:astore_1        
		obj;
	//   27   47:aload_0         
		JVM INSTR monitorexit ;
	//   28   48:monitorexit     
		throw exception1;
	//   29   49:aload_1         
	//   30   50:athrow          
		Exception exception;
		exception;
	//   31   51:astore_0        
		com/bumptech/glide/load/resource/bitmap/Downsampler;
	//   32   52:ldc1            #2   <Class Downsampler>
		JVM INSTR monitorexit ;
	//   33   54:monitorexit     
		throw exception;
	//   34   55:aload_0         
	//   35   56:athrow          
	}

	private static int getDensityMultiplier(double d)
	{
		if(d > 1.0D)
	//*   0    0:dload_0         
	//*   1    1:dconst_1        
	//*   2    2:dcmpg           
	//*   3    3:ifgt            9
	//*   4    6:goto            13
			d = 1.0D / d;
	//    5    9:dconst_1        
	//    6   10:dload_0         
	//    7   11:ddiv            
	//    8   12:dstore_0        
		return (int)Math.round(d * 2147483647D);
	//    9   13:dload_0         
	//   10   14:ldc2w           #555 <Double 2147483647D>
	//   11   17:dmul            
	//   12   18:invokestatic    #559 <Method long Math.round(double)>
	//   13   21:l2i             
	//   14   22:ireturn         
	}

	private static int[] getDimensions(InputStream inputstream, android.graphics.BitmapFactory.Options options, DecodeCallbacks decodecallbacks, BitmapPool bitmappool)
		throws IOException
	{
		options.inJustDecodeBounds = true;
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:putfield        #466 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		decodeStream(inputstream, options, decodecallbacks, bitmappool);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokestatic    #435 <Method Bitmap decodeStream(InputStream, android.graphics.BitmapFactory$Options, Downsampler$DecodeCallbacks, BitmapPool)>
	//    8   12:pop             
		options.inJustDecodeBounds = false;
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:putfield        #466 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		return (new int[] {
			options.outWidth, options.outHeight
		});
	//   12   18:iconst_2        
	//   13   19:newarray        int[]
	//   14   21:dup             
	//   15   22:iconst_0        
	//   16   23:aload_1         
	//   17   24:getfield        #477 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   18   27:iastore         
	//   19   28:dup             
	//   20   29:iconst_1        
	//   21   30:aload_1         
	//   22   31:getfield        #480 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   23   34:iastore         
	//   24   35:areturn         
	}

	private static String getInBitmapString(android.graphics.BitmapFactory.Options options)
	{
		return getBitmapString(options.inBitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #510 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
	//    2    4:invokestatic    #563 <Method String getBitmapString(Bitmap)>
	//    3    7:areturn         
	}

	private static boolean isScaling(android.graphics.BitmapFactory.Options options)
	{
		return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//    2    4:ifle            27
	//    3    7:aload_0         
	//    4    8:getfield        #327 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//    5   11:ifle            27
	//    6   14:aload_0         
	//    7   15:getfield        #324 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//    8   18:aload_0         
	//    9   19:getfield        #327 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//   10   22:icmpeq          27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	private static void logDecode(int i, int j, String s, android.graphics.BitmapFactory.Options options, Bitmap bitmap, int k, int l, long l1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #220 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #221 <Method void StringBuilder()>
	//    3    7:astore          9
		stringbuilder.append("Decoded ");
	//    4    9:aload           9
	//    5   11:ldc2            #565 <String "Decoded ">
	//    6   14:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		stringbuilder.append(getBitmapString(bitmap));
	//    8   18:aload           9
	//    9   20:aload           4
	//   10   22:invokestatic    #563 <Method String getBitmapString(Bitmap)>
	//   11   25:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:pop             
		stringbuilder.append(" from [");
	//   13   29:aload           9
	//   14   31:ldc2            #567 <String " from [">
	//   15   34:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:pop             
		stringbuilder.append(i);
	//   17   38:aload           9
	//   18   40:iload_0         
	//   19   41:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   20   44:pop             
		stringbuilder.append("x");
	//   21   45:aload           9
	//   22   47:ldc2            #341 <String "x">
	//   23   50:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   24   53:pop             
		stringbuilder.append(j);
	//   25   54:aload           9
	//   26   56:iload_1         
	//   27   57:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   28   60:pop             
		stringbuilder.append("] ");
	//   29   61:aload           9
	//   30   63:ldc2            #536 <String "] ">
	//   31   66:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   32   69:pop             
		stringbuilder.append(s);
	//   33   70:aload           9
	//   34   72:aload_2         
	//   35   73:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   36   76:pop             
		stringbuilder.append(" with inBitmap ");
	//   37   77:aload           9
	//   38   79:ldc2            #569 <String " with inBitmap ">
	//   39   82:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   40   85:pop             
		stringbuilder.append(getInBitmapString(options));
	//   41   86:aload           9
	//   42   88:aload_3         
	//   43   89:invokestatic    #571 <Method String getInBitmapString(android.graphics.BitmapFactory$Options)>
	//   44   92:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   45   95:pop             
		stringbuilder.append(" for [");
	//   46   96:aload           9
	//   47   98:ldc2            #573 <String " for [">
	//   48  101:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   49  104:pop             
		stringbuilder.append(k);
	//   50  105:aload           9
	//   51  107:iload           5
	//   52  109:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   53  112:pop             
		stringbuilder.append("x");
	//   54  113:aload           9
	//   55  115:ldc2            #341 <String "x">
	//   56  118:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   57  121:pop             
		stringbuilder.append(l);
	//   58  122:aload           9
	//   59  124:iload           6
	//   60  126:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   61  129:pop             
		stringbuilder.append("], sample size: ");
	//   62  130:aload           9
	//   63  132:ldc2            #575 <String "], sample size: ">
	//   64  135:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   65  138:pop             
		stringbuilder.append(options.inSampleSize);
	//   66  139:aload           9
	//   67  141:aload_3         
	//   68  142:getfield        #299 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
	//   69  145:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   70  148:pop             
		stringbuilder.append(", density: ");
	//   71  149:aload           9
	//   72  151:ldc2            #361 <String ", density: ">
	//   73  154:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   74  157:pop             
		stringbuilder.append(options.inDensity);
	//   75  158:aload           9
	//   76  160:aload_3         
	//   77  161:getfield        #327 <Field int android.graphics.BitmapFactory$Options.inDensity>
	//   78  164:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   79  167:pop             
		stringbuilder.append(", target density: ");
	//   80  168:aload           9
	//   81  170:ldc2            #359 <String ", target density: ">
	//   82  173:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   83  176:pop             
		stringbuilder.append(options.inTargetDensity);
	//   84  177:aload           9
	//   85  179:aload_3         
	//   86  180:getfield        #324 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
	//   87  183:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   88  186:pop             
		stringbuilder.append(", thread: ");
	//   89  187:aload           9
	//   90  189:ldc2            #577 <String ", thread: ">
	//   91  192:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   92  195:pop             
		stringbuilder.append(Thread.currentThread().getName());
	//   93  196:aload           9
	//   94  198:invokestatic    #583 <Method Thread Thread.currentThread()>
	//   95  201:invokevirtual   #586 <Method String Thread.getName()>
	//   96  204:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   97  207:pop             
		stringbuilder.append(", duration: ");
	//   98  208:aload           9
	//   99  210:ldc2            #588 <String ", duration: ">
	//  100  213:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//  101  216:pop             
		stringbuilder.append(LogTime.getElapsedMillis(l1));
	//  102  217:aload           9
	//  103  219:lload           7
	//  104  221:invokestatic    #592 <Method double LogTime.getElapsedMillis(long)>
	//  105  224:invokevirtual   #357 <Method StringBuilder StringBuilder.append(double)>
	//  106  227:pop             
		Log.v("Downsampler", stringbuilder.toString());
	//  107  228:ldc1            #36  <String "Downsampler">
	//  108  230:aload           9
	//  109  232:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  110  235:invokestatic    #365 <Method int Log.v(String, String)>
	//  111  238:pop             
	//  112  239:return          
	}

	private static IOException newIoExceptionForInBitmapAssertion(IllegalArgumentException illegalargumentexception, int i, int j, String s, android.graphics.BitmapFactory.Options options)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #220 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #221 <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("Exception decoding bitmap, outWidth: ");
	//    4    9:aload           5
	//    5   11:ldc2            #594 <String "Exception decoding bitmap, outWidth: ">
	//    6   14:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		stringbuilder.append(i);
	//    8   18:aload           5
	//    9   20:iload_1         
	//   10   21:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   11   24:pop             
		stringbuilder.append(", outHeight: ");
	//   12   25:aload           5
	//   13   27:ldc2            #596 <String ", outHeight: ">
	//   14   30:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
		stringbuilder.append(j);
	//   16   34:aload           5
	//   17   36:iload_2         
	//   18   37:invokevirtual   #339 <Method StringBuilder StringBuilder.append(int)>
	//   19   40:pop             
		stringbuilder.append(", outMimeType: ");
	//   20   41:aload           5
	//   21   43:ldc2            #598 <String ", outMimeType: ">
	//   22   46:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
		stringbuilder.append(s);
	//   24   50:aload           5
	//   25   52:aload_3         
	//   26   53:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
		stringbuilder.append(", inBitmap: ");
	//   28   57:aload           5
	//   29   59:ldc2            #600 <String ", inBitmap: ">
	//   30   62:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   31   65:pop             
		stringbuilder.append(getInBitmapString(options));
	//   32   66:aload           5
	//   33   68:aload           4
	//   34   70:invokestatic    #571 <Method String getInBitmapString(android.graphics.BitmapFactory$Options)>
	//   35   73:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   36   76:pop             
		return new IOException(stringbuilder.toString(), ((Throwable) (illegalargumentexception)));
	//   37   77:new             #190 <Class IOException>
	//   38   80:dup             
	//   39   81:aload           5
	//   40   83:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   41   86:aload_0         
	//   42   87:invokespecial   #603 <Method void IOException(String, Throwable)>
	//   43   90:areturn         
	}

	private static void releaseOptions(android.graphics.BitmapFactory.Options options)
	{
		resetOptions(options);
	//    0    0:aload_0         
	//    1    1:invokestatic    #554 <Method void resetOptions(android.graphics.BitmapFactory$Options)>
		synchronized(OPTIONS_QUEUE)
	//*   2    4:getstatic       #145 <Field Queue OPTIONS_QUEUE>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			OPTIONS_QUEUE.offer(((Object) (options)));
	//    6   10:getstatic       #145 <Field Queue OPTIONS_QUEUE>
	//    7   13:aload_0         
	//    8   14:invokeinterface #607 <Method boolean Queue.offer(Object)>
	//    9   19:pop             
		}
	//   10   20:aload_1         
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		options;
	//   13   23:astore_0        
		queue;
	//   14   24:aload_1         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		throw options;
	//   16   26:aload_0         
	//   17   27:athrow          
	}

	private static void resetOptions(android.graphics.BitmapFactory.Options options)
	{
		options.inTempStorage = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #611 <Field byte[] android.graphics.BitmapFactory$Options.inTempStorage>
		options.inDither = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #256 <Field boolean android.graphics.BitmapFactory$Options.inDither>
		options.inScaled = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #334 <Field boolean android.graphics.BitmapFactory$Options.inScaled>
		options.inSampleSize = 1;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #299 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		options.inPreferredConfig = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #252 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
		options.inJustDecodeBounds = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #466 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		options.inDensity = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #327 <Field int android.graphics.BitmapFactory$Options.inDensity>
		options.inTargetDensity = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #324 <Field int android.graphics.BitmapFactory$Options.inTargetDensity>
		options.outWidth = 0;
	//   24   40:aload_0         
	//   25   41:iconst_0        
	//   26   42:putfield        #477 <Field int android.graphics.BitmapFactory$Options.outWidth>
		options.outHeight = 0;
	//   27   45:aload_0         
	//   28   46:iconst_0        
	//   29   47:putfield        #480 <Field int android.graphics.BitmapFactory$Options.outHeight>
		options.outMimeType = null;
	//   30   50:aload_0         
	//   31   51:aconst_null     
	//   32   52:putfield        #284 <Field String android.graphics.BitmapFactory$Options.outMimeType>
		options.inBitmap = null;
	//   33   55:aload_0         
	//   34   56:aconst_null     
	//   35   57:putfield        #510 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
		options.inMutable = true;
	//   36   60:aload_0         
	//   37   61:iconst_1        
	//   38   62:putfield        #614 <Field boolean android.graphics.BitmapFactory$Options.inMutable>
	//   39   65:return          
	}

	private static int round(double d)
	{
		return (int)(d + 0.5D);
	//    0    0:dload_0         
	//    1    1:ldc2w           #615 <Double 0.5D>
	//    2    4:dadd            
	//    3    5:d2i             
	//    4    6:ireturn         
	}

	private static void setInBitmap(android.graphics.BitmapFactory.Options options, BitmapPool bitmappool, int i, int j)
	{
		android.graphics.Bitmap.Config config;
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #202 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          28
		{
			if(options.inPreferredConfig == android.graphics.Bitmap.Config.HARDWARE)
	//*   3    8:aload_0         
	//*   4    9:getfield        #252 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
	//*   5   12:getstatic       #620 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.HARDWARE>
	//*   6   15:if_acmpne       19
				return;
	//    7   18:return          
			config = options.outConfig;
	//    8   19:aload_0         
	//    9   20:getfield        #623 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.outConfig>
	//   10   23:astore          4
		} else
	//*  11   25:goto            31
		{
			config = null;
	//   12   28:aconst_null     
	//   13   29:astore          4
		}
		android.graphics.Bitmap.Config config1 = config;
	//   14   31:aload           4
	//   15   33:astore          5
		if(config == null)
	//*  16   35:aload           4
	//*  17   37:ifnonnull       46
			config1 = options.inPreferredConfig;
	//   18   40:aload_0         
	//   19   41:getfield        #252 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
	//   20   44:astore          5
		options.inBitmap = bitmappool.getDirty(i, j, config1);
	//   21   46:aload_0         
	//   22   47:aload_1         
	//   23   48:iload_2         
	//   24   49:iload_3         
	//   25   50:aload           5
	//   26   52:invokeinterface #627 <Method Bitmap BitmapPool.getDirty(int, int, android.graphics.Bitmap$Config)>
	//   27   57:putfield        #510 <Field Bitmap android.graphics.BitmapFactory$Options.inBitmap>
	//   28   60:return          
	}

	private boolean shouldUsePool(com.bumptech.glide.load.ImageHeaderParser.ImageType imagetype)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #202 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          10
			return true;
	//    3    8:iconst_1        
	//    4    9:ireturn         
		else
			return TYPES_THAT_USE_POOL_PRE_KITKAT.contains(((Object) (imagetype)));
	//    5   10:getstatic       #137 <Field Set TYPES_THAT_USE_POOL_PRE_KITKAT>
	//    6   13:aload_1         
	//    7   14:invokeinterface #290 <Method boolean Set.contains(Object)>
	//    8   19:ireturn         
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
	//    5    6:getstatic       #117 <Field Downsampler$DecodeCallbacks EMPTY_CALLBACKS>
	//    6    9:invokevirtual   #632 <Method Resource decode(InputStream, int, int, Options, Downsampler$DecodeCallbacks)>
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
	//    1    1:invokevirtual   #636 <Method boolean InputStream.markSupported()>
	//    2    4:ldc2            #638 <String "You must provide an InputStream that supports mark()">
	//    3    7:invokestatic    #642 <Method void Preconditions.checkArgument(boolean, String)>
		abyte0 = (byte[])byteArrayPool.get(0x10000, [B);
	//    4   10:aload_0         
	//    5   11:getfield        #176 <Field ArrayPool byteArrayPool>
	//    6   14:ldc2            #643 <Int 0x10000>
	//    7   17:ldc2            #644 <Class byte[]>
	//    8   20:invokeinterface #648 <Method Object ArrayPool.get(int, Class)>
	//    9   25:checkcast       #644 <Class byte[]>
	//   10   28:astore          8
		options1 = getDefaultOptions();
	//   11   30:invokestatic    #650 <Method android.graphics.BitmapFactory$Options getDefaultOptions()>
	//   12   33:astore          9
		options1.inTempStorage = abyte0;
	//   13   35:aload           9
	//   14   37:aload           8
	//   15   39:putfield        #611 <Field byte[] android.graphics.BitmapFactory$Options.inTempStorage>
		decodeformat = (DecodeFormat)options.get(DECODE_FORMAT);
	//   16   42:aload           4
	//   17   44:getstatic       #70  <Field Option DECODE_FORMAT>
	//   18   47:invokevirtual   #655 <Method Object Options.get(Option)>
	//   19   50:checkcast       #58  <Class DecodeFormat>
	//   20   53:astore          10
		downsamplestrategy = (DownsampleStrategy)options.get(DownsampleStrategy.OPTION);
	//   21   55:aload           4
	//   22   57:getstatic       #75  <Field Option DownsampleStrategy.OPTION>
	//   23   60:invokevirtual   #655 <Method Object Options.get(Option)>
	//   24   63:checkcast       #72  <Class DownsampleStrategy>
	//   25   66:astore          11
		flag1 = ((Boolean)options.get(FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS)).booleanValue();
	//   26   68:aload           4
	//   27   70:getstatic       #87  <Field Option FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS>
	//   28   73:invokevirtual   #655 <Method Object Options.get(Option)>
	//   29   76:checkcast       #81  <Class Boolean>
	//   30   79:invokevirtual   #658 <Method boolean Boolean.booleanValue()>
	//   31   82:istore          7
		if(options.get(ALLOW_HARDWARE_CONFIG) != null && ((Boolean)options.get(ALLOW_HARDWARE_CONFIG)).booleanValue())
	//*  32   84:aload           4
	//*  33   86:getstatic       #91  <Field Option ALLOW_HARDWARE_CONFIG>
	//*  34   89:invokevirtual   #655 <Method Object Options.get(Option)>
	//*  35   92:ifnull          118
	//*  36   95:aload           4
	//*  37   97:getstatic       #91  <Field Option ALLOW_HARDWARE_CONFIG>
	//*  38  100:invokevirtual   #655 <Method Object Options.get(Option)>
	//*  39  103:checkcast       #81  <Class Boolean>
	//*  40  106:invokevirtual   #658 <Method boolean Boolean.booleanValue()>
	//*  41  109:ifeq            118
			flag = true;
	//   42  112:iconst_1        
	//   43  113:istore          6
		else
	//*  44  115:goto            121
			flag = false;
	//   45  118:iconst_0        
	//   46  119:istore          6
		inputstream = ((InputStream) (BitmapResource.obtain(decodeFromWrappedStreams(inputstream, options1, downsamplestrategy, decodeformat, flag, i, j, flag1, decodecallbacks), bitmapPool)));
	//   47  121:aload_0         
	//   48  122:aload_1         
	//   49  123:aload           9
	//   50  125:aload           11
	//   51  127:aload           10
	//   52  129:iload           6
	//   53  131:iload_2         
	//   54  132:iload_3         
	//   55  133:iload           7
	//   56  135:aload           5
	//   57  137:invokespecial   #660 <Method Bitmap decodeFromWrappedStreams(InputStream, android.graphics.BitmapFactory$Options, DownsampleStrategy, DecodeFormat, boolean, int, int, boolean, Downsampler$DecodeCallbacks)>
	//   58  140:aload_0         
	//   59  141:getfield        #172 <Field BitmapPool bitmapPool>
	//   60  144:invokestatic    #666 <Method BitmapResource BitmapResource.obtain(Bitmap, BitmapPool)>
	//   61  147:astore_1        
		releaseOptions(options1);
	//   62  148:aload           9
	//   63  150:invokestatic    #668 <Method void releaseOptions(android.graphics.BitmapFactory$Options)>
		byteArrayPool.put(((Object) (abyte0)));
	//   64  153:aload_0         
	//   65  154:getfield        #176 <Field ArrayPool byteArrayPool>
	//   66  157:aload           8
	//   67  159:invokeinterface #671 <Method void ArrayPool.put(Object)>
		return ((Resource) (inputstream));
	//   68  164:aload_1         
	//   69  165:areturn         
		inputstream;
	//   70  166:astore_1        
		releaseOptions(options1);
	//   71  167:aload           9
	//   72  169:invokestatic    #668 <Method void releaseOptions(android.graphics.BitmapFactory$Options)>
		byteArrayPool.put(((Object) (abyte0)));
	//   73  172:aload_0         
	//   74  173:getfield        #176 <Field ArrayPool byteArrayPool>
	//   75  176:aload           8
	//   76  178:invokeinterface #671 <Method void ArrayPool.put(Object)>
		throw inputstream;
	//   77  183:aload_1         
	//   78  184:athrow          
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

	public static final Option ALLOW_HARDWARE_CONFIG = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", ((Object) (Boolean.valueOf(false))));
	public static final Option DECODE_FORMAT;
	public static final Option DOWNSAMPLE_STRATEGY;
	private static final DecodeCallbacks EMPTY_CALLBACKS = new DecodeCallbacks() {

		public void onDecodeComplete(BitmapPool bitmappool, Bitmap bitmap)
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
	private static final int MARK_POSITION = 0xa00000;
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
	//    0    0:ldc1            #56  <String "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat">
	//    1    2:getstatic       #62  <Field DecodeFormat DecodeFormat.DEFAULT>
	//    2    5:invokestatic    #68  <Method Option Option.memory(String, Object)>
	//    3    8:putstatic       #70  <Field Option DECODE_FORMAT>
		DOWNSAMPLE_STRATEGY = DownsampleStrategy.OPTION;
	//    4   11:getstatic       #75  <Field Option DownsampleStrategy.OPTION>
	//    5   14:putstatic       #77  <Field Option DOWNSAMPLE_STRATEGY>
	//    6   17:ldc1            #79  <String "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize">
	//    7   19:iconst_0        
	//    8   20:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//    9   23:invokestatic    #68  <Method Option Option.memory(String, Object)>
	//   10   26:putstatic       #87  <Field Option FIX_BITMAP_SIZE_TO_REQUESTED_DIMENSIONS>
	//   11   29:ldc1            #89  <String "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode">
	//   12   31:iconst_0        
	//   13   32:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//   14   35:invokestatic    #68  <Method Option Option.memory(String, Object)>
	//   15   38:putstatic       #91  <Field Option ALLOW_HARDWARE_CONFIG>
	//   16   41:new             #93  <Class HashSet>
	//   17   44:dup             
	//   18   45:iconst_2        
	//   19   46:anewarray       String[]
	//   20   49:dup             
	//   21   50:iconst_0        
	//   22   51:ldc1            #41  <String "image/vnd.wap.wbmp">
	//   23   53:aastore         
	//   24   54:dup             
	//   25   55:iconst_1        
	//   26   56:ldc1            #24  <String "image/x-ico">
	//   27   58:aastore         
	//   28   59:invokestatic    #101 <Method List Arrays.asList(Object[])>
	//   29   62:invokespecial   #105 <Method void HashSet(java.util.Collection)>
	//   30   65:invokestatic    #111 <Method Set Collections.unmodifiableSet(Set)>
	//   31   68:putstatic       #113 <Field Set NO_DOWNSAMPLE_PRE_N_MIME_TYPES>
	//   32   71:new             #6   <Class Downsampler$1>
	//   33   74:dup             
	//   34   75:invokespecial   #115 <Method void Downsampler$1()>
	//   35   78:putstatic       #117 <Field Downsampler$DecodeCallbacks EMPTY_CALLBACKS>
		TYPES_THAT_USE_POOL_PRE_KITKAT = Collections.unmodifiableSet(((Set) (EnumSet.of(((Enum) (com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG)), ((Enum) (com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A)), ((Enum) (com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG))))));
	//   36   81:getstatic       #123 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG>
	//   37   84:getstatic       #126 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A>
	//   38   87:getstatic       #129 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG>
	//   39   90:invokestatic    #135 <Method EnumSet EnumSet.of(Enum, Enum, Enum)>
	//   40   93:invokestatic    #111 <Method Set Collections.unmodifiableSet(Set)>
	//   41   96:putstatic       #137 <Field Set TYPES_THAT_USE_POOL_PRE_KITKAT>
	//   42   99:iconst_0        
	//   43  100:invokestatic    #143 <Method Queue Util.createQueue(int)>
	//   44  103:putstatic       #145 <Field Queue OPTIONS_QUEUE>
	//*  45  106:return          
	}
}
