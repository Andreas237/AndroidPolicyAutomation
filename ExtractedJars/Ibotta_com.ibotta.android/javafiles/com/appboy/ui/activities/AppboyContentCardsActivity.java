// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.activities;

import android.os.Bundle;

// Referenced classes of package com.appboy.ui.activities:
//			AppboyBaseFragmentActivity

public class AppboyContentCardsActivity extends AppboyBaseFragmentActivity
{

	public AppboyContentCardsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AppboyBaseFragmentActivity()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void AppboyBaseFragmentActivity.onCreate(Bundle)>
		setContentView(com.appboy.ui.R.layout.com_appboy_content_cards_activity);
	//    3    5:aload_0         
	//    4    6:getstatic       #19  <Field int com.appboy.ui.R$layout.com_appboy_content_cards_activity>
	//    5    9:invokevirtual   #23  <Method void setContentView(int)>
	//    6   12:return          
	}
}
