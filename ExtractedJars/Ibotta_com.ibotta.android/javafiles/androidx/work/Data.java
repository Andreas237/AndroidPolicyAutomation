// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import java.io.*;
import java.util.*;

public final class Data
{
	public static final class Builder
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

		public Builder putAll(Data data)
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

		public Builder putAll(Map map)
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

		public Builder putString(String s, String s1)
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
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public Data(Data data)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mValues = ((Map) (new HashMap(data.mValues)));
	//    2    4:aload_0         
	//    3    5:new             #29  <Class HashMap>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:getfield        #31  <Field Map mValues>
	//    7   13:invokespecial   #34  <Method void HashMap(Map)>
	//    8   16:putfield        #31  <Field Map mValues>
	//    9   19:return          
	}

	Data(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mValues = ((Map) (new HashMap(map)));
	//    2    4:aload_0         
	//    3    5:new             #29  <Class HashMap>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #34  <Method void HashMap(Map)>
	//    7   13:putfield        #31  <Field Map mValues>
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
	//   15   19:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
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
	//   15   19:invokestatic    #52  <Method Double Double.valueOf(double)>
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
	//   15   19:invokestatic    #59  <Method Float Float.valueOf(float)>
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
	//   15   19:invokestatic    #66  <Method Integer Integer.valueOf(int)>
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
	//   15   19:invokestatic    #73  <Method Long Long.valueOf(long)>
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
			break MISSING_BLOCK_LABEL_193;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:sipush          10240
	//    3    5:icmpgt          193
		hashmap = new HashMap();
	//    4    8:new             #29  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #87  <Method void HashMap()>
	//    7   15:astore          5
		bytearrayinputstream = new ByteArrayInputStream(abyte0);
	//    8   17:new             #89  <Class ByteArrayInputStream>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:invokespecial   #92  <Method void ByteArrayInputStream(byte[])>
	//   12   25:astore          4
		Object obj = ((Object) (new ObjectInputStream(((java.io.InputStream) (bytearrayinputstream)))));
	//   13   27:new             #94  <Class ObjectInputStream>
	//   14   30:dup             
	//   15   31:aload           4
	//   16   33:invokespecial   #97  <Method void ObjectInputStream(java.io.InputStream)>
	//   17   36:astore_2        
		abyte0 = ((byte []) (obj));
	//   18   37:aload_2         
	//   19   38:astore_0        
		int i = ((ObjectInputStream) (obj)).readInt();
	//   20   39:aload_2         
	//   21   40:invokevirtual   #101 <Method int ObjectInputStream.readInt()>
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
	//   29   53:invokevirtual   #105 <Method String ObjectInputStream.readUTF()>
	//   30   56:aload_2         
	//   31   57:invokevirtual   #109 <Method Object ObjectInputStream.readObject()>
	//   32   60:invokeinterface #115 <Method Object Map.put(Object, Object)>
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
	//   40   74:invokevirtual   #118 <Method void ObjectInputStream.close()>
		}
	//*  41   77:goto            85
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  42   80:astore_0        
		{
			((IOException) (abyte0)).printStackTrace();
	//   43   81:aload_0         
	//   44   82:invokevirtual   #121 <Method void IOException.printStackTrace()>
		}
		Object obj1;
		try
		{
			bytearrayinputstream.close();
	//   45   85:aload           4
	//   46   87:invokevirtual   #122 <Method void ByteArrayInputStream.close()>
		}
	//*  47   90:goto            151
	//*  48   93:astore_3        
	//*  49   94:goto            116
	//*  50   97:astore_3        
	//*  51   98:goto            116
	//*  52  101:astore_2        
	//*  53  102:aconst_null     
	//*  54  103:astore_0        
	//*  55  104:goto            162
	//*  56  107:astore_0        
	//*  57  108:goto            112
	//*  58  111:astore_0        
	//*  59  112:aconst_null     
	//*  60  113:astore_2        
	//*  61  114:aload_0         
	//*  62  115:astore_3        
	//*  63  116:aload_2         
	//*  64  117:astore_0        
	//*  65  118:aload_3         
	//*  66  119:invokevirtual   #125 <Method void Exception.printStackTrace()>
	//*  67  122:aload_2         
	//*  68  123:ifnull          138
	//*  69  126:aload_2         
	//*  70  127:invokevirtual   #118 <Method void ObjectInputStream.close()>
	//*  71  130:goto            138
	//*  72  133:astore_0        
	//*  73  134:aload_0         
	//*  74  135:invokevirtual   #121 <Method void IOException.printStackTrace()>
	//*  75  138:aload           4
	//*  76  140:invokevirtual   #122 <Method void ByteArrayInputStream.close()>
	//*  77  143:goto            151
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  78  146:astore_0        
		{
			((IOException) (abyte0)).printStackTrace();
	//   79  147:aload_0         
	//   80  148:invokevirtual   #121 <Method void IOException.printStackTrace()>
		}
		break MISSING_BLOCK_LABEL_151;
		obj1;
		break MISSING_BLOCK_LABEL_116;
		obj1;
		break MISSING_BLOCK_LABEL_116;
		obj;
		abyte0 = null;
		break MISSING_BLOCK_LABEL_162;
		abyte0;
		break MISSING_BLOCK_LABEL_112;
		abyte0;
		obj = null;
		obj1 = ((Object) (abyte0));
		abyte0 = ((byte []) (obj));
		((Exception) (obj1)).printStackTrace();
		if(obj != null)
			try
			{
				((ObjectInputStream) (obj)).close();
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				((IOException) (abyte0)).printStackTrace();
			}
		bytearrayinputstream.close();
		return new Data(((Map) (hashmap)));
	//   81  151:new             #2   <Class Data>
	//   82  154:dup             
	//   83  155:aload           5
	//   84  157:invokespecial   #126 <Method void Data(Map)>
	//   85  160:areturn         
		obj;
	//   86  161:astore_2        
		if(abyte0 != null)
	//*  87  162:aload_0         
	//*  88  163:ifnull          178
			try
			{
				((ObjectInputStream) (abyte0)).close();
	//   89  166:aload_0         
	//   90  167:invokevirtual   #118 <Method void ObjectInputStream.close()>
			}
	//*  91  170:goto            178
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  92  173:astore_0        
			{
				((IOException) (abyte0)).printStackTrace();
	//   93  174:aload_0         
	//   94  175:invokevirtual   #121 <Method void IOException.printStackTrace()>
			}
		try
		{
			bytearrayinputstream.close();
	//   95  178:aload           4
	//   96  180:invokevirtual   #122 <Method void ByteArrayInputStream.close()>
		}
	//*  97  183:goto            191
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  98  186:astore_0        
		{
			((IOException) (abyte0)).printStackTrace();
	//   99  187:aload_0         
	//  100  188:invokevirtual   #121 <Method void IOException.printStackTrace()>
		}
		throw obj;
	//  101  191:aload_2         
	//  102  192:athrow          
		throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
	//  103  193:new             #77  <Class IllegalStateException>
	//  104  196:dup             
	//  105  197:ldc1            #128 <String "Data cannot occupy more than 10240 bytes when serialized">
	//  106  199:invokespecial   #131 <Method void IllegalStateException(String)>
	//  107  202:athrow          
	}

	public static byte[] toByteArray(Data data)
		throws IllegalStateException
	{
		Object obj;
		Object obj2;
		ByteArrayOutputStream bytearrayoutputstream;
		bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #137 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void ByteArrayOutputStream()>
	//    3    7:astore          4
		obj2 = null;
	//    4    9:aconst_null     
	//    5   10:astore_3        
		obj = null;
	//    6   11:aconst_null     
	//    7   12:astore_1        
		Object obj1 = ((Object) (new ObjectOutputStream(((java.io.OutputStream) (bytearrayoutputstream)))));
	//    8   13:new             #140 <Class ObjectOutputStream>
	//    9   16:dup             
	//   10   17:aload           4
	//   11   19:invokespecial   #143 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   12   22:astore_2        
		try
		{
			((ObjectOutputStream) (obj1)).writeInt(data.size());
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #146 <Method int size()>
	//   16   28:invokevirtual   #150 <Method void ObjectOutputStream.writeInt(int)>
			for(data = ((Data) (data.mValues.entrySet().iterator())); ((Iterator) (data)).hasNext(); ((ObjectOutputStream) (obj1)).writeObject(((java.util.Map.Entry) (obj)).getValue()))
	//*  17   31:aload_0         
	//*  18   32:getfield        #31  <Field Map mValues>
	//*  19   35:invokeinterface #154 <Method Set Map.entrySet()>
	//*  20   40:invokeinterface #160 <Method Iterator Set.iterator()>
	//*  21   45:astore_0        
	//*  22   46:aload_0         
	//*  23   47:invokeinterface #166 <Method boolean Iterator.hasNext()>
	//*  24   52:ifeq            91
			{
				obj = ((Object) ((java.util.Map.Entry)((Iterator) (data)).next()));
	//   25   55:aload_0         
	//   26   56:invokeinterface #169 <Method Object Iterator.next()>
	//   27   61:checkcast       #171 <Class java.util.Map$Entry>
	//   28   64:astore_1        
				((ObjectOutputStream) (obj1)).writeUTF((String)((java.util.Map.Entry) (obj)).getKey());
	//   29   65:aload_2         
	//   30   66:aload_1         
	//   31   67:invokeinterface #174 <Method Object java.util.Map$Entry.getKey()>
	//   32   72:checkcast       #176 <Class String>
	//   33   75:invokevirtual   #179 <Method void ObjectOutputStream.writeUTF(String)>
			}

	//   34   78:aload_2         
	//   35   79:aload_1         
	//   36   80:invokeinterface #182 <Method Object java.util.Map$Entry.getValue()>
	//   37   85:invokevirtual   #186 <Method void ObjectOutputStream.writeObject(Object)>
		}
	//*  38   88:goto            46
	//*  39   91:aload_2         
	//*  40   92:invokevirtual   #187 <Method void ObjectOutputStream.close()>
	//*  41   95:goto            103
	//*  42   98:astore_0        
	//*  43   99:aload_0         
	//*  44  100:invokevirtual   #121 <Method void IOException.printStackTrace()>
	//*  45  103:aload           4
	//*  46  105:invokevirtual   #188 <Method void ByteArrayOutputStream.close()>
	//*  47  108:goto            167
	//*  48  111:astore_0        
	//*  49  112:goto            194
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  50  115:astore_1        
		{
			data = ((Data) (obj1));
	//   51  116:aload_2         
	//   52  117:astore_0        
			obj1 = obj;
	//   53  118:aload_1         
	//   54  119:astore_2        
			break MISSING_BLOCK_LABEL_132;
	//   55  120:goto            132
		}
		try
		{
			((ObjectOutputStream) (obj1)).close();
		}
		// Misplaced declaration of an exception variable
		catch(Data data)
		{
			((IOException) (data)).printStackTrace();
		}
		try
		{
			bytearrayoutputstream.close();
		}
	//*  56  123:astore_0        
	//*  57  124:aload_1         
	//*  58  125:astore_2        
	//*  59  126:goto            194
	//*  60  129:astore_2        
	//*  61  130:aload_3         
	//*  62  131:astore_0        
	//*  63  132:aload_0         
	//*  64  133:astore_1        
	//*  65  134:aload_2         
	//*  66  135:invokevirtual   #121 <Method void IOException.printStackTrace()>
	//*  67  138:aload_0         
	//*  68  139:ifnull          154
	//*  69  142:aload_0         
	//*  70  143:invokevirtual   #187 <Method void ObjectOutputStream.close()>
	//*  71  146:goto            154
	//*  72  149:astore_0        
	//*  73  150:aload_0         
	//*  74  151:invokevirtual   #121 <Method void IOException.printStackTrace()>
	//*  75  154:aload           4
	//*  76  156:invokevirtual   #188 <Method void ByteArrayOutputStream.close()>
	//*  77  159:goto            167
		// Misplaced declaration of an exception variable
		catch(Data data)
	//*  78  162:astore_0        
		{
			((IOException) (data)).printStackTrace();
	//   79  163:aload_0         
	//   80  164:invokevirtual   #121 <Method void IOException.printStackTrace()>
		}
		break MISSING_BLOCK_LABEL_167;
		data;
		break MISSING_BLOCK_LABEL_194;
		data;
		obj1 = obj;
		break MISSING_BLOCK_LABEL_194;
		obj1;
		data = ((Data) (obj2));
		obj = ((Object) (data));
		((IOException) (obj1)).printStackTrace();
		if(data != null)
			try
			{
				((ObjectOutputStream) (data)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Data data)
			{
				((IOException) (data)).printStackTrace();
			}
		bytearrayoutputstream.close();
		if(bytearrayoutputstream.size() <= 10240)
	//*  81  167:aload           4
	//*  82  169:invokevirtual   #189 <Method int ByteArrayOutputStream.size()>
	//*  83  172:sipush          10240
	//*  84  175:icmpgt          184
			return bytearrayoutputstream.toByteArray();
	//   85  178:aload           4
	//   86  180:invokevirtual   #192 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   87  183:areturn         
		else
			throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
	//   88  184:new             #77  <Class IllegalStateException>
	//   89  187:dup             
	//   90  188:ldc1            #128 <String "Data cannot occupy more than 10240 bytes when serialized">
	//   91  190:invokespecial   #131 <Method void IllegalStateException(String)>
	//   92  193:athrow          
		if(obj1 != null)
	//*  93  194:aload_2         
	//*  94  195:ifnull          210
			try
			{
				((ObjectOutputStream) (obj1)).close();
	//   95  198:aload_2         
	//   96  199:invokevirtual   #187 <Method void ObjectOutputStream.close()>
			}
	//*  97  202:goto            210
			catch(IOException ioexception)
	//*  98  205:astore_1        
			{
				ioexception.printStackTrace();
	//   99  206:aload_1         
	//  100  207:invokevirtual   #121 <Method void IOException.printStackTrace()>
			}
		try
		{
			bytearrayoutputstream.close();
	//  101  210:aload           4
	//  102  212:invokevirtual   #188 <Method void ByteArrayOutputStream.close()>
		}
	//* 103  215:goto            223
		catch(IOException ioexception1)
	//* 104  218:astore_1        
		{
			ioexception1.printStackTrace();
	//  105  219:aload_1         
	//  106  220:invokevirtual   #121 <Method void IOException.printStackTrace()>
		}
		throw data;
	//  107  223:aload_0         
	//  108  224:athrow          
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
	//*   8   12:invokevirtual   #198 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #198 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            44
		{
			obj = ((Object) ((Data)obj));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class Data>
	//   15   29:astore_1        
			return mValues.equals(((Object) (((Data) (obj)).mValues)));
	//   16   30:aload_0         
	//   17   31:getfield        #31  <Field Map mValues>
	//   18   34:aload_1         
	//   19   35:getfield        #31  <Field Map mValues>
	//   20   38:invokeinterface #200 <Method boolean Map.equals(Object)>
	//   21   43:ireturn         
		} else
		{
			return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
		}
	}

	public Map getKeyValueMap()
	{
		return Collections.unmodifiableMap(mValues);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Map mValues>
	//    2    4:invokestatic    #208 <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	public String getString(String s)
	{
		s = ((String) (mValues.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Map mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #216 <Method Object Map.get(Object)>
	//    4   10:astore_1        
		if(s instanceof String)
	//*   5   11:aload_1         
	//*   6   12:instanceof      #176 <Class String>
	//*   7   15:ifeq            23
			return (String)s;
	//    8   18:aload_1         
	//    9   19:checkcast       #176 <Class String>
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
	//    1    1:getfield        #31  <Field Map mValues>
	//    2    4:invokeinterface #219 <Method int Map.hashCode()>
	//    3    9:bipush          31
	//    4   11:imul            
	//    5   12:ireturn         
	}

	public int size()
	{
		return mValues.size();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Map mValues>
	//    2    4:invokeinterface #221 <Method int Map.size()>
	//    3    9:ireturn         
	}

	public static final Data EMPTY = (new Builder()).build();
	Map mValues;

	static 
	{
	//    0    0:new             #6   <Class Data$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void Data$Builder()>
	//    3    7:invokevirtual   #21  <Method Data Data$Builder.build()>
	//    4   10:putstatic       #23  <Field Data EMPTY>
	//*   5   13:return          
	}
}
