// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.irobot.core.*;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, j, IRobotApplication, RobotCleanActivity_

public class OneMoreTrainingRunActivity extends BaseFragmentActivity
	implements j.a
{

	public OneMoreTrainingRunActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	void e()
	{
		b(0x7f0f0868);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <Int 0x7f0f0868>
	//    2    3:invokevirtual   #21  <Method void b(int)>
		b = Assembler.getInstance().getMapsUIService(j.k());
	//    3    6:aload_0         
	//    4    7:invokestatic    #27  <Method Assembler Assembler.getInstance()>
	//    5   10:invokestatic    #33  <Method com.irobot.core.AssetId j.k()>
	//    6   13:invokevirtual   #37  <Method MapsUIService Assembler.getMapsUIService(com.irobot.core.AssetId)>
	//    7   16:putfield        #39  <Field MapsUIService b>
		com.irobot.home.j j1 = j.a();
	//    8   19:invokestatic    #44  <Method com.irobot.home.j j.a()>
	//    9   22:astore_1        
		j1.a(((j.a) (this)));
	//   10   23:aload_1         
	//   11   24:aload_0         
	//   12   25:invokevirtual   #47  <Method void j.a(j$a)>
		j1.a(false);
	//   13   28:aload_1         
	//   14   29:iconst_0        
	//   15   30:invokevirtual   #50  <Method void j.a(boolean)>
		FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #54  <Method FragmentManager getSupportFragmentManager()>
	//   18   37:invokevirtual   #60  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   19   40:astore_2        
		fragmenttransaction.add(0x7f09045d, ((android.support.v4.app.Fragment) (j1)));
	//   20   41:aload_2         
	//   21   42:ldc1            #61  <Int 0x7f09045d>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #67  <Method FragmentTransaction FragmentTransaction.add(int, android.support.v4.app.Fragment)>
	//   24   48:pop             
		fragmenttransaction.commit();
	//   25   49:aload_2         
	//   26   50:invokevirtual   #71  <Method int FragmentTransaction.commit()>
	//   27   53:pop             
		getSupportFragmentManager().executePendingTransactions();
	//   28   54:aload_0         
	//   29   55:invokevirtual   #54  <Method FragmentManager getSupportFragmentManager()>
	//   30   58:invokevirtual   #75  <Method boolean FragmentManager.executePendingTransactions()>
	//   31   61:pop             
	//   32   62:return          
	}

	public void f()
	{
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    0    0:invokestatic    #82  <Method MapsUIServiceData MapsUIServiceData.create()>
	//    1    3:astore_1        
		mapsuiservicedata.setRunActionCommandType(CommandType.TRAIN);
	//    2    4:aload_1         
	//    3    5:getstatic       #88  <Field CommandType CommandType.TRAIN>
	//    4    8:invokevirtual   #92  <Method void MapsUIServiceData.setRunActionCommandType(CommandType)>
		mapsuiservicedata.setRunActionMapId(a.f());
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #94  <Field IRobotApplication a>
	//    8   16:invokevirtual   #99  <Method com.irobot.core.PersistentMapIdentifier IRobotApplication.f()>
	//    9   19:invokevirtual   #103 <Method void MapsUIServiceData.setRunActionMapId(com.irobot.core.PersistentMapIdentifier)>
		b.sendCommand(MapsUIServiceCommand.StartOneMoreRunAction, mapsuiservicedata);
	//   10   22:aload_0         
	//   11   23:getfield        #39  <Field MapsUIService b>
	//   12   26:getstatic       #109 <Field MapsUIServiceCommand MapsUIServiceCommand.StartOneMoreRunAction>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #115 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		((RobotCleanActivity_.a)RobotCleanActivity_.a(((android.content.Context) (this))).g(0x4000000)).a();
	//   15   33:aload_0         
	//   16   34:invokestatic    #120 <Method RobotCleanActivity_$a RobotCleanActivity_.a(android.content.Context)>
	//   17   37:ldc1            #121 <Int 0x4000000>
	//   18   39:invokevirtual   #127 <Method org.androidannotations.api.a.d RobotCleanActivity_$a.g(int)>
	//   19   42:checkcast       #123 <Class RobotCleanActivity_$a>
	//   20   45:invokevirtual   #130 <Method org.androidannotations.api.a.e RobotCleanActivity_$a.a()>
	//   21   48:pop             
	//   22   49:return          
	}

	public void g()
	{
		((RobotCleanActivity_.a)RobotCleanActivity_.a(((android.content.Context) (this))).g(0x4000000)).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #120 <Method RobotCleanActivity_$a RobotCleanActivity_.a(android.content.Context)>
	//    2    4:ldc1            #121 <Int 0x4000000>
	//    3    6:invokevirtual   #127 <Method org.androidannotations.api.a.d RobotCleanActivity_$a.g(int)>
	//    4    9:checkcast       #123 <Class RobotCleanActivity_$a>
	//    5   12:invokevirtual   #130 <Method org.androidannotations.api.a.e RobotCleanActivity_$a.a()>
	//    6   15:pop             
	//    7   16:return          
	}

	IRobotApplication a;
	private MapsUIService b;
}
