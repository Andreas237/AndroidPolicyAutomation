// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Message;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

static final class BaseTransientBottomBar$3
	implements android.os.Handler.Callback
{

	public boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #21  <Field int Message.what>
		{
	//*   2    4:lookupswitch    2: default 32
	//	               0: 35
	//	               1: 47
	//*   3   32:goto            63
		case 0: // '\0'
			((BaseTransientBottomBar)message.obj).showView();
	//    4   35:aload_1         
	//    5   36:getfield        #25  <Field Object Message.obj>
	//    6   39:checkcast       #8   <Class BaseTransientBottomBar>
	//    7   42:invokevirtual   #28  <Method void BaseTransientBottomBar.showView()>
			return true;
	//    8   45:iconst_1        
	//    9   46:ireturn         

		case 1: // '\001'
			((BaseTransientBottomBar)message.obj).hideView(message.arg1);
	//   10   47:aload_1         
	//   11   48:getfield        #25  <Field Object Message.obj>
	//   12   51:checkcast       #8   <Class BaseTransientBottomBar>
	//   13   54:aload_1         
	//   14   55:getfield        #31  <Field int Message.arg1>
	//   15   58:invokevirtual   #35  <Method void BaseTransientBottomBar.hideView(int)>
			return true;
	//   16   61:iconst_1        
	//   17   62:ireturn         
		}
		return false;
	//   18   63:iconst_0        
	//   19   64:ireturn         
	}

	BaseTransientBottomBar$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
