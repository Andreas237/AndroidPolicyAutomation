// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.style;

import java.util.*;

// Referenced classes of package com.autonavi.ae.gmap.style:
//			StyleElement

public class StyleItem
{

	public StyleItem(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		styleElements = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void HashMap()>
	//    6   12:putfield        #19  <Field Map styleElements>
		styleTypeId = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #21  <Field int styleTypeId>
	//   10   20:return          
	}

	public StyleElement get(int i)
	{
		return (StyleElement)styleElements.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map styleElements>
	//    2    4:iload_1         
	//    3    5:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #35  <Method Object Map.get(Object)>
	//    5   13:checkcast       #37  <Class StyleElement>
	//    6   16:areturn         
	}

	public StyleElement[] getStyleElements()
	{
		if(styleElements != null && styleElements.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Map styleElements>
	//*   2    4:ifnull          51
	//*   3    7:aload_0         
	//*   4    8:getfield        #19  <Field Map styleElements>
	//*   5   11:invokeinterface #43  <Method int Map.size()>
	//*   6   16:ifle            51
		{
			StyleElement astyleelement[] = new StyleElement[styleElements.size()];
	//    7   19:aload_0         
	//    8   20:getfield        #19  <Field Map styleElements>
	//    9   23:invokeinterface #43  <Method int Map.size()>
	//   10   28:anewarray       StyleElement[]
	//   11   31:astore_1        
			return (StyleElement[])styleElements.values().toArray(((Object []) (astyleelement)));
	//   12   32:aload_0         
	//   13   33:getfield        #19  <Field Map styleElements>
	//   14   36:invokeinterface #47  <Method Collection Map.values()>
	//   15   41:aload_1         
	//   16   42:invokeinterface #53  <Method Object[] Collection.toArray(Object[])>
	//   17   47:checkcast       #55  <Class StyleElement[]>
	//   18   50:areturn         
		} else
		{
			return null;
	//   19   51:aconst_null     
	//   20   52:areturn         
		}
	}

	public int getStyleTypeId()
	{
		return styleTypeId;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int styleTypeId>
	//    2    4:ireturn         
	}

	public boolean isValid()
	{
		return styleElements.size() > 0 && styleTypeId >= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map styleElements>
	//    2    4:invokeinterface #43  <Method int Map.size()>
	//    3    9:ifle            21
	//    4   12:aload_0         
	//    5   13:getfield        #21  <Field int styleTypeId>
	//    6   16:iflt            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public void put(int i, StyleElement styleelement)
	{
		styleElements.put(((Object) (Integer.valueOf(i))), ((Object) (styleelement)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map styleElements>
	//    2    4:iload_1         
	//    3    5:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//    4    8:aload_2         
	//    5    9:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("styleTypeId:").append(styleTypeId).append("\n");
	//    4    8:aload_1         
	//    5    9:ldc1            #70  <String "styleTypeId:">
	//    6   11:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:aload_0         
	//    8   15:getfield        #21  <Field int styleTypeId>
	//    9   18:invokevirtual   #77  <Method StringBuilder StringBuilder.append(int)>
	//   10   21:ldc1            #79  <String "\n">
	//   11   23:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append("styleElements.size :").append(styleElements.size());
	//   13   27:aload_1         
	//   14   28:ldc1            #81  <String "styleElements.size :">
	//   15   30:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:aload_0         
	//   17   34:getfield        #19  <Field Map styleElements>
	//   18   37:invokeinterface #43  <Method int Map.size()>
	//   19   42:invokevirtual   #77  <Method StringBuilder StringBuilder.append(int)>
	//   20   45:pop             
		return stringbuilder.toString();
	//   21   46:aload_1         
	//   22   47:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   23   50:areturn         
	}

	private Map styleElements;
	private int styleTypeId;
}
