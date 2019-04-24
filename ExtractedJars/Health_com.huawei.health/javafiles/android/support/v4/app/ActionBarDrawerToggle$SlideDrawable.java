// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.v4.view.ViewCompat;
import android.view.Window;

// Referenced classes of package android.support.v4.app:
//			ActionBarDrawerToggle

class ActionBarDrawerToggle$SlideDrawable extends InsetDrawable
	implements android.graphics.drawable.Drawable.Callback
{

	public void draw(Canvas canvas)
	{
		copyBounds(mTmpRect);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field Rect mTmpRect>
	//    3    5:invokevirtual   #47  <Method void copyBounds(Rect)>
		canvas.save();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #53  <Method int Canvas.save()>
	//    6   12:pop             
		boolean flag;
		if(ViewCompat.getLayoutDirection(mActivity.getWindow().getDecorView()) == 1)
	//*   7   13:aload_0         
	//*   8   14:getfield        #22  <Field ActionBarDrawerToggle this$0>
	//*   9   17:getfield        #57  <Field Activity ActionBarDrawerToggle.mActivity>
	//*  10   20:invokevirtual   #63  <Method Window Activity.getWindow()>
	//*  11   23:invokevirtual   #69  <Method android.view.View Window.getDecorView()>
	//*  12   26:invokestatic    #75  <Method int ViewCompat.getLayoutDirection(android.view.View)>
	//*  13   29:iconst_1        
	//*  14   30:icmpne          38
			flag = true;
	//   15   33:iconst_1        
	//   16   34:istore_2        
		else
	//*  17   35:goto            40
			flag = false;
	//   18   38:iconst_0        
	//   19   39:istore_2        
		int i;
		if(flag)
	//*  20   40:iload_2         
	//*  21   41:ifeq            49
			i = -1;
	//   22   44:iconst_m1       
	//   23   45:istore_3        
		else
	//*  24   46:goto            51
			i = 1;
	//   25   49:iconst_1        
	//   26   50:istore_3        
		int j = mTmpRect.width();
	//   27   51:aload_0         
	//   28   52:getfield        #40  <Field Rect mTmpRect>
	//   29   55:invokevirtual   #78  <Method int Rect.width()>
	//   30   58:istore          4
		canvas.translate(-mOffset * (float)j * mPosition * (float)i, 0.0F);
	//   31   60:aload_1         
	//   32   61:aload_0         
	//   33   62:getfield        #80  <Field float mOffset>
	//   34   65:fneg            
	//   35   66:iload           4
	//   36   68:i2f             
	//   37   69:fmul            
	//   38   70:aload_0         
	//   39   71:getfield        #82  <Field float mPosition>
	//   40   74:fmul            
	//   41   75:iload_3         
	//   42   76:i2f             
	//   43   77:fmul            
	//   44   78:fconst_0        
	//   45   79:invokevirtual   #86  <Method void Canvas.translate(float, float)>
		if(flag && !mHasMirroring)
	//*  46   82:iload_2         
	//*  47   83:ifeq            108
	//*  48   86:aload_0         
	//*  49   87:getfield        #33  <Field boolean mHasMirroring>
	//*  50   90:ifne            108
		{
			canvas.translate(j, 0.0F);
	//   51   93:aload_1         
	//   52   94:iload           4
	//   53   96:i2f             
	//   54   97:fconst_0        
	//   55   98:invokevirtual   #86  <Method void Canvas.translate(float, float)>
			canvas.scale(-1F, 1.0F);
	//   56  101:aload_1         
	//   57  102:ldc1            #87  <Float -1F>
	//   58  104:fconst_1        
	//   59  105:invokevirtual   #90  <Method void Canvas.scale(float, float)>
		}
		super.draw(canvas);
	//   60  108:aload_0         
	//   61  109:aload_1         
	//   62  110:invokespecial   #92  <Method void InsetDrawable.draw(Canvas)>
		canvas.restore();
	//   63  113:aload_1         
	//   64  114:invokevirtual   #95  <Method void Canvas.restore()>
	//   65  117:return          
	}

	public float getPosition()
	{
		return mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field float mPosition>
	//    2    4:freturn         
	}

	public void setOffset(float f)
	{
		mOffset = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #80  <Field float mOffset>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #102 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setPosition(float f)
	{
		mPosition = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #82  <Field float mPosition>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #102 <Method void invalidateSelf()>
	//    5    9:return          
	}

	private final boolean mHasMirroring;
	private float mOffset;
	private float mPosition;
	private final Rect mTmpRect = new Rect();
	final ActionBarDrawerToggle this$0;

	ActionBarDrawerToggle$SlideDrawable(Drawable drawable)
	{
		this$0 = ActionBarDrawerToggle.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ActionBarDrawerToggle this$0>
		super(drawable, 0);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:iconst_0        
	//    6    8:invokespecial   #25  <Method void InsetDrawable(Drawable, int)>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT > 18)
	//*   7   11:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   14:bipush          18
	//*   9   16:icmple          24
			flag = true;
	//   10   19:iconst_1        
	//   11   20:istore_3        
		else
	//*  12   21:goto            26
			flag = false;
	//   13   24:iconst_0        
	//   14   25:istore_3        
		mHasMirroring = flag;
	//   15   26:aload_0         
	//   16   27:iload_3         
	//   17   28:putfield        #33  <Field boolean mHasMirroring>
	//   18   31:aload_0         
	//   19   32:new             #35  <Class Rect>
	//   20   35:dup             
	//   21   36:invokespecial   #38  <Method void Rect()>
	//   22   39:putfield        #40  <Field Rect mTmpRect>
	//   23   42:return          
	}
}
