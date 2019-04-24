// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class bn
{

	public static Class b(Type type)
	{
		do
		{
			if(type instanceof Class)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #8   <Class Class>
	//*   2    4:ifeq            12
				return (Class)type;
	//    3    7:aload_0         
	//    4    8:checkcast       #8   <Class Class>
	//    5   11:areturn         
			if(type instanceof ParameterizedType)
	//*   6   12:aload_0         
	//*   7   13:instanceof      #10  <Class ParameterizedType>
	//*   8   16:ifeq            32
				type = ((ParameterizedType)type).getRawType();
	//    9   19:aload_0         
	//   10   20:checkcast       #10  <Class ParameterizedType>
	//   11   23:invokeinterface #14  <Method Type ParameterizedType.getRawType()>
	//   12   28:astore_0        
			else
	//*  13   29:goto            0
				throw new IllegalArgumentException("TODO");
	//   14   32:new             #16  <Class IllegalArgumentException>
	//   15   35:dup             
	//   16   36:ldc1            #18  <String "TODO">
	//   17   38:invokespecial   #22  <Method void IllegalArgumentException(String)>
	//   18   41:athrow          
		} while(true);
	}

	public static boolean e(Class class1)
	{
		if(class1.isPrimitive())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #31  <Method boolean Class.isPrimitive()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(((Object) (class1)).equals(java/lang/String))
	//*   5    9:aload_0         
	//*   6   10:ldc1            #33  <Class String>
	//*   7   12:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*   8   15:ifeq            20
			return true;
	//    9   18:iconst_1        
	//   10   19:ireturn         
		if(((Object) (class1)).equals(java/lang/Integer))
	//*  11   20:aload_0         
	//*  12   21:ldc1            #39  <Class Integer>
	//*  13   23:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*  14   26:ifeq            31
			return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
		if(((Object) (class1)).equals(java/lang/Long))
	//*  17   31:aload_0         
	//*  18   32:ldc1            #41  <Class Long>
	//*  19   34:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*  20   37:ifeq            42
			return true;
	//   21   40:iconst_1        
	//   22   41:ireturn         
		if(((Object) (class1)).equals(java/lang/Double))
	//*  23   42:aload_0         
	//*  24   43:ldc1            #43  <Class Double>
	//*  25   45:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*  26   48:ifeq            53
			return true;
	//   27   51:iconst_1        
	//   28   52:ireturn         
		if(((Object) (class1)).equals(java/lang/Float))
	//*  29   53:aload_0         
	//*  30   54:ldc1            #45  <Class Float>
	//*  31   56:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*  32   59:ifeq            64
			return true;
	//   33   62:iconst_1        
	//   34   63:ireturn         
		if(((Object) (class1)).equals(java/lang/Boolean))
	//*  35   64:aload_0         
	//*  36   65:ldc1            #47  <Class Boolean>
	//*  37   67:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*  38   70:ifeq            75
			return true;
	//   39   73:iconst_1        
	//   40   74:ireturn         
		if(((Object) (class1)).equals(java/lang/Short))
	//*  41   75:aload_0         
	//*  42   76:ldc1            #49  <Class Short>
	//*  43   78:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*  44   81:ifeq            86
			return true;
	//   45   84:iconst_1        
	//   46   85:ireturn         
		if(((Object) (class1)).equals(java/lang/Character))
	//*  47   86:aload_0         
	//*  48   87:ldc1            #51  <Class Character>
	//*  49   89:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*  50   92:ifeq            97
			return true;
	//   51   95:iconst_1        
	//   52   96:ireturn         
		if(((Object) (class1)).equals(java/lang/Byte))
	//*  53   97:aload_0         
	//*  54   98:ldc1            #53  <Class Byte>
	//*  55  100:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*  56  103:ifeq            108
			return true;
	//   57  106:iconst_1        
	//   58  107:ireturn         
		return ((Object) (class1)).equals(java/lang/Void);
	//   59  108:aload_0         
	//   60  109:ldc1            #55  <Class Void>
	//   61  111:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//   62  114:ifeq            119
	//   63  117:iconst_1        
	//   64  118:ireturn         
	//   65  119:iconst_0        
	//   66  120:ireturn         
	}
}
