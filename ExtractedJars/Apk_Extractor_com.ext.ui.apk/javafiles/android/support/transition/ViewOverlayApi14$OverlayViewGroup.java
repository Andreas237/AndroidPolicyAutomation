// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.view.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

// Referenced classes of package android.support.transition:
//			ViewOverlayApi14

static class ViewOverlayApi14$OverlayViewGroup extends ViewGroup
{
	static class TouchInterceptor extends View
	{

		TouchInterceptor(Context context)
		{
			super(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void View(Context)>
		//    3    5:return          
		}
	}


	private void getOffset(int ai[])
	{
		int ai1[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore_2        
		int ai2[] = new int[2];
	//    3    4:iconst_2        
	//    4    5:newarray        int[]
	//    5    7:astore_3        
		mHostView.getLocationOnScreen(ai1);
	//    6    8:aload_0         
	//    7    9:getfield        #53  <Field ViewGroup mHostView>
	//    8   12:aload_2         
	//    9   13:invokevirtual   #80  <Method void ViewGroup.getLocationOnScreen(int[])>
		mRequestingView.getLocationOnScreen(ai2);
	//   10   16:aload_0         
	//   11   17:getfield        #55  <Field View mRequestingView>
	//   12   20:aload_3         
	//   13   21:invokevirtual   #83  <Method void View.getLocationOnScreen(int[])>
		ai[0] = ai2[0] - ai1[0];
	//   14   24:aload_1         
	//   15   25:iconst_0        
	//   16   26:aload_3         
	//   17   27:iconst_0        
	//   18   28:iaload          
	//   19   29:aload_2         
	//   20   30:iconst_0        
	//   21   31:iaload          
	//   22   32:isub            
	//   23   33:iastore         
		ai[1] = ai2[1] - ai1[1];
	//   24   34:aload_1         
	//   25   35:iconst_1        
	//   26   36:aload_3         
	//   27   37:iconst_1        
	//   28   38:iaload          
	//   29   39:aload_2         
	//   30   40:iconst_1        
	//   31   41:iaload          
	//   32   42:isub            
	//   33   43:iastore         
	//   34   44:return          
	}

	public void add(Drawable drawable)
	{
		if(mDrawables == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field ArrayList mDrawables>
	//*   2    4:ifnonnull       18
			mDrawables = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #87  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #89  <Method void ArrayList()>
	//    7   15:putfield        #51  <Field ArrayList mDrawables>
		if(!mDrawables.contains(((Object) (drawable))))
	//*   8   18:aload_0         
	//*   9   19:getfield        #51  <Field ArrayList mDrawables>
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #93  <Method boolean ArrayList.contains(Object)>
	//*  12   26:ifne            51
		{
			mDrawables.add(((Object) (drawable)));
	//   13   29:aload_0         
	//   14   30:getfield        #51  <Field ArrayList mDrawables>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #95  <Method boolean ArrayList.add(Object)>
	//   17   37:pop             
			invalidate(drawable.getBounds());
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokevirtual   #101 <Method Rect Drawable.getBounds()>
	//   21   43:invokevirtual   #105 <Method void invalidate(Rect)>
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:invokevirtual   #109 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		}
	//   25   51:return          
	}

	public void add(View view)
	{
		if(view.getParent() instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #113 <Method ViewParent View.getParent()>
	//*   2    4:instanceof      #4   <Class ViewGroup>
	//*   3    7:ifeq            104
		{
			ViewGroup viewgroup = (ViewGroup)view.getParent();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #113 <Method ViewParent View.getParent()>
	//    6   14:checkcast       #4   <Class ViewGroup>
	//    7   17:astore_2        
			if(viewgroup != mHostView && viewgroup.getParent() != null && ViewCompat.isAttachedToWindow(((View) (viewgroup))))
	//*   8   18:aload_2         
	//*   9   19:aload_0         
	//*  10   20:getfield        #53  <Field ViewGroup mHostView>
	//*  11   23:if_acmpeq       87
	//*  12   26:aload_2         
	//*  13   27:invokevirtual   #114 <Method ViewParent ViewGroup.getParent()>
	//*  14   30:ifnull          87
	//*  15   33:aload_2         
	//*  16   34:invokestatic    #120 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  17   37:ifeq            87
			{
				int ai[] = new int[2];
	//   18   40:iconst_2        
	//   19   41:newarray        int[]
	//   20   43:astore_3        
				int ai1[] = new int[2];
	//   21   44:iconst_2        
	//   22   45:newarray        int[]
	//   23   47:astore          4
				viewgroup.getLocationOnScreen(ai);
	//   24   49:aload_2         
	//   25   50:aload_3         
	//   26   51:invokevirtual   #80  <Method void ViewGroup.getLocationOnScreen(int[])>
				mHostView.getLocationOnScreen(ai1);
	//   27   54:aload_0         
	//   28   55:getfield        #53  <Field ViewGroup mHostView>
	//   29   58:aload           4
	//   30   60:invokevirtual   #80  <Method void ViewGroup.getLocationOnScreen(int[])>
				ViewCompat.offsetLeftAndRight(view, ai[0] - ai1[0]);
	//   31   63:aload_1         
	//   32   64:aload_3         
	//   33   65:iconst_0        
	//   34   66:iaload          
	//   35   67:aload           4
	//   36   69:iconst_0        
	//   37   70:iaload          
	//   38   71:isub            
	//   39   72:invokestatic    #124 <Method void ViewCompat.offsetLeftAndRight(View, int)>
				ViewCompat.offsetTopAndBottom(view, ai[1] - ai1[1]);
	//   40   75:aload_1         
	//   41   76:aload_3         
	//   42   77:iconst_1        
	//   43   78:iaload          
	//   44   79:aload           4
	//   45   81:iconst_1        
	//   46   82:iaload          
	//   47   83:isub            
	//   48   84:invokestatic    #127 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			}
			viewgroup.removeView(view);
	//   49   87:aload_2         
	//   50   88:aload_1         
	//   51   89:invokevirtual   #130 <Method void ViewGroup.removeView(View)>
			if(view.getParent() != null)
	//*  52   92:aload_1         
	//*  53   93:invokevirtual   #113 <Method ViewParent View.getParent()>
	//*  54   96:ifnull          104
				viewgroup.removeView(view);
	//   55   99:aload_2         
	//   56  100:aload_1         
	//   57  101:invokevirtual   #130 <Method void ViewGroup.removeView(View)>
		}
		super.addView(view, getChildCount() - 1);
	//   58  104:aload_0         
	//   59  105:aload_1         
	//   60  106:aload_0         
	//   61  107:invokevirtual   #133 <Method int getChildCount()>
	//   62  110:iconst_1        
	//   63  111:isub            
	//   64  112:invokespecial   #135 <Method void ViewGroup.addView(View, int)>
	//   65  115:return          
	}

	public void clear()
	{
		removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method void removeAllViews()>
		if(mDrawables != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field ArrayList mDrawables>
	//*   4    8:ifnull          18
			mDrawables.clear();
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field ArrayList mDrawables>
	//    7   15:invokevirtual   #141 <Method void ArrayList.clear()>
	//    8   18:return          
	}

	protected void dispatchDraw(Canvas canvas)
	{
		int ai[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore          4
		int ai1[] = new int[2];
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:astore          5
		mHostView.getLocationOnScreen(ai);
	//    6   10:aload_0         
	//    7   11:getfield        #53  <Field ViewGroup mHostView>
	//    8   14:aload           4
	//    9   16:invokevirtual   #80  <Method void ViewGroup.getLocationOnScreen(int[])>
		mRequestingView.getLocationOnScreen(ai1);
	//   10   19:aload_0         
	//   11   20:getfield        #55  <Field View mRequestingView>
	//   12   23:aload           5
	//   13   25:invokevirtual   #83  <Method void View.getLocationOnScreen(int[])>
		canvas.translate(ai1[0] - ai[0], ai1[1] - ai[1]);
	//   14   28:aload_1         
	//   15   29:aload           5
	//   16   31:iconst_0        
	//   17   32:iaload          
	//   18   33:aload           4
	//   19   35:iconst_0        
	//   20   36:iaload          
	//   21   37:isub            
	//   22   38:i2f             
	//   23   39:aload           5
	//   24   41:iconst_1        
	//   25   42:iaload          
	//   26   43:aload           4
	//   27   45:iconst_1        
	//   28   46:iaload          
	//   29   47:isub            
	//   30   48:i2f             
	//   31   49:invokevirtual   #149 <Method void Canvas.translate(float, float)>
		canvas.clipRect(new Rect(0, 0, mRequestingView.getWidth(), mRequestingView.getHeight()));
	//   32   52:aload_1         
	//   33   53:new             #37  <Class Rect>
	//   34   56:dup             
	//   35   57:iconst_0        
	//   36   58:iconst_0        
	//   37   59:aload_0         
	//   38   60:getfield        #55  <Field View mRequestingView>
	//   39   63:invokevirtual   #150 <Method int View.getWidth()>
	//   40   66:aload_0         
	//   41   67:getfield        #55  <Field View mRequestingView>
	//   42   70:invokevirtual   #151 <Method int View.getHeight()>
	//   43   73:invokespecial   #154 <Method void Rect(int, int, int, int)>
	//   44   76:invokevirtual   #158 <Method boolean Canvas.clipRect(Rect)>
	//   45   79:pop             
		super.dispatchDraw(canvas);
	//   46   80:aload_0         
	//   47   81:aload_1         
	//   48   82:invokespecial   #160 <Method void ViewGroup.dispatchDraw(Canvas)>
		int i;
		int j;
		if(mDrawables == null)
	//*  49   85:aload_0         
	//*  50   86:getfield        #51  <Field ArrayList mDrawables>
	//*  51   89:ifnonnull       123
			i = 0;
	//   52   92:iconst_0        
	//   53   93:istore_2        
		else
	//*  54   94:iconst_0        
	//*  55   95:istore_3        
	//*  56   96:iload_3         
	//*  57   97:iload_2         
	//*  58   98:icmpge          134
	//*  59  101:aload_0         
	//*  60  102:getfield        #51  <Field ArrayList mDrawables>
	//*  61  105:iload_3         
	//*  62  106:invokevirtual   #164 <Method Object ArrayList.get(int)>
	//*  63  109:checkcast       #97  <Class Drawable>
	//*  64  112:aload_1         
	//*  65  113:invokevirtual   #167 <Method void Drawable.draw(Canvas)>
	//*  66  116:iload_3         
	//*  67  117:iconst_1        
	//*  68  118:iadd            
	//*  69  119:istore_3        
	//*  70  120:goto            96
			i = mDrawables.size();
	//   71  123:aload_0         
	//   72  124:getfield        #51  <Field ArrayList mDrawables>
	//   73  127:invokevirtual   #170 <Method int ArrayList.size()>
	//   74  130:istore_2        
		for(j = 0; j < i; j++)
			((Drawable)mDrawables.get(j)).draw(canvas);

	//*  75  131:goto            94
	//   76  134:return          
	}

	public boolean dispatchTouchEvent(MotionEvent motionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void invalidateChildFast(View view, Rect rect)
	{
		if(mHostView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field ViewGroup mHostView>
	//*   2    4:ifnull          50
		{
			int i = view.getLeft();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #177 <Method int View.getLeft()>
	//    5   11:istore_3        
			int j = view.getTop();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #180 <Method int View.getTop()>
	//    8   16:istore          4
			view = ((View) (new int[2]));
	//    9   18:iconst_2        
	//   10   19:newarray        int[]
	//   11   21:astore_1        
			getOffset(((int []) (view)));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #182 <Method void getOffset(int[])>
			rect.offset(i + view[0], j + view[1]);
	//   15   27:aload_2         
	//   16   28:iload_3         
	//   17   29:aload_1         
	//   18   30:iconst_0        
	//   19   31:iaload          
	//   20   32:iadd            
	//   21   33:iload           4
	//   22   35:aload_1         
	//   23   36:iconst_1        
	//   24   37:iaload          
	//   25   38:iadd            
	//   26   39:invokevirtual   #186 <Method void Rect.offset(int, int)>
			mHostView.invalidate(rect);
	//   27   42:aload_0         
	//   28   43:getfield        #53  <Field ViewGroup mHostView>
	//   29   46:aload_2         
	//   30   47:invokevirtual   #187 <Method void ViewGroup.invalidate(Rect)>
		}
	//   31   50:return          
	}

	public ViewParent invalidateChildInParent(int ai[], Rect rect)
	{
		if(mHostView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field ViewGroup mHostView>
	//*   2    4:ifnull          66
		{
			rect.offset(ai[0], ai[1]);
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:iaload          
	//    7   11:aload_1         
	//    8   12:iconst_1        
	//    9   13:iaload          
	//   10   14:invokevirtual   #186 <Method void Rect.offset(int, int)>
			if(mHostView instanceof ViewGroup)
	//*  11   17:aload_0         
	//*  12   18:getfield        #53  <Field ViewGroup mHostView>
	//*  13   21:instanceof      #4   <Class ViewGroup>
	//*  14   24:ifeq            61
			{
				ai[0] = 0;
	//   15   27:aload_1         
	//   16   28:iconst_0        
	//   17   29:iconst_0        
	//   18   30:iastore         
				ai[1] = 0;
	//   19   31:aload_1         
	//   20   32:iconst_1        
	//   21   33:iconst_0        
	//   22   34:iastore         
				int ai1[] = new int[2];
	//   23   35:iconst_2        
	//   24   36:newarray        int[]
	//   25   38:astore_3        
				getOffset(ai1);
	//   26   39:aload_0         
	//   27   40:aload_3         
	//   28   41:invokespecial   #182 <Method void getOffset(int[])>
				rect.offset(ai1[0], ai1[1]);
	//   29   44:aload_2         
	//   30   45:aload_3         
	//   31   46:iconst_0        
	//   32   47:iaload          
	//   33   48:aload_3         
	//   34   49:iconst_1        
	//   35   50:iaload          
	//   36   51:invokevirtual   #186 <Method void Rect.offset(int, int)>
				return super.invalidateChildInParent(ai, rect);
	//   37   54:aload_0         
	//   38   55:aload_1         
	//   39   56:aload_2         
	//   40   57:invokespecial   #191 <Method ViewParent ViewGroup.invalidateChildInParent(int[], Rect)>
	//   41   60:areturn         
			}
			invalidate(rect);
	//   42   61:aload_0         
	//   43   62:aload_2         
	//   44   63:invokevirtual   #105 <Method void invalidate(Rect)>
		}
		return null;
	//   45   66:aconst_null     
	//   46   67:areturn         
	}

	protected ViewParent invalidateChildInParentFast(int i, int j, Rect rect)
	{
		if((mHostView instanceof ViewGroup) && sInvalidateChildInParentFastMethod != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field ViewGroup mHostView>
	//*   2    4:instanceof      #4   <Class ViewGroup>
	//*   3    7:ifeq            56
	//*   4   10:getstatic       #43  <Field Method sInvalidateChildInParentFastMethod>
	//*   5   13:ifnull          56
			try
			{
				getOffset(new int[2]);
	//    6   16:aload_0         
	//    7   17:iconst_2        
	//    8   18:newarray        int[]
	//    9   20:invokespecial   #182 <Method void getOffset(int[])>
				sInvalidateChildInParentFastMethod.invoke(((Object) (mHostView)), new Object[] {
					Integer.valueOf(i), Integer.valueOf(j), rect
				});
	//   10   23:getstatic       #43  <Field Method sInvalidateChildInParentFastMethod>
	//   11   26:aload_0         
	//   12   27:getfield        #53  <Field ViewGroup mHostView>
	//   13   30:iconst_3        
	//   14   31:anewarray       Object[]
	//   15   34:dup             
	//   16   35:iconst_0        
	//   17   36:iload_1         
	//   18   37:invokestatic    #206 <Method Integer Integer.valueOf(int)>
	//   19   40:aastore         
	//   20   41:dup             
	//   21   42:iconst_1        
	//   22   43:iload_2         
	//   23   44:invokestatic    #206 <Method Integer Integer.valueOf(int)>
	//   24   47:aastore         
	//   25   48:dup             
	//   26   49:iconst_2        
	//   27   50:aload_3         
	//   28   51:aastore         
	//   29   52:invokevirtual   #212 <Method Object Method.invoke(Object, Object[])>
	//   30   55:pop             
			}
	//*  31   56:aconst_null     
	//*  32   57:areturn         
			// Misplaced declaration of an exception variable
			catch(Rect rect)
	//*  33   58:astore_3        
			{
				((IllegalAccessException) (rect)).printStackTrace();
	//   34   59:aload_3         
	//   35   60:invokevirtual   #215 <Method void IllegalAccessException.printStackTrace()>
			}
	//*  36   63:goto            56
			// Misplaced declaration of an exception variable
			catch(Rect rect)
	//*  37   66:astore_3        
			{
				((InvocationTargetException) (rect)).printStackTrace();
	//   38   67:aload_3         
	//   39   68:invokevirtual   #216 <Method void InvocationTargetException.printStackTrace()>
			}
		return null;
	//*  40   71:goto            56
	}

	public void invalidateDrawable(Drawable drawable)
	{
		invalidate(drawable.getBounds());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #101 <Method Rect Drawable.getBounds()>
	//    3    5:invokevirtual   #105 <Method void invalidate(Rect)>
	//    4    8:return          
	}

	boolean isEmpty()
	{
		return getChildCount() == 0 && (mDrawables == null || mDrawables.size() == 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method int getChildCount()>
	//    2    4:ifne            26
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field ArrayList mDrawables>
	//    5   11:ifnull          24
	//    6   14:aload_0         
	//    7   15:getfield        #51  <Field ArrayList mDrawables>
	//    8   18:invokevirtual   #170 <Method int ArrayList.size()>
	//    9   21:ifne            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
	//    0    0:return          
	}

	public void remove(Drawable drawable)
	{
		if(mDrawables != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field ArrayList mDrawables>
	//*   2    4:ifnull          29
		{
			mDrawables.remove(((Object) (drawable)));
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field ArrayList mDrawables>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #227 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
			invalidate(drawable.getBounds());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #101 <Method Rect Drawable.getBounds()>
	//   11   21:invokevirtual   #105 <Method void invalidate(Rect)>
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   12   24:aload_1         
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #109 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		}
	//   15   29:return          
	}

	public void remove(View view)
	{
		super.removeView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method void ViewGroup.removeView(View)>
		if(isEmpty())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #229 <Method boolean isEmpty()>
	//*   5    9:ifeq            20
			mHostView.removeView(((View) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #53  <Field ViewGroup mHostView>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #130 <Method void ViewGroup.removeView(View)>
	//   10   20:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || mDrawables != null && mDrawables.contains(((Object) (drawable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #233 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            26
	//    4    8:aload_0         
	//    5    9:getfield        #51  <Field ArrayList mDrawables>
	//    6   12:ifnull          28
	//    7   15:aload_0         
	//    8   16:getfield        #51  <Field ArrayList mDrawables>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #93  <Method boolean ArrayList.contains(Object)>
	//   11   23:ifeq            28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	static Method sInvalidateChildInParentFastMethod;
	ArrayList mDrawables;
	ViewGroup mHostView;
	View mRequestingView;
	ViewOverlayApi14 mViewOverlay;

	static 
	{
		try
		{
			sInvalidateChildInParentFastMethod = ((Class) (android/view/ViewGroup)).getDeclaredMethod("invalidateChildInParentFast", new Class[] {
				Integer.TYPE, Integer.TYPE, android/graphics/Rect
			});
	//    0    0:ldc1            #4   <Class ViewGroup>
	//    1    2:ldc1            #27  <String "invalidateChildInParentFast">
	//    2    4:iconst_3        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #35  <Field Class Integer.TYPE>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:getstatic       #35  <Field Class Integer.TYPE>
	//   11   19:aastore         
	//   12   20:dup             
	//   13   21:iconst_2        
	//   14   22:ldc1            #37  <Class Rect>
	//   15   24:aastore         
	//   16   25:invokevirtual   #41  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   17   28:putstatic       #43  <Field Method sInvalidateChildInParentFastMethod>
	//   18   31:return          
		}
		catch(NoSuchMethodException nosuchmethodexception) { }
	//   19   32:astore_0        
	//*  20   33:return          
	}

	ViewOverlayApi14$OverlayViewGroup(Context context, ViewGroup viewgroup, View view, ViewOverlayApi14 viewoverlayapi14)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void ViewGroup(Context)>
		mDrawables = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #51  <Field ArrayList mDrawables>
		mHostView = viewgroup;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #53  <Field ViewGroup mHostView>
		mRequestingView = view;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #55  <Field View mRequestingView>
		setRight(viewgroup.getWidth());
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:invokevirtual   #59  <Method int ViewGroup.getWidth()>
	//   15   25:invokevirtual   #63  <Method void setRight(int)>
		setBottom(viewgroup.getHeight());
	//   16   28:aload_0         
	//   17   29:aload_2         
	//   18   30:invokevirtual   #66  <Method int ViewGroup.getHeight()>
	//   19   33:invokevirtual   #69  <Method void setBottom(int)>
		viewgroup.addView(((View) (this)));
	//   20   36:aload_2         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #73  <Method void ViewGroup.addView(View)>
		mViewOverlay = viewoverlayapi14;
	//   23   41:aload_0         
	//   24   42:aload           4
	//   25   44:putfield        #75  <Field ViewOverlayApi14 mViewOverlay>
	//   26   47:return          
	}
}
