// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.SparseArray;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$m
{
	static class a
	{

		ArrayList a;
		int b;
		long c;
		long d;

		a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			a = new ArrayList();
		//    2    4:aload_0         
		//    3    5:new             #23  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #24  <Method void ArrayList()>
		//    6   12:putfield        #26  <Field ArrayList a>
			b = 5;
		//    7   15:aload_0         
		//    8   16:iconst_5        
		//    9   17:putfield        #28  <Field int b>
			c = 0L;
		//   10   20:aload_0         
		//   11   21:lconst_0        
		//   12   22:putfield        #30  <Field long c>
			d = 0L;
		//   13   25:aload_0         
		//   14   26:lconst_0        
		//   15   27:putfield        #32  <Field long d>
		//   16   30:return          
		}
	}


	private a b(int i)
	{
		a a2 = (a)a.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SparseArray a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #31  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #9   <Class RecyclerView$m$a>
	//    5   11:astore_3        
		a a1 = a2;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(a2 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       35
		{
			a1 = new a();
	//   10   18:new             #9   <Class RecyclerView$m$a>
	//   11   21:dup             
	//   12   22:invokespecial   #32  <Method void RecyclerView$m$a()>
	//   13   25:astore_2        
			a.put(i, ((Object) (a1)));
	//   14   26:aload_0         
	//   15   27:getfield        #23  <Field SparseArray a>
	//   16   30:iload_1         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #36  <Method void SparseArray.put(int, Object)>
		}
		return a1;
	//   19   35:aload_2         
	//   20   36:areturn         
	}

	long a(long l, long l1)
	{
		if(l == 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            8
			return l1;
	//    4    6:lload_3         
	//    5    7:lreturn         
		else
			return (l / 4L) * 3L + l1 / 4L;
	//    6    8:lload_1         
	//    7    9:ldc2w           #38  <Long 4L>
	//    8   12:ldiv            
	//    9   13:ldc2w           #40  <Long 3L>
	//   10   16:lmul            
	//   11   17:lload_3         
	//   12   18:ldc2w           #38  <Long 4L>
	//   13   21:ldiv            
	//   14   22:ladd            
	//   15   23:lreturn         
	}

	public RecyclerView$u a(int i)
	{
		Object obj = ((Object) ((a)a.get(i)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SparseArray a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #31  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #9   <Class RecyclerView$m$a>
	//    5   11:astore_2        
		if(obj != null && !((a) (obj)).a.isEmpty())
	//*   6   12:aload_2         
	//*   7   13:ifnull          45
	//*   8   16:aload_2         
	//*   9   17:getfield        #45  <Field ArrayList RecyclerView$m$a.a>
	//*  10   20:invokevirtual   #51  <Method boolean ArrayList.isEmpty()>
	//*  11   23:ifne            45
		{
			obj = ((Object) (((a) (obj)).a));
	//   12   26:aload_2         
	//   13   27:getfield        #45  <Field ArrayList RecyclerView$m$a.a>
	//   14   30:astore_2        
			return (RecyclerView$u)((ArrayList) (obj)).remove(((ArrayList) (obj)).size() - 1);
	//   15   31:aload_2         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #55  <Method int ArrayList.size()>
	//   18   36:iconst_1        
	//   19   37:isub            
	//   20   38:invokevirtual   #58  <Method Object ArrayList.remove(int)>
	//   21   41:checkcast       #60  <Class RecyclerView$u>
	//   22   44:areturn         
		} else
		{
			return null;
	//   23   45:aconst_null     
	//   24   46:areturn         
		}
	}

	public void a()
	{
		for(int i = 0; i < a.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #23  <Field SparseArray a>
	//*   5    7:invokevirtual   #61  <Method int SparseArray.size()>
	//*   6   10:icmpge          37
			((a)a.valueAt(i)).a.clear();
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field SparseArray a>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #64  <Method Object SparseArray.valueAt(int)>
	//   11   21:checkcast       #9   <Class RecyclerView$m$a>
	//   12   24:getfield        #45  <Field ArrayList RecyclerView$m$a.a>
	//   13   27:invokevirtual   #67  <Method void ArrayList.clear()>

	//   14   30:iload_1         
	//   15   31:iconst_1        
	//   16   32:iadd            
	//   17   33:istore_1        
	//*  18   34:goto            2
	//   19   37:return          
	}

	void a(int i, long l)
	{
		a a1 = b(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #70  <Method RecyclerView$m$a b(int)>
	//    3    5:astore          4
		a1.c = a(a1.c, l);
	//    4    7:aload           4
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:getfield        #74  <Field long RecyclerView$m$a.c>
	//    8   15:lload_2         
	//    9   16:invokevirtual   #76  <Method long a(long, long)>
	//   10   19:putfield        #74  <Field long RecyclerView$m$a.c>
	//   11   22:return          
	}

	void a(RecyclerView$a recyclerview$a)
	{
		b = b + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field int b>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #25  <Field int b>
	//    6   10:return          
	}

	void a(RecyclerView$a recyclerview$a, RecyclerView$a recyclerview$a1, boolean flag)
	{
		if(recyclerview$a != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
			b();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #80  <Method void b()>
		if(!flag && b == 0)
	//*   4    8:iload_3         
	//*   5    9:ifne            23
	//*   6   12:aload_0         
	//*   7   13:getfield        #25  <Field int b>
	//*   8   16:ifne            23
			a();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #82  <Method void a()>
		if(recyclerview$a1 != null)
	//*  11   23:aload_2         
	//*  12   24:ifnull          32
			a(recyclerview$a1);
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #84  <Method void a(RecyclerView$a)>
	//   16   32:return          
	}

	public void a(RecyclerView$u recyclerview$u)
	{
		int i = recyclerview$u.h();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #88  <Method int RecyclerView$u.h()>
	//    2    4:istore_2        
		ArrayList arraylist = b(i).a;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #70  <Method RecyclerView$m$a b(int)>
	//    6   10:getfield        #45  <Field ArrayList RecyclerView$m$a.a>
	//    7   13:astore_3        
		if(((a)a.get(i)).b <= arraylist.size())
	//*   8   14:aload_0         
	//*   9   15:getfield        #23  <Field SparseArray a>
	//*  10   18:iload_2         
	//*  11   19:invokevirtual   #31  <Method Object SparseArray.get(int)>
	//*  12   22:checkcast       #9   <Class RecyclerView$m$a>
	//*  13   25:getfield        #89  <Field int RecyclerView$m$a.b>
	//*  14   28:aload_3         
	//*  15   29:invokevirtual   #55  <Method int ArrayList.size()>
	//*  16   32:icmpgt          36
		{
			return;
	//   17   35:return          
		} else
		{
			recyclerview$u.v();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #92  <Method void RecyclerView$u.v()>
			arraylist.add(((Object) (recyclerview$u)));
	//   20   40:aload_3         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #96  <Method boolean ArrayList.add(Object)>
	//   23   45:pop             
			return;
	//   24   46:return          
		}
	}

	boolean a(int i, long l, long l1)
	{
		long l2 = b(i).c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #70  <Method RecyclerView$m$a b(int)>
	//    3    5:getfield        #74  <Field long RecyclerView$m$a.c>
	//    4    8:lstore          6
		return l2 == 0L || l + l2 < l1;
	//    5   10:lload           6
	//    6   12:lconst_0        
	//    7   13:lcmp            
	//    8   14:ifeq            32
	//    9   17:lload_2         
	//   10   18:lload           6
	//   11   20:ladd            
	//   12   21:lload           4
	//   13   23:lcmp            
	//   14   24:ifge            30
	//   15   27:goto            32
	//   16   30:iconst_0        
	//   17   31:ireturn         
	//   18   32:iconst_1        
	//   19   33:ireturn         
	}

	void b()
	{
		b = b - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field int b>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #25  <Field int b>
	//    6   10:return          
	}

	void b(int i, long l)
	{
		a a1 = b(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #70  <Method RecyclerView$m$a b(int)>
	//    3    5:astore          4
		a1.d = a(a1.d, l);
	//    4    7:aload           4
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:getfield        #100 <Field long RecyclerView$m$a.d>
	//    8   15:lload_2         
	//    9   16:invokevirtual   #76  <Method long a(long, long)>
	//   10   19:putfield        #100 <Field long RecyclerView$m$a.d>
	//   11   22:return          
	}

	boolean b(int i, long l, long l1)
	{
		long l2 = b(i).d;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #70  <Method RecyclerView$m$a b(int)>
	//    3    5:getfield        #100 <Field long RecyclerView$m$a.d>
	//    4    8:lstore          6
		return l2 == 0L || l + l2 < l1;
	//    5   10:lload           6
	//    6   12:lconst_0        
	//    7   13:lcmp            
	//    8   14:ifeq            32
	//    9   17:lload_2         
	//   10   18:lload           6
	//   11   20:ladd            
	//   12   21:lload           4
	//   13   23:lcmp            
	//   14   24:ifge            30
	//   15   27:goto            32
	//   16   30:iconst_0        
	//   17   31:ireturn         
	//   18   32:iconst_1        
	//   19   33:ireturn         
	}

	SparseArray a;
	private int b;

	public RecyclerView$m()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		a = new SparseArray();
	//    2    4:aload_0         
	//    3    5:new             #20  <Class SparseArray>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void SparseArray()>
	//    6   12:putfield        #23  <Field SparseArray a>
		b = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #25  <Field int b>
	//   10   20:return          
	}
}
