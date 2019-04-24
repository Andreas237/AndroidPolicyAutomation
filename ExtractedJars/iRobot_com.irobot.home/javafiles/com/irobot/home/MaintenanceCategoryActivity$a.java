// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.b.y;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			MaintenanceCategoryActivity

private final class MaintenanceCategoryActivity$a extends MaintenanceUIServiceDataCallback
{

	public void onMaintenanceUIServiceDataChanged(MaintenanceUIServiceData maintenanceuiservicedata)
	{
		if(maintenanceuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			o.e("MaintCatDetailActiv", "MaintenanceUIServiceData was null.");
	//    2    4:ldc1            #23  <String "MaintCatDetailActiv">
	//    3    6:ldc1            #25  <String "MaintenanceUIServiceData was null.">
	//    4    8:invokestatic    #31  <Method void o.e(String, String)>
			return;
	//    5   11:return          
		}
		Object obj = ((Object) (maintenanceuiservicedata.getViewStateChangelist()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #37  <Method ArrayList MaintenanceUIServiceData.getViewStateChangelist()>
	//    8   16:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #39  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #40  <Method void StringBuilder()>
	//   12   24:astore_3        
		stringbuilder.append("View states: ");
	//   13   25:aload_3         
	//   14   26:ldc1            #42  <String "View states: ">
	//   15   28:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		stringbuilder.append(obj);
	//   17   32:aload_3         
	//   18   33:aload_2         
	//   19   34:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   20   37:pop             
		o.a("MaintCatDetailActiv", stringbuilder.toString());
	//   21   38:ldc1            #23  <String "MaintCatDetailActiv">
	//   22   40:aload_3         
	//   23   41:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   24   44:invokestatic    #55  <Method void o.a(String, String)>
		obj = ((Object) (((ArrayList) (obj)).iterator()));
	//   25   47:aload_2         
	//   26   48:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
	//   27   51:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   28   52:aload_2         
	//   29   53:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   30   58:ifeq            227
			MaintenanceViewState maintenanceviewstate = (MaintenanceViewState)((Iterator) (obj)).next();
	//   31   61:aload_2         
	//   32   62:invokeinterface #71  <Method Object Iterator.next()>
	//   33   67:checkcast       #73  <Class MaintenanceViewState>
	//   34   70:astore_3        
			switch(MaintenanceCategoryActivity$3.b[maintenanceviewstate.ordinal()])
	//*  35   71:getstatic       #79  <Field int[] MaintenanceCategoryActivity$3.b>
	//*  36   74:aload_3         
	//*  37   75:invokevirtual   #83  <Method int MaintenanceViewState.ordinal()>
	//*  38   78:iaload          
			{
	//*  39   79:tableswitch     1 5: default 112
	//	               1 198
	//	               2 179
	//	               3 169
	//	               4 159
	//	               5 149
			default:
				StringBuilder stringbuilder1 = new StringBuilder();
	//   40  112:new             #39  <Class StringBuilder>
	//   41  115:dup             
	//   42  116:invokespecial   #40  <Method void StringBuilder()>
	//   43  119:astore          4
				stringbuilder1.append("Failed to process view state: ");
	//   44  121:aload           4
	//   45  123:ldc1            #85  <String "Failed to process view state: ">
	//   46  125:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   47  128:pop             
				stringbuilder1.append(((Object) (maintenanceviewstate)));
	//   48  129:aload           4
	//   49  131:aload_3         
	//   50  132:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   51  135:pop             
				o.a("MaintCatDetailActiv", stringbuilder1.toString());
	//   52  136:ldc1            #23  <String "MaintCatDetailActiv">
	//   53  138:aload           4
	//   54  140:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   55  143:invokestatic    #55  <Method void o.a(String, String)>
				break;

	//*  56  146:goto            52
			case 5: // '\005'
				a.j();
	//   57  149:aload_0         
	//   58  150:getfield        #12  <Field MaintenanceCategoryActivity a>
	//   59  153:invokevirtual   #88  <Method void MaintenanceCategoryActivity.j()>
				break;

	//*  60  156:goto            52
			case 4: // '\004'
				a.h();
	//   61  159:aload_0         
	//   62  160:getfield        #12  <Field MaintenanceCategoryActivity a>
	//   63  163:invokevirtual   #91  <Method void MaintenanceCategoryActivity.h()>
				break;

	//*  64  166:goto            52
			case 3: // '\003'
				a.k();
	//   65  169:aload_0         
	//   66  170:getfield        #12  <Field MaintenanceCategoryActivity a>
	//   67  173:invokevirtual   #94  <Method void MaintenanceCategoryActivity.k()>
				break;

	//*  68  176:goto            52
			case 2: // '\002'
				MaintenanceCategoryActivity.a(a, true);
	//   69  179:aload_0         
	//   70  180:getfield        #12  <Field MaintenanceCategoryActivity a>
	//   71  183:iconst_1        
	//   72  184:invokestatic    #97  <Method boolean MaintenanceCategoryActivity.a(MaintenanceCategoryActivity, boolean)>
	//   73  187:pop             
				a.i();
	//   74  188:aload_0         
	//   75  189:getfield        #12  <Field MaintenanceCategoryActivity a>
	//   76  192:invokevirtual   #100 <Method void MaintenanceCategoryActivity.i()>
				break;

	//*  77  195:goto            52
			case 1: // '\001'
				MaintenanceCategoryActivity.a(a, maintenanceuiservicedata.getCategoryHelpGuideAddress());
	//   78  198:aload_0         
	//   79  199:getfield        #12  <Field MaintenanceCategoryActivity a>
	//   80  202:aload_1         
	//   81  203:invokevirtual   #103 <Method String MaintenanceUIServiceData.getCategoryHelpGuideAddress()>
	//   82  206:invokestatic    #106 <Method String MaintenanceCategoryActivity.a(MaintenanceCategoryActivity, String)>
	//   83  209:pop             
				a.f.a(maintenanceuiservicedata.getMaintenancePartsForFocusedCategory());
	//   84  210:aload_0         
	//   85  211:getfield        #12  <Field MaintenanceCategoryActivity a>
	//   86  214:getfield        #110 <Field y MaintenanceCategoryActivity.f>
	//   87  217:aload_1         
	//   88  218:invokevirtual   #113 <Method ArrayList MaintenanceUIServiceData.getMaintenancePartsForFocusedCategory()>
	//   89  221:invokevirtual   #118 <Method void y.a(ArrayList)>
				break;
			}
		} while(true);
	//*  90  224:goto            52
	//   91  227:return          
	}

	final MaintenanceCategoryActivity a;

	private MaintenanceCategoryActivity$a(MaintenanceCategoryActivity maintenancecategoryactivity)
	{
		a = maintenancecategoryactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MaintenanceCategoryActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void MaintenanceUIServiceDataCallback()>
	//    5    9:return          
	}

	MaintenanceCategoryActivity$a(MaintenanceCategoryActivity maintenancecategoryactivity, MaintenanceCategoryActivity$1 maintenancecategoryactivity$1)
	{
		this(maintenancecategoryactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void MaintenanceCategoryActivity$a(MaintenanceCategoryActivity)>
	//    3    5:return          
	}
}
