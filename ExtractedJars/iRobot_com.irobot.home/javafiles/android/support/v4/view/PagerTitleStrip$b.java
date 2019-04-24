// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

// Referenced classes of package android.support.v4.view:
//			PagerTitleStrip

private static class PagerTitleStrip$b extends SingleLineTransformationMethod
{

	public CharSequence getTransformation(CharSequence charsequence, View view)
	{
		charsequence = super.getTransformation(charsequence, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #38  <Method CharSequence SingleLineTransformationMethod.getTransformation(CharSequence, View)>
	//    4    6:astore_1        
		if(charsequence != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          25
			return ((CharSequence) (charsequence.toString().toUpperCase(a)));
	//    7   11:aload_1         
	//    8   12:invokeinterface #44  <Method String CharSequence.toString()>
	//    9   17:aload_0         
	//   10   18:getfield        #33  <Field Locale a>
	//   11   21:invokevirtual   #50  <Method String String.toUpperCase(Locale)>
	//   12   24:areturn         
		else
			return null;
	//   13   25:aconst_null     
	//   14   26:areturn         
	}

	private Locale a;

	PagerTitleStrip$b(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void SingleLineTransformationMethod()>
		a = context.getResources().getConfiguration().locale;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #20  <Method Resources Context.getResources()>
	//    5    9:invokevirtual   #26  <Method Configuration Resources.getConfiguration()>
	//    6   12:getfield        #31  <Field Locale Configuration.locale>
	//    7   15:putfield        #33  <Field Locale a>
	//    8   18:return          
	}
}
