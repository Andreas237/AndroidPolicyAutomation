// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.model.Robot;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home:
//			BraavaPrefsTableActivity

class BraavaPrefsTableActivity$2
	implements android.widget.ener
{

	public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
	{
		if(i == 6 || keyevent.getKeyCode() == 66)
	//*   0    0:iload_2         
	//*   1    1:bipush          6
	//*   2    3:icmpeq          15
	//*   3    6:aload_3         
	//*   4    7:invokevirtual   #32  <Method int KeyEvent.getKeyCode()>
	//*   5   10:bipush          66
	//*   6   12:icmpne          144
		{
			textview = ((TextView) (textview.getText().toString()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #38  <Method CharSequence TextView.getText()>
	//    9   19:invokeinterface #44  <Method String CharSequence.toString()>
	//   10   24:astore_1        
			if(!((String) (textview)).isEmpty() && !Robot.f(((String) (textview))))
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #50  <Method boolean String.isEmpty()>
	//*  13   29:ifne            61
	//*  14   32:aload_1         
	//*  15   33:invokestatic    #55  <Method boolean Robot.f(String)>
	//*  16   36:ifne            61
			{
				com.irobot.home.BraavaPrefsTableActivity.a(b, b.getString(0x7f0f0405), a);
	//   17   39:aload_0         
	//   18   40:getfield        #19  <Field BraavaPrefsTableActivity b>
	//   19   43:aload_0         
	//   20   44:getfield        #19  <Field BraavaPrefsTableActivity b>
	//   21   47:ldc1            #56  <Int 0x7f0f0405>
	//   22   49:invokevirtual   #60  <Method String BraavaPrefsTableActivity.getString(int)>
	//   23   52:aload_0         
	//   24   53:getfield        #21  <Field InputMethodManager a>
	//   25   56:invokestatic    #63  <Method void com.irobot.home.BraavaPrefsTableActivity.a(BraavaPrefsTableActivity, String, InputMethodManager)>
				return false;
	//   26   59:iconst_0        
	//   27   60:ireturn         
			}
			keyevent = ((KeyEvent) (com.irobot.home.BraavaPrefsTableActivity.a(b).getServiceData().getStringSetting(SettingType.Name)));
	//   28   61:aload_0         
	//   29   62:getfield        #19  <Field BraavaPrefsTableActivity b>
	//   30   65:invokestatic    #66  <Method SettingsSubsystem com.irobot.home.BraavaPrefsTableActivity.a(BraavaPrefsTableActivity)>
	//   31   68:invokevirtual   #72  <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//   32   71:getstatic       #78  <Field SettingType SettingType.Name>
	//   33   74:invokevirtual   #84  <Method String SettingsUIServiceData.getStringSetting(SettingType)>
	//   34   77:astore_3        
			if(!((String) (textview)).isEmpty() && !((String) (textview)).equals(((Object) (keyevent))))
	//*  35   78:aload_1         
	//*  36   79:invokevirtual   #50  <Method boolean String.isEmpty()>
	//*  37   82:ifne            144
	//*  38   85:aload_1         
	//*  39   86:aload_3         
	//*  40   87:invokevirtual   #88  <Method boolean String.equals(Object)>
	//*  41   90:ifne            144
			{
				j.a(b.a).a().setName(((String) (textview)));
	//   42   93:aload_0         
	//   43   94:getfield        #19  <Field BraavaPrefsTableActivity b>
	//   44   97:getfield        #91  <Field String com.irobot.home.BraavaPrefsTableActivity.a>
	//   45  100:invokestatic    #96  <Method a j.a(String)>
	//   46  103:invokevirtual   #101 <Method AssetInfo a.a()>
	//   47  106:aload_1         
	//   48  107:invokevirtual   #107 <Method void AssetInfo.setName(String)>
				keyevent = ((KeyEvent) (SettingsUIServiceData.create()));
	//   49  110:invokestatic    #110 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//   50  113:astore_3        
				((SettingsUIServiceData) (keyevent)).setStringSetting(SettingType.Name, ((String) (textview)));
	//   51  114:aload_3         
	//   52  115:getstatic       #78  <Field SettingType SettingType.Name>
	//   53  118:aload_1         
	//   54  119:invokevirtual   #114 <Method void SettingsUIServiceData.setStringSetting(SettingType, String)>
				com.irobot.home.BraavaPrefsTableActivity.a(b).sendCommand(SettingsUIServiceCommand.UpdateSetting, ((SettingsUIServiceData) (keyevent)));
	//   55  122:aload_0         
	//   56  123:getfield        #19  <Field BraavaPrefsTableActivity b>
	//   57  126:invokestatic    #66  <Method SettingsSubsystem com.irobot.home.BraavaPrefsTableActivity.a(BraavaPrefsTableActivity)>
	//   58  129:getstatic       #120 <Field SettingsUIServiceCommand SettingsUIServiceCommand.UpdateSetting>
	//   59  132:aload_3         
	//   60  133:invokevirtual   #124 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
				b.a(((String) (textview)));
	//   61  136:aload_0         
	//   62  137:getfield        #19  <Field BraavaPrefsTableActivity b>
	//   63  140:aload_1         
	//   64  141:invokevirtual   #126 <Method void com.irobot.home.BraavaPrefsTableActivity.a(String)>
			}
		}
		b.d.setVisibility(8);
	//   65  144:aload_0         
	//   66  145:getfield        #19  <Field BraavaPrefsTableActivity b>
	//   67  148:getfield        #130 <Field EditText BraavaPrefsTableActivity.d>
	//   68  151:bipush          8
	//   69  153:invokevirtual   #136 <Method void EditText.setVisibility(int)>
		b.b.setVisibility(0);
	//   70  156:aload_0         
	//   71  157:getfield        #19  <Field BraavaPrefsTableActivity b>
	//   72  160:getfield        #139 <Field CustomTextView BraavaPrefsTableActivity.b>
	//   73  163:iconst_0        
	//   74  164:invokevirtual   #142 <Method void CustomTextView.setVisibility(int)>
		a.hideSoftInputFromWindow(b.d.getWindowToken(), 0);
	//   75  167:aload_0         
	//   76  168:getfield        #21  <Field InputMethodManager a>
	//   77  171:aload_0         
	//   78  172:getfield        #19  <Field BraavaPrefsTableActivity b>
	//   79  175:getfield        #130 <Field EditText BraavaPrefsTableActivity.d>
	//   80  178:invokevirtual   #146 <Method android.os.IBinder EditText.getWindowToken()>
	//   81  181:iconst_0        
	//   82  182:invokevirtual   #152 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   83  185:pop             
		return false;
	//   84  186:iconst_0        
	//   85  187:ireturn         
	}

	final InputMethodManager a;
	final BraavaPrefsTableActivity b;

	BraavaPrefsTableActivity$2(BraavaPrefsTableActivity braavaprefstableactivity, InputMethodManager inputmethodmanager)
	{
		b = braavaprefstableactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BraavaPrefsTableActivity b>
		a = inputmethodmanager;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field InputMethodManager a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
