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
//			ResetTableViewActivity, IRobotApplication

class ResetTableViewActivity$1 extends ApplicationUIServiceDataCallback
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
	//    9   19:ifeq            176
			ApplicationUIState applicationuistate = (ApplicationUIState)iterator.next();
	//   10   22:aload_2         
	//   11   23:invokeinterface #40  <Method Object Iterator.next()>
	//   12   28:checkcast       #42  <Class ApplicationUIState>
	//   13   31:astore_3        
			switch(ResetTableViewActivity$7.a[applicationuistate.ordinal()])
	//*  14   32:getstatic       #47  <Field int[] ResetTableViewActivity$7.a>
	//*  15   35:aload_3         
	//*  16   36:invokevirtual   #51  <Method int ApplicationUIState.ordinal()>
	//*  17   39:iaload          
			{
	//*  18   40:tableswitch     1 7: default 84
	//	               1 166
	//	               2 155
	//	               3 145
	//	               4 135
	//	               5 107
	//	               6 97
	//	               7 87
	//*  19   84:goto            13
			case 7: // '\007'
				j.a(((android.app.Activity) (a)));
	//   20   87:aload_0         
	//   21   88:getfield        #12  <Field ResetTableViewActivity a>
	//   22   91:invokestatic    #56  <Method void j.a(android.app.Activity)>
				break;

	//*  23   94:goto            13
			case 6: // '\006'
				ResetTableViewActivity.d(a);
	//   24   97:aload_0         
	//   25   98:getfield        #12  <Field ResetTableViewActivity a>
	//   26  101:invokestatic    #59  <Method void ResetTableViewActivity.d(ResetTableViewActivity)>
				break;

	//*  27  104:goto            13
			case 5: // '\005'
				AssetId assetid = applicationuiservicedata.getAssetForRemoval().getAssetId();
	//   28  107:aload_1         
	//   29  108:invokevirtual   #63  <Method AssetInfo ApplicationUIServiceData.getAssetForRemoval()>
	//   30  111:invokevirtual   #69  <Method AssetId AssetInfo.getAssetId()>
	//   31  114:astore_3        
				((IRobotApplication)j.g()).h().c(assetid.getId());
	//   32  115:invokestatic    #73  <Method android.app.Application j.g()>
	//   33  118:checkcast       #75  <Class IRobotApplication>
	//   34  121:invokevirtual   #79  <Method IRobotModel IRobotApplication.h()>
	//   35  124:aload_3         
	//   36  125:invokevirtual   #85  <Method String AssetId.getId()>
	//   37  128:invokevirtual   #91  <Method boolean IRobotModel.c(String)>
	//   38  131:pop             
				break;

	//*  39  132:goto            13
			case 4: // '\004'
				ResetTableViewActivity.c(a);
	//   40  135:aload_0         
	//   41  136:getfield        #12  <Field ResetTableViewActivity a>
	//   42  139:invokestatic    #93  <Method void ResetTableViewActivity.c(ResetTableViewActivity)>
				break;

	//*  43  142:goto            13
			case 3: // '\003'
				ResetTableViewActivity.b(a);
	//   44  145:aload_0         
	//   45  146:getfield        #12  <Field ResetTableViewActivity a>
	//   46  149:invokestatic    #96  <Method void ResetTableViewActivity.b(ResetTableViewActivity)>
				break;

	//*  47  152:goto            13
			case 2: // '\002'
				ResetTableViewActivity.a(a, true);
	//   48  155:aload_0         
	//   49  156:getfield        #12  <Field ResetTableViewActivity a>
	//   50  159:iconst_1        
	//   51  160:invokestatic    #99  <Method void ResetTableViewActivity.a(ResetTableViewActivity, boolean)>
				break;

	//*  52  163:goto            13
			case 1: // '\001'
				ResetTableViewActivity.a(a);
	//   53  166:aload_0         
	//   54  167:getfield        #12  <Field ResetTableViewActivity a>
	//   55  170:invokestatic    #101 <Method void ResetTableViewActivity.a(ResetTableViewActivity)>
				break;
			}
		} while(true);
	//*  56  173:goto            13
	//   57  176:return          
	}

	final ResetTableViewActivity a;

	ResetTableViewActivity$1(ResetTableViewActivity resettableviewactivity)
	{
		a = resettableviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ResetTableViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void ApplicationUIServiceDataCallback()>
	//    5    9:return          
	}
}
