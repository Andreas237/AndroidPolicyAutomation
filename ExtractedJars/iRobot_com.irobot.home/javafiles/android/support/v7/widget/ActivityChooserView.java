// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.b;
import android.support.v7.view.menu.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, ListPopupWindow, d, av, 
//			ac

public class ActivityChooserView extends ViewGroup
{
	public static class InnerLayout extends LinearLayoutCompat
	{

		private static final int a[] = {
			0x10100d4
		};

		static 
		{
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:ldc1            #12  <Int 0x10100d4>
		//    5    7:iastore         
		//    6    8:putstatic       #14  <Field int[] a>
		//*   7   11:return          
		}

		public InnerLayout(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void LinearLayoutCompat(Context, AttributeSet)>
			context = ((Context) (av.a(context, attributeset, a)));
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:getstatic       #14  <Field int[] a>
		//    7   11:invokestatic    #24  <Method av av.a(Context, AttributeSet, int[])>
		//    8   14:astore_1        
			setBackgroundDrawable(((av) (context)).a(0));
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:iconst_0        
		//   12   18:invokevirtual   #27  <Method Drawable av.a(int)>
		//   13   21:invokevirtual   #31  <Method void setBackgroundDrawable(Drawable)>
			((av) (context)).a();
		//   14   24:aload_1         
		//   15   25:invokevirtual   #33  <Method void av.a()>
		//   16   28:return          
		}
	}

	private class a extends BaseAdapter
	{

