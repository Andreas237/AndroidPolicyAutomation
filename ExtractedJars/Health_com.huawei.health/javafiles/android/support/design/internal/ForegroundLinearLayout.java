// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;

public class ForegroundLinearLayout extends LinearLayoutCompat
{

	public ForegroundLinearLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #23  <Method void ForegroundLinearLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public ForegroundLinearLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #27  <Method void ForegroundLinearLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ForegroundLinearLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #28  <Method void LinearLayoutCompat(Context, AttributeSet, int)>
		mSelfBounds = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #30  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #33  <Method void Rect()>
	//    9   15:putfield        #35  <Field Rect mSelfBounds>
		mOverlayBounds = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #30  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #33  <Method void Rect()>
	//   14   26:putfield        #37  <Field Rect mOverlayBounds>
		mForegroundGravity = 119;
	//   15   29:aload_0         
	//   16   30:bipush          119
	//   17   32:putfield        #39  <Field int mForegroundGravity>
		mForegroundInPadding = true;
	//   18   35:aload_0         
	//   19   36:iconst_1        
	//   20   37:putfield        #41  <Field boolean mForegroundInPadding>
		mForegroundBoundsChanged = false;
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:putfield        #43  <Field boolean mForegroundBoundsChanged>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.ForegroundLinearLayout, i, 0)));
	//   24   45:aload_1         
	//   25   46:aload_2         
	//   26   47:getstatic       #49  <Field int[] android.support.design.R$styleable.ForegroundLinearLayout>
	//   27   50:iload_3         
	//   28   51:iconst_0        
	//   29   52:invokevirtual   #55  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   30   55:astore_1        
		mForegroundGravity = ((TypedArray) (context)).getInt(android.support.design.R.styleable.ForegroundLinearLayout_android_foregroundGravity, mForegroundGravity);
	//   31   56:aload_0         
	//   32   57:aload_1         
	//   33   58:getstatic       #58  <Field int android.support.design.R$styleable.ForegroundLinearLayout_android_foregroundGravity>
	//   34   61:aload_0         
	//   35   62:getfield        #39  <Field int mForegroundGravity>
	//   36   65:invokevirtual   #64  <Method int TypedArray.getInt(int, int)>
	//   37   68:putfield        #39  <Field int mForegroundGravity>
		attributeset = ((AttributeSet) (((TypedArray) (context)).getDrawable(android.support.design.R.styleable.ForegroundLinearLayout_android_foreground)));
	//   38   71:aload_1         
	//   39   72:getstatic       #67  <Field int android.support.design.R$styleable.ForegroundLinearLayout_android_foreground>
	//   40   75:invokevirtual   #71  <Method Drawable TypedArray.getDrawable(int)>
	//   41   78:astore_2        
		if(attributeset != null)
	//*  42   79:aload_2         
	//*  43   80:ifnull          88
			setForeground(((Drawable) (attributeset)));
	//   44   83:aload_0         
	//   45   84:aload_2         
	//   46   85:invokevirtual   #75  <Method void setForeground(Drawable)>
		mForegroundInPadding = ((TypedArray) (context)).getBoolean(android.support.design.R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
	//   47   88:aload_0         
	//   48   89:aload_1         
	//   49   90:getstatic       #78  <Field int android.support.design.R$styleable.ForegroundLinearLayout_foregroundInsidePadding>
	//   50   93:iconst_1        
	//   51   94:invokevirtual   #82  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   52   97:putfield        #41  <Field boolean mForegroundInPadding>
		((TypedArray) (context)).recycle();
	//   53  100:aload_1         
	//   54  101:invokevirtual   #85  <Method void TypedArray.recycle()>
	//   55  104:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method void LinearLayoutCompat.draw(Canvas)>
		if(mForeground != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #92  <Field Drawable mForeground>
	//*   5    9:ifnull          140
		{
			Drawable drawable = mForeground;
	//    6   12:aload_0         
	//    7   13:getfield        #92  <Field Drawable mForeground>
	//    8   16:astore          4
			if(mForegroundBoundsChanged)
	//*   9   18:aload_0         
	//*  10   19:getfield        #43  <Field boolean mForegroundBoundsChanged>
	//*  11   22:ifeq            134
			{
				mForegroundBoundsChanged = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #43  <Field boolean mForegroundBoundsChanged>
				Rect rect = mSelfBounds;
	//   15   30:aload_0         
	//   16   31:getfield        #35  <Field Rect mSelfBounds>
	//   17   34:astore          5
				Rect rect1 = mOverlayBounds;
	//   18   36:aload_0         
	//   19   37:getfield        #37  <Field Rect mOverlayBounds>
	//   20   40:astore          6
				int i = getRight() - getLeft();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #96  <Method int getRight()>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #99  <Method int getLeft()>
	//   25   50:isub            
	//   26   51:istore_2        
				int j = getBottom() - getTop();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #102 <Method int getBottom()>
	//   29   56:aload_0         
	//   30   57:invokevirtual   #105 <Method int getTop()>
	//   31   60:isub            
	//   32   61:istore_3        
				if(mForegroundInPadding)
	//*  33   62:aload_0         
	//*  34   63:getfield        #41  <Field boolean mForegroundInPadding>
	//*  35   66:ifeq            81
					rect.set(0, 0, i, j);
	//   36   69:aload           5
	//   37   71:iconst_0        
	//   38   72:iconst_0        
	//   39   73:iload_2         
	//   40   74:iload_3         
	//   41   75:invokevirtual   #109 <Method void Rect.set(int, int, int, int)>
				else
	//*  42   78:goto            106
					rect.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), j - getPaddingBottom());
	//   43   81:aload           5
	//   44   83:aload_0         
	//   45   84:invokevirtual   #112 <Method int getPaddingLeft()>
	//   46   87:aload_0         
	//   47   88:invokevirtual   #115 <Method int getPaddingTop()>
	//   48   91:iload_2         
	//   49   92:aload_0         
	//   50   93:invokevirtual   #118 <Method int getPaddingRight()>
	//   51   96:isub            
	//   52   97:iload_3         
	//   53   98:aload_0         
	//   54   99:invokevirtual   #121 <Method int getPaddingBottom()>
	//   55  102:isub            
	//   56  103:invokevirtual   #109 <Method void Rect.set(int, int, int, int)>
				Gravity.apply(mForegroundGravity, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect1);
	//   57  106:aload_0         
	//   58  107:getfield        #39  <Field int mForegroundGravity>
	//   59  110:aload           4
	//   60  112:invokevirtual   #126 <Method int Drawable.getIntrinsicWidth()>
	//   61  115:aload           4
	//   62  117:invokevirtual   #129 <Method int Drawable.getIntrinsicHeight()>
	//   63  120:aload           5
	//   64  122:aload           6
	//   65  124:invokestatic    #135 <Method void Gravity.apply(int, int, int, Rect, Rect)>
				drawable.setBounds(rect1);
	//   66  127:aload           4
	//   67  129:aload           6
	//   68  131:invokevirtual   #139 <Method void Drawable.setBounds(Rect)>
			}
			drawable.draw(canvas);
	//   69  134:aload           4
	//   70  136:aload_1         
	//   71  137:invokevirtual   #140 <Method void Drawable.draw(Canvas)>
		}
	//   72  140:return          
	}

	public void drawableHotspotChanged(float f, float f1)
	{
		super.drawableHotspotChanged(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #147 <Method void LinearLayoutCompat.drawableHotspotChanged(float, float)>
		if(mForeground != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #92  <Field Drawable mForeground>
	//*   6   10:ifnull          22
			mForeground.setHotspot(f, f1);
	//    7   13:aload_0         
	//    8   14:getfield        #92  <Field Drawable mForeground>
	//    9   17:fload_1         
	//   10   18:fload_2         
	//   11   19:invokevirtual   #150 <Method void Drawable.setHotspot(float, float)>
	//   12   22:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void LinearLayoutCompat.drawableStateChanged()>
		if(mForeground != null && mForeground.isStateful())
	//*   2    4:aload_0         
	//*   3    5:getfield        #92  <Field Drawable mForeground>
	//*   4    8:ifnull          33
	//*   5   11:aload_0         
	//*   6   12:getfield        #92  <Field Drawable mForeground>
	//*   7   15:invokevirtual   #158 <Method boolean Drawable.isStateful()>
	//*   8   18:ifeq            33
			mForeground.setState(getDrawableState());
	//    9   21:aload_0         
	//   10   22:getfield        #92  <Field Drawable mForeground>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #162 <Method int[] getDrawableState()>
	//   13   29:invokevirtual   #166 <Method boolean Drawable.setState(int[])>
	//   14   32:pop             
	//   15   33:return          
	}

	public Drawable getForeground()
	{
		return mForeground;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Drawable mForeground>
	//    2    4:areturn         
	}

	public int getForegroundGravity()
	{
		return mForegroundGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int mForegroundGravity>
	//    2    4:ireturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #173 <Method void LinearLayoutCompat.jumpDrawablesToCurrentState()>
		if(mForeground != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #92  <Field Drawable mForeground>
	//*   4    8:ifnull          18
			mForeground.jumpToCurrentState();
	//    5   11:aload_0         
	//    6   12:getfield        #92  <Field Drawable mForeground>
	//    7   15:invokevirtual   #176 <Method void Drawable.jumpToCurrentState()>
	//    8   18:return          
	}

	public void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #180 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
		mForegroundBoundsChanged = mForegroundBoundsChanged | flag;
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #43  <Field boolean mForegroundBoundsChanged>
	//   10   16:iload_1         
	//   11   17:ior             
	//   12   18:putfield        #43  <Field boolean mForegroundBoundsChanged>
	//   13   21:return          
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #183 <Method void LinearLayoutCompat.onSizeChanged(int, int, int, int)>
		mForegroundBoundsChanged = true;
	//    6    9:aload_0         
	//    7   10:iconst_1        
	//    8   11:putfield        #43  <Field boolean mForegroundBoundsChanged>
	//    9   14:return          
	}

	public void setForeground(Drawable drawable)
	{
		if(mForeground != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field Drawable mForeground>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       103
		{
			if(mForeground != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #92  <Field Drawable mForeground>
	//*   6   12:ifnull          31
			{
				mForeground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #92  <Field Drawable mForeground>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #187 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				unscheduleDrawable(mForeground);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #92  <Field Drawable mForeground>
	//   14   28:invokevirtual   #190 <Method void unscheduleDrawable(Drawable)>
			}
			mForeground = drawable;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #92  <Field Drawable mForeground>
			if(drawable != null)
	//*  18   36:aload_1         
	//*  19   37:ifnull          90
			{
				setWillNotDraw(false);
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:invokevirtual   #194 <Method void setWillNotDraw(boolean)>
				drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:invokevirtual   #187 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				if(drawable.isStateful())
	//*  26   50:aload_1         
	//*  27   51:invokevirtual   #158 <Method boolean Drawable.isStateful()>
	//*  28   54:ifeq            66
					drawable.setState(getDrawableState());
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:invokevirtual   #162 <Method int[] getDrawableState()>
	//   32   62:invokevirtual   #166 <Method boolean Drawable.setState(int[])>
	//   33   65:pop             
				if(mForegroundGravity == 119)
	//*  34   66:aload_0         
	//*  35   67:getfield        #39  <Field int mForegroundGravity>
	//*  36   70:bipush          119
	//*  37   72:icmpne          95
					drawable.getPadding(new Rect());
	//   38   75:aload_1         
	//   39   76:new             #30  <Class Rect>
	//   40   79:dup             
	//   41   80:invokespecial   #33  <Method void Rect()>
	//   42   83:invokevirtual   #198 <Method boolean Drawable.getPadding(Rect)>
	//   43   86:pop             
			} else
	//*  44   87:goto            95
			{
				setWillNotDraw(true);
	//   45   90:aload_0         
	//   46   91:iconst_1        
	//   47   92:invokevirtual   #194 <Method void setWillNotDraw(boolean)>
			}
			requestLayout();
	//   48   95:aload_0         
	//   49   96:invokevirtual   #201 <Method void requestLayout()>
			invalidate();
	//   50   99:aload_0         
	//   51  100:invokevirtual   #204 <Method void invalidate()>
		}
	//   52  103:return          
	}

	public void setForegroundGravity(int i)
	{
		if(mForegroundGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field int mForegroundGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          78
		{
			int j = i;
	//    4    8:iload_1         
	//    5    9:istore_2        
			if((0x800007 & i) == 0)
	//*   6   10:ldc1            #207 <Int 0x800007>
	//*   7   12:iload_1         
	//*   8   13:iand            
	//*   9   14:ifne            22
				j = i | 0x800003;
	//   10   17:iload_1         
	//   11   18:ldc1            #208 <Int 0x800003>
	//   12   20:ior             
	//   13   21:istore_2        
			i = j;
	//   14   22:iload_2         
	//   15   23:istore_1        
			if((j & 0x70) == 0)
	//*  16   24:iload_2         
	//*  17   25:bipush          112
	//*  18   27:iand            
	//*  19   28:ifne            36
				i = j | 0x30;
	//   20   31:iload_2         
	//   21   32:bipush          48
	//   22   34:ior             
	//   23   35:istore_1        
			mForegroundGravity = i;
	//   24   36:aload_0         
	//   25   37:iload_1         
	//   26   38:putfield        #39  <Field int mForegroundGravity>
			if(mForegroundGravity == 119 && mForeground != null)
	//*  27   41:aload_0         
	//*  28   42:getfield        #39  <Field int mForegroundGravity>
	//*  29   45:bipush          119
	//*  30   47:icmpne          74
	//*  31   50:aload_0         
	//*  32   51:getfield        #92  <Field Drawable mForeground>
	//*  33   54:ifnull          74
			{
				Rect rect = new Rect();
	//   34   57:new             #30  <Class Rect>
	//   35   60:dup             
	//   36   61:invokespecial   #33  <Method void Rect()>
	//   37   64:astore_3        
				mForeground.getPadding(rect);
	//   38   65:aload_0         
	//   39   66:getfield        #92  <Field Drawable mForeground>
	//   40   69:aload_3         
	//   41   70:invokevirtual   #198 <Method boolean Drawable.getPadding(Rect)>
	//   42   73:pop             
			}
			requestLayout();
	//   43   74:aload_0         
	//   44   75:invokevirtual   #201 <Method void requestLayout()>
		}
	//   45   78:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mForeground;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #212 <Method boolean LinearLayoutCompat.verifyDrawable(Drawable)>
	//    3    5:ifne            16
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #92  <Field Drawable mForeground>
	//    7   13:if_acmpne       18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private Drawable mForeground;
	boolean mForegroundBoundsChanged;
	private int mForegroundGravity;
	protected boolean mForegroundInPadding;
	private final Rect mOverlayBounds;
	private final Rect mSelfBounds;
}
