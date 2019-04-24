// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

// Referenced classes of package com.google.gson.internal:
//			ObjectConstructor, ConstructorConstructor

class ConstructorConstructor$5
	implements ObjectConstructor
{

	public Object construct()
	{
		if(val$type instanceof ParameterizedType)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Type val$type>
	//*   2    4:instanceof      #30  <Class ParameterizedType>
	//*   3    7:ifeq            79
		{
			Type type1 = ((ParameterizedType)val$type).getActualTypeArguments()[0];
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field Type val$type>
	//    6   14:checkcast       #30  <Class ParameterizedType>
	//    7   17:invokeinterface #34  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//    8   22:iconst_0        
	//    9   23:aaload          
	//   10   24:astore_1        
			if(type1 instanceof Class)
	//*  11   25:aload_1         
	//*  12   26:instanceof      #36  <Class Class>
	//*  13   29:ifeq            40
			{
				return ((Object) (EnumSet.noneOf((Class)type1)));
	//   14   32:aload_1         
	//   15   33:checkcast       #36  <Class Class>
	//   16   36:invokestatic    #42  <Method EnumSet EnumSet.noneOf(Class)>
	//   17   39:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   18   40:new             #44  <Class StringBuilder>
	//   19   43:dup             
	//   20   44:invokespecial   #45  <Method void StringBuilder()>
	//   21   47:astore_1        
				stringbuilder.append("Invalid EnumSet type: ");
	//   22   48:aload_1         
	//   23   49:ldc1            #47  <String "Invalid EnumSet type: ">
	//   24   51:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:pop             
				stringbuilder.append(((Object) (val$type)).toString());
	//   26   55:aload_1         
	//   27   56:aload_0         
	//   28   57:getfield        #22  <Field Type val$type>
	//   29   60:invokevirtual   #55  <Method String Object.toString()>
	//   30   63:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   31   66:pop             
				throw new JsonIOException(stringbuilder.toString());
	//   32   67:new             #57  <Class JsonIOException>
	//   33   70:dup             
	//   34   71:aload_1         
	//   35   72:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   36   75:invokespecial   #61  <Method void JsonIOException(String)>
	//   37   78:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   38   79:new             #44  <Class StringBuilder>
	//   39   82:dup             
	//   40   83:invokespecial   #45  <Method void StringBuilder()>
	//   41   86:astore_1        
			stringbuilder1.append("Invalid EnumSet type: ");
	//   42   87:aload_1         
	//   43   88:ldc1            #47  <String "Invalid EnumSet type: ">
	//   44   90:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   45   93:pop             
			stringbuilder1.append(((Object) (val$type)).toString());
	//   46   94:aload_1         
	//   47   95:aload_0         
	//   48   96:getfield        #22  <Field Type val$type>
	//   49   99:invokevirtual   #55  <Method String Object.toString()>
	//   50  102:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   51  105:pop             
			throw new JsonIOException(stringbuilder1.toString());
	//   52  106:new             #57  <Class JsonIOException>
	//   53  109:dup             
	//   54  110:aload_1         
	//   55  111:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   56  114:invokespecial   #61  <Method void JsonIOException(String)>
	//   57  117:athrow          
		}
	}

	final ConstructorConstructor this$0;
	final Type val$type;

	ConstructorConstructor$5()
	{
		this$0 = final_constructorconstructor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ConstructorConstructor this$0>
		val$type = Type.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Type val$type>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
