// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.perf.component;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.a;
import com.google.firebase.components.c;
import com.google.firebase.components.f;
import com.google.firebase.components.g;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.firebase.perf.component:
//			a

public class FirebasePerfRegistrar
	implements f
{

	public FirebasePerfRegistrar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public List getComponents()
	{
		return Arrays.asList(((Object []) (new a[] {
			a.a(com/google/firebase/perf/a).a(g.a(com/google/firebase/FirebaseApp)).a(com.google.firebase.perf.component.a.a).c()
		})));
	//    0    0:iconst_1        
	//    1    1:anewarray       a[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #18  <Class com.google.firebase.perf.a>
	//    5    8:invokestatic    #22  <Method c a.a(Class)>
	//    6   11:ldc1            #24  <Class FirebaseApp>
	//    7   13:invokestatic    #29  <Method g g.a(Class)>
	//    8   16:invokevirtual   #34  <Method c c.a(g)>
	//    9   19:getstatic       #39  <Field com.google.firebase.components.e com.google.firebase.perf.component.a.a>
	//   10   22:invokevirtual   #42  <Method c c.a(com.google.firebase.components.e)>
	//   11   25:invokevirtual   #46  <Method a c.c()>
	//   12   28:aastore         
	//   13   29:invokestatic    #52  <Method List Arrays.asList(Object[])>
	//   14   32:areturn         
	}
}
