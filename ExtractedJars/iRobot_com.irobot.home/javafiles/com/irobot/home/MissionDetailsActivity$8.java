// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import android.widget.ImageView;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ViewId;
import com.irobot.home.model.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			MissionDetailsActivity

class MissionDetailsActivity$8 extends android.support.design.widget.BottomSheetBehavior.a
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
	//*   2    2:icmpne          42
		{
			a.l.setRotation(180F);
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field MissionDetailsActivity a>
	//    5    9:getfield        #24  <Field ImageView MissionDetailsActivity.l>
	//    6   12:ldc1            #25  <Float 180F>
	//    7   14:invokevirtual   #31  <Method void ImageView.setRotation(float)>
			view = ((View) (j.a(a.b).a()));
	//    8   17:aload_0         
	//    9   18:getfield        #15  <Field MissionDetailsActivity a>
	//   10   21:getfield        #35  <Field String MissionDetailsActivity.b>
	//   11   24:invokestatic    #40  <Method a j.a(String)>
	//   12   27:invokevirtual   #45  <Method com.irobot.core.AssetInfo a.a()>
	//   13   30:astore_1        
			AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.MissionHistoryDetailBottomSheet, ((com.irobot.core.AssetInfo) (view)));
	//   14   31:invokestatic    #51  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   15   34:getstatic       #57  <Field ViewId ViewId.MissionHistoryDetailBottomSheet>
	//   16   37:aload_1         
	//   17   38:invokevirtual   #61  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
			return;
	//   18   41:return          
		} else
		{
			a.l.setRotation(0.0F);
	//   19   42:aload_0         
	//   20   43:getfield        #15  <Field MissionDetailsActivity a>
	//   21   46:getfield        #24  <Field ImageView MissionDetailsActivity.l>
	//   22   49:fconst_0        
	//   23   50:invokevirtual   #31  <Method void ImageView.setRotation(float)>
			return;
	//   24   53:return          
		}
	}

	final MissionDetailsActivity a;

	MissionDetailsActivity$8(MissionDetailsActivity missiondetailsactivity)
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
