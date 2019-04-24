// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zzn;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzad, MapValue

public final class Value extends zza
{

	public Value(int i)
	{
		this(3, i, false, 0.0F, ((String) (null)), ((Bundle) (null)), ((int []) (null)), ((float []) (null)), ((byte []) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:iload_1         
	//    3    3:iconst_0        
	//    4    4:fconst_0        
	//    5    5:aconst_null     
	//    6    6:aconst_null     
	//    7    7:aconst_null     
	//    8    8:aconst_null     
	//    9    9:aconst_null     
	//   10   10:invokespecial   #39  <Method void Value(int, int, boolean, float, String, Bundle, int[], float[], byte[])>
	//   11   13:return          
	}

	Value(int i, int j, boolean flag, float f, String s, Bundle bundle, int ai[], 
			float af[], byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #42  <Field int versionCode>
		format = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #44  <Field int format>
		zzaUq = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #46  <Field boolean zzaUq>
		value = f;
	//   11   19:aload_0         
	//   12   20:fload           4
	//   13   22:putfield        #48  <Field float value>
		zzaGV = s;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #50  <Field String zzaGV>
		zzaUr = zzB(bundle);
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:invokestatic    #54  <Method Map zzB(Bundle)>
	//   20   37:putfield        #56  <Field Map zzaUr>
		zzaUs = ai;
	//   21   40:aload_0         
	//   22   41:aload           7
	//   23   43:putfield        #58  <Field int[] zzaUs>
		zzaUt = af;
	//   24   46:aload_0         
	//   25   47:aload           8
	//   26   49:putfield        #60  <Field float[] zzaUt>
		zzaUu = abyte0;
	//   27   52:aload_0         
	//   28   53:aload           9
	//   29   55:putfield        #62  <Field byte[] zzaUu>
	//   30   58:return          
	}

	private static Map zzB(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		bundle.setClassLoader(((Class) (com/google/android/gms/fitness/data/MapValue)).getClassLoader());
	//    4    6:aload_0         
	//    5    7:ldc1            #64  <Class MapValue>
	//    6    9:invokevirtual   #70  <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #76  <Method void Bundle.setClassLoader(ClassLoader)>
		ArrayMap arraymap = new ArrayMap(bundle.size());
	//    8   15:new             #78  <Class ArrayMap>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:invokevirtual   #82  <Method int Bundle.size()>
	//   12   23:invokespecial   #84  <Method void ArrayMap(int)>
	//   13   26:astore_1        
		String s;
		for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); ((Map) (arraymap)).put(((Object) (s)), ((Object) ((MapValue)bundle.getParcelable(s)))))
	//*  14   27:aload_0         
	//*  15   28:invokevirtual   #88  <Method Set Bundle.keySet()>
	//*  16   31:invokeinterface #94  <Method Iterator Set.iterator()>
	//*  17   36:astore_2        
	//*  18   37:aload_2         
	//*  19   38:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  20   43:ifeq            75
			s = (String)iterator.next();
	//   21   46:aload_2         
	//   22   47:invokeinterface #104 <Method Object Iterator.next()>
	//   23   52:checkcast       #106 <Class String>
	//   24   55:astore_3        

	//   25   56:aload_1         
	//   26   57:aload_3         
	//   27   58:aload_0         
	//   28   59:aload_3         
	//   29   60:invokevirtual   #110 <Method Parcelable Bundle.getParcelable(String)>
	//   30   63:checkcast       #64  <Class MapValue>
	//   31   66:invokeinterface #116 <Method Object Map.put(Object, Object)>
	//   32   71:pop             
	//*  33   72:goto            37
		return ((Map) (arraymap));
	//   34   75:aload_1         
	//   35   76:areturn         
	}

