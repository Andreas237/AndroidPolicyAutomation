// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;
import android.widget.ImageView;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.fragments:
//			MissionAndMapDetailsFragment

class MissionAndMapDetailsFragment$2 extends android.support.design.widget.BottomSheetBehavior.a
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
	//*   2    2:icmpne          50
		{
			a.setRotation(180F);
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field ImageView a>
	//    5    9:ldc1            #25  <Float 180F>
	//    6   11:invokevirtual   #31  <Method void ImageView.setRotation(float)>
			if(b.E == MissionMapType.WifiHeat)
	//*   7   14:aload_0         
	//*   8   15:getfield        #16  <Field MissionAndMapDetailsFragment b>
	//*   9   18:getfield        #35  <Field MissionMapType MissionAndMapDetailsFragment.E>
	//*  10   21:getstatic       #40  <Field MissionMapType MissionMapType.WifiHeat>
	//*  11   24:if_acmpne       58
			{
				AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.WifiMapBottomSheet, j.a(b.B).a());
	//   12   27:invokestatic    #46  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   13   30:getstatic       #52  <Field ViewId ViewId.WifiMapBottomSheet>
	//   14   33:aload_0         
	//   15   34:getfield        #16  <Field MissionAndMapDetailsFragment b>
	//   16   37:getfield        #56  <Field String MissionAndMapDetailsFragment.B>
	//   17   40:invokestatic    #61  <Method a j.a(String)>
	//   18   43:invokevirtual   #66  <Method com.irobot.core.AssetInfo a.a()>
	//   19   46:invokevirtual   #70  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
				return;
	//   20   49:return          
			}
		} else
		{
			a.setRotation(0.0F);
	//   21   50:aload_0         
	//   22   51:getfield        #18  <Field ImageView a>
	//   23   54:fconst_0        
	//   24   55:invokevirtual   #31  <Method void ImageView.setRotation(float)>
		}
	//   25   58:return          
	}

	final ImageView a;
	final MissionAndMapDetailsFragment b;

	MissionAndMapDetailsFragment$2(MissionAndMapDetailsFragment missionandmapdetailsfragment, ImageView imageview)
	{
		b = missionandmapdetailsfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MissionAndMapDetailsFragment b>
		a = imageview;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field ImageView a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void android.support.design.widget.BottomSheetBehavior$a()>
	//    8   14:return          
	}
}
