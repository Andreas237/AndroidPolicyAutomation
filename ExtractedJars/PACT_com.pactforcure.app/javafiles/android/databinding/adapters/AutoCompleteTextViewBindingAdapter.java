// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewBindingAdapter
{
	public static interface FixText
	{

		public abstract CharSequence fixText(CharSequence charsequence);
	}

	public static interface IsValid
	{

		public abstract boolean isValid(CharSequence charsequence);
	}


	public AutoCompleteTextViewBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static void setOnItemSelectedListener(AutoCompleteTextView autocompletetextview, AdapterViewBindingAdapter.OnItemSelected onitemselected, AdapterViewBindingAdapter.OnNothingSelected onnothingselected)
	{
		if(onitemselected == null && onnothingselected == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       14
		{
			autocompletetextview.setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (null)));
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #44  <Method void AutoCompleteTextView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			return;
	//    7   13:return          
		} else
		{
			autocompletetextview.setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (new AdapterViewBindingAdapter.OnItemSelectedComponentListener(onitemselected, onnothingselected, ((android.databinding.InverseBindingListener) (null))))));
	//    8   14:aload_0         
	//    9   15:new             #46  <Class AdapterViewBindingAdapter$OnItemSelectedComponentListener>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aconst_null     
	//   14   22:invokespecial   #49  <Method void AdapterViewBindingAdapter$OnItemSelectedComponentListener(AdapterViewBindingAdapter$OnItemSelected, AdapterViewBindingAdapter$OnNothingSelected, android.databinding.InverseBindingListener)>
	//   15   25:invokevirtual   #44  <Method void AutoCompleteTextView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			return;
	//   16   28:return          
		}
	}

	public static void setValidator(AutoCompleteTextView autocompletetextview, FixText fixtext, IsValid isvalid)
	{
		if(fixtext == null && isvalid == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       14
		{
			autocompletetextview.setValidator(((android.widget.AutoCompleteTextView.Validator) (null)));
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #57  <Method void AutoCompleteTextView.setValidator(android.widget.AutoCompleteTextView$Validator)>
			return;
	//    7   13:return          
		} else
		{
			autocompletetextview.setValidator(new android.widget.AutoCompleteTextView.Validator(isvalid, fixtext) {

				public CharSequence fixText(CharSequence charsequence)
				{
					CharSequence charsequence1 = charsequence;
				//    0    0:aload_1         
				//    1    1:astore_2        
					if(fixText != null)
				//*   2    2:aload_0         
				//*   3    3:getfield        #21  <Field AutoCompleteTextViewBindingAdapter$FixText val$fixText>
				//*   4    6:ifnull          20
						charsequence1 = fixText.fixText(charsequence);
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
					if(isValid != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field AutoCompleteTextViewBindingAdapter$IsValid val$isValid>
				//*   2    4:ifnull          18
						return isValid.isValid(charsequence);
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

				final FixText val$fixText;
				final IsValid val$isValid;

			
			{
				isValid = isvalid;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AutoCompleteTextViewBindingAdapter$IsValid val$isValid>
				fixText = fixtext;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AutoCompleteTextViewBindingAdapter$FixText val$fixText>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   14:aload_0         
	//    9   15:new             #6   <Class AutoCompleteTextViewBindingAdapter$1>
	//   10   18:dup             
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:invokespecial   #60  <Method void AutoCompleteTextViewBindingAdapter$1(AutoCompleteTextViewBindingAdapter$IsValid, AutoCompleteTextViewBindingAdapter$FixText)>
	//   14   24:invokevirtual   #57  <Method void AutoCompleteTextView.setValidator(android.widget.AutoCompleteTextView$Validator)>
			return;
	//   15   27:return          
		}
	}
}
