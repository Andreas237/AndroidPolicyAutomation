// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.util.Preconditions;

public class FixedSizeDrawable extends Drawable
{
	static final class State extends android.graphics.drawable.Drawable.ConstantState
	{

		public int getChangingConfigurations()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (new FixedSizeDrawable(this, wrapped.newDrawable())));
		//    0    0:new             #6   <Class FixedSizeDrawable>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState wrapped>
		//    5    9:invokevirtual   #34  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
		//    6   12:invokespecial   #37  <Method void FixedSizeDrawable(FixedSizeDrawable$State, Drawable)>
		//    7   15:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			return ((Drawable) (new FixedSizeDrawable(this, wrapped.newDrawable(resources))));
		//    0    0:new             #6   <Class FixedSizeDrawable>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState wrapped>
		//    5    9:aload_1         
		//    6   10:invokevirtual   #41  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
		//    7   13:invokespecial   #37  <Method void FixedSizeDrawable(FixedSizeDrawable$State, Drawable)>
		//    8   16:areturn         
		}

		final int height;
		final int width;
		private final android.graphics.drawable.Drawable.ConstantState wrapped;

		State(android.graphics.drawable.Drawable.ConstantState constantstate, int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void android.graphics.drawable.Drawable$ConstantState()>
			wrapped = constantstate;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field android.graphics.drawable.Drawable$ConstantState wrapped>
			width = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int width>
			height = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #23  <Field int height>
		//   11   19:return          
		}

		State(State state1)
		{
			this(state1.wrapped, state1.width, state1.height);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #19  <Field android.graphics.drawable.Drawable$ConstantState wrapped>
		//    3    5:aload_1         
		//    4    6:getfield        #21  <Field int width>
		//    5    9:aload_1         
		//    6   10:getfield        #23  <Field int height>
		//    7   13:invokespecial   #27  <Method void FixedSizeDrawable$State(android.graphics.drawable.Drawable$ConstantState, int, int)>
		//    8   16:return          
		}
	}


	public FixedSizeDrawable(Drawable drawable, int i, int j)
	{
		this(new State(drawable.getConstantState(), i, j), drawable);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class FixedSizeDrawable$State>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #27  <Method void FixedSizeDrawable$State(android.graphics.drawable.Drawable$ConstantState, int, int)>
	//    8   14:aload_1         
	//    9   15:invokespecial   #30  <Method void FixedSizeDrawable(FixedSizeDrawable$State, Drawable)>
	//   10   18:return          
	}

	FixedSizeDrawable(State state1, Drawable drawable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Drawable()>
		state = (State)Preconditions.checkNotNull(((Object) (state1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #40  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #6   <Class FixedSizeDrawable$State>
	//    6   12:putfield        #42  <Field FixedSizeDrawable$State state>
		wrapped = (Drawable)Preconditions.checkNotNull(((Object) (drawable)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #40  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #4   <Class Drawable>
	//   11   23:putfield        #44  <Field Drawable wrapped>
		drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
	//   12   26:aload_2         
	//   13   27:iconst_0        
	//   14   28:iconst_0        
	//   15   29:aload_2         
	//   16   30:invokevirtual   #48  <Method int Drawable.getIntrinsicWidth()>
	//   17   33:aload_2         
	//   18   34:invokevirtual   #51  <Method int Drawable.getIntrinsicHeight()>
	//   19   37:invokevirtual   #55  <Method void Drawable.setBounds(int, int, int, int)>
		matrix = new Matrix();
	//   20   40:aload_0         
	//   21   41:new             #57  <Class Matrix>
	//   22   44:dup             
	//   23   45:invokespecial   #58  <Method void Matrix()>
	//   24   48:putfield        #60  <Field Matrix matrix>
		wrappedRect = new RectF(0.0F, 0.0F, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
	//   25   51:aload_0         
	//   26   52:new             #62  <Class RectF>
	//   27   55:dup             
	//   28   56:fconst_0        
	//   29   57:fconst_0        
	//   30   58:aload_2         
	//   31   59:invokevirtual   #48  <Method int Drawable.getIntrinsicWidth()>
	//   32   62:i2f             
	//   33   63:aload_2         
	//   34   64:invokevirtual   #51  <Method int Drawable.getIntrinsicHeight()>
	//   35   67:i2f             
	//   36   68:invokespecial   #65  <Method void RectF(float, float, float, float)>
	//   37   71:putfield        #67  <Field RectF wrappedRect>
		bounds = new RectF();
	//   38   74:aload_0         
	//   39   75:new             #62  <Class RectF>
	//   40   78:dup             
	//   41   79:invokespecial   #68  <Method void RectF()>
	//   42   82:putfield        #70  <Field RectF bounds>
	//   43   85:return          
	}

	private void updateMatrix()
	{
		matrix.setRectToRect(wrappedRect, bounds, android.graphics.Matrix.ScaleToFit.CENTER);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Matrix matrix>
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field RectF wrappedRect>
	//    4    8:aload_0         
	//    5    9:getfield        #70  <Field RectF bounds>
	//    6   12:getstatic       #77  <Field android.graphics.Matrix$ScaleToFit android.graphics.Matrix$ScaleToFit.CENTER>
	//    7   15:invokevirtual   #81  <Method boolean Matrix.setRectToRect(RectF, RectF, android.graphics.Matrix$ScaleToFit)>
	//    8   18:pop             
	//    9   19:return          
	}

	public void clearColorFilter()
	{
		wrapped.clearColorFilter();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:invokevirtual   #84  <Method void Drawable.clearColorFilter()>
	//    3    7:return          
	}

	public void draw(Canvas canvas)
	{
		canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #92  <Method int Canvas.save()>
	//    2    4:pop             
		canvas.concat(matrix);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #60  <Field Matrix matrix>
	//    6   10:invokevirtual   #96  <Method void Canvas.concat(Matrix)>
		wrapped.draw(canvas);
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field Drawable wrapped>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #98  <Method void Drawable.draw(Canvas)>
		canvas.restore();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #101 <Method void Canvas.restore()>
	//   13   25:return          
	}

	public int getAlpha()
	{
		return wrapped.getAlpha();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:invokevirtual   #108 <Method int Drawable.getAlpha()>
	//    3    7:ireturn         
	}

	public android.graphics.drawable.Drawable.Callback getCallback()
	{
		return wrapped.getCallback();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:invokevirtual   #113 <Method android.graphics.drawable.Drawable$Callback Drawable.getCallback()>
	//    3    7:areturn         
	}

	public int getChangingConfigurations()
	{
		return wrapped.getChangingConfigurations();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:invokevirtual   #116 <Method int Drawable.getChangingConfigurations()>
	//    3    7:ireturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		return ((android.graphics.drawable.Drawable.ConstantState) (state));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field FixedSizeDrawable$State state>
	//    2    4:areturn         
	}

	public Drawable getCurrent()
	{
		return wrapped.getCurrent();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:invokevirtual   #120 <Method Drawable Drawable.getCurrent()>
	//    3    7:areturn         
	}

	public int getIntrinsicHeight()
	{
		return state.height;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field FixedSizeDrawable$State state>
	//    2    4:getfield        #124 <Field int FixedSizeDrawable$State.height>
	//    3    7:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return state.width;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field FixedSizeDrawable$State state>
	//    2    4:getfield        #127 <Field int FixedSizeDrawable$State.width>
	//    3    7:ireturn         
	}

	public int getMinimumHeight()
	{
		return wrapped.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:invokevirtual   #130 <Method int Drawable.getMinimumHeight()>
	//    3    7:ireturn         
	}

	public int getMinimumWidth()
	{
		return wrapped.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:invokevirtual   #133 <Method int Drawable.getMinimumWidth()>
	//    3    7:ireturn         
	}

	public int getOpacity()
	{
		return wrapped.getOpacity();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:invokevirtual   #136 <Method int Drawable.getOpacity()>
	//    3    7:ireturn         
	}

	public boolean getPadding(Rect rect)
	{
		return wrapped.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #140 <Method boolean Drawable.getPadding(Rect)>
	//    4    8:ireturn         
	}

	public void invalidateSelf()
	{
		super.invalidateSelf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method void Drawable.invalidateSelf()>
		wrapped.invalidateSelf();
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field Drawable wrapped>
	//    4    8:invokevirtual   #143 <Method void Drawable.invalidateSelf()>
	//    5   11:return          
	}

	public Drawable mutate()
	{
		if(!mutated && super.mutate() == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field boolean mutated>
	//*   2    4:ifne            46
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #148 <Method Drawable Drawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpne       46
		{
			wrapped = wrapped.mutate();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #44  <Field Drawable wrapped>
	//   10   20:invokevirtual   #148 <Method Drawable Drawable.mutate()>
	//   11   23:putfield        #44  <Field Drawable wrapped>
			state = new State(state);
	//   12   26:aload_0         
	//   13   27:new             #6   <Class FixedSizeDrawable$State>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:getfield        #42  <Field FixedSizeDrawable$State state>
	//   17   35:invokespecial   #151 <Method void FixedSizeDrawable$State(FixedSizeDrawable$State)>
	//   18   38:putfield        #42  <Field FixedSizeDrawable$State state>
			mutated = true;
	//   19   41:aload_0         
	//   20   42:iconst_1        
	//   21   43:putfield        #146 <Field boolean mutated>
		}
		return ((Drawable) (this));
	//   22   46:aload_0         
	//   23   47:areturn         
	}

	public void scheduleSelf(Runnable runnable, long l)
	{
		super.scheduleSelf(runnable, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #155 <Method void Drawable.scheduleSelf(Runnable, long)>
		wrapped.scheduleSelf(runnable, l);
	//    4    6:aload_0         
	//    5    7:getfield        #44  <Field Drawable wrapped>
	//    6   10:aload_1         
	//    7   11:lload_2         
	//    8   12:invokevirtual   #155 <Method void Drawable.scheduleSelf(Runnable, long)>
	//    9   15:return          
	}

	public void setAlpha(int i)
	{
		wrapped.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #159 <Method void Drawable.setAlpha(int)>
	//    4    8:return          
	}

	public void setBounds(int i, int j, int k, int l)
	{
		super.setBounds(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #55  <Method void Drawable.setBounds(int, int, int, int)>
		bounds.set(i, j, k, l);
	//    6    9:aload_0         
	//    7   10:getfield        #70  <Field RectF bounds>
	//    8   13:iload_1         
	//    9   14:i2f             
	//   10   15:iload_2         
	//   11   16:i2f             
	//   12   17:iload_3         
	//   13   18:i2f             
	//   14   19:iload           4
	//   15   21:i2f             
	//   16   22:invokevirtual   #162 <Method void RectF.set(float, float, float, float)>
		updateMatrix();
	//   17   25:aload_0         
	//   18   26:invokespecial   #164 <Method void updateMatrix()>
	//   19   29:return          
	}

	public void setBounds(Rect rect)
	{
		super.setBounds(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #167 <Method void Drawable.setBounds(Rect)>
		bounds.set(rect);
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field RectF bounds>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #169 <Method void RectF.set(Rect)>
		updateMatrix();
	//    7   13:aload_0         
	//    8   14:invokespecial   #164 <Method void updateMatrix()>
	//    9   17:return          
	}

	public void setChangingConfigurations(int i)
	{
		wrapped.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #172 <Method void Drawable.setChangingConfigurations(int)>
	//    4    8:return          
	}

	public void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		wrapped.setColorFilter(i, mode);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #176 <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    5    9:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		wrapped.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #179 <Method void Drawable.setColorFilter(ColorFilter)>
	//    4    8:return          
	}

	public void setDither(boolean flag)
	{
		wrapped.setDither(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #184 <Method void Drawable.setDither(boolean)>
	//    4    8:return          
	}

	public void setFilterBitmap(boolean flag)
	{
		wrapped.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #188 <Method void Drawable.setFilterBitmap(boolean)>
	//    4    8:return          
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		return wrapped.setVisible(flag, flag1);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Drawable wrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #192 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    5    9:ireturn         
	}

	public void unscheduleSelf(Runnable runnable)
	{
		super.unscheduleSelf(runnable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #196 <Method void Drawable.unscheduleSelf(Runnable)>
		wrapped.unscheduleSelf(runnable);
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field Drawable wrapped>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #196 <Method void Drawable.unscheduleSelf(Runnable)>
	//    7   13:return          
	}

	private final RectF bounds;
	private final Matrix matrix;
	private boolean mutated;
	private State state;
	private Drawable wrapped;
	private final RectF wrappedRect;
}
