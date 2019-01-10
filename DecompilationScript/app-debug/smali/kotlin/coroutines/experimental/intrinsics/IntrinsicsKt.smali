.class public final Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt;
.super Ljava/lang/Object;
.source "Intrinsics.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Intrinsics.kt\nkotlin/coroutines/experimental/intrinsics/IntrinsicsKt\n*L\n1#1,127:1\n111#1,2:128\n125#1:130\n111#1,2:131\n125#1:133\n*E\n*S KotlinDebug\n*F\n+ 1 Intrinsics.kt\nkotlin/coroutines/experimental/intrinsics/IntrinsicsKt\n*L\n73#1,2:128\n73#1:130\n97#1,2:131\n97#1:133\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a5\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\"\u0004\u0008\u0000\u0010\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\t0\u00072\u0010\u0008\u0004\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cH\u0083\u0008\u001a5\u0010\r\u001a\u0002H\t\"\u0004\u0008\u0000\u0010\t2\u001c\u0008\u0004\u0010\u000b\u001a\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\t0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0087H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u001aD\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\"\u0004\u0008\u0000\u0010\t*\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\t0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\t0\u0007H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u001a]\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\"\u0004\u0008\u0000\u0010\u0012\"\u0004\u0008\u0001\u0010\t*#\u0008\u0001\u0012\u0004\u0012\u0002H\u0012\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\t0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013\u00a2\u0006\u0002\u0008\u00142\u0006\u0010\u0015\u001a\u0002H\u00122\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\t0\u0007H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\u0008\t\u00a8\u0006\u0017"
    }
    d2 = {
        "COROUTINE_SUSPENDED",
        "",
        "COROUTINE_SUSPENDED$annotations",
        "()V",
        "getCOROUTINE_SUSPENDED",
        "()Ljava/lang/Object;",
        "buildContinuationByInvokeCall",
        "Lkotlin/coroutines/experimental/Continuation;",
        "",
        "T",
        "completion",
        "block",
        "Lkotlin/Function0;",
        "suspendCoroutineOrReturn",
        "Lkotlin/Function1;",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;",
        "createCoroutineUnchecked",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;",
        "R",
        "Lkotlin/Function2;",
        "Lkotlin/ExtensionFunctionType;",
        "receiver",
        "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;",
        "kotlin-stdlib"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0x7
    }
.end annotation

.annotation build Lkotlin/jvm/JvmName;
    name = "IntrinsicsKt"
.end annotation


# static fields
.field private static final COROUTINE_SUSPENDED:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt;->COROUTINE_SUSPENDED:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic COROUTINE_SUSPENDED$annotations()V
    .locals 0
    .annotation build Lkotlin/SinceKotlin;
        version = "1.1"
    .end annotation

    return-void
.end method

