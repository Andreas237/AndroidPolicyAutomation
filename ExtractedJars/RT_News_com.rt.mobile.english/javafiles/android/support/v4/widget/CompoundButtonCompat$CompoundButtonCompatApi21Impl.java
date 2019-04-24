// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v4.widget:
//			CompoundButtonCompat

static class CompoundButtonCompat$CompoundButtonCompatApi21Impl extends CompoundButtonCompat.CompoundButtonCompatBaseImpl
{

	public ColorStateList getButtonTintList(CompoundButton compoundbutton)
	{
		return compoundbutton.getButtonTintList();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method ColorStateList CompoundButton.getButtonTintList()>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getButtonTintMode(CompoundButton compoundbutton)
	{
		return compoundbutton.getButtonTintMode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method android.graphics.PorterDuff$Mode CompoundButton.getButtonTintMode()>
	//    2    4:areturn         
	}

	public void setButtonTintList(CompoundButton compoundbutton, ColorStateList colorstatelist)
	{
		compoundbutton.setButtonTintList(colorstatelist);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #32  <Method void CompoundButton.setButtonTintList(ColorStateList)>
	//    3    5:return          
	}

	public void setButtonTintMode(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
	{
		compoundbutton.setButtonTintMode(mode);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #37  <Method void CompoundButton.setButtonTintMode(android.graphics.PorterDuff$Mode)>
	//    3    5:return          
	}

	CompoundButtonCompat$CompoundButtonCompatApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CompoundButtonCompat$CompoundButtonCompatBaseImpl()>
	//    2    4:return          
	}
}
