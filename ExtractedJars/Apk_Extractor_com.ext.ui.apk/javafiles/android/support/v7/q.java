// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.util.*;

// Referenced classes of package android.support.v7:
//			p, ae, g

class q extends p
{

	public static final Collection a(Iterable iterable, Collection collection)
	{
		ae.b(((Object) (iterable)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		ae.b(((Object) (collection)), "destination");
	//    3    6:aload_1         
	//    4    7:ldc1            #17  <String "destination">
	//    5    9:invokestatic    #15  <Method void ae.b(Object, String)>
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); collection.add(((Iterator) (iterable)).next()));
	//    6   12:aload_0         
	//    7   13:invokeinterface #23  <Method Iterator Iterable.iterator()>
	//    8   18:astore_0        
	//    9   19:aload_0         
	//   10   20:invokeinterface #29  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            44
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:invokeinterface #33  <Method Object Iterator.next()>
	//   15   35:invokeinterface #39  <Method boolean Collection.add(Object)>
	//   16   40:pop             
	//*  17   41:goto            19
		return collection;
	//   18   44:aload_1         
	//   19   45:areturn         
	}

	public static final List a(Iterable iterable)
	{
		ae.b(((Object) (iterable)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		if(iterable instanceof Collection)
	//*   3    6:aload_0         
	//*   4    7:instanceof      #35  <Class Collection>
	//*   5   10:ifeq            94
		{
			switch(((Collection)iterable).size())
	//*   6   13:aload_0         
	//*   7   14:checkcast       #35  <Class Collection>
	//*   8   17:invokeinterface #49  <Method int Collection.size()>
			{
	//*   9   22:tableswitch     0 1: default 44
	//	               0 52
	//	               1 56
			default:
				return g.a((Collection)iterable);
	//   10   44:aload_0         
	//   11   45:checkcast       #35  <Class Collection>
	//   12   48:invokestatic    #54  <Method List g.a(Collection)>
	//   13   51:areturn         

			case 0: // '\0'
				return g.a();
	//   14   52:invokestatic    #57  <Method List g.a()>
	//   15   55:areturn         

			case 1: // '\001'
				break;
			}
			if(iterable instanceof List)
	//*  16   56:aload_0         
	//*  17   57:instanceof      #59  <Class List>
	//*  18   60:ifeq            79
				iterable = ((Iterable) (((List)iterable).get(0)));
	//   19   63:aload_0         
	//   20   64:checkcast       #59  <Class List>
	//   21   67:iconst_0        
	//   22   68:invokeinterface #63  <Method Object List.get(int)>
	//   23   73:astore_0        
			else
	//*  24   74:aload_0         
	//*  25   75:invokestatic    #66  <Method List g.a(Object)>
	//*  26   78:areturn         
				iterable = ((Iterable) (iterable.iterator().next()));
	//   27   79:aload_0         
	//   28   80:invokeinterface #23  <Method Iterator Iterable.iterator()>
	//   29   85:invokeinterface #33  <Method Object Iterator.next()>
	//   30   90:astore_0        
			return g.a(((Object) (iterable)));
		} else
	//*  31   91:goto            74
		{
			return g.b(g.b(iterable));
	//   32   94:aload_0         
	//   33   95:invokestatic    #68  <Method List g.b(Iterable)>
	//   34   98:invokestatic    #71  <Method List g.b(List)>
	//   35  101:areturn         
		}
	}

	public static final List a(Collection collection)
	{
		ae.b(((Object) (collection)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		return (List)new ArrayList(collection);
	//    3    6:new             #74  <Class ArrayList>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokespecial   #78  <Method void ArrayList(Collection)>
	//    7   14:checkcast       #59  <Class List>
	//    8   17:areturn         
	}

	public static final List b(Iterable iterable)
	{
		ae.b(((Object) (iterable)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		if(iterable instanceof Collection)
	//*   3    6:aload_0         
	//*   4    7:instanceof      #35  <Class Collection>
	//*   5   10:ifeq            21
			return g.a((Collection)iterable);
	//    6   13:aload_0         
	//    7   14:checkcast       #35  <Class Collection>
	//    8   17:invokestatic    #54  <Method List g.a(Collection)>
	//    9   20:areturn         
		else
			return (List)g.a(iterable, (Collection)new ArrayList());
	//   10   21:aload_0         
	//   11   22:new             #74  <Class ArrayList>
	//   12   25:dup             
	//   13   26:invokespecial   #82  <Method void ArrayList()>
	//   14   29:checkcast       #35  <Class Collection>
	//   15   32:invokestatic    #84  <Method Collection g.a(Iterable, Collection)>
	//   16   35:checkcast       #59  <Class List>
	//   17   38:areturn         
	}

	public static final Object c(List list)
	{
		ae.b(((Object) (list)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		if(list.isEmpty())
	//*   3    6:aload_0         
	//*   4    7:invokeinterface #89  <Method boolean List.isEmpty()>
	//*   5   12:ifeq            28
			throw (Throwable)new NoSuchElementException("List is empty.");
	//    6   15:new             #91  <Class NoSuchElementException>
	//    7   18:dup             
	//    8   19:ldc1            #93  <String "List is empty.">
	//    9   21:invokespecial   #96  <Method void NoSuchElementException(String)>
	//   10   24:checkcast       #98  <Class Throwable>
	//   11   27:athrow          
		else
			return list.get(0);
	//   12   28:aload_0         
	//   13   29:iconst_0        
	//   14   30:invokeinterface #63  <Method Object List.get(int)>
	//   15   35:areturn         
	}

	public static final Object d(List list)
	{
		ae.b(((Object) (list)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		if(list.isEmpty())
	//*   3    6:aload_0         
	//*   4    7:invokeinterface #89  <Method boolean List.isEmpty()>
	//*   5   12:ifeq            17
			return ((Object) (null));
	//    6   15:aconst_null     
	//    7   16:areturn         
		else
			return list.get(0);
	//    8   17:aload_0         
	//    9   18:iconst_0        
	//   10   19:invokeinterface #63  <Method Object List.get(int)>
	//   11   24:areturn         
	}

	public static final Object e(List list)
	{
		ae.b(((Object) (list)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		if(list.isEmpty())
	//*   3    6:aload_0         
	//*   4    7:invokeinterface #89  <Method boolean List.isEmpty()>
	//*   5   12:ifeq            28
			throw (Throwable)new NoSuchElementException("List is empty.");
	//    6   15:new             #91  <Class NoSuchElementException>
	//    7   18:dup             
	//    8   19:ldc1            #93  <String "List is empty.">
	//    9   21:invokespecial   #96  <Method void NoSuchElementException(String)>
	//   10   24:checkcast       #98  <Class Throwable>
	//   11   27:athrow          
		else
			return list.get(g.a(list));
	//   12   28:aload_0         
	//   13   29:aload_0         
	//   14   30:invokestatic    #105 <Method int g.a(List)>
	//   15   33:invokeinterface #63  <Method Object List.get(int)>
	//   16   38:areturn         
	}
}
