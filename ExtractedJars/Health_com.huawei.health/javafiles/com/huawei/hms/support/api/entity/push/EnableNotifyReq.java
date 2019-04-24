// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;

public class EnableNotifyReq
	implements IMessageEntity
{

	public EnableNotifyReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public String getPackageName()
	{
		return packageName;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String packageName>
	//    2    4:areturn         
	}

	public boolean isEnable()
	{
		return enable;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean enable>
	//    2    4:ireturn         
	}

	public void setEnable(boolean flag)
	{
		enable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean enable>
	//    3    5:return          
	}

	public void setPackageName(String s)
	{
		packageName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field String packageName>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append(" {").append("\n\t").append("pkgName: ").append(packageName).append("\n\t").append("enable: ").append(enable).append("\n\t").append("}").toString();
	//    0    0:new             #31  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #36  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #41  <Method String Class.getName()>
	//    6   14:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #47  <String " {">
	//    8   19:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #49  <String "\n\t">
	//   10   24:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:ldc1            #51  <String "pkgName: ">
	//   12   29:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   13   32:aload_0         
	//   14   33:getfield        #20  <Field String packageName>
	//   15   36:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:ldc1            #49  <String "\n\t">
	//   17   41:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   18   44:ldc1            #53  <String "enable: ">
	//   19   46:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   20   49:aload_0         
	//   21   50:getfield        #24  <Field boolean enable>
	//   22   53:invokevirtual   #56  <Method StringBuilder StringBuilder.append(boolean)>
	//   23   56:ldc1            #49  <String "\n\t">
	//   24   58:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   25   61:ldc1            #58  <String "}">
	//   26   63:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   27   66:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   28   69:areturn         
	}

	private boolean enable;
	private String packageName;
}
