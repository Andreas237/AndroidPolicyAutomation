// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.util.Log;
import java.io.*;
import java.util.*;

// Referenced classes of package androidx.work:
//			Logger

public final class Data
{
	public static final class Builder
	{

		public Data build()
		{
			Data data = new Data(mValues);
		//    0    0:new             #6   <Class Data>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Map mValues>
		//    4    8:invokespecial   #26  <Method void Data(Map)>
		//    5   11:astore_1        
			Data.toByteArray(data);
		//    6   12:aload_1         
		//    7   13:invokestatic    #30  <Method byte[] Data.toByteArray(Data)>
		//    8   16:pop             
			return data;
		//    9   17:aload_1         
		//   10   18:areturn         
		}

		public Builder put(String s, Object obj)
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
		//    6   10:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    7   15:pop             
				return this;
		//    8   16:aload_0         
		//    9   17:areturn         
			}
			Class class1 = obj.getClass();
		//   10   18:aload_2         
		//   11   19:invokevirtual   #47  <Method Class Object.getClass()>
		//   12   22:astore_3        
			if(class1 != java/lang/Boolean && class1 != java/lang/Integer && class1 != java/lang/Long && class1 != java/lang/Float && class1 != java/lang/Double && class1 != java/lang/String && class1 != [Ljava/lang/Boolean; && class1 != [Ljava/lang/Integer; && class1 != [Ljava/lang/Long; && class1 != [Ljava/lang/Float; && class1 != [Ljava/lang/Double; && class1 != [Ljava/lang/String;)
		//*  13   23:aload_3         
		//*  14   24:ldc1            #49  <Class Boolean>
		//*  15   26:if_acmpeq       253
		//*  16   29:aload_3         
		//*  17   30:ldc1            #51  <Class Integer>
		//*  18   32:if_acmpeq       253
		//*  19   35:aload_3         
		//*  20   36:ldc1            #53  <Class Long>
		//*  21   38:if_acmpeq       253
		//*  22   41:aload_3         
		//*  23   42:ldc1            #55  <Class Float>
		//*  24   44:if_acmpeq       253
		//*  25   47:aload_3         
		//*  26   48:ldc1            #57  <Class Double>
		//*  27   50:if_acmpeq       253
		//*  28   53:aload_3         
		//*  29   54:ldc1            #59  <Class String>
		//*  30   56:if_acmpeq       253
		//*  31   59:aload_3         
		//*  32   60:ldc1            #61  <Class Boolean[]>
		//*  33   62:if_acmpeq       253
		//*  34   65:aload_3         
		//*  35   66:ldc1            #63  <Class Integer[]>
		//*  36   68:if_acmpeq       253
		//*  37   71:aload_3         
		//*  38   72:ldc1            #65  <Class Long[]>
		//*  39   74:if_acmpeq       253
		//*  40   77:aload_3         
		//*  41   78:ldc1            #67  <Class Float[]>
		//*  42   80:if_acmpeq       253
		//*  43   83:aload_3         
		//*  44   84:ldc1            #69  <Class Double[]>
		//*  45   86:if_acmpeq       253
		//*  46   89:aload_3         
		//*  47   90:ldc1            #71  <Class String[]>
		//*  48   92:if_acmpne       98
		//*  49   95:goto            253
			{
				if(class1 == [Z)
		//*  50   98:aload_3         
		//*  51   99:ldc1            #73  <Class boolean[]>
		//*  52  101:if_acmpne       124
				{
					mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveBooleanArray((boolean[])obj))));
		//   53  104:aload_0         
		//   54  105:getfield        #19  <Field Map mValues>
		//   55  108:aload_1         
		//   56  109:aload_2         
		//   57  110:checkcast       #73  <Class boolean[]>
		//   58  113:invokestatic    #77  <Method Boolean[] Data.convertPrimitiveBooleanArray(boolean[])>
		//   59  116:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//   60  121:pop             
					return this;
		//   61  122:aload_0         
		//   62  123:areturn         
				}
				if(class1 == [I)
		//*  63  124:aload_3         
		//*  64  125:ldc1            #79  <Class int[]>
		//*  65  127:if_acmpne       150
				{
					mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveIntArray((int[])obj))));
		//   66  130:aload_0         
		//   67  131:getfield        #19  <Field Map mValues>
		//   68  134:aload_1         
		//   69  135:aload_2         
		//   70  136:checkcast       #79  <Class int[]>
		//   71  139:invokestatic    #83  <Method Integer[] Data.convertPrimitiveIntArray(int[])>
		//   72  142:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//   73  147:pop             
					return this;
		//   74  148:aload_0         
		//   75  149:areturn         
				}
				if(class1 == [J)
		//*  76  150:aload_3         
		//*  77  151:ldc1            #85  <Class long[]>
		//*  78  153:if_acmpne       176
				{
					mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveLongArray((long[])obj))));
		//   79  156:aload_0         
		//   80  157:getfield        #19  <Field Map mValues>
		//   81  160:aload_1         
		//   82  161:aload_2         
		//   83  162:checkcast       #85  <Class long[]>
		//   84  165:invokestatic    #89  <Method Long[] Data.convertPrimitiveLongArray(long[])>
		//   85  168:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//   86  173:pop             
					return this;
		//   87  174:aload_0         
		//   88  175:areturn         
				}
				if(class1 == [F)
		//*  89  176:aload_3         
		//*  90  177:ldc1            #91  <Class float[]>
		//*  91  179:if_acmpne       202
				{
					mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveFloatArray((float[])obj))));
		//   92  182:aload_0         
		//   93  183:getfield        #19  <Field Map mValues>
		//   94  186:aload_1         
		//   95  187:aload_2         
		//   96  188:checkcast       #91  <Class float[]>
		//   97  191:invokestatic    #95  <Method Float[] Data.convertPrimitiveFloatArray(float[])>
		//   98  194:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//   99  199:pop             
					return this;
		//  100  200:aload_0         
		//  101  201:areturn         
				}
				if(class1 == [D)
		//* 102  202:aload_3         
		//* 103  203:ldc1            #97  <Class double[]>
		//* 104  205:if_acmpne       228
				{
					mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveDoubleArray((double[])obj))));
		//  105  208:aload_0         
		//  106  209:getfield        #19  <Field Map mValues>
		//  107  212:aload_1         
		//  108  213:aload_2         
		//  109  214:checkcast       #97  <Class double[]>
		//  110  217:invokestatic    #101 <Method Double[] Data.convertPrimitiveDoubleArray(double[])>
		//  111  220:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//  112  225:pop             
					return this;
		//  113  226:aload_0         
		//  114  227:areturn         
				} else
				{
					throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[] {
						s, class1
					}));
		//  115  228:new             #103 <Class IllegalArgumentException>
		//  116  231:dup             
		//  117  232:ldc1            #105 <String "Key %s has invalid type %s">
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
		//  128  246:invokestatic    #109 <Method String String.format(String, Object[])>
		//  129  249:invokespecial   #112 <Method void IllegalArgumentException(String)>
		//  130  252:athrow          
				}
			} else
			{
				mValues.put(((Object) (s)), obj);
		//  131  253:aload_0         
		//  132  254:getfield        #19  <Field Map mValues>
		//  133  257:aload_1         
		//  134  258:aload_2         
		//  135  259:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//  136  264:pop             
				return this;
		//  137  265:aload_0         
		//  138  266:areturn         
			}
		}

		public Builder putAll(Data data)
		{
			putAll(data.mValues);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #116 <Field Map Data.mValues>
		//    3    5:invokevirtual   #119 <Method Data$Builder putAll(Map)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder putAll(Map map)
		{
			java.util.Map.Entry entry;
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); put((String)entry.getKey(), entry.getValue()))
		//*   0    0:aload_1         
		//*   1    1:invokeinterface #123 <Method Set Map.entrySet()>
		//*   2    6:invokeinterface #129 <Method Iterator Set.iterator()>
		//*   3   11:astore_1        
		//*   4   12:aload_1         
		//*   5   13:invokeinterface #135 <Method boolean Iterator.hasNext()>
		//*   6   18:ifeq            54
				entry = (java.util.Map.Entry)((Iterator) (map)).next();
		//    7   21:aload_1         
		//    8   22:invokeinterface #139 <Method Object Iterator.next()>
		//    9   27:checkcast       #141 <Class java.util.Map$Entry>
		//   10   30:astore_2        

		//   11   31:aload_0         
		//   12   32:aload_2         
		//   13   33:invokeinterface #144 <Method Object java.util.Map$Entry.getKey()>
		//   14   38:checkcast       #59  <Class String>
		//   15   41:aload_2         
		//   16   42:invokeinterface #147 <Method Object java.util.Map$Entry.getValue()>
		//   17   47:invokevirtual   #149 <Method Data$Builder put(String, Object)>
		//   18   50:pop             
		//*  19   51:goto            12
			return this;
		//   20   54:aload_0         
		//   21   55:areturn         
		}

		public Builder putBoolean(String s, boolean flag)
		{
			mValues.put(((Object) (s)), ((Object) (Boolean.valueOf(flag))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #157 <Method Boolean Boolean.valueOf(boolean)>
		//    5    9:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public Builder putBooleanArray(String s, boolean aflag[])
		{
			mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveBooleanArray(aflag))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #77  <Method Boolean[] Data.convertPrimitiveBooleanArray(boolean[])>
		//    5    9:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public Builder putDouble(String s, double d)
		{
			mValues.put(((Object) (s)), ((Object) (Double.valueOf(d))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:dload_2         
		//    4    6:invokestatic    #164 <Method Double Double.valueOf(double)>
		//    5    9:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public Builder putDoubleArray(String s, double ad[])
		{
			mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveDoubleArray(ad))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #101 <Method Double[] Data.convertPrimitiveDoubleArray(double[])>
		//    5    9:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public Builder putFloat(String s, float f)
		{
			mValues.put(((Object) (s)), ((Object) (Float.valueOf(f))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:fload_2         
		//    4    6:invokestatic    #171 <Method Float Float.valueOf(float)>
		//    5    9:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public Builder putFloatArray(String s, float af[])
		{
			mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveFloatArray(af))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #95  <Method Float[] Data.convertPrimitiveFloatArray(float[])>
		//    5    9:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public Builder putInt(String s, int i)
		{
			mValues.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokestatic    #178 <Method Integer Integer.valueOf(int)>
		//    5    9:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public Builder putIntArray(String s, int ai[])
		{
			mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveIntArray(ai))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #83  <Method Integer[] Data.convertPrimitiveIntArray(int[])>
		//    5    9:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public Builder putLong(String s, long l)
		{
			mValues.put(((Object) (s)), ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokestatic    #185 <Method Long Long.valueOf(long)>
		//    5    9:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public Builder putLongArray(String s, long al[])
		{
			mValues.put(((Object) (s)), ((Object) (Data.convertPrimitiveLongArray(al))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #89  <Method Long[] Data.convertPrimitiveLongArray(long[])>
		//    5    9:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    6   14:pop             
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public Builder putString(String s, String s1)
		{
			mValues.put(((Object) (s)), ((Object) (s1)));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    5   11:pop             
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public Builder putStringArray(String s, String as[])
		{
			mValues.put(((Object) (s)), ((Object) (as)));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Map mValues>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #43  <Method Object Map.put(Object, Object)>
		//    5   11:pop             
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		private Map mValues;

		public Builder()
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


	Data()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:return          
	}

	public Data(Data data)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		mValues = ((Map) (new HashMap(data.mValues)));
	//    2    4:aload_0         
	//    3    5:new             #44  <Class HashMap>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:getfield        #46  <Field Map mValues>
	//    7   13:invokespecial   #49  <Method void HashMap(Map)>
	//    8   16:putfield        #46  <Field Map mValues>
	//    9   19:return          
	}

	Data(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		mValues = ((Map) (new HashMap(map)));
	//    2    4:aload_0         
	//    3    5:new             #44  <Class HashMap>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #49  <Method void HashMap(Map)>
	//    7   13:putfield        #46  <Field Map mValues>
	//    8   16:return          
	}

	static Boolean[] convertPrimitiveBooleanArray(boolean aflag[])
	{
		Boolean aboolean[] = new Boolean[aflag.length];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:anewarray       Boolean[]
	//    3    5:astore_2        
		for(int i = 0; i < aflag.length; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_1        
	//*   6    8:iload_1         
	//*   7    9:aload_0         
	//*   8   10:arraylength     
	//*   9   11:icmpge          30
			aboolean[i] = Boolean.valueOf(aflag[i]);
	//   10   14:aload_2         
	//   11   15:iload_1         
	//   12   16:aload_0         
	//   13   17:iload_1         
	//   14   18:baload          
	//   15   19:invokestatic    #60  <Method Boolean Boolean.valueOf(boolean)>
	//   16   22:aastore         

	//   17   23:iload_1         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_1        
	//*  21   27:goto            8
		return aboolean;
	//   22   30:aload_2         
	//   23   31:areturn         
	}

	static Double[] convertPrimitiveDoubleArray(double ad[])
	{
		Double adouble[] = new Double[ad.length];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:anewarray       Double[]
	//    3    5:astore_2        
		for(int i = 0; i < ad.length; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_1        
	//*   6    8:iload_1         
	//*   7    9:aload_0         
	//*   8   10:arraylength     
	//*   9   11:icmpge          30
			adouble[i] = Double.valueOf(ad[i]);
	//   10   14:aload_2         
	//   11   15:iload_1         
	//   12   16:aload_0         
	//   13   17:iload_1         
	//   14   18:daload          
	//   15   19:invokestatic    #68  <Method Double Double.valueOf(double)>
	//   16   22:aastore         

	//   17   23:iload_1         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_1        
	//*  21   27:goto            8
		return adouble;
	//   22   30:aload_2         
	//   23   31:areturn         
	}

	static Float[] convertPrimitiveFloatArray(float af[])
	{
		Float afloat[] = new Float[af.length];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:anewarray       Float[]
	//    3    5:astore_2        
		for(int i = 0; i < af.length; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_1        
	//*   6    8:iload_1         
	//*   7    9:aload_0         
	//*   8   10:arraylength     
	//*   9   11:icmpge          30
			afloat[i] = Float.valueOf(af[i]);
	//   10   14:aload_2         
	//   11   15:iload_1         
	//   12   16:aload_0         
	//   13   17:iload_1         
	//   14   18:faload          
	//   15   19:invokestatic    #75  <Method Float Float.valueOf(float)>
	//   16   22:aastore         

	//   17   23:iload_1         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_1        
	//*  21   27:goto            8
		return afloat;
	//   22   30:aload_2         
	//   23   31:areturn         
	}

	static Integer[] convertPrimitiveIntArray(int ai[])
	{
		Integer ainteger[] = new Integer[ai.length];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:anewarray       Integer[]
	//    3    5:astore_2        
		for(int i = 0; i < ai.length; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_1        
	//*   6    8:iload_1         
	//*   7    9:aload_0         
	//*   8   10:arraylength     
	//*   9   11:icmpge          30
			ainteger[i] = Integer.valueOf(ai[i]);
	//   10   14:aload_2         
	//   11   15:iload_1         
	//   12   16:aload_0         
	//   13   17:iload_1         
	//   14   18:iaload          
	//   15   19:invokestatic    #82  <Method Integer Integer.valueOf(int)>
	//   16   22:aastore         

	//   17   23:iload_1         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_1        
	//*  21   27:goto            8
		return ainteger;
	//   22   30:aload_2         
	//   23   31:areturn         
	}

	static Long[] convertPrimitiveLongArray(long al[])
	{
		Long along[] = new Long[al.length];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:anewarray       Long[]
	//    3    5:astore_2        
		for(int i = 0; i < al.length; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_1        
	//*   6    8:iload_1         
	//*   7    9:aload_0         
	//*   8   10:arraylength     
	//*   9   11:icmpge          30
			along[i] = Long.valueOf(al[i]);
	//   10   14:aload_2         
	//   11   15:iload_1         
	//   12   16:aload_0         
	//   13   17:iload_1         
	//   14   18:laload          
	//   15   19:invokestatic    #89  <Method Long Long.valueOf(long)>
	//   16   22:aastore         

	//   17   23:iload_1         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_1        
	//*  21   27:goto            8
		return along;
	//   22   30:aload_2         
	//   23   31:areturn         
	}

	public static Data fromByteArray(byte abyte0[])
		throws IllegalStateException
	{
		ByteArrayInputStream bytearrayinputstream;
		HashMap hashmap;
		if(abyte0.length > 10240)
			break MISSING_BLOCK_LABEL_229;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:sipush          10240
	//    3    5:icmpgt          229
		hashmap = new HashMap();
	//    4    8:new             #44  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #103 <Method void HashMap()>
	//    7   15:astore          5
		bytearrayinputstream = new ByteArrayInputStream(abyte0);
	//    8   17:new             #105 <Class ByteArrayInputStream>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:invokespecial   #108 <Method void ByteArrayInputStream(byte[])>
	//   12   25:astore          4
		Object obj = ((Object) (new ObjectInputStream(((java.io.InputStream) (bytearrayinputstream)))));
	//   13   27:new             #110 <Class ObjectInputStream>
	//   14   30:dup             
	//   15   31:aload           4
	//   16   33:invokespecial   #113 <Method void ObjectInputStream(java.io.InputStream)>
	//   17   36:astore_2        
		abyte0 = ((byte []) (obj));
	//   18   37:aload_2         
	//   19   38:astore_0        
		int i = ((ObjectInputStream) (obj)).readInt();
	//   20   39:aload_2         
	//   21   40:invokevirtual   #117 <Method int ObjectInputStream.readInt()>
	//   22   43:istore_1        
_L2:
		if(i <= 0)
			break; /* Loop/switch isn't completed */
	//   23   44:iload_1         
	//   24   45:ifle            73
		abyte0 = ((byte []) (obj));
	//   25   48:aload_2         
	//   26   49:astore_0        
		((Map) (hashmap)).put(((Object) (((ObjectInputStream) (obj)).readUTF())), ((ObjectInputStream) (obj)).readObject());
	//   27   50:aload           5
	//   28   52:aload_2         
	//   29   53:invokevirtual   #121 <Method String ObjectInputStream.readUTF()>
	//   30   56:aload_2         
	//   31   57:invokevirtual   #125 <Method Object ObjectInputStream.readObject()>
	//   32   60:invokeinterface #131 <Method Object Map.put(Object, Object)>
	//   33   65:pop             
		i--;
	//   34   66:iload_1         
	//   35   67:iconst_1        
	//   36   68:isub            
	//   37   69:istore_1        
		if(true) goto _L2; else goto _L1
	//   38   70:goto            44
_L1:
		try
		{
			((ObjectInputStream) (obj)).close();
	//   39   73:aload_2         
	//   40   74:invokevirtual   #134 <Method void ObjectInputStream.close()>
		}
	//*  41   77:goto            91
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  42   80:astore_0        
		{
			Log.e(TAG, "Error in Data#fromByteArray: ", ((Throwable) (abyte0)));
	//   43   81:getstatic       #29  <Field String TAG>
	//   44   84:ldc1            #136 <String "Error in Data#fromByteArray: ">
	//   45   86:aload_0         
	//   46   87:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//   47   90:pop             
		}
		Object obj1;
		try
		{
			bytearrayinputstream.close();
	//   48   91:aload           4
	//   49   93:invokevirtual   #143 <Method void ByteArrayInputStream.close()>
		}
	//*  50   96:goto            175
	//*  51   99:astore_3        
	//*  52  100:goto            122
	//*  53  103:astore_3        
	//*  54  104:goto            122
	//*  55  107:astore_2        
	//*  56  108:aconst_null     
	//*  57  109:astore_0        
	//*  58  110:goto            186
	//*  59  113:astore_0        
	//*  60  114:goto            118
	//*  61  117:astore_0        
	//*  62  118:aconst_null     
	//*  63  119:astore_2        
	//*  64  120:aload_0         
	//*  65  121:astore_3        
	//*  66  122:aload_2         
	//*  67  123:astore_0        
	//*  68  124:getstatic       #29  <Field String TAG>
	//*  69  127:ldc1            #136 <String "Error in Data#fromByteArray: ">
	//*  70  129:aload_3         
	//*  71  130:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//*  72  133:pop             
	//*  73  134:aload_2         
	//*  74  135:ifnull          156
	//*  75  138:aload_2         
	//*  76  139:invokevirtual   #134 <Method void ObjectInputStream.close()>
	//*  77  142:goto            156
	//*  78  145:astore_0        
	//*  79  146:getstatic       #29  <Field String TAG>
	//*  80  149:ldc1            #136 <String "Error in Data#fromByteArray: ">
	//*  81  151:aload_0         
	//*  82  152:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//*  83  155:pop             
	//*  84  156:aload           4
	//*  85  158:invokevirtual   #143 <Method void ByteArrayInputStream.close()>
	//*  86  161:goto            175
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  87  164:astore_0        
		{
			Log.e(TAG, "Error in Data#fromByteArray: ", ((Throwable) (abyte0)));
	//   88  165:getstatic       #29  <Field String TAG>
	//   89  168:ldc1            #136 <String "Error in Data#fromByteArray: ">
	//   90  170:aload_0         
	//   91  171:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//   92  174:pop             
		}
		break MISSING_BLOCK_LABEL_175;
		obj1;
		break MISSING_BLOCK_LABEL_122;
		obj1;
		break MISSING_BLOCK_LABEL_122;
		obj;
		abyte0 = null;
		break MISSING_BLOCK_LABEL_186;
		abyte0;
		break MISSING_BLOCK_LABEL_118;
		abyte0;
		obj = null;
		obj1 = ((Object) (abyte0));
		abyte0 = ((byte []) (obj));
		Log.e(TAG, "Error in Data#fromByteArray: ", ((Throwable) (obj1)));
		if(obj != null)
			try
			{
				((ObjectInputStream) (obj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				Log.e(TAG, "Error in Data#fromByteArray: ", ((Throwable) (abyte0)));
			}
		bytearrayinputstream.close();
		return new Data(((Map) (hashmap)));
	//   93  175:new             #2   <Class Data>
	//   94  178:dup             
	//   95  179:aload           5
	//   96  181:invokespecial   #144 <Method void Data(Map)>
	//   97  184:areturn         
		obj;
	//   98  185:astore_2        
		if(abyte0 != null)
	//*  99  186:aload_0         
	//* 100  187:ifnull          208
			try
			{
				((ObjectInputStream) (abyte0)).close();
	//  101  190:aload_0         
	//  102  191:invokevirtual   #134 <Method void ObjectInputStream.close()>
			}
	//* 103  194:goto            208
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//* 104  197:astore_0        
			{
				Log.e(TAG, "Error in Data#fromByteArray: ", ((Throwable) (abyte0)));
	//  105  198:getstatic       #29  <Field String TAG>
	//  106  201:ldc1            #136 <String "Error in Data#fromByteArray: ">
	//  107  203:aload_0         
	//  108  204:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//  109  207:pop             
			}
		try
		{
			bytearrayinputstream.close();
	//  110  208:aload           4
	//  111  210:invokevirtual   #143 <Method void ByteArrayInputStream.close()>
		}
	//* 112  213:goto            227
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 113  216:astore_0        
		{
			Log.e(TAG, "Error in Data#fromByteArray: ", ((Throwable) (abyte0)));
	//  114  217:getstatic       #29  <Field String TAG>
	//  115  220:ldc1            #136 <String "Error in Data#fromByteArray: ">
	//  116  222:aload_0         
	//  117  223:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//  118  226:pop             
		}
		throw obj;
	//  119  227:aload_2         
	//  120  228:athrow          
		throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
	//  121  229:new             #93  <Class IllegalStateException>
	//  122  232:dup             
	//  123  233:ldc1            #146 <String "Data cannot occupy more than 10240 bytes when serialized">
	//  124  235:invokespecial   #149 <Method void IllegalStateException(String)>
	//  125  238:athrow          
	}

	public static byte[] toByteArray(Data data)
		throws IllegalStateException
	{
		Object obj;
		Object obj1;
		ByteArrayOutputStream bytearrayoutputstream;
		bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #154 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #155 <Method void ByteArrayOutputStream()>
	//    3    7:astore          4
		obj1 = null;
	//    4    9:aconst_null     
	//    5   10:astore_3        
		obj = null;
	//    6   11:aconst_null     
	//    7   12:astore_1        
		byte abyte0[] = ((byte []) (new ObjectOutputStream(((java.io.OutputStream) (bytearrayoutputstream)))));
	//    8   13:new             #157 <Class ObjectOutputStream>
	//    9   16:dup             
	//   10   17:aload           4
	//   11   19:invokespecial   #160 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   12   22:astore_2        
		try
		{
			((ObjectOutputStream) (abyte0)).writeInt(data.size());
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #163 <Method int size()>
	//   16   28:invokevirtual   #167 <Method void ObjectOutputStream.writeInt(int)>
			for(data = ((Data) (data.mValues.entrySet().iterator())); ((Iterator) (data)).hasNext(); ((ObjectOutputStream) (abyte0)).writeObject(((java.util.Map.Entry) (obj)).getValue()))
	//*  17   31:aload_0         
	//*  18   32:getfield        #46  <Field Map mValues>
	//*  19   35:invokeinterface #171 <Method Set Map.entrySet()>
	//*  20   40:invokeinterface #177 <Method Iterator Set.iterator()>
	//*  21   45:astore_0        
	//*  22   46:aload_0         
	//*  23   47:invokeinterface #183 <Method boolean Iterator.hasNext()>
	//*  24   52:ifeq            91
			{
				obj = ((Object) ((java.util.Map.Entry)((Iterator) (data)).next()));
	//   25   55:aload_0         
	//   26   56:invokeinterface #186 <Method Object Iterator.next()>
	//   27   61:checkcast       #188 <Class java.util.Map$Entry>
	//   28   64:astore_1        
				((ObjectOutputStream) (abyte0)).writeUTF((String)((java.util.Map.Entry) (obj)).getKey());
	//   29   65:aload_2         
	//   30   66:aload_1         
	//   31   67:invokeinterface #191 <Method Object java.util.Map$Entry.getKey()>
	//   32   72:checkcast       #193 <Class String>
	//   33   75:invokevirtual   #196 <Method void ObjectOutputStream.writeUTF(String)>
			}

	//   34   78:aload_2         
	//   35   79:aload_1         
	//   36   80:invokeinterface #199 <Method Object java.util.Map$Entry.getValue()>
	//   37   85:invokevirtual   #203 <Method void ObjectOutputStream.writeObject(Object)>
		}
	//*  38   88:goto            46
	//*  39   91:aload_2         
	//*  40   92:invokevirtual   #204 <Method void ObjectOutputStream.close()>
	//*  41   95:goto            109
	//*  42   98:astore_0        
	//*  43   99:getstatic       #29  <Field String TAG>
	//*  44  102:ldc1            #206 <String "Error in Data#toByteArray: ">
	//*  45  104:aload_0         
	//*  46  105:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//*  47  108:pop             
	//*  48  109:aload           4
	//*  49  111:invokevirtual   #207 <Method void ByteArrayOutputStream.close()>
	//*  50  114:goto            128
	//*  51  117:astore_0        
	//*  52  118:getstatic       #29  <Field String TAG>
	//*  53  121:ldc1            #206 <String "Error in Data#toByteArray: ">
	//*  54  123:aload_0         
	//*  55  124:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//*  56  127:pop             
	//*  57  128:aload           4
	//*  58  130:invokevirtual   #208 <Method int ByteArrayOutputStream.size()>
	//*  59  133:sipush          10240
	//*  60  136:icmpgt          145
	//*  61  139:aload           4
	//*  62  141:invokevirtual   #211 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  63  144:areturn         
	//*  64  145:new             #93  <Class IllegalStateException>
	//*  65  148:dup             
	//*  66  149:ldc1            #146 <String "Data cannot occupy more than 10240 bytes when serialized">
	//*  67  151:invokespecial   #149 <Method void IllegalStateException(String)>
	//*  68  154:athrow          
	//*  69  155:astore_0        
	//*  70  156:goto            238
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  71  159:astore_1        
		{
			data = ((Data) (abyte0));
	//   72  160:aload_2         
	//   73  161:astore_0        
			abyte0 = ((byte []) (obj));
	//   74  162:aload_1         
	//   75  163:astore_2        
			break MISSING_BLOCK_LABEL_176;
	//   76  164:goto            176
		}
		try
		{
			((ObjectOutputStream) (abyte0)).close();
		}
		// Misplaced declaration of an exception variable
		catch(Data data)
		{
			Log.e(TAG, "Error in Data#toByteArray: ", ((Throwable) (data)));
		}
		try
		{
			bytearrayoutputstream.close();
		}
		// Misplaced declaration of an exception variable
		catch(Data data)
		{
			Log.e(TAG, "Error in Data#toByteArray: ", ((Throwable) (data)));
		}
		if(bytearrayoutputstream.size() <= 10240)
			return bytearrayoutputstream.toByteArray();
		else
			throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
		data;
		break MISSING_BLOCK_LABEL_238;
		data;
	//   77  167:astore_0        
		abyte0 = ((byte []) (obj));
	//   78  168:aload_1         
	//   79  169:astore_2        
		break MISSING_BLOCK_LABEL_238;
	//   80  170:goto            238
		abyte0;
	//   81  173:astore_2        
		data = ((Data) (obj1));
	//   82  174:aload_3         
	//   83  175:astore_0        
		obj = ((Object) (data));
	//   84  176:aload_0         
	//   85  177:astore_1        
		Log.e(TAG, "Error in Data#toByteArray: ", ((Throwable) (abyte0)));
	//   86  178:getstatic       #29  <Field String TAG>
	//   87  181:ldc1            #206 <String "Error in Data#toByteArray: ">
	//   88  183:aload_2         
	//   89  184:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//   90  187:pop             
		obj = ((Object) (data));
	//   91  188:aload_0         
	//   92  189:astore_1        
		abyte0 = bytearrayoutputstream.toByteArray();
	//   93  190:aload           4
	//   94  192:invokevirtual   #211 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   95  195:astore_2        
		if(data != null)
	//*  96  196:aload_0         
	//*  97  197:ifnull          218
			try
			{
				((ObjectOutputStream) (data)).close();
	//   98  200:aload_0         
	//   99  201:invokevirtual   #204 <Method void ObjectOutputStream.close()>
			}
	//* 100  204:goto            218
			// Misplaced declaration of an exception variable
			catch(Data data)
	//* 101  207:astore_0        
			{
				Log.e(TAG, "Error in Data#toByteArray: ", ((Throwable) (data)));
	//  102  208:getstatic       #29  <Field String TAG>
	//  103  211:ldc1            #206 <String "Error in Data#toByteArray: ">
	//  104  213:aload_0         
	//  105  214:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//  106  217:pop             
			}
		try
		{
			bytearrayoutputstream.close();
	//  107  218:aload           4
	//  108  220:invokevirtual   #207 <Method void ByteArrayOutputStream.close()>
		}
	//* 109  223:aload_2         
	//* 110  224:areturn         
		// Misplaced declaration of an exception variable
		catch(Data data)
	//* 111  225:astore_0        
		{
			Log.e(TAG, "Error in Data#toByteArray: ", ((Throwable) (data)));
	//  112  226:getstatic       #29  <Field String TAG>
	//  113  229:ldc1            #206 <String "Error in Data#toByteArray: ">
	//  114  231:aload_0         
	//  115  232:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//  116  235:pop             
			return abyte0;
	//  117  236:aload_2         
	//  118  237:areturn         
		}
		return abyte0;
		if(abyte0 != null)
	//* 119  238:aload_2         
	//* 120  239:ifnull          260
			try
			{
				((ObjectOutputStream) (abyte0)).close();
	//  121  242:aload_2         
	//  122  243:invokevirtual   #204 <Method void ObjectOutputStream.close()>
			}
	//* 123  246:goto            260
			catch(IOException ioexception)
	//* 124  249:astore_1        
			{
				Log.e(TAG, "Error in Data#toByteArray: ", ((Throwable) (ioexception)));
	//  125  250:getstatic       #29  <Field String TAG>
	//  126  253:ldc1            #206 <String "Error in Data#toByteArray: ">
	//  127  255:aload_1         
	//  128  256:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//  129  259:pop             
			}
		try
		{
			bytearrayoutputstream.close();
	//  130  260:aload           4
	//  131  262:invokevirtual   #207 <Method void ByteArrayOutputStream.close()>
		}
	//* 132  265:goto            279
		catch(IOException ioexception1)
	//* 133  268:astore_1        
		{
			Log.e(TAG, "Error in Data#toByteArray: ", ((Throwable) (ioexception1)));
	//  134  269:getstatic       #29  <Field String TAG>
	//  135  272:ldc1            #206 <String "Error in Data#toByteArray: ">
	//  136  274:aload_1         
	//  137  275:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//  138  278:pop             
		}
		throw data;
	//  139  279:aload_0         
	//  140  280:athrow          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          44
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #217 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #217 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            44
		{
			obj = ((Object) ((Data)obj));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class Data>
	//   15   29:astore_1        
			return mValues.equals(((Object) (((Data) (obj)).mValues)));
	//   16   30:aload_0         
	//   17   31:getfield        #46  <Field Map mValues>
	//   18   34:aload_1         
	//   19   35:getfield        #46  <Field Map mValues>
	//   20   38:invokeinterface #219 <Method boolean Map.equals(Object)>
	//   21   43:ireturn         
		} else
		{
			return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
		}
	}

	public boolean getBoolean(String s, boolean flag)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof Boolean)
	//*   5   11:aload_1         
	//*   6   12:instanceof      #56  <Class Boolean>
	//*   7   15:ifeq            26
			return ((Boolean)s).booleanValue();
	//    8   18:aload_1         
	//    9   19:checkcast       #56  <Class Boolean>
	//   10   22:invokevirtual   #228 <Method boolean Boolean.booleanValue()>
	//   11   25:ireturn         
		else
			return flag;
	//   12   26:iload_2         
	//   13   27:ireturn         
	}

	public boolean[] getBooleanArray(String s)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof Boolean[])
	//*   5   11:aload_1         
	//*   6   12:instanceof      #233 <Class Boolean[]>
	//*   7   15:ifeq            54
		{
			s = ((String) ((Boolean[])s));
	//    8   18:aload_1         
	//    9   19:checkcast       #233 <Class Boolean[]>
	//   10   22:astore_1        
			boolean aflag[] = new boolean[s.length];
	//   11   23:aload_1         
	//   12   24:arraylength     
	//   13   25:newarray        boolean[]
	//   14   27:astore_3        
			for(int i = 0; i < s.length; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:aload_1         
	//*  19   32:arraylength     
	//*  20   33:icmpge          52
				aflag[i] = ((Boolean) (s[i])).booleanValue();
	//   21   36:aload_3         
	//   22   37:iload_2         
	//   23   38:aload_1         
	//   24   39:iload_2         
	//   25   40:aaload          
	//   26   41:invokevirtual   #228 <Method boolean Boolean.booleanValue()>
	//   27   44:bastore         

	//   28   45:iload_2         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_2        
	//*  32   49:goto            30
			return aflag;
	//   33   52:aload_3         
	//   34   53:areturn         
		} else
		{
			return null;
	//   35   54:aconst_null     
	//   36   55:areturn         
		}
	}

	public double getDouble(String s, double d)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof Double)
	//*   5   11:aload_1         
	//*   6   12:instanceof      #65  <Class Double>
	//*   7   15:ifeq            26
			return ((Double)s).doubleValue();
	//    8   18:aload_1         
	//    9   19:checkcast       #65  <Class Double>
	//   10   22:invokevirtual   #239 <Method double Double.doubleValue()>
	//   11   25:dreturn         
		else
			return d;
	//   12   26:dload_2         
	//   13   27:dreturn         
	}

	public double[] getDoubleArray(String s)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof Double[])
	//*   5   11:aload_1         
	//*   6   12:instanceof      #243 <Class Double[]>
	//*   7   15:ifeq            54
		{
			s = ((String) ((Double[])s));
	//    8   18:aload_1         
	//    9   19:checkcast       #243 <Class Double[]>
	//   10   22:astore_1        
			double ad[] = new double[s.length];
	//   11   23:aload_1         
	//   12   24:arraylength     
	//   13   25:newarray        double[]
	//   14   27:astore_3        
			for(int i = 0; i < s.length; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:aload_1         
	//*  19   32:arraylength     
	//*  20   33:icmpge          52
				ad[i] = ((Double) (s[i])).doubleValue();
	//   21   36:aload_3         
	//   22   37:iload_2         
	//   23   38:aload_1         
	//   24   39:iload_2         
	//   25   40:aaload          
	//   26   41:invokevirtual   #239 <Method double Double.doubleValue()>
	//   27   44:dastore         

	//   28   45:iload_2         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_2        
	//*  32   49:goto            30
			return ad;
	//   33   52:aload_3         
	//   34   53:areturn         
		} else
		{
			return null;
	//   35   54:aconst_null     
	//   36   55:areturn         
		}
	}

	public float getFloat(String s, float f)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof Float)
	//*   5   11:aload_1         
	//*   6   12:instanceof      #72  <Class Float>
	//*   7   15:ifeq            26
			return ((Float)s).floatValue();
	//    8   18:aload_1         
	//    9   19:checkcast       #72  <Class Float>
	//   10   22:invokevirtual   #249 <Method float Float.floatValue()>
	//   11   25:freturn         
		else
			return f;
	//   12   26:fload_2         
	//   13   27:freturn         
	}

	public float[] getFloatArray(String s)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof Float[])
	//*   5   11:aload_1         
	//*   6   12:instanceof      #253 <Class Float[]>
	//*   7   15:ifeq            54
		{
			s = ((String) ((Float[])s));
	//    8   18:aload_1         
	//    9   19:checkcast       #253 <Class Float[]>
	//   10   22:astore_1        
			float af[] = new float[s.length];
	//   11   23:aload_1         
	//   12   24:arraylength     
	//   13   25:newarray        float[]
	//   14   27:astore_3        
			for(int i = 0; i < s.length; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:aload_1         
	//*  19   32:arraylength     
	//*  20   33:icmpge          52
				af[i] = ((Float) (s[i])).floatValue();
	//   21   36:aload_3         
	//   22   37:iload_2         
	//   23   38:aload_1         
	//   24   39:iload_2         
	//   25   40:aaload          
	//   26   41:invokevirtual   #249 <Method float Float.floatValue()>
	//   27   44:fastore         

	//   28   45:iload_2         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_2        
	//*  32   49:goto            30
			return af;
	//   33   52:aload_3         
	//   34   53:areturn         
		} else
		{
			return null;
	//   35   54:aconst_null     
	//   36   55:areturn         
		}
	}

	public int getInt(String s, int i)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof Integer)
	//*   5   11:aload_1         
	//*   6   12:instanceof      #79  <Class Integer>
	//*   7   15:ifeq            26
			return ((Integer)s).intValue();
	//    8   18:aload_1         
	//    9   19:checkcast       #79  <Class Integer>
	//   10   22:invokevirtual   #258 <Method int Integer.intValue()>
	//   11   25:ireturn         
		else
			return i;
	//   12   26:iload_2         
	//   13   27:ireturn         
	}

	public int[] getIntArray(String s)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof Integer[])
	//*   5   11:aload_1         
	//*   6   12:instanceof      #262 <Class Integer[]>
	//*   7   15:ifeq            54
		{
			s = ((String) ((Integer[])s));
	//    8   18:aload_1         
	//    9   19:checkcast       #262 <Class Integer[]>
	//   10   22:astore_1        
			int ai[] = new int[s.length];
	//   11   23:aload_1         
	//   12   24:arraylength     
	//   13   25:newarray        int[]
	//   14   27:astore_3        
			for(int i = 0; i < s.length; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:aload_1         
	//*  19   32:arraylength     
	//*  20   33:icmpge          52
				ai[i] = ((Integer) (s[i])).intValue();
	//   21   36:aload_3         
	//   22   37:iload_2         
	//   23   38:aload_1         
	//   24   39:iload_2         
	//   25   40:aaload          
	//   26   41:invokevirtual   #258 <Method int Integer.intValue()>
	//   27   44:iastore         

	//   28   45:iload_2         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_2        
	//*  32   49:goto            30
			return ai;
	//   33   52:aload_3         
	//   34   53:areturn         
		} else
		{
			return null;
	//   35   54:aconst_null     
	//   36   55:areturn         
		}
	}

	public Map getKeyValueMap()
	{
		return Collections.unmodifiableMap(mValues);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:invokestatic    #270 <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	public long getLong(String s, long l)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof Long)
	//*   5   11:aload_1         
	//*   6   12:instanceof      #86  <Class Long>
	//*   7   15:ifeq            26
			return ((Long)s).longValue();
	//    8   18:aload_1         
	//    9   19:checkcast       #86  <Class Long>
	//   10   22:invokevirtual   #277 <Method long Long.longValue()>
	//   11   25:lreturn         
		else
			return l;
	//   12   26:lload_2         
	//   13   27:lreturn         
	}

	public long[] getLongArray(String s)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof Long[])
	//*   5   11:aload_1         
	//*   6   12:instanceof      #281 <Class Long[]>
	//*   7   15:ifeq            54
		{
			s = ((String) ((Long[])s));
	//    8   18:aload_1         
	//    9   19:checkcast       #281 <Class Long[]>
	//   10   22:astore_1        
			long al[] = new long[s.length];
	//   11   23:aload_1         
	//   12   24:arraylength     
	//   13   25:newarray        long[]
	//   14   27:astore_3        
			for(int i = 0; i < s.length; i++)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:aload_1         
	//*  19   32:arraylength     
	//*  20   33:icmpge          52
				al[i] = ((Long) (s[i])).longValue();
	//   21   36:aload_3         
	//   22   37:iload_2         
	//   23   38:aload_1         
	//   24   39:iload_2         
	//   25   40:aaload          
	//   26   41:invokevirtual   #277 <Method long Long.longValue()>
	//   27   44:lastore         

	//   28   45:iload_2         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_2        
	//*  32   49:goto            30
			return al;
	//   33   52:aload_3         
	//   34   53:areturn         
		} else
		{
			return null;
	//   35   54:aconst_null     
	//   36   55:areturn         
		}
	}

	public String getString(String s)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof String)
	//*   5   11:aload_1         
	//*   6   12:instanceof      #193 <Class String>
	//*   7   15:ifeq            23
			return (String)s;
	//    8   18:aload_1         
	//    9   19:checkcast       #193 <Class String>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public String[] getStringArray(String s)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #225 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof String[])
	//*   5   11:aload_1         
	//*   6   12:instanceof      #286 <Class String[]>
	//*   7   15:ifeq            23
			return (String[])s;
	//    8   18:aload_1         
	//    9   19:checkcast       #286 <Class String[]>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public int hashCode()
	{
		return mValues.hashCode() * 31;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:invokeinterface #289 <Method int Map.hashCode()>
	//    3    9:bipush          31
	//    4   11:imul            
	//    5   12:ireturn         
	}

	public int size()
	{
		return mValues.size();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Map mValues>
	//    2    4:invokeinterface #291 <Method int Map.size()>
	//    3    9:ireturn         
	}

	public static final Data EMPTY = (new Builder()).build();
	public static final int MAX_DATA_BYTES = 10240;
	private static final String TAG = Logger.tagWithPrefix("Data");
	Map mValues;

	static 
	{
	//    0    0:ldc1            #21  <String "Data">
	//    1    2:invokestatic    #27  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #29  <Field String TAG>
	//    3    8:new             #6   <Class Data$Builder>
	//    4   11:dup             
	//    5   12:invokespecial   #32  <Method void Data$Builder()>
	//    6   15:invokevirtual   #36  <Method Data Data$Builder.build()>
	//    7   18:putstatic       #38  <Field Data EMPTY>
	//*   8   21:return          
	}
}
