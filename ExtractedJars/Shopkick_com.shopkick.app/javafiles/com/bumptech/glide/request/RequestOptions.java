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
import com.bumptech.glide.util.*;
import java.util.Map;

public class RequestOptions
	implements Cloneable
{

	public RequestOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void Object()>
		sizeMultiplier = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #104 <Field float sizeMultiplier>
		diskCacheStrategy = DiskCacheStrategy.AUTOMATIC;
	//    5    9:aload_0         
	//    6   10:getstatic       #109 <Field DiskCacheStrategy DiskCacheStrategy.AUTOMATIC>
	//    7   13:putfield        #111 <Field DiskCacheStrategy diskCacheStrategy>
		priority = Priority.NORMAL;
	//    8   16:aload_0         
	//    9   17:getstatic       #116 <Field Priority Priority.NORMAL>
	//   10   20:putfield        #118 <Field Priority priority>
		isCacheable = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #120 <Field boolean isCacheable>
		overrideHeight = -1;
	//   14   28:aload_0         
	//   15   29:iconst_m1       
	//   16   30:putfield        #122 <Field int overrideHeight>
		overrideWidth = -1;
	//   17   33:aload_0         
	//   18   34:iconst_m1       
	//   19   35:putfield        #124 <Field int overrideWidth>
		signature = ((Key) (EmptySignature.obtain()));
	//   20   38:aload_0         
	//   21   39:invokestatic    #130 <Method EmptySignature EmptySignature.obtain()>
	//   22   42:putfield        #132 <Field Key signature>
		isTransformationAllowed = true;
	//   23   45:aload_0         
	//   24   46:iconst_1        
	//   25   47:putfield        #134 <Field boolean isTransformationAllowed>
		options = new Options();
	//   26   50:aload_0         
	//   27   51:new             #136 <Class Options>
	//   28   54:dup             
	//   29   55:invokespecial   #137 <Method void Options()>
	//   30   58:putfield        #139 <Field Options options>
		transformations = ((Map) (new CachedHashCodeArrayMap()));
	//   31   61:aload_0         
	//   32   62:new             #141 <Class CachedHashCodeArrayMap>
	//   33   65:dup             
	//   34   66:invokespecial   #142 <Method void CachedHashCodeArrayMap()>
	//   35   69:putfield        #144 <Field Map transformations>
		resourceClass = java/lang/Object;
	//   36   72:aload_0         
	//   37   73:ldc1            #4   <Class Object>
	//   38   75:putfield        #146 <Field Class resourceClass>
		isScaleOnlyOrNoTransform = true;
	//   39   78:aload_0         
	//   40   79:iconst_1        
	//   41   80:putfield        #148 <Field boolean isScaleOnlyOrNoTransform>
	//   42   83:return          
	}

	public static RequestOptions bitmapTransform(Transformation transformation)
	{
		return (new RequestOptions()).transform(transformation);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #156 <Method RequestOptions transform(Transformation)>
	//    5   11:areturn         
	}

	public static RequestOptions centerCropTransform()
	{
		if(centerCropOptions == null)
	//*   0    0:getstatic       #164 <Field RequestOptions centerCropOptions>
	//*   1    3:ifnonnull       22
			centerCropOptions = (new RequestOptions()).centerCrop().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #153 <Method void RequestOptions()>
	//    5   13:invokevirtual   #167 <Method RequestOptions centerCrop()>
	//    6   16:invokevirtual   #170 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #164 <Field RequestOptions centerCropOptions>
		return centerCropOptions;
	//    8   22:getstatic       #164 <Field RequestOptions centerCropOptions>
	//    9   25:areturn         
	}

	public static RequestOptions centerInsideTransform()
	{
		if(centerInsideOptions == null)
	//*   0    0:getstatic       #173 <Field RequestOptions centerInsideOptions>
	//*   1    3:ifnonnull       22
			centerInsideOptions = (new RequestOptions()).centerInside().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #153 <Method void RequestOptions()>
	//    5   13:invokevirtual   #176 <Method RequestOptions centerInside()>
	//    6   16:invokevirtual   #170 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #173 <Field RequestOptions centerInsideOptions>
		return centerInsideOptions;
	//    8   22:getstatic       #173 <Field RequestOptions centerInsideOptions>
	//    9   25:areturn         
	}

	public static RequestOptions circleCropTransform()
	{
		if(circleCropOptions == null)
	//*   0    0:getstatic       #179 <Field RequestOptions circleCropOptions>
	//*   1    3:ifnonnull       22
			circleCropOptions = (new RequestOptions()).circleCrop().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #153 <Method void RequestOptions()>
	//    5   13:invokevirtual   #182 <Method RequestOptions circleCrop()>
	//    6   16:invokevirtual   #170 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #179 <Field RequestOptions circleCropOptions>
		return circleCropOptions;
	//    8   22:getstatic       #179 <Field RequestOptions circleCropOptions>
	//    9   25:areturn         
	}

	public static RequestOptions decodeTypeOf(Class class1)
	{
		return (new RequestOptions()).decode(class1);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #187 <Method RequestOptions decode(Class)>
	//    5   11:areturn         
	}

	public static RequestOptions diskCacheStrategyOf(DiskCacheStrategy diskcachestrategy)
	{
		return (new RequestOptions()).diskCacheStrategy(diskcachestrategy);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #192 <Method RequestOptions diskCacheStrategy(DiskCacheStrategy)>
	//    5   11:areturn         
	}

	public static RequestOptions downsampleOf(DownsampleStrategy downsamplestrategy)
	{
		return (new RequestOptions()).downsample(downsamplestrategy);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #197 <Method RequestOptions downsample(DownsampleStrategy)>
	//    5   11:areturn         
	}

	public static RequestOptions encodeFormatOf(android.graphics.Bitmap.CompressFormat compressformat)
	{
		return (new RequestOptions()).encodeFormat(compressformat);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #202 <Method RequestOptions encodeFormat(android.graphics.Bitmap$CompressFormat)>
	//    5   11:areturn         
	}

	public static RequestOptions encodeQualityOf(int i)
	{
		return (new RequestOptions()).encodeQuality(i);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:iload_0         
	//    4    8:invokevirtual   #214 <Method RequestOptions encodeQuality(int)>
	//    5   11:areturn         
	}

	public static RequestOptions errorOf(int i)
	{
		return (new RequestOptions()).error(i);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:iload_0         
	//    4    8:invokevirtual   #219 <Method RequestOptions error(int)>
	//    5   11:areturn         
	}

	public static RequestOptions errorOf(Drawable drawable)
	{
		return (new RequestOptions()).error(drawable);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #222 <Method RequestOptions error(Drawable)>
	//    5   11:areturn         
	}

	public static RequestOptions fitCenterTransform()
	{
		if(fitCenterOptions == null)
	//*   0    0:getstatic       #225 <Field RequestOptions fitCenterOptions>
	//*   1    3:ifnonnull       22
			fitCenterOptions = (new RequestOptions()).fitCenter().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #153 <Method void RequestOptions()>
	//    5   13:invokevirtual   #228 <Method RequestOptions fitCenter()>
	//    6   16:invokevirtual   #170 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #225 <Field RequestOptions fitCenterOptions>
		return fitCenterOptions;
	//    8   22:getstatic       #225 <Field RequestOptions fitCenterOptions>
	//    9   25:areturn         
	}

	public static RequestOptions formatOf(DecodeFormat decodeformat)
	{
		return (new RequestOptions()).format(decodeformat);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #233 <Method RequestOptions format(DecodeFormat)>
	//    5   11:areturn         
	}

	public static RequestOptions frameOf(long l)
	{
		return (new RequestOptions()).frame(l);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:lload_0         
	//    4    8:invokevirtual   #238 <Method RequestOptions frame(long)>
	//    5   11:areturn         
	}

	private boolean isSet(int i)
	{
		return isSet(fields, i);
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field int fields>
	//    2    4:iload_1         
	//    3    5:invokestatic    #245 <Method boolean isSet(int, int)>
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
	//*   0    0:getstatic       #248 <Field RequestOptions noAnimationOptions>
	//*   1    3:ifnonnull       22
			noAnimationOptions = (new RequestOptions()).dontAnimate().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #153 <Method void RequestOptions()>
	//    5   13:invokevirtual   #251 <Method RequestOptions dontAnimate()>
	//    6   16:invokevirtual   #170 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #248 <Field RequestOptions noAnimationOptions>
		return noAnimationOptions;
	//    8   22:getstatic       #248 <Field RequestOptions noAnimationOptions>
	//    9   25:areturn         
	}

	public static RequestOptions noTransformation()
	{
		if(noTransformOptions == null)
	//*   0    0:getstatic       #254 <Field RequestOptions noTransformOptions>
	//*   1    3:ifnonnull       22
			noTransformOptions = (new RequestOptions()).dontTransform().autoClone();
	//    2    6:new             #2   <Class RequestOptions>
	//    3    9:dup             
	//    4   10:invokespecial   #153 <Method void RequestOptions()>
	//    5   13:invokevirtual   #257 <Method RequestOptions dontTransform()>
	//    6   16:invokevirtual   #170 <Method RequestOptions autoClone()>
	//    7   19:putstatic       #254 <Field RequestOptions noTransformOptions>
		return noTransformOptions;
	//    8   22:getstatic       #254 <Field RequestOptions noTransformOptions>
	//    9   25:areturn         
	}

	public static RequestOptions option(Option option1, Object obj)
	{
		return (new RequestOptions()).set(option1, obj);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #262 <Method RequestOptions set(Option, Object)>
	//    6   12:areturn         
	}

	private RequestOptions optionalScaleOnlyTransform(DownsampleStrategy downsamplestrategy, Transformation transformation)
	{
		return scaleOnlyTransform(downsamplestrategy, transformation, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #269 <Method RequestOptions scaleOnlyTransform(DownsampleStrategy, Transformation, boolean)>
	//    5    7:areturn         
	}

	public static RequestOptions overrideOf(int i)
	{
		return overrideOf(i, i);
	//    0    0:iload_0         
	//    1    1:iload_0         
	//    2    2:invokestatic    #274 <Method RequestOptions overrideOf(int, int)>
	//    3    5:areturn         
	}

	public static RequestOptions overrideOf(int i, int j)
	{
		return (new RequestOptions()).override(i, j);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:iload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #277 <Method RequestOptions override(int, int)>
	//    6   12:areturn         
	}

	public static RequestOptions placeholderOf(int i)
	{
		return (new RequestOptions()).placeholder(i);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:iload_0         
	//    4    8:invokevirtual   #281 <Method RequestOptions placeholder(int)>
	//    5   11:areturn         
	}

	public static RequestOptions placeholderOf(Drawable drawable)
	{
		return (new RequestOptions()).placeholder(drawable);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #283 <Method RequestOptions placeholder(Drawable)>
	//    5   11:areturn         
	}

	public static RequestOptions priorityOf(Priority priority1)
	{
		return (new RequestOptions()).priority(priority1);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #287 <Method RequestOptions priority(Priority)>
	//    5   11:areturn         
	}

	private RequestOptions scaleOnlyTransform(DownsampleStrategy downsamplestrategy, Transformation transformation)
	{
		return scaleOnlyTransform(downsamplestrategy, transformation, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #269 <Method RequestOptions scaleOnlyTransform(DownsampleStrategy, Transformation, boolean)>
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
	//    5    7:invokevirtual   #289 <Method RequestOptions transform(DownsampleStrategy, Transformation)>
	//    6   10:astore_1        
		else
	//*   7   11:goto            21
			downsamplestrategy = ((DownsampleStrategy) (optionalTransform(downsamplestrategy, transformation)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #292 <Method RequestOptions optionalTransform(DownsampleStrategy, Transformation)>
	//   12   20:astore_1        
		downsamplestrategy.isScaleOnlyOrNoTransform = true;
	//   13   21:aload_1         
	//   14   22:iconst_1        
	//   15   23:putfield        #148 <Field boolean isScaleOnlyOrNoTransform>
		return ((RequestOptions) (downsamplestrategy));
	//   16   26:aload_1         
	//   17   27:areturn         
	}

	private RequestOptions selfOrThrowIfLocked()
	{
		if(!isLocked)
	//*   0    0:aload_0         
	//*   1    1:getfield        #296 <Field boolean isLocked>
	//*   2    4:ifne            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
	//    5    9:new             #298 <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc2            #300 <String "You cannot modify locked RequestOptions, consider clone()">
	//    8   16:invokespecial   #303 <Method void IllegalStateException(String)>
	//    9   19:athrow          
	}

	public static RequestOptions signatureOf(Key key)
	{
		return (new RequestOptions()).signature(key);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #307 <Method RequestOptions signature(Key)>
	//    5   11:areturn         
	}

	public static RequestOptions sizeMultiplierOf(float f)
	{
		return (new RequestOptions()).sizeMultiplier(f);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:fload_0         
	//    4    8:invokevirtual   #316 <Method RequestOptions sizeMultiplier(float)>
	//    5   11:areturn         
	}

	public static RequestOptions skipMemoryCacheOf(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            31
		{
			if(skipMemoryCacheTrueOptions == null)
	//*   2    4:getstatic       #320 <Field RequestOptions skipMemoryCacheTrueOptions>
	//*   3    7:ifnonnull       27
				skipMemoryCacheTrueOptions = (new RequestOptions()).skipMemoryCache(true).autoClone();
	//    4   10:new             #2   <Class RequestOptions>
	//    5   13:dup             
	//    6   14:invokespecial   #153 <Method void RequestOptions()>
	//    7   17:iconst_1        
	//    8   18:invokevirtual   #323 <Method RequestOptions skipMemoryCache(boolean)>
	//    9   21:invokevirtual   #170 <Method RequestOptions autoClone()>
	//   10   24:putstatic       #320 <Field RequestOptions skipMemoryCacheTrueOptions>
			return skipMemoryCacheTrueOptions;
	//   11   27:getstatic       #320 <Field RequestOptions skipMemoryCacheTrueOptions>
	//   12   30:areturn         
		}
		if(skipMemoryCacheFalseOptions == null)
	//*  13   31:getstatic       #325 <Field RequestOptions skipMemoryCacheFalseOptions>
	//*  14   34:ifnonnull       54
			skipMemoryCacheFalseOptions = (new RequestOptions()).skipMemoryCache(false).autoClone();
	//   15   37:new             #2   <Class RequestOptions>
	//   16   40:dup             
	//   17   41:invokespecial   #153 <Method void RequestOptions()>
	//   18   44:iconst_0        
	//   19   45:invokevirtual   #323 <Method RequestOptions skipMemoryCache(boolean)>
	//   20   48:invokevirtual   #170 <Method RequestOptions autoClone()>
	//   21   51:putstatic       #325 <Field RequestOptions skipMemoryCacheFalseOptions>
		return skipMemoryCacheFalseOptions;
	//   22   54:getstatic       #325 <Field RequestOptions skipMemoryCacheFalseOptions>
	//   23   57:areturn         
	}

	public static RequestOptions timeoutOf(int i)
	{
		return (new RequestOptions()).timeout(i);
	//    0    0:new             #2   <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void RequestOptions()>
	//    3    7:iload_0         
	//    4    8:invokevirtual   #329 <Method RequestOptions timeout(int)>
	//    5   11:areturn         
	}

	private RequestOptions transform(Transformation transformation, boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().transform(transformation, flag);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokespecial   #337 <Method RequestOptions transform(Transformation, boolean)>
	//    8   16:areturn         
		} else
		{
			DrawableTransformation drawabletransformation = new DrawableTransformation(transformation, flag);
	//    9   17:new             #339 <Class DrawableTransformation>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:invokespecial   #342 <Method void DrawableTransformation(Transformation, boolean)>
	//   14   26:astore_3        
			transform(android/graphics/Bitmap, transformation, flag);
	//   15   27:aload_0         
	//   16   28:ldc2            #344 <Class Bitmap>
	//   17   31:aload_1         
	//   18   32:iload_2         
	//   19   33:invokespecial   #347 <Method RequestOptions transform(Class, Transformation, boolean)>
	//   20   36:pop             
			transform(android/graphics/drawable/Drawable, ((Transformation) (drawabletransformation)), flag);
	//   21   37:aload_0         
	//   22   38:ldc2            #349 <Class Drawable>
	//   23   41:aload_3         
	//   24   42:iload_2         
	//   25   43:invokespecial   #347 <Method RequestOptions transform(Class, Transformation, boolean)>
	//   26   46:pop             
			transform(android/graphics/drawable/BitmapDrawable, drawabletransformation.asBitmapDrawable(), flag);
	//   27   47:aload_0         
	//   28   48:ldc2            #351 <Class BitmapDrawable>
	//   29   51:aload_3         
	//   30   52:invokevirtual   #355 <Method Transformation DrawableTransformation.asBitmapDrawable()>
	//   31   55:iload_2         
	//   32   56:invokespecial   #347 <Method RequestOptions transform(Class, Transformation, boolean)>
	//   33   59:pop             
			transform(com/bumptech/glide/load/resource/gif/GifDrawable, ((Transformation) (new GifDrawableTransformation(transformation))), flag);
	//   34   60:aload_0         
	//   35   61:ldc2            #357 <Class GifDrawable>
	//   36   64:new             #359 <Class GifDrawableTransformation>
	//   37   67:dup             
	//   38   68:aload_1         
	//   39   69:invokespecial   #362 <Method void GifDrawableTransformation(Transformation)>
	//   40   72:iload_2         
	//   41   73:invokespecial   #347 <Method RequestOptions transform(Class, Transformation, boolean)>
	//   42   76:pop             
			return selfOrThrowIfLocked();
	//   43   77:aload_0         
	//   44   78:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   45   81:areturn         
		}
	}

	private RequestOptions transform(Class class1, Transformation transformation, boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            18
			return clone().transform(class1, transformation, flag);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:iload_3         
	//    8   14:invokespecial   #347 <Method RequestOptions transform(Class, Transformation, boolean)>
	//    9   17:areturn         
		Preconditions.checkNotNull(((Object) (class1)));
	//   10   18:aload_1         
	//   11   19:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object)>
	//   12   22:pop             
		Preconditions.checkNotNull(((Object) (transformation)));
	//   13   23:aload_2         
	//   14   24:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object)>
	//   15   27:pop             
		transformations.put(((Object) (class1)), ((Object) (transformation)));
	//   16   28:aload_0         
	//   17   29:getfield        #144 <Field Map transformations>
	//   18   32:aload_1         
	//   19   33:aload_2         
	//   20   34:invokeinterface #377 <Method Object Map.put(Object, Object)>
	//   21   39:pop             
		fields = fields | 0x800;
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #242 <Field int fields>
	//   25   45:sipush          2048
	//   26   48:ior             
	//   27   49:putfield        #242 <Field int fields>
		isTransformationAllowed = true;
	//   28   52:aload_0         
	//   29   53:iconst_1        
	//   30   54:putfield        #134 <Field boolean isTransformationAllowed>
		fields = fields | 0x10000;
	//   31   57:aload_0         
	//   32   58:aload_0         
	//   33   59:getfield        #242 <Field int fields>
	//   34   62:ldc1            #41  <Int 0x10000>
	//   35   64:ior             
	//   36   65:putfield        #242 <Field int fields>
		isScaleOnlyOrNoTransform = false;
	//   37   68:aload_0         
	//   38   69:iconst_0        
	//   39   70:putfield        #148 <Field boolean isScaleOnlyOrNoTransform>
		if(flag)
	//*  40   73:iload_3         
	//*  41   74:ifeq            93
		{
			fields = fields | 0x20000;
	//   42   77:aload_0         
	//   43   78:aload_0         
	//   44   79:getfield        #242 <Field int fields>
	//   45   82:ldc1            #43  <Int 0x20000>
	//   46   84:ior             
	//   47   85:putfield        #242 <Field int fields>
			isTransformationRequired = true;
	//   48   88:aload_0         
	//   49   89:iconst_1        
	//   50   90:putfield        #379 <Field boolean isTransformationRequired>
		}
		return selfOrThrowIfLocked();
	//   51   93:aload_0         
	//   52   94:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   53   97:areturn         
	}

	public RequestOptions apply(RequestOptions requestoptions)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
			return clone().apply(requestoptions);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #384 <Method RequestOptions apply(RequestOptions)>
	//    7   15:areturn         
		if(isSet(requestoptions.fields, 2))
	//*   8   16:aload_1         
	//*   9   17:getfield        #242 <Field int fields>
	//*  10   20:iconst_2        
	//*  11   21:invokestatic    #245 <Method boolean isSet(int, int)>
	//*  12   24:ifeq            35
			sizeMultiplier = requestoptions.sizeMultiplier;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:getfield        #104 <Field float sizeMultiplier>
	//   16   32:putfield        #104 <Field float sizeMultiplier>
		if(isSet(requestoptions.fields, 0x40000))
	//*  17   35:aload_1         
	//*  18   36:getfield        #242 <Field int fields>
	//*  19   39:ldc1            #49  <Int 0x40000>
	//*  20   41:invokestatic    #245 <Method boolean isSet(int, int)>
	//*  21   44:ifeq            55
			useUnlimitedSourceGeneratorsPool = requestoptions.useUnlimitedSourceGeneratorsPool;
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:getfield        #386 <Field boolean useUnlimitedSourceGeneratorsPool>
	//   25   52:putfield        #386 <Field boolean useUnlimitedSourceGeneratorsPool>
		if(isSet(requestoptions.fields, 0x100000))
	//*  26   55:aload_1         
	//*  27   56:getfield        #242 <Field int fields>
	//*  28   59:ldc1            #47  <Int 0x100000>
	//*  29   61:invokestatic    #245 <Method boolean isSet(int, int)>
	//*  30   64:ifeq            75
			useAnimationPool = requestoptions.useAnimationPool;
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:getfield        #388 <Field boolean useAnimationPool>
	//   34   72:putfield        #388 <Field boolean useAnimationPool>
		if(isSet(requestoptions.fields, 4))
	//*  35   75:aload_1         
	//*  36   76:getfield        #242 <Field int fields>
	//*  37   79:iconst_4        
	//*  38   80:invokestatic    #245 <Method boolean isSet(int, int)>
	//*  39   83:ifeq            94
			diskCacheStrategy = requestoptions.diskCacheStrategy;
	//   40   86:aload_0         
	//   41   87:aload_1         
	//   42   88:getfield        #111 <Field DiskCacheStrategy diskCacheStrategy>
	//   43   91:putfield        #111 <Field DiskCacheStrategy diskCacheStrategy>
		if(isSet(requestoptions.fields, 8))
	//*  44   94:aload_1         
	//*  45   95:getfield        #242 <Field int fields>
	//*  46   98:bipush          8
	//*  47  100:invokestatic    #245 <Method boolean isSet(int, int)>
	//*  48  103:ifeq            114
			priority = requestoptions.priority;
	//   49  106:aload_0         
	//   50  107:aload_1         
	//   51  108:getfield        #118 <Field Priority priority>
	//   52  111:putfield        #118 <Field Priority priority>
		if(isSet(requestoptions.fields, 16))
	//*  53  114:aload_1         
	//*  54  115:getfield        #242 <Field int fields>
	//*  55  118:bipush          16
	//*  56  120:invokestatic    #245 <Method boolean isSet(int, int)>
	//*  57  123:ifeq            150
		{
			errorPlaceholder = requestoptions.errorPlaceholder;
	//   58  126:aload_0         
	//   59  127:aload_1         
	//   60  128:getfield        #390 <Field Drawable errorPlaceholder>
	//   61  131:putfield        #390 <Field Drawable errorPlaceholder>
			errorId = 0;
	//   62  134:aload_0         
	//   63  135:iconst_0        
	//   64  136:putfield        #392 <Field int errorId>
			fields = fields & 0xffffffdf;
	//   65  139:aload_0         
	//   66  140:aload_0         
	//   67  141:getfield        #242 <Field int fields>
	//   68  144:bipush          -33
	//   69  146:iand            
	//   70  147:putfield        #242 <Field int fields>
		}
		if(isSet(requestoptions.fields, 32))
	//*  71  150:aload_1         
	//*  72  151:getfield        #242 <Field int fields>
	//*  73  154:bipush          32
	//*  74  156:invokestatic    #245 <Method boolean isSet(int, int)>
	//*  75  159:ifeq            186
		{
			errorId = requestoptions.errorId;
	//   76  162:aload_0         
	//   77  163:aload_1         
	//   78  164:getfield        #392 <Field int errorId>
	//   79  167:putfield        #392 <Field int errorId>
			errorPlaceholder = null;
	//   80  170:aload_0         
	//   81  171:aconst_null     
	//   82  172:putfield        #390 <Field Drawable errorPlaceholder>
			fields = fields & 0xffffffef;
	//   83  175:aload_0         
	//   84  176:aload_0         
	//   85  177:getfield        #242 <Field int fields>
	//   86  180:bipush          -17
	//   87  182:iand            
	//   88  183:putfield        #242 <Field int fields>
		}
		if(isSet(requestoptions.fields, 64))
	//*  89  186:aload_1         
	//*  90  187:getfield        #242 <Field int fields>
	//*  91  190:bipush          64
	//*  92  192:invokestatic    #245 <Method boolean isSet(int, int)>
	//*  93  195:ifeq            223
		{
			placeholderDrawable = requestoptions.placeholderDrawable;
	//   94  198:aload_0         
	//   95  199:aload_1         
	//   96  200:getfield        #394 <Field Drawable placeholderDrawable>
	//   97  203:putfield        #394 <Field Drawable placeholderDrawable>
			placeholderId = 0;
	//   98  206:aload_0         
	//   99  207:iconst_0        
	//  100  208:putfield        #396 <Field int placeholderId>
			fields = fields & 0xffffff7f;
	//  101  211:aload_0         
	//  102  212:aload_0         
	//  103  213:getfield        #242 <Field int fields>
	//  104  216:sipush          -129
	//  105  219:iand            
	//  106  220:putfield        #242 <Field int fields>
		}
		if(isSet(requestoptions.fields, 128))
	//* 107  223:aload_1         
	//* 108  224:getfield        #242 <Field int fields>
	//* 109  227:sipush          128
	//* 110  230:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 111  233:ifeq            260
		{
			placeholderId = requestoptions.placeholderId;
	//  112  236:aload_0         
	//  113  237:aload_1         
	//  114  238:getfield        #396 <Field int placeholderId>
	//  115  241:putfield        #396 <Field int placeholderId>
			placeholderDrawable = null;
	//  116  244:aload_0         
	//  117  245:aconst_null     
	//  118  246:putfield        #394 <Field Drawable placeholderDrawable>
			fields = fields & 0xffffffbf;
	//  119  249:aload_0         
	//  120  250:aload_0         
	//  121  251:getfield        #242 <Field int fields>
	//  122  254:bipush          -65
	//  123  256:iand            
	//  124  257:putfield        #242 <Field int fields>
		}
		if(isSet(requestoptions.fields, 256))
	//* 125  260:aload_1         
	//* 126  261:getfield        #242 <Field int fields>
	//* 127  264:sipush          256
	//* 128  267:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 129  270:ifeq            281
			isCacheable = requestoptions.isCacheable;
	//  130  273:aload_0         
	//  131  274:aload_1         
	//  132  275:getfield        #120 <Field boolean isCacheable>
	//  133  278:putfield        #120 <Field boolean isCacheable>
		if(isSet(requestoptions.fields, 512))
	//* 134  281:aload_1         
	//* 135  282:getfield        #242 <Field int fields>
	//* 136  285:sipush          512
	//* 137  288:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 138  291:ifeq            310
		{
			overrideWidth = requestoptions.overrideWidth;
	//  139  294:aload_0         
	//  140  295:aload_1         
	//  141  296:getfield        #124 <Field int overrideWidth>
	//  142  299:putfield        #124 <Field int overrideWidth>
			overrideHeight = requestoptions.overrideHeight;
	//  143  302:aload_0         
	//  144  303:aload_1         
	//  145  304:getfield        #122 <Field int overrideHeight>
	//  146  307:putfield        #122 <Field int overrideHeight>
		}
		if(isSet(requestoptions.fields, 1024))
	//* 147  310:aload_1         
	//* 148  311:getfield        #242 <Field int fields>
	//* 149  314:sipush          1024
	//* 150  317:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 151  320:ifeq            331
			signature = requestoptions.signature;
	//  152  323:aload_0         
	//  153  324:aload_1         
	//  154  325:getfield        #132 <Field Key signature>
	//  155  328:putfield        #132 <Field Key signature>
		if(isSet(requestoptions.fields, 4096))
	//* 156  331:aload_1         
	//* 157  332:getfield        #242 <Field int fields>
	//* 158  335:sipush          4096
	//* 159  338:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 160  341:ifeq            352
			resourceClass = requestoptions.resourceClass;
	//  161  344:aload_0         
	//  162  345:aload_1         
	//  163  346:getfield        #146 <Field Class resourceClass>
	//  164  349:putfield        #146 <Field Class resourceClass>
		if(isSet(requestoptions.fields, 8192))
	//* 165  352:aload_1         
	//* 166  353:getfield        #242 <Field int fields>
	//* 167  356:sipush          8192
	//* 168  359:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 169  362:ifeq            390
		{
			fallbackDrawable = requestoptions.fallbackDrawable;
	//  170  365:aload_0         
	//  171  366:aload_1         
	//  172  367:getfield        #398 <Field Drawable fallbackDrawable>
	//  173  370:putfield        #398 <Field Drawable fallbackDrawable>
			fallbackId = 0;
	//  174  373:aload_0         
	//  175  374:iconst_0        
	//  176  375:putfield        #400 <Field int fallbackId>
			fields = fields & 0xffffbfff;
	//  177  378:aload_0         
	//  178  379:aload_0         
	//  179  380:getfield        #242 <Field int fields>
	//  180  383:sipush          -16385
	//  181  386:iand            
	//  182  387:putfield        #242 <Field int fields>
		}
		if(isSet(requestoptions.fields, 16384))
	//* 183  390:aload_1         
	//* 184  391:getfield        #242 <Field int fields>
	//* 185  394:sipush          16384
	//* 186  397:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 187  400:ifeq            428
		{
			fallbackId = requestoptions.fallbackId;
	//  188  403:aload_0         
	//  189  404:aload_1         
	//  190  405:getfield        #400 <Field int fallbackId>
	//  191  408:putfield        #400 <Field int fallbackId>
			fallbackDrawable = null;
	//  192  411:aload_0         
	//  193  412:aconst_null     
	//  194  413:putfield        #398 <Field Drawable fallbackDrawable>
			fields = fields & 0xffffdfff;
	//  195  416:aload_0         
	//  196  417:aload_0         
	//  197  418:getfield        #242 <Field int fields>
	//  198  421:sipush          -8193
	//  199  424:iand            
	//  200  425:putfield        #242 <Field int fields>
		}
		if(isSet(requestoptions.fields, 32768))
	//* 201  428:aload_1         
	//* 202  429:getfield        #242 <Field int fields>
	//* 203  432:ldc1            #37  <Int 32768>
	//* 204  434:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 205  437:ifeq            448
			theme = requestoptions.theme;
	//  206  440:aload_0         
	//  207  441:aload_1         
	//  208  442:getfield        #402 <Field android.content.res.Resources$Theme theme>
	//  209  445:putfield        #402 <Field android.content.res.Resources$Theme theme>
		if(isSet(requestoptions.fields, 0x10000))
	//* 210  448:aload_1         
	//* 211  449:getfield        #242 <Field int fields>
	//* 212  452:ldc1            #41  <Int 0x10000>
	//* 213  454:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 214  457:ifeq            468
			isTransformationAllowed = requestoptions.isTransformationAllowed;
	//  215  460:aload_0         
	//  216  461:aload_1         
	//  217  462:getfield        #134 <Field boolean isTransformationAllowed>
	//  218  465:putfield        #134 <Field boolean isTransformationAllowed>
		if(isSet(requestoptions.fields, 0x20000))
	//* 219  468:aload_1         
	//* 220  469:getfield        #242 <Field int fields>
	//* 221  472:ldc1            #43  <Int 0x20000>
	//* 222  474:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 223  477:ifeq            488
			isTransformationRequired = requestoptions.isTransformationRequired;
	//  224  480:aload_0         
	//  225  481:aload_1         
	//  226  482:getfield        #379 <Field boolean isTransformationRequired>
	//  227  485:putfield        #379 <Field boolean isTransformationRequired>
		if(isSet(requestoptions.fields, 2048))
	//* 228  488:aload_1         
	//* 229  489:getfield        #242 <Field int fields>
	//* 230  492:sipush          2048
	//* 231  495:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 232  498:ifeq            522
		{
			transformations.putAll(requestoptions.transformations);
	//  233  501:aload_0         
	//  234  502:getfield        #144 <Field Map transformations>
	//  235  505:aload_1         
	//  236  506:getfield        #144 <Field Map transformations>
	//  237  509:invokeinterface #406 <Method void Map.putAll(Map)>
			isScaleOnlyOrNoTransform = requestoptions.isScaleOnlyOrNoTransform;
	//  238  514:aload_0         
	//  239  515:aload_1         
	//  240  516:getfield        #148 <Field boolean isScaleOnlyOrNoTransform>
	//  241  519:putfield        #148 <Field boolean isScaleOnlyOrNoTransform>
		}
		if(isSet(requestoptions.fields, 0x80000))
	//* 242  522:aload_1         
	//* 243  523:getfield        #242 <Field int fields>
	//* 244  526:ldc1            #21  <Int 0x80000>
	//* 245  528:invokestatic    #245 <Method boolean isSet(int, int)>
	//* 246  531:ifeq            542
			onlyRetrieveFromCache = requestoptions.onlyRetrieveFromCache;
	//  247  534:aload_0         
	//  248  535:aload_1         
	//  249  536:getfield        #408 <Field boolean onlyRetrieveFromCache>
	//  250  539:putfield        #408 <Field boolean onlyRetrieveFromCache>
		if(!isTransformationAllowed)
	//* 251  542:aload_0         
	//* 252  543:getfield        #134 <Field boolean isTransformationAllowed>
	//* 253  546:ifne            592
		{
			transformations.clear();
	//  254  549:aload_0         
	//  255  550:getfield        #144 <Field Map transformations>
	//  256  553:invokeinterface #411 <Method void Map.clear()>
			fields = fields & 0xfffff7ff;
	//  257  558:aload_0         
	//  258  559:aload_0         
	//  259  560:getfield        #242 <Field int fields>
	//  260  563:sipush          -2049
	//  261  566:iand            
	//  262  567:putfield        #242 <Field int fields>
			isTransformationRequired = false;
	//  263  570:aload_0         
	//  264  571:iconst_0        
	//  265  572:putfield        #379 <Field boolean isTransformationRequired>
			fields = fields & 0xfffdffff;
	//  266  575:aload_0         
	//  267  576:aload_0         
	//  268  577:getfield        #242 <Field int fields>
	//  269  580:ldc2            #412 <Int 0xfffdffff>
	//  270  583:iand            
	//  271  584:putfield        #242 <Field int fields>
			isScaleOnlyOrNoTransform = true;
	//  272  587:aload_0         
	//  273  588:iconst_1        
	//  274  589:putfield        #148 <Field boolean isScaleOnlyOrNoTransform>
		}
		fields = fields | requestoptions.fields;
	//  275  592:aload_0         
	//  276  593:aload_0         
	//  277  594:getfield        #242 <Field int fields>
	//  278  597:aload_1         
	//  279  598:getfield        #242 <Field int fields>
	//  280  601:ior             
	//  281  602:putfield        #242 <Field int fields>
		options.putAll(requestoptions.options);
	//  282  605:aload_0         
	//  283  606:getfield        #139 <Field Options options>
	//  284  609:aload_1         
	//  285  610:getfield        #139 <Field Options options>
	//  286  613:invokevirtual   #415 <Method void Options.putAll(Options)>
		return selfOrThrowIfLocked();
	//  287  616:aload_0         
	//  288  617:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//  289  620:areturn         
	}

	public RequestOptions autoClone()
	{
		if(isLocked && !isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #296 <Field boolean isLocked>
	//*   2    4:ifeq            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   5   11:ifeq            17
	//*   6   14:goto            28
		{
			throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
	//    7   17:new             #298 <Class IllegalStateException>
	//    8   20:dup             
	//    9   21:ldc2            #417 <String "You cannot auto lock an already locked options object, try clone() first">
	//   10   24:invokespecial   #303 <Method void IllegalStateException(String)>
	//   11   27:athrow          
		} else
		{
			isAutoCloneEnabled = true;
	//   12   28:aload_0         
	//   13   29:iconst_1        
	//   14   30:putfield        #332 <Field boolean isAutoCloneEnabled>
			return lock();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #420 <Method RequestOptions lock()>
	//   17   37:areturn         
		}
	}

	public RequestOptions centerCrop()
	{
		return transform(DownsampleStrategy.CENTER_OUTSIDE, ((Transformation) (new CenterCrop())));
	//    0    0:aload_0         
	//    1    1:getstatic       #426 <Field DownsampleStrategy DownsampleStrategy.CENTER_OUTSIDE>
	//    2    4:new             #428 <Class CenterCrop>
	//    3    7:dup             
	//    4    8:invokespecial   #429 <Method void CenterCrop()>
	//    5   11:invokevirtual   #289 <Method RequestOptions transform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions centerInside()
	{
		return scaleOnlyTransform(DownsampleStrategy.CENTER_INSIDE, ((Transformation) (new CenterInside())));
	//    0    0:aload_0         
	//    1    1:getstatic       #432 <Field DownsampleStrategy DownsampleStrategy.CENTER_INSIDE>
	//    2    4:new             #434 <Class CenterInside>
	//    3    7:dup             
	//    4    8:invokespecial   #435 <Method void CenterInside()>
	//    5   11:invokespecial   #437 <Method RequestOptions scaleOnlyTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions circleCrop()
	{
		return transform(DownsampleStrategy.CENTER_INSIDE, ((Transformation) (new CircleCrop())));
	//    0    0:aload_0         
	//    1    1:getstatic       #432 <Field DownsampleStrategy DownsampleStrategy.CENTER_INSIDE>
	//    2    4:new             #439 <Class CircleCrop>
	//    3    7:dup             
	//    4    8:invokespecial   #440 <Method void CircleCrop()>
	//    5   11:invokevirtual   #289 <Method RequestOptions transform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions clone()
	{
		RequestOptions requestoptions;
		try
		{
			requestoptions = (RequestOptions)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #445 <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class RequestOptions>
	//    3    7:astore_1        
			requestoptions.options = new Options();
	//    4    8:aload_1         
	//    5    9:new             #136 <Class Options>
	//    6   12:dup             
	//    7   13:invokespecial   #137 <Method void Options()>
	//    8   16:putfield        #139 <Field Options options>
			requestoptions.options.putAll(options);
	//    9   19:aload_1         
	//   10   20:getfield        #139 <Field Options options>
	//   11   23:aload_0         
	//   12   24:getfield        #139 <Field Options options>
	//   13   27:invokevirtual   #415 <Method void Options.putAll(Options)>
			requestoptions.transformations = ((Map) (new CachedHashCodeArrayMap()));
	//   14   30:aload_1         
	//   15   31:new             #141 <Class CachedHashCodeArrayMap>
	//   16   34:dup             
	//   17   35:invokespecial   #142 <Method void CachedHashCodeArrayMap()>
	//   18   38:putfield        #144 <Field Map transformations>
			requestoptions.transformations.putAll(transformations);
	//   19   41:aload_1         
	//   20   42:getfield        #144 <Field Map transformations>
	//   21   45:aload_0         
	//   22   46:getfield        #144 <Field Map transformations>
	//   23   49:invokeinterface #406 <Method void Map.putAll(Map)>
			requestoptions.isLocked = false;
	//   24   54:aload_1         
	//   25   55:iconst_0        
	//   26   56:putfield        #296 <Field boolean isLocked>
			requestoptions.isAutoCloneEnabled = false;
	//   27   59:aload_1         
	//   28   60:iconst_0        
	//   29   61:putfield        #332 <Field boolean isAutoCloneEnabled>
		}
	//*  30   64:aload_1         
	//*  31   65:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  32   66:astore_1        
		{
			throw new RuntimeException(((Throwable) (clonenotsupportedexception)));
	//   33   67:new             #447 <Class RuntimeException>
	//   34   70:dup             
	//   35   71:aload_1         
	//   36   72:invokespecial   #450 <Method void RuntimeException(Throwable)>
	//   37   75:athrow          
		}
		return requestoptions;
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #335 <Method RequestOptions clone()>
	//    2    4:areturn         
	}

	public RequestOptions decode(Class class1)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().decode(class1);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #187 <Method RequestOptions decode(Class)>
	//    7   15:areturn         
		} else
		{
			resourceClass = (Class)Preconditions.checkNotNull(((Object) (class1)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #453 <Class Class>
	//   12   24:putfield        #146 <Field Class resourceClass>
			fields = fields | 0x1000;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #242 <Field int fields>
	//   16   32:sipush          4096
	//   17   35:ior             
	//   18   36:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   39:aload_0         
	//   20   40:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   21   43:areturn         
		}
	}

	public RequestOptions disallowHardwareConfig()
	{
		return set(Downsampler.ALLOW_HARDWARE_CONFIG, ((Object) (Boolean.valueOf(false))));
	//    0    0:aload_0         
	//    1    1:getstatic       #460 <Field Option Downsampler.ALLOW_HARDWARE_CONFIG>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #466 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokevirtual   #262 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public RequestOptions diskCacheStrategy(DiskCacheStrategy diskcachestrategy)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().diskCacheStrategy(diskcachestrategy);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #192 <Method RequestOptions diskCacheStrategy(DiskCacheStrategy)>
	//    7   15:areturn         
		} else
		{
			diskCacheStrategy = (DiskCacheStrategy)Preconditions.checkNotNull(((Object) (diskcachestrategy)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #106 <Class DiskCacheStrategy>
	//   12   24:putfield        #111 <Field DiskCacheStrategy diskCacheStrategy>
			fields = fields | 4;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #242 <Field int fields>
	//   16   32:iconst_4        
	//   17   33:ior             
	//   18   34:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   37:aload_0         
	//   20   38:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   21   41:areturn         
		}
	}

	public RequestOptions dontAnimate()
	{
		return set(GifOptions.DISABLE_ANIMATION, ((Object) (Boolean.valueOf(true))));
	//    0    0:aload_0         
	//    1    1:getstatic       #471 <Field Option GifOptions.DISABLE_ANIMATION>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #466 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokevirtual   #262 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public RequestOptions dontTransform()
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            15
		{
			return clone().dontTransform();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:invokevirtual   #257 <Method RequestOptions dontTransform()>
	//    6   14:areturn         
		} else
		{
			transformations.clear();
	//    7   15:aload_0         
	//    8   16:getfield        #144 <Field Map transformations>
	//    9   19:invokeinterface #411 <Method void Map.clear()>
			fields = fields & 0xfffff7ff;
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #242 <Field int fields>
	//   13   29:sipush          -2049
	//   14   32:iand            
	//   15   33:putfield        #242 <Field int fields>
			isTransformationRequired = false;
	//   16   36:aload_0         
	//   17   37:iconst_0        
	//   18   38:putfield        #379 <Field boolean isTransformationRequired>
			fields = fields & 0xfffdffff;
	//   19   41:aload_0         
	//   20   42:aload_0         
	//   21   43:getfield        #242 <Field int fields>
	//   22   46:ldc2            #412 <Int 0xfffdffff>
	//   23   49:iand            
	//   24   50:putfield        #242 <Field int fields>
			isTransformationAllowed = false;
	//   25   53:aload_0         
	//   26   54:iconst_0        
	//   27   55:putfield        #134 <Field boolean isTransformationAllowed>
			fields = fields | 0x10000;
	//   28   58:aload_0         
	//   29   59:aload_0         
	//   30   60:getfield        #242 <Field int fields>
	//   31   63:ldc1            #41  <Int 0x10000>
	//   32   65:ior             
	//   33   66:putfield        #242 <Field int fields>
			isScaleOnlyOrNoTransform = true;
	//   34   69:aload_0         
	//   35   70:iconst_1        
	//   36   71:putfield        #148 <Field boolean isScaleOnlyOrNoTransform>
			return selfOrThrowIfLocked();
	//   37   74:aload_0         
	//   38   75:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   39   78:areturn         
		}
	}

	public RequestOptions downsample(DownsampleStrategy downsamplestrategy)
	{
		return set(DownsampleStrategy.OPTION, Preconditions.checkNotNull(((Object) (downsamplestrategy))));
	//    0    0:aload_0         
	//    1    1:getstatic       #474 <Field Option DownsampleStrategy.OPTION>
	//    2    4:aload_1         
	//    3    5:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:invokevirtual   #262 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public RequestOptions encodeFormat(android.graphics.Bitmap.CompressFormat compressformat)
	{
		return set(BitmapEncoder.COMPRESSION_FORMAT, Preconditions.checkNotNull(((Object) (compressformat))));
	//    0    0:aload_0         
	//    1    1:getstatic       #479 <Field Option BitmapEncoder.COMPRESSION_FORMAT>
	//    2    4:aload_1         
	//    3    5:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:invokevirtual   #262 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public RequestOptions encodeQuality(int i)
	{
		return set(BitmapEncoder.COMPRESSION_QUALITY, ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #482 <Field Option BitmapEncoder.COMPRESSION_QUALITY>
	//    2    4:iload_1         
	//    3    5:invokestatic    #487 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #262 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof RequestOptions;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class RequestOptions>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            325
		{
			obj = ((Object) ((RequestOptions)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class RequestOptions>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(Float.compare(((RequestOptions) (obj)).sizeMultiplier, sizeMultiplier) == 0)
	//*  12   18:aload_1         
	//*  13   19:getfield        #104 <Field float sizeMultiplier>
	//*  14   22:aload_0         
	//*  15   23:getfield        #104 <Field float sizeMultiplier>
	//*  16   26:invokestatic    #495 <Method int Float.compare(float, float)>
	//*  17   29:ifne            323
			{
				flag1 = flag2;
	//   18   32:iload_3         
	//   19   33:istore_2        
				if(errorId == ((RequestOptions) (obj)).errorId)
	//*  20   34:aload_0         
	//*  21   35:getfield        #392 <Field int errorId>
	//*  22   38:aload_1         
	//*  23   39:getfield        #392 <Field int errorId>
	//*  24   42:icmpne          323
				{
					flag1 = flag2;
	//   25   45:iload_3         
	//   26   46:istore_2        
					if(Util.bothNullOrEqual(((Object) (errorPlaceholder)), ((Object) (((RequestOptions) (obj)).errorPlaceholder))))
	//*  27   47:aload_0         
	//*  28   48:getfield        #390 <Field Drawable errorPlaceholder>
	//*  29   51:aload_1         
	//*  30   52:getfield        #390 <Field Drawable errorPlaceholder>
	//*  31   55:invokestatic    #501 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//*  32   58:ifeq            323
					{
						flag1 = flag2;
	//   33   61:iload_3         
	//   34   62:istore_2        
						if(placeholderId == ((RequestOptions) (obj)).placeholderId)
	//*  35   63:aload_0         
	//*  36   64:getfield        #396 <Field int placeholderId>
	//*  37   67:aload_1         
	//*  38   68:getfield        #396 <Field int placeholderId>
	//*  39   71:icmpne          323
						{
							flag1 = flag2;
	//   40   74:iload_3         
	//   41   75:istore_2        
							if(Util.bothNullOrEqual(((Object) (placeholderDrawable)), ((Object) (((RequestOptions) (obj)).placeholderDrawable))))
	//*  42   76:aload_0         
	//*  43   77:getfield        #394 <Field Drawable placeholderDrawable>
	//*  44   80:aload_1         
	//*  45   81:getfield        #394 <Field Drawable placeholderDrawable>
	//*  46   84:invokestatic    #501 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//*  47   87:ifeq            323
							{
								flag1 = flag2;
	//   48   90:iload_3         
	//   49   91:istore_2        
								if(fallbackId == ((RequestOptions) (obj)).fallbackId)
	//*  50   92:aload_0         
	//*  51   93:getfield        #400 <Field int fallbackId>
	//*  52   96:aload_1         
	//*  53   97:getfield        #400 <Field int fallbackId>
	//*  54  100:icmpne          323
								{
									flag1 = flag2;
	//   55  103:iload_3         
	//   56  104:istore_2        
									if(Util.bothNullOrEqual(((Object) (fallbackDrawable)), ((Object) (((RequestOptions) (obj)).fallbackDrawable))))
	//*  57  105:aload_0         
	//*  58  106:getfield        #398 <Field Drawable fallbackDrawable>
	//*  59  109:aload_1         
	//*  60  110:getfield        #398 <Field Drawable fallbackDrawable>
	//*  61  113:invokestatic    #501 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//*  62  116:ifeq            323
									{
										flag1 = flag2;
	//   63  119:iload_3         
	//   64  120:istore_2        
										if(isCacheable == ((RequestOptions) (obj)).isCacheable)
	//*  65  121:aload_0         
	//*  66  122:getfield        #120 <Field boolean isCacheable>
	//*  67  125:aload_1         
	//*  68  126:getfield        #120 <Field boolean isCacheable>
	//*  69  129:icmpne          323
										{
											flag1 = flag2;
	//   70  132:iload_3         
	//   71  133:istore_2        
											if(overrideHeight == ((RequestOptions) (obj)).overrideHeight)
	//*  72  134:aload_0         
	//*  73  135:getfield        #122 <Field int overrideHeight>
	//*  74  138:aload_1         
	//*  75  139:getfield        #122 <Field int overrideHeight>
	//*  76  142:icmpne          323
											{
												flag1 = flag2;
	//   77  145:iload_3         
	//   78  146:istore_2        
												if(overrideWidth == ((RequestOptions) (obj)).overrideWidth)
	//*  79  147:aload_0         
	//*  80  148:getfield        #124 <Field int overrideWidth>
	//*  81  151:aload_1         
	//*  82  152:getfield        #124 <Field int overrideWidth>
	//*  83  155:icmpne          323
												{
													flag1 = flag2;
	//   84  158:iload_3         
	//   85  159:istore_2        
													if(isTransformationRequired == ((RequestOptions) (obj)).isTransformationRequired)
	//*  86  160:aload_0         
	//*  87  161:getfield        #379 <Field boolean isTransformationRequired>
	//*  88  164:aload_1         
	//*  89  165:getfield        #379 <Field boolean isTransformationRequired>
	//*  90  168:icmpne          323
													{
														flag1 = flag2;
	//   91  171:iload_3         
	//   92  172:istore_2        
														if(isTransformationAllowed == ((RequestOptions) (obj)).isTransformationAllowed)
	//*  93  173:aload_0         
	//*  94  174:getfield        #134 <Field boolean isTransformationAllowed>
	//*  95  177:aload_1         
	//*  96  178:getfield        #134 <Field boolean isTransformationAllowed>
	//*  97  181:icmpne          323
														{
															flag1 = flag2;
	//   98  184:iload_3         
	//   99  185:istore_2        
															if(useUnlimitedSourceGeneratorsPool == ((RequestOptions) (obj)).useUnlimitedSourceGeneratorsPool)
	//* 100  186:aload_0         
	//* 101  187:getfield        #386 <Field boolean useUnlimitedSourceGeneratorsPool>
	//* 102  190:aload_1         
	//* 103  191:getfield        #386 <Field boolean useUnlimitedSourceGeneratorsPool>
	//* 104  194:icmpne          323
															{
																flag1 = flag2;
	//  105  197:iload_3         
	//  106  198:istore_2        
																if(onlyRetrieveFromCache == ((RequestOptions) (obj)).onlyRetrieveFromCache)
	//* 107  199:aload_0         
	//* 108  200:getfield        #408 <Field boolean onlyRetrieveFromCache>
	//* 109  203:aload_1         
	//* 110  204:getfield        #408 <Field boolean onlyRetrieveFromCache>
	//* 111  207:icmpne          323
																{
																	flag1 = flag2;
	//  112  210:iload_3         
	//  113  211:istore_2        
																	if(((Object) (diskCacheStrategy)).equals(((Object) (((RequestOptions) (obj)).diskCacheStrategy))))
	//* 114  212:aload_0         
	//* 115  213:getfield        #111 <Field DiskCacheStrategy diskCacheStrategy>
	//* 116  216:aload_1         
	//* 117  217:getfield        #111 <Field DiskCacheStrategy diskCacheStrategy>
	//* 118  220:invokevirtual   #503 <Method boolean Object.equals(Object)>
	//* 119  223:ifeq            323
																	{
																		flag1 = flag2;
	//  120  226:iload_3         
	//  121  227:istore_2        
																		if(priority == ((RequestOptions) (obj)).priority)
	//* 122  228:aload_0         
	//* 123  229:getfield        #118 <Field Priority priority>
	//* 124  232:aload_1         
	//* 125  233:getfield        #118 <Field Priority priority>
	//* 126  236:if_acmpne       323
																		{
																			flag1 = flag2;
	//  127  239:iload_3         
	//  128  240:istore_2        
																			if(options.equals(((Object) (((RequestOptions) (obj)).options))))
	//* 129  241:aload_0         
	//* 130  242:getfield        #139 <Field Options options>
	//* 131  245:aload_1         
	//* 132  246:getfield        #139 <Field Options options>
	//* 133  249:invokevirtual   #504 <Method boolean Options.equals(Object)>
	//* 134  252:ifeq            323
																			{
																				flag1 = flag2;
	//  135  255:iload_3         
	//  136  256:istore_2        
																				if(transformations.equals(((Object) (((RequestOptions) (obj)).transformations))))
	//* 137  257:aload_0         
	//* 138  258:getfield        #144 <Field Map transformations>
	//* 139  261:aload_1         
	//* 140  262:getfield        #144 <Field Map transformations>
	//* 141  265:invokeinterface #505 <Method boolean Map.equals(Object)>
	//* 142  270:ifeq            323
																				{
																					flag1 = flag2;
	//  143  273:iload_3         
	//  144  274:istore_2        
																					if(((Object) (resourceClass)).equals(((Object) (((RequestOptions) (obj)).resourceClass))))
	//* 145  275:aload_0         
	//* 146  276:getfield        #146 <Field Class resourceClass>
	//* 147  279:aload_1         
	//* 148  280:getfield        #146 <Field Class resourceClass>
	//* 149  283:invokevirtual   #503 <Method boolean Object.equals(Object)>
	//* 150  286:ifeq            323
																					{
																						flag1 = flag2;
	//  151  289:iload_3         
	//  152  290:istore_2        
																						if(Util.bothNullOrEqual(((Object) (signature)), ((Object) (((RequestOptions) (obj)).signature))))
	//* 153  291:aload_0         
	//* 154  292:getfield        #132 <Field Key signature>
	//* 155  295:aload_1         
	//* 156  296:getfield        #132 <Field Key signature>
	//* 157  299:invokestatic    #501 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//* 158  302:ifeq            323
																						{
																							flag1 = flag2;
	//  159  305:iload_3         
	//  160  306:istore_2        
																							if(Util.bothNullOrEqual(((Object) (theme)), ((Object) (((RequestOptions) (obj)).theme))))
	//* 161  307:aload_0         
	//* 162  308:getfield        #402 <Field android.content.res.Resources$Theme theme>
	//* 163  311:aload_1         
	//* 164  312:getfield        #402 <Field android.content.res.Resources$Theme theme>
	//* 165  315:invokestatic    #501 <Method boolean Util.bothNullOrEqual(Object, Object)>
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

	public RequestOptions error(int i)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().error(i);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #219 <Method RequestOptions error(int)>
	//    7   15:areturn         
		} else
		{
			errorId = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #392 <Field int errorId>
			fields = fields | 0x20;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #242 <Field int fields>
	//   14   26:bipush          32
	//   15   28:ior             
	//   16   29:putfield        #242 <Field int fields>
			errorPlaceholder = null;
	//   17   32:aload_0         
	//   18   33:aconst_null     
	//   19   34:putfield        #390 <Field Drawable errorPlaceholder>
			fields = fields & 0xffffffef;
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #242 <Field int fields>
	//   23   42:bipush          -17
	//   24   44:iand            
	//   25   45:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   26   48:aload_0         
	//   27   49:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   28   52:areturn         
		}
	}

	public RequestOptions error(Drawable drawable)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().error(drawable);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #222 <Method RequestOptions error(Drawable)>
	//    7   15:areturn         
		} else
		{
			errorPlaceholder = drawable;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #390 <Field Drawable errorPlaceholder>
			fields = fields | 0x10;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #242 <Field int fields>
	//   14   26:bipush          16
	//   15   28:ior             
	//   16   29:putfield        #242 <Field int fields>
			errorId = 0;
	//   17   32:aload_0         
	//   18   33:iconst_0        
	//   19   34:putfield        #392 <Field int errorId>
			fields = fields & 0xffffffdf;
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #242 <Field int fields>
	//   23   42:bipush          -33
	//   24   44:iand            
	//   25   45:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   26   48:aload_0         
	//   27   49:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   28   52:areturn         
		}
	}

	public RequestOptions fallback(int i)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().fallback(i);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #508 <Method RequestOptions fallback(int)>
	//    7   15:areturn         
		} else
		{
			fallbackId = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #400 <Field int fallbackId>
			fields = fields | 0x4000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #242 <Field int fields>
	//   14   26:sipush          16384
	//   15   29:ior             
	//   16   30:putfield        #242 <Field int fields>
			fallbackDrawable = null;
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:putfield        #398 <Field Drawable fallbackDrawable>
			fields = fields & 0xffffdfff;
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #242 <Field int fields>
	//   23   43:sipush          -8193
	//   24   46:iand            
	//   25   47:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   26   50:aload_0         
	//   27   51:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   28   54:areturn         
		}
	}

	public RequestOptions fallback(Drawable drawable)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().fallback(drawable);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #510 <Method RequestOptions fallback(Drawable)>
	//    7   15:areturn         
		} else
		{
			fallbackDrawable = drawable;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #398 <Field Drawable fallbackDrawable>
			fields = fields | 0x2000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #242 <Field int fields>
	//   14   26:sipush          8192
	//   15   29:ior             
	//   16   30:putfield        #242 <Field int fields>
			fallbackId = 0;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #400 <Field int fallbackId>
			fields = fields & 0xffffbfff;
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #242 <Field int fields>
	//   23   43:sipush          -16385
	//   24   46:iand            
	//   25   47:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   26   50:aload_0         
	//   27   51:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   28   54:areturn         
		}
	}

	public RequestOptions fitCenter()
	{
		return scaleOnlyTransform(DownsampleStrategy.FIT_CENTER, ((Transformation) (new FitCenter())));
	//    0    0:aload_0         
	//    1    1:getstatic       #513 <Field DownsampleStrategy DownsampleStrategy.FIT_CENTER>
	//    2    4:new             #515 <Class FitCenter>
	//    3    7:dup             
	//    4    8:invokespecial   #516 <Method void FitCenter()>
	//    5   11:invokespecial   #437 <Method RequestOptions scaleOnlyTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions format(DecodeFormat decodeformat)
	{
		Preconditions.checkNotNull(((Object) (decodeformat)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		return set(Downsampler.DECODE_FORMAT, ((Object) (decodeformat))).set(GifOptions.DECODE_FORMAT, ((Object) (decodeformat)));
	//    3    5:aload_0         
	//    4    6:getstatic       #519 <Field Option Downsampler.DECODE_FORMAT>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #262 <Method RequestOptions set(Option, Object)>
	//    7   13:getstatic       #520 <Field Option GifOptions.DECODE_FORMAT>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #262 <Method RequestOptions set(Option, Object)>
	//   10   20:areturn         
	}

	public RequestOptions frame(long l)
	{
		return set(VideoDecoder.TARGET_FRAME, ((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getstatic       #525 <Field Option VideoDecoder.TARGET_FRAME>
	//    2    4:lload_1         
	//    3    5:invokestatic    #530 <Method Long Long.valueOf(long)>
	//    4    8:invokevirtual   #262 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public final DiskCacheStrategy getDiskCacheStrategy()
	{
		return diskCacheStrategy;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field DiskCacheStrategy diskCacheStrategy>
	//    2    4:areturn         
	}

	public final int getErrorId()
	{
		return errorId;
	//    0    0:aload_0         
	//    1    1:getfield        #392 <Field int errorId>
	//    2    4:ireturn         
	}

	public final Drawable getErrorPlaceholder()
	{
		return errorPlaceholder;
	//    0    0:aload_0         
	//    1    1:getfield        #390 <Field Drawable errorPlaceholder>
	//    2    4:areturn         
	}

	public final Drawable getFallbackDrawable()
	{
		return fallbackDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #398 <Field Drawable fallbackDrawable>
	//    2    4:areturn         
	}

	public final int getFallbackId()
	{
		return fallbackId;
	//    0    0:aload_0         
	//    1    1:getfield        #400 <Field int fallbackId>
	//    2    4:ireturn         
	}

	public final boolean getOnlyRetrieveFromCache()
	{
		return onlyRetrieveFromCache;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field boolean onlyRetrieveFromCache>
	//    2    4:ireturn         
	}

	public final Options getOptions()
	{
		return options;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field Options options>
	//    2    4:areturn         
	}

	public final int getOverrideHeight()
	{
		return overrideHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field int overrideHeight>
	//    2    4:ireturn         
	}

	public final int getOverrideWidth()
	{
		return overrideWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int overrideWidth>
	//    2    4:ireturn         
	}

	public final Drawable getPlaceholderDrawable()
	{
		return placeholderDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #394 <Field Drawable placeholderDrawable>
	//    2    4:areturn         
	}

	public final int getPlaceholderId()
	{
		return placeholderId;
	//    0    0:aload_0         
	//    1    1:getfield        #396 <Field int placeholderId>
	//    2    4:ireturn         
	}

	public final Priority getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Priority priority>
	//    2    4:areturn         
	}

	public final Class getResourceClass()
	{
		return resourceClass;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Class resourceClass>
	//    2    4:areturn         
	}

	public final Key getSignature()
	{
		return signature;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field Key signature>
	//    2    4:areturn         
	}

	public final float getSizeMultiplier()
	{
		return sizeMultiplier;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field float sizeMultiplier>
	//    2    4:freturn         
	}

	public final android.content.res.Resources.Theme getTheme()
	{
		return theme;
	//    0    0:aload_0         
	//    1    1:getfield        #402 <Field android.content.res.Resources$Theme theme>
	//    2    4:areturn         
	}

	public final Map getTransformations()
	{
		return transformations;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field Map transformations>
	//    2    4:areturn         
	}

	public final boolean getUseAnimationPool()
	{
		return useAnimationPool;
	//    0    0:aload_0         
	//    1    1:getfield        #388 <Field boolean useAnimationPool>
	//    2    4:ireturn         
	}

	public final boolean getUseUnlimitedSourceGeneratorsPool()
	{
		return useUnlimitedSourceGeneratorsPool;
	//    0    0:aload_0         
	//    1    1:getfield        #386 <Field boolean useUnlimitedSourceGeneratorsPool>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		int i = Util.hashCode(sizeMultiplier);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field float sizeMultiplier>
	//    2    4:invokestatic    #566 <Method int Util.hashCode(float)>
	//    3    7:istore_1        
		i = Util.hashCode(errorId, i);
	//    4    8:aload_0         
	//    5    9:getfield        #392 <Field int errorId>
	//    6   12:iload_1         
	//    7   13:invokestatic    #569 <Method int Util.hashCode(int, int)>
	//    8   16:istore_1        
		i = Util.hashCode(((Object) (errorPlaceholder)), i);
	//    9   17:aload_0         
	//   10   18:getfield        #390 <Field Drawable errorPlaceholder>
	//   11   21:iload_1         
	//   12   22:invokestatic    #572 <Method int Util.hashCode(Object, int)>
	//   13   25:istore_1        
		i = Util.hashCode(placeholderId, i);
	//   14   26:aload_0         
	//   15   27:getfield        #396 <Field int placeholderId>
	//   16   30:iload_1         
	//   17   31:invokestatic    #569 <Method int Util.hashCode(int, int)>
	//   18   34:istore_1        
		i = Util.hashCode(((Object) (placeholderDrawable)), i);
	//   19   35:aload_0         
	//   20   36:getfield        #394 <Field Drawable placeholderDrawable>
	//   21   39:iload_1         
	//   22   40:invokestatic    #572 <Method int Util.hashCode(Object, int)>
	//   23   43:istore_1        
		i = Util.hashCode(fallbackId, i);
	//   24   44:aload_0         
	//   25   45:getfield        #400 <Field int fallbackId>
	//   26   48:iload_1         
	//   27   49:invokestatic    #569 <Method int Util.hashCode(int, int)>
	//   28   52:istore_1        
		i = Util.hashCode(((Object) (fallbackDrawable)), i);
	//   29   53:aload_0         
	//   30   54:getfield        #398 <Field Drawable fallbackDrawable>
	//   31   57:iload_1         
	//   32   58:invokestatic    #572 <Method int Util.hashCode(Object, int)>
	//   33   61:istore_1        
		i = Util.hashCode(isCacheable, i);
	//   34   62:aload_0         
	//   35   63:getfield        #120 <Field boolean isCacheable>
	//   36   66:iload_1         
	//   37   67:invokestatic    #575 <Method int Util.hashCode(boolean, int)>
	//   38   70:istore_1        
		i = Util.hashCode(overrideHeight, i);
	//   39   71:aload_0         
	//   40   72:getfield        #122 <Field int overrideHeight>
	//   41   75:iload_1         
	//   42   76:invokestatic    #569 <Method int Util.hashCode(int, int)>
	//   43   79:istore_1        
		i = Util.hashCode(overrideWidth, i);
	//   44   80:aload_0         
	//   45   81:getfield        #124 <Field int overrideWidth>
	//   46   84:iload_1         
	//   47   85:invokestatic    #569 <Method int Util.hashCode(int, int)>
	//   48   88:istore_1        
		i = Util.hashCode(isTransformationRequired, i);
	//   49   89:aload_0         
	//   50   90:getfield        #379 <Field boolean isTransformationRequired>
	//   51   93:iload_1         
	//   52   94:invokestatic    #575 <Method int Util.hashCode(boolean, int)>
	//   53   97:istore_1        
		i = Util.hashCode(isTransformationAllowed, i);
	//   54   98:aload_0         
	//   55   99:getfield        #134 <Field boolean isTransformationAllowed>
	//   56  102:iload_1         
	//   57  103:invokestatic    #575 <Method int Util.hashCode(boolean, int)>
	//   58  106:istore_1        
		i = Util.hashCode(useUnlimitedSourceGeneratorsPool, i);
	//   59  107:aload_0         
	//   60  108:getfield        #386 <Field boolean useUnlimitedSourceGeneratorsPool>
	//   61  111:iload_1         
	//   62  112:invokestatic    #575 <Method int Util.hashCode(boolean, int)>
	//   63  115:istore_1        
		i = Util.hashCode(onlyRetrieveFromCache, i);
	//   64  116:aload_0         
	//   65  117:getfield        #408 <Field boolean onlyRetrieveFromCache>
	//   66  120:iload_1         
	//   67  121:invokestatic    #575 <Method int Util.hashCode(boolean, int)>
	//   68  124:istore_1        
		i = Util.hashCode(((Object) (diskCacheStrategy)), i);
	//   69  125:aload_0         
	//   70  126:getfield        #111 <Field DiskCacheStrategy diskCacheStrategy>
	//   71  129:iload_1         
	//   72  130:invokestatic    #572 <Method int Util.hashCode(Object, int)>
	//   73  133:istore_1        
		i = Util.hashCode(((Object) (priority)), i);
	//   74  134:aload_0         
	//   75  135:getfield        #118 <Field Priority priority>
	//   76  138:iload_1         
	//   77  139:invokestatic    #572 <Method int Util.hashCode(Object, int)>
	//   78  142:istore_1        
		i = Util.hashCode(((Object) (options)), i);
	//   79  143:aload_0         
	//   80  144:getfield        #139 <Field Options options>
	//   81  147:iload_1         
	//   82  148:invokestatic    #572 <Method int Util.hashCode(Object, int)>
	//   83  151:istore_1        
		i = Util.hashCode(((Object) (transformations)), i);
	//   84  152:aload_0         
	//   85  153:getfield        #144 <Field Map transformations>
	//   86  156:iload_1         
	//   87  157:invokestatic    #572 <Method int Util.hashCode(Object, int)>
	//   88  160:istore_1        
		i = Util.hashCode(((Object) (resourceClass)), i);
	//   89  161:aload_0         
	//   90  162:getfield        #146 <Field Class resourceClass>
	//   91  165:iload_1         
	//   92  166:invokestatic    #572 <Method int Util.hashCode(Object, int)>
	//   93  169:istore_1        
		i = Util.hashCode(((Object) (signature)), i);
	//   94  170:aload_0         
	//   95  171:getfield        #132 <Field Key signature>
	//   96  174:iload_1         
	//   97  175:invokestatic    #572 <Method int Util.hashCode(Object, int)>
	//   98  178:istore_1        
		return Util.hashCode(((Object) (theme)), i);
	//   99  179:aload_0         
	//  100  180:getfield        #402 <Field android.content.res.Resources$Theme theme>
	//  101  183:iload_1         
	//  102  184:invokestatic    #572 <Method int Util.hashCode(Object, int)>
	//  103  187:ireturn         
	}

	protected boolean isAutoCloneEnabled()
	{
		return isAutoCloneEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//    2    4:ireturn         
	}

	public final boolean isDiskCacheStrategySet()
	{
		return isSet(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #578 <Method boolean isSet(int)>
	//    3    5:ireturn         
	}

	public final boolean isLocked()
	{
		return isLocked;
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field boolean isLocked>
	//    2    4:ireturn         
	}

	public final boolean isMemoryCacheable()
	{
		return isCacheable;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field boolean isCacheable>
	//    2    4:ireturn         
	}

	public final boolean isPrioritySet()
	{
		return isSet(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokespecial   #578 <Method boolean isSet(int)>
	//    3    6:ireturn         
	}

	boolean isScaleOnlyOrNoTransform()
	{
		return isScaleOnlyOrNoTransform;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field boolean isScaleOnlyOrNoTransform>
	//    2    4:ireturn         
	}

	public final boolean isSkipMemoryCacheSet()
	{
		return isSet(256);
	//    0    0:aload_0         
	//    1    1:sipush          256
	//    2    4:invokespecial   #578 <Method boolean isSet(int)>
	//    3    7:ireturn         
	}

	public final boolean isTransformationAllowed()
	{
		return isTransformationAllowed;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field boolean isTransformationAllowed>
	//    2    4:ireturn         
	}

	public final boolean isTransformationRequired()
	{
		return isTransformationRequired;
	//    0    0:aload_0         
	//    1    1:getfield        #379 <Field boolean isTransformationRequired>
	//    2    4:ireturn         
	}

	public final boolean isTransformationSet()
	{
		return isSet(2048);
	//    0    0:aload_0         
	//    1    1:sipush          2048
	//    2    4:invokespecial   #578 <Method boolean isSet(int)>
	//    3    7:ireturn         
	}

	public final boolean isValidOverride()
	{
		return Util.isValidDimensions(overrideWidth, overrideHeight);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int overrideWidth>
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field int overrideHeight>
	//    4    8:invokestatic    #586 <Method boolean Util.isValidDimensions(int, int)>
	//    5   11:ireturn         
	}

	public RequestOptions lock()
	{
		isLocked = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #296 <Field boolean isLocked>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RequestOptions onlyRetrieveFromCache(boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().onlyRetrieveFromCache(flag);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #588 <Method RequestOptions onlyRetrieveFromCache(boolean)>
	//    7   15:areturn         
		} else
		{
			onlyRetrieveFromCache = flag;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #408 <Field boolean onlyRetrieveFromCache>
			fields = fields | 0x80000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #242 <Field int fields>
	//   14   26:ldc1            #21  <Int 0x80000>
	//   15   28:ior             
	//   16   29:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   32:aload_0         
	//   18   33:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   36:areturn         
		}
	}

	public RequestOptions optionalCenterCrop()
	{
		return optionalTransform(DownsampleStrategy.CENTER_OUTSIDE, ((Transformation) (new CenterCrop())));
	//    0    0:aload_0         
	//    1    1:getstatic       #426 <Field DownsampleStrategy DownsampleStrategy.CENTER_OUTSIDE>
	//    2    4:new             #428 <Class CenterCrop>
	//    3    7:dup             
	//    4    8:invokespecial   #429 <Method void CenterCrop()>
	//    5   11:invokevirtual   #292 <Method RequestOptions optionalTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions optionalCenterInside()
	{
		return optionalScaleOnlyTransform(DownsampleStrategy.CENTER_INSIDE, ((Transformation) (new CenterInside())));
	//    0    0:aload_0         
	//    1    1:getstatic       #432 <Field DownsampleStrategy DownsampleStrategy.CENTER_INSIDE>
	//    2    4:new             #434 <Class CenterInside>
	//    3    7:dup             
	//    4    8:invokespecial   #435 <Method void CenterInside()>
	//    5   11:invokespecial   #592 <Method RequestOptions optionalScaleOnlyTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions optionalCircleCrop()
	{
		return optionalTransform(DownsampleStrategy.CENTER_OUTSIDE, ((Transformation) (new CircleCrop())));
	//    0    0:aload_0         
	//    1    1:getstatic       #426 <Field DownsampleStrategy DownsampleStrategy.CENTER_OUTSIDE>
	//    2    4:new             #439 <Class CircleCrop>
	//    3    7:dup             
	//    4    8:invokespecial   #440 <Method void CircleCrop()>
	//    5   11:invokevirtual   #292 <Method RequestOptions optionalTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions optionalFitCenter()
	{
		return optionalScaleOnlyTransform(DownsampleStrategy.FIT_CENTER, ((Transformation) (new FitCenter())));
	//    0    0:aload_0         
	//    1    1:getstatic       #513 <Field DownsampleStrategy DownsampleStrategy.FIT_CENTER>
	//    2    4:new             #515 <Class FitCenter>
	//    3    7:dup             
	//    4    8:invokespecial   #516 <Method void FitCenter()>
	//    5   11:invokespecial   #592 <Method RequestOptions optionalScaleOnlyTransform(DownsampleStrategy, Transformation)>
	//    6   14:areturn         
	}

	public RequestOptions optionalTransform(Transformation transformation)
	{
		return transform(transformation, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #337 <Method RequestOptions transform(Transformation, boolean)>
	//    4    6:areturn         
	}

	final RequestOptions optionalTransform(DownsampleStrategy downsamplestrategy, Transformation transformation)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().optionalTransform(downsamplestrategy, transformation);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #292 <Method RequestOptions optionalTransform(DownsampleStrategy, Transformation)>
	//    8   16:areturn         
		} else
		{
			downsample(downsamplestrategy);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #197 <Method RequestOptions downsample(DownsampleStrategy)>
	//   12   22:pop             
			return transform(transformation, false);
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:iconst_0        
	//   16   26:invokespecial   #337 <Method RequestOptions transform(Transformation, boolean)>
	//   17   29:areturn         
		}
	}

	public RequestOptions optionalTransform(Class class1, Transformation transformation)
	{
		return transform(class1, transformation, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #347 <Method RequestOptions transform(Class, Transformation, boolean)>
	//    5    7:areturn         
	}

	public RequestOptions override(int i)
	{
		return override(i, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #277 <Method RequestOptions override(int, int)>
	//    4    6:areturn         
	}

	public RequestOptions override(int i, int j)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().override(i, j);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #277 <Method RequestOptions override(int, int)>
	//    8   16:areturn         
		} else
		{
			overrideWidth = i;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #124 <Field int overrideWidth>
			overrideHeight = j;
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:putfield        #122 <Field int overrideHeight>
			fields = fields | 0x200;
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #242 <Field int fields>
	//   18   32:sipush          512
	//   19   35:ior             
	//   20   36:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   21   39:aload_0         
	//   22   40:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   23   43:areturn         
		}
	}

	public RequestOptions placeholder(int i)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().placeholder(i);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #281 <Method RequestOptions placeholder(int)>
	//    7   15:areturn         
		} else
		{
			placeholderId = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #396 <Field int placeholderId>
			fields = fields | 0x80;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #242 <Field int fields>
	//   14   26:sipush          128
	//   15   29:ior             
	//   16   30:putfield        #242 <Field int fields>
			placeholderDrawable = null;
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:putfield        #394 <Field Drawable placeholderDrawable>
			fields = fields & 0xffffffbf;
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #242 <Field int fields>
	//   23   43:bipush          -65
	//   24   45:iand            
	//   25   46:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   26   49:aload_0         
	//   27   50:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   28   53:areturn         
		}
	}

	public RequestOptions placeholder(Drawable drawable)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().placeholder(drawable);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #283 <Method RequestOptions placeholder(Drawable)>
	//    7   15:areturn         
		} else
		{
			placeholderDrawable = drawable;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #394 <Field Drawable placeholderDrawable>
			fields = fields | 0x40;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #242 <Field int fields>
	//   14   26:bipush          64
	//   15   28:ior             
	//   16   29:putfield        #242 <Field int fields>
			placeholderId = 0;
	//   17   32:aload_0         
	//   18   33:iconst_0        
	//   19   34:putfield        #396 <Field int placeholderId>
			fields = fields & 0xffffff7f;
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #242 <Field int fields>
	//   23   42:sipush          -129
	//   24   45:iand            
	//   25   46:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   26   49:aload_0         
	//   27   50:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   28   53:areturn         
		}
	}

	public RequestOptions priority(Priority priority1)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().priority(priority1);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #287 <Method RequestOptions priority(Priority)>
	//    7   15:areturn         
		} else
		{
			priority = (Priority)Preconditions.checkNotNull(((Object) (priority1)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #113 <Class Priority>
	//   12   24:putfield        #118 <Field Priority priority>
			fields = fields | 8;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #242 <Field int fields>
	//   16   32:bipush          8
	//   17   34:ior             
	//   18   35:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   38:aload_0         
	//   20   39:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   21   42:areturn         
		}
	}

	public RequestOptions set(Option option1, Object obj)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().set(option1, obj);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #262 <Method RequestOptions set(Option, Object)>
	//    8   16:areturn         
		} else
		{
			Preconditions.checkNotNull(((Object) (option1)));
	//    9   17:aload_1         
	//   10   18:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:pop             
			Preconditions.checkNotNull(obj);
	//   12   22:aload_2         
	//   13   23:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object)>
	//   14   26:pop             
			options.set(option1, obj);
	//   15   27:aload_0         
	//   16   28:getfield        #139 <Field Options options>
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokevirtual   #599 <Method Options Options.set(Option, Object)>
	//   20   36:pop             
			return selfOrThrowIfLocked();
	//   21   37:aload_0         
	//   22   38:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   23   41:areturn         
		}
	}

	public RequestOptions signature(Key key)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().signature(key);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #307 <Method RequestOptions signature(Key)>
	//    7   15:areturn         
		} else
		{
			signature = (Key)Preconditions.checkNotNull(((Object) (key)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:checkcast       #601 <Class Key>
	//   12   24:putfield        #132 <Field Key signature>
			fields = fields | 0x400;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #242 <Field int fields>
	//   16   32:sipush          1024
	//   17   35:ior             
	//   18   36:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   39:aload_0         
	//   20   40:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   21   43:areturn         
		}
	}

	public RequestOptions sizeMultiplier(float f)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
			return clone().sizeMultiplier(f);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:fload_1         
	//    6   12:invokevirtual   #316 <Method RequestOptions sizeMultiplier(float)>
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
	//   18   30:putfield        #104 <Field float sizeMultiplier>
			fields = fields | 2;
	//   19   33:aload_0         
	//   20   34:aload_0         
	//   21   35:getfield        #242 <Field int fields>
	//   22   38:iconst_2        
	//   23   39:ior             
	//   24   40:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   25   43:aload_0         
	//   26   44:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   27   47:areturn         
		} else
		{
			throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
	//   28   48:new             #603 <Class IllegalArgumentException>
	//   29   51:dup             
	//   30   52:ldc2            #605 <String "sizeMultiplier must be between 0 and 1">
	//   31   55:invokespecial   #606 <Method void IllegalArgumentException(String)>
	//   32   58:athrow          
		}
	}

	public RequestOptions skipMemoryCache(boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().skipMemoryCache(true);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #323 <Method RequestOptions skipMemoryCache(boolean)>
	//    7   15:areturn         
		} else
		{
			isCacheable = flag ^ true;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:iconst_1        
	//   11   19:ixor            
	//   12   20:putfield        #120 <Field boolean isCacheable>
			fields = fields | 0x100;
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #242 <Field int fields>
	//   16   28:sipush          256
	//   17   31:ior             
	//   18   32:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   19   35:aload_0         
	//   20   36:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   21   39:areturn         
		}
	}

	public RequestOptions theme(android.content.res.Resources.Theme theme1)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().theme(theme1);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #609 <Method RequestOptions theme(android.content.res.Resources$Theme)>
	//    7   15:areturn         
		} else
		{
			theme = theme1;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #402 <Field android.content.res.Resources$Theme theme>
			fields = fields | 0x8000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #242 <Field int fields>
	//   14   26:ldc1            #37  <Int 32768>
	//   15   28:ior             
	//   16   29:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   32:aload_0         
	//   18   33:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   36:areturn         
		}
	}

	public RequestOptions timeout(int i)
	{
		return set(HttpGlideUrlLoader.TIMEOUT, ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #614 <Field Option HttpGlideUrlLoader.TIMEOUT>
	//    2    4:iload_1         
	//    3    5:invokestatic    #487 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #262 <Method RequestOptions set(Option, Object)>
	//    5   11:areturn         
	}

	public RequestOptions transform(Transformation transformation)
	{
		return transform(transformation, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #337 <Method RequestOptions transform(Transformation, boolean)>
	//    4    6:areturn         
	}

	final RequestOptions transform(DownsampleStrategy downsamplestrategy, Transformation transformation)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            17
		{
			return clone().transform(downsamplestrategy, transformation);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #289 <Method RequestOptions transform(DownsampleStrategy, Transformation)>
	//    8   16:areturn         
		} else
		{
			downsample(downsamplestrategy);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #197 <Method RequestOptions downsample(DownsampleStrategy)>
	//   12   22:pop             
			return transform(transformation);
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #156 <Method RequestOptions transform(Transformation)>
	//   16   28:areturn         
		}
	}

	public RequestOptions transform(Class class1, Transformation transformation)
	{
		return transform(class1, transformation, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #347 <Method RequestOptions transform(Class, Transformation, boolean)>
	//    5    7:areturn         
	}

	public transient RequestOptions transforms(Transformation atransformation[])
	{
		return transform(((Transformation) (new MultiTransformation(atransformation))), true);
	//    0    0:aload_0         
	//    1    1:new             #618 <Class MultiTransformation>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #621 <Method void MultiTransformation(Transformation[])>
	//    5    9:iconst_1        
	//    6   10:invokespecial   #337 <Method RequestOptions transform(Transformation, boolean)>
	//    7   13:areturn         
	}

	public RequestOptions useAnimationPool(boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().useAnimationPool(flag);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #624 <Method RequestOptions useAnimationPool(boolean)>
	//    7   15:areturn         
		} else
		{
			useAnimationPool = flag;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #388 <Field boolean useAnimationPool>
			fields = fields | 0x100000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #242 <Field int fields>
	//   14   26:ldc1            #47  <Int 0x100000>
	//   15   28:ior             
	//   16   29:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   32:aload_0         
	//   18   33:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
	//   19   36:areturn         
		}
	}

	public RequestOptions useUnlimitedSourceGeneratorsPool(boolean flag)
	{
		if(isAutoCloneEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean isAutoCloneEnabled>
	//*   2    4:ifeq            16
		{
			return clone().useUnlimitedSourceGeneratorsPool(flag);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #335 <Method RequestOptions clone()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #626 <Method RequestOptions useUnlimitedSourceGeneratorsPool(boolean)>
	//    7   15:areturn         
		} else
		{
			useUnlimitedSourceGeneratorsPool = flag;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #386 <Field boolean useUnlimitedSourceGeneratorsPool>
			fields = fields | 0x40000;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #242 <Field int fields>
	//   14   26:ldc1            #49  <Int 0x40000>
	//   15   28:ior             
	//   16   29:putfield        #242 <Field int fields>
			return selfOrThrowIfLocked();
	//   17   32:aload_0         
	//   18   33:invokespecial   #364 <Method RequestOptions selfOrThrowIfLocked()>
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
	private static final int USE_ANIMATION_POOL = 0x100000;
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
	private boolean useAnimationPool;
	private boolean useUnlimitedSourceGeneratorsPool;
}
