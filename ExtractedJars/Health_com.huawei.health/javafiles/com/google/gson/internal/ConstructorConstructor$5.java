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
	//*   3    7:ifeq            73
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
				return ((Object) (EnumSet.noneOf((Class)type1)));
	//   14   32:aload_1         
	//   15   33:checkcast       #36  <Class Class>
	//   16   36:invokestatic    #42  <Method EnumSet EnumSet.noneOf(Class)>
	//   17   39:areturn         
			else
				throw new JsonIOException((new StringBuilder()).append("Invalid EnumSet type: ").append(((Object) (val$type)).toString()).toString());
	//   18   40:new             #44  <Class JsonIOException>
	//   19   43:dup             
	//   20   44:new             #46  <Class StringBuilder>
	//   21   47:dup             
	//   22   48:invokespecial   #47  <Method void StringBuilder()>
	//   23   51:ldc1            #49  <String "Invalid EnumSet type: ">
	//   24   53:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:aload_0         
	//   26   57:getfield        #22  <Field Type val$type>
	//   27   60:invokevirtual   #57  <Method String Object.toString()>
	//   28   63:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   29   66:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   30   69:invokespecial   #61  <Method void JsonIOException(String)>
	//   31   72:athrow          
		} else
		{
			throw new JsonIOException((new StringBuilder()).append("Invalid EnumSet type: ").append(((Object) (val$type)).toString()).toString());
	//   32   73:new             #44  <Class JsonIOException>
	//   33   76:dup             
	//   34   77:new             #46  <Class StringBuilder>
	//   35   80:dup             
	//   36   81:invokespecial   #47  <Method void StringBuilder()>
	//   37   84:ldc1            #49  <String "Invalid EnumSet type: ">
	//   38   86:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   39   89:aload_0         
	//   40   90:getfield        #22  <Field Type val$type>
	//   41   93:invokevirtual   #57  <Method String Object.toString()>
	//   42   96:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   43   99:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   44  102:invokespecial   #61  <Method void JsonIOException(String)>
	//   45  105:athrow          
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
