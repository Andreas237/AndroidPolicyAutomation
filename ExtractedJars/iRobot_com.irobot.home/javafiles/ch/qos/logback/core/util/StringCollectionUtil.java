// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCollectionUtil
{

	public StringCollectionUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void removeMatching(Collection collection, Collection collection1)
	{
		ArrayList arraylist = new ArrayList(collection.size());
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #19  <Method int Collection.size()>
	//    4   10:invokespecial   #22  <Method void ArrayList(int)>
	//    5   13:astore_2        
		for(collection1 = ((Collection) (collection1.iterator())); ((Iterator) (collection1)).hasNext();)
	//*   6   14:aload_1         
	//*   7   15:invokeinterface #26  <Method Iterator Collection.iterator()>
	//*   8   20:astore_1        
	//*   9   21:aload_1         
	//*  10   22:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            97
		{
			Pattern pattern = Pattern.compile((String)((Iterator) (collection1)).next());
	//   12   30:aload_1         
	//   13   31:invokeinterface #36  <Method Object Iterator.next()>
	//   14   36:checkcast       #38  <Class String>
	//   15   39:invokestatic    #44  <Method Pattern Pattern.compile(String)>
	//   16   42:astore_3        
			Iterator iterator = collection.iterator();
	//   17   43:aload_0         
	//   18   44:invokeinterface #26  <Method Iterator Collection.iterator()>
	//   19   49:astore          4
			while(iterator.hasNext()) 
	//*  20   51:aload           4
	//*  21   53:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//*  22   58:ifeq            21
			{
				String s = (String)iterator.next();
	//   23   61:aload           4
	//   24   63:invokeinterface #36  <Method Object Iterator.next()>
	//   25   68:checkcast       #38  <Class String>
	//   26   71:astore          5
				if(pattern.matcher(((CharSequence) (s))).matches())
	//*  27   73:aload_3         
	//*  28   74:aload           5
	//*  29   76:invokevirtual   #48  <Method Matcher Pattern.matcher(CharSequence)>
	//*  30   79:invokevirtual   #53  <Method boolean Matcher.matches()>
	//*  31   82:ifeq            51
					((List) (arraylist)).add(((Object) (s)));
	//   32   85:aload_2         
	//   33   86:aload           5
	//   34   88:invokeinterface #59  <Method boolean List.add(Object)>
	//   35   93:pop             
			}
		}

	//*  36   94:goto            51
		collection.removeAll(((Collection) (arraylist)));
	//   37   97:aload_0         
	//   38   98:aload_2         
	//   39   99:invokeinterface #63  <Method boolean Collection.removeAll(Collection)>
	//   40  104:pop             
	//   41  105:return          
	}

	public static transient void removeMatching(Collection collection, String as[])
	{
		removeMatching(collection, ((Collection) (Arrays.asList(((Object []) (as))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #72  <Method List Arrays.asList(Object[])>
	//    3    5:invokestatic    #74  <Method void removeMatching(Collection, Collection)>
	//    4    8:return          
	}

	public static void retainMatching(Collection collection, Collection collection1)
	{
		if(collection1.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #79  <Method boolean Collection.isEmpty()>
	//*   2    6:ifeq            10
			return;
	//    3    9:return          
		ArrayList arraylist = new ArrayList(collection.size());
	//    4   10:new             #13  <Class ArrayList>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokeinterface #19  <Method int Collection.size()>
	//    8   20:invokespecial   #22  <Method void ArrayList(int)>
	//    9   23:astore_2        
		for(collection1 = ((Collection) (collection1.iterator())); ((Iterator) (collection1)).hasNext();)
	//*  10   24:aload_1         
	//*  11   25:invokeinterface #26  <Method Iterator Collection.iterator()>
	//*  12   30:astore_1        
	//*  13   31:aload_1         
	//*  14   32:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//*  15   37:ifeq            107
		{
			Pattern pattern = Pattern.compile((String)((Iterator) (collection1)).next());
	//   16   40:aload_1         
	//   17   41:invokeinterface #36  <Method Object Iterator.next()>
	//   18   46:checkcast       #38  <Class String>
	//   19   49:invokestatic    #44  <Method Pattern Pattern.compile(String)>
	//   20   52:astore_3        
			Iterator iterator = collection.iterator();
	//   21   53:aload_0         
	//   22   54:invokeinterface #26  <Method Iterator Collection.iterator()>
	//   23   59:astore          4
			while(iterator.hasNext()) 
	//*  24   61:aload           4
	//*  25   63:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//*  26   68:ifeq            31
			{
				String s = (String)iterator.next();
	//   27   71:aload           4
	//   28   73:invokeinterface #36  <Method Object Iterator.next()>
	//   29   78:checkcast       #38  <Class String>
	//   30   81:astore          5
				if(pattern.matcher(((CharSequence) (s))).matches())
	//*  31   83:aload_3         
	//*  32   84:aload           5
	//*  33   86:invokevirtual   #48  <Method Matcher Pattern.matcher(CharSequence)>
	//*  34   89:invokevirtual   #53  <Method boolean Matcher.matches()>
	//*  35   92:ifeq            61
					((List) (arraylist)).add(((Object) (s)));
	//   36   95:aload_2         
	//   37   96:aload           5
	//   38   98:invokeinterface #59  <Method boolean List.add(Object)>
	//   39  103:pop             
			}
		}

	//*  40  104:goto            61
		collection.retainAll(((Collection) (arraylist)));
	//   41  107:aload_0         
	//   42  108:aload_2         
	//   43  109:invokeinterface #82  <Method boolean Collection.retainAll(Collection)>
	//   44  114:pop             
	//   45  115:return          
	}

	public static transient void retainMatching(Collection collection, String as[])
	{
		retainMatching(collection, ((Collection) (Arrays.asList(((Object []) (as))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #72  <Method List Arrays.asList(Object[])>
	//    3    5:invokestatic    #84  <Method void retainMatching(Collection, Collection)>
	//    4    8:return          
	}
}
