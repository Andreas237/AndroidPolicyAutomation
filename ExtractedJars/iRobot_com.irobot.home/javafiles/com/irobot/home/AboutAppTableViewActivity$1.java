// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.irobot.core.AnalyticsSubsystem;

// Referenced classes of package com.irobot.home:
//			AboutAppTableViewActivity

class AboutAppTableViewActivity$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		Intent intent = new Intent("android.intent.action.VIEW");
	//    0    0:new             #24  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #29  <Method void Intent(String)>
	//    4    9:astore_2        
		intent.setData(Uri.parse(view.getTag().toString()));
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #35  <Method Object View.getTag()>
	//    8   15:invokevirtual   #39  <Method String Object.toString()>
	//    9   18:invokestatic    #45  <Method Uri Uri.parse(String)>
	//   10   21:invokevirtual   #49  <Method Intent Intent.setData(Uri)>
	//   11   24:pop             
		a.startActivity(intent);
	//   12   25:aload_0         
	//   13   26:getfield        #16  <Field AboutAppTableViewActivity a>
	//   14   29:aload_2         
	//   15   30:invokevirtual   #53  <Method void AboutAppTableViewActivity.startActivity(Intent)>
		AnalyticsSubsystem.getInstance().trackAboutThisAppFollowButtonPressed();
	//   16   33:invokestatic    #59  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   17   36:invokevirtual   #62  <Method void AnalyticsSubsystem.trackAboutThisAppFollowButtonPressed()>
	//   18   39:return          
	}

	final AboutAppTableViewActivity a;

	AboutAppTableViewActivity$1(AboutAppTableViewActivity aboutapptableviewactivity)
	{
		a = aboutapptableviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AboutAppTableViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
