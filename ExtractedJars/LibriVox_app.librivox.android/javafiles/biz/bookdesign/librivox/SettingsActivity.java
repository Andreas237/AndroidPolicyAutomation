// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.a.g;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.MenuItem;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.i;
import biz.bookdesign.librivox.a.k;
import biz.bookdesign.librivox.b.j;
import biz.bookdesign.librivox.support.a.d;
import biz.bookdesign.librivox.support.e;
import com.crashlytics.android.a;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package biz.bookdesign.librivox:
//			SettingsFragment

public class SettingsActivity extends AppCompatActivity
{

	public SettingsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	public static String a(Context context)
	{
		String s;
		SharedPreferences sharedpreferences;
		sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #22  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    2    4:astore_3        
		s = sharedpreferences.getString("country", ((String) (null)));
	//    3    5:aload_3         
	//    4    6:ldc1            #24  <String "country">
	//    5    8:aconst_null     
	//    6    9:invokeinterface #30  <Method String SharedPreferences.getString(String, String)>
	//    7   14:astore_2        
		if(s != null)
	//*   8   15:aload_2         
	//*   9   16:ifnull          21
			return s;
	//   10   19:aload_2         
	//   11   20:areturn         
		Object obj;
		Object obj2;
		obj2 = ((Object) ((TelephonyManager)context.getSystemService("phone")));
	//   12   21:aload_0         
	//   13   22:ldc1            #32  <String "phone">
	//   14   24:invokevirtual   #38  <Method Object Context.getSystemService(String)>
	//   15   27:checkcast       #40  <Class TelephonyManager>
	//   16   30:astore          4
		obj = ((Object) (((TelephonyManager) (obj2)).getSimCountryIso()));
	//   17   32:aload           4
	//   18   34:invokevirtual   #44  <Method String TelephonyManager.getSimCountryIso()>
	//   19   37:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_61;
	//   20   38:aload_1         
	//   21   39:ifnull          61
		if(((String) (obj)).length() == 2)
	//*  22   42:aload_1         
	//*  23   43:invokevirtual   #50  <Method int String.length()>
	//*  24   46:iconst_2        
	//*  25   47:icmpne          61
		{
			obj = ((Object) (((String) (obj)).toLowerCase(Locale.US)));
	//   26   50:aload_1         
	//   27   51:getstatic       #56  <Field Locale Locale.US>
	//   28   54:invokevirtual   #60  <Method String String.toLowerCase(Locale)>
	//   29   57:astore_1        
			break MISSING_BLOCK_LABEL_125;
	//   30   58:goto            125
		}
		obj = ((Object) (s));
	//   31   61:aload_2         
	//   32   62:astore_1        
		if(((TelephonyManager) (obj2)).getPhoneType() == 2)
			break MISSING_BLOCK_LABEL_125;
	//   33   63:aload           4
	//   34   65:invokevirtual   #63  <Method int TelephonyManager.getPhoneType()>
	//   35   68:iconst_2        
	//   36   69:icmpeq          125
		obj2 = ((Object) (((TelephonyManager) (obj2)).getNetworkCountryIso()));
	//   37   72:aload           4
	//   38   74:invokevirtual   #66  <Method String TelephonyManager.getNetworkCountryIso()>
	//   39   77:astore          4
		obj = ((Object) (s));
	//   40   79:aload_2         
	//   41   80:astore_1        
		if(obj2 != null)
	//*  42   81:aload           4
	//*  43   83:ifnull          125
		{
			obj = ((Object) (s));
	//   44   86:aload_2         
	//   45   87:astore_1        
			try
			{
				if(((String) (obj2)).length() == 2)
	//*  46   88:aload           4
	//*  47   90:invokevirtual   #50  <Method int String.length()>
	//*  48   93:iconst_2        
	//*  49   94:icmpne          125
					obj = ((Object) (((String) (obj2)).toLowerCase(Locale.US)));
	//   50   97:aload           4
	//   51   99:getstatic       #56  <Field Locale Locale.US>
	//   52  102:invokevirtual   #60  <Method String String.toLowerCase(Locale)>
	//   53  105:astore_1        
			}
	//*  54  106:goto            125
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  55  109:astore_1        
			{
				com.crashlytics.android.a.a(6, "LibriVox", "Error getting user country from telephony manager");
	//   56  110:bipush          6
	//   57  112:ldc1            #68  <String "LibriVox">
	//   58  114:ldc1            #70  <String "Error getting user country from telephony manager">
	//   59  116:invokestatic    #75  <Method void a.a(int, String, String)>
				com.crashlytics.android.a.a(((Throwable) (obj)));
	//   60  119:aload_1         
	//   61  120:invokestatic    #78  <Method void a.a(Throwable)>
				obj = ((Object) (s));
	//   62  123:aload_2         
	//   63  124:astore_1        
			}
		}
		Object obj1 = obj;
	//   64  125:aload_1         
	//   65  126:astore_2        
		if(obj == null)
	//*  66  127:aload_1         
	//*  67  128:ifnonnull       145
			obj1 = ((Object) (context.getResources().getConfiguration().locale.getCountry()));
	//   68  131:aload_0         
	//   69  132:invokevirtual   #82  <Method Resources Context.getResources()>
	//   70  135:invokevirtual   #88  <Method Configuration Resources.getConfiguration()>
	//   71  138:getfield        #93  <Field Locale Configuration.locale>
	//   72  141:invokevirtual   #96  <Method String Locale.getCountry()>
	//   73  144:astore_2        
		context = ((Context) (sharedpreferences.edit()));
	//   74  145:aload_3         
	//   75  146:invokeinterface #100 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   76  151:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putString("country", ((String) (obj1)));
	//   77  152:aload_0         
	//   78  153:ldc1            #24  <String "country">
	//   79  155:aload_2         
	//   80  156:invokeinterface #106 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   81  161:pop             
		((android.content.SharedPreferences.Editor) (context)).apply();
	//   82  162:aload_0         
	//   83  163:invokeinterface #109 <Method void android.content.SharedPreferences$Editor.apply()>
		return ((String) (obj1));
	//   84  168:aload_2         
	//   85  169:areturn         
	}

