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
	//    1    1:istore          6
		copyBounds(mTmpRect);
	//    2    3:aload_0         
	//    3    4:aload_0         
	//    4    5:getfield        #40  <Field Rect mTmpRect>
	//    5    8:invokevirtual   #48  <Method void copyBounds(Rect)>
		canvas.save();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #54  <Method int Canvas.save()>
	//    8   15:pop             
		float f;
		float f1;
		float f2;
		boolean flag;
		int j;
		if(ViewCompat.getLayoutDirection(mActivity.getWindow().getDecorView()) == 1)
	//*   9   16:aload_0         
	//*  10   17:getfield        #22  <Field ActionBarDrawerToggle this$0>
	//*  11   20:getfield        #58  <Field Activity ActionBarDrawerToggle.mActivity>
	//*  12   23:invokevirtual   #64  <Method Window Activity.getWindow()>
	//*  13   26:invokevirtual   #70  <Method android.view.View Window.getDecorView()>
	//*  14   29:invokestatic    #76  <Method int ViewCompat.getLayoutDirection(android.view.View)>
	//*  15   32:iconst_1        
	//*  16   33:icmpne          124
			flag = true;
	//   17   36:iconst_1        
	//   18   37:istore          5
		else
	//*  19   39:iload           5
	//*  20   41:ifeq            47
	//*  21   44:iconst_m1       
	//*  22   45:istore          6
	//*  23   47:aload_0         
	//*  24   48:getfield        #40  <Field Rect mTmpRect>
	//*  25   51:invokevirtual   #79  <Method int Rect.width()>
	//*  26   54:istore          7
	//*  27   56:aload_0         
	//*  28   57:getfield        #81  <Field float mOffset>
	//*  29   60:fneg            
	//*  30   61:fstore_2        
	//*  31   62:iload           7
	//*  32   64:i2f             
	//*  33   65:fstore_3        
	//*  34   66:aload_0         
	//*  35   67:getfield        #83  <Field float mPosition>
	//*  36   70:fstore          4
	//*  37   72:aload_1         
	//*  38   73:iload           6
	//*  39   75:i2f             
	//*  40   76:fload_2         
	//*  41   77:fload_3         
	//*  42   78:fmul            
	//*  43   79:fload           4
	//*  44   81:fmul            
	//*  45   82:fmul            
	//*  46   83:fconst_0        
	//*  47   84:invokevirtual   #87  <Method void Canvas.translate(float, float)>
	//*  48   87:iload           5
	//*  49   89:ifeq            114
	//*  50   92:aload_0         
	//*  51   93:getfield        #33  <Field boolean mHasMirroring>
	//*  52   96:ifne            114
	//*  53   99:aload_1         
	//*  54  100:iload           7
	//*  55  102:i2f             
	//*  56  103:fconst_0        
	//*  57  104:invokevirtual   #87  <Method void Canvas.translate(float, float)>
	//*  58  107:aload_1         
	//*  59  108:ldc1            #88  <Float -1F>
	//*  60  110:fconst_1        
	//*  61  111:invokevirtual   #91  <Method void Canvas.scale(float, float)>
	//*  62  114:aload_0         
	//*  63  115:aload_1         
	//*  64  116:invokespecial   #93  <Method void InsetDrawable.draw(Canvas)>
	//*  65  119:aload_1         
	//*  66  120:invokevirtual   #96  <Method void Canvas.restore()>
	//*  67  123:return          
			flag = false;
	//   68  124:iconst_0        
	//   69  125:istore          5
		if(flag)
			i = -1;
		j = mTmpRect.width();
		f = -mOffset;
		f1 = j;
		f2 = mPosition;
		canvas.translate((float)i * (f * f1 * f2), 0.0F);
		if(flag && !mHasMirroring)
		{
			canvas.translate(j, 0.0F);
			canvas.scale(-1F, 1.0F);
		}
		super.draw(canvas);
		canvas.restore();
	//*  70  127:goto            39
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
