// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.*;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.bumptech.glide.request:
//			Request, ResourceCallback, RequestCoordinator, RequestOptions, 
//			RequestListener

public final class SingleRequest
	implements Request, SizeReadyCallback, ResourceCallback, com.bumptech.glide.util.pool.FactoryPools.Poolable
{
	private static final class Status extends Enum
	{

		public static Status valueOf(String s)
		{
			return (Status)Enum.valueOf(com/bumptech/glide/request/SingleRequest$Status, s);
		//    0    0:ldc1            #2   <Class SingleRequest$Status>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SingleRequest$Status>
		//    4    9:areturn         
		}

		public static Status[] values()
		{
			return (Status[])((Status []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field SingleRequest$Status[] $VALUES>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.bumptech.glide.request.SingleRequest$Status_3B_.clone()>
		//    2    6:checkcast       #54  <Class SingleRequest$Status[]>
		//    3    9:areturn         
		}

		private static final Status $VALUES[];
		public static final Status CLEARED;
		public static final Status COMPLETE;
		public static final Status FAILED;
		public static final Status PENDING;
		public static final Status RUNNING;
		public static final Status WAITING_FOR_SIZE;

		static 
		{
			PENDING = new Status("PENDING", 0);
		//    0    0:new             #2   <Class SingleRequest$Status>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "PENDING">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
		//    5   10:putstatic       #26  <Field SingleRequest$Status PENDING>
			RUNNING = new Status("RUNNING", 1);
		//    6   13:new             #2   <Class SingleRequest$Status>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "RUNNING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
		//   11   23:putstatic       #29  <Field SingleRequest$Status RUNNING>
			WAITING_FOR_SIZE = new Status("WAITING_FOR_SIZE", 2);
		//   12   26:new             #2   <Class SingleRequest$Status>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "WAITING_FOR_SIZE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
		//   17   36:putstatic       #32  <Field SingleRequest$Status WAITING_FOR_SIZE>
			COMPLETE = new Status("COMPLETE", 3);
		//   18   39:new             #2   <Class SingleRequest$Status>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "COMPLETE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
		//   23   49:putstatic       #35  <Field SingleRequest$Status COMPLETE>
			FAILED = new Status("FAILED", 4);
		//   24   52:new             #2   <Class SingleRequest$Status>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "FAILED">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
		//   29   62:putstatic       #38  <Field SingleRequest$Status FAILED>
			CLEARED = new Status("CLEARED", 5);
		//   30   65:new             #2   <Class SingleRequest$Status>
		//   31   68:dup             
		//   32   69:ldc1            #39  <String "CLEARED">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void SingleRequest$Status(String, int)>
		//   35   75:putstatic       #41  <Field SingleRequest$Status CLEARED>
			$VALUES = (new Status[] {
				PENDING, RUNNING, WAITING_FOR_SIZE, COMPLETE, FAILED, CLEARED
			});
		//   36   78:bipush          6
		//   37   80:anewarray       Status[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #26  <Field SingleRequest$Status PENDING>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #29  <Field SingleRequest$Status RUNNING>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #32  <Field SingleRequest$Status WAITING_FOR_SIZE>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #35  <Field SingleRequest$Status COMPLETE>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #38  <Field SingleRequest$Status FAILED>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #41  <Field SingleRequest$Status CLEARED>
		//   61  118:aastore         
		//   62  119:putstatic       #43  <Field SingleRequest$Status[] $VALUES>
		//*  63  122:return          
		}

		private Status(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	SingleRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void Object()>
		String s;
		if(IS_VERBOSE_LOGGABLE)
	//*   2    4:getstatic       #103 <Field boolean IS_VERBOSE_LOGGABLE>
	//*   3    7:ifeq            21
			s = String.valueOf(super.hashCode());
	//    4   10:aload_0         
	//    5   11:invokespecial   #109 <Method int Object.hashCode()>
	//    6   14:invokestatic    #115 <Method String String.valueOf(int)>
	//    7   17:astore_1        
		else
	//*   8   18:goto            23
			s = null;
	//    9   21:aconst_null     
	//   10   22:astore_1        
		tag = s;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #117 <Field String tag>
	//   14   28:aload_0         
	//   15   29:invokestatic    #123 <Method StateVerifier StateVerifier.newInstance()>
	//   16   32:putfield        #125 <Field StateVerifier stateVerifier>
	//   17   35:return          
	}

	private void assertNotCallingCallbacks()
	{
		if(!isCallingCallbacks)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field boolean isCallingCallbacks>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
	//    4    8:new             #130 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #132 <String "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.">
	//    7   14:invokespecial   #135 <Method void IllegalStateException(String)>
	//    8   17:athrow          
	}

	private boolean canNotifyCleared()
	{
		RequestCoordinator requestcoordinator = requestCoordinator;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canNotifyCleared(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #144 <Method boolean RequestCoordinator.canNotifyCleared(Request)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	private boolean canNotifyStatusChanged()
	{
		RequestCoordinator requestcoordinator = requestCoordinator;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canNotifyStatusChanged(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #147 <Method boolean RequestCoordinator.canNotifyStatusChanged(Request)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	private boolean canSetResource()
	{
		RequestCoordinator requestcoordinator = requestCoordinator;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canSetImage(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #151 <Method boolean RequestCoordinator.canSetImage(Request)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	private void cancel()
	{
		assertNotCallingCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void assertNotCallingCallbacks()>
		stateVerifier.throwIfRecycled();
	//    2    4:aload_0         
	//    3    5:getfield        #125 <Field StateVerifier stateVerifier>
	//    4    8:invokevirtual   #157 <Method void StateVerifier.throwIfRecycled()>
		target.removeCallback(((SizeReadyCallback) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #159 <Field Target target>
	//    7   15:aload_0         
	//    8   16:invokeinterface #165 <Method void Target.removeCallback(SizeReadyCallback)>
		com.bumptech.glide.load.engine.Engine.LoadStatus loadstatus = loadStatus;
	//    9   21:aload_0         
	//   10   22:getfield        #167 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
	//   11   25:astore_1        
		if(loadstatus != null)
	//*  12   26:aload_1         
	//*  13   27:ifnull          39
		{
			loadstatus.cancel();
	//   14   30:aload_1         
	//   15   31:invokevirtual   #171 <Method void com.bumptech.glide.load.engine.Engine$LoadStatus.cancel()>
			loadStatus = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #167 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		}
	//   19   39:return          
	}

	private Drawable getErrorDrawable()
	{
		if(errorDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field Drawable errorDrawable>
	//*   2    4:ifnonnull       50
		{
			errorDrawable = requestOptions.getErrorPlaceholder();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #177 <Field RequestOptions requestOptions>
	//    6   12:invokevirtual   #182 <Method Drawable RequestOptions.getErrorPlaceholder()>
	//    7   15:putfield        #175 <Field Drawable errorDrawable>
			if(errorDrawable == null && requestOptions.getErrorId() > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #175 <Field Drawable errorDrawable>
	//*  10   22:ifnonnull       50
	//*  11   25:aload_0         
	//*  12   26:getfield        #177 <Field RequestOptions requestOptions>
	//*  13   29:invokevirtual   #185 <Method int RequestOptions.getErrorId()>
	//*  14   32:ifle            50
				errorDrawable = loadDrawable(requestOptions.getErrorId());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #177 <Field RequestOptions requestOptions>
	//   19   41:invokevirtual   #185 <Method int RequestOptions.getErrorId()>
	//   20   44:invokespecial   #189 <Method Drawable loadDrawable(int)>
	//   21   47:putfield        #175 <Field Drawable errorDrawable>
		}
		return errorDrawable;
	//   22   50:aload_0         
	//   23   51:getfield        #175 <Field Drawable errorDrawable>
	//   24   54:areturn         
	}

	private Drawable getFallbackDrawable()
	{
		if(fallbackDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field Drawable fallbackDrawable>
	//*   2    4:ifnonnull       50
		{
			fallbackDrawable = requestOptions.getFallbackDrawable();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #177 <Field RequestOptions requestOptions>
	//    6   12:invokevirtual   #194 <Method Drawable RequestOptions.getFallbackDrawable()>
	//    7   15:putfield        #192 <Field Drawable fallbackDrawable>
			if(fallbackDrawable == null && requestOptions.getFallbackId() > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #192 <Field Drawable fallbackDrawable>
	//*  10   22:ifnonnull       50
	//*  11   25:aload_0         
	//*  12   26:getfield        #177 <Field RequestOptions requestOptions>
	//*  13   29:invokevirtual   #197 <Method int RequestOptions.getFallbackId()>
	//*  14   32:ifle            50
				fallbackDrawable = loadDrawable(requestOptions.getFallbackId());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #177 <Field RequestOptions requestOptions>
	//   19   41:invokevirtual   #197 <Method int RequestOptions.getFallbackId()>
	//   20   44:invokespecial   #189 <Method Drawable loadDrawable(int)>
	//   21   47:putfield        #192 <Field Drawable fallbackDrawable>
		}
		return fallbackDrawable;
	//   22   50:aload_0         
	//   23   51:getfield        #192 <Field Drawable fallbackDrawable>
	//   24   54:areturn         
	}

	private Drawable getPlaceholderDrawable()
	{
		if(placeholderDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field Drawable placeholderDrawable>
	//*   2    4:ifnonnull       50
		{
			placeholderDrawable = requestOptions.getPlaceholderDrawable();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #177 <Field RequestOptions requestOptions>
	//    6   12:invokevirtual   #202 <Method Drawable RequestOptions.getPlaceholderDrawable()>
	//    7   15:putfield        #200 <Field Drawable placeholderDrawable>
			if(placeholderDrawable == null && requestOptions.getPlaceholderId() > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #200 <Field Drawable placeholderDrawable>
	//*  10   22:ifnonnull       50
	//*  11   25:aload_0         
	//*  12   26:getfield        #177 <Field RequestOptions requestOptions>
	//*  13   29:invokevirtual   #205 <Method int RequestOptions.getPlaceholderId()>
	//*  14   32:ifle            50
				placeholderDrawable = loadDrawable(requestOptions.getPlaceholderId());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #177 <Field RequestOptions requestOptions>
	//   19   41:invokevirtual   #205 <Method int RequestOptions.getPlaceholderId()>
	//   20   44:invokespecial   #189 <Method Drawable loadDrawable(int)>
	//   21   47:putfield        #200 <Field Drawable placeholderDrawable>
		}
		return placeholderDrawable;
	//   22   50:aload_0         
	//   23   51:getfield        #200 <Field Drawable placeholderDrawable>
	//   24   54:areturn         
	}

	private void init(Context context1, GlideContext glidecontext, Object obj, Class class1, RequestOptions requestoptions, int i, int j, 
			Priority priority1, Target target1, RequestListener requestlistener, List list, RequestCoordinator requestcoordinator, Engine engine1, TransitionFactory transitionfactory)
	{
		context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #209 <Field Context context>
		glideContext = glidecontext;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #211 <Field GlideContext glideContext>
		model = obj;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #213 <Field Object model>
		transcodeClass = class1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #215 <Field Class transcodeClass>
		requestOptions = requestoptions;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #177 <Field RequestOptions requestOptions>
		overrideWidth = i;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #217 <Field int overrideWidth>
		overrideHeight = j;
	//   18   33:aload_0         
	//   19   34:iload           7
	//   20   36:putfield        #219 <Field int overrideHeight>
		priority = priority1;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #221 <Field Priority priority>
		target = target1;
	//   24   45:aload_0         
	//   25   46:aload           9
	//   26   48:putfield        #159 <Field Target target>
		targetListener = requestlistener;
	//   27   51:aload_0         
	//   28   52:aload           10
	//   29   54:putfield        #223 <Field RequestListener targetListener>
		requestListeners = list;
	//   30   57:aload_0         
	//   31   58:aload           11
	//   32   60:putfield        #225 <Field List requestListeners>
		requestCoordinator = requestcoordinator;
	//   33   63:aload_0         
	//   34   64:aload           12
	//   35   66:putfield        #139 <Field RequestCoordinator requestCoordinator>
		engine = engine1;
	//   36   69:aload_0         
	//   37   70:aload           13
	//   38   72:putfield        #227 <Field Engine engine>
		animationFactory = transitionfactory;
	//   39   75:aload_0         
	//   40   76:aload           14
	//   41   78:putfield        #229 <Field TransitionFactory animationFactory>
		status = Status.PENDING;
	//   42   81:aload_0         
	//   43   82:getstatic       #232 <Field SingleRequest$Status SingleRequest$Status.PENDING>
	//   44   85:putfield        #234 <Field SingleRequest$Status status>
	//   45   88:return          
	}

	private boolean isFirstReadyResource()
	{
		RequestCoordinator requestcoordinator = requestCoordinator;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		return requestcoordinator == null || !requestcoordinator.isAnyResourceSet();
	//    3    5:aload_1         
	//    4    6:ifnull          23
	//    5    9:aload_1         
	//    6   10:invokeinterface #241 <Method boolean RequestCoordinator.isAnyResourceSet()>
	//    7   15:ifne            21
	//    8   18:goto            23
	//    9   21:iconst_0        
	//   10   22:ireturn         
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	private static boolean listenerCountEquals(SingleRequest singlerequest, SingleRequest singlerequest1)
	{
		singlerequest = ((SingleRequest) (singlerequest.requestListeners));
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field List requestListeners>
	//    2    4:astore_0        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		int i;
		if(singlerequest == null)
	//*   5    8:aload_0         
	//*   6    9:ifnonnull       17
			i = 0;
	//    7   12:iconst_0        
	//    8   13:istore_2        
		else
	//*   9   14:goto            24
			i = ((List) (singlerequest)).size();
	//   10   17:aload_0         
	//   11   18:invokeinterface #248 <Method int List.size()>
	//   12   23:istore_2        
		singlerequest = ((SingleRequest) (singlerequest1.requestListeners));
	//   13   24:aload_1         
	//   14   25:getfield        #225 <Field List requestListeners>
	//   15   28:astore_0        
		int j;
		if(singlerequest == null)
	//*  16   29:aload_0         
	//*  17   30:ifnonnull       38
			j = 0;
	//   18   33:iconst_0        
	//   19   34:istore_3        
		else
	//*  20   35:goto            45
			j = ((List) (singlerequest)).size();
	//   21   38:aload_0         
	//   22   39:invokeinterface #248 <Method int List.size()>
	//   23   44:istore_3        
		if(i == j)
	//*  24   45:iload_2         
	//*  25   46:iload_3         
	//*  26   47:icmpne          53
			flag = true;
	//   27   50:iconst_1        
	//   28   51:istore          4
		return flag;
	//   29   53:iload           4
	//   30   55:ireturn         
	}

	private Drawable loadDrawable(int i)
	{
		android.content.res.Resources.Theme theme;
		if(requestOptions.getTheme() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #177 <Field RequestOptions requestOptions>
	//*   2    4:invokevirtual   #254 <Method android.content.res.Resources$Theme RequestOptions.getTheme()>
	//*   3    7:ifnull          21
			theme = requestOptions.getTheme();
	//    4   10:aload_0         
	//    5   11:getfield        #177 <Field RequestOptions requestOptions>
	//    6   14:invokevirtual   #254 <Method android.content.res.Resources$Theme RequestOptions.getTheme()>
	//    7   17:astore_2        
		else
	//*   8   18:goto            29
			theme = context.getTheme();
	//    9   21:aload_0         
	//   10   22:getfield        #209 <Field Context context>
	//   11   25:invokevirtual   #257 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   12   28:astore_2        
		return DrawableDecoderCompat.getDrawable(((Context) (glideContext)), i, theme);
	//   13   29:aload_0         
	//   14   30:getfield        #211 <Field GlideContext glideContext>
	//   15   33:iload_1         
	//   16   34:aload_2         
	//   17   35:invokestatic    #263 <Method Drawable DrawableDecoderCompat.getDrawable(Context, int, android.content.res.Resources$Theme)>
	//   18   38:areturn         
	}

	private void logV(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #266 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #267 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(s);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(" this: ");
	//    8   14:aload_2         
	//    9   15:ldc2            #273 <String " this: ">
	//   10   18:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(tag);
	//   12   22:aload_2         
	//   13   23:aload_0         
	//   14   24:getfield        #117 <Field String tag>
	//   15   27:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		Log.v("Request", stringbuilder.toString());
	//   17   31:ldc1            #30  <String "Request">
	//   18   33:aload_2         
	//   19   34:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #281 <Method int Log.v(String, String)>
	//   21   40:pop             
	//   22   41:return          
	}

	private static int maybeApplySizeMultiplier(int i, float f)
	{
		if(i == 0x80000000)
	//*   0    0:iload_0         
	//*   1    1:ldc2            #284 <Int 0x80000000>
	//*   2    4:icmpne          9
			return i;
	//    3    7:iload_0         
	//    4    8:ireturn         
		else
			return Math.round(f * (float)i);
	//    5    9:fload_1         
	//    6   10:iload_0         
	//    7   11:i2f             
	//    8   12:fmul            
	//    9   13:invokestatic    #290 <Method int Math.round(float)>
	//   10   16:ireturn         
	}

	private void notifyLoadFailed()
	{
		RequestCoordinator requestcoordinator = requestCoordinator;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		if(requestcoordinator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			requestcoordinator.onRequestFailed(((Request) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #295 <Method void RequestCoordinator.onRequestFailed(Request)>
	//    8   16:return          
	}

	private void notifyLoadSuccess()
	{
		RequestCoordinator requestcoordinator = requestCoordinator;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		if(requestcoordinator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			requestcoordinator.onRequestSuccess(((Request) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #299 <Method void RequestCoordinator.onRequestSuccess(Request)>
	//    8   16:return          
	}

	public static SingleRequest obtain(Context context1, GlideContext glidecontext, Object obj, Class class1, RequestOptions requestoptions, int i, int j, Priority priority1, 
			Target target1, RequestListener requestlistener, List list, RequestCoordinator requestcoordinator, Engine engine1, TransitionFactory transitionfactory)
	{
		SingleRequest singlerequest1 = (SingleRequest)POOL.acquire();
	//    0    0:getstatic       #95  <Field android.support.v4.util.Pools$Pool POOL>
	//    1    3:invokeinterface #307 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:checkcast       #2   <Class SingleRequest>
	//    3   11:astore          15
		SingleRequest singlerequest = singlerequest1;
	//    4   13:aload           15
	//    5   15:astore          14
		if(singlerequest1 == null)
	//*   6   17:aload           15
	//*   7   19:ifnonnull       31
			singlerequest = new SingleRequest();
	//    8   22:new             #2   <Class SingleRequest>
	//    9   25:dup             
	//   10   26:invokespecial   #308 <Method void SingleRequest()>
	//   11   29:astore          14
		singlerequest.init(context1, glidecontext, obj, class1, requestoptions, i, j, priority1, target1, requestlistener, list, requestcoordinator, engine1, transitionfactory);
	//   12   31:aload           14
	//   13   33:aload_0         
	//   14   34:aload_1         
	//   15   35:aload_2         
	//   16   36:aload_3         
	//   17   37:aload           4
	//   18   39:iload           5
	//   19   41:iload           6
	//   20   43:aload           7
	//   21   45:aload           8
	//   22   47:aload           9
	//   23   49:aload           10
	//   24   51:aload           11
	//   25   53:aload           12
	//   26   55:aload           13
	//   27   57:invokespecial   #310 <Method void init(Context, GlideContext, Object, Class, RequestOptions, int, int, Priority, Target, RequestListener, List, RequestCoordinator, Engine, TransitionFactory)>
		return singlerequest;
	//   28   60:aload           14
	//   29   62:areturn         
	}

	private void onLoadFailed(GlideException glideexception, int i)
	{
		boolean flag;
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #157 <Method void StateVerifier.throwIfRecycled()>
		int j = glideContext.getLogLevel();
	//    3    7:aload_0         
	//    4    8:getfield        #211 <Field GlideContext glideContext>
	//    5   11:invokevirtual   #318 <Method int GlideContext.getLogLevel()>
	//    6   14:istore_3        
		if(j <= i)
	//*   7   15:iload_3         
	//*   8   16:iload_2         
	//*   9   17:icmpgt          118
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   20:new             #266 <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #267 <Method void StringBuilder()>
	//   13   27:astore          5
			stringbuilder.append("Load failed for ");
	//   14   29:aload           5
	//   15   31:ldc2            #320 <String "Load failed for ">
	//   16   34:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			stringbuilder.append(model);
	//   18   38:aload           5
	//   19   40:aload_0         
	//   20   41:getfield        #213 <Field Object model>
	//   21   44:invokevirtual   #323 <Method StringBuilder StringBuilder.append(Object)>
	//   22   47:pop             
			stringbuilder.append(" with size [");
	//   23   48:aload           5
	//   24   50:ldc2            #325 <String " with size [">
	//   25   53:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   26   56:pop             
			stringbuilder.append(width);
	//   27   57:aload           5
	//   28   59:aload_0         
	//   29   60:getfield        #327 <Field int width>
	//   30   63:invokevirtual   #330 <Method StringBuilder StringBuilder.append(int)>
	//   31   66:pop             
			stringbuilder.append("x");
	//   32   67:aload           5
	//   33   69:ldc2            #332 <String "x">
	//   34   72:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   35   75:pop             
			stringbuilder.append(height);
	//   36   76:aload           5
	//   37   78:aload_0         
	//   38   79:getfield        #334 <Field int height>
	//   39   82:invokevirtual   #330 <Method StringBuilder StringBuilder.append(int)>
	//   40   85:pop             
			stringbuilder.append("]");
	//   41   86:aload           5
	//   42   88:ldc2            #336 <String "]">
	//   43   91:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   44   94:pop             
			Log.w("Glide", stringbuilder.toString(), ((Throwable) (glideexception)));
	//   45   95:ldc1            #22  <String "Glide">
	//   46   97:aload           5
	//   47   99:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   48  102:aload_1         
	//   49  103:invokestatic    #340 <Method int Log.w(String, String, Throwable)>
	//   50  106:pop             
			if(j <= 4)
	//*  51  107:iload_3         
	//*  52  108:iconst_4        
	//*  53  109:icmpgt          118
				glideexception.logRootCauses("Glide");
	//   54  112:aload_1         
	//   55  113:ldc1            #22  <String "Glide">
	//   56  115:invokevirtual   #345 <Method void GlideException.logRootCauses(String)>
		}
		loadStatus = null;
	//   57  118:aload_0         
	//   58  119:aconst_null     
	//   59  120:putfield        #167 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		status = Status.FAILED;
	//   60  123:aload_0         
	//   61  124:getstatic       #348 <Field SingleRequest$Status SingleRequest$Status.FAILED>
	//   62  127:putfield        #234 <Field SingleRequest$Status status>
		flag = true;
	//   63  130:iconst_1        
	//   64  131:istore          4
		isCallingCallbacks = true;
	//   65  133:aload_0         
	//   66  134:iconst_1        
	//   67  135:putfield        #128 <Field boolean isCallingCallbacks>
		Iterator iterator;
		if(requestListeners == null)
			break MISSING_BLOCK_LABEL_270;
	//   68  138:aload_0         
	//   69  139:getfield        #225 <Field List requestListeners>
	//   70  142:ifnull          270
		iterator = requestListeners.iterator();
	//   71  145:aload_0         
	//   72  146:getfield        #225 <Field List requestListeners>
	//   73  149:invokeinterface #352 <Method Iterator List.iterator()>
	//   74  154:astore          5
		i = 0;
	//   75  156:iconst_0        
	//   76  157:istore_2        
_L2:
		int k = i;
	//   77  158:iload_2         
	//   78  159:istore_3        
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   79  160:aload           5
	//   80  162:invokeinterface #357 <Method boolean Iterator.hasNext()>
	//   81  167:ifeq            204
		i |= ((int) (((RequestListener)iterator.next()).onLoadFailed(glideexception, model, target, isFirstReadyResource())));
	//   82  170:iload_2         
	//   83  171:aload           5
	//   84  173:invokeinterface #360 <Method Object Iterator.next()>
	//   85  178:checkcast       #362 <Class RequestListener>
	//   86  181:aload_1         
	//   87  182:aload_0         
	//   88  183:getfield        #213 <Field Object model>
	//   89  186:aload_0         
	//   90  187:getfield        #159 <Field Target target>
	//   91  190:aload_0         
	//   92  191:invokespecial   #364 <Method boolean isFirstReadyResource()>
	//   93  194:invokeinterface #367 <Method boolean RequestListener.onLoadFailed(GlideException, Object, Target, boolean)>
	//   94  199:ior             
	//   95  200:istore_2        
		if(true) goto _L2; else goto _L1
	//   96  201:goto            158
_L1:
		if(targetListener != null && targetListener.onLoadFailed(glideexception, model, target, isFirstReadyResource()))
	//*  97  204:aload_0         
	//*  98  205:getfield        #223 <Field RequestListener targetListener>
	//*  99  208:ifnull          275
	//* 100  211:aload_0         
	//* 101  212:getfield        #223 <Field RequestListener targetListener>
	//* 102  215:aload_1         
	//* 103  216:aload_0         
	//* 104  217:getfield        #213 <Field Object model>
	//* 105  220:aload_0         
	//* 106  221:getfield        #159 <Field Target target>
	//* 107  224:aload_0         
	//* 108  225:invokespecial   #364 <Method boolean isFirstReadyResource()>
	//* 109  228:invokeinterface #367 <Method boolean RequestListener.onLoadFailed(GlideException, Object, Target, boolean)>
	//* 110  233:ifeq            275
			i = ((int) (flag));
	//  111  236:iload           4
	//  112  238:istore_2        
		else
	//* 113  239:goto            242
	//* 114  242:iload_3         
	//* 115  243:iload_2         
	//* 116  244:ior             
	//* 117  245:ifne            252
	//* 118  248:aload_0         
	//* 119  249:invokespecial   #370 <Method void setErrorPlaceholder()>
	//* 120  252:aload_0         
	//* 121  253:iconst_0        
	//* 122  254:putfield        #128 <Field boolean isCallingCallbacks>
	//* 123  257:aload_0         
	//* 124  258:invokespecial   #372 <Method void notifyLoadFailed()>
	//* 125  261:return          
	//* 126  262:astore_1        
	//* 127  263:aload_0         
	//* 128  264:iconst_0        
	//* 129  265:putfield        #128 <Field boolean isCallingCallbacks>
	//* 130  268:aload_1         
	//* 131  269:athrow          
	//* 132  270:iconst_0        
	//* 133  271:istore_3        
	//* 134  272:goto            204
			i = 0;
	//  135  275:iconst_0        
	//  136  276:istore_2        
		if((k | i) != 0)
			break MISSING_BLOCK_LABEL_252;
		setErrorPlaceholder();
		isCallingCallbacks = false;
		notifyLoadFailed();
		return;
		glideexception;
		isCallingCallbacks = false;
		throw glideexception;
		k = 0;
		  goto _L1
	//* 137  277:goto            242
	}

	private void onResourceReady(Resource resource1, Object obj, DataSource datasource)
	{
		boolean flag3;
		boolean flag4;
		flag4 = isFirstReadyResource();
	//    0    0:aload_0         
	//    1    1:invokespecial   #364 <Method boolean isFirstReadyResource()>
	//    2    4:istore          7
		status = Status.COMPLETE;
	//    3    6:aload_0         
	//    4    7:getstatic       #377 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//    5   10:putfield        #234 <Field SingleRequest$Status status>
		resource = resource1;
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:putfield        #379 <Field Resource resource>
		if(glideContext.getLogLevel() <= 3)
	//*   9   18:aload_0         
	//*  10   19:getfield        #211 <Field GlideContext glideContext>
	//*  11   22:invokevirtual   #318 <Method int GlideContext.getLogLevel()>
	//*  12   25:iconst_3        
	//*  13   26:icmpgt          160
		{
			resource1 = ((Resource) (new StringBuilder()));
	//   14   29:new             #266 <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #267 <Method void StringBuilder()>
	//   17   36:astore_1        
			((StringBuilder) (resource1)).append("Finished loading ");
	//   18   37:aload_1         
	//   19   38:ldc2            #381 <String "Finished loading ">
	//   20   41:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			((StringBuilder) (resource1)).append(obj.getClass().getSimpleName());
	//   22   45:aload_1         
	//   23   46:aload_2         
	//   24   47:invokevirtual   #385 <Method Class Object.getClass()>
	//   25   50:invokevirtual   #390 <Method String Class.getSimpleName()>
	//   26   53:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			((StringBuilder) (resource1)).append(" from ");
	//   28   57:aload_1         
	//   29   58:ldc2            #392 <String " from ">
	//   30   61:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
			((StringBuilder) (resource1)).append(((Object) (datasource)));
	//   32   65:aload_1         
	//   33   66:aload_3         
	//   34   67:invokevirtual   #323 <Method StringBuilder StringBuilder.append(Object)>
	//   35   70:pop             
			((StringBuilder) (resource1)).append(" for ");
	//   36   71:aload_1         
	//   37   72:ldc2            #394 <String " for ">
	//   38   75:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
			((StringBuilder) (resource1)).append(model);
	//   40   79:aload_1         
	//   41   80:aload_0         
	//   42   81:getfield        #213 <Field Object model>
	//   43   84:invokevirtual   #323 <Method StringBuilder StringBuilder.append(Object)>
	//   44   87:pop             
			((StringBuilder) (resource1)).append(" with size [");
	//   45   88:aload_1         
	//   46   89:ldc2            #325 <String " with size [">
	//   47   92:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   48   95:pop             
			((StringBuilder) (resource1)).append(width);
	//   49   96:aload_1         
	//   50   97:aload_0         
	//   51   98:getfield        #327 <Field int width>
	//   52  101:invokevirtual   #330 <Method StringBuilder StringBuilder.append(int)>
	//   53  104:pop             
			((StringBuilder) (resource1)).append("x");
	//   54  105:aload_1         
	//   55  106:ldc2            #332 <String "x">
	//   56  109:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   57  112:pop             
			((StringBuilder) (resource1)).append(height);
	//   58  113:aload_1         
	//   59  114:aload_0         
	//   60  115:getfield        #334 <Field int height>
	//   61  118:invokevirtual   #330 <Method StringBuilder StringBuilder.append(int)>
	//   62  121:pop             
			((StringBuilder) (resource1)).append("] in ");
	//   63  122:aload_1         
	//   64  123:ldc2            #396 <String "] in ">
	//   65  126:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   66  129:pop             
			((StringBuilder) (resource1)).append(LogTime.getElapsedMillis(startTime));
	//   67  130:aload_1         
	//   68  131:aload_0         
	//   69  132:getfield        #398 <Field long startTime>
	//   70  135:invokestatic    #404 <Method double LogTime.getElapsedMillis(long)>
	//   71  138:invokevirtual   #407 <Method StringBuilder StringBuilder.append(double)>
	//   72  141:pop             
			((StringBuilder) (resource1)).append(" ms");
	//   73  142:aload_1         
	//   74  143:ldc2            #409 <String " ms">
	//   75  146:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   76  149:pop             
			Log.d("Glide", ((StringBuilder) (resource1)).toString());
	//   77  150:ldc1            #22  <String "Glide">
	//   78  152:aload_1         
	//   79  153:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   80  156:invokestatic    #412 <Method int Log.d(String, String)>
	//   81  159:pop             
		}
		flag3 = true;
	//   82  160:iconst_1        
	//   83  161:istore          6
		isCallingCallbacks = true;
	//   84  163:aload_0         
	//   85  164:iconst_1        
	//   86  165:putfield        #128 <Field boolean isCallingCallbacks>
		if(requestListeners == null)
			break MISSING_BLOCK_LABEL_323;
	//   87  168:aload_0         
	//   88  169:getfield        #225 <Field List requestListeners>
	//   89  172:ifnull          323
		resource1 = ((Resource) (requestListeners.iterator()));
	//   90  175:aload_0         
	//   91  176:getfield        #225 <Field List requestListeners>
	//   92  179:invokeinterface #352 <Method Iterator List.iterator()>
	//   93  184:astore_1        
		boolean flag = false;
	//   94  185:iconst_0        
	//   95  186:istore          4
_L2:
		boolean flag2 = flag;
	//   96  188:iload           4
	//   97  190:istore          5
		if(!((Iterator) (resource1)).hasNext())
			break; /* Loop/switch isn't completed */
	//   98  192:aload_1         
	//   99  193:invokeinterface #357 <Method boolean Iterator.hasNext()>
	//  100  198:ifeq            235
		flag |= ((RequestListener)((Iterator) (resource1)).next()).onResourceReady(obj, model, target, datasource, flag4);
	//  101  201:iload           4
	//  102  203:aload_1         
	//  103  204:invokeinterface #360 <Method Object Iterator.next()>
	//  104  209:checkcast       #362 <Class RequestListener>
	//  105  212:aload_2         
	//  106  213:aload_0         
	//  107  214:getfield        #213 <Field Object model>
	//  108  217:aload_0         
	//  109  218:getfield        #159 <Field Target target>
	//  110  221:aload_3         
	//  111  222:iload           7
	//  112  224:invokeinterface #415 <Method boolean RequestListener.onResourceReady(Object, Object, Target, DataSource, boolean)>
	//  113  229:ior             
	//  114  230:istore          4
		if(true) goto _L2; else goto _L1
	//  115  232:goto            188
_L1:
		boolean flag1;
		if(targetListener != null && targetListener.onResourceReady(obj, model, target, datasource, flag4))
	//* 116  235:aload_0         
	//* 117  236:getfield        #223 <Field RequestListener targetListener>
	//* 118  239:ifnull          329
	//* 119  242:aload_0         
	//* 120  243:getfield        #223 <Field RequestListener targetListener>
	//* 121  246:aload_2         
	//* 122  247:aload_0         
	//* 123  248:getfield        #213 <Field Object model>
	//* 124  251:aload_0         
	//* 125  252:getfield        #159 <Field Target target>
	//* 126  255:aload_3         
	//* 127  256:iload           7
	//* 128  258:invokeinterface #415 <Method boolean RequestListener.onResourceReady(Object, Object, Target, DataSource, boolean)>
	//* 129  263:ifeq            329
			flag1 = flag3;
	//  130  266:iload           6
	//  131  268:istore          4
		else
	//* 132  270:goto            273
	//* 133  273:iload           4
	//* 134  275:iload           5
	//* 135  277:ior             
	//* 136  278:ifne            305
	//* 137  281:aload_0         
	//* 138  282:getfield        #229 <Field TransitionFactory animationFactory>
	//* 139  285:aload_3         
	//* 140  286:iload           7
	//* 141  288:invokeinterface #421 <Method com.bumptech.glide.request.transition.Transition TransitionFactory.build(DataSource, boolean)>
	//* 142  293:astore_1        
	//* 143  294:aload_0         
	//* 144  295:getfield        #159 <Field Target target>
	//* 145  298:aload_2         
	//* 146  299:aload_1         
	//* 147  300:invokeinterface #424 <Method void Target.onResourceReady(Object, com.bumptech.glide.request.transition.Transition)>
	//* 148  305:aload_0         
	//* 149  306:iconst_0        
	//* 150  307:putfield        #128 <Field boolean isCallingCallbacks>
	//* 151  310:aload_0         
	//* 152  311:invokespecial   #426 <Method void notifyLoadSuccess()>
	//* 153  314:return          
	//* 154  315:astore_1        
	//* 155  316:aload_0         
	//* 156  317:iconst_0        
	//* 157  318:putfield        #128 <Field boolean isCallingCallbacks>
	//* 158  321:aload_1         
	//* 159  322:athrow          
	//* 160  323:iconst_0        
	//* 161  324:istore          5
	//* 162  326:goto            235
			flag1 = false;
	//  163  329:iconst_0        
	//  164  330:istore          4
		if(flag1 | flag2)
			break MISSING_BLOCK_LABEL_305;
		resource1 = ((Resource) (animationFactory.build(datasource, flag4)));
		target.onResourceReady(obj, ((com.bumptech.glide.request.transition.Transition) (resource1)));
		isCallingCallbacks = false;
		notifyLoadSuccess();
		return;
		resource1;
		isCallingCallbacks = false;
		throw resource1;
		flag2 = false;
		  goto _L1
	//* 165  332:goto            273
	}

	private void releaseResource(Resource resource1)
	{
		engine.release(resource1);
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field Engine engine>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #434 <Method void Engine.release(Resource)>
		resource = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #379 <Field Resource resource>
	//    7   13:return          
	}

	private void setErrorPlaceholder()
	{
		if(!canNotifyStatusChanged())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #437 <Method boolean canNotifyStatusChanged()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Drawable drawable1 = null;
	//    4    8:aconst_null     
	//    5    9:astore_2        
		if(model == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #213 <Field Object model>
	//*   8   14:ifnonnull       22
			drawable1 = getFallbackDrawable();
	//    9   17:aload_0         
	//   10   18:invokespecial   #438 <Method Drawable getFallbackDrawable()>
	//   11   21:astore_2        
		Drawable drawable = drawable1;
	//   12   22:aload_2         
	//   13   23:astore_1        
		if(drawable1 == null)
	//*  14   24:aload_2         
	//*  15   25:ifnonnull       33
			drawable = getErrorDrawable();
	//   16   28:aload_0         
	//   17   29:invokespecial   #440 <Method Drawable getErrorDrawable()>
	//   18   32:astore_1        
		drawable1 = drawable;
	//   19   33:aload_1         
	//   20   34:astore_2        
		if(drawable == null)
	//*  21   35:aload_1         
	//*  22   36:ifnonnull       44
			drawable1 = getPlaceholderDrawable();
	//   23   39:aload_0         
	//   24   40:invokespecial   #441 <Method Drawable getPlaceholderDrawable()>
	//   25   43:astore_2        
		target.onLoadFailed(drawable1);
	//   26   44:aload_0         
	//   27   45:getfield        #159 <Field Target target>
	//   28   48:aload_2         
	//   29   49:invokeinterface #444 <Method void Target.onLoadFailed(Drawable)>
	//   30   54:return          
	}

	public void begin()
	{
		assertNotCallingCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void assertNotCallingCallbacks()>
		stateVerifier.throwIfRecycled();
	//    2    4:aload_0         
	//    3    5:getfield        #125 <Field StateVerifier stateVerifier>
	//    4    8:invokevirtual   #157 <Method void StateVerifier.throwIfRecycled()>
		startTime = LogTime.getLogTime();
	//    5   11:aload_0         
	//    6   12:invokestatic    #449 <Method long LogTime.getLogTime()>
	//    7   15:putfield        #398 <Field long startTime>
		if(model == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #213 <Field Object model>
	//*  10   22:ifnonnull       85
		{
			if(Util.isValidDimensions(overrideWidth, overrideHeight))
	//*  11   25:aload_0         
	//*  12   26:getfield        #217 <Field int overrideWidth>
	//*  13   29:aload_0         
	//*  14   30:getfield        #219 <Field int overrideHeight>
	//*  15   33:invokestatic    #455 <Method boolean Util.isValidDimensions(int, int)>
	//*  16   36:ifeq            55
			{
				width = overrideWidth;
	//   17   39:aload_0         
	//   18   40:aload_0         
	//   19   41:getfield        #217 <Field int overrideWidth>
	//   20   44:putfield        #327 <Field int width>
				height = overrideHeight;
	//   21   47:aload_0         
	//   22   48:aload_0         
	//   23   49:getfield        #219 <Field int overrideHeight>
	//   24   52:putfield        #334 <Field int height>
			}
			byte byte0;
			if(getFallbackDrawable() == null)
	//*  25   55:aload_0         
	//*  26   56:invokespecial   #438 <Method Drawable getFallbackDrawable()>
	//*  27   59:ifnonnull       67
				byte0 = 5;
	//   28   62:iconst_5        
	//   29   63:istore_1        
			else
	//*  30   64:goto            69
				byte0 = 3;
	//   31   67:iconst_3        
	//   32   68:istore_1        
			onLoadFailed(new GlideException("Received null model"), ((int) (byte0)));
	//   33   69:aload_0         
	//   34   70:new             #342 <Class GlideException>
	//   35   73:dup             
	//   36   74:ldc2            #457 <String "Received null model">
	//   37   77:invokespecial   #458 <Method void GlideException(String)>
	//   38   80:iload_1         
	//   39   81:invokespecial   #460 <Method void onLoadFailed(GlideException, int)>
			return;
	//   40   84:return          
		}
		if(status != Status.RUNNING)
	//*  41   85:aload_0         
	//*  42   86:getfield        #234 <Field SingleRequest$Status status>
	//*  43   89:getstatic       #463 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//*  44   92:if_acmpeq       246
		{
			if(status == Status.COMPLETE)
	//*  45   95:aload_0         
	//*  46   96:getfield        #234 <Field SingleRequest$Status status>
	//*  47   99:getstatic       #377 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//*  48  102:if_acmpne       117
			{
				onResourceReady(resource, DataSource.MEMORY_CACHE);
	//   49  105:aload_0         
	//   50  106:aload_0         
	//   51  107:getfield        #379 <Field Resource resource>
	//   52  110:getstatic       #469 <Field DataSource DataSource.MEMORY_CACHE>
	//   53  113:invokevirtual   #472 <Method void onResourceReady(Resource, DataSource)>
				return;
	//   54  116:return          
			}
			status = Status.WAITING_FOR_SIZE;
	//   55  117:aload_0         
	//   56  118:getstatic       #475 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//   57  121:putfield        #234 <Field SingleRequest$Status status>
			if(Util.isValidDimensions(overrideWidth, overrideHeight))
	//*  58  124:aload_0         
	//*  59  125:getfield        #217 <Field int overrideWidth>
	//*  60  128:aload_0         
	//*  61  129:getfield        #219 <Field int overrideHeight>
	//*  62  132:invokestatic    #455 <Method boolean Util.isValidDimensions(int, int)>
	//*  63  135:ifeq            153
				onSizeReady(overrideWidth, overrideHeight);
	//   64  138:aload_0         
	//   65  139:aload_0         
	//   66  140:getfield        #217 <Field int overrideWidth>
	//   67  143:aload_0         
	//   68  144:getfield        #219 <Field int overrideHeight>
	//   69  147:invokevirtual   #479 <Method void onSizeReady(int, int)>
			else
	//*  70  150:goto            163
				target.getSize(((SizeReadyCallback) (this)));
	//   71  153:aload_0         
	//   72  154:getfield        #159 <Field Target target>
	//   73  157:aload_0         
	//   74  158:invokeinterface #482 <Method void Target.getSize(SizeReadyCallback)>
			if((status == Status.RUNNING || status == Status.WAITING_FOR_SIZE) && canNotifyStatusChanged())
	//*  75  163:aload_0         
	//*  76  164:getfield        #234 <Field SingleRequest$Status status>
	//*  77  167:getstatic       #463 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//*  78  170:if_acmpeq       183
	//*  79  173:aload_0         
	//*  80  174:getfield        #234 <Field SingleRequest$Status status>
	//*  81  177:getstatic       #475 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//*  82  180:if_acmpne       203
	//*  83  183:aload_0         
	//*  84  184:invokespecial   #437 <Method boolean canNotifyStatusChanged()>
	//*  85  187:ifeq            203
				target.onLoadStarted(getPlaceholderDrawable());
	//   86  190:aload_0         
	//   87  191:getfield        #159 <Field Target target>
	//   88  194:aload_0         
	//   89  195:invokespecial   #441 <Method Drawable getPlaceholderDrawable()>
	//   90  198:invokeinterface #485 <Method void Target.onLoadStarted(Drawable)>
			if(IS_VERBOSE_LOGGABLE)
	//*  91  203:getstatic       #103 <Field boolean IS_VERBOSE_LOGGABLE>
	//*  92  206:ifeq            245
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   93  209:new             #266 <Class StringBuilder>
	//   94  212:dup             
	//   95  213:invokespecial   #267 <Method void StringBuilder()>
	//   96  216:astore_2        
				stringbuilder.append("finished run method in ");
	//   97  217:aload_2         
	//   98  218:ldc2            #487 <String "finished run method in ">
	//   99  221:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  100  224:pop             
				stringbuilder.append(LogTime.getElapsedMillis(startTime));
	//  101  225:aload_2         
	//  102  226:aload_0         
	//  103  227:getfield        #398 <Field long startTime>
	//  104  230:invokestatic    #404 <Method double LogTime.getElapsedMillis(long)>
	//  105  233:invokevirtual   #407 <Method StringBuilder StringBuilder.append(double)>
	//  106  236:pop             
				logV(stringbuilder.toString());
	//  107  237:aload_0         
	//  108  238:aload_2         
	//  109  239:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  110  242:invokespecial   #489 <Method void logV(String)>
			}
			return;
	//  111  245:return          
		} else
		{
			throw new IllegalArgumentException("Cannot restart a running request");
	//  112  246:new             #491 <Class IllegalArgumentException>
	//  113  249:dup             
	//  114  250:ldc2            #493 <String "Cannot restart a running request">
	//  115  253:invokespecial   #494 <Method void IllegalArgumentException(String)>
	//  116  256:athrow          
		}
	}

	public void clear()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #498 <Method void Util.assertMainThread()>
		assertNotCallingCallbacks();
	//    1    3:aload_0         
	//    2    4:invokespecial   #154 <Method void assertNotCallingCallbacks()>
		stateVerifier.throwIfRecycled();
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field StateVerifier stateVerifier>
	//    5   11:invokevirtual   #157 <Method void StateVerifier.throwIfRecycled()>
		if(status == Status.CLEARED)
	//*   6   14:aload_0         
	//*   7   15:getfield        #234 <Field SingleRequest$Status status>
	//*   8   18:getstatic       #501 <Field SingleRequest$Status SingleRequest$Status.CLEARED>
	//*   9   21:if_acmpne       25
			return;
	//   10   24:return          
		cancel();
	//   11   25:aload_0         
	//   12   26:invokespecial   #502 <Method void cancel()>
		Resource resource1 = resource;
	//   13   29:aload_0         
	//   14   30:getfield        #379 <Field Resource resource>
	//   15   33:astore_1        
		if(resource1 != null)
	//*  16   34:aload_1         
	//*  17   35:ifnull          43
			releaseResource(resource1);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #504 <Method void releaseResource(Resource)>
		if(canNotifyCleared())
	//*  21   43:aload_0         
	//*  22   44:invokespecial   #506 <Method boolean canNotifyCleared()>
	//*  23   47:ifeq            63
			target.onLoadCleared(getPlaceholderDrawable());
	//   24   50:aload_0         
	//   25   51:getfield        #159 <Field Target target>
	//   26   54:aload_0         
	//   27   55:invokespecial   #441 <Method Drawable getPlaceholderDrawable()>
	//   28   58:invokeinterface #509 <Method void Target.onLoadCleared(Drawable)>
		status = Status.CLEARED;
	//   29   63:aload_0         
	//   30   64:getstatic       #501 <Field SingleRequest$Status SingleRequest$Status.CLEARED>
	//   31   67:putfield        #234 <Field SingleRequest$Status status>
	//   32   70:return          
	}

	public StateVerifier getVerifier()
	{
		return stateVerifier;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field StateVerifier stateVerifier>
	//    2    4:areturn         
	}

	public boolean isCleared()
	{
		return status == Status.CLEARED;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field SingleRequest$Status status>
	//    2    4:getstatic       #501 <Field SingleRequest$Status SingleRequest$Status.CLEARED>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isComplete()
	{
		return status == Status.COMPLETE;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field SingleRequest$Status status>
	//    2    4:getstatic       #377 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isEquivalentTo(Request request)
	{
		boolean flag = request instanceof SingleRequest;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class SingleRequest>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            117
		{
			request = ((Request) ((SingleRequest)request));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class SingleRequest>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(overrideWidth == ((SingleRequest) (request)).overrideWidth)
	//*  12   18:aload_0         
	//*  13   19:getfield        #217 <Field int overrideWidth>
	//*  14   22:aload_1         
	//*  15   23:getfield        #217 <Field int overrideWidth>
	//*  16   26:icmpne          115
			{
				flag1 = flag2;
	//   17   29:iload_3         
	//   18   30:istore_2        
				if(overrideHeight == ((SingleRequest) (request)).overrideHeight)
	//*  19   31:aload_0         
	//*  20   32:getfield        #219 <Field int overrideHeight>
	//*  21   35:aload_1         
	//*  22   36:getfield        #219 <Field int overrideHeight>
	//*  23   39:icmpne          115
				{
					flag1 = flag2;
	//   24   42:iload_3         
	//   25   43:istore_2        
					if(Util.bothModelsNullEquivalentOrEquals(model, ((SingleRequest) (request)).model))
	//*  26   44:aload_0         
	//*  27   45:getfield        #213 <Field Object model>
	//*  28   48:aload_1         
	//*  29   49:getfield        #213 <Field Object model>
	//*  30   52:invokestatic    #519 <Method boolean Util.bothModelsNullEquivalentOrEquals(Object, Object)>
	//*  31   55:ifeq            115
					{
						flag1 = flag2;
	//   32   58:iload_3         
	//   33   59:istore_2        
						if(((Object) (transcodeClass)).equals(((Object) (((SingleRequest) (request)).transcodeClass))))
	//*  34   60:aload_0         
	//*  35   61:getfield        #215 <Field Class transcodeClass>
	//*  36   64:aload_1         
	//*  37   65:getfield        #215 <Field Class transcodeClass>
	//*  38   68:invokevirtual   #523 <Method boolean Object.equals(Object)>
	//*  39   71:ifeq            115
						{
							flag1 = flag2;
	//   40   74:iload_3         
	//   41   75:istore_2        
							if(requestOptions.equals(((Object) (((SingleRequest) (request)).requestOptions))))
	//*  42   76:aload_0         
	//*  43   77:getfield        #177 <Field RequestOptions requestOptions>
	//*  44   80:aload_1         
	//*  45   81:getfield        #177 <Field RequestOptions requestOptions>
	//*  46   84:invokevirtual   #524 <Method boolean RequestOptions.equals(Object)>
	//*  47   87:ifeq            115
							{
								flag1 = flag2;
	//   48   90:iload_3         
	//   49   91:istore_2        
								if(priority == ((SingleRequest) (request)).priority)
	//*  50   92:aload_0         
	//*  51   93:getfield        #221 <Field Priority priority>
	//*  52   96:aload_1         
	//*  53   97:getfield        #221 <Field Priority priority>
	//*  54  100:if_acmpne       115
								{
									flag1 = flag2;
	//   55  103:iload_3         
	//   56  104:istore_2        
									if(listenerCountEquals(this, ((SingleRequest) (request))))
	//*  57  105:aload_0         
	//*  58  106:aload_1         
	//*  59  107:invokestatic    #526 <Method boolean listenerCountEquals(SingleRequest, SingleRequest)>
	//*  60  110:ifeq            115
										flag1 = true;
	//   61  113:iconst_1        
	//   62  114:istore_2        
								}
							}
						}
					}
				}
			}
			return flag1;
	//   63  115:iload_2         
	//   64  116:ireturn         
		} else
		{
			return false;
	//   65  117:iconst_0        
	//   66  118:ireturn         
		}
	}

	public boolean isFailed()
	{
		return status == Status.FAILED;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field SingleRequest$Status status>
	//    2    4:getstatic       #348 <Field SingleRequest$Status SingleRequest$Status.FAILED>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isResourceSet()
	{
		return isComplete();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #530 <Method boolean isComplete()>
	//    2    4:ireturn         
	}

	public boolean isRunning()
	{
		return status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field SingleRequest$Status status>
	//    2    4:getstatic       #463 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//    3    7:if_acmpeq       25
	//    4   10:aload_0         
	//    5   11:getfield        #234 <Field SingleRequest$Status status>
	//    6   14:getstatic       #475 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//    7   17:if_acmpne       23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	public void onLoadFailed(GlideException glideexception)
	{
		onLoadFailed(glideexception, 5);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_5        
	//    3    3:invokespecial   #460 <Method void onLoadFailed(GlideException, int)>
	//    4    6:return          
	}

	public void onResourceReady(Resource resource1, DataSource datasource)
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #157 <Method void StateVerifier.throwIfRecycled()>
		loadStatus = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #167 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		if(resource1 == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       65
		{
			resource1 = ((Resource) (new StringBuilder()));
	//    8   16:new             #266 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #267 <Method void StringBuilder()>
	//   11   23:astore_1        
			((StringBuilder) (resource1)).append("Expected to receive a Resource<R> with an object of ");
	//   12   24:aload_1         
	//   13   25:ldc2            #534 <String "Expected to receive a Resource<R> with an object of ">
	//   14   28:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			((StringBuilder) (resource1)).append(((Object) (transcodeClass)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #215 <Field Class transcodeClass>
	//   19   37:invokevirtual   #323 <Method StringBuilder StringBuilder.append(Object)>
	//   20   40:pop             
			((StringBuilder) (resource1)).append(" inside, but instead got null.");
	//   21   41:aload_1         
	//   22   42:ldc2            #536 <String " inside, but instead got null.">
	//   23   45:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
			onLoadFailed(new GlideException(((StringBuilder) (resource1)).toString()));
	//   25   49:aload_0         
	//   26   50:new             #342 <Class GlideException>
	//   27   53:dup             
	//   28   54:aload_1         
	//   29   55:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   30   58:invokespecial   #458 <Method void GlideException(String)>
	//   31   61:invokevirtual   #538 <Method void onLoadFailed(GlideException)>
			return;
	//   32   64:return          
		}
		Object obj = resource1.get();
	//   33   65:aload_1         
	//   34   66:invokeinterface #543 <Method Object Resource.get()>
	//   35   71:astore          4
		if(obj != null && transcodeClass.isAssignableFrom(obj.getClass()))
	//*  36   73:aload           4
	//*  37   75:ifnull          125
	//*  38   78:aload_0         
	//*  39   79:getfield        #215 <Field Class transcodeClass>
	//*  40   82:aload           4
	//*  41   84:invokevirtual   #385 <Method Class Object.getClass()>
	//*  42   87:invokevirtual   #547 <Method boolean Class.isAssignableFrom(Class)>
	//*  43   90:ifne            96
	//*  44   93:goto            125
			if(!canSetResource())
	//*  45   96:aload_0         
	//*  46   97:invokespecial   #549 <Method boolean canSetResource()>
	//*  47  100:ifne            116
			{
				releaseResource(resource1);
	//   48  103:aload_0         
	//   49  104:aload_1         
	//   50  105:invokespecial   #504 <Method void releaseResource(Resource)>
				status = Status.COMPLETE;
	//   51  108:aload_0         
	//   52  109:getstatic       #377 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//   53  112:putfield        #234 <Field SingleRequest$Status status>
				return;
	//   54  115:return          
			} else
			{
				onResourceReady(resource1, obj, datasource);
	//   55  116:aload_0         
	//   56  117:aload_1         
	//   57  118:aload           4
	//   58  120:aload_2         
	//   59  121:invokespecial   #551 <Method void onResourceReady(Resource, Object, DataSource)>
				return;
	//   60  124:return          
			}
		releaseResource(resource1);
	//   61  125:aload_0         
	//   62  126:aload_1         
	//   63  127:invokespecial   #504 <Method void releaseResource(Resource)>
		StringBuilder stringbuilder = new StringBuilder();
	//   64  130:new             #266 <Class StringBuilder>
	//   65  133:dup             
	//   66  134:invokespecial   #267 <Method void StringBuilder()>
	//   67  137:astore_3        
		stringbuilder.append("Expected to receive an object of ");
	//   68  138:aload_3         
	//   69  139:ldc2            #553 <String "Expected to receive an object of ">
	//   70  142:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   71  145:pop             
		stringbuilder.append(((Object) (transcodeClass)));
	//   72  146:aload_3         
	//   73  147:aload_0         
	//   74  148:getfield        #215 <Field Class transcodeClass>
	//   75  151:invokevirtual   #323 <Method StringBuilder StringBuilder.append(Object)>
	//   76  154:pop             
		stringbuilder.append(" but instead got ");
	//   77  155:aload_3         
	//   78  156:ldc2            #555 <String " but instead got ">
	//   79  159:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   80  162:pop             
		if(obj != null)
	//*  81  163:aload           4
	//*  82  165:ifnull          177
			datasource = ((DataSource) (obj.getClass()));
	//   83  168:aload           4
	//   84  170:invokevirtual   #385 <Method Class Object.getClass()>
	//   85  173:astore_2        
		else
	//*  86  174:goto            181
			datasource = "";
	//   87  177:ldc2            #557 <String "">
	//   88  180:astore_2        
		stringbuilder.append(((Object) (datasource)));
	//   89  181:aload_3         
	//   90  182:aload_2         
	//   91  183:invokevirtual   #323 <Method StringBuilder StringBuilder.append(Object)>
	//   92  186:pop             
		stringbuilder.append("{");
	//   93  187:aload_3         
	//   94  188:ldc2            #559 <String "{">
	//   95  191:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   96  194:pop             
		stringbuilder.append(obj);
	//   97  195:aload_3         
	//   98  196:aload           4
	//   99  198:invokevirtual   #323 <Method StringBuilder StringBuilder.append(Object)>
	//  100  201:pop             
		stringbuilder.append("} inside Resource{");
	//  101  202:aload_3         
	//  102  203:ldc2            #561 <String "} inside Resource{">
	//  103  206:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  104  209:pop             
		stringbuilder.append(((Object) (resource1)));
	//  105  210:aload_3         
	//  106  211:aload_1         
	//  107  212:invokevirtual   #323 <Method StringBuilder StringBuilder.append(Object)>
	//  108  215:pop             
		stringbuilder.append("}.");
	//  109  216:aload_3         
	//  110  217:ldc2            #563 <String "}.">
	//  111  220:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  112  223:pop             
		if(obj != null)
	//* 113  224:aload           4
	//* 114  226:ifnull          236
			resource1 = "";
	//  115  229:ldc2            #557 <String "">
	//  116  232:astore_1        
		else
	//* 117  233:goto            240
			resource1 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
	//  118  236:ldc2            #565 <String " To indicate failure return a null Resource object, rather than a Resource object containing null data.">
	//  119  239:astore_1        
		stringbuilder.append(((String) (resource1)));
	//  120  240:aload_3         
	//  121  241:aload_1         
	//  122  242:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  123  245:pop             
		onLoadFailed(new GlideException(stringbuilder.toString()));
	//  124  246:aload_0         
	//  125  247:new             #342 <Class GlideException>
	//  126  250:dup             
	//  127  251:aload_3         
	//  128  252:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  129  255:invokespecial   #458 <Method void GlideException(String)>
	//  130  258:invokevirtual   #538 <Method void onLoadFailed(GlideException)>
	//  131  261:return          
	}

	public void onSizeReady(int i, int j)
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #157 <Method void StateVerifier.throwIfRecycled()>
		if(IS_VERBOSE_LOGGABLE)
	//*   3    7:getstatic       #103 <Field boolean IS_VERBOSE_LOGGABLE>
	//*   4   10:ifeq            53
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   13:new             #266 <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #267 <Method void StringBuilder()>
	//    8   20:astore          4
			stringbuilder.append("Got onSizeReady in ");
	//    9   22:aload           4
	//   10   24:ldc2            #568 <String "Got onSizeReady in ">
	//   11   27:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   12   30:pop             
			stringbuilder.append(LogTime.getElapsedMillis(startTime));
	//   13   31:aload           4
	//   14   33:aload_0         
	//   15   34:getfield        #398 <Field long startTime>
	//   16   37:invokestatic    #404 <Method double LogTime.getElapsedMillis(long)>
	//   17   40:invokevirtual   #407 <Method StringBuilder StringBuilder.append(double)>
	//   18   43:pop             
			logV(stringbuilder.toString());
	//   19   44:aload_0         
	//   20   45:aload           4
	//   21   47:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   22   50:invokespecial   #489 <Method void logV(String)>
		}
		if(status != Status.WAITING_FOR_SIZE)
	//*  23   53:aload_0         
	//*  24   54:getfield        #234 <Field SingleRequest$Status status>
	//*  25   57:getstatic       #475 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//*  26   60:if_acmpeq       64
			return;
	//   27   63:return          
		status = Status.RUNNING;
	//   28   64:aload_0         
	//   29   65:getstatic       #463 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//   30   68:putfield        #234 <Field SingleRequest$Status status>
		float f = requestOptions.getSizeMultiplier();
	//   31   71:aload_0         
	//   32   72:getfield        #177 <Field RequestOptions requestOptions>
	//   33   75:invokevirtual   #572 <Method float RequestOptions.getSizeMultiplier()>
	//   34   78:fstore_3        
		width = maybeApplySizeMultiplier(i, f);
	//   35   79:aload_0         
	//   36   80:iload_1         
	//   37   81:fload_3         
	//   38   82:invokestatic    #574 <Method int maybeApplySizeMultiplier(int, float)>
	//   39   85:putfield        #327 <Field int width>
		height = maybeApplySizeMultiplier(j, f);
	//   40   88:aload_0         
	//   41   89:iload_2         
	//   42   90:fload_3         
	//   43   91:invokestatic    #574 <Method int maybeApplySizeMultiplier(int, float)>
	//   44   94:putfield        #334 <Field int height>
		if(IS_VERBOSE_LOGGABLE)
	//*  45   97:getstatic       #103 <Field boolean IS_VERBOSE_LOGGABLE>
	//*  46  100:ifeq            143
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   47  103:new             #266 <Class StringBuilder>
	//   48  106:dup             
	//   49  107:invokespecial   #267 <Method void StringBuilder()>
	//   50  110:astore          4
			stringbuilder1.append("finished setup for calling load in ");
	//   51  112:aload           4
	//   52  114:ldc2            #576 <String "finished setup for calling load in ">
	//   53  117:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   54  120:pop             
			stringbuilder1.append(LogTime.getElapsedMillis(startTime));
	//   55  121:aload           4
	//   56  123:aload_0         
	//   57  124:getfield        #398 <Field long startTime>
	//   58  127:invokestatic    #404 <Method double LogTime.getElapsedMillis(long)>
	//   59  130:invokevirtual   #407 <Method StringBuilder StringBuilder.append(double)>
	//   60  133:pop             
			logV(stringbuilder1.toString());
	//   61  134:aload_0         
	//   62  135:aload           4
	//   63  137:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   64  140:invokespecial   #489 <Method void logV(String)>
		}
		loadStatus = engine.load(glideContext, model, requestOptions.getSignature(), width, height, requestOptions.getResourceClass(), transcodeClass, priority, requestOptions.getDiskCacheStrategy(), requestOptions.getTransformations(), requestOptions.isTransformationRequired(), requestOptions.isScaleOnlyOrNoTransform(), requestOptions.getOptions(), requestOptions.isMemoryCacheable(), requestOptions.getUseUnlimitedSourceGeneratorsPool(), requestOptions.getUseAnimationPool(), requestOptions.getOnlyRetrieveFromCache(), ((ResourceCallback) (this)));
	//   65  143:aload_0         
	//   66  144:aload_0         
	//   67  145:getfield        #227 <Field Engine engine>
	//   68  148:aload_0         
	//   69  149:getfield        #211 <Field GlideContext glideContext>
	//   70  152:aload_0         
	//   71  153:getfield        #213 <Field Object model>
	//   72  156:aload_0         
	//   73  157:getfield        #177 <Field RequestOptions requestOptions>
	//   74  160:invokevirtual   #580 <Method com.bumptech.glide.load.Key RequestOptions.getSignature()>
	//   75  163:aload_0         
	//   76  164:getfield        #327 <Field int width>
	//   77  167:aload_0         
	//   78  168:getfield        #334 <Field int height>
	//   79  171:aload_0         
	//   80  172:getfield        #177 <Field RequestOptions requestOptions>
	//   81  175:invokevirtual   #583 <Method Class RequestOptions.getResourceClass()>
	//   82  178:aload_0         
	//   83  179:getfield        #215 <Field Class transcodeClass>
	//   84  182:aload_0         
	//   85  183:getfield        #221 <Field Priority priority>
	//   86  186:aload_0         
	//   87  187:getfield        #177 <Field RequestOptions requestOptions>
	//   88  190:invokevirtual   #587 <Method com.bumptech.glide.load.engine.DiskCacheStrategy RequestOptions.getDiskCacheStrategy()>
	//   89  193:aload_0         
	//   90  194:getfield        #177 <Field RequestOptions requestOptions>
	//   91  197:invokevirtual   #591 <Method java.util.Map RequestOptions.getTransformations()>
	//   92  200:aload_0         
	//   93  201:getfield        #177 <Field RequestOptions requestOptions>
	//   94  204:invokevirtual   #594 <Method boolean RequestOptions.isTransformationRequired()>
	//   95  207:aload_0         
	//   96  208:getfield        #177 <Field RequestOptions requestOptions>
	//   97  211:invokevirtual   #597 <Method boolean RequestOptions.isScaleOnlyOrNoTransform()>
	//   98  214:aload_0         
	//   99  215:getfield        #177 <Field RequestOptions requestOptions>
	//  100  218:invokevirtual   #601 <Method com.bumptech.glide.load.Options RequestOptions.getOptions()>
	//  101  221:aload_0         
	//  102  222:getfield        #177 <Field RequestOptions requestOptions>
	//  103  225:invokevirtual   #604 <Method boolean RequestOptions.isMemoryCacheable()>
	//  104  228:aload_0         
	//  105  229:getfield        #177 <Field RequestOptions requestOptions>
	//  106  232:invokevirtual   #607 <Method boolean RequestOptions.getUseUnlimitedSourceGeneratorsPool()>
	//  107  235:aload_0         
	//  108  236:getfield        #177 <Field RequestOptions requestOptions>
	//  109  239:invokevirtual   #610 <Method boolean RequestOptions.getUseAnimationPool()>
	//  110  242:aload_0         
	//  111  243:getfield        #177 <Field RequestOptions requestOptions>
	//  112  246:invokevirtual   #613 <Method boolean RequestOptions.getOnlyRetrieveFromCache()>
	//  113  249:aload_0         
	//  114  250:invokevirtual   #617 <Method com.bumptech.glide.load.engine.Engine$LoadStatus Engine.load(GlideContext, Object, com.bumptech.glide.load.Key, int, int, Class, Class, Priority, com.bumptech.glide.load.engine.DiskCacheStrategy, java.util.Map, boolean, boolean, com.bumptech.glide.load.Options, boolean, boolean, boolean, boolean, ResourceCallback)>
	//  115  253:putfield        #167 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		if(status != Status.RUNNING)
	//* 116  256:aload_0         
	//* 117  257:getfield        #234 <Field SingleRequest$Status status>
	//* 118  260:getstatic       #463 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//* 119  263:if_acmpeq       271
			loadStatus = null;
	//  120  266:aload_0         
	//  121  267:aconst_null     
	//  122  268:putfield        #167 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		if(IS_VERBOSE_LOGGABLE)
	//* 123  271:getstatic       #103 <Field boolean IS_VERBOSE_LOGGABLE>
	//* 124  274:ifeq            317
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//  125  277:new             #266 <Class StringBuilder>
	//  126  280:dup             
	//  127  281:invokespecial   #267 <Method void StringBuilder()>
	//  128  284:astore          4
			stringbuilder2.append("finished onSizeReady in ");
	//  129  286:aload           4
	//  130  288:ldc2            #619 <String "finished onSizeReady in ">
	//  131  291:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  132  294:pop             
			stringbuilder2.append(LogTime.getElapsedMillis(startTime));
	//  133  295:aload           4
	//  134  297:aload_0         
	//  135  298:getfield        #398 <Field long startTime>
	//  136  301:invokestatic    #404 <Method double LogTime.getElapsedMillis(long)>
	//  137  304:invokevirtual   #407 <Method StringBuilder StringBuilder.append(double)>
	//  138  307:pop             
			logV(stringbuilder2.toString());
	//  139  308:aload_0         
	//  140  309:aload           4
	//  141  311:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  142  314:invokespecial   #489 <Method void logV(String)>
		}
	//  143  317:return          
	}

	public void recycle()
	{
		assertNotCallingCallbacks();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void assertNotCallingCallbacks()>
		context = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #209 <Field Context context>
		glideContext = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #211 <Field GlideContext glideContext>
		model = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #213 <Field Object model>
		transcodeClass = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #215 <Field Class transcodeClass>
		requestOptions = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #177 <Field RequestOptions requestOptions>
		overrideWidth = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #217 <Field int overrideWidth>
		overrideHeight = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #219 <Field int overrideHeight>
		target = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #159 <Field Target target>
		requestListeners = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #225 <Field List requestListeners>
		targetListener = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #223 <Field RequestListener targetListener>
		requestCoordinator = null;
	//   32   54:aload_0         
	//   33   55:aconst_null     
	//   34   56:putfield        #139 <Field RequestCoordinator requestCoordinator>
		animationFactory = null;
	//   35   59:aload_0         
	//   36   60:aconst_null     
	//   37   61:putfield        #229 <Field TransitionFactory animationFactory>
		loadStatus = null;
	//   38   64:aload_0         
	//   39   65:aconst_null     
	//   40   66:putfield        #167 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		errorDrawable = null;
	//   41   69:aload_0         
	//   42   70:aconst_null     
	//   43   71:putfield        #175 <Field Drawable errorDrawable>
		placeholderDrawable = null;
	//   44   74:aload_0         
	//   45   75:aconst_null     
	//   46   76:putfield        #200 <Field Drawable placeholderDrawable>
		fallbackDrawable = null;
	//   47   79:aload_0         
	//   48   80:aconst_null     
	//   49   81:putfield        #192 <Field Drawable fallbackDrawable>
		width = -1;
	//   50   84:aload_0         
	//   51   85:iconst_m1       
	//   52   86:putfield        #327 <Field int width>
		height = -1;
	//   53   89:aload_0         
	//   54   90:iconst_m1       
	//   55   91:putfield        #334 <Field int height>
		POOL.release(((Object) (this)));
	//   56   94:getstatic       #95  <Field android.support.v4.util.Pools$Pool POOL>
	//   57   97:aload_0         
	//   58   98:invokeinterface #622 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   59  103:pop             
	//   60  104:return          
	}

	private static final String GLIDE_TAG = "Glide";
	private static final boolean IS_VERBOSE_LOGGABLE = Log.isLoggable("Request", 2);
	private static final android.support.v4.util.Pools.Pool POOL = FactoryPools.simple(150, new com.bumptech.glide.util.pool.FactoryPools.Factory() {

		public SingleRequest create()
		{
			return new SingleRequest();
		//    0    0:new             #9   <Class SingleRequest>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void SingleRequest()>
		//    3    7:areturn         
		}

		public volatile Object create()
		{
			return ((Object) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #22  <Method SingleRequest create()>
		//    2    4:areturn         
		}

	}
);
	private static final String TAG = "Request";
	private TransitionFactory animationFactory;
	private Context context;
	private Engine engine;
	private Drawable errorDrawable;
	private Drawable fallbackDrawable;
	private GlideContext glideContext;
	private int height;
	private boolean isCallingCallbacks;
	private com.bumptech.glide.load.engine.Engine.LoadStatus loadStatus;
	private Object model;
	private int overrideHeight;
	private int overrideWidth;
	private Drawable placeholderDrawable;
	private Priority priority;
	private RequestCoordinator requestCoordinator;
	private List requestListeners;
	private RequestOptions requestOptions;
	private Resource resource;
	private long startTime;
	private final StateVerifier stateVerifier = StateVerifier.newInstance();
	private Status status;
	private final String tag;
	private Target target;
	private RequestListener targetListener;
	private Class transcodeClass;
	private int width;

	static 
	{
	//    0    0:sipush          150
	//    1    3:new             #15  <Class SingleRequest$1>
	//    2    6:dup             
	//    3    7:invokespecial   #87  <Method void SingleRequest$1()>
	//    4   10:invokestatic    #93  <Method android.support.v4.util.Pools$Pool FactoryPools.simple(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
	//    5   13:putstatic       #95  <Field android.support.v4.util.Pools$Pool POOL>
	//    6   16:ldc1            #30  <String "Request">
	//    7   18:iconst_2        
	//    8   19:invokestatic    #101 <Method boolean Log.isLoggable(String, int)>
	//    9   22:putstatic       #103 <Field boolean IS_VERBOSE_LOGGABLE>
	//*  10   25:return          
	}
}
