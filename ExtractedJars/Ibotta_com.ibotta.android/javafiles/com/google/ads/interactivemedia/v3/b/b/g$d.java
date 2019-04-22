// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;


// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			g

static final class g$d
	implements java.util.Entry
{

	public g$d a()
	{
		g$d g$d1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field g$d b>
	//    2    4:astore_1        
		g$d g$d2 = this;
	//    3    5:aload_0         
	//    4    6:astore_2        
		g$d g$d3;
		for(; g$d1 != null; g$d1 = g$d3)
	//*   5    7:aload_1         
	//*   6    8:ifnull          23
		{
			g$d3 = g$d1.b;
	//    7   11:aload_1         
	//    8   12:getfield        #44  <Field g$d b>
	//    9   15:astore_3        
			g$d2 = g$d1;
	//   10   16:aload_1         
	//   11   17:astore_2        
		}

	//   12   18:aload_3         
	//   13   19:astore_1        
	//*  14   20:goto            7
		return g$d2;
	//   15   23:aload_2         
	//   16   24:areturn         
	}

	public g$d b()
	{
		g$d g$d1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field g$d c>
	//    2    4:astore_1        
		g$d g$d2 = this;
	//    3    5:aload_0         
	//    4    6:astore_2        
		g$d g$d3;
		for(; g$d1 != null; g$d1 = g$d3)
	//*   5    7:aload_1         
	//*   6    8:ifnull          23
		{
			g$d3 = g$d1.c;
	//    7   11:aload_1         
	//    8   12:getfield        #47  <Field g$d c>
	//    9   15:astore_3        
			g$d2 = g$d1;
	//   10   16:aload_1         
	//   11   17:astore_2        
		}

	//   12   18:aload_3         
	//   13   19:astore_1        
	//*  14   20:goto            7
		return g$d2;
	//   15   23:aload_2         
	//   16   24:areturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			boolean flag;
label1:
			{
				flag = obj instanceof java.util.Entry;
	//    0    0:aload_1         
	//    1    1:instanceof      #7   <Class java.util.Map$Entry>
	//    2    4:istore_2        
				boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
				if(!flag)
					break label0;
	//    5    7:iload_2         
	//    6    8:ifeq            102
				obj = ((Object) ((java.util.Entry)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #7   <Class java.util.Map$Entry>
	//    9   15:astore_1        
				Object obj1 = f;
	//   10   16:aload_0         
	//   11   17:getfield        #29  <Field Object f>
	//   12   20:astore          4
				if(obj1 == null)
	//*  13   22:aload           4
	//*  14   24:ifnonnull       41
				{
					flag = flag1;
	//   15   27:iload_3         
	//   16   28:istore_2        
					if(((java.util.Entry) (obj)).getKey() != null)
	//*  17   29:aload_1         
	//*  18   30:invokeinterface #53  <Method Object java.util.Map$Entry.getKey()>
	//*  19   35:ifnonnull       100
						break label1;
	//   20   38:goto            57
				} else
				{
					flag = flag1;
	//   21   41:iload_3         
	//   22   42:istore_2        
					if(!obj1.equals(((java.util.Entry) (obj)).getKey()))
						break label1;
	//   23   43:aload           4
	//   24   45:aload_1         
	//   25   46:invokeinterface #53  <Method Object java.util.Map$Entry.getKey()>
	//   26   51:invokevirtual   #55  <Method boolean Object.equals(Object)>
	//   27   54:ifeq            100
				}
				obj1 = g;
	//   28   57:aload_0         
	//   29   58:getfield        #57  <Field Object g>
	//   30   61:astore          4
				if(obj1 == null)
	//*  31   63:aload           4
	//*  32   65:ifnonnull       82
				{
					flag = flag1;
	//   33   68:iload_3         
	//   34   69:istore_2        
					if(((java.util.Entry) (obj)).getValue() != null)
	//*  35   70:aload_1         
	//*  36   71:invokeinterface #60  <Method Object java.util.Map$Entry.getValue()>
	//*  37   76:ifnonnull       100
						break label1;
	//   38   79:goto            98
				} else
				{
					flag = flag1;
	//   39   82:iload_3         
	//   40   83:istore_2        
					if(!obj1.equals(((java.util.Entry) (obj)).getValue()))
						break label1;
	//   41   84:aload           4
	//   42   86:aload_1         
	//   43   87:invokeinterface #60  <Method Object java.util.Map$Entry.getValue()>
	//   44   92:invokevirtual   #55  <Method boolean Object.equals(Object)>
	//   45   95:ifeq            100
				}
				flag = true;
	//   46   98:iconst_1        
	//   47   99:istore_2        
			}
			return flag;
	//   48  100:iload_2         
	//   49  101:ireturn         
		}
		return false;
	//   50  102:iconst_0        
	//   51  103:ireturn         
	}

	public Object getKey()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object f>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object g>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		Object obj = f;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object f>
	//    2    4:astore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i;
		if(obj == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       16
			i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_1        
		else
	//*   9   13:goto            21
			i = obj.hashCode();
	//   10   16:aload_3         
	//   11   17:invokevirtual   #66  <Method int Object.hashCode()>
	//   12   20:istore_1        
		obj = g;
	//   13   21:aload_0         
	//   14   22:getfield        #57  <Field Object g>
	//   15   25:astore_3        
		if(obj != null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       33
	//*  18   30:goto            38
			j = obj.hashCode();
	//   19   33:aload_3         
	//   20   34:invokevirtual   #66  <Method int Object.hashCode()>
	//   21   37:istore_2        
		return i ^ j;
	//   22   38:iload_1         
	//   23   39:iload_2         
	//   24   40:ixor            
	//   25   41:ireturn         
	}

	public Object setValue(Object obj)
	{
		Object obj1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Object g>
	//    2    4:astore_2        
		g = obj;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #57  <Field Object g>
		return obj1;
	//    6   10:aload_2         
	//    7   11:areturn         
	}

	public String toString()
	{
		String s = String.valueOf(f);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object f>
	//    2    4:invokestatic    #77  <Method String String.valueOf(Object)>
	//    3    7:astore_1        
		String s1 = String.valueOf(g);
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field Object g>
	//    6   12:invokestatic    #77  <Method String String.valueOf(Object)>
	//    7   15:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 1 + String.valueOf(((Object) (s1))).length());
	//    8   16:new             #79  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokestatic    #77  <Method String String.valueOf(Object)>
	//   12   24:invokevirtual   #82  <Method int String.length()>
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:aload_2         
	//   16   30:invokestatic    #77  <Method String String.valueOf(Object)>
	//   17   33:invokevirtual   #82  <Method int String.length()>
	//   18   36:iadd            
	//   19   37:invokespecial   #85  <Method void StringBuilder(int)>
	//   20   40:astore_3        
		stringbuilder.append(s);
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
		stringbuilder.append("=");
	//   25   47:aload_3         
	//   26   48:ldc1            #91  <String "=">
	//   27   50:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
		stringbuilder.append(s1);
	//   29   54:aload_3         
	//   30   55:aload_2         
	//   31   56:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
		return stringbuilder.toString();
	//   33   60:aload_3         
	//   34   61:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   35   64:areturn         
	}

	g$d a;
	g$d b;
	g$d c;
	g$d d;
	g$d e;
	final Object f;
	Object g;
	int h;

	g$d()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		f = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #29  <Field Object f>
		e = this;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:putfield        #31  <Field g$d e>
		d = this;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:putfield        #33  <Field g$d d>
	//   11   19:return          
	}

	g$d(g$d g$d1, Object obj, g$d g$d2, g$d g$d3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		a = g$d1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field g$d a>
		f = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Object f>
		h = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #39  <Field int h>
		d = g$d2;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #33  <Field g$d d>
		e = g$d3;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #31  <Field g$d e>
		g$d3.d = this;
	//   17   30:aload           4
	//   18   32:aload_0         
	//   19   33:putfield        #33  <Field g$d d>
		g$d2.e = this;
	//   20   36:aload_3         
	//   21   37:aload_0         
	//   22   38:putfield        #31  <Field g$d e>
	//   23   41:return          
	}
}
