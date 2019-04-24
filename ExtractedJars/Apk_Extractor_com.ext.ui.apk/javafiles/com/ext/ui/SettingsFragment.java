// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.app.Activity;
import android.content.*;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.preference.*;
import android.support.v7.*;
import com.ext.file.FilePickerActivity;
import java.io.File;

// Referenced classes of package com.ext.ui:
//			SettingsActivity, MainActivity

public class SettingsFragment extends PreferenceFragment
	implements android.preference.Preference.OnPreferenceChangeListener, android.preference.Preference.OnPreferenceClickListener
{

	public SettingsFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void PreferenceFragment()>
		b = ((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context, Intent intent)
			{
				a.a();
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field SettingsFragment a>
			//    2    4:invokevirtual   #20  <Method void SettingsFragment.a()>
			//    3    7:return          
			}

			final SettingsFragment a;

			
			{
				a = SettingsFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field SettingsFragment a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//    2    4:aload_0         
	//    3    5:new             #10  <Class SettingsFragment$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #33  <Method void SettingsFragment$1(SettingsFragment)>
	//    7   13:putfield        #35  <Field BroadcastReceiver b>
	//    8   16:return          
	}

	public void a()
	{
		if(a.b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field SettingsActivity a>
	//*   2    4:invokevirtual   #43  <Method boolean SettingsActivity.b()>
	//*   3    7:ifeq            30
		{
			d.removePreference(c);
	//    4   10:aload_0         
	//    5   11:getfield        #45  <Field PreferenceScreen d>
	//    6   14:aload_0         
	//    7   15:getfield        #47  <Field Preference c>
	//    8   18:invokevirtual   #53  <Method boolean PreferenceScreen.removePreference(Preference)>
	//    9   21:pop             
			ci.a("SettingsFragment", "----- removePreference");
	//   10   22:ldc1            #55  <String "SettingsFragment">
	//   11   24:ldc1            #57  <String "----- removePreference">
	//   12   26:invokestatic    #62  <Method void ci.a(String, String)>
			return;
	//   13   29:return          
		} else
		{
			d.addPreference(c);
	//   14   30:aload_0         
	//   15   31:getfield        #45  <Field PreferenceScreen d>
	//   16   34:aload_0         
	//   17   35:getfield        #47  <Field Preference c>
	//   18   38:invokevirtual   #65  <Method boolean PreferenceScreen.addPreference(Preference)>
	//   19   41:pop             
			ci.a("SettingsFragment", "---- addPreference");
	//   20   42:ldc1            #55  <String "SettingsFragment">
	//   21   44:ldc1            #67  <String "---- addPreference">
	//   22   46:invokestatic    #62  <Method void ci.a(String, String)>
			return;
	//   23   49:return          
		}
	}

	public void onActivityResult(int l, int i1, Intent intent)
	{
		if(i1 != -1) goto _L2; else goto _L1
	//    0    0:iload_2         
	//    1    1:iconst_m1       
	//    2    2:icmpne          24
_L1:
		l;
	//    3    5:iload_1         
		JVM INSTR tableswitch 1 1: default 24
	//	               1 25;
	//    4    6:tableswitch     1 1: default 24
	//	               1 25
		   goto _L2 _L3
_L2:
		return;
	//    5   24:return          
_L3:
		if(intent.hasExtra("file_path"))
	//*   6   25:aload_3         
	//*   7   26:ldc1            #71  <String "file_path">
	//*   8   28:invokevirtual   #77  <Method boolean Intent.hasExtra(String)>
	//*   9   31:ifeq            24
		{
			intent = ((Intent) (new File(intent.getStringExtra("file_path"))));
	//   10   34:new             #79  <Class File>
	//   11   37:dup             
	//   12   38:aload_3         
	//   13   39:ldc1            #71  <String "file_path">
	//   14   41:invokevirtual   #83  <Method String Intent.getStringExtra(String)>
	//   15   44:invokespecial   #86  <Method void File(String)>
	//   16   47:astore_3        
			ci.a("SettingsFragment", (new StringBuilder()).append("received file path :").append(((File) (intent)).getAbsolutePath()).toString());
	//   17   48:ldc1            #55  <String "SettingsFragment">
	//   18   50:new             #88  <Class StringBuilder>
	//   19   53:dup             
	//   20   54:invokespecial   #89  <Method void StringBuilder()>
	//   21   57:ldc1            #91  <String "received file path :">
	//   22   59:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   23   62:aload_3         
	//   24   63:invokevirtual   #99  <Method String File.getAbsolutePath()>
	//   25   66:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   26   69:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   27   72:invokestatic    #62  <Method void ci.a(String, String)>
			e.setSummary(((CharSequence) ((new StringBuilder()).append(((File) (intent)).getAbsolutePath()).append("/").toString())));
	//   28   75:aload_0         
	//   29   76:getfield        #104 <Field Preference e>
	//   30   79:new             #88  <Class StringBuilder>
	//   31   82:dup             
	//   32   83:invokespecial   #89  <Method void StringBuilder()>
	//   33   86:aload_3         
	//   34   87:invokevirtual   #99  <Method String File.getAbsolutePath()>
	//   35   90:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   36   93:ldc1            #106 <String "/">
	//   37   95:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   38   98:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   39  101:invokevirtual   #112 <Method void Preference.setSummary(CharSequence)>
			cm.a((new StringBuilder()).append(((File) (intent)).getAbsolutePath()).append("/").toString());
	//   40  104:new             #88  <Class StringBuilder>
	//   41  107:dup             
	//   42  108:invokespecial   #89  <Method void StringBuilder()>
	//   43  111:aload_3         
	//   44  112:invokevirtual   #99  <Method String File.getAbsolutePath()>
	//   45  115:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   46  118:ldc1            #106 <String "/">
	//   47  120:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   48  123:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   49  126:invokestatic    #116 <Method void cm.a(String)>
			if(!Environment.getExternalStorageState().equals("mounted"))
	//*  50  129:invokestatic    #121 <Method String Environment.getExternalStorageState()>
	//*  51  132:ldc1            #123 <String "mounted">
	//*  52  134:invokevirtual   #129 <Method boolean String.equals(Object)>
	//*  53  137:ifne            24
			{
				cm.a(true);
	//   54  140:iconst_1        
	//   55  141:invokestatic    #132 <Method void cm.a(boolean)>
				return;
	//   56  144:return          
			}
		}
		if(true) goto _L2; else goto _L4
_L4:
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #136 <Method void PreferenceFragment.onAttach(Activity)>
		a = (SettingsActivity)activity;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:checkcast       #40  <Class SettingsActivity>
	//    6   10:putfield        #38  <Field SettingsActivity a>
	//    7   13:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #140 <Method void PreferenceFragment.onCreate(Bundle)>
		getPreferenceManager().setSharedPreferencesName(getString(0x7f0d0009));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #144 <Method PreferenceManager getPreferenceManager()>
	//    5    9:aload_0         
	//    6   10:ldc1            #145 <Int 0x7f0d0009>
	//    7   12:invokevirtual   #149 <Method String getString(int)>
	//    8   15:invokevirtual   #154 <Method void PreferenceManager.setSharedPreferencesName(String)>
		addPreferencesFromResource(0x7f100001);
	//    9   18:aload_0         
	//   10   19:ldc1            #155 <Int 0x7f100001>
	//   11   21:invokevirtual   #159 <Method void addPreferencesFromResource(int)>
		e = findPreference(((CharSequence) (getString(0x7f0d004e))));
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:ldc1            #160 <Int 0x7f0d004e>
	//   16   29:invokevirtual   #149 <Method String getString(int)>
	//   17   32:invokevirtual   #164 <Method Preference findPreference(CharSequence)>
	//   18   35:putfield        #104 <Field Preference e>
		f = findPreference(((CharSequence) (getString(0x7f0d0050))));
	//   19   38:aload_0         
	//   20   39:aload_0         
	//   21   40:aload_0         
	//   22   41:ldc1            #165 <Int 0x7f0d0050>
	//   23   43:invokevirtual   #149 <Method String getString(int)>
	//   24   46:invokevirtual   #164 <Method Preference findPreference(CharSequence)>
	//   25   49:putfield        #167 <Field Preference f>
		j = (SwitchPreference)findPreference(((CharSequence) (getString(0x7f0d004d))));
	//   26   52:aload_0         
	//   27   53:aload_0         
	//   28   54:aload_0         
	//   29   55:ldc1            #168 <Int 0x7f0d004d>
	//   30   57:invokevirtual   #149 <Method String getString(int)>
	//   31   60:invokevirtual   #164 <Method Preference findPreference(CharSequence)>
	//   32   63:checkcast       #170 <Class SwitchPreference>
	//   33   66:putfield        #172 <Field SwitchPreference j>
		h = findPreference(((CharSequence) (getString(0x7f0d004c))));
	//   34   69:aload_0         
	//   35   70:aload_0         
	//   36   71:aload_0         
	//   37   72:ldc1            #173 <Int 0x7f0d004c>
	//   38   74:invokevirtual   #149 <Method String getString(int)>
	//   39   77:invokevirtual   #164 <Method Preference findPreference(CharSequence)>
	//   40   80:putfield        #175 <Field Preference h>
		k = findPreference(((CharSequence) (getString(0x7f0d0056))));
	//   41   83:aload_0         
	//   42   84:aload_0         
	//   43   85:aload_0         
	//   44   86:ldc1            #176 <Int 0x7f0d0056>
	//   45   88:invokevirtual   #149 <Method String getString(int)>
	//   46   91:invokevirtual   #164 <Method Preference findPreference(CharSequence)>
	//   47   94:putfield        #178 <Field Preference k>
		i = findPreference(((CharSequence) (getString(0x7f0d0051))));
	//   48   97:aload_0         
	//   49   98:aload_0         
	//   50   99:aload_0         
	//   51  100:ldc1            #179 <Int 0x7f0d0051>
	//   52  102:invokevirtual   #149 <Method String getString(int)>
	//   53  105:invokevirtual   #164 <Method Preference findPreference(CharSequence)>
	//   54  108:putfield        #181 <Field Preference i>
		c = findPreference(((CharSequence) (getString(0x7f0d004f))));
	//   55  111:aload_0         
	//   56  112:aload_0         
	//   57  113:aload_0         
	//   58  114:ldc1            #182 <Int 0x7f0d004f>
	//   59  116:invokevirtual   #149 <Method String getString(int)>
	//   60  119:invokevirtual   #164 <Method Preference findPreference(CharSequence)>
	//   61  122:putfield        #47  <Field Preference c>
		g = findPreference("auto_bkp");
	//   62  125:aload_0         
	//   63  126:aload_0         
	//   64  127:ldc1            #184 <String "auto_bkp">
	//   65  129:invokevirtual   #164 <Method Preference findPreference(CharSequence)>
	//   66  132:putfield        #186 <Field Preference g>
		d = getPreferenceScreen();
	//   67  135:aload_0         
	//   68  136:aload_0         
	//   69  137:invokevirtual   #190 <Method PreferenceScreen getPreferenceScreen()>
	//   70  140:putfield        #45  <Field PreferenceScreen d>
		i.setSummary("4.2.9");
	//   71  143:aload_0         
	//   72  144:getfield        #181 <Field Preference i>
	//   73  147:ldc1            #192 <String "4.2.9">
	//   74  149:invokevirtual   #112 <Method void Preference.setSummary(CharSequence)>
		j.setOnPreferenceChangeListener(((android.preference.Preference.OnPreferenceChangeListener) (this)));
	//   75  152:aload_0         
	//   76  153:getfield        #172 <Field SwitchPreference j>
	//   77  156:aload_0         
	//   78  157:invokevirtual   #196 <Method void SwitchPreference.setOnPreferenceChangeListener(android.preference.Preference$OnPreferenceChangeListener)>
		k.setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (this)));
	//   79  160:aload_0         
	//   80  161:getfield        #178 <Field Preference k>
	//   81  164:aload_0         
	//   82  165:invokevirtual   #200 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		e.setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (this)));
	//   83  168:aload_0         
	//   84  169:getfield        #104 <Field Preference e>
	//   85  172:aload_0         
	//   86  173:invokevirtual   #200 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		f.setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (this)));
	//   87  176:aload_0         
	//   88  177:getfield        #167 <Field Preference f>
	//   89  180:aload_0         
	//   90  181:invokevirtual   #200 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		h.setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (this)));
	//   91  184:aload_0         
	//   92  185:getfield        #175 <Field Preference h>
	//   93  188:aload_0         
	//   94  189:invokevirtual   #200 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		c.setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (this)));
	//   95  192:aload_0         
	//   96  193:getfield        #47  <Field Preference c>
	//   97  196:aload_0         
	//   98  197:invokevirtual   #200 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  99  200:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
	//* 100  203:bipush          26
	//* 101  205:icmplt          220
			d.removePreference(g);
	//  102  208:aload_0         
	//  103  209:getfield        #45  <Field PreferenceScreen d>
	//  104  212:aload_0         
	//  105  213:getfield        #186 <Field Preference g>
	//  106  216:invokevirtual   #53  <Method boolean PreferenceScreen.removePreference(Preference)>
	//  107  219:pop             
		if(cm.a())
	//* 108  220:invokestatic    #208 <Method boolean cm.a()>
	//* 109  223:ifeq            307
			e.setSummary(((CharSequence) ((new StringBuilder()).append("").append(cm.d()).toString())));
	//  110  226:aload_0         
	//  111  227:getfield        #104 <Field Preference e>
	//  112  230:new             #88  <Class StringBuilder>
	//  113  233:dup             
	//  114  234:invokespecial   #89  <Method void StringBuilder()>
	//  115  237:ldc1            #210 <String "">
	//  116  239:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  117  242:invokestatic    #212 <Method String cm.d()>
	//  118  245:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//  119  248:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  120  251:invokevirtual   #112 <Method void Preference.setSummary(CharSequence)>
		else
	//* 121  254:invokestatic    #217 <Method cj cj.a()>
	//* 122  257:getstatic       #220 <Field String cj.g>
	//* 123  260:iconst_0        
	//* 124  261:invokevirtual   #223 <Method boolean cj.b(String, boolean)>
	//* 125  264:ifeq            279
	//* 126  267:aload_0         
	//* 127  268:getfield        #45  <Field PreferenceScreen d>
	//* 128  271:aload_0         
	//* 129  272:getfield        #47  <Field Preference c>
	//* 130  275:invokevirtual   #53  <Method boolean PreferenceScreen.removePreference(Preference)>
	//* 131  278:pop             
	//* 132  279:new             #225 <Class IntentFilter>
	//* 133  282:dup             
	//* 134  283:invokespecial   #226 <Method void IntentFilter()>
	//* 135  286:astore_1        
	//* 136  287:aload_1         
	//* 137  288:ldc1            #228 <String "com.ext.ui.purchase_action">
	//* 138  290:invokevirtual   #231 <Method void IntentFilter.addAction(String)>
	//* 139  293:aload_0         
	//* 140  294:getfield        #38  <Field SettingsActivity a>
	//* 141  297:aload_0         
	//* 142  298:getfield        #35  <Field BroadcastReceiver b>
	//* 143  301:aload_1         
	//* 144  302:invokevirtual   #235 <Method Intent SettingsActivity.registerReceiver(BroadcastReceiver, IntentFilter)>
	//* 145  305:pop             
	//* 146  306:return          
			e.setSummary("< no sdcard >");
	//  147  307:aload_0         
	//  148  308:getfield        #104 <Field Preference e>
	//  149  311:ldc1            #237 <String "< no sdcard >">
	//  150  313:invokevirtual   #112 <Method void Preference.setSummary(CharSequence)>
		if(cj.a().b(cj.g, false))
			d.removePreference(c);
		bundle = ((Bundle) (new IntentFilter()));
		((IntentFilter) (bundle)).addAction("com.ext.ui.purchase_action");
		a.registerReceiver(b, ((IntentFilter) (bundle)));
	//* 151  316:goto            254
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #240 <Method void PreferenceFragment.onDestroyView()>
		a.unregisterReceiver(b);
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field SettingsActivity a>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field BroadcastReceiver b>
	//    6   12:invokevirtual   #244 <Method void SettingsActivity.unregisterReceiver(BroadcastReceiver)>
	//    7   15:return          
	}

	public boolean onPreferenceChange(Preference preference, Object obj)
	{
		if(preference.getKey().equals(((Object) (getString(0x7f0d004d)))))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #249 <Method String Preference.getKey()>
	//*   2    4:aload_0         
	//*   3    5:ldc1            #168 <Int 0x7f0d004d>
	//*   4    7:invokevirtual   #149 <Method String getString(int)>
	//*   5   10:invokevirtual   #129 <Method boolean String.equals(Object)>
	//*   6   13:ifeq            26
		{
			a.c = true;
	//    7   16:aload_0         
	//    8   17:getfield        #38  <Field SettingsActivity a>
	//    9   20:iconst_1        
	//   10   21:putfield        #252 <Field boolean SettingsActivity.c>
			return true;
	//   11   24:iconst_1        
	//   12   25:ireturn         
		}
		if(preference == k)
	//*  13   26:aload_1         
	//*  14   27:aload_0         
	//*  15   28:getfield        #178 <Field Preference k>
	//*  16   31:if_acmpne       97
		{
			String s = cj.a().c(cj.f, "0:1:");
	//   17   34:invokestatic    #217 <Method cj cj.a()>
	//   18   37:getstatic       #254 <Field String cj.f>
	//   19   40:ldc2            #256 <String "0:1:">
	//   20   43:invokevirtual   #259 <Method String cj.c(String, String)>
	//   21   46:astore_3        
			ci.a("SettingsFragment", (new StringBuilder()).append(preference.getKey()).append(" New Value : ").append(obj.toString()).append(" oldValue : ").append(s.toString()).toString());
	//   22   47:ldc1            #55  <String "SettingsFragment">
	//   23   49:new             #88  <Class StringBuilder>
	//   24   52:dup             
	//   25   53:invokespecial   #89  <Method void StringBuilder()>
	//   26   56:aload_1         
	//   27   57:invokevirtual   #249 <Method String Preference.getKey()>
	//   28   60:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:ldc2            #261 <String " New Value : ">
	//   30   66:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   31   69:aload_2         
	//   32   70:invokevirtual   #264 <Method String Object.toString()>
	//   33   73:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   34   76:ldc2            #266 <String " oldValue : ">
	//   35   79:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   36   82:aload_3         
	//   37   83:invokevirtual   #267 <Method String String.toString()>
	//   38   86:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   39   89:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   40   92:invokestatic    #62  <Method void ci.a(String, String)>
			return true;
	//   41   95:iconst_1        
	//   42   96:ireturn         
		} else
		{
			return false;
	//   43   97:iconst_0        
	//   44   98:ireturn         
		}
	}

	public boolean onPreferenceClick(Preference preference)
	{
		if(preference != e) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #104 <Field Preference e>
	//    3    5:if_acmpne       47
_L1:
		preference = ((Preference) (new Intent(((Context) (getActivity())), com/ext/file/FilePickerActivity)));
	//    4    8:new             #73  <Class Intent>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #272 <Method Activity getActivity()>
	//    8   16:ldc2            #274 <Class FilePickerActivity>
	//    9   19:invokespecial   #277 <Method void Intent(Context, Class)>
	//   10   22:astore_1        
		if(cm.a())
	//*  11   23:invokestatic    #208 <Method boolean cm.a()>
	//*  12   26:ifeq            39
			((Intent) (preference)).putExtra("file_path", cm.d());
	//   13   29:aload_1         
	//   14   30:ldc1            #71  <String "file_path">
	//   15   32:invokestatic    #212 <Method String cm.d()>
	//   16   35:invokevirtual   #281 <Method Intent Intent.putExtra(String, String)>
	//   17   38:pop             
		startActivityForResult(((Intent) (preference)), 1);
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:iconst_1        
	//   21   42:invokevirtual   #285 <Method void startActivityForResult(Intent, int)>
_L4:
		return true;
	//   22   45:iconst_1        
	//   23   46:ireturn         
_L2:
		if(preference != f)
			break; /* Loop/switch isn't completed */
	//   24   47:aload_1         
	//   25   48:aload_0         
	//   26   49:getfield        #167 <Field Preference f>
	//   27   52:if_acmpne       106
		if(MainActivity.c)
	//*  28   55:getstatic       #288 <Field boolean MainActivity.c>
	//*  29   58:ifeq            45
		{
			startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(getActivity().getPackageName()).toString())));
	//   30   61:aload_0         
	//   31   62:new             #73  <Class Intent>
	//   32   65:dup             
	//   33   66:ldc2            #290 <String "android.intent.action.VIEW">
	//   34   69:new             #88  <Class StringBuilder>
	//   35   72:dup             
	//   36   73:invokespecial   #89  <Method void StringBuilder()>
	//   37   76:ldc2            #292 <String "market://details?id=">
	//   38   79:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   39   82:aload_0         
	//   40   83:invokevirtual   #272 <Method Activity getActivity()>
	//   41   86:invokevirtual   #297 <Method String Activity.getPackageName()>
	//   42   89:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   43   92:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   44   95:invokestatic    #303 <Method Uri Uri.parse(String)>
	//   45   98:invokespecial   #306 <Method void Intent(String, Uri)>
	//   46  101:invokevirtual   #310 <Method void startActivity(Intent)>
			return true;
	//   47  104:iconst_1        
	//   48  105:ireturn         
		}
		if(true) goto _L4; else goto _L3
