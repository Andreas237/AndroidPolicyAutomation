// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.webkit.WebView;
import android.widget.ProgressBar;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.GSResponse;
import com.gigya.socialize.android.event.GSDialogListener;
import com.gigya.socialize.android.event.GSPluginListener;
import com.gigya.socialize.android.event.GSWebBridgeListener;

// Referenced classes of package com.gigya.socialize.android:
//			GSPluginFragment

class GSPluginFragment$1 extends GSWebBridgeListener
{

	public void beforeLogin(WebView webview, nRequestType nrequesttype, GSObject gsobject)
	{
		if(GSPluginFragment.access$000(GSPluginFragment.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field GSPluginFragment this$0>
	//*   2    4:invokestatic    #25  <Method boolean GSPluginFragment.access$000(GSPluginFragment)>
	//*   3    7:ifeq            21
			GSPluginFragment.access$100(GSPluginFragment.this).setVisibility(0);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field GSPluginFragment this$0>
	//    6   14:invokestatic    #29  <Method ProgressBar GSPluginFragment.access$100(GSPluginFragment)>
	//    7   17:iconst_0        
	//    8   18:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
	//    9   21:return          
	}

	public void onLoginResponse(WebView webview, GSResponse gsresponse)
	{
		GSPluginFragment.access$100(GSPluginFragment.this).setVisibility(4);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GSPluginFragment this$0>
	//    2    4:invokestatic    #29  <Method ProgressBar GSPluginFragment.access$100(GSPluginFragment)>
	//    3    7:iconst_4        
	//    4    8:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
	//    5   11:return          
	}

	public void onPluginEvent(WebView webview, GSObject gsobject, String s)
	{
		if(s.equals("pluginContainer"))
	//*   0    0:aload_3         
	//*   1    1:ldc1            #41  <String "pluginContainer">
	//*   2    3:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            249
		{
			s = gsobject.getString("eventName", "");
	//    4    9:aload_2         
	//    5   10:ldc1            #49  <String "eventName">
	//    6   12:ldc1            #51  <String "">
	//    7   14:invokevirtual   #57  <Method String GSObject.getString(String, String)>
	//    8   17:astore_3        
			if(s.equals("load"))
	//*   9   18:aload_3         
	//*  10   19:ldc1            #59  <String "load">
	//*  11   21:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  12   24:ifeq            38
				GSPluginFragment.access$100(GSPluginFragment.this).setVisibility(4);
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field GSPluginFragment this$0>
	//   15   31:invokestatic    #29  <Method ProgressBar GSPluginFragment.access$100(GSPluginFragment)>
	//   16   34:iconst_4        
	//   17   35:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
			if(getShowsDialog() && !GSPluginFragment.access$200(GSPluginFragment.this) && (GSPluginFragment.access$300(GSPluginFragment.this).equals("accounts.screenSet") ? s.equals("afterScreenLoad") : s.equals("load")))
	//*  18   38:aload_0         
	//*  19   39:getfield        #15  <Field GSPluginFragment this$0>
	//*  20   42:invokevirtual   #63  <Method boolean GSPluginFragment.getShowsDialog()>
	//*  21   45:ifeq            105
	//*  22   48:aload_0         
	//*  23   49:getfield        #15  <Field GSPluginFragment this$0>
	//*  24   52:invokestatic    #66  <Method boolean GSPluginFragment.access$200(GSPluginFragment)>
	//*  25   55:ifne            105
	//*  26   58:aload_0         
	//*  27   59:getfield        #15  <Field GSPluginFragment this$0>
	//*  28   62:invokestatic    #70  <Method String GSPluginFragment.access$300(GSPluginFragment)>
	//*  29   65:ldc1            #72  <String "accounts.screenSet">
	//*  30   67:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  31   70:ifeq            93
	//*  32   73:aload_3         
	//*  33   74:ldc1            #74  <String "afterScreenLoad">
	//*  34   76:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  35   79:ifeq            105
				GSPluginFragment.access$400(GSPluginFragment.this, webview);
	//   36   82:aload_0         
	//   37   83:getfield        #15  <Field GSPluginFragment this$0>
	//   38   86:aload_1         
	//   39   87:invokestatic    #78  <Method void GSPluginFragment.access$400(GSPluginFragment, WebView)>
	//   40   90:goto            105
	//   41   93:aload_3         
	//   42   94:ldc1            #59  <String "load">
	//   43   96:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   44   99:ifeq            105
	//*  45  102:goto            82
			if(GSPluginFragment.access$500(GSPluginFragment.this) != null)
	//*  46  105:aload_0         
	//*  47  106:getfield        #15  <Field GSPluginFragment this$0>
	//*  48  109:invokestatic    #82  <Method GSPluginListener GSPluginFragment.access$500(GSPluginFragment)>
	//*  49  112:ifnull          190
				if(s.equals("load"))
	//*  50  115:aload_3         
	//*  51  116:ldc1            #59  <String "load">
	//*  52  118:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  53  121:ifeq            144
					GSPluginFragment.access$500(GSPluginFragment.this).onLoad(GSPluginFragment.this, gsobject);
	//   54  124:aload_0         
	//   55  125:getfield        #15  <Field GSPluginFragment this$0>
	//   56  128:invokestatic    #82  <Method GSPluginListener GSPluginFragment.access$500(GSPluginFragment)>
	//   57  131:aload_0         
	//   58  132:getfield        #15  <Field GSPluginFragment this$0>
	//   59  135:aload_2         
	//   60  136:invokeinterface #88  <Method void GSPluginListener.onLoad(GSPluginFragment, GSObject)>
				else
	//*  61  141:goto            190
				if(s.equals("error"))
	//*  62  144:aload_3         
	//*  63  145:ldc1            #90  <String "error">
	//*  64  147:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  65  150:ifeq            173
					GSPluginFragment.access$500(GSPluginFragment.this).onError(GSPluginFragment.this, gsobject);
	//   66  153:aload_0         
	//   67  154:getfield        #15  <Field GSPluginFragment this$0>
	//   68  157:invokestatic    #82  <Method GSPluginListener GSPluginFragment.access$500(GSPluginFragment)>
	//   69  160:aload_0         
	//   70  161:getfield        #15  <Field GSPluginFragment this$0>
	//   71  164:aload_2         
	//   72  165:invokeinterface #93  <Method void GSPluginListener.onError(GSPluginFragment, GSObject)>
				else
	//*  73  170:goto            190
					GSPluginFragment.access$500(GSPluginFragment.this).onEvent(GSPluginFragment.this, gsobject);
	//   74  173:aload_0         
	//   75  174:getfield        #15  <Field GSPluginFragment this$0>
	//   76  177:invokestatic    #82  <Method GSPluginListener GSPluginFragment.access$500(GSPluginFragment)>
	//   77  180:aload_0         
	//   78  181:getfield        #15  <Field GSPluginFragment this$0>
	//   79  184:aload_2         
	//   80  185:invokeinterface #96  <Method void GSPluginListener.onEvent(GSPluginFragment, GSObject)>
			if((s.equals("hide") || s.equals("close")) && getShowsDialog())
	//*  81  190:aload_3         
	//*  82  191:ldc1            #98  <String "hide">
	//*  83  193:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  84  196:ifne            208
	//*  85  199:aload_3         
	//*  86  200:ldc1            #100 <String "close">
	//*  87  202:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  88  205:ifeq            249
	//*  89  208:aload_0         
	//*  90  209:getfield        #15  <Field GSPluginFragment this$0>
	//*  91  212:invokevirtual   #63  <Method boolean GSPluginFragment.getShowsDialog()>
	//*  92  215:ifeq            249
			{
				dismissAllowingStateLoss();
	//   93  218:aload_0         
	//   94  219:getfield        #15  <Field GSPluginFragment this$0>
	//   95  222:invokevirtual   #103 <Method void GSPluginFragment.dismissAllowingStateLoss()>
				if(GSPluginFragment.access$600(GSPluginFragment.this) != null)
	//*  96  225:aload_0         
	//*  97  226:getfield        #15  <Field GSPluginFragment this$0>
	//*  98  229:invokestatic    #107 <Method GSDialogListener GSPluginFragment.access$600(GSPluginFragment)>
	//*  99  232:ifnull          249
					GSPluginFragment.access$600(GSPluginFragment.this).onDismiss(false, gsobject);
	//  100  235:aload_0         
	//  101  236:getfield        #15  <Field GSPluginFragment this$0>
	//  102  239:invokestatic    #107 <Method GSDialogListener GSPluginFragment.access$600(GSPluginFragment)>
	//  103  242:iconst_0        
	//  104  243:aload_2         
	//  105  244:invokeinterface #113 <Method void GSDialogListener.onDismiss(boolean, GSObject)>
			}
		}
	//  106  249:return          
	}

	final GSPluginFragment this$0;

	GSPluginFragment$1()
	{
		this$0 = GSPluginFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field GSPluginFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void GSWebBridgeListener()>
	//    5    9:return          
	}
}
