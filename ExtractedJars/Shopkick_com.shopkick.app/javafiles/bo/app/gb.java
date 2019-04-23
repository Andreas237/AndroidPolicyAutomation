// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ga, fy, fx, gd

public class gb extends ga
{

	public gb(fx fx1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ga()>
		a = fx1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field fx a>
	//    5    9:return          
	}

	public void a(String s, Object obj, Object obj1, fy fy1)
	{
		if((obj instanceof Number) && (obj1 instanceof Number))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #17  <Class Number>
	//*   2    4:ifeq            42
	//*   3    7:aload_3         
	//*   4    8:instanceof      #17  <Class Number>
	//*   5   11:ifeq            42
		{
			if(((Number)obj).doubleValue() != ((Number)obj1).doubleValue())
	//*   6   14:aload_2         
	//*   7   15:checkcast       #17  <Class Number>
	//*   8   18:invokevirtual   #21  <Method double Number.doubleValue()>
	//*   9   21:aload_3         
	//*  10   22:checkcast       #17  <Class Number>
	//*  11   25:invokevirtual   #21  <Method double Number.doubleValue()>
	//*  12   28:dcmpl           
	//*  13   29:ifeq            129
			{
				fy1.a(s, obj, obj1);
	//   14   32:aload           4
	//   15   34:aload_1         
	//   16   35:aload_2         
	//   17   36:aload_3         
	//   18   37:invokevirtual   #26  <Method fy fy.a(String, Object, Object)>
	//   19   40:pop             
				return;
	//   20   41:return          
			}
		} else
		if(obj.getClass().isAssignableFrom(obj1.getClass()))
	//*  21   42:aload_2         
	//*  22   43:invokevirtual   #32  <Method Class Object.getClass()>
	//*  23   46:aload_3         
	//*  24   47:invokevirtual   #32  <Method Class Object.getClass()>
	//*  25   50:invokevirtual   #38  <Method boolean Class.isAssignableFrom(Class)>
	//*  26   53:ifeq            120
		{
			if(obj instanceof JSONArray)
	//*  27   56:aload_2         
	//*  28   57:instanceof      #40  <Class JSONArray>
	//*  29   60:ifeq            79
			{
				e(s, (JSONArray)obj, (JSONArray)obj1, fy1);
	//   30   63:aload_0         
	//   31   64:aload_1         
	//   32   65:aload_2         
	//   33   66:checkcast       #40  <Class JSONArray>
	//   34   69:aload_3         
	//   35   70:checkcast       #40  <Class JSONArray>
	//   36   73:aload           4
	//   37   75:invokevirtual   #44  <Method void e(String, JSONArray, JSONArray, fy)>
				return;
	//   38   78:return          
			}
			if(obj instanceof JSONObject)
	//*  39   79:aload_2         
	//*  40   80:instanceof      #46  <Class JSONObject>
	//*  41   83:ifeq            102
			{
				c(s, (JSONObject)obj, (JSONObject)obj1, fy1);
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:aload_2         
	//   45   89:checkcast       #46  <Class JSONObject>
	//   46   92:aload_3         
	//   47   93:checkcast       #46  <Class JSONObject>
	//   48   96:aload           4
	//   49   98:invokevirtual   #50  <Method void c(String, JSONObject, JSONObject, fy)>
				return;
	//   50  101:return          
			}
			if(!obj.equals(obj1))
	//*  51  102:aload_2         
	//*  52  103:aload_3         
	//*  53  104:invokevirtual   #54  <Method boolean Object.equals(Object)>
	//*  54  107:ifne            129
			{
				fy1.a(s, obj, obj1);
	//   55  110:aload           4
	//   56  112:aload_1         
	//   57  113:aload_2         
	//   58  114:aload_3         
	//   59  115:invokevirtual   #26  <Method fy fy.a(String, Object, Object)>
	//   60  118:pop             
				return;
	//   61  119:return          
			}
		} else
		{
			fy1.a(s, obj, obj1);
	//   62  120:aload           4
	//   63  122:aload_1         
	//   64  123:aload_2         
	//   65  124:aload_3         
	//   66  125:invokevirtual   #26  <Method fy fy.a(String, Object, Object)>
	//   67  128:pop             
		}
	//   68  129:return          
	}

