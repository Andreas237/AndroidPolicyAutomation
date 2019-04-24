// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.push.b.b.c;

public class DeleteTokenReq
	implements IMessageEntity
{

	public DeleteTokenReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public String getPkgName()
	{
		return pkgName;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String pkgName>
	//    2    4:areturn         
	}

	public String getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String token>
	//    2    4:areturn         
	}

	public void setPkgName(String s)
	{
		pkgName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field String pkgName>
	//    3    5:return          
	}

	public void setToken(String s)
	{
		token = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String token>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append(" {").append("\n\t").append("pkgName: ").append(pkgName).append("\n\t").append("token: ").append(c.a(token)).append("\n\t").append("}").toString();
	//    0    0:new             #28  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #33  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #38  <Method String Class.getName()>
	//    6   14:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #44  <String " {">
	//    8   19:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #46  <String "\n\t">
	//   10   24:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:ldc1            #48  <String "pkgName: ">
	//   12   29:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   13   32:aload_0         
	//   14   33:getfield        #19  <Field String pkgName>
	//   15   36:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:ldc1            #46  <String "\n\t">
	//   17   41:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   18   44:ldc1            #50  <String "token: ">
	//   19   46:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   20   49:aload_0         
	//   21   50:getfield        #22  <Field String token>
	//   22   53:invokestatic    #56  <Method String c.a(String)>
	//   23   56:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   24   59:ldc1            #46  <String "\n\t">
	//   25   61:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   26   64:ldc1            #58  <String "}">
	//   27   66:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   28   69:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   29   72:areturn         
	}

	private String pkgName;
	private String token;
}
