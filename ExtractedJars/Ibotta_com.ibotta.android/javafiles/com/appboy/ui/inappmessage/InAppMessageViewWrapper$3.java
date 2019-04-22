// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.models.MessageButton;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//			InAppMessageViewWrapper, InAppMessageCloser

class InAppMessageViewWrapper$3
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		IInAppMessageImmersive iinappmessageimmersive = (IInAppMessageImmersive)InAppMessageViewWrapper.access$300(InAppMessageViewWrapper.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//    2    4:invokestatic    #27  <Method com.appboy.models.IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
	//    3    7:checkcast       #29  <Class IInAppMessageImmersive>
	//    4   10:astore_3        
		for(int i = 0; i < InAppMessageViewWrapper.access$500(InAppMessageViewWrapper.this).size(); i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_2        
	//*   7   13:iload_2         
	//*   8   14:aload_0         
	//*   9   15:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//*  10   18:invokestatic    #33  <Method List InAppMessageViewWrapper.access$500(InAppMessageViewWrapper)>
	//*  11   21:invokeinterface #39  <Method int List.size()>
	//*  12   26:icmpge          104
			if(view.getId() == ((View)InAppMessageViewWrapper.access$500(InAppMessageViewWrapper.this).get(i)).getId())
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #44  <Method int View.getId()>
	//*  15   33:aload_0         
	//*  16   34:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//*  17   37:invokestatic    #33  <Method List InAppMessageViewWrapper.access$500(InAppMessageViewWrapper)>
	//*  18   40:iload_2         
	//*  19   41:invokeinterface #48  <Method Object List.get(int)>
	//*  20   46:checkcast       #41  <Class View>
	//*  21   49:invokevirtual   #44  <Method int View.getId()>
	//*  22   52:icmpne          97
			{
				view = ((View) ((MessageButton)iinappmessageimmersive.getMessageButtons().get(i)));
	//   23   55:aload_3         
	//   24   56:invokeinterface #52  <Method List IInAppMessageImmersive.getMessageButtons()>
	//   25   61:iload_2         
	//   26   62:invokeinterface #48  <Method Object List.get(int)>
	//   27   67:checkcast       #54  <Class MessageButton>
	//   28   70:astore_1        
				InAppMessageViewWrapper.access$400(InAppMessageViewWrapper.this).onButtonClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), ((MessageButton) (view)), iinappmessageimmersive);
	//   29   71:aload_0         
	//   30   72:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   31   75:invokestatic    #58  <Method IInAppMessageViewLifecycleListener InAppMessageViewWrapper.access$400(InAppMessageViewWrapper)>
	//   32   78:new             #60  <Class InAppMessageCloser>
	//   33   81:dup             
	//   34   82:aload_0         
	//   35   83:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   36   86:invokespecial   #62  <Method void InAppMessageCloser(InAppMessageViewWrapper)>
	//   37   89:aload_1         
	//   38   90:aload_3         
	//   39   91:invokeinterface #68  <Method void IInAppMessageViewLifecycleListener.onButtonClicked(InAppMessageCloser, MessageButton, IInAppMessageImmersive)>
				return;
	//   40   96:return          
			}

	//   41   97:iload_2         
	//   42   98:iconst_1        
	//   43   99:iadd            
	//   44  100:istore_2        
	//*  45  101:goto            13
	//   46  104:return          
	}

	final InAppMessageViewWrapper this$0;

	InAppMessageViewWrapper$3()
	{
		this$0 = InAppMessageViewWrapper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field InAppMessageViewWrapper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
