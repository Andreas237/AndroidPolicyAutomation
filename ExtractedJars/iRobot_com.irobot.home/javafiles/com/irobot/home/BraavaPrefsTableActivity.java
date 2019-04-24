// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.*;
import android.content.res.Resources;
import android.support.v7.widget.SwitchCompat;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.model.Robot;
import com.irobot.home.model.a;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomTextView;
import java.util.HashMap;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, BraavaAboutRobotActivity_, BraavaPadSettingsActivity_, RemoveButtonActivity_, 
//			ResetTableViewActivity_

public class BraavaPrefsTableActivity extends BaseFragmentActivity
	implements android.widget.CompoundButton.OnCheckedChangeListener
{

	public BraavaPrefsTableActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	static SettingsSubsystem a(BraavaPrefsTableActivity braavaprefstableactivity)
	{
		return braavaprefstableactivity.n;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field SettingsSubsystem n>
	//    2    4:areturn         
	}

	static void a(BraavaPrefsTableActivity braavaprefstableactivity, String s, InputMethodManager inputmethodmanager)
	{
		braavaprefstableactivity.a(s, inputmethodmanager);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #48  <Method void a(String, InputMethodManager)>
	//    4    6:return          
	}

	private void a(String s, InputMethodManager inputmethodmanager)
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(((CharSequence) (s))).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener(inputmethodmanager) {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				b.d.requestFocus();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field BraavaPrefsTableActivity b>
			//    2    4:getfield        #30  <Field EditText BraavaPrefsTableActivity.d>
			//    3    7:invokevirtual   #36  <Method boolean EditText.requestFocus()>
			//    4   10:pop             
				a.showSoftInput(((View) (b.d)), 1);
			//    5   11:aload_0         
			//    6   12:getfield        #20  <Field InputMethodManager a>
			//    7   15:aload_0         
			//    8   16:getfield        #18  <Field BraavaPrefsTableActivity b>
			//    9   19:getfield        #30  <Field EditText BraavaPrefsTableActivity.d>
			//   10   22:iconst_1        
			//   11   23:invokevirtual   #42  <Method boolean InputMethodManager.showSoftInput(View, int)>
			//   12   26:pop             
			//   13   27:return          
			}

			final InputMethodManager a;
			final BraavaPrefsTableActivity b;

			
			{
				b = BraavaPrefsTableActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field BraavaPrefsTableActivity b>
				a = inputmethodmanager;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field InputMethodManager a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
).show();
	//    0    0:new             #50  <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #57  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//    6   12:ldc1            #58  <Int 0x7f0f05bb>
	//    7   14:new             #12  <Class BraavaPrefsTableActivity$3>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:invokespecial   #61  <Method void BraavaPrefsTableActivity$3(BraavaPrefsTableActivity, InputMethodManager)>
	//   12   23:invokevirtual   #65  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   13   26:invokevirtual   #69  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   14   29:pop             
	//   15   30:return          
	}

	protected void a(String s)
	{
		b(0x7f0f07f8);
	//    0    0:aload_0         
	//    1    1:ldc1            #74  <Int 0x7f0f07f8>
	//    2    3:invokevirtual   #77  <Method void b(int)>
		m = com.irobot.home.util.j.a(k, getString(0x7f0f048f), ((android.widget.CompoundButton.OnCheckedChangeListener) (this)));
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #79  <Field RelativeLayout k>
	//    6   11:aload_0         
	//    7   12:ldc1            #80  <Int 0x7f0f048f>
	//    8   14:invokevirtual   #84  <Method String getString(int)>
	//    9   17:aload_0         
	//   10   18:invokestatic    #89  <Method SwitchCompat j.a(RelativeLayout, String, android.widget.CompoundButton$OnCheckedChangeListener)>
	//   11   21:putfield        #91  <Field SwitchCompat m>
		m.setChecked(i.f);
	//   12   24:aload_0         
	//   13   25:getfield        #91  <Field SwitchCompat m>
	//   14   28:getstatic       #96  <Field boolean i.f>
	//   15   31:invokevirtual   #102 <Method void SwitchCompat.setChecked(boolean)>
		b.setText(((CharSequence) (s)));
	//   16   34:aload_0         
	//   17   35:getfield        #104 <Field CustomTextView b>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #110 <Method void CustomTextView.setText(CharSequence)>
		((Button)h).setText(((CharSequence) (getString(0x7f0f074a, new Object[] {
			s
		}))));
	//   20   42:aload_0         
	//   21   43:getfield        #112 <Field View h>
	//   22   46:checkcast       #114 <Class Button>
	//   23   49:aload_0         
	//   24   50:ldc1            #115 <Int 0x7f0f074a>
	//   25   52:iconst_1        
	//   26   53:anewarray       Object[]
	//   27   56:dup             
	//   28   57:iconst_0        
	//   29   58:aload_1         
	//   30   59:aastore         
	//   31   60:invokevirtual   #120 <Method String getString(int, Object[])>
	//   32   63:invokevirtual   #121 <Method void Button.setText(CharSequence)>
		((Button)i).setText(((CharSequence) (getString(0x7f0f075a, new Object[] {
			s
		}))));
	//   33   66:aload_0         
	//   34   67:getfield        #123 <Field View i>
	//   35   70:checkcast       #114 <Class Button>
	//   36   73:aload_0         
	//   37   74:ldc1            #124 <Int 0x7f0f075a>
	//   38   76:iconst_1        
	//   39   77:anewarray       Object[]
	//   40   80:dup             
	//   41   81:iconst_0        
	//   42   82:aload_1         
	//   43   83:aastore         
	//   44   84:invokevirtual   #120 <Method String getString(int, Object[])>
	//   45   87:invokevirtual   #121 <Method void Button.setText(CharSequence)>
		((Button)j).setText(((CharSequence) (getString(0x7f0f0026, new Object[] {
			s
		}))));
	//   46   90:aload_0         
	//   47   91:getfield        #126 <Field View j>
	//   48   94:checkcast       #114 <Class Button>
	//   49   97:aload_0         
	//   50   98:ldc1            #127 <Int 0x7f0f0026>
	//   51  100:iconst_1        
	//   52  101:anewarray       Object[]
	//   53  104:dup             
	//   54  105:iconst_0        
	//   55  106:aload_1         
	//   56  107:aastore         
	//   57  108:invokevirtual   #120 <Method String getString(int, Object[])>
	//   58  111:invokevirtual   #121 <Method void Button.setText(CharSequence)>
	//   59  114:return          
	}

	protected void a(boolean flag)
	{
		Object obj = ((Object) (f));
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field View f>
	//    2    4:astore_3        
		int i1;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			i1 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			i1 = 4;
	//    8   14:iconst_4        
	//    9   15:istore_2        
		((View) (obj)).setVisibility(i1);
	//   10   16:aload_3         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #135 <Method void View.setVisibility(int)>
		TextView textview = (TextView)g;
	//   13   21:aload_0         
	//   14   22:getfield        #137 <Field View g>
	//   15   25:checkcast       #139 <Class TextView>
	//   16   28:astore          4
		if(flag)
	//*  17   30:iload_1         
	//*  18   31:ifeq            51
		{
			obj = ((Object) (getResources()));
	//   19   34:aload_0         
	//   20   35:invokevirtual   #143 <Method Resources getResources()>
	//   21   38:astore_3        
			i1 = 0x7f06006d;
	//   22   39:ldc1            #144 <Int 0x7f06006d>
	//   23   41:istore_2        
		} else
	//*  24   42:aload_3         
	//*  25   43:iload_2         
	//*  26   44:invokevirtual   #150 <Method int Resources.getColor(int)>
	//*  27   47:istore_2        
	//*  28   48:goto            62
		{
			obj = ((Object) (getResources()));
	//   29   51:aload_0         
	//   30   52:invokevirtual   #143 <Method Resources getResources()>
	//   31   55:astore_3        
			i1 = 0x7f060076;
	//   32   56:ldc1            #151 <Int 0x7f060076>
	//   33   58:istore_2        
		}
		i1 = ((Resources) (obj)).getColor(i1);
	//*  34   59:goto            42
		textview.setTextColor(i1);
	//   35   62:aload           4
	//   36   64:iload_2         
	//   37   65:invokevirtual   #154 <Method void TextView.setTextColor(int)>
		g.setEnabled(flag ^ true);
	//   38   68:aload_0         
	//   39   69:getfield        #137 <Field View g>
	//   40   72:iload_1         
	//   41   73:iconst_1        
	//   42   74:ixor            
	//   43   75:invokevirtual   #157 <Method void View.setEnabled(boolean)>
	//   44   78:return          
	}

	protected void b(boolean flag)
	{
		int i1 = getResources().getColor(0x7f060076);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method Resources getResources()>
	//    2    4:ldc1            #151 <Int 0x7f060076>
	//    3    6:invokevirtual   #150 <Method int Resources.getColor(int)>
	//    4    9:istore_2        
		int j1 = getResources().getColor(0x7f06006d);
	//    5   10:aload_0         
	//    6   11:invokevirtual   #143 <Method Resources getResources()>
	//    7   14:ldc1            #144 <Int 0x7f06006d>
	//    8   16:invokevirtual   #150 <Method int Resources.getColor(int)>
	//    9   19:istore_3        
		Object obj = ((Object) (c));
	//   10   20:aload_0         
	//   11   21:getfield        #159 <Field CustomTextView c>
	//   12   24:astore          5
		int k1;
		if(flag)
	//*  13   26:iload_1         
	//*  14   27:ifeq            36
			k1 = i1;
	//   15   30:iload_2         
	//   16   31:istore          4
		else
	//*  17   33:goto            39
			k1 = j1;
	//   18   36:iload_3         
	//   19   37:istore          4
		((CustomTextView) (obj)).setTextColor(k1);
	//   20   39:aload           5
	//   21   41:iload           4
	//   22   43:invokevirtual   #160 <Method void CustomTextView.setTextColor(int)>
		obj = ((Object) (b));
	//   23   46:aload_0         
	//   24   47:getfield        #104 <Field CustomTextView b>
	//   25   50:astore          5
		if(flag)
	//*  26   52:iload_1         
	//*  27   53:ifeq            62
			k1 = i1;
	//   28   56:iload_2         
	//   29   57:istore          4
		else
	//*  30   59:goto            65
			k1 = j1;
	//   31   62:iload_3         
	//   32   63:istore          4
		((CustomTextView) (obj)).setTextColor(k1);
	//   33   65:aload           5
	//   34   67:iload           4
	//   35   69:invokevirtual   #160 <Method void CustomTextView.setTextColor(int)>
		obj = ((Object) (d));
	//   36   72:aload_0         
	//   37   73:getfield        #162 <Field EditText d>
	//   38   76:astore          5
		if(flag)
	//*  39   78:iload_1         
	//*  40   79:ifeq            88
			k1 = i1;
	//   41   82:iload_2         
	//   42   83:istore          4
		else
	//*  43   85:goto            91
			k1 = j1;
	//   44   88:iload_3         
	//   45   89:istore          4
		((EditText) (obj)).setTextColor(k1);
	//   46   91:aload           5
	//   47   93:iload           4
	//   48   95:invokevirtual   #165 <Method void EditText.setTextColor(int)>
		e.setEnabled(flag);
	//   49   98:aload_0         
	//   50   99:getfield        #167 <Field View e>
	//   51  102:iload_1         
	//   52  103:invokevirtual   #157 <Method void View.setEnabled(boolean)>
		obj = ((Object) ((Button)i));
	//   53  106:aload_0         
	//   54  107:getfield        #123 <Field View i>
	//   55  110:checkcast       #114 <Class Button>
	//   56  113:astore          5
		if(!flag)
	//*  57  115:iload_1         
	//*  58  116:ifeq            122
	//*  59  119:goto            124
			i1 = j1;
	//   60  122:iload_3         
	//   61  123:istore_2        
		((Button) (obj)).setTextColor(i1);
	//   62  124:aload           5
	//   63  126:iload_2         
	//   64  127:invokevirtual   #168 <Method void Button.setTextColor(int)>
		i.setEnabled(flag);
	//   65  130:aload_0         
	//   66  131:getfield        #123 <Field View i>
	//   67  134:iload_1         
	//   68  135:invokevirtual   #157 <Method void View.setEnabled(boolean)>
	//   69  138:return          
	}

	void e()
	{
		n = Assembler.getInstance().getSettingsSubsystem(AssetId.assetIdForString(a));
	//    0    0:aload_0         
	//    1    1:invokestatic    #174 <Method Assembler Assembler.getInstance()>
	//    2    4:aload_0         
	//    3    5:getfield        #176 <Field String a>
	//    4    8:invokestatic    #182 <Method AssetId AssetId.assetIdForString(String)>
	//    5   11:invokevirtual   #186 <Method SettingsSubsystem Assembler.getSettingsSubsystem(AssetId)>
	//    6   14:putfield        #44  <Field SettingsSubsystem n>
		a(n.getServiceData().getStringSetting(SettingType.Name));
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:getfield        #44  <Field SettingsSubsystem n>
	//   10   22:invokevirtual   #192 <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//   11   25:getstatic       #198 <Field SettingType SettingType.Name>
	//   12   28:invokevirtual   #204 <Method String SettingsUIServiceData.getStringSetting(SettingType)>
	//   13   31:invokevirtual   #206 <Method void a(String)>
		((TextView)g).setText(0x7f0f013e);
	//   14   34:aload_0         
	//   15   35:getfield        #137 <Field View g>
	//   16   38:checkcast       #139 <Class TextView>
	//   17   41:ldc1            #207 <Int 0x7f0f013e>
	//   18   43:invokevirtual   #209 <Method void TextView.setText(int)>
		a(true);
	//   19   46:aload_0         
	//   20   47:iconst_1        
	//   21   48:invokevirtual   #211 <Method void a(boolean)>
		if(n.getServiceData().getWetnessLevels().isEmpty())
	//*  22   51:aload_0         
	//*  23   52:getfield        #44  <Field SettingsSubsystem n>
	//*  24   55:invokevirtual   #192 <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//*  25   58:invokevirtual   #215 <Method HashMap SettingsUIServiceData.getWetnessLevels()>
	//*  26   61:invokevirtual   #221 <Method boolean HashMap.isEmpty()>
	//*  27   64:ifeq            84
		{
			f.setVisibility(0);
	//   28   67:aload_0         
	//   29   68:getfield        #130 <Field View f>
	//   30   71:iconst_0        
	//   31   72:invokevirtual   #135 <Method void View.setVisibility(int)>
			f.setEnabled(true);
	//   32   75:aload_0         
	//   33   76:getfield        #130 <Field View f>
	//   34   79:iconst_1        
	//   35   80:invokevirtual   #157 <Method void View.setEnabled(boolean)>
			return;
	//   36   83:return          
		} else
		{
			a(false);
	//   37   84:aload_0         
	//   38   85:iconst_0        
	//   39   86:invokevirtual   #211 <Method void a(boolean)>
			return;
	//   40   89:return          
		}
	}

	public void f()
	{
		b.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field CustomTextView b>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #222 <Method void CustomTextView.setVisibility(int)>
		d.setVisibility(0);
	//    4    9:aload_0         
	//    5   10:getfield        #162 <Field EditText d>
	//    6   13:iconst_0        
	//    7   14:invokevirtual   #223 <Method void EditText.setVisibility(int)>
		d.setHint(b.getText());
	//    8   17:aload_0         
	//    9   18:getfield        #162 <Field EditText d>
	//   10   21:aload_0         
	//   11   22:getfield        #104 <Field CustomTextView b>
	//   12   25:invokevirtual   #227 <Method CharSequence CustomTextView.getText()>
	//   13   28:invokevirtual   #230 <Method void EditText.setHint(CharSequence)>
		d.requestFocus();
	//   14   31:aload_0         
	//   15   32:getfield        #162 <Field EditText d>
	//   16   35:invokevirtual   #233 <Method boolean EditText.requestFocus()>
	//   17   38:pop             
		d.setText("");
	//   18   39:aload_0         
	//   19   40:getfield        #162 <Field EditText d>
	//   20   43:ldc1            #235 <String "">
	//   21   45:invokevirtual   #236 <Method void EditText.setText(CharSequence)>
		InputMethodManager inputmethodmanager = (InputMethodManager)getSystemService("input_method");
	//   22   48:aload_0         
	//   23   49:ldc1            #238 <String "input_method">
	//   24   51:invokevirtual   #242 <Method Object getSystemService(String)>
	//   25   54:checkcast       #244 <Class InputMethodManager>
	//   26   57:astore_1        
		d.post(new Runnable(inputmethodmanager) {

			public void run()
			{
				a.showSoftInput(((View) (b.d)), 1);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field InputMethodManager a>
			//    2    4:aload_0         
			//    3    5:getfield        #19  <Field BraavaPrefsTableActivity b>
			//    4    8:getfield        #29  <Field EditText BraavaPrefsTableActivity.d>
			//    5   11:iconst_1        
			//    6   12:invokevirtual   #35  <Method boolean InputMethodManager.showSoftInput(View, int)>
			//    7   15:pop             
			//    8   16:return          
			}

			final InputMethodManager a;
			final BraavaPrefsTableActivity b;

			
			{
				b = BraavaPrefsTableActivity.this;
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
);
	//   27   58:aload_0         
	//   28   59:getfield        #162 <Field EditText d>
	//   29   62:new             #8   <Class BraavaPrefsTableActivity$1>
	//   30   65:dup             
	//   31   66:aload_0         
	//   32   67:aload_1         
	//   33   68:invokespecial   #245 <Method void BraavaPrefsTableActivity$1(BraavaPrefsTableActivity, InputMethodManager)>
	//   34   71:invokevirtual   #249 <Method boolean EditText.post(Runnable)>
	//   35   74:pop             
		d.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener(inputmethodmanager) {

			public boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
			{
				if(i1 == 6 || keyevent.getKeyCode() == 66)
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
						com.irobot.home.util.j.a(b.a).a().setName(((String) (textview)));
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

			
			{
				b = BraavaPrefsTableActivity.this;
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
);
	//   36   75:aload_0         
	//   37   76:getfield        #162 <Field EditText d>
	//   38   79:new             #10  <Class BraavaPrefsTableActivity$2>
	//   39   82:dup             
	//   40   83:aload_0         
	//   41   84:aload_1         
	//   42   85:invokespecial   #250 <Method void BraavaPrefsTableActivity$2(BraavaPrefsTableActivity, InputMethodManager)>
	//   43   88:invokevirtual   #254 <Method void EditText.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
		d.setFilters(new InputFilter[] {
			new android.text.InputFilter.LengthFilter(16)
		});
	//   44   91:aload_0         
	//   45   92:getfield        #162 <Field EditText d>
	//   46   95:iconst_1        
	//   47   96:anewarray       InputFilter[]
	//   48   99:dup             
	//   49  100:iconst_0        
	//   50  101:new             #258 <Class android.text.InputFilter$LengthFilter>
	//   51  104:dup             
	//   52  105:bipush          16
	//   53  107:invokespecial   #260 <Method void android.text.InputFilter$LengthFilter(int)>
	//   54  110:aastore         
	//   55  111:invokevirtual   #264 <Method void EditText.setFilters(InputFilter[])>
	//   56  114:return          
	}

	public void g()
	{
		com.irobot.home.BraavaAboutRobotActivity_.a(((android.content.Context) (this))).a(a).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #269 <Method BraavaAboutRobotActivity_$a com.irobot.home.BraavaAboutRobotActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #176 <Field String a>
	//    4    8:invokevirtual   #274 <Method BraavaAboutRobotActivity_$a com.irobot.home.BraavaAboutRobotActivity_$a.a(String)>
	//    5   11:invokevirtual   #277 <Method org.androidannotations.api.a.e com.irobot.home.BraavaAboutRobotActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	public void h()
	{
		com.irobot.home.BraavaPadSettingsActivity_.a(((android.content.Context) (this))).a(a).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #282 <Method BraavaPadSettingsActivity_$a com.irobot.home.BraavaPadSettingsActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #176 <Field String a>
	//    4    8:invokevirtual   #287 <Method BraavaPadSettingsActivity_$a com.irobot.home.BraavaPadSettingsActivity_$a.a(String)>
	//    5   11:invokevirtual   #288 <Method org.androidannotations.api.a.e com.irobot.home.BraavaPadSettingsActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	public void i()
	{
		com.irobot.home.RemoveButtonActivity_.a(((android.content.Context) (this))).a(a).b(com.irobot.home.util.j.a(a).a().getName()).a(0);
	//    0    0:aload_0         
	//    1    1:invokestatic    #293 <Method RemoveButtonActivity_$a com.irobot.home.RemoveButtonActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #176 <Field String a>
	//    4    8:invokevirtual   #298 <Method RemoveButtonActivity_$a com.irobot.home.RemoveButtonActivity_$a.a(String)>
	//    5   11:aload_0         
	//    6   12:getfield        #176 <Field String a>
	//    7   15:invokestatic    #301 <Method a j.a(String)>
	//    8   18:invokevirtual   #306 <Method AssetInfo a.a()>
	//    9   21:invokevirtual   #312 <Method String AssetInfo.getName()>
	//   10   24:invokevirtual   #314 <Method RemoveButtonActivity_$a RemoveButtonActivity_$a.b(String)>
	//   11   27:iconst_0        
	//   12   28:invokevirtual   #317 <Method org.androidannotations.api.a.e com.irobot.home.RemoveButtonActivity_$a.a(int)>
	//   13   31:pop             
	//   14   32:return          
	}

	public void j()
	{
		com.irobot.home.ResetTableViewActivity_.a(((android.content.Context) (this))).a(a).a(1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #322 <Method ResetTableViewActivity_$a com.irobot.home.ResetTableViewActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #176 <Field String a>
	//    4    8:invokevirtual   #327 <Method ResetTableViewActivity_$a com.irobot.home.ResetTableViewActivity_$a.a(String)>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #328 <Method org.androidannotations.api.a.e com.irobot.home.ResetTableViewActivity_$a.a(int)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onActivityResult(int i1, int j1, Intent intent)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 42
	//	               1 42
		default:
			a(com.irobot.home.util.j.a(a).a().getName());
	//    2   24:aload_0         
	//    3   25:aload_0         
	//    4   26:getfield        #176 <Field String a>
	//    5   29:invokestatic    #301 <Method a j.a(String)>
	//    6   32:invokevirtual   #306 <Method AssetInfo a.a()>
	//    7   35:invokevirtual   #312 <Method String AssetInfo.getName()>
	//    8   38:invokevirtual   #206 <Method void a(String)>
			return;
	//    9   41:return          

		case 0: // '\0'
		case 1: // '\001'
			break;
		}
		if(j1 == -1)
	//*  10   42:iload_2         
	//*  11   43:iconst_m1       
	//*  12   44:icmpne          56
		{
			setResult(-1);
	//   13   47:aload_0         
	//   14   48:iconst_m1       
	//   15   49:invokevirtual   #333 <Method void setResult(int)>
			finish();
	//   16   52:aload_0         
	//   17   53:invokevirtual   #336 <Method void finish()>
		}
	//   18   56:return          
	}

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		if(compoundbutton == m)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #91  <Field SwitchCompat m>
	//*   3    5:if_acmpne       55
		{
			compoundbutton = ((CompoundButton) (getSharedPreferences("DEVEL", 0).edit()));
	//    4    8:aload_0         
	//    5    9:ldc2            #340 <String "DEVEL">
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #344 <Method SharedPreferences getSharedPreferences(String, int)>
	//    8   16:invokeinterface #350 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    9   21:astore_1        
			((android.content.SharedPreferences.Editor) (compoundbutton)).putBoolean("metric_units_key", m.isChecked());
	//   10   22:aload_1         
	//   11   23:ldc2            #352 <String "metric_units_key">
	//   12   26:aload_0         
	//   13   27:getfield        #91  <Field SwitchCompat m>
	//   14   30:invokevirtual   #355 <Method boolean SwitchCompat.isChecked()>
	//   15   33:invokeinterface #361 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   16   38:pop             
			i.f = m.isChecked();
	//   17   39:aload_0         
	//   18   40:getfield        #91  <Field SwitchCompat m>
	//   19   43:invokevirtual   #355 <Method boolean SwitchCompat.isChecked()>
	//   20   46:putstatic       #96  <Field boolean i.f>
			((android.content.SharedPreferences.Editor) (compoundbutton)).apply();
	//   21   49:aload_1         
	//   22   50:invokeinterface #364 <Method void android.content.SharedPreferences$Editor.apply()>
		}
	//   23   55:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #367 <Method void BaseFragmentActivity.onResume()>
		b(Assembler.getInstance().getNetworkUIService(AssetId.assetIdForString(a)).getServiceData().isConnectedLocally());
	//    2    4:aload_0         
	//    3    5:invokestatic    #174 <Method Assembler Assembler.getInstance()>
	//    4    8:aload_0         
	//    5    9:getfield        #176 <Field String a>
	//    6   12:invokestatic    #182 <Method AssetId AssetId.assetIdForString(String)>
	//    7   15:invokevirtual   #371 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//    8   18:invokevirtual   #376 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//    9   21:invokevirtual   #381 <Method boolean AssetNetworkUIServiceData.isConnectedLocally()>
	//   10   24:invokevirtual   #383 <Method void b(boolean)>
	//   11   27:return          
	}

	private static final String l = "BraavaPrefsTableActivity";
	String a;
	CustomTextView b;
	CustomTextView c;
	EditText d;
	View e;
	View f;
	View g;
	View h;
	View i;
	View j;
	RelativeLayout k;
	private SwitchCompat m;
	private SettingsSubsystem n;

	static 
	{
	//    0    0:return          
	}
}
