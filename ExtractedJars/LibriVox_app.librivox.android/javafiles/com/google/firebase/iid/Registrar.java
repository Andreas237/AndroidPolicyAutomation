// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.iid;

import com.google.firebase.FirebaseApp;
import com.google.firebase.a.d;
import com.google.firebase.components.a;
import com.google.firebase.components.c;
import com.google.firebase.components.f;
import com.google.firebase.components.g;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.firebase.iid:
//			FirebaseInstanceId, s, t

public final class Registrar
	implements f
{

	public Registrar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final List getComponents()
	{
		return Arrays.asList(((Object []) (new a[] {
			a.a(com/google/firebase/iid/FirebaseInstanceId).a(g.a(com/google/firebase/FirebaseApp)).a(g.a(com/google/firebase/a/d)).a(com.google.firebase.iid.s.a).a().c(), a.a(com/google/firebase/iid/a/a).a(g.a(com/google/firebase/iid/FirebaseInstanceId)).a(com.google.firebase.iid.t.a).c()
		})));
	//    0    0:iconst_2        
	//    1    1:anewarray       a[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #18  <Class FirebaseInstanceId>
	//    5    8:invokestatic    #22  <Method c a.a(Class)>
	//    6   11:ldc1            #24  <Class FirebaseApp>
	//    7   13:invokestatic    #29  <Method g g.a(Class)>
	//    8   16:invokevirtual   #34  <Method c c.a(g)>
	//    9   19:ldc1            #36  <Class d>
	//   10   21:invokestatic    #29  <Method g g.a(Class)>
	//   11   24:invokevirtual   #34  <Method c c.a(g)>
	//   12   27:getstatic       #41  <Field com.google.firebase.components.e com.google.firebase.iid.s.a>
	//   13   30:invokevirtual   #44  <Method c c.a(com.google.firebase.components.e)>
	//   14   33:invokevirtual   #47  <Method c c.a()>
	//   15   36:invokevirtual   #51  <Method a c.c()>
	//   16   39:aastore         
	//   17   40:dup             
	//   18   41:iconst_1        
	//   19   42:ldc1            #53  <Class com.google.firebase.iid.a.a>
	//   20   44:invokestatic    #22  <Method c a.a(Class)>
	//   21   47:ldc1            #18  <Class FirebaseInstanceId>
	//   22   49:invokestatic    #29  <Method g g.a(Class)>
	//   23   52:invokevirtual   #34  <Method c c.a(g)>
	//   24   55:getstatic       #56  <Field com.google.firebase.components.e com.google.firebase.iid.t.a>
	//   25   58:invokevirtual   #44  <Method c c.a(com.google.firebase.components.e)>
	//   26   61:invokevirtual   #51  <Method a c.c()>
	//   27   64:aastore         
	//   28   65:invokestatic    #62  <Method List Arrays.asList(Object[])>
	//   29   68:areturn         
	}
}
