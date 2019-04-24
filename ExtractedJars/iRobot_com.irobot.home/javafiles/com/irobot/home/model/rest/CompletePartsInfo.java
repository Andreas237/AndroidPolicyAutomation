// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import java.util.Arrays;

// Referenced classes of package com.irobot.home.model.rest:
//			CategoryInfo

public class CompletePartsInfo
{

	public CompletePartsInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		buyPartsUrl = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <String "">
	//    4    7:putfield        #17  <Field String buyPartsUrl>
	//    5   10:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("CompletePartsInfo{buyPartsUrl='");
	//    4    8:aload_1         
	//    5    9:ldc1            #25  <String "CompletePartsInfo{buyPartsUrl='">
	//    6   11:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(buyPartsUrl);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #17  <Field String buyPartsUrl>
	//   11   20:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('\'');
	//   13   24:aload_1         
	//   14   25:bipush          39
	//   15   27:invokevirtual   #32  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", maintenance=");
	//   17   31:aload_1         
	//   18   32:ldc1            #34  <String ", maintenance=">
	//   19   34:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(Arrays.toString(((Object []) (maintenance))));
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #36  <Field CategoryInfo[] maintenance>
	//   24   43:invokestatic    #41  <Method String Arrays.toString(Object[])>
	//   25   46:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append('}');
	//   27   50:aload_1         
	//   28   51:bipush          125
	//   29   53:invokevirtual   #32  <Method StringBuilder StringBuilder.append(char)>
	//   30   56:pop             
		return stringbuilder.toString();
	//   31   57:aload_1         
	//   32   58:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   33   61:areturn         
	}

	public String buyPartsUrl;
	public CategoryInfo maintenance[];
}
