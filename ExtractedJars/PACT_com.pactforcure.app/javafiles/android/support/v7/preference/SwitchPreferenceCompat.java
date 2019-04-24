// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v7.preference:
//			TwoStatePreference, PreferenceViewHolder

public class SwitchPreferenceCompat extends TwoStatePreference
{
	private class Listener
		implements android.widget.CompoundButton.OnCheckedChangeListener
	{

		public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
		{
			if(!callChangeListener(((Object) (Boolean.valueOf(flag)))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field SwitchPreferenceCompat this$0>
		//*   2    4:iload_2         
		//*   3    5:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
		//*   4    8:invokevirtual   #34  <Method boolean SwitchPreferenceCompat.callChangeListener(Object)>
		//*   5   11:ifne            31
			{
				if(!flag)
		//*   6   14:iload_2         
		//*   7   15:ifne            26
					flag = true;
		//    8   18:iconst_1        
		//    9   19:istore_2        
				else
		//*  10   20:aload_1         
		//*  11   21:iload_2         
		//*  12   22:invokevirtual   #40  <Method void CompoundButton.setChecked(boolean)>
		//*  13   25:return          
					flag = false;
		//   14   26:iconst_0        
		//   15   27:istore_2        
				compoundbutton.setChecked(flag);
				return;
			} else
		//*  16   28:goto            20
			{
				setChecked(flag);
		//   17   31:aload_0         
		//   18   32:getfield        #15  <Field SwitchPreferenceCompat this$0>
		//   19   35:iload_2         
		//   20   36:invokevirtual   #41  <Method void SwitchPreferenceCompat.setChecked(boolean)>
				return;
		//   21   39:return          
			}
		}

		final SwitchPreferenceCompat this$0;

		private Listener()
		{
			this$0 = SwitchPreferenceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field SwitchPreferenceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public SwitchPreferenceCompat(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #19  <Method void SwitchPreferenceCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	public SwitchPreferenceCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, R.attr.switchPreferenceCompatStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #26  <Field int R$attr.switchPreferenceCompatStyle>
	//    4    6:invokespecial   #29  <Method void SwitchPreferenceCompat(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SwitchPreferenceCompat(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #32  <Method void SwitchPreferenceCompat(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public SwitchPreferenceCompat(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #33  <Method void TwoStatePreference(Context, AttributeSet, int, int)>
		mListener = new Listener();
	//    6    9:aload_0         
	//    7   10:new             #8   <Class SwitchPreferenceCompat$Listener>
	//    8   13:dup             
	//    9   14:aload_0         
	//   10   15:aconst_null     
	//   11   16:invokespecial   #36  <Method void SwitchPreferenceCompat$Listener(SwitchPreferenceCompat, SwitchPreferenceCompat$1)>
	//   12   19:putfield        #38  <Field SwitchPreferenceCompat$Listener mListener>
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.SwitchPreferenceCompat, i, j)));
	//   13   22:aload_1         
	//   14   23:aload_2         
	//   15   24:getstatic       #44  <Field int[] R$styleable.SwitchPreferenceCompat>
	//   16   27:iload_3         
	//   17   28:iload           4
	//   18   30:invokevirtual   #50  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   19   33:astore_1        
		setSummaryOn(((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.SwitchPreferenceCompat_summaryOn, R.styleable.SwitchPreferenceCompat_android_summaryOn))));
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:getstatic       #53  <Field int R$styleable.SwitchPreferenceCompat_summaryOn>
	//   23   39:getstatic       #56  <Field int R$styleable.SwitchPreferenceCompat_android_summaryOn>
	//   24   42:invokestatic    #62  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   25   45:invokevirtual   #66  <Method void setSummaryOn(CharSequence)>
		setSummaryOff(((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.SwitchPreferenceCompat_summaryOff, R.styleable.SwitchPreferenceCompat_android_summaryOff))));
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:getstatic       #69  <Field int R$styleable.SwitchPreferenceCompat_summaryOff>
	//   29   53:getstatic       #72  <Field int R$styleable.SwitchPreferenceCompat_android_summaryOff>
	//   30   56:invokestatic    #62  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   31   59:invokevirtual   #75  <Method void setSummaryOff(CharSequence)>
		setSwitchTextOn(((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.SwitchPreferenceCompat_switchTextOn, R.styleable.SwitchPreferenceCompat_android_switchTextOn))));
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:getstatic       #78  <Field int R$styleable.SwitchPreferenceCompat_switchTextOn>
	//   35   67:getstatic       #81  <Field int R$styleable.SwitchPreferenceCompat_android_switchTextOn>
	//   36   70:invokestatic    #62  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   37   73:invokevirtual   #84  <Method void setSwitchTextOn(CharSequence)>
		setSwitchTextOff(((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.SwitchPreferenceCompat_switchTextOff, R.styleable.SwitchPreferenceCompat_android_switchTextOff))));
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getstatic       #87  <Field int R$styleable.SwitchPreferenceCompat_switchTextOff>
	//   41   81:getstatic       #90  <Field int R$styleable.SwitchPreferenceCompat_android_switchTextOff>
	//   42   84:invokestatic    #62  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   43   87:invokevirtual   #93  <Method void setSwitchTextOff(CharSequence)>
		setDisableDependentsState(TypedArrayUtils.getBoolean(((TypedArray) (context)), R.styleable.SwitchPreferenceCompat_disableDependentsState, R.styleable.SwitchPreferenceCompat_android_disableDependentsState, false));
	//   44   90:aload_0         
	//   45   91:aload_1         
	//   46   92:getstatic       #96  <Field int R$styleable.SwitchPreferenceCompat_disableDependentsState>
	//   47   95:getstatic       #99  <Field int R$styleable.SwitchPreferenceCompat_android_disableDependentsState>
	//   48   98:iconst_0        
	//   49   99:invokestatic    #103 <Method boolean TypedArrayUtils.getBoolean(TypedArray, int, int, boolean)>
	//   50  102:invokevirtual   #107 <Method void setDisableDependentsState(boolean)>
		((TypedArray) (context)).recycle();
	//   51  105:aload_1         
	//   52  106:invokevirtual   #113 <Method void TypedArray.recycle()>
	//   53  109:return          
	}

	private void syncSwitchView(View view)
	{
		if(view instanceof SwitchCompat)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #117 <Class SwitchCompat>
	//*   2    4:ifeq            15
			((SwitchCompat)view).setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (null)));
	//    3    7:aload_1         
	//    4    8:checkcast       #117 <Class SwitchCompat>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #121 <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(view instanceof Checkable)
	//*   7   15:aload_1         
	//*   8   16:instanceof      #123 <Class Checkable>
	//*   9   19:ifeq            35
			((Checkable)view).setChecked(mChecked);
	//   10   22:aload_1         
	//   11   23:checkcast       #123 <Class Checkable>
	//   12   26:aload_0         
	//   13   27:getfield        #127 <Field boolean mChecked>
	//   14   30:invokeinterface #130 <Method void Checkable.setChecked(boolean)>
		if(view instanceof SwitchCompat)
	//*  15   35:aload_1         
	//*  16   36:instanceof      #117 <Class SwitchCompat>
	//*  17   39:ifeq            71
		{
			view = ((View) ((SwitchCompat)view));
	//   18   42:aload_1         
	//   19   43:checkcast       #117 <Class SwitchCompat>
	//   20   46:astore_1        
			((SwitchCompat) (view)).setTextOn(mSwitchOn);
	//   21   47:aload_1         
	//   22   48:aload_0         
	//   23   49:getfield        #132 <Field CharSequence mSwitchOn>
	//   24   52:invokevirtual   #135 <Method void SwitchCompat.setTextOn(CharSequence)>
			((SwitchCompat) (view)).setTextOff(mSwitchOff);
	//   25   55:aload_1         
	//   26   56:aload_0         
	//   27   57:getfield        #137 <Field CharSequence mSwitchOff>
	//   28   60:invokevirtual   #140 <Method void SwitchCompat.setTextOff(CharSequence)>
			((SwitchCompat) (view)).setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (mListener)));
	//   29   63:aload_1         
	//   30   64:aload_0         
	//   31   65:getfield        #38  <Field SwitchPreferenceCompat$Listener mListener>
	//   32   68:invokevirtual   #121 <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		}
	//   33   71:return          
	}

	private void syncViewIfAccessibilityEnabled(View view)
	{
		if(!((AccessibilityManager)getContext().getSystemService("accessibility")).isEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #145 <Method Context getContext()>
	//*   2    4:ldc1            #147 <String "accessibility">
	//*   3    6:invokevirtual   #151 <Method Object Context.getSystemService(String)>
	//*   4    9:checkcast       #153 <Class AccessibilityManager>
	//*   5   12:invokevirtual   #157 <Method boolean AccessibilityManager.isEnabled()>
	//*   6   15:ifne            19
		{
			return;
	//    7   18:return          
		} else
		{
			syncSwitchView(view.findViewById(R.id.switchWidget));
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:getstatic       #162 <Field int R$id.switchWidget>
	//   11   24:invokevirtual   #168 <Method View View.findViewById(int)>
	//   12   27:invokespecial   #170 <Method void syncSwitchView(View)>
			syncSummaryView(view.findViewById(0x1020010));
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:ldc1            #171 <Int 0x1020010>
	//   16   34:invokevirtual   #168 <Method View View.findViewById(int)>
	//   17   37:invokevirtual   #174 <Method void syncSummaryView(View)>
			return;
	//   18   40:return          
		}
	}

	public CharSequence getSwitchTextOff()
	{
		return mSwitchOff;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field CharSequence mSwitchOff>
	//    2    4:areturn         
	}

	public CharSequence getSwitchTextOn()
	{
		return mSwitchOn;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field CharSequence mSwitchOn>
	//    2    4:areturn         
	}

	public void onBindViewHolder(PreferenceViewHolder preferenceviewholder)
	{
		super.onBindViewHolder(preferenceviewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #181 <Method void TwoStatePreference.onBindViewHolder(PreferenceViewHolder)>
		syncSwitchView(preferenceviewholder.findViewById(R.id.switchWidget));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getstatic       #162 <Field int R$id.switchWidget>
	//    6   10:invokevirtual   #184 <Method View PreferenceViewHolder.findViewById(int)>
	//    7   13:invokespecial   #170 <Method void syncSwitchView(View)>
		syncSummaryView(preferenceviewholder);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #186 <Method void syncSummaryView(PreferenceViewHolder)>
	//   11   21:return          
	}

	protected void performClick(View view)
	{
		super.performClick(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #193 <Method void TwoStatePreference.performClick(View)>
		syncViewIfAccessibilityEnabled(view);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #195 <Method void syncViewIfAccessibilityEnabled(View)>
	//    6   10:return          
	}

	public void setSwitchTextOff(int i)
	{
		setSwitchTextOff(((CharSequence) (getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #145 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #200 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #93  <Method void setSwitchTextOff(CharSequence)>
	//    6   12:return          
	}

	public void setSwitchTextOff(CharSequence charsequence)
	{
		mSwitchOff = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #137 <Field CharSequence mSwitchOff>
		notifyChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #203 <Method void notifyChanged()>
	//    5    9:return          
	}

	public void setSwitchTextOn(int i)
	{
		setSwitchTextOn(((CharSequence) (getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #145 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #200 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #84  <Method void setSwitchTextOn(CharSequence)>
	//    6   12:return          
	}

	public void setSwitchTextOn(CharSequence charsequence)
	{
		mSwitchOn = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field CharSequence mSwitchOn>
		notifyChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #203 <Method void notifyChanged()>
	//    5    9:return          
	}

	private final Listener mListener;
	private CharSequence mSwitchOff;
	private CharSequence mSwitchOn;
}
