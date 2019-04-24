// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class ListViewCompat extends ListView
{
	private static class a extends android.support.v7.d.a.a
	{

		void a(boolean flag)
		{
			a = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #14  <Field boolean a>
		//    3    5:return          
		}

		public void draw(Canvas canvas)
		{
			if(a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field boolean a>
		//*   2    4:ifeq            12
				super.draw(canvas);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #20  <Method void android.support.v7.d.a.a.draw(Canvas)>
		//    6   12:return          
		}

		public void setHotspot(float f1, float f2)
		{
			if(a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field boolean a>
		//*   2    4:ifeq            13
				super.setHotspot(f1, f2);
		//    3    7:aload_0         
		//    4    8:fload_1         
		//    5    9:fload_2         
		//    6   10:invokespecial   #24  <Method void android.support.v7.d.a.a.setHotspot(float, float)>
		//    7   13:return          
		}

		public void setHotspotBounds(int j, int k, int l, int i1)
		{
			if(a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field boolean a>
		//*   2    4:ifeq            16
				super.setHotspotBounds(j, k, l, i1);
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:iload_3         
		//    7   11:iload           4
		//    8   13:invokespecial   #28  <Method void android.support.v7.d.a.a.setHotspotBounds(int, int, int, int)>
		//    9   16:return          
		}

		public boolean setState(int ai[])
		{
			if(a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field boolean a>
		//*   2    4:ifeq            13
				return super.setState(ai);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #32  <Method boolean android.support.v7.d.a.a.setState(int[])>
		//    6   12:ireturn         
			else
				return false;
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public boolean setVisible(boolean flag, boolean flag1)
		{
			if(a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field boolean a>
		//*   2    4:ifeq            14
				return super.setVisible(flag, flag1);
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:invokespecial   #36  <Method boolean android.support.v7.d.a.a.setVisible(boolean, boolean)>
		//    7   13:ireturn         
			else
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		private boolean a;

		public a(Drawable drawable)
		{
			super(drawable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void android.support.v7.d.a.a(Drawable)>
			a = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #14  <Field boolean a>
		//    6   10:return          
		}
	}


	public ListViewCompat(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #30  <Method void ListViewCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	public ListViewCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #33  <Method void ListViewCompat(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ListViewCompat(Context context, AttributeSet attributeset, int j)
	{
		super(context, attributeset, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #36  <Method void ListView(Context, AttributeSet, int)>
		a = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #38  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #40  <Method void Rect()>
	//    9   15:putfield        #42  <Field Rect a>
		b = 0;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #44  <Field int b>
		c = 0;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #46  <Field int c>
		d = 0;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #48  <Field int d>
		e = 0;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #50  <Field int e>
		try
		{
			h = ((Class) (android/widget/AbsListView)).getDeclaredField("mIsChildViewEnabled");
	//   22   38:aload_0         
	//   23   39:ldc1            #52  <Class AbsListView>
	//   24   41:ldc1            #54  <String "mIsChildViewEnabled">
	//   25   43:invokevirtual   #60  <Method Field Class.getDeclaredField(String)>
	//   26   46:putfield        #62  <Field Field h>
			h.setAccessible(true);
	//   27   49:aload_0         
	//   28   50:getfield        #62  <Field Field h>
	//   29   53:iconst_1        
	//   30   54:invokevirtual   #68  <Method void Field.setAccessible(boolean)>
			return;
	//   31   57:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  32   58:astore_1        
		{
			((NoSuchFieldException) (context)).printStackTrace();
	//   33   59:aload_1         
	//   34   60:invokevirtual   #71  <Method void NoSuchFieldException.printStackTrace()>
		}
	//   35   63:return          
	}

	public int a(int j, int k, int l, int i1, int j1)
	{
		k = getListPaddingTop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method int getListPaddingTop()>
	//    2    4:istore_2        
		l = getListPaddingBottom();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #79  <Method int getListPaddingBottom()>
	//    5    9:istore_3        
		getListPaddingLeft();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #82  <Method int getListPaddingLeft()>
	//    8   14:pop             
		getListPaddingRight();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #85  <Method int getListPaddingRight()>
	//   11   19:pop             
		int k1 = getDividerHeight();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #88  <Method int getDividerHeight()>
	//   14   24:istore          6
		Object obj = ((Object) (getDivider()));
	//   15   26:aload_0         
	//   16   27:invokevirtual   #92  <Method Drawable getDivider()>
	//   17   30:astore          12
		ListAdapter listadapter = getAdapter();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #96  <Method ListAdapter getAdapter()>
	//   20   36:astore          15
		if(listadapter == null)
	//*  21   38:aload           15
	//*  22   40:ifnonnull       47
			return k + l;
	//   23   43:iload_2         
	//   24   44:iload_3         
	//   25   45:iadd            
	//   26   46:ireturn         
		if(k1 <= 0 || obj == null)
	//*  27   47:iload           6
	//*  28   49:ifle            60
	//*  29   52:aload           12
	//*  30   54:ifnull          60
	//*  31   57:goto            63
			k1 = 0;
	//   32   60:iconst_0        
	//   33   61:istore          6
		int l2 = listadapter.getCount();
	//   34   63:aload           15
	//   35   65:invokeinterface #101 <Method int ListAdapter.getCount()>
	//   36   70:istore          11
		l = k + l;
	//   37   72:iload_2         
	//   38   73:iload_3         
	//   39   74:iadd            
	//   40   75:istore_3        
		obj = null;
	//   41   76:aconst_null     
	//   42   77:astore          12
		int l1 = 0;
	//   43   79:iconst_0        
	//   44   80:istore          7
		int j2 = 0;
	//   45   82:iconst_0        
	//   46   83:istore          9
		int k2;
		for(k = 0; l1 < l2; k = k2)
	//*  47   85:iconst_0        
	//*  48   86:istore_2        
	//*  49   87:iload           7
	//*  50   89:iload           11
	//*  51   91:icmpge          317
		{
			k2 = listadapter.getItemViewType(l1);
	//   52   94:aload           15
	//   53   96:iload           7
	//   54   98:invokeinterface #105 <Method int ListAdapter.getItemViewType(int)>
	//   55  103:istore          10
			int i2 = j2;
	//   56  105:iload           9
	//   57  107:istore          8
			if(k2 != j2)
	//*  58  109:iload           10
	//*  59  111:iload           9
	//*  60  113:icmpeq          123
			{
				obj = null;
	//   61  116:aconst_null     
	//   62  117:astore          12
				i2 = k2;
	//   63  119:iload           10
	//   64  121:istore          8
			}
			View view = listadapter.getView(l1, ((View) (obj)), ((android.view.ViewGroup) (this)));
	//   65  123:aload           15
	//   66  125:iload           7
	//   67  127:aload           12
	//   68  129:aload_0         
	//   69  130:invokeinterface #109 <Method View ListAdapter.getView(int, View, android.view.ViewGroup)>
	//   70  135:astore          13
			android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//   71  137:aload           13
	//   72  139:invokevirtual   #115 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   73  142:astore          14
			obj = ((Object) (layoutparams));
	//   74  144:aload           14
	//   75  146:astore          12
			if(layoutparams == null)
	//*  76  148:aload           14
	//*  77  150:ifnonnull       166
			{
				obj = ((Object) (generateDefaultLayoutParams()));
	//   78  153:aload_0         
	//   79  154:invokevirtual   #118 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//   80  157:astore          12
				view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   81  159:aload           13
	//   82  161:aload           12
	//   83  163:invokevirtual   #122 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
			if(((android.view.ViewGroup.LayoutParams) (obj)).height > 0)
	//*  84  166:aload           12
	//*  85  168:getfield        #127 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  86  171:ifle            189
				j2 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj)).height, 0x40000000);
	//   87  174:aload           12
	//   88  176:getfield        #127 <Field int android.view.ViewGroup$LayoutParams.height>
	//   89  179:ldc1            #128 <Int 0x40000000>
	//   90  181:invokestatic    #134 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   91  184:istore          9
			else
	//*  92  186:goto            196
				j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   93  189:iconst_0        
	//   94  190:iconst_0        
	//   95  191:invokestatic    #134 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   96  194:istore          9
			view.measure(j, j2);
	//   97  196:aload           13
	//   98  198:iload_1         
	//   99  199:iload           9
	//  100  201:invokevirtual   #138 <Method void View.measure(int, int)>
			view.forceLayout();
	//  101  204:aload           13
	//  102  206:invokevirtual   #141 <Method void View.forceLayout()>
			j2 = l;
	//  103  209:iload_3         
	//  104  210:istore          9
			if(l1 > 0)
	//* 105  212:iload           7
	//* 106  214:ifle            223
				j2 = l + k1;
	//  107  217:iload_3         
	//  108  218:iload           6
	//  109  220:iadd            
	//  110  221:istore          9
			l = j2 + view.getMeasuredHeight();
	//  111  223:iload           9
	//  112  225:aload           13
	//  113  227:invokevirtual   #144 <Method int View.getMeasuredHeight()>
	//  114  230:iadd            
	//  115  231:istore_3        
			if(l >= i1)
	//* 116  232:iload_3         
	//* 117  233:iload           4
	//* 118  235:icmplt          276
			{
				j = i1;
	//  119  238:iload           4
	//  120  240:istore_1        
				if(j1 >= 0)
	//* 121  241:iload           5
	//* 122  243:iflt            274
				{
					j = i1;
	//  123  246:iload           4
	//  124  248:istore_1        
					if(l1 > j1)
	//* 125  249:iload           7
	//* 126  251:iload           5
	//* 127  253:icmple          274
					{
						j = i1;
	//  128  256:iload           4
	//  129  258:istore_1        
						if(k > 0)
	//* 130  259:iload_2         
	//* 131  260:ifle            274
						{
							j = i1;
	//  132  263:iload           4
	//  133  265:istore_1        
							if(l != i1)
	//* 134  266:iload_3         
	//* 135  267:iload           4
	//* 136  269:icmpeq          274
								j = k;
	//  137  272:iload_2         
	//  138  273:istore_1        
						}
					}
				}
				return j;
	//  139  274:iload_1         
	//  140  275:ireturn         
			}
			k2 = k;
	//  141  276:iload_2         
	//  142  277:istore          10
			if(j1 >= 0)
	//* 143  279:iload           5
	//* 144  281:iflt            297
			{
				k2 = k;
	//  145  284:iload_2         
	//  146  285:istore          10
				if(l1 >= j1)
	//* 147  287:iload           7
	//* 148  289:iload           5
	//* 149  291:icmplt          297
					k2 = l;
	//  150  294:iload_3         
	//  151  295:istore          10
			}
			l1++;
	//  152  297:iload           7
	//  153  299:iconst_1        
	//  154  300:iadd            
	//  155  301:istore          7
			j2 = i2;
	//  156  303:iload           8
	//  157  305:istore          9
			obj = ((Object) (view));
	//  158  307:aload           13
	//  159  309:astore          12
		}

	//  160  311:iload           10
	//  161  313:istore_2        
	//* 162  314:goto            87
		return l;
	//  163  317:iload_3         
	//  164  318:ireturn         
	}

	protected void a(int j, View view)
	{
		Drawable drawable = getSelector();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #148 <Method Drawable getSelector()>
	//    2    4:astore          7
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		boolean flag;
		if(drawable != null && j != -1)
	//*   5    9:aload           7
	//*   6   11:ifnull          25
	//*   7   14:iload_1         
	//*   8   15:iconst_m1       
	//*   9   16:icmpeq          25
			flag = true;
	//   10   19:iconst_1        
	//   11   20:istore          5
		else
	//*  12   22:goto            28
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore          5
		if(flag)
	//*  15   28:iload           5
	//*  16   30:ifeq            41
			drawable.setVisible(false, false);
	//   17   33:aload           7
	//   18   35:iconst_0        
	//   19   36:iconst_0        
	//   20   37:invokevirtual   #154 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   21   40:pop             
		b(j, view);
	//   22   41:aload_0         
	//   23   42:iload_1         
	//   24   43:aload_2         
	//   25   44:invokevirtual   #156 <Method void b(int, View)>
		if(flag)
	//*  26   47:iload           5
	//*  27   49:ifeq            98
		{
			view = ((View) (a));
	//   28   52:aload_0         
	//   29   53:getfield        #42  <Field Rect a>
	//   30   56:astore_2        
			float f1 = ((Rect) (view)).exactCenterX();
	//   31   57:aload_2         
	//   32   58:invokevirtual   #160 <Method float Rect.exactCenterX()>
	//   33   61:fstore_3        
			float f2 = ((Rect) (view)).exactCenterY();
	//   34   62:aload_2         
	//   35   63:invokevirtual   #163 <Method float Rect.exactCenterY()>
	//   36   66:fstore          4
			if(getVisibility() != 0)
	//*  37   68:aload_0         
	//*  38   69:invokevirtual   #166 <Method int getVisibility()>
	//*  39   72:ifne            78
	//*  40   75:goto            81
				flag1 = false;
	//   41   78:iconst_0        
	//   42   79:istore          6
			drawable.setVisible(flag1, false);
	//   43   81:aload           7
	//   44   83:iload           6
	//   45   85:iconst_0        
	//   46   86:invokevirtual   #154 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   47   89:pop             
			android.support.v4.a.a.a.a(drawable, f1, f2);
	//   48   90:aload           7
	//   49   92:fload_3         
	//   50   93:fload           4
	//   51   95:invokestatic    #171 <Method void a.a(Drawable, float, float)>
		}
	//   52   98:return          
	}

	protected void a(int j, View view, float f1, float f2)
	{
		a(j, view);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #174 <Method void a(int, View)>
		view = ((View) (getSelector()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #148 <Method Drawable getSelector()>
	//    6   10:astore_2        
		if(view != null && j != -1)
	//*   7   11:aload_2         
	//*   8   12:ifnull          27
	//*   9   15:iload_1         
	//*  10   16:iconst_m1       
	//*  11   17:icmpeq          27
			android.support.v4.a.a.a.a(((Drawable) (view)), f1, f2);
	//   12   20:aload_2         
	//   13   21:fload_3         
	//   14   22:fload           4
	//   15   24:invokestatic    #171 <Method void a.a(Drawable, float, float)>
	//   16   27:return          
	}

	protected void a(Canvas canvas)
	{
		if(!a.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Rect a>
	//*   2    4:invokevirtual   #179 <Method boolean Rect.isEmpty()>
	//*   3    7:ifne            32
		{
			Drawable drawable = getSelector();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #148 <Method Drawable getSelector()>
	//    6   14:astore_2        
			if(drawable != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          32
			{
				drawable.setBounds(a);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:getfield        #42  <Field Rect a>
	//   12   24:invokevirtual   #183 <Method void Drawable.setBounds(Rect)>
				drawable.draw(canvas);
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #186 <Method void Drawable.draw(Canvas)>
			}
		}
	//   16   32:return          
	}

	protected boolean a()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void b()
	{
		Drawable drawable = getSelector();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #148 <Method Drawable getSelector()>
	//    2    4:astore_1        
		if(drawable != null && c())
	//*   3    5:aload_1         
	//*   4    6:ifnull          25
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #188 <Method boolean c()>
	//*   7   13:ifeq            25
			drawable.setState(getDrawableState());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #192 <Method int[] getDrawableState()>
	//   11   21:invokevirtual   #196 <Method boolean Drawable.setState(int[])>
	//   12   24:pop             
	//   13   25:return          
	}

	protected void b(int j, View view)
	{
		Rect rect = a;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Rect a>
	//    2    4:astore          4
		rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//    3    6:aload           4
	//    4    8:aload_2         
	//    5    9:invokevirtual   #201 <Method int View.getLeft()>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #204 <Method int View.getTop()>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #207 <Method int View.getRight()>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #210 <Method int View.getBottom()>
	//   12   24:invokevirtual   #214 <Method void Rect.set(int, int, int, int)>
		rect.left = rect.left - b;
	//   13   27:aload           4
	//   14   29:aload           4
	//   15   31:getfield        #217 <Field int Rect.left>
	//   16   34:aload_0         
	//   17   35:getfield        #44  <Field int b>
	//   18   38:isub            
	//   19   39:putfield        #217 <Field int Rect.left>
		rect.top = rect.top - c;
	//   20   42:aload           4
	//   21   44:aload           4
	//   22   46:getfield        #220 <Field int Rect.top>
	//   23   49:aload_0         
	//   24   50:getfield        #46  <Field int c>
	//   25   53:isub            
	//   26   54:putfield        #220 <Field int Rect.top>
		rect.right = rect.right + d;
	//   27   57:aload           4
	//   28   59:aload           4
	//   29   61:getfield        #223 <Field int Rect.right>
	//   30   64:aload_0         
	//   31   65:getfield        #48  <Field int d>
	//   32   68:iadd            
	//   33   69:putfield        #223 <Field int Rect.right>
		rect.bottom = rect.bottom + e;
	//   34   72:aload           4
	//   35   74:aload           4
	//   36   76:getfield        #226 <Field int Rect.bottom>
	//   37   79:aload_0         
	//   38   80:getfield        #50  <Field int e>
	//   39   83:iadd            
	//   40   84:putfield        #226 <Field int Rect.bottom>
		boolean flag = h.getBoolean(((Object) (this)));
	//   41   87:aload_0         
	//   42   88:getfield        #62  <Field Field h>
	//   43   91:aload_0         
	//   44   92:invokevirtual   #230 <Method boolean Field.getBoolean(Object)>
	//   45   95:istore_3        
		if(view.isEnabled() == flag)
			break MISSING_BLOCK_LABEL_133;
	//   46   96:aload_2         
	//   47   97:invokevirtual   #233 <Method boolean View.isEnabled()>
	//   48  100:iload_3         
	//   49  101:icmpeq          133
		h.set(((Object) (this)), ((Object) (Boolean.valueOf(flag ^ true))));
	//   50  104:aload_0         
	//   51  105:getfield        #62  <Field Field h>
	//   52  108:aload_0         
	//   53  109:iload_3         
	//   54  110:iconst_1        
	//   55  111:ixor            
	//   56  112:invokestatic    #239 <Method Boolean Boolean.valueOf(boolean)>
	//   57  115:invokevirtual   #242 <Method void Field.set(Object, Object)>
		if(j != -1)
	//*  58  118:iload_1         
	//*  59  119:iconst_m1       
	//*  60  120:icmpeq          133
			try
			{
				refreshDrawableState();
	//   61  123:aload_0         
	//   62  124:invokevirtual   #245 <Method void refreshDrawableState()>
				return;
	//   63  127:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  64  128:astore_2        
			{
				((IllegalAccessException) (view)).printStackTrace();
	//   65  129:aload_2         
	//   66  130:invokevirtual   #246 <Method void IllegalAccessException.printStackTrace()>
			}
	//   67  133:return          
	}

	protected boolean c()
	{
		return a() && isPressed();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #248 <Method boolean a()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:invokevirtual   #251 <Method boolean isPressed()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	protected void dispatchDraw(Canvas canvas)
	{
		a(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #254 <Method void a(Canvas)>
		super.dispatchDraw(canvas);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #256 <Method void ListView.dispatchDraw(Canvas)>
	//    6   10:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #259 <Method void ListView.drawableStateChanged()>
		setSelectorEnabled(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #262 <Method void setSelectorEnabled(boolean)>
		b();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #264 <Method void b()>
	//    7   13:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #271 <Method int MotionEvent.getAction()>
	//*   2    4:ifeq            10
	//*   3    7:goto            28
			f = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #274 <Method float MotionEvent.getX()>
	//    8   16:f2i             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #277 <Method float MotionEvent.getY()>
	//   11   21:f2i             
	//   12   22:invokevirtual   #280 <Method int pointToPosition(int, int)>
	//   13   25:putfield        #282 <Field int f>
		return super.onTouchEvent(motionevent);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokespecial   #284 <Method boolean ListView.onTouchEvent(MotionEvent)>
	//   17   33:ireturn         
	}

	public void setSelector(Drawable drawable)
	{
		Object obj;
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
			obj = ((Object) (new a(drawable)));
	//    2    4:new             #6   <Class ListViewCompat$a>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #288 <Method void ListViewCompat$a(Drawable)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		i = ((a) (obj));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #290 <Field ListViewCompat$a i>
		super.setSelector(((Drawable) (i)));
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #290 <Field ListViewCompat$a i>
	//   16   28:invokespecial   #292 <Method void ListView.setSelector(Drawable)>
		obj = ((Object) (new Rect()));
	//   17   31:new             #38  <Class Rect>
	//   18   34:dup             
	//   19   35:invokespecial   #40  <Method void Rect()>
	//   20   38:astore_2        
		if(drawable != null)
	//*  21   39:aload_1         
	//*  22   40:ifnull          49
			drawable.getPadding(((Rect) (obj)));
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:invokevirtual   #296 <Method boolean Drawable.getPadding(Rect)>
	//   26   48:pop             
		b = ((Rect) (obj)).left;
	//   27   49:aload_0         
	//   28   50:aload_2         
	//   29   51:getfield        #217 <Field int Rect.left>
	//   30   54:putfield        #44  <Field int b>
		c = ((Rect) (obj)).top;
	//   31   57:aload_0         
	//   32   58:aload_2         
	//   33   59:getfield        #220 <Field int Rect.top>
	//   34   62:putfield        #46  <Field int c>
		d = ((Rect) (obj)).right;
	//   35   65:aload_0         
	//   36   66:aload_2         
	//   37   67:getfield        #223 <Field int Rect.right>
	//   38   70:putfield        #48  <Field int d>
		e = ((Rect) (obj)).bottom;
	//   39   73:aload_0         
	//   40   74:aload_2         
	//   41   75:getfield        #226 <Field int Rect.bottom>
	//   42   78:putfield        #50  <Field int e>
	//   43   81:return          
	}

	protected void setSelectorEnabled(boolean flag)
	{
		if(i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #290 <Field ListViewCompat$a i>
	//*   2    4:ifnull          15
			i.a(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #290 <Field ListViewCompat$a i>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #298 <Method void android.support.v7.widget.ListViewCompat$a.a(boolean)>
	//    7   15:return          
	}

	private static final int g[] = {
		0
	};
	final Rect a;
	int b;
	int c;
	int d;
	int e;
	protected int f;
	private Field h;
	private a i;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_0        
	//    5    6:iastore         
	//    6    7:putstatic       #24  <Field int[] g>
	//*   7   10:return          
	}
}
