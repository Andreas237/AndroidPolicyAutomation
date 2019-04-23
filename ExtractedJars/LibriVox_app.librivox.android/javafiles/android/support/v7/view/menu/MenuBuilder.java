// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.*;
import android.content.pm.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.a.c;
import android.support.v4.c.a.a;
import android.support.v4.view.ag;
import android.support.v4.view.d;
import android.util.SparseArray;
import android.view.*;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package android.support.v7.view.menu:
//			MenuItemImpl, MenuPresenter, a

public class MenuBuilder
	implements a
{

	public MenuBuilder(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		p = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #57  <Field int p>
		r = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #59  <Field boolean r>
		s = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #61  <Field boolean s>
		t = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #63  <Field boolean t>
		u = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #65  <Field boolean u>
		v = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #67  <Field boolean v>
		w = new ArrayList();
	//   20   34:aload_0         
	//   21   35:new             #69  <Class ArrayList>
	//   22   38:dup             
	//   23   39:invokespecial   #70  <Method void ArrayList()>
	//   24   42:putfield        #72  <Field ArrayList w>
		x = new CopyOnWriteArrayList();
	//   25   45:aload_0         
	//   26   46:new             #74  <Class CopyOnWriteArrayList>
	//   27   49:dup             
	//   28   50:invokespecial   #75  <Method void CopyOnWriteArrayList()>
	//   29   53:putfield        #77  <Field CopyOnWriteArrayList x>
		z = false;
	//   30   56:aload_0         
	//   31   57:iconst_0        
	//   32   58:putfield        #79  <Field boolean z>
		e = context;
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:putfield        #81  <Field Context e>
		f = context.getResources();
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:invokevirtual   #87  <Method Resources Context.getResources()>
	//   39   71:putfield        #89  <Field Resources f>
		j = new ArrayList();
	//   40   74:aload_0         
	//   41   75:new             #69  <Class ArrayList>
	//   42   78:dup             
	//   43   79:invokespecial   #70  <Method void ArrayList()>
	//   44   82:putfield        #91  <Field ArrayList j>
		k = new ArrayList();
	//   45   85:aload_0         
	//   46   86:new             #69  <Class ArrayList>
	//   47   89:dup             
	//   48   90:invokespecial   #70  <Method void ArrayList()>
	//   49   93:putfield        #93  <Field ArrayList k>
		l = true;
	//   50   96:aload_0         
	//   51   97:iconst_1        
	//   52   98:putfield        #95  <Field boolean l>
		m = new ArrayList();
	//   53  101:aload_0         
	//   54  102:new             #69  <Class ArrayList>
	//   55  105:dup             
	//   56  106:invokespecial   #70  <Method void ArrayList()>
	//   57  109:putfield        #97  <Field ArrayList m>
		n = new ArrayList();
	//   58  112:aload_0         
	//   59  113:new             #69  <Class ArrayList>
	//   60  116:dup             
	//   61  117:invokespecial   #70  <Method void ArrayList()>
	//   62  120:putfield        #99  <Field ArrayList n>
		o = true;
	//   63  123:aload_0         
	//   64  124:iconst_1        
	//   65  125:putfield        #101 <Field boolean o>
		e(true);
	//   66  128:aload_0         
	//   67  129:iconst_1        
	//   68  130:invokespecial   #104 <Method void e(boolean)>
	//   69  133:return          
	}

	private static int a(ArrayList arraylist, int i1)
	{
		for(int j1 = arraylist.size() - 1; j1 >= 0; j1--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #109 <Method int ArrayList.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iflt            37
			if(((MenuItemImpl)arraylist.get(j1)).getOrdering() <= i1)
	//*   7   11:aload_0         
	//*   8   12:iload_2         
	//*   9   13:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//*  10   16:checkcast       #115 <Class MenuItemImpl>
	//*  11   19:invokevirtual   #118 <Method int MenuItemImpl.getOrdering()>
	//*  12   22:iload_1         
	//*  13   23:icmpgt          30
				return j1 + 1;
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:ireturn         

	//   18   30:iload_2         
	//   19   31:iconst_1        
	//   20   32:isub            
	//   21   33:istore_2        
	//*  22   34:goto            7
		return 0;
	//   23   37:iconst_0        
	//   24   38:ireturn         
	}

	private MenuItemImpl a(int i1, int j1, int k1, int l1, CharSequence charsequence, int i2)
	{
		return new MenuItemImpl(this, i1, j1, k1, l1, charsequence, i2);
	//    0    0:new             #115 <Class MenuItemImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:aload           5
	//    8   12:iload           6
	//    9   14:invokespecial   #122 <Method void MenuItemImpl(MenuBuilder, int, int, int, int, CharSequence, int)>
	//   10   17:areturn         
	}

	private void a(int i1, CharSequence charsequence, int j1, Drawable drawable, View view)
	{
		Resources resources = e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #125 <Method Resources e()>
	//    2    4:astore          6
		if(view != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          30
		{
			c = view;
	//    5   11:aload_0         
	//    6   12:aload           5
	//    7   14:putfield        #127 <Field View c>
			a = null;
	//    8   17:aload_0         
	//    9   18:aconst_null     
	//   10   19:putfield        #129 <Field CharSequence a>
			b = null;
	//   11   22:aload_0         
	//   12   23:aconst_null     
	//   13   24:putfield        #131 <Field Drawable b>
		} else
	//*  14   27:goto            91
		{
			if(i1 > 0)
	//*  15   30:iload_1         
	//*  16   31:ifle            47
				a = resources.getText(i1);
	//   17   34:aload_0         
	//   18   35:aload           6
	//   19   37:iload_1         
	//   20   38:invokevirtual   #137 <Method CharSequence Resources.getText(int)>
	//   21   41:putfield        #129 <Field CharSequence a>
			else
	//*  22   44:goto            56
			if(charsequence != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          56
				a = charsequence;
	//   25   51:aload_0         
	//   26   52:aload_2         
	//   27   53:putfield        #129 <Field CharSequence a>
			if(j1 > 0)
	//*  28   56:iload_3         
	//*  29   57:ifle            75
				b = android.support.v4.a.c.a(f(), j1);
	//   30   60:aload_0         
	//   31   61:aload_0         
	//   32   62:invokevirtual   #140 <Method Context f()>
	//   33   65:iload_3         
	//   34   66:invokestatic    #145 <Method Drawable c.a(Context, int)>
	//   35   69:putfield        #131 <Field Drawable b>
			else
	//*  36   72:goto            86
			if(drawable != null)
	//*  37   75:aload           4
	//*  38   77:ifnull          86
				b = drawable;
	//   39   80:aload_0         
	//   40   81:aload           4
	//   41   83:putfield        #131 <Field Drawable b>
			c = null;
	//   42   86:aload_0         
	//   43   87:aconst_null     
	//   44   88:putfield        #127 <Field View c>
		}
		a(false);
	//   45   91:aload_0         
	//   46   92:iconst_0        
	//   47   93:invokevirtual   #147 <Method void a(boolean)>
	//   48   96:return          
	}

	private void a(int i1, boolean flag)
	{
		if(i1 >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            35
		{
			if(i1 >= j.size())
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #91  <Field ArrayList j>
	//*   5    9:invokevirtual   #109 <Method int ArrayList.size()>
	//*   6   12:icmplt          16
				return;
	//    7   15:return          
			j.remove(i1);
	//    8   16:aload_0         
	//    9   17:getfield        #91  <Field ArrayList j>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #151 <Method Object ArrayList.remove(int)>
	//   12   24:pop             
			if(flag)
	//*  13   25:iload_2         
	//*  14   26:ifeq            34
				a(true);
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #147 <Method void a(boolean)>
			return;
	//   18   34:return          
		} else
		{
			return;
	//   19   35:return          
		}
	}

	private boolean a(android.support.v7.view.menu.a a1, MenuPresenter menupresenter)
	{
		boolean flag1 = x.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field CopyOnWriteArrayList x>
	//    2    4:invokevirtual   #156 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//    3    7:istore          4
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		if(flag1)
	//*   6   11:iload           4
	//*   7   13:ifeq            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		if(menupresenter != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          30
			flag = menupresenter.onSubMenuSelected(a1);
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokeinterface #162 <Method boolean MenuPresenter.onSubMenuSelected(android.support.v7.view.menu.a)>
	//   15   29:istore_3        
		menupresenter = ((MenuPresenter) (x.iterator()));
	//   16   30:aload_0         
	//   17   31:getfield        #77  <Field CopyOnWriteArrayList x>
	//   18   34:invokevirtual   #166 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   37:astore_2        
		do
		{
			if(!((Iterator) (menupresenter)).hasNext())
				break;
	//   20   38:aload_2         
	//   21   39:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            102
			WeakReference weakreference = (WeakReference)((Iterator) (menupresenter)).next();
	//   23   47:aload_2         
	//   24   48:invokeinterface #175 <Method Object Iterator.next()>
	//   25   53:checkcast       #177 <Class WeakReference>
	//   26   56:astore          5
			MenuPresenter menupresenter1 = (MenuPresenter)weakreference.get();
	//   27   58:aload           5
	//   28   60:invokevirtual   #179 <Method Object WeakReference.get()>
	//   29   63:checkcast       #158 <Class MenuPresenter>
	//   30   66:astore          6
			if(menupresenter1 == null)
	//*  31   68:aload           6
	//*  32   70:ifnonnull       86
				x.remove(((Object) (weakreference)));
	//   33   73:aload_0         
	//   34   74:getfield        #77  <Field CopyOnWriteArrayList x>
	//   35   77:aload           5
	//   36   79:invokevirtual   #182 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   37   82:pop             
			else
	//*  38   83:goto            38
			if(!flag)
	//*  39   86:iload_3         
	//*  40   87:ifne            38
				flag = menupresenter1.onSubMenuSelected(a1);
	//   41   90:aload           6
	//   42   92:aload_1         
	//   43   93:invokeinterface #162 <Method boolean MenuPresenter.onSubMenuSelected(android.support.v7.view.menu.a)>
	//   44   98:istore_3        
		} while(true);
	//   45   99:goto            38
		return flag;
	//   46  102:iload_3         
	//   47  103:ireturn         
	}

	private void d(boolean flag)
	{
		if(x.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field CopyOnWriteArrayList x>
	//*   2    4:invokevirtual   #156 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		h();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #184 <Method void h()>
		for(Iterator iterator = x.iterator(); iterator.hasNext();)
	//*   7   15:aload_0         
	//*   8   16:getfield        #77  <Field CopyOnWriteArrayList x>
	//*   9   19:invokevirtual   #166 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  10   22:astore_2        
	//*  11   23:aload_2         
	//*  12   24:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//*  13   29:ifeq            79
		{
			WeakReference weakreference = (WeakReference)iterator.next();
	//   14   32:aload_2         
	//   15   33:invokeinterface #175 <Method Object Iterator.next()>
	//   16   38:checkcast       #177 <Class WeakReference>
	//   17   41:astore_3        
			MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   18   42:aload_3         
	//   19   43:invokevirtual   #179 <Method Object WeakReference.get()>
	//   20   46:checkcast       #158 <Class MenuPresenter>
	//   21   49:astore          4
			if(menupresenter == null)
	//*  22   51:aload           4
	//*  23   53:ifnonnull       68
				x.remove(((Object) (weakreference)));
	//   24   56:aload_0         
	//   25   57:getfield        #77  <Field CopyOnWriteArrayList x>
	//   26   60:aload_3         
	//   27   61:invokevirtual   #182 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   28   64:pop             
			else
	//*  29   65:goto            23
				menupresenter.updateMenuView(flag);
	//   30   68:aload           4
	//   31   70:iload_1         
	//   32   71:invokeinterface #187 <Method void MenuPresenter.updateMenuView(boolean)>
		}

	//*  33   76:goto            23
		i();
	//   34   79:aload_0         
	//   35   80:invokevirtual   #189 <Method void i()>
	//   36   83:return          
	}

	private void e(Bundle bundle)
	{
		if(x.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field CopyOnWriteArrayList x>
	//*   2    4:invokevirtual   #156 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		SparseArray sparsearray = new SparseArray();
	//    5   11:new             #192 <Class SparseArray>
	//    6   14:dup             
	//    7   15:invokespecial   #193 <Method void SparseArray()>
	//    8   18:astore_3        
		Iterator iterator = x.iterator();
	//    9   19:aload_0         
	//   10   20:getfield        #77  <Field CopyOnWriteArrayList x>
	//   11   23:invokevirtual   #166 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   12   26:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   13   28:aload           4
	//   14   30:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            114
			WeakReference weakreference = (WeakReference)iterator.next();
	//   16   38:aload           4
	//   17   40:invokeinterface #175 <Method Object Iterator.next()>
	//   18   45:checkcast       #177 <Class WeakReference>
	//   19   48:astore          5
			MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   20   50:aload           5
	//   21   52:invokevirtual   #179 <Method Object WeakReference.get()>
	//   22   55:checkcast       #158 <Class MenuPresenter>
	//   23   58:astore          6
			if(menupresenter == null)
	//*  24   60:aload           6
	//*  25   62:ifnonnull       78
			{
				x.remove(((Object) (weakreference)));
	//   26   65:aload_0         
	//   27   66:getfield        #77  <Field CopyOnWriteArrayList x>
	//   28   69:aload           5
	//   29   71:invokevirtual   #182 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   30   74:pop             
			} else
	//*  31   75:goto            28
			{
				int i1 = menupresenter.getId();
	//   32   78:aload           6
	//   33   80:invokeinterface #196 <Method int MenuPresenter.getId()>
	//   34   85:istore_2        
				if(i1 > 0)
	//*  35   86:iload_2         
	//*  36   87:ifle            28
				{
					Parcelable parcelable = menupresenter.onSaveInstanceState();
	//   37   90:aload           6
	//   38   92:invokeinterface #200 <Method Parcelable MenuPresenter.onSaveInstanceState()>
	//   39   97:astore          5
					if(parcelable != null)
	//*  40   99:aload           5
	//*  41  101:ifnull          28
						sparsearray.put(i1, ((Object) (parcelable)));
	//   42  104:aload_3         
	//   43  105:iload_2         
	//   44  106:aload           5
	//   45  108:invokevirtual   #204 <Method void SparseArray.put(int, Object)>
				}
			}
		} while(true);
	//   46  111:goto            28
		bundle.putSparseParcelableArray("android:menu:presenters", sparsearray);
	//   47  114:aload_1         
	//   48  115:ldc1            #206 <String "android:menu:presenters">
	//   49  117:aload_3         
	//   50  118:invokevirtual   #212 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
	//   51  121:return          
	}

	private void e(boolean flag)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(flag && f.getConfiguration().keyboard != 1 && ag.c(ViewConfiguration.get(e), e))
	//*   2    2:iload_1         
	//*   3    3:ifeq            42
	//*   4    6:aload_0         
	//*   5    7:getfield        #89  <Field Resources f>
	//*   6   10:invokevirtual   #216 <Method Configuration Resources.getConfiguration()>
	//*   7   13:getfield        #221 <Field int Configuration.keyboard>
	//*   8   16:iconst_1        
	//*   9   17:icmpeq          42
	//*  10   20:aload_0         
	//*  11   21:getfield        #81  <Field Context e>
	//*  12   24:invokestatic    #226 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//*  13   27:aload_0         
	//*  14   28:getfield        #81  <Field Context e>
	//*  15   31:invokestatic    #231 <Method boolean ag.c(ViewConfiguration, Context)>
	//*  16   34:ifeq            42
			flag = flag1;
	//   17   37:iload_2         
	//   18   38:istore_1        
		else
	//*  19   39:goto            44
			flag = false;
	//   20   42:iconst_0        
	//   21   43:istore_1        
		h = flag;
	//   22   44:aload_0         
	//   23   45:iload_1         
	//   24   46:putfield        #233 <Field boolean h>
	//   25   49:return          
	}

	private static int f(int i1)
	{
		int j1 = (0xffff0000 & i1) >> 16;
	//    0    0:ldc1            #235 <Int 0xffff0000>
	//    1    2:iload_0         
	//    2    3:iand            
	//    3    4:bipush          16
	//    4    6:ishr            
	//    5    7:istore_1        
		if(j1 >= 0)
	//*   6    8:iload_1         
	//*   7    9:iflt            34
		{
			int ai[] = d;
	//    8   12:getstatic       #50  <Field int[] d>
	//    9   15:astore_2        
			if(j1 < ai.length)
	//*  10   16:iload_1         
	//*  11   17:aload_2         
	//*  12   18:arraylength     
	//*  13   19:icmpge          34
				return i1 & 0xffff | ai[j1] << 16;
	//   14   22:iload_0         
	//   15   23:ldc1            #236 <Int 65535>
	//   16   25:iand            
	//   17   26:aload_2         
	//   18   27:iload_1         
	//   19   28:iaload          
	//   20   29:bipush          16
	//   21   31:ishl            
	//   22   32:ior             
	//   23   33:ireturn         
		}
		throw new IllegalArgumentException("order does not contain a valid category.");
	//   24   34:new             #238 <Class IllegalArgumentException>
	//   25   37:dup             
	//   26   38:ldc1            #240 <String "order does not contain a valid category.">
	//   27   40:invokespecial   #243 <Method void IllegalArgumentException(String)>
	//   28   43:athrow          
	}

	private void f(Bundle bundle)
	{
		bundle = ((Bundle) (bundle.getSparseParcelableArray("android:menu:presenters")));
	//    0    0:aload_1         
	//    1    1:ldc1            #206 <String "android:menu:presenters">
	//    2    3:invokevirtual   #247 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//    3    6:astore_1        
		if(bundle != null)
	//*   4    7:aload_1         
	//*   5    8:ifnull          118
		{
			if(x.isEmpty())
	//*   6   11:aload_0         
	//*   7   12:getfield        #77  <Field CopyOnWriteArrayList x>
	//*   8   15:invokevirtual   #156 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//*   9   18:ifeq            22
				return;
	//   10   21:return          
			Iterator iterator = x.iterator();
	//   11   22:aload_0         
	//   12   23:getfield        #77  <Field CopyOnWriteArrayList x>
	//   13   26:invokevirtual   #166 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   14   29:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   15   30:aload_3         
	//   16   31:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//   17   36:ifeq            117
				WeakReference weakreference = (WeakReference)iterator.next();
	//   18   39:aload_3         
	//   19   40:invokeinterface #175 <Method Object Iterator.next()>
	//   20   45:checkcast       #177 <Class WeakReference>
	//   21   48:astore          5
				MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   22   50:aload           5
	//   23   52:invokevirtual   #179 <Method Object WeakReference.get()>
	//   24   55:checkcast       #158 <Class MenuPresenter>
	//   25   58:astore          4
				if(menupresenter == null)
	//*  26   60:aload           4
	//*  27   62:ifnonnull       78
				{
					x.remove(((Object) (weakreference)));
	//   28   65:aload_0         
	//   29   66:getfield        #77  <Field CopyOnWriteArrayList x>
	//   30   69:aload           5
	//   31   71:invokevirtual   #182 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   32   74:pop             
				} else
	//*  33   75:goto            30
				{
					int i1 = menupresenter.getId();
	//   34   78:aload           4
	//   35   80:invokeinterface #196 <Method int MenuPresenter.getId()>
	//   36   85:istore_2        
					if(i1 > 0)
	//*  37   86:iload_2         
	//*  38   87:ifle            30
					{
						Parcelable parcelable = (Parcelable)((SparseArray) (bundle)).get(i1);
	//   39   90:aload_1         
	//   40   91:iload_2         
	//   41   92:invokevirtual   #248 <Method Object SparseArray.get(int)>
	//   42   95:checkcast       #250 <Class Parcelable>
	//   43   98:astore          5
						if(parcelable != null)
	//*  44  100:aload           5
	//*  45  102:ifnull          30
							menupresenter.onRestoreInstanceState(parcelable);
	//   46  105:aload           4
	//   47  107:aload           5
	//   48  109:invokeinterface #254 <Method void MenuPresenter.onRestoreInstanceState(Parcelable)>
					}
				}
			} while(true);
	//   49  114:goto            30
			return;
	//   50  117:return          
		} else
		{
			return;
	//   51  118:return          
		}
	}

	public int a(int i1, int j1)
	{
		int l1 = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #256 <Method int size()>
	//    2    4:istore          4
		int k1 = j1;
	//    3    6:iload_2         
	//    4    7:istore_3        
		if(j1 < 0)
	//*   5    8:iload_2         
	//*   6    9:ifge            14
			k1 = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		for(; k1 < l1; k1++)
	//*   9   14:iload_3         
	//*  10   15:iload           4
	//*  11   17:icmpge          47
			if(((MenuItemImpl)j.get(k1)).getGroupId() == i1)
	//*  12   20:aload_0         
	//*  13   21:getfield        #91  <Field ArrayList j>
	//*  14   24:iload_3         
	//*  15   25:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//*  16   28:checkcast       #115 <Class MenuItemImpl>
	//*  17   31:invokevirtual   #259 <Method int MenuItemImpl.getGroupId()>
	//*  18   34:iload_1         
	//*  19   35:icmpne          40
				return k1;
	//   20   38:iload_3         
	//   21   39:ireturn         

	//   22   40:iload_3         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_3        
	//*  26   44:goto            14
		return -1;
	//   27   47:iconst_m1       
	//   28   48:ireturn         
	}

	public MenuBuilder a(int i1)
	{
		p = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field int p>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected MenuBuilder a(Drawable drawable)
	{
		a(0, ((CharSequence) (null)), 0, drawable, ((View) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:aload_1         
	//    5    5:aconst_null     
	//    6    6:invokespecial   #263 <Method void a(int, CharSequence, int, Drawable, View)>
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
	}

	protected MenuBuilder a(View view)
	{
		a(0, ((CharSequence) (null)), 0, ((Drawable) (null)), view);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:aconst_null     
	//    5    5:aload_1         
	//    6    6:invokespecial   #263 <Method void a(int, CharSequence, int, Drawable, View)>
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
	}

	protected MenuBuilder a(CharSequence charsequence)
	{
		a(0, charsequence, 0, ((Drawable) (null)), ((View) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #263 <Method void a(int, CharSequence, int, Drawable, View)>
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
	}

	MenuItemImpl a(int i1, KeyEvent keyevent)
	{
		ArrayList arraylist = w;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ArrayList w>
	//    2    4:astore          8
		arraylist.clear();
	//    3    6:aload           8
	//    4    8:invokevirtual   #269 <Method void ArrayList.clear()>
		a(((List) (arraylist)), i1, keyevent);
	//    5   11:aload_0         
	//    6   12:aload           8
	//    7   14:iload_1         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #272 <Method void a(List, int, KeyEvent)>
		if(arraylist.isEmpty())
	//*  10   19:aload           8
	//*  11   21:invokevirtual   #273 <Method boolean ArrayList.isEmpty()>
	//*  12   24:ifeq            29
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
		int k1 = keyevent.getMetaState();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #278 <Method int KeyEvent.getMetaState()>
	//   17   33:istore          5
		android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
	//   18   35:new             #280 <Class android.view.KeyCharacterMap$KeyData>
	//   19   38:dup             
	//   20   39:invokespecial   #281 <Method void android.view.KeyCharacterMap$KeyData()>
	//   21   42:astore          9
		keyevent.getKeyData(keydata);
	//   22   44:aload_2         
	//   23   45:aload           9
	//   24   47:invokevirtual   #285 <Method boolean KeyEvent.getKeyData(android.view.KeyCharacterMap$KeyData)>
	//   25   50:pop             
		int l1 = arraylist.size();
	//   26   51:aload           8
	//   27   53:invokevirtual   #109 <Method int ArrayList.size()>
	//   28   56:istore          6
		if(l1 == 1)
	//*  29   58:iload           6
	//*  30   60:iconst_1        
	//*  31   61:icmpne          74
			return (MenuItemImpl)arraylist.get(0);
	//   32   64:aload           8
	//   33   66:iconst_0        
	//   34   67:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//   35   70:checkcast       #115 <Class MenuItemImpl>
	//   36   73:areturn         
		boolean flag = c();
	//   37   74:aload_0         
	//   38   75:invokevirtual   #287 <Method boolean c()>
	//   39   78:istore          7
		for(int j1 = 0; j1 < l1; j1++)
	//*  40   80:iconst_0        
	//*  41   81:istore_3        
	//*  42   82:iload_3         
	//*  43   83:iload           6
	//*  44   85:icmpge          183
		{
			keyevent = ((KeyEvent) ((MenuItemImpl)arraylist.get(j1)));
	//   45   88:aload           8
	//   46   90:iload_3         
	//   47   91:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//   48   94:checkcast       #115 <Class MenuItemImpl>
	//   49   97:astore_2        
			char c1;
			if(flag)
	//*  50   98:iload           7
	//*  51  100:ifeq            112
				c1 = ((MenuItemImpl) (keyevent)).getAlphabeticShortcut();
	//   52  103:aload_2         
	//   53  104:invokevirtual   #291 <Method char MenuItemImpl.getAlphabeticShortcut()>
	//   54  107:istore          4
			else
	//*  55  109:goto            118
				c1 = ((MenuItemImpl) (keyevent)).getNumericShortcut();
	//   56  112:aload_2         
	//   57  113:invokevirtual   #294 <Method char MenuItemImpl.getNumericShortcut()>
	//   58  116:istore          4
			if(c1 == keydata.meta[0] && (k1 & 2) == 0 || c1 == keydata.meta[2] && (k1 & 2) != 0 || flag && c1 == '\b' && i1 == 67)
	//*  59  118:iload           4
	//*  60  120:aload           9
	//*  61  122:getfield        #298 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  62  125:iconst_0        
	//*  63  126:caload          
	//*  64  127:icmpne          137
	//*  65  130:iload           5
	//*  66  132:iconst_2        
	//*  67  133:iand            
	//*  68  134:ifeq            174
	//*  69  137:iload           4
	//*  70  139:aload           9
	//*  71  141:getfield        #298 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  72  144:iconst_2        
	//*  73  145:caload          
	//*  74  146:icmpne          156
	//*  75  149:iload           5
	//*  76  151:iconst_2        
	//*  77  152:iand            
	//*  78  153:ifne            174
	//*  79  156:iload           7
	//*  80  158:ifeq            176
	//*  81  161:iload           4
	//*  82  163:bipush          8
	//*  83  165:icmpne          176
	//*  84  168:iload_1         
	//*  85  169:bipush          67
	//*  86  171:icmpne          176
				return ((MenuItemImpl) (keyevent));
	//   87  174:aload_2         
	//   88  175:areturn         
		}

	//   89  176:iload_3         
	//   90  177:iconst_1        
	//   91  178:iadd            
	//   92  179:istore_3        
	//*  93  180:goto            82
		return null;
	//   94  183:aconst_null     
	//   95  184:areturn         
	}

	protected MenuItem a(int i1, int j1, int k1, CharSequence charsequence)
	{
		int l1 = f(k1);
	//    0    0:iload_3         
	//    1    1:invokestatic    #301 <Method int f(int)>
	//    2    4:istore          5
		charsequence = ((CharSequence) (a(i1, j1, k1, l1, charsequence, p)));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iload_2         
	//    6    9:iload_3         
	//    7   10:iload           5
	//    8   12:aload           4
	//    9   14:aload_0         
	//   10   15:getfield        #57  <Field int p>
	//   11   18:invokespecial   #303 <Method MenuItemImpl a(int, int, int, int, CharSequence, int)>
	//   12   21:astore          4
		Object obj = ((Object) (q));
	//   13   23:aload_0         
	//   14   24:getfield        #305 <Field android.view.ContextMenu$ContextMenuInfo q>
	//   15   27:astore          6
		if(obj != null)
	//*  16   29:aload           6
	//*  17   31:ifnull          41
			((MenuItemImpl) (charsequence)).setMenuInfo(((android.view.ContextMenu.ContextMenuInfo) (obj)));
	//   18   34:aload           4
	//   19   36:aload           6
	//   20   38:invokevirtual   #309 <Method void MenuItemImpl.setMenuInfo(android.view.ContextMenu$ContextMenuInfo)>
		obj = ((Object) (j));
	//   21   41:aload_0         
	//   22   42:getfield        #91  <Field ArrayList j>
	//   23   45:astore          6
		((ArrayList) (obj)).add(a(((ArrayList) (obj)), l1), ((Object) (charsequence)));
	//   24   47:aload           6
	//   25   49:aload           6
	//   26   51:iload           5
	//   27   53:invokestatic    #311 <Method int a(ArrayList, int)>
	//   28   56:aload           4
	//   29   58:invokevirtual   #314 <Method void ArrayList.add(int, Object)>
		a(true);
	//   30   61:aload_0         
	//   31   62:iconst_1        
	//   32   63:invokevirtual   #147 <Method void a(boolean)>
		return ((MenuItem) (charsequence));
	//   33   66:aload           4
	//   34   68:areturn         
	}

	protected String a()
	{
		return "android:menu:actionviewstates";
	//    0    0:ldc2            #317 <String "android:menu:actionviewstates">
	//    1    3:areturn         
	}

	public void a(Bundle bundle)
	{
		e(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #319 <Method void e(Bundle)>
	//    3    5:return          
	}

	public void a(Callback callback)
	{
		i = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #322 <Field MenuBuilder$Callback i>
	//    3    5:return          
	}

	void a(MenuItemImpl menuitemimpl)
	{
		l = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #95  <Field boolean l>
		a(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #147 <Method void a(boolean)>
	//    6   10:return          
	}

	public void a(MenuPresenter menupresenter)
	{
		a(menupresenter, e);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #81  <Field Context e>
	//    4    6:invokevirtual   #327 <Method void a(MenuPresenter, Context)>
	//    5    9:return          
	}

	public void a(MenuPresenter menupresenter, Context context)
	{
		x.add(((Object) (new WeakReference(((Object) (menupresenter))))));
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field CopyOnWriteArrayList x>
	//    2    4:new             #177 <Class WeakReference>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #330 <Method void WeakReference(Object)>
	//    6   12:invokevirtual   #332 <Method boolean CopyOnWriteArrayList.add(Object)>
	//    7   15:pop             
		menupresenter.initForMenu(context, this);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokeinterface #336 <Method void MenuPresenter.initForMenu(Context, MenuBuilder)>
		o = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #101 <Field boolean o>
	//   15   29:return          
	}

	void a(MenuItem menuitem)
	{
		int j1 = menuitem.getGroupId();
	//    0    0:aload_1         
	//    1    1:invokeinterface #340 <Method int MenuItem.getGroupId()>
	//    2    6:istore_3        
		int k1 = j.size();
	//    3    7:aload_0         
	//    4    8:getfield        #91  <Field ArrayList j>
	//    5   11:invokevirtual   #109 <Method int ArrayList.size()>
	//    6   14:istore          4
		h();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #184 <Method void h()>
		for(int i1 = 0; i1 < k1; i1++)
	//*   9   20:iconst_0        
	//*  10   21:istore_2        
	//*  11   22:iload_2         
	//*  12   23:iload           4
	//*  13   25:icmpge          101
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)j.get(i1);
	//   14   28:aload_0         
	//   15   29:getfield        #91  <Field ArrayList j>
	//   16   32:iload_2         
	//   17   33:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//   18   36:checkcast       #115 <Class MenuItemImpl>
	//   19   39:astore          6
			if(menuitemimpl.getGroupId() != j1 || !menuitemimpl.isExclusiveCheckable() || !menuitemimpl.isCheckable())
	//*  20   41:aload           6
	//*  21   43:invokevirtual   #259 <Method int MenuItemImpl.getGroupId()>
	//*  22   46:iload_3         
	//*  23   47:icmpne          94
	//*  24   50:aload           6
	//*  25   52:invokevirtual   #343 <Method boolean MenuItemImpl.isExclusiveCheckable()>
	//*  26   55:ifne            61
	//*  27   58:goto            94
	//*  28   61:aload           6
	//*  29   63:invokevirtual   #346 <Method boolean MenuItemImpl.isCheckable()>
	//*  30   66:ifne            72
				continue;
	//   31   69:goto            94
			boolean flag;
			if(menuitemimpl == menuitem)
	//*  32   72:aload           6
	//*  33   74:aload_1         
	//*  34   75:if_acmpne       84
				flag = true;
	//   35   78:iconst_1        
	//   36   79:istore          5
			else
	//*  37   81:goto            87
				flag = false;
	//   38   84:iconst_0        
	//   39   85:istore          5
			menuitemimpl.setCheckedInt(flag);
	//   40   87:aload           6
	//   41   89:iload           5
	//   42   91:invokevirtual   #349 <Method void MenuItemImpl.setCheckedInt(boolean)>
		}

	//   43   94:iload_2         
	//   44   95:iconst_1        
	//   45   96:iadd            
	//   46   97:istore_2        
	//*  47   98:goto            22
		i();
	//   48  101:aload_0         
	//   49  102:invokevirtual   #189 <Method void i()>
	//   50  105:return          
	}

	void a(List list, int i1, KeyEvent keyevent)
	{
		boolean flag = c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method boolean c()>
	//    2    4:istore          9
		int l1 = keyevent.getModifiers();
	//    3    6:aload_3         
	//    4    7:invokevirtual   #352 <Method int KeyEvent.getModifiers()>
	//    5   10:istore          7
		android.view.KeyCharacterMap.KeyData keydata = new android.view.KeyCharacterMap.KeyData();
	//    6   12:new             #280 <Class android.view.KeyCharacterMap$KeyData>
	//    7   15:dup             
	//    8   16:invokespecial   #281 <Method void android.view.KeyCharacterMap$KeyData()>
	//    9   19:astore          10
		if(!keyevent.getKeyData(keydata) && i1 != 67)
	//*  10   21:aload_3         
	//*  11   22:aload           10
	//*  12   24:invokevirtual   #285 <Method boolean KeyEvent.getKeyData(android.view.KeyCharacterMap$KeyData)>
	//*  13   27:ifne            37
	//*  14   30:iload_2         
	//*  15   31:bipush          67
	//*  16   33:icmpeq          37
			return;
	//   17   36:return          
		int i2 = j.size();
	//   18   37:aload_0         
	//   19   38:getfield        #91  <Field ArrayList j>
	//   20   41:invokevirtual   #109 <Method int ArrayList.size()>
	//   21   44:istore          8
		for(int j1 = 0; j1 < i2; j1++)
	//*  22   46:iconst_0        
	//*  23   47:istore          4
	//*  24   49:iload           4
	//*  25   51:iload           8
	//*  26   53:icmpge          238
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)j.get(j1);
	//   27   56:aload_0         
	//   28   57:getfield        #91  <Field ArrayList j>
	//   29   60:iload           4
	//   30   62:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//   31   65:checkcast       #115 <Class MenuItemImpl>
	//   32   68:astore          11
			if(menuitemimpl.hasSubMenu())
	//*  33   70:aload           11
	//*  34   72:invokevirtual   #355 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  35   75:ifeq            92
				((MenuBuilder)menuitemimpl.getSubMenu()).a(list, i1, keyevent);
	//   36   78:aload           11
	//   37   80:invokevirtual   #359 <Method SubMenu MenuItemImpl.getSubMenu()>
	//   38   83:checkcast       #2   <Class MenuBuilder>
	//   39   86:aload_1         
	//   40   87:iload_2         
	//   41   88:aload_3         
	//   42   89:invokevirtual   #272 <Method void a(List, int, KeyEvent)>
			char c1;
			if(flag)
	//*  43   92:iload           9
	//*  44   94:ifeq            107
				c1 = menuitemimpl.getAlphabeticShortcut();
	//   45   97:aload           11
	//   46   99:invokevirtual   #291 <Method char MenuItemImpl.getAlphabeticShortcut()>
	//   47  102:istore          5
			else
	//*  48  104:goto            114
				c1 = menuitemimpl.getNumericShortcut();
	//   49  107:aload           11
	//   50  109:invokevirtual   #294 <Method char MenuItemImpl.getNumericShortcut()>
	//   51  112:istore          5
			int k1;
			if(flag)
	//*  52  114:iload           9
	//*  53  116:ifeq            129
				k1 = menuitemimpl.getAlphabeticModifiers();
	//   54  119:aload           11
	//   55  121:invokevirtual   #362 <Method int MenuItemImpl.getAlphabeticModifiers()>
	//   56  124:istore          6
			else
	//*  57  126:goto            136
				k1 = menuitemimpl.getNumericModifiers();
	//   58  129:aload           11
	//   59  131:invokevirtual   #365 <Method int MenuItemImpl.getNumericModifiers()>
	//   60  134:istore          6
			if((l1 & 0x1100f) == (k1 & 0x1100f))
	//*  61  136:iload           7
	//*  62  138:ldc2            #366 <Int 0x1100f>
	//*  63  141:iand            
	//*  64  142:iload           6
	//*  65  144:ldc2            #366 <Int 0x1100f>
	//*  66  147:iand            
	//*  67  148:icmpne          157
				k1 = 1;
	//   68  151:iconst_1        
	//   69  152:istore          6
			else
	//*  70  154:goto            160
				k1 = 0;
	//   71  157:iconst_0        
	//   72  158:istore          6
			if(k1 && c1 != 0 && (c1 == keydata.meta[0] || c1 == keydata.meta[2] || flag && c1 == '\b' && i1 == 67) && menuitemimpl.isEnabled())
	//*  73  160:iload           6
	//*  74  162:ifeq            229
	//*  75  165:iload           5
	//*  76  167:ifeq            229
	//*  77  170:iload           5
	//*  78  172:aload           10
	//*  79  174:getfield        #298 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  80  177:iconst_0        
	//*  81  178:caload          
	//*  82  179:icmpeq          212
	//*  83  182:iload           5
	//*  84  184:aload           10
	//*  85  186:getfield        #298 <Field char[] android.view.KeyCharacterMap$KeyData.meta>
	//*  86  189:iconst_2        
	//*  87  190:caload          
	//*  88  191:icmpeq          212
	//*  89  194:iload           9
	//*  90  196:ifeq            229
	//*  91  199:iload           5
	//*  92  201:bipush          8
	//*  93  203:icmpne          229
	//*  94  206:iload_2         
	//*  95  207:bipush          67
	//*  96  209:icmpne          229
	//*  97  212:aload           11
	//*  98  214:invokevirtual   #369 <Method boolean MenuItemImpl.isEnabled()>
	//*  99  217:ifeq            229
				list.add(((Object) (menuitemimpl)));
	//  100  220:aload_1         
	//  101  221:aload           11
	//  102  223:invokeinterface #372 <Method boolean List.add(Object)>
	//  103  228:pop             
		}

	//  104  229:iload           4
	//  105  231:iconst_1        
	//  106  232:iadd            
	//  107  233:istore          4
	//* 108  235:goto            49
	//  109  238:return          
	}

	public void a(boolean flag)
	{
		if(!r)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean r>
	//*   2    4:ifne            27
		{
			if(flag)
	//*   3    7:iload_1         
	//*   4    8:ifeq            21
			{
				l = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #95  <Field boolean l>
				o = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #101 <Field boolean o>
			}
			d(flag);
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:invokespecial   #374 <Method void d(boolean)>
			return;
	//   14   26:return          
		}
		s = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #61  <Field boolean s>
		if(flag)
	//*  18   32:iload_1         
	//*  19   33:ifeq            41
			t = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #63  <Field boolean t>
	//   23   41:return          
	}

	boolean a(MenuBuilder menubuilder, MenuItem menuitem)
	{
		Callback callback = i;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MenuBuilder$Callback i>
	//    2    4:astore_3        
		return callback != null && callback.onMenuItemSelected(menubuilder, menuitem);
	//    3    5:aload_3         
	//    4    6:ifnull          22
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #380 <Method boolean MenuBuilder$Callback.onMenuItemSelected(MenuBuilder, MenuItem)>
	//    9   17:ifeq            22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public boolean a(MenuItem menuitem, int i1)
	{
		return a(menuitem, ((MenuPresenter) (null)), i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:invokevirtual   #384 <Method boolean a(MenuItem, MenuPresenter, int)>
	//    5    7:ireturn         
	}

	public boolean a(MenuItem menuitem, MenuPresenter menupresenter, int i1)
	{
		Object obj = ((Object) ((MenuItemImpl)menuitem));
	//    0    0:aload_1         
	//    1    1:checkcast       #115 <Class MenuItemImpl>
	//    2    4:astore          7
		if(obj != null)
	//*   3    6:aload           7
	//*   4    8:ifnull          215
		{
			if(!((MenuItemImpl) (obj)).isEnabled())
	//*   5   11:aload           7
	//*   6   13:invokevirtual   #369 <Method boolean MenuItemImpl.isEnabled()>
	//*   7   16:ifne            21
				return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
			boolean flag2 = ((MenuItemImpl) (obj)).invoke();
	//   10   21:aload           7
	//   11   23:invokevirtual   #387 <Method boolean MenuItemImpl.invoke()>
	//   12   26:istore          6
			menuitem = ((MenuItem) (((MenuItemImpl) (obj)).getSupportActionProvider()));
	//   13   28:aload           7
	//   14   30:invokevirtual   #391 <Method d MenuItemImpl.getSupportActionProvider()>
	//   15   33:astore_1        
			boolean flag;
			if(menuitem != null && ((d) (menuitem)).hasSubMenu())
	//*  16   34:aload_1         
	//*  17   35:ifnull          51
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #394 <Method boolean d.hasSubMenu()>
	//*  20   42:ifeq            51
				flag = true;
	//   21   45:iconst_1        
	//   22   46:istore          4
			else
	//*  23   48:goto            54
				flag = false;
	//   24   51:iconst_0        
	//   25   52:istore          4
			boolean flag1;
			if(((MenuItemImpl) (obj)).hasCollapsibleActionView())
	//*  26   54:aload           7
	//*  27   56:invokevirtual   #397 <Method boolean MenuItemImpl.hasCollapsibleActionView()>
	//*  28   59:ifeq            89
			{
				flag2 |= ((MenuItemImpl) (obj)).expandActionView();
	//   29   62:iload           6
	//   30   64:aload           7
	//   31   66:invokevirtual   #400 <Method boolean MenuItemImpl.expandActionView()>
	//   32   69:ior             
	//   33   70:istore          6
				flag1 = flag2;
	//   34   72:iload           6
	//   35   74:istore          5
				if(flag2)
	//*  36   76:iload           6
	//*  37   78:ifeq            212
				{
					b(true);
	//   38   81:aload_0         
	//   39   82:iconst_1        
	//   40   83:invokevirtual   #402 <Method void b(boolean)>
					return flag2;
	//   41   86:iload           6
	//   42   88:ireturn         
				}
			} else
			if(!((MenuItemImpl) (obj)).hasSubMenu() && !flag)
	//*  43   89:aload           7
	//*  44   91:invokevirtual   #355 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  45   94:ifne            123
	//*  46   97:iload           4
	//*  47   99:ifeq            105
	//*  48  102:goto            123
			{
				flag1 = flag2;
	//   49  105:iload           6
	//   50  107:istore          5
				if((i1 & 1) == 0)
	//*  51  109:iload_3         
	//*  52  110:iconst_1        
	//*  53  111:iand            
	//*  54  112:ifne            212
				{
					b(true);
	//   55  115:aload_0         
	//   56  116:iconst_1        
	//   57  117:invokevirtual   #402 <Method void b(boolean)>
					return flag2;
	//   58  120:iload           6
	//   59  122:ireturn         
				}
			} else
			{
				if((i1 & 4) == 0)
	//*  60  123:iload_3         
	//*  61  124:iconst_4        
	//*  62  125:iand            
	//*  63  126:ifne            134
					b(false);
	//   64  129:aload_0         
	//   65  130:iconst_0        
	//   66  131:invokevirtual   #402 <Method void b(boolean)>
				if(!((MenuItemImpl) (obj)).hasSubMenu())
	//*  67  134:aload           7
	//*  68  136:invokevirtual   #355 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  69  139:ifne            161
					((MenuItemImpl) (obj)).setSubMenu(new android.support.v7.view.menu.a(f(), this, ((MenuItemImpl) (obj))));
	//   70  142:aload           7
	//   71  144:new             #404 <Class android.support.v7.view.menu.a>
	//   72  147:dup             
	//   73  148:aload_0         
	//   74  149:invokevirtual   #140 <Method Context f()>
	//   75  152:aload_0         
	//   76  153:aload           7
	//   77  155:invokespecial   #407 <Method void android.support.v7.view.menu.a(Context, MenuBuilder, MenuItemImpl)>
	//   78  158:invokevirtual   #411 <Method void MenuItemImpl.setSubMenu(android.support.v7.view.menu.a)>
				obj = ((Object) ((android.support.v7.view.menu.a)((MenuItemImpl) (obj)).getSubMenu()));
	//   79  161:aload           7
	//   80  163:invokevirtual   #359 <Method SubMenu MenuItemImpl.getSubMenu()>
	//   81  166:checkcast       #404 <Class android.support.v7.view.menu.a>
	//   82  169:astore          7
				if(flag)
	//*  83  171:iload           4
	//*  84  173:ifeq            182
					((d) (menuitem)).onPrepareSubMenu(((SubMenu) (obj)));
	//   85  176:aload_1         
	//   86  177:aload           7
	//   87  179:invokevirtual   #415 <Method void d.onPrepareSubMenu(SubMenu)>
				flag2 |= a(((android.support.v7.view.menu.a) (obj)), menupresenter);
	//   88  182:iload           6
	//   89  184:aload_0         
	//   90  185:aload           7
	//   91  187:aload_2         
	//   92  188:invokespecial   #417 <Method boolean a(android.support.v7.view.menu.a, MenuPresenter)>
	//   93  191:ior             
	//   94  192:istore          6
				flag1 = flag2;
	//   95  194:iload           6
	//   96  196:istore          5
				if(!flag2)
	//*  97  198:iload           6
	//*  98  200:ifne            212
				{
					b(true);
	//   99  203:aload_0         
	//  100  204:iconst_1        
	//  101  205:invokevirtual   #402 <Method void b(boolean)>
					flag1 = flag2;
	//  102  208:iload           6
	//  103  210:istore          5
				}
			}
			return flag1;
	//  104  212:iload           5
	//  105  214:ireturn         
		} else
		{
			return false;
	//  106  215:iconst_0        
	//  107  216:ireturn         
		}
	}

	public MenuItem add(int i1)
	{
		return a(0, 0, 0, ((CharSequence) (f.getString(i1))));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:getfield        #89  <Field Resources f>
	//    6    8:iload_1         
	//    7    9:invokevirtual   #422 <Method String Resources.getString(int)>
	//    8   12:invokevirtual   #424 <Method MenuItem a(int, int, int, CharSequence)>
	//    9   15:areturn         
	}

	public MenuItem add(int i1, int j1, int k1, int l1)
	{
		return a(i1, j1, k1, ((CharSequence) (f.getString(l1))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload_0         
	//    5    5:getfield        #89  <Field Resources f>
	//    6    8:iload           4
	//    7   10:invokevirtual   #422 <Method String Resources.getString(int)>
	//    8   13:invokevirtual   #424 <Method MenuItem a(int, int, int, CharSequence)>
	//    9   16:areturn         
	}

	public MenuItem add(int i1, int j1, int k1, CharSequence charsequence)
	{
		return a(i1, j1, k1, charsequence);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #424 <Method MenuItem a(int, int, int, CharSequence)>
	//    6    9:areturn         
	}

	public MenuItem add(CharSequence charsequence)
	{
		return a(0, 0, 0, charsequence);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:aload_1         
	//    5    5:invokevirtual   #424 <Method MenuItem a(int, int, int, CharSequence)>
	//    6    8:areturn         
	}

	public int addIntentOptions(int i1, int j1, int k1, ComponentName componentname, Intent aintent[], Intent intent, int l1, 
			MenuItem amenuitem[])
	{
		PackageManager packagemanager = e.getPackageManager();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context e>
	//    2    4:invokevirtual   #432 <Method PackageManager Context.getPackageManager()>
	//    3    7:astore          12
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore          11
		List list = packagemanager.queryIntentActivityOptions(componentname, aintent, intent, 0);
	//    6   12:aload           12
	//    7   14:aload           4
	//    8   16:aload           5
	//    9   18:aload           6
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #438 <Method List PackageManager.queryIntentActivityOptions(ComponentName, Intent[], Intent, int)>
	//   12   24:astore          13
		int i2;
		if(list != null)
	//*  13   26:aload           13
	//*  14   28:ifnull          43
			i2 = list.size();
	//   15   31:aload           13
	//   16   33:invokeinterface #439 <Method int List.size()>
	//   17   38:istore          9
		else
	//*  18   40:goto            46
			i2 = 0;
	//   19   43:iconst_0        
	//   20   44:istore          9
		int j2 = ((int) (flag));
	//   21   46:iload           11
	//   22   48:istore          10
		if((l1 & 1) == 0)
	//*  23   50:iload           7
	//*  24   52:iconst_1        
	//*  25   53:iand            
	//*  26   54:ifne            66
		{
			removeGroup(i1);
	//   27   57:aload_0         
	//   28   58:iload_1         
	//   29   59:invokevirtual   #443 <Method void removeGroup(int)>
			j2 = ((int) (flag));
	//   30   62:iload           11
	//   31   64:istore          10
		}
		for(; j2 < i2; j2++)
	//*  32   66:iload           10
	//*  33   68:iload           9
	//*  34   70:icmpge          222
		{
			ResolveInfo resolveinfo = (ResolveInfo)list.get(j2);
	//   35   73:aload           13
	//   36   75:iload           10
	//   37   77:invokeinterface #444 <Method Object List.get(int)>
	//   38   82:checkcast       #446 <Class ResolveInfo>
	//   39   85:astore          14
			if(resolveinfo.specificIndex < 0)
	//*  40   87:aload           14
	//*  41   89:getfield        #449 <Field int ResolveInfo.specificIndex>
	//*  42   92:ifge            102
				componentname = ((ComponentName) (intent));
	//   43   95:aload           6
	//   44   97:astore          4
			else
	//*  45   99:goto            112
				componentname = ((ComponentName) (aintent[resolveinfo.specificIndex]));
	//   46  102:aload           5
	//   47  104:aload           14
	//   48  106:getfield        #449 <Field int ResolveInfo.specificIndex>
	//   49  109:aaload          
	//   50  110:astore          4
			componentname = ((ComponentName) (new Intent(((Intent) (componentname)))));
	//   51  112:new             #451 <Class Intent>
	//   52  115:dup             
	//   53  116:aload           4
	//   54  118:invokespecial   #454 <Method void Intent(Intent)>
	//   55  121:astore          4
			((Intent) (componentname)).setComponent(new ComponentName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name));
	//   56  123:aload           4
	//   57  125:new             #456 <Class ComponentName>
	//   58  128:dup             
	//   59  129:aload           14
	//   60  131:getfield        #460 <Field ActivityInfo ResolveInfo.activityInfo>
	//   61  134:getfield        #466 <Field ApplicationInfo ActivityInfo.applicationInfo>
	//   62  137:getfield        #472 <Field String ApplicationInfo.packageName>
	//   63  140:aload           14
	//   64  142:getfield        #460 <Field ActivityInfo ResolveInfo.activityInfo>
	//   65  145:getfield        #475 <Field String ActivityInfo.name>
	//   66  148:invokespecial   #478 <Method void ComponentName(String, String)>
	//   67  151:invokevirtual   #482 <Method Intent Intent.setComponent(ComponentName)>
	//   68  154:pop             
			componentname = ((ComponentName) (add(i1, j1, k1, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setIntent(((Intent) (componentname)))));
	//   69  155:aload_0         
	//   70  156:iload_1         
	//   71  157:iload_2         
	//   72  158:iload_3         
	//   73  159:aload           14
	//   74  161:aload           12
	//   75  163:invokevirtual   #486 <Method CharSequence ResolveInfo.loadLabel(PackageManager)>
	//   76  166:invokevirtual   #488 <Method MenuItem add(int, int, int, CharSequence)>
	//   77  169:aload           14
	//   78  171:aload           12
	//   79  173:invokevirtual   #492 <Method Drawable ResolveInfo.loadIcon(PackageManager)>
	//   80  176:invokeinterface #496 <Method MenuItem MenuItem.setIcon(Drawable)>
	//   81  181:aload           4
	//   82  183:invokeinterface #500 <Method MenuItem MenuItem.setIntent(Intent)>
	//   83  188:astore          4
			if(amenuitem != null && resolveinfo.specificIndex >= 0)
	//*  84  190:aload           8
	//*  85  192:ifnull          213
	//*  86  195:aload           14
	//*  87  197:getfield        #449 <Field int ResolveInfo.specificIndex>
	//*  88  200:iflt            213
				amenuitem[resolveinfo.specificIndex] = ((MenuItem) (componentname));
	//   89  203:aload           8
	//   90  205:aload           14
	//   91  207:getfield        #449 <Field int ResolveInfo.specificIndex>
	//   92  210:aload           4
	//   93  212:aastore         
		}

	//   94  213:iload           10
	//   95  215:iconst_1        
	//   96  216:iadd            
	//   97  217:istore          10
	//*  98  219:goto            66
		return i2;
	//   99  222:iload           9
	//  100  224:ireturn         
	}

	public SubMenu addSubMenu(int i1)
	{
		return addSubMenu(0, 0, 0, ((CharSequence) (f.getString(i1))));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:getfield        #89  <Field Resources f>
	//    6    8:iload_1         
	//    7    9:invokevirtual   #422 <Method String Resources.getString(int)>
	//    8   12:invokevirtual   #505 <Method SubMenu addSubMenu(int, int, int, CharSequence)>
	//    9   15:areturn         
	}

	public SubMenu addSubMenu(int i1, int j1, int k1, int l1)
	{
		return addSubMenu(i1, j1, k1, ((CharSequence) (f.getString(l1))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload_0         
	//    5    5:getfield        #89  <Field Resources f>
	//    6    8:iload           4
	//    7   10:invokevirtual   #422 <Method String Resources.getString(int)>
	//    8   13:invokevirtual   #505 <Method SubMenu addSubMenu(int, int, int, CharSequence)>
	//    9   16:areturn         
	}

	public SubMenu addSubMenu(int i1, int j1, int k1, CharSequence charsequence)
	{
		charsequence = ((CharSequence) ((MenuItemImpl)a(i1, j1, k1, charsequence)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #424 <Method MenuItem a(int, int, int, CharSequence)>
	//    6    9:checkcast       #115 <Class MenuItemImpl>
	//    7   12:astore          4
		android.support.v7.view.menu.a a1 = new android.support.v7.view.menu.a(e, this, ((MenuItemImpl) (charsequence)));
	//    8   14:new             #404 <Class android.support.v7.view.menu.a>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:getfield        #81  <Field Context e>
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:invokespecial   #407 <Method void android.support.v7.view.menu.a(Context, MenuBuilder, MenuItemImpl)>
	//   15   28:astore          5
		((MenuItemImpl) (charsequence)).setSubMenu(a1);
	//   16   30:aload           4
	//   17   32:aload           5
	//   18   34:invokevirtual   #411 <Method void MenuItemImpl.setSubMenu(android.support.v7.view.menu.a)>
		return ((SubMenu) (a1));
	//   19   37:aload           5
	//   20   39:areturn         
	}

	public SubMenu addSubMenu(CharSequence charsequence)
	{
		return addSubMenu(0, 0, 0, charsequence);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:aload_1         
	//    5    5:invokevirtual   #505 <Method SubMenu addSubMenu(int, int, int, CharSequence)>
	//    6    8:areturn         
	}

	public int b(int i1)
	{
		int k1 = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #256 <Method int size()>
	//    2    4:istore_3        
		for(int j1 = 0; j1 < k1; j1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          39
			if(((MenuItemImpl)j.get(j1)).getItemId() == i1)
	//*   8   12:aload_0         
	//*   9   13:getfield        #91  <Field ArrayList j>
	//*  10   16:iload_2         
	//*  11   17:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//*  12   20:checkcast       #115 <Class MenuItemImpl>
	//*  13   23:invokevirtual   #510 <Method int MenuItemImpl.getItemId()>
	//*  14   26:iload_1         
	//*  15   27:icmpne          32
				return j1;
	//   16   30:iload_2         
	//   17   31:ireturn         

	//   18   32:iload_2         
	//   19   33:iconst_1        
	//   20   34:iadd            
	//   21   35:istore_2        
	//*  22   36:goto            7
		return -1;
	//   23   39:iconst_m1       
	//   24   40:ireturn         
	}

	public void b(Bundle bundle)
	{
		f(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #512 <Method void f(Bundle)>
	//    3    5:return          
	}

	void b(MenuItemImpl menuitemimpl)
	{
		o = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #101 <Field boolean o>
		a(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #147 <Method void a(boolean)>
	//    6   10:return          
	}

	public void b(MenuPresenter menupresenter)
	{
		Iterator iterator = x.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field CopyOnWriteArrayList x>
	//    2    4:invokevirtual   #166 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4    8:aload_2         
	//    5    9:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            59
			WeakReference weakreference = (WeakReference)iterator.next();
	//    7   17:aload_2         
	//    8   18:invokeinterface #175 <Method Object Iterator.next()>
	//    9   23:checkcast       #177 <Class WeakReference>
	//   10   26:astore_3        
			MenuPresenter menupresenter1 = (MenuPresenter)weakreference.get();
	//   11   27:aload_3         
	//   12   28:invokevirtual   #179 <Method Object WeakReference.get()>
	//   13   31:checkcast       #158 <Class MenuPresenter>
	//   14   34:astore          4
			if(menupresenter1 == null || menupresenter1 == menupresenter)
	//*  15   36:aload           4
	//*  16   38:ifnull          47
	//*  17   41:aload           4
	//*  18   43:aload_1         
	//*  19   44:if_acmpne       8
				x.remove(((Object) (weakreference)));
	//   20   47:aload_0         
	//   21   48:getfield        #77  <Field CopyOnWriteArrayList x>
	//   22   51:aload_3         
	//   23   52:invokevirtual   #182 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   24   55:pop             
		} while(true);
	//   25   56:goto            8
	//   26   59:return          
	}

	public final void b(boolean flag)
	{
		if(v)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field boolean v>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		v = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #67  <Field boolean v>
		for(Iterator iterator = x.iterator(); iterator.hasNext();)
	//*   7   13:aload_0         
	//*   8   14:getfield        #77  <Field CopyOnWriteArrayList x>
	//*   9   17:invokevirtual   #166 <Method Iterator CopyOnWriteArrayList.iterator()>
	//*  10   20:astore_2        
	//*  11   21:aload_2         
	//*  12   22:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            78
		{
			WeakReference weakreference = (WeakReference)iterator.next();
	//   14   30:aload_2         
	//   15   31:invokeinterface #175 <Method Object Iterator.next()>
	//   16   36:checkcast       #177 <Class WeakReference>
	//   17   39:astore_3        
			MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   18   40:aload_3         
	//   19   41:invokevirtual   #179 <Method Object WeakReference.get()>
	//   20   44:checkcast       #158 <Class MenuPresenter>
	//   21   47:astore          4
			if(menupresenter == null)
	//*  22   49:aload           4
	//*  23   51:ifnonnull       66
				x.remove(((Object) (weakreference)));
	//   24   54:aload_0         
	//   25   55:getfield        #77  <Field CopyOnWriteArrayList x>
	//   26   58:aload_3         
	//   27   59:invokevirtual   #182 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   28   62:pop             
			else
	//*  29   63:goto            21
				menupresenter.onCloseMenu(this, flag);
	//   30   66:aload           4
	//   31   68:aload_0         
	//   32   69:iload_1         
	//   33   70:invokeinterface #516 <Method void MenuPresenter.onCloseMenu(MenuBuilder, boolean)>
		}

	//*  34   75:goto            21
		v = false;
	//   35   78:aload_0         
	//   36   79:iconst_0        
	//   37   80:putfield        #67  <Field boolean v>
	//   38   83:return          
	}

	public boolean b()
	{
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field boolean z>
	//    2    4:ireturn         
	}

	public int c(int i1)
	{
		return a(i1, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #518 <Method int a(int, int)>
	//    4    6:ireturn         
	}

	public void c(Bundle bundle)
	{
		int j1 = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #256 <Method int size()>
	//    2    4:istore_3        
		SparseArray sparsearray = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		for(int i1 = 0; i1 < j1;)
	//*   5    8:iconst_0        
	//*   6    9:istore_2        
	//*   7   10:iload_2         
	//*   8   11:iload_3         
	//*   9   12:icmpge          145
		{
			MenuItem menuitem = getItem(i1);
	//   10   15:aload_0         
	//   11   16:iload_2         
	//   12   17:invokevirtual   #521 <Method MenuItem getItem(int)>
	//   13   20:astore          7
			View view = menuitem.getActionView();
	//   14   22:aload           7
	//   15   24:invokeinterface #525 <Method View MenuItem.getActionView()>
	//   16   29:astore          8
			SparseArray sparsearray2 = sparsearray;
	//   17   31:aload           4
	//   18   33:astore          6
			if(view != null)
	//*  19   35:aload           8
	//*  20   37:ifnull          110
			{
				sparsearray2 = sparsearray;
	//   21   40:aload           4
	//   22   42:astore          6
				if(view.getId() != -1)
	//*  23   44:aload           8
	//*  24   46:invokevirtual   #528 <Method int View.getId()>
	//*  25   49:iconst_m1       
	//*  26   50:icmpeq          110
				{
					SparseArray sparsearray1 = sparsearray;
	//   27   53:aload           4
	//   28   55:astore          5
					if(sparsearray == null)
	//*  29   57:aload           4
	//*  30   59:ifnonnull       71
						sparsearray1 = new SparseArray();
	//   31   62:new             #192 <Class SparseArray>
	//   32   65:dup             
	//   33   66:invokespecial   #193 <Method void SparseArray()>
	//   34   69:astore          5
					view.saveHierarchyState(sparsearray1);
	//   35   71:aload           8
	//   36   73:aload           5
	//   37   75:invokevirtual   #532 <Method void View.saveHierarchyState(SparseArray)>
					sparsearray2 = sparsearray1;
	//   38   78:aload           5
	//   39   80:astore          6
					if(menuitem.isActionViewExpanded())
	//*  40   82:aload           7
	//*  41   84:invokeinterface #535 <Method boolean MenuItem.isActionViewExpanded()>
	//*  42   89:ifeq            110
					{
						bundle.putInt("android:menu:expandedactionview", menuitem.getItemId());
	//   43   92:aload_1         
	//   44   93:ldc2            #537 <String "android:menu:expandedactionview">
	//   45   96:aload           7
	//   46   98:invokeinterface #538 <Method int MenuItem.getItemId()>
	//   47  103:invokevirtual   #542 <Method void Bundle.putInt(String, int)>
						sparsearray2 = sparsearray1;
	//   48  106:aload           5
	//   49  108:astore          6
					}
				}
			}
			if(menuitem.hasSubMenu())
	//*  50  110:aload           7
	//*  51  112:invokeinterface #543 <Method boolean MenuItem.hasSubMenu()>
	//*  52  117:ifeq            134
				((android.support.v7.view.menu.a)menuitem.getSubMenu()).c(bundle);
	//   53  120:aload           7
	//   54  122:invokeinterface #544 <Method SubMenu MenuItem.getSubMenu()>
	//   55  127:checkcast       #404 <Class android.support.v7.view.menu.a>
	//   56  130:aload_1         
	//   57  131:invokevirtual   #546 <Method void android.support.v7.view.menu.a.c(Bundle)>
			i1++;
	//   58  134:iload_2         
	//   59  135:iconst_1        
	//   60  136:iadd            
	//   61  137:istore_2        
			sparsearray = sparsearray2;
	//   62  138:aload           6
	//   63  140:astore          4
		}

	//*  64  142:goto            10
		if(sparsearray != null)
	//*  65  145:aload           4
	//*  66  147:ifnull          160
			bundle.putSparseParcelableArray(a(), sparsearray);
	//   67  150:aload_1         
	//   68  151:aload_0         
	//   69  152:invokevirtual   #548 <Method String a()>
	//   70  155:aload           4
	//   71  157:invokevirtual   #212 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
	//   72  160:return          
	}

	public void c(boolean flag)
	{
		A = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #550 <Field boolean A>
	//    3    5:return          
	}

	boolean c()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #552 <Field boolean g>
	//    2    4:ireturn         
	}

	public boolean c(MenuItemImpl menuitemimpl)
	{
		boolean flag1 = x.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field CopyOnWriteArrayList x>
	//    2    4:invokevirtual   #156 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//    3    7:istore_3        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		if(flag1)
	//*   6   10:iload_3         
	//*   7   11:ifeq            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		h();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #184 <Method void h()>
		Iterator iterator = x.iterator();
	//   12   20:aload_0         
	//   13   21:getfield        #77  <Field CopyOnWriteArrayList x>
	//   14   24:invokevirtual   #166 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   15   27:astore          4
label0:
		do
		{
			MenuPresenter menupresenter;
			do
			{
				flag1 = flag;
	//   16   29:iload_2         
	//   17   30:istore_3        
				if(!iterator.hasNext())
					break label0;
	//   18   31:aload           4
	//   19   33:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//   20   38:ifeq            97
				WeakReference weakreference = (WeakReference)iterator.next();
	//   21   41:aload           4
	//   22   43:invokeinterface #175 <Method Object Iterator.next()>
	//   23   48:checkcast       #177 <Class WeakReference>
	//   24   51:astore          5
				menupresenter = (MenuPresenter)weakreference.get();
	//   25   53:aload           5
	//   26   55:invokevirtual   #179 <Method Object WeakReference.get()>
	//   27   58:checkcast       #158 <Class MenuPresenter>
	//   28   61:astore          6
				if(menupresenter != null)
					break;
	//   29   63:aload           6
	//   30   65:ifnonnull       81
				x.remove(((Object) (weakreference)));
	//   31   68:aload_0         
	//   32   69:getfield        #77  <Field CopyOnWriteArrayList x>
	//   33   72:aload           5
	//   34   74:invokevirtual   #182 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   35   77:pop             
			} while(true);
	//   36   78:goto            29
			flag1 = menupresenter.expandItemActionView(this, menuitemimpl);
	//   37   81:aload           6
	//   38   83:aload_0         
	//   39   84:aload_1         
	//   40   85:invokeinterface #557 <Method boolean MenuPresenter.expandItemActionView(MenuBuilder, MenuItemImpl)>
	//   41   90:istore_3        
			flag = flag1;
	//   42   91:iload_3         
	//   43   92:istore_2        
		} while(!flag1);
	//   44   93:iload_3         
	//   45   94:ifeq            29
		i();
	//   46   97:aload_0         
	//   47   98:invokevirtual   #189 <Method void i()>
		if(flag1)
	//*  48  101:iload_3         
	//*  49  102:ifeq            110
			y = menuitemimpl;
	//   50  105:aload_0         
	//   51  106:aload_1         
	//   52  107:putfield        #559 <Field MenuItemImpl y>
		return flag1;
	//   53  110:iload_3         
	//   54  111:ireturn         
	}

	public void clear()
	{
		MenuItemImpl menuitemimpl = y;
	//    0    0:aload_0         
	//    1    1:getfield        #559 <Field MenuItemImpl y>
	//    2    4:astore_1        
		if(menuitemimpl != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			d(menuitemimpl);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #561 <Method boolean d(MenuItemImpl)>
	//    8   14:pop             
		j.clear();
	//    9   15:aload_0         
	//   10   16:getfield        #91  <Field ArrayList j>
	//   11   19:invokevirtual   #269 <Method void ArrayList.clear()>
		a(true);
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:invokevirtual   #147 <Method void a(boolean)>
	//   15   27:return          
	}

	public void clearHeader()
	{
		b = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #131 <Field Drawable b>
		a = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #129 <Field CharSequence a>
		c = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #127 <Field View c>
		a(false);
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #147 <Method void a(boolean)>
	//   12   20:return          
	}

	public void close()
	{
		b(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #402 <Method void b(boolean)>
	//    3    5:return          
	}

	protected MenuBuilder d(int i1)
	{
		a(i1, ((CharSequence) (null)), 0, ((Drawable) (null)), ((View) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #263 <Method void a(int, CharSequence, int, Drawable, View)>
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
	}

	public void d(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		SparseArray sparsearray = bundle.getSparseParcelableArray(a());
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #548 <Method String a()>
	//    6   10:invokevirtual   #247 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//    7   13:astore          4
		int k1 = size();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #256 <Method int size()>
	//   10   19:istore_3        
		for(int i1 = 0; i1 < k1; i1++)
	//*  11   20:iconst_0        
	//*  12   21:istore_2        
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:icmpge          95
		{
			MenuItem menuitem = getItem(i1);
	//   16   27:aload_0         
	//   17   28:iload_2         
	//   18   29:invokevirtual   #521 <Method MenuItem getItem(int)>
	//   19   32:astore          5
			View view = menuitem.getActionView();
	//   20   34:aload           5
	//   21   36:invokeinterface #525 <Method View MenuItem.getActionView()>
	//   22   41:astore          6
			if(view != null && view.getId() != -1)
	//*  23   43:aload           6
	//*  24   45:ifnull          64
	//*  25   48:aload           6
	//*  26   50:invokevirtual   #528 <Method int View.getId()>
	//*  27   53:iconst_m1       
	//*  28   54:icmpeq          64
				view.restoreHierarchyState(sparsearray);
	//   29   57:aload           6
	//   30   59:aload           4
	//   31   61:invokevirtual   #566 <Method void View.restoreHierarchyState(SparseArray)>
			if(menuitem.hasSubMenu())
	//*  32   64:aload           5
	//*  33   66:invokeinterface #543 <Method boolean MenuItem.hasSubMenu()>
	//*  34   71:ifeq            88
				((android.support.v7.view.menu.a)menuitem.getSubMenu()).d(bundle);
	//   35   74:aload           5
	//   36   76:invokeinterface #544 <Method SubMenu MenuItem.getSubMenu()>
	//   37   81:checkcast       #404 <Class android.support.v7.view.menu.a>
	//   38   84:aload_1         
	//   39   85:invokevirtual   #568 <Method void android.support.v7.view.menu.a.d(Bundle)>
		}

	//   40   88:iload_2         
	//   41   89:iconst_1        
	//   42   90:iadd            
	//   43   91:istore_2        
	//*  44   92:goto            22
		int j1 = bundle.getInt("android:menu:expandedactionview");
	//   45   95:aload_1         
	//   46   96:ldc2            #537 <String "android:menu:expandedactionview">
	//   47   99:invokevirtual   #572 <Method int Bundle.getInt(String)>
	//   48  102:istore_2        
		if(j1 > 0)
	//*  49  103:iload_2         
	//*  50  104:ifle            124
		{
			bundle = ((Bundle) (findItem(j1)));
	//   51  107:aload_0         
	//   52  108:iload_2         
	//   53  109:invokevirtual   #575 <Method MenuItem findItem(int)>
	//   54  112:astore_1        
			if(bundle != null)
	//*  55  113:aload_1         
	//*  56  114:ifnull          124
				((MenuItem) (bundle)).expandActionView();
	//   57  117:aload_1         
	//   58  118:invokeinterface #576 <Method boolean MenuItem.expandActionView()>
	//   59  123:pop             
		}
	//   60  124:return          
	}

	public boolean d()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field boolean h>
	//    2    4:ireturn         
	}

	public boolean d(MenuItemImpl menuitemimpl)
	{
		boolean flag1 = x.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field CopyOnWriteArrayList x>
	//    2    4:invokevirtual   #156 <Method boolean CopyOnWriteArrayList.isEmpty()>
	//    3    7:istore_3        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		if(!flag1)
	//*   6   10:iload_3         
	//*   7   11:ifne            120
		{
			if(y != menuitemimpl)
	//*   8   14:aload_0         
	//*   9   15:getfield        #559 <Field MenuItemImpl y>
	//*  10   18:aload_1         
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			h();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #184 <Method void h()>
			Iterator iterator = x.iterator();
	//   16   28:aload_0         
	//   17   29:getfield        #77  <Field CopyOnWriteArrayList x>
	//   18   32:invokevirtual   #166 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   19   35:astore          4
			boolean flag2;
label0:
			do
			{
				MenuPresenter menupresenter;
				do
				{
					flag2 = flag;
	//   20   37:iload_2         
	//   21   38:istore_3        
					if(!iterator.hasNext())
						break label0;
	//   22   39:aload           4
	//   23   41:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//   24   46:ifeq            105
					WeakReference weakreference = (WeakReference)iterator.next();
	//   25   49:aload           4
	//   26   51:invokeinterface #175 <Method Object Iterator.next()>
	//   27   56:checkcast       #177 <Class WeakReference>
	//   28   59:astore          5
					menupresenter = (MenuPresenter)weakreference.get();
	//   29   61:aload           5
	//   30   63:invokevirtual   #179 <Method Object WeakReference.get()>
	//   31   66:checkcast       #158 <Class MenuPresenter>
	//   32   69:astore          6
					if(menupresenter != null)
						break;
	//   33   71:aload           6
	//   34   73:ifnonnull       89
					x.remove(((Object) (weakreference)));
	//   35   76:aload_0         
	//   36   77:getfield        #77  <Field CopyOnWriteArrayList x>
	//   37   80:aload           5
	//   38   82:invokevirtual   #182 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   39   85:pop             
				} while(true);
	//   40   86:goto            37
				flag2 = menupresenter.collapseItemActionView(this, menuitemimpl);
	//   41   89:aload           6
	//   42   91:aload_0         
	//   43   92:aload_1         
	//   44   93:invokeinterface #579 <Method boolean MenuPresenter.collapseItemActionView(MenuBuilder, MenuItemImpl)>
	//   45   98:istore_3        
				flag = flag2;
	//   46   99:iload_3         
	//   47  100:istore_2        
			} while(!flag2);
	//   48  101:iload_3         
	//   49  102:ifeq            37
			i();
	//   50  105:aload_0         
	//   51  106:invokevirtual   #189 <Method void i()>
			if(flag2)
	//*  52  109:iload_3         
	//*  53  110:ifeq            118
				y = null;
	//   54  113:aload_0         
	//   55  114:aconst_null     
	//   56  115:putfield        #559 <Field MenuItemImpl y>
			return flag2;
	//   57  118:iload_3         
	//   58  119:ireturn         
		} else
		{
			return false;
	//   59  120:iconst_0        
	//   60  121:ireturn         
		}
	}

	Resources e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Resources f>
	//    2    4:areturn         
	}

	protected MenuBuilder e(int i1)
	{
		a(0, ((CharSequence) (null)), i1, ((Drawable) (null)), ((View) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:iload_1         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #263 <Method void a(int, CharSequence, int, Drawable, View)>
		return this;
	//    7    9:aload_0         
	//    8   10:areturn         
	}

	public Context f()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Context e>
	//    2    4:areturn         
	}

	public MenuItem findItem(int i1)
	{
		int k1 = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #256 <Method int size()>
	//    2    4:istore_3        
		for(int j1 = 0; j1 < k1; j1++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          73
		{
			Object obj = ((Object) ((MenuItemImpl)j.get(j1)));
	//    8   12:aload_0         
	//    9   13:getfield        #91  <Field ArrayList j>
	//   10   16:iload_2         
	//   11   17:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//   12   20:checkcast       #115 <Class MenuItemImpl>
	//   13   23:astore          4
			if(((MenuItemImpl) (obj)).getItemId() == i1)
	//*  14   25:aload           4
	//*  15   27:invokevirtual   #510 <Method int MenuItemImpl.getItemId()>
	//*  16   30:iload_1         
	//*  17   31:icmpne          37
				return ((MenuItem) (obj));
	//   18   34:aload           4
	//   19   36:areturn         
			if(!((MenuItemImpl) (obj)).hasSubMenu())
				continue;
	//   20   37:aload           4
	//   21   39:invokevirtual   #355 <Method boolean MenuItemImpl.hasSubMenu()>
	//   22   42:ifeq            66
			obj = ((Object) (((MenuItemImpl) (obj)).getSubMenu().findItem(i1)));
	//   23   45:aload           4
	//   24   47:invokevirtual   #359 <Method SubMenu MenuItemImpl.getSubMenu()>
	//   25   50:iload_1         
	//   26   51:invokeinterface #582 <Method MenuItem SubMenu.findItem(int)>
	//   27   56:astore          4
			if(obj != null)
	//*  28   58:aload           4
	//*  29   60:ifnull          66
				return ((MenuItem) (obj));
	//   30   63:aload           4
	//   31   65:areturn         
		}

	//   32   66:iload_2         
	//   33   67:iconst_1        
	//   34   68:iadd            
	//   35   69:istore_2        
	//*  36   70:goto            7
		return null;
	//   37   73:aconst_null     
	//   38   74:areturn         
	}

	public void g()
	{
		Callback callback = i;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field MenuBuilder$Callback i>
	//    2    4:astore_1        
		if(callback != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			callback.onMenuModeChange(this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #586 <Method void MenuBuilder$Callback.onMenuModeChange(MenuBuilder)>
	//    8   16:return          
	}

	public MenuItem getItem(int i1)
	{
		return (MenuItem)j.get(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ArrayList j>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #339 <Class MenuItem>
	//    5   11:areturn         
	}

	public void h()
	{
		if(!r)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean r>
	//*   2    4:ifne            22
		{
			r = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #59  <Field boolean r>
			s = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #61  <Field boolean s>
			t = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #63  <Field boolean t>
		}
	//   12   22:return          
	}

	public boolean hasVisibleItems()
	{
		if(A)
	//*   0    0:aload_0         
	//*   1    1:getfield        #550 <Field boolean A>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		int j1 = size();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #256 <Method int size()>
	//    7   13:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          47
			if(((MenuItemImpl)j.get(i1)).isVisible())
	//*  13   21:aload_0         
	//*  14   22:getfield        #91  <Field ArrayList j>
	//*  15   25:iload_1         
	//*  16   26:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//*  17   29:checkcast       #115 <Class MenuItemImpl>
	//*  18   32:invokevirtual   #590 <Method boolean MenuItemImpl.isVisible()>
	//*  19   35:ifeq            40
				return true;
	//   20   38:iconst_1        
	//   21   39:ireturn         

	//   22   40:iload_1         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_1        
	//*  26   44:goto            16
		return false;
	//   27   47:iconst_0        
	//   28   48:ireturn         
	}

	public void i()
	{
		r = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #59  <Field boolean r>
		if(s)
	//*   3    5:aload_0         
	//*   4    6:getfield        #61  <Field boolean s>
	//*   5    9:ifeq            25
		{
			s = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #61  <Field boolean s>
			a(t);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #63  <Field boolean t>
	//   12   22:invokevirtual   #147 <Method void a(boolean)>
		}
	//   13   25:return          
	}

	public boolean isShortcutKey(int i1, KeyEvent keyevent)
	{
		return a(i1, keyevent) != null;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #594 <Method MenuItemImpl a(int, KeyEvent)>
	//    4    6:ifnull          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public ArrayList j()
	{
		if(!l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field boolean l>
	//*   2    4:ifne            12
			return k;
	//    3    7:aload_0         
	//    4    8:getfield        #93  <Field ArrayList k>
	//    5   11:areturn         
		k.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #93  <Field ArrayList k>
	//    8   16:invokevirtual   #269 <Method void ArrayList.clear()>
		int j1 = j.size();
	//    9   19:aload_0         
	//   10   20:getfield        #91  <Field ArrayList j>
	//   11   23:invokevirtual   #109 <Method int ArrayList.size()>
	//   12   26:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
	//*  15   29:iload_1         
	//*  16   30:iload_2         
	//*  17   31:icmpge          69
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)j.get(i1);
	//   18   34:aload_0         
	//   19   35:getfield        #91  <Field ArrayList j>
	//   20   38:iload_1         
	//   21   39:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//   22   42:checkcast       #115 <Class MenuItemImpl>
	//   23   45:astore_3        
			if(menuitemimpl.isVisible())
	//*  24   46:aload_3         
	//*  25   47:invokevirtual   #590 <Method boolean MenuItemImpl.isVisible()>
	//*  26   50:ifeq            62
				k.add(((Object) (menuitemimpl)));
	//   27   53:aload_0         
	//   28   54:getfield        #93  <Field ArrayList k>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #596 <Method boolean ArrayList.add(Object)>
	//   31   61:pop             
		}

	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_1        
	//*  36   66:goto            29
		l = false;
	//   37   69:aload_0         
	//   38   70:iconst_0        
	//   39   71:putfield        #95  <Field boolean l>
		o = true;
	//   40   74:aload_0         
	//   41   75:iconst_1        
	//   42   76:putfield        #101 <Field boolean o>
		return k;
	//   43   79:aload_0         
	//   44   80:getfield        #93  <Field ArrayList k>
	//   45   83:areturn         
	}

	public void k()
	{
		ArrayList arraylist = j();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #598 <Method ArrayList j()>
	//    2    4:astore_3        
		if(!o)
	//*   3    5:aload_0         
	//*   4    6:getfield        #101 <Field boolean o>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		Iterator iterator = x.iterator();
	//    7   13:aload_0         
	//    8   14:getfield        #77  <Field CopyOnWriteArrayList x>
	//    9   17:invokevirtual   #166 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   10   20:astore          4
		boolean flag = false;
	//   11   22:iconst_0        
	//   12   23:istore_1        
		while(iterator.hasNext()) 
	//*  13   24:aload           4
	//*  14   26:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//*  15   31:ifeq            87
		{
			WeakReference weakreference = (WeakReference)iterator.next();
	//   16   34:aload           4
	//   17   36:invokeinterface #175 <Method Object Iterator.next()>
	//   18   41:checkcast       #177 <Class WeakReference>
	//   19   44:astore          5
			MenuPresenter menupresenter = (MenuPresenter)weakreference.get();
	//   20   46:aload           5
	//   21   48:invokevirtual   #179 <Method Object WeakReference.get()>
	//   22   51:checkcast       #158 <Class MenuPresenter>
	//   23   54:astore          6
			if(menupresenter == null)
	//*  24   56:aload           6
	//*  25   58:ifnonnull       74
				x.remove(((Object) (weakreference)));
	//   26   61:aload_0         
	//   27   62:getfield        #77  <Field CopyOnWriteArrayList x>
	//   28   65:aload           5
	//   29   67:invokevirtual   #182 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//   30   70:pop             
			else
	//*  31   71:goto            24
				flag |= menupresenter.flagActionItems();
	//   32   74:iload_1         
	//   33   75:aload           6
	//   34   77:invokeinterface #601 <Method boolean MenuPresenter.flagActionItems()>
	//   35   82:ior             
	//   36   83:istore_1        
		}
	//*  37   84:goto            24
		if(flag)
	//*  38   87:iload_1         
	//*  39   88:ifeq            165
		{
			m.clear();
	//   40   91:aload_0         
	//   41   92:getfield        #97  <Field ArrayList m>
	//   42   95:invokevirtual   #269 <Method void ArrayList.clear()>
			n.clear();
	//   43   98:aload_0         
	//   44   99:getfield        #99  <Field ArrayList n>
	//   45  102:invokevirtual   #269 <Method void ArrayList.clear()>
			int j1 = arraylist.size();
	//   46  105:aload_3         
	//   47  106:invokevirtual   #109 <Method int ArrayList.size()>
	//   48  109:istore_2        
			for(int i1 = 0; i1 < j1; i1++)
	//*  49  110:iconst_0        
	//*  50  111:istore_1        
	//*  51  112:iload_1         
	//*  52  113:iload_2         
	//*  53  114:icmpge          191
			{
				MenuItemImpl menuitemimpl = (MenuItemImpl)arraylist.get(i1);
	//   54  117:aload_3         
	//   55  118:iload_1         
	//   56  119:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//   57  122:checkcast       #115 <Class MenuItemImpl>
	//   58  125:astore          4
				if(menuitemimpl.isActionButton())
	//*  59  127:aload           4
	//*  60  129:invokevirtual   #604 <Method boolean MenuItemImpl.isActionButton()>
	//*  61  132:ifeq            148
					m.add(((Object) (menuitemimpl)));
	//   62  135:aload_0         
	//   63  136:getfield        #97  <Field ArrayList m>
	//   64  139:aload           4
	//   65  141:invokevirtual   #596 <Method boolean ArrayList.add(Object)>
	//   66  144:pop             
				else
	//*  67  145:goto            158
					n.add(((Object) (menuitemimpl)));
	//   68  148:aload_0         
	//   69  149:getfield        #99  <Field ArrayList n>
	//   70  152:aload           4
	//   71  154:invokevirtual   #596 <Method boolean ArrayList.add(Object)>
	//   72  157:pop             
			}

	//   73  158:iload_1         
	//   74  159:iconst_1        
	//   75  160:iadd            
	//   76  161:istore_1        
		} else
	//*  77  162:goto            112
		{
			m.clear();
	//   78  165:aload_0         
	//   79  166:getfield        #97  <Field ArrayList m>
	//   80  169:invokevirtual   #269 <Method void ArrayList.clear()>
			n.clear();
	//   81  172:aload_0         
	//   82  173:getfield        #99  <Field ArrayList n>
	//   83  176:invokevirtual   #269 <Method void ArrayList.clear()>
			n.addAll(((java.util.Collection) (j())));
	//   84  179:aload_0         
	//   85  180:getfield        #99  <Field ArrayList n>
	//   86  183:aload_0         
	//   87  184:invokevirtual   #598 <Method ArrayList j()>
	//   88  187:invokevirtual   #608 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   89  190:pop             
		}
		o = false;
	//   90  191:aload_0         
	//   91  192:iconst_0        
	//   92  193:putfield        #101 <Field boolean o>
	//   93  196:return          
	}

	public ArrayList l()
	{
		k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #610 <Method void k()>
		return m;
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field ArrayList m>
	//    4    8:areturn         
	}

	public ArrayList m()
	{
		k();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #610 <Method void k()>
		return n;
	//    2    4:aload_0         
	//    3    5:getfield        #99  <Field ArrayList n>
	//    4    8:areturn         
	}

	public CharSequence n()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field CharSequence a>
	//    2    4:areturn         
	}

	public Drawable o()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field Drawable b>
	//    2    4:areturn         
	}

	public View p()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field View c>
	//    2    4:areturn         
	}

	public boolean performIdentifierAction(int i1, int j1)
	{
		return a(findItem(i1), j1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #575 <Method MenuItem findItem(int)>
	//    4    6:iload_2         
	//    5    7:invokevirtual   #616 <Method boolean a(MenuItem, int)>
	//    6   10:ireturn         
	}

	public boolean performShortcut(int i1, KeyEvent keyevent, int j1)
	{
		keyevent = ((KeyEvent) (a(i1, keyevent)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #594 <Method MenuItemImpl a(int, KeyEvent)>
	//    4    6:astore_2        
		boolean flag;
		if(keyevent != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          22
			flag = a(((MenuItem) (keyevent)), j1);
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:iload_3         
	//   10   14:invokevirtual   #616 <Method boolean a(MenuItem, int)>
	//   11   17:istore          4
		else
	//*  12   19:goto            25
			flag = false;
	//   13   22:iconst_0        
	//   14   23:istore          4
		if((j1 & 2) != 0)
	//*  15   25:iload_3         
	//*  16   26:iconst_2        
	//*  17   27:iand            
	//*  18   28:ifeq            36
			b(true);
	//   19   31:aload_0         
	//   20   32:iconst_1        
	//   21   33:invokevirtual   #402 <Method void b(boolean)>
		return flag;
	//   22   36:iload           4
	//   23   38:ireturn         
	}

	public MenuBuilder q()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	boolean r()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean u>
	//    2    4:ireturn         
	}

	public void removeGroup(int i1)
	{
		int k1 = c(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #621 <Method int c(int)>
	//    3    5:istore_3        
		if(k1 >= 0)
	//*   4    6:iload_3         
	//*   5    7:iflt            65
		{
			int l1 = j.size();
	//    6   10:aload_0         
	//    7   11:getfield        #91  <Field ArrayList j>
	//    8   14:invokevirtual   #109 <Method int ArrayList.size()>
	//    9   17:istore          4
			for(int j1 = 0; j1 < l1 - k1 && ((MenuItemImpl)j.get(k1)).getGroupId() == i1; j1++)
	//*  10   19:iconst_0        
	//*  11   20:istore_2        
	//*  12   21:iload_2         
	//*  13   22:iload           4
	//*  14   24:iload_3         
	//*  15   25:isub            
	//*  16   26:icmpge          60
	//*  17   29:aload_0         
	//*  18   30:getfield        #91  <Field ArrayList j>
	//*  19   33:iload_3         
	//*  20   34:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//*  21   37:checkcast       #115 <Class MenuItemImpl>
	//*  22   40:invokevirtual   #259 <Method int MenuItemImpl.getGroupId()>
	//*  23   43:iload_1         
	//*  24   44:icmpne          60
				a(k1, false);
	//   25   47:aload_0         
	//   26   48:iload_3         
	//   27   49:iconst_0        
	//   28   50:invokespecial   #623 <Method void a(int, boolean)>

	//   29   53:iload_2         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_2        
	//*  33   57:goto            21
			a(true);
	//   34   60:aload_0         
	//   35   61:iconst_1        
	//   36   62:invokevirtual   #147 <Method void a(boolean)>
		}
	//   37   65:return          
	}

	public void removeItem(int i1)
	{
		a(b(i1), true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #626 <Method int b(int)>
	//    4    6:iconst_1        
	//    5    7:invokespecial   #623 <Method void a(int, boolean)>
	//    6   10:return          
	}

	public MenuItemImpl s()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #559 <Field MenuItemImpl y>
	//    2    4:areturn         
	}

	public void setGroupCheckable(int i1, boolean flag, boolean flag1)
	{
		int k1 = j.size();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ArrayList j>
	//    2    4:invokevirtual   #109 <Method int ArrayList.size()>
	//    3    7:istore          5
		for(int j1 = 0; j1 < k1; j1++)
	//*   4    9:iconst_0        
	//*   5   10:istore          4
	//*   6   12:iload           4
	//*   7   14:iload           5
	//*   8   16:icmpge          64
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)j.get(j1);
	//    9   19:aload_0         
	//   10   20:getfield        #91  <Field ArrayList j>
	//   11   23:iload           4
	//   12   25:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//   13   28:checkcast       #115 <Class MenuItemImpl>
	//   14   31:astore          6
			if(menuitemimpl.getGroupId() == i1)
	//*  15   33:aload           6
	//*  16   35:invokevirtual   #259 <Method int MenuItemImpl.getGroupId()>
	//*  17   38:iload_1         
	//*  18   39:icmpne          55
			{
				menuitemimpl.setExclusiveCheckable(flag1);
	//   19   42:aload           6
	//   20   44:iload_3         
	//   21   45:invokevirtual   #632 <Method void MenuItemImpl.setExclusiveCheckable(boolean)>
				menuitemimpl.setCheckable(flag);
	//   22   48:aload           6
	//   23   50:iload_2         
	//   24   51:invokevirtual   #636 <Method MenuItem MenuItemImpl.setCheckable(boolean)>
	//   25   54:pop             
			}
		}

	//   26   55:iload           4
	//   27   57:iconst_1        
	//   28   58:iadd            
	//   29   59:istore          4
	//*  30   61:goto            12
	//   31   64:return          
	}

	public void setGroupDividerEnabled(boolean flag)
	{
		z = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field boolean z>
	//    3    5:return          
	}

	public void setGroupEnabled(int i1, boolean flag)
	{
		int k1 = j.size();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ArrayList j>
	//    2    4:invokevirtual   #109 <Method int ArrayList.size()>
	//    3    7:istore          4
		for(int j1 = 0; j1 < k1; j1++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpge          53
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)j.get(j1);
	//    9   17:aload_0         
	//   10   18:getfield        #91  <Field ArrayList j>
	//   11   21:iload_3         
	//   12   22:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #115 <Class MenuItemImpl>
	//   14   28:astore          5
			if(menuitemimpl.getGroupId() == i1)
	//*  15   30:aload           5
	//*  16   32:invokevirtual   #259 <Method int MenuItemImpl.getGroupId()>
	//*  17   35:iload_1         
	//*  18   36:icmpne          46
				menuitemimpl.setEnabled(flag);
	//   19   39:aload           5
	//   20   41:iload_2         
	//   21   42:invokevirtual   #641 <Method MenuItem MenuItemImpl.setEnabled(boolean)>
	//   22   45:pop             
		}

	//   23   46:iload_3         
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:istore_3        
	//*  27   50:goto            11
	//   28   53:return          
	}

	public void setGroupVisible(int i1, boolean flag)
	{
		int k1 = j.size();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ArrayList j>
	//    2    4:invokevirtual   #109 <Method int ArrayList.size()>
	//    3    7:istore          6
		int j1 = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		boolean flag1;
		boolean flag2;
		for(flag1 = false; j1 < k1; flag1 = flag2)
	//*   6   11:iconst_0        
	//*   7   12:istore          4
	//*   8   14:iload_3         
	//*   9   15:iload           6
	//*  10   17:icmpge          73
		{
			MenuItemImpl menuitemimpl = (MenuItemImpl)j.get(j1);
	//   11   20:aload_0         
	//   12   21:getfield        #91  <Field ArrayList j>
	//   13   24:iload_3         
	//   14   25:invokevirtual   #113 <Method Object ArrayList.get(int)>
	//   15   28:checkcast       #115 <Class MenuItemImpl>
	//   16   31:astore          7
			flag2 = flag1;
	//   17   33:iload           4
	//   18   35:istore          5
			if(menuitemimpl.getGroupId() == i1)
	//*  19   37:aload           7
	//*  20   39:invokevirtual   #259 <Method int MenuItemImpl.getGroupId()>
	//*  21   42:iload_1         
	//*  22   43:icmpne          62
			{
				flag2 = flag1;
	//   23   46:iload           4
	//   24   48:istore          5
				if(menuitemimpl.setVisibleInt(flag))
	//*  25   50:aload           7
	//*  26   52:iload_2         
	//*  27   53:invokevirtual   #646 <Method boolean MenuItemImpl.setVisibleInt(boolean)>
	//*  28   56:ifeq            62
					flag2 = true;
	//   29   59:iconst_1        
	//   30   60:istore          5
			}
			j1++;
	//   31   62:iload_3         
	//   32   63:iconst_1        
	//   33   64:iadd            
	//   34   65:istore_3        
		}

	//   35   66:iload           5
	//   36   68:istore          4
	//*  37   70:goto            14
		if(flag1)
	//*  38   73:iload           4
	//*  39   75:ifeq            83
			a(true);
	//   40   78:aload_0         
	//   41   79:iconst_1        
	//   42   80:invokevirtual   #147 <Method void a(boolean)>
	//   43   83:return          
	}

	public void setQwertyMode(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #552 <Field boolean g>
		a(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #147 <Method void a(boolean)>
	//    6   10:return          
	}

	public int size()
	{
		return j.size();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ArrayList j>
	//    2    4:invokevirtual   #109 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	private static final int d[] = {
		1, 4, 5, 3, 2, 0
	};
	private boolean A;
	CharSequence a;
	Drawable b;
	View c;
	private final Context e;
	private final Resources f;
	private boolean g;
	private boolean h;
	private Callback i;
	private ArrayList j;
	private ArrayList k;
	private boolean l;
	private ArrayList m;
	private ArrayList n;
	private boolean o;
	private int p;
	private android.view.ContextMenu.ContextMenuInfo q;
	private boolean r;
	private boolean s;
	private boolean t;
	private boolean u;
	private boolean v;
	private ArrayList w;
	private CopyOnWriteArrayList x;
	private MenuItemImpl y;
	private boolean z;

	static 
	{
	//    0    0:bipush          6
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:iconst_1        
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:iconst_4        
	//    9   11:iastore         
	//   10   12:dup             
	//   11   13:iconst_2        
	//   12   14:iconst_5        
	//   13   15:iastore         
	//   14   16:dup             
	//   15   17:iconst_3        
	//   16   18:iconst_3        
	//   17   19:iastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:iconst_2        
	//   21   23:iastore         
	//   22   24:dup             
	//   23   25:iconst_5        
	//   24   26:iconst_0        
	//   25   27:iastore         
	//   26   28:putstatic       #50  <Field int[] d>
	//*  27   31:return          
	}

	private class Callback
	{

		public abstract boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem);

		public abstract void onMenuModeChange(MenuBuilder menubuilder);
	}

}
