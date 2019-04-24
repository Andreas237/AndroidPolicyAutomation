// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.iid;

import com.google.firebase.b;
import com.google.firebase.components.a;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.firebase.iid:
//			FirebaseInstanceId, r, s

public final class Registrar
	implements d
{
	private static final class a
		implements com.google.firebase.iid.a.a
	{

		private final FirebaseInstanceId a;

		public a(FirebaseInstanceId firebaseinstanceid)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			a = firebaseinstanceid;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field FirebaseInstanceId a>
		//    5    9:return          
		}
	}


	public Registrar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public final List getComponents()
	{
		return Arrays.asList(((Object []) (new com.google.firebase.components.a[] {
			com.google.firebase.components.a.a(com/google/firebase/iid/FirebaseInstanceId).a(e.a(com/google/firebase/b)).a(e.a(com/google/firebase/b/d)).a(com.google.firebase.iid.r.a).a().b(), com.google.firebase.components.a.a(com/google/firebase/iid/a/a).a(e.a(com/google/firebase/iid/FirebaseInstanceId)).a(com.google.firebase.iid.s.a).b()
		})));
	//    0    0:iconst_2        
	//    1    1:anewarray       com.google.firebase.components.a[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #22  <Class FirebaseInstanceId>
	//    5    8:invokestatic    #25  <Method com.google.firebase.components.a$a a.a(Class)>
	//    6   11:ldc1            #27  <Class b>
	//    7   13:invokestatic    #32  <Method e e.a(Class)>
	//    8   16:invokevirtual   #37  <Method com.google.firebase.components.a$a com.google.firebase.components.a$a.a(e)>
	//    9   19:ldc1            #39  <Class com.google.firebase.b.d>
	//   10   21:invokestatic    #32  <Method e e.a(Class)>
	//   11   24:invokevirtual   #37  <Method com.google.firebase.components.a$a com.google.firebase.components.a$a.a(e)>
	//   12   27:getstatic       #44  <Field com.google.firebase.components.c com.google.firebase.iid.r.a>
	//   13   30:invokevirtual   #47  <Method com.google.firebase.components.a$a com.google.firebase.components.a$a.a(com.google.firebase.components.c)>
	//   14   33:invokevirtual   #50  <Method com.google.firebase.components.a$a com.google.firebase.components.a$a.a()>
	//   15   36:invokevirtual   #54  <Method a com.google.firebase.components.a$a.b()>
	//   16   39:aastore         
	//   17   40:dup             
	//   18   41:iconst_1        
	//   19   42:ldc1            #56  <Class com.google.firebase.iid.a.a>
	//   20   44:invokestatic    #25  <Method com.google.firebase.components.a$a a.a(Class)>
	//   21   47:ldc1            #22  <Class FirebaseInstanceId>
	//   22   49:invokestatic    #32  <Method e e.a(Class)>
	//   23   52:invokevirtual   #37  <Method com.google.firebase.components.a$a com.google.firebase.components.a$a.a(e)>
	//   24   55:getstatic       #59  <Field com.google.firebase.components.c com.google.firebase.iid.s.a>
	//   25   58:invokevirtual   #47  <Method com.google.firebase.components.a$a com.google.firebase.components.a$a.a(com.google.firebase.components.c)>
	//   26   61:invokevirtual   #54  <Method a com.google.firebase.components.a$a.b()>
	//   27   64:aastore         
	//   28   65:invokestatic    #65  <Method List Arrays.asList(Object[])>
	//   29   68:areturn         
	}
}
