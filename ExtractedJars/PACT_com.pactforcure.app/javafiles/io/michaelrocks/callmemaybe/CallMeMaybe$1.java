// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.callmemaybe;

import android.text.Editable;

// Referenced classes of package io.michaelrocks.callmemaybe:
//			CallMeMaybe, PhoneStringBuilder, FormatParameters

static final class CallMeMaybe$1 extends android.text.ry
{

	public Editable newEditable(CharSequence charsequence)
	{
		return ((Editable) (new PhoneStringBuilder(CallMeMaybe.access$000(), charsequence, val$parameters)));
	//    0    0:new             #23  <Class PhoneStringBuilder>
	//    1    3:dup             
	//    2    4:invokestatic    #27  <Method io.michaelrocks.libphonenumber.android.PhoneNumberUtil CallMeMaybe.access$000()>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field FormatParameters val$parameters>
	//    6   12:invokespecial   #30  <Method void PhoneStringBuilder(io.michaelrocks.libphonenumber.android.PhoneNumberUtil, CharSequence, FormatParameters)>
	//    7   15:areturn         
	}

	final FormatParameters val$parameters;

	CallMeMaybe$1(FormatParameters formatparameters)
	{
		val$parameters = formatparameters;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field FormatParameters val$parameters>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void android.text.Editable$Factory()>
	//    5    9:return          
	}
}
