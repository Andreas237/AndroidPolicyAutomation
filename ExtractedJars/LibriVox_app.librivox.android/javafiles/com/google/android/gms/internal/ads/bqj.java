// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqx, brg, bqv, wx, 
//			wi, xa

public final class bqj
{

	public bqj(int i1, int j1, int k1, int l1, int i2, int j2, int k2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Object()>
	//    6   12:putfield        #35  <Field Object f>
		g = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #37  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #38  <Method void ArrayList()>
	//   11   23:putfield        #40  <Field ArrayList g>
		h = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #37  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #38  <Method void ArrayList()>
	//   16   34:putfield        #42  <Field ArrayList h>
		i = new ArrayList();
	//   17   37:aload_0         
	//   18   38:new             #37  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #38  <Method void ArrayList()>
	//   21   45:putfield        #44  <Field ArrayList i>
		j = 0;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #46  <Field int j>
		k = 0;
	//   25   53:aload_0         
	//   26   54:iconst_0        
	//   27   55:putfield        #48  <Field int k>
		l = 0;
	//   28   58:aload_0         
	//   29   59:iconst_0        
	//   30   60:putfield        #50  <Field int l>
		n = "";
	//   31   63:aload_0         
	//   32   64:ldc1            #52  <String "">
	//   33   66:putfield        #54  <Field String n>
		o = "";
	//   34   69:aload_0         
	//   35   70:ldc1            #52  <String "">
	//   36   72:putfield        #56  <Field String o>
		p = "";
	//   37   75:aload_0         
	//   38   76:ldc1            #52  <String "">
	//   39   78:putfield        #58  <Field String p>
		a = i1;
	//   40   81:aload_0         
	//   41   82:iload_1         
	//   42   83:putfield        #60  <Field int a>
		b = j1;
	//   43   86:aload_0         
	//   44   87:iload_2         
	//   45   88:putfield        #62  <Field int b>
		c = k1;
	//   46   91:aload_0         
	//   47   92:iload_3         
	//   48   93:putfield        #64  <Field int c>
		d = new bqx(l1);
	//   49   96:aload_0         
	//   50   97:new             #66  <Class bqx>
	//   51  100:dup             
	//   52  101:iload           4
	//   53  103:invokespecial   #69  <Method void bqx(int)>
	//   54  106:putfield        #71  <Field bqx d>
		e = new brg(i2, j2, k2);
	//   55  109:aload_0         
	//   56  110:new             #73  <Class brg>
	//   57  113:dup             
	//   58  114:iload           5
	//   59  116:iload           6
	//   60  118:iload           7
	//   61  120:invokespecial   #76  <Method void brg(int, int, int)>
	//   62  123:putfield        #78  <Field brg e>
	//   63  126:return          
	}

