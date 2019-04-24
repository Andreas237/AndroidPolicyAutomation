// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.*;
import com.irobot.home.util.k;
import org.androidannotations.api.b.d;
import org.androidannotations.api.b.g;

// Referenced classes of package com.irobot.home:
//			RoombaHelpTableViewActivity

class RoombaHelpTableViewActivity$1
	implements android.content.r
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		b.t.c().b(((Object) (Integer.valueOf(0))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RoombaHelpTableViewActivity b>
	//    2    4:getfield        #30  <Field k RoombaHelpTableViewActivity.t>
	//    3    7:invokevirtual   #36  <Method g k.c()>
	//    4   10:iconst_0        
	//    5   11:invokestatic    #42  <Method Integer Integer.valueOf(int)>
	//    6   14:invokevirtual   #47  <Method void g.b(Object)>
		b.t.e().b(((Object) (Boolean.valueOf(false))));
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field RoombaHelpTableViewActivity b>
	//    9   21:getfield        #30  <Field k RoombaHelpTableViewActivity.t>
	//   10   24:invokevirtual   #50  <Method d k.e()>
	//   11   27:iconst_0        
	//   12   28:invokestatic    #55  <Method Boolean Boolean.valueOf(boolean)>
	//   13   31:invokevirtual   #58  <Method void d.b(Object)>
		b.t.f().b(((Object) (Boolean.valueOf(false))));
	//   14   34:aload_0         
	//   15   35:getfield        #19  <Field RoombaHelpTableViewActivity b>
	//   16   38:getfield        #30  <Field k RoombaHelpTableViewActivity.t>
	//   17   41:invokevirtual   #61  <Method d k.f()>
	//   18   44:iconst_0        
	//   19   45:invokestatic    #55  <Method Boolean Boolean.valueOf(boolean)>
	//   20   48:invokevirtual   #58  <Method void d.b(Object)>
		b.t.a().n();
	//   21   51:aload_0         
	//   22   52:getfield        #19  <Field RoombaHelpTableViewActivity b>
	//   23   55:getfield        #30  <Field k RoombaHelpTableViewActivity.t>
	//   24   58:invokevirtual   #64  <Method com.irobot.home.util.k$a k.a()>
	//   25   61:invokevirtual   #69  <Method void com.irobot.home.util.k$a.n()>
		dialoginterface.dismiss();
	//   26   64:aload_1         
	//   27   65:invokeinterface #74  <Method void DialogInterface.dismiss()>
		Assembler.getInstance().getPersistenceHandler().writeBool("productTourManualEvacSeen", false);
	//   28   70:invokestatic    #80  <Method Assembler Assembler.getInstance()>
	//   29   73:invokevirtual   #84  <Method PersistenceHandler Assembler.getPersistenceHandler()>
	//   30   76:ldc1            #86  <String "productTourManualEvacSeen">
	//   31   78:iconst_0        
	//   32   79:invokevirtual   #92  <Method void PersistenceHandler.writeBool(String, boolean)>
		Assembler.getInstance().getPersistenceHandler().writeBool("productTourEvacBagMissingSeen", false);
	//   33   82:invokestatic    #80  <Method Assembler Assembler.getInstance()>
	//   34   85:invokevirtual   #84  <Method PersistenceHandler Assembler.getPersistenceHandler()>
	//   35   88:ldc1            #94  <String "productTourEvacBagMissingSeen">
	//   36   90:iconst_0        
	//   37   91:invokevirtual   #92  <Method void PersistenceHandler.writeBool(String, boolean)>
		AnalyticsSubsystem.getInstance().trackReActivateAppOverviewPressed(a);
	//   38   94:invokestatic    #99  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   39   97:aload_0         
	//   40   98:getfield        #21  <Field AssetInfo a>
	//   41  101:invokevirtual   #103 <Method void AnalyticsSubsystem.trackReActivateAppOverviewPressed(AssetInfo)>
	//   42  104:return          
	}

	final AssetInfo a;
	final RoombaHelpTableViewActivity b;

	RoombaHelpTableViewActivity$1(RoombaHelpTableViewActivity roombahelptableviewactivity, AssetInfo assetinfo)
	{
		b = roombahelptableviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RoombaHelpTableViewActivity b>
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
