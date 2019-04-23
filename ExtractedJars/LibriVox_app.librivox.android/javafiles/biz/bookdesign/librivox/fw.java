// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.p;
import android.support.v4.app.x;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.i;
import biz.bookdesign.librivox.a.l;

// Referenced classes of package biz.bookdesign.librivox:
//			fz, SettingsActivity, fy, fx

public class fw extends p
{

	public fw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void p()>
	//    2    4:return          
	}

	static Runnable a(fw fw1)
	{
		return fw1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Runnable a>
	//    2    4:areturn         
	}

	static void a(Context context, String s, Runnable runnable)
	{
		android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
	//    0    0:aload_0         
	//    1    1:invokestatic    #21  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    2    4:invokeinterface #27  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_3        
		editor.putString("biz.bookdesign.librivox.displayname", s);
	//    4   10:aload_3         
	//    5   11:ldc1            #29  <String "biz.bookdesign.librivox.displayname">
	//    6   13:aload_1         
	//    7   14:invokeinterface #35  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    8   19:pop             
		editor.apply();
	//    9   20:aload_3         
	//   10   21:invokeinterface #38  <Method void android.content.SharedPreferences$Editor.apply()>
		(new fz(context, s, editor, runnable)).execute(((Object []) (new Void[0])));
	//   11   26:new             #40  <Class fz>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:aload_3         
	//   16   33:aload_2         
	//   17   34:invokespecial   #43  <Method void fz(Context, String, android.content.SharedPreferences$Editor, Runnable)>
	//   18   37:iconst_0        
	//   19   38:anewarray       Void[]
	//   20   41:invokevirtual   #49  <Method android.os.AsyncTask fz.execute(Object[])>
	//   21   44:pop             
	//   22   45:return          
	}

	public static void a(x x1, Runnable runnable)
	{
		Object obj = ((Object) (PreferenceManager.getDefaultSharedPreferences(((Context) (x1)))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #21  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    2    4:astore_2        
		if(!((SharedPreferences) (obj)).contains("biz.bookdesign.librivox.displayname"))
	//*   3    5:aload_2         
	//*   4    6:ldc1            #29  <String "biz.bookdesign.librivox.displayname">
	//*   5    8:invokeinterface #54  <Method boolean SharedPreferences.contains(String)>
	//*   6   13:ifne            40
		{
			obj = ((Object) (new fw()));
	//    7   16:new             #2   <Class fw>
	//    8   19:dup             
	//    9   20:invokespecial   #55  <Method void fw()>
	//   10   23:astore_2        
			((fw) (obj)).a(runnable);
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:invokevirtual   #58  <Method void a(Runnable)>
			((fw) (obj)).show(x1.getSupportFragmentManager(), "USER_NAME_DIALOG");
	//   14   29:aload_2         
	//   15   30:aload_0         
	//   16   31:invokevirtual   #64  <Method android.support.v4.app.ae x.getSupportFragmentManager()>
	//   17   34:ldc1            #66  <String "USER_NAME_DIALOG">
	//   18   36:invokevirtual   #70  <Method void show(android.support.v4.app.ae, String)>
			return;
	//   19   39:return          
		}
		if(!((SharedPreferences) (obj)).getBoolean("biz.bookdesign.librivox.displaynamesynced", false))
	//*  20   40:aload_2         
	//*  21   41:ldc1            #72  <String "biz.bookdesign.librivox.displaynamesynced">
	//*  22   43:iconst_0        
	//*  23   44:invokeinterface #76  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*  24   49:ifne            73
		{
			obj = ((Object) (((SharedPreferences) (obj)).getString("biz.bookdesign.librivox.displayname", "")));
	//   25   52:aload_2         
	//   26   53:ldc1            #29  <String "biz.bookdesign.librivox.displayname">
	//   27   55:ldc1            #78  <String "">
	//   28   57:invokeinterface #82  <Method String SharedPreferences.getString(String, String)>
	//   29   62:astore_2        
			a(x1.getApplicationContext(), ((String) (obj)), runnable);
	//   30   63:aload_0         
	//   31   64:invokevirtual   #86  <Method Context x.getApplicationContext()>
	//   32   67:aload_2         
	//   33   68:aload_1         
	//   34   69:invokestatic    #88  <Method void a(Context, String, Runnable)>
			return;
	//   35   72:return          
		} else
		{
			runnable.run();
	//   36   73:aload_1         
	//   37   74:invokeinterface #93  <Method void Runnable.run()>
			return;
	//   38   79:return          
		}
	}

	public void a(Runnable runnable)
	{
		a = runnable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Runnable a>
	//    3    5:return          
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		bundle = ((Bundle) (new android.support.v7.app.AlertDialog.Builder(((Context) (getActivity())), l.LVDialogTheme)));
	//    0    0:new             #97  <Class android.support.v7.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #101 <Method x getActivity()>
	//    4    8:getstatic       #107 <Field int l.LVDialogTheme>
	//    5   11:invokespecial   #110 <Method void android.support.v7.app.AlertDialog$Builder(Context, int)>
	//    6   14:astore_1        
		View view = getActivity().getLayoutInflater().inflate(i.user_name_dialog, ((android.view.ViewGroup) (null)));
	//    7   15:aload_0         
	//    8   16:invokevirtual   #101 <Method x getActivity()>
	//    9   19:invokevirtual   #114 <Method LayoutInflater x.getLayoutInflater()>
	//   10   22:getstatic       #119 <Field int i.user_name_dialog>
	//   11   25:aconst_null     
	//   12   26:invokevirtual   #125 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   13   29:astore_2        
		EditText edittext = (EditText)view.findViewById(h.user_name);
	//   14   30:aload_2         
	//   15   31:getstatic       #130 <Field int h.user_name>
	//   16   34:invokevirtual   #136 <Method View View.findViewById(int)>
	//   17   37:checkcast       #138 <Class EditText>
	//   18   40:astore_3        
		edittext.setText(((CharSequence) (SettingsActivity.e(getContext()))));
	//   19   41:aload_3         
	//   20   42:aload_0         
	//   21   43:invokevirtual   #141 <Method Context getContext()>
	//   22   46:invokestatic    #147 <Method String SettingsActivity.e(Context)>
	//   23   49:invokevirtual   #151 <Method void EditText.setText(CharSequence)>
		((android.support.v7.app.AlertDialog.Builder) (bundle)).setView(view).setPositiveButton(0x104000a, ((android.content.DialogInterface.OnClickListener) (new fy(this, edittext)))).setNegativeButton(0x1040000, ((android.content.DialogInterface.OnClickListener) (new fx(this))));
	//   24   52:aload_1         
	//   25   53:aload_2         
	//   26   54:invokevirtual   #155 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setView(View)>
	//   27   57:ldc1            #156 <Int 0x104000a>
	//   28   59:new             #158 <Class fy>
	//   29   62:dup             
	//   30   63:aload_0         
	//   31   64:aload_3         
	//   32   65:invokespecial   #161 <Method void fy(fw, EditText)>
	//   33   68:invokevirtual   #165 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   34   71:ldc1            #166 <Int 0x1040000>
	//   35   73:new             #168 <Class fx>
	//   36   76:dup             
	//   37   77:aload_0         
	//   38   78:invokespecial   #171 <Method void fx(fw)>
	//   39   81:invokevirtual   #174 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   40   84:pop             
		return ((Dialog) (((android.support.v7.app.AlertDialog.Builder) (bundle)).create()));
	//   41   85:aload_1         
	//   42   86:invokevirtual   #178 <Method android.support.v7.app.AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   43   89:areturn         
	}

	private Runnable a;
}
