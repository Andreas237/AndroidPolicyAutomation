// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//			DataHolder

private static final class DataHolder$zza
	implements Comparator
{

	public final int compare(Object obj, Object obj1)
	{
		obj = ((Object) ((HashMap)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #32  <Class HashMap>
	//    2    4:astore_1        
		obj1 = ((Object) ((HashMap)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #32  <Class HashMap>
	//    5    9:astore_2        
		obj = Preconditions.checkNotNull(((HashMap) (obj)).get(((Object) (zznz))));
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field String zznz>
	//    9   15:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//   10   18:invokestatic    #23  <Method Object Preconditions.checkNotNull(Object)>
	//   11   21:astore_1        
		obj1 = Preconditions.checkNotNull(((HashMap) (obj1)).get(((Object) (zznz))));
	//   12   22:aload_2         
	//   13   23:aload_0         
	//   14   24:getfield        #27  <Field String zznz>
	//   15   27:invokevirtual   #35  <Method Object HashMap.get(Object)>
	//   16   30:invokestatic    #23  <Method Object Preconditions.checkNotNull(Object)>
	//   17   33:astore_2        
		if(obj.equals(obj1))
	//*  18   34:aload_1         
	//*  19   35:aload_2         
	//*  20   36:invokevirtual   #39  <Method boolean Object.equals(Object)>
	//*  21   39:ifeq            44
			return 0;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		if(obj instanceof Boolean)
	//*  24   44:aload_1         
	//*  25   45:instanceof      #41  <Class Boolean>
	//*  26   48:ifeq            63
			return ((Boolean)obj).compareTo((Boolean)obj1);
	//   27   51:aload_1         
	//   28   52:checkcast       #41  <Class Boolean>
	//   29   55:aload_2         
	//   30   56:checkcast       #41  <Class Boolean>
	//   31   59:invokevirtual   #45  <Method int Boolean.compareTo(Boolean)>
	//   32   62:ireturn         
		if(obj instanceof Long)
	//*  33   63:aload_1         
	//*  34   64:instanceof      #47  <Class Long>
	//*  35   67:ifeq            82
			return ((Long)obj).compareTo((Long)obj1);
	//   36   70:aload_1         
	//   37   71:checkcast       #47  <Class Long>
	//   38   74:aload_2         
	//   39   75:checkcast       #47  <Class Long>
	//   40   78:invokevirtual   #50  <Method int Long.compareTo(Long)>
	//   41   81:ireturn         
		if(obj instanceof Integer)
	//*  42   82:aload_1         
	//*  43   83:instanceof      #52  <Class Integer>
	//*  44   86:ifeq            101
			return ((Integer)obj).compareTo((Integer)obj1);
	//   45   89:aload_1         
	//   46   90:checkcast       #52  <Class Integer>
	//   47   93:aload_2         
	//   48   94:checkcast       #52  <Class Integer>
	//   49   97:invokevirtual   #55  <Method int Integer.compareTo(Integer)>
	//   50  100:ireturn         
		if(obj instanceof String)
	//*  51  101:aload_1         
	//*  52  102:instanceof      #25  <Class String>
	//*  53  105:ifeq            120
			return ((String)obj).compareTo((String)obj1);
	//   54  108:aload_1         
	//   55  109:checkcast       #25  <Class String>
	//   56  112:aload_2         
	//   57  113:checkcast       #25  <Class String>
	//   58  116:invokevirtual   #58  <Method int String.compareTo(String)>
	//   59  119:ireturn         
		if(obj instanceof Double)
	//*  60  120:aload_1         
	//*  61  121:instanceof      #60  <Class Double>
	//*  62  124:ifeq            139
			return ((Double)obj).compareTo((Double)obj1);
	//   63  127:aload_1         
	//   64  128:checkcast       #60  <Class Double>
	//   65  131:aload_2         
	//   66  132:checkcast       #60  <Class Double>
	//   67  135:invokevirtual   #63  <Method int Double.compareTo(Double)>
	//   68  138:ireturn         
		if(obj instanceof Float)
	//*  69  139:aload_1         
	//*  70  140:instanceof      #65  <Class Float>
	//*  71  143:ifeq            158
		{
			return ((Float)obj).compareTo((Float)obj1);
	//   72  146:aload_1         
	//   73  147:checkcast       #65  <Class Float>
	//   74  150:aload_2         
	//   75  151:checkcast       #65  <Class Float>
	//   76  154:invokevirtual   #68  <Method int Float.compareTo(Float)>
	//   77  157:ireturn         
		} else
		{
			obj = ((Object) (String.valueOf(obj)));
	//   78  158:aload_1         
	//   79  159:invokestatic    #72  <Method String String.valueOf(Object)>
	//   80  162:astore_1        
			obj1 = ((Object) (new StringBuilder(24 + String.valueOf(obj).length())));
	//   81  163:new             #74  <Class StringBuilder>
	//   82  166:dup             
	//   83  167:bipush          24
	//   84  169:aload_1         
	//   85  170:invokestatic    #72  <Method String String.valueOf(Object)>
	//   86  173:invokevirtual   #78  <Method int String.length()>
	//   87  176:iadd            
	//   88  177:invokespecial   #81  <Method void StringBuilder(int)>
	//   89  180:astore_2        
			((StringBuilder) (obj1)).append("Unknown type for lValue ");
	//   90  181:aload_2         
	//   91  182:ldc1            #83  <String "Unknown type for lValue ">
	//   92  184:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   93  187:pop             
			((StringBuilder) (obj1)).append(((String) (obj)));
	//   94  188:aload_2         
	//   95  189:aload_1         
	//   96  190:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   97  193:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj1)).toString());
	//   98  194:new             #89  <Class IllegalArgumentException>
	//   99  197:dup             
	//  100  198:aload_2         
	//  101  199:invokevirtual   #93  <Method String StringBuilder.toString()>
	//  102  202:invokespecial   #95  <Method void IllegalArgumentException(String)>
	//  103  205:athrow          
		}
	}

	private final String zznz;

	DataHolder$zza(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zznz = (String)Preconditions.checkNotNull(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #25  <Class String>
	//    6   12:putfield        #27  <Field String zznz>
	//    7   15:return          
	}
}
