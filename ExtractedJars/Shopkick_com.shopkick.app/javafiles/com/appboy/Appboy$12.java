// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.content.Context;
import bo.app.*;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$12
	implements Runnable
{

	public void run()
	{
		if(b.h.isFirebaseCloudMessagingRegistrationEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Appboy b>
	//*   2    4:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
	//*   3    7:invokevirtual   #35  <Method boolean AppboyConfigurationProvider.isFirebaseCloudMessagingRegistrationEnabled()>
	//*   4   10:ifeq            81
		{
			if(bj.a(Appboy.a(b), b.h))
	//*   5   13:aload_0         
	//*   6   14:getfield        #18  <Field Appboy b>
	//*   7   17:invokestatic    #38  <Method Context Appboy.a(Appboy)>
	//*   8   20:aload_0         
	//*   9   21:getfield        #18  <Field Appboy b>
	//*  10   24:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
	//*  11   27:invokestatic    #43  <Method boolean bj.a(Context, AppboyConfigurationProvider)>
	//*  12   30:ifeq            69
			{
				AppboyLogger.i(Appboy.b(), "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.");
	//   13   33:invokestatic    #46  <Method String Appboy.b()>
	//   14   36:ldc1            #48  <String "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.">
	//   15   38:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
	//   16   41:pop             
				(new bj(a)).a(b.h.getFirebaseCloudMessagingSenderIdKey());
	//   17   42:new             #40  <Class bj>
	//   18   45:dup             
	//   19   46:aload_0         
	//   20   47:getfield        #20  <Field Context a>
	//   21   50:invokespecial   #55  <Method void bj(Context)>
	//   22   53:aload_0         
	//   23   54:getfield        #18  <Field Appboy b>
	//   24   57:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
	//   25   60:invokevirtual   #58  <Method String AppboyConfigurationProvider.getFirebaseCloudMessagingSenderIdKey()>
	//   26   63:invokevirtual   #61  <Method void bj.a(String)>
			} else
	//*  27   66:goto            90
			{
				AppboyLogger.e(Appboy.b(), "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.");
	//   28   69:invokestatic    #46  <Method String Appboy.b()>
	//   29   72:ldc1            #63  <String "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.">
	//   30   74:invokestatic    #66  <Method int AppboyLogger.e(String, String)>
	//   31   77:pop             
			}
		} else
	//*  32   78:goto            90
		{
			AppboyLogger.i(Appboy.b(), "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.");
	//   33   81:invokestatic    #46  <Method String Appboy.b()>
	//   34   84:ldc1            #68  <String "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.">
	//   35   86:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
	//   36   89:pop             
		}
		if(b.h.isGcmMessagingRegistrationEnabled())
	//*  37   90:aload_0         
	//*  38   91:getfield        #18  <Field Appboy b>
	//*  39   94:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
	//*  40   97:invokevirtual   #71  <Method boolean AppboyConfigurationProvider.isGcmMessagingRegistrationEnabled()>
	//*  41  100:ifeq            208
		{
			if(bk.a(Appboy.a(b), b.h))
	//*  42  103:aload_0         
	//*  43  104:getfield        #18  <Field Appboy b>
	//*  44  107:invokestatic    #38  <Method Context Appboy.a(Appboy)>
	//*  45  110:aload_0         
	//*  46  111:getfield        #18  <Field Appboy b>
	//*  47  114:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
	//*  48  117:invokestatic    #74  <Method boolean bk.a(Context, AppboyConfigurationProvider)>
	//*  49  120:ifeq            196
			{
				AppboyLogger.i(Appboy.b(), "Google Cloud Messaging found. Setting up Google Cloud Messaging");
	//   50  123:invokestatic    #46  <Method String Appboy.b()>
	//   51  126:ldc1            #76  <String "Google Cloud Messaging found. Setting up Google Cloud Messaging">
	//   52  128:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
	//   53  131:pop             
				bk bk1 = new bk(Appboy.a(b), b.i);
	//   54  132:new             #73  <Class bk>
	//   55  135:dup             
	//   56  136:aload_0         
	//   57  137:getfield        #18  <Field Appboy b>
	//   58  140:invokestatic    #38  <Method Context Appboy.a(Appboy)>
	//   59  143:aload_0         
	//   60  144:getfield        #18  <Field Appboy b>
	//   61  147:getfield        #79  <Field bo.app.bp Appboy.i>
	//   62  150:invokespecial   #82  <Method void bk(Context, bo.app.bp)>
	//   63  153:astore_1        
				String s = b.h.getGcmSenderId();
	//   64  154:aload_0         
	//   65  155:getfield        #18  <Field Appboy b>
	//   66  158:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
	//   67  161:invokevirtual   #85  <Method String AppboyConfigurationProvider.getGcmSenderId()>
	//   68  164:astore_2        
				if(s != null)
	//*  69  165:aload_2         
	//*  70  166:ifnull          184
					bk1.a(new String[] {
						s
					});
	//   71  169:aload_1         
	//   72  170:iconst_1        
	//   73  171:anewarray       String[]
	//   74  174:dup             
	//   75  175:iconst_0        
	//   76  176:aload_2         
	//   77  177:aastore         
	//   78  178:invokevirtual   #90  <Method void bk.a(String[])>
				else
	//*  79  181:goto            217
					AppboyLogger.e(Appboy.b(), "GCM Sender Id not found, not registering with GCM Server");
	//   80  184:invokestatic    #46  <Method String Appboy.b()>
	//   81  187:ldc1            #92  <String "GCM Sender Id not found, not registering with GCM Server">
	//   82  189:invokestatic    #66  <Method int AppboyLogger.e(String, String)>
	//   83  192:pop             
			} else
	//*  84  193:goto            217
			{
				AppboyLogger.e(Appboy.b(), "GCM manifest requirements not met. Braze will not register for GCM.");
	//   85  196:invokestatic    #46  <Method String Appboy.b()>
	//   86  199:ldc1            #94  <String "GCM manifest requirements not met. Braze will not register for GCM.">
	//   87  201:invokestatic    #66  <Method int AppboyLogger.e(String, String)>
	//   88  204:pop             
			}
		} else
	//*  89  205:goto            217
		{
			AppboyLogger.i(Appboy.b(), "Automatic GCM registration not enabled in configuration. Braze will not register for GCM.");
	//   90  208:invokestatic    #46  <Method String Appboy.b()>
	//   91  211:ldc1            #96  <String "Automatic GCM registration not enabled in configuration. Braze will not register for GCM.">
	//   92  213:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
	//   93  216:pop             
		}
		if(b.h.isAdmMessagingRegistrationEnabled())
	//*  94  217:aload_0         
	//*  95  218:getfield        #18  <Field Appboy b>
	//*  96  221:getfield        #29  <Field AppboyConfigurationProvider Appboy.h>
	//*  97  224:invokevirtual   #99  <Method boolean AppboyConfigurationProvider.isAdmMessagingRegistrationEnabled()>
	//*  98  227:ifeq            287
		{
			if(az.a(Appboy.a(b)))
	//*  99  230:aload_0         
	//* 100  231:getfield        #18  <Field Appboy b>
	//* 101  234:invokestatic    #38  <Method Context Appboy.a(Appboy)>
	//* 102  237:invokestatic    #104 <Method boolean az.a(Context)>
	//* 103  240:ifeq            277
			{
				AppboyLogger.i(Appboy.b(), "Amazon Device Messaging found. Setting up Amazon Device Messaging");
	//  104  243:invokestatic    #46  <Method String Appboy.b()>
	//  105  246:ldc1            #106 <String "Amazon Device Messaging found. Setting up Amazon Device Messaging">
	//  106  248:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
	//  107  251:pop             
				(new az(Appboy.a(b), b.i)).a();
	//  108  252:new             #101 <Class az>
	//  109  255:dup             
	//  110  256:aload_0         
	//  111  257:getfield        #18  <Field Appboy b>
	//  112  260:invokestatic    #38  <Method Context Appboy.a(Appboy)>
	//  113  263:aload_0         
	//  114  264:getfield        #18  <Field Appboy b>
	//  115  267:getfield        #79  <Field bo.app.bp Appboy.i>
	//  116  270:invokespecial   #107 <Method void az(Context, bo.app.bp)>
	//  117  273:invokevirtual   #109 <Method void az.a()>
				return;
	//  118  276:return          
			} else
			{
				AppboyLogger.e(Appboy.b(), "ADM manifest requirements not met. Braze will not register for ADM.");
	//  119  277:invokestatic    #46  <Method String Appboy.b()>
	//  120  280:ldc1            #111 <String "ADM manifest requirements not met. Braze will not register for ADM.">
	//  121  282:invokestatic    #66  <Method int AppboyLogger.e(String, String)>
	//  122  285:pop             
				return;
	//  123  286:return          
			}
		} else
		{
			AppboyLogger.i(Appboy.b(), "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.");
	//  124  287:invokestatic    #46  <Method String Appboy.b()>
	//  125  290:ldc1            #113 <String "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.">
	//  126  292:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
	//  127  295:pop             
			return;
	//  128  296:return          
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
