// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.util.j;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			RemoveButtonActivity, IRobotApplication

class RemoveButtonActivity$1 extends ApplicationUIServiceDataCallback
{

	public void onApplicationUIServiceDataChanged(ApplicationUIServiceData applicationuiservicedata)
	{
		if(applicationuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Iterator iterator = applicationuiservicedata.getViewStateChangelist().iterator();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method ArrayList ApplicationUIServiceData.getViewStateChangelist()>
	//    5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//    6   12:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   13:aload_2         
	//    8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            162
			ApplicationUIState applicationuistate = (ApplicationUIState)iterator.next();
	//   10   22:aload_2         
	//   11   23:invokeinterface #40  <Method Object Iterator.next()>
	//   12   28:checkcast       #42  <Class ApplicationUIState>
	//   13   31:astore_3        
			switch(RemoveButtonActivity$7.a[applicationuistate.ordinal()])
	//*  14   32:getstatic       #47  <Field int[] RemoveButtonActivity$7.a>
	//*  15   35:aload_3         
	//*  16   36:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
	//*  17   39:iaload          
			{
	//*  18   40:tableswitch     1 6: default 80
	//	               1 152
	//	               2 141
	//	               3 131
	//	               4 103
	//	               5 93
	//	               6 83
	//*  19   80:goto            13
			case 6: // '\006'
				j.a(((android.app.Activity) (a)));
	//   20   83:aload_0         
	//   21   84:getfield        #12  <Field RemoveButtonActivity a>
	//   22   87:invokestatic    #56  <Method void j.a(android.app.Activity)>
				break;

	//*  23   90:goto            13
			case 5: // '\005'
				RemoveButtonActivity.c(a);
	//   24   93:aload_0         
	//   25   94:getfield        #12  <Field RemoveButtonActivity a>
	//   26   97:invokestatic    #59  <Method void RemoveButtonActivity.c(RemoveButtonActivity)>
				break;

	//*  27  100:goto            13
			case 4: // '\004'
				AssetId assetid = applicationuiservicedata.getAssetForRemoval().getAssetId();
	//   28  103:aload_1         
	//   29  104:invokevirtual   #63  <Method AssetInfo ApplicationUIServiceData.getAssetForRemoval()>
	//   30  107:invokevirtual   #69  <Method AssetId AssetInfo.getAssetId()>
	//   31  110:astore_3        
				((IRobotApplication)j.g()).h().c(assetid.getId());
	//   32  111:invokestatic    #73  <Method android.app.Application j.g()>
	//   33  114:checkcast       #75  <Class IRobotApplication>
	//   34  117:invokevirtual   #79  <Method IRobotModel IRobotApplication.h()>
	//   35  120:aload_3         
	//   36  121:invokevirtual   #85  <Method String AssetId.getId()>
	//   37  124:invokevirtual   #90  <Method boolean IRobotModel.c(String)>
	//   38  127:pop             
				break;

	//*  39  128:goto            13
			case 3: // '\003'
				RemoveButtonActivity.b(a);
	//   40  131:aload_0         
	//   41  132:getfield        #12  <Field RemoveButtonActivity a>
	//   42  135:invokestatic    #93  <Method void RemoveButtonActivity.b(RemoveButtonActivity)>
				break;

	//*  43  138:goto            13
			case 2: // '\002'
				RemoveButtonActivity.a(a, true);
	//   44  141:aload_0         
	//   45  142:getfield        #12  <Field RemoveButtonActivity a>
	//   46  145:iconst_1        
	//   47  146:invokestatic    #96  <Method void RemoveButtonActivity.a(RemoveButtonActivity, boolean)>
				break;

	//*  48  149:goto            13
			case 1: // '\001'
				RemoveButtonActivity.a(a);
	//   49  152:aload_0         
	//   50  153:getfield        #12  <Field RemoveButtonActivity a>
	//   51  156:invokestatic    #98  <Method void RemoveButtonActivity.a(RemoveButtonActivity)>
				break;
			}
		} while(true);
	//*  52  159:goto            13
	//   53  162:return          
	}

	final RemoveButtonActivity a;

	RemoveButtonActivity$1(RemoveButtonActivity removebuttonactivity)
	{
		a = removebuttonactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RemoveButtonActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
	//    5    9:return          
	}
}
