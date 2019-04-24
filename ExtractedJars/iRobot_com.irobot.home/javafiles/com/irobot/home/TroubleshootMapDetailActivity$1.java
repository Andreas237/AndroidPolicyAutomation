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
//			TroubleshootMapDetailActivity, IRobotApplication

class TroubleshootMapDetailActivity$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		o.b(TroubleshootMapDetailActivity.h(), "Attempt to start a new cleaning mission.");
	//    0    0:invokestatic    #26  <Method String TroubleshootMapDetailActivity.h()>
	//    1    3:ldc1            #28  <String "Attempt to start a new cleaning mission.">
	//    2    5:invokestatic    #34  <Method void o.b(String, String)>
		if(a.m == 100)
	//*   3    8:aload_0         
	//*   4    9:getfield        #17  <Field TroubleshootMapDetailActivity a>
	//*   5   12:getfield        #38  <Field int TroubleshootMapDetailActivity.m>
	//*   6   15:bipush          100
	//*   7   17:icmpne          74
		{
			AnalyticsSubsystem.getInstance().trackPMapTroubleshootIncompleteCleanButtonPressed(j.j().a());
	//    8   20:invokestatic    #44  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    9   23:invokestatic    #50  <Method a j.j()>
	//   10   26:invokevirtual   #55  <Method com.irobot.core.AssetInfo a.a()>
	//   11   29:invokevirtual   #59  <Method void AnalyticsSubsystem.trackPMapTroubleshootIncompleteCleanButtonPressed(com.irobot.core.AssetInfo)>
			view = ((View) (MapsUIServiceData.create()));
	//   12   32:invokestatic    #65  <Method MapsUIServiceData MapsUIServiceData.create()>
	//   13   35:astore_1        
			((MapsUIServiceData) (view)).setRunActionCommandType(CommandType.START);
	//   14   36:aload_1         
	//   15   37:getstatic       #71  <Field CommandType CommandType.START>
	//   16   40:invokevirtual   #75  <Method void MapsUIServiceData.setRunActionCommandType(CommandType)>
			((MapsUIServiceData) (view)).setRunActionMapId(a.i.f());
	//   17   43:aload_1         
	//   18   44:aload_0         
	//   19   45:getfield        #17  <Field TroubleshootMapDetailActivity a>
	//   20   48:getfield        #79  <Field IRobotApplication TroubleshootMapDetailActivity.i>
	//   21   51:invokevirtual   #85  <Method com.irobot.core.PersistentMapIdentifier IRobotApplication.f()>
	//   22   54:invokevirtual   #89  <Method void MapsUIServiceData.setRunActionMapId(com.irobot.core.PersistentMapIdentifier)>
			com.irobot.home.TroubleshootMapDetailActivity.a(a).sendCommand(MapsUIServiceCommand.StartOneMoreRunAction, ((MapsUIServiceData) (view)));
	//   23   57:aload_0         
	//   24   58:getfield        #17  <Field TroubleshootMapDetailActivity a>
	//   25   61:invokestatic    #92  <Method MapsUIService com.irobot.home.TroubleshootMapDetailActivity.a(TroubleshootMapDetailActivity)>
	//   26   64:getstatic       #98  <Field MapsUIServiceCommand MapsUIServiceCommand.StartOneMoreRunAction>
	//   27   67:aload_1         
	//   28   68:invokevirtual   #104 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		} else
	//*  29   71:goto            99
		{
			AnalyticsSubsystem.getInstance().trackPMapTroubleshootIncompleteCleanButtonPressed(j.j().a());
	//   30   74:invokestatic    #44  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   31   77:invokestatic    #50  <Method a j.j()>
	//   32   80:invokevirtual   #55  <Method com.irobot.core.AssetInfo a.a()>
	//   33   83:invokevirtual   #59  <Method void AnalyticsSubsystem.trackPMapTroubleshootIncompleteCleanButtonPressed(com.irobot.core.AssetInfo)>
			TroubleshootMapDetailActivity.b(a).sendCommand(CommandType.START);
	//   34   86:aload_0         
	//   35   87:getfield        #17  <Field TroubleshootMapDetailActivity a>
	//   36   90:invokestatic    #107 <Method MissionSubsystem TroubleshootMapDetailActivity.b(TroubleshootMapDetailActivity)>
	//   37   93:getstatic       #71  <Field CommandType CommandType.START>
	//   38   96:invokevirtual   #111 <Method void MissionSubsystem.sendCommand(CommandType)>
		}
		j.a(((android.app.Activity) (a)));
	//   39   99:aload_0         
	//   40  100:getfield        #17  <Field TroubleshootMapDetailActivity a>
	//   41  103:invokestatic    #114 <Method void j.a(android.app.Activity)>
	//   42  106:return          
	}

	final TroubleshootMapDetailActivity a;

	TroubleshootMapDetailActivity$1(TroubleshootMapDetailActivity troubleshootmapdetailactivity)
	{
		a = troubleshootmapdetailactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TroubleshootMapDetailActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
