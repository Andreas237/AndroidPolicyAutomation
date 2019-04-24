// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
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
import java.util.*;

// Referenced classes of package com.bumptech.glide:
//			Priority, Glide, GlideContext, RequestBuilder, 
//			TransitionOptions

public class RequestManager
	implements LifecycleListener
{
	static class ClearTarget extends ViewTarget
	{

		public void onResourceReady(Object obj, Transition transition)
		{
		//    0    0:return          
		}

		public ClearTarget(View view)
		{
			super(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void ViewTarget(View)>
		//    3    5:return          
		}
	}

	static class RequestManagerConnectivityListener
		implements com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
	{

		public void onConnectivityChanged(boolean flag)
		{
			if(flag)
		//*   0    0:iload_1         
		//*   1    1:ifeq            11
				requestTracker.restartRequests();
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field RequestTracker requestTracker>
		//    4    8:invokevirtual   #26  <Method void RequestTracker.restartRequests()>
		//    5   11:return          
		}

		private final RequestTracker requestTracker;

		public RequestManagerConnectivityListener(RequestTracker requesttracker)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			requestTracker = requesttracker;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field RequestTracker requestTracker>
		//    5    9:return          
		}
	}


	public RequestManager(Glide glide1, Lifecycle lifecycle1, RequestManagerTreeNode requestmanagertreenode)
	{
		this(glide1, lifecycle1, requestmanagertreenode, new RequestTracker(), glide1.getConnectivityMonitorFactory());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #89  <Class RequestTracker>
	//    5    7:dup             
	//    6    8:invokespecial   #91  <Method void RequestTracker()>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #97  <Method ConnectivityMonitorFactory Glide.getConnectivityMonitorFactory()>
	//    9   15:invokespecial   #100 <Method void RequestManager(Glide, Lifecycle, RequestManagerTreeNode, RequestTracker, ConnectivityMonitorFactory)>
	//   10   18:return          
	}

	RequestManager(Glide glide1, Lifecycle lifecycle1, RequestManagerTreeNode requestmanagertreenode, RequestTracker requesttracker, ConnectivityMonitorFactory connectivitymonitorfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void Object()>
		targetTracker = new TargetTracker();
	//    2    4:aload_0         
	//    3    5:new             #103 <Class TargetTracker>
	//    4    8:dup             
	//    5    9:invokespecial   #104 <Method void TargetTracker()>
	//    6   12:putfield        #106 <Field TargetTracker targetTracker>
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
	//    8   16:new             #8   <Class RequestManager$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #109 <Method void RequestManager$1(RequestManager)>
	//   12   24:putfield        #111 <Field Runnable addSelfToLifecycle>
		mainHandler = new Handler(Looper.getMainLooper());
	//   13   27:aload_0         
	//   14   28:new             #113 <Class Handler>
	//   15   31:dup             
	//   16   32:invokestatic    #119 <Method Looper Looper.getMainLooper()>
	//   17   35:invokespecial   #122 <Method void Handler(Looper)>
	//   18   38:putfield        #124 <Field Handler mainHandler>
		glide = glide1;
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:putfield        #126 <Field Glide glide>
		lifecycle = lifecycle1;
	//   22   46:aload_0         
	//   23   47:aload_2         
	//   24   48:putfield        #128 <Field Lifecycle lifecycle>
		treeNode = requestmanagertreenode;
	//   25   51:aload_0         
	//   26   52:aload_3         
	//   27   53:putfield        #130 <Field RequestManagerTreeNode treeNode>
		requestTracker = requesttracker;
	//   28   56:aload_0         
	//   29   57:aload           4
	//   30   59:putfield        #132 <Field RequestTracker requestTracker>
		connectivityMonitor = connectivitymonitorfactory.build(glide1.getGlideContext().getBaseContext(), ((com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener) (new RequestManagerConnectivityListener(requesttracker))));
	//   31   62:aload_0         
	//   32   63:aload           5
	//   33   65:aload_1         
	//   34   66:invokevirtual   #136 <Method GlideContext Glide.getGlideContext()>
	//   35   69:invokevirtual   #142 <Method android.content.Context GlideContext.getBaseContext()>
	//   36   72:new             #15  <Class RequestManager$RequestManagerConnectivityListener>
	//   37   75:dup             
	//   38   76:aload           4
	//   39   78:invokespecial   #145 <Method void RequestManager$RequestManagerConnectivityListener(RequestTracker)>
	//   40   81:invokeinterface #151 <Method ConnectivityMonitor ConnectivityMonitorFactory.build(android.content.Context, com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener)>
	//   41   86:putfield        #153 <Field ConnectivityMonitor connectivityMonitor>
		if(Util.isOnBackgroundThread())
	//*  42   89:invokestatic    #159 <Method boolean Util.isOnBackgroundThread()>
	//*  43   92:ifeq            110
			mainHandler.post(addSelfToLifecycle);
	//   44   95:aload_0         
	//   45   96:getfield        #124 <Field Handler mainHandler>
	//   46   99:aload_0         
	//   47  100:getfield        #111 <Field Runnable addSelfToLifecycle>
	//   48  103:invokevirtual   #163 <Method boolean Handler.post(Runnable)>
	//   49  106:pop             
		else
	//*  50  107:goto            117
			lifecycle1.addListener(((LifecycleListener) (this)));
	//   51  110:aload_2         
	//   52  111:aload_0         
	//   53  112:invokeinterface #169 <Method void Lifecycle.addListener(LifecycleListener)>
		lifecycle1.addListener(((LifecycleListener) (connectivityMonitor)));
	//   54  117:aload_2         
	//   55  118:aload_0         
	//   56  119:getfield        #153 <Field ConnectivityMonitor connectivityMonitor>
	//   57  122:invokeinterface #169 <Method void Lifecycle.addListener(LifecycleListener)>
		setRequestOptions(glide1.getGlideContext().getDefaultRequestOptions());
	//   58  127:aload_0         
	//   59  128:aload_1         
	//   60  129:invokevirtual   #136 <Method GlideContext Glide.getGlideContext()>
	//   61  132:invokevirtual   #172 <Method RequestOptions GlideContext.getDefaultRequestOptions()>
	//   62  135:invokevirtual   #176 <Method void setRequestOptions(RequestOptions)>
		glide1.registerRequestManager(this);
	//   63  138:aload_1         
	//   64  139:aload_0         
	//   65  140:invokevirtual   #179 <Method void Glide.registerRequestManager(RequestManager)>
	//   66  143:return          
	}

	private void untrackOrDelegate(Target target)
	{
		if(!untrack(target))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #185 <Method boolean untrack(Target)>
	//*   3    5:ifne            16
			glide.removeFromManagers(target);
	//    4    8:aload_0         
	//    5    9:getfield        #126 <Field Glide glide>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #188 <Method void Glide.removeFromManagers(Target)>
	//    8   16:return          
	}

	private void updateRequestOptions(RequestOptions requestoptions)
	{
		requestOptions = requestOptions.apply(requestoptions);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #193 <Field RequestOptions requestOptions>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #197 <Method RequestOptions RequestOptions.apply(RequestOptions)>
	//    5    9:putfield        #193 <Field RequestOptions requestOptions>
	//    6   12:return          
	}

	public RequestManager applyDefaultRequestOptions(RequestOptions requestoptions)
	{
		updateRequestOptions(requestoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #201 <Method void updateRequestOptions(RequestOptions)>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RequestBuilder as(Class class1)
	{
		return new RequestBuilder(glide, this, class1);
	//    0    0:new             #205 <Class RequestBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #126 <Field Glide glide>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #208 <Method void RequestBuilder(Glide, RequestManager, Class)>
	//    7   13:areturn         
	}

	public RequestBuilder asBitmap()
	{
		return as(android/graphics/Bitmap).apply(DECODE_TYPE_BITMAP);
	//    0    0:aload_0         
	//    1    1:ldc1            #42  <Class Bitmap>
	//    2    3:invokevirtual   #213 <Method RequestBuilder as(Class)>
	//    3    6:getstatic       #54  <Field RequestOptions DECODE_TYPE_BITMAP>
	//    4    9:invokevirtual   #216 <Method RequestBuilder RequestBuilder.apply(RequestOptions)>
	//    5   12:areturn         
	}

	public RequestBuilder asDrawable()
	{
		return as(android/graphics/drawable/Drawable);
	//    0    0:aload_0         
	//    1    1:ldc1            #220 <Class Drawable>
	//    2    3:invokevirtual   #213 <Method RequestBuilder as(Class)>
	//    3    6:areturn         
	}

	public RequestBuilder asFile()
	{
		return as(java/io/File).apply(RequestOptions.skipMemoryCacheOf(true));
	//    0    0:aload_0         
	//    1    1:ldc1            #224 <Class File>
	//    2    3:invokevirtual   #213 <Method RequestBuilder as(Class)>
	//    3    6:iconst_1        
	//    4    7:invokestatic    #227 <Method RequestOptions RequestOptions.skipMemoryCacheOf(boolean)>
	//    5   10:invokevirtual   #216 <Method RequestBuilder RequestBuilder.apply(RequestOptions)>
	//    6   13:areturn         
	}

	public RequestBuilder asGif()
	{
		return as(com/bumptech/glide/load/resource/gif/GifDrawable).apply(DECODE_TYPE_GIF);
	//    0    0:aload_0         
	//    1    1:ldc1            #56  <Class GifDrawable>
	//    2    3:invokevirtual   #213 <Method RequestBuilder as(Class)>
	//    3    6:getstatic       #58  <Field RequestOptions DECODE_TYPE_GIF>
	//    4    9:invokevirtual   #216 <Method RequestBuilder RequestBuilder.apply(RequestOptions)>
	//    5   12:areturn         
	}

	public void clear(View view)
	{
		clear(((Target) (new ClearTarget(view))));
	//    0    0:aload_0         
	//    1    1:new             #12  <Class RequestManager$ClearTarget>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #234 <Method void RequestManager$ClearTarget(View)>
	//    5    9:invokevirtual   #236 <Method void clear(Target)>
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
	//*   3    5:invokestatic    #240 <Method boolean Util.isOnMainThread()>
	//*   4    8:ifeq            17
		{
			untrackOrDelegate(target);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #242 <Method void untrackOrDelegate(Target)>
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
	//   10   18:getfield        #124 <Field Handler mainHandler>
	//   11   21:new             #10  <Class RequestManager$2>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #245 <Method void RequestManager$2(RequestManager, Target)>
	//   16   30:invokevirtual   #163 <Method boolean Handler.post(Runnable)>
	//   17   33:pop             
			return;
	//   18   34:return          
		}
	}

	public RequestBuilder download(Object obj)
	{
		return downloadOnly().load(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #251 <Method RequestBuilder downloadOnly()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #254 <Method RequestBuilder RequestBuilder.load(Object)>
	//    4    8:areturn         
	}

	public RequestBuilder downloadOnly()
	{
		return as(java/io/File).apply(DOWNLOAD_ONLY_OPTIONS);
	//    0    0:aload_0         
	//    1    1:ldc1            #224 <Class File>
	//    2    3:invokevirtual   #213 <Method RequestBuilder as(Class)>
	//    3    6:getstatic       #84  <Field RequestOptions DOWNLOAD_ONLY_OPTIONS>
	//    4    9:invokevirtual   #216 <Method RequestBuilder RequestBuilder.apply(RequestOptions)>
	//    5   12:areturn         
	}

	RequestOptions getDefaultRequestOptions()
	{
		return requestOptions;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field RequestOptions requestOptions>
	//    2    4:areturn         
	}

	TransitionOptions getDefaultTransitionOptions(Class class1)
	{
		return glide.getGlideContext().getDefaultTransitionOptions(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Glide glide>
	//    2    4:invokevirtual   #136 <Method GlideContext Glide.getGlideContext()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #259 <Method TransitionOptions GlideContext.getDefaultTransitionOptions(Class)>
	//    5   11:areturn         
	}

	public boolean isPaused()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #265 <Method void Util.assertMainThread()>
		return requestTracker.isPaused();
	//    1    3:aload_0         
	//    2    4:getfield        #132 <Field RequestTracker requestTracker>
	//    3    7:invokevirtual   #267 <Method boolean RequestTracker.isPaused()>
	//    4   10:ireturn         
	}

	public RequestBuilder load(Object obj)
	{
		return asDrawable().load(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method RequestBuilder asDrawable()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #254 <Method RequestBuilder RequestBuilder.load(Object)>
	//    4    8:areturn         
	}

	public void onDestroy()
	{
		targetTracker.onDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field TargetTracker targetTracker>
	//    2    4:invokevirtual   #273 <Method void TargetTracker.onDestroy()>
		for(Iterator iterator = targetTracker.getAll().iterator(); iterator.hasNext(); clear((Target)iterator.next()));
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field TargetTracker targetTracker>
	//    5   11:invokevirtual   #277 <Method List TargetTracker.getAll()>
	//    6   14:invokeinterface #283 <Method Iterator List.iterator()>
	//    7   19:astore_1        
	//    8   20:aload_1         
	//    9   21:invokeinterface #288 <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            45
	//   11   29:aload_0         
	//   12   30:aload_1         
	//   13   31:invokeinterface #292 <Method Object Iterator.next()>
	//   14   36:checkcast       #294 <Class Target>
	//   15   39:invokevirtual   #236 <Method void clear(Target)>
	//*  16   42:goto            20
		targetTracker.clear();
	//   17   45:aload_0         
	//   18   46:getfield        #106 <Field TargetTracker targetTracker>
	//   19   49:invokevirtual   #296 <Method void TargetTracker.clear()>
		requestTracker.clearRequests();
	//   20   52:aload_0         
	//   21   53:getfield        #132 <Field RequestTracker requestTracker>
	//   22   56:invokevirtual   #299 <Method void RequestTracker.clearRequests()>
		lifecycle.removeListener(((LifecycleListener) (this)));
	//   23   59:aload_0         
	//   24   60:getfield        #128 <Field Lifecycle lifecycle>
	//   25   63:aload_0         
	//   26   64:invokeinterface #302 <Method void Lifecycle.removeListener(LifecycleListener)>
		lifecycle.removeListener(((LifecycleListener) (connectivityMonitor)));
	//   27   69:aload_0         
	//   28   70:getfield        #128 <Field Lifecycle lifecycle>
	//   29   73:aload_0         
	//   30   74:getfield        #153 <Field ConnectivityMonitor connectivityMonitor>
	//   31   77:invokeinterface #302 <Method void Lifecycle.removeListener(LifecycleListener)>
		mainHandler.removeCallbacks(addSelfToLifecycle);
	//   32   82:aload_0         
	//   33   83:getfield        #124 <Field Handler mainHandler>
	//   34   86:aload_0         
	//   35   87:getfield        #111 <Field Runnable addSelfToLifecycle>
	//   36   90:invokevirtual   #306 <Method void Handler.removeCallbacks(Runnable)>
		glide.unregisterRequestManager(this);
	//   37   93:aload_0         
	//   38   94:getfield        #126 <Field Glide glide>
	//   39   97:aload_0         
	//   40   98:invokevirtual   #309 <Method void Glide.unregisterRequestManager(RequestManager)>
	//   41  101:return          
	}

	public void onLowMemory()
	{
		glide.onLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Glide glide>
	//    2    4:invokevirtual   #313 <Method void Glide.onLowMemory()>
	//    3    7:return          
	}

	public void onStart()
	{
		resumeRequests();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #318 <Method void resumeRequests()>
		targetTracker.onStart();
	//    2    4:aload_0         
	//    3    5:getfield        #106 <Field TargetTracker targetTracker>
	//    4    8:invokevirtual   #320 <Method void TargetTracker.onStart()>
	//    5   11:return          
	}

	public void onStop()
	{
		pauseRequests();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #324 <Method void pauseRequests()>
		targetTracker.onStop();
	//    2    4:aload_0         
	//    3    5:getfield        #106 <Field TargetTracker targetTracker>
	//    4    8:invokevirtual   #326 <Method void TargetTracker.onStop()>
	//    5   11:return          
	}

	public void onTrimMemory(int i)
	{
		glide.onTrimMemory(i);
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Glide glide>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #330 <Method void Glide.onTrimMemory(int)>
	//    4    8:return          
	}

	public void pauseRequests()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #265 <Method void Util.assertMainThread()>
		requestTracker.pauseRequests();
	//    1    3:aload_0         
	//    2    4:getfield        #132 <Field RequestTracker requestTracker>
	//    3    7:invokevirtual   #331 <Method void RequestTracker.pauseRequests()>
	//    4   10:return          
	}

	public void pauseRequestsRecursive()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #265 <Method void Util.assertMainThread()>
		pauseRequests();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #324 <Method void pauseRequests()>
		for(Iterator iterator = treeNode.getDescendants().iterator(); iterator.hasNext(); ((RequestManager)iterator.next()).pauseRequests());
	//    3    7:aload_0         
	//    4    8:getfield        #130 <Field RequestManagerTreeNode treeNode>
	//    5   11:invokeinterface #338 <Method Set RequestManagerTreeNode.getDescendants()>
	//    6   16:invokeinterface #341 <Method Iterator Set.iterator()>
	//    7   21:astore_1        
	//    8   22:aload_1         
	//    9   23:invokeinterface #288 <Method boolean Iterator.hasNext()>
	//   10   28:ifeq            46
	//   11   31:aload_1         
	//   12   32:invokeinterface #292 <Method Object Iterator.next()>
	//   13   37:checkcast       #2   <Class RequestManager>
	//   14   40:invokevirtual   #324 <Method void pauseRequests()>
	//*  15   43:goto            22
	//   16   46:return          
	}

	public void resumeRequests()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #265 <Method void Util.assertMainThread()>
		requestTracker.resumeRequests();
	//    1    3:aload_0         
	//    2    4:getfield        #132 <Field RequestTracker requestTracker>
	//    3    7:invokevirtual   #342 <Method void RequestTracker.resumeRequests()>
	//    4   10:return          
	}

	public void resumeRequestsRecursive()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #265 <Method void Util.assertMainThread()>
		resumeRequests();
	//    1    3:aload_0         
	//    2    4:invokevirtual   #318 <Method void resumeRequests()>
		for(Iterator iterator = treeNode.getDescendants().iterator(); iterator.hasNext(); ((RequestManager)iterator.next()).resumeRequests());
	//    3    7:aload_0         
	//    4    8:getfield        #130 <Field RequestManagerTreeNode treeNode>
	//    5   11:invokeinterface #338 <Method Set RequestManagerTreeNode.getDescendants()>
	//    6   16:invokeinterface #341 <Method Iterator Set.iterator()>
	//    7   21:astore_1        
	//    8   22:aload_1         
	//    9   23:invokeinterface #288 <Method boolean Iterator.hasNext()>
	//   10   28:ifeq            46
	//   11   31:aload_1         
	//   12   32:invokeinterface #292 <Method Object Iterator.next()>
	//   13   37:checkcast       #2   <Class RequestManager>
	//   14   40:invokevirtual   #318 <Method void resumeRequests()>
	//*  15   43:goto            22
	//   16   46:return          
	}

	public RequestManager setDefaultRequestOptions(RequestOptions requestoptions)
	{
		setRequestOptions(requestoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method void setRequestOptions(RequestOptions)>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected void setRequestOptions(RequestOptions requestoptions)
	{
		requestOptions = requestoptions.clone().autoClone();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #347 <Method RequestOptions RequestOptions.clone()>
	//    3    5:invokevirtual   #350 <Method RequestOptions RequestOptions.autoClone()>
	//    4    8:putfield        #193 <Field RequestOptions requestOptions>
	//    5   11:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(super.toString()).append("{tracker=").append(((Object) (requestTracker))).append(", treeNode=").append(((Object) (treeNode))).append("}").toString();
	//    0    0:new             #354 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #355 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokespecial   #357 <Method String Object.toString()>
	//    5   11:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc2            #363 <String "{tracker=">
	//    7   17:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:getfield        #132 <Field RequestTracker requestTracker>
	//   10   24:invokevirtual   #366 <Method StringBuilder StringBuilder.append(Object)>
	//   11   27:ldc2            #368 <String ", treeNode=">
	//   12   30:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//   13   33:aload_0         
	//   14   34:getfield        #130 <Field RequestManagerTreeNode treeNode>
	//   15   37:invokevirtual   #366 <Method StringBuilder StringBuilder.append(Object)>
	//   16   40:ldc2            #370 <String "}">
	//   17   43:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//   18   46:invokevirtual   #371 <Method String StringBuilder.toString()>
	//   19   49:areturn         
	}

	void track(Target target, Request request)
	{
		targetTracker.track(target);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field TargetTracker targetTracker>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #375 <Method void TargetTracker.track(Target)>
		requestTracker.runRequest(request);
	//    4    8:aload_0         
	//    5    9:getfield        #132 <Field RequestTracker requestTracker>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #379 <Method void RequestTracker.runRequest(Request)>
	//    8   16:return          
	}

	boolean untrack(Target target)
	{
		Request request = target.getRequest();
	//    0    0:aload_1         
	//    1    1:invokeinterface #384 <Method Request Target.getRequest()>
	//    2    6:astore_2        
		if(request == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		if(requestTracker.clearRemoveAndRecycle(request))
	//*   7   13:aload_0         
	//*   8   14:getfield        #132 <Field RequestTracker requestTracker>
	//*   9   17:aload_2         
	//*  10   18:invokevirtual   #388 <Method boolean RequestTracker.clearRemoveAndRecycle(Request)>
	//*  11   21:ifeq            41
		{
			targetTracker.untrack(target);
	//   12   24:aload_0         
	//   13   25:getfield        #106 <Field TargetTracker targetTracker>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #390 <Method void TargetTracker.untrack(Target)>
			target.setRequest(((Request) (null)));
	//   16   32:aload_1         
	//   17   33:aconst_null     
	//   18   34:invokeinterface #393 <Method void Target.setRequest(Request)>
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
	protected final Glide glide;
	final Lifecycle lifecycle;
	private final Handler mainHandler;
	private RequestOptions requestOptions;
	private final RequestTracker requestTracker;
	private final TargetTracker targetTracker;
	private final RequestManagerTreeNode treeNode;

	static 
	{
	//    0    0:ldc1            #42  <Class Bitmap>
	//    1    2:invokestatic    #48  <Method RequestOptions RequestOptions.decodeTypeOf(Class)>
	//    2    5:invokevirtual   #52  <Method RequestOptions RequestOptions.lock()>
	//    3    8:putstatic       #54  <Field RequestOptions DECODE_TYPE_BITMAP>
	//    4   11:ldc1            #56  <Class GifDrawable>
	//    5   13:invokestatic    #48  <Method RequestOptions RequestOptions.decodeTypeOf(Class)>
	//    6   16:invokevirtual   #52  <Method RequestOptions RequestOptions.lock()>
	//    7   19:putstatic       #58  <Field RequestOptions DECODE_TYPE_GIF>
		DOWNLOAD_ONLY_OPTIONS = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
	//    8   22:getstatic       #64  <Field DiskCacheStrategy DiskCacheStrategy.DATA>
	//    9   25:invokestatic    #68  <Method RequestOptions RequestOptions.diskCacheStrategyOf(DiskCacheStrategy)>
	//   10   28:getstatic       #74  <Field Priority Priority.LOW>
	//   11   31:invokevirtual   #78  <Method RequestOptions RequestOptions.priority(Priority)>
	//   12   34:iconst_1        
	//   13   35:invokevirtual   #82  <Method RequestOptions RequestOptions.skipMemoryCache(boolean)>
	//   14   38:putstatic       #84  <Field RequestOptions DOWNLOAD_ONLY_OPTIONS>
	//*  15   41:return          
	}
}