	private static String a(ArrayList arraylist, int i1)
	{
		if(arraylist.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #84  <Method boolean ArrayList.isEmpty()>
	//*   2    4:ifeq            10
			return "";
	//    3    7:ldc1            #52  <String "">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #86  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #87  <Method void StringBuilder()>
	//    8   17:astore_3        
		arraylist = (ArrayList)arraylist;
	//    9   18:aload_0         
	//   10   19:checkcast       #37  <Class ArrayList>
	//   11   22:astore_0        
		int j1 = arraylist.size();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #91  <Method int ArrayList.size()>
	//   14   27:istore_2        
		i1 = 0;
	//   15   28:iconst_0        
	//   16   29:istore_1        
		do
		{
			if(i1 >= j1)
				break;
	//   17   30:iload_1         
	//   18   31:iload_2         
	//   19   32:icmpge          72
			Object obj = arraylist.get(i1);
	//   20   35:aload_0         
	//   21   36:iload_1         
	//   22   37:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//   23   40:astore          4
			i1++;
	//   24   42:iload_1         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_1        
			stringbuilder.append((String)obj);
	//   28   46:aload_3         
	//   29   47:aload           4
	//   30   49:checkcast       #97  <Class String>
	//   31   52:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   32   55:pop             
			stringbuilder.append(' ');
	//   33   56:aload_3         
	//   34   57:bipush          32
	//   35   59:invokevirtual   #104 <Method StringBuilder StringBuilder.append(char)>
	//   36   62:pop             
		} while(stringbuilder.length() <= 100);
	//   37   63:aload_3         
	//   38   64:invokevirtual   #107 <Method int StringBuilder.length()>
	//   39   67:bipush          100
	//   40   69:icmple          30
		stringbuilder.deleteCharAt(stringbuilder.length() - 1);
	//   41   72:aload_3         
	//   42   73:aload_3         
	//   43   74:invokevirtual   #107 <Method int StringBuilder.length()>
	//   44   77:iconst_1        
	//   45   78:isub            
	//   46   79:invokevirtual   #111 <Method StringBuilder StringBuilder.deleteCharAt(int)>
	//   47   82:pop             
		arraylist = ((ArrayList) (stringbuilder.toString()));
	//   48   83:aload_3         
	//   49   84:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   50   87:astore_0        
		if(((String) (arraylist)).length() < 100)
	//*  51   88:aload_0         
	//*  52   89:invokevirtual   #116 <Method int String.length()>
	//*  53   92:bipush          100
	//*  54   94:icmpge          99
			return ((String) (arraylist));
	//   55   97:aload_0         
	//   56   98:areturn         
		else
			return ((String) (arraylist)).substring(0, 100);
	//   57   99:aload_0         
	//   58  100:iconst_0        
	//   59  101:bipush          100
	//   60  103:invokevirtual   #120 <Method String String.substring(int, int)>
	//   61  106:areturn         
	}

	private final void c(String s, boolean flag, float f1, float f2, float f3, float f4)
	{
		if(s == null)
			break MISSING_BLOCK_LABEL_101;
	//    0    0:aload_1         
	//    1    1:ifnull          101
		if(s.length() < c)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #116 <Method int String.length()>
	//*   4    8:aload_0         
	//*   5    9:getfield        #64  <Field int c>
	//*   6   12:icmpge          16
			return;
	//    7   15:return          
		Object obj = f;
	//    8   16:aload_0         
	//    9   17:getfield        #35  <Field Object f>
	//   10   20:astore          7
		obj;
	//   11   22:aload           7
		JVM INSTR monitorenter ;
	//   12   24:monitorenter    
		g.add(((Object) (s)));
	//   13   25:aload_0         
	//   14   26:getfield        #40  <Field ArrayList g>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #125 <Method boolean ArrayList.add(Object)>
	//   17   33:pop             
		j = j + s.length();
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #46  <Field int j>
	//   21   39:aload_1         
	//   22   40:invokevirtual   #116 <Method int String.length()>
	//   23   43:iadd            
	//   24   44:putfield        #46  <Field int j>
		if(!flag)
			break MISSING_BLOCK_LABEL_91;
	//   25   47:iload_2         
	//   26   48:ifeq            91
		h.add(((Object) (s)));
	//   27   51:aload_0         
	//   28   52:getfield        #42  <Field ArrayList h>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #125 <Method boolean ArrayList.add(Object)>
	//   31   59:pop             
		i.add(((Object) (new bqv(f1, f2, f3, f4, h.size() - 1))));
	//   32   60:aload_0         
	//   33   61:getfield        #44  <Field ArrayList i>
	//   34   64:new             #127 <Class bqv>
	//   35   67:dup             
	//   36   68:fload_3         
	//   37   69:fload           4
	//   38   71:fload           5
	//   39   73:fload           6
	//   40   75:aload_0         
	//   41   76:getfield        #42  <Field ArrayList h>
	//   42   79:invokevirtual   #91  <Method int ArrayList.size()>
	//   43   82:iconst_1        
	//   44   83:isub            
	//   45   84:invokespecial   #130 <Method void bqv(float, float, float, float, int)>
	//   46   87:invokevirtual   #125 <Method boolean ArrayList.add(Object)>
	//   47   90:pop             
		obj;
	//   48   91:aload           7
		JVM INSTR monitorexit ;
	//   49   93:monitorexit     
		return;
	//   50   94:return          
		s;
	//   51   95:astore_1        
		obj;
	//   52   96:aload           7
		JVM INSTR monitorexit ;
	//   53   98:monitorexit     
		throw s;
	//   54   99:aload_1         
	//   55  100:athrow          
	//   56  101:return          
	}

	public final void a(int i1)
	{
		k = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field int k>
	//    3    5:return          
	}

	public final void a(String s, boolean flag, float f1, float f2, float f3, float f4)
	{
		c(s, flag, f1, f2, f3, f4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:invokespecial   #132 <Method void c(String, boolean, float, float, float, float)>
		synchronized(f)
	//*   8   13:aload_0         
	//*   9   14:getfield        #35  <Field Object f>
	//*  10   17:astore_1        
	//*  11   18:aload_1         
	//*  12   19:monitorenter    
		{
			if(l < 0)
	//*  13   20:aload_0         
	//*  14   21:getfield        #50  <Field int l>
	//*  15   24:ifge            32
				wx.b("ActivityContent: negative number of WebViews.");
	//   16   27:ldc1            #134 <String "ActivityContent: negative number of WebViews.">
	//   17   29:invokestatic    #139 <Method void wx.b(String)>
			h();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #141 <Method void h()>
		}
	//   20   36:aload_1         
	//   21   37:monitorexit     
		return;
	//   22   38:return          
		exception;
	//   23   39:astore          7
		s;
	//   24   41:aload_1         
		JVM INSTR monitorexit ;
	//   25   42:monitorexit     
		throw exception;
	//   26   43:aload           7
	//   27   45:athrow          
	}

	public final boolean a()
	{
		Object obj = f;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object f>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(l == 0)
	//*   5    7:aload_0         
	//*   6    8:getfield        #50  <Field int l>
	//*   7   11:ifne            28
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:aload_2         
	//*  12   20:monitorexit     
	//*  13   21:iload_1         
	//*  14   22:ireturn         
	//*  15   23:astore_3        
	//*  16   24:aload_2         
	//*  17   25:monitorexit     
	//*  18   26:aload_3         
	//*  19   27:athrow          
			flag = false;
	//   20   28:iconst_0        
	//   21   29:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  22   30:goto            19
	}

	public final String b()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String n>
	//    2    4:areturn         
	}

	public final void b(String s, boolean flag, float f1, float f2, float f3, float f4)
	{
		c(s, flag, f1, f2, f3, f4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:fload           5
	//    6    8:fload           6
	//    7   10:invokespecial   #132 <Method void c(String, boolean, float, float, float, float)>
	//    8   13:return          
	}

	public final String c()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String o>
	//    2    4:areturn         
	}

	public final String d()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String p>
	//    2    4:areturn         
	}

