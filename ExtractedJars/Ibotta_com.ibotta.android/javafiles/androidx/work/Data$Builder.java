// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import java.util.*;

// Referenced classes of package androidx.work:
//			Data

public static final class Data$Builder
{

	public Data build()
	{
		return new Data(mValues);
	//    0    0:new             #6   <Class Data>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Map mValues>
	//    4    8:invokespecial   #26  <Method void Data(Map)>
	//    5   11:areturn         
	}

	public Data$Builder put(String s, Object obj)
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       18
		{
			mValues.put(((Object) (s)), ((Object) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Map mValues>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//    7   15:pop             
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		}
		Class class1 = obj.getClass();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #43  <Method Class Object.getClass()>
	//   12   22:astore_3        
		if(class1 != java/lang/Boolean && class1 != java/lang/Integer && class1 != java/lang/Long && class1 != java/lang/Float && class1 != java/lang/Double && class1 != java/lang/String && class1 != [Ljava/lang/Boolean; && class1 != [Ljava/lang/Integer; && class1 != [Ljava/lang/Long; && class1 != [Ljava/lang/Float; && class1 != [Ljava/lang/Double; && class1 != [Ljava/lang/String;)
	//*  13   23:aload_3         
	//*  14   24:ldc1            #45  <Class Boolean>
	//*  15   26:if_acmpeq       253
	//*  16   29:aload_3         
	//*  17   30:ldc1            #47  <Class Integer>
	//*  18   32:if_acmpeq       253
	//*  19   35:aload_3         
	//*  20   36:ldc1            #49  <Class Long>
	//*  21   38:if_acmpeq       253
	//*  22   41:aload_3         
	//*  23   42:ldc1            #51  <Class Float>
	//*  24   44:if_acmpeq       253
	//*  25   47:aload_3         
	//*  26   48:ldc1            #53  <Class Double>
	//*  27   50:if_acmpeq       253
	//*  28   53:aload_3         
	//*  29   54:ldc1            #55  <Class String>
	//*  30   56:if_acmpeq       253
	//*  31   59:aload_3         
	//*  32   60:ldc1            #57  <Class Boolean[]>
	//*  33   62:if_acmpeq       253
	//*  34   65:aload_3         
	//*  35   66:ldc1            #59  <Class Integer[]>
	//*  36   68:if_acmpeq       253
	//*  37   71:aload_3         
	//*  38   72:ldc1            #61  <Class Long[]>
	//*  39   74:if_acmpeq       253
	//*  40   77:aload_3         
	//*  41   78:ldc1            #63  <Class Float[]>
	//*  42   80:if_acmpeq       253
	//*  43   83:aload_3         
	//*  44   84:ldc1            #65  <Class Double[]>
	//*  45   86:if_acmpeq       253
	//*  46   89:aload_3         
	//*  47   90:ldc1            #67  <Class String[]>
	//*  48   92:if_acmpne       98
	//*  49   95:goto            253
		{
			if(class1 == [Z)
	//*  50   98:aload_3         
	//*  51   99:ldc1            #69  <Class boolean[]>
	//*  52  101:if_acmpne       124
			{
				mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveBooleanArray((boolean[])obj))));
	//   53  104:aload_0         
	//   54  105:getfield        #19  <Field Map mValues>
	//   55  108:aload_1         
	//   56  109:aload_2         
	//   57  110:checkcast       #69  <Class boolean[]>
	//   58  113:invokestatic    #73  <Method Boolean[] Data.convertPrimitiveBooleanArray(boolean[])>
	//   59  116:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//   60  121:pop             
				return this;
	//   61  122:aload_0         
	//   62  123:areturn         
			}
			if(class1 == [I)
	//*  63  124:aload_3         
	//*  64  125:ldc1            #75  <Class int[]>
	//*  65  127:if_acmpne       150
			{
				mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveIntArray((int[])obj))));
	//   66  130:aload_0         
	//   67  131:getfield        #19  <Field Map mValues>
	//   68  134:aload_1         
	//   69  135:aload_2         
	//   70  136:checkcast       #75  <Class int[]>
	//   71  139:invokestatic    #79  <Method Integer[] Data.convertPrimitiveIntArray(int[])>
	//   72  142:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//   73  147:pop             
				return this;
	//   74  148:aload_0         
	//   75  149:areturn         
			}
			if(class1 == [J)
	//*  76  150:aload_3         
	//*  77  151:ldc1            #81  <Class long[]>
	//*  78  153:if_acmpne       176
			{
				mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveLongArray((long[])obj))));
	//   79  156:aload_0         
	//   80  157:getfield        #19  <Field Map mValues>
	//   81  160:aload_1         
	//   82  161:aload_2         
	//   83  162:checkcast       #81  <Class long[]>
	//   84  165:invokestatic    #85  <Method Long[] Data.convertPrimitiveLongArray(long[])>
	//   85  168:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//   86  173:pop             
				return this;
	//   87  174:aload_0         
	//   88  175:areturn         
			}
			if(class1 == [F)
	//*  89  176:aload_3         
	//*  90  177:ldc1            #87  <Class float[]>
	//*  91  179:if_acmpne       202
			{
				mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveFloatArray((float[])obj))));
	//   92  182:aload_0         
	//   93  183:getfield        #19  <Field Map mValues>
	//   94  186:aload_1         
	//   95  187:aload_2         
	//   96  188:checkcast       #87  <Class float[]>
	//   97  191:invokestatic    #91  <Method Float[] Data.convertPrimitiveFloatArray(float[])>
	//   98  194:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//   99  199:pop             
				return this;
	//  100  200:aload_0         
	//  101  201:areturn         
			}
			if(class1 == [D)
	//* 102  202:aload_3         
	//* 103  203:ldc1            #93  <Class double[]>
	//* 104  205:if_acmpne       228
			{
				mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveDoubleArray((double[])obj))));
	//  105  208:aload_0         
	//  106  209:getfield        #19  <Field Map mValues>
	//  107  212:aload_1         
	//  108  213:aload_2         
	//  109  214:checkcast       #93  <Class double[]>
	//  110  217:invokestatic    #97  <Method Double[] Data.convertPrimitiveDoubleArray(double[])>
	//  111  220:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//  112  225:pop             
				return this;
	//  113  226:aload_0         
	//  114  227:areturn         
			} else
			{
				throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[] {
					s, class1
				}));
	//  115  228:new             #99  <Class IllegalArgumentException>
	//  116  231:dup             
	//  117  232:ldc1            #101 <String "Key %s has invalid type %s">
	//  118  234:iconst_2        
	//  119  235:anewarray       Object[]
	//  120  238:dup             
	//  121  239:iconst_0        
	//  122  240:aload_1         
	//  123  241:aastore         
	//  124  242:dup             
	//  125  243:iconst_1        
	//  126  244:aload_3         
	//  127  245:aastore         
	//  128  246:invokestatic    #105 <Method String String.format(String, Object[])>
	//  129  249:invokespecial   #108 <Method void IllegalArgumentException(String)>
	//  130  252:athrow          
			}
		} else
		{
			mValues.put(((Object) (s)), obj);
	//  131  253:aload_0         
	//  132  254:getfield        #19  <Field Map mValues>
	//  133  257:aload_1         
	//  134  258:aload_2         
	//  135  259:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//  136  264:pop             
			return this;
	//  137  265:aload_0         
	//  138  266:areturn         
		}
	}

	public Data$Builder putAll(Data data)
	{
		putAll(data.mValues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #112 <Field Map Data.mValues>
	//    3    5:invokevirtual   #115 <Method Data$Builder putAll(Map)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Data$Builder putAll(Map map)
	{
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); put((String)entry.getKey(), entry.getValue()))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #119 <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #125 <Method Iterator Set.iterator()>
	//*   3   11:astore_1        
	//*   4   12:aload_1         
	//*   5   13:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            54
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_1         
	//    8   22:invokeinterface #135 <Method Object Iterator.next()>
	//    9   27:checkcast       #137 <Class java.util.Map$Entry>
	//   10   30:astore_2        

	//   11   31:aload_0         
	//   12   32:aload_2         
	//   13   33:invokeinterface #140 <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #55  <Class String>
	//   15   41:aload_2         
	//   16   42:invokeinterface #143 <Method Object java.util.Map$Entry.getValue()>
	//   17   47:invokevirtual   #145 <Method Data$Builder put(String, Object)>
	//   18   50:pop             
	//*  19   51:goto            12
		return this;
	//   20   54:aload_0         
	//   21   55:areturn         
	}

	public Data$Builder putString(String s, String s1)
	{
		mValues.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	private Map mValues;

	public Data$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mValues = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void HashMap()>
	//    6   12:putfield        #19  <Field Map mValues>
	//    7   15:return          
	}
}
