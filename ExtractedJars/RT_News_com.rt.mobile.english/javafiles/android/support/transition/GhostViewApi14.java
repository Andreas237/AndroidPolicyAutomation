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
	static class Creator
		implements GhostViewImpl.Creator
	{

		private static FrameLayout findFrameLayout(ViewGroup viewgroup)
		{
			for(; !(viewgroup instanceof FrameLayout); viewgroup = (ViewGroup)viewgroup)
		//*   0    0:aload_0         
		//*   1    1:instanceof      #18  <Class FrameLayout>
		//*   2    4:ifne            29
			{
				viewgroup = ((ViewGroup) (viewgroup.getParent()));
		//    3    7:aload_0         
		//    4    8:invokevirtual   #24  <Method android.view.ViewParent ViewGroup.getParent()>
		//    5   11:astore_0        
				if(!(viewgroup instanceof ViewGroup))
		//*   6   12:aload_0         
		//*   7   13:instanceof      #20  <Class ViewGroup>
		//*   8   16:ifne            21
					return null;
		//    9   19:aconst_null     
		//   10   20:areturn         
			}

		//   11   21:aload_0         
		//   12   22:checkcast       #20  <Class ViewGroup>
		//   13   25:astore_0        
		//*  14   26:goto            0
			return (FrameLayout)viewgroup;
		//   15   29:aload_0         
		//   16   30:checkcast       #18  <Class FrameLayout>
		//   17   33:areturn         
		}

		public GhostViewImpl addGhost(View view, ViewGroup viewgroup, Matrix matrix)
		{
			GhostViewApi14 ghostviewapi14 = GhostViewApi14.getGhostView(view);
		//    0    0:aload_1         
		//    1    1:invokestatic    #30  <Method GhostViewApi14 GhostViewApi14.getGhostView(View)>
		//    2    4:astore          4
			matrix = ((Matrix) (ghostviewapi14));
		//    3    6:aload           4
		//    4    8:astore_3        
			if(ghostviewapi14 == null)
		//*   5    9:aload           4
		//*   6   11:ifnonnull       39
			{
				viewgroup = ((ViewGroup) (findFrameLayout(viewgroup)));
		//    7   14:aload_2         
		//    8   15:invokestatic    #32  <Method FrameLayout findFrameLayout(ViewGroup)>
		//    9   18:astore_2        
				if(viewgroup == null)
		//*  10   19:aload_2         
		//*  11   20:ifnonnull       25
					return null;
		//   12   23:aconst_null     
		//   13   24:areturn         
				matrix = ((Matrix) (new GhostViewApi14(view)));
		//   14   25:new             #8   <Class GhostViewApi14>
		//   15   28:dup             
		//   16   29:aload_1         
		//   17   30:invokespecial   #35  <Method void GhostViewApi14(View)>
		//   18   33:astore_3        
				((FrameLayout) (viewgroup)).addView(((View) (matrix)));
		//   19   34:aload_2         
		//   20   35:aload_3         
		//   21   36:invokevirtual   #38  <Method void FrameLayout.addView(View)>
			}
			matrix.mReferences = ((GhostViewApi14) (matrix)).mReferences + 1;
		//   22   39:aload_3         
		//   23   40:aload_3         
		//   24   41:getfield        #42  <Field int GhostViewApi14.mReferences>
		//   25   44:iconst_1        
		//   26   45:iadd            
		//   27   46:putfield        #42  <Field int GhostViewApi14.mReferences>
			return ((GhostViewImpl) (matrix));
		//   28   49:aload_3         
		//   29   50:areturn         
		}

		public void removeGhost(View view)
		{
			view = ((View) (GhostViewApi14.getGhostView(view)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #30  <Method GhostViewApi14 GhostViewApi14.getGhostView(View)>
		//    2    4:astore_1        
			if(view != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          53
			{
				view.mReferences = ((GhostViewApi14) (view)).mReferences - 1;
		//    5    9:aload_1         
		//    6   10:aload_1         
		//    7   11:getfield        #42  <Field int GhostViewApi14.mReferences>
		//    8   14:iconst_1        
		//    9   15:isub            
		//   10   16:putfield        #42  <Field int GhostViewApi14.mReferences>
				if(((GhostViewApi14) (view)).mReferences <= 0)
		//*  11   19:aload_1         
		//*  12   20:getfield        #42  <Field int GhostViewApi14.mReferences>
		//*  13   23:ifgt            53
				{
					Object obj = ((Object) (((GhostViewApi14) (view)).getParent()));
		//   14   26:aload_1         
		//   15   27:invokevirtual   #44  <Method android.view.ViewParent GhostViewApi14.getParent()>
		//   16   30:astore_2        
					if(obj instanceof ViewGroup)
		//*  17   31:aload_2         
		//*  18   32:instanceof      #20  <Class ViewGroup>
		//*  19   35:ifeq            53
					{
						obj = ((Object) ((ViewGroup)obj));
		//   20   38:aload_2         
		//   21   39:checkcast       #20  <Class ViewGroup>
		//   22   42:astore_2        
						((ViewGroup) (obj)).endViewTransition(view);
		//   23   43:aload_2         
		//   24   44:aload_1         
		//   25   45:invokevirtual   #47  <Method void ViewGroup.endViewTransition(View)>
						((ViewGroup) (obj)).removeView(view);
		//   26   48:aload_2         
		//   27   49:aload_1         
		//   28   50:invokevirtual   #50  <Method void ViewGroup.removeView(View)>
					}
				}
			}
		//   29   53:return          
		}

		Creator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	GhostViewApi14(View view)
	{
		super(view.getContext());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method android.content.Context View.getContext()>
	//    3    5:invokespecial   #39  <Method void View(android.content.Context)>
	//    4    8:aload_0         
	//    5    9:new             #41  <Class Matrix>
	//    6   12:dup             
	//    7   13:invokespecial   #44  <Method void Matrix()>
	//    8   16:putfield        #46  <Field Matrix mMatrix>
	//    9   19:aload_0         
	//   10   20:new             #8   <Class GhostViewApi14$1>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #49  <Method void GhostViewApi14$1(GhostViewApi14)>
	//   14   28:putfield        #51  <Field android.view.ViewTreeObserver$OnPreDrawListener mOnPreDrawListener>
		mView = view;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #53  <Field View mView>
		setLayerType(2, ((android.graphics.Paint) (null)));
	//   18   36:aload_0         
	//   19   37:iconst_2        
	//   20   38:aconst_null     
	//   21   39:invokevirtual   #57  <Method void setLayerType(int, android.graphics.Paint)>
	//   22   42:return          
	}

	static GhostViewApi14 getGhostView(View view)
	{
		return (GhostViewApi14)view.getTag(R.id.ghost_view);
	//    0    0:aload_0         
	//    1    1:getstatic       #66  <Field int R$id.ghost_view>
	//    2    4:invokevirtual   #70  <Method Object View.getTag(int)>
	//    3    7:checkcast       #2   <Class GhostViewApi14>
	//    4   10:areturn         
	}

	private static void setGhostView(View view, GhostViewApi14 ghostviewapi14)
	{
		view.setTag(R.id.ghost_view, ((Object) (ghostviewapi14)));
	//    0    0:aload_0         
	//    1    1:getstatic       #66  <Field int R$id.ghost_view>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #77  <Method void View.setTag(int, Object)>
	//    4    8:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void View.onAttachedToWindow()>
		setGhostView(mView, this);
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field View mView>
	//    4    8:aload_0         
	//    5    9:invokestatic    #82  <Method void setGhostView(View, GhostViewApi14)>
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
	//   14   22:invokevirtual   #86  <Method void getLocationOnScreen(int[])>
		mView.getLocationOnScreen(ai1);
	//   15   25:aload_0         
	//   16   26:getfield        #53  <Field View mView>
	//   17   29:aload_2         
	//   18   30:invokevirtual   #87  <Method void View.getLocationOnScreen(int[])>
		ai1[0] = (int)((float)ai1[0] - mView.getTranslationX());
	//   19   33:aload_2         
	//   20   34:iconst_0        
	//   21   35:aload_2         
	//   22   36:iconst_0        
	//   23   37:iaload          
	//   24   38:i2f             
	//   25   39:aload_0         
	//   26   40:getfield        #53  <Field View mView>
	//   27   43:invokevirtual   #91  <Method float View.getTranslationX()>
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
	//   38   56:getfield        #53  <Field View mView>
	//   39   59:invokevirtual   #94  <Method float View.getTranslationY()>
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
	//   51   73:putfield        #96  <Field int mDeltaX>
		mDeltaY = ai1[1] - ai[1];
	//   52   76:aload_0         
	//   53   77:aload_2         
	//   54   78:iconst_1        
	//   55   79:iaload          
	//   56   80:aload_1         
	//   57   81:iconst_1        
	//   58   82:iaload          
	//   59   83:isub            
	//   60   84:putfield        #98  <Field int mDeltaY>
		mView.getViewTreeObserver().addOnPreDrawListener(mOnPreDrawListener);
	//   61   87:aload_0         
	//   62   88:getfield        #53  <Field View mView>
	//   63   91:invokevirtual   #102 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   64   94:aload_0         
	//   65   95:getfield        #51  <Field android.view.ViewTreeObserver$OnPreDrawListener mOnPreDrawListener>
	//   66   98:invokevirtual   #108 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		mView.setVisibility(4);
	//   67  101:aload_0         
	//   68  102:getfield        #53  <Field View mView>
	//   69  105:iconst_4        
	//   70  106:invokevirtual   #112 <Method void View.setVisibility(int)>
	//   71  109:return          
	}

	protected void onDetachedFromWindow()
	{
		mView.getViewTreeObserver().removeOnPreDrawListener(mOnPreDrawListener);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field View mView>
	//    2    4:invokevirtual   #102 <Method ViewTreeObserver View.getViewTreeObserver()>
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field android.view.ViewTreeObserver$OnPreDrawListener mOnPreDrawListener>
	//    5   11:invokevirtual   #116 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		mView.setVisibility(0);
	//    6   14:aload_0         
	//    7   15:getfield        #53  <Field View mView>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #112 <Method void View.setVisibility(int)>
		setGhostView(mView, ((GhostViewApi14) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #53  <Field View mView>
	//   12   26:aconst_null     
	//   13   27:invokestatic    #82  <Method void setGhostView(View, GhostViewApi14)>
		super.onDetachedFromWindow();
	//   14   30:aload_0         
	//   15   31:invokespecial   #118 <Method void View.onDetachedFromWindow()>
	//   16   34:return          
	}

	protected void onDraw(Canvas canvas)
	{
		mMatrix.set(mCurrentMatrix);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Matrix mMatrix>
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field Matrix mCurrentMatrix>
	//    4    8:invokevirtual   #126 <Method void Matrix.set(Matrix)>
		mMatrix.postTranslate(mDeltaX, mDeltaY);
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field Matrix mMatrix>
	//    7   15:aload_0         
	//    8   16:getfield        #96  <Field int mDeltaX>
	//    9   19:i2f             
	//   10   20:aload_0         
	//   11   21:getfield        #98  <Field int mDeltaY>
	//   12   24:i2f             
	//   13   25:invokevirtual   #130 <Method boolean Matrix.postTranslate(float, float)>
	//   14   28:pop             
		canvas.setMatrix(mMatrix);
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #46  <Field Matrix mMatrix>
	//   18   34:invokevirtual   #135 <Method void Canvas.setMatrix(Matrix)>
		mView.draw(canvas);
	//   19   37:aload_0         
	//   20   38:getfield        #53  <Field View mView>
	//   21   41:aload_1         
	//   22   42:invokevirtual   #138 <Method void View.draw(Canvas)>
	//   23   45:return          
	}

	public void reserveEndViewTransition(ViewGroup viewgroup, View view)
	{
		mStartParent = viewgroup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field ViewGroup mStartParent>
		mStartView = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #144 <Field View mStartView>
	//    6   10:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #112 <Method void View.setVisibility(int)>
		View view = mView;
	//    3    5:aload_0         
	//    4    6:getfield        #53  <Field View mView>
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
	//   15   23:invokevirtual   #112 <Method void View.setVisibility(int)>
	//   16   26:return          
	}

	Matrix mCurrentMatrix;
	private int mDeltaX;
	private int mDeltaY;
	private final Matrix mMatrix = new Matrix();
	private final android.view.ViewTreeObserver.OnPreDrawListener mOnPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() {

		public boolean onPreDraw()
		{
			mCurrentMatrix = mView.getMatrix();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field GhostViewApi14 this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #14  <Field GhostViewApi14 this$0>
		//    4    8:getfield        #24  <Field View GhostViewApi14.mView>
		//    5   11:invokevirtual   #30  <Method Matrix View.getMatrix()>
		//    6   14:putfield        #34  <Field Matrix GhostViewApi14.mCurrentMatrix>
			ViewCompat.postInvalidateOnAnimation(((View) (GhostViewApi14.this)));
		//    7   17:aload_0         
		//    8   18:getfield        #14  <Field GhostViewApi14 this$0>
		//    9   21:invokestatic    #40  <Method void ViewCompat.postInvalidateOnAnimation(View)>
			if(mStartParent != null && mStartView != null)
		//*  10   24:aload_0         
		//*  11   25:getfield        #14  <Field GhostViewApi14 this$0>
		//*  12   28:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
		//*  13   31:ifnull          87
		//*  14   34:aload_0         
		//*  15   35:getfield        #14  <Field GhostViewApi14 this$0>
		//*  16   38:getfield        #47  <Field View GhostViewApi14.mStartView>
		//*  17   41:ifnull          87
			{
				mStartParent.endViewTransition(mStartView);
		//   18   44:aload_0         
		//   19   45:getfield        #14  <Field GhostViewApi14 this$0>
		//   20   48:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
		//   21   51:aload_0         
		//   22   52:getfield        #14  <Field GhostViewApi14 this$0>
		//   23   55:getfield        #47  <Field View GhostViewApi14.mStartView>
		//   24   58:invokevirtual   #52  <Method void ViewGroup.endViewTransition(View)>
				ViewCompat.postInvalidateOnAnimation(((View) (mStartParent)));
		//   25   61:aload_0         
		//   26   62:getfield        #14  <Field GhostViewApi14 this$0>
		//   27   65:getfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
		//   28   68:invokestatic    #40  <Method void ViewCompat.postInvalidateOnAnimation(View)>
				mStartParent = null;
		//   29   71:aload_0         
		//   30   72:getfield        #14  <Field GhostViewApi14 this$0>
		//   31   75:aconst_null     
		//   32   76:putfield        #44  <Field ViewGroup GhostViewApi14.mStartParent>
				mStartView = null;
		//   33   79:aload_0         
		//   34   80:getfield        #14  <Field GhostViewApi14 this$0>
		//   35   83:aconst_null     
		//   36   84:putfield        #47  <Field View GhostViewApi14.mStartView>
			}
			return true;
		//   37   87:iconst_1        
		//   38   88:ireturn         
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
