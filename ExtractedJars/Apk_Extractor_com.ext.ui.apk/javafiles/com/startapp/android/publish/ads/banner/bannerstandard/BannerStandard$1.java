// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.bannerstandard;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.startapp.android.publish.ads.banner.bannerstandard:
//			BannerStandard

class BannerStandard$1
	implements android.view.ner
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		BannerStandard.access$002(BannerStandard.this, true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BannerStandard this$0>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #26  <Method boolean BannerStandard.access$002(BannerStandard, boolean)>
	//    4    8:pop             
		return motionevent.getAction() == 2;
	//    5    9:aload_2         
	//    6   10:invokevirtual   #32  <Method int MotionEvent.getAction()>
	//    7   13:iconst_2        
	//    8   14:icmpne          19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	final BannerStandard this$0;

	BannerStandard$1()
	{
		this$0 = BannerStandard.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BannerStandard this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
