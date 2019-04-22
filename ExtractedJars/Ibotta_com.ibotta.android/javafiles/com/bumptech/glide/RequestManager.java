// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.bumptech.glide:
//			ModelTypes, Priority, Glide, GlideContext, 
//			RequestBuilder, TransitionOptions

public class RequestManager
	implements ModelTypes, LifecycleListener
{
	private class RequestManagerConnectivityListener
		implements com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
	{

		public void onConnectivityChanged(boolean flag)
		{
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            26
			{
				synchronized(RequestManager.this)
		//*   2    4:aload_0         
		//*   3    5:getfield        #21  <Field RequestManager this$0>
		//*   4    8:astore_2        
		//*   5    9:aload_2         
		//*   6   10:monitorenter    
				{
					requestTracker.restartRequests();
		//    7   11:aload_0         
		//    8   12:getfield        #26  <Field RequestTracker requestTracker>
		//    9   15:invokevirtual   #35  <Method void RequestTracker.restartRequests()>
				}
		//   10   18:aload_2         
		//   11   19:monitorexit     
				return;
		//   12   20:return          
			} else
		//*  13   21:astore_3        
		//*  14   22:aload_2         
		//*  15   23:monitorexit     
		//*  16   24:aload_3         
		//*  17   25:athrow          
			{
				return;
		//   18   26:return          
			}
			exception;
			requestmanager;
			JVM INSTR monitorexit ;
			throw exception;
		}

		private final RequestTracker requestTracker;
		final RequestManager this$0;

		RequestManagerConnectivityListener(RequestTracker requesttracker)
		{
			this$0 = RequestManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field RequestManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			requestTracker = requesttracker;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field RequestTracker requestTracker>
		//    8   14:return          
		}
	}


	public RequestManager(Glide glide1, Lifecycle lifecycle1, RequestManagerTreeNode requestmanagertreenode, Context context1)
	{
		this(glide1, lifecycle1, requestmanagertreenode, new RequestTracker(), glide1.getConnectivityMonitorFactory(), context1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #95  <Class RequestTracker>
	//    5    7:dup             
	//    6    8:invokespecial   #97  <Method void RequestTracker()>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #103 <Method ConnectivityMonitorFactory Glide.getConnectivityMonitorFactory()>
	//    9   15:aload           4
	//   10   17:invokespecial   #106 <Method void RequestManager(Glide, Lifecycle, RequestManagerTreeNode, RequestTracker, ConnectivityMonitorFactory, Context)>
	//   11   20:return          
	}

	RequestManager(Glide glide1, Lifecycle lifecycle1, RequestManagerTreeNode requestmanagertreenode, RequestTracker requesttracker, ConnectivityMonitorFactory connectivitymonitorfactory, Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method void Object()>
		targetTracker = new TargetTracker();
	//    2    4:aload_0         
	//    3    5:new             #110 <Class TargetTracker>
	//    4    8:dup             
	//    5    9:invokespecial   #111 <Method void TargetTracker()>
	//    6   12:putfield        #113 <Field TargetTracker targetTracker>
		addSelfToLifecycle = new Runnable() {

			public void run()
			{
				lifecycle.addListener(((LifecycleListener) (RequestManager.this)));
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field RequestManager this$0>
			//    2    4:getfield        #23  <Field Lifecycle RequestManager.lifecycle>
			//    3    7:aload_0         
			//    4    8:getfield        #14  <Field RequestManager this$0>
			//    5   11:invokeinterface #29  <Method void Lifecycle.addListener(LifecycleListener)>
			//    6   16:return          
			}

			final RequestManager this$0;

			
			{
				this$0 = RequestManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field RequestManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    7   15:aload_0         
	//    8   16:new             #11  <Class RequestManager$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #116 <Method void RequestManager$1(RequestManager)>
	//   12   24:putfield        #118 <Field Runnable addSelfToLifecycle>
		mainHandler = new Handler(Looper.getMainLooper());
	//   13   27:aload_0         
	//   14   28:new             #120 <Class Handler>
	//   15   31:dup             
	//   16   32:invokestatic    #126 <Method Looper Looper.getMainLooper()>
	//   17   35:invokespecial   #129 <Method void Handler(Looper)>
	//   18   38:putfield        #131 <Field Handler mainHandler>
		glide = glide1;
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:putfield        #133 <Field Glide glide>
		lifecycle = lifecycle1;
	//   22   46:aload_0         
	//   23   47:aload_2         
	//   24   48:putfield        #135 <Field Lifecycle lifecycle>
		treeNode = requestmanagertreenode;
	//   25   51:aload_0         
	//   26   52:aload_3         
	//   27   53:putfield        #137 <Field RequestManagerTreeNode treeNode>
		requestTracker = requesttracker;
	//   28   56:aload_0         
	//   29   57:aload           4
	//   30   59:putfield        #139 <Field RequestTracker requestTracker>
		context = context1;
	//   31   62:aload_0         
	//   32   63:aload           6
	//   33   65:putfield        #141 <Field Context context>
		connectivityMonitor = connectivitymonitorfactory.build(context1.getApplicationContext(), ((com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener) (new RequestManagerConnectivityListener(requesttracker))));
	//   34   68:aload_0         
	//   35   69:aload           5
	//   36   71:aload           6
	//   37   73:invokevirtual   #147 <Method Context Context.getApplicationContext()>
	//   38   76:new             #13  <Class RequestManager$RequestManagerConnectivityListener>
	//   39   79:dup             
	//   40   80:aload_0         
	//   41   81:aload           4
	//   42   83:invokespecial   #150 <Method void RequestManager$RequestManagerConnectivityListener(RequestManager, RequestTracker)>
	//   43   86:invokeinterface #156 <Method ConnectivityMonitor ConnectivityMonitorFactory.build(Context, com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener)>
	//   44   91:putfield        #158 <Field ConnectivityMonitor connectivityMonitor>
		if(Util.isOnBackgroundThread())
	//*  45   94:invokestatic    #164 <Method boolean Util.isOnBackgroundThread()>
	//*  46   97:ifeq            115
			mainHandler.post(addSelfToLifecycle);
	//   47  100:aload_0         
	//   48  101:getfield        #131 <Field Handler mainHandler>
	//   49  104:aload_0         
	//   50  105:getfield        #118 <Field Runnable addSelfToLifecycle>
	//   51  108:invokevirtual   #168 <Method boolean Handler.post(Runnable)>
	//   52  111:pop             
		else
	//*  53  112:goto            122
			lifecycle1.addListener(((LifecycleListener) (this)));
	//   54  115:aload_2         
	//   55  116:aload_0         
	//   56  117:invokeinterface #174 <Method void Lifecycle.addListener(LifecycleListener)>
		lifecycle1.addListener(((LifecycleListener) (connectivityMonitor)));
	//   57  122:aload_2         
	//   58  123:aload_0         
	//   59  124:getfield        #158 <Field ConnectivityMonitor connectivityMonitor>
	//   60  127:invokeinterface #174 <Method void Lifecycle.addListener(LifecycleListener)>
		defaultRequestListeners = new CopyOnWriteArrayList(((java.util.Collection) (glide1.getGlideContext().getDefaultRequestListeners())));
	//   61  132:aload_0         
	//   62  133:new             #176 <Class CopyOnWriteArrayList>
	//   63  136:dup             
	//   64  137:aload_1         
	//   65  138:invokevirtual   #180 <Method GlideContext Glide.getGlideContext()>
	//   66  141:invokevirtual   #186 <Method List GlideContext.getDefaultRequestListeners()>
	//   67  144:invokespecial   #189 <Method void CopyOnWriteArrayList(java.util.Collection)>
	//   68  147:putfield        #191 <Field CopyOnWriteArrayList defaultRequestListeners>
		setRequestOptions(glide1.getGlideContext().getDefaultRequestOptions());
	//   69  150:aload_0         
	//   70  151:aload_1         
	//   71  152:invokevirtual   #180 <Method GlideContext Glide.getGlideContext()>
	//   72  155:invokevirtual   #195 <Method RequestOptions GlideContext.getDefaultRequestOptions()>
	//   73  158:invokevirtual   #199 <Method void setRequestOptions(RequestOptions)>
		glide1.registerRequestManager(this);
	//   74  161:aload_1         
	//   75  162:aload_0         
	//   76  163:invokevirtual   #202 <Method void Glide.registerRequestManager(RequestManager)>
	//   77  166:return          
	}

	private void untrackOrDelegate(Target target)
	{
		if(!untrack(target) && !glide.removeFromManagers(target) && target.getRequest() != null)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #208 <Method boolean untrack(Target)>
	//*   3    5:ifne            48
	//*   4    8:aload_0         
	//*   5    9:getfield        #133 <Field Glide glide>
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #211 <Method boolean Glide.removeFromManagers(Target)>
	//*   8   16:ifne            48
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #217 <Method Request Target.getRequest()>
	//*  11   25:ifnull          48
		{
			Request request = target.getRequest();
	//   12   28:aload_1         
	//   13   29:invokeinterface #217 <Method Request Target.getRequest()>
	//   14   34:astore_2        
			target.setRequest(((Request) (null)));
	//   15   35:aload_1         
	//   16   36:aconst_null     
	//   17   37:invokeinterface #221 <Method void Target.setRequest(Request)>
			request.clear();
	//   18   42:aload_2         
	//   19   43:invokeinterface #226 <Method void Request.clear()>
		}
	//   20   48:return          
	}

	public RequestBuilder as(Class class1)
	{
		return new RequestBuilder(glide, this, class1, context);
	//    0    0:new             #233 <Class RequestBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #133 <Field Glide glide>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #141 <Field Context context>
	//    8   14:invokespecial   #236 <Method void RequestBuilder(Glide, RequestManager, Class, Context)>
	//    9   17:areturn         
	}

	public RequestBuilder asBitmap()
	{
		return as(android/graphics/Bitmap).apply(((com.bumptech.glide.request.BaseRequestOptions) (DECODE_TYPE_BITMAP)));
	//    0    0:aload_0         
	//    1    1:ldc1            #47  <Class Bitmap>
	//    2    3:invokevirtual   #242 <Method RequestBuilder as(Class)>
	//    3    6:getstatic       #59  <Field RequestOptions DECODE_TYPE_BITMAP>
	//    4    9:invokevirtual   #246 <Method RequestBuilder RequestBuilder.apply(com.bumptech.glide.request.BaseRequestOptions)>
	//    5   12:areturn         
	}

	public RequestBuilder asDrawable()
	{
		return as(android/graphics/drawable/Drawable);
	//    0    0:aload_0         
	//    1    1:ldc1            #250 <Class Drawable>
	//    2    3:invokevirtual   #242 <Method RequestBuilder as(Class)>
	//    3    6:areturn         
	}

	public void clear(Target target)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(target == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
	//*   4    6:aload_0         
			return;
	//    5    7:monitorexit     
	//    6    8:return          
		untrackOrDelegate(target);
	//    7    9:aload_0         
	//    8   10:aload_1         
	//    9   11:invokespecial   #254 <Method void untrackOrDelegate(Target)>
		this;
	//   10   14:aload_0         
		JVM INSTR monitorexit ;
	//   11   15:monitorexit     
		return;
	//   12   16:return          
		target;
	//   13   17:astore_1        
	//*  14   18:aload_0         
		throw target;
	//   15   19:monitorexit     
	//   16   20:aload_1         
	//   17   21:athrow          
	}

	List getDefaultRequestListeners()
	{
		return ((List) (defaultRequestListeners));
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field CopyOnWriteArrayList defaultRequestListeners>
	//    2    4:areturn         
	}

	RequestOptions getDefaultRequestOptions()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		RequestOptions requestoptions = requestOptions;
	//    2    2:aload_0         
	//    3    3:getfield        #257 <Field RequestOptions requestOptions>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return requestoptions;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	TransitionOptions getDefaultTransitionOptions(Class class1)
	{
		return glide.getGlideContext().getDefaultTransitionOptions(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Glide glide>
	//    2    4:invokevirtual   #180 <Method GlideContext Glide.getGlideContext()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #261 <Method TransitionOptions GlideContext.getDefaultTransitionOptions(Class)>
	//    5   11:areturn         
	}

	public RequestBuilder load(Bitmap bitmap)
	{
		return asDrawable().load(bitmap);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #268 <Method RequestBuilder RequestBuilder.load(Bitmap)>
	//    4    8:areturn         
	}

	public RequestBuilder load(Drawable drawable)
	{
		return asDrawable().load(drawable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #272 <Method RequestBuilder RequestBuilder.load(Drawable)>
	//    4    8:areturn         
	}

	public RequestBuilder load(Uri uri)
	{
		return asDrawable().load(uri);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #276 <Method RequestBuilder RequestBuilder.load(Uri)>
	//    4    8:areturn         
	}

	public RequestBuilder load(File file)
	{
		return asDrawable().load(file);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #280 <Method RequestBuilder RequestBuilder.load(File)>
	//    4    8:areturn         
	}

	public RequestBuilder load(Integer integer)
	{
		return asDrawable().load(integer);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #286 <Method RequestBuilder RequestBuilder.load(Integer)>
	//    4    8:areturn         
	}

	public RequestBuilder load(Object obj)
	{
		return asDrawable().load(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #290 <Method RequestBuilder RequestBuilder.load(Object)>
	//    4    8:areturn         
	}

	public RequestBuilder load(String s)
	{
		return asDrawable().load(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #294 <Method RequestBuilder RequestBuilder.load(String)>
	//    4    8:areturn         
	}

	public RequestBuilder load(URL url)
	{
		return asDrawable().load(url);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #299 <Method RequestBuilder RequestBuilder.load(URL)>
	//    4    8:areturn         
	}

	public RequestBuilder load(byte abyte0[])
	{
		return asDrawable().load(abyte0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #266 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #304 <Method RequestBuilder RequestBuilder.load(byte[])>
	//    4    8:areturn         
	}

	public volatile Object load(Bitmap bitmap)
	{
		return ((Object) (load(bitmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #307 <Method RequestBuilder load(Bitmap)>
	//    3    5:areturn         
	}

	public volatile Object load(Drawable drawable)
	{
		return ((Object) (load(drawable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #309 <Method RequestBuilder load(Drawable)>
	//    3    5:areturn         
	}

	public volatile Object load(Uri uri)
	{
		return ((Object) (load(uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #311 <Method RequestBuilder load(Uri)>
	//    3    5:areturn         
	}

	public volatile Object load(File file)
	{
		return ((Object) (load(file)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #313 <Method RequestBuilder load(File)>
	//    3    5:areturn         
	}

	public volatile Object load(Integer integer)
	{
		return ((Object) (load(integer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #315 <Method RequestBuilder load(Integer)>
	//    3    5:areturn         
	}

	public volatile Object load(Object obj)
	{
		return ((Object) (load(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #317 <Method RequestBuilder load(Object)>
	//    3    5:areturn         
	}

	public volatile Object load(String s)
	{
		return ((Object) (load(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #319 <Method RequestBuilder load(String)>
	//    3    5:areturn         
	}

	public volatile Object load(URL url)
	{
		return ((Object) (load(url)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #321 <Method RequestBuilder load(URL)>
	//    3    5:areturn         
	}

	public volatile Object load(byte abyte0[])
	{
		return ((Object) (load(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #323 <Method RequestBuilder load(byte[])>
	//    3    5:areturn         
	}

	public void onDestroy()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		targetTracker.onDestroy();
	//    2    2:aload_0         
	//    3    3:getfield        #113 <Field TargetTracker targetTracker>
	//    4    6:invokevirtual   #326 <Method void TargetTracker.onDestroy()>
		for(Iterator iterator = targetTracker.getAll().iterator(); iterator.hasNext(); clear((Target)iterator.next()));
	//    5    9:aload_0         
	//    6   10:getfield        #113 <Field TargetTracker targetTracker>
	//    7   13:invokevirtual   #329 <Method List TargetTracker.getAll()>
	//    8   16:invokeinterface #335 <Method Iterator List.iterator()>
	//    9   21:astore_1        
	//   10   22:aload_1         
	//   11   23:invokeinterface #340 <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            47
	//   13   31:aload_0         
	//   14   32:aload_1         
	//   15   33:invokeinterface #344 <Method Object Iterator.next()>
	//   16   38:checkcast       #213 <Class Target>
	//   17   41:invokevirtual   #346 <Method void clear(Target)>
	//*  18   44:goto            22
		targetTracker.clear();
	//   19   47:aload_0         
	//   20   48:getfield        #113 <Field TargetTracker targetTracker>
	//   21   51:invokevirtual   #347 <Method void TargetTracker.clear()>
		requestTracker.clearRequests();
	//   22   54:aload_0         
	//   23   55:getfield        #139 <Field RequestTracker requestTracker>
	//   24   58:invokevirtual   #350 <Method void RequestTracker.clearRequests()>
		lifecycle.removeListener(((LifecycleListener) (this)));
	//   25   61:aload_0         
	//   26   62:getfield        #135 <Field Lifecycle lifecycle>
	//   27   65:aload_0         
	//   28   66:invokeinterface #353 <Method void Lifecycle.removeListener(LifecycleListener)>
		lifecycle.removeListener(((LifecycleListener) (connectivityMonitor)));
	//   29   71:aload_0         
	//   30   72:getfield        #135 <Field Lifecycle lifecycle>
	//   31   75:aload_0         
	//   32   76:getfield        #158 <Field ConnectivityMonitor connectivityMonitor>
	//   33   79:invokeinterface #353 <Method void Lifecycle.removeListener(LifecycleListener)>
		mainHandler.removeCallbacks(addSelfToLifecycle);
	//   34   84:aload_0         
	//   35   85:getfield        #131 <Field Handler mainHandler>
	//   36   88:aload_0         
	//   37   89:getfield        #118 <Field Runnable addSelfToLifecycle>
	//   38   92:invokevirtual   #357 <Method void Handler.removeCallbacks(Runnable)>
		glide.unregisterRequestManager(this);
	//   39   95:aload_0         
	//   40   96:getfield        #133 <Field Glide glide>
	//   41   99:aload_0         
	//   42  100:invokevirtual   #360 <Method void Glide.unregisterRequestManager(RequestManager)>
		this;
	//   43  103:aload_0         
		JVM INSTR monitorexit ;
	//   44  104:monitorexit     
		return;
	//   45  105:return          
		Exception exception;
		exception;
	//   46  106:astore_1        
	//*  47  107:aload_0         
		throw exception;
	//   48  108:monitorexit     
	//   49  109:aload_1         
	//   50  110:athrow          
	}

	public void onStart()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		resumeRequests();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #364 <Method void resumeRequests()>
		targetTracker.onStart();
	//    4    6:aload_0         
	//    5    7:getfield        #113 <Field TargetTracker targetTracker>
	//    6   10:invokevirtual   #366 <Method void TargetTracker.onStart()>
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
		Exception exception;
		exception;
	//   10   16:astore_1        
	//*  11   17:aload_0         
		throw exception;
	//   12   18:monitorexit     
	//   13   19:aload_1         
	//   14   20:athrow          
	}

	public void onStop()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		pauseRequests();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #370 <Method void pauseRequests()>
		targetTracker.onStop();
	//    4    6:aload_0         
	//    5    7:getfield        #113 <Field TargetTracker targetTracker>
	//    6   10:invokevirtual   #372 <Method void TargetTracker.onStop()>
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
		Exception exception;
		exception;
	//   10   16:astore_1        
	//*  11   17:aload_0         
		throw exception;
	//   12   18:monitorexit     
	//   13   19:aload_1         
	//   14   20:athrow          
	}

	public void pauseRequests()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		requestTracker.pauseRequests();
	//    2    2:aload_0         
	//    3    3:getfield        #139 <Field RequestTracker requestTracker>
	//    4    6:invokevirtual   #373 <Method void RequestTracker.pauseRequests()>
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		Exception exception;
		exception;
	//    8   12:astore_1        
	//*   9   13:aload_0         
		throw exception;
	//   10   14:monitorexit     
	//   11   15:aload_1         
	//   12   16:athrow          
	}

	public void resumeRequests()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		requestTracker.resumeRequests();
	//    2    2:aload_0         
	//    3    3:getfield        #139 <Field RequestTracker requestTracker>
	//    4    6:invokevirtual   #374 <Method void RequestTracker.resumeRequests()>
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		Exception exception;
		exception;
	//    8   12:astore_1        
	//*   9   13:aload_0         
		throw exception;
	//   10   14:monitorexit     
	//   11   15:aload_1         
	//   12   16:athrow          
	}

	protected void setRequestOptions(RequestOptions requestoptions)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		requestOptions = (RequestOptions)((RequestOptions)requestoptions.clone()).autoClone();
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #377 <Method com.bumptech.glide.request.BaseRequestOptions RequestOptions.clone()>
	//    5    7:checkcast       #49  <Class RequestOptions>
	//    6   10:invokevirtual   #380 <Method com.bumptech.glide.request.BaseRequestOptions RequestOptions.autoClone()>
	//    7   13:checkcast       #49  <Class RequestOptions>
	//    8   16:putfield        #257 <Field RequestOptions requestOptions>
		this;
	//    9   19:aload_0         
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return;
	//   11   21:return          
		requestoptions;
	//   12   22:astore_1        
	//*  13   23:aload_0         
		throw requestoptions;
	//   14   24:monitorexit     
	//   15   25:aload_1         
	//   16   26:athrow          
	}

	public String toString()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//    2    2:new             #384 <Class StringBuilder>
	//    3    5:dup             
	//    4    6:invokespecial   #385 <Method void StringBuilder()>
	//    5    9:astore_1        
		((StringBuilder) (obj)).append(super.toString());
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokespecial   #387 <Method String Object.toString()>
	//    9   15:invokevirtual   #391 <Method StringBuilder StringBuilder.append(String)>
	//   10   18:pop             
		((StringBuilder) (obj)).append("{tracker=");
	//   11   19:aload_1         
	//   12   20:ldc2            #393 <String "{tracker=">
	//   13   23:invokevirtual   #391 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
		((StringBuilder) (obj)).append(((Object) (requestTracker)));
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #139 <Field RequestTracker requestTracker>
	//   18   32:invokevirtual   #396 <Method StringBuilder StringBuilder.append(Object)>
	//   19   35:pop             
		((StringBuilder) (obj)).append(", treeNode=");
	//   20   36:aload_1         
	//   21   37:ldc2            #398 <String ", treeNode=">
	//   22   40:invokevirtual   #391 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		((StringBuilder) (obj)).append(((Object) (treeNode)));
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:getfield        #137 <Field RequestManagerTreeNode treeNode>
	//   27   49:invokevirtual   #396 <Method StringBuilder StringBuilder.append(Object)>
	//   28   52:pop             
		((StringBuilder) (obj)).append("}");
	//   29   53:aload_1         
	//   30   54:ldc2            #400 <String "}">
	//   31   57:invokevirtual   #391 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   33   61:aload_1         
	//   34   62:invokevirtual   #401 <Method String StringBuilder.toString()>
	//   35   65:astore_1        
		this;
	//   36   66:aload_0         
		JVM INSTR monitorexit ;
	//   37   67:monitorexit     
		return ((String) (obj));
	//   38   68:aload_1         
	//   39   69:areturn         
		Exception exception;
		exception;
	//   40   70:astore_1        
	//*  41   71:aload_0         
		throw exception;
	//   42   72:monitorexit     
	//   43   73:aload_1         
	//   44   74:athrow          
	}

	void track(Target target, Request request)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		targetTracker.track(target);
	//    2    2:aload_0         
	//    3    3:getfield        #113 <Field TargetTracker targetTracker>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #405 <Method void TargetTracker.track(Target)>
		requestTracker.runRequest(request);
	//    6   10:aload_0         
	//    7   11:getfield        #139 <Field RequestTracker requestTracker>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #408 <Method void RequestTracker.runRequest(Request)>
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		target;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw target;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	boolean untrack(Target target)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Request request = target.getRequest();
	//    2    2:aload_1         
	//    3    3:invokeinterface #217 <Method Request Target.getRequest()>
	//    4    8:astore_2        
		if(request != null)
			break MISSING_BLOCK_LABEL_17;
	//    5    9:aload_2         
	//    6   10:ifnonnull       17
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return true;
	//    9   15:iconst_1        
	//   10   16:ireturn         
		if(!requestTracker.clearRemoveAndRecycle(request))
			break MISSING_BLOCK_LABEL_47;
	//   11   17:aload_0         
	//   12   18:getfield        #139 <Field RequestTracker requestTracker>
	//   13   21:aload_2         
	//   14   22:invokevirtual   #413 <Method boolean RequestTracker.clearRemoveAndRecycle(Request)>
	//   15   25:ifeq            47
		targetTracker.untrack(target);
	//   16   28:aload_0         
	//   17   29:getfield        #113 <Field TargetTracker targetTracker>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #415 <Method void TargetTracker.untrack(Target)>
		target.setRequest(((Request) (null)));
	//   20   36:aload_1         
	//   21   37:aconst_null     
	//   22   38:invokeinterface #221 <Method void Target.setRequest(Request)>
	//*  23   43:aload_0         
	//*  24   44:monitorexit     
		return true;
	//   25   45:iconst_1        
	//   26   46:ireturn         
		this;
	//   27   47:aload_0         
		JVM INSTR monitorexit ;
	//   28   48:monitorexit     
		return false;
	//   29   49:iconst_0        
	//   30   50:ireturn         
		target;
	//   31   51:astore_1        
	//*  32   52:aload_0         
		throw target;
	//   33   53:monitorexit     
	//   34   54:aload_1         
	//   35   55:athrow          
	}

	private static final RequestOptions DECODE_TYPE_BITMAP = (RequestOptions)RequestOptions.decodeTypeOf(android/graphics/Bitmap).lock();
	private static final RequestOptions DECODE_TYPE_GIF = (RequestOptions)RequestOptions.decodeTypeOf(com/bumptech/glide/load/resource/gif/GifDrawable).lock();
	private static final RequestOptions DOWNLOAD_ONLY_OPTIONS;
	private final Runnable addSelfToLifecycle;
	private final ConnectivityMonitor connectivityMonitor;
	protected final Context context;
	private final CopyOnWriteArrayList defaultRequestListeners;
	protected final Glide glide;
	final Lifecycle lifecycle;
	private final Handler mainHandler;
	private RequestOptions requestOptions;
	private final RequestTracker requestTracker;
	private final TargetTracker targetTracker;
	private final RequestManagerTreeNode treeNode;

	static 
	{
	//    0    0:ldc1            #47  <Class Bitmap>
	//    1    2:invokestatic    #53  <Method RequestOptions RequestOptions.decodeTypeOf(Class)>
	//    2    5:invokevirtual   #57  <Method com.bumptech.glide.request.BaseRequestOptions RequestOptions.lock()>
	//    3    8:checkcast       #49  <Class RequestOptions>
	//    4   11:putstatic       #59  <Field RequestOptions DECODE_TYPE_BITMAP>
	//    5   14:ldc1            #61  <Class GifDrawable>
	//    6   16:invokestatic    #53  <Method RequestOptions RequestOptions.decodeTypeOf(Class)>
	//    7   19:invokevirtual   #57  <Method com.bumptech.glide.request.BaseRequestOptions RequestOptions.lock()>
	//    8   22:checkcast       #49  <Class RequestOptions>
	//    9   25:putstatic       #63  <Field RequestOptions DECODE_TYPE_GIF>
		DOWNLOAD_ONLY_OPTIONS = (RequestOptions)((RequestOptions)RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.DATA).priority(Priority.LOW)).skipMemoryCache(true);
	//   10   28:getstatic       #69  <Field DiskCacheStrategy DiskCacheStrategy.DATA>
	//   11   31:invokestatic    #73  <Method RequestOptions RequestOptions.diskCacheStrategyOf(DiskCacheStrategy)>
	//   12   34:getstatic       #79  <Field Priority Priority.LOW>
	//   13   37:invokevirtual   #83  <Method com.bumptech.glide.request.BaseRequestOptions RequestOptions.priority(Priority)>
	//   14   40:checkcast       #49  <Class RequestOptions>
	//   15   43:iconst_1        
	//   16   44:invokevirtual   #87  <Method com.bumptech.glide.request.BaseRequestOptions RequestOptions.skipMemoryCache(boolean)>
	//   17   47:checkcast       #49  <Class RequestOptions>
	//   18   50:putstatic       #89  <Field RequestOptions DOWNLOAD_ONLY_OPTIONS>
	//*  19   53:return          
	}
}
