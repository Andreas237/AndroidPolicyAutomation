// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.core.aidl.IMessageEntity;
import java.util.*;
import org.json.*;

public class SignInReq
	implements IMessageEntity
{

	public SignInReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public SignInReq(Set set, Set set1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		JSONArray jsonarray = new JSONArray();
	//    2    4:new             #25  <Class JSONArray>
	//    3    7:dup             
	//    4    8:invokespecial   #26  <Method void JSONArray()>
	//    5   11:astore_3        
		for(set = ((Set) (set.iterator())); ((Iterator) (set)).hasNext(); jsonarray.put(((Object) ((String)((Iterator) (set)).next()))));
	//    6   12:aload_1         
	//    7   13:invokeinterface #32  <Method Iterator Set.iterator()>
	//    8   18:astore_1        
	//    9   19:aload_1         
	//   10   20:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            45
	//   12   28:aload_3         
	//   13   29:aload_1         
	//   14   30:invokeinterface #42  <Method Object Iterator.next()>
	//   15   35:checkcast       #44  <Class String>
	//   16   38:invokevirtual   #48  <Method JSONArray JSONArray.put(Object)>
	//   17   41:pop             
	//*  18   42:goto            19
		set = ((Set) (new JSONArray()));
	//   19   45:new             #25  <Class JSONArray>
	//   20   48:dup             
	//   21   49:invokespecial   #26  <Method void JSONArray()>
	//   22   52:astore_1        
		for(set1 = ((Set) (set1.iterator())); ((Iterator) (set1)).hasNext(); ((JSONArray) (set)).put(((Object) ((String)((Iterator) (set1)).next()))));
	//   23   53:aload_2         
	//   24   54:invokeinterface #32  <Method Iterator Set.iterator()>
	//   25   59:astore_2        
	//   26   60:aload_2         
	//   27   61:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//   28   66:ifeq            86
	//   29   69:aload_1         
	//   30   70:aload_2         
	//   31   71:invokeinterface #42  <Method Object Iterator.next()>
	//   32   76:checkcast       #44  <Class String>
	//   33   79:invokevirtual   #48  <Method JSONArray JSONArray.put(Object)>
	//   34   82:pop             
	//*  35   83:goto            60
		set1 = ((Set) (new JSONObject()));
	//   36   86:new             #50  <Class JSONObject>
	//   37   89:dup             
	//   38   90:invokespecial   #51  <Method void JSONObject()>
	//   39   93:astore_2        
		try
		{
			((JSONObject) (set1)).put("scopes", ((Object) (jsonarray)));
	//   40   94:aload_2         
	//   41   95:ldc1            #13  <String "scopes">
	//   42   97:aload_3         
	//   43   98:invokevirtual   #54  <Method JSONObject JSONObject.put(String, Object)>
	//   44  101:pop             
			((JSONObject) (set1)).put("dynamicpermissions", ((Object) (set)));
	//   45  102:aload_2         
	//   46  103:ldc1            #10  <String "dynamicpermissions">
	//   47  105:aload_1         
	//   48  106:invokevirtual   #54  <Method JSONObject JSONObject.put(String, Object)>
	//   49  109:pop             
			mLocalJsonObject = ((JSONObject) (set1)).toString();
	//   50  110:aload_0         
	//   51  111:aload_2         
	//   52  112:invokevirtual   #58  <Method String JSONObject.toString()>
	//   53  115:putfield        #60  <Field String mLocalJsonObject>
			return;
	//   54  118:return          
		}
		// Misplaced declaration of an exception variable
		catch(Set set)
	//*  55  119:astore_1        
		{
			mLocalJsonObject = (new JSONObject()).toString();
	//   56  120:aload_0         
	//   57  121:new             #50  <Class JSONObject>
	//   58  124:dup             
	//   59  125:invokespecial   #51  <Method void JSONObject()>
	//   60  128:invokevirtual   #58  <Method String JSONObject.toString()>
	//   61  131:putfield        #60  <Field String mLocalJsonObject>
		}
	//   62  134:return          
	}

	private JSONObject getJsonObj()
	{
		if(mLocalJsonObject == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field String mLocalJsonObject>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject(mLocalJsonObject);
	//    5    9:new             #50  <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #60  <Field String mLocalJsonObject>
	//    9   17:invokespecial   #67  <Method void JSONObject(String)>
	//   10   20:astore_1        
		}
	//*  11   21:aload_1         
	//*  12   22:areturn         
		catch(JSONException jsonexception)
	//*  13   23:astore_1        
		{
			return null;
	//   14   24:aconst_null     
	//   15   25:areturn         
		}
		return jsonobject;
	}

	public List getPermissionInfos()
	{
		Object obj = ((Object) (getJsonObj()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method JSONObject getJsonObj()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       18
			return ((List) (new ArrayList(0)));
	//    5    9:new             #73  <Class ArrayList>
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:invokespecial   #76  <Method void ArrayList(int)>
	//    9   17:areturn         
		int i;
		int j;
		ArrayList arraylist;
		try
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("dynamicpermissions")));
	//   10   18:aload_3         
	//   11   19:ldc1            #10  <String "dynamicpermissions">
	//   12   21:invokevirtual   #80  <Method JSONArray JSONObject.getJSONArray(String)>
	//   13   24:astore_3        
		}
	//*  14   25:aload_3         
	//*  15   26:ifnull          78
	//*  16   29:aload_3         
	//*  17   30:invokevirtual   #84  <Method int JSONArray.length()>
	//*  18   33:ifle            78
	//*  19   36:new             #73  <Class ArrayList>
	//*  20   39:dup             
	//*  21   40:invokespecial   #85  <Method void ArrayList()>
	//*  22   43:astore          4
	//*  23   45:aload_3         
	//*  24   46:invokevirtual   #84  <Method int JSONArray.length()>
	//*  25   49:istore_2        
	//*  26   50:iconst_0        
	//*  27   51:istore_1        
	//*  28   52:iload_1         
	//*  29   53:iload_2         
	//*  30   54:icmpge          75
	//*  31   57:aload           4
	//*  32   59:aload_3         
	//*  33   60:iload_1         
	//*  34   61:invokevirtual   #89  <Method String JSONArray.getString(int)>
	//*  35   64:invokevirtual   #93  <Method boolean ArrayList.add(Object)>
	//*  36   67:pop             
	//*  37   68:iload_1         
	//*  38   69:iconst_1        
	//*  39   70:iadd            
	//*  40   71:istore_1        
	//*  41   72:goto            52
	//*  42   75:aload           4
	//*  43   77:areturn         
	//*  44   78:goto            91
		catch(JSONException jsonexception)
	//*  45   81:astore_3        
		{
			return ((List) (new ArrayList(0)));
	//   46   82:new             #73  <Class ArrayList>
	//   47   85:dup             
	//   48   86:iconst_0        
	//   49   87:invokespecial   #76  <Method void ArrayList(int)>
	//   50   90:areturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_91;
		if(((JSONArray) (obj)).length() <= 0)
			break MISSING_BLOCK_LABEL_91;
		arraylist = new ArrayList();
		j = ((JSONArray) (obj)).length();
		i = 0;
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		arraylist.add(((Object) (((JSONArray) (obj)).getString(i))));
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		return ((List) (arraylist));
		return ((List) (new ArrayList(0)));
	//   51   91:new             #73  <Class ArrayList>
	//   52   94:dup             
	//   53   95:iconst_0        
	//   54   96:invokespecial   #76  <Method void ArrayList(int)>
	//   55   99:areturn         
	}

	public List getScopes()
	{
		Object obj = ((Object) (getJsonObj()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method JSONObject getJsonObj()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       18
			return ((List) (new ArrayList(0)));
	//    5    9:new             #73  <Class ArrayList>
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:invokespecial   #76  <Method void ArrayList(int)>
	//    9   17:areturn         
		int i;
		int j;
		ArrayList arraylist;
		try
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("scopes")));
	//   10   18:aload_3         
	//   11   19:ldc1            #13  <String "scopes">
	//   12   21:invokevirtual   #80  <Method JSONArray JSONObject.getJSONArray(String)>
	//   13   24:astore_3        
		}
	//*  14   25:aload_3         
	//*  15   26:ifnull          78
	//*  16   29:aload_3         
	//*  17   30:invokevirtual   #84  <Method int JSONArray.length()>
	//*  18   33:ifle            78
	//*  19   36:new             #73  <Class ArrayList>
	//*  20   39:dup             
	//*  21   40:invokespecial   #85  <Method void ArrayList()>
	//*  22   43:astore          4
	//*  23   45:aload_3         
	//*  24   46:invokevirtual   #84  <Method int JSONArray.length()>
	//*  25   49:istore_2        
	//*  26   50:iconst_0        
	//*  27   51:istore_1        
	//*  28   52:iload_1         
	//*  29   53:iload_2         
	//*  30   54:icmpge          75
	//*  31   57:aload           4
	//*  32   59:aload_3         
	//*  33   60:iload_1         
	//*  34   61:invokevirtual   #89  <Method String JSONArray.getString(int)>
	//*  35   64:invokevirtual   #93  <Method boolean ArrayList.add(Object)>
	//*  36   67:pop             
	//*  37   68:iload_1         
	//*  38   69:iconst_1        
	//*  39   70:iadd            
	//*  40   71:istore_1        
	//*  41   72:goto            52
	//*  42   75:aload           4
	//*  43   77:areturn         
	//*  44   78:goto            91
		catch(JSONException jsonexception)
	//*  45   81:astore_3        
		{
			return ((List) (new ArrayList(0)));
	//   46   82:new             #73  <Class ArrayList>
	//   47   85:dup             
	//   48   86:iconst_0        
	//   49   87:invokespecial   #76  <Method void ArrayList(int)>
	//   50   90:areturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_91;
		if(((JSONArray) (obj)).length() <= 0)
			break MISSING_BLOCK_LABEL_91;
		arraylist = new ArrayList();
		j = ((JSONArray) (obj)).length();
		i = 0;
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		arraylist.add(((Object) (((JSONArray) (obj)).getString(i))));
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		return ((List) (arraylist));
		return ((List) (new ArrayList(0)));
	//   51   91:new             #73  <Class ArrayList>
	//   52   94:dup             
	//   53   95:iconst_0        
	//   54   96:invokespecial   #76  <Method void ArrayList(int)>
	//   55   99:areturn         
	}

	private static final String KEY_DYNAMIC_PERMISSIONS = "dynamicpermissions";
	private static final String KEY_SCOPES = "scopes";
	public String mLocalJsonObject;
}
