// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package androidx.work:
//			Data

public final class DataKt
{

	public static final transient Data workDataOf(Pair apair[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (apair)), "pairs");
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <String "pairs">
	//    2    3:invokestatic    #31  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Data.Builder builder = new Data.Builder();
	//    3    6:new             #33  <Class Data$Builder>
	//    4    9:dup             
	//    5   10:invokespecial   #37  <Method void Data$Builder()>
	//    6   13:astore_3        
		int j = apair.length;
	//    7   14:aload_0         
	//    8   15:arraylength     
	//    9   16:istore_2        
		for(int i = 0; i < j; i++)
	//*  10   17:iconst_0        
	//*  11   18:istore_1        
	//*  12   19:iload_1         
	//*  13   20:iload_2         
	//*  14   21:icmpge          54
		{
			Pair pair = apair[i];
	//   15   24:aload_0         
	//   16   25:iload_1         
	//   17   26:aaload          
	//   18   27:astore          4
			builder.put((String)pair.getFirst(), pair.getSecond());
	//   19   29:aload_3         
	//   20   30:aload           4
	//   21   32:invokevirtual   #43  <Method Object Pair.getFirst()>
	//   22   35:checkcast       #45  <Class String>
	//   23   38:aload           4
	//   24   40:invokevirtual   #48  <Method Object Pair.getSecond()>
	//   25   43:invokevirtual   #52  <Method Data$Builder Data$Builder.put(String, Object)>
	//   26   46:pop             
		}

	//   27   47:iload_1         
	//   28   48:iconst_1        
	//   29   49:iadd            
	//   30   50:istore_1        
	//*  31   51:goto            19
		apair = ((Pair []) (builder.build()));
	//   32   54:aload_3         
	//   33   55:invokevirtual   #56  <Method Data Data$Builder.build()>
	//   34   58:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (apair)), "dataBuilder.build()");
	//   35   59:aload_0         
	//   36   60:ldc1            #58  <String "dataBuilder.build()">
	//   37   62:invokestatic    #61  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((Data) (apair));
	//   38   65:aload_0         
	//   39   66:areturn         
	}
}
