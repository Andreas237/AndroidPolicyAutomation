// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.model;

import com.startapp.android.publish.adsCommon.BaseResponse;
import com.startapp.android.publish.adsCommon.adinformation.c;
import java.util.ArrayList;
import java.util.List;

public class GetAdResponse extends BaseResponse
{
	public static final class ResponseType extends Enum
	{

		public static ResponseType valueOf(String s)
		{
			return (ResponseType)Enum.valueOf(com/startapp/android/publish/common/model/GetAdResponse$ResponseType, s);
		//    0    0:ldc1            #2   <Class GetAdResponse$ResponseType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GetAdResponse$ResponseType>
		//    4    9:areturn         
		}

		public static ResponseType[] values()
		{
			return (ResponseType[])((ResponseType []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field GetAdResponse$ResponseType[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.startapp.android.publish.common.model.GetAdResponse$ResponseType_3B_.clone()>
		//    2    6:checkcast       #38  <Class GetAdResponse$ResponseType[]>
		//    3    9:areturn         
		}

		private static final ResponseType $VALUES[];
		public static final ResponseType HTML;
		public static final ResponseType JSON;

		static 
		{
			HTML = new ResponseType("HTML", 0);
		//    0    0:new             #2   <Class GetAdResponse$ResponseType>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "HTML">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void GetAdResponse$ResponseType(String, int)>
		//    5   10:putstatic       #22  <Field GetAdResponse$ResponseType HTML>
			JSON = new ResponseType("JSON", 1);
		//    6   13:new             #2   <Class GetAdResponse$ResponseType>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "JSON">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void GetAdResponse$ResponseType(String, int)>
		//   11   23:putstatic       #25  <Field GetAdResponse$ResponseType JSON>
			$VALUES = (new ResponseType[] {
				HTML, JSON
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       ResponseType[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field GetAdResponse$ResponseType HTML>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field GetAdResponse$ResponseType JSON>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field GetAdResponse$ResponseType[] $VALUES>
		//*  23   45:return          
		}

		private ResponseType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private static final class inAppBrowserPreLoad extends Enum
	{

		public static inAppBrowserPreLoad valueOf(String s)
		{
			return (inAppBrowserPreLoad)Enum.valueOf(com/startapp/android/publish/common/model/GetAdResponse$inAppBrowserPreLoad, s);
		//    0    0:ldc1            #2   <Class GetAdResponse$inAppBrowserPreLoad>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GetAdResponse$inAppBrowserPreLoad>
		//    4    9:areturn         
		}

		public static inAppBrowserPreLoad[] values()
		{
			return (inAppBrowserPreLoad[])((inAppBrowserPreLoad []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field GetAdResponse$inAppBrowserPreLoad[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.startapp.android.publish.common.model.GetAdResponse$inAppBrowserPreLoad_3B_.clone()>
		//    2    6:checkcast       #42  <Class GetAdResponse$inAppBrowserPreLoad[]>
		//    3    9:areturn         
		}

		private static final inAppBrowserPreLoad $VALUES[];
		public static final inAppBrowserPreLoad CONTENT;
		public static final inAppBrowserPreLoad DISABLED;
		public static final inAppBrowserPreLoad FULL;

		static 
		{
			DISABLED = new inAppBrowserPreLoad("DISABLED", 0);
		//    0    0:new             #2   <Class GetAdResponse$inAppBrowserPreLoad>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "DISABLED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void GetAdResponse$inAppBrowserPreLoad(String, int)>
		//    5   10:putstatic       #23  <Field GetAdResponse$inAppBrowserPreLoad DISABLED>
			CONTENT = new inAppBrowserPreLoad("CONTENT", 1);
		//    6   13:new             #2   <Class GetAdResponse$inAppBrowserPreLoad>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "CONTENT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void GetAdResponse$inAppBrowserPreLoad(String, int)>
		//   11   23:putstatic       #26  <Field GetAdResponse$inAppBrowserPreLoad CONTENT>
			FULL = new inAppBrowserPreLoad("FULL", 2);
		//   12   26:new             #2   <Class GetAdResponse$inAppBrowserPreLoad>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "FULL">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void GetAdResponse$inAppBrowserPreLoad(String, int)>
		//   17   36:putstatic       #29  <Field GetAdResponse$inAppBrowserPreLoad FULL>
			$VALUES = (new inAppBrowserPreLoad[] {
				DISABLED, CONTENT, FULL
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       inAppBrowserPreLoad[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field GetAdResponse$inAppBrowserPreLoad DISABLED>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field GetAdResponse$inAppBrowserPreLoad CONTENT>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field GetAdResponse$inAppBrowserPreLoad FULL>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field GetAdResponse$inAppBrowserPreLoad[] $VALUES>
		//*  33   64:return          
		}

		private inAppBrowserPreLoad(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public GetAdResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void BaseResponse()>
		adInfoOverrides = c.a();
	//    2    4:aload_0         
	//    3    5:invokestatic    #41  <Method c c.a()>
	//    4    8:putfield        #43  <Field c adInfoOverrides>
		adsDetails = ((List) (new ArrayList()));
	//    5   11:aload_0         
	//    6   12:new             #45  <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #46  <Method void ArrayList()>
	//    9   19:putfield        #48  <Field List adsDetails>
	//   10   22:return          
	}

	public c getAdInfoOverride()
	{
		return adInfoOverrides;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field c adInfoOverrides>
	//    2    4:areturn         
	}

	public List getAdsDetails()
	{
		return adsDetails;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List adsDetails>
	//    2    4:areturn         
	}

	public inAppBrowserPreLoad getInAppBrowserPreLoad()
	{
		return inAppBrowserPreLoad;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field GetAdResponse$inAppBrowserPreLoad inAppBrowserPreLoad>
	//    2    4:areturn         
	}

	public String getProductId()
	{
		return productId;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String productId>
	//    2    4:areturn         
	}

	public String getPublisherId()
	{
		return publisherId;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String publisherId>
	//    2    4:areturn         
	}

	public boolean isInAppBrowser()
	{
		return inAppBrowser;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean inAppBrowser>
	//    2    4:ireturn         
	}

	public void setAdsDetails(List list)
	{
		adsDetails = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field List adsDetails>
	//    3    5:return          
	}

	public void setInAppBrowser(boolean flag)
	{
		inAppBrowser = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field boolean inAppBrowser>
	//    3    5:return          
	}

	public void setInAppBrowserPreLoad(inAppBrowserPreLoad inappbrowserpreload)
	{
		inAppBrowserPreLoad = inappbrowserpreload;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field GetAdResponse$inAppBrowserPreLoad inAppBrowserPreLoad>
	//    3    5:return          
	}

	public void setProductId(String s)
	{
		productId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field String productId>
	//    3    5:return          
	}

	public void setPublisherId(String s)
	{
		publisherId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field String publisherId>
	//    3    5:return          
	}

	private static final long serialVersionUID = 1L;
	private c adInfoOverrides;
	private List adsDetails;
	private boolean inAppBrowser;
	private inAppBrowserPreLoad inAppBrowserPreLoad;
	private String productId;
	private String publisherId;
}
