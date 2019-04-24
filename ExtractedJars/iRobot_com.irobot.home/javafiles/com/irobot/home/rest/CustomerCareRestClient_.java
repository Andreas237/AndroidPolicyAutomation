// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import android.content.Context;
import com.irobot.home.model.aa;
import com.irobot.home.model.l;
import com.irobot.home.model.rest.AppVersionItemList;
import com.irobot.home.model.rest.CommonQuestionList;
import com.irobot.home.model.rest.CompletePartsInfo;
import com.irobot.home.model.rest.ContactInfo;
import com.irobot.home.model.rest.CustomerCareInfo;
import com.irobot.home.model.rest.FirmwareUpdateItemList;
import com.irobot.home.model.rest.HelpInfo;
import com.irobot.home.model.rest.LanguagePackList;
import com.irobot.home.model.rest.LearnMoreInfo;
import com.irobot.home.model.rest.NewFeatureInfo;
import com.irobot.home.model.rest.RobotErrorHelpContentList;
import com.irobot.home.model.rest.SocialInfoList;
import com.irobot.home.model.rest.StandbyModeInfo;
import com.irobot.home.model.rest.TermsInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.c.b.b;
import org.c.c.b.b.a;
import org.c.c.b.i;
import org.c.c.f;
import org.c.f.a.k;

// Referenced classes of package com.irobot.home.rest:
//			CustomerCareRestClient, AssetSkuInterceptor, RestLoggingInterceptor, CustomRequestFactory

