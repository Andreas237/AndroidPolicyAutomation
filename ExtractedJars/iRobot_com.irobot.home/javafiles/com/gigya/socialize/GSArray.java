// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.gigya.socialize:
//			GSObject

public class GSArray
	implements Serializable, Iterable
{

	public GSArray()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		array = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void ArrayList()>
	//    6   12:putfield        #25  <Field ArrayList array>
	//    7   15:return          
	}

	public GSArray(String s)
	{
		this(new JSONArray(s));
	//    0    0:aload_0         
	//    1    1:new             #29  <Class JSONArray>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #31  <Method void JSONArray(String)>
	//    5    9:invokespecial   #34  <Method void GSArray(JSONArray)>
	//    6   12:return          
	}

	protected GSArray(JSONArray jsonarray)
	{
		int i;
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		array = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void ArrayList()>
	//    6   12:putfield        #25  <Field ArrayList array>
		i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_2        
_L7:
		if(i >= jsonarray.length()) goto _L2; else goto _L1
	//    9   17:iload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #38  <Method int JSONArray.length()>
	//   12   22:icmpge          142
_L1:
		if(!jsonarray.isNull(i)) goto _L4; else goto _L3
	//   13   25:aload_1         
	//   14   26:iload_2         
	//   15   27:invokevirtual   #42  <Method boolean JSONArray.isNull(int)>
	//   16   30:ifeq            51
_L3:
		Object obj;
		GSObject gsobject;
		obj = ((Object) (array));
	//   17   33:aload_0         
	//   18   34:getfield        #25  <Field ArrayList array>
	//   19   37:astore_3        
		gsobject = null;
	//   20   38:aconst_null     
	//   21   39:astore          4
_L6:
		((ArrayList) (obj)).add(((Object) (gsobject)));
	//   22   41:aload_3         
	//   23   42:aload           4
	//   24   44:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//   25   47:pop             
		continue; /* Loop/switch isn't completed */
	//   26   48:goto            135
_L4:
		obj = jsonarray.get(i);
	//   27   51:aload_1         
	//   28   52:iload_2         
	//   29   53:invokevirtual   #50  <Method Object JSONArray.get(int)>
	//   30   56:astore_3        
		if(!((Object) (obj.getClass())).equals(org/json/JSONObject))
			break; /* Loop/switch isn't completed */
	//   31   57:aload_3         
	//   32   58:invokevirtual   #54  <Method Class Object.getClass()>
	//   33   61:ldc1            #56  <Class JSONObject>
	//   34   63:invokevirtual   #59  <Method boolean Object.equals(Object)>
	//   35   66:ifeq            90
		gsobject = new GSObject((JSONObject)obj);
	//   36   69:new             #61  <Class GSObject>
	//   37   72:dup             
	//   38   73:aload_3         
	//   39   74:checkcast       #56  <Class JSONObject>
	//   40   77:invokespecial   #64  <Method void GSObject(JSONObject)>
	//   41   80:astore          4
		obj = ((Object) (array));
	//   42   82:aload_0         
	//   43   83:getfield        #25  <Field ArrayList array>
	//   44   86:astore_3        
		if(true) goto _L6; else goto _L5
	//   45   87:goto            41
_L5:
		if(((Object) (obj.getClass())).equals(org/json/JSONArray))
	//*  46   90:aload_3         
	//*  47   91:invokevirtual   #54  <Method Class Object.getClass()>
	//*  48   94:ldc1            #29  <Class JSONArray>
	//*  49   96:invokevirtual   #59  <Method boolean Object.equals(Object)>
	//*  50   99:ifeq            126
		{
			obj = ((Object) ((JSONArray)obj));
	//   51  102:aload_3         
	//   52  103:checkcast       #29  <Class JSONArray>
	//   53  106:astore_3        
			array.add(((Object) (new GSArray(((JSONArray) (obj))))));
	//   54  107:aload_0         
	//   55  108:getfield        #25  <Field ArrayList array>
	//   56  111:new             #2   <Class GSArray>
	//   57  114:dup             
	//   58  115:aload_3         
	//   59  116:invokespecial   #34  <Method void GSArray(JSONArray)>
	//   60  119:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//   61  122:pop             
		} else
	//*  62  123:goto            135
		{
			array.add(obj);
	//   63  126:aload_0         
	//   64  127:getfield        #25  <Field ArrayList array>
	//   65  130:aload_3         
	//   66  131:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//   67  134:pop             
		}
		i++;
	//   68  135:iload_2         
	//   69  136:iconst_1        
	//   70  137:iadd            
	//   71  138:istore_2        
		  goto _L7
	//*  72  139:goto            17
_L2:
	//   73  142:return          
	}

	public void add(double d)
	{
		array.add(((Object) (Double.valueOf(d))));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:dload_1         
	//    3    5:invokestatic    #71  <Method Double Double.valueOf(double)>
	//    4    8:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void add(int i)
	{
		array.add(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:iload_1         
	//    3    5:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void add(long l)
	{
		array.add(((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:lload_1         
	//    3    5:invokestatic    #83  <Method Long Long.valueOf(long)>
	//    4    8:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void add(GSArray gsarray)
	{
		array.add(((Object) (gsarray)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void add(GSObject gsobject)
	{
		array.add(((Object) (gsobject)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void add(String s)
	{
		array.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void add(boolean flag)
	{
		array.add(((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:iload_1         
	//    3    5:invokestatic    #91  <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public GSArray getArray(int i)
	{
		Object obj = array.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #94  <Method Object ArrayList.get(int)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return (GSArray)obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #2   <Class GSArray>
	//   11   19:areturn         
	}

	public boolean getBool(int i)
	{
		Object obj = array.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #94  <Method Object ArrayList.get(int)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       46
		{
			obj = ((Object) (new StringBuilder()));
	//    7   13:new             #97  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #98  <Method void StringBuilder()>
	//   10   20:astore_2        
			((StringBuilder) (obj)).append("GSArray does not contain a value at index ");
	//   11   21:aload_2         
	//   12   22:ldc1            #13  <String "GSArray does not contain a value at index ">
	//   13   24:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			((StringBuilder) (obj)).append(i);
	//   15   28:aload_2         
	//   16   29:iload_1         
	//   17   30:invokevirtual   #105 <Method StringBuilder StringBuilder.append(int)>
	//   18   33:pop             
			throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   19   34:new             #107 <Class NullPointerException>
	//   20   37:dup             
	//   21   38:aload_2         
	//   22   39:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   23   42:invokespecial   #112 <Method void NullPointerException(String)>
	//   24   45:athrow          
		}
		if(obj.getClass().isAssignableFrom(java/lang/Boolean))
	//*  25   46:aload_2         
	//*  26   47:invokevirtual   #54  <Method Class Object.getClass()>
	//*  27   50:ldc1            #88  <Class Boolean>
	//*  28   52:invokevirtual   #118 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   55:ifeq            66
			return ((Boolean)obj).booleanValue();
	//   30   58:aload_2         
	//   31   59:checkcast       #88  <Class Boolean>
	//   32   62:invokevirtual   #122 <Method boolean Boolean.booleanValue()>
	//   33   65:ireturn         
		return obj.toString().toLowerCase().equals("true") || obj.toString().equals("1");
	//   34   66:aload_2         
	//   35   67:invokevirtual   #123 <Method String Object.toString()>
	//   36   70:invokevirtual   #128 <Method String String.toLowerCase()>
	//   37   73:ldc1            #130 <String "true">
	//   38   75:invokevirtual   #131 <Method boolean String.equals(Object)>
	//   39   78:ifne            98
	//   40   81:aload_2         
	//   41   82:invokevirtual   #123 <Method String Object.toString()>
	//   42   85:ldc1            #133 <String "1">
	//   43   87:invokevirtual   #131 <Method boolean String.equals(Object)>
	//   44   90:ifeq            96
	//   45   93:goto            98
	//   46   96:iconst_0        
	//   47   97:ireturn         
	//   48   98:iconst_1        
	//   49   99:ireturn         
	}

	public double getDouble(int i)
	{
		Object obj = array.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #94  <Method Object ArrayList.get(int)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       46
		{
			obj = ((Object) (new StringBuilder()));
	//    7   13:new             #97  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #98  <Method void StringBuilder()>
	//   10   20:astore_2        
			((StringBuilder) (obj)).append("GSArray does not contain a value at index ");
	//   11   21:aload_2         
	//   12   22:ldc1            #13  <String "GSArray does not contain a value at index ">
	//   13   24:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			((StringBuilder) (obj)).append(i);
	//   15   28:aload_2         
	//   16   29:iload_1         
	//   17   30:invokevirtual   #105 <Method StringBuilder StringBuilder.append(int)>
	//   18   33:pop             
			throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   19   34:new             #107 <Class NullPointerException>
	//   20   37:dup             
	//   21   38:aload_2         
	//   22   39:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   23   42:invokespecial   #112 <Method void NullPointerException(String)>
	//   24   45:athrow          
		}
		if(obj.getClass().isAssignableFrom(Double.TYPE))
	//*  25   46:aload_2         
	//*  26   47:invokevirtual   #54  <Method Class Object.getClass()>
	//*  27   50:getstatic       #139 <Field Class Double.TYPE>
	//*  28   53:invokevirtual   #118 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   56:ifeq            67
			return ((Double)obj).doubleValue();
	//   30   59:aload_2         
	//   31   60:checkcast       #67  <Class Double>
	//   32   63:invokevirtual   #143 <Method double Double.doubleValue()>
	//   33   66:dreturn         
		else
			return Double.parseDouble(getString(i));
	//   34   67:aload_0         
	//   35   68:iload_1         
	//   36   69:invokevirtual   #147 <Method String getString(int)>
	//   37   72:invokestatic    #151 <Method double Double.parseDouble(String)>
	//   38   75:dreturn         
	}

	public int getInt(int i)
	{
		Object obj = array.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #94  <Method Object ArrayList.get(int)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       46
		{
			obj = ((Object) (new StringBuilder()));
	//    7   13:new             #97  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #98  <Method void StringBuilder()>
	//   10   20:astore_2        
			((StringBuilder) (obj)).append("GSArray does not contain a value at index ");
	//   11   21:aload_2         
	//   12   22:ldc1            #13  <String "GSArray does not contain a value at index ">
	//   13   24:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			((StringBuilder) (obj)).append(i);
	//   15   28:aload_2         
	//   16   29:iload_1         
	//   17   30:invokevirtual   #105 <Method StringBuilder StringBuilder.append(int)>
	//   18   33:pop             
			throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   19   34:new             #107 <Class NullPointerException>
	//   20   37:dup             
	//   21   38:aload_2         
	//   22   39:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   23   42:invokespecial   #112 <Method void NullPointerException(String)>
	//   24   45:athrow          
		}
		if(obj.getClass().isAssignableFrom(Integer.TYPE))
	//*  25   46:aload_2         
	//*  26   47:invokevirtual   #54  <Method Class Object.getClass()>
	//*  27   50:getstatic       #154 <Field Class Integer.TYPE>
	//*  28   53:invokevirtual   #118 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   56:ifeq            67
			return ((Integer)obj).intValue();
	//   30   59:aload_2         
	//   31   60:checkcast       #74  <Class Integer>
	//   32   63:invokevirtual   #157 <Method int Integer.intValue()>
	//   33   66:ireturn         
		else
			return Integer.parseInt(getString(i));
	//   34   67:aload_0         
	//   35   68:iload_1         
	//   36   69:invokevirtual   #147 <Method String getString(int)>
	//   37   72:invokestatic    #161 <Method int Integer.parseInt(String)>
	//   38   75:ireturn         
	}

	public long getLong(int i)
	{
		Object obj = array.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #94  <Method Object ArrayList.get(int)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       46
		{
			obj = ((Object) (new StringBuilder()));
	//    7   13:new             #97  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #98  <Method void StringBuilder()>
	//   10   20:astore_2        
			((StringBuilder) (obj)).append("GSArray does not contain a value at index ");
	//   11   21:aload_2         
	//   12   22:ldc1            #13  <String "GSArray does not contain a value at index ">
	//   13   24:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			((StringBuilder) (obj)).append(i);
	//   15   28:aload_2         
	//   16   29:iload_1         
	//   17   30:invokevirtual   #105 <Method StringBuilder StringBuilder.append(int)>
	//   18   33:pop             
			throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   19   34:new             #107 <Class NullPointerException>
	//   20   37:dup             
	//   21   38:aload_2         
	//   22   39:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   23   42:invokespecial   #112 <Method void NullPointerException(String)>
	//   24   45:athrow          
		}
		if(obj.getClass().isAssignableFrom(Long.TYPE))
	//*  25   46:aload_2         
	//*  26   47:invokevirtual   #54  <Method Class Object.getClass()>
	//*  27   50:getstatic       #164 <Field Class Long.TYPE>
	//*  28   53:invokevirtual   #118 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   56:ifeq            67
			return ((Long)obj).longValue();
	//   30   59:aload_2         
	//   31   60:checkcast       #80  <Class Long>
	//   32   63:invokevirtual   #168 <Method long Long.longValue()>
	//   33   66:lreturn         
		else
			return Long.parseLong(getString(i));
	//   34   67:aload_0         
	//   35   68:iload_1         
	//   36   69:invokevirtual   #147 <Method String getString(int)>
	//   37   72:invokestatic    #172 <Method long Long.parseLong(String)>
	//   38   75:lreturn         
	}

	public GSObject getObject(int i)
	{
		Object obj = array.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #94  <Method Object ArrayList.get(int)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return (GSObject)obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #61  <Class GSObject>
	//   11   19:areturn         
	}

	public String getString(int i)
	{
		Object obj = array.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #94  <Method Object ArrayList.get(int)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return obj.toString();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #123 <Method String Object.toString()>
	//   11   19:areturn         
	}

	protected ArrayList getUnderlingArray()
	{
		return array;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:areturn         
	}

	public Iterator iterator()
	{
		return array.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:invokevirtual   #182 <Method Iterator ArrayList.iterator()>
	//    3    7:areturn         
	}

	public int length()
	{
		return array.size();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ArrayList array>
	//    2    4:invokevirtual   #186 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	protected JSONArray toJsonArray()
	{
		JSONArray jsonarray;
		Iterator iterator1;
		jsonarray = new JSONArray();
	//    0    0:new             #29  <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #191 <Method void JSONArray()>
	//    3    7:astore_3        
		iterator1 = array.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field ArrayList array>
	//    6   12:invokevirtual   #182 <Method Iterator ArrayList.iterator()>
	//    7   15:astore          4
_L9:
		if(!iterator1.hasNext()) goto _L2; else goto _L1
	//    8   17:aload           4
	//    9   19:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            98
_L1:
		Object obj1 = iterator1.next();
	//   11   27:aload           4
	//   12   29:invokeinterface #200 <Method Object Iterator.next()>
	//   13   34:astore_2        
		if(obj1 != null) goto _L4; else goto _L3
	//   14   35:aload_2         
	//   15   36:ifnonnull       50
_L3:
		Object obj = obj1;
	//   16   39:aload_2         
	//   17   40:astore_1        
_L7:
		jsonarray.put(obj);
	//   18   41:aload_3         
	//   19   42:aload_1         
	//   20   43:invokevirtual   #204 <Method JSONArray JSONArray.put(Object)>
	//   21   46:pop             
		  goto _L5
	//*  22   47:goto            17
_L4:
		Class class1;
		class1 = obj1.getClass();
	//   23   50:aload_2         
	//   24   51:invokevirtual   #54  <Method Class Object.getClass()>
	//   25   54:astore          5
		if(class1 != com/gigya/socialize/GSObject)
			break; /* Loop/switch isn't completed */
	//   26   56:aload           5
	//   27   58:ldc1            #61  <Class GSObject>
	//   28   60:if_acmpne       74
		obj = ((Object) (((GSObject)obj1).toJsonObject()));
	//   29   63:aload_2         
	//   30   64:checkcast       #61  <Class GSObject>
	//   31   67:invokevirtual   #208 <Method JSONObject GSObject.toJsonObject()>
	//   32   70:astore_1        
		if(true) goto _L7; else goto _L6
	//   33   71:goto            41
_L6:
		obj = obj1;
	//   34   74:aload_2         
	//   35   75:astore_1        
		if(class1 != com/gigya/socialize/GSArray) goto _L7; else goto _L8
	//   36   76:aload           5
	//   37   78:ldc1            #2   <Class GSArray>
	//   38   80:if_acmpne       41
_L8:
		try
		{
			jsonarray.put(((Object) (((GSArray)obj1).toJsonArray())));
	//   39   83:aload_3         
	//   40   84:aload_2         
	//   41   85:checkcast       #2   <Class GSArray>
	//   42   88:invokevirtual   #210 <Method JSONArray toJsonArray()>
	//   43   91:invokevirtual   #204 <Method JSONArray JSONArray.put(Object)>
	//   44   94:pop             
		}
	//*  45   95:goto            17
	//*  46   98:aload_3         
	//*  47   99:areturn         
		catch(Exception exception) { }
	//   48  100:astore_1        
_L5:
		if(true) goto _L9; else goto _L2
	//   49  101:goto            17
_L2:
		return jsonarray;
	}

	public String toJsonString()
	{
		String s;
		try
		{
			s = toJsonArray().toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #210 <Method JSONArray toJsonArray()>
	//    2    4:invokevirtual   #212 <Method String JSONArray.toString()>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(Exception exception)
	//*   6   10:astore_1        
		{
			exception.printStackTrace();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #215 <Method void Exception.printStackTrace()>
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		}
		return s;
	}

	public String toString()
	{
		return toJsonString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method String toJsonString()>
	//    2    4:areturn         
	}

	private static final String NO_INDEX_EX = "GSArray does not contain a value at index ";
	private ArrayList array;
}
