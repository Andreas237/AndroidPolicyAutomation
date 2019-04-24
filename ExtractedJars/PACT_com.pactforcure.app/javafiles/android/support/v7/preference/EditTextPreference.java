// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.res.TypedArrayUtils;
import android.text.TextUtils;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.preference:
//			DialogPreference

public class EditTextPreference extends DialogPreference
{
	private static class SavedState extends Preference.BaseSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #40  <Method void Preference$BaseSavedState.writeToParcel(Parcel, int)>
			parcel.writeString(text);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field String text>
		//    7   11:invokevirtual   #44  <Method void Parcel.writeString(String)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class EditTextPreference$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void EditTextPreference$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method EditTextPreference$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method EditTextPreference$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		String text;

		static 
		{
		//    0    0:new             #9   <Class EditTextPreference$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void EditTextPreference$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel)
		{
			super(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void Preference$BaseSavedState(Parcel)>
			text = parcel.readString();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #31  <Method String Parcel.readString()>
		//    6   10:putfield        #33  <Field String text>
		//    7   13:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void Preference$BaseSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	public EditTextPreference(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #16  <Method void EditTextPreference(Context, AttributeSet)>
	//    4    6:return          
	}

	public EditTextPreference(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, TypedArrayUtils.getAttr(context, R.attr.editTextPreferenceStyle, 0x1010092));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getstatic       #23  <Field int R$attr.editTextPreferenceStyle>
	//    5    7:ldc1            #24  <Int 0x1010092>
	//    6    9:invokestatic    #30  <Method int TypedArrayUtils.getAttr(Context, int, int)>
	//    7   12:invokespecial   #33  <Method void EditTextPreference(Context, AttributeSet, int)>
	//    8   15:return          
	}

	public EditTextPreference(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #36  <Method void EditTextPreference(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public EditTextPreference(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #37  <Method void DialogPreference(Context, AttributeSet, int, int)>
	//    6    9:return          
	}

	public String getText()
	{
		return mText;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String mText>
	//    2    4:areturn         
	}

	protected Object onGetDefaultValue(TypedArray typedarray, int i)
	{
		return ((Object) (typedarray.getString(i)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #49  <Method String TypedArray.getString(int)>
	//    3    5:areturn         
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable == null || !((Object) (((Object) (parcelable)).getClass())).equals(android/support/v7/preference/EditTextPreference$SavedState))
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #57  <Method Class Object.getClass()>
	//*   4    8:ldc1            #6   <Class EditTextPreference$SavedState>
	//*   5   10:invokevirtual   #61  <Method boolean Object.equals(Object)>
	//*   6   13:ifne            22
		{
			super.onRestoreInstanceState(parcelable);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokespecial   #63  <Method void DialogPreference.onRestoreInstanceState(Parcelable)>
			return;
	//   10   21:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class EditTextPreference$SavedState>
	//   13   26:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #67  <Method Parcelable EditTextPreference$SavedState.getSuperState()>
	//   17   32:invokespecial   #63  <Method void DialogPreference.onRestoreInstanceState(Parcelable)>
			setText(((SavedState) (parcelable)).text);
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:getfield        #70  <Field String EditTextPreference$SavedState.text>
	//   21   40:invokevirtual   #74  <Method void setText(String)>
			return;
	//   22   43:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		Object obj = ((Object) (super.onSaveInstanceState()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method Parcelable DialogPreference.onSaveInstanceState()>
	//    2    4:astore_1        
		if(isPersistent())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #81  <Method boolean isPersistent()>
	//*   5    9:ifeq            14
		{
			return ((Parcelable) (obj));
	//    6   12:aload_1         
	//    7   13:areturn         
		} else
		{
			obj = ((Object) (new SavedState(((Parcelable) (obj)))));
	//    8   14:new             #6   <Class EditTextPreference$SavedState>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #83  <Method void EditTextPreference$SavedState(Parcelable)>
	//   12   22:astore_1        
			obj.text = getText();
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #85  <Method String getText()>
	//   16   28:putfield        #70  <Field String EditTextPreference$SavedState.text>
			return ((Parcelable) (obj));
	//   17   31:aload_1         
	//   18   32:areturn         
		}
	}

	protected void onSetInitialValue(boolean flag, Object obj)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
			obj = ((Object) (getPersistedString(mText)));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field String mText>
	//    5    9:invokevirtual   #91  <Method String getPersistedString(String)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #74  <Method void setText(String)>
	//*  10   18:return          
			obj = ((Object) ((String)obj));
	//   11   19:aload_2         
	//   12   20:checkcast       #93  <Class String>
	//   13   23:astore_2        
		setText(((String) (obj)));
	//*  14   24:goto            13
	}

	public void setText(String s)
	{
		boolean flag = shouldDisableDependents();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method boolean shouldDisableDependents()>
	//    2    4:istore_2        
		mText = s;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #41  <Field String mText>
		persistString(s);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #100 <Method boolean persistString(String)>
	//    9   15:pop             
		boolean flag1 = shouldDisableDependents();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #96  <Method boolean shouldDisableDependents()>
	//   12   20:istore_3        
		if(flag1 != flag)
	//*  13   21:iload_3         
	//*  14   22:iload_2         
	//*  15   23:icmpeq          31
			notifyDependencyChange(flag1);
	//   16   26:aload_0         
	//   17   27:iload_3         
	//   18   28:invokevirtual   #104 <Method void notifyDependencyChange(boolean)>
	//   19   31:return          
	}

	public boolean shouldDisableDependents()
	{
		return TextUtils.isEmpty(((CharSequence) (mText))) || super.shouldDisableDependents();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String mText>
	//    2    4:invokestatic    #110 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:ifne            17
	//    4   10:aload_0         
	//    5   11:invokespecial   #111 <Method boolean DialogPreference.shouldDisableDependents()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private String mText;
}
