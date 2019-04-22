// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.app.Activity;
import android.app.Application;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ApplicationDescriptor, ActivityTracker

private class ApplicationDescriptor$ElementContext
{

	public List getActivitiesList()
	{
		return ApplicationDescriptor.access$000(ApplicationDescriptor.this).getActivitiesView();
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
		ApplicationDescriptor.access$000(ApplicationDescriptor.this).registerListener(mListener);
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
		ApplicationDescriptor.access$000(ApplicationDescriptor.this).unregisterListener(mListener);
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
	private final ActivityTracker.Listener mListener = new ActivityTracker.Listener() {

		public void onActivityAdded(Activity activity)
		{
		//    0    0:return          
		}

		public void onActivityRemoved(Activity activity)
		{
		//    0    0:return          
		}

		final ApplicationDescriptor.ElementContext this$1;

			
			{
				this$1 = ApplicationDescriptor.ElementContext.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ApplicationDescriptor$ElementContext this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}
;
	final ApplicationDescriptor this$0;

	public ApplicationDescriptor$ElementContext()
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
