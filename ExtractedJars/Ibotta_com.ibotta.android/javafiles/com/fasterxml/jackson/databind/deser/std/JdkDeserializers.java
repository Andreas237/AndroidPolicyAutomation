// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			FromStringDeserializer, UUIDDeserializer, StackTraceElementDeserializer, AtomicBooleanDeserializer, 
//			ByteBufferDeserializer

public class JdkDeserializers
{

	public static JsonDeserializer find(Class class1, String s)
	{
		if(_classNames.contains(((Object) (s))))
	//*   0    0:getstatic       #16  <Field HashSet _classNames>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #46  <Method boolean HashSet.contains(Object)>
	//*   3    7:ifeq            77
		{
			s = ((String) (FromStringDeserializer.findDeserializer(class1)));
	//    4   10:aload_0         
	//    5   11:invokestatic    #50  <Method FromStringDeserializer$Std FromStringDeserializer.findDeserializer(Class)>
	//    6   14:astore_1        
			if(s != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          21
				return ((JsonDeserializer) (s));
	//    9   19:aload_1         
	//   10   20:areturn         
			if(class1 == java/util/UUID)
	//*  11   21:aload_0         
	//*  12   22:ldc1            #20  <Class UUID>
	//*  13   24:if_acmpne       35
				return ((JsonDeserializer) (new UUIDDeserializer()));
	//   14   27:new             #52  <Class UUIDDeserializer>
	//   15   30:dup             
	//   16   31:invokespecial   #53  <Method void UUIDDeserializer()>
	//   17   34:areturn         
			if(class1 == java/lang/StackTraceElement)
	//*  18   35:aload_0         
	//*  19   36:ldc1            #24  <Class StackTraceElement>
	//*  20   38:if_acmpne       49
				return ((JsonDeserializer) (new StackTraceElementDeserializer()));
	//   21   41:new             #55  <Class StackTraceElementDeserializer>
	//   22   44:dup             
	//   23   45:invokespecial   #56  <Method void StackTraceElementDeserializer()>
	//   24   48:areturn         
			if(class1 == java/util/concurrent/atomic/AtomicBoolean)
	//*  25   49:aload_0         
	//*  26   50:ldc1            #22  <Class AtomicBoolean>
	//*  27   52:if_acmpne       63
				return ((JsonDeserializer) (new AtomicBooleanDeserializer()));
	//   28   55:new             #58  <Class AtomicBooleanDeserializer>
	//   29   58:dup             
	//   30   59:invokespecial   #59  <Method void AtomicBooleanDeserializer()>
	//   31   62:areturn         
			if(class1 == java/nio/ByteBuffer)
	//*  32   63:aload_0         
	//*  33   64:ldc1            #26  <Class ByteBuffer>
	//*  34   66:if_acmpne       77
				return ((JsonDeserializer) (new ByteBufferDeserializer()));
	//   35   69:new             #61  <Class ByteBufferDeserializer>
	//   36   72:dup             
	//   37   73:invokespecial   #62  <Method void ByteBufferDeserializer()>
	//   38   76:areturn         
		}
		return null;
	//   39   77:aconst_null     
	//   40   78:areturn         
	}

	private static final HashSet _classNames;

	static 
	{
		_classNames = new HashSet();
	//    0    0:new             #11  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void HashSet()>
	//    3    7:putstatic       #16  <Field HashSet _classNames>
		Class aclass[] = new Class[4];
	//    4   10:iconst_4        
	//    5   11:anewarray       Class[]
	//    6   14:astore_3        
		boolean flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_1        
		aclass[0] = java/util/UUID;
	//    9   17:aload_3         
	//   10   18:iconst_0        
	//   11   19:ldc1            #20  <Class UUID>
	//   12   21:aastore         
		aclass[1] = java/util/concurrent/atomic/AtomicBoolean;
	//   13   22:aload_3         
	//   14   23:iconst_1        
	//   15   24:ldc1            #22  <Class AtomicBoolean>
	//   16   26:aastore         
		aclass[2] = java/lang/StackTraceElement;
	//   17   27:aload_3         
	//   18   28:iconst_2        
	//   19   29:ldc1            #24  <Class StackTraceElement>
	//   20   31:aastore         
		aclass[3] = java/nio/ByteBuffer;
	//   21   32:aload_3         
	//   22   33:iconst_3        
	//   23   34:ldc1            #26  <Class ByteBuffer>
	//   24   36:aastore         
		int k = aclass.length;
	//   25   37:aload_3         
	//   26   38:arraylength     
	//   27   39:istore_2        
		for(int i = 0; i < k; i++)
	//*  28   40:iconst_0        
	//*  29   41:istore_0        
	//*  30   42:iload_0         
	//*  31   43:iload_2         
	//*  32   44:icmpge          71
		{
			Class class1 = aclass[i];
	//   33   47:aload_3         
	//   34   48:iload_0         
	//   35   49:aaload          
	//   36   50:astore          4
			_classNames.add(((Object) (class1.getName())));
	//   37   52:getstatic       #16  <Field HashSet _classNames>
	//   38   55:aload           4
	//   39   57:invokevirtual   #30  <Method String Class.getName()>
	//   40   60:invokevirtual   #34  <Method boolean HashSet.add(Object)>
	//   41   63:pop             
		}

	//   42   64:iload_0         
	//   43   65:iconst_1        
	//   44   66:iadd            
	//   45   67:istore_0        
	//*  46   68:goto            42
		aclass = FromStringDeserializer.types();
	//   47   71:invokestatic    #40  <Method Class[] FromStringDeserializer.types()>
	//   48   74:astore_3        
		k = aclass.length;
	//   49   75:aload_3         
	//   50   76:arraylength     
	//   51   77:istore_2        
		for(int j = ((int) (flag)); j < k; j++)
	//*  52   78:iload_1         
	//*  53   79:istore_0        
	//*  54   80:iload_0         
	//*  55   81:iload_2         
	//*  56   82:icmpge          109
		{
			Class class2 = aclass[j];
	//   57   85:aload_3         
	//   58   86:iload_0         
	//   59   87:aaload          
	//   60   88:astore          4
			_classNames.add(((Object) (class2.getName())));
	//   61   90:getstatic       #16  <Field HashSet _classNames>
	//   62   93:aload           4
	//   63   95:invokevirtual   #30  <Method String Class.getName()>
	//   64   98:invokevirtual   #34  <Method boolean HashSet.add(Object)>
	//   65  101:pop             
		}

	//   66  102:iload_0         
	//   67  103:iconst_1        
	//   68  104:iadd            
	//   69  105:istore_0        
	//*  70  106:goto            80
	//*  71  109:return          
	}
}
