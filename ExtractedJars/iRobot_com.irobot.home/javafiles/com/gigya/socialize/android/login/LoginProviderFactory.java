// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login;

import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.login.providers.FacebookProvider;
import com.gigya.socialize.android.login.providers.GigyaBrowserProvider;
import com.gigya.socialize.android.login.providers.GigyaProvider;
import com.gigya.socialize.android.login.providers.GigyaWebViewProvider;
import com.gigya.socialize.android.login.providers.GoogleProvider;
import com.gigya.socialize.android.login.providers.LoginProvider;
import com.gigya.socialize.android.login.providers.WeChatProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class LoginProviderFactory
{

	public LoginProviderFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		providers = new ConcurrentHashMap();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #20  <Field ConcurrentHashMap providers>
		if(FacebookProvider.isConfigured())
	//*   7   15:invokestatic    #26  <Method boolean FacebookProvider.isConfigured()>
	//*   8   18:ifeq            38
			try
			{
				providers.put("facebook", ((Object) (new FacebookProvider())));
	//    9   21:aload_0         
	//   10   22:getfield        #20  <Field ConcurrentHashMap providers>
	//   11   25:ldc1            #28  <String "facebook">
	//   12   27:new             #22  <Class FacebookProvider>
	//   13   30:dup             
	//   14   31:invokespecial   #29  <Method void FacebookProvider()>
	//   15   34:invokevirtual   #33  <Method Object ConcurrentHashMap.put(Object, Object)>
	//   16   37:pop             
			}
	//*  17   38:invokestatic    #36  <Method boolean GoogleProvider.isConfigured()>
	//*  18   41:ifeq            61
	//*  19   44:aload_0         
	//*  20   45:getfield        #20  <Field ConcurrentHashMap providers>
	//*  21   48:ldc1            #38  <String "googleplus">
	//*  22   50:new             #35  <Class GoogleProvider>
	//*  23   53:dup             
	//*  24   54:invokespecial   #39  <Method void GoogleProvider()>
	//*  25   57:invokevirtual   #33  <Method Object ConcurrentHashMap.put(Object, Object)>
	//*  26   60:pop             
	//*  27   61:invokestatic    #42  <Method boolean WeChatProvider.isConfigured()>
	//*  28   64:ifeq            84
	//*  29   67:aload_0         
	//*  30   68:getfield        #20  <Field ConcurrentHashMap providers>
	//*  31   71:ldc1            #44  <String "wechat">
	//*  32   73:new             #41  <Class WeChatProvider>
	//*  33   76:dup             
	//*  34   77:invokespecial   #45  <Method void WeChatProvider()>
	//*  35   80:invokevirtual   #33  <Method Object ConcurrentHashMap.put(Object, Object)>
	//*  36   83:pop             
	//*  37   84:aload_0         
	//*  38   85:invokevirtual   #48  <Method void updateWebProvider()>
	//*  39   88:return          
			catch(Exception exception) { }
	//   40   89:astore_1        
		if(GoogleProvider.isConfigured())
			try
			{
				providers.put("googleplus", ((Object) (new GoogleProvider())));
			}
	//*  41   90:goto            38
			catch(Exception exception1) { }
	//   42   93:astore_1        
		if(WeChatProvider.isConfigured())
			try
			{
				providers.put("wechat", ((Object) (new WeChatProvider())));
			}
	//*  43   94:goto            61
			catch(Exception exception2) { }
	//   44   97:astore_1        
		updateWebProvider();
	//*  45   98:goto            84
	}

	public LoginProvider getLoginProvider(String s)
	{
		return getLoginProvider(s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #54  <Method LoginProvider getLoginProvider(String, boolean)>
	//    4    6:areturn         
	}

	public LoginProvider getLoginProvider(String s, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            9
			return ((LoginProvider) (webProvider));
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field GigyaProvider webProvider>
	//    4    8:areturn         
		if((LoginProvider)providers.get(((Object) (s.toLowerCase()))) != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #20  <Field ConcurrentHashMap providers>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #62  <Method String String.toLowerCase()>
	//*   9   17:invokevirtual   #66  <Method Object ConcurrentHashMap.get(Object)>
	//*  10   20:checkcast       #68  <Class LoginProvider>
	//*  11   23:ifnull          41
			return (LoginProvider)providers.get(((Object) (s.toLowerCase())));
	//   12   26:aload_0         
	//   13   27:getfield        #20  <Field ConcurrentHashMap providers>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #62  <Method String String.toLowerCase()>
	//   16   34:invokevirtual   #66  <Method Object ConcurrentHashMap.get(Object)>
	//   17   37:checkcast       #68  <Class LoginProvider>
	//   18   40:areturn         
		else
			return ((LoginProvider) (webProvider));
	//   19   41:aload_0         
	//   20   42:getfield        #56  <Field GigyaProvider webProvider>
	//   21   45:areturn         
	}

	public ConcurrentHashMap getLoginProviders()
	{
		return providers;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ConcurrentHashMap providers>
	//    2    4:areturn         
	}

	public boolean hasLoginProvider(String s)
	{
		return (LoginProvider)providers.get(((Object) (s.toLowerCase()))) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ConcurrentHashMap providers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #62  <Method String String.toLowerCase()>
	//    4    8:invokevirtual   #66  <Method Object ConcurrentHashMap.get(Object)>
	//    5   11:checkcast       #68  <Class LoginProvider>
	//    6   14:ifnull          19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void updateWebProvider()
	{
		Object obj = ((Object) (GSAPI.getInstance().getLoginBehavior()));
	//    0    0:invokestatic    #80  <Method GSAPI GSAPI.getInstance()>
	//    1    3:invokevirtual   #84  <Method com.gigya.socialize.android.GSAPI$LoginBehavior GSAPI.getLoginBehavior()>
	//    2    6:astore_1        
		if(obj == com.gigya.socialize.android.GSAPI.LoginBehavior.BROWSER)
	//*   3    7:aload_1         
	//*   4    8:getstatic       #90  <Field com.gigya.socialize.android.GSAPI$LoginBehavior com.gigya.socialize.android.GSAPI$LoginBehavior.BROWSER>
	//*   5   11:if_acmpne       28
			obj = ((Object) (new GigyaBrowserProvider()));
	//    6   14:new             #92  <Class GigyaBrowserProvider>
	//    7   17:dup             
	//    8   18:invokespecial   #93  <Method void GigyaBrowserProvider()>
	//    9   21:astore_1        
		else
	//*  10   22:aload_0         
	//*  11   23:aload_1         
	//*  12   24:putfield        #56  <Field GigyaProvider webProvider>
	//*  13   27:return          
		if(obj == com.gigya.socialize.android.GSAPI.LoginBehavior.WEBVIEW_DIALOG)
	//*  14   28:aload_1         
	//*  15   29:getstatic       #96  <Field com.gigya.socialize.android.GSAPI$LoginBehavior com.gigya.socialize.android.GSAPI$LoginBehavior.WEBVIEW_DIALOG>
	//*  16   32:if_acmpne       46
			obj = ((Object) (new GigyaWebViewProvider()));
	//   17   35:new             #98  <Class GigyaWebViewProvider>
	//   18   38:dup             
	//   19   39:invokespecial   #99  <Method void GigyaWebViewProvider()>
	//   20   42:astore_1        
		else
	//*  21   43:goto            22
			return;
	//   22   46:return          
		webProvider = ((GigyaProvider) (obj));
	}

	public void validatePermissions(GSObject gsobject)
	{
		boolean flag;
		for(Iterator iterator = providers.keySet().iterator(); iterator.hasNext(); Boolean.valueOf(flag).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field ConcurrentHashMap providers>
	//*   2    4:invokevirtual   #105 <Method Set ConcurrentHashMap.keySet()>
	//*   3    7:invokeinterface #111 <Method Iterator Set.iterator()>
	//*   4   12:astore_3        
	//*   5   13:aload_3         
	//*   6   14:invokeinterface #116 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            76
		{
			String s = (String)iterator.next();
	//    8   22:aload_3         
	//    9   23:invokeinterface #120 <Method Object Iterator.next()>
	//   10   28:checkcast       #58  <Class String>
	//   11   31:astore          4
			GSObject gsobject1 = gsobject.getObject("permissions", ((GSObject) (null)));
	//   12   33:aload_1         
	//   13   34:ldc1            #122 <String "permissions">
	//   14   36:aconst_null     
	//   15   37:invokevirtual   #128 <Method GSObject GSObject.getObject(String, GSObject)>
	//   16   40:astore          5
			if(gsobject1 != null && gsobject1.getArray(s, ((com.gigya.socialize.GSArray) (null))) != null)
	//*  17   42:aload           5
	//*  18   44:ifnull          63
	//*  19   47:aload           5
	//*  20   49:aload           4
	//*  21   51:aconst_null     
	//*  22   52:invokevirtual   #132 <Method com.gigya.socialize.GSArray GSObject.getArray(String, com.gigya.socialize.GSArray)>
	//*  23   55:ifnull          63
				flag = true;
	//   24   58:iconst_1        
	//   25   59:istore_2        
			else
	//*  26   60:goto            65
				flag = false;
	//   27   63:iconst_0        
	//   28   64:istore_2        
		}

	//   29   65:iload_2         
	//   30   66:invokestatic    #138 <Method Boolean Boolean.valueOf(boolean)>
	//   31   69:invokevirtual   #141 <Method boolean Boolean.booleanValue()>
	//   32   72:pop             
	//*  33   73:goto            13
	//   34   76:return          
	}

	private ConcurrentHashMap providers;
	private GigyaProvider webProvider;
}
