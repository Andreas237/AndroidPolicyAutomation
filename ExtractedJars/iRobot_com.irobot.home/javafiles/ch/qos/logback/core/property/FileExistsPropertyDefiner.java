// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.property;

import ch.qos.logback.core.PropertyDefinerBase;
import ch.qos.logback.core.util.OptionHelper;
import java.io.File;

public class FileExistsPropertyDefiner extends PropertyDefinerBase
{

	public FileExistsPropertyDefiner()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void PropertyDefinerBase()>
	//    2    4:return          
	}

	public String getPath()
	{
		return path;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String path>
	//    2    4:areturn         
	}

	public String getPropertyValue()
	{
		if(OptionHelper.isEmpty(path))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field String path>
	//*   2    4:invokestatic    #22  <Method boolean OptionHelper.isEmpty(String)>
	//*   3    7:ifeq            18
		{
			addError("The \"path\" property must be set.");
	//    4   10:aload_0         
	//    5   11:ldc1            #24  <String "The \"path\" property must be set.">
	//    6   13:invokevirtual   #28  <Method void addError(String)>
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
		} else
		{
			return booleanAsStr((new File(path)).exists());
	//    9   18:new             #30  <Class File>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:getfield        #15  <Field String path>
	//   13   26:invokespecial   #32  <Method void File(String)>
	//   14   29:invokevirtual   #36  <Method boolean File.exists()>
	//   15   32:invokestatic    #40  <Method String booleanAsStr(boolean)>
	//   16   35:areturn         
		}
	}

	public void setPath(String s)
	{
		path = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field String path>
	//    3    5:return          
	}

	String path;
}
