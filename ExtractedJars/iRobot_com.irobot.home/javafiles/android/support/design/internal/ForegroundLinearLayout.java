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
	//    3    3:invokespecial   #19  <Method void ForegroundLinearLayout(Context, AttributeSet)>
	//    4    6:return          
	}

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
	//    4    4:invokespecial   #24  <Method void LinearLayoutCompat(Context, AttributeSet, int)>
		d = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #26  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #29  <Method void Rect()>
	//    9   15:putfield        #31  <Field Rect d>
		e = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #26  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #29  <Method void Rect()>
	//   14   26:putfield        #33  <Field Rect e>
		f = 119;
	//   15   29:aload_0         
	//   16   30:bipush          119
	//   17   32:putfield        #35  <Field int f>
		a = true;
	//   18   35:aload_0         
	//   19   36:iconst_1        
	//   20   37:putfield        #37  <Field boolean a>
		b = false;
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:putfield        #39  <Field boolean b>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.ForegroundLinearLayout, i, 0)));
	//   24   45:aload_1         
	//   25   46:aload_2         
	//   26   47:getstatic       #45  <Field int[] android.support.design.a$k.ForegroundLinearLayout>
	//   27   50:iload_3         
	//   28   51:iconst_0        
	//   29   52:invokevirtual   #51  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   30   55:astore_1        
		f = ((TypedArray) (context)).getInt(android.support.design.a.k.ForegroundLinearLayout_android_foregroundGravity, f);
	//   31   56:aload_0         
	//   32   57:aload_1         
	//   33   58:getstatic       #54  <Field int android.support.design.a$k.ForegroundLinearLayout_android_foregroundGravity>
	//   34   61:aload_0         
	//   35   62:getfield        #35  <Field int f>
	//   36   65:invokevirtual   #60  <Method int TypedArray.getInt(int, int)>
	//   37   68:putfield        #35  <Field int f>
		attributeset = ((AttributeSet) (((TypedArray) (context)).getDrawable(android.support.design.a.k.ForegroundLinearLayout_android_foreground)));
	//   38   71:aload_1         
	//   39   72:getstatic       #63  <Field int android.support.design.a$k.ForegroundLinearLayout_android_foreground>
	//   40   75:invokevirtual   #67  <Method Drawable TypedArray.getDrawable(int)>
	//   41   78:astore_2        
		if(attributeset != null)
	//*  42   79:aload_2         
	//*  43   80:ifnull          88
			setForeground(((Drawable) (attributeset)));
	//   44   83:aload_0         
	//   45   84:aload_2         
	//   46   85:invokevirtual   #71  <Method void setForeground(Drawable)>
		a = ((TypedArray) (context)).getBoolean(android.support.design.a.k.ForegroundLinearLayout_foregroundInsidePadding, true);
	//   47   88:aload_0         
	//   48   89:aload_1         
	//   49   90:getstatic       #74  <Field int android.support.design.a$k.ForegroundLinearLayout_foregroundInsidePadding>
	//   50   93:iconst_1        
	//   51   94:invokevirtual   #78  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   52   97:putfield        #37  <Field boolean a>
		((TypedArray) (context)).recycle();
	//   53  100:aload_1         
	//   54  101:invokevirtual   #81  <Method void TypedArray.recycle()>
	//   55  104:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void LinearLayoutCompat.draw(Canvas)>
		if(c != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #87  <Field Drawable c>
	//*   5    9:ifnull          140
		{
			Drawable drawable = c;
	//    6   12:aload_0         
	//    7   13:getfield        #87  <Field Drawable c>
	//    8   16:astore          4
			if(b)
	//*   9   18:aload_0         
	//*  10   19:getfield        #39  <Field boolean b>
	//*  11   22:ifeq            134
			{
				b = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #39  <Field boolean b>
				Rect rect = d;
	//   15   30:aload_0         
	//   16   31:getfield        #31  <Field Rect d>
	//   17   34:astore          5
				Rect rect1 = e;
	//   18   36:aload_0         
	//   19   37:getfield        #33  <Field Rect e>
	//   20   40:astore          6
				int i = getRight() - getLeft();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #91  <Method int getRight()>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #94  <Method int getLeft()>
	//   25   50:isub            
	//   26   51:istore_2        
				int j = getBottom() - getTop();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #97  <Method int getBottom()>
	//   29   56:aload_0         
	//   30   57:invokevirtual   #100 <Method int getTop()>
	//   31   60:isub            
	//   32   61:istore_3        
				if(a)
	//*  33   62:aload_0         
	//*  34   63:getfield        #37  <Field boolean a>
	//*  35   66:ifeq            81
					rect.set(0, 0, i, j);
	//   36   69:aload           5
	//   37   71:iconst_0        
	//   38   72:iconst_0        
	//   39   73:iload_2         
	//   40   74:iload_3         
	//   41   75:invokevirtual   #104 <Method void Rect.set(int, int, int, int)>
				else
	//*  42   78:goto            106
					rect.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), j - getPaddingBottom());
	//   43   81:aload           5
	//   44   83:aload_0         
	//   45   84:invokevirtual   #107 <Method int getPaddingLeft()>
	//   46   87:aload_0         
	//   47   88:invokevirtual   #110 <Method int getPaddingTop()>
	//   48   91:iload_2         
	//   49   92:aload_0         
	//   50   93:invokevirtual   #113 <Method int getPaddingRight()>
	//   51   96:isub            
	//   52   97:iload_3         
	//   53   98:aload_0         
	//   54   99:invokevirtual   #116 <Method int getPaddingBottom()>
	//   55  102:isub            
	//   56  103:invokevirtual   #104 <Method void Rect.set(int, int, int, int)>
				Gravity.apply(f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect1);
	//   57  106:aload_0         
	//   58  107:getfield        #35  <Field int f>
	//   59  110:aload           4
	//   60  112:invokevirtual   #121 <Method int Drawable.getIntrinsicWidth()>
	//   61  115:aload           4
	//   62  117:invokevirtual   #124 <Method int Drawable.getIntrinsicHeight()>
	//   63  120:aload           5
	//   64  122:aload           6
	//   65  124:invokestatic    #130 <Method void Gravity.apply(int, int, int, Rect, Rect)>
				drawable.setBounds(rect1);
	//   66  127:aload           4
	//   67  129:aload           6
	//   68  131:invokevirtual   #134 <Method void Drawable.setBounds(Rect)>
			}
			drawable.draw(canvas);
	//   69  134:aload           4
	//   70  136:aload_1         
	//   71  137:invokevirtual   #135 <Method void Drawable.draw(Canvas)>
		}
	//   72  140:return          
	}

	public void drawableHotspotChanged(float f1, float f2)
	{
		super.drawableHotspotChanged(f1, f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #139 <Method void LinearLayoutCompat.drawableHotspotChanged(float, float)>
		if(c != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #87  <Field Drawable c>
	//*   6   10:ifnull          22
			c.setHotspot(f1, f2);
	//    7   13:aload_0         
	//    8   14:getfield        #87  <Field Drawable c>
	//    9   17:fload_1         
	//   10   18:fload_2         
	//   11   19:invokevirtual   #142 <Method void Drawable.setHotspot(float, float)>
	//   12   22:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void LinearLayoutCompat.drawableStateChanged()>
		if(c != null && c.isStateful())
	//*   2    4:aload_0         
	//*   3    5:getfield        #87  <Field Drawable c>
	//*   4    8:ifnull          33
	//*   5   11:aload_0         
	//*   6   12:getfield        #87  <Field Drawable c>
	//*   7   15:invokevirtual   #149 <Method boolean Drawable.isStateful()>
	//*   8   18:ifeq            33
			c.setState(getDrawableState());
	//    9   21:aload_0         
	//   10   22:getfield        #87  <Field Drawable c>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #153 <Method int[] getDrawableState()>
	//   13   29:invokevirtual   #157 <Method boolean Drawable.setState(int[])>
	//   14   32:pop             
	//   15   33:return          
	}

	public Drawable getForeground()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Drawable c>
	//    2    4:areturn         
	}

	public int getForegroundGravity()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int f>
	//    2    4:ireturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method void LinearLayoutCompat.jumpDrawablesToCurrentState()>
		if(c != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #87  <Field Drawable c>
	//*   4    8:ifnull          18
			c.jumpToCurrentState();
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field Drawable c>
	//    7   15:invokevirtual   #166 <Method void Drawable.jumpToCurrentState()>
	//    8   18:return          
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
	//    6    8:invokespecial   #170 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
		b = flag | b;
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:aload_0         
	//   10   14:getfield        #39  <Field boolean b>
	//   11   17:ior             
	//   12   18:putfield        #39  <Field boolean b>
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
	//    5    6:invokespecial   #173 <Method void LinearLayoutCompat.onSizeChanged(int, int, int, int)>
		b = true;
	//    6    9:aload_0         
	//    7   10:iconst_1        
	//    8   11:putfield        #39  <Field boolean b>
	//    9   14:return          
	}

	public void setForeground(Drawable drawable)
	{
		if(c != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field Drawable c>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       103
		{
			if(c != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #87  <Field Drawable c>
	//*   6   12:ifnull          31
			{
				c.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #87  <Field Drawable c>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #177 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				unscheduleDrawable(c);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #87  <Field Drawable c>
	//   14   28:invokevirtual   #180 <Method void unscheduleDrawable(Drawable)>
			}
			c = drawable;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #87  <Field Drawable c>
			if(drawable != null)
	//*  18   36:aload_1         
	//*  19   37:ifnull          90
			{
				setWillNotDraw(false);
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:invokevirtual   #184 <Method void setWillNotDraw(boolean)>
				drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:invokevirtual   #177 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				if(drawable.isStateful())
	//*  26   50:aload_1         
	//*  27   51:invokevirtual   #149 <Method boolean Drawable.isStateful()>
	//*  28   54:ifeq            66
					drawable.setState(getDrawableState());
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:invokevirtual   #153 <Method int[] getDrawableState()>
	//   32   62:invokevirtual   #157 <Method boolean Drawable.setState(int[])>
	//   33   65:pop             
				if(f == 119)
	//*  34   66:aload_0         
	//*  35   67:getfield        #35  <Field int f>
	//*  36   70:bipush          119
	//*  37   72:icmpne          95
					drawable.getPadding(new Rect());
	//   38   75:aload_1         
	//   39   76:new             #26  <Class Rect>
	//   40   79:dup             
	//   41   80:invokespecial   #29  <Method void Rect()>
	//   42   83:invokevirtual   #188 <Method boolean Drawable.getPadding(Rect)>
	//   43   86:pop             
			} else
	//*  44   87:goto            95
			{
				setWillNotDraw(true);
	//   45   90:aload_0         
	//   46   91:iconst_1        
	//   47   92:invokevirtual   #184 <Method void setWillNotDraw(boolean)>
			}
			requestLayout();
	//   48   95:aload_0         
	//   49   96:invokevirtual   #191 <Method void requestLayout()>
			invalidate();
	//   50   99:aload_0         
	//   51  100:invokevirtual   #194 <Method void invalidate()>
		}
	//   52  103:return          
	}

	public void setForegroundGravity(int i)
	{
		if(f != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int f>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          78
		{
			int j = i;
	//    4    8:iload_1         
	//    5    9:istore_2        
			if((0x800007 & i) == 0)
	//*   6   10:ldc1            #197 <Int 0x800007>
	//*   7   12:iload_1         
	//*   8   13:iand            
	//*   9   14:ifne            22
				j = i | 0x800003;
	//   10   17:iload_1         
	//   11   18:ldc1            #198 <Int 0x800003>
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
			f = i;
	//   24   36:aload_0         
	//   25   37:iload_1         
	//   26   38:putfield        #35  <Field int f>
			if(f == 119 && c != null)
	//*  27   41:aload_0         
	//*  28   42:getfield        #35  <Field int f>
	//*  29   45:bipush          119
	//*  30   47:icmpne          74
	//*  31   50:aload_0         
	//*  32   51:getfield        #87  <Field Drawable c>
	//*  33   54:ifnull          74
			{
				Rect rect = new Rect();
	//   34   57:new             #26  <Class Rect>
	//   35   60:dup             
	//   36   61:invokespecial   #29  <Method void Rect()>
	//   37   64:astore_3        
				c.getPadding(rect);
	//   38   65:aload_0         
	//   39   66:getfield        #87  <Field Drawable c>
	//   40   69:aload_3         
	//   41   70:invokevirtual   #188 <Method boolean Drawable.getPadding(Rect)>
	//   42   73:pop             
			}
			requestLayout();
	//   43   74:aload_0         
	//   44   75:invokevirtual   #191 <Method void requestLayout()>
		}
	//   45   78:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == c;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #202 <Method boolean LinearLayoutCompat.verifyDrawable(Drawable)>
	//    3    5:ifne            21
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #87  <Field Drawable c>
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	protected boolean a;
	boolean b;
	private Drawable c;
	private final Rect d;
	private final Rect e;
	private int f;
}
