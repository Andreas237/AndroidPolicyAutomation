// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.design.e;
import android.support.design.l;
import android.support.v4.view.ac;
import android.support.v4.widget.al;
import android.support.v4.widget.ao;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package android.support.design.widget:
//			aj, x, CoordinatorLayout, aa, 
//			y

public class BottomSheetBehavior extends aj
{

	public BottomSheetBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void aj()>
		l = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #45  <Field boolean l>
		e = 4;
	//    5    9:aload_0         
	//    6   10:iconst_4        
	//    7   11:putfield        #47  <Field int e>
		z = ((ao) (new x(this)));
	//    8   14:aload_0         
	//    9   15:new             #49  <Class x>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokespecial   #52  <Method void x(BottomSheetBehavior)>
	//   13   23:putfield        #54  <Field ao z>
	//   14   26:return          
	}

	public BottomSheetBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #58  <Method void aj(Context, AttributeSet)>
		l = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #45  <Field boolean l>
		e = 4;
	//    7   11:aload_0         
	//    8   12:iconst_4        
	//    9   13:putfield        #47  <Field int e>
		z = ((ao) (new x(this)));
	//   10   16:aload_0         
	//   11   17:new             #49  <Class x>
	//   12   20:dup             
	//   13   21:aload_0         
	//   14   22:invokespecial   #52  <Method void x(BottomSheetBehavior)>
	//   15   25:putfield        #54  <Field ao z>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, l.BottomSheetBehavior_Layout)));
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:getstatic       #64  <Field int[] l.BottomSheetBehavior_Layout>
	//   19   33:invokevirtual   #70  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   20   36:astore_2        
		TypedValue typedvalue = ((TypedArray) (attributeset)).peekValue(l.BottomSheetBehavior_Layout_behavior_peekHeight);
	//   21   37:aload_2         
	//   22   38:getstatic       #73  <Field int l.BottomSheetBehavior_Layout_behavior_peekHeight>
	//   23   41:invokevirtual   #79  <Method TypedValue TypedArray.peekValue(int)>
	//   24   44:astore_3        
		if(typedvalue != null && typedvalue.data == -1)
	//*  25   45:aload_3         
	//*  26   46:ifnull          68
	//*  27   49:aload_3         
	//*  28   50:getfield        #84  <Field int TypedValue.data>
	//*  29   53:iconst_m1       
	//*  30   54:icmpne          68
			a(typedvalue.data);
	//   31   57:aload_0         
	//   32   58:aload_3         
	//   33   59:getfield        #84  <Field int TypedValue.data>
	//   34   62:invokevirtual   #87  <Method void a(int)>
		else
	//*  35   65:goto            80
			a(((TypedArray) (attributeset)).getDimensionPixelSize(l.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
	//   36   68:aload_0         
	//   37   69:aload_2         
	//   38   70:getstatic       #73  <Field int l.BottomSheetBehavior_Layout_behavior_peekHeight>
	//   39   73:iconst_m1       
	//   40   74:invokevirtual   #91  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   41   77:invokevirtual   #87  <Method void a(int)>
		b(((TypedArray) (attributeset)).getBoolean(l.BottomSheetBehavior_Layout_behavior_hideable, false));
	//   42   80:aload_0         
	//   43   81:aload_2         
	//   44   82:getstatic       #94  <Field int l.BottomSheetBehavior_Layout_behavior_hideable>
	//   45   85:iconst_0        
	//   46   86:invokevirtual   #98  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   47   89:invokevirtual   #101 <Method void b(boolean)>
		a(((TypedArray) (attributeset)).getBoolean(l.BottomSheetBehavior_Layout_behavior_fitToContents, true));
	//   48   92:aload_0         
	//   49   93:aload_2         
	//   50   94:getstatic       #104 <Field int l.BottomSheetBehavior_Layout_behavior_fitToContents>
	//   51   97:iconst_1        
	//   52   98:invokevirtual   #98  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   53  101:invokevirtual   #106 <Method void a(boolean)>
		c(((TypedArray) (attributeset)).getBoolean(l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
	//   54  104:aload_0         
	//   55  105:aload_2         
	//   56  106:getstatic       #109 <Field int l.BottomSheetBehavior_Layout_behavior_skipCollapsed>
	//   57  109:iconst_0        
	//   58  110:invokevirtual   #98  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   59  113:invokevirtual   #111 <Method void c(boolean)>
		((TypedArray) (attributeset)).recycle();
	//   60  116:aload_2         
	//   61  117:invokevirtual   #114 <Method void TypedArray.recycle()>
		m = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
	//   62  120:aload_0         
	//   63  121:aload_1         
	//   64  122:invokestatic    #120 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   65  125:invokevirtual   #124 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   66  128:i2f             
	//   67  129:putfield        #126 <Field float m>
	//   68  132:return          
	}

	private void a()
	{
		if(l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean l>
	//*   2    4:ifeq            28
		{
			c = Math.max(g - q, a);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #128 <Field int g>
	//    6   12:aload_0         
	//    7   13:getfield        #130 <Field int q>
	//    8   16:isub            
	//    9   17:aload_0         
	//   10   18:getfield        #132 <Field int a>
	//   11   21:invokestatic    #137 <Method int Math.max(int, int)>
	//   12   24:putfield        #139 <Field int c>
			return;
	//   13   27:return          
		} else
		{
			c = g - q;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #128 <Field int g>
	//   17   33:aload_0         
	//   18   34:getfield        #130 <Field int q>
	//   19   37:isub            
	//   20   38:putfield        #139 <Field int c>
			return;
	//   21   41:return          
		}
	}

	static boolean a(BottomSheetBehavior bottomsheetbehavior)
	{
		return bottomsheetbehavior.l;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean l>
	//    2    4:ireturn         
	}

	static int b(BottomSheetBehavior bottomsheetbehavior)
	{
		return bottomsheetbehavior.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method int e()>
	//    2    4:ireturn         
	}

	private void b()
	{
		j = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #145 <Field int j>
		VelocityTracker velocitytracker = w;
	//    3    5:aload_0         
	//    4    6:getfield        #147 <Field VelocityTracker w>
	//    5    9:astore_1        
		if(velocitytracker != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          23
		{
			velocitytracker.recycle();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #150 <Method void VelocityTracker.recycle()>
			w = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #147 <Field VelocityTracker w>
		}
	//   13   23:return          
	}

	private float d()
	{
		VelocityTracker velocitytracker = w;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field VelocityTracker w>
	//    2    4:astore_1        
		if(velocitytracker == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
		{
			return 0.0F;
	//    5    9:fconst_0        
	//    6   10:freturn         
		} else
		{
			velocitytracker.computeCurrentVelocity(1000, m);
	//    7   11:aload_1         
	//    8   12:sipush          1000
	//    9   15:aload_0         
	//   10   16:getfield        #126 <Field float m>
	//   11   19:invokevirtual   #155 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			return w.getYVelocity(j);
	//   12   22:aload_0         
	//   13   23:getfield        #147 <Field VelocityTracker w>
	//   14   26:aload_0         
	//   15   27:getfield        #145 <Field int j>
	//   16   30:invokevirtual   #159 <Method float VelocityTracker.getYVelocity(int)>
	//   17   33:freturn         
		}
	}

	private void d(boolean flag)
	{
		Object obj = ((Object) (h));
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field WeakReference h>
	//    2    4:astore          4
		if(obj == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		obj = ((Object) (((View)((WeakReference) (obj)).get()).getParent()));
	//    6   12:aload           4
	//    7   14:invokevirtual   #166 <Method Object WeakReference.get()>
	//    8   17:checkcast       #168 <Class View>
	//    9   20:invokevirtual   #172 <Method android.view.ViewParent View.getParent()>
	//   10   23:astore          4
		if(!(obj instanceof CoordinatorLayout))
	//*  11   25:aload           4
	//*  12   27:instanceof      #174 <Class CoordinatorLayout>
	//*  13   30:ifne            34
			return;
	//   14   33:return          
		obj = ((Object) ((CoordinatorLayout)obj));
	//   15   34:aload           4
	//   16   36:checkcast       #174 <Class CoordinatorLayout>
	//   17   39:astore          4
		int j1 = ((CoordinatorLayout) (obj)).getChildCount();
	//   18   41:aload           4
	//   19   43:invokevirtual   #177 <Method int CoordinatorLayout.getChildCount()>
	//   20   46:istore_3        
		if(android.os.Build.VERSION.SDK_INT >= 16 && flag)
	//*  21   47:getstatic       #182 <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   50:bipush          16
	//*  23   52:icmplt          82
	//*  24   55:iload_1         
	//*  25   56:ifeq            82
			if(y == null)
	//*  26   59:aload_0         
	//*  27   60:getfield        #184 <Field Map y>
	//*  28   63:ifnonnull       81
				y = ((Map) (new HashMap(j1)));
	//   29   66:aload_0         
	//   30   67:new             #186 <Class HashMap>
	//   31   70:dup             
	//   32   71:iload_3         
	//   33   72:invokespecial   #188 <Method void HashMap(int)>
	//   34   75:putfield        #184 <Field Map y>
			else
	//*  35   78:goto            82
				return;
	//   36   81:return          
		for(int i1 = 0; i1 < j1; i1++)
	//*  37   82:iconst_0        
	//*  38   83:istore_2        
	//*  39   84:iload_2         
	//*  40   85:iload_3         
	//*  41   86:icmpge          205
		{
			View view = ((CoordinatorLayout) (obj)).getChildAt(i1);
	//   42   89:aload           4
	//   43   91:iload_2         
	//   44   92:invokevirtual   #192 <Method View CoordinatorLayout.getChildAt(int)>
	//   45   95:astore          5
			if(view == h.get())
	//*  46   97:aload           5
	//*  47   99:aload_0         
	//*  48  100:getfield        #161 <Field WeakReference h>
	//*  49  103:invokevirtual   #166 <Method Object WeakReference.get()>
	//*  50  106:if_acmpne       112
				continue;
	//   51  109:goto            198
			if(!flag)
	//*  52  112:iload_1         
	//*  53  113:ifne            164
			{
				Map map = y;
	//   54  116:aload_0         
	//   55  117:getfield        #184 <Field Map y>
	//   56  120:astore          6
				if(map != null && map.containsKey(((Object) (view))))
	//*  57  122:aload           6
	//*  58  124:ifnull          198
	//*  59  127:aload           6
	//*  60  129:aload           5
	//*  61  131:invokeinterface #198 <Method boolean Map.containsKey(Object)>
	//*  62  136:ifeq            198
					ac.b(view, ((Integer)y.get(((Object) (view)))).intValue());
	//   63  139:aload           5
	//   64  141:aload_0         
	//   65  142:getfield        #184 <Field Map y>
	//   66  145:aload           5
	//   67  147:invokeinterface #201 <Method Object Map.get(Object)>
	//   68  152:checkcast       #203 <Class Integer>
	//   69  155:invokevirtual   #206 <Method int Integer.intValue()>
	//   70  158:invokestatic    #211 <Method void ac.b(View, int)>
				continue;
	//   71  161:goto            198
			}
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  72  164:getstatic       #182 <Field int android.os.Build$VERSION.SDK_INT>
	//*  73  167:bipush          16
	//*  74  169:icmplt          192
				y.put(((Object) (view)), ((Object) (Integer.valueOf(view.getImportantForAccessibility()))));
	//   75  172:aload_0         
	//   76  173:getfield        #184 <Field Map y>
	//   77  176:aload           5
	//   78  178:aload           5
	//   79  180:invokevirtual   #214 <Method int View.getImportantForAccessibility()>
	//   80  183:invokestatic    #218 <Method Integer Integer.valueOf(int)>
	//   81  186:invokeinterface #222 <Method Object Map.put(Object, Object)>
	//   82  191:pop             
			ac.b(view, 4);
	//   83  192:aload           5
	//   84  194:iconst_4        
	//   85  195:invokestatic    #211 <Method void ac.b(View, int)>
		}

	//   86  198:iload_2         
	//   87  199:iconst_1        
	//   88  200:iadd            
	//   89  201:istore_2        
	//*  90  202:goto            84
		if(!flag)
	//*  91  205:iload_1         
	//*  92  206:ifne            214
			y = null;
	//   93  209:aload_0         
	//   94  210:aconst_null     
	//   95  211:putfield        #184 <Field Map y>
	//   96  214:return          
	}

	private int e()
	{
		if(l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean l>
	//*   2    4:ifeq            12
			return a;
	//    3    7:aload_0         
	//    4    8:getfield        #132 <Field int a>
	//    5   11:ireturn         
		else
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	View a(View view)
	{
		if(ac.v(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #226 <Method boolean ac.v(View)>
	//*   2    4:ifeq            9
			return view;
	//    3    7:aload_1         
	//    4    8:areturn         
		if(view instanceof ViewGroup)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #228 <Class ViewGroup>
	//*   7   13:ifeq            59
		{
			view = ((View) ((ViewGroup)view));
	//    8   16:aload_1         
	//    9   17:checkcast       #228 <Class ViewGroup>
	//   10   20:astore_1        
			int i1 = 0;
	//   11   21:iconst_0        
	//   12   22:istore_2        
			for(int j1 = ((ViewGroup) (view)).getChildCount(); i1 < j1; i1++)
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #229 <Method int ViewGroup.getChildCount()>
	//*  15   27:istore_3        
	//*  16   28:iload_2         
	//*  17   29:iload_3         
	//*  18   30:icmpge          59
			{
				View view1 = a(((ViewGroup) (view)).getChildAt(i1));
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokevirtual   #230 <Method View ViewGroup.getChildAt(int)>
	//   23   39:invokevirtual   #232 <Method View a(View)>
	//   24   42:astore          4
				if(view1 != null)
	//*  25   44:aload           4
	//*  26   46:ifnull          52
					return view1;
	//   27   49:aload           4
	//   28   51:areturn         
			}

	//   29   52:iload_2         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_2        
		}
	//*  33   56:goto            28
		return null;
	//   34   59:aconst_null     
	//   35   60:areturn         
	}

	public final void a(int i1)
	{
label0:
		{
			boolean flag;
label1:
			{
				flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
				if(i1 == -1)
	//*   2    2:iload_1         
	//*   3    3:iconst_m1       
	//*   4    4:icmpne          24
				{
					if(!o)
	//*   5    7:aload_0         
	//*   6    8:getfield        #234 <Field boolean o>
	//*   7   11:ifne            42
					{
						o = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #234 <Field boolean o>
						i1 = ((int) (flag));
	//   11   19:iload_2         
	//   12   20:istore_1        
						break label0;
	//   13   21:goto            73
					}
				} else
				if(o || n != i1)
	//*  14   24:aload_0         
	//*  15   25:getfield        #234 <Field boolean o>
	//*  16   28:ifne            47
	//*  17   31:aload_0         
	//*  18   32:getfield        #236 <Field int n>
	//*  19   35:iload_1         
	//*  20   36:icmpeq          42
					break label1;
	//   21   39:goto            47
				i1 = 0;
	//   22   42:iconst_0        
	//   23   43:istore_1        
				break label0;
	//   24   44:goto            73
			}
			o = false;
	//   25   47:aload_0         
	//   26   48:iconst_0        
	//   27   49:putfield        #234 <Field boolean o>
			n = Math.max(0, i1);
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:iload_1         
	//   31   55:invokestatic    #137 <Method int Math.max(int, int)>
	//   32   58:putfield        #236 <Field int n>
			c = g - i1;
	//   33   61:aload_0         
	//   34   62:aload_0         
	//   35   63:getfield        #128 <Field int g>
	//   36   66:iload_1         
	//   37   67:isub            
	//   38   68:putfield        #139 <Field int c>
			i1 = ((int) (flag));
	//   39   71:iload_2         
	//   40   72:istore_1        
		}
		if(i1 != 0 && e == 4)
	//*  41   73:iload_1         
	//*  42   74:ifeq            110
	//*  43   77:aload_0         
	//*  44   78:getfield        #47  <Field int e>
	//*  45   81:iconst_4        
	//*  46   82:icmpne          110
		{
			Object obj = ((Object) (h));
	//   47   85:aload_0         
	//   48   86:getfield        #161 <Field WeakReference h>
	//   49   89:astore_3        
			if(obj != null)
	//*  50   90:aload_3         
	//*  51   91:ifnull          110
			{
				obj = ((Object) ((View)((WeakReference) (obj)).get()));
	//   52   94:aload_3         
	//   53   95:invokevirtual   #166 <Method Object WeakReference.get()>
	//   54   98:checkcast       #168 <Class View>
	//   55  101:astore_3        
				if(obj != null)
	//*  56  102:aload_3         
	//*  57  103:ifnull          110
					((View) (obj)).requestLayout();
	//   58  106:aload_3         
	//   59  107:invokevirtual   #239 <Method void View.requestLayout()>
			}
		}
	//   60  110:return          
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_3         
	//    1    1:checkcast       #242 <Class BottomSheetBehavior$SavedState>
	//    2    4:astore_3        
		super.a(coordinatorlayout, view, ((SavedState) (parcelable)).getSuperState());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #246 <Method Parcelable BottomSheetBehavior$SavedState.getSuperState()>
	//    8   12:invokespecial   #248 <Method void aj.a(CoordinatorLayout, View, Parcelable)>
		if(((SavedState) (parcelable)).a != 1 && ((SavedState) (parcelable)).a != 2)
	//*   9   15:aload_3         
	//*  10   16:getfield        #249 <Field int BottomSheetBehavior$SavedState.a>
	//*  11   19:iconst_1        
	//*  12   20:icmpeq          43
	//*  13   23:aload_3         
	//*  14   24:getfield        #249 <Field int BottomSheetBehavior$SavedState.a>
	//*  15   27:iconst_2        
	//*  16   28:icmpne          34
	//*  17   31:goto            43
		{
			e = ((SavedState) (parcelable)).a;
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:getfield        #249 <Field int BottomSheetBehavior$SavedState.a>
	//   21   39:putfield        #47  <Field int e>
			return;
	//   22   42:return          
		} else
		{
			e = 4;
	//   23   43:aload_0         
	//   24   44:iconst_4        
	//   25   45:putfield        #47  <Field int e>
			return;
	//   26   48:return          
		}
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1)
	{
		i1 = view.getTop();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #253 <Method int View.getTop()>
	//    2    4:istore          4
		int j1 = e();
	//    3    6:aload_0         
	//    4    7:invokespecial   #143 <Method int e()>
	//    5   10:istore          6
		byte byte0 = 3;
	//    6   12:iconst_3        
	//    7   13:istore          5
		if(i1 == j1)
	//*   8   15:iload           4
	//*   9   17:iload           6
	//*  10   19:icmpne          28
		{
			b(3);
	//   11   22:aload_0         
	//   12   23:iconst_3        
	//   13   24:invokevirtual   #255 <Method void b(int)>
			return;
	//   14   27:return          
		}
		if(view1 == i.get())
	//*  15   28:aload_3         
	//*  16   29:aload_0         
	//*  17   30:getfield        #257 <Field WeakReference i>
	//*  18   33:invokevirtual   #166 <Method Object WeakReference.get()>
	//*  19   36:if_acmpne       312
		{
			if(!u)
	//*  20   39:aload_0         
	//*  21   40:getfield        #259 <Field boolean u>
	//*  22   43:ifne            47
				return;
	//   23   46:return          
			if(t > 0)
	//*  24   47:aload_0         
	//*  25   48:getfield        #261 <Field int t>
	//*  26   51:ifle            63
				i1 = e();
	//   27   54:aload_0         
	//   28   55:invokespecial   #143 <Method int e()>
	//   29   58:istore          4
			else
	//*  30   60:goto            260
			if(d && a(view, d()))
	//*  31   63:aload_0         
	//*  32   64:getfield        #263 <Field boolean d>
	//*  33   67:ifeq            94
	//*  34   70:aload_0         
	//*  35   71:aload_2         
	//*  36   72:aload_0         
	//*  37   73:invokespecial   #265 <Method float d()>
	//*  38   76:invokevirtual   #268 <Method boolean a(View, float)>
	//*  39   79:ifeq            94
			{
				i1 = g;
	//   40   82:aload_0         
	//   41   83:getfield        #128 <Field int g>
	//   42   86:istore          4
				byte0 = 5;
	//   43   88:iconst_5        
	//   44   89:istore          5
			} else
	//*  45   91:goto            260
			if(t == 0)
	//*  46   94:aload_0         
	//*  47   95:getfield        #261 <Field int t>
	//*  48   98:ifne            251
			{
				i1 = view.getTop();
	//   49  101:aload_2         
	//   50  102:invokevirtual   #253 <Method int View.getTop()>
	//   51  105:istore          4
				if(l)
	//*  52  107:aload_0         
	//*  53  108:getfield        #45  <Field boolean l>
	//*  54  111:ifeq            158
				{
					if(Math.abs(i1 - a) < Math.abs(i1 - c))
	//*  55  114:iload           4
	//*  56  116:aload_0         
	//*  57  117:getfield        #132 <Field int a>
	//*  58  120:isub            
	//*  59  121:invokestatic    #272 <Method int Math.abs(int)>
	//*  60  124:iload           4
	//*  61  126:aload_0         
	//*  62  127:getfield        #139 <Field int c>
	//*  63  130:isub            
	//*  64  131:invokestatic    #272 <Method int Math.abs(int)>
	//*  65  134:icmpge          146
					{
						i1 = a;
	//   66  137:aload_0         
	//   67  138:getfield        #132 <Field int a>
	//   68  141:istore          4
					} else
	//*  69  143:goto            260
					{
						i1 = c;
	//   70  146:aload_0         
	//   71  147:getfield        #139 <Field int c>
	//   72  150:istore          4
						byte0 = 4;
	//   73  152:iconst_4        
	//   74  153:istore          5
					}
				} else
	//*  75  155:goto            260
				{
					int k1 = b;
	//   76  158:aload_0         
	//   77  159:getfield        #274 <Field int b>
	//   78  162:istore          6
					if(i1 < k1)
	//*  79  164:iload           4
	//*  80  166:iload           6
	//*  81  168:icmpge          205
					{
						if(i1 < Math.abs(i1 - c))
	//*  82  171:iload           4
	//*  83  173:iload           4
	//*  84  175:aload_0         
	//*  85  176:getfield        #139 <Field int c>
	//*  86  179:isub            
	//*  87  180:invokestatic    #272 <Method int Math.abs(int)>
	//*  88  183:icmpge          192
						{
							i1 = 0;
	//   89  186:iconst_0        
	//   90  187:istore          4
						} else
	//*  91  189:goto            260
						{
							i1 = b;
	//   92  192:aload_0         
	//   93  193:getfield        #274 <Field int b>
	//   94  196:istore          4
							byte0 = 6;
	//   95  198:bipush          6
	//   96  200:istore          5
						}
					} else
	//*  97  202:goto            260
					if(Math.abs(i1 - k1) < Math.abs(i1 - c))
	//*  98  205:iload           4
	//*  99  207:iload           6
	//* 100  209:isub            
	//* 101  210:invokestatic    #272 <Method int Math.abs(int)>
	//* 102  213:iload           4
	//* 103  215:aload_0         
	//* 104  216:getfield        #139 <Field int c>
	//* 105  219:isub            
	//* 106  220:invokestatic    #272 <Method int Math.abs(int)>
	//* 107  223:icmpge          239
					{
						i1 = b;
	//  108  226:aload_0         
	//  109  227:getfield        #274 <Field int b>
	//  110  230:istore          4
						byte0 = 6;
	//  111  232:bipush          6
	//  112  234:istore          5
					} else
	//* 113  236:goto            260
					{
						i1 = c;
	//  114  239:aload_0         
	//  115  240:getfield        #139 <Field int c>
	//  116  243:istore          4
						byte0 = 4;
	//  117  245:iconst_4        
	//  118  246:istore          5
					}
				}
			} else
	//* 119  248:goto            260
			{
				i1 = c;
	//  120  251:aload_0         
	//  121  252:getfield        #139 <Field int c>
	//  122  255:istore          4
				byte0 = 4;
	//  123  257:iconst_4        
	//  124  258:istore          5
			}
			if(f.a(view, view.getLeft(), i1))
	//* 125  260:aload_0         
	//* 126  261:getfield        #276 <Field al f>
	//* 127  264:aload_2         
	//* 128  265:aload_2         
	//* 129  266:invokevirtual   #279 <Method int View.getLeft()>
	//* 130  269:iload           4
	//* 131  271:invokevirtual   #284 <Method boolean al.a(View, int, int)>
	//* 132  274:ifeq            300
			{
				b(2);
	//  133  277:aload_0         
	//  134  278:iconst_2        
	//  135  279:invokevirtual   #255 <Method void b(int)>
				ac.a(view, ((Runnable) (new aa(this, view, ((int) (byte0))))));
	//  136  282:aload_2         
	//  137  283:new             #286 <Class aa>
	//  138  286:dup             
	//  139  287:aload_0         
	//  140  288:aload_2         
	//  141  289:iload           5
	//  142  291:invokespecial   #289 <Method void aa(BottomSheetBehavior, View, int)>
	//  143  294:invokestatic    #292 <Method void ac.a(View, Runnable)>
			} else
	//* 144  297:goto            306
			{
				b(((int) (byte0)));
	//  145  300:aload_0         
	//  146  301:iload           5
	//  147  303:invokevirtual   #255 <Method void b(int)>
			}
			u = false;
	//  148  306:aload_0         
	//  149  307:iconst_0        
	//  150  308:putfield        #259 <Field boolean u>
			return;
	//  151  311:return          
		} else
		{
			return;
	//  152  312:return          
		}
	}

	public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1, int j1, int ai[], int k1)
	{
		if(k1 == 1)
	//*   0    0:iload           7
	//*   1    2:iconst_1        
	//*   2    3:icmpne          7
			return;
	//    3    6:return          
		if(view1 != (View)i.get())
	//*   4    7:aload_3         
	//*   5    8:aload_0         
	//*   6    9:getfield        #257 <Field WeakReference i>
	//*   7   12:invokevirtual   #166 <Method Object WeakReference.get()>
	//*   8   15:checkcast       #168 <Class View>
	//*   9   18:if_acmpeq       22
			return;
	//   10   21:return          
		i1 = view.getTop();
	//   11   22:aload_2         
	//   12   23:invokevirtual   #253 <Method int View.getTop()>
	//   13   26:istore          4
		k1 = i1 - j1;
	//   14   28:iload           4
	//   15   30:iload           5
	//   16   32:isub            
	//   17   33:istore          7
		if(j1 > 0)
	//*  18   35:iload           5
	//*  19   37:ifle            98
		{
			if(k1 < e())
	//*  20   40:iload           7
	//*  21   42:aload_0         
	//*  22   43:invokespecial   #143 <Method int e()>
	//*  23   46:icmpge          77
			{
				ai[1] = i1 - e();
	//   24   49:aload           6
	//   25   51:iconst_1        
	//   26   52:iload           4
	//   27   54:aload_0         
	//   28   55:invokespecial   #143 <Method int e()>
	//   29   58:isub            
	//   30   59:iastore         
				ac.e(view, -ai[1]);
	//   31   60:aload_2         
	//   32   61:aload           6
	//   33   63:iconst_1        
	//   34   64:iaload          
	//   35   65:ineg            
	//   36   66:invokestatic    #295 <Method void ac.e(View, int)>
				b(3);
	//   37   69:aload_0         
	//   38   70:iconst_3        
	//   39   71:invokevirtual   #255 <Method void b(int)>
			} else
	//*  40   74:goto            178
			{
				ai[1] = j1;
	//   41   77:aload           6
	//   42   79:iconst_1        
	//   43   80:iload           5
	//   44   82:iastore         
				ac.e(view, -j1);
	//   45   83:aload_2         
	//   46   84:iload           5
	//   47   86:ineg            
	//   48   87:invokestatic    #295 <Method void ac.e(View, int)>
				b(1);
	//   49   90:aload_0         
	//   50   91:iconst_1        
	//   51   92:invokevirtual   #255 <Method void b(int)>
			}
		} else
	//*  52   95:goto            178
		if(j1 < 0 && !view1.canScrollVertically(-1))
	//*  53   98:iload           5
	//*  54  100:ifge            178
	//*  55  103:aload_3         
	//*  56  104:iconst_m1       
	//*  57  105:invokevirtual   #299 <Method boolean View.canScrollVertically(int)>
	//*  58  108:ifne            178
		{
			int l1 = c;
	//   59  111:aload_0         
	//   60  112:getfield        #139 <Field int c>
	//   61  115:istore          8
			if(k1 > l1 && !d)
	//*  62  117:iload           7
	//*  63  119:iload           8
	//*  64  121:icmple          160
	//*  65  124:aload_0         
	//*  66  125:getfield        #263 <Field boolean d>
	//*  67  128:ifeq            134
	//*  68  131:goto            160
			{
				ai[1] = i1 - l1;
	//   69  134:aload           6
	//   70  136:iconst_1        
	//   71  137:iload           4
	//   72  139:iload           8
	//   73  141:isub            
	//   74  142:iastore         
				ac.e(view, -ai[1]);
	//   75  143:aload_2         
	//   76  144:aload           6
	//   77  146:iconst_1        
	//   78  147:iaload          
	//   79  148:ineg            
	//   80  149:invokestatic    #295 <Method void ac.e(View, int)>
				b(4);
	//   81  152:aload_0         
	//   82  153:iconst_4        
	//   83  154:invokevirtual   #255 <Method void b(int)>
			} else
	//*  84  157:goto            178
			{
				ai[1] = j1;
	//   85  160:aload           6
	//   86  162:iconst_1        
	//   87  163:iload           5
	//   88  165:iastore         
				ac.e(view, -j1);
	//   89  166:aload_2         
	//   90  167:iload           5
	//   91  169:ineg            
	//   92  170:invokestatic    #295 <Method void ac.e(View, int)>
				b(1);
	//   93  173:aload_0         
	//   94  174:iconst_1        
	//   95  175:invokevirtual   #255 <Method void b(int)>
			}
		}
		c(view.getTop());
	//   96  178:aload_0         
	//   97  179:aload_2         
	//   98  180:invokevirtual   #253 <Method int View.getTop()>
	//   99  183:invokevirtual   #301 <Method void c(int)>
		t = j1;
	//  100  186:aload_0         
	//  101  187:iload           5
	//  102  189:putfield        #261 <Field int t>
		u = true;
	//  103  192:aload_0         
	//  104  193:iconst_1        
	//  105  194:putfield        #259 <Field boolean u>
	//  106  197:return          
	}

	public void a(boolean flag)
	{
		if(l == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean l>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		l = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #45  <Field boolean l>
		if(h != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #161 <Field WeakReference h>
	//*  10   18:ifnull          25
			a();
	//   11   21:aload_0         
	//   12   22:invokespecial   #303 <Method void a()>
		int i1;
		if(l && e == 6)
	//*  13   25:aload_0         
	//*  14   26:getfield        #45  <Field boolean l>
	//*  15   29:ifeq            46
	//*  16   32:aload_0         
	//*  17   33:getfield        #47  <Field int e>
	//*  18   36:bipush          6
	//*  19   38:icmpne          46
			i1 = 3;
	//   20   41:iconst_3        
	//   21   42:istore_2        
		else
	//*  22   43:goto            51
			i1 = e;
	//   23   46:aload_0         
	//   24   47:getfield        #47  <Field int e>
	//   25   50:istore_2        
		b(i1);
	//   26   51:aload_0         
	//   27   52:iload_2         
	//   28   53:invokevirtual   #255 <Method void b(int)>
	//   29   56:return          
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, int i1)
	{
		if(ac.q(((View) (coordinatorlayout))) && !ac.q(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #306 <Method boolean ac.q(View)>
	//*   2    4:ifeq            19
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #306 <Method boolean ac.q(View)>
	//*   5   11:ifne            19
			view.setFitsSystemWindows(true);
	//    6   14:aload_2         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #309 <Method void View.setFitsSystemWindows(boolean)>
		int j1 = view.getTop();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #253 <Method int View.getTop()>
	//   11   23:istore          4
		coordinatorlayout.a(view, i1);
	//   12   25:aload_1         
	//   13   26:aload_2         
	//   14   27:iload_3         
	//   15   28:invokevirtual   #311 <Method void CoordinatorLayout.a(View, int)>
		g = coordinatorlayout.getHeight();
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #314 <Method int CoordinatorLayout.getHeight()>
	//   19   36:putfield        #128 <Field int g>
		if(o)
	//*  20   39:aload_0         
	//*  21   40:getfield        #234 <Field boolean o>
	//*  22   43:ifeq            96
		{
			if(p == 0)
	//*  23   46:aload_0         
	//*  24   47:getfield        #316 <Field int p>
	//*  25   50:ifne            67
				p = coordinatorlayout.getResources().getDimensionPixelSize(e.design_bottom_sheet_peek_height_min);
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #320 <Method Resources CoordinatorLayout.getResources()>
	//   29   58:getstatic       #325 <Field int e.design_bottom_sheet_peek_height_min>
	//   30   61:invokevirtual   #329 <Method int Resources.getDimensionPixelSize(int)>
	//   31   64:putfield        #316 <Field int p>
			q = Math.max(p, g - (coordinatorlayout.getWidth() * 9) / 16);
	//   32   67:aload_0         
	//   33   68:aload_0         
	//   34   69:getfield        #316 <Field int p>
	//   35   72:aload_0         
	//   36   73:getfield        #128 <Field int g>
	//   37   76:aload_1         
	//   38   77:invokevirtual   #332 <Method int CoordinatorLayout.getWidth()>
	//   39   80:bipush          9
	//   40   82:imul            
	//   41   83:bipush          16
	//   42   85:idiv            
	//   43   86:isub            
	//   44   87:invokestatic    #137 <Method int Math.max(int, int)>
	//   45   90:putfield        #130 <Field int q>
		} else
	//*  46   93:goto            104
		{
			q = n;
	//   47   96:aload_0         
	//   48   97:aload_0         
	//   49   98:getfield        #236 <Field int n>
	//   50  101:putfield        #130 <Field int q>
		}
		a = Math.max(0, g - view.getHeight());
	//   51  104:aload_0         
	//   52  105:iconst_0        
	//   53  106:aload_0         
	//   54  107:getfield        #128 <Field int g>
	//   55  110:aload_2         
	//   56  111:invokevirtual   #333 <Method int View.getHeight()>
	//   57  114:isub            
	//   58  115:invokestatic    #137 <Method int Math.max(int, int)>
	//   59  118:putfield        #132 <Field int a>
		b = g / 2;
	//   60  121:aload_0         
	//   61  122:aload_0         
	//   62  123:getfield        #128 <Field int g>
	//   63  126:iconst_2        
	//   64  127:idiv            
	//   65  128:putfield        #274 <Field int b>
		a();
	//   66  131:aload_0         
	//   67  132:invokespecial   #303 <Method void a()>
		i1 = e;
	//   68  135:aload_0         
	//   69  136:getfield        #47  <Field int e>
	//   70  139:istore_3        
		if(i1 == 3)
	//*  71  140:iload_3         
	//*  72  141:iconst_3        
	//*  73  142:icmpne          156
			ac.e(view, e());
	//   74  145:aload_2         
	//   75  146:aload_0         
	//   76  147:invokespecial   #143 <Method int e()>
	//   77  150:invokestatic    #295 <Method void ac.e(View, int)>
		else
	//*  78  153:goto            238
		if(i1 == 6)
	//*  79  156:iload_3         
	//*  80  157:bipush          6
	//*  81  159:icmpne          173
			ac.e(view, b);
	//   82  162:aload_2         
	//   83  163:aload_0         
	//   84  164:getfield        #274 <Field int b>
	//   85  167:invokestatic    #295 <Method void ac.e(View, int)>
		else
	//*  86  170:goto            238
		if(d && i1 == 5)
	//*  87  173:aload_0         
	//*  88  174:getfield        #263 <Field boolean d>
	//*  89  177:ifeq            196
	//*  90  180:iload_3         
	//*  91  181:iconst_5        
	//*  92  182:icmpne          196
		{
			ac.e(view, g);
	//   93  185:aload_2         
	//   94  186:aload_0         
	//   95  187:getfield        #128 <Field int g>
	//   96  190:invokestatic    #295 <Method void ac.e(View, int)>
		} else
	//*  97  193:goto            238
		{
			i1 = e;
	//   98  196:aload_0         
	//   99  197:getfield        #47  <Field int e>
	//  100  200:istore_3        
			if(i1 == 4)
	//* 101  201:iload_3         
	//* 102  202:iconst_4        
	//* 103  203:icmpne          217
				ac.e(view, c);
	//  104  206:aload_2         
	//  105  207:aload_0         
	//  106  208:getfield        #139 <Field int c>
	//  107  211:invokestatic    #295 <Method void ac.e(View, int)>
			else
	//* 108  214:goto            238
			if(i1 == 1 || i1 == 2)
	//* 109  217:iload_3         
	//* 110  218:iconst_1        
	//* 111  219:icmpeq          227
	//* 112  222:iload_3         
	//* 113  223:iconst_2        
	//* 114  224:icmpne          238
				ac.e(view, j1 - view.getTop());
	//  115  227:aload_2         
	//  116  228:iload           4
	//  117  230:aload_2         
	//  118  231:invokevirtual   #253 <Method int View.getTop()>
	//  119  234:isub            
	//  120  235:invokestatic    #295 <Method void ac.e(View, int)>
		}
		if(f == null)
	//* 121  238:aload_0         
	//* 122  239:getfield        #276 <Field al f>
	//* 123  242:ifnonnull       257
			f = al.a(((ViewGroup) (coordinatorlayout)), z);
	//  124  245:aload_0         
	//  125  246:aload_1         
	//  126  247:aload_0         
	//  127  248:getfield        #54  <Field ao z>
	//  128  251:invokestatic    #336 <Method al al.a(ViewGroup, ao)>
	//  129  254:putfield        #276 <Field al f>
		h = new WeakReference(((Object) (view)));
	//  130  257:aload_0         
	//  131  258:new             #163 <Class WeakReference>
	//  132  261:dup             
	//  133  262:aload_2         
	//  134  263:invokespecial   #339 <Method void WeakReference(Object)>
	//  135  266:putfield        #161 <Field WeakReference h>
		i = new WeakReference(((Object) (a(view))));
	//  136  269:aload_0         
	//  137  270:new             #163 <Class WeakReference>
	//  138  273:dup             
	//  139  274:aload_0         
	//  140  275:aload_2         
	//  141  276:invokevirtual   #232 <Method View a(View)>
	//  142  279:invokespecial   #339 <Method void WeakReference(Object)>
	//  143  282:putfield        #257 <Field WeakReference i>
		return true;
	//  144  285:iconst_1        
	//  145  286:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(!view.isShown())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #344 <Method boolean View.isShown()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int i1 = motionevent.getActionMasked();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #349 <Method int MotionEvent.getActionMasked()>
	//    7   13:istore          4
		if(e == 1 && i1 == 0)
	//*   8   15:aload_0         
	//*   9   16:getfield        #47  <Field int e>
	//*  10   19:iconst_1        
	//*  11   20:icmpne          30
	//*  12   23:iload           4
	//*  13   25:ifne            30
			return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		coordinatorlayout = ((CoordinatorLayout) (f));
	//   16   30:aload_0         
	//   17   31:getfield        #276 <Field al f>
	//   18   34:astore_1        
		if(coordinatorlayout != null)
	//*  19   35:aload_1         
	//*  20   36:ifnull          44
			((al) (coordinatorlayout)).b(motionevent);
	//   21   39:aload_1         
	//   22   40:aload_3         
	//   23   41:invokevirtual   #352 <Method void al.b(MotionEvent)>
		if(i1 == 0)
	//*  24   44:iload           4
	//*  25   46:ifne            53
			b();
	//   26   49:aload_0         
	//   27   50:invokespecial   #354 <Method void b()>
		if(w == null)
	//*  28   53:aload_0         
	//*  29   54:getfield        #147 <Field VelocityTracker w>
	//*  30   57:ifnonnull       67
			w = VelocityTracker.obtain();
	//   31   60:aload_0         
	//   32   61:invokestatic    #358 <Method VelocityTracker VelocityTracker.obtain()>
	//   33   64:putfield        #147 <Field VelocityTracker w>
		w.addMovement(motionevent);
	//   34   67:aload_0         
	//   35   68:getfield        #147 <Field VelocityTracker w>
	//   36   71:aload_3         
	//   37   72:invokevirtual   #361 <Method void VelocityTracker.addMovement(MotionEvent)>
		if(i1 == 2 && !s && Math.abs((float)x - motionevent.getY()) > (float)f.d())
	//*  38   75:iload           4
	//*  39   77:iconst_2        
	//*  40   78:icmpne          129
	//*  41   81:aload_0         
	//*  42   82:getfield        #363 <Field boolean s>
	//*  43   85:ifne            129
	//*  44   88:aload_0         
	//*  45   89:getfield        #365 <Field int x>
	//*  46   92:i2f             
	//*  47   93:aload_3         
	//*  48   94:invokevirtual   #368 <Method float MotionEvent.getY()>
	//*  49   97:fsub            
	//*  50   98:invokestatic    #371 <Method float Math.abs(float)>
	//*  51  101:aload_0         
	//*  52  102:getfield        #276 <Field al f>
	//*  53  105:invokevirtual   #373 <Method int al.d()>
	//*  54  108:i2f             
	//*  55  109:fcmpl           
	//*  56  110:ifle            129
			f.a(view, motionevent.getPointerId(motionevent.getActionIndex()));
	//   57  113:aload_0         
	//   58  114:getfield        #276 <Field al f>
	//   59  117:aload_2         
	//   60  118:aload_3         
	//   61  119:aload_3         
	//   62  120:invokevirtual   #376 <Method int MotionEvent.getActionIndex()>
	//   63  123:invokevirtual   #379 <Method int MotionEvent.getPointerId(int)>
	//   64  126:invokevirtual   #380 <Method void al.a(View, int)>
		return s ^ true;
	//   65  129:aload_0         
	//   66  130:getfield        #363 <Field boolean s>
	//   67  133:iconst_1        
	//   68  134:ixor            
	//   69  135:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, float f1, float f2)
	{
		return view1 == i.get() && (e != 3 || super.a(coordinatorlayout, view, view1, f1, f2));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #257 <Field WeakReference i>
	//    3    5:invokevirtual   #166 <Method Object WeakReference.get()>
	//    4    8:if_acmpne       35
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field int e>
	//    7   15:iconst_3        
	//    8   16:icmpne          33
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:fload           4
	//   14   25:fload           5
	//   15   27:invokespecial   #383 <Method boolean aj.a(CoordinatorLayout, View, View, float, float)>
	//   16   30:ifeq            35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i1, int j1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		t = 0;
	//    2    3:aload_0         
	//    3    4:iconst_0        
	//    4    5:putfield        #261 <Field int t>
		u = false;
	//    5    8:aload_0         
	//    6    9:iconst_0        
	//    7   10:putfield        #259 <Field boolean u>
		if((i1 & 2) != 0)
	//*   8   13:iload           5
	//*   9   15:iconst_2        
	//*  10   16:iand            
	//*  11   17:ifeq            23
			flag = true;
	//   12   20:iconst_1        
	//   13   21:istore          7
		return flag;
	//   14   23:iload           7
	//   15   25:ireturn         
	}

	boolean a(View view, float f1)
	{
		if(r)
	//*   0    0:aload_0         
	//*   1    1:getfield        #386 <Field boolean r>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(view.getTop() < c)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #253 <Method int View.getTop()>
	//*   7   13:aload_0         
	//*   8   14:getfield        #139 <Field int c>
	//*   9   17:icmpge          22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		return Math.abs(((float)view.getTop() + f1 * 0.1F) - (float)c) / (float)n > 0.5F;
	//   12   22:aload_1         
	//   13   23:invokevirtual   #253 <Method int View.getTop()>
	//   14   26:i2f             
	//   15   27:fload_2         
	//   16   28:ldc2            #387 <Float 0.1F>
	//   17   31:fmul            
	//   18   32:fadd            
	//   19   33:aload_0         
	//   20   34:getfield        #139 <Field int c>
	//   21   37:i2f             
	//   22   38:fsub            
	//   23   39:invokestatic    #371 <Method float Math.abs(float)>
	//   24   42:aload_0         
	//   25   43:getfield        #236 <Field int n>
	//   26   46:i2f             
	//   27   47:fdiv            
	//   28   48:ldc2            #388 <Float 0.5F>
	//   29   51:fcmpl           
	//   30   52:ifle            57
	//   31   55:iconst_1        
	//   32   56:ireturn         
	//   33   57:iconst_0        
	//   34   58:ireturn         
	}

	public Parcelable b(CoordinatorLayout coordinatorlayout, View view)
	{
		return ((Parcelable) (new SavedState(super.b(coordinatorlayout, view), e)));
	//    0    0:new             #242 <Class BottomSheetBehavior$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #391 <Method Parcelable aj.b(CoordinatorLayout, View)>
	//    6   10:aload_0         
	//    7   11:getfield        #47  <Field int e>
	//    8   14:invokespecial   #394 <Method void BottomSheetBehavior$SavedState(Parcelable, int)>
	//    9   17:areturn         
	}

	void b(int i1)
	{
		if(e == i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field int e>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		e = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #47  <Field int e>
		if(i1 != 6 && i1 != 3)
	//*   8   14:iload_1         
	//*   9   15:bipush          6
	//*  10   17:icmpeq          46
	//*  11   20:iload_1         
	//*  12   21:iconst_3        
	//*  13   22:icmpne          28
	//*  14   25:goto            46
		{
			if(i1 == 5 || i1 == 4)
	//*  15   28:iload_1         
	//*  16   29:iconst_5        
	//*  17   30:icmpeq          38
	//*  18   33:iload_1         
	//*  19   34:iconst_4        
	//*  20   35:icmpne          51
				d(false);
	//   21   38:aload_0         
	//   22   39:iconst_0        
	//   23   40:invokespecial   #396 <Method void d(boolean)>
		} else
	//*  24   43:goto            51
		{
			d(true);
	//   25   46:aload_0         
	//   26   47:iconst_1        
	//   27   48:invokespecial   #396 <Method void d(boolean)>
		}
		View view = (View)h.get();
	//   28   51:aload_0         
	//   29   52:getfield        #161 <Field WeakReference h>
	//   30   55:invokevirtual   #166 <Method Object WeakReference.get()>
	//   31   58:checkcast       #168 <Class View>
	//   32   61:astore_2        
		if(view != null)
	//*  33   62:aload_2         
	//*  34   63:ifnull          81
		{
			y y1 = v;
	//   35   66:aload_0         
	//   36   67:getfield        #398 <Field y v>
	//   37   70:astore_3        
			if(y1 != null)
	//*  38   71:aload_3         
	//*  39   72:ifnull          81
				y1.a(view, i1);
	//   40   75:aload_3         
	//   41   76:aload_2         
	//   42   77:iload_1         
	//   43   78:invokevirtual   #401 <Method void y.a(View, int)>
		}
	//   44   81:return          
	}

	public void b(boolean flag)
	{
		d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #263 <Field boolean d>
	//    3    5:return          
	}

	public boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		int i1;
		boolean flag3;
		Object obj1;
		boolean flag = view.isShown();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #344 <Method boolean View.isShown()>
	//    2    4:istore          6
		flag3 = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
		if(!flag)
	//*   5    9:iload           6
	//*   6   11:ifne            21
		{
			s = true;
	//    7   14:aload_0         
	//    8   15:iconst_1        
	//    9   16:putfield        #363 <Field boolean s>
			return false;
	//   10   19:iconst_0        
	//   11   20:ireturn         
		}
		i1 = motionevent.getActionMasked();
	//   12   21:aload_3         
	//   13   22:invokevirtual   #349 <Method int MotionEvent.getActionMasked()>
	//   14   25:istore          4
		if(i1 == 0)
	//*  15   27:iload           4
	//*  16   29:ifne            36
			b();
	//   17   32:aload_0         
	//   18   33:invokespecial   #354 <Method void b()>
		if(w == null)
	//*  19   36:aload_0         
	//*  20   37:getfield        #147 <Field VelocityTracker w>
	//*  21   40:ifnonnull       50
			w = VelocityTracker.obtain();
	//   22   43:aload_0         
	//   23   44:invokestatic    #358 <Method VelocityTracker VelocityTracker.obtain()>
	//   24   47:putfield        #147 <Field VelocityTracker w>
		w.addMovement(motionevent);
	//   25   50:aload_0         
	//   26   51:getfield        #147 <Field VelocityTracker w>
	//   27   54:aload_3         
	//   28   55:invokevirtual   #361 <Method void VelocityTracker.addMovement(MotionEvent)>
		obj1 = null;
	//   29   58:aconst_null     
	//   30   59:astore          9
		if(i1 == 3) goto _L2; else goto _L1
	//   31   61:iload           4
	//   32   63:iconst_3        
	//   33   64:icmpeq          215
_L1:
		i1;
	//   34   67:iload           4
		JVM INSTR tableswitch 0 1: default 92
	//	               0 95
	//	               1 215;
	//   35   69:tableswitch     0 1: default 92
	//	               0 95
	//	               1 215
		   goto _L3 _L4 _L2
_L3:
		break; /* Loop/switch isn't completed */
	//   36   92:goto            239
_L4:
		int j1 = (int)motionevent.getX();
	//   37   95:aload_3         
	//   38   96:invokevirtual   #404 <Method float MotionEvent.getX()>
	//   39   99:f2i             
	//   40  100:istore          5
		x = (int)motionevent.getY();
	//   41  102:aload_0         
	//   42  103:aload_3         
	//   43  104:invokevirtual   #368 <Method float MotionEvent.getY()>
	//   44  107:f2i             
	//   45  108:putfield        #365 <Field int x>
		Object obj = ((Object) (i));
	//   46  111:aload_0         
	//   47  112:getfield        #257 <Field WeakReference i>
	//   48  115:astore          8
		if(obj != null)
	//*  49  117:aload           8
	//*  50  119:ifnull          135
			obj = ((Object) ((View)((WeakReference) (obj)).get()));
	//   51  122:aload           8
	//   52  124:invokevirtual   #166 <Method Object WeakReference.get()>
	//   53  127:checkcast       #168 <Class View>
	//   54  130:astore          8
		else
	//*  55  132:goto            138
			obj = null;
	//   56  135:aconst_null     
	//   57  136:astore          8
		if(obj != null && coordinatorlayout.a(((View) (obj)), j1, x))
	//*  58  138:aload           8
	//*  59  140:ifnull          175
	//*  60  143:aload_1         
	//*  61  144:aload           8
	//*  62  146:iload           5
	//*  63  148:aload_0         
	//*  64  149:getfield        #365 <Field int x>
	//*  65  152:invokevirtual   #405 <Method boolean CoordinatorLayout.a(View, int, int)>
	//*  66  155:ifeq            175
		{
			j = motionevent.getPointerId(motionevent.getActionIndex());
	//   67  158:aload_0         
	//   68  159:aload_3         
	//   69  160:aload_3         
	//   70  161:invokevirtual   #376 <Method int MotionEvent.getActionIndex()>
	//   71  164:invokevirtual   #379 <Method int MotionEvent.getPointerId(int)>
	//   72  167:putfield        #145 <Field int j>
			k = true;
	//   73  170:aload_0         
	//   74  171:iconst_1        
	//   75  172:putfield        #407 <Field boolean k>
		}
		boolean flag1;
		if(j == -1 && !coordinatorlayout.a(view, j1, x))
	//*  76  175:aload_0         
	//*  77  176:getfield        #145 <Field int j>
	//*  78  179:iconst_m1       
	//*  79  180:icmpne          203
	//*  80  183:aload_1         
	//*  81  184:aload_2         
	//*  82  185:iload           5
	//*  83  187:aload_0         
	//*  84  188:getfield        #365 <Field int x>
	//*  85  191:invokevirtual   #405 <Method boolean CoordinatorLayout.a(View, int, int)>
	//*  86  194:ifne            203
			flag1 = true;
	//   87  197:iconst_1        
	//   88  198:istore          6
		else
	//*  89  200:goto            206
			flag1 = false;
	//   90  203:iconst_0        
	//   91  204:istore          6
		s = flag1;
	//   92  206:aload_0         
	//   93  207:iload           6
	//   94  209:putfield        #363 <Field boolean s>
		break; /* Loop/switch isn't completed */
	//   95  212:goto            239
_L2:
		k = false;
	//   96  215:aload_0         
	//   97  216:iconst_0        
	//   98  217:putfield        #407 <Field boolean k>
		j = -1;
	//   99  220:aload_0         
	//  100  221:iconst_m1       
	//  101  222:putfield        #145 <Field int j>
		if(s)
	//* 102  225:aload_0         
	//* 103  226:getfield        #363 <Field boolean s>
	//* 104  229:ifeq            239
		{
			s = false;
	//  105  232:aload_0         
	//  106  233:iconst_0        
	//  107  234:putfield        #363 <Field boolean s>
			return false;
	//  108  237:iconst_0        
	//  109  238:ireturn         
		}
		if(!s)
	//* 110  239:aload_0         
	//* 111  240:getfield        #363 <Field boolean s>
	//* 112  243:ifne            265
		{
			view = ((View) (f));
	//  113  246:aload_0         
	//  114  247:getfield        #276 <Field al f>
	//  115  250:astore_2        
			if(view != null && ((al) (view)).a(motionevent))
	//* 116  251:aload_2         
	//* 117  252:ifnull          265
	//* 118  255:aload_2         
	//* 119  256:aload_3         
	//* 120  257:invokevirtual   #410 <Method boolean al.a(MotionEvent)>
	//* 121  260:ifeq            265
				return true;
	//  122  263:iconst_1        
	//  123  264:ireturn         
		}
		WeakReference weakreference = i;
	//  124  265:aload_0         
	//  125  266:getfield        #257 <Field WeakReference i>
	//  126  269:astore          8
		view = ((View) (obj1));
	//  127  271:aload           9
	//  128  273:astore_2        
		if(weakreference != null)
	//* 129  274:aload           8
	//* 130  276:ifnull          288
			view = (View)weakreference.get();
	//  131  279:aload           8
	//  132  281:invokevirtual   #166 <Method Object WeakReference.get()>
	//  133  284:checkcast       #168 <Class View>
	//  134  287:astore_2        
		boolean flag2 = flag3;
	//  135  288:iload           7
	//  136  290:istore          6
		if(i1 == 2)
	//* 137  292:iload           4
	//* 138  294:iconst_2        
	//* 139  295:icmpne          394
		{
			flag2 = flag3;
	//  140  298:iload           7
	//  141  300:istore          6
			if(view != null)
	//* 142  302:aload_2         
	//* 143  303:ifnull          394
			{
				flag2 = flag3;
	//  144  306:iload           7
	//  145  308:istore          6
				if(!s)
	//* 146  310:aload_0         
	//* 147  311:getfield        #363 <Field boolean s>
	//* 148  314:ifne            394
				{
					flag2 = flag3;
	//  149  317:iload           7
	//  150  319:istore          6
					if(e != 1)
	//* 151  321:aload_0         
	//* 152  322:getfield        #47  <Field int e>
	//* 153  325:iconst_1        
	//* 154  326:icmpeq          394
					{
						flag2 = flag3;
	//  155  329:iload           7
	//  156  331:istore          6
						if(!coordinatorlayout.a(view, (int)motionevent.getX(), (int)motionevent.getY()))
	//* 157  333:aload_1         
	//* 158  334:aload_2         
	//* 159  335:aload_3         
	//* 160  336:invokevirtual   #404 <Method float MotionEvent.getX()>
	//* 161  339:f2i             
	//* 162  340:aload_3         
	//* 163  341:invokevirtual   #368 <Method float MotionEvent.getY()>
	//* 164  344:f2i             
	//* 165  345:invokevirtual   #405 <Method boolean CoordinatorLayout.a(View, int, int)>
	//* 166  348:ifne            394
						{
							flag2 = flag3;
	//  167  351:iload           7
	//  168  353:istore          6
							if(f != null)
	//* 169  355:aload_0         
	//* 170  356:getfield        #276 <Field al f>
	//* 171  359:ifnull          394
							{
								flag2 = flag3;
	//  172  362:iload           7
	//  173  364:istore          6
								if(Math.abs((float)x - motionevent.getY()) > (float)f.d())
	//* 174  366:aload_0         
	//* 175  367:getfield        #365 <Field int x>
	//* 176  370:i2f             
	//* 177  371:aload_3         
	//* 178  372:invokevirtual   #368 <Method float MotionEvent.getY()>
	//* 179  375:fsub            
	//* 180  376:invokestatic    #371 <Method float Math.abs(float)>
	//* 181  379:aload_0         
	//* 182  380:getfield        #276 <Field al f>
	//* 183  383:invokevirtual   #373 <Method int al.d()>
	//* 184  386:i2f             
	//* 185  387:fcmpl           
	//* 186  388:ifle            394
									flag2 = true;
	//  187  391:iconst_1        
	//  188  392:istore          6
							}
						}
					}
				}
			}
		}
		return flag2;
	//  189  394:iload           6
	//  190  396:ireturn         
	}

	void c(int i1)
	{
		View view = (View)h.get();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field WeakReference h>
	//    2    4:invokevirtual   #166 <Method Object WeakReference.get()>
	//    3    7:checkcast       #168 <Class View>
	//    4   10:astore_3        
		if(view != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          73
		{
			y y1 = v;
	//    7   15:aload_0         
	//    8   16:getfield        #398 <Field y v>
	//    9   19:astore          4
			if(y1 != null)
	//*  10   21:aload           4
	//*  11   23:ifnull          73
			{
				int j1 = c;
	//   12   26:aload_0         
	//   13   27:getfield        #139 <Field int c>
	//   14   30:istore_2        
				if(i1 > j1)
	//*  15   31:iload_1         
	//*  16   32:iload_2         
	//*  17   33:icmple          55
				{
					y1.a(view, (float)(j1 - i1) / (float)(g - j1));
	//   18   36:aload           4
	//   19   38:aload_3         
	//   20   39:iload_2         
	//   21   40:iload_1         
	//   22   41:isub            
	//   23   42:i2f             
	//   24   43:aload_0         
	//   25   44:getfield        #128 <Field int g>
	//   26   47:iload_2         
	//   27   48:isub            
	//   28   49:i2f             
	//   29   50:fdiv            
	//   30   51:invokevirtual   #413 <Method void y.a(View, float)>
					return;
	//   31   54:return          
				}
				y1.a(view, (float)(j1 - i1) / (float)(j1 - e()));
	//   32   55:aload           4
	//   33   57:aload_3         
	//   34   58:iload_2         
	//   35   59:iload_1         
	//   36   60:isub            
	//   37   61:i2f             
	//   38   62:iload_2         
	//   39   63:aload_0         
	//   40   64:invokespecial   #143 <Method int e()>
	//   41   67:isub            
	//   42   68:i2f             
	//   43   69:fdiv            
	//   44   70:invokevirtual   #413 <Method void y.a(View, float)>
			}
		}
	//   45   73:return          
	}

	public void c(boolean flag)
	{
		r = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #386 <Field boolean r>
	//    3    5:return          
	}

	int a;
	int b;
	int c;
	boolean d;
	int e;
	al f;
	int g;
	WeakReference h;
	WeakReference i;
	int j;
	boolean k;
	private boolean l;
	private float m;
	private int n;
	private boolean o;
	private int p;
	private int q;
	private boolean r;
	private boolean s;
	private int t;
	private boolean u;
	private y v;
	private VelocityTracker w;
	private int x;
	private Map y;
	private final ao z;

	private class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i1)
		{
			super.writeToParcel(parcel, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #29  <Field int a>
		//    7   11:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new z();
		final int a;

		static 
		{
		//    0    0:new             #12  <Class z>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void z()>
		//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #27  <Method int Parcel.readInt()>
		//    7   11:putfield        #29  <Field int a>
		//    8   14:return          
		}

		public SavedState(Parcelable parcelable, int i1)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #33  <Method void AbsSavedState(Parcelable)>
			a = i1;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #29  <Field int a>
		//    6   10:return          
		}
	}

}