_L3:
		if(preference == h)
	//*  49  106:aload_1         
	//*  50  107:aload_0         
	//*  51  108:getfield        #175 <Field Preference h>
	//*  52  111:if_acmpne       126
		{
			cn.a().b(((Context) (a)));
	//   53  114:invokestatic    #315 <Method cn cn.a()>
	//   54  117:aload_0         
	//   55  118:getfield        #38  <Field SettingsActivity a>
	//   56  121:invokevirtual   #318 <Method void cn.b(Context)>
			return true;
	//   57  124:iconst_1        
	//   58  125:ireturn         
		}
		if(!preference.getKey().equals(((Object) (getString(0x7f0d0051)))))
	//*  59  126:aload_1         
	//*  60  127:invokevirtual   #249 <Method String Preference.getKey()>
	//*  61  130:aload_0         
	//*  62  131:ldc1            #179 <Int 0x7f0d0051>
	//*  63  133:invokevirtual   #149 <Method String getString(int)>
	//*  64  136:invokevirtual   #129 <Method boolean String.equals(Object)>
	//*  65  139:ifne            45
		{
			if(preference == c)
	//*  66  142:aload_1         
	//*  67  143:aload_0         
	//*  68  144:getfield        #47  <Field Preference c>
	//*  69  147:if_acmpne       159
			{
				a.a();
	//   70  150:aload_0         
	//   71  151:getfield        #38  <Field SettingsActivity a>
	//   72  154:invokevirtual   #320 <Method void SettingsActivity.a()>
				return true;
	//   73  157:iconst_1        
	//   74  158:ireturn         
			}
			if(preference == k)
	//*  75  159:aload_1         
	//*  76  160:aload_0         
	//*  77  161:getfield        #178 <Field Preference k>
	//*  78  164:if_acmpne       45
			{
				cn.a().a(((Context) (a)));
	//   79  167:invokestatic    #315 <Method cn cn.a()>
	//   80  170:aload_0         
	//   81  171:getfield        #38  <Field SettingsActivity a>
	//   82  174:invokevirtual   #322 <Method void cn.a(Context)>
				return true;
	//   83  177:iconst_1        
	//   84  178:ireturn         
			}
		}
		if(true) goto _L4; else goto _L5
_L5:
	}

	SettingsActivity a;
	BroadcastReceiver b;
	private Preference c;
	private PreferenceScreen d;
	private Preference e;
	private Preference f;
	private Preference g;
	private Preference h;
	private Preference i;
	private SwitchPreference j;
	private Preference k;
}
