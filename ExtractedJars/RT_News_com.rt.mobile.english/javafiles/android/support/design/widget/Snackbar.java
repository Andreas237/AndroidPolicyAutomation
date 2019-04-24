// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.design.internal.SnackbarContentLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;
import android.widget.TextView;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar, CoordinatorLayout

public final class Snackbar extends BaseTransientBottomBar
{
	public static class Callback extends BaseTransientBottomBar.BaseCallback
	{

		public void onDismissed(Snackbar snackbar, int i)
		{
		//    0    0:return          
		}

		public volatile void onDismissed(Object obj, int i)
		{
			onDismissed((Snackbar)obj, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class Snackbar>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #29  <Method void onDismissed(Snackbar, int)>
		//    5    9:return          
		}

		public void onShown(Snackbar snackbar)
		{
		//    0    0:return          
		}

		public volatile void onShown(Object obj)
		{
			onShown((Snackbar)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class Snackbar>
		//    3    5:invokevirtual   #34  <Method void onShown(Snackbar)>
		//    4    8:return          
		}

		public static final int DISMISS_EVENT_ACTION = 1;
		public static final int DISMISS_EVENT_CONSECUTIVE = 4;
		public static final int DISMISS_EVENT_MANUAL = 3;
		public static final int DISMISS_EVENT_SWIPE = 0;
		public static final int DISMISS_EVENT_TIMEOUT = 2;

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void BaseTransientBottomBar$BaseCallback()>
		//    2    4:return          
		}
	}

