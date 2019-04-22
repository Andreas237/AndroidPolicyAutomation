// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.PreloadTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.signature.ApplicationVersionSignature;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.*;
import java.util.concurrent.Executor;

// Referenced classes of package com.bumptech.glide:
//			ModelTypes, Priority, RequestManager, Glide, 
//			GlideContext, TransitionOptions

public class RequestBuilder extends BaseRequestOptions
	implements ModelTypes, Cloneable
{

	protected RequestBuilder(Glide glide1, RequestManager requestmanager, Class class1, Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method void BaseRequestOptions()>
		isDefaultTransitionOptionsSet = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #85  <Field boolean isDefaultTransitionOptionsSet>
		glide = glide1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #87  <Field Glide glide>
		requestManager = requestmanager;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #89  <Field RequestManager requestManager>
		transcodeClass = class1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #91  <Field Class transcodeClass>
		context = context1;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #93  <Field Context context>
		transitionOptions = requestmanager.getDefaultTransitionOptions(class1);
	//   17   30:aload_0         
	//   18   31:aload_2         
	//   19   32:aload_3         
	//   20   33:invokevirtual   #99  <Method TransitionOptions RequestManager.getDefaultTransitionOptions(Class)>
	//   21   36:putfield        #101 <Field TransitionOptions transitionOptions>
		glideContext = glide1.getGlideContext();
	//   22   39:aload_0         
	//   23   40:aload_1         
	//   24   41:invokevirtual   #107 <Method GlideContext Glide.getGlideContext()>
	//   25   44:putfield        #109 <Field GlideContext glideContext>
		initRequestListeners(requestmanager.getDefaultRequestListeners());
	//   26   47:aload_0         
	//   27   48:aload_2         
	//   28   49:invokevirtual   #113 <Method List RequestManager.getDefaultRequestListeners()>
	//   29   52:invokespecial   #117 <Method void initRequestListeners(List)>
		apply(((BaseRequestOptions) (requestmanager.getDefaultRequestOptions())));
	//   30   55:aload_0         
	//   31   56:aload_2         
	//   32   57:invokevirtual   #121 <Method RequestOptions RequestManager.getDefaultRequestOptions()>
	//   33   60:invokevirtual   #125 <Method RequestBuilder apply(BaseRequestOptions)>
	//   34   63:pop             
	//   35   64:return          
	}

	private Request buildRequest(Target target, RequestListener requestlistener, BaseRequestOptions baserequestoptions, Executor executor)
	{
		return buildRequestRecursive(target, requestlistener, ((RequestCoordinator) (null)), transitionOptions, baserequestoptions.getPriority(), baserequestoptions.getOverrideWidth(), baserequestoptions.getOverrideHeight(), baserequestoptions, executor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_0         
	//    5    5:getfield        #101 <Field TransitionOptions transitionOptions>
	//    6    8:aload_3         
	//    7    9:invokevirtual   #135 <Method Priority BaseRequestOptions.getPriority()>
	//    8   12:aload_3         
	//    9   13:invokevirtual   #139 <Method int BaseRequestOptions.getOverrideWidth()>
	//   10   16:aload_3         
	//   11   17:invokevirtual   #142 <Method int BaseRequestOptions.getOverrideHeight()>
	//   12   20:aload_3         
	//   13   21:aload           4
	//   14   23:invokespecial   #146 <Method Request buildRequestRecursive(Target, RequestListener, RequestCoordinator, TransitionOptions, Priority, int, int, BaseRequestOptions, Executor)>
	//   15   26:areturn         
	}

	private Request buildRequestRecursive(Target target, RequestListener requestlistener, RequestCoordinator requestcoordinator, TransitionOptions transitionoptions, Priority priority, int i, int j, 
			BaseRequestOptions baserequestoptions, Executor executor)
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
	//    7   15:astore          12
			requestcoordinator = ((RequestCoordinator) (obj));
	//    8   17:aload           12
	//    9   19:astore_3        
		} else
	//*  10   20:goto            32
		{
			Object obj1 = null;
	//   11   23:aconst_null     
	//   12   24:astore          13
			obj = ((Object) (requestcoordinator));
	//   13   26:aload_3         
	//   14   27:astore          12
			requestcoordinator = ((RequestCoordinator) (obj1));
	//   15   29:aload           13
	//   16   31:astore_3        
		}
		transitionoptions = ((TransitionOptions) (buildThumbnailRequestRecursive(target, requestlistener, ((RequestCoordinator) (obj)), transitionoptions, priority, i, j, baserequestoptions, executor)));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:aload_2         
	//   20   35:aload           12
	//   21   37:aload           4
	//   22   39:aload           5
	//   23   41:iload           6
	//   24   43:iload           7
	//   25   45:aload           8
	//   26   47:aload           9
	//   27   49:invokespecial   #157 <Method Request buildThumbnailRequestRecursive(Target, RequestListener, RequestCoordinator, TransitionOptions, Priority, int, int, BaseRequestOptions, Executor)>
	//   28   52:astore          4
		if(requestcoordinator == null)
	//*  29   54:aload_3         
	//*  30   55:ifnonnull       61
			return ((Request) (transitionoptions));
	//   31   58:aload           4
	//   32   60:areturn         
		int l = errorBuilder.getOverrideWidth();
	//   33   61:aload_0         
	//   34   62:getfield        #149 <Field RequestBuilder errorBuilder>
	//   35   65:invokevirtual   #158 <Method int getOverrideWidth()>
	//   36   68:istore          11
		int k = errorBuilder.getOverrideHeight();
	//   37   70:aload_0         
	//   38   71:getfield        #149 <Field RequestBuilder errorBuilder>
	//   39   74:invokevirtual   #159 <Method int getOverrideHeight()>
	//   40   77:istore          10
		if(Util.isValidDimensions(i, j) && !errorBuilder.isValidOverride())
	//*  41   79:iload           6
	//*  42   81:iload           7
	//*  43   83:invokestatic    #165 <Method boolean Util.isValidDimensions(int, int)>
	//*  44   86:ifeq            116
	//*  45   89:aload_0         
	//*  46   90:getfield        #149 <Field RequestBuilder errorBuilder>
	//*  47   93:invokevirtual   #169 <Method boolean isValidOverride()>
	//*  48   96:ifne            116
		{
			i = baserequestoptions.getOverrideWidth();
	//   49   99:aload           8
	//   50  101:invokevirtual   #139 <Method int BaseRequestOptions.getOverrideWidth()>
	//   51  104:istore          6
			j = baserequestoptions.getOverrideHeight();
	//   52  106:aload           8
	//   53  108:invokevirtual   #142 <Method int BaseRequestOptions.getOverrideHeight()>
	//   54  111:istore          7
		} else
	//*  55  113:goto            124
		{
			i = l;
	//   56  116:iload           11
	//   57  118:istore          6
			j = k;
	//   58  120:iload           10
	//   59  122:istore          7
		}
		priority = ((Priority) (errorBuilder));
	//   60  124:aload_0         
	//   61  125:getfield        #149 <Field RequestBuilder errorBuilder>
	//   62  128:astore          5
		((ErrorRequestCoordinator) (requestcoordinator)).setRequests(((Request) (transitionoptions)), ((RequestBuilder) (priority)).buildRequestRecursive(target, requestlistener, requestcoordinator, ((RequestBuilder) (priority)).transitionOptions, ((RequestBuilder) (priority)).getPriority(), i, j, ((BaseRequestOptions) (errorBuilder)), executor));
	//   63  130:aload_3         
	//   64  131:aload           4
	//   65  133:aload           5
	//   66  135:aload_1         
	//   67  136:aload_2         
	//   68  137:aload_3         
	//   69  138:aload           5
	//   70  140:getfield        #101 <Field TransitionOptions transitionOptions>
	//   71  143:aload           5
	//   72  145:invokevirtual   #170 <Method Priority getPriority()>
	//   73  148:iload           6
	//   74  150:iload           7
	//   75  152:aload_0         
	//   76  153:getfield        #149 <Field RequestBuilder errorBuilder>
	//   77  156:aload           9
	//   78  158:invokespecial   #146 <Method Request buildRequestRecursive(Target, RequestListener, RequestCoordinator, TransitionOptions, Priority, int, int, BaseRequestOptions, Executor)>
	//   79  161:invokevirtual   #174 <Method void ErrorRequestCoordinator.setRequests(Request, Request)>
		return ((Request) (requestcoordinator));
	//   80  164:aload_3         
	//   81  165:areturn         
	}

	private Request buildThumbnailRequestRecursive(Target target, RequestListener requestlistener, RequestCoordinator requestcoordinator, TransitionOptions transitionoptions, Priority priority, int i, int j, 
			BaseRequestOptions baserequestoptions, Executor executor)
	{
		Object obj = ((Object) (thumbnailBuilder));
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field RequestBuilder thumbnailBuilder>
	//    2    4:astore          13
		if(obj != null)
	//*   3    6:aload           13
	//*   4    8:ifnull          211
			if(!isThumbnailBuilt)
	//*   5   11:aload_0         
	//*   6   12:getfield        #179 <Field boolean isThumbnailBuilt>
	//*   7   15:ifne            201
			{
				TransitionOptions transitionoptions1 = ((RequestBuilder) (obj)).transitionOptions;
	//    8   18:aload           13
	//    9   20:getfield        #101 <Field TransitionOptions transitionOptions>
	//   10   23:astore          12
				if(((RequestBuilder) (obj)).isDefaultTransitionOptionsSet)
	//*  11   25:aload           13
	//*  12   27:getfield        #85  <Field boolean isDefaultTransitionOptionsSet>
	//*  13   30:ifeq            40
					transitionoptions1 = transitionoptions;
	//   14   33:aload           4
	//   15   35:astore          12
	//*  16   37:goto            40
				if(thumbnailBuilder.isPrioritySet())
	//*  17   40:aload_0         
	//*  18   41:getfield        #177 <Field RequestBuilder thumbnailBuilder>
	//*  19   44:invokevirtual   #182 <Method boolean isPrioritySet()>
	//*  20   47:ifeq            62
					obj = ((Object) (thumbnailBuilder.getPriority()));
	//   21   50:aload_0         
	//   22   51:getfield        #177 <Field RequestBuilder thumbnailBuilder>
	//   23   54:invokevirtual   #170 <Method Priority getPriority()>
	//   24   57:astore          13
				else
	//*  25   59:goto            70
					obj = ((Object) (getThumbnailPriority(priority)));
	//   26   62:aload_0         
	//   27   63:aload           5
	//   28   65:invokespecial   #186 <Method Priority getThumbnailPriority(Priority)>
	//   29   68:astore          13
				int k = thumbnailBuilder.getOverrideWidth();
	//   30   70:aload_0         
	//   31   71:getfield        #177 <Field RequestBuilder thumbnailBuilder>
	//   32   74:invokevirtual   #158 <Method int getOverrideWidth()>
	//   33   77:istore          10
				int l = thumbnailBuilder.getOverrideHeight();
	//   34   79:aload_0         
	//   35   80:getfield        #177 <Field RequestBuilder thumbnailBuilder>
	//   36   83:invokevirtual   #159 <Method int getOverrideHeight()>
	//   37   86:istore          11
				if(Util.isValidDimensions(i, j) && !thumbnailBuilder.isValidOverride())
	//*  38   88:iload           6
	//*  39   90:iload           7
	//*  40   92:invokestatic    #165 <Method boolean Util.isValidDimensions(int, int)>
	//*  41   95:ifeq            125
	//*  42   98:aload_0         
	//*  43   99:getfield        #177 <Field RequestBuilder thumbnailBuilder>
	//*  44  102:invokevirtual   #169 <Method boolean isValidOverride()>
	//*  45  105:ifne            125
				{
					k = baserequestoptions.getOverrideWidth();
	//   46  108:aload           8
	//   47  110:invokevirtual   #139 <Method int BaseRequestOptions.getOverrideWidth()>
	//   48  113:istore          10
					l = baserequestoptions.getOverrideHeight();
	//   49  115:aload           8
	//   50  117:invokevirtual   #142 <Method int BaseRequestOptions.getOverrideHeight()>
	//   51  120:istore          11
				}
	//*  52  122:goto            125
				requestcoordinator = ((RequestCoordinator) (new ThumbnailRequestCoordinator(requestcoordinator)));
	//   53  125:new             #188 <Class ThumbnailRequestCoordinator>
	//   54  128:dup             
	//   55  129:aload_3         
	//   56  130:invokespecial   #189 <Method void ThumbnailRequestCoordinator(RequestCoordinator)>
	//   57  133:astore_3        
				transitionoptions = ((TransitionOptions) (obtainRequest(target, requestlistener, baserequestoptions, requestcoordinator, transitionoptions, priority, i, j, executor)));
	//   58  134:aload_0         
	//   59  135:aload_1         
	//   60  136:aload_2         
	//   61  137:aload           8
	//   62  139:aload_3         
	//   63  140:aload           4
	//   64  142:aload           5
	//   65  144:iload           6
	//   66  146:iload           7
	//   67  148:aload           9
	//   68  150:invokespecial   #193 <Method Request obtainRequest(Target, RequestListener, BaseRequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int, Executor)>
	//   69  153:astore          4
				isThumbnailBuilt = true;
	//   70  155:aload_0         
	//   71  156:iconst_1        
	//   72  157:putfield        #179 <Field boolean isThumbnailBuilt>
				priority = ((Priority) (thumbnailBuilder));
	//   73  160:aload_0         
	//   74  161:getfield        #177 <Field RequestBuilder thumbnailBuilder>
	//   75  164:astore          5
				target = ((Target) (((RequestBuilder) (priority)).buildRequestRecursive(target, requestlistener, requestcoordinator, transitionoptions1, ((Priority) (obj)), k, l, ((BaseRequestOptions) (priority)), executor)));
	//   76  166:aload           5
	//   77  168:aload_1         
	//   78  169:aload_2         
	//   79  170:aload_3         
	//   80  171:aload           12
	//   81  173:aload           13
	//   82  175:iload           10
	//   83  177:iload           11
	//   84  179:aload           5
	//   85  181:aload           9
	//   86  183:invokespecial   #146 <Method Request buildRequestRecursive(Target, RequestListener, RequestCoordinator, TransitionOptions, Priority, int, int, BaseRequestOptions, Executor)>
	//   87  186:astore_1        
				isThumbnailBuilt = false;
	//   88  187:aload_0         
	//   89  188:iconst_0        
	//   90  189:putfield        #179 <Field boolean isThumbnailBuilt>
				((ThumbnailRequestCoordinator) (requestcoordinator)).setRequests(((Request) (transitionoptions)), ((Request) (target)));
	//   91  192:aload_3         
	//   92  193:aload           4
	//   93  195:aload_1         
	//   94  196:invokevirtual   #194 <Method void ThumbnailRequestCoordinator.setRequests(Request, Request)>
				return ((Request) (requestcoordinator));
	//   95  199:aload_3         
	//   96  200:areturn         
			} else
			{
				throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
	//   97  201:new             #196 <Class IllegalStateException>
	//   98  204:dup             
	//   99  205:ldc1            #198 <String "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()">
	//  100  207:invokespecial   #201 <Method void IllegalStateException(String)>
	//  101  210:athrow          
			}
		if(thumbSizeMultiplier != null)
	//* 102  211:aload_0         
	//* 103  212:getfield        #203 <Field Float thumbSizeMultiplier>
	//* 104  215:ifnull          288
		{
			requestcoordinator = ((RequestCoordinator) (new ThumbnailRequestCoordinator(requestcoordinator)));
	//  105  218:new             #188 <Class ThumbnailRequestCoordinator>
	//  106  221:dup             
	//  107  222:aload_3         
	//  108  223:invokespecial   #189 <Method void ThumbnailRequestCoordinator(RequestCoordinator)>
	//  109  226:astore_3        
			((ThumbnailRequestCoordinator) (requestcoordinator)).setRequests(obtainRequest(target, requestlistener, baserequestoptions, requestcoordinator, transitionoptions, priority, i, j, executor), obtainRequest(target, requestlistener, baserequestoptions.clone().sizeMultiplier(thumbSizeMultiplier.floatValue()), requestcoordinator, transitionoptions, getThumbnailPriority(priority), i, j, executor));
	//  110  227:aload_3         
	//  111  228:aload_0         
	//  112  229:aload_1         
	//  113  230:aload_2         
	//  114  231:aload           8
	//  115  233:aload_3         
	//  116  234:aload           4
	//  117  236:aload           5
	//  118  238:iload           6
	//  119  240:iload           7
	//  120  242:aload           9
	//  121  244:invokespecial   #193 <Method Request obtainRequest(Target, RequestListener, BaseRequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int, Executor)>
	//  122  247:aload_0         
	//  123  248:aload_1         
	//  124  249:aload_2         
	//  125  250:aload           8
	//  126  252:invokevirtual   #207 <Method BaseRequestOptions BaseRequestOptions.clone()>
	//  127  255:aload_0         
	//  128  256:getfield        #203 <Field Float thumbSizeMultiplier>
	//  129  259:invokevirtual   #213 <Method float Float.floatValue()>
	//  130  262:invokevirtual   #217 <Method BaseRequestOptions BaseRequestOptions.sizeMultiplier(float)>
	//  131  265:aload_3         
	//  132  266:aload           4
	//  133  268:aload_0         
	//  134  269:aload           5
	//  135  271:invokespecial   #186 <Method Priority getThumbnailPriority(Priority)>
	//  136  274:iload           6
	//  137  276:iload           7
	//  138  278:aload           9
	//  139  280:invokespecial   #193 <Method Request obtainRequest(Target, RequestListener, BaseRequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int, Executor)>
	//  140  283:invokevirtual   #194 <Method void ThumbnailRequestCoordinator.setRequests(Request, Request)>
			return ((Request) (requestcoordinator));
	//  141  286:aload_3         
	//  142  287:areturn         
		} else
		{
			return obtainRequest(target, requestlistener, baserequestoptions, requestcoordinator, transitionoptions, priority, i, j, executor);
	//  143  288:aload_0         
	//  144  289:aload_1         
	//  145  290:aload_2         
	//  146  291:aload           8
	//  147  293:aload_3         
	//  148  294:aload           4
	//  149  296:aload           5
	//  150  298:iload           6
	//  151  300:iload           7
	//  152  302:aload           9
	//  153  304:invokespecial   #193 <Method Request obtainRequest(Target, RequestListener, BaseRequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int, Executor)>
	//  154  307:areturn         
		}
	}

	private Priority getThumbnailPriority(Priority priority)
	{
		static class _cls1
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

		switch(_cls1..SwitchMap.com.bumptech.glide.Priority[priority.ordinal()])
	//*   0    0:getstatic       #221 <Field int[] RequestBuilder$1.$SwitchMap$com$bumptech$glide$Priority>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #224 <Method int Priority.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 4: default 40
	//	               1 84
	//	               2 80
	//	               3 76
	//	               4 76
		default:
			priority = ((Priority) (new StringBuilder()));
	//    5   40:new             #226 <Class StringBuilder>
	//    6   43:dup             
	//    7   44:invokespecial   #227 <Method void StringBuilder()>
	//    8   47:astore_1        
			((StringBuilder) (priority)).append("unknown priority: ");
	//    9   48:aload_1         
	//   10   49:ldc1            #229 <String "unknown priority: ">
	//   11   51:invokevirtual   #233 <Method StringBuilder StringBuilder.append(String)>
	//   12   54:pop             
			((StringBuilder) (priority)).append(((Object) (getPriority())));
	//   13   55:aload_1         
	//   14   56:aload_0         
	//   15   57:invokevirtual   #170 <Method Priority getPriority()>
	//   16   60:invokevirtual   #236 <Method StringBuilder StringBuilder.append(Object)>
	//   17   63:pop             
			throw new IllegalArgumentException(((StringBuilder) (priority)).toString());
	//   18   64:new             #238 <Class IllegalArgumentException>
	//   19   67:dup             
	//   20   68:aload_1         
	//   21   69:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   22   72:invokespecial   #243 <Method void IllegalArgumentException(String)>
	//   23   75:athrow          

		case 3: // '\003'
		case 4: // '\004'
			return Priority.IMMEDIATE;
	//   24   76:getstatic       #246 <Field Priority Priority.IMMEDIATE>
	//   25   79:areturn         

		case 2: // '\002'
			return Priority.HIGH;
	//   26   80:getstatic       #249 <Field Priority Priority.HIGH>
	//   27   83:areturn         

		case 1: // '\001'
			return Priority.NORMAL;
	//   28   84:getstatic       #252 <Field Priority Priority.NORMAL>
	//   29   87:areturn         
		}
	}

	private void initRequestListeners(List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); addListener((RequestListener)((Iterator) (list)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #258 <Method Iterator List.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #263 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            33
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #267 <Method Object Iterator.next()>
	//    9   23:checkcast       #269 <Class RequestListener>
	//   10   26:invokevirtual   #273 <Method RequestBuilder addListener(RequestListener)>
	//   11   29:pop             
	//*  12   30:goto            7
	//   13   33:return          
	}

	private Target into(Target target, RequestListener requestlistener, BaseRequestOptions baserequestoptions, Executor executor)
	{
		Preconditions.checkNotNull(((Object) (target)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #282 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		if(isModelSet)
	//*   3    5:aload_0         
	//*   4    6:getfield        #284 <Field boolean isModelSet>
	//*   5    9:ifeq            108
		{
			requestlistener = ((RequestListener) (buildRequest(target, requestlistener, baserequestoptions, executor)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:aload           4
	//   11   18:invokespecial   #286 <Method Request buildRequest(Target, RequestListener, BaseRequestOptions, Executor)>
	//   12   21:astore_2        
			executor = ((Executor) (target.getRequest()));
	//   13   22:aload_1         
	//   14   23:invokeinterface #292 <Method Request Target.getRequest()>
	//   15   28:astore          4
			if(((Request) (requestlistener)).isEquivalentTo(((Request) (executor))) && !isSkipMemoryCacheWithCompletePreviousRequest(baserequestoptions, ((Request) (executor))))
	//*  16   30:aload_2         
	//*  17   31:aload           4
	//*  18   33:invokeinterface #298 <Method boolean Request.isEquivalentTo(Request)>
	//*  19   38:ifeq            82
	//*  20   41:aload_0         
	//*  21   42:aload_3         
	//*  22   43:aload           4
	//*  23   45:invokespecial   #302 <Method boolean isSkipMemoryCacheWithCompletePreviousRequest(BaseRequestOptions, Request)>
	//*  24   48:ifne            82
			{
				((Request) (requestlistener)).recycle();
	//   25   51:aload_2         
	//   26   52:invokeinterface #305 <Method void Request.recycle()>
				if(!((Request)Preconditions.checkNotNull(((Object) (executor)))).isRunning())
	//*  27   57:aload           4
	//*  28   59:invokestatic    #282 <Method Object Preconditions.checkNotNull(Object)>
	//*  29   62:checkcast       #294 <Class Request>
	//*  30   65:invokeinterface #308 <Method boolean Request.isRunning()>
	//*  31   70:ifne            80
					((Request) (executor)).begin();
	//   32   73:aload           4
	//   33   75:invokeinterface #311 <Method void Request.begin()>
				return target;
	//   34   80:aload_1         
	//   35   81:areturn         
			} else
			{
				requestManager.clear(target);
	//   36   82:aload_0         
	//   37   83:getfield        #89  <Field RequestManager requestManager>
	//   38   86:aload_1         
	//   39   87:invokevirtual   #315 <Method void RequestManager.clear(Target)>
				target.setRequest(((Request) (requestlistener)));
	//   40   90:aload_1         
	//   41   91:aload_2         
	//   42   92:invokeinterface #319 <Method void Target.setRequest(Request)>
				requestManager.track(target, ((Request) (requestlistener)));
	//   43   97:aload_0         
	//   44   98:getfield        #89  <Field RequestManager requestManager>
	//   45  101:aload_1         
	//   46  102:aload_2         
	//   47  103:invokevirtual   #323 <Method void RequestManager.track(Target, Request)>
				return target;
	//   48  106:aload_1         
	//   49  107:areturn         
			}
		} else
		{
			throw new IllegalArgumentException("You must call #load() before calling #into()");
	//   50  108:new             #238 <Class IllegalArgumentException>
	//   51  111:dup             
	//   52  112:ldc2            #325 <String "You must call #load() before calling #into()">
	//   53  115:invokespecial   #243 <Method void IllegalArgumentException(String)>
	//   54  118:athrow          
		}
	}

	private boolean isSkipMemoryCacheWithCompletePreviousRequest(BaseRequestOptions baserequestoptions, Request request)
	{
		return !baserequestoptions.isMemoryCacheable() && request.isComplete();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #329 <Method boolean BaseRequestOptions.isMemoryCacheable()>
	//    2    4:ifne            18
	//    3    7:aload_2         
	//    4    8:invokeinterface #332 <Method boolean Request.isComplete()>
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
	//    2    2:putfield        #337 <Field Object model>
		isModelSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #284 <Field boolean isModelSet>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	private Request obtainRequest(Target target, RequestListener requestlistener, BaseRequestOptions baserequestoptions, RequestCoordinator requestcoordinator, TransitionOptions transitionoptions, Priority priority, int i, 
			int j, Executor executor)
	{
		Context context1 = context;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Context context>
	//    2    4:astore          10
		GlideContext glidecontext = glideContext;
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field GlideContext glideContext>
	//    5   10:astore          11
		return ((Request) (SingleRequest.obtain(context1, glidecontext, model, transcodeClass, baserequestoptions, i, j, priority, target, requestlistener, requestListeners, requestcoordinator, glidecontext.getEngine(), transitionoptions.getTransitionFactory(), executor)));
	//    6   12:aload           10
	//    7   14:aload           11
	//    8   16:aload_0         
	//    9   17:getfield        #337 <Field Object model>
	//   10   20:aload_0         
	//   11   21:getfield        #91  <Field Class transcodeClass>
	//   12   24:aload_3         
	//   13   25:iload           7
	//   14   27:iload           8
	//   15   29:aload           6
	//   16   31:aload_1         
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #340 <Field List requestListeners>
	//   20   37:aload           4
	//   21   39:aload           11
	//   22   41:invokevirtual   #346 <Method com.bumptech.glide.load.engine.Engine GlideContext.getEngine()>
	//   23   44:aload           5
	//   24   46:invokevirtual   #352 <Method com.bumptech.glide.request.transition.TransitionFactory TransitionOptions.getTransitionFactory()>
	//   25   49:aload           9
	//   26   51:invokestatic    #358 <Method SingleRequest SingleRequest.obtain(Context, GlideContext, Object, Class, BaseRequestOptions, int, int, Priority, Target, RequestListener, List, RequestCoordinator, com.bumptech.glide.load.engine.Engine, com.bumptech.glide.request.transition.TransitionFactory, Executor)>
	//   27   54:areturn         
	}

	public RequestBuilder addListener(RequestListener requestlistener)
	{
		if(requestlistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(requestListeners == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #340 <Field List requestListeners>
	//*   4    8:ifnonnull       22
				requestListeners = ((List) (new ArrayList()));
	//    5   11:aload_0         
	//    6   12:new             #362 <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #363 <Method void ArrayList()>
	//    9   19:putfield        #340 <Field List requestListeners>
			requestListeners.add(((Object) (requestlistener)));
	//   10   22:aload_0         
	//   11   23:getfield        #340 <Field List requestListeners>
	//   12   26:aload_1         
	//   13   27:invokeinterface #367 <Method boolean List.add(Object)>
	//   14   32:pop             
		}
		return this;
	//   15   33:aload_0         
	//   16   34:areturn         
	}

	public RequestBuilder apply(BaseRequestOptions baserequestoptions)
	{
		Preconditions.checkNotNull(((Object) (baserequestoptions)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #282 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		return (RequestBuilder)super.apply(baserequestoptions);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #371 <Method BaseRequestOptions BaseRequestOptions.apply(BaseRequestOptions)>
	//    6   10:checkcast       #2   <Class RequestBuilder>
	//    7   13:areturn         
	}

	public volatile BaseRequestOptions apply(BaseRequestOptions baserequestoptions)
	{
		return ((BaseRequestOptions) (apply(baserequestoptions)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #125 <Method RequestBuilder apply(BaseRequestOptions)>
	//    3    5:areturn         
	}

	public RequestBuilder clone()
	{
		RequestBuilder requestbuilder = (RequestBuilder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method BaseRequestOptions BaseRequestOptions.clone()>
	//    2    4:checkcast       #2   <Class RequestBuilder>
	//    3    7:astore_1        
		requestbuilder.transitionOptions = requestbuilder.transitionOptions.clone();
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:getfield        #101 <Field TransitionOptions transitionOptions>
	//    7   13:invokevirtual   #376 <Method TransitionOptions TransitionOptions.clone()>
	//    8   16:putfield        #101 <Field TransitionOptions transitionOptions>
		return requestbuilder;
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	public volatile BaseRequestOptions clone()
	{
		return ((BaseRequestOptions) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #379 <Method RequestBuilder clone()>
	//    2    4:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #379 <Method RequestBuilder clone()>
	//    2    4:areturn         
	}

	public Target into(Target target)
	{
		return into(target, ((RequestListener) (null)), Executors.mainThreadExecutor());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #389 <Method Executor Executors.mainThreadExecutor()>
	//    4    6:invokevirtual   #392 <Method Target into(Target, RequestListener, Executor)>
	//    5    9:areturn         
	}

	Target into(Target target, RequestListener requestlistener, Executor executor)
	{
		return into(target, requestlistener, ((BaseRequestOptions) (this)), executor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:aload_3         
	//    5    5:invokespecial   #395 <Method Target into(Target, RequestListener, BaseRequestOptions, Executor)>
	//    6    8:areturn         
	}

	public ViewTarget into(ImageView imageview)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #400 <Method void Util.assertMainThread()>
		Preconditions.checkNotNull(((Object) (imageview)));
	//    1    3:aload_1         
	//    2    4:invokestatic    #282 <Method Object Preconditions.checkNotNull(Object)>
	//    3    7:pop             
		if(((BaseRequestOptions)this).isTransformationSet() || !((BaseRequestOptions)this).isTransformationAllowed() || imageview.getScaleType() == null) goto _L2; else goto _L1
	//    4    8:aload_0         
	//    5    9:invokevirtual   #403 <Method boolean BaseRequestOptions.isTransformationSet()>
	//    6   12:ifne            127
	//    7   15:aload_0         
	//    8   16:invokevirtual   #406 <Method boolean BaseRequestOptions.isTransformationAllowed()>
	//    9   19:ifeq            127
	//   10   22:aload_1         
	//   11   23:invokevirtual   #412 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//   12   26:ifnull          127
_L1:
		_cls1..SwitchMap.android.widget.ImageView.ScaleType[imageview.getScaleType().ordinal()];
	//   13   29:getstatic       #415 <Field int[] RequestBuilder$1.$SwitchMap$android$widget$ImageView$ScaleType>
	//   14   32:aload_1         
	//   15   33:invokevirtual   #412 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//   16   36:invokevirtual   #418 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   17   39:iaload          
		JVM INSTR tableswitch 1 6: default 80
	//	               1 116
	//	               2 105
	//	               3 94
	//	               4 94
	//	               5 94
	//	               6 83;
	//   18   40:tableswitch     1 6: default 80
	//	               1 116
	//	               2 105
	//	               3 94
	//	               4 94
	//	               5 94
	//	               6 83
		   goto _L2 _L3 _L4 _L5 _L5 _L5 _L6
	//*  19   80:goto            127
_L6:
		Object obj;
		obj = ((Object) (((BaseRequestOptions)this).clone().optionalCenterInside()));
	//   20   83:aload_0         
	//   21   84:invokevirtual   #207 <Method BaseRequestOptions BaseRequestOptions.clone()>
	//   22   87:invokevirtual   #421 <Method BaseRequestOptions BaseRequestOptions.optionalCenterInside()>
	//   23   90:astore_2        
		break; /* Loop/switch isn't completed */
	//   24   91:goto            129
_L5:
		obj = ((Object) (((BaseRequestOptions)this).clone().optionalFitCenter()));
	//   25   94:aload_0         
	//   26   95:invokevirtual   #207 <Method BaseRequestOptions BaseRequestOptions.clone()>
	//   27   98:invokevirtual   #424 <Method BaseRequestOptions BaseRequestOptions.optionalFitCenter()>
	//   28  101:astore_2        
		break; /* Loop/switch isn't completed */
	//   29  102:goto            129
_L4:
		obj = ((Object) (((BaseRequestOptions)this).clone().optionalCenterInside()));
	//   30  105:aload_0         
	//   31  106:invokevirtual   #207 <Method BaseRequestOptions BaseRequestOptions.clone()>
	//   32  109:invokevirtual   #421 <Method BaseRequestOptions BaseRequestOptions.optionalCenterInside()>
	//   33  112:astore_2        
		break; /* Loop/switch isn't completed */
	//   34  113:goto            129
_L3:
		obj = ((Object) (((BaseRequestOptions)this).clone().optionalCenterCrop()));
	//   35  116:aload_0         
	//   36  117:invokevirtual   #207 <Method BaseRequestOptions BaseRequestOptions.clone()>
	//   37  120:invokevirtual   #427 <Method BaseRequestOptions BaseRequestOptions.optionalCenterCrop()>
	//   38  123:astore_2        
		break; /* Loop/switch isn't completed */
	//   39  124:goto            129
_L2:
		obj = ((Object) (this));
	//   40  127:aload_0         
	//   41  128:astore_2        
		return (ViewTarget)into(((Target) (glideContext.buildImageViewTarget(imageview, transcodeClass))), ((RequestListener) (null)), ((BaseRequestOptions) (obj)), Executors.mainThreadExecutor());
	//   42  129:aload_0         
	//   43  130:aload_0         
	//   44  131:getfield        #109 <Field GlideContext glideContext>
	//   45  134:aload_1         
	//   46  135:aload_0         
	//   47  136:getfield        #91  <Field Class transcodeClass>
	//   48  139:invokevirtual   #431 <Method ViewTarget GlideContext.buildImageViewTarget(ImageView, Class)>
	//   49  142:aconst_null     
	//   50  143:aload_2         
	//   51  144:invokestatic    #389 <Method Executor Executors.mainThreadExecutor()>
	//   52  147:invokespecial   #395 <Method Target into(Target, RequestListener, BaseRequestOptions, Executor)>
	//   53  150:checkcast       #433 <Class ViewTarget>
	//   54  153:areturn         
	}

	public RequestBuilder listener(RequestListener requestlistener)
	{
		requestListeners = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #340 <Field List requestListeners>
		return addListener(requestlistener);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #273 <Method RequestBuilder addListener(RequestListener)>
	//    6   10:areturn         
	}

	public RequestBuilder load(Bitmap bitmap)
	{
		return loadGeneric(((Object) (bitmap))).apply(((BaseRequestOptions) (RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #439 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:getstatic       #442 <Field DiskCacheStrategy DiskCacheStrategy.NONE>
	//    4    8:invokestatic    #446 <Method RequestOptions RequestOptions.diskCacheStrategyOf(DiskCacheStrategy)>
	//    5   11:invokevirtual   #125 <Method RequestBuilder apply(BaseRequestOptions)>
	//    6   14:areturn         
	}

	public RequestBuilder load(Drawable drawable)
	{
		return loadGeneric(((Object) (drawable))).apply(((BaseRequestOptions) (RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #439 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:getstatic       #442 <Field DiskCacheStrategy DiskCacheStrategy.NONE>
	//    4    8:invokestatic    #446 <Method RequestOptions RequestOptions.diskCacheStrategyOf(DiskCacheStrategy)>
	//    5   11:invokevirtual   #125 <Method RequestBuilder apply(BaseRequestOptions)>
	//    6   14:areturn         
	}

	public RequestBuilder load(Uri uri)
	{
		return loadGeneric(((Object) (uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #439 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(File file)
	{
		return loadGeneric(((Object) (file)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #439 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(Integer integer)
	{
		return loadGeneric(((Object) (integer))).apply(((BaseRequestOptions) (RequestOptions.signatureOf(ApplicationVersionSignature.obtain(context)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #439 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field Context context>
	//    5    9:invokestatic    #461 <Method com.bumptech.glide.load.Key ApplicationVersionSignature.obtain(Context)>
	//    6   12:invokestatic    #465 <Method RequestOptions RequestOptions.signatureOf(com.bumptech.glide.load.Key)>
	//    7   15:invokevirtual   #125 <Method RequestBuilder apply(BaseRequestOptions)>
	//    8   18:areturn         
	}

	public RequestBuilder load(Object obj)
	{
		return loadGeneric(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #439 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(String s)
	{
		return loadGeneric(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #439 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(URL url)
	{
		return loadGeneric(((Object) (url)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #439 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(byte abyte0[])
	{
		Object obj = ((Object) (loadGeneric(((Object) (abyte0)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #439 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:astore_2        
		abyte0 = ((byte []) (obj));
	//    4    6:aload_2         
	//    5    7:astore_1        
		if(!((RequestBuilder) (obj)).isDiskCacheStrategySet())
	//*   6    8:aload_2         
	//*   7    9:invokevirtual   #476 <Method boolean isDiskCacheStrategySet()>
	//*   8   12:ifne            26
			abyte0 = ((byte []) (((RequestBuilder) (obj)).apply(((BaseRequestOptions) (RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE))))));
	//    9   15:aload_2         
	//   10   16:getstatic       #442 <Field DiskCacheStrategy DiskCacheStrategy.NONE>
	//   11   19:invokestatic    #446 <Method RequestOptions RequestOptions.diskCacheStrategyOf(DiskCacheStrategy)>
	//   12   22:invokevirtual   #125 <Method RequestBuilder apply(BaseRequestOptions)>
	//   13   25:astore_1        
		obj = ((Object) (abyte0));
	//   14   26:aload_1         
	//   15   27:astore_2        
		if(!((RequestBuilder) (abyte0)).isSkipMemoryCacheSet())
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #479 <Method boolean isSkipMemoryCacheSet()>
	//*  18   32:ifne            44
			obj = ((Object) (((RequestBuilder) (abyte0)).apply(((BaseRequestOptions) (RequestOptions.skipMemoryCacheOf(true))))));
	//   19   35:aload_1         
	//   20   36:iconst_1        
	//   21   37:invokestatic    #483 <Method RequestOptions RequestOptions.skipMemoryCacheOf(boolean)>
	//   22   40:invokevirtual   #125 <Method RequestBuilder apply(BaseRequestOptions)>
	//   23   43:astore_2        
		return ((RequestBuilder) (obj));
	//   24   44:aload_2         
	//   25   45:areturn         
	}

	public volatile Object load(Bitmap bitmap)
	{
		return ((Object) (load(bitmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #487 <Method RequestBuilder load(Bitmap)>
	//    3    5:areturn         
	}

	public volatile Object load(Drawable drawable)
	{
		return ((Object) (load(drawable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #490 <Method RequestBuilder load(Drawable)>
	//    3    5:areturn         
	}

	public volatile Object load(Uri uri)
	{
		return ((Object) (load(uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #493 <Method RequestBuilder load(Uri)>
	//    3    5:areturn         
	}

	public volatile Object load(File file)
	{
		return ((Object) (load(file)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #496 <Method RequestBuilder load(File)>
	//    3    5:areturn         
	}

	public volatile Object load(Integer integer)
	{
		return ((Object) (load(integer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #499 <Method RequestBuilder load(Integer)>
	//    3    5:areturn         
	}

	public volatile Object load(Object obj)
	{
		return ((Object) (load(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #501 <Method RequestBuilder load(Object)>
	//    3    5:areturn         
	}

	public volatile Object load(String s)
	{
		return ((Object) (load(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #504 <Method RequestBuilder load(String)>
	//    3    5:areturn         
	}

	public volatile Object load(URL url)
	{
		return ((Object) (load(url)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #507 <Method RequestBuilder load(URL)>
	//    3    5:areturn         
	}

	public volatile Object load(byte abyte0[])
	{
		return ((Object) (load(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #510 <Method RequestBuilder load(byte[])>
	//    3    5:areturn         
	}

	public Target preload()
	{
		return preload(0x80000000, 0x80000000);
	//    0    0:aload_0         
	//    1    1:ldc2            #513 <Int 0x80000000>
	//    2    4:ldc2            #513 <Int 0x80000000>
	//    3    7:invokevirtual   #516 <Method Target preload(int, int)>
	//    4   10:areturn         
	}

	public Target preload(int i, int j)
	{
		return into(((Target) (PreloadTarget.obtain(requestManager, i, j))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #89  <Field RequestManager requestManager>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #522 <Method PreloadTarget PreloadTarget.obtain(RequestManager, int, int)>
	//    6   10:invokevirtual   #524 <Method Target into(Target)>
	//    7   13:areturn         
	}

	public RequestBuilder transition(TransitionOptions transitionoptions)
	{
		transitionOptions = (TransitionOptions)Preconditions.checkNotNull(((Object) (transitionoptions)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #282 <Method Object Preconditions.checkNotNull(Object)>
	//    3    5:checkcast       #348 <Class TransitionOptions>
	//    4    8:putfield        #101 <Field TransitionOptions transitionOptions>
		isDefaultTransitionOptionsSet = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #85  <Field boolean isDefaultTransitionOptionsSet>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	protected static final RequestOptions DOWNLOAD_ONLY_OPTIONS;
	private final Context context;
	private RequestBuilder errorBuilder;
	private final Glide glide;
	private final GlideContext glideContext;
	private boolean isDefaultTransitionOptionsSet;
	private boolean isModelSet;
	private boolean isThumbnailBuilt;
	private Object model;
	private List requestListeners;
	private final RequestManager requestManager;
	private Float thumbSizeMultiplier;
	private RequestBuilder thumbnailBuilder;
	private final Class transcodeClass;
	private TransitionOptions transitionOptions;

	static 
	{
		DOWNLOAD_ONLY_OPTIONS = (RequestOptions)((RequestOptions)((RequestOptions)(new RequestOptions()).diskCacheStrategy(DiskCacheStrategy.DATA)).priority(Priority.LOW)).skipMemoryCache(true);
	//    0    0:new             #48  <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void RequestOptions()>
	//    3    7:getstatic       #57  <Field DiskCacheStrategy DiskCacheStrategy.DATA>
	//    4   10:invokevirtual   #61  <Method BaseRequestOptions RequestOptions.diskCacheStrategy(DiskCacheStrategy)>
	//    5   13:checkcast       #48  <Class RequestOptions>
	//    6   16:getstatic       #67  <Field Priority Priority.LOW>
	//    7   19:invokevirtual   #71  <Method BaseRequestOptions RequestOptions.priority(Priority)>
	//    8   22:checkcast       #48  <Class RequestOptions>
	//    9   25:iconst_1        
	//   10   26:invokevirtual   #75  <Method BaseRequestOptions RequestOptions.skipMemoryCache(boolean)>
	//   11   29:checkcast       #48  <Class RequestOptions>
	//   12   32:putstatic       #77  <Field RequestOptions DOWNLOAD_ONLY_OPTIONS>
	//*  13   35:return          
	}
}