	private boolean zza(Value value1)
	{
		if(format == value1.format && zzaUq == value1.zzaUq)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int format>
	//*   2    4:aload_1         
	//*   3    5:getfield        #44  <Field int format>
	//*   4    8:icmpne          178
	//*   5   11:aload_0         
	//*   6   12:getfield        #46  <Field boolean zzaUq>
	//*   7   15:aload_1         
	//*   8   16:getfield        #46  <Field boolean zzaUq>
	//*   9   19:icmpne          178
		{
			switch(format)
	//*  10   22:aload_0         
	//*  11   23:getfield        #44  <Field int format>
			{
	//*  12   26:tableswitch     1 7: default 68
	//	               1 71
	//	               2 86
	//	               3 102
	//	               4 114
	//	               5 126
	//	               6 138
	//	               7 150
	//*  13   68:goto            162
			case 1: // '\001'
				return asInt() == value1.asInt();
	//   14   71:aload_0         
	//   15   72:invokevirtual   #123 <Method int asInt()>
	//   16   75:aload_1         
	//   17   76:invokevirtual   #123 <Method int asInt()>
	//   18   79:icmpne          84
	//   19   82:iconst_1        
	//   20   83:ireturn         
	//   21   84:iconst_0        
	//   22   85:ireturn         

			case 2: // '\002'
				return value == value1.value;
	//   23   86:aload_0         
	//   24   87:getfield        #48  <Field float value>
	//   25   90:aload_1         
	//   26   91:getfield        #48  <Field float value>
	//   27   94:fcmpl           
	//   28   95:ifne            100
	//   29   98:iconst_1        
	//   30   99:ireturn         
	//   31  100:iconst_0        
	//   32  101:ireturn         

			case 3: // '\003'
				return zzaa.equal(((Object) (zzaGV)), ((Object) (value1.zzaGV)));
	//   33  102:aload_0         
	//   34  103:getfield        #50  <Field String zzaGV>
	//   35  106:aload_1         
	//   36  107:getfield        #50  <Field String zzaGV>
	//   37  110:invokestatic    #129 <Method boolean zzaa.equal(Object, Object)>
	//   38  113:ireturn         

			case 4: // '\004'
				return zzaa.equal(((Object) (zzaUr)), ((Object) (value1.zzaUr)));
	//   39  114:aload_0         
	//   40  115:getfield        #56  <Field Map zzaUr>
	//   41  118:aload_1         
	//   42  119:getfield        #56  <Field Map zzaUr>
	//   43  122:invokestatic    #129 <Method boolean zzaa.equal(Object, Object)>
	//   44  125:ireturn         

			case 5: // '\005'
				return Arrays.equals(zzaUs, value1.zzaUs);
	//   45  126:aload_0         
	//   46  127:getfield        #58  <Field int[] zzaUs>
	//   47  130:aload_1         
	//   48  131:getfield        #58  <Field int[] zzaUs>
	//   49  134:invokestatic    #135 <Method boolean Arrays.equals(int[], int[])>
	//   50  137:ireturn         

			case 6: // '\006'
				return Arrays.equals(zzaUt, value1.zzaUt);
	//   51  138:aload_0         
	//   52  139:getfield        #60  <Field float[] zzaUt>
	//   53  142:aload_1         
	//   54  143:getfield        #60  <Field float[] zzaUt>
	//   55  146:invokestatic    #138 <Method boolean Arrays.equals(float[], float[])>
	//   56  149:ireturn         

			case 7: // '\007'
				return Arrays.equals(zzaUu, value1.zzaUu);
	//   57  150:aload_0         
	//   58  151:getfield        #62  <Field byte[] zzaUu>
	//   59  154:aload_1         
	//   60  155:getfield        #62  <Field byte[] zzaUu>
	//   61  158:invokestatic    #141 <Method boolean Arrays.equals(byte[], byte[])>
	//   62  161:ireturn         
			}
			return value == value1.value;
	//   63  162:aload_0         
	//   64  163:getfield        #48  <Field float value>
	//   65  166:aload_1         
	//   66  167:getfield        #48  <Field float value>
	//   67  170:fcmpl           
	//   68  171:ifne            176
	//   69  174:iconst_1        
	//   70  175:ireturn         
	//   71  176:iconst_0        
	//   72  177:ireturn         
		} else
		{
			return false;
	//   73  178:iconst_0        
	//   74  179:ireturn         
		}
	}

