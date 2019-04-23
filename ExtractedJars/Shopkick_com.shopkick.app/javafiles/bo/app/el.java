// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			eh, ey, dt, r, 
//			dl, fc, fb

public class el
	implements eh
{

	el(ey ey1, String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		b = ey1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field ey b>
		c = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field String c>
		d = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #38  <Field int d>
	//   11   19:return          
	}

	protected el(JSONObject jsonobject)
	{
		this((ey)dt.a(jsonobject, "property_type", bo/app/ey, ((Enum) (ey.e))), jsonobject.getString("property_key"), jsonobject.getInt("comparator"));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #41  <String "property_type">
	//    3    4:ldc1            #43  <Class ey>
	//    4    6:getstatic       #45  <Field ey ey.e>
	//    5    9:invokestatic    #50  <Method Enum dt.a(JSONObject, String, Class, Enum)>
	//    6   12:checkcast       #43  <Class ey>
	//    7   15:aload_1         
	//    8   16:ldc1            #52  <String "property_key">
	//    9   18:invokevirtual   #58  <Method String JSONObject.getString(String)>
	//   10   21:aload_1         
	//   11   22:ldc1            #60  <String "comparator">
	//   12   24:invokevirtual   #64  <Method int JSONObject.getInt(String)>
	//   13   27:invokespecial   #66  <Method void el(ey, String, int)>
		if(jsonobject.has("property_value"))
	//*  14   30:aload_1         
	//*  15   31:ldc1            #68  <String "property_value">
	//*  16   33:invokevirtual   #72  <Method boolean JSONObject.has(String)>
	//*  17   36:ifeq            143
		{
			if(b.equals(((Object) (ey.a))))
	//*  18   39:aload_0         
	//*  19   40:getfield        #34  <Field ey b>
	//*  20   43:getstatic       #74  <Field ey ey.a>
	//*  21   46:invokevirtual   #78  <Method boolean ey.equals(Object)>
	//*  22   49:ifeq            63
			{
				e = ((Object) (jsonobject.getString("property_value")));
	//   23   52:aload_0         
	//   24   53:aload_1         
	//   25   54:ldc1            #68  <String "property_value">
	//   26   56:invokevirtual   #58  <Method String JSONObject.getString(String)>
	//   27   59:putfield        #80  <Field Object e>
				return;
	//   28   62:return          
			}
			if(b.equals(((Object) (ey.d))))
	//*  29   63:aload_0         
	//*  30   64:getfield        #34  <Field ey b>
	//*  31   67:getstatic       #82  <Field ey ey.d>
	//*  32   70:invokevirtual   #78  <Method boolean ey.equals(Object)>
	//*  33   73:ifeq            90
			{
				e = ((Object) (Boolean.valueOf(jsonobject.getBoolean("property_value"))));
	//   34   76:aload_0         
	//   35   77:aload_1         
	//   36   78:ldc1            #68  <String "property_value">
	//   37   80:invokevirtual   #85  <Method boolean JSONObject.getBoolean(String)>
	//   38   83:invokestatic    #91  <Method Boolean Boolean.valueOf(boolean)>
	//   39   86:putfield        #80  <Field Object e>
				return;
	//   40   89:return          
			}
			if(b.equals(((Object) (ey.c))))
	//*  41   90:aload_0         
	//*  42   91:getfield        #34  <Field ey b>
	//*  43   94:getstatic       #93  <Field ey ey.c>
	//*  44   97:invokevirtual   #78  <Method boolean ey.equals(Object)>
	//*  45  100:ifeq            117
			{
				e = ((Object) (Double.valueOf(jsonobject.getDouble("property_value"))));
	//   46  103:aload_0         
	//   47  104:aload_1         
	//   48  105:ldc1            #68  <String "property_value">
	//   49  107:invokevirtual   #97  <Method double JSONObject.getDouble(String)>
	//   50  110:invokestatic    #102 <Method Double Double.valueOf(double)>
	//   51  113:putfield        #80  <Field Object e>
				return;
	//   52  116:return          
			}
			if(b.equals(((Object) (ey.b))))
	//*  53  117:aload_0         
	//*  54  118:getfield        #34  <Field ey b>
	//*  55  121:getstatic       #103 <Field ey ey.b>
	//*  56  124:invokevirtual   #78  <Method boolean ey.equals(Object)>
	//*  57  127:ifeq            143
				e = ((Object) (Long.valueOf(jsonobject.getLong("property_value"))));
	//   58  130:aload_0         
	//   59  131:aload_1         
	//   60  132:ldc1            #68  <String "property_value">
	//   61  134:invokevirtual   #107 <Method long JSONObject.getLong(String)>
	//   62  137:invokestatic    #112 <Method Long Long.valueOf(long)>
	//   63  140:putfield        #80  <Field Object e>
		}
	//   64  143:return          
	}

	private boolean a(Object obj)
	{
		if(!(obj instanceof Integer) && !(obj instanceof Double))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #114 <Class Integer>
	//*   2    4:ifne            26
	//*   3    7:aload_1         
	//*   4    8:instanceof      #99  <Class Double>
	//*   5   11:ifne            26
			return d == 2;
	//    6   14:aload_0         
	//    7   15:getfield        #38  <Field int d>
	//    8   18:iconst_2        
	//    9   19:icmpne          24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
		double d1 = ((Number)obj).doubleValue();
	//   14   26:aload_1         
	//   15   27:checkcast       #116 <Class Number>
	//   16   30:invokevirtual   #120 <Method double Number.doubleValue()>
	//   17   33:dstore_2        
		double d2 = ((Number)e).doubleValue();
	//   18   34:aload_0         
	//   19   35:getfield        #80  <Field Object e>
	//   20   38:checkcast       #116 <Class Number>
	//   21   41:invokevirtual   #120 <Method double Number.doubleValue()>
	//   22   44:dstore          4
		int i = d;
	//   23   46:aload_0         
	//   24   47:getfield        #38  <Field int d>
	//   25   50:istore          6
		if(i != 5)
	//*  26   52:iload           6
	//*  27   54:iconst_5        
	//*  28   55:icmpeq          123
		{
			switch(i)
	//*  29   58:iload           6
			{
	//*  30   60:tableswitch     1 3: default 88
	//	               1 112
	//	               2 101
	//	               3 90
			default:
				return false;
	//   31   88:iconst_0        
	//   32   89:ireturn         

			case 3: // '\003'
				return d1 > d2;
	//   33   90:dload_2         
	//   34   91:dload           4
	//   35   93:dcmpl           
	//   36   94:ifle            99
	//   37   97:iconst_1        
	//   38   98:ireturn         
	//   39   99:iconst_0        
	//   40  100:ireturn         

			case 2: // '\002'
				return d1 != d2;
	//   41  101:dload_2         
	//   42  102:dload           4
	//   43  104:dcmpl           
	//   44  105:ifeq            110
	//   45  108:iconst_1        
	//   46  109:ireturn         
	//   47  110:iconst_0        
	//   48  111:ireturn         

			case 1: // '\001'
				break;
			}
			return d1 == d2;
	//   49  112:dload_2         
	//   50  113:dload           4
	//   51  115:dcmpl           
	//   52  116:ifne            121
	//   53  119:iconst_1        
	//   54  120:ireturn         
	//   55  121:iconst_0        
	//   56  122:ireturn         
		}
		return d1 < d2;
	//   57  123:dload_2         
	//   58  124:dload           4
	//   59  126:dcmpg           
	//   60  127:ifge            132
	//   61  130:iconst_1        
	//   62  131:ireturn         
	//   63  132:iconst_0        
	//   64  133:ireturn         
	}

	private boolean a(Object obj, long l)
	{
		if(obj instanceof String)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #123 <Class String>
	//*   2    4:ifeq            21
			obj = ((Object) (dl.a((String)obj, r.b)));
	//    3    7:aload_1         
	//    4    8:checkcast       #123 <Class String>
	//    5   11:getstatic       #128 <Field r r.b>
	//    6   14:invokestatic    #133 <Method java.util.Date dl.a(String, r)>
	//    7   17:astore_1        
		else
	//*   8   18:goto            23
			obj = null;
	//    9   21:aconst_null     
	//   10   22:astore_1        
		if(obj == null)
	//*  11   23:aload_1         
	//*  12   24:ifnonnull       39
			return d == 2;
	//   13   27:aload_0         
	//   14   28:getfield        #38  <Field int d>
	//   15   31:iconst_2        
	//   16   32:icmpne          37
	//   17   35:iconst_1        
	//   18   36:ireturn         
	//   19   37:iconst_0        
	//   20   38:ireturn         
		long l1 = dl.a(((java.util.Date) (obj)));
	//   21   39:aload_1         
	//   22   40:invokestatic    #136 <Method long dl.a(java.util.Date)>
	//   23   43:lstore          5
		long l2 = ((Number)e).longValue();
	//   24   45:aload_0         
	//   25   46:getfield        #80  <Field Object e>
	//   26   49:checkcast       #116 <Class Number>
	//   27   52:invokevirtual   #140 <Method long Number.longValue()>
	//   28   55:lstore          7
		int i = d;
	//   29   57:aload_0         
	//   30   58:getfield        #38  <Field int d>
	//   31   61:istore          4
		switch(i)
	//*  32   63:iload           4
		{
	//*  33   65:tableswitch     1 6: default 104
	//	               1 222
	//	               2 210
	//	               3 198
	//	               4 184
	//	               5 172
	//	               6 158
		default:
			switch(i)
	//*  34  104:iload           4
			{
	//*  35  106:tableswitch     15 16: default 128
	//	               15 144
	//	               16 130
			default:
				return false;
	//   36  128:iconst_0        
	//   37  129:ireturn         

			case 16: // '\020'
				return l1 > l + l2;
	//   38  130:lload           5
	//   39  132:lload_2         
	//   40  133:lload           7
	//   41  135:ladd            
	//   42  136:lcmp            
	//   43  137:ifle            142
	//   44  140:iconst_1        
	//   45  141:ireturn         
	//   46  142:iconst_0        
	//   47  143:ireturn         

			case 15: // '\017'
				break;
			}
			return l1 < l + l2;
	//   48  144:lload           5
	//   49  146:lload_2         
	//   50  147:lload           7
	//   51  149:ladd            
	//   52  150:lcmp            
	//   53  151:ifge            156
	//   54  154:iconst_1        
	//   55  155:ireturn         
	//   56  156:iconst_0        
	//   57  157:ireturn         

		case 6: // '\006'
			return l1 <= l - l2;
	//   58  158:lload           5
	//   59  160:lload_2         
	//   60  161:lload           7
	//   61  163:lsub            
	//   62  164:lcmp            
	//   63  165:ifgt            170
	//   64  168:iconst_1        
	//   65  169:ireturn         
	//   66  170:iconst_0        
	//   67  171:ireturn         

		case 5: // '\005'
			return l1 < l2;
	//   68  172:lload           5
	//   69  174:lload           7
	//   70  176:lcmp            
	//   71  177:ifge            182
	//   72  180:iconst_1        
	//   73  181:ireturn         
	//   74  182:iconst_0        
	//   75  183:ireturn         

		case 4: // '\004'
			return l1 >= l - l2;
	//   76  184:lload           5
	//   77  186:lload_2         
	//   78  187:lload           7
	//   79  189:lsub            
	//   80  190:lcmp            
	//   81  191:iflt            196
	//   82  194:iconst_1        
	//   83  195:ireturn         
	//   84  196:iconst_0        
	//   85  197:ireturn         

		case 3: // '\003'
			return l1 > l2;
	//   86  198:lload           5
	//   87  200:lload           7
	//   88  202:lcmp            
	//   89  203:ifle            208
	//   90  206:iconst_1        
	//   91  207:ireturn         
	//   92  208:iconst_0        
	//   93  209:ireturn         

		case 2: // '\002'
			return l1 != l2;
	//   94  210:lload           5
	//   95  212:lload           7
	//   96  214:lcmp            
	//   97  215:ifeq            220
	//   98  218:iconst_1        
	//   99  219:ireturn         
	//  100  220:iconst_0        
	//  101  221:ireturn         

		case 1: // '\001'
			break;
		}
		return l1 == l2;
	//  102  222:lload           5
	//  103  224:lload           7
	//  104  226:lcmp            
	//  105  227:ifne            232
	//  106  230:iconst_1        
	//  107  231:ireturn         
	//  108  232:iconst_0        
	//  109  233:ireturn         
	}

	private boolean b(Object obj)
	{
		if(!(obj instanceof Boolean))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #87  <Class Boolean>
	//*   2    4:ifne            19
			return d == 2;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field int d>
	//    5   11:iconst_2        
	//    6   12:icmpne          17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
		switch(d)
	//*  11   19:aload_0         
	//*  12   20:getfield        #38  <Field int d>
		{
	//*  13   23:tableswitch     1 2: default 44
	//	               1 57
	//	               2 46
		default:
			return false;
	//   14   44:iconst_0        
	//   15   45:ireturn         

		case 2: // '\002'
			return obj.equals(e) ^ true;
	//   16   46:aload_1         
	//   17   47:aload_0         
	//   18   48:getfield        #80  <Field Object e>
	//   19   51:invokevirtual   #141 <Method boolean Object.equals(Object)>
	//   20   54:iconst_1        
	//   21   55:ixor            
	//   22   56:ireturn         

		case 1: // '\001'
			return obj.equals(e);
	//   23   57:aload_1         
	//   24   58:aload_0         
	//   25   59:getfield        #80  <Field Object e>
	//   26   62:invokevirtual   #141 <Method boolean Object.equals(Object)>
	//   27   65:ireturn         
		}
	}

	private boolean c(Object obj)
	{
		boolean flag1 = obj instanceof String;
	//    0    0:aload_1         
	//    1    1:instanceof      #123 <Class String>
	//    2    4:istore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(!flag1)
	//*   5    8:iload           4
	//*   6   10:ifne            33
		{
			int i = d;
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field int d>
	//    9   17:istore_2        
			if(i == 2 || i == 17)
	//*  10   18:iload_2         
	//*  11   19:iconst_2        
	//*  12   20:icmpeq          29
	//*  13   23:iload_2         
	//*  14   24:bipush          17
	//*  15   26:icmpne          31
				flag = true;
	//   16   29:iconst_1        
	//   17   30:istore_3        
			return flag;
	//   18   31:iload_3         
	//   19   32:ireturn         
		}
		int j = d;
	//   20   33:aload_0         
	//   21   34:getfield        #38  <Field int d>
	//   22   37:istore_2        
		if(j != 10)
	//*  23   38:iload_2         
	//*  24   39:bipush          10
	//*  25   41:icmpeq          111
		{
			if(j != 17)
	//*  26   44:iload_2         
	//*  27   45:bipush          17
	//*  28   47:icmpeq          94
				switch(j)
	//*  29   50:iload_2         
				{
	//*  30   51:tableswitch     1 2: default 72
	//	               1 85
	//	               2 74
				default:
					return false;
	//   31   72:iconst_0        
	//   32   73:ireturn         

				case 2: // '\002'
					return obj.equals(e) ^ true;
	//   33   74:aload_1         
	//   34   75:aload_0         
	//   35   76:getfield        #80  <Field Object e>
	//   36   79:invokevirtual   #141 <Method boolean Object.equals(Object)>
	//   37   82:iconst_1        
	//   38   83:ixor            
	//   39   84:ireturn         

				case 1: // '\001'
					return obj.equals(e);
	//   40   85:aload_1         
	//   41   86:aload_0         
	//   42   87:getfield        #80  <Field Object e>
	//   43   90:invokevirtual   #141 <Method boolean Object.equals(Object)>
	//   44   93:ireturn         
				}
			else
				return ((String)obj).matches((String)e) ^ true;
	//   45   94:aload_1         
	//   46   95:checkcast       #123 <Class String>
	//   47   98:aload_0         
	//   48   99:getfield        #80  <Field Object e>
	//   49  102:checkcast       #123 <Class String>
	//   50  105:invokevirtual   #144 <Method boolean String.matches(String)>
	//   51  108:iconst_1        
	//   52  109:ixor            
	//   53  110:ireturn         
		} else
		{
			return ((String)obj).matches((String)e);
	//   54  111:aload_1         
	//   55  112:checkcast       #123 <Class String>
	//   56  115:aload_0         
	//   57  116:getfield        #80  <Field Object e>
	//   58  119:checkcast       #123 <Class String>
	//   59  122:invokevirtual   #144 <Method boolean String.matches(String)>
	//   60  125:ireturn         
		}
	}

	public JSONObject a()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #54  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #148 <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			if(!b.equals(((Object) (ey.e))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #34  <Field ey b>
	//*   6   12:getstatic       #45  <Field ey ey.e>
	//*   7   15:invokevirtual   #78  <Method boolean ey.equals(Object)>
	//*   8   18:ifne            35
				jsonobject.put("property_type", ((Object) (b.toString())));
	//    9   21:aload_1         
	//   10   22:ldc1            #41  <String "property_type">
	//   11   24:aload_0         
	//   12   25:getfield        #34  <Field ey b>
	//   13   28:invokevirtual   #152 <Method String ey.toString()>
	//   14   31:invokevirtual   #156 <Method JSONObject JSONObject.put(String, Object)>
	//   15   34:pop             
			jsonobject.put("property_key", ((Object) (c)));
	//   16   35:aload_1         
	//   17   36:ldc1            #52  <String "property_key">
	//   18   38:aload_0         
	//   19   39:getfield        #36  <Field String c>
	//   20   42:invokevirtual   #156 <Method JSONObject JSONObject.put(String, Object)>
	//   21   45:pop             
			jsonobject.put("comparator", d);
	//   22   46:aload_1         
	//   23   47:ldc1            #60  <String "comparator">
	//   24   49:aload_0         
	//   25   50:getfield        #38  <Field int d>
	//   26   53:invokevirtual   #159 <Method JSONObject JSONObject.put(String, int)>
	//   27   56:pop             
			jsonobject.put("property_value", e);
	//   28   57:aload_1         
	//   29   58:ldc1            #68  <String "property_value">
	//   30   60:aload_0         
	//   31   61:getfield        #80  <Field Object e>
	//   32   64:invokevirtual   #156 <Method JSONObject JSONObject.put(String, Object)>
	//   33   67:pop             
		}
	//*  34   68:aload_1         
	//*  35   69:areturn         
		catch(JSONException jsonexception)
	//*  36   70:astore_2        
		{
			AppboyLogger.e(a, "Caught exception creating property filter Json.", ((Throwable) (jsonexception)));
	//   37   71:getstatic       #27  <Field String a>
	//   38   74:ldc1            #161 <String "Caught exception creating property filter Json.">
	//   39   76:aload_2         
	//   40   77:invokestatic    #164 <Method int AppboyLogger.e(String, String, Throwable)>
	//   41   80:pop             
			return jsonobject;
	//   42   81:aload_1         
	//   43   82:areturn         
		}
		return jsonobject;
	}

	public boolean a(fb fb1)
	{
		boolean flag;
		if(!(fb1 instanceof fc))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #169 <Class fc>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		AppboyProperties appboyproperties = ((fc)fb1).f();
	//    5    9:aload_1         
	//    6   10:checkcast       #169 <Class fc>
	//    7   13:invokeinterface #173 <Method AppboyProperties fc.f()>
	//    8   18:astore          5
		Object obj = null;
	//    9   20:aconst_null     
	//   10   21:astore          4
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[ey.values().length];
			//    0    0:invokestatic    #18  <Method ey[] ey.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[ey.a.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #23  <Field ey ey.a>
			//    6   15:invokevirtual   #27  <Method int ey.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #30  <Field ey ey.d>
			//*  11   26:invokevirtual   #27  <Method int ey.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #33  <Field ey ey.b>
			//*  16   37:invokevirtual   #27  <Method int ey.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] a>
			//*  20   45:getstatic       #36  <Field ey ey.c>
			//*  21   48:invokevirtual   #27  <Method int ey.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					a[ey.d.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					a[ey.b.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					a[ey.c.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		boolean flag1;
		if(appboyproperties != null)
	//*  11   23:aload           5
	//*  12   25:ifnull          45
			try
			{
				obj = appboyproperties.forJsonPut().opt(c);
	//   13   28:aload           5
	//   14   30:invokevirtual   #178 <Method JSONObject AppboyProperties.forJsonPut()>
	//   15   33:aload_0         
	//   16   34:getfield        #36  <Field String c>
	//   17   37:invokevirtual   #182 <Method Object JSONObject.opt(String)>
	//   18   40:astore          4
			}
	//*  19   42:goto            45
	//*  20   45:iconst_1        
	//*  21   46:istore_3        
	//*  22   47:aload           4
	//*  23   49:ifnonnull       84
	//*  24   52:iload_3         
	//*  25   53:istore_2        
	//*  26   54:aload_0         
	//*  27   55:getfield        #38  <Field int d>
	//*  28   58:bipush          12
	//*  29   60:icmpeq          202
	//*  30   63:iload_3         
	//*  31   64:istore_2        
	//*  32   65:aload_0         
	//*  33   66:getfield        #38  <Field int d>
	//*  34   69:bipush          17
	//*  35   71:icmpeq          202
	//*  36   74:aload_0         
	//*  37   75:getfield        #38  <Field int d>
	//*  38   78:iconst_2        
	//*  39   79:icmpne          200
	//*  40   82:iconst_1        
	//*  41   83:ireturn         
	//*  42   84:aload_0         
	//*  43   85:getfield        #38  <Field int d>
	//*  44   88:bipush          11
	//*  45   90:icmpne          95
	//*  46   93:iconst_1        
	//*  47   94:ireturn         
	//*  48   95:aload_0         
	//*  49   96:getfield        #38  <Field int d>
	//*  50   99:bipush          12
	//*  51  101:icmpne          106
	//*  52  104:iconst_0        
	//*  53  105:ireturn         
	//*  54  106:getstatic       #185 <Field int[] el$1.a>
	//*  55  109:aload_0         
	//*  56  110:getfield        #34  <Field ey b>
	//*  57  113:invokevirtual   #189 <Method int ey.ordinal()>
	//*  58  116:iaload          
	//*  59  117:tableswitch     1 4: default 204
	//	               1 175
	//	               2 168
	//	               3 155
	//	               4 148
	//*  60  148:aload_0         
	//*  61  149:aload           4
	//*  62  151:invokespecial   #191 <Method boolean a(Object)>
	//*  63  154:ireturn         
	//*  64  155:aload_0         
	//*  65  156:aload           4
	//*  66  158:aload_1         
	//*  67  159:invokeinterface #195 <Method long fb.c()>
	//*  68  164:invokespecial   #197 <Method boolean a(Object, long)>
	//*  69  167:ireturn         
	//*  70  168:aload_0         
	//*  71  169:aload           4
	//*  72  171:invokespecial   #199 <Method boolean b(Object)>
	//*  73  174:ireturn         
	//*  74  175:aload_0         
	//*  75  176:aload           4
	//*  76  178:invokespecial   #201 <Method boolean c(Object)>
	//*  77  181:istore_2        
	//*  78  182:iload_2         
	//*  79  183:ireturn         
	//*  80  184:getstatic       #27  <Field String a>
	//*  81  187:ldc1            #203 <String "Caught exception checking property filter condition.">
	//*  82  189:aload_1         
	//*  83  190:invokestatic    #164 <Method int AppboyLogger.e(String, String, Throwable)>
	//*  84  193:pop             
	//*  85  194:iconst_0        
	//*  86  195:ireturn         
			// Misplaced declaration of an exception variable
			catch(fb fb1)
			{
				AppboyLogger.e(a, "Caught exception checking property filter condition.", ((Throwable) (fb1)));
				return false;
			}
		flag1 = true;
		if(obj != null) goto _L2; else goto _L1
_L1:
		flag = flag1;
		if(d == 12) goto _L4; else goto _L3
_L3:
		flag = flag1;
		if(d != 17)
		{
			if(d == 2)
				return true;
	//*  87  196:astore_1        
	//*  88  197:goto            184
			flag = false;
	//   89  200:iconst_0        
	//   90  201:istore_2        
		}
		  goto _L4
_L2:
		if(d == 11)
			return true;
		if(d == 12)
			return false;
		_cls1.a[b.ordinal()];
		JVM INSTR tableswitch 1 4: default 204
	//	               1 175
	//	               2 168
	//	               3 155
	//	               4 148;
		   goto _L5 _L6 _L7 _L8 _L9
_L9:
		return a(obj);
_L8:
		return a(obj, fb1.c());
_L7:
		return b(obj);
_L6:
		flag = c(obj);
		return flag;
_L4:
		return flag;
	//   91  202:iload_2         
	//   92  203:ireturn         
_L5:
		return false;
	//   93  204:iconst_0        
	//   94  205:ireturn         
	}

	public Object forJsonPut()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #206 <Method JSONObject a()>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/el);
	private ey b;
	private String c;
	private int d;
	private Object e;

	static 
	{
	//    0    0:ldc1            #2   <Class el>
	//    1    2:invokestatic    #25  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #27  <Field String a>
	//*   3    8:return          
	}
}