	public final void e()
	{
		synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object f>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			m = m - 100;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #143 <Field int m>
	//    8   12:bipush          100
	//    9   14:isub            
	//   10   15:putfield        #143 <Field int m>
		}
	//   11   18:aload_1         
	//   12   19:monitorexit     
		return;
	//   13   20:return          
		exception;
	//   14   21:astore_2        
		obj;
	//   15   22:aload_1         
		JVM INSTR monitorexit ;
	//   16   23:monitorexit     
		throw exception;
	//   17   24:aload_2         
	//   18   25:athrow          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof bqj))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class bqj>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(obj == this)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:if_acmpne       16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		obj = ((Object) (((bqj)obj).n));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class bqj>
	//   12   20:getfield        #54  <Field String n>
	//   13   23:astore_1        
		return obj != null && ((String) (obj)).equals(((Object) (n)));
	//   14   24:aload_1         
	//   15   25:ifnull          41
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #54  <Field String n>
	//   19   33:invokevirtual   #146 <Method boolean String.equals(Object)>
	//   20   36:ifeq            41
	//   21   39:iconst_1        
	//   22   40:ireturn         
	//   23   41:iconst_0        
	//   24   42:ireturn         
	}

	public final void f()
	{
		synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object f>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			l = l - 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #50  <Field int l>
	//    8   12:iconst_1        
	//    9   13:isub            
	//   10   14:putfield        #50  <Field int l>
		}
	//   11   17:aload_1         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void g()
	{
		synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object f>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			l = l + 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #50  <Field int l>
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #50  <Field int l>
		}
	//   11   17:aload_1         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void h()
	{
		synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object f>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			int i1 = j;
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field int j>
	//    7   11:istore_1        
			int j1 = k;
	//    8   12:aload_0         
	//    9   13:getfield        #48  <Field int k>
	//   10   16:istore_2        
			i1 = i1 * a + j1 * b;
	//   11   17:iload_1         
	//   12   18:aload_0         
	//   13   19:getfield        #60  <Field int a>
	//   14   22:imul            
	//   15   23:iload_2         
	//   16   24:aload_0         
	//   17   25:getfield        #62  <Field int b>
	//   18   28:imul            
	//   19   29:iadd            
	//   20   30:istore_1        
			if(i1 > m)
	//*  21   31:iload_1         
	//*  22   32:aload_0         
	//*  23   33:getfield        #143 <Field int m>
	//*  24   36:icmple          121
			{
				m = i1;
	//   25   39:aload_0         
	//   26   40:iload_1         
	//   27   41:putfield        #143 <Field int m>
				if(!aw.i().k().b())
	//*  28   44:invokestatic    #151 <Method wi aw.i()>
	//*  29   47:invokevirtual   #156 <Method xa wi.k()>
	//*  30   50:invokeinterface #160 <Method boolean xa.b()>
	//*  31   55:ifne            88
				{
					n = d.a(g);
	//   32   58:aload_0         
	//   33   59:aload_0         
	//   34   60:getfield        #71  <Field bqx d>
	//   35   63:aload_0         
	//   36   64:getfield        #40  <Field ArrayList g>
	//   37   67:invokevirtual   #163 <Method String bqx.a(ArrayList)>
	//   38   70:putfield        #54  <Field String n>
					o = d.a(h);
	//   39   73:aload_0         
	//   40   74:aload_0         
	//   41   75:getfield        #71  <Field bqx d>
	//   42   78:aload_0         
	//   43   79:getfield        #42  <Field ArrayList h>
	//   44   82:invokevirtual   #163 <Method String bqx.a(ArrayList)>
	//   45   85:putfield        #56  <Field String o>
				}
				if(!aw.i().k().d())
	//*  46   88:invokestatic    #151 <Method wi aw.i()>
	//*  47   91:invokevirtual   #156 <Method xa wi.k()>
	//*  48   94:invokeinterface #165 <Method boolean xa.d()>
	//*  49   99:ifne            121
					p = e.a(h, i);
	//   50  102:aload_0         
	//   51  103:aload_0         
	//   52  104:getfield        #78  <Field brg e>
	//   53  107:aload_0         
	//   54  108:getfield        #42  <Field ArrayList h>
	//   55  111:aload_0         
	//   56  112:getfield        #44  <Field ArrayList i>
	//   57  115:invokevirtual   #168 <Method String brg.a(ArrayList, ArrayList)>
	//   58  118:putfield        #58  <Field String p>
			}
		}
	//   59  121:aload_3         
	//   60  122:monitorexit     
		return;
	//   61  123:return          
		exception;
	//   62  124:astore          4
		obj;
	//   63  126:aload_3         
		JVM INSTR monitorexit ;
	//   64  127:monitorexit     
		throw exception;
	//   65  128:aload           4
	//   66  130:athrow          
	}

	public final int hashCode()
	{
		return n.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String n>
	//    2    4:invokevirtual   #171 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public final int i()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field int m>
	//    2    4:ireturn         
	}

	final int j()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int j>
	//    2    4:ireturn         
	}

	public final String toString()
	{
		int i1 = k;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int k>
	//    2    4:istore_1        
		int j1 = m;
	//    3    5:aload_0         
	//    4    6:getfield        #143 <Field int m>
	//    5    9:istore_2        
		int k1 = j;
	//    6   10:aload_0         
	//    7   11:getfield        #46  <Field int j>
	//    8   14:istore_3        
		String s = a(g, 100);
	//    9   15:aload_0         
	//   10   16:getfield        #40  <Field ArrayList g>
	//   11   19:bipush          100
	//   12   21:invokestatic    #173 <Method String a(ArrayList, int)>
	//   13   24:astore          4
		String s1 = a(h, 100);
	//   14   26:aload_0         
	//   15   27:getfield        #42  <Field ArrayList h>
	//   16   30:bipush          100
	//   17   32:invokestatic    #173 <Method String a(ArrayList, int)>
	//   18   35:astore          5
		String s2 = n;
	//   19   37:aload_0         
	//   20   38:getfield        #54  <Field String n>
	//   21   41:astore          6
		String s3 = o;
	//   22   43:aload_0         
	//   23   44:getfield        #56  <Field String o>
	//   24   47:astore          7
		String s4 = p;
	//   25   49:aload_0         
	//   26   50:getfield        #58  <Field String p>
	//   27   53:astore          8
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 165 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length() + String.valueOf(((Object) (s4))).length());
	//   28   55:new             #86  <Class StringBuilder>
	//   29   58:dup             
	//   30   59:aload           4
	//   31   61:invokestatic    #177 <Method String String.valueOf(Object)>
	//   32   64:invokevirtual   #116 <Method int String.length()>
	//   33   67:sipush          165
	//   34   70:iadd            
	//   35   71:aload           5
	//   36   73:invokestatic    #177 <Method String String.valueOf(Object)>
	//   37   76:invokevirtual   #116 <Method int String.length()>
	//   38   79:iadd            
	//   39   80:aload           6
	//   40   82:invokestatic    #177 <Method String String.valueOf(Object)>
	//   41   85:invokevirtual   #116 <Method int String.length()>
	//   42   88:iadd            
	//   43   89:aload           7
	//   44   91:invokestatic    #177 <Method String String.valueOf(Object)>
	//   45   94:invokevirtual   #116 <Method int String.length()>
	//   46   97:iadd            
	//   47   98:aload           8
	//   48  100:invokestatic    #177 <Method String String.valueOf(Object)>
	//   49  103:invokevirtual   #116 <Method int String.length()>
	//   50  106:iadd            
	//   51  107:invokespecial   #178 <Method void StringBuilder(int)>
	//   52  110:astore          9
		stringbuilder.append("ActivityContent fetchId: ");
	//   53  112:aload           9
	//   54  114:ldc1            #180 <String "ActivityContent fetchId: ">
	//   55  116:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   56  119:pop             
		stringbuilder.append(i1);
	//   57  120:aload           9
	//   58  122:iload_1         
	//   59  123:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
	//   60  126:pop             
		stringbuilder.append(" score:");
	//   61  127:aload           9
	//   62  129:ldc1            #184 <String " score:">
	//   63  131:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   64  134:pop             
		stringbuilder.append(j1);
	//   65  135:aload           9
	//   66  137:iload_2         
	//   67  138:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
	//   68  141:pop             
		stringbuilder.append(" total_length:");
	//   69  142:aload           9
	//   70  144:ldc1            #186 <String " total_length:">
	//   71  146:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   72  149:pop             
		stringbuilder.append(k1);
	//   73  150:aload           9
	//   74  152:iload_3         
	//   75  153:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
	//   76  156:pop             
		stringbuilder.append("\n text: ");
	//   77  157:aload           9
	//   78  159:ldc1            #188 <String "\n text: ">
	//   79  161:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
		stringbuilder.append(s);
	//   81  165:aload           9
	//   82  167:aload           4
	//   83  169:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   84  172:pop             
		stringbuilder.append("\n viewableText");
	//   85  173:aload           9
	//   86  175:ldc1            #190 <String "\n viewableText">
	//   87  177:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   88  180:pop             
		stringbuilder.append(s1);
	//   89  181:aload           9
	//   90  183:aload           5
	//   91  185:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   92  188:pop             
		stringbuilder.append("\n signture: ");
	//   93  189:aload           9
	//   94  191:ldc1            #192 <String "\n signture: ">
	//   95  193:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   96  196:pop             
		stringbuilder.append(s2);
	//   97  197:aload           9
	//   98  199:aload           6
	//   99  201:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  100  204:pop             
		stringbuilder.append("\n viewableSignture: ");
	//  101  205:aload           9
	//  102  207:ldc1            #194 <String "\n viewableSignture: ">
	//  103  209:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  104  212:pop             
		stringbuilder.append(s3);
	//  105  213:aload           9
	//  106  215:aload           7
	//  107  217:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  108  220:pop             
		stringbuilder.append("\n viewableSignatureForVertical: ");
	//  109  221:aload           9
	//  110  223:ldc1            #196 <String "\n viewableSignatureForVertical: ">
	//  111  225:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  112  228:pop             
		stringbuilder.append(s4);
	//  113  229:aload           9
	//  114  231:aload           8
	//  115  233:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  116  236:pop             
		return stringbuilder.toString();
	//  117  237:aload           9
	//  118  239:invokevirtual   #115 <Method String StringBuilder.toString()>
	//  119  242:areturn         
	}

	private final int a;
	private final int b;
	private final int c;
	private final bqx d;
	private final brg e;
	private final Object f = new Object();
	private ArrayList g;
	private ArrayList h;
	private ArrayList i;
	private int j;
	private int k;
	private int l;
	private int m;
	private String n;
	private String o;
	private String p;
}
