// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

// Referenced classes of package androidx.work:
//			ListenableWorker

public final class OneTimeWorkRequestKt
{

	private static final OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder()
	{
		Intrinsics.reifiedOperationMarker(4, "W");
	//    0    0:iconst_4        
	//    1    1:ldc1            #27  <String "W">
	//    2    3:invokestatic    #33  <Method void Intrinsics.reifiedOperationMarker(int, String)>
		return new OneTimeWorkRequest.Builder(androidx/work/ListenableWorker);
	//    3    6:new             #35  <Class OneTimeWorkRequest$Builder>
	//    4    9:dup             
	//    5   10:ldc1            #37  <Class ListenableWorker>
	//    6   12:invokespecial   #41  <Method void OneTimeWorkRequest$Builder(Class)>
	//    7   15:areturn         
	}

	public static final OneTimeWorkRequest.Builder setInputMerger(OneTimeWorkRequest.Builder builder, KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (builder)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #49  <String "receiver$0">
	//    2    3:invokestatic    #53  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "inputMerger");
	//    3    6:aload_1         
	//    4    7:ldc1            #54  <String "inputMerger">
	//    5    9:invokestatic    #53  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		builder = builder.setInputMerger(JvmClassMappingKt.getJavaClass(kclass));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #60  <Method Class JvmClassMappingKt.getJavaClass(KClass)>
	//    9   17:invokevirtual   #63  <Method OneTimeWorkRequest$Builder OneTimeWorkRequest$Builder.setInputMerger(Class)>
	//   10   20:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (builder)), "setInputMerger(inputMerger.java)");
	//   11   21:aload_0         
	//   12   22:ldc1            #65  <String "setInputMerger(inputMerger.java)">
	//   13   24:invokestatic    #68  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return builder;
	//   14   27:aload_0         
	//   15   28:areturn         
	}
}
