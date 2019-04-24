// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.pactforcure.app.studies.Res;

// Referenced classes of package com.pactforcure.app.ui:
//			BaseResourceActivity

public class ContactUsResourceActivity extends BaseResourceActivity
{

	public ContactUsResourceActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BaseResourceActivity()>
	//    2    4:return          
	}

	static void lambda$onCreate$7(ContactUsResourceActivity contactusresourceactivity, View view)
	{
		view = ((View) (new Intent("android.intent.action.VIEW")));
	//    0    0:new             #13  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #18  <Method void Intent(String)>
	//    4    9:astore_1        
		((Intent) (view)).setData(Uri.parse((new StringBuilder()).append("http://").append(contactusresourceactivity.getString(0x7f0802b7)).toString()));
	//    5   10:aload_1         
	//    6   11:new             #20  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #21  <Method void StringBuilder()>
	//    9   18:ldc1            #23  <String "http://">
	//   10   20:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:aload_0         
	//   12   24:ldc1            #28  <Int 0x7f0802b7>
	//   13   26:invokevirtual   #32  <Method String getString(int)>
	//   14   29:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   16   35:invokestatic    #42  <Method Uri Uri.parse(String)>
	//   17   38:invokevirtual   #46  <Method Intent Intent.setData(Uri)>
	//   18   41:pop             
		contactusresourceactivity.startActivity(((Intent) (view)));
	//   19   42:aload_0         
	//   20   43:aload_1         
	//   21   44:invokevirtual   #50  <Method void startActivity(Intent)>
	//   22   47:return          
	}

	static void lambda$onCreate$8(ContactUsResourceActivity contactusresourceactivity, View view)
	{
		view = ((View) (new Intent("android.intent.action.SENDTO")));
	//    0    0:new             #13  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #53  <String "android.intent.action.SENDTO">
	//    3    6:invokespecial   #18  <Method void Intent(String)>
	//    4    9:astore_1        
		((Intent) (view)).setData(Uri.parse((new StringBuilder()).append("mailto:").append(contactusresourceactivity.getString(0x7f0802b6)).toString()));
	//    5   10:aload_1         
	//    6   11:new             #20  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #21  <Method void StringBuilder()>
	//    9   18:ldc1            #55  <String "mailto:">
	//   10   20:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:aload_0         
	//   12   24:ldc1            #56  <Int 0x7f0802b6>
	//   13   26:invokevirtual   #32  <Method String getString(int)>
	//   14   29:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   16   35:invokestatic    #42  <Method Uri Uri.parse(String)>
	//   17   38:invokevirtual   #46  <Method Intent Intent.setData(Uri)>
	//   18   41:pop             
		contactusresourceactivity.startActivity(((Intent) (view)));
	//   19   42:aload_0         
	//   20   43:aload_1         
	//   21   44:invokevirtual   #50  <Method void startActivity(Intent)>
	//   22   47:return          
	}

	protected int getLayoutId()
	{
		return 0x7f04001c;
	//    0    0:ldc1            #59  <Int 0x7f04001c>
	//    1    2:ireturn         
	}

	protected String getScreenTitle()
	{
		return Res.getStudySpecificString(0x7f08033b);
	//    0    0:ldc1            #61  <Int 0x7f08033b>
	//    1    2:invokestatic    #66  <Method String Res.getStudySpecificString(int)>
	//    2    5:areturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #71  <Method void BaseResourceActivity.onCreate(Bundle)>
		((TextView)findViewById(0x7f0e00aa)).setText(((CharSequence) (Res.getStudySpecificString(0x7f08020d))));
	//    3    5:aload_0         
	//    4    6:ldc1            #72  <Int 0x7f0e00aa>
	//    5    8:invokevirtual   #76  <Method View findViewById(int)>
	//    6   11:checkcast       #78  <Class TextView>
	//    7   14:ldc1            #79  <Int 0x7f08020d>
	//    8   16:invokestatic    #66  <Method String Res.getStudySpecificString(int)>
	//    9   19:invokevirtual   #83  <Method void TextView.setText(CharSequence)>
		class .Lambda._cls1
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(ContactUsResourceActivity contactusresourceactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls1) (contactusresourceactivity)). new .Lambda._cls1()));
			//    0    0:new             #2   <Class ContactUsResourceActivity$$Lambda$1>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ContactUsResourceActivity$$Lambda$1(ContactUsResourceActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				ContactUsResourceActivity.lambda$onCreate$7(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ContactUsResourceActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void ContactUsResourceActivity.lambda$onCreate$7(ContactUsResourceActivity, View)>
			//    4    8:return          
			}

			private final ContactUsResourceActivity arg$1;

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ContactUsResourceActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ContactUsResourceActivity arg$1>
			//    5    9:return          
			}
		}

		findViewById(0x7f0e00ab).setOnClickListener(.Lambda._cls1.lambdaFactory.(this));
	//   10   22:aload_0         
	//   11   23:ldc1            #84  <Int 0x7f0e00ab>
	//   12   25:invokevirtual   #76  <Method View findViewById(int)>
	//   13   28:aload_0         
	//   14   29:invokestatic    #90  <Method android.view.View$OnClickListener ContactUsResourceActivity$$Lambda$1.lambdaFactory$(ContactUsResourceActivity)>
	//   15   32:invokevirtual   #96  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		class .Lambda._cls2
			implements android.view.View.OnClickListener
		{

			public static android.view.View.OnClickListener lambdaFactory$(ContactUsResourceActivity contactusresourceactivity)
			{
				return ((android.view.View.OnClickListener) (((.Lambda._cls2) (contactusresourceactivity)). new .Lambda._cls2()));
			//    0    0:new             #2   <Class ContactUsResourceActivity$$Lambda$2>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:invokespecial   #20  <Method void ContactUsResourceActivity$$Lambda$2(ContactUsResourceActivity)>
			//    4    8:areturn         
			}

			public void onClick(View view)
			{
				ContactUsResourceActivity.lambda$onCreate$8(arg$1, view);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ContactUsResourceActivity arg$1>
			//    2    4:aload_1         
			//    3    5:invokestatic    #28  <Method void ContactUsResourceActivity.lambda$onCreate$8(ContactUsResourceActivity, View)>
			//    4    8:return          
			}

			private final ContactUsResourceActivity arg$1;

			private .Lambda._cls2()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				arg$1 = ContactUsResourceActivity.this;
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:putfield        #15  <Field ContactUsResourceActivity arg$1>
			//    5    9:return          
			}
		}

		findViewById(0x7f0e00ac).setOnClickListener(.Lambda._cls2.lambdaFactory.(this));
	//   16   35:aload_0         
	//   17   36:ldc1            #97  <Int 0x7f0e00ac>
	//   18   38:invokevirtual   #76  <Method View findViewById(int)>
	//   19   41:aload_0         
	//   20   42:invokestatic    #100 <Method android.view.View$OnClickListener ContactUsResourceActivity$$Lambda$2.lambdaFactory$(ContactUsResourceActivity)>
	//   21   45:invokevirtual   #96  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//   22   48:return          
	}
}
