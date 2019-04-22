// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.*;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.*;
import java.util.Map;

public abstract class BaseRequestOptions
	implements Cloneable
{

	public BaseRequestOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		sizeMultiplier = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #54  <Field float sizeMultiplier>
		diskCacheStrategy = DiskCacheStrategy.AUTOMATIC;
	//    5    9:aload_0         
	//    6   10:getstatic       #59  <Field DiskCacheStrategy DiskCacheStrategy.AUTOMATIC>
	//    7   13:putfield        #61  <Field DiskCacheStrategy diskCacheStrategy>
		priority = Priority.NORMAL;
	//    8   16:aload_0         
	//    9   17:getstatic       #66  <Field Priority Priority.NORMAL>
	//   10   20:putfield        #68  <Field Priority priority>
		isCacheable = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #70  <Field boolean isCacheable>
		overrideHeight = -1;
	//   14   28:aload_0         
	//   15   29:iconst_m1       
	//   16   30:putfield        #72  <Field int overrideHeight>
		overrideWidth = -1;
	//   17   33:aload_0         
	//   18   34:iconst_m1       
	//   19   35:putfield        #74  <Field int overrideWidth>
		signature = ((Key) (EmptySignature.obtain()));
	//   20   38:aload_0         
	//   21   39:invokestatic    #80  <Method EmptySignature EmptySignature.obtain()>
	//   22   42:putfield        #82  <Field Key signature>
		isTransformationAllowed = true;
	//   23   45:aload_0         
	//   24   46:iconst_1        
	//   25   47:putfield        #84  <Field boolean isTransformationAllowed>
		options = new Options();
	//   26   50:aload_0         
	//   27   51:new             #86  <Class Options>
	//   28   54:dup             
	//   29   55:invokespecial   #87  <Method void Options()>
	//   30   58:putfield        #89  <Field Options options>
		transformations = ((Map) (new CachedHashCodeArrayMap()));
	//   31   61:aload_0         
	//   32   62:new             #91  <Class CachedHashCodeArrayMap>
	//   33   65:dup             
	//   34   66:invokespecial   #92  <Method void CachedHashCodeArrayMap()>
	//   35   69:putfield        #94  <Field Map transformations>
		resourceClass = java/lang/Object;
	//   36   72:aload_0         
	//   37   73:ldc1            #5   <Class Object>
	//   38   75:putfield        #96  <Field Class resourceClass>
		isScaleOnlyOrNoTransform = true;
	//   39   78:aload_0         
	//   40   79:iconst_1        
	//   41   80:putfield        #98  <Field boolean isScaleOnlyOrNoTransform>
	//   42   83:return          
	}

	private boolean isSet(int i)
	{
		return isSet(fields, i);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int fields>
	//    2    4:iload_1         
	//    3    5:invokestatic    #106 <Method boolean isSet(int, int)>
	//    4    8:ireturn         
	}

	private static boolean isSet(int i, int j)
	{
		return (i & j) != 0;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iand            
	//    3    3:ifeq            8
	//    4    6:iconst_1        
	//    5    7:ireturn         
	//    6    8:iconst_0        
	//    7    9:ireturn         
	}

	private BaseRequestOptions optionalScaleOnlyTransform(DownsampleStrategy downsamplestrategy, Transformation transformation)
	{
		return scaleOnlyTransform(downsamplestrategy, transformation, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #112 <Method BaseRequestOptions scaleOnlyTransform(DownsampleStrategy, Transformation, boolean)>
	//    5    7:areturn         
	}

	private BaseRequestOptions scaleOnlyTransform(DownsampleStrategy downsamplestrategy, Transformation transformation, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            14
			downsamplestrategy = ((DownsampleStrategy) (transform(downsamplestrategy, transformation)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #119 <Method BaseRequestOptions transform(DownsampleStrategy, Transformation)>
	//    6   10:astore_1        
		else
	//*   7   11:goto            21
			downsamplestrategy = ((DownsampleStrategy) (optionalTransform(downsamplestrategy, transformation)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #122 <Method BaseRequestOptions optionalTransform(DownsampleStrategy, Transformation)>
	//   12   20:astore_1        
		downsamplestrategy.isScaleOnlyOrNoTransform = true;
	//   13   21:aload_1         
	//   14   22:iconst_1        
	//   15   23:putfield        #98  <Field boolean isScaleOnlyOrNoTransform>
		return ((BaseRequestOptions) (downsamplestrategy));
	//   16   26:aload_1         
	//   17   27:areturn         
	}

	private BaseRequestOptions self()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private BaseRequestOptions selfOrThrowIfLocked()
	{
		if(!isLocked)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field boolean isLocked>
	//*   2    4:ifne            12
			return self();
	//    3    7:aload_0         
	//    4    8:invokespecial   #131 <Method BaseRequestOptions self()>
	//    5   11:areturn         
		else
			throw new IllegalStateException("You cannot modify locked T, consider clone()");
	//    6   12:new             #133 <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #135 <String "You cannot modify locked T, consider clone()">
	//    9   18:invokespecial   #138 <Method void IllegalStateException(String)>
	//   10   21:athrow          
	}

	public BaseRequestOptions apply(BaseRequestOptions baserequestoptions)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
			return clone().apply(baserequestoptions);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #148 <Method BaseRequestOptions apply(BaseRequestOptions)>
	//    7   15:areturn         
		if(isSet(baserequestoptions.fields, 2))
	//*   8   16:aload_1         
	//*   9   17:getfield        #103 <Field int fields>
	//*  10   20:iconst_2        
	//*  11   21:invokestatic    #106 <Method boolean isSet(int, int)>
	//*  12   24:ifeq            35
			sizeMultiplier = baserequestoptions.sizeMultiplier;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:getfield        #54  <Field float sizeMultiplier>
	//   16   32:putfield        #54  <Field float sizeMultiplier>
		if(isSet(baserequestoptions.fields, 0x40000))
	//*  17   35:aload_1         
	//*  18   36:getfield        #103 <Field int fields>
	//*  19   39:ldc1            #149 <Int 0x40000>
	//*  20   41:invokestatic    #106 <Method boolean isSet(int, int)>
	//*  21   44:ifeq            55
			useUnlimitedSourceGeneratorsPool = baserequestoptions.useUnlimitedSourceGeneratorsPool;
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:getfield        #151 <Field boolean useUnlimitedSourceGeneratorsPool>
	//   25   52:putfield        #151 <Field boolean useUnlimitedSourceGeneratorsPool>
		if(isSet(baserequestoptions.fields, 0x100000))
	//*  26   55:aload_1         
	//*  27   56:getfield        #103 <Field int fields>
	//*  28   59:ldc1            #152 <Int 0x100000>
	//*  29   61:invokestatic    #106 <Method boolean isSet(int, int)>
	//*  30   64:ifeq            75
			useAnimationPool = baserequestoptions.useAnimationPool;
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:getfield        #154 <Field boolean useAnimationPool>
	//   34   72:putfield        #154 <Field boolean useAnimationPool>
		if(isSet(baserequestoptions.fields, 4))
	//*  35   75:aload_1         
	//*  36   76:getfield        #103 <Field int fields>
	//*  37   79:iconst_4        
	//*  38   80:invokestatic    #106 <Method boolean isSet(int, int)>
	//*  39   83:ifeq            94
			diskCacheStrategy = baserequestoptions.diskCacheStrategy;
	//   40   86:aload_0         
	//   41   87:aload_1         
	//   42   88:getfield        #61  <Field DiskCacheStrategy diskCacheStrategy>
	//   43   91:putfield        #61  <Field DiskCacheStrategy diskCacheStrategy>
		if(isSet(baserequestoptions.fields, 8))
	//*  44   94:aload_1         
	//*  45   95:getfield        #103 <Field int fields>
	//*  46   98:bipush          8
	//*  47  100:invokestatic    #106 <Method boolean isSet(int, int)>
	//*  48  103:ifeq            114
			priority = baserequestoptions.priority;
	//   49  106:aload_0         
	//   50  107:aload_1         
	//   51  108:getfield        #68  <Field Priority priority>
	//   52  111:putfield        #68  <Field Priority priority>
		if(isSet(baserequestoptions.fields, 16))
	//*  53  114:aload_1         
	//*  54  115:getfield        #103 <Field int fields>
	//*  55  118:bipush          16
	//*  56  120:invokestatic    #106 <Method boolean isSet(int, int)>
	//*  57  123:ifeq            150
		{
			errorPlaceholder = baserequestoptions.errorPlaceholder;
	//   58  126:aload_0         
	//   59  127:aload_1         
	//   60  128:getfield        #156 <Field Drawable errorPlaceholder>
	//   61  131:putfield        #156 <Field Drawable errorPlaceholder>
			errorId = 0;
	//   62  134:aload_0         
	//   63  135:iconst_0        
	//   64  136:putfield        #158 <Field int errorId>
			fields = fields & 0xffffffdf;
	//   65  139:aload_0         
	//   66  140:aload_0         
	//   67  141:getfield        #103 <Field int fields>
	//   68  144:bipush          -33
	//   69  146:iand            
	//   70  147:putfield        #103 <Field int fields>
		}
		if(isSet(baserequestoptions.fields, 32))
	//*  71  150:aload_1         
	//*  72  151:getfield        #103 <Field int fields>
	//*  73  154:bipush          32
	//*  74  156:invokestatic    #106 <Method boolean isSet(int, int)>
	//*  75  159:ifeq            186
		{
			errorId = baserequestoptions.errorId;
	//   76  162:aload_0         
	//   77  163:aload_1         
	//   78  164:getfield        #158 <Field int errorId>
	//   79  167:putfield        #158 <Field int errorId>
			errorPlaceholder = null;
	//   80  170:aload_0         
	//   81  171:aconst_null     
	//   82  172:putfield        #156 <Field Drawable errorPlaceholder>
			fields = fields & 0xffffffef;
	//   83  175:aload_0         
	//   84  176:aload_0         
	//   85  177:getfield        #103 <Field int fields>
	//   86  180:bipush          -17
	//   87  182:iand            
	//   88  183:putfield        #103 <Field int fields>
		}
		if(isSet(baserequestoptions.fields, 64))
	//*  89  186:aload_1         
	//*  90  187:getfield        #103 <Field int fields>
	//*  91  190:bipush          64
	//*  92  192:invokestatic    #106 <Method boolean isSet(int, int)>
	//*  93  195:ifeq            223
		{
			placeholderDrawable = baserequestoptions.placeholderDrawable;
	//   94  198:aload_0         
	//   95  199:aload_1         
	//   96  200:getfield        #160 <Field Drawable placeholderDrawable>
	//   97  203:putfield        #160 <Field Drawable placeholderDrawable>
			placeholderId = 0;
	//   98  206:aload_0         
	//   99  207:iconst_0        
	//  100  208:putfield        #162 <Field int placeholderId>
			fields = fields & 0xffffff7f;
	//  101  211:aload_0         
	//  102  212:aload_0         
	//  103  213:getfield        #103 <Field int fields>
	//  104  216:sipush          -129
	//  105  219:iand            
	//  106  220:putfield        #103 <Field int fields>
		}
		if(isSet(baserequestoptions.fields, 128))
	//* 107  223:aload_1         
	//* 108  224:getfield        #103 <Field int fields>
	//* 109  227:sipush          128
	//* 110  230:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 111  233:ifeq            260
		{
			placeholderId = baserequestoptions.placeholderId;
	//  112  236:aload_0         
	//  113  237:aload_1         
	//  114  238:getfield        #162 <Field int placeholderId>
	//  115  241:putfield        #162 <Field int placeholderId>
			placeholderDrawable = null;
	//  116  244:aload_0         
	//  117  245:aconst_null     
	//  118  246:putfield        #160 <Field Drawable placeholderDrawable>
			fields = fields & 0xffffffbf;
	//  119  249:aload_0         
	//  120  250:aload_0         
	//  121  251:getfield        #103 <Field int fields>
	//  122  254:bipush          -65
	//  123  256:iand            
	//  124  257:putfield        #103 <Field int fields>
		}
		if(isSet(baserequestoptions.fields, 256))
	//* 125  260:aload_1         
	//* 126  261:getfield        #103 <Field int fields>
	//* 127  264:sipush          256
	//* 128  267:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 129  270:ifeq            281
			isCacheable = baserequestoptions.isCacheable;
	//  130  273:aload_0         
	//  131  274:aload_1         
	//  132  275:getfield        #70  <Field boolean isCacheable>
	//  133  278:putfield        #70  <Field boolean isCacheable>
		if(isSet(baserequestoptions.fields, 512))
	//* 134  281:aload_1         
	//* 135  282:getfield        #103 <Field int fields>
	//* 136  285:sipush          512
	//* 137  288:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 138  291:ifeq            310
		{
			overrideWidth = baserequestoptions.overrideWidth;
	//  139  294:aload_0         
	//  140  295:aload_1         
	//  141  296:getfield        #74  <Field int overrideWidth>
	//  142  299:putfield        #74  <Field int overrideWidth>
			overrideHeight = baserequestoptions.overrideHeight;
	//  143  302:aload_0         
	//  144  303:aload_1         
	//  145  304:getfield        #72  <Field int overrideHeight>
	//  146  307:putfield        #72  <Field int overrideHeight>
		}
		if(isSet(baserequestoptions.fields, 1024))
	//* 147  310:aload_1         
	//* 148  311:getfield        #103 <Field int fields>
	//* 149  314:sipush          1024
	//* 150  317:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 151  320:ifeq            331
			signature = baserequestoptions.signature;
	//  152  323:aload_0         
	//  153  324:aload_1         
	//  154  325:getfield        #82  <Field Key signature>
	//  155  328:putfield        #82  <Field Key signature>
		if(isSet(baserequestoptions.fields, 4096))
	//* 156  331:aload_1         
	//* 157  332:getfield        #103 <Field int fields>
	//* 158  335:sipush          4096
	//* 159  338:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 160  341:ifeq            352
			resourceClass = baserequestoptions.resourceClass;
	//  161  344:aload_0         
	//  162  345:aload_1         
	//  163  346:getfield        #96  <Field Class resourceClass>
	//  164  349:putfield        #96  <Field Class resourceClass>
		if(isSet(baserequestoptions.fields, 8192))
	//* 165  352:aload_1         
	//* 166  353:getfield        #103 <Field int fields>
	//* 167  356:sipush          8192
	//* 168  359:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 169  362:ifeq            390
		{
			fallbackDrawable = baserequestoptions.fallbackDrawable;
	//  170  365:aload_0         
	//  171  366:aload_1         
	//  172  367:getfield        #164 <Field Drawable fallbackDrawable>
	//  173  370:putfield        #164 <Field Drawable fallbackDrawable>
			fallbackId = 0;
	//  174  373:aload_0         
	//  175  374:iconst_0        
	//  176  375:putfield        #166 <Field int fallbackId>
			fields = fields & 0xffffbfff;
	//  177  378:aload_0         
	//  178  379:aload_0         
	//  179  380:getfield        #103 <Field int fields>
	//  180  383:sipush          -16385
	//  181  386:iand            
	//  182  387:putfield        #103 <Field int fields>
		}
		if(isSet(baserequestoptions.fields, 16384))
	//* 183  390:aload_1         
	//* 184  391:getfield        #103 <Field int fields>
	//* 185  394:sipush          16384
	//* 186  397:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 187  400:ifeq            428
		{
			fallbackId = baserequestoptions.fallbackId;
	//  188  403:aload_0         
	//  189  404:aload_1         
	//  190  405:getfield        #166 <Field int fallbackId>
	//  191  408:putfield        #166 <Field int fallbackId>
			fallbackDrawable = null;
	//  192  411:aload_0         
	//  193  412:aconst_null     
	//  194  413:putfield        #164 <Field Drawable fallbackDrawable>
			fields = fields & 0xffffdfff;
	//  195  416:aload_0         
	//  196  417:aload_0         
	//  197  418:getfield        #103 <Field int fields>
	//  198  421:sipush          -8193
	//  199  424:iand            
	//  200  425:putfield        #103 <Field int fields>
		}
		if(isSet(baserequestoptions.fields, 32768))
	//* 201  428:aload_1         
	//* 202  429:getfield        #103 <Field int fields>
	//* 203  432:ldc1            #167 <Int 32768>
	//* 204  434:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 205  437:ifeq            448
			theme = baserequestoptions.theme;
	//  206  440:aload_0         
	//  207  441:aload_1         
	//  208  442:getfield        #169 <Field android.content.res.Resources$Theme theme>
	//  209  445:putfield        #169 <Field android.content.res.Resources$Theme theme>
		if(isSet(baserequestoptions.fields, 0x10000))
	//* 210  448:aload_1         
	//* 211  449:getfield        #103 <Field int fields>
	//* 212  452:ldc1            #170 <Int 0x10000>
	//* 213  454:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 214  457:ifeq            468
			isTransformationAllowed = baserequestoptions.isTransformationAllowed;
	//  215  460:aload_0         
	//  216  461:aload_1         
	//  217  462:getfield        #84  <Field boolean isTransformationAllowed>
	//  218  465:putfield        #84  <Field boolean isTransformationAllowed>
		if(isSet(baserequestoptions.fields, 0x20000))
	//* 219  468:aload_1         
	//* 220  469:getfield        #103 <Field int fields>
	//* 221  472:ldc1            #171 <Int 0x20000>
	//* 222  474:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 223  477:ifeq            488
			isTransformationRequired = baserequestoptions.isTransformationRequired;
	//  224  480:aload_0         
	//  225  481:aload_1         
	//  226  482:getfield        #173 <Field boolean isTransformationRequired>
	//  227  485:putfield        #173 <Field boolean isTransformationRequired>
		if(isSet(baserequestoptions.fields, 2048))
	//* 228  488:aload_1         
	//* 229  489:getfield        #103 <Field int fields>
	//* 230  492:sipush          2048
	//* 231  495:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 232  498:ifeq            522
		{
			transformations.putAll(baserequestoptions.transformations);
	//  233  501:aload_0         
	//  234  502:getfield        #94  <Field Map transformations>
	//  235  505:aload_1         
	//  236  506:getfield        #94  <Field Map transformations>
	//  237  509:invokeinterface #179 <Method void Map.putAll(Map)>
			isScaleOnlyOrNoTransform = baserequestoptions.isScaleOnlyOrNoTransform;
	//  238  514:aload_0         
	//  239  515:aload_1         
	//  240  516:getfield        #98  <Field boolean isScaleOnlyOrNoTransform>
	//  241  519:putfield        #98  <Field boolean isScaleOnlyOrNoTransform>
		}
		if(isSet(baserequestoptions.fields, 0x80000))
	//* 242  522:aload_1         
	//* 243  523:getfield        #103 <Field int fields>
	//* 244  526:ldc1            #180 <Int 0x80000>
	//* 245  528:invokestatic    #106 <Method boolean isSet(int, int)>
	//* 246  531:ifeq            542
			onlyRetrieveFromCache = baserequestoptions.onlyRetrieveFromCache;
	//  247  534:aload_0         
	//  248  535:aload_1         
	//  249  536:getfield        #182 <Field boolean onlyRetrieveFromCache>
	//  250  539:putfield        #182 <Field boolean onlyRetrieveFromCache>
		if(!isTransformationAllowed)
	//* 251  542:aload_0         
	//* 252  543:getfield        #84  <Field boolean isTransformationAllowed>
	//* 253  546:ifne            591
		{
			transformations.clear();
	//  254  549:aload_0         
	//  255  550:getfield        #94  <Field Map transformations>
	//  256  553:invokeinterface #185 <Method void Map.clear()>
			fields = fields & 0xfffff7ff;
	//  257  558:aload_0         
	//  258  559:aload_0         
	//  259  560:getfield        #103 <Field int fields>
	//  260  563:sipush          -2049
	//  261  566:iand            
	//  262  567:putfield        #103 <Field int fields>
			isTransformationRequired = false;
	//  263  570:aload_0         
	//  264  571:iconst_0        
	//  265  572:putfield        #173 <Field boolean isTransformationRequired>
			fields = fields & 0xfffdffff;
	//  266  575:aload_0         
	//  267  576:aload_0         
	//  268  577:getfield        #103 <Field int fields>
	//  269  580:ldc1            #186 <Int 0xfffdffff>
	//  270  582:iand            
	//  271  583:putfield        #103 <Field int fields>
			isScaleOnlyOrNoTransform = true;
	//  272  586:aload_0         
	//  273  587:iconst_1        
	//  274  588:putfield        #98  <Field boolean isScaleOnlyOrNoTransform>
		}
		fields = fields | baserequestoptions.fields;
	//  275  591:aload_0         
	//  276  592:aload_0         
	//  277  593:getfield        #103 <Field int fields>
	//  278  596:aload_1         
	//  279  597:getfield        #103 <Field int fields>
	//  280  600:ior             
	//  281  601:putfield        #103 <Field int fields>
		options.putAll(baserequestoptions.options);
	//  282  604:aload_0         
	//  283  605:getfield        #89  <Field Options options>
	//  284  608:aload_1         
	//  285  609:getfield        #89  <Field Options options>
	//  286  612:invokevirtual   #189 <Method void Options.putAll(Options)>
		return selfOrThrowIfLocked();
	//  287  615:aload_0         
	//  288  616:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//  289  619:areturn         
	}

	public BaseRequestOptions autoClone()
	{
		if(isLocked && !isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field boolean isLocked>
	//*   2    4:ifeq            27
	//*   3    7:aload_0         
	//*   4    8:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   5   11:ifeq            17
	//*   6   14:goto            27
		{
			throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
	//    7   17:new             #133 <Class IllegalStateException>
	//    8   20:dup             
	//    9   21:ldc1            #195 <String "You cannot auto lock an already locked options object, try clone() first">
	//   10   23:invokespecial   #138 <Method void IllegalStateException(String)>
	//   11   26:athrow          
		} else
		{
			isAutoCloneEnabled = true;
	//   12   27:aload_0         
	//   13   28:iconst_1        
	//   14   29:putfield        #143 <Field boolean isAutoCloneEnabled>
			return lock();
	//   15   32:aload_0         
	//   16   33:invokevirtual   #198 <Method BaseRequestOptions lock()>
	//   17   36:areturn         
		}
	}

	public BaseRequestOptions clone()
	{
		BaseRequestOptions baserequestoptions;
		try
		{
			baserequestoptions = (BaseRequestOptions)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #203 <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class BaseRequestOptions>
	//    3    7:astore_1        
			baserequestoptions.options = new Options();
	//    4    8:aload_1         
	//    5    9:new             #86  <Class Options>
	//    6   12:dup             
	//    7   13:invokespecial   #87  <Method void Options()>
	//    8   16:putfield        #89  <Field Options options>
			baserequestoptions.options.putAll(options);
	//    9   19:aload_1         
	//   10   20:getfield        #89  <Field Options options>
	//   11   23:aload_0         
	//   12   24:getfield        #89  <Field Options options>
	//   13   27:invokevirtual   #189 <Method void Options.putAll(Options)>
			baserequestoptions.transformations = ((Map) (new CachedHashCodeArrayMap()));
	//   14   30:aload_1         
	//   15   31:new             #91  <Class CachedHashCodeArrayMap>
	//   16   34:dup             
	//   17   35:invokespecial   #92  <Method void CachedHashCodeArrayMap()>
	//   18   38:putfield        #94  <Field Map transformations>
			baserequestoptions.transformations.putAll(transformations);
	//   19   41:aload_1         
	//   20   42:getfield        #94  <Field Map transformations>
	//   21   45:aload_0         
	//   22   46:getfield        #94  <Field Map transformations>
	//   23   49:invokeinterface #179 <Method void Map.putAll(Map)>
			baserequestoptions.isLocked = false;
	//   24   54:aload_1         
	//   25   55:iconst_0        
	//   26   56:putfield        #129 <Field boolean isLocked>
			baserequestoptions.isAutoCloneEnabled = false;
	//   27   59:aload_1         
	//   28   60:iconst_0        
	//   29   61:putfield        #143 <Field boolean isAutoCloneEnabled>
		}
	//*  30   64:aload_1         
	//*  31   65:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  32   66:astore_1        
		{
			throw new RuntimeException(((Throwable) (clonenotsupportedexception)));
	//   33   67:new             #205 <Class RuntimeException>
	//   34   70:dup             
	//   35   71:aload_1         
	//   36   72:invokespecial   #208 <Method void RuntimeException(Throwable)>
	//   37   75:athrow          
		}
		return baserequestoptions;
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    2    4:areturn         
	}

	public BaseRequestOptions decode(Class class1)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().decode(class1);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #213 <Method BaseRequestOptions decode(Class)>
	//    7   15:areturn         
		} else
		{
			resourceClass = (Class)Preconditions.checkNotNull(((Object) (class1)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #219 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #221 <Class Class>
	//   12   24:putfield        #96  <Field Class resourceClass>
			fields = fields | 0x1000;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field int fields>
	//   16   32:sipush          4096
	//   17   35:ior             
	//   18   36:putfield        #103 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   39:aload_0         
	//   20   40:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   21   43:areturn         
		}
	}

	public BaseRequestOptions diskCacheStrategy(DiskCacheStrategy diskcachestrategy)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().diskCacheStrategy(diskcachestrategy);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #225 <Method BaseRequestOptions diskCacheStrategy(DiskCacheStrategy)>
	//    7   15:areturn         
		} else
		{
			diskCacheStrategy = (DiskCacheStrategy)Preconditions.checkNotNull(((Object) (diskcachestrategy)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #219 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #56  <Class DiskCacheStrategy>
	//   12   24:putfield        #61  <Field DiskCacheStrategy diskCacheStrategy>
			fields = fields | 4;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field int fields>
	//   16   32:iconst_4        
	//   17   33:ior             
	//   18   34:putfield        #103 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   37:aload_0         
	//   20   38:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   21   41:areturn         
		}
	}

	public BaseRequestOptions downsample(DownsampleStrategy downsamplestrategy)
	{
		return set(DownsampleStrategy.OPTION, Preconditions.checkNotNull(((Object) (downsamplestrategy))));
	//    0    0:aload_0         
	//    1    1:getstatic       #234 <Field Option DownsampleStrategy.OPTION>
	//    2    4:aload_1         
	//    3    5:invokestatic    #219 <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:invokevirtual   #238 <Method BaseRequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof BaseRequestOptions;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class BaseRequestOptions>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            325
		{
			obj = ((Object) ((BaseRequestOptions)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class BaseRequestOptions>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(Float.compare(((BaseRequestOptions) (obj)).sizeMultiplier, sizeMultiplier) == 0)
	//*  12   18:aload_1         
	//*  13   19:getfield        #54  <Field float sizeMultiplier>
	//*  14   22:aload_0         
	//*  15   23:getfield        #54  <Field float sizeMultiplier>
	//*  16   26:invokestatic    #247 <Method int Float.compare(float, float)>
	//*  17   29:ifne            323
			{
				flag1 = flag2;
	//   18   32:iload_3         
	//   19   33:istore_2        
				if(errorId == ((BaseRequestOptions) (obj)).errorId)
	//*  20   34:aload_0         
	//*  21   35:getfield        #158 <Field int errorId>
	//*  22   38:aload_1         
	//*  23   39:getfield        #158 <Field int errorId>
	//*  24   42:icmpne          323
				{
					flag1 = flag2;
	//   25   45:iload_3         
	//   26   46:istore_2        
					if(Util.bothNullOrEqual(((Object) (errorPlaceholder)), ((Object) (((BaseRequestOptions) (obj)).errorPlaceholder))))
	//*  27   47:aload_0         
	//*  28   48:getfield        #156 <Field Drawable errorPlaceholder>
	//*  29   51:aload_1         
	//*  30   52:getfield        #156 <Field Drawable errorPlaceholder>
	//*  31   55:invokestatic    #253 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//*  32   58:ifeq            323
					{
						flag1 = flag2;
	//   33   61:iload_3         
	//   34   62:istore_2        
						if(placeholderId == ((BaseRequestOptions) (obj)).placeholderId)
	//*  35   63:aload_0         
	//*  36   64:getfield        #162 <Field int placeholderId>
	//*  37   67:aload_1         
	//*  38   68:getfield        #162 <Field int placeholderId>
	//*  39   71:icmpne          323
						{
							flag1 = flag2;
	//   40   74:iload_3         
	//   41   75:istore_2        
							if(Util.bothNullOrEqual(((Object) (placeholderDrawable)), ((Object) (((BaseRequestOptions) (obj)).placeholderDrawable))))
	//*  42   76:aload_0         
	//*  43   77:getfield        #160 <Field Drawable placeholderDrawable>
	//*  44   80:aload_1         
	//*  45   81:getfield        #160 <Field Drawable placeholderDrawable>
	//*  46   84:invokestatic    #253 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//*  47   87:ifeq            323
							{
								flag1 = flag2;
	//   48   90:iload_3         
	//   49   91:istore_2        
								if(fallbackId == ((BaseRequestOptions) (obj)).fallbackId)
	//*  50   92:aload_0         
	//*  51   93:getfield        #166 <Field int fallbackId>
	//*  52   96:aload_1         
	//*  53   97:getfield        #166 <Field int fallbackId>
	//*  54  100:icmpne          323
								{
									flag1 = flag2;
	//   55  103:iload_3         
	//   56  104:istore_2        
									if(Util.bothNullOrEqual(((Object) (fallbackDrawable)), ((Object) (((BaseRequestOptions) (obj)).fallbackDrawable))))
	//*  57  105:aload_0         
	//*  58  106:getfield        #164 <Field Drawable fallbackDrawable>
	//*  59  109:aload_1         
	//*  60  110:getfield        #164 <Field Drawable fallbackDrawable>
	//*  61  113:invokestatic    #253 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//*  62  116:ifeq            323
									{
										flag1 = flag2;
	//   63  119:iload_3         
	//   64  120:istore_2        
										if(isCacheable == ((BaseRequestOptions) (obj)).isCacheable)
	//*  65  121:aload_0         
	//*  66  122:getfield        #70  <Field boolean isCacheable>
	//*  67  125:aload_1         
	//*  68  126:getfield        #70  <Field boolean isCacheable>
	//*  69  129:icmpne          323
										{
											flag1 = flag2;
	//   70  132:iload_3         
	//   71  133:istore_2        
											if(overrideHeight == ((BaseRequestOptions) (obj)).overrideHeight)
	//*  72  134:aload_0         
	//*  73  135:getfield        #72  <Field int overrideHeight>
	//*  74  138:aload_1         
	//*  75  139:getfield        #72  <Field int overrideHeight>
	//*  76  142:icmpne          323
											{
												flag1 = flag2;
	//   77  145:iload_3         
	//   78  146:istore_2        
												if(overrideWidth == ((BaseRequestOptions) (obj)).overrideWidth)
	//*  79  147:aload_0         
	//*  80  148:getfield        #74  <Field int overrideWidth>
	//*  81  151:aload_1         
	//*  82  152:getfield        #74  <Field int overrideWidth>
	//*  83  155:icmpne          323
												{
													flag1 = flag2;
	//   84  158:iload_3         
	//   85  159:istore_2        
													if(isTransformationRequired == ((BaseRequestOptions) (obj)).isTransformationRequired)
	//*  86  160:aload_0         
	//*  87  161:getfield        #173 <Field boolean isTransformationRequired>
	//*  88  164:aload_1         
	//*  89  165:getfield        #173 <Field boolean isTransformationRequired>
	//*  90  168:icmpne          323
													{
														flag1 = flag2;
	//   91  171:iload_3         
	//   92  172:istore_2        
														if(isTransformationAllowed == ((BaseRequestOptions) (obj)).isTransformationAllowed)
	//*  93  173:aload_0         
	//*  94  174:getfield        #84  <Field boolean isTransformationAllowed>
	//*  95  177:aload_1         
	//*  96  178:getfield        #84  <Field boolean isTransformationAllowed>
	//*  97  181:icmpne          323
														{
															flag1 = flag2;
	//   98  184:iload_3         
	//   99  185:istore_2        
															if(useUnlimitedSourceGeneratorsPool == ((BaseRequestOptions) (obj)).useUnlimitedSourceGeneratorsPool)
	//* 100  186:aload_0         
	//* 101  187:getfield        #151 <Field boolean useUnlimitedSourceGeneratorsPool>
	//* 102  190:aload_1         
	//* 103  191:getfield        #151 <Field boolean useUnlimitedSourceGeneratorsPool>
	//* 104  194:icmpne          323
															{
																flag1 = flag2;
	//  105  197:iload_3         
	//  106  198:istore_2        
																if(onlyRetrieveFromCache == ((BaseRequestOptions) (obj)).onlyRetrieveFromCache)
	//* 107  199:aload_0         
	//* 108  200:getfield        #182 <Field boolean onlyRetrieveFromCache>
	//* 109  203:aload_1         
	//* 110  204:getfield        #182 <Field boolean onlyRetrieveFromCache>
	//* 111  207:icmpne          323
																{
																	flag1 = flag2;
	//  112  210:iload_3         
	//  113  211:istore_2        
																	if(((Object) (diskCacheStrategy)).equals(((Object) (((BaseRequestOptions) (obj)).diskCacheStrategy))))
	//* 114  212:aload_0         
	//* 115  213:getfield        #61  <Field DiskCacheStrategy diskCacheStrategy>
	//* 116  216:aload_1         
	//* 117  217:getfield        #61  <Field DiskCacheStrategy diskCacheStrategy>
	//* 118  220:invokevirtual   #255 <Method boolean Object.equals(Object)>
	//* 119  223:ifeq            323
																	{
																		flag1 = flag2;
	//  120  226:iload_3         
	//  121  227:istore_2        
																		if(priority == ((BaseRequestOptions) (obj)).priority)
	//* 122  228:aload_0         
	//* 123  229:getfield        #68  <Field Priority priority>
	//* 124  232:aload_1         
	//* 125  233:getfield        #68  <Field Priority priority>
	//* 126  236:if_acmpne       323
																		{
																			flag1 = flag2;
	//  127  239:iload_3         
	//  128  240:istore_2        
																			if(options.equals(((Object) (((BaseRequestOptions) (obj)).options))))
	//* 129  241:aload_0         
	//* 130  242:getfield        #89  <Field Options options>
	//* 131  245:aload_1         
	//* 132  246:getfield        #89  <Field Options options>
	//* 133  249:invokevirtual   #256 <Method boolean Options.equals(Object)>
	//* 134  252:ifeq            323
																			{
																				flag1 = flag2;
	//  135  255:iload_3         
	//  136  256:istore_2        
																				if(transformations.equals(((Object) (((BaseRequestOptions) (obj)).transformations))))
	//* 137  257:aload_0         
	//* 138  258:getfield        #94  <Field Map transformations>
	//* 139  261:aload_1         
	//* 140  262:getfield        #94  <Field Map transformations>
	//* 141  265:invokeinterface #257 <Method boolean Map.equals(Object)>
	//* 142  270:ifeq            323
																				{
																					flag1 = flag2;
	//  143  273:iload_3         
	//  144  274:istore_2        
																					if(((Object) (resourceClass)).equals(((Object) (((BaseRequestOptions) (obj)).resourceClass))))
	//* 145  275:aload_0         
	//* 146  276:getfield        #96  <Field Class resourceClass>
	//* 147  279:aload_1         
	//* 148  280:getfield        #96  <Field Class resourceClass>
	//* 149  283:invokevirtual   #255 <Method boolean Object.equals(Object)>
	//* 150  286:ifeq            323
																					{
																						flag1 = flag2;
	//  151  289:iload_3         
	//  152  290:istore_2        
																						if(Util.bothNullOrEqual(((Object) (signature)), ((Object) (((BaseRequestOptions) (obj)).signature))))
	//* 153  291:aload_0         
	//* 154  292:getfield        #82  <Field Key signature>
	//* 155  295:aload_1         
	//* 156  296:getfield        #82  <Field Key signature>
	//* 157  299:invokestatic    #253 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//* 158  302:ifeq            323
																						{
																							flag1 = flag2;
	//  159  305:iload_3         
	//  160  306:istore_2        
																							if(Util.bothNullOrEqual(((Object) (theme)), ((Object) (((BaseRequestOptions) (obj)).theme))))
	//* 161  307:aload_0         
	//* 162  308:getfield        #169 <Field android.content.res.Resources$Theme theme>
	//* 163  311:aload_1         
	//* 164  312:getfield        #169 <Field android.content.res.Resources$Theme theme>
	//* 165  315:invokestatic    #253 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//* 166  318:ifeq            323
																								flag1 = true;
	//  167  321:iconst_1        
	//  168  322:istore_2        
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			return flag1;
	//  169  323:iload_2         
	//  170  324:ireturn         
		} else
		{
			return false;
	//  171  325:iconst_0        
	//  172  326:ireturn         
		}
	}

	public final DiskCacheStrategy getDiskCacheStrategy()
	{
		return diskCacheStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field DiskCacheStrategy diskCacheStrategy>
	//    2    4:areturn         
	}

	public final int getErrorId()
	{
		return errorId;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field int errorId>
	//    2    4:ireturn         
	}

	public final Drawable getErrorPlaceholder()
	{
		return errorPlaceholder;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Drawable errorPlaceholder>
	//    2    4:areturn         
	}

	public final Drawable getFallbackDrawable()
	{
		return fallbackDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field Drawable fallbackDrawable>
	//    2    4:areturn         
	}

	public final int getFallbackId()
	{
		return fallbackId;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field int fallbackId>
	//    2    4:ireturn         
	}

	public final boolean getOnlyRetrieveFromCache()
	{
		return onlyRetrieveFromCache;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field boolean onlyRetrieveFromCache>
	//    2    4:ireturn         
	}

	public final Options getOptions()
	{
		return options;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Options options>
	//    2    4:areturn         
	}

	public final int getOverrideHeight()
	{
		return overrideHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int overrideHeight>
	//    2    4:ireturn         
	}

	public final int getOverrideWidth()
	{
		return overrideWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int overrideWidth>
	//    2    4:ireturn         
	}

	public final Drawable getPlaceholderDrawable()
	{
		return placeholderDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field Drawable placeholderDrawable>
	//    2    4:areturn         
	}

	public final int getPlaceholderId()
	{
		return placeholderId;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field int placeholderId>
	//    2    4:ireturn         
	}

	public final Priority getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Priority priority>
	//    2    4:areturn         
	}

	public final Class getResourceClass()
	{
		return resourceClass;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field Class resourceClass>
	//    2    4:areturn         
	}

	public final Key getSignature()
	{
		return signature;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Key signature>
	//    2    4:areturn         
	}

	public final float getSizeMultiplier()
	{
		return sizeMultiplier;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float sizeMultiplier>
	//    2    4:freturn         
	}

	public final android.content.res.Resources.Theme getTheme()
	{
		return theme;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field android.content.res.Resources$Theme theme>
	//    2    4:areturn         
	}

	public final Map getTransformations()
	{
		return transformations;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Map transformations>
	//    2    4:areturn         
	}

	public final boolean getUseAnimationPool()
	{
		return useAnimationPool;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field boolean useAnimationPool>
	//    2    4:ireturn         
	}

	public final boolean getUseUnlimitedSourceGeneratorsPool()
	{
		return useUnlimitedSourceGeneratorsPool;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field boolean useUnlimitedSourceGeneratorsPool>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		int i = Util.hashCode(sizeMultiplier);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float sizeMultiplier>
	//    2    4:invokestatic    #293 <Method int Util.hashCode(float)>
	//    3    7:istore_1        
		i = Util.hashCode(errorId, i);
	//    4    8:aload_0         
	//    5    9:getfield        #158 <Field int errorId>
	//    6   12:iload_1         
	//    7   13:invokestatic    #296 <Method int Util.hashCode(int, int)>
	//    8   16:istore_1        
		i = Util.hashCode(((Object) (errorPlaceholder)), i);
	//    9   17:aload_0         
	//   10   18:getfield        #156 <Field Drawable errorPlaceholder>
	//   11   21:iload_1         
	//   12   22:invokestatic    #299 <Method int Util.hashCode(Object, int)>
	//   13   25:istore_1        
		i = Util.hashCode(placeholderId, i);
	//   14   26:aload_0         
	//   15   27:getfield        #162 <Field int placeholderId>
	//   16   30:iload_1         
	//   17   31:invokestatic    #296 <Method int Util.hashCode(int, int)>
	//   18   34:istore_1        
		i = Util.hashCode(((Object) (placeholderDrawable)), i);
	//   19   35:aload_0         
	//   20   36:getfield        #160 <Field Drawable placeholderDrawable>
	//   21   39:iload_1         
	//   22   40:invokestatic    #299 <Method int Util.hashCode(Object, int)>
	//   23   43:istore_1        
		i = Util.hashCode(fallbackId, i);
	//   24   44:aload_0         
	//   25   45:getfield        #166 <Field int fallbackId>
	//   26   48:iload_1         
	//   27   49:invokestatic    #296 <Method int Util.hashCode(int, int)>
	//   28   52:istore_1        
		i = Util.hashCode(((Object) (fallbackDrawable)), i);
	//   29   53:aload_0         
	//   30   54:getfield        #164 <Field Drawable fallbackDrawable>
	//   31   57:iload_1         
	//   32   58:invokestatic    #299 <Method int Util.hashCode(Object, int)>
	//   33   61:istore_1        
		i = Util.hashCode(isCacheable, i);
	//   34   62:aload_0         
	//   35   63:getfield        #70  <Field boolean isCacheable>
	//   36   66:iload_1         
	//   37   67:invokestatic    #302 <Method int Util.hashCode(boolean, int)>
	//   38   70:istore_1        
		i = Util.hashCode(overrideHeight, i);
	//   39   71:aload_0         
	//   40   72:getfield        #72  <Field int overrideHeight>
	//   41   75:iload_1         
	//   42   76:invokestatic    #296 <Method int Util.hashCode(int, int)>
	//   43   79:istore_1        
		i = Util.hashCode(overrideWidth, i);
	//   44   80:aload_0         
	//   45   81:getfield        #74  <Field int overrideWidth>
	//   46   84:iload_1         
	//   47   85:invokestatic    #296 <Method int Util.hashCode(int, int)>
	//   48   88:istore_1        
		i = Util.hashCode(isTransformationRequired, i);
	//   49   89:aload_0         
	//   50   90:getfield        #173 <Field boolean isTransformationRequired>
	//   51   93:iload_1         
	//   52   94:invokestatic    #302 <Method int Util.hashCode(boolean, int)>
	//   53   97:istore_1        
		i = Util.hashCode(isTransformationAllowed, i);
	//   54   98:aload_0         
	//   55   99:getfield        #84  <Field boolean isTransformationAllowed>
	//   56  102:iload_1         
	//   57  103:invokestatic    #302 <Method int Util.hashCode(boolean, int)>
	//   58  106:istore_1        
		i = Util.hashCode(useUnlimitedSourceGeneratorsPool, i);
	//   59  107:aload_0         
	//   60  108:getfield        #151 <Field boolean useUnlimitedSourceGeneratorsPool>
	//   61  111:iload_1         
	//   62  112:invokestatic    #302 <Method int Util.hashCode(boolean, int)>
	//   63  115:istore_1        
		i = Util.hashCode(onlyRetrieveFromCache, i);
	//   64  116:aload_0         
	//   65  117:getfield        #182 <Field boolean onlyRetrieveFromCache>
	//   66  120:iload_1         
	//   67  121:invokestatic    #302 <Method int Util.hashCode(boolean, int)>
	//   68  124:istore_1        
		i = Util.hashCode(((Object) (diskCacheStrategy)), i);
	//   69  125:aload_0         
	//   70  126:getfield        #61  <Field DiskCacheStrategy diskCacheStrategy>
	//   71  129:iload_1         
	//   72  130:invokestatic    #299 <Method int Util.hashCode(Object, int)>
	//   73  133:istore_1        
		i = Util.hashCode(((Object) (priority)), i);
	//   74  134:aload_0         
	//   75  135:getfield        #68  <Field Priority priority>
	//   76  138:iload_1         
	//   77  139:invokestatic    #299 <Method int Util.hashCode(Object, int)>
	//   78  142:istore_1        
		i = Util.hashCode(((Object) (options)), i);
	//   79  143:aload_0         
	//   80  144:getfield        #89  <Field Options options>
	//   81  147:iload_1         
	//   82  148:invokestatic    #299 <Method int Util.hashCode(Object, int)>
	//   83  151:istore_1        
		i = Util.hashCode(((Object) (transformations)), i);
	//   84  152:aload_0         
	//   85  153:getfield        #94  <Field Map transformations>
	//   86  156:iload_1         
	//   87  157:invokestatic    #299 <Method int Util.hashCode(Object, int)>
	//   88  160:istore_1        
		i = Util.hashCode(((Object) (resourceClass)), i);
	//   89  161:aload_0         
	//   90  162:getfield        #96  <Field Class resourceClass>
	//   91  165:iload_1         
	//   92  166:invokestatic    #299 <Method int Util.hashCode(Object, int)>
	//   93  169:istore_1        
		i = Util.hashCode(((Object) (signature)), i);
	//   94  170:aload_0         
	//   95  171:getfield        #82  <Field Key signature>
	//   96  174:iload_1         
	//   97  175:invokestatic    #299 <Method int Util.hashCode(Object, int)>
	//   98  178:istore_1        
		return Util.hashCode(((Object) (theme)), i);
	//   99  179:aload_0         
	//  100  180:getfield        #169 <Field android.content.res.Resources$Theme theme>
	//  101  183:iload_1         
	//  102  184:invokestatic    #299 <Method int Util.hashCode(Object, int)>
	//  103  187:ireturn         
	}

	public final boolean isDiskCacheStrategySet()
	{
		return isSet(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #305 <Method boolean isSet(int)>
	//    3    5:ireturn         
	}

	public final boolean isMemoryCacheable()
	{
		return isCacheable;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean isCacheable>
	//    2    4:ireturn         
	}

	public final boolean isPrioritySet()
	{
		return isSet(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokespecial   #305 <Method boolean isSet(int)>
	//    3    6:ireturn         
	}

	boolean isScaleOnlyOrNoTransform()
	{
		return isScaleOnlyOrNoTransform;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field boolean isScaleOnlyOrNoTransform>
	//    2    4:ireturn         
	}

	public final boolean isSkipMemoryCacheSet()
	{
		return isSet(256);
	//    0    0:aload_0         
	//    1    1:sipush          256
	//    2    4:invokespecial   #305 <Method boolean isSet(int)>
	//    3    7:ireturn         
	}

	public final boolean isTransformationAllowed()
	{
		return isTransformationAllowed;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean isTransformationAllowed>
	//    2    4:ireturn         
	}

	public final boolean isTransformationRequired()
	{
		return isTransformationRequired;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field boolean isTransformationRequired>
	//    2    4:ireturn         
	}

	public final boolean isTransformationSet()
	{
		return isSet(2048);
	//    0    0:aload_0         
	//    1    1:sipush          2048
	//    2    4:invokespecial   #305 <Method boolean isSet(int)>
	//    3    7:ireturn         
	}

	public final boolean isValidOverride()
	{
		return Util.isValidDimensions(overrideWidth, overrideHeight);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int overrideWidth>
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field int overrideHeight>
	//    4    8:invokestatic    #313 <Method boolean Util.isValidDimensions(int, int)>
	//    5   11:ireturn         
	}

	public BaseRequestOptions lock()
	{
		isLocked = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #129 <Field boolean isLocked>
		return self();
	//    3    5:aload_0         
	//    4    6:invokespecial   #131 <Method BaseRequestOptions self()>
	//    5    9:areturn         
	}

	public BaseRequestOptions optionalCenterCrop()
	{
		return optionalTransform(DownsampleStrategy.CENTER_OUTSIDE, ((Transformation) (new CenterCrop())));
	//    0    0:aload_0         
	//    1    1:getstatic       #318 <Field DownsampleStrategy DownsampleStrategy.CENTER_OUTSIDE>
	//    2    4:new             #320 <Class CenterCrop>
	//    3    7:dup             
	//    4    8:invokespecial   #321 <Method void CenterCrop()>
	//    5   11:invokevirtual   #122 <Method BaseRequestOptions optionalTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public BaseRequestOptions optionalCenterInside()
	{
		return optionalScaleOnlyTransform(DownsampleStrategy.CENTER_INSIDE, ((Transformation) (new CenterInside())));
	//    0    0:aload_0         
	//    1    1:getstatic       #325 <Field DownsampleStrategy DownsampleStrategy.CENTER_INSIDE>
	//    2    4:new             #327 <Class CenterInside>
	//    3    7:dup             
	//    4    8:invokespecial   #328 <Method void CenterInside()>
	//    5   11:invokespecial   #330 <Method BaseRequestOptions optionalScaleOnlyTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public BaseRequestOptions optionalFitCenter()
	{
		return optionalScaleOnlyTransform(DownsampleStrategy.FIT_CENTER, ((Transformation) (new FitCenter())));
	//    0    0:aload_0         
	//    1    1:getstatic       #334 <Field DownsampleStrategy DownsampleStrategy.FIT_CENTER>
	//    2    4:new             #336 <Class FitCenter>
	//    3    7:dup             
	//    4    8:invokespecial   #337 <Method void FitCenter()>
	//    5   11:invokespecial   #330 <Method BaseRequestOptions optionalScaleOnlyTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	final BaseRequestOptions optionalTransform(DownsampleStrategy downsamplestrategy, Transformation transformation)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().optionalTransform(downsamplestrategy, transformation);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #122 <Method BaseRequestOptions optionalTransform(DownsampleStrategy, Transformation)>
	//    8   16:areturn         
		} else
		{
			downsample(downsamplestrategy);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #339 <Method BaseRequestOptions downsample(DownsampleStrategy)>
	//   12   22:pop             
			return transform(transformation, false);
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #342 <Method BaseRequestOptions transform(Transformation, boolean)>
	//   17   29:areturn         
		}
	}

	public BaseRequestOptions override(int i, int j)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().override(i, j);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #346 <Method BaseRequestOptions override(int, int)>
	//    8   16:areturn         
		} else
		{
			overrideWidth = i;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #74  <Field int overrideWidth>
			overrideHeight = j;
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:putfield        #72  <Field int overrideHeight>
			fields = fields | 0x200;
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #103 <Field int fields>
	//   18   32:sipush          512
	//   19   35:ior             
	//   20   36:putfield        #103 <Field int fields>
			return selfOrThrowIfLocked();
	//   21   39:aload_0         
	//   22   40:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   23   43:areturn         
		}
	}

	public BaseRequestOptions placeholder(Drawable drawable)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().placeholder(drawable);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #351 <Method BaseRequestOptions placeholder(Drawable)>
	//    7   15:areturn         
		} else
		{
			placeholderDrawable = drawable;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #160 <Field Drawable placeholderDrawable>
			fields = fields | 0x40;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #103 <Field int fields>
	//   14   26:bipush          64
	//   15   28:ior             
	//   16   29:putfield        #103 <Field int fields>
			placeholderId = 0;
	//   17   32:aload_0         
	//   18   33:iconst_0        
	//   19   34:putfield        #162 <Field int placeholderId>
			fields = fields & 0xffffff7f;
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #103 <Field int fields>
	//   23   42:sipush          -129
	//   24   45:iand            
	//   25   46:putfield        #103 <Field int fields>
			return selfOrThrowIfLocked();
	//   26   49:aload_0         
	//   27   50:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   28   53:areturn         
		}
	}

	public BaseRequestOptions priority(Priority priority1)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().priority(priority1);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #355 <Method BaseRequestOptions priority(Priority)>
	//    7   15:areturn         
		} else
		{
			priority = (Priority)Preconditions.checkNotNull(((Object) (priority1)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #219 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #63  <Class Priority>
	//   12   24:putfield        #68  <Field Priority priority>
			fields = fields | 8;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field int fields>
	//   16   32:bipush          8
	//   17   34:ior             
	//   18   35:putfield        #103 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   38:aload_0         
	//   20   39:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   21   42:areturn         
		}
	}

	public BaseRequestOptions set(Option option, Object obj)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().set(option, obj);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #238 <Method BaseRequestOptions set(Option, Object)>
	//    8   16:areturn         
		} else
		{
			Preconditions.checkNotNull(((Object) (option)));
	//    9   17:aload_1         
	//   10   18:invokestatic    #219 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:pop             
			Preconditions.checkNotNull(obj);
	//   12   22:aload_2         
	//   13   23:invokestatic    #219 <Method Object Preconditions.checkNotNull(Object)>
	//   14   26:pop             
			options.set(option, obj);
	//   15   27:aload_0         
	//   16   28:getfield        #89  <Field Options options>
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokevirtual   #359 <Method Options Options.set(Option, Object)>
	//   20   36:pop             
			return selfOrThrowIfLocked();
	//   21   37:aload_0         
	//   22   38:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   23   41:areturn         
		}
	}

	public BaseRequestOptions signature(Key key)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().signature(key);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #363 <Method BaseRequestOptions signature(Key)>
	//    7   15:areturn         
		} else
		{
			signature = (Key)Preconditions.checkNotNull(((Object) (key)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #219 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #365 <Class Key>
	//   12   24:putfield        #82  <Field Key signature>
			fields = fields | 0x400;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field int fields>
	//   16   32:sipush          1024
	//   17   35:ior             
	//   18   36:putfield        #103 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   39:aload_0         
	//   20   40:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   21   43:areturn         
		}
	}

	public BaseRequestOptions sizeMultiplier(float f)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
			return clone().sizeMultiplier(f);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:fload_1         
	//    6   12:invokevirtual   #376 <Method BaseRequestOptions sizeMultiplier(float)>
	//    7   15:areturn         
		if(f >= 0.0F && f <= 1.0F)
	//*   8   16:fload_1         
	//*   9   17:fconst_0        
	//*  10   18:fcmpg           
	//*  11   19:iflt            48
	//*  12   22:fload_1         
	//*  13   23:fconst_1        
	//*  14   24:fcmpl           
	//*  15   25:ifgt            48
		{
			sizeMultiplier = f;
	//   16   28:aload_0         
	//   17   29:fload_1         
	//   18   30:putfield        #54  <Field float sizeMultiplier>
			fields = fields | 2;
	//   19   33:aload_0         
	//   20   34:aload_0         
	//   21   35:getfield        #103 <Field int fields>
	//   22   38:iconst_2        
	//   23   39:ior             
	//   24   40:putfield        #103 <Field int fields>
			return selfOrThrowIfLocked();
	//   25   43:aload_0         
	//   26   44:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   27   47:areturn         
		} else
		{
			throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
	//   28   48:new             #378 <Class IllegalArgumentException>
	//   29   51:dup             
	//   30   52:ldc2            #380 <String "sizeMultiplier must be between 0 and 1">
	//   31   55:invokespecial   #381 <Method void IllegalArgumentException(String)>
	//   32   58:athrow          
		}
	}

	public BaseRequestOptions skipMemoryCache(boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().skipMemoryCache(true);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #386 <Method BaseRequestOptions skipMemoryCache(boolean)>
	//    7   15:areturn         
		} else
		{
			isCacheable = flag ^ true;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:iconst_1        
	//   11   19:ixor            
	//   12   20:putfield        #70  <Field boolean isCacheable>
			fields = fields | 0x100;
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #103 <Field int fields>
	//   16   28:sipush          256
	//   17   31:ior             
	//   18   32:putfield        #103 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   35:aload_0         
	//   20   36:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   21   39:areturn         
		}
	}

	public BaseRequestOptions transform(Transformation transformation)
	{
		return transform(transformation, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #342 <Method BaseRequestOptions transform(Transformation, boolean)>
	//    4    6:areturn         
	}

	BaseRequestOptions transform(Transformation transformation, boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().transform(transformation, flag);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #342 <Method BaseRequestOptions transform(Transformation, boolean)>
	//    8   16:areturn         
		} else
		{
			DrawableTransformation drawabletransformation = new DrawableTransformation(transformation, flag);
	//    9   17:new             #391 <Class DrawableTransformation>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:invokespecial   #394 <Method void DrawableTransformation(Transformation, boolean)>
	//   14   26:astore_3        
			transform(android/graphics/Bitmap, transformation, flag);
	//   15   27:aload_0         
	//   16   28:ldc2            #396 <Class Bitmap>
	//   17   31:aload_1         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #399 <Method BaseRequestOptions transform(Class, Transformation, boolean)>
	//   20   36:pop             
			transform(android/graphics/drawable/Drawable, ((Transformation) (drawabletransformation)), flag);
	//   21   37:aload_0         
	//   22   38:ldc2            #401 <Class Drawable>
	//   23   41:aload_3         
	//   24   42:iload_2         
	//   25   43:invokevirtual   #399 <Method BaseRequestOptions transform(Class, Transformation, boolean)>
	//   26   46:pop             
			transform(android/graphics/drawable/BitmapDrawable, drawabletransformation.asBitmapDrawable(), flag);
	//   27   47:aload_0         
	//   28   48:ldc2            #403 <Class BitmapDrawable>
	//   29   51:aload_3         
	//   30   52:invokevirtual   #407 <Method Transformation DrawableTransformation.asBitmapDrawable()>
	//   31   55:iload_2         
	//   32   56:invokevirtual   #399 <Method BaseRequestOptions transform(Class, Transformation, boolean)>
	//   33   59:pop             
			transform(com/bumptech/glide/load/resource/gif/GifDrawable, ((Transformation) (new GifDrawableTransformation(transformation))), flag);
	//   34   60:aload_0         
	//   35   61:ldc2            #409 <Class GifDrawable>
	//   36   64:new             #411 <Class GifDrawableTransformation>
	//   37   67:dup             
	//   38   68:aload_1         
	//   39   69:invokespecial   #414 <Method void GifDrawableTransformation(Transformation)>
	//   40   72:iload_2         
	//   41   73:invokevirtual   #399 <Method BaseRequestOptions transform(Class, Transformation, boolean)>
	//   42   76:pop             
			return selfOrThrowIfLocked();
	//   43   77:aload_0         
	//   44   78:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   45   81:areturn         
		}
	}

	final BaseRequestOptions transform(DownsampleStrategy downsamplestrategy, Transformation transformation)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().transform(downsamplestrategy, transformation);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #119 <Method BaseRequestOptions transform(DownsampleStrategy, Transformation)>
	//    8   16:areturn         
		} else
		{
			downsample(downsamplestrategy);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #339 <Method BaseRequestOptions downsample(DownsampleStrategy)>
	//   12   22:pop             
			return transform(transformation);
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #417 <Method BaseRequestOptions transform(Transformation)>
	//   16   28:areturn         
		}
	}

	BaseRequestOptions transform(Class class1, Transformation transformation, boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            18
			return clone().transform(class1, transformation, flag);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #399 <Method BaseRequestOptions transform(Class, Transformation, boolean)>
	//    9   17:areturn         
		Preconditions.checkNotNull(((Object) (class1)));
	//   10   18:aload_1         
	//   11   19:invokestatic    #219 <Method Object Preconditions.checkNotNull(Object)>
	//   12   22:pop             
		Preconditions.checkNotNull(((Object) (transformation)));
	//   13   23:aload_2         
	//   14   24:invokestatic    #219 <Method Object Preconditions.checkNotNull(Object)>
	//   15   27:pop             
		transformations.put(((Object) (class1)), ((Object) (transformation)));
	//   16   28:aload_0         
	//   17   29:getfield        #94  <Field Map transformations>
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:invokeinterface #421 <Method Object Map.put(Object, Object)>
	//   21   39:pop             
		fields = fields | 0x800;
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #103 <Field int fields>
	//   25   45:sipush          2048
	//   26   48:ior             
	//   27   49:putfield        #103 <Field int fields>
		isTransformationAllowed = true;
	//   28   52:aload_0         
	//   29   53:iconst_1        
	//   30   54:putfield        #84  <Field boolean isTransformationAllowed>
		fields = fields | 0x10000;
	//   31   57:aload_0         
	//   32   58:aload_0         
	//   33   59:getfield        #103 <Field int fields>
	//   34   62:ldc1            #170 <Int 0x10000>
	//   35   64:ior             
	//   36   65:putfield        #103 <Field int fields>
		isScaleOnlyOrNoTransform = false;
	//   37   68:aload_0         
	//   38   69:iconst_0        
	//   39   70:putfield        #98  <Field boolean isScaleOnlyOrNoTransform>
		if(flag)
	//*  40   73:iload_3         
	//*  41   74:ifeq            93
		{
			fields = fields | 0x20000;
	//   42   77:aload_0         
	//   43   78:aload_0         
	//   44   79:getfield        #103 <Field int fields>
	//   45   82:ldc1            #171 <Int 0x20000>
	//   46   84:ior             
	//   47   85:putfield        #103 <Field int fields>
			isTransformationRequired = true;
	//   48   88:aload_0         
	//   49   89:iconst_1        
	//   50   90:putfield        #173 <Field boolean isTransformationRequired>
		}
		return selfOrThrowIfLocked();
	//   51   93:aload_0         
	//   52   94:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   53   97:areturn         
	}

	public BaseRequestOptions useAnimationPool(boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().useAnimationPool(flag);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #146 <Method BaseRequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #424 <Method BaseRequestOptions useAnimationPool(boolean)>
	//    7   15:areturn         
		} else
		{
			useAnimationPool = flag;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #154 <Field boolean useAnimationPool>
			fields = fields | 0x100000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #103 <Field int fields>
	//   14   26:ldc1            #152 <Int 0x100000>
	//   15   28:ior             
	//   16   29:putfield        #103 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   32:aload_0         
	//   18   33:invokespecial   #191 <Method BaseRequestOptions selfOrThrowIfLocked()>
	//   19   36:areturn         
		}
	}

	private DiskCacheStrategy diskCacheStrategy;
	private int errorId;
	private Drawable errorPlaceholder;
	private Drawable fallbackDrawable;
	private int fallbackId;
	private int fields;
	private boolean isAutoCloneEnabled;
	private boolean isCacheable;
	private boolean isLocked;
	private boolean isScaleOnlyOrNoTransform;
	private boolean isTransformationAllowed;
	private boolean isTransformationRequired;
	private boolean onlyRetrieveFromCache;
	private Options options;
	private int overrideHeight;
	private int overrideWidth;
	private Drawable placeholderDrawable;
	private int placeholderId;
	private Priority priority;
	private Class resourceClass;
	private Key signature;
	private float sizeMultiplier;
	private android.content.res.Resources.Theme theme;
	private Map transformations;
	private boolean useAnimationPool;
	private boolean useUnlimitedSourceGeneratorsPool;
}
