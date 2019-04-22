// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.cache.normalized.CacheReference;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

public final class RecordWeigher
{

	public static int byteChange(Object obj, Object obj1)
	{
		return weighField(obj) - weighField(obj1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #10  <Method int weighField(Object)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #10  <Method int weighField(Object)>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	private static int weighField(Object obj)
	{
		boolean flag = obj instanceof List;
	//    0    0:aload_0         
	//    1    1:instanceof      #13  <Class List>
	//    2    4:istore_2        
		int i = 16;
	//    3    5:bipush          16
	//    4    7:istore_1        
		if(flag)
	//*   5    8:iload_2         
	//*   6    9:ifeq            48
		{
			for(obj = ((Object) (((List)obj).iterator())); ((Iterator) (obj)).hasNext();)
	//*   7   12:aload_0         
	//*   8   13:checkcast       #13  <Class List>
	//*   9   16:invokeinterface #17  <Method Iterator List.iterator()>
	//*  10   21:astore_0        
	//*  11   22:aload_0         
	//*  12   23:invokeinterface #23  <Method boolean Iterator.hasNext()>
	//*  13   28:ifeq            46
				i += weighField(((Iterator) (obj)).next());
	//   14   31:iload_1         
	//   15   32:aload_0         
	//   16   33:invokeinterface #27  <Method Object Iterator.next()>
	//   17   38:invokestatic    #10  <Method int weighField(Object)>
	//   18   41:iadd            
	//   19   42:istore_1        

	//*  20   43:goto            22
			return i;
	//   21   46:iload_1         
	//   22   47:ireturn         
		}
		if(obj instanceof String)
	//*  23   48:aload_0         
	//*  24   49:instanceof      #29  <Class String>
	//*  25   52:ifeq            67
			return ((String)obj).getBytes(Charset.defaultCharset()).length;
	//   26   55:aload_0         
	//   27   56:checkcast       #29  <Class String>
	//   28   59:invokestatic    #35  <Method Charset Charset.defaultCharset()>
	//   29   62:invokevirtual   #39  <Method byte[] String.getBytes(Charset)>
	//   30   65:arraylength     
	//   31   66:ireturn         
		if(obj instanceof Boolean)
	//*  32   67:aload_0         
	//*  33   68:instanceof      #41  <Class Boolean>
	//*  34   71:ifeq            77
			return 16;
	//   35   74:bipush          16
	//   36   76:ireturn         
		if(obj instanceof BigDecimal)
	//*  37   77:aload_0         
	//*  38   78:instanceof      #43  <Class BigDecimal>
	//*  39   81:ifeq            87
			return 32;
	//   40   84:bipush          32
	//   41   86:ireturn         
		if(obj instanceof CacheReference)
	//*  42   87:aload_0         
	//*  43   88:instanceof      #45  <Class CacheReference>
	//*  44   91:ifeq            112
			return ((CacheReference)obj).key().getBytes(Charset.defaultCharset()).length + 16;
	//   45   94:aload_0         
	//   46   95:checkcast       #45  <Class CacheReference>
	//   47   98:invokevirtual   #49  <Method String CacheReference.key()>
	//   48  101:invokestatic    #35  <Method Charset Charset.defaultCharset()>
	//   49  104:invokevirtual   #39  <Method byte[] String.getBytes(Charset)>
	//   50  107:arraylength     
	//   51  108:bipush          16
	//   52  110:iadd            
	//   53  111:ireturn         
		if(obj == null)
	//*  54  112:aload_0         
	//*  55  113:ifnonnull       118
		{
			return 4;
	//   56  116:iconst_4        
	//   57  117:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   58  118:new             #51  <Class StringBuilder>
	//   59  121:dup             
	//   60  122:invokespecial   #55  <Method void StringBuilder()>
	//   61  125:astore_3        
			stringbuilder.append("Unknown field type in Record. ");
	//   62  126:aload_3         
	//   63  127:ldc1            #57  <String "Unknown field type in Record. ">
	//   64  129:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   65  132:pop             
			stringbuilder.append(obj.getClass().getName());
	//   66  133:aload_3         
	//   67  134:aload_0         
	//   68  135:invokevirtual   #65  <Method Class Object.getClass()>
	//   69  138:invokevirtual   #70  <Method String Class.getName()>
	//   70  141:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   71  144:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   72  145:new             #72  <Class IllegalStateException>
	//   73  148:dup             
	//   74  149:aload_3         
	//   75  150:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   76  153:invokespecial   #78  <Method void IllegalStateException(String)>
	//   77  156:athrow          
		}
	}
}
