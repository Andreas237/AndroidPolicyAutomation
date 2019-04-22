// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.view.View;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//			InAppMessageViewWrapper, InAppMessageCloser

class InAppMessageViewWrapper$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(InAppMessageViewWrapper.access$300(InAppMessageViewWrapper.this) instanceof IInAppMessageImmersive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//*   2    4:invokestatic    #27  <Method com.appboy.models.IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
	//*   3    7:instanceof      #29  <Class IInAppMessageImmersive>
	//*   4   10:ifeq            85
		{
			view = ((View) ((IInAppMessageImmersive)InAppMessageViewWrapper.access$300(InAppMessageViewWrapper.this)));
	//    5   13:aload_0         
	//    6   14:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//    7   17:invokestatic    #27  <Method com.appboy.models.IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
	//    8   20:checkcast       #29  <Class IInAppMessageImmersive>
	//    9   23:astore_1        
			if(((IInAppMessageImmersive) (view)).getMessageButtons() == null || ((IInAppMessageImmersive) (view)).getMessageButtons().size() == 0)
	//*  10   24:aload_1         
	//*  11   25:invokeinterface #33  <Method List IInAppMessageImmersive.getMessageButtons()>
	//*  12   30:ifnull          47
	//*  13   33:aload_1         
	//*  14   34:invokeinterface #33  <Method List IInAppMessageImmersive.getMessageButtons()>
	//*  15   39:invokeinterface #39  <Method int List.size()>
	//*  16   44:ifne            122
			{
				InAppMessageViewWrapper.access$400(InAppMessageViewWrapper.this).onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this), InAppMessageViewWrapper.access$300(InAppMessageViewWrapper.this));
	//   17   47:aload_0         
	//   18   48:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   19   51:invokestatic    #43  <Method IInAppMessageViewLifecycleListener InAppMessageViewWrapper.access$400(InAppMessageViewWrapper)>
	//   20   54:new             #45  <Class InAppMessageCloser>
	//   21   57:dup             
	//   22   58:aload_0         
	//   23   59:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   24   62:invokespecial   #47  <Method void InAppMessageCloser(InAppMessageViewWrapper)>
	//   25   65:aload_0         
	//   26   66:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   27   69:invokestatic    #51  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
	//   28   72:aload_0         
	//   29   73:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   30   76:invokestatic    #27  <Method com.appboy.models.IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
	//   31   79:invokeinterface #57  <Method void IInAppMessageViewLifecycleListener.onClicked(InAppMessageCloser, View, com.appboy.models.IInAppMessage)>
				return;
	//   32   84:return          
			}
		} else
		{
			InAppMessageViewWrapper.access$400(InAppMessageViewWrapper.this).onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), InAppMessageViewWrapper.access$100(InAppMessageViewWrapper.this), InAppMessageViewWrapper.access$300(InAppMessageViewWrapper.this));
	//   33   85:aload_0         
	//   34   86:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   35   89:invokestatic    #43  <Method IInAppMessageViewLifecycleListener InAppMessageViewWrapper.access$400(InAppMessageViewWrapper)>
	//   36   92:new             #45  <Class InAppMessageCloser>
	//   37   95:dup             
	//   38   96:aload_0         
	//   39   97:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   40  100:invokespecial   #47  <Method void InAppMessageCloser(InAppMessageViewWrapper)>
	//   41  103:aload_0         
	//   42  104:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   43  107:invokestatic    #51  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
	//   44  110:aload_0         
	//   45  111:getfield        #17  <Field InAppMessageViewWrapper this$0>
	//   46  114:invokestatic    #27  <Method com.appboy.models.IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
	//   47  117:invokeinterface #57  <Method void IInAppMessageViewLifecycleListener.onClicked(InAppMessageCloser, View, com.appboy.models.IInAppMessage)>
		}
	//   48  122:return          
	}

	final InAppMessageViewWrapper this$0;

	InAppMessageViewWrapper$2()
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
