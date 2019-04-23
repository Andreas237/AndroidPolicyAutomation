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
import android.view.View;
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
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.*;

// Referenced classes of package com.bumptech.glide:
//			ModelTypes, Priority, Glide, GlideContext, 
//			RequestBuilder, TransitionOptions

public class RequestManager
	implements LifecycleListener, ModelTypes
{
	private static class ClearTarget extends ViewTarget
	{

		public void onResourceReady(Object obj, Transition transition)
		{
		//    0    0:return          
		}

		ClearTarget(View view)
		{
			super(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void ViewTarget(View)>
		//    3    5:return          
		}
	}

	private static class RequestManagerConnectivityListener
		implements com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
	{

		public void onConnectivityChanged(boolean flag)
		{
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            11
				requestTracker.restartRequests();
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field RequestTracker requestTracker>
		//    4    8:invokevirtual   #28  <Method void RequestTracker.restartRequests()>
		//    5   11:return          
		}

		private final RequestTracker requestTracker;

		RequestManagerConnectivityListener(RequestTracker requesttracker)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			requestTracker = requesttracker;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field RequestTracker requestTracker>
		//    5    9:return          
		}
	}


	public RequestManager(Glide glide1, Lifecycle lifecycle1, RequestManagerTreeNode requestmanagertreenode, Context context1)
	{
		this(glide1, lifecycle1, requestmanagertreenode, new RequestTracker(), glide1.getConnectivityMonitorFactory(), context1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #94  <Class RequestTracker>
	//    5    7:dup             
	//    6    8:invokespecial   #96  <Method void RequestTracker()>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #102 <Method ConnectivityMonitorFactory Glide.getConnectivityMonitorFactory()>
	//    9   15:aload           4
	//   10   17:invokespecial   #105 <Method void RequestManager(Glide, Lifecycle, RequestManagerTreeNode, RequestTracker, ConnectivityMonitorFactory, Context)>
	//   11   20:return          
	}

	RequestManager(Glide glide1, Lifecycle lifecycle1, RequestManagerTreeNode requestmanagertreenode, RequestTracker requesttracker, ConnectivityMonitorFactory connectivitymonitorfactory, Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void Object()>
		targetTracker = new TargetTracker();
	//    2    4:aload_0         
	//    3    5:new             #109 <Class TargetTracker>
	//    4    8:dup             
	//    5    9:invokespecial   #110 <Method void TargetTracker()>
	//    6   12:putfield        #112 <Field TargetTracker targetTracker>
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
	//   11   21:invokespecial   #115 <Method void RequestManager$1(RequestManager)>
	//   12   24:putfield        #117 <Field Runnable addSelfToLifecycle>
		mainHandler = new Handler(Looper.getMainLooper());
	//   13   27:aload_0         
	//   14   28:new             #119 <Class Handler>
	//   15   31:dup             
	//   16   32:invokestatic    #125 <Method Looper Looper.getMainLooper()>
	//   17   35:invokespecial   #128 <Method void Handler(Looper)>
	//   18   38:putfield        #130 <Field Handler mainHandler>
		glide = glide1;
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:putfield        #132 <Field Glide glide>
		lifecycle = lifecycle1;
	//   22   46:aload_0         
	//   23   47:aload_2         
	//   24   48:putfield        #134 <Field Lifecycle lifecycle>
		treeNode = requestmanagertreenode;
	//   25   51:aload_0         
	//   26   52:aload_3         
	//   27   53:putfield        #136 <Field RequestManagerTreeNode treeNode>
		requestTracker = requesttracker;
	//   28   56:aload_0         
	//   29   57:aload           4
	//   30   59:putfield        #138 <Field RequestTracker requestTracker>
		context = context1;
	//   31   62:aload_0         
	//   32   63:aload           6
	//   33   65:putfield        #140 <Field Context context>
		connectivityMonitor = connectivitymonitorfactory.build(context1.getApplicationContext(), ((com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener) (new RequestManagerConnectivityListener(requesttracker))));
	//   34   68:aload_0         
	//   35   69:aload           5
	//   36   71:aload           6
	//   37   73:invokevirtual   #146 <Method Context Context.getApplicationContext()>
	//   38   76:new             #18  <Class RequestManager$RequestManagerConnectivityListener>
	//   39   79:dup             
	//   40   80:aload           4
	//   41   82:invokespecial   #149 <Method void RequestManager$RequestManagerConnectivityListener(RequestTracker)>
	//   42   85:invokeinterface #155 <Method ConnectivityMonitor ConnectivityMonitorFactory.build(Context, com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener)>
	//   43   90:putfield        #157 <Field ConnectivityMonitor connectivityMonitor>
		if(Util.isOnBackgroundThread())
	//*  44   93:invokestatic    #163 <Method boolean Util.isOnBackgroundThread()>
	//*  45   96:ifeq            114
			mainHandler.post(addSelfToLifecycle);
	//   46   99:aload_0         
	//   47  100:getfield        #130 <Field Handler mainHandler>
	//   48  103:aload_0         
	//   49  104:getfield        #117 <Field Runnable addSelfToLifecycle>
	//   50  107:invokevirtual   #167 <Method boolean Handler.post(Runnable)>
	//   51  110:pop             
		else
	//*  52  111:goto            121
			lifecycle1.addListener(((LifecycleListener) (this)));
	//   53  114:aload_2         
	//   54  115:aload_0         
	//   55  116:invokeinterface #173 <Method void Lifecycle.addListener(LifecycleListener)>
		lifecycle1.addListener(((LifecycleListener) (connectivityMonitor)));
	//   56  121:aload_2         
	//   57  122:aload_0         
	//   58  123:getfield        #157 <Field ConnectivityMonitor connectivityMonitor>
	//   59  126:invokeinterface #173 <Method void Lifecycle.addListener(LifecycleListener)>
		setRequestOptions(glide1.getGlideContext().getDefaultRequestOptions());
	//   60  131:aload_0         
	//   61  132:aload_1         
	//   62  133:invokevirtual   #177 <Method GlideContext Glide.getGlideContext()>
	//   63  136:invokevirtual   #182 <Method RequestOptions GlideContext.getDefaultRequestOptions()>
	//   64  139:invokevirtual   #186 <Method void setRequestOptions(RequestOptions)>
		glide1.registerRequestManager(this);
	//   65  142:aload_1         
	//   66  143:aload_0         
	//   67  144:invokevirtual   #189 <Method void Glide.registerRequestManager(RequestManager)>
	//   68  147:return          
	}

	private void untrackOrDelegate(Target target)
	{
		if(!untrack(target) && !glide.removeFromManagers(target) && target.getRequest() != null)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #195 <Method boolean untrack(Target)>
	//*   3    5:ifne            48
	//*   4    8:aload_0         
	//*   5    9:getfield        #132 <Field Glide glide>
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #198 <Method boolean Glide.removeFromManagers(Target)>
	//*   8   16:ifne            48
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #204 <Method Request Target.getRequest()>
	//*  11   25:ifnull          48
		{
			Request request = target.getRequest();
	//   12   28:aload_1         
	//   13   29:invokeinterface #204 <Method Request Target.getRequest()>
	//   14   34:astore_2        
			target.setRequest(((Request) (null)));
	//   15   35:aload_1         
	//   16   36:aconst_null     
	//   17   37:invokeinterface #208 <Method void Target.setRequest(Request)>
			request.clear();
	//   18   42:aload_2         
	//   19   43:invokeinterface #213 <Method void Request.clear()>
		}
	//   20   48:return          
	}

	private void updateRequestOptions(RequestOptions requestoptions)
	{
		requestOptions = requestOptions.apply(requestoptions);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #218 <Field RequestOptions requestOptions>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #222 <Method RequestOptions RequestOptions.apply(RequestOptions)>
	//    5    9:putfield        #218 <Field RequestOptions requestOptions>
	//    6   12:return          
	}

	public RequestManager applyDefaultRequestOptions(RequestOptions requestoptions)
	{
		updateRequestOptions(requestoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #226 <Method void updateRequestOptions(RequestOptions)>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RequestBuilder as(Class class1)
	{
		return new RequestBuilder(glide, this, class1, context);
	//    0    0:new             #232 <Class RequestBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #132 <Field Glide glide>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #140 <Field Context context>
	//    8   14:invokespecial   #235 <Method void RequestBuilder(Glide, RequestManager, Class, Context)>
	//    9   17:areturn         
	}

	public RequestBuilder asBitmap()
	{
		return as(android/graphics/Bitmap).apply(DECODE_TYPE_BITMAP);
	//    0    0:aload_0         
	//    1    1:ldc1            #46  <Class Bitmap>
	//    2    3:invokevirtual   #240 <Method RequestBuilder as(Class)>
	//    3    6:getstatic       #58  <Field RequestOptions DECODE_TYPE_BITMAP>
	//    4    9:invokevirtual   #243 <Method RequestBuilder RequestBuilder.apply(RequestOptions)>
	//    5   12:areturn         
	}

	public RequestBuilder asDrawable()
	{
		return as(android/graphics/drawable/Drawable);
	//    0    0:aload_0         
	//    1    1:ldc1            #247 <Class Drawable>
	//    2    3:invokevirtual   #240 <Method RequestBuilder as(Class)>
	//    3    6:areturn         
	}

	public RequestBuilder asFile()
	{
		return as(java/io/File).apply(RequestOptions.skipMemoryCacheOf(true));
	//    0    0:aload_0         
	//    1    1:ldc1            #251 <Class File>
	//    2    3:invokevirtual   #240 <Method RequestBuilder as(Class)>
	//    3    6:iconst_1        
	//    4    7:invokestatic    #254 <Method RequestOptions RequestOptions.skipMemoryCacheOf(boolean)>
	//    5   10:invokevirtual   #243 <Method RequestBuilder RequestBuilder.apply(RequestOptions)>
	//    6   13:areturn         
	}

	public RequestBuilder asGif()
	{
		return as(com/bumptech/glide/load/resource/gif/GifDrawable).apply(DECODE_TYPE_GIF);
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <Class GifDrawable>
	//    2    3:invokevirtual   #240 <Method RequestBuilder as(Class)>
	//    3    6:getstatic       #62  <Field RequestOptions DECODE_TYPE_GIF>
	//    4    9:invokevirtual   #243 <Method RequestBuilder RequestBuilder.apply(RequestOptions)>
	//    5   12:areturn         
	}

	public void clear(View view)
	{
		clear(((Target) (new ClearTarget(view))));
	//    0    0:aload_0         
	//    1    1:new             #15  <Class RequestManager$ClearTarget>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #260 <Method void RequestManager$ClearTarget(View)>
	//    5    9:invokevirtual   #262 <Method void clear(Target)>
	//    6   12:return          
	}

	public void clear(final Target target)
	{
		if(target == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(Util.isOnMainThread())
	//*   3    5:invokestatic    #266 <Method boolean Util.isOnMainThread()>
	//*   4    8:ifeq            17
		{
			untrackOrDelegate(target);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #268 <Method void untrackOrDelegate(Target)>
			return;
	//    8   16:return          
		} else
		{
			mainHandler.post(new Runnable() {

				public void run()
				{
					clear(target);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field RequestManager this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field Target val$target>
				//    4    8:invokevirtual   #27  <Method void RequestManager.clear(Target)>
				//    5   11:return          
				}

				final RequestManager this$0;
				final Target val$target;

			
			{
				this$0 = RequestManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RequestManager this$0>
				target = target1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Target val$target>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    9   17:aload_0         
	//   10   18:getfield        #130 <Field Handler mainHandler>
	//   11   21:new             #13  <Class RequestManager$2>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #271 <Method void RequestManager$2(RequestManager, Target)>
	//   16   30:invokevirtual   #167 <Method boolean Handler.post(Runnable)>
	//   17   33:pop             
			return;
	//   18   34:return          
		}
	}

	public RequestBuilder download(Object obj)
	{
		return downloadOnly().load(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #276 <Method RequestBuilder downloadOnly()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #279 <Method RequestBuilder RequestBuilder.load(Object)>
	//    4    8:areturn         
	}

	public RequestBuilder downloadOnly()
	{
		return as(java/io/File).apply(DOWNLOAD_ONLY_OPTIONS);
	//    0    0:aload_0         
	//    1    1:ldc1            #251 <Class File>
	//    2    3:invokevirtual   #240 <Method RequestBuilder as(Class)>
	//    3    6:getstatic       #88  <Field RequestOptions DOWNLOAD_ONLY_OPTIONS>
	//    4    9:invokevirtual   #243 <Method RequestBuilder RequestBuilder.apply(RequestOptions)>
	//    5   12:areturn         
	}

	RequestOptions getDefaultRequestOptions()
	{
		return requestOptions;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field RequestOptions requestOptions>
	//    2    4:areturn         
	}

	TransitionOptions getDefaultTransitionOptions(Class class1)
	{
		return glide.getGlideContext().getDefaultTransitionOptions(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field Glide glide>
	//    2    4:invokevirtual   #177 <Method GlideContext Glide.getGlideContext()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #284 <Method TransitionOptions GlideContext.getDefaultTransitionOptions(Class)>
	//    5   11:areturn         
	}

	public boolean isPaused()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #289 <Method void Util.assertMainThread()>
		return requestTracker.isPaused();
	//    1    3:aload_0         
	//    2    4:getfield        #138 <Field RequestTracker requestTracker>
	//    3    7:invokevirtual   #291 <Method boolean RequestTracker.isPaused()>
	//    4   10:ireturn         
	}

	public RequestBuilder load(Bitmap bitmap)
	{
		return asDrawable().load(bitmap);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #296 <Method RequestBuilder RequestBuilder.load(Bitmap)>
	//    4    8:areturn         
	}

	public RequestBuilder load(Drawable drawable)
	{
		return asDrawable().load(drawable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #300 <Method RequestBuilder RequestBuilder.load(Drawable)>
	//    4    8:areturn         
	}

	public RequestBuilder load(Uri uri)
	{
		return asDrawable().load(uri);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #304 <Method RequestBuilder RequestBuilder.load(Uri)>
	//    4    8:areturn         
	}

	public RequestBuilder load(File file)
	{
		return asDrawable().load(file);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #308 <Method RequestBuilder RequestBuilder.load(File)>
	//    4    8:areturn         
	}

	public RequestBuilder load(Integer integer)
	{
		return asDrawable().load(integer);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #314 <Method RequestBuilder RequestBuilder.load(Integer)>
	//    4    8:areturn         
	}

	public RequestBuilder load(Object obj)
	{
		return asDrawable().load(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #279 <Method RequestBuilder RequestBuilder.load(Object)>
	//    4    8:areturn         
	}

	public RequestBuilder load(String s)
	{
		return asDrawable().load(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #319 <Method RequestBuilder RequestBuilder.load(String)>
	//    4    8:areturn         
	}

	public RequestBuilder load(URL url)
	{
		return asDrawable().load(url);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #324 <Method RequestBuilder RequestBuilder.load(URL)>
	//    4    8:areturn         
	}

	public RequestBuilder load(byte abyte0[])
	{
		return asDrawable().load(abyte0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #329 <Method RequestBuilder RequestBuilder.load(byte[])>
	//    4    8:areturn         
	}

	public volatile Object load(Bitmap bitmap)
	{
		return ((Object) (load(bitmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #332 <Method RequestBuilder load(Bitmap)>
	//    3    5:areturn         
	}

	public volatile Object load(Drawable drawable)
	{
		return ((Object) (load(drawable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #334 <Method RequestBuilder load(Drawable)>
	//    3    5:areturn         
	}

	public volatile Object load(Uri uri)
	{
		return ((Object) (load(uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #336 <Method RequestBuilder load(Uri)>
	//    3    5:areturn         
	}

	public volatile Object load(File file)
	{
		return ((Object) (load(file)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #338 <Method RequestBuilder load(File)>
	//    3    5:areturn         
	}

	public volatile Object load(Integer integer)
	{
		return ((Object) (load(integer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #340 <Method RequestBuilder load(Integer)>
	//    3    5:areturn         
	}

	public volatile Object load(Object obj)
	{
		return ((Object) (load(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #342 <Method RequestBuilder load(Object)>
	//    3    5:areturn         
	}

	public volatile Object load(String s)
	{
		return ((Object) (load(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #344 <Method RequestBuilder load(String)>
	//    3    5:areturn         
	}

	public volatile Object load(URL url)
	{
		return ((Object) (load(url)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #346 <Method RequestBuilder load(URL)>
	//    3    5:areturn         
	}

	public volatile Object load(byte abyte0[])
	{
		return ((Object) (load(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #348 <Method RequestBuilder load(byte[])>
	//    3    5:areturn         
	}

	public void onDestroy()
	{
		targetTracker.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field TargetTracker targetTracker>
	//    2    4:invokevirtual   #351 <Method void TargetTracker.onDestroy()>
		for(Iterator iterator = targetTracker.getAll().iterator(); iterator.hasNext(); clear((Target)iterator.next()));
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field TargetTracker targetTracker>
	//    5   11:invokevirtual   #355 <Method List TargetTracker.getAll()>
	//    6   14:invokeinterface #361 <Method Iterator List.iterator()>
	//    7   19:astore_1        
	//    8   20:aload_1         
	//    9   21:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            45
	//   11   29:aload_0         
	//   12   30:aload_1         
	//   13   31:invokeinterface #370 <Method Object Iterator.next()>
	//   14   36:checkcast       #200 <Class Target>
	//   15   39:invokevirtual   #262 <Method void clear(Target)>
	//*  16   42:goto            20
		targetTracker.clear();
	//   17   45:aload_0         
	//   18   46:getfield        #112 <Field TargetTracker targetTracker>
	//   19   49:invokevirtual   #371 <Method void TargetTracker.clear()>
		requestTracker.clearRequests();
	//   20   52:aload_0         
	//   21   53:getfield        #138 <Field RequestTracker requestTracker>
	//   22   56:invokevirtual   #374 <Method void RequestTracker.clearRequests()>
		lifecycle.removeListener(((LifecycleListener) (this)));
	//   23   59:aload_0         
	//   24   60:getfield        #134 <Field Lifecycle lifecycle>
	//   25   63:aload_0         
	//   26   64:invokeinterface #377 <Method void Lifecycle.removeListener(LifecycleListener)>
		lifecycle.removeListener(((LifecycleListener) (connectivityMonitor)));
	//   27   69:aload_0         
	//   28   70:getfield        #134 <Field Lifecycle lifecycle>
	//   29   73:aload_0         
	//   30   74:getfield        #157 <Field ConnectivityMonitor connectivityMonitor>
	//   31   77:invokeinterface #377 <Method void Lifecycle.removeListener(LifecycleListener)>
		mainHandler.removeCallbacks(addSelfToLifecycle);
	//   32   82:aload_0         
	//   33   83:getfield        #130 <Field Handler mainHandler>
	//   34   86:aload_0         
	//   35   87:getfield        #117 <Field Runnable addSelfToLifecycle>
	//   36   90:invokevirtual   #381 <Method void Handler.removeCallbacks(Runnable)>
		glide.unregisterRequestManager(this);
	//   37   93:aload_0         
	//   38   94:getfield        #132 <Field Glide glide>
	//   39   97:aload_0         
	//   40   98:invokevirtual   #384 <Method void Glide.unregisterRequestManager(RequestManager)>
	//   41  101:return          
	}

	public void onStart()
	{
		resumeRequests();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #388 <Method void resumeRequests()>
		targetTracker.onStart();
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field TargetTracker targetTracker>
	//    4    8:invokevirtual   #390 <Method void TargetTracker.onStart()>
	//    5   11:return          
	}

	public void onStop()
	{
		pauseRequests();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #394 <Method void pauseRequests()>
		targetTracker.onStop();
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field TargetTracker targetTracker>
	//    4    8:invokevirtual   #396 <Method void TargetTracker.onStop()>
	//    5   11:return          
	}

	public void pauseAllRequests()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #289 <Method void Util.assertMainThread()>
		requestTracker.pauseAllRequests();
	//    1    3:aload_0         
	//    2    4:getfield        #138 <Field RequestTracker requestTracker>
	//    3    7:invokevirtual   #399 <Method void RequestTracker.pauseAllRequests()>
	//    4   10:return          
	}

	public void pauseRequests()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #289 <Method void Util.assertMainThread()>
		requestTracker.pauseRequests();
	//    1    3:aload_0         
	//    2    4:getfield        #138 <Field RequestTracker requestTracker>
	//    3    7:invokevirtual   #400 <Method void RequestTracker.pauseRequests()>
	//    4   10:return          
	}

	public void pauseRequestsRecursive()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #289 <Method void Util.assertMainThread()>
		pauseRequests();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #394 <Method void pauseRequests()>
		for(Iterator iterator = treeNode.getDescendants().iterator(); iterator.hasNext(); ((RequestManager)iterator.next()).pauseRequests());
	//    3    7:aload_0         
	//    4    8:getfield        #136 <Field RequestManagerTreeNode treeNode>
	//    5   11:invokeinterface #407 <Method Set RequestManagerTreeNode.getDescendants()>
	//    6   16:invokeinterface #410 <Method Iterator Set.iterator()>
	//    7   21:astore_1        
	//    8   22:aload_1         
	//    9   23:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//   10   28:ifeq            46
	//   11   31:aload_1         
	//   12   32:invokeinterface #370 <Method Object Iterator.next()>
	//   13   37:checkcast       #2   <Class RequestManager>
	//   14   40:invokevirtual   #394 <Method void pauseRequests()>
	//*  15   43:goto            22
	//   16   46:return          
	}

	public void resumeRequests()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #289 <Method void Util.assertMainThread()>
		requestTracker.resumeRequests();
	//    1    3:aload_0         
	//    2    4:getfield        #138 <Field RequestTracker requestTracker>
	//    3    7:invokevirtual   #411 <Method void RequestTracker.resumeRequests()>
	//    4   10:return          
	}

	public void resumeRequestsRecursive()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #289 <Method void Util.assertMainThread()>
		resumeRequests();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #388 <Method void resumeRequests()>
		for(Iterator iterator = treeNode.getDescendants().iterator(); iterator.hasNext(); ((RequestManager)iterator.next()).resumeRequests());
	//    3    7:aload_0         
	//    4    8:getfield        #136 <Field RequestManagerTreeNode treeNode>
	//    5   11:invokeinterface #407 <Method Set RequestManagerTreeNode.getDescendants()>
	//    6   16:invokeinterface #410 <Method Iterator Set.iterator()>
	//    7   21:astore_1        
	//    8   22:aload_1         
	//    9   23:invokeinterface #366 <Method boolean Iterator.hasNext()>
	//   10   28:ifeq            46
	//   11   31:aload_1         
	//   12   32:invokeinterface #370 <Method Object Iterator.next()>
	//   13   37:checkcast       #2   <Class RequestManager>
	//   14   40:invokevirtual   #388 <Method void resumeRequests()>
	//*  15   43:goto            22
	//   16   46:return          
	}

	public RequestManager setDefaultRequestOptions(RequestOptions requestoptions)
	{
		setRequestOptions(requestoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #186 <Method void setRequestOptions(RequestOptions)>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected void setRequestOptions(RequestOptions requestoptions)
	{
		requestOptions = requestoptions.clone().autoClone();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #416 <Method RequestOptions RequestOptions.clone()>
	//    3    5:invokevirtual   #419 <Method RequestOptions RequestOptions.autoClone()>
	//    4    8:putfield        #218 <Field RequestOptions requestOptions>
	//    5   11:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #423 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #424 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(super.toString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokespecial   #426 <Method String Object.toString()>
	//    7   13:invokevirtual   #430 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("{tracker=");
	//    9   17:aload_1         
	//   10   18:ldc2            #432 <String "{tracker=">
	//   11   21:invokevirtual   #430 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(((Object) (requestTracker)));
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #138 <Field RequestTracker requestTracker>
	//   16   30:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   17   33:pop             
		stringbuilder.append(", treeNode=");
	//   18   34:aload_1         
	//   19   35:ldc2            #437 <String ", treeNode=">
	//   20   38:invokevirtual   #430 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append(((Object) (treeNode)));
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:getfield        #136 <Field RequestManagerTreeNode treeNode>
	//   25   47:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   26   50:pop             
		stringbuilder.append("}");
	//   27   51:aload_1         
	//   28   52:ldc2            #439 <String "}">
	//   29   55:invokevirtual   #430 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
		return stringbuilder.toString();
	//   31   59:aload_1         
	//   32   60:invokevirtual   #440 <Method String StringBuilder.toString()>
	//   33   63:areturn         
	}

	void track(Target target, Request request)
	{
		targetTracker.track(target);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field TargetTracker targetTracker>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #444 <Method void TargetTracker.track(Target)>
		requestTracker.runRequest(request);
	//    4    8:aload_0         
	//    5    9:getfield        #138 <Field RequestTracker requestTracker>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #447 <Method void RequestTracker.runRequest(Request)>
	//    8   16:return          
	}

	boolean untrack(Target target)
	{
		Request request = target.getRequest();
	//    0    0:aload_1         
	//    1    1:invokeinterface #204 <Method Request Target.getRequest()>
	//    2    6:astore_2        
		if(request == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		if(requestTracker.clearRemoveAndRecycle(request))
	//*   7   13:aload_0         
	//*   8   14:getfield        #138 <Field RequestTracker requestTracker>
	//*   9   17:aload_2         
	//*  10   18:invokevirtual   #452 <Method boolean RequestTracker.clearRemoveAndRecycle(Request)>
	//*  11   21:ifeq            41
		{
			targetTracker.untrack(target);
	//   12   24:aload_0         
	//   13   25:getfield        #112 <Field TargetTracker targetTracker>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #454 <Method void TargetTracker.untrack(Target)>
			target.setRequest(((Request) (null)));
	//   16   32:aload_1         
	//   17   33:aconst_null     
	//   18   34:invokeinterface #208 <Method void Target.setRequest(Request)>
			return true;
	//   19   39:iconst_1        
	//   20   40:ireturn         
		} else
		{
			return false;
	//   21   41:iconst_0        
	//   22   42:ireturn         
		}
	}

	private static final RequestOptions DECODE_TYPE_BITMAP = RequestOptions.decodeTypeOf(android/graphics/Bitmap).lock();
	private static final RequestOptions DECODE_TYPE_GIF = RequestOptions.decodeTypeOf(com/bumptech/glide/load/resource/gif/GifDrawable).lock();
	private static final RequestOptions DOWNLOAD_ONLY_OPTIONS;
	private final Runnable addSelfToLifecycle;
	private final ConnectivityMonitor connectivityMonitor;
	protected final Context context;
	protected final Glide glide;
	final Lifecycle lifecycle;
	private final Handler mainHandler;
	private RequestOptions requestOptions;
	private final RequestTracker requestTracker;
	private final TargetTracker targetTracker;
	private final RequestManagerTreeNode treeNode;

	static 
	{
	//    0    0:ldc1            #46  <Class Bitmap>
	//    1    2:invokestatic    #52  <Method RequestOptions RequestOptions.decodeTypeOf(Class)>
	//    2    5:invokevirtual   #56  <Method RequestOptions RequestOptions.lock()>
	//    3    8:putstatic       #58  <Field RequestOptions DECODE_TYPE_BITMAP>
	//    4   11:ldc1            #60  <Class GifDrawable>
	//    5   13:invokestatic    #52  <Method RequestOptions RequestOptions.decodeTypeOf(Class)>
	//    6   16:invokevirtual   #56  <Method RequestOptions RequestOptions.lock()>
	//    7   19:putstatic       #62  <Field RequestOptions DECODE_TYPE_GIF>
		DOWNLOAD_ONLY_OPTIONS = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
	//    8   22:getstatic       #68  <Field DiskCacheStrategy DiskCacheStrategy.DATA>
	//    9   25:invokestatic    #72  <Method RequestOptions RequestOptions.diskCacheStrategyOf(DiskCacheStrategy)>
	//   10   28:getstatic       #78  <Field Priority Priority.LOW>
	//   11   31:invokevirtual   #82  <Method RequestOptions RequestOptions.priority(Priority)>
	//   12   34:iconst_1        
	//   13   35:invokevirtual   #86  <Method RequestOptions RequestOptions.skipMemoryCache(boolean)>
	//   14   38:putstatic       #88  <Field RequestOptions DOWNLOAD_ONLY_OPTIONS>
	//*  15   41:return          
	}
}
