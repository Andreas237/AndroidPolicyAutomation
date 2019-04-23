// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.w;

public final class RevocationBoundService extends Service
{

	public RevocationBoundService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Service()>
	//    2    4:return          
	}

	public final IBinder onBind(Intent intent)
	{
		if(!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(((Object) (intent.getAction()))) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc1            #13  <String "com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #19  <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #25  <Method boolean String.equals(Object)>
	//*   4    9:ifne            71
	//*   5   12:ldc1            #27  <String "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState">
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #19  <Method String Intent.getAction()>
	//*   8   18:invokevirtual   #25  <Method boolean String.equals(Object)>
	//*   9   21:ifeq            27
	//*  10   24:goto            71
		{
			intent = ((Intent) (String.valueOf(((Object) (intent.getAction())))));
	//   11   27:aload_1         
	//   12   28:invokevirtual   #19  <Method String Intent.getAction()>
	//   13   31:invokestatic    #31  <Method String String.valueOf(Object)>
	//   14   34:astore_1        
			if(((String) (intent)).length() != 0)
	//*  15   35:aload_1         
	//*  16   36:invokevirtual   #35  <Method int String.length()>
	//*  17   39:ifeq            52
				intent = ((Intent) ("Unknown action sent to RevocationBoundService: ".concat(((String) (intent)))));
	//   18   42:ldc1            #37  <String "Unknown action sent to RevocationBoundService: ">
	//   19   44:aload_1         
	//   20   45:invokevirtual   #41  <Method String String.concat(String)>
	//   21   48:astore_1        
			else
	//*  22   49:goto            62
				intent = ((Intent) (new String("Unknown action sent to RevocationBoundService: ")));
	//   23   52:new             #21  <Class String>
	//   24   55:dup             
	//   25   56:ldc1            #37  <String "Unknown action sent to RevocationBoundService: ">
	//   26   58:invokespecial   #44  <Method void String(String)>
	//   27   61:astore_1        
			Log.w("RevocationService", ((String) (intent)));
	//   28   62:ldc1            #46  <String "RevocationService">
	//   29   64:aload_1         
	//   30   65:invokestatic    #52  <Method int Log.w(String, String)>
	//   31   68:pop             
			return null;
	//   32   69:aconst_null     
	//   33   70:areturn         
		}
		if(Log.isLoggable("RevocationService", 2))
	//*  34   71:ldc1            #46  <String "RevocationService">
	//*  35   73:iconst_2        
	//*  36   74:invokestatic    #56  <Method boolean Log.isLoggable(String, int)>
	//*  37   77:ifeq            122
		{
			intent = ((Intent) (String.valueOf(((Object) (intent.getAction())))));
	//   38   80:aload_1         
	//   39   81:invokevirtual   #19  <Method String Intent.getAction()>
	//   40   84:invokestatic    #31  <Method String String.valueOf(Object)>
	//   41   87:astore_1        
			if(((String) (intent)).length() != 0)
	//*  42   88:aload_1         
	//*  43   89:invokevirtual   #35  <Method int String.length()>
	//*  44   92:ifeq            105
				intent = ((Intent) ("RevocationBoundService handling ".concat(((String) (intent)))));
	//   45   95:ldc1            #58  <String "RevocationBoundService handling ">
	//   46   97:aload_1         
	//   47   98:invokevirtual   #41  <Method String String.concat(String)>
	//   48  101:astore_1        
			else
	//*  49  102:goto            115
				intent = ((Intent) (new String("RevocationBoundService handling ")));
	//   50  105:new             #21  <Class String>
	//   51  108:dup             
	//   52  109:ldc1            #58  <String "RevocationBoundService handling ">
	//   53  111:invokespecial   #44  <Method void String(String)>
	//   54  114:astore_1        
			Log.v("RevocationService", ((String) (intent)));
	//   55  115:ldc1            #46  <String "RevocationService">
	//   56  117:aload_1         
	//   57  118:invokestatic    #61  <Method int Log.v(String, String)>
	//   58  121:pop             
		}
		return ((IBinder) (new w(((android.content.Context) (this)))));
	//   59  122:new             #63  <Class w>
	//   60  125:dup             
	//   61  126:aload_0         
	//   62  127:invokespecial   #66  <Method void w(android.content.Context)>
	//   63  130:areturn         
	}
}
