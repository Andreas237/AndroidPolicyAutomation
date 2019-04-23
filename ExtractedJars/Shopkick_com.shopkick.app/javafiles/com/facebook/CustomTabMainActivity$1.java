// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.*;

// Referenced classes of package com.facebook:
//			CustomTabMainActivity

class CustomTabMainActivity$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) (new Intent(((Context) (CustomTabMainActivity.this)), com/facebook/CustomTabMainActivity)));
	//    0    0:new             #23  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field CustomTabMainActivity this$0>
	//    4    8:ldc1            #6   <Class CustomTabMainActivity>
	//    5   10:invokespecial   #26  <Method void Intent(Context, Class)>
	//    6   13:astore_1        
		((Intent) (context)).setAction(CustomTabMainActivity.REFRESH_ACTION);
	//    7   14:aload_1         
	//    8   15:getstatic       #30  <Field String CustomTabMainActivity.REFRESH_ACTION>
	//    9   18:invokevirtual   #34  <Method Intent Intent.setAction(String)>
	//   10   21:pop             
		((Intent) (context)).putExtra(CustomTabMainActivity.EXTRA_URL, intent.getStringExtra(CustomTabMainActivity.EXTRA_URL));
	//   11   22:aload_1         
	//   12   23:getstatic       #37  <Field String CustomTabMainActivity.EXTRA_URL>
	//   13   26:aload_2         
	//   14   27:getstatic       #37  <Field String CustomTabMainActivity.EXTRA_URL>
	//   15   30:invokevirtual   #41  <Method String Intent.getStringExtra(String)>
	//   16   33:invokevirtual   #45  <Method Intent Intent.putExtra(String, String)>
	//   17   36:pop             
		((Intent) (context)).addFlags(0x24000000);
	//   18   37:aload_1         
	//   19   38:ldc1            #46  <Int 0x24000000>
	//   20   40:invokevirtual   #50  <Method Intent Intent.addFlags(int)>
	//   21   43:pop             
		startActivity(((Intent) (context)));
	//   22   44:aload_0         
	//   23   45:getfield        #15  <Field CustomTabMainActivity this$0>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #54  <Method void CustomTabMainActivity.startActivity(Intent)>
	//   26   52:return          
	}

	final CustomTabMainActivity this$0;

	CustomTabMainActivity$1()
	{
		this$0 = CustomTabMainActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CustomTabMainActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
