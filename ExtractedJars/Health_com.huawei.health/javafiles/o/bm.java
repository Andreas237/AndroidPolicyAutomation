// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package o:
//			bl, bi, bk, fsu, 
//			bh

public final class bm
	implements bl, bi
{

	public bm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public final Object b(Object obj)
	{
		TreeMap treemap = new TreeMap();
	//    0    0:new             #17  <Class TreeMap>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void TreeMap()>
	//    3    7:astore          8
		Class class1 = obj.getClass();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #22  <Method Class Object.getClass()>
	//    6   13:astore          6
		for(Field afield[] = class1.getDeclaredFields(); !((Object) (class1)).equals(java/lang/Object); afield = class1.getDeclaredFields())
	//*   7   15:aload           6
	//*   8   17:invokevirtual   #28  <Method Field[] Class.getDeclaredFields()>
	//*   9   20:astore          7
	//*  10   22:aload           6
	//*  11   24:ldc1            #4   <Class Object>
	//*  12   26:invokevirtual   #32  <Method boolean Object.equals(Object)>
	//*  13   29:ifne            184
		{
			if(afield != null && afield.length > 0)
	//*  14   32:aload           7
	//*  15   34:ifnull          167
	//*  16   37:aload           7
	//*  17   39:arraylength     
	//*  18   40:ifle            167
			{
				int j = afield.length;
	//   19   43:aload           7
	//   20   45:arraylength     
	//   21   46:istore_3        
				for(int i = 0; i < j; i++)
	//*  22   47:iconst_0        
	//*  23   48:istore_2        
	//*  24   49:iload_2         
	//*  25   50:iload_3         
	//*  26   51:icmpge          167
				{
					Field field = afield[i];
	//   27   54:aload           7
	//   28   56:iload_2         
	//   29   57:aaload          
	//   30   58:astore          9
					Object obj1;
					if(field == null || obj == null)
	//*  31   60:aload           9
	//*  32   62:ifnull          69
	//*  33   65:aload_1         
	//*  34   66:ifnonnull       75
						obj1 = null;
	//   35   69:aconst_null     
	//   36   70:astore          5
					else
	//*  37   72:goto            140
					if("this$0".equals(((Object) (field.getName()))))
	//*  38   75:ldc1            #34  <String "this$0">
	//*  39   77:aload           9
	//*  40   79:invokevirtual   #40  <Method String Field.getName()>
	//*  41   82:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  42   85:ifeq            94
					{
						obj1 = null;
	//   43   88:aconst_null     
	//   44   89:astore          5
					} else
	//*  45   91:goto            140
					{
						boolean flag = field.isAccessible();
	//   46   94:aload           9
	//   47   96:invokevirtual   #47  <Method boolean Field.isAccessible()>
	//   48   99:istore          4
						field.setAccessible(true);
	//   49  101:aload           9
	//   50  103:iconst_1        
	//   51  104:invokevirtual   #51  <Method void Field.setAccessible(boolean)>
						obj1 = field.get(obj);
	//   52  107:aload           9
	//   53  109:aload_1         
	//   54  110:invokevirtual   #54  <Method Object Field.get(Object)>
	//   55  113:astore          5
						if(obj1 == null)
	//*  56  115:aload           5
	//*  57  117:ifnonnull       126
						{
							obj1 = null;
	//   58  120:aconst_null     
	//   59  121:astore          5
						} else
	//*  60  123:goto            140
						{
							field.setAccessible(flag);
	//   61  126:aload           9
	//   62  128:iload           4
	//   63  130:invokevirtual   #51  <Method void Field.setAccessible(boolean)>
							obj1 = bk.d(obj1);
	//   64  133:aload           5
	//   65  135:invokestatic    #59  <Method Object bk.d(Object)>
	//   66  138:astore          5
						}
					}
					if(obj1 != null)
	//*  67  140:aload           5
	//*  68  142:ifnull          160
						((Map) (treemap)).put(((Object) (field.getName())), obj1);
	//   69  145:aload           8
	//   70  147:aload           9
	//   71  149:invokevirtual   #40  <Method String Field.getName()>
	//   72  152:aload           5
	//   73  154:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   74  159:pop             
				}

	//   75  160:iload_2         
	//   76  161:iconst_1        
	//   77  162:iadd            
	//   78  163:istore_2        
			}
	//*  79  164:goto            49
			class1 = class1.getSuperclass();
	//   80  167:aload           6
	//   81  169:invokevirtual   #68  <Method Class Class.getSuperclass()>
	//   82  172:astore          6
		}

	//   83  174:aload           6
	//   84  176:invokevirtual   #28  <Method Field[] Class.getDeclaredFields()>
	//   85  179:astore          7
	//*  86  181:goto            22
		return ((Object) (treemap));
	//   87  184:aload           8
	//   88  186:areturn         
	}

	public final Object d(Object obj, Type type)
	{
		if(!((Object) (obj.getClass())).equals(o/fsu))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #22  <Method Class Object.getClass()>
	//*   2    4:ldc1            #71  <Class fsu>
	//*   3    6:invokevirtual   #32  <Method boolean Object.equals(Object)>
	//*   4    9:ifne            14
			return ((Object) (null));
	//    5   12:aconst_null     
	//    6   13:areturn         
		fsu fsu1 = (fsu)obj;
	//    7   14:aload_1         
	//    8   15:checkcast       #71  <Class fsu>
	//    9   18:astore          5
		obj = ((Object) ((Class)type));
	//   10   20:aload_2         
	//   11   21:checkcast       #24  <Class Class>
	//   12   24:astore_1        
		type = ((Type) (((Class) (obj)).newInstance()));
	//   13   25:aload_1         
	//   14   26:invokevirtual   #75  <Method Object Class.newInstance()>
	//   15   29:astore_2        
		for(; !obj.equals(java/lang/Object); obj = ((Object) (((Class) (obj)).getSuperclass())))
	//*  16   30:aload_1         
	//*  17   31:ldc1            #4   <Class Object>
	//*  18   33:invokevirtual   #32  <Method boolean Object.equals(Object)>
	//*  19   36:ifne            138
		{
			Field afield[] = ((Class) (obj)).getDeclaredFields();
	//   20   39:aload_1         
	//   21   40:invokevirtual   #28  <Method Field[] Class.getDeclaredFields()>
	//   22   43:astore          6
			if(afield == null || afield.length <= 0)
				continue;
	//   23   45:aload           6
	//   24   47:ifnull          130
	//   25   50:aload           6
	//   26   52:arraylength     
	//   27   53:ifle            130
			int j = afield.length;
	//   28   56:aload           6
	//   29   58:arraylength     
	//   30   59:istore          4
			for(int i = 0; i < j; i++)
	//*  31   61:iconst_0        
	//*  32   62:istore_3        
	//*  33   63:iload_3         
	//*  34   64:iload           4
	//*  35   66:icmpge          130
			{
				Field field = afield[i];
	//   36   69:aload           6
	//   37   71:iload_3         
	//   38   72:aaload          
	//   39   73:astore          7
				String s = field.getName();
	//   40   75:aload           7
	//   41   77:invokevirtual   #40  <Method String Field.getName()>
	//   42   80:astore          8
				Type type1 = field.getGenericType();
	//   43   82:aload           7
	//   44   84:invokevirtual   #79  <Method Type Field.getGenericType()>
	//   45   87:astore          9
				if(fsu1.d(s))
	//*  46   89:aload           5
	//*  47   91:aload           8
	//*  48   93:invokevirtual   #82  <Method boolean fsu.d(String)>
	//*  49   96:ifeq            123
				{
					field.setAccessible(true);
	//   50   99:aload           7
	//   51  101:iconst_1        
	//   52  102:invokevirtual   #51  <Method void Field.setAccessible(boolean)>
					field.set(((Object) (type)), bh.a(fsu1.e(s), type1));
	//   53  105:aload           7
	//   54  107:aload_2         
	//   55  108:aload           5
	//   56  110:aload           8
	//   57  112:invokevirtual   #86  <Method Object fsu.e(String)>
	//   58  115:aload           9
	//   59  117:invokestatic    #91  <Method Object bh.a(Object, Type)>
	//   60  120:invokevirtual   #95  <Method void Field.set(Object, Object)>
				}
			}

	//   61  123:iload_3         
	//   62  124:iconst_1        
	//   63  125:iadd            
	//   64  126:istore_3        
		}

	//   65  127:goto            63
	//   66  130:aload_1         
	//   67  131:invokevirtual   #68  <Method Class Class.getSuperclass()>
	//   68  134:astore_1        
	//*  69  135:goto            30
		return ((Object) (type));
	//   70  138:aload_2         
	//   71  139:areturn         
	}

	public final boolean e(Class class1)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
