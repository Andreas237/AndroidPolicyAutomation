// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public abstract class NameTransformer
{
	public static class Chained extends NameTransformer
		implements Serializable
	{

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #28  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #29  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("[ChainedTransformer(");
		//    4    8:aload_1         
		//    5    9:ldc1            #31  <String "[ChainedTransformer(">
		//    6   11:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (_t1)));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #21  <Field NameTransformer _t1>
		//   11   20:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			stringbuilder.append(", ");
		//   13   24:aload_1         
		//   14   25:ldc1            #40  <String ", ">
		//   15   27:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(((Object) (_t2)));
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #23  <Field NameTransformer _t2>
		//   20   36:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
		//   21   39:pop             
			stringbuilder.append(")]");
		//   22   40:aload_1         
		//   23   41:ldc1            #42  <String ")]">
		//   24   43:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			return stringbuilder.toString();
		//   26   47:aload_1         
		//   27   48:invokevirtual   #44  <Method String StringBuilder.toString()>
		//   28   51:areturn         
		}

		public String transform(String s)
		{
			return _t1.transform(_t2.transform(s));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field NameTransformer _t1>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field NameTransformer _t2>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #48  <Method String NameTransformer.transform(String)>
		//    6   12:invokevirtual   #48  <Method String NameTransformer.transform(String)>
		//    7   15:areturn         
		}

		private static final long serialVersionUID = 1L;
		protected final NameTransformer _t1;
		protected final NameTransformer _t2;

		public Chained(NameTransformer nametransformer, NameTransformer nametransformer1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void NameTransformer()>
			_t1 = nametransformer;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field NameTransformer _t1>
			_t2 = nametransformer1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field NameTransformer _t2>
		//    8   14:return          
		}
	}

	protected static final class NopTransformer extends NameTransformer
		implements Serializable
	{

		public String transform(String s)
		{
			return s;
		//    0    0:aload_1         
		//    1    1:areturn         
		}

		private static final long serialVersionUID = 1L;

		protected NopTransformer()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void NameTransformer()>
		//    2    4:return          
		}
	}


	protected NameTransformer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static NameTransformer chainedTransformer(NameTransformer nametransformer, NameTransformer nametransformer1)
	{
		return ((NameTransformer) (new Chained(nametransformer, nametransformer1)));
	//    0    0:new             #12  <Class NameTransformer$Chained>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #32  <Method void NameTransformer$Chained(NameTransformer, NameTransformer)>
	//    5    9:areturn         
	}

	public static NameTransformer simpleTransformer(String s, String s1)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag;
		if(s != null && s.length() > 0)
	//*   2    2:aload_0         
	//*   3    3:ifnull          18
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #40  <Method int String.length()>
	//*   6   10:ifle            18
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:goto            20
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		if(s1 == null || s1.length() <= 0)
	//*  12   20:aload_1         
	//*  13   21:ifnull          34
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #40  <Method int String.length()>
	//*  16   28:ifle            34
	//*  17   31:goto            36
			flag1 = false;
	//   18   34:iconst_0        
	//   19   35:istore_3        
		if(flag)
	//*  20   36:iload_2         
	//*  21   37:ifeq            63
			if(flag1)
	//*  22   40:iload_3         
	//*  23   41:ifeq            54
				return ((NameTransformer) (new NameTransformer(s, s1) {

					public String toString()
					{
						StringBuilder stringbuilder = new StringBuilder();
					//    0    0:new             #24  <Class StringBuilder>
					//    1    3:dup             
					//    2    4:invokespecial   #25  <Method void StringBuilder()>
					//    3    7:astore_1        
						stringbuilder.append("[PreAndSuffixTransformer('");
					//    4    8:aload_1         
					//    5    9:ldc1            #27  <String "[PreAndSuffixTransformer('">
					//    6   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
					//    7   14:pop             
						stringbuilder.append(prefix);
					//    8   15:aload_1         
					//    9   16:aload_0         
					//   10   17:getfield        #14  <Field String val$prefix>
					//   11   20:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
					//   12   23:pop             
						stringbuilder.append("','");
					//   13   24:aload_1         
					//   14   25:ldc1            #33  <String "','">
					//   15   27:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
					//   16   30:pop             
						stringbuilder.append(suffix);
					//   17   31:aload_1         
					//   18   32:aload_0         
					//   19   33:getfield        #16  <Field String val$suffix>
					//   20   36:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
					//   21   39:pop             
						stringbuilder.append("')]");
					//   22   40:aload_1         
					//   23   41:ldc1            #35  <String "')]">
					//   24   43:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
					//   25   46:pop             
						return stringbuilder.toString();
					//   26   47:aload_1         
					//   27   48:invokevirtual   #37  <Method String StringBuilder.toString()>
					//   28   51:areturn         
					}

					public String transform(String s2)
					{
						StringBuilder stringbuilder = new StringBuilder();
					//    0    0:new             #24  <Class StringBuilder>
					//    1    3:dup             
					//    2    4:invokespecial   #25  <Method void StringBuilder()>
					//    3    7:astore_2        
						stringbuilder.append(prefix);
					//    4    8:aload_2         
					//    5    9:aload_0         
					//    6   10:getfield        #14  <Field String val$prefix>
					//    7   13:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
					//    8   16:pop             
						stringbuilder.append(s2);
					//    9   17:aload_2         
					//   10   18:aload_1         
					//   11   19:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
					//   12   22:pop             
						stringbuilder.append(suffix);
					//   13   23:aload_2         
					//   14   24:aload_0         
					//   15   25:getfield        #16  <Field String val$suffix>
					//   16   28:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
					//   17   31:pop             
						return stringbuilder.toString();
					//   18   32:aload_2         
					//   19   33:invokevirtual   #37  <Method String StringBuilder.toString()>
					//   20   36:areturn         
					}

					final String val$prefix;
					final String val$suffix;

			
			{
				prefix = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field String val$prefix>
				suffix = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #16  <Field String val$suffix>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #19  <Method void NameTransformer()>
			//    8   14:return          
			}
				}
));
	//   24   44:new             #6   <Class NameTransformer$1>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokespecial   #43  <Method void NameTransformer$1(String, String)>
	//   29   53:areturn         
			else
				return ((NameTransformer) (new NameTransformer(s) {

					public String toString()
					{
						StringBuilder stringbuilder = new StringBuilder();
					//    0    0:new             #21  <Class StringBuilder>
					//    1    3:dup             
					//    2    4:invokespecial   #22  <Method void StringBuilder()>
					//    3    7:astore_1        
						stringbuilder.append("[PrefixTransformer('");
					//    4    8:aload_1         
					//    5    9:ldc1            #24  <String "[PrefixTransformer('">
					//    6   11:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
					//    7   14:pop             
						stringbuilder.append(prefix);
					//    8   15:aload_1         
					//    9   16:aload_0         
					//   10   17:getfield        #13  <Field String val$prefix>
					//   11   20:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
					//   12   23:pop             
						stringbuilder.append("')]");
					//   13   24:aload_1         
					//   14   25:ldc1            #30  <String "')]">
					//   15   27:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
					//   16   30:pop             
						return stringbuilder.toString();
					//   17   31:aload_1         
					//   18   32:invokevirtual   #32  <Method String StringBuilder.toString()>
					//   19   35:areturn         
					}

					public String transform(String s2)
					{
						StringBuilder stringbuilder = new StringBuilder();
					//    0    0:new             #21  <Class StringBuilder>
					//    1    3:dup             
					//    2    4:invokespecial   #22  <Method void StringBuilder()>
					//    3    7:astore_2        
						stringbuilder.append(prefix);
					//    4    8:aload_2         
					//    5    9:aload_0         
					//    6   10:getfield        #13  <Field String val$prefix>
					//    7   13:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
					//    8   16:pop             
						stringbuilder.append(s2);
					//    9   17:aload_2         
					//   10   18:aload_1         
					//   11   19:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
					//   12   22:pop             
						return stringbuilder.toString();
					//   13   23:aload_2         
					//   14   24:invokevirtual   #32  <Method String StringBuilder.toString()>
					//   15   27:areturn         
					}

					final String val$prefix;

			
			{
				prefix = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #13  <Field String val$prefix>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #16  <Method void NameTransformer()>
			//    5    9:return          
			}
				}
));
	//   30   54:new             #8   <Class NameTransformer$2>
	//   31   57:dup             
	//   32   58:aload_0         
	//   33   59:invokespecial   #46  <Method void NameTransformer$2(String)>
	//   34   62:areturn         
		if(flag1)
	//*  35   63:iload_3         
	//*  36   64:ifeq            76
			return ((NameTransformer) (new NameTransformer(s1) {

				public String toString()
				{
					StringBuilder stringbuilder = new StringBuilder();
				//    0    0:new             #21  <Class StringBuilder>
				//    1    3:dup             
				//    2    4:invokespecial   #22  <Method void StringBuilder()>
				//    3    7:astore_1        
					stringbuilder.append("[SuffixTransformer('");
				//    4    8:aload_1         
				//    5    9:ldc1            #24  <String "[SuffixTransformer('">
				//    6   11:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
				//    7   14:pop             
					stringbuilder.append(suffix);
				//    8   15:aload_1         
				//    9   16:aload_0         
				//   10   17:getfield        #13  <Field String val$suffix>
				//   11   20:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
				//   12   23:pop             
					stringbuilder.append("')]");
				//   13   24:aload_1         
				//   14   25:ldc1            #30  <String "')]">
				//   15   27:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
				//   16   30:pop             
					return stringbuilder.toString();
				//   17   31:aload_1         
				//   18   32:invokevirtual   #32  <Method String StringBuilder.toString()>
				//   19   35:areturn         
				}

				public String transform(String s2)
				{
					StringBuilder stringbuilder = new StringBuilder();
				//    0    0:new             #21  <Class StringBuilder>
				//    1    3:dup             
				//    2    4:invokespecial   #22  <Method void StringBuilder()>
				//    3    7:astore_2        
					stringbuilder.append(s2);
				//    4    8:aload_2         
				//    5    9:aload_1         
				//    6   10:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
				//    7   13:pop             
					stringbuilder.append(suffix);
				//    8   14:aload_2         
				//    9   15:aload_0         
				//   10   16:getfield        #13  <Field String val$suffix>
				//   11   19:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
				//   12   22:pop             
					return stringbuilder.toString();
				//   13   23:aload_2         
				//   14   24:invokevirtual   #32  <Method String StringBuilder.toString()>
				//   15   27:areturn         
				}

				final String val$suffix;

			
			{
				suffix = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #13  <Field String val$suffix>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #16  <Method void NameTransformer()>
			//    5    9:return          
			}
			}
));
	//   37   67:new             #10  <Class NameTransformer$3>
	//   38   70:dup             
	//   39   71:aload_1         
	//   40   72:invokespecial   #47  <Method void NameTransformer$3(String)>
	//   41   75:areturn         
		else
			return NOP;
	//   42   76:getstatic       #25  <Field NameTransformer NOP>
	//   43   79:areturn         
	}

	public abstract String transform(String s);

	public static final NameTransformer NOP = new NopTransformer();

	static 
	{
	//    0    0:new             #15  <Class NameTransformer$NopTransformer>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void NameTransformer$NopTransformer()>
	//    3    7:putstatic       #25  <Field NameTransformer NOP>
	//*   4   10:return          
	}
}
