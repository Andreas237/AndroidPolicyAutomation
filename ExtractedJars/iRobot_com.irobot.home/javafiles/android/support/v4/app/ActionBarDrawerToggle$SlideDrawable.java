// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.v4.view.s;
import android.view.Window;

// Referenced classes of package android.support.v4.app:
//			ActionBarDrawerToggle

private class ActionBarDrawerToggle$SlideDrawable extends InsetDrawable
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
		int i = s.e(mActivity.getWindow().getDecorView());
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field ActionBarDrawerToggle this$0>
	//    9   17:getfield        #57  <Field Activity ActionBarDrawerToggle.mActivity>
	//   10   20:invokevirtual   #63  <Method Window Activity.getWindow()>
	//   11   23:invokevirtual   #69  <Method android.view.View Window.getDecorView()>
	//   12   26:invokestatic    #75  <Method int s.e(android.view.View)>
	//   13   29:istore          4
		int j = 1;
	//   14   31:iconst_1        
	//   15   32:istore          5
		boolean flag;
		if(i == 1)
	//*  16   34:iload           4
	//*  17   36:iconst_1        
	//*  18   37:icmpne          46
			flag = true;
	//   19   40:iconst_1        
	//   20   41:istore          4
		else
	//*  21   43:goto            49
			flag = false;
	//   22   46:iconst_0        
	//   23   47:istore          4
		if(flag)
	//*  24   49:iload           4
	//*  25   51:ifeq            57
			j = -1;
	//   26   54:iconst_m1       
	//   27   55:istore          5
		int k = mTmpRect.width();
	//   28   57:aload_0         
	//   29   58:getfield        #40  <Field Rect mTmpRect>
	//   30   61:invokevirtual   #78  <Method int Rect.width()>
	//   31   64:istore          6
		float f = -mOffset;
	//   32   66:aload_0         
	//   33   67:getfield        #80  <Field float mOffset>
	//   34   70:fneg            
	//   35   71:fstore_2        
		float f1 = k;
	//   36   72:iload           6
	//   37   74:i2f             
	//   38   75:fstore_3        
		canvas.translate(f * f1 * mPosition * (float)j, 0.0F);
	//   39   76:aload_1         
	//   40   77:fload_2         
	//   41   78:fload_3         
	//   42   79:fmul            
	//   43   80:aload_0         
	//   44   81:getfield        #82  <Field float mPosition>
	//   45   84:fmul            
	//   46   85:iload           5
	//   47   87:i2f             
	//   48   88:fmul            
	//   49   89:fconst_0        
	//   50   90:invokevirtual   #86  <Method void Canvas.translate(float, float)>
		if(flag && !mHasMirroring)
	//*  51   93:iload           4
	//*  52   95:ifeq            118
	//*  53   98:aload_0         
	//*  54   99:getfield        #33  <Field boolean mHasMirroring>
	//*  55  102:ifne            118
		{
			canvas.translate(f1, 0.0F);
	//   56  105:aload_1         
	//   57  106:fload_3         
	//   58  107:fconst_0        
	//   59  108:invokevirtual   #86  <Method void Canvas.translate(float, float)>
			canvas.scale(-1F, 1.0F);
	//   60  111:aload_1         
	//   61  112:ldc1            #87  <Float -1F>
	//   62  114:fconst_1        
	//   63  115:invokevirtual   #90  <Method void Canvas.scale(float, float)>
		}
		super.draw(canvas);
	//   64  118:aload_0         
	//   65  119:aload_1         
	//   66  120:invokespecial   #92  <Method void InsetDrawable.draw(Canvas)>
		canvas.restore();
	//   67  123:aload_1         
	//   68  124:invokevirtual   #95  <Method void Canvas.restore()>
	//   69  127:return          
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
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		super(drawable, 0);
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:iconst_0        
	//    8   10:invokespecial   #25  <Method void InsetDrawable(Drawable, int)>
		if(android.os.Build.VERSION.SDK_INT > 18)
	//*   9   13:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   16:bipush          18
	//*  11   18:icmple          23
			flag = true;
	//   12   21:iconst_1        
	//   13   22:istore_3        
		mHasMirroring = flag;
	//   14   23:aload_0         
	//   15   24:iload_3         
	//   16   25:putfield        #33  <Field boolean mHasMirroring>
	//   17   28:aload_0         
	//   18   29:new             #35  <Class Rect>
	//   19   32:dup             
	//   20   33:invokespecial   #38  <Method void Rect()>
	//   21   36:putfield        #40  <Field Rect mTmpRect>
	//   22   39:return          
	}
}