		public int a()
		{
			int k1 = c;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int c>
		//    2    4:istore_3        
			c = 0x7fffffff;
		//    3    5:aload_0         
		//    4    6:ldc1            #28  <Int 0x7fffffff>
		//    5    8:putfield        #25  <Field int c>
			int i1 = 0;
		//    6   11:iconst_0        
		//    7   12:istore_1        
			int l1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
		//    8   13:iconst_0        
		//    9   14:iconst_0        
		//   10   15:invokestatic    #34  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   11   18:istore          4
			int i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
		//   12   20:iconst_0        
		//   13   21:iconst_0        
		//   14   22:invokestatic    #34  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   15   25:istore          5
			int j2 = getCount();
		//   16   27:aload_0         
		//   17   28:invokevirtual   #37  <Method int getCount()>
		//   18   31:istore          6
			View view = null;
		//   19   33:aconst_null     
		//   20   34:astore          7
			int j1 = 0;
		//   21   36:iconst_0        
		//   22   37:istore_2        
			for(; i1 < j2; i1++)
		//*  23   38:iload_1         
		//*  24   39:iload           6
		//*  25   41:icmpge          80
			{
				view = getView(i1, view, ((ViewGroup) (null)));
		//   26   44:aload_0         
		//   27   45:iload_1         
		//   28   46:aload           7
		//   29   48:aconst_null     
		//   30   49:invokevirtual   #41  <Method View getView(int, View, ViewGroup)>
		//   31   52:astore          7
				view.measure(l1, i2);
		//   32   54:aload           7
		//   33   56:iload           4
		//   34   58:iload           5
		//   35   60:invokevirtual   #47  <Method void View.measure(int, int)>
				j1 = Math.max(j1, view.getMeasuredWidth());
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
			c = k1;
		//   46   80:aload_0         
		//   47   81:iload_3         
		//   48   82:putfield        #25  <Field int c>
			return j1;
		//   49   85:iload_2         
		//   50   86:ireturn         
		}

		public void a(int i1)
		{
			if(c != i1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field int c>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          17
			{
				c = i1;
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
		//   14   30:getfield        #73  <Field DataSetObserver ActivityChooserView.e>
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
		//   28   60:getfield        #73  <Field DataSetObserver ActivityChooserView.e>
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
		//    2    4:invokevirtual   #95  <Method ResolveInfo android.support.v7.widget.d.b()>
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
			int j1 = b.a();
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field d b>
		//    2    4:invokevirtual   #97  <Method int d.a()>
		//    3    7:istore_2        
			int i1 = j1;
		//    4    8:iload_2         
		//    5    9:istore_1        
			if(!d)
		//*   6   10:aload_0         
		//*   7   11:getfield        #90  <Field boolean d>
		//*   8   14:ifne            33
			{
				i1 = j1;
		//    9   17:iload_2         
		//   10   18:istore_1        
				if(b.b() != null)
		//*  11   19:aload_0         
		//*  12   20:getfield        #81  <Field d b>
		//*  13   23:invokevirtual   #95  <Method ResolveInfo android.support.v7.widget.d.b()>
		//*  14   26:ifnull          33
					i1 = j1 - 1;
		//   15   29:iload_2         
		//   16   30:iconst_1        
		//   17   31:isub            
		//   18   32:istore_1        
			}
			j1 = Math.min(i1, c);
		//   19   33:iload_1         
		//   20   34:aload_0         
		//   21   35:getfield        #25  <Field int c>
		//   22   38:invokestatic    #102 <Method int Math.min(int, int)>
		//   23   41:istore_2        
			i1 = j1;
		//   24   42:iload_2         
		//   25   43:istore_1        
			if(f)
		//*  26   44:aload_0         
		//*  27   45:getfield        #87  <Field boolean f>
		//*  28   48:ifeq            55
				i1 = j1 + 1;
		//   29   51:iload_2         
		//   30   52:iconst_1        
		//   31   53:iadd            
		//   32   54:istore_1        
			return i1;
		//   33   55:iload_1         
		//   34   56:ireturn         
		}

		public Object getItem(int i1)
		{
			int j1;
			switch(getItemViewType(i1))
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:invokevirtual   #108 <Method int getItemViewType(int)>
			{
		//*   3    5:tableswitch     0 1: default 28
		//		               0 38
		//		               1 36
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
				j1 = i1;
		//   10   38:iload_1         
		//   11   39:istore_2        
				break;
			}
			if(!d)
		//*  12   40:aload_0         
		//*  13   41:getfield        #90  <Field boolean d>
		//*  14   44:ifne            63
			{
				j1 = i1;
		//   15   47:iload_1         
		//   16   48:istore_2        
				if(b.b() != null)
		//*  17   49:aload_0         
		//*  18   50:getfield        #81  <Field d b>
		//*  19   53:invokevirtual   #95  <Method ResolveInfo android.support.v7.widget.d.b()>
		//*  20   56:ifnull          63
					j1 = i1 + 1;
		//   21   59:iload_1         
		//   22   60:iconst_1        
		//   23   61:iadd            
		//   24   62:istore_2        
			}
			return ((Object) (b.a(j1)));
		//   25   63:aload_0         
		//   26   64:getfield        #81  <Field d b>
		//   27   67:iload_2         
		//   28   68:invokevirtual   #114 <Method ResolveInfo d.a(int)>
		//   29   71:areturn         
		}

		public long getItemId(int i1)
		{
			return (long)i1;
		//    0    0:iload_1         
		//    1    1:i2l             
		//    2    2:lreturn         
		}

		public int getItemViewType(int i1)
		{
			return !f || i1 != getCount() - 1 ? 0 : 1;
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

		public View getView(int i1, View view, ViewGroup viewgroup)
		{
			getItemViewType(i1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #108 <Method int getItemViewType(int)>
			JVM INSTR tableswitch 0 1: default 28
		//		               0 107
		//		               1 36;
		//    3    5:tableswitch     0 1: default 28
		//		               0 107
		//		               1 36
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
			ResolveInfo resolveinfo = (ResolveInfo)getItem(i1);
		//   67  167:aload_0         
		//   68  168:iload_1         
		//   69  169:invokevirtual   #181 <Method Object getItem(int)>
		//   70  172:checkcast       #183 <Class ResolveInfo>
		//   71  175:astore          5
			((ImageView) (viewgroup)).setImageDrawable(resolveinfo.loadIcon(((android.content.pm.PackageManager) (view))));
		//   72  177:aload_3         
		//   73  178:aload           5
		//   74  180:aload_2         
		//   75  181:invokevirtual   #187 <Method Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
		//   76  184:invokevirtual   #191 <Method void ImageView.setImageDrawable(Drawable)>
			((TextView)view1.findViewById(android.support.v7.a.a.f.title)).setText(resolveinfo.loadLabel(((android.content.pm.PackageManager) (view))));
		//   77  187:aload           4
		//   78  189:getstatic       #146 <Field int android.support.v7.a.a$f.title>
		//   79  192:invokevirtual   #150 <Method View View.findViewById(int)>
		//   80  195:checkcast       #152 <Class TextView>
		//   81  198:aload           5
		//   82  200:aload_2         
		//   83  201:invokevirtual   #195 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
		//   84  204:invokevirtual   #167 <Method void TextView.setText(CharSequence)>
			if(d && i1 == 0 && e)
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

		a()
		{
			a = ActivityChooserView.this;
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

	private class b
		implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
	{

		private void a()
		{
			if(a.f != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field ActivityChooserView a>
		//*   2    4:getfield        #29  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.f>
		//*   3    7:ifnull          22
				a.f.onDismiss();
		//    4   10:aload_0         
		//    5   11:getfield        #21  <Field ActivityChooserView a>
		//    6   14:getfield        #29  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.f>
		//    7   17:invokeinterface #32  <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
		//    8   22:return          
		}

		public void onClick(View view)
		{
label0:
			{
				if(view == a.c)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #21  <Field ActivityChooserView a>
		//*   3    5:getfield        #38  <Field FrameLayout ActivityChooserView.c>
		//*   4    8:if_acmpne       83
				{
					a.b();
		//    5   11:aload_0         
		//    6   12:getfield        #21  <Field ActivityChooserView a>
		//    7   15:invokevirtual   #41  <Method boolean android.support.v7.widget.ActivityChooserView.b()>
		//    8   18:pop             
					view = ((View) (a.a.b()));
		//    9   19:aload_0         
		//   10   20:getfield        #21  <Field ActivityChooserView a>
		//   11   23:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
		//   12   26:invokevirtual   #49  <Method ResolveInfo android.support.v7.widget.ActivityChooserView$a.b()>
		//   13   29:astore_1        
					int i1 = a.a.e().a(((ResolveInfo) (view)));
		//   14   30:aload_0         
		//   15   31:getfield        #21  <Field ActivityChooserView a>
		//   16   34:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
		//   17   37:invokevirtual   #53  <Method d ActivityChooserView$a.e()>
		//   18   40:aload_1         
		//   19   41:invokevirtual   #58  <Method int d.a(ResolveInfo)>
		//   20   44:istore_2        
					view = ((View) (a.a.e().b(i1)));
		//   21   45:aload_0         
		//   22   46:getfield        #21  <Field ActivityChooserView a>
		//   23   49:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
		//   24   52:invokevirtual   #53  <Method d ActivityChooserView$a.e()>
		//   25   55:iload_2         
		//   26   56:invokevirtual   #61  <Method Intent android.support.v7.widget.d.b(int)>
		//   27   59:astore_1        
					if(view != null)
		//*  28   60:aload_1         
		//*  29   61:ifnull          116
					{
						((Intent) (view)).addFlags(0x80000);
		//   30   64:aload_1         
		//   31   65:ldc1            #62  <Int 0x80000>
		//   32   67:invokevirtual   #67  <Method Intent Intent.addFlags(int)>
		//   33   70:pop             
						a.getContext().startActivity(((Intent) (view)));
		//   34   71:aload_0         
		//   35   72:getfield        #21  <Field ActivityChooserView a>
		//   36   75:invokevirtual   #71  <Method Context ActivityChooserView.getContext()>
		//   37   78:aload_1         
		//   38   79:invokevirtual   #77  <Method void Context.startActivity(Intent)>
						return;
		//   39   82:return          
					}
				} else
				{
					if(view != a.b)
						break label0;
		//   40   83:aload_1         
		//   41   84:aload_0         
		//   42   85:getfield        #21  <Field ActivityChooserView a>
		//   43   88:getfield        #79  <Field FrameLayout android.support.v7.widget.ActivityChooserView.b>
		//   44   91:if_acmpne       117
					a.g = false;
		//   45   94:aload_0         
		//   46   95:getfield        #21  <Field ActivityChooserView a>
		//   47   98:iconst_0        
		//   48   99:putfield        #83  <Field boolean ActivityChooserView.g>
					a.a(a.h);
		//   49  102:aload_0         
		//   50  103:getfield        #21  <Field ActivityChooserView a>
		//   51  106:aload_0         
		//   52  107:getfield        #21  <Field ActivityChooserView a>
		//   53  110:getfield        #87  <Field int ActivityChooserView.h>
		//   54  113:invokevirtual   #90  <Method void ActivityChooserView.a(int)>
				}
				return;
		//   55  116:return          
			}
			throw new IllegalArgumentException();
		//   56  117:new             #92  <Class IllegalArgumentException>
		//   57  120:dup             
		//   58  121:invokespecial   #93  <Method void IllegalArgumentException()>
		//   59  124:athrow          
		}

		public void onDismiss()
		{
			a();
		//    0    0:aload_0         
		//    1    1:invokespecial   #95  <Method void a()>
			if(a.d != null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #21  <Field ActivityChooserView a>
		//*   4    8:getfield        #99  <Field b ActivityChooserView.d>
		//*   5   11:ifnull          25
				a.d.a(false);
		//    6   14:aload_0         
		//    7   15:getfield        #21  <Field ActivityChooserView a>
		//    8   18:getfield        #99  <Field b ActivityChooserView.d>
		//    9   21:iconst_0        
		//   10   22:invokevirtual   #104 <Method void b.a(boolean)>
		//   11   25:return          
		}

		public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
		{
			switch(((a)adapterview.getAdapter()).getItemViewType(i1))
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #112 <Method android.widget.Adapter AdapterView.getAdapter()>
		//*   2    4:checkcast       #46  <Class ActivityChooserView$a>
		//*   3    7:iload_3         
		//*   4    8:invokevirtual   #116 <Method int ActivityChooserView$a.getItemViewType(int)>
			{
		//*   5   11:tableswitch     0 1: default 32
		//		               0 50
		//		               1 40
			default:
				throw new IllegalArgumentException();
		//    6   32:new             #92  <Class IllegalArgumentException>
		//    7   35:dup             
		//    8   36:invokespecial   #93  <Method void IllegalArgumentException()>
		//    9   39:athrow          

			case 1: // '\001'
				a.a(0x7fffffff);
		//   10   40:aload_0         
		//   11   41:getfield        #21  <Field ActivityChooserView a>
		//   12   44:ldc1            #117 <Int 0x7fffffff>
		//   13   46:invokevirtual   #90  <Method void ActivityChooserView.a(int)>
				return;
		//   14   49:return          

			case 0: // '\0'
				a.b();
		//   15   50:aload_0         
		//   16   51:getfield        #21  <Field ActivityChooserView a>
		//   17   54:invokevirtual   #41  <Method boolean android.support.v7.widget.ActivityChooserView.b()>
		//   18   57:pop             
				break;
			}
			if(a.g)
		//*  19   58:aload_0         
		//*  20   59:getfield        #21  <Field ActivityChooserView a>
		//*  21   62:getfield        #83  <Field boolean ActivityChooserView.g>
		//*  22   65:ifeq            87
			{
				if(i1 > 0)
		//*  23   68:iload_3         
		//*  24   69:ifle            144
				{
					a.a.e().c(i1);
		//   25   72:aload_0         
		//   26   73:getfield        #21  <Field ActivityChooserView a>
		//   27   76:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
		//   28   79:invokevirtual   #53  <Method d ActivityChooserView$a.e()>
		//   29   82:iload_3         
		//   30   83:invokevirtual   #119 <Method void d.c(int)>
					return;
		//   31   86:return          
				}
			} else
			{
				if(!a.a.f())
		//*  32   87:aload_0         
		//*  33   88:getfield        #21  <Field ActivityChooserView a>
		//*  34   91:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
		//*  35   94:invokevirtual   #121 <Method boolean ActivityChooserView$a.f()>
		//*  36   97:ifeq            103
		//*  37  100:goto            107
					i1++;
		//   38  103:iload_3         
		//   39  104:iconst_1        
		//   40  105:iadd            
		//   41  106:istore_3        
				adapterview = ((AdapterView) (a.a.e().b(i1)));
		//   42  107:aload_0         
		//   43  108:getfield        #21  <Field ActivityChooserView a>
		//   44  111:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
		//   45  114:invokevirtual   #53  <Method d ActivityChooserView$a.e()>
		//   46  117:iload_3         
		//   47  118:invokevirtual   #61  <Method Intent android.support.v7.widget.d.b(int)>
		//   48  121:astore_1        
				if(adapterview != null)
		//*  49  122:aload_1         
		//*  50  123:ifnull          144
				{
					((Intent) (adapterview)).addFlags(0x80000);
		//   51  126:aload_1         
		//   52  127:ldc1            #62  <Int 0x80000>
		//   53  129:invokevirtual   #67  <Method Intent Intent.addFlags(int)>
		//   54  132:pop             
					a.getContext().startActivity(((Intent) (adapterview)));
		//   55  133:aload_0         
		//   56  134:getfield        #21  <Field ActivityChooserView a>
		//   57  137:invokevirtual   #71  <Method Context ActivityChooserView.getContext()>
		//   58  140:aload_1         
		//   59  141:invokevirtual   #77  <Method void Context.startActivity(Intent)>
				}
			}
		//   60  144:return          
		}

		public boolean onLongClick(View view)
		{
			if(view == a.c)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #21  <Field ActivityChooserView a>
		//*   3    5:getfield        #38  <Field FrameLayout ActivityChooserView.c>
		//*   4    8:if_acmpne       48
			{
				if(a.a.getCount() > 0)
		//*   5   11:aload_0         
		//*   6   12:getfield        #21  <Field ActivityChooserView a>
		//*   7   15:getfield        #44  <Field ActivityChooserView$a ActivityChooserView.a>
		//*   8   18:invokevirtual   #129 <Method int ActivityChooserView$a.getCount()>
		//*   9   21:ifle            46
				{
					a.g = true;
		//   10   24:aload_0         
		//   11   25:getfield        #21  <Field ActivityChooserView a>
		//   12   28:iconst_1        
		//   13   29:putfield        #83  <Field boolean ActivityChooserView.g>
					a.a(a.h);
		//   14   32:aload_0         
		//   15   33:getfield        #21  <Field ActivityChooserView a>
		//   16   36:aload_0         
		//   17   37:getfield        #21  <Field ActivityChooserView a>
		//   18   40:getfield        #87  <Field int ActivityChooserView.h>
		//   19   43:invokevirtual   #90  <Method void ActivityChooserView.a(int)>
				}
				return true;
		//   20   46:iconst_1        
		//   21   47:ireturn         
			} else
			{
				throw new IllegalArgumentException();
		//   22   48:new             #92  <Class IllegalArgumentException>
		//   23   51:dup             
		//   24   52:invokespecial   #93  <Method void IllegalArgumentException()>
		//   25   55:athrow          
			}
		}

		final ActivityChooserView a;

		b()
		{
			a = ActivityChooserView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field ActivityChooserView a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
		//    5    9:return          
		}
	}


	public ActivityChooserView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #57  <Method void ActivityChooserView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActivityChooserView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #61  <Method void ActivityChooserView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ActivityChooserView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #62  <Method void ViewGroup(Context, AttributeSet, int)>
		e = ((DataSetObserver) (new DataSetObserver() {

			public void onChanged()
			{
				super.onChanged();
			//    0    0:aload_0         
			//    1    1:invokespecial   #19  <Method void DataSetObserver.onChanged()>
				a.a.notifyDataSetChanged();
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field ActivityChooserView a>
			//    4    8:getfield        #22  <Field ActivityChooserView$a ActivityChooserView.a>
			//    5   11:invokevirtual   #27  <Method void ActivityChooserView$a.notifyDataSetChanged()>
			//    6   14:return          
			}

			public void onInvalidated()
			{
				super.onInvalidated();
			//    0    0:aload_0         
			//    1    1:invokespecial   #30  <Method void DataSetObserver.onInvalidated()>
				a.a.notifyDataSetInvalidated();
			//    2    4:aload_0         
			//    3    5:getfield        #12  <Field ActivityChooserView a>
			//    4    8:getfield        #22  <Field ActivityChooserView$a ActivityChooserView.a>
			//    5   11:invokevirtual   #33  <Method void ActivityChooserView$a.notifyDataSetInvalidated()>
			//    6   14:return          
			}

			final ActivityChooserView a;

			
			{
				a = ActivityChooserView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ActivityChooserView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void DataSetObserver()>
			//    5    9:return          
			}
		}
));
	//    5    7:aload_0         
	//    6    8:new             #6   <Class ActivityChooserView$1>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #65  <Method void ActivityChooserView$1(ActivityChooserView)>
	//   10   16:putfield        #67  <Field DataSetObserver e>
		o = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

			public void onGlobalLayout()
			{
				if(a.c())
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field ActivityChooserView a>
			//*   2    4:invokevirtual   #23  <Method boolean ActivityChooserView.c()>
			//*   3    7:ifeq            62
				{
					if(!a.isShown())
			//*   4   10:aload_0         
			//*   5   11:getfield        #14  <Field ActivityChooserView a>
			//*   6   14:invokevirtual   #26  <Method boolean ActivityChooserView.isShown()>
			//*   7   17:ifne            31
					{
						a.getListPopupWindow().e();
			//    8   20:aload_0         
			//    9   21:getfield        #14  <Field ActivityChooserView a>
			//   10   24:invokevirtual   #30  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
			//   11   27:invokevirtual   #35  <Method void ListPopupWindow.e()>
						return;
			//   12   30:return          
					}
					a.getListPopupWindow().d();
			//   13   31:aload_0         
			//   14   32:getfield        #14  <Field ActivityChooserView a>
			//   15   35:invokevirtual   #30  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
			//   16   38:invokevirtual   #38  <Method void ListPopupWindow.d()>
					if(a.d != null)
			//*  17   41:aload_0         
			//*  18   42:getfield        #14  <Field ActivityChooserView a>
			//*  19   45:getfield        #41  <Field b ActivityChooserView.d>
			//*  20   48:ifnull          62
						a.d.a(true);
			//   21   51:aload_0         
			//   22   52:getfield        #14  <Field ActivityChooserView a>
			//   23   55:getfield        #41  <Field b ActivityChooserView.d>
			//   24   58:iconst_1        
			//   25   59:invokevirtual   #46  <Method void b.a(boolean)>
				}
			//   26   62:return          
			}

			final ActivityChooserView a;

			
			{
				a = ActivityChooserView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActivityChooserView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   11   19:aload_0         
	//   12   20:new             #8   <Class ActivityChooserView$2>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #68  <Method void ActivityChooserView$2(ActivityChooserView)>
	//   16   28:putfield        #70  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener o>
		h = 4;
	//   17   31:aload_0         
	//   18   32:iconst_4        
	//   19   33:putfield        #72  <Field int h>
		Object obj = ((Object) (context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.ActivityChooserView, i1, 0)));
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:getstatic       #78  <Field int[] android.support.v7.a.a$j.ActivityChooserView>
	//   23   41:iload_3         
	//   24   42:iconst_0        
	//   25   43:invokevirtual   #84  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   26   46:astore          4
		h = ((TypedArray) (obj)).getInt(android.support.v7.a.a.j.ActivityChooserView_initialActivityCount, 4);
	//   27   48:aload_0         
	//   28   49:aload           4
	//   29   51:getstatic       #87  <Field int android.support.v7.a.a$j.ActivityChooserView_initialActivityCount>
	//   30   54:iconst_4        
	//   31   55:invokevirtual   #93  <Method int TypedArray.getInt(int, int)>
	//   32   58:putfield        #72  <Field int h>
		attributeset = ((AttributeSet) (((TypedArray) (obj)).getDrawable(android.support.v7.a.a.j.ActivityChooserView_expandActivityOverflowButtonDrawable)));
	//   33   61:aload           4
	//   34   63:getstatic       #96  <Field int android.support.v7.a.a$j.ActivityChooserView_expandActivityOverflowButtonDrawable>
	//   35   66:invokevirtual   #100 <Method Drawable TypedArray.getDrawable(int)>
	//   36   69:astore_2        
		((TypedArray) (obj)).recycle();
	//   37   70:aload           4
	//   38   72:invokevirtual   #104 <Method void TypedArray.recycle()>
		LayoutInflater.from(getContext()).inflate(android.support.v7.a.a.g.abc_activity_chooser_view, ((ViewGroup) (this)), true);
	//   39   75:aload_0         
	//   40   76:invokevirtual   #108 <Method Context getContext()>
	//   41   79:invokestatic    #114 <Method LayoutInflater LayoutInflater.from(Context)>
	//   42   82:getstatic       #119 <Field int android.support.v7.a.a$g.abc_activity_chooser_view>
	//   43   85:aload_0         
	//   44   86:iconst_1        
	//   45   87:invokevirtual   #123 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   46   90:pop             
		i = new b();
	//   47   91:aload_0         
	//   48   92:new             #22  <Class ActivityChooserView$b>
	//   49   95:dup             
	//   50   96:aload_0         
	//   51   97:invokespecial   #124 <Method void ActivityChooserView$b(ActivityChooserView)>
	//   52  100:putfield        #126 <Field ActivityChooserView$b i>
		j = (LinearLayoutCompat)findViewById(android.support.v7.a.a.f.activity_chooser_view_content);
	//   53  103:aload_0         
	//   54  104:aload_0         
	//   55  105:getstatic       #131 <Field int android.support.v7.a.a$f.activity_chooser_view_content>
	//   56  108:invokevirtual   #135 <Method View findViewById(int)>
	//   57  111:checkcast       #137 <Class LinearLayoutCompat>
	//   58  114:putfield        #139 <Field LinearLayoutCompat j>
		k = j.getBackground();
	//   59  117:aload_0         
	//   60  118:aload_0         
	//   61  119:getfield        #139 <Field LinearLayoutCompat j>
	//   62  122:invokevirtual   #143 <Method Drawable LinearLayoutCompat.getBackground()>
	//   63  125:putfield        #145 <Field Drawable k>
		c = (FrameLayout)findViewById(android.support.v7.a.a.f.default_activity_button);
	//   64  128:aload_0         
	//   65  129:aload_0         
	//   66  130:getstatic       #148 <Field int android.support.v7.a.a$f.default_activity_button>
	//   67  133:invokevirtual   #135 <Method View findViewById(int)>
	//   68  136:checkcast       #150 <Class FrameLayout>
	//   69  139:putfield        #152 <Field FrameLayout c>
		c.setOnClickListener(((android.view.View.OnClickListener) (i)));
	//   70  142:aload_0         
	//   71  143:getfield        #152 <Field FrameLayout c>
	//   72  146:aload_0         
	//   73  147:getfield        #126 <Field ActivityChooserView$b i>
	//   74  150:invokevirtual   #156 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		c.setOnLongClickListener(((android.view.View.OnLongClickListener) (i)));
	//   75  153:aload_0         
	//   76  154:getfield        #152 <Field FrameLayout c>
	//   77  157:aload_0         
	//   78  158:getfield        #126 <Field ActivityChooserView$b i>
	//   79  161:invokevirtual   #160 <Method void FrameLayout.setOnLongClickListener(android.view.View$OnLongClickListener)>
		m = (ImageView)c.findViewById(android.support.v7.a.a.f.image);
	//   80  164:aload_0         
	//   81  165:aload_0         
	//   82  166:getfield        #152 <Field FrameLayout c>
	//   83  169:getstatic       #163 <Field int android.support.v7.a.a$f.image>
	//   84  172:invokevirtual   #164 <Method View FrameLayout.findViewById(int)>
	//   85  175:checkcast       #166 <Class ImageView>
	//   86  178:putfield        #168 <Field ImageView m>
		obj = ((Object) ((FrameLayout)findViewById(android.support.v7.a.a.f.expand_activities_button)));
	//   87  181:aload_0         
	//   88  182:getstatic       #171 <Field int android.support.v7.a.a$f.expand_activities_button>
	//   89  185:invokevirtual   #135 <Method View findViewById(int)>
	//   90  188:checkcast       #150 <Class FrameLayout>
	//   91  191:astore          4
		((FrameLayout) (obj)).setOnClickListener(((android.view.View.OnClickListener) (i)));
	//   92  193:aload           4
	//   93  195:aload_0         
	//   94  196:getfield        #126 <Field ActivityChooserView$b i>
	//   95  199:invokevirtual   #156 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		((FrameLayout) (obj)).setAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (new android.view.View.AccessibilityDelegate() {

			public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
			{
				super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfo);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #22  <Method void android.view.View$AccessibilityDelegate.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfo)>
				android.support.v4.view.a.b.a(accessibilitynodeinfo).m(true);
			//    4    6:aload_2         
			//    5    7:invokestatic    #27  <Method android.support.v4.view.a.b android.support.v4.view.a.b.a(AccessibilityNodeInfo)>
			//    6   10:iconst_1        
			//    7   11:invokevirtual   #31  <Method void android.support.v4.view.a.b.m(boolean)>
			//    8   14:return          
			}

			final ActivityChooserView a;

			
			{
				a = ActivityChooserView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActivityChooserView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void android.view.View$AccessibilityDelegate()>
			//    5    9:return          
			}
		}
)));
	//   96  202:aload           4
	//   97  204:new             #10  <Class ActivityChooserView$3>
	//   98  207:dup             
	//   99  208:aload_0         
	//  100  209:invokespecial   #172 <Method void ActivityChooserView$3(ActivityChooserView)>
	//  101  212:invokevirtual   #176 <Method void FrameLayout.setAccessibilityDelegate(android.view.View$AccessibilityDelegate)>
		((FrameLayout) (obj)).setOnTouchListener(((android.view.View.OnTouchListener) (new ac(((View) (obj))) {

			public s a()
			{
				return ((s) (a.getListPopupWindow()));
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ActivityChooserView a>
			//    2    4:invokevirtual   #23  <Method ListPopupWindow ActivityChooserView.getListPopupWindow()>
			//    3    7:areturn         
			}

			protected boolean b()
			{
				a.a();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ActivityChooserView a>
			//    2    4:invokevirtual   #27  <Method boolean ActivityChooserView.a()>
			//    3    7:pop             
				return true;
			//    4    8:iconst_1        
			//    5    9:ireturn         
			}

			protected boolean c()
			{
				a.b();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ActivityChooserView a>
			//    2    4:invokevirtual   #30  <Method boolean android.support.v7.widget.ActivityChooserView.b()>
			//    3    7:pop             
				return true;
			//    4    8:iconst_1        
			//    5    9:ireturn         
			}

			final ActivityChooserView a;

			
			{
				a = ActivityChooserView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActivityChooserView a>
				super(view);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #17  <Method void ac(View)>
			//    6   10:return          
			}
		}
)));
	//  102  215:aload           4
	//  103  217:new             #12  <Class ActivityChooserView$4>
	//  104  220:dup             
	//  105  221:aload_0         
	//  106  222:aload           4
	//  107  224:invokespecial   #179 <Method void ActivityChooserView$4(ActivityChooserView, View)>
	//  108  227:invokevirtual   #183 <Method void FrameLayout.setOnTouchListener(android.view.View$OnTouchListener)>
		b = ((FrameLayout) (obj));
	//  109  230:aload_0         
	//  110  231:aload           4
	//  111  233:putfield        #185 <Field FrameLayout b>
		l = (ImageView)((FrameLayout) (obj)).findViewById(android.support.v7.a.a.f.image);
	//  112  236:aload_0         
	//  113  237:aload           4
	//  114  239:getstatic       #163 <Field int android.support.v7.a.a$f.image>
	//  115  242:invokevirtual   #164 <Method View FrameLayout.findViewById(int)>
	//  116  245:checkcast       #166 <Class ImageView>
	//  117  248:putfield        #187 <Field ImageView l>
		l.setImageDrawable(((Drawable) (attributeset)));
	//  118  251:aload_0         
	//  119  252:getfield        #187 <Field ImageView l>
	//  120  255:aload_2         
	//  121  256:invokevirtual   #191 <Method void ImageView.setImageDrawable(Drawable)>
		a = new a();
	//  122  259:aload_0         
	//  123  260:new             #19  <Class ActivityChooserView$a>
	//  124  263:dup             
	//  125  264:aload_0         
	//  126  265:invokespecial   #192 <Method void ActivityChooserView$a(ActivityChooserView)>
	//  127  268:putfield        #194 <Field ActivityChooserView$a a>
		a.registerDataSetObserver(((DataSetObserver) (new DataSetObserver() {

			public void onChanged()
			{
				super.onChanged();
			//    0    0:aload_0         
			//    1    1:invokespecial   #21  <Method void DataSetObserver.onChanged()>
				a.d();
			//    2    4:aload_0         
			//    3    5:getfield        #14  <Field ActivityChooserView a>
			//    4    8:invokevirtual   #24  <Method void ActivityChooserView.d()>
			//    5   11:return          
			}

			final ActivityChooserView a;

			
			{
				a = ActivityChooserView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActivityChooserView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void DataSetObserver()>
			//    5    9:return          
			}
		}
)));
	//  128  271:aload_0         
	//  129  272:getfield        #194 <Field ActivityChooserView$a a>
	//  130  275:new             #14  <Class ActivityChooserView$5>
	//  131  278:dup             
	//  132  279:aload_0         
	//  133  280:invokespecial   #195 <Method void ActivityChooserView$5(ActivityChooserView)>
	//  134  283:invokevirtual   #199 <Method void ActivityChooserView$a.registerDataSetObserver(DataSetObserver)>
		context = ((Context) (context.getResources()));
	//  135  286:aload_1         
	//  136  287:invokevirtual   #203 <Method Resources Context.getResources()>
	//  137  290:astore_1        
		n = Math.max(((Resources) (context)).getDisplayMetrics().widthPixels / 2, ((Resources) (context)).getDimensionPixelSize(android.support.v7.a.a.d.abc_config_prefDialogWidth));
	//  138  291:aload_0         
	//  139  292:aload_1         
	//  140  293:invokevirtual   #209 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  141  296:getfield        #214 <Field int DisplayMetrics.widthPixels>
	//  142  299:iconst_2        
	//  143  300:idiv            
	//  144  301:aload_1         
	//  145  302:getstatic       #219 <Field int android.support.v7.a.a$d.abc_config_prefDialogWidth>
	//  146  305:invokevirtual   #223 <Method int Resources.getDimensionPixelSize(int)>
	//  147  308:invokestatic    #228 <Method int Math.max(int, int)>
	//  148  311:putfield        #230 <Field int n>
	//  149  314:return          
	}

	void a(int i1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #233 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #235 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #240 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public boolean a()
	{
		if(!c())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #243 <Method boolean c()>
	//*   2    4:ifne            31
		{
			if(!q)
	//*   3    7:aload_0         
	//*   4    8:getfield        #245 <Field boolean q>
	//*   5   11:ifne            16
			{
				return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
			} else
			{
				g = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #247 <Field boolean g>
				a(h);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #72  <Field int h>
	//   14   26:invokevirtual   #249 <Method void a(int)>
				return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
			}
		} else
		{
			return false;
	//   17   31:iconst_0        
	//   18   32:ireturn         
		}
	}

	public boolean b()
	{
		if(c())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #243 <Method boolean c()>
	//*   2    4:ifeq            34
		{
			getListPopupWindow().e();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #253 <Method ListPopupWindow getListPopupWindow()>
	//    5   11:invokevirtual   #257 <Method void ListPopupWindow.e()>
			ViewTreeObserver viewtreeobserver = getViewTreeObserver();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #261 <Method ViewTreeObserver getViewTreeObserver()>
	//    8   18:astore_1        
			if(viewtreeobserver.isAlive())
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #266 <Method boolean ViewTreeObserver.isAlive()>
	//*  11   23:ifeq            34
				viewtreeobserver.removeGlobalOnLayoutListener(o);
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #70  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener o>
	//   15   31:invokevirtual   #270 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
	}

	public boolean c()
	{
		return getListPopupWindow().f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #253 <Method ListPopupWindow getListPopupWindow()>
	//    2    4:invokevirtual   #272 <Method boolean ListPopupWindow.f()>
	//    3    7:ireturn         
	}

	void d()
	{
		if(a.getCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field ActivityChooserView$a a>
	//*   2    4:invokevirtual   #276 <Method int ActivityChooserView$a.getCount()>
	//*   3    7:ifle            21
			b.setEnabled(true);
	//    4   10:aload_0         
	//    5   11:getfield        #185 <Field FrameLayout b>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #280 <Method void FrameLayout.setEnabled(boolean)>
		else
	//*   8   18:goto            29
			b.setEnabled(false);
	//    9   21:aload_0         
	//   10   22:getfield        #185 <Field FrameLayout b>
	//   11   25:iconst_0        
	//   12   26:invokevirtual   #280 <Method void FrameLayout.setEnabled(boolean)>
		int i1 = a.c();
	//   13   29:aload_0         
	//   14   30:getfield        #194 <Field ActivityChooserView$a a>
	//   15   33:invokevirtual   #282 <Method int ActivityChooserView$a.c()>
	//   16   36:istore_1        
		int j1 = a.d();
	//   17   37:aload_0         
	//   18   38:getfield        #194 <Field ActivityChooserView$a a>
	//   19   41:invokevirtual   #284 <Method int ActivityChooserView$a.d()>
	//   20   44:istore_2        
		if(i1 != 1 && (i1 <= 1 || j1 <= 0))
	//*  21   45:iload_1         
	//*  22   46:iconst_1        
	//*  23   47:icmpeq          74
	//*  24   50:iload_1         
	//*  25   51:iconst_1        
	//*  26   52:icmple          62
	//*  27   55:iload_2         
	//*  28   56:ifle            62
	//*  29   59:goto            74
		{
			c.setVisibility(8);
	//   30   62:aload_0         
	//   31   63:getfield        #152 <Field FrameLayout c>
	//   32   66:bipush          8
	//   33   68:invokevirtual   #287 <Method void FrameLayout.setVisibility(int)>
		} else
	//*  34   71:goto            154
		{
			c.setVisibility(0);
	//   35   74:aload_0         
	//   36   75:getfield        #152 <Field FrameLayout c>
	//   37   78:iconst_0        
	//   38   79:invokevirtual   #287 <Method void FrameLayout.setVisibility(int)>
			Object obj = ((Object) (a.b()));
	//   39   82:aload_0         
	//   40   83:getfield        #194 <Field ActivityChooserView$a a>
	//   41   86:invokevirtual   #290 <Method ResolveInfo android.support.v7.widget.ActivityChooserView$a.b()>
	//   42   89:astore_3        
			android.content.pm.PackageManager packagemanager = getContext().getPackageManager();
	//   43   90:aload_0         
	//   44   91:invokevirtual   #108 <Method Context getContext()>
	//   45   94:invokevirtual   #294 <Method android.content.pm.PackageManager Context.getPackageManager()>
	//   46   97:astore          4
			m.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
	//   47   99:aload_0         
	//   48  100:getfield        #168 <Field ImageView m>
	//   49  103:aload_3         
	//   50  104:aload           4
	//   51  106:invokevirtual   #300 <Method Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
	//   52  109:invokevirtual   #191 <Method void ImageView.setImageDrawable(Drawable)>
			if(r != 0)
	//*  53  112:aload_0         
	//*  54  113:getfield        #302 <Field int r>
	//*  55  116:ifeq            154
			{
				obj = ((Object) (((ResolveInfo) (obj)).loadLabel(packagemanager)));
	//   56  119:aload_3         
	//   57  120:aload           4
	//   58  122:invokevirtual   #306 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
	//   59  125:astore_3        
				obj = ((Object) (getContext().getString(r, new Object[] {
					obj
				})));
	//   60  126:aload_0         
	//   61  127:invokevirtual   #108 <Method Context getContext()>
	//   62  130:aload_0         
	//   63  131:getfield        #302 <Field int r>
	//   64  134:iconst_1        
	//   65  135:anewarray       Object[]
	//   66  138:dup             
	//   67  139:iconst_0        
	//   68  140:aload_3         
	//   69  141:aastore         
	//   70  142:invokevirtual   #312 <Method String Context.getString(int, Object[])>
	//   71  145:astore_3        
				c.setContentDescription(((CharSequence) (obj)));
	//   72  146:aload_0         
	//   73  147:getfield        #152 <Field FrameLayout c>
	//   74  150:aload_3         
	//   75  151:invokevirtual   #316 <Method void FrameLayout.setContentDescription(CharSequence)>
			}
		}
		LinearLayoutCompat linearlayoutcompat;
		Drawable drawable;
		if(c.getVisibility() == 0)
	//*  76  154:aload_0         
	//*  77  155:getfield        #152 <Field FrameLayout c>
	//*  78  158:invokevirtual   #319 <Method int FrameLayout.getVisibility()>
	//*  79  161:ifne            182
		{
			linearlayoutcompat = j;
	//   80  164:aload_0         
	//   81  165:getfield        #139 <Field LinearLayoutCompat j>
	//   82  168:astore_3        
			drawable = k;
	//   83  169:aload_0         
	//   84  170:getfield        #145 <Field Drawable k>
	//   85  173:astore          4
		} else
	//*  86  175:aload_3         
	//*  87  176:aload           4
	//*  88  178:invokevirtual   #322 <Method void LinearLayoutCompat.setBackgroundDrawable(Drawable)>
	//*  89  181:return          
		{
			linearlayoutcompat = j;
	//   90  182:aload_0         
	//   91  183:getfield        #139 <Field LinearLayoutCompat j>
	//   92  186:astore_3        
			drawable = null;
	//   93  187:aconst_null     
	//   94  188:astore          4
		}
		linearlayoutcompat.setBackgroundDrawable(drawable);
	//*  95  190:goto            175
	}

	public d getDataModel()
	{
		return a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field ActivityChooserView$a a>
	//    2    4:invokevirtual   #326 <Method d ActivityChooserView$a.e()>
	//    3    7:areturn         
	}

	ListPopupWindow getListPopupWindow()
	{
		if(p == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #328 <Field ListPopupWindow p>
	//*   2    4:ifnonnull       71
		{
			p = new ListPopupWindow(getContext());
	//    3    7:aload_0         
	//    4    8:new             #255 <Class ListPopupWindow>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #108 <Method Context getContext()>
	//    8   16:invokespecial   #330 <Method void ListPopupWindow(Context)>
	//    9   19:putfield        #328 <Field ListPopupWindow p>
			p.a(((android.widget.ListAdapter) (a)));
	//   10   22:aload_0         
	//   11   23:getfield        #328 <Field ListPopupWindow p>
	//   12   26:aload_0         
	//   13   27:getfield        #194 <Field ActivityChooserView$a a>
	//   14   30:invokevirtual   #333 <Method void ListPopupWindow.a(android.widget.ListAdapter)>
			p.b(((View) (this)));
	//   15   33:aload_0         
	//   16   34:getfield        #328 <Field ListPopupWindow p>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #336 <Method void android.support.v7.widget.ListPopupWindow.b(View)>
			p.a(true);
	//   19   41:aload_0         
	//   20   42:getfield        #328 <Field ListPopupWindow p>
	//   21   45:iconst_1        
	//   22   46:invokevirtual   #338 <Method void ListPopupWindow.a(boolean)>
			p.a(((android.widget.AdapterView.OnItemClickListener) (i)));
	//   23   49:aload_0         
	//   24   50:getfield        #328 <Field ListPopupWindow p>
	//   25   53:aload_0         
	//   26   54:getfield        #126 <Field ActivityChooserView$b i>
	//   27   57:invokevirtual   #341 <Method void ListPopupWindow.a(android.widget.AdapterView$OnItemClickListener)>
			p.a(((android.widget.PopupWindow.OnDismissListener) (i)));
	//   28   60:aload_0         
	//   29   61:getfield        #328 <Field ListPopupWindow p>
	//   30   64:aload_0         
	//   31   65:getfield        #126 <Field ActivityChooserView$b i>
	//   32   68:invokevirtual   #344 <Method void ListPopupWindow.a(android.widget.PopupWindow$OnDismissListener)>
		}
		return p;
	//   33   71:aload_0         
	//   34   72:getfield        #328 <Field ListPopupWindow p>
	//   35   75:areturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #347 <Method void ViewGroup.onAttachedToWindow()>
		d d1 = a.e();
	//    2    4:aload_0         
	//    3    5:getfield        #194 <Field ActivityChooserView$a a>
	//    4    8:invokevirtual   #326 <Method d ActivityChooserView$a.e()>
	//    5   11:astore_1        
		if(d1 != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          24
			d1.registerObserver(((Object) (e)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #67  <Field DataSetObserver e>
	//   11   21:invokevirtual   #353 <Method void d.registerObserver(Object)>
		q = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #245 <Field boolean q>
	//   15   29:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #356 <Method void ViewGroup.onDetachedFromWindow()>
		Object obj = ((Object) (a.e()));
	//    2    4:aload_0         
	//    3    5:getfield        #194 <Field ActivityChooserView$a a>
	//    4    8:invokevirtual   #326 <Method d ActivityChooserView$a.e()>
	//    5   11:astore_1        
		if(obj != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          24
			((d) (obj)).unregisterObserver(((Object) (e)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #67  <Field DataSetObserver e>
	//   11   21:invokevirtual   #359 <Method void d.unregisterObserver(Object)>
		obj = ((Object) (getViewTreeObserver()));
	//   12   24:aload_0         
	//   13   25:invokevirtual   #261 <Method ViewTreeObserver getViewTreeObserver()>
	//   14   28:astore_1        
		if(((ViewTreeObserver) (obj)).isAlive())
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #266 <Method boolean ViewTreeObserver.isAlive()>
	//*  17   33:ifeq            44
			((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(o);
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #70  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener o>
	//   21   41:invokevirtual   #270 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		if(c())
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #243 <Method boolean c()>
	//*  24   48:ifeq            56
			b();
	//   25   51:aload_0         
	//   26   52:invokevirtual   #361 <Method boolean b()>
	//   27   55:pop             
		q = false;
	//   28   56:aload_0         
	//   29   57:iconst_0        
	//   30   58:putfield        #245 <Field boolean q>
	//   31   61:return          
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		j.layout(0, 0, k1 - i1, l1 - j1);
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field LinearLayoutCompat j>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iload           4
	//    5    8:iload_2         
	//    6    9:isub            
	//    7   10:iload           5
	//    8   12:iload_3         
	//    9   13:isub            
	//   10   14:invokevirtual   #367 <Method void LinearLayoutCompat.layout(int, int, int, int)>
		if(!c())
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #243 <Method boolean c()>
	//*  13   21:ifne            29
			b();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #361 <Method boolean b()>
	//   16   28:pop             
	//   17   29:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		LinearLayoutCompat linearlayoutcompat = j;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field LinearLayoutCompat j>
	//    2    4:astore          4
		int k1 = j1;
	//    3    6:iload_2         
	//    4    7:istore_3        
		if(c.getVisibility() != 0)
	//*   5    8:aload_0         
	//*   6    9:getfield        #152 <Field FrameLayout c>
	//*   7   12:invokevirtual   #319 <Method int FrameLayout.getVisibility()>
	//*   8   15:ifeq            29
			k1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j1), 0x40000000);
	//    9   18:iload_2         
	//   10   19:invokestatic    #374 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:ldc2            #375 <Int 0x40000000>
	//   12   25:invokestatic    #378 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   28:istore_3        
		measureChild(((View) (linearlayoutcompat)), i1, k1);
	//   14   29:aload_0         
	//   15   30:aload           4
	//   16   32:iload_1         
	//   17   33:iload_3         
	//   18   34:invokevirtual   #382 <Method void measureChild(View, int, int)>
		setMeasuredDimension(((View) (linearlayoutcompat)).getMeasuredWidth(), ((View) (linearlayoutcompat)).getMeasuredHeight());
	//   19   37:aload_0         
	//   20   38:aload           4
	//   21   40:invokevirtual   #387 <Method int View.getMeasuredWidth()>
	//   22   43:aload           4
	//   23   45:invokevirtual   #390 <Method int View.getMeasuredHeight()>
	//   24   48:invokevirtual   #393 <Method void setMeasuredDimension(int, int)>
	//   25   51:return          
	}

	public void setActivityChooserModel(d d1)
	{
		a.a(d1);
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field ActivityChooserView$a a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #397 <Method void ActivityChooserView$a.a(d)>
		if(c())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #243 <Method boolean c()>
	//*   6   12:ifeq            25
		{
			b();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #361 <Method boolean b()>
	//    9   19:pop             
			a();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #399 <Method boolean a()>
	//   12   24:pop             
		}
	//   13   25:return          
	}

	public void setDefaultActionButtonContentDescription(int i1)
	{
		r = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #302 <Field int r>
	//    3    5:return          
	}

	public void setExpandActivityOverflowButtonContentDescription(int i1)
	{
		String s = getContext().getString(i1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method Context getContext()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #404 <Method String Context.getString(int)>
	//    4    8:astore_2        
		l.setContentDescription(((CharSequence) (s)));
	//    5    9:aload_0         
	//    6   10:getfield        #187 <Field ImageView l>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #405 <Method void ImageView.setContentDescription(CharSequence)>
	//    9   17:return          
	}

	public void setExpandActivityOverflowButtonDrawable(Drawable drawable)
	{
		l.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field ImageView l>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #191 <Method void ImageView.setImageDrawable(Drawable)>
	//    4    8:return          
	}

	public void setInitialActivityCount(int i1)
	{
		h = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field int h>
	//    3    5:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		f = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #410 <Field android.widget.PopupWindow$OnDismissListener f>
	//    3    5:return          
	}

	public void setProvider(android.support.v4.view.b b1)
	{
		d = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #414 <Field b d>
	//    3    5:return          
	}

	final a a;
	final FrameLayout b;
	final FrameLayout c;
	android.support.v4.view.b d;
	final DataSetObserver e;
	android.widget.PopupWindow.OnDismissListener f;
	boolean g;
	int h;
	private final b i;
	private final LinearLayoutCompat j;
	private final Drawable k;
	private final ImageView l;
	private final ImageView m;
	private final int n;
	private final android.view.ViewTreeObserver.OnGlobalLayoutListener o;
	private ListPopupWindow p;
	private boolean q;
	private int r;
}
