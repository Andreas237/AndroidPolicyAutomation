// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.*;
import android.widget.*;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserView, d

private class ActivityChooserView$a extends BaseAdapter
{

	public int a()
	{
		int k = c;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int c>
	//    2    4:istore_3        
		c = 0x7fffffff;
	//    3    5:aload_0         
	//    4    6:ldc1            #28  <Int 0x7fffffff>
	//    5    8:putfield        #25  <Field int c>
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//    8   13:iconst_0        
	//    9   14:iconst_0        
	//   10   15:invokestatic    #34  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   11   18:istore          4
		int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   12   20:iconst_0        
	//   13   21:iconst_0        
	//   14   22:invokestatic    #34  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   15   25:istore          5
		int j1 = getCount();
	//   16   27:aload_0         
	//   17   28:invokevirtual   #37  <Method int getCount()>
	//   18   31:istore          6
		View view = null;
	//   19   33:aconst_null     
	//   20   34:astore          7
		int j = 0;
	//   21   36:iconst_0        
	//   22   37:istore_2        
		for(; i < j1; i++)
	//*  23   38:iload_1         
	//*  24   39:iload           6
	//*  25   41:icmpge          80
		{
			view = getView(i, view, ((ViewGroup) (null)));
	//   26   44:aload_0         
	//   27   45:iload_1         
	//   28   46:aload           7
	//   29   48:aconst_null     
	//   30   49:invokevirtual   #41  <Method View getView(int, View, ViewGroup)>
	//   31   52:astore          7
			view.measure(l, i1);
	//   32   54:aload           7
	//   33   56:iload           4
	//   34   58:iload           5
	//   35   60:invokevirtual   #47  <Method void View.measure(int, int)>
			j = Math.max(j, view.getMeasuredWidth());
	//   36   63:iload_2         
	//   37   64:aload           7
	//   38   66:invokevirtual   #50  <Method int View.getMeasuredWidth()>
	//   39   69:invokestatic    #55  <Method int Math.max(int, int)>
	//   40   72:istore_2        
		}

	//   41   73:iload_1         
	//   42   74:iconst_1        
	//   43   75:iadd            
	//   44   76:istore_1        
	//*  45   77:goto            38
		c = k;
	//   46   80:aload_0         
	//   47   81:iload_3         
	//   48   82:putfield        #25  <Field int c>
		return j;
	//   49   85:iload_2         
	//   50   86:ireturn         
	}

	public void a(int i)
	{
		if(c != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field int c>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			c = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #25  <Field int c>
			notifyDataSetChanged();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #59  <Method void notifyDataSetChanged()>
		}
	//    9   17:return          
	}

	public void a(d d1)
	{
		d d2 = a.a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ActivityChooserView a>
	//    2    4:getfield        #63  <Field ActivityChooserView$a ActivityChooserView.a>
	//    3    7:invokevirtual   #66  <Method d e()>
	//    4   10:astore_2        
		if(d2 != null && a.isShown())
	//*   5   11:aload_2         
	//*   6   12:ifnull          36
	//*   7   15:aload_0         
	//*   8   16:getfield        #20  <Field ActivityChooserView a>
	//*   9   19:invokevirtual   #70  <Method boolean ActivityChooserView.isShown()>
	//*  10   22:ifeq            36
			d2.unregisterObserver(((Object) (a.e)));
	//   11   25:aload_2         
	//   12   26:aload_0         
	//   13   27:getfield        #20  <Field ActivityChooserView a>
	//   14   30:getfield        #73  <Field android.database.DataSetObserver ActivityChooserView.e>
	//   15   33:invokevirtual   #79  <Method void d.unregisterObserver(Object)>
		b = d1;
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:putfield        #81  <Field d b>
		if(d1 != null && a.isShown())
	//*  19   41:aload_1         
	//*  20   42:ifnull          66
	//*  21   45:aload_0         
	//*  22   46:getfield        #20  <Field ActivityChooserView a>
	//*  23   49:invokevirtual   #70  <Method boolean ActivityChooserView.isShown()>
	//*  24   52:ifeq            66
			d1.registerObserver(((Object) (a.e)));
	//   25   55:aload_1         
	//   26   56:aload_0         
	//   27   57:getfield        #20  <Field ActivityChooserView a>
	//   28   60:getfield        #73  <Field android.database.DataSetObserver ActivityChooserView.e>
	//   29   63:invokevirtual   #84  <Method void d.registerObserver(Object)>
		notifyDataSetChanged();
	//   30   66:aload_0         
	//   31   67:invokevirtual   #59  <Method void notifyDataSetChanged()>
	//   32   70:return          
	}

