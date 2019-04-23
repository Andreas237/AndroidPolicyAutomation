// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v4.a.g;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import biz.bookdesign.catalogbase.a;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.i;
import biz.bookdesign.librivox.a.k;
import biz.bookdesign.librivox.a.l;
import biz.bookdesign.librivox.a.m;
import biz.bookdesign.librivox.support.a.d;
import com.google.android.gms.common.c;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// Referenced classes of package biz.bookdesign.librivox:
//			ev, SettingsActivity, fb, fc, 
//			fd, fg, ff, fi, 
//			fj, fk, fl, fm, 
//			fn, fo, fh, fp, 
//			fq, fr, fs, ft, 
//			fu, fv, ew, ex, 
//			ey, ez, fa

public class SettingsFragment extends PreferenceFragment
{

	public SettingsFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void PreferenceFragment()>
		c = ((biz.bookdesign.librivox.support.a.i) (new ev(this)));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ev>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #19  <Method void ev(SettingsFragment)>
	//    7   13:putfield        #21  <Field biz.bookdesign.librivox.support.a.i c>
	//    8   16:return          
	}

	static SettingsActivity a(SettingsFragment settingsfragment)
	{
		return settingsfragment.b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SettingsActivity b>
	//    2    4:areturn         
	}

	static boolean a(SettingsFragment settingsfragment, String s)
	{
		return settingsfragment.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method boolean a(String)>
	//    3    5:ireturn         
	}

	private boolean a(String s)
	{
		Intent intent = new Intent("android.intent.action.SEND");
	//    0    0:new             #31  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #33  <String "android.intent.action.SEND">
	//    3    6:invokespecial   #36  <Method void Intent(String)>
	//    4    9:astore_2        
		intent.setType("plain/text");
	//    5   10:aload_2         
	//    6   11:ldc1            #38  <String "plain/text">
	//    7   13:invokevirtual   #42  <Method Intent Intent.setType(String)>
	//    8   16:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #44  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #45  <Method void StringBuilder()>
	//   12   24:astore_3        
		stringbuilder.append(getString(k.feedback_email_subject));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:getstatic       #51  <Field int k.feedback_email_subject>
	//   16   30:invokevirtual   #55  <Method String getString(int)>
	//   17   33:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		stringbuilder.append(' ');
	//   19   37:aload_3         
	//   20   38:bipush          32
	//   21   40:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   22   43:pop             
		stringbuilder.append(s);
	//   23   44:aload_3         
	//   24   45:aload_1         
	//   25   46:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		intent.putExtra("android.intent.extra.SUBJECT", stringbuilder.toString());
	//   27   50:aload_2         
	//   28   51:ldc1            #64  <String "android.intent.extra.SUBJECT">
	//   29   53:aload_3         
	//   30   54:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   31   57:invokevirtual   #72  <Method Intent Intent.putExtra(String, String)>
	//   32   60:pop             
		intent.putExtra("android.intent.extra.EMAIL", new String[] {
			"support@bookdesign.biz"
		});
	//   33   61:aload_2         
	//   34   62:ldc1            #74  <String "android.intent.extra.EMAIL">
	//   35   64:iconst_1        
	//   36   65:anewarray       String[]
	//   37   68:dup             
	//   38   69:iconst_0        
	//   39   70:ldc1            #78  <String "support@bookdesign.biz">
	//   40   72:aastore         
	//   41   73:invokevirtual   #81  <Method Intent Intent.putExtra(String, String[])>
	//   42   76:pop             
		if(b.getPackageManager().queryIntentActivities(intent, 0).isEmpty())
	//*  43   77:aload_0         
	//*  44   78:getfield        #25  <Field SettingsActivity b>
	//*  45   81:invokevirtual   #87  <Method PackageManager SettingsActivity.getPackageManager()>
	//*  46   84:aload_2         
	//*  47   85:iconst_0        
	//*  48   86:invokevirtual   #93  <Method List PackageManager.queryIntentActivities(Intent, int)>
	//*  49   89:invokeinterface #99  <Method boolean List.isEmpty()>
	//*  50   94:ifeq            120
		{
			Toast.makeText(b.getApplicationContext(), ((CharSequence) (getString(k.no_email))), 1).show();
	//   51   97:aload_0         
	//   52   98:getfield        #25  <Field SettingsActivity b>
	//   53  101:invokevirtual   #103 <Method android.content.Context SettingsActivity.getApplicationContext()>
	//   54  104:aload_0         
	//   55  105:getstatic       #106 <Field int k.no_email>
	//   56  108:invokevirtual   #55  <Method String getString(int)>
	//   57  111:iconst_1        
	//   58  112:invokestatic    #112 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   59  115:invokevirtual   #115 <Method void Toast.show()>
			return true;
	//   60  118:iconst_1        
	//   61  119:ireturn         
		} else
		{
			startActivity(intent);
	//   62  120:aload_0         
	//   63  121:aload_2         
	//   64  122:invokevirtual   #119 <Method void startActivity(Intent)>
			return true;
	//   65  125:iconst_1        
	//   66  126:ireturn         
		}
	}

	static Dialog b(SettingsFragment settingsfragment)
	{
		return settingsfragment.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method Dialog g()>
	//    2    4:areturn         
	}

	private void b()
	{
		PreferenceCategory preferencecategory = (PreferenceCategory)findPreference("general");
	//    0    0:aload_0         
	//    1    1:ldc1            #126 <String "general">
	//    2    3:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//    3    6:checkcast       #132 <Class PreferenceCategory>
	//    4    9:astore_1        
		Preference preference = findPreference("ads");
	//    5   10:aload_0         
	//    6   11:ldc1            #134 <String "ads">
	//    7   13:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//    8   16:astore_2        
		preference.setEnabled(false);
	//    9   17:aload_2         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #140 <Method void Preference.setEnabled(boolean)>
		a = SettingsActivity.f(((android.content.Context) (b)));
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #25  <Field SettingsActivity b>
	//   15   27:invokestatic    #144 <Method d SettingsActivity.f(android.content.Context)>
	//   16   30:putfield        #146 <Field d a>
		a.a(((biz.bookdesign.librivox.support.a.j) (new fb(this, preference, preferencecategory))));
	//   17   33:aload_0         
	//   18   34:getfield        #146 <Field d a>
	//   19   37:new             #148 <Class fb>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:aload_1         
	//   24   44:invokespecial   #151 <Method void fb(SettingsFragment, Preference, PreferenceCategory)>
	//   25   47:invokevirtual   #156 <Method void d.a(biz.bookdesign.librivox.support.a.j)>
		String s = biz.bookdesign.catalogbase.a.g().e();
	//   26   50:invokestatic    #161 <Method a a.g()>
	//   27   53:invokevirtual   #164 <Method String a.e()>
	//   28   56:astore_3        
		if(com.google.android.gms.common.c.a().a(((android.content.Context) (b))) == 0 && s != null)
	//*  29   57:invokestatic    #169 <Method c c.a()>
	//*  30   60:aload_0         
	//*  31   61:getfield        #25  <Field SettingsActivity b>
	//*  32   64:invokevirtual   #172 <Method int c.a(android.content.Context)>
	//*  33   67:ifne            91
	//*  34   70:aload_3         
	//*  35   71:ifnonnull       77
	//*  36   74:goto            91
		{
			preference.setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new fc(this, preference))));
	//   37   77:aload_2         
	//   38   78:new             #174 <Class fc>
	//   39   81:dup             
	//   40   82:aload_0         
	//   41   83:aload_2         
	//   42   84:invokespecial   #177 <Method void fc(SettingsFragment, Preference)>
	//   43   87:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
			return;
	//   44   90:return          
		} else
		{
			preferencecategory.removePreference(preference);
	//   45   91:aload_1         
	//   46   92:aload_2         
	//   47   93:invokevirtual   #185 <Method boolean PreferenceCategory.removePreference(Preference)>
	//   48   96:pop             
			return;
	//   49   97:return          
		}
	}

	static Dialog c(SettingsFragment settingsfragment)
	{
		return settingsfragment.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method Dialog f()>
	//    2    4:areturn         
	}

	private void c()
	{
		Preference preference = findPreference("google_account");
	//    0    0:aload_0         
	//    1    1:ldc1            #189 <String "google_account">
	//    2    3:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//    3    6:astore_1        
		Object obj = ((Object) (PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (b)))));
	//    4    7:aload_0         
	//    5    8:getfield        #25  <Field SettingsActivity b>
	//    6   11:invokestatic    #195 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    7   14:astore_2        
		if(((SharedPreferences) (obj)).getInt("google_account_status", 0) == 1)
	//*   8   15:aload_2         
	//*   9   16:ldc1            #197 <String "google_account_status">
	//*  10   18:iconst_0        
	//*  11   19:invokeinterface #203 <Method int SharedPreferences.getInt(String, int)>
	//*  12   24:iconst_1        
	//*  13   25:icmpne          81
		{
			obj = ((Object) (((SharedPreferences) (obj)).getString("google_account", "")));
	//   14   28:aload_2         
	//   15   29:ldc1            #189 <String "google_account">
	//   16   31:ldc1            #205 <String "">
	//   17   33:invokeinterface #208 <Method String SharedPreferences.getString(String, String)>
	//   18   38:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   19   39:new             #44  <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #45  <Method void StringBuilder()>
	//   22   46:astore_3        
			stringbuilder.append(getString(k.logged_in));
	//   23   47:aload_3         
	//   24   48:aload_0         
	//   25   49:getstatic       #211 <Field int k.logged_in>
	//   26   52:invokevirtual   #55  <Method String getString(int)>
	//   27   55:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
			stringbuilder.append(' ');
	//   29   59:aload_3         
	//   30   60:bipush          32
	//   31   62:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   32   65:pop             
			stringbuilder.append(((String) (obj)));
	//   33   66:aload_3         
	//   34   67:aload_2         
	//   35   68:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
			preference.setSummary(((CharSequence) (stringbuilder.toString())));
	//   37   72:aload_1         
	//   38   73:aload_3         
	//   39   74:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   40   77:invokevirtual   #215 <Method void Preference.setSummary(CharSequence)>
			return;
	//   41   80:return          
		} else
		{
			preference.setSummary(k.google_account_summary);
	//   42   81:aload_1         
	//   43   82:getstatic       #218 <Field int k.google_account_summary>
	//   44   85:invokevirtual   #221 <Method void Preference.setSummary(int)>
			return;
	//   45   88:return          
		}
	}

	static Dialog d(SettingsFragment settingsfragment)
	{
		return settingsfragment.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #225 <Method Dialog i()>
	//    2    4:areturn         
	}

	private void d()
	{
		CheckBoxPreference checkboxpreference = (CheckBoxPreference)findPreference("normalize_volume");
	//    0    0:aload_0         
	//    1    1:ldc1            #227 <String "normalize_volume">
	//    2    3:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//    3    6:checkcast       #229 <Class CheckBoxPreference>
	//    4    9:astore_2        
		if(checkboxpreference.isChecked())
	//*   5   10:aload_2         
	//*   6   11:invokevirtual   #232 <Method boolean CheckBoxPreference.isChecked()>
	//*   7   14:ifeq            63
		{
			float f1 = (float)PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (b))).getInt("normalized_volume", 0) / 100F;
	//    8   17:aload_0         
	//    9   18:getfield        #25  <Field SettingsActivity b>
	//   10   21:invokestatic    #195 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//   11   24:ldc1            #234 <String "normalized_volume">
	//   12   26:iconst_0        
	//   13   27:invokeinterface #203 <Method int SharedPreferences.getInt(String, int)>
	//   14   32:i2f             
	//   15   33:ldc1            #235 <Float 100F>
	//   16   35:fdiv            
	//   17   36:fstore_1        
			checkboxpreference.setSummary(((CharSequence) (String.format(getString(k.volume_normalization_level), new Object[] {
				Float.valueOf(f1)
			}))));
	//   18   37:aload_2         
	//   19   38:aload_0         
	//   20   39:getstatic       #238 <Field int k.volume_normalization_level>
	//   21   42:invokevirtual   #55  <Method String getString(int)>
	//   22   45:iconst_1        
	//   23   46:anewarray       Object[]
	//   24   49:dup             
	//   25   50:iconst_0        
	//   26   51:fload_1         
	//   27   52:invokestatic    #246 <Method Float Float.valueOf(float)>
	//   28   55:aastore         
	//   29   56:invokestatic    #250 <Method String String.format(String, Object[])>
	//   30   59:invokevirtual   #251 <Method void CheckBoxPreference.setSummary(CharSequence)>
			return;
	//   31   62:return          
		} else
		{
			checkboxpreference.setSummary(k.normalize_volume_summary);
	//   32   63:aload_2         
	//   33   64:getstatic       #254 <Field int k.normalize_volume_summary>
	//   34   67:invokevirtual   #255 <Method void CheckBoxPreference.setSummary(int)>
			return;
	//   35   70:return          
		}
	}

	static Dialog e(SettingsFragment settingsfragment)
	{
		return settingsfragment.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #258 <Method Dialog h()>
	//    2    4:areturn         
	}

	private void e()
	{
		Preference preference = findPreference("user_name");
	//    0    0:aload_0         
	//    1    1:ldc2            #260 <String "user_name">
	//    2    4:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//    3    7:astore_1        
		String s = SettingsActivity.e(((android.content.Context) (b)));
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field SettingsActivity b>
	//    6   12:invokestatic    #263 <Method String SettingsActivity.e(android.content.Context)>
	//    7   15:astore_2        
		if(!s.isEmpty())
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #264 <Method boolean String.isEmpty()>
	//*  10   20:ifne            42
			preference.setSummary(((CharSequence) (getString(k.display_name_details, new Object[] {
				s
			}))));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getstatic       #267 <Field int k.display_name_details>
	//   14   28:iconst_1        
	//   15   29:anewarray       Object[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:aload_2         
	//   19   35:aastore         
	//   20   36:invokevirtual   #270 <Method String getString(int, Object[])>
	//   21   39:invokevirtual   #215 <Method void Preference.setSummary(CharSequence)>
		preference.setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new fd(this))));
	//   22   42:aload_1         
	//   23   43:new             #272 <Class fd>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:invokespecial   #273 <Method void fd(SettingsFragment)>
	//   27   51:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
	//   28   54:return          
	}

	private Dialog f()
	{
		android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (b)), l.LVDialogTheme);
	//    0    0:new             #275 <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field SettingsActivity b>
	//    4    8:getstatic       #280 <Field int l.LVDialogTheme>
	//    5   11:invokespecial   #283 <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context, int)>
	//    6   14:astore_1        
		builder.setMessage(((CharSequence) (getString(k.delete_files_dialog)))).setCancelable(false).setPositiveButton(((CharSequence) (getString(k.yes))), ((android.content.DialogInterface.OnClickListener) (new fg(this)))).setNegativeButton(((CharSequence) (getString(k.no))), ((android.content.DialogInterface.OnClickListener) (new ff(this))));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getstatic       #286 <Field int k.delete_files_dialog>
	//   10   20:invokevirtual   #55  <Method String getString(int)>
	//   11   23:invokevirtual   #290 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #294 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setCancelable(boolean)>
	//   14   30:aload_0         
	//   15   31:getstatic       #297 <Field int k.yes>
	//   16   34:invokevirtual   #55  <Method String getString(int)>
	//   17   37:new             #299 <Class fg>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:invokespecial   #300 <Method void fg(SettingsFragment)>
	//   21   45:invokevirtual   #304 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   22   48:aload_0         
	//   23   49:getstatic       #307 <Field int k.no>
	//   24   52:invokevirtual   #55  <Method String getString(int)>
	//   25   55:new             #309 <Class ff>
	//   26   58:dup             
	//   27   59:aload_0         
	//   28   60:invokespecial   #310 <Method void ff(SettingsFragment)>
	//   29   63:invokevirtual   #313 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   30   66:pop             
		return ((Dialog) (builder.create()));
	//   31   67:aload_1         
	//   32   68:invokevirtual   #317 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   33   71:areturn         
	}

	static biz.bookdesign.librivox.support.a.i f(SettingsFragment settingsfragment)
	{
		return settingsfragment.c;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field biz.bookdesign.librivox.support.a.i c>
	//    2    4:areturn         
	}

	private Dialog g()
	{
		android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (b)), l.LVDialogTheme);
	//    0    0:new             #275 <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field SettingsActivity b>
	//    4    8:getstatic       #280 <Field int l.LVDialogTheme>
	//    5   11:invokespecial   #283 <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context, int)>
	//    6   14:astore_1        
		String as[] = getResources().getStringArray(biz.bookdesign.librivox.a.c.country_array);
	//    7   15:aload_0         
	//    8   16:invokevirtual   #322 <Method Resources getResources()>
	//    9   19:getstatic       #327 <Field int biz.bookdesign.librivox.a.c.country_array>
	//   10   22:invokevirtual   #333 <Method String[] Resources.getStringArray(int)>
	//   11   25:astore_2        
		String as1[] = getResources().getStringArray(biz.bookdesign.librivox.a.c.iso_3166_2);
	//   12   26:aload_0         
	//   13   27:invokevirtual   #322 <Method Resources getResources()>
	//   14   30:getstatic       #336 <Field int biz.bookdesign.librivox.a.c.iso_3166_2>
	//   15   33:invokevirtual   #333 <Method String[] Resources.getStringArray(int)>
	//   16   36:astore_3        
		builder.setTitle(k.select_country).setItems(((CharSequence []) (as)), ((android.content.DialogInterface.OnClickListener) (new fi(this, as1, as))));
	//   17   37:aload_1         
	//   18   38:getstatic       #339 <Field int k.select_country>
	//   19   41:invokevirtual   #343 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(int)>
	//   20   44:aload_2         
	//   21   45:new             #345 <Class fi>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:aload_3         
	//   25   51:aload_2         
	//   26   52:invokespecial   #348 <Method void fi(SettingsFragment, String[], String[])>
	//   27   55:invokevirtual   #352 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setItems(CharSequence[], android.content.DialogInterface$OnClickListener)>
	//   28   58:pop             
		return ((Dialog) (builder.create()));
	//   29   59:aload_1         
	//   30   60:invokevirtual   #317 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   31   63:areturn         
	}

	static d g(SettingsFragment settingsfragment)
	{
		return settingsfragment.a;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field d a>
	//    2    4:areturn         
	}

	private Dialog h()
	{
		CheckBoxPreference checkboxpreference = (CheckBoxPreference)findPreference("normalize_volume");
	//    0    0:aload_0         
	//    1    1:ldc1            #227 <String "normalize_volume">
	//    2    3:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//    3    6:checkcast       #229 <Class CheckBoxPreference>
	//    4    9:astore_2        
		SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (b)));
	//    5   10:aload_0         
	//    6   11:getfield        #25  <Field SettingsActivity b>
	//    7   14:invokestatic    #195 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    8   17:astore_3        
		View view = b.getLayoutInflater().inflate(i.volume_dialog, ((android.view.ViewGroup) (null)));
	//    9   18:aload_0         
	//   10   19:getfield        #25  <Field SettingsActivity b>
	//   11   22:invokevirtual   #360 <Method LayoutInflater SettingsActivity.getLayoutInflater()>
	//   12   25:getstatic       #365 <Field int i.volume_dialog>
	//   13   28:aconst_null     
	//   14   29:invokevirtual   #371 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   15   32:astore          4
		SeekBar seekbar = (SeekBar)view.findViewById(h.volume_seekbar);
	//   16   34:aload           4
	//   17   36:getstatic       #376 <Field int h.volume_seekbar>
	//   18   39:invokevirtual   #382 <Method View View.findViewById(int)>
	//   19   42:checkcast       #384 <Class SeekBar>
	//   20   45:astore          5
		int j = sharedpreferences.getInt("normalized_volume", 0);
	//   21   47:aload_3         
	//   22   48:ldc1            #234 <String "normalized_volume">
	//   23   50:iconst_0        
	//   24   51:invokeinterface #203 <Method int SharedPreferences.getInt(String, int)>
	//   25   56:istore_1        
		Object obj = ((Object) (new Intent("biz.bookdesign.librivox.VOLUME_BOOST")));
	//   26   57:new             #31  <Class Intent>
	//   27   60:dup             
	//   28   61:ldc2            #386 <String "biz.bookdesign.librivox.VOLUME_BOOST">
	//   29   64:invokespecial   #36  <Method void Intent(String)>
	//   30   67:astore          6
		((Intent) (obj)).putExtra("vol", j);
	//   31   69:aload           6
	//   32   71:ldc2            #388 <String "vol">
	//   33   74:iload_1         
	//   34   75:invokevirtual   #391 <Method Intent Intent.putExtra(String, int)>
	//   35   78:pop             
		b.b.a(((Intent) (obj)));
	//   36   79:aload_0         
	//   37   80:getfield        #25  <Field SettingsActivity b>
	//   38   83:getfield        #394 <Field g SettingsActivity.b>
	//   39   86:aload           6
	//   40   88:invokevirtual   #399 <Method boolean g.a(Intent)>
	//   41   91:pop             
		obj = ((Object) ((TextView)view.findViewById(h.volume_popup)));
	//   42   92:aload           4
	//   43   94:getstatic       #402 <Field int h.volume_popup>
	//   44   97:invokevirtual   #382 <Method View View.findViewById(int)>
	//   45  100:checkcast       #404 <Class TextView>
	//   46  103:astore          6
		seekbar.setProgress(j / 20 + 50);
	//   47  105:aload           5
	//   48  107:iload_1         
	//   49  108:bipush          20
	//   50  110:idiv            
	//   51  111:bipush          50
	//   52  113:iadd            
	//   53  114:invokevirtual   #407 <Method void SeekBar.setProgress(int)>
		seekbar.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (new fj(this, ((TextView) (obj))))));
	//   54  117:aload           5
	//   55  119:new             #409 <Class fj>
	//   56  122:dup             
	//   57  123:aload_0         
	//   58  124:aload           6
	//   59  126:invokespecial   #412 <Method void fj(SettingsFragment, TextView)>
	//   60  129:invokevirtual   #416 <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
		obj = ((Object) (new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (b)), l.LVDialogTheme)));
	//   61  132:new             #275 <Class android.support.v7.app.AlertDialog$Builder>
	//   62  135:dup             
	//   63  136:aload_0         
	//   64  137:getfield        #25  <Field SettingsActivity b>
	//   65  140:getstatic       #280 <Field int l.LVDialogTheme>
	//   66  143:invokespecial   #283 <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context, int)>
	//   67  146:astore          6
		((android.support.v7.app.AlertDialog.Builder) (obj)).setView(view);
	//   68  148:aload           6
	//   69  150:aload           4
	//   70  152:invokevirtual   #420 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setView(View)>
	//   71  155:pop             
		((android.support.v7.app.AlertDialog.Builder) (obj)).setTitle(k.normalize_volume);
	//   72  156:aload           6
	//   73  158:getstatic       #422 <Field int k.normalize_volume>
	//   74  161:invokevirtual   #343 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(int)>
	//   75  164:pop             
		((android.support.v7.app.AlertDialog.Builder) (obj)).setPositiveButton(k.enable, ((android.content.DialogInterface.OnClickListener) (new fk(this, seekbar, sharedpreferences, checkboxpreference))));
	//   76  165:aload           6
	//   77  167:getstatic       #425 <Field int k.enable>
	//   78  170:new             #427 <Class fk>
	//   79  173:dup             
	//   80  174:aload_0         
	//   81  175:aload           5
	//   82  177:aload_3         
	//   83  178:aload_2         
	//   84  179:invokespecial   #430 <Method void fk(SettingsFragment, SeekBar, SharedPreferences, CheckBoxPreference)>
	//   85  182:invokevirtual   #433 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   86  185:pop             
		((android.support.v7.app.AlertDialog.Builder) (obj)).setNeutralButton(0x1040000, ((android.content.DialogInterface.OnClickListener) (new fl(this, checkboxpreference, sharedpreferences))));
	//   87  186:aload           6
	//   88  188:ldc2            #434 <Int 0x1040000>
	//   89  191:new             #436 <Class fl>
	//   90  194:dup             
	//   91  195:aload_0         
	//   92  196:aload_2         
	//   93  197:aload_3         
	//   94  198:invokespecial   #439 <Method void fl(SettingsFragment, CheckBoxPreference, SharedPreferences)>
	//   95  201:invokevirtual   #442 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNeutralButton(int, android.content.DialogInterface$OnClickListener)>
	//   96  204:pop             
		((android.support.v7.app.AlertDialog.Builder) (obj)).setNegativeButton(k.disable, ((android.content.DialogInterface.OnClickListener) (new fm(this, checkboxpreference, sharedpreferences))));
	//   97  205:aload           6
	//   98  207:getstatic       #445 <Field int k.disable>
	//   99  210:new             #447 <Class fm>
	//  100  213:dup             
	//  101  214:aload_0         
	//  102  215:aload_2         
	//  103  216:aload_3         
	//  104  217:invokespecial   #448 <Method void fm(SettingsFragment, CheckBoxPreference, SharedPreferences)>
	//  105  220:invokevirtual   #450 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//  106  223:pop             
		return ((Dialog) (((android.support.v7.app.AlertDialog.Builder) (obj)).create()));
	//  107  224:aload           6
	//  108  226:invokevirtual   #317 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//  109  229:areturn         
	}

	static void h(SettingsFragment settingsfragment)
	{
		settingsfragment.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #453 <Method void e()>
	//    2    4:return          
	}

	private Dialog i()
	{
		android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(((android.content.Context) (b)), l.LVDialogTheme);
	//    0    0:new             #275 <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field SettingsActivity b>
	//    4    8:getstatic       #280 <Field int l.LVDialogTheme>
	//    5   11:invokespecial   #283 <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context, int)>
	//    6   14:astore_1        
		builder.setMessage(k.reset_saved_data_warning).setTitle(k.reset_saved_data_question);
	//    7   15:aload_1         
	//    8   16:getstatic       #456 <Field int k.reset_saved_data_warning>
	//    9   19:invokevirtual   #458 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setMessage(int)>
	//   10   22:getstatic       #461 <Field int k.reset_saved_data_question>
	//   11   25:invokevirtual   #343 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(int)>
	//   12   28:pop             
		builder.setPositiveButton(0x104000a, ((android.content.DialogInterface.OnClickListener) (new fn(this))));
	//   13   29:aload_1         
	//   14   30:ldc2            #462 <Int 0x104000a>
	//   15   33:new             #464 <Class fn>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #465 <Method void fn(SettingsFragment)>
	//   19   41:invokevirtual   #433 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   20   44:pop             
		builder.setNegativeButton(0x1040000, ((android.content.DialogInterface.OnClickListener) (new fo(this))));
	//   21   45:aload_1         
	//   22   46:ldc2            #434 <Int 0x1040000>
	//   23   49:new             #467 <Class fo>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:invokespecial   #468 <Method void fo(SettingsFragment)>
	//   27   57:invokevirtual   #450 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   28   60:pop             
		return ((Dialog) (builder.create()));
	//   29   61:aload_1         
	//   30   62:invokevirtual   #317 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   31   65:areturn         
	}

	static void i(SettingsFragment settingsfragment)
	{
		settingsfragment.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #470 <Method void d()>
	//    2    4:return          
	}

	public void a()
	{
		Preference preference = findPreference("languages");
	//    0    0:aload_0         
	//    1    1:ldc2            #472 <String "languages">
	//    2    4:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//    3    7:astore_1        
		String s = PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (b))).getString("languages", ((String) (null)));
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field SettingsActivity b>
	//    6   12:invokestatic    #195 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    7   15:ldc2            #472 <String "languages">
	//    8   18:aconst_null     
	//    9   19:invokeinterface #208 <Method String SharedPreferences.getString(String, String)>
	//   10   24:astore_2        
		if(s != null)
	//*  11   25:aload_2         
	//*  12   26:ifnull          90
		{
			s = s.replaceAll("'", "").replaceAll(",", ", ");
	//   13   29:aload_2         
	//   14   30:ldc2            #474 <String "'">
	//   15   33:ldc1            #205 <String "">
	//   16   35:invokevirtual   #477 <Method String String.replaceAll(String, String)>
	//   17   38:ldc2            #479 <String ",">
	//   18   41:ldc2            #481 <String ", ">
	//   19   44:invokevirtual   #477 <Method String String.replaceAll(String, String)>
	//   20   47:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   21   48:new             #44  <Class StringBuilder>
	//   22   51:dup             
	//   23   52:invokespecial   #45  <Method void StringBuilder()>
	//   24   55:astore_3        
			stringbuilder.append(getString(k.selected_languages));
	//   25   56:aload_3         
	//   26   57:aload_0         
	//   27   58:getstatic       #484 <Field int k.selected_languages>
	//   28   61:invokevirtual   #55  <Method String getString(int)>
	//   29   64:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   30   67:pop             
			stringbuilder.append(' ');
	//   31   68:aload_3         
	//   32   69:bipush          32
	//   33   71:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   34   74:pop             
			stringbuilder.append(s);
	//   35   75:aload_3         
	//   36   76:aload_2         
	//   37   77:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
			preference.setSummary(((CharSequence) (stringbuilder.toString())));
	//   39   81:aload_1         
	//   40   82:aload_3         
	//   41   83:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   42   86:invokevirtual   #215 <Method void Preference.setSummary(CharSequence)>
			return;
	//   43   89:return          
		} else
		{
			preference.setSummary(((CharSequence) (getString(k.languages_summary))));
	//   44   90:aload_1         
	//   45   91:aload_0         
	//   46   92:getstatic       #487 <Field int k.languages_summary>
	//   47   95:invokevirtual   #55  <Method String getString(int)>
	//   48   98:invokevirtual   #215 <Method void Preference.setSummary(CharSequence)>
			return;
	//   49  101:return          
		}
	}

	public void onActivityCreated(Bundle bundle)
	{
		int i1;
		Object obj;
		PreferenceCategory preferencecategory;
		super.onActivityCreated(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #493 <Method void PreferenceFragment.onActivityCreated(Bundle)>
		b = (SettingsActivity)getActivity();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #497 <Method android.app.Activity getActivity()>
	//    6   10:checkcast       #83  <Class SettingsActivity>
	//    7   13:putfield        #25  <Field SettingsActivity b>
		addPreferencesFromResource(m.preferences);
	//    8   16:aload_0         
	//    9   17:getstatic       #502 <Field int m.preferences>
	//   10   20:invokevirtual   #505 <Method void addPreferencesFromResource(int)>
		b();
	//   11   23:aload_0         
	//   12   24:invokespecial   #507 <Method void b()>
		bundle = ((Bundle) (findPreference("languages")));
	//   13   27:aload_0         
	//   14   28:ldc2            #472 <String "languages">
	//   15   31:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//   16   34:astore_1        
		a();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #509 <Method void a()>
		((Preference) (bundle)).setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new fh(this))));
	//   19   39:aload_1         
	//   20   40:new             #511 <Class fh>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:invokespecial   #512 <Method void fh(SettingsFragment)>
	//   24   48:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		preferencecategory = (PreferenceCategory)findPreference("general");
	//   25   51:aload_0         
	//   26   52:ldc1            #126 <String "general">
	//   27   54:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//   28   57:checkcast       #132 <Class PreferenceCategory>
	//   29   60:astore          5
		bundle = ((Bundle) (findPreference("google_account")));
	//   30   62:aload_0         
	//   31   63:ldc1            #189 <String "google_account">
	//   32   65:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//   33   68:astore_1        
		if(com.google.android.gms.common.c.a().a(((android.content.Context) (b))) == 0)
	//*  34   69:invokestatic    #169 <Method c c.a()>
	//*  35   72:aload_0         
	//*  36   73:getfield        #25  <Field SettingsActivity b>
	//*  37   76:invokevirtual   #172 <Method int c.a(android.content.Context)>
	//*  38   79:ifne            101
		{
			c();
	//   39   82:aload_0         
	//   40   83:invokespecial   #514 <Method void c()>
			((Preference) (bundle)).setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new fp(this))));
	//   41   86:aload_1         
	//   42   87:new             #516 <Class fp>
	//   43   90:dup             
	//   44   91:aload_0         
	//   45   92:invokespecial   #517 <Method void fp(SettingsFragment)>
	//   46   95:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		} else
	//*  47   98:goto            108
		{
			preferencecategory.removePreference(((Preference) (bundle)));
	//   48  101:aload           5
	//   49  103:aload_1         
	//   50  104:invokevirtual   #185 <Method boolean PreferenceCategory.removePreference(Preference)>
	//   51  107:pop             
		}
		e();
	//   52  108:aload_0         
	//   53  109:invokespecial   #453 <Method void e()>
		bundle = ((Bundle) (findPreference("select_country")));
	//   54  112:aload_0         
	//   55  113:ldc2            #518 <String "select_country">
	//   56  116:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//   57  119:astore_1        
		obj = ((Object) (biz.bookdesign.librivox.SettingsActivity.a(((android.content.Context) (b)))));
	//   58  120:aload_0         
	//   59  121:getfield        #25  <Field SettingsActivity b>
	//   60  124:invokestatic    #520 <Method String biz.bookdesign.librivox.SettingsActivity.a(android.content.Context)>
	//   61  127:astore          4
		if(obj != null && !((String) (obj)).isEmpty())
	//*  62  129:aload           4
	//*  63  131:ifnull          286
	//*  64  134:aload           4
	//*  65  136:invokevirtual   #264 <Method boolean String.isEmpty()>
	//*  66  139:ifne            286
		{
			String as[] = getResources().getStringArray(biz.bookdesign.librivox.a.c.country_array);
	//   67  142:aload_0         
	//   68  143:invokevirtual   #322 <Method Resources getResources()>
	//   69  146:getstatic       #327 <Field int biz.bookdesign.librivox.a.c.country_array>
	//   70  149:invokevirtual   #333 <Method String[] Resources.getStringArray(int)>
	//   71  152:astore          6
			int j = Arrays.asList(((Object []) (getResources().getStringArray(biz.bookdesign.librivox.a.c.iso_3166_2)))).indexOf(((Object) (((String) (obj)).toUpperCase(Locale.US))));
	//   72  154:aload_0         
	//   73  155:invokevirtual   #322 <Method Resources getResources()>
	//   74  158:getstatic       #336 <Field int biz.bookdesign.librivox.a.c.iso_3166_2>
	//   75  161:invokevirtual   #333 <Method String[] Resources.getStringArray(int)>
	//   76  164:invokestatic    #526 <Method List Arrays.asList(Object[])>
	//   77  167:aload           4
	//   78  169:getstatic       #532 <Field Locale Locale.US>
	//   79  172:invokevirtual   #536 <Method String String.toUpperCase(Locale)>
	//   80  175:invokeinterface #540 <Method int List.indexOf(Object)>
	//   81  180:istore_2        
			if(j > -1)
	//*  82  181:iload_2         
	//*  83  182:iconst_m1       
	//*  84  183:icmple          238
			{
				obj = ((Object) (new StringBuilder()));
	//   85  186:new             #44  <Class StringBuilder>
	//   86  189:dup             
	//   87  190:invokespecial   #45  <Method void StringBuilder()>
	//   88  193:astore          4
				((StringBuilder) (obj)).append(getString(k.current_country));
	//   89  195:aload           4
	//   90  197:aload_0         
	//   91  198:getstatic       #543 <Field int k.current_country>
	//   92  201:invokevirtual   #55  <Method String getString(int)>
	//   93  204:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   94  207:pop             
				((StringBuilder) (obj)).append(' ');
	//   95  208:aload           4
	//   96  210:bipush          32
	//   97  212:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   98  215:pop             
				((StringBuilder) (obj)).append(as[j]);
	//   99  216:aload           4
	//  100  218:aload           6
	//  101  220:iload_2         
	//  102  221:aaload          
	//  103  222:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  104  225:pop             
				((Preference) (bundle)).setSummary(((CharSequence) (((StringBuilder) (obj)).toString())));
	//  105  226:aload_1         
	//  106  227:aload           4
	//  107  229:invokevirtual   #68  <Method String StringBuilder.toString()>
	//  108  232:invokevirtual   #215 <Method void Preference.setSummary(CharSequence)>
			} else
	//* 109  235:goto            286
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  110  238:new             #44  <Class StringBuilder>
	//  111  241:dup             
	//  112  242:invokespecial   #45  <Method void StringBuilder()>
	//  113  245:astore          6
				stringbuilder.append("Country code ");
	//  114  247:aload           6
	//  115  249:ldc2            #545 <String "Country code ">
	//  116  252:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  117  255:pop             
				stringbuilder.append(((String) (obj)));
	//  118  256:aload           6
	//  119  258:aload           4
	//  120  260:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  121  263:pop             
				stringbuilder.append(" not found.");
	//  122  264:aload           6
	//  123  266:ldc2            #547 <String " not found.">
	//  124  269:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  125  272:pop             
				com.crashlytics.android.a.a(6, "LibriVox", stringbuilder.toString());
	//  126  273:bipush          6
	//  127  275:ldc2            #549 <String "LibriVox">
	//  128  278:aload           6
	//  129  280:invokevirtual   #68  <Method String StringBuilder.toString()>
	//  130  283:invokestatic    #554 <Method void com.crashlytics.android.a.a(int, String, String)>
			}
		}
		((Preference) (bundle)).setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new fq(this))));
	//  131  286:aload_1         
	//  132  287:new             #556 <Class fq>
	//  133  290:dup             
	//  134  291:aload_0         
	//  135  292:invokespecial   #557 <Method void fq(SettingsFragment)>
	//  136  295:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		bundle = ((Bundle) ((PreferenceCategory)findPreference("network")));
	//  137  298:aload_0         
	//  138  299:ldc2            #559 <String "network">
	//  139  302:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//  140  305:checkcast       #132 <Class PreferenceCategory>
	//  141  308:astore_1        
		obj = ((Object) (findPreference("download_location")));
	//  142  309:aload_0         
	//  143  310:ldc2            #561 <String "download_location">
	//  144  313:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//  145  316:astore          4
		if(biz.bookdesign.catalogbase.support.a.b(((android.content.Context) (b))))
	//* 146  318:aload_0         
	//* 147  319:getfield        #25  <Field SettingsActivity b>
	//* 148  322:invokestatic    #566 <Method boolean biz.bookdesign.catalogbase.support.a.b(android.content.Context)>
	//* 149  325:ifeq            344
			((Preference) (obj)).setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new fr(this))));
	//  150  328:aload           4
	//  151  330:new             #568 <Class fr>
	//  152  333:dup             
	//  153  334:aload_0         
	//  154  335:invokespecial   #569 <Method void fr(SettingsFragment)>
	//  155  338:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		else
	//* 156  341:goto            351
			((PreferenceCategory) (bundle)).removePreference(((Preference) (obj)));
	//  157  344:aload_1         
	//  158  345:aload           4
	//  159  347:invokevirtual   #185 <Method boolean PreferenceCategory.removePreference(Preference)>
	//  160  350:pop             
		findPreference("remove_downloads").setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new fs(this))));
	//  161  351:aload_0         
	//  162  352:ldc2            #571 <String "remove_downloads">
	//  163  355:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//  164  358:new             #573 <Class fs>
	//  165  361:dup             
	//  166  362:aload_0         
	//  167  363:invokespecial   #574 <Method void fs(SettingsFragment)>
	//  168  366:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		findPreference("reset_saved_data").setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new ft(this))));
	//  169  369:aload_0         
	//  170  370:ldc2            #576 <String "reset_saved_data">
	//  171  373:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//  172  376:new             #578 <Class ft>
	//  173  379:dup             
	//  174  380:aload_0         
	//  175  381:invokespecial   #579 <Method void ft(SettingsFragment)>
	//  176  384:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		findPreference("about_librivox").setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new fu(this))));
	//  177  387:aload_0         
	//  178  388:ldc2            #581 <String "about_librivox">
	//  179  391:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//  180  394:new             #583 <Class fu>
	//  181  397:dup             
	//  182  398:aload_0         
	//  183  399:invokespecial   #584 <Method void fu(SettingsFragment)>
	//  184  402:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		findPreference("rate_app").setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new fv(this))));
	//  185  405:aload_0         
	//  186  406:ldc2            #586 <String "rate_app">
	//  187  409:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//  188  412:new             #588 <Class fv>
	//  189  415:dup             
	//  190  416:aload_0         
	//  191  417:invokespecial   #589 <Method void fv(SettingsFragment)>
	//  192  420:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		obj = "";
	//  193  423:ldc1            #205 <String "">
	//  194  425:astore          4
		i1 = 0;
	//  195  427:iconst_0        
	//  196  428:istore_2        
		bundle = ((Bundle) (obj));
	//  197  429:aload           4
	//  198  431:astore_1        
		PackageInfo packageinfo = b.getPackageManager().getPackageInfo(b.getPackageName(), 0);
	//  199  432:aload_0         
	//  200  433:getfield        #25  <Field SettingsActivity b>
	//  201  436:invokevirtual   #87  <Method PackageManager SettingsActivity.getPackageManager()>
	//  202  439:aload_0         
	//  203  440:getfield        #25  <Field SettingsActivity b>
	//  204  443:invokevirtual   #592 <Method String SettingsActivity.getPackageName()>
	//  205  446:iconst_0        
	//  206  447:invokevirtual   #596 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//  207  450:astore          6
		bundle = ((Bundle) (obj));
	//  208  452:aload           4
	//  209  454:astore_1        
		obj = ((Object) (packageinfo.versionName));
	//  210  455:aload           6
	//  211  457:getfield        #602 <Field String PackageInfo.versionName>
	//  212  460:astore          4
		bundle = ((Bundle) (obj));
	//  213  462:aload           4
	//  214  464:astore_1        
		int j1 = packageinfo.versionCode;
	//  215  465:aload           6
	//  216  467:getfield        #605 <Field int PackageInfo.versionCode>
	//  217  470:istore_3        
		bundle = ((Bundle) (obj));
	//  218  471:aload           4
	//  219  473:astore_1        
		i1 = j1;
	//  220  474:iload_3         
	//  221  475:istore_2        
		break MISSING_BLOCK_LABEL_497;
	//  222  476:goto            497
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		namenotfoundexception;
	//  223  479:astore          4
		com.crashlytics.android.a.a(6, "LibriVox", "Unable to retrieve app version data");
	//  224  481:bipush          6
	//  225  483:ldc2            #549 <String "LibriVox">
	//  226  486:ldc2            #607 <String "Unable to retrieve app version data">
	//  227  489:invokestatic    #554 <Method void com.crashlytics.android.a.a(int, String, String)>
		com.crashlytics.android.a.a(((Throwable) (namenotfoundexception)));
	//  228  492:aload           4
	//  229  494:invokestatic    #610 <Method void com.crashlytics.android.a.a(Throwable)>
		findPreference("feedback").setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new ew(this, ((String) (bundle))))));
	//  230  497:aload_0         
	//  231  498:ldc2            #612 <String "feedback">
	//  232  501:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//  233  504:new             #614 <Class ew>
	//  234  507:dup             
	//  235  508:aload_0         
	//  236  509:aload_1         
	//  237  510:invokespecial   #617 <Method void ew(SettingsFragment, String)>
	//  238  513:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		Preference preference = findPreference("about_app");
	//  239  516:aload_0         
	//  240  517:ldc2            #619 <String "about_app">
	//  241  520:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//  242  523:astore          4
		StringBuilder stringbuilder1 = new StringBuilder();
	//  243  525:new             #44  <Class StringBuilder>
	//  244  528:dup             
	//  245  529:invokespecial   #45  <Method void StringBuilder()>
	//  246  532:astore          6
		stringbuilder1.append(getString(k.app_name));
	//  247  534:aload           6
	//  248  536:aload_0         
	//  249  537:getstatic       #622 <Field int k.app_name>
	//  250  540:invokevirtual   #55  <Method String getString(int)>
	//  251  543:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  252  546:pop             
		stringbuilder1.append(' ');
	//  253  547:aload           6
	//  254  549:bipush          32
	//  255  551:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//  256  554:pop             
		stringbuilder1.append(((String) (bundle)));
	//  257  555:aload           6
	//  258  557:aload_1         
	//  259  558:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  260  561:pop             
		stringbuilder1.append(" (Release ");
	//  261  562:aload           6
	//  262  564:ldc2            #624 <String " (Release ">
	//  263  567:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//  264  570:pop             
		stringbuilder1.append(i1);
	//  265  571:aload           6
	//  266  573:iload_2         
	//  267  574:invokevirtual   #627 <Method StringBuilder StringBuilder.append(int)>
	//  268  577:pop             
		stringbuilder1.append(')');
	//  269  578:aload           6
	//  270  580:bipush          41
	//  271  582:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//  272  585:pop             
		preference.setSummary(((CharSequence) (stringbuilder1.toString())));
	//  273  586:aload           4
	//  274  588:aload           6
	//  275  590:invokevirtual   #68  <Method String StringBuilder.toString()>
	//  276  593:invokevirtual   #215 <Method void Preference.setSummary(CharSequence)>
		preference.setOnPreferenceClickListener(((android.preference.Preference.OnPreferenceClickListener) (new ex(this))));
	//  277  596:aload           4
	//  278  598:new             #629 <Class ex>
	//  279  601:dup             
	//  280  602:aload_0         
	//  281  603:invokespecial   #630 <Method void ex(SettingsFragment)>
	//  282  606:invokevirtual   #181 <Method void Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener)>
		bundle = ((Bundle) (findPreference("show_paid")));
	//  283  609:aload_0         
	//  284  610:ldc2            #632 <String "show_paid">
	//  285  613:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//  286  616:astore_1        
		if(!biz.bookdesign.librivox.SettingsActivity.c(((android.content.Context) (b))))
	//* 287  617:aload_0         
	//* 288  618:getfield        #25  <Field SettingsActivity b>
	//* 289  621:invokestatic    #634 <Method boolean biz.bookdesign.librivox.SettingsActivity.c(android.content.Context)>
	//* 290  624:ifne            634
			preferencecategory.removePreference(((Preference) (bundle)));
	//  291  627:aload           5
	//  292  629:aload_1         
	//  293  630:invokevirtual   #185 <Method boolean PreferenceCategory.removePreference(Preference)>
	//  294  633:pop             
		((Preference) (bundle)).setOnPreferenceChangeListener(((android.preference.Preference.OnPreferenceChangeListener) (new ey(this))));
	//  295  634:aload_1         
	//  296  635:new             #636 <Class ey>
	//  297  638:dup             
	//  298  639:aload_0         
	//  299  640:invokespecial   #637 <Method void ey(SettingsFragment)>
	//  300  643:invokevirtual   #641 <Method void Preference.setOnPreferenceChangeListener(android.preference.Preference$OnPreferenceChangeListener)>
		findPreference("family_friendly").setOnPreferenceChangeListener(((android.preference.Preference.OnPreferenceChangeListener) (new ez(this))));
	//  301  646:aload_0         
	//  302  647:ldc2            #643 <String "family_friendly">
	//  303  650:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//  304  653:new             #645 <Class ez>
	//  305  656:dup             
	//  306  657:aload_0         
	//  307  658:invokespecial   #646 <Method void ez(SettingsFragment)>
	//  308  661:invokevirtual   #641 <Method void Preference.setOnPreferenceChangeListener(android.preference.Preference$OnPreferenceChangeListener)>
		bundle = ((Bundle) (findPreference("normalize_volume")));
	//  309  664:aload_0         
	//  310  665:ldc1            #227 <String "normalize_volume">
	//  311  667:invokevirtual   #130 <Method Preference findPreference(CharSequence)>
	//  312  670:astore_1        
		if(android.os.Build.VERSION.SDK_INT < 19)
	//* 313  671:getstatic       #651 <Field int android.os.Build$VERSION.SDK_INT>
	//* 314  674:bipush          19
	//* 315  676:icmpge          687
		{
			preferencecategory.removePreference(((Preference) (bundle)));
	//  316  679:aload           5
	//  317  681:aload_1         
	//  318  682:invokevirtual   #185 <Method boolean PreferenceCategory.removePreference(Preference)>
	//  319  685:pop             
			return;
	//  320  686:return          
		} else
		{
			d();
	//  321  687:aload_0         
	//  322  688:invokespecial   #470 <Method void d()>
			((Preference) (bundle)).setOnPreferenceChangeListener(((android.preference.Preference.OnPreferenceChangeListener) (new fa(this))));
	//  323  691:aload_1         
	//  324  692:new             #653 <Class fa>
	//  325  695:dup             
	//  326  696:aload_0         
	//  327  697:invokespecial   #654 <Method void fa(SettingsFragment)>
	//  328  700:invokevirtual   #641 <Method void Preference.setOnPreferenceChangeListener(android.preference.Preference$OnPreferenceChangeListener)>
			return;
	//  329  703:return          
		}
	}

	public void onActivityResult(int j, int i1, Intent intent)
	{
		if(j == 0x800813)
	//*   0    0:iload_1         
	//*   1    1:ldc2            #657 <Int 0x800813>
	//*   2    4:icmpne          12
		{
			c();
	//    3    7:aload_0         
	//    4    8:invokespecial   #514 <Method void c()>
			return;
	//    5   11:return          
		} else
		{
			a.a(j, i1, intent);
	//    6   12:aload_0         
	//    7   13:getfield        #146 <Field d a>
	//    8   16:iload_1         
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:invokevirtual   #660 <Method boolean d.a(int, int, Intent)>
	//   12   22:pop             
			return;
	//   13   23:return          
		}
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #663 <Method void PreferenceFragment.onDestroy()>
		d d1 = a;
	//    2    4:aload_0         
	//    3    5:getfield        #146 <Field d a>
	//    4    8:astore_1        
		if(d1 != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			d1.b();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #664 <Method void d.b()>
		a = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #146 <Field d a>
	//   12   22:return          
	}

	private d a;
	private SettingsActivity b;
	private biz.bookdesign.librivox.support.a.i c;
}