	public static boolean b(Context context)
	{
		if(!c(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #113 <Method boolean c(Context)>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(android.os.Build.VERSION.SDK_INT < 16)
	//*   5    9:getstatic       #119 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          16
	//*   7   14:icmpge          19
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
		else
			return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("show_paid", true);
	//   10   19:aload_0         
	//   11   20:invokestatic    #22  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//   12   23:ldc1            #121 <String "show_paid">
	//   13   25:iconst_1        
	//   14   26:invokeinterface #125 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   15   31:ireturn         
	}

	public static boolean c(Context context)
	{
		Object obj;
		obj = ((Object) (PreferenceManager.getDefaultSharedPreferences(context).getString("retail_countries", "[\"us\"]")));
	//    0    0:aload_0         
	//    1    1:invokestatic    #22  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    2    4:ldc1            #129 <String "retail_countries">
	//    3    6:ldc1            #131 <String "[\"us\"]">
	//    4    8:invokeinterface #30  <Method String SharedPreferences.getString(String, String)>
	//    5   13:astore_3        
		context = ((Context) (a(context)));
	//    6   14:aload_0         
	//    7   15:invokestatic    #133 <Method String a(Context)>
	//    8   18:astore_0        
		obj = ((Object) (new JSONArray(((String) (obj)))));
	//    9   19:new             #135 <Class JSONArray>
	//   10   22:dup             
	//   11   23:aload_3         
	//   12   24:invokespecial   #138 <Method void JSONArray(String)>
	//   13   27:astore_3        
		int l = 0;
	//   14   28:iconst_0        
	//   15   29:istore_1        
_L2:
		boolean flag;
		if(l >= ((JSONArray) (obj)).length())
			break; /* Loop/switch isn't completed */
	//   16   30:iload_1         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #139 <Method int JSONArray.length()>
	//   19   35:icmpge          70
		flag = ((String) (context)).equalsIgnoreCase(((JSONArray) (obj)).getString(l));
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:iload_1         
	//   23   41:invokevirtual   #142 <Method String JSONArray.getString(int)>
	//   24   44:invokevirtual   #146 <Method boolean String.equalsIgnoreCase(String)>
	//   25   47:istore_2        
		if(flag)
	//*  26   48:iload_2         
	//*  27   49:ifeq            54
			return true;
	//   28   52:iconst_1        
	//   29   53:ireturn         
		l++;
	//   30   54:iload_1         
	//   31   55:iconst_1        
	//   32   56:iadd            
	//   33   57:istore_1        
		if(true) goto _L2; else goto _L1
	//   34   58:goto            30
_L4:
		com.crashlytics.android.a.a(6, "LibriVox", "Unable to parse list of retail countries");
	//   35   61:bipush          6
	//   36   63:ldc1            #68  <String "LibriVox">
	//   37   65:ldc1            #148 <String "Unable to parse list of retail countries">
	//   38   67:invokestatic    #75  <Method void a.a(int, String, String)>
_L1:
		return false;
	//   39   70:iconst_0        
	//   40   71:ireturn         
		context;
	//   41   72:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  42   73:goto            61
	}

	public static boolean d(Context context)
	{
		biz.bookdesign.librivox.support.e.a(context, context.getPackageName());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #152 <Method String Context.getPackageName()>
	//    3    5:invokestatic    #157 <Method void e.a(Context, String)>
		context = ((Context) (PreferenceManager.getDefaultSharedPreferences(context).edit()));
	//    4    8:aload_0         
	//    5    9:invokestatic    #22  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    6   12:invokeinterface #100 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    7   17:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putBoolean("biz.bookdesign.librivox.RATE_ASK", false);
	//    8   18:aload_0         
	//    9   19:ldc1            #159 <String "biz.bookdesign.librivox.RATE_ASK">
	//   10   21:iconst_0        
	//   11   22:invokeinterface #163 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   12   27:pop             
		((android.content.SharedPreferences.Editor) (context)).apply();
	//   13   28:aload_0         
	//   14   29:invokeinterface #109 <Method void android.content.SharedPreferences$Editor.apply()>
		return true;
	//   15   34:iconst_1        
	//   16   35:ireturn         
	}

	public static String e(Context context)
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getString("biz.bookdesign.librivox.displayname", "");
	//    0    0:aload_0         
	//    1    1:invokestatic    #22  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    2    4:ldc1            #166 <String "biz.bookdesign.librivox.displayname">
	//    3    6:ldc1            #168 <String "">
	//    4    8:invokeinterface #30  <Method String SharedPreferences.getString(String, String)>
	//    5   13:areturn         
	}

	public static d f(Context context)
	{
		String s = context.getString(k.play_license_key);
	//    0    0:aload_0         
	//    1    1:getstatic       #175 <Field int k.play_license_key>
	//    2    4:invokevirtual   #176 <Method String Context.getString(int)>
	//    3    7:astore_1        
		if(!"MISSING".equals(((Object) (s))))
	//*   4    8:ldc1            #178 <String "MISSING">
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #182 <Method boolean String.equals(Object)>
	//*   7   14:ifne            27
			return new d(context, s);
	//    8   17:new             #184 <Class d>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokespecial   #186 <Method void d(Context, String)>
	//   13   26:areturn         
		else
			throw new IllegalStateException("License key not configured");
	//   14   27:new             #188 <Class IllegalStateException>
	//   15   30:dup             
	//   16   31:ldc1            #190 <String "License key not configured">
	//   17   33:invokespecial   #191 <Method void IllegalStateException(String)>
	//   18   36:athrow          
	}

	public void a()
	{
		((SettingsFragment)getFragmentManager().findFragmentById(h.settings_fragment)).a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #195 <Method FragmentManager getFragmentManager()>
	//    2    4:getstatic       #200 <Field int h.settings_fragment>
	//    3    7:invokevirtual   #206 <Method Fragment FragmentManager.findFragmentById(int)>
	//    4   10:checkcast       #208 <Class SettingsFragment>
	//    5   13:invokevirtual   #210 <Method void biz.bookdesign.librivox.SettingsFragment.a()>
	//    6   16:return          
	}

	protected void onActivityResult(int l, int i1, Intent intent)
	{
		super.onActivityResult(l, i1, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #214 <Method void AppCompatActivity.onActivityResult(int, int, Intent)>
		Fragment fragment = getFragmentManager().findFragmentByTag("SettingsFragment");
	//    5    7:aload_0         
	//    6    8:invokevirtual   #195 <Method FragmentManager getFragmentManager()>
	//    7   11:ldc1            #216 <String "SettingsFragment">
	//    8   13:invokevirtual   #220 <Method Fragment FragmentManager.findFragmentByTag(String)>
	//    9   16:astore          4
		if(fragment != null)
	//*  10   18:aload           4
	//*  11   20:ifnull          31
			fragment.onActivityResult(l, i1, intent);
	//   12   23:aload           4
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #223 <Method void Fragment.onActivityResult(int, int, Intent)>
	//   17   31:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #227 <Method void AppCompatActivity.onCreate(Bundle)>
		a = new j(getApplicationContext());
	//    3    5:aload_0         
	//    4    6:new             #229 <Class j>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokevirtual   #233 <Method Context getApplicationContext()>
	//    8   14:invokespecial   #236 <Method void j(Context)>
	//    9   17:putfield        #238 <Field j a>
		a.a();
	//   10   20:aload_0         
	//   11   21:getfield        #238 <Field j a>
	//   12   24:invokevirtual   #241 <Method j j.a()>
	//   13   27:pop             
		b = g.a(((Context) (this)));
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:invokestatic    #246 <Method g g.a(Context)>
	//   17   33:putfield        #248 <Field g b>
		setContentView(i.settings_activity);
	//   18   36:aload_0         
	//   19   37:getstatic       #253 <Field int i.settings_activity>
	//   20   40:invokevirtual   #257 <Method void setContentView(int)>
	//   21   43:return          
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method void AppCompatActivity.onDestroy()>
		a.b();
	//    2    4:aload_0         
	//    3    5:getfield        #238 <Field j a>
	//    4    8:invokevirtual   #262 <Method void j.b()>
	//    5   11:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() != 0x102002c)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #269 <Method int MenuItem.getItemId()>
	//*   2    6:ldc2            #270 <Int 0x102002c>
	//*   3    9:icmpeq          14
		{
			return true;
	//    4   12:iconst_1        
	//    5   13:ireturn         
		} else
		{
			finish();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #273 <Method void finish()>
			return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
		}
	}

	j a;
	g b;
}
