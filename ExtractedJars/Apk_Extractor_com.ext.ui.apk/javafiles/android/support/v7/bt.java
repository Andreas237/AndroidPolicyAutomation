// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.util.Iterator;
import java.util.WeakHashMap;

public class bt
	implements Iterable
{
	static class a extends e
	{

		c a(c c1)
		{
			return c1.c;
		//    0    0:aload_1         
		//    1    1:getfield        #22  <Field bt$c bt$c.c>
		//    2    4:areturn         
		}

		a(c c1, c c2)
		{
			super(c1, c2);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void bt$e(bt$c, bt$c)>
		//    4    6:return          
		}
	}

	private static class b extends e
	{

		c a(c c1)
		{
			return c1.d;
		//    0    0:aload_1         
		//    1    1:getfield        #23  <Field bt$c bt$c.d>
		//    2    4:areturn         
		}

		b(c c1, c c2)
		{
			super(c1, c2);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void bt$e(bt$c, bt$c)>
		//    4    6:return          
		}
	}

	static class c
		implements java.util.Map.Entry
	{

		public boolean equals(Object obj)
		{
			if(obj != this)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:if_acmpne       7
		//*   3    5:iconst_1        
		//*   4    6:ireturn         
			{
				if(!(obj instanceof c))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class bt$c>
		//*   7   11:ifne            16
					return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
				obj = ((Object) ((c)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class bt$c>
		//   12   20:astore_1        
				if(!a.equals(((c) (obj)).a) || !b.equals(((c) (obj)).b))
		//*  13   21:aload_0         
		//*  14   22:getfield        #23  <Field Object a>
		//*  15   25:aload_1         
		//*  16   26:getfield        #23  <Field Object a>
		//*  17   29:invokevirtual   #25  <Method boolean Object.equals(Object)>
		//*  18   32:ifeq            49
		//*  19   35:aload_0         
		//*  20   36:getfield        #27  <Field Object b>
		//*  21   39:aload_1         
		//*  22   40:getfield        #27  <Field Object b>
		//*  23   43:invokevirtual   #25  <Method boolean Object.equals(Object)>
		//*  24   46:ifne            5
					return false;
		//   25   49:iconst_0        
		//   26   50:ireturn         
			}
			return true;
		}

		public Object getKey()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Object a>
		//    2    4:areturn         
		}

		public Object getValue()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Object b>
		//    2    4:areturn         
		}

		public Object setValue(Object obj)
		{
			throw new UnsupportedOperationException("An entry modification is not supported");
		//    0    0:new             #39  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #41  <String "An entry modification is not supported">
		//    3    6:invokespecial   #45  <Method void UnsupportedOperationException(String)>
		//    4    9:athrow          
		}

		public String toString()
		{
			return (new StringBuilder()).append(a).append("=").append(b).toString();
		//    0    0:new             #50  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #53  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field Object a>
		//    5   11:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
		//    6   14:ldc1            #59  <String "=">
		//    7   16:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:aload_0         
		//    9   20:getfield        #27  <Field Object b>
		//   10   23:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
		//   11   26:invokevirtual   #64  <Method String StringBuilder.toString()>
		//   12   29:areturn         
		}

		final Object a;
		final Object b;
		c c;
		c d;
	}

	private class d
		implements Iterator
	{

		public java.util.Map.Entry a()
		{
			if(c)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field boolean c>
		//*   2    4:ifeq            28
			{
				c = false;
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:putfield        #26  <Field boolean c>
				b = bt.a(a);
		//    6   12:aload_0         
		//    7   13:aload_0         
		//    8   14:getfield        #21  <Field bt a>
		//    9   17:invokestatic    #34  <Method bt$c bt.a(bt)>
		//   10   20:putfield        #36  <Field bt$c b>
			} else
		//*  11   23:aload_0         
		//*  12   24:getfield        #36  <Field bt$c b>
		//*  13   27:areturn         
			{
				c c1;
				if(b != null)
		//*  14   28:aload_0         
		//*  15   29:getfield        #36  <Field bt$c b>
		//*  16   32:ifnull          51
					c1 = b.c;
		//   17   35:aload_0         
		//   18   36:getfield        #36  <Field bt$c b>
		//   19   39:getfield        #40  <Field bt$c bt$c.c>
		//   20   42:astore_1        
				else
		//*  21   43:aload_0         
		//*  22   44:aload_1         
		//*  23   45:putfield        #36  <Field bt$c b>
		//*  24   48:goto            23
					c1 = null;
		//   25   51:aconst_null     
		//   26   52:astore_1        
				b = c1;
			}
			return ((java.util.Map.Entry) (b));
		//*  27   53:goto            43
		}

		public boolean hasNext()
		{
			if(!c) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field boolean c>
		//    2    4:ifeq            21
_L1:
			if(bt.a(a) == null) goto _L4; else goto _L3
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field bt a>
		//    5   11:invokestatic    #34  <Method bt$c bt.a(bt)>
		//    6   14:ifnull          19
_L3:
			return true;
		//    7   17:iconst_1        
		//    8   18:ireturn         
_L4:
			return false;
		//    9   19:iconst_0        
		//   10   20:ireturn         
_L2:
			if(b == null || b.c == null)
		//*  11   21:aload_0         
		//*  12   22:getfield        #36  <Field bt$c b>
		//*  13   25:ifnull          38
		//*  14   28:aload_0         
		//*  15   29:getfield        #36  <Field bt$c b>
		//*  16   32:getfield        #40  <Field bt$c bt$c.c>
		//*  17   35:ifnonnull       17
				return false;
		//   18   38:iconst_0        
		//   19   39:ireturn         
			if(true) goto _L3; else goto _L5
_L5:
		}

		public Object next()
		{
			return ((Object) (a()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #48  <Method java.util.Map$Entry a()>
		//    2    4:areturn         
		}

		final bt a;
		private c b;
		private boolean c;

		private d()
		{
			a = bt.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field bt a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			c = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #26  <Field boolean c>
		//    8   14:return          
		}

	}

	private static abstract class e
		implements Iterator
	{

		private c b()
		{
			if(b == a || a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field bt$c b>
		//*   2    4:aload_0         
		//*   3    5:getfield        #21  <Field bt$c a>
		//*   4    8:if_acmpeq       18
		//*   5   11:aload_0         
		//*   6   12:getfield        #21  <Field bt$c a>
		//*   7   15:ifnonnull       20
				return null;
		//    8   18:aconst_null     
		//    9   19:areturn         
			else
				return a(b);
		//   10   20:aload_0         
		//   11   21:aload_0         
		//   12   22:getfield        #23  <Field bt$c b>
		//   13   25:invokevirtual   #30  <Method bt$c a(bt$c)>
		//   14   28:areturn         
		}

		abstract c a(c c1);

		public java.util.Map.Entry a()
		{
			c c1 = b;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field bt$c b>
		//    2    4:astore_1        
			b = b();
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:invokespecial   #34  <Method bt$c b()>
		//    6   10:putfield        #23  <Field bt$c b>
			return ((java.util.Map.Entry) (c1));
		//    7   13:aload_1         
		//    8   14:areturn         
		}

		public boolean hasNext()
		{
			return b != null;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field bt$c b>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public Object next()
		{
			return ((Object) (a()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #41  <Method java.util.Map$Entry a()>
		//    2    4:areturn         
		}

		c a;
		c b;

		e(c c1, c c2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			a = c2;
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:putfield        #21  <Field bt$c a>
			b = c1;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #23  <Field bt$c b>
		//    8   14:return          
		}
	}


	public bt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		c = new WeakHashMap();
	//    2    4:aload_0         
	//    3    5:new             #39  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void WeakHashMap()>
	//    6   12:putfield        #42  <Field WeakHashMap c>
		d = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #44  <Field int d>
	//   10   20:return          
	}

	static c a(bt bt1)
	{
		return bt1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field bt$c a>
	//    2    4:areturn         
	}

	public int a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int d>
	//    2    4:ireturn         
	}

	public Iterator b()
	{
		b b1 = new b(b, a);
	//    0    0:new             #14  <Class bt$b>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field bt$c b>
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field bt$c a>
	//    6   12:invokespecial   #55  <Method void bt$b(bt$c, bt$c)>
	//    7   15:astore_1        
		c.put(((Object) (b1)), ((Object) (Boolean.valueOf(false))));
	//    8   16:aload_0         
	//    9   17:getfield        #42  <Field WeakHashMap c>
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:invokestatic    #61  <Method Boolean Boolean.valueOf(boolean)>
	//   13   25:invokevirtual   #65  <Method Object WeakHashMap.put(Object, Object)>
	//   14   28:pop             
		return ((Iterator) (b1));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public d c()
	{
		d d1 = new d();
	//    0    0:new             #20  <Class bt$d>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #71  <Method void bt$d(bt, bt$1)>
	//    5    9:astore_1        
		c.put(((Object) (d1)), ((Object) (Boolean.valueOf(false))));
	//    6   10:aload_0         
	//    7   11:getfield        #42  <Field WeakHashMap c>
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:invokestatic    #61  <Method Boolean Boolean.valueOf(boolean)>
	//   11   19:invokevirtual   #65  <Method Object WeakHashMap.put(Object, Object)>
	//   12   22:pop             
		return d1;
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	public java.util.Map.Entry d()
	{
		return ((java.util.Map.Entry) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field bt$c a>
	//    2    4:areturn         
	}

	public java.util.Map.Entry e()
	{
		return ((java.util.Map.Entry) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field bt$c b>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(obj != this) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:if_acmpne       11
_L1:
		boolean flag = true;
	//    5    7:iconst_1        
	//    6    8:istore_2        
_L4:
		return flag;
	//    7    9:iload_2         
	//    8   10:ireturn         
_L2:
		flag = flag2;
	//    9   11:iload_3         
	//   10   12:istore_2        
		if(!(obj instanceof bt)) goto _L4; else goto _L3
	//   11   13:aload_1         
	//   12   14:instanceof      #2   <Class bt>
	//   13   17:ifeq            9
_L3:
		Object obj1;
		obj1 = ((Object) ((bt)obj));
	//   14   20:aload_1         
	//   15   21:checkcast       #2   <Class bt>
	//   16   24:astore          4
		flag = flag2;
	//   17   26:iload_3         
	//   18   27:istore_2        
		if(a() != ((bt) (obj1)).a()) goto _L4; else goto _L5
	//   19   28:aload_0         
	//   20   29:invokevirtual   #78  <Method int a()>
	//   21   32:aload           4
	//   22   34:invokevirtual   #78  <Method int a()>
	//   23   37:icmpne          9
_L5:
		obj = ((Object) (iterator()));
	//   24   40:aload_0         
	//   25   41:invokevirtual   #81  <Method Iterator iterator()>
	//   26   44:astore_1        
		obj1 = ((Object) (((bt) (obj1)).iterator()));
	//   27   45:aload           4
	//   28   47:invokevirtual   #81  <Method Iterator iterator()>
	//   29   50:astore          4
_L8:
		java.util.Map.Entry entry;
		Object obj2;
		if(!((Iterator) (obj)).hasNext() || !((Iterator) (obj1)).hasNext())
			break MISSING_BLOCK_LABEL_122;
	//   30   52:aload_1         
	//   31   53:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   32   58:ifeq            122
	//   33   61:aload           4
	//   34   63:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   35   68:ifeq            122
		entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   36   71:aload_1         
	//   37   72:invokeinterface #91  <Method Object Iterator.next()>
	//   38   77:checkcast       #93  <Class java.util.Map$Entry>
	//   39   80:astore          5
		obj2 = ((Iterator) (obj1)).next();
	//   40   82:aload           4
	//   41   84:invokeinterface #91  <Method Object Iterator.next()>
	//   42   89:astore          6
		if(entry != null)
			break; /* Loop/switch isn't completed */
	//   43   91:aload           5
	//   44   93:ifnonnull       103
		flag = flag2;
	//   45   96:iload_3         
	//   46   97:istore_2        
		if(obj2 != null) goto _L4; else goto _L6
	//   47   98:aload           6
	//   48  100:ifnonnull       9
_L6:
		if(entry == null || entry.equals(obj2)) goto _L8; else goto _L7
	//   49  103:aload           5
	//   50  105:ifnull          52
	//   51  108:aload           5
	//   52  110:aload           6
	//   53  112:invokeinterface #95  <Method boolean java.util.Map$Entry.equals(Object)>
	//   54  117:ifne            52
_L7:
		return false;
	//   55  120:iconst_0        
	//   56  121:ireturn         
		boolean flag1;
		if(!((Iterator) (obj)).hasNext() && !((Iterator) (obj1)).hasNext())
	//*  57  122:aload_1         
	//*  58  123:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//*  59  128:ifne            145
	//*  60  131:aload           4
	//*  61  133:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//*  62  138:ifne            145
			flag1 = true;
	//   63  141:iconst_1        
	//   64  142:istore_2        
		else
	//*  65  143:iload_2         
	//*  66  144:ireturn         
			flag1 = false;
	//   67  145:iconst_0        
	//   68  146:istore_2        
		return flag1;
	//*  69  147:goto            143
	}

	public Iterator iterator()
	{
		a a1 = new a(a, b);
	//    0    0:new             #11  <Class bt$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field bt$c a>
	//    4    8:aload_0         
	//    5    9:getfield        #52  <Field bt$c b>
	//    6   12:invokespecial   #97  <Method void bt$a(bt$c, bt$c)>
	//    7   15:astore_1        
		c.put(((Object) (a1)), ((Object) (Boolean.valueOf(false))));
	//    8   16:aload_0         
	//    9   17:getfield        #42  <Field WeakHashMap c>
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:invokestatic    #61  <Method Boolean Boolean.valueOf(boolean)>
	//   13   25:invokevirtual   #65  <Method Object WeakHashMap.put(Object, Object)>
	//   14   28:pop             
		return ((Iterator) (a1));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #102 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[");
	//    4    8:aload_1         
	//    5    9:ldc1            #105 <String "[">
	//    6   11:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		Iterator iterator1 = iterator();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #81  <Method Iterator iterator()>
	//   10   19:astore_2        
		do
		{
			if(!iterator1.hasNext())
				break;
	//   11   20:aload_2         
	//   12   21:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   13   26:ifeq            65
			stringbuilder.append(((Object) ((java.util.Map.Entry)iterator1.next())).toString());
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:invokeinterface #91  <Method Object Iterator.next()>
	//   17   36:checkcast       #93  <Class java.util.Map$Entry>
	//   18   39:invokevirtual   #111 <Method String Object.toString()>
	//   19   42:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:pop             
			if(iterator1.hasNext())
	//*  21   46:aload_2         
	//*  22   47:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//*  23   52:ifeq            20
				stringbuilder.append(", ");
	//   24   55:aload_1         
	//   25   56:ldc1            #113 <String ", ">
	//   26   58:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   27   61:pop             
		} while(true);
	//   28   62:goto            20
		stringbuilder.append("]");
	//   29   65:aload_1         
	//   30   66:ldc1            #115 <String "]">
	//   31   68:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   32   71:pop             
		return stringbuilder.toString();
	//   33   72:aload_1         
	//   34   73:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   35   76:areturn         
	}

	private c a;
	private c b;
	private WeakHashMap c;
	private int d;
}
