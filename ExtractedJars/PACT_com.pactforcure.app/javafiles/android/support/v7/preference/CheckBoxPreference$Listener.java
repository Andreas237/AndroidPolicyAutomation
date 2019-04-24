// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.widget.CompoundButton;

// Referenced classes of package android.support.v7.preference:
//			CheckBoxPreference

private class CheckBoxPreference$Listener
	implements android.widget.geListener
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

	private CheckBoxPreference$Listener()
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

	CheckBoxPreference$Listener(CheckBoxPreference._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void CheckBoxPreference$Listener(CheckBoxPreference)>
	//    3    5:return          
	}
}
