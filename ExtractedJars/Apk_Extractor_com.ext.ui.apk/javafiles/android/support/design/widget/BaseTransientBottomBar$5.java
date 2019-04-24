// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Handler;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$5
	implements AttachStateChangeListener
{

	public void onViewAttachedToWindow(View view)
	{
	//    0    0:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		if(isShownOrQueued())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field BaseTransientBottomBar this$0>
	//*   2    4:invokevirtual   #29  <Method boolean BaseTransientBottomBar.isShownOrQueued()>
	//*   3    7:ifeq            25
			BaseTransientBottomBar.sHandler.post(new Runnable() {

				public void run()
				{
					onViewHidden(3);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BaseTransientBottomBar$5 this$1>
				//    2    4:getfield        #26  <Field BaseTransientBottomBar BaseTransientBottomBar$5.this$0>
				//    3    7:iconst_3        
				//    4    8:invokevirtual   #32  <Method void BaseTransientBottomBar.onViewHidden(int)>
				//    5   11:return          
				}

				final BaseTransientBottomBar._cls5 this$1;

			
			{
				this$1 = BaseTransientBottomBar._cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BaseTransientBottomBar$5 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    4   10:getstatic       #33  <Field Handler BaseTransientBottomBar.sHandler>
	//    5   13:new             #13  <Class BaseTransientBottomBar$5$1>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:invokespecial   #36  <Method void BaseTransientBottomBar$5$1(BaseTransientBottomBar$5)>
	//    9   21:invokevirtual   #42  <Method boolean Handler.post(Runnable)>
	//   10   24:pop             
	//   11   25:return          
	}

	final BaseTransientBottomBar this$0;

	BaseTransientBottomBar$5()
	{
		this$0 = BaseTransientBottomBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BaseTransientBottomBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
