// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.model.Robot;
import com.irobot.home.model.RobotPreferences;
import com.irobot.home.q.b;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomTextView;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home:
//			RobotSettingsActivity

private class RobotSettingsActivity$b
	implements android.widget.istener
{

	public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
	{
		InputMethodManager inputmethodmanager = (InputMethodManager)a.getSystemService("input_method");
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RobotSettingsActivity a>
	//    2    4:ldc1            #30  <String "input_method">
	//    3    6:invokevirtual   #34  <Method Object RobotSettingsActivity.getSystemService(String)>
	//    4    9:checkcast       #36  <Class InputMethodManager>
	//    5   12:astore          4
		Robot robot = j.o(a.b);
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field RobotSettingsActivity a>
	//    8   18:getfield        #39  <Field String com.irobot.home.RobotSettingsActivity.b>
	//    9   21:invokestatic    #45  <Method Robot j.o(String)>
	//   10   24:astore          5
		if(i == 6 || keyevent.getKeyCode() == 66)
	//*  11   26:iload_2         
	//*  12   27:bipush          6
	//*  13   29:icmpeq          41
	//*  14   32:aload_3         
	//*  15   33:invokevirtual   #51  <Method int KeyEvent.getKeyCode()>
	//*  16   36:bipush          66
	//*  17   38:icmpne          221
		{
			textview = ((TextView) (textview.getText().toString()));
	//   18   41:aload_1         
	//   19   42:invokevirtual   #57  <Method CharSequence TextView.getText()>
	//   20   45:invokeinterface #63  <Method String CharSequence.toString()>
	//   21   50:astore_1        
			if(!((String) (textview)).isEmpty() && !Robot.f(((String) (textview))))
	//*  22   51:aload_1         
	//*  23   52:invokevirtual   #69  <Method boolean String.isEmpty()>
	//*  24   55:ifne            102
	//*  25   58:aload_1         
	//*  26   59:invokestatic    #75  <Method boolean Robot.f(String)>
	//*  27   62:ifne            102
			{
				(new android.app.AlertDialog.Builder(((android.content.Context) (a)))).setMessage(0x7f0f0405).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(inputmethodmanager) {

					public void onClick(DialogInterface dialoginterface, int k)
					{
						b.a.f.requestFocus();
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field RobotSettingsActivity$b b>
					//    2    4:getfield        #32  <Field RobotSettingsActivity RobotSettingsActivity$b.a>
					//    3    7:getfield        #36  <Field EditText RobotSettingsActivity.f>
					//    4   10:invokevirtual   #42  <Method boolean EditText.requestFocus()>
					//    5   13:pop             
						a.showSoftInput(((android.view.View) (b.a.f)), 1);
					//    6   14:aload_0         
					//    7   15:getfield        #23  <Field InputMethodManager a>
					//    8   18:aload_0         
					//    9   19:getfield        #21  <Field RobotSettingsActivity$b b>
					//   10   22:getfield        #32  <Field RobotSettingsActivity RobotSettingsActivity$b.a>
					//   11   25:getfield        #36  <Field EditText RobotSettingsActivity.f>
					//   12   28:iconst_1        
					//   13   29:invokevirtual   #48  <Method boolean InputMethodManager.showSoftInput(android.view.View, int)>
					//   14   32:pop             
					//   15   33:return          
					}

					final InputMethodManager a;
					final RobotSettingsActivity.b b;

			
			{
				b = RobotSettingsActivity.b.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field RobotSettingsActivity$b b>
				a = inputmethodmanager;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field InputMethodManager a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
				}
).show();
	//   28   65:new             #77  <Class android.app.AlertDialog$Builder>
	//   29   68:dup             
	//   30   69:aload_0         
	//   31   70:getfield        #17  <Field RobotSettingsActivity a>
	//   32   73:invokespecial   #80  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   33   76:ldc1            #81  <Int 0x7f0f0405>
	//   34   78:invokevirtual   #85  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   35   81:ldc1            #86  <Int 0x7f0f05bb>
	//   36   83:new             #11  <Class RobotSettingsActivity$b$1>
	//   37   86:dup             
	//   38   87:aload_0         
	//   39   88:aload           4
	//   40   90:invokespecial   #89  <Method void RobotSettingsActivity$b$1(RobotSettingsActivity$b, InputMethodManager)>
	//   41   93:invokevirtual   #93  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   42   96:invokevirtual   #97  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   43   99:pop             
				return false;
	//   44  100:iconst_0        
	//   45  101:ireturn         
			}
			if(!((String) (textview)).isEmpty() && !((String) (textview)).equals(((Object) (robot.i()))))
	//*  46  102:aload_1         
	//*  47  103:invokevirtual   #69  <Method boolean String.isEmpty()>
	//*  48  106:ifne            221
	//*  49  109:aload_1         
	//*  50  110:aload           5
	//*  51  112:invokevirtual   #100 <Method String Robot.i()>
	//*  52  115:invokevirtual   #104 <Method boolean String.equals(Object)>
	//*  53  118:ifne            221
			{
				RobotSettingsActivity.a(a).a(((String) (textview)));
	//   54  121:aload_0         
	//   55  122:getfield        #17  <Field RobotSettingsActivity a>
	//   56  125:invokestatic    #107 <Method RobotPreferences RobotSettingsActivity.a(RobotSettingsActivity)>
	//   57  128:aload_1         
	//   58  129:invokevirtual   #112 <Method void RobotPreferences.a(String)>
				keyevent = ((KeyEvent) (robot.s()));
	//   59  132:aload           5
	//   60  134:invokevirtual   #116 <Method AssetId Robot.s()>
	//   61  137:astore_3        
				keyevent = ((KeyEvent) (Assembler.getInstance().getPMIApplicationService().getAsset(((AssetId) (keyevent)).getId())));
	//   62  138:invokestatic    #122 <Method Assembler Assembler.getInstance()>
	//   63  141:invokevirtual   #126 <Method PMIApplicationService Assembler.getPMIApplicationService()>
	//   64  144:aload_3         
	//   65  145:invokevirtual   #131 <Method String AssetId.getId()>
	//   66  148:invokevirtual   #137 <Method PMIAssetService PMIApplicationService.getAsset(String)>
	//   67  151:astore_3        
				if(keyevent != null)
	//*  68  152:aload_3         
	//*  69  153:ifnull          196
					try
					{
						JSONObject jsonobject = new JSONObject();
	//   70  156:new             #139 <Class JSONObject>
	//   71  159:dup             
	//   72  160:invokespecial   #140 <Method void JSONObject()>
	//   73  163:astore          5
						jsonobject.put("name", ((Object) (textview)));
	//   74  165:aload           5
	//   75  167:ldc1            #142 <String "name">
	//   76  169:aload_1         
	//   77  170:invokevirtual   #146 <Method JSONObject JSONObject.put(String, Object)>
	//   78  173:pop             
						((PMIAssetService) (keyevent)).postStateCommand("SetName", jsonobject.toString());
	//   79  174:aload_3         
	//   80  175:ldc1            #148 <String "SetName">
	//   81  177:aload           5
	//   82  179:invokevirtual   #149 <Method String JSONObject.toString()>
	//   83  182:invokevirtual   #155 <Method void PMIAssetService.postStateCommand(String, String)>
					}
	//*  84  185:goto            213
					// Misplaced declaration of an exception variable
					catch(KeyEvent keyevent)
	//*  85  188:astore_3        
					{
						((JSONException) (keyevent)).printStackTrace();
	//   86  189:aload_3         
	//   87  190:invokevirtual   #158 <Method void JSONException.printStackTrace()>
					}
				else
	//*  88  193:goto            213
					a.r.a(RobotSettingsActivity.a(a));
	//   89  196:aload_0         
	//   90  197:getfield        #17  <Field RobotSettingsActivity a>
	//   91  200:getfield        #162 <Field b RobotSettingsActivity.r>
	//   92  203:aload_0         
	//   93  204:getfield        #17  <Field RobotSettingsActivity a>
	//   94  207:invokestatic    #107 <Method RobotPreferences RobotSettingsActivity.a(RobotSettingsActivity)>
	//   95  210:invokevirtual   #167 <Method void b.a(RobotPreferences)>
				a.b(((String) (textview)));
	//   96  213:aload_0         
	//   97  214:getfield        #17  <Field RobotSettingsActivity a>
	//   98  217:aload_1         
	//   99  218:invokevirtual   #169 <Method void com.irobot.home.RobotSettingsActivity.b(String)>
			}
		}
		a.f.setVisibility(8);
	//  100  221:aload_0         
	//  101  222:getfield        #17  <Field RobotSettingsActivity a>
	//  102  225:getfield        #172 <Field EditText RobotSettingsActivity.f>
	//  103  228:bipush          8
	//  104  230:invokevirtual   #178 <Method void EditText.setVisibility(int)>
		a.c.setVisibility(0);
	//  105  233:aload_0         
	//  106  234:getfield        #17  <Field RobotSettingsActivity a>
	//  107  237:getfield        #182 <Field CustomTextView RobotSettingsActivity.c>
	//  108  240:iconst_0        
	//  109  241:invokevirtual   #185 <Method void CustomTextView.setVisibility(int)>
		inputmethodmanager.hideSoftInputFromWindow(a.f.getWindowToken(), 0);
	//  110  244:aload           4
	//  111  246:aload_0         
	//  112  247:getfield        #17  <Field RobotSettingsActivity a>
	//  113  250:getfield        #172 <Field EditText RobotSettingsActivity.f>
	//  114  253:invokevirtual   #189 <Method android.os.IBinder EditText.getWindowToken()>
	//  115  256:iconst_0        
	//  116  257:invokevirtual   #193 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//  117  260:pop             
		return false;
	//  118  261:iconst_0        
	//  119  262:ireturn         
	}

	final RobotSettingsActivity a;

	private RobotSettingsActivity$b(RobotSettingsActivity robotsettingsactivity)
	{
		a = robotsettingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RobotSettingsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	RobotSettingsActivity$b(RobotSettingsActivity robotsettingsactivity, RobotSettingsActivity$1 robotsettingsactivity$1)
	{
		this(robotsettingsactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void RobotSettingsActivity$b(RobotSettingsActivity)>
	//    3    5:return          
	}
}
