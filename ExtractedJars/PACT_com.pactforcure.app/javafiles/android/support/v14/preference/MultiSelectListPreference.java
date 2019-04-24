// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v14.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.preference.PreferenceManager;
import android.support.v7.preference.internal.AbstractMultiSelectListPreference;
import android.util.AttributeSet;
import java.util.*;

public class MultiSelectListPreference extends AbstractMultiSelectListPreference
{
	private static class SavedState extends android.support.v7.preference.Preference.BaseSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #57  <Method void android.support.v7.preference.Preference$BaseSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(values.size());
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #37  <Field Set values>
		//    7   11:invokeinterface #62  <Method int Set.size()>
		//    8   16:invokevirtual   #66  <Method void Parcel.writeInt(int)>
			parcel.writeStringArray((String[])values.toArray(((Object []) (new String[values.size()]))));
		//    9   19:aload_1         
		//   10   20:aload_0         
		//   11   21:getfield        #37  <Field Set values>
		//   12   24:aload_0         
		//   13   25:getfield        #37  <Field Set values>
		//   14   28:invokeinterface #62  <Method int Set.size()>
		//   15   33:anewarray       String[]
		//   16   36:invokeinterface #70  <Method Object[] Set.toArray(Object[])>
		//   17   41:checkcast       #72  <Class String[]>
		//   18   44:invokevirtual   #75  <Method void Parcel.writeStringArray(String[])>
		//   19   47:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class MultiSelectListPreference$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void MultiSelectListPreference$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method MultiSelectListPreference$SavedState createFromParcel(Parcel)>
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
			//    2    2:invokevirtual   #30  <Method MultiSelectListPreference$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		Set values;

