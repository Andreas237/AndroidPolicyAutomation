// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.*;

public class ec
{

	public ec()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static Enum a(String s, Class class1)
	{
		return Enum.valueOf(class1, s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #27  <Method Enum Enum.valueOf(Class, String)>
	//    3    5:areturn         
	}

	public static EnumSet a(Class class1, Set set)
	{
		Exception exception;
		EnumSet enumset = EnumSet.noneOf(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method EnumSet EnumSet.noneOf(Class)>
	//    2    4:astore_2        
		for(set = ((Set) (set.iterator())); ((Iterator) (set)).hasNext();)
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #45  <Method Iterator Set.iterator()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            93
		{
			String s = (String)((Iterator) (set)).next();
	//    9   21:aload_1         
	//   10   22:invokeinterface #55  <Method Object Iterator.next()>
	//   11   27:checkcast       #57  <Class String>
	//   12   30:astore_3        
			String s1;
			StringBuilder stringbuilder;
			try
			{
				enumset.add(((Object) (a(s.toUpperCase(Locale.US), class1))));
	//   13   31:aload_2         
	//   14   32:aload_3         
	//   15   33:getstatic       #63  <Field Locale Locale.US>
	//   16   36:invokevirtual   #67  <Method String String.toUpperCase(Locale)>
	//   17   39:aload_0         
	//   18   40:invokestatic    #69  <Method Enum a(String, Class)>
	//   19   43:invokevirtual   #73  <Method boolean EnumSet.add(Object)>
	//   20   46:pop             
			}
	//*  21   47:goto            12
	//*  22   50:getstatic       #16  <Field String a>
	//*  23   53:astore          4
	//*  24   55:new             #75  <Class StringBuilder>
	//*  25   58:dup             
	//*  26   59:invokespecial   #76  <Method void StringBuilder()>
	//*  27   62:astore          5
	//*  28   64:aload           5
	//*  29   66:ldc1            #78  <String "Failed to create valid device key enum from string: ">
	//*  30   68:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  31   71:pop             
	//*  32   72:aload           5
	//*  33   74:aload_3         
	//*  34   75:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  35   78:pop             
	//*  36   79:aload           4
	//*  37   81:aload           5
	//*  38   83:invokevirtual   #86  <Method String StringBuilder.toString()>
	//*  39   86:invokestatic    #90  <Method int AppboyLogger.e(String, String)>
	//*  40   89:pop             
	//*  41   90:goto            12
	//*  42   93:aload_2         
	//*  43   94:areturn         
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				s1 = a;
				stringbuilder = new StringBuilder();
				stringbuilder.append("Failed to create valid device key enum from string: ");
				stringbuilder.append(s);
				AppboyLogger.e(s1, stringbuilder.toString());
			}
		}

		return enumset;
	//*  44   95:astore          4
	//*  45   97:goto            50
	}

	public static Set a(EnumSet enumset)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #96  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #97  <Method void HashSet()>
	//    3    7:astore_1        
		for(enumset = ((EnumSet) (enumset.iterator())); ((Iterator) (enumset)).hasNext(); ((Set) (hashset)).add(((Object) (((Iterator) (enumset)).next().toString()))));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #98  <Method Iterator EnumSet.iterator()>
	//    6   12:astore_0        
	//    7   13:aload_0         
	//    8   14:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokeinterface #55  <Method Object Iterator.next()>
	//   13   29:invokevirtual   #99  <Method String Object.toString()>
	//   14   32:invokeinterface #100 <Method boolean Set.add(Object)>
	//   15   37:pop             
	//*  16   38:goto            13
		return ((Set) (hashset));
	//   17   41:aload_1         
	//   18   42:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ec);

	static 
	{
	//    0    0:ldc1            #2   <Class ec>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String a>
	//*   3    8:return          
	}
}
