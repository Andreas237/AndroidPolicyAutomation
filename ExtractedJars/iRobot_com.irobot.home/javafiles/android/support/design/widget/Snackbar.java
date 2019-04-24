// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.support.design.internal.SnackbarContentLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;
import android.widget.TextView;

// Referenced classes of package android.support.design.widget:
//			b, CoordinatorLayout

public final class Snackbar extends b
{
	public static final class SnackbarLayout extends b.f
	{

		protected void onMeasure(int i, int j)
		{
			super.onMeasure(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #19  <Method void b$f.onMeasure(int, int)>
			j = getChildCount();
		//    4    6:aload_0         
		//    5    7:invokevirtual   #23  <Method int getChildCount()>
		//    6   10:istore_2        
			int k = getMeasuredWidth();
		//    7   11:aload_0         
		//    8   12:invokevirtual   #26  <Method int getMeasuredWidth()>
		//    9   15:istore_3        
			int l = getPaddingLeft();
		//   10   16:aload_0         
		//   11   17:invokevirtual   #29  <Method int getPaddingLeft()>
		//   12   20:istore          4
			int i1 = getPaddingRight();
		//   13   22:aload_0         
		//   14   23:invokevirtual   #32  <Method int getPaddingRight()>
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
		//   23   37:invokevirtual   #36  <Method View getChildAt(int)>
		//   24   40:astore          6
				if(view.getLayoutParams().width == -1)
		//*  25   42:aload           6
		//*  26   44:invokevirtual   #42  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//*  27   47:getfield        #48  <Field int android.view.ViewGroup$LayoutParams.width>
		//*  28   50:iconst_m1       
		//*  29   51:icmpne          81
					view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k - l - i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
		//   30   54:aload           6
		//   31   56:iload_3         
		//   32   57:iload           4
		//   33   59:isub            
		//   34   60:iload           5
		//   35   62:isub            
		//   36   63:ldc1            #49  <Int 0x40000000>
		//   37   65:invokestatic    #55  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   38   68:aload           6
		//   39   70:invokevirtual   #58  <Method int View.getMeasuredHeight()>
		//   40   73:ldc1            #49  <Int 0x40000000>
		//   41   75:invokestatic    #55  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   42   78:invokevirtual   #61  <Method void View.measure(int, int)>
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
		//    2    2:invokespecial   #11  <Method void b$f(Context)>
		//    3    5:return          
		}

		public SnackbarLayout(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void b$f(Context, AttributeSet)>
		//    4    6:return          
		}
	}


