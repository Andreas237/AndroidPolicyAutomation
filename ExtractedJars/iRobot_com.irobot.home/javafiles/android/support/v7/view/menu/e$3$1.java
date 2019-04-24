// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.af;
import android.view.MenuItem;
import java.util.List;

// Referenced classes of package android.support.v7.view.menu:
//			e, h

class e$3$1
	implements Runnable
{

	public void run()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field e$a a>
	//*   2    4:ifnull          40
		{
			d.a.d = true;
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field e$3 d>
	//    5   11:getfield        #36  <Field e e$3.a>
	//    6   14:iconst_1        
	//    7   15:putfield        #41  <Field boolean e.d>
			a.b.b(false);
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field e$a a>
	//   10   22:getfield        #45  <Field h e$a.b>
	//   11   25:iconst_0        
	//   12   26:invokevirtual   #50  <Method void h.b(boolean)>
			d.a.d = false;
	//   13   29:aload_0         
	//   14   30:getfield        #22  <Field e$3 d>
	//   15   33:getfield        #36  <Field e e$3.a>
	//   16   36:iconst_0        
	//   17   37:putfield        #41  <Field boolean e.d>
		}
		if(b.isEnabled() && b.hasSubMenu())
	//*  18   40:aload_0         
	//*  19   41:getfield        #26  <Field MenuItem b>
	//*  20   44:invokeinterface #56  <Method boolean MenuItem.isEnabled()>
	//*  21   49:ifeq            77
	//*  22   52:aload_0         
	//*  23   53:getfield        #26  <Field MenuItem b>
	//*  24   56:invokeinterface #59  <Method boolean MenuItem.hasSubMenu()>
	//*  25   61:ifeq            77
			c.a(b, 4);
	//   26   64:aload_0         
	//   27   65:getfield        #28  <Field h c>
	//   28   68:aload_0         
	//   29   69:getfield        #26  <Field MenuItem b>
	//   30   72:iconst_4        
	//   31   73:invokevirtual   #62  <Method boolean h.a(MenuItem, int)>
	//   32   76:pop             
	//   33   77:return          
	}

	final e.a a;
	final MenuItem b;
	final h c;
	final e._cls3 d;

	e$3$1(e._cls3 _pcls3, e.a a1, MenuItem menuitem, h h1)
	{
		d = _pcls3;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field e$3 d>
		a = a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field e$a a>
		b = menuitem;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field MenuItem b>
		c = h1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field h c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}

	// Unreferenced inner class android/support/v7/view/menu/e$3

/* anonymous class */
	class e._cls3
		implements af
	{

		public void a(h h1, MenuItem menuitem)
		{
			a.a.removeCallbacksAndMessages(((Object) (h1)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field e a>
		//    2    4:getfield        #24  <Field Handler e.a>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #30  <Method void Handler.removeCallbacksAndMessages(Object)>
		//    5   11:return          
		}

		public void b(h h1, MenuItem menuitem)
		{
			int i;
			e.a a1;
label0:
			{
				Handler handler = a.a;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field e a>
		//    2    4:getfield        #24  <Field Handler e.a>
		//    3    7:astore          8
				a1 = null;
		//    4    9:aconst_null     
		//    5   10:astore          7
				handler.removeCallbacksAndMessages(((Object) (null)));
		//    6   12:aload           8
		//    7   14:aconst_null     
		//    8   15:invokevirtual   #30  <Method void Handler.removeCallbacksAndMessages(Object)>
				int j = a.b.size();
		//    9   18:aload_0         
		//   10   19:getfield        #16  <Field e a>
		//   11   22:getfield        #34  <Field List e.b>
		//   12   25:invokeinterface #40  <Method int List.size()>
		//   13   30:istore          4
				for(i = 0; i < j; i++)
		//*  14   32:iconst_0        
		//*  15   33:istore_3        
		//*  16   34:iload_3         
		//*  17   35:iload           4
		//*  18   37:icmpge          73
					if(h1 == ((e.a)a.b.get(i)).b)
		//*  19   40:aload_1         
		//*  20   41:aload_0         
		//*  21   42:getfield        #16  <Field e a>
		//*  22   45:getfield        #34  <Field List e.b>
		//*  23   48:iload_3         
		//*  24   49:invokeinterface #44  <Method Object List.get(int)>
		//*  25   54:checkcast       #46  <Class e$a>
		//*  26   57:getfield        #49  <Field h e$a.b>
		//*  27   60:if_acmpne       66
						break label0;
		//   28   63:goto            75

		//   29   66:iload_3         
		//   30   67:iconst_1        
		//   31   68:iadd            
		//   32   69:istore_3        
		//*  33   70:goto            34
				i = -1;
		//   34   73:iconst_m1       
		//   35   74:istore_3        
			}
			if(i == -1)
		//*  36   75:iload_3         
		//*  37   76:iconst_m1       
		//*  38   77:icmpne          81
				return;
		//   39   80:return          
			i++;
		//   40   81:iload_3         
		//   41   82:iconst_1        
		//   42   83:iadd            
		//   43   84:istore_3        
			if(i < a.b.size())
		//*  44   85:iload_3         
		//*  45   86:aload_0         
		//*  46   87:getfield        #16  <Field e a>
		//*  47   90:getfield        #34  <Field List e.b>
		//*  48   93:invokeinterface #40  <Method int List.size()>
		//*  49   98:icmpge          119
				a1 = (e.a)a.b.get(i);
		//   50  101:aload_0         
		//   51  102:getfield        #16  <Field e a>
		//   52  105:getfield        #34  <Field List e.b>
		//   53  108:iload_3         
		//   54  109:invokeinterface #44  <Method Object List.get(int)>
		//   55  114:checkcast       #46  <Class e$a>
		//   56  117:astore          7
			menuitem = ((MenuItem) (new e._cls3._cls1(this, a1, menuitem, h1)));
		//   57  119:new             #10  <Class e$3$1>
		//   58  122:dup             
		//   59  123:aload_0         
		//   60  124:aload           7
		//   61  126:aload_2         
		//   62  127:aload_1         
		//   63  128:invokespecial   #52  <Method void e$3$1(e$3, e$a, MenuItem, h)>
		//   64  131:astore_2        
			long l = SystemClock.uptimeMillis();
		//   65  132:invokestatic    #58  <Method long SystemClock.uptimeMillis()>
		//   66  135:lstore          5
			a.a.postAtTime(((Runnable) (menuitem)), ((Object) (h1)), l + 200L);
		//   67  137:aload_0         
		//   68  138:getfield        #16  <Field e a>
		//   69  141:getfield        #24  <Field Handler e.a>
		//   70  144:aload_2         
		//   71  145:aload_1         
		//   72  146:lload           5
		//   73  148:ldc2w           #59  <Long 200L>
		//   74  151:ladd            
		//   75  152:invokevirtual   #64  <Method boolean Handler.postAtTime(Runnable, Object, long)>
		//   76  155:pop             
		//   77  156:return          
		}

		final e a;

			
			{
				a = e1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field e a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
	}

}
