// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.html;

import com.itextpdf.text.Image;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.itextpdf.tool.xml.pipeline.html:
//			ImageProvider

public abstract class AbstractImageProvider
	implements ImageProvider
{

	public AbstractImageProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #18  <Field Map map>
	//    7   15:return          
	}

	public void reset()
	{
		map.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map map>
	//    2    4:invokeinterface #25  <Method void Map.clear()>
	//    3    9:return          
	}

	public Image retrieve(String s)
	{
		return (Image)map.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map map>
	//    2    4:aload_1         
	//    3    5:invokeinterface #31  <Method Object Map.get(Object)>
	//    4   10:checkcast       #33  <Class Image>
	//    5   13:areturn         
	}

	public void store(String s, Image image)
	{
		map.put(((Object) (s)), ((Object) (image)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map map>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	private final Map map = new ConcurrentHashMap();
}
