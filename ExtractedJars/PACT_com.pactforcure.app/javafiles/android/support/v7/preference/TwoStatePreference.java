// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package android.support.v7.preference:
//			Preference, PreferenceViewHolder

public abstract class TwoStatePreference extends Preference
{
	static class SavedState extends Preference.BaseSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #40  <Method void Preference$BaseSavedState.writeToParcel(Parcel, int)>
			if(checked)
		//*   4    6:aload_0         
		//*   5    7:getfield        #33  <Field boolean checked>
		//*   6   10:ifeq            21
				i = 1;
		//    7   13:iconst_1        
		//    8   14:istore_2        
			else
		//*   9   15:aload_1         
		//*  10   16:iload_2         
		//*  11   17:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		//*  12   20:return          
				i = 0;
		//   13   21:iconst_0        
		//   14   22:istore_2        
			parcel.writeInt(i);
		//*  15   23:goto            15
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class TwoStatePreference$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void TwoStatePreference$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method TwoStatePreference$SavedState createFromParcel(Parcel)>
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
			//    2    2:invokevirtual   #30  <Method TwoStatePreference$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		boolean checked;

		static 
		{
		//    0    0:new             #9   <Class TwoStatePreference$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void TwoStatePreference$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel)
		{
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_2        
			super(parcel);
		//    2    2:aload_0         
		//    3    3:aload_1         
		//    4    4:invokespecial   #25  <Method void Preference$BaseSavedState(Parcel)>
			if(parcel.readInt() != 1)
		//*   5    7:aload_1         
		//*   6    8:invokevirtual   #31  <Method int Parcel.readInt()>
		//*   7   11:iconst_1        
		//*   8   12:icmpne          21
		//*   9   15:aload_0         
		//*  10   16:iload_2         
		//*  11   17:putfield        #33  <Field boolean checked>
		//*  12   20:return          
				flag = false;
		//   13   21:iconst_0        
		//   14   22:istore_2        
			checked = flag;
		//*  15   23:goto            15
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


	public TwoStatePreference(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #21  <Method void TwoStatePreference(Context, AttributeSet)>
	//    4    6:return          
	}

	public TwoStatePreference(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #25  <Method void TwoStatePreference(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public TwoStatePreference(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #28  <Method void TwoStatePreference(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public TwoStatePreference(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #29  <Method void Preference(Context, AttributeSet, int, int)>
	//    6    9:return          
	}

	public boolean getDisableDependentsState()
	{
		return mDisableDependentsState;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean mDisableDependentsState>
	//    2    4:ireturn         
	}

	public CharSequence getSummaryOff()
	{
		return mSummaryOff;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field CharSequence mSummaryOff>
	//    2    4:areturn         
	}

	public CharSequence getSummaryOn()
	{
		return mSummaryOn;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field CharSequence mSummaryOn>
	//    2    4:areturn         
	}

	public boolean isChecked()
	{
		return mChecked;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean mChecked>
	//    2    4:ireturn         
	}

	protected void onClick()
	{
		super.onClick();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Preference.onClick()>
		boolean flag;
		if(!isChecked())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #49  <Method boolean isChecked()>
	//*   4    8:ifne            30
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_1        
		else
	//*   7   13:aload_0         
	//*   8   14:iload_1         
	//*   9   15:invokestatic    #55  <Method Boolean Boolean.valueOf(boolean)>
	//*  10   18:invokevirtual   #59  <Method boolean callChangeListener(Object)>
	//*  11   21:ifeq            29
	//*  12   24:aload_0         
	//*  13   25:iload_1         
	//*  14   26:invokevirtual   #63  <Method void setChecked(boolean)>
	//*  15   29:return          
			flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_1        
		if(callChangeListener(((Object) (Boolean.valueOf(flag)))))
			setChecked(flag);
	//*  18   32:goto            13
	}

	protected Object onGetDefaultValue(TypedArray typedarray, int i)
	{
		return ((Object) (Boolean.valueOf(typedarray.getBoolean(i, false))));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #71  <Method boolean TypedArray.getBoolean(int, boolean)>
	//    4    6:invokestatic    #55  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:areturn         
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable == null || !((Object) (((Object) (parcelable)).getClass())).equals(android/support/v7/preference/TwoStatePreference$SavedState))
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #79  <Method Class Object.getClass()>
	//*   4    8:ldc1            #6   <Class TwoStatePreference$SavedState>
	//*   5   10:invokevirtual   #82  <Method boolean Object.equals(Object)>
	//*   6   13:ifne            22
		{
			super.onRestoreInstanceState(parcelable);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokespecial   #84  <Method void Preference.onRestoreInstanceState(Parcelable)>
			return;
	//   10   21:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class TwoStatePreference$SavedState>
	//   13   26:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #88  <Method Parcelable TwoStatePreference$SavedState.getSuperState()>
	//   17   32:invokespecial   #84  <Method void Preference.onRestoreInstanceState(Parcelable)>
			setChecked(((SavedState) (parcelable)).checked);
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:getfield        #91  <Field boolean TwoStatePreference$SavedState.checked>
	//   21   40:invokevirtual   #63  <Method void setChecked(boolean)>
			return;
	//   22   43:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		Object obj = ((Object) (super.onSaveInstanceState()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method Parcelable Preference.onSaveInstanceState()>
	//    2    4:astore_1        
		if(isPersistent())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #97  <Method boolean isPersistent()>
	//*   5    9:ifeq            14
		{
			return ((Parcelable) (obj));
	//    6   12:aload_1         
	//    7   13:areturn         
		} else
		{
			obj = ((Object) (new SavedState(((Parcelable) (obj)))));
	//    8   14:new             #6   <Class TwoStatePreference$SavedState>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #99  <Method void TwoStatePreference$SavedState(Parcelable)>
	//   12   22:astore_1        
			obj.checked = isChecked();
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #49  <Method boolean isChecked()>
	//   16   28:putfield        #91  <Field boolean TwoStatePreference$SavedState.checked>
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
			flag = getPersistedBoolean(mChecked);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field boolean mChecked>
	//    5    9:invokevirtual   #105 <Method boolean getPersistedBoolean(boolean)>
	//    6   12:istore_1        
		else
	//*   7   13:aload_0         
	//*   8   14:iload_1         
	//*   9   15:invokevirtual   #63  <Method void setChecked(boolean)>
	//*  10   18:return          
			flag = ((Boolean)obj).booleanValue();
	//   11   19:aload_2         
	//   12   20:checkcast       #51  <Class Boolean>
	//   13   23:invokevirtual   #108 <Method boolean Boolean.booleanValue()>
	//   14   26:istore_1        
		setChecked(flag);
	//*  15   27:goto            13
	}

	public void setChecked(boolean flag)
	{
		boolean flag1;
		if(mChecked != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field boolean mChecked>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          54
			flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:iload_2         
	//*   7   11:ifne            21
	//*   8   14:aload_0         
	//*   9   15:getfield        #110 <Field boolean mCheckedSet>
	//*  10   18:ifne            53
	//*  11   21:aload_0         
	//*  12   22:iload_1         
	//*  13   23:putfield        #43  <Field boolean mChecked>
	//*  14   26:aload_0         
	//*  15   27:iconst_1        
	//*  16   28:putfield        #110 <Field boolean mCheckedSet>
	//*  17   31:aload_0         
	//*  18   32:iload_1         
	//*  19   33:invokevirtual   #113 <Method boolean persistBoolean(boolean)>
	//*  20   36:pop             
	//*  21   37:iload_2         
	//*  22   38:ifeq            53
	//*  23   41:aload_0         
	//*  24   42:aload_0         
	//*  25   43:invokevirtual   #116 <Method boolean shouldDisableDependents()>
	//*  26   46:invokevirtual   #119 <Method void notifyDependencyChange(boolean)>
	//*  27   49:aload_0         
	//*  28   50:invokevirtual   #122 <Method void notifyChanged()>
	//*  29   53:return          
			flag1 = false;
	//   30   54:iconst_0        
	//   31   55:istore_2        
		if(flag1 || !mCheckedSet)
		{
			mChecked = flag;
			mCheckedSet = true;
			persistBoolean(flag);
			if(flag1)
			{
				notifyDependencyChange(shouldDisableDependents());
				notifyChanged();
			}
		}
	//*  32   56:goto            10
	}

	public void setDisableDependentsState(boolean flag)
	{
		mDisableDependentsState = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field boolean mDisableDependentsState>
	//    3    5:return          
	}

	public void setSummaryOff(int i)
	{
		setSummaryOff(((CharSequence) (getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #129 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #135 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #138 <Method void setSummaryOff(CharSequence)>
	//    6   12:return          
	}

	public void setSummaryOff(CharSequence charsequence)
	{
		mSummaryOff = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field CharSequence mSummaryOff>
		if(!isChecked())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #49  <Method boolean isChecked()>
	//*   5    9:ifne            16
			notifyChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #122 <Method void notifyChanged()>
	//    8   16:return          
	}

	public void setSummaryOn(int i)
	{
		setSummaryOn(((CharSequence) (getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #129 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #135 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #141 <Method void setSummaryOn(CharSequence)>
	//    6   12:return          
	}

	public void setSummaryOn(CharSequence charsequence)
	{
		mSummaryOn = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field CharSequence mSummaryOn>
		if(isChecked())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #49  <Method boolean isChecked()>
	//*   5    9:ifeq            16
			notifyChanged();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #122 <Method void notifyChanged()>
	//    8   16:return          
	}

	public boolean shouldDisableDependents()
	{
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
			boolean flag;
			if(mDisableDependentsState)
	//*   2    2:aload_0         
	//*   3    3:getfield        #33  <Field boolean mDisableDependentsState>
	//*   4    6:ifeq            31
				flag = mChecked;
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field boolean mChecked>
	//    7   13:istore_1        
			else
	//*   8   14:iload_1         
	//*   9   15:ifne            27
	//*  10   18:iload_2         
	//*  11   19:istore_1        
	//*  12   20:aload_0         
	//*  13   21:invokespecial   #142 <Method boolean Preference.shouldDisableDependents()>
	//*  14   24:ifeq            29
	//*  15   27:iconst_1        
	//*  16   28:istore_1        
	//*  17   29:iload_1         
	//*  18   30:ireturn         
			if(!mChecked)
	//*  19   31:aload_0         
	//*  20   32:getfield        #43  <Field boolean mChecked>
	//*  21   35:ifne            43
				flag = true;
	//   22   38:iconst_1        
	//   23   39:istore_1        
			else
	//*  24   40:goto            14
				flag = false;
	//   25   43:iconst_0        
	//   26   44:istore_1        
			if(!flag)
			{
				flag = flag1;
				if(!super.shouldDisableDependents())
					break label0;
			}
			flag = true;
		}
		return flag;
	//*  27   45:goto            14
	}

	protected void syncSummaryView(PreferenceViewHolder preferenceviewholder)
	{
		syncSummaryView(preferenceviewholder.findViewById(0x1020010));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #145 <Int 0x1020010>
	//    3    4:invokevirtual   #151 <Method View PreferenceViewHolder.findViewById(int)>
	//    4    7:invokevirtual   #154 <Method void syncSummaryView(View)>
	//    5   10:return          
	}

	protected void syncSummaryView(View view)
	{
		if(view instanceof TextView) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:instanceof      #160 <Class TextView>
	//    2    4:ifne            8
_L1:
		return;
	//    3    7:return          
_L2:
		byte byte0;
		boolean flag;
		view = ((View) ((TextView)view));
	//    4    8:aload_1         
	//    5    9:checkcast       #160 <Class TextView>
	//    6   12:astore_1        
		flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_3        
		if(!mChecked || TextUtils.isEmpty(mSummaryOn))
			break; /* Loop/switch isn't completed */
	//    9   15:aload_0         
	//   10   16:getfield        #43  <Field boolean mChecked>
	//   11   19:ifeq            95
	//   12   22:aload_0         
	//   13   23:getfield        #40  <Field CharSequence mSummaryOn>
	//   14   26:invokestatic    #166 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   15   29:ifne            95
		((TextView) (view)).setText(mSummaryOn);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #40  <Field CharSequence mSummaryOn>
	//   19   37:invokevirtual   #169 <Method void TextView.setText(CharSequence)>
		byte0 = 0;
	//   20   40:iconst_0        
	//   21   41:istore_2        
_L4:
		flag = ((boolean) (byte0));
	//   22   42:iload_2         
	//   23   43:istore_3        
		if(byte0 != 0)
	//*  24   44:iload_2         
	//*  25   45:ifeq            72
		{
			CharSequence charsequence = getSummary();
	//   26   48:aload_0         
	//   27   49:invokevirtual   #172 <Method CharSequence getSummary()>
	//   28   52:astore          4
			flag = ((boolean) (byte0));
	//   29   54:iload_2         
	//   30   55:istore_3        
			if(!TextUtils.isEmpty(charsequence))
	//*  31   56:aload           4
	//*  32   58:invokestatic    #166 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  33   61:ifne            72
			{
				((TextView) (view)).setText(charsequence);
	//   34   64:aload_1         
	//   35   65:aload           4
	//   36   67:invokevirtual   #169 <Method void TextView.setText(CharSequence)>
				flag = false;
	//   37   70:iconst_0        
	//   38   71:istore_3        
			}
		}
		byte0 = 8;
	//   39   72:bipush          8
	//   40   74:istore_2        
		if(!flag)
	//*  41   75:iload_3         
	//*  42   76:ifne            81
			byte0 = 0;
	//   43   79:iconst_0        
	//   44   80:istore_2        
		if(byte0 != ((TextView) (view)).getVisibility())
	//*  45   81:iload_2         
	//*  46   82:aload_1         
	//*  47   83:invokevirtual   #176 <Method int TextView.getVisibility()>
	//*  48   86:icmpeq          7
		{
			((TextView) (view)).setVisibility(((int) (byte0)));
	//   49   89:aload_1         
	//   50   90:iload_2         
	//   51   91:invokevirtual   #179 <Method void TextView.setVisibility(int)>
			return;
	//   52   94:return          
		}
		if(true) goto _L1; else goto _L3
_L3:
		byte0 = ((byte) (flag));
	//   53   95:iload_3         
	//   54   96:istore_2        
		if(!mChecked)
	//*  55   97:aload_0         
	//*  56   98:getfield        #43  <Field boolean mChecked>
	//*  57  101:ifne            42
		{
			byte0 = ((byte) (flag));
	//   58  104:iload_3         
	//   59  105:istore_2        
			if(!TextUtils.isEmpty(mSummaryOff))
	//*  60  106:aload_0         
	//*  61  107:getfield        #37  <Field CharSequence mSummaryOff>
	//*  62  110:invokestatic    #166 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  63  113:ifne            42
			{
				((TextView) (view)).setText(mSummaryOff);
	//   64  116:aload_1         
	//   65  117:aload_0         
	//   66  118:getfield        #37  <Field CharSequence mSummaryOff>
	//   67  121:invokevirtual   #169 <Method void TextView.setText(CharSequence)>
				byte0 = 0;
	//   68  124:iconst_0        
	//   69  125:istore_2        
			}
		}
		  goto _L4
		if(true) goto _L1; else goto _L5
_L5:
	//*  70  126:goto            42
	}

	protected boolean mChecked;
	private boolean mCheckedSet;
	private boolean mDisableDependentsState;
	private CharSequence mSummaryOff;
	private CharSequence mSummaryOn;
}
