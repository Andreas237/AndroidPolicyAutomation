// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//			c, b

class c$c$1
	implements e.a
{

	public Object a(int i)
	{
		b b1 = a.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field c a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #31  <Method b c.a(int)>
	//    4    8:astore_2        
		if(b1 == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return ((Object) (null));
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return ((Object) (b1.a()));
	//    9   15:aload_2         
	//   10   16:invokevirtual   #36  <Method android.view.accessibility.AccessibilityNodeInfo b.a()>
	//   11   19:areturn         
	}

	public List a(String s, int i)
	{
		s = ((String) (a.a(s, i)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field c a>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #39  <Method List c.a(String, int)>
	//    5    9:astore_1        
		if(s == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		ArrayList arraylist = new ArrayList();
	//   10   16:new             #41  <Class ArrayList>
	//   11   19:dup             
	//   12   20:invokespecial   #42  <Method void ArrayList()>
	//   13   23:astore          4
		int j = ((List) (s)).size();
	//   14   25:aload_1         
	//   15   26:invokeinterface #48  <Method int List.size()>
	//   16   31:istore_3        
		for(i = 0; i < j; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_2        
	//*  19   34:iload_2         
	//*  20   35:iload_3         
	//*  21   36:icmpge          67
			((List) (arraylist)).add(((Object) (((b)((List) (s)).get(i)).a())));
	//   22   39:aload           4
	//   23   41:aload_1         
	//   24   42:iload_2         
	//   25   43:invokeinterface #51  <Method Object List.get(int)>
	//   26   48:checkcast       #33  <Class b>
	//   27   51:invokevirtual   #36  <Method android.view.accessibility.AccessibilityNodeInfo b.a()>
	//   28   54:invokeinterface #55  <Method boolean List.add(Object)>
	//   29   59:pop             

	//   30   60:iload_2         
	//   31   61:iconst_1        
	//   32   62:iadd            
	//   33   63:istore_2        
	//*  34   64:goto            34
		return ((List) (arraylist));
	//   35   67:aload           4
	//   36   69:areturn         
	}

	public boolean a(int i, int j, Bundle bundle)
	{
		return a.a(i, j, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field c a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #60  <Method boolean c.a(int, int, Bundle)>
	//    6   10:ireturn         
	}

	public Object b(int i)
	{
		b b1 = a.b(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field c a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #62  <Method b c.b(int)>
	//    4    8:astore_2        
		if(b1 == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return ((Object) (null));
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return ((Object) (b1.a()));
	//    9   15:aload_2         
	//   10   16:invokevirtual   #36  <Method android.view.accessibility.AccessibilityNodeInfo b.a()>
	//   11   19:areturn         
	}

	final c a;
	final c.c b;

	c$c$1(c.c c1, c c2)
	{
		b = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field c$c b>
		a = c2;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field c a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
