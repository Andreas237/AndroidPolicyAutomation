// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.javax.inject.Provider;
import java.util.*;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			Factory, InstanceFactory, DaggerCollections, Preconditions

public final class SetFactory
	implements Factory
{
	public static final class Builder
	{

		public Builder addCollectionProvider(Provider provider)
		{
			collectionProviders.add(((Object) (provider)));
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field List collectionProviders>
		//    2    4:aload_1         
		//    3    5:invokeinterface #44  <Method boolean List.add(Object)>
		//    4   10:pop             
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public Builder addProvider(Provider provider)
		{
			individualProviders.add(((Object) (provider)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field List individualProviders>
		//    2    4:aload_1         
		//    3    5:invokeinterface #44  <Method boolean List.add(Object)>
		//    4   10:pop             
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public SetFactory build()
		{
			return new SetFactory(individualProviders, collectionProviders);
		//    0    0:new             #7   <Class SetFactory>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #31  <Field List individualProviders>
		//    4    8:aload_0         
		//    5    9:getfield        #33  <Field List collectionProviders>
		//    6   12:aconst_null     
		//    7   13:invokespecial   #53  <Method void SetFactory(List, List, SetFactory$1)>
		//    8   16:areturn         
		}

		static final boolean $assertionsDisabled = false;
		private final List collectionProviders;
		private final List individualProviders;

		static 
		{
		//    0    0:return          
		}

		private Builder(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			individualProviders = DaggerCollections.presizedList(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokestatic    #29  <Method List DaggerCollections.presizedList(int)>
		//    5    9:putfield        #31  <Field List individualProviders>
			collectionProviders = DaggerCollections.presizedList(j);
		//    6   12:aload_0         
		//    7   13:iload_2         
		//    8   14:invokestatic    #29  <Method List DaggerCollections.presizedList(int)>
		//    9   17:putfield        #33  <Field List collectionProviders>
		//   10   20:return          
		}

	}


	private SetFactory(List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		individualProviders = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field List individualProviders>
		collectionProviders = list1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #45  <Field List collectionProviders>
	//    8   14:return          
	}


	public static Builder builder(int i, int j)
	{
		return new Builder(i, j);
	//    0    0:new             #11  <Class SetFactory$Builder>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #55  <Method void SetFactory$Builder(int, int, SetFactory$1)>
	//    6   10:areturn         
	}

	public static Factory empty()
	{
		return EMPTY_FACTORY;
	//    0    0:getstatic       #36  <Field Factory EMPTY_FACTORY>
	//    1    3:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method Set get()>
	//    2    4:areturn         
	}

	public Set get()
	{
		int l = individualProviders.size();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List individualProviders>
	//    2    4:invokeinterface #69  <Method int List.size()>
	//    3    9:istore_2        
		ArrayList arraylist = new ArrayList(collectionProviders.size());
	//    4   10:new             #71  <Class ArrayList>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #45  <Field List collectionProviders>
	//    8   18:invokeinterface #69  <Method int List.size()>
	//    9   23:invokespecial   #74  <Method void ArrayList(int)>
	//   10   26:astore          5
		int i1 = collectionProviders.size();
	//   11   28:aload_0         
	//   12   29:getfield        #45  <Field List collectionProviders>
	//   13   32:invokeinterface #69  <Method int List.size()>
	//   14   37:istore          4
		boolean flag = false;
	//   15   39:iconst_0        
	//   16   40:istore_3        
		for(int i = 0; i < i1; i++)
	//*  17   41:iconst_0        
	//*  18   42:istore_1        
	//*  19   43:iload_1         
	//*  20   44:iload           4
	//*  21   46:icmpge          99
		{
			Collection collection = (Collection)((Provider)collectionProviders.get(i)).get();
	//   22   49:aload_0         
	//   23   50:getfield        #45  <Field List collectionProviders>
	//   24   53:iload_1         
	//   25   54:invokeinterface #77  <Method Object List.get(int)>
	//   26   59:checkcast       #79  <Class Provider>
	//   27   62:invokeinterface #81  <Method Object Provider.get()>
	//   28   67:checkcast       #83  <Class Collection>
	//   29   70:astore          6
			l += collection.size();
	//   30   72:iload_2         
	//   31   73:aload           6
	//   32   75:invokeinterface #84  <Method int Collection.size()>
	//   33   80:iadd            
	//   34   81:istore_2        
			((List) (arraylist)).add(((Object) (collection)));
	//   35   82:aload           5
	//   36   84:aload           6
	//   37   86:invokeinterface #88  <Method boolean List.add(Object)>
	//   38   91:pop             
		}

	//   39   92:iload_1         
	//   40   93:iconst_1        
	//   41   94:iadd            
	//   42   95:istore_1        
	//*  43   96:goto            43
		java.util.HashSet hashset = DaggerCollections.newHashSetWithExpectedSize(l);
	//   44   99:iload_2         
	//   45  100:invokestatic    #94  <Method java.util.HashSet DaggerCollections.newHashSetWithExpectedSize(int)>
	//   46  103:astore          6
		l = individualProviders.size();
	//   47  105:aload_0         
	//   48  106:getfield        #43  <Field List individualProviders>
	//   49  109:invokeinterface #69  <Method int List.size()>
	//   50  114:istore_2        
		for(int j = 0; j < l; j++)
	//*  51  115:iconst_0        
	//*  52  116:istore_1        
	//*  53  117:iload_1         
	//*  54  118:iload_2         
	//*  55  119:icmpge          158
			((Set) (hashset)).add(Preconditions.checkNotNull(((Provider)individualProviders.get(j)).get()));
	//   56  122:aload           6
	//   57  124:aload_0         
	//   58  125:getfield        #43  <Field List individualProviders>
	//   59  128:iload_1         
	//   60  129:invokeinterface #77  <Method Object List.get(int)>
	//   61  134:checkcast       #79  <Class Provider>
	//   62  137:invokeinterface #81  <Method Object Provider.get()>
	//   63  142:invokestatic    #100 <Method Object Preconditions.checkNotNull(Object)>
	//   64  145:invokeinterface #103 <Method boolean Set.add(Object)>
	//   65  150:pop             

	//   66  151:iload_1         
	//   67  152:iconst_1        
	//   68  153:iadd            
	//   69  154:istore_1        
	//*  70  155:goto            117
		l = ((List) (arraylist)).size();
	//   71  158:aload           5
	//   72  160:invokeinterface #69  <Method int List.size()>
	//   73  165:istore_2        
		for(int k = ((int) (flag)); k < l; k++)
	//*  74  166:iload_3         
	//*  75  167:istore_1        
	//*  76  168:iload_1         
	//*  77  169:iload_2         
	//*  78  170:icmpge          229
		{
			for(Iterator iterator = ((Collection)((List) (arraylist)).get(k)).iterator(); iterator.hasNext(); ((Set) (hashset)).add(Preconditions.checkNotNull(iterator.next())));
	//   79  173:aload           5
	//   80  175:iload_1         
	//   81  176:invokeinterface #77  <Method Object List.get(int)>
	//   82  181:checkcast       #83  <Class Collection>
	//   83  184:invokeinterface #107 <Method Iterator Collection.iterator()>
	//   84  189:astore          7
	//   85  191:aload           7
	//   86  193:invokeinterface #113 <Method boolean Iterator.hasNext()>
	//   87  198:ifeq            222
	//   88  201:aload           6
	//   89  203:aload           7
	//   90  205:invokeinterface #116 <Method Object Iterator.next()>
	//   91  210:invokestatic    #100 <Method Object Preconditions.checkNotNull(Object)>
	//   92  213:invokeinterface #103 <Method boolean Set.add(Object)>
	//   93  218:pop             
		}

	//   94  219:goto            191
	//   95  222:iload_1         
	//   96  223:iconst_1        
	//   97  224:iadd            
	//   98  225:istore_1        
	//*  99  226:goto            168
		return Collections.unmodifiableSet(((Set) (hashset)));
	//  100  229:aload           6
	//  101  231:invokestatic    #120 <Method Set Collections.unmodifiableSet(Set)>
	//  102  234:areturn         
	}

	private static final Factory EMPTY_FACTORY = InstanceFactory.create(((Object) (Collections.emptySet())));
	private final List collectionProviders;
	private final List individualProviders;

	static 
	{
	//    0    0:invokestatic    #28  <Method Set Collections.emptySet()>
	//    1    3:invokestatic    #34  <Method Factory InstanceFactory.create(Object)>
	//    2    6:putstatic       #36  <Field Factory EMPTY_FACTORY>
	//*   3    9:return          
	}
}