	public void a(boolean flag)
	{
		if(f != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field boolean f>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			f = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #87  <Field boolean f>
			notifyDataSetChanged();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #59  <Method void notifyDataSetChanged()>
		}
	//    9   17:return          
	}

	public void a(boolean flag, boolean flag1)
	{
		if(d != flag || e != flag1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field boolean d>
	//*   2    4:iload_1         
	//*   3    5:icmpne          16
	//*   4    8:aload_0         
	//*   5    9:getfield        #92  <Field boolean e>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          30
		{
			d = flag;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #90  <Field boolean d>
			e = flag1;
	//   11   21:aload_0         
	//   12   22:iload_2         
	//   13   23:putfield        #92  <Field boolean e>
			notifyDataSetChanged();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #59  <Method void notifyDataSetChanged()>
		}
	//   16   30:return          
	}

	public ResolveInfo b()
	{
		return b.b();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field d b>
	//    2    4:invokevirtual   #95  <Method ResolveInfo d.b()>
	//    3    7:areturn         
	}

	public int c()
	{
		return b.a();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field d b>
	//    2    4:invokevirtual   #97  <Method int d.a()>
	//    3    7:ireturn         
	}

	public int d()
	{
		return b.c();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field d b>
	//    2    4:invokevirtual   #99  <Method int d.c()>
	//    3    7:ireturn         
	}

	public d e()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field d b>
	//    2    4:areturn         
	}

