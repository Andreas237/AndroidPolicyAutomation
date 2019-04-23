// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.view.View;
import com.facebook.share.DeviceShareDialog;

// Referenced classes of package com.facebook.share.widget:
//			DeviceShareButton

class DeviceShareButton$1
	implements android.view.
{

	public void onClick(View view)
	{
		DeviceShareButton.access$000(DeviceShareButton.this, view);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DeviceShareButton this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method void DeviceShareButton.access$000(DeviceShareButton, View)>
		DeviceShareButton.access$100(DeviceShareButton.this).show(((Object) (getShareContent())));
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field DeviceShareButton this$0>
	//    6   12:invokestatic    #31  <Method DeviceShareDialog DeviceShareButton.access$100(DeviceShareButton)>
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field DeviceShareButton this$0>
	//    9   19:invokevirtual   #35  <Method com.facebook.share.model.ShareContent DeviceShareButton.getShareContent()>
	//   10   22:invokevirtual   #41  <Method void DeviceShareDialog.show(Object)>
	//   11   25:return          
	}

	final DeviceShareButton this$0;

	DeviceShareButton$1()
	{
		this$0 = DeviceShareButton.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DeviceShareButton this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
