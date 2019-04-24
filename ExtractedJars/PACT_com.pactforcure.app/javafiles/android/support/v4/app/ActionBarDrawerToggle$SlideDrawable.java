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

private class ActionBarDrawerToggle$SlideDrawable extends InsetDrawable
	implements android.graphics.drawable.Drawable.Callback
{

	public void draw(Canvas canvas)
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		copyBounds(mTmpRect);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #40  <Field Rect mTmpRect>
	//    5    7:invokevirtual   #48  <Method void copyBounds(Rect)>
		canvas.save();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #54  <Method int Canvas.save()>
	//    8   14:pop             
		boolean flag;
		int j;
		if(ViewCompat.getLayoutDirection(mActivity.getWindow().getDecorView()) == 1)
	//*   9   15:aload_0         
	//*  10   16:getfield        #22  <Field ActionBarDrawerToggle this$0>
	//*  11   19:getfield        #58  <Field Activity ActionBarDrawerToggle.mActivity>
	//*  12   22:invokevirtual   #64  <Method Window Activity.getWindow()>
	//*  13   25:invokevirtual   #70  <Method android.view.View Window.getDecorView()>
	//*  14   28:invokestatic    #76  <Method int ViewCompat.getLayoutDirection(android.view.View)>
	//*  15   31:iconst_1        
	//*  16   32:icmpne          110
			flag = true;
	//   17   35:iconst_1        
	//   18   36:istore_2        
		else
	//*  19   37:iload_2         
	//*  20   38:ifeq            43
	//*  21   41:iconst_m1       
	//*  22   42:istore_3        
	//*  23   43:aload_0         
	//*  24   44:getfield        #40  <Field Rect mTmpRect>
	//*  25   47:invokevirtual   #79  <Method int Rect.width()>
	//*  26   50:istore          4
	//*  27   52:aload_1         
	//*  28   53:aload_0         
	//*  29   54:getfield        #81  <Field float mOffset>
	//*  30   57:fneg            
	//*  31   58:iload           4
	//*  32   60:i2f             
	//*  33   61:fmul            
	//*  34   62:aload_0         
	//*  35   63:getfield        #83  <Field float mPosition>
	//*  36   66:fmul            
	//*  37   67:iload_3         
	//*  38   68:i2f             
	//*  39   69:fmul            
	//*  40   70:fconst_0        
	//*  41   71:invokevirtual   #87  <Method void Canvas.translate(float, float)>
	//*  42   74:iload_2         
	//*  43   75:ifeq            100
	//*  44   78:aload_0         
	//*  45   79:getfield        #33  <Field boolean mHasMirroring>
	//*  46   82:ifne            100
	//*  47   85:aload_1         
	//*  48   86:iload           4
	//*  49   88:i2f             
	//*  50   89:fconst_0        
	//*  51   90:invokevirtual   #87  <Method void Canvas.translate(float, float)>
	//*  52   93:aload_1         
	//*  53   94:ldc1            #88  <Float -1F>
	//*  54   96:fconst_1        
	//*  55   97:invokevirtual   #91  <Method void Canvas.scale(float, float)>
	//*  56  100:aload_0         
	//*  57  101:aload_1         
	//*  58  102:invokespecial   #93  <Method void InsetDrawable.draw(Canvas)>
	//*  59  105:aload_1         
	//*  60  106:invokevirtual   #96  <Method void Canvas.restore()>
	//*  61  109:return          
			flag = false;
	//   62  110:iconst_0        
	//   63  111:istore_2        
		if(flag)
			i = -1;
		j = mTmpRect.width();
		canvas.translate(-mOffset * (float)j * mPosition * (float)i, 0.0F);
		if(flag && !mHasMirroring)
		{
			canvas.translate(j, 0.0F);
			canvas.scale(-1F, 1.0F);
		}
		super.draw(canvas);
		canvas.restore();
	//*  64  112:goto            37
	}

	public float getPosition()
	{
		return mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field float mPosition>
	//    2    4:freturn         
	}

	public void setOffset(float f)
	{
		mOffset = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #81  <Field float mOffset>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #104 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setPosition(float f)
	{
		mPosition = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #83  <Field float mPosition>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #104 <Method void invalidateSelf()>
	//    5    9:return          
	}

	private final boolean mHasMirroring;
	private float mOffset;
	private float mPosition;
	private final Rect mTmpRect = new Rect();
	final ActionBarDrawerToggle this$0;

	ActionBarDrawerToggle$SlideDrawable(Drawable drawable)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		this$0 = ActionBarDrawerToggle.this;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #22  <Field ActionBarDrawerToggle this$0>
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
