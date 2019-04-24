// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.content.res.AppCompatResources;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.*;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;

// Referenced classes of package com.bumptech.glide.request:
//			Request, ResourceCallback, RequestCoordinator, RequestOptions, 
//			RequestListener

public final class SingleRequest
	implements Request, SizeReadyCallback, ResourceCallback, com.bumptech.glide.util.pool.FactoryPools.Poolable
{
	static final class Status extends Enum
	{

		public static Status valueOf(String s)
		{
			return (Status)Enum.valueOf(com/bumptech/glide/request/SingleRequest$Status, s);
		//    0    0:ldc1            #2   <Class SingleRequest$Status>
		//    1    2:aload_0         
		//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SingleRequest$Status>
		//    4    9:areturn         
		}

		public static Status[] values()
		{
			return (Status[])((Status []) ($VALUES)).clone();
		//    0    0:getstatic       #51  <Field SingleRequest$Status[] $VALUES>
		//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.bumptech.glide.request.SingleRequest$Status_3B_.clone()>
		//    2    6:checkcast       #62  <Class SingleRequest$Status[]>
		//    3    9:areturn         
		}

		private static final Status $VALUES[];
		public static final Status CANCELLED;
		public static final Status CLEARED;
		public static final Status COMPLETE;
		public static final Status FAILED;
		public static final Status PAUSED;
		public static final Status PENDING;
		public static final Status RUNNING;
		public static final Status WAITING_FOR_SIZE;

		static 
		{
			PENDING = new Status("PENDING", 0);
		//    0    0:new             #2   <Class SingleRequest$Status>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "PENDING">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
		//    5   10:putstatic       #28  <Field SingleRequest$Status PENDING>
			RUNNING = new Status("RUNNING", 1);
		//    6   13:new             #2   <Class SingleRequest$Status>
		//    7   16:dup             
		//    8   17:ldc1            #29  <String "RUNNING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
		//   11   23:putstatic       #31  <Field SingleRequest$Status RUNNING>
			WAITING_FOR_SIZE = new Status("WAITING_FOR_SIZE", 2);
		//   12   26:new             #2   <Class SingleRequest$Status>
		//   13   29:dup             
		//   14   30:ldc1            #32  <String "WAITING_FOR_SIZE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
		//   17   36:putstatic       #34  <Field SingleRequest$Status WAITING_FOR_SIZE>
			COMPLETE = new Status("COMPLETE", 3);
		//   18   39:new             #2   <Class SingleRequest$Status>
		//   19   42:dup             
		//   20   43:ldc1            #35  <String "COMPLETE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
		//   23   49:putstatic       #37  <Field SingleRequest$Status COMPLETE>
			FAILED = new Status("FAILED", 4);
		//   24   52:new             #2   <Class SingleRequest$Status>
		//   25   55:dup             
		//   26   56:ldc1            #38  <String "FAILED">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
		//   29   62:putstatic       #40  <Field SingleRequest$Status FAILED>
			CANCELLED = new Status("CANCELLED", 5);
		//   30   65:new             #2   <Class SingleRequest$Status>
		//   31   68:dup             
		//   32   69:ldc1            #41  <String "CANCELLED">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
		//   35   75:putstatic       #43  <Field SingleRequest$Status CANCELLED>
			CLEARED = new Status("CLEARED", 6);
		//   36   78:new             #2   <Class SingleRequest$Status>
		//   37   81:dup             
		//   38   82:ldc1            #44  <String "CLEARED">
		//   39   84:bipush          6
		//   40   86:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
		//   41   89:putstatic       #46  <Field SingleRequest$Status CLEARED>
			PAUSED = new Status("PAUSED", 7);
		//   42   92:new             #2   <Class SingleRequest$Status>
		//   43   95:dup             
		//   44   96:ldc1            #47  <String "PAUSED">
		//   45   98:bipush          7
		//   46  100:invokespecial   #26  <Method void SingleRequest$Status(String, int)>
		//   47  103:putstatic       #49  <Field SingleRequest$Status PAUSED>
			$VALUES = (new Status[] {
				PENDING, RUNNING, WAITING_FOR_SIZE, COMPLETE, FAILED, CANCELLED, CLEARED, PAUSED
			});
		//   48  106:bipush          8
		//   49  108:anewarray       Status[]
		//   50  111:dup             
		//   51  112:iconst_0        
		//   52  113:getstatic       #28  <Field SingleRequest$Status PENDING>
		//   53  116:aastore         
		//   54  117:dup             
		//   55  118:iconst_1        
		//   56  119:getstatic       #31  <Field SingleRequest$Status RUNNING>
		//   57  122:aastore         
		//   58  123:dup             
		//   59  124:iconst_2        
		//   60  125:getstatic       #34  <Field SingleRequest$Status WAITING_FOR_SIZE>
		//   61  128:aastore         
		//   62  129:dup             
		//   63  130:iconst_3        
		//   64  131:getstatic       #37  <Field SingleRequest$Status COMPLETE>
		//   65  134:aastore         
		//   66  135:dup             
		//   67  136:iconst_4        
		//   68  137:getstatic       #40  <Field SingleRequest$Status FAILED>
		//   69  140:aastore         
		//   70  141:dup             
		//   71  142:iconst_5        
		//   72  143:getstatic       #43  <Field SingleRequest$Status CANCELLED>
		//   73  146:aastore         
		//   74  147:dup             
		//   75  148:bipush          6
		//   76  150:getstatic       #46  <Field SingleRequest$Status CLEARED>
		//   77  153:aastore         
		//   78  154:dup             
		//   79  155:bipush          7
		//   80  157:getstatic       #49  <Field SingleRequest$Status PAUSED>
		//   81  160:aastore         
		//   82  161:putstatic       #51  <Field SingleRequest$Status[] $VALUES>
		//*  83  164:return          
		}

		private Status(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #53  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	SingleRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokespecial   #98  <Method int Object.hashCode()>
	//    5    9:invokestatic    #104 <Method String String.valueOf(int)>
	//    6   12:putfield        #106 <Field String tag>
	//    7   15:aload_0         
	//    8   16:invokestatic    #112 <Method StateVerifier StateVerifier.newInstance()>
	//    9   19:putfield        #114 <Field StateVerifier stateVerifier>
	//   10   22:return          
	}

	private boolean canNotifyStatusChanged()
	{
		return requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(((Request) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field RequestCoordinator requestCoordinator>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field RequestCoordinator requestCoordinator>
	//    5   11:aload_0         
	//    6   12:invokeinterface #123 <Method boolean RequestCoordinator.canNotifyStatusChanged(Request)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private boolean canSetResource()
	{
		return requestCoordinator == null || requestCoordinator.canSetImage(((Request) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field RequestCoordinator requestCoordinator>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field RequestCoordinator requestCoordinator>
	//    5   11:aload_0         
	//    6   12:invokeinterface #127 <Method boolean RequestCoordinator.canSetImage(Request)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	private Drawable getErrorDrawable()
	{
		if(errorDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Drawable errorDrawable>
	//*   2    4:ifnonnull       50
		{
			errorDrawable = requestOptions.getErrorPlaceholder();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #133 <Field RequestOptions requestOptions>
	//    6   12:invokevirtual   #138 <Method Drawable RequestOptions.getErrorPlaceholder()>
	//    7   15:putfield        #131 <Field Drawable errorDrawable>
			if(errorDrawable == null && requestOptions.getErrorId() > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #131 <Field Drawable errorDrawable>
	//*  10   22:ifnonnull       50
	//*  11   25:aload_0         
	//*  12   26:getfield        #133 <Field RequestOptions requestOptions>
	//*  13   29:invokevirtual   #141 <Method int RequestOptions.getErrorId()>
	//*  14   32:ifle            50
				errorDrawable = loadDrawable(requestOptions.getErrorId());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #133 <Field RequestOptions requestOptions>
	//   19   41:invokevirtual   #141 <Method int RequestOptions.getErrorId()>
	//   20   44:invokespecial   #145 <Method Drawable loadDrawable(int)>
	//   21   47:putfield        #131 <Field Drawable errorDrawable>
		}
		return errorDrawable;
	//   22   50:aload_0         
	//   23   51:getfield        #131 <Field Drawable errorDrawable>
	//   24   54:areturn         
	}

	private Drawable getFallbackDrawable()
	{
		if(fallbackDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field Drawable fallbackDrawable>
	//*   2    4:ifnonnull       50
		{
			fallbackDrawable = requestOptions.getFallbackDrawable();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #133 <Field RequestOptions requestOptions>
	//    6   12:invokevirtual   #150 <Method Drawable RequestOptions.getFallbackDrawable()>
	//    7   15:putfield        #148 <Field Drawable fallbackDrawable>
			if(fallbackDrawable == null && requestOptions.getFallbackId() > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #148 <Field Drawable fallbackDrawable>
	//*  10   22:ifnonnull       50
	//*  11   25:aload_0         
	//*  12   26:getfield        #133 <Field RequestOptions requestOptions>
	//*  13   29:invokevirtual   #153 <Method int RequestOptions.getFallbackId()>
	//*  14   32:ifle            50
				fallbackDrawable = loadDrawable(requestOptions.getFallbackId());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #133 <Field RequestOptions requestOptions>
	//   19   41:invokevirtual   #153 <Method int RequestOptions.getFallbackId()>
	//   20   44:invokespecial   #145 <Method Drawable loadDrawable(int)>
	//   21   47:putfield        #148 <Field Drawable fallbackDrawable>
		}
		return fallbackDrawable;
	//   22   50:aload_0         
	//   23   51:getfield        #148 <Field Drawable fallbackDrawable>
	//   24   54:areturn         
	}

	private Drawable getPlaceholderDrawable()
	{
		if(placeholderDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field Drawable placeholderDrawable>
	//*   2    4:ifnonnull       50
		{
			placeholderDrawable = requestOptions.getPlaceholderDrawable();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #133 <Field RequestOptions requestOptions>
	//    6   12:invokevirtual   #158 <Method Drawable RequestOptions.getPlaceholderDrawable()>
	//    7   15:putfield        #156 <Field Drawable placeholderDrawable>
			if(placeholderDrawable == null && requestOptions.getPlaceholderId() > 0)
	//*   8   18:aload_0         
	//*   9   19:getfield        #156 <Field Drawable placeholderDrawable>
	//*  10   22:ifnonnull       50
	//*  11   25:aload_0         
	//*  12   26:getfield        #133 <Field RequestOptions requestOptions>
	//*  13   29:invokevirtual   #161 <Method int RequestOptions.getPlaceholderId()>
	//*  14   32:ifle            50
				placeholderDrawable = loadDrawable(requestOptions.getPlaceholderId());
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getfield        #133 <Field RequestOptions requestOptions>
	//   19   41:invokevirtual   #161 <Method int RequestOptions.getPlaceholderId()>
	//   20   44:invokespecial   #145 <Method Drawable loadDrawable(int)>
	//   21   47:putfield        #156 <Field Drawable placeholderDrawable>
		}
		return placeholderDrawable;
	//   22   50:aload_0         
	//   23   51:getfield        #156 <Field Drawable placeholderDrawable>
	//   24   54:areturn         
	}

	private void init(GlideContext glidecontext, Object obj, Class class1, RequestOptions requestoptions, int i, int j, Priority priority1, 
			Target target1, RequestListener requestlistener, RequestCoordinator requestcoordinator, Engine engine1, TransitionFactory transitionfactory)
	{
		glideContext = glidecontext;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #165 <Field GlideContext glideContext>
		model = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #167 <Field Object model>
		transcodeClass = class1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #169 <Field Class transcodeClass>
		requestOptions = requestoptions;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #133 <Field RequestOptions requestOptions>
		overrideWidth = i;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #171 <Field int overrideWidth>
		overrideHeight = j;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #173 <Field int overrideHeight>
		priority = priority1;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #175 <Field Priority priority>
		target = target1;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #177 <Field Target target>
		requestListener = requestlistener;
	//   24   45:aload_0         
	//   25   46:aload           9
	//   26   48:putfield        #179 <Field RequestListener requestListener>
		requestCoordinator = requestcoordinator;
	//   27   51:aload_0         
	//   28   52:aload           10
	//   29   54:putfield        #118 <Field RequestCoordinator requestCoordinator>
		engine = engine1;
	//   30   57:aload_0         
	//   31   58:aload           11
	//   32   60:putfield        #181 <Field Engine engine>
		animationFactory = transitionfactory;
	//   33   63:aload_0         
	//   34   64:aload           12
	//   35   66:putfield        #183 <Field TransitionFactory animationFactory>
		status = Status.PENDING;
	//   36   69:aload_0         
	//   37   70:getstatic       #186 <Field SingleRequest$Status SingleRequest$Status.PENDING>
	//   38   73:putfield        #188 <Field SingleRequest$Status status>
	//   39   76:return          
	}

	private boolean isFirstReadyResource()
	{
		return requestCoordinator == null || !requestCoordinator.isAnyResourceSet();
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field RequestCoordinator requestCoordinator>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field RequestCoordinator requestCoordinator>
	//    5   11:invokeinterface #194 <Method boolean RequestCoordinator.isAnyResourceSet()>
	//    6   16:ifne            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	private Drawable loadDrawable(int i)
	{
		if(shouldCallAppCompatResources)
	//*   0    0:getstatic       #92  <Field boolean shouldCallAppCompatResources>
	//*   1    3:ifeq            12
			return loadDrawableV7(i);
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:invokespecial   #198 <Method Drawable loadDrawableV7(int)>
	//    5   11:areturn         
		else
			return loadDrawableBase(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #201 <Method Drawable loadDrawableBase(int)>
	//    9   17:areturn         
	}

	private Drawable loadDrawableBase(int i)
	{
		return ResourcesCompat.getDrawable(glideContext.getResources(), i, requestOptions.getTheme());
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field GlideContext glideContext>
	//    2    4:invokevirtual   #208 <Method android.content.res.Resources GlideContext.getResources()>
	//    3    7:iload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #133 <Field RequestOptions requestOptions>
	//    6   12:invokevirtual   #212 <Method android.content.res.Resources$Theme RequestOptions.getTheme()>
	//    7   15:invokestatic    #218 <Method Drawable ResourcesCompat.getDrawable(android.content.res.Resources, int, android.content.res.Resources$Theme)>
	//    8   18:areturn         
	}

	private Drawable loadDrawableV7(int i)
	{
		Drawable drawable;
		try
		{
			drawable = AppCompatResources.getDrawable(((android.content.Context) (glideContext)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field GlideContext glideContext>
	//    2    4:iload_1         
	//    3    5:invokestatic    #225 <Method Drawable AppCompatResources.getDrawable(android.content.Context, int)>
	//    4    8:astore_2        
		}
	//*   5    9:aload_2         
	//*   6   10:areturn         
		catch(NoClassDefFoundError noclassdeffounderror)
	//*   7   11:astore_2        
		{
			shouldCallAppCompatResources = false;
	//    8   12:iconst_0        
	//    9   13:putstatic       #92  <Field boolean shouldCallAppCompatResources>
			return loadDrawableBase(i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokespecial   #201 <Method Drawable loadDrawableBase(int)>
	//   13   21:areturn         
		}
		return drawable;
	}

	private void logV(String s)
	{
		Log.v("Request", (new StringBuilder()).append(s).append(" this: ").append(tag).toString());
	//    0    0:ldc1            #28  <String "Request">
	//    1    2:new             #229 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #230 <Method void StringBuilder()>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//    6   13:ldc1            #236 <String " this: ">
	//    7   15:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:aload_0         
	//    9   19:getfield        #106 <Field String tag>
	//   10   22:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   12   28:invokestatic    #246 <Method int Log.v(String, String)>
	//   13   31:pop             
	//   14   32:return          
	}

	private static int maybeApplySizeMultiplier(int i, float f)
	{
		if(i == 0x80000000)
	//*   0    0:iload_0         
	//*   1    1:ldc1            #249 <Int 0x80000000>
	//*   2    3:icmpne          8
			return i;
	//    3    6:iload_0         
	//    4    7:ireturn         
		else
			return Math.round((float)i * f);
	//    5    8:iload_0         
	//    6    9:i2f             
	//    7   10:fload_1         
	//    8   11:fmul            
	//    9   12:invokestatic    #255 <Method int Math.round(float)>
	//   10   15:ireturn         
	}

	private void notifyLoadSuccess()
	{
		if(requestCoordinator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field RequestCoordinator requestCoordinator>
	//*   2    4:ifnull          17
			requestCoordinator.onRequestSuccess(((Request) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #118 <Field RequestCoordinator requestCoordinator>
	//    5   11:aload_0         
	//    6   12:invokeinterface #260 <Method void RequestCoordinator.onRequestSuccess(Request)>
	//    7   17:return          
	}

	public static SingleRequest obtain(GlideContext glidecontext, Object obj, Class class1, RequestOptions requestoptions, int i, int j, Priority priority1, Target target1, 
			RequestListener requestlistener, RequestCoordinator requestcoordinator, Engine engine1, TransitionFactory transitionfactory)
	{
		SingleRequest singlerequest1 = (SingleRequest)POOL.acquire();
	//    0    0:getstatic       #90  <Field android.support.v4.util.Pools$Pool POOL>
	//    1    3:invokeinterface #268 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:checkcast       #2   <Class SingleRequest>
	//    3   11:astore          13
		SingleRequest singlerequest = singlerequest1;
	//    4   13:aload           13
	//    5   15:astore          12
		if(singlerequest1 == null)
	//*   6   17:aload           13
	//*   7   19:ifnonnull       31
			singlerequest = new SingleRequest();
	//    8   22:new             #2   <Class SingleRequest>
	//    9   25:dup             
	//   10   26:invokespecial   #269 <Method void SingleRequest()>
	//   11   29:astore          12
		singlerequest.init(glidecontext, obj, class1, requestoptions, i, j, priority1, target1, requestlistener, requestcoordinator, engine1, transitionfactory);
	//   12   31:aload           12
	//   13   33:aload_0         
	//   14   34:aload_1         
	//   15   35:aload_2         
	//   16   36:aload_3         
	//   17   37:iload           4
	//   18   39:iload           5
	//   19   41:aload           6
	//   20   43:aload           7
	//   21   45:aload           8
	//   22   47:aload           9
	//   23   49:aload           10
	//   24   51:aload           11
	//   25   53:invokespecial   #271 <Method void init(GlideContext, Object, Class, RequestOptions, int, int, Priority, Target, RequestListener, RequestCoordinator, Engine, TransitionFactory)>
		return singlerequest;
	//   26   56:aload           12
	//   27   58:areturn         
	}

	private void onLoadFailed(GlideException glideexception, int i)
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #277 <Method void StateVerifier.throwIfRecycled()>
		int j = glideContext.getLogLevel();
	//    3    7:aload_0         
	//    4    8:getfield        #165 <Field GlideContext glideContext>
	//    5   11:invokevirtual   #280 <Method int GlideContext.getLogLevel()>
	//    6   14:istore_3        
		if(j <= i)
	//*   7   15:iload_3         
	//*   8   16:iload_2         
	//*   9   17:icmpgt          93
		{
			Log.w("Glide", (new StringBuilder()).append("Load failed for ").append(model).append(" with size [").append(width).append("x").append(height).append("]").toString(), ((Throwable) (glideexception)));
	//   10   20:ldc1            #22  <String "Glide">
	//   11   22:new             #229 <Class StringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #230 <Method void StringBuilder()>
	//   14   29:ldc2            #282 <String "Load failed for ">
	//   15   32:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:aload_0         
	//   17   36:getfield        #167 <Field Object model>
	//   18   39:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//   19   42:ldc2            #287 <String " with size [">
	//   20   45:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   21   48:aload_0         
	//   22   49:getfield        #289 <Field int width>
	//   23   52:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//   24   55:ldc2            #294 <String "x">
	//   25   58:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   26   61:aload_0         
	//   27   62:getfield        #296 <Field int height>
	//   28   65:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//   29   68:ldc2            #298 <String "]">
	//   30   71:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   31   74:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   32   77:aload_1         
	//   33   78:invokestatic    #302 <Method int Log.w(String, String, Throwable)>
	//   34   81:pop             
			if(j <= 4)
	//*  35   82:iload_3         
	//*  36   83:iconst_4        
	//*  37   84:icmpgt          93
				glideexception.logRootCauses("Glide");
	//   38   87:aload_1         
	//   39   88:ldc1            #22  <String "Glide">
	//   40   90:invokevirtual   #307 <Method void GlideException.logRootCauses(String)>
		}
		loadStatus = null;
	//   41   93:aload_0         
	//   42   94:aconst_null     
	//   43   95:putfield        #309 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		status = Status.FAILED;
	//   44   98:aload_0         
	//   45   99:getstatic       #312 <Field SingleRequest$Status SingleRequest$Status.FAILED>
	//   46  102:putfield        #188 <Field SingleRequest$Status status>
		if(requestListener == null || !requestListener.onLoadFailed(glideexception, model, target, isFirstReadyResource()))
	//*  47  105:aload_0         
	//*  48  106:getfield        #179 <Field RequestListener requestListener>
	//*  49  109:ifnull          137
	//*  50  112:aload_0         
	//*  51  113:getfield        #179 <Field RequestListener requestListener>
	//*  52  116:aload_1         
	//*  53  117:aload_0         
	//*  54  118:getfield        #167 <Field Object model>
	//*  55  121:aload_0         
	//*  56  122:getfield        #177 <Field Target target>
	//*  57  125:aload_0         
	//*  58  126:invokespecial   #314 <Method boolean isFirstReadyResource()>
	//*  59  129:invokeinterface #319 <Method boolean RequestListener.onLoadFailed(GlideException, Object, Target, boolean)>
	//*  60  134:ifne            141
			setErrorPlaceholder();
	//   61  137:aload_0         
	//   62  138:invokespecial   #322 <Method void setErrorPlaceholder()>
	//   63  141:return          
	}

	private void onResourceReady(Resource resource1, Object obj, DataSource datasource)
	{
		boolean flag = isFirstReadyResource();
	//    0    0:aload_0         
	//    1    1:invokespecial   #314 <Method boolean isFirstReadyResource()>
	//    2    4:istore          4
		status = Status.COMPLETE;
	//    3    6:aload_0         
	//    4    7:getstatic       #327 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//    5   10:putfield        #188 <Field SingleRequest$Status status>
		resource = resource1;
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:putfield        #329 <Field Resource resource>
		if(glideContext.getLogLevel() <= 3)
	//*   9   18:aload_0         
	//*  10   19:getfield        #165 <Field GlideContext glideContext>
	//*  11   22:invokevirtual   #280 <Method int GlideContext.getLogLevel()>
	//*  12   25:iconst_3        
	//*  13   26:icmpgt          132
			Log.d("Glide", (new StringBuilder()).append("Finished loading ").append(obj.getClass().getSimpleName()).append(" from ").append(((Object) (datasource))).append(" for ").append(model).append(" with size [").append(width).append("x").append(height).append("] in ").append(LogTime.getElapsedMillis(startTime)).append(" ms").toString());
	//   14   29:ldc1            #22  <String "Glide">
	//   15   31:new             #229 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #230 <Method void StringBuilder()>
	//   18   38:ldc2            #331 <String "Finished loading ">
	//   19   41:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:aload_2         
	//   21   45:invokevirtual   #335 <Method Class Object.getClass()>
	//   22   48:invokevirtual   #340 <Method String Class.getSimpleName()>
	//   23   51:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:ldc2            #342 <String " from ">
	//   25   57:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:aload_3         
	//   27   61:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//   28   64:ldc2            #344 <String " for ">
	//   29   67:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   30   70:aload_0         
	//   31   71:getfield        #167 <Field Object model>
	//   32   74:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//   33   77:ldc2            #287 <String " with size [">
	//   34   80:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   35   83:aload_0         
	//   36   84:getfield        #289 <Field int width>
	//   37   87:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//   38   90:ldc2            #294 <String "x">
	//   39   93:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   40   96:aload_0         
	//   41   97:getfield        #296 <Field int height>
	//   42  100:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//   43  103:ldc2            #346 <String "] in ">
	//   44  106:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   45  109:aload_0         
	//   46  110:getfield        #348 <Field long startTime>
	//   47  113:invokestatic    #354 <Method double LogTime.getElapsedMillis(long)>
	//   48  116:invokevirtual   #357 <Method StringBuilder StringBuilder.append(double)>
	//   49  119:ldc2            #359 <String " ms">
	//   50  122:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   51  125:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   52  128:invokestatic    #362 <Method int Log.d(String, String)>
	//   53  131:pop             
		if(requestListener == null || !requestListener.onResourceReady(obj, model, target, datasource, flag))
	//*  54  132:aload_0         
	//*  55  133:getfield        #179 <Field RequestListener requestListener>
	//*  56  136:ifnull          163
	//*  57  139:aload_0         
	//*  58  140:getfield        #179 <Field RequestListener requestListener>
	//*  59  143:aload_2         
	//*  60  144:aload_0         
	//*  61  145:getfield        #167 <Field Object model>
	//*  62  148:aload_0         
	//*  63  149:getfield        #177 <Field Target target>
	//*  64  152:aload_3         
	//*  65  153:iload           4
	//*  66  155:invokeinterface #365 <Method boolean RequestListener.onResourceReady(Object, Object, Target, DataSource, boolean)>
	//*  67  160:ifne            187
		{
			resource1 = ((Resource) (animationFactory.build(datasource, flag)));
	//   68  163:aload_0         
	//   69  164:getfield        #183 <Field TransitionFactory animationFactory>
	//   70  167:aload_3         
	//   71  168:iload           4
	//   72  170:invokeinterface #371 <Method com.bumptech.glide.request.transition.Transition TransitionFactory.build(DataSource, boolean)>
	//   73  175:astore_1        
			target.onResourceReady(obj, ((com.bumptech.glide.request.transition.Transition) (resource1)));
	//   74  176:aload_0         
	//   75  177:getfield        #177 <Field Target target>
	//   76  180:aload_2         
	//   77  181:aload_1         
	//   78  182:invokeinterface #376 <Method void Target.onResourceReady(Object, com.bumptech.glide.request.transition.Transition)>
		}
		notifyLoadSuccess();
	//   79  187:aload_0         
	//   80  188:invokespecial   #378 <Method void notifyLoadSuccess()>
	//   81  191:return          
	}

	private void releaseResource(Resource resource1)
	{
		engine.release(resource1);
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field Engine engine>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #386 <Method void Engine.release(Resource)>
		resource = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #329 <Field Resource resource>
	//    7   13:return          
	}

	private void setErrorPlaceholder()
	{
		if(!canNotifyStatusChanged())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #389 <Method boolean canNotifyStatusChanged()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Drawable drawable1 = null;
	//    4    8:aconst_null     
	//    5    9:astore_2        
		if(model == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #167 <Field Object model>
	//*   8   14:ifnonnull       22
			drawable1 = getFallbackDrawable();
	//    9   17:aload_0         
	//   10   18:invokespecial   #390 <Method Drawable getFallbackDrawable()>
	//   11   21:astore_2        
		Drawable drawable = drawable1;
	//   12   22:aload_2         
	//   13   23:astore_1        
		if(drawable1 == null)
	//*  14   24:aload_2         
	//*  15   25:ifnonnull       33
			drawable = getErrorDrawable();
	//   16   28:aload_0         
	//   17   29:invokespecial   #392 <Method Drawable getErrorDrawable()>
	//   18   32:astore_1        
		drawable1 = drawable;
	//   19   33:aload_1         
	//   20   34:astore_2        
		if(drawable == null)
	//*  21   35:aload_1         
	//*  22   36:ifnonnull       44
			drawable1 = getPlaceholderDrawable();
	//   23   39:aload_0         
	//   24   40:invokespecial   #393 <Method Drawable getPlaceholderDrawable()>
	//   25   43:astore_2        
		target.onLoadFailed(drawable1);
	//   26   44:aload_0         
	//   27   45:getfield        #177 <Field Target target>
	//   28   48:aload_2         
	//   29   49:invokeinterface #396 <Method void Target.onLoadFailed(Drawable)>
	//   30   54:return          
	}

	public void begin()
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #277 <Method void StateVerifier.throwIfRecycled()>
		startTime = LogTime.getLogTime();
	//    3    7:aload_0         
	//    4    8:invokestatic    #401 <Method long LogTime.getLogTime()>
	//    5   11:putfield        #348 <Field long startTime>
		if(model == null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #167 <Field Object model>
	//*   8   18:ifnonnull       81
		{
			if(Util.isValidDimensions(overrideWidth, overrideHeight))
	//*   9   21:aload_0         
	//*  10   22:getfield        #171 <Field int overrideWidth>
	//*  11   25:aload_0         
	//*  12   26:getfield        #173 <Field int overrideHeight>
	//*  13   29:invokestatic    #407 <Method boolean Util.isValidDimensions(int, int)>
	//*  14   32:ifeq            51
			{
				width = overrideWidth;
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:getfield        #171 <Field int overrideWidth>
	//   18   40:putfield        #289 <Field int width>
				height = overrideHeight;
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #173 <Field int overrideHeight>
	//   22   48:putfield        #296 <Field int height>
			}
			byte byte0;
			if(getFallbackDrawable() == null)
	//*  23   51:aload_0         
	//*  24   52:invokespecial   #390 <Method Drawable getFallbackDrawable()>
	//*  25   55:ifnonnull       63
				byte0 = 5;
	//   26   58:iconst_5        
	//   27   59:istore_1        
			else
	//*  28   60:goto            65
				byte0 = 3;
	//   29   63:iconst_3        
	//   30   64:istore_1        
			onLoadFailed(new GlideException("Received null model"), ((int) (byte0)));
	//   31   65:aload_0         
	//   32   66:new             #304 <Class GlideException>
	//   33   69:dup             
	//   34   70:ldc2            #409 <String "Received null model">
	//   35   73:invokespecial   #411 <Method void GlideException(String)>
	//   36   76:iload_1         
	//   37   77:invokespecial   #413 <Method void onLoadFailed(GlideException, int)>
			return;
	//   38   80:return          
		}
		if(status == Status.RUNNING)
	//*  39   81:aload_0         
	//*  40   82:getfield        #188 <Field SingleRequest$Status status>
	//*  41   85:getstatic       #416 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//*  42   88:if_acmpne       102
			throw new IllegalArgumentException("Cannot restart a running request");
	//   43   91:new             #418 <Class IllegalArgumentException>
	//   44   94:dup             
	//   45   95:ldc2            #420 <String "Cannot restart a running request">
	//   46   98:invokespecial   #421 <Method void IllegalArgumentException(String)>
	//   47  101:athrow          
		if(status == Status.COMPLETE)
	//*  48  102:aload_0         
	//*  49  103:getfield        #188 <Field SingleRequest$Status status>
	//*  50  106:getstatic       #327 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//*  51  109:if_acmpne       124
		{
			onResourceReady(resource, DataSource.MEMORY_CACHE);
	//   52  112:aload_0         
	//   53  113:aload_0         
	//   54  114:getfield        #329 <Field Resource resource>
	//   55  117:getstatic       #427 <Field DataSource DataSource.MEMORY_CACHE>
	//   56  120:invokevirtual   #430 <Method void onResourceReady(Resource, DataSource)>
			return;
	//   57  123:return          
		}
		status = Status.WAITING_FOR_SIZE;
	//   58  124:aload_0         
	//   59  125:getstatic       #433 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//   60  128:putfield        #188 <Field SingleRequest$Status status>
		if(Util.isValidDimensions(overrideWidth, overrideHeight))
	//*  61  131:aload_0         
	//*  62  132:getfield        #171 <Field int overrideWidth>
	//*  63  135:aload_0         
	//*  64  136:getfield        #173 <Field int overrideHeight>
	//*  65  139:invokestatic    #407 <Method boolean Util.isValidDimensions(int, int)>
	//*  66  142:ifeq            160
			onSizeReady(overrideWidth, overrideHeight);
	//   67  145:aload_0         
	//   68  146:aload_0         
	//   69  147:getfield        #171 <Field int overrideWidth>
	//   70  150:aload_0         
	//   71  151:getfield        #173 <Field int overrideHeight>
	//   72  154:invokevirtual   #437 <Method void onSizeReady(int, int)>
		else
	//*  73  157:goto            170
			target.getSize(((SizeReadyCallback) (this)));
	//   74  160:aload_0         
	//   75  161:getfield        #177 <Field Target target>
	//   76  164:aload_0         
	//   77  165:invokeinterface #441 <Method void Target.getSize(SizeReadyCallback)>
		if((status == Status.RUNNING || status == Status.WAITING_FOR_SIZE) && canNotifyStatusChanged())
	//*  78  170:aload_0         
	//*  79  171:getfield        #188 <Field SingleRequest$Status status>
	//*  80  174:getstatic       #416 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//*  81  177:if_acmpeq       190
	//*  82  180:aload_0         
	//*  83  181:getfield        #188 <Field SingleRequest$Status status>
	//*  84  184:getstatic       #433 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//*  85  187:if_acmpne       210
	//*  86  190:aload_0         
	//*  87  191:invokespecial   #389 <Method boolean canNotifyStatusChanged()>
	//*  88  194:ifeq            210
			target.onLoadStarted(getPlaceholderDrawable());
	//   89  197:aload_0         
	//   90  198:getfield        #177 <Field Target target>
	//   91  201:aload_0         
	//   92  202:invokespecial   #393 <Method Drawable getPlaceholderDrawable()>
	//   93  205:invokeinterface #444 <Method void Target.onLoadStarted(Drawable)>
		if(Log.isLoggable("Request", 2))
	//*  94  210:ldc1            #28  <String "Request">
	//*  95  212:iconst_2        
	//*  96  213:invokestatic    #448 <Method boolean Log.isLoggable(String, int)>
	//*  97  216:ifeq            249
			logV((new StringBuilder()).append("finished run method in ").append(LogTime.getElapsedMillis(startTime)).toString());
	//   98  219:aload_0         
	//   99  220:new             #229 <Class StringBuilder>
	//  100  223:dup             
	//  101  224:invokespecial   #230 <Method void StringBuilder()>
	//  102  227:ldc2            #450 <String "finished run method in ">
	//  103  230:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  104  233:aload_0         
	//  105  234:getfield        #348 <Field long startTime>
	//  106  237:invokestatic    #354 <Method double LogTime.getElapsedMillis(long)>
	//  107  240:invokevirtual   #357 <Method StringBuilder StringBuilder.append(double)>
	//  108  243:invokevirtual   #240 <Method String StringBuilder.toString()>
	//  109  246:invokespecial   #452 <Method void logV(String)>
	//  110  249:return          
	}

	void cancel()
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #277 <Method void StateVerifier.throwIfRecycled()>
		target.removeCallback(((SizeReadyCallback) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #177 <Field Target target>
	//    5   11:aload_0         
	//    6   12:invokeinterface #456 <Method void Target.removeCallback(SizeReadyCallback)>
		status = Status.CANCELLED;
	//    7   17:aload_0         
	//    8   18:getstatic       #459 <Field SingleRequest$Status SingleRequest$Status.CANCELLED>
	//    9   21:putfield        #188 <Field SingleRequest$Status status>
		if(loadStatus != null)
	//*  10   24:aload_0         
	//*  11   25:getfield        #309 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
	//*  12   28:ifnull          43
		{
			loadStatus.cancel();
	//   13   31:aload_0         
	//   14   32:getfield        #309 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
	//   15   35:invokevirtual   #463 <Method void com.bumptech.glide.load.engine.Engine$LoadStatus.cancel()>
			loadStatus = null;
	//   16   38:aload_0         
	//   17   39:aconst_null     
	//   18   40:putfield        #309 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		}
	//   19   43:return          
	}

	public void clear()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #467 <Method void Util.assertMainThread()>
		if(status == Status.CLEARED)
	//*   1    3:aload_0         
	//*   2    4:getfield        #188 <Field SingleRequest$Status status>
	//*   3    7:getstatic       #470 <Field SingleRequest$Status SingleRequest$Status.CLEARED>
	//*   4   10:if_acmpne       14
			return;
	//    5   13:return          
		cancel();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #471 <Method void cancel()>
		if(resource != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #329 <Field Resource resource>
	//*  10   22:ifnull          33
			releaseResource(resource);
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #329 <Field Resource resource>
	//   14   30:invokespecial   #473 <Method void releaseResource(Resource)>
		if(canNotifyStatusChanged())
	//*  15   33:aload_0         
	//*  16   34:invokespecial   #389 <Method boolean canNotifyStatusChanged()>
	//*  17   37:ifeq            53
			target.onLoadCleared(getPlaceholderDrawable());
	//   18   40:aload_0         
	//   19   41:getfield        #177 <Field Target target>
	//   20   44:aload_0         
	//   21   45:invokespecial   #393 <Method Drawable getPlaceholderDrawable()>
	//   22   48:invokeinterface #476 <Method void Target.onLoadCleared(Drawable)>
		status = Status.CLEARED;
	//   23   53:aload_0         
	//   24   54:getstatic       #470 <Field SingleRequest$Status SingleRequest$Status.CLEARED>
	//   25   57:putfield        #188 <Field SingleRequest$Status status>
	//   26   60:return          
	}

	public StateVerifier getVerifier()
	{
		return stateVerifier;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field StateVerifier stateVerifier>
	//    2    4:areturn         
	}

	public boolean isCancelled()
	{
		return status == Status.CANCELLED || status == Status.CLEARED;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field SingleRequest$Status status>
	//    2    4:getstatic       #459 <Field SingleRequest$Status SingleRequest$Status.CANCELLED>
	//    3    7:if_acmpeq       20
	//    4   10:aload_0         
	//    5   11:getfield        #188 <Field SingleRequest$Status status>
	//    6   14:getstatic       #470 <Field SingleRequest$Status SingleRequest$Status.CLEARED>
	//    7   17:if_acmpne       22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public boolean isComplete()
	{
		return status == Status.COMPLETE;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field SingleRequest$Status status>
	//    2    4:getstatic       #327 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isEquivalentTo(Request request)
	{
		if(request instanceof SingleRequest)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class SingleRequest>
	//*   2    4:ifeq            91
		{
			request = ((Request) ((SingleRequest)request));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class SingleRequest>
	//    5   11:astore_1        
			return overrideWidth == ((SingleRequest) (request)).overrideWidth && overrideHeight == ((SingleRequest) (request)).overrideHeight && Util.bothNullOrEqual(model, ((SingleRequest) (request)).model) && ((Object) (transcodeClass)).equals(((Object) (((SingleRequest) (request)).transcodeClass))) && requestOptions.equals(((Object) (((SingleRequest) (request)).requestOptions))) && priority == ((SingleRequest) (request)).priority;
	//    6   12:aload_0         
	//    7   13:getfield        #171 <Field int overrideWidth>
	//    8   16:aload_1         
	//    9   17:getfield        #171 <Field int overrideWidth>
	//   10   20:icmpne          89
	//   11   23:aload_0         
	//   12   24:getfield        #173 <Field int overrideHeight>
	//   13   27:aload_1         
	//   14   28:getfield        #173 <Field int overrideHeight>
	//   15   31:icmpne          89
	//   16   34:aload_0         
	//   17   35:getfield        #167 <Field Object model>
	//   18   38:aload_1         
	//   19   39:getfield        #167 <Field Object model>
	//   20   42:invokestatic    #484 <Method boolean Util.bothNullOrEqual(Object, Object)>
	//   21   45:ifeq            89
	//   22   48:aload_0         
	//   23   49:getfield        #169 <Field Class transcodeClass>
	//   24   52:aload_1         
	//   25   53:getfield        #169 <Field Class transcodeClass>
	//   26   56:invokevirtual   #488 <Method boolean Object.equals(Object)>
	//   27   59:ifeq            89
	//   28   62:aload_0         
	//   29   63:getfield        #133 <Field RequestOptions requestOptions>
	//   30   66:aload_1         
	//   31   67:getfield        #133 <Field RequestOptions requestOptions>
	//   32   70:invokevirtual   #489 <Method boolean RequestOptions.equals(Object)>
	//   33   73:ifeq            89
	//   34   76:aload_0         
	//   35   77:getfield        #175 <Field Priority priority>
	//   36   80:aload_1         
	//   37   81:getfield        #175 <Field Priority priority>
	//   38   84:if_acmpne       89
	//   39   87:iconst_1        
	//   40   88:ireturn         
	//   41   89:iconst_0        
	//   42   90:ireturn         
		} else
		{
			return false;
	//   43   91:iconst_0        
	//   44   92:ireturn         
		}
	}

	public boolean isFailed()
	{
		return status == Status.FAILED;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field SingleRequest$Status status>
	//    2    4:getstatic       #312 <Field SingleRequest$Status SingleRequest$Status.FAILED>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isPaused()
	{
		return status == Status.PAUSED;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field SingleRequest$Status status>
	//    2    4:getstatic       #494 <Field SingleRequest$Status SingleRequest$Status.PAUSED>
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
	//    1    1:invokevirtual   #497 <Method boolean isComplete()>
	//    2    4:ireturn         
	}

	public boolean isRunning()
	{
		return status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field SingleRequest$Status status>
	//    2    4:getstatic       #416 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//    3    7:if_acmpeq       20
	//    4   10:aload_0         
	//    5   11:getfield        #188 <Field SingleRequest$Status status>
	//    6   14:getstatic       #433 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//    7   17:if_acmpne       22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public void onLoadFailed(GlideException glideexception)
	{
		onLoadFailed(glideexception, 5);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_5        
	//    3    3:invokespecial   #413 <Method void onLoadFailed(GlideException, int)>
	//    4    6:return          
	}

	public void onResourceReady(Resource resource1, DataSource datasource)
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #277 <Method void StateVerifier.throwIfRecycled()>
		loadStatus = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #309 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		if(resource1 == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       57
		{
			onLoadFailed(new GlideException((new StringBuilder()).append("Expected to receive a Resource<R> with an object of ").append(((Object) (transcodeClass))).append(" inside, but instead got null.").toString()));
	//    8   16:aload_0         
	//    9   17:new             #304 <Class GlideException>
	//   10   20:dup             
	//   11   21:new             #229 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #230 <Method void StringBuilder()>
	//   14   28:ldc2            #501 <String "Expected to receive a Resource<R> with an object of ">
	//   15   31:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:aload_0         
	//   17   35:getfield        #169 <Field Class transcodeClass>
	//   18   38:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//   19   41:ldc2            #503 <String " inside, but instead got null.">
	//   20   44:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   22   50:invokespecial   #411 <Method void GlideException(String)>
	//   23   53:invokevirtual   #505 <Method void onLoadFailed(GlideException)>
			return;
	//   24   56:return          
		}
		Object obj = resource1.get();
	//   25   57:aload_1         
	//   26   58:invokeinterface #510 <Method Object Resource.get()>
	//   27   63:astore_3        
		if(obj == null || !transcodeClass.isAssignableFrom(obj.getClass()))
	//*  28   64:aload_3         
	//*  29   65:ifnull          82
	//*  30   68:aload_0         
	//*  31   69:getfield        #169 <Field Class transcodeClass>
	//*  32   72:aload_3         
	//*  33   73:invokevirtual   #335 <Method Class Object.getClass()>
	//*  34   76:invokevirtual   #514 <Method boolean Class.isAssignableFrom(Class)>
	//*  35   79:ifne            199
		{
			releaseResource(resource1);
	//   36   82:aload_0         
	//   37   83:aload_1         
	//   38   84:invokespecial   #473 <Method void releaseResource(Resource)>
			StringBuilder stringbuilder = (new StringBuilder()).append("Expected to receive an object of ").append(((Object) (transcodeClass))).append(" but instead got ");
	//   39   87:new             #229 <Class StringBuilder>
	//   40   90:dup             
	//   41   91:invokespecial   #230 <Method void StringBuilder()>
	//   42   94:ldc2            #516 <String "Expected to receive an object of ">
	//   43   97:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   44  100:aload_0         
	//   45  101:getfield        #169 <Field Class transcodeClass>
	//   46  104:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//   47  107:ldc2            #518 <String " but instead got ">
	//   48  110:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   49  113:astore          4
			if(obj != null)
	//*  50  115:aload_3         
	//*  51  116:ifnull          127
				datasource = ((DataSource) (obj.getClass()));
	//   52  119:aload_3         
	//   53  120:invokevirtual   #335 <Method Class Object.getClass()>
	//   54  123:astore_2        
			else
	//*  55  124:goto            131
				datasource = "";
	//   56  127:ldc2            #520 <String "">
	//   57  130:astore_2        
			datasource = ((DataSource) (stringbuilder.append(((Object) (datasource))).append("{").append(obj).append("} inside Resource{").append(((Object) (resource1))).append("}.")));
	//   58  131:aload           4
	//   59  133:aload_2         
	//   60  134:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//   61  137:ldc2            #522 <String "{">
	//   62  140:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   63  143:aload_3         
	//   64  144:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//   65  147:ldc2            #524 <String "} inside Resource{">
	//   66  150:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   67  153:aload_1         
	//   68  154:invokevirtual   #285 <Method StringBuilder StringBuilder.append(Object)>
	//   69  157:ldc2            #526 <String "}.">
	//   70  160:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   71  163:astore_2        
			if(obj != null)
	//*  72  164:aload_3         
	//*  73  165:ifnull          175
				resource1 = "";
	//   74  168:ldc2            #520 <String "">
	//   75  171:astore_1        
			else
	//*  76  172:goto            179
				resource1 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
	//   77  175:ldc2            #528 <String " To indicate failure return a null Resource object, rather than a Resource object containing null data.">
	//   78  178:astore_1        
			onLoadFailed(new GlideException(((StringBuilder) (datasource)).append(((String) (resource1))).toString()));
	//   79  179:aload_0         
	//   80  180:new             #304 <Class GlideException>
	//   81  183:dup             
	//   82  184:aload_2         
	//   83  185:aload_1         
	//   84  186:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   85  189:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   86  192:invokespecial   #411 <Method void GlideException(String)>
	//   87  195:invokevirtual   #505 <Method void onLoadFailed(GlideException)>
			return;
	//   88  198:return          
		}
		if(!canSetResource())
	//*  89  199:aload_0         
	//*  90  200:invokespecial   #530 <Method boolean canSetResource()>
	//*  91  203:ifne            219
		{
			releaseResource(resource1);
	//   92  206:aload_0         
	//   93  207:aload_1         
	//   94  208:invokespecial   #473 <Method void releaseResource(Resource)>
			status = Status.COMPLETE;
	//   95  211:aload_0         
	//   96  212:getstatic       #327 <Field SingleRequest$Status SingleRequest$Status.COMPLETE>
	//   97  215:putfield        #188 <Field SingleRequest$Status status>
			return;
	//   98  218:return          
		} else
		{
			onResourceReady(resource1, obj, datasource);
	//   99  219:aload_0         
	//  100  220:aload_1         
	//  101  221:aload_3         
	//  102  222:aload_2         
	//  103  223:invokespecial   #532 <Method void onResourceReady(Resource, Object, DataSource)>
			return;
	//  104  226:return          
		}
	}

	public void onSizeReady(int i, int j)
	{
		stateVerifier.throwIfRecycled();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field StateVerifier stateVerifier>
	//    2    4:invokevirtual   #277 <Method void StateVerifier.throwIfRecycled()>
		if(Log.isLoggable("Request", 2))
	//*   3    7:ldc1            #28  <String "Request">
	//*   4    9:iconst_2        
	//*   5   10:invokestatic    #448 <Method boolean Log.isLoggable(String, int)>
	//*   6   13:ifeq            46
			logV((new StringBuilder()).append("Got onSizeReady in ").append(LogTime.getElapsedMillis(startTime)).toString());
	//    7   16:aload_0         
	//    8   17:new             #229 <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #230 <Method void StringBuilder()>
	//   11   24:ldc2            #535 <String "Got onSizeReady in ">
	//   12   27:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_0         
	//   14   31:getfield        #348 <Field long startTime>
	//   15   34:invokestatic    #354 <Method double LogTime.getElapsedMillis(long)>
	//   16   37:invokevirtual   #357 <Method StringBuilder StringBuilder.append(double)>
	//   17   40:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   18   43:invokespecial   #452 <Method void logV(String)>
		if(status != Status.WAITING_FOR_SIZE)
	//*  19   46:aload_0         
	//*  20   47:getfield        #188 <Field SingleRequest$Status status>
	//*  21   50:getstatic       #433 <Field SingleRequest$Status SingleRequest$Status.WAITING_FOR_SIZE>
	//*  22   53:if_acmpeq       57
			return;
	//   23   56:return          
		status = Status.RUNNING;
	//   24   57:aload_0         
	//   25   58:getstatic       #416 <Field SingleRequest$Status SingleRequest$Status.RUNNING>
	//   26   61:putfield        #188 <Field SingleRequest$Status status>
		float f = requestOptions.getSizeMultiplier();
	//   27   64:aload_0         
	//   28   65:getfield        #133 <Field RequestOptions requestOptions>
	//   29   68:invokevirtual   #539 <Method float RequestOptions.getSizeMultiplier()>
	//   30   71:fstore_3        
		width = maybeApplySizeMultiplier(i, f);
	//   31   72:aload_0         
	//   32   73:iload_1         
	//   33   74:fload_3         
	//   34   75:invokestatic    #541 <Method int maybeApplySizeMultiplier(int, float)>
	//   35   78:putfield        #289 <Field int width>
		height = maybeApplySizeMultiplier(j, f);
	//   36   81:aload_0         
	//   37   82:iload_2         
	//   38   83:fload_3         
	//   39   84:invokestatic    #541 <Method int maybeApplySizeMultiplier(int, float)>
	//   40   87:putfield        #296 <Field int height>
		if(Log.isLoggable("Request", 2))
	//*  41   90:ldc1            #28  <String "Request">
	//*  42   92:iconst_2        
	//*  43   93:invokestatic    #448 <Method boolean Log.isLoggable(String, int)>
	//*  44   96:ifeq            129
			logV((new StringBuilder()).append("finished setup for calling load in ").append(LogTime.getElapsedMillis(startTime)).toString());
	//   45   99:aload_0         
	//   46  100:new             #229 <Class StringBuilder>
	//   47  103:dup             
	//   48  104:invokespecial   #230 <Method void StringBuilder()>
	//   49  107:ldc2            #543 <String "finished setup for calling load in ">
	//   50  110:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   51  113:aload_0         
	//   52  114:getfield        #348 <Field long startTime>
	//   53  117:invokestatic    #354 <Method double LogTime.getElapsedMillis(long)>
	//   54  120:invokevirtual   #357 <Method StringBuilder StringBuilder.append(double)>
	//   55  123:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   56  126:invokespecial   #452 <Method void logV(String)>
		loadStatus = engine.load(glideContext, model, requestOptions.getSignature(), width, height, requestOptions.getResourceClass(), transcodeClass, priority, requestOptions.getDiskCacheStrategy(), requestOptions.getTransformations(), requestOptions.isTransformationRequired(), requestOptions.isScaleOnlyOrNoTransform(), requestOptions.getOptions(), requestOptions.isMemoryCacheable(), requestOptions.getUseUnlimitedSourceGeneratorsPool(), requestOptions.getOnlyRetrieveFromCache(), ((ResourceCallback) (this)));
	//   57  129:aload_0         
	//   58  130:aload_0         
	//   59  131:getfield        #181 <Field Engine engine>
	//   60  134:aload_0         
	//   61  135:getfield        #165 <Field GlideContext glideContext>
	//   62  138:aload_0         
	//   63  139:getfield        #167 <Field Object model>
	//   64  142:aload_0         
	//   65  143:getfield        #133 <Field RequestOptions requestOptions>
	//   66  146:invokevirtual   #547 <Method com.bumptech.glide.load.Key RequestOptions.getSignature()>
	//   67  149:aload_0         
	//   68  150:getfield        #289 <Field int width>
	//   69  153:aload_0         
	//   70  154:getfield        #296 <Field int height>
	//   71  157:aload_0         
	//   72  158:getfield        #133 <Field RequestOptions requestOptions>
	//   73  161:invokevirtual   #550 <Method Class RequestOptions.getResourceClass()>
	//   74  164:aload_0         
	//   75  165:getfield        #169 <Field Class transcodeClass>
	//   76  168:aload_0         
	//   77  169:getfield        #175 <Field Priority priority>
	//   78  172:aload_0         
	//   79  173:getfield        #133 <Field RequestOptions requestOptions>
	//   80  176:invokevirtual   #554 <Method com.bumptech.glide.load.engine.DiskCacheStrategy RequestOptions.getDiskCacheStrategy()>
	//   81  179:aload_0         
	//   82  180:getfield        #133 <Field RequestOptions requestOptions>
	//   83  183:invokevirtual   #558 <Method java.util.Map RequestOptions.getTransformations()>
	//   84  186:aload_0         
	//   85  187:getfield        #133 <Field RequestOptions requestOptions>
	//   86  190:invokevirtual   #561 <Method boolean RequestOptions.isTransformationRequired()>
	//   87  193:aload_0         
	//   88  194:getfield        #133 <Field RequestOptions requestOptions>
	//   89  197:invokevirtual   #564 <Method boolean RequestOptions.isScaleOnlyOrNoTransform()>
	//   90  200:aload_0         
	//   91  201:getfield        #133 <Field RequestOptions requestOptions>
	//   92  204:invokevirtual   #568 <Method com.bumptech.glide.load.Options RequestOptions.getOptions()>
	//   93  207:aload_0         
	//   94  208:getfield        #133 <Field RequestOptions requestOptions>
	//   95  211:invokevirtual   #571 <Method boolean RequestOptions.isMemoryCacheable()>
	//   96  214:aload_0         
	//   97  215:getfield        #133 <Field RequestOptions requestOptions>
	//   98  218:invokevirtual   #574 <Method boolean RequestOptions.getUseUnlimitedSourceGeneratorsPool()>
	//   99  221:aload_0         
	//  100  222:getfield        #133 <Field RequestOptions requestOptions>
	//  101  225:invokevirtual   #577 <Method boolean RequestOptions.getOnlyRetrieveFromCache()>
	//  102  228:aload_0         
	//  103  229:invokevirtual   #581 <Method com.bumptech.glide.load.engine.Engine$LoadStatus Engine.load(GlideContext, Object, com.bumptech.glide.load.Key, int, int, Class, Class, Priority, com.bumptech.glide.load.engine.DiskCacheStrategy, java.util.Map, boolean, boolean, com.bumptech.glide.load.Options, boolean, boolean, boolean, ResourceCallback)>
	//  104  232:putfield        #309 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		if(Log.isLoggable("Request", 2))
	//* 105  235:ldc1            #28  <String "Request">
	//* 106  237:iconst_2        
	//* 107  238:invokestatic    #448 <Method boolean Log.isLoggable(String, int)>
	//* 108  241:ifeq            274
			logV((new StringBuilder()).append("finished onSizeReady in ").append(LogTime.getElapsedMillis(startTime)).toString());
	//  109  244:aload_0         
	//  110  245:new             #229 <Class StringBuilder>
	//  111  248:dup             
	//  112  249:invokespecial   #230 <Method void StringBuilder()>
	//  113  252:ldc2            #583 <String "finished onSizeReady in ">
	//  114  255:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  115  258:aload_0         
	//  116  259:getfield        #348 <Field long startTime>
	//  117  262:invokestatic    #354 <Method double LogTime.getElapsedMillis(long)>
	//  118  265:invokevirtual   #357 <Method StringBuilder StringBuilder.append(double)>
	//  119  268:invokevirtual   #240 <Method String StringBuilder.toString()>
	//  120  271:invokespecial   #452 <Method void logV(String)>
	//  121  274:return          
	}

	public void pause()
	{
		clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #586 <Method void clear()>
		status = Status.PAUSED;
	//    2    4:aload_0         
	//    3    5:getstatic       #494 <Field SingleRequest$Status SingleRequest$Status.PAUSED>
	//    4    8:putfield        #188 <Field SingleRequest$Status status>
	//    5   11:return          
	}

	public void recycle()
	{
		glideContext = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #165 <Field GlideContext glideContext>
		model = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #167 <Field Object model>
		transcodeClass = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #169 <Field Class transcodeClass>
		requestOptions = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #133 <Field RequestOptions requestOptions>
		overrideWidth = -1;
	//   12   20:aload_0         
	//   13   21:iconst_m1       
	//   14   22:putfield        #171 <Field int overrideWidth>
		overrideHeight = -1;
	//   15   25:aload_0         
	//   16   26:iconst_m1       
	//   17   27:putfield        #173 <Field int overrideHeight>
		target = null;
	//   18   30:aload_0         
	//   19   31:aconst_null     
	//   20   32:putfield        #177 <Field Target target>
		requestListener = null;
	//   21   35:aload_0         
	//   22   36:aconst_null     
	//   23   37:putfield        #179 <Field RequestListener requestListener>
		requestCoordinator = null;
	//   24   40:aload_0         
	//   25   41:aconst_null     
	//   26   42:putfield        #118 <Field RequestCoordinator requestCoordinator>
		animationFactory = null;
	//   27   45:aload_0         
	//   28   46:aconst_null     
	//   29   47:putfield        #183 <Field TransitionFactory animationFactory>
		loadStatus = null;
	//   30   50:aload_0         
	//   31   51:aconst_null     
	//   32   52:putfield        #309 <Field com.bumptech.glide.load.engine.Engine$LoadStatus loadStatus>
		errorDrawable = null;
	//   33   55:aload_0         
	//   34   56:aconst_null     
	//   35   57:putfield        #131 <Field Drawable errorDrawable>
		placeholderDrawable = null;
	//   36   60:aload_0         
	//   37   61:aconst_null     
	//   38   62:putfield        #156 <Field Drawable placeholderDrawable>
		fallbackDrawable = null;
	//   39   65:aload_0         
	//   40   66:aconst_null     
	//   41   67:putfield        #148 <Field Drawable fallbackDrawable>
		width = -1;
	//   42   70:aload_0         
	//   43   71:iconst_m1       
	//   44   72:putfield        #289 <Field int width>
		height = -1;
	//   45   75:aload_0         
	//   46   76:iconst_m1       
	//   47   77:putfield        #296 <Field int height>
		POOL.release(((Object) (this)));
	//   48   80:getstatic       #90  <Field android.support.v4.util.Pools$Pool POOL>
	//   49   83:aload_0         
	//   50   84:invokeinterface #589 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   51   89:pop             
	//   52   90:return          
	}

	private static final String GLIDE_TAG = "Glide";
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
	private static boolean shouldCallAppCompatResources = false;
	private TransitionFactory animationFactory;
	private Engine engine;
	private Drawable errorDrawable;
	private Drawable fallbackDrawable;
	private GlideContext glideContext;
	private int height;
	private com.bumptech.glide.load.engine.Engine.LoadStatus loadStatus;
	private Object model;
	private int overrideHeight;
	private int overrideWidth;
	private Drawable placeholderDrawable;
	private Priority priority;
	private RequestCoordinator requestCoordinator;
	private RequestListener requestListener;
	private RequestOptions requestOptions;
	private Resource resource;
	private long startTime;
	private final StateVerifier stateVerifier = StateVerifier.newInstance();
	private Status status;
	private final String tag = String.valueOf(super.hashCode());
	private Target target;
	private Class transcodeClass;
	private int width;

	static 
	{
	//    0    0:sipush          150
	//    1    3:new             #15  <Class SingleRequest$1>
	//    2    6:dup             
	//    3    7:invokespecial   #82  <Method void SingleRequest$1()>
	//    4   10:invokestatic    #88  <Method android.support.v4.util.Pools$Pool FactoryPools.simple(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
	//    5   13:putstatic       #90  <Field android.support.v4.util.Pools$Pool POOL>
		shouldCallAppCompatResources = true;
	//    6   16:iconst_1        
	//    7   17:putstatic       #92  <Field boolean shouldCallAppCompatResources>
	//*   8   20:return          
	}
}
