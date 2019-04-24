// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.support.v4.app.ActivityCompat;
import android.webkit.*;
import com.gigya.socialize.android.event.GSAndroidPermissionListener;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android:
//			GSPluginFragment, GSAPI

class GSPluginFragment$3 extends WebChromeClient
{

	public boolean onShowFileChooser(WebView webview, ValueCallback valuecallback, android.webkit.eChooserParams echooserparams)
	{
		GigyaLog.d("FILE", "CHOOSE");
	//    0    0:ldc1            #25  <String "FILE">
	//    1    2:ldc1            #27  <String "CHOOSE">
	//    2    4:invokestatic    #33  <Method void GigyaLog.d(String, String)>
		if(GSPluginFragment.access$900(GSPluginFragment.this) != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #17  <Field GSPluginFragment this$0>
	//*   5   11:invokestatic    #37  <Method ValueCallback GSPluginFragment.access$900(GSPluginFragment)>
	//*   6   14:ifnull          30
			GSPluginFragment.access$900(GSPluginFragment.this).onReceiveValue(((Object) (null)));
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field GSPluginFragment this$0>
	//    9   21:invokestatic    #37  <Method ValueCallback GSPluginFragment.access$900(GSPluginFragment)>
	//   10   24:aconst_null     
	//   11   25:invokeinterface #43  <Method void ValueCallback.onReceiveValue(Object)>
		GSPluginFragment.access$902(GSPluginFragment.this, valuecallback);
	//   12   30:aload_0         
	//   13   31:getfield        #17  <Field GSPluginFragment this$0>
	//   14   34:aload_2         
	//   15   35:invokestatic    #47  <Method ValueCallback GSPluginFragment.access$902(GSPluginFragment, ValueCallback)>
	//   16   38:pop             
		int i = GSAPI.getInstance().getNextAndroidPermissionsRequestCode(new GSAndroidPermissionListener() {

			public void onAndroidPermissionsResult(String as[], int ai[])
			{
				if(GSPluginFragment.access$900(this$0) != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field GSPluginFragment$3 this$1>
			//*   2    4:getfield        #27  <Field GSPluginFragment GSPluginFragment$3.this$0>
			//*   3    7:invokestatic    #33  <Method ValueCallback GSPluginFragment.access$900(GSPluginFragment)>
			//*   4   10:ifnull          23
					GSPluginFragment.access$1000(this$0);
			//    5   13:aload_0         
			//    6   14:getfield        #17  <Field GSPluginFragment$3 this$1>
			//    7   17:getfield        #27  <Field GSPluginFragment GSPluginFragment$3.this$0>
			//    8   20:invokestatic    #37  <Method void GSPluginFragment.access$1000(GSPluginFragment)>
			//    9   23:return          
			}

			final GSPluginFragment._cls3 this$1;

			
			{
				this$1 = GSPluginFragment._cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSPluginFragment$3 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   17   39:invokestatic    #53  <Method GSAPI GSAPI.getInstance()>
	//   18   42:new             #11  <Class GSPluginFragment$3$1>
	//   19   45:dup             
	//   20   46:aload_0         
	//   21   47:invokespecial   #56  <Method void GSPluginFragment$3$1(GSPluginFragment$3)>
	//   22   50:invokevirtual   #60  <Method int GSAPI.getNextAndroidPermissionsRequestCode(GSAndroidPermissionListener)>
	//   23   53:istore          4
		webview = ((WebView) (new String[1]));
	//   24   55:iconst_1        
	//   25   56:anewarray       String[]
	//   26   59:astore_1        
		webview[0] = "android.permission.WRITE_EXTERNAL_STORAGE";
	//   27   60:aload_1         
	//   28   61:iconst_0        
	//   29   62:ldc1            #64  <String "android.permission.WRITE_EXTERNAL_STORAGE">
	//   30   64:aastore         
		if(getShowsDialog())
	//*  31   65:aload_0         
	//*  32   66:getfield        #17  <Field GSPluginFragment this$0>
	//*  33   69:invokevirtual   #68  <Method boolean GSPluginFragment.getShowsDialog()>
	//*  34   72:ifeq            91
			ActivityCompat.requestPermissions(((android.app.Activity) (getActivity())), ((String []) (webview)), i);
	//   35   75:aload_0         
	//   36   76:getfield        #17  <Field GSPluginFragment this$0>
	//   37   79:invokevirtual   #72  <Method android.support.v4.app.FragmentActivity GSPluginFragment.getActivity()>
	//   38   82:aload_1         
	//   39   83:iload           4
	//   40   85:invokestatic    #78  <Method void ActivityCompat.requestPermissions(android.app.Activity, String[], int)>
		else
	//*  41   88:goto            101
			requestPermissions(((String []) (webview)), i);
	//   42   91:aload_0         
	//   43   92:getfield        #17  <Field GSPluginFragment this$0>
	//   44   95:aload_1         
	//   45   96:iload           4
	//   46   98:invokevirtual   #81  <Method void GSPluginFragment.requestPermissions(String[], int)>
		return true;
	//   47  101:iconst_1        
	//   48  102:ireturn         
	}

	final GSPluginFragment this$0;

	GSPluginFragment$3()
	{
		this$0 = GSPluginFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GSPluginFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void WebChromeClient()>
	//    5    9:return          
	}
}
