// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import com.irobot.core.SkuUtils;
import com.irobot.home.util.j;
import java.net.URI;
import org.c.c.a.f;
import org.c.c.a.h;
import org.c.c.a.i;
import org.c.c.c;
import org.c.d.a.a;

public class AssetSkuInterceptor
	implements h
{

	public AssetSkuInterceptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	private org.c.c.h redirectToChinaSiteCore()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("https://appcontent.irobot.cn");
	//    4    8:aload_1         
	//    5    9:ldc1            #35  <String "https://appcontent.irobot.cn">
	//    6   11:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mRequest.getURI().getPath());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field org.c.c.h mRequest>
	//   11   20:invokeinterface #47  <Method URI org.c.c.h.getURI()>
	//   12   25:invokevirtual   #53  <Method String URI.getPath()>
	//   13   28:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		return new org.c.c.h() {

			public c getHeaders()
			{
				return mHeaders;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AssetSkuInterceptor this$0>
			//    2    4:invokestatic    #31  <Method c AssetSkuInterceptor.access$000(AssetSkuInterceptor)>
			//    3    7:areturn         
			}

			public org.c.c.f getMethod()
			{
				return org.c.c.f.GET;
			//    0    0:getstatic       #39  <Field org.c.c.f org.c.c.f.GET>
			//    1    3:areturn         
			}

			public URI getURI()
			{
				return uri;
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field URI val$uri>
			//    2    4:areturn         
			}

			final AssetSkuInterceptor this$0;
			final URI val$uri;

			
			{
				this$0 = AssetSkuInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AssetSkuInterceptor this$0>
				uri = uri1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field URI val$uri>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//   15   32:new             #8   <Class AssetSkuInterceptor$1>
	//   16   35:dup             
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   20   41:invokestatic    #62  <Method a a.a(String)>
	//   21   44:invokevirtual   #64  <Method URI a.a()>
	//   22   47:invokespecial   #67  <Method void AssetSkuInterceptor$1(AssetSkuInterceptor, URI)>
	//   23   50:areturn         
	}

	private org.c.c.h updateHttpRequestWithDefaultSku()
	{
		String s = j.m(mRequest.getURI().getPath());
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field org.c.c.h mRequest>
	//    2    4:invokeinterface #47  <Method URI org.c.c.h.getURI()>
	//    3    9:invokevirtual   #53  <Method String URI.getPath()>
	//    4   12:invokestatic    #74  <Method String j.m(String)>
	//    5   15:astore_1        
		URI uri = mRequest.getURI();
	//    6   16:aload_0         
	//    7   17:getfield        #41  <Field org.c.c.h mRequest>
	//    8   20:invokeinterface #47  <Method URI org.c.c.h.getURI()>
	//    9   25:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   10   26:new             #32  <Class StringBuilder>
	//   11   29:dup             
	//   12   30:invokespecial   #33  <Method void StringBuilder()>
	//   13   33:astore_3        
		stringbuilder.append(uri.getScheme());
	//   14   34:aload_3         
	//   15   35:aload_2         
	//   16   36:invokevirtual   #77  <Method String URI.getScheme()>
	//   17   39:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   18   42:pop             
		stringbuilder.append("://");
	//   19   43:aload_3         
	//   20   44:ldc1            #79  <String "://">
	//   21   46:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
		stringbuilder.append(uri.getHost());
	//   23   50:aload_3         
	//   24   51:aload_2         
	//   25   52:invokevirtual   #82  <Method String URI.getHost()>
	//   26   55:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   27   58:pop             
		stringbuilder.append(s);
	//   28   59:aload_3         
	//   29   60:aload_1         
	//   30   61:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
		return new org.c.c.h() {

			public c getHeaders()
			{
				return mHeaders;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AssetSkuInterceptor this$0>
			//    2    4:invokestatic    #31  <Method c AssetSkuInterceptor.access$000(AssetSkuInterceptor)>
			//    3    7:areturn         
			}

			public org.c.c.f getMethod()
			{
				return org.c.c.f.GET;
			//    0    0:getstatic       #39  <Field org.c.c.f org.c.c.f.GET>
			//    1    3:areturn         
			}

			public URI getURI()
			{
				return uri;
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field URI val$uri>
			//    2    4:areturn         
			}

			final AssetSkuInterceptor this$0;
			final URI val$uri;

			
			{
				this$0 = AssetSkuInterceptor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AssetSkuInterceptor this$0>
				uri = uri1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field URI val$uri>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//   32   65:new             #10  <Class AssetSkuInterceptor$2>
	//   33   68:dup             
	//   34   69:aload_0         
	//   35   70:aload_3         
	//   36   71:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   37   74:invokestatic    #62  <Method a a.a(String)>
	//   38   77:invokevirtual   #64  <Method URI a.a()>
	//   39   80:invokespecial   #83  <Method void AssetSkuInterceptor$2(AssetSkuInterceptor, URI)>
	//   40   83:areturn         
	}

	public i intercept(org.c.c.h h1, byte abyte0[], f f1)
	{
		mRequest = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field org.c.c.h mRequest>
		mHeaders = h1.getHeaders();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokeinterface #89  <Method c org.c.c.h.getHeaders()>
	//    6   12:putfield        #28  <Field c mHeaders>
		if(j.l(mRequest.getURI().getPath()))
	//*   7   15:aload_0         
	//*   8   16:getfield        #41  <Field org.c.c.h mRequest>
	//*   9   19:invokeinterface #47  <Method URI org.c.c.h.getURI()>
	//*  10   24:invokevirtual   #53  <Method String URI.getPath()>
	//*  11   27:invokestatic    #93  <Method boolean j.l(String)>
	//*  12   30:ifeq            41
			mRequest = updateHttpRequestWithDefaultSku();
	//   13   33:aload_0         
	//   14   34:aload_0         
	//   15   35:invokespecial   #95  <Method org.c.c.h updateHttpRequestWithDefaultSku()>
	//   16   38:putfield        #41  <Field org.c.c.h mRequest>
		if(SkuUtils.stringContainsChinaSku(mRequest.getURI().getPath()) || j.o().equals("CN"))
	//*  17   41:aload_0         
	//*  18   42:getfield        #41  <Field org.c.c.h mRequest>
	//*  19   45:invokeinterface #47  <Method URI org.c.c.h.getURI()>
	//*  20   50:invokevirtual   #53  <Method String URI.getPath()>
	//*  21   53:invokestatic    #100 <Method boolean SkuUtils.stringContainsChinaSku(String)>
	//*  22   56:ifne            70
	//*  23   59:invokestatic    #103 <Method String j.o()>
	//*  24   62:ldc1            #105 <String "CN">
	//*  25   64:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  26   67:ifeq            78
			mRequest = redirectToChinaSiteCore();
	//   27   70:aload_0         
	//   28   71:aload_0         
	//   29   72:invokespecial   #113 <Method org.c.c.h redirectToChinaSiteCore()>
	//   30   75:putfield        #41  <Field org.c.c.h mRequest>
		return f1.a(mRequest, abyte0);
	//   31   78:aload_3         
	//   32   79:aload_0         
	//   33   80:getfield        #41  <Field org.c.c.h mRequest>
	//   34   83:aload_2         
	//   35   84:invokeinterface #118 <Method i f.a(org.c.c.h, byte[])>
	//   36   89:areturn         
	}

	private static final String LOG_TAG = "AssetSkuInterceptor";
	private c mHeaders;
	private org.c.c.h mRequest;

	static 
	{
	//    0    0:return          
	}


/*
	static c access$000(AssetSkuInterceptor assetskuinterceptor)
	{
		return assetskuinterceptor.mHeaders;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field c mHeaders>
	//    2    4:areturn         
	}

*/
}
