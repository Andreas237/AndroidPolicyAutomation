// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.tip.*;

// Referenced classes of package com.pactforcure.app.ui:
//			BaseResourceActivity

public class TipOfTheWeekResourceActivity extends BaseResourceActivity
{

	public TipOfTheWeekResourceActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BaseResourceActivity()>
	//    2    4:return          
	}

	protected int getLayoutId()
	{
		return 0x7f040032;
	//    0    0:ldc1            #12  <Int 0x7f040032>
	//    1    2:ireturn         
	}

	protected String getScreenTitle()
	{
		return Res.getStudySpecificString(0x7f08036d);
	//    0    0:ldc1            #15  <Int 0x7f08036d>
	//    1    2:invokestatic    #21  <Method String Res.getStudySpecificString(int)>
	//    2    5:areturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void BaseResourceActivity.onCreate(Bundle)>
		((NotificationManager)getSystemService("notification")).cancel(0x4c25c70);
	//    3    5:aload_0         
	//    4    6:ldc1            #28  <String "notification">
	//    5    8:invokevirtual   #32  <Method Object getSystemService(String)>
	//    6   11:checkcast       #34  <Class NotificationManager>
	//    7   14:ldc1            #35  <Int 0x4c25c70>
	//    8   16:invokevirtual   #39  <Method void NotificationManager.cancel(int)>
		bundle = ((Bundle) ((RecyclerView)findViewById(0x7f0e0114)));
	//    9   19:aload_0         
	//   10   20:ldc1            #40  <Int 0x7f0e0114>
	//   11   22:invokevirtual   #44  <Method android.view.View findViewById(int)>
	//   12   25:checkcast       #46  <Class RecyclerView>
	//   13   28:astore_1        
		((RecyclerView) (bundle)).setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (new LinearLayoutManager(((android.content.Context) (this))))));
	//   14   29:aload_1         
	//   15   30:new             #48  <Class LinearLayoutManager>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:invokespecial   #51  <Method void LinearLayoutManager(android.content.Context)>
	//   19   38:invokevirtual   #55  <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
		((RecyclerView) (bundle)).setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (new TipOfTheWeekAdapter(TipOfTheWeekContentFetcher.getDeliveredTips()))));
	//   20   41:aload_1         
	//   21   42:new             #57  <Class TipOfTheWeekAdapter>
	//   22   45:dup             
	//   23   46:invokestatic    #63  <Method String[] TipOfTheWeekContentFetcher.getDeliveredTips()>
	//   24   49:invokespecial   #66  <Method void TipOfTheWeekAdapter(String[])>
	//   25   52:invokevirtual   #70  <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
	//   26   55:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void BaseResourceActivity.onResume()>
		TipOfTheWeekStorage.zeroNumberOfUnseenTips();
	//    2    4:invokestatic    #79  <Method void TipOfTheWeekStorage.zeroNumberOfUnseenTips()>
	//    3    7:return          
	}
}
