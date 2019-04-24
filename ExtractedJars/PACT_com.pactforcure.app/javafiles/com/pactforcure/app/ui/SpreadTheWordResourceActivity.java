// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;
import com.pactforcure.app.studies.Res;
import com.pactforcure.app.util.FileUtils;
import com.pactforcure.app.util.VersionUtils;

// Referenced classes of package com.pactforcure.app.ui:
//			BaseResourceActivity

public class SpreadTheWordResourceActivity extends BaseResourceActivity
{

	public SpreadTheWordResourceActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BaseResourceActivity()>
	//    2    4:return          
	}

	protected int getLayoutId()
	{
		return 0x7f04002e;
	//    0    0:ldc1            #12  <Int 0x7f04002e>
	//    1    2:ireturn         
	}

	protected String getScreenTitle()
	{
		return Res.getStudySpecificString(0x7f080337);
	//    0    0:ldc1            #15  <Int 0x7f080337>
	//    1    2:invokestatic    #21  <Method String Res.getStudySpecificString(int)>
	//    2    5:areturn         
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void BaseResourceActivity.onCreate(Bundle)>
		bundle = ((Bundle) ((WebView)findViewById(0x7f0e010d)));
	//    3    5:aload_0         
	//    4    6:ldc1            #27  <Int 0x7f0e010d>
	//    5    8:invokevirtual   #31  <Method android.view.View findViewById(int)>
	//    6   11:checkcast       #33  <Class WebView>
	//    7   14:astore_1        
		String s = Res.getStudySpecificRawAsString(0x7f070017);
	//    8   15:ldc1            #34  <Int 0x7f070017>
	//    9   17:invokestatic    #37  <Method String Res.getStudySpecificRawAsString(int)>
	//   10   20:astore_2        
		String s1 = FileUtils.rawResToString(0x7f070019);
	//   11   21:ldc1            #38  <Int 0x7f070019>
	//   12   23:invokestatic    #43  <Method String FileUtils.rawResToString(int)>
	//   13   26:astore_3        
		((WebView) (bundle)).loadDataWithBaseURL("file:///android_asset/", (new StringBuilder()).append(s1).append(s).toString(), "text/html", "utf-8", ((String) (null)));
	//   14   27:aload_1         
	//   15   28:ldc1            #45  <String "file:///android_asset/">
	//   16   30:new             #47  <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #48  <Method void StringBuilder()>
	//   19   37:aload_3         
	//   20   38:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:aload_2         
	//   22   42:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   24   48:ldc1            #57  <String "text/html">
	//   25   50:ldc1            #59  <String "utf-8">
	//   26   52:aconst_null     
	//   27   53:invokevirtual   #63  <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
		((TextView)findViewById(0x7f0e010e)).setText(((CharSequence) (getString(0x7f08002a, new Object[] {
			VersionUtils.getVersionName()
		}))));
	//   28   56:aload_0         
	//   29   57:ldc1            #64  <Int 0x7f0e010e>
	//   30   59:invokevirtual   #31  <Method android.view.View findViewById(int)>
	//   31   62:checkcast       #66  <Class TextView>
	//   32   65:aload_0         
	//   33   66:ldc1            #67  <Int 0x7f08002a>
	//   34   68:iconst_1        
	//   35   69:anewarray       Object[]
	//   36   72:dup             
	//   37   73:iconst_0        
	//   38   74:invokestatic    #74  <Method String VersionUtils.getVersionName()>
	//   39   77:aastore         
	//   40   78:invokevirtual   #78  <Method String getString(int, Object[])>
	//   41   81:invokevirtual   #82  <Method void TextView.setText(CharSequence)>
	//   42   84:return          
	}
}
