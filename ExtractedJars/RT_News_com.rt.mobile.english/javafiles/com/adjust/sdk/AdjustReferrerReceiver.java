// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.content.*;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.adjust.sdk:
//			Adjust, AdjustInstance

public class AdjustReferrerReceiver extends BroadcastReceiver
{

	public AdjustReferrerReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) (intent.getStringExtra("referrer")));
	//    0    0:aload_2         
	//    1    1:ldc1            #15  <String "referrer">
	//    2    3:invokevirtual   #21  <Method String Intent.getStringExtra(String)>
	//    3    6:astore_1        
		if(context == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       12
			return;
	//    6   11:return          
		try
		{
			context = ((Context) (URLDecoder.decode(((String) (context)), "UTF-8")));
	//    7   12:aload_1         
	//    8   13:ldc1            #23  <String "UTF-8">
	//    9   15:invokestatic    #29  <Method String URLDecoder.decode(String, String)>
	//   10   18:astore_1        
		}
	//*  11   19:goto            25
	//*  12   22:ldc1            #31  <String "malformed">
	//*  13   24:astore_1        
	//*  14   25:invokestatic    #37  <Method AdjustInstance Adjust.getDefaultInstance()>
	//*  15   28:aload_1         
	//*  16   29:invokevirtual   #43  <Method void AdjustInstance.sendReferrer(String)>
	//*  17   32:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = "malformed";
		}
		Adjust.getDefaultInstance().sendReferrer(((String) (context)));
	//*  18   33:astore_1        
	//*  19   34:goto            22
	}
}
