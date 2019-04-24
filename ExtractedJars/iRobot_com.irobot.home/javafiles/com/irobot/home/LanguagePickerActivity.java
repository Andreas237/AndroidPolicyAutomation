// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.irobot.home.b.q;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.irobot.home:
//			BaseListActivity, IRobotApplication

public class LanguagePickerActivity extends BaseListActivity
{

	public LanguagePickerActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void BaseListActivity()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field boolean c>
		f = new android.widget.AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView adapterview, View view, int k, long l)
			{
				adapterview = ((AdapterView) ((Locale)i.p.get(k)));
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

			
			{
				a = LanguagePickerActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field LanguagePickerActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    5    9:aload_0         
	//    6   10:new             #6   <Class LanguagePickerActivity$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #23  <Method void LanguagePickerActivity$1(LanguagePickerActivity)>
	//   10   18:putfield        #25  <Field android.widget.AdapterView$OnItemClickListener f>
	//   11   21:return          
	}

	static q a(LanguagePickerActivity languagepickeractivity)
	{
		return languagepickeractivity.e;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field q e>
	//    2    4:areturn         
	}

	private void b()
	{
		Locale locale = j.g(getBaseContext());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method android.content.Context getBaseContext()>
	//    2    4:invokestatic    #41  <Method Locale j.g(android.content.Context)>
	//    3    7:astore_1        
		e = new q(((android.content.Context) (this)), i.p, locale);
	//    4    8:aload_0         
	//    5    9:new             #43  <Class q>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getstatic       #49  <Field List i.p>
	//    9   17:aload_1         
	//   10   18:invokespecial   #52  <Method void q(android.content.Context, List, Locale)>
	//   11   21:putfield        #30  <Field q e>
		getListView().setAdapter(((android.widget.ListAdapter) (e)));
	//   12   24:aload_0         
	//   13   25:invokevirtual   #56  <Method ListView getListView()>
	//   14   28:aload_0         
	//   15   29:getfield        #30  <Field q e>
	//   16   32:invokevirtual   #62  <Method void ListView.setAdapter(android.widget.ListAdapter)>
		getListView().setOnItemClickListener(f);
	//   17   35:aload_0         
	//   18   36:invokevirtual   #56  <Method ListView getListView()>
	//   19   39:aload_0         
	//   20   40:getfield        #25  <Field android.widget.AdapterView$OnItemClickListener f>
	//   21   43:invokevirtual   #66  <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//   22   46:return          
	}

	void a()
	{
		b(0x7f0f0092);
	//    0    0:aload_0         
	//    1    1:ldc1            #67  <Int 0x7f0f0092>
	//    2    3:invokevirtual   #70  <Method void b(int)>
		b();
	//    3    6:aload_0         
	//    4    7:invokespecial   #72  <Method void b()>
	//    5   10:return          
	}

	boolean c;
	IRobotApplication d;
	private q e;
	private android.widget.AdapterView.OnItemClickListener f;
}
