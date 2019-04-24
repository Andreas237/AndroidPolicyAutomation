// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import com.irobot.home.b.q;
import com.irobot.home.util.i;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.irobot.home:
//			LanguagePickerActivity, IRobotApplication

class LanguagePickerActivity$1
	implements android.widget.stener
{

	public void onItemClick(AdapterView adapterview, View view, int j, long l)
	{
		adapterview = ((AdapterView) ((Locale)i.p.get(j)));
	//    0    0:getstatic       #26  <Field List i.p>
	//    1    3:iload_3         
	//    2    4:invokeinterface #32  <Method Object List.get(int)>
	//    3    9:checkcast       #34  <Class Locale>
	//    4   12:astore_1        
		LanguagePickerActivity.a(a).a(((Locale) (adapterview)));
	//    5   13:aload_0         
	//    6   14:getfield        #14  <Field LanguagePickerActivity a>
	//    7   17:invokestatic    #37  <Method q LanguagePickerActivity.a(LanguagePickerActivity)>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #42  <Method void q.a(Locale)>
		a.d.a(((Locale) (adapterview)), Boolean.valueOf(a.c));
	//   10   24:aload_0         
	//   11   25:getfield        #14  <Field LanguagePickerActivity a>
	//   12   28:getfield        #46  <Field IRobotApplication LanguagePickerActivity.d>
	//   13   31:aload_1         
	//   14   32:aload_0         
	//   15   33:getfield        #14  <Field LanguagePickerActivity a>
	//   16   36:getfield        #50  <Field boolean LanguagePickerActivity.c>
	//   17   39:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
	//   18   42:invokevirtual   #61  <Method void IRobotApplication.a(Locale, Boolean)>
		view = ((View) (new Intent()));
	//   19   45:new             #63  <Class Intent>
	//   20   48:dup             
	//   21   49:invokespecial   #64  <Method void Intent()>
	//   22   52:astore_2        
		((Intent) (view)).setData(Uri.parse(((Locale) (adapterview)).getDisplayLanguage()));
	//   23   53:aload_2         
	//   24   54:aload_1         
	//   25   55:invokevirtual   #68  <Method String Locale.getDisplayLanguage()>
	//   26   58:invokestatic    #74  <Method Uri Uri.parse(String)>
	//   27   61:invokevirtual   #78  <Method Intent Intent.setData(Uri)>
	//   28   64:pop             
		a.setResult(-1, ((Intent) (view)));
	//   29   65:aload_0         
	//   30   66:getfield        #14  <Field LanguagePickerActivity a>
	//   31   69:iconst_m1       
	//   32   70:aload_2         
	//   33   71:invokevirtual   #82  <Method void LanguagePickerActivity.setResult(int, Intent)>
		a.finish();
	//   34   74:aload_0         
	//   35   75:getfield        #14  <Field LanguagePickerActivity a>
	//   36   78:invokevirtual   #85  <Method void LanguagePickerActivity.finish()>
	//   37   81:return          
	}

	final LanguagePickerActivity a;

	LanguagePickerActivity$1(LanguagePickerActivity languagepickeractivity)
	{
		a = languagepickeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field LanguagePickerActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
