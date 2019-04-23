// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.a.d;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.components.c;
import com.google.firebase.components.f;
import com.google.firebase.components.g;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.firebase.analytics.connector.internal:
//			a

public class AnalyticsConnectorRegistrar
	implements f
{

	public AnalyticsConnectorRegistrar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public List getComponents()
	{
		return Collections.singletonList(((Object) (com.google.firebase.components.a.a(com/google/firebase/analytics/connector/a).a(g.a(com/google/firebase/FirebaseApp)).a(g.a(android/content/Context)).a(g.a(com/google/firebase/a/d)).a(com.google.firebase.analytics.connector.internal.a.a).b().c())));
	//    0    0:ldc1            #19  <Class a>
	//    1    2:invokestatic    #25  <Method c com.google.firebase.components.a.a(Class)>
	//    2    5:ldc1            #27  <Class FirebaseApp>
	//    3    7:invokestatic    #32  <Method g g.a(Class)>
	//    4   10:invokevirtual   #37  <Method c c.a(g)>
	//    5   13:ldc1            #39  <Class Context>
	//    6   15:invokestatic    #32  <Method g g.a(Class)>
	//    7   18:invokevirtual   #37  <Method c c.a(g)>
	//    8   21:ldc1            #41  <Class d>
	//    9   23:invokestatic    #32  <Method g g.a(Class)>
	//   10   26:invokevirtual   #37  <Method c c.a(g)>
	//   11   29:getstatic       #46  <Field com.google.firebase.components.e com.google.firebase.analytics.connector.internal.a.a>
	//   12   32:invokevirtual   #49  <Method c c.a(com.google.firebase.components.e)>
	//   13   35:invokevirtual   #53  <Method c c.b()>
	//   14   38:invokevirtual   #57  <Method com.google.firebase.components.a c.c()>
	//   15   41:invokestatic    #63  <Method List Collections.singletonList(Object)>
	//   16   44:areturn         
	}
}
