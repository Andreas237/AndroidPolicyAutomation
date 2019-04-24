// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			o, ViewPager, s, aa

class ViewPager$4
	implements o
{

	public aa a(View view, aa aa1)
	{
		view = ((View) (s.a(view, aa1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #31  <Method aa s.a(View, aa)>
	//    3    5:astore_1        
		if(((aa) (view)).f())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #37  <Method boolean aa.f()>
	//*   6   10:ifeq            15
			return ((aa) (view));
	//    7   13:aload_1         
	//    8   14:areturn         
		aa1 = ((aa) (b));
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field Rect b>
	//   11   19:astore_2        
		aa1.left = ((aa) (view)).a();
	//   12   20:aload_2         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #40  <Method int aa.a()>
	//   15   25:putfield        #44  <Field int Rect.left>
		aa1.top = ((aa) (view)).b();
	//   16   28:aload_2         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #46  <Method int aa.b()>
	//   19   33:putfield        #49  <Field int Rect.top>
		aa1.right = ((aa) (view)).c();
	//   20   36:aload_2         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #52  <Method int aa.c()>
	//   23   41:putfield        #55  <Field int Rect.right>
		aa1.bottom = ((aa) (view)).d();
	//   24   44:aload_2         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #58  <Method int aa.d()>
	//   27   49:putfield        #61  <Field int Rect.bottom>
		int i = 0;
	//   28   52:iconst_0        
	//   29   53:istore_3        
		for(int j = a.getChildCount(); i < j; i++)
	//*  30   54:aload_0         
	//*  31   55:getfield        #18  <Field ViewPager a>
	//*  32   58:invokevirtual   #64  <Method int ViewPager.getChildCount()>
	//*  33   61:istore          4
	//*  34   63:iload_3         
	//*  35   64:iload           4
	//*  36   66:icmpge          154
		{
			aa aa2 = s.b(a.getChildAt(i), ((aa) (view)));
	//   37   69:aload_0         
	//   38   70:getfield        #18  <Field ViewPager a>
	//   39   73:iload_3         
	//   40   74:invokevirtual   #68  <Method View ViewPager.getChildAt(int)>
	//   41   77:aload_1         
	//   42   78:invokestatic    #70  <Method aa s.b(View, aa)>
	//   43   81:astore          5
			aa1.left = Math.min(aa2.a(), ((Rect) (aa1)).left);
	//   44   83:aload_2         
	//   45   84:aload           5
	//   46   86:invokevirtual   #40  <Method int aa.a()>
	//   47   89:aload_2         
	//   48   90:getfield        #44  <Field int Rect.left>
	//   49   93:invokestatic    #76  <Method int Math.min(int, int)>
	//   50   96:putfield        #44  <Field int Rect.left>
			aa1.top = Math.min(aa2.b(), ((Rect) (aa1)).top);
	//   51   99:aload_2         
	//   52  100:aload           5
	//   53  102:invokevirtual   #46  <Method int aa.b()>
	//   54  105:aload_2         
	//   55  106:getfield        #49  <Field int Rect.top>
	//   56  109:invokestatic    #76  <Method int Math.min(int, int)>
	//   57  112:putfield        #49  <Field int Rect.top>
			aa1.right = Math.min(aa2.c(), ((Rect) (aa1)).right);
	//   58  115:aload_2         
	//   59  116:aload           5
	//   60  118:invokevirtual   #52  <Method int aa.c()>
	//   61  121:aload_2         
	//   62  122:getfield        #55  <Field int Rect.right>
	//   63  125:invokestatic    #76  <Method int Math.min(int, int)>
	//   64  128:putfield        #55  <Field int Rect.right>
			aa1.bottom = Math.min(aa2.d(), ((Rect) (aa1)).bottom);
	//   65  131:aload_2         
	//   66  132:aload           5
	//   67  134:invokevirtual   #58  <Method int aa.d()>
	//   68  137:aload_2         
	//   69  138:getfield        #61  <Field int Rect.bottom>
	//   70  141:invokestatic    #76  <Method int Math.min(int, int)>
	//   71  144:putfield        #61  <Field int Rect.bottom>
		}

	//   72  147:iload_3         
	//   73  148:iconst_1        
	//   74  149:iadd            
	//   75  150:istore_3        
	//*  76  151:goto            63
		return ((aa) (view)).a(((Rect) (aa1)).left, ((Rect) (aa1)).top, ((Rect) (aa1)).right, ((Rect) (aa1)).bottom);
	//   77  154:aload_1         
	//   78  155:aload_2         
	//   79  156:getfield        #44  <Field int Rect.left>
	//   80  159:aload_2         
	//   81  160:getfield        #49  <Field int Rect.top>
	//   82  163:aload_2         
	//   83  164:getfield        #55  <Field int Rect.right>
	//   84  167:aload_2         
	//   85  168:getfield        #61  <Field int Rect.bottom>
	//   86  171:invokevirtual   #79  <Method aa aa.a(int, int, int, int)>
	//   87  174:areturn         
	}

	final ViewPager a;
	private final Rect b = new Rect();

	ViewPager$4(ViewPager viewpager)
	{
		a = viewpager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ViewPager a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #22  <Class Rect>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void Rect()>
	//    9   17:putfield        #25  <Field Rect b>
	//   10   20:return          
	}
}
