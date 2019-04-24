// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.html;

import java.io.File;
import java.net.*;

public class UrlLinkResolver
{

	public UrlLinkResolver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public UrlLinkResolver(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		rootPath = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field String rootPath>
	//    5    9:return          
	}

	public URL resolveLocalUrl(String s)
		throws MalformedURLException
	{
		if(rootPath == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String rootPath>
	//    2    4:ifnull          136
_L1:
		boolean flag;
		boolean flag1;
		flag = rootPath.endsWith("/");
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field String rootPath>
	//    5   11:ldc1            #20  <String "/">
	//    6   13:invokevirtual   #26  <Method boolean String.endsWith(String)>
	//    7   16:istore_2        
		flag1 = s.startsWith("/");
	//    8   17:aload_1         
	//    9   18:ldc1            #20  <String "/">
	//   10   20:invokevirtual   #29  <Method boolean String.startsWith(String)>
	//   11   23:istore_3        
		if(!flag || !flag1) goto _L4; else goto _L3
	//   12   24:iload_2         
	//   13   25:ifeq            99
	//   14   28:iload_3         
	//   15   29:ifeq            99
_L3:
		rootPath = rootPath.substring(0, rootPath.length() - 1);
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #14  <Field String rootPath>
	//   19   37:iconst_0        
	//   20   38:aload_0         
	//   21   39:getfield        #14  <Field String rootPath>
	//   22   42:invokevirtual   #33  <Method int String.length()>
	//   23   45:iconst_1        
	//   24   46:isub            
	//   25   47:invokevirtual   #37  <Method String String.substring(int, int)>
	//   26   50:putfield        #14  <Field String rootPath>
_L6:
		s = (new StringBuilder()).append(rootPath).append(s).toString();
	//   27   53:new             #39  <Class StringBuilder>
	//   28   56:dup             
	//   29   57:invokespecial   #40  <Method void StringBuilder()>
	//   30   60:aload_0         
	//   31   61:getfield        #14  <Field String rootPath>
	//   32   64:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   33   67:aload_1         
	//   34   68:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   35   71:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   36   74:astore_1        
_L2:
		s = ((String) (new File(s)));
	//   37   75:new             #50  <Class File>
	//   38   78:dup             
	//   39   79:aload_1         
	//   40   80:invokespecial   #52  <Method void File(String)>
	//   41   83:astore_1        
		if(((File) (s)).exists())
	//*  42   84:aload_1         
	//*  43   85:invokevirtual   #56  <Method boolean File.exists()>
	//*  44   88:ifeq            139
			return ((File) (s)).toURI().toURL();
	//   45   91:aload_1         
	//   46   92:invokevirtual   #60  <Method URI File.toURI()>
	//   47   95:invokevirtual   #66  <Method URL URI.toURL()>
	//   48   98:areturn         
		else
	//*  49   99:iload_2         
	//*  50  100:ifne            53
	//*  51  103:iload_3         
	//*  52  104:ifne            53
	//*  53  107:aload_0         
	//*  54  108:new             #39  <Class StringBuilder>
	//*  55  111:dup             
	//*  56  112:invokespecial   #40  <Method void StringBuilder()>
	//*  57  115:aload_0         
	//*  58  116:getfield        #14  <Field String rootPath>
	//*  59  119:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  60  122:ldc1            #20  <String "/">
	//*  61  124:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  62  127:invokevirtual   #48  <Method String StringBuilder.toString()>
	//*  63  130:putfield        #14  <Field String rootPath>
	//*  64  133:goto            53
	//*  65  136:goto            75
			return null;
	//   66  139:aconst_null     
	//   67  140:areturn         
_L4:
		if(!flag && !flag1)
			rootPath = (new StringBuilder()).append(rootPath).append("/").toString();
		if(true) goto _L6; else goto _L5
_L5:
	}

	public URL resolveUrl(String s)
		throws MalformedURLException
	{
		URL url;
		try
		{
			url = new URL(s);
	//    0    0:new             #70  <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #71  <Method void URL(String)>
	//    4    8:astore_2        
		}
	//*   5    9:aload_2         
	//*   6   10:areturn         
		catch(MalformedURLException malformedurlexception)
	//*   7   11:astore_2        
		{
			return resolveLocalUrl(s);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #73  <Method URL resolveLocalUrl(String)>
	//   11   17:areturn         
		}
		return url;
	}

	public void setLocalRootPath(String s)
	{
		rootPath = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field String rootPath>
	//    3    5:return          
	}

	private String rootPath;
}
