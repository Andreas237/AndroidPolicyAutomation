// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.theme;

import android.content.Context;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class MaterialComponentsViewInflater extends AppCompatViewInflater
{

	public MaterialComponentsViewInflater()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void AppCompatViewInflater()>
	//    2    4:return          
	}

	protected AppCompatButton createButton(Context context, AttributeSet attributeset)
	{
		return ((AppCompatButton) (new MaterialButton(context, attributeset)));
	//    0    0:new             #15  <Class MaterialButton>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #18  <Method void MaterialButton(Context, AttributeSet)>
	//    5    9:areturn         
	}
}
