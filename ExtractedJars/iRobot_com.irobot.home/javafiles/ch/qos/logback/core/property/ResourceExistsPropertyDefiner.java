// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.property;

import ch.qos.logback.core.PropertyDefinerBase;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;

public class ResourceExistsPropertyDefiner extends PropertyDefinerBase
{

	public ResourceExistsPropertyDefiner()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void PropertyDefinerBase()>
	//    2    4:return          
	}

	public String getPropertyValue()
	{
		if(OptionHelper.isEmpty(resourceStr))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field String resourceStr>
	//*   2    4:invokestatic    #21  <Method boolean OptionHelper.isEmpty(String)>
	//*   3    7:ifeq            18
		{
			addError("The \"resource\" property must be set.");
	//    4   10:aload_0         
	//    5   11:ldc1            #23  <String "The \"resource\" property must be set.">
	//    6   13:invokevirtual   #27  <Method void addError(String)>
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
		}
		boolean flag;
		if(Loader.getResourceBySelfClassLoader(resourceStr) != null)
	//*   9   18:aload_0         
	//*  10   19:getfield        #15  <Field String resourceStr>
	//*  11   22:invokestatic    #33  <Method java.net.URL Loader.getResourceBySelfClassLoader(String)>
	//*  12   25:ifnull          33
			flag = true;
	//   13   28:iconst_1        
	//   14   29:istore_1        
		else
	//*  15   30:goto            35
			flag = false;
	//   16   33:iconst_0        
	//   17   34:istore_1        
		return booleanAsStr(flag);
	//   18   35:iload_1         
	//   19   36:invokestatic    #37  <Method String booleanAsStr(boolean)>
	//   20   39:areturn         
	}

	public String getResource()
	{
		return resourceStr;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String resourceStr>
	//    2    4:areturn         
	}

	public void setResource(String s)
	{
		resourceStr = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field String resourceStr>
	//    3    5:return          
	}

	String resourceStr;
}
