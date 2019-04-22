// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.Activity;
import android.app.Application;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.NodeType;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ActivityTracker

final class ApplicationDescriptor extends AbstractChainedDescriptor
{
	private class ElementContext
	{

		public List getActivitiesList()
		{
			return mActivityTracker.getActivitiesView();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field ApplicationDescriptor this$0>
		//    2    4:invokestatic    #34  <Method ActivityTracker ApplicationDescriptor.access$000(ApplicationDescriptor)>
		//    3    7:invokevirtual   #39  <Method List ActivityTracker.getActivitiesView()>
		//    4   10:areturn         
		}

		public void hook(Application application)
		{
			mElement = application;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field Application mElement>
			mActivityTracker.registerListener(mListener);
		//    3    5:aload_0         
		//    4    6:getfield        #19  <Field ApplicationDescriptor this$0>
		//    5    9:invokestatic    #34  <Method ActivityTracker ApplicationDescriptor.access$000(ApplicationDescriptor)>
		//    6   12:aload_0         
		//    7   13:getfield        #27  <Field ActivityTracker$Listener mListener>
		//    8   16:invokevirtual   #49  <Method void ActivityTracker.registerListener(ActivityTracker$Listener)>
		//    9   19:return          
		}

		public void unhook()
		{
			mActivityTracker.unregisterListener(mListener);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field ApplicationDescriptor this$0>
		//    2    4:invokestatic    #34  <Method ActivityTracker ApplicationDescriptor.access$000(ApplicationDescriptor)>
		//    3    7:aload_0         
		//    4    8:getfield        #27  <Field ActivityTracker$Listener mListener>
		//    5   11:invokevirtual   #53  <Method void ActivityTracker.unregisterListener(ActivityTracker$Listener)>
			mElement = null;
		//    6   14:aload_0         
		//    7   15:aconst_null     
		//    8   16:putfield        #45  <Field Application mElement>
		//    9   19:return          
		}

		private Application mElement;
		private final ActivityTracker.Listener mListener = new _cls1();
		final ApplicationDescriptor this$0;

		public ElementContext()
		{
			this$0 = ApplicationDescriptor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ApplicationDescriptor this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #9   <Class ApplicationDescriptor$ElementContext$1>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:invokespecial   #25  <Method void ApplicationDescriptor$ElementContext$1(ApplicationDescriptor$ElementContext)>
		//   10   18:putfield        #27  <Field ActivityTracker$Listener mListener>
		//   11   21:return          
		}
	}


	ApplicationDescriptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AbstractChainedDescriptor()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class IdentityHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void IdentityHashMap()>
	//    6   12:invokestatic    #28  <Method Map Collections.synchronizedMap(Map)>
	//    7   15:putfield        #30  <Field Map mElementToContextMap>
	//    8   18:aload_0         
	//    9   19:invokestatic    #36  <Method ActivityTracker ActivityTracker.get()>
	//   10   22:putfield        #38  <Field ActivityTracker mActivityTracker>
	//   11   25:return          
	}

	private ElementContext getContext(Application application)
	{
		return (ElementContext)mElementToContextMap.get(((Object) (application)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map mElementToContextMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #48  <Method Object Map.get(Object)>
	//    4   10:checkcast       #7   <Class ApplicationDescriptor$ElementContext>
	//    5   13:areturn         
	}

	protected void onGetChildren(Application application, Accumulator accumulator)
	{
		application = ((Application) (getContext(application).getActivitiesList()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method ApplicationDescriptor$ElementContext getContext(Application)>
	//    3    5:invokevirtual   #56  <Method List ApplicationDescriptor$ElementContext.getActivitiesList()>
	//    4    8:astore_1        
		for(int i = ((List) (application)).size() - 1; i >= 0; i--)
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #62  <Method int List.size()>
	//*   7   15:iconst_1        
	//*   8   16:isub            
	//*   9   17:istore_3        
	//*  10   18:iload_3         
	//*  11   19:iflt            42
			accumulator.store(((List) (application)).get(i));
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:iload_3         
	//   15   25:invokeinterface #65  <Method Object List.get(int)>
	//   16   30:invokeinterface #71  <Method void Accumulator.store(Object)>

	//   17   35:iload_3         
	//   18   36:iconst_1        
	//   19   37:isub            
	//   20   38:istore_3        
	//*  21   39:goto            18
	//   22   42:return          
	}

	protected volatile void onGetChildren(Object obj, Accumulator accumulator)
	{
		onGetChildren((Application)obj, accumulator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #76  <Class Application>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #78  <Method void onGetChildren(Application, Accumulator)>
	//    5    9:return          
	}

	protected NodeType onGetNodeType(Application application)
	{
		return NodeType.ELEMENT_NODE;
	//    0    0:getstatic       #86  <Field NodeType NodeType.ELEMENT_NODE>
	//    1    3:areturn         
	}

	protected volatile NodeType onGetNodeType(Object obj)
	{
		return onGetNodeType((Application)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #76  <Class Application>
	//    3    5:invokevirtual   #89  <Method NodeType onGetNodeType(Application)>
	//    4    8:areturn         
	}

	protected void onHook(Application application)
	{
		ElementContext elementcontext = new ElementContext();
	//    0    0:new             #7   <Class ApplicationDescriptor$ElementContext>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #94  <Method void ApplicationDescriptor$ElementContext(ApplicationDescriptor)>
	//    4    8:astore_2        
		elementcontext.hook(application);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #97  <Method void ApplicationDescriptor$ElementContext.hook(Application)>
		mElementToContextMap.put(((Object) (application)), ((Object) (elementcontext)));
	//    8   14:aload_0         
	//    9   15:getfield        #30  <Field Map mElementToContextMap>
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//   13   25:pop             
	//   14   26:return          
	}

	protected volatile void onHook(Object obj)
	{
		onHook((Application)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #76  <Class Application>
	//    3    5:invokevirtual   #103 <Method void onHook(Application)>
	//    4    8:return          
	}

	protected void onUnhook(Application application)
	{
		((ElementContext)mElementToContextMap.remove(((Object) (application)))).unhook();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map mElementToContextMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #107 <Method Object Map.remove(Object)>
	//    4   10:checkcast       #7   <Class ApplicationDescriptor$ElementContext>
	//    5   13:invokevirtual   #110 <Method void ApplicationDescriptor$ElementContext.unhook()>
	//    6   16:return          
	}

	protected volatile void onUnhook(Object obj)
	{
		onUnhook((Application)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #76  <Class Application>
	//    3    5:invokevirtual   #112 <Method void onUnhook(Application)>
	//    4    8:return          
	}

	private final ActivityTracker mActivityTracker = ActivityTracker.get();
	private final Map mElementToContextMap = Collections.synchronizedMap(((Map) (new IdentityHashMap())));


/*
	static ActivityTracker access$000(ApplicationDescriptor applicationdescriptor)
	{
		return applicationdescriptor.mActivityTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ActivityTracker mActivityTracker>
	//    2    4:areturn         
	}

*/

	// Unreferenced inner class com/facebook/stetho/inspector/elements/android/ApplicationDescriptor$ElementContext$1

/* anonymous class */
	class ElementContext._cls1
		implements ActivityTracker.Listener
	{

		public void onActivityAdded(Activity activity)
		{
		//    0    0:return          
		}

		public void onActivityRemoved(Activity activity)
		{
		//    0    0:return          
		}

		final ElementContext this$1;

			
			{
				this$1 = ElementContext.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ApplicationDescriptor$ElementContext this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}

}
