// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$17 extends w
{

	public Locale a(a a1)
		throws IOException
	{
		Object obj = ((Object) (a1.f()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method b a.f()>
	//    2    4:astore_2        
		Object obj1 = ((Object) (b.i));
	//    3    5:getstatic       #28  <Field b b.i>
	//    4    8:astore          4
		String s = null;
	//    5   10:aconst_null     
	//    6   11:astore_3        
		if(obj == obj1)
	//*   7   12:aload_2         
	//*   8   13:aload           4
	//*   9   15:if_acmpne       24
		{
			a1.j();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #31  <Method void a.j()>
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		}
		obj1 = ((Object) (new StringTokenizer(a1.h(), "_")));
	//   14   24:new             #33  <Class StringTokenizer>
	//   15   27:dup             
	//   16   28:aload_1         
	//   17   29:invokevirtual   #37  <Method String a.h()>
	//   18   32:ldc1            #39  <String "_">
	//   19   34:invokespecial   #42  <Method void StringTokenizer(String, String)>
	//   20   37:astore          4
		if(((StringTokenizer) (obj1)).hasMoreElements())
	//*  21   39:aload           4
	//*  22   41:invokevirtual   #46  <Method boolean StringTokenizer.hasMoreElements()>
	//*  23   44:ifeq            56
			a1 = ((a) (((StringTokenizer) (obj1)).nextToken()));
	//   24   47:aload           4
	//   25   49:invokevirtual   #49  <Method String StringTokenizer.nextToken()>
	//   26   52:astore_1        
		else
	//*  27   53:goto            58
			a1 = null;
	//   28   56:aconst_null     
	//   29   57:astore_1        
		if(((StringTokenizer) (obj1)).hasMoreElements())
	//*  30   58:aload           4
	//*  31   60:invokevirtual   #46  <Method boolean StringTokenizer.hasMoreElements()>
	//*  32   63:ifeq            75
			obj = ((Object) (((StringTokenizer) (obj1)).nextToken()));
	//   33   66:aload           4
	//   34   68:invokevirtual   #49  <Method String StringTokenizer.nextToken()>
	//   35   71:astore_2        
		else
	//*  36   72:goto            77
			obj = null;
	//   37   75:aconst_null     
	//   38   76:astore_2        
		if(((StringTokenizer) (obj1)).hasMoreElements())
	//*  39   77:aload           4
	//*  40   79:invokevirtual   #46  <Method boolean StringTokenizer.hasMoreElements()>
	//*  41   82:ifeq            91
			s = ((StringTokenizer) (obj1)).nextToken();
	//   42   85:aload           4
	//   43   87:invokevirtual   #49  <Method String StringTokenizer.nextToken()>
	//   44   90:astore_3        
		if(obj == null && s == null)
	//*  45   91:aload_2         
	//*  46   92:ifnonnull       108
	//*  47   95:aload_3         
	//*  48   96:ifnonnull       108
			return new Locale(((String) (a1)));
	//   49   99:new             #51  <Class Locale>
	//   50  102:dup             
	//   51  103:aload_1         
	//   52  104:invokespecial   #54  <Method void Locale(String)>
	//   53  107:areturn         
		if(s == null)
	//*  54  108:aload_3         
	//*  55  109:ifnonnull       122
			return new Locale(((String) (a1)), ((String) (obj)));
	//   56  112:new             #51  <Class Locale>
	//   57  115:dup             
	//   58  116:aload_1         
	//   59  117:aload_2         
	//   60  118:invokespecial   #55  <Method void Locale(String, String)>
	//   61  121:areturn         
		else
			return new Locale(((String) (a1)), ((String) (obj)), s);
	//   62  122:new             #51  <Class Locale>
	//   63  125:dup             
	//   64  126:aload_1         
	//   65  127:aload_2         
	//   66  128:aload_3         
	//   67  129:invokespecial   #58  <Method void Locale(String, String, String)>
	//   68  132:areturn         
	}

	public void a(c c1, Locale locale)
		throws IOException
	{
		if(locale == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			locale = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			locale = ((Locale) (locale.toString()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #63  <Method String Locale.toString()>
	//    7   13:astore_2        
		c1.b(((String) (locale)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #69  <Method c c.b(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #73  <Method Locale a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (Locale)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #51  <Class Locale>
	//    4    6:invokevirtual   #77  <Method void a(c, Locale)>
	//    5    9:return          
	}

	m$17()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
