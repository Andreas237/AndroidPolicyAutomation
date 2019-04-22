// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.content.Context;
import bo.app.bi;
import bo.app.bs;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$12
	implements Runnable
{

	public void run()
	{
		if(b.i.isFirebaseCloudMessagingRegistrationEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Appboy b>
	//*   2    4:getfield        #29  <Field AppboyConfigurationProvider Appboy.i>
	//*   3    7:invokevirtual   #35  <Method boolean AppboyConfigurationProvider.isFirebaseCloudMessagingRegistrationEnabled()>
	//*   4   10:ifeq            81
		{
			if(bs.a(Appboy.a(b), b.i))
	//*   5   13:aload_0         
	//*   6   14:getfield        #18  <Field Appboy b>
	//*   7   17:invokestatic    #38  <Method Context Appboy.a(Appboy)>
	//*   8   20:aload_0         
	//*   9   21:getfield        #18  <Field Appboy b>
	//*  10   24:getfield        #29  <Field AppboyConfigurationProvider Appboy.i>
	//*  11   27:invokestatic    #43  <Method boolean bs.a(Context, AppboyConfigurationProvider)>
	//*  12   30:ifeq            69
			{
				AppboyLogger.i(Appboy.b(), "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.");
	//   13   33:invokestatic    #46  <Method String Appboy.b()>
	//   14   36:ldc1            #48  <String "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.">
	//   15   38:invokestatic    #53  <Method int AppboyLogger.i(String, String)>
	//   16   41:pop             
				(new bs(a)).a(b.i.getFirebaseCloudMessagingSenderIdKey());
	//   17   42:new             #40  <Class bs>
	//   18   45:dup             
	//   19   46:aload_0         
	//   20   47:getfield        #20  <Field Context a>
	//   21   50:invokespecial   #54  <Method void bs(Context)>
	//   22   53:aload_0         
	//   23   54:getfield        #18  <Field Appboy b>
	//   24   57:getfield        #29  <Field AppboyConfigurationProvider Appboy.i>
	//   25   60:invokevirtual   #57  <Method String AppboyConfigurationProvider.getFirebaseCloudMessagingSenderIdKey()>
	//   26   63:invokevirtual   #60  <Method void bs.a(String)>
			} else
	//*  27   66:goto            90
			{
				AppboyLogger.e(Appboy.b(), "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.");
	//   28   69:invokestatic    #46  <Method String Appboy.b()>
	//   29   72:ldc1            #62  <String "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.">
	//   30   74:invokestatic    #65  <Method int AppboyLogger.e(String, String)>
	//   31   77:pop             
			}
		} else
	//*  32   78:goto            90
		{
			AppboyLogger.i(Appboy.b(), "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.");
	//   33   81:invokestatic    #46  <Method String Appboy.b()>
	//   34   84:ldc1            #67  <String "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.">
	//   35   86:invokestatic    #53  <Method int AppboyLogger.i(String, String)>
	//   36   89:pop             
		}
		if(b.i.isAdmMessagingRegistrationEnabled())
	//*  37   90:aload_0         
	//*  38   91:getfield        #18  <Field Appboy b>
	//*  39   94:getfield        #29  <Field AppboyConfigurationProvider Appboy.i>
	//*  40   97:invokevirtual   #70  <Method boolean AppboyConfigurationProvider.isAdmMessagingRegistrationEnabled()>
	//*  41  100:ifeq            160
		{
			if(bi.a(Appboy.a(b)))
	//*  42  103:aload_0         
	//*  43  104:getfield        #18  <Field Appboy b>
	//*  44  107:invokestatic    #38  <Method Context Appboy.a(Appboy)>
	//*  45  110:invokestatic    #75  <Method boolean bi.a(Context)>
	//*  46  113:ifeq            150
			{
				AppboyLogger.i(Appboy.b(), "Amazon Device Messaging found. Setting up Amazon Device Messaging");
	//   47  116:invokestatic    #46  <Method String Appboy.b()>
	//   48  119:ldc1            #77  <String "Amazon Device Messaging found. Setting up Amazon Device Messaging">
	//   49  121:invokestatic    #53  <Method int AppboyLogger.i(String, String)>
	//   50  124:pop             
				(new bi(Appboy.a(b), b.j)).a();
	//   51  125:new             #72  <Class bi>
	//   52  128:dup             
	//   53  129:aload_0         
	//   54  130:getfield        #18  <Field Appboy b>
	//   55  133:invokestatic    #38  <Method Context Appboy.a(Appboy)>
	//   56  136:aload_0         
	//   57  137:getfield        #18  <Field Appboy b>
	//   58  140:getfield        #81  <Field bo.app.bx Appboy.j>
	//   59  143:invokespecial   #84  <Method void bi(Context, bo.app.bx)>
	//   60  146:invokevirtual   #86  <Method void bi.a()>
				return;
	//   61  149:return          
			} else
			{
				AppboyLogger.e(Appboy.b(), "ADM manifest requirements not met. Braze will not register for ADM.");
	//   62  150:invokestatic    #46  <Method String Appboy.b()>
	//   63  153:ldc1            #88  <String "ADM manifest requirements not met. Braze will not register for ADM.">
	//   64  155:invokestatic    #65  <Method int AppboyLogger.e(String, String)>
	//   65  158:pop             
				return;
	//   66  159:return          
			}
		} else
		{
			AppboyLogger.i(Appboy.b(), "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.");
	//   67  160:invokestatic    #46  <Method String Appboy.b()>
	//   68  163:ldc1            #90  <String "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.">
	//   69  165:invokestatic    #53  <Method int AppboyLogger.i(String, String)>
	//   70  168:pop             
			return;
	//   71  169:return          
		}
	}

	final Context a;
	final Appboy b;

	Appboy$12(Appboy appboy, Context context)
	{
		b = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Appboy b>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Context a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
