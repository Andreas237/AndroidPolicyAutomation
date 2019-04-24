// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.fragments.be;
import com.irobot.home.model.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity, VideoHelpActivity_

class RobotCleanActivity$5
	implements com.irobot.home.m.b.a
{

	public void a(boolean flag)
	{
	//    0    0:return          
	}

	public void b(boolean flag)
	{
		boolean flag1 = Assembler.getInstance().getPersistenceHandler().readBool("productTourEvacBagMissingSeen", false);
	//    0    0:invokestatic    #26  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #30  <Method PersistenceHandler Assembler.getPersistenceHandler()>
	//    2    6:ldc1            #32  <String "productTourEvacBagMissingSeen">
	//    3    8:iconst_0        
	//    4    9:invokevirtual   #38  <Method boolean PersistenceHandler.readBool(String, boolean)>
	//    5   12:istore_2        
		if("Error 350".equals(((Object) (RobotCleanActivity.d(a).M()))) && flag && !flag1)
	//*   6   13:ldc1            #40  <String "Error 350">
	//*   7   15:aload_0         
	//*   8   16:getfield        #14  <Field RobotCleanActivity a>
	//*   9   19:invokestatic    #44  <Method be RobotCleanActivity.d(RobotCleanActivity)>
	//*  10   22:invokevirtual   #50  <Method String be.M()>
	//*  11   25:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  12   28:ifeq            100
	//*  13   31:iload_1         
	//*  14   32:ifeq            100
	//*  15   35:iload_2         
	//*  16   36:ifne            100
		{
			com.irobot.home.VideoHelpActivity_.a(((android.content.Context) (a))).b(0x7f0f00aa).c(0x7f0e0214).a(false).a(j.b(0x7f030000, a.getResources())).c(true).a();
	//   17   39:aload_0         
	//   18   40:getfield        #14  <Field RobotCleanActivity a>
	//   19   43:invokestatic    #61  <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_.a(android.content.Context)>
	//   20   46:ldc1            #62  <Int 0x7f0f00aa>
	//   21   48:invokevirtual   #67  <Method VideoHelpActivity_$a VideoHelpActivity_$a.b(int)>
	//   22   51:ldc1            #68  <Int 0x7f0e0214>
	//   23   53:invokevirtual   #71  <Method VideoHelpActivity_$a VideoHelpActivity_$a.c(int)>
	//   24   56:iconst_0        
	//   25   57:invokevirtual   #74  <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_$a.a(boolean)>
	//   26   60:ldc1            #75  <Int 0x7f030000>
	//   27   62:aload_0         
	//   28   63:getfield        #14  <Field RobotCleanActivity a>
	//   29   66:invokevirtual   #79  <Method android.content.res.Resources RobotCleanActivity.getResources()>
	//   30   69:invokestatic    #84  <Method java.util.ArrayList j.b(int, android.content.res.Resources)>
	//   31   72:invokevirtual   #87  <Method VideoHelpActivity_$a com.irobot.home.VideoHelpActivity_$a.a(java.util.ArrayList)>
	//   32   75:iconst_1        
	//   33   76:invokevirtual   #89  <Method VideoHelpActivity_$a VideoHelpActivity_$a.c(boolean)>
	//   34   79:invokevirtual   #92  <Method org.androidannotations.api.a.e com.irobot.home.VideoHelpActivity_$a.a()>
	//   35   82:pop             
			com.irobot.core.AssetInfo assetinfo = j.j().a();
	//   36   83:invokestatic    #96  <Method a j.j()>
	//   37   86:invokevirtual   #101 <Method com.irobot.core.AssetInfo a.a()>
	//   38   89:astore_3        
			AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.EvacDockBagMissingHelpContent, assetinfo);
	//   39   90:invokestatic    #106 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   40   93:getstatic       #112 <Field ViewId ViewId.EvacDockBagMissingHelpContent>
	//   41   96:aload_3         
	//   42   97:invokevirtual   #116 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
		}
	//   43  100:return          
	}

	final RobotCleanActivity a;

	RobotCleanActivity$5(RobotCleanActivity robotcleanactivity)
	{
		a = robotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field RobotCleanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
