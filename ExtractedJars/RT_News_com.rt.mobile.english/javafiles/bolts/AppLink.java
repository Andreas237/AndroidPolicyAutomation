// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

public class AppLink
{
	public static class Target
	{

		public String getAppName()
		{
			return appName;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field String appName>
		//    2    4:areturn         
		}

		public String getClassName()
		{
			return className;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String className>
		//    2    4:areturn         
		}

		public String getPackageName()
		{
			return packageName;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field String packageName>
		//    2    4:areturn         
		}

		public Uri getUrl()
		{
			return url;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Uri url>
		//    2    4:areturn         
		}

		private final String appName;
		private final String className;
		private final String packageName;
		private final Uri url;

		public Target(String s, String s1, Uri uri, String s2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			packageName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field String packageName>
			className = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field String className>
			url = uri;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field Uri url>
			appName = s2;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #26  <Field String appName>
		//   14   25:return          
		}
	}


	public AppLink(Uri uri, List list, Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		sourceUrl = uri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Uri sourceUrl>
		uri = ((Uri) (list));
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(list == null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       19
			uri = ((Uri) (Collections.emptyList()));
	//    9   15:invokestatic    #26  <Method List Collections.emptyList()>
	//   10   18:astore_1        
		targets = ((List) (uri));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #28  <Field List targets>
		webUrl = uri1;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #30  <Field Uri webUrl>
	//   17   29:return          
	}

	public Uri getSourceUrl()
	{
		return sourceUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Uri sourceUrl>
	//    2    4:areturn         
	}

	public List getTargets()
	{
		return Collections.unmodifiableList(targets);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List targets>
	//    2    4:invokestatic    #40  <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public Uri getWebUrl()
	{
		return webUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Uri webUrl>
	//    2    4:areturn         
	}

	private Uri sourceUrl;
	private List targets;
	private Uri webUrl;
}
