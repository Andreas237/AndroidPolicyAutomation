// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.*;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.graphics.drawable:
//			DrawableCompat, DrawableWrapper, TintAwareDrawable, DrawableWrapperApi21

static class DrawableCompat$DrawableCompatApi21Impl extends DrawableCompat$DrawableCompatApi19Impl
{

	public void applyTheme(Drawable drawable, android.content.res.Resources.Theme theme)
	{
		drawable.applyTheme(theme);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #22  <Method void Drawable.applyTheme(android.content.res.Resources$Theme)>
	//    3    5:return          
	}

	public boolean canApplyTheme(Drawable drawable)
	{
		return drawable.canApplyTheme();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method boolean Drawable.canApplyTheme()>
	//    2    4:ireturn         
	}

	public void clearColorFilter(Drawable drawable)
	{
		drawable.clearColorFilter();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method void Drawable.clearColorFilter()>
		if(!(drawable instanceof InsetDrawable)) goto _L2; else goto _L1
	//    2    4:aload_1         
	//    3    5:instanceof      #33  <Class InsetDrawable>
	//    4    8:ifeq            23
_L1:
		clearColorFilter(((InsetDrawable)drawable).getDrawable());
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:checkcast       #33  <Class InsetDrawable>
	//    8   16:invokevirtual   #37  <Method Drawable InsetDrawable.getDrawable()>
	//    9   19:invokevirtual   #39  <Method void clearColorFilter(Drawable)>
_L4:
		return;
	//   10   22:return          
_L2:
		if(drawable instanceof DrawableWrapper)
	//*  11   23:aload_1         
	//*  12   24:instanceof      #41  <Class DrawableWrapper>
	//*  13   27:ifeq            44
		{
			clearColorFilter(((DrawableWrapper)drawable).getWrappedDrawable());
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:checkcast       #41  <Class DrawableWrapper>
	//   17   35:invokeinterface #44  <Method Drawable DrawableWrapper.getWrappedDrawable()>
	//   18   40:invokevirtual   #39  <Method void clearColorFilter(Drawable)>
			return;
	//   19   43:return          
		}
		if(drawable instanceof DrawableContainer)
	//*  20   44:aload_1         
	//*  21   45:instanceof      #46  <Class DrawableContainer>
	//*  22   48:ifeq            22
		{
			drawable = ((Drawable) ((android.graphics.drawable.e)((DrawableContainer)drawable).getConstantState()));
	//   23   51:aload_1         
	//   24   52:checkcast       #46  <Class DrawableContainer>
	//   25   55:invokevirtual   #50  <Method android.graphics.drawable.Drawable$ConstantState DrawableContainer.getConstantState()>
	//   26   58:checkcast       #52  <Class android.graphics.drawable.DrawableContainer$DrawableContainerState>
	//   27   61:astore_1        
			if(drawable != null)
	//*  28   62:aload_1         
	//*  29   63:ifnull          22
			{
				int i = 0;
	//   30   66:iconst_0        
	//   31   67:istore_2        
				int j = ((android.graphics.drawable.e) (drawable)).getChildCount();
	//   32   68:aload_1         
	//   33   69:invokevirtual   #56  <Method int android.graphics.drawable.DrawableContainer$DrawableContainerState.getChildCount()>
	//   34   72:istore_3        
				while(i < j) 
	//*  35   73:iload_2         
	//*  36   74:iload_3         
	//*  37   75:icmpge          22
				{
					Drawable drawable1 = ((android.graphics.drawable.e) (drawable)).getChild(i);
	//   38   78:aload_1         
	//   39   79:iload_2         
	//   40   80:invokevirtual   #60  <Method Drawable android.graphics.drawable.DrawableContainer$DrawableContainerState.getChild(int)>
	//   41   83:astore          4
					if(drawable1 != null)
	//*  42   85:aload           4
	//*  43   87:ifnull          96
						clearColorFilter(drawable1);
	//   44   90:aload_0         
	//   45   91:aload           4
	//   46   93:invokevirtual   #39  <Method void clearColorFilter(Drawable)>
					i++;
	//   47   96:iload_2         
	//   48   97:iconst_1        
	//   49   98:iadd            
	//   50   99:istore_2        
				}
			}
		}
		if(true) goto _L4; else goto _L3
	//   51  100:goto            73
_L3:
	}

	public ColorFilter getColorFilter(Drawable drawable)
	{
		return drawable.getColorFilter();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #65  <Method ColorFilter Drawable.getColorFilter()>
	//    2    4:areturn         
	}

	public void inflate(Drawable drawable, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws IOException, XmlPullParserException
	{
		drawable.inflate(resources, xmlpullparser, attributeset, theme);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #74  <Method void Drawable.inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//    6   10:return          
	}

	public void setHotspot(Drawable drawable, float f, float f1)
	{
		drawable.setHotspot(f, f1);
	//    0    0:aload_1         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #80  <Method void Drawable.setHotspot(float, float)>
	//    4    6:return          
	}

	public void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
	{
		drawable.setHotspotBounds(i, j, k, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #85  <Method void Drawable.setHotspotBounds(int, int, int, int)>
	//    6   10:return          
	}

	public void setTint(Drawable drawable, int i)
	{
		drawable.setTint(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #90  <Method void Drawable.setTint(int)>
	//    3    5:return          
	}

	public void setTintList(Drawable drawable, ColorStateList colorstatelist)
	{
		drawable.setTintList(colorstatelist);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #95  <Method void Drawable.setTintList(ColorStateList)>
	//    3    5:return          
	}

	public void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
	{
		drawable.setTintMode(mode);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #100 <Method void Drawable.setTintMode(android.graphics.PorterDuff$Mode)>
	//    3    5:return          
	}

	public Drawable wrap(Drawable drawable)
	{
		Object obj = ((Object) (drawable));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(!(drawable instanceof TintAwareDrawable))
	//*   2    2:aload_1         
	//*   3    3:instanceof      #104 <Class TintAwareDrawable>
	//*   4    6:ifne            18
			obj = ((Object) (new DrawableWrapperApi21(drawable)));
	//    5    9:new             #106 <Class DrawableWrapperApi21>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #108 <Method void DrawableWrapperApi21(Drawable)>
	//    9   17:astore_2        
		return ((Drawable) (obj));
	//   10   18:aload_2         
	//   11   19:areturn         
	}

	DrawableCompat$DrawableCompatApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void DrawableCompat$DrawableCompatApi19Impl()>
	//    2    4:return          
	}
}
