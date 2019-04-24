// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import com.mixpanel.android.a.f;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			j

class j$d$1
	implements j.a
{

	public void a(j j1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #30  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Using existing pushId ");
	//    4    8:aload_2         
	//    5    9:ldc1            #33  <String "Using existing pushId ">
	//    6   11:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(a);
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:getfield        #23  <Field String a>
	//   11   20:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		f.a("MixpanelAPI.API", stringbuilder.toString());
	//   13   24:ldc1            #39  <String "MixpanelAPI.API">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #48  <Method void f.a(String, String)>
		j1.c().c(a);
	//   17   33:aload_1         
	//   18   34:invokevirtual   #52  <Method j$c j.c()>
	//   19   37:aload_0         
	//   20   38:getfield        #23  <Field String a>
	//   21   41:invokeinterface #56  <Method void j$c.c(String)>
	//   22   46:return          
	}

	final String a;
	final j.d b;

	j$d$1(j.d d1, String s)
	{
		b = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field j$d b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
