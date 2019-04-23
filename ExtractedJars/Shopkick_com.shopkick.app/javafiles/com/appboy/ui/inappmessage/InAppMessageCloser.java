// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import com.appboy.models.IInAppMessage;

// Referenced classes of package com.appboy.ui.inappmessage:
//			InAppMessageViewWrapper

public class InAppMessageCloser
{

	public InAppMessageCloser(InAppMessageViewWrapper inappmessageviewwrapper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		mInAppMessageViewWrapper = inappmessageviewwrapper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field InAppMessageViewWrapper mInAppMessageViewWrapper>
	//    5    9:return          
	}

	public void close(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            20
			mInAppMessageViewWrapper.getInAppMessage().setAnimateOut(true);
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field InAppMessageViewWrapper mInAppMessageViewWrapper>
	//    4    8:invokevirtual   #22  <Method IInAppMessage InAppMessageViewWrapper.getInAppMessage()>
	//    5   11:iconst_1        
	//    6   12:invokeinterface #27  <Method void IInAppMessage.setAnimateOut(boolean)>
		else
	//*   7   17:goto            33
			mInAppMessageViewWrapper.getInAppMessage().setAnimateOut(false);
	//    8   20:aload_0         
	//    9   21:getfield        #13  <Field InAppMessageViewWrapper mInAppMessageViewWrapper>
	//   10   24:invokevirtual   #22  <Method IInAppMessage InAppMessageViewWrapper.getInAppMessage()>
	//   11   27:iconst_0        
	//   12   28:invokeinterface #27  <Method void IInAppMessage.setAnimateOut(boolean)>
		mInAppMessageViewWrapper.close();
	//   13   33:aload_0         
	//   14   34:getfield        #13  <Field InAppMessageViewWrapper mInAppMessageViewWrapper>
	//   15   37:invokevirtual   #29  <Method void InAppMessageViewWrapper.close()>
	//   16   40:return          
	}

	private InAppMessageViewWrapper mInAppMessageViewWrapper;
}
