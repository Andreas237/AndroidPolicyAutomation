// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.alipay.sdk.auth.AuthActivity;

public final class gb
	implements DownloadListener
{

	public gb(AuthActivity authactivity)
	{
		b = authactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field AuthActivity b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onDownloadStart(String s, String s1, String s2, String s3, long l)
	{
		try
		{
			s = ((String) (new Intent("android.intent.action.VIEW", Uri.parse(s))));
	//    0    0:new             #22  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "android.intent.action.VIEW">
	//    3    6:aload_1         
	//    4    7:invokestatic    #30  <Method Uri Uri.parse(String)>
	//    5   10:invokespecial   #33  <Method void Intent(String, Uri)>
	//    6   13:astore_1        
			b.startActivity(((Intent) (s)));
	//    7   14:aload_0         
	//    8   15:getfield        #12  <Field AuthActivity b>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #39  <Method void AuthActivity.startActivity(Intent)>
			return;
	//   11   22:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  12   23:astore_1        
		{
			return;
	//   13   24:return          
		}
	}

	final AuthActivity b;
}
