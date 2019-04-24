// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Handler;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$3
	implements SnackbarManager$Callback
{

	public void dismiss(int i)
	{
		BaseTransientBottomBar.sHandler.sendMessage(BaseTransientBottomBar.sHandler.obtainMessage(1, i, 0, ((Object) (BaseTransientBottomBar.this))));
	//    0    0:getstatic       #24  <Field Handler BaseTransientBottomBar.sHandler>
	//    1    3:getstatic       #24  <Field Handler BaseTransientBottomBar.sHandler>
	//    2    6:iconst_1        
	//    3    7:iload_1         
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field BaseTransientBottomBar this$0>
	//    7   13:invokevirtual   #30  <Method android.os.Message Handler.obtainMessage(int, int, int, Object)>
	//    8   16:invokevirtual   #34  <Method boolean Handler.sendMessage(android.os.Message)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void show()
	{
		BaseTransientBottomBar.sHandler.sendMessage(BaseTransientBottomBar.sHandler.obtainMessage(0, ((Object) (BaseTransientBottomBar.this))));
	//    0    0:getstatic       #24  <Field Handler BaseTransientBottomBar.sHandler>
	//    1    3:getstatic       #24  <Field Handler BaseTransientBottomBar.sHandler>
	//    2    6:iconst_0        
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field BaseTransientBottomBar this$0>
	//    5   11:invokevirtual   #38  <Method android.os.Message Handler.obtainMessage(int, Object)>
	//    6   14:invokevirtual   #34  <Method boolean Handler.sendMessage(android.os.Message)>
	//    7   17:pop             
	//    8   18:return          
	}

	final BaseTransientBottomBar this$0;

	BaseTransientBottomBar$3()
	{
		this$0 = BaseTransientBottomBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field BaseTransientBottomBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
