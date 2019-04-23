// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.support.v4.view.ViewCompat;
import android.view.*;
import android.widget.FrameLayout;

// Referenced classes of package android.support.transition:
//			GhostViewImpl

class GhostViewApi14 extends View
	implements GhostViewImpl
{

	GhostViewApi14(View view)
	{
		super(view.getContext());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method android.content.Context View.getContext()>
	//    3    5:invokespecial   #34  <Method void View(android.content.Context)>
	//    4    8:aload_0         
	//    5    9:new             #36  <Class Matrix>
	//    6   12:dup             
	//    7   13:invokespecial   #39  <Method void Matrix()>
	//    8   16:putfield        #41  <Field Matrix mMatrix>
	//    9   19:aload_0         
	//   10   20:new             #8   <Class GhostViewApi14$1>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #44  <Method void GhostViewApi14$1(GhostViewApi14)>
	//   14   28:putfield        #46  <Field android.view.ViewTreeObserver$OnPreDrawListener mOnPreDrawListener>
		mView = view;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #48  <Field View mView>
		setLayerType(2, ((android.graphics.Paint) (null)));
	//   18   36:aload_0         
	//   19   37:iconst_2        
	//   20   38:aconst_null     
	//   21   39:invokevirtual   #52  <Method void setLayerType(int, android.graphics.Paint)>
	//   22   42:return          
	}

	static GhostViewImpl addGhost(View view, ViewGroup viewgroup)
	{
		GhostViewApi14 ghostviewapi14_1 = getGhostView(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #59  <Method GhostViewApi14 getGhostView(View)>
	//    2    4:astore_3        
		GhostViewApi14 ghostviewapi14 = ghostviewapi14_1;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(ghostviewapi14_1 == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       36
		{
			viewgroup = ((ViewGroup) (findFrameLayout(viewgroup)));
	//    7   11:aload_1         
	//    8   12:invokestatic    #63  <Method FrameLayout findFrameLayout(ViewGroup)>
	//    9   15:astore_1        
			if(viewgroup == null)
	//*  10   16:aload_1         
	//*  11   17:ifnonnull       22
				return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
			ghostviewapi14 = new GhostViewApi14(view);
	//   14   22:new             #2   <Class GhostViewApi14>
	//   15   25:dup             
	//   16   26:aload_0         
	//   17   27:invokespecial   #65  <Method void GhostViewApi14(View)>
	//   18   30:astore_2        
			((FrameLayout) (viewgroup)).addView(((View) (ghostviewapi14)));
	//   19   31:aload_1         
	//   20   32:aload_2         
	//   21   33:invokevirtual   #70  <Method void FrameLayout.addView(View)>
		}
		ghostviewapi14.mReferences = ghostviewapi14.mReferences + 1;
	//   22   36:aload_2         
	//   23   37:aload_2         
	//   24   38:getfield        #72  <Field int mReferences>
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:putfield        #72  <Field int mReferences>
		return ((GhostViewImpl) (ghostviewapi14));
	//   28   46:aload_2         
	//   29   47:areturn         
	}

	private static FrameLayout findFrameLayout(ViewGroup viewgroup)
	{
		for(; !(viewgroup instanceof FrameLayout); viewgroup = (ViewGroup)viewgroup)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #67  <Class FrameLayout>
	//*   2    4:ifne            29
		{
			viewgroup = ((ViewGroup) (viewgroup.getParent()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #78  <Method android.view.ViewParent ViewGroup.getParent()>
	//    5   11:astore_0        
			if(!(viewgroup instanceof ViewGroup))
	//*   6   12:aload_0         
	//*   7   13:instanceof      #74  <Class ViewGroup>
	//*   8   16:ifne            21
				return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		}

	//   11   21:aload_0         
	//   12   22:checkcast       #74  <Class ViewGroup>
	//   13   25:astore_0        
	//*  14   26:goto            0
		return (FrameLayout)viewgroup;
	//   15   29:aload_0         
	//   16   30:checkcast       #67  <Class FrameLayout>
	//   17   33:areturn         
	}

	static GhostViewApi14 getGhostView(View view)
	{
		return (GhostViewApi14)view.getTag(R.id.ghost_view);
	//    0    0:aload_0         
	//    1    1:getstatic       #84  <Field int R$id.ghost_view>
	//    2    4:invokevirtual   #88  <Method Object View.getTag(int)>
	//    3    7:checkcast       #2   <Class GhostViewApi14>
	//    4   10:areturn         
	}

	static void removeGhost(View view)
	{
		view = ((View) (getGhostView(view)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #59  <Method GhostViewApi14 getGhostView(View)>
	//    2    4:astore_0        
		if(view != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          53
		{
			view.mReferences = ((GhostViewApi14) (view)).mReferences - 1;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field int mReferences>
	//    8   14:iconst_1        
	//    9   15:isub            
	//   10   16:putfield        #72  <Field int mReferences>
			if(((GhostViewApi14) (view)).mReferences <= 0)
	//*  11   19:aload_0         
	//*  12   20:getfield        #72  <Field int mReferences>
	//*  13   23:ifgt            53
			{
				Object obj = ((Object) (((GhostViewApi14) (view)).getParent()));
	//   14   26:aload_0         
	//   15   27:invokevirtual   #91  <Method android.view.ViewParent getParent()>
	//   16   30:astore_1        
				if(obj instanceof ViewGroup)
	//*  17   31:aload_1         
	//*  18   32:instanceof      #74  <Class ViewGroup>
	//*  19   35:ifeq            53
				{
					obj = ((Object) ((ViewGroup)obj));
	//   20   38:aload_1         
	//   21   39:checkcast       #74  <Class ViewGroup>
	//   22   42:astore_1        
					((ViewGroup) (obj)).endViewTransition(view);
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:invokevirtual   #94  <Method void ViewGroup.endViewTransition(View)>
					((ViewGroup) (obj)).removeView(view);
	//   26   48:aload_1         
	//   27   49:aload_0         
	//   28   50:invokevirtual   #97  <Method void ViewGroup.removeView(View)>
				}
			}
		}
	//   29   53:return          
	}

	private static void setGhostView(View view, GhostViewApi14 ghostviewapi14)
	{
		view.setTag(R.id.ghost_view, ((Object) (ghostviewapi14)));
	//    0    0:aload_0         
	//    1    1:getstatic       #84  <Field int R$id.ghost_view>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #103 <Method void View.setTag(int, Object)>
	//    4    8:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method void View.onAttachedToWindow()>
		setGhostView(mView, this);
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field View mView>
	//    4    8:aload_0         
	//    5    9:invokestatic    #108 <Method void setGhostView(View, GhostViewApi14)>
		int ai[] = new int[2];
	//    6   12:iconst_2        
	//    7   13:newarray        int[]
	//    8   15:astore_1        
		int ai1[] = new int[2];
	//    9   16:iconst_2        
	//   10   17:newarray        int[]
	//   11   19:astore_2        
		getLocationOnScreen(ai);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #112 <Method void getLocationOnScreen(int[])>
		mView.getLocationOnScreen(ai1);
	//   15   25:aload_0         
	//   16   26:getfield        #48  <Field View mView>
	//   17   29:aload_2         
	//   18   30:invokevirtual   #113 <Method void View.getLocationOnScreen(int[])>
		ai1[0] = (int)((float)ai1[0] - mView.getTranslationX());
	//   19   33:aload_2         
	//   20   34:iconst_0        
	//   21   35:aload_2         
	//   22   36:iconst_0        
	//   23   37:iaload          
	//   24   38:i2f             
	//   25   39:aload_0         
	//   26   40:getfield        #48  <Field View mView>
	//   27   43:invokevirtual   #117 <Method float View.getTranslationX()>
	//   28   46:fsub            
	//   29   47:f2i             
	//   30   48:iastore         
		ai1[1] = (int)((float)ai1[1] - mView.getTranslationY());
	//   31   49:aload_2         
	//   32   50:iconst_1        
	//   33   51:aload_2         
	//   34   52:iconst_1        
	//   35   53:iaload          
	//   36   54:i2f             
	//   37   55:aload_0         
	//   38   56:getfield        #48  <Field View mView>
	//   39   59:invokevirtual   #120 <Method float View.getTranslationY()>
	//   40   62:fsub            
	//   41   63:f2i             
	//   42   64:iastore         
		mDeltaX = ai1[0] - ai[0];
	//   43   65:aload_0         
	//   44   66:aload_2         
	//   45   67:iconst_0        
	//   46   68:iaload          
	//   47   69:aload_1         
	//   48   70:iconst_0        
	//   49   71:iaload          
	//   50   72:isub            
	//   51   73:putfield        #122 <Field int mDeltaX>
		mDeltaY = ai1[1] - ai[1];
	//   52   76:aload_0         
	//   53   77:aload_2         
	//   54   78:iconst_1        
	//   55   79:iaload          
	//   56   80:aload_1         
	//   57   81:iconst_1        
	//   58   82:iaload          
	//   59   83:isub            
	//   60   84:putfield        #124 <Field int mDeltaY>
		mView.getViewTreeObserver().addOnPreDrawListener(mOnPreDrawListener);
	//   61   87:aload_0         
	//   62   88:getfield        #48  <Field View mView>
	//   63   91:invokevirtual   #128 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   64   94:aload_0         
	//   65   95:getfield        #46  <Field android.view.ViewTreeObserver$OnPreDrawListener mOnPreDrawListener>
	//   66   98:invokevirtual   #134 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		mView.setVisibility(4);
	//   67  101:aload_0         
	//   68  102:getfield        #48  <Field View mView>
	//   69  105:iconst_4        
	//   70  106:invokevirtual   #138 <Method void View.setVisibility(int)>
	//   71  109:return          
	}

	protected void onDetachedFromWindow()
	{
		mView.getViewTreeObserver().removeOnPreDrawListener(mOnPreDrawListener);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field View mView>
	//    2    4:invokevirtual   #128 <Method ViewTreeObserver View.getViewTreeObserver()>
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field android.view.ViewTreeObserver$OnPreDrawListener mOnPreDrawListener>
	//    5   11:invokevirtual   #142 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		mView.setVisibility(0);
	//    6   14:aload_0         
	//    7   15:getfield        #48  <Field View mView>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #138 <Method void View.setVisibility(int)>
		setGhostView(mView, ((GhostViewApi14) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #48  <Field View mView>
	//   12   26:aconst_null     
	//   13   27:invokestatic    #108 <Method void setGhostView(View, GhostViewApi14)>
		super.onDetachedFromWindow();
	//   14   30:aload_0         
	//   15   31:invokespecial   #144 <Method void View.onDetachedFromWindow()>
	//   16   34:return          
	}

	protected void onDraw(Canvas canvas)
	{
		mMatrix.set(mCurrentMatrix);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Matrix mMatrix>
	//    2    4:aload_0         
	//    3    5:getfield        #148 <Field Matrix mCurrentMatrix>
	//    4    8:invokevirtual   #152 <Method void Matrix.set(Matrix)>
		mMatrix.postTranslate(mDeltaX, mDeltaY);
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field Matrix mMatrix>
	//    7   15:aload_0         
	//    8   16:getfield        #122 <Field int mDeltaX>
	//    9   19:i2f             
	//   10   20:aload_0         
	//   11   21:getfield        #124 <Field int mDeltaY>
	//   12   24:i2f             
	//   13   25:invokevirtual   #156 <Method boolean Matrix.postTranslate(float, float)>
	//   14   28:pop             
		canvas.setMatrix(mMatrix);
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #41  <Field Matrix mMatrix>
	//   18   34:invokevirtual   #161 <Method void Canvas.setMatrix(Matrix)>
		mView.draw(canvas);
	//   19   37:aload_0         
	//   20   38:getfield        #48  <Field View mView>
	//   21   41:aload_1         
	//   22   42:invokevirtual   #164 <Method void View.draw(Canvas)>
	//   23   45:return          
	}

	public void reserveEndViewTransition(ViewGroup viewgroup, View view)
	{
		mStartParent = viewgroup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #168 <Field ViewGroup mStartParent>
		mStartView = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #170 <Field View mStartView>
	//    6   10:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #138 <Method void View.setVisibility(int)>
		View view = mView;
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field View mView>
	//    5    9:astore_2        
		if(i == 0)
	//*   6   10:iload_1         
	//*   7   11:ifne            19
			i = 4;
	//    8   14:iconst_4        
	//    9   15:istore_1        
		else
	//*  10   16:goto            21
			i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_1        
		view.setVisibility(i);
	//   13   21:aload_2         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #138 <Method void View.setVisibility(int)>
	//   16   26:return          
	}

	Matrix mCurrentMatrix;
	private int mDeltaX;
	private int mDeltaY;
	private final Matrix mMatrix = new Matrix();
	private final android.view.ViewTreeObserver.OnPreDrawListener mOnPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() {

		public boolean onPreDraw()
		{
			GhostViewApi14 ghostviewapi14 = GhostViewApi14.this;
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field GhostViewApi14 this$0>
		//    2    4:astore_1        
			ghostviewapi14.mCurrentMatrix = ghostviewapi14.mView.getMatrix();
		//    3    5:aload_1         
		//    4    6:aload_1         
		//    5    7:getfield        #24  <Field View GhostViewApi14.mView>
		//    6   10:invokevirtual   #30  <Method Matrix View.getMatrix()>
		//    7   13:putfield        #34  <Field Matrix GhostViewApi14.mCurrentMatrix>
			ViewCompat.postInvalidateOnAnimation(((View) (GhostViewApi14.this)));
		//    8   16:aload_0         
		//    9   17:getfield        #14  <Field GhostViewApi14 this$0>
		//   10   20:invokestatic    #40  <Method void ViewCompat.postInvalidateOnAnimation(View)>
			if(mStartParent != null && mStartView != null)
		//*  11   23:aload_0         
		//*  12   24:getfield        #14  <Field GhostViewApi14 this$0>
		//*  13   27:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
		//*  14   30:ifnull          85
		//*  15   33:aload_0         
		//*  16   34:getfield        #14  <Field GhostViewApi14 this$0>
		//*  17   37:getfield        #47  <Field View GhostViewApi14.mStartView>
		//*  18   40:ifnull          85
			{
				mStartParent.endViewTransition(mStartView);
		//   19   43:aload_0         
		//   20   44:getfield        #14  <Field GhostViewApi14 this$0>
		//   21   47:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
		//   22   50:aload_0         
		//   23   51:getfield        #14  <Field GhostViewApi14 this$0>
		//   24   54:getfield        #47  <Field View GhostViewApi14.mStartView>
		//   25   57:invokevirtual   #52  <Method void ViewGroup.endViewTransition(View)>
				ViewCompat.postInvalidateOnAnimation(((View) (mStartParent)));
		//   26   60:aload_0         
		//   27   61:getfield        #14  <Field GhostViewApi14 this$0>
		//   28   64:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
		//   29   67:invokestatic    #40  <Method void ViewCompat.postInvalidateOnAnimation(View)>
				GhostViewApi14 ghostviewapi14_1 = GhostViewApi14.this;
		//   30   70:aload_0         
		//   31   71:getfield        #14  <Field GhostViewApi14 this$0>
		//   32   74:astore_1        
				ghostviewapi14_1.mStartParent = null;
		//   33   75:aload_1         
		//   34   76:aconst_null     
		//   35   77:putfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
				ghostviewapi14_1.mStartView = null;
		//   36   80:aload_1         
		//   37   81:aconst_null     
		//   38   82:putfield        #47  <Field View GhostViewApi14.mStartView>
			}
			return true;
		//   39   85:iconst_1        
		//   40   86:ireturn         
		}

		final GhostViewApi14 this$0;

			
			{
				this$0 = GhostViewApi14.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field GhostViewApi14 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	int mReferences;
	ViewGroup mStartParent;
	View mStartView;
	final View mView;
}
