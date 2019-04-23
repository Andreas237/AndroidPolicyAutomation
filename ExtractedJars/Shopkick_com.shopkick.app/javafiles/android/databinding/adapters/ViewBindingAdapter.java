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
	//    1    1:invokespecial   #85  <Method void Object()>
	//    2    4:return          
	}

	private static int pixelsToDimensionPixelSize(float f)
	{
		int i = (int)(0.5F + f);
	//    0    0:ldc1            #89  <Float 0.5F>
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
		i = f != 0.0F;
	//    9   12:fload_0         
	//   10   13:fconst_0        
	//   11   14:fcmpl           
	//   12   15:istore_1        
		if(i == 0)
	//*  13   16:iload_1         
	//*  14   17:ifne            22
			return 0;
	//   15   20:iconst_0        
	//   16   21:ireturn         
		return i <= 0 ? -1 : 1;
	//   17   22:iload_1         
	//   18   23:ifle            28
	//   19   26:iconst_1        
	//   20   27:ireturn         
	//   21   28:iconst_m1       
	//   22   29:ireturn         
	}

	public static void setBackground(View view, Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          14
		{
			view.setBackground(drawable);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #103 <Method void View.setBackground(Drawable)>
			return;
	//    6   13:return          
		} else
		{
			view.setBackgroundDrawable(drawable);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #106 <Method void View.setBackgroundDrawable(Drawable)>
			return;
	//   10   19:return          
		}
	}

	public static void setClickListener(View view, android.view.View.OnClickListener onclicklistener, boolean flag)
	{
		view.setOnClickListener(onclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #114 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		view.setClickable(flag);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #118 <Method void View.setClickable(boolean)>
	//    6   10:return          
	}

	public static void setOnAttachStateChangeListener(View view, OnViewDetachedFromWindow onviewdetachedfromwindow, OnViewAttachedToWindow onviewattachedtowindow)
	{
		if(onviewdetachedfromwindow == null && onviewattachedtowindow == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       13
			onviewdetachedfromwindow = null;
	//    4    8:aconst_null     
	//    5    9:astore_1        
		else
	//*   6   10:goto            23
			onviewdetachedfromwindow = ((OnViewDetachedFromWindow) (new android.view.View.OnAttachStateChangeListener(onviewattachedtowindow, onviewdetachedfromwindow) {

				public void onViewAttachedToWindow(View view1)
				{
					OnViewAttachedToWindow onviewattachedtowindow1 = attach;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field ViewBindingAdapter$OnViewAttachedToWindow val$attach>
				//    2    4:astore_2        
					if(onviewattachedtowindow1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          16
						onviewattachedtowindow1.onViewAttachedToWindow(view1);
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #31  <Method void ViewBindingAdapter$OnViewAttachedToWindow.onViewAttachedToWindow(View)>
				//    8   16:return          
				}

				public void onViewDetachedFromWindow(View view1)
				{
					OnViewDetachedFromWindow onviewdetachedfromwindow1 = detach;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field ViewBindingAdapter$OnViewDetachedFromWindow val$detach>
				//    2    4:astore_2        
					if(onviewdetachedfromwindow1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          16
						onviewdetachedfromwindow1.onViewDetachedFromWindow(view1);
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #36  <Method void ViewBindingAdapter$OnViewDetachedFromWindow.onViewDetachedFromWindow(View)>
				//    8   16:return          
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
	//    7   13:new             #6   <Class ViewBindingAdapter$1>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokespecial   #126 <Method void ViewBindingAdapter$1(ViewBindingAdapter$OnViewAttachedToWindow, ViewBindingAdapter$OnViewDetachedFromWindow)>
	//   12   22:astore_1        
		onviewattachedtowindow = ((OnViewAttachedToWindow) ((android.view.View.OnAttachStateChangeListener)ListenerUtil.trackListener(view, ((Object) (onviewdetachedfromwindow)), com.android.databinding.library.baseAdapters.R.id.onAttachStateChangeListener)));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:getstatic       #131 <Field int com.android.databinding.library.baseAdapters.R$id.onAttachStateChangeListener>
	//   16   28:invokestatic    #137 <Method Object ListenerUtil.trackListener(View, Object, int)>
	//   17   31:checkcast       #139 <Class android.view.View$OnAttachStateChangeListener>
	//   18   34:astore_2        
		if(onviewattachedtowindow != null)
	//*  19   35:aload_2         
	//*  20   36:ifnull          44
			view.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (onviewattachedtowindow)));
	//   21   39:aload_0         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #143 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		if(onviewdetachedfromwindow != null)
	//*  24   44:aload_1         
	//*  25   45:ifnull          53
			view.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (onviewdetachedfromwindow)));
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #146 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//   29   53:return          
	}

	public static void setOnClick(View view, android.view.View.OnClickListener onclicklistener, boolean flag)
	{
		view.setOnClickListener(onclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #114 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		view.setClickable(flag);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #118 <Method void View.setClickable(boolean)>
	//    6   10:return          
	}

	public static void setOnLayoutChangeListener(View view, android.view.View.OnLayoutChangeListener onlayoutchangelistener, android.view.View.OnLayoutChangeListener onlayoutchangelistener1)
	{
		if(onlayoutchangelistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			view.removeOnLayoutChangeListener(onlayoutchangelistener);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #154 <Method void View.removeOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
		if(onlayoutchangelistener1 != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          18
			view.addOnLayoutChangeListener(onlayoutchangelistener1);
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #157 <Method void View.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
	//   10   18:return          
	}

	public static void setOnLongClick(View view, android.view.View.OnLongClickListener onlongclicklistener, boolean flag)
	{
		view.setOnLongClickListener(onlongclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #163 <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		view.setLongClickable(flag);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #166 <Method void View.setLongClickable(boolean)>
	//    6   10:return          
	}

	public static void setOnLongClickListener(View view, android.view.View.OnLongClickListener onlongclicklistener, boolean flag)
	{
		view.setOnLongClickListener(onlongclicklistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #163 <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		view.setLongClickable(flag);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #166 <Method void View.setLongClickable(boolean)>
	//    6   10:return          
	}

	public static void setPadding(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #172 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		view.setPadding(i, i, i, i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iload_2         
	//    6    8:iload_2         
	//    7    9:iload_2         
	//    8   10:invokevirtual   #175 <Method void View.setPadding(int, int, int, int)>
	//    9   13:return          
	}

	public static void setPaddingBottom(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #172 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #181 <Method int View.getPaddingLeft()>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #184 <Method int View.getPaddingTop()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #187 <Method int View.getPaddingRight()>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #175 <Method void View.setPadding(int, int, int, int)>
	//   12   22:return          
	}

	public static void setPaddingEnd(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #172 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   3    5:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          17
	//*   5   10:icmplt          31
		{
			view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
	//    6   13:aload_0         
	//    7   14:aload_0         
	//    8   15:invokevirtual   #192 <Method int View.getPaddingStart()>
	//    9   18:aload_0         
	//   10   19:invokevirtual   #184 <Method int View.getPaddingTop()>
	//   11   22:iload_2         
	//   12   23:aload_0         
	//   13   24:invokevirtual   #195 <Method int View.getPaddingBottom()>
	//   14   27:invokevirtual   #198 <Method void View.setPaddingRelative(int, int, int, int)>
			return;
	//   15   30:return          
		} else
		{
			view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
	//   16   31:aload_0         
	//   17   32:aload_0         
	//   18   33:invokevirtual   #181 <Method int View.getPaddingLeft()>
	//   19   36:aload_0         
	//   20   37:invokevirtual   #184 <Method int View.getPaddingTop()>
	//   21   40:iload_2         
	//   22   41:aload_0         
	//   23   42:invokevirtual   #195 <Method int View.getPaddingBottom()>
	//   24   45:invokevirtual   #175 <Method void View.setPadding(int, int, int, int)>
			return;
	//   25   48:return          
		}
	}

	public static void setPaddingLeft(View view, float f)
	{
		view.setPadding(pixelsToDimensionPixelSize(f), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #172 <Method int pixelsToDimensionPixelSize(float)>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #184 <Method int View.getPaddingTop()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #187 <Method int View.getPaddingRight()>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #195 <Method int View.getPaddingBottom()>
	//    9   17:invokevirtual   #175 <Method void View.setPadding(int, int, int, int)>
	//   10   20:return          
	}

	public static void setPaddingRight(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #172 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #181 <Method int View.getPaddingLeft()>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #184 <Method int View.getPaddingTop()>
	//    8   14:iload_2         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #195 <Method int View.getPaddingBottom()>
	//   11   19:invokevirtual   #175 <Method void View.setPadding(int, int, int, int)>
	//   12   22:return          
	}

	public static void setPaddingStart(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #172 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   3    5:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          17
	//*   5   10:icmplt          31
		{
			view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
	//    6   13:aload_0         
	//    7   14:iload_2         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #184 <Method int View.getPaddingTop()>
	//   10   19:aload_0         
	//   11   20:invokevirtual   #207 <Method int View.getPaddingEnd()>
	//   12   23:aload_0         
	//   13   24:invokevirtual   #195 <Method int View.getPaddingBottom()>
	//   14   27:invokevirtual   #198 <Method void View.setPaddingRelative(int, int, int, int)>
			return;
	//   15   30:return          
		} else
		{
			view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
	//   16   31:aload_0         
	//   17   32:iload_2         
	//   18   33:aload_0         
	//   19   34:invokevirtual   #184 <Method int View.getPaddingTop()>
	//   20   37:aload_0         
	//   21   38:invokevirtual   #187 <Method int View.getPaddingRight()>
	//   22   41:aload_0         
	//   23   42:invokevirtual   #195 <Method int View.getPaddingBottom()>
	//   24   45:invokevirtual   #175 <Method void View.setPadding(int, int, int, int)>
			return;
	//   25   48:return          
		}
	}

	public static void setPaddingTop(View view, float f)
	{
		int i = pixelsToDimensionPixelSize(f);
	//    0    0:fload_1         
	//    1    1:invokestatic    #172 <Method int pixelsToDimensionPixelSize(float)>
	//    2    4:istore_2        
		view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #181 <Method int View.getPaddingLeft()>
	//    6   10:iload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #187 <Method int View.getPaddingRight()>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #195 <Method int View.getPaddingBottom()>
	//   11   19:invokevirtual   #175 <Method void View.setPadding(int, int, int, int)>
	//   12   22:return          
	}

	public static void setRequiresFadingEdge(View view, int i)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if((i & 2) != 0)
	//*   2    2:iload_1         
	//*   3    3:iconst_2        
	//*   4    4:iand            
	//*   5    5:ifeq            13
			flag = true;
	//    6    8:iconst_1        
	//    7    9:istore_2        
		else
	//*   8   10:goto            15
			flag = false;
	//    9   13:iconst_0        
	//   10   14:istore_2        
		if((i & 1) != 0)
	//*  11   15:iload_1         
	//*  12   16:iconst_1        
	//*  13   17:iand            
	//*  14   18:ifeq            23
			flag1 = true;
	//   15   21:iconst_1        
	//   16   22:istore_3        
		view.setVerticalFadingEdgeEnabled(flag);
	//   17   23:aload_0         
	//   18   24:iload_2         
	//   19   25:invokevirtual   #213 <Method void View.setVerticalFadingEdgeEnabled(boolean)>
		view.setHorizontalFadingEdgeEnabled(flag1);
	//   20   28:aload_0         
	//   21   29:iload_3         
	//   22   30:invokevirtual   #216 <Method void View.setHorizontalFadingEdgeEnabled(boolean)>
	//   23   33:return          
	}

	public static final int FADING_EDGE_HORIZONTAL = 1;
	public static final int FADING_EDGE_NONE = 0;
	public static final int FADING_EDGE_VERTICAL = 2;
}
