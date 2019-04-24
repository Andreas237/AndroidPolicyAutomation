// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.AssetInfo;
import com.irobot.core.ViewId;
import com.irobot.home.b.j;
import com.irobot.home.model.a;
import com.irobot.home.model.rest.CommonQuestionList;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.o;
import java.util.Locale;
import org.c.f.a.b;
import org.c.f.a.d;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, ContactTableViewActivity_

public class QuestionsListActivity extends BaseFragmentActivity
{

	public QuestionsListActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	public void a(CommonQuestionList commonquestionlist)
	{
		if(commonquestionlist.commonQuestions != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #28  <Field java.util.List CommonQuestionList.commonQuestions>
	//*   2    4:ifnull          30
		{
			commonquestionlist = ((CommonQuestionList) (new j(((android.content.Context) (this)), 0x7f0b008c, commonquestionlist.commonQuestions)));
	//    3    7:new             #30  <Class j>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:ldc1            #31  <Int 0x7f0b008c>
	//    7   14:aload_1         
	//    8   15:getfield        #28  <Field java.util.List CommonQuestionList.commonQuestions>
	//    9   18:invokespecial   #34  <Method void j(android.content.Context, int, java.util.List)>
	//   10   21:astore_1        
			a.setAdapter(((android.widget.ListAdapter) (commonquestionlist)));
	//   11   22:aload_0         
	//   12   23:getfield        #36  <Field ListView a>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #42  <Method void ListView.setAdapter(android.widget.ListAdapter)>
		}
	//   15   30:return          
	}

	public void e()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(d).a();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String d>
	//    2    4:invokestatic    #49  <Method a com.irobot.home.util.j.a(String)>
	//    3    7:invokevirtual   #54  <Method AssetInfo a.a()>
	//    4   10:astore_1        
		b(0x7f0f01ff);
	//    5   11:aload_0         
	//    6   12:ldc1            #55  <Int 0x7f0f01ff>
	//    7   14:invokevirtual   #58  <Method void b(int)>
		((TextView)c.findViewById(0x7f09019d)).setText(0x7f0f0074);
	//    8   17:aload_0         
	//    9   18:getfield        #60  <Field View c>
	//   10   21:ldc1            #61  <Int 0x7f09019d>
	//   11   23:invokevirtual   #67  <Method View View.findViewById(int)>
	//   12   26:checkcast       #69  <Class TextView>
	//   13   29:ldc1            #70  <Int 0x7f0f0074>
	//   14   31:invokevirtual   #73  <Method void TextView.setText(int)>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.CommonQuestions, assetinfo);
	//   15   34:invokestatic    #79  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   16   37:getstatic       #85  <Field ViewId ViewId.CommonQuestions>
	//   17   40:aload_1         
	//   18   41:invokevirtual   #89  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   19   44:return          
	}

