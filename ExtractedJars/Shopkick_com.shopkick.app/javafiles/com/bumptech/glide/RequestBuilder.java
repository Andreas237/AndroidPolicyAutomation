// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.PreloadTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.signature.ApplicationVersionSignature;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.bumptech.glide:
//			ModelTypes, Priority, RequestManager, Glide, 
//			GlideContext, TransitionOptions

public class RequestBuilder
	implements Cloneable, ModelTypes
{

	protected RequestBuilder(Glide glide1, RequestManager requestmanager, Class class1, Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void Object()>
		isDefaultTransitionOptionsSet = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #86  <Field boolean isDefaultTransitionOptionsSet>
		glide = glide1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #88  <Field Glide glide>
		requestManager = requestmanager;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #90  <Field RequestManager requestManager>
		transcodeClass = class1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #92  <Field Class transcodeClass>
		defaultRequestOptions = requestmanager.getDefaultRequestOptions();
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #98  <Method RequestOptions RequestManager.getDefaultRequestOptions()>
	//   17   29:putfield        #100 <Field RequestOptions defaultRequestOptions>
		context = context1;
	//   18   32:aload_0         
	//   19   33:aload           4
	//   20   35:putfield        #102 <Field Context context>
		transitionOptions = requestmanager.getDefaultTransitionOptions(class1);
	//   21   38:aload_0         
	//   22   39:aload_2         
	//   23   40:aload_3         
	//   24   41:invokevirtual   #106 <Method TransitionOptions RequestManager.getDefaultTransitionOptions(Class)>
	//   25   44:putfield        #108 <Field TransitionOptions transitionOptions>
		requestOptions = defaultRequestOptions;
	//   26   47:aload_0         
	//   27   48:aload_0         
	//   28   49:getfield        #100 <Field RequestOptions defaultRequestOptions>
	//   29   52:putfield        #110 <Field RequestOptions requestOptions>
		glideContext = glide1.getGlideContext();
	//   30   55:aload_0         
	//   31   56:aload_1         
	//   32   57:invokevirtual   #116 <Method GlideContext Glide.getGlideContext()>
	//   33   60:putfield        #118 <Field GlideContext glideContext>
	//   34   63:return          
	}

	protected RequestBuilder(Class class1, RequestBuilder requestbuilder)
	{
		this(requestbuilder.glide, requestbuilder.requestManager, class1, requestbuilder.context);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:getfield        #88  <Field Glide glide>
	//    3    5:aload_2         
	//    4    6:getfield        #90  <Field RequestManager requestManager>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:getfield        #102 <Field Context context>
	//    8   14:invokespecial   #123 <Method void RequestBuilder(Glide, RequestManager, Class, Context)>
		model = requestbuilder.model;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:getfield        #125 <Field Object model>
	//   12   22:putfield        #125 <Field Object model>
		isModelSet = requestbuilder.isModelSet;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:getfield        #127 <Field boolean isModelSet>
	//   16   30:putfield        #127 <Field boolean isModelSet>
		requestOptions = requestbuilder.requestOptions;
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:getfield        #110 <Field RequestOptions requestOptions>
	//   20   38:putfield        #110 <Field RequestOptions requestOptions>
	//   21   41:return          
	}

	private Request buildRequest(Target target, RequestListener requestlistener, RequestOptions requestoptions)
	{
		return buildRequestRecursive(target, requestlistener, ((RequestCoordinator) (null)), transitionOptions, requestoptions.getPriority(), requestoptions.getOverrideWidth(), requestoptions.getOverrideHeight(), requestoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_0         
	//    5    5:getfield        #108 <Field TransitionOptions transitionOptions>
	//    6    8:aload_3         
	//    7    9:invokevirtual   #134 <Method Priority RequestOptions.getPriority()>
	//    8   12:aload_3         
	//    9   13:invokevirtual   #138 <Method int RequestOptions.getOverrideWidth()>
	//   10   16:aload_3         
	//   11   17:invokevirtual   #141 <Method int RequestOptions.getOverrideHeight()>
	//   12   20:aload_3         
	//   13   21:invokespecial   #145 <Method Request buildRequestRecursive(Target, RequestListener, RequestCoordinator, TransitionOptions, Priority, int, int, RequestOptions)>
	//   14   24:areturn         
	}

	private Request buildRequestRecursive(Target target, RequestListener requestlistener, RequestCoordinator requestcoordinator, TransitionOptions transitionoptions, Priority priority, int i, int j, 
			RequestOptions requestoptions)
	{
		Object obj;
		if(errorBuilder != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field RequestBuilder errorBuilder>
	//*   2    4:ifnull          23
		{
			obj = ((Object) (new ErrorRequestCoordinator(requestcoordinator)));
	//    3    7:new             #151 <Class ErrorRequestCoordinator>
	//    4   10:dup             
	//    5   11:aload_3         
	//    6   12:invokespecial   #154 <Method void ErrorRequestCoordinator(RequestCoordinator)>
	//    7   15:astore          11
			requestcoordinator = ((RequestCoordinator) (obj));
	//    8   17:aload           11
	//    9   19:astore_3        
		} else
	//*  10   20:goto            32
		{
			Object obj1 = null;
	//   11   23:aconst_null     
	//   12   24:astore          12
			obj = ((Object) (requestcoordinator));
	//   13   26:aload_3         
	//   14   27:astore          11
			requestcoordinator = ((RequestCoordinator) (obj1));
	//   15   29:aload           12
	//   16   31:astore_3        
		}
		transitionoptions = ((TransitionOptions) (buildThumbnailRequestRecursive(target, requestlistener, ((RequestCoordinator) (obj)), transitionoptions, priority, i, j, requestoptions)));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:aload_2         
	//   20   35:aload           11
	//   21   37:aload           4
	//   22   39:aload           5
	//   23   41:iload           6
	//   24   43:iload           7
	//   25   45:aload           8
	//   26   47:invokespecial   #157 <Method Request buildThumbnailRequestRecursive(Target, RequestListener, RequestCoordinator, TransitionOptions, Priority, int, int, RequestOptions)>
	//   27   50:astore          4
		if(requestcoordinator == null)
	//*  28   52:aload_3         
	//*  29   53:ifnonnull       59
			return ((Request) (transitionoptions));
	//   30   56:aload           4
	//   31   58:areturn         
		int l = errorBuilder.requestOptions.getOverrideWidth();
	//   32   59:aload_0         
	//   33   60:getfield        #149 <Field RequestBuilder errorBuilder>
	//   34   63:getfield        #110 <Field RequestOptions requestOptions>
	//   35   66:invokevirtual   #138 <Method int RequestOptions.getOverrideWidth()>
	//   36   69:istore          10
		int k = errorBuilder.requestOptions.getOverrideHeight();
	//   37   71:aload_0         
	//   38   72:getfield        #149 <Field RequestBuilder errorBuilder>
	//   39   75:getfield        #110 <Field RequestOptions requestOptions>
	//   40   78:invokevirtual   #141 <Method int RequestOptions.getOverrideHeight()>
	//   41   81:istore          9
		if(Util.isValidDimensions(i, j) && !errorBuilder.requestOptions.isValidOverride())
	//*  42   83:iload           6
	//*  43   85:iload           7
	//*  44   87:invokestatic    #163 <Method boolean Util.isValidDimensions(int, int)>
	//*  45   90:ifeq            123
	//*  46   93:aload_0         
	//*  47   94:getfield        #149 <Field RequestBuilder errorBuilder>
	//*  48   97:getfield        #110 <Field RequestOptions requestOptions>
	//*  49  100:invokevirtual   #167 <Method boolean RequestOptions.isValidOverride()>
	//*  50  103:ifne            123
		{
			i = requestoptions.getOverrideWidth();
	//   51  106:aload           8
	//   52  108:invokevirtual   #138 <Method int RequestOptions.getOverrideWidth()>
	//   53  111:istore          6
			j = requestoptions.getOverrideHeight();
	//   54  113:aload           8
	//   55  115:invokevirtual   #141 <Method int RequestOptions.getOverrideHeight()>
	//   56  118:istore          7
		} else
	//*  57  120:goto            131
		{
			i = l;
	//   58  123:iload           10
	//   59  125:istore          6
			j = k;
	//   60  127:iload           9
	//   61  129:istore          7
		}
		priority = ((Priority) (errorBuilder));
	//   62  131:aload_0         
	//   63  132:getfield        #149 <Field RequestBuilder errorBuilder>
	//   64  135:astore          5
		((ErrorRequestCoordinator) (requestcoordinator)).setRequests(((Request) (transitionoptions)), ((RequestBuilder) (priority)).buildRequestRecursive(target, requestlistener, requestcoordinator, ((RequestBuilder) (priority)).transitionOptions, ((RequestBuilder) (priority)).requestOptions.getPriority(), i, j, errorBuilder.requestOptions));
	//   65  137:aload_3         
	//   66  138:aload           4
	//   67  140:aload           5
	//   68  142:aload_1         
	//   69  143:aload_2         
	//   70  144:aload_3         
	//   71  145:aload           5
	//   72  147:getfield        #108 <Field TransitionOptions transitionOptions>
	//   73  150:aload           5
	//   74  152:getfield        #110 <Field RequestOptions requestOptions>
	//   75  155:invokevirtual   #134 <Method Priority RequestOptions.getPriority()>
	//   76  158:iload           6
	//   77  160:iload           7
	//   78  162:aload_0         
	//   79  163:getfield        #149 <Field RequestBuilder errorBuilder>
	//   80  166:getfield        #110 <Field RequestOptions requestOptions>
	//   81  169:invokespecial   #145 <Method Request buildRequestRecursive(Target, RequestListener, RequestCoordinator, TransitionOptions, Priority, int, int, RequestOptions)>
	//   82  172:invokevirtual   #171 <Method void ErrorRequestCoordinator.setRequests(Request, Request)>
		return ((Request) (requestcoordinator));
	//   83  175:aload_3         
	//   84  176:areturn         
	}

	private Request buildThumbnailRequestRecursive(Target target, RequestListener requestlistener, RequestCoordinator requestcoordinator, TransitionOptions transitionoptions, Priority priority, int i, int j, 
			RequestOptions requestoptions)
	{
		Object obj = ((Object) (thumbnailBuilder));
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field RequestBuilder thumbnailBuilder>
	//    2    4:astore          12
		if(obj != null)
	//*   3    6:aload           12
	//*   4    8:ifnull          225
			if(!isThumbnailBuilt)
	//*   5   11:aload_0         
	//*   6   12:getfield        #176 <Field boolean isThumbnailBuilt>
	//*   7   15:ifne            215
			{
				TransitionOptions transitionoptions1 = ((RequestBuilder) (obj)).transitionOptions;
	//    8   18:aload           12
	//    9   20:getfield        #108 <Field TransitionOptions transitionOptions>
	//   10   23:astore          11
				if(((RequestBuilder) (obj)).isDefaultTransitionOptionsSet)
	//*  11   25:aload           12
	//*  12   27:getfield        #86  <Field boolean isDefaultTransitionOptionsSet>
	//*  13   30:ifeq            40
					transitionoptions1 = transitionoptions;
	//   14   33:aload           4
	//   15   35:astore          11
	//*  16   37:goto            40
				if(thumbnailBuilder.requestOptions.isPrioritySet())
	//*  17   40:aload_0         
	//*  18   41:getfield        #174 <Field RequestBuilder thumbnailBuilder>
	//*  19   44:getfield        #110 <Field RequestOptions requestOptions>
	//*  20   47:invokevirtual   #179 <Method boolean RequestOptions.isPrioritySet()>
	//*  21   50:ifeq            68
					obj = ((Object) (thumbnailBuilder.requestOptions.getPriority()));
	//   22   53:aload_0         
	//   23   54:getfield        #174 <Field RequestBuilder thumbnailBuilder>
	//   24   57:getfield        #110 <Field RequestOptions requestOptions>
	//   25   60:invokevirtual   #134 <Method Priority RequestOptions.getPriority()>
	//   26   63:astore          12
				else
	//*  27   65:goto            76
					obj = ((Object) (getThumbnailPriority(priority)));
	//   28   68:aload_0         
	//   29   69:aload           5
	//   30   71:invokespecial   #183 <Method Priority getThumbnailPriority(Priority)>
	//   31   74:astore          12
				int k = thumbnailBuilder.requestOptions.getOverrideWidth();
	//   32   76:aload_0         
	//   33   77:getfield        #174 <Field RequestBuilder thumbnailBuilder>
	//   34   80:getfield        #110 <Field RequestOptions requestOptions>
	//   35   83:invokevirtual   #138 <Method int RequestOptions.getOverrideWidth()>
	//   36   86:istore          9
				int l = thumbnailBuilder.requestOptions.getOverrideHeight();
	//   37   88:aload_0         
	//   38   89:getfield        #174 <Field RequestBuilder thumbnailBuilder>
	//   39   92:getfield        #110 <Field RequestOptions requestOptions>
	//   40   95:invokevirtual   #141 <Method int RequestOptions.getOverrideHeight()>
	//   41   98:istore          10
				if(Util.isValidDimensions(i, j) && !thumbnailBuilder.requestOptions.isValidOverride())
	//*  42  100:iload           6
	//*  43  102:iload           7
	//*  44  104:invokestatic    #163 <Method boolean Util.isValidDimensions(int, int)>
	//*  45  107:ifeq            140
	//*  46  110:aload_0         
	//*  47  111:getfield        #174 <Field RequestBuilder thumbnailBuilder>
	//*  48  114:getfield        #110 <Field RequestOptions requestOptions>
	//*  49  117:invokevirtual   #167 <Method boolean RequestOptions.isValidOverride()>
	//*  50  120:ifne            140
				{
					k = requestoptions.getOverrideWidth();
	//   51  123:aload           8
	//   52  125:invokevirtual   #138 <Method int RequestOptions.getOverrideWidth()>
	//   53  128:istore          9
					l = requestoptions.getOverrideHeight();
	//   54  130:aload           8
	//   55  132:invokevirtual   #141 <Method int RequestOptions.getOverrideHeight()>
	//   56  135:istore          10
				}
	//*  57  137:goto            140
				requestcoordinator = ((RequestCoordinator) (new ThumbnailRequestCoordinator(requestcoordinator)));
	//   58  140:new             #185 <Class ThumbnailRequestCoordinator>
	//   59  143:dup             
	//   60  144:aload_3         
	//   61  145:invokespecial   #186 <Method void ThumbnailRequestCoordinator(RequestCoordinator)>
	//   62  148:astore_3        
				transitionoptions = ((TransitionOptions) (obtainRequest(target, requestlistener, requestoptions, requestcoordinator, transitionoptions, priority, i, j)));
	//   63  149:aload_0         
	//   64  150:aload_1         
	//   65  151:aload_2         
	//   66  152:aload           8
	//   67  154:aload_3         
	//   68  155:aload           4
	//   69  157:aload           5
	//   70  159:iload           6
	//   71  161:iload           7
	//   72  163:invokespecial   #190 <Method Request obtainRequest(Target, RequestListener, RequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int)>
	//   73  166:astore          4
				isThumbnailBuilt = true;
	//   74  168:aload_0         
	//   75  169:iconst_1        
	//   76  170:putfield        #176 <Field boolean isThumbnailBuilt>
				priority = ((Priority) (thumbnailBuilder));
	//   77  173:aload_0         
	//   78  174:getfield        #174 <Field RequestBuilder thumbnailBuilder>
	//   79  177:astore          5
				target = ((Target) (((RequestBuilder) (priority)).buildRequestRecursive(target, requestlistener, requestcoordinator, transitionoptions1, ((Priority) (obj)), k, l, ((RequestBuilder) (priority)).requestOptions)));
	//   80  179:aload           5
	//   81  181:aload_1         
	//   82  182:aload_2         
	//   83  183:aload_3         
	//   84  184:aload           11
	//   85  186:aload           12
	//   86  188:iload           9
	//   87  190:iload           10
	//   88  192:aload           5
	//   89  194:getfield        #110 <Field RequestOptions requestOptions>
	//   90  197:invokespecial   #145 <Method Request buildRequestRecursive(Target, RequestListener, RequestCoordinator, TransitionOptions, Priority, int, int, RequestOptions)>
	//   91  200:astore_1        
				isThumbnailBuilt = false;
	//   92  201:aload_0         
	//   93  202:iconst_0        
	//   94  203:putfield        #176 <Field boolean isThumbnailBuilt>
				((ThumbnailRequestCoordinator) (requestcoordinator)).setRequests(((Request) (transitionoptions)), ((Request) (target)));
	//   95  206:aload_3         
	//   96  207:aload           4
	//   97  209:aload_1         
	//   98  210:invokevirtual   #191 <Method void ThumbnailRequestCoordinator.setRequests(Request, Request)>
				return ((Request) (requestcoordinator));
	//   99  213:aload_3         
	//  100  214:areturn         
			} else
			{
				throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
	//  101  215:new             #193 <Class IllegalStateException>
	//  102  218:dup             
	//  103  219:ldc1            #195 <String "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()">
	//  104  221:invokespecial   #198 <Method void IllegalStateException(String)>
	//  105  224:athrow          
			}
		if(thumbSizeMultiplier != null)
	//* 106  225:aload_0         
	//* 107  226:getfield        #200 <Field Float thumbSizeMultiplier>
	//* 108  229:ifnull          298
		{
			requestcoordinator = ((RequestCoordinator) (new ThumbnailRequestCoordinator(requestcoordinator)));
	//  109  232:new             #185 <Class ThumbnailRequestCoordinator>
	//  110  235:dup             
	//  111  236:aload_3         
	//  112  237:invokespecial   #186 <Method void ThumbnailRequestCoordinator(RequestCoordinator)>
	//  113  240:astore_3        
			((ThumbnailRequestCoordinator) (requestcoordinator)).setRequests(obtainRequest(target, requestlistener, requestoptions, requestcoordinator, transitionoptions, priority, i, j), obtainRequest(target, requestlistener, requestoptions.clone().sizeMultiplier(thumbSizeMultiplier.floatValue()), requestcoordinator, transitionoptions, getThumbnailPriority(priority), i, j));
	//  114  241:aload_3         
	//  115  242:aload_0         
	//  116  243:aload_1         
	//  117  244:aload_2         
	//  118  245:aload           8
	//  119  247:aload_3         
	//  120  248:aload           4
	//  121  250:aload           5
	//  122  252:iload           6
	//  123  254:iload           7
	//  124  256:invokespecial   #190 <Method Request obtainRequest(Target, RequestListener, RequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int)>
	//  125  259:aload_0         
	//  126  260:aload_1         
	//  127  261:aload_2         
	//  128  262:aload           8
	//  129  264:invokevirtual   #203 <Method RequestOptions RequestOptions.clone()>
	//  130  267:aload_0         
	//  131  268:getfield        #200 <Field Float thumbSizeMultiplier>
	//  132  271:invokevirtual   #209 <Method float Float.floatValue()>
	//  133  274:invokevirtual   #213 <Method RequestOptions RequestOptions.sizeMultiplier(float)>
	//  134  277:aload_3         
	//  135  278:aload           4
	//  136  280:aload_0         
	//  137  281:aload           5
	//  138  283:invokespecial   #183 <Method Priority getThumbnailPriority(Priority)>
	//  139  286:iload           6
	//  140  288:iload           7
	//  141  290:invokespecial   #190 <Method Request obtainRequest(Target, RequestListener, RequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int)>
	//  142  293:invokevirtual   #191 <Method void ThumbnailRequestCoordinator.setRequests(Request, Request)>
			return ((Request) (requestcoordinator));
	//  143  296:aload_3         
	//  144  297:areturn         
		} else
		{
			return obtainRequest(target, requestlistener, requestoptions, requestcoordinator, transitionoptions, priority, i, j);
	//  145  298:aload_0         
	//  146  299:aload_1         
	//  147  300:aload_2         
	//  148  301:aload           8
	//  149  303:aload_3         
	//  150  304:aload           4
	//  151  306:aload           5
	//  152  308:iload           6
	//  153  310:iload           7
	//  154  312:invokespecial   #190 <Method Request obtainRequest(Target, RequestListener, RequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int)>
	//  155  315:areturn         
		}
	}

	private Priority getThumbnailPriority(Priority priority)
	{
		static class _cls2
		{

			static final int $SwitchMap$android$widget$ImageView$ScaleType[];
			static final int $SwitchMap$com$bumptech$glide$Priority[];

			static 
			{
				$SwitchMap$com$bumptech$glide$Priority = new int[Priority.values().length];
			//    0    0:invokestatic    #19  <Method Priority[] Priority.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
				try
				{
					$SwitchMap$com$bumptech$glide$Priority[Priority.LOW.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
			//    5   12:getstatic       #25  <Field Priority Priority.LOW>
			//    6   15:invokevirtual   #29  <Method int Priority.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
			//*  10   23:getstatic       #32  <Field Priority Priority.NORMAL>
			//*  11   26:invokevirtual   #29  <Method int Priority.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
			//*  15   34:getstatic       #35  <Field Priority Priority.HIGH>
			//*  16   37:invokevirtual   #29  <Method int Priority.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
			//*  20   45:getstatic       #38  <Field Priority Priority.IMMEDIATE>
			//*  21   48:invokevirtual   #29  <Method int Priority.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:invokestatic    #43  <Method android.widget.ImageView$ScaleType[] android.widget.ImageView$ScaleType.values()>
			//*  25   56:arraylength     
			//*  26   57:newarray        int[]
			//*  27   59:putstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  28   62:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  29   65:getstatic       #49  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
			//*  30   68:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  31   71:iconst_1        
			//*  32   72:iastore         
			//*  33   73:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  34   76:getstatic       #53  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
			//*  35   79:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  36   82:iconst_2        
			//*  37   83:iastore         
			//*  38   84:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  39   87:getstatic       #56  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
			//*  40   90:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  41   93:iconst_3        
			//*  42   94:iastore         
			//*  43   95:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  44   98:getstatic       #59  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_START>
			//*  45  101:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  46  104:iconst_4        
			//*  47  105:iastore         
			//*  48  106:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  49  109:getstatic       #62  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_END>
			//*  50  112:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  51  115:iconst_5        
			//*  52  116:iastore         
			//*  53  117:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  54  120:getstatic       #65  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
			//*  55  123:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  56  126:bipush          6
			//*  57  128:iastore         
			//*  58  129:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  59  132:getstatic       #68  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER>
			//*  60  135:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  61  138:bipush          7
			//*  62  140:iastore         
			//*  63  141:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  64  144:getstatic       #71  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
			//*  65  147:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  66  150:bipush          8
			//*  67  152:iastore         
			//*  68  153:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   69  154:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$Priority[Priority.NORMAL.ordinal()] = 2;
				}
			//*  70  155:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   71  158:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$Priority[Priority.HIGH.ordinal()] = 3;
				}
			//*  72  159:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   73  162:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$Priority[Priority.IMMEDIATE.ordinal()] = 4;
				}
			//*  74  163:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   75  166:astore_0        
				$SwitchMap$android$widget$ImageView$ScaleType = new int[android.widget.ImageView.ScaleType.values().length];
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
				}
			//*  76  167:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   77  170:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
				}
			//*  78  171:goto            73
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   79  174:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
				}
			//*  80  175:goto            84
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   81  178:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 4;
				}
			//*  82  179:goto            95
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   83  182:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 5;
				}
			//*  84  183:goto            106
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   85  186:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 6;
				}
			//*  86  187:goto            117
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   87  190:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 7;
				}
			//*  88  191:goto            129
				catch(NoSuchFieldError nosuchfielderror10) { }
			//   89  194:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.MATRIX.ordinal()] = 8;
				}
			//*  90  195:goto            141
				catch(NoSuchFieldError nosuchfielderror11) { }
			//   91  198:astore_0        
			//*  92  199:return          
			}
		}

		switch(_cls2..SwitchMap.com.bumptech.glide.Priority[priority.ordinal()])
	//*   0    0:getstatic       #217 <Field int[] RequestBuilder$2.$SwitchMap$com$bumptech$glide$Priority>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #220 <Method int Priority.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 4: default 40
	//	               1 87
	//	               2 83
	//	               3 79
	//	               4 79
		default:
			priority = ((Priority) (new StringBuilder()));
	//    5   40:new             #222 <Class StringBuilder>
	//    6   43:dup             
	//    7   44:invokespecial   #223 <Method void StringBuilder()>
	//    8   47:astore_1        
			((StringBuilder) (priority)).append("unknown priority: ");
	//    9   48:aload_1         
	//   10   49:ldc1            #225 <String "unknown priority: ">
	//   11   51:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   12   54:pop             
			((StringBuilder) (priority)).append(((Object) (requestOptions.getPriority())));
	//   13   55:aload_1         
	//   14   56:aload_0         
	//   15   57:getfield        #110 <Field RequestOptions requestOptions>
	//   16   60:invokevirtual   #134 <Method Priority RequestOptions.getPriority()>
	//   17   63:invokevirtual   #232 <Method StringBuilder StringBuilder.append(Object)>
	//   18   66:pop             
			throw new IllegalArgumentException(((StringBuilder) (priority)).toString());
	//   19   67:new             #234 <Class IllegalArgumentException>
	//   20   70:dup             
	//   21   71:aload_1         
	//   22   72:invokevirtual   #238 <Method String StringBuilder.toString()>
	//   23   75:invokespecial   #239 <Method void IllegalArgumentException(String)>
	//   24   78:athrow          

		case 3: // '\003'
		case 4: // '\004'
			return Priority.IMMEDIATE;
	//   25   79:getstatic       #242 <Field Priority Priority.IMMEDIATE>
	//   26   82:areturn         

		case 2: // '\002'
			return Priority.HIGH;
	//   27   83:getstatic       #245 <Field Priority Priority.HIGH>
	//   28   86:areturn         

		case 1: // '\001'
			return Priority.NORMAL;
	//   29   87:getstatic       #248 <Field Priority Priority.NORMAL>
	//   30   90:areturn         
		}
	}

	private Target into(Target target, RequestListener requestlistener, RequestOptions requestoptions)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #254 <Method void Util.assertMainThread()>
		Preconditions.checkNotNull(((Object) (target)));
	//    1    3:aload_1         
	//    2    4:invokestatic    #260 <Method Object Preconditions.checkNotNull(Object)>
	//    3    7:pop             
		if(isModelSet)
	//*   4    8:aload_0         
	//*   5    9:getfield        #127 <Field boolean isModelSet>
	//*   6   12:ifeq            114
		{
			requestoptions = requestoptions.autoClone();
	//    7   15:aload_3         
	//    8   16:invokevirtual   #263 <Method RequestOptions RequestOptions.autoClone()>
	//    9   19:astore_3        
			requestlistener = ((RequestListener) (buildRequest(target, requestlistener, requestoptions)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:aload_3         
	//   14   24:invokespecial   #265 <Method Request buildRequest(Target, RequestListener, RequestOptions)>
	//   15   27:astore_2        
			Request request = target.getRequest();
	//   16   28:aload_1         
	//   17   29:invokeinterface #271 <Method Request Target.getRequest()>
	//   18   34:astore          4
			if(((Request) (requestlistener)).isEquivalentTo(request) && !isSkipMemoryCacheWithCompletePreviousRequest(requestoptions, request))
	//*  19   36:aload_2         
	//*  20   37:aload           4
	//*  21   39:invokeinterface #277 <Method boolean Request.isEquivalentTo(Request)>
	//*  22   44:ifeq            88
	//*  23   47:aload_0         
	//*  24   48:aload_3         
	//*  25   49:aload           4
	//*  26   51:invokespecial   #281 <Method boolean isSkipMemoryCacheWithCompletePreviousRequest(RequestOptions, Request)>
	//*  27   54:ifne            88
			{
				((Request) (requestlistener)).recycle();
	//   28   57:aload_2         
	//   29   58:invokeinterface #284 <Method void Request.recycle()>
				if(!((Request)Preconditions.checkNotNull(((Object) (request)))).isRunning())
	//*  30   63:aload           4
	//*  31   65:invokestatic    #260 <Method Object Preconditions.checkNotNull(Object)>
	//*  32   68:checkcast       #273 <Class Request>
	//*  33   71:invokeinterface #287 <Method boolean Request.isRunning()>
	//*  34   76:ifne            86
					request.begin();
	//   35   79:aload           4
	//   36   81:invokeinterface #290 <Method void Request.begin()>
				return target;
	//   37   86:aload_1         
	//   38   87:areturn         
			} else
			{
				requestManager.clear(target);
	//   39   88:aload_0         
	//   40   89:getfield        #90  <Field RequestManager requestManager>
	//   41   92:aload_1         
	//   42   93:invokevirtual   #294 <Method void RequestManager.clear(Target)>
				target.setRequest(((Request) (requestlistener)));
	//   43   96:aload_1         
	//   44   97:aload_2         
	//   45   98:invokeinterface #298 <Method void Target.setRequest(Request)>
				requestManager.track(target, ((Request) (requestlistener)));
	//   46  103:aload_0         
	//   47  104:getfield        #90  <Field RequestManager requestManager>
	//   48  107:aload_1         
	//   49  108:aload_2         
	//   50  109:invokevirtual   #302 <Method void RequestManager.track(Target, Request)>
				return target;
	//   51  112:aload_1         
	//   52  113:areturn         
			}
		} else
		{
			throw new IllegalArgumentException("You must call #load() before calling #into()");
	//   53  114:new             #234 <Class IllegalArgumentException>
	//   54  117:dup             
	//   55  118:ldc2            #304 <String "You must call #load() before calling #into()">
	//   56  121:invokespecial   #239 <Method void IllegalArgumentException(String)>
	//   57  124:athrow          
		}
	}

	private boolean isSkipMemoryCacheWithCompletePreviousRequest(RequestOptions requestoptions, Request request)
	{
		return !requestoptions.isMemoryCacheable() && request.isComplete();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #308 <Method boolean RequestOptions.isMemoryCacheable()>
	//    2    4:ifne            18
	//    3    7:aload_2         
	//    4    8:invokeinterface #311 <Method boolean Request.isComplete()>
	//    5   13:ifeq            18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	private RequestBuilder loadGeneric(Object obj)
	{
		model = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #125 <Field Object model>
		isModelSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #127 <Field boolean isModelSet>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	private Request obtainRequest(Target target, RequestListener requestlistener, RequestOptions requestoptions, RequestCoordinator requestcoordinator, TransitionOptions transitionoptions, Priority priority, int i, 
			int j)
	{
		Context context1 = context;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Context context>
	//    2    4:astore          9
		GlideContext glidecontext = glideContext;
	//    3    6:aload_0         
	//    4    7:getfield        #118 <Field GlideContext glideContext>
	//    5   10:astore          10
		return ((Request) (SingleRequest.obtain(context1, glidecontext, model, transcodeClass, requestoptions, i, j, priority, target, requestlistener, requestListeners, requestcoordinator, glidecontext.getEngine(), transitionoptions.getTransitionFactory())));
	//    6   12:aload           9
	//    7   14:aload           10
	//    8   16:aload_0         
	//    9   17:getfield        #125 <Field Object model>
	//   10   20:aload_0         
	//   11   21:getfield        #92  <Field Class transcodeClass>
	//   12   24:aload_3         
	//   13   25:iload           7
	//   14   27:iload           8
	//   15   29:aload           6
	//   16   31:aload_1         
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #316 <Field List requestListeners>
	//   20   37:aload           4
	//   21   39:aload           10
	//   22   41:invokevirtual   #322 <Method com.bumptech.glide.load.engine.Engine GlideContext.getEngine()>
	//   23   44:aload           5
	//   24   46:invokevirtual   #328 <Method com.bumptech.glide.request.transition.TransitionFactory TransitionOptions.getTransitionFactory()>
	//   25   49:invokestatic    #334 <Method SingleRequest SingleRequest.obtain(Context, GlideContext, Object, Class, RequestOptions, int, int, Priority, Target, RequestListener, List, RequestCoordinator, com.bumptech.glide.load.engine.Engine, com.bumptech.glide.request.transition.TransitionFactory)>
	//   26   52:areturn         
	}

	public RequestBuilder addListener(RequestListener requestlistener)
	{
		if(requestlistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(requestListeners == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #316 <Field List requestListeners>
	//*   4    8:ifnonnull       22
				requestListeners = ((List) (new ArrayList()));
	//    5   11:aload_0         
	//    6   12:new             #340 <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #341 <Method void ArrayList()>
	//    9   19:putfield        #316 <Field List requestListeners>
			requestListeners.add(((Object) (requestlistener)));
	//   10   22:aload_0         
	//   11   23:getfield        #316 <Field List requestListeners>
	//   12   26:aload_1         
	//   13   27:invokeinterface #347 <Method boolean List.add(Object)>
	//   14   32:pop             
		}
		return this;
	//   15   33:aload_0         
	//   16   34:areturn         
	}

	public RequestBuilder apply(RequestOptions requestoptions)
	{
		Preconditions.checkNotNull(((Object) (requestoptions)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #260 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		requestOptions = getMutableOptions().apply(requestoptions);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #353 <Method RequestOptions getMutableOptions()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #356 <Method RequestOptions RequestOptions.apply(RequestOptions)>
	//    8   14:putfield        #110 <Field RequestOptions requestOptions>
		return this;
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public RequestBuilder clone()
	{
		RequestBuilder requestbuilder;
		try
		{
			requestbuilder = (RequestBuilder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #363 <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class RequestBuilder>
	//    3    7:astore_1        
			requestbuilder.requestOptions = requestbuilder.requestOptions.clone();
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:getfield        #110 <Field RequestOptions requestOptions>
	//    7   13:invokevirtual   #203 <Method RequestOptions RequestOptions.clone()>
	//    8   16:putfield        #110 <Field RequestOptions requestOptions>
			requestbuilder.transitionOptions = requestbuilder.transitionOptions.clone();
	//    9   19:aload_1         
	//   10   20:aload_1         
	//   11   21:getfield        #108 <Field TransitionOptions transitionOptions>
	//   12   24:invokevirtual   #366 <Method TransitionOptions TransitionOptions.clone()>
	//   13   27:putfield        #108 <Field TransitionOptions transitionOptions>
		}
	//*  14   30:aload_1         
	//*  15   31:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  16   32:astore_1        
		{
			throw new RuntimeException(((Throwable) (clonenotsupportedexception)));
	//   17   33:new             #368 <Class RuntimeException>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokespecial   #371 <Method void RuntimeException(Throwable)>
	//   21   41:athrow          
		}
		return requestbuilder;
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #374 <Method RequestBuilder clone()>
	//    2    4:areturn         
	}

	public FutureTarget downloadOnly(int i, int j)
	{
		return getDownloadOnlyRequest().submit(i, j);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #381 <Method RequestBuilder getDownloadOnlyRequest()>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #384 <Method FutureTarget submit(int, int)>
	//    5    9:areturn         
	}

	public Target downloadOnly(Target target)
	{
		return getDownloadOnlyRequest().into(target);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #381 <Method RequestBuilder getDownloadOnlyRequest()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #389 <Method Target into(Target)>
	//    4    8:areturn         
	}

	public RequestBuilder error(RequestBuilder requestbuilder)
	{
		errorBuilder = requestbuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #149 <Field RequestBuilder errorBuilder>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected RequestBuilder getDownloadOnlyRequest()
	{
		return (new RequestBuilder(java/io/File, this)).apply(DOWNLOAD_ONLY_OPTIONS);
	//    0    0:new             #2   <Class RequestBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #395 <Class File>
	//    3    7:aload_0         
	//    4    8:invokespecial   #397 <Method void RequestBuilder(Class, RequestBuilder)>
	//    5   11:getstatic       #81  <Field RequestOptions DOWNLOAD_ONLY_OPTIONS>
	//    6   14:invokevirtual   #399 <Method RequestBuilder apply(RequestOptions)>
	//    7   17:areturn         
	}

	protected RequestOptions getMutableOptions()
	{
		RequestOptions requestoptions2 = defaultRequestOptions;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field RequestOptions defaultRequestOptions>
	//    2    4:astore_3        
		RequestOptions requestoptions1 = requestOptions;
	//    3    5:aload_0         
	//    4    6:getfield        #110 <Field RequestOptions requestOptions>
	//    5    9:astore_2        
		RequestOptions requestoptions = requestoptions1;
	//    6   10:aload_2         
	//    7   11:astore_1        
		if(requestoptions2 == requestoptions1)
	//*   8   12:aload_3         
	//*   9   13:aload_2         
	//*  10   14:if_acmpne       22
			requestoptions = requestoptions1.clone();
	//   11   17:aload_2         
	//   12   18:invokevirtual   #203 <Method RequestOptions RequestOptions.clone()>
	//   13   21:astore_1        
		return requestoptions;
	//   14   22:aload_1         
	//   15   23:areturn         
	}

	public FutureTarget into(int i, int j)
	{
		return submit(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #384 <Method FutureTarget submit(int, int)>
	//    4    6:areturn         
	}

	public Target into(Target target)
	{
		return into(target, ((RequestListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #404 <Method Target into(Target, RequestListener)>
	//    4    6:areturn         
	}

	Target into(Target target, RequestListener requestlistener)
	{
		return into(target, requestlistener, getMutableOptions());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #353 <Method RequestOptions getMutableOptions()>
	//    5    7:invokespecial   #407 <Method Target into(Target, RequestListener, RequestOptions)>
	//    6   10:areturn         
	}

	public ViewTarget into(ImageView imageview)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #254 <Method void Util.assertMainThread()>
		Preconditions.checkNotNull(((Object) (imageview)));
	//    1    3:aload_1         
	//    2    4:invokestatic    #260 <Method Object Preconditions.checkNotNull(Object)>
	//    3    7:pop             
		RequestOptions requestoptions1 = requestOptions;
	//    4    8:aload_0         
	//    5    9:getfield        #110 <Field RequestOptions requestOptions>
	//    6   12:astore_3        
		RequestOptions requestoptions = requestoptions1;
	//    7   13:aload_3         
	//    8   14:astore_2        
		if(!requestoptions1.isTransformationSet())
	//*   9   15:aload_3         
	//*  10   16:invokevirtual   #412 <Method boolean RequestOptions.isTransformationSet()>
	//*  11   19:ifne            134
		{
			requestoptions = requestoptions1;
	//   12   22:aload_3         
	//   13   23:astore_2        
			if(requestoptions1.isTransformationAllowed())
	//*  14   24:aload_3         
	//*  15   25:invokevirtual   #415 <Method boolean RequestOptions.isTransformationAllowed()>
	//*  16   28:ifeq            134
			{
				requestoptions = requestoptions1;
	//   17   31:aload_3         
	//   18   32:astore_2        
				if(imageview.getScaleType() != null)
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #421 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  21   37:ifnull          134
					switch(_cls2..SwitchMap.android.widget.ImageView.ScaleType[imageview.getScaleType().ordinal()])
	//*  22   40:getstatic       #424 <Field int[] RequestBuilder$2.$SwitchMap$android$widget$ImageView$ScaleType>
	//*  23   43:aload_1         
	//*  24   44:invokevirtual   #421 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  25   47:invokevirtual   #427 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  26   50:iaload          
					{
	//*  27   51:tableswitch     1 6: default 88
	//	               1 126
	//	               2 115
	//	               3 104
	//	               4 104
	//	               5 104
	//	               6 93
					default:
						requestoptions = requestoptions1;
	//   28   88:aload_3         
	//   29   89:astore_2        
						break;

	//*  30   90:goto            134
					case 6: // '\006'
						requestoptions = requestoptions1.clone().optionalCenterInside();
	//   31   93:aload_3         
	//   32   94:invokevirtual   #203 <Method RequestOptions RequestOptions.clone()>
	//   33   97:invokevirtual   #430 <Method RequestOptions RequestOptions.optionalCenterInside()>
	//   34  100:astore_2        
						break;

	//*  35  101:goto            134
					case 3: // '\003'
					case 4: // '\004'
					case 5: // '\005'
						requestoptions = requestoptions1.clone().optionalFitCenter();
	//   36  104:aload_3         
	//   37  105:invokevirtual   #203 <Method RequestOptions RequestOptions.clone()>
	//   38  108:invokevirtual   #433 <Method RequestOptions RequestOptions.optionalFitCenter()>
	//   39  111:astore_2        
						break;

	//*  40  112:goto            134
					case 2: // '\002'
						requestoptions = requestoptions1.clone().optionalCenterInside();
	//   41  115:aload_3         
	//   42  116:invokevirtual   #203 <Method RequestOptions RequestOptions.clone()>
	//   43  119:invokevirtual   #430 <Method RequestOptions RequestOptions.optionalCenterInside()>
	//   44  122:astore_2        
						break;

	//*  45  123:goto            134
					case 1: // '\001'
						requestoptions = requestoptions1.clone().optionalCenterCrop();
	//   46  126:aload_3         
	//   47  127:invokevirtual   #203 <Method RequestOptions RequestOptions.clone()>
	//   48  130:invokevirtual   #436 <Method RequestOptions RequestOptions.optionalCenterCrop()>
	//   49  133:astore_2        
						break;
					}
			}
		}
		return (ViewTarget)into(((Target) (glideContext.buildImageViewTarget(imageview, transcodeClass))), ((RequestListener) (null)), requestoptions);
	//   50  134:aload_0         
	//   51  135:aload_0         
	//   52  136:getfield        #118 <Field GlideContext glideContext>
	//   53  139:aload_1         
	//   54  140:aload_0         
	//   55  141:getfield        #92  <Field Class transcodeClass>
	//   56  144:invokevirtual   #440 <Method ViewTarget GlideContext.buildImageViewTarget(ImageView, Class)>
	//   57  147:aconst_null     
	//   58  148:aload_2         
	//   59  149:invokespecial   #407 <Method Target into(Target, RequestListener, RequestOptions)>
	//   60  152:checkcast       #442 <Class ViewTarget>
	//   61  155:areturn         
	}

	public RequestBuilder listener(RequestListener requestlistener)
	{
		requestListeners = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #316 <Field List requestListeners>
		return addListener(requestlistener);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #446 <Method RequestBuilder addListener(RequestListener)>
	//    6   10:areturn         
	}

	public RequestBuilder load(Bitmap bitmap)
	{
		return loadGeneric(((Object) (bitmap))).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #450 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:getstatic       #453 <Field DiskCacheStrategy DiskCacheStrategy.NONE>
	//    4    8:invokestatic    #456 <Method RequestOptions RequestOptions.diskCacheStrategyOf(DiskCacheStrategy)>
	//    5   11:invokevirtual   #399 <Method RequestBuilder apply(RequestOptions)>
	//    6   14:areturn         
	}

	public RequestBuilder load(Drawable drawable)
	{
		return loadGeneric(((Object) (drawable))).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #450 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:getstatic       #453 <Field DiskCacheStrategy DiskCacheStrategy.NONE>
	//    4    8:invokestatic    #456 <Method RequestOptions RequestOptions.diskCacheStrategyOf(DiskCacheStrategy)>
	//    5   11:invokevirtual   #399 <Method RequestBuilder apply(RequestOptions)>
	//    6   14:areturn         
	}

	public RequestBuilder load(Uri uri)
	{
		return loadGeneric(((Object) (uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #450 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(File file)
	{
		return loadGeneric(((Object) (file)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #450 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(Integer integer)
	{
		return loadGeneric(((Object) (integer))).apply(RequestOptions.signatureOf(ApplicationVersionSignature.obtain(context)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #450 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field Context context>
	//    5    9:invokestatic    #471 <Method com.bumptech.glide.load.Key ApplicationVersionSignature.obtain(Context)>
	//    6   12:invokestatic    #475 <Method RequestOptions RequestOptions.signatureOf(com.bumptech.glide.load.Key)>
	//    7   15:invokevirtual   #399 <Method RequestBuilder apply(RequestOptions)>
	//    8   18:areturn         
	}

	public RequestBuilder load(Object obj)
	{
		return loadGeneric(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #450 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(String s)
	{
		return loadGeneric(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #450 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(URL url)
	{
		return loadGeneric(((Object) (url)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #450 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(byte abyte0[])
	{
		Object obj = ((Object) (loadGeneric(((Object) (abyte0)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #450 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:astore_2        
		abyte0 = ((byte []) (obj));
	//    4    6:aload_2         
	//    5    7:astore_1        
		if(!((RequestBuilder) (obj)).requestOptions.isDiskCacheStrategySet())
	//*   6    8:aload_2         
	//*   7    9:getfield        #110 <Field RequestOptions requestOptions>
	//*   8   12:invokevirtual   #484 <Method boolean RequestOptions.isDiskCacheStrategySet()>
	//*   9   15:ifne            29
			abyte0 = ((byte []) (((RequestBuilder) (obj)).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE))));
	//   10   18:aload_2         
	//   11   19:getstatic       #453 <Field DiskCacheStrategy DiskCacheStrategy.NONE>
	//   12   22:invokestatic    #456 <Method RequestOptions RequestOptions.diskCacheStrategyOf(DiskCacheStrategy)>
	//   13   25:invokevirtual   #399 <Method RequestBuilder apply(RequestOptions)>
	//   14   28:astore_1        
		obj = ((Object) (abyte0));
	//   15   29:aload_1         
	//   16   30:astore_2        
		if(!((RequestBuilder) (abyte0)).requestOptions.isSkipMemoryCacheSet())
	//*  17   31:aload_1         
	//*  18   32:getfield        #110 <Field RequestOptions requestOptions>
	//*  19   35:invokevirtual   #487 <Method boolean RequestOptions.isSkipMemoryCacheSet()>
	//*  20   38:ifne            50
			obj = ((Object) (((RequestBuilder) (abyte0)).apply(RequestOptions.skipMemoryCacheOf(true))));
	//   21   41:aload_1         
	//   22   42:iconst_1        
	//   23   43:invokestatic    #490 <Method RequestOptions RequestOptions.skipMemoryCacheOf(boolean)>
	//   24   46:invokevirtual   #399 <Method RequestBuilder apply(RequestOptions)>
	//   25   49:astore_2        
		return ((RequestBuilder) (obj));
	//   26   50:aload_2         
	//   27   51:areturn         
	}

	public volatile Object load(Bitmap bitmap)
	{
		return ((Object) (load(bitmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #494 <Method RequestBuilder load(Bitmap)>
	//    3    5:areturn         
	}

	public volatile Object load(Drawable drawable)
	{
		return ((Object) (load(drawable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #497 <Method RequestBuilder load(Drawable)>
	//    3    5:areturn         
	}

	public volatile Object load(Uri uri)
	{
		return ((Object) (load(uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #500 <Method RequestBuilder load(Uri)>
	//    3    5:areturn         
	}

	public volatile Object load(File file)
	{
		return ((Object) (load(file)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #503 <Method RequestBuilder load(File)>
	//    3    5:areturn         
	}

	public volatile Object load(Integer integer)
	{
		return ((Object) (load(integer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #506 <Method RequestBuilder load(Integer)>
	//    3    5:areturn         
	}

	public volatile Object load(Object obj)
	{
		return ((Object) (load(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #508 <Method RequestBuilder load(Object)>
	//    3    5:areturn         
	}

	public volatile Object load(String s)
	{
		return ((Object) (load(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #511 <Method RequestBuilder load(String)>
	//    3    5:areturn         
	}

	public volatile Object load(URL url)
	{
		return ((Object) (load(url)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #514 <Method RequestBuilder load(URL)>
	//    3    5:areturn         
	}

	public volatile Object load(byte abyte0[])
	{
		return ((Object) (load(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #517 <Method RequestBuilder load(byte[])>
	//    3    5:areturn         
	}

	public Target preload()
	{
		return preload(0x80000000, 0x80000000);
	//    0    0:aload_0         
	//    1    1:ldc2            #520 <Int 0x80000000>
	//    2    4:ldc2            #520 <Int 0x80000000>
	//    3    7:invokevirtual   #523 <Method Target preload(int, int)>
	//    4   10:areturn         
	}

	public Target preload(int i, int j)
	{
		return into(((Target) (PreloadTarget.obtain(requestManager, i, j))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #90  <Field RequestManager requestManager>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #529 <Method PreloadTarget PreloadTarget.obtain(RequestManager, int, int)>
	//    6   10:invokevirtual   #389 <Method Target into(Target)>
	//    7   13:areturn         
	}

	public FutureTarget submit()
	{
		return submit(0x80000000, 0x80000000);
	//    0    0:aload_0         
	//    1    1:ldc2            #520 <Int 0x80000000>
	//    2    4:ldc2            #520 <Int 0x80000000>
	//    3    7:invokevirtual   #384 <Method FutureTarget submit(int, int)>
	//    4   10:areturn         
	}

	public FutureTarget submit(int i, int j)
	{
		final RequestFutureTarget target = new RequestFutureTarget(glideContext.getMainHandler(), i, j);
	//    0    0:new             #534 <Class RequestFutureTarget>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #118 <Field GlideContext glideContext>
	//    4    8:invokevirtual   #538 <Method Handler GlideContext.getMainHandler()>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokespecial   #541 <Method void RequestFutureTarget(Handler, int, int)>
	//    8   16:astore_3        
		if(Util.isOnBackgroundThread())
	//*   9   17:invokestatic    #544 <Method boolean Util.isOnBackgroundThread()>
	//*  10   20:ifeq            45
		{
			glideContext.getMainHandler().post(new Runnable() {

				public void run()
				{
					if(!target.isCancelled())
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field RequestFutureTarget val$target>
				//*   2    4:invokevirtual   #32  <Method boolean RequestFutureTarget.isCancelled()>
				//*   3    7:ifne            27
					{
						RequestBuilder requestbuilder = RequestBuilder.this;
				//    4   10:aload_0         
				//    5   11:getfield        #19  <Field RequestBuilder this$0>
				//    6   14:astore_1        
						RequestFutureTarget requestfuturetarget = target;
				//    7   15:aload_0         
				//    8   16:getfield        #21  <Field RequestFutureTarget val$target>
				//    9   19:astore_2        
						requestbuilder.into(((Target) (requestfuturetarget)), ((RequestListener) (requestfuturetarget)));
				//   10   20:aload_1         
				//   11   21:aload_2         
				//   12   22:aload_2         
				//   13   23:invokevirtual   #36  <Method Target RequestBuilder.into(Target, RequestListener)>
				//   14   26:pop             
					}
				//   15   27:return          
				}

				final RequestBuilder this$0;
				final RequestFutureTarget val$target;

			
			{
				this$0 = RequestBuilder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RequestBuilder this$0>
				target = requestfuturetarget;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field RequestFutureTarget val$target>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   11   23:aload_0         
	//   12   24:getfield        #118 <Field GlideContext glideContext>
	//   13   27:invokevirtual   #538 <Method Handler GlideContext.getMainHandler()>
	//   14   30:new             #11  <Class RequestBuilder$1>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:aload_3         
	//   18   36:invokespecial   #547 <Method void RequestBuilder$1(RequestBuilder, RequestFutureTarget)>
	//   19   39:invokevirtual   #553 <Method boolean Handler.post(Runnable)>
	//   20   42:pop             
			return ((FutureTarget) (target));
	//   21   43:aload_3         
	//   22   44:areturn         
		} else
		{
			into(((Target) (target)), ((RequestListener) (target)));
	//   23   45:aload_0         
	//   24   46:aload_3         
	//   25   47:aload_3         
	//   26   48:invokevirtual   #404 <Method Target into(Target, RequestListener)>
	//   27   51:pop             
			return ((FutureTarget) (target));
	//   28   52:aload_3         
	//   29   53:areturn         
		}
	}

	public RequestBuilder thumbnail(float f)
	{
		if(f >= 0.0F && f <= 1.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            22
	//*   4    6:fload_1         
	//*   5    7:fconst_1        
	//*   6    8:fcmpl           
	//*   7    9:ifgt            22
		{
			thumbSizeMultiplier = Float.valueOf(f);
	//    8   12:aload_0         
	//    9   13:fload_1         
	//   10   14:invokestatic    #559 <Method Float Float.valueOf(float)>
	//   11   17:putfield        #200 <Field Float thumbSizeMultiplier>
			return this;
	//   12   20:aload_0         
	//   13   21:areturn         
		} else
		{
			throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
	//   14   22:new             #234 <Class IllegalArgumentException>
	//   15   25:dup             
	//   16   26:ldc2            #561 <String "sizeMultiplier must be between 0 and 1">
	//   17   29:invokespecial   #239 <Method void IllegalArgumentException(String)>
	//   18   32:athrow          
		}
	}

	public RequestBuilder thumbnail(RequestBuilder requestbuilder)
	{
		thumbnailBuilder = requestbuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #174 <Field RequestBuilder thumbnailBuilder>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient RequestBuilder thumbnail(RequestBuilder arequestbuilder[])
	{
		RequestBuilder requestbuilder = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(arequestbuilder != null && arequestbuilder.length != 0)
	//*   2    2:aload_1         
	//*   3    3:ifnull          66
	//*   4    6:aload_1         
	//*   5    7:arraylength     
	//*   6    8:ifne            14
	//*   7   11:goto            66
		{
			for(int i = arequestbuilder.length - 1; i >= 0; i--)
	//*   8   14:aload_1         
	//*   9   15:arraylength     
	//*  10   16:iconst_1        
	//*  11   17:isub            
	//*  12   18:istore_2        
	//*  13   19:iload_2         
	//*  14   20:iflt            60
			{
				RequestBuilder requestbuilder1 = arequestbuilder[i];
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:aaload          
	//   18   26:astore          4
				if(requestbuilder1 == null)
	//*  19   28:aload           4
	//*  20   30:ifnonnull       36
					continue;
	//   21   33:goto            53
				if(requestbuilder == null)
	//*  22   36:aload_3         
	//*  23   37:ifnonnull       46
					requestbuilder = requestbuilder1;
	//   24   40:aload           4
	//   25   42:astore_3        
				else
	//*  26   43:goto            53
					requestbuilder = requestbuilder1.thumbnail(requestbuilder);
	//   27   46:aload           4
	//   28   48:aload_3         
	//   29   49:invokevirtual   #565 <Method RequestBuilder thumbnail(RequestBuilder)>
	//   30   52:astore_3        
			}

	//   31   53:iload_2         
	//   32   54:iconst_1        
	//   33   55:isub            
	//   34   56:istore_2        
	//*  35   57:goto            19
			return thumbnail(requestbuilder);
	//   36   60:aload_0         
	//   37   61:aload_3         
	//   38   62:invokevirtual   #565 <Method RequestBuilder thumbnail(RequestBuilder)>
	//   39   65:areturn         
		} else
		{
			return thumbnail((RequestBuilder)null);
	//   40   66:aload_0         
	//   41   67:aconst_null     
	//   42   68:checkcast       #2   <Class RequestBuilder>
	//   43   71:invokevirtual   #565 <Method RequestBuilder thumbnail(RequestBuilder)>
	//   44   74:areturn         
		}
	}

	public RequestBuilder transition(TransitionOptions transitionoptions)
	{
		transitionOptions = (TransitionOptions)Preconditions.checkNotNull(((Object) (transitionoptions)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #260 <Method Object Preconditions.checkNotNull(Object)>
	//    3    5:checkcast       #324 <Class TransitionOptions>
	//    4    8:putfield        #108 <Field TransitionOptions transitionOptions>
		isDefaultTransitionOptionsSet = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #86  <Field boolean isDefaultTransitionOptionsSet>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	protected static final RequestOptions DOWNLOAD_ONLY_OPTIONS;
	private final Context context;
	private final RequestOptions defaultRequestOptions;
	private RequestBuilder errorBuilder;
	private final Glide glide;
	private final GlideContext glideContext;
	private boolean isDefaultTransitionOptionsSet;
	private boolean isModelSet;
	private boolean isThumbnailBuilt;
	private Object model;
	private List requestListeners;
	private final RequestManager requestManager;
	protected RequestOptions requestOptions;
	private Float thumbSizeMultiplier;
	private RequestBuilder thumbnailBuilder;
	private final Class transcodeClass;
	private TransitionOptions transitionOptions;

	static 
	{
		DOWNLOAD_ONLY_OPTIONS = (new RequestOptions()).diskCacheStrategy(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
	//    0    0:new             #52  <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void RequestOptions()>
	//    3    7:getstatic       #61  <Field DiskCacheStrategy DiskCacheStrategy.DATA>
	//    4   10:invokevirtual   #65  <Method RequestOptions RequestOptions.diskCacheStrategy(DiskCacheStrategy)>
	//    5   13:getstatic       #71  <Field Priority Priority.LOW>
	//    6   16:invokevirtual   #75  <Method RequestOptions RequestOptions.priority(Priority)>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #79  <Method RequestOptions RequestOptions.skipMemoryCache(boolean)>
	//    9   23:putstatic       #81  <Field RequestOptions DOWNLOAD_ONLY_OPTIONS>
	//*  10   26:return          
	}
}
