// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			TroubleshootMapDetailActivity, IRobotApplication, FloorPlanActivity_

class TroubleshootMapDetailActivity$3
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		o.b(TroubleshootMapDetailActivity.h(), "Attempt to archive map.");
	//    0    0:invokestatic    #30  <Method String TroubleshootMapDetailActivity.h()>
	//    1    3:ldc1            #32  <String "Attempt to archive map.">
	//    2    5:invokestatic    #37  <Method void o.b(String, String)>
		b.i.a(((com.irobot.core.PersistentMapIdentifier) (null)));
	//    3    8:aload_0         
	//    4    9:getfield        #19  <Field TroubleshootMapDetailActivity b>
	//    5   12:getfield        #41  <Field IRobotApplication TroubleshootMapDetailActivity.i>
	//    6   15:aconst_null     
	//    7   16:invokevirtual   #46  <Method void com.irobot.home.IRobotApplication.a(com.irobot.core.PersistentMapIdentifier)>
		com.irobot.home.TroubleshootMapDetailActivity.a(b).sendCommand(MapsUIServiceCommand.ArchiveMap, ((com.irobot.core.MapsUIServiceData) (null)));
	//    8   19:aload_0         
	//    9   20:getfield        #19  <Field TroubleshootMapDetailActivity b>
	//   10   23:invokestatic    #49  <Method MapsUIService com.irobot.home.TroubleshootMapDetailActivity.a(TroubleshootMapDetailActivity)>
	//   11   26:getstatic       #55  <Field MapsUIServiceCommand MapsUIServiceCommand.ArchiveMap>
	//   12   29:aconst_null     
	//   13   30:invokevirtual   #61  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, com.irobot.core.MapsUIServiceData)>
		AnalyticsSubsystem.getInstance().trackPMapTroubleshootWrongDeleteButtonPressed(j.j().a());
	//   14   33:invokestatic    #67  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   15   36:invokestatic    #73  <Method a j.j()>
	//   16   39:invokevirtual   #78  <Method AssetInfo a.a()>
	//   17   42:invokevirtual   #82  <Method void AnalyticsSubsystem.trackPMapTroubleshootWrongDeleteButtonPressed(AssetInfo)>
		((FloorPlanActivity_.a)com.irobot.home.FloorPlanActivity_.a(((android.content.Context) (b))).a(a.getAssetId().getId()).g(0x4000000)).a();
	//   18   45:aload_0         
	//   19   46:getfield        #19  <Field TroubleshootMapDetailActivity b>
	//   20   49:invokestatic    #87  <Method FloorPlanActivity_$a com.irobot.home.FloorPlanActivity_.a(android.content.Context)>
	//   21   52:aload_0         
	//   22   53:getfield        #21  <Field AssetInfo a>
	//   23   56:invokevirtual   #93  <Method AssetId AssetInfo.getAssetId()>
	//   24   59:invokevirtual   #98  <Method String AssetId.getId()>
	//   25   62:invokevirtual   #103 <Method FloorPlanActivity_$a com.irobot.home.FloorPlanActivity_$a.a(String)>
	//   26   65:ldc1            #104 <Int 0x4000000>
	//   27   67:invokevirtual   #107 <Method org.androidannotations.api.a.d FloorPlanActivity_$a.g(int)>
	//   28   70:checkcast       #100 <Class FloorPlanActivity_$a>
	//   29   73:invokevirtual   #110 <Method org.androidannotations.api.a.e com.irobot.home.FloorPlanActivity_$a.a()>
	//   30   76:pop             
	//   31   77:return          
	}

	final AssetInfo a;
	final TroubleshootMapDetailActivity b;

	TroubleshootMapDetailActivity$3(TroubleshootMapDetailActivity troubleshootmapdetailactivity, AssetInfo assetinfo)
	{
		b = troubleshootmapdetailactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TroubleshootMapDetailActivity b>
		a = assetinfo;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AssetInfo a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
