// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import android.content.Context;
import com.irobot.home.model.rest.RegisterCustomer;
import com.irobot.home.model.rest.RegisterCustomerInfo;
import com.irobot.home.model.rest.RegisterRobot;
import com.irobot.home.model.rest.RegisterRobotInfo;
import java.util.ArrayList;
import java.util.List;
import org.c.b.b;
import org.c.c.b.b.a;
import org.c.c.f;
import org.c.f.a.k;

// Referenced classes of package com.irobot.home.rest:
//			RegistrationRestClient, RestLoggingInterceptor

public final class RegistrationRestClient_
	implements RegistrationRestClient
{

	public RegistrationRestClient_(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		rootUrl = "https://irobot-homesupport--tst4.custhelp.com/cc/api/v1/";
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <String "https://irobot-homesupport--tst4.custhelp.com/cc/api/v1/">
	//    4    7:putfield        #21  <Field String rootUrl>
		restTemplate = new k();
	//    5   10:aload_0         
	//    6   11:new             #23  <Class k>
	//    7   14:dup             
	//    8   15:invokespecial   #24  <Method void k()>
	//    9   18:putfield        #26  <Field k restTemplate>
		restTemplate.c().clear();
	//   10   21:aload_0         
	//   11   22:getfield        #26  <Field k restTemplate>
	//   12   25:invokevirtual   #30  <Method List k.c()>
	//   13   28:invokeinterface #35  <Method void List.clear()>
		restTemplate.c().add(((Object) (new a())));
	//   14   33:aload_0         
	//   15   34:getfield        #26  <Field k restTemplate>
	//   16   37:invokevirtual   #30  <Method List k.c()>
	//   17   40:new             #37  <Class a>
	//   18   43:dup             
	//   19   44:invokespecial   #38  <Method void a()>
	//   20   47:invokeinterface #42  <Method boolean List.add(Object)>
	//   21   52:pop             
		restTemplate.a(((List) (new ArrayList())));
	//   22   53:aload_0         
	//   23   54:getfield        #26  <Field k restTemplate>
	//   24   57:new             #44  <Class ArrayList>
	//   25   60:dup             
	//   26   61:invokespecial   #45  <Method void ArrayList()>
	//   27   64:invokevirtual   #49  <Method void k.a(List)>
		restTemplate.b().add(((Object) (new RestLoggingInterceptor())));
	//   28   67:aload_0         
	//   29   68:getfield        #26  <Field k restTemplate>
	//   30   71:invokevirtual   #52  <Method List k.b()>
	//   31   74:new             #54  <Class RestLoggingInterceptor>
	//   32   77:dup             
	//   33   78:invokespecial   #55  <Method void RestLoggingInterceptor()>
	//   34   81:invokeinterface #42  <Method boolean List.add(Object)>
	//   35   86:pop             
	//   36   87:return          
	}

	public RegisterCustomerInfo registerCustomer(RegisterCustomer registercustomer)
	{
		try
		{
			registercustomer = ((RegisterCustomer) (new org.c.c.b(((Object) (registercustomer)))));
	//    0    0:new             #62  <Class org.c.c.b>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #65  <Method void org.c.c.b(Object)>
	//    4    8:astore_1        
			registercustomer = ((RegisterCustomer) ((RegisterCustomerInfo)restTemplate.a(rootUrl.concat("Contact"), f.POST, ((org.c.c.b) (registercustomer)), com/irobot/home/model/rest/RegisterCustomerInfo, new Object[0]).b()));
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field k restTemplate>
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field String rootUrl>
	//    9   17:ldc1            #67  <String "Contact">
	//   10   19:invokevirtual   #73  <Method String String.concat(String)>
	//   11   22:getstatic       #79  <Field f f.POST>
	//   12   25:aload_1         
	//   13   26:ldc1            #81  <Class RegisterCustomerInfo>
	//   14   28:iconst_0        
	//   15   29:anewarray       Object[]
	//   16   32:invokevirtual   #84  <Method org.c.c.k k.a(String, f, org.c.c.b, Class, Object[])>
	//   17   35:invokevirtual   #89  <Method Object org.c.c.k.b()>
	//   18   38:checkcast       #81  <Class RegisterCustomerInfo>
	//   19   41:astore_1        
		}
	//*  20   42:aload_1         
	//*  21   43:areturn         
		// Misplaced declaration of an exception variable
		catch(RegisterCustomer registercustomer)
	//*  22   44:astore_1        
		{
			if(restErrorHandler != null)
	//*  23   45:aload_0         
	//*  24   46:getfield        #91  <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  25   49:ifnull          64
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (registercustomer)));
	//   26   52:aload_0         
	//   27   53:getfield        #91  <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   28   56:aload_1         
	//   29   57:invokeinterface #97  <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   30   62:aconst_null     
	//   31   63:areturn         
			} else
			{
				throw registercustomer;
	//   32   64:aload_1         
	//   33   65:athrow          
			}
		}
		return ((RegisterCustomerInfo) (registercustomer));
	}

	public RegisterRobotInfo registerRobot(RegisterRobot registerrobot)
	{
		try
		{
			registerrobot = ((RegisterRobot) (new org.c.c.b(((Object) (registerrobot)))));
	//    0    0:new             #62  <Class org.c.c.b>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #65  <Method void org.c.c.b(Object)>
	//    4    8:astore_1        
			registerrobot = ((RegisterRobot) ((RegisterRobotInfo)restTemplate.a(rootUrl.concat("Registration"), f.POST, ((org.c.c.b) (registerrobot)), com/irobot/home/model/rest/RegisterRobotInfo, new Object[0]).b()));
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field k restTemplate>
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field String rootUrl>
	//    9   17:ldc1            #101 <String "Registration">
	//   10   19:invokevirtual   #73  <Method String String.concat(String)>
	//   11   22:getstatic       #79  <Field f f.POST>
	//   12   25:aload_1         
	//   13   26:ldc1            #103 <Class RegisterRobotInfo>
	//   14   28:iconst_0        
	//   15   29:anewarray       Object[]
	//   16   32:invokevirtual   #84  <Method org.c.c.k k.a(String, f, org.c.c.b, Class, Object[])>
	//   17   35:invokevirtual   #89  <Method Object org.c.c.k.b()>
	//   18   38:checkcast       #103 <Class RegisterRobotInfo>
	//   19   41:astore_1        
		}
	//*  20   42:aload_1         
	//*  21   43:areturn         
		// Misplaced declaration of an exception variable
		catch(RegisterRobot registerrobot)
	//*  22   44:astore_1        
		{
			if(restErrorHandler != null)
	//*  23   45:aload_0         
	//*  24   46:getfield        #91  <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  25   49:ifnull          64
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (registerrobot)));
	//   26   52:aload_0         
	//   27   53:getfield        #91  <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   28   56:aload_1         
	//   29   57:invokeinterface #97  <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   30   62:aconst_null     
	//   31   63:areturn         
			} else
			{
				throw registerrobot;
	//   32   64:aload_1         
	//   33   65:athrow          
			}
		}
		return ((RegisterRobotInfo) (registerrobot));
	}

	public void setRestErrorHandler(org.androidannotations.a.a.a.b b1)
	{
		restErrorHandler = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #91  <Field org.androidannotations.a.a.a.b restErrorHandler>
	//    3    5:return          
	}

	public void setRootUrl(String s)
	{
		rootUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String rootUrl>
	//    3    5:return          
	}

	private org.androidannotations.a.a.a.b restErrorHandler;
	private k restTemplate;
	private String rootUrl;
}
