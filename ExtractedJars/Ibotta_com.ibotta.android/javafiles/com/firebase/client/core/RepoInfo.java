// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import java.net.URI;

public class RepoInfo
{

	public RepoInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public URI getConnectionURL(String s)
	{
		Object obj;
		if(secure)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field boolean secure>
	//*   2    4:ifeq            13
			obj = "wss";
	//    3    7:ldc1            #27  <String "wss">
	//    4    9:astore_2        
		else
	//*   5   10:goto            16
			obj = "ws";
	//    6   13:ldc1            #29  <String "ws">
	//    7   15:astore_2        
		Object obj1 = ((Object) (new StringBuilder()));
	//    8   16:new             #31  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #32  <Method void StringBuilder()>
	//   11   23:astore_3        
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   12   24:aload_3         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		((StringBuilder) (obj1)).append("://");
	//   16   30:aload_3         
	//   17   31:ldc1            #38  <String "://">
	//   18   33:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		((StringBuilder) (obj1)).append(internalHost);
	//   20   37:aload_3         
	//   21   38:aload_0         
	//   22   39:getfield        #40  <Field String internalHost>
	//   23   42:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		((StringBuilder) (obj1)).append("/.ws?ns=");
	//   25   46:aload_3         
	//   26   47:ldc1            #42  <String "/.ws?ns=">
	//   27   49:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
		((StringBuilder) (obj1)).append(namespace);
	//   29   53:aload_3         
	//   30   54:aload_0         
	//   31   55:getfield        #44  <Field String namespace>
	//   32   58:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
		((StringBuilder) (obj1)).append("&");
	//   34   62:aload_3         
	//   35   63:ldc1            #46  <String "&">
	//   36   65:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   37   68:pop             
		((StringBuilder) (obj1)).append("v");
	//   38   69:aload_3         
	//   39   70:ldc1            #11  <String "v">
	//   40   72:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
		((StringBuilder) (obj1)).append("=");
	//   42   76:aload_3         
	//   43   77:ldc1            #48  <String "=">
	//   44   79:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   45   82:pop             
		((StringBuilder) (obj1)).append("5");
	//   46   83:aload_3         
	//   47   84:ldc1            #50  <String "5">
	//   48   86:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   49   89:pop             
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   50   90:aload_3         
	//   51   91:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   52   94:astore_3        
		obj = obj1;
	//   53   95:aload_3         
	//   54   96:astore_2        
		if(s != null)
	//*  55   97:aload_1         
	//*  56   98:ifnull          133
		{
			obj = ((Object) (new StringBuilder()));
	//   57  101:new             #31  <Class StringBuilder>
	//   58  104:dup             
	//   59  105:invokespecial   #32  <Method void StringBuilder()>
	//   60  108:astore_2        
			((StringBuilder) (obj)).append(((String) (obj1)));
	//   61  109:aload_2         
	//   62  110:aload_3         
	//   63  111:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   64  114:pop             
			((StringBuilder) (obj)).append("&ls=");
	//   65  115:aload_2         
	//   66  116:ldc1            #56  <String "&ls=">
	//   67  118:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   68  121:pop             
			((StringBuilder) (obj)).append(s);
	//   69  122:aload_2         
	//   70  123:aload_1         
	//   71  124:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   72  127:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   73  128:aload_2         
	//   74  129:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   75  132:astore_2        
		}
		return URI.create(((String) (obj)));
	//   76  133:aload_2         
	//   77  134:invokestatic    #61  <Method URI URI.create(String)>
	//   78  137:areturn         
	}

	public boolean isCacheableHost()
	{
		return internalHost.startsWith("s-");
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String internalHost>
	//    2    4:ldc1            #65  <String "s-">
	//    3    6:invokevirtual   #71  <Method boolean String.startsWith(String)>
	//    4    9:ireturn         
	}

	public boolean isCustomHost()
	{
		return !host.contains(".firebaseio.com") && !host.contains(".firebaseio-demo.com");
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String host>
	//    2    4:ldc1            #76  <String ".firebaseio.com">
	//    3    6:invokevirtual   #80  <Method boolean String.contains(CharSequence)>
	//    4    9:ifne            26
	//    5   12:aload_0         
	//    6   13:getfield        #74  <Field String host>
	//    7   16:ldc1            #82  <String ".firebaseio-demo.com">
	//    8   18:invokevirtual   #80  <Method boolean String.contains(CharSequence)>
	//    9   21:ifne            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public boolean isDemoHost()
	{
		return host.contains(".firebaseio-demo.com");
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String host>
	//    2    4:ldc1            #82  <String ".firebaseio-demo.com">
	//    3    6:invokevirtual   #80  <Method boolean String.contains(CharSequence)>
	//    4    9:ireturn         
	}

	public boolean isSecure()
	{
		return secure;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean secure>
	//    2    4:ireturn         
	}

	public String toDebugString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #31  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("(host=");
	//    4    8:aload_1         
	//    5    9:ldc1            #87  <String "(host=">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(host);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #74  <Field String host>
	//   11   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", secure=");
	//   13   24:aload_1         
	//   14   25:ldc1            #89  <String ", secure=">
	//   15   27:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(secure);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #25  <Field boolean secure>
	//   20   36:invokevirtual   #92  <Method StringBuilder StringBuilder.append(boolean)>
	//   21   39:pop             
		stringbuilder.append(", ns=");
	//   22   40:aload_1         
	//   23   41:ldc1            #94  <String ", ns=">
	//   24   43:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(namespace);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #44  <Field String namespace>
	//   29   52:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(" internal=");
	//   31   56:aload_1         
	//   32   57:ldc1            #96  <String " internal=">
	//   33   59:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(internalHost);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #40  <Field String internalHost>
	//   38   68:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
		stringbuilder.append(")");
	//   40   72:aload_1         
	//   41   73:ldc1            #98  <String ")">
	//   42   75:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		return stringbuilder.toString();
	//   44   79:aload_1         
	//   45   80:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   46   83:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #31  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("http");
	//    4    8:aload_2         
	//    5    9:ldc1            #100 <String "http">
	//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		String s;
		if(secure)
	//*   8   15:aload_0         
	//*   9   16:getfield        #25  <Field boolean secure>
	//*  10   19:ifeq            28
			s = "s";
	//   11   22:ldc1            #102 <String "s">
	//   12   24:astore_1        
		else
	//*  13   25:goto            31
			s = "";
	//   14   28:ldc1            #104 <String "">
	//   15   30:astore_1        
		stringbuilder.append(s);
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		stringbuilder.append("://");
	//   20   37:aload_2         
	//   21   38:ldc1            #38  <String "://">
	//   22   40:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(host);
	//   24   44:aload_2         
	//   25   45:aload_0         
	//   26   46:getfield        #74  <Field String host>
	//   27   49:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
		return stringbuilder.toString();
	//   29   53:aload_2         
	//   30   54:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   31   57:areturn         
	}

	private static final String LAST_SESSION_ID_PARAM = "ls";
	private static final String VERSION_PARAM = "v";
	public String host;
	public String internalHost;
	public String namespace;
	public boolean secure;
}
