// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.a.c;
import com.google.ads.interactivemedia.v3.b.d.a;
import com.google.ads.interactivemedia.v3.b.d.b;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

private static final class m$a extends w
{

	public Enum a(a a1)
		throws IOException
	{
		if(a1.f() == b.i)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #78  <Method b a.f()>
	//*   2    4:getstatic       #84  <Field b b.i>
	//*   3    7:if_acmpne       16
		{
			a1.j();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #87  <Method void a.j()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return (Enum)a.get(((Object) (a1.h())));
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field Map a>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #90  <Method String a.h()>
	//   12   24:invokeinterface #94  <Method Object Map.get(Object)>
	//   13   29:checkcast       #36  <Class Enum>
	//   14   32:areturn         
		}
	}

	public void a(com.google.ads.interactivemedia.v3.b.d.c c1, Enum enum)
		throws IOException
	{
		if(enum == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			enum = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            23
			enum = ((Enum) ((String)b.get(((Object) (enum)))));
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field Map b>
	//    7   13:aload_2         
	//    8   14:invokeinterface #94  <Method Object Map.get(Object)>
	//    9   19:checkcast       #99  <Class String>
	//   10   22:astore_2        
		c1.b(((String) (enum)));
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #104 <Method com.google.ads.interactivemedia.v3.b.d.c com.google.ads.interactivemedia.v3.b.d.c.b(String)>
	//   14   28:pop             
	//   15   29:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #109 <Method Enum a(a)>
	//    3    5:areturn         
	}

	public void write(com.google.ads.interactivemedia.v3.b.d.c c1, Object obj)
		throws IOException
	{
		a(c1, (Enum)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #36  <Class Enum>
	//    4    6:invokevirtual   #113 <Method void a(com.google.ads.interactivemedia.v3.b.d.c, Enum)>
	//    5    9:return          
	}

	private final Map a;
	private final Map b;

	public m$a(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void w()>
		a = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void HashMap()>
	//    6   12:putfield        #24  <Field Map a>
		b = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #21  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #22  <Method void HashMap()>
	//   11   23:putfield        #26  <Field Map b>
		int i;
		int j;
		int k;
		int l;
		String s;
		String s1;
		Enum aenum[];
		Enum enum;
		c c1;
		String as[];
		try
		{
			aenum = (Enum[])class1.getEnumConstants();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #32  <Method Object[] Class.getEnumConstants()>
	//   14   30:checkcast       #34  <Class Enum[]>
	//   15   33:astore          8
			k = aenum.length;
	//   16   35:aload           8
	//   17   37:arraylength     
	//   18   38:istore          4
		}
	//*  19   40:iconst_0        
	//*  20   41:istore_2        
	//*  21   42:iload_2         
	//*  22   43:iload           4
	//*  23   45:icmpge          179
	//*  24   48:aload           8
	//*  25   50:iload_2         
	//*  26   51:aaload          
	//*  27   52:astore          9
	//*  28   54:aload           9
	//*  29   56:invokevirtual   #40  <Method String Enum.name()>
	//*  30   59:astore          6
	//*  31   61:aload_1         
	//*  32   62:aload           6
	//*  33   64:invokevirtual   #44  <Method Field Class.getField(String)>
	//*  34   67:ldc1            #46  <Class c>
	//*  35   69:invokevirtual   #52  <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//*  36   72:checkcast       #46  <Class c>
	//*  37   75:astore          10
	//*  38   77:aload           10
	//*  39   79:ifnull          144
	//*  40   82:aload           10
	//*  41   84:invokeinterface #54  <Method String c.a()>
	//*  42   89:astore          7
	//*  43   91:aload           10
	//*  44   93:invokeinterface #57  <Method String[] c.b()>
	//*  45   98:astore          10
	//*  46  100:aload           10
	//*  47  102:arraylength     
	//*  48  103:istore          5
	//*  49  105:iconst_0        
	//*  50  106:istore_3        
	//*  51  107:aload           7
	//*  52  109:astore          6
	//*  53  111:iload_3         
	//*  54  112:iload           5
	//*  55  114:icmpge          144
	//*  56  117:aload           10
	//*  57  119:iload_3         
	//*  58  120:aaload          
	//*  59  121:astore          6
	//*  60  123:aload_0         
	//*  61  124:getfield        #24  <Field Map a>
	//*  62  127:aload           6
	//*  63  129:aload           9
	//*  64  131:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//*  65  136:pop             
	//*  66  137:iload_3         
	//*  67  138:iconst_1        
	//*  68  139:iadd            
	//*  69  140:istore_3        
	//*  70  141:goto            107
	//*  71  144:aload_0         
	//*  72  145:getfield        #24  <Field Map a>
	//*  73  148:aload           6
	//*  74  150:aload           9
	//*  75  152:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//*  76  157:pop             
	//*  77  158:aload_0         
	//*  78  159:getfield        #26  <Field Map b>
	//*  79  162:aload           9
	//*  80  164:aload           6
	//*  81  166:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//*  82  171:pop             
	//*  83  172:iload_2         
	//*  84  173:iconst_1        
	//*  85  174:iadd            
	//*  86  175:istore_2        
	//*  87  176:goto            42
	//*  88  179:return          
	//*  89  180:new             #65  <Class AssertionError>
	//*  90  183:dup             
	//*  91  184:invokespecial   #66  <Method void AssertionError()>
	//*  92  187:athrow          
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			throw new AssertionError();
		}
		i = 0;
		if(i >= k)
			break; /* Loop/switch isn't completed */
		enum = aenum[i];
		s = enum.name();
		c1 = (c)class1.getField(s).getAnnotation(com/google/ads/interactivemedia/v3/b/a/c);
		if(c1 == null) goto _L2; else goto _L1
_L1:
		s1 = c1.a();
		as = c1.b();
		l = as.length;
		j = 0;
_L3:
		s = s1;
		if(j >= l)
			break; /* Loop/switch isn't completed */
		s = as[j];
		a.put(((Object) (s)), ((Object) (enum)));
		j++;
		if(true) goto _L3; else goto _L2
_L2:
		a.put(((Object) (s)), ((Object) (enum)));
		b.put(((Object) (enum)), ((Object) (s)));
		i++;
		if(true) goto _L5; else goto _L4
_L5:
		break MISSING_BLOCK_LABEL_42;
_L4:
	//*  93  188:astore_1        
	//*  94  189:goto            180
	}
}
