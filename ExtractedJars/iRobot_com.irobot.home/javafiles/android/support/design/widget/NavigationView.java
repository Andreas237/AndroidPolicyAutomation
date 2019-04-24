// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.design.internal.b;
import android.support.design.internal.c;
import android.support.v4.content.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.aa;
import android.support.v4.view.s;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.widget.av;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			n

public class NavigationView extends ScrimInsetsFrameLayout
{
	public static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int k)
		{
			super.writeToParcel(parcel, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #40  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeBundle(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field Bundle a>
		//    7   11:invokevirtual   #44  <Method void Parcel.writeBundle(Bundle)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState a(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class NavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void NavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class NavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void NavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState[] a(int k)
			{
				return new SavedState[k];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #28  <Method NavigationView$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method NavigationView$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int k)
			{
				return ((Object []) (a(k)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method NavigationView$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		public Bundle a;

		static 
		{
		//    0    0:new             #9   <Class NavigationView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void NavigationView$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = parcel.readBundle(classloader);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokevirtual   #31  <Method Bundle Parcel.readBundle(ClassLoader)>
		//    8   12:putfield        #33  <Field Bundle a>
		//    9   15:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static interface a
	{

		public abstract boolean a(MenuItem menuitem);
	}


	public NavigationView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #41  <Method void NavigationView(Context, AttributeSet)>
	//    4    6:return          
	}

	public NavigationView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #44  <Method void NavigationView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NavigationView(Context context, AttributeSet attributeset, int k)
	{
		super(context, attributeset, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #45  <Method void ScrimInsetsFrameLayout(Context, AttributeSet, int)>
		g = new c();
	//    5    7:aload_0         
	//    6    8:new             #47  <Class c>
	//    7   11:dup             
	//    8   12:invokespecial   #49  <Method void c()>
	//    9   15:putfield        #51  <Field c g>
		android.support.design.widget.n.a(context);
	//   10   18:aload_1         
	//   11   19:invokestatic    #55  <Method void android.support.design.widget.n.a(Context)>
		f = new b(context);
	//   12   22:aload_0         
	//   13   23:new             #57  <Class b>
	//   14   26:dup             
	//   15   27:aload_1         
	//   16   28:invokespecial   #59  <Method void b(Context)>
	//   17   31:putfield        #61  <Field b f>
		av av1 = av.a(context, attributeset, android.support.design.a.k.NavigationView, k, android.support.design.a.j.Widget_Design_NavigationView);
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:getstatic       #66  <Field int[] android.support.design.a$k.NavigationView>
	//   21   39:iload_3         
	//   22   40:getstatic       #71  <Field int android.support.design.a$j.Widget_Design_NavigationView>
	//   23   43:invokestatic    #76  <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   24   46:astore          7
		s.a(((View) (this)), av1.a(android.support.design.a.k.NavigationView_android_background));
	//   25   48:aload_0         
	//   26   49:aload           7
	//   27   51:getstatic       #79  <Field int android.support.design.a$k.NavigationView_android_background>
	//   28   54:invokevirtual   #82  <Method Drawable av.a(int)>
	//   29   57:invokestatic    #87  <Method void s.a(View, Drawable)>
		if(av1.g(android.support.design.a.k.NavigationView_elevation))
	//*  30   60:aload           7
	//*  31   62:getstatic       #90  <Field int android.support.design.a$k.NavigationView_elevation>
	//*  32   65:invokevirtual   #93  <Method boolean av.g(int)>
	//*  33   68:ifeq            85
			s.a(((View) (this)), av1.e(android.support.design.a.k.NavigationView_elevation, 0));
	//   34   71:aload_0         
	//   35   72:aload           7
	//   36   74:getstatic       #90  <Field int android.support.design.a$k.NavigationView_elevation>
	//   37   77:iconst_0        
	//   38   78:invokevirtual   #96  <Method int av.e(int, int)>
	//   39   81:i2f             
	//   40   82:invokestatic    #99  <Method void s.a(View, float)>
		s.b(((View) (this)), av1.a(android.support.design.a.k.NavigationView_android_fitsSystemWindows, false));
	//   41   85:aload_0         
	//   42   86:aload           7
	//   43   88:getstatic       #102 <Field int android.support.design.a$k.NavigationView_android_fitsSystemWindows>
	//   44   91:iconst_0        
	//   45   92:invokevirtual   #105 <Method boolean av.a(int, boolean)>
	//   46   95:invokestatic    #109 <Method void s.b(View, boolean)>
		h = av1.e(android.support.design.a.k.NavigationView_android_maxWidth, 0);
	//   47   98:aload_0         
	//   48   99:aload           7
	//   49  101:getstatic       #112 <Field int android.support.design.a$k.NavigationView_android_maxWidth>
	//   50  104:iconst_0        
	//   51  105:invokevirtual   #96  <Method int av.e(int, int)>
	//   52  108:putfield        #114 <Field int h>
		ColorStateList colorstatelist;
		if(av1.g(android.support.design.a.k.NavigationView_itemIconTint))
	//*  53  111:aload           7
	//*  54  113:getstatic       #117 <Field int android.support.design.a$k.NavigationView_itemIconTint>
	//*  55  116:invokevirtual   #93  <Method boolean av.g(int)>
	//*  56  119:ifeq            135
			colorstatelist = av1.e(android.support.design.a.k.NavigationView_itemIconTint);
	//   57  122:aload           7
	//   58  124:getstatic       #117 <Field int android.support.design.a$k.NavigationView_itemIconTint>
	//   59  127:invokevirtual   #120 <Method ColorStateList av.e(int)>
	//   60  130:astore          5
		else
	//*  61  132:goto            143
			colorstatelist = c(0x1010038);
	//   62  135:aload_0         
	//   63  136:ldc1            #121 <Int 0x1010038>
	//   64  138:invokespecial   #123 <Method ColorStateList c(int)>
	//   65  141:astore          5
		int l;
		if(av1.g(android.support.design.a.k.NavigationView_itemTextAppearance))
	//*  66  143:aload           7
	//*  67  145:getstatic       #126 <Field int android.support.design.a$k.NavigationView_itemTextAppearance>
	//*  68  148:invokevirtual   #93  <Method boolean av.g(int)>
	//*  69  151:ifeq            170
		{
			l = av1.g(android.support.design.a.k.NavigationView_itemTextAppearance, 0);
	//   70  154:aload           7
	//   71  156:getstatic       #126 <Field int android.support.design.a$k.NavigationView_itemTextAppearance>
	//   72  159:iconst_0        
	//   73  160:invokevirtual   #128 <Method int av.g(int, int)>
	//   74  163:istore          4
			k = 1;
	//   75  165:iconst_1        
	//   76  166:istore_3        
		} else
	//*  77  167:goto            175
		{
			k = 0;
	//   78  170:iconst_0        
	//   79  171:istore_3        
			l = 0;
	//   80  172:iconst_0        
	//   81  173:istore          4
		}
		attributeset = null;
	//   82  175:aconst_null     
	//   83  176:astore_2        
		if(av1.g(android.support.design.a.k.NavigationView_itemTextColor))
	//*  84  177:aload           7
	//*  85  179:getstatic       #131 <Field int android.support.design.a$k.NavigationView_itemTextColor>
	//*  86  182:invokevirtual   #93  <Method boolean av.g(int)>
	//*  87  185:ifeq            197
			attributeset = ((AttributeSet) (av1.e(android.support.design.a.k.NavigationView_itemTextColor)));
	//   88  188:aload           7
	//   89  190:getstatic       #131 <Field int android.support.design.a$k.NavigationView_itemTextColor>
	//   90  193:invokevirtual   #120 <Method ColorStateList av.e(int)>
	//   91  196:astore_2        
		Object obj = ((Object) (attributeset));
	//   92  197:aload_2         
	//   93  198:astore          6
		if(k == 0)
	//*  94  200:iload_3         
	//*  95  201:ifne            219
		{
			obj = ((Object) (attributeset));
	//   96  204:aload_2         
	//   97  205:astore          6
			if(attributeset == null)
	//*  98  207:aload_2         
	//*  99  208:ifnonnull       219
				obj = ((Object) (c(0x1010036)));
	//  100  211:aload_0         
	//  101  212:ldc1            #132 <Int 0x1010036>
	//  102  214:invokespecial   #123 <Method ColorStateList c(int)>
	//  103  217:astore          6
		}
		attributeset = ((AttributeSet) (av1.a(android.support.design.a.k.NavigationView_itemBackground)));
	//  104  219:aload           7
	//  105  221:getstatic       #135 <Field int android.support.design.a$k.NavigationView_itemBackground>
	//  106  224:invokevirtual   #82  <Method Drawable av.a(int)>
	//  107  227:astore_2        
		f.a(new android.support.v7.view.menu.h.a() {

			public void a(h h1)
			{
			//    0    0:return          
			}

			public boolean a(h h1, MenuItem menuitem)
			{
				return a.c != null && a.c.a(menuitem);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field NavigationView a>
			//    2    4:getfield        #26  <Field NavigationView$a android.support.design.widget.NavigationView.c>
			//    3    7:ifnull          28
			//    4   10:aload_0         
			//    5   11:getfield        #16  <Field NavigationView a>
			//    6   14:getfield        #26  <Field NavigationView$a android.support.design.widget.NavigationView.c>
			//    7   17:aload_2         
			//    8   18:invokeinterface #31  <Method boolean android.support.design.widget.NavigationView$a.a(MenuItem)>
			//    9   23:ifeq            28
			//   10   26:iconst_1        
			//   11   27:ireturn         
			//   12   28:iconst_0        
			//   13   29:ireturn         
			}

			final NavigationView a;

			
			{
				a = NavigationView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field NavigationView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  108  228:aload_0         
	//  109  229:getfield        #61  <Field b f>
	//  110  232:new             #6   <Class NavigationView$1>
	//  111  235:dup             
	//  112  236:aload_0         
	//  113  237:invokespecial   #138 <Method void NavigationView$1(NavigationView)>
	//  114  240:invokevirtual   #141 <Method void b.a(android.support.v7.view.menu.h$a)>
		g.a(1);
	//  115  243:aload_0         
	//  116  244:getfield        #51  <Field c g>
	//  117  247:iconst_1        
	//  118  248:invokevirtual   #144 <Method void c.a(int)>
		g.a(context, ((h) (f)));
	//  119  251:aload_0         
	//  120  252:getfield        #51  <Field c g>
	//  121  255:aload_1         
	//  122  256:aload_0         
	//  123  257:getfield        #61  <Field b f>
	//  124  260:invokevirtual   #147 <Method void c.a(Context, h)>
		g.a(colorstatelist);
	//  125  263:aload_0         
	//  126  264:getfield        #51  <Field c g>
	//  127  267:aload           5
	//  128  269:invokevirtual   #150 <Method void c.a(ColorStateList)>
		if(k != 0)
	//* 129  272:iload_3         
	//* 130  273:ifeq            285
			g.c(l);
	//  131  276:aload_0         
	//  132  277:getfield        #51  <Field c g>
	//  133  280:iload           4
	//  134  282:invokevirtual   #152 <Method void c.c(int)>
		g.b(((ColorStateList) (obj)));
	//  135  285:aload_0         
	//  136  286:getfield        #51  <Field c g>
	//  137  289:aload           6
	//  138  291:invokevirtual   #154 <Method void c.b(ColorStateList)>
		g.a(((Drawable) (attributeset)));
	//  139  294:aload_0         
	//  140  295:getfield        #51  <Field c g>
	//  141  298:aload_2         
	//  142  299:invokevirtual   #157 <Method void c.a(Drawable)>
		f.a(((android.support.v7.view.menu.o) (g)));
	//  143  302:aload_0         
	//  144  303:getfield        #61  <Field b f>
	//  145  306:aload_0         
	//  146  307:getfield        #51  <Field c g>
	//  147  310:invokevirtual   #160 <Method void b.a(android.support.v7.view.menu.o)>
		addView((View)g.a(((android.view.ViewGroup) (this))));
	//  148  313:aload_0         
	//  149  314:aload_0         
	//  150  315:getfield        #51  <Field c g>
	//  151  318:aload_0         
	//  152  319:invokevirtual   #163 <Method android.support.v7.view.menu.p c.a(android.view.ViewGroup)>
	//  153  322:checkcast       #165 <Class View>
	//  154  325:invokevirtual   #169 <Method void addView(View)>
		if(av1.g(android.support.design.a.k.NavigationView_menu))
	//* 155  328:aload           7
	//* 156  330:getstatic       #172 <Field int android.support.design.a$k.NavigationView_menu>
	//* 157  333:invokevirtual   #93  <Method boolean av.g(int)>
	//* 158  336:ifeq            352
			a(av1.g(android.support.design.a.k.NavigationView_menu, 0));
	//  159  339:aload_0         
	//  160  340:aload           7
	//  161  342:getstatic       #172 <Field int android.support.design.a$k.NavigationView_menu>
	//  162  345:iconst_0        
	//  163  346:invokevirtual   #128 <Method int av.g(int, int)>
	//  164  349:invokevirtual   #173 <Method void a(int)>
		if(av1.g(android.support.design.a.k.NavigationView_headerLayout))
	//* 165  352:aload           7
	//* 166  354:getstatic       #176 <Field int android.support.design.a$k.NavigationView_headerLayout>
	//* 167  357:invokevirtual   #93  <Method boolean av.g(int)>
	//* 168  360:ifeq            377
			b(av1.g(android.support.design.a.k.NavigationView_headerLayout, 0));
	//  169  363:aload_0         
	//  170  364:aload           7
	//  171  366:getstatic       #176 <Field int android.support.design.a$k.NavigationView_headerLayout>
	//  172  369:iconst_0        
	//  173  370:invokevirtual   #128 <Method int av.g(int, int)>
	//  174  373:invokevirtual   #179 <Method View b(int)>
	//  175  376:pop             
		av1.a();
	//  176  377:aload           7
	//  177  379:invokevirtual   #181 <Method void av.a()>
	//  178  382:return          
	}

	private ColorStateList c(int k)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #183 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #184 <Method void TypedValue()>
	//    3    7:astore          5
		if(!getContext().getTheme().resolveAttribute(k, typedvalue, true))
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #188 <Method Context getContext()>
	//*   6   13:invokevirtual   #194 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   7   16:iload_1         
	//*   8   17:aload           5
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #200 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  11   23:ifne            28
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		ColorStateList colorstatelist = android.support.v7.c.a.b.a(getContext(), typedvalue.resourceId);
	//   14   28:aload_0         
	//   15   29:invokevirtual   #188 <Method Context getContext()>
	//   16   32:aload           5
	//   17   34:getfield        #203 <Field int TypedValue.resourceId>
	//   18   37:invokestatic    #208 <Method ColorStateList android.support.v7.c.a.b.a(Context, int)>
	//   19   40:astore          4
		if(!getContext().getTheme().resolveAttribute(android.support.v7.a.a.a.colorPrimary, typedvalue, true))
	//*  20   42:aload_0         
	//*  21   43:invokevirtual   #188 <Method Context getContext()>
	//*  22   46:invokevirtual   #194 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  23   49:getstatic       #213 <Field int android.support.v7.a.a$a.colorPrimary>
	//*  24   52:aload           5
	//*  25   54:iconst_1        
	//*  26   55:invokevirtual   #200 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  27   58:ifne            63
		{
			return null;
	//   28   61:aconst_null     
	//   29   62:areturn         
		} else
		{
			k = typedvalue.data;
	//   30   63:aload           5
	//   31   65:getfield        #216 <Field int TypedValue.data>
	//   32   68:istore_1        
			int l = colorstatelist.getDefaultColor();
	//   33   69:aload           4
	//   34   71:invokevirtual   #222 <Method int ColorStateList.getDefaultColor()>
	//   35   74:istore_2        
			int ai[] = e;
	//   36   75:getstatic       #35  <Field int[] e>
	//   37   78:astore          5
			int ai1[] = d;
	//   38   80:getstatic       #32  <Field int[] d>
	//   39   83:astore          6
			int ai2[] = EMPTY_STATE_SET;
	//   40   85:getstatic       #225 <Field int[] EMPTY_STATE_SET>
	//   41   88:astore          7
			int i1 = colorstatelist.getColorForState(e, l);
	//   42   90:aload           4
	//   43   92:getstatic       #35  <Field int[] e>
	//   44   95:iload_2         
	//   45   96:invokevirtual   #229 <Method int ColorStateList.getColorForState(int[], int)>
	//   46   99:istore_3        
			return new ColorStateList(new int[][] {
				ai, ai1, ai2
			}, new int[] {
				i1, k, l
			});
	//   47  100:new             #218 <Class ColorStateList>
	//   48  103:dup             
	//   49  104:iconst_3        
	//   50  105:anewarray       int[][]
	//   51  108:dup             
	//   52  109:iconst_0        
	//   53  110:aload           5
	//   54  112:aastore         
	//   55  113:dup             
	//   56  114:iconst_1        
	//   57  115:aload           6
	//   58  117:aastore         
	//   59  118:dup             
	//   60  119:iconst_2        
	//   61  120:aload           7
	//   62  122:aastore         
	//   63  123:iconst_3        
	//   64  124:newarray        int[]
	//   65  126:dup             
	//   66  127:iconst_0        
	//   67  128:iload_3         
	//   68  129:iastore         
	//   69  130:dup             
	//   70  131:iconst_1        
	//   71  132:iload_1         
	//   72  133:iastore         
	//   73  134:dup             
	//   74  135:iconst_2        
	//   75  136:iload_2         
	//   76  137:iastore         
	//   77  138:invokespecial   #233 <Method void ColorStateList(int[][], int[])>
	//   78  141:areturn         
		}
	}

	private MenuInflater getMenuInflater()
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field MenuInflater i>
	//*   2    4:ifnonnull       22
			i = ((MenuInflater) (new g(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #239 <Class g>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #188 <Method Context getContext()>
	//    8   16:invokespecial   #240 <Method void g(Context)>
	//    9   19:putfield        #237 <Field MenuInflater i>
		return i;
	//   10   22:aload_0         
	//   11   23:getfield        #237 <Field MenuInflater i>
	//   12   26:areturn         
	}

	public void a(int k)
	{
		g.b(true);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field c g>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #243 <Method void c.b(boolean)>
		getMenuInflater().inflate(k, ((Menu) (f)));
	//    4    8:aload_0         
	//    5    9:invokespecial   #245 <Method MenuInflater getMenuInflater()>
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #61  <Field b f>
	//    9   17:invokevirtual   #251 <Method void MenuInflater.inflate(int, Menu)>
		g.b(false);
	//   10   20:aload_0         
	//   11   21:getfield        #51  <Field c g>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #243 <Method void c.b(boolean)>
		g.a(false);
	//   14   28:aload_0         
	//   15   29:getfield        #51  <Field c g>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #253 <Method void c.a(boolean)>
	//   18   36:return          
	}

	protected void a(aa aa)
	{
		g.a(aa);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field c g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #256 <Method void c.a(aa)>
	//    4    8:return          
	}

	public View b(int k)
	{
		return g.b(k);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field c g>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #257 <Method View c.b(int)>
	//    4    8:areturn         
	}

	public int getHeaderCount()
	{
		return g.d();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field c g>
	//    2    4:invokevirtual   #260 <Method int c.d()>
	//    3    7:ireturn         
	}

	public Drawable getItemBackground()
	{
		return g.g();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field c g>
	//    2    4:invokevirtual   #264 <Method Drawable c.g()>
	//    3    7:areturn         
	}

	public ColorStateList getItemIconTintList()
	{
		return g.e();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field c g>
	//    2    4:invokevirtual   #268 <Method ColorStateList c.e()>
	//    3    7:areturn         
	}

	public ColorStateList getItemTextColor()
	{
		return g.f();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field c g>
	//    2    4:invokevirtual   #271 <Method ColorStateList c.f()>
	//    3    7:areturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (f));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field b f>
	//    2    4:areturn         
	}

	protected void onMeasure(int k, int l)
	{
label0:
		{
			int i1 = android.view.View.MeasureSpec.getMode(k);
	//    0    0:iload_1         
	//    1    1:invokestatic    #281 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
			if(i1 != 0x80000000)
	//*   3    5:iload_3         
	//*   4    6:ldc2            #282 <Int 0x80000000>
	//*   5    9:icmpeq          27
			{
				if(i1 != 0)
	//*   6   12:iload_3         
	//*   7   13:ifeq            19
					break label0;
	//    8   16:goto            47
				k = h;
	//    9   19:aload_0         
	//   10   20:getfield        #114 <Field int h>
	//   11   23:istore_1        
			} else
	//*  12   24:goto            39
			{
				k = Math.min(android.view.View.MeasureSpec.getSize(k), h);
	//   13   27:iload_1         
	//   14   28:invokestatic    #285 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   15   31:aload_0         
	//   16   32:getfield        #114 <Field int h>
	//   17   35:invokestatic    #290 <Method int Math.min(int, int)>
	//   18   38:istore_1        
			}
			k = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
	//   19   39:iload_1         
	//   20   40:ldc2            #291 <Int 0x40000000>
	//   21   43:invokestatic    #294 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   22   46:istore_1        
		}
		super.onMeasure(k, l);
	//   23   47:aload_0         
	//   24   48:iload_1         
	//   25   49:iload_2         
	//   26   50:invokespecial   #296 <Method void ScrimInsetsFrameLayout.onMeasure(int, int)>
	//   27   53:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #8   <Class NavigationView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #300 <Method void ScrimInsetsFrameLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #8   <Class NavigationView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).a());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #303 <Method Parcelable android.support.design.widget.NavigationView$SavedState.a()>
	//   13   23:invokespecial   #300 <Method void ScrimInsetsFrameLayout.onRestoreInstanceState(Parcelable)>
			f.b(((SavedState) (parcelable)).a);
	//   14   26:aload_0         
	//   15   27:getfield        #61  <Field b f>
	//   16   30:aload_1         
	//   17   31:getfield        #306 <Field Bundle android.support.design.widget.NavigationView$SavedState.a>
	//   18   34:invokevirtual   #309 <Method void b.b(Bundle)>
			return;
	//   19   37:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #8   <Class NavigationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #312 <Method Parcelable ScrimInsetsFrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #314 <Method void NavigationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.a = new Bundle();
	//    6   12:aload_1         
	//    7   13:new             #316 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #317 <Method void Bundle()>
	//   10   20:putfield        #306 <Field Bundle android.support.design.widget.NavigationView$SavedState.a>
		f.a(savedstate.a);
	//   11   23:aload_0         
	//   12   24:getfield        #61  <Field b f>
	//   13   27:aload_1         
	//   14   28:getfield        #306 <Field Bundle android.support.design.widget.NavigationView$SavedState.a>
	//   15   31:invokevirtual   #319 <Method void b.a(Bundle)>
		return ((Parcelable) (savedstate));
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public void setCheckedItem(int k)
	{
		MenuItem menuitem = f.findItem(k);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field b f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #324 <Method MenuItem b.findItem(int)>
	//    4    8:astore_2        
		if(menuitem != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          24
			g.a((j)menuitem);
	//    7   13:aload_0         
	//    8   14:getfield        #51  <Field c g>
	//    9   17:aload_2         
	//   10   18:checkcast       #326 <Class j>
	//   11   21:invokevirtual   #329 <Method void c.a(j)>
	//   12   24:return          
	}

	public void setItemBackground(Drawable drawable)
	{
		g.a(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field c g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #157 <Method void c.a(Drawable)>
	//    4    8:return          
	}

	public void setItemBackgroundResource(int k)
	{
		setItemBackground(android.support.v4.content.a.getDrawable(getContext(), k));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #188 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #337 <Method Drawable a.getDrawable(Context, int)>
	//    5    9:invokevirtual   #339 <Method void setItemBackground(Drawable)>
	//    6   12:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		g.a(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field c g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #150 <Method void c.a(ColorStateList)>
	//    4    8:return          
	}

	public void setItemTextAppearance(int k)
	{
		g.c(k);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field c g>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #152 <Method void c.c(int)>
	//    4    8:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		g.b(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field c g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #154 <Method void c.b(ColorStateList)>
	//    4    8:return          
	}

	public void setNavigationItemSelectedListener(a a1)
	{
		c = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #346 <Field NavigationView$a c>
	//    3    5:return          
	}

	private static final int d[] = {
		0x10100a0
	};
	private static final int e[] = {
		0xfefeff62
	};
	a c;
	private final b f;
	private final c g;
	private int h;
	private MenuInflater i;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #30  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #32  <Field int[] d>
	//    7   11:iconst_1        
	//    8   12:newarray        int[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:ldc1            #33  <Int 0xfefeff62>
	//   12   18:iastore         
	//   13   19:putstatic       #35  <Field int[] e>
	//*  14   22:return          
	}
}
