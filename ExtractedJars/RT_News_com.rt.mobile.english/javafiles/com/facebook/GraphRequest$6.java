// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.facebook:
//			GraphRequest

class GraphRequest$6
	implements yValueSerializer
{

	public void writeString(String s, String s1)
		throws IOException
	{
		val$keysAndValues.add(((Object) (String.format(Locale.US, "%s=%s", new Object[] {
			s, URLEncoder.encode(s1, "UTF-8")
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList val$keysAndValues>
	//    2    4:getstatic       #35  <Field Locale Locale.US>
	//    3    7:ldc1            #37  <String "%s=%s">
	//    4    9:iconst_2        
	//    5   10:anewarray       Object[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:aload_1         
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_1        
	//   12   19:aload_2         
	//   13   20:ldc1            #39  <String "UTF-8">
	//   14   22:invokestatic    #45  <Method String URLEncoder.encode(String, String)>
	//   15   25:aastore         
	//   16   26:invokestatic    #51  <Method String String.format(Locale, String, Object[])>
	//   17   29:invokevirtual   #57  <Method boolean ArrayList.add(Object)>
	//   18   32:pop             
	//   19   33:return          
	}

	final GraphRequest this$0;
	final ArrayList val$keysAndValues;

	GraphRequest$6()
	{
		this$0 = final_graphrequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GraphRequest this$0>
		val$keysAndValues = ArrayList.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ArrayList val$keysAndValues>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
