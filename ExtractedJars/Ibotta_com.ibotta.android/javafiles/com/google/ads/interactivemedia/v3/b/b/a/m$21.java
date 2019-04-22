// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.c.a;
import com.google.ads.interactivemedia.v3.b.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$21
	implements x
{

	public w a(f f, a a1)
	{
		if(a1.a() == a)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #30  <Method Class a.a()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #18  <Field Class a>
	//*   4    8:if_acmpne       16
			return b;
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field w b>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (a.getName())));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Class a>
	//    2    4:invokevirtual   #39  <Method String Class.getName()>
	//    3    7:invokestatic    #45  <Method String String.valueOf(Object)>
	//    4   10:astore_1        
		String s1 = String.valueOf(((Object) (b)));
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field w b>
	//    7   15:invokestatic    #45  <Method String String.valueOf(Object)>
	//    8   18:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 23 + String.valueOf(((Object) (s1))).length());
	//    9   19:new             #47  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokestatic    #45  <Method String String.valueOf(Object)>
	//   13   27:invokevirtual   #51  <Method int String.length()>
	//   14   30:bipush          23
	//   15   32:iadd            
	//   16   33:aload_2         
	//   17   34:invokestatic    #45  <Method String String.valueOf(Object)>
	//   18   37:invokevirtual   #51  <Method int String.length()>
	//   19   40:iadd            
	//   20   41:invokespecial   #54  <Method void StringBuilder(int)>
	//   21   44:astore_3        
		stringbuilder.append("Factory[type=");
	//   22   45:aload_3         
	//   23   46:ldc1            #56  <String "Factory[type=">
	//   24   48:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(s);
	//   26   52:aload_3         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
		stringbuilder.append(",adapter=");
	//   30   58:aload_3         
	//   31   59:ldc1            #62  <String ",adapter=">
	//   32   61:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
		stringbuilder.append(s1);
	//   34   65:aload_3         
	//   35   66:aload_2         
	//   36   67:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   37   70:pop             
		stringbuilder.append("]");
	//   38   71:aload_3         
	//   39   72:ldc1            #64  <String "]">
	//   40   74:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   41   77:pop             
		return stringbuilder.toString();
	//   42   78:aload_3         
	//   43   79:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   44   82:areturn         
	}

	final Class a;
	final w b;

	m$21(Class class1, w w)
	{
		a = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Class a>
		b = w;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field w b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
