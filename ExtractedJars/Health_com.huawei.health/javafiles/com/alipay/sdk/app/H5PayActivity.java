// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import o.*;

public class H5PayActivity extends Activity
{

	public H5PayActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Activity()>
	//    2    4:return          
	}

	public void c()
	{
		Object obj = fl.b;
	//    0    0:getstatic       #21  <Field Object fl.b>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		Exception exception;
		try
		{
			obj.notify();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #26  <Method void Object.notify()>
		}
	//*   6   10:aload_1         
	//*   7   11:monitorexit     
	//*   8   12:return          
	//*   9   13:astore_2        
	//*  10   14:aload_1         
	//*  11   15:monitorexit     
	//*  12   16:aload_2         
	//*  13   17:athrow          
		catch(Exception exception1) { }
	//   14   18:astore_2        
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  15   19:goto            10
	}

	public void finish()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method void c()>
		super.finish();
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void Activity.finish()>
	//    4    8:return          
	}

	public void onBackPressed()
	{
		if(c.canGoBack())
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field WebView c>
	//*   2    4:invokevirtual   #40  <Method boolean WebView.canGoBack()>
	//*   3    7:ifeq            55
		{
			if(((fs)a).b)
	//*   4   10:aload_0         
	//*   5   11:getfield        #42  <Field WebViewClient a>
	//*   6   14:checkcast       #44  <Class fs>
	//*   7   17:getfield        #47  <Field boolean fs.b>
	//*   8   20:ifeq            54
			{
				fv fv1 = fv.b(fv.b.i);
	//    9   23:getstatic       #52  <Field fv fv.b>
	//   10   26:getfield        #56  <Field int fv.i>
	//   11   29:invokestatic    #59  <Method fv fv.b(int)>
	//   12   32:astore_1        
				fx.d = fx.d(fv1.i, fv1.k, "");
	//   13   33:aload_1         
	//   14   34:getfield        #56  <Field int fv.i>
	//   15   37:aload_1         
	//   16   38:getfield        #63  <Field String fv.k>
	//   17   41:ldc1            #65  <String "">
	//   18   43:invokestatic    #71  <Method String fx.d(int, String, String)>
	//   19   46:putstatic       #73  <Field String fx.d>
				finish();
	//   20   49:aload_0         
	//   21   50:invokevirtual   #74  <Method void finish()>
				return;
	//   22   53:return          
			} else
			{
				return;
	//   23   54:return          
			}
		} else
		{
			fx.d = fx.e();
	//   24   55:invokestatic    #78  <Method String fx.e()>
	//   25   58:putstatic       #73  <Field String fx.d>
			finish();
	//   26   61:aload_0         
	//   27   62:invokevirtual   #74  <Method void finish()>
			return;
	//   28   65:return          
		}
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method void Activity.onConfigurationChanged(Configuration)>
	//    3    5:return          
	}

	protected void onCreate(Bundle bundle)
	{
		Object obj;
		try
		{
			super.requestWindowFeature(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #90  <Method boolean Activity.requestWindowFeature(int)>
	//    3    5:pop             
		}
	//*   4    6:aload_0         
	//*   5    7:aload_1         
	//*   6    8:invokespecial   #92  <Method void Activity.onCreate(Bundle)>
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #96  <Method Intent getIntent()>
	//*   9   15:invokevirtual   #102 <Method Bundle Intent.getExtras()>
	//*  10   18:astore_2        
	//*  11   19:aload_2         
	//*  12   20:ldc1            #104 <String "url">
	//*  13   22:invokevirtual   #110 <Method String Bundle.getString(String)>
	//*  14   25:astore_1        
	//*  15   26:aload_1         
	//*  16   27:invokestatic    #115 <Method boolean hr.d(String)>
	//*  17   30:ifne            38
	//*  18   33:aload_0         
	//*  19   34:invokevirtual   #74  <Method void finish()>
	//*  20   37:return          
	//*  21   38:aload_2         
	//*  22   39:ldc1            #117 <String "cookie">
	//*  23   41:invokevirtual   #110 <Method String Bundle.getString(String)>
	//*  24   44:astore_2        
	//*  25   45:goto            53
	//*  26   48:aload_0         
	//*  27   49:invokevirtual   #74  <Method void finish()>
	//*  28   52:return          
	//*  29   53:aload_0         
	//*  30   54:aload_0         
	//*  31   55:aload_1         
	//*  32   56:aload_2         
	//*  33   57:invokestatic    #120 <Method WebView hr.d(Activity, String, String)>
	//*  34   60:putfield        #34  <Field WebView c>
	//*  35   63:aload_0         
	//*  36   64:new             #44  <Class fs>
	//*  37   67:dup             
	//*  38   68:aload_0         
	//*  39   69:invokespecial   #123 <Method void fs(Activity)>
	//*  40   72:putfield        #42  <Field WebViewClient a>
	//*  41   75:aload_0         
	//*  42   76:getfield        #34  <Field WebView c>
	//*  43   79:aload_0         
	//*  44   80:getfield        #42  <Field WebViewClient a>
	//*  45   83:invokevirtual   #127 <Method void WebView.setWebViewClient(WebViewClient)>
	//*  46   86:return          
	//*  47   87:astore_1        
	//*  48   88:ldc1            #129 <String "biz">
	//*  49   90:ldc1            #131 <String "GetInstalledAppEx">
	//*  50   92:aload_1         
	//*  51   93:invokestatic    #136 <Method void ft.e(String, String, Throwable)>
	//*  52   96:aload_0         
	//*  53   97:invokevirtual   #74  <Method void finish()>
	//*  54  100:return          
		catch(Throwable throwable) { }
	//   55  101:astore_2        
		super.onCreate(bundle);
		try
		{
			obj = ((Object) (getIntent().getExtras()));
			bundle = ((Bundle) (((Bundle) (obj)).getString("url")));
			if(!hr.d(((String) (bundle))))
			{
				finish();
				return;
			}
		}
	//*  56  102:goto            6
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			finish();
			return;
		}
		obj = ((Object) (((Bundle) (obj)).getString("cookie")));
		try
		{
			c = hr.d(((Activity) (this)), ((String) (bundle)), ((String) (obj)));
			a = ((WebViewClient) (new fs(((Activity) (this)))));
			c.setWebViewClient(a);
			return;
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
		{
			ft.e("biz", "GetInstalledAppEx", ((Throwable) (bundle)));
		}
		finish();
		return;
	//*  57  105:astore_1        
	//*  58  106:goto            48
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method void Activity.onDestroy()>
		if(c != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #34  <Field WebView c>
	//*   4    8:ifnull          43
		{
			c.removeAllViews();
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field WebView c>
	//    7   15:invokevirtual   #142 <Method void WebView.removeAllViews()>
			((ViewGroup)c.getParent()).removeAllViews();
	//    8   18:aload_0         
	//    9   19:getfield        #34  <Field WebView c>
	//   10   22:invokevirtual   #146 <Method android.view.ViewParent WebView.getParent()>
	//   11   25:checkcast       #148 <Class ViewGroup>
	//   12   28:invokevirtual   #149 <Method void ViewGroup.removeAllViews()>
			fs fs1;
			try
			{
				c.destroy();
	//   13   31:aload_0         
	//   14   32:getfield        #34  <Field WebView c>
	//   15   35:invokevirtual   #152 <Method void WebView.destroy()>
			}
	//*  16   38:aload_0         
	//*  17   39:aconst_null     
	//*  18   40:putfield        #34  <Field WebView c>
	//*  19   43:aload_0         
	//*  20   44:getfield        #42  <Field WebViewClient a>
	//*  21   47:ifnull          68
	//*  22   50:aload_0         
	//*  23   51:getfield        #42  <Field WebViewClient a>
	//*  24   54:checkcast       #44  <Class fs>
	//*  25   57:astore_1        
	//*  26   58:aload_1         
	//*  27   59:aconst_null     
	//*  28   60:putfield        #155 <Field android.os.Handler fs.e>
	//*  29   63:aload_1         
	//*  30   64:aconst_null     
	//*  31   65:putfield        #158 <Field Activity fs.d>
	//*  32   68:return          
			catch(Throwable throwable) { }
	//   33   69:astore_1        
			c = null;
		}
		if(a != null)
		{
			fs1 = (fs)a;
			fs1.e = null;
			fs1.d = null;
		}
	//*  34   70:goto            38
	}

	private WebViewClient a;
	private WebView c;
}
