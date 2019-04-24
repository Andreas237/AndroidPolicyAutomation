// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v7.preference:
//			TwoStatePreference, PreferenceViewHolder

public class CheckBoxPreference extends TwoStatePreference
{
	private class Listener
		implements android.widget.CompoundButton.OnCheckedChangeListener
	{

		public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
		{
			if(!callChangeListener(((Object) (Boolean.valueOf(flag)))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field CheckBoxPreference this$0>
		//*   2    4:iload_2         
		//*   3    5:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
		//*   4    8:invokevirtual   #34  <Method boolean CheckBoxPreference.callChangeListener(Object)>
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
		//   18   32:getfield        #15  <Field CheckBoxPreference this$0>
		//   19   35:iload_2         
		//   20   36:invokevirtual   #41  <Method void CheckBoxPreference.setChecked(boolean)>
				return;
		//   21   39:return          
			}
		}

		final CheckBoxPreference this$0;

		private Listener()
		{
			this$0 = CheckBoxPreference.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CheckBoxPreference this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public CheckBoxPreference(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #16  <Method void CheckBoxPreference(Context, AttributeSet)>
	//    4    6:return          
	}

	public CheckBoxPreference(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, TypedArrayUtils.getAttr(context, R.attr.checkBoxPreferenceStyle, 0x101008f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:getstatic       #23  <Field int R$attr.checkBoxPreferenceStyle>
	//    5    7:ldc1            #24  <Int 0x101008f>
	//    6    9:invokestatic    #30  <Method int TypedArrayUtils.getAttr(Context, int, int)>
	//    7   12:invokespecial   #33  <Method void CheckBoxPreference(Context, AttributeSet, int)>
	//    8   15:return          
	}

	public CheckBoxPreference(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #36  <Method void CheckBoxPreference(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public CheckBoxPreference(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #37  <Method void TwoStatePreference(Context, AttributeSet, int, int)>
		mListener = new Listener();
	//    6    9:aload_0         
	//    7   10:new             #8   <Class CheckBoxPreference$Listener>
	//    8   13:dup             
	//    9   14:aload_0         
	//   10   15:aconst_null     
	//   11   16:invokespecial   #40  <Method void CheckBoxPreference$Listener(CheckBoxPreference, CheckBoxPreference$1)>
	//   12   19:putfield        #42  <Field CheckBoxPreference$Listener mListener>
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.CheckBoxPreference, i, j)));
	//   13   22:aload_1         
	//   14   23:aload_2         
	//   15   24:getstatic       #48  <Field int[] R$styleable.CheckBoxPreference>
	//   16   27:iload_3         
	//   17   28:iload           4
	//   18   30:invokevirtual   #54  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   19   33:astore_1        
		setSummaryOn(((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.CheckBoxPreference_summaryOn, R.styleable.CheckBoxPreference_android_summaryOn))));
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:getstatic       #57  <Field int R$styleable.CheckBoxPreference_summaryOn>
	//   23   39:getstatic       #60  <Field int R$styleable.CheckBoxPreference_android_summaryOn>
	//   24   42:invokestatic    #64  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   25   45:invokevirtual   #68  <Method void setSummaryOn(CharSequence)>
		setSummaryOff(((CharSequence) (TypedArrayUtils.getString(((TypedArray) (context)), R.styleable.CheckBoxPreference_summaryOff, R.styleable.CheckBoxPreference_android_summaryOff))));
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:getstatic       #71  <Field int R$styleable.CheckBoxPreference_summaryOff>
	//   29   53:getstatic       #74  <Field int R$styleable.CheckBoxPreference_android_summaryOff>
	//   30   56:invokestatic    #64  <Method String TypedArrayUtils.getString(TypedArray, int, int)>
	//   31   59:invokevirtual   #77  <Method void setSummaryOff(CharSequence)>
		setDisableDependentsState(TypedArrayUtils.getBoolean(((TypedArray) (context)), R.styleable.CheckBoxPreference_disableDependentsState, R.styleable.CheckBoxPreference_android_disableDependentsState, false));
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:getstatic       #80  <Field int R$styleable.CheckBoxPreference_disableDependentsState>
	//   35   67:getstatic       #83  <Field int R$styleable.CheckBoxPreference_android_disableDependentsState>
	//   36   70:iconst_0        
	//   37   71:invokestatic    #87  <Method boolean TypedArrayUtils.getBoolean(TypedArray, int, int, boolean)>
	//   38   74:invokevirtual   #91  <Method void setDisableDependentsState(boolean)>
		((TypedArray) (context)).recycle();
	//   39   77:aload_1         
	//   40   78:invokevirtual   #97  <Method void TypedArray.recycle()>
	//   41   81:return          
	}

