// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.Objects;

public class ObjectsCompat
{
	private static class ImplApi19 extends ImplBase
	{

		public boolean equals(Object obj, Object obj1)
		{
			return Objects.equals(obj, obj1);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #24  <Method boolean Objects.equals(Object, Object)>
		//    3    5:ireturn         
		}

		private ImplApi19()
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #15  <Method void ObjectsCompat$ImplBase(ObjectsCompat$1)>
		//    3    5:return          
		}

	}

	private static class ImplBase
	{

		public boolean equals(Object obj, Object obj1)
		{
			return obj == obj1 || obj != null && obj.equals(obj1);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:if_acmpeq       17
		//    3    5:aload_1         
		//    4    6:ifnull          19
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #19  <Method boolean Object.equals(Object)>
		//    8   14:ifeq            19
		//    9   17:iconst_1        
		//   10   18:ireturn         
		//   11   19:iconst_0        
		//   12   20:ireturn         
		}

		private ImplBase()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}

	}


	private ObjectsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static boolean equals(Object obj, Object obj1)
	{
		return IMPL.equals(obj, obj1);
	//    0    0:getstatic       #28  <Field ObjectsCompat$ImplBase IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method boolean ObjectsCompat$ImplBase.equals(Object, Object)>
	//    4    8:ireturn         
	}

	private static final ImplBase IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          20
			IMPL = ((ImplBase) (new ImplApi19()));
	//    3    8:new             #8   <Class ObjectsCompat$ImplApi19>
	//    4   11:dup             
	//    5   12:aconst_null     
	//    6   13:invokespecial   #26  <Method void ObjectsCompat$ImplApi19(ObjectsCompat$1)>
	//    7   16:putstatic       #28  <Field ObjectsCompat$ImplBase IMPL>
	//    8   19:return          
		else
			IMPL = new ImplBase();
	//    9   20:new             #11  <Class ObjectsCompat$ImplBase>
	//   10   23:dup             
	//   11   24:aconst_null     
	//   12   25:invokespecial   #29  <Method void ObjectsCompat$ImplBase(ObjectsCompat$1)>
	//   13   28:putstatic       #28  <Field ObjectsCompat$ImplBase IMPL>
	//*  14   31:return          
	}
}
