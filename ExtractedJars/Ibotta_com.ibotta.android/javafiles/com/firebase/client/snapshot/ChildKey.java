// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import com.firebase.client.utilities.Utilities;

public class ChildKey
	implements Comparable
{
	private static class IntegerChildKey extends ChildKey
	{

		public volatile int compareTo(Object obj)
		{
			return compareTo((ChildKey)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #4   <Class ChildKey>
		//    3    5:invokespecial   #20  <Method int ChildKey.compareTo(ChildKey)>
		//    4    8:ireturn         
		}

		protected int intValue()
		{
			return intValue;
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field int intValue>
		//    2    4:ireturn         
		}

		protected boolean isInt()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #27  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #30  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("IntegerChildName(\"");
		//    4    8:aload_1         
		//    5    9:ldc1            #32  <String "IntegerChildName(\"">
		//    6   11:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(key);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #40  <Method String ChildKey.access$100(ChildKey)>
		//   11   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append("\")");
		//   13   24:aload_1         
		//   14   25:ldc1            #42  <String "\")">
		//   15   27:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			return stringbuilder.toString();
		//   17   31:aload_1         
		//   18   32:invokevirtual   #44  <Method String StringBuilder.toString()>
		//   19   35:areturn         
		}

		private final int intValue;

		IntegerChildKey(String s, int i)
		{
			super(s, ((_cls1) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #12  <Method void ChildKey(String, ChildKey$1)>
			intValue = i;
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:putfield        #14  <Field int intValue>
		//    7   11:return          
		}
	}


	private ChildKey(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		key = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field String key>
	//    5    9:return          
	}


	public static ChildKey fromString(String s)
	{
		Integer integer = Utilities.tryParseInt(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #60  <Method Integer Utilities.tryParseInt(String)>
	//    2    4:astore_1        
		if(integer != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
			return ((ChildKey) (new IntegerChildKey(s, integer.intValue())));
	//    5    9:new             #11  <Class ChildKey$IntegerChildKey>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #66  <Method int Integer.intValue()>
	//   10   18:invokespecial   #69  <Method void ChildKey$IntegerChildKey(String, int)>
	//   11   21:areturn         
		if(s.equals(".priority"))
	//*  12   22:aload_0         
	//*  13   23:ldc1            #38  <String ".priority">
	//*  14   25:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  15   28:ifeq            35
			return PRIORITY_CHILD_KEY;
	//   16   31:getstatic       #40  <Field ChildKey PRIORITY_CHILD_KEY>
	//   17   34:areturn         
		else
			return new ChildKey(s);
	//   18   35:new             #2   <Class ChildKey>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:invokespecial   #30  <Method void ChildKey(String)>
	//   22   43:areturn         
	}

	public static ChildKey getInfoKey()
	{
		return INFO_CHILD_KEY;
	//    0    0:getstatic       #44  <Field ChildKey INFO_CHILD_KEY>
	//    1    3:areturn         
	}

	public static ChildKey getMaxName()
	{
		return MAX_KEY;
	//    0    0:getstatic       #36  <Field ChildKey MAX_KEY>
	//    1    3:areturn         
	}

	public static ChildKey getMinName()
	{
		return MIN_KEY;
	//    0    0:getstatic       #32  <Field ChildKey MIN_KEY>
	//    1    3:areturn         
	}

	public static ChildKey getPriorityKey()
	{
		return PRIORITY_CHILD_KEY;
	//    0    0:getstatic       #40  <Field ChildKey PRIORITY_CHILD_KEY>
	//    1    3:areturn         
	}

	public String asString()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String key>
	//    2    4:areturn         
	}

	public int compareTo(ChildKey childkey)
	{
		if(this == childkey)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		ChildKey childkey1 = MIN_KEY;
	//    5    7:getstatic       #32  <Field ChildKey MIN_KEY>
	//    6   10:astore          4
		if(this != childkey1)
	//*   7   12:aload_0         
	//*   8   13:aload           4
	//*   9   15:if_acmpeq       122
		{
			ChildKey childkey2 = MAX_KEY;
	//   10   18:getstatic       #36  <Field ChildKey MAX_KEY>
	//   11   21:astore          5
			if(childkey == childkey2)
	//*  12   23:aload_1         
	//*  13   24:aload           5
	//*  14   26:if_acmpne       31
				return -1;
	//   15   29:iconst_m1       
	//   16   30:ireturn         
			if(childkey != childkey1)
	//*  17   31:aload_1         
	//*  18   32:aload           4
	//*  19   34:if_acmpeq       120
			{
				if(this == childkey2)
	//*  20   37:aload_0         
	//*  21   38:aload           5
	//*  22   40:if_acmpne       45
					return 1;
	//   23   43:iconst_1        
	//   24   44:ireturn         
				if(isInt())
	//*  25   45:aload_0         
	//*  26   46:invokevirtual   #88  <Method boolean isInt()>
	//*  27   49:ifeq            99
					if(childkey.isInt())
	//*  28   52:aload_1         
	//*  29   53:invokevirtual   #88  <Method boolean isInt()>
	//*  30   56:ifeq            97
					{
						int j = Utilities.compareInts(intValue(), childkey.intValue());
	//   31   59:aload_0         
	//   32   60:invokevirtual   #89  <Method int intValue()>
	//   33   63:aload_1         
	//   34   64:invokevirtual   #89  <Method int intValue()>
	//   35   67:invokestatic    #93  <Method int Utilities.compareInts(int, int)>
	//   36   70:istore_3        
						int i = j;
	//   37   71:iload_3         
	//   38   72:istore_2        
						if(j == 0)
	//*  39   73:iload_3         
	//*  40   74:ifne            95
							i = Utilities.compareInts(key.length(), childkey.key.length());
	//   41   77:aload_0         
	//   42   78:getfield        #49  <Field String key>
	//   43   81:invokevirtual   #96  <Method int String.length()>
	//   44   84:aload_1         
	//   45   85:getfield        #49  <Field String key>
	//   46   88:invokevirtual   #96  <Method int String.length()>
	//   47   91:invokestatic    #93  <Method int Utilities.compareInts(int, int)>
	//   48   94:istore_2        
						return i;
	//   49   95:iload_2         
	//   50   96:ireturn         
					} else
					{
						return -1;
	//   51   97:iconst_m1       
	//   52   98:ireturn         
					}
				if(childkey.isInt())
	//*  53   99:aload_1         
	//*  54  100:invokevirtual   #88  <Method boolean isInt()>
	//*  55  103:ifeq            108
					return 1;
	//   56  106:iconst_1        
	//   57  107:ireturn         
				else
					return key.compareTo(childkey.key);
	//   58  108:aload_0         
	//   59  109:getfield        #49  <Field String key>
	//   60  112:aload_1         
	//   61  113:getfield        #49  <Field String key>
	//   62  116:invokevirtual   #99  <Method int String.compareTo(String)>
	//   63  119:ireturn         
			} else
			{
				return 1;
	//   64  120:iconst_1        
	//   65  121:ireturn         
			}
		} else
		{
			return -1;
	//   66  122:iconst_m1       
	//   67  123:ireturn         
		}
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ChildKey)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class ChildKey>
	//    3    5:invokevirtual   #102 <Method int compareTo(ChildKey)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof ChildKey))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ChildKey>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(this == obj)
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       16
		{
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		} else
		{
			obj = ((Object) ((ChildKey)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ChildKey>
	//   12   20:astore_1        
			return key.equals(((Object) (((ChildKey) (obj)).key)));
	//   13   21:aload_0         
	//   14   22:getfield        #49  <Field String key>
	//   15   25:aload_1         
	//   16   26:getfield        #49  <Field String key>
	//   17   29:invokevirtual   #75  <Method boolean String.equals(Object)>
	//   18   32:ireturn         
		}
	}

	public int hashCode()
	{
		return key.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String key>
	//    2    4:invokevirtual   #105 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	protected int intValue()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected boolean isInt()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isPriorityChildName()
	{
		return this == PRIORITY_CHILD_KEY;
	//    0    0:aload_0         
	//    1    1:getstatic       #40  <Field ChildKey PRIORITY_CHILD_KEY>
	//    2    4:if_acmpne       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #109 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ChildKey(\"");
	//    4    8:aload_1         
	//    5    9:ldc1            #112 <String "ChildKey(\"">
	//    6   11:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(key);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #49  <Field String key>
	//   11   20:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("\")");
	//   13   24:aload_1         
	//   14   25:ldc1            #118 <String "\")">
	//   15   27:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private static final ChildKey INFO_CHILD_KEY = new ChildKey(".info");
	private static final ChildKey MAX_KEY = new ChildKey("[MAX_KEY]");
	private static final ChildKey MIN_KEY = new ChildKey("[MIN_KEY]");
	private static final ChildKey PRIORITY_CHILD_KEY = new ChildKey(".priority");
	private final String key;

	static 
	{
	//    0    0:new             #2   <Class ChildKey>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "[MIN_KEY]">
	//    3    6:invokespecial   #30  <Method void ChildKey(String)>
	//    4    9:putstatic       #32  <Field ChildKey MIN_KEY>
	//    5   12:new             #2   <Class ChildKey>
	//    6   15:dup             
	//    7   16:ldc1            #34  <String "[MAX_KEY]">
	//    8   18:invokespecial   #30  <Method void ChildKey(String)>
	//    9   21:putstatic       #36  <Field ChildKey MAX_KEY>
	//   10   24:new             #2   <Class ChildKey>
	//   11   27:dup             
	//   12   28:ldc1            #38  <String ".priority">
	//   13   30:invokespecial   #30  <Method void ChildKey(String)>
	//   14   33:putstatic       #40  <Field ChildKey PRIORITY_CHILD_KEY>
	//   15   36:new             #2   <Class ChildKey>
	//   16   39:dup             
	//   17   40:ldc1            #42  <String ".info">
	//   18   42:invokespecial   #30  <Method void ChildKey(String)>
	//   19   45:putstatic       #44  <Field ChildKey INFO_CHILD_KEY>
	//*  20   48:return          
	}


/*
	static String access$100(ChildKey childkey)
	{
		return childkey.key;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String key>
	//    2    4:areturn         
	}

*/
}
