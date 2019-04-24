// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.widget.PopupWindowCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray

class AppCompatPopupWindow extends PopupWindow
{

	public AppCompatPopupWindow(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #31  <Method void PopupWindow(Context, AttributeSet, int)>
		init(context, attributeset, i, 0);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:iload_3         
	//    9   11:iconst_0        
	//   10   12:invokespecial   #35  <Method void init(Context, AttributeSet, int, int)>
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
	//    5    6:invokespecial   #39  <Method void PopupWindow(Context, AttributeSet, int, int)>
		init(context, attributeset, i, j);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:aload_2         
	//    9   12:iload_3         
	//   10   13:iload           4
	//   11   15:invokespecial   #35  <Method void init(Context, AttributeSet, int, int)>
	//   12   18:return          
	}

	private void init(Context context, AttributeSet attributeset, int i, int j)
	{
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.PopupWindow, i, j)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getstatic       #45  <Field int[] android.support.v7.appcompat.R$styleable.PopupWindow>
	//    3    5:iload_3         
	//    4    6:iload           4
	//    5    8:invokestatic    #51  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//    6   11:astore_1        
		if(((TintTypedArray) (context)).hasValue(android.support.v7.appcompat.R.styleable.PopupWindow_overlapAnchor))
	//*   7   12:aload_1         
	//*   8   13:getstatic       #54  <Field int android.support.v7.appcompat.R$styleable.PopupWindow_overlapAnchor>
	//*   9   16:invokevirtual   #58  <Method boolean TintTypedArray.hasValue(int)>
	//*  10   19:ifeq            34
			setSupportOverlapAnchor(((TintTypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.PopupWindow_overlapAnchor, false));
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:getstatic       #54  <Field int android.support.v7.appcompat.R$styleable.PopupWindow_overlapAnchor>
	//   14   27:iconst_0        
	//   15   28:invokevirtual   #62  <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   16   31:invokevirtual   #66  <Method void setSupportOverlapAnchor(boolean)>
		setBackgroundDrawable(((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.PopupWindow_android_popupBackground));
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:getstatic       #69  <Field int android.support.v7.appcompat.R$styleable.PopupWindow_android_popupBackground>
	//   20   39:invokevirtual   #73  <Method android.graphics.drawable.Drawable TintTypedArray.getDrawable(int)>
	//   21   42:invokevirtual   #77  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
		i = android.os.Build.VERSION.SDK_INT;
	//   22   45:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//   23   48:istore_3        
		if(j != 0 && i < 11 && ((TintTypedArray) (context)).hasValue(android.support.v7.appcompat.R.styleable.PopupWindow_android_popupAnimationStyle))
	//*  24   49:iload           4
	//*  25   51:ifeq            82
	//*  26   54:iload_3         
	//*  27   55:bipush          11
	//*  28   57:icmpge          82
	//*  29   60:aload_1         
	//*  30   61:getstatic       #80  <Field int android.support.v7.appcompat.R$styleable.PopupWindow_android_popupAnimationStyle>
	//*  31   64:invokevirtual   #58  <Method boolean TintTypedArray.hasValue(int)>
	//*  32   67:ifeq            82
			setAnimationStyle(((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.PopupWindow_android_popupAnimationStyle, -1));
	//   33   70:aload_0         
	//   34   71:aload_1         
	//   35   72:getstatic       #80  <Field int android.support.v7.appcompat.R$styleable.PopupWindow_android_popupAnimationStyle>
	//   36   75:iconst_m1       
	//   37   76:invokevirtual   #84  <Method int TintTypedArray.getResourceId(int, int)>
	//   38   79:invokevirtual   #88  <Method void setAnimationStyle(int)>
		((TintTypedArray) (context)).recycle();
	//   39   82:aload_1         
	//   40   83:invokevirtual   #91  <Method void TintTypedArray.recycle()>
		if(android.os.Build.VERSION.SDK_INT < 14)
	//*  41   86:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*  42   89:bipush          14
	//*  43   91:icmpge          98
			wrapOnScrollChangedListener(((PopupWindow) (this)));
	//   44   94:aload_0         
	//   45   95:invokestatic    #95  <Method void wrapOnScrollChangedListener(PopupWindow)>
	//   46   98:return          
	}

	private static void wrapOnScrollChangedListener(PopupWindow popupwindow)
	{
		try
		{
			Field field = ((Class) (android/widget/PopupWindow)).getDeclaredField("mAnchor");
	//    0    0:ldc1            #4   <Class PopupWindow>
	//    1    2:ldc1            #99  <String "mAnchor">
	//    2    4:invokevirtual   #105 <Method Field Class.getDeclaredField(String)>
	//    3    7:astore_1        
			field.setAccessible(true);
	//    4    8:aload_1         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #110 <Method void Field.setAccessible(boolean)>
			Field field1 = ((Class) (android/widget/PopupWindow)).getDeclaredField("mOnScrollChangedListener");
	//    7   13:ldc1            #4   <Class PopupWindow>
	//    8   15:ldc1            #112 <String "mOnScrollChangedListener">
	//    9   17:invokevirtual   #105 <Method Field Class.getDeclaredField(String)>
	//   10   20:astore_2        
			field1.setAccessible(true);
	//   11   21:aload_2         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #110 <Method void Field.setAccessible(boolean)>
			field1.set(((Object) (popupwindow)), ((Object) (new android.view.ViewTreeObserver.OnScrollChangedListener(field, popupwindow, (android.view.ViewTreeObserver.OnScrollChangedListener)field1.get(((Object) (popupwindow)))) {

				public void onScrollChanged()
				{
					WeakReference weakreference = (WeakReference)fieldAnchor.get(((Object) (popup)));
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field Field val$fieldAnchor>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field PopupWindow val$popup>
				//    4    8:invokevirtual   #38  <Method Object Field.get(Object)>
				//    5   11:checkcast       #40  <Class WeakReference>
				//    6   14:astore_1        
					if(weakreference == null)
						break MISSING_BLOCK_LABEL_38;
				//    7   15:aload_1         
				//    8   16:ifnull          38
					if(weakreference.get() == null)
				//*   9   19:aload_1         
				//*  10   20:invokevirtual   #43  <Method Object WeakReference.get()>
				//*  11   23:ifnonnull       27
						return;
				//   12   26:return          
					try
					{
						originalListener.onScrollChanged();
				//   13   27:aload_0         
				//   14   28:getfield        #25  <Field android.view.ViewTreeObserver$OnScrollChangedListener val$originalListener>
				//   15   31:invokeinterface #45  <Method void android.view.ViewTreeObserver$OnScrollChangedListener.onScrollChanged()>
						return;
				//   16   36:return          
					}
					catch(IllegalAccessException illegalaccessexception) { }
				//   17   37:astore_1        
				//   18   38:return          
				}

				final Field val$fieldAnchor;
				final android.view.ViewTreeObserver.OnScrollChangedListener val$originalListener;
				final PopupWindow val$popup;

			
			{
				fieldAnchor = field;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Field val$fieldAnchor>
				popup = popupwindow;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field PopupWindow val$popup>
				originalListener = onscrollchangedlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field android.view.ViewTreeObserver$OnScrollChangedListener val$originalListener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
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
	//   22   36:invokevirtual   #116 <Method Object Field.get(Object)>
	//   23   39:checkcast       #118 <Class android.view.ViewTreeObserver$OnScrollChangedListener>
	//   24   42:invokespecial   #121 <Method void AppCompatPopupWindow$1(Field, PopupWindow, android.view.ViewTreeObserver$OnScrollChangedListener)>
	//   25   45:invokevirtual   #125 <Method void Field.set(Object, Object)>
			return;
	//   26   48:return          
		}
		// Misplaced declaration of an exception variable
		catch(PopupWindow popupwindow)
	//*  27   49:astore_0        
		{
			Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", ((Throwable) (popupwindow)));
	//   28   50:ldc1            #12  <String "AppCompatPopupWindow">
	//   29   52:ldc1            #127 <String "Exception while installing workaround OnScrollChangedListener">
	//   30   54:aload_0         
	//   31   55:invokestatic    #133 <Method int Log.d(String, String, Throwable)>
	//   32   58:pop             
		}
	//   33   59:return          
	}

	public boolean getSupportOverlapAnchor()
	{
		if(COMPAT_OVERLAP_ANCHOR)
	//*   0    0:getstatic       #23  <Field boolean COMPAT_OVERLAP_ANCHOR>
	//*   1    3:ifeq            11
			return mOverlapAnchor;
	//    2    6:aload_0         
	//    3    7:getfield        #141 <Field boolean mOverlapAnchor>
	//    4   10:ireturn         
		else
			return PopupWindowCompat.getOverlapAnchor(((PopupWindow) (this)));
	//    5   11:aload_0         
	//    6   12:invokestatic    #147 <Method boolean PopupWindowCompat.getOverlapAnchor(PopupWindow)>
	//    7   15:ireturn         
	}

	public void setSupportOverlapAnchor(boolean flag)
	{
		if(COMPAT_OVERLAP_ANCHOR)
	//*   0    0:getstatic       #23  <Field boolean COMPAT_OVERLAP_ANCHOR>
	//*   1    3:ifeq            12
		{
			mOverlapAnchor = flag;
	//    2    6:aload_0         
	//    3    7:iload_1         
	//    4    8:putfield        #141 <Field boolean mOverlapAnchor>
			return;
	//    5   11:return          
		} else
		{
			PopupWindowCompat.setOverlapAnchor(((PopupWindow) (this)), flag);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokestatic    #152 <Method void PopupWindowCompat.setOverlapAnchor(PopupWindow, boolean)>
			return;
	//    9   17:return          
		}
	}

	public void showAsDropDown(View view, int i, int j)
	{
		int k = j;
	//    0    0:iload_3         
	//    1    1:istore          4
		if(COMPAT_OVERLAP_ANCHOR)
	//*   2    3:getstatic       #23  <Field boolean COMPAT_OVERLAP_ANCHOR>
	//*   3    6:ifeq            27
		{
			k = j;
	//    4    9:iload_3         
	//    5   10:istore          4
			if(mOverlapAnchor)
	//*   6   12:aload_0         
	//*   7   13:getfield        #141 <Field boolean mOverlapAnchor>
	//*   8   16:ifeq            27
				k = j - view.getHeight();
	//    9   19:iload_3         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #160 <Method int View.getHeight()>
	//   12   24:isub            
	//   13   25:istore          4
		}
		super.showAsDropDown(view, i, k);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:iload_2         
	//   17   30:iload           4
	//   18   32:invokespecial   #162 <Method void PopupWindow.showAsDropDown(View, int, int)>
	//   19   35:return          
	}

	public void showAsDropDown(View view, int i, int j, int k)
	{
		int l = j;
	//    0    0:iload_3         
	//    1    1:istore          5
		if(COMPAT_OVERLAP_ANCHOR)
	//*   2    3:getstatic       #23  <Field boolean COMPAT_OVERLAP_ANCHOR>
	//*   3    6:ifeq            27
		{
			l = j;
	//    4    9:iload_3         
	//    5   10:istore          5
			if(mOverlapAnchor)
	//*   6   12:aload_0         
	//*   7   13:getfield        #141 <Field boolean mOverlapAnchor>
	//*   8   16:ifeq            27
				l = j - view.getHeight();
	//    9   19:iload_3         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #160 <Method int View.getHeight()>
	//   12   24:isub            
	//   13   25:istore          5
		}
		super.showAsDropDown(view, i, l, k);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:iload_2         
	//   17   30:iload           5
	//   18   32:iload           4
	//   19   34:invokespecial   #165 <Method void PopupWindow.showAsDropDown(View, int, int, int)>
	//   20   37:return          
	}

	public void update(View view, int i, int j, int k, int l)
	{
		int i1 = j;
	//    0    0:iload_3         
	//    1    1:istore          6
		if(COMPAT_OVERLAP_ANCHOR)
	//*   2    3:getstatic       #23  <Field boolean COMPAT_OVERLAP_ANCHOR>
	//*   3    6:ifeq            27
		{
			i1 = j;
	//    4    9:iload_3         
	//    5   10:istore          6
			if(mOverlapAnchor)
	//*   6   12:aload_0         
	//*   7   13:getfield        #141 <Field boolean mOverlapAnchor>
	//*   8   16:ifeq            27
				i1 = j - view.getHeight();
	//    9   19:iload_3         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #160 <Method int View.getHeight()>
	//   12   24:isub            
	//   13   25:istore          6
		}
		super.update(view, i, i1, k, l);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:iload_2         
	//   17   30:iload           6
	//   18   32:iload           4
	//   19   34:iload           5
	//   20   36:invokespecial   #169 <Method void PopupWindow.update(View, int, int, int, int)>
	//   21   39:return          
	}

	private static final boolean COMPAT_OVERLAP_ANCHOR;
	private static final String TAG = "AppCompatPopupWindow";
	private boolean mOverlapAnchor;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          15
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #23  <Field boolean COMPAT_OVERLAP_ANCHOR>
	//*   7   14:return          
			flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_0        
		COMPAT_OVERLAP_ANCHOR = flag;
	//*  10   17:goto            10
	}
}
