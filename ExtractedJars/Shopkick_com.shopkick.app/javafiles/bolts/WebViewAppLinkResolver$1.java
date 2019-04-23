// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.net.Uri;
import org.json.JSONArray;

// Referenced classes of package bolts:
//			Continuation, WebViewAppLinkResolver, Task, AppLink

class WebViewAppLinkResolver$1
	implements Continuation
{

	public AppLink then(Task task)
		throws Exception
	{
		return WebViewAppLinkResolver.access$100(WebViewAppLinkResolver.access$000((JSONArray)task.getResult()), val$url);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method Object Task.getResult()>
	//    2    4:checkcast       #38  <Class JSONArray>
	//    3    7:invokestatic    #42  <Method java.util.Map WebViewAppLinkResolver.access$000(JSONArray)>
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field Uri val$url>
	//    6   14:invokestatic    #46  <Method AppLink WebViewAppLinkResolver.access$100(java.util.Map, Uri)>
	//    7   17:areturn         
	}

	public volatile Object then(Task task)
		throws Exception
	{
		return ((Object) (then(task)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method AppLink then(Task)>
	//    3    5:areturn         
	}

	final WebViewAppLinkResolver this$0;
	final Uri val$url;

	WebViewAppLinkResolver$1()
	{
		this$0 = final_webviewapplinkresolver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field WebViewAppLinkResolver this$0>
		val$url = Uri.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Uri val$url>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