	private Snackbar(ViewGroup viewgroup, View view, b.c c)
	{
		super(viewgroup, view, c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #14  <Method void b(ViewGroup, View, b$c)>
	//    5    7:return          
	}

	public static Snackbar a(View view, CharSequence charsequence, int i)
	{
		view = ((View) (a(view)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #20  <Method ViewGroup a(View)>
	//    2    4:astore_0        
		if(view == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       19
		{
			throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
	//    5    9:new             #22  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #24  <String "No suitable parent found from the given view. Please provide a valid view.">
	//    8   15:invokespecial   #27  <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
		} else
		{
			SnackbarContentLayout snackbarcontentlayout = (SnackbarContentLayout)LayoutInflater.from(((ViewGroup) (view)).getContext()).inflate(android.support.design.a.h.design_layout_snackbar_include, ((ViewGroup) (view)), false);
	//   10   19:aload_0         
	//   11   20:invokevirtual   #33  <Method Context ViewGroup.getContext()>
	//   12   23:invokestatic    #39  <Method LayoutInflater LayoutInflater.from(Context)>
	//   13   26:getstatic       #45  <Field int android.support.design.a$h.design_layout_snackbar_include>
	//   14   29:aload_0         
	//   15   30:iconst_0        
	//   16   31:invokevirtual   #49  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   17   34:checkcast       #51  <Class SnackbarContentLayout>
	//   18   37:astore_3        
			view = ((View) (new Snackbar(((ViewGroup) (view)), ((View) (snackbarcontentlayout)), ((b.c) (snackbarcontentlayout)))));
	//   19   38:new             #2   <Class Snackbar>
	//   20   41:dup             
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:aload_3         
	//   24   45:invokespecial   #52  <Method void Snackbar(ViewGroup, View, b$c)>
	//   25   48:astore_0        
			((Snackbar) (view)).a(charsequence);
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #55  <Method Snackbar a(CharSequence)>
	//   29   54:pop             
			((Snackbar) (view)).a(i);
	//   30   55:aload_0         
	//   31   56:iload_2         
	//   32   57:invokevirtual   #58  <Method b a(int)>
	//   33   60:pop             
			return ((Snackbar) (view));
	//   34   61:aload_0         
	//   35   62:areturn         
		}
	}

	private static ViewGroup a(View view)
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
	//*   5    5:instanceof      #60  <Class CoordinatorLayout>
	//*   6    8:ifeq            16
				return (ViewGroup)view1;
	//    7   11:aload_2         
	//    8   12:checkcast       #29  <Class ViewGroup>
	//    9   15:areturn         
			viewgroup = viewgroup1;
	//   10   16:aload_3         
	//   11   17:astore_1        
			if(view1 instanceof FrameLayout)
	//*  12   18:aload_2         
	//*  13   19:instanceof      #62  <Class FrameLayout>
	//*  14   22:ifeq            44
			{
				if(view1.getId() == 0x1020002)
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #68  <Method int View.getId()>
	//*  17   29:ldc1            #69  <Int 0x1020002>
	//*  18   31:icmpne          39
					return (ViewGroup)view1;
	//   19   34:aload_2         
	//   20   35:checkcast       #29  <Class ViewGroup>
	//   21   38:areturn         
				viewgroup = (ViewGroup)view1;
	//   22   39:aload_2         
	//   23   40:checkcast       #29  <Class ViewGroup>
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
	//   30   51:invokevirtual   #73  <Method android.view.ViewParent View.getParent()>
	//   31   54:astore_0        
				if(view instanceof View)
	//*  32   55:aload_0         
	//*  33   56:instanceof      #64  <Class View>
	//*  34   59:ifeq            70
					view = (View)view;
	//   35   62:aload_0         
	//   36   63:checkcast       #64  <Class View>
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

	public Snackbar a(int i, android.view.View.OnClickListener onclicklistener)
	{
		return a(a().getText(i), onclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #76  <Method Context a()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #82  <Method CharSequence Context.getText(int)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #85  <Method Snackbar a(CharSequence, android.view.View$OnClickListener)>
	//    7   13:areturn         
	}

	public Snackbar a(CharSequence charsequence)
	{
		((SnackbarContentLayout)b.getChildAt(0)).getMessageView().setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field b$f b>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #95  <Method View b$f.getChildAt(int)>
	//    4    8:checkcast       #51  <Class SnackbarContentLayout>
	//    5   11:invokevirtual   #99  <Method TextView SnackbarContentLayout.getMessageView()>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #105 <Method void TextView.setText(CharSequence)>
		return this;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public Snackbar a(CharSequence charsequence, android.view.View.OnClickListener onclicklistener)
	{
		android.widget.Button button = ((SnackbarContentLayout)b.getChildAt(0)).getActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field b$f b>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #95  <Method View b$f.getChildAt(int)>
	//    4    8:checkcast       #51  <Class SnackbarContentLayout>
	//    5   11:invokevirtual   #109 <Method android.widget.Button SnackbarContentLayout.getActionView()>
	//    6   14:astore_3        
		if(!TextUtils.isEmpty(charsequence) && onclicklistener != null)
	//*   7   15:aload_1         
	//*   8   16:invokestatic    #115 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   19:ifne            52
	//*  10   22:aload_2         
	//*  11   23:ifnonnull       29
	//*  12   26:goto            52
		{
			((TextView) (button)).setVisibility(0);
	//   13   29:aload_3         
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #119 <Method void TextView.setVisibility(int)>
			((TextView) (button)).setText(charsequence);
	//   16   34:aload_3         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #105 <Method void TextView.setText(CharSequence)>
			charsequence = ((CharSequence) (new android.view.View.OnClickListener(onclicklistener) {

				public void onClick(View view)
				{
					a.onClick(view);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field android.view.View$OnClickListener a>
				//    2    4:aload_1         
				//    3    5:invokeinterface #28  <Method void android.view.View$OnClickListener.onClick(View)>
					b.b(1);
				//    4   10:aload_0         
				//    5   11:getfield        #18  <Field Snackbar b>
				//    6   14:iconst_1        
				//    7   15:invokevirtual   #31  <Method void Snackbar.b(int)>
				//    8   18:return          
				}

				final android.view.View.OnClickListener a;
				final Snackbar b;

			
			{
				b = Snackbar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Snackbar b>
				a = onclicklistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field android.view.View$OnClickListener a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   19   39:new             #7   <Class Snackbar$1>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:aload_2         
	//   23   45:invokespecial   #122 <Method void Snackbar$1(Snackbar, android.view.View$OnClickListener)>
	//   24   48:astore_1        
		} else
	//*  25   49:goto            60
		{
			((TextView) (button)).setVisibility(8);
	//   26   52:aload_3         
	//   27   53:bipush          8
	//   28   55:invokevirtual   #119 <Method void TextView.setVisibility(int)>
			charsequence = null;
	//   29   58:aconst_null     
	//   30   59:astore_1        
		}
		((TextView) (button)).setOnClickListener(((android.view.View.OnClickListener) (charsequence)));
	//   31   60:aload_3         
	//   32   61:aload_1         
	//   33   62:invokevirtual   #126 <Method void TextView.setOnClickListener(android.view.View$OnClickListener)>
		return this;
	//   34   65:aload_0         
	//   35   66:areturn         
	}
}
