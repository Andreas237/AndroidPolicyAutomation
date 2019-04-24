// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.support.v4.view.s;
import android.support.v7.c.a.b;
import android.support.v7.view.d;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//			av, f, ac, ar, 
//			ListPopupWindow, bd

public class AppCompatSpinner extends Spinner
	implements r
{
	private static class a
		implements ListAdapter, SpinnerAdapter
	{

		public boolean areAllItemsEnabled()
		{
			ListAdapter listadapter = b;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field ListAdapter b>
		//    2    4:astore_1        
			if(listadapter != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          16
				return listadapter.areAllItemsEnabled();
		//    5    9:aload_1         
		//    6   10:invokeinterface #50  <Method boolean ListAdapter.areAllItemsEnabled()>
		//    7   15:ireturn         
			else
				return true;
		//    8   16:iconst_1        
		//    9   17:ireturn         
		}

		public int getCount()
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field SpinnerAdapter a>
		//*   2    4:ifnonnull       9
				return 0;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			else
				return a.getCount();
		//    5    9:aload_0         
		//    6   10:getfield        #21  <Field SpinnerAdapter a>
		//    7   13:invokeinterface #54  <Method int SpinnerAdapter.getCount()>
		//    8   18:ireturn         
		}

		public View getDropDownView(int j, View view, ViewGroup viewgroup)
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field SpinnerAdapter a>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return a.getDropDownView(j, view, viewgroup);
		//    5    9:aload_0         
		//    6   10:getfield        #21  <Field SpinnerAdapter a>
		//    7   13:iload_1         
		//    8   14:aload_2         
		//    9   15:aload_3         
		//   10   16:invokeinterface #58  <Method View SpinnerAdapter.getDropDownView(int, View, ViewGroup)>
		//   11   21:areturn         
		}

		public Object getItem(int j)
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field SpinnerAdapter a>
		//*   2    4:ifnonnull       9
				return ((Object) (null));
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return a.getItem(j);
		//    5    9:aload_0         
		//    6   10:getfield        #21  <Field SpinnerAdapter a>
		//    7   13:iload_1         
		//    8   14:invokeinterface #62  <Method Object SpinnerAdapter.getItem(int)>
		//    9   19:areturn         
		}

		public long getItemId(int j)
		{
			if(a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field SpinnerAdapter a>
		//*   2    4:ifnonnull       11
				return -1L;
		//    3    7:ldc2w           #65  <Long -1L>
		//    4   10:lreturn         
			else
				return a.getItemId(j);
		//    5   11:aload_0         
		//    6   12:getfield        #21  <Field SpinnerAdapter a>
		//    7   15:iload_1         
		//    8   16:invokeinterface #68  <Method long SpinnerAdapter.getItemId(int)>
		//    9   21:lreturn         
		}

		public int getItemViewType(int j)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public View getView(int j, View view, ViewGroup viewgroup)
		{
			return getDropDownView(j, view, viewgroup);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #72  <Method View getDropDownView(int, View, ViewGroup)>
		//    5    7:areturn         
		}

		public int getViewTypeCount()
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean hasStableIds()
		{
			return a != null && a.hasStableIds();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field SpinnerAdapter a>
		//    2    4:ifnull          21
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field SpinnerAdapter a>
		//    5   11:invokeinterface #76  <Method boolean SpinnerAdapter.hasStableIds()>
		//    6   16:ifeq            21
		//    7   19:iconst_1        
		//    8   20:ireturn         
		//    9   21:iconst_0        
		//   10   22:ireturn         
		}

		public boolean isEmpty()
		{
			return getCount() == 0;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #78  <Method int getCount()>
		//    2    4:ifne            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public boolean isEnabled(int j)
		{
			ListAdapter listadapter = b;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field ListAdapter b>
		//    2    4:astore_2        
			if(listadapter != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          17
				return listadapter.isEnabled(j);
		//    5    9:aload_2         
		//    6   10:iload_1         
		//    7   11:invokeinterface #82  <Method boolean ListAdapter.isEnabled(int)>
		//    8   16:ireturn         
			else
				return true;
		//    9   17:iconst_1        
		//   10   18:ireturn         
		}

		public void registerDataSetObserver(DataSetObserver datasetobserver)
		{
			if(a != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field SpinnerAdapter a>
		//*   2    4:ifnull          17
				a.registerDataSetObserver(datasetobserver);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field SpinnerAdapter a>
		//    5   11:aload_1         
		//    6   12:invokeinterface #86  <Method void SpinnerAdapter.registerDataSetObserver(DataSetObserver)>
		//    7   17:return          
		}

		public void unregisterDataSetObserver(DataSetObserver datasetobserver)
		{
			if(a != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field SpinnerAdapter a>
		//*   2    4:ifnull          17
				a.unregisterDataSetObserver(datasetobserver);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field SpinnerAdapter a>
		//    5   11:aload_1         
		//    6   12:invokeinterface #89  <Method void SpinnerAdapter.unregisterDataSetObserver(DataSetObserver)>
		//    7   17:return          
		}

		private SpinnerAdapter a;
		private ListAdapter b;

		public a(SpinnerAdapter spinneradapter, android.content.res.Resources.Theme theme)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			a = spinneradapter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field SpinnerAdapter a>
			if(spinneradapter instanceof ListAdapter)
		//*   5    9:aload_1         
		//*   6   10:instanceof      #6   <Class ListAdapter>
		//*   7   13:ifeq            24
				b = (ListAdapter)spinneradapter;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:checkcast       #6   <Class ListAdapter>
		//   11   21:putfield        #23  <Field ListAdapter b>
			if(theme != null)
		//*  12   24:aload_2         
		//*  13   25:ifnull          94
				if(android.os.Build.VERSION.SDK_INT >= 23 && (spinneradapter instanceof ThemedSpinnerAdapter))
		//*  14   28:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
		//*  15   31:bipush          23
		//*  16   33:icmplt          66
		//*  17   36:aload_1         
		//*  18   37:instanceof      #31  <Class ThemedSpinnerAdapter>
		//*  19   40:ifeq            66
				{
					spinneradapter = ((SpinnerAdapter) ((ThemedSpinnerAdapter)spinneradapter));
		//   20   43:aload_1         
		//   21   44:checkcast       #31  <Class ThemedSpinnerAdapter>
		//   22   47:astore_1        
					if(((ThemedSpinnerAdapter) (spinneradapter)).getDropDownViewTheme() != theme)
		//*  23   48:aload_1         
		//*  24   49:invokeinterface #35  <Method android.content.res.Resources$Theme ThemedSpinnerAdapter.getDropDownViewTheme()>
		//*  25   54:aload_2         
		//*  26   55:if_acmpeq       94
					{
						((ThemedSpinnerAdapter) (spinneradapter)).setDropDownViewTheme(theme);
		//   27   58:aload_1         
		//   28   59:aload_2         
		//   29   60:invokeinterface #39  <Method void ThemedSpinnerAdapter.setDropDownViewTheme(android.content.res.Resources$Theme)>
						return;
		//   30   65:return          
					}
				} else
				if(spinneradapter instanceof ar)
		//*  31   66:aload_1         
		//*  32   67:instanceof      #41  <Class ar>
		//*  33   70:ifeq            94
				{
					spinneradapter = ((SpinnerAdapter) ((ar)spinneradapter));
		//   34   73:aload_1         
		//   35   74:checkcast       #41  <Class ar>
		//   36   77:astore_1        
					if(((ar) (spinneradapter)).a() == null)
		//*  37   78:aload_1         
		//*  38   79:invokeinterface #43  <Method android.content.res.Resources$Theme ar.a()>
		//*  39   84:ifnonnull       94
						((ar) (spinneradapter)).a(theme);
		//   40   87:aload_1         
		//   41   88:aload_2         
		//   42   89:invokeinterface #45  <Method void ar.a(android.content.res.Resources$Theme)>
				}
		//   43   94:return          
		}
	}

	private class b extends ListPopupWindow
	{

		static void a(b b1)
		{
			((ListPopupWindow) (b1)).super.d();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void android.support.v7.widget.ListPopupWindow.d()>
		//    2    4:return          
		}

		public CharSequence a()
		{
			return h;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field CharSequence h>
		//    2    4:areturn         
		}

		public void a(ListAdapter listadapter)
		{
			super.a(listadapter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #60  <Method void ListPopupWindow.a(ListAdapter)>
			a = listadapter;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #62  <Field ListAdapter a>
		//    6   10:return          
		}

		public void a(CharSequence charsequence)
		{
			h = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #57  <Field CharSequence h>
		//    3    5:return          
		}

		boolean a(View view)
		{
			return s.A(view) && view.getGlobalVisibleRect(i);
		//    0    0:aload_1         
		//    1    1:invokestatic    #69  <Method boolean s.A(View)>
		//    2    4:ifeq            20
		//    3    7:aload_1         
		//    4    8:aload_0         
		//    5    9:getfield        #34  <Field Rect i>
		//    6   12:invokevirtual   #75  <Method boolean View.getGlobalVisibleRect(Rect)>
		//    7   15:ifeq            20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

		void b()
		{
			Drawable drawable = h();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #78  <Method Drawable h()>
		//    2    4:astore          8
			int l = 0;
		//    3    6:iconst_0        
		//    4    7:istore_2        
			if(drawable != null)
		//*   5    8:aload           8
		//*   6   10:ifnull          67
			{
				drawable.getPadding(android.support.v7.widget.AppCompatSpinner.b(b));
		//    7   13:aload           8
		//    8   15:aload_0         
		//    9   16:getfield        #24  <Field AppCompatSpinner b>
		//   10   19:invokestatic    #81  <Method Rect android.support.v7.widget.AppCompatSpinner.b(AppCompatSpinner)>
		//   11   22:invokevirtual   #86  <Method boolean Drawable.getPadding(Rect)>
		//   12   25:pop             
				int j;
				if(bd.a(((View) (b))))
		//*  13   26:aload_0         
		//*  14   27:getfield        #24  <Field AppCompatSpinner b>
		//*  15   30:invokestatic    #90  <Method boolean bd.a(View)>
		//*  16   33:ifeq            52
					j = android.support.v7.widget.AppCompatSpinner.b(b).right;
		//   17   36:aload_0         
		//   18   37:getfield        #24  <Field AppCompatSpinner b>
		//   19   40:invokestatic    #81  <Method Rect android.support.v7.widget.AppCompatSpinner.b(AppCompatSpinner)>
		//   20   43:getfield        #94  <Field int Rect.right>
		//   21   46:istore_1        
				else
		//*  22   47:iload_1         
		//*  23   48:istore_2        
		//*  24   49:goto            93
					j = -android.support.v7.widget.AppCompatSpinner.b(b).left;
		//   25   52:aload_0         
		//   26   53:getfield        #24  <Field AppCompatSpinner b>
		//   27   56:invokestatic    #81  <Method Rect android.support.v7.widget.AppCompatSpinner.b(AppCompatSpinner)>
		//   28   59:getfield        #97  <Field int Rect.left>
		//   29   62:ineg            
		//   30   63:istore_1        
				l = j;
			} else
		//*  31   64:goto            47
			{
				Rect rect = android.support.v7.widget.AppCompatSpinner.b(b);
		//   32   67:aload_0         
		//   33   68:getfield        #24  <Field AppCompatSpinner b>
		//   34   71:invokestatic    #81  <Method Rect android.support.v7.widget.AppCompatSpinner.b(AppCompatSpinner)>
		//   35   74:astore          8
				android.support.v7.widget.AppCompatSpinner.b(b).right = 0;
		//   36   76:aload_0         
		//   37   77:getfield        #24  <Field AppCompatSpinner b>
		//   38   80:invokestatic    #81  <Method Rect android.support.v7.widget.AppCompatSpinner.b(AppCompatSpinner)>
		//   39   83:iconst_0        
		//   40   84:putfield        #94  <Field int Rect.right>
				rect.left = 0;
		//   41   87:aload           8
		//   42   89:iconst_0        
		//   43   90:putfield        #97  <Field int Rect.left>
			}
			int k1 = b.getPaddingLeft();
		//   44   93:aload_0         
		//   45   94:getfield        #24  <Field AppCompatSpinner b>
		//   46   97:invokevirtual   #101 <Method int AppCompatSpinner.getPaddingLeft()>
		//   47  100:istore          5
			int l1 = b.getPaddingRight();
		//   48  102:aload_0         
		//   49  103:getfield        #24  <Field AppCompatSpinner b>
		//   50  106:invokevirtual   #104 <Method int AppCompatSpinner.getPaddingRight()>
		//   51  109:istore          6
			int i2 = b.getWidth();
		//   52  111:aload_0         
		//   53  112:getfield        #24  <Field AppCompatSpinner b>
		//   54  115:invokevirtual   #107 <Method int AppCompatSpinner.getWidth()>
		//   55  118:istore          7
			int k;
			if(AppCompatSpinner.c(b) == -2)
		//*  56  120:aload_0         
		//*  57  121:getfield        #24  <Field AppCompatSpinner b>
		//*  58  124:invokestatic    #111 <Method int AppCompatSpinner.c(AppCompatSpinner)>
		//*  59  127:bipush          -2
		//*  60  129:icmpne          223
			{
				int i1 = b.a((SpinnerAdapter)a, h());
		//   61  132:aload_0         
		//   62  133:getfield        #24  <Field AppCompatSpinner b>
		//   63  136:aload_0         
		//   64  137:getfield        #62  <Field ListAdapter a>
		//   65  140:checkcast       #113 <Class SpinnerAdapter>
		//   66  143:aload_0         
		//   67  144:invokevirtual   #78  <Method Drawable h()>
		//   68  147:invokevirtual   #116 <Method int AppCompatSpinner.a(SpinnerAdapter, Drawable)>
		//   69  150:istore_3        
				int j1 = b.getContext().getResources().getDisplayMetrics().widthPixels - android.support.v7.widget.AppCompatSpinner.b(b).left - android.support.v7.widget.AppCompatSpinner.b(b).right;
		//   70  151:aload_0         
		//   71  152:getfield        #24  <Field AppCompatSpinner b>
		//   72  155:invokevirtual   #120 <Method Context AppCompatSpinner.getContext()>
		//   73  158:invokevirtual   #126 <Method Resources Context.getResources()>
		//   74  161:invokevirtual   #132 <Method DisplayMetrics Resources.getDisplayMetrics()>
		//   75  164:getfield        #137 <Field int DisplayMetrics.widthPixels>
		//   76  167:aload_0         
		//   77  168:getfield        #24  <Field AppCompatSpinner b>
		//   78  171:invokestatic    #81  <Method Rect android.support.v7.widget.AppCompatSpinner.b(AppCompatSpinner)>
		//   79  174:getfield        #97  <Field int Rect.left>
		//   80  177:isub            
		//   81  178:aload_0         
		//   82  179:getfield        #24  <Field AppCompatSpinner b>
		//   83  182:invokestatic    #81  <Method Rect android.support.v7.widget.AppCompatSpinner.b(AppCompatSpinner)>
		//   84  185:getfield        #94  <Field int Rect.right>
		//   85  188:isub            
		//   86  189:istore          4
				k = i1;
		//   87  191:iload_3         
		//   88  192:istore_1        
				if(i1 > j1)
		//*  89  193:iload_3         
		//*  90  194:iload           4
		//*  91  196:icmple          202
					k = j1;
		//   92  199:iload           4
		//   93  201:istore_1        
				k = Math.max(k, i2 - k1 - l1);
		//   94  202:iload_1         
		//   95  203:iload           7
		//   96  205:iload           5
		//   97  207:isub            
		//   98  208:iload           6
		//   99  210:isub            
		//  100  211:invokestatic    #143 <Method int Math.max(int, int)>
		//  101  214:istore_1        
			} else
		//* 102  215:aload_0         
		//* 103  216:iload_1         
		//* 104  217:invokevirtual   #146 <Method void g(int)>
		//* 105  220:goto            257
			if(AppCompatSpinner.c(b) == -1)
		//* 106  223:aload_0         
		//* 107  224:getfield        #24  <Field AppCompatSpinner b>
		//* 108  227:invokestatic    #111 <Method int AppCompatSpinner.c(AppCompatSpinner)>
		//* 109  230:iconst_m1       
		//* 110  231:icmpne          246
				k = i2 - k1 - l1;
		//  111  234:iload           7
		//  112  236:iload           5
		//  113  238:isub            
		//  114  239:iload           6
		//  115  241:isub            
		//  116  242:istore_1        
			else
		//* 117  243:goto            215
				k = AppCompatSpinner.c(b);
		//  118  246:aload_0         
		//  119  247:getfield        #24  <Field AppCompatSpinner b>
		//  120  250:invokestatic    #111 <Method int AppCompatSpinner.c(AppCompatSpinner)>
		//  121  253:istore_1        
			g(k);
		//* 122  254:goto            215
			if(bd.a(((View) (b))))
		//* 123  257:aload_0         
		//* 124  258:getfield        #24  <Field AppCompatSpinner b>
		//* 125  261:invokestatic    #90  <Method boolean bd.a(View)>
		//* 126  264:ifeq            283
				k = l + (i2 - l1 - l());
		//  127  267:iload_2         
		//  128  268:iload           7
		//  129  270:iload           6
		//  130  272:isub            
		//  131  273:aload_0         
		//  132  274:invokevirtual   #149 <Method int l()>
		//  133  277:isub            
		//  134  278:iadd            
		//  135  279:istore_1        
			else
		//* 136  280:goto            288
				k = l + k1;
		//  137  283:iload_2         
		//  138  284:iload           5
		//  139  286:iadd            
		//  140  287:istore_1        
			c(k);
		//  141  288:aload_0         
		//  142  289:iload_1         
		//  143  290:invokevirtual   #151 <Method void c(int)>
		//  144  293:return          
		}

		public void d()
		{
			boolean flag = f();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #155 <Method boolean f()>
		//    2    4:istore_1        
			b();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #157 <Method void b()>
			h(2);
		//    5    9:aload_0         
		//    6   10:iconst_2        
		//    7   11:invokevirtual   #159 <Method void h(int)>
			super.d();
		//    8   14:aload_0         
		//    9   15:invokespecial   #54  <Method void android.support.v7.widget.ListPopupWindow.d()>
			g().setChoiceMode(1);
		//   10   18:aload_0         
		//   11   19:invokevirtual   #162 <Method ListView g()>
		//   12   22:iconst_1        
		//   13   23:invokevirtual   #167 <Method void ListView.setChoiceMode(int)>
			i(b.getSelectedItemPosition());
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #24  <Field AppCompatSpinner b>
		//   17   31:invokevirtual   #170 <Method int AppCompatSpinner.getSelectedItemPosition()>
		//   18   34:invokevirtual   #172 <Method void i(int)>
			if(flag)
		//*  19   37:iload_1         
		//*  20   38:ifeq            42
				return;
		//   21   41:return          
			ViewTreeObserver viewtreeobserver = b.getViewTreeObserver();
		//   22   42:aload_0         
		//   23   43:getfield        #24  <Field AppCompatSpinner b>
		//   24   46:invokevirtual   #176 <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
		//   25   49:astore_2        
			if(viewtreeobserver != null)
		//*  26   50:aload_2         
		//*  27   51:ifnull          81
			{
				android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener = new android.view.ViewTreeObserver.OnGlobalLayoutListener(this) {

					public void onGlobalLayout()
					{
						if(!a.a(((View) (a.b))))
					//*   0    0:aload_0         
					//*   1    1:getfield        #20  <Field AppCompatSpinner$b a>
					//*   2    4:aload_0         
					//*   3    5:getfield        #20  <Field AppCompatSpinner$b a>
					//*   4    8:getfield        #27  <Field AppCompatSpinner android.support.v7.widget.AppCompatSpinner$b.b>
					//*   5   11:invokevirtual   #30  <Method boolean AppCompatSpinner$b.a(View)>
					//*   6   14:ifne            25
						{
							a.e();
					//    7   17:aload_0         
					//    8   18:getfield        #20  <Field AppCompatSpinner$b a>
					//    9   21:invokevirtual   #33  <Method void AppCompatSpinner$b.e()>
							return;
					//   10   24:return          
						} else
						{
							a.b();
					//   11   25:aload_0         
					//   12   26:getfield        #20  <Field AppCompatSpinner$b a>
					//   13   29:invokevirtual   #35  <Method void android.support.v7.widget.AppCompatSpinner$b.b()>
							b.a(a);
					//   14   32:aload_0         
					//   15   33:getfield        #20  <Field AppCompatSpinner$b a>
					//   16   36:invokestatic    #37  <Method void AppCompatSpinner$b.a(AppCompatSpinner$b)>
							return;
					//   17   39:return          
						}
					}

					final b a;

			
			{
				a = b1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AppCompatSpinner$b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
				}
;
		//   28   54:new             #11  <Class AppCompatSpinner$b$2>
		//   29   57:dup             
		//   30   58:aload_0         
		//   31   59:invokespecial   #178 <Method void AppCompatSpinner$b$2(AppCompatSpinner$b)>
		//   32   62:astore_3        
				viewtreeobserver.addOnGlobalLayoutListener(ongloballayoutlistener);
		//   33   63:aload_2         
		//   34   64:aload_3         
		//   35   65:invokevirtual   #184 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				a(new android.widget.PopupWindow.OnDismissListener(this, ongloballayoutlistener) {

					public void onDismiss()
					{
						ViewTreeObserver viewtreeobserver = b.b.getViewTreeObserver();
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field AppCompatSpinner$b b>
					//    2    4:getfield        #30  <Field AppCompatSpinner android.support.v7.widget.AppCompatSpinner$b.b>
					//    3    7:invokevirtual   #34  <Method ViewTreeObserver AppCompatSpinner.getViewTreeObserver()>
					//    4   10:astore_1        
						if(viewtreeobserver != null)
					//*   5   11:aload_1         
					//*   6   12:ifnull          23
							viewtreeobserver.removeGlobalOnLayoutListener(a);
					//    7   15:aload_1         
					//    8   16:aload_0         
					//    9   17:getfield        #23  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener a>
					//   10   20:invokevirtual   #40  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					//   11   23:return          
					}

					final android.view.ViewTreeObserver.OnGlobalLayoutListener a;
					final b b;

			
			{
				b = b1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AppCompatSpinner$b b>
				a = ongloballayoutlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
				}
);
		//   36   68:aload_0         
		//   37   69:new             #13  <Class AppCompatSpinner$b$3>
		//   38   72:dup             
		//   39   73:aload_0         
		//   40   74:aload_3         
		//   41   75:invokespecial   #187 <Method void AppCompatSpinner$b$3(AppCompatSpinner$b, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		//   42   78:invokevirtual   #190 <Method void a(android.widget.PopupWindow$OnDismissListener)>
			}
		//   43   81:return          
		}

		ListAdapter a;
		final AppCompatSpinner b;
		private CharSequence h;
		private final Rect i = new Rect();

		public b(Context context, AttributeSet attributeset, int j)
		{
			b = AppCompatSpinner.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field AppCompatSpinner b>
			super(context, attributeset, j);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:iload           4
		//    7   10:invokespecial   #27  <Method void ListPopupWindow(Context, AttributeSet, int)>
		//    8   13:aload_0         
		//    9   14:new             #29  <Class Rect>
		//   10   17:dup             
		//   11   18:invokespecial   #32  <Method void Rect()>
		//   12   21:putfield        #34  <Field Rect i>
			b(((View) (AppCompatSpinner.this)));
		//   13   24:aload_0         
		//   14   25:aload_1         
		//   15   26:invokevirtual   #37  <Method void b(View)>
			a(true);
		//   16   29:aload_0         
		//   17   30:iconst_1        
		//   18   31:invokevirtual   #40  <Method void a(boolean)>
			a(0);
		//   19   34:aload_0         
		//   20   35:iconst_0        
		//   21   36:invokevirtual   #43  <Method void a(int)>
			a(new _cls1(this, AppCompatSpinner.this));
		//   22   39:aload_0         
		//   23   40:new             #9   <Class AppCompatSpinner$b$1>
		//   24   43:dup             
		//   25   44:aload_0         
		//   26   45:aload_1         
		//   27   46:invokespecial   #46  <Method void AppCompatSpinner$b$1(AppCompatSpinner$b, AppCompatSpinner)>
		//   28   49:invokevirtual   #49  <Method void a(android.widget.AdapterView$OnItemClickListener)>
		//   29   52:return          
		}
	}


	public AppCompatSpinner(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #47  <Method void AppCompatSpinner(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatSpinner(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.spinnerStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #52  <Field int android.support.v7.a.a$a.spinnerStyle>
	//    4    6:invokespecial   #55  <Method void AppCompatSpinner(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatSpinner(Context context, AttributeSet attributeset, int j)
	{
		this(context, attributeset, j, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_m1       
	//    5    5:invokespecial   #58  <Method void AppCompatSpinner(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public AppCompatSpinner(Context context, AttributeSet attributeset, int j, int k)
	{
		this(context, attributeset, j, k, ((android.content.res.Resources.Theme) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:aconst_null     
	//    6    7:invokespecial   #61  <Method void AppCompatSpinner(Context, AttributeSet, int, int, android.content.res.Resources$Theme)>
	//    7   10:return          
	}

	public AppCompatSpinner(Context context, AttributeSet attributeset, int j, int k, android.content.res.Resources.Theme theme)
	{
		av av2;
		super(context, attributeset, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #64  <Method void Spinner(Context, AttributeSet, int)>
		i = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #66  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #68  <Method void Rect()>
	//    9   15:putfield        #70  <Field Rect i>
		av2 = av.a(context, attributeset, android.support.v7.a.a.j.Spinner, j, 0);
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:getstatic       #75  <Field int[] android.support.v7.a.a$j.Spinner>
	//   13   23:iload_3         
	//   14   24:iconst_0        
	//   15   25:invokestatic    #80  <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   16   28:astore          10
		b = new f(((View) (this)));
	//   17   30:aload_0         
	//   18   31:new             #82  <Class f>
	//   19   34:dup             
	//   20   35:aload_0         
	//   21   36:invokespecial   #85  <Method void f(View)>
	//   22   39:putfield        #87  <Field f b>
		if(theme == null) goto _L2; else goto _L1
	//   23   42:aload           5
	//   24   44:ifnull          68
_L1:
		theme = ((android.content.res.Resources.Theme) (new d(context, theme)));
	//   25   47:new             #89  <Class d>
	//   26   50:dup             
	//   27   51:aload_1         
	//   28   52:aload           5
	//   29   54:invokespecial   #92  <Method void d(Context, android.content.res.Resources$Theme)>
	//   30   57:astore          5
_L4:
		c = ((Context) (theme));
	//   31   59:aload_0         
	//   32   60:aload           5
	//   33   62:putfield        #94  <Field Context c>
		break MISSING_BLOCK_LABEL_122;
	//   34   65:goto            122
_L2:
		int l = av2.g(android.support.v7.a.a.j.Spinner_popupTheme, 0);
	//   35   68:aload           10
	//   36   70:getstatic       #97  <Field int android.support.v7.a.a$j.Spinner_popupTheme>
	//   37   73:iconst_0        
	//   38   74:invokevirtual   #100 <Method int av.g(int, int)>
	//   39   77:istore          6
		if(l == 0)
			break; /* Loop/switch isn't completed */
	//   40   79:iload           6
	//   41   81:ifeq            99
		theme = ((android.content.res.Resources.Theme) (new d(context, l)));
	//   42   84:new             #89  <Class d>
	//   43   87:dup             
	//   44   88:aload_1         
	//   45   89:iload           6
	//   46   91:invokespecial   #103 <Method void d(Context, int)>
	//   47   94:astore          5
		if(true) goto _L4; else goto _L3
	//   48   96:goto            59
_L3:
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*  49   99:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//*  50  102:bipush          23
	//*  51  104:icmpge          113
			theme = ((android.content.res.Resources.Theme) (context));
	//   52  107:aload_1         
	//   53  108:astore          5
		else
	//*  54  110:goto            116
			theme = null;
	//   55  113:aconst_null     
	//   56  114:astore          5
		c = ((Context) (theme));
	//   57  116:aload_0         
	//   58  117:aload           5
	//   59  119:putfield        #94  <Field Context c>
		int j1;
		if(c == null)
			break MISSING_BLOCK_LABEL_376;
	//   60  122:aload_0         
	//   61  123:getfield        #94  <Field Context c>
	//   62  126:ifnull          376
		j1 = k;
	//   63  129:iload           4
	//   64  131:istore          7
		if(k != -1) goto _L6; else goto _L5
	//   65  133:iload           4
	//   66  135:iconst_m1       
	//   67  136:icmpne          273
_L5:
		if(android.os.Build.VERSION.SDK_INT < 11) goto _L8; else goto _L7
	//   68  139:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//   69  142:bipush          11
	//   70  144:icmplt          270
_L7:
		theme = ((android.content.res.Resources.Theme) (context.obtainStyledAttributes(attributeset, a, j, 0)));
	//   71  147:aload_1         
	//   72  148:aload_2         
	//   73  149:getstatic       #41  <Field int[] a>
	//   74  152:iload_3         
	//   75  153:iconst_0        
	//   76  154:invokevirtual   #114 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   77  157:astore          5
		int i1;
		android.content.res.Resources.Theme theme1;
		i1 = k;
	//   78  159:iload           4
	//   79  161:istore          6
		theme1 = theme;
	//   80  163:aload           5
	//   81  165:astore          8
		if(!((TypedArray) (theme)).hasValue(0))
			break MISSING_BLOCK_LABEL_189;
	//   82  167:aload           5
	//   83  169:iconst_0        
	//   84  170:invokevirtual   #120 <Method boolean TypedArray.hasValue(int)>
	//   85  173:ifeq            189
		theme1 = theme;
	//   86  176:aload           5
	//   87  178:astore          8
		i1 = ((TypedArray) (theme)).getInt(0, 0);
	//   88  180:aload           5
	//   89  182:iconst_0        
	//   90  183:iconst_0        
	//   91  184:invokevirtual   #123 <Method int TypedArray.getInt(int, int)>
	//   92  187:istore          6
		j1 = i1;
	//   93  189:iload           6
	//   94  191:istore          7
		if(theme == null) goto _L6; else goto _L9
	//   95  193:aload           5
	//   96  195:ifnull          273
_L9:
		k = i1;
	//   97  198:iload           6
	//   98  200:istore          4
_L12:
		((TypedArray) (theme)).recycle();
	//   99  202:aload           5
	//  100  204:invokevirtual   #126 <Method void TypedArray.recycle()>
		j1 = k;
	//  101  207:iload           4
	//  102  209:istore          7
		break; /* Loop/switch isn't completed */
	//  103  211:goto            273
		Exception exception;
		exception;
	//  104  214:astore          9
		  goto _L10
	//* 105  216:goto            231
		context;
	//  106  219:astore_1        
		theme1 = null;
	//  107  220:aconst_null     
	//  108  221:astore          8
		  goto _L11
	//* 109  223:goto            258
		exception;
	//  110  226:astore          9
		theme = null;
	//  111  228:aconst_null     
	//  112  229:astore          5
_L10:
		theme1 = theme;
	//  113  231:aload           5
	//  114  233:astore          8
		Log.i("AppCompatSpinner", "Could not read android:spinnerMode", ((Throwable) (exception)));
	//  115  235:ldc1            #128 <String "AppCompatSpinner">
	//  116  237:ldc1            #130 <String "Could not read android:spinnerMode">
	//  117  239:aload           9
	//  118  241:invokestatic    #135 <Method int Log.i(String, String, Throwable)>
	//  119  244:pop             
		j1 = k;
	//  120  245:iload           4
	//  121  247:istore          7
		if(theme == null) goto _L6; else goto _L12
	//  122  249:aload           5
	//  123  251:ifnull          273
	//* 124  254:goto            202
		context;
	//  125  257:astore_1        
_L11:
		if(theme1 != null)
	//* 126  258:aload           8
	//* 127  260:ifnull          268
			((TypedArray) (theme1)).recycle();
	//  128  263:aload           8
	//  129  265:invokevirtual   #126 <Method void TypedArray.recycle()>
		throw context;
	//  130  268:aload_1         
	//  131  269:athrow          
_L8:
		j1 = 1;
	//  132  270:iconst_1        
	//  133  271:istore          7
_L6:
		if(j1 == 1)
	//* 134  273:iload           7
	//* 135  275:iconst_1        
	//* 136  276:icmpne          376
		{
			theme = ((android.content.res.Resources.Theme) (new b(c, attributeset, j)));
	//  137  279:new             #13  <Class AppCompatSpinner$b>
	//  138  282:dup             
	//  139  283:aload_0         
	//  140  284:aload_0         
	//  141  285:getfield        #94  <Field Context c>
	//  142  288:aload_2         
	//  143  289:iload_3         
	//  144  290:invokespecial   #138 <Method void AppCompatSpinner$b(AppCompatSpinner, Context, AttributeSet, int)>
	//  145  293:astore          5
			av av1 = av.a(c, attributeset, android.support.v7.a.a.j.Spinner, j, 0);
	//  146  295:aload_0         
	//  147  296:getfield        #94  <Field Context c>
	//  148  299:aload_2         
	//  149  300:getstatic       #75  <Field int[] android.support.v7.a.a$j.Spinner>
	//  150  303:iload_3         
	//  151  304:iconst_0        
	//  152  305:invokestatic    #80  <Method av av.a(Context, AttributeSet, int[], int, int)>
	//  153  308:astore          8
			h = av1.f(android.support.v7.a.a.j.Spinner_android_dropDownWidth, -2);
	//  154  310:aload_0         
	//  155  311:aload           8
	//  156  313:getstatic       #141 <Field int android.support.v7.a.a$j.Spinner_android_dropDownWidth>
	//  157  316:bipush          -2
	//  158  318:invokevirtual   #143 <Method int av.f(int, int)>
	//  159  321:putfield        #145 <Field int h>
			((b) (theme)).a(av1.a(android.support.v7.a.a.j.Spinner_android_popupBackground));
	//  160  324:aload           5
	//  161  326:aload           8
	//  162  328:getstatic       #148 <Field int android.support.v7.a.a$j.Spinner_android_popupBackground>
	//  163  331:invokevirtual   #151 <Method Drawable av.a(int)>
	//  164  334:invokevirtual   #154 <Method void AppCompatSpinner$b.a(Drawable)>
			((b) (theme)).a(((CharSequence) (av2.d(android.support.v7.a.a.j.Spinner_android_prompt))));
	//  165  337:aload           5
	//  166  339:aload           10
	//  167  341:getstatic       #157 <Field int android.support.v7.a.a$j.Spinner_android_prompt>
	//  168  344:invokevirtual   #160 <Method String android.support.v7.widget.av.d(int)>
	//  169  347:invokevirtual   #163 <Method void AppCompatSpinner$b.a(CharSequence)>
			av1.a();
	//  170  350:aload           8
	//  171  352:invokevirtual   #165 <Method void av.a()>
			g = ((b) (theme));
	//  172  355:aload_0         
	//  173  356:aload           5
	//  174  358:putfield        #167 <Field AppCompatSpinner$b g>
			d = ((ac) (new ac(((View) (this)), ((b) (theme))) {

				public android.support.v7.view.menu.s a()
				{
					return ((android.support.v7.view.menu.s) (a));
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field AppCompatSpinner$b a>
				//    2    4:areturn         
				}

				public boolean b()
				{
					if(!AppCompatSpinner.a(b).f())
				//*   0    0:aload_0         
				//*   1    1:getfield        #16  <Field AppCompatSpinner b>
				//*   2    4:invokestatic    #27  <Method AppCompatSpinner$b AppCompatSpinner.a(AppCompatSpinner)>
				//*   3    7:invokevirtual   #32  <Method boolean AppCompatSpinner$b.f()>
				//*   4   10:ifne            23
						AppCompatSpinner.a(b).d();
				//    5   13:aload_0         
				//    6   14:getfield        #16  <Field AppCompatSpinner b>
				//    7   17:invokestatic    #27  <Method AppCompatSpinner$b AppCompatSpinner.a(AppCompatSpinner)>
				//    8   20:invokevirtual   #36  <Method void android.support.v7.widget.AppCompatSpinner$b.d()>
					return true;
				//    9   23:iconst_1        
				//   10   24:ireturn         
				}

				final b a;
				final AppCompatSpinner b;

			
			{
				b = AppCompatSpinner.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AppCompatSpinner b>
				a = b1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #18  <Field AppCompatSpinner$b a>
				super(view);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #21  <Method void ac(View)>
			//    9   15:return          
			}
			}
));
	//  175  361:aload_0         
	//  176  362:new             #8   <Class AppCompatSpinner$1>
	//  177  365:dup             
	//  178  366:aload_0         
	//  179  367:aload_0         
	//  180  368:aload           5
	//  181  370:invokespecial   #170 <Method void AppCompatSpinner$1(AppCompatSpinner, View, AppCompatSpinner$b)>
	//  182  373:putfield        #172 <Field ac d>
		}
		theme = ((android.content.res.Resources.Theme) (av2.f(android.support.v7.a.a.j.Spinner_android_entries)));
	//  183  376:aload           10
	//  184  378:getstatic       #175 <Field int android.support.v7.a.a$j.Spinner_android_entries>
	//  185  381:invokevirtual   #178 <Method CharSequence[] av.f(int)>
	//  186  384:astore          5
		if(theme != null)
	//* 187  386:aload           5
	//* 188  388:ifnull          416
		{
			context = ((Context) (new ArrayAdapter(context, 0x1090008, ((Object []) (theme)))));
	//  189  391:new             #180 <Class ArrayAdapter>
	//  190  394:dup             
	//  191  395:aload_1         
	//  192  396:ldc1            #181 <Int 0x1090008>
	//  193  398:aload           5
	//  194  400:invokespecial   #184 <Method void ArrayAdapter(Context, int, Object[])>
	//  195  403:astore_1        
			((ArrayAdapter) (context)).setDropDownViewResource(android.support.v7.a.a.g.support_simple_spinner_dropdown_item);
	//  196  404:aload_1         
	//  197  405:getstatic       #189 <Field int android.support.v7.a.a$g.support_simple_spinner_dropdown_item>
	//  198  408:invokevirtual   #193 <Method void ArrayAdapter.setDropDownViewResource(int)>
			setAdapter(((SpinnerAdapter) (context)));
	//  199  411:aload_0         
	//  200  412:aload_1         
	//  201  413:invokevirtual   #197 <Method void setAdapter(SpinnerAdapter)>
		}
		av2.a();
	//  202  416:aload           10
	//  203  418:invokevirtual   #165 <Method void av.a()>
		f = true;
	//  204  421:aload_0         
	//  205  422:iconst_1        
	//  206  423:putfield        #199 <Field boolean f>
		if(e != null)
	//* 207  426:aload_0         
	//* 208  427:getfield        #201 <Field SpinnerAdapter e>
	//* 209  430:ifnull          446
		{
			setAdapter(e);
	//  210  433:aload_0         
	//  211  434:aload_0         
	//  212  435:getfield        #201 <Field SpinnerAdapter e>
	//  213  438:invokevirtual   #197 <Method void setAdapter(SpinnerAdapter)>
			e = null;
	//  214  441:aload_0         
	//  215  442:aconst_null     
	//  216  443:putfield        #201 <Field SpinnerAdapter e>
		}
		b.a(attributeset, j);
	//  217  446:aload_0         
	//  218  447:getfield        #87  <Field f b>
	//  219  450:aload_2         
	//  220  451:iload_3         
	//  221  452:invokevirtual   #204 <Method void f.a(AttributeSet, int)>
		return;
	//  222  455:return          
	}

	static b a(AppCompatSpinner appcompatspinner)
	{
		return appcompatspinner.g;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//    2    4:areturn         
	}

	static Rect b(AppCompatSpinner appcompatspinner)
	{
		return appcompatspinner.i;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Rect i>
	//    2    4:areturn         
	}

	static int c(AppCompatSpinner appcompatspinner)
	{
		return appcompatspinner.h;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field int h>
	//    2    4:ireturn         
	}

	int a(SpinnerAdapter spinneradapter, Drawable drawable)
	{
		int l = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(spinneradapter == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       9
			return 0;
	//    4    7:iconst_0        
	//    5    8:ireturn         
		int k1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
	//    6    9:aload_0         
	//    7   10:invokevirtual   #212 <Method int getMeasuredWidth()>
	//    8   13:iconst_0        
	//    9   14:invokestatic    #217 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   10   17:istore          8
		int l1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
	//   11   19:aload_0         
	//   12   20:invokevirtual   #220 <Method int getMeasuredHeight()>
	//   13   23:iconst_0        
	//   14   24:invokestatic    #217 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   15   27:istore          9
		int j = Math.max(0, getSelectedItemPosition());
	//   16   29:iconst_0        
	//   17   30:aload_0         
	//   18   31:invokevirtual   #223 <Method int getSelectedItemPosition()>
	//   19   34:invokestatic    #228 <Method int Math.max(int, int)>
	//   20   37:istore_3        
		int i2 = Math.min(spinneradapter.getCount(), j + 15);
	//   21   38:aload_1         
	//   22   39:invokeinterface #233 <Method int SpinnerAdapter.getCount()>
	//   23   44:iload_3         
	//   24   45:bipush          15
	//   25   47:iadd            
	//   26   48:invokestatic    #236 <Method int Math.min(int, int)>
	//   27   51:istore          10
		int k = Math.max(0, j - (15 - (i2 - j)));
	//   28   53:iconst_0        
	//   29   54:iload_3         
	//   30   55:bipush          15
	//   31   57:iload           10
	//   32   59:iload_3         
	//   33   60:isub            
	//   34   61:isub            
	//   35   62:isub            
	//   36   63:invokestatic    #228 <Method int Math.max(int, int)>
	//   37   66:istore          4
		View view = null;
	//   38   68:aconst_null     
	//   39   69:astore          11
		j = 0;
	//   40   71:iconst_0        
	//   41   72:istore_3        
		while(k < i2) 
	//*  42   73:iload           4
	//*  43   75:iload           10
	//*  44   77:icmpge          177
		{
			int j1 = spinneradapter.getItemViewType(k);
	//   45   80:aload_1         
	//   46   81:iload           4
	//   47   83:invokeinterface #240 <Method int SpinnerAdapter.getItemViewType(int)>
	//   48   88:istore          7
			int i1 = l;
	//   49   90:iload           5
	//   50   92:istore          6
			if(j1 != l)
	//*  51   94:iload           7
	//*  52   96:iload           5
	//*  53   98:icmpeq          108
			{
				view = null;
	//   54  101:aconst_null     
	//   55  102:astore          11
				i1 = j1;
	//   56  104:iload           7
	//   57  106:istore          6
			}
			view = spinneradapter.getView(k, view, ((ViewGroup) (this)));
	//   58  108:aload_1         
	//   59  109:iload           4
	//   60  111:aload           11
	//   61  113:aload_0         
	//   62  114:invokeinterface #244 <Method View SpinnerAdapter.getView(int, View, ViewGroup)>
	//   63  119:astore          11
			if(view.getLayoutParams() == null)
	//*  64  121:aload           11
	//*  65  123:invokevirtual   #250 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  66  126:ifnonnull       145
				view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
	//   67  129:aload           11
	//   68  131:new             #252 <Class android.view.ViewGroup$LayoutParams>
	//   69  134:dup             
	//   70  135:bipush          -2
	//   71  137:bipush          -2
	//   72  139:invokespecial   #255 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   73  142:invokevirtual   #259 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			view.measure(k1, l1);
	//   74  145:aload           11
	//   75  147:iload           8
	//   76  149:iload           9
	//   77  151:invokevirtual   #262 <Method void View.measure(int, int)>
			j = Math.max(j, view.getMeasuredWidth());
	//   78  154:iload_3         
	//   79  155:aload           11
	//   80  157:invokevirtual   #263 <Method int View.getMeasuredWidth()>
	//   81  160:invokestatic    #228 <Method int Math.max(int, int)>
	//   82  163:istore_3        
			k++;
	//   83  164:iload           4
	//   84  166:iconst_1        
	//   85  167:iadd            
	//   86  168:istore          4
			l = i1;
	//   87  170:iload           6
	//   88  172:istore          5
		}
	//*  89  174:goto            73
		k = j;
	//   90  177:iload_3         
	//   91  178:istore          4
		if(drawable != null)
	//*  92  180:aload_2         
	//*  93  181:ifnull          212
		{
			drawable.getPadding(i);
	//   94  184:aload_2         
	//   95  185:aload_0         
	//   96  186:getfield        #70  <Field Rect i>
	//   97  189:invokevirtual   #269 <Method boolean Drawable.getPadding(Rect)>
	//   98  192:pop             
			k = j + (i.left + i.right);
	//   99  193:iload_3         
	//  100  194:aload_0         
	//  101  195:getfield        #70  <Field Rect i>
	//  102  198:getfield        #272 <Field int Rect.left>
	//  103  201:aload_0         
	//  104  202:getfield        #70  <Field Rect i>
	//  105  205:getfield        #275 <Field int Rect.right>
	//  106  208:iadd            
	//  107  209:iadd            
	//  108  210:istore          4
		}
		return k;
	//  109  212:iload           4
	//  110  214:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #278 <Method void Spinner.drawableStateChanged()>
		if(b != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #87  <Field f b>
	//*   4    8:ifnull          18
			b.c();
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field f b>
	//    7   15:invokevirtual   #280 <Method void f.c()>
	//    8   18:return          
	}

	public int getDropDownHorizontalOffset()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          15
			return g.j();
	//    3    7:aload_0         
	//    4    8:getfield        #167 <Field AppCompatSpinner$b g>
	//    5   11:invokevirtual   #284 <Method int AppCompatSpinner$b.j()>
	//    6   14:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   15:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          16
	//*   9   20:icmplt          28
			return super.getDropDownHorizontalOffset();
	//   10   23:aload_0         
	//   11   24:invokespecial   #286 <Method int Spinner.getDropDownHorizontalOffset()>
	//   12   27:ireturn         
		else
			return 0;
	//   13   28:iconst_0        
	//   14   29:ireturn         
	}

	public int getDropDownVerticalOffset()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          15
			return g.k();
	//    3    7:aload_0         
	//    4    8:getfield        #167 <Field AppCompatSpinner$b g>
	//    5   11:invokevirtual   #290 <Method int AppCompatSpinner$b.k()>
	//    6   14:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   15:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          16
	//*   9   20:icmplt          28
			return super.getDropDownVerticalOffset();
	//   10   23:aload_0         
	//   11   24:invokespecial   #292 <Method int Spinner.getDropDownVerticalOffset()>
	//   12   27:ireturn         
		else
			return 0;
	//   13   28:iconst_0        
	//   14   29:ireturn         
	}

	public int getDropDownWidth()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          12
			return h;
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field int h>
	//    5   11:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   6   12:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          16
	//*   8   17:icmplt          25
			return super.getDropDownWidth();
	//    9   20:aload_0         
	//   10   21:invokespecial   #295 <Method int Spinner.getDropDownWidth()>
	//   11   24:ireturn         
		else
			return 0;
	//   12   25:iconst_0        
	//   13   26:ireturn         
	}

	public Drawable getPopupBackground()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          15
			return g.h();
	//    3    7:aload_0         
	//    4    8:getfield        #167 <Field AppCompatSpinner$b g>
	//    5   11:invokevirtual   #299 <Method Drawable AppCompatSpinner$b.h()>
	//    6   14:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   15:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          16
	//*   9   20:icmplt          28
			return super.getPopupBackground();
	//   10   23:aload_0         
	//   11   24:invokespecial   #301 <Method Drawable Spinner.getPopupBackground()>
	//   12   27:areturn         
		else
			return null;
	//   13   28:aconst_null     
	//   14   29:areturn         
	}

	public Context getPopupContext()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          12
			return c;
	//    3    7:aload_0         
	//    4    8:getfield        #94  <Field Context c>
	//    5   11:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   6   12:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          23
	//*   8   17:icmplt          25
			return super.getPopupContext();
	//    9   20:aload_0         
	//   10   21:invokespecial   #305 <Method Context Spinner.getPopupContext()>
	//   11   24:areturn         
		else
			return null;
	//   12   25:aconst_null     
	//   13   26:areturn         
	}

	public CharSequence getPrompt()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          15
			return g.a();
	//    3    7:aload_0         
	//    4    8:getfield        #167 <Field AppCompatSpinner$b g>
	//    5   11:invokevirtual   #309 <Method CharSequence AppCompatSpinner$b.a()>
	//    6   14:areturn         
		else
			return super.getPrompt();
	//    7   15:aload_0         
	//    8   16:invokespecial   #311 <Method CharSequence Spinner.getPrompt()>
	//    9   19:areturn         
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field f b>
	//*   2    4:ifnull          15
			return b.a();
	//    3    7:aload_0         
	//    4    8:getfield        #87  <Field f b>
	//    5   11:invokevirtual   #315 <Method ColorStateList f.a()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field f b>
	//*   2    4:ifnull          15
			return b.b();
	//    3    7:aload_0         
	//    4    8:getfield        #87  <Field f b>
	//    5   11:invokevirtual   #319 <Method android.graphics.PorterDuff$Mode android.support.v7.widget.f.b()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #322 <Method void Spinner.onDetachedFromWindow()>
		if(g != null && g.f())
	//*   2    4:aload_0         
	//*   3    5:getfield        #167 <Field AppCompatSpinner$b g>
	//*   4    8:ifnull          28
	//*   5   11:aload_0         
	//*   6   12:getfield        #167 <Field AppCompatSpinner$b g>
	//*   7   15:invokevirtual   #325 <Method boolean AppCompatSpinner$b.f()>
	//*   8   18:ifeq            28
			g.e();
	//    9   21:aload_0         
	//   10   22:getfield        #167 <Field AppCompatSpinner$b g>
	//   11   25:invokevirtual   #327 <Method void AppCompatSpinner$b.e()>
	//   12   28:return          
	}

	protected void onMeasure(int j, int k)
	{
		super.onMeasure(j, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #330 <Method void Spinner.onMeasure(int, int)>
		if(g != null && android.view.View.MeasureSpec.getMode(j) == 0x80000000)
	//*   4    6:aload_0         
	//*   5    7:getfield        #167 <Field AppCompatSpinner$b g>
	//*   6   10:ifnull          57
	//*   7   13:iload_1         
	//*   8   14:invokestatic    #333 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   9   17:ldc2            #334 <Int 0x80000000>
	//*  10   20:icmpne          57
			setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(j)), getMeasuredHeight());
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #212 <Method int getMeasuredWidth()>
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #338 <Method SpinnerAdapter getAdapter()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #341 <Method Drawable getBackground()>
	//   19   37:invokevirtual   #343 <Method int a(SpinnerAdapter, Drawable)>
	//   20   40:invokestatic    #228 <Method int Math.max(int, int)>
	//   21   43:iload_1         
	//   22   44:invokestatic    #346 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   23   47:invokestatic    #236 <Method int Math.min(int, int)>
	//   24   50:aload_0         
	//   25   51:invokevirtual   #220 <Method int getMeasuredHeight()>
	//   26   54:invokevirtual   #349 <Method void setMeasuredDimension(int, int)>
	//   27   57:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(d != null && d.onTouch(((View) (this)), motionevent))
	//*   0    0:aload_0         
	//*   1    1:getfield        #172 <Field ac d>
	//*   2    4:ifnull          21
	//*   3    7:aload_0         
	//*   4    8:getfield        #172 <Field ac d>
	//*   5   11:aload_0         
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #357 <Method boolean ac.onTouch(View, MotionEvent)>
	//*   8   16:ifeq            21
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #359 <Method boolean Spinner.onTouchEvent(MotionEvent)>
	//   14   26:ireturn         
	}

	public boolean performClick()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          26
		{
			if(!g.f())
	//*   3    7:aload_0         
	//*   4    8:getfield        #167 <Field AppCompatSpinner$b g>
	//*   5   11:invokevirtual   #325 <Method boolean AppCompatSpinner$b.f()>
	//*   6   14:ifne            24
				g.d();
	//    7   17:aload_0         
	//    8   18:getfield        #167 <Field AppCompatSpinner$b g>
	//    9   21:invokevirtual   #362 <Method void android.support.v7.widget.AppCompatSpinner$b.d()>
			return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
		} else
		{
			return super.performClick();
	//   12   26:aload_0         
	//   13   27:invokespecial   #364 <Method boolean Spinner.performClick()>
	//   14   30:ireturn         
		}
	}

	public volatile void setAdapter(Adapter adapter)
	{
		setAdapter((SpinnerAdapter)adapter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #230 <Class SpinnerAdapter>
	//    3    5:invokevirtual   #197 <Method void setAdapter(SpinnerAdapter)>
	//    4    8:return          
	}

	public void setAdapter(SpinnerAdapter spinneradapter)
	{
		if(!f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field boolean f>
	//*   2    4:ifne            13
		{
			e = spinneradapter;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #201 <Field SpinnerAdapter e>
			return;
	//    6   12:return          
		}
		super.setAdapter(spinneradapter);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #366 <Method void Spinner.setAdapter(SpinnerAdapter)>
		if(g != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #167 <Field AppCompatSpinner$b g>
	//*  12   22:ifnull          64
		{
			Context context;
			if(c == null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #94  <Field Context c>
	//*  15   29:ifnonnull       40
				context = getContext();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #369 <Method Context getContext()>
	//   18   36:astore_2        
			else
	//*  19   37:goto            45
				context = c;
	//   20   40:aload_0         
	//   21   41:getfield        #94  <Field Context c>
	//   22   44:astore_2        
			g.a(((ListAdapter) (new a(spinneradapter, context.getTheme()))));
	//   23   45:aload_0         
	//   24   46:getfield        #167 <Field AppCompatSpinner$b g>
	//   25   49:new             #10  <Class AppCompatSpinner$a>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:aload_2         
	//   29   55:invokevirtual   #373 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   30   58:invokespecial   #376 <Method void AppCompatSpinner$a(SpinnerAdapter, android.content.res.Resources$Theme)>
	//   31   61:invokevirtual   #379 <Method void AppCompatSpinner$b.a(ListAdapter)>
		}
	//   32   64:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #382 <Method void Spinner.setBackgroundDrawable(Drawable)>
		if(b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #87  <Field f b>
	//*   5    9:ifnull          20
			b.a(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #87  <Field f b>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #383 <Method void f.a(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int j)
	{
		super.setBackgroundResource(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #386 <Method void Spinner.setBackgroundResource(int)>
		if(b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #87  <Field f b>
	//*   5    9:ifnull          20
			b.a(j);
	//    6   12:aload_0         
	//    7   13:getfield        #87  <Field f b>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #388 <Method void f.a(int)>
	//   10   20:return          
	}

	public void setDropDownHorizontalOffset(int j)
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          16
		{
			g.c(j);
	//    3    7:aload_0         
	//    4    8:getfield        #167 <Field AppCompatSpinner$b g>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #391 <Method void AppCompatSpinner$b.c(int)>
			return;
	//    7   15:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   16:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          16
	//*  10   21:icmplt          29
			super.setDropDownHorizontalOffset(j);
	//   11   24:aload_0         
	//   12   25:iload_1         
	//   13   26:invokespecial   #393 <Method void Spinner.setDropDownHorizontalOffset(int)>
	//   14   29:return          
	}

	public void setDropDownVerticalOffset(int j)
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          16
		{
			g.d(j);
	//    3    7:aload_0         
	//    4    8:getfield        #167 <Field AppCompatSpinner$b g>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #396 <Method void android.support.v7.widget.AppCompatSpinner$b.d(int)>
			return;
	//    7   15:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   16:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          16
	//*  10   21:icmplt          29
			super.setDropDownVerticalOffset(j);
	//   11   24:aload_0         
	//   12   25:iload_1         
	//   13   26:invokespecial   #398 <Method void Spinner.setDropDownVerticalOffset(int)>
	//   14   29:return          
	}

	public void setDropDownWidth(int j)
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          13
		{
			h = j;
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:putfield        #145 <Field int h>
			return;
	//    6   12:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   13:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   16:bipush          16
	//*   9   18:icmplt          26
			super.setDropDownWidth(j);
	//   10   21:aload_0         
	//   11   22:iload_1         
	//   12   23:invokespecial   #401 <Method void Spinner.setDropDownWidth(int)>
	//   13   26:return          
	}

	public void setPopupBackgroundDrawable(Drawable drawable)
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          16
		{
			g.a(drawable);
	//    3    7:aload_0         
	//    4    8:getfield        #167 <Field AppCompatSpinner$b g>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #154 <Method void AppCompatSpinner$b.a(Drawable)>
			return;
	//    7   15:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   16:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          16
	//*  10   21:icmplt          29
			super.setPopupBackgroundDrawable(drawable);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokespecial   #404 <Method void Spinner.setPopupBackgroundDrawable(Drawable)>
	//   14   29:return          
	}

	public void setPopupBackgroundResource(int j)
	{
		setPopupBackgroundDrawable(android.support.v7.c.a.b.b(getPopupContext(), j));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #406 <Method Context getPopupContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #411 <Method Drawable b.b(Context, int)>
	//    5    9:invokevirtual   #412 <Method void setPopupBackgroundDrawable(Drawable)>
	//    6   12:return          
	}

	public void setPrompt(CharSequence charsequence)
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field AppCompatSpinner$b g>
	//*   2    4:ifnull          16
		{
			g.a(charsequence);
	//    3    7:aload_0         
	//    4    8:getfield        #167 <Field AppCompatSpinner$b g>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #163 <Method void AppCompatSpinner$b.a(CharSequence)>
			return;
	//    7   15:return          
		} else
		{
			super.setPrompt(charsequence);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #415 <Method void Spinner.setPrompt(CharSequence)>
			return;
	//   11   21:return          
		}
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field f b>
	//*   2    4:ifnull          15
			b.a(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #87  <Field f b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #419 <Method void f.a(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field f b>
	//*   2    4:ifnull          15
			b.a(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #87  <Field f b>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #423 <Method void f.a(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	private static final int a[] = {
		0x10102f1
	};
	private final f b;
	private final Context c;
	private ac d;
	private SpinnerAdapter e;
	private final boolean f;
	private b g;
	private int h;
	private final Rect i;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #39  <Int 0x10102f1>
	//    5    7:iastore         
	//    6    8:putstatic       #41  <Field int[] a>
	//*   7   11:return          
	}

	// Unreferenced inner class android/support/v7/widget/AppCompatSpinner$b$1

/* anonymous class */
	class b._cls1
		implements android.widget.AdapterView.OnItemClickListener
	{

		public void onItemClick(AdapterView adapterview, View view, int j, long l)
		{
			b.b.setSelection(j);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field AppCompatSpinner$b b>
		//    2    4:getfield        #30  <Field AppCompatSpinner android.support.v7.widget.AppCompatSpinner$b.b>
		//    3    7:iload_3         
		//    4    8:invokevirtual   #34  <Method void AppCompatSpinner.setSelection(int)>
			if(b.b.getOnItemClickListener() != null)
		//*   5   11:aload_0         
		//*   6   12:getfield        #20  <Field AppCompatSpinner$b b>
		//*   7   15:getfield        #30  <Field AppCompatSpinner android.support.v7.widget.AppCompatSpinner$b.b>
		//*   8   18:invokevirtual   #38  <Method android.widget.AdapterView$OnItemClickListener AppCompatSpinner.getOnItemClickListener()>
		//*   9   21:ifnull          50
				b.b.performItemClick(view, j, b.a.getItemId(j));
		//   10   24:aload_0         
		//   11   25:getfield        #20  <Field AppCompatSpinner$b b>
		//   12   28:getfield        #30  <Field AppCompatSpinner android.support.v7.widget.AppCompatSpinner$b.b>
		//   13   31:aload_2         
		//   14   32:iload_3         
		//   15   33:aload_0         
		//   16   34:getfield        #20  <Field AppCompatSpinner$b b>
		//   17   37:getfield        #41  <Field ListAdapter AppCompatSpinner$b.a>
		//   18   40:iload_3         
		//   19   41:invokeinterface #47  <Method long ListAdapter.getItemId(int)>
		//   20   46:invokevirtual   #51  <Method boolean AppCompatSpinner.performItemClick(View, int, long)>
		//   21   49:pop             
			b.e();
		//   22   50:aload_0         
		//   23   51:getfield        #20  <Field AppCompatSpinner$b b>
		//   24   54:invokevirtual   #54  <Method void AppCompatSpinner$b.e()>
		//   25   57:return          
		}

		final AppCompatSpinner a;
		final b b;

			
			{
				b = b1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AppCompatSpinner$b b>
				a = appcompatspinner;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field AppCompatSpinner a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
	}

}
