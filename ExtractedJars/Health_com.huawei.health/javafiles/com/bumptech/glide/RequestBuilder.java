// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.net.Uri;
import android.os.Handler;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
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
import com.bumptech.glide.signature.ApplicationVersionSignature;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.UUID;

// Referenced classes of package com.bumptech.glide:
//			Priority, Glide, RequestManager, GlideContext, 
//			TransitionOptions

public class RequestBuilder
	implements Cloneable
{

	protected RequestBuilder(Glide glide1, RequestManager requestmanager, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void Object()>
		isDefaultTransitionOptionsSet = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #81  <Field boolean isDefaultTransitionOptionsSet>
		glide = glide1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #83  <Field Glide glide>
		requestManager = requestmanager;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #85  <Field RequestManager requestManager>
		context = glide1.getGlideContext();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #91  <Method GlideContext Glide.getGlideContext()>
	//   14   24:putfield        #93  <Field GlideContext context>
		transcodeClass = class1;
	//   15   27:aload_0         
	//   16   28:aload_3         
	//   17   29:putfield        #95  <Field Class transcodeClass>
		defaultRequestOptions = requestmanager.getDefaultRequestOptions();
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #101 <Method RequestOptions RequestManager.getDefaultRequestOptions()>
	//   21   37:putfield        #103 <Field RequestOptions defaultRequestOptions>
		transitionOptions = requestmanager.getDefaultTransitionOptions(class1);
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:aload_3         
	//   25   43:invokevirtual   #107 <Method TransitionOptions RequestManager.getDefaultTransitionOptions(Class)>
	//   26   46:putfield        #109 <Field TransitionOptions transitionOptions>
		requestOptions = defaultRequestOptions;
	//   27   49:aload_0         
	//   28   50:aload_0         
	//   29   51:getfield        #103 <Field RequestOptions defaultRequestOptions>
	//   30   54:putfield        #111 <Field RequestOptions requestOptions>
	//   31   57:return          
	}

	protected RequestBuilder(Class class1, RequestBuilder requestbuilder)
	{
		this(requestbuilder.glide, requestbuilder.requestManager, class1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:getfield        #83  <Field Glide glide>
	//    3    5:aload_2         
	//    4    6:getfield        #85  <Field RequestManager requestManager>
	//    5    9:aload_1         
	//    6   10:invokespecial   #116 <Method void RequestBuilder(Glide, RequestManager, Class)>
		model = requestbuilder.model;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:getfield        #118 <Field Object model>
	//   10   18:putfield        #118 <Field Object model>
		isModelSet = requestbuilder.isModelSet;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:getfield        #120 <Field boolean isModelSet>
	//   14   26:putfield        #120 <Field boolean isModelSet>
		requestOptions = requestbuilder.requestOptions;
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:getfield        #111 <Field RequestOptions requestOptions>
	//   18   34:putfield        #111 <Field RequestOptions requestOptions>
	//   19   37:return          
	}

	private Request buildRequest(Target target)
	{
		return buildRequestRecursive(target, ((ThumbnailRequestCoordinator) (null)), transitionOptions, requestOptions.getPriority(), requestOptions.getOverrideWidth(), requestOptions.getOverrideHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_0         
	//    4    4:getfield        #109 <Field TransitionOptions transitionOptions>
	//    5    7:aload_0         
	//    6    8:getfield        #111 <Field RequestOptions requestOptions>
	//    7   11:invokevirtual   #127 <Method Priority RequestOptions.getPriority()>
	//    8   14:aload_0         
	//    9   15:getfield        #111 <Field RequestOptions requestOptions>
	//   10   18:invokevirtual   #131 <Method int RequestOptions.getOverrideWidth()>
	//   11   21:aload_0         
	//   12   22:getfield        #111 <Field RequestOptions requestOptions>
	//   13   25:invokevirtual   #134 <Method int RequestOptions.getOverrideHeight()>
	//   14   28:invokespecial   #138 <Method Request buildRequestRecursive(Target, ThumbnailRequestCoordinator, TransitionOptions, Priority, int, int)>
	//   15   31:areturn         
	}

	private Request buildRequestRecursive(Target target, ThumbnailRequestCoordinator thumbnailrequestcoordinator, TransitionOptions transitionoptions, Priority priority, int i, int j)
	{
		if(thumbnailBuilder != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field RequestBuilder thumbnailBuilder>
	//*   2    4:ifnull          226
		{
			if(isThumbnailBuilt)
	//*   3    7:aload_0         
	//*   4    8:getfield        #143 <Field boolean isThumbnailBuilt>
	//*   5   11:ifeq            24
				throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
	//    6   14:new             #145 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc1            #147 <String "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()">
	//    9   20:invokespecial   #150 <Method void IllegalStateException(String)>
	//   10   23:athrow          
			TransitionOptions transitionoptions1 = thumbnailBuilder.transitionOptions;
	//   11   24:aload_0         
	//   12   25:getfield        #141 <Field RequestBuilder thumbnailBuilder>
	//   13   28:getfield        #109 <Field TransitionOptions transitionOptions>
	//   14   31:astore          11
			if(thumbnailBuilder.isDefaultTransitionOptionsSet)
	//*  15   33:aload_0         
	//*  16   34:getfield        #141 <Field RequestBuilder thumbnailBuilder>
	//*  17   37:getfield        #81  <Field boolean isDefaultTransitionOptionsSet>
	//*  18   40:ifeq            46
				transitionoptions1 = transitionoptions;
	//   19   43:aload_3         
	//   20   44:astore          11
			Priority priority1;
			if(thumbnailBuilder.requestOptions.isPrioritySet())
	//*  21   46:aload_0         
	//*  22   47:getfield        #141 <Field RequestBuilder thumbnailBuilder>
	//*  23   50:getfield        #111 <Field RequestOptions requestOptions>
	//*  24   53:invokevirtual   #154 <Method boolean RequestOptions.isPrioritySet()>
	//*  25   56:ifeq            74
				priority1 = thumbnailBuilder.requestOptions.getPriority();
	//   26   59:aload_0         
	//   27   60:getfield        #141 <Field RequestBuilder thumbnailBuilder>
	//   28   63:getfield        #111 <Field RequestOptions requestOptions>
	//   29   66:invokevirtual   #127 <Method Priority RequestOptions.getPriority()>
	//   30   69:astore          12
			else
	//*  31   71:goto            82
				priority1 = getThumbnailPriority(priority);
	//   32   74:aload_0         
	//   33   75:aload           4
	//   34   77:invokespecial   #158 <Method Priority getThumbnailPriority(Priority)>
	//   35   80:astore          12
			int i1 = thumbnailBuilder.requestOptions.getOverrideWidth();
	//   36   82:aload_0         
	//   37   83:getfield        #141 <Field RequestBuilder thumbnailBuilder>
	//   38   86:getfield        #111 <Field RequestOptions requestOptions>
	//   39   89:invokevirtual   #131 <Method int RequestOptions.getOverrideWidth()>
	//   40   92:istore          9
			int j1 = thumbnailBuilder.requestOptions.getOverrideHeight();
	//   41   94:aload_0         
	//   42   95:getfield        #141 <Field RequestBuilder thumbnailBuilder>
	//   43   98:getfield        #111 <Field RequestOptions requestOptions>
	//   44  101:invokevirtual   #134 <Method int RequestOptions.getOverrideHeight()>
	//   45  104:istore          10
			int l = i1;
	//   46  106:iload           9
	//   47  108:istore          8
			int k = j1;
	//   48  110:iload           10
	//   49  112:istore          7
			if(Util.isValidDimensions(i, j))
	//*  50  114:iload           5
	//*  51  116:iload           6
	//*  52  118:invokestatic    #164 <Method boolean Util.isValidDimensions(int, int)>
	//*  53  121:ifeq            163
			{
				l = i1;
	//   54  124:iload           9
	//   55  126:istore          8
				k = j1;
	//   56  128:iload           10
	//   57  130:istore          7
				if(!thumbnailBuilder.requestOptions.isValidOverride())
	//*  58  132:aload_0         
	//*  59  133:getfield        #141 <Field RequestBuilder thumbnailBuilder>
	//*  60  136:getfield        #111 <Field RequestOptions requestOptions>
	//*  61  139:invokevirtual   #167 <Method boolean RequestOptions.isValidOverride()>
	//*  62  142:ifne            163
				{
					l = requestOptions.getOverrideWidth();
	//   63  145:aload_0         
	//   64  146:getfield        #111 <Field RequestOptions requestOptions>
	//   65  149:invokevirtual   #131 <Method int RequestOptions.getOverrideWidth()>
	//   66  152:istore          8
					k = requestOptions.getOverrideHeight();
	//   67  154:aload_0         
	//   68  155:getfield        #111 <Field RequestOptions requestOptions>
	//   69  158:invokevirtual   #134 <Method int RequestOptions.getOverrideHeight()>
	//   70  161:istore          7
				}
			}
			thumbnailrequestcoordinator = new ThumbnailRequestCoordinator(((RequestCoordinator) (thumbnailrequestcoordinator)));
	//   71  163:new             #169 <Class ThumbnailRequestCoordinator>
	//   72  166:dup             
	//   73  167:aload_2         
	//   74  168:invokespecial   #172 <Method void ThumbnailRequestCoordinator(RequestCoordinator)>
	//   75  171:astore_2        
			transitionoptions = ((TransitionOptions) (obtainRequest(target, requestOptions, ((RequestCoordinator) (thumbnailrequestcoordinator)), transitionoptions, priority, i, j)));
	//   76  172:aload_0         
	//   77  173:aload_1         
	//   78  174:aload_0         
	//   79  175:getfield        #111 <Field RequestOptions requestOptions>
	//   80  178:aload_2         
	//   81  179:aload_3         
	//   82  180:aload           4
	//   83  182:iload           5
	//   84  184:iload           6
	//   85  186:invokespecial   #176 <Method Request obtainRequest(Target, RequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int)>
	//   86  189:astore_3        
			isThumbnailBuilt = true;
	//   87  190:aload_0         
	//   88  191:iconst_1        
	//   89  192:putfield        #143 <Field boolean isThumbnailBuilt>
			target = ((Target) (thumbnailBuilder.buildRequestRecursive(target, thumbnailrequestcoordinator, transitionoptions1, priority1, l, k)));
	//   90  195:aload_0         
	//   91  196:getfield        #141 <Field RequestBuilder thumbnailBuilder>
	//   92  199:aload_1         
	//   93  200:aload_2         
	//   94  201:aload           11
	//   95  203:aload           12
	//   96  205:iload           8
	//   97  207:iload           7
	//   98  209:invokespecial   #138 <Method Request buildRequestRecursive(Target, ThumbnailRequestCoordinator, TransitionOptions, Priority, int, int)>
	//   99  212:astore_1        
			isThumbnailBuilt = false;
	//  100  213:aload_0         
	//  101  214:iconst_0        
	//  102  215:putfield        #143 <Field boolean isThumbnailBuilt>
			thumbnailrequestcoordinator.setRequests(((Request) (transitionoptions)), ((Request) (target)));
	//  103  218:aload_2         
	//  104  219:aload_3         
	//  105  220:aload_1         
	//  106  221:invokevirtual   #180 <Method void ThumbnailRequestCoordinator.setRequests(Request, Request)>
			return ((Request) (thumbnailrequestcoordinator));
	//  107  224:aload_2         
	//  108  225:areturn         
		}
		if(thumbSizeMultiplier != null)
	//* 109  226:aload_0         
	//* 110  227:getfield        #182 <Field Float thumbSizeMultiplier>
	//* 111  230:ifnull          299
		{
			thumbnailrequestcoordinator = new ThumbnailRequestCoordinator(((RequestCoordinator) (thumbnailrequestcoordinator)));
	//  112  233:new             #169 <Class ThumbnailRequestCoordinator>
	//  113  236:dup             
	//  114  237:aload_2         
	//  115  238:invokespecial   #172 <Method void ThumbnailRequestCoordinator(RequestCoordinator)>
	//  116  241:astore_2        
			thumbnailrequestcoordinator.setRequests(obtainRequest(target, requestOptions, ((RequestCoordinator) (thumbnailrequestcoordinator)), transitionoptions, priority, i, j), obtainRequest(target, requestOptions.clone().sizeMultiplier(thumbSizeMultiplier.floatValue()), ((RequestCoordinator) (thumbnailrequestcoordinator)), transitionoptions, getThumbnailPriority(priority), i, j));
	//  117  242:aload_2         
	//  118  243:aload_0         
	//  119  244:aload_1         
	//  120  245:aload_0         
	//  121  246:getfield        #111 <Field RequestOptions requestOptions>
	//  122  249:aload_2         
	//  123  250:aload_3         
	//  124  251:aload           4
	//  125  253:iload           5
	//  126  255:iload           6
	//  127  257:invokespecial   #176 <Method Request obtainRequest(Target, RequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int)>
	//  128  260:aload_0         
	//  129  261:aload_1         
	//  130  262:aload_0         
	//  131  263:getfield        #111 <Field RequestOptions requestOptions>
	//  132  266:invokevirtual   #185 <Method RequestOptions RequestOptions.clone()>
	//  133  269:aload_0         
	//  134  270:getfield        #182 <Field Float thumbSizeMultiplier>
	//  135  273:invokevirtual   #191 <Method float Float.floatValue()>
	//  136  276:invokevirtual   #195 <Method RequestOptions RequestOptions.sizeMultiplier(float)>
	//  137  279:aload_2         
	//  138  280:aload_3         
	//  139  281:aload_0         
	//  140  282:aload           4
	//  141  284:invokespecial   #158 <Method Priority getThumbnailPriority(Priority)>
	//  142  287:iload           5
	//  143  289:iload           6
	//  144  291:invokespecial   #176 <Method Request obtainRequest(Target, RequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int)>
	//  145  294:invokevirtual   #180 <Method void ThumbnailRequestCoordinator.setRequests(Request, Request)>
			return ((Request) (thumbnailrequestcoordinator));
	//  146  297:aload_2         
	//  147  298:areturn         
		} else
		{
			return obtainRequest(target, requestOptions, ((RequestCoordinator) (thumbnailrequestcoordinator)), transitionoptions, priority, i, j);
	//  148  299:aload_0         
	//  149  300:aload_1         
	//  150  301:aload_0         
	//  151  302:getfield        #111 <Field RequestOptions requestOptions>
	//  152  305:aload_2         
	//  153  306:aload_3         
	//  154  307:aload           4
	//  155  309:iload           5
	//  156  311:iload           6
	//  157  313:invokespecial   #176 <Method Request obtainRequest(Target, RequestOptions, RequestCoordinator, TransitionOptions, Priority, int, int)>
	//  158  316:areturn         
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
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$Priority[Priority.NORMAL.ordinal()] = 2;
			//   11   24:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
			//   12   27:getstatic       #32  <Field Priority Priority.NORMAL>
			//   13   30:invokevirtual   #29  <Method int Priority.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
				}
			//*  16   35:goto            39
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   38:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$Priority[Priority.HIGH.ordinal()] = 3;
			//   18   39:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
			//   19   42:getstatic       #35  <Field Priority Priority.HIGH>
			//   20   45:invokevirtual   #29  <Method int Priority.ordinal()>
			//   21   48:iconst_3        
			//   22   49:iastore         
				}
			//*  23   50:goto            54
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   53:astore_0        
				try
				{
					$SwitchMap$com$bumptech$glide$Priority[Priority.IMMEDIATE.ordinal()] = 4;
			//   25   54:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
			//   26   57:getstatic       #38  <Field Priority Priority.IMMEDIATE>
			//   27   60:invokevirtual   #29  <Method int Priority.ordinal()>
			//   28   63:iconst_4        
			//   29   64:iastore         
				}
			//*  30   65:goto            69
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   68:astore_0        
				$SwitchMap$android$widget$ImageView$ScaleType = new int[android.widget.ImageView.ScaleType.values().length];
			//   32   69:invokestatic    #43  <Method android.widget.ImageView$ScaleType[] android.widget.ImageView$ScaleType.values()>
			//   33   72:arraylength     
			//   34   73:newarray        int[]
			//   35   75:putstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
			//   36   78:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//   37   81:getstatic       #49  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
			//   38   84:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//   39   87:iconst_1        
			//   40   88:iastore         
				}
			//*  41   89:goto            93
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   42   92:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
			//   43   93:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//   44   96:getstatic       #53  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
			//   45   99:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//   46  102:iconst_2        
			//   47  103:iastore         
				}
			//*  48  104:goto            108
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   49  107:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
			//   50  108:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//   51  111:getstatic       #56  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
			//   52  114:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//   53  117:iconst_3        
			//   54  118:iastore         
				}
			//*  55  119:goto            123
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   56  122:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 4;
			//   57  123:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//   58  126:getstatic       #59  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_START>
			//   59  129:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//   60  132:iconst_4        
			//   61  133:iastore         
				}
			//*  62  134:goto            138
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   63  137:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 5;
			//   64  138:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//   65  141:getstatic       #62  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_END>
			//   66  144:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//   67  147:iconst_5        
			//   68  148:iastore         
				}
			//*  69  149:goto            153
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   70  152:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 6;
			//   71  153:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//   72  156:getstatic       #65  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
			//   73  159:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//   74  162:bipush          6
			//   75  164:iastore         
				}
			//*  76  165:goto            169
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   77  168:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 7;
			//   78  169:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//   79  172:getstatic       #68  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER>
			//   80  175:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//   81  178:bipush          7
			//   82  180:iastore         
				}
			//*  83  181:goto            185
				catch(NoSuchFieldError nosuchfielderror10) { }
			//   84  184:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.MATRIX.ordinal()] = 8;
			//   85  185:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//   86  188:getstatic       #71  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
			//   87  191:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//   88  194:bipush          8
			//   89  196:iastore         
			//   90  197:return          
				}
				catch(NoSuchFieldError nosuchfielderror11) { }
			//   91  198:astore_0        
			//*  92  199:return          
			}
		}

		switch(_cls2..SwitchMap.com.bumptech.glide.Priority[priority.ordinal()])
	//*   0    0:getstatic       #201 <Field int[] RequestBuilder$2.$SwitchMap$com$bumptech$glide$Priority>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #204 <Method int Priority.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 4: default 40
	//	               1 43
	//	               2 47
	//	               3 51
	//	               4 51
	//*   5   40:goto            55
		case 1: // '\001'
			return Priority.NORMAL;
	//    6   43:getstatic       #207 <Field Priority Priority.NORMAL>
	//    7   46:areturn         

		case 2: // '\002'
			return Priority.HIGH;
	//    8   47:getstatic       #210 <Field Priority Priority.HIGH>
	//    9   50:areturn         

		case 3: // '\003'
		case 4: // '\004'
			return Priority.IMMEDIATE;
	//   10   51:getstatic       #213 <Field Priority Priority.IMMEDIATE>
	//   11   54:areturn         
		}
		throw new IllegalArgumentException((new StringBuilder()).append("unknown priority: ").append(((Object) (requestOptions.getPriority()))).toString());
	//   12   55:new             #215 <Class IllegalArgumentException>
	//   13   58:dup             
	//   14   59:new             #217 <Class StringBuilder>
	//   15   62:dup             
	//   16   63:invokespecial   #218 <Method void StringBuilder()>
	//   17   66:ldc1            #220 <String "unknown priority: ">
	//   18   68:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   19   71:aload_0         
	//   20   72:getfield        #111 <Field RequestOptions requestOptions>
	//   21   75:invokevirtual   #127 <Method Priority RequestOptions.getPriority()>
	//   22   78:invokevirtual   #227 <Method StringBuilder StringBuilder.append(Object)>
	//   23   81:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   24   84:invokespecial   #232 <Method void IllegalArgumentException(String)>
	//   25   87:athrow          
	}

	private RequestBuilder loadGeneric(Object obj)
	{
		model = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field Object model>
		isModelSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #120 <Field boolean isModelSet>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	private Request obtainRequest(Target target, RequestOptions requestoptions, RequestCoordinator requestcoordinator, TransitionOptions transitionoptions, Priority priority, int i, int j)
	{
		requestoptions.lock();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #238 <Method RequestOptions RequestOptions.lock()>
	//    2    4:pop             
		return ((Request) (SingleRequest.obtain(context, model, transcodeClass, requestoptions, i, j, priority, target, requestListener, requestcoordinator, context.getEngine(), transitionoptions.getTransitionFactory())));
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field GlideContext context>
	//    5    9:aload_0         
	//    6   10:getfield        #118 <Field Object model>
	//    7   13:aload_0         
	//    8   14:getfield        #95  <Field Class transcodeClass>
	//    9   17:aload_2         
	//   10   18:iload           6
	//   11   20:iload           7
	//   12   22:aload           5
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #240 <Field RequestListener requestListener>
	//   16   29:aload_3         
	//   17   30:aload_0         
	//   18   31:getfield        #93  <Field GlideContext context>
	//   19   34:invokevirtual   #246 <Method com.bumptech.glide.load.engine.Engine GlideContext.getEngine()>
	//   20   37:aload           4
	//   21   39:invokevirtual   #252 <Method com.bumptech.glide.request.transition.TransitionFactory TransitionOptions.getTransitionFactory()>
	//   22   42:invokestatic    #258 <Method SingleRequest SingleRequest.obtain(GlideContext, Object, Class, RequestOptions, int, int, Priority, Target, RequestListener, RequestCoordinator, com.bumptech.glide.load.engine.Engine, com.bumptech.glide.request.transition.TransitionFactory)>
	//   23   45:areturn         
	}

	public RequestBuilder apply(RequestOptions requestoptions)
	{
		Preconditions.checkNotNull(((Object) (requestoptions)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #267 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		requestOptions = getMutableOptions().apply(requestoptions);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #270 <Method RequestOptions getMutableOptions()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #273 <Method RequestOptions RequestOptions.apply(RequestOptions)>
	//    8   14:putfield        #111 <Field RequestOptions requestOptions>
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
	//    1    1:invokespecial   #280 <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class RequestBuilder>
	//    3    7:astore_1        
			requestbuilder.requestOptions = requestbuilder.requestOptions.clone();
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:getfield        #111 <Field RequestOptions requestOptions>
	//    7   13:invokevirtual   #185 <Method RequestOptions RequestOptions.clone()>
	//    8   16:putfield        #111 <Field RequestOptions requestOptions>
			requestbuilder.transitionOptions = requestbuilder.transitionOptions.clone();
	//    9   19:aload_1         
	//   10   20:aload_1         
	//   11   21:getfield        #109 <Field TransitionOptions transitionOptions>
	//   12   24:invokevirtual   #283 <Method TransitionOptions TransitionOptions.clone()>
	//   13   27:putfield        #109 <Field TransitionOptions transitionOptions>
		}
	//*  14   30:aload_1         
	//*  15   31:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  16   32:astore_1        
		{
			throw new RuntimeException(((Throwable) (clonenotsupportedexception)));
	//   17   33:new             #285 <Class RuntimeException>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokespecial   #288 <Method void RuntimeException(Throwable)>
	//   21   41:athrow          
		}
		return requestbuilder;
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #291 <Method RequestBuilder clone()>
	//    2    4:areturn         
	}

	public FutureTarget downloadOnly(int i, int j)
	{
		return getDownloadOnlyRequest().submit(i, j);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method RequestBuilder getDownloadOnlyRequest()>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #301 <Method FutureTarget submit(int, int)>
	//    5    9:areturn         
	}

	public Target downloadOnly(Target target)
	{
		return getDownloadOnlyRequest().into(target);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method RequestBuilder getDownloadOnlyRequest()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #307 <Method Target into(Target)>
	//    4    8:areturn         
	}

	protected RequestBuilder getDownloadOnlyRequest()
	{
		return (new RequestBuilder(java/io/File, this)).apply(DOWNLOAD_ONLY_OPTIONS);
	//    0    0:new             #2   <Class RequestBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #310 <Class File>
	//    3    7:aload_0         
	//    4    8:invokespecial   #312 <Method void RequestBuilder(Class, RequestBuilder)>
	//    5   11:getstatic       #76  <Field RequestOptions DOWNLOAD_ONLY_OPTIONS>
	//    6   14:invokevirtual   #314 <Method RequestBuilder apply(RequestOptions)>
	//    7   17:areturn         
	}

	protected RequestOptions getMutableOptions()
	{
		if(defaultRequestOptions == requestOptions)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field RequestOptions defaultRequestOptions>
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field RequestOptions requestOptions>
	//*   4    8:if_acmpne       19
			return requestOptions.clone();
	//    5   11:aload_0         
	//    6   12:getfield        #111 <Field RequestOptions requestOptions>
	//    7   15:invokevirtual   #185 <Method RequestOptions RequestOptions.clone()>
	//    8   18:areturn         
		else
			return requestOptions;
	//    9   19:aload_0         
	//   10   20:getfield        #111 <Field RequestOptions requestOptions>
	//   11   23:areturn         
	}

	public FutureTarget into(int i, int j)
	{
		return submit(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #301 <Method FutureTarget submit(int, int)>
	//    4    6:areturn         
	}

	public Target into(ImageView imageview)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #320 <Method void Util.assertMainThread()>
		Preconditions.checkNotNull(((Object) (imageview)));
	//    1    3:aload_1         
	//    2    4:invokestatic    #267 <Method Object Preconditions.checkNotNull(Object)>
	//    3    7:pop             
		if(!requestOptions.isTransformationSet() && requestOptions.isTransformationAllowed() && imageview.getScaleType() != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #111 <Field RequestOptions requestOptions>
	//*   6   12:invokevirtual   #323 <Method boolean RequestOptions.isTransformationSet()>
	//*   7   15:ifne            156
	//*   8   18:aload_0         
	//*   9   19:getfield        #111 <Field RequestOptions requestOptions>
	//*  10   22:invokevirtual   #326 <Method boolean RequestOptions.isTransformationAllowed()>
	//*  11   25:ifeq            156
	//*  12   28:aload_1         
	//*  13   29:invokevirtual   #332 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  14   32:ifnull          156
		{
			if(requestOptions.isLocked())
	//*  15   35:aload_0         
	//*  16   36:getfield        #111 <Field RequestOptions requestOptions>
	//*  17   39:invokevirtual   #335 <Method boolean RequestOptions.isLocked()>
	//*  18   42:ifeq            56
				requestOptions = requestOptions.clone();
	//   19   45:aload_0         
	//   20   46:aload_0         
	//   21   47:getfield        #111 <Field RequestOptions requestOptions>
	//   22   50:invokevirtual   #185 <Method RequestOptions RequestOptions.clone()>
	//   23   53:putfield        #111 <Field RequestOptions requestOptions>
			switch(_cls2..SwitchMap.android.widget.ImageView.ScaleType[imageview.getScaleType().ordinal()])
	//*  24   56:getstatic       #338 <Field int[] RequestBuilder$2.$SwitchMap$android$widget$ImageView$ScaleType>
	//*  25   59:aload_1         
	//*  26   60:invokevirtual   #332 <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//*  27   63:invokevirtual   #341 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  28   66:iaload          
			{
	//*  29   67:tableswitch     1 8: default 112
	//	               1 115
	//	               2 126
	//	               3 137
	//	               4 137
	//	               5 137
	//	               6 148
	//	               7 156
	//	               8 156
	//*  30  112:goto            156
			case 1: // '\001'
				requestOptions.optionalCenterCrop();
	//   31  115:aload_0         
	//   32  116:getfield        #111 <Field RequestOptions requestOptions>
	//   33  119:invokevirtual   #344 <Method RequestOptions RequestOptions.optionalCenterCrop()>
	//   34  122:pop             
				break;

	//*  35  123:goto            156
			case 2: // '\002'
				requestOptions.optionalCenterInside();
	//   36  126:aload_0         
	//   37  127:getfield        #111 <Field RequestOptions requestOptions>
	//   38  130:invokevirtual   #347 <Method RequestOptions RequestOptions.optionalCenterInside()>
	//   39  133:pop             
				break;

	//*  40  134:goto            156
			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				requestOptions.optionalFitCenter();
	//   41  137:aload_0         
	//   42  138:getfield        #111 <Field RequestOptions requestOptions>
	//   43  141:invokevirtual   #350 <Method RequestOptions RequestOptions.optionalFitCenter()>
	//   44  144:pop             
				break;

	//*  45  145:goto            156
			case 6: // '\006'
				requestOptions.optionalCenterInside();
	//   46  148:aload_0         
	//   47  149:getfield        #111 <Field RequestOptions requestOptions>
	//   48  152:invokevirtual   #347 <Method RequestOptions RequestOptions.optionalCenterInside()>
	//   49  155:pop             
				break;
			}
		}
		return into(context.buildImageViewTarget(imageview, transcodeClass));
	//   50  156:aload_0         
	//   51  157:aload_0         
	//   52  158:getfield        #93  <Field GlideContext context>
	//   53  161:aload_1         
	//   54  162:aload_0         
	//   55  163:getfield        #95  <Field Class transcodeClass>
	//   56  166:invokevirtual   #354 <Method Target GlideContext.buildImageViewTarget(ImageView, Class)>
	//   57  169:invokevirtual   #307 <Method Target into(Target)>
	//   58  172:areturn         
	}

	public Target into(Target target)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #320 <Method void Util.assertMainThread()>
		Preconditions.checkNotNull(((Object) (target)));
	//    1    3:aload_1         
	//    2    4:invokestatic    #267 <Method Object Preconditions.checkNotNull(Object)>
	//    3    7:pop             
		if(!isModelSet)
	//*   4    8:aload_0         
	//*   5    9:getfield        #120 <Field boolean isModelSet>
	//*   6   12:ifne            26
			throw new IllegalArgumentException("You must call #load() before calling #into()");
	//    7   15:new             #215 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc2            #357 <String "You must call #load() before calling #into()">
	//   10   22:invokespecial   #232 <Method void IllegalArgumentException(String)>
	//   11   25:athrow          
		requestOptions.lock();
	//   12   26:aload_0         
	//   13   27:getfield        #111 <Field RequestOptions requestOptions>
	//   14   30:invokevirtual   #238 <Method RequestOptions RequestOptions.lock()>
	//   15   33:pop             
		Request request = buildRequest(target);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokespecial   #359 <Method Request buildRequest(Target)>
	//   19   39:astore_2        
		Request request1 = target.getRequest();
	//   20   40:aload_1         
	//   21   41:invokeinterface #365 <Method Request Target.getRequest()>
	//   22   46:astore_3        
		if(request.isEquivalentTo(request1) && (((Request)Preconditions.checkNotNull(((Object) (request1)))).isComplete() || ((Request)Preconditions.checkNotNull(((Object) (request1)))).isRunning()))
	//*  23   47:aload_2         
	//*  24   48:aload_3         
	//*  25   49:invokeinterface #371 <Method boolean Request.isEquivalentTo(Request)>
	//*  26   54:ifeq            116
	//*  27   57:aload_3         
	//*  28   58:invokestatic    #267 <Method Object Preconditions.checkNotNull(Object)>
	//*  29   61:checkcast       #367 <Class Request>
	//*  30   64:invokeinterface #374 <Method boolean Request.isComplete()>
	//*  31   69:ifne            87
	//*  32   72:aload_3         
	//*  33   73:invokestatic    #267 <Method Object Preconditions.checkNotNull(Object)>
	//*  34   76:checkcast       #367 <Class Request>
	//*  35   79:invokeinterface #377 <Method boolean Request.isRunning()>
	//*  36   84:ifeq            116
		{
			request.recycle();
	//   37   87:aload_2         
	//   38   88:invokeinterface #380 <Method void Request.recycle()>
			if(!((Request)Preconditions.checkNotNull(((Object) (request1)))).isRunning())
	//*  39   93:aload_3         
	//*  40   94:invokestatic    #267 <Method Object Preconditions.checkNotNull(Object)>
	//*  41   97:checkcast       #367 <Class Request>
	//*  42  100:invokeinterface #377 <Method boolean Request.isRunning()>
	//*  43  105:ifne            114
				request1.begin();
	//   44  108:aload_3         
	//   45  109:invokeinterface #383 <Method void Request.begin()>
			return target;
	//   46  114:aload_1         
	//   47  115:areturn         
		} else
		{
			requestManager.clear(target);
	//   48  116:aload_0         
	//   49  117:getfield        #85  <Field RequestManager requestManager>
	//   50  120:aload_1         
	//   51  121:invokevirtual   #387 <Method void RequestManager.clear(Target)>
			target.setRequest(request);
	//   52  124:aload_1         
	//   53  125:aload_2         
	//   54  126:invokeinterface #391 <Method void Target.setRequest(Request)>
			requestManager.track(target, request);
	//   55  131:aload_0         
	//   56  132:getfield        #85  <Field RequestManager requestManager>
	//   57  135:aload_1         
	//   58  136:aload_2         
	//   59  137:invokevirtual   #395 <Method void RequestManager.track(Target, Request)>
			return target;
	//   60  140:aload_1         
	//   61  141:areturn         
		}
	}

	public RequestBuilder listener(RequestListener requestlistener)
	{
		requestListener = requestlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #240 <Field RequestListener requestListener>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RequestBuilder load(Uri uri)
	{
		return loadGeneric(((Object) (uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #403 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(File file)
	{
		return loadGeneric(((Object) (file)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #403 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(Integer integer)
	{
		return loadGeneric(((Object) (integer))).apply(RequestOptions.signatureOf(ApplicationVersionSignature.obtain(((android.content.Context) (context)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #403 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field GlideContext context>
	//    5    9:invokestatic    #412 <Method com.bumptech.glide.load.Key ApplicationVersionSignature.obtain(android.content.Context)>
	//    6   12:invokestatic    #416 <Method RequestOptions RequestOptions.signatureOf(com.bumptech.glide.load.Key)>
	//    7   15:invokevirtual   #314 <Method RequestBuilder apply(RequestOptions)>
	//    8   18:areturn         
	}

	public RequestBuilder load(Object obj)
	{
		return loadGeneric(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #403 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(String s)
	{
		return loadGeneric(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #403 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(URL url)
	{
		return loadGeneric(((Object) (url)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #403 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:areturn         
	}

	public RequestBuilder load(byte abyte0[])
	{
		return loadGeneric(((Object) (abyte0))).apply(RequestOptions.signatureOf(((com.bumptech.glide.load.Key) (new ObjectKey(((Object) (UUID.randomUUID().toString())))))).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #403 <Method RequestBuilder loadGeneric(Object)>
	//    3    5:new             #424 <Class ObjectKey>
	//    4    8:dup             
	//    5    9:invokestatic    #430 <Method UUID UUID.randomUUID()>
	//    6   12:invokevirtual   #431 <Method String UUID.toString()>
	//    7   15:invokespecial   #434 <Method void ObjectKey(Object)>
	//    8   18:invokestatic    #416 <Method RequestOptions RequestOptions.signatureOf(com.bumptech.glide.load.Key)>
	//    9   21:getstatic       #437 <Field DiskCacheStrategy DiskCacheStrategy.NONE>
	//   10   24:invokevirtual   #60  <Method RequestOptions RequestOptions.diskCacheStrategy(DiskCacheStrategy)>
	//   11   27:iconst_1        
	//   12   28:invokevirtual   #74  <Method RequestOptions RequestOptions.skipMemoryCache(boolean)>
	//   13   31:invokevirtual   #314 <Method RequestBuilder apply(RequestOptions)>
	//   14   34:areturn         
	}

	public Target preload()
	{
		return preload(0x80000000, 0x80000000);
	//    0    0:aload_0         
	//    1    1:ldc2            #441 <Int 0x80000000>
	//    2    4:ldc2            #441 <Int 0x80000000>
	//    3    7:invokevirtual   #444 <Method Target preload(int, int)>
	//    4   10:areturn         
	}

	public Target preload(int i, int j)
	{
		return into(((Target) (PreloadTarget.obtain(requestManager, i, j))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #85  <Field RequestManager requestManager>
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #450 <Method PreloadTarget PreloadTarget.obtain(RequestManager, int, int)>
	//    6   10:invokevirtual   #307 <Method Target into(Target)>
	//    7   13:areturn         
	}

	public FutureTarget submit()
	{
		return submit(0x80000000, 0x80000000);
	//    0    0:aload_0         
	//    1    1:ldc2            #441 <Int 0x80000000>
	//    2    4:ldc2            #441 <Int 0x80000000>
	//    3    7:invokevirtual   #301 <Method FutureTarget submit(int, int)>
	//    4   10:areturn         
	}

	public FutureTarget submit(int i, int j)
	{
		final RequestFutureTarget target = new RequestFutureTarget(context.getMainHandler(), i, j);
	//    0    0:new             #455 <Class RequestFutureTarget>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field GlideContext context>
	//    4    8:invokevirtual   #459 <Method Handler GlideContext.getMainHandler()>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokespecial   #462 <Method void RequestFutureTarget(Handler, int, int)>
	//    8   16:astore_3        
		if(Util.isOnBackgroundThread())
	//*   9   17:invokestatic    #465 <Method boolean Util.isOnBackgroundThread()>
	//*  10   20:ifeq            45
		{
			context.getMainHandler().post(new Runnable() {

				public void run()
				{
					if(!target.isCancelled())
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field RequestFutureTarget val$target>
				//*   2    4:invokevirtual   #32  <Method boolean RequestFutureTarget.isCancelled()>
				//*   3    7:ifne            22
						into(((Target) (target)));
				//    4   10:aload_0         
				//    5   11:getfield        #19  <Field RequestBuilder this$0>
				//    6   14:aload_0         
				//    7   15:getfield        #21  <Field RequestFutureTarget val$target>
				//    8   18:invokevirtual   #36  <Method Target RequestBuilder.into(Target)>
				//    9   21:pop             
				//   10   22:return          
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
	//   12   24:getfield        #93  <Field GlideContext context>
	//   13   27:invokevirtual   #459 <Method Handler GlideContext.getMainHandler()>
	//   14   30:new             #9   <Class RequestBuilder$1>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:aload_3         
	//   18   36:invokespecial   #468 <Method void RequestBuilder$1(RequestBuilder, RequestFutureTarget)>
	//   19   39:invokevirtual   #474 <Method boolean Handler.post(Runnable)>
	//   20   42:pop             
			return ((FutureTarget) (target));
	//   21   43:aload_3         
	//   22   44:areturn         
		} else
		{
			into(((Target) (target)));
	//   23   45:aload_0         
	//   24   46:aload_3         
	//   25   47:invokevirtual   #307 <Method Target into(Target)>
	//   26   50:pop             
			return ((FutureTarget) (target));
	//   27   51:aload_3         
	//   28   52:areturn         
		}
	}

	public RequestBuilder thumbnail(float f)
	{
		if(f < 0.0F || f > 1.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:iflt            12
	//*   4    6:fload_1         
	//*   5    7:fconst_1        
	//*   6    8:fcmpl           
	//*   7    9:ifle            23
		{
			throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
	//    8   12:new             #215 <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:ldc2            #478 <String "sizeMultiplier must be between 0 and 1">
	//   11   19:invokespecial   #232 <Method void IllegalArgumentException(String)>
	//   12   22:athrow          
		} else
		{
			thumbSizeMultiplier = Float.valueOf(f);
	//   13   23:aload_0         
	//   14   24:fload_1         
	//   15   25:invokestatic    #482 <Method Float Float.valueOf(float)>
	//   16   28:putfield        #182 <Field Float thumbSizeMultiplier>
			return this;
	//   17   31:aload_0         
	//   18   32:areturn         
		}
	}

	public RequestBuilder thumbnail(RequestBuilder requestbuilder)
	{
		thumbnailBuilder = requestbuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field RequestBuilder thumbnailBuilder>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RequestBuilder transition(TransitionOptions transitionoptions)
	{
		transitionOptions = (TransitionOptions)Preconditions.checkNotNull(((Object) (transitionoptions)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #267 <Method Object Preconditions.checkNotNull(Object)>
	//    3    5:checkcast       #248 <Class TransitionOptions>
	//    4    8:putfield        #109 <Field TransitionOptions transitionOptions>
		isDefaultTransitionOptionsSet = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #81  <Field boolean isDefaultTransitionOptionsSet>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	protected static final RequestOptions DOWNLOAD_ONLY_OPTIONS;
	private final GlideContext context;
	private final RequestOptions defaultRequestOptions;
	private final Glide glide;
	private boolean isDefaultTransitionOptionsSet;
	private boolean isModelSet;
	private boolean isThumbnailBuilt;
	private Object model;
	private RequestListener requestListener;
	private final RequestManager requestManager;
	protected RequestOptions requestOptions;
	private Float thumbSizeMultiplier;
	private RequestBuilder thumbnailBuilder;
	private final Class transcodeClass;
	private TransitionOptions transitionOptions;

	static 
	{
		DOWNLOAD_ONLY_OPTIONS = (new RequestOptions()).diskCacheStrategy(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
	//    0    0:new             #47  <Class RequestOptions>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void RequestOptions()>
	//    3    7:getstatic       #56  <Field DiskCacheStrategy DiskCacheStrategy.DATA>
	//    4   10:invokevirtual   #60  <Method RequestOptions RequestOptions.diskCacheStrategy(DiskCacheStrategy)>
	//    5   13:getstatic       #66  <Field Priority Priority.LOW>
	//    6   16:invokevirtual   #70  <Method RequestOptions RequestOptions.priority(Priority)>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #74  <Method RequestOptions RequestOptions.skipMemoryCache(boolean)>
	//    9   23:putstatic       #76  <Field RequestOptions DOWNLOAD_ONLY_OPTIONS>
	//*  10   26:return          
	}
}
