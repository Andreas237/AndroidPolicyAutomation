// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.html.HtmlUtilities;
import java.util.*;

public class ChainedProperties
{
	private static final class TagAttributes
	{

		final Map attrs;
		final String tag;

		TagAttributes(String s, Map map)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			tag = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field String tag>
			attrs = map;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field Map attrs>
		//    8   14:return          
		}
	}


	public ChainedProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		chain = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List chain>
	//    7   15:return          
	}

	public void addToChain(String s, Map map)
	{
		adjustFontSize(map);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #27  <Method void adjustFontSize(Map)>
		chain.add(((Object) (new TagAttributes(s, map))));
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field List chain>
	//    5    9:new             #6   <Class ChainedProperties$TagAttributes>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #29  <Method void ChainedProperties$TagAttributes(String, Map)>
	//   10   18:invokeinterface #35  <Method boolean List.add(Object)>
	//   11   23:pop             
	//   12   24:return          
	}

	protected void adjustFontSize(Map map)
	{
		String s = (String)map.get("size");
	//    0    0:aload_1         
	//    1    1:ldc1            #39  <String "size">
	//    2    3:invokeinterface #45  <Method Object Map.get(Object)>
	//    3    8:checkcast       #47  <Class String>
	//    4   11:astore_2        
		if(s == null)
	//*   5   12:aload_2         
	//*   6   13:ifnonnull       17
			return;
	//    7   16:return          
		if(s.endsWith("pt"))
	//*   8   17:aload_2         
	//*   9   18:ldc1            #49  <String "pt">
	//*  10   20:invokevirtual   #53  <Method boolean String.endsWith(String)>
	//*  11   23:ifeq            47
		{
			map.put("size", ((Object) (s.substring(0, s.length() - 2))));
	//   12   26:aload_1         
	//   13   27:ldc1            #39  <String "size">
	//   14   29:aload_2         
	//   15   30:iconst_0        
	//   16   31:aload_2         
	//   17   32:invokevirtual   #57  <Method int String.length()>
	//   18   35:iconst_2        
	//   19   36:isub            
	//   20   37:invokevirtual   #61  <Method String String.substring(int, int)>
	//   21   40:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   22   45:pop             
			return;
	//   23   46:return          
		} else
		{
			map.put("size", ((Object) (Integer.toString(HtmlUtilities.getIndexedFontSize(s, getProperty("size"))))));
	//   24   47:aload_1         
	//   25   48:ldc1            #39  <String "size">
	//   26   50:aload_2         
	//   27   51:aload_0         
	//   28   52:ldc1            #39  <String "size">
	//   29   54:invokevirtual   #69  <Method String getProperty(String)>
	//   30   57:invokestatic    #75  <Method int HtmlUtilities.getIndexedFontSize(String, String)>
	//   31   60:invokestatic    #81  <Method String Integer.toString(int)>
	//   32   63:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   33   68:pop             
			return;
	//   34   69:return          
		}
	}

	public String getProperty(String s)
	{
		for(int i = chain.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field List chain>
	//*   2    4:invokeinterface #84  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iflt            55
		{
			String s1 = (String)((TagAttributes)chain.get(i)).attrs.get(((Object) (s)));
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field List chain>
	//   10   20:iload_2         
	//   11   21:invokeinterface #87  <Method Object List.get(int)>
	//   12   26:checkcast       #6   <Class ChainedProperties$TagAttributes>
	//   13   29:getfield        #91  <Field Map ChainedProperties$TagAttributes.attrs>
	//   14   32:aload_1         
	//   15   33:invokeinterface #45  <Method Object Map.get(Object)>
	//   16   38:checkcast       #47  <Class String>
	//   17   41:astore_3        
			if(s1 != null)
	//*  18   42:aload_3         
	//*  19   43:ifnull          48
				return s1;
	//   20   46:aload_3         
	//   21   47:areturn         
		}

	//   22   48:iload_2         
	//   23   49:iconst_1        
	//   24   50:isub            
	//   25   51:istore_2        
	//*  26   52:goto            12
		return null;
	//   27   55:aconst_null     
	//   28   56:areturn         
	}

	public boolean hasProperty(String s)
	{
		for(int i = chain.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field List chain>
	//*   2    4:invokeinterface #84  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iflt            50
			if(((TagAttributes)chain.get(i)).attrs.containsKey(((Object) (s))))
	//*   8   16:aload_0         
	//*   9   17:getfield        #20  <Field List chain>
	//*  10   20:iload_2         
	//*  11   21:invokeinterface #87  <Method Object List.get(int)>
	//*  12   26:checkcast       #6   <Class ChainedProperties$TagAttributes>
	//*  13   29:getfield        #91  <Field Map ChainedProperties$TagAttributes.attrs>
	//*  14   32:aload_1         
	//*  15   33:invokeinterface #95  <Method boolean Map.containsKey(Object)>
	//*  16   38:ifeq            43
				return true;
	//   17   41:iconst_1        
	//   18   42:ireturn         

	//   19   43:iload_2         
	//   20   44:iconst_1        
	//   21   45:isub            
	//   22   46:istore_2        
	//*  23   47:goto            12
		return false;
	//   24   50:iconst_0        
	//   25   51:ireturn         
	}

	public void removeChain(String s)
	{
		int i = chain.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List chain>
	//    2    4:invokeinterface #84  <Method int List.size()>
	//    3    9:iconst_1        
	//    4   10:isub            
	//    5   11:istore_2        
		do
		{
label0:
			{
				if(i >= 0)
	//*   6   12:iload_2         
	//*   7   13:iflt            50
				{
					if(!s.equals(((Object) (((TagAttributes)chain.get(i)).tag))))
						break label0;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #20  <Field List chain>
	//   11   21:iload_2         
	//   12   22:invokeinterface #87  <Method Object List.get(int)>
	//   13   27:checkcast       #6   <Class ChainedProperties$TagAttributes>
	//   14   30:getfield        #101 <Field String ChainedProperties$TagAttributes.tag>
	//   15   33:invokevirtual   #104 <Method boolean String.equals(Object)>
	//   16   36:ifeq            51
					chain.remove(i);
	//   17   39:aload_0         
	//   18   40:getfield        #20  <Field List chain>
	//   19   43:iload_2         
	//   20   44:invokeinterface #107 <Method Object List.remove(int)>
	//   21   49:pop             
				}
				return;
	//   22   50:return          
			}
			i--;
	//   23   51:iload_2         
	//   24   52:iconst_1        
	//   25   53:isub            
	//   26   54:istore_2        
		} while(true);
	//   27   55:goto            12
	}

	public List chain;
}
