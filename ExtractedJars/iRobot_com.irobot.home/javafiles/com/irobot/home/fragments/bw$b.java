// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.*;
import android.net.NetworkInfo;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.fragments:
//			bw

class bw$b extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(!a.isAdded())
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field bw a>
	//*   2    4:invokevirtual   #23  <Method boolean bw.isAdded()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(intent.getAction().equals("android.net.wifi.STATE_CHANGE"))
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #29  <Method String Intent.getAction()>
	//*   7   15:ldc1            #31  <String "android.net.wifi.STATE_CHANGE">
	//*   8   17:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*   9   20:ifeq            115
		{
			context = ((Context) ((NetworkInfo)intent.getParcelableExtra("networkInfo")));
	//   10   23:aload_2         
	//   11   24:ldc1            #39  <String "networkInfo">
	//   12   26:invokevirtual   #43  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   13   29:checkcast       #45  <Class NetworkInfo>
	//   14   32:astore_1        
			intent = ((Intent) (new StringBuilder()));
	//   15   33:new             #47  <Class StringBuilder>
	//   16   36:dup             
	//   17   37:invokespecial   #48  <Method void StringBuilder()>
	//   18   40:astore_2        
			((StringBuilder) (intent)).append("WifiReceiver: ");
	//   19   41:aload_2         
	//   20   42:ldc1            #50  <String "WifiReceiver: ">
	//   21   44:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
			((StringBuilder) (intent)).append(((NetworkInfo) (context)).getState().name());
	//   23   48:aload_2         
	//   24   49:aload_1         
	//   25   50:invokevirtual   #58  <Method android.net.NetworkInfo$State NetworkInfo.getState()>
	//   26   53:invokevirtual   #63  <Method String android.net.NetworkInfo$State.name()>
	//   27   56:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   28   59:pop             
			o.b("SetupRV2NetworkFragment", ((StringBuilder) (intent)).toString());
	//   29   60:ldc1            #65  <String "SetupRV2NetworkFragment">
	//   30   62:aload_2         
	//   31   63:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   32   66:invokestatic    #73  <Method void o.b(String, String)>
			if(bw$2.a[((NetworkInfo) (context)).getState().ordinal()] != 1)
	//*  33   69:getstatic       #78  <Field int[] bw$2.a>
	//*  34   72:aload_1         
	//*  35   73:invokevirtual   #58  <Method android.net.NetworkInfo$State NetworkInfo.getState()>
	//*  36   76:invokevirtual   #82  <Method int android.net.NetworkInfo$State.ordinal()>
	//*  37   79:iaload          
	//*  38   80:iconst_1        
	//*  39   81:icmpeq          85
				return;
	//   40   84:return          
			if(bw.a(a).contains("unknown ssid"))
	//*  41   85:aload_0         
	//*  42   86:getfield        #13  <Field bw a>
	//*  43   89:invokestatic    #85  <Method String bw.a(bw)>
	//*  44   92:ldc1            #87  <String "unknown ssid">
	//*  45   94:invokevirtual   #91  <Method boolean String.contains(CharSequence)>
	//*  46   97:ifeq            101
				return;
	//   47  100:return          
			a.b(bw.a(a));
	//   48  101:aload_0         
	//   49  102:getfield        #13  <Field bw a>
	//   50  105:aload_0         
	//   51  106:getfield        #13  <Field bw a>
	//   52  109:invokestatic    #85  <Method String bw.a(bw)>
	//   53  112:invokevirtual   #94  <Method void bw.b(String)>
		}
	//   54  115:return          
	}

	final bw a;

	bw$b(bw bw1)
	{
		a = bw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field bw a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
