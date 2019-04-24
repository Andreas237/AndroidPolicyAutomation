// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package android.databinding.adapters:
//			ListenerUtil

public class ViewBindingAdapter
{
	public static interface OnViewAttachedToWindow
	{

		public abstract void onViewAttachedToWindow(View view);
	}

	public static interface OnViewDetachedFromWindow
	{

		public abstract void onViewDetachedFromWindow(View view);
	}


	public ViewBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method void Object()>
	//    2    4:return          
	}

	private static int pixelsToDimensionPixelSize(float f)
	{
		int i = (int)(0.5F + f);
	//    0    0:ldc1            #90  <Float 0.5F>
	//    1    2:fload_0         
	//    2    3:fadd            
	//    3    4:f2i             
	//    4    5:istore_1        
		if(i != 0)
	//*   5    6:iload_1         
	//*   6    7:ifeq            12
			return i;
	//    7   10:iload_1         
	//    8   11:ireturn         
		if(f == 0.0F)
	//*   9   12:fload_0         
	//*  10   13:fconst_0        
	//*  11   14:fcmpl           
	//*  12   15:ifne            20
			return 0;
	//   13   18:iconst_0        
	//   14   19:ireturn         
		return f <= 0.0F ? -1 : 1;
	//   15   20:fload_0         
	//   16   21:fconst_0        
	//   17   22:fcmpl           
	//   18   23:ifle            28
	//   19   26:iconst_1        
	//   20   27:ireturn         
	//   21   28:iconst_m1       
	//   22   29:ireturn         
	}

	public static void setBackground(View view, Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          14
		{
			view.setBackground(drawable);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #104 <Method void View.setBackground(Drawable)>
			return;
	//    6   13:return          
		} else
		{
			view.setBackgroundDrawable(drawable);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #107 <Method void View.setBackgroundDrawable(Drawable)>
			return;
	//   10   19:return          
		}
	}

	public static void setClickListener(View view, android.view.View.OnClickListener onclicklistener, boolean flag)
	{
		view.setOnClickListener(onclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #115 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		view.setClickable(flag);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #119 <Method void View.setClickable(boolean)>
	//    6   10:return          
	}

	public static void setOnAttachStateChangeListener(View view, OnViewDetachedFromWindow onviewdetachedfromwindow, OnViewAttachedToWindow onviewattachedtowindow)
	{
		if(android.os.Build.VERSION.SDK_INT >= 12)
	//*   0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          12
	//*   2    5:icmplt          48
		{
			if(onviewdetachedfromwindow == null && onviewattachedtowindow == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       49
	//*   5   12:aload_2         
	//*   6   13:ifnonnull       49
				onviewdetachedfromwindow = null;
	//    7   16:aconst_null     
	//    8   17:astore_1        
			else
	//*   9   18:aload_0         
	//*  10   19:aload_1         
	//*  11   20:getstatic       #130 <Field int com.android.databinding.library.baseAdapters.R$id.onAttachStateChangeListener>
	//*  12   23:invokestatic    #136 <Method Object ListenerUtil.trackListener(View, Object, int)>
	//*  13   26:checkcast       #138 <Class android.view.View$OnAttachStateChangeListener>
	//*  14   29:astore_2        
	//*  15   30:aload_2         
	//*  16   31:ifnull          39
	//*  17   34:aload_0         
	//*  18   35:aload_2         
	//*  19   36:invokevirtual   #142 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//*  20   39:aload_1         
	//*  21   40:ifnull          48
	//*  22   43:aload_0         
	//*  23   44:aload_1         
	//*  24   45:invokevirtual   #145 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//*  25   48:return          
				onviewdetachedfromwindow = ((OnViewDetachedFromWindow) (new android.view.View.OnAttachStateChangeListener(onviewattachedtowindow, onviewdetachedfromwindow) {

					public void onViewAttachedToWindow(View view1)
					{
						if(attach != null)
					//*   0    0:aload_0         
					//*   1    1:getfield        #19  <Field ViewBindingAdapter$OnViewAttachedToWindow val$attach>
					//*   2    4:ifnull          17
							attach.onViewAttachedToWindow(view1);
					//    3    7:aload_0         
					//    4    8:getfield        #19  <Field ViewBindingAdapter$OnViewAttachedToWindow val$attach>
					//    5   11:aload_1         
					//    6   12:invokeinterface #31  <Method void ViewBindingAdapter$OnViewAttachedToWindow.onViewAttachedToWindow(View)>
					//    7   17:return          
					}

					public void onViewDetachedFromWindow(View view1)
					{
						if(detach != null)
					//*   0    0:aload_0         
					//*   1    1:getfield        #21  <Field ViewBindingAdapter$OnViewDetachedFromWindow val$detach>
					//*   2    4:ifnull          17
							detach.onViewDetachedFromWindow(view1);
					//    3    7:aload_0         
					//    4    8:getfield        #21  <Field ViewBindingAdapter$OnViewDetachedFromWindow val$detach>
					//    5   11:aload_1         
					//    6   12:invokeinterface #36  <Method void ViewBindingAdapter$OnViewDetachedFromWindow.onViewDetachedFromWindow(View)>
					//    7   17:return          
					}

					final OnViewAttachedToWindow val$attach;
					final OnViewDetachedFromWindow val$detach;

			
			{
				attach = onviewattachedtowindow;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewBindingAdapter$OnViewAttachedToWindow val$attach>
				detach = onviewdetachedfromwindow;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ViewBindingAdapter$OnViewDetachedFromWindow val$detach>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
));
	//   26   49:new             #6   <Class ViewBindingAdapter$1>
	//   27   52:dup             
	//   28   53:aload_2         
	//   29   54:aload_1         
	//   30   55:invokespecial   #148 <Method void ViewBindingAdapter$1(ViewBindingAdapter$OnViewAttachedToWindow, ViewBindingAdapter$OnViewDetachedFromWindow)>
	//   31   58:astore_1        
			onviewattachedtowindow = ((OnViewAttachedToWindow) ((android.view.View.OnAttachStateChangeListener)ListenerUtil.trackListener(view, ((Object) (onviewdetachedfromwindow)), com.android.databinding.library.baseAdapters.R.id.onAttachStateChangeListener)));
			if(onviewattachedtowindow != null)
				view.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (onviewattachedtowindow)));
			if(onviewdetachedfromwindow != null)
				view.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (onviewdetachedfromwindow)));
		}
	//*  32   59:goto            18
	}

	public static void setOnClick(View view, android.view.View.OnClickListener onclicklistener, boolean flag)
	{
		view.setOnClickListener(onclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #115 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		view.setClickable(flag);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #119 <Method void View.setClickable(boolean)>
	//    6   10:return          
	}

	public static void setOnLayoutChangeListener(View view, android.view.View.OnLayoutChangeListener onlayoutchangelistener, android.view.View.OnLayoutChangeListener onlayoutchangelistener1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          26
		{
			if(onlayoutchangelistener != null)
	//*   3    8:aload_1         
	//*   4    9:ifnull          17
				view.removeOnLayoutChangeListener(onlayoutchangelistener);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokevirtual   #156 <Method void View.removeOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
			if(onlayoutchangelistener1 != null)
	//*   8   17:aload_2         
	//*   9   18:ifnull          26
				view.addOnLayoutChangeListener(onlayoutchangelistener1);
	//   10   21:aload_0         
	//   11   22:aload_2         
	//   12   23:invokevirtual   #159 <Method void View.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
		}
	//   13   26:return          
	}

	public static void setOnLongClick(View view, android.view.View.OnLongClickListener onlongclicklistener, boolean flag)
	{
		view.setOnLongClickListener(onlongclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #165 <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		view.setLongClickable(flag);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #168 <Method void View.setLongClickable(boolean)>
	//    6   10:return          
	}

	public static void setOnLongClickListener(View view, android.view.View.OnLongClickListener onlongclicklistener, boolean flag)
	{
		view.setOnLongClickListener(onlongclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #165 <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		view.setLongClickable(flag);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #168 <Method void View.setLongClickable(boolean)>
	//    6   10:return          
	}

	public static void setPadding(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #174 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		view.setPadding(i, i, i, i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iload_2         
	//    6    8:iload_2         
	//    7    9:iload_2         
	//    8   10:invokevirtual   #177 <Method void View.setPadding(int, int, int, int)>
	//    9   13:return          
	}

	public static void setPaddingBottom(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #174 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #183 <Method int View.getPaddingLeft()>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #186 <Method int View.getPaddingTop()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #189 <Method int View.getPaddingRight()>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #177 <Method void View.setPadding(int, int, int, int)>
	//   12   22:return          
	}

	public static void setPaddingEnd(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #174 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   3    5:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          17
	//*   5   10:icmplt          31
		{
			view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
	//    6   13:aload_0         
	//    7   14:aload_0         
	//    8   15:invokevirtual   #194 <Method int View.getPaddingStart()>
	//    9   18:aload_0         
	//   10   19:invokevirtual   #186 <Method int View.getPaddingTop()>
	//   11   22:iload_2         
	//   12   23:aload_0         
	//   13   24:invokevirtual   #197 <Method int View.getPaddingBottom()>
	//   14   27:invokevirtual   #200 <Method void View.setPaddingRelative(int, int, int, int)>
			return;
	//   15   30:return          
		} else
		{
			view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
	//   16   31:aload_0         
	//   17   32:aload_0         
	//   18   33:invokevirtual   #183 <Method int View.getPaddingLeft()>
	//   19   36:aload_0         
	//   20   37:invokevirtual   #186 <Method int View.getPaddingTop()>
	//   21   40:iload_2         
	//   22   41:aload_0         
	//   23   42:invokevirtual   #197 <Method int View.getPaddingBottom()>
	//   24   45:invokevirtual   #177 <Method void View.setPadding(int, int, int, int)>
			return;
	//   25   48:return          
		}
	}

	public static void setPaddingLeft(View view, float f)
	{
		view.setPadding(pixelsToDimensionPixelSize(f), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #174 <Method int pixelsToDimensionPixelSize(float)>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #186 <Method int View.getPaddingTop()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #189 <Method int View.getPaddingRight()>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #197 <Method int View.getPaddingBottom()>
	//    9   17:invokevirtual   #177 <Method void View.setPadding(int, int, int, int)>
	//   10   20:return          
	}

	public static void setPaddingRight(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #174 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #183 <Method int View.getPaddingLeft()>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #186 <Method int View.getPaddingTop()>
	//    8   14:iload_2         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #197 <Method int View.getPaddingBottom()>
	//   11   19:invokevirtual   #177 <Method void View.setPadding(int, int, int, int)>
	//   12   22:return          
	}

	public static void setPaddingStart(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #174 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   3    5:getstatic       #99  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          17
	//*   5   10:icmplt          31
		{
			view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
	//    6   13:aload_0         
	//    7   14:iload_2         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #186 <Method int View.getPaddingTop()>
	//   10   19:aload_0         
	//   11   20:invokevirtual   #209 <Method int View.getPaddingEnd()>
	//   12   23:aload_0         
	//   13   24:invokevirtual   #197 <Method int View.getPaddingBottom()>
	//   14   27:invokevirtual   #200 <Method void View.setPaddingRelative(int, int, int, int)>
			return;
	//   15   30:return          
		} else
		{
			view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
	//   16   31:aload_0         
	//   17   32:iload_2         
	//   18   33:aload_0         
	//   19   34:invokevirtual   #186 <Method int View.getPaddingTop()>
	//   20   37:aload_0         
	//   21   38:invokevirtual   #189 <Method int View.getPaddingRight()>
	//   22   41:aload_0         
	//   23   42:invokevirtual   #197 <Method int View.getPaddingBottom()>
	//   24   45:invokevirtual   #177 <Method void View.setPadding(int, int, int, int)>
			return;
	//   25   48:return          
		}
	}

	public static void setPaddingTop(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #174 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #183 <Method int View.getPaddingLeft()>
	//    6   10:iload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #189 <Method int View.getPaddingRight()>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #197 <Method int View.getPaddingBottom()>
	//   11   19:invokevirtual   #177 <Method void View.setPadding(int, int, int, int)>
	//   12   22:return          
	}

	public static void setRequiresFadingEdge(View view, int i)
	{
		boolean flag;
		boolean flag1;
		if((FADING_EDGE_VERTICAL & i) != 0)
	//*   0    0:getstatic       #83  <Field int FADING_EDGE_VERTICAL>
	//*   1    3:iload_1         
	//*   2    4:iand            
	//*   3    5:ifeq            31
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:getstatic       #81  <Field int FADING_EDGE_HORIZONTAL>
	//*   7   13:iload_1         
	//*   8   14:iand            
	//*   9   15:ifeq            36
	//*  10   18:iconst_1        
	//*  11   19:istore_3        
	//*  12   20:aload_0         
	//*  13   21:iload_2         
	//*  14   22:invokevirtual   #215 <Method void View.setVerticalFadingEdgeEnabled(boolean)>
	//*  15   25:aload_0         
	//*  16   26:iload_3         
	//*  17   27:invokevirtual   #218 <Method void View.setHorizontalFadingEdgeEnabled(boolean)>
	//*  18   30:return          
			flag = false;
	//   19   31:iconst_0        
	//   20   32:istore_2        
		if((FADING_EDGE_HORIZONTAL & i) != 0)
			flag1 = true;
		else
	//*  21   33:goto            10
			flag1 = false;
	//   22   36:iconst_0        
	//   23   37:istore_3        
		view.setVerticalFadingEdgeEnabled(flag);
		view.setHorizontalFadingEdgeEnabled(flag1);
	//*  24   38:goto            20
	}

	public static int FADING_EDGE_HORIZONTAL = 1;
	public static int FADING_EDGE_NONE = 0;
	public static int FADING_EDGE_VERTICAL = 2;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #79  <Field int FADING_EDGE_NONE>
	//    2    4:iconst_1        
	//    3    5:putstatic       #81  <Field int FADING_EDGE_HORIZONTAL>
	//    4    8:iconst_2        
	//    5    9:putstatic       #83  <Field int FADING_EDGE_VERTICAL>
	//*   6   12:return          
	}
}