	public void f()
	{
		try
		{
			Locale locale = Locale.getDefault();
	//    0    0:invokestatic    #98  <Method Locale Locale.getDefault()>
	//    1    3:astore_3        
			String s = com.irobot.home.util.j.a(d).a().getSku();
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field String d>
	//    4    8:invokestatic    #49  <Method a com.irobot.home.util.j.a(String)>
	//    5   11:invokevirtual   #54  <Method AssetInfo a.a()>
	//    6   14:invokevirtual   #104 <Method String AssetInfo.getSku()>
	//    7   17:astore          4
			a(e.getHelpCommonQuestionsList(com.irobot.home.util.j.a(locale), com.irobot.home.util.j.h(((android.content.Context) (this))), s));
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #106 <Field CustomerCareRestClient e>
	//   11   24:aload_3         
	//   12   25:invokestatic    #109 <Method String com.irobot.home.util.j.a(Locale)>
	//   13   28:aload_0         
	//   14   29:invokestatic    #113 <Method String com.irobot.home.util.j.h(android.content.Context)>
	//   15   32:aload           4
	//   16   34:invokeinterface #119 <Method CommonQuestionList CustomerCareRestClient.getHelpCommonQuestionsList(String, String, String)>
	//   17   39:invokevirtual   #121 <Method void a(CommonQuestionList)>
			return;
	//   18   42:return          
		}
		catch(Exception exception)
	//*  19   43:astore_3        
		{
			boolean flag = com.irobot.home.util.j.a();
	//   20   44:invokestatic    #124 <Method boolean com.irobot.home.util.j.a()>
	//   21   47:istore_2        
			int i = 0x7f0f0925;
	//   22   48:ldc1            #125 <Int 0x7f0f0925>
	//   23   50:istore_1        
			if(!flag)
	//*  24   51:iload_2         
	//*  25   52:ifne            61
				i = 0x7f0f04db;
	//   26   55:ldc1            #126 <Int 0x7f0f04db>
	//   27   57:istore_1        
			else
	//*  28   58:goto            81
			if(!(exception instanceof b) && (exception instanceof d))
	//*  29   61:aload_3         
	//*  30   62:instanceof      #128 <Class b>
	//*  31   65:ifeq            71
	//*  32   68:goto            81
	//*  33   71:aload_3         
	//*  34   72:instanceof      #130 <Class d>
	//*  35   75:ifeq            81
				i = 0x7f0f01d9;
	//   36   78:ldc1            #131 <Int 0x7f0f01d9>
	//   37   80:istore_1        
			f(i);
	//   38   81:aload_0         
	//   39   82:iload_1         
	//   40   83:invokevirtual   #133 <Method void f(int)>
			StringBuilder stringbuilder = new StringBuilder();
	//   41   86:new             #135 <Class StringBuilder>
	//   42   89:dup             
	//   43   90:invokespecial   #136 <Method void StringBuilder()>
	//   44   93:astore          4
			stringbuilder.append("Error in getHelpCommonQuestionsList: ");
	//   45   95:aload           4
	//   46   97:ldc1            #138 <String "Error in getHelpCommonQuestionsList: ">
	//   47   99:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   48  102:pop             
			stringbuilder.append(exception.getMessage());
	//   49  103:aload           4
	//   50  105:aload_3         
	//   51  106:invokevirtual   #145 <Method String Exception.getMessage()>
	//   52  109:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   53  112:pop             
			o.e("QuestionsListActivity", stringbuilder.toString());
	//   54  113:ldc1            #147 <String "QuestionsListActivity">
	//   55  115:aload           4
	//   56  117:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   57  120:invokestatic    #155 <Method void o.e(String, String)>
			return;
	//   58  123:return          
		}
	}

	public void f(int i)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #158 <Method boolean isFinishing()>
	//*   2    4:ifne            53
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #161 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			AlertDialog alertdialog = (new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(i).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).create();
	//    7   15:new             #163 <Class android.app.AlertDialog$Builder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #166 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #170 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   13   27:ldc1            #171 <Int 0x7f0f05bb>
	//   14   29:aconst_null     
	//   15   30:invokevirtual   #175 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   16   33:invokevirtual   #179 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   17   36:astore_2        
			alertdialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

				public void onDismiss(DialogInterface dialoginterface)
				{
					a.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field QuestionsListActivity a>
				//    2    4:invokevirtual   #26  <Method void QuestionsListActivity.finish()>
				//    3    7:return          
				}

				final QuestionsListActivity a;

			
			{
				a = QuestionsListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field QuestionsListActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   18   37:aload_2         
	//   19   38:new             #6   <Class QuestionsListActivity$1>
	//   20   41:dup             
	//   21   42:aload_0         
	//   22   43:invokespecial   #182 <Method void QuestionsListActivity$1(QuestionsListActivity)>
	//   23   46:invokevirtual   #188 <Method void AlertDialog.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
			alertdialog.show();
	//   24   49:aload_2         
	//   25   50:invokevirtual   #191 <Method void AlertDialog.show()>
		}
	//   26   53:return          
	}

	public void g()
	{
		com.irobot.home.ContactTableViewActivity_.a(((android.content.Context) (this))).a(d).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #197 <Method ContactTableViewActivity_$a com.irobot.home.ContactTableViewActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field String d>
	//    4    8:invokevirtual   #202 <Method ContactTableViewActivity_$a com.irobot.home.ContactTableViewActivity_$a.a(String)>
	//    5   11:invokevirtual   #205 <Method org.androidannotations.api.a.e com.irobot.home.ContactTableViewActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #209 <Method void BaseFragmentActivity.onCreate(Bundle)>
		e = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokestatic    #213 <Method CustomerCareRestClient com.irobot.home.util.j.i(android.content.Context)>
	//    6   10:putfield        #106 <Field CustomerCareRestClient e>
		f();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #215 <Method void f()>
	//    9   17:return          
	}

	protected ListView a;
	ScrollView b;
	View c;
	String d;
	CustomerCareRestClient e;
}
