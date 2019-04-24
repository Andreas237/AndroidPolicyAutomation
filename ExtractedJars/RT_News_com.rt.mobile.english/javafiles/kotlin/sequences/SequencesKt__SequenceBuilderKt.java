// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.sequences:
//			SequencesKt, Sequence, SequenceBuilderIterator

class SequencesKt__SequenceBuilderKt
{

	public SequencesKt__SequenceBuilderKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
	//    2    4:return          
	}

	public static void SequenceBuilder$annotations()
	{
	//    0    0:return          
	}

	private static final Iterator buildIterator(Function2 function2)
	{
		return SequencesKt.iterator(function2);
	//    0    0:aload_0         
	//    1    1:invokestatic    #75  <Method Iterator SequencesKt.iterator(Function2)>
	//    2    4:areturn         
	}

	private static final Sequence buildSequence(Function2 function2)
	{
	/* block-local class not found */
	class buildSequence..inlined.Sequence._cls1 {}

		return (Sequence)new buildSequence..inlined.Sequence._cls1(function2);
	//    0    0:new             #83  <Class SequencesKt__SequenceBuilderKt$buildSequence$$inlined$Sequence$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #86  <Method void SequencesKt__SequenceBuilderKt$buildSequence$$inlined$Sequence$1(Function2)>
	//    4    8:checkcast       #88  <Class Sequence>
	//    5   11:areturn         
	}

	public static final Iterator iterator(Function2 function2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function2)), "block");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "block">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		SequenceBuilderIterator sequencebuilderiterator = new SequenceBuilderIterator();
	//    3    6:new             #99  <Class SequenceBuilderIterator>
	//    4    9:dup             
	//    5   10:invokespecial   #100 <Method void SequenceBuilderIterator()>
	//    6   13:astore_1        
		sequencebuilderiterator.setNextStep(IntrinsicsKt.createCoroutineUnintercepted(function2, ((Object) (sequencebuilderiterator)), (Continuation)sequencebuilderiterator));
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:aload_1         
	//   11   18:checkcast       #102 <Class Continuation>
	//   12   21:invokestatic    #108 <Method Continuation IntrinsicsKt.createCoroutineUnintercepted(Function2, Object, Continuation)>
	//   13   24:invokevirtual   #112 <Method void SequenceBuilderIterator.setNextStep(Continuation)>
		return (Iterator)sequencebuilderiterator;
	//   14   27:aload_1         
	//   15   28:checkcast       #114 <Class Iterator>
	//   16   31:areturn         
	}

	public static final Sequence sequence(Function2 function2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function2)), "block");
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "block">
	//    2    3:invokestatic    #97  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	/* block-local class not found */
	class sequence..inlined.Sequence._cls1 {}

		return (Sequence)new sequence..inlined.Sequence._cls1(function2);
	//    3    6:new             #116 <Class SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokespecial   #117 <Method void SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(Function2)>
	//    7   14:checkcast       #88  <Class Sequence>
	//    8   17:areturn         
	}

	private static final int State_Done = 4;
	private static final int State_Failed = 5;
	private static final int State_ManyNotReady = 1;
	private static final int State_ManyReady = 2;
	private static final int State_NotReady = 0;
	private static final int State_Ready = 3;
}