public final class CustomerCareRestClient_
	implements CustomerCareRestClient
{

	public CustomerCareRestClient_(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		rootUrl = "https://www.irobot.com/services/content/";
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <String "https://www.irobot.com/services/content/">
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
		restTemplate.c().add(((Object) (new i())));
	//   14   33:aload_0         
	//   15   34:getfield        #26  <Field k restTemplate>
	//   16   37:invokevirtual   #30  <Method List k.c()>
	//   17   40:new             #37  <Class i>
	//   18   43:dup             
	//   19   44:invokespecial   #38  <Method void i()>
	//   20   47:invokeinterface #42  <Method boolean List.add(Object)>
	//   21   52:pop             
		restTemplate.c().add(((Object) (new a())));
	//   22   53:aload_0         
	//   23   54:getfield        #26  <Field k restTemplate>
	//   24   57:invokevirtual   #30  <Method List k.c()>
	//   25   60:new             #44  <Class a>
	//   26   63:dup             
	//   27   64:invokespecial   #45  <Method void a()>
	//   28   67:invokeinterface #42  <Method boolean List.add(Object)>
	//   29   72:pop             
		restTemplate.a(((List) (new ArrayList())));
	//   30   73:aload_0         
	//   31   74:getfield        #26  <Field k restTemplate>
	//   32   77:new             #47  <Class ArrayList>
	//   33   80:dup             
	//   34   81:invokespecial   #48  <Method void ArrayList()>
	//   35   84:invokevirtual   #52  <Method void k.a(List)>
		restTemplate.b().add(((Object) (new AssetSkuInterceptor())));
	//   36   87:aload_0         
	//   37   88:getfield        #26  <Field k restTemplate>
	//   38   91:invokevirtual   #55  <Method List k.b()>
	//   39   94:new             #57  <Class AssetSkuInterceptor>
	//   40   97:dup             
	//   41   98:invokespecial   #58  <Method void AssetSkuInterceptor()>
	//   42  101:invokeinterface #42  <Method boolean List.add(Object)>
	//   43  106:pop             
		restTemplate.b().add(((Object) (new RestLoggingInterceptor())));
	//   44  107:aload_0         
	//   45  108:getfield        #26  <Field k restTemplate>
	//   46  111:invokevirtual   #55  <Method List k.b()>
	//   47  114:new             #60  <Class RestLoggingInterceptor>
	//   48  117:dup             
	//   49  118:invokespecial   #61  <Method void RestLoggingInterceptor()>
	//   50  121:invokeinterface #42  <Method boolean List.add(Object)>
	//   51  126:pop             
		restTemplate.a(((org.c.c.a.g) (new CustomRequestFactory())));
	//   52  127:aload_0         
	//   53  128:getfield        #26  <Field k restTemplate>
	//   54  131:new             #63  <Class CustomRequestFactory>
	//   55  134:dup             
	//   56  135:invokespecial   #64  <Method void CustomRequestFactory()>
	//   57  138:invokevirtual   #67  <Method void k.a(org.c.c.a.g)>
	//   58  141:return          
	}

	public AppVersionItemList getAppVersionInfo(String s)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore_2        
			hashmap.put("countryCode", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #77  <String "countryCode">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   15:pop             
			s = ((String) ((AppVersionItemList)restTemplate.a(rootUrl.concat("latesthomeapp/{countryCode}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/AppVersionItemList, ((java.util.Map) (hashmap))).b()));
	//    9   16:aload_0         
	//   10   17:getfield        #26  <Field k restTemplate>
	//   11   20:aload_0         
	//   12   21:getfield        #21  <Field String rootUrl>
	//   13   24:ldc1            #83  <String "latesthomeapp/{countryCode}">
	//   14   26:invokevirtual   #89  <Method String String.concat(String)>
	//   15   29:getstatic       #95  <Field f f.GET>
	//   16   32:aconst_null     
	//   17   33:ldc1            #97  <Class AppVersionItemList>
	//   18   35:aload_2         
	//   19   36:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   20   39:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   21   42:checkcast       #97  <Class AppVersionItemList>
	//   22   45:astore_1        
		}
	//*  23   46:aload_1         
	//*  24   47:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  25   48:astore_1        
		{
			if(restErrorHandler != null)
	//*  26   49:aload_0         
	//*  27   50:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  28   53:ifnull          68
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   29   56:aload_0         
	//   30   57:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   31   60:aload_1         
	//   32   61:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   33   66:aconst_null     
	//   34   67:areturn         
			} else
			{
				throw s;
	//   35   68:aload_1         
	//   36   69:athrow          
			}
		}
		return ((AppVersionItemList) (s));
	}

	public ContactInfo getContactInfo(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    9:aload           4
	//    5   11:ldc1            #77  <String "countryCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #117 <String "languageCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("sku", ((Object) (s2)));
	//   14   27:aload           4
	//   15   29:ldc1            #119 <String "sku">
	//   16   31:aload_3         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((ContactInfo)restTemplate.a(rootUrl.concat("help/{languageCode}/{countryCode}/{sku}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/ContactInfo, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #121 <String "help/{languageCode}/{countryCode}/{sku}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #123 <Class ContactInfo>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #123 <Class ContactInfo>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((ContactInfo) (s));
	}

	public CustomerCareInfo getCustomerCareInfo(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    9:aload           4
	//    5   11:ldc1            #77  <String "countryCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #117 <String "languageCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("sku", ((Object) (s2)));
	//   14   27:aload           4
	//   15   29:ldc1            #119 <String "sku">
	//   16   31:aload_3         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((CustomerCareInfo)restTemplate.a(rootUrl.concat("help/{languageCode}/{countryCode}/{sku}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/CustomerCareInfo, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #121 <String "help/{languageCode}/{countryCode}/{sku}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #127 <Class CustomerCareInfo>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #127 <Class CustomerCareInfo>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((CustomerCareInfo) (s));
	}

	public FirmwareUpdateItemList getFirmwareUpdates(String s)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore_2        
			hashmap.put("sku", ((Object) (s)));
	//    4    8:aload_2         
	//    5    9:ldc1            #119 <String "sku">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   15:pop             
			s = ((String) ((FirmwareUpdateItemList)restTemplate.a(rootUrl.concat("firmware/{sku}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/FirmwareUpdateItemList, ((java.util.Map) (hashmap))).b()));
	//    9   16:aload_0         
	//   10   17:getfield        #26  <Field k restTemplate>
	//   11   20:aload_0         
	//   12   21:getfield        #21  <Field String rootUrl>
	//   13   24:ldc1            #131 <String "firmware/{sku}">
	//   14   26:invokevirtual   #89  <Method String String.concat(String)>
	//   15   29:getstatic       #95  <Field f f.GET>
	//   16   32:aconst_null     
	//   17   33:ldc1            #133 <Class FirmwareUpdateItemList>
	//   18   35:aload_2         
	//   19   36:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   20   39:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   21   42:checkcast       #133 <Class FirmwareUpdateItemList>
	//   22   45:astore_1        
		}
	//*  23   46:aload_1         
	//*  24   47:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  25   48:astore_1        
		{
			if(restErrorHandler != null)
	//*  26   49:aload_0         
	//*  27   50:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  28   53:ifnull          68
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   29   56:aload_0         
	//   30   57:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   31   60:aload_1         
	//   32   61:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   33   66:aconst_null     
	//   34   67:areturn         
			} else
			{
				throw s;
	//   35   68:aload_1         
	//   36   69:athrow          
			}
		}
		return ((FirmwareUpdateItemList) (s));
	}

	public CommonQuestionList getHelpCommonQuestionsList(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    9:aload           4
	//    5   11:ldc1            #77  <String "countryCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #117 <String "languageCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("sku", ((Object) (s2)));
	//   14   27:aload           4
	//   15   29:ldc1            #119 <String "sku">
	//   16   31:aload_3         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((CommonQuestionList)restTemplate.a(rootUrl.concat("help/{languageCode}/{countryCode}/{sku}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/CommonQuestionList, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #121 <String "help/{languageCode}/{countryCode}/{sku}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #137 <Class CommonQuestionList>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #137 <Class CommonQuestionList>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((CommonQuestionList) (s));
	}

	public l getHelpGuideTourPagesList(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    9:aload           4
	//    5   11:ldc1            #77  <String "countryCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #117 <String "languageCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("sku", ((Object) (s2)));
	//   14   27:aload           4
	//   15   29:ldc1            #119 <String "sku">
	//   16   31:aload_3         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((l)restTemplate.a(rootUrl.concat("help/{languageCode}/{countryCode}/{sku}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/l, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #121 <String "help/{languageCode}/{countryCode}/{sku}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #141 <Class l>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #141 <Class l>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((l) (s));
	}

	public HelpInfo getHelpInfo(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    9:aload           4
	//    5   11:ldc1            #77  <String "countryCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #117 <String "languageCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("sku", ((Object) (s2)));
	//   14   27:aload           4
	//   15   29:ldc1            #119 <String "sku">
	//   16   31:aload_3         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((HelpInfo)restTemplate.a(rootUrl.concat("help/{languageCode}/{countryCode}/{sku}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/HelpInfo, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #121 <String "help/{languageCode}/{countryCode}/{sku}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #145 <Class HelpInfo>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #145 <Class HelpInfo>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((HelpInfo) (s));
	}

	public LanguagePackList getLanguagePack(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("packId", ((Object) (s2)));
	//    4    9:aload           4
	//    5   11:ldc1            #149 <String "packId">
	//    6   13:aload_3         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("countryCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #77  <String "countryCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("sku", ((Object) (s1)));
	//   14   27:aload           4
	//   15   29:ldc1            #119 <String "sku">
	//   16   31:aload_2         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((LanguagePackList)restTemplate.a(rootUrl.concat("langpack/{countryCode}/{sku}/{packId}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/LanguagePackList, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #151 <String "langpack/{countryCode}/{sku}/{packId}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #153 <Class LanguagePackList>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #153 <Class LanguagePackList>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((LanguagePackList) (s));
	}

	public LearnMoreInfo getLearnMoreInfo(String s, String s1)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore_3        
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    8:aload_3         
	//    5    9:ldc1            #77  <String "countryCode">
	//    6   11:aload_2         
	//    7   12:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   15:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   16:aload_3         
	//   10   17:ldc1            #117 <String "languageCode">
	//   11   19:aload_1         
	//   12   20:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   23:pop             
			s = ((String) ((LearnMoreInfo)restTemplate.a(rootUrl.concat("about/{languageCode}/{countryCode}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/LearnMoreInfo, ((java.util.Map) (hashmap))).b()));
	//   14   24:aload_0         
	//   15   25:getfield        #26  <Field k restTemplate>
	//   16   28:aload_0         
	//   17   29:getfield        #21  <Field String rootUrl>
	//   18   32:ldc1            #157 <String "about/{languageCode}/{countryCode}">
	//   19   34:invokevirtual   #89  <Method String String.concat(String)>
	//   20   37:getstatic       #95  <Field f f.GET>
	//   21   40:aconst_null     
	//   22   41:ldc1            #159 <Class LearnMoreInfo>
	//   23   43:aload_3         
	//   24   44:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   25   47:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   26   50:checkcast       #159 <Class LearnMoreInfo>
	//   27   53:astore_1        
		}
	//*  28   54:aload_1         
	//*  29   55:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  30   56:astore_1        
		{
			if(restErrorHandler != null)
	//*  31   57:aload_0         
	//*  32   58:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  33   61:ifnull          76
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   34   64:aload_0         
	//   35   65:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   36   68:aload_1         
	//   37   69:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   38   74:aconst_null     
	//   39   75:areturn         
			} else
			{
				throw s;
	//   40   76:aload_1         
	//   41   77:athrow          
			}
		}
		return ((LearnMoreInfo) (s));
	}

	public NewFeatureInfo getNewFeatureInfo(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    9:aload           4
	//    5   11:ldc1            #77  <String "countryCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #117 <String "languageCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("versionName", ((Object) (s2)));
	//   14   27:aload           4
	//   15   29:ldc1            #163 <String "versionName">
	//   16   31:aload_3         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((NewFeatureInfo)restTemplate.a(rootUrl.concat("appnotes/{languageCode}/{countryCode}/{versionName}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/NewFeatureInfo, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #165 <String "appnotes/{languageCode}/{countryCode}/{versionName}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #167 <Class NewFeatureInfo>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #167 <Class NewFeatureInfo>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((NewFeatureInfo) (s));
	}

	public CompletePartsInfo getPartsContentInfo(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    9:aload           4
	//    5   11:ldc1            #77  <String "countryCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #117 <String "languageCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("sku", ((Object) (s2)));
	//   14   27:aload           4
	//   15   29:ldc1            #119 <String "sku">
	//   16   31:aload_3         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((CompletePartsInfo)restTemplate.a(rootUrl.concat("parts/{languageCode}/{countryCode}/{sku}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/CompletePartsInfo, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #171 <String "parts/{languageCode}/{countryCode}/{sku}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #173 <Class CompletePartsInfo>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #173 <Class CompletePartsInfo>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((CompletePartsInfo) (s));
	}

	public RobotErrorHelpContentList getRobotErrorHelp(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    9:aload           4
	//    5   11:ldc1            #77  <String "countryCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #117 <String "languageCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("sku", ((Object) (s2)));
	//   14   27:aload           4
	//   15   29:ldc1            #119 <String "sku">
	//   16   31:aload_3         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((RobotErrorHelpContentList)restTemplate.a(rootUrl.concat("help/{languageCode}/{countryCode}/{sku}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/RobotErrorHelpContentList, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #121 <String "help/{languageCode}/{countryCode}/{sku}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #177 <Class RobotErrorHelpContentList>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #177 <Class RobotErrorHelpContentList>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((RobotErrorHelpContentList) (s));
	}

	public SocialInfoList getSocialInfo(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    9:aload           4
	//    5   11:ldc1            #77  <String "countryCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #117 <String "languageCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("sku", ((Object) (s2)));
	//   14   27:aload           4
	//   15   29:ldc1            #119 <String "sku">
	//   16   31:aload_3         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((SocialInfoList)restTemplate.a(rootUrl.concat("social/{languageCode}/{countryCode}/{sku}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/SocialInfoList, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #181 <String "social/{languageCode}/{countryCode}/{sku}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #183 <Class SocialInfoList>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #183 <Class SocialInfoList>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((SocialInfoList) (s));
	}

	public StandbyModeInfo getStandbyModeInfo(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    9:aload           4
	//    5   11:ldc1            #77  <String "countryCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #117 <String "languageCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("sku", ((Object) (s2)));
	//   14   27:aload           4
	//   15   29:ldc1            #119 <String "sku">
	//   16   31:aload_3         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((StandbyModeInfo)restTemplate.a(rootUrl.concat("help/{languageCode}/{countryCode}/{sku}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/StandbyModeInfo, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #121 <String "help/{languageCode}/{countryCode}/{sku}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #187 <Class StandbyModeInfo>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #187 <Class StandbyModeInfo>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((StandbyModeInfo) (s));
	}

	public aa getSupportedCountries()
	{
		aa aa1;
		try
		{
			aa1 = (aa)restTemplate.a(rootUrl.concat("supportedcountries"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/aa, new Object[0]).b();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field k restTemplate>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String rootUrl>
	//    4    8:ldc1            #191 <String "supportedcountries">
	//    5   10:invokevirtual   #89  <Method String String.concat(String)>
	//    6   13:getstatic       #95  <Field f f.GET>
	//    7   16:aconst_null     
	//    8   17:ldc1            #193 <Class aa>
	//    9   19:iconst_0        
	//   10   20:anewarray       Object[]
	//   11   23:invokevirtual   #196 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, Object[])>
	//   12   26:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   13   29:checkcast       #193 <Class aa>
	//   14   32:astore_1        
		}
	//*  15   33:aload_1         
	//*  16   34:areturn         
		catch(b b1)
	//*  17   35:astore_1        
		{
			if(restErrorHandler != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  20   40:ifnull          55
			{
				restErrorHandler.onRestClientExceptionThrown(b1);
	//   21   43:aload_0         
	//   22   44:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   23   47:aload_1         
	//   24   48:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   25   53:aconst_null     
	//   26   54:areturn         
			} else
			{
				throw b1;
	//   27   55:aload_1         
	//   28   56:athrow          
			}
		}
		return aa1;
	}

	public String getSupportedCountriesString()
	{
		String s;
		try
		{
			s = (String)restTemplate.a(rootUrl.concat("supportedcountries"), f.GET, ((org.c.c.b) (null)), java/lang/String, new Object[0]).b();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field k restTemplate>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String rootUrl>
	//    4    8:ldc1            #191 <String "supportedcountries">
	//    5   10:invokevirtual   #89  <Method String String.concat(String)>
	//    6   13:getstatic       #95  <Field f f.GET>
	//    7   16:aconst_null     
	//    8   17:ldc1            #85  <Class String>
	//    9   19:iconst_0        
	//   10   20:anewarray       Object[]
	//   11   23:invokevirtual   #196 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, Object[])>
	//   12   26:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   13   29:checkcast       #85  <Class String>
	//   14   32:astore_1        
		}
	//*  15   33:aload_1         
	//*  16   34:areturn         
		catch(b b1)
	//*  17   35:astore_1        
		{
			if(restErrorHandler != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  20   40:ifnull          55
			{
				restErrorHandler.onRestClientExceptionThrown(b1);
	//   21   43:aload_0         
	//   22   44:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   23   47:aload_1         
	//   24   48:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   25   53:aconst_null     
	//   26   54:areturn         
			} else
			{
				throw b1;
	//   27   55:aload_1         
	//   28   56:athrow          
			}
		}
		return s;
	}

	public TermsInfo getTermsInfo(String s, String s1, String s2)
	{
		try
		{
			HashMap hashmap = new HashMap();
	//    0    0:new             #74  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void HashMap()>
	//    3    7:astore          4
			hashmap.put("countryCode", ((Object) (s1)));
	//    4    9:aload           4
	//    5   11:ldc1            #77  <String "countryCode">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
			hashmap.put("languageCode", ((Object) (s)));
	//    9   18:aload           4
	//   10   20:ldc1            #117 <String "languageCode">
	//   11   22:aload_1         
	//   12   23:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   13   26:pop             
			hashmap.put("sku", ((Object) (s2)));
	//   14   27:aload           4
	//   15   29:ldc1            #119 <String "sku">
	//   16   31:aload_3         
	//   17   32:invokevirtual   #81  <Method Object HashMap.put(Object, Object)>
	//   18   35:pop             
			s = ((String) ((TermsInfo)restTemplate.a(rootUrl.concat("terms/{languageCode}/{countryCode}/{sku}"), f.GET, ((org.c.c.b) (null)), com/irobot/home/model/rest/TermsInfo, ((java.util.Map) (hashmap))).b()));
	//   19   36:aload_0         
	//   20   37:getfield        #26  <Field k restTemplate>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field String rootUrl>
	//   23   44:ldc1            #202 <String "terms/{languageCode}/{countryCode}/{sku}">
	//   24   46:invokevirtual   #89  <Method String String.concat(String)>
	//   25   49:getstatic       #95  <Field f f.GET>
	//   26   52:aconst_null     
	//   27   53:ldc1            #204 <Class TermsInfo>
	//   28   55:aload           4
	//   29   57:invokevirtual   #100 <Method org.c.c.k k.a(String, f, org.c.c.b, Class, java.util.Map)>
	//   30   60:invokevirtual   #105 <Method Object org.c.c.k.b()>
	//   31   63:checkcast       #204 <Class TermsInfo>
	//   32   66:astore_1        
		}
	//*  33   67:aload_1         
	//*  34   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   69:astore_1        
		{
			if(restErrorHandler != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//*  38   74:ifnull          89
			{
				restErrorHandler.onRestClientExceptionThrown(((b) (s)));
	//   39   77:aload_0         
	//   40   78:getfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
	//   41   81:aload_1         
	//   42   82:invokeinterface #113 <Method void org.androidannotations.a.a.a.b.onRestClientExceptionThrown(b)>
				return null;
	//   43   87:aconst_null     
	//   44   88:areturn         
			} else
			{
				throw s;
	//   45   89:aload_1         
	//   46   90:athrow          
			}
		}
		return ((TermsInfo) (s));
	}

	public void setRestErrorHandler(org.androidannotations.a.a.a.b b1)
	{
		restErrorHandler = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #107 <Field org.androidannotations.a.a.a.b restErrorHandler>
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
