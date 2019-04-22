// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;


final class n extends h.b
{

	n(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void h$b()>
		appVersion = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int appVersion>
		if(s != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          19
		{
			packageName = s;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #17  <Field String packageName>
			return;
	//   10   18:return          
		} else
		{
			throw new NullPointerException("Null packageName");
	//   11   19:new             #19  <Class NullPointerException>
	//   12   22:dup             
	//   13   23:ldc1            #21  <String "Null packageName">
	//   14   25:invokespecial   #24  <Method void NullPointerException(String)>
	//   15   28:athrow          
		}
	}

	public int appVersion()
	{
		return appVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int appVersion>
	//    2    4:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj instanceof h.b)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #4   <Class h$b>
	//*   7   11:ifeq            48
		{
			obj = ((Object) ((h.b)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #4   <Class h$b>
	//   10   18:astore_1        
			return appVersion == ((h.b) (obj)).appVersion() && packageName.equals(((Object) (((h.b) (obj)).packageName())));
	//   11   19:aload_0         
	//   12   20:getfield        #15  <Field int appVersion>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #30  <Method int h$b.appVersion()>
	//   15   27:icmpne          46
	//   16   30:aload_0         
	//   17   31:getfield        #17  <Field String packageName>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #33  <Method String h$b.packageName()>
	//   20   38:invokevirtual   #37  <Method boolean String.equals(Object)>
	//   21   41:ifeq            46
	//   22   44:iconst_1        
	//   23   45:ireturn         
	//   24   46:iconst_0        
	//   25   47:ireturn         
		} else
		{
			return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
		}
	}

	public int hashCode()
	{
		return (appVersion ^ 0xf4243) * 0xf4243 ^ packageName.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int appVersion>
	//    2    4:ldc1            #39  <Int 0xf4243>
	//    3    6:ixor            
	//    4    7:ldc1            #39  <Int 0xf4243>
	//    5    9:imul            
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field String packageName>
	//    8   14:invokevirtual   #41  <Method int String.hashCode()>
	//    9   17:ixor            
	//   10   18:ireturn         
	}

	public String packageName()
	{
		return packageName;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String packageName>
	//    2    4:areturn         
	}

	public String toString()
	{
		int i = appVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int appVersion>
	//    2    4:istore_1        
		String s = packageName;
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field String packageName>
	//    5    9:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 51);
	//    6   10:new             #44  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokestatic    #48  <Method String String.valueOf(Object)>
	//   10   18:invokevirtual   #51  <Method int String.length()>
	//   11   21:bipush          51
	//   12   23:iadd            
	//   13   24:invokespecial   #54  <Method void StringBuilder(int)>
	//   14   27:astore_3        
		stringbuilder.append("MarketAppInfo{appVersion=");
	//   15   28:aload_3         
	//   16   29:ldc1            #56  <String "MarketAppInfo{appVersion=">
	//   17   31:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append(i);
	//   19   35:aload_3         
	//   20   36:iload_1         
	//   21   37:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
	//   22   40:pop             
		stringbuilder.append(", packageName=");
	//   23   41:aload_3         
	//   24   42:ldc1            #65  <String ", packageName=">
	//   25   44:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
		stringbuilder.append(s);
	//   27   48:aload_3         
	//   28   49:aload_2         
	//   29   50:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   30   53:pop             
		stringbuilder.append("}");
	//   31   54:aload_3         
	//   32   55:ldc1            #67  <String "}">
	//   33   57:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   34   60:pop             
		return stringbuilder.toString();
	//   35   61:aload_3         
	//   36   62:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   37   65:areturn         
	}

	private final int appVersion;
	private final String packageName;
}
