// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.share.model.*;
import java.util.*;
import org.json.*;

public final class OpenGraphJSONUtility
{
	public static interface PhotoJSONProcessor
	{

		public abstract JSONObject toJSONObject(SharePhoto sharephoto);
	}


	private static JSONArray toJSONArray(List list, PhotoJSONProcessor photojsonprocessor)
		throws JSONException
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #13  <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void JSONArray()>
	//    3    7:astore_2        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); jsonarray.put(toJSONValue(((Iterator) (list)).next(), photojsonprocessor)));
	//    4    8:aload_0         
	//    5    9:invokeinterface #23  <Method Iterator List.iterator()>
	//    6   14:astore_0        
	//    7   15:aload_0         
	//    8   16:invokeinterface #29  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            42
	//   10   24:aload_2         
	//   11   25:aload_0         
	//   12   26:invokeinterface #33  <Method Object Iterator.next()>
	//   13   31:aload_1         
	//   14   32:invokestatic    #37  <Method Object toJSONValue(Object, OpenGraphJSONUtility$PhotoJSONProcessor)>
	//   15   35:invokevirtual   #41  <Method JSONArray JSONArray.put(Object)>
	//   16   38:pop             
	//*  17   39:goto            15
		return jsonarray;
	//   18   42:aload_2         
	//   19   43:areturn         
	}

	public static JSONObject toJSONObject(ShareOpenGraphAction shareopengraphaction, PhotoJSONProcessor photojsonprocessor)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #47  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void JSONObject()>
	//    3    7:astore_2        
		String s;
		for(Iterator iterator = shareopengraphaction.keySet().iterator(); iterator.hasNext(); jsonobject.put(s, toJSONValue(shareopengraphaction.get(s), photojsonprocessor)))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #54  <Method Set ShareOpenGraphAction.keySet()>
	//*   6   12:invokeinterface #57  <Method Iterator Set.iterator()>
	//*   7   17:astore_3        
	//*   8   18:aload_3         
	//*   9   19:invokeinterface #29  <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            58
			s = (String)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #33  <Method Object Iterator.next()>
	//   13   33:checkcast       #59  <Class String>
	//   14   36:astore          4

	//   15   38:aload_2         
	//   16   39:aload           4
	//   17   41:aload_0         
	//   18   42:aload           4
	//   19   44:invokevirtual   #63  <Method Object ShareOpenGraphAction.get(String)>
	//   20   47:aload_1         
	//   21   48:invokestatic    #37  <Method Object toJSONValue(Object, OpenGraphJSONUtility$PhotoJSONProcessor)>
	//   22   51:invokevirtual   #66  <Method JSONObject JSONObject.put(String, Object)>
	//   23   54:pop             
	//*  24   55:goto            18
		return jsonobject;
	//   25   58:aload_2         
	//   26   59:areturn         
	}

	private static JSONObject toJSONObject(ShareOpenGraphObject shareopengraphobject, PhotoJSONProcessor photojsonprocessor)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #47  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void JSONObject()>
	//    3    7:astore_2        
		String s;
		for(Iterator iterator = shareopengraphobject.keySet().iterator(); iterator.hasNext(); jsonobject.put(s, toJSONValue(shareopengraphobject.get(s), photojsonprocessor)))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #70  <Method Set ShareOpenGraphObject.keySet()>
	//*   6   12:invokeinterface #57  <Method Iterator Set.iterator()>
	//*   7   17:astore_3        
	//*   8   18:aload_3         
	//*   9   19:invokeinterface #29  <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            58
			s = (String)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #33  <Method Object Iterator.next()>
	//   13   33:checkcast       #59  <Class String>
	//   14   36:astore          4

	//   15   38:aload_2         
	//   16   39:aload           4
	//   17   41:aload_0         
	//   18   42:aload           4
	//   19   44:invokevirtual   #71  <Method Object ShareOpenGraphObject.get(String)>
	//   20   47:aload_1         
	//   21   48:invokestatic    #37  <Method Object toJSONValue(Object, OpenGraphJSONUtility$PhotoJSONProcessor)>
	//   22   51:invokevirtual   #66  <Method JSONObject JSONObject.put(String, Object)>
	//   23   54:pop             
	//*  24   55:goto            18
		return jsonobject;
	//   25   58:aload_2         
	//   26   59:areturn         
	}

	public static Object toJSONValue(Object obj, PhotoJSONProcessor photojsonprocessor)
		throws JSONException
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return JSONObject.NULL;
	//    2    4:getstatic       #76  <Field Object JSONObject.NULL>
	//    3    7:areturn         
		if(!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer))
	//*   4    8:aload_0         
	//*   5    9:instanceof      #59  <Class String>
	//*   6   12:ifne            144
	//*   7   15:aload_0         
	//*   8   16:instanceof      #78  <Class Boolean>
	//*   9   19:ifne            144
	//*  10   22:aload_0         
	//*  11   23:instanceof      #80  <Class Double>
	//*  12   26:ifne            144
	//*  13   29:aload_0         
	//*  14   30:instanceof      #82  <Class Float>
	//*  15   33:ifne            144
	//*  16   36:aload_0         
	//*  17   37:instanceof      #84  <Class Integer>
	//*  18   40:ifne            144
		{
			if(obj instanceof Long)
	//*  19   43:aload_0         
	//*  20   44:instanceof      #86  <Class Long>
	//*  21   47:ifeq            52
				return obj;
	//   22   50:aload_0         
	//   23   51:areturn         
			if(obj instanceof SharePhoto)
	//*  24   52:aload_0         
	//*  25   53:instanceof      #88  <Class SharePhoto>
	//*  26   56:ifeq            76
				if(photojsonprocessor != null)
	//*  27   59:aload_1         
	//*  28   60:ifnull          74
					return ((Object) (photojsonprocessor.toJSONObject((SharePhoto)obj)));
	//   29   63:aload_1         
	//   30   64:aload_0         
	//   31   65:checkcast       #88  <Class SharePhoto>
	//   32   68:invokeinterface #91  <Method JSONObject OpenGraphJSONUtility$PhotoJSONProcessor.toJSONObject(SharePhoto)>
	//   33   73:areturn         
				else
					return ((Object) (null));
	//   34   74:aconst_null     
	//   35   75:areturn         
			if(obj instanceof ShareOpenGraphObject)
	//*  36   76:aload_0         
	//*  37   77:instanceof      #69  <Class ShareOpenGraphObject>
	//*  38   80:ifeq            92
				return ((Object) (toJSONObject((ShareOpenGraphObject)obj, photojsonprocessor)));
	//   39   83:aload_0         
	//   40   84:checkcast       #69  <Class ShareOpenGraphObject>
	//   41   87:aload_1         
	//   42   88:invokestatic    #93  <Method JSONObject toJSONObject(ShareOpenGraphObject, OpenGraphJSONUtility$PhotoJSONProcessor)>
	//   43   91:areturn         
			if(obj instanceof List)
	//*  44   92:aload_0         
	//*  45   93:instanceof      #19  <Class List>
	//*  46   96:ifeq            108
			{
				return ((Object) (toJSONArray((List)obj, photojsonprocessor)));
	//   47   99:aload_0         
	//   48  100:checkcast       #19  <Class List>
	//   49  103:aload_1         
	//   50  104:invokestatic    #95  <Method JSONArray toJSONArray(List, OpenGraphJSONUtility$PhotoJSONProcessor)>
	//   51  107:areturn         
			} else
			{
				photojsonprocessor = ((PhotoJSONProcessor) (new StringBuilder()));
	//   52  108:new             #97  <Class StringBuilder>
	//   53  111:dup             
	//   54  112:invokespecial   #98  <Method void StringBuilder()>
	//   55  115:astore_1        
				((StringBuilder) (photojsonprocessor)).append("Invalid object found for JSON serialization: ");
	//   56  116:aload_1         
	//   57  117:ldc1            #100 <String "Invalid object found for JSON serialization: ">
	//   58  119:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   59  122:pop             
				((StringBuilder) (photojsonprocessor)).append(obj.toString());
	//   60  123:aload_1         
	//   61  124:aload_0         
	//   62  125:invokevirtual   #108 <Method String Object.toString()>
	//   63  128:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   64  131:pop             
				throw new IllegalArgumentException(((StringBuilder) (photojsonprocessor)).toString());
	//   65  132:new             #110 <Class IllegalArgumentException>
	//   66  135:dup             
	//   67  136:aload_1         
	//   68  137:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   69  140:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   70  143:athrow          
			}
		} else
		{
			return obj;
	//   71  144:aload_0         
	//   72  145:areturn         
		}
	}
}
