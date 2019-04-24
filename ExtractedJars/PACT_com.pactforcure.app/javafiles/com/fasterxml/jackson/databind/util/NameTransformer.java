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

		public String reverse(String s)
		{
			String s1 = _t1.reverse(s);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field NameTransformer _t1>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #28  <Method String NameTransformer.reverse(String)>
		//    4    8:astore_2        
			s = s1;
		//    5    9:aload_2         
		//    6   10:astore_1        
			if(s1 != null)
		//*   7   11:aload_2         
		//*   8   12:ifnull          24
				s = _t2.reverse(s1);
		//    9   15:aload_0         
		//   10   16:getfield        #23  <Field NameTransformer _t2>
		//   11   19:aload_2         
		//   12   20:invokevirtual   #28  <Method String NameTransformer.reverse(String)>
		//   13   23:astore_1        
			return s;
		//   14   24:aload_1         
		//   15   25:areturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append("[ChainedTransformer(").append(((Object) (_t1))).append(", ").append(((Object) (_t2))).append(")]").toString();
		//    0    0:new             #32  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #33  <Method void StringBuilder()>
		//    3    7:ldc1            #35  <String "[ChainedTransformer(">
		//    4    9:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #21  <Field NameTransformer _t1>
		//    7   16:invokevirtual   #42  <Method StringBuilder StringBuilder.append(Object)>
		//    8   19:ldc1            #44  <String ", ">
		//    9   21:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
		//   10   24:aload_0         
		//   11   25:getfield        #23  <Field NameTransformer _t2>
		//   12   28:invokevirtual   #42  <Method StringBuilder StringBuilder.append(Object)>
		//   13   31:ldc1            #46  <String ")]">
		//   14   33:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
		//   15   36:invokevirtual   #48  <Method String StringBuilder.toString()>
		//   16   39:areturn         
		}

		public String transform(String s)
		{
			return _t1.transform(_t2.transform(s));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field NameTransformer _t1>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field NameTransformer _t2>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #51  <Method String NameTransformer.transform(String)>
		//    6   12:invokevirtual   #51  <Method String NameTransformer.transform(String)>
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

		public String reverse(String s)
		{
			return s;
		//    0    0:aload_1         
		//    1    1:areturn         
		}

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
	//*   3    3:ifnull          44
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #40  <Method int String.length()>
	//*   6   10:ifle            44
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:aload_1         
	//*  10   16:ifnull          49
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #40  <Method int String.length()>
	//*  13   23:ifle            49
	//*  14   26:iload_2         
	//*  15   27:ifeq            63
	//*  16   30:iload_3         
	//*  17   31:ifeq            54
	//*  18   34:new             #6   <Class NameTransformer$1>
	//*  19   37:dup             
	//*  20   38:aload_0         
	//*  21   39:aload_1         
	//*  22   40:invokespecial   #43  <Method void NameTransformer$1(String, String)>
	//*  23   43:areturn         
			flag = false;
	//   24   44:iconst_0        
	//   25   45:istore_2        
		if(s1 == null || s1.length() <= 0)
	//*  26   46:goto            15
			flag1 = false;
	//   27   49:iconst_0        
	//   28   50:istore_3        
		if(flag)
			if(flag1)
				return ((NameTransformer) (new NameTransformer(s, s1) {

					public String reverse(String s2)
					{
						if(s2.startsWith(prefix))
					//*   0    0:aload_1         
					//*   1    1:aload_0         
					//*   2    2:getfield        #14  <Field String val$prefix>
					//*   3    5:invokevirtual   #28  <Method boolean String.startsWith(String)>
					//*   4    8:ifeq            52
						{
							s2 = s2.substring(prefix.length());
					//    5   11:aload_1         
					//    6   12:aload_0         
					//    7   13:getfield        #14  <Field String val$prefix>
					//    8   16:invokevirtual   #32  <Method int String.length()>
					//    9   19:invokevirtual   #36  <Method String String.substring(int)>
					//   10   22:astore_1        
							if(s2.endsWith(suffix))
					//*  11   23:aload_1         
					//*  12   24:aload_0         
					//*  13   25:getfield        #16  <Field String val$suffix>
					//*  14   28:invokevirtual   #39  <Method boolean String.endsWith(String)>
					//*  15   31:ifeq            52
								return s2.substring(0, s2.length() - suffix.length());
					//   16   34:aload_1         
					//   17   35:iconst_0        
					//   18   36:aload_1         
					//   19   37:invokevirtual   #32  <Method int String.length()>
					//   20   40:aload_0         
					//   21   41:getfield        #16  <Field String val$suffix>
					//   22   44:invokevirtual   #32  <Method int String.length()>
					//   23   47:isub            
					//   24   48:invokevirtual   #42  <Method String String.substring(int, int)>
					//   25   51:areturn         
						}
						return null;
					//   26   52:aconst_null     
					//   27   53:areturn         
					}

					public String toString()
					{
						return (new StringBuilder()).append("[PreAndSuffixTransformer('").append(prefix).append("','").append(suffix).append("')]").toString();
					//    0    0:new             #46  <Class StringBuilder>
					//    1    3:dup             
					//    2    4:invokespecial   #47  <Method void StringBuilder()>
					//    3    7:ldc1            #49  <String "[PreAndSuffixTransformer('">
					//    4    9:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//    5   12:aload_0         
					//    6   13:getfield        #14  <Field String val$prefix>
					//    7   16:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//    8   19:ldc1            #55  <String "','">
					//    9   21:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//   10   24:aload_0         
					//   11   25:getfield        #16  <Field String val$suffix>
					//   12   28:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//   13   31:ldc1            #57  <String "')]">
					//   14   33:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//   15   36:invokevirtual   #59  <Method String StringBuilder.toString()>
					//   16   39:areturn         
					}

					public String transform(String s2)
					{
						return (new StringBuilder()).append(prefix).append(s2).append(suffix).toString();
					//    0    0:new             #46  <Class StringBuilder>
					//    1    3:dup             
					//    2    4:invokespecial   #47  <Method void StringBuilder()>
					//    3    7:aload_0         
					//    4    8:getfield        #14  <Field String val$prefix>
					//    5   11:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//    6   14:aload_1         
					//    7   15:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//    8   18:aload_0         
					//    9   19:getfield        #16  <Field String val$suffix>
					//   10   22:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//   11   25:invokevirtual   #59  <Method String StringBuilder.toString()>
					//   12   28:areturn         
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
			else
	//*  29   51:goto            26
				return ((NameTransformer) (new NameTransformer(s) {

					public String reverse(String s2)
					{
						if(s2.startsWith(prefix))
					//*   0    0:aload_1         
					//*   1    1:aload_0         
					//*   2    2:getfield        #13  <Field String val$prefix>
					//*   3    5:invokevirtual   #25  <Method boolean String.startsWith(String)>
					//*   4    8:ifeq            23
							return s2.substring(prefix.length());
					//    5   11:aload_1         
					//    6   12:aload_0         
					//    7   13:getfield        #13  <Field String val$prefix>
					//    8   16:invokevirtual   #29  <Method int String.length()>
					//    9   19:invokevirtual   #33  <Method String String.substring(int)>
					//   10   22:areturn         
						else
							return null;
					//   11   23:aconst_null     
					//   12   24:areturn         
					}

					public String toString()
					{
						return (new StringBuilder()).append("[PrefixTransformer('").append(prefix).append("')]").toString();
					//    0    0:new             #37  <Class StringBuilder>
					//    1    3:dup             
					//    2    4:invokespecial   #38  <Method void StringBuilder()>
					//    3    7:ldc1            #40  <String "[PrefixTransformer('">
					//    4    9:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
					//    5   12:aload_0         
					//    6   13:getfield        #13  <Field String val$prefix>
					//    7   16:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
					//    8   19:ldc1            #46  <String "')]">
					//    9   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
					//   10   24:invokevirtual   #48  <Method String StringBuilder.toString()>
					//   11   27:areturn         
					}

					public String transform(String s2)
					{
						return (new StringBuilder()).append(prefix).append(s2).toString();
					//    0    0:new             #37  <Class StringBuilder>
					//    1    3:dup             
					//    2    4:invokespecial   #38  <Method void StringBuilder()>
					//    3    7:aload_0         
					//    4    8:getfield        #13  <Field String val$prefix>
					//    5   11:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
					//    6   14:aload_1         
					//    7   15:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
					//    8   18:invokevirtual   #48  <Method String StringBuilder.toString()>
					//    9   21:areturn         
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

				public String reverse(String s2)
				{
					if(s2.endsWith(suffix))
				//*   0    0:aload_1         
				//*   1    1:aload_0         
				//*   2    2:getfield        #13  <Field String val$suffix>
				//*   3    5:invokevirtual   #25  <Method boolean String.endsWith(String)>
				//*   4    8:ifeq            29
						return s2.substring(0, s2.length() - suffix.length());
				//    5   11:aload_1         
				//    6   12:iconst_0        
				//    7   13:aload_1         
				//    8   14:invokevirtual   #29  <Method int String.length()>
				//    9   17:aload_0         
				//   10   18:getfield        #13  <Field String val$suffix>
				//   11   21:invokevirtual   #29  <Method int String.length()>
				//   12   24:isub            
				//   13   25:invokevirtual   #33  <Method String String.substring(int, int)>
				//   14   28:areturn         
					else
						return null;
				//   15   29:aconst_null     
				//   16   30:areturn         
				}

				public String toString()
				{
					return (new StringBuilder()).append("[SuffixTransformer('").append(suffix).append("')]").toString();
				//    0    0:new             #37  <Class StringBuilder>
				//    1    3:dup             
				//    2    4:invokespecial   #38  <Method void StringBuilder()>
				//    3    7:ldc1            #40  <String "[SuffixTransformer('">
				//    4    9:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
				//    5   12:aload_0         
				//    6   13:getfield        #13  <Field String val$suffix>
				//    7   16:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
				//    8   19:ldc1            #46  <String "')]">
				//    9   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
				//   10   24:invokevirtual   #48  <Method String StringBuilder.toString()>
				//   11   27:areturn         
				}

				public String transform(String s2)
				{
					return (new StringBuilder()).append(s2).append(suffix).toString();
				//    0    0:new             #37  <Class StringBuilder>
				//    1    3:dup             
				//    2    4:invokespecial   #38  <Method void StringBuilder()>
				//    3    7:aload_1         
				//    4    8:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
				//    5   11:aload_0         
				//    6   12:getfield        #13  <Field String val$suffix>
				//    7   15:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
				//    8   18:invokevirtual   #48  <Method String StringBuilder.toString()>
				//    9   21:areturn         
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

	public abstract String reverse(String s);

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
