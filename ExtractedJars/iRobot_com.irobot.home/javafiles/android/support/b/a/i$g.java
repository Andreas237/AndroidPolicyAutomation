// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.b.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

// Referenced classes of package android.support.b.a:
//			i

private static class i$g extends android.graphics.drawable.able.ConstantState
{

	public boolean canApplyTheme()
	{
		return a.canApplyTheme();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState a>
	//    2    4:invokevirtual   #21  <Method boolean android.graphics.drawable.Drawable$ConstantState.canApplyTheme()>
	//    3    7:ireturn         
	}

	public int getChangingConfigurations()
	{
		return a.getChangingConfigurations();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState a>
	//    2    4:invokevirtual   #25  <Method int android.graphics.drawable.Drawable$ConstantState.getChangingConfigurations()>
	//    3    7:ireturn         
	}

	public Drawable newDrawable()
	{
		i j = new i();
	//    0    0:new             #6   <Class i>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void i()>
	//    3    7:astore_1        
		j.b = ((Drawable) ((VectorDrawable)a.newDrawable()));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState a>
	//    7   13:invokevirtual   #30  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//    8   16:checkcast       #32  <Class VectorDrawable>
	//    9   19:putfield        #36  <Field Drawable i.b>
		return ((Drawable) (j));
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	public Drawable newDrawable(Resources resources)
	{
		i j = new i();
	//    0    0:new             #6   <Class i>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void i()>
	//    3    7:astore_2        
		j.b = ((Drawable) ((VectorDrawable)a.newDrawable(resources)));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState a>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #39  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//    9   17:checkcast       #32  <Class VectorDrawable>
	//   10   20:putfield        #36  <Field Drawable i.b>
		return ((Drawable) (j));
	//   11   23:aload_2         
	//   12   24:areturn         
	}

	public Drawable newDrawable(Resources resources, android.content.res.urces.Theme theme)
	{
		i j = new i();
	//    0    0:new             #6   <Class i>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void i()>
	//    3    7:astore_3        
		j.b = ((Drawable) ((VectorDrawable)a.newDrawable(resources, theme)));
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState a>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #42  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources, android.content.res.Resources$Theme)>
	//   10   18:checkcast       #32  <Class VectorDrawable>
	//   11   21:putfield        #36  <Field Drawable i.b>
		return ((Drawable) (j));
	//   12   24:aload_3         
	//   13   25:areturn         
	}

	private final android.graphics.drawable.able.ConstantState a;

	public i$g(android.graphics.drawable.able.ConstantState constantstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void android.graphics.drawable.Drawable$ConstantState()>
		a = constantstate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field android.graphics.drawable.Drawable$ConstantState a>
	//    5    9:return          
	}
}
