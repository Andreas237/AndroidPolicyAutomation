// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.c.a;
import com.google.ads.interactivemedia.v3.b.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$24
	implements x
{

	public w a(f f, a a1)
	{
		f = ((f) (a1.a()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #33  <Method Class a.a()>
	//    2    4:astore_1        
		if(f != a && f != b)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #19  <Field Class a>
	//*   6   10:if_acmpeq       26
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #21  <Field Class b>
	//*  10   18:if_acmpne       24
	//*  11   21:goto            26
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		else
			return c;
	//   14   26:aload_0         
	//   15   27:getfield        #23  <Field w c>
	//   16   30:areturn         
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (a.getName())));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Class a>
	//    2    4:invokevirtual   #42  <Method String Class.getName()>
	//    3    7:invokestatic    #48  <Method String String.valueOf(Object)>
	//    4   10:astore_1        
		String s1 = String.valueOf(((Object) (b.getName())));
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field Class b>
	//    7   15:invokevirtual   #42  <Method String Class.getName()>
	//    8   18:invokestatic    #48  <Method String String.valueOf(Object)>
	//    9   21:astore_2        
		String s2 = String.valueOf(((Object) (c)));
	//   10   22:aload_0         
	//   11   23:getfield        #23  <Field w c>
	//   12   26:invokestatic    #48  <Method String String.valueOf(Object)>
	//   13   29:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 24 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length());
	//   14   30:new             #50  <Class StringBuilder>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokestatic    #48  <Method String String.valueOf(Object)>
	//   18   38:invokevirtual   #54  <Method int String.length()>
	//   19   41:bipush          24
	//   20   43:iadd            
	//   21   44:aload_2         
	//   22   45:invokestatic    #48  <Method String String.valueOf(Object)>
	//   23   48:invokevirtual   #54  <Method int String.length()>
	//   24   51:iadd            
	//   25   52:aload_3         
	//   26   53:invokestatic    #48  <Method String String.valueOf(Object)>
	//   27   56:invokevirtual   #54  <Method int String.length()>
	//   28   59:iadd            
	//   29   60:invokespecial   #57  <Method void StringBuilder(int)>
	//   30   63:astore          4
		stringbuilder.append("Factory[type=");
	//   31   65:aload           4
	//   32   67:ldc1            #59  <String "Factory[type=">
	//   33   69:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		stringbuilder.append(s);
	//   35   73:aload           4
	//   36   75:aload_1         
	//   37   76:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
		stringbuilder.append("+");
	//   39   80:aload           4
	//   40   82:ldc1            #65  <String "+">
	//   41   84:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   42   87:pop             
		stringbuilder.append(s1);
	//   43   88:aload           4
	//   44   90:aload_2         
	//   45   91:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   46   94:pop             
		stringbuilder.append(",adapter=");
	//   47   95:aload           4
	//   48   97:ldc1            #67  <String ",adapter=">
	//   49   99:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   50  102:pop             
		stringbuilder.append(s2);
	//   51  103:aload           4
	//   52  105:aload_3         
	//   53  106:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   54  109:pop             
		stringbuilder.append("]");
	//   55  110:aload           4
	//   56  112:ldc1            #69  <String "]">
	//   57  114:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   58  117:pop             
		return stringbuilder.toString();
	//   59  118:aload           4
	//   60  120:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   61  123:areturn         
	}

	final Class a;
	final Class b;
	final w c;

	m$24(Class class1, Class class2, w w)
	{
		a = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Class a>
		b = class2;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Class b>
		c = w;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field w c>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
