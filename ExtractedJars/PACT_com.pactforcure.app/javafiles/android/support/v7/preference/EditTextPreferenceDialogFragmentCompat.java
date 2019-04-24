// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package android.support.v7.preference:
//			PreferenceDialogFragmentCompat, EditTextPreference

public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat
{

	public EditTextPreferenceDialogFragmentCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void PreferenceDialogFragmentCompat()>
	//    2    4:return          
	}

	private EditTextPreference getEditTextPreference()
	{
		return (EditTextPreference)getPreference();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method DialogPreference getPreference()>
	//    2    4:checkcast       #25  <Class EditTextPreference>
	//    3    7:areturn         
	}

	public static EditTextPreferenceDialogFragmentCompat newInstance(String s)
	{
		EditTextPreferenceDialogFragmentCompat edittextpreferencedialogfragmentcompat = new EditTextPreferenceDialogFragmentCompat();
	//    0    0:new             #2   <Class EditTextPreferenceDialogFragmentCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void EditTextPreferenceDialogFragmentCompat()>
	//    3    7:astore_1        
		Bundle bundle = new Bundle(1);
	//    4    8:new             #30  <Class Bundle>
	//    5   11:dup             
	//    6   12:iconst_1        
	//    7   13:invokespecial   #33  <Method void Bundle(int)>
	//    8   16:astore_2        
		bundle.putString("key", s);
	//    9   17:aload_2         
	//   10   18:ldc1            #35  <String "key">
	//   11   20:aload_0         
	//   12   21:invokevirtual   #39  <Method void Bundle.putString(String, String)>
		edittextpreferencedialogfragmentcompat.setArguments(bundle);
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #43  <Method void setArguments(Bundle)>
		return edittextpreferencedialogfragmentcompat;
	//   16   29:aload_1         
	//   17   30:areturn         
	}

	protected boolean needInputMethod()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void onBindDialogView(View view)
	{
		super.onBindDialogView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void PreferenceDialogFragmentCompat.onBindDialogView(View)>
		mEditText = (EditText)view.findViewById(0x1020003);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #55  <Int 0x1020003>
	//    6    9:invokevirtual   #61  <Method View View.findViewById(int)>
	//    7   12:checkcast       #63  <Class EditText>
	//    8   15:putfield        #65  <Field EditText mEditText>
		if(mEditText == null)
	//*   9   18:aload_0         
	//*  10   19:getfield        #65  <Field EditText mEditText>
	//*  11   22:ifnonnull       35
		{
			throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
	//   12   25:new             #67  <Class IllegalStateException>
	//   13   28:dup             
	//   14   29:ldc1            #69  <String "Dialog view must contain an EditText with id @android:id/edit">
	//   15   31:invokespecial   #72  <Method void IllegalStateException(String)>
	//   16   34:athrow          
		} else
		{
			mEditText.setText(mText);
	//   17   35:aload_0         
	//   18   36:getfield        #65  <Field EditText mEditText>
	//   19   39:aload_0         
	//   20   40:getfield        #74  <Field CharSequence mText>
	//   21   43:invokevirtual   #78  <Method void EditText.setText(CharSequence)>
			return;
	//   22   46:return          
		}
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #81  <Method void PreferenceDialogFragmentCompat.onCreate(Bundle)>
		if(bundle == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       21
		{
			mText = ((CharSequence) (getEditTextPreference().getText()));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokespecial   #83  <Method EditTextPreference getEditTextPreference()>
	//    8   14:invokevirtual   #87  <Method String EditTextPreference.getText()>
	//    9   17:putfield        #74  <Field CharSequence mText>
			return;
	//   10   20:return          
		} else
		{
			mText = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:ldc1            #8   <String "EditTextPreferenceDialogFragment.text">
	//   14   25:invokevirtual   #91  <Method CharSequence Bundle.getCharSequence(String)>
	//   15   28:putfield        #74  <Field CharSequence mText>
			return;
	//   16   31:return          
		}
	}

	public void onDialogClosed(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            34
		{
			String s = ((Object) (mEditText.getText())).toString();
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field EditText mEditText>
	//    4    8:invokevirtual   #96  <Method android.text.Editable EditText.getText()>
	//    5   11:invokevirtual   #101 <Method String Object.toString()>
	//    6   14:astore_2        
			if(getEditTextPreference().callChangeListener(((Object) (s))))
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #83  <Method EditTextPreference getEditTextPreference()>
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #105 <Method boolean EditTextPreference.callChangeListener(Object)>
	//*  11   23:ifeq            34
				getEditTextPreference().setText(s);
	//   12   26:aload_0         
	//   13   27:invokespecial   #83  <Method EditTextPreference getEditTextPreference()>
	//   14   30:aload_2         
	//   15   31:invokevirtual   #107 <Method void EditTextPreference.setText(String)>
		}
	//   16   34:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #111 <Method void PreferenceDialogFragmentCompat.onSaveInstanceState(Bundle)>
		bundle.putCharSequence("EditTextPreferenceDialogFragment.text", mText);
	//    3    5:aload_1         
	//    4    6:ldc1            #8   <String "EditTextPreferenceDialogFragment.text">
	//    5    8:aload_0         
	//    6    9:getfield        #74  <Field CharSequence mText>
	//    7   12:invokevirtual   #115 <Method void Bundle.putCharSequence(String, CharSequence)>
	//    8   15:return          
	}

	private static final String SAVE_STATE_TEXT = "EditTextPreferenceDialogFragment.text";
	private EditText mEditText;
	private CharSequence mText;
}
