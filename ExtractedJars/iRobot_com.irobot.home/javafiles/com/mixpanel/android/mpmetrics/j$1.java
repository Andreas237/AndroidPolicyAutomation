// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.content.SharedPreferences;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			j, n

class j$1
	implements q$b
{

	public void a(SharedPreferences sharedpreferences)
	{
		sharedpreferences = ((SharedPreferences) (n.a(sharedpreferences)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #26  <Method org.json.JSONArray n.a(SharedPreferences)>
	//    2    4:astore_1        
		if(sharedpreferences != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			j.a(a, ((org.json.JSONArray) (sharedpreferences)));
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field j a>
	//    7   13:aload_1         
	//    8   14:invokestatic    #29  <Method void j.a(j, org.json.JSONArray)>
	//    9   17:return          
	}

	final j a;

	j$1(j j1)
	{
		a = j1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field j a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
