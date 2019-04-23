// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.ViewTarget;
import java.util.*;

// Referenced classes of package com.bumptech.glide:
//			GenericTransitionOptions, TransitionOptions, Registry

public class GlideContext extends ContextWrapper
{

	public GlideContext(Context context, ArrayPool arraypool, Registry registry1, ImageViewTargetFactory imageviewtargetfactory, RequestOptions requestoptions, Map map, Engine engine1, 
			int i)
	{
		super(context.getApplicationContext());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #43  <Method Context Context.getApplicationContext()>
	//    3    5:invokespecial   #46  <Method void ContextWrapper(Context)>
		arrayPool = arraypool;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:putfield        #48  <Field ArrayPool arrayPool>
		registry = registry1;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #50  <Field Registry registry>
		imageViewTargetFactory = imageviewtargetfactory;
	//   10   18:aload_0         
	//   11   19:aload           4
	//   12   21:putfield        #52  <Field ImageViewTargetFactory imageViewTargetFactory>
		defaultRequestOptions = requestoptions;
	//   13   24:aload_0         
	//   14   25:aload           5
	//   15   27:putfield        #54  <Field RequestOptions defaultRequestOptions>
		defaultTransitionOptions = map;
	//   16   30:aload_0         
	//   17   31:aload           6
	//   18   33:putfield        #56  <Field Map defaultTransitionOptions>
		engine = engine1;
	//   19   36:aload_0         
	//   20   37:aload           7
	//   21   39:putfield        #58  <Field Engine engine>
		logLevel = i;
	//   22   42:aload_0         
	//   23   43:iload           8
	//   24   45:putfield        #60  <Field int logLevel>
	//   25   48:aload_0         
	//   26   49:new             #62  <Class Handler>
	//   27   52:dup             
	//   28   53:invokestatic    #68  <Method Looper Looper.getMainLooper()>
	//   29   56:invokespecial   #71  <Method void Handler(Looper)>
	//   30   59:putfield        #73  <Field Handler mainHandler>
	//   31   62:return          
	}

	public ViewTarget buildImageViewTarget(ImageView imageview, Class class1)
	{
		return imageViewTargetFactory.buildTarget(imageview, class1);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ImageViewTargetFactory imageViewTargetFactory>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #83  <Method ViewTarget ImageViewTargetFactory.buildTarget(ImageView, Class)>
	//    5    9:areturn         
	}

	public ArrayPool getArrayPool()
	{
		return arrayPool;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ArrayPool arrayPool>
	//    2    4:areturn         
	}

	public RequestOptions getDefaultRequestOptions()
	{
		return defaultRequestOptions;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field RequestOptions defaultRequestOptions>
	//    2    4:areturn         
	}

	public TransitionOptions getDefaultTransitionOptions(Class class1)
	{
		TransitionOptions transitionoptions = (TransitionOptions)defaultTransitionOptions.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Map defaultTransitionOptions>
	//    2    4:aload_1         
	//    3    5:invokeinterface #97  <Method Object Map.get(Object)>
	//    4   10:checkcast       #99  <Class TransitionOptions>
	//    5   13:astore_3        
		Object obj = ((Object) (transitionoptions));
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(transitionoptions == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       88
		{
			Iterator iterator = defaultTransitionOptions.entrySet().iterator();
	//   10   20:aload_0         
	//   11   21:getfield        #56  <Field Map defaultTransitionOptions>
	//   12   24:invokeinterface #103 <Method Set Map.entrySet()>
	//   13   29:invokeinterface #109 <Method Iterator Set.iterator()>
	//   14   34:astore          4
			do
			{
				obj = ((Object) (transitionoptions));
	//   15   36:aload_3         
	//   16   37:astore_2        
				if(!iterator.hasNext())
					break;
	//   17   38:aload           4
	//   18   40:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//   19   45:ifeq            88
				obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   20   48:aload           4
	//   21   50:invokeinterface #119 <Method Object Iterator.next()>
	//   22   55:checkcast       #121 <Class java.util.Map$Entry>
	//   23   58:astore_2        
				if(((Class)((java.util.Map.Entry) (obj)).getKey()).isAssignableFrom(class1))
	//*  24   59:aload_2         
	//*  25   60:invokeinterface #124 <Method Object java.util.Map$Entry.getKey()>
	//*  26   65:checkcast       #126 <Class Class>
	//*  27   68:aload_1         
	//*  28   69:invokevirtual   #130 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   72:ifeq            36
					transitionoptions = (TransitionOptions)((java.util.Map.Entry) (obj)).getValue();
	//   30   75:aload_2         
	//   31   76:invokeinterface #133 <Method Object java.util.Map$Entry.getValue()>
	//   32   81:checkcast       #99  <Class TransitionOptions>
	//   33   84:astore_3        
			} while(true);
	//   34   85:goto            36
		}
		class1 = ((Class) (obj));
	//   35   88:aload_2         
	//   36   89:astore_1        
		if(obj == null)
	//*  37   90:aload_2         
	//*  38   91:ifnonnull       98
			class1 = ((Class) (DEFAULT_TRANSITION_OPTIONS));
	//   39   94:getstatic       #34  <Field TransitionOptions DEFAULT_TRANSITION_OPTIONS>
	//   40   97:astore_1        
		return ((TransitionOptions) (class1));
	//   41   98:aload_1         
	//   42   99:areturn         
	}

	public Engine getEngine()
	{
		return engine;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Engine engine>
	//    2    4:areturn         
	}

	public int getLogLevel()
	{
		return logLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int logLevel>
	//    2    4:ireturn         
	}

	public Handler getMainHandler()
	{
		return mainHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Handler mainHandler>
	//    2    4:areturn         
	}

	public Registry getRegistry()
	{
		return registry;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Registry registry>
	//    2    4:areturn         
	}

	static final TransitionOptions DEFAULT_TRANSITION_OPTIONS = new GenericTransitionOptions();
	private final ArrayPool arrayPool;
	private final RequestOptions defaultRequestOptions;
	private final Map defaultTransitionOptions;
	private final Engine engine;
	private final ImageViewTargetFactory imageViewTargetFactory;
	private final int logLevel;
	private final Handler mainHandler = new Handler(Looper.getMainLooper());
	private final Registry registry;

	static 
	{
	//    0    0:new             #29  <Class GenericTransitionOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void GenericTransitionOptions()>
	//    3    7:putstatic       #34  <Field TransitionOptions DEFAULT_TRANSITION_OPTIONS>
	//*   4   10:return          
	}
}