	public boolean f()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field boolean d>
	//    2    4:ireturn         
	}

	public int getCount()
	{
		int j = b.a();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field d b>
	//    2    4:invokevirtual   #97  <Method int d.a()>
	//    3    7:istore_2        
		int i = j;
	//    4    8:iload_2         
	//    5    9:istore_1        
		if(!d)
	//*   6   10:aload_0         
	//*   7   11:getfield        #90  <Field boolean d>
	//*   8   14:ifne            33
		{
			i = j;
	//    9   17:iload_2         
	//   10   18:istore_1        
			if(b.b() != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #81  <Field d b>
	//*  13   23:invokevirtual   #95  <Method ResolveInfo d.b()>
	//*  14   26:ifnull          33
				i = j - 1;
	//   15   29:iload_2         
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:istore_1        
		}
		j = Math.min(i, c);
	//   19   33:iload_1         
	//   20   34:aload_0         
	//   21   35:getfield        #25  <Field int c>
	//   22   38:invokestatic    #102 <Method int Math.min(int, int)>
	//   23   41:istore_2        
		i = j;
	//   24   42:iload_2         
	//   25   43:istore_1        
		if(f)
	//*  26   44:aload_0         
	//*  27   45:getfield        #87  <Field boolean f>
	//*  28   48:ifeq            55
			i = j + 1;
	//   29   51:iload_2         
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:istore_1        
		return i;
	//   33   55:iload_1         
	//   34   56:ireturn         
	}

	public Object getItem(int i)
	{
		int j;
		switch(getItemViewType(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #108 <Method int getItemViewType(int)>
		{
	//*   3    5:tableswitch     0 1: default 28
	//	               0 38
	//	               1 36
		default:
			throw new IllegalArgumentException();
	//    4   28:new             #110 <Class IllegalArgumentException>
	//    5   31:dup             
	//    6   32:invokespecial   #111 <Method void IllegalArgumentException()>
	//    7   35:athrow          

		case 1: // '\001'
			return ((Object) (null));
	//    8   36:aconst_null     
	//    9   37:areturn         

		case 0: // '\0'
			j = i;
	//   10   38:iload_1         
	//   11   39:istore_2        
			break;
		}
		if(!d)
	//*  12   40:aload_0         
	//*  13   41:getfield        #90  <Field boolean d>
	//*  14   44:ifne            63
		{
			j = i;
	//   15   47:iload_1         
	//   16   48:istore_2        
			if(b.b() != null)
	//*  17   49:aload_0         
	//*  18   50:getfield        #81  <Field d b>
	//*  19   53:invokevirtual   #95  <Method ResolveInfo d.b()>
	//*  20   56:ifnull          63
				j = i + 1;
	//   21   59:iload_1         
	//   22   60:iconst_1        
	//   23   61:iadd            
	//   24   62:istore_2        
		}
		return ((Object) (b.a(j)));
	//   25   63:aload_0         
	//   26   64:getfield        #81  <Field d b>
	//   27   67:iload_2         
	//   28   68:invokevirtual   #114 <Method ResolveInfo d.a(int)>
	//   29   71:areturn         
	}

	public long getItemId(int i)
	{
		return (long)i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lreturn         
	}

	public int getItemViewType(int i)
	{
		return !f || i != getCount() - 1 ? 0 : 1;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean f>
	//    2    4:ifeq            19
	//    3    7:iload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #37  <Method int getCount()>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:icmpne          19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		getItemViewType(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #108 <Method int getItemViewType(int)>
		JVM INSTR tableswitch 0 1: default 28
	//	               0 107
	//	               1 36;
	//    3    5:tableswitch     0 1: default 28
	//	               0 107
	//	               1 36
		   goto _L1 _L2 _L3
_L1:
		throw new IllegalArgumentException();
	//    4   28:new             #110 <Class IllegalArgumentException>
	//    5   31:dup             
	//    6   32:invokespecial   #111 <Method void IllegalArgumentException()>
	//    7   35:athrow          
_L3:
		if(view == null) goto _L5; else goto _L4
	//    8   36:aload_2         
	//    9   37:ifnull          51
_L4:
		View view1 = view;
	//   10   40:aload_2         
	//   11   41:astore          4
		if(view.getId() == 1) goto _L6; else goto _L5
	//   12   43:aload_2         
	//   13   44:invokevirtual   #119 <Method int View.getId()>
	//   14   47:iconst_1        
	//   15   48:icmpeq          104
_L5:
		view1 = LayoutInflater.from(a.getContext()).inflate(android.support.v7.a.a.g.abc_activity_chooser_view_list_item, viewgroup, false);
	//   16   51:aload_0         
	//   17   52:getfield        #20  <Field ActivityChooserView a>
	//   18   55:invokevirtual   #123 <Method Context ActivityChooserView.getContext()>
	//   19   58:invokestatic    #129 <Method LayoutInflater LayoutInflater.from(Context)>
	//   20   61:getstatic       #134 <Field int android.support.v7.a.a$g.abc_activity_chooser_view_list_item>
	//   21   64:aload_3         
	//   22   65:iconst_0        
	//   23   66:invokevirtual   #138 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   24   69:astore          4
		view1.setId(1);
	//   25   71:aload           4
	//   26   73:iconst_1        
	//   27   74:invokevirtual   #141 <Method void View.setId(int)>
		((TextView)view1.findViewById(android.support.v7.a.a.f.title)).setText(((CharSequence) (a.getContext().getString(android.support.v7.a.a.h.abc_activity_chooser_view_see_all))));
	//   28   77:aload           4
	//   29   79:getstatic       #146 <Field int android.support.v7.a.a$f.title>
	//   30   82:invokevirtual   #150 <Method View View.findViewById(int)>
	//   31   85:checkcast       #152 <Class TextView>
	//   32   88:aload_0         
	//   33   89:getfield        #20  <Field ActivityChooserView a>
	//   34   92:invokevirtual   #123 <Method Context ActivityChooserView.getContext()>
	//   35   95:getstatic       #157 <Field int android.support.v7.a.a$h.abc_activity_chooser_view_see_all>
	//   36   98:invokevirtual   #163 <Method String Context.getString(int)>
	//   37  101:invokevirtual   #167 <Method void TextView.setText(CharSequence)>
_L6:
		return view1;
	//   38  104:aload           4
	//   39  106:areturn         
_L2:
		if(view == null) goto _L8; else goto _L7
	//   40  107:aload_2         
	//   41  108:ifnull          124
_L7:
		view1 = view;
	//   42  111:aload_2         
	//   43  112:astore          4
		if(view.getId() == android.support.v7.a.a.f.list_item) goto _L9; else goto _L8
	//   44  114:aload_2         
	//   45  115:invokevirtual   #119 <Method int View.getId()>
	//   46  118:getstatic       #170 <Field int android.support.v7.a.a$f.list_item>
	//   47  121:icmpeq          144
_L8:
		view1 = LayoutInflater.from(a.getContext()).inflate(android.support.v7.a.a.g.abc_activity_chooser_view_list_item, viewgroup, false);
	//   48  124:aload_0         
	//   49  125:getfield        #20  <Field ActivityChooserView a>
	//   50  128:invokevirtual   #123 <Method Context ActivityChooserView.getContext()>
	//   51  131:invokestatic    #129 <Method LayoutInflater LayoutInflater.from(Context)>
	//   52  134:getstatic       #134 <Field int android.support.v7.a.a$g.abc_activity_chooser_view_list_item>
	//   53  137:aload_3         
	//   54  138:iconst_0        
	//   55  139:invokevirtual   #138 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   56  142:astore          4
_L9:
		view = ((View) (a.getContext().getPackageManager()));
	//   57  144:aload_0         
	//   58  145:getfield        #20  <Field ActivityChooserView a>
	//   59  148:invokevirtual   #123 <Method Context ActivityChooserView.getContext()>
	//   60  151:invokevirtual   #174 <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   61  154:astore_2        
		viewgroup = ((ViewGroup) ((ImageView)view1.findViewById(android.support.v7.a.a.f.icon)));
	//   62  155:aload           4
	//   63  157:getstatic       #177 <Field int android.support.v7.a.a$f.icon>
	//   64  160:invokevirtual   #150 <Method View View.findViewById(int)>
	//   65  163:checkcast       #179 <Class ImageView>
	//   66  166:astore_3        
		ResolveInfo resolveinfo = (ResolveInfo)getItem(i);
	//   67  167:aload_0         
	//   68  168:iload_1         
	//   69  169:invokevirtual   #181 <Method Object getItem(int)>
	//   70  172:checkcast       #183 <Class ResolveInfo>
	//   71  175:astore          5
		((ImageView) (viewgroup)).setImageDrawable(resolveinfo.loadIcon(((android.content.pm.PackageManager) (view))));
	//   72  177:aload_3         
	//   73  178:aload           5
	//   74  180:aload_2         
	//   75  181:invokevirtual   #187 <Method android.graphics.drawable.Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
	//   76  184:invokevirtual   #191 <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
		((TextView)view1.findViewById(android.support.v7.a.a.f.title)).setText(resolveinfo.loadLabel(((android.content.pm.PackageManager) (view))));
	//   77  187:aload           4
	//   78  189:getstatic       #146 <Field int android.support.v7.a.a$f.title>
	//   79  192:invokevirtual   #150 <Method View View.findViewById(int)>
	//   80  195:checkcast       #152 <Class TextView>
	//   81  198:aload           5
	//   82  200:aload_2         
	//   83  201:invokevirtual   #195 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
	//   84  204:invokevirtual   #167 <Method void TextView.setText(CharSequence)>
		if(d && i == 0 && e)
	//*  85  207:aload_0         
	//*  86  208:getfield        #90  <Field boolean d>
	//*  87  211:ifeq            234
	//*  88  214:iload_1         
	//*  89  215:ifne            234
	//*  90  218:aload_0         
	//*  91  219:getfield        #92  <Field boolean e>
	//*  92  222:ifeq            234
		{
			view1.setActivated(true);
	//   93  225:aload           4
	//   94  227:iconst_1        
	//   95  228:invokevirtual   #198 <Method void View.setActivated(boolean)>
			return view1;
	//   96  231:aload           4
	//   97  233:areturn         
		} else
		{
			view1.setActivated(false);
	//   98  234:aload           4
	//   99  236:iconst_0        
	//  100  237:invokevirtual   #198 <Method void View.setActivated(boolean)>
			return view1;
	//  101  240:aload           4
	//  102  242:areturn         
		}
	}

	public int getViewTypeCount()
	{
		return 3;
	//    0    0:iconst_3        
	//    1    1:ireturn         
	}

	final ActivityChooserView a;
	private d b;
	private int c;
	private boolean d;
	private boolean e;
	private boolean f;

	ActivityChooserView$a(ActivityChooserView activitychooserview)
	{
		a = activitychooserview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ActivityChooserView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void BaseAdapter()>
		c = 4;
	//    5    9:aload_0         
	//    6   10:iconst_4        
	//    7   11:putfield        #25  <Field int c>
	//    8   14:return          
	}
}
