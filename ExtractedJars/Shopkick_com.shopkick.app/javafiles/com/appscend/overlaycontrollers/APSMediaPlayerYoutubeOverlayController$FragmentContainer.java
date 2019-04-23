// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.Context;
import android.widget.RelativeLayout;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerYoutubeOverlayController

public class APSMediaPlayerYoutubeOverlayController$FragmentContainer extends RelativeLayout
{

	final APSMediaPlayerYoutubeOverlayController this$0;

	public APSMediaPlayerYoutubeOverlayController$FragmentContainer(Context context)
	{
		this$0 = APSMediaPlayerYoutubeOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field APSMediaPlayerYoutubeOverlayController this$0>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void RelativeLayout(Context)>
		setId(com.appscend.vastplayer.R.id.youtubeoverlay);
	//    6   10:aload_0         
	//    7   11:getstatic       #22  <Field int com.appscend.vastplayer.R$id.youtubeoverlay>
	//    8   14:invokevirtual   #26  <Method void setId(int)>
		setGravity(17);
	//    9   17:aload_0         
	//   10   18:bipush          17
	//   11   20:invokevirtual   #29  <Method void setGravity(int)>
		setBackgroundColor(0);
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #32  <Method void setBackgroundColor(int)>
		setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-1, -1))));
	//   15   28:aload_0         
	//   16   29:new             #34  <Class android.widget.RelativeLayout$LayoutParams>
	//   17   32:dup             
	//   18   33:iconst_m1       
	//   19   34:iconst_m1       
	//   20   35:invokespecial   #37  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   21   38:invokevirtual   #41  <Method void setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   22   41:return          
	}
}
