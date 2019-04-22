// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.App;

public final class BonusPickerTab extends Enum
	implements com.ibotta.android.view.common.TabSelectorView.TabOption
{

	private BonusPickerTab(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void Enum(String, int)>
		nameResId = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #36  <Field int nameResId>
	//    7   11:return          
	}

	public static BonusPickerTab valueOf(String s)
	{
		return (BonusPickerTab)Enum.valueOf(com/ibotta/android/mvp/ui/activity/bonus/BonusPickerTab, s);
	//    0    0:ldc1            #2   <Class BonusPickerTab>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class BonusPickerTab>
	//    4    9:areturn         
	}

	public static BonusPickerTab[] values()
	{
		return (BonusPickerTab[])((BonusPickerTab []) ($VALUES)).clone();
	//    0    0:getstatic       #30  <Field BonusPickerTab[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.ibotta.android.mvp.ui.activity.bonus.BonusPickerTab_3B_.clone()>
	//    2    6:checkcast       #46  <Class BonusPickerTab[]>
	//    3    9:areturn         
	}

	public String getName()
	{
		return App.instance().getString(nameResId);
	//    0    0:invokestatic    #58  <Method App App.instance()>
	//    1    3:aload_0         
	//    2    4:getfield        #36  <Field int nameResId>
	//    3    7:invokevirtual   #62  <Method String App.getString(int)>
	//    4   10:areturn         
	}

	private static final BonusPickerTab $VALUES[];
	public static final BonusPickerTab AVAILABLE;
	public static final BonusPickerTab COMPLETED;
	private final int nameResId;

	static 
	{
		AVAILABLE = new BonusPickerTab("AVAILABLE", 0, 0x7f1100b4);
	//    0    0:new             #2   <Class BonusPickerTab>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "AVAILABLE">
	//    3    6:iconst_0        
	//    4    7:ldc1            #18  <Int 0x7f1100b4>
	//    5    9:invokespecial   #22  <Method void BonusPickerTab(String, int, int)>
	//    6   12:putstatic       #24  <Field BonusPickerTab AVAILABLE>
		COMPLETED = new BonusPickerTab("COMPLETED", 1, 0x7f1100b5);
	//    7   15:new             #2   <Class BonusPickerTab>
	//    8   18:dup             
	//    9   19:ldc1            #25  <String "COMPLETED">
	//   10   21:iconst_1        
	//   11   22:ldc1            #26  <Int 0x7f1100b5>
	//   12   24:invokespecial   #22  <Method void BonusPickerTab(String, int, int)>
	//   13   27:putstatic       #28  <Field BonusPickerTab COMPLETED>
		$VALUES = (new BonusPickerTab[] {
			AVAILABLE, COMPLETED
		});
	//   14   30:iconst_2        
	//   15   31:anewarray       BonusPickerTab[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:getstatic       #24  <Field BonusPickerTab AVAILABLE>
	//   19   39:aastore         
	//   20   40:dup             
	//   21   41:iconst_1        
	//   22   42:getstatic       #28  <Field BonusPickerTab COMPLETED>
	//   23   45:aastore         
	//   24   46:putstatic       #30  <Field BonusPickerTab[] $VALUES>
	//*  25   49:return          
	}
}
