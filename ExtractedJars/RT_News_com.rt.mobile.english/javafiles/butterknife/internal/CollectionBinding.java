// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife.internal;


// Referenced classes of package butterknife.internal:
//			Binding

final class CollectionBinding
	implements Binding
{
	static final class Kind extends Enum
	{

		public static Kind valueOf(String s)
		{
			return (Kind)Enum.valueOf(butterknife/internal/CollectionBinding$Kind, s);
		//    0    0:ldc1            #2   <Class CollectionBinding$Kind>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CollectionBinding$Kind>
		//    4    9:areturn         
		}

		public static Kind[] values()
		{
			return (Kind[])((Kind []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field CollectionBinding$Kind[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lbutterknife.internal.CollectionBinding$Kind_3B_.clone()>
		//    2    6:checkcast       #38  <Class CollectionBinding$Kind[]>
		//    3    9:areturn         
		}

		private static final Kind $VALUES[];
		public static final Kind ARRAY;
		public static final Kind LIST;

		static 
		{
			ARRAY = new Kind("ARRAY", 0);
		//    0    0:new             #2   <Class CollectionBinding$Kind>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "ARRAY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void CollectionBinding$Kind(String, int)>
		//    5   10:putstatic       #22  <Field CollectionBinding$Kind ARRAY>
			LIST = new Kind("LIST", 1);
		//    6   13:new             #2   <Class CollectionBinding$Kind>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "LIST">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void CollectionBinding$Kind(String, int)>
		//   11   23:putstatic       #25  <Field CollectionBinding$Kind LIST>
			$VALUES = (new Kind[] {
				ARRAY, LIST
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Kind[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field CollectionBinding$Kind ARRAY>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field CollectionBinding$Kind LIST>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field CollectionBinding$Kind[] $VALUES>
		//*  23   45:return          
		}

		private Kind(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	CollectionBinding(String s, String s1, Kind kind1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String name>
		type = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field String type>
		kind = kind1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field CollectionBinding$Kind kind>
		required = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #29  <Field boolean required>
	//   14   25:return          
	}

	public String getDescription()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("field '");
	//    4    8:aload_1         
	//    5    9:ldc1            #37  <String "field '">
	//    6   11:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(name);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #23  <Field String name>
	//   11   20:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("'");
	//   13   24:aload_1         
	//   14   25:ldc1            #43  <String "'">
	//   15   27:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	public Kind getKind()
	{
		return kind;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field CollectionBinding$Kind kind>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String name>
	//    2    4:areturn         
	}

	public String getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String type>
	//    2    4:areturn         
	}

	public boolean isRequired()
	{
		return required;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean required>
	//    2    4:ireturn         
	}

	private final Kind kind;
	private final String name;
	private final boolean required;
	private final String type;
}
