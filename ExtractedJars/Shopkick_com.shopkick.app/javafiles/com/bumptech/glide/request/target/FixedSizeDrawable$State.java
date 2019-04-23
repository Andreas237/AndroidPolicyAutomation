// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.bumptech.glide.request.target:
//			FixedSizeDrawable

static final class FixedSizeDrawable$State extends android.graphics.drawable.Drawable.ConstantState
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

	FixedSizeDrawable$State(android.graphics.drawable.Drawable.ConstantState constantstate, int i, int j)
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

	FixedSizeDrawable$State(FixedSizeDrawable$State fixedsizedrawable$state)
	{
		this(fixedsizedrawable$state.wrapped, fixedsizedrawable$state.width, fixedsizedrawable$state.height);
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
