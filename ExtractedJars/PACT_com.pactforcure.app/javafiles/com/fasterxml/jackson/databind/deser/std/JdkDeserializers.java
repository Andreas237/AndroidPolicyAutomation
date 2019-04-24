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

	public JdkDeserializers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:return          
	}

	public static JsonDeserializer find(Class class1, String s)
	{
		if(_classNames.contains(((Object) (s))))
	//*   0    0:getstatic       #16  <Field HashSet _classNames>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #47  <Method boolean HashSet.contains(Object)>
	//*   3    7:ifeq            77
		{
			s = ((String) (FromStringDeserializer.findDeserializer(class1)));
	//    4   10:aload_0         
	//    5   11:invokestatic    #51  <Method FromStringDeserializer$Std FromStringDeserializer.findDeserializer(Class)>
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
	//   14   27:new             #53  <Class UUIDDeserializer>
	//   15   30:dup             
	//   16   31:invokespecial   #54  <Method void UUIDDeserializer()>
	//   17   34:areturn         
			if(class1 == java/lang/StackTraceElement)
	//*  18   35:aload_0         
	//*  19   36:ldc1            #24  <Class StackTraceElement>
	//*  20   38:if_acmpne       49
				return ((JsonDeserializer) (new StackTraceElementDeserializer()));
	//   21   41:new             #56  <Class StackTraceElementDeserializer>
	//   22   44:dup             
	//   23   45:invokespecial   #57  <Method void StackTraceElementDeserializer()>
	//   24   48:areturn         
			if(class1 == java/util/concurrent/atomic/AtomicBoolean)
	//*  25   49:aload_0         
	//*  26   50:ldc1            #22  <Class AtomicBoolean>
	//*  27   52:if_acmpne       63
				return ((JsonDeserializer) (new AtomicBooleanDeserializer()));
	//   28   55:new             #59  <Class AtomicBooleanDeserializer>
	//   29   58:dup             
	//   30   59:invokespecial   #60  <Method void AtomicBooleanDeserializer()>
	//   31   62:areturn         
			if(class1 == java/nio/ByteBuffer)
	//*  32   63:aload_0         
	//*  33   64:ldc1            #26  <Class ByteBuffer>
	//*  34   66:if_acmpne       77
				return ((JsonDeserializer) (new ByteBufferDeserializer()));
	//   35   69:new             #62  <Class ByteBufferDeserializer>
	//   36   72:dup             
	//   37   73:invokespecial   #63  <Method void ByteBufferDeserializer()>
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
	//    6   14:astore_2        
		aclass[0] = java/util/UUID;
	//    7   15:aload_2         
	//    8   16:iconst_0        
	//    9   17:ldc1            #20  <Class UUID>
	//   10   19:aastore         
		aclass[1] = java/util/concurrent/atomic/AtomicBoolean;
	//   11   20:aload_2         
	//   12   21:iconst_1        
	//   13   22:ldc1            #22  <Class AtomicBoolean>
	//   14   24:aastore         
		aclass[2] = java/lang/StackTraceElement;
	//   15   25:aload_2         
	//   16   26:iconst_2        
	//   17   27:ldc1            #24  <Class StackTraceElement>
	//   18   29:aastore         
		aclass[3] = java/nio/ByteBuffer;
	//   19   30:aload_2         
	//   20   31:iconst_3        
	//   21   32:ldc1            #26  <Class ByteBuffer>
	//   22   34:aastore         
		int k = aclass.length;
	//   23   35:aload_2         
	//   24   36:arraylength     
	//   25   37:istore_1        
		for(int i = 0; i < k; i++)
	//*  26   38:iconst_0        
	//*  27   39:istore_0        
	//*  28   40:iload_0         
	//*  29   41:iload_1         
	//*  30   42:icmpge          67
		{
			Class class1 = aclass[i];
	//   31   45:aload_2         
	//   32   46:iload_0         
	//   33   47:aaload          
	//   34   48:astore_3        
			_classNames.add(((Object) (class1.getName())));
	//   35   49:getstatic       #16  <Field HashSet _classNames>
	//   36   52:aload_3         
	//   37   53:invokevirtual   #30  <Method String Class.getName()>
	//   38   56:invokevirtual   #34  <Method boolean HashSet.add(Object)>
	//   39   59:pop             
		}

	//   40   60:iload_0         
	//   41   61:iconst_1        
	//   42   62:iadd            
	//   43   63:istore_0        
	//*  44   64:goto            40
		aclass = FromStringDeserializer.types();
	//   45   67:invokestatic    #40  <Method Class[] FromStringDeserializer.types()>
	//   46   70:astore_2        
		k = aclass.length;
	//   47   71:aload_2         
	//   48   72:arraylength     
	//   49   73:istore_1        
		for(int j = 0; j < k; j++)
	//*  50   74:iconst_0        
	//*  51   75:istore_0        
	//*  52   76:iload_0         
	//*  53   77:iload_1         
	//*  54   78:icmpge          103
		{
			Class class2 = aclass[j];
	//   55   81:aload_2         
	//   56   82:iload_0         
	//   57   83:aaload          
	//   58   84:astore_3        
			_classNames.add(((Object) (class2.getName())));
	//   59   85:getstatic       #16  <Field HashSet _classNames>
	//   60   88:aload_3         
	//   61   89:invokevirtual   #30  <Method String Class.getName()>
	//   62   92:invokevirtual   #34  <Method boolean HashSet.add(Object)>
	//   63   95:pop             
		}

	//   64   96:iload_0         
	//   65   97:iconst_1        
	//   66   98:iadd            
	//   67   99:istore_0        
	//*  68  100:goto            76
	//*  69  103:return          
	}
}
