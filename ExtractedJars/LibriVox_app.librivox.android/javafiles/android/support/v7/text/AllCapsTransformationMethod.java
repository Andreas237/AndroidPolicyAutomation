// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.text;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public class AllCapsTransformationMethod
	implements TransformationMethod
{

	public AllCapsTransformationMethod(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mLocale = context.getResources().getConfiguration().locale;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #19  <Method Resources Context.getResources()>
	//    5    9:invokevirtual   #25  <Method Configuration Resources.getConfiguration()>
	//    6   12:getfield        #30  <Field Locale Configuration.locale>
	//    7   15:putfield        #32  <Field Locale mLocale>
	//    8   18:return          
	}

	public CharSequence getTransformation(CharSequence charsequence, View view)
	{
		if(charsequence != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			return ((CharSequence) (charsequence.toString().toUpperCase(mLocale)));
	//    2    4:aload_1         
	//    3    5:invokeinterface #41  <Method String CharSequence.toString()>
	//    4   10:aload_0         
	//    5   11:getfield        #32  <Field Locale mLocale>
	//    6   14:invokevirtual   #47  <Method String String.toUpperCase(Locale)>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public void onFocusChanged(View view, CharSequence charsequence, boolean flag, int i, Rect rect)
	{
	//    0    0:return          
	}

	private Locale mLocale;
}