	public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout
	{

		protected void onMeasure(int i, int j)
		{
			super.onMeasure(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #23  <Method void BaseTransientBottomBar$SnackbarBaseLayout.onMeasure(int, int)>
			j = getChildCount();
		//    4    6:aload_0         
		//    5    7:invokevirtual   #27  <Method int getChildCount()>
		//    6   10:istore_2        
			int k = getMeasuredWidth();
		//    7   11:aload_0         
		//    8   12:invokevirtual   #30  <Method int getMeasuredWidth()>
		//    9   15:istore_3        
			int l = getPaddingLeft();
		//   10   16:aload_0         
		//   11   17:invokevirtual   #33  <Method int getPaddingLeft()>
		//   12   20:istore          4
			int i1 = getPaddingRight();
		//   13   22:aload_0         
		//   14   23:invokevirtual   #36  <Method int getPaddingRight()>
		//   15   26:istore          5
			for(i = 0; i < j; i++)
		//*  16   28:iconst_0        
		//*  17   29:istore_1        
		//*  18   30:iload_1         
		//*  19   31:iload_2         
		//*  20   32:icmpge          88
			{
				View view = getChildAt(i);
		//   21   35:aload_0         
		//   22   36:iload_1         
		//   23   37:invokevirtual   #40  <Method View getChildAt(int)>
		//   24   40:astore          6
				if(view.getLayoutParams().width == -1)
		//*  25   42:aload           6
		//*  26   44:invokevirtual   #46  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//*  27   47:getfield        #52  <Field int android.view.ViewGroup$LayoutParams.width>
		//*  28   50:iconst_m1       
		//*  29   51:icmpne          81
					view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k - l - i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
		//   30   54:aload           6
		//   31   56:iload_3         
		//   32   57:iload           4
		//   33   59:isub            
		//   34   60:iload           5
		//   35   62:isub            
		//   36   63:ldc1            #53  <Int 0x40000000>
		//   37   65:invokestatic    #59  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   38   68:aload           6
		//   39   70:invokevirtual   #62  <Method int View.getMeasuredHeight()>
		//   40   73:ldc1            #53  <Int 0x40000000>
		//   41   75:invokestatic    #59  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   42   78:invokevirtual   #65  <Method void View.measure(int, int)>
			}

		//   43   81:iload_1         
		//   44   82:iconst_1        
		//   45   83:iadd            
		//   46   84:istore_1        
		//*  47   85:goto            30
		//   48   88:return          
		}

		public SnackbarLayout(Context context)
		{
			super(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void BaseTransientBottomBar$SnackbarBaseLayout(Context)>
		//    3    5:return          
		}

		public SnackbarLayout(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void BaseTransientBottomBar$SnackbarBaseLayout(Context, AttributeSet)>
		//    4    6:return          
		}
	}


	private Snackbar(ViewGroup viewgroup, View view, BaseTransientBottomBar.ContentViewCallback contentviewcallback)
	{
		super(viewgroup, view, contentviewcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #28  <Method void BaseTransientBottomBar(ViewGroup, View, BaseTransientBottomBar$ContentViewCallback)>
	//    5    7:return          
	}

	private static ViewGroup findSuitableParent(View view)
	{
		ViewGroup viewgroup1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		View view1 = view;
	//    2    2:aload_0         
	//    3    3:astore_2        
		ViewGroup viewgroup;
		do
		{
			if(view1 instanceof CoordinatorLayout)
	//*   4    4:aload_2         
	//*   5    5:instanceof      #33  <Class CoordinatorLayout>
	//*   6    8:ifeq            16
				return (ViewGroup)view1;
	//    7   11:aload_2         
	//    8   12:checkcast       #35  <Class ViewGroup>
	//    9   15:areturn         
			viewgroup = viewgroup1;
	//   10   16:aload_3         
	//   11   17:astore_1        
			if(view1 instanceof FrameLayout)
	//*  12   18:aload_2         
	//*  13   19:instanceof      #37  <Class FrameLayout>
	//*  14   22:ifeq            44
			{
				if(view1.getId() == 0x1020002)
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #43  <Method int View.getId()>
	//*  17   29:ldc1            #44  <Int 0x1020002>
	//*  18   31:icmpne          39
					return (ViewGroup)view1;
	//   19   34:aload_2         
	//   20   35:checkcast       #35  <Class ViewGroup>
	//   21   38:areturn         
				viewgroup = (ViewGroup)view1;
	//   22   39:aload_2         
	//   23   40:checkcast       #35  <Class ViewGroup>
	//   24   43:astore_1        
			}
			view = view1;
	//   25   44:aload_2         
	//   26   45:astore_0        
			if(view1 != null)
	//*  27   46:aload_2         
	//*  28   47:ifnull          72
			{
				view = ((View) (view1.getParent()));
	//   29   50:aload_2         
	//   30   51:invokevirtual   #48  <Method android.view.ViewParent View.getParent()>
	//   31   54:astore_0        
				if(view instanceof View)
	//*  32   55:aload_0         
	//*  33   56:instanceof      #39  <Class View>
	//*  34   59:ifeq            70
					view = (View)view;
	//   35   62:aload_0         
	//   36   63:checkcast       #39  <Class View>
	//   37   66:astore_0        
				else
	//*  38   67:goto            72
					view = null;
	//   39   70:aconst_null     
	//   40   71:astore_0        
			}
			viewgroup1 = viewgroup;
	//   41   72:aload_1         
	//   42   73:astore_3        
			view1 = view;
	//   43   74:aload_0         
	//   44   75:astore_2        
		} while(view != null);
	//   45   76:aload_0         
	//   46   77:ifnonnull       4
		return viewgroup;
	//   47   80:aload_1         
	//   48   81:areturn         
	}

	public static Snackbar make(View view, int i, int j)
	{
		return make(view, view.getResources().getText(i), j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #56  <Method Resources View.getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #62  <Method CharSequence Resources.getText(int)>
	//    5    9:iload_2         
	//    6   10:invokestatic    #65  <Method Snackbar make(View, CharSequence, int)>
	//    7   13:areturn         
	}

	public static Snackbar make(View view, CharSequence charsequence, int i)
	{
		view = ((View) (findSuitableParent(view)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #69  <Method ViewGroup findSuitableParent(View)>
	//    2    4:astore_0        
		if(view == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       19
		{
			throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
	//    5    9:new             #71  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #73  <String "No suitable parent found from the given view. Please provide a valid view.">
	//    8   15:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
		} else
		{
			SnackbarContentLayout snackbarcontentlayout = (SnackbarContentLayout)LayoutInflater.from(((ViewGroup) (view)).getContext()).inflate(android.support.design.R.layout.design_layout_snackbar_include, ((ViewGroup) (view)), false);
	//   10   19:aload_0         
	//   11   20:invokevirtual   #80  <Method Context ViewGroup.getContext()>
	//   12   23:invokestatic    #86  <Method LayoutInflater LayoutInflater.from(Context)>
	//   13   26:getstatic       #91  <Field int android.support.design.R$layout.design_layout_snackbar_include>
	//   14   29:aload_0         
	//   15   30:iconst_0        
	//   16   31:invokevirtual   #95  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   17   34:checkcast       #97  <Class SnackbarContentLayout>
	//   18   37:astore_3        
			view = ((View) (new Snackbar(((ViewGroup) (view)), ((View) (snackbarcontentlayout)), ((BaseTransientBottomBar.ContentViewCallback) (snackbarcontentlayout)))));
	//   19   38:new             #2   <Class Snackbar>
	//   20   41:dup             
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:aload_3         
	//   24   45:invokespecial   #98  <Method void Snackbar(ViewGroup, View, BaseTransientBottomBar$ContentViewCallback)>
	//   25   48:astore_0        
			((Snackbar) (view)).setText(charsequence);
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #102 <Method Snackbar setText(CharSequence)>
	//   29   54:pop             
			((Snackbar) (view)).setDuration(i);
	//   30   55:aload_0         
	//   31   56:iload_2         
	//   32   57:invokevirtual   #106 <Method BaseTransientBottomBar setDuration(int)>
	//   33   60:pop             
			return ((Snackbar) (view));
	//   34   61:aload_0         
	//   35   62:areturn         
		}
	}

	public Snackbar setAction(int i, android.view.View.OnClickListener onclicklistener)
	{
		return setAction(getContext().getText(i), onclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #109 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #112 <Method CharSequence Context.getText(int)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #115 <Method Snackbar setAction(CharSequence, android.view.View$OnClickListener)>
	//    7   13:areturn         
	}

	public Snackbar setAction(CharSequence charsequence, final android.view.View.OnClickListener listener)
	{
		android.widget.Button button = ((SnackbarContentLayout)mView.getChildAt(0)).getActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #125 <Method View BaseTransientBottomBar$SnackbarBaseLayout.getChildAt(int)>
	//    4    8:checkcast       #97  <Class SnackbarContentLayout>
	//    5   11:invokevirtual   #129 <Method android.widget.Button SnackbarContentLayout.getActionView()>
	//    6   14:astore_3        
		if(!TextUtils.isEmpty(charsequence) && listener != null)
	//*   7   15:aload_1         
	//*   8   16:invokestatic    #135 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   19:ifne            54
	//*  10   22:aload_2         
	//*  11   23:ifnonnull       29
	//*  12   26:goto            54
		{
			((TextView) (button)).setVisibility(0);
	//   13   29:aload_3         
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #141 <Method void TextView.setVisibility(int)>
			((TextView) (button)).setText(charsequence);
	//   16   34:aload_3         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #144 <Method void TextView.setText(CharSequence)>
			((TextView) (button)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					listener.onClick(view);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field android.view.View$OnClickListener val$listener>
				//    2    4:aload_1         
				//    3    5:invokeinterface #29  <Method void android.view.View$OnClickListener.onClick(View)>
					dispatchDismiss(1);
				//    4   10:aload_0         
				//    5   11:getfield        #19  <Field Snackbar this$0>
				//    6   14:iconst_1        
				//    7   15:invokevirtual   #33  <Method void Snackbar.dispatchDismiss(int)>
				//    8   18:return          
				}

				final Snackbar this$0;
				final android.view.View.OnClickListener val$listener;

			
			{
				this$0 = Snackbar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Snackbar this$0>
				listener = onclicklistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.view.View$OnClickListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   19   39:aload_3         
	//   20   40:new             #7   <Class Snackbar$1>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:aload_2         
	//   24   46:invokespecial   #147 <Method void Snackbar$1(Snackbar, android.view.View$OnClickListener)>
	//   25   49:invokevirtual   #151 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
			return this;
	//   26   52:aload_0         
	//   27   53:areturn         
		} else
		{
			((TextView) (button)).setVisibility(8);
	//   28   54:aload_3         
	//   29   55:bipush          8
	//   30   57:invokevirtual   #141 <Method void TextView.setVisibility(int)>
			((TextView) (button)).setOnClickListener(((android.view.View.OnClickListener) (null)));
	//   31   60:aload_3         
	//   32   61:aconst_null     
	//   33   62:invokevirtual   #151 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
			return this;
	//   34   65:aload_0         
	//   35   66:areturn         
		}
	}

	public Snackbar setActionTextColor(int i)
	{
		((TextView) (((SnackbarContentLayout)mView.getChildAt(0)).getActionView())).setTextColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #125 <Method View BaseTransientBottomBar$SnackbarBaseLayout.getChildAt(int)>
	//    4    8:checkcast       #97  <Class SnackbarContentLayout>
	//    5   11:invokevirtual   #129 <Method android.widget.Button SnackbarContentLayout.getActionView()>
	//    6   14:iload_1         
	//    7   15:invokevirtual   #157 <Method void TextView.setTextColor(int)>
		return this;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public Snackbar setActionTextColor(ColorStateList colorstatelist)
	{
		((TextView) (((SnackbarContentLayout)mView.getChildAt(0)).getActionView())).setTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #125 <Method View BaseTransientBottomBar$SnackbarBaseLayout.getChildAt(int)>
	//    4    8:checkcast       #97  <Class SnackbarContentLayout>
	//    5   11:invokevirtual   #129 <Method android.widget.Button SnackbarContentLayout.getActionView()>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #161 <Method void TextView.setTextColor(ColorStateList)>
		return this;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public Snackbar setCallback(Callback callback)
	{
		if(mCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field BaseTransientBottomBar$BaseCallback mCallback>
	//*   2    4:ifnull          16
			removeCallback(mCallback);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #166 <Field BaseTransientBottomBar$BaseCallback mCallback>
	//    6   12:invokevirtual   #170 <Method BaseTransientBottomBar removeCallback(BaseTransientBottomBar$BaseCallback)>
	//    7   15:pop             
		if(callback != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          26
			addCallback(((BaseTransientBottomBar.BaseCallback) (callback)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #173 <Method BaseTransientBottomBar addCallback(BaseTransientBottomBar$BaseCallback)>
	//   13   25:pop             
		mCallback = ((BaseTransientBottomBar.BaseCallback) (callback));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #166 <Field BaseTransientBottomBar$BaseCallback mCallback>
		return this;
	//   17   31:aload_0         
	//   18   32:areturn         
	}

	public Snackbar setText(int i)
	{
		return setText(getContext().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #109 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #112 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #102 <Method Snackbar setText(CharSequence)>
	//    6   12:areturn         
	}

	public Snackbar setText(CharSequence charsequence)
	{
		((SnackbarContentLayout)mView.getChildAt(0)).getMessageView().setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field BaseTransientBottomBar$SnackbarBaseLayout mView>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #125 <Method View BaseTransientBottomBar$SnackbarBaseLayout.getChildAt(int)>
	//    4    8:checkcast       #97  <Class SnackbarContentLayout>
	//    5   11:invokevirtual   #178 <Method TextView SnackbarContentLayout.getMessageView()>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #144 <Method void TextView.setText(CharSequence)>
		return this;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public static final int LENGTH_INDEFINITE = -2;
	public static final int LENGTH_LONG = 0;
	public static final int LENGTH_SHORT = -1;
	private BaseTransientBottomBar.BaseCallback mCallback;
}
