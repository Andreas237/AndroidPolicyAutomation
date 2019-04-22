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
import java.util.concurrent.Executor;

// Referenced classes of package com.bumptech.glide.request:
//			Request, ResourceCallback, RequestCoordinator, BaseRequestOptions, 
//			RequestListener

public final class SingleRequest
	implements Request, ResourceCallback, SizeReadyCallback, com.bumptech.glide.util.pool.FactoryPools.Poolable
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
	//    1    1:invokespecial   #109 <Method void Object()>
		String s;
		if(IS_VERBOSE_LOGGABLE)
	//*   2    4:getstatic       #107 <Field boolean IS_VERBOSE_LOGGABLE>
	//*   3    7:ifeq            21
			s = String.valueOf(super.hashCode());
	//    4   10:aload_0         
	//    5   11:invokespecial   #113 <Method int Object.hashCode()>
	//    6   14:invokestatic    #119 <Method String String.valueOf(int)>
	//    7   17:astore_1        
		else
	//*   8   18:goto            23
			s = null;
	//    9   21:aconst_null     
	//   10   22:astore_1        
		tag = s;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #121 <Field String tag>
	//   14   28:aload_0         
	//   15   29:invokestatic    #127 <Method StateVerifier StateVerifier.newInstance()>
	//   16   32:putfield        #129 <Field StateVerifier stateVerifier>
	//   17   35:return          
	}

	private void assertNotCallingCallbacks()
	{
		if(!isCallingCallbacks)
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field boolean isCallingCallbacks>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
	//    4    8:new             #134 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #136 <String "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.">
	//    7   14:invokespecial   #139 <Method void IllegalStateException(String)>
	//    8   17:athrow          
	}

	private boolean canNotifyCleared()
	{
		RequestCoordinator requestcoordinator = requestCoordinator;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canNotifyCleared(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #148 <Method boolean RequestCoordinator.canNotifyCleared(Request)>
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
	//    1    1:getfield        #143 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canNotifyStatusChanged(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #151 <Method boolean RequestCoordinator.canNotifyStatusChanged(Request)>
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
	//    1    1:getfield        #143 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		return requestcoordinator == null || requestcoordinator.canSetImage(((Request) (this)));
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #155 <Method boolean RequestCoordinator.canSetImage(Request)>
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
	//    1    1:invokespecial   #158 <Method void assertNotCallingCallbacks()>
		stateVerifier.throwIfRecycled();
	//    2    4:aload_0         
	//    3    5:getfield        #129 <Field StateVerifier stateVerifier>
	//    4    8:invokevirtual   #161 <Method void StateVerifier.throwIfRecycled()>
		target.removeCallback(((SizeReadyCallback) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #163 <Field Target target>
	//    7   15:aload_0         
	//    8   16:invokeinterface #169 <Method void Target.removeCallback(SizeReadyCallback)>
		com.bumptech.glide.load.engine.Engine.LoadStatus loadstatus = loadStatus;
	//    9   21:aload_0         
	//   10   22:getfield        #171 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
	//   11   25:astore_1        
		if(loadstatus != null)
	//*  12   26:aload_1         
	//*  13   27:ifnull          39
		{
			loadstatus.cancel();
	//   14   30:aload_1         
	//   15   31:invokevirtual   #175 <Method void com.bumptech.glide.load.engine.Engine$LoadStatus.cancel()>
			loadStatus = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #171 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		}
	//   19   39:return          
	}

	private Drawable getErrorDrawable()
	{
		if(errorDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field Drawable errorDrawable>
	//*   2    4:ifnonnull       50
		{
			errorDrawable = requestOptions.getErrorPlaceholder();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #181 <Field BaseRequestOptions requestOptions>
	//    6   12:invokevirtual   #186 <Method Drawable BaseRequestOptions.getErrorPlaceholder()>
	//    7   15:putfield        #179 <Field Drawable errorDrawable>
			if(errorDrawable == null && requestOptions.getErrorId() > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #179 <Field Drawable errorDrawable>
	//*  10   22:ifnonnull       50
	//*  11   25:aload_0         
	//*  12   26:getfield        #181 <Field BaseRequestOptions requestOptions>
	//*  13   29:invokevirtual   #189 <Method int BaseRequestOptions.getErrorId()>
	//*  14   32:ifle            50
				errorDrawable = loadDrawable(requestOptions.getErrorId());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #181 <Field BaseRequestOptions requestOptions>
	//   19   41:invokevirtual   #189 <Method int BaseRequestOptions.getErrorId()>
	//   20   44:invokespecial   #193 <Method Drawable loadDrawable(int)>
	//   21   47:putfield        #179 <Field Drawable errorDrawable>
		}
		return errorDrawable;
	//   22   50:aload_0         
	//   23   51:getfield        #179 <Field Drawable errorDrawable>
	//   24   54:areturn         
	}

	private Drawable getFallbackDrawable()
	{
		if(fallbackDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field Drawable fallbackDrawable>
	//*   2    4:ifnonnull       50
		{
			fallbackDrawable = requestOptions.getFallbackDrawable();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #181 <Field BaseRequestOptions requestOptions>
	//    6   12:invokevirtual   #198 <Method Drawable BaseRequestOptions.getFallbackDrawable()>
	//    7   15:putfield        #196 <Field Drawable fallbackDrawable>
			if(fallbackDrawable == null && requestOptions.getFallbackId() > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #196 <Field Drawable fallbackDrawable>
	//*  10   22:ifnonnull       50
	//*  11   25:aload_0         
	//*  12   26:getfield        #181 <Field BaseRequestOptions requestOptions>
	//*  13   29:invokevirtual   #201 <Method int BaseRequestOptions.getFallbackId()>
	//*  14   32:ifle            50
				fallbackDrawable = loadDrawable(requestOptions.getFallbackId());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #181 <Field BaseRequestOptions requestOptions>
	//   19   41:invokevirtual   #201 <Method int BaseRequestOptions.getFallbackId()>
	//   20   44:invokespecial   #193 <Method Drawable loadDrawable(int)>
	//   21   47:putfield        #196 <Field Drawable fallbackDrawable>
		}
		return fallbackDrawable;
	//   22   50:aload_0         
	//   23   51:getfield        #196 <Field Drawable fallbackDrawable>
	//   24   54:areturn         
	}

	private Drawable getPlaceholderDrawable()
	{
		if(placeholderDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #204 <Field Drawable placeholderDrawable>
	//*   2    4:ifnonnull       50
		{
			placeholderDrawable = requestOptions.getPlaceholderDrawable();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #181 <Field BaseRequestOptions requestOptions>
	//    6   12:invokevirtual   #206 <Method Drawable BaseRequestOptions.getPlaceholderDrawable()>
	//    7   15:putfield        #204 <Field Drawable placeholderDrawable>
			if(placeholderDrawable == null && requestOptions.getPlaceholderId() > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #204 <Field Drawable placeholderDrawable>
	//*  10   22:ifnonnull       50
	//*  11   25:aload_0         
	//*  12   26:getfield        #181 <Field BaseRequestOptions requestOptions>
	//*  13   29:invokevirtual   #209 <Method int BaseRequestOptions.getPlaceholderId()>
	//*  14   32:ifle            50
				placeholderDrawable = loadDrawable(requestOptions.getPlaceholderId());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #181 <Field BaseRequestOptions requestOptions>
	//   19   41:invokevirtual   #209 <Method int BaseRequestOptions.getPlaceholderId()>
	//   20   44:invokespecial   #193 <Method Drawable loadDrawable(int)>
	//   21   47:putfield        #204 <Field Drawable placeholderDrawable>
		}
		return placeholderDrawable;
	//   22   50:aload_0         
	//   23   51:getfield        #204 <Field Drawable placeholderDrawable>
	//   24   54:areturn         
	}

	private void init(Context context1, GlideContext glidecontext, Object obj, Class class1, BaseRequestOptions baserequestoptions, int i, int j, 
			Priority priority1, Target target1, RequestListener requestlistener, List list, RequestCoordinator requestcoordinator, Engine engine1, TransitionFactory transitionfactory, 
			Executor executor)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		context = context1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #213 <Field Context context>
		glideContext = glidecontext;
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:putfield        #215 <Field GlideContext glideContext>
		model = obj;
	//    8   12:aload_0         
	//    9   13:aload_3         
	//   10   14:putfield        #217 <Field Object model>
		transcodeClass = class1;
	//   11   17:aload_0         
	//   12   18:aload           4
	//   13   20:putfield        #219 <Field Class transcodeClass>
		requestOptions = baserequestoptions;
	//   14   23:aload_0         
	//   15   24:aload           5
	//   16   26:putfield        #181 <Field BaseRequestOptions requestOptions>
		overrideWidth = i;
	//   17   29:aload_0         
	//   18   30:iload           6
	//   19   32:putfield        #221 <Field int overrideWidth>
		overrideHeight = j;
	//   20   35:aload_0         
	//   21   36:iload           7
	//   22   38:putfield        #223 <Field int overrideHeight>
		priority = priority1;
	//   23   41:aload_0         
	//   24   42:aload           8
	//   25   44:putfield        #225 <Field Priority priority>
		target = target1;
	//   26   47:aload_0         
	//   27   48:aload           9
	//   28   50:putfield        #163 <Field Target target>
		targetListener = requestlistener;
	//   29   53:aload_0         
	//   30   54:aload           10
	//   31   56:putfield        #227 <Field RequestListener targetListener>
		requestListeners = list;
	//   32   59:aload_0         
	//   33   60:aload           11
	//   34   62:putfield        #229 <Field List requestListeners>
		requestCoordinator = requestcoordinator;
	//   35   65:aload_0         
	//   36   66:aload           12
	//   37   68:putfield        #143 <Field RequestCoordinator requestCoordinator>
		engine = engine1;
	//   38   71:aload_0         
	//   39   72:aload           13
	//   40   74:putfield        #231 <Field Engine engine>
		animationFactory = transitionfactory;
	//   41   77:aload_0         
	//   42   78:aload           14
	//   43   80:putfield        #233 <Field TransitionFactory animationFactory>
		callbackExecutor = executor;
	//   44   83:aload_0         
	//   45   84:aload           15
	//   46   86:putfield        #235 <Field Executor callbackExecutor>
		status = Status.PENDING;
	//   47   89:aload_0         
	//   48   90:getstatic       #238 <Field SingleRequest$Status SingleRequest$Status.PENDING>
	//   49   93:putfield        #240 <Field SingleRequest$Status status>
		if(requestOrigin == null && glidecontext.isLoggingRequestOriginsEnabled())
	//*  50   96:aload_0         
	//*  51   97:getfield        #242 <Field RuntimeException requestOrigin>
	//*  52  100:ifnonnull       123
	//*  53  103:aload_2         
	//*  54  104:invokevirtual   #247 <Method boolean GlideContext.isLoggingRequestOriginsEnabled()>
	//*  55  107:ifeq            123
			requestOrigin = new RuntimeException("Glide request origin trace");
	//   56  110:aload_0         
	//   57  111:new             #249 <Class RuntimeException>
	//   58  114:dup             
	//   59  115:ldc1            #251 <String "Glide request origin trace">
	//   60  117:invokespecial   #252 <Method void RuntimeException(String)>
	//   61  120:putfield        #242 <Field RuntimeException requestOrigin>
		this;
	//   62  123:aload_0         
		JVM INSTR monitorexit ;
	//   63  124:monitorexit     
		return;
	//   64  125:return          
		context1;
	//   65  126:astore_1        
	//*  66  127:aload_0         
		throw context1;
	//   67  128:monitorexit     
	//   68  129:aload_1         
	//   69  130:athrow          
	}

	private boolean isFirstReadyResource()
	{
		RequestCoordinator requestcoordinator = requestCoordinator;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		return requestcoordinator == null || !requestcoordinator.isAnyResourceSet();
	//    3    5:aload_1         
	//    4    6:ifnull          23
	//    5    9:aload_1         
	//    6   10:invokeinterface #259 <Method boolean RequestCoordinator.isAnyResourceSet()>
	//    7   15:ifne            21
	//    8   18:goto            23
	//    9   21:iconst_0        
	//   10   22:ireturn         
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	private boolean listenerCountEquals(SingleRequest singlerequest)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		singlerequest;
	//    2    2:aload_1         
		JVM INSTR monitorenter ;
	//    3    3:monitorenter    
		List list = requestListeners;
	//    4    4:aload_0         
	//    5    5:getfield        #229 <Field List requestListeners>
	//    6    8:astore          5
		int i;
		boolean flag;
		flag = false;
	//    7   10:iconst_0        
	//    8   11:istore          4
		if(list == null)
	//*   9   13:aload           5
	//*  10   15:ifnonnull       23
		{
			i = 0;
	//   11   18:iconst_0        
	//   12   19:istore_2        
			break MISSING_BLOCK_LABEL_33;
	//   13   20:goto            33
		}
		i = requestListeners.size();
	//   14   23:aload_0         
	//   15   24:getfield        #229 <Field List requestListeners>
	//   16   27:invokeinterface #266 <Method int List.size()>
	//   17   32:istore_2        
		if(singlerequest.requestListeners != null) goto _L2; else goto _L1
	//   18   33:aload_1         
	//   19   34:getfield        #229 <Field List requestListeners>
	//   20   37:ifnonnull       45
_L1:
		int j = 0;
	//   21   40:iconst_0        
	//   22   41:istore_3        
		  goto _L3
	//*  23   42:goto            77
_L2:
		j = singlerequest.requestListeners.size();
	//   24   45:aload_1         
	//   25   46:getfield        #229 <Field List requestListeners>
	//   26   49:invokeinterface #266 <Method int List.size()>
	//   27   54:istore_3        
		  goto _L3
	//*  28   55:goto            77
_L5:
		singlerequest;
	//   29   58:aload_1         
		JVM INSTR monitorexit ;
	//   30   59:monitorexit     
		this;
	//   31   60:aload_0         
		JVM INSTR monitorexit ;
	//   32   61:monitorexit     
		return flag;
	//   33   62:iload           4
	//   34   64:ireturn         
		Exception exception;
		exception;
	//   35   65:astore          5
		singlerequest;
	//   36   67:aload_1         
		JVM INSTR monitorexit ;
	//   37   68:monitorexit     
		throw exception;
	//   38   69:aload           5
	//   39   71:athrow          
		singlerequest;
	//   40   72:astore_1        
		this;
	//   41   73:aload_0         
		JVM INSTR monitorexit ;
	//   42   74:monitorexit     
		throw singlerequest;
	//   43   75:aload_1         
	//   44   76:athrow          
_L3:
		if(i == j)
	//*  45   77:iload_2         
	//*  46   78:iload_3         
	//*  47   79:icmpne          58
			flag = true;
	//   48   82:iconst_1        
	//   49   83:istore          4
		if(true) goto _L5; else goto _L4
	//   50   85:goto            58
_L4:
	}

	private Drawable loadDrawable(int i)
	{
		android.content.res.Resources.Theme theme;
		if(requestOptions.getTheme() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #181 <Field BaseRequestOptions requestOptions>
	//*   2    4:invokevirtual   #272 <Method android.content.res.Resources$Theme BaseRequestOptions.getTheme()>
	//*   3    7:ifnull          21
			theme = requestOptions.getTheme();
	//    4   10:aload_0         
	//    5   11:getfield        #181 <Field BaseRequestOptions requestOptions>
	//    6   14:invokevirtual   #272 <Method android.content.res.Resources$Theme BaseRequestOptions.getTheme()>
	//    7   17:astore_2        
		else
	//*   8   18:goto            29
			theme = context.getTheme();
	//    9   21:aload_0         
	//   10   22:getfield        #213 <Field Context context>
	//   11   25:invokevirtual   #275 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   12   28:astore_2        
		return DrawableDecoderCompat.getDrawable(((Context) (glideContext)), i, theme);
	//   13   29:aload_0         
	//   14   30:getfield        #215 <Field GlideContext glideContext>
	//   15   33:iload_1         
	//   16   34:aload_2         
	//   17   35:invokestatic    #281 <Method Drawable DrawableDecoderCompat.getDrawable(Context, int, android.content.res.Resources$Theme)>
	//   18   38:areturn         
	}

	private void logV(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #284 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #285 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(s);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(" this: ");
	//    8   14:aload_2         
	//    9   15:ldc2            #291 <String " this: ">
	//   10   18:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(tag);
	//   12   22:aload_2         
	//   13   23:aload_0         
	//   14   24:getfield        #121 <Field String tag>
	//   15   27:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		Log.v("Request", stringbuilder.toString());
	//   17   31:ldc1            #99  <String "Request">
	//   18   33:aload_2         
	//   19   34:invokevirtual   #295 <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #299 <Method int Log.v(String, String)>
	//   21   40:pop             
	//   22   41:return          
	}

	private static int maybeApplySizeMultiplier(int i, float f)
	{
		if(i == 0x80000000)
	//*   0    0:iload_0         
	//*   1    1:ldc2            #302 <Int 0x80000000>
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
	//    9   13:invokestatic    #308 <Method int Math.round(float)>
	//   10   16:ireturn         
	}

	private void notifyLoadFailed()
	{
		RequestCoordinator requestcoordinator = requestCoordinator;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		if(requestcoordinator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			requestcoordinator.onRequestFailed(((Request) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #313 <Method void RequestCoordinator.onRequestFailed(Request)>
	//    8   16:return          
	}

	private void notifyLoadSuccess()
	{
		RequestCoordinator requestcoordinator = requestCoordinator;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field RequestCoordinator requestCoordinator>
	//    2    4:astore_1        
		if(requestcoordinator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			requestcoordinator.onRequestSuccess(((Request) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #317 <Method void RequestCoordinator.onRequestSuccess(Request)>
	//    8   16:return          
	}

	public static SingleRequest obtain(Context context1, GlideContext glidecontext, Object obj, Class class1, BaseRequestOptions baserequestoptions, int i, int j, Priority priority1, 
			Target target1, RequestListener requestlistener, List list, RequestCoordinator requestcoordinator, Engine engine1, TransitionFactory transitionfactory, Executor executor)
	{
		SingleRequest singlerequest1 = (SingleRequest)POOL.acquire();
	//    0    0:getstatic       #97  <Field android.support.v4.util.Pools$Pool POOL>
	//    1    3:invokeinterface #325 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:checkcast       #2   <Class SingleRequest>
	//    3   11:astore          16
		SingleRequest singlerequest = singlerequest1;
	//    4   13:aload           16
	//    5   15:astore          15
		if(singlerequest1 == null)
	//*   6   17:aload           16
	//*   7   19:ifnonnull       31
			singlerequest = new SingleRequest();
	//    8   22:new             #2   <Class SingleRequest>
	//    9   25:dup             
	//   10   26:invokespecial   #326 <Method void SingleRequest()>
	//   11   29:astore          15
		singlerequest.init(context1, glidecontext, obj, class1, baserequestoptions, i, j, priority1, target1, requestlistener, list, requestcoordinator, engine1, transitionfactory, executor);
	//   12   31:aload           15
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
	//   27   57:aload           14
	//   28   59:invokespecial   #328 <Method void init(Context, GlideContext, Object, Class, BaseRequestOptions, int, int, Priority, Target, RequestListener, List, RequestCoordinator, Engine, TransitionFactory, Executor)>
		return singlerequest;
	//   29   62:aload           15
	//   30   64:areturn         
	}

	private void onLoadFailed(GlideException glideexception, int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j;
		stateVerifier.throwIfRecycled();
	//    2    2:aload_0         
	//    3    3:getfield        #129 <Field StateVerifier stateVerifier>
	//    4    6:invokevirtual   #161 <Method void StateVerifier.throwIfRecycled()>
		glideexception.setOrigin(((Exception) (requestOrigin)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #242 <Field RuntimeException requestOrigin>
	//    8   14:invokevirtual   #337 <Method void GlideException.setOrigin(Exception)>
		j = glideContext.getLogLevel();
	//    9   17:aload_0         
	//   10   18:getfield        #215 <Field GlideContext glideContext>
	//   11   21:invokevirtual   #340 <Method int GlideContext.getLogLevel()>
	//   12   24:istore_3        
		if(j > i)
			break MISSING_BLOCK_LABEL_130;
	//   13   25:iload_3         
	//   14   26:iload_2         
	//   15   27:icmpgt          130
		StringBuilder stringbuilder = new StringBuilder();
	//   16   30:new             #284 <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #285 <Method void StringBuilder()>
	//   19   37:astore          5
		stringbuilder.append("Load failed for ");
	//   20   39:aload           5
	//   21   41:ldc2            #342 <String "Load failed for ">
	//   22   44:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		stringbuilder.append(model);
	//   24   48:aload           5
	//   25   50:aload_0         
	//   26   51:getfield        #217 <Field Object model>
	//   27   54:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
	//   28   57:pop             
		stringbuilder.append(" with size [");
	//   29   58:aload           5
	//   30   60:ldc2            #347 <String " with size [">
	//   31   63:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
		stringbuilder.append(width);
	//   33   67:aload           5
	//   34   69:aload_0         
	//   35   70:getfield        #349 <Field int width>
	//   36   73:invokevirtual   #352 <Method StringBuilder StringBuilder.append(int)>
	//   37   76:pop             
		stringbuilder.append("x");
	//   38   77:aload           5
	//   39   79:ldc2            #354 <String "x">
	//   40   82:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   41   85:pop             
		stringbuilder.append(height);
	//   42   86:aload           5
	//   43   88:aload_0         
	//   44   89:getfield        #356 <Field int height>
	//   45   92:invokevirtual   #352 <Method StringBuilder StringBuilder.append(int)>
	//   46   95:pop             
		stringbuilder.append("]");
	//   47   96:aload           5
	//   48   98:ldc2            #358 <String "]">
	//   49  101:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   50  104:pop             
		Log.w("Glide", stringbuilder.toString(), ((Throwable) (glideexception)));
	//   51  105:ldc2            #360 <String "Glide">
	//   52  108:aload           5
	//   53  110:invokevirtual   #295 <Method String StringBuilder.toString()>
	//   54  113:aload_1         
	//   55  114:invokestatic    #364 <Method int Log.w(String, String, Throwable)>
	//   56  117:pop             
		if(j > 4)
			break MISSING_BLOCK_LABEL_130;
	//   57  118:iload_3         
	//   58  119:iconst_4        
	//   59  120:icmpgt          130
		glideexception.logRootCauses("Glide");
	//   60  123:aload_1         
	//   61  124:ldc2            #360 <String "Glide">
	//   62  127:invokevirtual   #367 <Method void GlideException.logRootCauses(String)>
		loadStatus = null;
	//   63  130:aload_0         
	//   64  131:aconst_null     
	//   65  132:putfield        #171 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		status = Status.FAILED;
	//   66  135:aload_0         
	//   67  136:getstatic       #370 <Field SingleRequest$Status SingleRequest$Status.FAILED>
	//   68  139:putfield        #240 <Field SingleRequest$Status status>
		boolean flag = true;
	//   69  142:iconst_1        
	//   70  143:istore          4
		isCallingCallbacks = true;
	//   71  145:aload_0         
	//   72  146:iconst_1        
	//   73  147:putfield        #132 <Field boolean isCallingCallbacks>
		Iterator iterator;
		if(requestListeners == null)
			break MISSING_BLOCK_LABEL_289;
	//   74  150:aload_0         
	//   75  151:getfield        #229 <Field List requestListeners>
	//   76  154:ifnull          289
		iterator = requestListeners.iterator();
	//   77  157:aload_0         
	//   78  158:getfield        #229 <Field List requestListeners>
	//   79  161:invokeinterface #374 <Method Iterator List.iterator()>
	//   80  166:astore          5
		i = 0;
	//   81  168:iconst_0        
	//   82  169:istore_2        
_L2:
		j = i;
	//   83  170:iload_2         
	//   84  171:istore_3        
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   85  172:aload           5
	//   86  174:invokeinterface #379 <Method boolean Iterator.hasNext()>
	//   87  179:ifeq            216
		i |= ((int) (((RequestListener)iterator.next()).onLoadFailed(glideexception, model, target, isFirstReadyResource())));
	//   88  182:iload_2         
	//   89  183:aload           5
	//   90  185:invokeinterface #382 <Method Object Iterator.next()>
	//   91  190:checkcast       #384 <Class RequestListener>
	//   92  193:aload_1         
	//   93  194:aload_0         
	//   94  195:getfield        #217 <Field Object model>
	//   95  198:aload_0         
	//   96  199:getfield        #163 <Field Target target>
	//   97  202:aload_0         
	//   98  203:invokespecial   #386 <Method boolean isFirstReadyResource()>
	//   99  206:invokeinterface #389 <Method boolean RequestListener.onLoadFailed(GlideException, Object, Target, boolean)>
	//  100  211:ior             
	//  101  212:istore_2        
		if(true) goto _L2; else goto _L1
	//  102  213:goto            170
_L1:
		if(targetListener != null && targetListener.onLoadFailed(glideexception, model, target, isFirstReadyResource()))
	//* 103  216:aload_0         
	//* 104  217:getfield        #227 <Field RequestListener targetListener>
	//* 105  220:ifnull          294
	//* 106  223:aload_0         
	//* 107  224:getfield        #227 <Field RequestListener targetListener>
	//* 108  227:aload_1         
	//* 109  228:aload_0         
	//* 110  229:getfield        #217 <Field Object model>
	//* 111  232:aload_0         
	//* 112  233:getfield        #163 <Field Target target>
	//* 113  236:aload_0         
	//* 114  237:invokespecial   #386 <Method boolean isFirstReadyResource()>
	//* 115  240:invokeinterface #389 <Method boolean RequestListener.onLoadFailed(GlideException, Object, Target, boolean)>
	//* 116  245:ifeq            294
			i = ((int) (flag));
	//  117  248:iload           4
	//  118  250:istore_2        
		else
	//* 119  251:goto            254
	//* 120  254:iload_3         
	//* 121  255:iload_2         
	//* 122  256:ior             
	//* 123  257:ifne            264
	//* 124  260:aload_0         
	//* 125  261:invokespecial   #392 <Method void setErrorPlaceholder()>
	//* 126  264:aload_0         
	//* 127  265:iconst_0        
	//* 128  266:putfield        #132 <Field boolean isCallingCallbacks>
	//* 129  269:aload_0         
	//* 130  270:invokespecial   #394 <Method void notifyLoadFailed()>
	//* 131  273:aload_0         
	//* 132  274:monitorexit     
	//* 133  275:return          
	//* 134  276:astore_1        
	//* 135  277:aload_0         
	//* 136  278:iconst_0        
	//* 137  279:putfield        #132 <Field boolean isCallingCallbacks>
	//* 138  282:aload_1         
	//* 139  283:athrow          
	//* 140  284:astore_1        
	//* 141  285:aload_0         
	//* 142  286:monitorexit     
	//* 143  287:aload_1         
	//* 144  288:athrow          
	//* 145  289:iconst_0        
	//* 146  290:istore_3        
	//* 147  291:goto            216
			i = 0;
	//  148  294:iconst_0        
	//  149  295:istore_2        
		if((j | i) != 0)
			break MISSING_BLOCK_LABEL_264;
		setErrorPlaceholder();
		isCallingCallbacks = false;
		notifyLoadFailed();
		this;
		JVM INSTR monitorexit ;
		return;
		glideexception;
		isCallingCallbacks = false;
		throw glideexception;
		glideexception;
		this;
		JVM INSTR monitorexit ;
		throw glideexception;
		j = 0;
		  goto _L1
	//* 150  296:goto            254
	}

	private void onResourceReady(Resource resource1, Object obj, DataSource datasource)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag4;
		flag4 = isFirstReadyResource();
	//    2    2:aload_0         
	//    3    3:invokespecial   #386 <Method boolean isFirstReadyResource()>
	//    4    6:istore          7
		status = Status.COMPLETE;
	//    5    8:aload_0         
	//    6    9:getstatic       #399 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//    7   12:putfield        #240 <Field SingleRequest$Status status>
		resource = resource1;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:putfield        #401 <Field Resource resource>
		if(glideContext.getLogLevel() <= 3)
	//*  11   20:aload_0         
	//*  12   21:getfield        #215 <Field GlideContext glideContext>
	//*  13   24:invokevirtual   #340 <Method int GlideContext.getLogLevel()>
	//*  14   27:iconst_3        
	//*  15   28:icmpgt          163
		{
			resource1 = ((Resource) (new StringBuilder()));
	//   16   31:new             #284 <Class StringBuilder>
	//   17   34:dup             
	//   18   35:invokespecial   #285 <Method void StringBuilder()>
	//   19   38:astore_1        
			((StringBuilder) (resource1)).append("Finished loading ");
	//   20   39:aload_1         
	//   21   40:ldc2            #403 <String "Finished loading ">
	//   22   43:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			((StringBuilder) (resource1)).append(obj.getClass().getSimpleName());
	//   24   47:aload_1         
	//   25   48:aload_2         
	//   26   49:invokevirtual   #407 <Method Class Object.getClass()>
	//   27   52:invokevirtual   #412 <Method String Class.getSimpleName()>
	//   28   55:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			((StringBuilder) (resource1)).append(" from ");
	//   30   59:aload_1         
	//   31   60:ldc2            #414 <String " from ">
	//   32   63:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
			((StringBuilder) (resource1)).append(((Object) (datasource)));
	//   34   67:aload_1         
	//   35   68:aload_3         
	//   36   69:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
	//   37   72:pop             
			((StringBuilder) (resource1)).append(" for ");
	//   38   73:aload_1         
	//   39   74:ldc2            #416 <String " for ">
	//   40   77:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
			((StringBuilder) (resource1)).append(model);
	//   42   81:aload_1         
	//   43   82:aload_0         
	//   44   83:getfield        #217 <Field Object model>
	//   45   86:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
	//   46   89:pop             
			((StringBuilder) (resource1)).append(" with size [");
	//   47   90:aload_1         
	//   48   91:ldc2            #347 <String " with size [">
	//   49   94:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   50   97:pop             
			((StringBuilder) (resource1)).append(width);
	//   51   98:aload_1         
	//   52   99:aload_0         
	//   53  100:getfield        #349 <Field int width>
	//   54  103:invokevirtual   #352 <Method StringBuilder StringBuilder.append(int)>
	//   55  106:pop             
			((StringBuilder) (resource1)).append("x");
	//   56  107:aload_1         
	//   57  108:ldc2            #354 <String "x">
	//   58  111:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   59  114:pop             
			((StringBuilder) (resource1)).append(height);
	//   60  115:aload_1         
	//   61  116:aload_0         
	//   62  117:getfield        #356 <Field int height>
	//   63  120:invokevirtual   #352 <Method StringBuilder StringBuilder.append(int)>
	//   64  123:pop             
			((StringBuilder) (resource1)).append("] in ");
	//   65  124:aload_1         
	//   66  125:ldc2            #418 <String "] in ">
	//   67  128:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   68  131:pop             
			((StringBuilder) (resource1)).append(LogTime.getElapsedMillis(startTime));
	//   69  132:aload_1         
	//   70  133:aload_0         
	//   71  134:getfield        #420 <Field long startTime>
	//   72  137:invokestatic    #426 <Method double LogTime.getElapsedMillis(long)>
	//   73  140:invokevirtual   #429 <Method StringBuilder StringBuilder.append(double)>
	//   74  143:pop             
			((StringBuilder) (resource1)).append(" ms");
	//   75  144:aload_1         
	//   76  145:ldc2            #431 <String " ms">
	//   77  148:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   78  151:pop             
			Log.d("Glide", ((StringBuilder) (resource1)).toString());
	//   79  152:ldc2            #360 <String "Glide">
	//   80  155:aload_1         
	//   81  156:invokevirtual   #295 <Method String StringBuilder.toString()>
	//   82  159:invokestatic    #434 <Method int Log.d(String, String)>
	//   83  162:pop             
		}
		boolean flag3 = true;
	//   84  163:iconst_1        
	//   85  164:istore          6
		isCallingCallbacks = true;
	//   86  166:aload_0         
	//   87  167:iconst_1        
	//   88  168:putfield        #132 <Field boolean isCallingCallbacks>
		if(requestListeners == null)
			break MISSING_BLOCK_LABEL_333;
	//   89  171:aload_0         
	//   90  172:getfield        #229 <Field List requestListeners>
	//   91  175:ifnull          333
		resource1 = ((Resource) (requestListeners.iterator()));
	//   92  178:aload_0         
	//   93  179:getfield        #229 <Field List requestListeners>
	//   94  182:invokeinterface #374 <Method Iterator List.iterator()>
	//   95  187:astore_1        
		boolean flag = false;
	//   96  188:iconst_0        
	//   97  189:istore          4
_L2:
		boolean flag2 = flag;
	//   98  191:iload           4
	//   99  193:istore          5
		if(!((Iterator) (resource1)).hasNext())
			break; /* Loop/switch isn't completed */
	//  100  195:aload_1         
	//  101  196:invokeinterface #379 <Method boolean Iterator.hasNext()>
	//  102  201:ifeq            238
		flag |= ((RequestListener)((Iterator) (resource1)).next()).onResourceReady(obj, model, target, datasource, flag4);
	//  103  204:iload           4
	//  104  206:aload_1         
	//  105  207:invokeinterface #382 <Method Object Iterator.next()>
	//  106  212:checkcast       #384 <Class RequestListener>
	//  107  215:aload_2         
	//  108  216:aload_0         
	//  109  217:getfield        #217 <Field Object model>
	//  110  220:aload_0         
	//  111  221:getfield        #163 <Field Target target>
	//  112  224:aload_3         
	//  113  225:iload           7
	//  114  227:invokeinterface #437 <Method boolean RequestListener.onResourceReady(Object, Object, Target, DataSource, boolean)>
	//  115  232:ior             
	//  116  233:istore          4
		if(true) goto _L2; else goto _L1
	//  117  235:goto            191
_L1:
		boolean flag1;
		if(targetListener != null && targetListener.onResourceReady(obj, model, target, datasource, flag4))
	//* 118  238:aload_0         
	//* 119  239:getfield        #227 <Field RequestListener targetListener>
	//* 120  242:ifnull          339
	//* 121  245:aload_0         
	//* 122  246:getfield        #227 <Field RequestListener targetListener>
	//* 123  249:aload_2         
	//* 124  250:aload_0         
	//* 125  251:getfield        #217 <Field Object model>
	//* 126  254:aload_0         
	//* 127  255:getfield        #163 <Field Target target>
	//* 128  258:aload_3         
	//* 129  259:iload           7
	//* 130  261:invokeinterface #437 <Method boolean RequestListener.onResourceReady(Object, Object, Target, DataSource, boolean)>
	//* 131  266:ifeq            339
			flag1 = flag3;
	//  132  269:iload           6
	//  133  271:istore          4
		else
	//* 134  273:goto            276
	//* 135  276:iload           4
	//* 136  278:iload           5
	//* 137  280:ior             
	//* 138  281:ifne            308
	//* 139  284:aload_0         
	//* 140  285:getfield        #233 <Field TransitionFactory animationFactory>
	//* 141  288:aload_3         
	//* 142  289:iload           7
	//* 143  291:invokeinterface #443 <Method com.bumptech.glide.request.transition.Transition TransitionFactory.build(DataSource, boolean)>
	//* 144  296:astore_1        
	//* 145  297:aload_0         
	//* 146  298:getfield        #163 <Field Target target>
	//* 147  301:aload_2         
	//* 148  302:aload_1         
	//* 149  303:invokeinterface #446 <Method void Target.onResourceReady(Object, com.bumptech.glide.request.transition.Transition)>
	//* 150  308:aload_0         
	//* 151  309:iconst_0        
	//* 152  310:putfield        #132 <Field boolean isCallingCallbacks>
	//* 153  313:aload_0         
	//* 154  314:invokespecial   #448 <Method void notifyLoadSuccess()>
	//* 155  317:aload_0         
	//* 156  318:monitorexit     
	//* 157  319:return          
	//* 158  320:astore_1        
	//* 159  321:aload_0         
	//* 160  322:iconst_0        
	//* 161  323:putfield        #132 <Field boolean isCallingCallbacks>
	//* 162  326:aload_1         
	//* 163  327:athrow          
	//* 164  328:astore_1        
	//* 165  329:aload_0         
	//* 166  330:monitorexit     
	//* 167  331:aload_1         
	//* 168  332:athrow          
	//* 169  333:iconst_0        
	//* 170  334:istore          5
	//* 171  336:goto            238
			flag1 = false;
	//  172  339:iconst_0        
	//  173  340:istore          4
		if(flag1 | flag2)
			break MISSING_BLOCK_LABEL_308;
		resource1 = ((Resource) (animationFactory.build(datasource, flag4)));
		target.onResourceReady(obj, ((com.bumptech.glide.request.transition.Transition) (resource1)));
		isCallingCallbacks = false;
		notifyLoadSuccess();
		this;
		JVM INSTR monitorexit ;
		return;
		resource1;
		isCallingCallbacks = false;
		throw resource1;
		resource1;
		this;
		JVM INSTR monitorexit ;
		throw resource1;
		flag2 = false;
		  goto _L1
	//* 174  342:goto            276
	}

	private void releaseResource(Resource resource1)
	{
		engine.release(resource1);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field Engine engine>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #456 <Method void Engine.release(Resource)>
		resource = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #401 <Field Resource resource>
	//    7   13:return          
	}

	private void setErrorPlaceholder()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = canNotifyStatusChanged();
	//    2    2:aload_0         
	//    3    3:invokespecial   #459 <Method boolean canNotifyStatusChanged()>
	//    4    6:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_1         
	//    6    8:ifne            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		Drawable drawable1 = null;
	//   10   14:aconst_null     
	//   11   15:astore_3        
		if(model == null)
	//*  12   16:aload_0         
	//*  13   17:getfield        #217 <Field Object model>
	//*  14   20:ifnonnull       28
			drawable1 = getFallbackDrawable();
	//   15   23:aload_0         
	//   16   24:invokespecial   #460 <Method Drawable getFallbackDrawable()>
	//   17   27:astore_3        
		Drawable drawable;
		drawable = drawable1;
	//   18   28:aload_3         
	//   19   29:astore_2        
		if(drawable1 != null)
			break MISSING_BLOCK_LABEL_39;
	//   20   30:aload_3         
	//   21   31:ifnonnull       39
		drawable = getErrorDrawable();
	//   22   34:aload_0         
	//   23   35:invokespecial   #462 <Method Drawable getErrorDrawable()>
	//   24   38:astore_2        
		drawable1 = drawable;
	//   25   39:aload_2         
	//   26   40:astore_3        
		if(drawable != null)
			break MISSING_BLOCK_LABEL_50;
	//   27   41:aload_2         
	//   28   42:ifnonnull       50
		drawable1 = getPlaceholderDrawable();
	//   29   45:aload_0         
	//   30   46:invokespecial   #463 <Method Drawable getPlaceholderDrawable()>
	//   31   49:astore_3        
		target.onLoadFailed(drawable1);
	//   32   50:aload_0         
	//   33   51:getfield        #163 <Field Target target>
	//   34   54:aload_3         
	//   35   55:invokeinterface #466 <Method void Target.onLoadFailed(Drawable)>
		this;
	//   36   60:aload_0         
		JVM INSTR monitorexit ;
	//   37   61:monitorexit     
		return;
	//   38   62:return          
		Exception exception;
		exception;
	//   39   63:astore_2        
	//*  40   64:aload_0         
		throw exception;
	//   41   65:monitorexit     
	//   42   66:aload_2         
	//   43   67:athrow          
	}

	public void begin()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertNotCallingCallbacks();
	//    2    2:aload_0         
	//    3    3:invokespecial   #158 <Method void assertNotCallingCallbacks()>
		stateVerifier.throwIfRecycled();
	//    4    6:aload_0         
	//    5    7:getfield        #129 <Field StateVerifier stateVerifier>
	//    6   10:invokevirtual   #161 <Method void StateVerifier.throwIfRecycled()>
		startTime = LogTime.getLogTime();
	//    7   13:aload_0         
	//    8   14:invokestatic    #471 <Method long LogTime.getLogTime()>
	//    9   17:putfield        #420 <Field long startTime>
		if(model != null)
			break MISSING_BLOCK_LABEL_87;
	//   10   20:aload_0         
	//   11   21:getfield        #217 <Field Object model>
	//   12   24:ifnonnull       87
		if(Util.isValidDimensions(overrideWidth, overrideHeight))
	//*  13   27:aload_0         
	//*  14   28:getfield        #221 <Field int overrideWidth>
	//*  15   31:aload_0         
	//*  16   32:getfield        #223 <Field int overrideHeight>
	//*  17   35:invokestatic    #477 <Method boolean Util.isValidDimensions(int, int)>
	//*  18   38:ifeq            57
		{
			width = overrideWidth;
	//   19   41:aload_0         
	//   20   42:aload_0         
	//   21   43:getfield        #221 <Field int overrideWidth>
	//   22   46:putfield        #349 <Field int width>
			height = overrideHeight;
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getfield        #223 <Field int overrideHeight>
	//   26   54:putfield        #356 <Field int height>
		}
		byte byte0;
		Exception exception;
		if(getFallbackDrawable() == null)
	//*  27   57:aload_0         
	//*  28   58:invokespecial   #460 <Method Drawable getFallbackDrawable()>
	//*  29   61:ifnonnull       268
			byte0 = 5;
	//   30   64:iconst_5        
	//   31   65:istore_1        
		else
	//*  32   66:goto            69
	//*  33   69:aload_0         
	//*  34   70:new             #333 <Class GlideException>
	//*  35   73:dup             
	//*  36   74:ldc2            #479 <String "Received null model">
	//*  37   77:invokespecial   #480 <Method void GlideException(String)>
	//*  38   80:iload_1         
	//*  39   81:invokespecial   #482 <Method void onLoadFailed(GlideException, int)>
	//*  40   84:aload_0         
	//*  41   85:monitorexit     
	//*  42   86:return          
	//*  43   87:aload_0         
	//*  44   88:getfield        #240 <Field SingleRequest$Status status>
	//*  45   91:getstatic       #485 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//*  46   94:if_acmpeq       252
	//*  47   97:aload_0         
	//*  48   98:getfield        #240 <Field SingleRequest$Status status>
	//*  49  101:getstatic       #399 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//*  50  104:if_acmpne       121
	//*  51  107:aload_0         
	//*  52  108:aload_0         
	//*  53  109:getfield        #401 <Field Resource resource>
	//*  54  112:getstatic       #491 <Field DataSource DataSource.MEMORY_CACHE>
	//*  55  115:invokevirtual   #494 <Method void onResourceReady(Resource, DataSource)>
	//*  56  118:aload_0         
	//*  57  119:monitorexit     
	//*  58  120:return          
	//*  59  121:aload_0         
	//*  60  122:getstatic       #497 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//*  61  125:putfield        #240 <Field SingleRequest$Status status>
	//*  62  128:aload_0         
	//*  63  129:getfield        #221 <Field int overrideWidth>
	//*  64  132:aload_0         
	//*  65  133:getfield        #223 <Field int overrideHeight>
	//*  66  136:invokestatic    #477 <Method boolean Util.isValidDimensions(int, int)>
	//*  67  139:ifeq            157
	//*  68  142:aload_0         
	//*  69  143:aload_0         
	//*  70  144:getfield        #221 <Field int overrideWidth>
	//*  71  147:aload_0         
	//*  72  148:getfield        #223 <Field int overrideHeight>
	//*  73  151:invokevirtual   #501 <Method void onSizeReady(int, int)>
	//*  74  154:goto            167
	//*  75  157:aload_0         
	//*  76  158:getfield        #163 <Field Target target>
	//*  77  161:aload_0         
	//*  78  162:invokeinterface #504 <Method void Target.getSize(SizeReadyCallback)>
	//*  79  167:aload_0         
	//*  80  168:getfield        #240 <Field SingleRequest$Status status>
	//*  81  171:getstatic       #485 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//*  82  174:if_acmpeq       187
	//*  83  177:aload_0         
	//*  84  178:getfield        #240 <Field SingleRequest$Status status>
	//*  85  181:getstatic       #497 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//*  86  184:if_acmpne       207
	//*  87  187:aload_0         
	//*  88  188:invokespecial   #459 <Method boolean canNotifyStatusChanged()>
	//*  89  191:ifeq            207
	//*  90  194:aload_0         
	//*  91  195:getfield        #163 <Field Target target>
	//*  92  198:aload_0         
	//*  93  199:invokespecial   #463 <Method Drawable getPlaceholderDrawable()>
	//*  94  202:invokeinterface #507 <Method void Target.onLoadStarted(Drawable)>
	//*  95  207:getstatic       #107 <Field boolean IS_VERBOSE_LOGGABLE>
	//*  96  210:ifeq            249
	//*  97  213:new             #284 <Class StringBuilder>
	//*  98  216:dup             
	//*  99  217:invokespecial   #285 <Method void StringBuilder()>
	//* 100  220:astore_2        
	//* 101  221:aload_2         
	//* 102  222:ldc2            #509 <String "finished run method in ">
	//* 103  225:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//* 104  228:pop             
	//* 105  229:aload_2         
	//* 106  230:aload_0         
	//* 107  231:getfield        #420 <Field long startTime>
	//* 108  234:invokestatic    #426 <Method double LogTime.getElapsedMillis(long)>
	//* 109  237:invokevirtual   #429 <Method StringBuilder StringBuilder.append(double)>
	//* 110  240:pop             
	//* 111  241:aload_0         
	//* 112  242:aload_2         
	//* 113  243:invokevirtual   #295 <Method String StringBuilder.toString()>
	//* 114  246:invokespecial   #511 <Method void logV(String)>
	//* 115  249:aload_0         
	//* 116  250:monitorexit     
	//* 117  251:return          
	//* 118  252:new             #513 <Class IllegalArgumentException>
	//* 119  255:dup             
	//* 120  256:ldc2            #515 <String "Cannot restart a running request">
	//* 121  259:invokespecial   #516 <Method void IllegalArgumentException(String)>
	//* 122  262:athrow          
	//* 123  263:astore_2        
	//* 124  264:aload_0         
	//* 125  265:monitorexit     
	//* 126  266:aload_2         
	//* 127  267:athrow          
			byte0 = 3;
	//  128  268:iconst_3        
	//  129  269:istore_1        
		onLoadFailed(new GlideException("Received null model"), ((int) (byte0)));
		this;
		JVM INSTR monitorexit ;
		return;
		if(status == Status.RUNNING)
			break MISSING_BLOCK_LABEL_252;
		if(status != Status.COMPLETE)
			break MISSING_BLOCK_LABEL_121;
		onResourceReady(resource, DataSource.MEMORY_CACHE);
		this;
		JVM INSTR monitorexit ;
		return;
		status = Status.WAITING_FOR_SIZE;
		if(Util.isValidDimensions(overrideWidth, overrideHeight))
		{
			onSizeReady(overrideWidth, overrideHeight);
			break MISSING_BLOCK_LABEL_167;
		}
		target.getSize(((SizeReadyCallback) (this)));
		if((status == Status.RUNNING || status == Status.WAITING_FOR_SIZE) && canNotifyStatusChanged())
			target.onLoadStarted(getPlaceholderDrawable());
		if(IS_VERBOSE_LOGGABLE)
		{
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("finished run method in ");
			stringbuilder.append(LogTime.getElapsedMillis(startTime));
			logV(stringbuilder.toString());
		}
		this;
		JVM INSTR monitorexit ;
		return;
		throw new IllegalArgumentException("Cannot restart a running request");
		exception;
		this;
		JVM INSTR monitorexit ;
		throw exception;
	//* 130  270:goto            69
	}

	public void clear()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Status status1;
		Status status2;
		assertNotCallingCallbacks();
	//    2    2:aload_0         
	//    3    3:invokespecial   #158 <Method void assertNotCallingCallbacks()>
		stateVerifier.throwIfRecycled();
	//    4    6:aload_0         
	//    5    7:getfield        #129 <Field StateVerifier stateVerifier>
	//    6   10:invokevirtual   #161 <Method void StateVerifier.throwIfRecycled()>
		status1 = status;
	//    7   13:aload_0         
	//    8   14:getfield        #240 <Field SingleRequest$Status status>
	//    9   17:astore_1        
		status2 = Status.CLEARED;
	//   10   18:getstatic       #520 <Field SingleRequest$Status SingleRequest$Status.CLEARED>
	//   11   21:astore_2        
		if(status1 != status2)
			break MISSING_BLOCK_LABEL_30;
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:if_acmpne       30
		this;
	//   15   27:aload_0         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		cancel();
	//   18   30:aload_0         
	//   19   31:invokespecial   #521 <Method void cancel()>
		if(resource != null)
	//*  20   34:aload_0         
	//*  21   35:getfield        #401 <Field Resource resource>
	//*  22   38:ifnull          49
			releaseResource(resource);
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:getfield        #401 <Field Resource resource>
	//   26   46:invokespecial   #523 <Method void releaseResource(Resource)>
		if(canNotifyCleared())
	//*  27   49:aload_0         
	//*  28   50:invokespecial   #525 <Method boolean canNotifyCleared()>
	//*  29   53:ifeq            69
			target.onLoadCleared(getPlaceholderDrawable());
	//   30   56:aload_0         
	//   31   57:getfield        #163 <Field Target target>
	//   32   60:aload_0         
	//   33   61:invokespecial   #463 <Method Drawable getPlaceholderDrawable()>
	//   34   64:invokeinterface #528 <Method void Target.onLoadCleared(Drawable)>
		status = Status.CLEARED;
	//   35   69:aload_0         
	//   36   70:getstatic       #520 <Field SingleRequest$Status SingleRequest$Status.CLEARED>
	//   37   73:putfield        #240 <Field SingleRequest$Status status>
		this;
	//   38   76:aload_0         
		JVM INSTR monitorexit ;
	//   39   77:monitorexit     
		return;
	//   40   78:return          
		Exception exception;
		exception;
	//   41   79:astore_1        
	//*  42   80:aload_0         
		throw exception;
	//   43   81:monitorexit     
	//   44   82:aload_1         
	//   45   83:athrow          
	}

	public StateVerifier getVerifier()
	{
		return stateVerifier;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field StateVerifier stateVerifier>
	//    2    4:areturn         
	}

	public boolean isCleared()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Status status1;
		Status status2;
		status1 = status;
	//    2    2:aload_0         
	//    3    3:getfield        #240 <Field SingleRequest$Status status>
	//    4    6:astore_2        
		status2 = Status.CLEARED;
	//    5    7:getstatic       #520 <Field SingleRequest$Status SingleRequest$Status.CLEARED>
	//    6   10:astore_3        
		boolean flag;
		if(status1 == status2)
	//*   7   11:aload_2         
	//*   8   12:aload_3         
	//*   9   13:if_acmpne       21
			flag = true;
	//   10   16:iconst_1        
	//   11   17:istore_1        
		else
	//*  12   18:goto            23
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_1        
		this;
	//   15   23:aload_0         
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		return flag;
	//   17   25:iload_1         
	//   18   26:ireturn         
		Exception exception;
		exception;
	//   19   27:astore_2        
	//*  20   28:aload_0         
		throw exception;
	//   21   29:monitorexit     
	//   22   30:aload_2         
	//   23   31:athrow          
	}

	public boolean isComplete()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Status status1;
		Status status2;
		status1 = status;
	//    2    2:aload_0         
	//    3    3:getfield        #240 <Field SingleRequest$Status status>
	//    4    6:astore_2        
		status2 = Status.COMPLETE;
	//    5    7:getstatic       #399 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//    6   10:astore_3        
		boolean flag;
		if(status1 == status2)
	//*   7   11:aload_2         
	//*   8   12:aload_3         
	//*   9   13:if_acmpne       21
			flag = true;
	//   10   16:iconst_1        
	//   11   17:istore_1        
		else
	//*  12   18:goto            23
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_1        
		this;
	//   15   23:aload_0         
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		return flag;
	//   17   25:iload_1         
	//   18   26:ireturn         
		Exception exception;
		exception;
	//   19   27:astore_2        
	//*  20   28:aload_0         
		throw exception;
	//   21   29:monitorexit     
	//   22   30:aload_2         
	//   23   31:athrow          
	}

	public boolean isEquivalentTo(Request request)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = request instanceof SingleRequest;
	//    2    2:aload_1         
	//    3    3:instanceof      #2   <Class SingleRequest>
	//    4    6:istore_2        
		boolean flag1;
		flag1 = false;
	//    5    7:iconst_0        
	//    6    8:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_133;
	//    7    9:iload_2         
	//    8   10:ifeq            132
		request = ((Request) ((SingleRequest)request));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class SingleRequest>
	//   11   17:astore_1        
		request;
	//   12   18:aload_1         
		JVM INSTR monitorenter ;
	//   13   19:monitorenter    
		flag = flag1;
	//   14   20:iload_3         
	//   15   21:istore_2        
		if(overrideWidth != ((SingleRequest) (request)).overrideWidth)
			break MISSING_BLOCK_LABEL_119;
	//   16   22:aload_0         
	//   17   23:getfield        #221 <Field int overrideWidth>
	//   18   26:aload_1         
	//   19   27:getfield        #221 <Field int overrideWidth>
	//   20   30:icmpne          119
		flag = flag1;
	//   21   33:iload_3         
	//   22   34:istore_2        
		if(overrideHeight != ((SingleRequest) (request)).overrideHeight)
			break MISSING_BLOCK_LABEL_119;
	//   23   35:aload_0         
	//   24   36:getfield        #223 <Field int overrideHeight>
	//   25   39:aload_1         
	//   26   40:getfield        #223 <Field int overrideHeight>
	//   27   43:icmpne          119
		flag = flag1;
	//   28   46:iload_3         
	//   29   47:istore_2        
		if(!Util.bothModelsNullEquivalentOrEquals(model, ((SingleRequest) (request)).model))
			break MISSING_BLOCK_LABEL_119;
	//   30   48:aload_0         
	//   31   49:getfield        #217 <Field Object model>
	//   32   52:aload_1         
	//   33   53:getfield        #217 <Field Object model>
	//   34   56:invokestatic    #538 <Method boolean Util.bothModelsNullEquivalentOrEquals(Object, Object)>
	//   35   59:ifeq            119
		flag = flag1;
	//   36   62:iload_3         
	//   37   63:istore_2        
		if(!((Object) (transcodeClass)).equals(((Object) (((SingleRequest) (request)).transcodeClass))))
			break MISSING_BLOCK_LABEL_119;
	//   38   64:aload_0         
	//   39   65:getfield        #219 <Field Class transcodeClass>
	//   40   68:aload_1         
	//   41   69:getfield        #219 <Field Class transcodeClass>
	//   42   72:invokevirtual   #542 <Method boolean Object.equals(Object)>
	//   43   75:ifeq            119
		flag = flag1;
	//   44   78:iload_3         
	//   45   79:istore_2        
		if(!requestOptions.equals(((Object) (((SingleRequest) (request)).requestOptions))))
			break MISSING_BLOCK_LABEL_119;
	//   46   80:aload_0         
	//   47   81:getfield        #181 <Field BaseRequestOptions requestOptions>
	//   48   84:aload_1         
	//   49   85:getfield        #181 <Field BaseRequestOptions requestOptions>
	//   50   88:invokevirtual   #543 <Method boolean BaseRequestOptions.equals(Object)>
	//   51   91:ifeq            119
		flag = flag1;
	//   52   94:iload_3         
	//   53   95:istore_2        
		if(priority != ((SingleRequest) (request)).priority)
			break MISSING_BLOCK_LABEL_119;
	//   54   96:aload_0         
	//   55   97:getfield        #225 <Field Priority priority>
	//   56  100:aload_1         
	//   57  101:getfield        #225 <Field Priority priority>
	//   58  104:if_acmpne       119
		flag = flag1;
	//   59  107:iload_3         
	//   60  108:istore_2        
		if(listenerCountEquals(((SingleRequest) (request))))
	//*  61  109:aload_0         
	//*  62  110:aload_1         
	//*  63  111:invokespecial   #545 <Method boolean listenerCountEquals(SingleRequest)>
	//*  64  114:ifeq            119
			flag = true;
	//   65  117:iconst_1        
	//   66  118:istore_2        
		request;
	//   67  119:aload_1         
		JVM INSTR monitorexit ;
	//   68  120:monitorexit     
		this;
	//   69  121:aload_0         
		JVM INSTR monitorexit ;
	//   70  122:monitorexit     
		return flag;
	//   71  123:iload_2         
	//   72  124:ireturn         
		Exception exception;
		exception;
	//   73  125:astore          4
		request;
	//   74  127:aload_1         
		JVM INSTR monitorexit ;
	//   75  128:monitorexit     
		throw exception;
	//   76  129:aload           4
	//   77  131:athrow          
	//*  78  132:aload_0         
		return false;
	//   79  133:monitorexit     
	//   80  134:iconst_0        
	//   81  135:ireturn         
		request;
	//   82  136:astore_1        
	//*  83  137:aload_0         
		throw request;
	//   84  138:monitorexit     
	//   85  139:aload_1         
	//   86  140:athrow          
	}

	public boolean isFailed()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Status status1;
		Status status2;
		status1 = status;
	//    2    2:aload_0         
	//    3    3:getfield        #240 <Field SingleRequest$Status status>
	//    4    6:astore_2        
		status2 = Status.FAILED;
	//    5    7:getstatic       #370 <Field SingleRequest$Status SingleRequest$Status.FAILED>
	//    6   10:astore_3        
		boolean flag;
		if(status1 == status2)
	//*   7   11:aload_2         
	//*   8   12:aload_3         
	//*   9   13:if_acmpne       21
			flag = true;
	//   10   16:iconst_1        
	//   11   17:istore_1        
		else
	//*  12   18:goto            23
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_1        
		this;
	//   15   23:aload_0         
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		return flag;
	//   17   25:iload_1         
	//   18   26:ireturn         
		Exception exception;
		exception;
	//   19   27:astore_2        
	//*  20   28:aload_0         
		throw exception;
	//   21   29:monitorexit     
	//   22   30:aload_2         
	//   23   31:athrow          
	}

	public boolean isResourceSet()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = isComplete();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #549 <Method boolean isComplete()>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public boolean isRunning()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Status status1;
		Status status2;
		if(status == Status.RUNNING)
			break MISSING_BLOCK_LABEL_34;
	//    2    2:aload_0         
	//    3    3:getfield        #240 <Field SingleRequest$Status status>
	//    4    6:getstatic       #485 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//    5    9:if_acmpeq       34
		status1 = status;
	//    6   12:aload_0         
	//    7   13:getfield        #240 <Field SingleRequest$Status status>
	//    8   16:astore_2        
		status2 = Status.WAITING_FOR_SIZE;
	//    9   17:getstatic       #497 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//   10   20:astore_3        
		boolean flag;
		if(status1 != status2)
	//*  11   21:aload_2         
	//*  12   22:aload_3         
	//*  13   23:if_acmpne       29
	//*  14   26:goto            34
		{
			flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_1        
			break MISSING_BLOCK_LABEL_36;
	//   17   31:goto            36
		}
		flag = true;
	//   18   34:iconst_1        
	//   19   35:istore_1        
	//*  20   36:aload_0         
		return flag;
	//   21   37:monitorexit     
	//   22   38:iload_1         
	//   23   39:ireturn         
		Exception exception;
		exception;
	//   24   40:astore_2        
	//*  25   41:aload_0         
		throw exception;
	//   26   42:monitorexit     
	//   27   43:aload_2         
	//   28   44:athrow          
	}

	public void onLoadFailed(GlideException glideexception)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		onLoadFailed(glideexception, 5);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iconst_5        
	//    5    5:invokespecial   #482 <Method void onLoadFailed(GlideException, int)>
		this;
	//    6    8:aload_0         
		JVM INSTR monitorexit ;
	//    7    9:monitorexit     
		return;
	//    8   10:return          
		glideexception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw glideexception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public void onResourceReady(Resource resource1, DataSource datasource)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		stateVerifier.throwIfRecycled();
	//    2    2:aload_0         
	//    3    3:getfield        #129 <Field StateVerifier stateVerifier>
	//    4    6:invokevirtual   #161 <Method void StateVerifier.throwIfRecycled()>
		loadStatus = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #171 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		if(resource1 != null)
			break MISSING_BLOCK_LABEL_69;
	//    8   14:aload_1         
	//    9   15:ifnonnull       69
		resource1 = ((Resource) (new StringBuilder()));
	//   10   18:new             #284 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #285 <Method void StringBuilder()>
	//   13   25:astore_1        
		((StringBuilder) (resource1)).append("Expected to receive a Resource<R> with an object of ");
	//   14   26:aload_1         
	//   15   27:ldc2            #553 <String "Expected to receive a Resource<R> with an object of ">
	//   16   30:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		((StringBuilder) (resource1)).append(((Object) (transcodeClass)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #219 <Field Class transcodeClass>
	//   21   39:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
		((StringBuilder) (resource1)).append(" inside, but instead got null.");
	//   23   43:aload_1         
	//   24   44:ldc2            #555 <String " inside, but instead got null.">
	//   25   47:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
		onLoadFailed(new GlideException(((StringBuilder) (resource1)).toString()));
	//   27   51:aload_0         
	//   28   52:new             #333 <Class GlideException>
	//   29   55:dup             
	//   30   56:aload_1         
	//   31   57:invokevirtual   #295 <Method String StringBuilder.toString()>
	//   32   60:invokespecial   #480 <Method void GlideException(String)>
	//   33   63:invokevirtual   #557 <Method void onLoadFailed(GlideException)>
		this;
	//   34   66:aload_0         
		JVM INSTR monitorexit ;
	//   35   67:monitorexit     
		return;
	//   36   68:return          
		Object obj = resource1.get();
	//   37   69:aload_1         
	//   38   70:invokeinterface #562 <Method Object Resource.get()>
	//   39   75:astore          4
		if(obj == null)
			break MISSING_BLOCK_LABEL_133;
	//   40   77:aload           4
	//   41   79:ifnull          133
		if(!transcodeClass.isAssignableFrom(obj.getClass()))
	//*  42   82:aload_0         
	//*  43   83:getfield        #219 <Field Class transcodeClass>
	//*  44   86:aload           4
	//*  45   88:invokevirtual   #407 <Method Class Object.getClass()>
	//*  46   91:invokevirtual   #566 <Method boolean Class.isAssignableFrom(Class)>
	//*  47   94:ifne            100
			break MISSING_BLOCK_LABEL_133;
	//   48   97:goto            133
		if(canSetResource())
			break MISSING_BLOCK_LABEL_122;
	//   49  100:aload_0         
	//   50  101:invokespecial   #568 <Method boolean canSetResource()>
	//   51  104:ifne            122
		releaseResource(resource1);
	//   52  107:aload_0         
	//   53  108:aload_1         
	//   54  109:invokespecial   #523 <Method void releaseResource(Resource)>
		status = Status.COMPLETE;
	//   55  112:aload_0         
	//   56  113:getstatic       #399 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//   57  116:putfield        #240 <Field SingleRequest$Status status>
		this;
	//   58  119:aload_0         
		JVM INSTR monitorexit ;
	//   59  120:monitorexit     
		return;
	//   60  121:return          
		onResourceReady(resource1, obj, datasource);
	//   61  122:aload_0         
	//   62  123:aload_1         
	//   63  124:aload           4
	//   64  126:aload_2         
	//   65  127:invokespecial   #570 <Method void onResourceReady(Resource, Object, DataSource)>
		this;
	//   66  130:aload_0         
		JVM INSTR monitorexit ;
	//   67  131:monitorexit     
		return;
	//   68  132:return          
		StringBuilder stringbuilder;
		releaseResource(resource1);
	//   69  133:aload_0         
	//   70  134:aload_1         
	//   71  135:invokespecial   #523 <Method void releaseResource(Resource)>
		stringbuilder = new StringBuilder();
	//   72  138:new             #284 <Class StringBuilder>
	//   73  141:dup             
	//   74  142:invokespecial   #285 <Method void StringBuilder()>
	//   75  145:astore_3        
		stringbuilder.append("Expected to receive an object of ");
	//   76  146:aload_3         
	//   77  147:ldc2            #572 <String "Expected to receive an object of ">
	//   78  150:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   79  153:pop             
		stringbuilder.append(((Object) (transcodeClass)));
	//   80  154:aload_3         
	//   81  155:aload_0         
	//   82  156:getfield        #219 <Field Class transcodeClass>
	//   83  159:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
	//   84  162:pop             
		stringbuilder.append(" but instead got ");
	//   85  163:aload_3         
	//   86  164:ldc2            #574 <String " but instead got ">
	//   87  167:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   88  170:pop             
		if(obj == null) goto _L2; else goto _L1
	//   89  171:aload           4
	//   90  173:ifnull          269
_L1:
		datasource = ((DataSource) (obj.getClass()));
	//   91  176:aload           4
	//   92  178:invokevirtual   #407 <Method Class Object.getClass()>
	//   93  181:astore_2        
	//*  94  182:goto            185
_L4:
		stringbuilder.append(((Object) (datasource)));
	//   95  185:aload_3         
	//   96  186:aload_2         
	//   97  187:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
	//   98  190:pop             
		stringbuilder.append("{");
	//   99  191:aload_3         
	//  100  192:ldc2            #576 <String "{">
	//  101  195:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//  102  198:pop             
		stringbuilder.append(obj);
	//  103  199:aload_3         
	//  104  200:aload           4
	//  105  202:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
	//  106  205:pop             
		stringbuilder.append("} inside Resource{");
	//  107  206:aload_3         
	//  108  207:ldc2            #578 <String "} inside Resource{">
	//  109  210:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//  110  213:pop             
		stringbuilder.append(((Object) (resource1)));
	//  111  214:aload_3         
	//  112  215:aload_1         
	//  113  216:invokevirtual   #345 <Method StringBuilder StringBuilder.append(Object)>
	//  114  219:pop             
		stringbuilder.append("}.");
	//  115  220:aload_3         
	//  116  221:ldc2            #580 <String "}.">
	//  117  224:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//  118  227:pop             
		if(obj != null)
	//* 119  228:aload           4
	//* 120  230:ifnull          276
			resource1 = "";
	//  121  233:ldc2            #582 <String "">
	//  122  236:astore_1        
		else
	//* 123  237:goto            240
	//* 124  240:aload_3         
	//* 125  241:aload_1         
	//* 126  242:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//* 127  245:pop             
	//* 128  246:aload_0         
	//* 129  247:new             #333 <Class GlideException>
	//* 130  250:dup             
	//* 131  251:aload_3         
	//* 132  252:invokevirtual   #295 <Method String StringBuilder.toString()>
	//* 133  255:invokespecial   #480 <Method void GlideException(String)>
	//* 134  258:invokevirtual   #557 <Method void onLoadFailed(GlideException)>
	//* 135  261:aload_0         
	//* 136  262:monitorexit     
	//* 137  263:return          
	//* 138  264:astore_1        
	//* 139  265:aload_0         
	//* 140  266:monitorexit     
	//* 141  267:aload_1         
	//* 142  268:athrow          
	//* 143  269:ldc2            #582 <String "">
	//* 144  272:astore_2        
	//* 145  273:goto            185
			resource1 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
	//  146  276:ldc2            #584 <String " To indicate failure return a null Resource object, rather than a Resource object containing null data.">
	//  147  279:astore_1        
		stringbuilder.append(((String) (resource1)));
		onLoadFailed(new GlideException(stringbuilder.toString()));
		this;
		JVM INSTR monitorexit ;
		return;
		resource1;
		throw resource1;
_L2:
		datasource = "";
		if(true) goto _L4; else goto _L3
_L3:
	//* 148  280:goto            240
	}

	public void onSizeReady(int i, int j)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		Object obj1;
		stateVerifier.throwIfRecycled();
	//    2    2:aload_0         
	//    3    3:getfield        #129 <Field StateVerifier stateVerifier>
	//    4    6:invokevirtual   #161 <Method void StateVerifier.throwIfRecycled()>
		if(IS_VERBOSE_LOGGABLE)
	//*   5    9:getstatic       #107 <Field boolean IS_VERBOSE_LOGGABLE>
	//*   6   12:ifeq            55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #284 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #285 <Method void StringBuilder()>
	//   10   22:astore          10
			stringbuilder.append("Got onSizeReady in ");
	//   11   24:aload           10
	//   12   26:ldc2            #587 <String "Got onSizeReady in ">
	//   13   29:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
			stringbuilder.append(LogTime.getElapsedMillis(startTime));
	//   15   33:aload           10
	//   16   35:aload_0         
	//   17   36:getfield        #420 <Field long startTime>
	//   18   39:invokestatic    #426 <Method double LogTime.getElapsedMillis(long)>
	//   19   42:invokevirtual   #429 <Method StringBuilder StringBuilder.append(double)>
	//   20   45:pop             
			logV(stringbuilder.toString());
	//   21   46:aload_0         
	//   22   47:aload           10
	//   23   49:invokevirtual   #295 <Method String StringBuilder.toString()>
	//   24   52:invokespecial   #511 <Method void logV(String)>
		}
		obj = ((Object) (status));
	//   25   55:aload_0         
	//   26   56:getfield        #240 <Field SingleRequest$Status status>
	//   27   59:astore          10
		obj1 = ((Object) (Status.WAITING_FOR_SIZE));
	//   28   61:getstatic       #497 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//   29   64:astore          11
		if(obj == obj1)
			break MISSING_BLOCK_LABEL_76;
	//   30   66:aload           10
	//   31   68:aload           11
	//   32   70:if_acmpeq       76
		this;
	//   33   73:aload_0         
		JVM INSTR monitorexit ;
	//   34   74:monitorexit     
		return;
	//   35   75:return          
		boolean flag;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		Object obj2;
		com.bumptech.glide.load.Key key;
		Class class1;
		Class class2;
		Priority priority1;
		com.bumptech.glide.load.engine.DiskCacheStrategy diskcachestrategy;
		java.util.Map map;
		com.bumptech.glide.load.Options options;
		Executor executor;
		status = Status.RUNNING;
	//   36   76:aload_0         
	//   37   77:getstatic       #485 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//   38   80:putfield        #240 <Field SingleRequest$Status status>
		float f = requestOptions.getSizeMultiplier();
	//   39   83:aload_0         
	//   40   84:getfield        #181 <Field BaseRequestOptions requestOptions>
	//   41   87:invokevirtual   #591 <Method float BaseRequestOptions.getSizeMultiplier()>
	//   42   90:fstore_3        
		width = maybeApplySizeMultiplier(i, f);
	//   43   91:aload_0         
	//   44   92:iload_1         
	//   45   93:fload_3         
	//   46   94:invokestatic    #593 <Method int maybeApplySizeMultiplier(int, float)>
	//   47   97:putfield        #349 <Field int width>
		height = maybeApplySizeMultiplier(j, f);
	//   48  100:aload_0         
	//   49  101:iload_2         
	//   50  102:fload_3         
	//   51  103:invokestatic    #593 <Method int maybeApplySizeMultiplier(int, float)>
	//   52  106:putfield        #356 <Field int height>
		if(IS_VERBOSE_LOGGABLE)
	//*  53  109:getstatic       #107 <Field boolean IS_VERBOSE_LOGGABLE>
	//*  54  112:ifeq            155
		{
			obj = ((Object) (new StringBuilder()));
	//   55  115:new             #284 <Class StringBuilder>
	//   56  118:dup             
	//   57  119:invokespecial   #285 <Method void StringBuilder()>
	//   58  122:astore          10
			((StringBuilder) (obj)).append("finished setup for calling load in ");
	//   59  124:aload           10
	//   60  126:ldc2            #595 <String "finished setup for calling load in ">
	//   61  129:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   62  132:pop             
			((StringBuilder) (obj)).append(LogTime.getElapsedMillis(startTime));
	//   63  133:aload           10
	//   64  135:aload_0         
	//   65  136:getfield        #420 <Field long startTime>
	//   66  139:invokestatic    #426 <Method double LogTime.getElapsedMillis(long)>
	//   67  142:invokevirtual   #429 <Method StringBuilder StringBuilder.append(double)>
	//   68  145:pop             
			logV(((StringBuilder) (obj)).toString());
	//   69  146:aload_0         
	//   70  147:aload           10
	//   71  149:invokevirtual   #295 <Method String StringBuilder.toString()>
	//   72  152:invokespecial   #511 <Method void logV(String)>
		}
		obj = ((Object) (engine));
	//   73  155:aload_0         
	//   74  156:getfield        #231 <Field Engine engine>
	//   75  159:astore          10
		obj1 = ((Object) (glideContext));
	//   76  161:aload_0         
	//   77  162:getfield        #215 <Field GlideContext glideContext>
	//   78  165:astore          11
		obj2 = model;
	//   79  167:aload_0         
	//   80  168:getfield        #217 <Field Object model>
	//   81  171:astore          12
		key = requestOptions.getSignature();
	//   82  173:aload_0         
	//   83  174:getfield        #181 <Field BaseRequestOptions requestOptions>
	//   84  177:invokevirtual   #599 <Method com.bumptech.glide.load.Key BaseRequestOptions.getSignature()>
	//   85  180:astore          13
		i = width;
	//   86  182:aload_0         
	//   87  183:getfield        #349 <Field int width>
	//   88  186:istore_1        
		j = height;
	//   89  187:aload_0         
	//   90  188:getfield        #356 <Field int height>
	//   91  191:istore_2        
		class1 = requestOptions.getResourceClass();
	//   92  192:aload_0         
	//   93  193:getfield        #181 <Field BaseRequestOptions requestOptions>
	//   94  196:invokevirtual   #602 <Method Class BaseRequestOptions.getResourceClass()>
	//   95  199:astore          14
		class2 = transcodeClass;
	//   96  201:aload_0         
	//   97  202:getfield        #219 <Field Class transcodeClass>
	//   98  205:astore          15
		priority1 = priority;
	//   99  207:aload_0         
	//  100  208:getfield        #225 <Field Priority priority>
	//  101  211:astore          16
		diskcachestrategy = requestOptions.getDiskCacheStrategy();
	//  102  213:aload_0         
	//  103  214:getfield        #181 <Field BaseRequestOptions requestOptions>
	//  104  217:invokevirtual   #606 <Method com.bumptech.glide.load.engine.DiskCacheStrategy BaseRequestOptions.getDiskCacheStrategy()>
	//  105  220:astore          17
		map = requestOptions.getTransformations();
	//  106  222:aload_0         
	//  107  223:getfield        #181 <Field BaseRequestOptions requestOptions>
	//  108  226:invokevirtual   #610 <Method java.util.Map BaseRequestOptions.getTransformations()>
	//  109  229:astore          18
		flag = requestOptions.isTransformationRequired();
	//  110  231:aload_0         
	//  111  232:getfield        #181 <Field BaseRequestOptions requestOptions>
	//  112  235:invokevirtual   #613 <Method boolean BaseRequestOptions.isTransformationRequired()>
	//  113  238:istore          4
		flag1 = requestOptions.isScaleOnlyOrNoTransform();
	//  114  240:aload_0         
	//  115  241:getfield        #181 <Field BaseRequestOptions requestOptions>
	//  116  244:invokevirtual   #616 <Method boolean BaseRequestOptions.isScaleOnlyOrNoTransform()>
	//  117  247:istore          5
		options = requestOptions.getOptions();
	//  118  249:aload_0         
	//  119  250:getfield        #181 <Field BaseRequestOptions requestOptions>
	//  120  253:invokevirtual   #620 <Method com.bumptech.glide.load.Options BaseRequestOptions.getOptions()>
	//  121  256:astore          19
		flag2 = requestOptions.isMemoryCacheable();
	//  122  258:aload_0         
	//  123  259:getfield        #181 <Field BaseRequestOptions requestOptions>
	//  124  262:invokevirtual   #623 <Method boolean BaseRequestOptions.isMemoryCacheable()>
	//  125  265:istore          6
		flag3 = requestOptions.getUseUnlimitedSourceGeneratorsPool();
	//  126  267:aload_0         
	//  127  268:getfield        #181 <Field BaseRequestOptions requestOptions>
	//  128  271:invokevirtual   #626 <Method boolean BaseRequestOptions.getUseUnlimitedSourceGeneratorsPool()>
	//  129  274:istore          7
		flag4 = requestOptions.getUseAnimationPool();
	//  130  276:aload_0         
	//  131  277:getfield        #181 <Field BaseRequestOptions requestOptions>
	//  132  280:invokevirtual   #629 <Method boolean BaseRequestOptions.getUseAnimationPool()>
	//  133  283:istore          8
		flag5 = requestOptions.getOnlyRetrieveFromCache();
	//  134  285:aload_0         
	//  135  286:getfield        #181 <Field BaseRequestOptions requestOptions>
	//  136  289:invokevirtual   #632 <Method boolean BaseRequestOptions.getOnlyRetrieveFromCache()>
	//  137  292:istore          9
		executor = callbackExecutor;
	//  138  294:aload_0         
	//  139  295:getfield        #235 <Field Executor callbackExecutor>
	//  140  298:astore          20
		obj = ((Object) (((Engine) (obj)).load(((GlideContext) (obj1)), obj2, key, i, j, class1, class2, priority1, diskcachestrategy, map, flag, flag1, options, flag2, flag3, flag4, flag5, ((ResourceCallback) (this)), executor)));
	//  141  300:aload           10
	//  142  302:aload           11
	//  143  304:aload           12
	//  144  306:aload           13
	//  145  308:iload_1         
	//  146  309:iload_2         
	//  147  310:aload           14
	//  148  312:aload           15
	//  149  314:aload           16
	//  150  316:aload           17
	//  151  318:aload           18
	//  152  320:iload           4
	//  153  322:iload           5
	//  154  324:aload           19
	//  155  326:iload           6
	//  156  328:iload           7
	//  157  330:iload           8
	//  158  332:iload           9
	//  159  334:aload_0         
	//  160  335:aload           20
	//  161  337:invokevirtual   #636 <Method com.bumptech.glide.load.engine.Engine$LoadStatus Engine.load(GlideContext, Object, com.bumptech.glide.load.Key, int, int, Class, Class, Priority, com.bumptech.glide.load.engine.DiskCacheStrategy, java.util.Map, boolean, boolean, com.bumptech.glide.load.Options, boolean, boolean, boolean, boolean, ResourceCallback, Executor)>
	//  162  340:astore          10
		loadStatus = ((com.bumptech.glide.load.engine.Engine.LoadStatus) (obj));
	//  163  342:aload_0         
	//  164  343:aload           10
	//  165  345:putfield        #171 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		if(status != Status.RUNNING)
	//* 166  348:aload_0         
	//* 167  349:getfield        #240 <Field SingleRequest$Status status>
	//* 168  352:getstatic       #485 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//* 169  355:if_acmpeq       363
			loadStatus = null;
	//  170  358:aload_0         
	//  171  359:aconst_null     
	//  172  360:putfield        #171 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		if(IS_VERBOSE_LOGGABLE)
	//* 173  363:getstatic       #107 <Field boolean IS_VERBOSE_LOGGABLE>
	//* 174  366:ifeq            409
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  175  369:new             #284 <Class StringBuilder>
	//  176  372:dup             
	//  177  373:invokespecial   #285 <Method void StringBuilder()>
	//  178  376:astore          10
			stringbuilder1.append("finished onSizeReady in ");
	//  179  378:aload           10
	//  180  380:ldc2            #638 <String "finished onSizeReady in ">
	//  181  383:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//  182  386:pop             
			stringbuilder1.append(LogTime.getElapsedMillis(startTime));
	//  183  387:aload           10
	//  184  389:aload_0         
	//  185  390:getfield        #420 <Field long startTime>
	//  186  393:invokestatic    #426 <Method double LogTime.getElapsedMillis(long)>
	//  187  396:invokevirtual   #429 <Method StringBuilder StringBuilder.append(double)>
	//  188  399:pop             
			logV(stringbuilder1.toString());
	//  189  400:aload_0         
	//  190  401:aload           10
	//  191  403:invokevirtual   #295 <Method String StringBuilder.toString()>
	//  192  406:invokespecial   #511 <Method void logV(String)>
		}
		this;
	//  193  409:aload_0         
		JVM INSTR monitorexit ;
	//  194  410:monitorexit     
		return;
	//  195  411:return          
		Exception exception;
		exception;
	//  196  412:astore          10
		break MISSING_BLOCK_LABEL_424;
	//  197  414:goto            424
		exception;
	//  198  417:astore          10
		break MISSING_BLOCK_LABEL_424;
	//  199  419:goto            424
		exception;
	//  200  422:astore          10
	//* 201  424:aload_0         
		throw exception;
	//  202  425:monitorexit     
	//  203  426:aload           10
	//  204  428:athrow          
	}

	public void recycle()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		assertNotCallingCallbacks();
	//    2    2:aload_0         
	//    3    3:invokespecial   #158 <Method void assertNotCallingCallbacks()>
		context = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #213 <Field Context context>
		glideContext = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #215 <Field GlideContext glideContext>
		model = null;
	//   10   16:aload_0         
	//   11   17:aconst_null     
	//   12   18:putfield        #217 <Field Object model>
		transcodeClass = null;
	//   13   21:aload_0         
	//   14   22:aconst_null     
	//   15   23:putfield        #219 <Field Class transcodeClass>
		requestOptions = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #181 <Field BaseRequestOptions requestOptions>
		overrideWidth = -1;
	//   19   31:aload_0         
	//   20   32:iconst_m1       
	//   21   33:putfield        #221 <Field int overrideWidth>
		overrideHeight = -1;
	//   22   36:aload_0         
	//   23   37:iconst_m1       
	//   24   38:putfield        #223 <Field int overrideHeight>
		target = null;
	//   25   41:aload_0         
	//   26   42:aconst_null     
	//   27   43:putfield        #163 <Field Target target>
		requestListeners = null;
	//   28   46:aload_0         
	//   29   47:aconst_null     
	//   30   48:putfield        #229 <Field List requestListeners>
		targetListener = null;
	//   31   51:aload_0         
	//   32   52:aconst_null     
	//   33   53:putfield        #227 <Field RequestListener targetListener>
		requestCoordinator = null;
	//   34   56:aload_0         
	//   35   57:aconst_null     
	//   36   58:putfield        #143 <Field RequestCoordinator requestCoordinator>
		animationFactory = null;
	//   37   61:aload_0         
	//   38   62:aconst_null     
	//   39   63:putfield        #233 <Field TransitionFactory animationFactory>
		loadStatus = null;
	//   40   66:aload_0         
	//   41   67:aconst_null     
	//   42   68:putfield        #171 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		errorDrawable = null;
	//   43   71:aload_0         
	//   44   72:aconst_null     
	//   45   73:putfield        #179 <Field Drawable errorDrawable>
		placeholderDrawable = null;
	//   46   76:aload_0         
	//   47   77:aconst_null     
	//   48   78:putfield        #204 <Field Drawable placeholderDrawable>
		fallbackDrawable = null;
	//   49   81:aload_0         
	//   50   82:aconst_null     
	//   51   83:putfield        #196 <Field Drawable fallbackDrawable>
		width = -1;
	//   52   86:aload_0         
	//   53   87:iconst_m1       
	//   54   88:putfield        #349 <Field int width>
		height = -1;
	//   55   91:aload_0         
	//   56   92:iconst_m1       
	//   57   93:putfield        #356 <Field int height>
		requestOrigin = null;
	//   58   96:aload_0         
	//   59   97:aconst_null     
	//   60   98:putfield        #242 <Field RuntimeException requestOrigin>
		POOL.release(((Object) (this)));
	//   61  101:getstatic       #97  <Field android.support.v4.util.Pools$Pool POOL>
	//   62  104:aload_0         
	//   63  105:invokeinterface #641 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   64  110:pop             
		this;
	//   65  111:aload_0         
		JVM INSTR monitorexit ;
	//   66  112:monitorexit     
		return;
	//   67  113:return          
		Exception exception;
		exception;
	//   68  114:astore_1        
	//*  69  115:aload_0         
		throw exception;
	//   70  116:monitorexit     
	//   71  117:aload_1         
	//   72  118:athrow          
	}

	private static final boolean IS_VERBOSE_LOGGABLE = Log.isLoggable("Request", 2);
	private static final android.support.v4.util.Pools.Pool POOL = FactoryPools.threadSafe(150, new com.bumptech.glide.util.pool.FactoryPools.Factory() {

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
	private TransitionFactory animationFactory;
	private Executor callbackExecutor;
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
	private BaseRequestOptions requestOptions;
	private RuntimeException requestOrigin;
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
	//    3    7:invokespecial   #89  <Method void SingleRequest$1()>
	//    4   10:invokestatic    #95  <Method android.support.v4.util.Pools$Pool FactoryPools.threadSafe(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
	//    5   13:putstatic       #97  <Field android.support.v4.util.Pools$Pool POOL>
	//    6   16:ldc1            #99  <String "Request">
	//    7   18:iconst_2        
	//    8   19:invokestatic    #105 <Method boolean Log.isLoggable(String, int)>
	//    9   22:putstatic       #107 <Field boolean IS_VERBOSE_LOGGABLE>
	//*  10   25:return          
	}
}
