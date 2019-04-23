// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.*;
import android.support.design.snackbar.ContentViewCallback;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar, CoordinatorLayout, SnackbarContentLayout

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

	public static interface Duration
		extends Annotation
	{
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


	private Snackbar(ViewGroup viewgroup, View view, ContentViewCallback contentviewcallback)
	{
		super(viewgroup, view, contentviewcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #47  <Method void BaseTransientBottomBar(ViewGroup, View, ContentViewCallback)>
		accessibilityManager = (AccessibilityManager)viewgroup.getContext().getSystemService("accessibility");
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #53  <Method Context ViewGroup.getContext()>
	//    8   12:ldc1            #55  <String "accessibility">
	//    9   14:invokevirtual   #61  <Method Object Context.getSystemService(String)>
	//   10   17:checkcast       #63  <Class AccessibilityManager>
	//   11   20:putfield        #65  <Field AccessibilityManager accessibilityManager>
	//   12   23:return          
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
	//*   5    5:instanceof      #69  <Class CoordinatorLayout>
	//*   6    8:ifeq            16
				return (ViewGroup)view1;
	//    7   11:aload_2         
	//    8   12:checkcast       #49  <Class ViewGroup>
	//    9   15:areturn         
			viewgroup = viewgroup1;
	//   10   16:aload_3         
	//   11   17:astore_1        
			if(view1 instanceof FrameLayout)
	//*  12   18:aload_2         
	//*  13   19:instanceof      #71  <Class FrameLayout>
	//*  14   22:ifeq            44
			{
				if(view1.getId() == 0x1020002)
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #77  <Method int View.getId()>
	//*  17   29:ldc1            #78  <Int 0x1020002>
	//*  18   31:icmpne          39
					return (ViewGroup)view1;
	//   19   34:aload_2         
	//   20   35:checkcast       #49  <Class ViewGroup>
	//   21   38:areturn         
				viewgroup = (ViewGroup)view1;
	//   22   39:aload_2         
	//   23   40:checkcast       #49  <Class ViewGroup>
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
	//   30   51:invokevirtual   #82  <Method android.view.ViewParent View.getParent()>
	//   31   54:astore_0        
				if(view instanceof View)
	//*  32   55:aload_0         
	//*  33   56:instanceof      #73  <Class View>
	//*  34   59:ifeq            70
					view = (View)view;
	//   35   62:aload_0         
	//   36   63:checkcast       #73  <Class View>
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

	protected static boolean hasSnackbarButtonStyleAttr(Context context)
	{
		context = ((Context) (context.obtainStyledAttributes(SNACKBAR_BUTTON_STYLE_ATTR)));
	//    0    0:aload_0         
	//    1    1:getstatic       #42  <Field int[] SNACKBAR_BUTTON_STYLE_ATTR>
	//    2    4:invokevirtual   #88  <Method TypedArray Context.obtainStyledAttributes(int[])>
	//    3    7:astore_0        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		int i = ((TypedArray) (context)).getResourceId(0, -1);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:iconst_m1       
	//    9   13:invokevirtual   #94  <Method int TypedArray.getResourceId(int, int)>
	//   10   16:istore_1        
		((TypedArray) (context)).recycle();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #97  <Method void TypedArray.recycle()>
		if(i != -1)
	//*  13   21:iload_1         
	//*  14   22:iconst_m1       
	//*  15   23:icmpeq          28
			flag = true;
	//   16   26:iconst_1        
	//   17   27:istore_2        
		return flag;
	//   18   28:iload_2         
	//   19   29:ireturn         
	}

	public static Snackbar make(View view, int i, int j)
	{
		return make(view, view.getResources().getText(i), j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #105 <Method Resources View.getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #111 <Method CharSequence Resources.getText(int)>
	//    5    9:iload_2         
	//    6   10:invokestatic    #114 <Method Snackbar make(View, CharSequence, int)>
	//    7   13:areturn         
	}

	public static Snackbar make(View view, CharSequence charsequence, int i)
	{
		view = ((View) (findSuitableParent(view)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #118 <Method ViewGroup findSuitableParent(View)>
	//    2    4:astore_0        
		if(view != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          79
		{
			Object obj = ((Object) (LayoutInflater.from(((ViewGroup) (view)).getContext())));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #53  <Method Context ViewGroup.getContext()>
	//    7   13:invokestatic    #124 <Method LayoutInflater LayoutInflater.from(Context)>
	//    8   16:astore          4
			int j;
			if(hasSnackbarButtonStyleAttr(((ViewGroup) (view)).getContext()))
	//*   9   18:aload_0         
	//*  10   19:invokevirtual   #53  <Method Context ViewGroup.getContext()>
	//*  11   22:invokestatic    #126 <Method boolean hasSnackbarButtonStyleAttr(Context)>
	//*  12   25:ifeq            35
				j = android.support.design.R.layout.mtrl_layout_snackbar_include;
	//   13   28:getstatic       #131 <Field int android.support.design.R$layout.mtrl_layout_snackbar_include>
	//   14   31:istore_3        
			else
	//*  15   32:goto            39
				j = android.support.design.R.layout.design_layout_snackbar_include;
	//   16   35:getstatic       #134 <Field int android.support.design.R$layout.design_layout_snackbar_include>
	//   17   38:istore_3        
			obj = ((Object) ((SnackbarContentLayout)((LayoutInflater) (obj)).inflate(j, ((ViewGroup) (view)), false)));
	//   18   39:aload           4
	//   19   41:iload_3         
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:invokevirtual   #138 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   23   47:checkcast       #140 <Class SnackbarContentLayout>
	//   24   50:astore          4
			view = ((View) (new Snackbar(((ViewGroup) (view)), ((View) (obj)), ((ContentViewCallback) (obj)))));
	//   25   52:new             #2   <Class Snackbar>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:aload           4
	//   29   59:aload           4
	//   30   61:invokespecial   #141 <Method void Snackbar(ViewGroup, View, ContentViewCallback)>
	//   31   64:astore_0        
			((Snackbar) (view)).setText(charsequence);
	//   32   65:aload_0         
	//   33   66:aload_1         
	//   34   67:invokevirtual   #145 <Method Snackbar setText(CharSequence)>
	//   35   70:pop             
			((Snackbar) (view)).setDuration(i);
	//   36   71:aload_0         
	//   37   72:iload_2         
	//   38   73:invokevirtual   #149 <Method BaseTransientBottomBar setDuration(int)>
	//   39   76:pop             
			return ((Snackbar) (view));
	//   40   77:aload_0         
	//   41   78:areturn         
		} else
		{
			throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
	//   42   79:new             #151 <Class IllegalArgumentException>
	//   43   82:dup             
	//   44   83:ldc1            #153 <String "No suitable parent found from the given view. Please provide a valid view.">
	//   45   85:invokespecial   #156 <Method void IllegalArgumentException(String)>
	//   46   88:athrow          
		}
	}

	public void dismiss()
	{
		super.dismiss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method void BaseTransientBottomBar.dismiss()>
	//    2    4:return          
	}

	public int getDuration()
	{
		if(hasAction && accessibilityManager.isTouchExplorationEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field boolean hasAction>
	//*   2    4:ifeq            20
	//*   3    7:aload_0         
	//*   4    8:getfield        #65  <Field AccessibilityManager accessibilityManager>
	//*   5   11:invokevirtual   #166 <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
	//*   6   14:ifeq            20
			return -2;
	//    7   17:bipush          -2
	//    8   19:ireturn         
		else
			return super.getDuration();
	//    9   20:aload_0         
	//   10   21:invokespecial   #168 <Method int BaseTransientBottomBar.getDuration()>
	//   11   24:ireturn         
	}

	public boolean isShown()
	{
		return super.isShown();
	//    0    0:aload_0         
	//    1    1:invokespecial   #171 <Method boolean BaseTransientBottomBar.isShown()>
	//    2    4:ireturn         
	}

	public Snackbar setAction(int i, android.view.View.OnClickListener onclicklistener)
	{
		return setAction(getContext().getText(i), onclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #174 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #175 <Method CharSequence Context.getText(int)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #178 <Method Snackbar setAction(CharSequence, android.view.View$OnClickListener)>
	//    7   13:areturn         
	}

	public Snackbar setAction(CharSequence charsequence, final android.view.View.OnClickListener listener)
	{
		android.widget.Button button = ((SnackbarContentLayout)view.getChildAt(0)).getActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #188 <Method View BaseTransientBottomBar$SnackbarBaseLayout.getChildAt(int)>
	//    4    8:checkcast       #140 <Class SnackbarContentLayout>
	//    5   11:invokevirtual   #192 <Method android.widget.Button SnackbarContentLayout.getActionView()>
	//    6   14:astore_3        
		if(!TextUtils.isEmpty(charsequence) && listener != null)
	//*   7   15:aload_1         
	//*   8   16:invokestatic    #198 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   19:ifne            59
	//*  10   22:aload_2         
	//*  11   23:ifnonnull       29
	//*  12   26:goto            59
		{
			hasAction = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #162 <Field boolean hasAction>
			((TextView) (button)).setVisibility(0);
	//   16   34:aload_3         
	//   17   35:iconst_0        
	//   18   36:invokevirtual   #204 <Method void TextView.setVisibility(int)>
			((TextView) (button)).setText(charsequence);
	//   19   39:aload_3         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #207 <Method void TextView.setText(CharSequence)>
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
	//   22   44:aload_3         
	//   23   45:new             #7   <Class Snackbar$1>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:invokespecial   #210 <Method void Snackbar$1(Snackbar, android.view.View$OnClickListener)>
	//   28   54:invokevirtual   #214 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
			return this;
	//   29   57:aload_0         
	//   30   58:areturn         
		} else
		{
			((TextView) (button)).setVisibility(8);
	//   31   59:aload_3         
	//   32   60:bipush          8
	//   33   62:invokevirtual   #204 <Method void TextView.setVisibility(int)>
			((TextView) (button)).setOnClickListener(((android.view.View.OnClickListener) (null)));
	//   34   65:aload_3         
	//   35   66:aconst_null     
	//   36   67:invokevirtual   #214 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
			hasAction = false;
	//   37   70:aload_0         
	//   38   71:iconst_0        
	//   39   72:putfield        #162 <Field boolean hasAction>
			return this;
	//   40   75:aload_0         
	//   41   76:areturn         
		}
	}

	public Snackbar setActionTextColor(int i)
	{
		((TextView) (((SnackbarContentLayout)view.getChildAt(0)).getActionView())).setTextColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #188 <Method View BaseTransientBottomBar$SnackbarBaseLayout.getChildAt(int)>
	//    4    8:checkcast       #140 <Class SnackbarContentLayout>
	//    5   11:invokevirtual   #192 <Method android.widget.Button SnackbarContentLayout.getActionView()>
	//    6   14:iload_1         
	//    7   15:invokevirtual   #220 <Method void TextView.setTextColor(int)>
		return this;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public Snackbar setActionTextColor(ColorStateList colorstatelist)
	{
		((TextView) (((SnackbarContentLayout)view.getChildAt(0)).getActionView())).setTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #188 <Method View BaseTransientBottomBar$SnackbarBaseLayout.getChildAt(int)>
	//    4    8:checkcast       #140 <Class SnackbarContentLayout>
	//    5   11:invokevirtual   #192 <Method android.widget.Button SnackbarContentLayout.getActionView()>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #224 <Method void TextView.setTextColor(ColorStateList)>
		return this;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public Snackbar setCallback(Callback callback1)
	{
		BaseTransientBottomBar.BaseCallback basecallback = callback;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field BaseTransientBottomBar$BaseCallback callback>
	//    2    4:astore_2        
		if(basecallback != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			removeCallback(basecallback);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #233 <Method BaseTransientBottomBar removeCallback(BaseTransientBottomBar$BaseCallback)>
	//    8   14:pop             
		if(callback1 != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          25
			addCallback(((BaseTransientBottomBar.BaseCallback) (callback1)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #236 <Method BaseTransientBottomBar addCallback(BaseTransientBottomBar$BaseCallback)>
	//   14   24:pop             
		callback = ((BaseTransientBottomBar.BaseCallback) (callback1));
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:putfield        #229 <Field BaseTransientBottomBar$BaseCallback callback>
		return this;
	//   18   30:aload_0         
	//   19   31:areturn         
	}

	public Snackbar setText(int i)
	{
		return setText(getContext().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #174 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #175 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #145 <Method Snackbar setText(CharSequence)>
	//    6   12:areturn         
	}

	public Snackbar setText(CharSequence charsequence)
	{
		((SnackbarContentLayout)view.getChildAt(0)).getMessageView().setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field BaseTransientBottomBar$SnackbarBaseLayout view>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #188 <Method View BaseTransientBottomBar$SnackbarBaseLayout.getChildAt(int)>
	//    4    8:checkcast       #140 <Class SnackbarContentLayout>
	//    5   11:invokevirtual   #241 <Method TextView SnackbarContentLayout.getMessageView()>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #207 <Method void TextView.setText(CharSequence)>
		return this;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public void show()
	{
		super.show();
	//    0    0:aload_0         
	//    1    1:invokespecial   #244 <Method void BaseTransientBottomBar.show()>
	//    2    4:return          
	}

	public static final int LENGTH_INDEFINITE = -2;
	public static final int LENGTH_LONG = 0;
	public static final int LENGTH_SHORT = -1;
	private static final int SNACKBAR_BUTTON_STYLE_ATTR[];
	private final AccessibilityManager accessibilityManager;
	private BaseTransientBottomBar.BaseCallback callback;
	private boolean hasAction;

	static 
	{
		SNACKBAR_BUTTON_STYLE_ATTR = (new int[] {
			android.support.design.R.attr.snackbarButtonStyle
		});
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:getstatic       #40  <Field int android.support.design.R$attr.snackbarButtonStyle>
	//    5    8:iastore         
	//    6    9:putstatic       #42  <Field int[] SNACKBAR_BUTTON_STYLE_ATTR>
	//*   7   12:return          
	}
}
