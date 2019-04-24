// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.widget.k;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.widget:
//			av

class AppCompatPopupWindow extends PopupWindow
{

	public AppCompatPopupWindow(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #24  <Method void PopupWindow(Context, AttributeSet, int)>
		a(context, attributeset, i, 0);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:iload_3         
	//    9   11:iconst_0        
	//   10   12:invokespecial   #27  <Method void a(Context, AttributeSet, int, int)>
	//   11   15:return          
	}

	public AppCompatPopupWindow(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #29  <Method void PopupWindow(Context, AttributeSet, int, int)>
		a(context, attributeset, i, j);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:aload_2         
	//    9   12:iload_3         
	//   10   13:iload           4
	//   11   15:invokespecial   #27  <Method void a(Context, AttributeSet, int, int)>
	//   12   18:return          
	}

	private void a(Context context, AttributeSet attributeset, int i, int j)
	{
		context = ((Context) (av.a(context, attributeset, android.support.v7.a.a.j.PopupWindow, i, j)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getstatic       #35  <Field int[] android.support.v7.a.a$j.PopupWindow>
	//    3    5:iload_3         
	//    4    6:iload           4
	//    5    8:invokestatic    #40  <Method av av.a(Context, AttributeSet, int[], int, int)>
	//    6   11:astore_1        
		if(((av) (context)).g(android.support.v7.a.a.j.PopupWindow_overlapAnchor))
	//*   7   12:aload_1         
	//*   8   13:getstatic       #43  <Field int android.support.v7.a.a$j.PopupWindow_overlapAnchor>
	//*   9   16:invokevirtual   #47  <Method boolean av.g(int)>
	//*  10   19:ifeq            34
			a(((av) (context)).a(android.support.v7.a.a.j.PopupWindow_overlapAnchor, false));
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:getstatic       #43  <Field int android.support.v7.a.a$j.PopupWindow_overlapAnchor>
	//   14   27:iconst_0        
	//   15   28:invokevirtual   #50  <Method boolean av.a(int, boolean)>
	//   16   31:invokevirtual   #53  <Method void a(boolean)>
		setBackgroundDrawable(((av) (context)).a(android.support.v7.a.a.j.PopupWindow_android_popupBackground));
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:getstatic       #56  <Field int android.support.v7.a.a$j.PopupWindow_android_popupBackground>
	//   20   39:invokevirtual   #59  <Method android.graphics.drawable.Drawable av.a(int)>
	//   21   42:invokevirtual   #63  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
		i = android.os.Build.VERSION.SDK_INT;
	//   22   45:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//   23   48:istore_3        
		if(j != 0 && i < 11 && ((av) (context)).g(android.support.v7.a.a.j.PopupWindow_android_popupAnimationStyle))
	//*  24   49:iload           4
	//*  25   51:ifeq            82
	//*  26   54:iload_3         
	//*  27   55:bipush          11
	//*  28   57:icmpge          82
	//*  29   60:aload_1         
	//*  30   61:getstatic       #66  <Field int android.support.v7.a.a$j.PopupWindow_android_popupAnimationStyle>
	//*  31   64:invokevirtual   #47  <Method boolean av.g(int)>
	//*  32   67:ifeq            82
			setAnimationStyle(((av) (context)).g(android.support.v7.a.a.j.PopupWindow_android_popupAnimationStyle, -1));
	//   33   70:aload_0         
	//   34   71:aload_1         
	//   35   72:getstatic       #66  <Field int android.support.v7.a.a$j.PopupWindow_android_popupAnimationStyle>
	//   36   75:iconst_m1       
	//   37   76:invokevirtual   #69  <Method int av.g(int, int)>
	//   38   79:invokevirtual   #73  <Method void setAnimationStyle(int)>
		((av) (context)).a();
	//   39   82:aload_1         
	//   40   83:invokevirtual   #75  <Method void av.a()>
		if(android.os.Build.VERSION.SDK_INT < 14)
	//*  41   86:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*  42   89:bipush          14
	//*  43   91:icmpge          98
			a(((PopupWindow) (this)));
	//   44   94:aload_0         
	//   45   95:invokestatic    #78  <Method void a(PopupWindow)>
	//   46   98:return          
	}

	private static void a(PopupWindow popupwindow)
	{
		try
		{
			Field field = ((Class) (android/widget/PopupWindow)).getDeclaredField("mAnchor");
	//    0    0:ldc1            #4   <Class PopupWindow>
	//    1    2:ldc1            #82  <String "mAnchor">
	//    2    4:invokevirtual   #88  <Method Field Class.getDeclaredField(String)>
	//    3    7:astore_1        
			field.setAccessible(true);
	//    4    8:aload_1         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #93  <Method void Field.setAccessible(boolean)>
			Field field1 = ((Class) (android/widget/PopupWindow)).getDeclaredField("mOnScrollChangedListener");
	//    7   13:ldc1            #4   <Class PopupWindow>
	//    8   15:ldc1            #95  <String "mOnScrollChangedListener">
	//    9   17:invokevirtual   #88  <Method Field Class.getDeclaredField(String)>
	//   10   20:astore_2        
			field1.setAccessible(true);
	//   11   21:aload_2         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #93  <Method void Field.setAccessible(boolean)>
			field1.set(((Object) (popupwindow)), ((Object) (new android.view.ViewTreeObserver.OnScrollChangedListener(field, popupwindow, (android.view.ViewTreeObserver.OnScrollChangedListener)field1.get(((Object) (popupwindow)))) {

				public void onScrollChanged()
				{
					WeakReference weakreference;
					try
					{
						weakreference = (WeakReference)a.get(((Object) (b)));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field Field a>
				//    2    4:aload_0         
				//    3    5:getfield        #22  <Field PopupWindow b>
				//    4    8:invokevirtual   #37  <Method Object Field.get(Object)>
				//    5   11:checkcast       #39  <Class WeakReference>
				//    6   14:astore_1        
					}
				//*   7   15:aload_1         
				//*   8   16:ifnull          37
				//*   9   19:aload_1         
				//*  10   20:invokevirtual   #42  <Method Object WeakReference.get()>
				//*  11   23:ifnonnull       27
				//*  12   26:return          
				//*  13   27:aload_0         
				//*  14   28:getfield        #24  <Field android.view.ViewTreeObserver$OnScrollChangedListener c>
				//*  15   31:invokeinterface #44  <Method void android.view.ViewTreeObserver$OnScrollChangedListener.onScrollChanged()>
				//*  16   36:return          
				//*  17   37:return          
					catch(IllegalAccessException illegalaccessexception)
				//*  18   38:astore_1        
					{
						return;
				//   19   39:return          
					}
					if(weakreference == null)
						break MISSING_BLOCK_LABEL_37;
					if(weakreference.get() == null)
						return;
					c.onScrollChanged();
					return;
				}

				final Field a;
				final PopupWindow b;
				final android.view.ViewTreeObserver.OnScrollChangedListener c;

			
			{
				a = field;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Field a>
				b = popupwindow;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field PopupWindow b>
				c = onscrollchangedlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field android.view.ViewTreeObserver$OnScrollChangedListener c>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
)));
	//   14   26:aload_2         
	//   15   27:aload_0         
	//   16   28:new             #6   <Class AppCompatPopupWindow$1>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:aload_2         
	//   21   35:aload_0         
	//   22   36:invokevirtual   #99  <Method Object Field.get(Object)>
	//   23   39:checkcast       #101 <Class android.view.ViewTreeObserver$OnScrollChangedListener>
	//   24   42:invokespecial   #104 <Method void AppCompatPopupWindow$1(Field, PopupWindow, android.view.ViewTreeObserver$OnScrollChangedListener)>
	//   25   45:invokevirtual   #108 <Method void Field.set(Object, Object)>
			return;
	//   26   48:return          
		}
		// Misplaced declaration of an exception variable
		catch(PopupWindow popupwindow)
	//*  27   49:astore_0        
		{
			Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", ((Throwable) (popupwindow)));
	//   28   50:ldc1            #110 <String "AppCompatPopupWindow">
	//   29   52:ldc1            #112 <String "Exception while installing workaround OnScrollChangedListener">
	//   30   54:aload_0         
	//   31   55:invokestatic    #118 <Method int Log.d(String, String, Throwable)>
	//   32   58:pop             
		}
	//   33   59:return          
	}

	public void a(boolean flag)
	{
		if(a)
	//*   0    0:getstatic       #19  <Field boolean a>
	//*   1    3:ifeq            12
		{
			b = flag;
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:putfield        #120 <Field boolean b>
			return;
	//    5   11:return          
		} else
		{
			k.a(((PopupWindow) (this)), flag);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokestatic    #125 <Method void k.a(PopupWindow, boolean)>
			return;
	//    9   17:return          
		}
	}

	public void showAsDropDown(View view, int i, int j)
	{
		int l = j;
	//    0    0:iload_3         
	//    1    1:istore          4
		if(a)
	//*   2    3:getstatic       #19  <Field boolean a>
	//*   3    6:ifeq            27
		{
			l = j;
	//    4    9:iload_3         
	//    5   10:istore          4
			if(b)
	//*   6   12:aload_0         
	//*   7   13:getfield        #120 <Field boolean b>
	//*   8   16:ifeq            27
				l = j - view.getHeight();
	//    9   19:iload_3         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #133 <Method int View.getHeight()>
	//   12   24:isub            
	//   13   25:istore          4
		}
		super.showAsDropDown(view, i, l);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:iload_2         
	//   17   30:iload           4
	//   18   32:invokespecial   #135 <Method void PopupWindow.showAsDropDown(View, int, int)>
	//   19   35:return          
	}

	public void showAsDropDown(View view, int i, int j, int l)
	{
		int i1 = j;
	//    0    0:iload_3         
	//    1    1:istore          5
		if(a)
	//*   2    3:getstatic       #19  <Field boolean a>
	//*   3    6:ifeq            27
		{
			i1 = j;
	//    4    9:iload_3         
	//    5   10:istore          5
			if(b)
	//*   6   12:aload_0         
	//*   7   13:getfield        #120 <Field boolean b>
	//*   8   16:ifeq            27
				i1 = j - view.getHeight();
	//    9   19:iload_3         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #133 <Method int View.getHeight()>
	//   12   24:isub            
	//   13   25:istore          5
		}
		super.showAsDropDown(view, i, i1, l);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:iload_2         
	//   17   30:iload           5
	//   18   32:iload           4
	//   19   34:invokespecial   #138 <Method void PopupWindow.showAsDropDown(View, int, int, int)>
	//   20   37:return          
	}

	public void update(View view, int i, int j, int l, int i1)
	{
		int j1 = j;
	//    0    0:iload_3         
	//    1    1:istore          6
		if(a)
	//*   2    3:getstatic       #19  <Field boolean a>
	//*   3    6:ifeq            27
		{
			j1 = j;
	//    4    9:iload_3         
	//    5   10:istore          6
			if(b)
	//*   6   12:aload_0         
	//*   7   13:getfield        #120 <Field boolean b>
	//*   8   16:ifeq            27
				j1 = j - view.getHeight();
	//    9   19:iload_3         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #133 <Method int View.getHeight()>
	//   12   24:isub            
	//   13   25:istore          6
		}
		super.update(view, i, j1, l, i1);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:iload_2         
	//   17   30:iload           6
	//   18   32:iload           4
	//   19   34:iload           5
	//   20   36:invokespecial   #142 <Method void PopupWindow.update(View, int, int, int, int)>
	//   21   39:return          
	}

	private static final boolean a;
	private boolean b;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		a = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #19  <Field boolean a>
	//*  10   19:return          
	}
}
