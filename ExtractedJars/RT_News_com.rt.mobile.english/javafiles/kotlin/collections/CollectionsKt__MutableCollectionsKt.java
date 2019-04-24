// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.collections;

import java.util.*;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.random.Random;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.collections:
//			CollectionsKt__MutableCollectionsJVMKt, ArraysKt, CollectionsKt

class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt
{

	public CollectionsKt__MutableCollectionsKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void CollectionsKt__MutableCollectionsJVMKt()>
	//    2    4:return          
	}

	public static final boolean addAll(Collection collection, Iterable iterable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "elements");
	//    3    6:aload_1         
	//    4    7:ldc1            #65  <String "elements">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(iterable instanceof Collection)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #67  <Class Collection>
	//*   8   16:ifeq            30
			return collection.addAll((Collection)iterable);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:checkcast       #67  <Class Collection>
	//   12   24:invokeinterface #70  <Method boolean Collection.addAll(Collection)>
	//   13   29:ireturn         
		boolean flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_2        
		iterable = ((Iterable) (iterable.iterator()));
	//   16   32:aload_1         
	//   17   33:invokeinterface #76  <Method Iterator Iterable.iterator()>
	//   18   38:astore_1        
		do
		{
			if(!((Iterator) (iterable)).hasNext())
				break;
	//   19   39:aload_1         
	//   20   40:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//   21   45:ifeq            68
			if(collection.add(((Iterator) (iterable)).next()))
	//*  22   48:aload_0         
	//*  23   49:aload_1         
	//*  24   50:invokeinterface #86  <Method Object Iterator.next()>
	//*  25   55:invokeinterface #90  <Method boolean Collection.add(Object)>
	//*  26   60:ifeq            39
				flag = true;
	//   27   63:iconst_1        
	//   28   64:istore_2        
		} while(true);
	//   29   65:goto            39
		return flag;
	//   30   68:iload_2         
	//   31   69:ireturn         
	}

	public static final boolean addAll(Collection collection, Sequence sequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (sequence)), "elements");
	//    3    6:aload_1         
	//    4    7:ldc1            #65  <String "elements">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		sequence = ((Sequence) (sequence.iterator()));
	//    6   12:aload_1         
	//    7   13:invokeinterface #97  <Method Iterator Sequence.iterator()>
	//    8   18:astore_1        
		boolean flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_2        
		do
		{
			if(!((Iterator) (sequence)).hasNext())
				break;
	//   11   21:aload_1         
	//   12   22:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            50
			if(collection.add(((Iterator) (sequence)).next()))
	//*  14   30:aload_0         
	//*  15   31:aload_1         
	//*  16   32:invokeinterface #86  <Method Object Iterator.next()>
	//*  17   37:invokeinterface #90  <Method boolean Collection.add(Object)>
	//*  18   42:ifeq            21
				flag = true;
	//   19   45:iconst_1        
	//   20   46:istore_2        
		} while(true);
	//   21   47:goto            21
		return flag;
	//   22   50:iload_2         
	//   23   51:ireturn         
	}

	public static final boolean addAll(Collection collection, Object aobj[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (aobj)), "elements");
	//    3    6:aload_1         
	//    4    7:ldc1            #65  <String "elements">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return collection.addAll((Collection)ArraysKt.asList(aobj));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #104 <Method List ArraysKt.asList(Object[])>
	//    9   17:checkcast       #67  <Class Collection>
	//   10   20:invokeinterface #70  <Method boolean Collection.addAll(Collection)>
	//   11   25:ireturn         
	}

	private static final boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable iterable, Function1 function1, boolean flag)
	{
		iterable = ((Iterable) (iterable.iterator()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #76  <Method Iterator Iterable.iterator()>
	//    2    6:astore_0        
		boolean flag1 = false;
	//    3    7:iconst_0        
	//    4    8:istore_3        
		do
		{
			if(!((Iterator) (iterable)).hasNext())
				break;
	//    5    9:aload_0         
	//    6   10:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//    7   15:ifeq            51
			if(((Boolean)function1.invoke(((Iterator) (iterable)).next())).booleanValue() == flag)
	//*   8   18:aload_1         
	//*   9   19:aload_0         
	//*  10   20:invokeinterface #86  <Method Object Iterator.next()>
	//*  11   25:invokeinterface #112 <Method Object Function1.invoke(Object)>
	//*  12   30:checkcast       #114 <Class Boolean>
	//*  13   33:invokevirtual   #117 <Method boolean Boolean.booleanValue()>
	//*  14   36:iload_2         
	//*  15   37:icmpne          9
			{
				((Iterator) (iterable)).remove();
	//   16   40:aload_0         
	//   17   41:invokeinterface #119 <Method void Iterator.remove()>
				flag1 = true;
	//   18   46:iconst_1        
	//   19   47:istore_3        
			}
		} while(true);
	//   20   48:goto            9
		return flag1;
	//   21   51:iload_3         
	//   22   52:ireturn         
	}

	private static final boolean filterInPlace$CollectionsKt__MutableCollectionsKt(List list, Function1 function1, boolean flag)
	{
		if(!(list instanceof RandomAccess))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #123 <Class RandomAccess>
	//*   2    4:ifne            31
			if(list == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       21
				throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
	//    5   11:new             #125 <Class TypeCastException>
	//    6   14:dup             
	//    7   15:ldc1            #127 <String "null cannot be cast to non-null type kotlin.collections.MutableIterable<T>">
	//    8   17:invokespecial   #130 <Method void TypeCastException(String)>
	//    9   20:athrow          
			else
				return filterInPlace$CollectionsKt__MutableCollectionsKt(TypeIntrinsics.asMutableIterable(((Object) (list))), function1, flag);
	//   10   21:aload_0         
	//   11   22:invokestatic    #136 <Method Iterable TypeIntrinsics.asMutableIterable(Object)>
	//   12   25:aload_1         
	//   13   26:iload_2         
	//   14   27:invokestatic    #138 <Method boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable, Function1, boolean)>
	//   15   30:ireturn         
		int i1 = CollectionsKt.getLastIndex(list);
	//   16   31:aload_0         
	//   17   32:invokestatic    #143 <Method int CollectionsKt.getLastIndex(List)>
	//   18   35:istore          6
		int k;
		if(i1 >= 0)
	//*  19   37:iload           6
	//*  20   39:iflt            118
		{
			int l = 0;
	//   21   42:iconst_0        
	//   22   43:istore          5
			int i = l;
	//   23   45:iload           5
	//   24   47:istore_3        
			do
			{
				Object obj = list.get(l);
	//   25   48:aload_0         
	//   26   49:iload           5
	//   27   51:invokeinterface #149 <Method Object List.get(int)>
	//   28   56:astore          7
				if(((Boolean)function1.invoke(obj)).booleanValue() != flag)
	//*  29   58:aload_1         
	//*  30   59:aload           7
	//*  31   61:invokeinterface #112 <Method Object Function1.invoke(Object)>
	//*  32   66:checkcast       #114 <Class Boolean>
	//*  33   69:invokevirtual   #117 <Method boolean Boolean.booleanValue()>
	//*  34   72:iload_2         
	//*  35   73:icmpne          79
	//*  36   76:goto            99
				{
					if(i != l)
	//*  37   79:iload_3         
	//*  38   80:iload           5
	//*  39   82:icmpeq          95
						list.set(i, obj);
	//   40   85:aload_0         
	//   41   86:iload_3         
	//   42   87:aload           7
	//   43   89:invokeinterface #153 <Method Object List.set(int, Object)>
	//   44   94:pop             
					i++;
	//   45   95:iload_3         
	//   46   96:iconst_1        
	//   47   97:iadd            
	//   48   98:istore_3        
				}
				k = i;
	//   49   99:iload_3         
	//   50  100:istore          4
				if(l == i1)
					break;
	//   51  102:iload           5
	//   52  104:iload           6
	//   53  106:icmpeq          121
				l++;
	//   54  109:iload           5
	//   55  111:iconst_1        
	//   56  112:iadd            
	//   57  113:istore          5
			} while(true);
	//   58  115:goto            48
		} else
		{
			k = 0;
	//   59  118:iconst_0        
	//   60  119:istore          4
		}
		if(k < list.size())
	//*  61  121:iload           4
	//*  62  123:aload_0         
	//*  63  124:invokeinterface #157 <Method int List.size()>
	//*  64  129:icmpge          166
		{
			int j = CollectionsKt.getLastIndex(list);
	//   65  132:aload_0         
	//   66  133:invokestatic    #143 <Method int CollectionsKt.getLastIndex(List)>
	//   67  136:istore_3        
			if(j >= k)
	//*  68  137:iload_3         
	//*  69  138:iload           4
	//*  70  140:icmplt          164
				do
				{
					list.remove(j);
	//   71  143:aload_0         
	//   72  144:iload_3         
	//   73  145:invokeinterface #159 <Method Object List.remove(int)>
	//   74  150:pop             
					if(j == k)
						break;
	//   75  151:iload_3         
	//   76  152:iload           4
	//   77  154:icmpeq          164
					j--;
	//   78  157:iload_3         
	//   79  158:iconst_1        
	//   80  159:isub            
	//   81  160:istore_3        
				} while(true);
	//   82  161:goto            143
			return true;
	//   83  164:iconst_1        
	//   84  165:ireturn         
		} else
		{
			return false;
	//   85  166:iconst_0        
	//   86  167:ireturn         
		}
	}

	private static final void minusAssign(Collection collection, Iterable iterable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CollectionsKt.removeAll(collection, iterable);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #164 <Method boolean CollectionsKt.removeAll(Collection, Iterable)>
	//    6   11:pop             
	//    7   12:return          
	}

	private static final void minusAssign(Collection collection, Object obj)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		collection.remove(obj);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokeinterface #168 <Method boolean Collection.remove(Object)>
	//    6   13:pop             
	//    7   14:return          
	}

	private static final void minusAssign(Collection collection, Sequence sequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CollectionsKt.removeAll(collection, sequence);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #172 <Method boolean CollectionsKt.removeAll(Collection, Sequence)>
	//    6   11:pop             
	//    7   12:return          
	}

	private static final void minusAssign(Collection collection, Object aobj[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CollectionsKt.removeAll(collection, aobj);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #175 <Method boolean CollectionsKt.removeAll(Collection, Object[])>
	//    6   11:pop             
	//    7   12:return          
	}

	private static final void plusAssign(Collection collection, Iterable iterable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CollectionsKt.addAll(collection, iterable);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #178 <Method boolean CollectionsKt.addAll(Collection, Iterable)>
	//    6   11:pop             
	//    7   12:return          
	}

	private static final void plusAssign(Collection collection, Object obj)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		collection.add(obj);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokeinterface #90  <Method boolean Collection.add(Object)>
	//    6   13:pop             
	//    7   14:return          
	}

	private static final void plusAssign(Collection collection, Sequence sequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CollectionsKt.addAll(collection, sequence);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #180 <Method boolean CollectionsKt.addAll(Collection, Sequence)>
	//    6   11:pop             
	//    7   12:return          
	}

	private static final void plusAssign(Collection collection, Object aobj[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		CollectionsKt.addAll(collection, aobj);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #182 <Method boolean CollectionsKt.addAll(Collection, Object[])>
	//    6   11:pop             
	//    7   12:return          
	}

	private static final Object remove(List list, int i)
	{
		return list.remove(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #159 <Method Object List.remove(int)>
	//    3    7:areturn         
	}

	private static final boolean remove(Collection collection, Object obj)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
	//    2    4:new             #125 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #197 <String "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>">
	//    5   10:invokespecial   #130 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return TypeIntrinsics.asMutableCollection(((Object) (collection))).remove(obj);
	//    7   14:aload_0         
	//    8   15:invokestatic    #201 <Method Collection TypeIntrinsics.asMutableCollection(Object)>
	//    9   18:aload_1         
	//   10   19:invokeinterface #168 <Method boolean Collection.remove(Object)>
	//   11   24:ireturn         
	}

	public static final boolean removeAll(Iterable iterable, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "predicate");
	//    3    6:aload_1         
	//    4    7:ldc1            #204 <String "predicate">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return filterInPlace$CollectionsKt__MutableCollectionsKt(iterable, function1, true);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:invokestatic    #138 <Method boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable, Function1, boolean)>
	//   10   18:ireturn         
	}

	public static final boolean removeAll(Collection collection, Iterable iterable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "elements");
	//    3    6:aload_1         
	//    4    7:ldc1            #65  <String "elements">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		iterable = ((Iterable) (CollectionsKt.convertToSetForSetOperationWith(iterable, (Iterable)collection)));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:checkcast       #72  <Class Iterable>
	//    9   17:invokestatic    #209 <Method Collection CollectionsKt.convertToSetForSetOperationWith(Iterable, Iterable)>
	//   10   20:astore_1        
		return TypeIntrinsics.asMutableCollection(((Object) (collection))).removeAll(((Collection) (iterable)));
	//   11   21:aload_0         
	//   12   22:invokestatic    #201 <Method Collection TypeIntrinsics.asMutableCollection(Object)>
	//   13   25:aload_1         
	//   14   26:invokeinterface #211 <Method boolean Collection.removeAll(Collection)>
	//   15   31:ireturn         
	}

	private static final boolean removeAll(Collection collection, Collection collection1)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
	//    2    4:new             #125 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #197 <String "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>">
	//    5   10:invokespecial   #130 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return TypeIntrinsics.asMutableCollection(((Object) (collection))).removeAll(collection1);
	//    7   14:aload_0         
	//    8   15:invokestatic    #201 <Method Collection TypeIntrinsics.asMutableCollection(Object)>
	//    9   18:aload_1         
	//   10   19:invokeinterface #211 <Method boolean Collection.removeAll(Collection)>
	//   11   24:ireturn         
	}

	public static final boolean removeAll(Collection collection, Sequence sequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (sequence)), "elements");
	//    3    6:aload_1         
	//    4    7:ldc1            #65  <String "elements">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		sequence = ((Sequence) ((Collection)SequencesKt.toHashSet(sequence)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #219 <Method java.util.HashSet SequencesKt.toHashSet(Sequence)>
	//    8   16:checkcast       #67  <Class Collection>
	//    9   19:astore_1        
		return ((Collection) (sequence)).isEmpty() ^ true && collection.removeAll(((Collection) (sequence)));
	//   10   20:aload_1         
	//   11   21:invokeinterface #222 <Method boolean Collection.isEmpty()>
	//   12   26:iconst_1        
	//   13   27:ixor            
	//   14   28:ifeq            43
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokeinterface #211 <Method boolean Collection.removeAll(Collection)>
	//   18   38:ifeq            43
	//   19   41:iconst_1        
	//   20   42:ireturn         
	//   21   43:iconst_0        
	//   22   44:ireturn         
	}

	public static final boolean removeAll(Collection collection, Object aobj[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (aobj)), "elements");
	//    3    6:aload_1         
	//    4    7:ldc1            #65  <String "elements">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		boolean flag2 = false;
	//    6   12:iconst_0        
	//    7   13:istore          4
		boolean flag;
		if(aobj.length == 0)
	//*   8   15:aload_1         
	//*   9   16:arraylength     
	//*  10   17:ifne            25
			flag = true;
	//   11   20:iconst_1        
	//   12   21:istore_2        
		else
	//*  13   22:goto            27
			flag = false;
	//   14   25:iconst_0        
	//   15   26:istore_2        
		boolean flag1 = flag2;
	//   16   27:iload           4
	//   17   29:istore_3        
		if(flag ^ true)
	//*  18   30:iload_2         
	//*  19   31:iconst_1        
	//*  20   32:ixor            
	//*  21   33:ifeq            57
		{
			flag1 = flag2;
	//   22   36:iload           4
	//   23   38:istore_3        
			if(collection.removeAll((Collection)ArraysKt.toHashSet(aobj)))
	//*  24   39:aload_0         
	//*  25   40:aload_1         
	//*  26   41:invokestatic    #225 <Method java.util.HashSet ArraysKt.toHashSet(Object[])>
	//*  27   44:checkcast       #67  <Class Collection>
	//*  28   47:invokeinterface #211 <Method boolean Collection.removeAll(Collection)>
	//*  29   52:ifeq            57
				flag1 = true;
	//   30   55:iconst_1        
	//   31   56:istore_3        
		}
		return flag1;
	//   32   57:iload_3         
	//   33   58:ireturn         
	}

	public static final boolean removeAll(List list, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "predicate");
	//    3    6:aload_1         
	//    4    7:ldc1            #204 <String "predicate">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return filterInPlace$CollectionsKt__MutableCollectionsKt(list, function1, true);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:invokestatic    #228 <Method boolean filterInPlace$CollectionsKt__MutableCollectionsKt(List, Function1, boolean)>
	//   10   18:ireturn         
	}

	public static final boolean retainAll(Iterable iterable, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "predicate");
	//    3    6:aload_1         
	//    4    7:ldc1            #204 <String "predicate">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return filterInPlace$CollectionsKt__MutableCollectionsKt(iterable, function1, false);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:invokestatic    #138 <Method boolean filterInPlace$CollectionsKt__MutableCollectionsKt(Iterable, Function1, boolean)>
	//   10   18:ireturn         
	}

	public static final boolean retainAll(Collection collection, Iterable iterable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "elements");
	//    3    6:aload_1         
	//    4    7:ldc1            #65  <String "elements">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		iterable = ((Iterable) (CollectionsKt.convertToSetForSetOperationWith(iterable, (Iterable)collection)));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:checkcast       #72  <Class Iterable>
	//    9   17:invokestatic    #209 <Method Collection CollectionsKt.convertToSetForSetOperationWith(Iterable, Iterable)>
	//   10   20:astore_1        
		return TypeIntrinsics.asMutableCollection(((Object) (collection))).retainAll(((Collection) (iterable)));
	//   11   21:aload_0         
	//   12   22:invokestatic    #201 <Method Collection TypeIntrinsics.asMutableCollection(Object)>
	//   13   25:aload_1         
	//   14   26:invokeinterface #231 <Method boolean Collection.retainAll(Collection)>
	//   15   31:ireturn         
	}

	private static final boolean retainAll(Collection collection, Collection collection1)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
	//    2    4:new             #125 <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #197 <String "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>">
	//    5   10:invokespecial   #130 <Method void TypeCastException(String)>
	//    6   13:athrow          
		else
			return TypeIntrinsics.asMutableCollection(((Object) (collection))).retainAll(collection1);
	//    7   14:aload_0         
	//    8   15:invokestatic    #201 <Method Collection TypeIntrinsics.asMutableCollection(Object)>
	//    9   18:aload_1         
	//   10   19:invokeinterface #231 <Method boolean Collection.retainAll(Collection)>
	//   11   24:ireturn         
	}

	public static final boolean retainAll(Collection collection, Sequence sequence)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (sequence)), "elements");
	//    3    6:aload_1         
	//    4    7:ldc1            #65  <String "elements">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		sequence = ((Sequence) ((Collection)SequencesKt.toHashSet(sequence)));
	//    6   12:aload_1         
	//    7   13:invokestatic    #219 <Method java.util.HashSet SequencesKt.toHashSet(Sequence)>
	//    8   16:checkcast       #67  <Class Collection>
	//    9   19:astore_1        
		if(((Collection) (sequence)).isEmpty() ^ true)
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #222 <Method boolean Collection.isEmpty()>
	//*  12   26:iconst_1        
	//*  13   27:ixor            
	//*  14   28:ifeq            39
			return collection.retainAll(((Collection) (sequence)));
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokeinterface #231 <Method boolean Collection.retainAll(Collection)>
	//   18   38:ireturn         
		else
			return retainNothing$CollectionsKt__MutableCollectionsKt(collection);
	//   19   39:aload_0         
	//   20   40:invokestatic    #233 <Method boolean retainNothing$CollectionsKt__MutableCollectionsKt(Collection)>
	//   21   43:ireturn         
	}

	public static final boolean retainAll(Collection collection, Object aobj[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (aobj)), "elements");
	//    3    6:aload_1         
	//    4    7:ldc1            #65  <String "elements">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		boolean flag;
		if(aobj.length == 0)
	//*   6   12:aload_1         
	//*   7   13:arraylength     
	//*   8   14:ifne            22
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:goto            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_2        
		if(true ^ flag)
	//*  14   24:iconst_1        
	//*  15   25:iload_2         
	//*  16   26:ixor            
	//*  17   27:ifeq            44
			return collection.retainAll((Collection)ArraysKt.toHashSet(aobj));
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:invokestatic    #225 <Method java.util.HashSet ArraysKt.toHashSet(Object[])>
	//   21   35:checkcast       #67  <Class Collection>
	//   22   38:invokeinterface #231 <Method boolean Collection.retainAll(Collection)>
	//   23   43:ireturn         
		else
			return retainNothing$CollectionsKt__MutableCollectionsKt(collection);
	//   24   44:aload_0         
	//   25   45:invokestatic    #233 <Method boolean retainNothing$CollectionsKt__MutableCollectionsKt(Collection)>
	//   26   48:ireturn         
	}

	public static final boolean retainAll(List list, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "predicate");
	//    3    6:aload_1         
	//    4    7:ldc1            #204 <String "predicate">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return filterInPlace$CollectionsKt__MutableCollectionsKt(list, function1, false);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:invokestatic    #228 <Method boolean filterInPlace$CollectionsKt__MutableCollectionsKt(List, Function1, boolean)>
	//   10   18:ireturn         
	}

	private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(Collection collection)
	{
		boolean flag = collection.isEmpty();
	//    0    0:aload_0         
	//    1    1:invokeinterface #222 <Method boolean Collection.isEmpty()>
	//    2    6:istore_1        
		collection.clear();
	//    3    7:aload_0         
	//    4    8:invokeinterface #236 <Method void Collection.clear()>
		return flag ^ true;
	//    5   13:iload_1         
	//    6   14:iconst_1        
	//    7   15:ixor            
	//    8   16:ireturn         
	}

	public static final void shuffle(List list, Random random)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (random)), "random");
	//    3    6:aload_1         
	//    4    7:ldc1            #242 <String "random">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		for(int i = CollectionsKt.getLastIndex(list); i >= 1; i--)
	//*   6   12:aload_0         
	//*   7   13:invokestatic    #143 <Method int CollectionsKt.getLastIndex(List)>
	//*   8   16:istore_2        
	//*   9   17:iload_2         
	//*  10   18:iconst_1        
	//*  11   19:icmplt          71
		{
			int j = random.nextInt(i + 1);
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:invokevirtual   #248 <Method int Random.nextInt(int)>
	//   17   29:istore_3        
			Object obj = list.get(i);
	//   18   30:aload_0         
	//   19   31:iload_2         
	//   20   32:invokeinterface #149 <Method Object List.get(int)>
	//   21   37:astore          4
			list.set(i, list.get(j));
	//   22   39:aload_0         
	//   23   40:iload_2         
	//   24   41:aload_0         
	//   25   42:iload_3         
	//   26   43:invokeinterface #149 <Method Object List.get(int)>
	//   27   48:invokeinterface #153 <Method Object List.set(int, Object)>
	//   28   53:pop             
			list.set(j, obj);
	//   29   54:aload_0         
	//   30   55:iload_3         
	//   31   56:aload           4
	//   32   58:invokeinterface #153 <Method Object List.set(int, Object)>
	//   33   63:pop             
		}

	//   34   64:iload_2         
	//   35   65:iconst_1        
	//   36   66:isub            
	//   37   67:istore_2        
	//*  38   68:goto            17
	//   39   71:return          
	}

	public static final List shuffled(Iterable iterable, Random random)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "receiver$0">
	//    2    3:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (random)), "random");
	//    3    6:aload_1         
	//    4    7:ldc1            #242 <String "random">
	//    5    9:invokestatic    #64  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		iterable = ((Iterable) (CollectionsKt.toMutableList(iterable)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #254 <Method List CollectionsKt.toMutableList(Iterable)>
	//    8   16:astore_0        
		CollectionsKt.shuffle(((List) (iterable)), random);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokestatic    #256 <Method void CollectionsKt.shuffle(List, Random)>
		return ((List) (iterable));
	//   12   22:aload_0         
	//   13   23:areturn         
	}
}
