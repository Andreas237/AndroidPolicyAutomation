// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.*;
import java.lang.reflect.Method;
import java.util.*;

public abstract class FastJsonResponse
{

	public FastJsonResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	protected static Object a(Field field, Object obj)
	{
		if(Field.a(field) != null)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #16  <Method a FastJsonResponse$Field.a(FastJsonResponse$Field)>
	//*   2    4:ifnull          13
			return field.a(obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #19  <Method Object FastJsonResponse$Field.a(Object)>
	//    6   12:areturn         
		else
			return obj;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	private static void a(StringBuilder stringbuilder, Field field, Object obj)
	{
		if(field.a == 11)
	//*   0    0:aload_1         
	//*   1    1:getfield        #23  <Field int FastJsonResponse$Field.a>
	//*   2    4:bipush          11
	//*   3    6:icmpne          29
		{
			stringbuilder.append(((FastJsonResponse)field.g.cast(obj)).toString());
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:getfield        #27  <Field Class FastJsonResponse$Field.g>
	//    7   14:aload_2         
	//    8   15:invokevirtual   #32  <Method Object Class.cast(Object)>
	//    9   18:checkcast       #2   <Class FastJsonResponse>
	//   10   21:invokevirtual   #36  <Method String toString()>
	//   11   24:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
			return;
	//   13   28:return          
		}
		if(field.a == 7)
	//*  14   29:aload_1         
	//*  15   30:getfield        #23  <Field int FastJsonResponse$Field.a>
	//*  16   33:bipush          7
	//*  17   35:icmpne          65
		{
			stringbuilder.append("\"");
	//   18   38:aload_0         
	//   19   39:ldc1            #44  <String "\"">
	//   20   41:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			stringbuilder.append(l.a((String)obj));
	//   22   45:aload_0         
	//   23   46:aload_2         
	//   24   47:checkcast       #46  <Class String>
	//   25   50:invokestatic    #51  <Method String l.a(String)>
	//   26   53:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			stringbuilder.append("\"");
	//   28   57:aload_0         
	//   29   58:ldc1            #44  <String "\"">
	//   30   60:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			return;
	//   32   64:return          
		} else
		{
			stringbuilder.append(obj);
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//   36   70:pop             
			return;
	//   37   71:return          
		}
	}

	protected abstract Object a(String s);

	public abstract Map a();

	protected boolean a(Field field)
	{
		if(field.c == 11)
	//*   0    0:aload_1         
	//*   1    1:getfield        #60  <Field int com.google.android.gms.common.server.response.FastJsonResponse$Field.c>
	//*   2    4:bipush          11
	//*   3    6:icmpne          46
		{
			if(field.d)
	//*   4    9:aload_1         
	//*   5   10:getfield        #64  <Field boolean FastJsonResponse$Field.d>
	//*   6   13:ifeq            31
			{
				field = ((Field) (field.e));
	//    7   16:aload_1         
	//    8   17:getfield        #68  <Field String FastJsonResponse$Field.e>
	//    9   20:astore_1        
				throw new UnsupportedOperationException("Concrete type arrays not supported");
	//   10   21:new             #70  <Class UnsupportedOperationException>
	//   11   24:dup             
	//   12   25:ldc1            #72  <String "Concrete type arrays not supported">
	//   13   27:invokespecial   #75  <Method void UnsupportedOperationException(String)>
	//   14   30:athrow          
			} else
			{
				field = ((Field) (field.e));
	//   15   31:aload_1         
	//   16   32:getfield        #68  <Field String FastJsonResponse$Field.e>
	//   17   35:astore_1        
				throw new UnsupportedOperationException("Concrete types not supported");
	//   18   36:new             #70  <Class UnsupportedOperationException>
	//   19   39:dup             
	//   20   40:ldc1            #77  <String "Concrete types not supported">
	//   21   42:invokespecial   #75  <Method void UnsupportedOperationException(String)>
	//   22   45:athrow          
			}
		} else
		{
			return b(field.e);
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:getfield        #68  <Field String FastJsonResponse$Field.e>
	//   26   51:invokevirtual   #81  <Method boolean b(String)>
	//   27   54:ireturn         
		}
	}

	protected Object b(Field field)
	{
		Object obj = ((Object) (field.e));
	//    0    0:aload_1         
	//    1    1:getfield        #68  <Field String FastJsonResponse$Field.e>
	//    2    4:astore          4
		if(field.g != null)
	//*   3    6:aload_1         
	//*   4    7:getfield        #27  <Field Class FastJsonResponse$Field.g>
	//*   5   10:ifnull          149
		{
			boolean flag;
			if(a(field.e) == null)
	//*   6   13:aload_0         
	//*   7   14:aload_1         
	//*   8   15:getfield        #68  <Field String FastJsonResponse$Field.e>
	//*   9   18:invokevirtual   #86  <Method Object a(String)>
	//*  10   21:ifnonnull       29
				flag = true;
	//   11   24:iconst_1        
	//   12   25:istore_3        
			else
	//*  13   26:goto            31
				flag = false;
	//   14   29:iconst_0        
	//   15   30:istore_3        
			am.a(flag, "Concrete field shouldn't be value object: %s", new Object[] {
				field.e
			});
	//   16   31:iload_3         
	//   17   32:ldc1            #88  <String "Concrete field shouldn't be value object: %s">
	//   18   34:iconst_1        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:aload_1         
	//   23   41:getfield        #68  <Field String FastJsonResponse$Field.e>
	//   24   44:aastore         
	//   25   45:invokestatic    #93  <Method void am.a(boolean, String, Object[])>
			flag = field.d;
	//   26   48:aload_1         
	//   27   49:getfield        #64  <Field boolean FastJsonResponse$Field.d>
	//   28   52:istore_3        
			try
			{
				char c1 = Character.toUpperCase(((String) (obj)).charAt(0));
	//   29   53:aload           4
	//   30   55:iconst_0        
	//   31   56:invokevirtual   #97  <Method char String.charAt(int)>
	//   32   59:invokestatic    #103 <Method char Character.toUpperCase(char)>
	//   33   62:istore_2        
				field = ((Field) (((String) (obj)).substring(1)));
	//   34   63:aload           4
	//   35   65:iconst_1        
	//   36   66:invokevirtual   #107 <Method String String.substring(int)>
	//   37   69:astore_1        
				obj = ((Object) (new StringBuilder(String.valueOf(((Object) (field))).length() + 4)));
	//   38   70:new             #38  <Class StringBuilder>
	//   39   73:dup             
	//   40   74:aload_1         
	//   41   75:invokestatic    #111 <Method String String.valueOf(Object)>
	//   42   78:invokevirtual   #115 <Method int String.length()>
	//   43   81:iconst_4        
	//   44   82:iadd            
	//   45   83:invokespecial   #118 <Method void StringBuilder(int)>
	//   46   86:astore          4
				((StringBuilder) (obj)).append("get");
	//   47   88:aload           4
	//   48   90:ldc1            #120 <String "get">
	//   49   92:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   50   95:pop             
				((StringBuilder) (obj)).append(c1);
	//   51   96:aload           4
	//   52   98:iload_2         
	//   53   99:invokevirtual   #123 <Method StringBuilder StringBuilder.append(char)>
	//   54  102:pop             
				((StringBuilder) (obj)).append(((String) (field)));
	//   55  103:aload           4
	//   56  105:aload_1         
	//   57  106:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   58  109:pop             
				field = ((Field) (((StringBuilder) (obj)).toString()));
	//   59  110:aload           4
	//   60  112:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   61  115:astore_1        
				field = ((Field) (((Object)this).getClass().getMethod(((String) (field)), new Class[0]).invoke(((Object) (this)), new Object[0])));
	//   62  116:aload_0         
	//   63  117:invokevirtual   #128 <Method Class Object.getClass()>
	//   64  120:aload_1         
	//   65  121:iconst_0        
	//   66  122:anewarray       Class[]
	//   67  125:invokevirtual   #132 <Method Method Class.getMethod(String, Class[])>
	//   68  128:aload_0         
	//   69  129:iconst_0        
	//   70  130:anewarray       Object[]
	//   71  133:invokevirtual   #138 <Method Object Method.invoke(Object, Object[])>
	//   72  136:astore_1        
			}
	//*  73  137:aload_1         
	//*  74  138:areturn         
			// Misplaced declaration of an exception variable
			catch(Field field)
	//*  75  139:astore_1        
			{
				throw new RuntimeException(((Throwable) (field)));
	//   76  140:new             #140 <Class RuntimeException>
	//   77  143:dup             
	//   78  144:aload_1         
	//   79  145:invokespecial   #143 <Method void RuntimeException(Throwable)>
	//   80  148:athrow          
			}
			return ((Object) (field));
		} else
		{
			return a(field.e);
	//   81  149:aload_0         
	//   82  150:aload_1         
	//   83  151:getfield        #68  <Field String FastJsonResponse$Field.e>
	//   84  154:invokevirtual   #86  <Method Object a(String)>
	//   85  157:areturn         
		}
	}

	protected abstract boolean b(String s);

	public String toString()
	{
		Map map = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method Map a()>
	//    2    4:astore_3        
		StringBuilder stringbuilder = new StringBuilder(100);
	//    3    5:new             #38  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          100
	//    6   11:invokespecial   #118 <Method void StringBuilder(int)>
	//    7   14:astore          4
		Iterator iterator = map.keySet().iterator();
	//    8   16:aload_3         
	//    9   17:invokeinterface #151 <Method Set Map.keySet()>
	//   10   22:invokeinterface #157 <Method Iterator Set.iterator()>
	//   11   27:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   29:aload           5
	//   13   31:invokeinterface #163 <Method boolean Iterator.hasNext()>
	//   14   36:ifeq            366
			String s = (String)iterator.next();
	//   15   39:aload           5
	//   16   41:invokeinterface #167 <Method Object Iterator.next()>
	//   17   46:checkcast       #46  <Class String>
	//   18   49:astore          7
			Field field = (Field)map.get(((Object) (s)));
	//   19   51:aload_3         
	//   20   52:aload           7
	//   21   54:invokeinterface #169 <Method Object Map.get(Object)>
	//   22   59:checkcast       #13  <Class FastJsonResponse$Field>
	//   23   62:astore          6
			if(!a(field))
				continue;
	//   24   64:aload_0         
	//   25   65:aload           6
	//   26   67:invokevirtual   #171 <Method boolean a(FastJsonResponse$Field)>
	//   27   70:ifeq            29
			Object obj = a(field, b(field));
	//   28   73:aload           6
	//   29   75:aload_0         
	//   30   76:aload           6
	//   31   78:invokevirtual   #173 <Method Object b(FastJsonResponse$Field)>
	//   32   81:invokestatic    #175 <Method Object a(FastJsonResponse$Field, Object)>
	//   33   84:astore          8
			if(stringbuilder.length() == 0)
	//*  34   86:aload           4
	//*  35   88:invokevirtual   #176 <Method int StringBuilder.length()>
	//*  36   91:ifne            105
				stringbuilder.append("{");
	//   37   94:aload           4
	//   38   96:ldc1            #178 <String "{">
	//   39   98:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   40  101:pop             
			else
	//*  41  102:goto            113
				stringbuilder.append(",");
	//   42  105:aload           4
	//   43  107:ldc1            #180 <String ",">
	//   44  109:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   45  112:pop             
			stringbuilder.append("\"");
	//   46  113:aload           4
	//   47  115:ldc1            #44  <String "\"">
	//   48  117:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   49  120:pop             
			stringbuilder.append(s);
	//   50  121:aload           4
	//   51  123:aload           7
	//   52  125:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   53  128:pop             
			stringbuilder.append("\":");
	//   54  129:aload           4
	//   55  131:ldc1            #182 <String "\":">
	//   56  133:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   57  136:pop             
			if(obj == null)
	//*  58  137:aload           8
	//*  59  139:ifnonnull       153
			{
				stringbuilder.append("null");
	//   60  142:aload           4
	//   61  144:ldc1            #184 <String "null">
	//   62  146:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   63  149:pop             
				continue;
	//   64  150:goto            29
			}
			switch(field.c)
	//*  65  153:aload           6
	//*  66  155:getfield        #60  <Field int com.google.android.gms.common.server.response.FastJsonResponse$Field.c>
			{
	//*  67  158:tableswitch     8 10: default 184
	//	               8 264
	//	               9 231
	//	               10 218
			default:
				if(field.b)
	//*  68  184:aload           6
	//*  69  186:getfield        #186 <Field boolean FastJsonResponse$Field.b>
	//*  70  189:ifeq            354
				{
					ArrayList arraylist = (ArrayList)obj;
	//   71  192:aload           8
	//   72  194:checkcast       #188 <Class ArrayList>
	//   73  197:astore          7
					stringbuilder.append("[");
	//   74  199:aload           4
	//   75  201:ldc1            #190 <String "[">
	//   76  203:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   77  206:pop             
					int i = 0;
	//   78  207:iconst_0        
	//   79  208:istore_1        
					for(int j = arraylist.size(); i < j; i++)
	//*  80  209:aload           7
	//*  81  211:invokevirtual   #193 <Method int ArrayList.size()>
	//*  82  214:istore_2        
	//*  83  215:goto            297
	//*  84  218:aload           4
	//*  85  220:aload           8
	//*  86  222:checkcast       #195 <Class HashMap>
	//*  87  225:invokestatic    #200 <Method void m.a(StringBuilder, HashMap)>
	//*  88  228:goto            29
	//*  89  231:aload           4
	//*  90  233:ldc1            #44  <String "\"">
	//*  91  235:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  92  238:pop             
	//*  93  239:aload           4
	//*  94  241:aload           8
	//*  95  243:checkcast       #202 <Class byte[]>
	//*  96  246:invokestatic    #207 <Method String c.b(byte[])>
	//*  97  249:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  98  252:pop             
	//*  99  253:aload           4
	//* 100  255:ldc1            #44  <String "\"">
	//* 101  257:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 102  260:pop             
	//* 103  261:goto            29
	//* 104  264:aload           4
	//* 105  266:ldc1            #44  <String "\"">
	//* 106  268:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 107  271:pop             
	//* 108  272:aload           4
	//* 109  274:aload           8
	//* 110  276:checkcast       #202 <Class byte[]>
	//* 111  279:invokestatic    #209 <Method String c.a(byte[])>
	//* 112  282:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 113  285:pop             
	//* 114  286:aload           4
	//* 115  288:ldc1            #44  <String "\"">
	//* 116  290:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 117  293:pop             
	//* 118  294:goto            29
	//* 119  297:iload_1         
	//* 120  298:iload_2         
	//* 121  299:icmpge          343
					{
						if(i > 0)
	//* 122  302:iload_1         
	//* 123  303:ifle            314
							stringbuilder.append(",");
	//  124  306:aload           4
	//  125  308:ldc1            #180 <String ",">
	//  126  310:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  127  313:pop             
						obj = arraylist.get(i);
	//  128  314:aload           7
	//  129  316:iload_1         
	//  130  317:invokevirtual   #212 <Method Object ArrayList.get(int)>
	//  131  320:astore          8
						if(obj != null)
	//* 132  322:aload           8
	//* 133  324:ifnull          336
							a(stringbuilder, field, obj);
	//  134  327:aload           4
	//  135  329:aload           6
	//  136  331:aload           8
	//  137  333:invokestatic    #214 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
					}

	//  138  336:iload_1         
	//  139  337:iconst_1        
	//  140  338:iadd            
	//  141  339:istore_1        
	//* 142  340:goto            297
					stringbuilder.append("]");
	//  143  343:aload           4
	//  144  345:ldc1            #216 <String "]">
	//  145  347:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  146  350:pop             
					break;
	//  147  351:goto            29
				}
				a(stringbuilder, field, obj);
	//  148  354:aload           4
	//  149  356:aload           6
	//  150  358:aload           8
	//  151  360:invokestatic    #214 <Method void a(StringBuilder, FastJsonResponse$Field, Object)>
				break;

			case 10: // '\n'
				m.a(stringbuilder, (HashMap)obj);
				break;

			case 9: // '\t'
				stringbuilder.append("\"");
				stringbuilder.append(c.b((byte[])obj));
				stringbuilder.append("\"");
				break;

			case 8: // '\b'
				stringbuilder.append("\"");
				stringbuilder.append(c.a((byte[])obj));
				stringbuilder.append("\"");
				break;
			}
		} while(true);
	//  152  363:goto            29
		if(stringbuilder.length() > 0)
	//* 153  366:aload           4
	//* 154  368:invokevirtual   #176 <Method int StringBuilder.length()>
	//* 155  371:ifle            385
			stringbuilder.append("}");
	//  156  374:aload           4
	//  157  376:ldc1            #218 <String "}">
	//  158  378:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  159  381:pop             
		else
	//* 160  382:goto            393
			stringbuilder.append("{}");
	//  161  385:aload           4
	//  162  387:ldc1            #220 <String "{}">
	//  163  389:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  164  392:pop             
		return stringbuilder.toString();
	//  165  393:aload           4
	//  166  395:invokevirtual   #124 <Method String StringBuilder.toString()>
	//  167  398:areturn         
	}

	private class Field extends AbstractSafeParcelable
	{

		public static Field a(String s, int i1)
		{
			return new Field(0, false, 0, false, s, i1, ((Class) (null)), ((a) (null)));
		//    0    0:new             #2   <Class FastJsonResponse$Field>
		//    1    3:dup             
		//    2    4:iconst_0        
		//    3    5:iconst_0        
		//    4    6:iconst_0        
		//    5    7:iconst_0        
		//    6    8:aload_0         
		//    7    9:iload_1         
		//    8   10:aconst_null     
		//    9   11:aconst_null     
		//   10   12:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
		//   11   15:areturn         
		}

		public static Field a(String s, int i1, Class class1)
		{
			return new Field(11, false, 11, false, s, i1, class1, ((a) (null)));
		//    0    0:new             #2   <Class FastJsonResponse$Field>
		//    1    3:dup             
		//    2    4:bipush          11
		//    3    6:iconst_0        
		//    4    7:bipush          11
		//    5    9:iconst_0        
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:aload_2         
		//    9   13:aconst_null     
		//   10   14:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
		//   11   17:areturn         
		}

		static a a(Field field)
		{
			return field.k;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field a k>
		//    2    4:areturn         
		}

		public static Field b(String s, int i1)
		{
			return new Field(7, false, 7, false, s, i1, ((Class) (null)), ((a) (null)));
		//    0    0:new             #2   <Class FastJsonResponse$Field>
		//    1    3:dup             
		//    2    4:bipush          7
		//    3    6:iconst_0        
		//    4    7:bipush          7
		//    5    9:iconst_0        
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:aconst_null     
		//    9   13:aconst_null     
		//   10   14:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
		//   11   17:areturn         
		}

		public static Field b(String s, int i1, Class class1)
		{
			return new Field(11, true, 11, true, s, i1, class1, ((a) (null)));
		//    0    0:new             #2   <Class FastJsonResponse$Field>
		//    1    3:dup             
		//    2    4:bipush          11
		//    3    6:iconst_1        
		//    4    7:bipush          11
		//    5    9:iconst_1        
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:aload_2         
		//    9   13:aconst_null     
		//   10   14:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
		//   11   17:areturn         
		}

		public static Field c(String s, int i1)
		{
			return new Field(7, true, 7, true, s, i1, ((Class) (null)), ((a) (null)));
		//    0    0:new             #2   <Class FastJsonResponse$Field>
		//    1    3:dup             
		//    2    4:bipush          7
		//    3    6:iconst_1        
		//    4    7:bipush          7
		//    5    9:iconst_1        
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:aconst_null     
		//    9   13:aconst_null     
		//   10   14:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
		//   11   17:areturn         
		}

		public static Field d(String s, int i1)
		{
			return new Field(8, false, 8, false, s, i1, ((Class) (null)), ((a) (null)));
		//    0    0:new             #2   <Class FastJsonResponse$Field>
		//    1    3:dup             
		//    2    4:bipush          8
		//    3    6:iconst_0        
		//    4    7:bipush          8
		//    5    9:iconst_0        
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:aconst_null     
		//    9   13:aconst_null     
		//   10   14:invokespecial   #72  <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, a)>
		//   11   17:areturn         
		}

		private final String d()
		{
			String s = i;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field String i>
		//    2    4:astore_1        
			if(s == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return s;
		//    7   11:aload_1         
		//    8   12:areturn         
		}

		private final zaa e()
		{
			a a1 = k;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field a k>
		//    2    4:astore_1        
			if(a1 == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return zaa.a(a1);
		//    7   11:aload_1         
		//    8   12:invokestatic    #78  <Method zaa zaa.a(a)>
		//    9   15:areturn         
		}

		public int a()
		{
			return f;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int f>
		//    2    4:ireturn         
		}

		public final Object a(Object obj)
		{
			return k.a(obj);
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field a k>
		//    2    4:aload_1         
		//    3    5:invokeinterface #84  <Method Object a.a(Object)>
		//    4   10:areturn         
		}

		public final void a(zak zak1)
		{
			j = zak1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #87  <Field zak j>
		//    3    5:return          
		}

		public final boolean b()
		{
			return k != null;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field a k>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public final Map c()
		{
			am.a(((Object) (i)));
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field String i>
		//    2    4:invokestatic    #92  <Method Object am.a(Object)>
		//    3    7:pop             
			am.a(((Object) (j)));
		//    4    8:aload_0         
		//    5    9:getfield        #87  <Field zak j>
		//    6   12:invokestatic    #92  <Method Object am.a(Object)>
		//    7   15:pop             
			return j.a(i);
		//    8   16:aload_0         
		//    9   17:getfield        #87  <Field zak j>
		//   10   20:aload_0         
		//   11   21:getfield        #53  <Field String i>
		//   12   24:invokevirtual   #97  <Method Map zak.a(String)>
		//   13   27:areturn         
		}

		public String toString()
		{
			al al1 = ak.a(((Object) (this))).a("versionCode", ((Object) (Integer.valueOf(h)))).a("typeIn", ((Object) (Integer.valueOf(a)))).a("typeInArray", ((Object) (Boolean.valueOf(b)))).a("typeOut", ((Object) (Integer.valueOf(c)))).a("typeOutArray", ((Object) (Boolean.valueOf(d)))).a("outputFieldName", ((Object) (e))).a("safeParcelFieldId", ((Object) (Integer.valueOf(f)))).a("concreteTypeName", ((Object) (d())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #103 <Method al ak.a(Object)>
		//    2    4:ldc1            #105 <String "versionCode">
		//    3    6:aload_0         
		//    4    7:getfield        #37  <Field int h>
		//    5   10:invokestatic    #111 <Method Integer Integer.valueOf(int)>
		//    6   13:invokevirtual   #116 <Method al al.a(String, Object)>
		//    7   16:ldc1            #118 <String "typeIn">
		//    8   18:aload_0         
		//    9   19:getfield        #39  <Field int a>
		//   10   22:invokestatic    #111 <Method Integer Integer.valueOf(int)>
		//   11   25:invokevirtual   #116 <Method al al.a(String, Object)>
		//   12   28:ldc1            #120 <String "typeInArray">
		//   13   30:aload_0         
		//   14   31:getfield        #41  <Field boolean b>
		//   15   34:invokestatic    #125 <Method Boolean Boolean.valueOf(boolean)>
		//   16   37:invokevirtual   #116 <Method al al.a(String, Object)>
		//   17   40:ldc1            #127 <String "typeOut">
		//   18   42:aload_0         
		//   19   43:getfield        #43  <Field int c>
		//   20   46:invokestatic    #111 <Method Integer Integer.valueOf(int)>
		//   21   49:invokevirtual   #116 <Method al al.a(String, Object)>
		//   22   52:ldc1            #129 <String "typeOutArray">
		//   23   54:aload_0         
		//   24   55:getfield        #45  <Field boolean d>
		//   25   58:invokestatic    #125 <Method Boolean Boolean.valueOf(boolean)>
		//   26   61:invokevirtual   #116 <Method al al.a(String, Object)>
		//   27   64:ldc1            #131 <String "outputFieldName">
		//   28   66:aload_0         
		//   29   67:getfield        #47  <Field String e>
		//   30   70:invokevirtual   #116 <Method al al.a(String, Object)>
		//   31   73:ldc1            #133 <String "safeParcelFieldId">
		//   32   75:aload_0         
		//   33   76:getfield        #49  <Field int f>
		//   34   79:invokestatic    #111 <Method Integer Integer.valueOf(int)>
		//   35   82:invokevirtual   #116 <Method al al.a(String, Object)>
		//   36   85:ldc1            #135 <String "concreteTypeName">
		//   37   87:aload_0         
		//   38   88:invokespecial   #137 <Method String d()>
		//   39   91:invokevirtual   #116 <Method al al.a(String, Object)>
		//   40   94:astore_1        
			Object obj = ((Object) (g));
		//   41   95:aload_0         
		//   42   96:getfield        #51  <Field Class g>
		//   43   99:astore_2        
			if(obj != null)
		//*  44  100:aload_2         
		//*  45  101:ifnull          115
				al1.a("concreteType.class", ((Object) (((Class) (obj)).getCanonicalName())));
		//   46  104:aload_1         
		//   47  105:ldc1            #139 <String "concreteType.class">
		//   48  107:aload_2         
		//   49  108:invokevirtual   #69  <Method String Class.getCanonicalName()>
		//   50  111:invokevirtual   #116 <Method al al.a(String, Object)>
		//   51  114:pop             
			obj = ((Object) (k));
		//   52  115:aload_0         
		//   53  116:getfield        #57  <Field a k>
		//   54  119:astore_2        
			if(obj != null)
		//*  55  120:aload_2         
		//*  56  121:ifnull          138
				al1.a("converterName", ((Object) (obj.getClass().getCanonicalName())));
		//   57  124:aload_1         
		//   58  125:ldc1            #141 <String "converterName">
		//   59  127:aload_2         
		//   60  128:invokevirtual   #147 <Method Class Object.getClass()>
		//   61  131:invokevirtual   #69  <Method String Class.getCanonicalName()>
		//   62  134:invokevirtual   #116 <Method al al.a(String, Object)>
		//   63  137:pop             
			return al1.toString();
		//   64  138:aload_1         
		//   65  139:invokevirtual   #149 <Method String al.toString()>
		//   66  142:areturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			int j1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
		//    0    0:aload_1         
		//    1    1:invokestatic    #156 <Method int com.google.android.gms.common.internal.safeparcel.c.a(Parcel)>
		//    2    4:istore_3        
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, h);
		//    3    5:aload_1         
		//    4    6:iconst_1        
		//    5    7:aload_0         
		//    6    8:getfield        #37  <Field int h>
		//    7   11:invokestatic    #159 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, int)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a);
		//    8   14:aload_1         
		//    9   15:iconst_2        
		//   10   16:aload_0         
		//   11   17:getfield        #39  <Field int a>
		//   12   20:invokestatic    #159 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, int)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
		//   13   23:aload_1         
		//   14   24:iconst_3        
		//   15   25:aload_0         
		//   16   26:getfield        #41  <Field boolean b>
		//   17   29:invokestatic    #162 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, boolean)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c);
		//   18   32:aload_1         
		//   19   33:iconst_4        
		//   20   34:aload_0         
		//   21   35:getfield        #43  <Field int c>
		//   22   38:invokestatic    #159 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, int)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d);
		//   23   41:aload_1         
		//   24   42:iconst_5        
		//   25   43:aload_0         
		//   26   44:getfield        #45  <Field boolean d>
		//   27   47:invokestatic    #162 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, boolean)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e, false);
		//   28   50:aload_1         
		//   29   51:bipush          6
		//   30   53:aload_0         
		//   31   54:getfield        #47  <Field String e>
		//   32   57:iconst_0        
		//   33   58:invokestatic    #165 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, String, boolean)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, a());
		//   34   61:aload_1         
		//   35   62:bipush          7
		//   36   64:aload_0         
		//   37   65:invokevirtual   #167 <Method int a()>
		//   38   68:invokestatic    #159 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, int)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, d(), false);
		//   39   71:aload_1         
		//   40   72:bipush          8
		//   41   74:aload_0         
		//   42   75:invokespecial   #137 <Method String d()>
		//   43   78:iconst_0        
		//   44   79:invokestatic    #165 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, String, boolean)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, ((android.os.Parcelable) (e())), i1, false);
		//   45   82:aload_1         
		//   46   83:bipush          9
		//   47   85:aload_0         
		//   48   86:invokespecial   #169 <Method zaa e()>
		//   49   89:iload_2         
		//   50   90:iconst_0        
		//   51   91:invokestatic    #172 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int, android.os.Parcelable, int, boolean)>
			com.google.android.gms.common.internal.safeparcel.c.a(parcel, j1);
		//   52   94:aload_1         
		//   53   95:iload_3         
		//   54   96:invokestatic    #174 <Method void com.google.android.gms.common.internal.safeparcel.c.a(Parcel, int)>
		//   55   99:return          
		}

		public static final b CREATOR = new b();
		protected final int a;
		protected final boolean b;
		protected final int c;
		protected final boolean d;
		protected final String e;
		protected final int f;
		protected final Class g;
		private final int h;
		private final String i;
		private zak j;
		private a k;

		static 
		{
		//    0    0:new             #27  <Class b>
		//    1    3:dup             
		//    2    4:invokespecial   #30  <Method void b()>
		//    3    7:putstatic       #32  <Field b CREATOR>
		//*   4   10:return          
		}

		Field(int i1, int j1, boolean flag, int k1, boolean flag1, String s, int l1, 
				String s1, zaa zaa1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
			h = i1;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #37  <Field int h>
			a = j1;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #39  <Field int a>
			b = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #41  <Field boolean b>
			c = k1;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #43  <Field int c>
			d = flag1;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #45  <Field boolean d>
			e = s;
		//   17   31:aload_0         
		//   18   32:aload           6
		//   19   34:putfield        #47  <Field String e>
			f = l1;
		//   20   37:aload_0         
		//   21   38:iload           7
		//   22   40:putfield        #49  <Field int f>
			if(s1 == null)
		//*  23   43:aload           8
		//*  24   45:ifnonnull       61
			{
				g = null;
		//   25   48:aload_0         
		//   26   49:aconst_null     
		//   27   50:putfield        #51  <Field Class g>
				i = null;
		//   28   53:aload_0         
		//   29   54:aconst_null     
		//   30   55:putfield        #53  <Field String i>
			} else
		//*  31   58:goto            73
			{
				g = com/google/android/gms/common/server/response/SafeParcelResponse;
		//   32   61:aload_0         
		//   33   62:ldc1            #55  <Class SafeParcelResponse>
		//   34   64:putfield        #51  <Field Class g>
				i = s1;
		//   35   67:aload_0         
		//   36   68:aload           8
		//   37   70:putfield        #53  <Field String i>
			}
			if(zaa1 == null)
		//*  38   73:aload           9
		//*  39   75:ifnonnull       84
			{
				k = null;
		//   40   78:aload_0         
		//   41   79:aconst_null     
		//   42   80:putfield        #57  <Field a k>
				return;
		//   43   83:return          
			} else
			{
				k = zaa1.a();
		//   44   84:aload_0         
		//   45   85:aload           9
		//   46   87:invokevirtual   #62  <Method a zaa.a()>
		//   47   90:putfield        #57  <Field a k>
				return;
		//   48   93:return          
			}
		}

		private Field(int i1, boolean flag, int j1, boolean flag1, String s, int k1, Class class1, 
				a a1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
			h = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #37  <Field int h>
			a = i1;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #39  <Field int a>
			b = flag;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #41  <Field boolean b>
			c = j1;
		//   11   19:aload_0         
		//   12   20:iload_3         
		//   13   21:putfield        #43  <Field int c>
			d = flag1;
		//   14   24:aload_0         
		//   15   25:iload           4
		//   16   27:putfield        #45  <Field boolean d>
			e = s;
		//   17   30:aload_0         
		//   18   31:aload           5
		//   19   33:putfield        #47  <Field String e>
			f = k1;
		//   20   36:aload_0         
		//   21   37:iload           6
		//   22   39:putfield        #49  <Field int f>
			g = class1;
		//   23   42:aload_0         
		//   24   43:aload           7
		//   25   45:putfield        #51  <Field Class g>
			if(class1 == null)
		//*  26   48:aload           7
		//*  27   50:ifnonnull       61
				i = null;
		//   28   53:aload_0         
		//   29   54:aconst_null     
		//   30   55:putfield        #53  <Field String i>
			else
		//*  31   58:goto            70
				i = class1.getCanonicalName();
		//   32   61:aload_0         
		//   33   62:aload           7
		//   34   64:invokevirtual   #69  <Method String Class.getCanonicalName()>
		//   35   67:putfield        #53  <Field String i>
			k = a1;
		//   36   70:aload_0         
		//   37   71:aload           8
		//   38   73:putfield        #57  <Field a k>
		//   39   76:return          
		}
	}

}
