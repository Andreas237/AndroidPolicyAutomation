// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			AppboyInAppMessageHtmlFullView

class AppboyInAppMessageHtmlFullView$1 extends WebChromeClient
{

	public boolean onConsoleMessage(ConsoleMessage consolemessage)
	{
		String s = AppboyInAppMessageHtmlFullView.access$000();
	//    0    0:invokestatic    #25  <Method String AppboyInAppMessageHtmlFullView.access$000()>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #27  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #28  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Html In-app log. Line: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #30  <String "Html In-app log. Line: ">
	//    8   15:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(consolemessage.lineNumber());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #40  <Method int ConsoleMessage.lineNumber()>
	//   13   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   14   27:pop             
		stringbuilder.append(". SourceId: ");
	//   15   28:aload_3         
	//   16   29:ldc1            #45  <String ". SourceId: ">
	//   17   31:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append(consolemessage.sourceId());
	//   19   35:aload_3         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #48  <Method String ConsoleMessage.sourceId()>
	//   22   40:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(". Log Level: ");
	//   24   44:aload_3         
	//   25   45:ldc1            #50  <String ". Log Level: ">
	//   26   47:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		stringbuilder.append(((Object) (consolemessage.messageLevel())));
	//   28   51:aload_3         
	//   29   52:aload_1         
	//   30   53:invokevirtual   #54  <Method android.webkit.ConsoleMessage$MessageLevel ConsoleMessage.messageLevel()>
	//   31   56:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//   32   59:pop             
		stringbuilder.append(". Message: ");
	//   33   60:aload_3         
	//   34   61:ldc1            #59  <String ". Message: ">
	//   35   63:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
		stringbuilder.append(consolemessage.message());
	//   37   67:aload_3         
	//   38   68:aload_1         
	//   39   69:invokevirtual   #62  <Method String ConsoleMessage.message()>
	//   40   72:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   42   76:aload_2         
	//   43   77:aload_3         
	//   44   78:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   45   81:invokestatic    #71  <Method int AppboyLogger.d(String, String)>
	//   46   84:pop             
		return true;
	//   47   85:iconst_1        
	//   48   86:ireturn         
	}

	final AppboyInAppMessageHtmlFullView this$0;

	AppboyInAppMessageHtmlFullView$1()
	{
		this$0 = AppboyInAppMessageHtmlFullView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AppboyInAppMessageHtmlFullView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebChromeClient()>
	//    5    9:return          
	}
}