.method private static final buildContinuationByInvokeCall(Lkotlin/coroutines/experimental/Continuation;Lkotlin/jvm/functions/Function0;)Lkotlin/coroutines/experimental/Continuation;
    .locals 2
    .param p0, "completion"    # Lkotlin/coroutines/experimental/Continuation;
    .param p1, "block"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/coroutines/experimental/Continuation",
            "<-TT;>;",
            "Lkotlin/jvm/functions/Function0",
            "<+",
            "Ljava/lang/Object;",
            ">;)",
            "Lkotlin/coroutines/experimental/Continuation",
            "<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .prologue
    .line 111
    new-instance v0, Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$buildContinuationByInvokeCall$continuation$1;

    invoke-direct {v0, p0, p1}, Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$buildContinuationByInvokeCall$continuation$1;-><init>(Lkotlin/coroutines/experimental/Continuation;Lkotlin/jvm/functions/Function0;)V

    .line 125
    .local v0, "continuation":Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$buildContinuationByInvokeCall$continuation$1;
    invoke-interface {p0}, Lkotlin/coroutines/experimental/Continuation;->getContext()Lkotlin/coroutines/experimental/CoroutineContext;

    move-result-object v1

    check-cast v0, Lkotlin/coroutines/experimental/Continuation;

    .end local v0    # "continuation":Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$buildContinuationByInvokeCall$continuation$1;
    invoke-static {v1, v0}, Lkotlin/coroutines/experimental/jvm/internal/CoroutineIntrinsics;->interceptContinuationIfNeeded(Lkotlin/coroutines/experimental/CoroutineContext;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;

    move-result-object v1

    return-object v1
.end method

.method public static final createCoroutineUnchecked(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;
    .locals 3
    .param p0, "$receiver"    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "completion"    # Lkotlin/coroutines/experimental/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1",
            "<-",
            "Lkotlin/coroutines/experimental/Continuation",
            "<-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/experimental/Continuation",
            "<-TT;>;)",
            "Lkotlin/coroutines/experimental/Continuation",
            "<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/SinceKotlin;
        version = "1.1"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const-string/jumbo v1, "$receiver"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "completion"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    instance-of v1, p0, Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;

    if-nez v1, :cond_0

    .line 73
    nop

    .line 128
    new-instance v0, Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$createCoroutineUnchecked$$inlined$buildContinuationByInvokeCall$1;

    invoke-direct {v0, p1, p0, p1}, Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$createCoroutineUnchecked$$inlined$buildContinuationByInvokeCall$1;-><init>(Lkotlin/coroutines/experimental/Continuation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)V

    .line 130
    .local v0, "continuation$iv":Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$createCoroutineUnchecked$$inlined$buildContinuationByInvokeCall$1;
    invoke-interface {p1}, Lkotlin/coroutines/experimental/Continuation;->getContext()Lkotlin/coroutines/experimental/CoroutineContext;

    move-result-object v1

    check-cast v0, Lkotlin/coroutines/experimental/Continuation;

    .end local v0    # "continuation$iv":Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$createCoroutineUnchecked$$inlined$buildContinuationByInvokeCall$1;
    invoke-static {v1, v0}, Lkotlin/coroutines/experimental/jvm/internal/CoroutineIntrinsics;->interceptContinuationIfNeeded(Lkotlin/coroutines/experimental/CoroutineContext;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;

    move-result-object v1

    .line 72
    .end local p0    # "$receiver":Lkotlin/jvm/functions/Function1;
    :goto_0
    return-object v1

    .line 78
    .restart local p0    # "$receiver":Lkotlin/jvm/functions/Function1;
    :cond_0
    check-cast p0, Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;

    .end local p0    # "$receiver":Lkotlin/jvm/functions/Function1;
    invoke-virtual {p0, p1}, Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;->create(Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Lkotlin/TypeCastException;

    const-string/jumbo v2, "null cannot be cast to non-null type kotlin.coroutines.experimental.jvm.internal.CoroutineImpl"

    invoke-direct {v1, v2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    check-cast v1, Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;

    invoke-virtual {v1}, Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;->getFacade()Lkotlin/coroutines/experimental/Continuation;

    move-result-object v1

    goto :goto_0
.end method

.method public static final createCoroutineUnchecked(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;
    .locals 3
    .param p0, "$receiver"    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1, "receiver"    # Ljava/lang/Object;
    .param p2, "completion"    # Lkotlin/coroutines/experimental/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2",
            "<-TR;-",
            "Lkotlin/coroutines/experimental/Continuation",
            "<-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lkotlin/coroutines/experimental/Continuation",
            "<-TT;>;)",
            "Lkotlin/coroutines/experimental/Continuation",
            "<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/SinceKotlin;
        version = "1.1"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    const-string/jumbo v1, "$receiver"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "completion"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    instance-of v1, p0, Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;

    if-nez v1, :cond_0

    .line 97
    nop

    .line 131
    new-instance v0, Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$createCoroutineUnchecked$$inlined$buildContinuationByInvokeCall$2;

    invoke-direct {v0, p2, p0, p1, p2}, Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$createCoroutineUnchecked$$inlined$buildContinuationByInvokeCall$2;-><init>(Lkotlin/coroutines/experimental/Continuation;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)V

    .line 133
    .local v0, "continuation$iv":Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$createCoroutineUnchecked$$inlined$buildContinuationByInvokeCall$2;
    invoke-interface {p2}, Lkotlin/coroutines/experimental/Continuation;->getContext()Lkotlin/coroutines/experimental/CoroutineContext;

    move-result-object v1

    check-cast v0, Lkotlin/coroutines/experimental/Continuation;

    .end local v0    # "continuation$iv":Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt$createCoroutineUnchecked$$inlined$buildContinuationByInvokeCall$2;
    invoke-static {v1, v0}, Lkotlin/coroutines/experimental/jvm/internal/CoroutineIntrinsics;->interceptContinuationIfNeeded(Lkotlin/coroutines/experimental/CoroutineContext;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;

    move-result-object v1

    .line 96
    .end local p0    # "$receiver":Lkotlin/jvm/functions/Function2;
    :goto_0
    return-object v1

    .line 102
    .restart local p0    # "$receiver":Lkotlin/jvm/functions/Function2;
    :cond_0
    check-cast p0, Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;

    .end local p0    # "$receiver":Lkotlin/jvm/functions/Function2;
    invoke-virtual {p0, p1, p2}, Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;->create(Ljava/lang/Object;Lkotlin/coroutines/experimental/Continuation;)Lkotlin/coroutines/experimental/Continuation;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Lkotlin/TypeCastException;

    const-string/jumbo v2, "null cannot be cast to non-null type kotlin.coroutines.experimental.jvm.internal.CoroutineImpl"

    invoke-direct {v1, v2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    check-cast v1, Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;

    invoke-virtual {v1}, Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;->getFacade()Lkotlin/coroutines/experimental/Continuation;

    move-result-object v1

    goto :goto_0
.end method

.method public static final getCOROUTINE_SUSPENDED()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    .line 53
    sget-object v0, Lkotlin/coroutines/experimental/intrinsics/IntrinsicsKt;->COROUTINE_SUSPENDED:Ljava/lang/Object;

    return-object v0
.end method

.method private static final suspendCoroutineOrReturn(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p0, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1",
            "<-",
            "Lkotlin/coroutines/experimental/Continuation",
            "<-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/experimental/Continuation",
            "<-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lkotlin/SinceKotlin;
        version = "1.1"
    .end annotation

    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .prologue
    .line 46
    new-instance v0, Lkotlin/NotImplementedError;

    const-string/jumbo v1, "Implementation is intrinsic"

    invoke-direct {v0, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method
