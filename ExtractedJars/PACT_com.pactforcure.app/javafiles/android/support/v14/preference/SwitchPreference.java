// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v14.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.preference.PreferenceViewHolder;
import android.support.v7.preference.TwoStatePreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.*;

public class SwitchPreference extends TwoStatePreference
{
	private class Listener
		implements android.widget.CompoundButton.OnCheckedChangeListener
	{

		public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
		{
			if(!callChangeListener(((Object) (Boolean.valueOf(flag)))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field SwitchPreference this$0>
		//*   2    4:iload_2         
		//*   3    5:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
		//*   4    8:invokevirtual   #34  <Method boolean SwitchPreference.callChangeListener(Object)>
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
		//   18   32:getfield        #15  <Field SwitchPreference this$0>
		//   19   35:iload_2         
		//   20   36:invokevirtual   #41  <Method void SwitchPreference.setChecked(boolean)>
				return;
		//   21   39:return          
			}
		}

		final SwitchPreference this$0;

		private Listener()
		{
			this$0 = SwitchPreference.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field SwitchPreference this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public SwitchPreference(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #19  <Method void SwitchPreference(Context, AttributeSet)>
	//    4    6:return          
	}

	public SwitchPreference(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, TypedArrayUtils.getAttr(context, android.support.v7.preference.R.attr.switchPreferenceStyle, 0x101036d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getstatic       #26  <Field int android.support.v7.preference.R$attr.switchPreferenceStyle>
	//    5    7:ldc1            #27  <Int 0x101036d>
	//    6    9:invokestatic    #33  <Method int TypedArrayUtils.getAttr(Context, int, int)>
	//    7   12:invokespecial   #36  <Method void SwitchPreference(Context, AttributeSet, int)>
	//    8   15:return          
	}

	public SwitchPreference(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #39  <Method void SwitchPreference(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public SwitchPreference(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #40  <Method void TwoStatePreference(Context, AttributeSet, int, int)>
		mListener = new Listener();
	//    6    9:aload_0         
	//    7   10:new             #8   <Class SwitchPreference$Listener>
	//    8   13:dup             
	//    9   14:aload_0         
	//   10   15:aconst_null     
	//   11   16:invokespecial   #43  <Method void SwitchPreference$Listener(SwitchPreference, SwitchPreference$1)>
	//   12   19:putfield        #45  <Field SwitchPreference$Listener mListener>
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.SwitchPreference, i, j)));
	//   13   22:aload_1         
	//   14   23:aload_2         
	//   15   24:getstatic       #51  <Field int[] R$styleable.SwitchPreference>
	//   16   27:iload_3         
	//   17   28:iload           4
	//   18   30:invokevirtual   #57  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   19   33:astore_1        
		setSummaryOn(((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.SwitchPreference_summaryOn, R.styleable.SwitchPreference_android_summaryOn))));
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:getstatic       #60  <Field int R$styleable.SwitchPreference_summaryOn>
	//   23   39:getstatic       #63  <Field int R$styleable.SwitchPreference_android_summaryOn>
	//   24   42:invokestatic    #67  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   25   45:invokevirtual   #71  <Method void setSummaryOn(CharSequence)>
		setSummaryOff(((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.SwitchPreference_summaryOff, R.styleable.SwitchPreference_android_summaryOff))));
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:getstatic       #74  <Field int R$styleable.SwitchPreference_summaryOff>
	//   29   53:getstatic       #77  <Field int R$styleable.SwitchPreference_android_summaryOff>
	//   30   56:invokestatic    #67  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   31   59:invokevirtual   #80  <Method void setSummaryOff(CharSequence)>
		setSwitchTextOn(((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.SwitchPreference_switchTextOn, R.styleable.SwitchPreference_android_switchTextOn))));
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:getstatic       #83  <Field int R$styleable.SwitchPreference_switchTextOn>
	//   35   67:getstatic       #86  <Field int R$styleable.SwitchPreference_android_switchTextOn>
	//   36   70:invokestatic    #67  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   37   73:invokevirtual   #89  <Method void setSwitchTextOn(CharSequence)>
		setSwitchTextOff(((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.SwitchPreference_switchTextOff, R.styleable.SwitchPreference_android_switchTextOff))));
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getstatic       #92  <Field int R$styleable.SwitchPreference_switchTextOff>
	//   41   81:getstatic       #95  <Field int R$styleable.SwitchPreference_android_switchTextOff>
	//   42   84:invokestatic    #67  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   43   87:invokevirtual   #98  <Method void setSwitchTextOff(CharSequence)>
		setDisableDependentsState(TypedArrayUtils.getBoolean(((TypedArray) (context)), R.styleable.SwitchPreference_disableDependentsState, R.styleable.SwitchPreference_android_disableDependentsState, false));
	//   44   90:aload_0         
	//   45   91:aload_1         
	//   46   92:getstatic       #101 <Field int R$styleable.SwitchPreference_disableDependentsState>
	//   47   95:getstatic       #104 <Field int R$styleable.SwitchPreference_android_disableDependentsState>
	//   48   98:iconst_0        
	//   49   99:invokestatic    #108 <Method boolean TypedArrayUtils.getBoolean(TypedArray, int, int, boolean)>
	//   50  102:invokevirtual   #112 <Method void setDisableDependentsState(boolean)>
		((TypedArray) (context)).recycle();
	//   51  105:aload_1         
	//   52  106:invokevirtual   #118 <Method void TypedArray.recycle()>
	//   53  109:return          
	}

	private void syncSwitchView(View view)
	{
		if(view instanceof Switch)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #122 <Class Switch>
	//*   2    4:ifeq            15
			((Switch)view).setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (null)));
	//    3    7:aload_1         
	//    4    8:checkcast       #122 <Class Switch>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #126 <Method void Switch.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(view instanceof Checkable)
	//*   7   15:aload_1         
	//*   8   16:instanceof      #128 <Class Checkable>
	//*   9   19:ifeq            35
			((Checkable)view).setChecked(mChecked);
	//   10   22:aload_1         
	//   11   23:checkcast       #128 <Class Checkable>
	//   12   26:aload_0         
	//   13   27:getfield        #132 <Field boolean mChecked>
	//   14   30:invokeinterface #135 <Method void Checkable.setChecked(boolean)>
		if(view instanceof Switch)
	//*  15   35:aload_1         
	//*  16   36:instanceof      #122 <Class Switch>
	//*  17   39:ifeq            71
		{
			view = ((View) ((Switch)view));
	//   18   42:aload_1         
	//   19   43:checkcast       #122 <Class Switch>
	//   20   46:astore_1        
			((Switch) (view)).setTextOn(mSwitchOn);
	//   21   47:aload_1         
	//   22   48:aload_0         
	//   23   49:getfield        #137 <Field CharSequence mSwitchOn>
	//   24   52:invokevirtual   #140 <Method void Switch.setTextOn(CharSequence)>
			((Switch) (view)).setTextOff(mSwitchOff);
	//   25   55:aload_1         
	//   26   56:aload_0         
	//   27   57:getfield        #142 <Field CharSequence mSwitchOff>
	//   28   60:invokevirtual   #145 <Method void Switch.setTextOff(CharSequence)>
			((Switch) (view)).setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (mListener)));
	//   29   63:aload_1         
	//   30   64:aload_0         
	//   31   65:getfield        #45  <Field SwitchPreference$Listener mListener>
	//   32   68:invokevirtual   #126 <Method void Switch.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		}
	//   33   71:return          
	}

	private void syncViewIfAccessibilityEnabled(View view)
	{
		if(!((AccessibilityManager)getContext().getSystemService("accessibility")).isEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #150 <Method Context getContext()>
	//*   2    4:ldc1            #152 <String "accessibility">
	//*   3    6:invokevirtual   #156 <Method Object Context.getSystemService(String)>
	//*   4    9:checkcast       #158 <Class AccessibilityManager>
	//*   5   12:invokevirtual   #162 <Method boolean AccessibilityManager.isEnabled()>
	//*   6   15:ifne            19
		{
			return;
	//    7   18:return          
		} else
		{
			syncSwitchView(view.findViewById(0x1020040));
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:ldc1            #163 <Int 0x1020040>
	//   11   23:invokevirtual   #169 <Method View View.findViewById(int)>
	//   12   26:invokespecial   #171 <Method void syncSwitchView(View)>
			syncSummaryView(view.findViewById(0x1020010));
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:ldc1            #172 <Int 0x1020010>
	//   16   33:invokevirtual   #169 <Method View View.findViewById(int)>
	//   17   36:invokevirtual   #175 <Method void syncSummaryView(View)>
			return;
	//   18   39:return          
		}
	}

	public CharSequence getSwitchTextOff()
	{
		return mSwitchOff;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field CharSequence mSwitchOff>
	//    2    4:areturn         
	}

	public CharSequence getSwitchTextOn()
	{
		return mSwitchOn;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field CharSequence mSwitchOn>
	//    2    4:areturn         
	}

	public void onBindViewHolder(PreferenceViewHolder preferenceviewholder)
	{
		super.onBindViewHolder(preferenceviewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #182 <Method void TwoStatePreference.onBindViewHolder(PreferenceViewHolder)>
		syncSwitchView(preferenceviewholder.findViewById(0x1020040));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #163 <Int 0x1020040>
	//    6    9:invokevirtual   #185 <Method View PreferenceViewHolder.findViewById(int)>
	//    7   12:invokespecial   #171 <Method void syncSwitchView(View)>
		syncSummaryView(preferenceviewholder);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #187 <Method void syncSummaryView(PreferenceViewHolder)>
	//   11   20:return          
	}

	protected void performClick(View view)
	{
		super.performClick(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #194 <Method void TwoStatePreference.performClick(View)>
		syncViewIfAccessibilityEnabled(view);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #196 <Method void syncViewIfAccessibilityEnabled(View)>
	//    6   10:return          
	}

	public void setSwitchTextOff(int i)
	{
		setSwitchTextOff(((CharSequence) (getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #150 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #201 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #98  <Method void setSwitchTextOff(CharSequence)>
	//    6   12:return          
	}

	public void setSwitchTextOff(CharSequence charsequence)
	{
		mSwitchOff = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field CharSequence mSwitchOff>
		notifyChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #204 <Method void notifyChanged()>
	//    5    9:return          
	}

	public void setSwitchTextOn(int i)
	{
		setSwitchTextOn(((CharSequence) (getContext().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #150 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #201 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #89  <Method void setSwitchTextOn(CharSequence)>
	//    6   12:return          
	}

	public void setSwitchTextOn(CharSequence charsequence)
	{
		mSwitchOn = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #137 <Field CharSequence mSwitchOn>
		notifyChanged();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #204 <Method void notifyChanged()>
	//    5    9:return          
	}

	private final Listener mListener;
	private CharSequence mSwitchOff;
	private CharSequence mSwitchOn;
}
