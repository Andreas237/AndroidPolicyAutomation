// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Message;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

static final class BaseTransientBottomBar$1
	implements android.os.Handler.Callback
{

	public boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #21  <Field int Message.what>
		{
	//*   2    4:tableswitch     0 1: default 28
	//	               0 46
	//	               1 30
		default:
			return false;
	//    3   28:iconst_0        
	//    4   29:ireturn         

		case 1: // '\001'
			((BaseTransientBottomBar)message.obj).hideView(message.arg1);
	//    5   30:aload_1         
	//    6   31:getfield        #25  <Field Object Message.obj>
	//    7   34:checkcast       #8   <Class BaseTransientBottomBar>
	//    8   37:aload_1         
	//    9   38:getfield        #28  <Field int Message.arg1>
	//   10   41:invokevirtual   #32  <Method void BaseTransientBottomBar.hideView(int)>
			return true;
	//   11   44:iconst_1        
	//   12   45:ireturn         

		case 0: // '\0'
			((BaseTransientBottomBar)message.obj).showView();
	//   13   46:aload_1         
	//   14   47:getfield        #25  <Field Object Message.obj>
	//   15   50:checkcast       #8   <Class BaseTransientBottomBar>
	//   16   53:invokevirtual   #35  <Method void BaseTransientBottomBar.showView()>
			return true;
	//   17   56:iconst_1        
	//   18   57:ireturn         
		}
	}

	BaseTransientBottomBar$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
