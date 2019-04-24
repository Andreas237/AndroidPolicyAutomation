// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.push.b.b.c;

public class TagsReq
	implements IMessageEntity
{

	public TagsReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		content = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #23  <String "">
	//    4    7:putfield        #25  <Field String content>
		cycle = 0L;
	//    5   10:aload_0         
	//    6   11:lconst_0        
	//    7   12:putfield        #27  <Field long cycle>
	//    8   15:return          
	}

	public String getApkVersion()
	{
		return apkVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String apkVersion>
	//    2    4:areturn         
	}

	public String getContent()
	{
		return content;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String content>
	//    2    4:areturn         
	}

	public long getCycle()
	{
		return cycle;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field long cycle>
	//    2    4:lreturn         
	}

	public int getOperType()
	{
		return operType;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int operType>
	//    2    4:ireturn         
	}

	public String getPkgName()
	{
		return pkgName;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String pkgName>
	//    2    4:areturn         
	}

	public int getPlusType()
	{
		return plusType;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int plusType>
	//    2    4:ireturn         
	}

	public String getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String token>
	//    2    4:areturn         
	}

	public void setApkVersion(String s)
	{
		apkVersion = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String apkVersion>
	//    3    5:return          
	}

	public void setContent(String s)
	{
		content = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String content>
	//    3    5:return          
	}

	public void setCycle(long l)
	{
		cycle = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #27  <Field long cycle>
	//    3    5:return          
	}

	public void setOperType(int i)
	{
		operType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field int operType>
	//    3    5:return          
	}

	public void setPkgName(String s)
	{
		pkgName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String pkgName>
	//    3    5:return          
	}

	public void setPlusType(int i)
	{
		plusType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int plusType>
	//    3    5:return          
	}

	public void setToken(String s)
	{
		token = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field String token>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append(" {").append("\n\t").append("cycle: ").append(cycle).append("\n\t").append("operType: ").append(operType).append("\n\t").append("plusType: ").append(plusType).append("\n\t").append("token: ").append(c.a(token)).append("\n\t").append("pkgName: ").append(pkgName).append("\n\t").append("apkVersion: ").append(apkVersion).append("\n\t").append("content: ").append(content).append("\n\t").append("\n\t").append("}").toString();
	//    0    0:new             #61  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #66  <Method Class Object.getClass()>
	//    5   11:invokevirtual   #71  <Method String Class.getName()>
	//    6   14:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #77  <String " {">
	//    8   19:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #79  <String "\n\t">
	//   10   24:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:ldc1            #81  <String "cycle: ">
	//   12   29:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   13   32:aload_0         
	//   14   33:getfield        #27  <Field long cycle>
	//   15   36:invokevirtual   #84  <Method StringBuilder StringBuilder.append(long)>
	//   16   39:ldc1            #79  <String "\n\t">
	//   17   41:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   18   44:ldc1            #86  <String "operType: ">
	//   19   46:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   20   49:aload_0         
	//   21   50:getfield        #39  <Field int operType>
	//   22   53:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
	//   23   56:ldc1            #79  <String "\n\t">
	//   24   58:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   25   61:ldc1            #91  <String "plusType: ">
	//   26   63:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   27   66:aload_0         
	//   28   67:getfield        #45  <Field int plusType>
	//   29   70:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
	//   30   73:ldc1            #79  <String "\n\t">
	//   31   75:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   32   78:ldc1            #93  <String "token: ">
	//   33   80:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   34   83:aload_0         
	//   35   84:getfield        #48  <Field String token>
	//   36   87:invokestatic    #99  <Method String c.a(String)>
	//   37   90:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   38   93:ldc1            #79  <String "\n\t">
	//   39   95:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   40   98:ldc1            #101 <String "pkgName: ">
	//   41  100:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   42  103:aload_0         
	//   43  104:getfield        #42  <Field String pkgName>
	//   44  107:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   45  110:ldc1            #79  <String "\n\t">
	//   46  112:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   47  115:ldc1            #103 <String "apkVersion: ">
	//   48  117:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   49  120:aload_0         
	//   50  121:getfield        #32  <Field String apkVersion>
	//   51  124:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   52  127:ldc1            #79  <String "\n\t">
	//   53  129:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   54  132:ldc1            #105 <String "content: ">
	//   55  134:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   56  137:aload_0         
	//   57  138:getfield        #25  <Field String content>
	//   58  141:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   59  144:ldc1            #79  <String "\n\t">
	//   60  146:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   61  149:ldc1            #79  <String "\n\t">
	//   62  151:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   63  154:ldc1            #107 <String "}">
	//   64  156:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   65  159:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   66  162:areturn         
	}

	private String apkVersion;
	private String content;
	private long cycle;
	private int operType;
	private String pkgName;
	private int plusType;
	private String token;
}
