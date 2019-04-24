// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

public final class zzasu
{

	public zzasu(WebResourceRequest webresourcerequest)
	{
		this(webresourcerequest.getUrl().toString(), webresourcerequest.getUrl(), webresourcerequest.getMethod(), webresourcerequest.getRequestHeaders());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #25  <Method Uri WebResourceRequest.getUrl()>
	//    3    7:invokevirtual   #31  <Method String Uri.toString()>
	//    4   10:aload_1         
	//    5   11:invokeinterface #25  <Method Uri WebResourceRequest.getUrl()>
	//    6   16:aload_1         
	//    7   17:invokeinterface #34  <Method String WebResourceRequest.getMethod()>
	//    8   22:aload_1         
	//    9   23:invokeinterface #38  <Method Map WebResourceRequest.getRequestHeaders()>
	//   10   28:invokespecial   #41  <Method void zzasu(String, Uri, String, Map)>
	//   11   31:return          
	}

	public zzasu(String s)
	{
		this(s, Uri.parse(s), ((String) (null)), ((Map) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokestatic    #48  <Method Uri Uri.parse(String)>
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:invokespecial   #41  <Method void zzasu(String, Uri, String, Map)>
	//    7   11:return          
	}

	private zzasu(String s, Uri uri1, String s1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		url = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #54  <Field String url>
		uri = uri1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #56  <Field Uri uri>
		s = s1;
	//    8   14:aload_3         
	//    9   15:astore_1        
		if(s1 == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       23
			s = "GET";
	//   12   20:ldc1            #58  <String "GET">
	//   13   22:astore_1        
		method = s;
	//   14   23:aload_0         
	//   15   24:aload_1         
	//   16   25:putfield        #60  <Field String method>
		s = ((String) (map));
	//   17   28:aload           4
	//   18   30:astore_1        
		if(map == null)
	//*  19   31:aload           4
	//*  20   33:ifnonnull       40
			s = ((String) (Collections.emptyMap()));
	//   21   36:invokestatic    #65  <Method Map Collections.emptyMap()>
	//   22   39:astore_1        
		zzab = ((Map) (s));
	//   23   40:aload_0         
	//   24   41:aload_1         
	//   25   42:putfield        #67  <Field Map zzab>
	//   26   45:return          
	}

	private final String method;
	public final Uri uri;
	public final String url;
	public final Map zzab;
}
