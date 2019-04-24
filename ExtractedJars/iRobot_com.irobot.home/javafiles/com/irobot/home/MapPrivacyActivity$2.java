// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			MapPrivacyActivity

class MapPrivacyActivity$2
	implements android.content.ckListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		b.a(a ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MapPrivacyActivity b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field boolean a>
	//    4    8:iconst_1        
	//    5    9:ixor            
	//    6   10:invokevirtual   #29  <Method void MapPrivacyActivity.a(boolean)>
	//    7   13:return          
	}

	final boolean a;
	final MapPrivacyActivity b;

	MapPrivacyActivity$2(MapPrivacyActivity mapprivacyactivity, boolean flag)
	{
		b = mapprivacyactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MapPrivacyActivity b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
