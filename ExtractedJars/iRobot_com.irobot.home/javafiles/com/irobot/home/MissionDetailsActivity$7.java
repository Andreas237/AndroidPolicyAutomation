// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import android.widget.ImageView;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ViewId;
import com.irobot.home.view.WebViewLanguageCompat;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

class MissionDetailsActivity$7 extends android.support.design.widget.BottomSheetBehavior.a
{

	public void a(View view, float f)
	{
	//    0    0:return          
	}

	public void a(View view, int i)
	{
		if(i == 3)
	//*   0    0:iload_2         
	//*   1    1:iconst_3        
	//*   2    2:icmpne          94
		{
			a.l.setRotation(180F);
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field MissionDetailsActivity a>
	//    5    9:getfield        #24  <Field ImageView MissionDetailsActivity.l>
	//    6   12:ldc1            #25  <Float 180F>
	//    7   14:invokevirtual   #31  <Method void ImageView.setRotation(float)>
			if(MissionDetailsActivity.d(a) != null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #15  <Field MissionDetailsActivity a>
	//*  10   21:invokestatic    #35  <Method String MissionDetailsActivity.d(MissionDetailsActivity)>
	//*  11   24:ifnull          77
			{
				view = ((View) (a.F));
	//   12   27:aload_0         
	//   13   28:getfield        #15  <Field MissionDetailsActivity a>
	//   14   31:getfield        #39  <Field WebViewLanguageCompat MissionDetailsActivity.F>
	//   15   34:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
	//   16   35:new             #41  <Class StringBuilder>
	//   17   38:dup             
	//   18   39:invokespecial   #42  <Method void StringBuilder()>
	//   19   42:astore_3        
				stringbuilder.append("javascript:loadChart(");
	//   20   43:aload_3         
	//   21   44:ldc1            #44  <String "javascript:loadChart(">
	//   22   46:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
				stringbuilder.append(MissionDetailsActivity.d(a));
	//   24   50:aload_3         
	//   25   51:aload_0         
	//   26   52:getfield        #15  <Field MissionDetailsActivity a>
	//   27   55:invokestatic    #35  <Method String MissionDetailsActivity.d(MissionDetailsActivity)>
	//   28   58:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
				stringbuilder.append(")");
	//   30   62:aload_3         
	//   31   63:ldc1            #50  <String ")">
	//   32   65:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
				((WebViewLanguageCompat) (view)).loadUrl(stringbuilder.toString());
	//   34   69:aload_1         
	//   35   70:aload_3         
	//   36   71:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   37   74:invokevirtual   #60  <Method void WebViewLanguageCompat.loadUrl(String)>
			}
			AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.MissionHistoryDetailBottomSheet, MissionDetailsActivity.e(a));
	//   38   77:invokestatic    #66  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   39   80:getstatic       #72  <Field ViewId ViewId.MissionHistoryDetailBottomSheet>
	//   40   83:aload_0         
	//   41   84:getfield        #15  <Field MissionDetailsActivity a>
	//   42   87:invokestatic    #76  <Method com.irobot.core.AssetInfo MissionDetailsActivity.e(MissionDetailsActivity)>
	//   43   90:invokevirtual   #80  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
			return;
	//   44   93:return          
		} else
		{
			a.l.setRotation(0.0F);
	//   45   94:aload_0         
	//   46   95:getfield        #15  <Field MissionDetailsActivity a>
	//   47   98:getfield        #24  <Field ImageView MissionDetailsActivity.l>
	//   48  101:fconst_0        
	//   49  102:invokevirtual   #31  <Method void ImageView.setRotation(float)>
			return;
	//   50  105:return          
		}
	}

	final MissionDetailsActivity a;

	MissionDetailsActivity$7(MissionDetailsActivity missiondetailsactivity)
	{
		a = missiondetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field MissionDetailsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void android.support.design.widget.BottomSheetBehavior$a()>
	//    5    9:return          
	}
}