		static 
		{
		//    0    0:new             #9   <Class MultiSelectListPreference$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void MultiSelectListPreference$SavedState$1()>
		//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel)
		{
			super(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void android.support.v7.preference.Preference$BaseSavedState(Parcel)>
			int i = parcel.readInt();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #32  <Method int Parcel.readInt()>
		//    5    9:istore_2        
			values = ((Set) (new HashSet()));
		//    6   10:aload_0         
		//    7   11:new             #34  <Class HashSet>
		//    8   14:dup             
		//    9   15:invokespecial   #35  <Method void HashSet()>
		//   10   18:putfield        #37  <Field Set values>
			String as[] = new String[i];
		//   11   21:iload_2         
		//   12   22:anewarray       String[]
		//   13   25:astore_3        
			parcel.readStringArray(as);
		//   14   26:aload_1         
		//   15   27:aload_3         
		//   16   28:invokevirtual   #43  <Method void Parcel.readStringArray(String[])>
			Collections.addAll(((java.util.Collection) (values)), ((Object []) (as)));
		//   17   31:aload_0         
		//   18   32:getfield        #37  <Field Set values>
		//   19   35:aload_3         
		//   20   36:invokestatic    #49  <Method boolean Collections.addAll(java.util.Collection, Object[])>
		//   21   39:pop             
		//   22   40:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #52  <Method void android.support.v7.preference.Preference$BaseSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	public MultiSelectListPreference(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #20  <Method void MultiSelectListPreference(Context, AttributeSet)>
	//    4    6:return          
	}

	public MultiSelectListPreference(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, TypedArrayUtils.getAttr(context, android.support.v7.preference.R.attr.dialogPreferenceStyle, 0x1010091));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getstatic       #27  <Field int android.support.v7.preference.R$attr.dialogPreferenceStyle>
	//    5    7:ldc1            #28  <Int 0x1010091>
	//    6    9:invokestatic    #34  <Method int TypedArrayUtils.getAttr(Context, int, int)>
	//    7   12:invokespecial   #37  <Method void MultiSelectListPreference(Context, AttributeSet, int)>
	//    8   15:return          
	}

	public MultiSelectListPreference(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #40  <Method void MultiSelectListPreference(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public MultiSelectListPreference(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #41  <Method void AbstractMultiSelectListPreference(Context, AttributeSet, int, int)>
		mValues = ((Set) (new HashSet()));
	//    6    9:aload_0         
	//    7   10:new             #43  <Class HashSet>
	//    8   13:dup             
	//    9   14:invokespecial   #46  <Method void HashSet()>
	//   10   17:putfield        #48  <Field Set mValues>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.preference.R.styleable.MultiSelectListPreference, i, j)));
	//   11   20:aload_1         
	//   12   21:aload_2         
	//   13   22:getstatic       #54  <Field int[] android.support.v7.preference.R$styleable.MultiSelectListPreference>
	//   14   25:iload_3         
	//   15   26:iload           4
	//   16   28:invokevirtual   #60  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   17   31:astore_1        
		mEntries = TypedArrayUtils.getTextArray(((TypedArray) (context)), android.support.v7.preference.R.styleable.MultiSelectListPreference_entries, android.support.v7.preference.R.styleable.MultiSelectListPreference_android_entries);
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:getstatic       #63  <Field int android.support.v7.preference.R$styleable.MultiSelectListPreference_entries>
	//   21   37:getstatic       #66  <Field int android.support.v7.preference.R$styleable.MultiSelectListPreference_android_entries>
	//   22   40:invokestatic    #70  <Method CharSequence[] TypedArrayUtils.getTextArray(TypedArray, int, int)>
	//   23   43:putfield        #72  <Field CharSequence[] mEntries>
		mEntryValues = TypedArrayUtils.getTextArray(((TypedArray) (context)), android.support.v7.preference.R.styleable.MultiSelectListPreference_entryValues, android.support.v7.preference.R.styleable.MultiSelectListPreference_android_entryValues);
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getstatic       #75  <Field int android.support.v7.preference.R$styleable.MultiSelectListPreference_entryValues>
	//   27   51:getstatic       #78  <Field int android.support.v7.preference.R$styleable.MultiSelectListPreference_android_entryValues>
	//   28   54:invokestatic    #70  <Method CharSequence[] TypedArrayUtils.getTextArray(TypedArray, int, int)>
	//   29   57:putfield        #80  <Field CharSequence[] mEntryValues>
		((TypedArray) (context)).recycle();
	//   30   60:aload_1         
	//   31   61:invokevirtual   #85  <Method void TypedArray.recycle()>
	//   32   64:return          
	}

	public int findIndexOfValue(String s)
	{
		if(s != null && mEntryValues != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          45
	//*   2    4:aload_0         
	//*   3    5:getfield        #80  <Field CharSequence[] mEntryValues>
	//*   4    8:ifnull          45
		{
			for(int i = mEntryValues.length - 1; i >= 0; i--)
	//*   5   11:aload_0         
	//*   6   12:getfield        #80  <Field CharSequence[] mEntryValues>
	//*   7   15:arraylength     
	//*   8   16:iconst_1        
	//*   9   17:isub            
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:iflt            45
				if(((Object) (mEntryValues[i])).equals(((Object) (s))))
	//*  13   23:aload_0         
	//*  14   24:getfield        #80  <Field CharSequence[] mEntryValues>
	//*  15   27:iload_2         
	//*  16   28:aaload          
	//*  17   29:aload_1         
	//*  18   30:invokevirtual   #93  <Method boolean Object.equals(Object)>
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
	//    1    1:getfield        #72  <Field CharSequence[] mEntries>
	//    2    4:areturn         
	}

	public CharSequence[] getEntryValues()
	{
		return mEntryValues;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field CharSequence[] mEntryValues>
	//    2    4:areturn         
	}

	protected Set getPersistedStringSet(Set set)
	{
		if(!shouldPersist())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #106 <Method boolean shouldPersist()>
	//*   2    4:ifne            9
			return set;
	//    3    7:aload_1         
	//    4    8:areturn         
		else
			return getPreferenceManager().getSharedPreferences().getStringSet(getKey(), set);
	//    5    9:aload_0         
	//    6   10:invokevirtual   #110 <Method PreferenceManager getPreferenceManager()>
	//    7   13:invokevirtual   #116 <Method SharedPreferences PreferenceManager.getSharedPreferences()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #120 <Method String getKey()>
	//   10   20:aload_1         
	//   11   21:invokeinterface #126 <Method Set SharedPreferences.getStringSet(String, Set)>
	//   12   26:areturn         
	}

	protected boolean[] getSelectedItems()
	{
		CharSequence acharsequence[] = mEntryValues;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field CharSequence[] mEntryValues>
	//    2    4:astore_3        
		int j = acharsequence.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		Set set = mValues;
	//    6    8:aload_0         
	//    7    9:getfield        #48  <Field Set mValues>
	//    8   12:astore          4
		boolean aflag[] = new boolean[j];
	//    9   14:iload_2         
	//   10   15:newarray        boolean[]
	//   11   17:astore          5
		for(int i = 0; i < j; i++)
	//*  12   19:iconst_0        
	//*  13   20:istore_1        
	//*  14   21:iload_1         
	//*  15   22:iload_2         
	//*  16   23:icmpge          52
			aflag[i] = set.contains(((Object) (acharsequence[i].toString())));
	//   17   26:aload           5
	//   18   28:iload_1         
	//   19   29:aload           4
	//   20   31:aload_3         
	//   21   32:iload_1         
	//   22   33:aaload          
	//   23   34:invokeinterface #136 <Method String CharSequence.toString()>
	//   24   39:invokeinterface #141 <Method boolean Set.contains(Object)>
	//   25   44:bastore         

	//   26   45:iload_1         
	//   27   46:iconst_1        
	//   28   47:iadd            
	//   29   48:istore_1        
	//*  30   49:goto            21
		return aflag;
	//   31   52:aload           5
	//   32   54:areturn         
	}

	public Set getValues()
	{
		return mValues;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Set mValues>
	//    2    4:areturn         
	}

	protected Object onGetDefaultValue(TypedArray typedarray, int i)
	{
		typedarray = ((TypedArray) (typedarray.getTextArray(i)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #149 <Method CharSequence[] TypedArray.getTextArray(int)>
	//    3    5:astore_1        
		HashSet hashset = new HashSet();
	//    4    6:new             #43  <Class HashSet>
	//    5    9:dup             
	//    6   10:invokespecial   #46  <Method void HashSet()>
	//    7   13:astore          4
		int j = typedarray.length;
	//    8   15:aload_1         
	//    9   16:arraylength     
	//   10   17:istore_3        
		for(i = 0; i < j; i++)
	//*  11   18:iconst_0        
	//*  12   19:istore_2        
	//*  13   20:iload_2         
	//*  14   21:iload_3         
	//*  15   22:icmpge          48
			((Set) (hashset)).add(((Object) (((CharSequence) (typedarray[i])).toString())));
	//   16   25:aload           4
	//   17   27:aload_1         
	//   18   28:iload_2         
	//   19   29:aaload          
	//   20   30:invokeinterface #136 <Method String CharSequence.toString()>
	//   21   35:invokeinterface #152 <Method boolean Set.add(Object)>
	//   22   40:pop             

	//   23   41:iload_2         
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:istore_2        
	//*  27   45:goto            20
		return ((Object) (hashset));
	//   28   48:aload           4
	//   29   50:areturn         
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable == null || !((Object) (((Object) (parcelable)).getClass())).equals(android/support/v14/preference/MultiSelectListPreference$SavedState))
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #158 <Method Class Object.getClass()>
	//*   4    8:ldc1            #6   <Class MultiSelectListPreference$SavedState>
	//*   5   10:invokevirtual   #93  <Method boolean Object.equals(Object)>
	//*   6   13:ifne            22
		{
			super.onRestoreInstanceState(parcelable);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokespecial   #160 <Method void AbstractMultiSelectListPreference.onRestoreInstanceState(Parcelable)>
			return;
	//   10   21:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class MultiSelectListPreference$SavedState>
	//   13   26:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method Parcelable MultiSelectListPreference$SavedState.getSuperState()>
	//   17   32:invokespecial   #160 <Method void AbstractMultiSelectListPreference.onRestoreInstanceState(Parcelable)>
			setValues(((SavedState) (parcelable)).values);
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:getfield        #167 <Field Set MultiSelectListPreference$SavedState.values>
	//   21   40:invokevirtual   #171 <Method void setValues(Set)>
			return;
	//   22   43:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		Object obj = ((Object) (super.onSaveInstanceState()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #174 <Method Parcelable AbstractMultiSelectListPreference.onSaveInstanceState()>
	//    2    4:astore_1        
		if(isPersistent())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #177 <Method boolean isPersistent()>
	//*   5    9:ifeq            14
		{
			return ((Parcelable) (obj));
	//    6   12:aload_1         
	//    7   13:areturn         
		} else
		{
			obj = ((Object) (new SavedState(((Parcelable) (obj)))));
	//    8   14:new             #6   <Class MultiSelectListPreference$SavedState>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #179 <Method void MultiSelectListPreference$SavedState(Parcelable)>
	//   12   22:astore_1        
			obj.values = getValues();
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #181 <Method Set getValues()>
	//   16   28:putfield        #167 <Field Set MultiSelectListPreference$SavedState.values>
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
			obj = ((Object) (getPersistedStringSet(mValues)));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field Set mValues>
	//    5    9:invokevirtual   #185 <Method Set getPersistedStringSet(Set)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #171 <Method void setValues(Set)>
	//*  10   18:return          
			obj = ((Object) ((Set)obj));
	//   11   19:aload_2         
	//   12   20:checkcast       #138 <Class Set>
	//   13   23:astore_2        
		setValues(((Set) (obj)));
	//*  14   24:goto            13
	}

	protected boolean persistStringSet(Set set)
	{
		if(shouldPersist())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #106 <Method boolean shouldPersist()>
	//*   2    4:ifeq            57
		{
			if(set.equals(((Object) (getPersistedStringSet(((Set) (null)))))))
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:aconst_null     
	//*   6   10:invokevirtual   #185 <Method Set getPersistedStringSet(Set)>
	//*   7   13:invokeinterface #188 <Method boolean Set.equals(Object)>
	//*   8   18:ifeq            23
			{
				return true;
	//    9   21:iconst_1        
	//   10   22:ireturn         
			} else
			{
				android.content.SharedPreferences.Editor editor = getPreferenceManager().getSharedPreferences().edit();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #110 <Method PreferenceManager getPreferenceManager()>
	//   13   27:invokevirtual   #116 <Method SharedPreferences PreferenceManager.getSharedPreferences()>
	//   14   30:invokeinterface #192 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   15   35:astore_2        
				editor.putStringSet(getKey(), set);
	//   16   36:aload_2         
	//   17   37:aload_0         
	//   18   38:invokevirtual   #120 <Method String getKey()>
	//   19   41:aload_1         
	//   20   42:invokeinterface #198 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   21   47:pop             
				android.support.v4.content.SharedPreferencesCompat.EditorCompat.getInstance().apply(editor);
	//   22   48:invokestatic    #204 <Method android.support.v4.content.SharedPreferencesCompat$EditorCompat android.support.v4.content.SharedPreferencesCompat$EditorCompat.getInstance()>
	//   23   51:aload_2         
	//   24   52:invokevirtual   #208 <Method void android.support.v4.content.SharedPreferencesCompat$EditorCompat.apply(android.content.SharedPreferences$Editor)>
				return true;
	//   25   55:iconst_1        
	//   26   56:ireturn         
			}
		} else
		{
			return false;
	//   27   57:iconst_0        
	//   28   58:ireturn         
		}
	}

	public void setEntries(int i)
	{
		setEntries(getContext().getResources().getTextArray(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #216 <Method Context getContext()>
	//    3    5:invokevirtual   #220 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #223 <Method CharSequence[] Resources.getTextArray(int)>
	//    6   12:invokevirtual   #226 <Method void setEntries(CharSequence[])>
	//    7   15:return          
	}

	public void setEntries(CharSequence acharsequence[])
	{
		mEntries = acharsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field CharSequence[] mEntries>
	//    3    5:return          
	}

	public void setEntryValues(int i)
	{
		setEntryValues(getContext().getResources().getTextArray(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #216 <Method Context getContext()>
	//    3    5:invokevirtual   #220 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #223 <Method CharSequence[] Resources.getTextArray(int)>
	//    6   12:invokevirtual   #230 <Method void setEntryValues(CharSequence[])>
	//    7   15:return          
	}

	public void setEntryValues(CharSequence acharsequence[])
	{
		mEntryValues = acharsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field CharSequence[] mEntryValues>
	//    3    5:return          
	}

	public void setValues(Set set)
	{
		mValues.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Set mValues>
	//    2    4:invokeinterface #233 <Method void Set.clear()>
		mValues.addAll(((java.util.Collection) (set)));
	//    3    9:aload_0         
	//    4   10:getfield        #48  <Field Set mValues>
	//    5   13:aload_1         
	//    6   14:invokeinterface #237 <Method boolean Set.addAll(java.util.Collection)>
	//    7   19:pop             
		persistStringSet(set);
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokevirtual   #239 <Method boolean persistStringSet(Set)>
	//   11   25:pop             
	//   12   26:return          
	}

	private CharSequence mEntries[];
	private CharSequence mEntryValues[];
	private Set mValues;
}
