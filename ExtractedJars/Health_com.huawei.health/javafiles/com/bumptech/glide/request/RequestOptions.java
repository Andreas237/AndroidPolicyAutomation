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
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.resource.bitmap.*;
import com.bumptech.glide.load.resource.gif.*;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.Map;

public class RequestOptions
	implements Cloneable
{

	public RequestOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void Object()>
		sizeMultiplier = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #101 <Field float sizeMultiplier>
		diskCacheStrategy = DiskCacheStrategy.AUTOMATIC;
	//    5    9:aload_0         
	//    6   10:getstatic       #106 <Field DiskCacheStrategy DiskCacheStrategy.AUTOMATIC>
	//    7   13:putfield        #108 <Field DiskCacheStrategy diskCacheStrategy>
		priority = Priority.NORMAL;
	//    8   16:aload_0         
	//    9   17:getstatic       #113 <Field Priority Priority.NORMAL>
	//   10   20:putfield        #115 <Field Priority priority>
		isCacheable = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #117 <Field boolean isCacheable>
		overrideHeight = -1;
	//   14   28:aload_0         
	//   15   29:iconst_m1       
	//   16   30:putfield        #119 <Field int overrideHeight>
		overrideWidth = -1;
	//   17   33:aload_0         
	//   18   34:iconst_m1       
	//   19   35:putfield        #121 <Field int overrideWidth>
		signature = ((Key) (EmptySignature.obtain()));
	//   20   38:aload_0         
	//   21   39:invokestatic    #127 <Method EmptySignature EmptySignature.obtain()>
	//   22   42:putfield        #129 <Field Key signature>
		isTransformationAllowed = true;
	//   23   45:aload_0         
	//   24   46:iconst_1        
	//   25   47:putfield        #131 <Field boolean isTransformationAllowed>
		options = new Options();
	//   26   50:aload_0         
	//   27   51:new             #133 <Class Options>
	//   28   54:dup             
	//   29   55:invokespecial   #134 <Method void Options()>
	//   30   58:putfield        #136 <Field Options options>
		transformations = ((Map) (new HashMap()));
	//   31   61:aload_0         
	//   32   62:new             #138 <Class HashMap>
	//   33   65:dup             
	//   34   66:invokespecial   #139 <Method void HashMap()>
	//   35   69:putfield        #141 <Field Map transformations>
		resourceClass = java/lang/Object;
	//   36   72:aload_0         
	//   37   73:ldc1            #4   <Class Object>
	//   38   75:putfield        #143 <Field Class resourceClass>
		isScaleOnlyOrNoTransform = true;
	//   39   78:aload_0         
	//   40   79:iconst_1        
	//   41   80:putfield        #145 <Field boolean isScaleOnlyOrNoTransform>
	//   42   83:return          
	}

	public static RequestOptions bitmapTransform(Transformation transformation)
	{
		return (new RequestOptions()).transform(transformation);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #152 <Method RequestOptions transform(Transformation)>
	//    5   11:areturn         
	}

	public static RequestOptions centerCropTransform()
	{
		if(centerCropOptions == null)
	//*   0    0:getstatic       #159 <Field RequestOptions centerCropOptions>
	//*   1    3:ifnonnull       22
			centerCropOptions = (new RequestOptions()).centerCrop().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #149 <Method void RequestOptions()>
	//    5   13:invokevirtual   #162 <Method RequestOptions centerCrop()>
	//    6   16:invokevirtual   #165 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #159 <Field RequestOptions centerCropOptions>
		return centerCropOptions;
	//    8   22:getstatic       #159 <Field RequestOptions centerCropOptions>
	//    9   25:areturn         
	}

	public static RequestOptions centerInsideTransform()
	{
		if(centerInsideOptions == null)
	//*   0    0:getstatic       #168 <Field RequestOptions centerInsideOptions>
	//*   1    3:ifnonnull       22
			centerInsideOptions = (new RequestOptions()).centerInside().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #149 <Method void RequestOptions()>
	//    5   13:invokevirtual   #171 <Method RequestOptions centerInside()>
	//    6   16:invokevirtual   #165 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #168 <Field RequestOptions centerInsideOptions>
		return centerInsideOptions;
	//    8   22:getstatic       #168 <Field RequestOptions centerInsideOptions>
	//    9   25:areturn         
	}

	public static RequestOptions circleCropTransform()
	{
		if(circleCropOptions == null)
	//*   0    0:getstatic       #174 <Field RequestOptions circleCropOptions>
	//*   1    3:ifnonnull       22
			circleCropOptions = (new RequestOptions()).circleCrop().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #149 <Method void RequestOptions()>
	//    5   13:invokevirtual   #177 <Method RequestOptions circleCrop()>
	//    6   16:invokevirtual   #165 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #174 <Field RequestOptions circleCropOptions>
		return circleCropOptions;
	//    8   22:getstatic       #174 <Field RequestOptions circleCropOptions>
	//    9   25:areturn         
	}

	public static RequestOptions decodeTypeOf(Class class1)
	{
		return (new RequestOptions()).decode(class1);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #182 <Method RequestOptions decode(Class)>
	//    5   11:areturn         
	}

	public static RequestOptions diskCacheStrategyOf(DiskCacheStrategy diskcachestrategy)
	{
		return (new RequestOptions()).diskCacheStrategy(diskcachestrategy);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #187 <Method RequestOptions diskCacheStrategy(DiskCacheStrategy)>
	//    5   11:areturn         
	}

	public static RequestOptions downsampleOf(DownsampleStrategy downsamplestrategy)
	{
		return (new RequestOptions()).downsample(downsamplestrategy);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #192 <Method RequestOptions downsample(DownsampleStrategy)>
	//    5   11:areturn         
	}

	public static RequestOptions encodeFormatOf(android.graphics.Bitmap.CompressFormat compressformat)
	{
		return (new RequestOptions()).encodeFormat(compressformat);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #197 <Method RequestOptions encodeFormat(android.graphics.Bitmap$CompressFormat)>
	//    5   11:areturn         
	}

	public static RequestOptions encodeQualityOf(int i)
	{
		return (new RequestOptions()).encodeQuality(i);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:iload_0         
	//    4    8:invokevirtual   #202 <Method RequestOptions encodeQuality(int)>
	//    5   11:areturn         
	}

	public static RequestOptions errorOf(int i)
	{
		return (new RequestOptions()).error(i);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:iload_0         
	//    4    8:invokevirtual   #206 <Method RequestOptions error(int)>
	//    5   11:areturn         
	}

	public static RequestOptions errorOf(Drawable drawable)
	{
		return (new RequestOptions()).error(drawable);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #209 <Method RequestOptions error(Drawable)>
	//    5   11:areturn         
	}

	public static RequestOptions fitCenterTransform()
	{
		if(fitCenterOptions == null)
	//*   0    0:getstatic       #212 <Field RequestOptions fitCenterOptions>
	//*   1    3:ifnonnull       22
			fitCenterOptions = (new RequestOptions()).fitCenter().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #149 <Method void RequestOptions()>
	//    5   13:invokevirtual   #215 <Method RequestOptions fitCenter()>
	//    6   16:invokevirtual   #165 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #212 <Field RequestOptions fitCenterOptions>
		return fitCenterOptions;
	//    8   22:getstatic       #212 <Field RequestOptions fitCenterOptions>
	//    9   25:areturn         
	}

	public static RequestOptions formatOf(DecodeFormat decodeformat)
	{
		return (new RequestOptions()).format(decodeformat);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #220 <Method RequestOptions format(DecodeFormat)>
	//    5   11:areturn         
	}

	public static RequestOptions frameOf(long l)
	{
		return (new RequestOptions()).frame(l);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:lload_0         
	//    4    8:invokevirtual   #225 <Method RequestOptions frame(long)>
	//    5   11:areturn         
	}

	private boolean isSet(int i)
	{
		return isSet(fields, i);
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field int fields>
	//    2    4:iload_1         
	//    3    5:invokestatic    #232 <Method boolean isSet(int, int)>
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

	public static RequestOptions noAnimation()
	{
		if(noAnimationOptions == null)
	//*   0    0:getstatic       #235 <Field RequestOptions noAnimationOptions>
	//*   1    3:ifnonnull       22
			noAnimationOptions = (new RequestOptions()).dontAnimate().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #149 <Method void RequestOptions()>
	//    5   13:invokevirtual   #238 <Method RequestOptions dontAnimate()>
	//    6   16:invokevirtual   #165 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #235 <Field RequestOptions noAnimationOptions>
		return noAnimationOptions;
	//    8   22:getstatic       #235 <Field RequestOptions noAnimationOptions>
	//    9   25:areturn         
	}

	public static RequestOptions noTransformation()
	{
		if(noTransformOptions == null)
	//*   0    0:getstatic       #241 <Field RequestOptions noTransformOptions>
	//*   1    3:ifnonnull       22
			noTransformOptions = (new RequestOptions()).dontTransform().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #149 <Method void RequestOptions()>
	//    5   13:invokevirtual   #244 <Method RequestOptions dontTransform()>
	//    6   16:invokevirtual   #165 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #241 <Field RequestOptions noTransformOptions>
		return noTransformOptions;
	//    8   22:getstatic       #241 <Field RequestOptions noTransformOptions>
	//    9   25:areturn         
	}

	public static RequestOptions option(Option option1, Object obj)
	{
		return (new RequestOptions()).set(option1, obj);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #249 <Method RequestOptions set(Option, Object)>
	//    6   12:areturn         
	}

	private RequestOptions optionalScaleOnlyTransform(DownsampleStrategy downsamplestrategy, Transformation transformation)
	{
		return scaleOnlyTransform(downsamplestrategy, transformation, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #256 <Method RequestOptions scaleOnlyTransform(DownsampleStrategy, Transformation, boolean)>
	//    5    7:areturn         
	}

	public static RequestOptions overrideOf(int i)
	{
		return overrideOf(i, i);
	//    0    0:iload_0         
	//    1    1:iload_0         
	//    2    2:invokestatic    #261 <Method RequestOptions overrideOf(int, int)>
	//    3    5:areturn         
	}

	public static RequestOptions overrideOf(int i, int j)
	{
		return (new RequestOptions()).override(i, j);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:iload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #264 <Method RequestOptions override(int, int)>
	//    6   12:areturn         
	}

	public static RequestOptions placeholderOf(int i)
	{
		return (new RequestOptions()).placeholder(i);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:iload_0         
	//    4    8:invokevirtual   #268 <Method RequestOptions placeholder(int)>
	//    5   11:areturn         
	}

	public static RequestOptions placeholderOf(Drawable drawable)
	{
		return (new RequestOptions()).placeholder(drawable);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #270 <Method RequestOptions placeholder(Drawable)>
	//    5   11:areturn         
	}

	public static RequestOptions priorityOf(Priority priority1)
	{
		return (new RequestOptions()).priority(priority1);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #274 <Method RequestOptions priority(Priority)>
	//    5   11:areturn         
	}

	private RequestOptions scaleOnlyTransform(DownsampleStrategy downsamplestrategy, Transformation transformation)
	{
		return scaleOnlyTransform(downsamplestrategy, transformation, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #256 <Method RequestOptions scaleOnlyTransform(DownsampleStrategy, Transformation, boolean)>
	//    5    7:areturn         
	}

	private RequestOptions scaleOnlyTransform(DownsampleStrategy downsamplestrategy, Transformation transformation, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            14
			downsamplestrategy = ((DownsampleStrategy) (transform(downsamplestrategy, transformation)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #276 <Method RequestOptions transform(DownsampleStrategy, Transformation)>
	//    6   10:astore_1        
		else
	//*   7   11:goto            21
			downsamplestrategy = ((DownsampleStrategy) (optionalTransform(downsamplestrategy, transformation)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #279 <Method RequestOptions optionalTransform(DownsampleStrategy, Transformation)>
	//   12   20:astore_1        
		downsamplestrategy.isScaleOnlyOrNoTransform = true;
	//   13   21:aload_1         
	//   14   22:iconst_1        
	//   15   23:putfield        #145 <Field boolean isScaleOnlyOrNoTransform>
		return ((RequestOptions) (downsamplestrategy));
	//   16   26:aload_1         
	//   17   27:areturn         
	}

	private RequestOptions selfOrThrowIfLocked()
	{
		if(isLocked)
	//*   0    0:aload_0         
	//*   1    1:getfield        #283 <Field boolean isLocked>
	//*   2    4:ifeq            18
			throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
	//    3    7:new             #285 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #287 <String "You cannot modify locked RequestOptions, consider clone()">
	//    6   14:invokespecial   #290 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return this;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public static RequestOptions signatureOf(Key key)
	{
		return (new RequestOptions()).signature(key);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #294 <Method RequestOptions signature(Key)>
	//    5   11:areturn         
	}

	public static RequestOptions sizeMultiplierOf(float f)
	{
		return (new RequestOptions()).sizeMultiplier(f);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:fload_0         
	//    4    8:invokevirtual   #298 <Method RequestOptions sizeMultiplier(float)>
	//    5   11:areturn         
	}

	public static RequestOptions skipMemoryCacheOf(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            31
		{
			if(skipMemoryCacheTrueOptions == null)
	//*   2    4:getstatic       #302 <Field RequestOptions skipMemoryCacheTrueOptions>
	//*   3    7:ifnonnull       27
				skipMemoryCacheTrueOptions = (new RequestOptions()).skipMemoryCache(true).autoClone();
	//    4   10:new             #2   <Class RequestOptions>
	//    5   13:dup             
	//    6   14:invokespecial   #149 <Method void RequestOptions()>
	//    7   17:iconst_1        
	//    8   18:invokevirtual   #305 <Method RequestOptions skipMemoryCache(boolean)>
	//    9   21:invokevirtual   #165 <Method RequestOptions autoClone()>
	//   10   24:putstatic       #302 <Field RequestOptions skipMemoryCacheTrueOptions>
			return skipMemoryCacheTrueOptions;
	//   11   27:getstatic       #302 <Field RequestOptions skipMemoryCacheTrueOptions>
	//   12   30:areturn         
		}
		if(skipMemoryCacheFalseOptions == null)
	//*  13   31:getstatic       #307 <Field RequestOptions skipMemoryCacheFalseOptions>
	//*  14   34:ifnonnull       54
			skipMemoryCacheFalseOptions = (new RequestOptions()).skipMemoryCache(false).autoClone();
	//   15   37:new             #2   <Class RequestOptions>
	//   16   40:dup             
	//   17   41:invokespecial   #149 <Method void RequestOptions()>
	//   18   44:iconst_0        
	//   19   45:invokevirtual   #305 <Method RequestOptions skipMemoryCache(boolean)>
	//   20   48:invokevirtual   #165 <Method RequestOptions autoClone()>
	//   21   51:putstatic       #307 <Field RequestOptions skipMemoryCacheFalseOptions>
		return skipMemoryCacheFalseOptions;
	//   22   54:getstatic       #307 <Field RequestOptions skipMemoryCacheFalseOptions>
	//   23   57:areturn         
	}

	public static RequestOptions timeoutOf(int i)
	{
		return (new RequestOptions()).timeout(i);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void RequestOptions()>
	//    3    7:iload_0         
	//    4    8:invokevirtual   #311 <Method RequestOptions timeout(int)>
	//    5   11:areturn         
	}

	public RequestOptions apply(RequestOptions requestoptions)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
			return clone().apply(requestoptions);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #320 <Method RequestOptions apply(RequestOptions)>
	//    7   15:areturn         
		if(isSet(requestoptions.fields, 2))
	//*   8   16:aload_1         
	//*   9   17:getfield        #229 <Field int fields>
	//*  10   20:iconst_2        
	//*  11   21:invokestatic    #232 <Method boolean isSet(int, int)>
	//*  12   24:ifeq            35
			sizeMultiplier = requestoptions.sizeMultiplier;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:getfield        #101 <Field float sizeMultiplier>
	//   16   32:putfield        #101 <Field float sizeMultiplier>
		if(isSet(requestoptions.fields, 0x40000))
	//*  17   35:aload_1         
	//*  18   36:getfield        #229 <Field int fields>
	//*  19   39:ldc1            #47  <Int 0x40000>
	//*  20   41:invokestatic    #232 <Method boolean isSet(int, int)>
	//*  21   44:ifeq            55
			useUnlimitedSourceGeneratorsPool = requestoptions.useUnlimitedSourceGeneratorsPool;
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:getfield        #322 <Field boolean useUnlimitedSourceGeneratorsPool>
	//   25   52:putfield        #322 <Field boolean useUnlimitedSourceGeneratorsPool>
		if(isSet(requestoptions.fields, 4))
	//*  26   55:aload_1         
	//*  27   56:getfield        #229 <Field int fields>
	//*  28   59:iconst_4        
	//*  29   60:invokestatic    #232 <Method boolean isSet(int, int)>
	//*  30   63:ifeq            74
			diskCacheStrategy = requestoptions.diskCacheStrategy;
	//   31   66:aload_0         
	//   32   67:aload_1         
	//   33   68:getfield        #108 <Field DiskCacheStrategy diskCacheStrategy>
	//   34   71:putfield        #108 <Field DiskCacheStrategy diskCacheStrategy>
		if(isSet(requestoptions.fields, 8))
	//*  35   74:aload_1         
	//*  36   75:getfield        #229 <Field int fields>
	//*  37   78:bipush          8
	//*  38   80:invokestatic    #232 <Method boolean isSet(int, int)>
	//*  39   83:ifeq            94
			priority = requestoptions.priority;
	//   40   86:aload_0         
	//   41   87:aload_1         
	//   42   88:getfield        #115 <Field Priority priority>
	//   43   91:putfield        #115 <Field Priority priority>
		if(isSet(requestoptions.fields, 16))
	//*  44   94:aload_1         
	//*  45   95:getfield        #229 <Field int fields>
	//*  46   98:bipush          16
	//*  47  100:invokestatic    #232 <Method boolean isSet(int, int)>
	//*  48  103:ifeq            114
			errorPlaceholder = requestoptions.errorPlaceholder;
	//   49  106:aload_0         
	//   50  107:aload_1         
	//   51  108:getfield        #324 <Field Drawable errorPlaceholder>
	//   52  111:putfield        #324 <Field Drawable errorPlaceholder>
		if(isSet(requestoptions.fields, 32))
	//*  53  114:aload_1         
	//*  54  115:getfield        #229 <Field int fields>
	//*  55  118:bipush          32
	//*  56  120:invokestatic    #232 <Method boolean isSet(int, int)>
	//*  57  123:ifeq            134
			errorId = requestoptions.errorId;
	//   58  126:aload_0         
	//   59  127:aload_1         
	//   60  128:getfield        #326 <Field int errorId>
	//   61  131:putfield        #326 <Field int errorId>
		if(isSet(requestoptions.fields, 64))
	//*  62  134:aload_1         
	//*  63  135:getfield        #229 <Field int fields>
	//*  64  138:bipush          64
	//*  65  140:invokestatic    #232 <Method boolean isSet(int, int)>
	//*  66  143:ifeq            154
			placeholderDrawable = requestoptions.placeholderDrawable;
	//   67  146:aload_0         
	//   68  147:aload_1         
	//   69  148:getfield        #328 <Field Drawable placeholderDrawable>
	//   70  151:putfield        #328 <Field Drawable placeholderDrawable>
		if(isSet(requestoptions.fields, 128))
	//*  71  154:aload_1         
	//*  72  155:getfield        #229 <Field int fields>
	//*  73  158:sipush          128
	//*  74  161:invokestatic    #232 <Method boolean isSet(int, int)>
	//*  75  164:ifeq            175
			placeholderId = requestoptions.placeholderId;
	//   76  167:aload_0         
	//   77  168:aload_1         
	//   78  169:getfield        #330 <Field int placeholderId>
	//   79  172:putfield        #330 <Field int placeholderId>
		if(isSet(requestoptions.fields, 256))
	//*  80  175:aload_1         
	//*  81  176:getfield        #229 <Field int fields>
	//*  82  179:sipush          256
	//*  83  182:invokestatic    #232 <Method boolean isSet(int, int)>
	//*  84  185:ifeq            196
			isCacheable = requestoptions.isCacheable;
	//   85  188:aload_0         
	//   86  189:aload_1         
	//   87  190:getfield        #117 <Field boolean isCacheable>
	//   88  193:putfield        #117 <Field boolean isCacheable>
		if(isSet(requestoptions.fields, 512))
	//*  89  196:aload_1         
	//*  90  197:getfield        #229 <Field int fields>
	//*  91  200:sipush          512
	//*  92  203:invokestatic    #232 <Method boolean isSet(int, int)>
	//*  93  206:ifeq            225
		{
			overrideWidth = requestoptions.overrideWidth;
	//   94  209:aload_0         
	//   95  210:aload_1         
	//   96  211:getfield        #121 <Field int overrideWidth>
	//   97  214:putfield        #121 <Field int overrideWidth>
			overrideHeight = requestoptions.overrideHeight;
	//   98  217:aload_0         
	//   99  218:aload_1         
	//  100  219:getfield        #119 <Field int overrideHeight>
	//  101  222:putfield        #119 <Field int overrideHeight>
		}
		if(isSet(requestoptions.fields, 1024))
	//* 102  225:aload_1         
	//* 103  226:getfield        #229 <Field int fields>
	//* 104  229:sipush          1024
	//* 105  232:invokestatic    #232 <Method boolean isSet(int, int)>
	//* 106  235:ifeq            246
			signature = requestoptions.signature;
	//  107  238:aload_0         
	//  108  239:aload_1         
	//  109  240:getfield        #129 <Field Key signature>
	//  110  243:putfield        #129 <Field Key signature>
		if(isSet(requestoptions.fields, 4096))
	//* 111  246:aload_1         
	//* 112  247:getfield        #229 <Field int fields>
	//* 113  250:sipush          4096
	//* 114  253:invokestatic    #232 <Method boolean isSet(int, int)>
	//* 115  256:ifeq            267
			resourceClass = requestoptions.resourceClass;
	//  116  259:aload_0         
	//  117  260:aload_1         
	//  118  261:getfield        #143 <Field Class resourceClass>
	//  119  264:putfield        #143 <Field Class resourceClass>
		if(isSet(requestoptions.fields, 8192))
	//* 120  267:aload_1         
	//* 121  268:getfield        #229 <Field int fields>
	//* 122  271:sipush          8192
	//* 123  274:invokestatic    #232 <Method boolean isSet(int, int)>
	//* 124  277:ifeq            288
			fallbackDrawable = requestoptions.fallbackDrawable;
	//  125  280:aload_0         
	//  126  281:aload_1         
	//  127  282:getfield        #332 <Field Drawable fallbackDrawable>
	//  128  285:putfield        #332 <Field Drawable fallbackDrawable>
		if(isSet(requestoptions.fields, 16384))
	//* 129  288:aload_1         
	//* 130  289:getfield        #229 <Field int fields>
	//* 131  292:sipush          16384
	//* 132  295:invokestatic    #232 <Method boolean isSet(int, int)>
	//* 133  298:ifeq            309
			fallbackId = requestoptions.fallbackId;
	//  134  301:aload_0         
	//  135  302:aload_1         
	//  136  303:getfield        #334 <Field int fallbackId>
	//  137  306:putfield        #334 <Field int fallbackId>
		if(isSet(requestoptions.fields, 32768))
	//* 138  309:aload_1         
	//* 139  310:getfield        #229 <Field int fields>
	//* 140  313:ldc1            #37  <Int 32768>
	//* 141  315:invokestatic    #232 <Method boolean isSet(int, int)>
	//* 142  318:ifeq            329
			theme = requestoptions.theme;
	//  143  321:aload_0         
	//  144  322:aload_1         
	//  145  323:getfield        #336 <Field android.content.res.Resources$Theme theme>
	//  146  326:putfield        #336 <Field android.content.res.Resources$Theme theme>
		if(isSet(requestoptions.fields, 0x10000))
	//* 147  329:aload_1         
	//* 148  330:getfield        #229 <Field int fields>
	//* 149  333:ldc1            #41  <Int 0x10000>
	//* 150  335:invokestatic    #232 <Method boolean isSet(int, int)>
	//* 151  338:ifeq            349
			isTransformationAllowed = requestoptions.isTransformationAllowed;
	//  152  341:aload_0         
	//  153  342:aload_1         
	//  154  343:getfield        #131 <Field boolean isTransformationAllowed>
	//  155  346:putfield        #131 <Field boolean isTransformationAllowed>
		if(isSet(requestoptions.fields, 0x20000))
	//* 156  349:aload_1         
	//* 157  350:getfield        #229 <Field int fields>
	//* 158  353:ldc1            #43  <Int 0x20000>
	//* 159  355:invokestatic    #232 <Method boolean isSet(int, int)>
	//* 160  358:ifeq            369
			isTransformationRequired = requestoptions.isTransformationRequired;
	//  161  361:aload_0         
	//  162  362:aload_1         
	//  163  363:getfield        #338 <Field boolean isTransformationRequired>
	//  164  366:putfield        #338 <Field boolean isTransformationRequired>
		if(isSet(requestoptions.fields, 2048))
	//* 165  369:aload_1         
	//* 166  370:getfield        #229 <Field int fields>
	//* 167  373:sipush          2048
	//* 168  376:invokestatic    #232 <Method boolean isSet(int, int)>
	//* 169  379:ifeq            403
		{
			transformations.putAll(requestoptions.transformations);
	//  170  382:aload_0         
	//  171  383:getfield        #141 <Field Map transformations>
	//  172  386:aload_1         
	//  173  387:getfield        #141 <Field Map transformations>
	//  174  390:invokeinterface #344 <Method void Map.putAll(Map)>
			isScaleOnlyOrNoTransform = requestoptions.isScaleOnlyOrNoTransform;
	//  175  395:aload_0         
	//  176  396:aload_1         
	//  177  397:getfield        #145 <Field boolean isScaleOnlyOrNoTransform>
	//  178  400:putfield        #145 <Field boolean isScaleOnlyOrNoTransform>
		}
		if(isSet(requestoptions.fields, 0x80000))
	//* 179  403:aload_1         
	//* 180  404:getfield        #229 <Field int fields>
	//* 181  407:ldc1            #21  <Int 0x80000>
	//* 182  409:invokestatic    #232 <Method boolean isSet(int, int)>
	//* 183  412:ifeq            423
			onlyRetrieveFromCache = requestoptions.onlyRetrieveFromCache;
	//  184  415:aload_0         
	//  185  416:aload_1         
	//  186  417:getfield        #346 <Field boolean onlyRetrieveFromCache>
	//  187  420:putfield        #346 <Field boolean onlyRetrieveFromCache>
		if(!isTransformationAllowed)
	//* 188  423:aload_0         
	//* 189  424:getfield        #131 <Field boolean isTransformationAllowed>
	//* 190  427:ifne            473
		{
			transformations.clear();
	//  191  430:aload_0         
	//  192  431:getfield        #141 <Field Map transformations>
	//  193  434:invokeinterface #349 <Method void Map.clear()>
			fields = fields & 0xfffff7ff;
	//  194  439:aload_0         
	//  195  440:aload_0         
	//  196  441:getfield        #229 <Field int fields>
	//  197  444:sipush          -2049
	//  198  447:iand            
	//  199  448:putfield        #229 <Field int fields>
			isTransformationRequired = false;
	//  200  451:aload_0         
	//  201  452:iconst_0        
	//  202  453:putfield        #338 <Field boolean isTransformationRequired>
			fields = fields & 0xfffdffff;
	//  203  456:aload_0         
	//  204  457:aload_0         
	//  205  458:getfield        #229 <Field int fields>
	//  206  461:ldc2            #350 <Int 0xfffdffff>
	//  207  464:iand            
	//  208  465:putfield        #229 <Field int fields>
			isScaleOnlyOrNoTransform = true;
	//  209  468:aload_0         
	//  210  469:iconst_1        
	//  211  470:putfield        #145 <Field boolean isScaleOnlyOrNoTransform>
		}
		fields = fields | requestoptions.fields;
	//  212  473:aload_0         
	//  213  474:aload_0         
	//  214  475:getfield        #229 <Field int fields>
	//  215  478:aload_1         
	//  216  479:getfield        #229 <Field int fields>
	//  217  482:ior             
	//  218  483:putfield        #229 <Field int fields>
		options.putAll(requestoptions.options);
	//  219  486:aload_0         
	//  220  487:getfield        #136 <Field Options options>
	//  221  490:aload_1         
	//  222  491:getfield        #136 <Field Options options>
	//  223  494:invokevirtual   #353 <Method void Options.putAll(Options)>
		return selfOrThrowIfLocked();
	//  224  497:aload_0         
	//  225  498:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//  226  501:areturn         
	}

	public RequestOptions autoClone()
	{
		if(isLocked && !isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #283 <Field boolean isLocked>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   5   11:ifne            25
		{
			throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
	//    6   14:new             #285 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #357 <String "You cannot auto lock an already locked options object, try clone() first">
	//    9   21:invokespecial   #290 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			isAutoCloneEnabled = true;
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:putfield        #315 <Field boolean isAutoCloneEnabled>
			return lock();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #360 <Method RequestOptions lock()>
	//   16   34:areturn         
		}
	}

	public RequestOptions centerCrop()
	{
		return transform(DownsampleStrategy.CENTER_OUTSIDE, ((Transformation) (new CenterCrop())));
	//    0    0:aload_0         
	//    1    1:getstatic       #366 <Field DownsampleStrategy DownsampleStrategy.CENTER_OUTSIDE>
	//    2    4:new             #368 <Class CenterCrop>
	//    3    7:dup             
	//    4    8:invokespecial   #369 <Method void CenterCrop()>
	//    5   11:invokevirtual   #276 <Method RequestOptions transform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions centerInside()
	{
		return scaleOnlyTransform(DownsampleStrategy.CENTER_INSIDE, ((Transformation) (new CenterInside())));
	//    0    0:aload_0         
	//    1    1:getstatic       #372 <Field DownsampleStrategy DownsampleStrategy.CENTER_INSIDE>
	//    2    4:new             #374 <Class CenterInside>
	//    3    7:dup             
	//    4    8:invokespecial   #375 <Method void CenterInside()>
	//    5   11:invokespecial   #377 <Method RequestOptions scaleOnlyTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions circleCrop()
	{
		return transform(DownsampleStrategy.CENTER_INSIDE, ((Transformation) (new CircleCrop())));
	//    0    0:aload_0         
	//    1    1:getstatic       #372 <Field DownsampleStrategy DownsampleStrategy.CENTER_INSIDE>
	//    2    4:new             #379 <Class CircleCrop>
	//    3    7:dup             
	//    4    8:invokespecial   #380 <Method void CircleCrop()>
	//    5   11:invokevirtual   #276 <Method RequestOptions transform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions clone()
	{
		RequestOptions requestoptions;
		try
		{
			requestoptions = (RequestOptions)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #385 <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class RequestOptions>
	//    3    7:astore_1        
			requestoptions.options = new Options();
	//    4    8:aload_1         
	//    5    9:new             #133 <Class Options>
	//    6   12:dup             
	//    7   13:invokespecial   #134 <Method void Options()>
	//    8   16:putfield        #136 <Field Options options>
			requestoptions.options.putAll(options);
	//    9   19:aload_1         
	//   10   20:getfield        #136 <Field Options options>
	//   11   23:aload_0         
	//   12   24:getfield        #136 <Field Options options>
	//   13   27:invokevirtual   #353 <Method void Options.putAll(Options)>
			requestoptions.transformations = ((Map) (new HashMap()));
	//   14   30:aload_1         
	//   15   31:new             #138 <Class HashMap>
	//   16   34:dup             
	//   17   35:invokespecial   #139 <Method void HashMap()>
	//   18   38:putfield        #141 <Field Map transformations>
			requestoptions.transformations.putAll(transformations);
	//   19   41:aload_1         
	//   20   42:getfield        #141 <Field Map transformations>
	//   21   45:aload_0         
	//   22   46:getfield        #141 <Field Map transformations>
	//   23   49:invokeinterface #344 <Method void Map.putAll(Map)>
			requestoptions.isLocked = false;
	//   24   54:aload_1         
	//   25   55:iconst_0        
	//   26   56:putfield        #283 <Field boolean isLocked>
			requestoptions.isAutoCloneEnabled = false;
	//   27   59:aload_1         
	//   28   60:iconst_0        
	//   29   61:putfield        #315 <Field boolean isAutoCloneEnabled>
		}
	//*  30   64:aload_1         
	//*  31   65:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  32   66:astore_1        
		{
			throw new RuntimeException(((Throwable) (clonenotsupportedexception)));
	//   33   67:new             #387 <Class RuntimeException>
	//   34   70:dup             
	//   35   71:aload_1         
	//   36   72:invokespecial   #390 <Method void RuntimeException(Throwable)>
	//   37   75:athrow          
		}
		return requestoptions;
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #318 <Method RequestOptions clone()>
	//    2    4:areturn         
	}

	public RequestOptions decode(Class class1)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().decode(class1);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #182 <Method RequestOptions decode(Class)>
	//    7   15:areturn         
		} else
		{
			resourceClass = (Class)Preconditions.checkNotNull(((Object) (class1)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #397 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #399 <Class Class>
	//   12   24:putfield        #143 <Field Class resourceClass>
			fields = fields | 0x1000;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #229 <Field int fields>
	//   16   32:sipush          4096
	//   17   35:ior             
	//   18   36:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   39:aload_0         
	//   20   40:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   21   43:areturn         
		}
	}

	public RequestOptions disallowHardwareConfig()
	{
		return set(Downsampler.ALLOW_HARDWARE_CONFIG, ((Object) (Boolean.valueOf(false))));
	//    0    0:aload_0         
	//    1    1:getstatic       #406 <Field Option Downsampler.ALLOW_HARDWARE_CONFIG>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #412 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokevirtual   #249 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public RequestOptions diskCacheStrategy(DiskCacheStrategy diskcachestrategy)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().diskCacheStrategy(diskcachestrategy);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #187 <Method RequestOptions diskCacheStrategy(DiskCacheStrategy)>
	//    7   15:areturn         
		} else
		{
			diskCacheStrategy = (DiskCacheStrategy)Preconditions.checkNotNull(((Object) (diskcachestrategy)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #397 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #103 <Class DiskCacheStrategy>
	//   12   24:putfield        #108 <Field DiskCacheStrategy diskCacheStrategy>
			fields = fields | 4;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #229 <Field int fields>
	//   16   32:iconst_4        
	//   17   33:ior             
	//   18   34:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   37:aload_0         
	//   20   38:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   21   41:areturn         
		}
	}

	public RequestOptions dontAnimate()
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            15
		{
			return clone().dontAnimate();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:invokevirtual   #238 <Method RequestOptions dontAnimate()>
	//    6   14:areturn         
		} else
		{
			set(ByteBufferGifDecoder.DISABLE_ANIMATION, ((Object) (Boolean.valueOf(true))));
	//    7   15:aload_0         
	//    8   16:getstatic       #417 <Field Option ByteBufferGifDecoder.DISABLE_ANIMATION>
	//    9   19:iconst_1        
	//   10   20:invokestatic    #412 <Method Boolean Boolean.valueOf(boolean)>
	//   11   23:invokevirtual   #249 <Method RequestOptions set(Option, Object)>
	//   12   26:pop             
			set(StreamGifDecoder.DISABLE_ANIMATION, ((Object) (Boolean.valueOf(true))));
	//   13   27:aload_0         
	//   14   28:getstatic       #420 <Field Option StreamGifDecoder.DISABLE_ANIMATION>
	//   15   31:iconst_1        
	//   16   32:invokestatic    #412 <Method Boolean Boolean.valueOf(boolean)>
	//   17   35:invokevirtual   #249 <Method RequestOptions set(Option, Object)>
	//   18   38:pop             
			return selfOrThrowIfLocked();
	//   19   39:aload_0         
	//   20   40:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   21   43:areturn         
		}
	}

	public RequestOptions dontTransform()
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            15
		{
			return clone().dontTransform();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:invokevirtual   #244 <Method RequestOptions dontTransform()>
	//    6   14:areturn         
		} else
		{
			transformations.clear();
	//    7   15:aload_0         
	//    8   16:getfield        #141 <Field Map transformations>
	//    9   19:invokeinterface #349 <Method void Map.clear()>
			fields = fields & 0xfffff7ff;
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #229 <Field int fields>
	//   13   29:sipush          -2049
	//   14   32:iand            
	//   15   33:putfield        #229 <Field int fields>
			isTransformationRequired = false;
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:putfield        #338 <Field boolean isTransformationRequired>
			fields = fields & 0xfffdffff;
	//   19   41:aload_0         
	//   20   42:aload_0         
	//   21   43:getfield        #229 <Field int fields>
	//   22   46:ldc2            #350 <Int 0xfffdffff>
	//   23   49:iand            
	//   24   50:putfield        #229 <Field int fields>
			isTransformationAllowed = false;
	//   25   53:aload_0         
	//   26   54:iconst_0        
	//   27   55:putfield        #131 <Field boolean isTransformationAllowed>
			fields = fields | 0x10000;
	//   28   58:aload_0         
	//   29   59:aload_0         
	//   30   60:getfield        #229 <Field int fields>
	//   31   63:ldc1            #41  <Int 0x10000>
	//   32   65:ior             
	//   33   66:putfield        #229 <Field int fields>
			isScaleOnlyOrNoTransform = true;
	//   34   69:aload_0         
	//   35   70:iconst_1        
	//   36   71:putfield        #145 <Field boolean isScaleOnlyOrNoTransform>
			return selfOrThrowIfLocked();
	//   37   74:aload_0         
	//   38   75:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   39   78:areturn         
		}
	}

	public RequestOptions downsample(DownsampleStrategy downsamplestrategy)
	{
		return set(Downsampler.DOWNSAMPLE_STRATEGY, Preconditions.checkNotNull(((Object) (downsamplestrategy))));
	//    0    0:aload_0         
	//    1    1:getstatic       #423 <Field Option Downsampler.DOWNSAMPLE_STRATEGY>
	//    2    4:aload_1         
	//    3    5:invokestatic    #397 <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:invokevirtual   #249 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public RequestOptions encodeFormat(android.graphics.Bitmap.CompressFormat compressformat)
	{
		return set(BitmapEncoder.COMPRESSION_FORMAT, Preconditions.checkNotNull(((Object) (compressformat))));
	//    0    0:aload_0         
	//    1    1:getstatic       #428 <Field Option BitmapEncoder.COMPRESSION_FORMAT>
	//    2    4:aload_1         
	//    3    5:invokestatic    #397 <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:invokevirtual   #249 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public RequestOptions encodeQuality(int i)
	{
		return set(BitmapEncoder.COMPRESSION_QUALITY, ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #431 <Field Option BitmapEncoder.COMPRESSION_QUALITY>
	//    2    4:iload_1         
	//    3    5:invokestatic    #436 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #249 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof RequestOptions)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class RequestOptions>
	//*   2    4:ifeq            279
		{
			obj = ((Object) ((RequestOptions)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class RequestOptions>
	//    5   11:astore_1        
			return Float.compare(((RequestOptions) (obj)).sizeMultiplier, sizeMultiplier) == 0 && errorId == ((RequestOptions) (obj)).errorId && Util.bothNullOrEqual(((Object) (errorPlaceholder)), ((Object) (((RequestOptions) (obj)).errorPlaceholder))) && placeholderId == ((RequestOptions) (obj)).placeholderId && Util.bothNullOrEqual(((Object) (placeholderDrawable)), ((Object) (((RequestOptions) (obj)).placeholderDrawable))) && fallbackId == ((RequestOptions) (obj)).fallbackId && Util.bothNullOrEqual(((Object) (fallbackDrawable)), ((Object) (((RequestOptions) (obj)).fallbackDrawable))) && isCacheable == ((RequestOptions) (obj)).isCacheable && overrideHeight == ((RequestOptions) (obj)).overrideHeight && overrideWidth == ((RequestOptions) (obj)).overrideWidth && isTransformationRequired == ((RequestOptions) (obj)).isTransformationRequired && isTransformationAllowed == ((RequestOptions) (obj)).isTransformationAllowed && useUnlimitedSourceGeneratorsPool == ((RequestOptions) (obj)).useUnlimitedSourceGeneratorsPool && onlyRetrieveFromCache == ((RequestOptions) (obj)).onlyRetrieveFromCache && ((Object) (diskCacheStrategy)).equals(((Object) (((RequestOptions) (obj)).diskCacheStrategy))) && priority == ((RequestOptions) (obj)).priority && options.equals(((Object) (((RequestOptions) (obj)).options))) && transformations.equals(((Object) (((RequestOptions) (obj)).transformations))) && ((Object) (resourceClass)).equals(((Object) (((RequestOptions) (obj)).resourceClass))) && Util.bothNullOrEqual(((Object) (signature)), ((Object) (((RequestOptions) (obj)).signature))) && Util.bothNullOrEqual(((Object) (theme)), ((Object) (((RequestOptions) (obj)).theme)));
	//    6   12:aload_1         
	//    7   13:getfield        #101 <Field float sizeMultiplier>
	//    8   16:aload_0         
	//    9   17:getfield        #101 <Field float sizeMultiplier>
	//   10   20:invokestatic    #444 <Method int Float.compare(float, float)>
	//   11   23:ifne            277
	//   12   26:aload_0         
	//   13   27:getfield        #326 <Field int errorId>
	//   14   30:aload_1         
	//   15   31:getfield        #326 <Field int errorId>
	//   16   34:icmpne          277
	//   17   37:aload_0         
	//   18   38:getfield        #324 <Field Drawable errorPlaceholder>
	//   19   41:aload_1         
	//   20   42:getfield        #324 <Field Drawable errorPlaceholder>
	//   21   45:invokestatic    #450 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//   22   48:ifeq            277
	//   23   51:aload_0         
	//   24   52:getfield        #330 <Field int placeholderId>
	//   25   55:aload_1         
	//   26   56:getfield        #330 <Field int placeholderId>
	//   27   59:icmpne          277
	//   28   62:aload_0         
	//   29   63:getfield        #328 <Field Drawable placeholderDrawable>
	//   30   66:aload_1         
	//   31   67:getfield        #328 <Field Drawable placeholderDrawable>
	//   32   70:invokestatic    #450 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//   33   73:ifeq            277
	//   34   76:aload_0         
	//   35   77:getfield        #334 <Field int fallbackId>
	//   36   80:aload_1         
	//   37   81:getfield        #334 <Field int fallbackId>
	//   38   84:icmpne          277
	//   39   87:aload_0         
	//   40   88:getfield        #332 <Field Drawable fallbackDrawable>
	//   41   91:aload_1         
	//   42   92:getfield        #332 <Field Drawable fallbackDrawable>
	//   43   95:invokestatic    #450 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//   44   98:ifeq            277
	//   45  101:aload_0         
	//   46  102:getfield        #117 <Field boolean isCacheable>
	//   47  105:aload_1         
	//   48  106:getfield        #117 <Field boolean isCacheable>
	//   49  109:icmpne          277
	//   50  112:aload_0         
	//   51  113:getfield        #119 <Field int overrideHeight>
	//   52  116:aload_1         
	//   53  117:getfield        #119 <Field int overrideHeight>
	//   54  120:icmpne          277
	//   55  123:aload_0         
	//   56  124:getfield        #121 <Field int overrideWidth>
	//   57  127:aload_1         
	//   58  128:getfield        #121 <Field int overrideWidth>
	//   59  131:icmpne          277
	//   60  134:aload_0         
	//   61  135:getfield        #338 <Field boolean isTransformationRequired>
	//   62  138:aload_1         
	//   63  139:getfield        #338 <Field boolean isTransformationRequired>
	//   64  142:icmpne          277
	//   65  145:aload_0         
	//   66  146:getfield        #131 <Field boolean isTransformationAllowed>
	//   67  149:aload_1         
	//   68  150:getfield        #131 <Field boolean isTransformationAllowed>
	//   69  153:icmpne          277
	//   70  156:aload_0         
	//   71  157:getfield        #322 <Field boolean useUnlimitedSourceGeneratorsPool>
	//   72  160:aload_1         
	//   73  161:getfield        #322 <Field boolean useUnlimitedSourceGeneratorsPool>
	//   74  164:icmpne          277
	//   75  167:aload_0         
	//   76  168:getfield        #346 <Field boolean onlyRetrieveFromCache>
	//   77  171:aload_1         
	//   78  172:getfield        #346 <Field boolean onlyRetrieveFromCache>
	//   79  175:icmpne          277
	//   80  178:aload_0         
	//   81  179:getfield        #108 <Field DiskCacheStrategy diskCacheStrategy>
	//   82  182:aload_1         
	//   83  183:getfield        #108 <Field DiskCacheStrategy diskCacheStrategy>
	//   84  186:invokevirtual   #452 <Method boolean Object.equals(Object)>
	//   85  189:ifeq            277
	//   86  192:aload_0         
	//   87  193:getfield        #115 <Field Priority priority>
	//   88  196:aload_1         
	//   89  197:getfield        #115 <Field Priority priority>
	//   90  200:if_acmpne       277
	//   91  203:aload_0         
	//   92  204:getfield        #136 <Field Options options>
	//   93  207:aload_1         
	//   94  208:getfield        #136 <Field Options options>
	//   95  211:invokevirtual   #453 <Method boolean Options.equals(Object)>
	//   96  214:ifeq            277
	//   97  217:aload_0         
	//   98  218:getfield        #141 <Field Map transformations>
	//   99  221:aload_1         
	//  100  222:getfield        #141 <Field Map transformations>
	//  101  225:invokeinterface #454 <Method boolean Map.equals(Object)>
	//  102  230:ifeq            277
	//  103  233:aload_0         
	//  104  234:getfield        #143 <Field Class resourceClass>
	//  105  237:aload_1         
	//  106  238:getfield        #143 <Field Class resourceClass>
	//  107  241:invokevirtual   #452 <Method boolean Object.equals(Object)>
	//  108  244:ifeq            277
	//  109  247:aload_0         
	//  110  248:getfield        #129 <Field Key signature>
	//  111  251:aload_1         
	//  112  252:getfield        #129 <Field Key signature>
	//  113  255:invokestatic    #450 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//  114  258:ifeq            277
	//  115  261:aload_0         
	//  116  262:getfield        #336 <Field android.content.res.Resources$Theme theme>
	//  117  265:aload_1         
	//  118  266:getfield        #336 <Field android.content.res.Resources$Theme theme>
	//  119  269:invokestatic    #450 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//  120  272:ifeq            277
	//  121  275:iconst_1        
	//  122  276:ireturn         
	//  123  277:iconst_0        
	//  124  278:ireturn         
		} else
		{
			return false;
	//  125  279:iconst_0        
	//  126  280:ireturn         
		}
	}

	public RequestOptions error(int i)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().error(i);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #206 <Method RequestOptions error(int)>
	//    7   15:areturn         
		} else
		{
			errorId = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #326 <Field int errorId>
			fields = fields | 0x20;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #229 <Field int fields>
	//   14   26:bipush          32
	//   15   28:ior             
	//   16   29:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   32:aload_0         
	//   18   33:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   36:areturn         
		}
	}

	public RequestOptions error(Drawable drawable)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().error(drawable);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #209 <Method RequestOptions error(Drawable)>
	//    7   15:areturn         
		} else
		{
			errorPlaceholder = drawable;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #324 <Field Drawable errorPlaceholder>
			fields = fields | 0x10;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #229 <Field int fields>
	//   14   26:bipush          16
	//   15   28:ior             
	//   16   29:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   32:aload_0         
	//   18   33:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   36:areturn         
		}
	}

	public RequestOptions fallback(int i)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().fallback(i);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #457 <Method RequestOptions fallback(int)>
	//    7   15:areturn         
		} else
		{
			fallbackId = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #334 <Field int fallbackId>
			fields = fields | 0x4000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #229 <Field int fields>
	//   14   26:sipush          16384
	//   15   29:ior             
	//   16   30:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   33:aload_0         
	//   18   34:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   37:areturn         
		}
	}

	public RequestOptions fallback(Drawable drawable)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().fallback(drawable);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #459 <Method RequestOptions fallback(Drawable)>
	//    7   15:areturn         
		} else
		{
			fallbackDrawable = drawable;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #332 <Field Drawable fallbackDrawable>
			fields = fields | 0x2000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #229 <Field int fields>
	//   14   26:sipush          8192
	//   15   29:ior             
	//   16   30:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   33:aload_0         
	//   18   34:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   37:areturn         
		}
	}

	public RequestOptions fitCenter()
	{
		return scaleOnlyTransform(DownsampleStrategy.FIT_CENTER, ((Transformation) (new FitCenter())));
	//    0    0:aload_0         
	//    1    1:getstatic       #462 <Field DownsampleStrategy DownsampleStrategy.FIT_CENTER>
	//    2    4:new             #464 <Class FitCenter>
	//    3    7:dup             
	//    4    8:invokespecial   #465 <Method void FitCenter()>
	//    5   11:invokespecial   #377 <Method RequestOptions scaleOnlyTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions format(DecodeFormat decodeformat)
	{
		return set(Downsampler.DECODE_FORMAT, Preconditions.checkNotNull(((Object) (decodeformat))));
	//    0    0:aload_0         
	//    1    1:getstatic       #468 <Field Option Downsampler.DECODE_FORMAT>
	//    2    4:aload_1         
	//    3    5:invokestatic    #397 <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:invokevirtual   #249 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public RequestOptions frame(long l)
	{
		return set(VideoBitmapDecoder.TARGET_FRAME, ((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getstatic       #473 <Field Option VideoBitmapDecoder.TARGET_FRAME>
	//    2    4:lload_1         
	//    3    5:invokestatic    #478 <Method Long Long.valueOf(long)>
	//    4    8:invokevirtual   #249 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public final DiskCacheStrategy getDiskCacheStrategy()
	{
		return diskCacheStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field DiskCacheStrategy diskCacheStrategy>
	//    2    4:areturn         
	}

	public final int getErrorId()
	{
		return errorId;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field int errorId>
	//    2    4:ireturn         
	}

	public final Drawable getErrorPlaceholder()
	{
		return errorPlaceholder;
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field Drawable errorPlaceholder>
	//    2    4:areturn         
	}

	public final Drawable getFallbackDrawable()
	{
		return fallbackDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field Drawable fallbackDrawable>
	//    2    4:areturn         
	}

	public final int getFallbackId()
	{
		return fallbackId;
	//    0    0:aload_0         
	//    1    1:getfield        #334 <Field int fallbackId>
	//    2    4:ireturn         
	}

	public final boolean getOnlyRetrieveFromCache()
	{
		return onlyRetrieveFromCache;
	//    0    0:aload_0         
	//    1    1:getfield        #346 <Field boolean onlyRetrieveFromCache>
	//    2    4:ireturn         
	}

	public final Options getOptions()
	{
		return options;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field Options options>
	//    2    4:areturn         
	}

	public final int getOverrideHeight()
	{
		return overrideHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int overrideHeight>
	//    2    4:ireturn         
	}

	public final int getOverrideWidth()
	{
		return overrideWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field int overrideWidth>
	//    2    4:ireturn         
	}

	public final Drawable getPlaceholderDrawable()
	{
		return placeholderDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #328 <Field Drawable placeholderDrawable>
	//    2    4:areturn         
	}

	public final int getPlaceholderId()
	{
		return placeholderId;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field int placeholderId>
	//    2    4:ireturn         
	}

	public final Priority getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Priority priority>
	//    2    4:areturn         
	}

	public final Class getResourceClass()
	{
		return resourceClass;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field Class resourceClass>
	//    2    4:areturn         
	}

	public final Key getSignature()
	{
		return signature;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field Key signature>
	//    2    4:areturn         
	}

	public final float getSizeMultiplier()
	{
		return sizeMultiplier;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field float sizeMultiplier>
	//    2    4:freturn         
	}

	public final android.content.res.Resources.Theme getTheme()
	{
		return theme;
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field android.content.res.Resources$Theme theme>
	//    2    4:areturn         
	}

	public final Map getTransformations()
	{
		return transformations;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field Map transformations>
	//    2    4:areturn         
	}

	public final boolean getUseUnlimitedSourceGeneratorsPool()
	{
		return useUnlimitedSourceGeneratorsPool;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field boolean useUnlimitedSourceGeneratorsPool>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		int i = Util.hashCode(sizeMultiplier);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field float sizeMultiplier>
	//    2    4:invokestatic    #514 <Method int Util.hashCode(float)>
	//    3    7:istore_1        
		i = Util.hashCode(errorId, i);
	//    4    8:aload_0         
	//    5    9:getfield        #326 <Field int errorId>
	//    6   12:iload_1         
	//    7   13:invokestatic    #517 <Method int Util.hashCode(int, int)>
	//    8   16:istore_1        
		i = Util.hashCode(((Object) (errorPlaceholder)), i);
	//    9   17:aload_0         
	//   10   18:getfield        #324 <Field Drawable errorPlaceholder>
	//   11   21:iload_1         
	//   12   22:invokestatic    #520 <Method int Util.hashCode(Object, int)>
	//   13   25:istore_1        
		i = Util.hashCode(placeholderId, i);
	//   14   26:aload_0         
	//   15   27:getfield        #330 <Field int placeholderId>
	//   16   30:iload_1         
	//   17   31:invokestatic    #517 <Method int Util.hashCode(int, int)>
	//   18   34:istore_1        
		i = Util.hashCode(((Object) (placeholderDrawable)), i);
	//   19   35:aload_0         
	//   20   36:getfield        #328 <Field Drawable placeholderDrawable>
	//   21   39:iload_1         
	//   22   40:invokestatic    #520 <Method int Util.hashCode(Object, int)>
	//   23   43:istore_1        
		i = Util.hashCode(fallbackId, i);
	//   24   44:aload_0         
	//   25   45:getfield        #334 <Field int fallbackId>
	//   26   48:iload_1         
	//   27   49:invokestatic    #517 <Method int Util.hashCode(int, int)>
	//   28   52:istore_1        
		i = Util.hashCode(((Object) (fallbackDrawable)), i);
	//   29   53:aload_0         
	//   30   54:getfield        #332 <Field Drawable fallbackDrawable>
	//   31   57:iload_1         
	//   32   58:invokestatic    #520 <Method int Util.hashCode(Object, int)>
	//   33   61:istore_1        
		i = Util.hashCode(isCacheable, i);
	//   34   62:aload_0         
	//   35   63:getfield        #117 <Field boolean isCacheable>
	//   36   66:iload_1         
	//   37   67:invokestatic    #523 <Method int Util.hashCode(boolean, int)>
	//   38   70:istore_1        
		i = Util.hashCode(overrideHeight, i);
	//   39   71:aload_0         
	//   40   72:getfield        #119 <Field int overrideHeight>
	//   41   75:iload_1         
	//   42   76:invokestatic    #517 <Method int Util.hashCode(int, int)>
	//   43   79:istore_1        
		i = Util.hashCode(overrideWidth, i);
	//   44   80:aload_0         
	//   45   81:getfield        #121 <Field int overrideWidth>
	//   46   84:iload_1         
	//   47   85:invokestatic    #517 <Method int Util.hashCode(int, int)>
	//   48   88:istore_1        
		i = Util.hashCode(isTransformationRequired, i);
	//   49   89:aload_0         
	//   50   90:getfield        #338 <Field boolean isTransformationRequired>
	//   51   93:iload_1         
	//   52   94:invokestatic    #523 <Method int Util.hashCode(boolean, int)>
	//   53   97:istore_1        
		i = Util.hashCode(isTransformationAllowed, i);
	//   54   98:aload_0         
	//   55   99:getfield        #131 <Field boolean isTransformationAllowed>
	//   56  102:iload_1         
	//   57  103:invokestatic    #523 <Method int Util.hashCode(boolean, int)>
	//   58  106:istore_1        
		i = Util.hashCode(useUnlimitedSourceGeneratorsPool, i);
	//   59  107:aload_0         
	//   60  108:getfield        #322 <Field boolean useUnlimitedSourceGeneratorsPool>
	//   61  111:iload_1         
	//   62  112:invokestatic    #523 <Method int Util.hashCode(boolean, int)>
	//   63  115:istore_1        
		i = Util.hashCode(onlyRetrieveFromCache, i);
	//   64  116:aload_0         
	//   65  117:getfield        #346 <Field boolean onlyRetrieveFromCache>
	//   66  120:iload_1         
	//   67  121:invokestatic    #523 <Method int Util.hashCode(boolean, int)>
	//   68  124:istore_1        
		i = Util.hashCode(((Object) (diskCacheStrategy)), i);
	//   69  125:aload_0         
	//   70  126:getfield        #108 <Field DiskCacheStrategy diskCacheStrategy>
	//   71  129:iload_1         
	//   72  130:invokestatic    #520 <Method int Util.hashCode(Object, int)>
	//   73  133:istore_1        
		i = Util.hashCode(((Object) (priority)), i);
	//   74  134:aload_0         
	//   75  135:getfield        #115 <Field Priority priority>
	//   76  138:iload_1         
	//   77  139:invokestatic    #520 <Method int Util.hashCode(Object, int)>
	//   78  142:istore_1        
		i = Util.hashCode(((Object) (options)), i);
	//   79  143:aload_0         
	//   80  144:getfield        #136 <Field Options options>
	//   81  147:iload_1         
	//   82  148:invokestatic    #520 <Method int Util.hashCode(Object, int)>
	//   83  151:istore_1        
		i = Util.hashCode(((Object) (transformations)), i);
	//   84  152:aload_0         
	//   85  153:getfield        #141 <Field Map transformations>
	//   86  156:iload_1         
	//   87  157:invokestatic    #520 <Method int Util.hashCode(Object, int)>
	//   88  160:istore_1        
		i = Util.hashCode(((Object) (resourceClass)), i);
	//   89  161:aload_0         
	//   90  162:getfield        #143 <Field Class resourceClass>
	//   91  165:iload_1         
	//   92  166:invokestatic    #520 <Method int Util.hashCode(Object, int)>
	//   93  169:istore_1        
		i = Util.hashCode(((Object) (signature)), i);
	//   94  170:aload_0         
	//   95  171:getfield        #129 <Field Key signature>
	//   96  174:iload_1         
	//   97  175:invokestatic    #520 <Method int Util.hashCode(Object, int)>
	//   98  178:istore_1        
		return Util.hashCode(((Object) (theme)), i);
	//   99  179:aload_0         
	//  100  180:getfield        #336 <Field android.content.res.Resources$Theme theme>
	//  101  183:iload_1         
	//  102  184:invokestatic    #520 <Method int Util.hashCode(Object, int)>
	//  103  187:ireturn         
	}

	protected boolean isAutoCloneEnabled()
	{
		return isAutoCloneEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//    2    4:ireturn         
	}

	public final boolean isLocked()
	{
		return isLocked;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field boolean isLocked>
	//    2    4:ireturn         
	}

	public final boolean isMemoryCacheable()
	{
		return isCacheable;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field boolean isCacheable>
	//    2    4:ireturn         
	}

	public final boolean isPrioritySet()
	{
		return isSet(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokespecial   #527 <Method boolean isSet(int)>
	//    3    6:ireturn         
	}

	public boolean isScaleOnlyOrNoTransform()
	{
		return isScaleOnlyOrNoTransform;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field boolean isScaleOnlyOrNoTransform>
	//    2    4:ireturn         
	}

	public final boolean isTransformationAllowed()
	{
		return isTransformationAllowed;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field boolean isTransformationAllowed>
	//    2    4:ireturn         
	}

	public final boolean isTransformationRequired()
	{
		return isTransformationRequired;
	//    0    0:aload_0         
	//    1    1:getfield        #338 <Field boolean isTransformationRequired>
	//    2    4:ireturn         
	}

	public final boolean isTransformationSet()
	{
		return isSet(2048);
	//    0    0:aload_0         
	//    1    1:sipush          2048
	//    2    4:invokespecial   #527 <Method boolean isSet(int)>
	//    3    7:ireturn         
	}

	public final boolean isValidOverride()
	{
		return Util.isValidDimensions(overrideWidth, overrideHeight);
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field int overrideWidth>
	//    2    4:aload_0         
	//    3    5:getfield        #119 <Field int overrideHeight>
	//    4    8:invokestatic    #532 <Method boolean Util.isValidDimensions(int, int)>
	//    5   11:ireturn         
	}

	public RequestOptions lock()
	{
		isLocked = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #283 <Field boolean isLocked>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RequestOptions onlyRetrieveFromCache(boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().onlyRetrieveFromCache(flag);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #534 <Method RequestOptions onlyRetrieveFromCache(boolean)>
	//    7   15:areturn         
		} else
		{
			onlyRetrieveFromCache = flag;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #346 <Field boolean onlyRetrieveFromCache>
			fields = fields | 0x80000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #229 <Field int fields>
	//   14   26:ldc1            #21  <Int 0x80000>
	//   15   28:ior             
	//   16   29:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   32:aload_0         
	//   18   33:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   36:areturn         
		}
	}

	public RequestOptions optionalCenterCrop()
	{
		return optionalTransform(DownsampleStrategy.CENTER_OUTSIDE, ((Transformation) (new CenterCrop())));
	//    0    0:aload_0         
	//    1    1:getstatic       #366 <Field DownsampleStrategy DownsampleStrategy.CENTER_OUTSIDE>
	//    2    4:new             #368 <Class CenterCrop>
	//    3    7:dup             
	//    4    8:invokespecial   #369 <Method void CenterCrop()>
	//    5   11:invokevirtual   #279 <Method RequestOptions optionalTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions optionalCenterInside()
	{
		return optionalScaleOnlyTransform(DownsampleStrategy.CENTER_INSIDE, ((Transformation) (new CenterInside())));
	//    0    0:aload_0         
	//    1    1:getstatic       #372 <Field DownsampleStrategy DownsampleStrategy.CENTER_INSIDE>
	//    2    4:new             #374 <Class CenterInside>
	//    3    7:dup             
	//    4    8:invokespecial   #375 <Method void CenterInside()>
	//    5   11:invokespecial   #538 <Method RequestOptions optionalScaleOnlyTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions optionalCircleCrop()
	{
		return optionalTransform(DownsampleStrategy.CENTER_OUTSIDE, ((Transformation) (new CircleCrop())));
	//    0    0:aload_0         
	//    1    1:getstatic       #366 <Field DownsampleStrategy DownsampleStrategy.CENTER_OUTSIDE>
	//    2    4:new             #379 <Class CircleCrop>
	//    3    7:dup             
	//    4    8:invokespecial   #380 <Method void CircleCrop()>
	//    5   11:invokevirtual   #279 <Method RequestOptions optionalTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions optionalFitCenter()
	{
		return optionalScaleOnlyTransform(DownsampleStrategy.FIT_CENTER, ((Transformation) (new FitCenter())));
	//    0    0:aload_0         
	//    1    1:getstatic       #462 <Field DownsampleStrategy DownsampleStrategy.FIT_CENTER>
	//    2    4:new             #464 <Class FitCenter>
	//    3    7:dup             
	//    4    8:invokespecial   #465 <Method void FitCenter()>
	//    5   11:invokespecial   #538 <Method RequestOptions optionalScaleOnlyTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions optionalTransform(Transformation transformation)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().optionalTransform(transformation);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #542 <Method RequestOptions optionalTransform(Transformation)>
	//    7   15:areturn         
		} else
		{
			optionalTransform(android/graphics/Bitmap, transformation);
	//    8   16:aload_0         
	//    9   17:ldc2            #544 <Class Bitmap>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #547 <Method RequestOptions optionalTransform(Class, Transformation)>
	//   12   24:pop             
			optionalTransform(android/graphics/drawable/BitmapDrawable, ((Transformation) (new BitmapDrawableTransformation(transformation))));
	//   13   25:aload_0         
	//   14   26:ldc2            #549 <Class BitmapDrawable>
	//   15   29:new             #551 <Class BitmapDrawableTransformation>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokespecial   #554 <Method void BitmapDrawableTransformation(Transformation)>
	//   19   37:invokevirtual   #547 <Method RequestOptions optionalTransform(Class, Transformation)>
	//   20   40:pop             
			optionalTransform(com/bumptech/glide/load/resource/gif/GifDrawable, ((Transformation) (new GifDrawableTransformation(transformation))));
	//   21   41:aload_0         
	//   22   42:ldc2            #556 <Class GifDrawable>
	//   23   45:new             #558 <Class GifDrawableTransformation>
	//   24   48:dup             
	//   25   49:aload_1         
	//   26   50:invokespecial   #559 <Method void GifDrawableTransformation(Transformation)>
	//   27   53:invokevirtual   #547 <Method RequestOptions optionalTransform(Class, Transformation)>
	//   28   56:pop             
			return selfOrThrowIfLocked();
	//   29   57:aload_0         
	//   30   58:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   31   61:areturn         
		}
	}

	final RequestOptions optionalTransform(DownsampleStrategy downsamplestrategy, Transformation transformation)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().optionalTransform(downsamplestrategy, transformation);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #279 <Method RequestOptions optionalTransform(DownsampleStrategy, Transformation)>
	//    8   16:areturn         
		} else
		{
			downsample(downsamplestrategy);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #192 <Method RequestOptions downsample(DownsampleStrategy)>
	//   12   22:pop             
			return optionalTransform(transformation);
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #542 <Method RequestOptions optionalTransform(Transformation)>
	//   16   28:areturn         
		}
	}

	public RequestOptions optionalTransform(Class class1, Transformation transformation)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().optionalTransform(class1, transformation);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #547 <Method RequestOptions optionalTransform(Class, Transformation)>
	//    8   16:areturn         
		} else
		{
			Preconditions.checkNotNull(((Object) (class1)));
	//    9   17:aload_1         
	//   10   18:invokestatic    #397 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:pop             
			Preconditions.checkNotNull(((Object) (transformation)));
	//   12   22:aload_2         
	//   13   23:invokestatic    #397 <Method Object Preconditions.checkNotNull(Object)>
	//   14   26:pop             
			transformations.put(((Object) (class1)), ((Object) (transformation)));
	//   15   27:aload_0         
	//   16   28:getfield        #141 <Field Map transformations>
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokeinterface #563 <Method Object Map.put(Object, Object)>
	//   20   38:pop             
			fields = fields | 0x800;
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #229 <Field int fields>
	//   24   44:sipush          2048
	//   25   47:ior             
	//   26   48:putfield        #229 <Field int fields>
			isTransformationAllowed = true;
	//   27   51:aload_0         
	//   28   52:iconst_1        
	//   29   53:putfield        #131 <Field boolean isTransformationAllowed>
			fields = fields | 0x10000;
	//   30   56:aload_0         
	//   31   57:aload_0         
	//   32   58:getfield        #229 <Field int fields>
	//   33   61:ldc1            #41  <Int 0x10000>
	//   34   63:ior             
	//   35   64:putfield        #229 <Field int fields>
			isScaleOnlyOrNoTransform = false;
	//   36   67:aload_0         
	//   37   68:iconst_0        
	//   38   69:putfield        #145 <Field boolean isScaleOnlyOrNoTransform>
			return selfOrThrowIfLocked();
	//   39   72:aload_0         
	//   40   73:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   41   76:areturn         
		}
	}

	public RequestOptions override(int i)
	{
		return override(i, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #264 <Method RequestOptions override(int, int)>
	//    4    6:areturn         
	}

	public RequestOptions override(int i, int j)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().override(i, j);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #264 <Method RequestOptions override(int, int)>
	//    8   16:areturn         
		} else
		{
			overrideWidth = i;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #121 <Field int overrideWidth>
			overrideHeight = j;
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:putfield        #119 <Field int overrideHeight>
			fields = fields | 0x200;
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #229 <Field int fields>
	//   18   32:sipush          512
	//   19   35:ior             
	//   20   36:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   21   39:aload_0         
	//   22   40:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   23   43:areturn         
		}
	}

	public RequestOptions placeholder(int i)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().placeholder(i);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #268 <Method RequestOptions placeholder(int)>
	//    7   15:areturn         
		} else
		{
			placeholderId = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #330 <Field int placeholderId>
			fields = fields | 0x80;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #229 <Field int fields>
	//   14   26:sipush          128
	//   15   29:ior             
	//   16   30:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   33:aload_0         
	//   18   34:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   37:areturn         
		}
	}

	public RequestOptions placeholder(Drawable drawable)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().placeholder(drawable);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #270 <Method RequestOptions placeholder(Drawable)>
	//    7   15:areturn         
		} else
		{
			placeholderDrawable = drawable;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #328 <Field Drawable placeholderDrawable>
			fields = fields | 0x40;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #229 <Field int fields>
	//   14   26:bipush          64
	//   15   28:ior             
	//   16   29:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   32:aload_0         
	//   18   33:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   36:areturn         
		}
	}

	public RequestOptions priority(Priority priority1)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().priority(priority1);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #274 <Method RequestOptions priority(Priority)>
	//    7   15:areturn         
		} else
		{
			priority = (Priority)Preconditions.checkNotNull(((Object) (priority1)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #397 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #110 <Class Priority>
	//   12   24:putfield        #115 <Field Priority priority>
			fields = fields | 8;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #229 <Field int fields>
	//   16   32:bipush          8
	//   17   34:ior             
	//   18   35:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   38:aload_0         
	//   20   39:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   21   42:areturn         
		}
	}

	public RequestOptions set(Option option1, Object obj)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().set(option1, obj);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #249 <Method RequestOptions set(Option, Object)>
	//    8   16:areturn         
		} else
		{
			Preconditions.checkNotNull(((Object) (option1)));
	//    9   17:aload_1         
	//   10   18:invokestatic    #397 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:pop             
			Preconditions.checkNotNull(obj);
	//   12   22:aload_2         
	//   13   23:invokestatic    #397 <Method Object Preconditions.checkNotNull(Object)>
	//   14   26:pop             
			options.set(option1, obj);
	//   15   27:aload_0         
	//   16   28:getfield        #136 <Field Options options>
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokevirtual   #567 <Method Options Options.set(Option, Object)>
	//   20   36:pop             
			return selfOrThrowIfLocked();
	//   21   37:aload_0         
	//   22   38:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   23   41:areturn         
		}
	}

	public RequestOptions signature(Key key)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().signature(key);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #294 <Method RequestOptions signature(Key)>
	//    7   15:areturn         
		} else
		{
			signature = (Key)Preconditions.checkNotNull(((Object) (key)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #397 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #569 <Class Key>
	//   12   24:putfield        #129 <Field Key signature>
			fields = fields | 0x400;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #229 <Field int fields>
	//   16   32:sipush          1024
	//   17   35:ior             
	//   18   36:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   39:aload_0         
	//   20   40:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   21   43:areturn         
		}
	}

	public RequestOptions sizeMultiplier(float f)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
			return clone().sizeMultiplier(f);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:fload_1         
	//    6   12:invokevirtual   #298 <Method RequestOptions sizeMultiplier(float)>
	//    7   15:areturn         
		if(f < 0.0F || f > 1.0F)
	//*   8   16:fload_1         
	//*   9   17:fconst_0        
	//*  10   18:fcmpg           
	//*  11   19:iflt            28
	//*  12   22:fload_1         
	//*  13   23:fconst_1        
	//*  14   24:fcmpl           
	//*  15   25:ifle            39
		{
			throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
	//   16   28:new             #571 <Class IllegalArgumentException>
	//   17   31:dup             
	//   18   32:ldc2            #573 <String "sizeMultiplier must be between 0 and 1">
	//   19   35:invokespecial   #574 <Method void IllegalArgumentException(String)>
	//   20   38:athrow          
		} else
		{
			sizeMultiplier = f;
	//   21   39:aload_0         
	//   22   40:fload_1         
	//   23   41:putfield        #101 <Field float sizeMultiplier>
			fields = fields | 2;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #229 <Field int fields>
	//   27   49:iconst_2        
	//   28   50:ior             
	//   29   51:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   30   54:aload_0         
	//   31   55:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   32   58:areturn         
		}
	}

	public RequestOptions skipMemoryCache(boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
			return clone().skipMemoryCache(true);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #305 <Method RequestOptions skipMemoryCache(boolean)>
	//    7   15:areturn         
		if(!flag)
	//*   8   16:iload_1         
	//*   9   17:ifne            25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_1        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_1        
		isCacheable = flag;
	//   15   27:aload_0         
	//   16   28:iload_1         
	//   17   29:putfield        #117 <Field boolean isCacheable>
		fields = fields | 0x100;
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #229 <Field int fields>
	//   21   37:sipush          256
	//   22   40:ior             
	//   23   41:putfield        #229 <Field int fields>
		return selfOrThrowIfLocked();
	//   24   44:aload_0         
	//   25   45:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   26   48:areturn         
	}

	public RequestOptions theme(android.content.res.Resources.Theme theme1)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().theme(theme1);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #577 <Method RequestOptions theme(android.content.res.Resources$Theme)>
	//    7   15:areturn         
		} else
		{
			theme = theme1;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #336 <Field android.content.res.Resources$Theme theme>
			fields = fields | 0x8000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #229 <Field int fields>
	//   14   26:ldc1            #37  <Int 32768>
	//   15   28:ior             
	//   16   29:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   32:aload_0         
	//   18   33:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   36:areturn         
		}
	}

	public RequestOptions timeout(int i)
	{
		return set(HttpGlideUrlLoader.TIMEOUT, ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #582 <Field Option HttpGlideUrlLoader.TIMEOUT>
	//    2    4:iload_1         
	//    3    5:invokestatic    #436 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #249 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public RequestOptions transform(Transformation transformation)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().transform(transformation);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #152 <Method RequestOptions transform(Transformation)>
	//    7   15:areturn         
		} else
		{
			optionalTransform(transformation);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #542 <Method RequestOptions optionalTransform(Transformation)>
	//   11   21:pop             
			isTransformationRequired = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #338 <Field boolean isTransformationRequired>
			fields = fields | 0x20000;
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #229 <Field int fields>
	//   18   32:ldc1            #43  <Int 0x20000>
	//   19   34:ior             
	//   20   35:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   21   38:aload_0         
	//   22   39:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   23   42:areturn         
		}
	}

	final RequestOptions transform(DownsampleStrategy downsamplestrategy, Transformation transformation)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().transform(downsamplestrategy, transformation);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #276 <Method RequestOptions transform(DownsampleStrategy, Transformation)>
	//    8   16:areturn         
		} else
		{
			downsample(downsamplestrategy);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #192 <Method RequestOptions downsample(DownsampleStrategy)>
	//   12   22:pop             
			return transform(transformation);
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #152 <Method RequestOptions transform(Transformation)>
	//   16   28:areturn         
		}
	}

	public RequestOptions transform(Class class1, Transformation transformation)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().transform(class1, transformation);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #584 <Method RequestOptions transform(Class, Transformation)>
	//    8   16:areturn         
		} else
		{
			optionalTransform(class1, transformation);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #547 <Method RequestOptions optionalTransform(Class, Transformation)>
	//   13   23:pop             
			isTransformationRequired = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #338 <Field boolean isTransformationRequired>
			fields = fields | 0x20000;
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #229 <Field int fields>
	//   20   34:ldc1            #43  <Int 0x20000>
	//   21   36:ior             
	//   22   37:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   23   40:aload_0         
	//   24   41:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   25   44:areturn         
		}
	}

	public transient RequestOptions transforms(Transformation atransformation[])
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().transforms(atransformation);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #588 <Method RequestOptions transforms(Transformation[])>
	//    7   15:areturn         
		} else
		{
			optionalTransform(((Transformation) (new MultiTransformation(atransformation))));
	//    8   16:aload_0         
	//    9   17:new             #590 <Class MultiTransformation>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #593 <Method void MultiTransformation(Transformation[])>
	//   13   25:invokevirtual   #542 <Method RequestOptions optionalTransform(Transformation)>
	//   14   28:pop             
			isTransformationRequired = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #338 <Field boolean isTransformationRequired>
			fields = fields | 0x20000;
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #229 <Field int fields>
	//   21   39:ldc1            #43  <Int 0x20000>
	//   22   41:ior             
	//   23   42:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   24   45:aload_0         
	//   25   46:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   26   49:areturn         
		}
	}

	public RequestOptions useUnlimitedSourceGeneratorsPool(boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().useUnlimitedSourceGeneratorsPool(flag);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #318 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #596 <Method RequestOptions useUnlimitedSourceGeneratorsPool(boolean)>
	//    7   15:areturn         
		} else
		{
			useUnlimitedSourceGeneratorsPool = flag;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #322 <Field boolean useUnlimitedSourceGeneratorsPool>
			fields = fields | 0x40000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #229 <Field int fields>
	//   14   26:ldc1            #47  <Int 0x40000>
	//   15   28:ior             
	//   16   29:putfield        #229 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   32:aload_0         
	//   18   33:invokespecial   #355 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   36:areturn         
		}
	}

	private static final int DISK_CACHE_STRATEGY = 4;
	private static final int ERROR_ID = 32;
	private static final int ERROR_PLACEHOLDER = 16;
	private static final int FALLBACK = 8192;
	private static final int FALLBACK_ID = 16384;
	private static final int IS_CACHEABLE = 256;
	private static final int ONLY_RETRIEVE_FROM_CACHE = 0x80000;
	private static final int OVERRIDE = 512;
	private static final int PLACEHOLDER = 64;
	private static final int PLACEHOLDER_ID = 128;
	private static final int PRIORITY = 8;
	private static final int RESOURCE_CLASS = 4096;
	private static final int SIGNATURE = 1024;
	private static final int SIZE_MULTIPLIER = 2;
	private static final int THEME = 32768;
	private static final int TRANSFORMATION = 2048;
	private static final int TRANSFORMATION_ALLOWED = 0x10000;
	private static final int TRANSFORMATION_REQUIRED = 0x20000;
	private static final int UNSET = -1;
	private static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 0x40000;
	private static RequestOptions centerCropOptions;
	private static RequestOptions centerInsideOptions;
	private static RequestOptions circleCropOptions;
	private static RequestOptions fitCenterOptions;
	private static RequestOptions noAnimationOptions;
	private static RequestOptions noTransformOptions;
	private static RequestOptions skipMemoryCacheFalseOptions;
	private static RequestOptions skipMemoryCacheTrueOptions;
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
	private boolean useUnlimitedSourceGeneratorsPool;
}