	public String asActivity()
	{
		return com.google.android.gms.fitness.zza.getName(asInt());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method int asInt()>
	//    2    4:invokestatic    #149 <Method String com.google.android.gms.fitness.zza.getName(int)>
	//    3    7:areturn         
	}

	public float asFloat()
	{
		boolean flag;
		if(format == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int format>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		zzac.zza(flag, "Value is not in float format");
	//    9   15:iload_1         
	//   10   16:ldc1            #153 <String "Value is not in float format">
	//   11   18:invokestatic    #158 <Method void zzac.zza(boolean, Object)>
		return value;
	//   12   21:aload_0         
	//   13   22:getfield        #48  <Field float value>
	//   14   25:freturn         
	}

	public int asInt()
	{
		boolean flag;
		if(format == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int format>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		zzac.zza(flag, "Value is not in int format");
	//    9   15:iload_1         
	//   10   16:ldc1            #160 <String "Value is not in int format">
	//   11   18:invokestatic    #158 <Method void zzac.zza(boolean, Object)>
		return Float.floatToRawIntBits(value);
	//   12   21:aload_0         
	//   13   22:getfield        #48  <Field float value>
	//   14   25:invokestatic    #166 <Method int Float.floatToRawIntBits(float)>
	//   15   28:ireturn         
	}

	public String asString()
	{
		boolean flag;
		if(format == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int format>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		zzac.zza(flag, "Value is not in string format");
	//    9   15:iload_1         
	//   10   16:ldc1            #169 <String "Value is not in string format">
	//   11   18:invokestatic    #158 <Method void zzac.zza(boolean, Object)>
		return zzaGV;
	//   12   21:aload_0         
	//   13   22:getfield        #50  <Field String zzaGV>
	//   14   25:areturn         
	}

	public void clearKey(String s)
	{
		boolean flag;
		if(format == 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int format>
	//*   2    4:iconst_4        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		zzac.zza(flag, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
	//    9   15:iload_2         
	//   10   16:ldc1            #173 <String "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.">
	//   11   18:invokestatic    #158 <Method void zzac.zza(boolean, Object)>
		if(zzaUr != null)
	//*  12   21:aload_0         
	//*  13   22:getfield        #56  <Field Map zzaUr>
	//*  14   25:ifnull          39
			zzaUr.remove(((Object) (s)));
	//   15   28:aload_0         
	//   16   29:getfield        #56  <Field Map zzaUr>
	//   17   32:aload_1         
	//   18   33:invokeinterface #177 <Method Object Map.remove(Object)>
	//   19   38:pop             
	//   20   39:return          
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof Value) && zza((Value)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class Value>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Value>
	//    9   17:invokespecial   #180 <Method boolean zza(Value)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public int getFormat()
	{
		return format;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int format>
	//    2    4:ireturn         
	}

	public Float getKeyValue(String s)
	{
		boolean flag;
		if(format == 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int format>
	//*   2    4:iconst_4        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		zzac.zza(flag, "Value is not in float map format");
	//    9   15:iload_2         
	//   10   16:ldc1            #186 <String "Value is not in float map format">
	//   11   18:invokestatic    #158 <Method void zzac.zza(boolean, Object)>
		if(zzaUr != null && zzaUr.containsKey(((Object) (s))))
	//*  12   21:aload_0         
	//*  13   22:getfield        #56  <Field Map zzaUr>
	//*  14   25:ifnull          61
	//*  15   28:aload_0         
	//*  16   29:getfield        #56  <Field Map zzaUr>
	//*  17   32:aload_1         
	//*  18   33:invokeinterface #189 <Method boolean Map.containsKey(Object)>
	//*  19   38:ifeq            61
			return Float.valueOf(((MapValue)zzaUr.get(((Object) (s)))).asFloat());
	//   20   41:aload_0         
	//   21   42:getfield        #56  <Field Map zzaUr>
	//   22   45:aload_1         
	//   23   46:invokeinterface #192 <Method Object Map.get(Object)>
	//   24   51:checkcast       #64  <Class MapValue>
	//   25   54:invokevirtual   #194 <Method float MapValue.asFloat()>
	//   26   57:invokestatic    #198 <Method Float Float.valueOf(float)>
	//   27   60:areturn         
		else
			return null;
	//   28   61:aconst_null     
	//   29   62:areturn         
	}

	int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int versionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Float.valueOf(value), zzaGV, zzaUr, zzaUs, zzaUt, zzaUu
		});
	//    0    0:bipush          6
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #48  <Field float value>
	//    6   11:invokestatic    #198 <Method Float Float.valueOf(float)>
	//    7   14:aastore         
	//    8   15:dup             
	//    9   16:iconst_1        
	//   10   17:aload_0         
	//   11   18:getfield        #50  <Field String zzaGV>
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_2        
	//   15   24:aload_0         
	//   16   25:getfield        #56  <Field Map zzaUr>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:aload_0         
	//   21   32:getfield        #58  <Field int[] zzaUs>
	//   22   35:aastore         
	//   23   36:dup             
	//   24   37:iconst_4        
	//   25   38:aload_0         
	//   26   39:getfield        #60  <Field float[] zzaUt>
	//   27   42:aastore         
	//   28   43:dup             
	//   29   44:iconst_5        
	//   30   45:aload_0         
	//   31   46:getfield        #62  <Field byte[] zzaUu>
	//   32   49:aastore         
	//   33   50:invokestatic    #206 <Method int zzaa.hashCode(Object[])>
	//   34   53:ireturn         
	}

	public boolean isSet()
	{
		return zzaUq;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean zzaUq>
	//    2    4:ireturn         
	}

	public void setActivity(String s)
	{
		setInt(com.google.android.gms.fitness.zza.zzdU(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #212 <Method int com.google.android.gms.fitness.zza.zzdU(String)>
	//    3    5:invokevirtual   #215 <Method void setInt(int)>
	//    4    8:return          
	}

	public void setFloat(float f)
	{
		boolean flag;
		if(format == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int format>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		zzac.zza(flag, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
	//    9   15:iload_2         
	//   10   16:ldc1            #219 <String "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.">
	//   11   18:invokestatic    #158 <Method void zzac.zza(boolean, Object)>
		zzaUq = true;
	//   12   21:aload_0         
	//   13   22:iconst_1        
	//   14   23:putfield        #46  <Field boolean zzaUq>
		value = f;
	//   15   26:aload_0         
	//   16   27:fload_1         
	//   17   28:putfield        #48  <Field float value>
	//   18   31:return          
	}

	public void setInt(int i)
	{
		boolean flag;
		if(format == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int format>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		zzac.zza(flag, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
	//    9   15:iload_2         
	//   10   16:ldc1            #221 <String "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.">
	//   11   18:invokestatic    #158 <Method void zzac.zza(boolean, Object)>
		zzaUq = true;
	//   12   21:aload_0         
	//   13   22:iconst_1        
	//   14   23:putfield        #46  <Field boolean zzaUq>
		value = Float.intBitsToFloat(i);
	//   15   26:aload_0         
	//   16   27:iload_1         
	//   17   28:invokestatic    #225 <Method float Float.intBitsToFloat(int)>
	//   18   31:putfield        #48  <Field float value>
	//   19   34:return          
	}

	public void setKeyValue(String s, float f)
	{
		boolean flag;
		if(format == 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int format>
	//*   2    4:iconst_4        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_3        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		zzac.zza(flag, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
	//    9   15:iload_3         
	//   10   16:ldc1            #173 <String "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.">
	//   11   18:invokestatic    #158 <Method void zzac.zza(boolean, Object)>
		zzaUq = true;
	//   12   21:aload_0         
	//   13   22:iconst_1        
	//   14   23:putfield        #46  <Field boolean zzaUq>
		if(zzaUr == null)
	//*  15   26:aload_0         
	//*  16   27:getfield        #56  <Field Map zzaUr>
	//*  17   30:ifnonnull       44
			zzaUr = ((Map) (new HashMap()));
	//   18   33:aload_0         
	//   19   34:new             #229 <Class HashMap>
	//   20   37:dup             
	//   21   38:invokespecial   #230 <Method void HashMap()>
	//   22   41:putfield        #56  <Field Map zzaUr>
		zzaUr.put(((Object) (s)), ((Object) (MapValue.zzd(f))));
	//   23   44:aload_0         
	//   24   45:getfield        #56  <Field Map zzaUr>
	//   25   48:aload_1         
	//   26   49:fload_2         
	//   27   50:invokestatic    #234 <Method MapValue MapValue.zzd(float)>
	//   28   53:invokeinterface #116 <Method Object Map.put(Object, Object)>
	//   29   58:pop             
	//   30   59:return          
	}

	public void setString(String s)
	{
		boolean flag;
		if(format == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int format>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		zzac.zza(flag, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
	//    9   15:iload_2         
	//   10   16:ldc1            #237 <String "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.">
	//   11   18:invokestatic    #158 <Method void zzac.zza(boolean, Object)>
		zzaUq = true;
	//   12   21:aload_0         
	//   13   22:iconst_1        
	//   14   23:putfield        #46  <Field boolean zzaUq>
		zzaGV = s;
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:putfield        #50  <Field String zzaGV>
	//   18   31:return          
	}

	public String toString()
	{
		if(!zzaUq)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field boolean zzaUq>
	//*   2    4:ifne            10
			return "unset";
	//    3    7:ldc1            #240 <String "unset">
	//    4    9:areturn         
		switch(format)
	//*   5   10:aload_0         
	//*   6   11:getfield        #44  <Field int format>
		{
	//*   7   14:tableswitch     1 7: default 56
	//	               1 59
	//	               2 67
	//	               3 75
	//	               4 80
	//	               5 95
	//	               6 103
	//	               7 111
	//*   8   56:goto            126
		case 1: // '\001'
			return Integer.toString(asInt());
	//    9   59:aload_0         
	//   10   60:invokevirtual   #123 <Method int asInt()>
	//   11   63:invokestatic    #244 <Method String Integer.toString(int)>
	//   12   66:areturn         

		case 2: // '\002'
			return Float.toString(value);
	//   13   67:aload_0         
	//   14   68:getfield        #48  <Field float value>
	//   15   71:invokestatic    #247 <Method String Float.toString(float)>
	//   16   74:areturn         

		case 3: // '\003'
			return zzaGV;
	//   17   75:aload_0         
	//   18   76:getfield        #50  <Field String zzaGV>
	//   19   79:areturn         

		case 4: // '\004'
			return (new TreeMap(zzaUr)).toString();
	//   20   80:new             #249 <Class TreeMap>
	//   21   83:dup             
	//   22   84:aload_0         
	//   23   85:getfield        #56  <Field Map zzaUr>
	//   24   88:invokespecial   #252 <Method void TreeMap(Map)>
	//   25   91:invokevirtual   #254 <Method String TreeMap.toString()>
	//   26   94:areturn         

		case 5: // '\005'
			return Arrays.toString(zzaUs);
	//   27   95:aload_0         
	//   28   96:getfield        #58  <Field int[] zzaUs>
	//   29   99:invokestatic    #257 <Method String Arrays.toString(int[])>
	//   30  102:areturn         

		case 6: // '\006'
			return Arrays.toString(zzaUt);
	//   31  103:aload_0         
	//   32  104:getfield        #60  <Field float[] zzaUt>
	//   33  107:invokestatic    #260 <Method String Arrays.toString(float[])>
	//   34  110:areturn         

		case 7: // '\007'
			return zzn.zza(zzaUu, 0, zzaUu.length, false);
	//   35  111:aload_0         
	//   36  112:getfield        #62  <Field byte[] zzaUu>
	//   37  115:iconst_0        
	//   38  116:aload_0         
	//   39  117:getfield        #62  <Field byte[] zzaUu>
	//   40  120:arraylength     
	//   41  121:iconst_0        
	//   42  122:invokestatic    #265 <Method String zzn.zza(byte[], int, int, boolean)>
	//   43  125:areturn         
		}
		return "unknown";
	//   44  126:ldc2            #267 <String "unknown">
	//   45  129:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzad.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #272 <Method void com.google.android.gms.fitness.data.zzad.zza(Value, Parcel, int)>
	//    4    6:return          
	}

	String zzCC()
	{
		return zzaGV;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String zzaGV>
	//    2    4:areturn         
	}

	Bundle zzCD()
	{
		if(zzaUr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field Map zzaUr>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Bundle bundle = new Bundle(zzaUr.size());
	//    5    9:new             #72  <Class Bundle>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field Map zzaUr>
	//    9   17:invokeinterface #276 <Method int Map.size()>
	//   10   22:invokespecial   #277 <Method void Bundle(int)>
	//   11   25:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = zzaUr.entrySet().iterator(); iterator.hasNext(); bundle.putParcelable((String)entry.getKey(), (Parcelable)entry.getValue()))
	//*  12   26:aload_0         
	//*  13   27:getfield        #56  <Field Map zzaUr>
	//*  14   30:invokeinterface #280 <Method Set Map.entrySet()>
	//*  15   35:invokeinterface #94  <Method Iterator Set.iterator()>
	//*  16   40:astore_2        
	//*  17   41:aload_2         
	//*  18   42:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  19   47:ifeq            85
			entry = (java.util.Map.Entry)iterator.next();
	//   20   50:aload_2         
	//   21   51:invokeinterface #104 <Method Object Iterator.next()>
	//   22   56:checkcast       #282 <Class java.util.Map$Entry>
	//   23   59:astore_3        

	//   24   60:aload_1         
	//   25   61:aload_3         
	//   26   62:invokeinterface #285 <Method Object java.util.Map$Entry.getKey()>
	//   27   67:checkcast       #106 <Class String>
	//   28   70:aload_3         
	//   29   71:invokeinterface #288 <Method Object java.util.Map$Entry.getValue()>
	//   30   76:checkcast       #290 <Class Parcelable>
	//   31   79:invokevirtual   #294 <Method void Bundle.putParcelable(String, Parcelable)>
	//*  32   82:goto            41
		return bundle;
	//   33   85:aload_1         
	//   34   86:areturn         
	}

	int[] zzCE()
	{
		return zzaUs;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int[] zzaUs>
	//    2    4:areturn         
	}

	float[] zzCF()
	{
		return zzaUt;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field float[] zzaUt>
	//    2    4:areturn         
	}

	byte[] zzCG()
	{
		return zzaUu;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field byte[] zzaUu>
	//    2    4:areturn         
	}

	float zzCx()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field float value>
	//    2    4:freturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzad();
	private final int format;
	private float value;
	private final int versionCode;
	private String zzaGV;
	private boolean zzaUq;
	private Map zzaUr;
	private int zzaUs[];
	private float zzaUt[];
	private byte zzaUu[];

	static 
	{
	//    0    0:new             #29  <Class zzad>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void zzad()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
