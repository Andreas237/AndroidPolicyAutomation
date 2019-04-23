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
	//    1    1:invokespecial   #34  <Method void Object()>
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
	//    6   10:invokevirtual   #47  <Method void AutoCompleteTextView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			return;
	//    7   13:return          
		} else
		{
			autocompletetextview.setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (new AdapterViewBindingAdapter.OnItemSelectedComponentListener(onitemselected, onnothingselected, ((android.databinding.InverseBindingListener) (null))))));
	//    8   14:aload_0         
	//    9   15:new             #49  <Class AdapterViewBindingAdapter$OnItemSelectedComponentListener>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aconst_null     
	//   14   22:invokespecial   #52  <Method void AdapterViewBindingAdapter$OnItemSelectedComponentListener(AdapterViewBindingAdapter$OnItemSelected, AdapterViewBindingAdapter$OnNothingSelected, android.databinding.InverseBindingListener)>
	//   15   25:invokevirtual   #47  <Method void AutoCompleteTextView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
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
	//    6   10:invokevirtual   #60  <Method void AutoCompleteTextView.setValidator(android.widget.AutoCompleteTextView$Validator)>
			return;
	//    7   13:return          
		} else
		{
			autocompletetextview.setValidator(new android.widget.AutoCompleteTextView.Validator(isvalid, fixtext) {

				public CharSequence fixText(CharSequence charsequence)
				{
					FixText fixtext1 = fixText;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field AutoCompleteTextViewBindingAdapter$FixText val$fixText>
				//    2    4:astore_2        
					if(fixtext1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          17
						return fixtext1.fixText(charsequence);
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
					IsValid isvalid1 = isValid;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field AutoCompleteTextViewBindingAdapter$IsValid val$isValid>
				//    2    4:astore_2        
					if(isvalid1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          17
						return isvalid1.isValid(charsequence);
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #37  <Method boolean AutoCompleteTextViewBindingAdapter$IsValid.isValid(CharSequence)>
				//    8   16:ireturn         
					else
						return true;
				//    9   17:iconst_1        
				//   10   18:ireturn         
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
	//   13   21:invokespecial   #63  <Method void AutoCompleteTextViewBindingAdapter$1(AutoCompleteTextViewBindingAdapter$IsValid, AutoCompleteTextViewBindingAdapter$FixText)>
	//   14   24:invokevirtual   #60  <Method void AutoCompleteTextView.setValidator(android.widget.AutoCompleteTextView$Validator)>
			return;
	//   15   27:return          
		}
	}
}