	public void c(String s, JSONObject jsonobject, JSONObject jsonobject1, fy fy1)
	{
		b(s, jsonobject, jsonobject1, fy1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #57  <Method void b(String, JSONObject, JSONObject, fy)>
		if(!a.a())
	//*   6    9:aload_0         
	//*   7   10:getfield        #13  <Field fx a>
	//*   8   13:invokevirtual   #62  <Method boolean fx.a()>
	//*   9   16:ifne            28
			a(s, jsonobject, jsonobject1, fy1);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:aload_2         
	//   13   22:aload_3         
	//   14   23:aload           4
	//   15   25:invokevirtual   #64  <Method void a(String, JSONObject, JSONObject, fy)>
	//   16   28:return          
	}

	public void e(String s, JSONArray jsonarray, JSONArray jsonarray1, fy fy1)
	{
		if(jsonarray.length() != jsonarray1.length())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #68  <Method int JSONArray.length()>
	//*   2    4:aload_3         
	//*   3    5:invokevirtual   #68  <Method int JSONArray.length()>
	//*   4    8:icmpeq          74
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #70  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #71  <Method void StringBuilder()>
	//    8   18:astore          5
			stringbuilder.append(s);
	//    9   20:aload           5
	//   10   22:aload_1         
	//   11   23:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
			stringbuilder.append("[]: Expected ");
	//   13   27:aload           5
	//   14   29:ldc1            #77  <String "[]: Expected ">
	//   15   31:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
			stringbuilder.append(jsonarray.length());
	//   17   35:aload           5
	//   18   37:aload_2         
	//   19   38:invokevirtual   #68  <Method int JSONArray.length()>
	//   20   41:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   21   44:pop             
			stringbuilder.append(" values but got ");
	//   22   45:aload           5
	//   23   47:ldc1            #82  <String " values but got ">
	//   24   49:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
			stringbuilder.append(jsonarray1.length());
	//   26   53:aload           5
	//   27   55:aload_3         
	//   28   56:invokevirtual   #68  <Method int JSONArray.length()>
	//   29   59:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   30   62:pop             
			fy1.a(stringbuilder.toString());
	//   31   63:aload           4
	//   32   65:aload           5
	//   33   67:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   34   70:invokevirtual   #89  <Method void fy.a(String)>
			return;
	//   35   73:return          
		}
		if(jsonarray.length() == 0)
	//*  36   74:aload_2         
	//*  37   75:invokevirtual   #68  <Method int JSONArray.length()>
	//*  38   78:ifne            82
			return;
	//   39   81:return          
		if(a.b())
	//*  40   82:aload_0         
	//*  41   83:getfield        #13  <Field fx a>
	//*  42   86:invokevirtual   #91  <Method boolean fx.b()>
	//*  43   89:ifeq            102
		{
			c(s, jsonarray, jsonarray1, fy1);
	//   44   92:aload_0         
	//   45   93:aload_1         
	//   46   94:aload_2         
	//   47   95:aload_3         
	//   48   96:aload           4
	//   49   98:invokevirtual   #93  <Method void c(String, JSONArray, JSONArray, fy)>
			return;
	//   50  101:return          
		}
		if(gd.c(jsonarray))
	//*  51  102:aload_2         
	//*  52  103:invokestatic    #98  <Method boolean gd.c(JSONArray)>
	//*  53  106:ifeq            119
		{
			b(s, jsonarray, jsonarray1, fy1);
	//   54  109:aload_0         
	//   55  110:aload_1         
	//   56  111:aload_2         
	//   57  112:aload_3         
	//   58  113:aload           4
	//   59  115:invokevirtual   #100 <Method void b(String, JSONArray, JSONArray, fy)>
			return;
	//   60  118:return          
		}
		if(gd.d(jsonarray))
	//*  61  119:aload_2         
	//*  62  120:invokestatic    #103 <Method boolean gd.d(JSONArray)>
	//*  63  123:ifeq            136
		{
			a(s, jsonarray, jsonarray1, fy1);
	//   64  126:aload_0         
	//   65  127:aload_1         
	//   66  128:aload_2         
	//   67  129:aload_3         
	//   68  130:aload           4
	//   69  132:invokevirtual   #105 <Method void a(String, JSONArray, JSONArray, fy)>
			return;
	//   70  135:return          
		} else
		{
			d(s, jsonarray, jsonarray1, fy1);
	//   71  136:aload_0         
	//   72  137:aload_1         
	//   73  138:aload_2         
	//   74  139:aload_3         
	//   75  140:aload           4
	//   76  142:invokevirtual   #107 <Method void d(String, JSONArray, JSONArray, fy)>
			return;
	//   77  145:return          
		}
	}

	fx a;
}
