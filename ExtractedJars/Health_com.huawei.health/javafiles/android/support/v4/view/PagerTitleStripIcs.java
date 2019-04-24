// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

class PagerTitleStripIcs
{
	static class SingleLineAllCapsTransform extends SingleLineTransformationMethod
	{

		public CharSequence getTransformation(CharSequence charsequence, View view)
		{
			charsequence = super.getTransformation(charsequence, view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #41  <Method CharSequence SingleLineTransformationMethod.getTransformation(CharSequence, View)>
		//    4    6:astore_1        
			if(charsequence != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          25
				return ((CharSequence) (charsequence.toString().toUpperCase(mLocale)));
		//    7   11:aload_1         
		//    8   12:invokeinterface #47  <Method String CharSequence.toString()>
		//    9   17:aload_0         
		//   10   18:getfield        #36  <Field Locale mLocale>
		//   11   21:invokevirtual   #53  <Method String String.toUpperCase(Locale)>
		//   12   24:areturn         
			else
				return null;
		//   13   25:aconst_null     
		//   14   26:areturn         
		}

		private static final String TAG = "SingleLineAllCapsTransform";
		private Locale mLocale;

		public SingleLineAllCapsTransform(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void SingleLineTransformationMethod()>
			mLocale = context.getResources().getConfiguration().locale;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #23  <Method Resources Context.getResources()>
		//    5    9:invokevirtual   #29  <Method Configuration Resources.getConfiguration()>
		//    6   12:getfield        #34  <Field Locale Configuration.locale>
		//    7   15:putfield        #36  <Field Locale mLocale>
		//    8   18:return          
		}
	}


	PagerTitleStripIcs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static void setSingleLineAllCaps(TextView textview)
	{
		textview.setTransformationMethod(((android.text.method.TransformationMethod) (new SingleLineAllCapsTransform(textview.getContext()))));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class PagerTitleStripIcs$SingleLineAllCapsTransform>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #23  <Method Context TextView.getContext()>
	//    5    9:invokespecial   #26  <Method void PagerTitleStripIcs$SingleLineAllCapsTransform(Context)>
	//    6   12:invokevirtual   #30  <Method void TextView.setTransformationMethod(android.text.method.TransformationMethod)>
	//    7   15:return          
	}
}