	private void syncCheckboxView(View view)
	{
		if(view instanceof CompoundButton)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #101 <Class CompoundButton>
	//*   2    4:ifeq            15
			((CompoundButton)view).setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (null)));
	//    3    7:aload_1         
	//    4    8:checkcast       #101 <Class CompoundButton>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #105 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		if(view instanceof Checkable)
	//*   7   15:aload_1         
	//*   8   16:instanceof      #107 <Class Checkable>
	//*   9   19:ifeq            35
			((Checkable)view).setChecked(mChecked);
	//   10   22:aload_1         
	//   11   23:checkcast       #107 <Class Checkable>
	//   12   26:aload_0         
	//   13   27:getfield        #111 <Field boolean mChecked>
	//   14   30:invokeinterface #114 <Method void Checkable.setChecked(boolean)>
		if(view instanceof CompoundButton)
	//*  15   35:aload_1         
	//*  16   36:instanceof      #101 <Class CompoundButton>
	//*  17   39:ifeq            53
			((CompoundButton)view).setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (mListener)));
	//   18   42:aload_1         
	//   19   43:checkcast       #101 <Class CompoundButton>
	//   20   46:aload_0         
	//   21   47:getfield        #42  <Field CheckBoxPreference$Listener mListener>
	//   22   50:invokevirtual   #105 <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
	//   23   53:return          
	}

	private void syncViewIfAccessibilityEnabled(View view)
	{
		if(!((AccessibilityManager)getContext().getSystemService("accessibility")).isEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #119 <Method Context getContext()>
	//*   2    4:ldc1            #121 <String "accessibility">
	//*   3    6:invokevirtual   #125 <Method Object Context.getSystemService(String)>
	//*   4    9:checkcast       #127 <Class AccessibilityManager>
	//*   5   12:invokevirtual   #131 <Method boolean AccessibilityManager.isEnabled()>
	//*   6   15:ifne            19
		{
			return;
	//    7   18:return          
		} else
		{
			syncCheckboxView(view.findViewById(0x1020001));
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:ldc1            #132 <Int 0x1020001>
	//   11   23:invokevirtual   #138 <Method View View.findViewById(int)>
	//   12   26:invokespecial   #140 <Method void syncCheckboxView(View)>
			syncSummaryView(view.findViewById(0x1020010));
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:ldc1            #141 <Int 0x1020010>
	//   16   33:invokevirtual   #138 <Method View View.findViewById(int)>
	//   17   36:invokevirtual   #144 <Method void syncSummaryView(View)>
			return;
	//   18   39:return          
		}
	}

	public void onBindViewHolder(PreferenceViewHolder preferenceviewholder)
	{
		super.onBindViewHolder(preferenceviewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void TwoStatePreference.onBindViewHolder(PreferenceViewHolder)>
		syncCheckboxView(preferenceviewholder.findViewById(0x1020001));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #132 <Int 0x1020001>
	//    6    9:invokevirtual   #151 <Method View PreferenceViewHolder.findViewById(int)>
	//    7   12:invokespecial   #140 <Method void syncCheckboxView(View)>
		syncSummaryView(preferenceviewholder);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #153 <Method void syncSummaryView(PreferenceViewHolder)>
	//   11   20:return          
	}

	protected void performClick(View view)
	{
		super.performClick(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void TwoStatePreference.performClick(View)>
		syncViewIfAccessibilityEnabled(view);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #162 <Method void syncViewIfAccessibilityEnabled(View)>
	//    6   10:return          
	}

	private final Listener mListener;
}
