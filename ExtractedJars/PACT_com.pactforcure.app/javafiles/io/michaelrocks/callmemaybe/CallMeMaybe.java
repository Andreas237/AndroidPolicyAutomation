// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.callmemaybe;

import android.content.Context;
import android.text.Editable;
import android.widget.TextView;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;

// Referenced classes of package io.michaelrocks.callmemaybe:
//			FormatParameters, PhoneStringBuilder

public class CallMeMaybe
{

	private CallMeMaybe()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static void attachTo(TextView textview)
	{
		attachTo(textview, FormatParameters.DEFAULT);
	//    0    0:aload_0         
	//    1    1:getstatic       #25  <Field FormatParameters FormatParameters.DEFAULT>
	//    2    4:invokestatic    #28  <Method void attachTo(TextView, FormatParameters)>
	//    3    7:return          
	}

	public static void attachTo(TextView textview, FormatParameters formatparameters)
	{
		ensurePhoneNumberUtil(textview.getContext());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method Context TextView.getContext()>
	//    2    4:invokestatic    #38  <Method void ensurePhoneNumberUtil(Context)>
		textview.setInputType(3);
	//    3    7:aload_0         
	//    4    8:iconst_3        
	//    5    9:invokevirtual   #42  <Method void TextView.setInputType(int)>
		textview.setEditableFactory(((android.text.Editable.Factory) (new android.text.Editable.Factory(formatparameters) {

			public Editable newEditable(CharSequence charsequence)
			{
				return ((Editable) (new PhoneStringBuilder(CallMeMaybe.phoneNumberUtil, charsequence, parameters)));
			//    0    0:new             #23  <Class PhoneStringBuilder>
			//    1    3:dup             
			//    2    4:invokestatic    #27  <Method PhoneNumberUtil CallMeMaybe.access$000()>
			//    3    7:aload_1         
			//    4    8:aload_0         
			//    5    9:getfield        #15  <Field FormatParameters val$parameters>
			//    6   12:invokespecial   #30  <Method void PhoneStringBuilder(PhoneNumberUtil, CharSequence, FormatParameters)>
			//    7   15:areturn         
			}

			final FormatParameters val$parameters;

			
			{
				parameters = formatparameters;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field FormatParameters val$parameters>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.text.Editable$Factory()>
			//    5    9:return          
			}
		}
)));
	//    6   12:aload_0         
	//    7   13:new             #6   <Class CallMeMaybe$1>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #45  <Method void CallMeMaybe$1(FormatParameters)>
	//   11   21:invokevirtual   #49  <Method void TextView.setEditableFactory(android.text.Editable$Factory)>
	//   12   24:return          
	}

	private static void ensurePhoneNumberUtil(Context context)
	{
		if(phoneNumberUtil == null)
	//*   0    0:getstatic       #17  <Field PhoneNumberUtil phoneNumberUtil>
	//*   1    3:ifnonnull       13
			phoneNumberUtil = PhoneNumberUtil.createInstance(context);
	//    2    6:aload_0         
	//    3    7:invokestatic    #55  <Method PhoneNumberUtil PhoneNumberUtil.createInstance(Context)>
	//    4   10:putstatic       #17  <Field PhoneNumberUtil phoneNumberUtil>
	//    5   13:return          
	}

	public static PhoneNumberUtil getPhoneNumberUtil()
	{
		return phoneNumberUtil;
	//    0    0:getstatic       #17  <Field PhoneNumberUtil phoneNumberUtil>
	//    1    3:areturn         
	}

	public static void setPhoneNumberUtil(PhoneNumberUtil phonenumberutil)
	{
		phoneNumberUtil = phonenumberutil;
	//    0    0:aload_0         
	//    1    1:putstatic       #17  <Field PhoneNumberUtil phoneNumberUtil>
	//    2    4:return          
	}

	private static PhoneNumberUtil phoneNumberUtil;


/*
	static PhoneNumberUtil access$000()
	{
		return phoneNumberUtil;
	//    0    0:getstatic       #17  <Field PhoneNumberUtil phoneNumberUtil>
	//    1    3:areturn         
	}

*/
}
