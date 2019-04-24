// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.push.b.b.c;

public class AgreementReq
	implements IMessageEntity
{

	public AgreementReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		token = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #18  <String "">
	//    4    7:putfield        #20  <Field String token>
	//    5   10:return          
	}

	public String getPkgName()
	{
		return pkgName;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String pkgName>
	//    2    4:areturn         
	}

	public String getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String token>
	//    2    4:areturn         
	}

	public boolean isFirstTime()
	{
		return firstTime;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean firstTime>
	//    2    4:ireturn         
	}

	public void setFirstTime(boolean flag)
	{
		firstTime = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field boolean firstTime>
	//    3    5:return          
	}

	public void setPkgName(String s)
	{
		pkgName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String pkgName>
	//    3    5:return          
	}

	public void setToken(String s)
	{
		token = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field String token>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append(" {").append("\n\t").append("isFirstTime: ").append(firstTime).append("\n\t").append("pkgName: ").append(pkgName).append("\n\t").append("token: ").append(c.a(token)).append("\n\t").append("}").toString();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #43  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #48  <Method String Class.getName()>
	//    6   14:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #54  <String " {">
	//    8   19:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #56  <String "\n\t">
	//   10   24:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:ldc1            #58  <String "isFirstTime: ">
	//   12   29:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   13   32:aload_0         
	//   14   33:getfield        #30  <Field boolean firstTime>
	//   15   36:invokevirtual   #61  <Method StringBuilder StringBuilder.append(boolean)>
	//   16   39:ldc1            #56  <String "\n\t">
	//   17   41:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   18   44:ldc1            #63  <String "pkgName: ">
	//   19   46:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   20   49:aload_0         
	//   21   50:getfield        #25  <Field String pkgName>
	//   22   53:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   23   56:ldc1            #56  <String "\n\t">
	//   24   58:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   25   61:ldc1            #65  <String "token: ">
	//   26   63:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   27   66:aload_0         
	//   28   67:getfield        #20  <Field String token>
	//   29   70:invokestatic    #71  <Method String c.a(String)>
	//   30   73:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   31   76:ldc1            #56  <String "\n\t">
	//   32   78:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   33   81:ldc1            #73  <String "}">
	//   34   83:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   35   86:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   36   89:areturn         
	}

	private boolean firstTime;
	private String pkgName;
	private String token;
}
