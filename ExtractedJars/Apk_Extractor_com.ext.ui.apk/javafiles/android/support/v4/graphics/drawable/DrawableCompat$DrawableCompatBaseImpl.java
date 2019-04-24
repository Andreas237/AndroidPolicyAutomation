// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.graphics.drawable:
//			DrawableCompat, TintAwareDrawable, DrawableWrapperApi14

static class DrawableCompat$DrawableCompatBaseImpl
{

	public void applyTheme(Drawable drawable, android.content.res.Resources.Theme theme)
	{
	//    0    0:return          
	}

	public boolean canApplyTheme(Drawable drawable)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void clearColorFilter(Drawable drawable)
	{
		drawable.clearColorFilter();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method void Drawable.clearColorFilter()>
	//    2    4:return          
	}

	public int getAlpha(Drawable drawable)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ColorFilter getColorFilter(Drawable drawable)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getLayoutDirection(Drawable drawable)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void inflate(Drawable drawable, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws IOException, XmlPullParserException
	{
		drawable.inflate(resources, xmlpullparser, attributeset);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #36  <Method void Drawable.inflate(Resources, XmlPullParser, AttributeSet)>
	//    5    8:return          
	}

	public boolean isAutoMirrored(Drawable drawable)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void jumpToCurrentState(Drawable drawable)
	{
		drawable.jumpToCurrentState();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #41  <Method void Drawable.jumpToCurrentState()>
	//    2    4:return          
	}

	public void setAutoMirrored(Drawable drawable, boolean flag)
	{
	//    0    0:return          
	}

	public void setHotspot(Drawable drawable, float f, float f1)
	{
	//    0    0:return          
	}

	public void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
	{
	//    0    0:return          
	}

	public boolean setLayoutDirection(Drawable drawable, int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setTint(Drawable drawable, int i)
	{
		if(drawable instanceof TintAwareDrawable)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #53  <Class TintAwareDrawable>
	//*   2    4:ifeq            17
			((TintAwareDrawable)drawable).setTint(i);
	//    3    7:aload_1         
	//    4    8:checkcast       #53  <Class TintAwareDrawable>
	//    5   11:iload_2         
	//    6   12:invokeinterface #56  <Method void TintAwareDrawable.setTint(int)>
	//    7   17:return          
	}

	public void setTintList(Drawable drawable, ColorStateList colorstatelist)
	{
		if(drawable instanceof TintAwareDrawable)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #53  <Class TintAwareDrawable>
	//*   2    4:ifeq            17
			((TintAwareDrawable)drawable).setTintList(colorstatelist);
	//    3    7:aload_1         
	//    4    8:checkcast       #53  <Class TintAwareDrawable>
	//    5   11:aload_2         
	//    6   12:invokeinterface #61  <Method void TintAwareDrawable.setTintList(ColorStateList)>
	//    7   17:return          
	}

	public void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
	{
		if(drawable instanceof TintAwareDrawable)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #53  <Class TintAwareDrawable>
	//*   2    4:ifeq            17
			((TintAwareDrawable)drawable).setTintMode(mode);
	//    3    7:aload_1         
	//    4    8:checkcast       #53  <Class TintAwareDrawable>
	//    5   11:aload_2         
	//    6   12:invokeinterface #66  <Method void TintAwareDrawable.setTintMode(android.graphics.PorterDuff$Mode)>
	//    7   17:return          
	}

	public Drawable wrap(Drawable drawable)
	{
		Object obj = ((Object) (drawable));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(!(drawable instanceof TintAwareDrawable))
	//*   2    2:aload_1         
	//*   3    3:instanceof      #53  <Class TintAwareDrawable>
	//*   4    6:ifne            18
			obj = ((Object) (new DrawableWrapperApi14(drawable)));
	//    5    9:new             #70  <Class DrawableWrapperApi14>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #72  <Method void DrawableWrapperApi14(Drawable)>
	//    9   17:astore_2        
		return ((Drawable) (obj));
	//   10   18:aload_2         
	//   11   19:areturn         
	}

	DrawableCompat$DrawableCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
