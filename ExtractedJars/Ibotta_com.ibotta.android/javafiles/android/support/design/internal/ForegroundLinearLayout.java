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

// Referenced classes of package android.support.design.internal:
//			ThemeEnforcement

public class ForegroundLinearLayout extends LinearLayoutCompat
{

	public ForegroundLinearLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #23  <Method void ForegroundLinearLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ForegroundLinearLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #25  <Method void LinearLayoutCompat(Context, AttributeSet, int)>
		selfBounds = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #27  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #30  <Method void Rect()>
	//    9   15:putfield        #32  <Field Rect selfBounds>
		overlayBounds = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #27  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #30  <Method void Rect()>
	//   14   26:putfield        #34  <Field Rect overlayBounds>
		foregroundGravity = 119;
	//   15   29:aload_0         
	//   16   30:bipush          119
	//   17   32:putfield        #36  <Field int foregroundGravity>
		mForegroundInPadding = true;
	//   18   35:aload_0         
	//   19   36:iconst_1        
	//   20   37:putfield        #38  <Field boolean mForegroundInPadding>
		foregroundBoundsChanged = false;
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:putfield        #40  <Field boolean foregroundBoundsChanged>
		context = ((Context) (ThemeEnforcement.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.ForegroundLinearLayout, i, 0, new int[0])));
	//   24   45:aload_1         
	//   25   46:aload_2         
	//   26   47:getstatic       #46  <Field int[] android.support.design.R$styleable.ForegroundLinearLayout>
	//   27   50:iload_3         
	//   28   51:iconst_0        
	//   29   52:iconst_0        
	//   30   53:newarray        int[]
	//   31   55:invokestatic    #52  <Method TypedArray ThemeEnforcement.obtainStyledAttributes(Context, AttributeSet, int[], int, int, int[])>
	//   32   58:astore_1        
		foregroundGravity = ((TypedArray) (context)).getInt(android.support.design.R.styleable.ForegroundLinearLayout_android_foregroundGravity, foregroundGravity);
	//   33   59:aload_0         
	//   34   60:aload_1         
	//   35   61:getstatic       #55  <Field int android.support.design.R$styleable.ForegroundLinearLayout_android_foregroundGravity>
	//   36   64:aload_0         
	//   37   65:getfield        #36  <Field int foregroundGravity>
	//   38   68:invokevirtual   #61  <Method int TypedArray.getInt(int, int)>
	//   39   71:putfield        #36  <Field int foregroundGravity>
		attributeset = ((AttributeSet) (((TypedArray) (context)).getDrawable(android.support.design.R.styleable.ForegroundLinearLayout_android_foreground)));
	//   40   74:aload_1         
	//   41   75:getstatic       #64  <Field int android.support.design.R$styleable.ForegroundLinearLayout_android_foreground>
	//   42   78:invokevirtual   #68  <Method Drawable TypedArray.getDrawable(int)>
	//   43   81:astore_2        
		if(attributeset != null)
	//*  44   82:aload_2         
	//*  45   83:ifnull          91
			setForeground(((Drawable) (attributeset)));
	//   46   86:aload_0         
	//   47   87:aload_2         
	//   48   88:invokevirtual   #72  <Method void setForeground(Drawable)>
		mForegroundInPadding = ((TypedArray) (context)).getBoolean(android.support.design.R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
	//   49   91:aload_0         
	//   50   92:aload_1         
	//   51   93:getstatic       #75  <Field int android.support.design.R$styleable.ForegroundLinearLayout_foregroundInsidePadding>
	//   52   96:iconst_1        
	//   53   97:invokevirtual   #79  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   54  100:putfield        #38  <Field boolean mForegroundInPadding>
		((TypedArray) (context)).recycle();
	//   55  103:aload_1         
	//   56  104:invokevirtual   #82  <Method void TypedArray.recycle()>
	//   57  107:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #87  <Method void LinearLayoutCompat.draw(Canvas)>
		Drawable drawable = foreground;
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field Drawable foreground>
	//    5    9:astore          4
		if(drawable != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          138
		{
			if(foregroundBoundsChanged)
	//*   8   16:aload_0         
	//*   9   17:getfield        #40  <Field boolean foregroundBoundsChanged>
	//*  10   20:ifeq            132
			{
				foregroundBoundsChanged = false;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #40  <Field boolean foregroundBoundsChanged>
				Rect rect = selfBounds;
	//   14   28:aload_0         
	//   15   29:getfield        #32  <Field Rect selfBounds>
	//   16   32:astore          5
				Rect rect1 = overlayBounds;
	//   17   34:aload_0         
	//   18   35:getfield        #34  <Field Rect overlayBounds>
	//   19   38:astore          6
				int i = getRight() - getLeft();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #93  <Method int getRight()>
	//   22   44:aload_0         
	//   23   45:invokevirtual   #96  <Method int getLeft()>
	//   24   48:isub            
	//   25   49:istore_2        
				int j = getBottom() - getTop();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #99  <Method int getBottom()>
	//   28   54:aload_0         
	//   29   55:invokevirtual   #102 <Method int getTop()>
	//   30   58:isub            
	//   31   59:istore_3        
				if(mForegroundInPadding)
	//*  32   60:aload_0         
	//*  33   61:getfield        #38  <Field boolean mForegroundInPadding>
	//*  34   64:ifeq            79
					rect.set(0, 0, i, j);
	//   35   67:aload           5
	//   36   69:iconst_0        
	//   37   70:iconst_0        
	//   38   71:iload_2         
	//   39   72:iload_3         
	//   40   73:invokevirtual   #106 <Method void Rect.set(int, int, int, int)>
				else
	//*  41   76:goto            104
					rect.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), j - getPaddingBottom());
	//   42   79:aload           5
	//   43   81:aload_0         
	//   44   82:invokevirtual   #109 <Method int getPaddingLeft()>
	//   45   85:aload_0         
	//   46   86:invokevirtual   #112 <Method int getPaddingTop()>
	//   47   89:iload_2         
	//   48   90:aload_0         
	//   49   91:invokevirtual   #115 <Method int getPaddingRight()>
	//   50   94:isub            
	//   51   95:iload_3         
	//   52   96:aload_0         
	//   53   97:invokevirtual   #118 <Method int getPaddingBottom()>
	//   54  100:isub            
	//   55  101:invokevirtual   #106 <Method void Rect.set(int, int, int, int)>
				Gravity.apply(foregroundGravity, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect1);
	//   56  104:aload_0         
	//   57  105:getfield        #36  <Field int foregroundGravity>
	//   58  108:aload           4
	//   59  110:invokevirtual   #123 <Method int Drawable.getIntrinsicWidth()>
	//   60  113:aload           4
	//   61  115:invokevirtual   #126 <Method int Drawable.getIntrinsicHeight()>
	//   62  118:aload           5
	//   63  120:aload           6
	//   64  122:invokestatic    #132 <Method void Gravity.apply(int, int, int, Rect, Rect)>
				drawable.setBounds(rect1);
	//   65  125:aload           4
	//   66  127:aload           6
	//   67  129:invokevirtual   #136 <Method void Drawable.setBounds(Rect)>
			}
			drawable.draw(canvas);
	//   68  132:aload           4
	//   69  134:aload_1         
	//   70  135:invokevirtual   #137 <Method void Drawable.draw(Canvas)>
		}
	//   71  138:return          
	}

	public void drawableHotspotChanged(float f, float f1)
	{
		super.drawableHotspotChanged(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #145 <Method void LinearLayoutCompat.drawableHotspotChanged(float, float)>
		Drawable drawable = foreground;
	//    4    6:aload_0         
	//    5    7:getfield        #89  <Field Drawable foreground>
	//    6   10:astore_3        
		if(drawable != null)
	//*   7   11:aload_3         
	//*   8   12:ifnull          21
			drawable.setHotspot(f, f1);
	//    9   15:aload_3         
	//   10   16:fload_1         
	//   11   17:fload_2         
	//   12   18:invokevirtual   #148 <Method void Drawable.setHotspot(float, float)>
	//   13   21:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #152 <Method void LinearLayoutCompat.drawableStateChanged()>
		Drawable drawable = foreground;
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field Drawable foreground>
	//    4    8:astore_1        
		if(drawable != null && drawable.isStateful())
	//*   5    9:aload_1         
	//*   6   10:ifnull          32
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #156 <Method boolean Drawable.isStateful()>
	//*   9   17:ifeq            32
			foreground.setState(getDrawableState());
	//   10   20:aload_0         
	//   11   21:getfield        #89  <Field Drawable foreground>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #160 <Method int[] getDrawableState()>
	//   14   28:invokevirtual   #164 <Method boolean Drawable.setState(int[])>
	//   15   31:pop             
	//   16   32:return          
	}

	public Drawable getForeground()
	{
		return foreground;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Drawable foreground>
	//    2    4:areturn         
	}

	public int getForegroundGravity()
	{
		return foregroundGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int foregroundGravity>
	//    2    4:ireturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #171 <Method void LinearLayoutCompat.jumpDrawablesToCurrentState()>
		Drawable drawable = foreground;
	//    2    4:aload_0         
	//    3    5:getfield        #89  <Field Drawable foreground>
	//    4    8:astore_1        
		if(drawable != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			drawable.jumpToCurrentState();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #174 <Method void Drawable.jumpToCurrentState()>
	//    9   17:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #178 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
		foregroundBoundsChanged = flag | foregroundBoundsChanged;
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:aload_0         
	//   10   14:getfield        #40  <Field boolean foregroundBoundsChanged>
	//   11   17:ior             
	//   12   18:putfield        #40  <Field boolean foregroundBoundsChanged>
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
	//    5    6:invokespecial   #181 <Method void LinearLayoutCompat.onSizeChanged(int, int, int, int)>
		foregroundBoundsChanged = true;
	//    6    9:aload_0         
	//    7   10:iconst_1        
	//    8   11:putfield        #40  <Field boolean foregroundBoundsChanged>
	//    9   14:return          
	}

	public void setForeground(Drawable drawable)
	{
		Drawable drawable1 = foreground;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Drawable foreground>
	//    2    4:astore_2        
		if(drawable1 != drawable)
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:if_acmpeq       99
		{
			if(drawable1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          27
			{
				drawable1.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    8   14:aload_2         
	//    9   15:aconst_null     
	//   10   16:invokevirtual   #185 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				unscheduleDrawable(foreground);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #89  <Field Drawable foreground>
	//   14   24:invokevirtual   #188 <Method void unscheduleDrawable(Drawable)>
			}
			foreground = drawable;
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:putfield        #89  <Field Drawable foreground>
			if(drawable != null)
	//*  18   32:aload_1         
	//*  19   33:ifnull          86
			{
				setWillNotDraw(false);
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:invokevirtual   #192 <Method void setWillNotDraw(boolean)>
				drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   23   41:aload_1         
	//   24   42:aload_0         
	//   25   43:invokevirtual   #185 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				if(drawable.isStateful())
	//*  26   46:aload_1         
	//*  27   47:invokevirtual   #156 <Method boolean Drawable.isStateful()>
	//*  28   50:ifeq            62
					drawable.setState(getDrawableState());
	//   29   53:aload_1         
	//   30   54:aload_0         
	//   31   55:invokevirtual   #160 <Method int[] getDrawableState()>
	//   32   58:invokevirtual   #164 <Method boolean Drawable.setState(int[])>
	//   33   61:pop             
				if(foregroundGravity == 119)
	//*  34   62:aload_0         
	//*  35   63:getfield        #36  <Field int foregroundGravity>
	//*  36   66:bipush          119
	//*  37   68:icmpne          91
					drawable.getPadding(new Rect());
	//   38   71:aload_1         
	//   39   72:new             #27  <Class Rect>
	//   40   75:dup             
	//   41   76:invokespecial   #30  <Method void Rect()>
	//   42   79:invokevirtual   #196 <Method boolean Drawable.getPadding(Rect)>
	//   43   82:pop             
			} else
	//*  44   83:goto            91
			{
				setWillNotDraw(true);
	//   45   86:aload_0         
	//   46   87:iconst_1        
	//   47   88:invokevirtual   #192 <Method void setWillNotDraw(boolean)>
			}
			requestLayout();
	//   48   91:aload_0         
	//   49   92:invokevirtual   #199 <Method void requestLayout()>
			invalidate();
	//   50   95:aload_0         
	//   51   96:invokevirtual   #202 <Method void invalidate()>
		}
	//   52   99:return          
	}

	public void setForegroundGravity(int i)
	{
		if(foregroundGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field int foregroundGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          78
		{
			int j = i;
	//    4    8:iload_1         
	//    5    9:istore_2        
			if((0x800007 & i) == 0)
	//*   6   10:ldc1            #205 <Int 0x800007>
	//*   7   12:iload_1         
	//*   8   13:iand            
	//*   9   14:ifne            22
				j = i | 0x800003;
	//   10   17:iload_1         
	//   11   18:ldc1            #206 <Int 0x800003>
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
			foregroundGravity = i;
	//   24   36:aload_0         
	//   25   37:iload_1         
	//   26   38:putfield        #36  <Field int foregroundGravity>
			if(foregroundGravity == 119 && foreground != null)
	//*  27   41:aload_0         
	//*  28   42:getfield        #36  <Field int foregroundGravity>
	//*  29   45:bipush          119
	//*  30   47:icmpne          74
	//*  31   50:aload_0         
	//*  32   51:getfield        #89  <Field Drawable foreground>
	//*  33   54:ifnull          74
			{
				Rect rect = new Rect();
	//   34   57:new             #27  <Class Rect>
	//   35   60:dup             
	//   36   61:invokespecial   #30  <Method void Rect()>
	//   37   64:astore_3        
				foreground.getPadding(rect);
	//   38   65:aload_0         
	//   39   66:getfield        #89  <Field Drawable foreground>
	//   40   69:aload_3         
	//   41   70:invokevirtual   #196 <Method boolean Drawable.getPadding(Rect)>
	//   42   73:pop             
			}
			requestLayout();
	//   43   74:aload_0         
	//   44   75:invokevirtual   #199 <Method void requestLayout()>
		}
	//   45   78:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == foreground;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #210 <Method boolean LinearLayoutCompat.verifyDrawable(Drawable)>
	//    3    5:ifne            21
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #89  <Field Drawable foreground>
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	private Drawable foreground;
	boolean foregroundBoundsChanged;
	private int foregroundGravity;
	protected boolean mForegroundInPadding;
	private final Rect overlayBounds;
	private final Rect selfBounds;
}
