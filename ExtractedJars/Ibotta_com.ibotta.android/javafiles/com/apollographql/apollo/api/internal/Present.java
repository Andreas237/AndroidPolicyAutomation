// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.internal;


// Referenced classes of package com.apollographql.apollo.api.internal:
//			Optional, Utils, Function, Action

final class Present extends Optional
{

	Present(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Optional()>
		reference = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Object reference>
	//    5    9:return          
	}

	public Optional apply(final Action action)
	{
		Utils.checkNotNull(((Object) (action)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method Object Utils.checkNotNull(Object)>
	//    2    4:pop             
		return map(new Function() {

			public Object apply(Object obj)
			{
				action.apply(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field Action val$action>
			//    2    4:aload_1         
			//    3    5:invokeinterface #33  <Method void Action.apply(Object)>
				return obj;
			//    4   10:aload_1         
			//    5   11:areturn         
			}

			final Present this$0;
			final Action val$action;

			
			{
				this$0 = Present.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Present this$0>
				action = action1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Action val$action>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    3    5:aload_0         
	//    4    6:new             #7   <Class Present$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #35  <Method void Present$1(Present, Action)>
	//    9   15:invokevirtual   #39  <Method Optional map(Function)>
	//   10   18:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof Present)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Present>
	//*   2    4:ifeq            24
		{
			obj = ((Object) ((Present)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class Present>
	//    5   11:astore_1        
			return reference.equals(((Present) (obj)).reference);
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field Object reference>
	//    8   16:aload_1         
	//    9   17:getfield        #21  <Field Object reference>
	//   10   20:invokevirtual   #47  <Method boolean Object.equals(Object)>
	//   11   23:ireturn         
		} else
		{
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		}
	}

	public Optional flatMap(Function function)
	{
		Utils.checkNotNull(((Object) (function)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method Object Utils.checkNotNull(Object)>
	//    2    4:pop             
		return (Optional)Utils.checkNotNull(function.apply(reference), "the Function passed to Optional.flatMap() must not return null.");
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field Object reference>
	//    6   10:invokeinterface #53  <Method Object Function.apply(Object)>
	//    7   15:ldc1            #55  <String "the Function passed to Optional.flatMap() must not return null.">
	//    8   17:invokestatic    #58  <Method Object Utils.checkNotNull(Object, Object)>
	//    9   20:checkcast       #5   <Class Optional>
	//   10   23:areturn         
	}

	public Object get()
	{
		return reference;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object reference>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return reference.hashCode() + 0x598df91c;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object reference>
	//    2    4:invokevirtual   #66  <Method int Object.hashCode()>
	//    3    7:ldc1            #67  <Int 0x598df91c>
	//    4    9:iadd            
	//    5   10:ireturn         
	}

	public boolean isPresent()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Optional map(Function function)
	{
		return ((Optional) (new Present(Utils.checkNotNull(function.apply(reference), "the Function passed to Optional.map() must not return null."))));
	//    0    0:new             #2   <Class Present>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field Object reference>
	//    5    9:invokeinterface #53  <Method Object Function.apply(Object)>
	//    6   14:ldc1            #71  <String "the Function passed to Optional.map() must not return null.">
	//    7   16:invokestatic    #58  <Method Object Utils.checkNotNull(Object, Object)>
	//    8   19:invokespecial   #73  <Method void Present(Object)>
	//    9   22:areturn         
	}

	public Object or(Object obj)
	{
		Utils.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
	//    0    0:aload_1         
	//    1    1:ldc1            #77  <String "use Optional.orNull() instead of Optional.or(null)">
	//    2    3:invokestatic    #58  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		return reference;
	//    4    7:aload_0         
	//    5    8:getfield        #21  <Field Object reference>
	//    6   11:areturn         
	}

	public Object orNull()
	{
		return reference;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object reference>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #83  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Optional.of(");
	//    4    8:aload_1         
	//    5    9:ldc1            #86  <String "Optional.of(">
	//    6   11:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(reference);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #21  <Field Object reference>
	//   11   20:invokevirtual   #93  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(")");
	//   13   24:aload_1         
	//   14   25:ldc1            #95  <String ")">
	//   15   27:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	private static final long serialVersionUID = 0L;
	private final Object reference;
}
