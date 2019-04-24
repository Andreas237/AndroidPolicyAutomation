// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.pactforcure.app.studies.Res;

// Referenced classes of package com.pactforcure.app.ui:
//			BaseResourceActivity

public class SuicidePreventionResourceActivity extends BaseResourceActivity
{

	public SuicidePreventionResourceActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BaseResourceActivity()>
	//    2    4:return          
	}

	protected int getLayoutId()
	{
		return 0x7f040030;
	//    0    0:ldc1            #12  <Int 0x7f040030>
	//    1    2:ireturn         
	}

	protected String getScreenTitle()
	{
		return Res.getStudySpecificString(0x7f08033c);
	//    0    0:ldc1            #15  <Int 0x7f08033c>
	//    1    2:invokestatic    #21  <Method String Res.getStudySpecificString(int)>
	//    2    5:areturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void BaseResourceActivity.onCreate(Bundle)>
		bundle = ((Bundle) ((TextView)findViewById(0x7f0e00eb)));
	//    3    5:aload_0         
	//    4    6:ldc1            #27  <Int 0x7f0e00eb>
	//    5    8:invokevirtual   #31  <Method android.view.View findViewById(int)>
	//    6   11:checkcast       #33  <Class TextView>
	//    7   14:astore_1        
		((TextView) (bundle)).setMovementMethod(LinkMovementMethod.getInstance());
	//    8   15:aload_1         
	//    9   16:invokestatic    #39  <Method android.text.method.MovementMethod LinkMovementMethod.getInstance()>
	//   10   19:invokevirtual   #43  <Method void TextView.setMovementMethod(android.text.method.MovementMethod)>
		((TextView) (bundle)).setText(((CharSequence) (Html.fromHtml(Res.getStudySpecificRawAsString(0x7f07001f)))));
	//   11   22:aload_1         
	//   12   23:ldc1            #44  <Int 0x7f07001f>
	//   13   25:invokestatic    #47  <Method String Res.getStudySpecificRawAsString(int)>
	//   14   28:invokestatic    #53  <Method android.text.Spanned Html.fromHtml(String)>
	//   15   31:invokevirtual   #57  <Method void TextView.setText(CharSequence)>
	//   16   34:return          
	}
}
