// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.operation;

import com.firebase.client.core.view.QueryParams;

public class OperationSource
{
	private static final class Source extends Enum
	{

		public static Source valueOf(String s)
		{
			return (Source)Enum.valueOf(com/firebase/client/core/operation/OperationSource$Source, s);
		//    0    0:ldc1            #2   <Class OperationSource$Source>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class OperationSource$Source>
		//    4    9:areturn         
		}

		public static Source[] values()
		{
			return (Source[])((Source []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field OperationSource$Source[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.firebase.client.core.operation.OperationSource$Source_3B_.clone()>
		//    2    6:checkcast       #38  <Class OperationSource$Source[]>
		//    3    9:areturn         
		}

		private static final Source $VALUES[];
		public static final Source Server;
		public static final Source User;

		static 
		{
			User = new Source("User", 0);
		//    0    0:new             #2   <Class OperationSource$Source>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "User">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void OperationSource$Source(String, int)>
		//    5   10:putstatic       #22  <Field OperationSource$Source User>
			Server = new Source("Server", 1);
		//    6   13:new             #2   <Class OperationSource$Source>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "Server">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void OperationSource$Source(String, int)>
		//   11   23:putstatic       #25  <Field OperationSource$Source Server>
			$VALUES = (new Source[] {
				User, Server
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Source[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field OperationSource$Source User>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field OperationSource$Source Server>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field OperationSource$Source[] $VALUES>
		//*  23   45:return          
		}

		private Source(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public OperationSource(Source source1, QueryParams queryparams, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		source = source1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field OperationSource$Source source>
		queryParams = queryparams;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field QueryParams queryParams>
		tagged = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #43  <Field boolean tagged>
	//   11   19:return          
	}

	public static OperationSource forServerTaggedQuery(QueryParams queryparams)
	{
		return new OperationSource(Source.Server, queryparams, true);
	//    0    0:new             #2   <Class OperationSource>
	//    1    3:dup             
	//    2    4:getstatic       #32  <Field OperationSource$Source OperationSource$Source.Server>
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokespecial   #27  <Method void OperationSource(OperationSource$Source, QueryParams, boolean)>
	//    6   12:areturn         
	}

	public QueryParams getQueryParams()
	{
		return queryParams;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field QueryParams queryParams>
	//    2    4:areturn         
	}

	public boolean isFromServer()
	{
		return source == Source.Server;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field OperationSource$Source source>
	//    2    4:getstatic       #32  <Field OperationSource$Source OperationSource$Source.Server>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isFromUser()
	{
		return source == Source.User;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field OperationSource$Source source>
	//    2    4:getstatic       #23  <Field OperationSource$Source OperationSource$Source.User>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isTagged()
	{
		return tagged;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean tagged>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #55  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("OperationSource{source=");
	//    4    8:aload_1         
	//    5    9:ldc1            #58  <String "OperationSource{source=">
	//    6   11:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (source)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #39  <Field OperationSource$Source source>
	//   11   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", queryParams=");
	//   13   24:aload_1         
	//   14   25:ldc1            #67  <String ", queryParams=">
	//   15   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (queryParams)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #41  <Field QueryParams queryParams>
	//   20   36:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", tagged=");
	//   22   40:aload_1         
	//   23   41:ldc1            #69  <String ", tagged=">
	//   24   43:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(tagged);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #43  <Field boolean tagged>
	//   29   52:invokevirtual   #72  <Method StringBuilder StringBuilder.append(boolean)>
	//   30   55:pop             
		stringbuilder.append('}');
	//   31   56:aload_1         
	//   32   57:bipush          125
	//   33   59:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   34   62:pop             
		return stringbuilder.toString();
	//   35   63:aload_1         
	//   36   64:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   37   67:areturn         
	}

	static final boolean $assertionsDisabled = false;
	public static final OperationSource SERVER;
	public static final OperationSource USER;
	private final QueryParams queryParams;
	private final Source source;
	private final boolean tagged;

	static 
	{
		USER = new OperationSource(Source.User, ((QueryParams) (null)), false);
	//    0    0:new             #2   <Class OperationSource>
	//    1    3:dup             
	//    2    4:getstatic       #23  <Field OperationSource$Source OperationSource$Source.User>
	//    3    7:aconst_null     
	//    4    8:iconst_0        
	//    5    9:invokespecial   #27  <Method void OperationSource(OperationSource$Source, QueryParams, boolean)>
	//    6   12:putstatic       #29  <Field OperationSource USER>
		SERVER = new OperationSource(Source.Server, ((QueryParams) (null)), false);
	//    7   15:new             #2   <Class OperationSource>
	//    8   18:dup             
	//    9   19:getstatic       #32  <Field OperationSource$Source OperationSource$Source.Server>
	//   10   22:aconst_null     
	//   11   23:iconst_0        
	//   12   24:invokespecial   #27  <Method void OperationSource(OperationSource$Source, QueryParams, boolean)>
	//   13   27:putstatic       #34  <Field OperationSource SERVER>
	//*  14   30:return          
	}
}
