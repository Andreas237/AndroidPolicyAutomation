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
//			TroubleshootMapDetailActivity, IRobotApplication, TrainRobotActivity_

class TroubleshootMapDetailActivity$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		o.b(TroubleshootMapDetailActivity.h(), "Attempt to start a new training mission.");
	//    0    0:invokestatic    #30  <Method String TroubleshootMapDetailActivity.h()>
	//    1    3:ldc1            #32  <String "Attempt to start a new training mission.">
	//    2    5:invokestatic    #37  <Method void o.b(String, String)>
		if(!a)
	//*   3    8:aload_0         
	//*   4    9:getfield        #21  <Field boolean a>
	//*   5   12:ifne            114
		{
			if(b.m == 100)
	//*   6   15:aload_0         
	//*   7   16:getfield        #19  <Field TroubleshootMapDetailActivity b>
	//*   8   19:getfield        #41  <Field int TroubleshootMapDetailActivity.m>
	//*   9   22:bipush          100
	//*  10   24:icmpne          81
			{
				AnalyticsSubsystem.getInstance().trackPMapTroubleshootIncompleteTrainButtonPressed(j.j().a());
	//   11   27:invokestatic    #47  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   12   30:invokestatic    #53  <Method a j.j()>
	//   13   33:invokevirtual   #58  <Method com.irobot.core.AssetInfo a.a()>
	//   14   36:invokevirtual   #62  <Method void AnalyticsSubsystem.trackPMapTroubleshootIncompleteTrainButtonPressed(com.irobot.core.AssetInfo)>
				view = ((View) (MapsUIServiceData.create()));
	//   15   39:invokestatic    #68  <Method MapsUIServiceData MapsUIServiceData.create()>
	//   16   42:astore_1        
				((MapsUIServiceData) (view)).setRunActionCommandType(CommandType.TRAIN);
	//   17   43:aload_1         
	//   18   44:getstatic       #74  <Field CommandType CommandType.TRAIN>
	//   19   47:invokevirtual   #78  <Method void MapsUIServiceData.setRunActionCommandType(CommandType)>
				((MapsUIServiceData) (view)).setRunActionMapId(b.i.f());
	//   20   50:aload_1         
	//   21   51:aload_0         
	//   22   52:getfield        #19  <Field TroubleshootMapDetailActivity b>
	//   23   55:getfield        #82  <Field IRobotApplication TroubleshootMapDetailActivity.i>
	//   24   58:invokevirtual   #88  <Method com.irobot.core.PersistentMapIdentifier IRobotApplication.f()>
	//   25   61:invokevirtual   #92  <Method void MapsUIServiceData.setRunActionMapId(com.irobot.core.PersistentMapIdentifier)>
				com.irobot.home.TroubleshootMapDetailActivity.a(b).sendCommand(MapsUIServiceCommand.StartOneMoreRunAction, ((MapsUIServiceData) (view)));
	//   26   64:aload_0         
	//   27   65:getfield        #19  <Field TroubleshootMapDetailActivity b>
	//   28   68:invokestatic    #95  <Method MapsUIService com.irobot.home.TroubleshootMapDetailActivity.a(TroubleshootMapDetailActivity)>
	//   29   71:getstatic       #101 <Field MapsUIServiceCommand MapsUIServiceCommand.StartOneMoreRunAction>
	//   30   74:aload_1         
	//   31   75:invokevirtual   #107 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
			} else
	//*  32   78:goto            106
			{
				AnalyticsSubsystem.getInstance().trackPMapTroubleshootIncompleteTrainButtonPressed(j.j().a());
	//   33   81:invokestatic    #47  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   34   84:invokestatic    #53  <Method a j.j()>
	//   35   87:invokevirtual   #58  <Method com.irobot.core.AssetInfo a.a()>
	//   36   90:invokevirtual   #62  <Method void AnalyticsSubsystem.trackPMapTroubleshootIncompleteTrainButtonPressed(com.irobot.core.AssetInfo)>
				TroubleshootMapDetailActivity.b(b).sendCommand(CommandType.TRAIN);
	//   37   93:aload_0         
	//   38   94:getfield        #19  <Field TroubleshootMapDetailActivity b>
	//   39   97:invokestatic    #110 <Method MissionSubsystem TroubleshootMapDetailActivity.b(TroubleshootMapDetailActivity)>
	//   40  100:getstatic       #74  <Field CommandType CommandType.TRAIN>
	//   41  103:invokevirtual   #114 <Method void MissionSubsystem.sendCommand(CommandType)>
			}
			j.a(((android.app.Activity) (b)));
	//   42  106:aload_0         
	//   43  107:getfield        #19  <Field TroubleshootMapDetailActivity b>
	//   44  110:invokestatic    #117 <Method void j.a(android.app.Activity)>
			return;
	//   45  113:return          
		} else
		{
			com.irobot.home.TrainRobotActivity_.a(((android.content.Context) (b))).a(true).a();
	//   46  114:aload_0         
	//   47  115:getfield        #19  <Field TroubleshootMapDetailActivity b>
	//   48  118:invokestatic    #122 <Method TrainRobotActivity_$a com.irobot.home.TrainRobotActivity_.a(android.content.Context)>
	//   49  121:iconst_1        
	//   50  122:invokevirtual   #127 <Method TrainRobotActivity_$a com.irobot.home.TrainRobotActivity_$a.a(boolean)>
	//   51  125:invokevirtual   #130 <Method org.androidannotations.api.a.e com.irobot.home.TrainRobotActivity_$a.a()>
	//   52  128:pop             
			return;
	//   53  129:return          
		}
	}

	final boolean a;
	final TroubleshootMapDetailActivity b;

	TroubleshootMapDetailActivity$2(TroubleshootMapDetailActivity troubleshootmapdetailactivity, boolean flag)
	{
		b = troubleshootmapdetailactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TroubleshootMapDetailActivity b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
