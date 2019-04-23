// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;


// Referenced classes of package android.databinding.adapters:
//			AutoCompleteTextViewBindingAdapter

static final class AutoCompleteTextViewBindingAdapter$1
	implements android.widget.AutoCompleteTextView.Validator
{

	public CharSequence fixText(CharSequence charsequence)
	{
		xText xtext = val$fixText;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AutoCompleteTextViewBindingAdapter$FixText val$fixText>
	//    2    4:astore_2        
		if(xtext != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			return xtext.fixText(charsequence);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method CharSequence AutoCompleteTextViewBindingAdapter$FixText.fixText(CharSequence)>
	//    8   16:areturn         
		else
			return charsequence;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public boolean isValid(CharSequence charsequence)
	{
		Valid valid = val$isValid;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AutoCompleteTextViewBindingAdapter$IsValid val$isValid>
	//    2    4:astore_2        
		if(valid != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			return valid.isValid(charsequence);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #37  <Method boolean AutoCompleteTextViewBindingAdapter$IsValid.isValid(CharSequence)>
	//    8   16:ireturn         
		else
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	final xText val$fixText;
	final Valid val$isValid;

	AutoCompleteTextViewBindingAdapter$1(Valid valid, xText xtext)
	{
		val$isValid = valid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AutoCompleteTextViewBindingAdapter$IsValid val$isValid>
		val$fixText = xtext;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AutoCompleteTextViewBindingAdapter$FixText val$fixText>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
