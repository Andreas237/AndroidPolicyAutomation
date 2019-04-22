// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.c.a;
import com.google.ads.interactivemedia.v3.b.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$19
	implements x
{

	public w a(f f, a a1)
	{
		a1 = ((a) (a1.a()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #20  <Method Class a.a()>
	//    2    4:astore_2        
		if(((Class) (java/lang/Enum)).isAssignableFrom(((Class) (a1))) && a1 != java/lang/Enum)
	//*   3    5:ldc1            #22  <Class Enum>
	//*   4    7:aload_2         
	//*   5    8:invokevirtual   #28  <Method boolean Class.isAssignableFrom(Class)>
	//*   6   11:ifeq            46
	//*   7   14:aload_2         
	//*   8   15:ldc1            #22  <Class Enum>
	//*   9   17:if_acmpne       23
	//*  10   20:goto            46
		{
			f = ((f) (a1));
	//   11   23:aload_2         
	//   12   24:astore_1        
			if(!((Class) (a1)).isEnum())
	//*  13   25:aload_2         
	//*  14   26:invokevirtual   #32  <Method boolean Class.isEnum()>
	//*  15   29:ifne            37
				f = ((f) (((Class) (a1)).getSuperclass()));
	//   16   32:aload_2         
	//   17   33:invokevirtual   #35  <Method Class Class.getSuperclass()>
	//   18   36:astore_1        
			return ((w) (new m.a(((Class) (f)))));
	//   19   37:new             #37  <Class m$a>
	//   20   40:dup             
	//   21   41:aload_1         
	//   22   42:invokespecial   #40  <Method void m$a(Class)>
	//   23   45:areturn         
		} else
		{
			return null;
	//   24   46:aconst_null     
	//   25   47:areturn         
		}
	}

	m$19()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
