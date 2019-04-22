// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;

import com.google.ads.interactivemedia.v3.b.m;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			h, c

class c$8
	implements h
{

	public Object a()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Type a>
	//    2    4:astore_1        
		if(obj instanceof ParameterizedType)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #28  <Class ParameterizedType>
	//*   5    9:ifeq            86
		{
			obj = ((Object) (((ParameterizedType)obj).getActualTypeArguments()[0]));
	//    6   12:aload_1         
	//    7   13:checkcast       #28  <Class ParameterizedType>
	//    8   16:invokeinterface #32  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//    9   21:iconst_0        
	//   10   22:aaload          
	//   11   23:astore_1        
			if(obj instanceof Class)
	//*  12   24:aload_1         
	//*  13   25:instanceof      #34  <Class Class>
	//*  14   28:ifeq            39
				return ((Object) (EnumSet.noneOf((Class)obj)));
	//   15   31:aload_1         
	//   16   32:checkcast       #34  <Class Class>
	//   17   35:invokestatic    #40  <Method EnumSet EnumSet.noneOf(Class)>
	//   18   38:areturn         
			obj = ((Object) (String.valueOf(((Object) (((Object) (a)).toString())))));
	//   19   39:aload_0         
	//   20   40:getfield        #21  <Field Type a>
	//   21   43:invokevirtual   #44  <Method String Object.toString()>
	//   22   46:invokestatic    #50  <Method String String.valueOf(Object)>
	//   23   49:astore_1        
			if(((String) (obj)).length() != 0)
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #54  <Method int String.length()>
	//*  26   54:ifeq            67
				obj = ((Object) ("Invalid EnumSet type: ".concat(((String) (obj)))));
	//   27   57:ldc1            #56  <String "Invalid EnumSet type: ">
	//   28   59:aload_1         
	//   29   60:invokevirtual   #60  <Method String String.concat(String)>
	//   30   63:astore_1        
			else
	//*  31   64:goto            77
				obj = ((Object) (new String("Invalid EnumSet type: ")));
	//   32   67:new             #46  <Class String>
	//   33   70:dup             
	//   34   71:ldc1            #56  <String "Invalid EnumSet type: ">
	//   35   73:invokespecial   #63  <Method void String(String)>
	//   36   76:astore_1        
			throw new m(((String) (obj)));
	//   37   77:new             #65  <Class m>
	//   38   80:dup             
	//   39   81:aload_1         
	//   40   82:invokespecial   #66  <Method void m(String)>
	//   41   85:athrow          
		}
		obj = ((Object) (String.valueOf(((Object) (obj.toString())))));
	//   42   86:aload_1         
	//   43   87:invokevirtual   #44  <Method String Object.toString()>
	//   44   90:invokestatic    #50  <Method String String.valueOf(Object)>
	//   45   93:astore_1        
		if(((String) (obj)).length() != 0)
	//*  46   94:aload_1         
	//*  47   95:invokevirtual   #54  <Method int String.length()>
	//*  48   98:ifeq            111
			obj = ((Object) ("Invalid EnumSet type: ".concat(((String) (obj)))));
	//   49  101:ldc1            #56  <String "Invalid EnumSet type: ">
	//   50  103:aload_1         
	//   51  104:invokevirtual   #60  <Method String String.concat(String)>
	//   52  107:astore_1        
		else
	//*  53  108:goto            121
			obj = ((Object) (new String("Invalid EnumSet type: ")));
	//   54  111:new             #46  <Class String>
	//   55  114:dup             
	//   56  115:ldc1            #56  <String "Invalid EnumSet type: ">
	//   57  117:invokespecial   #63  <Method void String(String)>
	//   58  120:astore_1        
		throw new m(((String) (obj)));
	//   59  121:new             #65  <Class m>
	//   60  124:dup             
	//   61  125:aload_1         
	//   62  126:invokespecial   #66  <Method void m(String)>
	//   63  129:athrow          
	}

	final Type a;
	final c b;

	c$8(c c1, Type type)
	{
		b = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field c b>
		a = type;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Type a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
