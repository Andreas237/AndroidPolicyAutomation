// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.*;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.v4.a.a:
//			a, f, e, b

static class a$c extends a$b
{

	public void a(Drawable drawable, float f1, float f2)
	{
		drawable.setHotspot(f1, f2);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #20  <Method void Drawable.setHotspot(float, float)>
	//    4    6:return          
	}

	public void a(Drawable drawable, int i, int j, int k, int l)
	{
		drawable.setHotspotBounds(i, j, k, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #25  <Method void Drawable.setHotspotBounds(int, int, int, int)>
	//    6   10:return          
	}

	public void a(Drawable drawable, ColorStateList colorstatelist)
	{
		drawable.setTintList(colorstatelist);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #30  <Method void Drawable.setTintList(ColorStateList)>
	//    3    5:return          
	}

	public void a(Drawable drawable, android.content.res.urces.Theme theme)
	{
		drawable.applyTheme(theme);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #35  <Method void Drawable.applyTheme(android.content.res.Resources$Theme)>
	//    3    5:return          
	}

	public void a(Drawable drawable, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.urces.Theme theme)
	{
		drawable.inflate(resources, xmlpullparser, attributeset, theme);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #40  <Method void Drawable.inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//    6   10:return          
	}

	public void a(Drawable drawable, android.graphics.erDuff.Mode mode)
	{
		drawable.setTintMode(mode);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #45  <Method void Drawable.setTintMode(android.graphics.PorterDuff$Mode)>
	//    3    5:return          
	}

	public void b(Drawable drawable, int i)
	{
		drawable.setTint(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #51  <Method void Drawable.setTint(int)>
	//    3    5:return          
	}

	public Drawable c(Drawable drawable)
	{
		if(!(drawable instanceof f))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #54  <Class f>
	//*   2    4:ifne            16
			return ((Drawable) (new e(drawable)));
	//    3    7:new             #56  <Class e>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #59  <Method void e(Drawable)>
	//    7   15:areturn         
		else
			return drawable;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public boolean e(Drawable drawable)
	{
		return drawable.canApplyTheme();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #65  <Method boolean Drawable.canApplyTheme()>
	//    2    4:ireturn         
	}

	public ColorFilter f(Drawable drawable)
	{
		return drawable.getColorFilter();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #71  <Method ColorFilter Drawable.getColorFilter()>
	//    2    4:areturn         
	}

	public void g(Drawable drawable)
	{
		drawable.clearColorFilter();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #75  <Method void Drawable.clearColorFilter()>
		if(!(drawable instanceof InsetDrawable)) goto _L2; else goto _L1
	//    2    4:aload_1         
	//    3    5:instanceof      #77  <Class InsetDrawable>
	//    4    8:ifeq            25
_L1:
		drawable = ((InsetDrawable)drawable).getDrawable();
	//    5   11:aload_1         
	//    6   12:checkcast       #77  <Class InsetDrawable>
	//    7   15:invokevirtual   #81  <Method Drawable InsetDrawable.getDrawable()>
	//    8   18:astore_1        
_L4:
		g(drawable);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #83  <Method void g(Drawable)>
		return;
	//   12   24:return          
_L2:
		if(!(drawable instanceof b))
			break; /* Loop/switch isn't completed */
	//   13   25:aload_1         
	//   14   26:instanceof      #85  <Class b>
	//   15   29:ifeq            45
		drawable = ((b)drawable).a();
	//   16   32:aload_1         
	//   17   33:checkcast       #85  <Class b>
	//   18   36:invokeinterface #87  <Method Drawable b.a()>
	//   19   41:astore_1        
		if(true) goto _L4; else goto _L3
	//   20   42:goto            19
_L3:
		if(drawable instanceof DrawableContainer)
	//*  21   45:aload_1         
	//*  22   46:instanceof      #89  <Class DrawableContainer>
	//*  23   49:ifeq            104
		{
			drawable = ((Drawable) ((android.graphics.drawable.ableContainer.DrawableContainerState)((DrawableContainer)drawable).getConstantState()));
	//   24   52:aload_1         
	//   25   53:checkcast       #89  <Class DrawableContainer>
	//   26   56:invokevirtual   #93  <Method android.graphics.drawable.Drawable$ConstantState DrawableContainer.getConstantState()>
	//   27   59:checkcast       #95  <Class android.graphics.drawable.DrawableContainer$DrawableContainerState>
	//   28   62:astore_1        
			if(drawable != null)
	//*  29   63:aload_1         
	//*  30   64:ifnull          104
			{
				int i = 0;
	//   31   67:iconst_0        
	//   32   68:istore_2        
				for(int j = ((android.graphics.drawable.ableContainer.DrawableContainerState) (drawable)).getChildCount(); i < j; i++)
	//*  33   69:aload_1         
	//*  34   70:invokevirtual   #99  <Method int android.graphics.drawable.DrawableContainer$DrawableContainerState.getChildCount()>
	//*  35   73:istore_3        
	//*  36   74:iload_2         
	//*  37   75:iload_3         
	//*  38   76:icmpge          104
				{
					Drawable drawable1 = ((android.graphics.drawable.ableContainer.DrawableContainerState) (drawable)).getChild(i);
	//   39   79:aload_1         
	//   40   80:iload_2         
	//   41   81:invokevirtual   #103 <Method Drawable android.graphics.drawable.DrawableContainer$DrawableContainerState.getChild(int)>
	//   42   84:astore          4
					if(drawable1 != null)
	//*  43   86:aload           4
	//*  44   88:ifnull          97
						g(drawable1);
	//   45   91:aload_0         
	//   46   92:aload           4
	//   47   94:invokevirtual   #83  <Method void g(Drawable)>
				}

	//   48   97:iload_2         
	//   49   98:iconst_1        
	//   50   99:iadd            
	//   51  100:istore_2        
			}
		}
	//*  52  101:goto            74
		return;
	//   53  104:return          
	}

	a$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void a$b()>
	//    2    4:return          
	}
}
