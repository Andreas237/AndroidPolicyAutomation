// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.res.TypedArrayUtils;
import android.text.TextUtils;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.preference:
//			DialogPreference

public class ListPreference extends DialogPreference
{
	private static class SavedState extends Preference.BaseSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Preference$BaseSavedState.writeToParcel(Parcel, int)>
			parcel.writeString(value);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field String value>
		//    7   11:invokevirtual   #45  <Method void Parcel.writeString(String)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class ListPreference$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void ListPreference$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method ListPreference$SavedState createFromParcel(Parcel)>
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
			//    2    2:invokevirtual   #30  <Method ListPreference$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		String value;

		static 
		{
		//    0    0:new             #9   <Class ListPreference$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void ListPreference$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel)
		{
			super(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void Preference$BaseSavedState(Parcel)>
			value = parcel.readString();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #31  <Method String Parcel.readString()>
		//    6   10:putfield        #33  <Field String value>
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


	public ListPreference(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void ListPreference(Context, AttributeSet)>
	//    4    6:return          
	}

	public ListPreference(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, TypedArrayUtils.getAttr(context, R.attr.dialogPreferenceStyle, 0x1010091));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getstatic       #29  <Field int R$attr.dialogPreferenceStyle>
	//    5    7:ldc1            #30  <Int 0x1010091>
	//    6    9:invokestatic    #36  <Method int TypedArrayUtils.getAttr(Context, int, int)>
	//    7   12:invokespecial   #39  <Method void ListPreference(Context, AttributeSet, int)>
	//    8   15:return          
	}

	public ListPreference(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #42  <Method void ListPreference(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public ListPreference(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #43  <Method void DialogPreference(Context, AttributeSet, int, int)>
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, R.styleable.ListPreference, i, j);
	//    6    9:aload_1         
	//    7   10:aload_2         
	//    8   11:getstatic       #49  <Field int[] R$styleable.ListPreference>
	//    9   14:iload_3         
	//   10   15:iload           4
	//   11   17:invokevirtual   #55  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   12   20:astore          5
		mEntries = TypedArrayUtils.getTextArray(typedarray, R.styleable.ListPreference_entries, R.styleable.ListPreference_android_entries);
	//   13   22:aload_0         
	//   14   23:aload           5
	//   15   25:getstatic       #58  <Field int R$styleable.ListPreference_entries>
	//   16   28:getstatic       #61  <Field int R$styleable.ListPreference_android_entries>
	//   17   31:invokestatic    #65  <Method CharSequence[] TypedArrayUtils.getTextArray(TypedArray, int, int)>
	//   18   34:putfield        #67  <Field CharSequence[] mEntries>
		mEntryValues = TypedArrayUtils.getTextArray(typedarray, R.styleable.ListPreference_entryValues, R.styleable.ListPreference_android_entryValues);
	//   19   37:aload_0         
	//   20   38:aload           5
	//   21   40:getstatic       #70  <Field int R$styleable.ListPreference_entryValues>
	//   22   43:getstatic       #73  <Field int R$styleable.ListPreference_android_entryValues>
	//   23   46:invokestatic    #65  <Method CharSequence[] TypedArrayUtils.getTextArray(TypedArray, int, int)>
	//   24   49:putfield        #75  <Field CharSequence[] mEntryValues>
		typedarray.recycle();
	//   25   52:aload           5
	//   26   54:invokevirtual   #81  <Method void TypedArray.recycle()>
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.Preference, i, j)));
	//   27   57:aload_1         
	//   28   58:aload_2         
	//   29   59:getstatic       #84  <Field int[] R$styleable.Preference>
	//   30   62:iload_3         
	//   31   63:iload           4
	//   32   65:invokevirtual   #55  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   33   68:astore_1        
		mSummary = TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.Preference_summary, R.styleable.Preference_android_summary);
	//   34   69:aload_0         
	//   35   70:aload_1         
	//   36   71:getstatic       #87  <Field int R$styleable.Preference_summary>
	//   37   74:getstatic       #90  <Field int R$styleable.Preference_android_summary>
	//   38   77:invokestatic    #94  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   39   80:putfield        #96  <Field String mSummary>
		((TypedArray) (context)).recycle();
	//   40   83:aload_1         
	//   41   84:invokevirtual   #81  <Method void TypedArray.recycle()>
	//   42   87:return          
	}

	private int getValueIndex()
	{
		return findIndexOfValue(mValue);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #100 <Field String mValue>
	//    3    5:invokevirtual   #104 <Method int findIndexOfValue(String)>
	//    4    8:ireturn         
	}

	public int findIndexOfValue(String s)
	{
		if(s != null && mEntryValues != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          45
	//*   2    4:aload_0         
	//*   3    5:getfield        #75  <Field CharSequence[] mEntryValues>
	//*   4    8:ifnull          45
		{
			for(int i = mEntryValues.length - 1; i >= 0; i--)
	//*   5   11:aload_0         
	//*   6   12:getfield        #75  <Field CharSequence[] mEntryValues>
	//*   7   15:arraylength     
	//*   8   16:iconst_1        
	//*   9   17:isub            
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:iflt            45
				if(((Object) (mEntryValues[i])).equals(((Object) (s))))
	//*  13   23:aload_0         
	//*  14   24:getfield        #75  <Field CharSequence[] mEntryValues>
	//*  15   27:iload_2         
	//*  16   28:aaload          
	//*  17   29:aload_1         
	//*  18   30:invokevirtual   #110 <Method boolean Object.equals(Object)>
	//*  19   33:ifeq            38
					return i;
	//   20   36:iload_2         
	//   21   37:ireturn         

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:isub            
	//   25   41:istore_2        
		}
	//*  26   42:goto            19
		return -1;
	//   27   45:iconst_m1       
	//   28   46:ireturn         
	}

	public CharSequence[] getEntries()
	{
		return mEntries;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field CharSequence[] mEntries>
	//    2    4:areturn         
	}

	public CharSequence getEntry()
	{
		int i = getValueIndex();
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method int getValueIndex()>
	//    2    4:istore_1        
		if(i >= 0 && mEntries != null)
	//*   3    5:iload_1         
	//*   4    6:iflt            23
	//*   5    9:aload_0         
	//*   6   10:getfield        #67  <Field CharSequence[] mEntries>
	//*   7   13:ifnull          23
			return mEntries[i];
	//    8   16:aload_0         
	//    9   17:getfield        #67  <Field CharSequence[] mEntries>
	//   10   20:iload_1         
	//   11   21:aaload          
	//   12   22:areturn         
		else
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
	}

	public CharSequence[] getEntryValues()
	{
		return mEntryValues;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field CharSequence[] mEntryValues>
	//    2    4:areturn         
	}

	public CharSequence getSummary()
	{
		CharSequence charsequence = getEntry();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method CharSequence getEntry()>
	//    2    4:astore_2        
		if(mSummary == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #96  <Field String mSummary>
	//*   5    9:ifnonnull       17
			return super.getSummary();
	//    6   12:aload_0         
	//    7   13:invokespecial   #122 <Method CharSequence DialogPreference.getSummary()>
	//    8   16:areturn         
		String s = mSummary;
	//    9   17:aload_0         
	//   10   18:getfield        #96  <Field String mSummary>
	//   11   21:astore_3        
		Object obj = ((Object) (charsequence));
	//   12   22:aload_2         
	//   13   23:astore_1        
		if(charsequence == null)
	//*  14   24:aload_2         
	//*  15   25:ifnonnull       31
			obj = "";
	//   16   28:ldc1            #124 <String "">
	//   17   30:astore_1        
		return ((CharSequence) (String.format(s, new Object[] {
			obj
		})));
	//   18   31:aload_3         
	//   19   32:iconst_1        
	//   20   33:anewarray       Object[]
	//   21   36:dup             
	//   22   37:iconst_0        
	//   23   38:aload_1         
	//   24   39:aastore         
	//   25   40:invokestatic    #130 <Method String String.format(String, Object[])>
	//   26   43:areturn         
	}

	public String getValue()
	{
		return mValue;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field String mValue>
	//    2    4:areturn         
	}

	protected Object onGetDefaultValue(TypedArray typedarray, int i)
	{
		return ((Object) (typedarray.getString(i)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #137 <Method String TypedArray.getString(int)>
	//    3    5:areturn         
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable == null || !((Object) (((Object) (parcelable)).getClass())).equals(android/support/v7/preference/ListPreference$SavedState))
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #143 <Method Class Object.getClass()>
	//*   4    8:ldc1            #6   <Class ListPreference$SavedState>
	//*   5   10:invokevirtual   #110 <Method boolean Object.equals(Object)>
	//*   6   13:ifne            22
		{
			super.onRestoreInstanceState(parcelable);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokespecial   #145 <Method void DialogPreference.onRestoreInstanceState(Parcelable)>
			return;
	//   10   21:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class ListPreference$SavedState>
	//   13   26:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #149 <Method Parcelable ListPreference$SavedState.getSuperState()>
	//   17   32:invokespecial   #145 <Method void DialogPreference.onRestoreInstanceState(Parcelable)>
			setValue(((SavedState) (parcelable)).value);
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:getfield        #152 <Field String ListPreference$SavedState.value>
	//   21   40:invokevirtual   #156 <Method void setValue(String)>
			return;
	//   22   43:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		Object obj = ((Object) (super.onSaveInstanceState()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method Parcelable DialogPreference.onSaveInstanceState()>
	//    2    4:astore_1        
		if(isPersistent())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #163 <Method boolean isPersistent()>
	//*   5    9:ifeq            14
		{
			return ((Parcelable) (obj));
	//    6   12:aload_1         
	//    7   13:areturn         
		} else
		{
			obj = ((Object) (new SavedState(((Parcelable) (obj)))));
	//    8   14:new             #6   <Class ListPreference$SavedState>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #165 <Method void ListPreference$SavedState(Parcelable)>
	//   12   22:astore_1        
			obj.value = getValue();
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #167 <Method String getValue()>
	//   16   28:putfield        #152 <Field String ListPreference$SavedState.value>
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
			obj = ((Object) (getPersistedString(mValue)));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #100 <Field String mValue>
	//    5    9:invokevirtual   #173 <Method String getPersistedString(String)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #156 <Method void setValue(String)>
	//*  10   18:return          
			obj = ((Object) ((String)obj));
	//   11   19:aload_2         
	//   12   20:checkcast       #126 <Class String>
	//   13   23:astore_2        
		setValue(((String) (obj)));
	//*  14   24:goto            13
	}

	public void setEntries(int i)
	{
		setEntries(getContext().getResources().getTextArray(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #180 <Method Context getContext()>
	//    3    5:invokevirtual   #184 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #189 <Method CharSequence[] Resources.getTextArray(int)>
	//    6   12:invokevirtual   #192 <Method void setEntries(CharSequence[])>
	//    7   15:return          
	}

	public void setEntries(CharSequence acharsequence[])
	{
		mEntries = acharsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field CharSequence[] mEntries>
	//    3    5:return          
	}

	public void setEntryValues(int i)
	{
		setEntryValues(getContext().getResources().getTextArray(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #180 <Method Context getContext()>
	//    3    5:invokevirtual   #184 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #189 <Method CharSequence[] Resources.getTextArray(int)>
	//    6   12:invokevirtual   #196 <Method void setEntryValues(CharSequence[])>
	//    7   15:return          
	}

	public void setEntryValues(CharSequence acharsequence[])
	{
		mEntryValues = acharsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field CharSequence[] mEntryValues>
	//    3    5:return          
	}

	public void setSummary(CharSequence charsequence)
	{
		super.setSummary(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #200 <Method void DialogPreference.setSummary(CharSequence)>
		if(charsequence == null && mSummary != null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       22
	//*   5    9:aload_0         
	//*   6   10:getfield        #96  <Field String mSummary>
	//*   7   13:ifnull          22
			mSummary = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #96  <Field String mSummary>
		else
	//*  11   21:return          
		if(charsequence != null && !((Object) (charsequence)).equals(((Object) (mSummary))))
	//*  12   22:aload_1         
	//*  13   23:ifnull          21
	//*  14   26:aload_1         
	//*  15   27:aload_0         
	//*  16   28:getfield        #96  <Field String mSummary>
	//*  17   31:invokevirtual   #110 <Method boolean Object.equals(Object)>
	//*  18   34:ifne            21
		{
			mSummary = charsequence.toString();
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokeinterface #205 <Method String CharSequence.toString()>
	//   22   44:putfield        #96  <Field String mSummary>
			return;
	//   23   47:return          
		}
	}

	public void setValue(String s)
	{
		boolean flag;
		if(!TextUtils.equals(((CharSequence) (mValue)), ((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field String mValue>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #210 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*   4    8:ifne            49
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_2        
		else
	//*   7   13:iload_2         
	//*   8   14:ifne            24
	//*   9   17:aload_0         
	//*  10   18:getfield        #212 <Field boolean mValueSet>
	//*  11   21:ifne            48
	//*  12   24:aload_0         
	//*  13   25:aload_1         
	//*  14   26:putfield        #100 <Field String mValue>
	//*  15   29:aload_0         
	//*  16   30:iconst_1        
	//*  17   31:putfield        #212 <Field boolean mValueSet>
	//*  18   34:aload_0         
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #216 <Method boolean persistString(String)>
	//*  21   39:pop             
	//*  22   40:iload_2         
	//*  23   41:ifeq            48
	//*  24   44:aload_0         
	//*  25   45:invokevirtual   #219 <Method void notifyChanged()>
	//*  26   48:return          
			flag = false;
	//   27   49:iconst_0        
	//   28   50:istore_2        
		if(flag || !mValueSet)
		{
			mValue = s;
			mValueSet = true;
			persistString(s);
			if(flag)
				notifyChanged();
		}
	//*  29   51:goto            13
	}

	public void setValueIndex(int i)
	{
		if(mEntryValues != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field CharSequence[] mEntryValues>
	//*   2    4:ifnull          22
			setValue(mEntryValues[i].toString());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #75  <Field CharSequence[] mEntryValues>
	//    6   12:iload_1         
	//    7   13:aaload          
	//    8   14:invokeinterface #205 <Method String CharSequence.toString()>
	//    9   19:invokevirtual   #156 <Method void setValue(String)>
	//   10   22:return          
	}

	private CharSequence mEntries[];
	private CharSequence mEntryValues[];
	private String mSummary;
	private String mValue;
	private boolean mValueSet;
}
