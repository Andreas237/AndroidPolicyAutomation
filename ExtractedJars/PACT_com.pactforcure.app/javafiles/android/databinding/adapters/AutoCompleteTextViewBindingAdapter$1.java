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
		CharSequence charsequence1 = charsequence;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(val$fixText != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #21  <Field AutoCompleteTextViewBindingAdapter$FixText val$fixText>
	//*   4    6:ifnull          20
			charsequence1 = val$fixText.fixText(charsequence);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field AutoCompleteTextViewBindingAdapter$FixText val$fixText>
	//    7   13:aload_1         
	//    8   14:invokeinterface #31  <Method CharSequence AutoCompleteTextViewBindingAdapter$FixText.fixText(CharSequence)>
	//    9   19:astore_2        
		return charsequence1;
	//   10   20:aload_2         
	//   11   21:areturn         
	}

	public boolean isValid(CharSequence charsequence)
	{
		if(val$isValid != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field AutoCompleteTextViewBindingAdapter$IsValid val$isValid>
	//*   2    4:ifnull          18
			return val$isValid.isValid(charsequence);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field AutoCompleteTextViewBindingAdapter$IsValid val$isValid>
	//    5   11:aload_1         
	//    6   12:invokeinterface #37  <Method boolean AutoCompleteTextViewBindingAdapter$IsValid.isValid(CharSequence)>
	//    7   17:ireturn         
		else
			return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
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
