// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

final class hv
	implements DownloadListener
{

	hv(Context context)
	{
		c = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Context c>
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
			((Intent) (s)).setFlags(0x10000000);
	//    7   14:aload_1         
	//    8   15:ldc1            #34  <Int 0x10000000>
	//    9   17:invokevirtual   #38  <Method Intent Intent.setFlags(int)>
	//   10   20:pop             
			c.startActivity(((Intent) (s)));
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field Context c>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #44  <Method void Context.startActivity(Intent)>
			return;
	//   15   29:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  16   30:astore_1        
		{
			return;
	//   17   31:return          
		}
	}

	final Context c;
}
